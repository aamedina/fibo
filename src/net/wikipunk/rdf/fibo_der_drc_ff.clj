(ns net.wikipunk.rdf.fibo-der-drc-ff
  "This ontology defines concepts for derivative contracts, including forwards and futures, representing a commitment to sell or purchase the underlier at a defined price at a given time in the future."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 Object Management Group, Inc."
                       "Copyright (c) 2015-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
   :dcterms/abstract
   "This ontology defines concepts for derivative contracts, including forwards and futures, representing a commitment to sell or purchase the underlier at a defined price at a given time in the future.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/Bonds/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/DebtInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/Swaps/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/EconomicIndicators/EconomicIndicators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Quantities/QuantitiesAndUnits/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/GoalsAndObjectives/Objectives/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/Markets/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/InstrumentPricing/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/TradedShortTermDebt/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/Publishers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/MarketIndices/BasketIndices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesListings/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/DerivativesBasics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Equities/EquityInstruments/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/Baskets/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/Options/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/FuturesAndForwards/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
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
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
    "fibo-fnd-qt-qtu"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-der-drc-ff",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Futures and Forwards Ontology"},
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards.rdf version of this ontology was modified to move designated contract market to the markets ontology in FBC and revise the definition of a CurrencyFuture to eliminate an unnecessary superclass and restriction due to the release of CurrencyContracts and to revise the definition of a dividend future to reference the listed share that it tracks rather than the dividend itself."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards.rdf version of this ontology was modified to eliminate references to hasContractSize, clean up unnecessary restrictions on Future and Forward, and eliminate the redundant listing class."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards.rdf version of this ontology was modified to better integrate adjustment method."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards.rdf version of this ontology was modified to incorporate the concepts that were originally in a separate, very small equity forwards ontology."]})

(def BasketFuture
  "futures contract whose underlying asset is a basket of securities and/or indices"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-ff/BasketFuture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "basket future"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-bsc/hasUnderlier,
                      :owl/someValuesFrom :fibo-sec-sec-bsk/MixedBasket,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-ff/FinancialFuture],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "futures contract whose underlying asset is a basket of securities and/or indices"}})

(def BondFuture
  "futures contract whose underlying asset is at least one bond"
  {:db/ident :fibo-der-drc-ff/BondFuture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bond future"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-bsc/hasUnderlier,
                      :owl/someValuesFrom :fibo-sec-dbt-bnd/Bond,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-ff/DebtInstrumentFuture],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "futures contract whose underlying asset is at least one bond"}})

(def CurrencyFuture
  "futures contract whose underlying asset is an agreement to exchange a specified amount of one currency for another at some point in the future based on pricing stated in the contract"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :cmns-av/synonym [{:rdf/language "en",
                      :rdf/value    "forex future"}
                     {:rdf/language "en",
                      :rdf/value    "foreign exchange future"}],
   :db/ident :fibo-der-drc-ff/CurrencyFuture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "currency future"},
   :rdfs/subClassOf :fibo-der-drc-ff/FinancialFuture,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "futures contract whose underlying asset is an agreement to exchange a specified amount of one currency for another at some point in the future based on pricing stated in the contract"}})

(def DebtInstrumentFuture
  "futures contract whose underlying asset is at least one debt instrument"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-ff/DebtInstrumentFuture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt instrument future"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-bsc/hasUnderlier,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/DebtInstrument,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-sbd-sbd/DebtInstrumentDerivative
                     :fibo-der-drc-ff/FinancialFuture],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "futures contract whose underlying asset is at least one debt instrument"}})

(def DividendAdjustmentPeriod
  "date period used to calculate the difference, if any between an anticipated dividend and the actual dividend distributed in that period"
  {:db/ident :fibo-der-drc-ff/DividendAdjustmentPeriod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dividend adjustment period"},
   :rdfs/subClassOf :fibo-fnd-dt-fd/DatePeriod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "date period used to calculate the difference, if any between an anticipated dividend and the actual dividend distributed in that period"}})

(def DividendFuture
  "futures contract whose underlying asset is at least one stock dividend"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-ff/DividendFuture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dividend future"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-bsc/hasUnderlier,
                      :owl/someValuesFrom :fibo-sec-eq-eq/ListedShare,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-sbd-sbd/EquityDerivative
                     :fibo-der-drc-ff/FinancialFuture],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "futures contract whose underlying asset is at least one stock dividend"}})

