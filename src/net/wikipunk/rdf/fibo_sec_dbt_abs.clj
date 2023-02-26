(ns net.wikipunk.rdf.fibo-sec-dbt-abs
  "Debt securities backed by a pool of assets, including loans of various kinds, credit card pools and home equity lines of credit, as well as esoteric assets."
  {:cmns-av/copyright "Copyright (c) 2015-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :dcterms/abstract
   "Debt securities backed by a pool of assets, including loans of various kinds, credit card pools and home equity lines of credit, as well as esoteric assets.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansSpecific/ConsumerLoans/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/EconomicIndicators/EconomicIndicators/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Funds/Funds/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/Pools/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/Indicators/Indicators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/PoolBackedSecurities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/Ownership/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Arrangements/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/Bonds/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/FunctionalEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/DebtInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/AssetBackedSecurities/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fnd-arr-arr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
    "fibo-fnd-oac-own"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
    "fibo-fnd-utl-alx"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-ei-ei"
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/",
    "fibo-ind-ind-ind"
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/",
    "fibo-loan-spc-cns"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/ConsumerLoans/",
    "fibo-sec-dbt-abs"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
    "fibo-sec-dbt-bnd"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/",
    "fibo-sec-dbt-dbti"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/",
    "fibo-sec-dbt-pbs"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/",
    "fibo-sec-sec-pls"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-dbt-abs",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Asset-backed Securities Ontology"}})

(def AutoLoanAssetBackedSecurity
  "asset-backed security issued by an auto finance company that is backed by an underlying pool of auto-related loans or leases"
  {:db/ident :fibo-sec-dbt-abs/AutoLoanAssetBackedSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "auto loan asset-backed security"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-dbt-abs/hasUnderlyingAssets,
                      :owl/someValuesFrom :fibo-sec-dbt-abs/AutoLoanPool,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-pbs/AssetBackedSecurity],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "asset-backed security issued by an auto finance company that is backed by an underlying pool of auto-related loans or leases"},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value    "Leases not shown at present. Added during later review."}})

(def AutoLoanPool
  "A loan pool covering automobile-related loans."
  {:db/ident :fibo-sec-dbt-abs/AutoLoanPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "auto loan pool"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-arr/hasConstituent,
                      :owl/someValuesFrom :fibo-loan-spc-cns/AutoLoan,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/DebtPool],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A loan pool covering automobile-related loans."}})

(def ControlledAmortizationBond
  "bond that is securitized using a controlled amortization structure"
  {:cmns-av/adaptedFrom
   "http://www.investinginbonds.com/learnmore.asp?catid=11&subcatid=57&id=15",
   :cmns-av/explanatoryNote
   "Revolving debt (primarily credit card receivables, but also HELOCs, trade receivables, dealer floor-plan loans and some leases) may be securitized using a controlled amortization structure. This is a method of providing investors with a relatively predictable repayment schedule, even though the underlying assets are nonamortizing. Controlled-amortization ABS resemble corporate bonds with a sinking fund. After a predetermined 'revolving' period during which only interest payments are made, these securities attempt to return principal to investors in a series of defined periodic payments that usually occur over less than a year. A risk inherent in this kind of ABS is an early amortization event. (See 'Early-Amortization Risk', on page 20.)",
   :db/ident :fibo-sec-dbt-abs/ControlledAmortizationBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label "controlled amortization bond",
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-dbt-dbti/hasRepaymentTerms,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-abs/ControlledAmortizationStructure,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-bnd/AmortizingBond],
   :skos/definition
   "bond that is securitized using a controlled amortization structure"})

(def ControlledAmortizationStructure
  "method of providing investors with a relatively predictable repayment schedule, even though the underlying assets are nonamortizing"
  {:db/ident :fibo-sec-dbt-abs/ControlledAmortizationStructure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label "controlled amortization structure",
   :rdfs/subClassOf :fibo-sec-dbt-bnd/BondAmortizationPaymentTerms,
   :skos/definition
   "method of providing investors with a relatively predictable repayment schedule, even though the underlying assets are nonamortizing"})

