(ns net.wikipunk.rdf.fibo-sec-dbt-mod
  "The SEC Debt Module covers content specific to debt instruments, including but not limited to bonds and asset-backed securities. This ontology provides metadata about the Debt module and its contents."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MetadataSECDebt/DebtModule",
   :dcterms/abstract
   "The SEC Debt Module covers content specific to debt instruments, including but not limited to bonds and asset-backed securities. This ontology provides metadata about the Debt module and its contents.",
   :dcterms/issued #inst "2022-03-31T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/MetadataSECDebt/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-sec-dbt-mod"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MetadataSECDebt/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MetadataSECDebt/",
   :rdfa/prefix "fibo-sec-dbt-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MetadataSECDebt/",
   :rdfs/label "Metadata about the EDMC-FIBO Securities (SEC) Debt Module",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2018-2022 EDM Council, Inc."
                  "Copyright (c) 2018-2022 Object Management Group, Inc."],
   :sm/fileAbbreviation "fibo-sec-dbt-mod",
   :sm/filename "MetadataSECDebt.rdf"})

(def DebtModule
  "This module defines debt securities contracts both cash and synthetic, such as bonds, structured finance instruments, short term or money market instruments, and other contracts characterized by the holding of some debt of the issuer or primary party by the holder or counterparty."
  {:db/ident :fibo-sec-dbt-mod/DebtModule,
   :dcterms/abstract
   "This module defines debt securities contracts both cash and synthetic, such as bonds, structured finance instruments, short term or money market instruments, and other contracts characterized by the holding of some debt of the issuer or primary party by the holder or counterparty.",
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
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MetadataSECDebt/",
   :rdfs/label "FIBO SEC Debt Module",
   :rdfs/seeAlso "https://www.edmcouncil.org/fibo/",
   :sm/contributor ["State Street Bank and Trust"
                    "John F. Tierney"
                    "Adaptive, Inc."
                    "Nordea Bank AB"
                    "HP Enterprise / Mphasis"
                    "John F. Gemski"
                    "Exprentis"
                    "Mizuho"
                    "Credit Suisse"
                    "Deutsche Bank"
                    "Goldman Sachs"
                    "Thematix Partners LLC"
                    "Wells Fargo"
                    "Citigroup"
                    "BIAN"
                    "Statistics Canada"
                    "NoMagic"
                    "Tahoe Blue Ltd"
                    "agnos.ai U.K. Ltd"
                    "Quarule"
                    "Bloomberg LP"
                    "Office of Financial Research (US Dept of the Treasury)"],
   :sm/copyright ["Copyright (c) 2018-2022 EDM Council, Inc."
                  "Copyright (c) 2018-2022 Object Management Group, Inc."],
   :sm/moduleAbbreviation "FIBO-SEC-DBT"})