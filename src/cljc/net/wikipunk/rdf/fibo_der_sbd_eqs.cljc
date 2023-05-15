(ns net.wikipunk.rdf.fibo-der-sbd-eqs
  "This ontology defines concepts specific to swap contracts in which one leg gives some form of return on an equity asset, including dividend returns, total asset returns equity dispersion and correlation measurement terms. Many of these return calculations are based on a variety of calculation methods and may vary widely."
  {:cmns-av/copyright ["Copyright (c) 2016-2023 EDM Council, Inc."
                       "Copyright (c) 2016-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :dcterms/abstract
   "This ontology defines concepts specific to swap contracts in which one leg gives some form of return on an equity asset, including dividend returns, total asset returns equity dispersion and correlation measurement terms. Many of these return calculations are based on a variety of calculation methods and may vary widely.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/DerivativesBasics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/MarketIndices/BasketIndices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/Swaps/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Equities/EquityInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"
    "https://www.omg.org/spec/Commons/DatesAndTimes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-der-drc-bsc"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
    "fibo-der-drc-swp"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/",
    "fibo-der-sbd-eqs"
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
    "fibo-der-sbd-sbd"
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
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
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-der-sbd-eqs",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label #voc/lstr "Equity Swaps Ontology@en",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps.rdf version of this ontology was modified to add the concept of a high-level equity swap as well as an equity volatility swap per the ISO CFI standard and to add references to the CFI where appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/ version of this ontology was modified to eliminate deprecated swap elements."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps.rdf version of this ontology was modified to fix spelling errors."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, and to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."]})

(def DispersionSwapIndexConstituentsLeg
  "dispersion leg whose underlying is a defined set of constituents of a given equity index"
  {:db/ident :fibo-der-sbd-eqs/DispersionSwapIndexConstituentsLeg,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label #voc/lstr "dispersion swap index constituents leg@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom {:owl/onProperty
                                           :fibo-fnd-rel-rel/hasIdentity,
                                           :owl/someValuesFrom
                                           :fibo-ind-mkt-bas/BasketOfEquities,
                                           :rdf/type :owl/Restriction},
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-swp/DispersionLeg
                     :fibo-der-sbd-eqs/DispersionSwapIndexConstituentsLeg],
   :skos/definition
   #voc/lstr
    "dispersion leg whose underlying is a defined set of constituents of a given equity index@en"})

(def DispersionSwapIndexLeg
  "dispersion leg whose underlying is an equity index"
  {:db/ident :fibo-der-sbd-eqs/DispersionSwapIndexLeg,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label #voc/lstr "dispersion swap index leg@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                          :owl/someValuesFrom :fibo-ind-mkt-bas/ReferenceIndex,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-swp/DispersionLeg
    :fibo-der-sbd-eqs/DispersionSwapIndexLeg],
   :skos/definition #voc/lstr
                     "dispersion leg whose underlying is an equity index@en"})

