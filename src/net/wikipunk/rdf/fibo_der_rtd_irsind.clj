(ns net.wikipunk.rdf.fibo-der-rtd-irsind
  "This ontology provides examples of how to represent individuals for interest rate swaps and swap legs based on the Mizuho mocked-up sample data provided in the FIBO wiki."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :dcterms/abstract
   "This ontology provides examples of how to represent individuals for interest rate swaps and swap legs based on the Mizuho mocked-up sample data provided in the FIBO wiki.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/InterestRates/InterestRates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIdentification/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/InterestRates/CommonInterestRates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/RateDerivatives/IRSwaps/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/DebtInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/BusinessDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/BusinessCentersIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecurityAssets/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/AgentsAndPeople/Agents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/ProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/Swaps/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/ISO4217-CurrencyCodes/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
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
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
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
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfa/prefix "fibo-der-rtd-irsind",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfs/label "Interest Rate Swap Example Individuals Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals.rdf version of this ontology was modified to correct properties that were modified in the main ontology but not in the examples."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals.rdf version of this ontology was modified to move the property 'exchanges' to FND given that it could be applied more generally than with respect to swaps only."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2018-2022 EDM Council, Inc."
                  "Copyright (c) 2018-2022 Object Management Group, Inc."],
   :sm/dependsOn ["https://spec.edmcouncil.org/fibo/ontology/FBC/"
                  "https://spec.edmcouncil.org/fibo/ontology/FND/"
                  "https://www.omg.org/spec/LCC/"
                  "https://spec.edmcouncil.org/fibo/ontology/SEC/"
                  "https://spec.edmcouncil.org/fibo/ontology/IND/"],
   :sm/fileAbbreviation "fibo-der-rtd-irsind",
   :sm/filename "IRSwapExampleIndividuals.rdf"})

