(ns net.wikipunk.rdf.fibo-bp-iss-ambs
  "Process ontology for the process of issuance (securitization) of mortgage backed securities by government agencies. Based on US government agency MBS issuance process."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :dcterms/abstract
   "Process ontology for the process of issuance (securitization) of mortgage backed securities by government agencies. Based on US government agency MBS issuance process.",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/MBSIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/MortgageBackedSecurities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Lifecycles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/Bonds/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/IssuanceDocuments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/DebtIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/IssuanceProcess/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/RealEstateLoans/MortgageLoans/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/CreditRatings/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/PoolBackedSecurities/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
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
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-arr-lif"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
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
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xs" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfa/prefix "fibo-bp-iss-ambs",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "AgencyMBSIssuance"},
   :sm/fileAbbreviation "fibo-bp-iss-ambs"})

(def AcquireMortgage
  {:db/ident :fibo-bp-iss-ambs/AcquireMortgage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "acquire mortgage"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-bp-iss-ambs/purchase,
                      :owl/someValuesFrom :fibo-loan-reln-mtg/Mortgage,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProcessActivity]})

(def AddMortgageToPool
  {:db/ident :fibo-bp-iss-ambs/AddMortgageToPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "add mortgage to pool"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-bp-iss-ambs/addsToPool,
                      :owl/someValuesFrom :fibo-loan-reln-mtg/Mortgage,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProcessActivity]})

(def AgencyMortgagePoolCreationProcess
  {:db/ident :fibo-bp-iss-ambs/AgencyMortgagePoolCreationProcess,
   :owl/disjointWith :fibo-bp-iss-pmbs/NonAgencyPoolCreationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agency mortgage pool creation process"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-dt-fd/hasStartDate,
                      :owl/someValuesFrom :fibo-fnd-dt-fd/Date,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-dt-fd/hasEndDate,
                      :owl/someValuesFrom :fibo-fnd-dt-fd/Date,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fbc-pas-fpas/precedes,
                      :owl/someValuesFrom
                      :fibo-bp-iss-ambs/PassThroughMBSSecuritizationProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-dbti/RetailAssetPoolCreationProcess]})

(def AllocatePrimaryIdentifier
  {:db/ident :fibo-bp-iss-ambs/AllocatePrimaryIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "allocate primary identifier"},
   :rdfs/subClassOf :fibo-bp-iss-prc/IssuanceProcessActivity})

(def AssessPoolSuitablilityForIssuance
  {:db/ident :fibo-bp-iss-ambs/AssessPoolSuitablilityForIssuance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "assess pool suitablility for issuance"},
   :rdfs/subClassOf :fibo-bp-iss-prc/IssuanceProcessActivity})

(def ClassifyMortgage
  {:db/ident :fibo-bp-iss-ambs/ClassifyMortgage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "classify mortgage"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-bp-iss-ambs/isAssessmentOf,
                      :owl/someValuesFrom :fibo-loan-reln-mtg/Mortgage,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProcessActivity]})

(def DefineMortgagePool
  {:db/ident :fibo-bp-iss-ambs/DefineMortgagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "define mortgage pool"},
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
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "draft pass through termsheet"},
   :rdfs/subClassOf :fibo-fnd-agr-ctr/TermSheet,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Draft of set of information defining the pass thorugh security terms. These will eventually become the contractual terms of the instrument. Term origin:MBS PoC Reviews"}})

(def DrawUpOfferingMemorandum
  {:db/ident :fibo-bp-iss-ambs/DrawUpOfferingMemorandum,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "draw up offering memorandum"},
   :rdfs/subClassOf :fibo-bp-iss-prc/IssuanceProcessActivity})

(def DrawUpTermsheet
  {:db/ident :fibo-bp-iss-ambs/DrawUpTermsheet,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "draw up termsheet"},
   :rdfs/subClassOf :fibo-bp-iss-prc/IssuanceProcessActivity})

(def FinalizePoolContent
  {:db/ident :fibo-bp-iss-ambs/FinalizePoolContent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "finalize pool content"},
   :rdfs/subClassOf :fibo-bp-iss-prc/IssuanceProcessActivity})

