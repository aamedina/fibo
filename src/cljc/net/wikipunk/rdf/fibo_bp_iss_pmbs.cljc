(ns net.wikipunk.rdf.fibo-bp-iss-pmbs
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :dcterms/abstract
   "Process ontology for the process of issuance (securitization) of mortgage backed securities by commercial institutions rather than by government agencies.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
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
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-arr-lif"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
    "fibo-fnd-arr-rep"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-txn-sec"
    "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/SecuritiesTransactions/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-loan-reln-mtg"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
    "fibo-sec-dbt-bnd"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/",
    "fibo-sec-dbt-cdo"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
    "fibo-sec-dbt-mbs"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
    "fibo-sec-sec-iss"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/LOAN/RealEstateLoans/MortgageLoans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/LOAN/LoansGeneral/Loans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/Bonds/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/DebtIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/MBSIssuance/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/Lifecycles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/PoolBackedSecurities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/TransactionsExt/REATransactions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/AgentsAndPeople/Agents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/TransactionsExt/SecuritiesTransactions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/SecuritiesIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/IssuanceDocuments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/AgencyMBSIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/IssuanceProcess/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/MortgageBackedSecurities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/CollateralizedDebtObligations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/Reporting/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-bp-iss-pmbs",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PrivateLabelMBSIssuance"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"})

(def AllocatePrimaryIdentifier
  {:db/ident :fibo-bp-iss-pmbs/AllocatePrimaryIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "allocate primary identifier"},
   :rdfs/subClassOf :fibo-bp-iss-prc/IssuanceProcessActivity})

(def AllocateRatings
  {:db/ident :fibo-bp-iss-pmbs/AllocateRatings,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "allocate ratings"},
   :rdfs/subClassOf :fibo-bp-iss-prc/IssuanceProcessActivity})

(def AssessPoolSuitabilityForIssuance
  {:db/ident :fibo-bp-iss-pmbs/AssessPoolSuitabilityForIssuance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "assess pool suitability for issuance"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-bp-iss-pmbs/isAssessmentOf,
                       :owl/someValuesFrom
                       :fibo-bp-iss-pmbs/InAssemblyMortgagePool,
                       :rdf/type :owl/Restriction}
                      :fibo-bp-iss-prc/IssuanceProcessActivity}})

(def AssessRatings
  {:db/ident :fibo-bp-iss-pmbs/AssessRatings,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "assess ratings"},
   :rdfs/subClassOf :fibo-bp-iss-prc/IssuanceProcessActivity})

(def BrokerDealer
  {:db/ident :fibo-bp-iss-pmbs/BrokerDealer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "broker dealer"},
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-pmbs/commitsTo,
                     :owl/someValuesFrom
                     :fibo-bp-iss-pmbs/GetCommitmentFromInvestors,
                     :rdf/type :owl/Restriction},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An entity which may become a primary investor in the issue. Term origin:MBS PoC Reviews"}})

(def CloseDeal
  {:db/ident :fibo-bp-iss-pmbs/CloseDeal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "close deal"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-bp-iss-pmbs/resultsInPublicationOf,
                       :owl/someValuesFrom :fibo-bp-iss-pmbs/RemittanceReport,
                       :rdf/type :owl/Restriction}
                      :fibo-bp-iss-prc/IssuanceProcessActivity
                      {:owl/onProperty :fibo-bp-iss-pmbs/resultsIn,
                       :owl/someValuesFrom
                       :fibo-bp-iss-pmbs/TranchedMBSDealTransaction,
                       :rdf/type :owl/Restriction}}})

(def DefineNotesParameters
  {:db/ident :fibo-bp-iss-pmbs/DefineNotesParameters,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "define notes parameters"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-bp-iss-pmbs/resultsIn.1,
                       :owl/someValuesFrom
                       :fibo-bp-iss-pmbs/DraftTrancheNotesParameters,
                       :rdf/type :owl/Restriction}
                      :fibo-bp-iss-prc/IssuanceProcessActivity},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the denom of the notes"}})

(def DefinePoolCharacteristics
  {:db/ident :fibo-bp-iss-pmbs/DefinePoolCharacteristics,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "define pool characteristics"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-bp-iss-pmbs/isDefiningOf,
                       :owl/someValuesFrom
                       :fibo-bp-iss-pmbs/NotYetIssuedNonAgencyMortgagePool,
                       :rdf/type :owl/Restriction}
                      :fibo-bp-iss-prc/IssuanceProcessActivity}})

