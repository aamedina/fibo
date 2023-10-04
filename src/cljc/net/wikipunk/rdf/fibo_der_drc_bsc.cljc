(ns net.wikipunk.rdf.fibo-der-drc-bsc
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-der-drc-bsc"
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
     "fibo-fbc-dae-dbt"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
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
     "fibo-fnd-arr-asmt"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
     "fibo-fnd-pas-pas"
     "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/",
     "fibo-fnd-pas-psch"
     "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
     "fibo-fnd-rel-rel"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
     "fibo-fnd-utl-alx"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "fibo-ind-ei-ei"
     "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/",
     "fibo-ind-fx-fx"
     "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
     "fibo-ind-ind-ind"
     "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/",
     "fibo-sec-sec-lst"
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "skos" "http://www.w3.org/2004/02/skos/core#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-der-drc-bsc",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/DerivativesContracts/DerivativesBasics/"}
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines basic terminology common to derivative and over-the-counter (OTC) contracts.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/Markets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Quantities/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/Indicators/Indicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/InstrumentPricing/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Agreements/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/EconomicIndicators/EconomicIndicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Assessments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/ProductsAndServices/PaymentsAndSchedules/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/ForeignExchange/ForeignExchange/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/Baskets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/DerivativesContracts/DerivativesBasics/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Derivatives Basics Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics.rdf version of this ontology was modified to address text formatting issues identified via hygiene testing."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics.rdf version of this ontology was modified to move designated contract market to the markets ontology in FBC and eliminate the notion of NonPhysicalUnderlier, which was determined to add unnecessary overhead."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics.rdf version of this ontology was modified to add the concept of a credit derivative, modify the notion of an underlying asset valuation to be a kind of value assessment, and modify the concept of valuation terms to be a subclass of derivative terms."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, and to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics.rdf version of this ontology was modified to eliminate hasThirdParty as a superproperty of hasCalculationAgent, which led to unintended reasoning consequences, added concepts and properties specific to settlement and valuation required for futures, forwards, and options, and moved general properties from forwards and swaps up to derivatives basics."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics.rdf version of this ontology was modified to replace hasContractSize with hasLotSize."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics.rdf version of this ontology was modified to loosen the domain of the hasUnderlier property, which could be either an instrument or leg, refine the definition of Underlier and hasUnderlier based on recent work on swaps, add the definition of a contract for difference (CFD), simplify the contract party hierarchy where the subclasses of contract party do not add semantics, add the concepts of underlying asset valuation and calculation agent, which are needed for various derivatives (moved from forwards) and eliminate the language related to transactions as well as the distinction between an OTC contract and exchange-traded contract / listed security, given how blurry the lines are today, across derivatives."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics.rdf version of this ontology was modified to eliminate duplication with concepts in LCC and eliminate a redundant subclass declaration in observable value."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"})

(def CalculationAgent
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The calculation agent can also establish the price for a structured product and may act as its guarantor and issuer. If the counterparty in a derivative transaction is a broker-dealer, then they will often act as the calculation agent."},
   :db/ident :fibo-der-drc-bsc/CalculationAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "calculation agent"},
   :rdfs/subClassOf :fibo-fbc-pas-fpas/ThirdPartyAgent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "party that is responsible for determining the value of a derivative and in some cases, determines how much the parties owe one another"}})

(def CashflowExpression
  {:db/ident :fibo-der-drc-bsc/CashflowExpression,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"},
   :rdfs/label "cashflow expression",
   :rdfs/subClassOf :fibo-fnd-utl-alx/Expression,
   :skos/definition
   "expression that specifies a calculation of a cash flow as a component of a cashflow formula"})

(def CashflowFormula
  {:db/ident :fibo-der-drc-bsc/CashflowFormula,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"},
   :rdfs/label "cashflow formula",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-utl-alx/hasExpression,
                       :owl/someValuesFrom :fibo-der-drc-bsc/CashflowExpression,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-utl-alx/Formula},
   :skos/definition
   "formula for determining cashflows for a derivative instrument"})

(def CashflowTerms
  {:db/ident :fibo-der-drc-bsc/CashflowTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"},
   :rdfs/label "cashflow terms",
   :rdfs/subClassOf #{:fibo-fbc-dae-dbt/DebtTerms
                      :fibo-der-drc-bsc/DerivativeTerms},
   :skos/definition
   "terms setting out a cashflow structure of payments committed to by one party to a contract",
   :skos/editorialNote
   "Swap cashflows are known as Swapstreams and are the terms for payment to and from either party. These are defined in swap transaction messages and represent the terms of the contract implied by that transaction. Options (Nordea reviews): Cashflows are defined as Payouts. This is not the same as a model of a cashflow which is a consequence of applying some legal term for payment of interest or principal, but is a commitment expressed in purely cashflow terms. Review this though. Payout terms include: Values - values can only go up or down; Static values are defined for limits and the like. i.e. Constraints (and direction) - this covers caps and floors - these are read upward or downward Conditionality Formula relations (Input and Output): - these are values - these may have a cap or a floor on them also - these also may have Multiplication - there is also fixed margin - may have addition or substraction between these Linearity in covered in the above Timing / expiry Observaton (not terms): Probability Sensitivity"})

