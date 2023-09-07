(ns net.wikipunk.rdf.fibo-loan-ln-app
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
     "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
     "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
     "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-fbc-dae-crt"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
     "fibo-fbc-dae-dbt"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
     "fibo-fbc-pas-caa"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
     "fibo-fnd-acc-aeq"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/",
     "fibo-fnd-acc-cur"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
     "fibo-fnd-agr-ctr"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
     "fibo-fnd-arr-asmt"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
     "fibo-fnd-arr-doc"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
     "fibo-fnd-arr-lif"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
     "fibo-fnd-arr-rep"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
     "fibo-fnd-dt-fd"
     "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
     "fibo-fnd-dt-oc"
     "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/",
     "fibo-fnd-pty-pty"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
     "fibo-fnd-rel-rel"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "fibo-loan-ln-app"
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/",
     "fibo-loan-ln-ln"
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "skos" "http://www.w3.org/2004/02/skos/core#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-loan-ln-app",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"}
  {:cmns-av/copyright #{"Copyright (c) 2016-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines concepts for the loan application process, along with kinds of loan application and the parties thereto. Another major thread of this ontology is credit risk assessment at the highest level, which includes security agreements, pre-approvals, and credit reports.",
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
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/CreditRatings/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/ClientsAndAccounts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Lifecycles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Reporting/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/AccountingEquity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Assessments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansGeneral/LoanApplications/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Loan Applications Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"})

(def AllBorrowersMonthlyIncome
  {:cmns-av/usageNote
   "This should be computed from the income of the individual borrowers.",
   :db/ident :fibo-loan-ln-app/AllBorrowersMonthlyIncome,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "all borrowers' monthly income",
   :rdfs/subClassOf #{:fibo-fnd-acc-cur/MonetaryAmount :fibo-fnd-acc-aeq/Income
                      {:owl/onProperty :fibo-fbc-dae-dbt/isBasedOn,
                       :owl/someValuesFrom
                       :fibo-loan-ln-app/BorrowerMonthlyIncome,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "total monthly qualifying income for all borrowers on the loan"})

(def AutomaticUnderwriting
  {:db/ident :fibo-loan-ln-app/AutomaticUnderwriting,
   :rdf/type #{:fibo-loan-ln-app/UnderwritingAutomation :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "automatic underwriting",
   :skos/definition
   "underwriting was performed using an automated underwriting system"})

(def BorrowerAssessment
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Includes credit rating information. Ongoing assessment reports both good and bad credit rating information. In the US, by regulation, lender is required to respot person's payment history on a monthly basis. This is the basis on which peope's score is changed. So the lender's reporting to the credit bureau may affect that person's credit rating. this may give rise to credit disputes. Also there is a scenario where the borrower may contact the lender and ask for some change. For student loans, they can apply for a deferment payment based on change in circumstances e.g. if losing job, or becoming disabled, then there are specific programs which they can apply for. can defer paymen for a time, and if proven eligible (e.g. also if in military, being deployed), then if they subbut the relevant document, they approve and change their repayment term, perhaps temporarily and then revert to the previously agreed terms. This results from the borrower contacting the lender."},
   :db/ident :fibo-loan-ln-app/BorrowerAssessment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "borrower assessment"},
   :rdfs/subClassOf #{:fibo-fnd-arr-asmt/AssessmentReport
                      {:owl/onProperty :fibo-fnd-arr-asmt/hasDateOfAssessment,
                       :owl/someValuesFrom :cmns-dt/ExplicitDate,
                       :rdf/type :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-loan-ln-ln/PaymentHistory,
                       :owl/onProperty :cmns-col/comprises,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass :fibo-loan-ln-app/IncomeVerificationReport,
                       :owl/onProperty :cmns-col/comprises,
                       :rdf/type :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass
                       :fibo-loan-ln-app/IndividualPersonCreditRating,
                       :owl/onProperty :cmns-col/comprises,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-arr-doc/isAbout,
                       :owl/someValuesFrom :fibo-fbc-dae-dbt/Borrower,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-arr-doc/isAbout,
                       :owl/someValuesFrom :fibo-loan-ln-app/LoanApplication,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "assessment report detailing information about the borrower and their credit history that may be relevant to the loan application"}})

(def BorrowerMonthlyIncome
  {:db/ident :fibo-loan-ln-app/BorrowerMonthlyIncome,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "borrower monthly income",
   :rdfs/subClassOf #{:fibo-fnd-acc-cur/MonetaryAmount :fibo-fnd-acc-aeq/Income
                      {:owl/onProperty     :fibo-fnd-pty-pty/hasPartyInRole,
                       :owl/someValuesFrom :fibo-fbc-dae-dbt/Borrower,
                       :rdf/type           :owl/Restriction}},
   :skos/definition "total monthly qualifying income of a potential borrower"})

