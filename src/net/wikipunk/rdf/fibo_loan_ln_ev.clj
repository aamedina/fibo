(ns net.wikipunk.rdf.fibo-loan-ln-ev
  "This ontology defines a wide range of events relating to loans. These include legal proceedings, prepayments, and so forth."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanEvents/",
   :dcterms/abstract
   "This ontology defines a wide range of events relating to loans. These include legal proceedings, prepayments, and so forth.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/Occurrences/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Assessments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/PaymentsAndSchedules/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/LegalCore/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansGeneral/Loans/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Lifecycles/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansGeneral/LoanEvents/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-arr-asmt"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
    "fibo-fnd-arr-lif"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-dt-oc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/",
    "fibo-fnd-law-cor"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCore/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
    "fibo-fnd-pas-psch"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-loan-ln-ev"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanEvents/",
    "fibo-loan-ln-ln"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanEvents/",
   :rdfa/prefix "fibo-loan-ln-ev",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "LoanEvents"},
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2015-2021 EDM Council, Inc."
                  "Copyright (c) 2015-2021 Object Management Group, Inc."],
   :sm/fileAbbreviation "fibo-loan-ln-ev"})

(def CollateralValuation
  "assessment activity resulting in the valuation of real property as collateral"
  {:db/ident :fibo-loan-ln-ev/CollateralValuation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "collateral valuation"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/isProvidedBy,
                      :owl/someValuesFrom :fibo-fnd-arr-asmt/Appraiser,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :fibo-fbc-dae-dbt/Collateral,
                      :owl/onProperty    :fibo-fnd-rel-rel/evaluates,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-arr-asmt/AssessmentActivity],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "assessment activity resulting in the valuation of real property as collateral"}})

(def CourtJudgment
  "decision by a court or other tribunal that resolves a controversy and determines the rights and obligations of the parties"
  {:db/ident :fibo-loan-ln-ev/CourtJudgment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "court judgment"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-loan-ln-ev/isDeliveredBy,
                      :owl/someValuesFrom :fibo-fnd-law-cor/CourtOfLaw,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-loan-ln-ev/hasJudgementAmount,
                      :rdf/type       :owl/Restriction}
                     :fibo-loan-ln-ev/LegalProceeding],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "decision by a court or other tribunal that resolves a controversy and determines the rights and obligations of the parties"}})

(def LegalProceeding
  "legal step or action taken at the direction of, or by the authority of, a court or agency"
  {:db/ident :fibo-loan-ln-ev/LegalProceeding,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "legal proceeding"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-loan-ln-ev/isAgainst,
                      :owl/someValuesFrom :fibo-be-le-lp/LegalPerson,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/isGovernedBy,
                      :owl/someValuesFrom :fibo-fnd-law-jur/Jurisdiction,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "legal step or action taken at the direction of, or by the authority of, a court or agency"}})

(def LoanDefaultProceeding
  "[no definition] Further Review This is typically part of mortgagte servicing. THere would typically be a whole department dealing with this. Dealing with default, helping borrowers make payment Collections Default admin Foreclosure Reselling All dealt with by several sub departments. This requires subject matter experts in this area. 1. scoping Identify default as a possible state. This hands off to other business processes. Once you get into the default scenario we are talking about a proces that is going to fall into place over a period of time. The bank works out what to do with the default scenario, e.g. whether it restructures, forecloses, seeks restitution from the security (collateral). It does nto help us to understand the structure of the loan, rather tha consequences of the loan. If we were to further explore the default detail we would bring in other SMEs. And we would have to model a process flow. 1.1 impact on the pool of an MBS Loan Default Proceeding (special ase of legal thing) is an aspect of Default Management / Administratoin. there is also the State of the Loan. Sale / something / fulfilment / fiunduing / approved = servicing mode. Something happens (non payment) =&gt; Default Grace Period followed by negotiation. Some threshold whereby after a given amount of delinquency it needs to go into some other process moving towards foreclosure. Do State Diagram. Stages of loan."
  {:db/ident :fibo-loan-ln-ev/LoanDefaultProceeding,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "loan default proceeding"},
   :rdfs/subClassOf :fibo-loan-ln-ev/LegalProceeding,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "[no definition] Further Review This is typically part of mortgagte servicing. THere would typically be a whole department dealing with this. Dealing with default, helping borrowers make payment Collections Default admin Foreclosure Reselling All dealt with by several sub departments. This requires subject matter experts in this area. 1. scoping Identify default as a possible state. This hands off to other business processes. Once you get into the default scenario we are talking about a proces that is going to fall into place over a period of time. The bank works out what to do with the default scenario, e.g. whether it restructures, forecloses, seeks restitution from the security (collateral). It does nto help us to understand the structure of the loan, rather tha consequences of the loan. If we were to further explore the default detail we would bring in other SMEs. And we would have to model a process flow. 1.1 impact on the pool of an MBS Loan Default Proceeding (special ase of legal thing) is an aspect of Default Management / Administratoin. there is also the State of the Loan. Sale / something / fulfilment / fiunduing / approved = servicing mode. Something happens (non payment) =&gt; Default Grace Period followed by negotiation. Some threshold whereby after a given amount of delinquency it needs to go into some other process moving towards foreclosure. Do State Diagram. Stages of loan."}})

