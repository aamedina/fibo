(ns net.wikipunk.rdf.fibo-der-rtd-irswp
  {:cmns-av/copyright #{"Copyright (c) 2016-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/RateDerivatives/IRSwaps/",
   :dcterms/abstract
   "This ontology defines concepts specific to interest rate swap contracts, including but not limited to fixed and floating rate combinations, single and cross-currency contracts, etc.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-der-drc-swp"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/",
    "fibo-der-rtd-irswp"
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/",
    "fibo-der-rtd-rtd"
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fbc-fct-ra"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-dt-bd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-pas-psch"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
    "fibo-fnd-qt-qtu"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-alx"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-ei-ei"
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/",
    "fibo-ind-ir-ir"
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
    "fibo-sec-dbt-bnd"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/",
    "fibo-sec-sec-sch"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Quantities/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/ParametricSchedules/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/EconomicIndicators/EconomicIndicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/RateDerivatives/RateDerivatives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/DerivativesContracts/Swaps/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/ProductsAndServices/PaymentsAndSchedules/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Debt/Bonds/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/BusinessDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/InterestRates/InterestRates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/RateDerivatives/IRSwaps/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-der-rtd-irswp",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/",
   :rdfs/label "Interest Rate Swaps Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/ version of this ontology was modified to reflect the addition of the concept of a rates swap and the corresponding rate-based leg to the Swaps ontology and augment this ontology to include both OIS and zero coupon swaps to facilitate mapping to the CFI standard as well as eliminate a redundant notional step percentage amount, which is not used anywhere."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/ version of this ontology was modified to eliminate the property 'hasPaymentSchedule' from the Swaps ontology in favor of the equivalent property with the same name from FND."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps.rdf version of this ontology was modified to use the generic statistical measures and measurements now in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, and to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/ version of this ontology was modified to move the property 'exchanges' to FND given that it could be applied more generally than with respect to swaps only."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/ version of this ontology was modified to enable representation of plain vanilla interest rate swaps as a separate concept, to integrate the concept of an inflation swap and correct spelling."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/ version of this ontology was modified to eliminate deprecated swap elements."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps.rdf version of this ontology was modified to clarify restrictions on a plain vanilla IR swap."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/ version of this ontology was modified take advantage of basic fixed and floating legs as higher level concepts common to many swaps, and to refine definitions to eliminate ambiguity and conform with ISO 704."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"})

(def CrossCurrencyInterestRateSwap
  {:db/ident :fibo-der-rtd-irswp/CrossCurrencyInterestRateSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "cross-currency interest rate swap",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-fnd-acc-cur/Currency,
                       :owl/onProperty :fibo-fbc-fct-ra/specifies,
                       :owl/qualifiedCardinality 2,
                       :rdf/type       :owl/Restriction}
                      :fibo-der-rtd-irswp/InterestRateSwap},
   :skos/definition
   "interest rate swap in which the two streams of interest payments are in different currencies"})

(def ExplicitInterestAmountCalculationEvent
  {:db/ident :fibo-der-rtd-irswp/ExplicitInterestAmountCalculationEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "explicit interest amount calculation event",
   :rdfs/subClassOf #{:fibo-sec-sec-sch/ScheduledCalculationPeriodEndEvent
                      :fibo-der-rtd-irswp/InterestRateStreamEvent},
   :skos/definition
   "the explicit representation of the calculation event in a given period, in which an interest payment is calculated based on the rate (fixed or floating) and the notional amount (in the payment currency, and factored for Fx if necessary), on a given date"})

(def FixedFloatCrossCurrencyInterestRateSwap
  {:cmns-av/synonym #{"fixed float cross currency interest rate swap"
                      "fixed-float cross-currency interest rate swap"},
   :db/ident :fibo-der-rtd-irswp/FixedFloatCrossCurrencyInterestRateSwap,
   :owl/equivalentClass {:owl/intersectionOf
                         [:fibo-der-rtd-irswp/CrossCurrencyInterestRateSwap
                          :fibo-der-rtd-irswp/FixedFloatInterestRateSwap],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "fixed float cross-currency interest rate swap",
   :rdfs/subClassOf #{:fibo-der-rtd-irswp/CrossCurrencyInterestRateSwap
                      :fibo-der-rtd-irswp/FixedFloatInterestRateSwap},
   :skos/definition
   "interest rate swap in which fixed interest payments on the notional are exchanged for floating interest payments and the two streams of interest payments are in different currencies"})

