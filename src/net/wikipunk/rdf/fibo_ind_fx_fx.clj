(ns net.wikipunk.rdf.fibo-ind-fx-fx
  "This ontology provides the parameters for foreign exchange rates, covering spot and forward rates, as well as foreign exchange spot rate volatilities."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
   :dcterms/abstract
   "This ontology provides the parameters for foreign exchange rates, covering spot and forward rates, as well as foreign exchange spot rate volatilities.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Arrangements/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/Indicators/Indicators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/FinancialServicesEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/ForeignExchange/ForeignExchange/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-fct-fse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-arr-arr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-utl-alx"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-fx-fx"
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
    "fibo-ind-ind-ind"
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
   :rdfa/prefix "fibo-ind-fx-fx",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
   :rdfs/label "Foreign Exchange Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange.rdf version of this ontology was modified per the issue resolutions identified in the FIBO IND 1.0 FTF 2 report, namely, to take advantage of content added via the FIBO FND 1.1 with respect to higher-level concepts of Rate, ExchangeRate, and InterestRate."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange.rdf version of this ontology was modified per the FIBO 2.0 RFC."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange.rdf version of this ontology was modified to eliminate deprecated elements."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange.rdf version of this ontology was modified to eliminate unnecessary references, some of which had incorrect datatypes, rename FxSpotVolatility to CurrencySpotVolatility and improve its definition and related volatility definitions more generally."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange.rdf version of this ontology was modified per the issue resolutions identified in the FIBO IND 1.0 FTF 1 report."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2014-2021 EDM Council, Inc."
                  "Copyright (c) 2014-2021 Object Management Group, Inc."],
   :sm/dependsOn
   ["https://spec.edmcouncil.org/fibo/ontology/Indicators/Indicators/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/"],
   :sm/fileAbbreviation "fibo-ind-fx-fx",
   :sm/filename "ForeignExchange.rdf"})

(def CurrencyConversionService
  "foreign exchange service involving the conversion of currency of one country or group of countries for another, typically, but not always, as a counter transaction"
  {:db/ident :fibo-ind-fx-fx/CurrencyConversionService,
   :fibo-fnd-utl-av/explanatoryNote
   "A currency exchange service may be provided by a stand-alone business or may be part of the services offered by a bank or other financial institution. The currency exchange profits from its services either through adjusting the exchange rate or taking a commission.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
   :rdfs/label "currency conversion service",
   :rdfs/subClassOf :fibo-ind-fx-fx/ForeignExchangeService,
   :skos/definition
   "foreign exchange service involving the conversion of currency of one country or group of countries for another, typically, but not always, as a counter transaction"})

(def CurrencyForwardRate
  "rate of exchange between two currencies for settlement at some future point in time, expressed as a premium on the spot rate"
  {:db/ident :fibo-ind-fx-fx/CurrencyForwardRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
   :rdfs/label "currency forward rate",
   :rdfs/subClassOf [{:owl/allValuesFrom :fibo-fnd-dt-fd/Date,
                      :owl/onProperty    :fibo-fbc-pas-fpas/hasSettlementDate,
                      :rdf/type          :owl/Restriction}
                     :fibo-ind-fx-fx/QuotedExchangeRate],
   :skos/definition
   "rate of exchange between two currencies for settlement at some future point in time, expressed as a premium on the spot rate"})

(def CurrencyForwardRateVolatility
  "measure of exchange rate fluctuation based on a range of projected values for exchange rates"
  {:db/ident :fibo-ind-fx-fx/CurrencyForwardRateVolatility,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
   :rdfs/label "currency forward rate volatility",
   :rdfs/subClassOf [{:owl/allValuesFrom :fibo-ind-fx-fx/CurrencyForwardRate,
                      :owl/onProperty    :fibo-ind-ind-ind/isVolatilityOf,
                      :rdf/type          :owl/Restriction}
                     :fibo-ind-ind-ind/ImpliedVolatility
                     :fibo-ind-fx-fx/ExchangeRateVolatility],
   :skos/definition
   "measure of exchange rate fluctuation based on a range of projected values for exchange rates"})

