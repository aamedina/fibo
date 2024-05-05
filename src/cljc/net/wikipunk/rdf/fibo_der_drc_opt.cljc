(ns net.wikipunk.rdf.fibo-der-drc-opt
  {:cmns-av/copyright #{"Copyright (c) 2015-2024 Object Management Group, Inc."
                        "Copyright (c) 2015-2024 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/DerivativesContracts/Options/",
   :dcterms/abstract
   "Concepts common to all option contracts. An option gives one party (the holder) the right to purchase or sell the underlying instrument at a given time or times in the future (as determined by the exercise convention), if they choose to do so.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-qtu" "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-fct-pub"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
    "fibo-der-drc-bsc"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
    "fibo-der-drc-opt"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
    "fibo-der-rtd-rtd"
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/",
    "fibo-der-sbd-sbd"
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
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
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-arr-doc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-oac-own"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-ir-ir"
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
    "fibo-sec-dbt-bnd"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/",
    "fibo-sec-dbt-ex"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/",
    "fibo-sec-sec-bsk"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Baskets/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/InterestRates/InterestRates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/Markets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FinancialInstruments/InstrumentPricing/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/Bonds/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/FunctionalEntities/Publishers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/ExerciseConventions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/Analytics/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/RateDerivatives/RateDerivatives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Equities/EquityInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/Baskets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/DerivativesContracts/Options/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-der-drc-opt",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Options Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options.rdf version of this ontology was revised to add an expiration date as an important property of an option."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options.rdf version of the ontology was modified to replace additional concepts from several FIBO FND ontologies with their counterparts added to the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options.rdf version of this ontology was revised to make certain values subclasses of MonetaryAmount instead of MonetaryMeasure."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options.rdf version of this ontology was revised to add the most common options trading strategies."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options.rdf version of the ontology was modified to replace concepts from several FIBO FND ontologies with their counterparts added to the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options.rdf version of this ontology was revised to correct a restriction on an option with respect to an optional option premium which was not well-formed, and modified the definition of interest rate option to reflect a benchmark, and to be a specialization of vanilla option."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options.rdf version of this ontology was revised to add an explanatory note to basket option and make it a kind of exotic option and added interest rate derivative as the parent of interest rate option; added capped option as a kind of vanilla option."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, and to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"})

(def AtTheMoney
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "ATM"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "An ATM option has a delta of ±0.50, positive if it is a call, negative for a put."},
   :db/ident :fibo-der-drc-opt/AtTheMoney,
   :rdf/type #{:fibo-der-drc-opt/Moneyness :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "at-the-money"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "moneyness classifier that refers to an option whose value in terms of its strike price is the same or close to the current market price of the underlying security"}})

(def BasketOption
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "As with other options, a basket option gives the holder the right, but not the obligation, to buy or sell the basket at a specific price, on or before a certain date. This exotic option has all the characteristics of a standard option, but with the basis of the strike price on the weighted value of its components. Currency baskets are the most popular type of basket option, and they will settle in the holder's home currency. Because it involves just one transaction, a basket option often costs less than multiple single options as it saves on commissions and fees."},
   :db/ident :fibo-der-drc-opt/BasketOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "basket option"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fbc-fi-ip/hasPriceDeterminationMethod,
      :owl/someValuesFrom :fibo-fbc-fi-ip/PriceDeterminationMethod,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-agr-ctr/hasContractDuration,
      :owl/someValuesFrom :cmns-dt/ExplicitDuration,
      :rdf/type           :owl/Restriction} :fibo-der-drc-opt/ExoticOption
     {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
      :owl/someValuesFrom :fibo-sec-sec-bsk/MixedBasket,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "option whose underlying asset is a group, or basket, of commodities, securities, indices, or currencies"}})

(def BondOption
  {:db/ident :fibo-der-drc-opt/BondOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bond option"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                       :owl/someValuesFrom :fibo-sec-dbt-bnd/Bond,
                       :rdf/type           :owl/Restriction}
                      :fibo-der-drc-opt/FixedIncomeOption},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "option giving the buyer (holder) the right, but not the obligation, to buy or sell (depending on whether it is a call or a put) a bond at a certain price on or before a specified date"}})