(def DraftTrancheNotesParameters
  {:db/ident :fibo-bp-iss-pmbs/DraftTrancheNotesParameters,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "draft tranche notes parameters"},
   :rdfs/subClassOf :cmns-doc/Document,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Draft of set of information defining the notes breakdown of one tranche. covers denominations and amounts that you can byu of the instrument in this tranche. Term origin:MBS PoC Reviews"}})

(def DraftTrancheStructure
  {:db/ident :fibo-bp-iss-pmbs/DraftTrancheStructure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "draft tranche structure"},
   :rdfs/subClassOf :cmns-doc/Document,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Draft of set of information defining the tranches in the tranched issue and how these relate to one another. Term origin:MBS PoC Reviews"}})

(def DraftTrancheTermsheet
  {:db/ident :fibo-bp-iss-pmbs/DraftTrancheTermsheet,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "draft tranche termsheet"},
   :rdfs/subClassOf :fibo-fnd-agr-ctr/TermSheet,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Draft of set of information defining one tranche of a tranched issue. This will become the termsheet of an individual tranche within that issue. Term origin:MBS PoC Reviews"}})

(def DrawUpOfferingMemorandum
  {:db/ident :fibo-bp-iss-pmbs/DrawUpOfferingMemorandum,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "draw up offering memorandum"},
   :rdfs/subClassOf :fibo-bp-iss-prc/IssuanceProcessActivity})

(def DrawUpTrancheTermsheets
  {:db/ident :fibo-bp-iss-pmbs/DrawUpTrancheTermsheets,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "draw up tranche termsheets"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-bp-iss-pmbs/requires,
                       :owl/someValuesFrom
                       :fibo-sec-dbt-mbs/NonAgencyMortgagePool,
                       :rdf/type :owl/Restriction}
                      :fibo-bp-iss-prc/IssuanceProcessActivity}})

(def FinalizePoolContent
  {:db/ident :fibo-bp-iss-pmbs/FinalizePoolContent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "finalize pool content"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-bp-iss-pmbs/finalizes.1,
                       :owl/someValuesFrom
                       :fibo-bp-iss-pmbs/InIssuanceNonAgencyMortgagePool,
                       :rdf/type :owl/Restriction}
                      :fibo-bp-iss-prc/IssuanceProcessActivity}})

(def FinalizeProspectus
  {:db/ident :fibo-bp-iss-pmbs/FinalizeProspectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "finalize prospectus"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-bp-iss-pmbs/resultsIn.2,
                       :owl/someValuesFrom
                       :fibo-sec-dbt-cdo/TranchedMBSDealProspectus,
                       :rdf/type :owl/Restriction}
                      :fibo-bp-iss-prc/IssuanceProcessActivity}})

(def GetCommitmentFromInvestors
  {:db/ident :fibo-bp-iss-pmbs/GetCommitmentFromInvestors,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "get commitment from investors"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-bp-iss-pmbs/commitmentBasedOn,
      :owl/someValuesFrom :fibo-bp-iss-pmbs/TranchedDraftProspectus,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-bp-iss-pmbs/hasResource,
      :owl/someValuesFrom :fibo-bp-iss-pmbs/DraftTrancheNotesParameters,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-bp-iss-pmbs/hasResource.2,
      :owl/someValuesFrom :fibo-bp-iss-pmbs/DraftTrancheNotesParameters,
      :rdf/type           :owl/Restriction}
     :fibo-bp-iss-prc/IssuanceProcessActivity}})

(def IdentifyConformingMortgage
  {:db/ident :fibo-bp-iss-pmbs/IdentifyConformingMortgage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "identify conforming mortgage"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-bp-iss-pmbs/refersTo,
                       :owl/someValuesFrom :fibo-loan-reln-mtg/Mortgage,
                       :rdf/type           :owl/Restriction}
                      :fibo-bp-iss-prc/IssuanceProcessActivity}})

(def IdentifyUnderwriter
  {:db/ident :fibo-bp-iss-pmbs/IdentifyUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "identify underwriter"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-bp-iss-dbti/resultsIn,
                       :owl/someValuesFrom
                       :fibo-bp-iss-pmbs/PotentialTranchedIssueUnderwriter,
                       :rdf/type :owl/Restriction}
                      :fibo-bp-iss-prc/IssuanceProcessActivity}})

(def InAssemblyMortgagePool
  {:db/ident :fibo-bp-iss-pmbs/InAssemblyMortgagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "in assembly mortgage pool"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
                       :owl/someValuesFrom :fibo-bp-iss-dbti/InAssembly,
                       :rdf/type           :owl/Restriction}
                      :fibo-sec-dbt-mbs/NonAgencyMortgagePool}})