(def CurrencySpotBuyRate
  "indicative spot buying market rate as observed by the reporting source"
  {:db/ident :fibo-ind-fx-fx/CurrencySpotBuyRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
   :rdfs/label "currency spot buy rate",
   :rdfs/subClassOf :fibo-ind-fx-fx/CurrencySpotRate,
   :skos/definition
   "indicative spot buying market rate as observed by the reporting source"})

(def CurrencySpotMidRate
  "indicative middle market (mean of spot buying and selling) rate as observed by the reporting source"
  {:db/ident :fibo-ind-fx-fx/CurrencySpotMidRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
   :rdfs/label "currency spot mid rate",
   :rdfs/subClassOf :fibo-ind-fx-fx/CurrencySpotRate,
   :skos/definition
   "indicative middle market (mean of spot buying and selling) rate as observed by the reporting source"})

(def CurrencySpotRate
  "rate at which one currency may be exchanged for another for immediate delivery"
  {:db/ident :fibo-ind-fx-fx/CurrencySpotRate,
   :fibo-fnd-utl-av/explanatoryNote
   "Spot rates represent the prices buyers pay in one currency to purchase a second currency. Although the spot exchange rate is for delivery on the earliest value date, the standard settlement date for most spot transactions is two business days after the transaction date.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
   :rdfs/label "currency spot rate",
   :rdfs/subClassOf :fibo-ind-fx-fx/QuotedExchangeRate,
   :skos/definition
   "rate at which one currency may be exchanged for another for immediate delivery"})

(def CurrencySpotSellRate
  "indicative spot selling market rate as observed by the reporting source"
  {:db/ident :fibo-ind-fx-fx/CurrencySpotSellRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
   :rdfs/label "currency spot sell rate",
   :rdfs/subClassOf :fibo-ind-fx-fx/CurrencySpotRate,
   :skos/definition
   "indicative spot selling market rate as observed by the reporting source"})

(def CurrencySpotVolatility
  "measure of exchange rate fluctuation based on a range of past actual values for exchange rates"
  {:db/ident :fibo-ind-fx-fx/CurrencySpotVolatility,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
   :rdfs/label "currency spot volatility",
   :rdfs/subClassOf [{:owl/allValuesFrom :fibo-ind-fx-fx/CurrencySpotRate,
                      :owl/onProperty    :fibo-ind-ind-ind/isVolatilityOf,
                      :rdf/type          :owl/Restriction}
                     :fibo-ind-ind-ind/HistoricalVolatility
                     :fibo-ind-fx-fx/ExchangeRateVolatility],
   :skos/definition
   "measure of exchange rate fluctuation based on a range of past actual values for exchange rates"})

(def ExchangeRateStructure
  "structured collection of quoted or projected exchange rates, such that volatility may be constructed for the structure"
  {:db/ident :fibo-ind-fx-fx/ExchangeRateStructure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
   :rdfs/label "exchange rate structure",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-arr/hasConstituent,
                      :owl/someValuesFrom :fibo-fnd-acc-cur/ExchangeRate,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-fd/DatedStructuredCollection],
   :skos/definition
   "structured collection of quoted or projected exchange rates, such that volatility may be constructed for the structure"})

(def ExchangeRateVolatility
  "statistical measure of the rate of change in the rate at which one currency can be exchanged for another"
  {:db/ident :fibo-ind-fx-fx/ExchangeRateVolatility,
   :fibo-fnd-utl-av/usageNote
   "Volatility is modeled here using a structured collection, comprised of a series of individual exchange rates (either projected or prior quoted rates), dates, and the source for those rates for some overall period of time",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
   :rdfs/label "exchange rate volatility",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
                      :owl/someValuesFrom :fibo-ind-fx-fx/ExchangeRateStructure,
                      :rdf/type           :owl/Restriction}
                     :fibo-ind-ind-ind/Volatility],
   :skos/definition
   "statistical measure of the rate of change in the rate at which one currency can be exchanged for another"})

