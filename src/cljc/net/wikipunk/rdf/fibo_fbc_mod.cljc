(ns net.wikipunk.rdf.fibo-fbc-mod
  "This ontology provides metadata about the FIBO Financial Business and Commerce (FBC) Domain, which covers business concepts that are common to common to a number of finance domain areas, such as loans, securities, and corporate actions, including products and services, financial intermediaries, registrars and regulators, and financial instruments and products."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/MetadataFBC/FBCDomain",
   :dcterms/abstract
   "This ontology provides metadata about the FIBO Financial Business and Commerce (FBC) Domain, which covers business concepts that are common to common to a number of finance domain areas, such as loans, securities, and corporate actions, including products and services, financial intermediaries, registrars and regulators, and financial instruments and products.",
   :dcterms/issued #xsd/dateTime #inst "2015-08-13T18:00:00.000-04:00",
   :dcterms/license {:rdfa/uri "http://opensource.org/licenses/MIT"},
   :dcterms/modified #xsd/dateTime #inst "2023-01-30T18:00:00.000-05:00",
   :owl/imports
   [{:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/MetadataFBCFunctionalEntities/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/MetadataFBCFinancialInstruments/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/MetadataFBCProductsAndServices/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/MetadataFBCDebtAndEquities/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/MetadataFBC/"},
   :rdf/ns-prefix-map
   {"cmns-av"      "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms"      "http://purl.org/dc/terms/",
    "fibo-fbc-dae-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/MetadataFBCDebtAndEquities/",
    "fibo-fbc-fct-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/MetadataFBCFunctionalEntities/",
    "fibo-fbc-fi-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/MetadataFBCFinancialInstruments/",
    "fibo-fbc-mod" "https://spec.edmcouncil.org/fibo/ontology/FBC/MetadataFBC/",
    "fibo-fbc-pas-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/MetadataFBCProductsAndServices/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl"          "http://www.w3.org/2002/07/owl#",
    "rdf"          "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"         "http://www.w3.org/2000/01/rdf-schema#",
    "xsd"          "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-mod",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/FBC/MetadataFBC/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Financial Business and Commerce (FBC) Domain"})

(def FBCDomain
  "The financial business and commerce domain covers business concepts that are common to common to a number of finance areas, such as loans, securities, and corporate actions, including products and services, financial intermediaries, registrars and regulators, and financial instruments and products."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :db/ident :fibo-fbc-mod/FBCDomain,
   :dcterms/abstract
   "The financial business and commerce domain covers business concepts that are common to common to a number of finance areas, such as loans, securities, and corporate actions, including products and services, financial intermediaries, registrars and regulators, and financial instruments and products.",
   :dcterms/contributor
   ["Tahoe Blue Ltd"
    "John F. Gemski"
    "Bloomberg LP"
    "State Street Bank and Trust"
    "Pinnacle Bank (Morgan Hill, California)"
    "Capacity Post, Inc."
    "Statistics Canada"
    "Nordea Bank AB"
    "Exprentis"
    "Wells Fargo"
    "Dassault Systemes / No Magic"
    "agnos.ai UK Ltd."
    "Credit Suisse"
    "Adaptive, Inc."
    "Federated Knowledge LLC"
    "Quarule"
    "Office of Financial Research (US Dept of the Treasury)"
    "Deutsche Bank"
    "Citigroup"
    "Thematix Partners LLC"],
   :dcterms/creator
   {:rdfa/uri
    "https://wiki.edmcouncil.org/pages/viewpage.action?pageId=786677"},
   :dcterms/hasPart [:fibo-fbc-pas-mod/FBCProductsAndServicesModule
                     :fibo-fbc-fi-mod/FinancialInstrumentsModule
                     :fibo-fbc-dae-mod/DebtAndEquitiesModule
                     :fibo-fbc-fct-mod/FunctionalEntitiesModule],
   :dcterms/license {:rdfa/uri "http://opensource.org/licenses/MIT"},
   :dcterms/title
   ["FIBO FBC Domain"
    "EDMC Financial Industry Business Ontology (FIBO) Financial Business and Commerce (FBC) Domain"],
   :rdf/type [:owl/NamedIndividual :fibo-fnd-utl-av/Module],
   :rdfs/isDefinedBy
   {:rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/FBC/MetadataFBC/"},
   :rdfs/label "financial business and commerce domain",
   :rdfs/seeAlso {:rdfa/uri "https://spec.edmcouncil.org/fibo/"}})