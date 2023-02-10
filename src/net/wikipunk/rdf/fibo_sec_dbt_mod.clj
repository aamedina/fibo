(ns net.wikipunk.rdf.fibo-sec-dbt-mod
  "The SEC Debt Module covers content specific to debt instruments, including but not limited to bonds and asset-backed securities. This ontology provides metadata about the Debt module and its contents."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 Object Management Group, Inc."
                       "Copyright (c) 2018-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MetadataSECDebt/DebtModule",
   :dcterms/abstract
   "The SEC Debt Module covers content specific to debt instruments, including but not limited to bonds and asset-backed securities. This ontology provides metadata about the Debt module and its contents.",
   :dcterms/issued #inst "2018-03-31T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-02-03T23:00:00.000-00:00",
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/MetadataSECDebt/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-dbt-mod"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MetadataSECDebt/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MetadataSECDebt/",
   :rdfa/prefix "fibo-sec-dbt-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MetadataSECDebt/",
   :rdfs/label "Metadata about the EDMC-FIBO Securities (SEC) Debt Module"})

(def DebtModule
  "This module defines debt securities contracts both cash and synthetic, such as bonds, structured finance instruments, short term or money market instruments, and other contracts characterized by the holding of some debt of the issuer or primary party by the holder or counterparty."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 EDM Council, Inc."
                       "Copyright (c) 2018-2023 Object Management Group, Inc."],
   :db/ident :fibo-sec-dbt-mod/DebtModule,
   :dcterms/abstract
   "This module defines debt securities contracts both cash and synthetic, such as bonds, structured finance instruments, short term or money market instruments, and other contracts characterized by the holding of some debt of the issuer or primary party by the holder or counterparty.",
   :dcterms/contributor
   ["State Street Bank and Trust"
    "Nordea Bank AB"
    "Statistics Canada"
    "Federated Knowledge LLC"
    "Wells Fargo"
    "Goldman Sachs"
    "HP Enterprise / Mphasis"
    "Office of Financial Research (US Dept of the Treasury)"
    "Thematix Partners LLC"
    "agnos.ai U.K. Ltd"
    "Deutsche Bank"
    "John F. Tierney"
    "Mizuho"
    "John F. Gemski"
    "Quarule"
    "Adaptive, Inc."
    "BIAN"
    "Exprentis"
    "Bloomberg LP"
    "Citigroup"
    "Tahoe Blue Ltd"
    "Dassault Systemes / No Magic"
    "Credit Suisse"],
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/LoanParticipationNotes/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   ["FIBO SEC Debt Module"
    "Financial Industry Business Ontology (FIBO) Securities and Equities (SEC) Debt Module"],
   :rdf/type [:owl/NamedIndividual :fibo-fnd-utl-av/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MetadataSECDebt/",
   :rdfs/label "debt module",
   :rdfs/seeAlso ["https://www.edmcouncil.org/fibo/"]})