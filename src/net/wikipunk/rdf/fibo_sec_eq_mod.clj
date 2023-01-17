(ns net.wikipunk.rdf.fibo-sec-eq-mod
  "The SEC Equities Module covers concepts that are common to equities, including share-specific terminology and shareholder rights, for stocks and partnership equity, as well as depository receipts. This ontology provides metadata about the Equities module and its contents."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/MetadataSECEquities/EquitiesModule",
   :dcterms/abstract
   "The SEC Equities Module covers concepts that are common to equities, including share-specific terminology and shareholder rights, for stocks and partnership equity, as well as depository receipts. This ontology provides metadata about the Equities module and its contents.",
   :dcterms/issued #inst "2021-06-28T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Equities/MetadataSECEquities/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-sec-eq-mod"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/MetadataSECEquities/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/MetadataSECEquities/",
   :rdfa/prefix "fibo-sec-eq-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/MetadataSECEquities/",
   :rdfs/label "Metadata about the EDMC-FIBO Securities (SEC), Equities Module",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2018-2021 Object Management Group, Inc."
                  "Copyright (c) 2018-2021 EDM Council, Inc."],
   :sm/fileAbbreviation "fibo-sec-eq-mod",
   :sm/filename "MetadataSECEquities.rdf"})

(def EquitiesModule
  "This module defines concepts common to equities, including share-specific terminology and shareholder rights, for stocks and partnership equity, as well as depository receipts."
  {:db/ident :fibo-sec-eq-mod/EquitiesModule,
   :dcterms/abstract
   "This module defines concepts common to equities, including share-specific terminology and shareholder rights, for stocks and partnership equity, as well as depository receipts.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/MetadataSECEquities/",
   :rdfs/label "FIBO SEC Equities Module",
   :rdfs/seeAlso ["https://www.edmcouncil.org/fibo/"],
   :sm/contributor ["BNY Mellon"
                    "Citigroup Inc."
                    "State Street Bank and Trust"
                    "Mizuho"
                    "Bloomberg LP"
                    "John F. Tierney"
                    "John F. Gemski"
                    "Deutsche Bank"
                    "Exprentis"
                    "Tahoe Blue Ltd"
                    "Quarule"
                    "Adaptive, Inc."
                    "Thematix Partners LLC"
                    "Federated Knowledge LLC"
                    "Wells Fargo"
                    "Credit Suisse"
                    "Office of Financial Research (US Dept of the Treasury)"],
   :sm/copyright ["Copyright (c) 2018-2021 Object Management Group, Inc."
                  "Copyright (c) 2018-2021 EDM Council, Inc."],
   :sm/moduleAbbreviation "FIBO-SEC-EQ"})