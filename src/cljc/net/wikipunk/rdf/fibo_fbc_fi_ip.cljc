(ns net.wikipunk.rdf.fibo-fbc-fi-ip
  {:cmns-av/copyright
   #{"Copyright (c) 2020-2024 EDM Council, Inc."
     "Copyright (c) 2020-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/InstrumentPricing/",
   :dcterms/abstract
   "This ontology provides a basic set of definitions related to pricing, yield, and spread that are extended in other instrument-specific ontologies.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-qtu" "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-fct-pub"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
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
    "fibo-fnd-utl-alx"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/FunctionalEntities/Publishers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/Markets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/DebtAndEquities/Debt/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-fi-ip",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Instrument Pricing Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of this ontology was modified to move the nominal for auction market from CDS to the pricing ontology (its IRI was that of this instrument pricing ontology but it was mistakenly in the CDS ontology) and simplify the definition (DER-140), and to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of this ontology was enhanced to incorporate additional definitions for pricing terminology (SEC-185)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of this ontology was modified to reflect the move of dated collection from arrangements to financial dates."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of this ontology was modified to change one of the subclasses of price determination method to a named individual and correct the definition of mean price determination. Note that there may be multiple individuals of type 'closing price determination method', depending on the exchange and other factors. Also revised the lot size properties to have a range of xsd:decimal to allow for fractional shares or number of elements, revised the explanatory note, and added examples."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of this ontology was modified to add trading day and trading session, to address ambiguity in some definitions, to add adjusted price and to create a more general hasLotSize property that can be used in various contexts."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of this ontology was modified to address text formatting issues uncovered by hygiene testing."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of this ontology was modified to eliminate a redundant restriction on CollectionOfSecurityPrices, better integrate pricing methods, loosen the domain restriction on hasPricingSource and add dealer to the set of possible sources for prices."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of this ontology was modified to replace a redundant concept, calculation formula with formula, add a general price determination class needed for options, add a restriction on SecurityPrice to point to the security, and add hasRoundLotSize."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"})

(def AdjustedClosingPrice
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A particularly dramatic change in price occurs when a company announces a stock split. When the change is made, the price displayed will immediately reflect the split. For example, if a company splits its stock 2-for-1, the last closing price will be cut in half. That's the adjusted closing price."},
   :db/ident :fibo-fbc-fi-ip/AdjustedClosingPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "adjusted closing price"},
   :rdfs/subClassOf :fibo-fbc-fi-ip/ClosingPrice,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "amended closing price to reflect a security's value after accounting for any corporate actions, such as stock splits, dividends, and rights offerings"}})

(def AuctionMethod
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Auction method refers to a process where buyers enter competitive bids and sellers submit competitive offers at the same time. The price at which a security trades represents the highest price that a buyer is willing to pay and the lowest price that a seller is willing to accept. Matching bids and offers are then paired together, and the orders are executed."},
   :db/ident :fibo-fbc-fi-ip/AuctionMethod,
   :rdf/type #{:owl/NamedIndividual :fibo-fbc-fi-ip/PriceDeterminationMethod},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "auction method"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "method for determining a price that represents use of an independently administered synthetic auction"}})

(def BestBid
  {:db/ident :fibo-fbc-fi-ip/BestBid,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "best bid"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-cxtdsg/hasApplicablePeriod,
                       :owl/someValuesFrom :cmns-dt/DatePeriod,
                       :rdf/type           :owl/Restriction}
                      :fibo-fbc-fi-ip/BidPrice},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "highest bid price a prospective buyer is willing to pay at a particular time for a given security"}})

(def BestOffer
  {:db/ident :fibo-fbc-fi-ip/BestOffer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "best offer"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-cxtdsg/hasApplicablePeriod,
                       :owl/someValuesFrom :cmns-dt/DatePeriod,
                       :rdf/type           :owl/Restriction}
                      :fibo-fbc-fi-ip/OfferPrice},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "lowest price acceptable to a prospective seller for a given security at a particular point in time"}})

