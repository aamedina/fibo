(ns net.wikipunk.rdf.fibo-ind-ir-mdp
  "This ontology provides reference data for a number of international market data providers, including, but not limited to, those that publish interest rate benchmarks referenced in the published FpML benchmark reference."
  {:cmns-av/copyright ["Copyright (c) 2020-2023 EDM Council, Inc."
                       "Copyright (c) 2020-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders/",
   :dcterms/abstract
   "This ontology provides reference data for a number of international market data providers, including, but not limited to, those that publish interest rate benchmarks referenced in the published FpML benchmark reference.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Arrangements/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/InterestRates/InterestRates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/FormalBusinessOrganizations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Corporations/Corporations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LEIEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/FinancialServicesEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/BusinessRegistries/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/BusinessDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/CorporateBodies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/BusinessCentersIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/Publishers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/InterestRates/MarketDataProviders/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-corp-corp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
    "fibo-be-fct-pub"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
    "fibo-be-le-cb"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/",
    "fibo-be-le-fbo"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
    "fibo-be-le-lei"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fbc-fct-bci"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
    "fibo-fbc-fct-breg"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
    "fibo-fbc-fct-cajrga"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
    "fibo-fbc-fct-eufseind"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
    "fibo-fbc-fct-eurga"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies/",
    "fibo-fbc-fct-fse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
    "fibo-fbc-fct-ra"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
    "fibo-fbc-fct-usfsind"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
    "fibo-fbc-fct-usjrga"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-dt-bd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-plc-adr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/",
    "fibo-fnd-plc-loc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-ir-ir"
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
    "fibo-ind-ir-mdp"
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-3166-2-us"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-ind-ir-mdp",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders/",
   :rdfs/label "Market Data Providers Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders.rdf version of this ontology was revised to update the LEI URIs to the new form published by the GLEIF on data.world."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/IND/20221001/InterestRates/MarketDataProviders.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders.rdf version of this ontology was revised to reflect the move of market data provider from interest rates in IND to publishers in BE."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders.rdf version of this ontology was revised to clean up the LEI data."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders.rdf version of this ontology was revised to replace references to the legacy LCC UnitedStates country representation with UnitedStatesOfAmerica."]})

(def BGCPartnersInc-US-DE
  "legal entity that is a Delaware Corporation"
  {:db/ident :fibo-ind-ir-mdp/BGCPartnersInc-US-DE,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-ind-ir-mdp/BGCPartnersIncHeadquartersAddress,
   :fibo-fbc-fct-breg/hasPriorLegalName "Cantor Fitzgerald",
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-ind-ir-mdp/BGCPartnersIncDateEstablished,
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationServiceCompany,
   :fibo-fnd-rel-rel/hasLegalName "BGC Partners, Inc. US-DE",
   :rdf/type [:owl/NamedIndividual :fibo-be-le-cb/StockCorporation],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders/",
   :rdfs/label "BGC Partners, Inc. US-DE",
   :skos/definition "legal entity that is a Delaware Corporation"})

(def BGCPartnersIncBusinessEntityIdentifier
  "Delaware Division of Corporations business entity identifier for BGC Partners, Inc. b"
  {:db/ident :fibo-ind-ir-mdp/BGCPartnersIncBusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :lcc-lr/hasTag "3051512",
   :lcc-lr/identifies :fibo-ind-ir-mdp/BGCPartnersInc-US-DE,
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders/",
   :rdfs/label "BGC Partners, Inc. business entity identifier",
   :skos/definition
   "Delaware Division of Corporations business entity identifier for BGC Partners, Inc. b"})

(def BGCPartnersIncDateEstablished
  "date that BGC Partners, Inc. was incorporated with the Delaware Division of Corporations"
  {:db/ident :fibo-ind-ir-mdp/BGCPartnersIncDateEstablished,
   :fibo-fnd-dt-fd/hasDateValue "1999-06-03",
   :rdf/type [:fibo-fnd-dt-fd/Date :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders/",
   :rdfs/label "BGC Partners, Inc. date established",
   :skos/definition
   "date that BGC Partners, Inc. was incorporated with the Delaware Division of Corporations"})

(def BGCPartnersIncHeadquartersAddress
  "registered address identified as the headquarters address for BGC Partners, Inc."
  {:db/ident :fibo-ind-ir-mdp/BGCPartnersIncHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "55 Water Street",
   :fibo-fnd-plc-adr/hasPostalCode "10041",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/New_York,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/NewYork,
   :rdf/type [:fibo-fnd-plc-adr/ConventionalStreetAddress :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders/",
   :rdfs/label "BGC Partners, Inc. headquarters address",
   :skos/definition
   "registered address identified as the headquarters address for BGC Partners, Inc."})

(def BGCPartnersIncLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for BGC Partners, Inc."
  {:db/ident :fibo-ind-ir-mdp/BGCPartnersIncLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T19:55:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-05-17T19:24:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-05-17T19:31:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :fibo-fnd-rel-rel/comprises
   "https://rdf.gleif.org/L1/L-TF1LXM1YNB81WKUH5G19-LEI",
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders/",
   :rdfs/label "BGC Partners, Inc. legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for BGC Partners, Inc."})

(def EuropeanMoneyMarketsInstituteBenchmarkPublisher
  "individual representing the European Money Markets Institute (EMMI) functional entity that is an international financial information publisher, responsible for the publication of euro-based benchmarks, including Euribor"
  {:cmns-av/adaptedFrom "http://www.emmi-benchmarks.eu/",
   :db/ident :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-eufseind/EuropeanMoneyMarketsInstitute,
   :rdf/type [:fibo-ind-ir-ir/InterestRateAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders/",
   :rdfs/label "European Money Markets Institute (EMMI) benchmark publisher",
   :skos/definition
   "individual representing the European Money Markets Institute (EMMI) functional entity that is an international financial information publisher, responsible for the publication of euro-based benchmarks, including Euribor"})

(def FederalReserveBoardH.15RateResetTimeOfDay
  "the time of day that the Federal Reserve Board publishes Selected Interest Rates (Daily) in Schedule H.15"
  {:cmns-av/adaptedFrom "https://www.federalreserve.gov/releases/h15/",
   :db/ident :fibo-ind-ir-mdp/FederalReserveBoardH.15RateResetTimeOfDay,
   :fibo-fnd-dt-bd/hasBusinessDayAdjustment
   :fibo-fbc-fct-bci/NewYorkFederalReserveBusinessDay,
   :fibo-fnd-dt-fd/hasTimeValue "T16:15:00",
   :fibo-fnd-plc-loc/hasBusinessCenter :fibo-fbc-fct-bci/New_York,
   :rdf/type [:fibo-fbc-dae-dbt/RateResetTimeOfDay :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders/",
   :rdfs/label "Federal Reserve Board H.15 rate reset time of day",
   :skos/definition
   "the time of day that the Federal Reserve Board publishes Selected Interest Rates (Daily) in Schedule H.15"})

(def FenicsMarketData
  "Fenics Market Data functional entity that is a financial service and market data provider and division of BGC Partners"
  {:db/ident :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-fnd-rel-rel/hasIdentity :fibo-ind-ir-mdp/BGCPartnersInc-US-DE,
   :fibo-fnd-rel-rel/wasFormerlyKnownAs "BGCantor Market Data, L.P.",
   :rdf/type [:fibo-be-fct-pub/MarketDataProvider :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders/",
   :rdfs/label "Fenics Market Data",
   :skos/definition
   "Fenics Market Data functional entity that is a financial service and market data provider and division of BGC Partners"})

(def ICEBenchmarkPublisher
  "the ICE Benchmark Administration functional entity that is an international financial information publisher, responsible for the publication of ICE LIBOR, ICE Swap Rate, LBMA Gold Price and ISDA SIMM benchmarks"
  {:cmns-av/adaptedFrom "https://www.theice.com/index",
   :db/ident :fibo-ind-ir-mdp/ICEBenchmarkPublisher,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usfsind/ICEBenchmarkAdministration,
   :rdf/type [:fibo-ind-ir-ir/InterestRateAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders/",
   :rdfs/label "ICE benchmark publisher",
   :skos/definition
   "the ICE Benchmark Administration functional entity that is an international financial information publisher, responsible for the publication of ICE LIBOR, ICE Swap Rate, LBMA Gold Price and ISDA SIMM benchmarks"})

(def ReferenceBanks
  "market data provider of interest rate benchmarks representing a group of one or more banks that either individually, or in aggregate, provide quoted rates that contribute to the benchmark"
  {:cmns-av/explanatoryNote
   "With respect to LIBOR, for example, the Bank of England will request the principal London office of each of the Reference Banks to provide a quotation of its rate. If at least two such quotations are provided, the rate for such date will be the arithmetic mean of the quotations. If fewer than two quotations are provided as requested, the rate for such date will be the arithmetic mean of the rates quoted by major banks in New York City selected by the Bank, at approximately 11:00 a.m. New York City time for loans in U.S. Dollars to leading European banks for such Interest Period and in an amount approximately equal to the amount requested LIBOR-Reference Banks Loan.",
   :db/ident :fibo-ind-ir-mdp/ReferenceBanks,
   :rdf/type [:lcc-lr/Collection
              :fibo-be-fct-pub/MarketDataProvider
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders/",
   :rdfs/label "reference banks",
   :skos/definition
   "market data provider of interest rate benchmarks representing a group of one or more banks that either individually, or in aggregate, provide quoted rates that contribute to the benchmark"})

(def ReferenceDealers
  "market data provider of interest rate benchmarks representing a group of one or more swap dealers that either individually, or in aggregate, provide quoted rates that contribute to the benchmark"
  {:db/ident :fibo-ind-ir-mdp/ReferenceDealers,
   :rdf/type [:lcc-lr/Collection
              :fibo-be-fct-pub/MarketDataProvider
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders/",
   :rdfs/label "reference dealers",
   :skos/definition
   "market data provider of interest rate benchmarks representing a group of one or more swap dealers that either individually, or in aggregate, provide quoted rates that contribute to the benchmark"})

(def SwapMarker
  "market data provider of interest rate benchmarks"
  {:db/ident :fibo-ind-ir-mdp/SwapMarker,
   :rdf/type [:fibo-be-fct-pub/MarketDataProvider :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders/",
   :rdfs/label "Swap Marker",
   :skos/definition "market data provider of interest rate benchmarks"})

(def Tradition
  "Tradition functional entity that is a financial service and market data provider and division of Compagnie Financiere Tradition"
  {:db/ident :fibo-ind-ir-mdp/Tradition,
   :rdf/type [:fibo-fbc-pas-fpas/FinancialServiceProvider
              :fibo-be-fct-pub/MarketDataProvider
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders/",
   :rdfs/label "Tradition",
   :skos/definition
   "Tradition functional entity that is a financial service and market data provider and division of Compagnie Financiere Tradition"})

(def ^{:private true} CanadianBankingRegulatoryAgencyAndCentralBank
  {:db/ident :fibo-fbc-fct-cajrga/CanadianBankingRegulatoryAgencyAndCentralBank,
   :rdf/type [:fibo-ind-ir-ir/InterestRateAuthority :owl/NamedIndividual]})

(def ^{:private true} EuropeanBankingRegulatoryAgencyAndCentralBank
  {:db/ident :fibo-fbc-fct-eurga/EuropeanBankingRegulatoryAgencyAndCentralBank,
   :rdf/type [:fibo-ind-ir-ir/InterestRateAuthority :owl/NamedIndividual]})

(def ^{:private true} BloombergLP
  {:db/ident :fibo-fbc-fct-usfsind/BloombergLP,
   :rdf/type [:fibo-be-fct-pub/MarketDataProvider :owl/NamedIndividual]})

(def ^{:private true} ThomsonReuters
  {:db/ident :fibo-fbc-fct-usfsind/ThomsonReuters,
   :rdf/type [:fibo-be-fct-pub/MarketDataProvider :owl/NamedIndividual]})

(def ^{:private true} BoardOfGovernorsOfTheFederalReserveSystem
  {:db/ident :fibo-fbc-fct-usjrga/BoardOfGovernorsOfTheFederalReserveSystem,
   :rdf/type [:fibo-ind-ir-ir/InterestRateAuthority :owl/NamedIndividual]})