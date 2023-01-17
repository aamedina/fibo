(ns net.wikipunk.rdf.fibo-fbc-dae-dbt
  "This ontology defines concepts that are common to all debt instruments, such as debt, borrower, lender, debtor, creditor, interest, principal, and the like. It is designed to be used by various other FIBO specifications, including but not limited to SEC/Debt and LOAN."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :dcterms/abstract
   "This ontology defines concepts that are common to all debt instruments, such as debt, borrower, lender, debtor, creditor, interest, principal, and the like. It is designed to be used by various other FIBO specifications, including but not limited to SEC/Debt and LOAN.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/AccountingEquity/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/PaymentsAndSchedules/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Arrangements/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Assessments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/BusinessDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/Ownership/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/LegalCapacity/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/ProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Agreements/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-aeq"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-agr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-arr-arr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
    "fibo-fnd-arr-asmt"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
    "fibo-fnd-dt-bd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-oac-own"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
    "fibo-fnd-pas-pas"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/",
    "fibo-fnd-pas-psch"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
    "fibo-fnd-plc-loc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-alx"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfa/prefix "fibo-fbc-dae-dbt",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "Debt Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/ version of this ontology was modified to use the generic statistical measures and measurements now in FND."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/ version of this ontology was modified to add more detailed schedule information to support management of the various kinds of events that can impact a given contract as well as the concept of a revolving line of credit."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/ version of this ontology was added to the FBC domain via the FIBO 2.0 RFC in support of several FIBO debt-oriented initiatives."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/ version of this ontology was modified to add several common day count conventions used to calculate the amount of accrued interest or the present value when the next coupon payment is less than a full coupon period away, to support collateral agreements such as deeds of trust, UCC filings and the like, to add the concept of a rate reset time of day, to eliminate duplication of concepts in LCC, to simplify addresses, and to merge countries with locations."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/ version of this ontology was modified to (1) add concepts including credit agreement whose principal is repaid at maturity and those whose principal is repaid over the course of the agreement, (2) move properties related to maturity to this ontology from FinancialInstruments and restructure the relationship between these two ontologies, (3) add the concept of a borrower identifier and the related scheme, (4) add the concept of an interest rate cap as a potential provision with respect to interest rate terms, and (5) clarified the definition of promissory note."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/ version of this ontology was modified to move the concept of an extension provision from Debt to Contracts to support representation of preferred shares and other extendable contracts, eliminate remaining circular definitions, integrate concepts defining credit facilities, and refine the concept of collateral to differentiate collateral that is real property from financial assets such as cash, various accounts, securities, and receivables."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/ version of this ontology was modified to make redemption provision a child of contractual commitment and move it to financial instruments, as such provisions apply to preferred shares and other instruments in addition to debt."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/ version of this ontology was modified to address text formatting issues uncovered by hygiene testing."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2016-2022 EDM Council, Inc."
                  "Copyright (c) 2016-2022 Object Management Group, Inc."],
   :sm/dependsOn
   ["https://spec.edmcouncil.org/fibo/ontology/BE/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"],
   :sm/fileAbbreviation "fibo-fbc-dae-dbt",
   :sm/filename "Debt.rdf"})

(def Accrual
  "the process of accumulating interest or other income that has been earned but not paid"
  {:db/ident :fibo-fbc-dae-dbt/Accrual,
   :fibo-fnd-utl-av/explanatoryNote
   "There are legal contractual terms for the accrual of interest, as distinct from the payment of interest.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "accrual",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-dae-dbt/Interest,
                      :owl/onProperty :fibo-fnd-rel-rel/appliesTo,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-pty-rl/ThingInRole],
   :skos/definition
   "the process of accumulating interest or other income that has been earned but not paid"})

(def Amortization
  "the process of reduction of debt or other costs through periodic charges to assets or liabilities, such as through principal payments on mortgages"
  {:db/ident :fibo-fbc-dae-dbt/Amortization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "amortization",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-dae-dbt/Debt,
                      :owl/onProperty :fibo-fbc-dae-dbt/isAmortizationOf,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-pty-rl/ThingInRole],
   :skos/definition
   "the process of reduction of debt or other costs through periodic charges to assets or liabilities, such as through principal payments on mortgages"})

(def AmortizationSchedule
  "schedule of periodic payments (repayment installments) that specify changes in the balance of the debt over time"
  {:db/ident :fibo-fbc-dae-dbt/AmortizationSchedule,
   :fibo-fnd-utl-av/explanatoryNote
   "Payments are divided into equal amounts for the duration of the loan or debt instrument, making it the simplest repayment model. A greater amount of the payment is applied to interest at the beginning of the amortization schedule, while more money is applied to principal at the end.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "amortization schedule",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/embodies,
                      :owl/someValuesFrom :fibo-fbc-dae-dbt/Amortization,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-pas-psch/PaymentSchedule
                     :fibo-fbc-dae-dbt/ProjectedContractEventSchedule],
   :skos/definition
   "schedule of periodic payments (repayment installments) that specify changes in the balance of the debt over time"})

(def Borrower
  "party to a credit agreement that is obligated to repay the amount borrowed (principal) with interest and other fees according to the terms of the instrument"
  {:db/ident :fibo-fbc-dae-dbt/Borrower,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "borrower",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-pty-pty/isAPartyTo,
                          :owl/someValuesFrom :fibo-fbc-dae-dbt/CreditAgreement,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-dae-dbt/owes,
     :owl/someValuesFrom :fibo-fbc-dae-dbt/Debt,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-pas-pas/Customer
    :fibo-fnd-agr-ctr/ContractParty
    :fibo-fbc-dae-dbt/Debtor],
   :skos/definition
   "party to a credit agreement that is obligated to repay the amount borrowed (principal) with interest and other fees according to the terms of the instrument"})

(def BorrowerIdentificationScheme
  "system for allocating identifiers to borrowers"
  {:db/ident :fibo-fbc-dae-dbt/BorrowerIdentificationScheme,
   :fibo-fnd-utl-av/explanatoryNote
   "Many banks and other financial institutions have internal systems for assigning identifiers to borrowers. In the United States, larger banks may use a Customer Information File (CIF) number, assigned as a part of their federally mandated Customer Information Program (CIP).",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "borrower identification scheme",
   :rdfs/seeAlso
   ["https://www.fincen.gov/resources/statutes-regulations/guidance/guidance-customer-identification-regulations-financial"],
   :rdfs/subClassOf :fibo-fnd-pty-pty/PartyInRoleIdentificationScheme,
   :skos/definition "system for allocating identifiers to borrowers"})

