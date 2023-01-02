(ns net.wikipunk.rdf.fibo-ind-mkt-eqind
  "This ontology provides examples of how to represent common equity indices as identified in the IND-EFT-DEV use case."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/",
   :dcterms/abstract
   "This ontology provides examples of how to represent common equity indices as identified in the IND-EFT-DEV use case.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/MarketIndices/BasketIndices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/ControlParties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/ClassificationSchemes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/VirtualPlaces/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/BusinessRegistries/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/FormalBusinessOrganizations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/Publishers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Equities/EquitiesExampleIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/Indicators/Indicators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/Baskets/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesClassification/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Arrangements/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Quantities/QuantitiesAndUnits/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/MarketIndices/EquityIndexExampleIndividuals/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
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
    "fibo-fnd-arr-arr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
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
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/",
   :rdfa/prefix "fibo-ind-mkt-eqind",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/",
   :rdfs/label "Equity Index Example Individuals Ontology",
   :skos/changeNote
   "The https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals.rdf version of this ontology was modified to reflect the move of market data provider from interest rates in IND to publishers in BE.",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2020-2022 Object Management Group, Inc."
                  "Copyright (c) 2020-2022 EDM Council, Inc."],
   :sm/dependsOn
   ["https://spec.edmcouncil.org/fibo/ontology/FBC/"
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/"
    "https://spec.edmcouncil.org/fibo/ontology/BE/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/"
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/"],
   :sm/fileAbbreviation "fibo-ind-mkt-eqind",
   :sm/filename "EquityIndexExampleIndividuals.rdf"})

