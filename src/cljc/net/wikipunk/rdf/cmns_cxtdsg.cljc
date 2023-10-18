(ns net.wikipunk.rdf.cmns-cxtdsg
  {:cmns-av/copyright #{"Copyright (c) 2022 Object Management Group, Inc."
                        "Copyright (c) 2020-2022 Thematix Partners LLC"
                        "Copyright (c) 2020-2022 Working Ontologist LLC"
                        "Copyright (c) 2022 agnos.ai U.K. Ltd"},
   :dcterms/abstract
   "The contextual designators ontology extends the designators ontology to incorporate applicable dates and times and facilitate the inclusion of other context that is commonly needed, derived in part from the patterns defined in ISO 11179-3, Metadata Registries.",
   :dcterms/contributor #{"Pete Rivett, agnos.ai U.K. Ltd"
                          "Elisa Kendall, Thematix Partners LLC"
                          "Dean Allemang, Working Ontologist"},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :namespaces
   {"cmns-av"     "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col"    "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dsg"    "https://www.omg.org/spec/Commons/Designators/",
    "cmns-dt"     "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "dcterms"     "http://purl.org/dc/terms/",
    "owl"         "http://www.w3.org/2002/07/owl#",
    "rdf"         "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"        "http://www.w3.org/2000/01/rdf-schema#",
    "skos"        "http://www.w3.org/2004/02/skos/core#",
    "xsd"         "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://www.omg.org/spec/Commons/20221101/ContextualDesignators/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "cmns-cxtdsg",
   :rdfa/uri "https://www.omg.org/spec/Commons/ContextualDesignators/",
   :rdfs/label "Commons Contextual Designators Ontology",
   :skos/changeNote
   "https://www.omg.org/spec/Commons/20220501/ContextualDesignators.rdf version of this ontology was modified to eliminate a double space in a note on ContextualName (COMMONS-6) and to require a ContextualName to have context (COMMONS-26).",
   :skos/note
   "The contextual designators ontology conforms with the OWL 2 DL semantics, and is outside of OWL 2 RL due to (1) imported axioms from the designations and dates and times ontologies, and (2) the inclusion of local some values and min 0 cardinality constraints. The latter could be removed as needed to support OWL RL rule-based applications that cannot be extended to support it.",
   :xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"})

(def Context
  {:db/ident :cmns-cxtdsg/Context,
   :dcterms/source
   #{{:rdf/value
      "ISO/IEC 11179-3 Information technology - Metadata registries (MDR) - Part 3: Registry metamodel and basic attributes, Third edition, 2013-02-15"}
     {:rdf/value
      "ISO 1087 Terminology work and terminology science - Vocabulary, Second edition, 2019-09, clause 3.6.5"}},
   :rdf/type :owl/Class,
   :rdfs/label "context",
   :skos/definition
   "situation or frame of reference in which something applies, exists, happens, or is used and that helps to illustrate or explain it",
   :skos/note
   "From a terminology perspective, context provides information, including but not limited to text, that illustrates a concept or the use of a designation for a given situation."})

(def ContextualDesignation
  {:db/ident :cmns-cxtdsg/ContextualDesignation,
   :rdf/type :owl/Class,
   :rdfs/label "contextual designation",
   :rdfs/subClassOf #{:cmns-dsg/Designation
                      {:owl/allValuesFrom :cmns-dt/DatePeriod,
                       :owl/onProperty    :cmns-cxtdsg/hasApplicablePeriod,
                       :rdf/type          :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-cxtdsg/Context,
                       :owl/onProperty :cmns-cxtdsg/isApplicableIn,
                       :rdf/type       :owl/Restriction}},
   :skos/definition "designation that applies to something in some context",
   :skos/note
   #{"Note that the use of the min 0 cardinality restriction in the definition of this class is provided as a reminder that contextual designators are expected, in most cases, to have some sort of context associated with them. There may be cases where the context is limited to a time period, though, and thus additional context may not be required, or where more direct relationships to provenance, governance, or other contextual information is available."
     "Contextual designators may be structured such that they include other designators, for example, composite identifiers that include a country code to distinguish national identifiers from one another, for example, in the case of some manufacturing, agricultural, or financial instrument identifiers."}})

