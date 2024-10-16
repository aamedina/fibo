(ns net.wikipunk.rdf.fibo-fbc-mod
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/MetadataFBC/FBCDomain",
   :dcterms/abstract
   "This ontology provides metadata about the FIBO Financial Business and Commerce (FBC) Domain, which covers business concepts that are common to common to a number of finance domain areas, such as loans, securities, and corporate actions, including products and services, financial intermediaries, registrars and regulators, and financial instruments and products.",
   :dcterms/issued #inst "2015-08-13T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-30T18:00:00.000-00:00",
   :namespaces
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
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/MetadataFBCFunctionalEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/DebtAndEquities/MetadataFBCDebtAndEquities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/MetadataFBCFinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/MetadataFBCProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/MetadataFBC/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-mod",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/FBC/MetadataFBC/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Financial Business and Commerce (FBC) Domain",
   :xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/FBC/MetadataFBC/"})

(def FBCDomain
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :db/ident :fibo-fbc-mod/FBCDomain,
   :dcterms/abstract
   "The financial business and commerce domain covers business concepts that are common to common to a number of finance areas, such as loans, securities, and corporate actions, including products and services, financial intermediaries, registrars and regulators, and financial instruments and products.",
   :dcterms/contributor
   #{"Citigroup" "Dassault Systemes / No Magic" "John F. Gemski"
     "Adaptive, Inc." "Tahoe Blue Ltd" "Thematix Partners LLC" "Bloomberg LP"
     "Quarule" "Nordea Bank AB" "Wells Fargo" "Credit Suisse"
     "Pinnacle Bank (Morgan Hill, California)" "State Street Bank and Trust"
     "Deutsche Bank" "agnos.ai UK Ltd." "Exprentis" "Statistics Canada"
     "Federated Knowledge LLC" "Capacity Post, Inc."
     "Office of Financial Research (US Dept of the Treasury)"},
   :dcterms/creator
   {:xsd/anyURI
    "https://wiki.edmcouncil.org/pages/viewpage.action?pageId=786677"},
   :dcterms/hasPart #{:fibo-fbc-dae-mod/DebtAndEquitiesModule
                      :fibo-fbc-fi-mod/FinancialInstrumentsModule
                      :fibo-fbc-pas-mod/FBCProductsAndServicesModule
                      :fibo-fbc-fct-mod/FunctionalEntitiesModule},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"EDMC Financial Industry Business Ontology (FIBO) Financial Business and Commerce (FBC) Domain"
     "FIBO FBC Domain"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/FBC/MetadataFBC/"},
   :rdfs/label "financial business and commerce domain",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:3c9b6ad8-80ad-559a-90c0-e0240b10b5b3
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology provides metadata about the FIBO Financial Business and Commerce (FBC) Domain, which covers business concepts that are common to common to a number of finance domain areas, such as loans, securities, and corporate actions, including products and services, financial intermediaries, registrars and regulators, and financial instruments and products.",
   :dcterms/issued #inst "2015-08-13T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-30T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/MetadataFBCFunctionalEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/DebtAndEquities/MetadataFBCDebtAndEquities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/MetadataFBCFinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/MetadataFBCProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/MetadataFBC/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata about the EDMC-FIBO Financial Business and Commerce (FBC) Domain",
   :xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/FBC/MetadataFBC/"})