(def FinalizeProspectus
  {:db/ident :fibo-bp-iss-ambs/FinalizeProspectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "finalize prospectus"},
   :rdfs/subClassOf :fibo-bp-iss-prc/IssuanceProcessActivity})

(def IdentifyConformingMortgage
  "Identify mortgage conforming to overall requirements for this issuer."
  {:db/ident :fibo-bp-iss-ambs/IdentifyConformingMortgage,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This does not relate to the criteria for belonging to an individual, defined mortgage pool but conforms to the requirements of the issuing organization overall. This is for Agency pools. For non-agency, the equivalent of this step is carried out at pool level with a clause to reject the mortgage."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "identify conforming mortgage"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-loan-reln-mtg/Mortgage,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProcessActivity],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Identify mortgage conforming to overall requirements for this issuer."}})

(def IdentifyUnderwriter
  {:db/ident :fibo-bp-iss-ambs/IdentifyUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "identify underwriter"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-ambs/resultsInAppointmentOf,
                      :owl/someValuesFrom
                      :fibo-bp-iss-ambs/PotentialPassThroughIssuanceUnderwriter,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProcessActivity]})

(def InAssemblyAgencyMortgagePool
  {:db/ident :fibo-bp-iss-ambs/InAssemblyAgencyMortgagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "in assembly agency mortgage pool"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
                      :owl/someValuesFrom :fibo-bp-iss-dbti/InAssembly,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-mbs/AgencyMortgagePool]})

(def InIssuanceAgencyMortgagePool
  {:db/ident :fibo-bp-iss-ambs/InIssuanceAgencyMortgagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "in issuance agency mortgage pool"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
                      :owl/someValuesFrom :fibo-bp-iss-dbti/InIssuance,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-mbs/AgencyMortgagePool]})

(def MakeSecuritiesAvailabeInMarket
  {:db/ident :fibo-bp-iss-ambs/MakeSecuritiesAvailabeInMarket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "make securities availabe in market"},
   :rdfs/subClassOf :fibo-bp-iss-prc/IssuanceProcessActivity})

(def MarketIssue
  {:db/ident :fibo-bp-iss-ambs/MarketIssue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "market issue"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-ambs/hasResource,
                      :owl/someValuesFrom
                      :fibo-bp-iss-ambs/PassThroughMBSDraftProspectus,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProcessActivity]})

(def NotYetIssuedAgencyMortgagePool
  {:db/ident :fibo-bp-iss-ambs/NotYetIssuedAgencyMortgagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "not yet issued agency mortgage pool"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
                      :owl/someValuesFrom :fibo-bp-iss-dbti/NotYetIssued,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-mbs/AgencyMortgagePool]})

(def PassThroughIssueProspectusPart
  "A part or section of a prospectus for a pass through MBS issue. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-ambs/PassThroughIssueProspectusPart,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pass through issue prospectus part"},
   :rdfs/subClassOf :fibo-bp-iss-mbs/ProspectusPart,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A part or section of a prospectus for a pass through MBS issue. Term origin:MBS PoC Reviews"}})

(def PassThroughMBSDraftProspectus
  "The draft prospectus for a pass through Mortgage Backed Securities issue, as determined by the issuing agency prior to marketing the issue. Certain terms in the draft prospectus will be finalized later in the issuance process to become the actual Prospectus. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-ambs/PassThroughMBSDraftProspectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pass through m b s draft prospectus"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fbc-pas-fpas/precedes,
                      :owl/someValuesFrom
                      :fibo-bp-iss-ambs/PassThroughMBSFinalProspectus,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-doc/PreliminaryProspectus],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The draft prospectus for a pass through Mortgage Backed Securities issue, as determined by the issuing agency prior to marketing the issue. Certain terms in the draft prospectus will be finalized later in the issuance process to become the actual Prospectus. Term origin:MBS PoC Reviews"}})