(def ContextualName
  {:db/ident :cmns-cxtdsg/ContextualName,
   :rdf/type :owl/Class,
   :rdfs/label "contextual name",
   :rdfs/subClassOf #{:cmns-cxtdsg/ContextualDesignation :cmns-dsg/Name
                      {:owl/onProperty     :cmns-cxtdsg/isApplicableIn,
                       :owl/someValuesFrom :cmns-cxtdsg/Context,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "designation by which someone, some place, or something is known in some context",
   :skos/note
   #{"Names of people, places, and organizations often change over time, and may be used in a particular context, such as a DBA name for a business or legal name for a person."
     "Names for people may be considered to be personally identifying information (PII), especially when other details are also available. Specifying names as string values attached directly to an individual makes name reconciliation and management, including from a privacy perspective, more challenging."},
   :skos/scopeNote
   "This class is designed to be extended to include provenance details regarding the source for a particular name as well as links to the various contexts in which it is used."})

(def appliesTo
  {:db/ident :cmns-cxtdsg/appliesTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "applies to",
   :skos/definition
   "indicates something for which a context is material, germane, or relevant in some way"})

(def hasApplicablePeriod
  {:db/ident :cmns-cxtdsg/hasApplicablePeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has applicable period",
   :rdfs/range :cmns-dt/DatePeriod,
   :rdfs/subPropertyOf #{:cmns-dt/hasDatePeriod :cmns-cxtdsg/isApplicableIn},
   :skos/definition
   "indicates a date period during which something may be used, applies, is valid or is accurate or relevant"})

(def isApplicableIn
  {:db/ident        :cmns-cxtdsg/isApplicableIn,
   :owl/inverseOf   :cmns-cxtdsg/appliesTo,
   :rdf/type        :owl/ObjectProperty,
   :rdfs/label      "is applicable in",
   :skos/definition "indicates a context in which something is relevant"})

(def isUsedBy
  {:db/ident :cmns-cxtdsg/isUsedBy,
   :owl/inverseOf :cmns-cxtdsg/uses,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is used by",
   :skos/definition
   "is employed in the process of accomplishing something for"})

(def uses
  {:db/ident :cmns-cxtdsg/uses,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "uses",
   :skos/definition
   "employs as a means of accomplishing some task or achieving some result"})

(def urn:uuid:ffae65e3-e75e-5d52-9655-bf7140109c75
  {:cmns-av/copyright #{"Copyright (c) 2022 Object Management Group, Inc."
                        "Copyright (c) 2020-2022 Thematix Partners LLC"
                        "Copyright (c) 2020-2022 Working Ontologist LLC"
                        "Copyright (c) 2022 agnos.ai U.K. Ltd"},
   :dcterms/abstract
   "The contextual designators ontology extends the designators ontology to incorporate applicable dates and times and facilitate the inclusion of other context that is commonly needed, derived in part from the patterns defined in ISO 11179-3, Metadata Registries.",
   :dcterms/contributor #{"Pete Rivett, agnos.ai U.K. Ltd"
                          "Elisa Kendall, Thematix Partners LLC"
                          "Dean Allemang, Working Ontologist"},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://www.omg.org/spec/Commons/20221101/ContextualDesignators/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Commons Contextual Designators Ontology",
   :skos/changeNote
   "https://www.omg.org/spec/Commons/20220501/ContextualDesignators.rdf version of this ontology was modified to eliminate a double space in a note on ContextualName (COMMONS-6) and to require a ContextualName to have context (COMMONS-26).",
   :skos/note
   "The contextual designators ontology conforms with the OWL 2 DL semantics, and is outside of OWL 2 RL due to (1) imported axioms from the designations and dates and times ontologies, and (2) the inclusion of local some values and min 0 cardinality constraints. The latter could be removed as needed to support OWL RL rule-based applications that cannot be extended to support it.",
   :xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"})