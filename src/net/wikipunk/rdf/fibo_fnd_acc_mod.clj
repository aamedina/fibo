(ns net.wikipunk.rdf.fibo-fnd-acc-mod
  "This module contains ontologies of general accounting concepts including currency and the ISO 4217 reference currency codes."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 Object Management Group, Inc."
                       "Copyright (c) 2017-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/MetadataFNDAccounting/AccountingModule",
   :dcterms/abstract
   "This module contains ontologies of general accounting concepts including currency and the ISO 4217 reference currency codes.",
   :dcterms/issued #inst "2020-02-24T23:00:00.000-00:00",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-01-06T23:00:00.000-00:00",
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/MetadataFNDAccounting/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-acc-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/MetadataFNDAccounting/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-acc-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/MetadataFNDAccounting/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Foundations (FND) Accounting Module"})

(def AccountingModule
  "This module contains ontologies of general accounting concepts including currency and the ISO 4217 reference currency codes."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 Object Management Group, Inc."
                       "Copyright (c) 2017-2023 EDM Council, Inc."],
   :db/ident :fibo-fnd-acc-mod/AccountingModule,
   :dcterms/abstract
   "This module contains ontologies of general accounting concepts including currency and the ISO 4217 reference currency codes.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/"],
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/title
   ["FIBO FND Accounting Module"
    "Financial Industry Business Ontology (FIBO) Foundations (FND) Accounting Module"],
   :rdf/type [:owl/NamedIndividual :fibo-fnd-utl-av/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/MetadataFNDAccounting/",
   :rdfs/label "accounting module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})