(def CreditRiskAssessment
  {:cmns-av/usageNote
   "If the risk assessment is based on one of the automated underwriting sytems, then the underwriting automation category is 'automated'. This dependency could be automated (as it were).",
   :db/ident :fibo-loan-ln-app/CreditRiskAssessment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "credit risk assessment",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-cxtdsg/appliesTo,
      :owl/someValuesFrom :fibo-loan-ln-ln/Loan,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-loan-ln-app/usesFactor,
      :owl/someValuesFrom :fibo-loan-ln-app/AllBorrowersMonthlyIncome,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-dt-oc/hasInput,
      :owl/someValuesFrom :fibo-loan-ln-app/PublicRecord,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-dt-oc/hasInput,
      :owl/someValuesFrom :fibo-fbc-dae-crt/CreditReport,
      :rdf/type           :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-loan-ln-app/AutomaticUnderwriting,
      :owl/onProperty :fibo-fbc-dae-dbt/isBasedOn,
      :rdf/type       :owl/Restriction} :fibo-fnd-arr-asmt/AssessmentActivity
     {:owl/onProperty     :fibo-loan-ln-app/usesFactor,
      :owl/someValuesFrom :fibo-loan-ln-app/TotalDebtExpenseRatio,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-dt-oc/hasOutput,
      :owl/someValuesFrom :fibo-loan-ln-app/UnderwritingDecision,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-dt-oc/hasInput,
      :owl/someValuesFrom :fibo-loan-ln-app/PreApprovalRequest,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-loan-ln-app/usesFactor,
      :owl/someValuesFrom :fibo-loan-ln-app/BorrowerMonthlyIncome,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-loan-ln-app/usesFactor,
      :owl/someValuesFrom :fibo-loan-ln-ln/CombinedLoanToValueRatio,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-dt-oc/hasInput,
      :owl/someValuesFrom :fibo-loan-ln-app/PreApprovalContract,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "risk assessment that focuses on determining the likelihood of a potential borrower repaying a loan"})

(def DenialReason-CreditApplicationIncomplete
  {:db/ident :fibo-loan-ln-app/DenialReason-CreditApplicationIncomplete,
   :rdf/type :owl/NamedIndividual,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "credit application incomplete",
   :skos/definition
   "The application was denied because the credit application was not complete."})

(def DenialReason-InsufficientCash
  {:db/ident :fibo-loan-ln-app/DenialReason-InsufficientCash,
   :rdf/type :owl/NamedIndividual,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "insufficient cash",
   :skos/definition
   "The application was denied due to insufficient down payment, or cash available to pay closing costs."})

(def DenialReason-InsufficientCollateralValue
  {:db/ident :fibo-loan-ln-app/DenialReason-InsufficientCollateralValue,
   :rdf/type :owl/NamedIndividual,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "insufficient collateral value",
   :skos/definition
   "The application was denied because the value or type of collateral was not sufficient."})

(def DenialReason-InsufficientCreditHistory
  {:db/ident :fibo-loan-ln-app/DenialReason-InsufficientCreditHistory,
   :rdf/type :owl/NamedIndividual,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "insufficient credit history",
   :skos/definition
   "The application was denied because the credit history was too limited, unacceptable, or not at sufficient standing."})

(def DenialReason-InsufficientEmploymentHistory
  {:db/ident :fibo-loan-ln-app/DenialReason-InsufficientEmploymentHistory,
   :rdf/type :owl/NamedIndividual,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "insufficient employment history",
   :skos/definition
   "The application was denied because the employment is irregular, unknown, or not sufficient."})

(def DenialReason-InsufficientIncome
  {:db/ident :fibo-loan-ln-app/DenialReason-InsufficientIncome,
   :rdf/type :owl/NamedIndividual,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "insufficient income",
   :skos/definition
   "The application was denied because the debt to income ratio is too high."})

(def DenialReason-MortgageInsuranceDenied
  {:db/ident :fibo-loan-ln-app/DenialReason-MortgageInsuranceDenied,
   :rdf/type :owl/NamedIndividual,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "mortgage insurance denied",
   :skos/definition
   "The application was denied because necessary mortgage insurance was denied."})

(def DenialReason-UnverifiableInformation
  {:db/ident :fibo-loan-ln-app/DenialReason-UnverifiableInformation,
   :rdf/type :owl/NamedIndividual,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "unverifiable information",
   :skos/definition
   "The application was denied because qualification information such as income, employment, credit, or residence) was not verifiable."})

