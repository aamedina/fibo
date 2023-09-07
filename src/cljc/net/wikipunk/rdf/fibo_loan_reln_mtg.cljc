(ns net.wikipunk.rdf.fibo-loan-reln-mtg
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
    :namespaces
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
    :prefix "fibo-loan-reln-mtg",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"}
  {:cmns-av/copyright #{"Copyright (c) 2016-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcterms/abstract
   "Loans that have collateral posted as security and where that collateral is real estate, and the real estate which makes up the collateral is purchased with the funds loaned. This ontology covers a range of mortgage concepts and parties, along with catewgories of mortgage loan purpose (remortgage, second home etc.).",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/AgentsAndPeople/Agents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/LegalCapacity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansGeneral/LoanApplications/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/ClientsAndAccounts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansGeneral/Loans/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Guaranty/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Assessments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mortgage Loans Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"})

(def AmortizationType
  {:db/ident :fibo-loan-reln-mtg/AmortizationType,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "amortization type",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition "classifier of amortization algorithms"})

(def AmortizationType-adjustableRate
  {:cmns-av/adaptedFrom {:rdf/value "the 2015 Revised HMDA regulation."},
   :db/ident :fibo-loan-reln-mtg/AmortizationType-adjustableRate,
   :rdf/type #{:owl/NamedIndividual :fibo-loan-reln-mtg/AmortizationType},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "adjustable rate",
   :skos/definition
   "a loan that allows the lender to periodically adjust the interest rate in accordance with a specified index"})

(def AmortizationType-fixedRate
  {:cmns-av/adaptedFrom {:rdf/value "the 2015 Revised HMDA regulation."},
   :db/ident :fibo-loan-reln-mtg/AmortizationType-fixedRate,
   :rdf/type #{:owl/NamedIndividual :fibo-loan-reln-mtg/AmortizationType},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "fixed rate",
   :skos/definition
   "a loan in which the interest rate and payments remain the same for the life of the loan"})

(def AmortizationType-graduatedPayment
  {:cmns-av/adaptedFrom {:rdf/value "the 2015 Revised HMDA regulation."},
   :cmns-av/explanatoryNote "Usually involves negative amortization.",
   :db/ident :fibo-loan-reln-mtg/AmortizationType-graduatedPayment,
   :rdf/type #{:owl/NamedIndividual :fibo-loan-reln-mtg/AmortizationType},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "graduated payment",
   :skos/definition
   "a flexible payment loan where the payments increase for a specified period of time and then level off"})

(def AmortizationType-graduatedPaymentAdjustable
  {:cmns-av/adaptedFrom {:rdf/value "the 2015 Revised HMDA regulation."},
   :db/ident :fibo-loan-reln-mtg/AmortizationType-graduatedPaymentAdjustable,
   :rdf/type #{:owl/NamedIndividual :fibo-loan-reln-mtg/AmortizationType},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "graduated payment adjustable",
   :skos/definition
   "a loan for which there are periodic payments/rate changes with additional specified principal and interest changes as documented in the Security Instruments."})

(def AmortizationType-growingEquity
  {:cmns-av/adaptedFrom {:rdf/value "the 2015 Revised HMDA regulation."},
   :cmns-av/explanatoryNote
   "Due to increased payment, the borrower acquires equity more rapidly and retires the debt earlier.",
   :db/ident :fibo-loan-reln-mtg/AmortizationType-growingEquity,
   :rdf/type #{:owl/NamedIndividual :fibo-loan-reln-mtg/AmortizationType},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "growing equity",
   :skos/definition
   "A graduated payment loan in which increases in a borrowers loan payments are used to accelerate reduction of principal on the mortgage"})

(def AmortizationType-rateImprovement
  {:cmns-av/adaptedFrom {:rdf/value "the 2015 Revised HMDA regulation."},
   :db/ident :fibo-loan-reln-mtg/AmortizationType-rateImprovement,
   :rdf/type #{:owl/NamedIndividual :fibo-loan-reln-mtg/AmortizationType},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "rate improvement",
   :skos/definition
   "a type of flexible loan where the interest rate may decrease based on payment history."})

(def AmortizationType-step
  {:cmns-av/adaptedFrom {:rdf/value "the 2015 Revised HMDA regulation."},
   :db/ident :fibo-loan-reln-mtg/AmortizationType-step,
   :rdf/type #{:owl/NamedIndividual :fibo-loan-reln-mtg/AmortizationType},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "step",
   :skos/definition
   "a loan with fixed periodic payment/rate changes without subsidy or negative amortization."})

(def AutomatedUnderwritingSystem
  {:cmns-av/explanatoryNote
   "In the United States, automated underwriting systems review the applicant's credit history and ability to repay the loan, and determine whether the price the applicant is offering to pay is supported by the property value.",
   :db/ident :fibo-loan-reln-mtg/AutomatedUnderwritingSystem,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "automated underwriting system",
   :rdfs/subClassOf :fibo-fnd-aap-agt/AutomatedSystem,
   :skos/definition
   "software system that collects the information necessary to approve a loan application and supports a mortgage lender's analysis of a new loan application"})

(def AutomatedUnderwritingSystem-DesktopUnderwriter
  {:db/ident :fibo-loan-reln-mtg/AutomatedUnderwritingSystem-DesktopUnderwriter,
   :rdf/type #{:fibo-loan-reln-mtg/AutomatedUnderwritingSystem
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "Desktop Underwriter",
   :skos/definition
   "an automated underwriting software system produced by Fannie Mae"})

(def AutomatedUnderwritingSystem-FHAScorecard
  {:db/ident :fibo-loan-reln-mtg/AutomatedUnderwritingSystem-FHAScorecard,
   :rdf/type #{:fibo-loan-reln-mtg/AutomatedUnderwritingSystem
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "FHA Scorecard",
   :skos/definition
   "an automated underwriting software system produced by Federal Housing Administration (FHA)"})

(def AutomatedUnderwritingSystem-GuaranteedUnderwritingSystem
  {:cmns-av/synonym "GUS",
   :db/ident
   :fibo-loan-reln-mtg/AutomatedUnderwritingSystem-GuaranteedUnderwritingSystem,
   :rdf/type #{:fibo-loan-reln-mtg/AutomatedUnderwritingSystem
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "Guaranteed Underwriting System",
   :skos/definition
   "an automated underwriting software system used by the USDA rural development loan program"})

(def AutomatedUnderwritingSystem-LoanProspector
  {:db/ident :fibo-loan-reln-mtg/AutomatedUnderwritingSystem-LoanProspector,
   :rdf/type #{:fibo-loan-reln-mtg/AutomatedUnderwritingSystem
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "Loan Prospector",
   :skos/definition
   "an automated underwriting software system produced by Freddie Mac"})

(def CashOutStatus
  {:cmns-av/explanatoryNote
   "This is subject to lender and/or investor policy(s).",
   :db/ident :fibo-loan-reln-mtg/CashOutStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "cash-out status",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition
   "classifier indicating the extent to which funds are released to the borrower on a new loan origination that refinances an existing loan"})

(def CashOutStatus-CashOut
  {:db/ident :fibo-loan-reln-mtg/CashOutStatus-CashOut,
   :rdf/type #{:owl/Thing :fibo-loan-reln-mtg/CashOutStatus
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "cashout",
   :skos/definition
   "the mortgage is refinanced for more than is owed and the borrower pockets the difference."})

(def CashOutStatus-LimitedCashOut
  {:db/ident :fibo-loan-reln-mtg/CashOutStatus-LimitedCashOut,
   :rdf/type #{:owl/Thing :fibo-loan-reln-mtg/CashOutStatus
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "limited cashout",
   :skos/definition
   "a cashout mortgage where the amount is limited by the lenger. 80% loan to value ratio is a common limit."})

(def CashOutStatus-NoCashOut
  {:db/ident :fibo-loan-reln-mtg/CashOutStatus-NoCashOut,
   :rdf/type #{:owl/Thing :fibo-loan-reln-mtg/CashOutStatus
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "no cashout",
   :skos/definition
   "The mortgage is refinanced for less than or equal to what is owed."})

(def ChargeCategory
  {:cmns-av/usageNote
   "Use with LineItem, (has ChargeCategory instance), (hasNumericalValue for number of units) and (hasCost for the amount of money)",
   :db/ident :fibo-loan-reln-mtg/ChargeCategory,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "charge category",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition
   #{"classifier indicating what a particular fee or other expense is for"
     "Examples include closing costs, interest, taxes, and other service-related fees."}})

(def ChargeCategory-appraisalFee
  {:db/ident :fibo-loan-reln-mtg/ChargeCategory-appraisalFee,
   :rdf/type #{:fibo-loan-reln-mtg/ChargeCategory :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "appraisal fee",
   :skos/definition "a charge for an appraisal"})

(def ChargeCategory-discountPoints
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.consumerfinance.gov/askcfpb/136/what-are-discount-points-and-lender-credits-and-how-do-they-work.html"},
   :db/ident :fibo-loan-reln-mtg/ChargeCategory-discountPoints,
   :rdf/type #{:fibo-loan-reln-mtg/ChargeCategory :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "discount points",
   :skos/definition "a charge for lowering your interest rate"})

