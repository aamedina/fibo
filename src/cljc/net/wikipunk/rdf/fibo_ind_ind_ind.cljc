(ns net.wikipunk.rdf.fibo-ind-ind-ind
  {:cmns-av/copyright #{"Copyright (c) 2014-2023 Object Management Group, Inc."
                        "Copyright (c) 2014-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/Indicators/Indicators/",
   :dcterms/abstract
   "This ontology provides the concepts common to all market rates, indices and indicators; that is concepts descriptive of the numeric parameters themselves. These are modeled independently of the values they may take over time.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-qtu" "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-utl-alx"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-ind-ind"
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Organizations/FormalOrganizations/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/Indicators/Indicators/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-ind-ind-ind",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/",
   :rdfs/label "Indicators Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators.rdf version of this ontology was modified to loosen the nature of a price in a price structure to include any price, not limited to a quoted price from a specific source, to allow for calculated prices to be included in the structure and to deprecate redundant terms including financial information publisher, and published financial information."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators.rdf version of the ontology was modified to eliminate deprecations that are more than 6 months old and to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators.rdf version of this ontology was modified per the FIBO 2.0 RFC, namely, to integrate concepts recently added to the FND domain including Rate, ExchangeRate, InterestRate and StructuredCollection and revise definitions of TermStructure and Volatility to better support concepts such as yield curves and analysis of market rates generally."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators.rdf version of this ontology was modified to add definitions for historical and implied volatility, and differentiate price volatility accordingly."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators.rdf version of this ontology was modified to a restriction on isValueOf to MarketRate and eliminate its dependence on PublishedFinancialInformation, and to revise the definition of market rate, daily average market rate, and end of day market rate."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators.rdf version of this ontology was modified to eliminate a redundant superclass declaration on MarketSpread, introduced by refactoring of FND analytics."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators.rdf version of this ontology was modified to extend the definition of price structure to include a synonym of price history and state that it is intended to be used for any sort of analysis of historic prices."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators.rdf version of this ontology was modified per the issue resolutions identified in the FIBO IND 1.0 FTF 1 report."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators.rdf version of this ontology was modified to integrate the composite date value and reflect migration of statistical measures to Analytics."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators.rdf version of this ontology was modified to reflect the move of dated collection from arrangements to financial dates."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators.rdf version of this ontology was modified to eliminate deprecated elements."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/"})

(def DailyAverageMarketRate
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "http://www.investopedia.com/terms/m/marketaverage.asp"},
   :db/ident :fibo-ind-ind-ind/DailyAverageMarketRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/"},
   :rdfs/label "daily average market rate",
   :rdfs/subClassOf #{:fibo-ind-ind-ind/MarketRate
                      {:owl/onDataRange :cmns-dt/CombinedDateTime,
                       :owl/onProperty  :fibo-ind-ind-ind/hasQuotationDateTime,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}},
   :skos/definition
   "overall level of a given rate, calculated as the sum of some selected observed values of the rates for a particular reference rate, foreign exchange rate, lending rate, or other market rate divided by the number of samples collected over the course of a twenty-four (24) hour period for a specific date"})

(def EndOfDayMarketRate
  {:db/ident :fibo-ind-ind-ind/EndOfDayMarketRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/"},
   :rdfs/label "end-of-day market rate",
   :rdfs/subClassOf #{:fibo-ind-ind-ind/MarketRate
                      {:owl/onDataRange :cmns-dt/CombinedDateTime,
                       :owl/onProperty  :fibo-ind-ind-ind/hasQuotationDateTime,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}},
   :skos/definition
   "value of a given market rate of the end of the business day for a specific date"})

(def HistoricalPriceVolatility
  {:cmns-av/explanatoryNote
   "Calculations for historical volatility are generally based on the change from one closing price to the next.",
   :db/ident :fibo-ind-ind-ind/HistoricalPriceVolatility,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/"},
   :rdfs/label "historical price volatility",
   :rdfs/subClassOf #{:fibo-ind-ind-ind/HistoricalVolatility
                      :fibo-ind-ind-ind/PriceVolatility},
   :skos/definition
   "historical volatility measure of past trading ranges of prices of underlying securities and indexes"})

(def HistoricalVolatility
  {:cmns-av/synonym "realized volatility",
   :db/ident :fibo-ind-ind-ind/HistoricalVolatility,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/"},
   :rdfs/label "historical volatility",
   :rdfs/subClassOf :fibo-ind-ind-ind/Volatility,
   :skos/definition
   "measure of volatility that uses actual values for pricing, rates, and other measurements calculated over some prior period"})

(def ImpliedPriceVolatility
  {:db/ident :fibo-ind-ind-ind/ImpliedPriceVolatility,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/"},
   :rdfs/label "implied price volatility",
   :rdfs/subClassOf #{:fibo-ind-ind-ind/ImpliedVolatility
                      :fibo-ind-ind-ind/PriceVolatility},
   :skos/definition
   "measure of volatility that represents the expected fluctuations of an underlying stock or index over a specific time frame"})

