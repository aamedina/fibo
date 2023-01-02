(ns net.wikipunk.rdf.fibo-fbc-mod
  "This ontology provides metadata about the FIBO Financial Business and Commerce (FBC) Domain, which covers business concepts that are common to common to a number of finance domain areas, such as loans, securities, and corporate actions, including products and services, financial intermediaries, registrars and regulators, and financial instruments and products."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/MetadataFBC/FBCDomain",
   :dcterms/abstract
   "This ontology provides metadata about the FIBO Financial Business and Commerce (FBC) Domain, which covers business concepts that are common to common to a number of finance domain areas, such as loans, securities, and corporate actions, including products and services, financial intermediaries, registrars and regulators, and financial instruments and products.",
   :dcterms/issued #inst "2022-08-13T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/MetadataFBCFunctionalEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/MetadataFBCFinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/MetadataFBCProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/MetadataFBCDebtAndEquities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/MetadataFBC/",
   :rdf/ns-prefix-map
   {"dcterms"      "http://purl.org/dc/terms/",
    "fibo-fbc-dae-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/MetadataFBCDebtAndEquities/",
    "fibo-fbc-fct-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/MetadataFBCFunctionalEntities/",
    "fibo-fbc-fi-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/MetadataFBCFinancialInstruments/",
    "fibo-fbc-mod" "https://spec.edmcouncil.org/fibo/ontology/FBC/MetadataFBC/",
    "fibo-fbc-pas-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/MetadataFBCProductsAndServices/",
    "owl"          "http://www.w3.org/2002/07/owl#",
    "rdf"          "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"         "http://www.w3.org/2000/01/rdf-schema#",
    "sm"           "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"          "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://spec.edmcouncil.org/fibo/ontology/FBC/MetadataFBC/",
   :rdfa/prefix "fibo-fbc-mod",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/FBC/MetadataFBC/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Financial Business and Commerce (FBC) Domain",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2015-2022 EDM Council, Inc."
                  "Copyright (c) 2015-2022 Object Management Group, Inc."],
   :sm/fileAbbreviation "fibo-fbc-mod",
   :sm/filename "MetadataFBC.rdf"})

(def FBCDomain
  "The financial business and commerce domain covers business concepts that are common to common to a number of finance areas, such as loans, securities, and corporate actions, including products and services, financial intermediaries, registrars and regulators, and financial instruments and products."
  {:db/ident :fibo-fbc-mod/FBCDomain,
   :dcterms/abstract
   "The financial business and commerce domain covers business concepts that are common to common to a number of finance areas, such as loans, securities, and corporate actions, including products and services, financial intermediaries, registrars and regulators, and financial instruments and products.",
   :dcterms/creator
   "https://wiki.edmcouncil.org/pages/viewpage.action?pageId=786677",
   :dcterms/hasPart [:fibo-fbc-dae-mod/DebtAndEquitiesModule
                     :fibo-fbc-pas-mod/FBCProductsAndServicesModule
                     :fibo-fbc-fi-mod/FinancialInstrumentsModule
                     :fibo-fbc-fct-mod/FunctionalEntitiesModule],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "EDMC Financial Industry Business Ontology (FIBO) Financial Business and Commerce (FBC) Domain",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/MetadataFBC/",
   :rdfs/label "Financial Business and Commerce",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/contributor ["agnos.ai UK Ltd."
                    "Citigroup"
                    "State Street Bank and Trust"
                    "Deutsche Bank"
                    "Pinnacle Bank (Morgan Hill, California)"
                    "Statistics Canada"
                    "Office of Financial Research (US Dept of the Treasury)"
                    "NoMagic"
                    "Exprentis"
                    "Credit Suisse"
                    "Thematix Partners LLC"
                    "Bloomberg LP"
                    "Adaptive, Inc."
                    "John F. Gemski"
                    "Quarule"
                    "Wells Fargo"
                    "Federated Knowledge LLC"
                    "Tahoe Blue Ltd"
                    "Nordea Bank AB"],
   :sm/copyright ["Copyright (c) 2015-2022 Object Management Group, Inc."
                  "Copyright (c) 2015-2022 EDM Council, Inc."],
   :sm/dependsOn ["https://spec.edmcouncil.org/fibo/ontology/FND/"
                  "https://www.omg.org/spec/LCC/"
                  "http://www.omg.org/techprocess/ab/SpecificationMetadata/"
                  "https://spec.edmcouncil.org/fibo/ontology/BE/"],
   :sm/keyword ["financial instruments"
                "financial products"
                "registration authorities"
                "regulatory agencies"
                "markets"
                "financial services, service providers, and accounts"],
   :sm/moduleAbbreviation "fibo-fbc"})