(def PassThroughMBSFinalProspectus
  "Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-ambs/PassThroughMBSFinalProspectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pass through m b s final prospectus"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/MortgageBackedSecurityOfferingProspectus,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Term origin:MBS PoC Reviews"}})

(def PassThroughMBSFinalTermsheet
  "The final termsheet for the pass through MBS issue. This defines the terms for the MBS contract itself. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-ambs/PassThroughMBSFinalTermsheet,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pass through m b s final termsheet"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom :fibo-sec-dbt-bnd/CouponPaymentTerms,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-bnd/BondAmortizationPaymentTerms,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-agr-ctr/TermSheet
                     :fibo-bp-iss-ambs/PassThroughIssueProspectusPart],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The final termsheet for the pass through MBS issue. This defines the terms for the MBS contract itself. Term origin:MBS PoC Reviews"}})

(def PassThroughMBSSecuritizationProcess
  {:db/ident :fibo-bp-iss-ambs/PassThroughMBSSecuritizationProcess,
   :owl/disjointWith :fibo-bp-iss-pmbs/TranchedMBSSecuritizationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pass through m b s securitization process"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-dt-fd/hasStartDate,
                      :owl/someValuesFrom :fibo-fnd-dt-fd/Date,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-dt-fd/hasEndDate,
                      :owl/someValuesFrom :fibo-fnd-dt-fd/Date,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-mbs/MBSSecuritizationProcess]})

(def PassThroughOfferingMemorandum
  "The offering memorandum for a pass through MBS issue, setting out basic information about a future issue, for the information of prospective investors and their agents. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-ambs/PassThroughOfferingMemorandum,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pass through offering memorandum"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-mbs/includesDetailsAbout,
                      :owl/someValuesFrom
                      :fibo-bp-iss-ambs/PassThroughMBSFinalTermsheet,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-sec-iss/OfferingDocument],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The offering memorandum for a pass through MBS issue, setting out basic information about a future issue, for the information of prospective investors and their agents. Term origin:MBS PoC Reviews"}})

(def PoolConformanceCriteria
  {:db/ident :fibo-bp-iss-ambs/PoolConformanceCriteria,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pool conformance criteria"},
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-ambs/definesCriteriaFor,
                     :owl/someValuesFrom
                     :fibo-bp-iss-ambs/NotYetIssuedAgencyMortgagePool,
                     :rdf/type :owl/Restriction}})

(def PotentialAgencyMBSIssuer
  "The entity which will become the issuing party for the pass through MBS Issue. This entity is the principal actor in most of the activities involved in the issue. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-ambs/PotentialAgencyMBSIssuer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "potential agency m b s issuer"},
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-bp-iss-ambs/purchases,
     :owl/someValuesFrom :fibo-bp-iss-ambs/AcquireMortgage,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-ambs/adds,
     :owl/someValuesFrom :fibo-bp-iss-ambs/AddMortgageToPool,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-ambs/finalizes,
     :owl/someValuesFrom :fibo-bp-iss-ambs/FinalizePoolContent,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/evaluates,
     :owl/someValuesFrom :fibo-bp-iss-ambs/ClassifyMortgage,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-ambs/validates,
     :owl/someValuesFrom :fibo-bp-iss-ambs/ValidateConformance,
     :rdf/type           :owl/Restriction}
    :fibo-bp-iss-dbti/PoolBackedSecuritySecuritizationProcessActor
    {:owl/onProperty     :fibo-fnd-rel-rel/evaluates,
     :owl/someValuesFrom :fibo-bp-iss-ambs/AssessPoolSuitablilityForIssuance,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-ambs/identifies,
     :owl/someValuesFrom :fibo-bp-iss-ambs/IdentifyConformingMortgage,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The entity which will become the issuing party for the pass through MBS Issue. This entity is the principal actor in most of the activities involved in the issue. Term origin:MBS PoC Reviews"}})

(def PotentialPassThroughIssuanceUnderwriter
  "The entity which will become the underwriter for the pass through MBS issue. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-ambs/PotentialPassThroughIssuanceUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "potential pass through issuance underwriter"},
   :rdfs/subClassOf :fibo-bp-iss-prc/PotentialUnderwriter,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The entity which will become the underwriter for the pass through MBS issue. Term origin:MBS PoC Reviews"}})

(def RegisterSecurity
  {:db/ident :fibo-bp-iss-ambs/RegisterSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "register security"},
   :rdfs/subClassOf :fibo-bp-iss-prc/IssuanceProcessActivity})

(def SuitableForIssue
  {:db/ident :fibo-bp-iss-ambs/SuitableForIssue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "suitable for issue"}})

