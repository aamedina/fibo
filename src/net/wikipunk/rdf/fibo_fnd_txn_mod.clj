(ns net.wikipunk.rdf.fibo-fnd-txn-mod
  "This is the metadata ontology used to describe the Foundations Transactions Module."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MetadataFNDTransactionsExt/TransactionsExtModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Transactions Module.",
   :dcterms/issued #inst "2021-12-27T23:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/TransactionsExt/MetadataFNDTransactionsExt/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-txn-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MetadataFNDTransactionsExt/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MetadataFNDTransactionsExt/",
   :rdfa/prefix "fibo-fnd-txn-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MetadataFNDTransactionsExt/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Foundations (FND) TransactionsExt Module",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright "Copyright (c) 2017-2021 EDM Council, Inc.",
   :sm/fileAbbreviation "fibo-fnd-txn-mod",
   :sm/filename "MetadataFNDTransactionsExt.rdf"})

(def TransactionsExtModule
  "This module contains ontologies of Transaction concepts based on the Resource, Events Agents (REA) ontology for transactions."
  {:db/ident :fibo-fnd-txn-mod/TransactionsExtModule,
   :dcterms/abstract
   "This module contains ontologies of Transaction concepts based on the Resource, Events Agents (REA) ontology for transactions.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MarketTransactions/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/SecuritiesTransactions/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "Financial Industry Business Ontology (FIBO) Foundations (FND) Transactions Module",
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MetadataFNDTransactionsExt/",
   :rdfs/label "Transactions",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :skos/editorialNote
   "The content in this module is original conceptual content and does not extend any other module. Some of the concepts represented conceptually in this module have been replaced by partial representations of some transaction concepts in the Products and Services module, sometimes using different labels for similar or equivalent concepts. Much of the content in this module will still be referred to in other FIBO domains, and care is needed in determining whether to replace these references to something in Products and Services versus when to bring forward more of the content in this module.",
   :sm/copyright "Copyright (c) 2017-2021 EDM Council, Inc.",
   :sm/moduleAbbreviation "fibo-fnd-txn"})