(def BorrowerIdentifier
  "sequence of characters, capable of uniquely identifying a borrower"
  {:db/ident :fibo-fbc-dae-dbt/BorrowerIdentifier,
   :fibo-fnd-utl-av/explanatoryNote
   "A given identifier identifies a particular borrower with respect to at least some number of notes/facilities inside a particular institution according to some policy for minting identifiers. Optimally, there would be a single identifier for a given borrower, but due to operational issues, this is often not the case. A CIF number, or Customer Information File number, is used to link accounts across an institution to all notes/facilities owed by a given borrower.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "borrower identifier",
   :rdfs/seeAlso
   ["https://www.fdic.gov/news/financial-institution-letters/1997/fil9786.pdf"],
   :rdfs/subClassOf [{:owl/onClass
                      :fibo-fbc-dae-dbt/BorrowerIdentificationScheme,
                      :owl/onProperty :fibo-fnd-rel-rel/isDefinedIn,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass    :fibo-fbc-dae-dbt/Borrower,
                      :owl/onProperty :lcc-lr/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-pty-pty/PartyInRoleIdentifier],
   :skos/definition
   "sequence of characters, capable of uniquely identifying a borrower"})

(def BorrowingCapacity
  "upper bound on the total amount of money that a lender believes a party has the ability to repay an obligation when due, as of some point in time"
  {:db/ident :fibo-fbc-dae-dbt/BorrowingCapacity,
   :fibo-fnd-utl-av/explanatoryNote
   "The notion of borrowing capacity is related to management decisions pertaining to credit, i.e., the creditworthiness of the borrower, loan amount, risk tolerance, and so forth, and may be reassessed from time to time depending on the type of credit agreement and regulatory requirements. Determining borrowing capacity is typically done as a part of loan origination, especially for residential mortgages.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "borrowing capacity",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/appliesTo,
                      :owl/someValuesFrom :fibo-be-le-lp/LegalPerson,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-arr-asmt/hasDateOfAssessment,
                      :owl/someValuesFrom :fibo-fnd-dt-fd/ExplicitDate,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-agr-ctr/isEvidencedBy,
                      :owl/someValuesFrom :fibo-fnd-arr-asmt/AssessmentReport,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-cur/MonetaryAmount],
   :skos/definition
   "upper bound on the total amount of money that a lender believes a party has the ability to repay an obligation when due, as of some point in time"})

(def Collateral
  "something pledged as security to ensure fulfillment of an obligation to another party, to lend money, extend credit, or provision securities"
  {:db/ident :fibo-fbc-dae-dbt/Collateral,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "collateral",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-oac-own/TangibleAsset,
                      :owl/onProperty :fibo-fbc-dae-dbt/isCollateralizationOf,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-pty-pty/Undergoer],
   :skos/definition
   "something pledged as security to ensure fulfillment of an obligation to another party, to lend money, extend credit, or provision securities"})

(def CollateralAgreement
  "written contract that specifies terms, over and above those specified in a promissory note, loan, or other debt instrument, under which the collateral must be made available to the lender"
  {:db/ident :fibo-fbc-dae-dbt/CollateralAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "collateral agreement",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-dae-dbt/Collateral,
                      :owl/onProperty :fibo-fnd-rel-rel/involves,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-agr-ctr/WrittenContract],
   :skos/definition
   "written contract that specifies terms, over and above those specified in a promissory note, loan, or other debt instrument, under which the collateral must be made available to the lender",
   :skos/example
   "Examples include deeds of trust and uniform commercial code (UCC) agreements."})

(def CommittedCreditFacility
  "credit facility that is a confirmed source of financing for the borrower, as long as the borrower meets the conditions of the agreement"
  {:db/ident :fibo-fbc-dae-dbt/CommittedCreditFacility,
   :owl/disjointWith :fibo-fbc-dae-dbt/UncommittedCreditFacility,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "committed credit facility"},
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-dae-dbt/CommittedSubFacility,
                      :owl/onProperty :fibo-fnd-arr-arr/hasConstituent,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-dae-dbt/CreditFacility],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit facility that is a confirmed source of financing for the borrower, as long as the borrower meets the conditions of the agreement"}})

(def CommittedSubFacility
  "contractually committed portion of a credit facility that is available to the borrower and may be associated with some specific collateral"
  {:db/ident :fibo-fbc-dae-dbt/CommittedSubFacility,
   :owl/disjointWith :fibo-fbc-dae-dbt/UncommittedSubFacility,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "committed sub-facility"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-arr-arr/isConstituentOf,
                      :owl/someValuesFrom
                      :fibo-fbc-dae-dbt/CommittedCreditFacility,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-dae-dbt/SubFacility],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "contractually committed portion of a credit facility that is available to the borrower and may be associated with some specific collateral"}})

