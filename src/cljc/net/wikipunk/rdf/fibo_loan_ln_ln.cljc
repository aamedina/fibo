(ns net.wikipunk.rdf.fibo-loan-ln-ln
  {:cmns-av/copyright
   #{"Copyright (c) 2016-2024 EDM Council, Inc."
     "Copyright (c) 2016-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/LOAN/LoansGeneral/Loans/",
   :dcterms/abstract
   "This ontology is the top-level, and most fundamental ontology for the LOAN module, extending the Debt ontology to define concepts common to all loans. It includes the primary obligations to fund the loan and to pay it back according to payment schedules. Kinds of loans covered in this ontology include open and closed end, secured and unsecured.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-qtu" "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fbc-dae-gty"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/",
    "fibo-fbc-fct-ra"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fbc-pas-caa"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-arr-asmt"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
    "fibo-fnd-arr-doc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
    "fibo-fnd-oac-own"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
    "fibo-fnd-pas-psch"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-loan-ln-ln"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/DebtAndEquities/Guaranty/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Debt/DebtInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Agreements/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/ProductsAndServices/PaymentsAndSchedules/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/Assessments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/ClientsAndAccounts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/Documents/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/LOAN/LoansGeneral/Loans/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-loan-ln-ln",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/",
   :rdfs/label "Loans Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans.rdf version of this ontology was modified to move certain terms athat are general debt schedule terms to the Debt ontology (FBC-317)."
     "The https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans.rdf version of this ontology was modified to eliminate a subproperty relationship between the principal and notional amount, which may not be appropriate (DER-127) and to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"})

(def ClosedEndCredit
  {:cmns-av/explanatoryNote
   "The loan may require regular payments that pay down principal periodically, or it may require the full payment of principal at maturity.",
   :db/ident :fibo-loan-ln-ln/ClosedEndCredit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "closed-end credit",
   :rdfs/subClassOf :fibo-fbc-dae-dbt/CreditAgreement,
   :skos/definition
   "credit agreement in which the loan principal cannot be increased after funds are dispersed in full when the loan closes"})

(def CollateralizedLoan
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019."},
   :db/ident :fibo-loan-ln-ln/CollateralizedLoan,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "collateralized loan"},
   :rdfs/subClassOf #{:fibo-loan-ln-ln/SecuredLoan
                      {:owl/onProperty :cmns-col/comprises,
                       :owl/someValuesFrom
                       :fibo-fbc-dae-dbt/CollateralAgreement,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty     :fibo-fbc-dae-dbt/isCollateralizedBy,
                       :owl/someValuesFrom :fibo-fbc-dae-dbt/Collateral,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "secured loan that is secured with cash or other acceptable collateral (real property, securities or other assets) provided by the borrower as specified in the collateral agreement"}})

(def Comaker
  {:cmns-av/explanatoryNote
   #{"Differences between a co-maker and co-borrower include: (1) a co-maker is not listed on the title of the asset to which the loan applies, (2) a co-maker does not have any legal ownership rights to the asset, and (3) the co-maker does not make regular payments on the loan unless the primary borrower(s) fails to do so."
     "The co-maker's liability is similar to that of an endorser or guarantor, but with additional risk/exposure, as they can be compelled to honor the debt much sooner and regardless of whether certain conditions are met."},
   :cmns-av/synonym #{"comaker" "cosigner"},
   :db/ident :fibo-loan-ln-ln/Comaker,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "co-maker",
   :rdfs/subClassOf :fibo-fnd-agr-ctr/ContractThirdParty,
   :skos/definition
   "party that signs a borrower's promissory note, providing additional security and potentially improving the quality of the debt"})

(def CombinedLoanToValueRatio
  {:cmns-av/explanatoryNote
   "This is particularly important for secondary loans, or for refinancing that combines outstanding loans against a given asset. Lenders use this ratio to evaluate the risk of extending a loan to a borrower(s) in cases where multiple loans are involved.",
   :db/ident :fibo-loan-ln-ln/CombinedLoanToValueRatio,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "combined loan-to-value ratio",
   :rdfs/subClassOf #{{:owl/onProperty :cmns-qtu/hasArgument,
                       :owl/someValuesFrom
                       :fibo-loan-ln-ln/TotalOutstandingPrincipal,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty     :cmns-doc/refersTo,
                       :owl/someValuesFrom :fibo-fnd-arr-asmt/Appraisal,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-qtu/hasArgument,
                       :owl/someValuesFrom :fibo-fnd-arr-asmt/AppraisedValue,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                       :owl/someValuesFrom :fibo-fnd-oac-own/Asset,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-acc-cur/PercentageMonetaryAmount},
   :skos/definition
   "ratio of the total amount of debt that is secured by the asset(s) and the appraised value of the asset(s) securing the financing"})

