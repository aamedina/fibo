(ns net.wikipunk.rdf.fibo-ind-ei-ei
  {:cmns-av/copyright
   #{"Copyright (c) 2014-2024 EDM Council, Inc."
     "Copyright (c) 2014-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/EconomicIndicators/EconomicIndicators/",
   :dcterms/abstract
   "This ontology provides the parameters which make up the various types of market economic indicators, along with basic facts about these such as the economies or countries they apply to.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-qtu" "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-fct-fct"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities/",
    "fibo-be-fct-pub"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
    "fibo-be-ge-ge"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-aap-ppl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
    "fibo-fnd-arr-cls"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/",
    "fibo-fnd-arr-doc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-org-fm"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
    "fibo-fnd-pas-pas"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/",
    "fibo-fnd-plc-adr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/",
    "fibo-fnd-plc-loc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-alx"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-ei-ei"
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/FunctionalEntities/Publishers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/Indicators/Indicators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/ClassificationSchemes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/Addresses/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/AgentsAndPeople/People/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/FunctionalEntities/FunctionalEntities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Organizations/FormalOrganizations/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/EconomicIndicators/EconomicIndicators/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-ind-ei-ei",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/",
   :rdfs/label "Economic Indicators Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified to fix spelling errors."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified to eliminate references to external dictionary sites that no longer resolve, added a synonym to fixed basket and eliminated the restriction with respect to date period, which is not the primary concern of a fixed basket, revised the name of the 'goods or services population' to 'goods population' to eliminate a hygiene issue and reflect the synonym of 'basket of goods', and merged the statistical information publisher class from economic indicator publishers into this ontology."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified to use hasCoverageArea rather than appliesTo in the restriction on an economic indicator relating it to a statistical area, to reflect use of actualExpression as an annotation rather than datatype property, and to migrate the general statistics concepts to FND (deprecated herein)."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified per the issue resolutions identified in the FIBO IND 1.0 FTF 3 report."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified to address text formatting hygiene issues and clean up external links."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified to replace additional content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified to use natural person rather than legally capable person."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified to eliminate duplicatation with concepts in LCC and merge countries with locations in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified to reflect the change in name and definition of numeric index to numeric index value in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified to add definitions for alternative unemployment calculations and correct a circular property definition."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified per the FIBO 2.0 RFC. Primary changes include the addition of a number of statistical measures (mean, total, etc.) and their use in existing and new indicators, and the addition of several more economic indicators."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified to eliminate the restriction on economic indicator (and its subclasses) that it has an indicator value - the restriction should be on the quantity value such that the value refers to the indicator it represents, and to revise the definition of civilian non-institutional population to correctly represent civilian non-institutional person (added)."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified per the issue resolutions identified in the FIBO IND 1.0 FTF 1 report."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"})

(def AverageDailyEarnings
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "http://stats.oecd.org/glossary/detail.asp?ID=4360"},
   :db/ident :fibo-ind-ei-ei/AverageDailyEarnings,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "average daily earnings",
   :rdfs/subClassOf #{{:owl/hasValue   :fibo-ind-ei-ei/Daily,
                       :owl/onProperty :fibo-fnd-utl-alx/hasReferencePeriod,
                       :rdf/type       :owl/Restriction}
                      :fibo-ind-ei-ei/AverageEarnings},
   :skos/definition
   "a measure of the average daily wage an employee makes over the reporting period"})

(def AverageEarnings
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "http://stats.oecd.org/glossary/detail.asp?ID=4360"},
   :cmns-av/explanatoryNote
   "Average earnings are typically calculated on an hourly, daily, weekly, or monthly basis. They may be expressed as an amount of money or in terms of a percent change with respect to a prior period, depending on the jurisdiction and report.",
   :db/ident :fibo-ind-ei-ei/AverageEarnings,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "average earnings",
   :rdfs/subClassOf #{{:owl/onClass :fibo-fnd-dt-fd/ExplicitRecurrenceInterval,
                       :owl/onProperty :fibo-fnd-utl-alx/hasReferencePeriod,
                       :owl/qualifiedCardinality 1,
                       :rdf/type :owl/Restriction}
                      :fibo-ind-ei-ei/EconomicIndicator :cmns-qtu/Expression},
   :skos/definition
   "a measure of the average wage an hourly or salaried worker makes in a given period of time"})

(def AverageHourlyEarnings
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "http://stats.oecd.org/glossary/detail.asp?ID=4360"},
   :db/ident :fibo-ind-ei-ei/AverageHourlyEarnings,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "average hourly earnings",
   :rdfs/subClassOf #{:fibo-ind-ei-ei/AverageEarnings
                      {:owl/hasValue   :fibo-ind-ei-ei/Hourly,
                       :owl/onProperty :fibo-fnd-utl-alx/hasReferencePeriod,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "a measure of the average hourly wage an employee makes over the reporting period"})

(def AverageMonthlyEarnings
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "http://stats.oecd.org/glossary/detail.asp?ID=4360"},
   :db/ident :fibo-ind-ei-ei/AverageMonthlyEarnings,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "average monthly earnings",
   :rdfs/subClassOf #{{:owl/hasValue   :fibo-ind-ei-ei/Monthly,
                       :owl/onProperty :fibo-fnd-utl-alx/hasReferencePeriod,
                       :rdf/type       :owl/Restriction}
                      :fibo-ind-ei-ei/AverageEarnings},
   :skos/definition
   "a measure of the average monthly wage an employee makes over the reporting period"})

(def AverageWeeklyEarnings
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "http://stats.oecd.org/glossary/detail.asp?ID=4360"},
   :db/ident :fibo-ind-ei-ei/AverageWeeklyEarnings,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "average weekly earnings",
   :rdfs/subClassOf #{{:owl/hasValue   :fibo-ind-ei-ei/Weekly,
                       :owl/onProperty :fibo-fnd-utl-alx/hasReferencePeriod,
                       :rdf/type       :owl/Restriction}
                      :fibo-ind-ei-ei/AverageEarnings},
   :skos/definition
   "a measure of the average weekly wage an employee makes over the reporting period"})

(def CapitalLaborEnergyMaterialsMultifactorProductivity
  {:cmns-av/abbreviation "KLEMS-MFP",
   :cmns-av/adaptedFrom
   {:xsd/anyURI "http://www.oecd.org/std/productivity-stats/2352458.pdf"},
   :cmns-av/explanatoryNote
   "Shows the time profile of how productively combined inputs are used to generate gross output. Conceptually, the KLEMS productivity measure captures disembodied technical change. In practice, it reflects also efficiency change, economies of scale, variations in capacity utilisation and measurement errors.",
   :cmns-av/synonym "KLEMS multifactor productivity",
   :db/ident :fibo-ind-ei-ei/CapitalLaborEnergyMaterialsMultifactorProductivity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "capital-labor-energy-materials multifactor productivity",
   :rdfs/subClassOf :fibo-ind-ei-ei/Productivity,
   :skos/definition
   "a ratio of a quantity index of gross output to a quantity index of combined inputs"})

(def CapitalLaborMultifactorProductivityValueAdded
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "http://www.oecd.org/std/productivity-stats/2352458.pdf"},
   :cmns-av/explanatoryNote
   "Capital-labour MFP indices show the time profile of how productively combined labour and capital inputs are used to generate value added. Conceptually, capital-labour productivity is not, in general, an accurate measure of technical change. It is, however, an indicator of an industry's capacity to contribute to economy-wide growth of income per unit of primary input. In practice, the measure reflects the combined effects of disembodied technical change, economies of scale, efficiency change, variations in capacity utilisation and measurement errors.",
   :db/ident :fibo-ind-ei-ei/CapitalLaborMultifactorProductivityValueAdded,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label
   "capital-labor multifactor productivity (MFP), based on value added",
   :rdfs/subClassOf :fibo-ind-ei-ei/Productivity,
   :skos/definition
   "a ratio of a quantity index of value added to a quantity index of combined labor and capital input"})