(def DividendLeg
  "floating leg of a dividend swap"
  {:cmns-av/usageNote
   #voc/lstr
    "Note that both dividend swaps and some statistical swaps can be based on a dividend stream/leg.@en",
   :db/ident :fibo-der-sbd-eqs/DividendLeg,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label #voc/lstr "dividend leg@en",
   :rdfs/subClassOf [{:owl/onProperty :cmns-dt/hasDatePeriod,
                      :owl/someValuesFrom
                      :fibo-der-sbd-eqs/QualifyingDividendPeriod,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom :fibo-der-sbd-sbd/EquityObservable,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-der-sbd-eqs/SpecialDividendLegTerms,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/SimpleReturnLeg
                     :fibo-der-sbd-eqs/DividendLeg],
   :skos/definition #voc/lstr "floating leg of a dividend swap@en"})

(def DividendSwap
  "equity swap that has at least one leg whose underlier is a dividend stream"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15@en",
   :cmns-av/explanatoryNote
   #voc/lstr
    "Dividend swaps include those that are fixed-term contracts between two parties where one party makes an interest rate payment for each interval and the other party pays the total dividends received as pay-out by a selected underlying asset.@en",
   :db/ident :fibo-der-sbd-eqs/DividendSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label #voc/lstr "dividend swap@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-swp/hasLeg,
                      :owl/someValuesFrom :fibo-der-sbd-eqs/DividendLeg,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-sbd-eqs/EquitySwap
                     :fibo-der-sbd-eqs/DividendSwap
                     :fibo-der-sbd-sbd/EquityDerivative
                     :fibo-der-drc-swp/Swap],
   :skos/definition
   #voc/lstr
    "equity swap that has at least one leg whose underlier is a dividend stream@en"})

(def EquityCorrelationSwap
  "correlation swap that allows one to hedge risks associated with the observed average correlation of a collection of underlying equity products"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "The underlier for the leg can be any of (1) dividend stream for a single stock, (2) change in value for a single share, (3) change in value for a basket of shares, (4) change in value for an index, (5) value of a dividend stream for a basket of shares, or (6) comparison of the change in value of a given share or basket or index against something else - for example, a single share against an index, which is the thing you are cross-correlating with the volatility of the share.@en",
   :db/ident :fibo-der-sbd-eqs/EquityCorrelationSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label #voc/lstr "equity correlation swap@en",
   :rdfs/subClassOf [:fibo-der-sbd-eqs/EquitySwap
                     :fibo-der-drc-swp/CorrelationSwap
                     :fibo-der-sbd-eqs/EquityCorrelationSwap
                     :fibo-der-sbd-sbd/EquityDerivative
                     :fibo-der-drc-swp/Swap],
   :skos/definition
   #voc/lstr
    "correlation swap that allows one to hedge risks associated with the observed average correlation of a collection of underlying equity products@en"})

(def EquityPriceReturnSwap
  "return swap whose return leg underlier is an equity observable"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15@en",
   :cmns-av/explanatoryNote
   #voc/lstr
    "A price return equity swap is similar to a total return swap, except that dividends are not passed through to the buyer).@en",
   :db/ident :fibo-der-sbd-eqs/EquityPriceReturnSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label #voc/lstr "equity price return swap@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-swp/hasReturnLeg,
                      :owl/someValuesFrom :fibo-der-sbd-eqs/EquityReturnLeg,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-sbd-eqs/EquitySwap
                     :fibo-der-drc-swp/ReturnSwap
                     :fibo-der-sbd-eqs/EquityPriceReturnSwap
                     :fibo-der-sbd-sbd/EquityDerivative
                     :fibo-der-drc-swp/Swap],
   :skos/definition
   #voc/lstr
    "return swap whose return leg underlier is an equity observable@en"})

(def EquityReturnLeg
  "return leg whose income is based on an equity observable"
  {:db/ident :fibo-der-sbd-eqs/EquityReturnLeg,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label #voc/lstr "equity return leg@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom :fibo-der-sbd-sbd/EquityObservable,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-swp/ReturnLeg
                     :fibo-der-sbd-eqs/EquityReturnLeg],
   :skos/definition
   #voc/lstr "return leg whose income is based on an equity observable@en"})

(def EquitySwap
  "swap whose payments are linked to the change in value of an underlying equity (e.g. shares, basket of equities or index) or its cashflow"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15@en",
   :cmns-av/explanatoryNote
   #voc/lstr "Equity swaps can be physically or cash settled.@en",
   :db/ident :fibo-der-sbd-eqs/EquitySwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label #voc/lstr "equity swap@en",
   :rdfs/subClassOf [:fibo-der-sbd-sbd/EquityDerivative
                     :fibo-der-drc-swp/Swap
                     :fibo-der-sbd-eqs/EquitySwap],
   :skos/definition
   #voc/lstr
    "swap whose payments are linked to the change in value of an underlying equity (e.g. shares, basket of equities or index) or its cashflow@en"})

