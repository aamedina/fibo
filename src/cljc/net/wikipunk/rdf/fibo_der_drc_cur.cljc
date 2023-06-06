(ns net.wikipunk.rdf.fibo-der-drc-cur
  "This ontology defines concepts common to currency spot contracts and foreign exchange derivatives (forwards, options and swaps)."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 Object Management Group, Inc."
                       "Copyright (c) 2015-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/",
   :dcterms/abstract
   "This ontology defines concepts common to currency spot contracts and foreign exchange derivatives (forwards, options and swaps).",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Quantities/QuantitiesAndUnits/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/RateDerivatives/RateDerivatives/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/FuturesAndForwards/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/ForeignExchange/ForeignExchange/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/Swaps/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/DerivativesBasics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/Options/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/CurrencyContracts/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-der-drc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/",
    "fibo-der-drc-ff"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
    "fibo-der-drc-opt"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
    "fibo-der-drc-swp"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/",
    "fibo-der-rtd-rtd"
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-qt-qtu"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-fx-fx"
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-der-drc-cur",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/",
   :rdfs/label #voc/lstr "Currency Contracts Ontology@en",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate, and to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."
    "The https://spec.edmcouncil.org/fibo/ontology/DerivativesContracts/CurrencyContracts/ version of this ontology was modified to reflect the addition of the concept of a rates swap and the corresponding rate-based leg to the Swaps ontology, as well as the concept of a spot forward currency swap, to facilitate mapping to the CFI standard."]})

(def CurrencyDerivative
  "agreement to deliver and settle a given amount of money in one currency, in exchange for a given amount in another currency at an agreed rate of exchange"
  {:cmns-av/abbreviation #voc/lstr "FX derivative@en",
   :cmns-av/synonym [#voc/lstr "forex derivative@en"
                     #voc/lstr "foreign exchange derivative@en"],
   :db/ident :fibo-der-drc-cur/CurrencyDerivative,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/",
   :rdfs/label #voc/lstr "currency derivative@en",
   :rdfs/subClassOf [:fibo-fbc-fi-fi/CurrencyInstrument
                     :fibo-der-rtd-rtd/RateBasedDerivativeInstrument
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-acc-cur/Currency,
                      :owl/onProperty :fibo-der-drc-cur/hasBuyingCurrency,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom
                      :fibo-der-rtd-rtd/ForeignExchangeRateObservable,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-acc-cur/Currency,
                      :owl/onProperty :fibo-der-drc-cur/hasSellingCurrency,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-cur/CurrencyDerivative],
   :skos/definition
   #voc/lstr
    "agreement to deliver and settle a given amount of money in one currency, in exchange for a given amount in another currency at an agreed rate of exchange@en"})

(def CurrencyForward
  "agreement to deliver and settle a given amount of money in one currency, in exchange for a given amount in another currency, at an agreed date in the future and at an agreed rate of exchange"
  {:cmns-av/synonym [#voc/lstr "foreign exchange forward@en"
                     #voc/lstr "FX forward@en"],
   :db/ident :fibo-der-drc-cur/CurrencyForward,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/",
   :rdfs/label #voc/lstr "currency forward@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-der-drc-cur/hasForwardExchangeRate,
                      :owl/someValuesFrom :fibo-fnd-acc-cur/ExchangeRate,
                      :rdf/type :owl/Restriction}
                     :fibo-der-drc-ff/Forward
                     :fibo-der-drc-cur/CurrencyDerivative
                     :fibo-der-drc-cur/CurrencyForward
                     {:owl/onProperty :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom
                      :fibo-der-rtd-rtd/ForeignExchangeRateObservable,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fi-fi/CurrencyInstrument
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-acc-cur/Currency,
                      :owl/onProperty :fibo-der-drc-cur/hasBuyingCurrency,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-acc-cur/Currency,
                      :owl/onProperty :fibo-der-drc-cur/hasSellingCurrency,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-rtd-rtd/RateBasedDerivativeInstrument],
   :skos/definition
   #voc/lstr
    "agreement to deliver and settle a given amount of money in one currency, in exchange for a given amount in another currency, at an agreed date in the future and at an agreed rate of exchange@en"})

(def CurrencyForwardOutright
  "forward contract in a foreign exchange market that locks in the price at which an entity must buy or sell a currency on a future date"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "The holders of a currency forward are obligated to buy or sell the currency at a specified price, at a specified quantity and on a specified future date. These contracts cannot be transferred. Jan 10 Review Notes Outright Forward is the term for the professional markets. Spot + Swap where Swap is 2 simultaneous transactions.@en",
   :cmns-av/synonym [#voc/lstr "forward outright@en"
                     #voc/lstr "outright forward currency transaction@en"],
   :db/ident :fibo-der-drc-cur/CurrencyForwardOutright,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/",
   :rdfs/label #voc/lstr "currency forward outright@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-col/hasPart,
     :owl/someValuesFrom :fibo-der-drc-cur/CurrencySwap,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-col/hasPart,
     :owl/someValuesFrom :fibo-der-drc-cur/CurrencySpotContract,
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-cur/CurrencyForward
    :fibo-der-drc-cur/CurrencyForwardOutright
    :fibo-der-drc-cur/CurrencyDerivative
    :fibo-der-drc-ff/Forward
    {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
     :owl/someValuesFrom :fibo-der-rtd-rtd/ForeignExchangeRateObservable,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/CurrencyInstrument
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fnd-acc-cur/Currency,
     :owl/onProperty :fibo-der-drc-cur/hasBuyingCurrency,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fnd-acc-cur/Currency,
     :owl/onProperty :fibo-der-drc-cur/hasSellingCurrency,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-cur/hasForwardExchangeRate,
     :owl/someValuesFrom :fibo-fnd-acc-cur/ExchangeRate,
     :rdf/type           :owl/Restriction}
    :fibo-der-rtd-rtd/RateBasedDerivativeInstrument],
   :skos/definition
   #voc/lstr
    "forward contract in a foreign exchange market that locks in the price at which an entity must buy or sell a currency on a future date@en"})