(def CreditCardAssetBackedSecurity
  "asset-backed security based on credit card receivables"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "Federal Deposit Insurance Corporation (FDIC) Credit Card Securitization Manual, available at https://www.fdic.gov/regulations/examinations/credit_card_securitization/ch2.html"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Credit card securitizations currently represent the primary funding vehicle for unsecured revolving consumer credit. Similar to mortgage and other asset securitizations, the financial institution that originates the credit card receivables sells a group of these receivables to a trust. The trust then creates and sells certificates backed by the credit card receivables to investors, which are predominately institutional investors. Very few credit card ABS are marketed to retail customers, primarily due to the complex nature of the transactions and the need to continually monitor various performance indices on the underlying receivables. The underlying credit card receivables generate income to support the interest payments on the certificates."},
   :db/ident :fibo-sec-dbt-abs/CreditCardAssetBackedSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit card asset-backed security"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-dbt-abs/hasUnderlyingAssets,
                      :owl/someValuesFrom :fibo-sec-dbt-abs/CreditCardPool,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-pbs/AssetBackedSecurity],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "asset-backed security based on credit card receivables"}})

(def CreditCardPool
  "pool of outstanding balances on designated accounts"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "Federal Deposit Insurance Corporation (FDIC) Credit Card Securitization Manual, available at https://www.fdic.gov/regulations/examinations/credit_card_securitization/ch2.html"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "In a credit card securitization transaction only the receivables are sold, not the accounts that generate the receivables. The financial institution retains legal ownership of the credit card accounts and can continue to change the terms on the accounts. Accounts corresponding to securitized loans are typically referred to as the designated accounts (or sometimes trust accounts). The initial outstanding balances on the designated accounts are sold to the trust as are the rights to any new charges on the designated accounts. Subsequently, as cardholder purchase activity generates more receivables on the designated accounts, these new receivables are purchased by the trust from the originating institution/seller/transferor. The trust uses the monthly principal payments received from the cardholders to acquire these new charges or receivables. When the securitization is initially set up, the originating institution/seller adds sufficient receivables to support the principal balance of the certificates plus an additional amount (seller's interest) that serves to absorb fluctuations in the outstanding balance of the receivables. The originating institution/seller will make subsequent additions to the trust in order to keep the seller's interest at the required level."},
   :db/ident :fibo-sec-dbt-abs/CreditCardPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit card pool"},
   :rdfs/subClassOf :fibo-sec-sec-pls/DebtPool,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "pool of outstanding balances on designated accounts"}})

(def EsotericAssetBackedSecurity
  "asset-backed security based on some underlying promised future cashflow"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Esoteric asset-backed securities have been built based on cash flows from movie revenues, royalty payments, aircraft landing slots, toll roads, and solar photovoltaics."},
   :db/ident :fibo-sec-dbt-abs/EsotericAssetBackedSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "esoteric asset-backed security"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-dbt-abs/hasUnderlyingCashflow,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-abs/PromisedCashFlowAsset,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-pbs/AssetBackedSecurity],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "asset-backed security based on some underlying promised future cashflow"}})

(def FullyAmortizingBond
  "amortizing bond that returns principal to investors over the life of the security"
  {:cmns-av/explanatoryNote
   ["These are typically backed by HELs, auto loans, manufactured-housing contracts and other fully amortizing assets. Prepayment risk is a key consideration with such ABS, although the rate of prepayment may vary considerably by the type of underlying asset."
    "Fully amortizing bonds are designed to closely reflect the full repayment of the underlying loans through scheduled interest and principal payments."],
   :db/ident :fibo-sec-dbt-abs/FullyAmortizingBond,
   :fibo-fnd-utl-av/definitionOrigin
   "http://www.investinginbonds.com/learnmore.asp?catid=11&subcatid=57&id=15",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label "fully amortizing bond",
   :rdfs/subClassOf :fibo-sec-dbt-bnd/AmortizingBond,
   :skos/definition
   "amortizing bond that returns principal to investors over the life of the security"})