(def InIssuanceNonAgencyMortgagePool
  {:db/ident :fibo-bp-iss-pmbs/InIssuanceNonAgencyMortgagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "in issuance non agency mortgage pool"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
                       :owl/someValuesFrom :fibo-bp-iss-dbti/InIssuance,
                       :rdf/type           :owl/Restriction}
                      :fibo-sec-dbt-mbs/NonAgencyMortgagePool}})

(def IndividualTrancheDefinitions
  {:db/ident :fibo-bp-iss-pmbs/IndividualTrancheDefinitions,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "individual tranche definitions"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                       :owl/someValuesFrom
                       :fibo-sec-dbt-bnd/BondAmortizationPaymentTerms,
                       :rdf/type :owl/Restriction} :fibo-fnd-agr-ctr/TermSheet
                      :fibo-bp-iss-pmbs/TranchedMBSIssueProspectusPart
                      {:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                       :owl/someValuesFrom :fibo-sec-dbt-bnd/CouponPaymentTerms,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "In reality there is one termsheet that has sets of information for the terms for each Tranche. This class of information identifies the terms of one tranche, but it does not exist as a separate document in its own right. Further Notes ? We may need to firm up the relationship between the individual tranche termsheet and the information about the relationships among these (some of which are quite complex) and the terms that are common to more than one tranche. In practice these may be separate sections of one document. Term origin:MBS PoC Reviews"}})

(def Investor
  {:db/ident :fibo-bp-iss-pmbs/Investor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "investor"}})

(def MBSSecuritizationEnd
  {:db/ident :fibo-bp-iss-pmbs/MBSSecuritizationEnd,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "m b s securitization end"}})

(def MBSSecuritizationStart
  {:db/ident :fibo-bp-iss-pmbs/MBSSecuritizationStart,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "m b s securitization start"}})

(def MakeSecuritiesAvailableInMarket
  {:db/ident :fibo-bp-iss-pmbs/MakeSecuritiesAvailableInMarket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "make securities available in market"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-bp-iss-pmbs/requires.1,
                       :owl/someValuesFrom
                       :fibo-sec-dbt-cdo/TranchedMBSDealProspectus,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty     :fibo-bp-iss-pmbs/isIssueOf,
                       :owl/someValuesFrom :fibo-sec-dbt-cdo/TranchedMBSDeal,
                       :rdf/type           :owl/Restriction}
                      :fibo-bp-iss-prc/IssuanceProcessActivity},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "What happens here? e.g. notices / marketing (phone calls) Structured Finance: There's not really notices in the newspaper, it's a very small market and it's all based on relationships so there's no public notice. So you would get an email from the sales person at the bank who has just closed the deal and is now selling these (this bank is the broker/dealer who bought it?) There's not really much of a secondary market - the initial investors would often hold on to these. There is something around Bloomberg - you can go there and see what's available, if someone has a number of notes from a iven tranche, that they are willing to sell. So there's no transpoarency (!!) Sales would be OTC but less transparent e.g. if you look up a normal OTC stock, you would be able to see more of this information, than in these (non Agency) MBS issues and other SF. DOES THIS APPLY IN ALL MBS??."}})

(def MarketIssueToPrimaryInvestors
  {:db/ident :fibo-bp-iss-pmbs/MarketIssueToPrimaryInvestors,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "market issue to primary investors"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-bp-iss-pmbs/hasResource.1,
                       :owl/someValuesFrom
                       :fibo-bp-iss-pmbs/TranchedOfferingMemorandum,
                       :rdf/type :owl/Restriction}
                      :fibo-bp-iss-prc/IssuanceProcessActivity}})

(def NonAgencyPoolCreationEnd
  {:db/ident :fibo-bp-iss-pmbs/NonAgencyPoolCreationEnd,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non agency pool creation end"},
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-pmbs/flow,
                     :owl/someValuesFrom
                     :fibo-bp-iss-pmbs/MBSSecuritizationStart,
                     :rdf/type :owl/Restriction}})

