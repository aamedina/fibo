(ns net.wikipunk.rdf.fibo-der-rtd-irsind
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
     "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
     "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
     "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-der-drc-swp"
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/",
     "fibo-der-rtd-irsind"
     "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
     "fibo-der-rtd-irswp"
     "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/",
     "fibo-fbc-dae-dbt"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
     "fibo-fbc-fct-bci"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
     "fibo-fbc-fi-fi"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
     "fibo-fbc-pas-fpas"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
     "fibo-fnd-acc-4217"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
     "fibo-fnd-acc-cur"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
     "fibo-fnd-agr-ctr"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
     "fibo-fnd-arr-doc"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
     "fibo-fnd-dt-bd"
     "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
     "fibo-fnd-pas-pas"
     "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/",
     "fibo-fnd-plc-loc"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
     "fibo-fnd-rel-rel"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "fibo-ind-ir-ir"
     "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
     "fibo-sec-dbt-dbti"
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/",
     "fibo-sec-sec-ast"
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets/",
     "fibo-sec-sec-id"
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "skos" "http://www.w3.org/2004/02/skos/core#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-der-rtd-irsind",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"}
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology provides examples of how to represent individuals for interest rate swaps and swap legs based on the Mizuho mocked-up sample data provided in the FIBO wiki.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/InterestRates/CommonInterestRates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/RateDerivatives/IRSwaps/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/InterestRates/InterestRates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/Swaps/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/DebtInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecurityAssets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/ISO4217-CurrencyCodes/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIdentification/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/BusinessDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/BusinessCentersIndividuals/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/RateDerivatives/IRSwapExampleIndividuals/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Interest Rate Swap Example Individuals Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals.rdf version of this ontology was modified to move the property 'exchanges' to FND given that it could be applied more generally than with respect to swaps only."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals.rdf version of this ontology was modified to correct properties that were modified in the main ontology but not in the examples."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"})

(def Contract-IY7VKEUR45886
  {:cmns-col/isIncludedIn :fibo-der-rtd-irsind/PortfolioAlpha,
   :cmns-id/isIdentifiedBy #{:fibo-der-rtd-irsind/IY7VKEUR45886
                             :fibo-der-rtd-irsind/ISIN-ZZ216659451},
   :db/ident :fibo-der-rtd-irsind/Contract-IY7VKEUR45886,
   :fibo-fnd-agr-ctr/hasContractParty
   #{:fibo-der-rtd-irsind/SwapContractParty-A
     :fibo-der-rtd-irsind/SwapContractParty-ZZZWWK96TRQY0F2IY7VK},
   :fibo-fnd-rel-rel/exchanges
   #{:fibo-der-rtd-irsind/ContractLeg2-IY7VKEUR45886
     :fibo-der-rtd-irsind/ContractLeg1-IY7VKEUR45886},
   :rdf/type #{:fibo-der-rtd-irswp/FixedFloatSingleCurrencyInterestRateSwap
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"},
   :rdfs/label "contract IY7VKEUR45886",
   :skos/definition
   "contract IY7VKEUR45886 that is a fixed/float, single currency interest rate swap"})

(def ContractLeg1-IY7VKEUR45886
  {:cmns-av/explanatoryNote
   "Need to create the 1st period fixing date, payment days offset, discount notional amount, average remaining notional currency, net present value currency (pair, of type monetary amount)",
   :db/ident :fibo-der-rtd-irsind/ContractLeg1-IY7VKEUR45886,
   :fibo-fbc-dae-dbt/hasInterestRate
   :fibo-der-rtd-irsind/ContractLeg1-IY7VKEUR45886-InterestRate,
   :fibo-fnd-acc-cur/hasNotionalAmount
   :fibo-der-rtd-irsind/ContractLeg1-IY7VKEUR45886-NotionalAmount,
   :fibo-fnd-agr-ctr/hasEffectiveDate
   :fibo-der-rtd-irsind/ContractLeg1-IY7VKEUR45886-EffectiveDate,
   :fibo-fnd-arr-doc/hasTerminationDate
   :fibo-der-rtd-irsind/ContractLeg1-IY7VKEUR45886-TerminationDate,
   :fibo-fnd-pas-pas/hasBuyer
   :fibo-der-rtd-irsind/SwapContractParty-ZZZWWK96TRQY0F2IY7VK,
   :fibo-fnd-pas-pas/hasSeller :fibo-der-rtd-irsind/SwapContractParty-A,
   :fibo-fnd-rel-rel/isMandatedBy :fibo-der-rtd-irsind/Contract-IY7VKEUR45886,
   :fibo-sec-dbt-dbti/hasInterestPaymentTerms
   :fibo-der-rtd-irsind/ContractLeg1-IY7VKEUR45886-InterestPaymentTerms,
   :rdf/type #{:fibo-der-rtd-irswp/FixedInterestRateLeg :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"},
   :rdfs/label "contract leg 1 IY7VKEUR45886",
   :skos/definition
   "contract IY7VKEUR45886 swap leg 1 that is a fixed interest rate leg"})

