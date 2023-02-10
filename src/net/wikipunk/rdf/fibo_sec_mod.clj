(ns net.wikipunk.rdf.fibo-sec-mod
  "The Securities (SEC) Domain covers many of the concepts that are common to a wide variety of securities as well as those specific to equities and various debt instruments, including but not limited to bonds and a wide range of asset-backed securities. This ontology provides metadata about the Securities Domain and its contents."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 EDM Council, Inc."
                       "Copyright (c) 2018-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/MetadataSEC/SECDomain",
   :dcterms/abstract
   "The Securities (SEC) Domain covers many of the concepts that are common to a wide variety of securities as well as those specific to equities and various debt instruments, including but not limited to bonds and a wide range of asset-backed securities. This ontology provides metadata about the Securities Domain and its contents.",
   :dcterms/issued #inst "2018-03-31T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-02-03T23:00:00.000-00:00",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/MetadataSECDebt/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/MetadataSECSecurities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Equities/MetadataSECEquities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Funds/MetadataSECFunds/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/MetadataSEC/",
   :rdf/ns-prefix-map
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
   :rdf/type :owl/Ontology,
   :rdf/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/MetadataSEC/",
   :rdfa/prefix "fibo-sec-mod",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/MetadataSEC/",
   :rdfs/label "Metadata about the EDMC-FIBO Securities (SEC) Domain"})

(def SECDomain
  "The FIBO Securities (SEC) domain provides a model of concepts that are common to financial instruments that are also securities, including but not limited to exchange-traded securities and funds. High-level concepts relevant to securities classification, identification, issuance, and registration of securities generally are covered, as well as additional detail for equities, debt instruments, and funds. More details defining derivatives in particular are covered in a separate derivatives domain area."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 EDM Council, Inc."
                       "Copyright (c) 2018-2023 Object Management Group, Inc."],
   :db/ident :fibo-sec-mod/SECDomain,
   :dcterms/abstract
   "The FIBO Securities (SEC) domain provides a model of concepts that are common to financial instruments that are also securities, including but not limited to exchange-traded securities and funds. High-level concepts relevant to securities classification, identification, issuance, and registration of securities generally are covered, as well as additional detail for equities, debt instruments, and funds. More details defining derivatives in particular are covered in a separate derivatives domain area.",
   :dcterms/contributor
   ["Credit Suisse"
    "agnos.ai U.K. Ltd"
    "Thematix Partners LLC"
    "John F. Tierney"
    "Citigroup"
    "Tahoe Blue Ltd"
    "BIAN"
    "Dassault Systemes / No Magic"
    "Statistics Canada"
    "Wells Fargo Bank, N.A."
    "State Street Bank and Trust"
    "Federated Knowledge LLC"
    "Office of Financial Research (US Dept of the Treasury)"
    "Goldman Sachs"
    "Nordea Bank AB"
    "HP Enterprise / Mphasis"
    "Deutsche Bank"
    "Bloomberg LP"
    "Adaptive, Inc."
    "Quarule"
    "Exprentis"
    "John F. Gemski"
    "Mizuho"],
   :dcterms/creator
   "https://wiki.edmcouncil.org/pages/viewpage.action?pageId=786661",
   :dcterms/hasPart [:fibo-sec-eq-mod/EquitiesModule
                     :fibo-sec-sec-mod/SecuritiesModule
                     :fibo-sec-dbt-mod/DebtModule
                     :fibo-sec-fnd-mod/FundsModule],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   ["FIBO SEC Domain"
    "Financial Industry Business Ontology (FIBO) Securities (SEC) Domain"],
   :rdf/type [:owl/NamedIndividual :fibo-fnd-utl-av/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/MetadataSEC/",
   :rdfs/label "securities domain",
   :rdfs/seeAlso ["https://www.edmcouncil.org/fibo/"]})