(def EquityForward
  "forward contract to buy or sell the underlying equity stock, equity index, basket of equity stock, equity futures contract, or equity option at a specified future date at the price specified at the outset of the contract"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-ff/EquityForward,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity forward"},
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-der-drc-ff/hasDividendAdjustmentPeriod,
     :owl/someValuesFrom :fibo-der-drc-ff/DividendAdjustmentPeriod,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-der-drc-ff/hasMethodOfAdjustment,
     :owl/someValuesFrom :fibo-der-drc-ff/ForwardContractAdjustmentMethod,
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-ff/Forward
    {:owl/onProperty     :fibo-der-drc-bsc/hasUnderlier,
     :owl/someValuesFrom {:owl/unionOf [:fibo-ind-mkt-bas/BasketOfEquities
                                        :fibo-sec-eq-eq/ListedShare
                                        :fibo-ind-mkt-bas/EquityIndex
                                        :fibo-der-drc-ff/EquityFuture
                                        :fibo-der-drc-opt/EquityOption],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-agr-ctr/hasContractualElement,
     :owl/someValuesFrom :fibo-fbc-pas-fpas/SettlementTerms,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "forward contract to buy or sell the underlying equity stock, equity index, basket of equity stock, equity futures contract, or equity option at a specified future date at the price specified at the outset of the contract"}})

(def EquityFuture
  "futures contract whose underlying asset is at least one equity security, specifically a publicly issued and traded share"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-ff/EquityFuture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity future"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-bsc/hasUnderlier,
                      :owl/someValuesFrom :fibo-sec-eq-eq/ListedShare,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-sbd-sbd/EquityDerivative
                     :fibo-der-drc-ff/FinancialFuture],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "futures contract whose underlying asset is at least one equity security, specifically a publicly issued and traded share"}})

(def FinancialFuture
  "futures contract based on underlying assets excluding commodities"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-ff/FinancialFuture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "financial future"},
   :rdfs/subClassOf :fibo-fbc-fi-fi/Future,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "futures contract based on underlying assets excluding commodities"}})

(def Forward
  "derivative instrument that is privately negotiated between parties to buy the underlier at a specified future date at the price specified in the contract"
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
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "forward"},
   :rdfs/subClassOf [:fibo-fbc-fi-fi/DerivativeInstrument
                     :fibo-der-drc-bsc/OverTheCounterInstrument],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "derivative instrument that is privately negotiated between parties to buy the underlier at a specified future date at the price specified in the contract"}})

(def ForwardContractAdjustmentMethod
  "method by which adjustments will be made to the contract should one or more of a number of extraordinary events occur"
  {:db/ident :fibo-der-drc-ff/ForwardContractAdjustmentMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "forward contract adjustment method"},
   :rdfs/subClassOf :fibo-fnd-gao-obj/Strategy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "method by which adjustments will be made to the contract should one or more of a number of extraordinary events occur"}})

(def FutureOnFuture
  "futures contract whose underlying asset is at least one (other) futures contract"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-ff/FutureOnFuture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "future on future"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-bsc/hasUnderlier,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Future,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-ff/FinancialFuture],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "futures contract whose underlying asset is at least one (other) futures contract"}})

(def FutureOnOption
  "futures contract whose underlying asset is at least one option contract"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-ff/FutureOnOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "future on option"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-bsc/hasUnderlier,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Option,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-ff/FinancialFuture],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "futures contract whose underlying asset is at least one option contract"}})

(def FutureOnSwap
  "futures contract whose underlying asset is at least one swap contract"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-ff/FutureOnSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "future on swap"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-bsc/hasUnderlier,
                      :owl/someValuesFrom :fibo-der-drc-swp/Swap,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-ff/FinancialFuture],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "futures contract whose underlying asset is at least one swap contract"}})

(def IndexFuture
  "futures contract whose underlying asset is at least one reference index or economic indicator"
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
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "index future"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-bsc/hasUnderlier,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-ind-ei-ei/EconomicIndicator
                                            :fibo-ind-mkt-bas/ReferenceIndex],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-ff/FinancialFuture],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "futures contract whose underlying asset is at least one reference index or economic indicator"}})

(def InterestRateFuture
  "futures contract with an interest-bearing instrument as the underlying asset"
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
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "interest rate future"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-der-drc-bsc/hasUnderlier,
                      :owl/someValuesFrom
                      {:owl/unionOf [:fibo-fbc-fi-fi/CashInstrument
                                     :fibo-sec-dbt-dbti/FixedIncomeSecurity],
                       :rdf/type    :owl/Class},
                      :rdf/type :owl/Restriction}
                     :fibo-der-drc-ff/FinancialFuture],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "futures contract with an interest-bearing instrument as the underlying asset"}})

