(ns net.wikipunk.rdf.fibo-bp-iss-ambs
  "Process ontology for the process of issuance (securitization) of mortgage backed securities by government agencies. Based on US government agency MBS issuance process."
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :dcterms/abstract
   "Process ontology for the process of issuance (securitization) of mortgage backed securities by government agencies. Based on US government agency MBS issuance process.",
   :dcterms/license {:rdfa/uri "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/MBSIssuance/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/MortgageBackedSecurities/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Lifecycles/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/Bonds/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/IssuanceDocuments/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/DatesAndTimes/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/DebtIssuance/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/IssuanceProcess/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIssuance/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/RealEstateLoans/MortgageLoans/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/CreditRatings/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/PoolBackedSecurities/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-bp-iss-ambs"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
    "fibo-bp-iss-dbti"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
    "fibo-bp-iss-doc"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceDocuments/",
    "fibo-bp-iss-mbs"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MBSIssuance/",
    "fibo-bp-iss-pmbs"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
    "fibo-bp-iss-prc"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
    "fibo-fbc-dae-crt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-arr-lif"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-loan-reln-mtg"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
    "fibo-sec-dbt-bnd"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/",
    "fibo-sec-dbt-mbs"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
    "fibo-sec-sec-iss"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-bp-iss-ambs",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label #xsd/langString "AgencyMBSIssuance@en"})

(def AcquireMortgage
  "acquire mortgage"
  {:db/ident :fibo-bp-iss-ambs/AcquireMortgage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "acquire mortgage@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-bp-iss-ambs/purchase,
                      :owl/someValuesFrom :fibo-loan-reln-mtg/Mortgage,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProcessActivity]})

(def AddMortgageToPool
  "add mortgage to pool"
  {:db/ident :fibo-bp-iss-ambs/AddMortgageToPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "add mortgage to pool@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-bp-iss-ambs/addsToPool,
                      :owl/someValuesFrom :fibo-loan-reln-mtg/Mortgage,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProcessActivity]})

(def AgencyMortgagePoolCreationProcess
  "agency mortgage pool creation process"
  {:db/ident :fibo-bp-iss-ambs/AgencyMortgagePoolCreationProcess,
   :owl/disjointWith :fibo-bp-iss-pmbs/NonAgencyPoolCreationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "agency mortgage pool creation process@en",
   :rdfs/subClassOf [{:owl/onProperty :cmns-dt/precedes,
                      :owl/someValuesFrom
                      :fibo-bp-iss-ambs/PassThroughMBSSecuritizationProcess,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :cmns-dt/hasStartDate,
                      :owl/someValuesFrom :cmns-dt/Date,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-dt/hasEndDate,
                      :owl/someValuesFrom :cmns-dt/Date,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-dbti/RetailAssetPoolCreationProcess]})

(def AllocatePrimaryIdentifier
  "allocate primary identifier"
  {:db/ident :fibo-bp-iss-ambs/AllocatePrimaryIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "allocate primary identifier@en",
   :rdfs/subClassOf :fibo-bp-iss-prc/IssuanceProcessActivity})

(def AssessPoolSuitablilityForIssuance
  "assess pool suitablility for issuance"
  {:db/ident :fibo-bp-iss-ambs/AssessPoolSuitablilityForIssuance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "assess pool suitablility for issuance@en",
   :rdfs/subClassOf :fibo-bp-iss-prc/IssuanceProcessActivity})

(def ClassifyMortgage
  "classify mortgage"
  {:db/ident :fibo-bp-iss-ambs/ClassifyMortgage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "classify mortgage@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-bp-iss-ambs/isAssessmentOf,
                      :owl/someValuesFrom :fibo-loan-reln-mtg/Mortgage,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProcessActivity]})

(def DefineMortgagePool
  "define mortgage pool"
  {:db/ident :fibo-bp-iss-ambs/DefineMortgagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "define mortgage pool@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-ambs/isDefiningOf,
                      :owl/someValuesFrom
                      :fibo-bp-iss-ambs/NotYetIssuedAgencyMortgagePool,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProcessActivity]})

(def DraftPassThroughTermsheet
  "Draft of set of information defining the pass thorugh security terms. These will eventually become the contractual terms of the instrument. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-ambs/DraftPassThroughTermsheet,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "draft pass through termsheet@en",
   :rdfs/subClassOf :fibo-fnd-agr-ctr/TermSheet,
   :skos/definition
   #xsd/langString
    "Draft of set of information defining the pass thorugh security terms. These will eventually become the contractual terms of the instrument. Term origin:MBS PoC Reviews@en"})

(def DrawUpOfferingMemorandum
  "draw up offering memorandum"
  {:db/ident :fibo-bp-iss-ambs/DrawUpOfferingMemorandum,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "draw up offering memorandum@en",
   :rdfs/subClassOf :fibo-bp-iss-prc/IssuanceProcessActivity})

