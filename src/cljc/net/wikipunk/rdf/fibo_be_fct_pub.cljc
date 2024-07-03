(ns net.wikipunk.rdf.fibo-be-fct-pub
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/FunctionalEntities/Publishers/",
   :dcterms/abstract
   "The concept of a publisher is central to the notion of a data provider in financial markets. This ontology defines the fundamental concepts for publishers of information, including entities whose primary function is to publish, and those (whether or not they are publishers in that sense) that play the role of the publisher of some information.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-fct-pub"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/FunctionalEntities/Publishers/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-fct-pub",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
   :rdfs/label "Publishers Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of this ontology was modified to eliminate references to external dictionary sites that no longer resolve."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of the ontology was modified to replace concepts from several FIBO FND ontologies with their counterparts added to the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of the ontology was modified to eliminate deprecations that are more than 6 months old."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary and revise definitions to be ISO 704 compliant as needed."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of the ontology was modified to replace additional concepts from several FIBO FND ontologies with their counterparts added to the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of this ontology was modified to deprecate publishing house rather than having two disconnected concepts, clean up the related restrictions, and add market data provider (originally in IND)."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of this ontology was modified per the FIBO 2.0 RFC."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/"})

(def MarketDataProvider
  {:cmns-av/explanatoryNote
   "Market data providers include exchanges and independent data vendors, among others. Market valuation and related control and risk processes typically require explicit documentation of the source for a given market rate, such as an interest rate benchmark, exchange rate, stock prices, and so forth.",
   :db/ident :fibo-be-fct-pub/MarketDataProvider,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/"},
   :rdfs/label "market data provider",
   :rdfs/subClassOf :fibo-be-fct-pub/Publisher,
   :skos/definition "publisher of data relevant to financial markets"})

(def Publication
  {:cmns-av/adaptedFrom
   {:rdf/value
    "ISO 5127:2017, Information and documentation - Foundation and vocabulary"},
   :cmns-av/explanatoryNote
   "A publication can be anything made public by print (such as a newspaper, magazine, pamphlet, letter, telegram, via computer modem or program, or in a poster, brochure or pamphlet), orally, or by broadcast (radio, television).",
   :db/ident :fibo-be-fct-pub/Publication,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/"},
   :rdfs/label "publication",
   :rdfs/subClassOf :cmns-doc/Document,
   :skos/definition
   "document offered for general distribution and usually produced in multiple copies"})

(def Publisher
  {:cmns-av/adaptedFrom
   {:rdf/value
    "ISO 10161-1:2014(en), Information and documentation - Open Systems Interconnection - Interlibrary Loan Application Protocol Specification - Part 1: Protocol specification"},
   :cmns-av/explanatoryNote
   "Publishers may also include banks, government agencies and the like.",
   :db/ident :fibo-be-fct-pub/Publisher,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/"},
   :rdfs/label "publisher",
   :rdfs/subClassOf #{:cmns-pts/PartyRole
                      {:owl/onClass    :cmns-pts/Party,
                       :owl/onProperty :cmns-rlcmp/isPlayedBy,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "role of person(s) or organization(s) responsible for the printing or distribution of an item, whether in digital or print (physical) form"})

(def hasPublisher
  {:db/ident :fibo-be-fct-pub/hasPublisher,
   :owl/inverseOf :fibo-be-fct-pub/publishes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-fct-pub/Publication,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/"},
   :rdfs/label "has publisher",
   :rdfs/range :fibo-be-fct-pub/Publisher,
   :rdfs/subPropertyOf #{:cmns-pts/hasPartyRole :cmns-rlcmp/manifests},
   :skos/definition
   "indicates the party in the role of issuing the information"})

(def isPublishedBy
  {:db/ident :fibo-be-fct-pub/isPublishedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-fct-pub/Publication,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/"},
   :rdfs/label "is published by",
   :rdfs/range :cmns-pts/Party,
   :rdfs/subPropertyOf :cmns-pts/hasParty,
   :skos/definition
   "identifies the independent party (i.e., the individual or organization) that disseminates the material"})

(def publishes
  {:db/ident :fibo-be-fct-pub/publishes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-fct-pub/Publisher,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/"},
   :rdfs/label "publishes",
   :rdfs/range :fibo-be-fct-pub/Publication,
   :rdfs/subPropertyOf :cmns-rlcmp/isManifestedIn,
   :skos/definition "prepares and issues material for public consumption"})

(def urn:uuid:0f0a27cc-6b0b-5387-ae9a-4da0bb6c2052
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "The concept of a publisher is central to the notion of a data provider in financial markets. This ontology defines the fundamental concepts for publishers of information, including entities whose primary function is to publish, and those (whether or not they are publishers in that sense) that play the role of the publisher of some information.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/FunctionalEntities/Publishers/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Publishers Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of this ontology was modified to eliminate references to external dictionary sites that no longer resolve."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of the ontology was modified to replace concepts from several FIBO FND ontologies with their counterparts added to the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of the ontology was modified to eliminate deprecations that are more than 6 months old."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary and revise definitions to be ISO 704 compliant as needed."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of the ontology was modified to replace additional concepts from several FIBO FND ontologies with their counterparts added to the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of this ontology was modified to deprecate publishing house rather than having two disconnected concepts, clean up the related restrictions, and add market data provider (originally in IND)."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of this ontology was modified per the FIBO 2.0 RFC."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/"})