(def FeeSimpleOwnershipInterest
  {:cmns-av/explanatoryNote
   #{"The asset may still be subject to government regulations such as property taxes, and the owner can place voluntary encumbrances on the real estate including its use as collateral for a loan. In the case of a mortgage, fee simple can be contrasted with lease ownership, in which case the owners have complete access to the land, but they do not own it. Owners of single-family residences typically have fee simple ownership, but condo and many townhouse owners do not, as they own their individual unit but not the land on which the development is built."
     "Fee simple is the term used to represent the maximum ownership interest in real property that is allowed under the law. It can be referred to as 'complete ownership'."},
   :cmns-av/synonym "complete ownership",
   :db/ident :fibo-loan-ln-ln/FeeSimpleOwnershipInterest,
   :rdf/type #{:fibo-loan-ln-ln/OwnershipInterest :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "fee-simple ownership interest",
   :skos/definition
   "classification indicating the most common type of ownership, covering an indefinite ownership period and the freedom to transfer said ownership as desired"})

(def FractionalOwnershipInterest
  {:db/ident :fibo-loan-ln-ln/FractionalOwnershipInterest,
   :rdf/type #{:fibo-loan-ln-ln/OwnershipInterest :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "fractional ownership interest",
   :skos/definition
   "classification indicating that several parties may share in, and mitigate the risk of, ownership of a high-value tangible asset"})

(def GuaranteedLoan
  {:cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "In the U.S., the term 'guaranteed loan' typically refers to a loan that is backed by a federal agency, such as the Department of Veterans Affairs or the Small Business Administration. Student loans may be guaranteed by the Student Loan Marketing Association."}
     {:rdf/language "en",
      :rdf/value
      "A loan guarantee is a promise by one party to assume the debt obligation of a borrower if that borrower defaults. A guarantee can be limited or unlimited, making the guarantor liable for only a portion or all of the debt."}},
   :db/ident :fibo-loan-ln-ln/GuaranteedLoan,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "guaranteed loan"},
   :rdfs/subClassOf #{:fibo-loan-ln-ln/SecuredLoan
                      {:owl/onProperty     :fibo-fbc-dae-gty/hasGuarantor,
                       :owl/someValuesFrom :fibo-fbc-dae-gty/Guarantor,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-col/comprises,
                       :owl/someValuesFrom :fibo-fbc-dae-gty/Guaranty,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "loan that is secured with respect to repayment of principal and interest by guaranty"}})

(def IndividualPaymentTransaction
  {:db/ident :fibo-loan-ln-ln/IndividualPaymentTransaction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "individual payment transaction"},
   :rdfs/subClassOf #{:fibo-fbc-pas-caa/IndividualTransaction
                      :fibo-fnd-pas-psch/Payment},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "actual payment of principal, interest, fees, or other related amounts towards fulfillment of a debt obligation"}})

(def LenderLienPosition
  {:db/ident :fibo-loan-ln-ln/LenderLienPosition,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "lender lien position",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition
   "classifier indicating whether the lender has the primary lien position with respect to an asset used as collateral for the loan"})

(def Loan
  {:db/ident :fibo-loan-ln-ln/Loan,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "loan",
   :rdfs/subClassOf
   #{:fibo-fbc-dae-dbt/CreditAgreementRepaidPeriodically
     {:owl/minQualifiedCardinality 0,
      :owl/onDataRange :xsd/boolean,
      :owl/onProperty  :fibo-loan-ln-ln/isInterestOnly,
      :rdf/type        :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
      :owl/onProperty :fibo-loan-ln-ln/hasTotalPointsAndFees,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-loan-ln-ln/Servicer,
      :owl/onProperty :fibo-loan-ln-ln/isServicedBy,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-dae-gty/Guarantor,
      :owl/onProperty :fibo-fbc-dae-gty/hasGuarantor,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :fibo-loan-ln-ln/hasPrincipalAmount,
      :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryAmount,
      :rdf/type           :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onDataRange :xsd/boolean,
      :owl/onProperty  :fibo-loan-ln-ln/hasNegativeAmortization,
      :rdf/type        :owl/Restriction} :fibo-fbc-fi-fi/DebtInstrument
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fnd-agr-ctr/ContractThirdParty,
      :owl/onProperty :fibo-fnd-agr-ctr/hasThirdParty,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
      :owl/onProperty :fibo-loan-ln-ln/hasTotalClosingCosts,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-loan-ln-ln/LoanSpecificCustomerAccount,
      :owl/onProperty :fibo-fbc-pas-caa/hasCorrespondingAccount,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-loan-ln-ln/LenderLienPosition,
      :owl/onProperty :cmns-cls/isClassifiedBy,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :cmns-dt/ExplicitDate,
      :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "debt instrument whereby one party extends money or credit to another party (or parties) with the understanding that the borrowed money will be repaid according to the terms of the contract"})

