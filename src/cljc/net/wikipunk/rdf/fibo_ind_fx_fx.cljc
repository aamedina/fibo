(ns net.wikipunk.rdf.fibo-ind-fx-fx
  {:cmns-av/copyright #{"Copyright (c) 2014-2023 Object Management Group, Inc."
                        "Copyright (c) 2014-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/ForeignExchange/ForeignExchange/",
   :dcterms/abstract
   "This ontology provides the parameters for foreign exchange rates, covering spot and forward rates, as well as foreign exchange spot rate volatilities.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-qtu" "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-fct-fse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
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
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/Indicators/Indicators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/ForeignExchange/ForeignExchange/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-ind-fx-fx",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
   :rdfs/label "Foreign Exchange Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange.rdf version of this ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange.rdf version of this ontology was modified per the FIBO 2.0 RFC."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange.rdf version of this ontology was modified to eliminate unnecessary references, some of which had incorrect datatypes, rename FxSpotVolatility to CurrencySpotVolatility and improve its definition and related volatility definitions more generally."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange.rdf version of this ontology was modified per the issue resolutions identified in the FIBO IND 1.0 FTF 2 report, namely, to take advantage of content added via the FIBO FND 1.1 with respect to higher-level concepts of Rate, ExchangeRate, and InterestRate."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange.rdf version of this ontology was modified per the issue resolutions identified in the FIBO IND 1.0 FTF 1 report."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/"})

(def CurrencyConversionService
  {:cmns-av/explanatoryNote
   "A currency exchange service may be provided by a stand-alone business or may be part of the services offered by a bank or other financial institution. The currency exchange profits from its services either through adjusting the exchange rate or taking a commission.",
   :db/ident :fibo-ind-fx-fx/CurrencyConversionService,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/"},
   :rdfs/label "currency conversion service",
   :rdfs/subClassOf :fibo-ind-fx-fx/ForeignExchangeService,
   :skos/definition
   "foreign exchange service involving the conversion of currency of one country or group of countries for another, typically, but not always, as a counter transaction"})

(def CurrencyForwardRate
  {:db/ident :fibo-ind-fx-fx/CurrencyForwardRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/"},
   :rdfs/label "currency forward rate",
   :rdfs/subClassOf #{:fibo-ind-fx-fx/QuotedExchangeRate
                      {:owl/allValuesFrom :cmns-dt/Date,
                       :owl/onProperty    :fibo-fbc-pas-fpas/hasSettlementDate,
                       :rdf/type          :owl/Restriction}},
   :skos/definition
   "rate of exchange between two currencies for settlement at some future point in time, expressed as a premium on the spot rate"})

(def CurrencyForwardRateVolatility
  {:db/ident :fibo-ind-fx-fx/CurrencyForwardRateVolatility,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/"},
   :rdfs/label "currency forward rate volatility",
   :rdfs/subClassOf #{:fibo-ind-ind-ind/ImpliedVolatility
                      {:owl/allValuesFrom :fibo-ind-fx-fx/CurrencyForwardRate,
                       :owl/onProperty    :fibo-ind-ind-ind/isVolatilityOf,
                       :rdf/type          :owl/Restriction}
                      :fibo-ind-fx-fx/ExchangeRateVolatility},
   :skos/definition
   "measure of exchange rate fluctuation based on a range of projected values for exchange rates"})

(def CurrencySpotBuyRate
  {:db/ident :fibo-ind-fx-fx/CurrencySpotBuyRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/"},
   :rdfs/label "currency spot buy rate",
   :rdfs/subClassOf :fibo-ind-fx-fx/CurrencySpotRate,
   :skos/definition
   "indicative spot buying market rate as observed by the reporting source"})

(def CurrencySpotMidRate
  {:db/ident :fibo-ind-fx-fx/CurrencySpotMidRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/"},
   :rdfs/label "currency spot mid rate",
   :rdfs/subClassOf :fibo-ind-fx-fx/CurrencySpotRate,
   :skos/definition
   "indicative middle market (mean of spot buying and selling) rate as observed by the reporting source"})

(def CurrencySpotRate
  {:cmns-av/explanatoryNote
   "Spot rates represent the prices buyers pay in one currency to purchase a second currency. Although the spot exchange rate is for delivery on the earliest value date, the standard settlement date for most spot transactions is two business days after the transaction date.",
   :db/ident :fibo-ind-fx-fx/CurrencySpotRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/"},
   :rdfs/label "currency spot rate",
   :rdfs/subClassOf :fibo-ind-fx-fx/QuotedExchangeRate,
   :skos/definition
   "rate at which one currency may be exchanged for another for immediate delivery"})

(def CurrencySpotSellRate
  {:db/ident :fibo-ind-fx-fx/CurrencySpotSellRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/"},
   :rdfs/label "currency spot sell rate",
   :rdfs/subClassOf :fibo-ind-fx-fx/CurrencySpotRate,
   :skos/definition
   "indicative spot selling market rate as observed by the reporting source"})

(def CurrencySpotVolatility
  {:db/ident :fibo-ind-fx-fx/CurrencySpotVolatility,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/"},
   :rdfs/label "currency spot volatility",
   :rdfs/subClassOf #{:fibo-ind-ind-ind/HistoricalVolatility
                      :fibo-ind-fx-fx/ExchangeRateVolatility
                      {:owl/allValuesFrom :fibo-ind-fx-fx/CurrencySpotRate,
                       :owl/onProperty    :fibo-ind-ind-ind/isVolatilityOf,
                       :rdf/type          :owl/Restriction}},
   :skos/definition
   "measure of exchange rate fluctuation based on a range of past actual values for exchange rates"})

