(ns net.wikipunk.rdf.fibo-ind-mkt-eqind
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
     "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-be-fct-pub"
     "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
     "fibo-be-le-fbo"
     "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
     "fibo-be-oac-cctl"
     "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/",
     "fibo-be-plc-plc"
     "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/",
     "fibo-fbc-dae-dbt"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
     "fibo-fbc-fct-usfsind"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
     "fibo-fbc-fct-usjrga"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/",
     "fibo-fbc-pas-fpas"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
     "fibo-fnd-acc-cur"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
     "fibo-fnd-dt-fd"
     "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
     "fibo-fnd-plc-vrt"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Places/VirtualPlaces/",
     "fibo-fnd-rel-rel"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
     "fibo-fnd-utl-alx"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "fibo-ind-ind-ind"
     "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/",
     "fibo-ind-mkt-bas"
     "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/",
     "fibo-ind-mkt-eqind"
     "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/",
     "fibo-sec-eq-eqind"
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
     "fibo-sec-sec-bsk"
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Baskets/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "skos" "http://www.w3.org/2004/02/skos/core#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-ind-mkt-eqind",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/MarketIndices/EquityIndexExampleIndividuals/"}
  {:cmns-av/copyright #{"Copyright (c) 2020-2023 Object Management Group, Inc."
                        "Copyright (c) 2020-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology provides examples of how to represent common equity indices as identified in the IND-EFT-DEV use case.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Quantities/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/Indicators/Indicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/BusinessRegistries/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/OwnershipAndControl/ControlParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Equities/EquitiesExampleIndividuals/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/MarketIndices/BasketIndices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/VirtualPlaces/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesClassification/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/FunctionalEntities/Publishers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/Baskets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/MarketIndices/EquityIndexExampleIndividuals/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Equity Index Example Individuals Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals.rdf version of this ontology was modified to reflect the move of market data provider from interest rates in IND to publishers in BE."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/"})

(def DowJonesIndustrialAverage
  {:cmns-av/abbreviation #{"DJIA" "Dow"},
   :cmns-av/explanatoryNote {:rdf/language "en",
                             :rdf/value    ""},
   :db/ident :fibo-ind-mkt-eqind/DowJonesIndustrialAverage,
   :fibo-be-fct-pub/hasPublisher :fibo-ind-mkt-eqind/SPDowJonesIndices,
   :fibo-fbc-dae-dbt/isBasedOn
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket,
   :fibo-fnd-utl-alx/isCalculatedViaMethodology
   {:rdf/language "en",
    :rdf/value
    "The index is calculated by adding the price of a single share of each stock together, with equal weighting, and dividing by the Dow Divisor which is constantly adjusted, and is currently around 0.1474."},
   :rdf/type #{:fibo-ind-mkt-bas/EquityIndex :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/"},
   :rdfs/label "Dow Jones Industrial Average",
   :skos/definition
   "equity index of 30 substantial stocks that are traded on the New York Stock Exchange (NYSE) and the Nasdaq"})

(def DowJonesIndustrialAverageBasket
  {:db/ident :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket,
   :fibo-fbc-pas-fpas/hasSelectionCriteria
   "The Averages Committee, which includes the managing editor of The Wall Street Journal, the head of Dow Jones Indexes research, and the head of CME Group research, determine which components become a part of the DJIA. There are no set rules the Averages Committee must follow when selecting Dow components, only broad parameters to ensure those companies represent a large portion of the overall economic performance in the United States. Each average is reviewed at least once annually, but composition changes are rare for the sake of continuity. Since its beginnings in May of 1896, the Dow Jones stocks list has only changed 54 times. As of June 2018, the last remaining company of the original 12 components of the DJIA, General Electric (GE), was replaced by Walgreens Boots Alliance.",
   :fibo-fnd-utl-alx/hasExpression
   :fibo-ind-mkt-bas/CapitalizationBasedWeightingFunction,
   :rdf/type #{:owl/NamedIndividual :fibo-ind-mkt-bas/BasketOfEquities},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/"},
   :rdfs/label "Dow Jones Industrial Average basket",
   :skos/definition
   "basket of 30 substantial stocks that are traded on the New York Stock Exchange (NYSE) and the Nasdaq"})

(def DowJonesIndustrialAverageBasket-AppleIncCommonStockConstituent
  {:cmns-col/isConstituentOf
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket,
   :db/ident
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-AppleIncCommonStockConstituent,
   :fibo-fnd-dt-fd/hasDateAdded
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-AppleIncCommonStockDateAdded,
   :fibo-fnd-rel-rel/involves :fibo-sec-eq-eqind/XNASListedAppleIncCommonStock,
   :fibo-fnd-utl-alx/hasWeight 1,
   :rdf/type #{:fibo-sec-sec-bsk/SecuritiesBasketConstituent
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/"},
   :rdfs/label
   "Dow Jones Industrial Average basket - Apple Inc. common stock constituent",
   :skos/definition
   "Apple Inc. common stock constituent of the DJIA basket of 30 stocks"})

(def DowJonesIndustrialAverageBasket-AppleIncCommonStockDateAdded
  {:cmns-dt/hasDateValue "2015-03-19",
   :db/ident
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-AppleIncCommonStockDateAdded,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/"},
   :rdfs/label
   "Dow Jones Industrial Average basket - Apple Inc. common stock date added",
   :skos/definition
   "individual representing the date that Apple Inc. common stock was initially added to the DJIA, replacing AT&T Inc."})

(def DowJonesIndustrialAverageBasket-IBMCommonStockConstituent
  {:cmns-col/isConstituentOf
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket,
   :db/ident
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-IBMCommonStockConstituent,
   :fibo-fnd-dt-fd/hasDateAdded
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-IBMCommonStockDateAdded,
   :fibo-fnd-rel-rel/involves
   :fibo-sec-eq-eqind/XNYSListedInternationalBusinessMachinesCorporationCommonStock,
   :fibo-fnd-utl-alx/hasWeight 1,
   :rdf/type #{:fibo-sec-sec-bsk/SecuritiesBasketConstituent
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/"},
   :rdfs/label
   "Dow Jones Industrial Average basket - IBM common stock constituent",
   :skos/definition
   "IBM common stock constituent of the DJIA basket of 30 stocks"})

(def DowJonesIndustrialAverageBasket-IBMCommonStockDateAdded
  {:cmns-dt/hasDateValue "1979-06-29",
   :db/ident
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-IBMCommonStockDateAdded,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/"},
   :rdfs/label
   "Dow Jones Industrial Average basket - IBM common stock date added",
   :skos/definition
   "individual representing the date that IBM common stock was most recently added to the DJIA"})

(def DowJonesIndustrialAverageBasket-TheCoca-ColaCompanyCommonStockConstituent
  {:cmns-col/isConstituentOf
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket,
   :db/ident
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-TheCoca-ColaCompanyCommonStockConstituent,
   :fibo-fnd-dt-fd/hasDateAdded
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-TheCoca-ColaCompanyCommonStockDateAdded,
   :fibo-fnd-rel-rel/involves
   :fibo-sec-eq-eqind/XNYSListedTheCoca-ColaCompanyCommonStock,
   :fibo-fnd-utl-alx/hasWeight 1,
   :rdf/type #{:fibo-sec-sec-bsk/SecuritiesBasketConstituent
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/"},
   :rdfs/label
   "Dow Jones Industrial Average basket - The Coca-Cola Company common stock constituent",
   :skos/definition
   "The Coca-Cola Company common stock constituent of the DJIA basket of 30 stocks"})

(def DowJonesIndustrialAverageBasket-TheCoca-ColaCompanyCommonStockDateAdded
  {:cmns-dt/hasDateValue "1987-03-12",
   :db/ident
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-TheCoca-ColaCompanyCommonStockDateAdded,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/"},
   :rdfs/label
   "Dow Jones Industrial Average basket - The Coca-Cola Company common stock date added",
   :skos/definition
   "individual representing the date that The Coca-Cola Company common stock was most recently added to the DJIA"})

(def DowJonesIndustrialAverageBasket-TheHomeDepotCommonStockConstituent
  {:cmns-col/isConstituentOf
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket,
   :db/ident
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-TheHomeDepotCommonStockConstituent,
   :fibo-fnd-dt-fd/hasDateAdded
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-TheHomeDepotCommonStockDateAdded,
   :fibo-fnd-rel-rel/involves
   :fibo-sec-eq-eqind/XNYSListedTheHomeDepotIncCommonStock,
   :fibo-fnd-utl-alx/hasWeight 1,
   :rdf/type #{:fibo-sec-sec-bsk/SecuritiesBasketConstituent
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/"},
   :rdfs/label
   "Dow Jones Industrial Average basket - The Home Depot, Inc. common stock constituent",
   :skos/definition
   "The Home Depot, Inc. common stock constituent of the DJIA basket of 30 stocks"})

(def DowJonesIndustrialAverageBasket-TheHomeDepotCommonStockDateAdded
  {:cmns-dt/hasDateValue "1999-11-01",
   :db/ident
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-TheHomeDepotCommonStockDateAdded,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/"},
   :rdfs/label
   "Dow Jones Industrial Average basket - The Home Depot, Inc. common stock date added",
   :skos/definition
   "individual representing the date that The Home Depot, Inc. common stock was added to the DJIA"})

(def
  DowJonesIndustrialAverageBasket-TheProctorAndGambleCompanyCommonStockConstituent
  {:cmns-col/isConstituentOf
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket,
   :db/ident
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-TheProctorAndGambleCompanyCommonStockConstituent,
   :fibo-fnd-dt-fd/hasDateAdded
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-TheProctorAndGambleCompanyCommonStockDateAdded,
   :fibo-fnd-rel-rel/involves
   :fibo-sec-eq-eqind/XNYSListedTheProctorAndGambleCompanyCommonStock,
   :fibo-fnd-utl-alx/hasWeight 1,
   :rdf/type #{:fibo-sec-sec-bsk/SecuritiesBasketConstituent
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/"},
   :rdfs/label
   "Dow Jones Industrial Average basket - The Proctor & Gamble Company common stock constituent",
   :skos/definition
   "The Proctor & Gamble Company common stock constituent of the DJIA basket of 30 stocks"})

(def
  DowJonesIndustrialAverageBasket-TheProctorAndGambleCompanyCommonStockDateAdded
  {:cmns-dt/hasDateValue "1932-05-26",
   :db/ident
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-TheProctorAndGambleCompanyCommonStockDateAdded,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/"},
   :rdfs/label
   "Dow Jones Industrial Average basket - The Proctor & Gamble Company common stock date added",
   :skos/definition
   "individual representing the date that The Proctor & Gamble Company common stock was added to the DJIA"})

(def DowJonesIndustrialAverageValue-2023-03-06T120514-0500
  {:db/ident
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageValue-2023-03-06T120514-0500,
   :fibo-fnd-acc-cur/hasRateValue 25523.2M,
   :fibo-fnd-utl-alx/isValueOf :fibo-ind-mkt-eqind/DowJonesIndustrialAverage,
   :fibo-ind-ind-ind/hasQuotationDateTime #inst "2020-03-06T17:05:14.000-00:00",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-utl-alx/NumericIndexValue},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/"},
   :rdfs/label "Dow Jones Industrial Average value as of Mar 6, 2020",
   :skos/definition
   "individual representing the value of the DJIA on 6 Mar 2020 at 12:05:14 pm in NYC"})

(def SPDowJonesIndices
  {:db/ident :fibo-ind-mkt-eqind/SPDowJonesIndices,
   :fibo-fnd-rel-rel/hasIdentity :fibo-ind-mkt-eqind/SPDowJonesIndicesLLC-US-DE,
   :rdf/type #{:fibo-be-fct-pub/MarketDataProvider
               :fibo-fbc-pas-fpas/FinancialServiceProvider
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/"},
   :rdfs/label "S & P Dow Jones Indices",
   :skos/definition
   "financial service and market data provider that is a global provider of index-based data and research"})

(def SPDowJonesIndicesLLC-US-DE
  {:db/ident :fibo-ind-mkt-eqind/SPDowJonesIndicesLLC-US-DE,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usfsind/SPGlobalHeadquartersAddress,
   :fibo-be-oac-cctl/hasDomesticUltimateParent :fibo-fbc-fct-usfsind/SPGlobal,
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationServiceCompany,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "https://us.spindices.com/"},
   :rdf/type #{:fibo-be-plc-plc/PrivateCompanyWithLimitedLiability
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/"},
   :rdfs/label "S & P Dow Jones Indices LLC US-DE",
   :skos/definition
   "the S & P Dow Jones Indices LLC legal entity that is a Delaware limited liability company"})

(def StandardAndPoors500CompositeIndex
  {:cmns-av/abbreviation "S&P 500",
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The S&P 500 is a market capitalization-weighted index and the performance of the 10 largest companies in the index account for 21.8 percent of the performance of the index."},
   :db/ident :fibo-ind-mkt-eqind/StandardAndPoors500CompositeIndex,
   :fibo-be-fct-pub/hasPublisher :fibo-ind-mkt-eqind/SPDowJonesIndices,
   :fibo-fbc-dae-dbt/isBasedOn
   :fibo-ind-mkt-eqind/StandardAndPoors500CompositeIndexBasket,
   :fibo-fnd-utl-alx/isCalculatedViaMethodology
   {:rdf/language "en",
    :rdf/value
    "The components of the S&P 500 are selected by a committee. When considering the eligibility of a new addition, the committee assesses the company's merit using eight primary criteria: market capitalization, liquidity, domicile, public float, sector classification, financial viability, and length of time publicly traded and stock exchange."},
   :rdf/type #{:fibo-ind-mkt-bas/EquityIndex :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/"},
   :rdfs/label "Standard & Poor's Composite Index",
   :skos/definition
   "equity index that is calculated based on the float-adjusted market capitalization of approximately 500 large companies listed on stock exchanges in the United States"})

(def StandardAndPoors500CompositeIndexBasket
  {:db/ident :fibo-ind-mkt-eqind/StandardAndPoors500CompositeIndexBasket,
   :fibo-fbc-pas-fpas/hasSelectingParty
   :fibo-ind-mkt-eqind/SPDowJonesIndicesLLC-US-DE,
   :fibo-fbc-pas-fpas/hasSelectionCriteria
   "To qualify for the S&P 500, a company must meet certain committee-established criteria, which include (1) a market cap of at least $13.1 billion, (2) trading the value of its market capitalization annually, (3) at least a quarter-million of its shares have been traded in each of the previous six months (4) the majority of shares are in the public's hands, (5) being publicly traded for at least a year, and (6) earnings over the most recent four quarters and in the most recent quarter must be positive.",
   :fibo-fnd-utl-alx/hasExpression
   :fibo-ind-mkt-bas/CapitalizationBasedWeightingFunction,
   :rdf/type #{:owl/NamedIndividual :fibo-ind-mkt-bas/BasketOfEquities},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/"},
   :rdfs/label "Standard & Poor's Composite Index basket",
   :skos/definition
   "basket of common shares issued by approximately 500 large-cap companies that are traded on American stock exchanges"})

(def urn:uuid:16511a78-7c6f-5bcb-8513-6e620b136e5c
  {:cmns-av/copyright #{"Copyright (c) 2020-2023 Object Management Group, Inc."
                        "Copyright (c) 2020-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology provides examples of how to represent common equity indices as identified in the IND-EFT-DEV use case.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Quantities/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/Indicators/Indicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/BusinessRegistries/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/OwnershipAndControl/ControlParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Equities/EquitiesExampleIndividuals/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/MarketIndices/BasketIndices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/VirtualPlaces/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesClassification/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/FunctionalEntities/Publishers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/Baskets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/MarketIndices/EquityIndexExampleIndividuals/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Equity Index Example Individuals Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals.rdf version of this ontology was modified to reflect the move of market data provider from interest rates in IND to publishers in BE."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/"})