(def LoanPaymentSchedule
  {:db/ident :fibo-loan-ln-ln/LoanPaymentSchedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "loan payment schedule",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fbc-dae-dbt/hasAnticipatedNumberOfPayments,
      :owl/someValuesFrom :xsd/positiveInteger,
      :rdf/type           :owl/Restriction}
     :fibo-fbc-dae-dbt/AmortizationSchedule
     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
      :owl/someValuesFrom :fibo-loan-ln-ln/LoanSpecificCustomerAccount,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "regular payment schedule associated with a given loan-specific account"})

(def LoanPrincipal
  {:db/ident :fibo-loan-ln-ln/LoanPrincipal,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-fnd-acc-cur/MonetaryAmount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"}})

(def LoanSpecificCustomerAccount
  {:db/ident :fibo-loan-ln-ln/LoanSpecificCustomerAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "loan-specific customer account",
   :rdfs/subClassOf
   #{:fibo-fbc-pas-caa/CustomerAccount :fibo-fbc-pas-caa/LoanOrCreditAccount
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-loan-ln-ln/PaymentHistory,
      :owl/onProperty :fibo-loan-ln-ln/hasPaymentHistory,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-pas-caa/Balance,
      :owl/onProperty :fibo-loan-ln-ln/hasLoanBalance,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-rel-rel/isHeldBy,
      :owl/someValuesFrom :fibo-fbc-dae-dbt/Borrower,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-rel-rel/isProvidedBy,
      :owl/someValuesFrom {:owl/unionOf [:fibo-fbc-dae-dbt/Lender
                                         :fibo-loan-ln-ln/Servicer],
                           :rdf/type    :owl/Class},
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fbc-pas-fpas/relatesTo,
      :owl/someValuesFrom :fibo-loan-ln-ln/Loan,
      :rdf/type           :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-loan-ln-ln/LoanPaymentSchedule,
      :owl/onProperty :fibo-fnd-pas-psch/hasPaymentSchedule,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "account held by the borrower associated with a specific loan"})

(def LoanToValueRatio
  {:cmns-av/abbreviation "LTV",
   :db/ident :fibo-loan-ln-ln/LoanToValueRatio,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "loan-to-value ratio",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-doc/refersTo,
                       :owl/someValuesFrom :fibo-fnd-arr-asmt/Appraisal,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-qtu/hasArgument,
                       :owl/someValuesFrom :fibo-fnd-arr-asmt/AppraisedValue,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                       :owl/someValuesFrom :fibo-fnd-oac-own/Asset,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-acc-cur/PercentageMonetaryAmount
                      {:owl/onProperty     :cmns-qtu/hasArgument,
                       :owl/someValuesFrom :fibo-fbc-dae-dbt/Principal,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "ratio, expressed as a percentage, between the principal amount of the loan and the appraised value of the asset securing the financing"})

(def OpenEndCredit
  {:cmns-av/explanatoryNote
   "There is a credit limit most of the time, with exceptions including reverse mortgages with tenure payment. The borrower has the option of paying off the outstanding balance, without penalty, or making installment payments.",
   :cmns-av/synonym #{"charge account credit" "revolving credit"},
   :db/ident :fibo-loan-ln-ln/OpenEndCredit,
   :owl/disjointWith :fibo-loan-ln-ln/ClosedEndCredit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "open-end credit",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                       :owl/onProperty :fibo-loan-ln-ln/hasCreditLimit,
                       :rdf/type       :owl/Restriction}
                      :fibo-fbc-dae-dbt/CreditAgreement},
   :skos/definition
   "credit agreement that may be extended up to an agreed credit limit and paid down at any time within the period of the line, if any, and on which interest is charged only on the outstanding balance",
   :skos/example
   "Credit card and overdraft lines of credit are among the most widely used forms of open-end credit."})

(def OwnershipInterest
  {:cmns-av/usageNote
   "Note that there are a number of variations for ownership interest that represent 'corner cases', including jurisdiction-specific variants, which can be added as needed for specific applications.",
   :db/ident :fibo-loan-ln-ln/OwnershipInterest,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "ownership interest",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-cls/classifies,
                       :owl/someValuesFrom :fibo-fnd-oac-own/Ownership,
                       :rdf/type           :owl/Restriction}
                      :cmns-cls/Classifier},
   :skos/definition
   "classifier indicating the nature of the applicant's or borrower's ownership or leasehold interest in an asset used as collateral for the loan"})