(def ChargeCategory-lenderCredits
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.consumerfinance.gov/askcfpb/136/what-are-discount-points-and-lender-credits-and-how-do-they-work.html"},
   :cmns-av/usageNote "This needs to be treated as a negative charge.",
   :db/ident :fibo-loan-reln-mtg/ChargeCategory-lenderCredits,
   :rdf/type #{:fibo-loan-reln-mtg/ChargeCategory :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "lender credits",
   :skos/definition
   "a credit whereby the lender reduces closing costs in exchange for a higher interest rate."})

(def ChargeCategory-originationFee
  {:db/ident :fibo-loan-reln-mtg/ChargeCategory-originationFee,
   :rdf/type #{:fibo-loan-reln-mtg/ChargeCategory :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "origination fee",
   :skos/definition "a charge for an origination"})

(def ChargeCategory-principal
  {:db/ident :fibo-loan-reln-mtg/ChargeCategory-principal,
   :rdf/type #{:fibo-loan-reln-mtg/ChargeCategory :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "principal",
   :skos/definition "the principal of the loan that is owed"})

(def DwellingCapacity
  {:db/ident :fibo-loan-reln-mtg/DwellingCapacity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "dwelling capacity",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition
   "classifier indicating how many dwellings some property has"})

(def DwellingCapacity-multiFamily
  {:db/ident :fibo-loan-reln-mtg/DwellingCapacity-multiFamily,
   :rdf/type #{:fibo-loan-reln-mtg/DwellingCapacity :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "multi-family",
   :skos/definition "5 or more units"})