(def Butterfly
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "These spreads are intended as a market-neutral strategy and pay off the most if the underlying asset does not move prior to option expiration. They involve either four calls, four puts, or a combination of puts and calls with three strike prices. Butterfly spreads pay off the most if the underlying asset price doesn't change before the option expires. The upper and lower strike prices are equal distance from the middle, or at-the-money, strike price."},
   :db/ident :fibo-der-drc-opt/Butterfly,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "butterfly"},
   :rdfs/subClassOf #{:fibo-der-drc-opt/OptionTradingStrategy
                      {:owl/onClass    :fibo-fbc-fi-fi/Option,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 4,
                       :rdf/type       :owl/Restriction}
                      {:owl/onClass    :fibo-der-drc-opt/StrikePrice,
                       :owl/onProperty :fibo-der-drc-opt/hasExercisePrice,
                       :owl/qualifiedCardinality 3,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "strategy that combines bull and bear spreads with a fixed risk and capped profit"}})

(def CallOption
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019."},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The seller (issuer) of the call option assumes the obligation of delivering the assets specified should the buyer exercise the option."},
   :db/ident :fibo-der-drc-opt/CallOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "call option"},
   :rdfs/subClassOf :fibo-fbc-fi-fi/Option,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "option giving the buyer (holder) the right, but not the obligation, to buy the assets specified at a fixed price or formula, on or before a specified date"}})

(def CappedOption
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The cap price is equal to the option's strike price plus a cap interval for a call option or the strike price minus a cap interval for a put option. A capped option is automatically exercised when the underlying security closes at or above (for a call) or at or below (for a put) the option's cap price."},
   :db/ident :fibo-der-drc-opt/CappedOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "capped option"},
   :rdfs/subClassOf #{:fibo-der-drc-opt/VanillaOption
                      {:owl/onProperty     :fibo-der-drc-opt/hasCapPrice,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryPrice,
                       :rdf/type           :owl/Restriction}},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "option with an established profit cap or cap price"}})

(def Collar
  {:db/ident :fibo-der-drc-opt/Collar,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "collar"},
   :rdfs/subClassOf #{:fibo-der-drc-opt/OptionTradingStrategy
                      {:owl/onClass    :fibo-der-drc-opt/PutOption,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onClass    :fibo-der-drc-opt/CallOption,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "option trading strategy that involves buying a downside put and selling an upside call that is implemented to protect against large losses, but which also limits large upside gains"}})

(def CondorSpread
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "There are two types of condor spreads. A long condor seeks to profit from low volatility and little to no movement in the underlying asset. A short condor seeks to profit from high volatility and a sizable move in the underlying asset in either direction. A Condor Spread uses either all calls or all puts."},
   :db/ident :fibo-der-drc-opt/CondorSpread,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "condor spread"},
   :rdfs/subClassOf :fibo-der-drc-opt/OptionTradingStrategy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "non-directional options strategy that limits both gains and losses while seeking to profit from either low or high volatility"}})

(def CoveredCall
  {:db/ident :fibo-der-drc-opt/CoveredCall,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "covered call"},
   :rdfs/subClassOf :fibo-der-drc-opt/CallOption,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "call option in which the seller (investor) owns an equivalent amount of the underlying security"}})

(def EquityOption
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019."},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "For an Equity Option, one contract represents 100 shares of stock. Equity options settle in 'American style'."},
   :db/ident :fibo-der-drc-opt/EquityOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity option"},
   :rdfs/subClassOf
   #{:fibo-der-sbd-sbd/EquityDerivative :fibo-der-drc-opt/VanillaOption
     {:owl/hasValue   :fibo-sec-dbt-ex/AmericanExerciseConvention,
      :owl/onProperty :fibo-der-drc-opt/hasExerciseStyle,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "option giving the buyer (holder) the right, but not the obligation, to buy (via a call option) or sell (via a put option) the underlying equity assets specified at a pre-determined price (i.e., the strike price, fixed or calculated), on or before a specified date (the expiration date)"}})

