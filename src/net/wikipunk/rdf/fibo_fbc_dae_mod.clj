(ns net.wikipunk.rdf.fibo-fbc-dae-mod
  "The debt and equities module includes ontologies describing concepts that are common to debt and equity instruments, as well as across debt instruments, such as loans, bonds, asset-backed securities, and so forth."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/MetadataFBCDebtAndEquities/DebtAndEquitiesModule",
   :dcterms/abstract
   "The debt and equities module includes ontologies describing concepts that are common to debt and equity instruments, as well as across debt instruments, such as loans, bonds, asset-backed securities, and so forth.",
   :dcterms/issued #inst "2022-08-13T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/MetadataFBCDebtAndEquities/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-dae-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/MetadataFBCDebtAndEquities/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/MetadataFBCDebtAndEquities/",
   :rdfa/prefix "fibo-fbc-dae-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/MetadataFBCDebtAndEquities/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Financial Business and Commerce(FBC) Debt and Equities Module",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2017-2022 Object Management Group, Inc."
                  "Copyright (c) 2017-2022 EDM Council, Inc."],
   :sm/fileAbbreviation "fibo-fbc-dae-mod",
   :sm/filename "MetadataFBCDebtAndEquities.rdf"})

(def DebtAndEquitiesModule
  "The debt and equities module includes ontologies describing concepts that are common to debt and equity instruments, as well as across debt instruments, such as loans, bonds, asset-backed securities, and so forth."
  {:db/ident :fibo-fbc-dae-mod/DebtAndEquitiesModule,
   :dcterms/abstract
   "The debt and equities module includes ontologies describing concepts that are common to debt and equity instruments, as well as across debt instruments, such as loans, bonds, asset-backed securities, and so forth.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"],
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/MetadataFBCDebtAndEquities/",
   :rdfs/label "FIBO FBC Debt and Equities Module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2017-2022 Object Management Group, Inc."
                  "Copyright (c) 2017-2022 EDM Council, Inc."],
   :sm/moduleAbbreviation "FIBO-FBC-DAE"})