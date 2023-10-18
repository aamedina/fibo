(ns net.wikipunk.rdf.fibo-be-fct-pub
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/FunctionalEntities/Publishers/",
   :dcterms/abstract
   "This ontology defines the fundamental concepts for publishers of information, including entities whose primary function is to publish, and entities (whether or not they are publishers in that sense) which are in the role of the publisher of some information. This ontology also includes the published information itself, i.e. the publication.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-fct-pub"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
    "fibo-fnd-arr-doc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/FunctionalEntities/Publishers/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-fct-pub",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
   :rdfs/label "Publishers Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of this ontology was modified to eliminate references to external dictionary sites that no longer resolve."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary and revise definitions to be ISO 704 compliant as needed."
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
  {:db/ident :fibo-be-fct-pub/Publication,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/"},
   :rdfs/label "publication",
   :rdfs/subClassOf :fibo-fnd-arr-doc/Document,
   :skos/definition
   "anything made public by print (such as a newspaper, magazine, pamphlet, letter, telegram, via computer modem or program, or in a poster, brochure or pamphlet), orally, or by broadcast (radio, television)"})

(def Publisher
  {:cmns-av/explanatoryNote
   "Publishers may also include banks, government agencies and the like.",
   :db/ident :fibo-be-fct-pub/Publisher,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/"},
   :rdfs/label "publisher",
   :rdfs/subClassOf #{:fibo-fnd-pty-pty/PartyInRole
                      {:owl/onClass    :fibo-fnd-pty-pty/IndependentParty,
                       :owl/onProperty :fibo-fnd-pty-rl/isPlayedBy,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "party responsible for the printing or distribution of digital or printed information"})

(def PublishingHouse
  {:db/ident :fibo-be-fct-pub/PublishingHouse,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-be-fct-pub/Publisher,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/"}})

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
   :rdfs/range :fibo-fnd-pty-pty/IndependentParty,
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
   :skos/definition "prepares and issues material for public consumption"})

(def urn:uuid:0f0a27cc-6b0b-5387-ae9a-4da0bb6c2052
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines the fundamental concepts for publishers of information, including entities whose primary function is to publish, and entities (whether or not they are publishers in that sense) which are in the role of the publisher of some information. This ontology also includes the published information itself, i.e. the publication.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/FunctionalEntities/Publishers/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Publishers Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of this ontology was modified to eliminate references to external dictionary sites that no longer resolve."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary and revise definitions to be ISO 704 compliant as needed."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of this ontology was modified to deprecate publishing house rather than having two disconnected concepts, clean up the related restrictions, and add market data provider (originally in IND)."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of this ontology was modified per the FIBO 2.0 RFC."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/"})