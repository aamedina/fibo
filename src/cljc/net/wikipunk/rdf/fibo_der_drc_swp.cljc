(ns net.wikipunk.rdf.fibo-der-drc-swp
  "This ontology defines concepts specific to swap contracts, including relevant trading organizations, data repositories, and intermediaries."
  {:cmns-av/copyright ["Copyright (c) 2016-2023 Object Management Group, Inc."
                       "Copyright (c) 2016-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/",
   :dcterms/abstract
   "This ontology defines concepts specific to swap contracts, including relevant trading organizations, data repositories, and intermediaries.",
   :dcterms/license {:rdfa/uri "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/RateDerivatives/RateDerivatives/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/FinancialServicesEntities/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/Identifiers/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/ProductsAndServices/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/PaymentsAndSchedules/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/Ownership/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/MarketIndices/BasketIndices/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/DatesAndTimes/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/DerivativesBasics/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/Collections/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/ContextualDesignators/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/Swaps/"},
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-der-drc-bsc"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
    "fibo-der-drc-swp"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/",
    "fibo-der-rtd-rtd"
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/",
    "fibo-fbc-fct-fse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-arr-doc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
    "fibo-fnd-oac-own"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
    "fibo-fnd-pas-pas"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/",
    "fibo-fnd-pas-psch"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
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
   :rdfa/prefix "fibo-der-drc-swp",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/",
   :rdfs/label "Swaps Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/ version of this ontology was modified to move swap execution facility to the markets ontology in FBC."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/ version of this ontology was modified to eliminate duplication of concepts in LCC."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/ version of this ontology was modified to add the concept of a rates swap and the corresponding rate-based leg to facilitate mapping to the CFI standard."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/ version of this ontology was modified to eliminate the property 'hasPaymentSchedule' from this ontology in favor of the equivalent property with the same name from FND, adding concepts related to statistical swaps, and revising definitions to be ISO 704 compliant."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/ version of this ontology was modified to address text formatting issues identified through hygiene testing."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/ version of this ontology was modified to integrate return swaps and connect swap legs to the swap they comprise, as appropriate, simplify the contract party hierarchy, add basic fixed and floating legs as higher level concepts common to many swaps, and eliminate ambiguity in definitions."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/ version of this ontology was modified to refine the concept of a unique swap identifier (USI)."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/ version of this ontology was modified to move the property 'exchanges' to FND given that it could be applied more generally than with respect to swaps only, facilitate the elimination of the property 'mayBeTradedIn', which was only used in one place and was redundant with the concept of a ListedSecurity / Listing in SEC, and move two properties, hasPayingParty and hasReceivingParty to DerivativesBasics to facilitate wider use."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/ version of this ontology was modified to make a total return swap a kind of credit derivative."]})

