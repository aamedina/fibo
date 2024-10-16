(ns net.wikipunk.rdf.fibo-fbc-dae-mod
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/DebtAndEquities/MetadataFBCDebtAndEquities/DebtAndEquitiesModule",
   :dcterms/abstract
   "The debt and equities module includes ontologies describing concepts that are common to debt and equity instruments, as well as across debt instruments, such as loans, bonds, asset-backed securities, and so forth.",
   :dcterms/issued #inst "2017-08-13T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-30T18:00:00.000-00:00",
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-dae-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/MetadataFBCDebtAndEquities/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/DebtAndEquities/MetadataFBCDebtAndEquities/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-dae-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/MetadataFBCDebtAndEquities/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Financial Business and Commerce(FBC) Debt and Equities Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/MetadataFBCDebtAndEquities/"})

(def DebtAndEquitiesModule
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :db/ident :fibo-fbc-dae-mod/DebtAndEquitiesModule,
   :dcterms/abstract
   "The debt and equities module includes ontologies describing concepts that are common to debt and equity instruments, as well as across debt instruments, such as loans, bonds, asset-backed securities, and so forth.",
   :dcterms/hasPart
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"}},
   :dcterms/title
   #{"FIBO FBC Debt and Equities Module"
     "Financial Industry Business Ontology (FIBO) Financial Business and Commerce (FBC) Debt and Equities Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/MetadataFBCDebtAndEquities/"},
   :rdfs/label "debt and equities module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:d91f7aa8-b474-5fa7-8742-1dcb511d5c48
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :dcterms/abstract
   "The debt and equities module includes ontologies describing concepts that are common to debt and equity instruments, as well as across debt instruments, such as loans, bonds, asset-backed securities, and so forth.",
   :dcterms/issued #inst "2017-08-13T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-30T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/DebtAndEquities/MetadataFBCDebtAndEquities/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata about the EDMC-FIBO Financial Business and Commerce(FBC) Debt and Equities Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/MetadataFBCDebtAndEquities/"})