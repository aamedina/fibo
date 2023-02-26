(ns net.wikipunk.rdf.fibo-der-drc-bsc
  "This ontology defines basic terminology common to derivative and over-the-counter (OTC) contracts."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :dcterms/abstract
   "This ontology defines basic terminology common to derivative and over-the-counter (OTC) contracts.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/Baskets/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Quantities/QuantitiesAndUnits/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/InstrumentPricing/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/PaymentsAndSchedules/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/FinancialServicesEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesListings/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Assessments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/Markets/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/EconomicIndicators/EconomicIndicators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/ProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/ForeignExchange/ForeignExchange/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/Indicators/Indicators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Agreements/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/DerivativesBasics/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
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
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-pas-pas"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/",
    "fibo-fnd-pas-psch"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
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
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-der-drc-bsc",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label "Derivatives Basics Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics.rdf version of this ontology was modified to eliminate hasThirdParty as a superproperty of hasCalculationAgent, which led to unintended reasoning consequences, added concepts and properties specific to settlement and valuation required for futures, forwards, and options, and moved general properties from forwards and swaps up to derivatives basics."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics.rdf version of this ontology was modified to move designated contract market to the markets ontology in FBC and eliminate the notion of NonPhysicalUnderlier, which was determined to add unnecessary overhead."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics.rdf version of this ontology was modified to address text formatting issues identified via hygiene testing."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics.rdf version of this ontology was modified to eliminate duplication with concepts in LCC and eliminate a redundant subclass declaration in observable value."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics.rdf version of this ontology was modified to loosen the domain of the hasUnderlier property, which could be either an instrument or leg, refine the definition of Underlier and hasUnderlier based on recent work on swaps, add the definition of a contract for difference (CFD), simplify the contract party hierarchy where the subclasses of contract party do not add semantics, add the concepts of underlying asset valuation and calculation agent, which are needed for various derivatives (moved from forwards) and eliminate the language related to transactions as well as the distinction between an OTC contract and exchange-traded contract / listed security, given how blurry the lines are today, across derivatives."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics.rdf version of this ontology was modified to add the concept of a credit derivative, modify the notion of an underlying asset valuation to be a kind of value assessment, and modify the concept of valuation terms to be a subclass of derivative terms."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics.rdf version of this ontology was modified to replace hasContractSize with hasLotSize."]})

(def CalculationAgent
  "party that is responsible for determining the value of a derivative and in some cases, determines how much the parties owe one another"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The calculation agent can also establish the price for a structured product and may act as its guarantor and issuer. If the counterparty in a derivative transaction is a broker-dealer, then they will often act as the calculation agent."},
   :db/ident :fibo-der-drc-bsc/CalculationAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "calculation agent"},
   :rdfs/subClassOf :fibo-fbc-pas-fpas/ThirdPartyAgent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "party that is responsible for determining the value of a derivative and in some cases, determines how much the parties owe one another"}})

(def CashflowExpression
  "expression that specifies a calculation of a cash flow as a component of a cashflow formula"
  {:db/ident :fibo-der-drc-bsc/CashflowExpression,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label "cashflow expression",
   :rdfs/subClassOf :fibo-fnd-utl-alx/Expression,
   :skos/definition
   "expression that specifies a calculation of a cash flow as a component of a cashflow formula"})

(def CashflowFormula
  "formula for determining cashflows for a derivative instrument"
  {:db/ident :fibo-der-drc-bsc/CashflowFormula,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label "cashflow formula",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-utl-alx/hasExpression,
                      :owl/someValuesFrom :fibo-der-drc-bsc/CashflowExpression,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-utl-alx/Formula],
   :skos/definition
   "formula for determining cashflows for a derivative instrument"})