(def ExoticOption
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "Commodity Futures Trading Commission (CFTC) glossary, https://www.cftc.gov/LearnAndProtect/EducationCenter/CFTCGlossary/glossary_e.html"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Exotic options include Asian options and lookback options, and are mostly traded in the over-the-counter market."},
   :db/ident :fibo-der-drc-opt/ExoticOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "exotic option"},
   :rdfs/subClassOf #{:fibo-der-drc-bsc/OverTheCounterInstrument
                      :fibo-fbc-fi-fi/Option},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "option that has a non-standard payout structure or other feature"}})

(def ExtrinsicValue
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Extrinsic value is also the portion of the worth that has been assigned to an option by factors other than the underlying asset's price. The opposite of extrinsic value is intrinsic value, which is the inherent worth of an option."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "option time value"},
   :db/ident :fibo-der-drc-opt/ExtrinsicValue,
   :owl/disjointWith :fibo-der-drc-opt/IntrinsicValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "extrinsic value"},
   :rdfs/subClassOf :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "measure of the difference between the market price of an option, called the premium, and its intrinsic value"}})

(def Fence
  {:cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "The expiration dates of all the options are usually the same. The call strike is normally chosen in such a way that the sum total of the three option premiums is equal to zero. This investment strategy will ensure that the value of the investment at expiry will be between the strike price on the short call and the strike price on the long put. Thus, possible gains and losses (the value of the financial instrument minus the cost of acquiring it) are confined to a specified range. However, if the price of the financial instrument falls below the strike level of the sold put the investor will start participating in any further price declines of the financial instrument."}
     {:rdf/language "en",
      :rdf/value
      "A fence consists of the following elements:\n- long position in a financial instrument (e.g., a share, index or currency)\n- long put (normally with a strike price close to or at the current spot price of the financial instrument)\n- short put (with a strike price lower than the bought put - e.g., 80% of the current spot price)\n- short call (with a strike price higher than the current spot price)."}},
   :db/ident :fibo-der-drc-opt/Fence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fence"},
   :rdfs/subClassOf #{:fibo-der-drc-opt/OptionTradingStrategy
                      {:owl/onClass    :fibo-der-drc-opt/PutOption,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 2,
                       :rdf/type       :owl/Restriction}
                      {:owl/onClass    :fibo-der-drc-opt/CallOption,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "option trading strategy that uses options to limit the range of possible returns on a financial instrument"}})

(def FixedIncomeOption
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019."},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Fixed income options, or debt options, are derivatives contracts that use bonds or other fixed-income securities as their underlying asset."},
   :db/ident :fibo-der-drc-opt/FixedIncomeOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fixed income option"},
   :rdfs/subClassOf #{:fibo-der-drc-opt/VanillaOption
                      :fibo-der-sbd-sbd/DebtInstrumentDerivative},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "option giving the buyer (holder) the right, but not the obligation, to buy (via a call option) or sell (via a put option) the underlying fixed income assets specified at a pre-determined price (i.e., the strike price, fixed or calculated), on or before a specified date (the expiration date)"}})

(def InTheMoney
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "ITM"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "An in-the-money call option means the option holder has the opportunity to buy the security below its current market price. An in-the-money put option means the option holder can sell the security above its current market price."},
   :db/ident :fibo-der-drc-opt/InTheMoney,
   :rdf/type #{:fibo-der-drc-opt/Moneyness :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "in-the-money"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "moneyness classifier that refers to an option that has value in a strike price that is favorable in comparison to the prevailing market price of the underlying asset"}})

(def InterestRateOption
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The amount of the payment will be based on the difference between the market rate on the exercise date and the strike rate, multiplied by the notional principal specified in the option contract, to calculate the total payment."},
   :db/ident :fibo-der-drc-opt/InterestRateOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "interest rate option"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
      :owl/someValuesFrom :fibo-ind-ir-ir/InterestRateBenchmark,
      :rdf/type           :owl/Restriction} :fibo-der-drc-opt/VanillaOption
     :fibo-der-rtd-rtd/InterestRateDerivativeInstrument
     {:owl/onProperty     :fibo-der-drc-opt/hasStrikeRate,
      :owl/someValuesFrom :fibo-fnd-acc-cur/InterestRate,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "option that giving the buyer (holder) the right, but not the obligation, to receive a cash payment if market interest rate of a reference rate is higher or lower, depending on the option, than the strike rate of the option"}})

