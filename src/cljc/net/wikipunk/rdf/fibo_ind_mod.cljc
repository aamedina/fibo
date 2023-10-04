(ns net.wikipunk.rdf.fibo-ind-mod
  ^{:base "https://spec.edmcouncil.org/fibo/ontology/IND/MetadataIND/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "fibo-ind-ei-mod"
     "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/MetadataINDEconomicIndicators/",
     "fibo-ind-fx-mod"
     "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/MetadataINDForeignExchange/",
     "fibo-ind-ind-mod"
     "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/MetadataINDIndicators/",
     "fibo-ind-ir-mod"
     "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MetadataINDInterestRates/",
     "fibo-ind-mkt-mod"
     "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/MetadataINDMarketIndices/",
     "fibo-ind-mod"
     "https://spec.edmcouncil.org/fibo/ontology/IND/MetadataIND/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-ind-mod",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/MetadataIND/INDDomain"}
  {:cmns-av/copyright #{"Copyright (c) 2014-2023 Object Management Group, Inc."
                        "Copyright (c) 2014-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology provides metadata about the FIBO Indices and Indicators (IND) Domain, which covers market indices and reference rates including economic indicators, foreign exchange, interest rates, and other benchmarks.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-03-31T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/Indicators/MetadataINDIndicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/MarketIndices/MetadataINDMarketIndices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/InterestRates/MetadataINDInterestRates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/ForeignExchange/MetadataINDForeignExchange/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/EconomicIndicators/MetadataINDEconomicIndicators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/MetadataIND/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata about the EDMC-FIBO Indices and Indicators (IND) Domain",
   :xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/IND/MetadataIND/"})

(def INDDomain
  {:cmns-av/copyright #{"Copyright (c) 2014-2023 Object Management Group, Inc."
                        "Copyright (c) 2014-2023 EDM Council, Inc."},
   :db/ident :fibo-ind-mod/INDDomain,
   :dcterms/abstract
   "The FIBO Indices and Indicators (IND) Domain covers market indices and reference rates including economic indicators, foreign exchange, interest rates, and other benchmarks. The ontologies cover quoted interest rates, economic measures such as employment rates, and quoted indices required to support baskets of securities, including specific kinds of securities in share indices or bond indices, as well as credit indices.",
   :dcterms/contributor
   #{"Citigroup" "Census Bureau (US Department of Commerce)"
     "Office of Financial Research (OFR), U.S. Department of the Treasury"
     "John F. Gemski" "Dassault Systemes/No Magic" "Adaptive, Inc."
     "Federal Reserve Bank of Kansas City" "Tahoe Blue Ltd"
     "Bureau of Economic Analysis (BEA, US Department of Commerce)"
     "Thematix Partners LLC" "Bloomberg LP" "88 Solutions" "Nordea Bank AB"
     "Pinnacle Bank (Morgan Hill, California)" "State Street Bank and Trust"
     "Deutsche Bank" "Bank of New York Mellon" "Statistics Canada"
     "Bureau of Labor Statistics (BLS, US Department of Commerce)"
     "John F. Tierney" "agnos.ai UK Ltd" "HP Enterprise / Mphasis"
     "Wells Fargo Bank, N. A."},
   :dcterms/creator
   {:xsd/anyURI
    "https://wiki.edmcouncil.org/display/IND/FIBO+-+FCT+-+Indices+and+Indicators+Home"},
   :dcterms/hasPart #{:fibo-ind-ir-mod/InterestRatesModule
                      :fibo-ind-ind-mod/IndicatorsModule
                      :fibo-ind-ei-mod/EconomicIndicatorsModule
                      :fibo-ind-mkt-mod/MarketIndicesModule
                      :fibo-ind-fx-mod/ForeignExchangeModule},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"FIBO IND Domain"
     "Financial Industry Business Ontology (FIBO) Indices and Indicators (IND) Domain"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/IND/MetadataIND/"},
   :rdfs/label "indices and indicators module",
   :rdfs/seeAlso {:xsd/anyURI "https://www.edmcouncil.org/fibo/"}})

(def urn:uuid:02c69906-b4c7-5f6f-b0b6-9e769c6f5f44
  {:cmns-av/copyright #{"Copyright (c) 2014-2023 Object Management Group, Inc."
                        "Copyright (c) 2014-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology provides metadata about the FIBO Indices and Indicators (IND) Domain, which covers market indices and reference rates including economic indicators, foreign exchange, interest rates, and other benchmarks.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-03-31T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/Indicators/MetadataINDIndicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/MarketIndices/MetadataINDMarketIndices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/InterestRates/MetadataINDInterestRates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/ForeignExchange/MetadataINDForeignExchange/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/EconomicIndicators/MetadataINDEconomicIndicators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/MetadataIND/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata about the EDMC-FIBO Indices and Indicators (IND) Domain",
   :xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/IND/MetadataIND/"})