(def HomeEquityLineOfCreditPool
  "home equity line of credit pool"
  {:db/ident :fibo-sec-dbt-abs/HomeEquityLineOfCreditPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "home equity line of credit pool"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-arr-arr/hasConstituent,
                      :owl/someValuesFrom
                      :fibo-loan-spc-cns/HomeEquityLineOfCredit,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-sec-pls/DebtPool]})

(def IndexAmortizingBond
  ""
  {:db/ident :fibo-sec-dbt-abs/IndexAmortizingBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label "index amortizing bond",
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-dbt-dbti/hasRepaymentTerms,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-abs/IndexLinkedPrincipalDeterminationTerms,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-bnd/AmortizingBond
                     :fibo-sec-dbt-abs/IndexBasedCouponBond],
   :skos/definition ""})

(def IndexBasedCouponBond
  "variable coupon bond with payments that fluctuate according to an \"index\" other than an interest rate, such as an economic indicator"
  {:db/ident :fibo-sec-dbt-abs/IndexBasedCouponBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label "index-based coupon bond",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-sec-dbt-dbti/hasInterestPaymentTerms,
     :owl/someValuesFrom :fibo-sec-dbt-abs/IndexLinkedCouponTerms,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-dae-dbt/hasInterestRate,
     :owl/someValuesFrom :fibo-sec-dbt-abs/IndexLinkedCoupon,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-bnd/VariableCouponBond],
   :skos/definition
   "variable coupon bond with payments that fluctuate according to an \"index\" other than an interest rate, such as an economic indicator",
   :skos/editorialNote
   "Might also be referred to as Index Linked, but more commonly the term Index Linked refers to principal. So this term has a made up name for this kind of bond, following OTPP review in which we dealt with the distinction between index linked interest and index linked principal amounts. ."})

(def IndexLinkedCoupon
  "index linked coupon"
  {:db/ident :fibo-sec-dbt-abs/IndexLinkedCoupon,
   :owl/disjointWith [:fibo-sec-dbt-abs/WACBondCoupon
                      :fibo-sec-dbt-abs/InflationBondVariableCoupon],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label "index linked coupon",
   :rdfs/subClassOf :fibo-sec-dbt-bnd/BondVariableCoupon})

(def IndexLinkedCouponTerms
  "index-linked coupon terms"
  {:db/ident :fibo-sec-dbt-abs/IndexLinkedCouponTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label "index-linked coupon terms",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-dae-dbt/isBasedOn,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-ind-ei-ei/EconomicIndicator
                                            :fibo-ind-ind-ind/MarketRate],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-bnd/VariableCouponTerms]})

(def IndexLinkedPrincipalDeterminationTerms
  "terms for payment of the principal that tie the principal amounts to some underlying index or interest rate"
  {:db/ident :fibo-sec-dbt-abs/IndexLinkedPrincipalDeterminationTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label "index-linked principal determination terms",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-sec-dbt-abs/specifiesIndexParameter,
     :owl/someValuesFrom {:owl/unionOf [:fibo-ind-ei-ei/EconomicIndicator
                                        :fibo-ind-ind-ind/MarketRate],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-utl-alx/hasExpression,
     :owl/someValuesFrom :fibo-sec-dbt-abs/PrincipalPaymentCalculation,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-dae-dbt/PrincipalRepaymentTerms],
   :skos/definition
   "terms for payment of the principal that tie the principal amounts to some underlying index or interest rate"})