(def IncomeVerificationReport
  {:db/ident :fibo-loan-ln-app/IncomeVerificationReport,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "income verification report"},
   :rdfs/subClassOf :fibo-fnd-arr-asmt/AssessmentReport,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "report providing the methodology and supporting documentation used to verify the borrower's income"}})

(def IndividualPersonCreditRating
  {:db/ident :fibo-loan-ln-app/IndividualPersonCreditRating,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "individual person credit rating"},
   :rdfs/subClassOf :fibo-fbc-dae-crt/CreditRating,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit rating that provides an opinion of the creditworthiness of a person"}})

(def LoanApplication
  {:db/ident :fibo-loan-ln-app/LoanApplication,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "loan application",
   :rdfs/subClassOf
   #{:fibo-fnd-arr-doc/Document
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-loan-ln-ln/LoanToValueRatio,
      :owl/onProperty :cmns-col/comprises,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :cmns-dt/ExplicitDate,
      :owl/onProperty :fibo-fnd-dt-fd/hasDateReceived,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom :fibo-loan-ln-app/AllBorrowersMonthlyIncome,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom :fibo-loan-ln-app/BorrowerMonthlyIncome,
      :rdf/type           :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-loan-ln-ln/CombinedLoanToValueRatio,
      :owl/onProperty :cmns-col/comprises,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-arr-rep/isSubmittedBy,
      :owl/someValuesFrom :fibo-fnd-arr-rep/Requester,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-loan-ln-app/isPreApprovalRequested,
      :owl/someValuesFrom :xsd/boolean,
      :rdf/type           :owl/Restriction}
     {:owl/onClass    :cmns-dt/ExplicitDate,
      :owl/onProperty :fibo-loan-ln-app/hasApplicationDate,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom :fibo-loan-ln-app/TotalDebtExpenseRatio,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "request by a potential borrower to a potential lender to borrow money containing information used to decide whether to grant the loan",
   :skos/scopeNote
   "The request typicaly includes most, if not all, of the information used to decide whether to grant the loan."})

(def LoanApplicationAtAgreementStage
  {:db/ident :fibo-loan-ln-app/LoanApplicationAtAgreementStage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "loan application at agreement stage"},
   :rdfs/subClassOf :fibo-loan-ln-app/LoanApplicationStatus})

(def LoanApplicationAtDisbursementStage
  {:db/ident :fibo-loan-ln-app/LoanApplicationAtDisbursementStage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "loan application at disbursement stage"},
   :rdfs/subClassOf :fibo-loan-ln-app/LoanApplicationStatus})

(def LoanApplicationPhase
  {:db/ident :fibo-loan-ln-app/LoanApplicationPhase,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "loan application phase"},
   :rdfs/subClassOf :fibo-fnd-arr-lif/LifecycleStage})

(def LoanApplicationStatus
  {:db/ident :fibo-loan-ln-app/LoanApplicationStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "loan application status"},
   :rdfs/subClassOf :fibo-fnd-arr-lif/LifecycleStatus})

(def LoanAtApplicationStage
  {:db/ident :fibo-loan-ln-app/LoanAtApplicationStage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "loan at application stage"},
   :rdfs/subClassOf :fibo-loan-ln-app/LoanApplicationStatus})

(def ManualUnderwriting
  {:db/ident :fibo-loan-ln-app/ManualUnderwriting,
   :rdf/type #{:fibo-loan-ln-app/UnderwritingAutomation :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "manual underwriting",
   :skos/definition "underwriting was performed manually"})

(def PreApprovalContract
  {:cmns-av/explanatoryNote
   #{"A commitment from a lender to a borrower to extend a home purchase loan up to a certain amount, and subject to certain non-credit related conditions.  This commitment is entered into after a comprehensive analysis of the credit worthiness of the borrower is carried out."
     "This may also include limits on the region where to purchase."},
   :db/ident :fibo-loan-ln-app/PreApprovalContract,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "pre-approval contract",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fbc-dae-dbt/hasInterestRate,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/InterestRate,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-loan-ln-app/hasApprovedAmount,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryAmount,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-agr-ctr/WrittenContract},
   :skos/definition
   "written commitment to lend when specified conditions are met, such as finding suitable property, and unchanged creditworthiness"})