(def ContractLeg1-IY7VKEUR45886-EffectiveDate
  {:cmns-dt/hasDateValue "2015-12-12",
   :db/ident :fibo-der-rtd-irsind/ContractLeg1-IY7VKEUR45886-EffectiveDate,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"},
   :rdfs/label "contract leg 1 IY7VKEUR45886 effective date"})

(def ContractLeg1-IY7VKEUR45886-InterestPaymentTerms
  {:db/ident
   :fibo-der-rtd-irsind/ContractLeg1-IY7VKEUR45886-InterestPaymentTerms,
   :fibo-fbc-dae-dbt/hasAccrualBasis
   :fibo-fbc-dae-dbt/DayCountConvention-30E360,
   :fibo-fbc-dae-dbt/hasInterestPaymentFrequency :fibo-ind-ir-ir/OneYear,
   :fibo-fbc-dae-dbt/hasInterestRate
   :fibo-der-rtd-irsind/ContractLeg1-IY7VKEUR45886-InterestRate,
   :fibo-fnd-dt-bd/hasBusinessDayAdjustment
   :fibo-der-rtd-irsind/EuropeanCentralBankBBusinessDayAdjustment,
   :rdf/type #{:fibo-fbc-dae-dbt/InterestPaymentTerms :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"},
   :rdfs/label "contract leg 1 interest payment terms IY7VKEUR45886",
   :skos/definition
   "interest payment terms for contract IY7VKEUR45886 swap leg 1 that is a fixed interest rate leg"})

(def ContractLeg1-IY7VKEUR45886-InterestRate
  {:db/ident :fibo-der-rtd-irsind/ContractLeg1-IY7VKEUR45886-InterestRate,
   :fibo-fnd-acc-cur/hasRateValue 1.0579M,
   :rdf/type #{:fibo-fbc-dae-dbt/FixedInterestRate :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"},
   :rdfs/label "contract leg 1 IY7VKEUR45886 fixed interest rate"})

(def ContractLeg1-IY7VKEUR45886-NotionalAmount
  {:db/ident :fibo-der-rtd-irsind/ContractLeg1-IY7VKEUR45886-NotionalAmount,
   :fibo-fnd-acc-cur/hasAmount 1286805,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-fnd-acc-cur/MonetaryAmount :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"},
   :rdfs/label "contract leg 1 IY7VKEUR45886 notional amount"})

(def ContractLeg1-IY7VKEUR45886-TerminationDate
  {:cmns-dt/hasDateValue "2025-08-17",
   :db/ident :fibo-der-rtd-irsind/ContractLeg1-IY7VKEUR45886-TerminationDate,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"},
   :rdfs/label "contract leg 1 IY7VKEUR45886 termination date"})

(def ContractLeg2-IY7VKEUR45886
  {:cmns-av/explanatoryNote
   "Need to create the interest rate reset schedule or add a simple payment frequency, need a separate property for reference interest rate, need rate tenor",
   :db/ident :fibo-der-rtd-irsind/ContractLeg2-IY7VKEUR45886,
   :fibo-fbc-dae-dbt/hasInterestRate
   :fibo-der-rtd-irsind/ContractLeg2-IY7VKEUR45886-InterestRate,
   :fibo-fnd-acc-cur/hasNotionalAmount
   :fibo-der-rtd-irsind/ContractLeg2-IY7VKEUR45886-NotionalAmount,
   :fibo-fnd-agr-ctr/hasEffectiveDate
   :fibo-der-rtd-irsind/ContractLeg2-IY7VKEUR45886-EffectiveDate,
   :fibo-fnd-arr-doc/hasTerminationDate
   :fibo-der-rtd-irsind/ContractLeg2-IY7VKEUR45886-TerminationDate,
   :fibo-fnd-pas-pas/hasBuyer :fibo-der-rtd-irsind/SwapContractParty-A,
   :fibo-fnd-pas-pas/hasSeller
   :fibo-der-rtd-irsind/SwapContractParty-ZZZWWK96TRQY0F2IY7VK,
   :fibo-fnd-rel-rel/isMandatedBy :fibo-der-rtd-irsind/Contract-IY7VKEUR45886,
   :fibo-sec-dbt-dbti/hasInterestPaymentTerms
   :fibo-der-rtd-irsind/ContractLeg2-IY7VKEUR45886-InterestPaymentTerms,
   :rdf/type #{:fibo-der-rtd-irswp/FloatingInterestRateLeg
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"},
   :rdfs/label "contract leg 2 IY7VKEUR45886",
   :skos/definition
   "contract IY7VKEUR45886 swap leg 2 that is a floating interest rate leg"})