(def ValidateConformance
  "The mortgage is automatically validated for conformance to the requirements of the pool in which it is to be included."
  {:db/ident :fibo-bp-iss-ambs/ValidateConformance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "validate conformance"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom
                      :fibo-bp-iss-ambs/PoolConformanceCriteria,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProcessActivity],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The mortgage is automatically validated for conformance to the requirements of the pool in which it is to be included."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "From review comment 6 Oct: box called validate conformance automatic eg max loan balance"}})

(def adds
  {:db/ident :fibo-bp-iss-ambs/adds,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/PotentialAgencyMBSIssuer,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "adds"},
   :rdfs/range :fibo-bp-iss-ambs/AddMortgageToPool})

(def addsToPool
  {:db/ident :fibo-bp-iss-ambs/addsToPool,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/AddMortgageToPool,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "adds to pool"},
   :rdfs/range :fibo-loan-reln-mtg/Mortgage})

(def allocatesIdentifier
  {:db/ident :fibo-bp-iss-ambs/allocatesIdentifier,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label "allocates identifier"})

(def definesCriteriaFor
  {:db/ident :fibo-bp-iss-ambs/definesCriteriaFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/PoolConformanceCriteria,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "defines criteria for"},
   :rdfs/range :fibo-bp-iss-ambs/NotYetIssuedAgencyMortgagePool})

(def finalizes
  {:db/ident :fibo-bp-iss-ambs/finalizes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/PotentialAgencyMBSIssuer,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "finalizes"},
   :rdfs/range :fibo-bp-iss-ambs/FinalizePoolContent})

(def hasResource
  {:db/ident :fibo-bp-iss-ambs/hasResource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/MarketIssue,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has resource"},
   :rdfs/range :fibo-bp-iss-ambs/PassThroughMBSDraftProspectus})

(def identifies
  {:db/ident :fibo-bp-iss-ambs/identifies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/PotentialAgencyMBSIssuer,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "identifies"},
   :rdfs/range :fibo-bp-iss-ambs/IdentifyConformingMortgage})

(def isAssessmentOf
  {:db/ident :fibo-bp-iss-ambs/isAssessmentOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/ClassifyMortgage,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is assessment of"},
   :rdfs/range :fibo-loan-reln-mtg/Mortgage})

(def isDefiningOf
  {:db/ident :fibo-bp-iss-ambs/isDefiningOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/DefineMortgagePool,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is defining of"},
   :rdfs/range :fibo-bp-iss-ambs/NotYetIssuedAgencyMortgagePool})

(def maximumLoanBalance
  {:db/ident :fibo-bp-iss-ambs/maximumLoanBalance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/PoolConformanceCriteria,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "maximum loan balance"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount})

(def minimumRating
  {:db/ident :fibo-bp-iss-ambs/minimumRating,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/PoolConformanceCriteria,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "minimum rating"},
   :rdfs/range :fibo-fbc-dae-crt/InvestmentCreditRating})

(def purchase
  {:db/ident :fibo-bp-iss-ambs/purchase,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/AcquireMortgage,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "purchase"},
   :rdfs/range :fibo-loan-reln-mtg/Mortgage})

(def purchases
  {:db/ident :fibo-bp-iss-ambs/purchases,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/PotentialAgencyMBSIssuer,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "purchases"},
   :rdfs/range :fibo-bp-iss-ambs/AcquireMortgage})

(def resultsInAppointmentOf
  {:db/ident :fibo-bp-iss-ambs/resultsInAppointmentOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/IdentifyUnderwriter,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "results in appointment of"},
   :rdfs/range :fibo-bp-iss-ambs/PotentialPassThroughIssuanceUnderwriter})

(def validates
  {:db/ident :fibo-bp-iss-ambs/validates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ambs/PotentialAgencyMBSIssuer,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "validates"},
   :rdfs/range :fibo-bp-iss-ambs/ValidateConformance})