(def CapitalProductivityValueAdded
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "http://www.oecd.org/std/productivity-stats/2352458.pdf"},
   :cmns-av/explanatoryNote
   #{"Changes in capital productivity indicate the extent to which output growth can be achieved with lower welfare costs in the form of foregone consumption."
     "The capital productivity index shows the time profile of how productively capital is used to generate value added. Capital productivity reflects the joint influence of labour, intermediate inputs, technical change, efficiency change, economies of scale, capacity utilisation and measurement errors."},
   :db/ident :fibo-ind-ei-ei/CapitalProductivityValueAdded,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "capital productivity, based on value added",
   :rdfs/subClassOf :fibo-ind-ei-ei/Productivity,
   :skos/definition
   "a ratio of a quantity index of value added to a quantity index of capital input"})

(def Civilian
  {:cmns-av/adaptedFrom
   {:rdf/value
    "U.S. Bureau of Labor Statistics and Statistics Canada reference definitions - https://wiki.edmcouncil.org/pages/viewpage.action?pageId=6358041"},
   :db/ident :fibo-ind-ei-ei/Civilian,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "civilian",
   :rdfs/subClassOf :fibo-be-le-lp/LegallyCompetentNaturalPerson,
   :skos/definition
   "a person that is not a member of the military (i.e., that is not on active duty)"})

(def CivilianLaborForce
  {:cmns-av/adaptedFrom
   {:rdf/value
    "U.S. Bureau of Labor Statistics and Statistics Canada reference definitions - https://wiki.edmcouncil.org/pages/viewpage.action?pageId=6358041"},
   :db/ident :fibo-ind-ei-ei/CivilianLaborForce,
   :owl/disjointWith :fibo-ind-ei-ei/PopulationNotInLaborForce,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "civilian labor force",
   :rdfs/subClassOf :fibo-ind-ei-ei/CivilianNonInstitutionalPopulation,
   :skos/definition
   "subset of the civilian, non-institutional population considered to be part of the labor force during a given reporting period"})

(def CivilianLaborForceParticipationRate
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.bls.gov/cps/definitions.htm#lfpr"},
   :cmns-av/explanatoryNote
   "The labor force participation rate is the percentage of the population that is either employed or unemployed (that is, either working or actively seeking work).",
   :cmns-qtu/describesActualExpression
   "civilian labor force ÷ civilian non-institutional population",
   :db/ident :fibo-ind-ei-ei/CivilianLaborForceParticipationRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "civilian labor force participation rate",
   :rdfs/subClassOf #{{:owl/onProperty :cmns-qtu/hasArgument,
                       :owl/someValuesFrom
                       :fibo-ind-ei-ei/CivilianNonInstitutionalPopulation,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                       :owl/someValuesFrom :fibo-ind-ei-ei/CivilianLaborForce,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-qtu/hasArgument,
                       :owl/someValuesFrom :fibo-ind-ei-ei/CivilianLaborForce,
                       :rdf/type           :owl/Restriction}
                      :fibo-ind-ei-ei/EconomicIndicator :cmns-qtu/Expression},
   :skos/definition
   "economic indicator representing the rate of participation the labor force of a given economy for some specified period"})

(def CivilianNonInstitutionalPerson
  {:cmns-av/adaptedFrom
   {:rdf/value
    "U.S. Bureau of Labor Statistics and Statistics Canada reference definitions - https://wiki.edmcouncil.org/pages/viewpage.action?pageId=6358041"},
   :cmns-av/explanatoryNote
   "The working-age population is the total population in a region, within a set range of ages, that is considered to be able and likely to work. The working-age population measure is used to give an estimate of the total number of potential workers within an economy. For example, in the U.S., it is 16, whereas in Canada it is 15.",
   :db/ident :fibo-ind-ei-ei/CivilianNonInstitutionalPerson,
   :owl/disjointWith :fibo-ind-ei-ei/InstitutionalPerson,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "civilian non-institutional person",
   :rdfs/seeAlso
   {:xsd/anyURI
    "http://www.investopedia.com/terms/w/working-age-population.asp"},
   :rdfs/subClassOf #{:fibo-ind-ei-ei/Civilian
                      :fibo-fnd-aap-ppl/LegalWorkingAgePerson},
   :skos/definition
   "legal working-age person that does not live in an institution (for example, a correctional facility, long-term care hospital, or nursing home), and is not on active military duty"})

(def CivilianNonInstitutionalPopulation
  {:cmns-av/adaptedFrom
   {:rdf/value
    "U.S. Bureau of Labor Statistics and Statistics Canada reference definitions - https://wiki.edmcouncil.org/pages/viewpage.action?pageId=6358041"},
   :db/ident :fibo-ind-ei-ei/CivilianNonInstitutionalPopulation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "civilian non-institutional population",
   :rdfs/subClassOf #{:fibo-fnd-utl-alx/StatisticalUniverse
                      {:owl/onProperty :cmns-col/hasMember,
                       :owl/someValuesFrom
                       :fibo-ind-ei-ei/CivilianNonInstitutionalPerson,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "statistical universe consisting of people of a certain age who reside in a given region, do not live in institutions (for example, correctional facilities, long-term care hospitals, and nursing homes), and are not on active military duty",
   :skos/scopeNote
   "The civilian non-institutional population is typically reported in thousands."})

(def CombinedStatisticalArea
  {:cmns-av/abbreviation "CSA",
   :cmns-av/adaptedFrom
   #{{:xsd/anyURI "https://en.wikipedia.org/wiki/Combined_statistical_area"}
     {:xsd/anyURI
      "https://www.federalregister.gov/documents/2021/07/16/2021-15159/2020-standards-for-delineating-core-based-statistical-areas"}
     {:xsd/anyURI
      "https://obamawhitehouse.archives.gov/sites/default/files/omb/assets/fedreg_2010/06282010_metro_standards-Complete.pdf"}},
   :cmns-av/explanatoryNote
   "These areas that combine retain their own designations as metropolitan or micropolitan statistical areas within the larger combined statistical area.",
   :db/ident :fibo-ind-ei-ei/CombinedStatisticalArea,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "combined statistical area",
   :rdfs/subClassOf #{:fibo-ind-ei-ei/GovernmentSpecifiedStatisticalArea
                      {:owl/minQualifiedCardinality 2,
                       :owl/onClass
                       :fibo-ind-ei-ei/GovernmentSpecifiedStatisticalArea,
                       :owl/onProperty :cmns-col/comprises,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "combination of adjacent metropolitan and micropolitan areas with economic ties measured by commuting patterns"})

(def ConsumerPriceIndex
  {:cmns-av/abbreviation "CPI",
   :cmns-av/adaptedFrom
   #{{:xsd/anyURI "http://unstats.un.org/unsd/nationalaccount/docs/SNA2008.pdf"}
     {:xsd/anyURI "http://www.ilo.org/public/english/bureau/stat/guides/cpi/"}},
   :db/ident :fibo-ind-ei-ei/ConsumerPriceIndex,
   :owl/disjointWith #{:fibo-ind-ei-ei/InflationRate
                       :fibo-ind-ei-ei/CivilianLaborForceParticipationRate
                       :fibo-ind-ei-ei/GrossDomesticProduct
                       :fibo-ind-ei-ei/UnemploymentRate
                       :fibo-ind-ei-ei/EmploymentPopulationRatio},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "consumer price index",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-qtu/hasArgument,
      :owl/someValuesFrom :fibo-ind-ei-ei/CivilianNonInstitutionalPopulation,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-qtu/hasArgument,
      :owl/someValuesFrom :fibo-ind-ei-ei/FixedBasket,
      :rdf/type           :owl/Restriction} :fibo-ind-ei-ei/EconomicIndicator
     :cmns-qtu/Expression
     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
      :owl/someValuesFrom :fibo-ind-ei-ei/CivilianNonInstitutionalPopulation,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "economic indicator representing a measure of the change over time in the prices of consumer goods and services that households consume"})