(def DrawUpTermsheet
  "draw up termsheet"
  {:db/ident :fibo-bp-iss-ambs/DrawUpTermsheet,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "draw up termsheet@en",
   :rdfs/subClassOf :fibo-bp-iss-prc/IssuanceProcessActivity})

(def FinalizePoolContent
  "finalize pool content"
  {:db/ident :fibo-bp-iss-ambs/FinalizePoolContent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "finalize pool content@en",
   :rdfs/subClassOf :fibo-bp-iss-prc/IssuanceProcessActivity})

(def FinalizeProspectus
  "finalize prospectus"
  {:db/ident :fibo-bp-iss-ambs/FinalizeProspectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "finalize prospectus@en",
   :rdfs/subClassOf :fibo-bp-iss-prc/IssuanceProcessActivity})

(def IdentifyConformingMortgage
  "Identify mortgage conforming to overall requirements for this issuer."
  {:cmns-av/explanatoryNote
   #xsd/langString
    "This does not relate to the criteria for belonging to an individual, defined mortgage pool but conforms to the requirements of the issuing organization overall. This is for Agency pools. For non-agency, the equivalent of this step is carried out at pool level with a clause to reject the mortgage.@en",
   :db/ident :fibo-bp-iss-ambs/IdentifyConformingMortgage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "identify conforming mortgage@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-loan-reln-mtg/Mortgage,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProcessActivity],
   :skos/definition
   #xsd/langString
    "Identify mortgage conforming to overall requirements for this issuer.@en"})

(def IdentifyUnderwriter
  "identify underwriter"
  {:db/ident :fibo-bp-iss-ambs/IdentifyUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "identify underwriter@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-ambs/resultsInAppointmentOf,
                      :owl/someValuesFrom
                      :fibo-bp-iss-ambs/PotentialPassThroughIssuanceUnderwriter,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProcessActivity]})

(def InAssemblyAgencyMortgagePool
  "in assembly agency mortgage pool"
  {:db/ident :fibo-bp-iss-ambs/InAssemblyAgencyMortgagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "in assembly agency mortgage pool@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
                      :owl/someValuesFrom :fibo-bp-iss-dbti/InAssembly,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-mbs/AgencyMortgagePool]})

(def InIssuanceAgencyMortgagePool
  "in issuance agency mortgage pool"
  {:db/ident :fibo-bp-iss-ambs/InIssuanceAgencyMortgagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "in issuance agency mortgage pool@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
                      :owl/someValuesFrom :fibo-bp-iss-dbti/InIssuance,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-mbs/AgencyMortgagePool]})

(def MakeSecuritiesAvailabeInMarket
  "make securities availabe in market"
  {:db/ident :fibo-bp-iss-ambs/MakeSecuritiesAvailabeInMarket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "make securities availabe in market@en",
   :rdfs/subClassOf :fibo-bp-iss-prc/IssuanceProcessActivity})

(def MarketIssue
  "market issue"
  {:db/ident :fibo-bp-iss-ambs/MarketIssue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "market issue@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-ambs/hasResource,
                      :owl/someValuesFrom
                      :fibo-bp-iss-ambs/PassThroughMBSDraftProspectus,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProcessActivity]})

(def NotYetIssuedAgencyMortgagePool
  "not yet issued agency mortgage pool"
  {:db/ident :fibo-bp-iss-ambs/NotYetIssuedAgencyMortgagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "not yet issued agency mortgage pool@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
                      :owl/someValuesFrom :fibo-bp-iss-dbti/NotYetIssued,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-mbs/AgencyMortgagePool]})

(def PassThroughIssueProspectusPart
  "A part or section of a prospectus for a pass through MBS issue. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-ambs/PassThroughIssueProspectusPart,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "pass through issue prospectus part@en",
   :rdfs/subClassOf :fibo-bp-iss-mbs/ProspectusPart,
   :skos/definition
   #xsd/langString
    "A part or section of a prospectus for a pass through MBS issue. Term origin:MBS PoC Reviews@en"})

(def PassThroughMBSDraftProspectus
  "The draft prospectus for a pass through Mortgage Backed Securities issue, as determined by the issuing agency prior to marketing the issue. Certain terms in the draft prospectus will be finalized later in the issuance process to become the actual Prospectus. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-ambs/PassThroughMBSDraftProspectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "pass through m b s draft prospectus@en",
   :rdfs/subClassOf [{:owl/onProperty :cmns-dt/precedes,
                      :owl/someValuesFrom
                      :fibo-bp-iss-ambs/PassThroughMBSFinalProspectus,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-doc/PreliminaryProspectus],
   :skos/definition
   #xsd/langString
    "The draft prospectus for a pass through Mortgage Backed Securities issue, as determined by the issuing agency prior to marketing the issue. Certain terms in the draft prospectus will be finalized later in the issuance process to become the actual Prospectus. Term origin:MBS PoC Reviews@en"})

