(ns net.wikipunk.rdf.fibo-bp-prc-fcp
  "This ontology defines process concepts in general for refinement and re-use elsewhere in the FIBO business process domain."
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/",
   :dcterms/abstract
   "This ontology defines process concepts in general for refinement and re-use elsewhere in the FIBO business process domain.",
   :dcterms/license {:rdfa/uri "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   [{:rdfa/uri "https://www.omg.org/spec/Commons/ContextualDesignators/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/Process/FinancialContextAndProcess/"},
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-bp-prc-fcp"
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-bp-prc-fcp",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/",
   :rdfs/label #xsd/langString "Financial Context and Process Ontology@en"})

(def Clearing
  "The process by which securities trades are cleared."
  {:db/ident :fibo-bp-prc-fcp/Clearing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "clearing@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/ClearingAndSettlement
                     :cmns-cxtdsg/Context
                     :fibo-bp-prc-fcp/FinancialIndustryContext],
   :skos/definition #xsd/langString
                     "The process by which securities trades are cleared.@en"})

(def ClearingAndSettlement
  "The business process or service area of securities clearing and settlement."
  {:db/ident :fibo-bp-prc-fcp/ClearingAndSettlement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "clearing and settlement@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/FinancialIndustryContext
                     :cmns-cxtdsg/Context],
   :skos/definition
   #xsd/langString
    "The business process or service area of securities clearing and settlement.@en"})

(def FinancialIndustryContext
  "The context in which business activites take place within the financial industry, i.e. investment management, wholesale financial markets trading and so on."
  {:db/ident :fibo-bp-prc-fcp/FinancialIndustryContext,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "financial industry context@en",
   :rdfs/subClassOf :cmns-cxtdsg/Context,
   :skos/definition
   #xsd/langString
    "The context in which business activites take place within the financial industry, i.e. investment management, wholesale financial markets trading and so on.@en",
   :skos/editorialNote
   #xsd/langString
    "REVIEW: Ther precise definition above defines the Scope of this model.@en"})

(def FinancialMarketsRegulation
  "financial markets regulation"
  {:db/ident :fibo-bp-prc-fcp/FinancialMarketsRegulation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "financial markets regulation@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/FinancialIndustryContext
                     :cmns-cxtdsg/Context]})

(def InvestmentManagement
  "investment management"
  {:db/ident :fibo-bp-prc-fcp/InvestmentManagement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "investment management@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/FinancialIndustryContext
                     :cmns-cxtdsg/Context]})

(def MarketDataProvision
  "market data provision"
  {:db/ident :fibo-bp-prc-fcp/MarketDataProvision,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "market data provision@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/PreTrade
                     :cmns-cxtdsg/Context
                     :fibo-bp-prc-fcp/InvestmentManagement
                     :fibo-bp-prc-fcp/FinancialIndustryContext]})

(def PortfolioManagement
  "portfolio management"
  {:db/ident :fibo-bp-prc-fcp/PortfolioManagement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "portfolio management@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/InvestmentManagement
                     :cmns-cxtdsg/Context
                     :fibo-bp-prc-fcp/FinancialIndustryContext]})

(def PreTrade
  "pre trade"
  {:db/ident :fibo-bp-prc-fcp/PreTrade,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "pre trade@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/InvestmentManagement
                     :cmns-cxtdsg/Context
                     :fibo-bp-prc-fcp/FinancialIndustryContext]})

(def PretradeQuotes
  "pretrade quotes"
  {:db/ident :fibo-bp-prc-fcp/PretradeQuotes,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "pretrade quotes@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/PreTrade
                     :cmns-cxtdsg/Context
                     :fibo-bp-prc-fcp/InvestmentManagement
                     :fibo-bp-prc-fcp/FinancialIndustryContext]})