(def ContractLeg2-IY7VKEUR45886-EffectiveDate
  {:cmns-dt/hasDateValue "2015-12-12",
   :db/ident :fibo-der-rtd-irsind/ContractLeg2-IY7VKEUR45886-EffectiveDate,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"},
   :rdfs/label "contract leg 2 IY7VKEUR45886 effective date"})

(def ContractLeg2-IY7VKEUR45886-InterestPaymentTerms
  {:db/ident
   :fibo-der-rtd-irsind/ContractLeg2-IY7VKEUR45886-InterestPaymentTerms,
   :fibo-fbc-dae-dbt/hasAccrualBasis
   :fibo-fbc-dae-dbt/DayCountConvention-30E360,
   :fibo-fbc-dae-dbt/hasInterestPaymentFrequency :fibo-ind-ir-ir/SixMonths,
   :fibo-fbc-dae-dbt/hasInterestRate
   :fibo-der-rtd-irsind/ContractLeg2-IY7VKEUR45886-InterestRate,
   :fibo-fnd-dt-bd/hasBusinessDayAdjustment
   :fibo-der-rtd-irsind/EuropeanCentralBankBBusinessDayAdjustment,
   :rdf/type #{:fibo-fbc-dae-dbt/InterestPaymentTerms :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"},
   :rdfs/label "contract leg 2 interest payment terms IY7VKEUR45886",
   :skos/definition
   "interest payment terms for contract IY7VKEUR45886 swap leg 2 that is a floating interest rate leg"})

(def ContractLeg2-IY7VKEUR45886-InterestRate
  {:db/ident :fibo-der-rtd-irsind/ContractLeg2-IY7VKEUR45886-InterestRate,
   :fibo-fnd-acc-cur/hasRateValue 0.309M,
   :rdf/type #{:owl/NamedIndividual :fibo-fbc-dae-dbt/FloatingInterestRate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"},
   :rdfs/label "contract leg 2 IY7VKEUR45886 floating interest rate"})

(def ContractLeg2-IY7VKEUR45886-NotionalAmount
  {:db/ident :fibo-der-rtd-irsind/ContractLeg2-IY7VKEUR45886-NotionalAmount,
   :fibo-fnd-acc-cur/hasAmount 1286805,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-fnd-acc-cur/MonetaryAmount :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"},
   :rdfs/label "contract leg 2 IY7VKEUR45886 notional amount"})

(def ContractLeg2-IY7VKEUR45886-TerminationDate
  {:cmns-dt/hasDateValue "2025-08-17",
   :db/ident :fibo-der-rtd-irsind/ContractLeg2-IY7VKEUR45886-TerminationDate,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"},
   :rdfs/label "contract leg 2 IY7VKEUR45886 termination date"})

(def EuropeanCentralBankBBusinessDayAdjustment
  {:db/ident :fibo-der-rtd-irsind/EuropeanCentralBankBBusinessDayAdjustment,
   :fibo-fnd-dt-bd/hasBusinessDayConvention
   :fibo-fnd-dt-bd/BusinessDayModifiedFollowing,
   :fibo-fnd-plc-loc/hasBusinessCenter :fibo-fbc-fct-bci/Frankfurt,
   :rdf/type #{:fibo-fnd-dt-bd/BusinessDayAdjustment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"},
   :rdfs/label "European Central Bank business day adjustment",
   :skos/definition "business day adjustment for the ECB"})

(def ISIN-ZZ216659451
  {:cmns-id/identifies :fibo-der-rtd-irsind/Contract-IY7VKEUR45886,
   :db/ident :fibo-der-rtd-irsind/ISIN-ZZ216659451,
   :fibo-fnd-rel-rel/hasTag "ZZ216659451",
   :rdf/type #{:fibo-sec-sec-id/InternationalSecuritiesIdentificationNumber
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"},
   :rdfs/label "ZZ216659451",
   :skos/definition "ISIN for sample swap contract IY7VKEUR45886"})

