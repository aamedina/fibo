(ns net.wikipunk.rdf.fibo-der-sbd-eqs
  {:cmns-av/copyright
   #{"Copyright (c) 2016-2024 EDM Council, Inc."
     "Copyright (c) 2016-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/DER/SecurityBasedDerivatives/EquitySwaps/",
   :dcterms/abstract
   "This ontology defines concepts specific to swap contracts in which one leg gives some form of return on an equity asset, including dividend returns, total asset returns equity dispersion and correlation measurement terms. Many of these return calculations are based on a variety of calculation methods and may vary widely.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
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
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-mkt-bas"
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/DER/DerivativesContracts/Swaps/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/IND/MarketIndices/BasketIndices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Equities/EquityInstruments/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/DER/SecurityBasedDerivatives/EquitySwaps/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-der-sbd-eqs",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Equity Swaps Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, and to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/ version of this ontology was modified to eliminate deprecated swap elements."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps.rdf version of this ontology was modified to add the concept of a high-level equity swap as well as an equity volatility swap per the ISO CFI standard and to add references to the CFI where appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps.rdf version of this ontology was modified to fix spelling errors."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/"})

(def DispersionSwapIndexConstituentsLeg
  {:db/ident :fibo-der-sbd-eqs/DispersionSwapIndexConstituentsLeg,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dispersion swap index constituents leg"},
   :rdfs/subClassOf #{:fibo-der-drc-swp/DispersionLeg
                      {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                       :owl/someValuesFrom {:owl/onProperty
                                            :cmns-rlcmp/isPlayedBy,
                                            :owl/someValuesFrom
                                            :fibo-ind-mkt-bas/BasketOfEquities,
                                            :rdf/type :owl/Restriction},
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "dispersion leg whose underlying is a defined set of constituents of a given equity index"}})

(def DispersionSwapIndexLeg
  {:db/ident :fibo-der-sbd-eqs/DispersionSwapIndexLeg,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dispersion swap index leg"},
   :rdfs/subClassOf
   #{:fibo-der-drc-swp/DispersionLeg
     {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
      :owl/someValuesFrom {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
                           :owl/someValuesFrom :fibo-ind-mkt-bas/ReferenceIndex,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction}},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "dispersion leg whose underlying is an equity index"}})

(def DividendLeg
  {:cmns-av/usageNote
   {:rdf/language "en",
    :rdf/value
    "Note that both dividend swaps and some statistical swaps can be based on a dividend stream/leg."},
   :db/ident :fibo-der-sbd-eqs/DividendLeg,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dividend leg"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-dt/hasDatePeriod,
      :owl/someValuesFrom :fibo-der-sbd-eqs/QualifyingDividendPeriod,
      :rdf/type           :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-der-sbd-eqs/SpecialDividendLegTerms,
      :owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
      :rdf/type       :owl/Restriction} :fibo-der-drc-swp/SimpleReturnLeg
     {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
      :owl/someValuesFrom :fibo-der-sbd-sbd/EquityObservable,
      :rdf/type           :owl/Restriction}},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "floating leg of a dividend swap"}})

(def DividendSwap
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Dividend swaps include those that are fixed-term contracts between two parties where one party makes an interest rate payment for each interval and the other party pays the total dividends received as pay-out by a selected underlying asset."},
   :db/ident :fibo-der-sbd-eqs/DividendSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dividend swap"},
   :rdfs/subClassOf #{:fibo-der-sbd-eqs/EquitySwap
                      {:owl/onProperty     :fibo-der-drc-swp/hasLeg,
                       :owl/someValuesFrom :fibo-der-sbd-eqs/DividendLeg,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "equity swap that has at least one leg whose underlier is a dividend stream"}})

(def EquityCorrelationSwap
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The underlier for the leg can be any of (1) dividend stream for a single stock, (2) change in value for a single share, (3) change in value for a basket of shares, (4) change in value for an index, (5) value of a dividend stream for a basket of shares, or (6) comparison of the change in value of a given share or basket or index against something else - for example, a single share against an index, which is the thing you are cross-correlating with the volatility of the share."},
   :db/ident :fibo-der-sbd-eqs/EquityCorrelationSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity correlation swap"},
   :rdfs/subClassOf #{:fibo-der-drc-swp/CorrelationSwap
                      :fibo-der-sbd-eqs/EquitySwap},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "correlation swap that allows one to hedge risks associated with the observed average correlation of a collection of underlying equity products"}})