(def NonAgencyPoolCreationProcess
  {:db/ident :fibo-bp-iss-pmbs/NonAgencyPoolCreationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non agency pool creation process"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/RetailAssetPoolCreationProcess})

(def NonAgencyPoolCreationStart
  {:db/ident :fibo-bp-iss-pmbs/NonAgencyPoolCreationStart,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non agency pool creation start"}})

(def NotYetIssuedNonAgencyMortgagePool
  {:db/ident :fibo-bp-iss-pmbs/NotYetIssuedNonAgencyMortgagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "not yet issued non agency mortgage pool"},
   :rdfs/subClassOf #{:fibo-sec-dbt-mbs/NonAgencyMortgagePool
                      {:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
                       :owl/someValuesFrom :fibo-bp-iss-dbti/NotYetIssued,
                       :rdf/type           :owl/Restriction}}})

(def NumberingAgency
  {:db/ident :fibo-bp-iss-pmbs/NumberingAgency,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "numbering agency"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-bp-iss-pmbs/allocatesIdentifier,
      :owl/someValuesFrom :fibo-bp-iss-pmbs/AllocatePrimaryIdentifier,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-bp-iss-ambs/allocatesIdentifier,
      :owl/someValuesFrom :fibo-bp-iss-ambs/AllocatePrimaryIdentifier,
      :rdf/type           :owl/Restriction}
     :fibo-bp-iss-prc/SecuritiesIssuanceProcessActor},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The agency which will provide the primary securitiy identifier for the security. Term origin:MBS PoC Reviews"}})

(def PoolLifecycleStateSelection
  {:db/ident :fibo-bp-iss-pmbs/PoolLifecycleStateSelection,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PoolLifecycleStateSelection"},
   :rdfs/subClassOf :fibo-fnd-arr-lif/LifecycleStage})

(def PoolReadyForIssue
  {:db/ident :fibo-bp-iss-pmbs/PoolReadyForIssue,
   :owl/equivalentClass {:owl/unionOf
                         [:fibo-bp-iss-pmbs/FinalizePoolContent
                          :fibo-bp-iss-pmbs/IdentifyConformingMortgage],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pool ready for issue"}})

(def PoolTrustee
  {:db/ident :fibo-bp-iss-pmbs/PoolTrustee,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pool trustee"},
   :rdfs/subClassOf #{:cmns-pts/PartyRole
                      {:owl/onProperty :fibo-bp-iss-pmbs/mayBecome,
                       :owl/someValuesFrom
                       :fibo-sec-sec-iss/SecurityUnderwriter,
                       :rdf/type :owl/Restriction}}})

(def PotentialMBSInvestor
  {:db/ident :fibo-bp-iss-pmbs/PotentialMBSInvestor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "potential m b s investor"}})

(def PotentialNonAgencyMBSIssuer
  {:db/ident :fibo-bp-iss-pmbs/PotentialNonAgencyMBSIssuer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "potential non agency m b s issuer"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-rel-rel/evaluates,
      :owl/someValuesFrom :fibo-bp-iss-pmbs/AssessRatings,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-rel-rel/evaluates,
      :owl/someValuesFrom :fibo-bp-iss-pmbs/AssessPoolSuitabilityForIssuance,
      :rdf/type           :owl/Restriction}
     :fibo-bp-iss-dbti/PoolBackedSecuritySecuritizationProcessActor},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The entity which will become the issuing party for the Tranched MBS Issue. This entity is the principal actor in most of the activities involved in the issue. Term origin:MBS PoC Reviews"}})

(def PotentialTranchedIssueUnderwriter
  {:db/ident :fibo-bp-iss-pmbs/PotentialTranchedIssueUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "potential tranched issue underwriter"},
   :rdfs/subClassOf :fibo-bp-iss-prc/PotentialUnderwriter,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The entity which will become the underwriter for the tranched MBS issue. Term origin:MBS PoC Reviews"}})

(def PrimaryInvestor
  {:db/ident :fibo-bp-iss-pmbs/PrimaryInvestor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "primary investor"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A party which becomes the primary investor in the issue, by purchasing some of the tranches of the issue. Term origin:MBS PoC Reviews"}})

(def PurchaseMortgageIntoPool
  {:db/ident :fibo-bp-iss-pmbs/PurchaseMortgageIntoPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "purchase mortgage into pool"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-bp-iss-pmbs/addsTo,
                       :owl/someValuesFrom
                       :fibo-bp-iss-pmbs/InAssemblyMortgagePool,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty     :fibo-bp-iss-pmbs/isPurchaseOf,
                       :owl/someValuesFrom :fibo-loan-reln-mtg/Mortgage,
                       :rdf/type           :owl/Restriction}
                      :fibo-bp-iss-prc/IssuanceProcessActivity}})

(def RatingsAgency
  {:db/ident :fibo-bp-iss-pmbs/RatingsAgency,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ratings agency"},
   :rdfs/subClassOf {:owl/onProperty     :fibo-bp-iss-pmbs/allocatesRatings,
                     :owl/someValuesFrom :fibo-bp-iss-pmbs/AllocateRatings,
                     :rdf/type           :owl/Restriction}})

(def RatingsSuitableForIssue
  {:db/ident :fibo-bp-iss-pmbs/RatingsSuitableForIssue,
   :owl/equivalentClass {:owl/unionOf
                         [:fibo-bp-iss-pmbs/DrawUpOfferingMemorandum
                          :fibo-bp-iss-pmbs/DrawUpTrancheTermsheets],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ratings suitable for issue"}})

(def RegisterSecurity
  {:db/ident :fibo-bp-iss-pmbs/RegisterSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "register security"},
   :rdfs/subClassOf :fibo-bp-iss-prc/IssuanceProcessActivity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "After the deal is closed the security is formally registered with some registraton authority This is the \"official\" bit - there is not a separate \"Issue\" activity which is official ?????"}})

(def RemittanceReport
  {:db/ident :fibo-bp-iss-pmbs/RemittanceReport,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "remittance report"},
   :rdfs/subClassOf :fibo-fnd-arr-rep/Report,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Report containing a specific and limited set of information about the Deal. Term origin:MBS PoC Reviews"}})

(def TrancheNotesParameters
  {:db/ident :fibo-bp-iss-pmbs/TrancheNotesParameters,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tranche notes parameters"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-doc/isAbout,
                       :owl/someValuesFrom :fibo-sec-dbt-cdo/MBSTrancheNote,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                       :owl/onProperty :fibo-bp-iss-pmbs/maximumAmount,
                       :rdf/type       :owl/Restriction}
                      :fibo-bp-iss-pmbs/TranchedMBSIssueProspectusPart},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "One set of information defining the notes breakdown of one tranche. Covers denominations and amounts that you can byu of the instrument in this tranche. Q: Is this really defined in the prospectus? A: yes The prospectus lists the characteristics including e.g. \"The notes will be sold in denominations of X AND Increuemtns of Y e.g. $250 000 incremented by $1000. Parameters include: Denominations Minimum amounts what else? Term origin:MBS PoC Reviews"}})

(def TrancheStructureAndTermsheet
  {:db/ident :fibo-bp-iss-pmbs/TrancheStructureAndTermsheet,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tranche structure and termsheet"},
   :rdfs/subClassOf :fibo-bp-iss-pmbs/TranchedMBSIssueProspectusPart,
   :skos/definition
   #{{:rdf/language "en",
      :rdf/value
      "The termsheet with the terms for individual tranches is a separate component, known as the Tranche Termsheet or Individual Tranche Definitions. These may in practice be in one sheet or document deliverable but is a set of termsheets defining the terms for the set of tranches. Term origin:MBS PoC Reviews"}
     {:rdf/language "en",
      :rdf/value    "One sheet defining the MBS structure."}}})

(def TranchedDraftProspectus
  {:db/ident :fibo-bp-iss-pmbs/TranchedDraftProspectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tranched draft prospectus"},
   :rdfs/subClassOf #{{:owl/onProperty :cmns-dt/precedes,
                       :owl/someValuesFrom
                       :fibo-sec-dbt-cdo/TranchedMBSDealProspectus,
                       :rdf/type :owl/Restriction}
                      :fibo-bp-iss-doc/PreliminaryProspectus},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The draft prospectus for a tranched Mortgage Backed Securities issue, as determined by the issuing entity prior to marketing the issue. Certain terms in the draft prospectus will be finalized later in the issuance process to become the actual Prospectus. Term origin:MBS PoC Reviews"}})

(def TranchedMBSDealSettlement
  {:db/ident :fibo-bp-iss-pmbs/TranchedMBSDealSettlement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tranched m b s deal settlement"},
   :rdfs/subClassOf
   {:owl/onProperty :fibo-bp-iss-pmbs/decomposesInto,
    :owl/someValuesFrom
    :fibo-bp-iss-pmbs/TranchedMBSPrimaryDealTransactionSettlementProcess,
    :rdf/type :owl/Restriction}})

(def TranchedMBSDealTransaction
  {:db/ident :fibo-bp-iss-pmbs/TranchedMBSDealTransaction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tranched m b s deal transaction"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-bp-iss-pmbs/hasCounterparty,
      :owl/someValuesFrom :fibo-bp-iss-pmbs/PrimaryInvestor,
      :rdf/type           :owl/Restriction}
     :fibo-fnd-txn-sec/FinancialPrimaryMarketTransaction
     {:owl/onProperty :fibo-fnd-txn-sec/follows,
      :owl/someValuesFrom
      :fibo-bp-iss-pmbs/TranchedMBSPrimaryDealTransactionSettlementProcess,
      :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The deal transaction by which the MBS Issue is issued to primary investors. Term origin:MBS PoC Reviews"}})

(def TranchedMBSIssueProspectusPart
  {:db/ident :fibo-bp-iss-pmbs/TranchedMBSIssueProspectusPart,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tranched m b s issue prospectus part"},
   :rdfs/subClassOf :fibo-bp-iss-mbs/ProspectusPart,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A part or section of a prospectus for a tranched mortgage backed securities issue. Term origin:MBS PoC Reviews"}})

(def TranchedMBSPrimaryDealTransactionSettlementProcess
  {:db/ident
   :fibo-bp-iss-pmbs/TranchedMBSPrimaryDealTransactionSettlementProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "tranched m b s primary deal transaction settlement process"},
   :rdfs/subClassOf :fibo-fnd-txn-sec/SettlementProcess,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process by which the primary deal transaction is settled. Term origin:MBS PoC Reviews"}})

(def TranchedMBSProspectusOutline
  {:db/ident :fibo-bp-iss-pmbs/TranchedMBSProspectusOutline,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tranched m b s prospectus outline"},
   :rdfs/subClassOf #{:fibo-bp-iss-doc/PreliminaryProspectus
                      {:owl/onProperty :fibo-bp-iss-pmbs/hasContent.1,
                       :owl/someValuesFrom
                       :fibo-bp-iss-pmbs/DraftTrancheTermsheet,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An outline of the tranched prospectus, provind an intial representation of the possible tranches and their features. Term origin:MBS PoC Reviews"}})

(def TranchedMBSSecuritizationProcess
  {:db/ident :fibo-bp-iss-pmbs/TranchedMBSSecuritizationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tranched m b s securitization process"},
   :rdfs/subClassOf :fibo-bp-iss-mbs/MBSSecuritizationProcess})

(def TranchedOfferingMemorandum
  {:db/ident :fibo-bp-iss-pmbs/TranchedOfferingMemorandum,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tranched offering memorandum"},
   :rdfs/subClassOf
   #{:fibo-sec-sec-iss/OfferingDocument
     {:owl/maxQualifiedCardinality 1,
      :owl/onClass    :fibo-bp-iss-pmbs/DraftTrancheNotesParameters,
      :owl/onProperty :fibo-bp-iss-pmbs/mayIncludeDetailsAbout,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :fibo-bp-iss-pmbs/includesDetailsAbout.1,
      :owl/someValuesFrom :fibo-bp-iss-pmbs/IndividualTrancheDefinitions,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-bp-iss-pmbs/includesDetailsAbout,
      :owl/someValuesFrom :fibo-bp-iss-pmbs/TrancheStructureAndTermsheet,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   #{{:rdf/language "en",
      :rdf/value
      "The offering memorandum for a tranched MBS issue, setting out basic information about a future issue, for the information of prospective investors and their agents."}
     {:rdf/language "en",
      :rdf/value
      "The Offering Memorandum will include or attach the terms for two or more individual tranches that will make up the issue, and the structure of the tranches, including how they will relate to one another (priorities and so on). Term origin:MBS PoC Reviews"}}})

(def addsTo
  {:db/ident :fibo-bp-iss-pmbs/addsTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/PurchaseMortgageIntoPool,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "adds to"},
   :rdfs/range :fibo-bp-iss-pmbs/InAssemblyMortgagePool})

(def allocatesIdentifier
  {:db/ident :fibo-bp-iss-pmbs/allocatesIdentifier,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/NumberingAgency,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "allocates identifier"},
   :rdfs/range :fibo-bp-iss-pmbs/AllocatePrimaryIdentifier})

(def allocatesRatings
  {:db/ident :fibo-bp-iss-pmbs/allocatesRatings,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/RatingsAgency,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "allocates ratings"},
   :rdfs/range :fibo-bp-iss-pmbs/AllocateRatings})

(def commitmentBasedOn
  {:db/ident :fibo-bp-iss-pmbs/commitmentBasedOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/GetCommitmentFromInvestors,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "commitment based on"},
   :rdfs/range :fibo-bp-iss-pmbs/TranchedDraftProspectus})

(def commitsTo
  {:db/ident :fibo-bp-iss-pmbs/commitsTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/BrokerDealer,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "commits to"},
   :rdfs/range :fibo-bp-iss-pmbs/GetCommitmentFromInvestors})

(def decomposesInto
  {:db/ident :fibo-bp-iss-pmbs/decomposesInto,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/TranchedMBSDealSettlement,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "decomposes into"},
   :rdfs/range
   :fibo-bp-iss-pmbs/TranchedMBSPrimaryDealTransactionSettlementProcess})

(def denominationIncrement
  {:db/ident :fibo-bp-iss-pmbs/denominationIncrement,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/TrancheNotesParameters,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "denomination increment"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount})

(def finalizes_1
  {:db/ident :fibo-bp-iss-pmbs/finalizes.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/FinalizePoolContent,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "finalizes"},
   :rdfs/range :fibo-bp-iss-pmbs/InIssuanceNonAgencyMortgagePool})

(def flow
  {:db/ident :fibo-bp-iss-pmbs/flow,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/NonAgencyPoolCreationEnd,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "flow"},
   :rdfs/range :fibo-bp-iss-pmbs/MBSSecuritizationStart})

