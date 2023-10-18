(ns net.wikipunk.rdf.cmns-cxtid
  {:cmns-av/copyright #{"Copyright (c) 2022 Thematix Partners LLC"
                        "Copyright (c) 2022 Object Management Group, Inc."},
   :dcterms/abstract
   "The contextual identifiers ontology defines commonly used concepts for describing more complex identifiers, including those that apply for some period of time as well as those that are structured and include other codes or identifiers.",
   :dcterms/contributor
   #{"Evan Wallace, U.S. National Institute of Standards and Technology (NIST)"
     "Elisa Kendall, Thematix Partners LLC"},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :namespaces
   {"cmns-av"     "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cds"    "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
    "cmns-col"    "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-cxtid"  "https://www.omg.org/spec/Commons/ContextualIdentifiers/",
    "cmns-id"     "https://www.omg.org/spec/Commons/Identifiers/",
    "dcterms"     "http://purl.org/dc/terms/",
    "owl"         "http://www.w3.org/2002/07/owl#",
    "rdf"         "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"        "http://www.w3.org/2000/01/rdf-schema#",
    "skos"        "http://www.w3.org/2004/02/skos/core#",
    "xsd"         "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://www.omg.org/spec/Commons/20221101/ContextualIdentifiers/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "cmns-cxtid",
   :rdfa/uri "https://www.omg.org/spec/Commons/ContextualIdentifiers/",
   :rdfs/label "Commons Contextual Identifiers Ontology",
   :skos/changeNote
   "https://www.omg.org/spec/Commons/20220501/ContextualIdentifiers.rdf version of this ontology was modified to add a ContextualIdentificationScheme and require a ContextualIdentifier to have context (COMMONS-26).",
   :xsd/anyURI "https://www.omg.org/spec/Commons/ContextualIdentifiers/"})

(def ContextualIdentificationScheme
  {:db/ident :cmns-cxtid/ContextualIdentificationScheme,
   :rdf/type :owl/Class,
   :rdfs/label "contextual identification scheme",
   :rdfs/subClassOf #{:cmns-id/IdentificationScheme
                      {:owl/onProperty     :cmns-cxtdsg/isApplicableIn,
                       :owl/someValuesFrom :cmns-cxtdsg/Context,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "identification scheme that applies within one or more contexts"})

(def ContextualIdentifier
  {:db/ident :cmns-cxtid/ContextualIdentifier,
   :rdf/type :owl/Class,
   :rdfs/label "contextual identifier",
   :rdfs/subClassOf #{:cmns-cxtdsg/ContextualDesignation :cmns-id/Identifier
                      {:owl/onProperty     :cmns-cxtdsg/isApplicableIn,
                       :owl/someValuesFrom :cmns-cxtdsg/Context,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "sequence of characters uniquely identifying that with which it is associated, within a specified context",
   :skos/note
   "The context within which an identifier is unique may be limited to a given data source, registry or jurisdiction, or may be designed to be globally unique such as a legal entity identifier issued by a registrar authorized by the Global LEI Foundation. Such identifiers may have other features associated with them, such as the date they were originally issued, and information related to registration, validation, recency, and so forth."})

(def StructuredIdentifier
  {:db/ident :cmns-cxtid/StructuredIdentifier,
   :rdf/type :owl/Class,
   :rdfs/label "structured identifier",
   :rdfs/subClassOf #{:cmns-id/Identifier
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-cds/CodeElement,
                       :owl/onProperty :cmns-col/comprises,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-id/Identifier,
                       :owl/onProperty :cmns-col/comprises,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "sequence of characters uniquely identifying that with which it is associated, that includes other codes or identifiers, or that is constructed from other notions",
   :skos/example
   #{"An international security identification number (ISIN) includes a country code and the national security identification number (NSIN), as defined in ISO 6166."
     "A vehicle identification number (VIN) includes a world-wide manufacturer identifier, a vehicle description (i.e., make, model), check digits, the year, plant and a specific vehicle number."},
   :skos/note
   "Many structured identifiers can be validated using a regular expression, such as a social security number in the United States."})

(def urn:uuid:9121b1ad-d104-5a39-8d54-abed73d17ef9
  {:cmns-av/copyright #{"Copyright (c) 2022 Thematix Partners LLC"
                        "Copyright (c) 2022 Object Management Group, Inc."},
   :dcterms/abstract
   "The contextual identifiers ontology defines commonly used concepts for describing more complex identifiers, including those that apply for some period of time as well as those that are structured and include other codes or identifiers.",
   :dcterms/contributor
   #{"Evan Wallace, U.S. National Institute of Standards and Technology (NIST)"
     "Elisa Kendall, Thematix Partners LLC"},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://www.omg.org/spec/Commons/20221101/ContextualIdentifiers/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Commons Contextual Identifiers Ontology",
   :skos/changeNote
   "https://www.omg.org/spec/Commons/20220501/ContextualIdentifiers.rdf version of this ontology was modified to add a ContextualIdentificationScheme and require a ContextualIdentifier to have context (COMMONS-26).",
   :xsd/anyURI "https://www.omg.org/spec/Commons/ContextualIdentifiers/"})