(def FixedFloatInterestRateSwap
  {:cmns-av/synonym "fixed-float interest rate swap",
   :db/ident :fibo-der-rtd-irswp/FixedFloatInterestRateSwap,
   :owl/equivalentClass
   {:owl/intersectionOf
    [:fibo-der-rtd-irswp/InterestRateSwap
     {:owl/onProperty     :fibo-der-drc-swp/hasLeg,
      :owl/someValuesFrom :fibo-der-rtd-irswp/FixedInterestRateLeg,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-der-drc-swp/hasLeg,
      :owl/someValuesFrom :fibo-der-rtd-irswp/FloatingInterestRateLeg,
      :rdf/type           :owl/Restriction}],
    :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "fixed float interest rate swap",
   :rdfs/subClassOf
   #{{:owl/intersectionOf
      [{:owl/onProperty     :fibo-fnd-rel-rel/exchanges,
        :owl/someValuesFrom :fibo-der-rtd-irswp/FixedInterestRateLeg,
        :rdf/type           :owl/Restriction}
       {:owl/onProperty     :fibo-fnd-rel-rel/exchanges,
        :owl/someValuesFrom :fibo-der-rtd-irswp/FloatingInterestRateLeg,
        :rdf/type           :owl/Restriction}],
      :rdf/type :owl/Class} :fibo-der-rtd-irswp/InterestRateSwap},
   :skos/definition
   "interest rate swap in which fixed interest payments on the notional are exchanged for floating interest payments"})

