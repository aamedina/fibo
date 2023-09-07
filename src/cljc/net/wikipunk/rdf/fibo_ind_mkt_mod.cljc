(ns net.wikipunk.rdf.fibo-ind-mkt-mod
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/MetadataINDMarketIndices/",
    :namespaces
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
    :prefix "fibo-ind-mkt-mod",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/MetadataINDMarketIndices/MarketIndicesModule"}
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcterms/abstract
   "The market indices module includes ontologies defining a variety of reference indices (benchmarks) such as credit and equity indicies. Examples include the Dow Jones Industrial Average (DJIA), Standard and Poors (S&P) 500, exchange-specific indices, and the like.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-06T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/MarketIndices/MetadataINDMarketIndices/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata about the EDMC-FIBO Indices and Indicators (IND) Market Indices Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/MetadataINDMarketIndices/"})

(def MarketIndicesModule
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :db/ident :fibo-ind-mkt-mod/MarketIndicesModule,
   :dcterms/abstract
   "The market indices module includes ontologies defining a variety of reference indices such as credit and equity indicies. Examples include the Dow Jones Industrial Average (DJIA), Standard and Poors (S&P) 500, exchange-specific indices, and the like.",
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
   :dcterms/hasPart
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/"}},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"FIBO IND Market Indices Module"
     "Financial Industry Business Ontology (FIBO) Indices and Indicators (IND) Market Indices Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/MetadataINDMarketIndices/"},
   :rdfs/label "market indices module",
   :rdfs/seeAlso {:xsd/anyURI "https://www.edmcouncil.org/fibo/"}})

(def urn:uuid:4bd2f37e-40b2-5db6-b1b7-849ec64f5c56
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcterms/abstract
   "The market indices module includes ontologies defining a variety of reference indices (benchmarks) such as credit and equity indicies. Examples include the Dow Jones Industrial Average (DJIA), Standard and Poors (S&P) 500, exchange-specific indices, and the like.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-06T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/MarketIndices/MetadataINDMarketIndices/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata about the EDMC-FIBO Indices and Indicators (IND) Market Indices Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/MetadataINDMarketIndices/"})