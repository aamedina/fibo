(ns net.wikipunk.rdf.fibo-ind-ei-caei
  {:cmns-av/copyright
   #{"Copyright (c) 2016-2024 EDM Council, Inc."
     "Copyright (c) 2016-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/",
   :dcterms/abstract
   "This ontology provides specific parameters which make up the various types of market economic indicators applicable to the Canadian economy.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-qtu" "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
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
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Places/Locations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/FunctionalEntities/Publishers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/EconomicIndicators/EconomicIndicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Arrangements/ClassificationSchemes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-ind-ei-caei",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/",
   :rdfs/label "Canadian Economic Indicators Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators.rdf version of this ontology was revised to correct out of date links."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators.rdf version of this ontology was revised to eliminate duplication with concepts in LCC and merge countries with locations in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators.rdf version of this ontology was added to the IND specification per the issue resolutions identified in the FIBO IND 1.0 FTF 3 report."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators.rdf version of this ontology was revised per the FIBO 2.0 RFC."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators.rdf version of this ontology was revised to reflect the new hasCoverageArea property in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators.rdf version of this ontology was revised to correct a datatype on an explanatory note and merge statistical information publisher with economic indicators."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/"})

(def CanadianConsumerPriceIndex
  {:cmns-av/abbreviation "CPI",
   :cmns-av/adaptedFrom
   #{{:xsd/anyURI "http://www.statcan.gc.ca/eng/start"}
     {:xsd/anyURI
      "https://www.statcan.gc.ca/en/subjects-start/prices_and_price_indexes/consumer_price_indexes"}},
   :db/ident :fibo-ind-ei-caei/CanadianConsumerPriceIndex,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/"},
   :rdfs/label "Canadian consumer price index",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-cxtdsg/appliesTo,
      :owl/someValuesFrom :fibo-ind-ei-caei/CanadianHouseholdsConsumersUniverse,
      :rdf/type           :owl/Restriction}
     {:owl/hasValue   :fibo-ind-ei-caei/StatisticsCanada,
      :owl/onProperty :fibo-be-fct-pub/isPublishedBy,
      :rdf/type       :owl/Restriction} :fibo-ind-ei-ei/ConsumerPriceIndex
     {:owl/hasValue   :fibo-ind-ei-caei/CanadianStatisticsPublisher,
      :owl/onProperty :fibo-be-fct-pub/hasPublisher,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :cmns-qtu/hasArgument,
      :owl/someValuesFrom :fibo-ind-ei-ei/FixedBasket,
      :rdf/type           :owl/Restriction}
     {:owl/onClass    :fibo-ind-ei-caei/CanadianHouseholdsConsumersUniverse,
      :owl/onProperty :cmns-qtu/hasArgument,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "economic indicator representing a measure of changes over time in the prices of a fixed basket of consumer goods and services that Canadian private households consume"})

(def CanadianHouseholdsConsumersUniverse
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "http://www.statcan.gc.ca/pub/62-553-x/62-553-x2015001-eng.pdf"},
   :db/ident :fibo-ind-ei-caei/CanadianHouseholdsConsumersUniverse,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/"},
   :rdfs/label "Canadian households consumers universe",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-col/hasMember,
      :owl/someValuesFrom {:owl/onProperty     :cmns-rlcmp/playsRole,
                           :owl/someValuesFrom :fibo-ind-ei-ei/UltimateConsumer,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction}
     :fibo-ind-ei-ei/CivilianNonInstitutionalPopulation
     {:owl/onProperty     :cmns-cxtdsg/isApplicableIn,
      :owl/someValuesFrom :fibo-ind-ei-ei/Household,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "a statistical universe consisting of all private households in Canada, with the exception of soldiers on military bases, people living on First Nations reserves, institutionalized persons, and households living in the rural areas of the three northern territories"})

(def CanadianProducerPriceIndex
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "http://www23.statcan.gc.ca/imdb-bmdi/pub/indexth-eng.htm"},
   :cmns-av/explanatoryNote
   "Note that Canada does not produce a high level, cross industry PPI per se. Canadian PPIs are published by industry sector. Three of the most important are captured in the union defined herein, which may be expanded over time to integrate others, as needed.",
   :db/ident :fibo-ind-ei-caei/CanadianProducerPriceIndex,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/"},
   :rdfs/label "Canadian producer price index",
   :rdfs/subClassOf #{:fibo-ind-ei-ei/ProducerPriceIndex
                      {:owl/hasValue   :fibo-ind-ei-caei/StatisticsCanada,
                       :owl/onProperty :fibo-be-fct-pub/isPublishedBy,
                       :rdf/type       :owl/Restriction}
                      {:owl/hasValue
                       :fibo-ind-ei-caei/CanadianStatisticsPublisher,
                       :owl/onProperty :fibo-be-fct-pub/hasPublisher,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty :cmns-cxtdsg/appliesTo,
                       :owl/someValuesFrom
                       {:owl/unionOf [:fibo-ind-ei-caei/IndustrialProductsSector
                                      :fibo-ind-ei-caei/NewHousingSector
                                      :fibo-ind-ei-caei/RawMaterialsSector],
                        :rdf/type    :owl/Class},
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "an economic indicator representing a measure of the change over time in the prices of a fixed-basket of domestic producer goods and services"})