(def BidAskSpread
  {:db/ident :fibo-fbc-fi-ip/BidAskSpread,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bid ask spread"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-qtu/hasArgument,
                       :owl/someValuesFrom :fibo-fbc-fi-ip/BidPrice,
                       :rdf/type           :owl/Restriction}
                      :fibo-fbc-fi-ip/PriceSpread
                      {:owl/onProperty     :cmns-qtu/hasArgument,
                       :owl/someValuesFrom :fibo-fbc-fi-ip/OfferPrice,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "difference between an offer (ask) price and a bid price"}})

(def BidPrice
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The term 'bid price' is used by traders / market makers with respect to a given security, and that are prepared to buy or sell round lots at publicly quoted prices, and by specialists in certain instruments that perform similar functions on an exchange."},
   :db/ident :fibo-fbc-fi-ip/BidPrice,
   :owl/disjointWith :fibo-fbc-fi-ip/OfferPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bid price"},
   :rdfs/subClassOf :fibo-fbc-fi-ip/SecurityPrice,
   :skos/definition {:rdf/language "en",
                     :rdf/value "price a prospective buyer is willing to pay"}})

(def CleanPrice
  {:db/ident :fibo-fbc-fi-ip/CleanPrice,
   :owl/disjointWith :fibo-fbc-fi-ip/DirtyPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "clean price"},
   :rdfs/subClassOf :fibo-fbc-fi-ip/SecurityPrice,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "debt instrument price that does not include accrued interest"}})

(def ClosingPrice
  {:db/ident :fibo-fbc-fi-ip/ClosingPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "closing price"},
   :rdfs/subClassOf :fibo-fbc-fi-ip/MarketPrice,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "cash value of the last transacted price before the market closes"}})

(def ClosingPriceDeterminationMethod
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The official closing price is typically the final price at which something trades during regular market hours on an exchange or trading venue. Because of the evolving nature of online trading in a 24 hour world, every exchange has a method of calculating its official closing price, although that methodology changes from time to time. They may also publish an adjusted closing price, which reflects changes to the price that reflect corporate actions and after hours trading that occur before the opening of the exchange on the following day. Understanding how the closing price is determined is important to ensure price comparability for a given security across exchanges."},
   :db/ident :fibo-fbc-fi-ip/ClosingPriceDeterminationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "closing price determination method"},
   :rdfs/subClassOf :fibo-fbc-fi-ip/PriceDeterminationMethod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "strategy for calculating or otherwise determining an official closing price"}})

(def CollectionOfSecurityPrices
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Note that such a collection is of prices that may be quoted or may be established through analysis, such as an average over a number of markets (composite market) or developed via some pricing model (e.g., matrix pricing)."},
   :db/ident :fibo-fbc-fi-ip/CollectionOfSecurityPrices,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "collection of security prices"},
   :rdfs/subClassOf #{:fibo-fnd-dt-fd/DatedStructuredCollection
                      {:owl/onProperty     :cmns-col/hasConstituent,
                       :owl/someValuesFrom :fibo-fbc-fi-ip/SecurityPrice,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "collection consisting of a series of prices, each of which has a specific date and time associated with it, for some security"}})

(def CompositeMarket
  {:db/ident :fibo-fbc-fi-ip/CompositeMarket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "composite market"},
   :rdfs/subClassOf #{:cmns-col/StructuredCollection
                      {:owl/onProperty     :cmns-col/hasConstituent,
                       :owl/someValuesFrom :fibo-fbc-fct-mkt/Exchange,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "group of exchanges and trading venues referenced for pricing purposes"}})