(def Daily
  {:cmns-dt/hasDurationValue "P1D",
   :db/ident :fibo-ind-ei-ei/Daily,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-dt-fd/ExplicitRecurrenceInterval},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "daily",
   :skos/definition "an explicit recurrence interval of one day, or 24 hours"})

(def DiscouragedWorkerPopulation
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.bls.gov/news.release/empsit.t15.htm"},
   :db/ident :fibo-ind-ei-ei/DiscouragedWorkerPopulation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "discouraged worker population",
   :rdfs/subClassOf :fibo-ind-ei-ei/MarginallyAttachedPopulation,
   :skos/definition
   "subset of the marginally attached population that have given a job-market related reason for not currently looking for work"})

(def EconomicIndicator
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Barron's Dictionary of Business and Economic Terms, Fifth Edition, 2012"},
   :cmns-av/explanatoryNote
   "The two main features of any indicator are the regularity with which they are measured and published, and the fact that they are comparable from one release to the next.",
   :db/ident :fibo-ind-ei-ei/EconomicIndicator,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "economic indicator",
   :rdfs/subClassOf
   #{{:owl/allValuesFrom :xsd/boolean,
      :owl/onProperty    :fibo-ind-ei-ei/isSeasonallyAdjusted,
      :rdf/type          :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :cmns-dt/Date,
      :owl/onProperty :fibo-fnd-utl-alx/hasReleaseDate,
      :rdf/type       :owl/Restriction} :fibo-fnd-utl-alx/ScopedMeasure
     {:owl/allValuesFrom :cmns-dt/Date,
      :owl/onProperty    :fibo-ind-ei-ei/hasSeriesOrigin,
      :rdf/type          :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onDataRange :cmns-dt/CombinedDateTime,
      :owl/onProperty  :fibo-fnd-utl-alx/hasReleaseDateTime,
      :rdf/type        :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-arr-doc/hasReportingPeriod,
      :owl/someValuesFrom :cmns-dt/ExplicitDatePeriod,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-plc-loc/hasCoverageArea,
      :owl/someValuesFrom :fibo-ind-ei-ei/GovernmentSpecifiedStatisticalArea,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "statistical measure of economic activity that is regular and comparable in the context of a statistical area (region), used for analysis of economic performance and predictions of future performance",
   :skos/example
   "Example indicators include the average work week, weekly claims for unemployment insurance, new orders, vendor performance, stock prices, and changes in the money supply."})

(def EmployedPopulation
  {:cmns-av/adaptedFrom
   {:rdf/value
    "U.S. Bureau of Labor Statistics and Statistics Canada reference definitions - https://wiki.edmcouncil.org/pages/viewpage.action?pageId=6358041"},
   :cmns-av/explanatoryNote
   "There are a number of distinctions with respect to how individuals are counted from country to country, including whether or not they are considered employed if they are on unpaid leave for some reason, and whether or not they are counted multiple times if they have more than one paying job.",
   :db/ident :fibo-ind-ei-ei/EmployedPopulation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "employed population",
   :rdfs/subClassOf :fibo-ind-ei-ei/CivilianLaborForce,
   :skos/definition
   "a subset of the civilian labor force considered to be employed during the reporting period"})

(def EmployedPopulationPartTime
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "https://stats.oecd.org/Index.aspx?DatasetCode=STLABOUR"},
   :cmns-av/explanatoryNote
   #{"In the U.S., part-time workers are those who usually work fewer than 35 hours per week. See https://www.bls.gov/cps/definitions.htm for additional details."
     "The definition of part-time varies considerably from country to country according to the OECD. Classification may be based on (1) employee perception, (2) usual working hours, which is the most reliable measure, or (3) actual working hours, which varies due to holidays, illness, etc."},
   :cmns-av/synonym "population employed part-time",
   :db/ident :fibo-ind-ei-ei/EmployedPopulationPartTime,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "employed population part-time",
   :rdfs/subClassOf :fibo-ind-ei-ei/EmployedPopulation,
   :skos/definition
   "subset of the employed population that includes persons that are working fewer than 30 to 35 hours per week based on usual working hours"})

(def EmployedPopulationPartTimeForEconomicReasons
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI "https://stats.oecd.org/Index.aspx?DatasetCode=STLABOUR"}
     {:xsd/anyURI "https://www.bls.gov/cps/definitions.htm"}},
   :cmns-av/synonym #{"population employed part-time for economic reasons"
                      "involuntary part-time population"},
   :db/ident :fibo-ind-ei-ei/EmployedPopulationPartTimeForEconomicReasons,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "employed population part-time for economic reasons",
   :rdfs/subClassOf #{:fibo-ind-ei-ei/UnderemployedPopulation
                      :fibo-ind-ei-ei/EmployedPopulationPartTime},
   :skos/definition
   "subset of the employed population that includes persons that are working fewer than 30 to 35 hours per week due to slack work, unfavorable business conditions, inability to find full-time work, and seasonal declines in demand"})

(def EmployedPopulationPartTimeForNonEconomicReasons
  {:cmns-av/adaptedFrom {:xsd/anyURI "https://www.bls.gov/cps/definitions.htm"},
   :cmns-av/synonym "population employed part-time for non-economic reasons",
   :db/ident :fibo-ind-ei-ei/EmployedPopulationPartTimeForNonEconomicReasons,
   :owl/disjointWith
   :fibo-ind-ei-ei/EmployedPopulationPartTimeForEconomicReasons,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "employed population part-time for non-economic reasons",
   :rdfs/subClassOf :fibo-ind-ei-ei/EmployedPopulationPartTime,
   :skos/definition
   "subset of the employed population that includes persons that are working fewer than 30 to 35 hours per week due to illness or other health or medical limitations, childcare problems, family or personal obligations, being in school or training, retirement or Social Security limits on earnings, and having a job where full-time work is less than 35 hours"})

(def EmployedPopulationTemporarilyNotAtWork
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.bls.gov/news.release/empsit.t15.htm"},
   :cmns-av/explanatoryNote
   "This includes persons temporarily not at work because of illness or injury, holiday or vacation, strike or lockout, educational or training leave, maternity or parental leave, reduction in economic activity, temporary disorganisation or suspension of work due to such reasons as bad weather, mechanical or electrical breakdown, or shortage of raw materials or fuels, or other temporary absence with or without leave should be considered as in paid employment provided they had a formal job attachment.",
   :db/ident :fibo-ind-ei-ei/EmployedPopulationTemporarilyNotAtWork,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "employed population temporarily not at work",
   :rdfs/subClassOf :fibo-ind-ei-ei/EmployedPopulation,
   :skos/definition
   "subset of the employed population that includes persons that are temporarily absent from work for various reasons"})