(def IntrinsicValue
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This measure is arrived at by means of an objective calculation or complex financial model. In financial analysis this term is used in conjunction with the work of identifying, as nearly as possible, the underlying value of a company and its cash flow. In options pricing it refers to the difference between the strike price of the option and the current price of the underlying asset."},
   :db/ident :fibo-der-drc-opt/IntrinsicValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "intrinsic value"},
   :rdfs/subClassOf :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "measure of what an asset is worth, i.e. with respect to its current price"}})

(def IronButterfly
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The key to using this trade as part of a successful trading strategy is to forecast a time when option prices are likely to decline in value generally. This usually occurs during periods of sideways movement or a mild upward trend."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "iron fly"},
   :db/ident :fibo-der-drc-opt/IronButterfly,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "iron butterfly"},
   :rdfs/subClassOf #{{:owl/onClass    :fibo-der-drc-opt/CallOption,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 2,
                       :rdf/type       :owl/Restriction}
                      :fibo-der-drc-opt/Butterfly
                      {:owl/onClass    :fibo-der-drc-opt/PutOption,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 2,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "butterfly strategy that consists of two call options and two put options, three strike prices and the same expiration date"}})

(def IronCondor
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The iron condor earns the maximum profit when the underlying asset closes between the middle strike prices at expiration. In other words, the goal is to profit from low volatility in the underlying asset."},
   :db/ident :fibo-der-drc-opt/IronCondor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "iron condor"},
   :rdfs/subClassOf #{{:owl/onClass    :fibo-der-drc-opt/CallOption,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 2,
                       :rdf/type       :owl/Restriction}
                      :fibo-der-drc-opt/CondorSpread
                      {:owl/onClass    :fibo-der-drc-opt/PutOption,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 2,
                       :rdf/type       :owl/Restriction}
                      {:owl/onClass    :fibo-der-drc-opt/StrikePrice,
                       :owl/onProperty :fibo-der-drc-opt/hasExercisePrice,
                       :owl/qualifiedCardinality 4,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "condor strategy consisting of two puts (one long and one short) and two calls (one long and one short), and four strike prices, all with the same expiration date"}})

(def LongTermEquityAnticipationSecurity
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "LEAP"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "By providing opportunities to control and manage risk or even to speculate, LEAPS are virtually identical to regular options. Expiration dates on LEAPs can range from nine months to three years, which is longer than the holding period for a traditional call or put option. Although they are not available on all stocks, LEAPS are available on most widely held issues."},
   :db/ident :fibo-der-drc-opt/LongTermEquityAnticipationSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "long-term equity anticipation security"},
   :rdfs/subClassOf #{:fibo-der-drc-opt/EquityOption
                      {:owl/onProperty :fibo-fnd-agr-ctr/hasContractDuration,
                       :owl/someValuesFrom :cmns-dt/Duration,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "equity option that allows the holder to buy or sell shares of stock with expiration dates that are longer than one year, and typically up to three years from issue"}})

(def Moneyness
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Moneyness describes the intrinsic value of an option in its current state. The term moneyness is most commonly used with put and call options and is an indicator as to the comparative value of the option with respect to its exercise/strike price. Moneyness can be measured with respect to the underlying stock or other asset's current/spot price or its future price."},
   :db/ident :fibo-der-drc-opt/Moneyness,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "moneyness"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-cls/classifies,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/Option,
                       :rdf/type           :owl/Restriction}
                      :cmns-cls/Classifier},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "classifier for a derivative relating its strike price to the price of its underlying asset"}})

(def OptionHolder
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "In a call, the option holder has the right, but not the obligation, to buy the underlying asset, while, in a put, the option holder has the right to sell the underlying asset. An option holder may sell the option contract itself, at which point the buyer becomes the option holder. Once the instrument is exercised there are typically additional, relevant obligations with regard to settlement."},
   :db/ident :fibo-der-drc-opt/OptionHolder,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "option holder"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/holds,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/Option,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-oac-own/Owner},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "party that owns an option"}})

(def OptionIssuer
  {:db/ident :fibo-der-drc-opt/OptionIssuer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "option issuer"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom {:owl/onProperty     :cmns-pts/isAPartyTo,
                           :owl/someValuesFrom :fibo-fbc-fi-fi/Option,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction} :fibo-fbc-fi-fi/Issuer},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "issuer granting the rights defined in the option in exchange for some consideration"}})