(def IY7VKEUR45886
  {:cmns-id/identifies :fibo-der-rtd-irsind/Contract-IY7VKEUR45886,
   :db/ident :fibo-der-rtd-irsind/IY7VKEUR45886,
   :fibo-fnd-rel-rel/hasTag "IY7VKEUR45886",
   :rdf/type #{:fibo-der-drc-swp/UniqueSwapIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"},
   :rdfs/label "IY7VKEUR45886",
   :skos/definition
   "unique swap identifier for sample swap contract IY7VKEUR45886"})

(def PortfolioAlpha
  {:db/ident :fibo-der-rtd-irsind/PortfolioAlpha,
   :rdf/type #{:fibo-sec-sec-ast/Portfolio :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"},
   :rdfs/label "portfolio Alpha",
   :skos/definition "sample contract portfolio Alpha"})

(def PortfolioBeta
  {:db/ident :fibo-der-rtd-irsind/PortfolioBeta,
   :rdf/type #{:fibo-sec-sec-ast/Portfolio :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"},
   :rdfs/label "portfolio Beta",
   :skos/definition "sample contract portfolio Beta"})

(def PortfolioDelta
  {:db/ident :fibo-der-rtd-irsind/PortfolioDelta,
   :rdf/type #{:fibo-sec-sec-ast/Portfolio :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"},
   :rdfs/label "portfolio Delta",
   :skos/definition "sample contract portfolio Delta"})

(def PortfolioGamma
  {:db/ident :fibo-der-rtd-irsind/PortfolioGamma,
   :rdf/type #{:fibo-sec-sec-ast/Portfolio :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"},
   :rdfs/label "portfolio Gamma",
   :skos/definition "sample contract portfolio Gamma"})

(def SecuritiesTransaction-IY7VKEUR45886
  {:cmns-av/explanatoryNote
   "Need to create the trade event - this is the activity (maybe we should rename these now? in FND to activity and event?) and add lifecycle elements - date and time, status of the trade and settlement status",
   :cmns-cxtdsg/appliesTo :fibo-der-rtd-irsind/Contract-IY7VKEUR45886,
   :db/ident :fibo-der-rtd-irsind/SecuritiesTransaction-IY7VKEUR45886,
   :fibo-fbc-pas-fpas/isFacilitatedBy :fibo-der-rtd-irsind/Trader-J_Adams,
   :rdf/type #{:owl/NamedIndividual :fibo-fbc-fi-fi/SecuritiesTransaction},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"},
   :rdfs/label "securities transaction IY7VKEUR45886",
   :skos/definition "securities transaction for contract IY7VKEUR45886"})

(def SwapContractParty-A
  {:db/ident :fibo-der-rtd-irsind/SwapContractParty-A,
   :rdf/type #{:fibo-der-drc-swp/SwapParty :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"},
   :rdfs/label "swap contract party A",
   :skos/definition
   "swap contract party A for all of the sample contracts in the sample swap data"})

(def SwapContractParty-ZZZWWK96TRQY0F2IY7VK
  {:db/ident :fibo-der-rtd-irsind/SwapContractParty-ZZZWWK96TRQY0F2IY7VK,
   :rdf/type #{:fibo-der-drc-swp/SwapParty :fibo-fnd-agr-ctr/Counterparty
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"},
   :rdfs/label "swap contract party ZZZWWK96TRQY0F2IY7VK",
   :skos/definition "swap contract party ZZZWWK96TRQY0F2IY7VK"})

(def Trader-J_Adams
  {:db/ident :fibo-der-rtd-irsind/Trader-J_Adams,
   :rdf/type #{:owl/NamedIndividual :fibo-fbc-pas-fpas/Trader},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"},
   :rdfs/label "trader J. Adams"})

(def urn:uuid:179f14ff-b242-53c3-b2b9-852132552198
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology provides examples of how to represent individuals for interest rate swaps and swap legs based on the Mizuho mocked-up sample data provided in the FIBO wiki.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/InterestRates/CommonInterestRates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/RateDerivatives/IRSwaps/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/InterestRates/InterestRates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/Swaps/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/DebtInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecurityAssets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/ISO4217-CurrencyCodes/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIdentification/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/BusinessDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/BusinessCentersIndividuals/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/RateDerivatives/IRSwapExampleIndividuals/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Interest Rate Swap Example Individuals Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals.rdf version of this ontology was modified to move the property 'exchanges' to FND given that it could be applied more generally than with respect to swaps only."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals.rdf version of this ontology was modified to correct properties that were modified in the main ontology but not in the examples."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"})