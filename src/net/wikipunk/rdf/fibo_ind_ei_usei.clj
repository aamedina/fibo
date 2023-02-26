(ns net.wikipunk.rdf.fibo-ind-ei-usei
  "This ontology provides specific parameters which make up the various types of market economic indicators applicable to the American economy."
  {:cmns-av/copyright ["Copyright (c) 2016-2023 EDM Council, Inc."
                       "Copyright (c) 2016-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators/",
   :dcterms/abstract
   "This ontology provides specific parameters which make up the various types of market economic indicators applicable to the American economy.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/GovernmentEntities/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/EconomicIndicators/EconomicIndicators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/Publishers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-fct-pub"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
    "fibo-be-ge-ge"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/",
    "fibo-be-ge-usj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/",
    "fibo-fbc-fct-ra"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
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
    "fibo-ind-ei-ei"
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/",
    "fibo-ind-ei-usei"
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-ind-ei-usei",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators/",
   :rdfs/label "American Economic Indicators Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators.rdf version of this ontology was revised to correct out of date links."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators.rdf version of this ontology was revised to eliminate duplication of concepts in LCC, merge countries with locations in FND, and eliminate a redundant superclass declaration on UrbanConsumerPriceIndex."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators.rdf version of this ontology was added to the IND specification per the issue resolutions identified in the FIBO IND 1.0 FTF 3 report."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators.rdf version of this ontology was revised to merge statistical information publisher with economic indicators."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators.rdf version of this ontology was revised to reflect the new hasCoverageArea property and migration of statistical measures in FND."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators.rdf version of this ontology was revised per the FIBO 2.0 RFC."]})

(def AmericanStatisticsPublisher
  "statistical information publisher comprised of the government agencies and departments that publish statistical information on behalf of the U.S. Federal Government"
  {:db/ident :fibo-ind-ei-usei/AmericanStatisticsPublisher,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators/",
   :rdfs/label "American statistics publisher",
   :rdfs/subClassOf :fibo-ind-ei-ei/StatisticalInformationPublisher,
   :skos/definition
   "statistical information publisher comprised of the government agencies and departments that publish statistical information on behalf of the U.S. Federal Government",
   :skos/example
   "Examples of American statistical information publishers include the Department of Commerce, Bureau of Economic Analysis (Commerce), Census Bureau (Commerce), Bureau of Labor Statistics (Labor), Department of the Treasury, and the Federal Reserve Board, among others."})

(def BureauOfLaborStatistics
  "the Bureau of Labor Statistics, the principal Federal agency responsible for measuring labor market activity, working conditions, and price changes in the economy"
  {:cmns-av/abbreviation "BLS",
   :cmns-av/adaptedFrom "http://www.bls.gov/bls/infohome.htm",
   :cmns-av/explanatoryNote
   "Its mission is to collect, analyze, and disseminate essential economic information to support public and private decision-making. As an independent statistical agency, BLS serves its diverse user communities by providing products and services that are objective, timely, accurate, and relevant.",
   :db/ident :fibo-ind-ei-usei/BureauOfLaborStatistics,
   :fibo-fnd-plc-loc/hasCoverageArea :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-cr/isPartOf :fibo-ind-ei-usei/UnitedStatesDepartmentOfLabor,
   :rdf/type [:owl/NamedIndividual :fibo-be-ge-ge/GovernmentAgency],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators/",
   :rdfs/label "Bureau of Labor Statistics",
   :rdfs/seeAlso ["http://www.bls.gov/"],
   :skos/definition
   "the Bureau of Labor Statistics, the principal Federal agency responsible for measuring labor market activity, working conditions, and price changes in the economy"})

(def ConsumerExpenditureSurvey
  "statistical program conducted on a regular basis that provides information on the buying habits of consumers, including data on their expenditures, income, and consumer unit (families and single consumers) characteristics"
  {:cmns-av/adaptedFrom "http://www.bls.gov/cex/",
   :db/ident :fibo-ind-ei-usei/ConsumerExpenditureSurvey,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators/",
   :rdfs/label "consumer expenditure survey",
   :rdfs/subClassOf :fibo-fnd-utl-alx/StatisticalProgram,
   :skos/definition
   "statistical program conducted on a regular basis that provides information on the buying habits of consumers, including data on their expenditures, income, and consumer unit (families and single consumers) characteristics"})

(def CurrentEmploymentStatistics
  "survey conducted on a regular basis that presents analytical information related to businesses and government agencies, in order to provide detailed industry data on employment, hours, and earnings of workers"
  {:cmns-av/adaptedFrom "http://www.bls.gov/ces/",
   :db/ident :fibo-ind-ei-usei/CurrentEmploymentStatistics,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators/",
   :rdfs/label "current employment statistics",
   :rdfs/subClassOf :fibo-fnd-utl-alx/StatisticalProgram,
   :skos/definition
   "survey conducted on a regular basis that presents analytical information related to businesses and government agencies, in order to provide detailed industry data on employment, hours, and earnings of workers"})

(def CurrentPopulationSurvey
  "survey conducted on a regular basis that presents analytical information related to the general population of a given statistical area with respect to labor force, employment, unemployment, persons not in the labor force, hours of work, earnings, and other demographic and labor force characteristics"
  {:cmns-av/adaptedFrom "http://www.bls.gov/cps/",
   :db/ident :fibo-ind-ei-usei/CurrentPopulationSurvey,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators/",
   :rdfs/label "current population survey",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fbc-fct-ra/specifies,
                      :owl/someValuesFrom
                      :fibo-ind-ei-ei/CivilianNonInstitutionalPopulation,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/StatisticalProgram],
   :skos/definition
   "survey conducted on a regular basis that presents analytical information related to the general population of a given statistical area with respect to labor force, employment, unemployment, persons not in the labor force, hours of work, earnings, and other demographic and labor force characteristics"})

(def EmploymentSituationEstablishmentSurvey
  "survey conducted on a regular basis that presents analytical information related to the labor force of a given statistical area, surveyed with respect to businesses, and is, for the most part, seasonally adjusted"
  {:cmns-av/adaptedFrom
   "U.S. Bureau of Labor Statistics and Statistics Canada reference definitions - https://wiki.edmcouncil.org/pages/viewpage.action?pageId=6358041",
   :db/ident :fibo-ind-ei-usei/EmploymentSituationEstablishmentSurvey,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators/",
   :rdfs/label "employment situation establishment survey",
   :rdfs/seeAlso ["https://www.bls.gov/news.release/empsit.tn.htm"],
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/hasContext,
                      :owl/someValuesFrom :fibo-ind-ei-ei/Establishment,
                      :rdf/type           :owl/Restriction}
                     :fibo-ind-ei-usei/EmploymentSituationSurvey],
   :skos/definition
   "survey conducted on a regular basis that presents analytical information related to the labor force of a given statistical area, surveyed with respect to businesses, and is, for the most part, seasonally adjusted"})