(def CreditAgreement
  "contractual agreement in which a debtor receives something of value and typically agrees to repay the creditor by some date in the future, in some form (e.g., cash, securities, etc.), generally with interest"
  {:db/ident :fibo-fbc-dae-dbt/CreditAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "credit agreement",
   :rdfs/subClassOf [:fibo-fnd-agr-ctr/MutualContractualAgreement
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-dae-dbt/Collateral,
                      :owl/onProperty :fibo-fbc-dae-dbt/isCollateralizedBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-dt-fd/ExplicitDate,
                      :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom :fibo-fbc-dae-dbt/DebtTerms,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-agr-ctr/WrittenContract
                     {:owl/onProperty     :fibo-fnd-agr-ctr/hasContractParty,
                      :owl/someValuesFrom :fibo-fbc-dae-dbt/Creditor,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-agr-ctr/hasContractParty,
                      :owl/someValuesFrom :fibo-fbc-dae-dbt/Debtor,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "contractual agreement in which a debtor receives something of value and typically agrees to repay the creditor by some date in the future, in some form (e.g., cash, securities, etc.), generally with interest"})

(def CreditAgreementRepaidAtMaturity
  "credit agreement in which accrued interest may be periodically repaid or paid at maturity, but principal is paid at maturity"
  {:db/ident :fibo-fbc-dae-dbt/CreditAgreementRepaidAtMaturity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "credit agreement repaid at maturity",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-dae-dbt/hasMaturityDate,
                      :owl/someValuesFrom :fibo-fnd-dt-fd/ExplicitDate,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-dae-dbt/CreditAgreement],
   :skos/definition
   "credit agreement in which accrued interest may be periodically repaid or paid at maturity, but principal is paid at maturity",
   :skos/example
   "The most common example of a credit agreement repaid at maturity is a bond."})

(def CreditAgreementRepaidPeriodically
  "credit agreement in which the principal and accrued interest may be periodically repaid or exchanged"
  {:db/ident :fibo-fbc-dae-dbt/CreditAgreementRepaidPeriodically,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "credit agreement repaid periodically",
   :rdfs/subClassOf :fibo-fbc-dae-dbt/CreditAgreement,
   :skos/definition
   "credit agreement in which the principal and accrued interest may be periodically repaid or exchanged",
   :skos/example
   "Examples include revolving lines of credit, commercial loans, construction loans, residential mortgages and so forth."})

(def CreditFacility
  "credit agreement that allows the borrower to periodically take out money over an extended period of time rather than reapplying for a loan every time they need funds"
  {:db/ident :fibo-fbc-dae-dbt/CreditFacility,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Credit facilities include revolving loans/lines of credit, committed facilities, letters of credit, and most retail credit accounts. They may define sub-facilities to which the lender is prepared to commit for specific purposes."},
   :fibo-fnd-utl-av/synonym {:rdf/language "en",
                             :rdf/value    "master commitment"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit facility"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-arr/hasConstituent,
                      :owl/someValuesFrom :fibo-fbc-dae-dbt/PromissoryNote,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-dae-dbt/CreditAgreementRepaidPeriodically
                     {:owl/onProperty     :fibo-fnd-acc-cur/hasMonetaryAmount,
                      :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryAmount,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-agr-ctr/ConditionPrecedent,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-dae-dbt/SubFacility,
                      :owl/onProperty :fibo-fnd-arr-arr/hasConstituent,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit agreement that allows the borrower to periodically take out money over an extended period of time rather than reapplying for a loan every time they need funds"}})

(def Creditor
  "a party to whom an obligation, such as an amount of money, or good, or performance of some service exists"
  {:db/ident :fibo-fbc-dae-dbt/Creditor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "creditor",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-dae-dbt/isOwed,
                      :owl/someValuesFrom :fibo-fbc-dae-dbt/Debt,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :fibo-be-le-lp/LegalPerson,
                      :owl/onProperty    :fibo-fnd-rel-rel/hasIdentity,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-agr-agr/Obligee],
   :skos/definition
   "a party to whom an obligation, such as an amount of money, or good, or performance of some service exists"})

(def DayCountConvention
  "a business recurrence interval convention that is used to calculate the number of days in an interest payment, which applies to the amount of accrued interest or the present value for debt instruments"
  {:db/ident :fibo-fbc-dae-dbt/DayCountConvention,
   :fibo-fnd-utl-av/explanatoryNote
   "Day-count conventions apply to swaps, mortgages and forward rate agreements as well as bonds, each of which has its own day-count convention, which varies depending on the type of instrument, whether the interest rate is fixed or floating, and the country of issuance. Among the most common conventions are 30/360 or 365, actual/360 or 365, and actual/actual. A 30/360 convention assumes 30 days in a month and 360 days in a year. An actual/360 convention assumes the actual number of days in the given month and 360 days in the year. An actual/ actual convention uses the actual number of days in the given interest period and year.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "day-count convention",
   :rdfs/subClassOf [:fibo-fnd-utl-alx/Expression
                     :fibo-fnd-dt-bd/BusinessRecurrenceIntervalConvention],
   :skos/definition
   "a business recurrence interval convention that is used to calculate the number of days in an interest payment, which applies to the amount of accrued interest or the present value for debt instruments"})

(def DayCountConvention-30360BondBasis
  "day-count convention that uses 30 days in a month and 360 days in a year for calculating interest payments"
  {:db/ident :fibo-fbc-dae-dbt/DayCountConvention-30360BondBasis,
   :fibo-fnd-utl-av/explanatoryNote
   "See ISDA 2006 Section 4.16(f), https://web.archive.org/web/20140913145444/http://www.hsbcnet.com/gbm/attachments/standalone/2006-isda-definitions.pdf for more details on the calculation.",
   :fibo-fnd-utl-av/synonym "30A/360",
   :rdf/type [:fibo-fbc-dae-dbt/DayCountConvention :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "day-count convention 30/360 bond basis",
   :skos/definition
   "day-count convention that uses 30 days in a month and 360 days in a year for calculating interest payments"})

(def DayCountConvention-30360US
  "day-count convention that uses 30 days in a month and 360 days in a year for calculating interest payments"
  {:db/ident :fibo-fbc-dae-dbt/DayCountConvention-30360US,
   :fibo-fnd-utl-av/explanatoryNote
   ["This convention is used for US corporate bonds and many US agency issues. It is most commonly referred to as '30/360', but the term '30/360' may also refer to any of the other conventions of this class, depending on the context. See ISDA 2006 Section 4.16(f), https://web.archive.org/web/20140913145444/http://www.hsbcnet.com/gbm/attachments/standalone/2006-isda-definitions.pdf for more details on the calculation"
    "See ISDA 2006 Section 4.16(f), https://web.archive.org/web/20140913145444/http://www.hsbcnet.com/gbm/attachments/standalone/2006-isda-definitions.pdf for more details on the calculation."],
   :fibo-fnd-utl-av/synonym "30/360",
   :rdf/type [:fibo-fbc-dae-dbt/DayCountConvention :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "day-count convention 30/360 US",
   :skos/definition
   "day-count convention that uses 30 days in a month and 360 days in a year for calculating interest payments"})

(def DayCountConvention-30365
  "day-count convention that uses 30 days in a month and 365 days in a year for calculating interest payments"
  {:db/ident :fibo-fbc-dae-dbt/DayCountConvention-30365,
   :rdf/type [:fibo-fbc-dae-dbt/DayCountConvention :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "day-count convention 30/365",
   :skos/definition
   "day-count convention that uses 30 days in a month and 365 days in a year for calculating interest payments"})

(def DayCountConvention-30E360
  "day-count convention that uses 30 days in a month and 360 days in a year for calculating interest payments"
  {:db/ident :fibo-fbc-dae-dbt/DayCountConvention-30E360,
   :fibo-fnd-utl-av/explanatoryNote
   "See ICMA Rule 251.1(ii), 251.2, and ISDA 2006 Section 4.16(g), https://web.archive.org/web/20140913145444/http://www.hsbcnet.com/gbm/attachments/standalone/2006-isda-definitions.pdf for more details on the calculation.",
   :fibo-fnd-utl-av/synonym
   ["30/360 ICMA" "30S/360" "Special German" "Eurobond basis (ISDA 2006)"],
   :rdf/type [:fibo-fbc-dae-dbt/DayCountConvention :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "day-count convention 30E/360",
   :skos/definition
   "day-count convention that uses 30 days in a month and 360 days in a year for calculating interest payments"})

(def DayCountConvention-30E360ISDA
  "day-count convention that uses 30 days in a month and 360 days in a year for calculating interest payments"
  {:db/ident :fibo-fbc-dae-dbt/DayCountConvention-30E360ISDA,
   :fibo-fnd-utl-av/explanatoryNote
   "See ISDA 2006 Section 4.16(h), https://web.archive.org/web/20140913145444/http://www.hsbcnet.com/gbm/attachments/standalone/2006-isda-definitions.pdf for more details on the calculation.",
   :fibo-fnd-utl-av/synonym
   ["German" "Eurobond basis (ISDA 2006)" "30/360 ICMA"],
   :rdf/type [:fibo-fbc-dae-dbt/DayCountConvention :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "day-count convention 30E/360 ISDA",
   :skos/definition
   "day-count convention that uses 30 days in a month and 360 days in a year for calculating interest payments"})

(def DayCountConvention-Actual360
  "day-count convention that uses the actual number of days in each month and 360 days in a year for calculating interest payments"
  {:db/ident :fibo-fbc-dae-dbt/DayCountConvention-Actual360,
   :fibo-fnd-utl-av/explanatoryNote
   ["See ICMA Rule 251.1(i) (not sterling), ISDA 2006 Section 4.16(e), https://web.archive.org/web/20140913145444/http://www.hsbcnet.com/gbm/attachments/standalone/2006-isda-definitions.pdf for more details on the calculation."
    "This convention is used in money markets for short-term lending of currencies, including the US dollar and Euro, and is applied in ESCB monetary policy operations. It is the convention used with repurchase agreements."],
   :fibo-fnd-utl-av/synonym ["act/360" "a/360" "French"],
   :rdf/type [:owl/NamedIndividual :fibo-fbc-dae-dbt/DayCountConvention],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "day-count convention actual/360",
   :skos/definition
   "day-count convention that uses the actual number of days in each month and 360 days in a year for calculating interest payments"})

(def DayCountConvention-Actual365Fixed
  "day-count convention that uses the actual number of days in each month and 365 days in a year for calculating interest payments"
  {:db/ident :fibo-fbc-dae-dbt/DayCountConvention-Actual365Fixed,
   :fibo-fnd-utl-av/explanatoryNote
   "See ISDA 2006 Section 4.16(d), https://web.archive.org/web/20140913145444/http://www.hsbcnet.com/gbm/attachments/standalone/2006-isda-definitions.pdf for more details on the calculation.",
   :fibo-fnd-utl-av/synonym ["English" "act/365 fixed" "a/365f" "a/365 fixed"],
   :rdf/type [:owl/NamedIndividual :fibo-fbc-dae-dbt/DayCountConvention],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "day-count convention actual/365 fixed",
   :skos/definition
   "day-count convention that uses the actual number of days in each month and 365 days in a year for calculating interest payments"})

(def DayCountConvention-ActualActualICMA
  "day-count convention that uses the actual number of days in each month and actual number of days in that year for calculating interest payments"
  {:db/ident :fibo-fbc-dae-dbt/DayCountConvention-ActualActualICMA,
   :fibo-fnd-utl-av/explanatoryNote
   ["See ICMA Rule 251.1(iii), ISDA 2006 Section 4.16(c), https://web.archive.org/web/20140913145444/http://www.hsbcnet.com/gbm/attachments/standalone/2006-isda-definitions.pdf for more details on the calculation."
    "This method ensures that all coupon payments are always for the same amount. It also ensures that all days in a coupon period are valued equally. This is the convention used for US Treasury bonds and notes, among other securities."],
   :fibo-fnd-utl-av/synonym
   ["ISMA-99" "act/act ICMA" "actual/actual" "act/act ISMA"],
   :rdf/type [:fibo-fbc-dae-dbt/DayCountConvention :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "day-count convention actual/actual ICMA",
   :skos/definition
   "day-count convention that uses the actual number of days in each month and actual number of days in that year for calculating interest payments"})

(def DayCountConvention-ActualActualISDA
  "day-count convention that uses the actual number of days in each month and actual number of days in that year for calculating interest payments"
  {:db/ident :fibo-fbc-dae-dbt/DayCountConvention-ActualActualISDA,
   :fibo-fnd-utl-av/explanatoryNote
   ["See ISDA 2006 Section 4.16(b), https://web.archive.org/web/20140913145444/http://www.hsbcnet.com/gbm/attachments/standalone/2006-isda-definitions.pdf for more details on the calculation."
    "This convention accounts for days in the period based on the portion in a leap year and the portion in a non-leap year."],
   :fibo-fnd-utl-av/synonym ["actual/365" "actual/actual" "act/act" "act/365"],
   :rdf/type [:owl/NamedIndividual :fibo-fbc-dae-dbt/DayCountConvention],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "day-count convention actual/actual ISDA",
   :skos/definition
   "day-count convention that uses the actual number of days in each month and actual number of days in that year for calculating interest payments"})

(def Debt
  "an obligation to pay something, such as an amount of money, good, service, or instrument"
  {:db/ident :fibo-fbc-dae-dbt/Debt,
   :fibo-fnd-utl-av/explanatoryNote
   "In cases where the debtor and payer are the same legal person, then a debt is equivalent to a payment obligation.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "debt",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-dae-dbt/isOwedTo,
                      :owl/someValuesFrom :fibo-fbc-dae-dbt/Creditor,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-dae-dbt/isOwedBy,
                      :owl/someValuesFrom :fibo-fbc-dae-dbt/Debtor,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-agr-agr/Commitment],
   :skos/definition
   "an obligation to pay something, such as an amount of money, good, service, or instrument"})

(def DebtTerms
  "contract terms that specify the formal rights and obligations of borrower and lender under a contract in which funds are lent from the one party to the other"
  {:db/ident :fibo-fbc-dae-dbt/DebtTerms,
   :fibo-fnd-utl-av/explanatoryNote
   "These may be terms in a loan contract (including for example a mortgage contract) or they may be the contractual terms of a debt security.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "debt terms",
   :rdfs/subClassOf :fibo-fnd-agr-ctr/ContractualCommitment,
   :skos/definition
   "contract terms that specify the formal rights and obligations of borrower and lender under a contract in which funds are lent from the one party to the other"})

(def Debtor
  "a party that owes a debt or other obligation to another party"
  {:db/ident :fibo-fbc-dae-dbt/Debtor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "debtor",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-dae-dbt/Debt,
                      :owl/onProperty :fibo-fbc-dae-dbt/owes,
                      :rdf/type       :owl/Restriction}
                     {:owl/allValuesFrom :fibo-be-le-lp/LegalPerson,
                      :owl/onProperty    :fibo-fnd-rel-rel/hasIdentity,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-agr-agr/Obligor],
   :skos/definition
   "a party that owes a debt or other obligation to another party"})

(def ExplicitContractEventSchedule
  "schedule of events, including but not limited to payment events, rate reset events and others that will occur over the lifetime of the credit agreement"
  {:db/ident :fibo-fbc-dae-dbt/ExplicitContractEventSchedule,
   :fibo-fnd-utl-av/explanatoryNote
   "This is a schedule of actual dates and events that are terms of the contract.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "explicit contract event schedule",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/appliesTo,
                      :owl/someValuesFrom :fibo-fbc-dae-dbt/CreditAgreement,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-fd/AdHocSchedule],
   :skos/definition
   "schedule of events, including but not limited to payment events, rate reset events and others that will occur over the lifetime of the credit agreement"})

(def FixedInterestRate
  "an interest rate that does not fluctuate over the lifetime of a loan or other debt instrument"
  {:db/ident :fibo-fbc-dae-dbt/FixedInterestRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "fixed interest rate",
   :rdfs/subClassOf :fibo-fnd-acc-cur/InterestRate,
   :skos/definition
   "an interest rate that does not fluctuate over the lifetime of a loan or other debt instrument"})

(def FloatingInterestRate
  "a variable interest rate that is based on a specific index or benchmark rate"
  {:db/ident :fibo-fbc-dae-dbt/FloatingInterestRate,
   :fibo-fnd-utl-av/explanatoryNote
   "The index used to determine the specific interest rate is generally included in the terms of the loan. In most cases, lenders will also charge a spread, or added percentage points on top of the established index rate. If a loan is billed as prime plus 2.5 percent, for a prime rate of 3.5 percent, the terms of the loan will require the borrower to pay off a 6 percent interest. Floating interest rates typically involve periodic reset dates for the loan, particularly when the index rate changes. Resets may also occur online at market predetermined intervals, with yearly adjustments being a common arrangement.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "floating interest rate",
   :rdfs/seeAlso
   ["http://recomparison.com/comparisons/100975/floating-vs-variable-vs-adjustable-interest-rate/"],
   :rdfs/subClassOf :fibo-fbc-dae-dbt/VariableInterestRate,
   :skos/definition
   "a variable interest rate that is based on a specific index or benchmark rate",
   :skos/example
   "Certain revolving credit, such as credit-card related debt, may adjust after a specified period of time to an absolute rate stated in the agreement (variable but not floating) rather than based on a benchmark rate (variable, floating)."})

(def FullAmortization
  "amortization in which the very last payment (which, if the schedule was calculated correctly, should be equal to all others) pays off all remaining principal and interest on the loan"
  {:db/ident :fibo-fbc-dae-dbt/FullAmortization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "full amortization",
   :rdfs/subClassOf :fibo-fbc-dae-dbt/Amortization,
   :skos/definition
   "amortization in which the very last payment (which, if the schedule was calculated correctly, should be equal to all others) pays off all remaining principal and interest on the loan"})

(def Interest
  "the cost of using credit, or another's money, expressed as a rate per period of time, payable by a debtor to a creditor in consideration of the credit extended to the debtor"
  {:db/ident :fibo-fbc-dae-dbt/Interest,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "interest",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-dae-dbt/isInterestOn,
                      :owl/someValuesFrom :fibo-fbc-dae-dbt/Debt,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :fibo-fnd-dt-fd/DatePeriod,
                      :owl/onProperty    :fibo-fnd-dt-fd/hasDatePeriod,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :fibo-fnd-acc-cur/InterestRate,
                      :owl/onProperty    :fibo-fbc-dae-dbt/hasInterestRate,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-acc-cur/MonetaryAmount],
   :skos/definition
   "the cost of using credit, or another's money, expressed as a rate per period of time, payable by a debtor to a creditor in consideration of the credit extended to the debtor"})

(def InterestPaymentTerms
  "contract terms for payment of interest on a debt"
  {:db/ident :fibo-fbc-dae-dbt/InterestPaymentTerms,
   :fibo-fnd-utl-av/explanatoryNote
   ["Interest is usually payable on any outstanding principal amount, therefore interest relates to the amount of debt outstanding at any given point of time, not to the principal amount advanced at the time that the loan was advanced or the debt security issued (aside from the initial payment)."
    "Note that in most cases, the dates and payment frequencies for interest will coincide with the dates and payment frequencies related to the principal."],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "interest payment terms",
   :rdfs/subClassOf
   [{:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fnd-dt-fd/Date,
     :owl/onProperty :fibo-fbc-dae-dbt/hasInitialInterestPaymentDate,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fnd-acc-cur/InterestRate,
     :owl/onProperty :fibo-fbc-dae-dbt/hasInterestRateCap,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-dae-dbt/governsPaymentOf,
     :owl/someValuesFrom :fibo-fbc-dae-dbt/Interest,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-dae-dbt/DebtTerms
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fnd-dt-fd/Date,
     :owl/onProperty :fibo-fbc-dae-dbt/hasInitialInterestAccrualDate,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-dae-dbt/DayCountConvention,
     :owl/onProperty :fibo-fbc-dae-dbt/hasAccrualBasis,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fnd-dt-fd/RecurrenceInterval,
     :owl/onProperty :fibo-fbc-dae-dbt/hasInterestPaymentFrequency,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fnd-dt-bd/DayOfMonth,
     :owl/onProperty :fibo-fbc-dae-dbt/hasInterestPaymentDay,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fnd-dt-fd/RecurrenceInterval,
     :owl/onProperty :fibo-fbc-dae-dbt/hasCompoundingFrequency,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fnd-acc-cur/InterestRate,
     :owl/onProperty :fibo-fbc-dae-dbt/hasInterestRate,
     :rdf/type       :owl/Restriction}],
   :skos/definition "contract terms for payment of interest on a debt"})

(def Lender
  "a party that extends credit or money to a borrower with the expectation of being repaid, usually with interest"
  {:db/ident :fibo-fbc-dae-dbt/Lender,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "lender",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-pty-pty/isAPartyTo,
                          :owl/someValuesFrom :fibo-fbc-dae-dbt/CreditAgreement,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-fnd-agr-ctr/ContractParty
    :fibo-fbc-dae-dbt/Creditor],
   :skos/definition
   "a party that extends credit or money to a borrower with the expectation of being repaid, usually with interest"})

(def ManagedInterestRate
  "a variable interest rate charged by a financial institution for borrowing that is not prescribed as a margin over base rate but is set from time to time by the institution"
  {:db/ident :fibo-fbc-dae-dbt/ManagedInterestRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "managed interest rate",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
                      :owl/someValuesFrom
                      :fibo-fbc-pas-fpas/FinancialServiceProvider,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-dae-dbt/VariableInterestRate],
   :skos/definition
   "a variable interest rate charged by a financial institution for borrowing that is not prescribed as a margin over base rate but is set from time to time by the institution"})

(def NegativeAmortization
  "amortization in which the payments made do not cover the interest due"
  {:db/ident :fibo-fbc-dae-dbt/NegativeAmortization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "negative amortization",
   :rdfs/subClassOf :fibo-fbc-dae-dbt/Amortization,
   :skos/definition
   "amortization in which the payments made do not cover the interest due"})

(def NonPhysicalCollateral
  "asset pledged as collateral that is a financial asset, rather than physical asset"
  {:db/ident :fibo-fbc-dae-dbt/NonPhysicalCollateral,
   :owl/disjointWith :fibo-fbc-dae-dbt/PhysicalCollateral,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "non-physical collateral",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-acc-aeq/FinancialAsset,
                      :owl/onProperty :fibo-fbc-dae-dbt/isCollateralizationOf,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-dae-dbt/Collateral],
   :skos/definition
   "asset pledged as collateral that is a financial asset, rather than physical asset",
   :skos/example
   "Examples of non-physical collateral include, but are not limited to, bank deposits, accounts receivable, stocks, bonds, other securities, and the like."})

(def PartialAmortization
  "amortization in which the very last payment the last payment due may be a large balloon payment of all remaining principal and interest"
  {:db/ident :fibo-fbc-dae-dbt/PartialAmortization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "partial amortization",
   :rdfs/subClassOf :fibo-fbc-dae-dbt/Amortization,
   :skos/definition
   "amortization in which the very last payment the last payment due may be a large balloon payment of all remaining principal and interest"})

(def PhysicalCollateral
  "asset pledged as collateral that has a material form, i.e., is a physical asset of the obligor"
  {:db/ident :fibo-fbc-dae-dbt/PhysicalCollateral,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "physical collateral",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-acc-aeq/PhysicalAsset,
                      :owl/onProperty :fibo-fbc-dae-dbt/isCollateralizationOf,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-dae-dbt/Collateral],
   :skos/definition
   "asset pledged as collateral that has a material form, i.e., is a physical asset of the obligor",
   :skos/example
   "Examples of physical collateral include, but are not limited to, real estate, equipment, vehicles, spare parts, inventory, goods, supplies, fixtures, and leasehold improvements."})

(def Principal
  "with respect to a debt: the value of an obligation, such as a bond or loan, raised and that must be repaid at maturity; for investments: the original amount of money invested, separate from any associated interest, dividends or capital gains"
  {:db/ident :fibo-fbc-dae-dbt/Principal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "principal",
   :rdfs/seeAlso ["http://www.finra.org/investors/bond-glossary#p"],
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-dae-dbt/isPrincipalOf,
                      :owl/someValuesFrom :fibo-fbc-dae-dbt/Debt,
                      :rdf/type           :owl/Restriction}
                     {:owl/unionOf [:fibo-fnd-acc-cur/MonetaryAmount
                                    :fibo-fnd-pas-pas/NegotiableCommodity],
                      :rdf/type    :owl/Class}],
   :skos/definition
   "with respect to a debt: the value of an obligation, such as a bond or loan, raised and that must be repaid at maturity; for investments: the original amount of money invested, separate from any associated interest, dividends or capital gains"})