(def hasContent
  {:db/ident :fibo-bp-iss-pmbs/hasContent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/TranchedMBSProspectusOutline,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has content"},
   :rdfs/range :fibo-bp-iss-pmbs/DraftTrancheStructure,
   :rdfs/subPropertyOf :cmns-col/hasPart})

(def hasContent_1
  {:db/ident :fibo-bp-iss-pmbs/hasContent.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/TranchedMBSProspectusOutline,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has content"},
   :rdfs/range :fibo-bp-iss-pmbs/DraftTrancheTermsheet,
   :rdfs/subPropertyOf :cmns-col/hasPart})

(def hasCounterparty
  {:db/ident :fibo-bp-iss-pmbs/hasCounterparty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/TranchedMBSDealTransaction,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has counterparty"},
   :rdfs/range :fibo-bp-iss-pmbs/PrimaryInvestor})

(def hasPrimaryHolder
  {:db/ident :fibo-bp-iss-pmbs/hasPrimaryHolder,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/TranchedMBSInstrument,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has primary holder"},
   :rdfs/range :fibo-bp-iss-pmbs/PrimaryInvestor})

(def hasPrincipalParty
  {:db/ident :fibo-bp-iss-pmbs/hasPrincipalParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/TranchedMBSDealTransaction,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has principal party"},
   :rdfs/range :fibo-sec-dbt-mbs/NonAgencyMBSIssuer})