(def CurrencyOption
  "option giving the buyer (holder) the right, but not the obligation, to buy or sell currency at a specified exchange rate during a specified period of time"
  {:cmns-av/abbreviation #voc/lstr "FX option@en",
   :cmns-av/explanatoryNote
   #voc/lstr
    "For this right, a premium is paid to the broker, which will vary depending on the number of contracts purchased. Currency options are one of the best ways for corporations or individuals to hedge against adverse movements in exchange rates. Investors can hedge against foreign currency risk by purchasing a currency option put or call. For example, assume that an investor believes that the USD/EUR rate is going to increase from 0.80 to 0.90 (meaning that it will become more expensive for a European investor to buy U.S dollars). In this case, the investor would want to buy a call option on USD/EUR so that he or she could stand to gain from an increase in the exchange rate (or the USD rise).@en",
   :cmns-av/synonym [#voc/lstr "forex option@en"
                     #voc/lstr "foreign exchange option@en"],
   :db/ident :fibo-der-drc-cur/CurrencyOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/",
   :rdfs/label #voc/lstr "currency option@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-opt/hasStrikeRate,
                      :owl/someValuesFrom :fibo-fnd-acc-cur/ExchangeRate,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-opt/VanillaOption
                     :fibo-der-drc-cur/CurrencyDerivative
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-ind-fx-fx/CurrencySpotBuyRate,
                      :owl/onProperty :fibo-fbc-fi-fi/hasUnderlier,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-cur/CurrencyOption
                     {:owl/onProperty :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom
                      :fibo-der-rtd-rtd/ForeignExchangeRateObservable,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fi-fi/CurrencyInstrument
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-acc-cur/Currency,
                      :owl/onProperty :fibo-der-drc-cur/hasBuyingCurrency,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-acc-cur/Currency,
                      :owl/onProperty :fibo-der-drc-cur/hasSellingCurrency,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-rtd-rtd/RateBasedDerivativeInstrument],
   :skos/definition
   #voc/lstr
    "option giving the buyer (holder) the right, but not the obligation, to buy or sell currency at a specified exchange rate during a specified period of time@en"})

(def CurrencySpotContract
  "foreign-exchange contract for immediate delivery"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Spot rates represent the price that a buyer expects to pay for a foreign currency in another currency at the time of the quote. Though the spot exchange rate is said to be settled immediately, the globally accepted settlement cycle for foreign-exchange contracts is two days. Foreign-exchange contracts are therefore settled on the second day after the day the deal is made.@en",
   :cmns-av/synonym #voc/lstr "foreign exchange spot contract@en",
   :db/ident :fibo-der-drc-cur/CurrencySpotContract,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/",
   :rdfs/label #voc/lstr "currency spot contract@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-cur/hasSpotExchangeRate,
                      :owl/someValuesFrom :fibo-fnd-acc-cur/ExchangeRate,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/SpotContract
                     :fibo-fbc-fi-fi/CurrencyInstrument
                     :fibo-der-drc-cur/CurrencySpotContract],
   :skos/definition #voc/lstr
                     "foreign-exchange contract for immediate delivery@en"})

