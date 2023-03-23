(ns net.wikipunk.rdf.fibo-loan-reln-hmda
  "This ontology defines concepts specific to mortgages that are covered by the Home Mortgage Disclosure Act (HMDA) and related regulations. This includes the concept of a HMDA report as well as specializations of the core classes for pre-approval requests, covered loan contracts."
  {:cmns-av/copyright ["Copyright (c) 2016-2023 EDM Council, Inc."
                       "Copyright (c) 2016-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/HomeMortgageDisclosureActCoveredMortgages/",
   :dcterms/abstract
   "This ontology defines concepts specific to mortgages that are covered by the Home Mortgage Disclosure Act (HMDA) and related regulations. This includes the concept of a HMDA report as well as specializations of the core classes for pre-approval requests, covered loan contracts.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansGeneral/Loans/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Organizations/FormalOrganizations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Reporting/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/RealEstateLoans/MortgageLoans/"
    "https://www.omg.org/spec/Commons/Classifiers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegulatoryAgencies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/RealEstateLoans/HomeMortgageDisclosureActCoveredMortgages/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-fbc-fct-rga"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies/",
    "fibo-fnd-arr-rep"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-org-fm"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
    "fibo-fnd-utl-alx"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-loan-ln-app"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/",
    "fibo-loan-reln-hmda"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/HomeMortgageDisclosureActCoveredMortgages/",
    "fibo-loan-reln-mtg"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-loan-reln-hmda",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/HomeMortgageDisclosureActCoveredMortgages/",
   :rdfs/label
   "Home Mortgage Disclosure Act (HMDA) Covered Mortgages Ontology"})

(def Ethnicity
  "category based on a cultural factors, including nationality, regional culture, ancestry, and language"
  {:db/ident :fibo-loan-reln-hmda/Ethnicity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/HomeMortgageDisclosureActCoveredMortgages/",
   :rdfs/label "ethnicity",
   :rdfs/subClassOf [{:owl/onProperty :cmns-cls/classifies,
                      :owl/someValuesFrom
                      :fibo-be-le-lp/LegallyCompetentNaturalPerson,
                      :rdf/type :owl/Restriction}
                     :cmns-cls/Classifier],
   :skos/definition
   "category based on a cultural factors, including nationality, regional culture, ancestry, and language"})

(def HMDA-CoveredLoanContract
  "a closed-end mortgage loan or open-end line of credit that is not an excluded transaction for HMDA reporting under US section 1003.3(c) of the Revised Home Mortgage Disclosure Act of 2015"
  {:cmns-av/adaptedFrom "the Revised HMDA regulatory text.",
   :db/ident :fibo-loan-reln-hmda/HMDA-CoveredLoanContract,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/HomeMortgageDisclosureActCoveredMortgages/",
   :rdfs/label "HMDA covered loan contract",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cls/isClassifiedBy,
                      :owl/someValuesFrom :fibo-loan-reln-hmda/HowSubmitted,
                      :rdf/type           :owl/Restriction}
                     :fibo-loan-reln-mtg/Mortgage],
   :skos/definition
   "a closed-end mortgage loan or open-end line of credit that is not an excluded transaction for HMDA reporting under US section 1003.3(c) of the Revised Home Mortgage Disclosure Act of 2015"})

(def HMDA-Disposition
  "a type of action taken regarding an application for a HMDA covered loan"
  {:db/ident :fibo-loan-reln-hmda/HMDA-Disposition,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/HomeMortgageDisclosureActCoveredMortgages/",
   :rdfs/label "HMDA disposition",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition
   "a type of action taken regarding an application for a HMDA covered loan"})

