(ns net.wikipunk.rdf.fibo-loan-reln-mtg
  "Loans that have collateral posted as security and where that collateral is real estate, and the real estate which makes up the collateral is purchased with the funds loaned. This ontology covers a range of mortgage concepts and parties, along with catewgories of mortgage loan purpose (remortgage, second home etc.)."
  {:cmns-av/copyright ["Copyright (c) 2016-2023 Object Management Group, Inc."
                       "Copyright (c) 2016-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :dcterms/abstract
   "Loans that have collateral posted as security and where that collateral is real estate, and the real estate which makes up the collateral is purchased with the funds loaned. This ontology covers a range of mortgage concepts and parties, along with catewgories of mortgage loan purpose (remortgage, second home etc.).",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"
    "https://www.omg.org/spec/Commons/Identifiers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansGeneral/LoanApplications/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://www.omg.org/spec/Commons/DatesAndTimes/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://www.omg.org/spec/Commons/Classifiers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/AgentsAndPeople/Agents/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/ClientsAndAccounts/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/LegalCapacity/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LEIEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Guaranty/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/Occurrences/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansGeneral/Loans/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Assessments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/RealEstateLoans/MortgageLoans/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-lei"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fbc-dae-gty"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fbc-pas-caa"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-aap-agt"
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-arr-asmt"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-dt-oc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/",
    "fibo-fnd-law-lcap"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/",
    "fibo-fnd-plc-adr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/",
    "fibo-fnd-plc-loc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-loan-ln-ln"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/",
    "fibo-loan-reln-mtg"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-loan-reln-mtg",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label #voc/lstr "Mortgage Loans Ontology@en"})

(def AmortizationType
  "classifier of amortization algorithms"
  {:db/ident :fibo-loan-reln-mtg/AmortizationType,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "amortization type",
   :rdfs/subClassOf [:cmns-cls/Classifier :fibo-loan-reln-mtg/AmortizationType],
   :skos/definition "classifier of amortization algorithms"})

(def AmortizationType-adjustableRate
  "a loan that allows the lender to periodically adjust the interest rate in accordance with a specified index"
  {:cmns-av/adaptedFrom "the 2015 Revised HMDA regulation.",
   :db/ident :fibo-loan-reln-mtg/AmortizationType-adjustableRate,
   :rdf/type [:fibo-loan-reln-mtg/AmortizationType
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "adjustable rate",
   :skos/definition
   "a loan that allows the lender to periodically adjust the interest rate in accordance with a specified index"})

(def AmortizationType-fixedRate
  "a loan in which the interest rate and payments remain the same for the life of the loan"
  {:cmns-av/adaptedFrom "the 2015 Revised HMDA regulation.",
   :db/ident :fibo-loan-reln-mtg/AmortizationType-fixedRate,
   :rdf/type [:fibo-loan-reln-mtg/AmortizationType
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "fixed rate",
   :skos/definition
   "a loan in which the interest rate and payments remain the same for the life of the loan"})

(def AmortizationType-graduatedPayment
  "a flexible payment loan where the payments increase for a specified period of time and then level off"
  {:cmns-av/adaptedFrom "the 2015 Revised HMDA regulation.",
   :cmns-av/explanatoryNote "Usually involves negative amortization.",
   :db/ident :fibo-loan-reln-mtg/AmortizationType-graduatedPayment,
   :rdf/type [:fibo-loan-reln-mtg/AmortizationType
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "graduated payment",
   :skos/definition
   "a flexible payment loan where the payments increase for a specified period of time and then level off"})

(def AmortizationType-graduatedPaymentAdjustable
  "a loan for which there are periodic payments/rate changes with additional specified principal and interest changes as documented in the Security Instruments."
  {:cmns-av/adaptedFrom "the 2015 Revised HMDA regulation.",
   :db/ident :fibo-loan-reln-mtg/AmortizationType-graduatedPaymentAdjustable,
   :rdf/type [:fibo-loan-reln-mtg/AmortizationType
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "graduated payment adjustable",
   :skos/definition
   "a loan for which there are periodic payments/rate changes with additional specified principal and interest changes as documented in the Security Instruments."})

(def AmortizationType-growingEquity
  "A graduated payment loan in which increases in a borrowers loan payments are used to accelerate reduction of principal on the mortgage"
  {:cmns-av/adaptedFrom "the 2015 Revised HMDA regulation.",
   :cmns-av/explanatoryNote
   "Due to increased payment, the borrower acquires equity more rapidly and retires the debt earlier.",
   :db/ident :fibo-loan-reln-mtg/AmortizationType-growingEquity,
   :rdf/type [:fibo-loan-reln-mtg/AmortizationType
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "growing equity",
   :skos/definition
   "A graduated payment loan in which increases in a borrowers loan payments are used to accelerate reduction of principal on the mortgage"})

(def AmortizationType-rateImprovement
  "a type of flexible loan where the interest rate may decrease based on payment history."
  {:cmns-av/adaptedFrom "the 2015 Revised HMDA regulation.",
   :db/ident :fibo-loan-reln-mtg/AmortizationType-rateImprovement,
   :rdf/type [:fibo-loan-reln-mtg/AmortizationType
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "rate improvement",
   :skos/definition
   "a type of flexible loan where the interest rate may decrease based on payment history."})

(def AmortizationType-step
  "a loan with fixed periodic payment/rate changes without subsidy or negative amortization."
  {:cmns-av/adaptedFrom "the 2015 Revised HMDA regulation.",
   :db/ident :fibo-loan-reln-mtg/AmortizationType-step,
   :rdf/type [:fibo-loan-reln-mtg/AmortizationType
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "step",
   :skos/definition
   "a loan with fixed periodic payment/rate changes without subsidy or negative amortization."})

(def AutomatedUnderwritingSystem
  "software system that collects the information necessary to approve a loan application and supports a mortgage lender's analysis of a new loan application"
  {:cmns-av/explanatoryNote
   "In the United States, automated underwriting systems review the applicant's credit history and ability to repay the loan, and determine whether the price the applicant is offering to pay is supported by the property value.",
   :db/ident :fibo-loan-reln-mtg/AutomatedUnderwritingSystem,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "automated underwriting system",
   :rdfs/subClassOf [:fibo-fnd-aap-agt/AutomatedSystem
                     :fibo-loan-reln-mtg/AutomatedUnderwritingSystem],
   :skos/definition
   "software system that collects the information necessary to approve a loan application and supports a mortgage lender's analysis of a new loan application"})

(def AutomatedUnderwritingSystem-DesktopUnderwriter
  "an automated underwriting software system produced by Fannie Mae"
  {:db/ident :fibo-loan-reln-mtg/AutomatedUnderwritingSystem-DesktopUnderwriter,
   :rdf/type [:fibo-loan-reln-mtg/AutomatedUnderwritingSystem
              :owl/NamedIndividual
              :fibo-fnd-aap-agt/AutomatedSystem],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "Desktop Underwriter",
   :skos/definition
   "an automated underwriting software system produced by Fannie Mae"})

(def AutomatedUnderwritingSystem-FHAScorecard
  "an automated underwriting software system produced by Federal Housing Administration (FHA)"
  {:db/ident :fibo-loan-reln-mtg/AutomatedUnderwritingSystem-FHAScorecard,
   :rdf/type [:fibo-loan-reln-mtg/AutomatedUnderwritingSystem
              :owl/NamedIndividual
              :fibo-fnd-aap-agt/AutomatedSystem],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "FHA Scorecard",
   :skos/definition
   "an automated underwriting software system produced by Federal Housing Administration (FHA)"})

(def AutomatedUnderwritingSystem-GuaranteedUnderwritingSystem
  "an automated underwriting software system used by the USDA rural development loan program"
  {:cmns-av/synonym "GUS",
   :db/ident
   :fibo-loan-reln-mtg/AutomatedUnderwritingSystem-GuaranteedUnderwritingSystem,
   :rdf/type [:fibo-loan-reln-mtg/AutomatedUnderwritingSystem
              :owl/NamedIndividual
              :fibo-fnd-aap-agt/AutomatedSystem],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "Guaranteed Underwriting System",
   :skos/definition
   "an automated underwriting software system used by the USDA rural development loan program"})

(def AutomatedUnderwritingSystem-LoanProspector
  "an automated underwriting software system produced by Freddie Mac"
  {:db/ident :fibo-loan-reln-mtg/AutomatedUnderwritingSystem-LoanProspector,
   :rdf/type [:fibo-loan-reln-mtg/AutomatedUnderwritingSystem
              :owl/NamedIndividual
              :fibo-fnd-aap-agt/AutomatedSystem],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "Loan Prospector",
   :skos/definition
   "an automated underwriting software system produced by Freddie Mac"})

(def CashOutStatus
  "classifier indicating the extent to which funds are released to the borrower on a new loan origination that refinances an existing loan"
  {:cmns-av/explanatoryNote
   "This is subject to lender and/or investor policy(s).",
   :db/ident :fibo-loan-reln-mtg/CashOutStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "cash-out status",
   :rdfs/subClassOf [:cmns-cls/Classifier :fibo-loan-reln-mtg/CashOutStatus],
   :skos/definition
   "classifier indicating the extent to which funds are released to the borrower on a new loan origination that refinances an existing loan"})

(def CashOutStatus-CashOut
  "the mortgage is refinanced for more than is owed and the borrower pockets the difference."
  {:db/ident :fibo-loan-reln-mtg/CashOutStatus-CashOut,
   :rdf/type [:fibo-loan-reln-mtg/CashOutStatus
              :owl/Thing
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "cashout",
   :skos/definition
   "the mortgage is refinanced for more than is owed and the borrower pockets the difference."})

(def CashOutStatus-LimitedCashOut
  "a cashout mortgage where the amount is limited by the lenger. 80% loan to value ratio is a common limit."
  {:db/ident :fibo-loan-reln-mtg/CashOutStatus-LimitedCashOut,
   :rdf/type [:fibo-loan-reln-mtg/CashOutStatus
              :owl/Thing
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "limited cashout",
   :skos/definition
   "a cashout mortgage where the amount is limited by the lenger. 80% loan to value ratio is a common limit."})

(def CashOutStatus-NoCashOut
  "The mortgage is refinanced for less than or equal to what is owed."
  {:db/ident :fibo-loan-reln-mtg/CashOutStatus-NoCashOut,
   :rdf/type [:fibo-loan-reln-mtg/CashOutStatus
              :owl/Thing
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "no cashout",
   :skos/definition
   "The mortgage is refinanced for less than or equal to what is owed."})

(def ChargeCategory
  "classifier indicating what a particular fee or other expense is for Examples include closing costs, interest, taxes, and other service-related fees."
  {:cmns-av/usageNote
   "Use with LineItem, (has ChargeCategory instance), (hasNumericalValue for number of units) and (hasCost for the amount of money)",
   :db/ident :fibo-loan-reln-mtg/ChargeCategory,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "charge category",
   :rdfs/subClassOf [:cmns-cls/Classifier :fibo-loan-reln-mtg/ChargeCategory],
   :skos/definition
   ["classifier indicating what a particular fee or other expense is for"
    "Examples include closing costs, interest, taxes, and other service-related fees."]})

(def ChargeCategory-appraisalFee
  "a charge for an appraisal"
  {:db/ident :fibo-loan-reln-mtg/ChargeCategory-appraisalFee,
   :rdf/type [:fibo-loan-reln-mtg/ChargeCategory
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "appraisal fee",
   :skos/definition "a charge for an appraisal"})

(def ChargeCategory-discountPoints
  "a charge for lowering your interest rate"
  {:cmns-av/adaptedFrom
   "https://www.consumerfinance.gov/askcfpb/136/what-are-discount-points-and-lender-credits-and-how-do-they-work.html",
   :db/ident :fibo-loan-reln-mtg/ChargeCategory-discountPoints,
   :rdf/type [:fibo-loan-reln-mtg/ChargeCategory
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "discount points",
   :skos/definition "a charge for lowering your interest rate"})

(def ChargeCategory-lenderCredits
  "a credit whereby the lender reduces closing costs in exchange for a higher interest rate."
  {:cmns-av/adaptedFrom
   "https://www.consumerfinance.gov/askcfpb/136/what-are-discount-points-and-lender-credits-and-how-do-they-work.html",
   :cmns-av/usageNote "This needs to be treated as a negative charge.",
   :db/ident :fibo-loan-reln-mtg/ChargeCategory-lenderCredits,
   :rdf/type [:fibo-loan-reln-mtg/ChargeCategory
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "lender credits",
   :skos/definition
   "a credit whereby the lender reduces closing costs in exchange for a higher interest rate."})

(def ChargeCategory-originationFee
  "a charge for an origination"
  {:db/ident :fibo-loan-reln-mtg/ChargeCategory-originationFee,
   :rdf/type [:fibo-loan-reln-mtg/ChargeCategory
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "origination fee",
   :skos/definition "a charge for an origination"})

(def ChargeCategory-principal
  "the principal of the loan that is owed"
  {:db/ident :fibo-loan-reln-mtg/ChargeCategory-principal,
   :rdf/type [:fibo-loan-reln-mtg/ChargeCategory
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "principal",
   :skos/definition "the principal of the loan that is owed"})

(def DwellingCapacity
  "classifier indicating how many dwellings some property has"
  {:db/ident :fibo-loan-reln-mtg/DwellingCapacity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "dwelling capacity",
   :rdfs/subClassOf [:cmns-cls/Classifier :fibo-loan-reln-mtg/DwellingCapacity],
   :skos/definition
   "classifier indicating how many dwellings some property has"})

(def DwellingCapacity-multiFamily
  "5 or more units"
  {:db/ident :fibo-loan-reln-mtg/DwellingCapacity-multiFamily,
   :rdf/type [:fibo-loan-reln-mtg/DwellingCapacity
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "multi-family",
   :skos/definition "5 or more units"})

(def DwellingCapacity-singleFamily
  "1-4 units"
  {:db/ident :fibo-loan-reln-mtg/DwellingCapacity-singleFamily,
   :rdf/type [:fibo-loan-reln-mtg/DwellingCapacity
              :owl/Thing
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "single family",
   :skos/definition "1-4 units"})

(def GovernmentSponsoredLoan
  "government-sponsored loan"
  {:db/ident :fibo-loan-reln-mtg/GovernmentSponsoredLoan,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label #voc/lstr "government-sponsored loan@en",
   :rdfs/subClassOf
   [:fibo-loan-reln-mtg/Mortgage
    :fibo-loan-reln-mtg/GovernmentSponsoredLoan
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-loan-ln-ln/Servicer,
     :owl/onProperty :fibo-loan-ln-ln/isServicedBy,
     :rdf/type       :owl/Restriction}
    :fibo-loan-ln-ln/ClosedEndCredit
    {:owl/onProperty     :fibo-loan-reln-mtg/hasOriginatorPerson,
     :owl/someValuesFrom {:owl/intersectionOf
                          [:fibo-be-le-lp/LegallyCompetentNaturalPerson
                           {:owl/onProperty     :cmns-id/isIdentifiedBy,
                            :owl/someValuesFrom :fibo-loan-reln-mtg/NMLSR-ID,
                            :rdf/type           :owl/Restriction}],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-loan-reln-mtg/Mortgage,
     :owl/onProperty :fibo-loan-reln-mtg/assumes,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-loan-reln-mtg/MortgageIndemnityGuarantor,
     :owl/onProperty :fibo-fbc-dae-gty/hasGuarantor,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-loan-reln-mtg/UniversalLoanIdentifier,
     :owl/onProperty :cmns-id/isIdentifiedBy,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-loan-reln-mtg/hasClosingDate,
     :owl/someValuesFrom :cmns-dt/Date,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-loan-reln-mtg/hasOriginatingServiceProvider,
     :owl/someValuesFrom {:owl/intersectionOf
                          [:fibo-fbc-pas-fpas/FinancialServiceProvider
                           {:owl/onProperty     :cmns-id/isIdentifiedBy,
                            :owl/someValuesFrom :fibo-loan-reln-mtg/NMLSR-ID,
                            :rdf/type           :owl/Restriction}],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    :fibo-loan-ln-ln/CollateralizedLoan]})

(def ManufacturedHomeLegalClassification
  "category indicating whether the covered loan is secured by a manufactured home only or with land as well"
  {:cmns-av/adaptedFrom "2015 Revised HMDA regulation",
   :db/ident :fibo-loan-reln-mtg/ManufacturedHomeLegalClassification,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "manufactured home legal classification",
   :rdfs/subClassOf [:cmns-cls/Classifier
                     :fibo-loan-reln-mtg/ManufacturedHomeLegalClassification],
   :skos/definition
   "category indicating whether the covered loan is secured by a manufactured home only or with land as well"})

(def ManufacturedHomeLegalClassification-personalProperty
  "the covered loan is secured by a manufactured home but not land"
  {:cmns-av/adaptedFrom "the 2015 Revised HMDA regulation.",
   :db/ident
   :fibo-loan-reln-mtg/ManufacturedHomeLegalClassification-personalProperty,
   :rdf/type [:fibo-loan-reln-mtg/ManufacturedHomeLegalClassification
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "personal property",
   :skos/definition
   "the covered loan is secured by a manufactured home but not land"})

(def ManufacturedHomeLegalClassification-realProperty
  "the covered loan is secured by a manufactured home and land"
  {:cmns-av/adaptedFrom "the 2015 Revised HMDA regulation.",
   :db/ident
   :fibo-loan-reln-mtg/ManufacturedHomeLegalClassification-realProperty,
   :rdf/type [:fibo-loan-reln-mtg/ManufacturedHomeLegalClassification
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "real property",
   :skos/definition
   "the covered loan is secured by a manufactured home and land"})

(def Mortgage
  "a loan contract that is secured by real property"
  {:cmns-av/adaptedFrom "the Cambridge Business English Dictionary",
   :db/ident :fibo-loan-reln-mtg/Mortgage,
   :owl/equivalentClass {:owl/intersectionOf
                         [:fibo-loan-ln-ln/Loan
                          {:owl/onProperty :cmns-col/comprises,
                           :owl/someValuesFrom
                           {:owl/intersectionOf
                            [:fibo-loan-ln-ln/SecurityAgreement
                             {:owl/onProperty :cmns-cxtdsg/isApplicableIn,
                              :owl/someValuesFrom
                              {:owl/intersectionOf
                               [:fibo-fbc-dae-dbt/PhysicalCollateral
                                {:owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                                 :owl/someValuesFrom
                                 :fibo-fnd-plc-loc/RealEstate,
                                 :rdf/type :owl/Restriction}],
                               :rdf/type :owl/Class},
                              :rdf/type :owl/Restriction}],
                            :rdf/type :owl/Class},
                           :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "mortgage",
   :rdfs/subClassOf
   [{:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-loan-reln-mtg/UniversalLoanIdentifier,
     :owl/onProperty :cmns-id/isIdentifiedBy,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-loan-reln-mtg/hasOriginatingServiceProvider,
     :owl/someValuesFrom {:owl/intersectionOf
                          [:fibo-fbc-pas-fpas/FinancialServiceProvider
                           {:owl/onProperty     :cmns-id/isIdentifiedBy,
                            :owl/someValuesFrom :fibo-loan-reln-mtg/NMLSR-ID,
                            :rdf/type           :owl/Restriction}],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    :fibo-loan-ln-ln/CollateralizedLoan
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-loan-reln-mtg/MortgageIndemnityGuarantor,
     :owl/onProperty :fibo-fbc-dae-gty/hasGuarantor,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-loan-reln-mtg/hasOriginatorPerson,
     :owl/someValuesFrom {:owl/intersectionOf
                          [:fibo-be-le-lp/LegallyCompetentNaturalPerson
                           {:owl/onProperty     :cmns-id/isIdentifiedBy,
                            :owl/someValuesFrom :fibo-loan-reln-mtg/NMLSR-ID,
                            :rdf/type           :owl/Restriction}],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-loan-reln-mtg/hasClosingDate,
     :owl/someValuesFrom :cmns-dt/Date,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-loan-ln-ln/Servicer,
     :owl/onProperty :fibo-loan-ln-ln/isServicedBy,
     :rdf/type       :owl/Restriction}
    :fibo-loan-ln-ln/ClosedEndCredit
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-loan-reln-mtg/Mortgage,
     :owl/onProperty :fibo-loan-reln-mtg/assumes,
     :rdf/type       :owl/Restriction}
    :fibo-loan-reln-mtg/Mortgage],
   :skos/definition "a loan contract that is secured by real property",
   :skos/editorialNote
   #voc/lstr
    "Definition probably incomplete. Mortgage is not only securitized on the real estate but is used to fund the purchase of that real estate. Not sure of the best form of wording.@en"})

(def MortgageIndemnityGuarantee
  "insurance-backed guarantee that protects lenders if the mortgage repayments cease for some reason, perhaps due to death or a homeowner being made redundant at work"
  {:db/ident :fibo-loan-reln-mtg/MortgageIndemnityGuarantee,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label #voc/lstr "mortgage indemnity guarantee@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fbc-pas-caa/isRealizedBy,
     :owl/someValuesFrom :fibo-loan-reln-mtg/MortgageIndemnityInsurancePolicy,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-dae-gty/isGuaranteedBy,
     :owl/someValuesFrom :fibo-loan-reln-mtg/MortgageIndemnityGuarantor,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-dae-gty/InsuranceBackedGuaranty
    :fibo-loan-reln-mtg/MortgageIndemnityGuarantee],
   :skos/definition
   #voc/lstr
    "insurance-backed guarantee that protects lenders if the mortgage repayments cease for some reason, perhaps due to death or a homeowner being made redundant at work@en",
   :skos/editorialNote
   #voc/lstr
    "See notes from SME Review and in MIG Provider. Applies to securitized pool, insures the lender. Additional note (IBM): there is a further application of this. When a lender takes a loan which is a where the value of the loan is greater than 80% of the value of the property, at that point it is required for the lender to also get a private mortgage insurance, so they are paying separately for the mortgage insurance so that if the borrower defaults above 80% then the mortgage insurance pays the loss. In the Loan Party Insurer (new \"Party\" type) you have Loan Party Insured Ratio (e.g. the 80% in the example above). These are different situations but the same principle. So this needs to be modeled for both. 30 June: Is this Lender or Borrower? since you have one lender and one borrower in a single loan, but multiple lenders in the case of packaging this up for a security - there are then multiple lenders and multiple borrowers. A similar kind of insurance exists in the one lender one borrower scenario i.e. the mortgage loan itself. There are two concepts here. the MIG thing was for bundling these. the MIG might apply across multiple contracts, but still be a fact about \"the\" contract? The notes about 80% above (IBM) are about the individual loan. ACTION: Tidy this up.@en"})

(def MortgageIndemnityGuarantor
  "guarantor and insurer that provides mortgage insurance in the form of a mortgage indemnity guarantee (MIG)"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "SME Review notes 16 Sept: Guaranty - mortgage insurance e.g. insure up to 80% exposure. When you get into indemnification, then for instance if the product doesn't meet the investor's requirement such that if it doesn't get paid then the lender steps in and takes the hit for the loan - this is usually a precondition for securitizing (issuing) the loan in a pool. If the loan is not going to be sold on the secondary market there would be no need to indemnify that loan so this term would not apply. Indemnification is insurance for the investor, while the lender is the one providing that indemnification.@en",
   :db/ident :fibo-loan-reln-mtg/MortgageIndemnityGuarantor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label #voc/lstr "mortgage indemnity guarantor@en",
   :rdfs/subClassOf [:fibo-fbc-dae-gty/Insurer
                     :fibo-fbc-dae-gty/Guarantor
                     :fibo-loan-reln-mtg/MortgageIndemnityGuarantor],
   :skos/definition
   #voc/lstr
    "guarantor and insurer that provides mortgage insurance in the form of a mortgage indemnity guarantee (MIG)@en"})

(def MortgageIndemnityInsurancePolicy
  "insurance policy providing the mortgage indemnity guarantee"
  {:db/ident :fibo-loan-reln-mtg/MortgageIndemnityInsurancePolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label #voc/lstr "mortgage indemnity insurance policy@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-agr-ctr/isEvidenceFor,
                      :owl/someValuesFrom
                      :fibo-loan-reln-mtg/MortgageIndemnityGuarantee,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-dae-gty/InsurancePolicy
                     :fibo-loan-reln-mtg/MortgageIndemnityInsurancePolicy],
   :skos/definition
   #voc/lstr "insurance policy providing the mortgage indemnity guarantee@en"})

(def MortgageLoanPurpose
  "the purpose for which mortgage loan proceeds will be used, such as real property purchase, dwelling construction, or loan refinancing"
  {:db/ident :fibo-loan-reln-mtg/MortgageLoanPurpose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "mortgage loan purpose",
   :rdfs/subClassOf [:cmns-cls/Classifier
                     :fibo-loan-reln-mtg/MortgageLoanPurpose],
   :skos/definition
   "the purpose for which mortgage loan proceeds will be used, such as real property purchase, dwelling construction, or loan refinancing"})

(def MortgageLoanPurpose-BusinessOrCommercial
  "business or commercial"
  {:db/ident :fibo-loan-reln-mtg/MortgageLoanPurpose-BusinessOrCommercial,
   :rdf/type [:fibo-loan-reln-mtg/MortgageLoanPurpose
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "business or commercial"})

(def MortgageLoanPurpose-DwellingConstruction
  "dwelling construction"
  {:db/ident :fibo-loan-reln-mtg/MortgageLoanPurpose-DwellingConstruction,
   :rdf/type [:fibo-loan-reln-mtg/MortgageLoanPurpose
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "dwelling construction"})

(def MortgageLoanPurpose-HomeImprovement
  "home improvement"
  {:db/ident :fibo-loan-reln-mtg/MortgageLoanPurpose-HomeImprovement,
   :rdf/type [:fibo-loan-reln-mtg/MortgageLoanPurpose
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "home improvement"})

(def MortgageLoanPurpose-LoanRefinancing
  "loan refinancing"
  {:db/ident :fibo-loan-reln-mtg/MortgageLoanPurpose-LoanRefinancing,
   :rdf/type [:fibo-loan-reln-mtg/MortgageLoanPurpose
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "loan refinancing"})

(def MortgageLoanPurpose-MortgageModification
  "mortgage modification"
  {:db/ident :fibo-loan-reln-mtg/MortgageLoanPurpose-MortgageModification,
   :rdf/type [:fibo-loan-reln-mtg/MortgageLoanPurpose
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "mortgage modification"})

(def MortgageLoanPurpose-RealPropertyPurchase
  "real property purchase"
  {:db/ident :fibo-loan-reln-mtg/MortgageLoanPurpose-RealPropertyPurchase,
   :rdf/type [:fibo-loan-reln-mtg/MortgageLoanPurpose
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "real property purchase"})

(def NMLSR-ID
  "the number permanently assigned by the Nationwide Mortgage Licensing System and Registry (NMLS) for each company, branch, and individual that maintains a single account on NMLS."
  {:cmns-av/abbreviation "NMLSR ID",
   :cmns-av/adaptedFrom
   "http://mortgage.nationwidelicensingsystem.org/about/Pages/NMLSID.aspx",
   :db/ident :fibo-loan-reln-mtg/NMLSR-ID,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "Nationwide Mortgage Licensing System and Registry Identifier",
   :rdfs/subClassOf [:fibo-fnd-law-lcap/LicenseIdentifier
                     :fibo-loan-reln-mtg/NMLSR-ID],
   :skos/definition
   "the number permanently assigned by the Nationwide Mortgage Licensing System and Registry (NMLS) for each company, branch, and individual that maintains a single account on NMLS."})

(def PropertyInspection
  "assessment activity that involves analyzing one or more aspects of a real property for independent assessment of status or deficiency"
  {:cmns-av/explanatoryNote
   "This is independent and separate from conducting an appraisal. Examples are termite inspections, construction inspections, etc.",
   :db/ident :fibo-loan-reln-mtg/PropertyInspection,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "property inspection",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-loan-reln-mtg/isInspectionOf,
                      :owl/someValuesFrom :fibo-fnd-plc-loc/RealEstate,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/isProvidedBy,
                      :owl/someValuesFrom :fibo-fnd-pty-pty/PartyInRole,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-asmt/AssessmentActivity
                     :fibo-loan-reln-mtg/PropertyInspection],
   :skos/definition
   "assessment activity that involves analyzing one or more aspects of a real property for independent assessment of status or deficiency"})

(def PropertyUsage
  "a category indicating the manner in which the borrower intends to utilize the property"
  {:db/ident :fibo-loan-reln-mtg/PropertyUsage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "property usage",
   :rdfs/subClassOf [:cmns-cls/Classifier :fibo-loan-reln-mtg/PropertyUsage],
   :skos/definition
   "a category indicating the manner in which the borrower intends to utilize the property"})

(def PropertyUsage-investment
  "a home owned for the purpose of generating income"
  {:db/ident :fibo-loan-reln-mtg/PropertyUsage-investment,
   :rdf/type [:fibo-loan-reln-mtg/PropertyUsage
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "investment",
   :skos/definition "a home owned for the purpose of generating income"})

(def PropertyUsage-primaryResidence
  "residence that the owner physically occupies and uses as his or her principal residence"
  {:db/ident :fibo-loan-reln-mtg/PropertyUsage-primaryResidence,
   :rdf/type [:fibo-loan-reln-mtg/PropertyUsage
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "primary residence",
   :skos/definition
   "residence that the owner physically occupies and uses as his or her principal residence"})

(def PropertyUsage-secondHome
  "a property occupied by the owner for a portion of the year that is not the primary residence"
  {:db/ident :fibo-loan-reln-mtg/PropertyUsage-secondHome,
   :rdf/type [:fibo-loan-reln-mtg/PropertyUsage
              :owl/Thing
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "second home",
   :skos/definition
   "a property occupied by the owner for a portion of the year that is not the primary residence"})

(def RealPropertyAppraisal
  "value assessment that estimates the amount of money a real estate property is worth"
  {:cmns-av/explanatoryNote
   "The valuation uses one or more methodologies and is conducted by an appraiser or technology with a logical model that performs the same function.",
   :db/ident :fibo-loan-reln-mtg/RealPropertyAppraisal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "real property appraisal",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-asmt/hasAppraiser,
                      :owl/someValuesFrom :fibo-fnd-arr-asmt/Appraiser,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-loan-reln-mtg/PropertyInspection,
                      :owl/onProperty :fibo-fnd-dt-oc/hasInput,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-loan-reln-mtg/hasAppraisedValue,
                      :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryAmount,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-asmt/ValueAssessment
                     :fibo-loan-reln-mtg/RealPropertyAppraisal],
   :skos/definition
   "value assessment that estimates the amount of money a real estate property is worth",
   :skos/editorialNote
   ["Future consideration: add information about variability analysis and maybe the algorithm used."
    "Ensure that the appraiser parties have NMLS Identifier and contact preferences, e.g. phone number and address. As needed, connect appraisers to an appraisal management company."]})

(def ReverseMortgage
  "mortgage contract that pays out money to the borrower against a set principal limit that is based on the value of existing equity in the underlying collateral."
  {:cmns-av/explanatoryNote
   ["The interest is added to the principal balance."
    "A reverse mortgage and an open end loan both have a credit limit."],
   :db/ident :fibo-loan-reln-mtg/ReverseMortgage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label ["reverse mortgage" #voc/lstr "reverse mortgage@en"],
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-loan-ln-ln/hasCreditLimit,
     :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryAmount,
     :rdf/type           :owl/Restriction}
    :fibo-loan-reln-mtg/Mortgage
    :fibo-loan-reln-mtg/ReverseMortgage
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-loan-ln-ln/Servicer,
     :owl/onProperty :fibo-loan-ln-ln/isServicedBy,
     :rdf/type       :owl/Restriction}
    :fibo-loan-ln-ln/ClosedEndCredit
    {:owl/onProperty     :fibo-loan-reln-mtg/hasOriginatorPerson,
     :owl/someValuesFrom {:owl/intersectionOf
                          [:fibo-be-le-lp/LegallyCompetentNaturalPerson
                           {:owl/onProperty     :cmns-id/isIdentifiedBy,
                            :owl/someValuesFrom :fibo-loan-reln-mtg/NMLSR-ID,
                            :rdf/type           :owl/Restriction}],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-loan-reln-mtg/Mortgage,
     :owl/onProperty :fibo-loan-reln-mtg/assumes,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-loan-reln-mtg/MortgageIndemnityGuarantor,
     :owl/onProperty :fibo-fbc-dae-gty/hasGuarantor,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-loan-reln-mtg/UniversalLoanIdentifier,
     :owl/onProperty :cmns-id/isIdentifiedBy,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-loan-reln-mtg/hasClosingDate,
     :owl/someValuesFrom :cmns-dt/Date,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-loan-reln-mtg/hasOriginatingServiceProvider,
     :owl/someValuesFrom {:owl/intersectionOf
                          [:fibo-fbc-pas-fpas/FinancialServiceProvider
                           {:owl/onProperty     :cmns-id/isIdentifiedBy,
                            :owl/someValuesFrom :fibo-loan-reln-mtg/NMLSR-ID,
                            :rdf/type           :owl/Restriction}],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    :fibo-loan-ln-ln/CollateralizedLoan],
   :skos/definition
   "mortgage contract that pays out money to the borrower against a set principal limit that is based on the value of existing equity in the underlying collateral."})

(def UniversalLoanIdentifier
  "a unique identifier given to unequivocally identify a specific mortgage loan."
  {:cmns-av/explanatoryNote
   "In the US, the structure of this identifier is defined in the 2015 revision to the Home Mortgage Disclosure Act.",
   :db/ident :fibo-loan-reln-mtg/UniversalLoanIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "universal loan identifier",
   :rdfs/subClassOf [{:owl/onClass    :fibo-loan-ln-ln/Loan,
                      :owl/onProperty :cmns-id/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-be-le-lei/LegalEntityIdentifier,
                      :owl/onProperty :cmns-col/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fi-fi/FinancialInstrumentIdentifier
                     :fibo-loan-reln-mtg/UniversalLoanIdentifier],
   :skos/definition
   "a unique identifier given to unequivocally identify a specific mortgage loan."})

(def assumes
  "relates a new mortgage loan contract to a previous one made to a different borrower for the same property. The new contract is created via a legally binding process where the new borrower assumes the terms of the previous loan contract"
  {:db/ident :fibo-loan-reln-mtg/assumes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "assumes",
   :skos/definition
   "relates a new mortgage loan contract to a previous one made to a different borrower for the same property. The new contract is created via a legally binding process where the new borrower assumes the terms of the previous loan contract"})

(def hasAppraisedValue
  "relates to a monetary amount that is the product of a valuation event"
  {:db/ident :fibo-loan-reln-mtg/hasAppraisedValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "has appraised value",
   :rdfs/subPropertyOf [:fibo-fnd-acc-cur/hasMonetaryAmount
                        :fibo-loan-reln-mtg/hasAppraisedValue],
   :skos/definition
   "relates to a monetary amount that is the product of a valuation event"})

(def hasClosingDate
  "relates, e.g. a loan contract to the date on which the contract is consummated, officially creating the obligations therein"
  {:db/ident :fibo-loan-reln-mtg/hasClosingDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "has closing date",
   :rdfs/subPropertyOf [:fibo-fnd-agr-ctr/hasEffectiveDate
                        :fibo-loan-reln-mtg/hasClosingDate],
   :skos/definition
   "relates, e.g. a loan contract to the date on which the contract is consummated, officially creating the obligations therein"})

(def hasNumberOfAffordableDwellingUnits
  "relates real estate to the number of dwelling units it contains that are income-restricted under Federal, State, or local affordable housing programs."
  {:cmns-av/adaptedFrom "the 2015 Revised HMDA regulation.",
   :db/ident :fibo-loan-reln-mtg/hasNumberOfAffordableDwellingUnits,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "has number of affordable dwelling units",
   :rdfs/subPropertyOf [:fibo-loan-reln-mtg/hasNumberOfDwellingUnits
                        :fibo-loan-reln-mtg/hasNumberOfAffordableDwellingUnits
                        :fibo-fnd-dt-fd/hasCount],
   :skos/definition
   "relates real estate to the number of dwelling units it contains that are income-restricted under Federal, State, or local affordable housing programs."})

(def hasNumberOfDwellingUnits
  "relates real estate to the number of dwelling units it contains"
  {:cmns-av/adaptedFrom "the 2015 Revised HMDA regulation.",
   :db/ident :fibo-loan-reln-mtg/hasNumberOfDwellingUnits,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "has number of dwelling units",
   :rdfs/subPropertyOf [:fibo-fnd-dt-fd/hasCount
                        :fibo-loan-reln-mtg/hasNumberOfDwellingUnits],
   :skos/definition
   "relates real estate to the number of dwelling units it contains"})

(def hasOriginatingServiceProvider
  "relates something, typically a loan contract, to the service provider responsible for originated the loan"
  {:cmns-av/explanatoryNote
   "Typically this will be a bank, mortgage broker, investment bank, or other similar party.",
   :db/ident :fibo-loan-reln-mtg/hasOriginatingServiceProvider,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "has originating service provider",
   :rdfs/range {:owl/intersectionOf [:fibo-fbc-pas-fpas/FinancialServiceProvider
                                     {:owl/unionOf
                                      [:fibo-fnd-agr-ctr/ContractParty
                                       :fibo-fnd-agr-ctr/ContractThirdParty],
                                      :rdf/type :owl/Class}],
                :rdf/type :owl/Class},
   :rdfs/subPropertyOf [:fibo-fnd-pty-pty/hasPartyInRole
                        :fibo-loan-reln-mtg/hasOriginatingServiceProvider],
   :skos/definition
   "relates something, typically a loan contract, to the service provider responsible for originated the loan"})

(def hasOriginatorPerson
  "relates something, typically a loan, to a person that initially originates or creates it"
  {:db/ident :fibo-loan-reln-mtg/hasOriginatorPerson,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "has originator person",
   :rdfs/range :fibo-be-le-lp/LegallyCompetentNaturalPerson,
   :rdfs/subPropertyOf [:fibo-fnd-pty-pty/hasParty
                        :fibo-loan-reln-mtg/hasOriginatorPerson],
   :skos/definition
   "relates something, typically a loan, to a person that initially originates or creates it"})

(def isARMConvertible
  "indicates whether or not the mortgage can be converted into an adjustable-rate mortgage (ARM)"
  {:db/ident :fibo-loan-reln-mtg/isARMConvertible,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-loan-ln-ln/Loan,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label #voc/lstr "is ARM convertible@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #voc/lstr
    "indicates whether or not the mortgage can be converted into an adjustable-rate mortgage (ARM)@en"})

(def isInspectionOf
  "relates an inspection to the thing being inspected"
  {:db/ident :fibo-loan-reln-mtg/isInspectionOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "is inspection of",
   :skos/definition "relates an inspection to the thing being inspected"})

(def isLienOn
  "is lien on"
  {:db/ident :fibo-loan-reln-mtg/isLienOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfs/label "is lien on"})