(def FixedFloatSingleCurrencyInterestRateSwap
  {:cmns-av/synonym "fixed-float single-currency interest rate swap",
   :db/ident :fibo-der-rtd-irswp/FixedFloatSingleCurrencyInterestRateSwap,
   :owl/equivalentClass {:owl/intersectionOf
                         [:fibo-der-rtd-irswp/FixedFloatInterestRateSwap
                          :fibo-der-rtd-irswp/SingleCurrencyInterestRateSwap],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "fixed float single currency interest rate swap",
   :rdfs/subClassOf :fibo-der-rtd-irswp/FixedFloatInterestRateSwap,
   :skos/definition
   "interest rate swap in which fixed interest payments on the notional are exchanged for floating interest payments and where both payment streams are expressed in terms of the same currency"})

(def FixedInterestRateLeg
  {:cmns-av/explanatoryNote
   "This may be the funding leg of some swaps (i.e. one party agrees to pay fixed interest amounts in exchange for whatever is the other leg) or it may be one or both sides of an interest rate swap, where the two parties exchange different interest streams.",
   :cmns-av/synonym "fixed interest rate swap stream",
   :db/ident :fibo-der-rtd-irswp/FixedInterestRateLeg,
   :owl/disjointWith :fibo-der-rtd-irswp/FloatingInterestRateLeg,
   :owl/equivalentClass {:owl/intersectionOf
                         [:fibo-der-rtd-irswp/InterestRateSwapLeg
                          {:owl/onProperty :fibo-fbc-dae-dbt/hasInterestRate,
                           :owl/someValuesFrom
                           :fibo-fbc-dae-dbt/FixedInterestRate,
                           :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "fixed interest rate leg",
   :rdfs/subClassOf #{:fibo-der-rtd-irswp/InterestRateSwapLeg
                      :fibo-der-drc-swp/FixedLeg},
   :skos/definition
   "fixed leg that specifies fixed interest amounts and terms for the payment of that interest"})

(def FloatFloatCrossCurrencyInterestRateSwap
  {:cmns-av/synonym "float-float cross-currency interest rate swap",
   :db/ident :fibo-der-rtd-irswp/FloatFloatCrossCurrencyInterestRateSwap,
   :owl/equivalentClass {:owl/intersectionOf
                         [:fibo-der-rtd-irswp/CrossCurrencyInterestRateSwap
                          :fibo-der-rtd-irswp/FloatFloatInterestRateSwap],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "float float cross-currency interest rate swap",
   :rdfs/subClassOf :fibo-der-rtd-irswp/FloatFloatInterestRateSwap,
   :skos/definition
   "interest rate swap that exchanges cashflows based on two different interest rates in different currencies"})

(def FloatFloatInterestRateSwap
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "http://www.investopedia.com/terms/b/basisrateswap.asp"},
   :cmns-av/explanatoryNote
   "This is a swap in which two parties swap variable interest rates based on different money markets, and this is usually done to limit interest-rate risk that a company faces as a result of having differing lending and borrowing rates.",
   :cmns-av/synonym #{"float-float interest rate swap" "basis rate swap"},
   :db/ident :fibo-der-rtd-irswp/FloatFloatInterestRateSwap,
   :owl/equivalentClass {:owl/intersectionOf
                         [:fibo-der-rtd-irswp/InterestRateSwap
                          {:owl/onClass
                           :fibo-der-rtd-irswp/FloatingInterestRateLeg,
                           :owl/onProperty :fibo-der-drc-swp/hasLeg,
                           :owl/qualifiedCardinality 2,
                           :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "float float interest rate swap",
   :rdfs/subClassOf #{{:owl/onClass :fibo-der-rtd-irswp/FloatingInterestRateLeg,
                       :owl/onProperty :fibo-fnd-rel-rel/exchanges,
                       :owl/qualifiedCardinality 2,
                       :rdf/type :owl/Restriction} :fibo-der-drc-swp/BasisSwap
                      :fibo-der-rtd-irswp/InterestRateSwap},
   :skos/definition
   "interest rate swap that exchanges cashflows based on two different floating interest rates"})

(def FloatFloatSingleCurrencyInterestRateSwap
  {:cmns-av/synonym "float-float single-currency interest rate swap",
   :db/ident :fibo-der-rtd-irswp/FloatFloatSingleCurrencyInterestRateSwap,
   :owl/equivalentClass {:owl/intersectionOf
                         [:fibo-der-rtd-irswp/FloatFloatInterestRateSwap
                          :fibo-der-rtd-irswp/SingleCurrencyInterestRateSwap],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "float float single currency interest rate swap",
   :rdfs/subClassOf :fibo-der-rtd-irswp/FloatFloatInterestRateSwap,
   :skos/definition
   "interest rate swap that exchanges cashflows based on two different floating interest rates in the same currency"})

(def FloatingInterestRateLeg
  {:cmns-av/explanatoryNote
   "Instead of an absolute rate you have either a variable reference rate or fixed reference rate and an offset that varies in some way, called a spread (same as margin in floating rate notes).",
   :cmns-av/synonym "floating interest rate swap stream",
   :db/ident :fibo-der-rtd-irswp/FloatingInterestRateLeg,
   :owl/equivalentClass {:owl/intersectionOf
                         [:fibo-der-rtd-irswp/InterestRateSwapLeg
                          {:owl/onProperty :fibo-fbc-dae-dbt/hasInterestRate,
                           :owl/someValuesFrom
                           :fibo-fbc-dae-dbt/FloatingInterestRate,
                           :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "floating interest rate leg",
   :rdfs/subClassOf
   #{{:owl/onProperty :fibo-der-rtd-irswp/hasInterestRateResetSchedule,
      :owl/someValuesFrom
      :fibo-der-rtd-irswp/SwapStreamInterestRateResetSchedule,
      :rdf/type :owl/Restriction} :fibo-der-rtd-irswp/InterestRateSwapLeg
     {:owl/onProperty     :fibo-fbc-fct-ra/specifies,
      :owl/someValuesFrom :fibo-der-rtd-irswp/SwapStreamInterestRateReset,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty :fibo-der-rtd-irswp/hasInterestCalculationSchedule,
      :owl/someValuesFrom
      :fibo-der-rtd-irswp/SwapStreamInterestCalculationSchedule,
      :rdf/type :owl/Restriction}
     {:owl/onProperty :fibo-fbc-fct-ra/specifies,
      :owl/someValuesFrom
      :fibo-der-rtd-irswp/SwapStreamInterestRateSettingEvent,
      :rdf/type :owl/Restriction} :fibo-der-drc-swp/FloatingLeg},
   :skos/definition
   "floating leg in which variable interest is paid on some notional amount, linked to some underlying interest reference rate"})

(def InflationLeg
  {:db/ident :fibo-der-rtd-irswp/InflationLeg,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "inflation leg"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                       :owl/someValuesFrom :fibo-ind-ei-ei/EconomicIndicator,
                       :rdf/type           :owl/Restriction}
                      :fibo-der-drc-swp/FloatingLeg},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "floating rate leg of an inflation swap linked to an inflation index, such as the Consumer Price Index (CPI)"}})

(def InflationSwap
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15"},
   :db/ident :fibo-der-rtd-irswp/InflationSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "inflation swap"},
   :rdfs/subClassOf #{{:owl/maxQualifiedCardinality 1,
                       :owl/onClass    :fibo-sec-dbt-bnd/GovernmentBond,
                       :owl/onProperty :fibo-sec-dbt-bnd/isLinkedToFallback,
                       :rdf/type       :owl/Restriction}
                      :fibo-der-drc-swp/RatesSwap
                      :fibo-der-rtd-rtd/RateBasedDerivativeInstrument
                      {:owl/onProperty     :fibo-der-drc-swp/hasLeg,
                       :owl/someValuesFrom :fibo-der-rtd-irswp/InflationLeg,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "rate swap in which one party pays an amount calculated using an inflation rate index, and the other party pays an amount calculated using another inflation rate index, or a fixed or floating interest rate"}})