(def ForeignExchangeService
  "financial service involving the exchange of one currency for another, conversion of one currency for another, and transfer of money from one country to another whereby currency conversion is required"
  {:db/ident :fibo-ind-fx-fx/ForeignExchangeService,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
   :rdfs/label "foreign exchange service",
   :rdfs/subClassOf :fibo-fbc-pas-fpas/FinancialService,
   :skos/definition
   "financial service involving the exchange of one currency for another, conversion of one currency for another, and transfer of money from one country to another whereby currency conversion is required"})

(def InternationalElectronicFundsTransferService
  "electronic funds transfer (EFT) service involving the transfer of funds across national borders, that may also involve currency conversion"
  {:db/ident :fibo-ind-fx-fx/InternationalElectronicFundsTransferService,
   :fibo-fnd-utl-av/synonym "international wire transfer",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
   :rdfs/label "international electronic funds transfer service",
   :rdfs/subClassOf [:fibo-ind-fx-fx/ForeignExchangeService
                     :fibo-fbc-fct-fse/ElectronicFundsTransferService],
   :skos/definition
   "electronic funds transfer (EFT) service involving the transfer of funds across national borders, that may also involve currency conversion"})

(def QuotedExchangeRate
  "exchange rate quoted at a specific point in time, for a given block amount of currency as quoted against another (base) currency"
  {:db/ident :fibo-ind-fx-fx/QuotedExchangeRate,
   :fibo-fnd-utl-av/explanatoryNote
   "An exchange rate of R represents a rate of R units of the quoted currency to 1 unit of the base currency.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
   :rdfs/label "quoted exchange rate",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fnd-acc-cur/Currency,
                      :owl/onProperty :fibo-ind-fx-fx/hasQuoteCurrency,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-ind-ind-ind/MarketRate
                     :fibo-fnd-acc-cur/ExchangeRate],
   :skos/definition
   "exchange rate quoted at a specific point in time, for a given block amount of currency as quoted against another (base) currency"})

(def hasQuotationBlockAmountBasis
  "indicates the amount of the dealt currency which would be exchanged in a trade for which the stated spot rate applies"
  {:db/ident :fibo-ind-fx-fx/hasQuotationBlockAmountBasis,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-ind-fx-fx/QuotedExchangeRate,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
   :rdfs/label "has quotation block amount basis",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   "indicates the amount of the dealt currency which would be exchanged in a trade for which the stated spot rate applies"})

(def hasQuotationSettlementBasis
  "indicates the settlement period for a trade for which the stated spot rate applies"
  {:db/ident :fibo-ind-fx-fx/hasQuotationSettlementBasis,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-ind-fx-fx/QuotedExchangeRate,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
   :rdfs/label "has quotation settlement basis",
   :rdfs/range :fibo-fnd-dt-fd/Duration,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasDuration,
   :skos/definition
   "indicates the settlement period for a trade for which the stated spot rate applies"})

(def hasQuoteCurrency
  "indicates the quote currency in an exchange rate; R units of this currency represent one unit of the base currency"
  {:db/ident :fibo-ind-fx-fx/hasQuoteCurrency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
   :rdfs/label "has quote currency",
   :rdfs/range :fibo-fnd-acc-cur/Currency,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasDealtCurrency,
   :skos/definition
   "indicates the quote currency in an exchange rate; R units of this currency represent one unit of the base currency"})

(def isPremiumOn
  "an exchange rate expressed as a premium on the spot rate for the currency pair"
  {:db/ident :fibo-ind-fx-fx/isPremiumOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-ind-fx-fx/CurrencyForwardRate,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
   :rdfs/label "is premium on",
   :rdfs/range :fibo-ind-fx-fx/QuotedExchangeRate,
   :skos/definition
   "an exchange rate expressed as a premium on the spot rate for the currency pair"})