(def PrincipalRepaymentTerms
  "contract terms that specify requirements for repayment of the principal"
  {:db/ident :fibo-fbc-dae-dbt/PrincipalRepaymentTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "principal repayment terms",
   :rdfs/subClassOf
   [{:owl/maxQualifiedCardinality 1,
     :owl/onClass    :fibo-fnd-agr-ctr/ExtensionProvision,
     :owl/onProperty :fibo-fnd-agr-ctr/hasExtensionProvision,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fnd-dt-fd/RecurrenceInterval,
     :owl/onProperty :fibo-fbc-dae-dbt/hasPrincipalPaymentFrequency,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fnd-dt-fd/Date,
     :owl/onProperty :fibo-fbc-dae-dbt/hasInitialPrincipalPaymentDate,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fnd-dt-bd/DayOfMonth,
     :owl/onProperty :fibo-fbc-dae-dbt/hasPrincipalPaymentDay,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-dae-dbt/governsPaymentOf,
     :owl/someValuesFrom :fibo-fbc-dae-dbt/Principal,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fnd-dt-fd/Date,
     :owl/onProperty :fibo-fbc-dae-dbt/hasPrincipalRepaymentDate,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-dae-dbt/DebtTerms],
   :skos/definition
   "contract terms that specify requirements for repayment of the principal"})

(def ProjectedContractEventSchedule
  "schedule of events, including but not limited to anticipated payment events, rate reset events and others that are expected to occur over the lifetime of the credit agreement"
  {:db/ident :fibo-fbc-dae-dbt/ProjectedContractEventSchedule,
   :fibo-fnd-utl-av/explanatoryNote
   "This is a regular schedule that provides a way of documenting the anchor dates and frequency of occurrences, using rules, rather than an explicit list of dates, that are terms of the contract. This method will project future event dates (transaction event dates), based on the frequencies specified and would be adjusted due to calendar restrictions and other rules to deal with holidays, weekends, and so forth.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "projected contract event schedule",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/appliesTo,
                      :owl/someValuesFrom :fibo-fbc-dae-dbt/CreditAgreement,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-fd/RegularSchedule],
   :skos/definition
   "schedule of events, including but not limited to anticipated payment events, rate reset events and others that are expected to occur over the lifetime of the credit agreement"})