(def PreApprovalRequest
  {:cmns-av/explanatoryNote
   "This may also include limits on the region where to purchase.",
   :db/ident :fibo-loan-ln-app/PreApprovalRequest,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "pre-approval request",
   :rdfs/subClassOf #{:fibo-fnd-arr-rep/RequestActivity
                      {:owl/onProperty     :fibo-loan-ln-app/hasRequestedAmount,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryAmount,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fbc-dae-dbt/hasBorrower,
                       :owl/someValuesFrom :fibo-fbc-dae-dbt/Borrower,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "request from a potential borrower that a lender commit to pre-approving the borrower for a loan of up to a specified amount of money"})

(def PublicRecord
  {:cmns-av/explanatoryNote
   "This can include court actions such as bankruptcy and foreclosure, as well as liens and other events that have been recorded.",
   :db/ident :fibo-loan-ln-app/PublicRecord,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "public record",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-cls/isClassifiedBy,
      :owl/someValuesFrom :fibo-loan-ln-app/PublicRecordCategory,
      :rdf/type           :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fnd-arr-doc/LegalDocument,
      :owl/onProperty :fibo-fnd-agr-ctr/isEvidencedBy,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-pas-caa/Account,
      :owl/onProperty :fibo-fnd-rel-rel/refersTo,
      :rdf/type       :owl/Restriction} :fibo-fnd-arr-doc/Record},
   :skos/definition
   "record about an action involving a party that is publicly available from a court or other government agency"})

(def PublicRecordCategory
  {:db/ident :fibo-loan-ln-app/PublicRecordCategory,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "public record category",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition
   "classifier of public records relevant to a loan application, e.g. tax lien, wage garnishment, foreclosure"})