(def PaymentHistory
  {:db/ident :fibo-loan-ln-ln/PaymentHistory,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "payment history",
   :rdfs/subClassOf
   #{:fibo-fbc-pas-caa/TransactionRecord
     {:owl/onProperty     :fibo-fbc-pas-caa/appliesToAccount,
      :owl/someValuesFrom :fibo-loan-ln-ln/LoanSpecificCustomerAccount,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-loan-ln-ln/hasIndividualPayment,
      :owl/someValuesFrom :fibo-loan-ln-ln/IndividualPaymentTransaction,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "record of actual payments of principal, interest, and other related amounts made by a borrower to a lender or servicer in order to fulfill their re-payment obligation"})

(def PrepaymentTerms
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Prepayment may or may not involve refinancing with the same lender. Prepayment terms include any prepayment penalty period, penalty amount and whether or not there is provision for waiver of the penalty, and any conditions related to making additional payments or payments over and above the expected installment payment over the lifetime of the loan."},
   :db/ident :fibo-loan-ln-ln/PrepaymentTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pre-payment terms"},
   :rdfs/subClassOf #{:fibo-fbc-dae-dbt/PrincipalRepaymentTerms
                      {:owl/onProperty
                       :fibo-loan-ln-ln/hasPrePaymentPenaltyTerm,
                       :owl/someValuesFrom :cmns-dt/ExplicitDuration,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "principal repayment terms related to payment of the loan prior to maturity"}})

(def PrimaryLienPosition
  {:cmns-av/synonym "primary lien priority",
   :db/ident :fibo-loan-ln-ln/PrimaryLienPosition,
   :rdf/type #{:owl/NamedIndividual :fibo-loan-ln-ln/LenderLienPosition},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "primary lien position",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "first position in the order of seniority in which the law recognizes lenders' claims against a property"}})

(def SecuredLoan
  {:db/ident :fibo-loan-ln-ln/SecuredLoan,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "secured loan",
   :rdfs/subClassOf
   #{:fibo-loan-ln-ln/Loan
     {:owl/unionOf [{:owl/onProperty     :cmns-col/comprises,
                     :owl/someValuesFrom :fibo-loan-ln-ln/SecurityAgreement,
                     :rdf/type           :owl/Restriction}
                    {:owl/onProperty     :cmns-col/comprises,
                     :owl/someValuesFrom :fibo-fbc-dae-gty/Guaranty,
                     :rdf/type           :owl/Restriction}],
      :rdf/type    :owl/Class}},
   :skos/definition
   "loan in which the borrower pledges some asset via a security agreement as collateral for the loan, or that is secured via third-party guarantee"})

(def SecurityAgreement
  {:cmns-av/adaptedFrom {:rdf/value "ISO 20022"},
   :db/ident :fibo-loan-ln-ln/SecurityAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "security agreement",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-col/isPartOf,
                       :owl/someValuesFrom :fibo-loan-ln-ln/Loan,
                       :rdf/type           :owl/Restriction}
                      :fibo-fbc-dae-dbt/CollateralAgreement
                      {:owl/onProperty     :cmns-cls/isClassifiedBy,
                       :owl/someValuesFrom :fibo-loan-ln-ln/LenderLienPosition,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-cls/isClassifiedBy,
                       :owl/someValuesFrom :fibo-loan-ln-ln/OwnershipInterest,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-arr-asmt/hasEstimatedValue,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryAmount,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "agreement between parties that contains information about their relative duties and rights regarding the disposition of a specified asset used as collateral"})

(def Servicer
  {:cmns-av/explanatoryNote
   "In cases where a loan has been securitized, the servicer is also responsible for forwarding payments to investors, filing reports with credit-rating agencies and investors, and so forth.",
   :db/ident :fibo-loan-ln-ln/Servicer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "servicer",
   :rdfs/subClassOf #{:fibo-fbc-pas-fpas/FinancialServiceProvider
                      :fibo-fnd-agr-ctr/ContractThirdParty},
   :skos/definition
   "party that collects principal and interest payments on behalf of the lender"})