(def InterestRateStreamEvent
  {:db/ident :fibo-der-rtd-irswp/InterestRateStreamEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "interest rate stream event",
   :rdfs/subClassOf :fibo-der-drc-swp/SwapStreamEvent,
   :skos/definition
   "interest-rate specific event occurring with respect to one leg of a swap"})

(def InterestRateSwap
  {:db/ident :fibo-der-rtd-irswp/InterestRateSwap,
   :owl/equivalentClass {:owl/intersectionOf
                         [:fibo-der-drc-swp/Swap
                          {:owl/onClass :fibo-der-rtd-irswp/InterestRateSwapLeg,
                           :owl/onProperty :fibo-der-drc-swp/hasLeg,
                           :owl/qualifiedCardinality 2,
                           :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "interest rate swap",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-der-rtd-irswp/InterestRateSwapLeg,
                       :owl/onProperty :fibo-fnd-rel-rel/exchanges,
                       :owl/qualifiedCardinality 2,
                       :rdf/type       :owl/Restriction}
                      :fibo-der-rtd-rtd/InterestRateDerivativeInstrument
                      :fibo-der-drc-swp/RatesSwap},
   :skos/definition
   "swap in which the reference (underlier) for at least one leg is an interest rate"})

(def InterestRateSwapLeg
  {:cmns-av/synonym "interest rate swap stream",
   :db/ident :fibo-der-rtd-irswp/InterestRateSwapLeg,
   :owl/equivalentClass {:owl/intersectionOf
                         [:fibo-der-drc-swp/SwapLeg
                          {:owl/onProperty :fibo-fbc-dae-dbt/hasInterestRate,
                           :owl/someValuesFrom :fibo-fnd-acc-cur/InterestRate,
                           :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "interest rate swap leg",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fbc-fct-ra/specifies,
      :owl/someValuesFrom :fibo-der-rtd-irswp/InterestRateStreamEvent,
      :rdf/type           :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-der-rtd-irswp/NotionalStepChangeEvent,
      :owl/onProperty :fibo-fbc-fct-ra/specifies,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-pas-psch/hasPaymentSchedule,
      :owl/someValuesFrom :fibo-der-rtd-irswp/SwapStreamInterestPaymentSchedule,
      :rdf/type           :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-der-rtd-irswp/NotionalStepSchedule,
      :owl/onProperty :fibo-der-rtd-irswp/hasNotionalStepSchedule,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty :fibo-fnd-dt-bd/hasBusinessRecurrenceIntervalConvention,
      :owl/someValuesFrom :fibo-fbc-dae-dbt/DayCountConvention,
      :rdf/type :owl/Restriction}
     {:owl/onProperty     :fibo-fbc-fct-ra/specifies,
      :owl/someValuesFrom :fibo-der-rtd-irswp/SwapStreamInterestPayment,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fbc-fct-ra/specifies,
      :owl/someValuesFrom :fibo-der-rtd-irswp/SwapStreamInterestCalculation,
      :rdf/type           :owl/Restriction} :fibo-der-drc-swp/RateBasedLeg
     {:owl/onClass    :fibo-fnd-acc-cur/Currency,
      :owl/onProperty :fibo-fbc-fct-ra/specifies,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "swap leg specifying an interest rate stream, including both a parametric and cashflow representation for the stream of payments"})

(def NotionalStepAmount
  {:cmns-av/explanatoryNote
   "Note that this is an actual concrete sum of money, which may be specified either as a monetary amount (e.g. dollars and cents) or as a percentage of either the original notional amount or the previous notional amount.",
   :db/ident :fibo-der-rtd-irswp/NotionalStepAmount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "notional step amount",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-acc-cur/hasNotionalAmount,
      :owl/someValuesFrom {:owl/unionOf
                           [:fibo-fnd-acc-cur/MonetaryAmount
                            :fibo-fnd-acc-cur/PercentageMonetaryAmount],
                           :rdf/type :owl/Class},
      :rdf/type           :owl/Restriction} :fibo-fnd-qt-qtu/QuantityValue},
   :skos/definition
   "the amount of money that is subtracted from the notional on each step date"})

(def NotionalStepChangeEvent
  {:cmns-av/explanatoryNote
   "This always occurs on a calculation date (that is, one of the calculation period end dates). Therefore the frequency / period length of the steps in the step schedule is a multiple of the calculation period or frequency. For example, if the notional is recalculated on every calculation date, applying a new interest rate to the new notional amount, then the two frequencies are the same. If notional is updated every second calculation period, then the step schedule specifies periods that are twice as long, and so on.",
   :db/ident :fibo-der-rtd-irswp/NotionalStepChangeEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "notional step change event",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-dt/hasDate,
                       :owl/someValuesFrom :fibo-fnd-dt-fd/CalculatedDate,
                       :rdf/type           :owl/Restriction}
                      :fibo-der-rtd-irswp/InterestRateStreamEvent},
   :skos/definition
   "event in which a step change in the notional amount of the swap stream occurs"})