(def CashflowTerms
  "terms setting out a cashflow structure of payments committed to by one party to a contract"
  {:db/ident :fibo-der-drc-bsc/CashflowTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label "cashflow terms",
   :rdfs/subClassOf [:fibo-fbc-dae-dbt/DebtTerms
                     :fibo-der-drc-bsc/DerivativeTerms],
   :skos/definition
   "terms setting out a cashflow structure of payments committed to by one party to a contract",
   :skos/editorialNote
   "Swap cashflows are known as Swapstreams and are the terms for payment to and from either party. These are defined in swap transaction messages and represent the terms of the contract implied by that transaction. Options (Nordea reviews): Cashflows are defined as Payouts. This is not the same as a model of a cashflow which is a consequence of applying some legal term for payment of interest or principal, but is a commitment expressed in purely cashflow terms. Review this though. Payout terms include: Values - values can only go up or down; Static values are defined for limits and the like. i.e. Constraints (and direction) - this covers caps and floors - these are read upward or downward Conditionality Formula relations (Input and Output): - these are values - these may have a cap or a floor on them also - these also may have Multiplication - there is also fixed margin - may have addition or substraction between these Linearity in covered in the above Timing / expiry Observaton (not terms): Probability Sensitivity"})

(def ContractForDifference
  "cash-settled derivative where the parties agree to exchange on the maturity of the contract the difference between the current value of the underlying asset and the initial value of that asset when the contract is initiated"
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "CFD"},
   :cmns-av/adaptedFrom
   ["ISO 10962:2019, Securities and related financial instruments - Classification of financial instruments (CFI) code"
    "https://www.nasdaq.com/glossary/c/contract-for-difference"],
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "These contracts can also be on the difference of two assets' prices. They can also be on the difference of a single asset of different maturities (like a bond or futures contracts)."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "spread trading"},
   :db/ident :fibo-der-drc-bsc/ContractForDifference,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
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
  "derivative instrument that is a privately held, negotiable bilateral contract traded over-the-counter (OTC) between two parties in a creditor/debtor relationship, enabling the creditor to effectively transfer some or all of the risk of a debtor defaulting to a third party"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The third party accepts the risk in return for payment, known as the premium."},
   :db/ident :fibo-der-drc-bsc/CreditDerivative,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
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
  "settlement terms specifying additional details with respect to what is to be delivered when, to whom, under what conditions at the time of settlement"
  {:db/ident :fibo-der-drc-bsc/DerivativeSettlementTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label "derivative settlement terms",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-acc-cur/MonetaryPrice,
                      :owl/onProperty :fibo-der-drc-bsc/hasUnderlyingAssetPrice,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-der-drc-bsc/hasAdditionalCosts,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-pas-fpas/SettlementTerms
                     :fibo-der-drc-bsc/DerivativeTerms],
   :skos/definition
   "settlement terms specifying additional details with respect to what is to be delivered when, to whom, under what conditions at the time of settlement"})

(def DerivativeTerms
  "contractual terms specific to derivative contracts, including terms related to payments and delivery between parties"
  {:db/ident :fibo-der-drc-bsc/DerivativeTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label "derivative terms",
   :rdfs/subClassOf :fibo-fnd-agr-ctr/ContractualCommitment,
   :skos/definition
   "contractual terms specific to derivative contracts, including terms related to payments and delivery between parties"})

(def DerivativesClearingOrganization
  "clearing house that enables parties to substitute the credit of the DCO for the credit of the parties"
  {:cmns-av/abbreviation "DCO",
   :cmns-av/adaptedFrom
   "http://www.cftc.gov/IndustryOversight/ClearingOrganizations/index.htm",
   :cmns-av/explanatoryNote
   "Substitution may be done through contract novation, for example. A derivatives clearing organization (DCO) also arranges or provides, on a multilateral basis, for the settlement or netting of obligations, or otherwise provides clearing services or arrangements that mutualize or transfer credit risk among participants.",
   :db/ident :fibo-der-drc-bsc/DerivativesClearingOrganization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label "derivatives clearing organization",
   :rdfs/subClassOf :fibo-fbc-fct-fse/ClearingHouse,
   :skos/definition
   "clearing house that enables parties to substitute the credit of the DCO for the credit of the parties"})

