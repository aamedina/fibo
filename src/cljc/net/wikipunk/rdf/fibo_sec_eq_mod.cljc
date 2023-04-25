(ns net.wikipunk.rdf.fibo-sec-eq-mod
  "The SEC Equities Module covers concepts that are common to equities, including share-specific terminology and shareholder rights, for stocks and partnership equity, as well as depository receipts. This ontology provides metadata about the Equities module and its contents."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 Object Management Group, Inc."
                       "Copyright (c) 2018-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/MetadataSECEquities/EquitiesModule",
   :dcterms/abstract
   "The SEC Equities Module covers concepts that are common to equities, including share-specific terminology and shareholder rights, for stocks and partnership equity, as well as depository receipts. This ontology provides metadata about the Equities module and its contents.",
   :dcterms/issued #inst "2018-03-31T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-02-03T23:00:00.000-00:00",
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Equities/MetadataSECEquities/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-eq-mod"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/MetadataSECEquities/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-eq-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/MetadataSECEquities/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Securities (SEC), Equities Module"})

(def EquitiesModule
  "This module defines concepts common to equities, including share-specific terminology and shareholder rights, for stocks and partnership equity, as well as depository receipts."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 EDM Council, Inc."
                       "Copyright (c) 2018-2023 Object Management Group, Inc."],
   :db/ident :fibo-sec-eq-mod/EquitiesModule,
   :dcterms/abstract
   "This module defines concepts common to equities, including share-specific terminology and shareholder rights, for stocks and partnership equity, as well as depository receipts.",
   :dcterms/contributor
   ["Credit Suisse"
    "Exprentis"
    "State Street Bank and Trust"
    "Wells Fargo Bank, N.A."
    "Adaptive, Inc."
    "Office of Financial Research (US Dept of the Treasury)"
    "Tahoe Blue Ltd"
    "John F. Gemski"
    "Dassault Systemes / No Magic"
    "Mizuho"
    "Citigroup"
    "Goldman Sachs"
    "BIAN"
    "Statistics Canada"
    "Federated Knowledge LLC"
    "Thematix Partners LLC"
    "Deutsche Bank"
    "Nordea Bank AB"
    "HP Enterprise / Mphasis"
    "John F. Tierney"
    "Quarule"
    "Bloomberg LP"
    "agnos.ai U.K. Ltd"],
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   ["FIBO SEC Equities Module"
    "Financial Industry Business Ontology (FIBO) Securities and Equities (SEC) Equities Module"],
   :rdf/type [:owl/NamedIndividual :fibo-fnd-utl-av/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/MetadataSECEquities/",
   :rdfs/label "equities module",
   :rdfs/seeAlso ["https://www.edmcouncil.org/fibo/"]})