(def PromissoryNote
  "negotiable instrument that is a written promise by one party to another that commits that party to pay a specified sum on demand or within a specified time frame under specified terms"
  {:db/ident :fibo-fbc-dae-dbt/PromissoryNote,
   :fibo-fnd-utl-av/explanatoryNote
   "Promissory notes are generally fully fungible.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "promissory note",
   :rdfs/subClassOf :fibo-fbc-dae-dbt/CreditAgreement,
   :skos/definition
   "negotiable instrument that is a written promise by one party to another that commits that party to pay a specified sum on demand or within a specified time frame under specified terms"})

(def RateResetTimeOfDay
  "time of day that an interest rate is reset, as indicated by some interest rate authority or market data provider"
  {:db/ident :fibo-fbc-dae-dbt/RateResetTimeOfDay,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "rate reset time of day",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-plc-loc/BusinessCenter,
                      :owl/onProperty :fibo-fnd-plc-loc/hasBusinessCenter,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-dt-fd/TimeOfDay],
   :skos/definition
   "time of day that an interest rate is reset, as indicated by some interest rate authority or market data provider",
   :skos/example
   "Examples include certain rates published by the Federal Reserve Board in their H.15 schedule, which are published at 4:15 pm on business days that are not holidays in the US."})

(def RetailCreditFacility
  "credit facility that is a loan or line of credit used by retailers and real estate companies"
  {:db/ident :fibo-fbc-dae-dbt/RetailCreditFacility,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "retail credit facility"},
   :rdfs/subClassOf :fibo-fbc-dae-dbt/CommittedCreditFacility,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit facility that is a loan or line of credit used by retailers and real estate companies"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Most consumer credit cards are retail credit facilities, for example."}})