(def Contract-IY7VKEUR45886
  "contract IY7VKEUR45886 that is a fixed/float, single currency interest rate swap"
  {:db/ident :fibo-der-rtd-irsind/Contract-IY7VKEUR45886,
   :fibo-fnd-agr-ctr/hasContractParty
   [:fibo-der-rtd-irsind/SwapContractParty-A
    :fibo-der-rtd-irsind/SwapContractParty-ZZZWWK96TRQY0F2IY7VK],
   :fibo-fnd-rel-rel/exchanges
   [:fibo-der-rtd-irsind/ContractLeg1-IY7VKEUR45886
    :fibo-der-rtd-irsind/ContractLeg2-IY7VKEUR45886],
   :fibo-fnd-rel-rel/isIncludedIn :fibo-der-rtd-irsind/PortfolioAlpha,
   :lcc-lr/isIdentifiedBy [:fibo-der-rtd-irsind/IY7VKEUR45886
                           :fibo-der-rtd-irsind/ISIN-ZZ216659451],
   :rdf/type [:fibo-der-rtd-irswp/FixedFloatSingleCurrencyInterestRateSwap
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfs/label "contract IY7VKEUR45886",
   :skos/definition
   "contract IY7VKEUR45886 that is a fixed/float, single currency interest rate swap"})

(def ContractLeg1-IY7VKEUR45886
  "contract IY7VKEUR45886 swap leg 1 that is a fixed interest rate leg"
  {:db/ident :fibo-der-rtd-irsind/ContractLeg1-IY7VKEUR45886,
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
   :fibo-fnd-utl-av/explanatoryNote
   "Need to create the 1st period fixing date, payment days offset, discount notional amount, average remaining notional currency, net present value currency (pair, of type monetary amount)",
   :fibo-sec-dbt-dbti/hasInterestPaymentTerms
   :fibo-der-rtd-irsind/ContractLeg1-IY7VKEUR45886-InterestPaymentTerms,
   :rdf/type [:fibo-der-rtd-irswp/FixedInterestRateLeg :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfs/label "contract leg 1 IY7VKEUR45886",
   :skos/definition
   "contract IY7VKEUR45886 swap leg 1 that is a fixed interest rate leg"})

(def ContractLeg1-IY7VKEUR45886-EffectiveDate
  "contract leg 1 IY7VKEUR45886 effective date"
  {:db/ident :fibo-der-rtd-irsind/ContractLeg1-IY7VKEUR45886-EffectiveDate,
   :fibo-fnd-dt-fd/hasDateValue "2015-12-12",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfs/label "contract leg 1 IY7VKEUR45886 effective date"})

(def ContractLeg1-IY7VKEUR45886-InterestPaymentTerms
  "interest payment terms for contract IY7VKEUR45886 swap leg 1 that is a fixed interest rate leg"
  {:db/ident
   :fibo-der-rtd-irsind/ContractLeg1-IY7VKEUR45886-InterestPaymentTerms,
   :fibo-fbc-dae-dbt/hasAccrualBasis
   :fibo-fbc-dae-dbt/DayCountConvention-30E360,
   :fibo-fbc-dae-dbt/hasInterestPaymentFrequency :fibo-ind-ir-ir/OneYear,
   :fibo-fbc-dae-dbt/hasInterestRate
   :fibo-der-rtd-irsind/ContractLeg1-IY7VKEUR45886-InterestRate,
   :fibo-fnd-dt-bd/hasBusinessDayAdjustment
   :fibo-der-rtd-irsind/EuropeanCentralBankBBusinessDayAdjustment,
   :rdf/type [:fibo-fbc-dae-dbt/InterestPaymentTerms :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfs/label "contract leg 1 interest payment terms IY7VKEUR45886",
   :skos/definition
   "interest payment terms for contract IY7VKEUR45886 swap leg 1 that is a fixed interest rate leg"})

(def ContractLeg1-IY7VKEUR45886-InterestRate
  "contract leg 1 IY7VKEUR45886 fixed interest rate"
  {:db/ident :fibo-der-rtd-irsind/ContractLeg1-IY7VKEUR45886-InterestRate,
   :fibo-fnd-acc-cur/hasRateValue 1.0579M,
   :rdf/type [:fibo-fbc-dae-dbt/FixedInterestRate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfs/label "contract leg 1 IY7VKEUR45886 fixed interest rate"})

(def ContractLeg1-IY7VKEUR45886-NotionalAmount
  "contract leg 1 IY7VKEUR45886 notional amount"
  {:db/ident :fibo-der-rtd-irsind/ContractLeg1-IY7VKEUR45886-NotionalAmount,
   :fibo-fnd-acc-cur/hasAmount 1286805,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-fnd-acc-cur/MonetaryAmount :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfs/label "contract leg 1 IY7VKEUR45886 notional amount"})

(def ContractLeg1-IY7VKEUR45886-TerminationDate
  "contract leg 1 IY7VKEUR45886 termination date"
  {:db/ident :fibo-der-rtd-irsind/ContractLeg1-IY7VKEUR45886-TerminationDate,
   :fibo-fnd-dt-fd/hasDateValue "2025-08-17",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfs/label "contract leg 1 IY7VKEUR45886 termination date"})

(def ContractLeg2-IY7VKEUR45886
  "contract IY7VKEUR45886 swap leg 2 that is a floating interest rate leg"
  {:db/ident :fibo-der-rtd-irsind/ContractLeg2-IY7VKEUR45886,
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
   :fibo-fnd-utl-av/explanatoryNote
   "Need to create the interest rate reset schedule or add a simple payment frequency, need a separate property for reference interest rate, need rate tenor",
   :fibo-sec-dbt-dbti/hasInterestPaymentTerms
   :fibo-der-rtd-irsind/ContractLeg2-IY7VKEUR45886-InterestPaymentTerms,
   :rdf/type [:owl/NamedIndividual :fibo-der-rtd-irswp/FloatingInterestRateLeg],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfs/label "contract leg 2 IY7VKEUR45886",
   :skos/definition
   "contract IY7VKEUR45886 swap leg 2 that is a floating interest rate leg"})

(def ContractLeg2-IY7VKEUR45886-EffectiveDate
  "contract leg 2 IY7VKEUR45886 effective date"
  {:db/ident :fibo-der-rtd-irsind/ContractLeg2-IY7VKEUR45886-EffectiveDate,
   :fibo-fnd-dt-fd/hasDateValue "2015-12-12",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfs/label "contract leg 2 IY7VKEUR45886 effective date"})

(def ContractLeg2-IY7VKEUR45886-InterestPaymentTerms
  "interest payment terms for contract IY7VKEUR45886 swap leg 2 that is a floating interest rate leg"
  {:db/ident
   :fibo-der-rtd-irsind/ContractLeg2-IY7VKEUR45886-InterestPaymentTerms,
   :fibo-fbc-dae-dbt/hasAccrualBasis
   :fibo-fbc-dae-dbt/DayCountConvention-30E360,
   :fibo-fbc-dae-dbt/hasInterestPaymentFrequency :fibo-ind-ir-ir/SixMonths,
   :fibo-fbc-dae-dbt/hasInterestRate
   :fibo-der-rtd-irsind/ContractLeg2-IY7VKEUR45886-InterestRate,
   :fibo-fnd-dt-bd/hasBusinessDayAdjustment
   :fibo-der-rtd-irsind/EuropeanCentralBankBBusinessDayAdjustment,
   :rdf/type [:fibo-fbc-dae-dbt/InterestPaymentTerms :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfs/label "contract leg 2 interest payment terms IY7VKEUR45886",
   :skos/definition
   "interest payment terms for contract IY7VKEUR45886 swap leg 2 that is a floating interest rate leg"})

(def ContractLeg2-IY7VKEUR45886-InterestRate
  "contract leg 2 IY7VKEUR45886 floating interest rate"
  {:db/ident :fibo-der-rtd-irsind/ContractLeg2-IY7VKEUR45886-InterestRate,
   :fibo-fnd-acc-cur/hasRateValue 0.309M,
   :rdf/type [:fibo-fbc-dae-dbt/FloatingInterestRate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfs/label "contract leg 2 IY7VKEUR45886 floating interest rate"})

(def ContractLeg2-IY7VKEUR45886-NotionalAmount
  "contract leg 2 IY7VKEUR45886 notional amount"
  {:db/ident :fibo-der-rtd-irsind/ContractLeg2-IY7VKEUR45886-NotionalAmount,
   :fibo-fnd-acc-cur/hasAmount 1286805,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-fnd-acc-cur/MonetaryAmount :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfs/label "contract leg 2 IY7VKEUR45886 notional amount"})

(def ContractLeg2-IY7VKEUR45886-TerminationDate
  "contract leg 2 IY7VKEUR45886 termination date"
  {:db/ident :fibo-der-rtd-irsind/ContractLeg2-IY7VKEUR45886-TerminationDate,
   :fibo-fnd-dt-fd/hasDateValue "2025-08-17",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfs/label "contract leg 2 IY7VKEUR45886 termination date"})

(def EuropeanCentralBankBBusinessDayAdjustment
  "business day adjustment for the ECB"
  {:db/ident :fibo-der-rtd-irsind/EuropeanCentralBankBBusinessDayAdjustment,
   :fibo-fnd-dt-bd/hasBusinessDayConvention
   :fibo-fnd-dt-bd/BusinessDayModifiedFollowing,
   :fibo-fnd-plc-loc/hasBusinessCenter :fibo-fbc-fct-bci/Frankfurt,
   :rdf/type [:fibo-fnd-dt-bd/BusinessDayAdjustment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfs/label "European Central Bank business day adjustment",
   :skos/definition "business day adjustment for the ECB"})

(def ISIN-ZZ216659451
  "ISIN for sample swap contract IY7VKEUR45886"
  {:db/ident :fibo-der-rtd-irsind/ISIN-ZZ216659451,
   :lcc-lr/hasTag "ZZ216659451",
   :lcc-lr/identifies :fibo-der-rtd-irsind/Contract-IY7VKEUR45886,
   :rdf/type [:fibo-sec-sec-id/InternationalSecuritiesIdentificationNumber
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfs/label "ZZ216659451",
   :skos/definition "ISIN for sample swap contract IY7VKEUR45886"})

(def IY7VKEUR45886
  "unique swap identifier for sample swap contract IY7VKEUR45886"
  {:db/ident :fibo-der-rtd-irsind/IY7VKEUR45886,
   :lcc-lr/hasTag "IY7VKEUR45886",
   :lcc-lr/identifies :fibo-der-rtd-irsind/Contract-IY7VKEUR45886,
   :rdf/type [:fibo-der-drc-swp/UniqueSwapIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfs/label "IY7VKEUR45886",
   :skos/definition
   "unique swap identifier for sample swap contract IY7VKEUR45886"})

(def PortfolioAlpha
  "sample contract portfolio Alpha"
  {:db/ident :fibo-der-rtd-irsind/PortfolioAlpha,
   :rdf/type [:fibo-sec-sec-ast/Portfolio :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfs/label "portfolio Alpha",
   :skos/definition "sample contract portfolio Alpha"})

(def PortfolioBeta
  "sample contract portfolio Beta"
  {:db/ident :fibo-der-rtd-irsind/PortfolioBeta,
   :rdf/type [:fibo-sec-sec-ast/Portfolio :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfs/label "portfolio Beta",
   :skos/definition "sample contract portfolio Beta"})

(def PortfolioDelta
  "sample contract portfolio Delta"
  {:db/ident :fibo-der-rtd-irsind/PortfolioDelta,
   :rdf/type [:fibo-sec-sec-ast/Portfolio :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfs/label "portfolio Delta",
   :skos/definition "sample contract portfolio Delta"})

(def PortfolioGamma
  "sample contract portfolio Gamma"
  {:db/ident :fibo-der-rtd-irsind/PortfolioGamma,
   :rdf/type [:fibo-sec-sec-ast/Portfolio :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfs/label "portfolio Gamma",
   :skos/definition "sample contract portfolio Gamma"})

(def SecuritiesTransaction-IY7VKEUR45886
  "securities transaction for contract IY7VKEUR45886"
  {:db/ident :fibo-der-rtd-irsind/SecuritiesTransaction-IY7VKEUR45886,
   :fibo-fbc-pas-fpas/isFacilitatedBy :fibo-der-rtd-irsind/Trader-J_Adams,
   :fibo-fnd-rel-rel/appliesTo :fibo-der-rtd-irsind/Contract-IY7VKEUR45886,
   :fibo-fnd-utl-av/explanatoryNote
   "Need to create the trade event - this is the activity (maybe we should rename these now? in FND to activity and event?) and add lifecycle elements - date and time, status of the trade and settlement status",
   :rdf/type [:fibo-fbc-fi-fi/SecuritiesTransaction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfs/label "securities transaction IY7VKEUR45886",
   :skos/definition "securities transaction for contract IY7VKEUR45886"})

(def SwapContractParty-A
  "swap contract party A for all of the sample contracts in the sample swap data"
  {:db/ident :fibo-der-rtd-irsind/SwapContractParty-A,
   :rdf/type [:fibo-der-drc-swp/SwapParty :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfs/label "swap contract party A",
   :skos/definition
   "swap contract party A for all of the sample contracts in the sample swap data"})

(def SwapContractParty-ZZZWWK96TRQY0F2IY7VK
  "swap contract party ZZZWWK96TRQY0F2IY7VK"
  {:db/ident :fibo-der-rtd-irsind/SwapContractParty-ZZZWWK96TRQY0F2IY7VK,
   :rdf/type [:fibo-fnd-agr-ctr/Counterparty
              :fibo-der-drc-swp/SwapParty
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfs/label "swap contract party ZZZWWK96TRQY0F2IY7VK",
   :skos/definition "swap contract party ZZZWWK96TRQY0F2IY7VK"})

(def Trader-J_Adams
  "trader J. Adams"
  {:db/ident :fibo-der-rtd-irsind/Trader-J_Adams,
   :rdf/type [:fibo-fbc-pas-fpas/Trader :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfs/label "trader J. Adams"})