(def OptionOnFuture
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019."},
   :db/ident :fibo-der-drc-opt/OptionOnFuture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "option on future"},
   :rdfs/subClassOf #{:fibo-der-drc-opt/VanillaOption
                      {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/Future,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty :fibo-sec-dbt-ex/hasExerciseTerms,
                       :owl/someValuesFrom
                       :fibo-sec-dbt-ex/AmericanExerciseTerms,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "option that gives the holder the right, but not the obligation, to buy or sell a specific futures contract at a specified price on or before the option's expiration date"}})

(def OptionPremium
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The option premium is the income received by the seller (writer) of an option contract to another party. In-the-money option premiums are composed of two factors: intrinsic and extrinsic value. Out-of-the-money options' premiums consist solely of extrinsic value. For stock options, the premium is quoted as a dollar amount per share, and most contracts represent the commitment of 100 shares."},
   :db/ident :fibo-der-drc-opt/OptionPremium,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "option premium"},
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-der-drc-opt/OptionPremiumFormula,
                       :owl/onProperty :cmns-qtu/hasExpression,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass :fibo-fnd-acc-cur/PercentageMonetaryAmount,
                       :owl/onProperty :cmns-qtu/hasQuantityValue,
                       :rdf/type :owl/Restriction} :fibo-fbc-fi-ip/MarketPrice
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                       :owl/onProperty :fibo-fnd-acc-cur/hasMonetaryAmount,
                       :rdf/type       :owl/Restriction}},
   :skos/definition {:rdf/language "en",
                     :rdf/value "current market price of an option contract"}})

(def OptionPremiumFormula
  {:db/ident :fibo-der-drc-opt/OptionPremiumFormula,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "option premium formula"},
   :rdfs/subClassOf :cmns-qtu/Expression,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "expression used to calculate the premium based either on the price per option or percentage of the notional amount"}})

(def OptionTradingStrategy
  {:cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "Option trading strategies refer to buying calls or put options or selling calls or put options or both together for the purpose of limiting losses and/or optimizing profits. Basically, these strategies utilize one or more combinations for the best outcome possible based on defined parameters. Simple combinations include option spread trades such as vertical spreads, calendar (or horizontal) spreads, and diagonal spreads. More involved combinations include trades such as condor or butterfly spreads which are actually combinations of two vertical spreads."}
     {:rdf/language "en",
      :rdf/value
      "Note that some trading strategies may be considered financial instruments in their own right, but most strategies are not. The critical differentiators include whether the strategy itself can be traded, whether it has a financial instrument identifier independently from the identifier(s) of the embedded instrument(s), such as a FIGI or ISIN, and so forth."}},
   :db/ident :fibo-der-drc-opt/OptionTradingStrategy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "option trading strategy"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-col/comprises,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/Option,
                       :rdf/type           :owl/Restriction}
                      :fibo-fbc-pas-fpas/TradingStrategy},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "trading tactic involving more than one option type, strike price, or expiration date on the same underlying asset"}})

(def OutOfTheMoney
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "OTM"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "An OTM call option will have a strike price that is higher than the market price of the underlying asset. Alternatively, an OTM put option has a strike price that is lower than the market price of the underlying asset."},
   :db/ident :fibo-der-drc-opt/OutOfTheMoney,
   :rdf/type #{:fibo-der-drc-opt/Moneyness :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "out-of-the-money"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "moneyness classifier that refers to an option whose value in terms of its strike price is not favorable in comparison to the prevailing market price of the underlying asset"}})

(def ProtectiveCollar
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A protective collar consists of a long position in the underlying security, a put option purchased to hedge the downside risk on a stock, a call option written on the stock to finance the put purchase."},
   :db/ident :fibo-der-drc-opt/ProtectiveCollar,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "protective collar"},
   :rdfs/subClassOf #{:fibo-der-drc-opt/Collar
                      {:owl/onClass    :fibo-der-drc-opt/CoveredCall,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onClass    :fibo-der-drc-opt/ProtectivePut,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "collar that consists of a covered call and protective put"}})