(def PretradeReferenceDataProvision
  "pretrade reference data provision"
  {:db/ident :fibo-bp-prc-fcp/PretradeReferenceDataProvision,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "pretrade reference data provision@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/PreTrade
                     :cmns-cxtdsg/Context
                     :fibo-bp-prc-fcp/InvestmentManagement
                     :fibo-bp-prc-fcp/FinancialIndustryContext]})

(def PrimaryMarket
  "Issuance and primary market trading of new Traded Financial Instruments"
  {:db/ident :fibo-bp-prc-fcp/PrimaryMarket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "primary market@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/FinancialIndustryContext
                     :cmns-cxtdsg/Context],
   :skos/definition
   #xsd/langString
    "Issuance and primary market trading of new Traded Financial Instruments@en"})

(def PrimaryMarketClosing
  "primary market closing"
  {:db/ident :fibo-bp-prc-fcp/PrimaryMarketClosing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "primary market closing@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/PrimaryMarket
                     :cmns-cxtdsg/Context
                     :fibo-bp-prc-fcp/FinancialIndustryContext]})

(def PrimaryMarketIndicationsOfInterest
  "primary market indications of interest"
  {:db/ident :fibo-bp-prc-fcp/PrimaryMarketIndicationsOfInterest,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "primary market indications of interest@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/PreTrade
                     :cmns-cxtdsg/Context
                     :fibo-bp-prc-fcp/InvestmentManagement
                     :fibo-bp-prc-fcp/FinancialIndustryContext]})

(def SecondaryMarketTradingContext
  "secondary market trading context"
  {:db/ident :fibo-bp-prc-fcp/SecondaryMarketTradingContext,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "secondary market trading context@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/FinancialIndustryContext
                     :cmns-cxtdsg/Context]})

(def SecuritiesCustody
  "securities custody"
  {:db/ident :fibo-bp-prc-fcp/SecuritiesCustody,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "securities custody@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/FinancialIndustryContext
                     :cmns-cxtdsg/Context]})

(def SecuritiesPostTrade
  "securities post trade"
  {:db/ident :fibo-bp-prc-fcp/SecuritiesPostTrade,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "securities post trade@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/FinancialIndustryContext
                     :cmns-cxtdsg/Context]})

(def SecuritiesPostTradePositionManagement
  "securities post trade position management"
  {:db/ident :fibo-bp-prc-fcp/SecuritiesPostTradePositionManagement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "securities post trade position management@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/SecuritiesPostTrade
                     :cmns-cxtdsg/Context
                     :fibo-bp-prc-fcp/FinancialIndustryContext]})

(def SecuritiesTrade
  "securities trade"
  {:db/ident :fibo-bp-prc-fcp/SecuritiesTrade,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "securities trade@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/FinancialIndustryContext
                     :cmns-cxtdsg/Context]})

(def SecuritiesTradeAllocation
  "securities trade allocation"
  {:db/ident :fibo-bp-prc-fcp/SecuritiesTradeAllocation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "securities trade allocation@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/SecuritiesPostTrade
                     :cmns-cxtdsg/Context
                     :fibo-bp-prc-fcp/FinancialIndustryContext]})

(def SecuritiesTradeCaptureAndValidation
  "securities trade capture and validation"
  {:db/ident :fibo-bp-prc-fcp/SecuritiesTradeCaptureAndValidation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "securities trade capture and validation@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/SecuritiesPostTrade
                     :cmns-cxtdsg/Context
                     :fibo-bp-prc-fcp/FinancialIndustryContext]})

(def SecuritiesTradeConfirmationAffirmation
  "securities trade confirmation affirmation"
  {:db/ident :fibo-bp-prc-fcp/SecuritiesTradeConfirmationAffirmation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "securities trade confirmation affirmation@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/SecuritiesPostTrade
                     :cmns-cxtdsg/Context
                     :fibo-bp-prc-fcp/FinancialIndustryContext]})

(def SecuritiesTradeDatePositionReporting
  "securities trade date position reporting"
  {:db/ident :fibo-bp-prc-fcp/SecuritiesTradeDatePositionReporting,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "securities trade date position reporting@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/SecuritiesTrade
                     :cmns-cxtdsg/Context
                     :fibo-bp-prc-fcp/FinancialIndustryContext]})

