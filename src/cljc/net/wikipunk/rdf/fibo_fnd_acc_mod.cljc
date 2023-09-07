(ns net.wikipunk.rdf.fibo-fnd-acc-mod
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/MetadataFNDAccounting/",
    :namespaces
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
    :prefix "fibo-fnd-acc-mod",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/MetadataFNDAccounting/AccountingModule"}
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This module contains ontologies of general accounting concepts including currency and the ISO 4217 reference currency codes.",
   :dcterms/issued #inst "2020-02-24T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-06T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/MetadataFNDAccounting/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Accounting Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/MetadataFNDAccounting/"})

(def AccountingModule
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :db/ident :fibo-fnd-acc-mod/AccountingModule,
   :dcterms/abstract
   "This module contains ontologies of general accounting concepts including currency and the ISO 4217 reference currency codes.",
   :dcterms/hasPart
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"}},
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"FIBO FND Accounting Module"
     "Financial Industry Business Ontology (FIBO) Foundations (FND) Accounting Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/MetadataFNDAccounting/"},
   :rdfs/label "accounting module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:df3ef987-ebf2-5c09-81c7-23a325345c8d
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This module contains ontologies of general accounting concepts including currency and the ISO 4217 reference currency codes.",
   :dcterms/issued #inst "2020-02-24T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-06T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/MetadataFNDAccounting/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Accounting Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/MetadataFNDAccounting/"})