(def SubordinateLienPosition
  {:db/ident :fibo-loan-ln-ln/SubordinateLienPosition,
   :rdf/type #{:owl/NamedIndividual :fibo-loan-ln-ln/LenderLienPosition},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "subordinate lien position",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "secondary or lower position in the order of seniority in which the law recognizes lenders' claims against a property"}})

(def TotalOutstandingPrincipal
  {:db/ident :fibo-loan-ln-ln/TotalOutstandingPrincipal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "total outstanding principal",
   :rdfs/subClassOf :fibo-fbc-dae-dbt/Principal,
   :skos/definition
   "the principal balance of all loans secured by the property"})

(def UnsecuredLoan
  {:db/ident :fibo-loan-ln-ln/UnsecuredLoan,
   :owl/disjointWith :fibo-loan-ln-ln/SecuredLoan,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "unsecured loan",
   :rdfs/subClassOf :fibo-loan-ln-ln/Loan,
   :skos/definition
   "loan granted based on the strength of the borrower's credit history or reputation in the community"})

(def hasAnticipatedNumberOfPayments
  {:db/ident :fibo-loan-ln-ln/hasAnticipatedNumberOfPayments,
   :owl/deprecated true,
   :owl/equivalentProperty :fibo-fbc-dae-dbt/hasAnticipatedNumberOfPayments,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"}})

(def hasBalloonPayment
  {:db/ident :fibo-loan-ln-ln/hasBalloonPayment,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has balloon payment"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates whether the contractual terms include or would have included repayment of the outstanding principal sum at the end of a loan period, prior to which only partial or no payments were made on the principal"}})

(def hasCost
  {:cmns-av/explanatoryNote
   "This can entail adding up other prices and/or fees (e.g. 4 units * a unit price)",
   :db/ident :fibo-loan-ln-ln/hasCost,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "has cost",
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   "has amount payable for principal, interest, fees or other expenses"})

(def hasCreditLimit
  {:db/ident :fibo-loan-ln-ln/hasCreditLimit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "has credit limit",
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   "specifies the maximum amount of funds that may be borrowed (e.g. for line of credit)"})

(def hasFirstRateChangeTerm
  {:cmns-av/usageNote
   "This normally applies to a variable rate loan. It may also apply to step up/step down loans that are fixed rate but whose rate changes after a pre-determined number of months.",
   :db/ident :fibo-loan-ln-ln/hasFirstRateChangeTerm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "has first rate change term",
   :rdfs/subPropertyOf :cmns-dt/hasDuration,
   :skos/definition
   "specifies a period of time in months after origination during which the interest rate cannot change"})

(def hasIndividualPayment
  {:db/ident :fibo-loan-ln-ln/hasIndividualPayment,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-ln-ln/PaymentHistory,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "has individual payment",
   :rdfs/range :fibo-loan-ln-ln/IndividualPaymentTransaction,
   :rdfs/subPropertyOf :fibo-fbc-fct-ra/hasRegistryEntry,
   :skos/definition
   "links an actual payment of principal, interest, and other related amounts to the overall payment history for an account"})

(def hasLoanBalance
  {:db/ident :fibo-loan-ln-ln/hasLoanBalance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "has loan balance",
   :rdfs/subPropertyOf #{:fibo-fbc-pas-caa/hasBalance
                         :fibo-fbc-dae-dbt/hasOutstandingAmount},
   :skos/definition
   "indicates the balance with respect to the principal on the loan as of some date"})

(def hasNegativeAmortization
  {:db/ident :fibo-loan-ln-ln/hasNegativeAmortization,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has negative amortization"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates whether the contractual terms include or would have included a feature that allows unpaid interest to be added to the balance of unpaid principal"}})

(def hasPaymentHistory
  {:db/ident :fibo-loan-ln-ln/hasPaymentHistory,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "has payment history",
   :rdfs/range :fibo-loan-ln-ln/PaymentHistory,
   :rdfs/subPropertyOf :fibo-fnd-arr-doc/hasRecord,
   :skos/definition
   "relates a credit agreement, loan, or commitment to any history of payments that have been made by the borrower up to the point that payment history is requested"})

(def hasPrePaymentPenaltyTerm
  {:cmns-av/usageNote
   "A value of zero means no prepayment penalty; this avoids need for a separate boolean property about whether there is a prepayment penalty",
   :db/ident :fibo-loan-ln-ln/hasPrePaymentPenaltyTerm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "has pre-payment penalty term",
   :rdfs/subPropertyOf :cmns-dt/hasDuration,
   :skos/definition
   "relates a loan to a period of time in months after which there is no prepayment penalty"})

(def hasPrincipalAmount
  {:db/ident :fibo-loan-ln-ln/hasPrincipalAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has principal amount"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf #{:fibo-fnd-acc-cur/hasMonetaryAmount
                         :fibo-fbc-dae-dbt/hasPrincipal},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the nominal amount of the loan that must be paid at or before maturity"}})

(def hasScheduledUnpaidBalance
  {:db/ident :fibo-loan-ln-ln/hasScheduledUnpaidBalance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "has scheduled unpaid balance",
   :rdfs/range :fibo-fbc-pas-caa/Balance,
   :rdfs/subPropertyOf :fibo-fbc-pas-caa/hasBalance,
   :skos/definition
   "indicates what the balance should be after a scheduled payment is made according to contract terms"})

(def hasTotalClosingCosts
  {:cmns-av/explanatoryNote
   "Closing costs may be incurred by either the buyer or the seller, and may include fees paid by either or both parties for the preparation and recording of documents, title service costs, such as for title search and insurance (typically paid by the seller, depending on the jurisdiction), other recording costs, other document or transaction stamps or taxes, brokerage commissions, survey, appraisal, inspection and other such fees, home warranties, private mortgage insurance (PMI), and so forth.",
   :db/ident :fibo-loan-ln-ln/hasTotalClosingCosts,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "has total closing costs",
   :rdfs/subPropertyOf :fibo-loan-ln-ln/hasCost,
   :skos/definition
   "indicates the total the amount paid at the closing of a real estate transaction, i.e., at the time when the title to the property is conveyed (transferred) to the buyer"})

(def hasTotalPointsAndFees
  {:cmns-av/explanatoryNote
   "One point equals one percent of the loan principal, and usually reduces the interest rate by 1/8 percent (0.125)",
   :db/ident :fibo-loan-ln-ln/hasTotalPointsAndFees,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "has total points and fees",
   :rdfs/subPropertyOf :fibo-loan-ln-ln/hasCost,
   :skos/definition
   "indicates a form of pre-paid interest, charged by the lender as an alternative to charging a higher rate of interest on the mortgage loan"})

(def isAssumable
  {:db/ident :fibo-loan-ln-ln/isAssumable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-loan-ln-ln/Loan,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is assumable"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates whether or not another borrower may assume the payments on this loan"}})

(def isInitiallyPayable
  {:db/ident :fibo-loan-ln-ln/isInitiallyPayable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is initially payable"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates whether the obligation arising from the covered loan was, or in the case of an application, would have been initially payable to the financial institution"}})