(def DwellingCapacity-singleFamily
  {:db/ident :fibo-loan-reln-mtg/DwellingCapacity-singleFamily,
   :rdf/type #{:owl/Thing :fibo-loan-reln-mtg/DwellingCapacity
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "single family",
   :skos/definition "1-4 units"})

(def GovernmentSponsoredLoan
  {:db/ident :fibo-loan-reln-mtg/GovernmentSponsoredLoan,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "government-sponsored loan"},
   :rdfs/subClassOf :fibo-loan-reln-mtg/Mortgage})

(def ManufacturedHomeLegalClassification
  {:cmns-av/adaptedFrom {:rdf/value "2015 Revised HMDA regulation"},
   :db/ident :fibo-loan-reln-mtg/ManufacturedHomeLegalClassification,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "manufactured home legal classification",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition
   "category indicating whether the covered loan is secured by a manufactured home only or with land as well"})

(def ManufacturedHomeLegalClassification-personalProperty
  {:cmns-av/adaptedFrom {:rdf/value "the 2015 Revised HMDA regulation."},
   :db/ident
   :fibo-loan-reln-mtg/ManufacturedHomeLegalClassification-personalProperty,
   :rdf/type #{:fibo-loan-reln-mtg/ManufacturedHomeLegalClassification
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "personal property",
   :skos/definition
   "the covered loan is secured by a manufactured home but not land"})

