(ns net.wikipunk.rdf.cmns-rlcmp
  {:cmns-av/copyright #{"Copyright (c) 2020-2023 Thematix Partners LLC"
                        "Copyright (c) 2023 Object Management Group, Inc."
                        "Copyright (c) 2020-2023 EDM Council, Inc."
                        "Copyright (c) 2020-2023 Working Ontologist LLC"
                        "Copyright (c) 2022-2023 Pistoia Alliance, Inc."},
   :dcterms/abstract
   "This ontology defines the high-level things defining roles, which enable specification of the various participants in something, and the notion of a composition, i.e., relating something that is a specification for a 'whole', such as a product or recipe, to its ingredients or constituents, potentially with respect to some context-specific requirements.",
   :dcterms/contributor #{"Elisa Kendall, Thematix Partners LLC"
                          "Dean Allemang, Working Ontologist"},
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :namespaces
   {"cmns-av"     "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col"    "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-rlcmp"  "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms"     "http://purl.org/dc/terms/",
    "owl"         "http://www.w3.org/2002/07/owl#",
    "rdf"         "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"        "http://www.w3.org/2000/01/rdf-schema#",
    "skos"        "http://www.w3.org/2004/02/skos/core#",
    "xsd"         "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://www.omg.org/spec/Commons/20230801/RolesAndCompositions/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "cmns-rlcmp",
   :rdfa/uri "https://www.omg.org/spec/Commons/RolesAndCompositions/",
   :rdfs/label "Commons Roles and Compositions Ontology",
   :skos/note
   "This ontology was derived from the Financial Industry Business Ontology (FIBO) and extended based on usage in other projects, such as the Pistoia Alliance Identification of Medicinal Products (IDMP) ontology project.",
   :xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"})

(def Composition
  {:cmns-av/adaptedFrom
   #{{:rdf/value
      "ISO/IEC 18384-1:2016, Information technology - Reference Architecture for Service Oriented Architecture (SOA RA) - Part 1: Terminology and concepts for SOA, clause 2.5 and ISO/IEC 18384-3:2016, Information technology - Reference Architecture for Service Oriented Architecture (SOA RA) - Part 3: Service Oriented Architecture ontology, clause 8.2"}
     {:rdf/value
      "ISO/TS 19807-1:2019(en), Nanotechnologies - Magnetic nanomaterials - Part 1: Specification of characteristics and measurements for magnetic nanosuspensions, clause 3.4"}},
   :cmns-av/explanatoryNote
   "The composition may be specified based on the roles that the things play in the composition, such as the roles that various ingredients play in a recipe or pharmaceutical product, and such things may or may not be transformed in some way through the process of combining them. Quantification including the nature and amount of each thing, potentially including the ratio of the quantities, may be required depending kind of composition.",
   :cmns-av/usageNote
   "The properties hasConstituent and hasRole are included in value restrictions rather than via number restrictions to facilitate their use in complex property chains and other axioms as needed for some applications.",
   :db/ident :cmns-rlcmp/Composition,
   :rdf/type :owl/Class,
   :rdfs/label "composition",
   :rdfs/subClassOf #{{:owl/allValuesFrom :cmns-col/Constituent,
                       :owl/onProperty    :cmns-col/hasConstituent,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :cmns-rlcmp/Role,
                       :owl/onProperty    :cmns-rlcmp/hasRole,
                       :rdf/type          :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-cxtdsg/Context,
                       :owl/onProperty :cmns-cxtdsg/isApplicableIn,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "distinct thing resulting from bringing together other things, possibly in specific roles, for a particular purpose"})

(def FunctionalRole
  {:cmns-av/adaptedFrom
   #{{:rdf/value
      "ISO 21298:2017(en), Health informatics - Functional and structural roles, clause 3.9"}
     {:rdf/value
      "ISO/IEC 19763-8:2015(en), Information technology - Metamodel framework for interoperability (MFI) - Part 8: Metamodel for role and goal model registration, clause 3.1.2"}},
   :db/ident :cmns-rlcmp/FunctionalRole,
   :rdf/type :owl/Class,
   :rdfs/label "functional role",
   :rdfs/subClassOf :cmns-rlcmp/Role,
   :skos/definition
   "role representing an underlying functionality that something, such as a person, organization, process, or service, is expected to perform or deliver",
   :skos/note
   "Functional roles can be assigned to be performed during an act."})

