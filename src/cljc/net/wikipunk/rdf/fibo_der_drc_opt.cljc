(ns net.wikipunk.rdf.fibo-der-drc-opt
  "Concepts common to all option contracts. An option gives one party (the holder) the right to purchase or sell the underlying instrument at a given time or times in the future (as determined by the exercise convention), if they choose to do so."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :dcterms/abstract
   "Concepts common to all option contracts. An option gives one party (the holder) the right to purchase or sell the underlying instrument at a given time or times in the future (as determined by the exercise convention), if they choose to do so.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/Bonds/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/Baskets/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Equities/EquityInstruments/"
    "https://www.omg.org/spec/Commons/DatesAndTimes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/Ownership/"
    "https://www.omg.org/spec/Commons/Classifiers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesListings/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/InstrumentPricing/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/DerivativesBasics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Quantities/QuantitiesAndUnits/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/RateDerivatives/RateDerivatives/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/Markets/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/ExerciseConventions/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/Publishers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/InterestRates/InterestRates/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/Options/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
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
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
    "fibo-fnd-qt-qtu"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-alx"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-der-drc-opt",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "Options Ontology@en",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/DER/20210601/DerivativesContracts/Options.rdf version of this ontology was revised to add an expiration date as an important property of an option."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/DER/20211201/DerivativesContracts/Options.rdf version of this ontology was revised to make certain values subclasses of MonetaryAmount instead of MonetaryMeasure."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, and to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/DER/20220101/DerivativesContracts/Options.rdf version of this ontology was revised to add an explanatory note to basket option and make it a kind of exotic option and added interest rate derivative as the parent of interest rate option; added capped option as a kind of vanilla option."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/DER/20210901/DerivativesContracts/Options.rdf version of this ontology was revised to correct a restriction on an option with respect to an optional option premium which was not well-formed, and modified the definition of interest rate option to reflect a benchmark, and to be a specialization of vanilla option."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/DER/20220701/DerivativesContracts/Options.rdf version of this ontology was revised to add the most common options trading strategies."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."]})