(def hasResource
  {:db/ident :fibo-bp-iss-pmbs/hasResource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/GetCommitmentFromInvestors,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has resource"},
   :rdfs/range :fibo-bp-iss-pmbs/DraftTrancheNotesParameters})

(def hasResource_1
  {:db/ident :fibo-bp-iss-pmbs/hasResource.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/MarketIssueToPrimaryInvestors,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has resource"},
   :rdfs/range :fibo-bp-iss-pmbs/TranchedOfferingMemorandum})

(def hasResource_2
  {:db/ident :fibo-bp-iss-pmbs/hasResource.2,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/GetCommitmentFromInvestors,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has resource"},
   :rdfs/range :fibo-bp-iss-pmbs/DraftTrancheNotesParameters})

(def hasTrustee
  {:db/ident :fibo-bp-iss-pmbs/hasTrustee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/NonAgencyMortgagePool,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has trustee"},
   :rdfs/range :fibo-bp-iss-pmbs/PoolTrustee})

(def identifierIssuedBy
  {:db/ident :fibo-bp-iss-pmbs/identifierIssuedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/TranchedMBSInstrument,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "identifier issued by"},
   :rdfs/range :fibo-bp-iss-prc/PrimaryIdentifierIssuer})

(def includesDetailsAbout
  {:db/ident :fibo-bp-iss-pmbs/includesDetailsAbout,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/TranchedOfferingMemorandum,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "includes details about"},
   :rdfs/range :fibo-bp-iss-pmbs/TrancheStructureAndTermsheet})