(def IntroducingBroker
  "broker that solicits or accepts orders for derivatives that are traded on or subject to the rules of an exchange"
  {:cmns-av/abbreviation "IB",
   :cmns-av/adaptedFrom
   "http://www.cftc.gov/IndustryOversight/Intermediaries/index.htm",
   :cmns-av/explanatoryNote
   "Introducing brokers do not accept money, securities, or property (or extend credit in lieu thereof) to margin, guarantee, or secure any trades or contracts that result or may result.",
   :db/ident :fibo-der-drc-bsc/IntroducingBroker,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label "introducing broker",
   :rdfs/subClassOf [:fibo-fbc-pas-fpas/Broker
                     :fibo-fbc-fct-fse/NonDepositoryInstitution],
   :skos/definition
   "broker that solicits or accepts orders for derivatives that are traded on or subject to the rules of an exchange"})

(def ObservableValue
  "value for something discernible and for which evidence can be obtained"
  {:cmns-av/explanatoryNote
   "Derivatives, such as certain exotics, can be based on values ascribed to virtually anything, including weather. Typically, however, an observable value refers to something that can be readily observed in the marketplace, such as a quoted rate (e.g., interest rate, exchange rate), index value, commodity price, stock price, economic indicator, or something similar as of some point in time.",
   :db/ident :fibo-der-drc-bsc/ObservableValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label "observable value",
   :rdfs/seeAlso ["https://en.wikipedia.org/wiki/Fair_value"],
   :rdfs/subClassOf :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   "value for something discernible and for which evidence can be obtained"})

(def OverTheCounterInstrument
  "financial instrument and bilateral contract that is not listed on an organized exchange"
  {:cmns-av/abbreviation "OTC instrument",
   :db/ident :fibo-der-drc-bsc/OverTheCounterInstrument,
   :owl/disjointWith :fibo-sec-sec-lst/ListedSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label "over-the-counter instrument",
   :rdfs/subClassOf [:fibo-fnd-agr-ctr/MutualContractualAgreement
                     :fibo-fbc-fi-fi/FinancialInstrument],
   :skos/definition
   "financial instrument and bilateral contract that is not listed on an organized exchange"})

(def ParametricCashflowTerms
  "terms for a set of cashflows defined according to a mathematical formula"
  {:db/ident :fibo-der-drc-bsc/ParametricCashflowTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label "parametric cashflow terms",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-utl-alx/hasFormula,
                      :owl/someValuesFrom :fibo-der-drc-bsc/CashflowFormula,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-bsc/CashflowTerms],
   :skos/definition
   "terms for a set of cashflows defined according to a mathematical formula"})

(def PayingParty
  "party responsible for making payments in a transaction specified in a contract"
  {:db/ident :fibo-der-drc-bsc/PayingParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label "paying party",
   :rdfs/subClassOf [:fibo-fnd-pas-pas/Buyer
                     :fibo-fnd-pas-psch/Payer
                     :fibo-fnd-agr-ctr/ContractParty],
   :skos/definition
   "party responsible for making payments in a transaction specified in a contract"})

(def ReceivingParty
  "party that receives payments in a transaction specified in a contract"
  {:db/ident :fibo-der-drc-bsc/ReceivingParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label "receiving counterparty",
   :rdfs/subClassOf [:fibo-fnd-pas-pas/Seller
                     :fibo-fnd-pas-psch/Payee
                     :fibo-fnd-agr-ctr/ContractParty],
   :skos/definition
   "party that receives payments in a transaction specified in a contract"})