(def EmploymentSituationHouseholdSurvey
  "a survey conducted on a regular basis that presents analytical information related to the labor force of a given statistical area, surveyed with respect to households, and is, for the most part, seasonally adjusted"
  {:cmns-av/adaptedFrom
   "U.S. Bureau of Labor Statistics and Statistics Canada reference definitions - https://wiki.edmcouncil.org/pages/viewpage.action?pageId=6358041",
   :db/ident :fibo-ind-ei-usei/EmploymentSituationHouseholdSurvey,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators/",
   :rdfs/label "employment situation household survey",
   :rdfs/seeAlso ["https://www.bls.gov/news.release/empsit.tn.htm"],
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/hasContext,
                      :owl/someValuesFrom :fibo-ind-ei-ei/Household,
                      :rdf/type           :owl/Restriction}
                     :fibo-ind-ei-usei/EmploymentSituationSurvey],
   :skos/definition
   "a survey conducted on a regular basis that presents analytical information related to the labor force of a given statistical area, surveyed with respect to households, and is, for the most part, seasonally adjusted"})

(def EmploymentSituationSurvey
  "a survey conducted on a regular basis that presents analytical information focused on the employment characteristics of a given statistical area"
  {:cmns-av/adaptedFrom "http://www.bls.gov/opub/reports/about.htm",
   :db/ident :fibo-ind-ei-usei/EmploymentSituationSurvey,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators/",
   :rdfs/label "employment situation survey",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :fibo-ind-ei-ei/isSeasonallyAdjusted,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     :fibo-ind-ei-usei/CurrentPopulationSurvey
                     :fibo-ind-ei-usei/CurrentEmploymentStatistics],
   :skos/definition
   "a survey conducted on a regular basis that presents analytical information focused on the employment characteristics of a given statistical area"})

(def PointOfPurchaseSurvey
  "a program conducted on a regular basis that provides information on purchases of various items and services by consumers"
  {:cmns-av/adaptedFrom "http://www.bls.gov/respondents/cpi/tpops/",
   :db/ident :fibo-ind-ei-usei/PointOfPurchaseSurvey,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators/",
   :rdfs/label "point of purchase survey",
   :rdfs/subClassOf :fibo-fnd-utl-alx/StatisticalProgram,
   :skos/definition
   "a program conducted on a regular basis that provides information on purchases of various items and services by consumers"})

