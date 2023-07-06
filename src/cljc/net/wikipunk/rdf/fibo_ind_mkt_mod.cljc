(ns net.wikipunk.rdf.fibo-ind-mkt-mod
  "The market indices module includes ontologies defining a variety of reference indices (benchmarks) such as credit and equity indicies. Examples include the Dow Jones Industrial Average (DJIA), Standard and Poors (S&P) 500, exchange-specific indices, and the like."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 Object Management Group, Inc."
                       "Copyright (c) 2018-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/MetadataINDMarketIndices/MarketIndicesModule",
   :dcterms/abstract
   "The market indices module includes ontologies defining a variety of reference indices (benchmarks) such as credit and equity indicies. Examples include the Dow Jones Industrial Average (DJIA), Standard and Poors (S&P) 500, exchange-specific indices, and the like.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-02-06T23:00:00.000-00:00",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/MarketIndices/MetadataINDMarketIndices/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-mkt-mod"
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/MetadataINDMarketIndices/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-ind-mkt-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/MetadataINDMarketIndices/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Indices and Indicators (IND) Market Indices Module"})

(def MarketIndicesModule
  "The market indices module includes ontologies defining a variety of reference indices such as credit and equity indicies. Examples include the Dow Jones Industrial Average (DJIA), Standard and Poors (S&P) 500, exchange-specific indices, and the like."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 Object Management Group, Inc."
                       "Copyright (c) 2018-2023 EDM Council, Inc."],
   :db/ident :fibo-ind-mkt-mod/MarketIndicesModule,
   :dcterms/abstract
   "The market indices module includes ontologies defining a variety of reference indices such as credit and equity indicies. Examples include the Dow Jones Industrial Average (DJIA), Standard and Poors (S&P) 500, exchange-specific indices, and the like.",
   :dcterms/contributor
   ["88 Solutions"
    "Adaptive, Inc."
    "Deutsche Bank"
    "Thematix Partners LLC"
    "Wells Fargo Bank, N. A."
    "Census Bureau (US Department of Commerce)"
    "Dassault Systemes/No Magic"
    "agnos.ai UK Ltd"
    "Pinnacle Bank (Morgan Hill, California)"
    "Bank of New York Mellon"
    "State Street Bank and Trust"
    "Bureau of Economic Analysis (BEA, US Department of Commerce)"
    "Federal Reserve Bank of Kansas City"
    "HP Enterprise / Mphasis"
    "John F. Tierney"
    "Bloomberg LP"
    "Bureau of Labor Statistics (BLS, US Department of Commerce)"
    "Office of Financial Research (OFR), U.S. Department of the Treasury"
    "John F. Gemski"
    "Tahoe Blue Ltd"
    "Citigroup"
    "Nordea Bank AB"
    "Statistics Canada"],
   :dcterms/hasPart
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/"}],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Indices and Indicators (IND) Market Indices Module"
    "FIBO IND Market Indices Module"],
   :rdf/type [:owl/NamedIndividual :fibo-fnd-utl-av/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/MetadataINDMarketIndices/",
   :rdfs/label "market indices module",
   :rdfs/seeAlso ["https://www.edmcouncil.org/fibo/"]})