(ns net.wikipunk.rdf.fibo-der-rtd-irswp
  {:cmns-av/copyright
   #{"Copyright (c) 2016-2024 EDM Council, Inc."
     "Copyright (c) 2016-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/RateDerivatives/IRSwaps/",
   :dcterms/abstract
   "This ontology defines concepts specific to interest rate swap contracts, including but not limited to fixed and floating rate combinations, single and cross-currency contracts, etc.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-qtu" "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-der-drc-swp"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/",
    "fibo-der-rtd-irswp"
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/",
    "fibo-der-rtd-rtd"
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-dt-bd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-dt-oc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/",
    "fibo-fnd-pas-psch"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-ei-ei"
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/",
    "fibo-ind-ir-ir"
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
    "fibo-sec-dbt-bnd"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/",
    "fibo-sec-dbt-dbti"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/ProductsAndServices/PaymentsAndSchedules/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/Swaps/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/BusinessDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/EconomicIndicators/EconomicIndicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/RateDerivatives/RateDerivatives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/Bonds/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/DebtInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/InterestRates/InterestRates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Agreements/Contracts/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/RateDerivatives/IRSwaps/"},
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
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps.rdf version of this ontology was modified to simplify the class hierarchy, add a definition for fixed-fixed interest rate swap (DER-126), and to revise definitions related to swap leg-specific events (FBC-317)."
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
                       :owl/onProperty :cmns-doc/specifies,
                       :owl/qualifiedCardinality 2,
                       :rdf/type       :owl/Restriction}
                      :fibo-der-rtd-irswp/InterestRateSwap},
   :skos/definition
   "interest rate swap in which the two streams of interest payments are in different currencies"})

(def ExplicitInterestAmountCalculationEvent
  {:db/ident :fibo-der-rtd-irswp/ExplicitInterestAmountCalculationEvent,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-fbc-dae-dbt/InterestCalculation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"}})

(def FixedFixedInterestRateSwap
  {:cmns-av/adaptedFrom
   {:rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of Financial Instruments (CFI code), Fourth edition, 2019-10."},
   :cmns-av/synonym "fixed-fixed interest rate swap",
   :db/ident :fibo-der-rtd-irswp/FixedFixedInterestRateSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "fixed fixed interest rate swap",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-der-rtd-irswp/FixedInterestRateLeg,
                       :owl/onProperty :fibo-fnd-rel-rel/exchanges,
                       :owl/qualifiedCardinality 2,
                       :rdf/type       :owl/Restriction}
                      :fibo-der-rtd-irswp/InterestRateSwap},
   :skos/definition
   "interest rate swap in which both parties pay a fixed interest rate that they could not otherwise obtain outside of a swap arrangement",
   :skos/example
   "For example, each counterparty uses a different native currency, but wants to borrow money in the other counterparty's native currency.",
   :skos/note
   "Fixed-fixed swaps generally take the form of either a zero coupon swap or a cross-currency swap."})

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
   "This may be the funding leg of some swaps (i.e. one party agrees to pay fixed interest amounts in exchange for whatever is the other leg) or it may be one or both sides of an interest rate swap, where the two parties exchange different interest payment streams.",
   :cmns-av/synonym "fixed interest rate payment stream",
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
   #{{:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-dae-dbt/InterestCalculationSchedule,
      :owl/onProperty :fibo-fnd-dt-fd/hasSchedule,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-dae-dbt/InterestRateResetSchedule,
      :owl/onProperty :fibo-fnd-dt-fd/hasSchedule,
      :rdf/type       :owl/Restriction} :fibo-der-rtd-irswp/InterestRateSwapLeg
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-dae-dbt/InterestRateSettingEvent,
      :owl/onProperty :cmns-doc/specifies,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-dae-dbt/InterestRateReset,
      :owl/onProperty :cmns-doc/specifies,
      :rdf/type       :owl/Restriction} :fibo-der-drc-swp/FloatingLeg},
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
   :owl/deprecated true,
   :owl/equivalentClass :fibo-der-drc-swp/SwapLegEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"}})

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
                         [:fibo-der-drc-swp/RateBasedLeg
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
   #{{:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-dae-dbt/InterestPaymentSchedule,
      :owl/onProperty :fibo-fnd-pas-psch/hasPaymentSchedule,
      :rdf/type       :owl/Restriction}
     {:owl/onClass    :fibo-fnd-acc-cur/Currency,
      :owl/onProperty :cmns-doc/specifies,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-dae-dbt/InterestCalculationSchedule,
      :owl/onProperty :cmns-doc/specifies,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-der-rtd-irswp/NotionalStepSchedule,
      :owl/onProperty :fibo-fnd-dt-fd/hasSchedule,
      :rdf/type       :owl/Restriction} :fibo-der-drc-swp/RateBasedLeg
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-dae-dbt/DayCountConvention,
      :owl/onProperty :fibo-fnd-dt-bd/hasBusinessRecurrenceIntervalConvention,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "swap leg that has an interest rate payment stream, including both a parametric and cashflow representation for the stream of payments"})

