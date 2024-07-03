(ns net.wikipunk.rdf.fibo-der-drc-ff
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/FuturesAndForwards/",
   :dcterms/abstract
   "This ontology defines concepts for derivative contracts, including forwards and futures, representing a commitment to sell or purchase the underlier at a defined price at a given time in the future.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-qtu" "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-fct-pub"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
    "fibo-der-drc-bsc"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
    "fibo-der-drc-ff"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
    "fibo-der-drc-opt"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
    "fibo-der-drc-swp"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/",
    "fibo-der-sbd-sbd"
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
    "fibo-fbc-fct-mkt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
    "fibo-fbc-fct-ra"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fbc-fi-ip"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-ei-ei"
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/",
    "fibo-ind-mkt-bas"
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/",
    "fibo-sec-dbt-bnd"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/",
    "fibo-sec-dbt-dbti"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/",
    "fibo-sec-dbt-tstd"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt/",
    "fibo-sec-eq-eq"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
    "fibo-sec-sec-bsk"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Baskets/",
    "fibo-sec-sec-lst"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/MarketIndices/BasketIndices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Equities/EquityInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/Options/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/Baskets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/Swaps/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/FunctionalEntities/Publishers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/TradedShortTermDebt/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/InstrumentPricing/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/EconomicIndicators/EconomicIndicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/Markets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/Bonds/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/DebtInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Agreements/Contracts/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/FuturesAndForwards/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-der-drc-ff",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Futures and Forwards Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards.rdf version of this ontology was modified to better integrate adjustment method."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards.rdf version of this ontology was modified to eliminate references to hasContractSize, clean up unnecessary restrictions on Future and Forward, and eliminate the redundant listing class."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, and to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards.rdf version of this ontology was modified to incorporate the concepts that were originally in a separate, very small equity forwards ontology."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate and to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards.rdf version of this ontology was modified to move designated contract market to the markets ontology in FBC and revise the definition of a CurrencyFuture to eliminate an unnecessary superclass and restriction due to the release of CurrencyContracts and to revise the definition of a dividend future to reference the listed share that it tracks rather than the dividend itself."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"})

(def BasketFuture
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-ff/BasketFuture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "basket future"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                       :owl/someValuesFrom :fibo-sec-sec-bsk/MixedBasket,
                       :rdf/type           :owl/Restriction}
                      :fibo-der-drc-ff/FinancialFuture},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "futures contract whose underlying asset is a basket of securities and/or indices"}})

(def BondFuture
  {:db/ident :fibo-der-drc-ff/BondFuture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bond future"},
   :rdfs/subClassOf #{:fibo-der-drc-ff/DebtInstrumentFuture
                      {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                       :owl/someValuesFrom :fibo-sec-dbt-bnd/Bond,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "futures contract whose underlying asset is at least one bond"}})

(def CurrencyFuture
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :cmns-av/synonym #{{:rdf/language "en",
                       :rdf/value    "foreign exchange future"}
                      {:rdf/language "en",
                       :rdf/value    "forex future"}},
   :db/ident :fibo-der-drc-ff/CurrencyFuture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "currency future"},
   :rdfs/subClassOf :fibo-der-drc-ff/FinancialFuture,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "futures contract whose underlying asset is an agreement to exchange a specified amount of one currency for another at some point in the future based on pricing stated in the contract"}})

(def DebtInstrumentFuture
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-ff/DebtInstrumentFuture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt instrument future"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/DebtInstrument,
                       :rdf/type           :owl/Restriction}
                      :fibo-der-sbd-sbd/DebtInstrumentDerivative
                      :fibo-der-drc-ff/FinancialFuture},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "futures contract whose underlying asset is at least one debt instrument"}})

(def DividendAdjustmentPeriod
  {:db/ident :fibo-der-drc-ff/DividendAdjustmentPeriod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dividend adjustment period"},
   :rdfs/subClassOf :cmns-dt/DatePeriod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "date period used to calculate the difference, if any between an anticipated dividend and the actual dividend distributed in that period"}})

(def DividendFuture
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-ff/DividendFuture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dividend future"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                       :owl/someValuesFrom :fibo-sec-eq-eq/ListedShare,
                       :rdf/type           :owl/Restriction}
                      :fibo-der-sbd-sbd/EquityDerivative
                      :fibo-der-drc-ff/FinancialFuture},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "futures contract whose underlying asset is at least one stock dividend"}})