(def Underlier
  "something that can be assigned a value in the marketplace that forms the basis for a derivative instrument"
  {:cmns-av/explanatoryNote
   "Underlier means any rate (including interest and foreign exchange rates), currency, commodity, security, instrument of indebtedness, index, quantitative measure, occurrence or non-occurrence of an event, or other financial or economic interest, or property of any kind, or any interest therein or based on the value thereof, in or by reference to which any payment or delivery under a transaction is to be made or determined.",
   :db/ident :fibo-der-drc-bsc/Underlier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label "underlier",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-fbc-fi-fi/FinancialInstrument
                                            :fibo-fnd-pas-pas/Commodity
                                            :fibo-fbc-pas-fpas/Basket
                                            :fibo-ind-ind-ind/MarketRate
                                            :fibo-ind-ei-ei/EconomicIndicator
                                            :fibo-der-drc-bsc/ObservableValue
                                            :fibo-ind-fx-fx/QuotedExchangeRate],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-pty-rl/ThingInRole],
   :skos/definition
   "something that can be assigned a value in the marketplace that forms the basis for a derivative instrument"})

(def UnderlyingAssetValuation
  "assessment activity to estimate the value of an underlying asset of a derivative"
  {:db/ident :fibo-der-drc-bsc/UnderlyingAssetValuation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "underlying asset valuation"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/evaluates,
                      :owl/someValuesFrom :fibo-der-drc-bsc/Underlier,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-der-drc-bsc/CalculationAgent,
                      :owl/onProperty :fibo-der-drc-bsc/hasCalculationAgent,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-arr-asmt/ValueAssessment],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "assessment activity to estimate the value of an underlying asset of a derivative"}})

(def ValuationTerms
  "contract terms specific to valuation of the underlying asset(s)"
  {:db/ident :fibo-der-drc-bsc/ValuationTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label "valuation terms",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/involves,
                      :owl/someValuesFrom
                      :fibo-der-drc-bsc/UnderlyingAssetValuation,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-arr-asmt/hasDateOfAssessment,
                      :owl/someValuesFrom :fibo-fnd-dt-fd/ExplicitDate,
                      :rdf/type :owl/Restriction}
                     :fibo-der-drc-bsc/DerivativeTerms],
   :skos/definition
   "contract terms specific to valuation of the underlying asset(s)"})

(def hasAdditionalCosts
  "indicates costs, such as up front costs, brokerage fees and the like, that must be paid on delivery"
  {:db/ident :fibo-der-drc-bsc/hasAdditionalCosts,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has additional costs"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates costs, such as up front costs, brokerage fees and the like, that must be paid on delivery"}})

(def hasCalculationAgent
  "indicates the party that is responsible for determining the value of a derivative"
  {:db/ident :fibo-der-drc-bsc/hasCalculationAgent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has calculation agent"},
   :rdfs/range :fibo-der-drc-bsc/CalculationAgent,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/isProvidedBy,
   :skos/definition
   "indicates the party that is responsible for determining the value of a derivative"})

(def hasFirstDeliveryDate
  "specifies the initial date in a range of dates by which the underlying asset (or some portion thereof) must be delivered in order for the terms of the contract to be fulfilled"
  {:db/ident :fibo-der-drc-bsc/hasFirstDeliveryDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/SettlementTerms,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has first delivery date"},
   :rdfs/range :fibo-fnd-dt-fd/ExplicitDate,
   :rdfs/subPropertyOf [:fibo-fnd-dt-fd/hasStartDate
                        :fibo-fnd-dt-fd/hasExplicitDate],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "specifies the initial date in a range of dates by which the underlying asset (or some portion thereof) must be delivered in order for the terms of the contract to be fulfilled"}})

(def hasFirstNoticeDate
  "specifies the initial date on which a delivery notice can be issued"
  {:db/ident :fibo-der-drc-bsc/hasFirstNoticeDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/SettlementTerms,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has first notice date"},
   :rdfs/range :fibo-fnd-dt-fd/ExplicitDate,
   :rdfs/subPropertyOf [:fibo-fnd-dt-fd/hasStartDate
                        :fibo-fnd-dt-fd/hasExplicitDate],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "specifies the initial date on which a delivery notice can be issued"}})

