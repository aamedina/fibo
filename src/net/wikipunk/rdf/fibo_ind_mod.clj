(ns net.wikipunk.rdf.fibo-ind-mod
  "This ontology provides metadata about the FIBO Indices and Indicators (IND) Domain, which covers market indices and reference rates including economic indicators, foreign exchange, interest rates, and other benchmarks."
  {:cmns-av/copyright ["Copyright (c) 2014-2023 Object Management Group, Inc."
                       "Copyright (c) 2014-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/IND/MetadataIND/INDDomain",
   :dcterms/abstract
   "This ontology provides metadata about the FIBO Indices and Indicators (IND) Domain, which covers market indices and reference rates including economic indicators, foreign exchange, interest rates, and other benchmarks.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-02-06T23:00:00.000-00:00",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/EconomicIndicators/MetadataINDEconomicIndicators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/Indicators/MetadataINDIndicators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/MarketIndices/MetadataINDMarketIndices/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/InterestRates/MetadataINDInterestRates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/ForeignExchange/MetadataINDForeignExchange/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/MetadataIND/",
   :rdf/ns-prefix-map
   {"cmns-av"      "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms"      "http://purl.org/dc/terms/",
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
    "fibo-ind-mod" "https://spec.edmcouncil.org/fibo/ontology/IND/MetadataIND/",
    "owl"          "http://www.w3.org/2002/07/owl#",
    "rdf"          "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"         "http://www.w3.org/2000/01/rdf-schema#",
    "xsd"          "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-ind-mod",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/IND/MetadataIND/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Indices and Indicators (IND) Domain"})

(def INDDomain
  "The FIBO Indices and Indicators (IND) Domain covers market indices and reference rates including economic indicators, foreign exchange, interest rates, and other benchmarks. The ontologies cover quoted interest rates, economic measures such as employment rates, and quoted indices required to support baskets of securities, including specific kinds of securities in share indices or bond indices, as well as credit indices."
  {:cmns-av/copyright ["Copyright (c) 2014-2023 EDM Council, Inc."
                       "Copyright (c) 2014-2023 Object Management Group, Inc."],
   :db/ident :fibo-ind-mod/INDDomain,
   :dcterms/abstract
   "The FIBO Indices and Indicators (IND) Domain covers market indices and reference rates including economic indicators, foreign exchange, interest rates, and other benchmarks. The ontologies cover quoted interest rates, economic measures such as employment rates, and quoted indices required to support baskets of securities, including specific kinds of securities in share indices or bond indices, as well as credit indices.",
   :dcterms/contributor
   ["Census Bureau (US Department of Commerce)"
    "Adaptive, Inc."
    "John F. Tierney"
    "Tahoe Blue Ltd"
    "Bank of New York Mellon"
    "Wells Fargo Bank, N. A."
    "Federal Reserve Bank of Kansas City"
    "John F. Gemski"
    "Office of Financial Research (OFR), U.S. Department of the Treasury"
    "Deutsche Bank"
    "Bureau of Labor Statistics (BLS, US Department of Commerce)"
    "88 Solutions"
    "Thematix Partners LLC"
    "State Street Bank and Trust"
    "HP Enterprise / Mphasis"
    "Pinnacle Bank (Morgan Hill, California)"
    "Dassault Systemes/No Magic"
    "agnos.ai UK Ltd"
    "Nordea Bank AB"
    "Citigroup"
    "Bloomberg LP"
    "Bureau of Economic Analysis (BEA, US Department of Commerce)"
    "Statistics Canada"],
   :dcterms/creator
   "https://wiki.edmcouncil.org/display/IND/FIBO+-+FCT+-+Indices+and+Indicators+Home",
   :dcterms/hasPart [:fibo-ind-mkt-mod/MarketIndicesModule
                     :fibo-ind-ei-mod/EconomicIndicatorsModule
                     :fibo-ind-ind-mod/IndicatorsModule
                     :fibo-ind-ir-mod/InterestRatesModule
                     :fibo-ind-fx-mod/ForeignExchangeModule],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Indices and Indicators (IND) Domain"
    "FIBO IND Domain"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/MetadataIND/",
   :rdfs/label "Indices and Indicators",
   :rdfs/seeAlso ["https://www.edmcouncil.org/fibo/"]})