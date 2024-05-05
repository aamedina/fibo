(ns net.wikipunk.rdf.fibo-sec-dbt-mod
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/MetadataSECDebt/DebtModule",
   :dcterms/abstract
   "The SEC Debt Module covers content specific to debt instruments, including but not limited to bonds and asset-backed securities. This ontology provides metadata about the Debt module and its contents.",
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-03T18:00:00.000-00:00",
   :namespaces
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
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/MetadataSECDebt/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-dbt-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MetadataSECDebt/",
   :rdfs/label "Metadata about the EDMC-FIBO Securities (SEC) Debt Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MetadataSECDebt/"})

(def DebtModule
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :db/ident :fibo-sec-dbt-mod/DebtModule,
   :dcterms/abstract
   "This module defines debt securities contracts both cash and synthetic, such as bonds, structured finance instruments, short term or money market instruments, and other contracts characterized by the holding of some debt of the issuer or primary party by the holder or counterparty.",
   :dcterms/contributor
   #{"Citigroup" "Dassault Systemes / No Magic" "John F. Gemski"
     "Adaptive, Inc." "Tahoe Blue Ltd" "BIAN" "Thematix Partners LLC"
     "Bloomberg LP" "Quarule" "Nordea Bank AB" "Wells Fargo" "Credit Suisse"
     "State Street Bank and Trust" "agnos.ai U.K. Ltd" "Deutsche Bank"
     "Exprentis" "Statistics Canada" "Goldman Sachs" "Mizuho" "John F. Tierney"
     "Federated Knowledge LLC" "HP Enterprise / Mphasis"
     "Office of Financial Research (US Dept of the Treasury)"},
   :dcterms/hasPart
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/LoanParticipationNotes/"}
     {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"}},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"Financial Industry Business Ontology (FIBO) Securities and Equities (SEC) Debt Module"
     "FIBO SEC Debt Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MetadataSECDebt/"},
   :rdfs/label "debt module",
   :rdfs/seeAlso {:xsd/anyURI "https://www.edmcouncil.org/fibo/"}})

(def urn:uuid:8662f7e4-b79f-58c2-a21d-224b19f2a25e
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcterms/abstract
   "The SEC Debt Module covers content specific to debt instruments, including but not limited to bonds and asset-backed securities. This ontology provides metadata about the Debt module and its contents.",
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-03T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/MetadataSECDebt/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Metadata about the EDMC-FIBO Securities (SEC) Debt Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MetadataSECDebt/"})