(def includesDetailsAbout_1
  {:db/ident :fibo-bp-iss-pmbs/includesDetailsAbout.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/TranchedOfferingMemorandum,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "includes details about"},
   :rdfs/range :fibo-bp-iss-pmbs/IndividualTrancheDefinitions})

(def isAssessmentOf
  {:db/ident :fibo-bp-iss-pmbs/isAssessmentOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/AssessPoolSuitabilityForIssuance,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is assessment of"},
   :rdfs/range :fibo-bp-iss-pmbs/InAssemblyMortgagePool})

(def isDefiningOf
  {:db/ident :fibo-bp-iss-pmbs/isDefiningOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/DefinePoolCharacteristics,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "isDefiningOf"},
   :rdfs/range :fibo-bp-iss-pmbs/NotYetIssuedNonAgencyMortgagePool})

(def isIssueOf
  {:db/ident :fibo-bp-iss-pmbs/isIssueOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/MakeSecuritiesAvailableInMarket,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is issue of"},
   :rdfs/range :fibo-sec-dbt-cdo/TranchedMBSDeal})

(def isPurchaseOf
  {:db/ident :fibo-bp-iss-pmbs/isPurchaseOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/PurchaseMortgageIntoPool,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is purchase of"},
   :rdfs/range :fibo-loan-reln-mtg/Mortgage})