(def EmploymentPopulationRatio
  {:cmns-qtu/describesActualExpression
   "employed population ÷ civilian non-institutional population",
   :db/ident :fibo-ind-ei-ei/EmploymentPopulationRatio,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "employment-population ratio",
   :rdfs/seeAlso {:xsd/anyURI "http://www.bls.gov/news.release/pdf/empsit.pdf"},
   :rdfs/subClassOf #{{:owl/onProperty :cmns-qtu/hasArgument,
                       :owl/someValuesFrom
                       :fibo-ind-ei-ei/CivilianNonInstitutionalPopulation,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty     :cmns-qtu/hasArgument,
                       :owl/someValuesFrom :fibo-ind-ei-ei/EmployedPopulation,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                       :owl/someValuesFrom :fibo-ind-ei-ei/EmployedPopulation,
                       :rdf/type           :owl/Restriction}
                      :fibo-ind-ei-ei/EconomicIndicator :cmns-qtu/Expression},
   :skos/definition
   "economic indicator representing the ratio of the employed population with respect to the overall civilian non-institutional population of a given economy for some specified period"})

(def Enterprise
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "http://www.bls.gov/opub/hom/glossary.htm#E"},
   :cmns-av/explanatoryNote
   "An enterprise (a private firm, government, or nonprofit organization) can consist of a single establishment or multiple establishments. All establishments in an enterprise may be classified in one industry (e.g., a chain), or they may be classified in different industries (e.g., a conglomerate).",
   :db/ident :fibo-ind-ei-ei/Enterprise,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "enterprise",
   :rdfs/subClassOf
   #{:fibo-be-fct-fct/FunctionalBusinessEntity :fibo-ind-ei-ei/InstitutionalUnit
     {:owl/unionOf [:fibo-fnd-pas-pas/Producer
                    :fibo-fnd-pas-pas/ServiceProvider],
      :rdf/type    :owl/Class}
     {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom :fibo-be-le-lp/LegalPerson,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-cls/isClassifiedBy,
      :owl/someValuesFrom :fibo-fnd-arr-cls/IndustrySectorClassifier,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
      :owl/someValuesFrom {:owl/unionOf [:fibo-fnd-pas-pas/Good
                                         :fibo-fnd-pas-pas/Service],
                           :rdf/type    :owl/Class},
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-col/hasConstituent,
      :owl/someValuesFrom :fibo-ind-ei-ei/Establishment,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "a functional business entity that produces and/or sells goods or services"})

(def EnterprisePopulation
  {:db/ident :fibo-ind-ei-ei/EnterprisePopulation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "enterprise population",
   :rdfs/subClassOf #{:fibo-fnd-utl-alx/StatisticalUniverse
                      {:owl/onProperty     :cmns-col/hasMember,
                       :owl/someValuesFrom :fibo-ind-ei-ei/Enterprise,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "a statistical universe consisting of enterprises designed for the purposes of supporting surveys such as those used as the basis for employment and producer price indices"})

(def Establishment
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI "http://www.bls.gov/opub/hom/glossary.htm#E"}
     {:xsd/anyURI "http://stats.oecd.org/glossary/detail.asp?ID=857"}
     {:xsd/anyURI "http://www.statcan.gc.ca/eng/concepts/units"}},
   :cmns-av/explanatoryNote
   "The physical location of a certain economic activity - for example, a factory, mine, store, or office. An individual establishment is generally classified by having one NAICS code associated with it for statistical purposes, whereas an enterprise may be classified by multiple NAICS codes. The statistical structure is defined based on the operating structure and the accounting data produced by that entity. A given location may only need to publish revenues, whereas an operating unit (establishment) has employment statistics, etc. An establishment is defined as a producing unit at a single geographical location at which or from which economic activity is conducted and for which, at a minimum, employment data are available. In the case of a home-based business, the actual physical location would be specified as two distinct institutional units - as a household from a personal living and consumer perspective and as an establishment / operating unit due to the statistics required of the business.",
   :db/ident :fibo-ind-ei-ei/Establishment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "establishment",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-ind-ei-ei/Enterprise,
                       :owl/onProperty :cmns-col/isConstituentOf,
                       :rdf/type       :owl/Restriction}
                      :fibo-ind-ei-ei/InstitutionalUnit
                      {:owl/onClass    :fibo-fnd-plc-adr/PhysicalAddress,
                       :owl/onProperty :fibo-fnd-plc-adr/hasAddress,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "an enterprise (or part of an enterprise) that operates from a single physical location"})

(def EstablishmentEmployment
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "http://stats.oecd.org/glossary/detail.asp?ID=780"},
   :cmns-av/explanatoryNote
   "Also included are salaried managers and salaried directors of incorporated enterprises. The total should include part-time workers and seasonal workers on the payroll, persons on short-term leave (sick leave, maternity leave, annual leave or vacation) and on strike, but not persons on indefinite leave, military leave or pension. \n\nExcluded are directors of incorporated enterprises and members of shareholders committees who are paid solely for their attendance at meetings, labour made available to the establishment by other units and charged for, such as contract workers paid through contractors, persons carrying out repair and maintenance work in the establishment on behalf of other units and all homeworkers.",
   :cmns-av/synonym "payroll employment",
   :db/ident :fibo-ind-ei-ei/EstablishmentEmployment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "establishment employment",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-cxtdsg/appliesTo,
      :owl/someValuesFrom :fibo-ind-ei-ei/EstablishmentPopulation,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-qtu/hasArgument,
      :owl/someValuesFrom :fibo-ind-ei-ei/EstablishmentPopulation,
      :rdf/type           :owl/Restriction} :fibo-ind-ei-ei/EconomicIndicator
     :cmns-qtu/Expression},
   :skos/definition
   "economic indicator representing the total number of persons who work in or for the establishment including working proprietors, active business partners and unpaid family workers, as well as persons working outside the establishment when paid by and under the control of the establishment, for example, sales representatives, outside service engineers and repair and maintenance personnel"})

(def EstablishmentPopulation
  {:db/ident :fibo-ind-ei-ei/EstablishmentPopulation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "establishment population",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-col/hasMember,
                       :owl/someValuesFrom :fibo-ind-ei-ei/Establishment,
                       :rdf/type           :owl/Restriction}
                      :fibo-ind-ei-ei/EnterprisePopulation},
   :skos/definition
   "a subset of the enterprise population focused on establishments"})

(def FixedBasket
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.imf.org/external/pubs/ft/ppi/2010/manual/ppi.pdf"},
   :cmns-av/synonym "basket of goods",
   :db/ident :fibo-ind-ei-ei/FixedBasket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "fixed basket",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-col/hasConstituent,
      :owl/someValuesFrom :fibo-ind-ei-ei/FixedBasketConstituent,
      :rdf/type           :owl/Restriction}
     :fibo-fnd-dt-fd/DatedStructuredCollection :fibo-fbc-pas-fpas/Basket},
   :skos/definition
   "basket of goods and services whose quantity and quality are held fixed for some period of time"})

(def FixedBasketConstituent
  {:db/ident :fibo-ind-ei-ei/FixedBasketConstituent,
   :owl/equivalentClass {:owl/onProperty     :cmns-col/isConstituentOf,
                         :owl/someValuesFrom :fibo-ind-ei-ei/FixedBasket,
                         :rdf/type           :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "fixed basket constituent",
   :rdfs/subClassOf #{:fibo-fnd-dt-fd/DatedCollectionConstituent
                      :fibo-fbc-pas-fpas/BasketConstituent
                      {:owl/unionOf [:fibo-fnd-pas-pas/Good
                                     :fibo-fnd-pas-pas/Service],
                       :rdf/type    :owl/Class}},
   :skos/definition "component of a fixed basket"})