(def PublicRecordCategory-BankruptcyRecord
  {:db/ident :fibo-loan-ln-app/PublicRecordCategory-BankruptcyRecord,
   :rdf/type #{:fibo-loan-ln-app/PublicRecordCategory :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "bankruptcy record"})

(def PublicRecordCategory-CivilOrJudgementRecord
  {:db/ident :fibo-loan-ln-app/PublicRecordCategory-CivilOrJudgementRecord,
   :rdf/type #{:fibo-loan-ln-app/PublicRecordCategory :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "civil or judgement record"})

(def PublicRecordCategory-ForeclosureRecord
  {:db/ident :fibo-loan-ln-app/PublicRecordCategory-ForeclosureRecord,
   :rdf/type #{:fibo-loan-ln-app/PublicRecordCategory :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "foreclosure record"})

(def PublicRecordCategory-GarnishmentRecord
  {:db/ident :fibo-loan-ln-app/PublicRecordCategory-GarnishmentRecord,
   :rdf/type #{:fibo-loan-ln-app/PublicRecordCategory :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "garnishment record"})

(def PublicRecordCategory-LienRecord
  {:db/ident :fibo-loan-ln-app/PublicRecordCategory-LienRecord,
   :rdf/type #{:fibo-loan-ln-app/PublicRecordCategory :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "lien record"})

(def PublicRecordCategory-MaritalRecord
  {:db/ident :fibo-loan-ln-app/PublicRecordCategory-MaritalRecord,
   :rdf/type #{:fibo-loan-ln-app/PublicRecordCategory :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "marital record"})

(def PublicRecordCategory-PersonalPropertyRecord
  {:db/ident :fibo-loan-ln-app/PublicRecordCategory-PersonalPropertyRecord,
   :rdf/type #{:fibo-loan-ln-app/PublicRecordCategory :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "personal property record"})

(def PublicRecordCategory-RealEstate
  {:db/ident :fibo-loan-ln-app/PublicRecordCategory-RealEstate,
   :rdf/type #{:fibo-loan-ln-app/PublicRecordCategory :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "real estate record"})

(def TotalDebtExpenseRatio
  {:cmns-av/synonym "back end ratio",
   :db/ident :fibo-loan-ln-app/TotalDebtExpenseRatio,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "total debt expense ratio",
   :rdfs/subClassOf :fibo-fnd-acc-cur/PercentageMonetaryAmount,
   :skos/definition
   "ratio of all monthly debt payments of all borrowers, including proposed expenses, with respect to the income of the borrowers as relied upon to make a credit decision"})

(def UnderwritingAutomation
  {:db/ident :fibo-loan-ln-app/UnderwritingAutomation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "underwriting automation",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition
   "classifier indicating whether a loan was underwritten manually or using an automated underwriting system"})

(def UnderwritingDecision
  {:cmns-av/adaptedFrom {:rdf/value "the 2015 Revised HMDA regulation."},
   :db/ident :fibo-loan-ln-app/UnderwritingDecision,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "underwriting decision",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition
   "classifier providing a loan approval recommendation determined either manually or by an automated underwriting system"})

(def UnderwritingDecision-Approve
  {:db/ident :fibo-loan-ln-app/UnderwritingDecision-Approve,
   :rdf/type #{:fibo-loan-ln-app/UnderwritingDecision :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "approve"})

(def UnderwritingDecision-Deny
  {:db/ident :fibo-loan-ln-app/UnderwritingDecision-Deny,
   :rdf/type #{:fibo-loan-ln-app/UnderwritingDecision :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "deny"})

(def UnderwritingDecision-Eligible
  {:db/ident :fibo-loan-ln-app/UnderwritingDecision-Eligible,
   :rdf/type #{:fibo-loan-ln-app/UnderwritingDecision :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "eligible"})

(def UnderwritingDecision-Ineligible
  {:db/ident :fibo-loan-ln-app/UnderwritingDecision-Ineligible,
   :rdf/type #{:fibo-loan-ln-app/UnderwritingDecision :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "ineligible"})

(def UnderwritingDecision-Refer
  {:db/ident :fibo-loan-ln-app/UnderwritingDecision-Refer,
   :rdf/type #{:fibo-loan-ln-app/UnderwritingDecision :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "refer"})

(def UnderwritingDecision-UnableToDetermine
  {:db/ident :fibo-loan-ln-app/UnderwritingDecision-UnableToDetermine,
   :rdf/type #{:fibo-loan-ln-app/UnderwritingDecision :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "unable to determine"})

(def hasApplicationDate
  {:db/ident :fibo-loan-ln-app/hasApplicationDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-ln-app/LoanApplication,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has application date"},
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf :fibo-fnd-arr-rep/hasRequestDate,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "date on which an application was signed and submitted"}})

(def hasApplicationPhase
  {:db/ident :fibo-loan-ln-app/hasApplicationPhase,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-ln-app/LoanApplication,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has application phase"},
   :rdfs/range :fibo-loan-ln-app/LoanApplicationPhase,
   :rdfs/subPropertyOf :fibo-fnd-arr-lif/hasStage,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The phase within the application lifecycle, that this Loan Application is at,"}})

(def hasApprovedAmount
  {:db/ident :fibo-loan-ln-app/hasApprovedAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "has approved amount",
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   "relates something, e.g. a loan, to the amount of funds approved"})

(def hasGrossIncome
  {:db/ident :fibo-loan-ln-app/hasGrossIncome,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-ln-app/BorrowerAssessment,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has gross income"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "indicates the personal gross income of the borrower"}})

(def hasIntendedLoanPurpose
  {:db/ident :fibo-loan-ln-app/hasIntendedLoanPurpose,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-loan-ln-app/LoanApplication,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has intended loan purpose"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the purpose to which the loaned funds are to be put"}})

(def hasOriginalLoanDebtToIncomeRatio
  {:db/ident :fibo-loan-ln-app/hasOriginalLoanDebtToIncomeRatio,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-loan-ln-app/BorrowerAssessment,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has original loan debt-to-income ratio"},
   :rdfs/range :xsd/decimal,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the debt-to-income (DTI) ratio at the time when the loan was advanced; for combined income"}})

(def hasRequestedAmount
  {:db/ident :fibo-loan-ln-app/hasRequestedAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label "has requested amount",
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   "relates something, e.g. a request for a loan, to the amount of funds requested"})

(def isPreApprovalRequested
  {:db/ident :fibo-loan-ln-app/isPreApprovalRequested,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is pre-approval requested"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates whether a pre-approval has been requested, in conjunction with a loan application"}})

(def usesFactor
  {:cmns-av/explanatoryNote
   "There is intentionally no range for this property, so as not to limit what can be used as a factor. Often it will be a measure such as borrower monthly income. Thus, having a class called Factor seems unhelpful.",
   :db/ident :fibo-loan-ln-app/usesFactor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "uses factor"},
   :rdfs/subPropertyOf :fibo-fbc-dae-dbt/isBasedOn,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "relates e.g. a risk assessment to something used as a factor to make the assessment"}})

(def urn:uuid:ad28a18d-4780-5359-b6e7-0053bea8b97f
  {:cmns-av/copyright #{"Copyright (c) 2016-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines concepts for the loan application process, along with kinds of loan application and the parties thereto. Another major thread of this ontology is credit risk assessment at the highest level, which includes security agreements, pre-approvals, and credit reports.",
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
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/CreditRatings/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/ClientsAndAccounts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Lifecycles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Reporting/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/AccountingEquity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Assessments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansGeneral/LoanApplications/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Loan Applications Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"})