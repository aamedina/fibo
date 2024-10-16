(ns net.wikipunk.rdf.fibo-der-drc-cur
  {:cmns-av/copyright #{"Copyright (c) 2015-2024 Object Management Group, Inc."
                        "Copyright (c) 2015-2024 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/DER/DerivativesContracts/CurrencyContracts/",
   :dcterms/abstract
   "This ontology defines concepts common to currency spot contracts and foreign exchange derivatives (forwards, options and swaps).",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-qtu" "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-fct-pub"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
    "fibo-der-drc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/",
    "fibo-der-drc-ff"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
    "fibo-der-drc-opt"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
    "fibo-der-drc-swp"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/",
    "fibo-fbc-fct-mkt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-fx-fx"
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/DER/DerivativesContracts/Swaps/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/DER/DerivativesContracts/FuturesAndForwards/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/FunctionalEntities/Publishers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/DER/DerivativesContracts/Options/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/IND/ForeignExchange/ForeignExchange/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/Markets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/DER/DerivativesContracts/CurrencyContracts/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-der-drc-cur",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Currency Contracts Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts.rdf version of this ontology was modified to eliminate a reference to a deprecated property."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts.rdf version of this ontology was modified to simplify the currency derivative class hierarchy (DER-126)."
     "The https://spec.edmcouncil.org/fibo/ontology/DerivativesContracts/CurrencyContracts/ version of this ontology was modified to reflect the addition of the concept of a rates swap and the corresponding rate-based leg to the Swaps ontology, as well as the concept of a spot forward currency swap, to facilitate mapping to the CFI standard."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate, and to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts.rdf version of this ontology was modified to move properties related to buying and selling currency to a higher level in the ontology, to be available on all currency instruments (DER-143)."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/"})

(def CurrencyDerivative
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "FX derivative"},
   :cmns-av/synonym #{{:rdf/language "en",
                       :rdf/value    "foreign exchange derivative"}
                      {:rdf/language "en",
                       :rdf/value    "forex derivative"}},
   :db/ident :fibo-der-drc-cur/CurrencyDerivative,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "currency derivative"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-ind-fx-fx/hasExchangeRateQuotationSource,
      :owl/someValuesFrom {:owl/unionOf
                           [:fibo-be-fct-pub/Publisher
                            :fibo-fbc-pas-fpas/FinancialServiceProvider
                            :fibo-fbc-fct-mkt/Exchange],
                           :rdf/type :owl/Class},
      :rdf/type           :owl/Restriction} :fibo-fbc-fi-fi/CurrencyInstrument
     :fibo-fbc-fi-fi/DerivativeInstrument},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "agreement to deliver and settle a given amount of money in one currency, in exchange for a given amount in another currency at an agreed rate of exchange"}})

(def CurrencyForward
  {:cmns-av/synonym #{{:rdf/language "en",
                       :rdf/value    "FX forward"}
                      {:rdf/language "en",
                       :rdf/value    "foreign exchange forward"}},
   :db/ident :fibo-der-drc-cur/CurrencyForward,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "currency forward"},
   :rdfs/subClassOf #{:fibo-der-drc-cur/CurrencyDerivative
                      :fibo-der-drc-ff/Forward
                      {:owl/onProperty :fibo-der-drc-cur/hasForwardExchangeRate,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/ExchangeRate,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "agreement to deliver and settle a given amount of money in one currency, in exchange for a given amount in another currency, at an agreed date in the future and at an agreed rate of exchange"}})

(def CurrencyForwardOutright
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The holders of a currency forward are obligated to buy or sell the currency at a specified price, at a specified quantity and on a specified future date. These contracts cannot be transferred. Jan 10 Review Notes Outright Forward is the term for the professional markets. Spot + Swap where Swap is 2 simultaneous transactions."},
   :cmns-av/synonym #{{:rdf/language "en",
                       :rdf/value    "outright forward currency transaction"}
                      {:rdf/language "en",
                       :rdf/value    "forward outright"}},
   :db/ident :fibo-der-drc-cur/CurrencyForwardOutright,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "currency forward outright"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-col/hasPart,
      :owl/someValuesFrom :fibo-der-drc-cur/CurrencySpotContract,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-col/hasPart,
      :owl/someValuesFrom :fibo-der-drc-cur/CurrencySwap,
      :rdf/type           :owl/Restriction} :fibo-der-drc-cur/CurrencyForward},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "forward contract in a foreign exchange market that locks in the price at which an entity must buy or sell a currency on a future date"}})

(def CurrencyOption
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "FX option"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "For this right, a premium is paid to the broker, which will vary depending on the number of contracts purchased. Currency options are one of the best ways for corporations or individuals to hedge against adverse movements in exchange rates. Investors can hedge against foreign currency risk by purchasing a currency option put or call. For example, assume that an investor believes that the USD/EUR rate is going to increase from 0.80 to 0.90 (meaning that it will become more expensive for a European investor to buy U.S dollars). In this case, the investor would want to buy a call option on USD/EUR so that he or she could stand to gain from an increase in the exchange rate (or the USD rise)."},
   :cmns-av/synonym #{{:rdf/language "en",
                       :rdf/value    "foreign exchange option"}
                      {:rdf/language "en",
                       :rdf/value    "forex option"}},
   :db/ident :fibo-der-drc-cur/CurrencyOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "currency option"},
   :rdfs/subClassOf #{:fibo-der-drc-cur/CurrencyDerivative
                      :fibo-der-drc-opt/VanillaOption
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-ind-fx-fx/CurrencySpotBuyRate,
                       :owl/onProperty :fibo-fbc-fi-fi/hasUnderlier,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :fibo-der-drc-opt/hasStrikeRate,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/ExchangeRate,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "option giving the buyer (holder) the right, but not the obligation, to buy or sell currency at a specified exchange rate during a specified period of time"}})