(def CurrencySpotForwardSwap
  "foreign exchange agreement between two parties involving an exchange of two currencies at agreed fixed rates: a) on the spot settlement date and b) a reverse exchange on a later specified date"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15@en",
   :db/ident :fibo-der-drc-cur/CurrencySpotForwardSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/",
   :rdfs/label #voc/lstr "currency spot forward swap@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-der-drc-swp/hasLeg,
     :owl/someValuesFrom :fibo-der-drc-cur/CurrencySpotContract,
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-cur/CurrencySwap
    :fibo-der-drc-cur/CurrencySpotForwardSwap
    :fibo-der-drc-cur/CurrencyDerivative
    :fibo-der-drc-swp/RatesSwap
    {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
     :owl/someValuesFrom :fibo-der-rtd-rtd/ForeignExchangeRateObservable,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/CurrencyInstrument
    {:owl/onProperty     :fibo-der-drc-swp/hasLeg,
     :owl/someValuesFrom :fibo-der-drc-cur/CurrencyForward,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fnd-acc-cur/Currency,
     :owl/onProperty :fibo-der-drc-cur/hasBuyingCurrency,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fnd-acc-cur/Currency,
     :owl/onProperty :fibo-der-drc-cur/hasSellingCurrency,
     :rdf/type       :owl/Restriction}
    :fibo-der-rtd-rtd/RateBasedDerivativeInstrument],
   :skos/definition
   #voc/lstr
    "foreign exchange agreement between two parties involving an exchange of two currencies at agreed fixed rates: a) on the spot settlement date and b) a reverse exchange on a later specified date@en"})

(def CurrencySwap
  "foreign exchange agreement between two parties to exchange a given amount of one currency for another currency for spot delivery or for forward delivery at an agreed rate after a specified period of time"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15@en",
   :db/ident :fibo-der-drc-cur/CurrencySwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/",
   :rdfs/label #voc/lstr "currency swap@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-swp/hasLeg,
                      :owl/someValuesFrom :fibo-der-drc-cur/CurrencyForward,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-swp/RatesSwap
                     :fibo-der-drc-cur/CurrencyDerivative
                     :fibo-der-drc-cur/CurrencySwap
                     {:owl/onProperty :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom
                      :fibo-der-rtd-rtd/ForeignExchangeRateObservable,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fi-fi/CurrencyInstrument
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-acc-cur/Currency,
                      :owl/onProperty :fibo-der-drc-cur/hasBuyingCurrency,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-acc-cur/Currency,
                      :owl/onProperty :fibo-der-drc-cur/hasSellingCurrency,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-rtd-rtd/RateBasedDerivativeInstrument],
   :skos/definition
   #voc/lstr
    "foreign exchange agreement between two parties to exchange a given amount of one currency for another currency for spot delivery or for forward delivery at an agreed rate after a specified period of time@en",
   :skos/note
   #voc/lstr
    "In the case of a 'forward-forward' swap, both legs will be of type CurrencyFoward.@en"})