(def FixedBasketPopulation
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.imf.org/external/pubs/ft/ppi/2010/manual/ppi.pdf"},
   :cmns-av/synonym #{"goods and/or services population"
                      "goods and services population"},
   :db/ident :fibo-ind-ei-ei/FixedBasketPopulation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "fixed basket population",
   :rdfs/subClassOf #{:fibo-fnd-utl-alx/StatisticalUniverse
                      {:owl/onProperty     :cmns-col/hasConstituent,
                       :owl/someValuesFrom {:owl/unionOf
                                            [:fibo-fnd-pas-pas/Good
                                             :fibo-fnd-pas-pas/Service],
                                            :rdf/type :owl/Class},
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "statistical universe consisting of specific goods and/or services designed for the purposes of supporting surveys such as those used as the basis for price indices"})

(def GovernmentSpecifiedStatisticalArea
  {:db/ident :fibo-ind-ei-ei/GovernmentSpecifiedStatisticalArea,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "government-specified statistical area",
   :rdfs/subClassOf #{:fibo-fnd-utl-alx/StatisticalArea
                      {:owl/onProperty     :fibo-fnd-rel-rel/isGovernedBy,
                       :owl/someValuesFrom :fibo-be-ge-ge/GovernmentBody,
                       :rdf/type           :owl/Restriction}},
   :skos/definition "statistical area defined by a government agency"})

(def GrossDomesticProduct
  {:cmns-av/abbreviation "GDP",
   :cmns-av/adaptedFrom
   #{{:xsd/anyURI "https://en.wikipedia.org/wiki/Gross_domestic_product"}
     {:rdf/value
      "BEA's Handbook of Methods for GDP and related national accounts, available at https://www.bea.gov/methodologies/index.htm#national_meth"}
     {:xsd/anyURI
      "https://home.treasury.gov/system/files/261/FSOC-2013-Annual-Report.pdf"}},
   :cmns-av/explanatoryNote
   #{"GDP represents a valuation expressed in terms of the prices actually paid by the purchaser after all applicable taxes and subsidies."
     "Gross domestic product (GDP) is the value of the goods and services produced by the nation's economy less the value of the goods and services used up in production. GDP is also equal to the sum of personal consumption expenditures, gross private domestic investment, net exports of goods and services, and government consumption expenditures and gross investment. Conceptually, this measure can be arrived at by three separate means: as the sum of goods and services sold to final users, as the sum of income payments and other costs incurred in the production of goods and services, and as the sum of the value added at each stage of production. Although these three ways of measuring GDP are conceptually the same, their calculation may not result in identical estimates of GDP because of differences in data sources, timing, and estimation techniques."},
   :db/ident :fibo-ind-ei-ei/GrossDomesticProduct,
   :owl/disjointWith :fibo-ind-ei-ei/UnemploymentRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "gross domestic product",
   :rdfs/seeAlso
   {:xsd/anyURI "http://unstats.un.org/unsd/nationalaccount/docs/SNA2008.pdf"},
   :rdfs/subClassOf :fibo-ind-ei-ei/EconomicIndicator,
   :skos/definition
   "economic indicator representing the broadest measure of aggregate economic activity, measuring the total unduplicated market value of all final goods and services produced within a statistical area in a period"})

(def Hourly
  {:cmns-dt/hasDurationValue "P1H",
   :db/ident :fibo-ind-ei-ei/Hourly,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-dt-fd/ExplicitRecurrenceInterval},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "hourly",
   :skos/definition
   "an explicit recurrence interval of one hour, or 60 minutes"})

(def Household
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "http://stats.oecd.org/glossary/detail.asp?ID=1255"},
   :cmns-av/explanatoryNote
   #{"From the perspective of the U.S Census Bureau, a household includes the related family members and all the unrelated people, if any, such as lodgers, foster children, wards, or employees who share the housing unit. A person living alone in a housing unit, or a group of unrelated people sharing a housing unit such as partners or roomers, is also counted as a household. The count of households excludes group quarters [such as institutional facilities]. There are two major categories of households, 'family' and 'nonfamily'."
     "A household may be either (a) a one-person household, that is to say, a person who makes provision for his or her own food or other essentials for living without combining with any other person to form part of a multi-person household or (b) a multi-person household, that is to say, a group of two or more persons living together who make common provision for food or other essentials for living. The persons in the group may pool their incomes and may, to a greater or lesser extent, have a common budget; they may be related or unrelated persons or constitute a combination of persons both related and unrelated.\n\nA household may be located in a housing unit or in a set of collective living quarters such as a boarding house, a hotel or a camp, or may comprise the administrative personnel in an institution. The household may also be homeless."},
   :db/ident :fibo-ind-ei-ei/Household,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "household",
   :rdfs/subClassOf #{:fibo-ind-ei-ei/InstitutionalUnit
                      {:owl/onProperty     :cmns-col/hasMember,
                       :owl/someValuesFrom :fibo-fnd-aap-ppl/Person,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onClass    :fibo-ind-ei-ei/HousingUnit,
                       :owl/onProperty :fibo-fnd-plc-loc/isLocatedAt,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "individual or small group of persons who occupy a housing unit (such as a house or apartment) as their usual place of residence, who pool some, or all, of their income and wealth and who consume certain types of goods and services collectively, mainly housing and food"})

(def HousingUnit
  {:cmns-av/explanatoryNote
   "Separate living quarters are those in which the occupants live separately from any other individuals in the building and which have direct access from outside the building or through a common hall. For vacant units, the criteria of separateness and direct access are applied to the intended occupants whenever possible.",
   :db/ident :fibo-ind-ei-ei/HousingUnit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "housing unit",
   :rdfs/subClassOf #{:fibo-fnd-plc-loc/PhysicalLocation
                      {:owl/allValuesFrom :fibo-fnd-plc-adr/PhysicalAddress,
                       :owl/onProperty    :fibo-fnd-plc-adr/hasAddress,
                       :rdf/type          :owl/Restriction}},
   :skos/definition
   "house, an apartment, a mobile home or trailer, a group of rooms, or a single room occupied as separate living quarters, or if vacant, intended for occupancy as separate living quarters"})

(def InflationRate
  {:cmns-av/explanatoryNote
   "Inflation rate can be used to define changes, from period-to-period, in wage (wage inflation), house prices or producer inputs/outputs. It can be calculated month-over-month and quarter-over-quarter, as well as year-over-year, or on any periodic basis required by the publisher and its community of interest.",
   :db/ident :fibo-ind-ei-ei/InflationRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "inflation rate",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-cxtdsg/appliesTo,
      :owl/someValuesFrom :fibo-ind-ei-ei/GovernmentSpecifiedStatisticalArea,
      :rdf/type           :owl/Restriction} :fibo-ind-ei-ei/EconomicIndicator},
   :skos/definition
   "economic indicator representing a change in prices of goods and services for a specified period, for a given statistical area",
   :skos/editorialNote
   "Always either includes or excludes: Energy prices; Food prices. ALL inflation rates cite whether or not they exclude energy and food prices. If nothing stated it is assumed they include them."})

(def InputProducerPriceIndex
  {:cmns-av/abbreviation "input PPI",
   :cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.imf.org/external/pubs/ft/ppi/2010/manual/ppi.pdf"},
   :db/ident :fibo-ind-ei-ei/InputProducerPriceIndex,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "input producer price index",
   :rdfs/subClassOf :fibo-ind-ei-ei/ProducerPriceIndex,
   :skos/definition
   "economic indicator representing a measure of the rate of change over time in the prices of inputs of goods and services purchased by the producer"})

(def InstitutionalPerson
  {:cmns-av/adaptedFrom
   {:rdf/value
    "U.S. Bureau of Labor Statistics and Statistics Canada reference definitions - https://wiki.edmcouncil.org/pages/viewpage.action?pageId=6358041"},
   :db/ident :fibo-ind-ei-ei/InstitutionalPerson,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "institutional person",
   :rdfs/subClassOf :fibo-fnd-aap-ppl/Person,
   :skos/definition
   "person that resides in an institution for some reason, due, for example, to hospitalization, rehabilitation, or incarceration"})

