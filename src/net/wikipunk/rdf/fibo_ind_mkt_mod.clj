(ns net.wikipunk.rdf.fibo-ind-mkt-mod
  "The market indices module includes ontologies defining a variety of reference indices (benchmarks) such as credit and equity indicies. Examples include the Dow Jones Industrial Average (DJIA), Standard and Poors (S&P) 500, exchange-specific indices, and the like."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/MetadataINDMarketIndices/MarketIndicesModule",
   :dcterms/abstract
   "The market indices module includes ontologies defining a variety of reference indices (benchmarks) such as credit and equity indicies. Examples include the Dow Jones Industrial Average (DJIA), Standard and Poors (S&P) 500, exchange-specific indices, and the like.",
   :dcterms/issued #inst "2020-09-28T22:00:00.000-00:00",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/MarketIndices/MetadataINDMarketIndices/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-ind-mkt-mod"
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/MetadataINDMarketIndices/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/MetadataINDMarketIndices/",
   :rdfa/prefix "fibo-ind-mkt-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/MetadataINDMarketIndices/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Indices and Indicators (IND) Market Indices Module",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2018-2020 Object Management Group, Inc."
                  "Copyright (c) 2018-2020 EDM Council, Inc."],
   :sm/fileAbbreviation "fibo-ind-mkt-mod",
   :sm/filename "MetadataINDMarketIndices.rdf"})

(def MarketIndicesModule
  "The market indices module includes ontologies defining a variety of reference indices such as credit and equity indicies. Examples include the Dow Jones Industrial Average (DJIA), Standard and Poors (S&P) 500, exchange-specific indices, and the like."
  {:db/ident :fibo-ind-mkt-mod/MarketIndicesModule,
   :dcterms/abstract
   "The market indices module includes ontologies defining a variety of reference indices such as credit and equity indicies. Examples include the Dow Jones Industrial Average (DJIA), Standard and Poors (S&P) 500, exchange-specific indices, and the like.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/"
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/MetadataINDMarketIndices/",
   :rdfs/label "Market Indices",
   :rdfs/seeAlso "https://www.edmcouncil.org/fibo/",
   :sm/contributor
   ["Thematix Partners LLC"
    "Adaptive, Inc."
    "Tahoe Blue Ltd"
    "Pinnacle Bank (Morgan Hill, California)"
    "Bank of New York Mellon"
    "Deutsche Bank"
    "Office of Financial Research (OFR), U.S. Department of the Treasury"
    "State Street Bank and Trust"],
   :sm/copyright ["Copyright (c) 2018-2020 Object Management Group, Inc."
                  "Copyright (c) 2018-2020 EDM Council, Inc."],
   :sm/moduleAbbreviation "FIBO-IND-MKT"})