(def maximumAmount
  {:db/ident :fibo-bp-iss-pmbs/maximumAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/TrancheNotesParameters,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "maximum amount"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "This has not been seen - incliuded as it's implicit but we might want to get rid of this. ACTION: Look at example prospectus document, mark up against this model; if this item is not seen, we could remove it"}})

(def mayBecome
  {:db/ident :fibo-bp-iss-pmbs/mayBecome,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/PoolTrustee,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "may become"},
   :rdfs/range :fibo-sec-sec-iss/SecurityUnderwriter})

(def mayIncludeDetailsAbout
  {:db/ident :fibo-bp-iss-pmbs/mayIncludeDetailsAbout,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/TranchedOfferingMemorandum,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "may include details about"},
   :rdfs/range :fibo-bp-iss-pmbs/DraftTrancheNotesParameters})

(def minimumDenomination
  {:db/ident :fibo-bp-iss-pmbs/minimumDenomination,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/TrancheNotesParameters,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "minimum denomination"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount})

(def refersTo
  {:db/ident :fibo-bp-iss-pmbs/refersTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/IdentifyConformingMortgage,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "refers to"},
   :rdfs/range :fibo-loan-reln-mtg/Mortgage})

(def requires
  {:db/ident :fibo-bp-iss-pmbs/requires,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/DrawUpTrancheTermsheets,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "requires"},
   :rdfs/range :fibo-sec-dbt-mbs/NonAgencyMortgagePool})

(def requires_1
  {:db/ident :fibo-bp-iss-pmbs/requires.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/MakeSecuritiesAvailableInMarket,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "requires"},
   :rdfs/range :fibo-sec-dbt-cdo/TranchedMBSDealProspectus})

(def resultsIn
  {:db/ident :fibo-bp-iss-pmbs/resultsIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/CloseDeal,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "results in"},
   :rdfs/range :fibo-bp-iss-pmbs/TranchedMBSDealTransaction})

(def resultsIn_1
  {:db/ident :fibo-bp-iss-pmbs/resultsIn.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/DefineNotesParameters,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "results in"},
   :rdfs/range :fibo-bp-iss-pmbs/DraftTrancheNotesParameters})

(def resultsIn_2
  {:db/ident :fibo-bp-iss-pmbs/resultsIn.2,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/FinalizeProspectus,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "results in"},
   :rdfs/range :fibo-sec-dbt-cdo/TranchedMBSDealProspectus})

(def resultsInPublicationOf
  {:db/ident :fibo-bp-iss-pmbs/resultsInPublicationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/CloseDeal,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "results in publication of"},
   :rdfs/range :fibo-bp-iss-pmbs/RemittanceReport})

(def urn:uuid:f917ca49-9688-5318-8afd-f35878652516
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcterms/abstract
   "Process ontology for the process of issuance (securitization) of mortgage backed securities by commercial institutions rather than by government agencies.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/LOAN/RealEstateLoans/MortgageLoans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/LOAN/LoansGeneral/Loans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/Bonds/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/DebtIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/MBSIssuance/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/Lifecycles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/PoolBackedSecurities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/TransactionsExt/REATransactions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/AgentsAndPeople/Agents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/TransactionsExt/SecuritiesTransactions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/SecuritiesIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/IssuanceDocuments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/AgencyMBSIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/IssuanceProcess/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/MortgageBackedSecurities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/CollateralizedDebtObligations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/Reporting/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PrivateLabelMBSIssuance"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"})