(def ContractForDifference
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "CFD"},
   :cmns-av/adaptedFrom
   #{{:rdf/value
      "ISO 10962:2019, Securities and related financial instruments - Classification of financial instruments (CFI) code"}
     {:xsd/anyURI "https://www.nasdaq.com/glossary/c/contract-for-difference"}},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "These contracts can also be on the difference of two assets' prices. They can also be on the difference of a single asset of different maturities (like a bond or futures contracts)."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "spread trading"},
   :db/ident :fibo-der-drc-bsc/ContractForDifference,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "contract for difference"},
   :rdfs/subClassOf :fibo-fbc-fi-fi/DerivativeInstrument,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "cash-settled derivative where the parties agree to exchange on the maturity of the contract the difference between the current value of the underlying asset and the initial value of that asset when the contract is initiated"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "For example, suppose the initial price of share XYZ is $100 and a CFD for 1000 shares is exchanged. Both the buyer and seller must post some margin. If the price goes to $105, then the buyer gets $5,000 from the seller. If the price goes to $95, the buyer pays the seller $5,000. This contract avoids ownership of the stock and all the associated transactions issues (like stamp taxes). The contract also allows for leverage (typically 10:1) because the margin that must be posted is only a fraction of the value of the underlying asset."}})

(def CreditDerivative
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The third party accepts the risk in return for payment, known as the premium."},
   :db/ident :fibo-der-drc-bsc/CreditDerivative,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit derivative"},
   :rdfs/subClassOf :fibo-fbc-fi-fi/DerivativeInstrument,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "derivative instrument that is a privately held, negotiable bilateral contract traded over-the-counter (OTC) between two parties in a creditor/debtor relationship, enabling the creditor to effectively transfer some or all of the risk of a debtor defaulting to a third party"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Examples include credit default swaps (CDS), collateralized debt obligations (CDO), total return swaps, and credit spread options and forwards."}})

(def DerivativeSettlementTerms
  {:db/ident :fibo-der-drc-bsc/DerivativeSettlementTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"},
   :rdfs/label "derivative settlement terms",
   :rdfs/subClassOf
   #{{:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fnd-acc-cur/MonetaryPrice,
      :owl/onProperty :fibo-der-drc-bsc/hasUnderlyingAssetPrice,
      :rdf/type       :owl/Restriction} :fibo-der-drc-bsc/DerivativeTerms
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
      :owl/onProperty :fibo-der-drc-bsc/hasAdditionalCosts,
      :rdf/type       :owl/Restriction} :fibo-fbc-pas-fpas/SettlementTerms},
   :skos/definition
   "settlement terms specifying additional details with respect to what is to be delivered when, to whom, under what conditions at the time of settlement"})

(def DerivativeTerms
  {:db/ident :fibo-der-drc-bsc/DerivativeTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"},
   :rdfs/label "derivative terms",
   :rdfs/subClassOf :fibo-fnd-agr-ctr/ContractualCommitment,
   :skos/definition
   "contractual terms specific to derivative contracts, including terms related to payments and delivery between parties"})

(def DerivativesClearingOrganization
  {:cmns-av/abbreviation "DCO",
   :cmns-av/adaptedFrom
   {:xsd/anyURI
    "http://www.cftc.gov/IndustryOversight/ClearingOrganizations/index.htm"},
   :cmns-av/explanatoryNote
   "Substitution may be done through contract novation, for example. A derivatives clearing organization (DCO) also arranges or provides, on a multilateral basis, for the settlement or netting of obligations, or otherwise provides clearing services or arrangements that mutualize or transfer credit risk among participants.",
   :db/ident :fibo-der-drc-bsc/DerivativesClearingOrganization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"},
   :rdfs/label "derivatives clearing organization",
   :rdfs/subClassOf :fibo-fbc-fct-fse/ClearingHouse,
   :skos/definition
   "clearing house that enables parties to substitute the credit of the DCO for the credit of the parties"})

(def IntroducingBroker
  {:cmns-av/abbreviation "IB",
   :cmns-av/adaptedFrom
   {:xsd/anyURI
    "http://www.cftc.gov/IndustryOversight/Intermediaries/index.htm"},
   :cmns-av/explanatoryNote
   "Introducing brokers do not accept money, securities, or property (or extend credit in lieu thereof) to margin, guarantee, or secure any trades or contracts that result or may result.",
   :db/ident :fibo-der-drc-bsc/IntroducingBroker,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"},
   :rdfs/label "introducing broker",
   :rdfs/subClassOf #{:fibo-fbc-pas-fpas/Broker
                      :fibo-fbc-fct-fse/NonDepositoryInstitution},
   :skos/definition
   "broker that solicits or accepts orders for derivatives that are traded on or subject to the rules of an exchange"})