(def SecuritiesTradeExecution
  "securities trade execution"
  {:db/ident :fibo-bp-prc-fcp/SecuritiesTradeExecution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "securities trade execution@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/SecuritiesTrade
                     :cmns-cxtdsg/Context
                     :fibo-bp-prc-fcp/FinancialIndustryContext]})

(def SecuritiesTradeOrderRouting
  "securities trade order routing"
  {:db/ident :fibo-bp-prc-fcp/SecuritiesTradeOrderRouting,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "securities trade order routing@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/SecuritiesTrade
                     :cmns-cxtdsg/Context
                     :fibo-bp-prc-fcp/FinancialIndustryContext]})

(def SecuritiesTradesMatching
  "Matching of trade allegations to identify confirmed trades, on an Over the Counter market in Traded Securities."
  {:db/ident :fibo-bp-prc-fcp/SecuritiesTradesMatching,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "securities trades matching@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/SecuritiesPostTrade
                     :cmns-cxtdsg/Context
                     :fibo-bp-prc-fcp/FinancialIndustryContext],
   :skos/definition
   #xsd/langString
    "Matching of trade allegations to identify confirmed trades, on an Over the Counter market in Traded Securities.@en"})

(def SecuritiesTradesReporting
  "securities trades reporting"
  {:db/ident :fibo-bp-prc-fcp/SecuritiesTradesReporting,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "securities trades reporting@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/SecuritiesPostTrade
                     :cmns-cxtdsg/Context
                     :fibo-bp-prc-fcp/FinancialIndustryContext]})

(def SecurityRetirement
  "security retirement"
  {:db/ident :fibo-bp-prc-fcp/SecurityRetirement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "security retirement@en",
   :rdfs/subClassOf {:owl/onProperty     :fibo-bp-prc-fcp/isRetirementOf,
                     :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                     :rdf/type           :owl/Restriction}})

(def ShortSaleLocate
  "short sale locate"
  {:db/ident :fibo-bp-prc-fcp/ShortSaleLocate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "short sale locate@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/PreTrade
                     :cmns-cxtdsg/Context
                     :fibo-bp-prc-fcp/InvestmentManagement
                     :fibo-bp-prc-fcp/FinancialIndustryContext]})

(def TradeAdvertisements
  "trade advertisements"
  {:db/ident :fibo-bp-prc-fcp/TradeAdvertisements,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "trade advertisements@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/PreTrade
                     :cmns-cxtdsg/Context
                     :fibo-bp-prc-fcp/InvestmentManagement
                     :fibo-bp-prc-fcp/FinancialIndustryContext]})

(def TradedSecurityLifecycle
  "traded security lifecycle"
  {:db/ident :fibo-bp-prc-fcp/TradedSecurityLifecycle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "traded security lifecycle@en"})

(def TradesReferenceDataProvision
  "trades reference data provision"
  {:db/ident :fibo-bp-prc-fcp/TradesReferenceDataProvision,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "trades reference data provision@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/SecuritiesTrade
                     :cmns-cxtdsg/Context
                     :fibo-bp-prc-fcp/FinancialIndustryContext]})

(def WhenIssuedTrading
  "when issued trading"
  {:db/ident :fibo-bp-prc-fcp/WhenIssuedTrading,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "when issued trading@en",
   :rdfs/subClassOf [:fibo-bp-prc-fcp/PrimaryMarket
                     :cmns-cxtdsg/Context
                     :fibo-bp-prc-fcp/FinancialIndustryContext]})

(def isRetirementOf
  "is retirement of"
  {:db/ident :fibo-bp-prc-fcp/isRetirementOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-prc-fcp/SecurityRetirement,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label #xsd/langString "is retirement of@en",
   :rdfs/range :fibo-fbc-fi-fi/Security})