(def USProducerPriceIndex
  "an economic indicator representing a measure of the change over time in the selling prices received by domestic producers for their output"
  {:cmns-av/adaptedFrom "http://www.bls.gov/ppi/",
   :db/ident :fibo-ind-ei-usei/USProducerPriceIndex,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators/",
   :rdfs/label "U.S. producer price index",
   :rdfs/subClassOf [{:owl/onProperty :fibo-be-fct-pub/hasPublisher,
                      :owl/someValuesFrom
                      :fibo-ind-ei-usei/AmericanStatisticsPublisher,
                      :rdf/type :owl/Restriction}
                     {:owl/hasValue   :fibo-ind-ei-usei/BureauOfLaborStatistics,
                      :owl/onProperty :fibo-be-fct-pub/isPublishedBy,
                      :rdf/type       :owl/Restriction}
                     :fibo-ind-ei-ei/ProducerPriceIndex],
   :skos/definition
   "an economic indicator representing a measure of the change over time in the selling prices received by domestic producers for their output"})

(def UnitedStatesDepartmentOfLabor
  "individual representing the U.S. Department of Labor, a government department whose mission is to foster, promote, and develop the welfare of the wage earners, job seekers, and retirees of the United States; improve working conditions; advance opportunities for profitable employment; and assure work-related benefits and rights"
  {:cmns-av/abbreviation "DOL",
   :cmns-av/adaptedFrom "https://www.dol.gov/general/aboutdol",
   :db/ident :fibo-ind-ei-usei/UnitedStatesDepartmentOfLabor,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/UnitedStatesJurisdiction,
   :fibo-fnd-plc-loc/hasCoverageArea :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-cr/isPartOf :fibo-be-ge-usj/UnitedStatesGovernment,
   :rdf/type [:fibo-be-ge-ge/GovernmentDepartment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators/",
   :rdfs/label "United States Department of Labor",
   :rdfs/seeAlso ["https://www.dol.gov/"],
   :skos/definition
   "individual representing the U.S. Department of Labor, a government department whose mission is to foster, promote, and develop the welfare of the wage earners, job seekers, and retirees of the United States; improve working conditions; advance opportunities for profitable employment; and assure work-related benefits and rights"})

(def UrbanConsumerPriceIndex
  "an economic indicator representing a measure of the average change over time in the prices paid by urban consumers for a market basket of consumer goods and services"
  {:cmns-av/abbreviation "CPI-U",
   :cmns-av/adaptedFrom "http://www.bls.gov/cpi/",
   :db/ident :fibo-ind-ei-usei/UrbanConsumerPriceIndex,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators/",
   :rdfs/label "urban consumer price index",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-be-fct-pub/hasPublisher,
     :owl/someValuesFrom :fibo-ind-ei-usei/AmericanStatisticsPublisher,
     :rdf/type           :owl/Restriction}
    {:owl/hasValue   :fibo-ind-ei-usei/BureauOfLaborStatistics,
     :owl/onProperty :fibo-be-fct-pub/isPublishedBy,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/appliesTo,
     :owl/someValuesFrom :fibo-ind-ei-usei/UrbanConsumersUniverse,
     :rdf/type           :owl/Restriction}
    :fibo-ind-ei-ei/ConsumerPriceIndex
    {:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
     :owl/someValuesFrom :fibo-fbc-pas-fpas/Basket,
     :rdf/type           :owl/Restriction}
    {:owl/onClass    :fibo-ind-ei-usei/UrbanConsumersUniverse,
     :owl/onProperty :fibo-fnd-utl-alx/hasArgument,
     :owl/qualifiedCardinality 1,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   "an economic indicator representing a measure of the average change over time in the prices paid by urban consumers for a market basket of consumer goods and services"})

(def UrbanConsumersUniverse
  "a statistical universe for consumer expenditure surveys consisting of people within a household that make joint expenditure decisions"
  {:cmns-av/adaptedFrom
   "U.S. Bureau of Labor Statistics, http://www.bls.gov/cpi/",
   :cmns-av/explanatoryNote
   "In the United States, the CPI-U population, which covers about 88 percent of the U.S. population, covers households in all areas of the United States except people living in rural nonmetropolitan areas, in farm households, on military installations, in religious communities, and in institutions such as prisons and mental hospitals.",
   :db/ident :fibo-ind-ei-usei/UrbanConsumersUniverse,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators/",
   :rdfs/label "urban consumers universe",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-rel-rel/hasContext,
     :owl/someValuesFrom :fibo-ind-ei-usei/ConsumerExpenditureSurvey,
     :rdf/type           :owl/Restriction}
    :fibo-ind-ei-ei/CivilianNonInstitutionalPopulation
    {:owl/onProperty     :lcc-lr/hasMember,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-pty-rl/playsRole,
                          :owl/someValuesFrom :fibo-ind-ei-ei/UltimateConsumer,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/hasContext,
     :owl/someValuesFrom :fibo-ind-ei-usei/PointOfPurchaseSurvey,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   "a statistical universe for consumer expenditure surveys consisting of people within a household that make joint expenditure decisions"})