(def InflationBondInterestPaymentTerms
  "terms for the payment of interest on an inflation bond"
  {:cmns-av/explanatoryNote
   "These may for example specify that the interest payments are by way of coupone calculated with reference to the inflation rate that is referenced for that bond, or they may not (for example they may specify a fixed coupon amount). Therefore these terms may specify any potential interest payment arrangement used on bonds.",
   :db/ident :fibo-sec-dbt-abs/InflationBondInterestPaymentTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label "inflation bond interest payment terms",
   :rdfs/subClassOf :fibo-sec-dbt-bnd/CouponPaymentTerms,
   :skos/definition "terms for the payment of interest on an inflation bond"})

(def InflationBondPrincipalRepaymentTerms
  "terms specifying how the principal amount on an inflation bond is to be paid down"
  {:cmns-av/explanatoryNote
   "Further notes: This is typically but not necessarily with reference to the Inflation rate that is referred to for this bond. Further model action: identify and model terms for the case where the bond principal repayments are not pegged to an inflation rate.",
   :db/ident :fibo-sec-dbt-abs/InflationBondPrincipalRepaymentTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label "inflation bond principal repayment terms",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-utl-alx/hasExpression,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-abs/InflationFactorExpression,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-abs/IndexLinkedPrincipalDeterminationTerms],
   :skos/definition
   "terms specifying how the principal amount on an inflation bond is to be paid down"})

(def InflationBondVariableCoupon
  "inflation bond variable coupon"
  {:db/ident :fibo-sec-dbt-abs/InflationBondVariableCoupon,
   :owl/disjointWith :fibo-sec-dbt-abs/WACBondCoupon,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label "inflation bond variable coupon",
   :rdfs/subClassOf :fibo-sec-dbt-bnd/BondVariableCoupon})

(def InflationBondVariableCouponTerms
  "inflation bond variable coupon terms"
  {:db/ident :fibo-sec-dbt-abs/InflationBondVariableCouponTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label "inflation bond variable coupon terms",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-utl-alx/hasExpression,
     :owl/someValuesFrom :fibo-sec-dbt-abs/InflationFactorExpression,
     :rdf/type           :owl/Restriction}
    {:owl/maxQualifiedCardinality 1,
     :owl/onClass    :fibo-sec-dbt-abs/InflationBondVariableCoupon,
     :owl/onProperty :fibo-fbc-dae-dbt/hasInterestRate,
     :rdf/type       :owl/Restriction}
    :fibo-sec-dbt-bnd/VariableCouponTerms]})

(def InflationFactorExpression
  "expression used to calculate the outstanding principal of the bond due to changes in the inflation rate"
  {:db/ident :fibo-sec-dbt-abs/InflationFactorExpression,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label "inflation factor expression",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
                      :owl/someValuesFrom :fibo-ind-ei-ei/InflationRate,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-utl-alx/Expression],
   :skos/definition
   "expression used to calculate the outstanding principal of the bond due to changes in the inflation rate"})

(def PrincipalPaymentCalculation
  "a formula for calculation of principal payments for certain kinds of bonds"
  {:db/ident :fibo-sec-dbt-abs/PrincipalPaymentCalculation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label "principal payment calculation",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
                      :owl/someValuesFrom :fibo-fbc-dae-dbt/Principal,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-utl-alx/Expression],
   :skos/definition
   "a formula for calculation of principal payments for certain kinds of bonds"})

(def PromisedCashFlowAsset
  "An asset which takes the form of some promised future cashflow. This may be securitized."
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "For example, exotic Cash ABS instruments may be created where the underlying asset is not a pool of securities or debt but a promised cash flow. People have securitized the cash flows of businesses, artists, mobile phone tower income, airplane leases, lotto receivables, etc."},
   :db/ident :fibo-sec-dbt-abs/PromisedCashFlowAsset,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "promised cash flow asset"},
   :rdfs/subClassOf :fibo-fnd-oac-own/Asset,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An asset which takes the form of some promised future cashflow. This may be securitized."}})