(def ExchangeRateStructure
  {:db/ident :fibo-ind-fx-fx/ExchangeRateStructure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/"},
   :rdfs/label "exchange rate structure",
   :rdfs/subClassOf #{:fibo-fnd-dt-fd/DatedStructuredCollection
                      {:owl/onProperty     :cmns-col/hasConstituent,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/ExchangeRate,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "structured collection of quoted or projected exchange rates, such that volatility may be constructed for the structure"})

(def ExchangeRateVolatility
  {:cmns-av/usageNote
   "Volatility is modeled here using a structured collection, comprised of a series of individual exchange rates (either projected or prior quoted rates), dates, and the source for those rates for some overall period of time",
   :db/ident :fibo-ind-fx-fx/ExchangeRateVolatility,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/"},
   :rdfs/label "exchange rate volatility",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-qtu/hasArgument,
      :owl/someValuesFrom :fibo-ind-fx-fx/ExchangeRateStructure,
      :rdf/type           :owl/Restriction} :fibo-ind-ind-ind/Volatility},
   :skos/definition
   "statistical measure of the rate of change in the rate at which one currency can be exchanged for another"})

(def ForeignExchangeService
  {:db/ident :fibo-ind-fx-fx/ForeignExchangeService,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/"},
   :rdfs/label "foreign exchange service",
   :rdfs/subClassOf :fibo-fbc-pas-fpas/FinancialService,
   :skos/definition
   "financial service involving the exchange of one currency for another, conversion of one currency for another, and transfer of money from one country to another whereby currency conversion is required"})

(def InternationalElectronicFundsTransferService
  {:cmns-av/synonym "international wire transfer",
   :db/ident :fibo-ind-fx-fx/InternationalElectronicFundsTransferService,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/"},
   :rdfs/label "international electronic funds transfer service",
   :rdfs/subClassOf #{:fibo-ind-fx-fx/ForeignExchangeService
                      :fibo-fbc-fct-fse/ElectronicFundsTransferService},
   :skos/definition
   "electronic funds transfer (EFT) service involving the transfer of funds across national borders, that may also involve currency conversion"})

(def QuotedExchangeRate
  {:cmns-av/explanatoryNote
   "An exchange rate of R represents a rate of R units of the quoted currency to 1 unit of the base currency.",
   :db/ident :fibo-ind-fx-fx/QuotedExchangeRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/"},
   :rdfs/label "quoted exchange rate",
   :rdfs/subClassOf #{:fibo-ind-ind-ind/MarketRate
                      {:owl/onClass    :fibo-fnd-acc-cur/Currency,
                       :owl/onProperty :fibo-ind-fx-fx/hasQuoteCurrency,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-acc-cur/ExchangeRate},
   :skos/definition
   "exchange rate quoted at a specific point in time, for a given block amount of currency as quoted against another (base) currency"})

(def hasQuotationBlockAmountBasis
  {:db/ident :fibo-ind-fx-fx/hasQuotationBlockAmountBasis,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-ind-fx-fx/QuotedExchangeRate,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/"},
   :rdfs/label "has quotation block amount basis",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   "indicates the amount of the dealt currency which would be exchanged in a trade for which the stated spot rate applies"})

(def hasQuotationSettlementBasis
  {:db/ident :fibo-ind-fx-fx/hasQuotationSettlementBasis,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-ind-fx-fx/QuotedExchangeRate,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/"},
   :rdfs/label "has quotation settlement basis",
   :rdfs/range :cmns-dt/Duration,
   :rdfs/subPropertyOf :cmns-dt/hasDuration,
   :skos/definition
   "indicates the settlement period for a trade for which the stated spot rate applies"})

(def hasQuoteCurrency
  {:db/ident :fibo-ind-fx-fx/hasQuoteCurrency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/"},
   :rdfs/label "has quote currency",
   :rdfs/range :fibo-fnd-acc-cur/Currency,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasDealtCurrency,
   :skos/definition
   "indicates the quote currency in an exchange rate; R units of this currency represent one unit of the base currency"})

(def isPremiumOn
  {:db/ident :fibo-ind-fx-fx/isPremiumOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-ind-fx-fx/CurrencyForwardRate,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/"},
   :rdfs/label "is premium on",
   :rdfs/range :fibo-ind-fx-fx/QuotedExchangeRate,
   :skos/definition
   "an exchange rate expressed as a premium on the spot rate for the currency pair"})

(def urn:uuid:5e759fda-5865-51e5-ae76-5c2ec0319c8b
  {:cmns-av/copyright #{"Copyright (c) 2014-2023 Object Management Group, Inc."
                        "Copyright (c) 2014-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology provides the parameters for foreign exchange rates, covering spot and forward rates, as well as foreign exchange spot rate volatilities.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/Indicators/Indicators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/ForeignExchange/ForeignExchange/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Foreign Exchange Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange.rdf version of this ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange.rdf version of this ontology was modified per the FIBO 2.0 RFC."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange.rdf version of this ontology was modified to eliminate unnecessary references, some of which had incorrect datatypes, rename FxSpotVolatility to CurrencySpotVolatility and improve its definition and related volatility definitions more generally."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange.rdf version of this ontology was modified per the issue resolutions identified in the FIBO IND 1.0 FTF 2 report, namely, to take advantage of content added via the FIBO FND 1.1 with respect to higher-level concepts of Rate, ExchangeRate, and InterestRate."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange.rdf version of this ontology was modified per the issue resolutions identified in the FIBO IND 1.0 FTF 1 report."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/"})