(def InstitutionalUnit
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI "https://www.statcan.gc.ca/en/concepts/ccius/intro"}
     {:xsd/anyURI "http://stats.oecd.org/glossary/detail.asp?ID=1415"}
     {:xsd/anyURI "http://www.statcan.gc.ca/eng/concepts/units"}},
   :cmns-av/explanatoryNote
   "There is a hierarchical relationship between institutional units and establishments. An institutional unit contains one or more entire establishment(s); an establishment belongs to one and only one institutional unit. There are two main types of units in the real world that may qualify as institutional units, namely persons or groups of persons in the form of households, and legal or social entities.",
   :db/ident :fibo-ind-ei-ei/InstitutionalUnit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "institutional unit",
   :rdfs/subClassOf #{:cmns-pts/PartyRole :fibo-be-fct-fct/FunctionalEntity},
   :skos/definition
   "party that is capable, in its own right, of owning assets, incurring liabilities, and engaging in economic activities and in transactions with other parties"})

(def LaborProductivityGrossOutput
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "http://www.oecd.org/std/productivity-stats/2352458.pdf"},
   :cmns-av/explanatoryNote
   #{"Shows the time profile of how productively labour is used to generate gross output. Labour productivity changes reflect the joint influence of changes in capital, intermediate inputs, as well as technical, organisational and efficiency change within and between firms, the influence of economies of scale, varying degrees of capacity utilisation and measurement errors."
     "Gross-output based labour productivity traces the labour requirements per unit of (physical) output. It reflects the change in the input coefficient of labour by industry and can help in the analysis of labour requirements by industry."},
   :db/ident :fibo-ind-ei-ei/LaborProductivityGrossOutput,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "labor productivity, based on gross output",
   :rdfs/subClassOf :fibo-ind-ei-ei/Productivity,
   :skos/definition
   "ratio of a quantity index of gross output to a quantity index of labor input"})

(def LaborProductivityValueAdded
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "http://www.oecd.org/std/productivity-stats/2352458.pdf"},
   :cmns-av/explanatoryNote
   #{"At the aggregate level, value-added based labour productivity forms a direct link to a widely used measure of living standards, income per capita. Productivity translates directly into living standards, by adjusting for changing working hours, unemployment, labour force participation rates and demographic changes."
     "Shows the time profile of how productively labour is used to generate value added. Labour productivity changes reflect the joint influence of changes in capital, as well as technical, organisational and efficiency change within and between firms, the influence of economies of scale, varying degrees of capacity utilisation and measurement errors."},
   :db/ident :fibo-ind-ei-ei/LaborProductivityValueAdded,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "labor productivity, based on value added",
   :rdfs/subClassOf :fibo-ind-ei-ei/Productivity,
   :skos/definition
   "ratio of a quantity index of value added to a quantity index of labor input"})

(def MarginallyAttachedPopulation
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.bls.gov/news.release/empsit.t15.htm"},
   :db/ident :fibo-ind-ei-ei/MarginallyAttachedPopulation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "marginally attached population",
   :rdfs/subClassOf :fibo-ind-ei-ei/PopulationNotInLaborForce,
   :skos/definition
   "subset of the population that includes people who currently are neither working nor looking for work but indicate that they want and are available for a job and have looked for work sometime in the past 12 months"})

(def MetropolitanStatisticalArea
  {:cmns-av/abbreviation "MSA",
   :cmns-av/adaptedFrom
   #{{:xsd/anyURI
      "https://www.federalregister.gov/documents/2021/07/16/2021-15159/2020-standards-for-delineating-core-based-statistical-areas"}
     {:xsd/anyURI
      "https://obamawhitehouse.archives.gov/sites/default/files/omb/assets/fedreg_2010/06282010_metro_standards-Complete.pdf"}
     {:xsd/anyURI
      "https://en.wikipedia.org/wiki/List_of_Metropolitan_Statistical_Areas"}},
   :db/ident :fibo-ind-ei-ei/MetropolitanStatisticalArea,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "metropolitan statistical area",
   :rdfs/subClassOf :fibo-ind-ei-ei/GovernmentSpecifiedStatisticalArea,
   :skos/definition
   "one or more adjacent counties or county equivalents that have at least one urban core area of at least 50,000 population, plus adjacent territory that has a high degree of social and economic integration with the core as measured by commuting ties"})

(def MicropolitanStatisticalArea
  {:cmns-av/abbreviation "μSA",
   :cmns-av/adaptedFrom
   #{{:xsd/anyURI
      "https://www.federalregister.gov/documents/2021/07/16/2021-15159/2020-standards-for-delineating-core-based-statistical-areas"}
     {:xsd/anyURI
      "https://obamawhitehouse.archives.gov/sites/default/files/omb/assets/fedreg_2010/06282010_metro_standards-Complete.pdf"}
     {:xsd/anyURI
      "https://en.wikipedia.org/wiki/List_of_micropolitan_statistical_areas"}},
   :db/ident :fibo-ind-ei-ei/MicropolitanStatisticalArea,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "micropolitan statistical area",
   :rdfs/subClassOf :fibo-ind-ei-ei/GovernmentSpecifiedStatisticalArea,
   :skos/definition
   "one or more adjacent counties or county equivalents that have at least one urban core area of at least 10,000 population but less than 50,000, plus adjacent territory that has a high degree of social and economic integration with the core as measured by commuting ties"})

(def MilitaryPerson
  {:cmns-av/adaptedFrom
   {:rdf/value
    "U.S. Bureau of Labor Statistics and Statistics Canada reference definitions - https://wiki.edmcouncil.org/pages/viewpage.action?pageId=6358041"},
   :db/ident :fibo-ind-ei-ei/MilitaryPerson,
   :owl/disjointWith :fibo-ind-ei-ei/Civilian,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "military person",
   :rdfs/subClassOf :fibo-be-le-lp/LegallyCompetentNaturalPerson,
   :skos/definition "a person that is a member of the active duty military"})

(def Monthly
  {:cmns-dt/hasDurationValue "P1M",
   :db/ident :fibo-ind-ei-ei/Monthly,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-dt-fd/ExplicitRecurrenceInterval},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "monthly",
   :skos/definition
   "an explicit recurrence interval of exactly one (1) month, regardless of the length in days of a given calendar month, but typically 30 days"})

(def OutputProducerPriceIndex
  {:cmns-av/abbreviation "output PPI",
   :cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.imf.org/external/pubs/ft/ppi/2010/manual/ppi.pdf"},
   :db/ident :fibo-ind-ei-ei/OutputProducerPriceIndex,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "output producer price index",
   :rdfs/subClassOf :fibo-ind-ei-ei/ProducerPriceIndex,
   :skos/definition
   "economic indicator representing a measure of the rate of change over time in the prices of products sold as they leave the producer"})

(def PersonalConsumptionExpenditures
  {:cmns-av/abbreviation "PCE",
   :cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.bea.gov/data/consumer-spending/main"},
   :cmns-av/explanatoryNote
   "Personal consumption expenditures consist of purchases of goods and services by households and by nonprofit institutions serving households (NPISHs). These goods and services include imputed expenditures on items such as the services of housing by a homeowner (the equivalent of rent), financial and insurance services for which there is no explicit charge, and medical care provided to individuals and financed by government or by private insurance.",
   :db/ident :fibo-ind-ei-ei/PersonalConsumptionExpenditures,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "personal consumption expenditures",
   :rdfs/subClassOf :fibo-ind-ei-ei/EconomicIndicator,
   :skos/definition
   "economic indicator representing a measure of the value of the goods and services purchased by, or on the behalf of, 'persons'"})