(def DerivedPrice
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "There are evaluated prices in which an independent source evaluates a price they have derived, and there are prices which are derived within a firm, from supplied, published end of day price spreads or other market data."},
   :cmns-av/synonym #{{:rdf/language "en",
                       :rdf/value    "matrix price"}
                      {:rdf/language "en",
                       :rdf/value    "interpolated price"}},
   :db/ident :fibo-fbc-fi-ip/DerivedPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "derived price"},
   :rdfs/subClassOf #{:fibo-fnd-acc-cur/CalculatedPrice
                      :fibo-fbc-fi-ip/SecurityPrice},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "price that stems from another source or calculation rather than being quoted or based on actual trading data"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "For example, a product's price can be derived from another pricing source, such as an asset or product, using various contributing factors. Derived prices can also be calculated within a firm using published price spreads or other market data. An interpolated price is determined by interpolation between available price figures, using some algorithm or curve, such as between bid and offer (among others). It also includes yield curves and implied forward curves. That is, interpolation may either be linear (straight line interpolation between two values) or may be expressed as a non linear curve such as a yield curve or an implied forward curve."}})

(def DirtyPrice
  {:db/ident :fibo-fbc-fi-ip/DirtyPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dirty price"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-col/comprises,
                       :owl/someValuesFrom :fibo-fbc-dae-dbt/AccruedInterest,
                       :rdf/type           :owl/Restriction}
                      :fibo-fbc-fi-ip/SecurityPrice},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "debt instrument price that includes accrued interest"}})

(def HighPrice
  {:db/ident :fibo-fbc-fi-ip/HighPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "high price"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-cxtdsg/hasApplicablePeriod,
                       :owl/someValuesFrom :cmns-dt/DatePeriod,
                       :rdf/type           :owl/Restriction}
                      :fibo-fbc-fi-ip/SecurityPrice},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "highest price for a given security over the period specified"}})

(def InternalRateOfReturn
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This concept is central to many definitions of debt instrument analytics, and is the inverse of net present value."},
   :db/ident :fibo-fbc-fi-ip/InternalRateOfReturn,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "internal rate of return"},
   :rdfs/subClassOf :fibo-fbc-fi-ip/RateOfReturn,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "discount rate that results in a net present value (NPV) of zero for a series of future cash flows"}})

(def IntraDayPrice
  {:db/ident :fibo-fbc-fi-ip/IntraDayPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "intra day price"},
   :rdfs/subClassOf :fibo-fbc-fi-ip/MarketPrice,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "price for a given security at some point between the opening and official closing price on an exchange"}})

(def LowPrice
  {:db/ident :fibo-fbc-fi-ip/LowPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "low price"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-cxtdsg/hasApplicablePeriod,
                       :owl/someValuesFrom :cmns-dt/DatePeriod,
                       :rdf/type           :owl/Restriction}
                      :fibo-fbc-fi-ip/SecurityPrice},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "lowest value for a given security over the period specified"}})

(def MarketPrice
  {:db/ident :fibo-fbc-fi-ip/MarketPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "market price"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fbc-fi-ip/hasPricingSource,
      :owl/someValuesFrom {:owl/unionOf
                           [:fibo-be-fct-pub/Publisher
                            :fibo-fbc-pas-fpas/Dealer
                            :fibo-fbc-pas-fpas/FinancialServiceProvider
                            :fibo-fbc-fct-mkt/Exchange
                            :fibo-fbc-fi-ip/CompositeMarket],
                           :rdf/type :owl/Class},
      :rdf/type           :owl/Restriction} :fibo-fbc-fi-ip/SecurityPrice},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "last reported price at which a security was sold"}})

(def MeanPriceDetermination
  {:db/ident :fibo-fbc-fi-ip/MeanPriceDetermination,
   :rdf/type #{:owl/NamedIndividual :fibo-fbc-fi-ip/PriceDeterminationMethod},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mean price determination"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "method for determining a price that represents the arithmetic mean of some set of prices consolidated across sources"}})

(def MidPrice
  {:db/ident :fibo-fbc-fi-ip/MidPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mid price"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-cxtdsg/hasApplicablePeriod,
      :owl/someValuesFrom :cmns-dt/DatePeriod,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-qtu/hasArgument,
      :owl/someValuesFrom :fibo-fbc-fi-ip/BidPrice,
      :rdf/type           :owl/Restriction}
     {:owl/onClass    :fibo-fnd-acc-cur/Currency,
      :owl/onProperty :fibo-fnd-acc-cur/hasCurrency,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction} :fibo-fnd-utl-alx/ArithmeticMean
     {:owl/onProperty     :cmns-qtu/hasArgument,
      :owl/someValuesFrom :fibo-fbc-fi-ip/OfferPrice,
      :rdf/type           :owl/Restriction} :fibo-fbc-fi-ip/SecurityPrice},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "arithmetic mean between bid and offer prices"}})