(def NotionalStepAmount
  {:cmns-av/explanatoryNote
   "Note that this is an actual concrete sum of money, which may be specified either as a monetary amount (e.g. dollars and cents) or as a percentage of either the original notional amount or the previous notional amount.",
   :db/ident :fibo-der-rtd-irswp/NotionalStepAmount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "notional step amount",
   :rdfs/subClassOf #{:cmns-qtu/ScalarQuantityValue
                      {:owl/onProperty :fibo-fnd-acc-cur/hasNotionalAmount,
                       :owl/someValuesFrom
                       {:owl/unionOf
                        [:fibo-fnd-acc-cur/MonetaryAmount
                         :fibo-fnd-acc-cur/PercentageMonetaryAmount],
                        :rdf/type :owl/Class},
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "the amount of money that is subtracted from the notional on each step date"})

(def NotionalStepChangeEvent
  {:cmns-av/explanatoryNote
   "The frequency / period length of the steps in the step schedule is a multiple of the calculation period or frequency. For example, if the notional is recalculated on every calculation date, applying a new interest rate to the new notional amount, then the two frequencies are the same. If notional is updated every second calculation period, then the step schedule specifies periods that are twice as long, and so on.",
   :db/ident :fibo-der-rtd-irswp/NotionalStepChangeEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "notional step change event",
   :rdfs/subClassOf #{:fibo-fbc-pas-fpas/ContractLifecycleEventOccurrence
                      :fibo-sec-dbt-dbti/StepEvent
                      {:owl/onProperty :cmns-doc/specifies,
                       :owl/someValuesFrom
                       :fibo-der-rtd-irswp/NotionalStepAmount,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "event in which a step change in the notional amount for a given swap leg occurs"})

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
   #{{:owl/onProperty     :fibo-fnd-dt-oc/hasOccurrence,
      :owl/someValuesFrom :fibo-der-rtd-irswp/NotionalStepChangeEvent,
      :rdf/type           :owl/Restriction} :fibo-sec-dbt-dbti/StepSchedule
     {:owl/onProperty     :fibo-fnd-dt-fd/hasRecurrenceInterval,
      :owl/someValuesFrom :fibo-der-rtd-irswp/NotionalStepPeriodLength,
      :rdf/type           :owl/Restriction}
     :fibo-fbc-dae-dbt/ProjectedContractEventSchedule},
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
   #{{:owl/onProperty     :fibo-der-drc-swp/hasLeg,
      :owl/someValuesFrom {:owl/maxQualifiedCardinality 0,
                           :owl/onClass
                           :fibo-der-rtd-irswp/NotionalStepSchedule,
                           :owl/onProperty :fibo-fnd-dt-fd/hasSchedule,
                           :rdf/type :owl/Restriction},
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-der-drc-swp/hasLeg,
      :owl/someValuesFrom {:owl/maxQualifiedCardinality 0,
                           :owl/onClass
                           :fibo-der-rtd-irswp/NotionalStepChangeEvent,
                           :owl/onProperty :cmns-doc/specifies,
                           :rdf/type :owl/Restriction},
      :rdf/type           :owl/Restriction}
     :fibo-der-rtd-irswp/FixedFloatSingleCurrencyInterestRateSwap
     {:owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
      :owl/onProperty :fibo-fnd-acc-cur/hasNotionalAmount,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "fixed-float single currency interest rate swap in which interest payments are netted, the notional principal does not change, and there are no embedded options"})

(def SingleCurrencyInterestRateSwap
  {:db/ident :fibo-der-rtd-irswp/SingleCurrencyInterestRateSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"},
   :rdfs/label "single currency interest rate swap",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-fnd-acc-cur/Currency,
                       :owl/onProperty :cmns-doc/specifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-der-rtd-irswp/InterestRateSwap},
   :skos/definition
   "interest rate swap in which the two streams of interest payments are in the same currency"})