(def hasLastDeliveryDate
  "specifies the final date in a range of dates by which the underlying asset (or some portion thereof) must be delivered in order for the terms of the contract to be fulfilled"
  {:db/ident :fibo-der-drc-bsc/hasLastDeliveryDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/SettlementTerms,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has last delivery date"},
   :rdfs/range :fibo-fnd-dt-fd/ExplicitDate,
   :rdfs/subPropertyOf [:fibo-fnd-dt-fd/hasExplicitDate
                        :fibo-fnd-dt-fd/hasEndDate],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "specifies the final date in a range of dates by which the underlying asset (or some portion thereof) must be delivered in order for the terms of the contract to be fulfilled"}})

(def hasLastNoticeDate
  "specifies the final date on which a delivery notice can be issued"
  {:db/ident :fibo-der-drc-bsc/hasLastNoticeDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/SettlementTerms,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has last notice date"},
   :rdfs/range :fibo-fnd-dt-fd/ExplicitDate,
   :rdfs/subPropertyOf [:fibo-fnd-dt-fd/hasExplicitDate
                        :fibo-fnd-dt-fd/hasEndDate],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "specifies the final date on which a delivery notice can be issued"}})

(def hasSettlementTerms
  "relates a derivative to contractual terms specific to the settlement process"
  {:db/ident :fibo-der-drc-bsc/hasSettlementTerms,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/DerivativeInstrument,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has settlement terms"},
   :rdfs/range :fibo-fbc-pas-fpas/SettlementTerms,
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasContractualElement,
   :skos/definition
   "relates a derivative to contractual terms specific to the settlement process"})

(def hasTickValue
  "indicates the cash value of one tick, i.e., the minimum price change of the contract"
  {:db/ident :fibo-der-drc-bsc/hasTickValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/DerivativeInstrument,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has tick value"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the cash value of one tick, i.e., the minimum price change of the contract"}})

(def hasUnderlier
  "relates a derivative to something on which the contract is based"
  {:cmns-av/usageNote
   "The domain of this property can be either a derivative instrument or, in the case of a swap contract, one leg of the swap.",
   :db/ident :fibo-der-drc-bsc/hasUnderlier,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label "has underlier",
   :rdfs/range :fibo-der-drc-bsc/Underlier,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition
   "relates a derivative to something on which the contract is based"})

(def hasUnderlyingAssetPrice
  "specifies a price for something on which the contract is based"
  {:db/ident :fibo-der-drc-bsc/hasUnderlyingAssetPrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label "has underlying asset price",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryPrice,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasPrice,
   :skos/definition
   "specifies a price for something on which the contract is based"})

(def hasValuationTerms
  "relates a derivative to contractual terms specific to valuation of the underlying asset(s)"
  {:db/ident :fibo-der-drc-bsc/hasValuationTerms,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/DerivativeInstrument,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has valuation terms"},
   :rdfs/range :fibo-der-drc-bsc/ValuationTerms,
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasContractualElement,
   :skos/definition
   "relates a derivative to contractual terms specific to valuation of the underlying asset(s)"})

(def ^{:private true} DerivativeInstrument
  {:db/ident        :fibo-fbc-fi-fi/DerivativeInstrument,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom :fibo-der-drc-bsc/DerivativeTerms,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-bsc/hasValuationTerms,
                      :owl/someValuesFrom :fibo-der-drc-bsc/ValuationTerms,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-bsc/hasUnderlier,
                      :owl/someValuesFrom :fibo-der-drc-bsc/Underlier,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-der-drc-bsc/hasSettlementTerms,
                      :owl/someValuesFrom :fibo-fbc-pas-fpas/SettlementTerms,
                      :rdf/type           :owl/Restriction}]})