(def ManufacturedHomeLegalClassification-realProperty
  {:cmns-av/adaptedFrom {:rdf/value "the 2015 Revised HMDA regulation."},
   :db/ident
   :fibo-loan-reln-mtg/ManufacturedHomeLegalClassification-realProperty,
   :rdf/type #{:fibo-loan-reln-mtg/ManufacturedHomeLegalClassification
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "real property",
   :skos/definition
   "the covered loan is secured by a manufactured home and land"})

(def Mortgage
  {:cmns-av/adaptedFrom {:rdf/value
                         "the Cambridge Business English Dictionary"},
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
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "mortgage",
   :rdfs/subClassOf
   #{{:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-loan-reln-mtg/UniversalLoanIdentifier,
      :owl/onProperty :cmns-id/isIdentifiedBy,
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
      :rdf/type       :owl/Restriction} :fibo-loan-ln-ln/CollateralizedLoan
     {:owl/onProperty     :fibo-loan-reln-mtg/hasOriginatingServiceProvider,
      :owl/someValuesFrom {:owl/intersectionOf
                           [:fibo-fbc-pas-fpas/FinancialServiceProvider
                            {:owl/onProperty     :cmns-id/isIdentifiedBy,
                             :owl/someValuesFrom :fibo-loan-reln-mtg/NMLSR-ID,
                             :rdf/type           :owl/Restriction}],
                           :rdf/type :owl/Class},
      :rdf/type           :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-loan-reln-mtg/MortgageIndemnityGuarantor,
      :owl/onProperty :fibo-fbc-dae-gty/hasGuarantor,
      :rdf/type       :owl/Restriction} :fibo-loan-ln-ln/ClosedEndCredit
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-loan-reln-mtg/Mortgage,
      :owl/onProperty :fibo-loan-reln-mtg/assumes,
      :rdf/type       :owl/Restriction}},
   :skos/definition "a loan contract that is secured by real property",
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Definition probably incomplete. Mortgage is not only securitized on the real estate but is used to fund the purchase of that real estate. Not sure of the best form of wording."}})

(def MortgageIndemnityGuarantee
  {:db/ident :fibo-loan-reln-mtg/MortgageIndemnityGuarantee,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mortgage indemnity guarantee"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fbc-dae-gty/isGuaranteedBy,
      :owl/someValuesFrom :fibo-loan-reln-mtg/MortgageIndemnityGuarantor,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fbc-pas-caa/isRealizedBy,
      :owl/someValuesFrom :fibo-loan-reln-mtg/MortgageIndemnityInsurancePolicy,
      :rdf/type           :owl/Restriction}
     :fibo-fbc-dae-gty/InsuranceBackedGuaranty},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "insurance-backed guarantee that protects lenders if the mortgage repayments cease for some reason, perhaps due to death or a homeowner being made redundant at work"},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "See notes from SME Review and in MIG Provider. Applies to securitized pool, insures the lender. Additional note (IBM): there is a further application of this. When a lender takes a loan which is a where the value of the loan is greater than 80% of the value of the property, at that point it is required for the lender to also get a private mortgage insurance, so they are paying separately for the mortgage insurance so that if the borrower defaults above 80% then the mortgage insurance pays the loss. In the Loan Party Insurer (new \"Party\" type) you have Loan Party Insured Ratio (e.g. the 80% in the example above). These are different situations but the same principle. So this needs to be modeled for both. 30 June: Is this Lender or Borrower? since you have one lender and one borrower in a single loan, but multiple lenders in the case of packaging this up for a security - there are then multiple lenders and multiple borrowers. A similar kind of insurance exists in the one lender one borrower scenario i.e. the mortgage loan itself. There are two concepts here. the MIG thing was for bundling these. the MIG might apply across multiple contracts, but still be a fact about \"the\" contract? The notes about 80% above (IBM) are about the individual loan. ACTION: Tidy this up."}})

