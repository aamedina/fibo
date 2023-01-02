(ns net.wikipunk.rdf.fibo-fnd-acc-mod
  "This is the metadata ontology used to describe the Foundations Accounting Module."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/MetadataFNDAccounting/AccountingModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Accounting Module.",
   :dcterms/issued #inst "2020-02-24T23:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/MetadataFNDAccounting/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-acc-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/MetadataFNDAccounting/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/MetadataFNDAccounting/",
   :rdfa/prefix "fibo-fnd-acc-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/MetadataFNDAccounting/",
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Accounting Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright ["Copyright (c) 2017-2020 Object Management Group, Inc."
                  "Copyright (c) 2017-2020 EDM Council, Inc."],
   :sm/fileAbbreviation "fibo-fnd-acc-mod",
   :sm/filename "MetadataFNDAccounting.rdf"})

(def AccountingModule
  "This module contains ontologies of general accounting concepts including debt, equity, currency, interest and so on, as well as ISO 4217 reference currency codes."
  {:db/ident :fibo-fnd-acc-mod/AccountingModule,
   :dcterms/abstract
   "This module contains ontologies of general accounting concepts including debt, equity, currency, interest and so on, as well as ISO 4217 reference currency codes.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "Financial Industry Business Ontology (FIBO) Foundations (FND) Accounting Module",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/MetadataFNDAccounting/",
   :rdfs/label "Accounting",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/copyright ["Copyright (c) 2017-2020 EDM Council, Inc."
                  "Copyright (c) 2017-2020 Object Management Group, Inc."],
   :sm/moduleAbbreviation "fibo-fnd-acc"})