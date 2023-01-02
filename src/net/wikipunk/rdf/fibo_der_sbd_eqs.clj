(ns net.wikipunk.rdf.fibo-der-sbd-eqs
  "This ontology defines concepts specific to swap contracts in which one leg gives some form of return on an equity asset, including dividend returns, total asset returns equity dispersion and correlation measurement terms. Many of these return calculations are based on a variety of calculation methods and may vary widely."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :dcterms/abstract
   "This ontology defines concepts specific to swap contracts in which one leg gives some form of return on an equity asset, including dividend returns, total asset returns equity dispersion and correlation measurement terms. Many of these return calculations are based on a variety of calculation methods and may vary widely.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/DerivativesBasics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/MarketIndices/BasketIndices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/Swaps/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Equities/EquityInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-der-drc-bsc"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
    "fibo-der-drc-swp"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/",
    "fibo-der-sbd-eqs"
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
    "fibo-der-sbd-sbd"
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-mkt-bas"
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfa/prefix "fibo-der-sbd-eqs",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Equity Swaps Ontology"},
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps.rdf version of this ontology was modified to add the concept of a high-level equity swap as well as an equity volatility swap per the ISO CFI standard and to add references to the CFI where appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/ version of this ontology was modified to eliminate deprecated swap elements."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps.rdf version of this ontology was modified to fix spelling errors."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2016-2022 Object Management Group, Inc."
                  "Copyright (c) 2016-2022 EDM Council, Inc."],
   :sm/dependsOn
   ["https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"
    "https://spec.edmcouncil.org/fibo/ontology/IND/"],
   :sm/fileAbbreviation "fibo-der-sbd-eqs",
   :sm/filename "EquitySwaps.rdf"})

(def DispersionSwapIndexConstituentsLeg
  "dispersion leg whose underlying is a defined set of constituents of a given equity index"
  {:db/ident :fibo-der-sbd-eqs/DispersionSwapIndexConstituentsLeg,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dispersion swap index constituents leg"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-bsc/hasUnderlier,
                      :owl/someValuesFrom {:owl/onProperty
                                           :fibo-fnd-rel-rel/hasIdentity,
                                           :owl/someValuesFrom
                                           :fibo-ind-mkt-bas/BasketOfEquities,
                                           :rdf/type :owl/Restriction},
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-swp/DispersionLeg],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "dispersion leg whose underlying is a defined set of constituents of a given equity index"}})

(def DispersionSwapIndexLeg
  "dispersion leg whose underlying is an equity index"
  {:db/ident :fibo-der-sbd-eqs/DispersionSwapIndexLeg,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dispersion swap index leg"},
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-der-drc-bsc/hasUnderlier,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                          :owl/someValuesFrom :fibo-ind-mkt-bas/ReferenceIndex,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-swp/DispersionLeg],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "dispersion leg whose underlying is an equity index"}})

(def DividendLeg
  "floating leg of a dividend swap"
  {:db/ident :fibo-der-sbd-eqs/DividendLeg,
   :fibo-fnd-utl-av/usageNote
   {:rdf/language "en",
    :rdf/value
    "Note that both dividend swaps and some statistical swaps can be based on a dividend stream/leg."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dividend leg"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-dt-fd/hasDatePeriod,
                      :owl/someValuesFrom
                      :fibo-der-sbd-eqs/QualifyingDividendPeriod,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-bsc/hasUnderlier,
                      :owl/someValuesFrom :fibo-der-sbd-sbd/EquityObservable,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-der-sbd-eqs/SpecialDividendLegTerms,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/SimpleReturnLeg],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "floating leg of a dividend swap"}})

(def DividendSwap
  "equity swap that has at least one leg whose underlier is a dividend stream"
  {:db/ident :fibo-der-sbd-eqs/DividendSwap,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15"},
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Dividend swaps include those that are fixed-term contracts between two parties where one party makes an interest rate payment for each interval and the other party pays the total dividends received as pay-out by a selected underlying asset."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dividend swap"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-swp/hasLeg,
                      :owl/someValuesFrom :fibo-der-sbd-eqs/DividendLeg,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-sbd-eqs/EquitySwap],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "equity swap that has at least one leg whose underlier is a dividend stream"}})

(def EquityCorrelationSwap
  "correlation swap that allows one to hedge risks associated with the observed average correlation of a collection of underlying equity products"
  {:db/ident :fibo-der-sbd-eqs/EquityCorrelationSwap,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The underlier for the leg can be any of (1) dividend stream for a single stock, (2) change in value for a single share, (3) change in value for a basket of shares, (4) change in value for an index, (5) value of a dividend stream for a basket of shares, or (6) comparison of the change in value of a given share or basket or index against something else - for example, a single share against an index, which is the thing you are cross-correlating with the volatility of the share."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity correlation swap"},
   :rdfs/subClassOf [:fibo-der-sbd-eqs/EquitySwap
                     :fibo-der-drc-swp/CorrelationSwap],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "correlation swap that allows one to hedge risks associated with the observed average correlation of a collection of underlying equity products"}})