(def isInterestOnly
  {:db/ident :fibo-loan-ln-ln/isInterestOnly,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is interest only"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates whether the contractual terms include or would have included interest only payments"}})

(def isServicedBy
  {:db/ident :fibo-loan-ln-ln/isServicedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"},
   :rdfs/label "is performed by",
   :rdfs/range :fibo-loan-ln-ln/Servicer,
   :rdfs/subPropertyOf :cmns-pts/hasPartyRole,
   :skos/definition
   "relates a loan to the financial service provider that services it"})

(def urn:uuid:894150a2-9037-581e-b425-33fc9a2ee5ba
  {:cmns-av/copyright
   #{"Copyright (c) 2016-2024 EDM Council, Inc."
     "Copyright (c) 2016-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology is the top-level, and most fundamental ontology for the LOAN module, extending the Debt ontology to define concepts common to all loans. It includes the primary obligations to fund the loan and to pay it back according to payment schedules. Kinds of loans covered in this ontology include open and closed end, secured and unsecured.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/DebtAndEquities/Guaranty/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Debt/DebtInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Agreements/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/ProductsAndServices/PaymentsAndSchedules/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/Assessments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/ClientsAndAccounts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/Documents/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/LOAN/LoansGeneral/Loans/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Loans Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans.rdf version of this ontology was modified to move certain terms athat are general debt schedule terms to the Debt ontology (FBC-317)."
     "The https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans.rdf version of this ontology was modified to eliminate a subproperty relationship between the principal and notional amount, which may not be appropriate (DER-127) and to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"})