(def PopulationNotInLaborForce
  {:cmns-av/adaptedFrom
   {:rdf/value
    "U.S. Bureau of Labor Statistics and Statistics Canada reference definitions - https://wiki.edmcouncil.org/pages/viewpage.action?pageId=6358041"},
   :cmns-av/explanatoryNote
   "There are a number of distinctions with respect to how individuals are counted from country to country, including whether or not they are considered employed if they are on unpaid leave for some reason, and whether or not they are counted multiple times if they have more than one paying job.",
   :db/ident :fibo-ind-ei-ei/PopulationNotInLaborForce,
   :owl/disjointWith :fibo-ind-ei-ei/CivilianLaborForce,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "population not in the labor force",
   :rdfs/subClassOf :fibo-ind-ei-ei/CivilianNonInstitutionalPopulation,
   :skos/definition
   "a subset of the civilian, noninstitutional population, that is considered neither employed nor unemployed by the reporting agency during the reporting period"})

(def ProducerPriceIndex
  {:cmns-av/abbreviation "PPI",
   :cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.imf.org/external/pubs/ft/ppi/2010/manual/ppi.pdf"},
   :cmns-av/explanatoryNote
   #{"Statistical agencies implement the Laspeyres index by putting it into price-relative (price change from the base period) and revenue-share (from the base period) format. In this form, the Laspeyres index can be written as the sum of base-period revenue shares of the items in the index times their corresponding price relatives. Statistical agency practice has introduced some approximations to the theoretical Laspeyres target due to a number of practical problems with producing the Laspeyres index exactly. For these and other pragmatic reasons, some agencies use alternatives depending on circumstances. See the IMF publication cited for a full explanation of the most commonly used approaches and trade-offs made for determining PPI."
     "The standard methodology for a typical PPI is based on a Laspeyres price index with fixed quantities from an earlier base period. The construction of this index can be thought of in terms of selecting a basket of goods and services representative of base-period revenues, valuing this at base-period prices, and then repricing the same basket at current-period prices. The target PPI in this case is defined to be the ratio of these two revenues. Practicing statisticians use this methodology because it has at least three practical advantages. It is easily explained to the public, it can use often expensive and untimely weighting information from the date of the last (or an even earlier) survey or administrative source (rather than requiring sources of data for the current month), and it need not be revised if users accept the Laspeyres premise."},
   :db/ident :fibo-ind-ei-ei/ProducerPriceIndex,
   :owl/disjointWith :fibo-ind-ei-ei/ConsumerPriceIndex,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "producer price index",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-cxtdsg/appliesTo,
      :owl/someValuesFrom {:owl/unionOf [:fibo-ind-ei-ei/EnterprisePopulation
                                         :fibo-ind-ei-ei/EstablishmentPopulation
                                         :fibo-ind-ei-ei/FixedBasketPopulation],
                           :rdf/type    :owl/Class},
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-qtu/hasArgument,
      :owl/someValuesFrom {:owl/unionOf [:fibo-ind-ei-ei/EnterprisePopulation
                                         :fibo-ind-ei-ei/EstablishmentPopulation
                                         :fibo-ind-ei-ei/FixedBasketPopulation],
                           :rdf/type    :owl/Class},
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-qtu/hasArgument,
      :owl/someValuesFrom :fibo-ind-ei-ei/FixedBasket,
      :rdf/type           :owl/Restriction} :fibo-ind-ei-ei/EconomicIndicator
     :cmns-qtu/Expression},
   :skos/definition
   "economic indicator representing a measure of the rate of change over time in the prices of goods and services bought and sold by producers"})

(def Productivity
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI "http://stats.oecd.org/glossary/detail.asp?ID=2167"}
     {:xsd/anyURI "http://www.oecd.org/std/productivity-stats/2352458.pdf"}},
   :cmns-av/explanatoryNote
   "The primary objectives of productivity measurement include: (a) tracing technology change, i.e., the currently known ways of converting resources into outputs desired by the economy, (b) identifying changes in efficiency, (c) understanding real cost savings, (d) benchmarking production processes, and (e) assessing standards of living. Productivity measures may also be single factor or multifactor.",
   :db/ident :fibo-ind-ei-ei/Productivity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "productivity",
   :rdfs/subClassOf #{:fibo-ind-ei-ei/EconomicIndicator :cmns-qtu/Expression},
   :skos/definition
   "economic indicator representing a ratio of a volume measure of output to a volume measure of input use"})

(def StatisticalInformationPublisher
  {:db/ident :fibo-ind-ei-ei/StatisticalInformationPublisher,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "statistical information publisher",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-rlcmp/isPlayedBy,
                       :owl/someValuesFrom :fibo-fnd-org-fm/FormalOrganization,
                       :rdf/type           :owl/Restriction}
                      :fibo-be-fct-pub/Publisher},
   :skos/definition
   "publisher that packages and makes analytical and statistical data available"})

(def UltimateConsumer
  {:cmns-av/explanatoryNote
   #{"The consumer is not always the purchaser of the product. Consumers are considered to be the users of the final product. For example, purchasers of building products are interim users of these products while constructing the finished product, which then may be purchased by the consumer."
     "For the purposes of the CPI and related statistics, the definition of consumer is limited to humans. In general, a consumer could include a pet, as the consumer of pet food, for example, although the pet owner would likely be the purchaser and target of advertising."},
   :cmns-av/synonym "consumer as defined by the Consumer Price Index (CPI)",
   :db/ident :fibo-ind-ei-ei/UltimateConsumer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "ultimate consumer",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-rlcmp/isPlayedBy,
                       :owl/someValuesFrom :fibo-fnd-aap-ppl/Person,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-pas-pas/Consumer},
   :skos/definition
   "a person that is the ultimate user of a good, product or service"})

(def UnderemployedPopulation
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.bls.gov/news.release/empsit.t15.htm"},
   :db/ident :fibo-ind-ei-ei/UnderemployedPopulation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "underemployed population",
   :rdfs/subClassOf :fibo-ind-ei-ei/EmployedPopulation,
   :skos/definition
   "subset of the employed population that includes persons employed part-time for economic reasons, who want and are available for full-time work but have had to settle for a part-time schedule"})

(def UnderemployedPopulationWithRespectToOccupation
  {:db/ident :fibo-ind-ei-ei/UnderemployedPopulationWithRespectToOccupation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "underemployed population with respect to occupation",
   :rdfs/subClassOf :fibo-ind-ei-ei/UnderemployedPopulation,
   :skos/definition
   "subset of the underemployed population that includes persons employed in a role that does not reflect their training and experience, excluding those that change careers"})

(def UnderutilizedPopulation
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.bls.gov/news.release/empsit.t15.htm"},
   :db/ident :fibo-ind-ei-ei/UnderutilizedPopulation,
   :owl/equivalentClass {:owl/unionOf
                         [:fibo-ind-ei-ei/UnderemployedPopulation
                          :fibo-ind-ei-ei/UnemployedPopulation
                          :fibo-ind-ei-ei/MarginallyAttachedPopulation],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "underutilized population",
   :rdfs/subClassOf :fibo-ind-ei-ei/CivilianNonInstitutionalPopulation,
   :skos/definition
   "subset of the civilian non-institutional population that includes persons employed part-time for economic reasons, persons that are marginally attached to the labor force, and persons that are identified as unemployed"})