(def ImpliedVolatility
  {:cmns-av/synonym "projected volatility",
   :db/ident :fibo-ind-ind-ind/ImpliedVolatility,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/"},
   :rdfs/label "implied volatility",
   :rdfs/subClassOf :fibo-ind-ind-ind/Volatility,
   :skos/definition
   "measure of volatility that is a forward-looking metric used to calculate probability"})

(def MarketRate
  {:db/ident :fibo-ind-ind-ind/MarketRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/"},
   :rdfs/label "market rate",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onDataRange :cmns-dt/CombinedDateTime,
                       :owl/onProperty  :fibo-ind-ind-ind/hasQuotationDateTime,
                       :rdf/type        :owl/Restriction}
                      {:owl/onDataRange :xsd/decimal,
                       :owl/onProperty  :fibo-fnd-acc-cur/hasRateValue,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction} :cmns-qtu/Ratio
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-utl-alx/ScopedMeasure,
                       :owl/onProperty :cmns-qtu/isValueOf,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "value of a rate established in the marketplace for a set of instruments or that describes the economic climate for an industry and/or political region (e.g., SOFR, Prime)",
   :skos/example
   "Financial market rates include, but are not limited to reference rates, foreign exchange rates, lending rates, bankers' acceptance rates, and so forth.",
   :skos/scopeNote
   #{"Market rates include but may not be limited to the following:\n\t(1) Index: Statistical composite that measures changes in the economy or in financial markets, often expressed in percentage changes from a base year or from the previous month\n\t(2) Money Rate: Benchmark or guideline for interest rates determined by central banks or economical climate as a whole\n\t(3) Bankers' Acceptance Rate: Benchmark reflecting market fluctuations of Bankers' Acceptance issued instruments\n\t(4) Commercial Paper Rate: Benchmark reflecting market fluctuations of Commercial Paper issued instruments\n\t(5) Certificate of Deposit Rate: Benchmark reflecting market fluctuations of Certificate of Deposit issued instruments\n\t(6) Interbank Rate\n\t(7) Prime\n\t(8) Time Deposit Rate: Benchmark reflecting market fluctuations of Deposit/Redeposit issued instruments"
     "known collectively (in the CFI Standard) as referential instruments"}})

(def MarketSpread
  {:db/ident :fibo-ind-ind-ind/MarketSpread,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/"},
   :rdfs/label "market spread",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-ind-ind-ind/MarketRate,
                       :owl/onProperty :cmns-qtu/hasArgument,
                       :owl/qualifiedCardinality 2,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-utl-alx/ScopedMeasure},
   :skos/definition
   "statistical measure providing the difference (or spread) between two market rates"})

(def PriceStructure
  {:cmns-av/explanatoryNote
   "Historical prices are needed not only for various statistical analyses but for determining best prices for certain kinds of options, for example. Note that prices may be quoted or calculated.",
   :cmns-av/synonym "price history",
   :db/ident :fibo-ind-ind-ind/PriceStructure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/"},
   :rdfs/label "price structure",
   :rdfs/subClassOf #{:fibo-fnd-dt-fd/DatedStructuredCollection
                      {:owl/onProperty     :cmns-col/hasConstituent,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryPrice,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "structured collection of prices, such as market prices for some index or security, such that volatility or other analyses may be performed over the structure"})

(def PriceVolatility
  {:cmns-av/explanatoryNote
   "Volatility can be determined using the standard deviation or variance among prices for the security or market index over some period of time. For a specific security, volatility may measure the amount and frequency in rapid price fluctuation. It is computed as the annualized standard deviation of the percentage change in a security's daily price.",
   :db/ident :fibo-ind-ind-ind/PriceVolatility,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/"},
   :rdfs/label "price volatility",
   :rdfs/subClassOf #{:fibo-ind-ind-ind/Volatility
                      {:owl/onProperty     :cmns-qtu/hasArgument,
                       :owl/someValuesFrom :fibo-ind-ind-ind/PriceStructure,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "statistical measure of the rate of change in pricing for a given security or market index",
   :skos/editorialNote
   "Volatility is modeled here using a structured collection, comprised of a series of individual prices of something (a security, index, etc., typically quoted prices), dates, and the source for those prices for some overall period of time"})

(def QuotedPrice
  {:db/ident :fibo-ind-ind-ind/QuotedPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/"},
   :rdfs/label "quoted price",
   :rdfs/subClassOf #{{:owl/onDataRange :cmns-dt/CombinedDateTime,
                       :owl/onProperty  :fibo-ind-ind-ind/hasQuotationDateTime,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}
                      :fibo-fnd-acc-cur/MonetaryPrice},
   :skos/definition
   "a monetary price quoted by some publisher on a given date"})

