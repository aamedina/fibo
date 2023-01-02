(ns net.wikipunk.rdf.fibo-sec-mod
  "The Securities (SEC) Domain covers many of the concepts that are common to a wide variety of securities as well as those specific to equities and various debt instruments, including but not limited to bonds and a wide range of asset-backed securities. This ontology provides metadata about the Securities Domain and its contents."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/MetadataSEC/SECDomain",
   :dcterms/abstract
   "The Securities (SEC) Domain covers many of the concepts that are common to a wide variety of securities as well as those specific to equities and various debt instruments, including but not limited to bonds and a wide range of asset-backed securities. This ontology provides metadata about the Securities Domain and its contents.",
   :dcterms/issued #inst "2022-08-14T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "EDMC Financial Industry Business Ontology (FIBO) Securities (SEC) Domain",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/MetadataSECDebt/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/MetadataSECSecurities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Equities/MetadataSECEquities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Funds/MetadataSECFunds/"
    "http://www.omg.org/techprocess/ab/SpecificationMetadata/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/MetadataSEC/",
   :rdf/ns-prefix-map
   {"dcterms"      "http://purl.org/dc/terms/",
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
    "sm"           "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"          "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/MetadataSEC/",
   :rdfa/prefix "fibo-sec-mod",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/MetadataSEC/",
   :rdfs/label "Metadata about the EDMC-FIBO Securities (SEC) Domain",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference",
   :sm/copyright ["Copyright (c) 2018-2022 Object Management Group, Inc."
                  "Copyright (c) 2018-2022 EDM Council, Inc."],
   :sm/fileAbbreviation "fibo-sec-mod",
   :sm/filename "MetadataSEC.rdf"})

(def SECDomain
  "The FIBO Securities (SEC) domain provides a model of concepts that are common to financial instruments that are also securities, including but not limited to exchange-traded securities and funds. High-level concepts relevant to securities classification, identification, issuance, and registration of securities generally are covered, as well as additional detail for equities, debt instruments, and funds. More details defining derivatives in particular are covered in a separate derivatives domain area."
  {:db/ident :fibo-sec-mod/SECDomain,
   :dcterms/abstract
   "The FIBO Securities (SEC) domain provides a model of concepts that are common to financial instruments that are also securities, including but not limited to exchange-traded securities and funds. High-level concepts relevant to securities classification, identification, issuance, and registration of securities generally are covered, as well as additional detail for equities, debt instruments, and funds. More details defining derivatives in particular are covered in a separate derivatives domain area.",
   :dcterms/creator
   "https://wiki.edmcouncil.org/pages/viewpage.action?pageId=786661",
   :dcterms/hasPart [:fibo-sec-sec-mod/SecuritiesModule
                     :fibo-sec-dbt-mod/DebtModule
                     :fibo-sec-fnd-mod/FundsModule
                     :fibo-sec-eq-mod/EquitiesModule],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "EDMC Financial Industry Business Ontology (FIBO) Securities (SEC) Domain",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/MetadataSEC/",
   :rdfs/label "Securities",
   :rdfs/seeAlso "https://www.edmcouncil.org/fibo/",
   :sm/contributor ["Deutsche Bank"
                    "agnos.ai UK Ltd."
                    "Office of Financial Research (US Dept of the Treasury)"
                    "State Street Bank and Trust"
                    "Federated Knowledge LLC"
                    "BIAN"
                    "Wells Fargo Bank, N.A."
                    "Nordea Bank AB"
                    "Goldman Sachs"
                    "Citigroup"
                    "John F. Gemski"
                    "Tahoe Blue Ltd"
                    "NoMagic"
                    "Exprentis"
                    "Bloomberg LP"
                    "Quarule"
                    "Statistics Canada"
                    "Adaptive, Inc."
                    "Mizuho"
                    "John F. Tierney"
                    "Thematix Partners LLC"
                    "HP Enterprise / Mphasis"
                    "Credit Suisse"],
   :sm/copyright ["Copyright (c) 2018-2022 Object Management Group, Inc."
                  "Copyright (c) 2018-2022 EDM Council, Inc."],
   :sm/dependsOn ["https://spec.edmcouncil.org/fibo/ontology/FBC/"
                  "http://www.omg.org/techprocess/ab/SpecificationMetadata/"
                  "https://spec.edmcouncil.org/fibo/ontology/BE/"
                  "https://spec.edmcouncil.org/fibo/ontology/IND/"
                  "https://spec.edmcouncil.org/fibo/ontology/FND/"],
   :sm/keyword
   ["financial instruments"
    "debt instruments, bonds, asset-backed securities"
    "securities"
    "funds, collective investment vehicles, special purpose vehicles"
    "equities"],
   :sm/moduleAbbreviation "fibo-sec"})