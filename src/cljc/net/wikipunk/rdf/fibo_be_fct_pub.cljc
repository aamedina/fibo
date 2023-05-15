(ns net.wikipunk.rdf.fibo-be-fct-pub
  "This ontology defines the fundamental concepts for publishers of information, including entities whose primary function is to publish, and entities (whether or not they are publishers in that sense) which are in the role of the publisher of some information. This ontology also includes the published information itself, i.e. the publication."
  {:cmns-av/copyright ["Copyright (c) 2013-2023 EDM Council, Inc."
                       "Copyright (c) 2013-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
   :dcterms/abstract
   "This ontology defines the fundamental concepts for publishers of information, including entities whose primary function is to publish, and entities (whether or not they are publishers in that sense) which are in the role of the publisher of some information. This ontology also includes the published information itself, i.e. the publication.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/Publishers/",
   :rdf/ns-prefix-map
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-fct-pub",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
   :rdfs/label "Publishers Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of this ontology was modified to deprecate publishing house rather than having two disconnected concepts, clean up the related restrictions, and add market data provider (originally in IND)."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of this ontology was modified per the FIBO 2.0 RFC."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of this ontology was modified to eliminate references to external dictionary sites that no longer resolve."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary and revise definitions to be ISO 704 compliant as needed."]})

(def MarketDataProvider
  "publisher of data relevant to financial markets"
  {:cmns-av/explanatoryNote
   "Market data providers include exchanges and independent data vendors, among others. Market valuation and related control and risk processes typically require explicit documentation of the source for a given market rate, such as an interest rate benchmark, exchange rate, stock prices, and so forth.",
   :db/ident :fibo-be-fct-pub/MarketDataProvider,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
   :rdfs/label "market data provider",
   :rdfs/subClassOf [:fibo-be-fct-pub/Publisher
                     :fibo-be-fct-pub/MarketDataProvider
                     {:owl/onClass    :fibo-fnd-pty-pty/IndependentParty,
                      :owl/onProperty :fibo-fnd-pty-rl/isPlayedBy,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition "publisher of data relevant to financial markets"})

(def Publication
  "anything made public by print (such as a newspaper, magazine, pamphlet, letter, telegram, via computer modem or program, or in a poster, brochure or pamphlet), orally, or by broadcast (radio, television)"
  {:db/ident :fibo-be-fct-pub/Publication,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
   :rdfs/label "publication",
   :rdfs/subClassOf [:fibo-fnd-arr-doc/Document :fibo-be-fct-pub/Publication],
   :skos/definition
   "anything made public by print (such as a newspaper, magazine, pamphlet, letter, telegram, via computer modem or program, or in a poster, brochure or pamphlet), orally, or by broadcast (radio, television)"})

(def Publisher
  "party responsible for the printing or distribution of digital or printed information"
  {:cmns-av/explanatoryNote
   "Publishers may also include banks, government agencies and the like.",
   :db/ident :fibo-be-fct-pub/Publisher,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
   :rdfs/label "publisher",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fnd-pty-pty/IndependentParty,
                      :owl/onProperty :fibo-fnd-pty-rl/isPlayedBy,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-pty-pty/PartyInRole
                     :fibo-be-fct-pub/Publisher],
   :skos/definition
   "party responsible for the printing or distribution of digital or printed information"})

(def PublishingHouse
  {:db/ident :fibo-be-fct-pub/PublishingHouse,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-be-fct-pub/Publisher,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/"})

(def hasPublisher
  "indicates the party in the role of issuing the information"
  {:db/ident :fibo-be-fct-pub/hasPublisher,
   :owl/inverseOf :fibo-be-fct-pub/publishes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-fct-pub/Publication,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
   :rdfs/label "has publisher",
   :rdfs/range :fibo-be-fct-pub/Publisher,
   :skos/definition
   "indicates the party in the role of issuing the information"})

(def isPublishedBy
  "identifies the independent party (i.e., the individual or organization) that disseminates the material"
  {:db/ident :fibo-be-fct-pub/isPublishedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-fct-pub/Publication,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
   :rdfs/label "is published by",
   :rdfs/range :fibo-fnd-pty-pty/IndependentParty,
   :skos/definition
   "identifies the independent party (i.e., the individual or organization) that disseminates the material"})

(def publishes
  "prepares and issues material for public consumption"
  {:db/ident :fibo-be-fct-pub/publishes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-fct-pub/Publisher,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
   :rdfs/label "publishes",
   :rdfs/range :fibo-be-fct-pub/Publication,
   :skos/definition "prepares and issues material for public consumption"})