(def CanadianStatisticsPublisher
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "http://www.statcan.gc.ca/eng/about/mandate/"},
   :cmns-rlcmp/isPlayedBy :fibo-ind-ei-caei/StatisticsCanada,
   :db/ident :fibo-ind-ei-caei/CanadianStatisticsPublisher,
   :rdf/type #{:fibo-ind-ei-ei/StatisticalInformationPublisher
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/"},
   :rdfs/label "Canadian statistics publisher",
   :skos/definition
   "individual representing the functional entity that is the primary publisher of statistical information for the Canadian Government"})

(def IndustrialProductsSector
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "http://www23.statcan.gc.ca/imdb/p2SV.pl?Function=getSurvey&SDDS=2318"},
   :db/ident :fibo-ind-ei-caei/IndustrialProductsSector,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/"},
   :rdfs/label "industrial products sector",
   :rdfs/subClassOf :fibo-fnd-arr-cls/IndustrySectorClassifier,
   :skos/definition
   "a classifier for a sector of the economy used for price indices focused on major commodities sold by manufacturers in Canada"})

(def NewHousingSector
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "http://www23.statcan.gc.ca/imdb/p2SV.pl?Function=getSurvey&SDDS=2310"},
   :db/ident :fibo-ind-ei-caei/NewHousingSector,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/"},
   :rdfs/label "new housing sector",
   :rdfs/subClassOf :fibo-fnd-arr-cls/IndustrySectorClassifier,
   :skos/definition
   "a classifier for a sector of the economy used for price indices focused on contractors' selling prices of new residential houses, where detailed specifications pertaining to each house remain the same between two consecutive periods"})

(def RawMaterialsSector
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "http://www23.statcan.gc.ca/imdb/p2SV.pl?Function=getSurvey&SDDS=2306"},
   :db/ident :fibo-ind-ei-caei/RawMaterialsSector,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/"},
   :rdfs/label "raw materials sector",
   :rdfs/subClassOf :fibo-fnd-arr-cls/IndustrySectorClassifier,
   :skos/definition
   "a classifier used for price indices related to raw materials purchased by industries in Canada for further processing"})

(def StatisticsCanada
  {:cmns-av/abbreviation "StatCan",
   :cmns-av/adaptedFrom {:xsd/anyURI
                         "http://www.statcan.gc.ca/eng/about/mandate"},
   :cmns-col/isPartOf :fibo-be-ge-caj/GovernmentOfCanada,
   :db/ident :fibo-ind-ei-caei/StatisticsCanada,
   :fibo-fnd-plc-loc/hasCoverageArea :lcc-3166-1/Canada,
   :rdf/type #{:fibo-be-ge-ge/GovernmentAgency :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "Statistique Canada"}
                 {:rdf/language "en",
                  :rdf/value    "Statistics Canada"}},
   :skos/definition
   "individual representing Statistics Canada, a government agency mandated to collect, compile, analyse, abstract and publish statistical information relating to the commercial, industrial, financial, social, economic and general activities and condition of the people of Canada"})

(def urn:uuid:a90e4e6f-50c0-5419-96e5-109765d1c369
  {:cmns-av/copyright
   #{"Copyright (c) 2016-2024 EDM Council, Inc."
     "Copyright (c) 2016-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology provides specific parameters which make up the various types of market economic indicators applicable to the Canadian economy.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Places/Locations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/FunctionalEntities/Publishers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/EconomicIndicators/EconomicIndicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Arrangements/ClassificationSchemes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Canadian Economic Indicators Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators.rdf version of this ontology was revised to correct out of date links."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators.rdf version of this ontology was revised to eliminate duplication with concepts in LCC and merge countries with locations in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators.rdf version of this ontology was added to the IND specification per the issue resolutions identified in the FIBO IND 1.0 FTF 3 report."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators.rdf version of this ontology was revised per the FIBO 2.0 RFC."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators.rdf version of this ontology was revised to reflect the new hasCoverageArea property in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators.rdf version of this ontology was revised to correct a datatype on an explanatory note and merge statistical information publisher with economic indicators."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/"})