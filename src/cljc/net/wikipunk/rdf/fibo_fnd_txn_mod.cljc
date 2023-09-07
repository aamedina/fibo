(ns net.wikipunk.rdf.fibo-fnd-txn-mod
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MetadataFNDTransactionsExt/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-fnd-txn-mod"
     "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MetadataFNDTransactionsExt/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "skos" "http://www.w3.org/2004/02/skos/core#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-fnd-txn-mod",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MetadataFNDTransactionsExt/TransactionsExtModule"}
  {:cmns-av/copyright "Copyright (c) 2017-2023 EDM Council, Inc.",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Transactions Module.",
   :dcterms/issued #inst "2021-12-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-20T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/TransactionsExt/MetadataFNDTransactionsExt/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata for the EDMC-FIBO Foundations (FND) TransactionsExt Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MetadataFNDTransactionsExt/"})

(def TransactionsExtModule
  {:cmns-av/copyright "Copyright (c) 2017-2023 EDM Council, Inc.",
   :db/ident :fibo-fnd-txn-mod/TransactionsExtModule,
   :dcterms/abstract
   "This module contains ontologies of Transaction concepts based on the Resource, Events Agents (REA) ontology for transactions.",
   :dcterms/hasPart
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/SecuritiesTransactions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MarketTransactions/"}},
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"FIBO FND Transactions Module"
     "Financial Industry Business Ontology (FIBO) Foundations (FND) Transactions Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MetadataFNDTransactionsExt/"},
   :rdfs/label "transactions ext module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"},
   :skos/editorialNote
   "The content in this module is original conceptual content and does not extend any other module. Some of the concepts represented conceptually in this module have been replaced by partial representations of some transaction concepts in the Products and Services module, sometimes using different labels for similar or equivalent concepts. Much of the content in this module will still be referred to in other FIBO domains, and care is needed in determining whether to replace these references to something in Products and Services versus when to bring forward more of the content in this module."})

(def urn:uuid:0f645e99-a239-5eed-88b3-01397c1c9e5b
  {:cmns-av/copyright "Copyright (c) 2017-2023 EDM Council, Inc.",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Transactions Module.",
   :dcterms/issued #inst "2021-12-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-20T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/TransactionsExt/MetadataFNDTransactionsExt/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata for the EDMC-FIBO Foundations (FND) TransactionsExt Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MetadataFNDTransactionsExt/"})