(def EquityPriceReturnSwap
  "return swap whose return leg underlier is an equity observable"
  {:db/ident :fibo-der-sbd-eqs/EquityPriceReturnSwap,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15"},
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A price return equity swap is similar to a total return swap, except that dividends are not passed through to the buyer)."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity price return swap"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-swp/hasReturnLeg,
                      :owl/someValuesFrom :fibo-der-sbd-eqs/EquityReturnLeg,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-sbd-eqs/EquitySwap
                     :fibo-der-drc-swp/ReturnSwap],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "return swap whose return leg underlier is an equity observable"}})

(def EquityReturnLeg
  "return leg whose income is based on an equity observable"
  {:db/ident :fibo-der-sbd-eqs/EquityReturnLeg,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity return leg"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-bsc/hasUnderlier,
                      :owl/someValuesFrom :fibo-der-sbd-sbd/EquityObservable,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-swp/ReturnLeg],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "return leg whose income is based on an equity observable"}})

(def EquitySwap
  "swap whose payments are linked to the change in value of an underlying equity (e.g. shares, basket of equities or index) or its cashflow"
  {:db/ident :fibo-der-sbd-eqs/EquitySwap,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15"},
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value    "Equity swaps can be physically or cash settled."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity swap"},
   :rdfs/subClassOf [:fibo-der-sbd-sbd/EquityDerivative :fibo-der-drc-swp/Swap],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "swap whose payments are linked to the change in value of an underlying equity (e.g. shares, basket of equities or index) or its cashflow"}})

(def EquityTotalReturnSwap
  "total return swap whose return leg underlier is an equity observable"
  {:db/ident :fibo-der-sbd-eqs/EquityTotalReturnSwap,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity total return swap"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-swp/hasReturnLeg,
                      :owl/someValuesFrom {:owl/intersectionOf
                                           [:fibo-der-sbd-eqs/EquityReturnLeg
                                            :fibo-der-drc-swp/TotalReturnLeg],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-der-sbd-eqs/EquitySwap
                     :fibo-der-drc-swp/TotalReturnSwap],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "total return swap whose return leg underlier is an equity observable"}})

(def EquityVarianceSwap
  "dispersion swap in which the parties agree to exchange payments based on the difference between (i) the realized variance of the price changes of a specified equity underlier over a stated observation period and (ii) a fixed amount of variance that is agreed when the contract is executed"
  {:db/ident :fibo-der-sbd-eqs/EquityVarianceSwap,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15"},
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "An equity variance swap is a forward swap that uses the variance (being the volatility squared) of an underlying's price movement over a period as the basis for the payoff calculation."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity variance swap"},
   :rdfs/subClassOf [:fibo-der-sbd-eqs/EquitySwap
                     :fibo-der-drc-swp/DispersionSwap],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "dispersion swap in which the parties agree to exchange payments based on the difference between (i) the realized variance of the price changes of a specified equity underlier over a stated observation period and (ii) a fixed amount of variance that is agreed when the contract is executed"}})

(def EquityVolatilitySwap
  "dispersion swap that is a forward contract on the variability of movements in the price of its underlying equity observable"
  {:db/ident :fibo-der-sbd-eqs/EquityVolatilitySwap,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15"},
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "An equity volatility swap is a measure of the amount by which an asset's price is expected to fluctuate over a given period of time; it is normally measured by the annual standard deviation of daily price changes."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity volatility swap"},
   :rdfs/subClassOf [:fibo-der-sbd-eqs/EquitySwap
                     :fibo-der-drc-swp/DispersionSwap],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "dispersion swap that is a forward contract on the variability of movements in the price of its underlying equity observable"}})

(def QualifyingDividendPeriod
  "date period over which the sum of all qualifying dividends paid by the relevant issuers as identified in the swap terms is calculated"
  {:db/ident :fibo-der-sbd-eqs/QualifyingDividendPeriod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "qualifying dividend period"},
   :rdfs/subClassOf :fibo-fnd-dt-fd/ExplicitDatePeriod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "date period over which the sum of all qualifying dividends paid by the relevant issuers as identified in the swap terms is calculated"}})

(def SpecialDividendLegTerms
  "terms that are invoked if special dividend and memorial dividends are applicable"
  {:db/ident :fibo-der-sbd-eqs/SpecialDividendLegTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "special dividend leg terms"},
   :rdfs/subClassOf :fibo-der-drc-bsc/CashflowTerms,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "terms that are invoked if special dividend and memorial dividends are applicable"}})