(def EquityForward
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-ff/EquityForward,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity forward"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-der-drc-ff/hasMethodOfAdjustment,
      :owl/someValuesFrom :fibo-der-drc-ff/ForwardContractAdjustmentMethod,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
      :owl/someValuesFrom {:owl/unionOf [:fibo-ind-mkt-bas/BasketOfEquities
                                         :fibo-sec-eq-eq/ListedShare
                                         :fibo-ind-mkt-bas/EquityIndex
                                         :fibo-der-drc-ff/EquityFuture
                                         :fibo-der-drc-opt/EquityOption],
                           :rdf/type    :owl/Class},
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-agr-ctr/hasContractualElement,
      :owl/someValuesFrom :fibo-fbc-pas-fpas/SettlementTerms,
      :rdf/type           :owl/Restriction} :fibo-der-drc-ff/Forward
     {:owl/onProperty     :fibo-der-drc-ff/hasDividendAdjustmentPeriod,
      :owl/someValuesFrom :fibo-der-drc-ff/DividendAdjustmentPeriod,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "forward contract to buy or sell the underlying equity stock, equity index, basket of equity stock, equity futures contract, or equity option at a specified future date at the price specified at the outset of the contract"}})

(def EquityFuture
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-ff/EquityFuture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity future"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                       :owl/someValuesFrom :fibo-sec-eq-eq/ListedShare,
                       :rdf/type           :owl/Restriction}
                      :fibo-der-sbd-sbd/EquityDerivative
                      :fibo-der-drc-ff/FinancialFuture},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "futures contract whose underlying asset is at least one equity security, specifically a publicly issued and traded share"}})

(def FinancialFuture
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-ff/FinancialFuture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "financial future"},
   :rdfs/subClassOf :fibo-fbc-fi-fi/Future,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "futures contract based on underlying assets excluding commodities"}})

(def Forward
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Unlike futures contracts (which are processed through a clearing firm), forward contracts are non-standardized. Further, the two parties must bear each other's credit risk, which is not the case with a futures contract. Also, since the contracts are not exchange traded, there is no mark-to-market requirement, which allows a buyer to avoid almost all capital outflow initially (though some counterparties might set collateral requirements). The forward price makes the forward contract have no value when the contract is written. However, if the value of the underlying commodity changes, the value of the forward contract becomes positive or negative, depending on the position held. Forwards are priced in a manner similar to futures. Like in the case of a futures contract, the first step in pricing a forward is to add the spot price to the cost of carry (interest forgone, convenience yield, storage costs and interest/dividend received on the underlying). Unlike a futures contract though, the price may also include a premium for counterparty credit risk, and the fact that there is not daily marking to market process to minimize default risk. If there is no allowance for these credit risks, then the forward price will equal the futures price."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "forward contract"},
   :db/ident :fibo-der-drc-ff/Forward,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "forward"},
   :rdfs/subClassOf #{:fibo-der-drc-bsc/OverTheCounterInstrument
                      :fibo-fbc-fi-fi/DerivativeInstrument},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "derivative instrument that is privately negotiated between parties to buy the underlier at a specified future date at the price specified in the contract"}})

(def ForwardContractAdjustmentMethod
  {:db/ident :fibo-der-drc-ff/ForwardContractAdjustmentMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "forward contract adjustment method"},
   :rdfs/subClassOf :fibo-fnd-gao-obj/Strategy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "method by which adjustments will be made to the contract should one or more of a number of extraordinary events occur"}})

(def FutureOnFuture
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-ff/FutureOnFuture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "future on future"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/Future,
                       :rdf/type           :owl/Restriction}
                      :fibo-der-drc-ff/FinancialFuture},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "futures contract whose underlying asset is at least one (other) futures contract"}})

(def FutureOnOption
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-ff/FutureOnOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "future on option"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/Option,
                       :rdf/type           :owl/Restriction}
                      :fibo-der-drc-ff/FinancialFuture},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "futures contract whose underlying asset is at least one option contract"}})

(def FutureOnSwap
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-ff/FutureOnSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "future on swap"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                       :owl/someValuesFrom :fibo-der-drc-swp/Swap,
                       :rdf/type           :owl/Restriction}
                      :fibo-der-drc-ff/FinancialFuture},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "futures contract whose underlying asset is at least one swap contract"}})

(def IndexFuture
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "For each index there may be a different multiple for determining the price of the futures contract."},
   :db/ident :fibo-der-drc-ff/IndexFuture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "index future"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
      :owl/someValuesFrom {:owl/unionOf [:fibo-ind-ei-ei/EconomicIndicator
                                         :fibo-ind-mkt-bas/ReferenceIndex],
                           :rdf/type    :owl/Class},
      :rdf/type           :owl/Restriction} :fibo-der-drc-ff/FinancialFuture},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "futures contract whose underlying asset is at least one reference index or economic indicator"}})

(def InterestRateFuture
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Most interest rate futures that trade on American exchanges use U.S. Treasury securities, such as Treasury bills, Treasury bonds, certificates of deposit, Treasury notes, and Ginnie Mae securities, as the underlying asset."},
   :db/ident :fibo-der-drc-ff/InterestRateFuture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "interest rate future"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-fbc-fi-fi/hasUnderlier,
                       :owl/someValuesFrom
                       {:owl/unionOf [:fibo-fbc-fi-fi/CashInstrument
                                      :fibo-sec-dbt-dbti/FixedIncomeSecurity],
                        :rdf/type    :owl/Class},
                       :rdf/type :owl/Restriction}
                      :fibo-der-drc-ff/FinancialFuture},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "futures contract with an interest-bearing instrument as the underlying asset"}})

