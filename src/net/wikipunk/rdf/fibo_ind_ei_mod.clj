(ns net.wikipunk.rdf.fibo-ind-ei-mod
  "The economic indicators module includes ontologies defining concepts to do with published economic indicators. These give some indication of the state of some economy. Indicators of this type are usually published by governments or government agencies, or by international agencies or agencies of countries other than the ones reported on. Examples include Gross Domestic Product (GDP) and unemployment rates."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/MetadataINDEconomicIndicators/EconomicIndicatorsModule",
   :dcterms/abstract
   "The economic indicators module includes ontologies defining concepts to do with published economic indicators. These give some indication of the state of some economy. Indicators of this type are usually published by governments or government agencies, or by international agencies or agencies of countries other than the ones reported on. Examples include Gross Domestic Product (GDP) and unemployment rates.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-02-06T23:00:00.000-00:00",
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/EconomicIndicators/MetadataINDEconomicIndicators/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-ei-mod"
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/MetadataINDEconomicIndicators/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/MetadataINDEconomicIndicators/",
   :rdfa/prefix "fibo-ind-ei-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/MetadataINDEconomicIndicators/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Indices and Indicators (IND) Economic Indicators Module"})

(def EconomicIndicatorsModule
  "The economic indicators module includes ontologies defining concepts to do with published economic indicators. These give some indication of the state of some economy. Indicators of this type are usually published by governments or goernment agencies, or by international agencies or agencies of countries other than the ones reported on. Examples include Gross Domestic Product (GDP) and unemployment rates."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 Object Management Group, Inc."
                       "Copyright (c) 2015-2023 EDM Council, Inc."],
   :db/ident :fibo-ind-ei-mod/EconomicIndicatorsModule,
   :dcterms/abstract
   "The economic indicators module includes ontologies defining concepts to do with published economic indicators. These give some indication of the state of some economy. Indicators of this type are usually published by governments or goernment agencies, or by international agencies or agencies of countries other than the ones reported on. Examples include Gross Domestic Product (GDP) and unemployment rates.",
   :dcterms/contributor
   ["Pinnacle Bank (Morgan Hill, California)"
    "Bank of New York Mellon"
    "Office of Financial Research (OFR), U.S. Department of the Treasury"
    "Citigroup"
    "agnos.ai UK Ltd"
    "Census Bureau (US Department of Commerce)"
    "Federal Reserve Bank of Kansas City"
    "Thematix Partners LLC"
    "Tahoe Blue Ltd"
    "Statistics Canada"
    "John F. Gemski"
    "Bloomberg LP"
    "88 Solutions"
    "Bureau of Economic Analysis (BEA, US Department of Commerce)"
    "Dassault Systemes/No Magic"
    "State Street Bank and Trust"
    "Nordea Bank AB"
    "Adaptive, Inc."
    "HP Enterprise / Mphasis"
    "John F. Tierney"
    "Bureau of Labor Statistics (BLS, US Department of Commerce)"
    "Wells Fargo Bank, N. A."
    "Deutsche Bank"],
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators/"
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Indices and Indicators (IND) Economic Indicators Module"
    "FIBO IND Economic Indicators Module"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/MetadataINDEconomicIndicators/",
   :rdfs/label "economic indicators module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})