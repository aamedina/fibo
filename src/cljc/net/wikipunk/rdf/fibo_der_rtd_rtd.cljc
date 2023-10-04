(ns net.wikipunk.rdf.fibo-der-rtd-rtd
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/",
    :namespaces
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
    :prefix "fibo-der-rtd-rtd",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/RateDerivatives/RateDerivatives/"}
  {:cmns-av/copyright #{"Copyright (c) 2016-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines concepts that are common to derivatives based on variation in some defined variable, such as an economic rate, an interest rate or an index value.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/Indicators/Indicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/EconomicIndicators/EconomicIndicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/ForeignExchange/ForeignExchange/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/Baskets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/InterestRates/InterestRates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/FinancialDates/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/RateDerivatives/RateDerivatives/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Rate Derivatives Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives.rdf version of this ontology was modified to eliminate the dependency on NonPhysicalUnderlier, which was redundant."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives.rdf version of this ontology was extended to include foreign exchange rates, forward rate agreements, and revise definitions to be unambiguous and ISO 704 compliant."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/"})

(def EconomicRateBasedDerivativeInstrument
  {:db/ident :fibo-der-rtd-rtd/EconomicRateBasedDerivativeInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/"},
   :rdfs/label "economic rate-based derivative instrument",
   :rdfs/subClassOf #{{:owl/onProperty :fibo-fbc-fi-fi/hasUnderlier,
                       :owl/someValuesFrom
                       :fibo-der-rtd-rtd/EconomicRateObservable,
                       :rdf/type :owl/Restriction}
                      :fibo-der-rtd-rtd/RateBasedDerivativeInstrument},
   :skos/definition
   "rate-based derivative whose underlier is an economic indicator"})

(def EconomicRateObservable
  {:db/ident :fibo-der-rtd-rtd/EconomicRateObservable,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "economic rate observable"},
   :rdfs/subClassOf #{:fibo-der-rtd-rtd/RateBasedObservable
                      {:owl/onClass    :fibo-ind-ei-ei/EconomicIndicator,
                       :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "rate-based observable that is specifically an economic indicator"})

(def ForeignExchangeRateObservable
  {:db/ident :fibo-der-rtd-rtd/ForeignExchangeRateObservable,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "foreign exchange rate observable"},
   :rdfs/subClassOf #{:fibo-der-rtd-rtd/RateBasedObservable
                      {:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                       :owl/someValuesFrom :fibo-ind-fx-fx/QuotedExchangeRate,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "rate-based observable that is an exchange rate, typically a quoted exchange rate"})

(def ForwardRateAgreement
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "FRA"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The FRA determines the rates to be used along with the termination date and notional value. FRAs are cash-settled with the payment based on the net difference between the interest rate of the contract and the floating rate in the market called the reference rate. The notional amount is not exchanged, but rather a cash amount based on the rate differentials and the notional value of the contract."},
   :db/ident :fibo-der-rtd-rtd/ForwardRateAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "forward rate agreement"},
   :rdfs/subClassOf :fibo-der-rtd-rtd/InterestRateDerivativeInstrument,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "agreement to exchange an interest rate commitment on a notional amount"}})

(def InterestRateDerivativeInstrument
  {:db/ident :fibo-der-rtd-rtd/InterestRateDerivativeInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/"},
   :rdfs/label "interest rate derivative instrument",
   :rdfs/subClassOf #{{:owl/onProperty :fibo-fbc-fi-fi/hasUnderlier,
                       :owl/someValuesFrom
                       :fibo-der-rtd-rtd/InterestRateObservable,
                       :rdf/type :owl/Restriction}
                      :fibo-der-rtd-rtd/RateBasedDerivativeInstrument},
   :skos/definition
   "rate-based derivative whose underlier is an interest rate"})

(def InterestRateObservable
  {:db/ident :fibo-der-rtd-rtd/InterestRateObservable,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/"},
   :rdfs/label "interest rate observable",
   :rdfs/subClassOf #{:fibo-der-rtd-rtd/RateBasedObservable
                      {:owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                       :owl/someValuesFrom
                       :fibo-ind-ir-ir/ReferenceInterestRate,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "rate-based observable that is an interest rate, typically a well-known reference interest rate"})

(def RateBasedDerivativeInstrument
  {:db/ident :fibo-der-rtd-rtd/RateBasedDerivativeInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/"},
   :rdfs/label "rate-based derivative instrument",
   :rdfs/subClassOf #{{:owl/onProperty :fibo-fbc-fi-fi/hasUnderlier,
                       :owl/someValuesFrom
                       :fibo-der-rtd-rtd/RateBasedObservable,
                       :rdf/type :owl/Restriction}
                      :fibo-fbc-fi-fi/DerivativeInstrument},
   :skos/definition
   "derivative instrument whose underlier is a non-physical observable rate"})

(def RateBasedObservable
  {:cmns-av/explanatoryNote
   "Rate-based observables interest rates, market rate, economic indicators, statistical measure calculated over some collection of indices, foreign exchange rates and others that are readily observable in the world",
   :db/ident :fibo-der-rtd-rtd/RateBasedObservable,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/"},
   :rdfs/label "rate-based observable",
   :rdfs/subClassOf #{:fibo-der-drc-bsc/ObservableValue
                      {:owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                       :owl/someValuesFrom
                       {:owl/unionOf [:fibo-sec-sec-bsk/BasketOfIndices
                                      :fibo-ind-ind-ind/MarketRate
                                      :fibo-ind-ei-ei/EconomicIndicator
                                      :fibo-ind-fx-fx/QuotedExchangeRate],
                        :rdf/type    :owl/Class},
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "non-physical observable value, such as an interest rate, market rate, economic indicator, statistical measure calculated over some collection of indices, or some other rate that is readily observable in the world"})

(def urn:uuid:809f5425-922b-5a31-a229-f4979e172979
  {:cmns-av/copyright #{"Copyright (c) 2016-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines concepts that are common to derivatives based on variation in some defined variable, such as an economic rate, an interest rate or an index value.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/Indicators/Indicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/EconomicIndicators/EconomicIndicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/ForeignExchange/ForeignExchange/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/Baskets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/InterestRates/InterestRates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/FinancialDates/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/RateDerivatives/RateDerivatives/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Rate Derivatives Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives.rdf version of this ontology was modified to eliminate the dependency on NonPhysicalUnderlier, which was redundant."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives.rdf version of this ontology was extended to include foreign exchange rates, forward rate agreements, and revise definitions to be unambiguous and ISO 704 compliant."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/"})