(def SwapStreamCalculationRelativeDate
  {:db/ident :fibo-der-rtd-irswp/SwapStreamCalculationRelativeDate,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-fnd-dt-fd/RelativeDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"}})

(def SwapStreamInterestCalculation
  {:db/ident :fibo-der-rtd-irswp/SwapStreamInterestCalculation,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-fbc-dae-dbt/InterestCalculation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"}})

(def SwapStreamInterestCalculationSchedule
  {:db/ident :fibo-der-rtd-irswp/SwapStreamInterestCalculationSchedule,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-fbc-dae-dbt/InterestCalculationSchedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"}})

(def SwapStreamInterestPayment
  {:db/ident :fibo-der-rtd-irswp/SwapStreamInterestPayment,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-fbc-dae-dbt/InterestPayment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"}})

(def SwapStreamInterestPaymentSchedule
  {:db/ident :fibo-der-rtd-irswp/SwapStreamInterestPaymentSchedule,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-fbc-dae-dbt/InterestPaymentSchedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"}})

(def SwapStreamInterestRateReset
  {:db/ident :fibo-der-rtd-irswp/SwapStreamInterestRateReset,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-fbc-dae-dbt/InterestRateReset,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"}})

(def SwapStreamInterestRateResetSchedule
  {:db/ident :fibo-der-rtd-irswp/SwapStreamInterestRateResetSchedule,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-fbc-dae-dbt/InterestRateResetSchedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"}})

(def SwapStreamInterestRateSettingEvent
  {:db/ident :fibo-der-rtd-irswp/SwapStreamInterestRateSettingEvent,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-fbc-dae-dbt/InterestRateSettingEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"}})

(def SwapStreamInterestSettingRelativeDate
  {:db/ident :fibo-der-rtd-irswp/SwapStreamInterestSettingRelativeDate,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-fnd-dt-fd/RelativeDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"}})

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
   :rdfs/subClassOf #{{:owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                       :owl/onProperty :fibo-fnd-acc-cur/hasNotionalAmount,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-der-rtd-irswp/InterestRateSwap},
   :skos/definition
   "interest rate swap in which the fixed rate cash flows are compounded and paid once on the expiration date, rather than periodically; the payments on the other side (which can be based on a floating interest rate or a fixed rate) follow typical swap payment schedules"})

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
   :owl/deprecated true,
   :owl/equivalentProperty :fibo-fnd-dt-fd/hasSchedule,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"}})

(def hasInterestRateResetSchedule
  {:db/ident :fibo-der-rtd-irswp/hasInterestRateResetSchedule,
   :owl/deprecated true,
   :owl/equivalentProperty :fibo-fnd-dt-fd/hasSchedule,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"}})

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
   :owl/deprecated true,
   :owl/equivalentProperty :fibo-fnd-dt-fd/hasSchedule,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"}})

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
  {:cmns-av/copyright
   #{"Copyright (c) 2016-2024 EDM Council, Inc."
     "Copyright (c) 2016-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines concepts specific to interest rate swap contracts, including but not limited to fixed and floating rate combinations, single and cross-currency contracts, etc.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/ProductsAndServices/PaymentsAndSchedules/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/Swaps/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/BusinessDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/EconomicIndicators/EconomicIndicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/RateDerivatives/RateDerivatives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/Bonds/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/DebtInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/InterestRates/InterestRates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Agreements/Contracts/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/RateDerivatives/IRSwaps/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Interest Rate Swaps Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/ version of this ontology was modified to reflect the addition of the concept of a rates swap and the corresponding rate-based leg to the Swaps ontology and augment this ontology to include both OIS and zero coupon swaps to facilitate mapping to the CFI standard as well as eliminate a redundant notional step percentage amount, which is not used anywhere."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/ version of this ontology was modified to eliminate the property 'hasPaymentSchedule' from the Swaps ontology in favor of the equivalent property with the same name from FND."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps.rdf version of this ontology was modified to use the generic statistical measures and measurements now in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, and to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/ version of this ontology was modified to move the property 'exchanges' to FND given that it could be applied more generally than with respect to swaps only."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps.rdf version of this ontology was modified to simplify the class hierarchy, add a definition for fixed-fixed interest rate swap (DER-126), and to revise definitions related to swap leg-specific events (FBC-317)."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/ version of this ontology was modified to enable representation of plain vanilla interest rate swaps as a separate concept, to integrate the concept of an inflation swap and correct spelling."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/ version of this ontology was modified to eliminate deprecated swap elements."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps.rdf version of this ontology was modified to clarify restrictions on a plain vanilla IR swap."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/ version of this ontology was modified take advantage of basic fixed and floating legs as higher level concepts common to many swaps, and to refine definitions to eliminate ambiguity and conform with ISO 704."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"})