(def NotionalStepPeriodLength
  {:db/ident :fibo-der-rtd-irswp/NotionalStepPeriodLength,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "notional step period length",
   :rdfs/subClassOf :fibo-fnd-dt-fd/RecurrenceInterval,
   :skos/definition
   "recurrence interval indicating the frequency with which step changes occur, which is a multiple of the calculation period in the calculation schedule"})

(def NotionalStepSchedule
  {:db/ident :fibo-der-rtd-irswp/NotionalStepSchedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "notional step schedule",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fbc-fct-ra/specifies,
      :owl/someValuesFrom :fibo-der-rtd-irswp/NotionalStepAmount,
      :rdf/type           :owl/Restriction} :fibo-sec-sec-sch/ParametricSchedule
     {:owl/onProperty :fibo-fnd-rel-rel/refersTo,
      :owl/someValuesFrom
      :fibo-der-rtd-irswp/SwapStreamInterestCalculationSchedule,
      :rdf/type :owl/Restriction}},
   :skos/definition
   "schedule of changes in the notional amount on which interest is paid, comprising the regular sequence of step events"})

(def OvernightIndexSwap
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "OIS swap"},
   :cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The interest of the overnight rate portion of the swap is compounded and paid at reset dates. The present value for the leg is determined by either compounding of the overnight rate or by taking the geometric average of the rate over a given period."},
   :db/ident :fibo-der-rtd-irswp/OvernightIndexSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "overnight index swap"},
   :rdfs/subClassOf #{:fibo-der-rtd-irswp/InterestRateSwap
                      {:owl/onProperty :fibo-der-drc-swp/hasLeg,
                       :owl/someValuesFrom
                       :fibo-der-rtd-irswp/OvernightRateIndexLeg,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "swap in which the periodic payments for one leg are based on an overnight interest rate index multiplied by the same notional amount upon which payments for the other leg of the swap are based"}})