(def ObservableValue
  {:cmns-av/explanatoryNote
   "Derivatives, such as certain exotics, can be based on values ascribed to virtually anything, including weather. Typically, however, an observable value refers to something that can be readily observed in the marketplace, such as a quoted rate (e.g., interest rate, exchange rate), index value, commodity price, stock price, economic indicator, or something similar as of some point in time.",
   :db/ident :fibo-der-drc-bsc/ObservableValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"},
   :rdfs/label "observable value",
   :rdfs/seeAlso {:xsd/anyURI "https://en.wikipedia.org/wiki/Fair_value"},
   :rdfs/subClassOf :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   "value for something discernible and for which evidence can be obtained"})

(def OverTheCounterInstrument
  {:cmns-av/abbreviation "OTC instrument",
   :db/ident :fibo-der-drc-bsc/OverTheCounterInstrument,
   :owl/disjointWith :fibo-sec-sec-lst/ListedSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"},
   :rdfs/label "over-the-counter instrument",
   :rdfs/subClassOf #{:fibo-fnd-agr-ctr/MutualContractualAgreement
                      :fibo-fbc-fi-fi/FinancialInstrument},
   :skos/definition
   "financial instrument and bilateral contract that is not listed on an organized exchange"})

(def ParametricCashflowTerms
  {:db/ident :fibo-der-drc-bsc/ParametricCashflowTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"},
   :rdfs/label "parametric cashflow terms",
   :rdfs/subClassOf #{:fibo-der-drc-bsc/CashflowTerms
                      {:owl/onProperty     :fibo-fnd-utl-alx/hasFormula,
                       :owl/someValuesFrom :fibo-der-drc-bsc/CashflowFormula,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "terms for a set of cashflows defined according to a mathematical formula"})

(def PayingParty
  {:db/ident :fibo-der-drc-bsc/PayingParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"},
   :rdfs/label "paying party",
   :rdfs/subClassOf #{:fibo-fnd-pas-psch/Payer :fibo-fnd-agr-ctr/ContractParty
                      :fibo-fnd-pas-pas/Buyer},
   :skos/definition
   "party responsible for making payments in a transaction specified in a contract"})

(def ReceivingParty
  {:db/ident :fibo-der-drc-bsc/ReceivingParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"},
   :rdfs/label "receiving counterparty",
   :rdfs/subClassOf #{:fibo-fnd-pas-psch/Payee :fibo-fnd-agr-ctr/ContractParty
                      :fibo-fnd-pas-pas/Seller},
   :skos/definition
   "party that receives payments in a transaction specified in a contract"})

(def Underlier
  {:db/ident :fibo-der-drc-bsc/Underlier,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-fbc-fi-fi/Underlier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"}})

(def UnderlyingAssetValuation
  {:db/ident :fibo-der-drc-bsc/UnderlyingAssetValuation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "underlying asset valuation"},
   :rdfs/subClassOf #{:fibo-fnd-arr-asmt/ValueAssessment
                      {:owl/onProperty     :fibo-fnd-rel-rel/evaluates,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/Underlier,
                       :rdf/type           :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-der-drc-bsc/CalculationAgent,
                       :owl/onProperty :fibo-der-drc-bsc/hasCalculationAgent,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "assessment activity to estimate the value of an underlying asset of a derivative"}})

(def ValuationTerms
  {:db/ident :fibo-der-drc-bsc/ValuationTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"},
   :rdfs/label "valuation terms",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-arr-asmt/hasDateOfAssessment,
      :owl/someValuesFrom :cmns-dt/ExplicitDate,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-rel-rel/involves,
      :owl/someValuesFrom :fibo-der-drc-bsc/UnderlyingAssetValuation,
      :rdf/type           :owl/Restriction} :fibo-der-drc-bsc/DerivativeTerms},
   :skos/definition
   "contract terms specific to valuation of the underlying asset(s)"})

(def hasAdditionalCosts
  {:db/ident :fibo-der-drc-bsc/hasAdditionalCosts,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has additional costs"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates costs, such as up front costs, brokerage fees and the like, that must be paid on delivery"}})

(def hasCalculationAgent
  {:db/ident :fibo-der-drc-bsc/hasCalculationAgent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has calculation agent"},
   :rdfs/range :fibo-der-drc-bsc/CalculationAgent,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/isProvidedBy,
   :skos/definition
   "indicates the party that is responsible for determining the value of a derivative"})