(def OfferPrice
  {:cmns-av/synonym #{{:rdf/language "en",
                       :rdf/value    "asking price"}
                      {:rdf/language "en",
                       :rdf/value    "ask price"}
                      {:rdf/language "en",
                       :rdf/value    "offering price"}},
   :db/ident :fibo-fbc-fi-ip/OfferPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "offer price"},
   :rdfs/subClassOf :fibo-fbc-fi-ip/SecurityPrice,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "price suggested by a prospective seller at a particular time for a given security"}})

(def OfficialClosingPrice
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A stock's closing price is the standard benchmark used by investors to track its performance over time."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "end-of-day price"},
   :db/ident :fibo-fbc-fi-ip/OfficialClosingPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "official closing price"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fbc-fi-ip/hasClosingPriceDeterminationMethod,
      :owl/someValuesFrom :fibo-fbc-fi-ip/ClosingPriceDeterminationMethod,
      :rdf/type           :owl/Restriction} :fibo-fbc-fi-ip/ClosingPrice},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "price of the final trade of a security at the end of a trading day on a given exchange"}})

(def OpeningPrice
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Investors that want to buy or sell as soon as the market opens will put in an order at the opening price. Depending on how the closing price for the prior day is determined, and if there is no after hours trading (AFT), the opening price will be the same as the prior trading day's closing price. Otherwise, the opening price may differ from the prior trading day's official closing price."},
   :db/ident :fibo-fbc-fi-ip/OpeningPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "opening price"},
   :rdfs/subClassOf :fibo-fbc-fi-ip/MarketPrice,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "price at which something first trades at the start of a trading day"}})

(def PriceAnalytic
  {:db/ident :fibo-fbc-fi-ip/PriceAnalytic,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "price analytic"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-cxtdsg/hasApplicablePeriod,
      :owl/someValuesFrom :cmns-dt/DatePeriod,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
      :owl/someValuesFrom :fibo-fbc-fi-ip/CollectionOfSecurityPrices,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-doc/refersTo,
      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
      :rdf/type           :owl/Restriction} :fibo-fnd-utl-alx/ScopedMeasure},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "statistical measure involving security prices"}})

(def PriceDeterminationMethod
  {:db/ident :fibo-fbc-fi-ip/PriceDeterminationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "price determination method"},
   :rdfs/subClassOf :fibo-fnd-gao-obj/Strategy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "strategy for calculating or otherwise establishing a price for something"}})

(def PriceSpread
  {:db/ident :fibo-fbc-fi-ip/PriceSpread,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label "price spread",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-cxtdsg/hasApplicablePeriod,
                       :owl/someValuesFrom :cmns-dt/DatePeriod,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-utl-alx/Difference
                      {:owl/onClass    :fibo-fnd-acc-cur/MonetaryPrice,
                       :owl/onProperty :cmns-qtu/hasArgument,
                       :owl/qualifiedCardinality 2,
                       :rdf/type       :owl/Restriction}},
   :skos/definition "difference between two prices"})

(def PricingModel
  {:db/ident :fibo-fbc-fi-ip/PricingModel,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pricing model"},
   :rdfs/subClassOf :cmns-qtu/Expression,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "expression used to determine a value for an instrument at a given point in time"}})

(def RateOfReturn
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "RoR"},
   :db/ident :fibo-fbc-fi-ip/RateOfReturn,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "rate of return"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-cxtdsg/hasApplicablePeriod,
                       :owl/someValuesFrom :cmns-dt/DatePeriod,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-doc/refersTo,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                       :rdf/type           :owl/Restriction}
                      :cmns-qtu/Percentage},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "net gain or loss on an investment over a specified time period, expressed as a percentage of the investment's initial cost or value as of a specific point in time"}})