(def ProcessRole
  {:cmns-av/adaptedFrom
   #{{:rdf/value
      "ISO 18629-1:2004(en), Industrial automation systems and integration - Process specification language - Part 1: Overview and basic principles"}
     {:rdf/value
      "ISO 12651-2:2014(en), Electronic document management - Vocabulary - Part 2: Workflow management, clause 3.33"}},
   :db/ident :cmns-rlcmp/ProcessRole,
   :rdf/type :owl/Class,
   :rdfs/label "process role",
   :rdfs/subClassOf :cmns-rlcmp/Role,
   :skos/definition
   "role that associates resources and participants to a structured set of activities involving various enterprise entities, that is designed and organised for a given purpose"})

(def Role
  {:cmns-av/adaptedFrom
   {:rdf/value
    "ISO/IEC 19763-8:2015(en), Information technology - Metamodel framework for interoperability (MFI) - Part 8: Metamodel for role and goal model registration, clause 3.1.7"},
   :db/ident :cmns-rlcmp/Role,
   :rdf/type :owl/Class,
   :rdfs/label "role",
   :rdfs/subClassOf {:owl/minCardinality 0,
                     :owl/onProperty     :cmns-rlcmp/isPlayedBy,
                     :rdf/type           :owl/Restriction},
   :skos/definition
   "named specific behavior of something participating in a particular context"})

(def StructuralRole
  {:db/ident :cmns-rlcmp/StructuralRole,
   :dcterms/source
   {:rdf/value
    "ISO 21298:2017(en), Health informatics - Functional and structural roles, clause 3.26"},
   :rdf/type :owl/Class,
   :rdfs/label "structural role",
   :rdfs/subClassOf :cmns-rlcmp/Role,
   :skos/definition
   "role specifying relations between entities in the sense of competence, often reflecting organizational or structural relations (hierarchies)"})

(def hasRole
  {:db/ident :cmns-rlcmp/hasRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has role",
   :rdfs/range :cmns-rlcmp/Role,
   :skos/definition
   "identifies something or someone playing a part in something, such as a composition"})

(def isManifestedIn
  {:db/ident :cmns-rlcmp/isManifestedIn,
   :owl/inverseOf :cmns-rlcmp/manifests,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-rlcmp/Role,
   :rdfs/label "is manifested in",
   :skos/definition
   "indicates something in which the role is realized, appears, or occurs"})

(def isPlayedBy
  {:db/ident :cmns-rlcmp/isPlayedBy,
   :owl/inverseOf :cmns-rlcmp/playsRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-rlcmp/Role,
   :rdfs/label "is played by",
   :skos/definition
   "indicates something or someone, such as a person, organization, or other thing filling a role",
   :skos/example
   "A party, counterparty, or third party to a contract is played by an organization or person; an issuer of a financial instrument is typically played by an organization; an ingredient in a recipe may be played by a substance."})

(def isRoleIn
  {:db/ident :cmns-rlcmp/isRoleIn,
   :owl/inverseOf :cmns-rlcmp/hasRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-rlcmp/Role,
   :rdfs/label "is role in",
   :skos/definition
   "identifies something, such as a composition, situation, or contract, involving the role"})

(def manifests
  {:db/ident :cmns-rlcmp/manifests,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "manifests",
   :rdfs/range :cmns-rlcmp/Role,
   :skos/definition
   "indicates a role that realizes, displays, or shows something, typically in some context"})

(def playsRole
  {:db/ident :cmns-rlcmp/playsRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "plays role",
   :rdfs/range :cmns-rlcmp/Role,
   :skos/definition
   "indicates a part that someone or something plays under some circumstance",
   :skos/example
   "an organization may play the role of employer, issuer, regulatory agency, bank, custodian, manufacturer, vendor, etc.; a person may play the role of employee, examiner, banker, seller, buyer, etc."})

(def urn:uuid:868f8434-78b8-5752-ad87-60839ebf262a
  {:cmns-av/copyright #{"Copyright (c) 2020-2023 Thematix Partners LLC"
                        "Copyright (c) 2023 Object Management Group, Inc."
                        "Copyright (c) 2020-2023 EDM Council, Inc."
                        "Copyright (c) 2020-2023 Working Ontologist LLC"
                        "Copyright (c) 2022-2023 Pistoia Alliance, Inc."},
   :dcterms/abstract
   "This ontology defines the high-level things defining roles, which enable specification of the various participants in something, and the notion of a composition, i.e., relating something that is a specification for a 'whole', such as a product or recipe, to its ingredients or constituents, potentially with respect to some context-specific requirements.",
   :dcterms/contributor #{"Elisa Kendall, Thematix Partners LLC"
                          "Dean Allemang, Working Ontologist"},
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://www.omg.org/spec/Commons/20230801/RolesAndCompositions/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Commons Roles and Compositions Ontology",
   :skos/note
   "This ontology was derived from the Financial Industry Business Ontology (FIBO) and extended based on usage in other projects, such as the Pistoia Alliance Identification of Medicinal Products (IDMP) ontology project.",
   :xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"})