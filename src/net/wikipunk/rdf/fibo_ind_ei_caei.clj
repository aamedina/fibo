(ns net.wikipunk.rdf.fibo-ind-ei-caei
  "This ontology provides specific parameters which make up the various types of market economic indicators applicable to the Canadian economy."
  {:cmns-av/copyright ["Copyright (c) 2016-2023 EDM Council, Inc."
                       "Copyright (c) 2016-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/",
   :dcterms/abstract
   "This ontology provides specific parameters which make up the various types of market economic indicators applicable to the Canadian economy.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/GovernmentEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/EconomicIndicators/EconomicIndicators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/Publishers/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/ClassificationSchemes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-fct-pub"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
    "fibo-be-ge-caj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/",
    "fibo-be-ge-ge"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/",
    "fibo-fnd-arr-cls"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/",
    "fibo-fnd-plc-loc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-alx"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-ei-caei"
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/",
    "fibo-ind-ei-ei"
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-ind-ei-caei",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/",
   :rdfs/label "Canadian Economic Indicators Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators.rdf version of this ontology was revised to eliminate duplication with concepts in LCC and merge countries with locations in FND."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators.rdf version of this ontology was revised to reflect the new hasCoverageArea property in FND."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators.rdf version of this ontology was revised per the FIBO 2.0 RFC."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators.rdf version of this ontology was revised to correct a datatype on an explanatory note and merge statistical information publisher with economic indicators."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators.rdf version of this ontology was added to the IND specification per the issue resolutions identified in the FIBO IND 1.0 FTF 3 report."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators.rdf version of this ontology was revised to correct out of date links."]})

(def CanadianConsumerPriceIndex
  "economic indicator representing a measure of changes over time in the prices of a fixed basket of consumer goods and services that Canadian private households consume"
  {:cmns-av/abbreviation "CPI",
   :cmns-av/adaptedFrom
   ["https://www.statcan.gc.ca/en/subjects-start/prices_and_price_indexes/consumer_price_indexes"
    "http://www.statcan.gc.ca/eng/start"],
   :db/ident :fibo-ind-ei-caei/CanadianConsumerPriceIndex,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/",
   :rdfs/label "Canadian consumer price index",
   :rdfs/subClassOf
   [{:owl/onClass    :fibo-ind-ei-caei/CanadianHouseholdsConsumersUniverse,
     :owl/onProperty :fibo-fnd-utl-alx/hasArgument,
     :owl/qualifiedCardinality 1,
     :rdf/type       :owl/Restriction}
    {:owl/hasValue   :fibo-ind-ei-caei/StatisticsCanada,
     :owl/onProperty :fibo-be-fct-pub/isPublishedBy,
     :rdf/type       :owl/Restriction}
    :fibo-ind-ei-ei/ConsumerPriceIndex
    {:owl/hasValue   :fibo-ind-ei-caei/CanadianStatisticsPublisher,
     :owl/onProperty :fibo-be-fct-pub/hasPublisher,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
     :owl/someValuesFrom :fibo-ind-ei-ei/FixedBasket,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-cxtdsg/appliesTo,
     :owl/someValuesFrom :fibo-ind-ei-caei/CanadianHouseholdsConsumersUniverse,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   "economic indicator representing a measure of changes over time in the prices of a fixed basket of consumer goods and services that Canadian private households consume"})

(def CanadianHouseholdsConsumersUniverse
  "a statistical universe consisting of all private households in Canada, with the exception of soldiers on military bases, people living on First Nations reserves, institutionalized persons, and households living in the rural areas of the three northern territories"
  {:cmns-av/adaptedFrom
   "http://www.statcan.gc.ca/pub/62-553-x/62-553-x2015001-eng.pdf",
   :db/ident :fibo-ind-ei-caei/CanadianHouseholdsConsumersUniverse,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/",
   :rdfs/label "Canadian households consumers universe",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-cxtdsg/isApplicableIn,
     :owl/someValuesFrom :fibo-ind-ei-ei/Household,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-col/hasMember,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-pty-rl/playsRole,
                          :owl/someValuesFrom :fibo-ind-ei-ei/UltimateConsumer,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-ind-ei-ei/CivilianNonInstitutionalPopulation],
   :skos/definition
   "a statistical universe consisting of all private households in Canada, with the exception of soldiers on military bases, people living on First Nations reserves, institutionalized persons, and households living in the rural areas of the three northern territories"})

(def CanadianProducerPriceIndex
  "an economic indicator representing a measure of the change over time in the prices of a fixed-basket of domestic producer goods and services"
  {:cmns-av/adaptedFrom
   "http://www23.statcan.gc.ca/imdb-bmdi/pub/indexth-eng.htm",
   :cmns-av/explanatoryNote
   "Note that Canada does not produce a high level, cross industry PPI per se. Canadian PPIs are published by industry sector. Three of the most important are captured in the union defined herein, which may be expanded over time to integrate others, as needed.",
   :db/ident :fibo-ind-ei-caei/CanadianProducerPriceIndex,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/",
   :rdfs/label "Canadian producer price index",
   :rdfs/subClassOf [{:owl/onProperty :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom
                      {:owl/unionOf [:fibo-ind-ei-caei/IndustrialProductsSector
                                     :fibo-ind-ei-caei/NewHousingSector
                                     :fibo-ind-ei-caei/RawMaterialsSector],
                       :rdf/type    :owl/Class},
                      :rdf/type :owl/Restriction}
                     {:owl/hasValue   :fibo-ind-ei-caei/StatisticsCanada,
                      :owl/onProperty :fibo-be-fct-pub/isPublishedBy,
                      :rdf/type       :owl/Restriction}
                     :fibo-ind-ei-ei/ProducerPriceIndex
                     {:owl/hasValue
                      :fibo-ind-ei-caei/CanadianStatisticsPublisher,
                      :owl/onProperty :fibo-be-fct-pub/hasPublisher,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   "an economic indicator representing a measure of the change over time in the prices of a fixed-basket of domestic producer goods and services"})

(def CanadianStatisticsPublisher
  "individual representing the functional entity that is the primary publisher of statistical information for the Canadian Government"
  {:cmns-av/adaptedFrom "http://www.statcan.gc.ca/eng/about/mandate/",
   :db/ident :fibo-ind-ei-caei/CanadianStatisticsPublisher,
   :fibo-fnd-rel-rel/hasIdentity :fibo-ind-ei-caei/StatisticsCanada,
   :rdf/type [:fibo-ind-ei-ei/StatisticalInformationPublisher
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/",
   :rdfs/label "Canadian statistics publisher",
   :skos/definition
   "individual representing the functional entity that is the primary publisher of statistical information for the Canadian Government"})

(def IndustrialProductsSector
  "a classifier for a sector of the economy used for price indices focused on major commodities sold by manufacturers in Canada"
  {:cmns-av/adaptedFrom
   "http://www23.statcan.gc.ca/imdb/p2SV.pl?Function=getSurvey&SDDS=2318",
   :db/ident :fibo-ind-ei-caei/IndustrialProductsSector,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/",
   :rdfs/label "industrial products sector",
   :rdfs/subClassOf :fibo-fnd-arr-cls/IndustrySectorClassifier,
   :skos/definition
   "a classifier for a sector of the economy used for price indices focused on major commodities sold by manufacturers in Canada"})

(def NewHousingSector
  "a classifier for a sector of the economy used for price indices focused on contractors' selling prices of new residential houses, where detailed specifications pertaining to each house remain the same between two consecutive periods"
  {:cmns-av/adaptedFrom
   "http://www23.statcan.gc.ca/imdb/p2SV.pl?Function=getSurvey&SDDS=2310",
   :db/ident :fibo-ind-ei-caei/NewHousingSector,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/",
   :rdfs/label "new housing sector",
   :rdfs/subClassOf :fibo-fnd-arr-cls/IndustrySectorClassifier,
   :skos/definition
   "a classifier for a sector of the economy used for price indices focused on contractors' selling prices of new residential houses, where detailed specifications pertaining to each house remain the same between two consecutive periods"})

(def RawMaterialsSector
  "a classifier used for price indices related to raw materials purchased by industries in Canada for further processing"
  {:cmns-av/adaptedFrom
   "http://www23.statcan.gc.ca/imdb/p2SV.pl?Function=getSurvey&SDDS=2306",
   :db/ident :fibo-ind-ei-caei/RawMaterialsSector,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/",
   :rdfs/label "raw materials sector",
   :rdfs/subClassOf :fibo-fnd-arr-cls/IndustrySectorClassifier,
   :skos/definition
   "a classifier used for price indices related to raw materials purchased by industries in Canada for further processing"})

(def StatisticsCanada
  "individual representing Statistics Canada, a government agency mandated to collect, compile, analyse, abstract and publish statistical information relating to the commercial, industrial, financial, social, economic and general activities and condition of the people of Canada"
  {:cmns-av/abbreviation "StatCan",
   :cmns-av/adaptedFrom "http://www.statcan.gc.ca/eng/about/mandate",
   :cmns-col/isPartOf :fibo-be-ge-caj/GovernmentOfCanada,
   :db/ident :fibo-ind-ei-caei/StatisticsCanada,
   :fibo-fnd-plc-loc/hasCoverageArea :lcc-3166-1/Canada,
   :rdf/type [:owl/NamedIndividual :fibo-be-ge-ge/GovernmentAgency],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Statistique Canada"}
                {:rdf/language "en",
                 :rdf/value    "Statistics Canada"}],
   :skos/definition
   "individual representing Statistics Canada, a government agency mandated to collect, compile, analyse, abstract and publish statistical information relating to the commercial, industrial, financial, social, economic and general activities and condition of the people of Canada"})