(def CurrencyVolatilityOption
  "currency option whose underlying asset is based on the volatility of a foreign exchange rate"
  {:db/ident :fibo-der-drc-cur/CurrencyVolatilityOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/",
   :rdfs/label #voc/lstr "currency volatility option@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
     :owl/someValuesFrom :fibo-ind-fx-fx/CurrencySpotVolatility,
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-cur/CurrencyOption
    :fibo-der-drc-cur/CurrencyVolatilityOption
    :fibo-der-drc-cur/CurrencyDerivative
    :fibo-der-drc-opt/VanillaOption
    {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
     :owl/someValuesFrom :fibo-der-rtd-rtd/ForeignExchangeRateObservable,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/CurrencyInstrument
    {:owl/onProperty     :fibo-der-drc-opt/hasStrikeRate,
     :owl/someValuesFrom :fibo-fnd-acc-cur/ExchangeRate,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fnd-acc-cur/Currency,
     :owl/onProperty :fibo-der-drc-cur/hasBuyingCurrency,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fnd-acc-cur/Currency,
     :owl/onProperty :fibo-der-drc-cur/hasSellingCurrency,
     :rdf/type       :owl/Restriction}
    :fibo-der-rtd-rtd/RateBasedDerivativeInstrument
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-ind-fx-fx/CurrencySpotBuyRate,
     :owl/onProperty :fibo-fbc-fi-fi/hasUnderlier,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "currency option whose underlying asset is based on the volatility of a foreign exchange rate@en"})

(def hasBuyingCurrency
  "indicates the currency purchased with respect to a foreign exchange derivative"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Note that the buying and selling currencies could be the same under certain circumstances.@en",
   :db/ident :fibo-der-drc-cur/hasBuyingCurrency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-cur/CurrencyDerivative,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/",
   :rdfs/label #voc/lstr "has buying currency@en",
   :rdfs/range :fibo-fnd-acc-cur/Currency,
   :rdfs/subPropertyOf [:fibo-fnd-acc-cur/hasDealtCurrency
                        :fibo-der-drc-cur/hasBuyingCurrency],
   :skos/definition
   #voc/lstr
    "indicates the currency purchased with respect to a foreign exchange derivative@en"})

(def hasForwardExchangeRate
  "rate of exchange between two currencies as specified in a forward contract"
  {:db/ident :fibo-der-drc-cur/hasForwardExchangeRate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-cur/CurrencyForward,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/",
   :rdfs/label #voc/lstr "has forward exchange rate@en",
   :rdfs/range :fibo-fnd-acc-cur/ExchangeRate,
   :rdfs/subPropertyOf [:fibo-fnd-qt-qtu/hasQuantityValue
                        :fibo-der-drc-cur/hasForwardExchangeRate],
   :skos/definition
   #voc/lstr
    "rate of exchange between two currencies as specified in a forward contract@en"})

(def hasSellingCurrency
  "indicates the currency sold with respect to a foreign exchange derivative"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Note that the buying and selling currencies could be the same under certain circumstances.@en",
   :db/ident :fibo-der-drc-cur/hasSellingCurrency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-cur/CurrencyDerivative,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/",
   :rdfs/label #voc/lstr "has selling currency@en",
   :rdfs/range :fibo-fnd-acc-cur/Currency,
   :rdfs/subPropertyOf [:fibo-fnd-acc-cur/hasBaseCurrency
                        :fibo-der-drc-cur/hasSellingCurrency],
   :skos/definition
   #voc/lstr
    "indicates the currency sold with respect to a foreign exchange derivative@en"})

(def hasSpotExchangeRate
  "rate of exchange between two currencies as specified in a spot contract"
  {:db/ident :fibo-der-drc-cur/hasSpotExchangeRate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-cur/CurrencySpotContract,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/",
   :rdfs/label #voc/lstr "has spot exchange rate@en",
   :rdfs/range :fibo-fnd-acc-cur/ExchangeRate,
   :rdfs/subPropertyOf [:fibo-fnd-qt-qtu/hasQuantityValue
                        :fibo-der-drc-cur/hasSpotExchangeRate],
   :skos/definition
   #voc/lstr
    "rate of exchange between two currencies as specified in a spot contract@en"})