(def LoanPaidInFull
  "loan paid in full"
  {:db/ident :fibo-loan-ln-ev/LoanPaidInFull,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "loan paid in full"},
   :rdfs/subClassOf :fibo-loan-ln-ev/LoanPhase})

(def LoanPhase
  "loan phase"
  {:db/ident :fibo-loan-ln-ev/LoanPhase,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "loan phase"},
   :rdfs/subClassOf :fibo-fnd-arr-lif/LifecycleStage})

(def Prepayment
  "prepayment"
  {:db/ident :fibo-loan-ln-ev/Prepayment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "prepayment"},
   :rdfs/subClassOf :fibo-fnd-pas-psch/Payment})

(def RepaymentPhase
  "repayment phase"
  {:db/ident :fibo-loan-ln-ev/RepaymentPhase,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "repayment phase"},
   :rdfs/subClassOf :fibo-loan-ln-ev/LoanPhase})

(def hasDefaultAmount
  "amount before the application of sale proceeds and recoveries"
  {:db/ident :fibo-loan-ln-ev/hasDefaultAmount,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Undefined PoC SDM Notes: Default or Foreclosure amount - Total default amount before the application of sale proceeds and recoveries.&nbsp; (AO 146, RR 135) Loan Default Proceeding_cd= (1) Default amount </p> <p> Sale price - Price achieved on sale of property ( AO 147, RR 137 )&nbsp; Loan Default Proceeding_cd= (2) Property Sale </p> <p> Loss on Sale&nbsp;&nbsp; Total loss net of fees, accrued interest etc. after application of sale proceeds (excluding prepayment charge if subordinate to principal recoveries). Show any gain on sale as a negative number (AO 148, RR 138 )&nbsp; Loan Default Proceeding_cd = (3) Loss amount </p> <p> Cumulative Reocveries - ony relevant for cases with losses&nbsp; ( AO 149, RR 139 )&nbsp; Loan Default Proceeding_cd =&nbsp; (4) Recoveries </p> <p> Professional Negligence Recoveries - Any amounts received in settlement or as a result of professional negligence claims against surveyors, solicitors etc. net of any fees / costs ( AO 150, RR 140 )&nbsp; Loan Default Proceeding_cd = (5) Professional Negligence </p><br />"},
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-ln-ev/LoanDefaultProceeding,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has default amount"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "amount before the application of sale proceeds and recoveries"}})

(def hasDisbursementDate
  "disbursement date"
  {:db/ident :fibo-loan-ln-ev/hasDisbursementDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-ln-ln/Loan,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "disbursement date"},
   :rdfs/range :fibo-fnd-dt-fd/ExplicitDate,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasExplicitDate})

(def hasJudgementAmount
  "Undefined PoC SDM Notes: Total value of CCJs or equivalent recorded against the primary borrower that were satisfied / unsatsified (at time of underwriting ) is computed by selecting the satisfaction code value of interest and aggregating against all borrower CC Judgements &lt;/p&gt;"
  {:db/ident :fibo-loan-ln-ev/hasJudgementAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-ln-ev/CourtJudgment,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has judgement amount"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Undefined PoC SDM Notes: Total value of CCJs or equivalent recorded against the primary borrower that were satisfied / unsatsified (at time of underwriting ) is computed by selecting the satisfaction code value of interest and aggregating against all borrower CC Judgements &lt;/p&gt;"}})

(def inDefault
  "Whether the loan is in default."
  {:db/ident :fibo-loan-ln-ev/inDefault,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-loan-ln-ln/Loan,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "in default"},
   :rdfs/range :xsd/boolean,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Whether the loan is in default."}})

(def isAgainst
  "is against"
  {:db/ident :fibo-loan-ln-ev/isAgainst,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-ln-ev/LegalProceeding,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is against"},
   :rdfs/range :fibo-be-le-lp/LegalPerson})

(def isDeferred
  "is deferred"
  {:db/ident :fibo-loan-ln-ev/isDeferred,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-loan-ln-ln/Loan,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is deferred"},
   :rdfs/range :xsd/boolean})

(def isDeliveredBy
  "is delivered by"
  {:db/ident :fibo-loan-ln-ev/isDeliveredBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-ln-ev/CourtJudgment,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is delivered by"},
   :rdfs/range :fibo-fnd-law-cor/CourtOfLaw})