(def RevolvingLineOfCredit
  "credit facility that enables the borrower to withdraw funds, repay, and withdraw again"
  {:db/ident :fibo-fbc-dae-dbt/RevolvingLineOfCredit,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Revolving credit facilities are essentially lines of credit with variable interest rates."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "revolving line of credit"},
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-dae-dbt/Collateral,
                      :owl/onProperty :fibo-fbc-dae-dbt/isCollateralizedBy,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-dae-dbt/CommittedCreditFacility],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit facility that enables the borrower to withdraw funds, repay, and withdraw again"}})

(def SubFacility
  "portion of a credit facility extended to the borrower for some purpose, possibly per some schedule specified in the facility"
  {:db/ident :fibo-fbc-dae-dbt/SubFacility,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Each sub-facility may have separate terms, and may be or include individual promissory notes, depending on the facility. The amount of associated with the individual sub-facilities sums to the total credit facility amount. Sub-facilities may, individually, have a stated purpose, such as to cover inventory, equipment, accounts receivable, working capital, letters of credit, and so forth."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "sub-facility"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-acc-cur/hasMonetaryAmount,
                      :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryAmount,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :fibo-fbc-dae-dbt/CreditFacility,
                      :owl/onProperty :fibo-fnd-arr-arr/isConstituentOf,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-agr-ctr/MutualContractualAgreement],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "portion of a credit facility extended to the borrower for some purpose, possibly per some schedule specified in the facility"}})

(def UncommittedCreditFacility
  "credit facility that has yet to be confirmed as a source of financing for the borrower"
  {:db/ident :fibo-fbc-dae-dbt/UncommittedCreditFacility,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "uncommitted credit facility"},
   :rdfs/subClassOf :fibo-fbc-dae-dbt/CreditFacility,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit facility that has yet to be confirmed as a source of financing for the borrower"}})

(def UncommittedSubFacility
  "sub-facility that has yet to be confirmed as a source of financing for the borrower"
  {:db/ident :fibo-fbc-dae-dbt/UncommittedSubFacility,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "uncommitted sub-facility"},
   :rdfs/subClassOf :fibo-fbc-dae-dbt/SubFacility,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "sub-facility that has yet to be confirmed as a source of financing for the borrower"}})

(def VariableInterestRate
  "an interest rate that is allowed to vary over the maturity of a loan or other debt instrument"
  {:db/ident :fibo-fbc-dae-dbt/VariableInterestRate,
   :fibo-fnd-utl-av/synonym "adjustable rate",
   :owl/disjointWith :fibo-fbc-dae-dbt/FixedInterestRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "variable interest rate",
   :rdfs/subClassOf :fibo-fnd-acc-cur/InterestRate,
   :skos/definition
   "an interest rate that is allowed to vary over the maturity of a loan or other debt instrument"})