(def DowJonesIndustrialAverage
  "equity index of 30 substantial stocks that are traded on the New York Stock Exchange (NYSE) and the Nasdaq"
  {:db/ident :fibo-ind-mkt-eqind/DowJonesIndustrialAverage,
   :fibo-be-fct-pub/hasPublisher :fibo-ind-mkt-eqind/SPDowJonesIndices,
   :fibo-fbc-dae-dbt/isBasedOn
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket,
   :fibo-fnd-utl-alx/isCalculatedViaMethodology
   {:rdf/language "en",
    :rdf/value
    "The index is calculated by adding the price of a single share of each stock together, with equal weighting, and dividing by the Dow Divisor which is constantly adjusted, and is currently around 0.1474."},
   :fibo-fnd-utl-av/abbreviation ["DJIA" "Dow"],
   :fibo-fnd-utl-av/explanatoryNote {:rdf/language "en",
                                     :rdf/value    ""},
   :rdf/type [:fibo-ind-mkt-bas/EquityIndex :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/",
   :rdfs/label "Dow Jones Industrial Average",
   :skos/definition
   "equity index of 30 substantial stocks that are traded on the New York Stock Exchange (NYSE) and the Nasdaq"})

(def DowJonesIndustrialAverageBasket
  "basket of 30 substantial stocks that are traded on the New York Stock Exchange (NYSE) and the Nasdaq"
  {:db/ident :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket,
   :fibo-fbc-pas-fpas/hasSelectionCriteria
   "The Averages Committee, which includes the managing editor of The Wall Street Journal, the head of Dow Jones Indexes research, and the head of CME Group research, determine which components become a part of the DJIA. There are no set rules the Averages Committee must follow when selecting Dow components, only broad parameters to ensure those companies represent a large portion of the overall economic performance in the United States. Each average is reviewed at least once annually, but composition changes are rare for the sake of continuity. Since its beginnings in May of 1896, the Dow Jones stocks list has only changed 54 times. As of June 2018, the last remaining company of the original 12 components of the DJIA, General Electric (GE), was replaced by Walgreens Boots Alliance.",
   :fibo-fnd-utl-alx/hasExpression
   :fibo-ind-mkt-bas/CapitalizationBasedWeightingFunction,
   :rdf/type [:fibo-ind-mkt-bas/BasketOfEquities :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/",
   :rdfs/label "Dow Jones Industrial Average basket",
   :skos/definition
   "basket of 30 substantial stocks that are traded on the New York Stock Exchange (NYSE) and the Nasdaq"})

(def DowJonesIndustrialAverageBasket-AppleIncCommonStockConstituent
  "Apple Inc. common stock constituent of the DJIA basket of 30 stocks"
  {:db/ident
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-AppleIncCommonStockConstituent,
   :fibo-fnd-arr-arr/isConstituentOf
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket,
   :fibo-fnd-dt-fd/hasDateAdded
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-AppleIncCommonStockDateAdded,
   :fibo-fnd-rel-rel/involves :fibo-sec-eq-eqind/XNASListedAppleIncCommonStock,
   :fibo-fnd-utl-alx/hasWeight 1,
   :rdf/type [:fibo-sec-sec-bsk/SecuritiesBasketConstituent
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/",
   :rdfs/label
   "Dow Jones Industrial Average basket - Apple Inc. common stock constituent",
   :skos/definition
   "Apple Inc. common stock constituent of the DJIA basket of 30 stocks"})

(def DowJonesIndustrialAverageBasket-AppleIncCommonStockDateAdded
  "individual representing the date that Apple Inc. common stock was initially added to the DJIA, replacing AT&T Inc."
  {:db/ident
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-AppleIncCommonStockDateAdded,
   :fibo-fnd-dt-fd/hasDateValue "2015-03-19",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/",
   :rdfs/label
   "Dow Jones Industrial Average basket - Apple Inc. common stock date added",
   :skos/definition
   "individual representing the date that Apple Inc. common stock was initially added to the DJIA, replacing AT&T Inc."})

(def DowJonesIndustrialAverageBasket-IBMCommonStockConstituent
  "IBM common stock constituent of the DJIA basket of 30 stocks"
  {:db/ident
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-IBMCommonStockConstituent,
   :fibo-fnd-arr-arr/isConstituentOf
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket,
   :fibo-fnd-dt-fd/hasDateAdded
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-IBMCommonStockDateAdded,
   :fibo-fnd-rel-rel/involves
   :fibo-sec-eq-eqind/XNYSListedInternationalBusinessMachinesCorporationCommonStock,
   :fibo-fnd-utl-alx/hasWeight 1,
   :rdf/type [:fibo-sec-sec-bsk/SecuritiesBasketConstituent
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/",
   :rdfs/label
   "Dow Jones Industrial Average basket - IBM common stock constituent",
   :skos/definition
   "IBM common stock constituent of the DJIA basket of 30 stocks"})

(def DowJonesIndustrialAverageBasket-IBMCommonStockDateAdded
  "individual representing the date that IBM common stock was most recently added to the DJIA"
  {:db/ident
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-IBMCommonStockDateAdded,
   :fibo-fnd-dt-fd/hasDateValue "1979-06-29",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/",
   :rdfs/label
   "Dow Jones Industrial Average basket - IBM common stock date added",
   :skos/definition
   "individual representing the date that IBM common stock was most recently added to the DJIA"})

(def DowJonesIndustrialAverageBasket-TheCoca-ColaCompanyCommonStockConstituent
  "The Coca-Cola Company common stock constituent of the DJIA basket of 30 stocks"
  {:db/ident
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-TheCoca-ColaCompanyCommonStockConstituent,
   :fibo-fnd-arr-arr/isConstituentOf
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket,
   :fibo-fnd-dt-fd/hasDateAdded
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-TheCoca-ColaCompanyCommonStockDateAdded,
   :fibo-fnd-rel-rel/involves
   :fibo-sec-eq-eqind/XNYSListedTheCoca-ColaCompanyCommonStock,
   :fibo-fnd-utl-alx/hasWeight 1,
   :rdf/type [:fibo-sec-sec-bsk/SecuritiesBasketConstituent
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/",
   :rdfs/label
   "Dow Jones Industrial Average basket - The Coca-Cola Company common stock constituent",
   :skos/definition
   "The Coca-Cola Company common stock constituent of the DJIA basket of 30 stocks"})

(def DowJonesIndustrialAverageBasket-TheCoca-ColaCompanyCommonStockDateAdded
  "individual representing the date that The Coca-Cola Company common stock was most recently added to the DJIA"
  {:db/ident
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-TheCoca-ColaCompanyCommonStockDateAdded,
   :fibo-fnd-dt-fd/hasDateValue "1987-03-12",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/",
   :rdfs/label
   "Dow Jones Industrial Average basket - The Coca-Cola Company common stock date added",
   :skos/definition
   "individual representing the date that The Coca-Cola Company common stock was most recently added to the DJIA"})

(def DowJonesIndustrialAverageBasket-TheHomeDepotCommonStockConstituent
  "The Home Depot, Inc. common stock constituent of the DJIA basket of 30 stocks"
  {:db/ident
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-TheHomeDepotCommonStockConstituent,
   :fibo-fnd-arr-arr/isConstituentOf
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket,
   :fibo-fnd-dt-fd/hasDateAdded
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-TheHomeDepotCommonStockDateAdded,
   :fibo-fnd-rel-rel/involves
   :fibo-sec-eq-eqind/XNYSListedTheHomeDepotIncCommonStock,
   :fibo-fnd-utl-alx/hasWeight 1,
   :rdf/type [:fibo-sec-sec-bsk/SecuritiesBasketConstituent
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/",
   :rdfs/label
   "Dow Jones Industrial Average basket - The Home Depot, Inc. common stock constituent",
   :skos/definition
   "The Home Depot, Inc. common stock constituent of the DJIA basket of 30 stocks"})

(def DowJonesIndustrialAverageBasket-TheHomeDepotCommonStockDateAdded
  "individual representing the date that The Home Depot, Inc. common stock was added to the DJIA"
  {:db/ident
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-TheHomeDepotCommonStockDateAdded,
   :fibo-fnd-dt-fd/hasDateValue "1999-11-01",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/",
   :rdfs/label
   "Dow Jones Industrial Average basket - The Home Depot, Inc. common stock date added",
   :skos/definition
   "individual representing the date that The Home Depot, Inc. common stock was added to the DJIA"})

(def
  DowJonesIndustrialAverageBasket-TheProctorAndGambleCompanyCommonStockConstituent
  "The Proctor & Gamble Company common stock constituent of the DJIA basket of 30 stocks"
  {:db/ident
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-TheProctorAndGambleCompanyCommonStockConstituent,
   :fibo-fnd-arr-arr/isConstituentOf
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket,
   :fibo-fnd-dt-fd/hasDateAdded
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-TheProctorAndGambleCompanyCommonStockDateAdded,
   :fibo-fnd-rel-rel/involves
   :fibo-sec-eq-eqind/XNYSListedTheProctorAndGambleCompanyCommonStock,
   :fibo-fnd-utl-alx/hasWeight 1,
   :rdf/type [:fibo-sec-sec-bsk/SecuritiesBasketConstituent
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/",
   :rdfs/label
   "Dow Jones Industrial Average basket - The Proctor & Gamble Company common stock constituent",
   :skos/definition
   "The Proctor & Gamble Company common stock constituent of the DJIA basket of 30 stocks"})

(def
  DowJonesIndustrialAverageBasket-TheProctorAndGambleCompanyCommonStockDateAdded
  "individual representing the date that The Proctor & Gamble Company common stock was added to the DJIA"
  {:db/ident
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageBasket-TheProctorAndGambleCompanyCommonStockDateAdded,
   :fibo-fnd-dt-fd/hasDateValue "1932-05-26",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/",
   :rdfs/label
   "Dow Jones Industrial Average basket - The Proctor & Gamble Company common stock date added",
   :skos/definition
   "individual representing the date that The Proctor & Gamble Company common stock was added to the DJIA"})

(def DowJonesIndustrialAverageValue-2020-03-06T120514-0500
  "individual representing the value of the DJIA on 6 Mar 2020 at 12:05:14 pm in NYC"
  {:db/ident
   :fibo-ind-mkt-eqind/DowJonesIndustrialAverageValue-2020-03-06T120514-0500,
   :fibo-fnd-acc-cur/hasRateValue 25523.2M,
   :fibo-fnd-utl-alx/isValueOf :fibo-ind-mkt-eqind/DowJonesIndustrialAverage,
   :fibo-ind-ind-ind/hasQuotationDateTime #inst "2020-03-06T17:05:14.000-00:00",
   :rdf/type [:fibo-fnd-utl-alx/NumericIndexValue :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/",
   :rdfs/label "Dow Jones Industrial Average value as of Mar 6, 2020",
   :skos/definition
   "individual representing the value of the DJIA on 6 Mar 2020 at 12:05:14 pm in NYC"})

(def SPDowJonesIndices
  "financial service and market data provider that is a global provider of index-based data and research"
  {:db/ident :fibo-ind-mkt-eqind/SPDowJonesIndices,
   :fibo-fnd-rel-rel/hasIdentity :fibo-ind-mkt-eqind/SPDowJonesIndicesLLC-US-DE,
   :rdf/type [:fibo-fbc-pas-fpas/FinancialServiceProvider
              :fibo-be-fct-pub/MarketDataProvider
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/",
   :rdfs/label "S & P Dow Jones Indices",
   :skos/definition
   "financial service and market data provider that is a global provider of index-based data and research"})

(def SPDowJonesIndicesLLC-US-DE
  "the S & P Dow Jones Indices LLC legal entity that is a Delaware limited liability company"
  {:db/ident :fibo-ind-mkt-eqind/SPDowJonesIndicesLLC-US-DE,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usfsind/SPGlobalHeadquartersAddress,
   :fibo-be-oac-cctl/hasDomesticUltimateParent :fibo-fbc-fct-usfsind/SPGlobal,
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationServiceCompany,
   :fibo-fnd-plc-vrt/hasWebsite "https://us.spindices.com/",
   :rdf/type [:fibo-be-plc-plc/PrivateCompanyWithLimitedLiability
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/",
   :rdfs/label "S & P Dow Jones Indices LLC US-DE",
   :skos/definition
   "the S & P Dow Jones Indices LLC legal entity that is a Delaware limited liability company"})

(def StandardAndPoors500CompositeIndex
  "equity index that is calculated based on the float-adjusted market capitalization of approximately 500 large companies listed on stock exchanges in the United States"
  {:db/ident :fibo-ind-mkt-eqind/StandardAndPoors500CompositeIndex,
   :fibo-be-fct-pub/hasPublisher :fibo-ind-mkt-eqind/SPDowJonesIndices,
   :fibo-fbc-dae-dbt/isBasedOn
   :fibo-ind-mkt-eqind/StandardAndPoors500CompositeIndexBasket,
   :fibo-fnd-utl-alx/isCalculatedViaMethodology
   {:rdf/language "en",
    :rdf/value
    "The components of the S&P 500 are selected by a committee. When considering the eligibility of a new addition, the committee assesses the company's merit using eight primary criteria: market capitalization, liquidity, domicile, public float, sector classification, financial viability, and length of time publicly traded and stock exchange."},
   :fibo-fnd-utl-av/abbreviation "S&P 500",
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The S&P 500 is a market capitalization-weighted index and the performance of the 10 largest companies in the index account for 21.8 percent of the performance of the index."},
   :rdf/type [:fibo-ind-mkt-bas/EquityIndex :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/",
   :rdfs/label "Standard & Poor's Composite Index",
   :skos/definition
   "equity index that is calculated based on the float-adjusted market capitalization of approximately 500 large companies listed on stock exchanges in the United States"})

(def StandardAndPoors500CompositeIndexBasket
  "basket of common shares issued by approximately 500 large-cap companies that are traded on American stock exchanges"
  {:db/ident :fibo-ind-mkt-eqind/StandardAndPoors500CompositeIndexBasket,
   :fibo-fbc-pas-fpas/hasSelectingParty
   :fibo-ind-mkt-eqind/SPDowJonesIndicesLLC-US-DE,
   :fibo-fbc-pas-fpas/hasSelectionCriteria
   "To qualify for the S&P 500, a company must meet certain committee-established criteria, which include (1) a market cap of at least $13.1 billion, (2) trading the value of its market capitalization annually, (3) at least a quarter-million of its shares have been traded in each of the previous six months (4) the majority of shares are in the public's hands, (5) being publicly traded for at least a year, and (6) earnings over the most recent four quarters and in the most recent quarter must be positive.",
   :fibo-fnd-utl-alx/hasExpression
   :fibo-ind-mkt-bas/CapitalizationBasedWeightingFunction,
   :rdf/type [:fibo-ind-mkt-bas/BasketOfEquities :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/",
   :rdfs/label "Standard & Poor's Composite Index basket",
   :skos/definition
   "basket of common shares issued by approximately 500 large-cap companies that are traded on American stock exchanges"})