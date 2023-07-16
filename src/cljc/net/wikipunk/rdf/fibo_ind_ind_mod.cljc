(ns net.wikipunk.rdf.fibo-ind-ind-mod
  "This module includes ontologies for concepts common to all market indices and market indicators, including economic measures."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 Object Management Group, Inc."
                       "Copyright (c) 2015-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/MetadataINDIndicators/IndicatorsModule",
   :dcterms/abstract
   "This module includes ontologies for concepts common to all market indices and market indicators, including economic measures.",
   :dcterms/issued #xsd/dateTime #inst "2018-08-27T18:00:00.000-04:00",
   :dcterms/license {:rdfa/uri "https://opensource.org/licenses/MIT"},
   :dcterms/modified #xsd/dateTime #inst "2023-02-06T18:00:00.000-05:00",
   :owl/imports
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/Indicators/MetadataINDIndicators/"},
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-ind-mod"
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/MetadataINDIndicators/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-ind-ind-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/MetadataINDIndicators/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Indices and Indicators (IND) Indicators Module"})

(def IndicatorsModule
  "This module includes ontologies for concepts common to all market indices and market indicators, including economic measures."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :db/ident :fibo-ind-ind-mod/IndicatorsModule,
   :dcterms/abstract
   "This module includes ontologies for concepts common to all market indices and market indicators, including economic measures.",
   :dcterms/contributor
   ["Bureau of Economic Analysis (BEA, US Department of Commerce)"
    "Deutsche Bank"
    "Citigroup"
    "Tahoe Blue Ltd"
    "John F. Tierney"
    "Statistics Canada"
    "HP Enterprise / Mphasis"
    "Adaptive, Inc."
    "Office of Financial Research (OFR), U.S. Department of the Treasury"
    "Nordea Bank AB"
    "Federal Reserve Bank of Kansas City"
    "Wells Fargo Bank, N. A."
    "agnos.ai UK Ltd"
    "Bank of New York Mellon"
    "Bloomberg LP"
    "John F. Gemski"
    "88 Solutions"
    "Pinnacle Bank (Morgan Hill, California)"
    "Thematix Partners LLC"
    "Bureau of Labor Statistics (BLS, US Department of Commerce)"
    "State Street Bank and Trust"
    "Dassault Systemes/No Magic"
    "Census Bureau (US Department of Commerce)"],
   :dcterms/hasPart
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/"},
   :dcterms/license {:rdfa/uri "http://opensource.org/licenses/MIT"},
   :dcterms/title
   ["FIBO IND Indicators Module"
    "Financial Industry Business Ontology (FIBO) Indices and Indicators (IND) Indicators Module"],
   :rdf/type [:owl/NamedIndividual :fibo-fnd-utl-av/Module],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/MetadataINDIndicators/"},
   :rdfs/label "indicators module",
   :rdfs/seeAlso {:rdfa/uri "https://www.edmcouncil.org/fibo/"}})