(def hasFirstDeliveryDate
  {:db/ident :fibo-der-drc-bsc/hasFirstDeliveryDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/SettlementTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has first delivery date"},
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf #{:cmns-dt/hasExplicitDate :cmns-dt/hasStartDate},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "specifies the initial date in a range of dates by which the underlying asset (or some portion thereof) must be delivered in order for the terms of the contract to be fulfilled"}})

(def hasFirstNoticeDate
  {:db/ident :fibo-der-drc-bsc/hasFirstNoticeDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/SettlementTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has first notice date"},
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf #{:cmns-dt/hasExplicitDate :cmns-dt/hasStartDate},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "specifies the initial date on which a delivery notice can be issued"}})

(def hasLastDeliveryDate
  {:db/ident :fibo-der-drc-bsc/hasLastDeliveryDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/SettlementTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has last delivery date"},
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf #{:cmns-dt/hasEndDate :cmns-dt/hasExplicitDate},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "specifies the final date in a range of dates by which the underlying asset (or some portion thereof) must be delivered in order for the terms of the contract to be fulfilled"}})

(def hasLastNoticeDate
  {:db/ident :fibo-der-drc-bsc/hasLastNoticeDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/SettlementTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has last notice date"},
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf #{:cmns-dt/hasEndDate :cmns-dt/hasExplicitDate},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "specifies the final date on which a delivery notice can be issued"}})

(def hasSettlementTerms
  {:db/ident :fibo-der-drc-bsc/hasSettlementTerms,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/DerivativeInstrument,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has settlement terms"},
   :rdfs/range :fibo-fbc-pas-fpas/SettlementTerms,
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasContractualElement,
   :skos/definition
   "relates a derivative to contractual terms specific to the settlement process"})

(def hasTickValue
  {:db/ident :fibo-der-drc-bsc/hasTickValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/DerivativeInstrument,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has tick value"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the cash value of one tick, i.e., the minimum price change of the contract"}})

(def hasUnderlier
  {:db/ident :fibo-der-drc-bsc/hasUnderlier,
   :owl/deprecated true,
   :owl/equivalentProperty :fibo-fbc-fi-fi/hasUnderlier,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"}})

(def hasUnderlyingAssetPrice
  {:db/ident :fibo-der-drc-bsc/hasUnderlyingAssetPrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"},
   :rdfs/label "has underlying asset price",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryPrice,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasPrice,
   :skos/definition
   "specifies a price for something on which the contract is based"})

(def hasValuationTerms
  {:db/ident :fibo-der-drc-bsc/hasValuationTerms,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/DerivativeInstrument,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has valuation terms"},
   :rdfs/range :fibo-der-drc-bsc/ValuationTerms,
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasContractualElement,
   :skos/definition
   "relates a derivative to contractual terms specific to valuation of the underlying asset(s)"})

(def urn:uuid:6ae0b5c3-5faa-5e48-849e-554639925feb
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines basic terminology common to derivative and over-the-counter (OTC) contracts.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/Markets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Quantities/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/Indicators/Indicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/InstrumentPricing/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Agreements/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/EconomicIndicators/EconomicIndicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Assessments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/ProductsAndServices/PaymentsAndSchedules/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/ForeignExchange/ForeignExchange/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/Baskets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/DerivativesContracts/DerivativesBasics/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Derivatives Basics Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics.rdf version of this ontology was modified to address text formatting issues identified via hygiene testing."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics.rdf version of this ontology was modified to move designated contract market to the markets ontology in FBC and eliminate the notion of NonPhysicalUnderlier, which was determined to add unnecessary overhead."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics.rdf version of this ontology was modified to add the concept of a credit derivative, modify the notion of an underlying asset valuation to be a kind of value assessment, and modify the concept of valuation terms to be a subclass of derivative terms."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, and to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics.rdf version of this ontology was modified to eliminate hasThirdParty as a superproperty of hasCalculationAgent, which led to unintended reasoning consequences, added concepts and properties specific to settlement and valuation required for futures, forwards, and options, and moved general properties from forwards and swaps up to derivatives basics."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics.rdf version of this ontology was modified to replace hasContractSize with hasLotSize."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics.rdf version of this ontology was modified to loosen the domain of the hasUnderlier property, which could be either an instrument or leg, refine the definition of Underlier and hasUnderlier based on recent work on swaps, add the definition of a contract for difference (CFD), simplify the contract party hierarchy where the subclasses of contract party do not add semantics, add the concepts of underlying asset valuation and calculation agent, which are needed for various derivatives (moved from forwards) and eliminate the language related to transactions as well as the distinction between an OTC contract and exchange-traded contract / listed security, given how blurry the lines are today, across derivatives."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics.rdf version of this ontology was modified to eliminate duplication with concepts in LCC and eliminate a redundant subclass declaration in observable value."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"})