(def TermStructure
  {:cmns-av/explanatoryNote
   "Term structure refers to a set of discrete points; elements are ordered by time. Restrictions on the rate (see above) and a point in time, paired together, and then ordered in a structured collection is how this should ultimately be modeled. Then the concept of yield curve would be a child of term structure, for calculation of net present value, for example. Term structures consist of two or more observed or projected values, typically related to debt instruments or interest rates. assessment of monetary policy conditions, and so forth.",
   :db/ident :fibo-ind-ind-ind/TermStructure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/"},
   :rdfs/label "term structure",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-col/hasConstituent,
                       :owl/someValuesFrom :fibo-ind-ind-ind/MarketRate,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-dt-fd/DatedStructuredCollection},
   :skos/definition
   "structured collection of rates, such as interest rates, or bond yields with different terms to maturity, such that a yield curve may be constructed for the structure"})

(def Volatility
  {:db/ident :fibo-ind-ind-ind/Volatility,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/"},
   :rdfs/label "volatility",
   :rdfs/subClassOf #{:fibo-fnd-utl-alx/Dispersion
                      {:owl/unionOf [:fibo-fnd-utl-alx/Variance
                                     :fibo-fnd-utl-alx/StandardDeviation],
                       :rdf/type    :owl/Class}
                      {:owl/onProperty     :cmns-dt/hasDatePeriod,
                       :owl/someValuesFrom :cmns-dt/DatePeriod,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty :cmns-qtu/hasArgument,
                       :owl/someValuesFrom
                       :fibo-fnd-dt-fd/DatedStructuredCollection,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "statistical measure of the dispersion around the average of some random variable over some period of time"})

(def hasQuotationDate
  {:cmns-av/explanatoryNote
   "Typically this property reflects a daily average or end of day quote.",
   :cmns-av/usageNote
   "Note that this property requires a reified date value, if used.",
   :db/ident :fibo-ind-ind-ind/hasQuotationDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/"},
   :rdfs/label "has quotation date",
   :rdfs/range :cmns-dt/Date,
   :rdfs/subPropertyOf :cmns-dt/hasDate,
   :skos/definition
   "indicates the quotation date for a given market rate or indicator"})

(def hasQuotationDateTime
  {:db/ident :fibo-ind-ind-ind/hasQuotationDateTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/"},
   :rdfs/label "has quotation date and time",
   :rdfs/range :cmns-dt/CombinedDateTime,
   :rdfs/subPropertyOf :cmns-dt/hasObservedDateTime,
   :skos/definition
   "indicates a quotation date and possibly a time for a given market rate, interest rate, indicator, or other quoted pricing information"})

(def isVolatilityOf
  {:db/ident :fibo-ind-ind-ind/isVolatilityOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-ind-ind-ind/Volatility,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/"},
   :rdfs/label "is volatility of",
   :rdfs/subPropertyOf :cmns-cxtdsg/appliesTo,
   :skos/definition
   "indicates something to which the volatility measure applies and of which it is a measure"})

(def urn:uuid:06818dc7-dd9b-5c80-a80d-fd21d64b0be9
  {:cmns-av/copyright #{"Copyright (c) 2014-2023 Object Management Group, Inc."
                        "Copyright (c) 2014-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology provides the concepts common to all market rates, indices and indicators; that is concepts descriptive of the numeric parameters themselves. These are modeled independently of the values they may take over time.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Organizations/FormalOrganizations/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/Indicators/Indicators/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Indicators Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators.rdf version of this ontology was modified to loosen the nature of a price in a price structure to include any price, not limited to a quoted price from a specific source, to allow for calculated prices to be included in the structure and to deprecate redundant terms including financial information publisher, and published financial information."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators.rdf version of the ontology was modified to eliminate deprecations that are more than 6 months old and to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators.rdf version of this ontology was modified per the FIBO 2.0 RFC, namely, to integrate concepts recently added to the FND domain including Rate, ExchangeRate, InterestRate and StructuredCollection and revise definitions of TermStructure and Volatility to better support concepts such as yield curves and analysis of market rates generally."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators.rdf version of this ontology was modified to add definitions for historical and implied volatility, and differentiate price volatility accordingly."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators.rdf version of this ontology was modified to a restriction on isValueOf to MarketRate and eliminate its dependence on PublishedFinancialInformation, and to revise the definition of market rate, daily average market rate, and end of day market rate."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators.rdf version of this ontology was modified to eliminate a redundant superclass declaration on MarketSpread, introduced by refactoring of FND analytics."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators.rdf version of this ontology was modified to extend the definition of price structure to include a synonym of price history and state that it is intended to be used for any sort of analysis of historic prices."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators.rdf version of this ontology was modified per the issue resolutions identified in the FIBO IND 1.0 FTF 1 report."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators.rdf version of this ontology was modified to integrate the composite date value and reflect migration of statistical measures to Analytics."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators.rdf version of this ontology was modified to reflect the move of dated collection from arrangements to financial dates."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators.rdf version of this ontology was modified to eliminate deprecated elements."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/"})