(def MortgageIndemnityGuarantor
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "SME Review notes 16 Sept: Guaranty - mortgage insurance e.g. insure up to 80% exposure. When you get into indemnification, then for instance if the product doesn't meet the investor's requirement such that if it doesn't get paid then the lender steps in and takes the hit for the loan - this is usually a precondition for securitizing (issuing) the loan in a pool. If the loan is not going to be sold on the secondary market there would be no need to indemnify that loan so this term would not apply. Indemnification is insurance for the investor, while the lender is the one providing that indemnification."},
   :db/ident :fibo-loan-reln-mtg/MortgageIndemnityGuarantor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mortgage indemnity guarantor"},
   :rdfs/subClassOf #{:fibo-fbc-dae-gty/Guarantor :fibo-fbc-dae-gty/Insurer},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "guarantor and insurer that provides mortgage insurance in the form of a mortgage indemnity guarantee (MIG)"}})

(def MortgageIndemnityInsurancePolicy
  {:db/ident :fibo-loan-reln-mtg/MortgageIndemnityInsurancePolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mortgage indemnity insurance policy"},
   :rdfs/subClassOf #{:fibo-fbc-dae-gty/InsurancePolicy
                      {:owl/onProperty :fibo-fnd-agr-ctr/isEvidenceFor,
                       :owl/someValuesFrom
                       :fibo-loan-reln-mtg/MortgageIndemnityGuarantee,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "insurance policy providing the mortgage indemnity guarantee"}})

(def MortgageLoanPurpose
  {:db/ident :fibo-loan-reln-mtg/MortgageLoanPurpose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "mortgage loan purpose",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition
   "the purpose for which mortgage loan proceeds will be used, such as real property purchase, dwelling construction, or loan refinancing"})