(def PassThroughMBSFinalProspectus
  "Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-ambs/PassThroughMBSFinalProspectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "pass through m b s final prospectus@en",
   :rdfs/subClassOf :fibo-sec-dbt-mbs/MortgageBackedSecurityOfferingProspectus,
   :skos/definition #xsd/langString "Term origin:MBS PoC Reviews@en"})

(def PassThroughMBSFinalTermsheet
  "The final termsheet for the pass through MBS issue. This defines the terms for the MBS contract itself. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-ambs/PassThroughMBSFinalTermsheet,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "pass through m b s final termsheet@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom :fibo-sec-dbt-bnd/CouponPaymentTerms,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-bnd/BondAmortizationPaymentTerms,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-agr-ctr/TermSheet
                     :fibo-bp-iss-ambs/PassThroughIssueProspectusPart
                     :fibo-bp-iss-mbs/ProspectusPart],
   :skos/definition
   #xsd/langString
    "The final termsheet for the pass through MBS issue. This defines the terms for the MBS contract itself. Term origin:MBS PoC Reviews@en"})

(def PassThroughMBSSecuritizationProcess
  "pass through m b s securitization process"
  {:db/ident :fibo-bp-iss-ambs/PassThroughMBSSecuritizationProcess,
   :owl/disjointWith :fibo-bp-iss-pmbs/TranchedMBSSecuritizationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "pass through m b s securitization process@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-dt/hasStartDate,
                      :owl/someValuesFrom :cmns-dt/Date,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-dt/hasEndDate,
                      :owl/someValuesFrom :cmns-dt/Date,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-mbs/MBSSecuritizationProcess]})

(def PassThroughOfferingMemorandum
  "The offering memorandum for a pass through MBS issue, setting out basic information about a future issue, for the information of prospective investors and their agents. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-ambs/PassThroughOfferingMemorandum,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "pass through offering memorandum@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-mbs/includesDetailsAbout,
                      :owl/someValuesFrom
                      :fibo-bp-iss-ambs/PassThroughMBSFinalTermsheet,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-sec-iss/OfferingDocument],
   :skos/definition
   #xsd/langString
    "The offering memorandum for a pass through MBS issue, setting out basic information about a future issue, for the information of prospective investors and their agents. Term origin:MBS PoC Reviews@en"})

(def PoolConformanceCriteria
  "pool conformance criteria"
  {:db/ident :fibo-bp-iss-ambs/PoolConformanceCriteria,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "pool conformance criteria@en",
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-ambs/definesCriteriaFor,
                     :owl/someValuesFrom
                     :fibo-bp-iss-ambs/NotYetIssuedAgencyMortgagePool,
                     :rdf/type :owl/Restriction}})

(def PotentialAgencyMBSIssuer
  "The entity which will become the issuing party for the pass through MBS Issue. This entity is the principal actor in most of the activities involved in the issue. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-ambs/PotentialAgencyMBSIssuer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "potential agency m b s issuer@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-rel-rel/evaluates,
     :owl/someValuesFrom :fibo-bp-iss-ambs/AssessPoolSuitablilityForIssuance,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-ambs/purchases,
     :owl/someValuesFrom :fibo-bp-iss-ambs/AcquireMortgage,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-ambs/identifies,
     :owl/someValuesFrom :fibo-bp-iss-ambs/IdentifyConformingMortgage,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-ambs/finalizes,
     :owl/someValuesFrom :fibo-bp-iss-ambs/FinalizePoolContent,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-ambs/adds,
     :owl/someValuesFrom :fibo-bp-iss-ambs/AddMortgageToPool,
     :rdf/type           :owl/Restriction}
    :fibo-bp-iss-dbti/PoolBackedSecuritySecuritizationProcessActor
    {:owl/onProperty     :fibo-bp-iss-ambs/validates,
     :owl/someValuesFrom :fibo-bp-iss-ambs/ValidateConformance,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/evaluates,
     :owl/someValuesFrom :fibo-bp-iss-ambs/ClassifyMortgage,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "The entity which will become the issuing party for the pass through MBS Issue. This entity is the principal actor in most of the activities involved in the issue. Term origin:MBS PoC Reviews@en"})

(def PotentialPassThroughIssuanceUnderwriter
  "The entity which will become the underwriter for the pass through MBS issue. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-ambs/PotentialPassThroughIssuanceUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "potential pass through issuance underwriter@en",
   :rdfs/subClassOf :fibo-bp-iss-prc/PotentialUnderwriter,
   :skos/definition
   #xsd/langString
    "The entity which will become the underwriter for the pass through MBS issue. Term origin:MBS PoC Reviews@en"})

