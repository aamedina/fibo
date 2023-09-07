(ns net.wikipunk.rdf.fibo-bp-prc-fcp
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/",
    :namespaces
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
    :prefix "fibo-bp-prc-fcp",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"}
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcterms/abstract
   "This ontology defines process concepts in general for refinement and re-use elsewhere in the FIBO business process domain.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/Process/FinancialContextAndProcess/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Financial Context and Process Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"})

(def Clearing
  {:db/ident :fibo-bp-prc-fcp/Clearing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "clearing"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/ClearingAndSettlement,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The process by which securities trades are cleared."}})

(def ClearingAndSettlement
  {:db/ident :fibo-bp-prc-fcp/ClearingAndSettlement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "clearing and settlement"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/FinancialIndustryContext,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The business process or service area of securities clearing and settlement."}})

(def FinancialIndustryContext
  {:db/ident :fibo-bp-prc-fcp/FinancialIndustryContext,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "financial industry context"},
   :rdfs/subClassOf :cmns-cxtdsg/Context,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The context in which business activites take place within the financial industry, i.e. investment management, wholesale financial markets trading and so on."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "REVIEW: Ther precise definition above defines the Scope of this model."}})

(def FinancialMarketsRegulation
  {:db/ident :fibo-bp-prc-fcp/FinancialMarketsRegulation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "financial markets regulation"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/FinancialIndustryContext})

(def InvestmentManagement
  {:db/ident :fibo-bp-prc-fcp/InvestmentManagement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "investment management"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/FinancialIndustryContext})

(def MarketDataProvision
  {:db/ident :fibo-bp-prc-fcp/MarketDataProvision,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "market data provision"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/PreTrade})

(def PortfolioManagement
  {:db/ident :fibo-bp-prc-fcp/PortfolioManagement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "portfolio management"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/InvestmentManagement})

(def PreTrade
  {:db/ident :fibo-bp-prc-fcp/PreTrade,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pre trade"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/InvestmentManagement})

(def PretradeQuotes
  {:db/ident :fibo-bp-prc-fcp/PretradeQuotes,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pretrade quotes"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/PreTrade})

(def PretradeReferenceDataProvision
  {:db/ident :fibo-bp-prc-fcp/PretradeReferenceDataProvision,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pretrade reference data provision"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/PreTrade})

(def PrimaryMarket
  {:db/ident :fibo-bp-prc-fcp/PrimaryMarket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "primary market"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/FinancialIndustryContext,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Issuance and primary market trading of new Traded Financial Instruments"}})

(def PrimaryMarketClosing
  {:db/ident :fibo-bp-prc-fcp/PrimaryMarketClosing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "primary market closing"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/PrimaryMarket})

(def PrimaryMarketIndicationsOfInterest
  {:db/ident :fibo-bp-prc-fcp/PrimaryMarketIndicationsOfInterest,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "primary market indications of interest"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/PreTrade})

(def SecondaryMarketTradingContext
  {:db/ident :fibo-bp-prc-fcp/SecondaryMarketTradingContext,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "secondary market trading context"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/FinancialIndustryContext})

(def SecuritiesCustody
  {:db/ident :fibo-bp-prc-fcp/SecuritiesCustody,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "securities custody"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/FinancialIndustryContext})

(def SecuritiesPostTrade
  {:db/ident :fibo-bp-prc-fcp/SecuritiesPostTrade,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "securities post trade"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/FinancialIndustryContext})

(def SecuritiesPostTradePositionManagement
  {:db/ident :fibo-bp-prc-fcp/SecuritiesPostTradePositionManagement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "securities post trade position management"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/SecuritiesPostTrade})

(def SecuritiesTrade
  {:db/ident :fibo-bp-prc-fcp/SecuritiesTrade,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "securities trade"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/FinancialIndustryContext})

(def SecuritiesTradeAllocation
  {:db/ident :fibo-bp-prc-fcp/SecuritiesTradeAllocation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "securities trade allocation"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/SecuritiesPostTrade})

(def SecuritiesTradeCaptureAndValidation
  {:db/ident :fibo-bp-prc-fcp/SecuritiesTradeCaptureAndValidation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "securities trade capture and validation"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/SecuritiesPostTrade})

(def SecuritiesTradeConfirmationAffirmation
  {:db/ident :fibo-bp-prc-fcp/SecuritiesTradeConfirmationAffirmation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "securities trade confirmation affirmation"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/SecuritiesPostTrade})

(def SecuritiesTradeDatePositionReporting
  {:db/ident :fibo-bp-prc-fcp/SecuritiesTradeDatePositionReporting,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "securities trade date position reporting"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/SecuritiesTrade})

(def SecuritiesTradeExecution
  {:db/ident :fibo-bp-prc-fcp/SecuritiesTradeExecution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "securities trade execution"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/SecuritiesTrade})

(def SecuritiesTradeOrderRouting
  {:db/ident :fibo-bp-prc-fcp/SecuritiesTradeOrderRouting,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "securities trade order routing"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/SecuritiesTrade})

(def SecuritiesTradesMatching
  {:db/ident :fibo-bp-prc-fcp/SecuritiesTradesMatching,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "securities trades matching"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/SecuritiesPostTrade,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Matching of trade allegations to identify confirmed trades, on an Over the Counter market in Traded Securities."}})

(def SecuritiesTradesReporting
  {:db/ident :fibo-bp-prc-fcp/SecuritiesTradesReporting,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "securities trades reporting"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/SecuritiesPostTrade})

(def SecurityRetirement
  {:db/ident :fibo-bp-prc-fcp/SecurityRetirement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "security retirement"},
   :rdfs/subClassOf {:owl/onProperty     :fibo-bp-prc-fcp/isRetirementOf,
                     :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                     :rdf/type           :owl/Restriction}})

(def ShortSaleLocate
  {:db/ident :fibo-bp-prc-fcp/ShortSaleLocate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "short sale locate"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/PreTrade})

(def TradeAdvertisements
  {:db/ident :fibo-bp-prc-fcp/TradeAdvertisements,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "trade advertisements"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/PreTrade})

(def TradedSecurityLifecycle
  {:db/ident :fibo-bp-prc-fcp/TradedSecurityLifecycle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "traded security lifecycle"}})

(def TradesReferenceDataProvision
  {:db/ident :fibo-bp-prc-fcp/TradesReferenceDataProvision,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "trades reference data provision"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/SecuritiesTrade})

(def WhenIssuedTrading
  {:db/ident :fibo-bp-prc-fcp/WhenIssuedTrading,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "when issued trading"},
   :rdfs/subClassOf :fibo-bp-prc-fcp/PrimaryMarket})

(def isRetirementOf
  {:db/ident :fibo-bp-prc-fcp/isRetirementOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-prc-fcp/SecurityRetirement,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is retirement of"},
   :rdfs/range :fibo-fbc-fi-fi/Security})

(def urn:uuid:1bf1fe9d-0f20-5b82-9219-0a83e549cdf3
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcterms/abstract
   "This ontology defines process concepts in general for refinement and re-use elsewhere in the FIBO business process domain.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/Process/FinancialContextAndProcess/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Financial Context and Process Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"})