(def MoneyMarketFuture
  "futures contract with a money market instrument as the underlying asset"
  {:db/ident :fibo-der-drc-ff/MoneyMarketFuture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "money market future"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-der-drc-bsc/hasUnderlier,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-tstd/MoneyMarketInstrument,
                      :rdf/type :owl/Restriction}
                     :fibo-der-drc-ff/DebtInstrumentFuture],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "futures contract with a money market instrument as the underlying asset"}})

(def StandardizedFuturesListingTerms
  "contract terms established by a derivatives exchange that apply to any listing of a futures contract on that exchange."
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Individual listings will take on these standard terms but they are not contractual terms of the futures contract, they are facts about that listing on that exchange."},
   :db/ident :fibo-der-drc-ff/StandardizedFuturesListingTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "standardized futures listing terms"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/appliesTo,
                      :owl/someValuesFrom :fibo-sec-sec-lst/Listing,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-be-fct-pub/hasPublisher,
                      :owl/someValuesFrom
                      :fibo-fbc-fct-mkt/DesignatedContractMarket,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fi-fi/StandardizedTerms
                     :fibo-der-drc-bsc/DerivativeTerms],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "contract terms established by a derivatives exchange that apply to any listing of a futures contract on that exchange."}})

(def StandardizedFuturesTerms
  "contract terms established by a derivatives exchange that apply to any futures contract traded on that exchange"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Standard symbology for the commodities are standardized by the exchanges as part of their standard contracts, for example trading in standard bushels, commonly defined kinds of oil and so on. These give the units in which lot sizes are described and defined."},
   :db/ident :fibo-der-drc-ff/StandardizedFuturesTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "standardized futures terms"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/appliesTo,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Future,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-ra/specifies,
                      :owl/someValuesFrom :fibo-fbc-pas-fpas/SettlementTerms,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/StandardizedTerms
                     :fibo-der-drc-bsc/DerivativeTerms],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "contract terms established by a derivatives exchange that apply to any futures contract traded on that exchange"}})

(def hasConversionFactor
  "indicates the price of the delivered bond/note ($1 par value) to yield a fixed rate. The conversion factor is used to calculate a final delivery price."
  {:db/ident :fibo-der-drc-ff/hasConversionFactor,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-ff/BondFuture,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has conversion factor"},
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :fibo-fnd-qt-qtu/hasNumericValue,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the price of the delivered bond/note ($1 par value) to yield a fixed rate. The conversion factor is used to calculate a final delivery price."}})

(def hasDividendAdjustmentPeriod
  "indicates at least one date period used to calculate the deviation between an anticipated/expected dividend and the actual dividend issued during that period"
  {:db/ident :fibo-der-drc-ff/hasDividendAdjustmentPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-ff/EquityForward,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has dividend adjustment period"},
   :rdfs/range :fibo-der-drc-ff/DividendAdjustmentPeriod,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasDatePeriod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates at least one date period used to calculate the deviation between an anticipated/expected dividend and the actual dividend issued during that period"}})

(def hasMethodOfAdjustment
  "indicates the method used to address any changes to the contract based on events that occur over the contract lifecycle"
  {:db/ident :fibo-der-drc-ff/hasMethodOfAdjustment,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-ff/EquityForward,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has method of adjustment"},
   :rdfs/range :fibo-der-drc-ff/ForwardContractAdjustmentMethod,
   :rdfs/subPropertyOf :fibo-fnd-gao-obj/hasStrategy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the method used to address any changes to the contract based on events that occur over the contract lifecycle"}})

(def hasMultiple
  "indicates the multiple for determining the price of the futures contract in relation to the underlying index rate"
  {:db/ident :fibo-der-drc-ff/hasMultiple,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-ff/IndexFuture,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has multiple"},
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :fibo-fnd-qt-qtu/hasNumericValue,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the multiple for determining the price of the futures contract in relation to the underlying index rate"}})

(def ^{:private true} Future
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A futures contract obligates the buyer to pay the seller a predetermined price based on the market value of the underlier, unless the contract is sold before settlement date which may happen if a trader waits to take a profit or cut a loss. This contrasts with options trading in which the option buyer may choose whether or not to exercise the option. Futures are distinguished from generic forward contracts in that they contain standardized terms, trade on a formal exchange, are regulated by overseeing agencies, and are guaranteed by clearing houses. Also, in order to insure that payment will occur, futures have a margin requirement that must be settled daily. Finally, by making an offsetting trade, taking delivery of goods, or arranging for an exchange of goods, futures contracts can be closed. Hedgers often trade futures for the purpose of keeping price risk in check."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "futures contract"},
   :db/ident        :fibo-fbc-fi-fi/Future,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf {:owl/onProperty     :fibo-fbc-fi-ip/hasLotSize,
                     :owl/someValuesFrom :xsd/decimal,
                     :rdf/type           :owl/Restriction}})