(def SecurityPrice
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A security price may be the price that some party is willing to pay, has recently paid, or would like to be paid, depending on the circumstances."},
   :db/ident :fibo-fbc-fi-ip/SecurityPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "security price"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-acc-cur/isPriceFor,
      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
      :rdf/type           :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onDataRange :cmns-dt/CombinedDateTime,
      :owl/onProperty  :cmns-dt/hasObservedDateTime,
      :rdf/type        :owl/Restriction} :fibo-fnd-acc-cur/MonetaryPrice
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    {:owl/unionOf [:fibo-be-fct-pub/Publisher
                                     :fibo-fbc-pas-fpas/FinancialServiceProvider
                                     :fibo-fbc-pas-fpas/Dealer
                                     :fibo-fbc-fi-ip/PricingModel
                                     :fibo-fbc-fct-mkt/Exchange
                                     :fibo-fbc-fi-ip/CompositeMarket],
                       :rdf/type    :owl/Class},
      :owl/onProperty :fibo-fbc-fi-ip/hasPricingSource,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "monetary price for a financial instrument at some point in time"}})

(def TradingDay
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "RTH"},
   :cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.lawinsider.com/dictionary/trading-day"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "In the United States, and with respect to common stock in particular, trading day means any day on which the stock is traded on the principal market, or, if the principal market is not the principal trading market for the common stock, then on the principal securities exchange or securities market on which the common stock is then traded, provided that 'Trading Day' shall not include any day on which the common stock is scheduled to trade on such exchange or market for less than 4.5 hours or any day that the common stock is suspended from trading during the final hour of trading on such exchange or market (or if such exchange or market does not designate in advance the closing time of trading on such exchange or market, then during the hour ending at 4:00:00 p.m., New York time) unless such day is otherwise designated as a trading day in writing by the holder."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "regular trading hours"},
   :cmns-av/usageNote
   {:rdf/language "en",
    :rdf/value
    "By convention it is sufficient to provide a value for hasOpeningDateTime, with hasClosingDateTime being optional."},
   :db/ident :fibo-fbc-fi-ip/TradingDay,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "trading day"},
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onDataRange :cmns-dt/CombinedDateTime,
                       :owl/onProperty  :fibo-fnd-dt-fd/hasClosingDateTime,
                       :rdf/type        :owl/Restriction}
                      {:owl/onDataRange :cmns-dt/CombinedDateTime,
                       :owl/onProperty  :fibo-fnd-dt-fd/hasOpeningDateTime,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}
                      :cmns-dt/ExplicitDatePeriod
                      {:owl/hasValue   :cmns-dt/Day,
                       :owl/onProperty :cmns-dt/hasDuration,
                       :rdf/type       :owl/Restriction}},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "time span that a particular trading venue is open"}})

(def TradingSession
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://financial-dictionary.thefreedictionary.com/Trading+Sessions"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "An exchange may have several trading sessions during a day. For example, the exchange may be open from 9 a.m. until 10:30 a.m., from 11:30 a.m. until 1 p.m., and from 2 p.m. to 3:30 p.m. Holding several trading sessions gives the market more time to digest information rationally without having to respond immediately."},
   :db/ident :fibo-fbc-fi-ip/TradingSession,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "trading session"},
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onDataRange :cmns-dt/CombinedDateTime,
                       :owl/onProperty  :fibo-fnd-dt-fd/hasClosingDateTime,
                       :rdf/type        :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onDataRange :cmns-dt/CombinedDateTime,
                       :owl/onProperty  :fibo-fnd-dt-fd/hasOpeningDateTime,
                       :rdf/type        :owl/Restriction}
                      :cmns-dt/ExplicitDatePeriod},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "window of time within a trading day in which orders may be placed and filled"}})

(def VolumeWeightedAveragePrice
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "VWAP"},
   :db/ident :fibo-fbc-fi-ip/VolumeWeightedAveragePrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "volume-weighted average price"},
   :rdfs/subClassOf :fibo-fbc-fi-ip/PriceAnalytic,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "average price at which a given security has traded throughout a trading day, determined by multiplying each trade by its volume, adding the results, then dividing by the volume traded for the day"}})