(def EquityTotalReturnSwap
  "total return swap whose return leg underlier is an equity observable"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15@en",
   :db/ident :fibo-der-sbd-eqs/EquityTotalReturnSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label #voc/lstr "equity total return swap@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-swp/hasReturnLeg,
                      :owl/someValuesFrom {:owl/intersectionOf
                                           [:fibo-der-sbd-eqs/EquityReturnLeg
                                            :fibo-der-drc-swp/TotalReturnLeg],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-der-sbd-eqs/EquitySwap
                     :fibo-der-drc-swp/TotalReturnSwap
                     :fibo-der-sbd-eqs/EquityTotalReturnSwap
                     :fibo-der-sbd-sbd/EquityDerivative
                     :fibo-der-drc-swp/Swap],
   :skos/definition
   #voc/lstr
    "total return swap whose return leg underlier is an equity observable@en"})

(def EquityVarianceSwap
  "dispersion swap in which the parties agree to exchange payments based on the difference between (i) the realized variance of the price changes of a specified equity underlier over a stated observation period and (ii) a fixed amount of variance that is agreed when the contract is executed"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15@en",
   :cmns-av/explanatoryNote
   #voc/lstr
    "An equity variance swap is a forward swap that uses the variance (being the volatility squared) of an underlying's price movement over a period as the basis for the payoff calculation.@en",
   :db/ident :fibo-der-sbd-eqs/EquityVarianceSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label #voc/lstr "equity variance swap@en",
   :rdfs/subClassOf [:fibo-der-sbd-eqs/EquitySwap
                     :fibo-der-drc-swp/DispersionSwap
                     :fibo-der-sbd-eqs/EquityVarianceSwap
                     :fibo-der-sbd-sbd/EquityDerivative
                     :fibo-der-drc-swp/Swap],
   :skos/definition
   #voc/lstr
    "dispersion swap in which the parties agree to exchange payments based on the difference between (i) the realized variance of the price changes of a specified equity underlier over a stated observation period and (ii) a fixed amount of variance that is agreed when the contract is executed@en"})

(def EquityVolatilitySwap
  "dispersion swap that is a forward contract on the variability of movements in the price of its underlying equity observable"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15@en",
   :cmns-av/explanatoryNote
   #voc/lstr
    "An equity volatility swap is a measure of the amount by which an asset's price is expected to fluctuate over a given period of time; it is normally measured by the annual standard deviation of daily price changes.@en",
   :db/ident :fibo-der-sbd-eqs/EquityVolatilitySwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label #voc/lstr "equity volatility swap@en",
   :rdfs/subClassOf [:fibo-der-sbd-eqs/EquitySwap
                     :fibo-der-drc-swp/DispersionSwap
                     :fibo-der-sbd-eqs/EquityVolatilitySwap
                     :fibo-der-sbd-sbd/EquityDerivative
                     :fibo-der-drc-swp/Swap],
   :skos/definition
   #voc/lstr
    "dispersion swap that is a forward contract on the variability of movements in the price of its underlying equity observable@en"})

(def QualifyingDividendPeriod
  "date period over which the sum of all qualifying dividends paid by the relevant issuers as identified in the swap terms is calculated"
  {:db/ident :fibo-der-sbd-eqs/QualifyingDividendPeriod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label #voc/lstr "qualifying dividend period@en",
   :rdfs/subClassOf [:cmns-dt/ExplicitDatePeriod
                     :fibo-der-sbd-eqs/QualifyingDividendPeriod],
   :skos/definition
   #voc/lstr
    "date period over which the sum of all qualifying dividends paid by the relevant issuers as identified in the swap terms is calculated@en"})

(def SpecialDividendLegTerms
  "terms that are invoked if special dividend and memorial dividends are applicable"
  {:db/ident :fibo-der-sbd-eqs/SpecialDividendLegTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label #voc/lstr "special dividend leg terms@en",
   :rdfs/subClassOf [:fibo-der-drc-bsc/CashflowTerms
                     :fibo-der-sbd-eqs/SpecialDividendLegTerms],
   :skos/definition
   #voc/lstr
    "terms that are invoked if special dividend and memorial dividends are applicable@en"})