(def ProtectivePut
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A protective put is a risk management and options strategy that involves holding a long position in the underlying asset (e.g., stock). A protective put strategy is analogous to the nature of insurance. The main goal of a protective put is to limit potential losses that may result from an unexpected price drop of the underlying asset"},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "synthetic call"},
   :db/ident :fibo-der-drc-opt/ProtectivePut,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "protective put"},
   :rdfs/subClassOf #{:fibo-der-drc-opt/PutOption
                      {:owl/onProperty
                       :fibo-der-drc-opt/hasCalculatedMarketValue,
                       :owl/someValuesFrom :fibo-der-drc-opt/OptionPremium,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "put option giving the buyer (holder) the right, but not the obligation, to sell the assets specified at with a strike price equal or close to the current price of the underlying asset, on or before a specified date"}})

(def PutOption
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019."},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The seller of the put option assumes the obligation of buying the assets specified should the buyer exercise the option."},
   :db/ident :fibo-der-drc-opt/PutOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "put option"},
   :rdfs/subClassOf :fibo-fbc-fi-fi/Option,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "option giving the buyer (holder) the right, but not the obligation, to sell the assets specified at a fixed price or formula, on or before a specified date"}})

(def RiskReversal
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A risk reversal is a position which simulates profit and loss behavior of owning an underlying security; therefore, it is sometimes called a synthetic long. This is an investment strategy that amounts to both buying and selling out-of-money options simultaneously. In this strategy, the investor will first make a market hunch; if that hunch is bullish, he will want to go long. However, instead of going long on the stock, he will buy an out of the money call option, and simultaneously sell an out of the money put option. Presumably he will use the money from the sale of the put option to purchase the call option. Then as the stock goes up in price, the call option will be worth more, and the put option will be worth less."},
   :db/ident :fibo-der-drc-opt/RiskReversal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "risk reversal"},
   :rdfs/subClassOf #{:fibo-der-drc-opt/OptionTradingStrategy
                      {:owl/onClass    :fibo-der-drc-opt/PutOption,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onClass    :fibo-der-drc-opt/CallOption,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "option trading strategy that consists of being short (selling) an out of the money put and being long (i.e., buying) an out of the money call, both with the same maturity"}})

(def StandardizedOptionsTerms
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019."},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Such terms may relate to the underlying instruments, exercise price, expiration date, and contract size, for example."},
   :db/ident :fibo-der-drc-opt/StandardizedOptionsTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "standardized options terms"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fbc-fi-ip/hasPriceDeterminationMethod,
      :owl/someValuesFrom :fibo-fbc-fi-ip/PriceDeterminationMethod,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
      :owl/someValuesFrom :fibo-der-drc-opt/VanillaOption,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-be-fct-pub/hasPublisher,
      :owl/someValuesFrom {:owl/unionOf
                           [:fibo-fbc-fct-mkt/Exchange
                            :fibo-der-drc-bsc/DerivativesClearingOrganization],
                           :rdf/type :owl/Class},
      :rdf/type           :owl/Restriction} :fibo-fbc-fi-fi/StandardizedTerms},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "standardized contract terms established by a securities or options exchange or by an options clearing entity"}})

(def Straddle
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The strategy is profitable only when the value of the underlier varies (rises or falls) from the strike price by more than the total premium paid."},
   :db/ident :fibo-der-drc-opt/Straddle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "straddle"},
   :rdfs/subClassOf #{:fibo-der-drc-opt/OptionTradingStrategy
                      {:owl/onClass    :fibo-der-drc-opt/PutOption,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onClass    :fibo-der-drc-opt/CallOption,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "neutral option trading strategy that involves simultaneously buying both a put option and a call option for the underlying security with the same strike price and the same expiration date"}})

(def Strangle
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A strangle is a good strategy if you think the underlying security will experience a large price movement in the near future but are unsure of the direction. However, it is profitable mainly if the asset swings sharply in price."},
   :db/ident :fibo-der-drc-opt/Strangle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "strangle"},
   :rdfs/subClassOf #{:fibo-der-drc-opt/OptionTradingStrategy
                      {:owl/onClass    :fibo-der-drc-opt/PutOption,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onClass    :fibo-der-drc-opt/CallOption,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "option trading strategy in which the investor holds a position in both a call and a put option with different strike prices, but with the same expiration date and underlying asset"}})