(def OvernightRateIndexLeg
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15"},
   :db/ident :fibo-der-rtd-irswp/OvernightRateIndexLeg,
   :owl/equivalentClass {:owl/onProperty     :fibo-fbc-dae-dbt/hasInterestRate,
                         :owl/someValuesFrom :fibo-ind-ir-ir/OvernightRate,
                         :rdf/type           :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "overnight rate index leg",
   :rdfs/subClassOf :fibo-der-rtd-irswp/FloatingInterestRateLeg,
   :skos/definition
   "floating leg in which periodic payments are based on an overnight interest rate index multiplied by the same notional amount on which the payments for the other leg of the swap are based"})

(def PlainVanillaInterestRateSwap
  {:db/ident :fibo-der-rtd-irswp/PlainVanillaInterestRateSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "plain vanilla interest rate swap",
   :rdfs/subClassOf
   #{:fibo-der-rtd-irswp/FixedFloatSingleCurrencyInterestRateSwap
     {:owl/onProperty     :fibo-der-drc-swp/hasLeg,
      :owl/someValuesFrom {:owl/maxQualifiedCardinality 0,
                           :owl/onClass
                           :fibo-der-rtd-irswp/NotionalStepSchedule,
                           :owl/onProperty
                           :fibo-der-rtd-irswp/hasNotionalStepSchedule,
                           :rdf/type :owl/Restriction},
      :rdf/type           :owl/Restriction}
     {:owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
      :owl/onProperty :fibo-fnd-acc-cur/hasNotionalAmount,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :fibo-der-drc-swp/hasLeg,
      :owl/someValuesFrom {:owl/maxQualifiedCardinality 0,
                           :owl/onClass
                           :fibo-der-rtd-irswp/NotionalStepChangeEvent,
                           :owl/onProperty :fibo-fbc-fct-ra/specifies,
                           :rdf/type :owl/Restriction},
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "fixed-float single currency interest rate swap in which interest payments are netted, the notional principal does not change, and there are no embedded options"})

(def SingleCurrencyInterestRateSwap
  {:db/ident :fibo-der-rtd-irswp/SingleCurrencyInterestRateSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "single currency interest rate swap",
   :rdfs/subClassOf #{:fibo-der-rtd-irswp/InterestRateSwap
                      {:owl/onClass    :fibo-fnd-acc-cur/Currency,
                       :owl/onProperty :fibo-fbc-fct-ra/specifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "interest rate swap in which the two streams of interest payments are in the same currency"})

(def SwapStreamCalculationRelativeDate
  {:db/ident :fibo-der-rtd-irswp/SwapStreamCalculationRelativeDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "swap stream calculation relative date",
   :rdfs/subClassOf #{{:owl/onProperty :fibo-fnd-dt-fd/isRelativeTo,
                       :owl/someValuesFrom
                       :fibo-der-rtd-irswp/SwapStreamInterestRateResetSchedule,
                       :rdf/type :owl/Restriction}
                      :fibo-fnd-dt-fd/RelativeDate},
   :skos/definition
   "calculation date that is relative to the rate reset schedule"})

(def SwapStreamInterestCalculation
  {:db/ident :fibo-der-rtd-irswp/SwapStreamInterestCalculation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "swapstream interest calculation",
   :rdfs/subClassOf :fibo-fnd-utl-alx/Expression,
   :skos/definition
   "expression that specifies the formula for calculation of interest"})

(def SwapStreamInterestCalculationSchedule
  {:db/ident :fibo-der-rtd-irswp/SwapStreamInterestCalculationSchedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "swap stream interest calculation schedule",
   :rdfs/subClassOf :fibo-sec-sec-sch/ParametricSchedule,
   :skos/definition
   "parametric schedule that represents the dates on which interest is calculated"})

(def SwapStreamInterestPayment
  {:db/ident :fibo-der-rtd-irswp/SwapStreamInterestPayment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "swap stream interest payment",
   :rdfs/subClassOf :fibo-fnd-pas-psch/Payment,
   :skos/definition
   "event involving the payment of interest for a given swap leg"})