(def MortgageLoanPurpose-BusinessOrCommercial
  {:db/ident :fibo-loan-reln-mtg/MortgageLoanPurpose-BusinessOrCommercial,
   :rdf/type #{:fibo-loan-reln-mtg/MortgageLoanPurpose :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "business or commercial"})

(def MortgageLoanPurpose-DwellingConstruction
  {:db/ident :fibo-loan-reln-mtg/MortgageLoanPurpose-DwellingConstruction,
   :rdf/type #{:fibo-loan-reln-mtg/MortgageLoanPurpose :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "dwelling construction"})

(def MortgageLoanPurpose-HomeImprovement
  {:db/ident :fibo-loan-reln-mtg/MortgageLoanPurpose-HomeImprovement,
   :rdf/type #{:fibo-loan-reln-mtg/MortgageLoanPurpose :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "home improvement"})

(def MortgageLoanPurpose-LoanRefinancing
  {:db/ident :fibo-loan-reln-mtg/MortgageLoanPurpose-LoanRefinancing,
   :rdf/type #{:fibo-loan-reln-mtg/MortgageLoanPurpose :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "loan refinancing"})

(def MortgageLoanPurpose-MortgageModification
  {:db/ident :fibo-loan-reln-mtg/MortgageLoanPurpose-MortgageModification,
   :rdf/type #{:fibo-loan-reln-mtg/MortgageLoanPurpose :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "mortgage modification"})

(def MortgageLoanPurpose-RealPropertyPurchase
  {:db/ident :fibo-loan-reln-mtg/MortgageLoanPurpose-RealPropertyPurchase,
   :rdf/type #{:fibo-loan-reln-mtg/MortgageLoanPurpose :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "real property purchase"})

(def NMLSR-ID
  {:cmns-av/abbreviation "NMLSR ID",
   :cmns-av/adaptedFrom
   {:xsd/anyURI
    "http://mortgage.nationwidelicensingsystem.org/about/Pages/NMLSID.aspx"},
   :db/ident :fibo-loan-reln-mtg/NMLSR-ID,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "Nationwide Mortgage Licensing System and Registry Identifier",
   :rdfs/subClassOf :fibo-fnd-law-lcap/LicenseIdentifier,
   :skos/definition
   "the number permanently assigned by the Nationwide Mortgage Licensing System and Registry (NMLS) for each company, branch, and individual that maintains a single account on NMLS."})

(def PropertyInspection
  {:cmns-av/explanatoryNote
   "This is independent and separate from conducting an appraisal. Examples are termite inspections, construction inspections, etc.",
   :db/ident :fibo-loan-reln-mtg/PropertyInspection,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "property inspection",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-loan-reln-mtg/isInspectionOf,
                       :owl/someValuesFrom :fibo-fnd-plc-loc/RealEstate,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-arr-asmt/AssessmentActivity
                      {:owl/onProperty     :fibo-fnd-rel-rel/isProvidedBy,
                       :owl/someValuesFrom :fibo-fnd-pty-pty/PartyInRole,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "assessment activity that involves analyzing one or more aspects of a real property for independent assessment of status or deficiency"})

(def PropertyUsage
  {:db/ident :fibo-loan-reln-mtg/PropertyUsage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "property usage",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition
   "a category indicating the manner in which the borrower intends to utilize the property"})

(def PropertyUsage-investment
  {:db/ident :fibo-loan-reln-mtg/PropertyUsage-investment,
   :rdf/type #{:owl/NamedIndividual :fibo-loan-reln-mtg/PropertyUsage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "investment",
   :skos/definition "a home owned for the purpose of generating income"})

(def PropertyUsage-primaryResidence
  {:db/ident :fibo-loan-reln-mtg/PropertyUsage-primaryResidence,
   :rdf/type #{:owl/NamedIndividual :fibo-loan-reln-mtg/PropertyUsage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "primary residence",
   :skos/definition
   "residence that the owner physically occupies and uses as his or her principal residence"})

(def PropertyUsage-secondHome
  {:db/ident :fibo-loan-reln-mtg/PropertyUsage-secondHome,
   :rdf/type #{:owl/Thing :owl/NamedIndividual
               :fibo-loan-reln-mtg/PropertyUsage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "second home",
   :skos/definition
   "a property occupied by the owner for a portion of the year that is not the primary residence"})

(def RealPropertyAppraisal
  {:cmns-av/explanatoryNote
   "The valuation uses one or more methodologies and is conducted by an appraiser or technology with a logical model that performs the same function.",
   :db/ident :fibo-loan-reln-mtg/RealPropertyAppraisal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "real property appraisal",
   :rdfs/subClassOf #{:fibo-fnd-arr-asmt/ValueAssessment
                      {:owl/onProperty     :fibo-fnd-arr-asmt/hasAppraiser,
                       :owl/someValuesFrom :fibo-fnd-arr-asmt/Appraiser,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty :fibo-loan-reln-mtg/hasAppraisedValue,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryAmount,
                       :rdf/type :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-loan-reln-mtg/PropertyInspection,
                       :owl/onProperty :fibo-fnd-dt-oc/hasInput,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "value assessment that estimates the amount of money a real estate property is worth",
   :skos/editorialNote
   #{"Ensure that the appraiser parties have NMLS Identifier and contact preferences, e.g. phone number and address. As needed, connect appraisers to an appraisal management company."
     "Future consideration: add information about variability analysis and maybe the algorithm used."}})

(def ReverseMortgage
  {:cmns-av/explanatoryNote
   #{"A reverse mortgage and an open end loan both have a credit limit."
     "The interest is added to the principal balance."},
   :db/ident :fibo-loan-reln-mtg/ReverseMortgage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label #{"reverse mortgage"
                 {:rdf/language "en",
                  :rdf/value    "reverse mortgage"}},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-loan-ln-ln/hasCreditLimit,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryAmount,
                       :rdf/type           :owl/Restriction}
                      :fibo-loan-reln-mtg/Mortgage},
   :skos/definition
   "mortgage contract that pays out money to the borrower against a set principal limit that is based on the value of existing equity in the underlying collateral."})

(def UniversalLoanIdentifier
  {:cmns-av/explanatoryNote
   "In the US, the structure of this identifier is defined in the 2015 revision to the Home Mortgage Disclosure Act.",
   :db/ident :fibo-loan-reln-mtg/UniversalLoanIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "universal loan identifier",
   :rdfs/subClassOf #{:fibo-fbc-fi-fi/FinancialInstrumentIdentifier
                      {:owl/onClass    :fibo-loan-ln-ln/Loan,
                       :owl/onProperty :cmns-id/identifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onClass    :fibo-be-le-lei/LegalEntityIdentifier,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "a unique identifier given to unequivocally identify a specific mortgage loan."})

(def assumes
  {:db/ident :fibo-loan-reln-mtg/assumes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "assumes",
   :skos/definition
   "relates a new mortgage loan contract to a previous one made to a different borrower for the same property. The new contract is created via a legally binding process where the new borrower assumes the terms of the previous loan contract"})

(def hasAppraisedValue
  {:db/ident :fibo-loan-reln-mtg/hasAppraisedValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "has appraised value",
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   "relates to a monetary amount that is the product of a valuation event"})

(def hasClosingDate
  {:db/ident :fibo-loan-reln-mtg/hasClosingDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "has closing date",
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasEffectiveDate,
   :skos/definition
   "relates, e.g. a loan contract to the date on which the contract is consummated, officially creating the obligations therein"})

(def hasNumberOfAffordableDwellingUnits
  {:cmns-av/adaptedFrom {:rdf/value "the 2015 Revised HMDA regulation."},
   :db/ident :fibo-loan-reln-mtg/hasNumberOfAffordableDwellingUnits,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "has number of affordable dwelling units",
   :rdfs/subPropertyOf :fibo-loan-reln-mtg/hasNumberOfDwellingUnits,
   :skos/definition
   "relates real estate to the number of dwelling units it contains that are income-restricted under Federal, State, or local affordable housing programs."})

(def hasNumberOfDwellingUnits
  {:cmns-av/adaptedFrom {:rdf/value "the 2015 Revised HMDA regulation."},
   :db/ident :fibo-loan-reln-mtg/hasNumberOfDwellingUnits,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "has number of dwelling units",
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasCount,
   :skos/definition
   "relates real estate to the number of dwelling units it contains"})

(def hasOriginatingServiceProvider
  {:cmns-av/explanatoryNote
   "Typically this will be a bank, mortgage broker, investment bank, or other similar party.",
   :db/ident :fibo-loan-reln-mtg/hasOriginatingServiceProvider,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "has originating service provider",
   :rdfs/range {:owl/intersectionOf [:fibo-fbc-pas-fpas/FinancialServiceProvider
                                     {:owl/unionOf
                                      [:fibo-fnd-agr-ctr/ContractParty
                                       :fibo-fnd-agr-ctr/ContractThirdParty],
                                      :rdf/type :owl/Class}],
                :rdf/type :owl/Class},
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/hasPartyInRole,
   :skos/definition
   "relates something, typically a loan contract, to the service provider responsible for originated the loan"})

(def hasOriginatorPerson
  {:db/ident :fibo-loan-reln-mtg/hasOriginatorPerson,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "has originator person",
   :rdfs/range :fibo-be-le-lp/LegallyCompetentNaturalPerson,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/hasParty,
   :skos/definition
   "relates something, typically a loan, to a person that initially originates or creates it"})

(def isARMConvertible
  {:db/ident :fibo-loan-reln-mtg/isARMConvertible,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-loan-ln-ln/Loan,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is ARM convertible"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates whether or not the mortgage can be converted into an adjustable-rate mortgage (ARM)"}})

(def isInspectionOf
  {:db/ident :fibo-loan-reln-mtg/isInspectionOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "is inspection of",
   :skos/definition "relates an inspection to the thing being inspected"})

(def isLienOn
  {:db/ident :fibo-loan-reln-mtg/isLienOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdfs/label "is lien on"})

(def urn:uuid:b8fff7db-66a0-57f4-913f-52f1e3c737ba
  {:cmns-av/copyright #{"Copyright (c) 2016-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcterms/abstract
   "Loans that have collateral posted as security and where that collateral is real estate, and the real estate which makes up the collateral is purchased with the funds loaned. This ontology covers a range of mortgage concepts and parties, along with catewgories of mortgage loan purpose (remortgage, second home etc.).",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/AgentsAndPeople/Agents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/LegalCapacity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansGeneral/LoanApplications/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/ClientsAndAccounts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansGeneral/Loans/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Guaranty/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Assessments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/RealEstateLoans/MortgageLoans/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mortgage Loans Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"})