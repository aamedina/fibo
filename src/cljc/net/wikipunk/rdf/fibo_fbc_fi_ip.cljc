(ns net.wikipunk.rdf.fibo-fbc-fi-ip
  "This ontology provides a basic set of definitions related to pricing, yield, and spread that are extended in other instrument-specific ontologies."
  {:cmns-av/copyright ["Copyright (c) 2020-2023 Object Management Group, Inc."
                       "Copyright (c) 2020-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :dcterms/abstract
   "This ontology provides a basic set of definitions related to pricing, yield, and spread that are extended in other instrument-specific ontologies.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://www.omg.org/spec/Commons/DatesAndTimes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/Ownership/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Quantities/QuantitiesAndUnits/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/Markets/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/Publishers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/GoalsAndObjectives/Objectives/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/InstrumentPricing/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-fct-pub"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
    "fibo-fbc-fct-mkt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fbc-fi-ip"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
    "fibo-fnd-qt-qtu"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-alx"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-fi-ip",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "Instrument Pricing Ontology@en",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of this ontology was modified to address text formatting issues uncovered by hygiene testing."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of this ontology was modified to add trading day and trading session, to address ambiguity in some definitions, to add adjusted price and to create a more general hasLotSize property that can be used in various contexts."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of this ontology was modified to reflect the move of dated collection from arrangements to financial dates."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of this ontology was modified to eliminate a redundant restriction on CollectionOfSecurityPrices, better integrate pricing methods, loosen the domain restriction on hasPricingSource and add dealer to the set of possible sources for prices."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of this ontology was modified to replace a redundant concept, calculation formula with formula, add a general price determination class needed for options, add a restriction on SecurityPrice to point to the security, and add hasRoundLotSize."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of this ontology was modified to change one of the subclasses of price determination method to a named individual and correct the definition of mean price determination. Note that there may be multiple individuals of type 'closing price determination method', depending on the exchange and other factors. Also revised the lot size properties to have a range of xsd:decimal to allow for fractional shares or number of elements, revised the explanatory note, and added examples."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."]})

(def AdjustedClosingPrice
  "amended closing price to reflect a security's value after accounting for any corporate actions, such as stock splits, dividends, and rights offerings"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "A particularly dramatic change in price occurs when a company announces a stock split. When the change is made, the price displayed will immediately reflect the split. For example, if a company splits its stock 2-for-1, the last closing price will be cut in half. That's the adjusted closing price.@en",
   :db/ident :fibo-fbc-fi-ip/AdjustedClosingPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "adjusted closing price@en",
   :rdfs/subClassOf [:fibo-fbc-fi-ip/ClosingPrice
                     :fibo-fbc-fi-ip/MarketPrice
                     :fibo-fbc-fi-ip/SecurityPrice
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :cmns-dt/hasObservedDateTime,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty :fibo-fbc-fi-ip/hasPricingSource,
                      :owl/someValuesFrom
                      {:owl/unionOf [:fibo-be-fct-pub/Publisher
                                     :fibo-fbc-pas-fpas/Dealer
                                     :fibo-fbc-pas-fpas/FinancialServiceProvider
                                     :fibo-fbc-fct-mkt/Exchange
                                     :fibo-fbc-fi-ip/CompositeMarket],
                       :rdf/type    :owl/Class},
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-acc-cur/isPriceFor,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-cur/MonetaryPrice
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass {:owl/unionOf
                                    [:fibo-be-fct-pub/Publisher
                                     :fibo-fbc-pas-fpas/FinancialServiceProvider
                                     :fibo-fbc-pas-fpas/Dealer
                                     :fibo-fbc-fi-ip/PricingModel
                                     :fibo-fbc-fct-mkt/Exchange
                                     :fibo-fbc-fi-ip/CompositeMarket],
                                    :rdf/type :owl/Class},
                      :owl/onProperty :fibo-fbc-fi-ip/hasPricingSource,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "amended closing price to reflect a security's value after accounting for any corporate actions, such as stock splits, dividends, and rights offerings@en"})

(def BestBid
  "highest bid price a prospective buyer is willing to pay at a particular time for a given security"
  {:db/ident :fibo-fbc-fi-ip/BestBid,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "best bid@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fi-ip/BidPrice
                     :fibo-fbc-fi-ip/SecurityPrice
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :cmns-dt/hasObservedDateTime,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-acc-cur/isPriceFor,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-cur/MonetaryPrice
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass {:owl/unionOf
                                    [:fibo-be-fct-pub/Publisher
                                     :fibo-fbc-pas-fpas/FinancialServiceProvider
                                     :fibo-fbc-pas-fpas/Dealer
                                     :fibo-fbc-fi-ip/PricingModel
                                     :fibo-fbc-fct-mkt/Exchange
                                     :fibo-fbc-fi-ip/CompositeMarket],
                                    :rdf/type :owl/Class},
                      :owl/onProperty :fibo-fbc-fi-ip/hasPricingSource,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "highest bid price a prospective buyer is willing to pay at a particular time for a given security@en"})

(def BestOffer
  "lowest price acceptable to a prospective seller for a given security at a particular point in time"
  {:db/ident :fibo-fbc-fi-ip/BestOffer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "best offer@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fi-ip/OfferPrice
                     :fibo-fbc-fi-ip/SecurityPrice
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :cmns-dt/hasObservedDateTime,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-acc-cur/isPriceFor,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-cur/MonetaryPrice
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass {:owl/unionOf
                                    [:fibo-be-fct-pub/Publisher
                                     :fibo-fbc-pas-fpas/FinancialServiceProvider
                                     :fibo-fbc-pas-fpas/Dealer
                                     :fibo-fbc-fi-ip/PricingModel
                                     :fibo-fbc-fct-mkt/Exchange
                                     :fibo-fbc-fi-ip/CompositeMarket],
                                    :rdf/type :owl/Class},
                      :owl/onProperty :fibo-fbc-fi-ip/hasPricingSource,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "lowest price acceptable to a prospective seller for a given security at a particular point in time@en"})

(def BidAskSpread
  "difference between an offer (ask) price and a bid price"
  {:db/ident :fibo-fbc-fi-ip/BidAskSpread,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "bid ask spread@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
                      :owl/someValuesFrom :fibo-fbc-fi-ip/OfferPrice,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
                      :owl/someValuesFrom :fibo-fbc-fi-ip/BidPrice,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-ip/PriceSpread
                     :fibo-fnd-utl-alx/Difference
                     {:owl/onClass    :fibo-fnd-acc-cur/MonetaryPrice,
                      :owl/onProperty :fibo-fnd-utl-alx/hasArgument,
                      :owl/qualifiedCardinality 2,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #voc/lstr "difference between an offer (ask) price and a bid price@en"})

(def BidPrice
  "price a prospective buyer is willing to pay"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "The term 'bid price' is used by traders / market makers with respect to a given security, and that are prepared to buy or sell round lots at publicly quoted prices, and by specialists in certain instruments that perform similar functions on an exchange.@en",
   :db/ident :fibo-fbc-fi-ip/BidPrice,
   :owl/disjointWith :fibo-fbc-fi-ip/OfferPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "bid price@en",
   :rdfs/subClassOf [:fibo-fbc-fi-ip/SecurityPrice
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :cmns-dt/hasObservedDateTime,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-acc-cur/isPriceFor,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-cur/MonetaryPrice
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass {:owl/unionOf
                                    [:fibo-be-fct-pub/Publisher
                                     :fibo-fbc-pas-fpas/FinancialServiceProvider
                                     :fibo-fbc-pas-fpas/Dealer
                                     :fibo-fbc-fi-ip/PricingModel
                                     :fibo-fbc-fct-mkt/Exchange
                                     :fibo-fbc-fi-ip/CompositeMarket],
                                    :rdf/type :owl/Class},
                      :owl/onProperty :fibo-fbc-fi-ip/hasPricingSource,
                      :rdf/type :owl/Restriction}],
   :skos/definition #voc/lstr "price a prospective buyer is willing to pay@en"})

(def ClosingPrice
  "cash value of the last transacted price before the market closes"
  {:db/ident :fibo-fbc-fi-ip/ClosingPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "closing price@en",
   :rdfs/subClassOf [:fibo-fbc-fi-ip/MarketPrice
                     :fibo-fbc-fi-ip/SecurityPrice
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :cmns-dt/hasObservedDateTime,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty :fibo-fbc-fi-ip/hasPricingSource,
                      :owl/someValuesFrom
                      {:owl/unionOf [:fibo-be-fct-pub/Publisher
                                     :fibo-fbc-pas-fpas/Dealer
                                     :fibo-fbc-pas-fpas/FinancialServiceProvider
                                     :fibo-fbc-fct-mkt/Exchange
                                     :fibo-fbc-fi-ip/CompositeMarket],
                       :rdf/type    :owl/Class},
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-acc-cur/isPriceFor,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-cur/MonetaryPrice
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass {:owl/unionOf
                                    [:fibo-be-fct-pub/Publisher
                                     :fibo-fbc-pas-fpas/FinancialServiceProvider
                                     :fibo-fbc-pas-fpas/Dealer
                                     :fibo-fbc-fi-ip/PricingModel
                                     :fibo-fbc-fct-mkt/Exchange
                                     :fibo-fbc-fi-ip/CompositeMarket],
                                    :rdf/type :owl/Class},
                      :owl/onProperty :fibo-fbc-fi-ip/hasPricingSource,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "cash value of the last transacted price before the market closes@en"})

(def ClosingPriceDeterminationMethod
  "strategy for calculating or otherwise determining an official closing price"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "The official closing price is typically the final price at which something trades during regular market hours on an exchange or trading venue. Because of the evolving nature of online trading in a 24 hour world, every exchange has a method of calculating its official closing price, although that methodology changes from time to time. They may also publish an adjusted closing price, which reflects changes to the price that reflect corporate actions and after hours trading that occur before the opening of the exchange on the following day. Understanding how the closing price is determined is important to ensure price comparability for a given security across exchanges.@en",
   :db/ident :fibo-fbc-fi-ip/ClosingPriceDeterminationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "closing price determination method@en",
   :rdfs/subClassOf [:fibo-fbc-fi-ip/PriceDeterminationMethod
                     :fibo-fnd-gao-obj/Strategy],
   :skos/definition
   #voc/lstr
    "strategy for calculating or otherwise determining an official closing price@en"})

(def CollectionOfSecurityPrices
  "collection consisting of a series of prices, each of which has a specific date and time associated with it, for some security"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Note that such a collection is of prices that may be quoted or may be established through analysis, such as an average over a number of markets (composite market) or developed via some pricing model (e.g., matrix pricing).@en",
   :db/ident :fibo-fbc-fi-ip/CollectionOfSecurityPrices,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "collection of security prices@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-fbc-fi-ip/SecurityPrice,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-fd/DatedStructuredCollection],
   :skos/definition
   #voc/lstr
    "collection consisting of a series of prices, each of which has a specific date and time associated with it, for some security@en"})

(def CompositeMarket
  "group of exchanges and trading venues referenced for pricing purposes"
  {:db/ident :fibo-fbc-fi-ip/CompositeMarket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "composite market@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-fbc-fct-mkt/Exchange,
                      :rdf/type           :owl/Restriction}
                     :cmns-col/StructuredCollection],
   :skos/definition
   #voc/lstr
    "group of exchanges and trading venues referenced for pricing purposes@en"})

(def HighPrice
  "highest price for a given security over the period specified"
  {:db/ident :fibo-fbc-fi-ip/HighPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "high price@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fi-ip/SecurityPrice
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :cmns-dt/hasObservedDateTime,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-acc-cur/isPriceFor,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-cur/MonetaryPrice
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass {:owl/unionOf
                                    [:fibo-be-fct-pub/Publisher
                                     :fibo-fbc-pas-fpas/FinancialServiceProvider
                                     :fibo-fbc-pas-fpas/Dealer
                                     :fibo-fbc-fi-ip/PricingModel
                                     :fibo-fbc-fct-mkt/Exchange
                                     :fibo-fbc-fi-ip/CompositeMarket],
                                    :rdf/type :owl/Class},
                      :owl/onProperty :fibo-fbc-fi-ip/hasPricingSource,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #voc/lstr "highest price for a given security over the period specified@en"})

(def InternalRateOfReturn
  "discount rate that results in a net present value (NPV) of zero for a series of future cash flows"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "This concept is central to many definitions of debt instrument analytics, and is the inverse of net present value.@en",
   :db/ident :fibo-fbc-fi-ip/InternalRateOfReturn,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "internal rate of return@en",
   :rdfs/subClassOf [:fibo-fbc-fi-ip/RateOfReturn
                     {:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/Percentage
                     {:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "discount rate that results in a net present value (NPV) of zero for a series of future cash flows@en"})

(def IntraDayPrice
  "price for a given security at some point between the opening and official closing price on an exchange"
  {:db/ident :fibo-fbc-fi-ip/IntraDayPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "intra day price@en",
   :rdfs/subClassOf [:fibo-fbc-fi-ip/MarketPrice
                     :fibo-fbc-fi-ip/SecurityPrice
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :cmns-dt/hasObservedDateTime,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty :fibo-fbc-fi-ip/hasPricingSource,
                      :owl/someValuesFrom
                      {:owl/unionOf [:fibo-be-fct-pub/Publisher
                                     :fibo-fbc-pas-fpas/Dealer
                                     :fibo-fbc-pas-fpas/FinancialServiceProvider
                                     :fibo-fbc-fct-mkt/Exchange
                                     :fibo-fbc-fi-ip/CompositeMarket],
                       :rdf/type    :owl/Class},
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-acc-cur/isPriceFor,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-cur/MonetaryPrice
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass {:owl/unionOf
                                    [:fibo-be-fct-pub/Publisher
                                     :fibo-fbc-pas-fpas/FinancialServiceProvider
                                     :fibo-fbc-pas-fpas/Dealer
                                     :fibo-fbc-fi-ip/PricingModel
                                     :fibo-fbc-fct-mkt/Exchange
                                     :fibo-fbc-fi-ip/CompositeMarket],
                                    :rdf/type :owl/Class},
                      :owl/onProperty :fibo-fbc-fi-ip/hasPricingSource,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "price for a given security at some point between the opening and official closing price on an exchange@en"})

(def LowPrice
  "lowest value for a given security over the period specified"
  {:db/ident :fibo-fbc-fi-ip/LowPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "low price@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fi-ip/SecurityPrice
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :cmns-dt/hasObservedDateTime,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-acc-cur/isPriceFor,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-cur/MonetaryPrice
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass {:owl/unionOf
                                    [:fibo-be-fct-pub/Publisher
                                     :fibo-fbc-pas-fpas/FinancialServiceProvider
                                     :fibo-fbc-pas-fpas/Dealer
                                     :fibo-fbc-fi-ip/PricingModel
                                     :fibo-fbc-fct-mkt/Exchange
                                     :fibo-fbc-fi-ip/CompositeMarket],
                                    :rdf/type :owl/Class},
                      :owl/onProperty :fibo-fbc-fi-ip/hasPricingSource,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #voc/lstr "lowest value for a given security over the period specified@en"})

(def MarketPrice
  "last reported price at which a security was sold"
  {:db/ident :fibo-fbc-fi-ip/MarketPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "market price@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fbc-fi-ip/hasPricingSource,
                      :owl/someValuesFrom
                      {:owl/unionOf [:fibo-be-fct-pub/Publisher
                                     :fibo-fbc-pas-fpas/Dealer
                                     :fibo-fbc-pas-fpas/FinancialServiceProvider
                                     :fibo-fbc-fct-mkt/Exchange
                                     :fibo-fbc-fi-ip/CompositeMarket],
                       :rdf/type    :owl/Class},
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fi-ip/SecurityPrice
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :cmns-dt/hasObservedDateTime,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-acc-cur/isPriceFor,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-cur/MonetaryPrice
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass {:owl/unionOf
                                    [:fibo-be-fct-pub/Publisher
                                     :fibo-fbc-pas-fpas/FinancialServiceProvider
                                     :fibo-fbc-pas-fpas/Dealer
                                     :fibo-fbc-fi-ip/PricingModel
                                     :fibo-fbc-fct-mkt/Exchange
                                     :fibo-fbc-fi-ip/CompositeMarket],
                                    :rdf/type :owl/Class},
                      :owl/onProperty :fibo-fbc-fi-ip/hasPricingSource,
                      :rdf/type :owl/Restriction}],
   :skos/definition #voc/lstr
                     "last reported price at which a security was sold@en"})

(def MeanPriceDetermination
  "method for determining a price that represents the arithmetic mean of some set of prices consolidated across sources"
  {:db/ident :fibo-fbc-fi-ip/MeanPriceDetermination,
   :rdf/type [:fibo-fbc-fi-ip/PriceDeterminationMethod
              :owl/NamedIndividual
              :fibo-fnd-gao-obj/Strategy],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "mean price determination@en",
   :skos/definition
   #voc/lstr
    "method for determining a price that represents the arithmetic mean of some set of prices consolidated across sources@en"})

(def MidPrice
  "arithmetic mean between bid and offer prices"
  {:db/ident :fibo-fbc-fi-ip/MidPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "mid price@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
                      :owl/someValuesFrom :fibo-fbc-fi-ip/BidPrice,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-ip/SecurityPrice
                     :fibo-fnd-utl-alx/ArithmeticMean
                     {:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
                      :owl/someValuesFrom :fibo-fbc-fi-ip/OfferPrice,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-acc-cur/Currency,
                      :owl/onProperty :fibo-fnd-acc-cur/hasCurrency,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :cmns-dt/hasObservedDateTime,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-acc-cur/isPriceFor,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-cur/MonetaryPrice
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass {:owl/unionOf
                                    [:fibo-be-fct-pub/Publisher
                                     :fibo-fbc-pas-fpas/FinancialServiceProvider
                                     :fibo-fbc-pas-fpas/Dealer
                                     :fibo-fbc-fi-ip/PricingModel
                                     :fibo-fbc-fct-mkt/Exchange
                                     :fibo-fbc-fi-ip/CompositeMarket],
                                    :rdf/type :owl/Class},
                      :owl/onProperty :fibo-fbc-fi-ip/hasPricingSource,
                      :rdf/type :owl/Restriction}],
   :skos/definition #voc/lstr
                     "arithmetic mean between bid and offer prices@en"})

(def OfferPrice
  "price suggested by a prospective seller at a particular time for a given security"
  {:cmns-av/synonym [#voc/lstr "offering price@en"
                     #voc/lstr "asking price@en"
                     #voc/lstr "ask price@en"],
   :db/ident :fibo-fbc-fi-ip/OfferPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "offer price@en",
   :rdfs/subClassOf [:fibo-fbc-fi-ip/SecurityPrice
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :cmns-dt/hasObservedDateTime,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-acc-cur/isPriceFor,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-cur/MonetaryPrice
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass {:owl/unionOf
                                    [:fibo-be-fct-pub/Publisher
                                     :fibo-fbc-pas-fpas/FinancialServiceProvider
                                     :fibo-fbc-pas-fpas/Dealer
                                     :fibo-fbc-fi-ip/PricingModel
                                     :fibo-fbc-fct-mkt/Exchange
                                     :fibo-fbc-fi-ip/CompositeMarket],
                                    :rdf/type :owl/Class},
                      :owl/onProperty :fibo-fbc-fi-ip/hasPricingSource,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "price suggested by a prospective seller at a particular time for a given security@en"})

(def OfficialClosingPrice
  "price of the final trade of a security at the end of a trading day on a given exchange"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "A stock's closing price is the standard benchmark used by investors to track its performance over time.@en",
   :cmns-av/synonym #voc/lstr "end-of-day price@en",
   :db/ident :fibo-fbc-fi-ip/OfficialClosingPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "official closing price@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fbc-fi-ip/hasClosingPriceDeterminationMethod,
     :owl/someValuesFrom :fibo-fbc-fi-ip/ClosingPriceDeterminationMethod,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-ip/ClosingPrice
    :fibo-fbc-fi-ip/MarketPrice
    :fibo-fbc-fi-ip/SecurityPrice
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :cmns-dt/CombinedDateTime,
     :owl/onProperty  :cmns-dt/hasObservedDateTime,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fi-ip/hasPricingSource,
     :owl/someValuesFrom {:owl/unionOf
                          [:fibo-be-fct-pub/Publisher
                           :fibo-fbc-pas-fpas/Dealer
                           :fibo-fbc-pas-fpas/FinancialServiceProvider
                           :fibo-fbc-fct-mkt/Exchange
                           :fibo-fbc-fi-ip/CompositeMarket],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-acc-cur/isPriceFor,
     :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-acc-cur/MonetaryPrice
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    {:owl/unionOf [:fibo-be-fct-pub/Publisher
                                    :fibo-fbc-pas-fpas/FinancialServiceProvider
                                    :fibo-fbc-pas-fpas/Dealer
                                    :fibo-fbc-fi-ip/PricingModel
                                    :fibo-fbc-fct-mkt/Exchange
                                    :fibo-fbc-fi-ip/CompositeMarket],
                      :rdf/type    :owl/Class},
     :owl/onProperty :fibo-fbc-fi-ip/hasPricingSource,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "price of the final trade of a security at the end of a trading day on a given exchange@en"})

(def OpeningPrice
  "price at which something first trades at the start of a trading day"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Investors that want to buy or sell as soon as the market opens will put in an order at the opening price. Depending on how the closing price for the prior day is determined, and if there is no after hours trading (AFT), the opening price will be the same as the prior trading day's closing price. Otherwise, the opening price may differ from the prior trading day's official closing price.@en",
   :db/ident :fibo-fbc-fi-ip/OpeningPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "opening price@en",
   :rdfs/subClassOf [:fibo-fbc-fi-ip/MarketPrice
                     :fibo-fbc-fi-ip/SecurityPrice
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :cmns-dt/hasObservedDateTime,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty :fibo-fbc-fi-ip/hasPricingSource,
                      :owl/someValuesFrom
                      {:owl/unionOf [:fibo-be-fct-pub/Publisher
                                     :fibo-fbc-pas-fpas/Dealer
                                     :fibo-fbc-pas-fpas/FinancialServiceProvider
                                     :fibo-fbc-fct-mkt/Exchange
                                     :fibo-fbc-fi-ip/CompositeMarket],
                       :rdf/type    :owl/Class},
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-acc-cur/isPriceFor,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-cur/MonetaryPrice
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass {:owl/unionOf
                                    [:fibo-be-fct-pub/Publisher
                                     :fibo-fbc-pas-fpas/FinancialServiceProvider
                                     :fibo-fbc-pas-fpas/Dealer
                                     :fibo-fbc-fi-ip/PricingModel
                                     :fibo-fbc-fct-mkt/Exchange
                                     :fibo-fbc-fi-ip/CompositeMarket],
                                    :rdf/type :owl/Class},
                      :owl/onProperty :fibo-fbc-fi-ip/hasPricingSource,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "price at which something first trades at the start of a trading day@en"})

(def PriceAnalytic
  "statistical measure involving security prices"
  {:db/ident :fibo-fbc-fi-ip/PriceAnalytic,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "price analytic@en",
   :rdfs/subClassOf [{:owl/onProperty :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom
                      :fibo-fbc-fi-ip/CollectionOfSecurityPrices,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-utl-alx/ScopedMeasure],
   :skos/definition #voc/lstr
                     "statistical measure involving security prices@en"})

(def PriceDeterminationMethod
  "strategy for calculating or otherwise establishing a price for something"
  {:db/ident :fibo-fbc-fi-ip/PriceDeterminationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "price determination method@en",
   :rdfs/subClassOf :fibo-fnd-gao-obj/Strategy,
   :skos/definition
   #voc/lstr
    "strategy for calculating or otherwise establishing a price for something@en"})

(def PriceSpread
  "difference between two prices"
  {:db/ident :fibo-fbc-fi-ip/PriceSpread,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label "price spread",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-acc-cur/MonetaryPrice,
                      :owl/onProperty :fibo-fnd-utl-alx/hasArgument,
                      :owl/qualifiedCardinality 2,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-utl-alx/Difference],
   :skos/definition "difference between two prices"})

(def PricingModel
  "formula used to determine a value for an instrument at a given point in time"
  {:db/ident :fibo-fbc-fi-ip/PricingModel,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "pricing model@en",
   :rdfs/subClassOf :fibo-fnd-utl-alx/Formula,
   :skos/definition
   #voc/lstr
    "formula used to determine a value for an instrument at a given point in time@en"})

(def RateOfReturn
  "net gain or loss on an investment over a specified time period, expressed as a percentage of the investment's initial cost or value as of a specific point in time"
  {:cmns-av/abbreviation #voc/lstr "RoR@en",
   :db/ident :fibo-fbc-fi-ip/RateOfReturn,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "rate of return@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-utl-alx/Percentage],
   :skos/definition
   #voc/lstr
    "net gain or loss on an investment over a specified time period, expressed as a percentage of the investment's initial cost or value as of a specific point in time@en"})

(def SecurityPrice
  "monetary price for a financial instrument at some point in time"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "A security price may be the price that some party is willing to pay, has recently paid, or would like to be paid, depending on the circumstances.@en",
   :db/ident :fibo-fbc-fi-ip/SecurityPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "security price@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-acc-cur/isPriceFor,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :cmns-dt/hasObservedDateTime,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass {:owl/unionOf
                                    [:fibo-be-fct-pub/Publisher
                                     :fibo-fbc-pas-fpas/FinancialServiceProvider
                                     :fibo-fbc-pas-fpas/Dealer
                                     :fibo-fbc-fi-ip/PricingModel
                                     :fibo-fbc-fct-mkt/Exchange
                                     :fibo-fbc-fi-ip/CompositeMarket],
                                    :rdf/type :owl/Class},
                      :owl/onProperty :fibo-fbc-fi-ip/hasPricingSource,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-acc-cur/MonetaryPrice],
   :skos/definition
   #voc/lstr
    "monetary price for a financial instrument at some point in time@en"})

(def TradingDay
  "time span that a particular trading venue is open"
  {:cmns-av/abbreviation #voc/lstr "RTH@en",
   :cmns-av/adaptedFrom "https://www.lawinsider.com/dictionary/trading-day",
   :cmns-av/explanatoryNote
   #voc/lstr
    "In the United States, and with respect to common stock in particular, trading day means any day on which the stock is traded on the principal market, or, if the principal market is not the principal trading market for the common stock, then on the principal securities exchange or securities market on which the common stock is then traded, provided that 'Trading Day' shall not include any day on which the common stock is scheduled to trade on such exchange or market for less than 4.5 hours or any day that the common stock is suspended from trading during the final hour of trading on such exchange or market (or if such exchange or market does not designate in advance the closing time of trading on such exchange or market, then during the hour ending at 4:00:00 p.m., New York time) unless such day is otherwise designated as a trading day in writing by the holder.@en",
   :cmns-av/synonym #voc/lstr "regular trading hours@en",
   :cmns-av/usageNote
   #voc/lstr
    "By convention it is sufficient to provide a value for hasOpeningDateTime, with hasClosingDateTime being optional.@en",
   :db/ident :fibo-fbc-fi-ip/TradingDay,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "trading day@en",
   :rdfs/subClassOf [{:owl/hasValue   :cmns-dt/Day,
                      :owl/onProperty :cmns-dt/hasDuration,
                      :rdf/type       :owl/Restriction}
                     :cmns-dt/ExplicitDatePeriod
                     {:owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :fibo-fnd-dt-fd/hasOpeningDateTime,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :fibo-fnd-dt-fd/hasClosingDateTime,
                      :rdf/type        :owl/Restriction}],
   :skos/definition #voc/lstr
                     "time span that a particular trading venue is open@en"})

(def TradingSession
  "window of time within a trading day in which orders may be placed and filled"
  {:cmns-av/adaptedFrom
   "https://financial-dictionary.thefreedictionary.com/Trading+Sessions",
   :cmns-av/explanatoryNote
   #voc/lstr
    "An exchange may have several trading sessions during a day. For example, the exchange may be open from 9 a.m. until 10:30 a.m., from 11:30 a.m. until 1 p.m., and from 2 p.m. to 3:30 p.m. Holding several trading sessions gives the market more time to digest information rationally without having to respond immediately.@en",
   :db/ident :fibo-fbc-fi-ip/TradingSession,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "trading session@en",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :fibo-fnd-dt-fd/hasOpeningDateTime,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :fibo-fnd-dt-fd/hasClosingDateTime,
                      :rdf/type        :owl/Restriction}
                     :cmns-dt/ExplicitDatePeriod],
   :skos/definition
   #voc/lstr
    "window of time within a trading day in which orders may be placed and filled@en"})

(def VolumeWeightedAveragePrice
  "average price at which a given security has traded throughout a trading day, determined by multiplying each trade by its volume, adding the results, then dividing by the volume traded for the day"
  {:cmns-av/abbreviation #voc/lstr "VWAP@en",
   :db/ident :fibo-fbc-fi-ip/VolumeWeightedAveragePrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "volume-weighted average price@en",
   :rdfs/subClassOf [:fibo-fbc-fi-ip/PriceAnalytic
                     {:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom
                      :fibo-fbc-fi-ip/CollectionOfSecurityPrices,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/ScopedMeasure
                     {:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "average price at which a given security has traded throughout a trading day, determined by multiplying each trade by its volume, adding the results, then dividing by the volume traded for the day@en"})

(def VolumeWeightedOpenPrice
  "price determined by multiplying each trade by its volume, adding the results, then dividing by the volume over a certain period during the trading day (rather than over the course of the entire day)"
  {:cmns-av/abbreviation #voc/lstr "VWOP@en",
   :db/ident :fibo-fbc-fi-ip/VolumeWeightedOpenPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "volume-weighted open price@en",
   :rdfs/subClassOf [:fibo-fbc-fi-ip/PriceAnalytic
                     {:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom
                      :fibo-fbc-fi-ip/CollectionOfSecurityPrices,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/ScopedMeasure
                     {:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "price determined by multiplying each trade by its volume, adding the results, then dividing by the volume over a certain period during the trading day (rather than over the course of the entire day)@en"})

(def Yield
  "return on the investor's capital investment"
  {:cmns-av/explanatoryNote
   [#voc/lstr
     "Yield reflects income over some period of time which is then annualized, and typically projected into the future, assuming that conditions and rates remain the same, whereas return on investment is retrospective.@en"
    #voc/lstr
     "A Yield must be based on a price, and must be in reference to some event or duration of time. It has a calculation method, and may have other qualifying terms such as for compounded yield.@en"],
   :db/ident :fibo-fbc-fi-ip/Yield,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "yield@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/Percentage
                     {:owl/onClass    :fibo-fnd-acc-cur/Currency,
                      :owl/onProperty :fibo-fnd-acc-cur/hasCurrency,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}],
   :skos/definition #voc/lstr "return on the investor's capital investment@en"})

(def YieldSpread
  "the spread between the yields of two items"
  {:db/ident :fibo-fbc-fi-ip/YieldSpread,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label "yield spread",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fbc-fi-ip/Yield,
                      :owl/onProperty :fibo-fnd-utl-alx/hasArgument,
                      :owl/qualifiedCardinality 2,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-utl-alx/Difference],
   :skos/definition #voc/lstr "the spread between the yields of two items@en"})

(def hasBookDepth
  "indicates depth of the order book to which the price refers"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "An order book is the list of orders (manual or electronic) that a trading venue (in particular stock exchanges) uses to record the interest of buyers and sellers in a particular financial instrument. The book depth refers to the number of price levels available at a particular time in the book. Sometimes the book is represented to a fixed depth, and orders beyond that depth are ignored or rejected, and in other cases the book can contain unlimited levels.@en",
   :db/ident :fibo-fbc-fi-ip/hasBookDepth,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-fi-ip/SecurityPrice,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "has book depth@en",
   :rdfs/range :xsd/integer,
   :skos/definition
   #voc/lstr "indicates depth of the order book to which the price refers@en"})

(def hasClosingPriceDeterminationMethod
  "indicates a strategy by which the official closing price is determined"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "This method itself changes quite frequently i.e. the exchange may change the way it computes closing prices.@en",
   :db/ident :fibo-fbc-fi-ip/hasClosingPriceDeterminationMethod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "has closing price determination method@en",
   :rdfs/range :fibo-fbc-fi-ip/ClosingPriceDeterminationMethod,
   :rdfs/subPropertyOf [:fibo-fbc-fi-ip/hasPriceDeterminationMethod
                        :fibo-fnd-gao-obj/hasStrategy],
   :skos/definition
   #voc/lstr
    "indicates a strategy by which the official closing price is determined@en"})

(def hasLotSize
  "magnitude of an item (i.e., total quantity)"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "The lot size, referenced in offerings, listings, orders, and trades, typically refers to the number of shares or units in a single contract.@en",
   :db/ident :fibo-fbc-fi-ip/hasLotSize,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "has lot size@en",
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :fibo-fnd-qt-qtu/hasNumericValue,
   :skos/definition #voc/lstr "magnitude of an item (i.e., total quantity)@en",
   :skos/example
   #voc/lstr
    "For example, with respect to corn, 5000 bushels is a typical contract size. For some oil commodities trades, 1000 barrels is considered a single contract. For equity options, the lot size is typically 100 shares of the underlying.@en"})

(def hasPriceDeterminationMethod
  "indicates a strategy by which a given price is determined"
  {:db/ident :fibo-fbc-fi-ip/hasPriceDeterminationMethod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "has price determination method@en",
   :rdfs/range :fibo-fbc-fi-ip/PriceDeterminationMethod,
   :rdfs/subPropertyOf :fibo-fnd-gao-obj/hasStrategy,
   :skos/definition
   #voc/lstr "indicates a strategy by which a given price is determined@en"})

(def hasPricingSource
  "indicates the origin of a given quote or price for a financial instrument"
  {:db/ident :fibo-fbc-fi-ip/hasPricingSource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "has pricing source@en",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/refersTo,
   :skos/definition
   #voc/lstr
    "indicates the origin of a given quote or price for a financial instrument@en"})

(def hasQuoteLotSize
  "magnitude of something to which the quote price refers"
  {:db/ident :fibo-fbc-fi-ip/hasQuoteLotSize,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-fi-ip/SecurityPrice,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "has quote lot size@en",
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf [:fibo-fbc-fi-ip/hasLotSize
                        :fibo-fnd-qt-qtu/hasNumericValue],
   :skos/definition
   #voc/lstr "magnitude of something to which the quote price refers@en"})

(def hasRateOfReturn
  "indicates the retrospective rate of return for a given financial instrument over some period of time"
  {:db/ident :fibo-fbc-fi-ip/hasRateOfReturn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/FinancialInstrument,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "has rate of return@en",
   :rdfs/range :fibo-fbc-fi-ip/RateOfReturn,
   :rdfs/subPropertyOf :fibo-fnd-qt-qtu/hasQuantityValue,
   :skos/definition
   #voc/lstr
    "indicates the retrospective rate of return for a given financial instrument over some period of time@en"})

(def hasRoundLotSize
  "standard number of securities traded on an exchange"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "In stocks, a round lot is considered 100 shares or a larger number that can be evenly divided by 100. In bonds, a round lot is usually $100,000 worth. Odd lots and smaller lots have become increasingly common due to technology advances and small investor demand.@en",
   :cmns-av/synonym [#voc/lstr "unit of trading@en"
                     #voc/lstr "normal trading unit@en"],
   :db/ident :fibo-fbc-fi-ip/hasRoundLotSize,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "has round lot size@en",
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf [:fibo-fbc-fi-ip/hasLotSize
                        :fibo-fnd-qt-qtu/hasNumericValue],
   :skos/definition #voc/lstr
                     "standard number of securities traded on an exchange@en"})

(def hasTradingDateTime
  "indicates the specific date and time associated with a given price"
  {:db/ident :fibo-fbc-fi-ip/hasTradingDateTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-ip/SecurityPrice,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "has trading date time@en",
   :rdfs/range :cmns-dt/DateTime,
   :rdfs/subPropertyOf :cmns-dt/hasDateTime,
   :skos/definition
   #voc/lstr
    "indicates the specific date and time associated with a given price@en"})

(def hasTradingVolume
  "indicates the number of shares/units traded on a given trading day"
  {:db/ident :fibo-fbc-fi-ip/hasTradingVolume,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label #voc/lstr "has trading volume@en",
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :fibo-fnd-qt-qtu/hasNumericValue,
   :skos/definition
   #voc/lstr
    "indicates the number of shares/units traded on a given trading day@en"})