(def StrikePrice
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "For call options, the strike price is the price at which the security may be purchased by the option holder; for put options, the strike price is the price at which the security may be sold."},
   :db/ident :fibo-der-drc-opt/StrikePrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "strike price"},
   :rdfs/subClassOf :fibo-fnd-acc-cur/MonetaryPrice,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "price at which a lot of the underlying asset may be bought or sold when the contract is exercised"}})

(def StripStrategy
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Typically, a strip is a strategy that involves being long in one call position and two put options, all with the same strike price on a single underlying stock. The investor who adopts this strategy believes that the underlying price of the stock will plummet in the near-term future. All three of the options will have the same expiration date and the same strike price. If the investor is correct and the price drastically decreases, the puts will pay out substantially. If the investor is wrong and the price of the underlying asset increases, the call option will mitigate the loss. The period between resets may be called a Caplet or Floorlet."},
   :db/ident :fibo-der-drc-opt/StripStrategy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "strip strategy"},
   :rdfs/subClassOf #{:fibo-der-drc-opt/OptionTradingStrategy
                      {:owl/onProperty     :fibo-fnd-dt-fd/hasSchedule,
                       :owl/someValuesFrom :fibo-fnd-dt-fd/Schedule,
                       :rdf/type           :owl/Restriction}
                      {:owl/onClass    :fibo-der-drc-opt/PutOption,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 2,
                       :rdf/type       :owl/Restriction}
                      {:owl/onClass    :fibo-der-drc-opt/CallOption,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "option trading strategy that involves a sequential set of options with periodic reset dates, such that each period between resets behaves like an individual option"}})

(def VanillaOption
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Vanilla options include call or put options that have no special or unusual features, and are typically exchange traded."},
   :db/ident :fibo-der-drc-opt/VanillaOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "vanilla option"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fbc-fi-ip/hasPriceDeterminationMethod,
      :owl/someValuesFrom :fibo-fbc-fi-ip/PriceDeterminationMethod,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-agr-ctr/hasContractDuration,
      :owl/someValuesFrom :cmns-dt/ExplicitDuration,
      :rdf/type           :owl/Restriction} :fibo-fbc-fi-fi/Option},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "common option giving the buyer (holder) the right, but not the obligation, to buy (via a call option) or sell (via a put option) the underlying assets specified at a pre-determined price (i.e., the strike price, fixed or calculated), on or before a specified date (the expiration date)"}})

(def hasCalculatedMarketValue
  {:cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "has premium"},
   :db/ident :fibo-der-drc-opt/hasCalculatedMarketValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/Option,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has calculated market value"},
   :rdfs/range :fibo-der-drc-opt/OptionPremium,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasPrice,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates a calculated price as of some relative date considered the market value of the option at that point in time"}})

(def hasCapPrice
  {:db/ident :fibo-der-drc-opt/hasCapPrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has cap price"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryPrice,
   :rdfs/subPropertyOf #{:fibo-fnd-acc-cur/hasPrice
                         :fibo-fnd-acc-cur/hasMonetaryAmount},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "price at which the contract may be exercised"}})

(def hasExerciseDateOffset
  {:db/ident :fibo-der-drc-opt/hasExerciseDateOffset,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-opt/StripStrategy,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has exercise date offset"},
   :rdfs/range :cmns-dt/Duration,
   :rdfs/subPropertyOf :cmns-dt/hasDuration,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the period in days between the reset date and the exercise date"}})

(def hasExercisePrice
  {:cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "has strike price"},
   :db/ident :fibo-der-drc-opt/hasExercisePrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has exercise price"},
   :rdfs/range :fibo-der-drc-opt/StrikePrice,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasPrice,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "specifies a predetermined price at which the holder commits to buy or sell an underlying asset"}})

(def hasExerciseSchedule
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "An exercise schedule may be as simple as a single date or date period. However, in more complex cases, it may be an ad hoc schedule of individual dates, or a regular schedule of periodic exercise dates."},
   :db/ident :fibo-der-drc-opt/hasExerciseSchedule,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/Option,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has exercise schedule"},
   :rdfs/range :fibo-fnd-dt-fd/Schedule,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasSchedule,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "links an option to the schedule specified in the contract that constrains when it may be exercised"}})

