(ns net.wikipunk.rdf.fibo-ind-mod
  "This ontology provides metadata about the FIBO Indices and Indicators (IND) Domain, which covers market indices and reference rates including economic indicators, foreign exchange, interest rates, and other benchmarks."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/IND/MetadataIND/INDDomain",
   :dcterms/abstract
   "This ontology provides metadata about the FIBO Indices and Indicators (IND) Domain, which covers market indices and reference rates including economic indicators, foreign exchange, interest rates, and other benchmarks.",
   :dcterms/issued #inst "2022-08-09T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/EconomicIndicators/MetadataINDEconomicIndicators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/Indicators/MetadataINDIndicators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/MarketIndices/MetadataINDMarketIndices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/InterestRates/MetadataINDInterestRates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/ForeignExchange/MetadataINDForeignExchange/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/MetadataIND/",
   :rdf/ns-prefix-map
   {"dcterms"      "http://purl.org/dc/terms/",
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
    "sm"           "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"          "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://spec.edmcouncil.org/fibo/ontology/IND/MetadataIND/",
   :rdfa/prefix "fibo-ind-mod",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/IND/MetadataIND/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Indices and Indicators (IND) Domain",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2014-2022 Object Management Group, Inc."
                  "Copyright (c) 2014-2022 EDM Council, Inc."],
   :sm/fileAbbreviation "fibo-ind-mod",
   :sm/filename "MetadataIND.rdf"})

(def INDDomain
  "The FIBO Indices and Indicators (IND) Domain covers market indices and reference rates including economic indicators, foreign exchange, interest rates, and other benchmarks. The ontologies cover quoted interest rates, economic measures such as employment rates, and quoted indices required to support baskets of securities, including specific kinds of securities in share indices or bond indices, as well as credit indices."
  {:db/ident :fibo-ind-mod/INDDomain,
   :dcterms/abstract
   "The FIBO Indices and Indicators (IND) Domain covers market indices and reference rates including economic indicators, foreign exchange, interest rates, and other benchmarks. The ontologies cover quoted interest rates, economic measures such as employment rates, and quoted indices required to support baskets of securities, including specific kinds of securities in share indices or bond indices, as well as credit indices.",
   :dcterms/creator
   "https://wiki.edmcouncil.org/display/IND/FIBO+-+FCT+-+Indices+and+Indicators+Home",
   :dcterms/hasPart [:fibo-ind-mkt-mod/MarketIndicesModule
                     :fibo-ind-ei-mod/EconomicIndicatorsModule
                     :fibo-ind-ind-mod/IndicatorsModule
                     :fibo-ind-ir-mod/InterestRatesModule
                     :fibo-ind-fx-mod/ForeignExchangeModule],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "EDMC Financial Industry Business Ontology (FIBO) Indices and Indicators (IND) Domain",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/MetadataIND/",
   :rdfs/label "Indices and Indicators",
   :rdfs/seeAlso ["https://www.edmcouncil.org/fibo/"],
   :sm/contributor
   ["Adaptive, Inc."
    "Citigroup"
    "Federal Reserve Bank of Kansas City"
    "Census Bureau (US Department of Commerce)"
    "John F. Gemski"
    "Bureau of Labor Statistics (BLS, US Department of Commerce)"
    "88 Solutions"
    "Nordea Bank AB"
    "State Street Bank and Trust"
    "Bloomberg LP"
    "Bureau of Economic Analysis (BEA, US Department of Commerce)"
    "Thematix Partners LLC"
    "agnos.ai UK Ltd."
    "Tahoe Blue Ltd"
    "Pinnacle Bank (Morgan Hill, California)"
    "NoMagic"
    "Statistics Canada"
    "John F. Tierney"
    "HP Enterprise / Mphasis"],
   :sm/copyright ["Copyright (c) 2014-2022 Object Management Group, Inc."
                  "Copyright (c) 2014-2022 EDM Council, Inc."],
   :sm/dependsOn ["http://www.omg.org/techprocess/ab/SpecificationMetadata/"
                  "https://spec.edmcouncil.org/fibo/ontology/BE/"
                  "https://spec.edmcouncil.org/fibo/ontology/FND/"
                  "https://spec.edmcouncil.org/fibo/ontology/FBC/"
                  "https://www.omg.org/spec/LCC/"],
   :sm/keyword
   ["market index" "interest rate" "foreign exchange" "economic indicator"],
   :sm/moduleAbbreviation "fibo-ind"})