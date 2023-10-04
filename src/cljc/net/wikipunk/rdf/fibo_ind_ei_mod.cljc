(ns net.wikipunk.rdf.fibo-ind-ei-mod
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/MetadataINDEconomicIndicators/",
    :namespaces
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
    :prefix "fibo-ind-ei-mod",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/EconomicIndicators/MetadataINDEconomicIndicators/EconomicIndicatorsModule"}
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "The economic indicators module includes ontologies defining concepts to do with published economic indicators. These give some indication of the state of some economy. Indicators of this type are usually published by governments or government agencies, or by international agencies or agencies of countries other than the ones reported on. Examples include Gross Domestic Product (GDP) and unemployment rates.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-06T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/EconomicIndicators/MetadataINDEconomicIndicators/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata about the EDMC-FIBO Indices and Indicators (IND) Economic Indicators Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/MetadataINDEconomicIndicators/"})

(def EconomicIndicatorsModule
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :db/ident :fibo-ind-ei-mod/EconomicIndicatorsModule,
   :dcterms/abstract
   "The economic indicators module includes ontologies defining concepts to do with published economic indicators. These give some indication of the state of some economy. Indicators of this type are usually published by governments or goernment agencies, or by international agencies or agencies of countries other than the ones reported on. Examples include Gross Domestic Product (GDP) and unemployment rates.",
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
      "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators/"}},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"Financial Industry Business Ontology (FIBO) Indices and Indicators (IND) Economic Indicators Module"
     "FIBO IND Economic Indicators Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/MetadataINDEconomicIndicators/"},
   :rdfs/label "economic indicators module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:b5e07afe-c4f5-5ae2-96d9-584643743e18
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "The economic indicators module includes ontologies defining concepts to do with published economic indicators. These give some indication of the state of some economy. Indicators of this type are usually published by governments or government agencies, or by international agencies or agencies of countries other than the ones reported on. Examples include Gross Domestic Product (GDP) and unemployment rates.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-06T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/EconomicIndicators/MetadataINDEconomicIndicators/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata about the EDMC-FIBO Indices and Indicators (IND) Economic Indicators Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/MetadataINDEconomicIndicators/"})