(def AtTheMoney
  "moneyness classifier that refers to an option whose value in terms of its strike price is the same or close to the current market price of the underlying security"
  {:cmns-av/abbreviation #voc/lstr "ATM@en",
   :cmns-av/explanatoryNote
   #voc/lstr
    "An ATM option has a delta of ±0.50, positive if it is a call, negative for a put.@en",
   :db/ident :fibo-der-drc-opt/AtTheMoney,
   :rdf/type [:fibo-der-drc-opt/Moneyness
              :owl/NamedIndividual
              {:owl/onProperty     :cmns-cls/classifies,
               :owl/someValuesFrom :fibo-fbc-fi-fi/Option,
               :rdf/type           :owl/Restriction}
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "at-the-money@en",
   :skos/definition
   #voc/lstr
    "moneyness classifier that refers to an option whose value in terms of its strike price is the same or close to the current market price of the underlying security@en"})

(def BasketOption
  "option whose underlying asset is a group, or basket, of commodities, securities, indices, or currencies"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "As with other options, a basket option gives the holder the right, but not the obligation, to buy or sell the basket at a specific price, on or before a certain date. This exotic option has all the characteristics of a standard option, but with the basis of the strike price on the weighted value of its components. Currency baskets are the most popular type of basket option, and they will settle in the holder's home currency. Because it involves just one transaction, a basket option often costs less than multiple single options as it saves on commissions and fees.@en",
   :db/ident :fibo-der-drc-opt/BasketOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "basket option@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-agr-ctr/hasContractDuration,
     :owl/someValuesFrom :cmns-dt/ExplicitDuration,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fi-ip/hasPriceDeterminationMethod,
     :owl/someValuesFrom :fibo-fbc-fi-ip/PriceDeterminationMethod,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
     :owl/someValuesFrom :fibo-sec-sec-bsk/MixedBasket,
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-opt/ExoticOption
    :fibo-der-drc-opt/BasketOption
    {:owl/onProperty     :fibo-fbc-fi-ip/hasLotSize,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-bsc/OverTheCounterInstrument
    {:owl/onProperty     :fibo-fnd-arr-doc/hasExpirationDate,
     :owl/someValuesFrom :cmns-dt/Date,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasExerciseSchedule,
     :owl/someValuesFrom :fibo-fnd-dt-fd/Schedule,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-der-drc-opt/OptionHolder,
     :owl/onProperty :fibo-der-drc-opt/hasOptionHolder,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasOptionWriter,
     :owl/someValuesFrom :fibo-der-drc-opt/OptionIssuer,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/Option
    {:owl/onProperty     :fibo-der-drc-opt/hasExerciseStyle,
     :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseConvention,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-der-drc-opt/OptionPremium,
     :owl/onProperty :fibo-der-drc-opt/hasCalculatedMarketValue,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasExercisePrice,
     :owl/someValuesFrom :fibo-der-drc-opt/StrikePrice,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "option whose underlying asset is a group, or basket, of commodities, securities, indices, or currencies@en"})

(def BondOption
  "option giving the buyer (holder) the right, but not the obligation, to buy or sell (depending on whether it is a call or a put) a bond at a certain price on or before a specified date"
  {:db/ident :fibo-der-drc-opt/BondOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "bond option@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
     :owl/someValuesFrom :fibo-sec-dbt-bnd/Bond,
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-opt/FixedIncomeOption
    :fibo-der-drc-opt/BondOption
    {:owl/onProperty     :fibo-fbc-fi-ip/hasLotSize,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-arr-doc/hasExpirationDate,
     :owl/someValuesFrom :cmns-dt/Date,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasExerciseSchedule,
     :owl/someValuesFrom :fibo-fnd-dt-fd/Schedule,
     :rdf/type           :owl/Restriction}
    :fibo-der-sbd-sbd/DebtInstrumentDerivative
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-der-drc-opt/OptionHolder,
     :owl/onProperty :fibo-der-drc-opt/hasOptionHolder,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-agr-ctr/hasContractDuration,
     :owl/someValuesFrom :cmns-dt/ExplicitDuration,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fi-ip/hasPriceDeterminationMethod,
     :owl/someValuesFrom :fibo-fbc-fi-ip/PriceDeterminationMethod,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasOptionWriter,
     :owl/someValuesFrom :fibo-der-drc-opt/OptionIssuer,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/Option
    {:owl/onProperty     :fibo-der-drc-opt/hasExerciseStyle,
     :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseConvention,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-der-drc-opt/OptionPremium,
     :owl/onProperty :fibo-der-drc-opt/hasCalculatedMarketValue,
     :rdf/type       :owl/Restriction}
    :fibo-der-drc-opt/VanillaOption
    {:owl/onProperty     :fibo-der-drc-opt/hasExercisePrice,
     :owl/someValuesFrom :fibo-der-drc-opt/StrikePrice,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "option giving the buyer (holder) the right, but not the obligation, to buy or sell (depending on whether it is a call or a put) a bond at a certain price on or before a specified date@en"})

(def Butterfly
  "strategy that combines bull and bear spreads with a fixed risk and capped profit"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "These spreads are intended as a market-neutral strategy and pay off the most if the underlying asset does not move prior to option expiration. They involve either four calls, four puts, or a combination of puts and calls with three strike prices. Butterfly spreads pay off the most if the underlying asset price doesn't change before the option expires. The upper and lower strike prices are equal distance from the middle, or at-the-money, strike price.@en",
   :db/ident :fibo-der-drc-opt/Butterfly,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "butterfly@en",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fbc-fi-fi/Option,
                      :owl/onProperty :cmns-col/comprises,
                      :owl/qualifiedCardinality 4,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-opt/StrikePrice,
                      :owl/onProperty :fibo-der-drc-opt/hasExercisePrice,
                      :owl/qualifiedCardinality 3,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-opt/OptionTradingStrategy
                     :fibo-der-drc-opt/Butterfly
                     {:owl/onProperty     :cmns-col/comprises,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Option,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-pas-fpas/TradingStrategy],
   :skos/definition
   #voc/lstr
    "strategy that combines bull and bear spreads with a fixed risk and capped profit@en"})

(def CallOption
  "option giving the buyer (holder) the right, but not the obligation, to buy the assets specified at a fixed price or formula, on or before a specified date"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019.@en",
   :cmns-av/explanatoryNote
   #voc/lstr
    "The seller (issuer) of the call option assumes the obligation of delivering the assets specified should the buyer exercise the option.@en",
   :db/ident :fibo-der-drc-opt/CallOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "call option@en",
   :rdfs/subClassOf [:fibo-fbc-fi-fi/Option
                     :fibo-der-drc-opt/CallOption
                     {:owl/onProperty     :fibo-fbc-fi-ip/hasLotSize,
                      :owl/someValuesFrom :xsd/decimal,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-arr-doc/hasExpirationDate,
                      :owl/someValuesFrom :cmns-dt/Date,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-opt/hasExerciseSchedule,
                      :owl/someValuesFrom :fibo-fnd-dt-fd/Schedule,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-der-drc-opt/OptionHolder,
                      :owl/onProperty :fibo-der-drc-opt/hasOptionHolder,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-opt/hasOptionWriter,
                      :owl/someValuesFrom :fibo-der-drc-opt/OptionIssuer,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-opt/hasExerciseStyle,
                      :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseConvention,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass :fibo-der-drc-opt/OptionPremium,
                      :owl/onProperty
                      :fibo-der-drc-opt/hasCalculatedMarketValue,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-opt/hasExercisePrice,
                      :owl/someValuesFrom :fibo-der-drc-opt/StrikePrice,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "option giving the buyer (holder) the right, but not the obligation, to buy the assets specified at a fixed price or formula, on or before a specified date@en"})

(def CappedOption
  "option with an established profit cap or cap price"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "The cap price is equal to the option's strike price plus a cap interval for a call option or the strike price minus a cap interval for a put option. A capped option is automatically exercised when the underlying security closes at or above (for a call) or at or below (for a put) the option's cap price.@en",
   :db/ident :fibo-der-drc-opt/CappedOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "capped option@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-der-drc-opt/hasCapPrice,
     :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryPrice,
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-opt/VanillaOption
    :fibo-der-drc-opt/CappedOption
    {:owl/onProperty     :fibo-fbc-fi-ip/hasLotSize,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-arr-doc/hasExpirationDate,
     :owl/someValuesFrom :cmns-dt/Date,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasExerciseSchedule,
     :owl/someValuesFrom :fibo-fnd-dt-fd/Schedule,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-der-drc-opt/OptionHolder,
     :owl/onProperty :fibo-der-drc-opt/hasOptionHolder,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-agr-ctr/hasContractDuration,
     :owl/someValuesFrom :cmns-dt/ExplicitDuration,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fi-ip/hasPriceDeterminationMethod,
     :owl/someValuesFrom :fibo-fbc-fi-ip/PriceDeterminationMethod,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasOptionWriter,
     :owl/someValuesFrom :fibo-der-drc-opt/OptionIssuer,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/Option
    {:owl/onProperty     :fibo-der-drc-opt/hasExerciseStyle,
     :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseConvention,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-der-drc-opt/OptionPremium,
     :owl/onProperty :fibo-der-drc-opt/hasCalculatedMarketValue,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasExercisePrice,
     :owl/someValuesFrom :fibo-der-drc-opt/StrikePrice,
     :rdf/type           :owl/Restriction}],
   :skos/definition #voc/lstr
                     "option with an established profit cap or cap price@en"})

(def Collar
  "option trading strategy that involves buying a downside put and selling an upside call that is implemented to protect against large losses, but which also limits large upside gains"
  {:db/ident :fibo-der-drc-opt/Collar,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "collar@en",
   :rdfs/subClassOf [{:owl/onClass    :fibo-der-drc-opt/PutOption,
                      :owl/onProperty :cmns-col/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-opt/CallOption,
                      :owl/onProperty :cmns-col/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-opt/OptionTradingStrategy
                     :fibo-der-drc-opt/Collar
                     {:owl/onProperty     :cmns-col/comprises,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Option,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-pas-fpas/TradingStrategy],
   :skos/definition
   #voc/lstr
    "option trading strategy that involves buying a downside put and selling an upside call that is implemented to protect against large losses, but which also limits large upside gains@en"})

(def CondorSpread
  "non-directional options strategy that limits both gains and losses while seeking to profit from either low or high volatility"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "There are two types of condor spreads. A long condor seeks to profit from low volatility and little to no movement in the underlying asset. A short condor seeks to profit from high volatility and a sizable move in the underlying asset in either direction. A Condor Spread uses either all calls or all puts.@en",
   :db/ident :fibo-der-drc-opt/CondorSpread,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "condor spread@en",
   :rdfs/subClassOf [:fibo-der-drc-opt/OptionTradingStrategy
                     :fibo-der-drc-opt/CondorSpread
                     {:owl/onProperty     :cmns-col/comprises,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Option,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-pas-fpas/TradingStrategy],
   :skos/definition
   #voc/lstr
    "non-directional options strategy that limits both gains and losses while seeking to profit from either low or high volatility@en"})

(def CoveredCall
  "call option in which the seller (investor) owns an equivalent amount of the underlying security"
  {:db/ident :fibo-der-drc-opt/CoveredCall,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "covered call@en",
   :rdfs/subClassOf [:fibo-der-drc-opt/CallOption
                     :fibo-der-drc-opt/CoveredCall
                     {:owl/onProperty     :fibo-fbc-fi-ip/hasLotSize,
                      :owl/someValuesFrom :xsd/decimal,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-arr-doc/hasExpirationDate,
                      :owl/someValuesFrom :cmns-dt/Date,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/Option
                     {:owl/onProperty     :fibo-der-drc-opt/hasExerciseSchedule,
                      :owl/someValuesFrom :fibo-fnd-dt-fd/Schedule,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-der-drc-opt/OptionHolder,
                      :owl/onProperty :fibo-der-drc-opt/hasOptionHolder,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-opt/hasOptionWriter,
                      :owl/someValuesFrom :fibo-der-drc-opt/OptionIssuer,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-opt/hasExerciseStyle,
                      :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseConvention,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass :fibo-der-drc-opt/OptionPremium,
                      :owl/onProperty
                      :fibo-der-drc-opt/hasCalculatedMarketValue,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-opt/hasExercisePrice,
                      :owl/someValuesFrom :fibo-der-drc-opt/StrikePrice,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "call option in which the seller (investor) owns an equivalent amount of the underlying security@en"})

(def EquityOption
  "option giving the buyer (holder) the right, but not the obligation, to buy (via a call option) or sell (via a put option) the underlying equity assets specified at a pre-determined price (i.e., the strike price, fixed or calculated), on or before a specified date (the expiration date)"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019.@en",
   :cmns-av/explanatoryNote
   #voc/lstr
    "For an Equity Option, one contract represents 100 shares of stock. Equity options settle in 'American style'.@en",
   :db/ident :fibo-der-drc-opt/EquityOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "equity option@en",
   :rdfs/subClassOf
   [{:owl/hasValue   :fibo-sec-dbt-ex/AmericanExerciseConvention,
     :owl/onProperty :fibo-der-drc-opt/hasExerciseStyle,
     :rdf/type       :owl/Restriction}
    :fibo-der-sbd-sbd/EquityDerivative
    :fibo-der-drc-opt/VanillaOption
    :fibo-der-drc-opt/EquityOption
    {:owl/onProperty     :fibo-fbc-fi-ip/hasLotSize,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-arr-doc/hasExpirationDate,
     :owl/someValuesFrom :cmns-dt/Date,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasExerciseSchedule,
     :owl/someValuesFrom :fibo-fnd-dt-fd/Schedule,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-der-drc-opt/OptionHolder,
     :owl/onProperty :fibo-der-drc-opt/hasOptionHolder,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-agr-ctr/hasContractDuration,
     :owl/someValuesFrom :cmns-dt/ExplicitDuration,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fi-ip/hasPriceDeterminationMethod,
     :owl/someValuesFrom :fibo-fbc-fi-ip/PriceDeterminationMethod,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasOptionWriter,
     :owl/someValuesFrom :fibo-der-drc-opt/OptionIssuer,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/Option
    {:owl/onProperty     :fibo-der-drc-opt/hasExerciseStyle,
     :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseConvention,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-der-drc-opt/OptionPremium,
     :owl/onProperty :fibo-der-drc-opt/hasCalculatedMarketValue,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasExercisePrice,
     :owl/someValuesFrom :fibo-der-drc-opt/StrikePrice,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "option giving the buyer (holder) the right, but not the obligation, to buy (via a call option) or sell (via a put option) the underlying equity assets specified at a pre-determined price (i.e., the strike price, fixed or calculated), on or before a specified date (the expiration date)@en"})

(def ExoticOption
  "option that has a non-standard payout structure or other feature"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "Commodity Futures Trading Commission (CFTC) glossary, https://www.cftc.gov/LearnAndProtect/EducationCenter/CFTCGlossary/glossary_e.html@en",
   :cmns-av/explanatoryNote
   #voc/lstr
    "Exotic options include Asian options and lookback options, and are mostly traded in the over-the-counter market.@en",
   :db/ident :fibo-der-drc-opt/ExoticOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "exotic option@en",
   :rdfs/subClassOf [:fibo-fbc-fi-fi/Option
                     :fibo-der-drc-bsc/OverTheCounterInstrument
                     :fibo-der-drc-opt/ExoticOption
                     {:owl/onProperty     :fibo-fbc-fi-ip/hasLotSize,
                      :owl/someValuesFrom :xsd/decimal,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-arr-doc/hasExpirationDate,
                      :owl/someValuesFrom :cmns-dt/Date,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-opt/hasExerciseSchedule,
                      :owl/someValuesFrom :fibo-fnd-dt-fd/Schedule,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-der-drc-opt/OptionHolder,
                      :owl/onProperty :fibo-der-drc-opt/hasOptionHolder,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-opt/hasOptionWriter,
                      :owl/someValuesFrom :fibo-der-drc-opt/OptionIssuer,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-opt/hasExerciseStyle,
                      :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseConvention,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass :fibo-der-drc-opt/OptionPremium,
                      :owl/onProperty
                      :fibo-der-drc-opt/hasCalculatedMarketValue,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-opt/hasExercisePrice,
                      :owl/someValuesFrom :fibo-der-drc-opt/StrikePrice,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "option that has a non-standard payout structure or other feature@en"})

(def ExtrinsicValue
  "measure of the difference between the market price of an option, called the premium, and its intrinsic value"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Extrinsic value is also the portion of the worth that has been assigned to an option by factors other than the underlying asset's price. The opposite of extrinsic value is intrinsic value, which is the inherent worth of an option.@en",
   :cmns-av/synonym #voc/lstr "option time value@en",
   :db/ident :fibo-der-drc-opt/ExtrinsicValue,
   :owl/disjointWith :fibo-der-drc-opt/IntrinsicValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "extrinsic value@en",
   :rdfs/subClassOf [:fibo-fnd-acc-cur/MonetaryAmount
                     :fibo-der-drc-opt/ExtrinsicValue],
   :skos/definition
   #voc/lstr
    "measure of the difference between the market price of an option, called the premium, and its intrinsic value@en"})

(def Fence
  "option trading strategy that uses options to limit the range of possible returns on a financial instrument"
  {:cmns-av/explanatoryNote
   [#voc/lstr
     "The expiration dates of all the options are usually the same. The call strike is normally chosen in such a way that the sum total of the three option premiums is equal to zero. This investment strategy will ensure that the value of the investment at expiry will be between the strike price on the short call and the strike price on the long put. Thus, possible gains and losses (the value of the financial instrument minus the cost of acquiring it) are confined to a specified range. However, if the price of the financial instrument falls below the strike level of the sold put the investor will start participating in any further price declines of the financial instrument.@en"
    #voc/lstr
     "A fence consists of the following elements:\n- long position in a financial instrument (e.g., a share, index or currency)\n- long put (normally with a strike price close to or at the current spot price of the financial instrument)\n- short put (with a strike price lower than the bought put - e.g., 80% of the current spot price)\n- short call (with a strike price higher than the current spot price).@en"],
   :db/ident :fibo-der-drc-opt/Fence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "fence@en",
   :rdfs/subClassOf [{:owl/onClass    :fibo-der-drc-opt/PutOption,
                      :owl/onProperty :cmns-col/comprises,
                      :owl/qualifiedCardinality 2,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-opt/CallOption,
                      :owl/onProperty :cmns-col/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-opt/OptionTradingStrategy
                     :fibo-der-drc-opt/Fence
                     {:owl/onProperty     :cmns-col/comprises,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Option,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-pas-fpas/TradingStrategy],
   :skos/definition
   #voc/lstr
    "option trading strategy that uses options to limit the range of possible returns on a financial instrument@en"})

(def FixedIncomeOption
  "option giving the buyer (holder) the right, but not the obligation, to buy (via a call option) or sell (via a put option) the underlying fixed income assets specified at a pre-determined price (i.e., the strike price, fixed or calculated), on or before a specified date (the expiration date)"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019.@en",
   :cmns-av/explanatoryNote
   #voc/lstr
    "Fixed income options, or debt options, are derivatives contracts that use bonds or other fixed-income securities as their underlying asset.@en",
   :db/ident :fibo-der-drc-opt/FixedIncomeOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "fixed income option@en",
   :rdfs/subClassOf
   [:fibo-der-sbd-sbd/DebtInstrumentDerivative
    :fibo-der-drc-opt/VanillaOption
    :fibo-der-drc-opt/FixedIncomeOption
    {:owl/onProperty     :fibo-fbc-fi-ip/hasLotSize,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-arr-doc/hasExpirationDate,
     :owl/someValuesFrom :cmns-dt/Date,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasExerciseSchedule,
     :owl/someValuesFrom :fibo-fnd-dt-fd/Schedule,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-der-drc-opt/OptionHolder,
     :owl/onProperty :fibo-der-drc-opt/hasOptionHolder,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-agr-ctr/hasContractDuration,
     :owl/someValuesFrom :cmns-dt/ExplicitDuration,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fi-ip/hasPriceDeterminationMethod,
     :owl/someValuesFrom :fibo-fbc-fi-ip/PriceDeterminationMethod,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasOptionWriter,
     :owl/someValuesFrom :fibo-der-drc-opt/OptionIssuer,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/Option
    {:owl/onProperty     :fibo-der-drc-opt/hasExerciseStyle,
     :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseConvention,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-der-drc-opt/OptionPremium,
     :owl/onProperty :fibo-der-drc-opt/hasCalculatedMarketValue,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasExercisePrice,
     :owl/someValuesFrom :fibo-der-drc-opt/StrikePrice,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "option giving the buyer (holder) the right, but not the obligation, to buy (via a call option) or sell (via a put option) the underlying fixed income assets specified at a pre-determined price (i.e., the strike price, fixed or calculated), on or before a specified date (the expiration date)@en"})

(def InTheMoney
  "moneyness classifier that refers to an option that has value in a strike price that is favorable in comparison to the prevailing market price of the underlying asset"
  {:cmns-av/abbreviation #voc/lstr "ITM@en",
   :cmns-av/explanatoryNote
   #voc/lstr
    "An in-the-money call option means the option holder has the opportunity to buy the security below its current market price. An in-the-money put option means the option holder can sell the security above its current market price.@en",
   :db/ident :fibo-der-drc-opt/InTheMoney,
   :rdf/type [:fibo-der-drc-opt/Moneyness
              :owl/NamedIndividual
              {:owl/onProperty     :cmns-cls/classifies,
               :owl/someValuesFrom :fibo-fbc-fi-fi/Option,
               :rdf/type           :owl/Restriction}
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "in-the-money@en",
   :skos/definition
   #voc/lstr
    "moneyness classifier that refers to an option that has value in a strike price that is favorable in comparison to the prevailing market price of the underlying asset@en"})

(def InterestRateOption
  "option that giving the buyer (holder) the right, but not the obligation, to receive a cash payment if market interest rate of a reference rate is higher or lower, depending on the option, than the strike rate of the option"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "The amount of the payment will be based on the difference between the market rate on the exercise date and the strike rate, multiplied by the notional principal specified in the option contract, to calculate the total payment.@en",
   :db/ident :fibo-der-drc-opt/InterestRateOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "interest rate option@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
     :owl/someValuesFrom :fibo-ind-ir-ir/InterestRateBenchmark,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasStrikeRate,
     :owl/someValuesFrom :fibo-fnd-acc-cur/InterestRate,
     :rdf/type           :owl/Restriction}
    :fibo-der-rtd-rtd/InterestRateDerivativeInstrument
    :fibo-der-drc-opt/VanillaOption
    :fibo-der-drc-opt/InterestRateOption
    {:owl/onProperty     :fibo-fbc-fi-ip/hasLotSize,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-arr-doc/hasExpirationDate,
     :owl/someValuesFrom :cmns-dt/Date,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasExerciseSchedule,
     :owl/someValuesFrom :fibo-fnd-dt-fd/Schedule,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-der-drc-opt/OptionHolder,
     :owl/onProperty :fibo-der-drc-opt/hasOptionHolder,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-agr-ctr/hasContractDuration,
     :owl/someValuesFrom :cmns-dt/ExplicitDuration,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fi-ip/hasPriceDeterminationMethod,
     :owl/someValuesFrom :fibo-fbc-fi-ip/PriceDeterminationMethod,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasOptionWriter,
     :owl/someValuesFrom :fibo-der-drc-opt/OptionIssuer,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/Option
    {:owl/onProperty     :fibo-der-drc-opt/hasExerciseStyle,
     :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseConvention,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-der-drc-opt/OptionPremium,
     :owl/onProperty :fibo-der-drc-opt/hasCalculatedMarketValue,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasExercisePrice,
     :owl/someValuesFrom :fibo-der-drc-opt/StrikePrice,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "option that giving the buyer (holder) the right, but not the obligation, to receive a cash payment if market interest rate of a reference rate is higher or lower, depending on the option, than the strike rate of the option@en"})

(def IntrinsicValue
  "measure of what an asset is worth, i.e. with respect to its current price"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "This measure is arrived at by means of an objective calculation or complex financial model. In financial analysis this term is used in conjunction with the work of identifying, as nearly as possible, the underlying value of a company and its cash flow. In options pricing it refers to the difference between the strike price of the option and the current price of the underlying asset.@en",
   :db/ident :fibo-der-drc-opt/IntrinsicValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "intrinsic value@en",
   :rdfs/subClassOf [:fibo-fnd-acc-cur/MonetaryAmount
                     :fibo-der-drc-opt/IntrinsicValue],
   :skos/definition
   #voc/lstr
    "measure of what an asset is worth, i.e. with respect to its current price@en"})

(def IronButterfly
  "butterfly strategy that consists of two call options and two put options, three strike prices and the same expiration date"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "The key to using this trade as part of a successful trading strategy is to forecast a time when option prices are likely to decline in value generally. This usually occurs during periods of sideways movement or a mild upward trend.@en",
   :cmns-av/synonym #voc/lstr "iron fly@en",
   :db/ident :fibo-der-drc-opt/IronButterfly,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "iron butterfly@en",
   :rdfs/subClassOf [{:owl/onClass    :fibo-der-drc-opt/PutOption,
                      :owl/onProperty :cmns-col/comprises,
                      :owl/qualifiedCardinality 2,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-opt/CallOption,
                      :owl/onProperty :cmns-col/comprises,
                      :owl/qualifiedCardinality 2,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-opt/Butterfly
                     :fibo-der-drc-opt/IronButterfly
                     {:owl/onProperty     :cmns-col/comprises,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Option,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-opt/StrikePrice,
                      :owl/onProperty :fibo-der-drc-opt/hasExercisePrice,
                      :owl/qualifiedCardinality 3,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-pas-fpas/TradingStrategy
                     {:owl/onClass    :fibo-fbc-fi-fi/Option,
                      :owl/onProperty :cmns-col/comprises,
                      :owl/qualifiedCardinality 4,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-opt/OptionTradingStrategy],
   :skos/definition
   #voc/lstr
    "butterfly strategy that consists of two call options and two put options, three strike prices and the same expiration date@en"})

(def IronCondor
  "condor strategy consisting of two puts (one long and one short) and two calls (one long and one short), and four strike prices, all with the same expiration date"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "The iron condor earns the maximum profit when the underlying asset closes between the middle strike prices at expiration. In other words, the goal is to profit from low volatility in the underlying asset.@en",
   :db/ident :fibo-der-drc-opt/IronCondor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "iron condor@en",
   :rdfs/subClassOf [{:owl/onClass    :fibo-der-drc-opt/StrikePrice,
                      :owl/onProperty :fibo-der-drc-opt/hasExercisePrice,
                      :owl/qualifiedCardinality 4,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-opt/PutOption,
                      :owl/onProperty :cmns-col/comprises,
                      :owl/qualifiedCardinality 2,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-opt/CallOption,
                      :owl/onProperty :cmns-col/comprises,
                      :owl/qualifiedCardinality 2,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-opt/CondorSpread
                     :fibo-der-drc-opt/IronCondor
                     {:owl/onProperty     :cmns-col/comprises,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Option,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-pas-fpas/TradingStrategy
                     :fibo-der-drc-opt/OptionTradingStrategy],
   :skos/definition
   #voc/lstr
    "condor strategy consisting of two puts (one long and one short) and two calls (one long and one short), and four strike prices, all with the same expiration date@en"})

(def LongTermEquityAnticipationSecurity
  "equity option that allows the holder to buy or sell shares of stock with expiration dates that are longer than one year, and typically up to three years from issue"
  {:cmns-av/abbreviation #voc/lstr "LEAP@en",
   :cmns-av/explanatoryNote
   #voc/lstr
    "By providing opportunities to control and manage risk or even to speculate, LEAPS are virtually identical to regular options. Expiration dates on LEAPs can range from nine months to three years, which is longer than the holding period for a traditional call or put option. Although they are not available on all stocks, LEAPS are available on most widely held issues.@en",
   :db/ident :fibo-der-drc-opt/LongTermEquityAnticipationSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "long-term equity anticipation security@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-agr-ctr/hasContractDuration,
     :owl/someValuesFrom :cmns-dt/Duration,
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-opt/EquityOption
    :fibo-der-drc-opt/LongTermEquityAnticipationSecurity
    {:owl/onProperty     :fibo-fbc-fi-ip/hasLotSize,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-arr-doc/hasExpirationDate,
     :owl/someValuesFrom :cmns-dt/Date,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasExerciseSchedule,
     :owl/someValuesFrom :fibo-fnd-dt-fd/Schedule,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-der-drc-opt/OptionHolder,
     :owl/onProperty :fibo-der-drc-opt/hasOptionHolder,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-agr-ctr/hasContractDuration,
     :owl/someValuesFrom :cmns-dt/ExplicitDuration,
     :rdf/type           :owl/Restriction}
    :fibo-der-sbd-sbd/EquityDerivative
    {:owl/onProperty     :fibo-fbc-fi-ip/hasPriceDeterminationMethod,
     :owl/someValuesFrom :fibo-fbc-fi-ip/PriceDeterminationMethod,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasOptionWriter,
     :owl/someValuesFrom :fibo-der-drc-opt/OptionIssuer,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/Option
    {:owl/onProperty     :fibo-der-drc-opt/hasExerciseStyle,
     :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseConvention,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-der-drc-opt/OptionPremium,
     :owl/onProperty :fibo-der-drc-opt/hasCalculatedMarketValue,
     :rdf/type       :owl/Restriction}
    :fibo-der-drc-opt/VanillaOption
    {:owl/hasValue   :fibo-sec-dbt-ex/AmericanExerciseConvention,
     :owl/onProperty :fibo-der-drc-opt/hasExerciseStyle,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasExercisePrice,
     :owl/someValuesFrom :fibo-der-drc-opt/StrikePrice,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "equity option that allows the holder to buy or sell shares of stock with expiration dates that are longer than one year, and typically up to three years from issue@en"})

(def Moneyness
  "classifier for a derivative relating its strike price to the price of its underlying asset"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Moneyness describes the intrinsic value of an option in its current state. The term moneyness is most commonly used with put and call options and is an indicator as to the comparative value of the option with respect to its exercise/strike price. Moneyness can be measured with respect to the underlying stock or other asset's current/spot price or its future price.@en",
   :db/ident :fibo-der-drc-opt/Moneyness,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "moneyness@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Option,
                      :rdf/type           :owl/Restriction}
                     :cmns-cls/Classifier
                     :fibo-der-drc-opt/Moneyness],
   :skos/definition
   #voc/lstr
    "classifier for a derivative relating its strike price to the price of its underlying asset@en"})

(def OptionHolder
  "party that owns an option"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "In a call, the option holder has the right, but not the obligation, to buy the underlying asset, while, in a put, the option holder has the right to sell the underlying asset. An option holder may sell the option contract itself, at which point the buyer becomes the option holder. Once the instrument is exercised there are typically additional, relevant obligations with regard to settlement.@en",
   :db/ident :fibo-der-drc-opt/OptionHolder,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "option holder@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/holds,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Option,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-oac-own/Owner
                     :fibo-der-drc-opt/OptionHolder],
   :skos/definition #voc/lstr "party that owns an option@en"})

(def OptionIssuer
  "issuer granting the rights defined in the option in exchange for some consideration"
  {:db/ident :fibo-der-drc-opt/OptionIssuer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "option issuer@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-pty-pty/isAPartyTo,
                          :owl/someValuesFrom :fibo-fbc-fi-fi/Option,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/Issuer
    :fibo-der-drc-opt/OptionIssuer],
   :skos/definition
   #voc/lstr
    "issuer granting the rights defined in the option in exchange for some consideration@en"})

(def OptionOnFuture
  "option that gives the holder the right, but not the obligation, to buy or sell a specific futures contract at a specified price on or before the option's expiration date"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019.@en",
   :db/ident :fibo-der-drc-opt/OptionOnFuture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "option on future@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-sec-dbt-ex/hasExerciseTerms,
     :owl/someValuesFrom :fibo-sec-dbt-ex/AmericanExerciseTerms,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
     :owl/someValuesFrom :fibo-fbc-fi-fi/Future,
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-opt/VanillaOption
    :fibo-der-drc-opt/OptionOnFuture
    {:owl/onProperty     :fibo-fbc-fi-ip/hasLotSize,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-arr-doc/hasExpirationDate,
     :owl/someValuesFrom :cmns-dt/Date,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasExerciseSchedule,
     :owl/someValuesFrom :fibo-fnd-dt-fd/Schedule,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-der-drc-opt/OptionHolder,
     :owl/onProperty :fibo-der-drc-opt/hasOptionHolder,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-agr-ctr/hasContractDuration,
     :owl/someValuesFrom :cmns-dt/ExplicitDuration,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fi-ip/hasPriceDeterminationMethod,
     :owl/someValuesFrom :fibo-fbc-fi-ip/PriceDeterminationMethod,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasOptionWriter,
     :owl/someValuesFrom :fibo-der-drc-opt/OptionIssuer,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/Option
    {:owl/onProperty     :fibo-der-drc-opt/hasExerciseStyle,
     :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseConvention,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-der-drc-opt/OptionPremium,
     :owl/onProperty :fibo-der-drc-opt/hasCalculatedMarketValue,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasExercisePrice,
     :owl/someValuesFrom :fibo-der-drc-opt/StrikePrice,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "option that gives the holder the right, but not the obligation, to buy or sell a specific futures contract at a specified price on or before the option's expiration date@en"})

(def OptionPremium
  "current market price of an option contract"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "The option premium is the income received by the seller (writer) of an option contract to another party. In-the-money option premiums are composed of two factors: intrinsic and extrinsic value. Out-of-the-money options' premiums consist solely of extrinsic value. For stock options, the premium is quoted as a dollar amount per share, and most contracts represent the commitment of 100 shares.@en",
   :db/ident :fibo-der-drc-opt/OptionPremium,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "option premium@en",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass :fibo-fnd-acc-cur/PercentageMonetaryAmount,
                      :owl/onProperty :fibo-fnd-qt-qtu/hasQuantityValue,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fnd-acc-cur/hasMonetaryAmount,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-der-drc-opt/OptionPremiumFormula,
                      :owl/onProperty :fibo-fnd-utl-alx/hasExpression,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fi-ip/MarketPrice
                     :fibo-der-drc-opt/OptionPremium],
   :skos/definition #voc/lstr "current market price of an option contract@en"})

(def OptionPremiumFormula
  "expression used to calculate the premium based either on the price per option or percentage of the notional amount"
  {:db/ident :fibo-der-drc-opt/OptionPremiumFormula,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "option premium formula@en",
   :rdfs/subClassOf [:fibo-fnd-utl-alx/Expression
                     :fibo-der-drc-opt/OptionPremiumFormula],
   :skos/definition
   #voc/lstr
    "expression used to calculate the premium based either on the price per option or percentage of the notional amount@en"})

(def OptionTradingStrategy
  "trading tactic involving more than one option type, strike price, or expiration date on the same underlying asset"
  {:cmns-av/explanatoryNote
   [#voc/lstr
     "Option trading strategies refer to buying calls or put options or selling calls or put options or both together for the purpose of limiting losses and/or optimizing profits. Basically, these strategies utilize one or more combinations for the best outcome possible based on defined parameters. Simple combinations include option spread trades such as vertical spreads, calendar (or horizontal) spreads, and diagonal spreads. More involved combinations include trades such as condor or butterfly spreads which are actually combinations of two vertical spreads.@en"
    #voc/lstr
     "Note that some trading strategies may be considered financial instruments in their own right, but most strategies are not. The critical differentiators include whether the strategy itself can be traded, whether it has a financial instrument identifier independently from the identifier(s) of the embedded instrument(s), such as a FIGI or ISIN, and so forth.@en"],
   :db/ident :fibo-der-drc-opt/OptionTradingStrategy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "option trading strategy@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/comprises,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Option,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-pas-fpas/TradingStrategy
                     :fibo-der-drc-opt/OptionTradingStrategy],
   :skos/definition
   #voc/lstr
    "trading tactic involving more than one option type, strike price, or expiration date on the same underlying asset@en"})

(def OutOfTheMoney
  "moneyness classifier that refers to an option whose value in terms of its strike price is not favorable in comparison to the prevailing market price of the underlying asset"
  {:cmns-av/abbreviation #voc/lstr "OTM@en",
   :cmns-av/explanatoryNote
   #voc/lstr
    "An OTM call option will have a strike price that is higher than the market price of the underlying asset. Alternatively, an OTM put option has a strike price that is lower than the market price of the underlying asset.@en",
   :db/ident :fibo-der-drc-opt/OutOfTheMoney,
   :rdf/type [:fibo-der-drc-opt/Moneyness
              :owl/NamedIndividual
              {:owl/onProperty     :cmns-cls/classifies,
               :owl/someValuesFrom :fibo-fbc-fi-fi/Option,
               :rdf/type           :owl/Restriction}
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "out-of-the-money@en",
   :skos/definition
   #voc/lstr
    "moneyness classifier that refers to an option whose value in terms of its strike price is not favorable in comparison to the prevailing market price of the underlying asset@en"})

(def ProtectiveCollar
  "collar that consists of a covered call and protective put"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "A protective collar consists of a long position in the underlying security, a put option purchased to hedge the downside risk on a stock, a call option written on the stock to finance the put purchase.@en",
   :db/ident :fibo-der-drc-opt/ProtectiveCollar,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "protective collar@en",
   :rdfs/subClassOf [{:owl/onClass    :fibo-der-drc-opt/ProtectivePut,
                      :owl/onProperty :cmns-col/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-opt/CoveredCall,
                      :owl/onProperty :cmns-col/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-opt/Collar
                     :fibo-der-drc-opt/ProtectiveCollar
                     {:owl/onClass    :fibo-der-drc-opt/PutOption,
                      :owl/onProperty :cmns-col/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :cmns-col/comprises,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Option,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-pas-fpas/TradingStrategy
                     {:owl/onClass    :fibo-der-drc-opt/CallOption,
                      :owl/onProperty :cmns-col/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-opt/OptionTradingStrategy],
   :skos/definition
   #voc/lstr "collar that consists of a covered call and protective put@en"})

(def ProtectivePut
  "put option giving the buyer (holder) the right, but not the obligation, to sell the assets specified at with a strike price equal or close to the current price of the underlying asset, on or before a specified date"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "A protective put is a risk management and options strategy that involves holding a long position in the underlying asset (e.g., stock). A protective put strategy is analogous to the nature of insurance. The main goal of a protective put is to limit potential losses that may result from an unexpected price drop of the underlying asset@en",
   :cmns-av/synonym #voc/lstr "synthetic call@en",
   :db/ident :fibo-der-drc-opt/ProtectivePut,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "protective put@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-der-drc-opt/hasCalculatedMarketValue,
     :owl/someValuesFrom :fibo-der-drc-opt/OptionPremium,
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-opt/PutOption
    :fibo-der-drc-opt/ProtectivePut
    {:owl/onProperty     :fibo-fbc-fi-ip/hasLotSize,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-arr-doc/hasExpirationDate,
     :owl/someValuesFrom :cmns-dt/Date,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/Option
    {:owl/onProperty     :fibo-der-drc-opt/hasExerciseSchedule,
     :owl/someValuesFrom :fibo-fnd-dt-fd/Schedule,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-der-drc-opt/OptionHolder,
     :owl/onProperty :fibo-der-drc-opt/hasOptionHolder,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasOptionWriter,
     :owl/someValuesFrom :fibo-der-drc-opt/OptionIssuer,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasExerciseStyle,
     :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseConvention,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-der-drc-opt/OptionPremium,
     :owl/onProperty :fibo-der-drc-opt/hasCalculatedMarketValue,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasExercisePrice,
     :owl/someValuesFrom :fibo-der-drc-opt/StrikePrice,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "put option giving the buyer (holder) the right, but not the obligation, to sell the assets specified at with a strike price equal or close to the current price of the underlying asset, on or before a specified date@en"})

(def PutOption
  "option giving the buyer (holder) the right, but not the obligation, to sell the assets specified at a fixed price or formula, on or before a specified date"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019.@en",
   :cmns-av/explanatoryNote
   #voc/lstr
    "The seller of the put option assumes the obligation of buying the assets specified should the buyer exercise the option.@en",
   :db/ident :fibo-der-drc-opt/PutOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "put option@en",
   :rdfs/subClassOf [:fibo-fbc-fi-fi/Option
                     :fibo-der-drc-opt/PutOption
                     {:owl/onProperty     :fibo-fbc-fi-ip/hasLotSize,
                      :owl/someValuesFrom :xsd/decimal,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-arr-doc/hasExpirationDate,
                      :owl/someValuesFrom :cmns-dt/Date,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-opt/hasExerciseSchedule,
                      :owl/someValuesFrom :fibo-fnd-dt-fd/Schedule,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-der-drc-opt/OptionHolder,
                      :owl/onProperty :fibo-der-drc-opt/hasOptionHolder,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-opt/hasOptionWriter,
                      :owl/someValuesFrom :fibo-der-drc-opt/OptionIssuer,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-opt/hasExerciseStyle,
                      :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseConvention,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass :fibo-der-drc-opt/OptionPremium,
                      :owl/onProperty
                      :fibo-der-drc-opt/hasCalculatedMarketValue,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-opt/hasExercisePrice,
                      :owl/someValuesFrom :fibo-der-drc-opt/StrikePrice,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "option giving the buyer (holder) the right, but not the obligation, to sell the assets specified at a fixed price or formula, on or before a specified date@en"})

(def RiskReversal
  "option trading strategy that consists of being short (selling) an out of the money put and being long (i.e., buying) an out of the money call, both with the same maturity"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "A risk reversal is a position which simulates profit and loss behavior of owning an underlying security; therefore, it is sometimes called a synthetic long. This is an investment strategy that amounts to both buying and selling out-of-money options simultaneously. In this strategy, the investor will first make a market hunch; if that hunch is bullish, he will want to go long. However, instead of going long on the stock, he will buy an out of the money call option, and simultaneously sell an out of the money put option. Presumably he will use the money from the sale of the put option to purchase the call option. Then as the stock goes up in price, the call option will be worth more, and the put option will be worth less.@en",
   :db/ident :fibo-der-drc-opt/RiskReversal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "risk reversal@en",
   :rdfs/subClassOf [{:owl/onClass    :fibo-der-drc-opt/PutOption,
                      :owl/onProperty :cmns-col/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-opt/CallOption,
                      :owl/onProperty :cmns-col/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-opt/OptionTradingStrategy
                     :fibo-der-drc-opt/RiskReversal
                     {:owl/onProperty     :cmns-col/comprises,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Option,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-pas-fpas/TradingStrategy],
   :skos/definition
   #voc/lstr
    "option trading strategy that consists of being short (selling) an out of the money put and being long (i.e., buying) an out of the money call, both with the same maturity@en"})

(def StandardizedOptionsTerms
  "standardized contract terms established by a securities or options exchange or by an options clearing entity"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019.@en",
   :cmns-av/explanatoryNote
   #voc/lstr
    "Such terms may relate to the underlying instruments, exercise price, expiration date, and contract size, for example.@en",
   :db/ident :fibo-der-drc-opt/StandardizedOptionsTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "standardized options terms@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-be-fct-pub/hasPublisher,
     :owl/someValuesFrom {:owl/unionOf
                          [:fibo-fbc-fct-mkt/Exchange
                           :fibo-der-drc-bsc/DerivativesClearingOrganization],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/StandardizedTerms
    {:owl/onProperty     :fibo-fbc-fi-ip/hasPriceDeterminationMethod,
     :owl/someValuesFrom :fibo-fbc-fi-ip/PriceDeterminationMethod,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-cxtdsg/appliesTo,
     :owl/someValuesFrom :fibo-der-drc-opt/VanillaOption,
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-opt/StandardizedOptionsTerms],
   :skos/definition
   #voc/lstr
    "standardized contract terms established by a securities or options exchange or by an options clearing entity@en"})

(def Straddle
  "neutral option trading strategy that involves simultaneously buying both a put option and a call option for the underlying security with the same strike price and the same expiration date"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "The strategy is profitable only when the value of the underlier varies (rises or falls) from the strike price by more than the total premium paid.@en",
   :db/ident :fibo-der-drc-opt/Straddle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "straddle@en",
   :rdfs/subClassOf [{:owl/onClass    :fibo-der-drc-opt/PutOption,
                      :owl/onProperty :cmns-col/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-opt/CallOption,
                      :owl/onProperty :cmns-col/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-opt/OptionTradingStrategy
                     :fibo-der-drc-opt/Straddle
                     {:owl/onProperty     :cmns-col/comprises,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Option,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-pas-fpas/TradingStrategy],
   :skos/definition
   #voc/lstr
    "neutral option trading strategy that involves simultaneously buying both a put option and a call option for the underlying security with the same strike price and the same expiration date@en"})

(def Strangle
  "option trading strategy in which the investor holds a position in both a call and a put option with different strike prices, but with the same expiration date and underlying asset"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "A strangle is a good strategy if you think the underlying security will experience a large price movement in the near future but are unsure of the direction. However, it is profitable mainly if the asset swings sharply in price.@en",
   :db/ident :fibo-der-drc-opt/Strangle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "strangle@en",
   :rdfs/subClassOf [{:owl/onClass    :fibo-der-drc-opt/PutOption,
                      :owl/onProperty :cmns-col/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-opt/CallOption,
                      :owl/onProperty :cmns-col/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-opt/OptionTradingStrategy
                     :fibo-der-drc-opt/Strangle
                     {:owl/onProperty     :cmns-col/comprises,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Option,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-pas-fpas/TradingStrategy],
   :skos/definition
   #voc/lstr
    "option trading strategy in which the investor holds a position in both a call and a put option with different strike prices, but with the same expiration date and underlying asset@en"})

(def StrikePrice
  "price at which a lot of the underlying asset may be bought or sold when the contract is exercised"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "For call options, the strike price is the price at which the security may be purchased by the option holder; for put options, the strike price is the price at which the security may be sold.@en",
   :db/ident :fibo-der-drc-opt/StrikePrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "strike price@en",
   :rdfs/subClassOf [:fibo-fnd-acc-cur/MonetaryPrice
                     :fibo-der-drc-opt/StrikePrice],
   :skos/definition
   #voc/lstr
    "price at which a lot of the underlying asset may be bought or sold when the contract is exercised@en"})

(def StripStrategy
  "option trading strategy that involves a sequential set of options with periodic reset dates, such that each period between resets behaves like an individual option"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Typically, a strip is a strategy that involves being long in one call position and two put options, all with the same strike price on a single underlying stock. The investor who adopts this strategy believes that the underlying price of the stock will plummet in the near-term future. All three of the options will have the same expiration date and the same strike price. If the investor is correct and the price drastically decreases, the puts will pay out substantially. If the investor is wrong and the price of the underlying asset increases, the call option will mitigate the loss. The period between resets may be called a Caplet or Floorlet.@en",
   :db/ident :fibo-der-drc-opt/StripStrategy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "strip strategy@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-dt-fd/hasSchedule,
                      :owl/someValuesFrom :fibo-fnd-dt-fd/Schedule,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-opt/PutOption,
                      :owl/onProperty :cmns-col/comprises,
                      :owl/qualifiedCardinality 2,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-opt/CallOption,
                      :owl/onProperty :cmns-col/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-opt/OptionTradingStrategy
                     :fibo-der-drc-opt/StripStrategy
                     {:owl/onProperty     :cmns-col/comprises,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Option,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-pas-fpas/TradingStrategy],
   :skos/definition
   #voc/lstr
    "option trading strategy that involves a sequential set of options with periodic reset dates, such that each period between resets behaves like an individual option@en"})

(def VanillaOption
  "common option giving the buyer (holder) the right, but not the obligation, to buy (via a call option) or sell (via a put option) the underlying assets specified at a pre-determined price (i.e., the strike price, fixed or calculated), on or before a specified date (the expiration date)"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Vanilla options include call or put options that have no special or unusual features, and are typically exchange traded.@en",
   :db/ident :fibo-der-drc-opt/VanillaOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "vanilla option@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-agr-ctr/hasContractDuration,
     :owl/someValuesFrom :cmns-dt/ExplicitDuration,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fi-ip/hasPriceDeterminationMethod,
     :owl/someValuesFrom :fibo-fbc-fi-ip/PriceDeterminationMethod,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/Option
    :fibo-der-drc-opt/VanillaOption
    {:owl/onProperty     :fibo-fbc-fi-ip/hasLotSize,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-arr-doc/hasExpirationDate,
     :owl/someValuesFrom :cmns-dt/Date,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasExerciseSchedule,
     :owl/someValuesFrom :fibo-fnd-dt-fd/Schedule,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-der-drc-opt/OptionHolder,
     :owl/onProperty :fibo-der-drc-opt/hasOptionHolder,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasOptionWriter,
     :owl/someValuesFrom :fibo-der-drc-opt/OptionIssuer,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasExerciseStyle,
     :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseConvention,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-der-drc-opt/OptionPremium,
     :owl/onProperty :fibo-der-drc-opt/hasCalculatedMarketValue,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-opt/hasExercisePrice,
     :owl/someValuesFrom :fibo-der-drc-opt/StrikePrice,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "common option giving the buyer (holder) the right, but not the obligation, to buy (via a call option) or sell (via a put option) the underlying assets specified at a pre-determined price (i.e., the strike price, fixed or calculated), on or before a specified date (the expiration date)@en"})

(def hasCalculatedMarketValue
  "indicates a calculated price as of some relative date considered the market value of the option at that point in time"
  {:cmns-av/synonym #voc/lstr "has premium@en",
   :db/ident :fibo-der-drc-opt/hasCalculatedMarketValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/Option,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "has calculated market value@en",
   :rdfs/range :fibo-der-drc-opt/OptionPremium,
   :rdfs/subPropertyOf [:fibo-fnd-acc-cur/hasPrice
                        :fibo-der-drc-opt/hasCalculatedMarketValue],
   :skos/definition
   #voc/lstr
    "indicates a calculated price as of some relative date considered the market value of the option at that point in time@en"})

(def hasCapPrice
  "price at which the contract may be exercised"
  {:db/ident :fibo-der-drc-opt/hasCapPrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "has cap price@en",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryPrice,
   :rdfs/subPropertyOf [:fibo-fnd-acc-cur/hasPrice
                        :fibo-fnd-acc-cur/hasMonetaryAmount
                        :fibo-der-drc-opt/hasCapPrice],
   :skos/definition #voc/lstr
                     "price at which the contract may be exercised@en"})

(def hasExerciseDateOffset
  "indicates the period in days between the reset date and the exercise date"
  {:db/ident :fibo-der-drc-opt/hasExerciseDateOffset,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-opt/StripStrategy,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "has exercise date offset@en",
   :rdfs/range :cmns-dt/Duration,
   :rdfs/subPropertyOf [:cmns-dt/hasDuration
                        :fibo-der-drc-opt/hasExerciseDateOffset],
   :skos/definition
   #voc/lstr
    "indicates the period in days between the reset date and the exercise date@en"})

(def hasExercisePrice
  "specifies a predetermined price at which the holder commits to buy or sell an underlying asset"
  {:cmns-av/synonym #voc/lstr "has strike price@en",
   :db/ident :fibo-der-drc-opt/hasExercisePrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "has exercise price@en",
   :rdfs/range :fibo-der-drc-opt/StrikePrice,
   :rdfs/subPropertyOf [:fibo-fnd-acc-cur/hasPrice
                        :fibo-der-drc-opt/hasExercisePrice],
   :skos/definition
   #voc/lstr
    "specifies a predetermined price at which the holder commits to buy or sell an underlying asset@en"})

(def hasExerciseSchedule
  "links an option to the schedule specified in the contract that constrains when it may be exercised"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "An exercise schedule may be as simple as a single date or date period. However, in more complex cases, it may be an ad hoc schedule of individual dates, or a regular schedule of periodic exercise dates.@en",
   :db/ident :fibo-der-drc-opt/hasExerciseSchedule,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/Option,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "has exercise schedule@en",
   :rdfs/range :fibo-fnd-dt-fd/Schedule,
   :rdfs/subPropertyOf [:fibo-fnd-dt-fd/hasSchedule
                        :fibo-der-drc-opt/hasExerciseSchedule],
   :skos/definition
   #voc/lstr
    "links an option to the schedule specified in the contract that constrains when it may be exercised@en"})

(def hasExerciseStyle
  "indicates the exercise convention specified for the option"
  {:db/ident :fibo-der-drc-opt/hasExerciseStyle,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/Option,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label "has exercise style",
   :rdfs/range :fibo-sec-dbt-ex/ExerciseConvention,
   :rdfs/subPropertyOf [:cmns-cls/isClassifiedBy
                        :fibo-der-drc-opt/hasExerciseStyle],
   :skos/definition
   "indicates the exercise convention specified for the option"})

(def hasInterestAccrualDateOffset
  "indicates the period in days between each reset date and the commencement of interest accrual for the next period"
  {:db/ident :fibo-der-drc-opt/hasInterestAccrualDateOffset,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-opt/StripStrategy,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "has interest accrual date offset@en",
   :rdfs/range :cmns-dt/Duration,
   :rdfs/subPropertyOf [:cmns-dt/hasDuration
                        :fibo-der-drc-opt/hasInterestAccrualDateOffset],
   :skos/definition
   #voc/lstr
    "indicates the period in days between each reset date and the commencement of interest accrual for the next period@en"})

(def hasOptionHolder
  "indicates the owner of the option"
  {:db/ident :fibo-der-drc-opt/hasOptionHolder,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/Option,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label "has option holder",
   :rdfs/range :fibo-der-drc-opt/OptionHolder,
   :rdfs/subPropertyOf [:fibo-fnd-agr-ctr/hasContractParty
                        :fibo-der-drc-opt/hasOptionHolder],
   :skos/definition "indicates the owner of the option"})

(def hasOptionWriter
  "indicates the issuer of the option"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Typically, the option writer collects the premium when the option is initially sold.@en",
   :db/ident :fibo-der-drc-opt/hasOptionWriter,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/Option,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label "has option writer",
   :rdfs/range :fibo-der-drc-opt/OptionIssuer,
   :rdfs/subPropertyOf [:fibo-fnd-agr-ctr/hasContractParty
                        :fibo-der-drc-opt/hasOptionWriter],
   :skos/definition "indicates the issuer of the option"})

(def hasSettlementDateOffset
  "indicats the period in days between each reset date and the corresponding settlement date"
  {:db/ident :fibo-der-drc-opt/hasSettlementDateOffset,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-opt/StripStrategy,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "has settlement date offset@en",
   :rdfs/range :cmns-dt/Duration,
   :rdfs/subPropertyOf [:cmns-dt/hasDuration
                        :fibo-der-drc-opt/hasSettlementDateOffset],
   :skos/definition
   #voc/lstr
    "indicats the period in days between each reset date and the corresponding settlement date@en"})

(def hasStrikePercentageAmount
  "indicates a strike price or level expressed as a percentage of the value of the underlying asset"
  {:db/ident :fibo-der-drc-opt/hasStrikePercentageAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "has strike percentage amount@en",
   :rdfs/range :fibo-fnd-acc-cur/PercentageMonetaryAmount,
   :rdfs/subPropertyOf [:fibo-fnd-acc-cur/hasPrice
                        :fibo-der-drc-opt/hasStrikePercentageAmount],
   :skos/definition
   #voc/lstr
    "indicates a strike price or level expressed as a percentage of the value of the underlying asset@en"})

(def hasStrikeRate
  "rate at which the contract may be exercised"
  {:db/ident :fibo-der-drc-opt/hasStrikeRate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfs/label #voc/lstr "has strike rate@en",
   :rdfs/range :fibo-fnd-utl-alx/RatioValue,
   :rdfs/subPropertyOf [:fibo-fnd-qt-qtu/hasQuantityValue
                        :fibo-der-drc-opt/hasStrikeRate],
   :skos/definition #voc/lstr "rate at which the contract may be exercised@en"})