(def hasExerciseStyle
  {:db/ident :fibo-der-drc-opt/hasExerciseStyle,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/Option,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label "has exercise style",
   :rdfs/range :fibo-sec-dbt-ex/ExerciseConvention,
   :rdfs/subPropertyOf :cmns-cls/isClassifiedBy,
   :skos/definition
   "indicates the exercise convention specified for the option"})

(def hasInterestAccrualDateOffset
  {:db/ident :fibo-der-drc-opt/hasInterestAccrualDateOffset,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-opt/StripStrategy,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has interest accrual date offset"},
   :rdfs/range :cmns-dt/Duration,
   :rdfs/subPropertyOf :cmns-dt/hasDuration,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the period in days between each reset date and the commencement of interest accrual for the next period"}})

(def hasOptionHolder
  {:db/ident :fibo-der-drc-opt/hasOptionHolder,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/Option,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label "has option holder",
   :rdfs/range :fibo-der-drc-opt/OptionHolder,
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasContractParty,
   :skos/definition "indicates the owner of the option"})

(def hasOptionWriter
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Typically, the option writer collects the premium when the option is initially sold."},
   :db/ident :fibo-der-drc-opt/hasOptionWriter,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/Option,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label "has option writer",
   :rdfs/range :fibo-der-drc-opt/OptionIssuer,
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasContractParty,
   :skos/definition "indicates the issuer of the option"})

(def hasSettlementDateOffset
  {:db/ident :fibo-der-drc-opt/hasSettlementDateOffset,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-opt/StripStrategy,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has settlement date offset"},
   :rdfs/range :cmns-dt/Duration,
   :rdfs/subPropertyOf :cmns-dt/hasDuration,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicats the period in days between each reset date and the corresponding settlement date"}})

(def hasStrikePercentageAmount
  {:db/ident :fibo-der-drc-opt/hasStrikePercentageAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has strike percentage amount"},
   :rdfs/range :fibo-fnd-acc-cur/PercentageMonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasPrice,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates a strike price or level expressed as a percentage of the value of the underlying asset"}})

(def hasStrikeRate
  {:db/ident :fibo-der-drc-opt/hasStrikeRate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has strike rate"},
   :rdfs/range :cmns-qtu/Ratio,
   :rdfs/subPropertyOf :cmns-qtu/hasQuantityValue,
   :skos/definition {:rdf/language "en",
                     :rdf/value "rate at which the contract may be exercised"}})

(def urn:uuid:79d6b168-31a2-5de9-8cad-893694eae4de
  {:cmns-av/copyright #{"Copyright (c) 2015-2024 Object Management Group, Inc."
                        "Copyright (c) 2015-2024 EDM Council, Inc."},
   :dcterms/abstract
   "Concepts common to all option contracts. An option gives one party (the holder) the right to purchase or sell the underlying instrument at a given time or times in the future (as determined by the exercise convention), if they choose to do so.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/InterestRates/InterestRates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/Markets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FinancialInstruments/InstrumentPricing/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/Bonds/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/FunctionalEntities/Publishers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/ExerciseConventions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/Analytics/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/RateDerivatives/RateDerivatives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Equities/EquityInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/Baskets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/DerivativesContracts/Options/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Options Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options.rdf version of this ontology was revised to add an expiration date as an important property of an option."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options.rdf version of the ontology was modified to replace additional concepts from several FIBO FND ontologies with their counterparts added to the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options.rdf version of this ontology was revised to make certain values subclasses of MonetaryAmount instead of MonetaryMeasure."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options.rdf version of this ontology was revised to add the most common options trading strategies."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options.rdf version of the ontology was modified to replace concepts from several FIBO FND ontologies with their counterparts added to the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options.rdf version of this ontology was revised to correct a restriction on an option with respect to an optional option premium which was not well-formed, and modified the definition of interest rate option to reflect a benchmark, and to be a specialization of vanilla option."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options.rdf version of this ontology was revised to add an explanatory note to basket option and make it a kind of exotic option and added interest rate derivative as the parent of interest rate option; added capped option as a kind of vanilla option."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, and to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"})