(def RegisterSecurity
  "register security"
  {:db/ident :fibo-bp-iss-ambs/RegisterSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "register security@en",
   :rdfs/subClassOf :fibo-bp-iss-prc/IssuanceProcessActivity})

(def SuitableForIssue
  "suitable for issue"
  {:db/ident :fibo-bp-iss-ambs/SuitableForIssue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "suitable for issue@en"})

(def ValidateConformance
  "The mortgage is automatically validated for conformance to the requirements of the pool in which it is to be included."
  {:db/ident :fibo-bp-iss-ambs/ValidateConformance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "validate conformance@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom
                      :fibo-bp-iss-ambs/PoolConformanceCriteria,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProcessActivity],
   :skos/definition
   #xsd/langString
    "The mortgage is automatically validated for conformance to the requirements of the pool in which it is to be included.@en",
   :skos/editorialNote
   #xsd/langString
    "From review comment 6 Oct: box called validate conformance automatic eg max loan balance@en"})

(def adds
  "adds"
  {:db/ident :fibo-bp-iss-ambs/adds,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/PotentialAgencyMBSIssuer,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "adds@en",
   :rdfs/range :fibo-bp-iss-ambs/AddMortgageToPool})

(def addsToPool
  "adds to pool"
  {:db/ident :fibo-bp-iss-ambs/addsToPool,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/AddMortgageToPool,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "adds to pool@en",
   :rdfs/range :fibo-loan-reln-mtg/Mortgage})

(def allocatesIdentifier
  "allocates identifier"
  {:db/ident :fibo-bp-iss-ambs/allocatesIdentifier,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label "allocates identifier"})

(def definesCriteriaFor
  "defines criteria for"
  {:db/ident :fibo-bp-iss-ambs/definesCriteriaFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/PoolConformanceCriteria,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "defines criteria for@en",
   :rdfs/range :fibo-bp-iss-ambs/NotYetIssuedAgencyMortgagePool})

(def finalizes
  "finalizes"
  {:db/ident :fibo-bp-iss-ambs/finalizes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/PotentialAgencyMBSIssuer,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "finalizes@en",
   :rdfs/range :fibo-bp-iss-ambs/FinalizePoolContent})

(def hasResource
  "has resource"
  {:db/ident :fibo-bp-iss-ambs/hasResource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/MarketIssue,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "has resource@en",
   :rdfs/range :fibo-bp-iss-ambs/PassThroughMBSDraftProspectus})

(def identifies
  "identifies"
  {:db/ident :fibo-bp-iss-ambs/identifies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/PotentialAgencyMBSIssuer,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "identifies@en",
   :rdfs/range :fibo-bp-iss-ambs/IdentifyConformingMortgage})

(def isAssessmentOf
  "is assessment of"
  {:db/ident :fibo-bp-iss-ambs/isAssessmentOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/ClassifyMortgage,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "is assessment of@en",
   :rdfs/range :fibo-loan-reln-mtg/Mortgage})

(def isDefiningOf
  "is defining of"
  {:db/ident :fibo-bp-iss-ambs/isDefiningOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/DefineMortgagePool,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "is defining of@en",
   :rdfs/range :fibo-bp-iss-ambs/NotYetIssuedAgencyMortgagePool})

(def maximumLoanBalance
  "maximum loan balance"
  {:db/ident :fibo-bp-iss-ambs/maximumLoanBalance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/PoolConformanceCriteria,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "maximum loan balance@en",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount})

(def minimumRating
  "minimum rating"
  {:db/ident :fibo-bp-iss-ambs/minimumRating,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/PoolConformanceCriteria,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "minimum rating@en",
   :rdfs/range :fibo-fbc-dae-crt/InvestmentCreditRating})

(def purchase
  "purchase"
  {:db/ident :fibo-bp-iss-ambs/purchase,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/AcquireMortgage,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "purchase@en",
   :rdfs/range :fibo-loan-reln-mtg/Mortgage})

(def purchases
  "purchases"
  {:db/ident :fibo-bp-iss-ambs/purchases,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/PotentialAgencyMBSIssuer,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "purchases@en",
   :rdfs/range :fibo-bp-iss-ambs/AcquireMortgage})

(def resultsInAppointmentOf
  "results in appointment of"
  {:db/ident :fibo-bp-iss-ambs/resultsInAppointmentOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/IdentifyUnderwriter,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "results in appointment of@en",
   :rdfs/range :fibo-bp-iss-ambs/PotentialPassThroughIssuanceUnderwriter})

(def validates
  "validates"
  {:db/ident :fibo-bp-iss-ambs/validates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/PotentialAgencyMBSIssuer,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"},
   :rdfs/label #xsd/langString "validates@en",
   :rdfs/range :fibo-bp-iss-ambs/ValidateConformance})