(def EquityPriceReturnSwap
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A price return equity swap is similar to a total return swap, except that dividends are not passed through to the buyer)."},
   :db/ident :fibo-der-sbd-eqs/EquityPriceReturnSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity price return swap"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-der-drc-swp/hasReturnLeg,
                       :owl/someValuesFrom :fibo-der-sbd-eqs/EquityReturnLeg,
                       :rdf/type           :owl/Restriction}
                      :fibo-der-drc-swp/ReturnSwap
                      :fibo-der-sbd-eqs/EquitySwap},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "return swap whose return leg underlier is an equity observable"}})

(def EquityReturnLeg
  {:db/ident :fibo-der-sbd-eqs/EquityReturnLeg,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity return leg"},
   :rdfs/subClassOf #{:fibo-der-drc-swp/ReturnLeg
                      {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                       :owl/someValuesFrom :fibo-der-sbd-sbd/EquityObservable,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "return leg whose income is based on an equity observable"}})

(def EquitySwap
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15"},
   :cmns-av/explanatoryNote {:rdf/language "en",
                             :rdf/value
                             "Equity swaps can be physically or cash settled."},
   :db/ident :fibo-der-sbd-eqs/EquitySwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity swap"},
   :rdfs/subClassOf #{:fibo-der-sbd-sbd/EquityDerivative
                      :fibo-der-drc-swp/Swap},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "swap whose payments are linked to the change in value of an underlying equity (e.g. shares, basket of equities or index) or its cashflow"}})

(def EquityTotalReturnSwap
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15"},
   :db/ident :fibo-der-sbd-eqs/EquityTotalReturnSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity total return swap"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-der-drc-swp/hasReturnLeg,
                       :owl/someValuesFrom {:owl/intersectionOf
                                            [:fibo-der-sbd-eqs/EquityReturnLeg
                                             :fibo-der-drc-swp/TotalReturnLeg],
                                            :rdf/type :owl/Class},
                       :rdf/type           :owl/Restriction}
                      :fibo-der-sbd-eqs/EquitySwap
                      :fibo-der-drc-swp/TotalReturnSwap},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "total return swap whose return leg underlier is an equity observable"}})

(def EquityVarianceSwap
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "An equity variance swap is a forward swap that uses the variance (being the volatility squared) of an underlying's price movement over a period as the basis for the payoff calculation."},
   :db/ident :fibo-der-sbd-eqs/EquityVarianceSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity variance swap"},
   :rdfs/subClassOf #{:fibo-der-sbd-eqs/EquitySwap
                      :fibo-der-drc-swp/DispersionSwap},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "dispersion swap in which the parties agree to exchange payments based on the difference between (i) the realized variance of the price changes of a specified equity underlier over a stated observation period and (ii) a fixed amount of variance that is agreed when the contract is executed"}})

(def EquityVolatilitySwap
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "An equity volatility swap is a measure of the amount by which an asset's price is expected to fluctuate over a given period of time; it is normally measured by the annual standard deviation of daily price changes."},
   :db/ident :fibo-der-sbd-eqs/EquityVolatilitySwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity volatility swap"},
   :rdfs/subClassOf #{:fibo-der-sbd-eqs/EquitySwap
                      :fibo-der-drc-swp/DispersionSwap},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "dispersion swap that is a forward contract on the variability of movements in the price of its underlying equity observable"}})

(def QualifyingDividendPeriod
  {:db/ident :fibo-der-sbd-eqs/QualifyingDividendPeriod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "qualifying dividend period"},
   :rdfs/subClassOf :cmns-dt/ExplicitDatePeriod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "date period over which the sum of all qualifying dividends paid by the relevant issuers as identified in the swap terms is calculated"}})

(def SpecialDividendLegTerms
  {:db/ident :fibo-der-sbd-eqs/SpecialDividendLegTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "special dividend leg terms"},
   :rdfs/subClassOf :fibo-der-drc-bsc/CashflowTerms,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "terms that are invoked if special dividend and memorial dividends are applicable"}})

(def urn:uuid:74c841e0-becf-5aef-bb00-827ccaef906c
  {:cmns-av/copyright
   #{"Copyright (c) 2016-2024 EDM Council, Inc."
     "Copyright (c) 2016-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines concepts specific to swap contracts in which one leg gives some form of return on an equity asset, including dividend returns, total asset returns equity dispersion and correlation measurement terms. Many of these return calculations are based on a variety of calculation methods and may vary widely.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/DER/DerivativesContracts/Swaps/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/IND/MarketIndices/BasketIndices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Equities/EquityInstruments/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/DER/SecurityBasedDerivatives/EquitySwaps/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Equity Swaps Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, and to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/ version of this ontology was modified to eliminate deprecated swap elements."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps.rdf version of this ontology was modified to add the concept of a high-level equity swap as well as an equity volatility swap per the ISO CFI standard and to add references to the CFI where appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps.rdf version of this ontology was modified to fix spelling errors."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/"})