(def WACBondCoupon
  "w a c bond coupon"
  {:db/ident :fibo-sec-dbt-abs/WACBondCoupon,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label "w a c bond coupon",
   :rdfs/subClassOf :fibo-sec-dbt-bnd/BondVariableCoupon})

(def hasUnderlyingAssets
  "The ABS has an underlying pool asset which is either a loan pool or a credit card pool. This is actually defined as being any kind of pool asset that is not a mortgage pool, so any other types of pool should be added. This is more satisfactory that modeling it with a \"not\" relationship to Mortgage Pool, though that may be more correct."
  {:db/ident :fibo-sec-dbt-abs/hasUnderlyingAssets,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-pbs/AssetBackedSecurity,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has underlying assets"},
   :rdfs/range :fibo-sec-sec-pls/DebtPool,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The ABS has an underlying pool asset which is either a loan pool or a credit card pool. This is actually defined as being any kind of pool asset that is not a mortgage pool, so any other types of pool should be added. This is more satisfactory that modeling it with a \"not\" relationship to Mortgage Pool, though that may be more correct."}})

(def hasUnderlyingCashflow
  "has underlying cashflow"
  {:db/ident :fibo-sec-dbt-abs/hasUnderlyingCashflow,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-abs/EsotericAssetBackedSecurity,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has underlying cashflow"},
   :rdfs/range :fibo-sec-dbt-abs/PromisedCashFlowAsset,
   :rdfs/subPropertyOf :fibo-sec-dbt-abs/hasUnderlyingAssets})

(def specifiesIndexParameter
  "indicates the index specified in the formula for determination of principal paydown amounts"
  {:db/ident :fibo-sec-dbt-abs/specifiesIndexParameter,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-abs/IndexLinkedPrincipalDeterminationTerms,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label "specifies index parameter",
   :rdfs/range :fibo-ind-ei-ei/InflationRate,
   :skos/definition
   "indicates the index specified in the formula for determination of principal paydown amounts"})

(def ^{:private true} InflationLinkedBond
  {:cmns-av/explanatoryNote
   "The inflation rate is used to define the factor or multiplier for the bond, that is the factor that you multiply the bond by. How this works is that you take the inflation rate when the security was issued, and the inflation rate at the present. The difference between these becomes the Factor, e.g. 100% -&gt; 101% gives 1% so for example for a $1000 issue - calculate the principal on which the interest is paid AND the principal from the point of view of how the principal is repaid. Some inflation bonds only do this on interest, some only on interest, but most apply it to the principal and interest. Coupon interest calculated based on the adjusted amount of the bond. so a fixed coupon rate is multiplied by e.g. 1010 in the example above. Variations e.g. Italy - daily published factor published for that bond, whereas other calculate based on underlying index. Typically a CPI or a statistical number generated by the govt. typically a lagging three month index. See UK bonds on this. US and Japanese ones - look at inflation rate 3 months prior. Unlike an Amortizing Security this principal value of the bond is increasing, whereas for and Amortizing, the principal is decreasing. In Canada, these are also referred to as \"real return bonds\". \nFurther Notes:Additional review with OTPP May 05 2010 indicates that this is part of a classification of bonds where the principal amount itself varies according to some index, a point which was not understood at the original review session. Terms and labels revised to fit this picture.",
   :db/ident        :fibo-sec-dbt-bnd/InflationLinkedBond,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-dbt-dbti/hasRepaymentTerms,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-abs/InflationBondPrincipalRepaymentTerms,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty
                      :fibo-sec-dbt-dbti/hasInterestPaymentTerms,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-abs/InflationBondVariableCouponTerms,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty
                      :fibo-sec-dbt-dbti/hasInterestPaymentTerms,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-abs/InflationBondInterestPaymentTerms,
                      :rdf/type :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass
                      :fibo-sec-dbt-abs/IndexLinkedPrincipalDeterminationTerms,
                      :owl/onProperty :fibo-sec-dbt-dbti/hasRepaymentTerms,
                      :rdf/type :owl/Restriction}]})