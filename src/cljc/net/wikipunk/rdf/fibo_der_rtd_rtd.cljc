(ns net.wikipunk.rdf.fibo-der-rtd-rtd
  "This ontology defines concepts that are common to derivatives based on variation in some defined variable, such as an economic rate, an interest rate or an index value."
  {:cmns-av/copyright ["Copyright (c) 2016-2023 EDM Council, Inc."
                       "Copyright (c) 2016-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/",
   :dcterms/abstract
   "This ontology defines concepts that are common to derivatives based on variation in some defined variable, such as an economic rate, an interest rate or an index value.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/DerivativesBasics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/EconomicIndicators/EconomicIndicators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/Baskets/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/ForeignExchange/ForeignExchange/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/InterestRates/InterestRates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/Indicators/Indicators/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/RateDerivatives/RateDerivatives/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-der-drc-bsc"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
    "fibo-der-rtd-rtd"
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-ei-ei"
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/",
    "fibo-ind-fx-fx"
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
    "fibo-ind-ind-ind"
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/",
    "fibo-ind-ir-ir"
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
    "fibo-sec-sec-bsk"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Baskets/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-der-rtd-rtd",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/",
   :rdfs/label "Rate Derivatives Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives.rdf version of this ontology was extended to include foreign exchange rates, forward rate agreements, and revise definitions to be unambiguous and ISO 704 compliant."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives.rdf version of this ontology was modified to eliminate the dependency on NonPhysicalUnderlier, which was redundant."]})

(def EconomicRateBasedDerivativeInstrument
  "rate-based derivative whose underlier is an economic indicator"
  {:db/ident :fibo-der-rtd-rtd/EconomicRateBasedDerivativeInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/",
   :rdfs/label "economic rate-based derivative instrument",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom
                      :fibo-der-rtd-rtd/EconomicRateObservable,
                      :rdf/type :owl/Restriction}
                     :fibo-der-rtd-rtd/RateBasedDerivativeInstrument
                     :fibo-der-rtd-rtd/EconomicRateBasedDerivativeInstrument
                     {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom :fibo-der-rtd-rtd/RateBasedObservable,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/DerivativeInstrument],
   :skos/definition
   "rate-based derivative whose underlier is an economic indicator"})

(def EconomicRateObservable
  "rate-based observable that is specifically an economic indicator"
  {:db/ident :fibo-der-rtd-rtd/EconomicRateObservable,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/",
   :rdfs/label #voc/lstr "economic rate observable@en",
   :rdfs/subClassOf [{:owl/onClass    :fibo-ind-ei-ei/EconomicIndicator,
                      :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-rtd-rtd/RateBasedObservable
                     :fibo-der-rtd-rtd/EconomicRateObservable
                     {:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-sec-sec-bsk/BasketOfIndices
                                            :fibo-ind-ind-ind/MarketRate
                                            :fibo-ind-ei-ei/EconomicIndicator
                                            :fibo-ind-fx-fx/QuotedExchangeRate],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-bsc/ObservableValue],
   :skos/definition
   "rate-based observable that is specifically an economic indicator"})

(def ForeignExchangeRateObservable
  "rate-based observable that is an exchange rate, typically a quoted exchange rate"
  {:db/ident :fibo-der-rtd-rtd/ForeignExchangeRateObservable,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/",
   :rdfs/label #voc/lstr "foreign exchange rate observable@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                      :owl/someValuesFrom :fibo-ind-fx-fx/QuotedExchangeRate,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-rtd-rtd/RateBasedObservable
                     :fibo-der-rtd-rtd/ForeignExchangeRateObservable
                     {:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-sec-sec-bsk/BasketOfIndices
                                            :fibo-ind-ind-ind/MarketRate
                                            :fibo-ind-ei-ei/EconomicIndicator
                                            :fibo-ind-fx-fx/QuotedExchangeRate],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-bsc/ObservableValue],
   :skos/definition
   "rate-based observable that is an exchange rate, typically a quoted exchange rate"})

(def ForwardRateAgreement
  "agreement to exchange an interest rate commitment on a notional amount"
  {:cmns-av/abbreviation #voc/lstr "FRA@en",
   :cmns-av/explanatoryNote
   #voc/lstr
    "The FRA determines the rates to be used along with the termination date and notional value. FRAs are cash-settled with the payment based on the net difference between the interest rate of the contract and the floating rate in the market called the reference rate. The notional amount is not exchanged, but rather a cash amount based on the rate differentials and the notional value of the contract.@en",
   :db/ident :fibo-der-rtd-rtd/ForwardRateAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/",
   :rdfs/label #voc/lstr "forward rate agreement@en",
   :rdfs/subClassOf [:fibo-der-rtd-rtd/InterestRateDerivativeInstrument
                     :fibo-der-rtd-rtd/ForwardRateAgreement
                     :fibo-der-rtd-rtd/RateBasedDerivativeInstrument
                     {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom :fibo-der-rtd-rtd/RateBasedObservable,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/DerivativeInstrument
                     {:owl/onProperty :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom
                      :fibo-der-rtd-rtd/InterestRateObservable,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "agreement to exchange an interest rate commitment on a notional amount@en"})

(def InterestRateDerivativeInstrument
  "rate-based derivative whose underlier is an interest rate"
  {:db/ident :fibo-der-rtd-rtd/InterestRateDerivativeInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/",
   :rdfs/label "interest rate derivative instrument",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom
                      :fibo-der-rtd-rtd/InterestRateObservable,
                      :rdf/type :owl/Restriction}
                     :fibo-der-rtd-rtd/RateBasedDerivativeInstrument
                     :fibo-der-rtd-rtd/InterestRateDerivativeInstrument
                     {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom :fibo-der-rtd-rtd/RateBasedObservable,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/DerivativeInstrument],
   :skos/definition
   "rate-based derivative whose underlier is an interest rate"})

(def InterestRateObservable
  "rate-based observable that is an interest rate, typically a well-known reference interest rate"
  {:db/ident :fibo-der-rtd-rtd/InterestRateObservable,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/",
   :rdfs/label "interest rate observable",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                      :owl/someValuesFrom :fibo-ind-ir-ir/ReferenceInterestRate,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-rtd-rtd/RateBasedObservable
                     :fibo-der-rtd-rtd/InterestRateObservable
                     {:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-sec-sec-bsk/BasketOfIndices
                                            :fibo-ind-ind-ind/MarketRate
                                            :fibo-ind-ei-ei/EconomicIndicator
                                            :fibo-ind-fx-fx/QuotedExchangeRate],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-bsc/ObservableValue],
   :skos/definition
   "rate-based observable that is an interest rate, typically a well-known reference interest rate"})

(def RateBasedDerivativeInstrument
  "derivative instrument whose underlier is a non-physical observable rate"
  {:db/ident :fibo-der-rtd-rtd/RateBasedDerivativeInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/",
   :rdfs/label "rate-based derivative instrument",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom :fibo-der-rtd-rtd/RateBasedObservable,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/DerivativeInstrument
                     :fibo-der-rtd-rtd/RateBasedDerivativeInstrument],
   :skos/definition
   "derivative instrument whose underlier is a non-physical observable rate"})

(def RateBasedObservable
  "non-physical observable value, such as an interest rate, market rate, economic indicator, statistical measure calculated over some collection of indices, or some other rate that is readily observable in the world"
  {:cmns-av/explanatoryNote
   "Rate-based observables interest rates, market rate, economic indicators, statistical measure calculated over some collection of indices, foreign exchange rates and others that are readily observable in the world",
   :db/ident :fibo-der-rtd-rtd/RateBasedObservable,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/",
   :rdfs/label "rate-based observable",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-sec-sec-bsk/BasketOfIndices
                                            :fibo-ind-ind-ind/MarketRate
                                            :fibo-ind-ei-ei/EconomicIndicator
                                            :fibo-ind-fx-fx/QuotedExchangeRate],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-bsc/ObservableValue
                     :fibo-der-rtd-rtd/RateBasedObservable],
   :skos/definition
   "non-physical observable value, such as an interest rate, market rate, economic indicator, statistical measure calculated over some collection of indices, or some other rate that is readily observable in the world"})