(def HMDA-Disposition-ApplicationApprovedButNotAccepted
  {:db/ident
   :fibo-loan-reln-hmda/HMDA-Disposition-ApplicationApprovedButNotAccepted,
   :rdf/type [:fibo-loan-reln-hmda/HMDA-Disposition :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/HomeMortgageDisclosureActCoveredMortgages/"})

(def HMDA-Disposition-ApplicationDenied
  {:db/ident :fibo-loan-reln-hmda/HMDA-Disposition-ApplicationDenied,
   :rdf/type [:fibo-loan-reln-hmda/HMDA-Disposition :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/HomeMortgageDisclosureActCoveredMortgages/"})

(def HMDA-Disposition-ApplicationWithdrawn
  {:db/ident :fibo-loan-reln-hmda/HMDA-Disposition-ApplicationWithdrawn,
   :rdf/type [:fibo-loan-reln-hmda/HMDA-Disposition :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/HomeMortgageDisclosureActCoveredMortgages/"})

(def HMDA-Disposition-FileClosedForIncompleteness
  {:db/ident :fibo-loan-reln-hmda/HMDA-Disposition-FileClosedForIncompleteness,
   :rdf/type [:fibo-loan-reln-hmda/HMDA-Disposition :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/HomeMortgageDisclosureActCoveredMortgages/"})

(def HMDA-Disposition-LoanOriginated
  {:db/ident :fibo-loan-reln-hmda/HMDA-Disposition-LoanOriginated,
   :rdf/type [:fibo-loan-reln-hmda/HMDA-Disposition :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/HomeMortgageDisclosureActCoveredMortgages/"})

(def HMDA-Disposition-LoanPurchasedByYourInstitution
  {:db/ident
   :fibo-loan-reln-hmda/HMDA-Disposition-LoanPurchasedByYourInstitution,
   :rdf/type [:fibo-loan-reln-hmda/HMDA-Disposition :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/HomeMortgageDisclosureActCoveredMortgages/"})

(def HMDA-Disposition-PreapprovalRequestApprovedButNotAccepted
  {:db/ident
   :fibo-loan-reln-hmda/HMDA-Disposition-PreapprovalRequestApprovedButNotAccepted,
   :rdf/type [:fibo-loan-reln-hmda/HMDA-Disposition :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/HomeMortgageDisclosureActCoveredMortgages/"})

(def HMDA-Disposition-PreapprovalRequestDenied
  {:db/ident :fibo-loan-reln-hmda/HMDA-Disposition-PreapprovalRequestDenied,
   :rdf/type [:fibo-loan-reln-hmda/HMDA-Disposition :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/HomeMortgageDisclosureActCoveredMortgages/"})

(def HMDA-PreApprovalRequest
  "a request for pre-approval of a home purchase loan up to a certain amount, and subject to certain non-credit related conditions"
  {:cmns-av/adaptedFrom "the 2015 Revised HMDA regulation.",
   :cmns-av/explanatoryNote
   "This request is approved only after a comprehensive analysis of the credit worthiness of the borrower is carried out.",
   :db/ident :fibo-loan-reln-hmda/HMDA-PreApprovalRequest,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/HomeMortgageDisclosureActCoveredMortgages/",
   :rdfs/label "HMDA pre-approval request",
   :rdfs/subClassOf :fibo-loan-ln-app/PreApprovalRequest,
   :skos/definition
   "a request for pre-approval of a home purchase loan up to a certain amount, and subject to certain non-credit related conditions"})

(def HMDA-Report
  "a report prepared to satisfy HMDA regulatory reporting requirements as described US section 1003.3(c) of the Revised Home Mortgage Disclosure Act of 2015"
  {:cmns-av/adaptedFrom "the Revised HMDA regulatory text.",
   :db/ident :fibo-loan-reln-hmda/HMDA-Report,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/HomeMortgageDisclosureActCoveredMortgages/",
   :rdfs/label "HMDA report",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-rep/isSubmittedTo,
                      :owl/someValuesFrom :fibo-fbc-fct-rga/RegulatoryAgency,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    {:owl/onProperty
                                       :fibo-fnd-pty-rl/isPlayedBy,
                                       :owl/someValuesFrom
                                       {:owl/intersectionOf
                                        [:fibo-be-le-lp/LegalPerson
                                         :fibo-fnd-org-fm/FormalOrganization],
                                        :rdf/type :owl/Class},
                                       :rdf/type :owl/Restriction},
                      :owl/onProperty :fibo-fnd-arr-rep/isSubmittedBy,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-arr-rep/Report
                     {:owl/onProperty     :fibo-fnd-utl-alx/hasNumberOfEntries,
                      :owl/someValuesFrom :xsd/positiveInteger,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "a report prepared to satisfy HMDA regulatory reporting requirements as described US section 1003.3(c) of the Revised Home Mortgage Disclosure Act of 2015",
   :skos/editorialNote
   "The filter class on the hasReportingAgent restriction comes from the hasIdentity restriction on FinancialServiceProvider, which, unfortunately,  is a PartyInRole."})

(def HowSubmitted
  "category indicating whether the applicant or borrower submitted the application for the covered loan directly to the reporting financial institution"
  {:cmns-av/adaptedFrom "2015 Revised HMDA regulation",
   :db/ident :fibo-loan-reln-hmda/HowSubmitted,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/HomeMortgageDisclosureActCoveredMortgages/",
   :rdfs/label "how submitted",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition
   "category indicating whether the applicant or borrower submitted the application for the covered loan directly to the reporting financial institution"})

(def HowSubmitted-directly
  {:db/ident :fibo-loan-reln-hmda/HowSubmitted-directly,
   :rdf/type [:fibo-loan-reln-hmda/HowSubmitted :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/HomeMortgageDisclosureActCoveredMortgages/"})

(def HowSubmitted-notDirectly
  {:db/ident :fibo-loan-reln-hmda/HowSubmitted-notDirectly,
   :rdf/type [:fibo-loan-reln-hmda/HowSubmitted :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/HomeMortgageDisclosureActCoveredMortgages/"})

(def Race
  "a category based on a person's physical characteristics, such as bone structure and skin, hair, or eye color"
  {:db/ident :fibo-loan-reln-hmda/Race,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/HomeMortgageDisclosureActCoveredMortgages/",
   :rdfs/label "race",
   :rdfs/subClassOf [{:owl/onProperty :cmns-cls/classifies,
                      :owl/someValuesFrom
                      :fibo-be-le-lp/LegallyCompetentNaturalPerson,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :skos/broaderTransitive,
                      :owl/someValuesFrom :fibo-loan-reln-hmda/Race,
                      :rdf/type           :owl/Restriction}
                     :cmns-cls/Classifier],
   :skos/definition
   "a category based on a person's physical characteristics, such as bone structure and skin, hair, or eye color"})

(def hasHMDA-DispositionDate
  "the date associated with the HMDA Disposition for a HMDA Covered Loan"
  {:db/ident :fibo-loan-reln-hmda/hasHMDA-DispositionDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/HomeMortgageDisclosureActCoveredMortgages/",
   :rdfs/label "HMDA disposition date",
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasDate,
   :skos/definition
   "the date associated with the HMDA Disposition for a HMDA Covered Loan"})