(def governsPaymentOf
  "links contractual terms embedded in a contract, such as interest or repayment terms to the element those terms apply to"
  {:db/ident :fibo-fbc-dae-dbt/governsPaymentOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-dae-dbt/DebtTerms,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "governs payment of",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/governs,
   :skos/definition
   "links contractual terms embedded in a contract, such as interest or repayment terms to the element those terms apply to"})

(def hasAccrualBasis
  "identifies the convention that defines how interest accrues on something, that is the number of days in a month and days in a year that are counted when performing interest accrual calculations"
  {:db/ident :fibo-fbc-dae-dbt/hasAccrualBasis,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "has accrual basis",
   :rdfs/range :fibo-fbc-dae-dbt/DayCountConvention,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition
   "identifies the convention that defines how interest accrues on something, that is the number of days in a month and days in a year that are counted when performing interest accrual calculations"})

(def hasAvailableAmount
  "indicates an amount of money available for an individual or organization to borrow"
  {:db/ident :fibo-fbc-dae-dbt/hasAvailableAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "has available amount",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   "indicates an amount of money available for an individual or organization to borrow"})

(def hasBorrower
  "relates a contract, such as a debt instrument or credit agreement, to one or more parties that are incurring the debt"
  {:db/ident :fibo-fbc-dae-dbt/hasBorrower,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "has borrower",
   :rdfs/range :fibo-fbc-dae-dbt/Borrower,
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasContractParty,
   :skos/definition
   "relates a contract, such as a debt instrument or credit agreement, to one or more parties that are incurring the debt"})

(def hasCompoundingFrequency
  "the frequency at which interest is added to the principal of the debt over the course of the agreement"
  {:db/ident :fibo-fbc-dae-dbt/hasCompoundingFrequency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "has compounding frequency",
   :rdfs/range :fibo-fnd-dt-fd/RecurrenceInterval,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasRecurrenceInterval,
   :skos/definition
   "the frequency at which interest is added to the principal of the debt over the course of the agreement"})

(def hasDebtAmount
  "indicates the monetary amount of the debt"
  {:db/ident :fibo-fbc-dae-dbt/hasDebtAmount,
   :fibo-fnd-utl-av/explanatoryNote
   "Represents the total debt amount including principal and interest",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-dae-dbt/CreditAgreement,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "has debt amount",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition "indicates the monetary amount of the debt"})

(def hasDenomination
  "the face value of currency units, coins, or securities"
  {:db/ident :fibo-fbc-dae-dbt/hasDenomination,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "has denomination",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition "the face value of currency units, coins, or securities"})

(def hasFinalInterestPaymentDate
  "the date on which the last interest payment is due"
  {:db/ident :fibo-fbc-dae-dbt/hasFinalInterestPaymentDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "has final interest payment date",
   :rdfs/range :fibo-fnd-dt-fd/Date,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasEndDate,
   :skos/definition "the date on which the last interest payment is due"})

(def hasInitialInterestAccrualDate
  "the date from which interest begins to accrue"
  {:db/ident :fibo-fbc-dae-dbt/hasInitialInterestAccrualDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "has initial interest accrual date",
   :rdfs/range :fibo-fnd-dt-fd/Date,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasStartDate,
   :skos/definition "the date from which interest begins to accrue"})

(def hasInitialInterestPaymentDate
  "the date on which the first interest payment is due"
  {:db/ident :fibo-fbc-dae-dbt/hasInitialInterestPaymentDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "has initial interest payment date",
   :rdfs/range :fibo-fnd-dt-fd/Date,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasStartDate,
   :skos/definition "the date on which the first interest payment is due"})

(def hasInitialPrincipalPaymentDate
  "the date on which the first payment against the principal is due"
  {:db/ident :fibo-fbc-dae-dbt/hasInitialPrincipalPaymentDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "has initial principal payment date",
   :rdfs/range :fibo-fnd-dt-fd/Date,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasStartDate,
   :skos/definition
   "the date on which the first payment against the principal is due"})

(def hasInterestPaymentDay
  "the day of the month on which interest payments must be made on the debt"
  {:db/ident :fibo-fbc-dae-dbt/hasInterestPaymentDay,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "has interest payment day",
   :rdfs/range :fibo-fnd-dt-fd/RecurrenceInterval,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasRecurrenceInterval,
   :skos/definition
   "the day of the month on which interest payments must be made on the debt"})

(def hasInterestPaymentFrequency
  "the frequency at which interest payments must be made on the debt"
  {:db/ident :fibo-fbc-dae-dbt/hasInterestPaymentFrequency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "has interest payment frequency",
   :rdfs/range :fibo-fnd-dt-fd/RecurrenceInterval,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasRecurrenceInterval,
   :skos/definition
   "the frequency at which interest payments must be made on the debt"})

(def hasInterestRate
  "relates something, such as an agreement, or debt instrument, to the rate (typically annual) of interest that is to be paid by the debtor to the creditor on the debt"
  {:db/ident :fibo-fbc-dae-dbt/hasInterestRate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "has interest rate",
   :rdfs/range :fibo-fnd-acc-cur/InterestRate,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition
   "relates something, such as an agreement, or debt instrument, to the rate (typically annual) of interest that is to be paid by the debtor to the creditor on the debt"})

(def hasInterestRateCap
  "relates something, such as an agreement, or debt instrument, to the upper bound (ceiling) rate (typically annual) of interest on variable-rate debt that is to be paid by the debtor to the creditor on the debt"
  {:db/ident :fibo-fbc-dae-dbt/hasInterestRateCap,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "has interest rate cap",
   :rdfs/range :fibo-fnd-acc-cur/InterestRate,
   :rdfs/subPropertyOf :fibo-fbc-dae-dbt/hasInterestRate,
   :skos/definition
   "relates something, such as an agreement, or debt instrument, to the upper bound (ceiling) rate (typically annual) of interest on variable-rate debt that is to be paid by the debtor to the creditor on the debt"})

(def hasLender
  "relates a contract, such as a debt instrument or credit agreement, to one or more parties that are financing the debt"
  {:db/ident :fibo-fbc-dae-dbt/hasLender,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "has lender",
   :rdfs/range :fibo-fbc-dae-dbt/Lender,
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasContractParty,
   :skos/definition
   "relates a contract, such as a debt instrument or credit agreement, to one or more parties that are financing the debt"})

(def hasMaturityDate
  "indicates the date on which the principal amount of an instrument is due to be repaid to the investor and interest or coupon payments stop, and/or the date on which the instrument may be redeemed"
  {:db/ident :fibo-fbc-dae-dbt/hasMaturityDate,
   :fibo-fnd-utl-av/explanatoryNote
   "Maturity dates typically apply to debt instruments, such as notes, drafts, bonds, and other loans, but may also apply to preferred shares and other financial instruments.",
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "has maturity date",
   :rdfs/range :fibo-fnd-dt-fd/ExplicitDate,
   :rdfs/subPropertyOf [:fibo-fnd-dt-fd/hasExplicitDate
                        :fibo-fnd-dt-fd/hasEndDate],
   :skos/definition
   "indicates the date on which the principal amount of an instrument is due to be repaid to the investor and interest or coupon payments stop, and/or the date on which the instrument may be redeemed"})