(def SwapStreamInterestPaymentSchedule
  {:cmns-av/explanatoryNote
   "These may more commonly be expressed as an offset of the calculation dates, however the creation of a schedule specifically for payment dates is allowed for.",
   :db/ident :fibo-der-rtd-irswp/SwapStreamInterestPaymentSchedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "swap stream interest payment schedule",
   :rdfs/subClassOf #{:fibo-sec-sec-sch/ParametricSchedule
                      :fibo-fnd-pas-psch/PaymentSchedule},
   :skos/definition
   "parametric schedule that represents the dates on which interest is due to be paid"})

(def SwapStreamInterestRateReset
  {:db/ident :fibo-der-rtd-irswp/SwapStreamInterestRateReset,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "swap stream interest rate reset",
   :rdfs/subClassOf :fibo-der-rtd-irswp/InterestRateStreamEvent,
   :skos/definition
   "event in which an interest rate for a given swap stream changes (resets)"})

(def SwapStreamInterestRateResetSchedule
  {:cmns-av/explanatoryNote
   "These may more commonly be expressed as an offset of the calculation dates, however the creation of a schedule specifically for reset dates is allowed for.",
   :db/ident :fibo-der-rtd-irswp/SwapStreamInterestRateResetSchedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "swapstream interest rate reset schedule",
   :rdfs/subClassOf :fibo-sec-sec-sch/ParametricSchedule,
   :skos/definition "parametric schedule of reset dates"})

(def SwapStreamInterestRateSettingEvent
  {:db/ident :fibo-der-rtd-irswp/SwapStreamInterestRateSettingEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "swap stream interest rate setting event",
   :rdfs/subClassOf
   #{{:owl/onProperty :cmns-dt/hasDate,
      :owl/someValuesFrom
      :fibo-der-rtd-irswp/SwapStreamInterestSettingRelativeDate,
      :rdf/type :owl/Restriction} :fibo-der-rtd-irswp/InterestRateStreamEvent},
   :skos/definition
   "event in which an interest rate for a given swap stream is determined"})

(def SwapStreamInterestSettingRelativeDate
  {:db/ident :fibo-der-rtd-irswp/SwapStreamInterestSettingRelativeDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "swap stream interest setting relative date",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-dt-fd/isRelativeTo,
      :owl/someValuesFrom :fibo-der-rtd-irswp/SwapStreamInterestRateReset,
      :rdf/type           :owl/Restriction} :fibo-fnd-dt-fd/RelativeDate},
   :skos/definition
   "date on which an interest rate is revised if that date is relative to a rate reset event"})

(def ZeroCouponInterestRateSwap
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15"},
   :db/ident :fibo-der-rtd-irswp/ZeroCouponInterestRateSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "zero coupon interest rate swap",
   :rdfs/subClassOf
   #{:fibo-der-rtd-irswp/FixedFloatSingleCurrencyInterestRateSwap
     {:owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
      :owl/onProperty :fibo-fnd-acc-cur/hasNotionalAmount,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "fixed-float single currency interest rate swap in which payments on the floating leg are made periodically, similar to a plain vanilla interest rate swap, but the fixed rate cash flows are compounded and paid as a lump sum on the expiration date, rather than periodically"})

(def hasFirstNotionalStepDate
  {:db/ident :fibo-der-rtd-irswp/hasFirstNotionalStepDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "has first notional step date",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf :cmns-dt/hasStartDate,
   :skos/definition "indicates the initial date in a notional step schedule"})

(def hasFloatingRateCap
  {:cmns-av/explanatoryNote
   "Rate caps can be viewed as insurance, ensuring that the maximum borrowing rate never exceeds the specified cap level.",
   :db/ident :fibo-der-rtd-irswp/hasFloatingRateCap,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "has floating rate cap",
   :rdfs/range :fibo-fbc-dae-dbt/FloatingInterestRate,
   :rdfs/subPropertyOf :fibo-fbc-dae-dbt/hasInterestRate,
   :skos/definition
   "indicates an optional ceiling (cap) on interest rates on floating rate debts"})