(def VolumeWeightedOpenPrice
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "VWOP"},
   :db/ident :fibo-fbc-fi-ip/VolumeWeightedOpenPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "volume-weighted open price"},
   :rdfs/subClassOf :fibo-fbc-fi-ip/PriceAnalytic,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "price determined by multiplying each trade by its volume, adding the results, then dividing by the volume over a certain period during the trading day (rather than over the course of the entire day)"}})

(def Yield
  {:cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "Yield reflects income over some period of time which is then annualized, and typically projected into the future, assuming that conditions and rates remain the same, whereas return on investment is retrospective."}
     {:rdf/language "en",
      :rdf/value
      "A Yield must be based on a price, and must be in reference to some event or duration of time. It has a calculation method, and may have other qualifying terms such as for compounded yield."}},
   :db/ident :fibo-fbc-fi-ip/Yield,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "yield"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-cxtdsg/hasApplicablePeriod,
                       :owl/someValuesFrom :cmns-dt/DatePeriod,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-doc/refersTo,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                       :rdf/type           :owl/Restriction}
                      {:owl/onClass    :fibo-fnd-acc-cur/Currency,
                       :owl/onProperty :fibo-fnd-acc-cur/hasCurrency,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction} :cmns-qtu/Percentage},
   :skos/definition {:rdf/language "en",
                     :rdf/value "return on the investor's capital investment"}})

(def YieldSpread
  {:db/ident :fibo-fbc-fi-ip/YieldSpread,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label "yield spread",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-fbc-fi-ip/Yield,
                       :owl/onProperty :cmns-qtu/hasArgument,
                       :owl/qualifiedCardinality 2,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-utl-alx/Difference},
   :skos/definition {:rdf/language "en",
                     :rdf/value "the spread between the yields of two items"}})

(def hasBookDepth
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "An order book is the list of orders (manual or electronic) that a trading venue (in particular stock exchanges) uses to record the interest of buyers and sellers in a particular financial instrument. The book depth refers to the number of price levels available at a particular time in the book. Sometimes the book is represented to a fixed depth, and orders beyond that depth are ignored or rejected, and in other cases the book can contain unlimited levels."},
   :db/ident :fibo-fbc-fi-ip/hasBookDepth,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-fi-ip/SecurityPrice,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has book depth"},
   :rdfs/range :xsd/integer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "indicates depth of the order book to which the price refers"}})

(def hasClosingPriceDeterminationMethod
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This method itself changes quite frequently i.e. the exchange may change the way it computes closing prices."},
   :db/ident :fibo-fbc-fi-ip/hasClosingPriceDeterminationMethod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has closing price determination method"},
   :rdfs/range :fibo-fbc-fi-ip/ClosingPriceDeterminationMethod,
   :rdfs/subPropertyOf :fibo-fbc-fi-ip/hasPriceDeterminationMethod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates a strategy by which the official closing price is determined"}})

(def hasLotSize
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The lot size, referenced in offerings, listings, orders, and trades, typically refers to the number of shares or units in a single contract."},
   :db/ident :fibo-fbc-fi-ip/hasLotSize,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has lot size"},
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :cmns-qtu/hasNumericValue,
   :skos/definition {:rdf/language "en",
                     :rdf/value "magnitude of an item (i.e., total quantity)"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "For example, with respect to corn, 5000 bushels is a typical contract size. For some oil commodities trades, 1000 barrels is considered a single contract. For equity options, the lot size is typically 100 shares of the underlying."}})