(def CurrencySpotContract
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Spot rates represent the price that a buyer expects to pay for a foreign currency in another currency at the time of the quote. Though the spot exchange rate is said to be settled immediately, the globally accepted settlement cycle for foreign-exchange contracts is two days. Foreign-exchange contracts are therefore settled on the second day after the day the deal is made."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "foreign exchange spot contract"},
   :db/ident :fibo-der-drc-cur/CurrencySpotContract,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "currency spot contract"},
   :rdfs/subClassOf #{:fibo-fbc-fi-fi/SpotContract
                      {:owl/onProperty :fibo-der-drc-cur/hasSpotExchangeRate,
                       :owl/someValuesFrom :fibo-ind-fx-fx/QuotedExchangeRate,
                       :rdf/type :owl/Restriction}
                      :fibo-fbc-fi-fi/CurrencyInstrument},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "foreign-exchange contract for immediate delivery"}})

(def CurrencySpotForwardSwap
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15"},
   :db/ident :fibo-der-drc-cur/CurrencySpotForwardSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "currency spot forward swap"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-der-drc-swp/hasLeg,
      :owl/someValuesFrom :fibo-der-drc-cur/CurrencySpotContract,
      :rdf/type           :owl/Restriction} :fibo-der-drc-cur/CurrencySwap},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "foreign exchange agreement between two parties involving an exchange of two currencies at agreed fixed rates: a) on the spot settlement date and b) a reverse exchange on a later specified date"}})

(def CurrencySwap
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15"},
   :db/ident :fibo-der-drc-cur/CurrencySwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "currency swap"},
   :rdfs/subClassOf #{:fibo-der-drc-cur/CurrencyDerivative
                      :fibo-der-drc-swp/Swap
                      {:owl/onProperty     :fibo-der-drc-swp/hasLeg,
                       :owl/someValuesFrom :fibo-der-drc-cur/CurrencyForward,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "foreign exchange agreement between two parties to exchange a given amount of one currency for another currency for spot delivery or for forward delivery at an agreed rate after a specified period of time"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "In the case of a 'forward-forward' swap, both legs will be of type CurrencyFoward."}})

(def CurrencyVolatilityOption
  {:db/ident :fibo-der-drc-cur/CurrencyVolatilityOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "currency volatility option"},
   :rdfs/subClassOf #{:fibo-der-drc-cur/CurrencyOption
                      {:owl/onProperty :fibo-fbc-fi-fi/hasUnderlier,
                       :owl/someValuesFrom
                       :fibo-ind-fx-fx/CurrencySpotVolatility,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "currency option whose underlying asset is based on the volatility of a foreign exchange rate"}})

(def hasBuyingCurrency
  {:db/ident :fibo-der-drc-cur/hasBuyingCurrency,
   :owl/deprecated true,
   :owl/equivalentProperty :fibo-fbc-fi-fi/hasBuyingCurrency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/"}})

(def hasForwardExchangeRate
  {:db/ident :fibo-der-drc-cur/hasForwardExchangeRate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-cur/CurrencyForward,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has forward exchange rate"},
   :rdfs/range :fibo-fnd-acc-cur/ExchangeRate,
   :rdfs/subPropertyOf :cmns-qtu/hasQuantityValue,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "rate of exchange between two currencies as specified in a forward contract"}})

(def hasSellingCurrency
  {:db/ident :fibo-der-drc-cur/hasSellingCurrency,
   :owl/deprecated true,
   :owl/equivalentProperty :fibo-fbc-fi-fi/hasSellingCurrency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/"}})

(def hasSpotExchangeRate
  {:db/ident :fibo-der-drc-cur/hasSpotExchangeRate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has spot exchange rate"},
   :rdfs/range :fibo-ind-fx-fx/QuotedExchangeRate,
   :rdfs/subPropertyOf :fibo-ind-fx-fx/hasQuotedExchangeRate,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "rate of exchange between two currencies as specified as of some date and time as quoted by a specific source, typically for a spot contract"}})

(def urn:uuid:4aff83f8-e4aa-507b-b4f9-8710ac256e0d
  {:cmns-av/copyright #{"Copyright (c) 2015-2024 Object Management Group, Inc."
                        "Copyright (c) 2015-2024 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines concepts common to currency spot contracts and foreign exchange derivatives (forwards, options and swaps).",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/DER/DerivativesContracts/Swaps/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/DER/DerivativesContracts/FuturesAndForwards/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/FunctionalEntities/Publishers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/DER/DerivativesContracts/Options/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/IND/ForeignExchange/ForeignExchange/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/Markets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/DER/DerivativesContracts/CurrencyContracts/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Currency Contracts Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts.rdf version of this ontology was modified to eliminate a reference to a deprecated property."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts.rdf version of this ontology was modified to simplify the currency derivative class hierarchy (DER-126)."
     "The https://spec.edmcouncil.org/fibo/ontology/DerivativesContracts/CurrencyContracts/ version of this ontology was modified to reflect the addition of the concept of a rates swap and the corresponding rate-based leg to the Swaps ontology, as well as the concept of a spot forward currency swap, to facilitate mapping to the CFI standard."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate, and to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts.rdf version of this ontology was modified to move properties related to buying and selling currency to a higher level in the ontology, to be available on all currency instruments (DER-143)."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/"})