(ns net.wikipunk.rdf.fibo-sec-mod
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/MetadataSEC/SECDomain",
   :dcterms/abstract
   "The Securities (SEC) Domain covers many of the concepts that are common to a wide variety of securities as well as those specific to equities and various debt instruments, including but not limited to bonds and a wide range of asset-backed securities. This ontology provides metadata about the Securities Domain and its contents.",
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-03T18:00:00.000-00:00",
   :namespaces
   {"cmns-av"      "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms"      "http://purl.org/dc/terms/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-dbt-mod"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MetadataSECDebt/",
    "fibo-sec-eq-mod"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/MetadataSECEquities/",
    "fibo-sec-fnd-mod"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/MetadataSECFunds/",
    "fibo-sec-mod" "https://spec.edmcouncil.org/fibo/ontology/SEC/MetadataSEC/",
    "fibo-sec-sec-mod"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/MetadataSECSecurities/",
    "owl"          "http://www.w3.org/2002/07/owl#",
    "rdf"          "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"         "http://www.w3.org/2000/01/rdf-schema#",
    "xsd"          "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/MetadataSECSecurities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/MetadataSECDebt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Equities/MetadataSECEquities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Funds/MetadataSECFunds/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/MetadataSEC/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-mod",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/MetadataSEC/",
   :rdfs/label "Metadata about the EDMC-FIBO Securities (SEC) Domain",
   :xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/MetadataSEC/"})

(def SECDomain
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :db/ident :fibo-sec-mod/SECDomain,
   :dcterms/abstract
   "The FIBO Securities (SEC) domain provides a model of concepts that are common to financial instruments that are also securities, including but not limited to exchange-traded securities and funds. High-level concepts relevant to securities classification, identification, issuance, and registration of securities generally are covered, as well as additional detail for equities, debt instruments, and funds. More details defining derivatives in particular are covered in a separate derivatives domain area.",
   :dcterms/contributor
   #{"Citigroup" "Wells Fargo Bank, N.A." "Dassault Systemes / No Magic"
     "John F. Gemski" "Adaptive, Inc." "Tahoe Blue Ltd" "BIAN"
     "Thematix Partners LLC" "Bloomberg LP" "Quarule" "Nordea Bank AB"
     "Credit Suisse" "State Street Bank and Trust" "agnos.ai U.K. Ltd"
     "Deutsche Bank" "Exprentis" "Statistics Canada" "Goldman Sachs" "Mizuho"
     "John F. Tierney" "Federated Knowledge LLC" "HP Enterprise / Mphasis"
     "Office of Financial Research (US Dept of the Treasury)"},
   :dcterms/creator
   {:xsd/anyURI
    "https://wiki.edmcouncil.org/pages/viewpage.action?pageId=786661"},
   :dcterms/hasPart
   #{:fibo-sec-dbt-mod/DebtModule :fibo-sec-sec-mod/SecuritiesModule
     :fibo-sec-eq-mod/EquitiesModule :fibo-sec-fnd-mod/FundsModule},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"FIBO SEC Domain"
     "Financial Industry Business Ontology (FIBO) Securities (SEC) Domain"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/MetadataSEC/"},
   :rdfs/label "securities domain",
   :rdfs/seeAlso {:xsd/anyURI "https://www.edmcouncil.org/fibo/"}})

(def urn:uuid:12dd856e-ca6a-5c2e-9fb6-9b4c8225946a
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcterms/abstract
   "The Securities (SEC) Domain covers many of the concepts that are common to a wide variety of securities as well as those specific to equities and various debt instruments, including but not limited to bonds and a wide range of asset-backed securities. This ontology provides metadata about the Securities Domain and its contents.",
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-03T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/MetadataSECSecurities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/MetadataSECDebt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Equities/MetadataSECEquities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Funds/MetadataSECFunds/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/MetadataSEC/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Metadata about the EDMC-FIBO Securities (SEC) Domain",
   :xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/MetadataSEC/"})