(def hasNumberOfDaysAccrued
  {:db/ident :fibo-fbc-fi-ip/hasNumberOfDaysAccrued,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has number of days accrued"},
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :cmns-qtu/hasNumericValue,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the number of days for which interest has accrued and has not yet been received"}})

(def hasPriceDeterminationMethod
  {:db/ident :fibo-fbc-fi-ip/hasPriceDeterminationMethod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has price determination method"},
   :rdfs/range :fibo-fbc-fi-ip/PriceDeterminationMethod,
   :rdfs/subPropertyOf :fibo-fnd-gao-obj/hasStrategy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "indicates a strategy by which a given price is determined"}})

(def hasPricingSource
  {:db/ident :fibo-fbc-fi-ip/hasPricingSource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has pricing source"},
   :rdfs/subPropertyOf :cmns-doc/refersTo,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the origin of a given quote or price for a financial instrument"}})

(def hasQuoteLotSize
  {:db/ident :fibo-fbc-fi-ip/hasQuoteLotSize,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-fi-ip/SecurityPrice,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has quote lot size"},
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :fibo-fbc-fi-ip/hasLotSize,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "magnitude of something to which the quote price refers"}})

(def hasRateOfReturn
  {:db/ident :fibo-fbc-fi-ip/hasRateOfReturn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/FinancialInstrument,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has rate of return"},
   :rdfs/range :fibo-fbc-fi-ip/RateOfReturn,
   :rdfs/subPropertyOf :cmns-qtu/hasQuantityValue,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the retrospective rate of return for a given financial instrument over some period of time"}})

(def hasRoundLotSize
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "In stocks, a round lot is considered 100 shares or a larger number that can be evenly divided by 100. In bonds, a round lot is usually $100,000 worth. Odd lots and smaller lots have become increasingly common due to technology advances and small investor demand."},
   :cmns-av/synonym #{{:rdf/language "en",
                       :rdf/value    "normal trading unit"}
                      {:rdf/language "en",
                       :rdf/value    "unit of trading"}},
   :db/ident :fibo-fbc-fi-ip/hasRoundLotSize,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has round lot size"},
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :fibo-fbc-fi-ip/hasLotSize,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "standard number of securities traded on an exchange"}})

(def hasTradingDateTime
  {:db/ident :fibo-fbc-fi-ip/hasTradingDateTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-ip/SecurityPrice,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has trading date time"},
   :rdfs/range :cmns-dt/DateTime,
   :rdfs/subPropertyOf :cmns-dt/hasDateTime,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the specific date and time associated with a given price"}})

(def hasTradingVolume
  {:db/ident :fibo-fbc-fi-ip/hasTradingVolume,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has trading volume"},
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :cmns-qtu/hasNumericValue,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the number of shares/units traded on a given trading day"}})

(def urn:uuid:f389bbee-b594-55c1-b4e9-f055b7388455
  {:cmns-av/copyright
   #{"Copyright (c) 2020-2024 EDM Council, Inc."
     "Copyright (c) 2020-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology provides a basic set of definitions related to pricing, yield, and spread that are extended in other instrument-specific ontologies.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/FunctionalEntities/Publishers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/Markets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/DebtAndEquities/Debt/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/InstrumentPricing/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Instrument Pricing Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of this ontology was modified to move the nominal for auction market from CDS to the pricing ontology (its IRI was that of this instrument pricing ontology but it was mistakenly in the CDS ontology) and simplify the definition (DER-140), and to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of this ontology was enhanced to incorporate additional definitions for pricing terminology (SEC-185)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of this ontology was modified to reflect the move of dated collection from arrangements to financial dates."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of this ontology was modified to change one of the subclasses of price determination method to a named individual and correct the definition of mean price determination. Note that there may be multiple individuals of type 'closing price determination method', depending on the exchange and other factors. Also revised the lot size properties to have a range of xsd:decimal to allow for fractional shares or number of elements, revised the explanatory note, and added examples."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of this ontology was modified to add trading day and trading session, to address ambiguity in some definitions, to add adjusted price and to create a more general hasLotSize property that can be used in various contexts."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of this ontology was modified to address text formatting issues uncovered by hygiene testing."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of this ontology was modified to eliminate a redundant restriction on CollectionOfSecurityPrices, better integrate pricing methods, loosen the domain restriction on hasPricingSource and add dealer to the set of possible sources for prices."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing.rdf version of this ontology was modified to replace a redundant concept, calculation formula with formula, add a general price determination class needed for options, add a restriction on SecurityPrice to point to the security, and add hasRoundLotSize."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"})