(def hasFloatingRateFloor
  {:db/ident :fibo-der-rtd-irswp/hasFloatingRateFloor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "has floating rate floor",
   :rdfs/range :fibo-fbc-dae-dbt/FloatingInterestRate,
   :rdfs/subPropertyOf :fibo-fbc-dae-dbt/hasInterestRate,
   :skos/definition
   "indicates an optional lower bound on interest rates on floating rate debts"})

(def hasFloatingRateSpread
  {:cmns-av/explanatoryNote
   "Such adjustments may be added to or subtracted from the floating rate.",
   :db/ident :fibo-der-rtd-irswp/hasFloatingRateSpread,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "has floating rate spread",
   :rdfs/range :xsd/decimal,
   :skos/definition
   "defines the spread rate that can optionally be used to adjust the floating rate"})

(def hasInterestCalculationSchedule
  {:db/ident :fibo-der-rtd-irswp/hasInterestCalculationSchedule,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "has interest calculation schedule",
   :rdfs/range :fibo-fnd-dt-fd/RegularSchedule,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasSchedule,
   :skos/definition
   "links a set of terms to a corresponding schedule for calculating interest"})

(def hasInterestRateResetSchedule
  {:db/ident :fibo-der-rtd-irswp/hasInterestRateResetSchedule,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "has interest rate reset schedule",
   :rdfs/range :fibo-fnd-dt-fd/Schedule,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasSchedule,
   :skos/definition
   "links a set of terms to a corresponding schedule for resetting the interest rate"})

(def hasLastNotionalStepDate
  {:db/ident :fibo-der-rtd-irswp/hasLastNotionalStepDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "has last notional step date",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf :cmns-dt/hasEndDate,
   :skos/definition "indicates the final date in a notional step schedule"})

(def hasNotionalStepSchedule
  {:db/ident :fibo-der-rtd-irswp/hasNotionalStepSchedule,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "has notional step schedule",
   :rdfs/range :fibo-fnd-dt-fd/Schedule,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasSchedule,
   :skos/definition
   "links a set of terms to a corresponding notional step schedule"})

(def hasRateMultiplier
  {:db/ident :fibo-der-rtd-irswp/hasRateMultiplier,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "has rate multiplier",
   :rdfs/range :xsd/decimal,
   :skos/definition
   "indicates a multiplier applied to the coupon before adding the floating rate spread"})

(def urn:uuid:92c1e0df-1e4d-5fae-96f6-92b274dee662
  {:cmns-av/copyright #{"Copyright (c) 2016-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines concepts specific to interest rate swap contracts, including but not limited to fixed and floating rate combinations, single and cross-currency contracts, etc.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Quantities/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/ParametricSchedules/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/EconomicIndicators/EconomicIndicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/RateDerivatives/RateDerivatives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/DerivativesContracts/Swaps/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/ProductsAndServices/PaymentsAndSchedules/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Debt/Bonds/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/BusinessDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/InterestRates/InterestRates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/RateDerivatives/IRSwaps/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Interest Rate Swaps Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/ version of this ontology was modified to reflect the addition of the concept of a rates swap and the corresponding rate-based leg to the Swaps ontology and augment this ontology to include both OIS and zero coupon swaps to facilitate mapping to the CFI standard as well as eliminate a redundant notional step percentage amount, which is not used anywhere."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/ version of this ontology was modified to eliminate the property 'hasPaymentSchedule' from the Swaps ontology in favor of the equivalent property with the same name from FND."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps.rdf version of this ontology was modified to use the generic statistical measures and measurements now in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, and to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/ version of this ontology was modified to move the property 'exchanges' to FND given that it could be applied more generally than with respect to swaps only."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/ version of this ontology was modified to enable representation of plain vanilla interest rate swaps as a separate concept, to integrate the concept of an inflation swap and correct spelling."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/ version of this ontology was modified to eliminate deprecated swap elements."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps.rdf version of this ontology was modified to clarify restrictions on a plain vanilla IR swap."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/ version of this ontology was modified take advantage of basic fixed and floating legs as higher level concepts common to many swaps, and to refine definitions to eliminate ambiguity and conform with ISO 704."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"})