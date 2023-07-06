(ns net.wikipunk.rdf.fibo-fbc-dae-mod
  "The debt and equities module includes ontologies describing concepts that are common to debt and equity instruments, as well as across debt instruments, such as loans, bonds, asset-backed securities, and so forth."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 EDM Council, Inc."
                       "Copyright (c) 2017-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/MetadataFBCDebtAndEquities/DebtAndEquitiesModule",
   :dcterms/abstract
   "The debt and equities module includes ontologies describing concepts that are common to debt and equity instruments, as well as across debt instruments, such as loans, bonds, asset-backed securities, and so forth.",
   :dcterms/issued #inst "2017-08-13T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-01-30T23:00:00.000-00:00",
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/MetadataFBCDebtAndEquities/",
   :rdf/ns-prefix-map
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-dae-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/MetadataFBCDebtAndEquities/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Financial Business and Commerce(FBC) Debt and Equities Module"})

(def DebtAndEquitiesModule
  "The debt and equities module includes ontologies describing concepts that are common to debt and equity instruments, as well as across debt instruments, such as loans, bonds, asset-backed securities, and so forth."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 Object Management Group, Inc."
                       "Copyright (c) 2017-2023 EDM Council, Inc."],
   :db/ident :fibo-fbc-dae-mod/DebtAndEquitiesModule,
   :dcterms/abstract
   "The debt and equities module includes ontologies describing concepts that are common to debt and equity instruments, as well as across debt instruments, such as loans, bonds, asset-backed securities, and so forth.",
   :dcterms/hasPart
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"}],
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Financial Business and Commerce (FBC) Debt and Equities Module"
    "FIBO FBC Debt and Equities Module"],
   :rdf/type [:owl/NamedIndividual :fibo-fnd-utl-av/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/MetadataFBCDebtAndEquities/",
   :rdfs/label "debt and equities module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})