(def BasisSwap
  "swap in which payment streams are referenced to different bases"
  {:cmns-av/explanatoryNote
   "A basis swap can have two legs of the same tenor but different indices, e.g., 3 month LIBOR vs. 3 month TIBOR. The difference in this case is not driven by different interest rate periods but from different markets, i.e., the difference in efficiency between the two markets. The objective is to hedge against basis risk which is the difference in price between two markets. See also forward swap, as a means for controlling interest rate.",
   :db/ident :fibo-der-drc-swp/BasisSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label "basis swap",
   :rdfs/subClassOf [:fibo-der-drc-swp/RatesSwap
                     {:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom :fibo-der-drc-swp/SwapTerms,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapParty,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasContractParty,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 2,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/Swap
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-der-drc-swp/UniqueSwapIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/RateBasedLeg,
                      :owl/onProperty :fibo-der-drc-swp/hasLeg,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 2,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapLeg,
                      :owl/onProperty :fibo-fnd-rel-rel/exchanges,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 2,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fi-fi/DerivativeInstrument],
   :skos/definition
   "swap in which payment streams are referenced to different bases"})

(def CorrelationLeg
  "floating leg of a correlation swap that pays an amount based on the observed average correlation of the prices of a collection of underlying products"
  {:db/ident :fibo-der-drc-swp/CorrelationLeg,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label #xsd/langString "correlation leg@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-swp/isLegOf,
                      :owl/someValuesFrom :fibo-der-drc-swp/CorrelationSwap,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-swp/PerformanceBasedVariableLeg
                     :fibo-der-drc-bsc/DerivativeTerms
                     :fibo-der-drc-bsc/CashflowTerms
                     :fibo-der-drc-swp/FloatingLeg
                     {:owl/onClass    :fibo-der-drc-swp/SwapReceivingParty,
                      :owl/onProperty :fibo-fnd-pas-pas/hasSeller,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-swp/isLegOf,
                      :owl/someValuesFrom :fibo-der-drc-swp/Swap,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasEffectiveDate,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapPayingParty,
                      :owl/onProperty :fibo-fnd-pas-pas/hasBuyer,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fnd-acc-cur/hasNotionalAmount,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-arr-doc/hasTerminationDate,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/SwapTerms
                     {:owl/onProperty     :fibo-der-drc-swp/isLegOf,
                      :owl/someValuesFrom :fibo-der-drc-swp/StatisticalSwap,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-fnd-pas-psch/PaymentSchedule,
                      :owl/onProperty :fibo-fnd-pas-psch/hasPaymentSchedule,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/SwapLeg],
   :skos/definition
   #xsd/langString
    "floating leg of a correlation swap that pays an amount based on the observed average correlation of the prices of a collection of underlying products@en"})

(def CorrelationSwap
  "over-the-counter statistical derivative that allows one to hedge risks associated with the observed average correlation of a collection of underlying products"
  {:cmns-av/explanatoryNote
   "Each product that can act as the underlier on which the correlation is based has periodically observable prices, such as a commodity, exchange rate, interest rate, or stock index. Correlation trading is a strategy in which the investor receives exposure to the average correlation of an index.",
   :db/ident :fibo-der-drc-swp/CorrelationSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label #xsd/langString "correlation swap@en",
   :rdfs/subClassOf [:fibo-der-drc-swp/StatisticalSwap
                     {:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom :fibo-der-drc-swp/SwapTerms,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapParty,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasContractParty,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 2,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/Swap
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-der-drc-swp/UniqueSwapIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapLeg,
                      :owl/onProperty :fibo-fnd-rel-rel/exchanges,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 2,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fi-fi/DerivativeInstrument
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-der-drc-swp/FixedLeg,
                      :owl/onProperty :fibo-der-drc-swp/hasLeg,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty :fibo-der-drc-swp/hasLeg,
                      :owl/someValuesFrom
                      :fibo-der-drc-swp/PerformanceBasedVariableLeg,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "over-the-counter statistical derivative that allows one to hedge risks associated with the observed average correlation of a collection of underlying products@en"})

(def DispersionLeg
  "floating leg of a dispersion swap that pays an amount based on the realized dispersion of the price changes of the underlying product"
  {:cmns-av/explanatoryNote
   #xsd/langString
    "Underlying assets may include, for example, exchange rates, interest rates, or the price of an index.@en",
   :cmns-av/synonym #xsd/langString "variance leg@en",
   :db/ident :fibo-der-drc-swp/DispersionLeg,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label #xsd/langString "dispersion leg@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-swp/isLegOf,
                      :owl/someValuesFrom :fibo-der-drc-swp/DispersionSwap,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-swp/PerformanceBasedVariableLeg
                     :fibo-der-drc-bsc/DerivativeTerms
                     :fibo-der-drc-bsc/CashflowTerms
                     :fibo-der-drc-swp/FloatingLeg
                     {:owl/onClass    :fibo-der-drc-swp/SwapReceivingParty,
                      :owl/onProperty :fibo-fnd-pas-pas/hasSeller,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-swp/isLegOf,
                      :owl/someValuesFrom :fibo-der-drc-swp/Swap,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasEffectiveDate,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapPayingParty,
                      :owl/onProperty :fibo-fnd-pas-pas/hasBuyer,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fnd-acc-cur/hasNotionalAmount,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-arr-doc/hasTerminationDate,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/SwapTerms
                     {:owl/onProperty     :fibo-der-drc-swp/isLegOf,
                      :owl/someValuesFrom :fibo-der-drc-swp/StatisticalSwap,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-fnd-pas-psch/PaymentSchedule,
                      :owl/onProperty :fibo-fnd-pas-psch/hasPaymentSchedule,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/SwapLeg],
   :skos/definition
   "floating leg of a dispersion swap that pays an amount based on the realized dispersion of the price changes of the underlying product"})

(def DispersionSwap
  "statistical derivative used to hedge on the magnitude of a price movement of an underlying asset"
  {:cmns-av/explanatoryNote
   ["Some strategies involve selling a variance swap on an index and buying the variance swaps on the individual constituents; this particular kind of spread trade is called a variance dispersion trade."
    "A variance swap is an instrument that allows investors to trade future realized (or historical) volatility against current implied volatility."],
   :cmns-av/synonym #xsd/langString "variance swap@en",
   :db/ident :fibo-der-drc-swp/DispersionSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label #xsd/langString "dispersion swap@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://www.sk3w.co/documents/volatility_trading.pdf"},
   :rdfs/subClassOf [:fibo-der-drc-swp/StatisticalSwap
                     {:owl/onClass    :fibo-der-drc-swp/DispersionLeg,
                      :owl/onProperty :fibo-der-drc-swp/hasLeg,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom :fibo-der-drc-swp/SwapTerms,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapParty,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasContractParty,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 2,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/Swap
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-der-drc-swp/UniqueSwapIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapLeg,
                      :owl/onProperty :fibo-fnd-rel-rel/exchanges,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 2,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fi-fi/DerivativeInstrument
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-der-drc-swp/FixedLeg,
                      :owl/onProperty :fibo-der-drc-swp/hasLeg,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty :fibo-der-drc-swp/hasLeg,
                      :owl/someValuesFrom
                      :fibo-der-drc-swp/PerformanceBasedVariableLeg,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "statistical derivative used to hedge on the magnitude of a price movement of an underlying asset@en"})

(def ExcessReturnSwap
  "return swap in which the change in the level of the index will be equal to the returns generated primarily by the changes in price of each of the contracts that comprise the index"
  {:cmns-av/adaptedFrom
   #xsd/langString
    "ISDA Disclosure Annex for Commodity Derivative Transactions. See https://globalmarkets.bnpparibas.com/gm/features/docs/dfdisclosures/ISDA_Commodity_Derivatives_Disclosure_Annex_04_2013.pdf@en",
   :db/ident :fibo-der-drc-swp/ExcessReturnSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label #xsd/langString "excess return swap@en",
   :rdfs/subClassOf [:fibo-der-drc-swp/IndexReturnSwap
                     {:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom :fibo-der-drc-swp/SwapTerms,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapParty,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasContractParty,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 2,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/Swap
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-der-drc-swp/UniqueSwapIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-swp/hasReturnLeg,
                      :owl/someValuesFrom :fibo-der-drc-swp/ReturnLeg,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapLeg,
                      :owl/onProperty :fibo-fnd-rel-rel/exchanges,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 2,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fi-fi/DerivativeInstrument
                     {:owl/onProperty     :fibo-der-drc-swp/hasFundingLeg,
                      :owl/someValuesFrom :fibo-der-drc-swp/FixedPaymentLeg,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-swp/ReturnSwap],
   :skos/definition
   #xsd/langString
    "return swap in which the change in the level of the index will be equal to the returns generated primarily by the changes in price of each of the contracts that comprise the index@en"})

(def FixedLeg
  "swap leg whose paying party is obligated to make payments from time to time over the term of a swap calculated by reference to a fixed annual rate or consisting of at least one payment of a fixed amount"
  {:cmns-av/adaptedFrom
   [#xsd/langString
     "ISDA Disclosure Annex for Commodity Derivative Transactions. See https://globalmarkets.bnpparibas.com/gm/features/docs/dfdisclosures/ISDA_Commodity_Derivatives_Disclosure_Annex_04_2013.pdf@en"
    #xsd/langString "2006 ISDA Definitions@en"],
   :db/ident :fibo-der-drc-swp/FixedLeg,
   :owl/disjointWith :fibo-der-drc-swp/FloatingLeg,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label "fixed leg",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-fnd-pas-psch/PaymentSchedule,
                      :owl/onProperty :fibo-fnd-pas-psch/hasPaymentSchedule,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/SwapLeg
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-arr-doc/hasTerminationDate,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-bsc/DerivativeTerms
                     :fibo-der-drc-swp/SwapTerms
                     :fibo-der-drc-bsc/CashflowTerms
                     {:owl/onClass    :fibo-der-drc-swp/SwapReceivingParty,
                      :owl/onProperty :fibo-fnd-pas-pas/hasSeller,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-swp/isLegOf,
                      :owl/someValuesFrom :fibo-der-drc-swp/Swap,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasEffectiveDate,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapPayingParty,
                      :owl/onProperty :fibo-fnd-pas-pas/hasBuyer,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fnd-acc-cur/hasNotionalAmount,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "swap leg whose paying party is obligated to make payments from time to time over the term of a swap calculated by reference to a fixed annual rate or consisting of at least one payment of a fixed amount"})

(def FixedPaymentLeg
  "swap leg that specifies contractual terms associated with a schedule of payments for any swap calculated by reference to a fixed annual rate"
  {:cmns-av/synonym ["funding leg" "fixed payment stream terms"],
   :cmns-av/usageNote
   "Payments may be fixed or variable, which is independent from the function of the leg (payments, return etc.). The schedule may be expressed in one of two ways: as an explicit schedule of dates or as a formula for determining payment dates in advance (taking into account for example roll rules for non working days).",
   :db/ident :fibo-der-drc-swp/FixedPaymentLeg,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label "fixed payment leg",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-pas-psch/hasPaymentSchedule,
                      :owl/someValuesFrom :fibo-fnd-pas-psch/PaymentSchedule,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-swp/SwapLeg
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-arr-doc/hasTerminationDate,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-bsc/DerivativeTerms
                     :fibo-der-drc-swp/SwapTerms
                     :fibo-der-drc-bsc/CashflowTerms
                     {:owl/onClass    :fibo-der-drc-swp/SwapReceivingParty,
                      :owl/onProperty :fibo-fnd-pas-pas/hasSeller,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-swp/isLegOf,
                      :owl/someValuesFrom :fibo-der-drc-swp/Swap,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasEffectiveDate,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapPayingParty,
                      :owl/onProperty :fibo-fnd-pas-pas/hasBuyer,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fnd-acc-cur/hasNotionalAmount,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "swap leg that specifies contractual terms associated with a schedule of payments for any swap calculated by reference to a fixed annual rate"})

(def FloatingLeg
  "swap leg whose paying party is obligated to make payments from time to time over the term of a swap calculated by reference to some variable rate, calculated based on the change in value of some underlying asset, or consisting of at least one payment of some floating amount"
  {:cmns-av/adaptedFrom
   [#xsd/langString
     "ISDA Disclosure Annex for Commodity Derivative Transactions. See https://globalmarkets.bnpparibas.com/gm/features/docs/dfdisclosures/ISDA_Commodity_Derivatives_Disclosure_Annex_04_2013.pdf@en"
    #xsd/langString "2006 ISDA Definitions@en"],
   :db/ident :fibo-der-drc-swp/FloatingLeg,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label "floating leg",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-fnd-pas-psch/PaymentSchedule,
                      :owl/onProperty :fibo-fnd-pas-psch/hasPaymentSchedule,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/SwapLeg
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-arr-doc/hasTerminationDate,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-bsc/DerivativeTerms
                     :fibo-der-drc-swp/SwapTerms
                     :fibo-der-drc-bsc/CashflowTerms
                     {:owl/onClass    :fibo-der-drc-swp/SwapReceivingParty,
                      :owl/onProperty :fibo-fnd-pas-pas/hasSeller,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-swp/isLegOf,
                      :owl/someValuesFrom :fibo-der-drc-swp/Swap,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasEffectiveDate,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapPayingParty,
                      :owl/onProperty :fibo-fnd-pas-pas/hasBuyer,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fnd-acc-cur/hasNotionalAmount,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "swap leg whose paying party is obligated to make payments from time to time over the term of a swap calculated by reference to some variable rate, calculated based on the change in value of some underlying asset, or consisting of at least one payment of some floating amount"})

(def IndexReturnSwap
  "return swap in which payments are based on a fee paid to the seller of the swap and on a floating reference price based on changes in the level of an index from an initial level to a level observed on some valuation date(s)"
  {:cmns-av/adaptedFrom
   #xsd/langString
    "ISDA Disclosure Annex for Commodity Derivative Transactions. See https://globalmarkets.bnpparibas.com/gm/features/docs/dfdisclosures/ISDA_Commodity_Derivatives_Disclosure_Annex_04_2013.pdf@en",
   :cmns-av/explanatoryNote
   #xsd/langString
    "Payments to the parties may be made either on a periodic basis or on termination of the transaction. One party will receive a payment based upon the change in the level of the index between two valuation dates (multiplied by the notional amount of the swap), as modified by the fee paid to the seller of the swap. If the level of the index increases, the buyer of the swap will be entitled to a payment based on this performance, as such payment may be reduced (or negated) by the fee paid to the seller of the swap. If the level of the index decreases, the seller of the swap will be entitled to a payment based on this performance, as such payment may be increased by the fee paid to the seller of the swap.@en",
   :db/ident :fibo-der-drc-swp/IndexReturnSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label #xsd/langString "index return swap@en",
   :rdfs/subClassOf [:fibo-der-drc-swp/ReturnSwap
                     {:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom :fibo-der-drc-swp/SwapTerms,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapParty,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasContractParty,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 2,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/Swap
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-der-drc-swp/UniqueSwapIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-swp/hasReturnLeg,
                      :owl/someValuesFrom :fibo-der-drc-swp/ReturnLeg,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapLeg,
                      :owl/onProperty :fibo-fnd-rel-rel/exchanges,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 2,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fi-fi/DerivativeInstrument
                     {:owl/onProperty     :fibo-der-drc-swp/hasFundingLeg,
                      :owl/someValuesFrom :fibo-der-drc-swp/FixedPaymentLeg,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "return swap in which payments are based on a fee paid to the seller of the swap and on a floating reference price based on changes in the level of an index from an initial level to a level observed on some valuation date(s)@en"})

(def MajorSwapParticipant
  "financial service provider that maintains a substantial position in swaps for any of the major swap categories"
  {:cmns-av/abbreviation "MSP",
   :cmns-av/adaptedFrom
   {:rdfa/uri "http://www.cftc.gov/IndustryOversight/Intermediaries/index.htm"},
   :cmns-av/explanatoryNote
   "This excludes positions held for hedging or mitigating commercial risk and positions maintained by an employee benefit plan for the primary purpose of hedging or mitigating any risk directly associated with the operation of the plan.",
   :db/ident :fibo-der-drc-swp/MajorSwapParticipant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label "major swap participant",
   :rdfs/subClassOf :fibo-fbc-fct-fse/NonDepositoryInstitution,
   :skos/definition
   "financial service provider that maintains a substantial position in swaps for any of the major swap categories"})

(def PerformanceBasedVariableLeg
  "floating leg of a swap that depends on some statistical measure of the performance of the underlier"
  {:db/ident :fibo-der-drc-swp/PerformanceBasedVariableLeg,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label "performance-based variable leg",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-swp/isLegOf,
                      :owl/someValuesFrom :fibo-der-drc-swp/StatisticalSwap,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-swp/FloatingLeg
                     :fibo-der-drc-bsc/DerivativeTerms
                     :fibo-der-drc-bsc/CashflowTerms
                     {:owl/onClass    :fibo-der-drc-swp/SwapReceivingParty,
                      :owl/onProperty :fibo-fnd-pas-pas/hasSeller,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-swp/isLegOf,
                      :owl/someValuesFrom :fibo-der-drc-swp/Swap,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasEffectiveDate,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapPayingParty,
                      :owl/onProperty :fibo-fnd-pas-pas/hasBuyer,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fnd-acc-cur/hasNotionalAmount,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-arr-doc/hasTerminationDate,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/SwapTerms
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-fnd-pas-psch/PaymentSchedule,
                      :owl/onProperty :fibo-fnd-pas-psch/hasPaymentSchedule,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/SwapLeg],
   :skos/definition
   "floating leg of a swap that depends on some statistical measure of the performance of the underlier"})

(def RateBasedLeg
  "swap leg of a rate-based swap based on a floating interest, floating inflation or fixed interest rate"
  {:db/ident :fibo-der-drc-swp/RateBasedLeg,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label #xsd/langString "rate-based leg@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom :fibo-der-rtd-rtd/RateBasedObservable,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-swp/isLegOf,
                      :owl/someValuesFrom :fibo-der-drc-swp/RatesSwap,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-swp/SwapLeg
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-arr-doc/hasTerminationDate,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-bsc/DerivativeTerms
                     :fibo-der-drc-swp/SwapTerms
                     :fibo-der-drc-bsc/CashflowTerms
                     {:owl/onClass    :fibo-der-drc-swp/SwapReceivingParty,
                      :owl/onProperty :fibo-fnd-pas-pas/hasSeller,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-swp/isLegOf,
                      :owl/someValuesFrom :fibo-der-drc-swp/Swap,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasEffectiveDate,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapPayingParty,
                      :owl/onProperty :fibo-fnd-pas-pas/hasBuyer,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fnd-acc-cur/hasNotionalAmount,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "swap leg of a rate-based swap based on a floating interest, floating inflation or fixed interest rate@en"})

(def RatesSwap
  "swap in two counterparties each agree to pay the other cash flows on defined dates during an agreed period, based on a specified notional amount and a floating interest, floating inflation or fixed interest rate"
  {:cmns-av/adaptedFrom
   {:xsd/string
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15"},
   :db/ident :fibo-der-drc-swp/RatesSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label "rates swap",
   :rdfs/subClassOf [{:owl/onClass    :fibo-der-drc-swp/RateBasedLeg,
                      :owl/onProperty :fibo-der-drc-swp/hasLeg,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 2,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/Swap
                     {:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom :fibo-der-drc-swp/SwapTerms,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapParty,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasContractParty,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 2,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-der-drc-swp/UniqueSwapIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapLeg,
                      :owl/onProperty :fibo-fnd-rel-rel/exchanges,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 2,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fi-fi/DerivativeInstrument],
   :skos/definition
   "swap in two counterparties each agree to pay the other cash flows on defined dates during an agreed period, based on a specified notional amount and a floating interest, floating inflation or fixed interest rate"})

(def RealizedVariableLeg
  "performance-based leg wherein the payment is netted at maturity rather than periodically"
  {:cmns-av/explanatoryNote
   "In this case there is a single payment at maturity/settlement and so there is no stream of cashflows either way. The other leg of these swaps is implied, and is simply the strike price.",
   :db/ident :fibo-der-drc-swp/RealizedVariableLeg,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label "realized variable leg",
   :rdfs/subClassOf [:fibo-der-drc-swp/PerformanceBasedVariableLeg
                     :fibo-der-drc-bsc/DerivativeTerms
                     :fibo-der-drc-bsc/CashflowTerms
                     :fibo-der-drc-swp/FloatingLeg
                     {:owl/onClass    :fibo-der-drc-swp/SwapReceivingParty,
                      :owl/onProperty :fibo-fnd-pas-pas/hasSeller,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-swp/isLegOf,
                      :owl/someValuesFrom :fibo-der-drc-swp/Swap,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasEffectiveDate,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapPayingParty,
                      :owl/onProperty :fibo-fnd-pas-pas/hasBuyer,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fnd-acc-cur/hasNotionalAmount,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-arr-doc/hasTerminationDate,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/SwapTerms
                     {:owl/onProperty     :fibo-der-drc-swp/isLegOf,
                      :owl/someValuesFrom :fibo-der-drc-swp/StatisticalSwap,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-fnd-pas-psch/PaymentSchedule,
                      :owl/onProperty :fibo-fnd-pas-psch/hasPaymentSchedule,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/SwapLeg],
   :skos/definition
   "performance-based leg wherein the payment is netted at maturity rather than periodically"})

(def ReturnLeg
  "leg of a swap in which the income generated by some underlier is paid"
  {:cmns-av/explanatoryNote
   #xsd/langString
    "The return, including income from a tangible asset, the constituents of an index, or a notional/specified amount of some asset (e.g. number of shares, amount of a commodity, etc.), may be limited to the dividend or interest amounts on the underlying (simple return), or total return including capital gains and/or the appreciation or decrease in value of the asset (or index constituents).@en",
   :db/ident :fibo-der-drc-swp/ReturnLeg,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label #xsd/langString "return leg@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-fnd-oac-own/TangibleAsset
                                            :fibo-ind-mkt-bas/ReferenceIndex],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-swp/isLegOf,
                      :owl/someValuesFrom :fibo-der-drc-swp/ReturnSwap,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-swp/FloatingLeg
                     :fibo-der-drc-bsc/DerivativeTerms
                     :fibo-der-drc-bsc/CashflowTerms
                     {:owl/onClass    :fibo-der-drc-swp/SwapReceivingParty,
                      :owl/onProperty :fibo-fnd-pas-pas/hasSeller,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-swp/isLegOf,
                      :owl/someValuesFrom :fibo-der-drc-swp/Swap,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasEffectiveDate,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapPayingParty,
                      :owl/onProperty :fibo-fnd-pas-pas/hasBuyer,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fnd-acc-cur/hasNotionalAmount,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-arr-doc/hasTerminationDate,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/SwapTerms
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-fnd-pas-psch/PaymentSchedule,
                      :owl/onProperty :fibo-fnd-pas-psch/hasPaymentSchedule,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/SwapLeg],
   :skos/definition
   #xsd/langString
    "leg of a swap in which the income generated by some underlier is paid@en"})

(def ReturnSwap
  "swap in which one leg, the return leg, is based on income generated from some underlier"
  {:db/ident :fibo-der-drc-swp/ReturnSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label #xsd/langString "return swap@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-swp/hasReturnLeg,
                      :owl/someValuesFrom :fibo-der-drc-swp/ReturnLeg,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-swp/hasFundingLeg,
                      :owl/someValuesFrom :fibo-der-drc-swp/FixedPaymentLeg,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-swp/Swap
                     {:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom :fibo-der-drc-swp/SwapTerms,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapParty,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasContractParty,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 2,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-der-drc-swp/UniqueSwapIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapLeg,
                      :owl/onProperty :fibo-fnd-rel-rel/exchanges,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 2,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fi-fi/DerivativeInstrument],
   :skos/definition
   #xsd/langString
    "swap in which one leg, the return leg, is based on income generated from some underlier@en"})

(def SimpleReturnLeg
  "return leg based strictly on the income generated by the underlying asset, excluding appreciation, decrease in value, capital gains, and fees on any increase in value"
  {:cmns-av/explanatoryNote
   #xsd/langString
    "Payments may include interest payments on a debt instrument or the dividends on an equity, for example.@en",
   :db/ident :fibo-der-drc-swp/SimpleReturnLeg,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label #xsd/langString "simple return leg@en",
   :rdfs/subClassOf [:fibo-der-drc-swp/ReturnLeg
                     :fibo-der-drc-bsc/DerivativeTerms
                     :fibo-der-drc-bsc/CashflowTerms
                     :fibo-der-drc-swp/FloatingLeg
                     {:owl/onClass    :fibo-der-drc-swp/SwapReceivingParty,
                      :owl/onProperty :fibo-fnd-pas-pas/hasSeller,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-swp/isLegOf,
                      :owl/someValuesFrom :fibo-der-drc-swp/Swap,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasEffectiveDate,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-fnd-oac-own/TangibleAsset
                                            :fibo-ind-mkt-bas/ReferenceIndex],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapPayingParty,
                      :owl/onProperty :fibo-fnd-pas-pas/hasBuyer,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fnd-acc-cur/hasNotionalAmount,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-arr-doc/hasTerminationDate,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/SwapTerms
                     {:owl/onProperty     :fibo-der-drc-swp/isLegOf,
                      :owl/someValuesFrom :fibo-der-drc-swp/ReturnSwap,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-fnd-pas-psch/PaymentSchedule,
                      :owl/onProperty :fibo-fnd-pas-psch/hasPaymentSchedule,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/SwapLeg],
   :skos/definition
   #xsd/langString
    "return leg based strictly on the income generated by the underlying asset, excluding appreciation, decrease in value, capital gains, and fees on any increase in value@en"})

(def StatisticalSwap
  "swap that depends on some statistical measure of the performance of the underlier"
  {:db/ident :fibo-der-drc-swp/StatisticalSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label "statistical swap",
   :rdfs/subClassOf [{:owl/onProperty :fibo-der-drc-swp/hasLeg,
                      :owl/someValuesFrom
                      :fibo-der-drc-swp/PerformanceBasedVariableLeg,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-der-drc-swp/FixedLeg,
                      :owl/onProperty :fibo-der-drc-swp/hasLeg,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/Swap
                     {:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom :fibo-der-drc-swp/SwapTerms,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapParty,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasContractParty,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 2,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-der-drc-swp/UniqueSwapIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapLeg,
                      :owl/onProperty :fibo-fnd-rel-rel/exchanges,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 2,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fi-fi/DerivativeInstrument],
   :skos/definition
   "swap that depends on some statistical measure of the performance of the underlier"})

(def StrikeLeg
  "swap leg that specifies a fixed amount, 'the strike', quoted at the time of execution"
  {:cmns-av/explanatoryNote
   #xsd/langString
    "The fixed amount may be with respect to some variable or a monetary amount. The realization of a strike leg is not a cashflow per se, but a netting out against the terms defined in the other leg of a statistical swap.@en",
   :db/ident :fibo-der-drc-swp/StrikeLeg,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label #xsd/langString "strike leg@en",
   :rdfs/subClassOf [:fibo-der-drc-swp/FixedLeg
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-arr-doc/hasTerminationDate,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-bsc/DerivativeTerms
                     :fibo-der-drc-swp/SwapTerms
                     :fibo-der-drc-bsc/CashflowTerms
                     {:owl/onClass    :fibo-der-drc-swp/SwapReceivingParty,
                      :owl/onProperty :fibo-fnd-pas-pas/hasSeller,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/SwapLeg
                     {:owl/onProperty     :fibo-der-drc-swp/isLegOf,
                      :owl/someValuesFrom :fibo-der-drc-swp/Swap,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-fnd-pas-psch/PaymentSchedule,
                      :owl/onProperty :fibo-fnd-pas-psch/hasPaymentSchedule,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasEffectiveDate,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapPayingParty,
                      :owl/onProperty :fibo-fnd-pas-pas/hasBuyer,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fnd-acc-cur/hasNotionalAmount,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "swap leg that specifies a fixed amount, 'the strike', quoted at the time of execution@en"})

(def Swap
  "derivative instrument whereby two counterparties agree to exchange periodic streams of cash flows with each other"
  {:cmns-av/adaptedFrom
   {:xsd/string
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15"},
   :cmns-av/explanatoryNote
   ["Usually, the principal does not change hands. Each cash flow comprises one leg of the swap. One cash flow is generally fixed, while the other is variable, that is, based on a a benchmark interest rate, floating currency exchange rate or index price."
    "The underlying instruments can be almost anything, representing various asset classes, but most swaps involve cash flows (streams of payments or other commitments over time) based on a notional principal amount that both parties agree to."],
   :db/ident :fibo-der-drc-swp/Swap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label "swap",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-der-drc-swp/UniqueSwapIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapParty,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasContractParty,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 2,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fi-fi/DerivativeInstrument
                     {:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom :fibo-der-drc-swp/SwapTerms,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapLeg,
                      :owl/onProperty :fibo-fnd-rel-rel/exchanges,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 2,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "derivative instrument whereby two counterparties agree to exchange periodic streams of cash flows with each other"})

(def SwapConfirmation
  "formal confirmation that codifies the terms and conditions specific to a lifecycle event with respect to the overall transaction between the parties"
  {:db/ident :fibo-der-drc-swp/SwapConfirmation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label "swap confirmation",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-agr-ctr/hasContractParty,
                      :owl/someValuesFrom :fibo-der-drc-swp/SwapParty,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :fibo-der-drc-swp/SwapConfirmation,
                      :owl/onProperty    :fibo-fnd-agr-ctr/supersedes,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-pas-pas/TransactionConfirmation
                     :fibo-der-drc-swp/SwapLifecycleEvent
                     {:owl/onClass
                      :fibo-der-drc-swp/SwapLifecycleEventIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/UniqueSwapIdentifier,
                      :owl/onProperty :fibo-der-drc-swp/hasSwapIdentifier,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-der-drc-swp/Swap,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-pas-pas/TransactionEvent
                     {:owl/onProperty     :fibo-fnd-pty-pty/hasPartyInRole,
                      :owl/someValuesFrom :fibo-der-drc-swp/SwapParty,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "formal confirmation that codifies the terms and conditions specific to a lifecycle event with respect to the overall transaction between the parties"})

(def SwapDataRepository
  "financial service provider that provides a central facility for swap data reporting and recordkeeping"
  {:cmns-av/abbreviation "SDR",
   :cmns-av/adaptedFrom
   {:rdfa/uri
    "http://www.cftc.gov/IndustryOversight/DataRepositories/index.htm"},
   :cmns-av/explanatoryNote
   "Swap data repositories ('SDRs') are new entities created by the Dodd-Frank Wall Street Reform and Consumer Protection Act ('Dodd-Frank Act') in order to provide a central facility for swap data reporting and recordkeeping. Under the Dodd- Frank Act, all swaps, whether cleared or uncleared, are required to be reported to registered SDRs. The Dodd-Frank Act added new Section 21 to the Commodity Exchange Act ('CEA'), governing registration and regulation of SDRs and establishing registration requirements and core duties and responsibilities for SDRs.",
   :db/ident :fibo-der-drc-swp/SwapDataRepository,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label "swap data repository",
   :rdfs/subClassOf :fibo-fbc-pas-fpas/FinancialServiceProvider,
   :skos/definition
   "financial service provider that provides a central facility for swap data reporting and recordkeeping"})

(def SwapDealer
  "non-depository institution such as one that deals in swaps, makes a market in swaps, regularly enters into swaps with counterparties as an ordinary course of business for its own account, and engages in any activity causing the person to be commonly known in the trade as a dealer/market maker in swaps"
  {:cmns-av/abbreviation "SD",
   :cmns-av/adaptedFrom
   {:rdfa/uri "http://www.cftc.gov/IndustryOversight/Intermediaries/index.htm"},
   :db/ident :fibo-der-drc-swp/SwapDealer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label "swap dealer",
   :rdfs/subClassOf [:fibo-fbc-pas-fpas/Dealer
                     :fibo-fbc-fct-fse/NonDepositoryInstitution],
   :skos/definition
   "non-depository institution such as one that deals in swaps, makes a market in swaps, regularly enters into swaps with counterparties as an ordinary course of business for its own account, and engages in any activity causing the person to be commonly known in the trade as a dealer/market maker in swaps"})

(def SwapLeg
  "terms defining and the commitment to fulfill cashflow requirements (e.g., interest payments, coupon payments, etc.) for one side of a swap"
  {:cmns-av/synonym "swap stream terms",
   :db/ident :fibo-der-drc-swp/SwapLeg,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label "swap leg",
   :rdfs/subClassOf [:fibo-der-drc-bsc/CashflowTerms
                     {:owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasEffectiveDate,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapPayingParty,
                      :owl/onProperty :fibo-fnd-pas-pas/hasBuyer,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-arr-doc/hasTerminationDate,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-swp/isLegOf,
                      :owl/someValuesFrom :fibo-der-drc-swp/Swap,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-swp/SwapTerms
                     {:owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fnd-acc-cur/hasNotionalAmount,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapReceivingParty,
                      :owl/onProperty :fibo-fnd-pas-pas/hasSeller,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-bsc/DerivativeTerms],
   :skos/definition
   "terms defining and the commitment to fulfill cashflow requirements (e.g., interest payments, coupon payments, etc.) for one side of a swap",
   :skos/editorialNote
   "For some swaps this may be a commitment to net up the difference between a strike and an outcome, rather than to make a series of cashflows over time. For credit default swaps there are conditional commitments, contingent on the occurrence of a credit event."})

(def SwapLifecycleEvent
  "event that occurs during the lifecycle of a swap, where the overall set of events includes those specific to the issuer, front office, middle office, and/or back office processes"
  {:db/ident :fibo-der-drc-swp/SwapLifecycleEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label "swap lifecycle event",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-der-drc-swp/Swap,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-pty-pty/hasPartyInRole,
                      :owl/someValuesFrom :fibo-der-drc-swp/SwapParty,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/UniqueSwapIdentifier,
                      :owl/onProperty :fibo-der-drc-swp/hasSwapIdentifier,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass
                      :fibo-der-drc-swp/SwapLifecycleEventIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-pas-pas/TransactionEvent],
   :skos/definition
   "event that occurs during the lifecycle of a swap, where the overall set of events includes those specific to the issuer, front office, middle office, and/or back office processes"})

(def SwapLifecycleEventIdentifier
  "identifier that uniquely identifies a specific event in the lifecycle of a swap"
  {:db/ident :fibo-der-drc-swp/SwapLifecycleEventIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label "swap lifecycle event identifier",
   :rdfs/subClassOf [{:owl/onClass    :fibo-der-drc-swp/SwapLifecycleEvent,
                      :owl/onProperty :cmns-id/identifies,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     :cmns-id/Identifier],
   :skos/definition
   "identifier that uniquely identifies a specific event in the lifecycle of a swap"})

(def SwapParty
  "party to a swap and therefore a legal party to the contract that embodies that transaction"
  {:db/ident :fibo-der-drc-swp/SwapParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label "swap party",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-pty-pty/isAPartyTo,
                          :owl/someValuesFrom :fibo-der-drc-swp/Swap,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-fnd-agr-ctr/ContractParty],
   :skos/definition
   "party to a swap and therefore a legal party to the contract that embodies that transaction"})

(def SwapPayingParty
  "swap party responsible for making payments for a given leg of the transaction as defined in the contract"
  {:db/ident :fibo-der-drc-swp/SwapPayingParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label "swap paying party",
   :rdfs/subClassOf
   [:fibo-der-drc-swp/SwapParty
    :fibo-der-drc-bsc/PayingParty
    {:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-pty-pty/isAPartyTo,
                          :owl/someValuesFrom :fibo-der-drc-swp/Swap,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-fnd-agr-ctr/ContractParty],
   :skos/definition
   "swap party responsible for making payments for a given leg of the transaction as defined in the contract"})

(def SwapReceivingParty
  "swap party that receives payments for a given leg of the transaction as defined in the contract"
  {:db/ident :fibo-der-drc-swp/SwapReceivingParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label "swap receiving party",
   :rdfs/subClassOf
   [:fibo-der-drc-swp/SwapParty
    :fibo-der-drc-bsc/ReceivingParty
    {:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-pty-pty/isAPartyTo,
                          :owl/someValuesFrom :fibo-der-drc-swp/Swap,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-fnd-agr-ctr/ContractParty],
   :skos/definition
   "swap party that receives payments for a given leg of the transaction as defined in the contract"})

(def SwapStreamEvent
  "payment event (e.g., interest payment, coupon payment, etc.) against one leg of a swap stream"
  {:db/ident :fibo-der-drc-swp/SwapStreamEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label "swap stream event",
   :rdfs/subClassOf [:fibo-fnd-pas-psch/PaymentEvent
                     :fibo-der-drc-swp/SwapLifecycleEvent
                     {:owl/onClass
                      :fibo-der-drc-swp/SwapLifecycleEventIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/UniqueSwapIdentifier,
                      :owl/onProperty :fibo-der-drc-swp/hasSwapIdentifier,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-der-drc-swp/Swap,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-pas-pas/TransactionEvent
                     {:owl/onProperty     :fibo-fnd-pty-pty/hasPartyInRole,
                      :owl/someValuesFrom :fibo-der-drc-swp/SwapParty,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "payment event (e.g., interest payment, coupon payment, etc.) against one leg of a swap stream"})

(def SwapTerms
  "legal contractual terms of a swap transaction"
  {:db/ident :fibo-der-drc-swp/SwapTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label "swap terms",
   :rdfs/subClassOf :fibo-der-drc-bsc/DerivativeTerms,
   :skos/definition "legal contractual terms of a swap transaction"})

(def TotalReturnLeg
  "return leg based on the income generated by the underlying asset as well as any appreciation, decrease in value, capital gains, and fees on any increase in value"
  {:cmns-av/explanatoryNote
   #xsd/langString
    "This is distinguished from the more general Return Leg by the addition of increase or decrease in the value of the underlying asset.@en",
   :db/ident :fibo-der-drc-swp/TotalReturnLeg,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label #xsd/langString "total return leg@en",
   :rdfs/subClassOf [:fibo-der-drc-swp/ReturnLeg
                     :fibo-der-drc-bsc/DerivativeTerms
                     :fibo-der-drc-bsc/CashflowTerms
                     :fibo-der-drc-swp/FloatingLeg
                     {:owl/onClass    :fibo-der-drc-swp/SwapReceivingParty,
                      :owl/onProperty :fibo-fnd-pas-pas/hasSeller,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-swp/isLegOf,
                      :owl/someValuesFrom :fibo-der-drc-swp/Swap,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasEffectiveDate,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-fnd-oac-own/TangibleAsset
                                            :fibo-ind-mkt-bas/ReferenceIndex],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapPayingParty,
                      :owl/onProperty :fibo-fnd-pas-pas/hasBuyer,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fnd-acc-cur/hasNotionalAmount,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-arr-doc/hasTerminationDate,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/SwapTerms
                     {:owl/onProperty     :fibo-der-drc-swp/isLegOf,
                      :owl/someValuesFrom :fibo-der-drc-swp/ReturnSwap,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-fnd-pas-psch/PaymentSchedule,
                      :owl/onProperty :fibo-fnd-pas-psch/hasPaymentSchedule,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/SwapLeg],
   :skos/definition
   #xsd/langString
    "return leg based on the income generated by the underlying asset as well as any appreciation, decrease in value, capital gains, and fees on any increase in value@en"})

(def TotalReturnSwap
  "return swap where the seller agrees to pay the other party the difference in value of some underlying asset multiplied by an agreed-upon notional value should the asset value increase between specified periods of time"
  {:cmns-av/adaptedFrom
   [#xsd/langString
     "CFTC Data Dictionary. See https://www.cftc.gov/MarketReports/SwapsReports/DataDictionary/index.htm@en"
    #xsd/langString
     "ISDA Disclosure Annex for Commodity Derivative Transactions. See https://globalmarkets.bnpparibas.com/gm/features/docs/dfdisclosures/ISDA_Commodity_Derivatives_Disclosure_Annex_04_2013.pdf@en"],
   :cmns-av/explanatoryNote
   [#xsd/langString
     "In a total return swap that is index-based, the change in the level of the index will be equal to the returns generated by the change in price of each of the contracts that comprise the index plus a return based upon interest earned on any cash collateral posted upon the purchase of the contracts comprising the index.@en"
    #xsd/langString
     "In exchange, the other party, the buyer of the credit risk, agrees to pay the difference in value of the specified asset multiplied by the notional value should that value decrease between the same specified periods of time. Total return swaps often appear in asset classes other than the credit asset class; however, for the purpose of the CFTC Swaps Report, all total return swaps are counted only in the credit asset class.@en"],
   :db/ident :fibo-der-drc-swp/TotalReturnSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label #xsd/langString "total return swap@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-swp/hasReturnLeg,
                      :owl/someValuesFrom :fibo-der-drc-swp/TotalReturnLeg,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-swp/ReturnSwap
                     :fibo-der-drc-bsc/CreditDerivative
                     {:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom :fibo-der-drc-swp/SwapTerms,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapParty,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasContractParty,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 2,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/Swap
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-der-drc-swp/UniqueSwapIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-swp/hasReturnLeg,
                      :owl/someValuesFrom :fibo-der-drc-swp/ReturnLeg,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :fibo-der-drc-swp/SwapLeg,
                      :owl/onProperty :fibo-fnd-rel-rel/exchanges,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 2,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fi-fi/DerivativeInstrument
                     {:owl/onProperty     :fibo-der-drc-swp/hasFundingLeg,
                      :owl/someValuesFrom :fibo-der-drc-swp/FixedPaymentLeg,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "return swap where the seller agrees to pay the other party the difference in value of some underlying asset multiplied by an agreed-upon notional value should the asset value increase between specified periods of time@en",
   :skos/example
   #xsd/langString
    "For example the parties may enter into a two year agreement where every three months they compare the value of the Barclays Capital Aggregate Bond Index to its value three months previously. If the agreed upon notional was US $10,000,000 and the value increased 0.04%, or 4 basis points (bps), the seller would pay the buyer US $4,000. If, after another three months, the value decreased by 3bps, the buyer would pay the seller US $3,000. As part of the agreement, the buyer may also make an additional payment each period to the seller based on a floating rate index multiplied by the notional value.@en"})

(def UniqueSwapIdentifier
  "identifier for a swap that is used in recordkeeping and swap data reporting"
  {:cmns-av/abbreviation "USI",
   :cmns-av/adaptedFrom
   {:xsd/string
    "CFTC Data Management Branch 'Unique Swap Identifier (USI) Data Standard', October 1, 2012, usidatastandards100112.pdf"},
   :db/ident :fibo-der-drc-swp/UniqueSwapIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label "unique swap identifier",
   :rdfs/subClassOf [{:owl/onClass    :fibo-der-drc-swp/Swap,
                      :owl/onProperty :cmns-id/identifies,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fi-fi/FinancialInstrumentIdentifier],
   :skos/definition
   "identifier for a swap that is used in recordkeeping and swap data reporting"})

(def hasFundingLeg
  "indicates the leg of a return swap that specifies a set payment rate, typically benchmark based but possibly a fixed rate"
  {:db/ident :fibo-der-drc-swp/hasFundingLeg,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-swp/ReturnSwap,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label #xsd/langString "has funding leg@en",
   :rdfs/subPropertyOf [:fibo-der-drc-swp/hasLeg
                        :fibo-fnd-agr-ctr/hasContractualElement],
   :skos/definition
   "indicates the leg of a return swap that specifies a set payment rate, typically benchmark based but possibly a fixed rate"})

(def hasLeg
  "relates a swap to the legs (swap streams) that comprise the swap"
  {:cmns-av/synonym "has swap stream",
   :db/ident :fibo-der-drc-swp/hasLeg,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-swp/Swap,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label "has leg",
   :rdfs/range :fibo-der-drc-swp/SwapLeg,
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasContractualElement,
   :skos/definition
   "relates a swap to the legs (swap streams) that comprise the swap"})

(def hasReturnLeg
  "indicates the leg of a return swap whose payments are based on the return of an underlying asset"
  {:db/ident :fibo-der-drc-swp/hasReturnLeg,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-swp/ReturnSwap,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label #xsd/langString "has return leg@en",
   :rdfs/range :fibo-der-drc-swp/ReturnLeg,
   :rdfs/subPropertyOf [:fibo-der-drc-swp/hasLeg
                        :fibo-fnd-agr-ctr/hasContractualElement],
   :skos/definition
   "indicates the leg of a return swap whose payments are based on the return of an underlying asset"})

(def hasSwapIdentifier
  "relates a swap lifecycle event to the identifier for the swap"
  {:db/ident :fibo-der-drc-swp/hasSwapIdentifier,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label "has swap identifier",
   :rdfs/range :fibo-fbc-fi-fi/FinancialInstrumentIdentifier,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/refersTo,
   :skos/definition
   "relates a swap lifecycle event to the identifier for the swap"})

(def isLegOf
  "relates a swap leg to the to the swap that includes it"
  {:db/ident :fibo-der-drc-swp/isLegOf,
   :owl/inverseOf :fibo-der-drc-swp/hasLeg,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-swp/SwapLeg,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"},
   :rdfs/label "is leg of",
   :rdfs/range :fibo-der-drc-swp/Swap,
   :rdfs/subPropertyOf :cmns-col/isIncludedIn,
   :skos/definition "relates a swap leg to the to the swap that includes it"})