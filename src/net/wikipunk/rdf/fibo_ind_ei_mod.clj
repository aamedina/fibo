(ns net.wikipunk.rdf.fibo-ind-ei-mod
  "The economic indicators module includes ontologies defining concepts to do with published economic indicators. These give some indication of the state of some economy. Indicators of this type are usually published by governments or government agencies, or by international agencies or agencies of countries other than the ones reported on. Examples include Gross Domestic Product (GDP) and unemployment rates."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/MetadataINDEconomicIndicators/EconomicIndicatorsModule",
   :dcterms/abstract
   "The economic indicators module includes ontologies defining concepts to do with published economic indicators. These give some indication of the state of some economy. Indicators of this type are usually published by governments or government agencies, or by international agencies or agencies of countries other than the ones reported on. Examples include Gross Domestic Product (GDP) and unemployment rates.",
   :dcterms/issued #inst "2021-03-29T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/EconomicIndicators/MetadataINDEconomicIndicators/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-ind-ei-mod"
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/MetadataINDEconomicIndicators/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/MetadataINDEconomicIndicators/",
   :rdfa/prefix "fibo-ind-ei-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/MetadataINDEconomicIndicators/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Indices and Indicators (IND) Economic Indicators Module",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2015-2021 EDM Council, Inc."
                  "Copyright (c) 2015-2021 Object Management Group, Inc."],
   :sm/fileAbbreviation "fibo-ind-ei-mod",
   :sm/filename "MetadataINDEconomicIndicators.rdf"})

(def EconomicIndicatorsModule
  "The economic indicators module includes ontologies defining concepts to do with published economic indicators. These give some indication of the state of some economy. Indicators of this type are usually published by governments or goernment agencies, or by international agencies or agencies of countries other than the ones reported on. Examples include Gross Domestic Product (GDP) and unemployment rates."
  {:db/ident :fibo-ind-ei-mod/EconomicIndicatorsModule,
   :dcterms/abstract
   "The economic indicators module includes ontologies defining concepts to do with published economic indicators. These give some indication of the state of some economy. Indicators of this type are usually published by governments or goernment agencies, or by international agencies or agencies of countries other than the ones reported on. Examples include Gross Domestic Product (GDP) and unemployment rates.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators/"
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/MetadataINDEconomicIndicators/",
   :rdfs/label "FIBO IND Economic Indicators",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"],
   :sm/contributor
   ["Pinnacle Bank (Morgan Hill, California)"
    "Bureau of Labor Statistics (BLS, US Department of Commerce)"
    "Tahoe Blue Ltd"
    "John F. Tierney"
    "John F. Gemski"
    "Statistics Canada"
    "State Street Bank and Trust"
    "agnos.ai UK Ltd"
    "Adaptive, Inc."
    "Nordea Bank AB"
    "Citigroup"
    "Federal Reserve Bank of Kansas City"
    "Thematix Partners LLC"
    "Bureau of Economic Analysis (BEA, US Department of Commerce)"
    "Deutsche Bank"
    "Census Bureau (US Department of Commerce)"],
   :sm/copyright ["Copyright (c) 2015-2021 EDM Council, Inc."
                  "Copyright (c) 2015-2021 Object Management Group, Inc."],
   :sm/moduleAbbreviation "fibo-ind-ei"})