(def hasOriginalTimeToMaturity
  "indicates the lifespan of credit agreement or offering, from the date of issuance to the scheduled maturity date"
  {:db/ident :fibo-fbc-dae-dbt/hasOriginalTimeToMaturity,
   :fibo-fnd-utl-av/synonym "has term to maturity",
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "has time to maturity",
   :rdfs/range :fibo-fnd-dt-fd/ExplicitDuration,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasDuration,
   :skos/definition
   "indicates the lifespan of credit agreement or offering, from the date of issuance to the scheduled maturity date"})

(def hasOutstandingAmount
  "indicates an amount of money representing the principal, interest, or other amount owed at a specific point in time"
  {:db/ident :fibo-fbc-dae-dbt/hasOutstandingAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "has outstanding amount",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   "indicates an amount of money representing the principal, interest, or other amount owed at a specific point in time"})

(def hasPrincipal
  "indicates the face value of an obligation, such as a bond or loan, that must be repaid at maturity, i.e., the base amount raised by a mortgage or other debt instrument"
  {:db/ident :fibo-fbc-dae-dbt/hasPrincipal,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "has principal",
   :rdfs/range :fibo-fbc-dae-dbt/Principal,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition
   "indicates the face value of an obligation, such as a bond or loan, that must be repaid at maturity, i.e., the base amount raised by a mortgage or other debt instrument",
   :skos/editorialNote
   "This is not the balance of the debt at a point in time, but the amount drawn down at a specific point in time, after which (for interest bearing debts) interest becomes payable. Semantic Modeling note This term is over-ridden for specific kinds of debt (securities, loans) and is therefore not needed in any data model. It is included here to define part of the meaning of the Debt Finance term. It is a Relationship Fact and strictly speaking should be regarded as being specialized and over-ridden by the terms in the Loan and Security classes, however it is modeled here as a \"Referenceable Archetype\" meaning that it appears in diagrams as a textual entry not a relationship line, and so it is not possible to formally show this specialization."})

(def hasPrincipalPaymentDay
  "the day of the month on which payments on the principal must be made"
  {:db/ident :fibo-fbc-dae-dbt/hasPrincipalPaymentDay,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "has principal payment day",
   :rdfs/range :fibo-fnd-dt-fd/RecurrenceInterval,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasRecurrenceInterval,
   :skos/definition
   "the day of the month on which payments on the principal must be made"})

(def hasPrincipalPaymentFrequency
  "the frequency at which payments on the principal must be made"
  {:db/ident :fibo-fbc-dae-dbt/hasPrincipalPaymentFrequency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "has principal payment frequency",
   :rdfs/range :fibo-fnd-dt-fd/RecurrenceInterval,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasRecurrenceInterval,
   :skos/definition
   "the frequency at which payments on the principal must be made"})

(def hasPrincipalRepaymentDate
  "relates an instrument to the date by which the principal must be repaid in full"
  {:db/ident :fibo-fbc-dae-dbt/hasPrincipalRepaymentDate,
   :fibo-fnd-utl-av/explanatoryNote
   "Depending on the terms of the instrument (debt security, such as a bond, loan, etc.), this may be the date of a single payment of the debt principal or of the completion of scheduled partial redemption payments.",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-dae-dbt/PrincipalRepaymentTerms,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "has principal repayment date",
   :rdfs/range :fibo-fnd-dt-fd/Date,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasEndDate,
   :skos/definition
   "relates an instrument to the date by which the principal must be repaid in full"})

(def isAmortizationOf
  "links the process of reduction of debt or other costs through periodic charges to the relevant asset or liability"
  {:db/ident :fibo-fbc-dae-dbt/isAmortizationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-dae-dbt/Amortization,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "is amortization of",
   :skos/definition
   "links the process of reduction of debt or other costs through periodic charges to the relevant asset or liability"})

(def isBasedOn
  "relates something to something else on which it rests, or that supports it in some way"
  {:db/ident :fibo-fbc-dae-dbt/isBasedOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "is based on",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/appliesTo,
   :skos/definition
   "relates something to something else on which it rests, or that supports it in some way"})

(def isCollateralizationOf
  "relates some collateral to a credit agreement or debt instrument for which the property has been pledged as security for the debt"
  {:db/ident :fibo-fbc-dae-dbt/isCollateralizationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-dae-dbt/Collateral,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "is collateralization of",
   :skos/definition
   "relates some collateral to a credit agreement or debt instrument for which the property has been pledged as security for the debt"})

(def isCollateralizedBy
  "relates a credit agreement or debt instrument to property pledged as security for the debt"
  {:db/ident :fibo-fbc-dae-dbt/isCollateralizedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "is collateralized by",
   :rdfs/range :fibo-fbc-dae-dbt/Collateral,
   :skos/definition
   "relates a credit agreement or debt instrument to property pledged as security for the debt"})

(def isInterestOn
  "links a monetary amount that is the cost of using credit to the debt that it applies to"
  {:db/ident :fibo-fbc-dae-dbt/isInterestOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-dae-dbt/Interest,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "is interest on",
   :skos/definition
   "links a monetary amount that is the cost of using credit to the debt that it applies to"})

(def isOwed
  "links a creditor to a debt that is outstanding and payable to them"
  {:db/ident :fibo-fbc-dae-dbt/isOwed,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-dae-dbt/Creditor,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "is owed",
   :rdfs/range :fibo-fbc-dae-dbt/Debt,
   :skos/definition
   "links a creditor to a debt that is outstanding and payable to them"})

(def isOwedBy
  "links a debt to the party that owes it"
  {:db/ident :fibo-fbc-dae-dbt/isOwedBy,
   :owl/inverseOf :fibo-fbc-dae-dbt/owes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-dae-dbt/Debt,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "is owed by",
   :rdfs/range :fibo-fbc-dae-dbt/Debtor,
   :skos/definition "links a debt to the party that owes it"})

(def isOwedTo
  "links a debt to the party to which it is payable"
  {:db/ident :fibo-fbc-dae-dbt/isOwedTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-dae-dbt/Debt,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "is owed to",
   :rdfs/range :fibo-fbc-dae-dbt/Creditor,
   :skos/definition "links a debt to the party to which it is payable"})

(def isPrincipalOf
  "links the value of a debt, excluding any interest or other costs of using credit, to the debt that it applies to"
  {:db/ident :fibo-fbc-dae-dbt/isPrincipalOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-dae-dbt/Principal,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "is principal of",
   :skos/definition
   "links the value of a debt, excluding any interest or other costs of using credit, to the debt that it applies to"})

(def owes
  "links a party to a debt that they owe"
  {:db/ident :fibo-fbc-dae-dbt/owes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-dae-dbt/Debtor,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfs/label "owes",
   :rdfs/range :fibo-fbc-dae-dbt/Debt,
   :skos/definition "links a party to a debt that they owe"})