(def UnemployedPopulation
  {:cmns-av/adaptedFrom
   {:rdf/value
    "U.S. Bureau of Labor Statistics and Statistics Canada reference definitions - https://wiki.edmcouncil.org/pages/viewpage.action?pageId=6358041"},
   :cmns-av/explanatoryNote
   "Persons who were waiting to be recalled to a job from which they had been laid off need not have been looking for work to be classified as unemployed.",
   :db/ident :fibo-ind-ei-ei/UnemployedPopulation,
   :owl/disjointWith :fibo-ind-ei-ei/EmployedPopulation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "unemployed population",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-ind-ei-ei/hasDurationOfUnemployment,
      :owl/someValuesFrom :cmns-dt/Duration,
      :rdf/type           :owl/Restriction} :fibo-ind-ei-ei/CivilianLaborForce},
   :skos/definition
   "subset of the civilian labor force that is considered to have had no employment but was available for work, except for temporary illness, and had made specific efforts to find employment sometime during a specified period, during the reporting period"})

(def UnemploymentRate
  {:cmns-av/adaptedFrom {:xsd/anyURI "http://www.bls.gov/cps/faq.htm#Ques3"},
   :cmns-av/explanatoryNote
   "Persons are classified as unemployed if they do not have a job, have actively looked for work in the prior 4 weeks, and are currently available for work. Workers expecting to be recalled from layoff are counted as unemployed, whether or not they have engaged in a specific jobseeking activity. In all other cases, the individual must have been engaged in at least one active job search activity in the 4 weeks preceding the interview and be available for work (except for temporary illness).",
   :cmns-qtu/describesActualExpression
   "unemployed population ÷ civilian labor force",
   :db/ident :fibo-ind-ei-ei/UnemploymentRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "unemployment rate",
   :rdfs/seeAlso {:xsd/anyURI "http://www.bls.gov/news.release/pdf/empsit.pdf"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-cxtdsg/appliesTo,
                       :owl/someValuesFrom :fibo-ind-ei-ei/UnemployedPopulation,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-qtu/hasArgument,
                       :owl/someValuesFrom :fibo-ind-ei-ei/UnemployedPopulation,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-qtu/hasArgument,
                       :owl/someValuesFrom :fibo-ind-ei-ei/CivilianLaborForce,
                       :rdf/type           :owl/Restriction}
                      :fibo-ind-ei-ei/EconomicIndicator :cmns-qtu/Expression},
   :skos/definition
   "economic indicator representing the ratio of the unemployed population with respect to the civilian labor force of a given economy for some specified period"})

(def ValueAddedProducerPriceIndex
  {:cmns-av/abbreviation "value-added PPI",
   :cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.imf.org/external/pubs/ft/ppi/2010/manual/ppi.pdf"},
   :db/ident :fibo-ind-ei-ei/ValueAddedProducerPriceIndex,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "value-added producer price index",
   :rdfs/subClassOf
   #{:fibo-ind-ei-ei/ProducerPriceIndex
     {:owl/onProperty     :cmns-qtu/hasArgument,
      :owl/someValuesFrom :fibo-ind-ei-ei/InputProducerPriceIndex,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-qtu/hasArgument,
      :owl/someValuesFrom :fibo-ind-ei-ei/OutputProducerPriceIndex,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "economic indicator representing a weighted average of the input and output producer price indices"})

(def Weekly
  {:cmns-dt/hasDurationValue "P7D",
   :db/ident :fibo-ind-ei-ei/Weekly,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-dt-fd/ExplicitRecurrenceInterval},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "weekly",
   :skos/definition "an explicit recurrence interval of one week, or 7 days"})

(def excludesEnergyAndFood
  {:db/ident :fibo-ind-ei-ei/excludesEnergyAndFood,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-ind-ei-ei/ConsumerPriceIndex,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "excludes energy and food",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether the calculation of the index includes energy and food prices or not"})

(def hasDurationOfUnemployment
  {:cmns-av/adaptedFrom {:xsd/anyURI "https://www.bls.gov/cps/definitions.htm"},
   :db/ident :fibo-ind-ei-ei/hasDurationOfUnemployment,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "has duration of unemployment",
   :rdfs/range :cmns-dt/Duration,
   :rdfs/subPropertyOf :cmns-dt/hasDuration,
   :skos/definition
   "specifies the length of time, typically in weeks, that people classified as unemployed have been continuously looking for work"})

(def hasIndicatorValue
  {:db/ident :fibo-ind-ei-ei/hasIndicatorValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "has indicator value",
   :rdfs/range :cmns-qtu/ScalarQuantityValue,
   :rdfs/subPropertyOf :cmns-qtu/hasQuantityValue,
   :skos/definition "specifies a quantity value for a given indicator"})

(def hasSeriesOrigin
  {:db/ident :fibo-ind-ei-ei/hasSeriesOrigin,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "has series origin",
   :rdfs/range :cmns-dt/Date,
   :rdfs/subPropertyOf :cmns-dt/hasStartDate,
   :skos/definition
   "specifies the original starting date for the time series for a given economic indicator"})

(def isSeasonallyAdjusted
  {:cmns-av/explanatoryNote
   "Example explanation from the US Bureau of Labor Statistics: Because price data are used for different purposes by different groups, the Bureau of Labor Statistics publishes seasonally adjusted as well as unadjusted changes each month. ... Seasonal factors used in computing the seasonally adjusted indexes are derived by the X-13ARIMA-SEATS Seasonal Adjustment Method. Seasonally adjusted indexes and seasonal factors are computed annually. Each year, the last five years of seasonally adjusted data are revised.",
   :db/ident :fibo-ind-ei-ei/isSeasonallyAdjusted,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"},
   :rdfs/label "is seasonally adjusted",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "a predicate indicating whether some published formal method is applied that compensates for seasonal variations in the population or index value"})

(def urn:uuid:1edd367f-e89c-5bfe-a812-092cdc26fba5
  {:cmns-av/copyright
   #{"Copyright (c) 2014-2024 EDM Council, Inc."
     "Copyright (c) 2014-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology provides the parameters which make up the various types of market economic indicators, along with basic facts about these such as the economies or countries they apply to.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/FunctionalEntities/Publishers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/Indicators/Indicators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/ClassificationSchemes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/Addresses/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/AgentsAndPeople/People/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/FunctionalEntities/FunctionalEntities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Organizations/FormalOrganizations/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/EconomicIndicators/EconomicIndicators/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Economic Indicators Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified to fix spelling errors."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified to eliminate references to external dictionary sites that no longer resolve, added a synonym to fixed basket and eliminated the restriction with respect to date period, which is not the primary concern of a fixed basket, revised the name of the 'goods or services population' to 'goods population' to eliminate a hygiene issue and reflect the synonym of 'basket of goods', and merged the statistical information publisher class from economic indicator publishers into this ontology."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified to use hasCoverageArea rather than appliesTo in the restriction on an economic indicator relating it to a statistical area, to reflect use of actualExpression as an annotation rather than datatype property, and to migrate the general statistics concepts to FND (deprecated herein)."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified per the issue resolutions identified in the FIBO IND 1.0 FTF 3 report."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified to address text formatting hygiene issues and clean up external links."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified to replace additional content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified to use natural person rather than legally capable person."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified to eliminate duplicatation with concepts in LCC and merge countries with locations in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified to reflect the change in name and definition of numeric index to numeric index value in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified to add definitions for alternative unemployment calculations and correct a circular property definition."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified per the FIBO 2.0 RFC. Primary changes include the addition of a number of statistical measures (mean, total, etc.) and their use in existing and new indicators, and the addition of several more economic indicators."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified to eliminate the restriction on economic indicator (and its subclasses) that it has an indicator value - the restriction should be on the quantity value such that the value refers to the indicator it represents, and to revise the definition of civilian non-institutional population to correctly represent civilian non-institutional person (added)."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified per the issue resolutions identified in the FIBO IND 1.0 FTF 1 report."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/"})