(def MoneyMarketFuture
  {:db/ident :fibo-der-drc-ff/MoneyMarketFuture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "money market future"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-fbc-fi-fi/hasUnderlier,
                       :owl/someValuesFrom
                       :fibo-sec-dbt-tstd/MoneyMarketInstrument,
                       :rdf/type :owl/Restriction}
                      :fibo-der-drc-ff/DebtInstrumentFuture},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "futures contract with a money market instrument as the underlying asset"}})

(def StandardizedFuturesListingTerms
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Individual listings will take on these standard terms but they are not contractual terms of the futures contract, they are facts about that listing on that exchange."},
   :db/ident :fibo-der-drc-ff/StandardizedFuturesListingTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "standardized futures listing terms"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-be-fct-pub/hasPublisher,
      :owl/someValuesFrom :fibo-fbc-fct-mkt/DesignatedContractMarket,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
      :owl/someValuesFrom :fibo-sec-sec-lst/Listing,
      :rdf/type           :owl/Restriction} :fibo-fbc-fi-fi/StandardizedTerms
     :fibo-der-drc-bsc/DerivativeTerms},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "contract terms established by a derivatives exchange that apply to any listing of a futures contract on that exchange."}})

(def StandardizedFuturesTerms
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Standard symbology for the commodities are standardized by the exchanges as part of their standard contracts, for example trading in standard bushels, commonly defined kinds of oil and so on. These give the units in which lot sizes are described and defined."},
   :db/ident :fibo-der-drc-ff/StandardizedFuturesTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "standardized futures terms"},
   :rdfs/subClassOf #{:fibo-fbc-fi-fi/StandardizedTerms
                      :fibo-der-drc-bsc/DerivativeTerms
                      {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/Future,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fbc-fct-ra/specifies,
                       :owl/someValuesFrom :fibo-fbc-pas-fpas/SettlementTerms,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "contract terms established by a derivatives exchange that apply to any futures contract traded on that exchange"}})

(def hasConversionFactor
  {:db/ident :fibo-der-drc-ff/hasConversionFactor,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-ff/BondFuture,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has conversion factor"},
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :cmns-qtu/hasNumericValue,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the price of the delivered bond/note ($1 par value) to yield a fixed rate. The conversion factor is used to calculate a final delivery price."}})

(def hasDividendAdjustmentPeriod
  {:db/ident :fibo-der-drc-ff/hasDividendAdjustmentPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-ff/EquityForward,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has dividend adjustment period"},
   :rdfs/range :fibo-der-drc-ff/DividendAdjustmentPeriod,
   :rdfs/subPropertyOf :cmns-dt/hasDatePeriod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates at least one date period used to calculate the deviation between an anticipated/expected dividend and the actual dividend issued during that period"}})

(def hasMethodOfAdjustment
  {:db/ident :fibo-der-drc-ff/hasMethodOfAdjustment,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-ff/EquityForward,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has method of adjustment"},
   :rdfs/range :fibo-der-drc-ff/ForwardContractAdjustmentMethod,
   :rdfs/subPropertyOf :fibo-fnd-gao-obj/hasStrategy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the method used to address any changes to the contract based on events that occur over the contract lifecycle"}})

(def hasMultiple
  {:db/ident :fibo-der-drc-ff/hasMultiple,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-ff/IndexFuture,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has multiple"},
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :cmns-qtu/hasNumericValue,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the multiple for determining the price of the futures contract in relation to the underlying index rate"}})

(def urn:uuid:09948017-bb44-5959-88cb-1e9cda31cb38
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines concepts for derivative contracts, including forwards and futures, representing a commitment to sell or purchase the underlier at a defined price at a given time in the future.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/MarketIndices/BasketIndices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Equities/EquityInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/Options/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/Baskets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/Swaps/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/FunctionalEntities/Publishers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/TradedShortTermDebt/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/InstrumentPricing/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/EconomicIndicators/EconomicIndicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/Markets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/Bonds/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/DebtInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Agreements/Contracts/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/FuturesAndForwards/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Futures and Forwards Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards.rdf version of this ontology was modified to better integrate adjustment method."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards.rdf version of this ontology was modified to eliminate references to hasContractSize, clean up unnecessary restrictions on Future and Forward, and eliminate the redundant listing class."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, and to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards.rdf version of this ontology was modified to incorporate the concepts that were originally in a separate, very small equity forwards ontology."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate and to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards.rdf version of this ontology was modified to move designated contract market to the markets ontology in FBC and revise the definition of a CurrencyFuture to eliminate an unnecessary superclass and restriction due to the release of CurrencyContracts and to revise the definition of a dividend future to reference the listed share that it tracks rather than the dividend itself."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"})