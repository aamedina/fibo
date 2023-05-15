(ns net.wikipunk.rdf.fibo-bp-iss-pmbs
  "Process ontology for the process of issuance (securitization) of mortgage backed securities by commercial institutions rather than by government agencies."
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :dcterms/abstract
   "Process ontology for the process of issuance (securitization) of mortgage backed securities by commercial institutions rather than by government agencies.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/IssuanceProcess/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/AgencyMBSIssuance/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/Bonds/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/TransactionsExt/REATransactions/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/MortgageBackedSecurities/"
    "https://www.omg.org/spec/Commons/DatesAndTimes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/IssuanceDocuments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Reporting/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/MBSIssuance/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/PoolBackedSecurities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/AgentsAndPeople/Agents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/DebtIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/TransactionsExt/SecuritiesTransactions/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/RealEstateLoans/MortgageLoans/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Lifecycles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansGeneral/Loans/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
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
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-arr-doc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
    "fibo-fnd-arr-lif"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
    "fibo-fnd-arr-rep"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
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
   :rdfa/prefix "fibo-bp-iss-pmbs",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "PrivateLabelMBSIssuance@en"})

(def AllocatePrimaryIdentifier
  "allocate primary identifier"
  {:db/ident :fibo-bp-iss-pmbs/AllocatePrimaryIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "allocate primary identifier@en",
   :rdfs/subClassOf [:fibo-bp-iss-prc/IssuanceProcessActivity
                     :fibo-bp-iss-pmbs/AllocatePrimaryIdentifier]})

(def AllocateRatings
  "allocate ratings"
  {:db/ident :fibo-bp-iss-pmbs/AllocateRatings,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "allocate ratings@en",
   :rdfs/subClassOf [:fibo-bp-iss-prc/IssuanceProcessActivity
                     :fibo-bp-iss-pmbs/AllocateRatings]})

(def AssessPoolSuitabilityForIssuance
  "assess pool suitability for issuance"
  {:db/ident :fibo-bp-iss-pmbs/AssessPoolSuitabilityForIssuance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "assess pool suitability for issuance@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-pmbs/isAssessmentOf,
                      :owl/someValuesFrom
                      :fibo-bp-iss-pmbs/InAssemblyMortgagePool,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProcessActivity
                     :fibo-bp-iss-pmbs/AssessPoolSuitabilityForIssuance]})

(def AssessRatings
  "assess ratings"
  {:db/ident :fibo-bp-iss-pmbs/AssessRatings,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "assess ratings@en",
   :rdfs/subClassOf [:fibo-bp-iss-prc/IssuanceProcessActivity
                     :fibo-bp-iss-pmbs/AssessRatings]})

(def BrokerDealer
  "An entity which may become a primary investor in the issue. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-pmbs/BrokerDealer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "broker dealer@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-pmbs/commitsTo,
                      :owl/someValuesFrom
                      :fibo-bp-iss-pmbs/GetCommitmentFromInvestors,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-pmbs/BrokerDealer],
   :skos/definition
   #voc/lstr
    "An entity which may become a primary investor in the issue. Term origin:MBS PoC Reviews@en"})

(def CloseDeal
  "close deal"
  {:db/ident :fibo-bp-iss-pmbs/CloseDeal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "close deal@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-pmbs/resultsInPublicationOf,
                      :owl/someValuesFrom :fibo-bp-iss-pmbs/RemittanceReport,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-bp-iss-pmbs/resultsIn,
                      :owl/someValuesFrom
                      :fibo-bp-iss-pmbs/TranchedMBSDealTransaction,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProcessActivity
                     :fibo-bp-iss-pmbs/CloseDeal]})

(def DefineNotesParameters
  "the denom of the notes"
  {:db/ident :fibo-bp-iss-pmbs/DefineNotesParameters,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "define notes parameters@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-pmbs/resultsIn.1,
                      :owl/someValuesFrom
                      :fibo-bp-iss-pmbs/DraftTrancheNotesParameters,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProcessActivity
                     :fibo-bp-iss-pmbs/DefineNotesParameters],
   :skos/definition #voc/lstr "the denom of the notes@en"})

(def DefinePoolCharacteristics
  "define pool characteristics"
  {:db/ident :fibo-bp-iss-pmbs/DefinePoolCharacteristics,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "define pool characteristics@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-pmbs/isDefiningOf,
                      :owl/someValuesFrom
                      :fibo-bp-iss-pmbs/NotYetIssuedNonAgencyMortgagePool,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProcessActivity
                     :fibo-bp-iss-pmbs/DefinePoolCharacteristics]})

(def DraftTrancheNotesParameters
  "Draft of set of information defining the notes breakdown of one tranche. covers denominations and amounts that you can byu of the instrument in this tranche. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-pmbs/DraftTrancheNotesParameters,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "draft tranche notes parameters@en",
   :rdfs/subClassOf [:fibo-fnd-arr-doc/Document
                     :fibo-bp-iss-pmbs/DraftTrancheNotesParameters],
   :skos/definition
   #voc/lstr
    "Draft of set of information defining the notes breakdown of one tranche. covers denominations and amounts that you can byu of the instrument in this tranche. Term origin:MBS PoC Reviews@en"})

(def DraftTrancheStructure
  "Draft of set of information defining the tranches in the tranched issue and how these relate to one another. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-pmbs/DraftTrancheStructure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "draft tranche structure@en",
   :rdfs/subClassOf [:fibo-fnd-arr-doc/Document
                     :fibo-bp-iss-pmbs/DraftTrancheStructure],
   :skos/definition
   #voc/lstr
    "Draft of set of information defining the tranches in the tranched issue and how these relate to one another. Term origin:MBS PoC Reviews@en"})

(def DraftTrancheTermsheet
  "Draft of set of information defining one tranche of a tranched issue. This will become the termsheet of an individual tranche within that issue. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-pmbs/DraftTrancheTermsheet,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "draft tranche termsheet@en",
   :rdfs/subClassOf [:fibo-fnd-agr-ctr/TermSheet
                     :fibo-bp-iss-pmbs/DraftTrancheTermsheet],
   :skos/definition
   #voc/lstr
    "Draft of set of information defining one tranche of a tranched issue. This will become the termsheet of an individual tranche within that issue. Term origin:MBS PoC Reviews@en"})

(def DrawUpOfferingMemorandum
  "draw up offering memorandum"
  {:db/ident :fibo-bp-iss-pmbs/DrawUpOfferingMemorandum,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "draw up offering memorandum@en",
   :rdfs/subClassOf [:fibo-bp-iss-prc/IssuanceProcessActivity
                     :fibo-bp-iss-pmbs/DrawUpOfferingMemorandum]})

(def DrawUpTrancheTermsheets
  "draw up tranche termsheets"
  {:db/ident :fibo-bp-iss-pmbs/DrawUpTrancheTermsheets,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "draw up tranche termsheets@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-pmbs/requires,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-mbs/NonAgencyMortgagePool,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProcessActivity
                     :fibo-bp-iss-pmbs/DrawUpTrancheTermsheets]})

(def FinalizePoolContent
  "finalize pool content"
  {:db/ident :fibo-bp-iss-pmbs/FinalizePoolContent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "finalize pool content@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-pmbs/finalizes.1,
                      :owl/someValuesFrom
                      :fibo-bp-iss-pmbs/InIssuanceNonAgencyMortgagePool,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProcessActivity
                     :fibo-bp-iss-pmbs/FinalizePoolContent]})

(def FinalizeProspectus
  "finalize prospectus"
  {:db/ident :fibo-bp-iss-pmbs/FinalizeProspectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "finalize prospectus@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-pmbs/resultsIn.2,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-mbs/TranchedMBSDealProspectus,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProcessActivity
                     :fibo-bp-iss-pmbs/FinalizeProspectus]})

(def GetCommitmentFromInvestors
  "get commitment from investors"
  {:db/ident :fibo-bp-iss-pmbs/GetCommitmentFromInvestors,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "get commitment from investors@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-bp-iss-pmbs/hasResource.2,
     :owl/someValuesFrom :fibo-bp-iss-pmbs/DraftTrancheNotesParameters,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-pmbs/hasResource,
     :owl/someValuesFrom :fibo-bp-iss-pmbs/DraftTrancheNotesParameters,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-pmbs/commitmentBasedOn,
     :owl/someValuesFrom :fibo-bp-iss-pmbs/TranchedDraftProspectus,
     :rdf/type           :owl/Restriction}
    :fibo-bp-iss-prc/IssuanceProcessActivity
    :fibo-bp-iss-pmbs/GetCommitmentFromInvestors]})

(def IdentifyConformingMortgage
  "identify conforming mortgage"
  {:db/ident :fibo-bp-iss-pmbs/IdentifyConformingMortgage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "identify conforming mortgage@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-bp-iss-pmbs/refersTo,
                      :owl/someValuesFrom :fibo-loan-reln-mtg/Mortgage,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProcessActivity
                     :fibo-bp-iss-pmbs/IdentifyConformingMortgage]})

(def IdentifyUnderwriter
  "identify underwriter"
  {:db/ident :fibo-bp-iss-pmbs/IdentifyUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "identify underwriter@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-dbti/resultsIn,
                      :owl/someValuesFrom
                      :fibo-bp-iss-pmbs/PotentialTranchedIssueUnderwriter,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProcessActivity
                     :fibo-bp-iss-pmbs/IdentifyUnderwriter]})

(def InAssemblyMortgagePool
  "in assembly mortgage pool"
  {:db/ident :fibo-bp-iss-pmbs/InAssemblyMortgagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "in assembly mortgage pool@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
                      :owl/someValuesFrom :fibo-bp-iss-dbti/InAssembly,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-mbs/NonAgencyMortgagePool
                     :fibo-bp-iss-pmbs/InAssemblyMortgagePool
                     {:owl/onProperty     :fibo-bp-iss-pmbs/hasTrustee,
                      :owl/someValuesFrom :fibo-bp-iss-pmbs/PoolTrustee,
                      :rdf/type           :owl/Restriction}]})

(def InIssuanceNonAgencyMortgagePool
  "in issuance non agency mortgage pool"
  {:db/ident :fibo-bp-iss-pmbs/InIssuanceNonAgencyMortgagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "in issuance non agency mortgage pool@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
                      :owl/someValuesFrom :fibo-bp-iss-dbti/InIssuance,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-mbs/NonAgencyMortgagePool
                     :fibo-bp-iss-pmbs/InIssuanceNonAgencyMortgagePool
                     {:owl/onProperty     :fibo-bp-iss-pmbs/hasTrustee,
                      :owl/someValuesFrom :fibo-bp-iss-pmbs/PoolTrustee,
                      :rdf/type           :owl/Restriction}]})

(def IndividualTrancheDefinitions
  "In reality there is one termsheet that has sets of information for the terms for each Tranche. This class of information identifies the terms of one tranche, but it does not exist as a separate document in its own right. Further Notes ? We may need to firm up the relationship between the individual tranche termsheet and the information about the relationships among these (some of which are quite complex) and the terms that are common to more than one tranche. In practice these may be separate sections of one document. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-pmbs/IndividualTrancheDefinitions,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "individual tranche definitions@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom :fibo-sec-dbt-bnd/CouponPaymentTerms,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-bnd/BondAmortizationPaymentTerms,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-agr-ctr/TermSheet
                     :fibo-bp-iss-pmbs/TranchedMBSIssueProspectusPart
                     :fibo-bp-iss-pmbs/IndividualTrancheDefinitions
                     :fibo-bp-iss-mbs/ProspectusPart],
   :skos/definition
   #voc/lstr
    "In reality there is one termsheet that has sets of information for the terms for each Tranche. This class of information identifies the terms of one tranche, but it does not exist as a separate document in its own right. Further Notes ? We may need to firm up the relationship between the individual tranche termsheet and the information about the relationships among these (some of which are quite complex) and the terms that are common to more than one tranche. In practice these may be separate sections of one document. Term origin:MBS PoC Reviews@en"})

(def Investor
  "investor"
  {:db/ident :fibo-bp-iss-pmbs/Investor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "investor@en"})

(def MBSSecuritizationEnd
  "m b s securitization end"
  {:db/ident :fibo-bp-iss-pmbs/MBSSecuritizationEnd,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "m b s securitization end@en"})

(def MBSSecuritizationStart
  "m b s securitization start"
  {:db/ident :fibo-bp-iss-pmbs/MBSSecuritizationStart,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "m b s securitization start@en"})

(def MakeSecuritiesAvailableInMarket
  "What happens here? e.g. notices / marketing (phone calls) Structured Finance: There's not really notices in the newspaper, it's a very small market and it's all based on relationships so there's no public notice. So you would get an email from the sales person at the bank who has just closed the deal and is now selling these (this bank is the broker/dealer who bought it?) There's not really much of a secondary market - the initial investors would often hold on to these. There is something around Bloomberg - you can go there and see what's available, if someone has a number of notes from a iven tranche, that they are willing to sell. So there's no transpoarency (!!) Sales would be OTC but less transparent e.g. if you look up a normal OTC stock, you would be able to see more of this information, than in these (non Agency) MBS issues and other SF. DOES THIS APPLY IN ALL MBS??."
  {:db/ident :fibo-bp-iss-pmbs/MakeSecuritiesAvailableInMarket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "make securities available in market@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-pmbs/requires.1,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-mbs/TranchedMBSDealProspectus,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-bp-iss-pmbs/isIssueOf,
                      :owl/someValuesFrom :fibo-sec-dbt-mbs/TranchedMBSDeal,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProcessActivity
                     :fibo-bp-iss-pmbs/MakeSecuritiesAvailableInMarket],
   :skos/definition
   #voc/lstr
    "What happens here? e.g. notices / marketing (phone calls) Structured Finance: There's not really notices in the newspaper, it's a very small market and it's all based on relationships so there's no public notice. So you would get an email from the sales person at the bank who has just closed the deal and is now selling these (this bank is the broker/dealer who bought it?) There's not really much of a secondary market - the initial investors would often hold on to these. There is something around Bloomberg - you can go there and see what's available, if someone has a number of notes from a iven tranche, that they are willing to sell. So there's no transpoarency (!!) Sales would be OTC but less transparent e.g. if you look up a normal OTC stock, you would be able to see more of this information, than in these (non Agency) MBS issues and other SF. DOES THIS APPLY IN ALL MBS??.@en"})

(def MarketIssueToPrimaryInvestors
  "market issue to primary investors"
  {:db/ident :fibo-bp-iss-pmbs/MarketIssueToPrimaryInvestors,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "market issue to primary investors@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-pmbs/hasResource.1,
                      :owl/someValuesFrom
                      :fibo-bp-iss-pmbs/TranchedOfferingMemorandum,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProcessActivity
                     :fibo-bp-iss-pmbs/MarketIssueToPrimaryInvestors]})

(def NonAgencyPoolCreationEnd
  "non agency pool creation end"
  {:db/ident :fibo-bp-iss-pmbs/NonAgencyPoolCreationEnd,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "non agency pool creation end@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-pmbs/flow,
                      :owl/someValuesFrom
                      :fibo-bp-iss-pmbs/MBSSecuritizationStart,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-pmbs/NonAgencyPoolCreationEnd]})

(def NonAgencyPoolCreationProcess
  "non agency pool creation process"
  {:db/ident :fibo-bp-iss-pmbs/NonAgencyPoolCreationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "non agency pool creation process@en",
   :rdfs/subClassOf [:fibo-bp-iss-dbti/RetailAssetPoolCreationProcess
                     :fibo-bp-iss-pmbs/NonAgencyPoolCreationProcess]})

(def NonAgencyPoolCreationStart
  "non agency pool creation start"
  {:db/ident :fibo-bp-iss-pmbs/NonAgencyPoolCreationStart,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "non agency pool creation start@en"})

(def NotYetIssuedNonAgencyMortgagePool
  "not yet issued non agency mortgage pool"
  {:db/ident :fibo-bp-iss-pmbs/NotYetIssuedNonAgencyMortgagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "not yet issued non agency mortgage pool@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
                      :owl/someValuesFrom :fibo-bp-iss-dbti/NotYetIssued,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-mbs/NonAgencyMortgagePool
                     :fibo-bp-iss-pmbs/NotYetIssuedNonAgencyMortgagePool
                     {:owl/onProperty     :fibo-bp-iss-pmbs/hasTrustee,
                      :owl/someValuesFrom :fibo-bp-iss-pmbs/PoolTrustee,
                      :rdf/type           :owl/Restriction}]})

(def NumberingAgency
  "The agency which will provide the primary securitiy identifier for the security. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-pmbs/NumberingAgency,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "numbering agency@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-bp-iss-pmbs/allocatesIdentifier,
     :owl/someValuesFrom :fibo-bp-iss-pmbs/AllocatePrimaryIdentifier,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-ambs/allocatesIdentifier,
     :owl/someValuesFrom :fibo-bp-iss-ambs/AllocatePrimaryIdentifier,
     :rdf/type           :owl/Restriction}
    :fibo-bp-iss-prc/SecuritiesIssuanceProcessActor
    :fibo-bp-iss-pmbs/NumberingAgency],
   :skos/definition
   #voc/lstr
    "The agency which will provide the primary securitiy identifier for the security. Term origin:MBS PoC Reviews@en"})

(def PoolLifecycleStateSelection
  "PoolLifecycleStateSelection"
  {:db/ident :fibo-bp-iss-pmbs/PoolLifecycleStateSelection,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "PoolLifecycleStateSelection@en",
   :rdfs/subClassOf [:fibo-fnd-arr-lif/LifecycleStage
                     :fibo-bp-iss-pmbs/PoolLifecycleStateSelection]})

(def PoolReadyForIssue
  "pool ready for issue"
  {:db/ident :fibo-bp-iss-pmbs/PoolReadyForIssue,
   :owl/equivalentClass {:owl/unionOf
                         [:fibo-bp-iss-pmbs/FinalizePoolContent
                          :fibo-bp-iss-pmbs/IdentifyConformingMortgage],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "pool ready for issue@en"})

(def PoolTrustee
  "pool trustee"
  {:db/ident :fibo-bp-iss-pmbs/PoolTrustee,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "pool trustee@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-pmbs/mayBecome,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-mbs/TranchedMBSIssueUnderwriter,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-pty-pty/PartyInRole
                     :fibo-bp-iss-pmbs/PoolTrustee]})

(def PotentialMBSInvestor
  "potential m b s investor"
  {:db/ident :fibo-bp-iss-pmbs/PotentialMBSInvestor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "potential m b s investor@en"})

(def PotentialNonAgencyMBSIssuer
  "The entity which will become the issuing party for the Tranched MBS Issue. This entity is the principal actor in most of the activities involved in the issue. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-pmbs/PotentialNonAgencyMBSIssuer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "potential non agency m b s issuer@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-rel-rel/evaluates,
     :owl/someValuesFrom :fibo-bp-iss-pmbs/AssessRatings,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/evaluates,
     :owl/someValuesFrom :fibo-bp-iss-pmbs/AssessPoolSuitabilityForIssuance,
     :rdf/type           :owl/Restriction}
    :fibo-bp-iss-dbti/PoolBackedSecuritySecuritizationProcessActor
    :fibo-bp-iss-pmbs/PotentialNonAgencyMBSIssuer],
   :skos/definition
   #voc/lstr
    "The entity which will become the issuing party for the Tranched MBS Issue. This entity is the principal actor in most of the activities involved in the issue. Term origin:MBS PoC Reviews@en"})

(def PotentialTranchedIssueUnderwriter
  "The entity which will become the underwriter for the tranched MBS issue. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-pmbs/PotentialTranchedIssueUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "potential tranched issue underwriter@en",
   :rdfs/subClassOf [:fibo-bp-iss-prc/PotentialUnderwriter
                     :fibo-bp-iss-pmbs/PotentialTranchedIssueUnderwriter],
   :skos/definition
   #voc/lstr
    "The entity which will become the underwriter for the tranched MBS issue. Term origin:MBS PoC Reviews@en"})

(def PrimaryInvestor
  "A party which becomes the primary investor in the issue, by purchasing some of the tranches of the issue. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-pmbs/PrimaryInvestor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "primary investor@en",
   :skos/definition
   #voc/lstr
    "A party which becomes the primary investor in the issue, by purchasing some of the tranches of the issue. Term origin:MBS PoC Reviews@en"})

(def PurchaseMortgageIntoPool
  "purchase mortgage into pool"
  {:db/ident :fibo-bp-iss-pmbs/PurchaseMortgageIntoPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "purchase mortgage into pool@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-bp-iss-pmbs/isPurchaseOf,
                      :owl/someValuesFrom :fibo-loan-reln-mtg/Mortgage,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-bp-iss-pmbs/addsTo,
                      :owl/someValuesFrom
                      :fibo-bp-iss-pmbs/InAssemblyMortgagePool,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProcessActivity
                     :fibo-bp-iss-pmbs/PurchaseMortgageIntoPool]})

(def RatingsAgency
  "ratings agency"
  {:db/ident :fibo-bp-iss-pmbs/RatingsAgency,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "ratings agency@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-bp-iss-pmbs/allocatesRatings,
                      :owl/someValuesFrom :fibo-bp-iss-pmbs/AllocateRatings,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-pmbs/RatingsAgency]})

(def RatingsSuitableForIssue
  "ratings suitable for issue"
  {:db/ident :fibo-bp-iss-pmbs/RatingsSuitableForIssue,
   :owl/equivalentClass {:owl/unionOf
                         [:fibo-bp-iss-pmbs/DrawUpOfferingMemorandum
                          :fibo-bp-iss-pmbs/DrawUpTrancheTermsheets],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "ratings suitable for issue@en"})

(def RegisterSecurity
  "After the deal is closed the security is formally registered with some registraton authority This is the \"official\" bit - there is not a separate \"Issue\" activity which is official ?????"
  {:db/ident :fibo-bp-iss-pmbs/RegisterSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "register security@en",
   :rdfs/subClassOf [:fibo-bp-iss-prc/IssuanceProcessActivity
                     :fibo-bp-iss-pmbs/RegisterSecurity],
   :skos/definition
   #voc/lstr
    "After the deal is closed the security is formally registered with some registraton authority This is the \"official\" bit - there is not a separate \"Issue\" activity which is official ?????@en"})

(def RemittanceReport
  "Report containing a specific and limited set of information about the Deal. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-pmbs/RemittanceReport,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "remittance report@en",
   :rdfs/subClassOf [:fibo-fnd-arr-rep/Report
                     :fibo-bp-iss-pmbs/RemittanceReport],
   :skos/definition
   #voc/lstr
    "Report containing a specific and limited set of information about the Deal. Term origin:MBS PoC Reviews@en"})

(def TrancheNotesParameters
  "One set of information defining the notes breakdown of one tranche. Covers denominations and amounts that you can byu of the instrument in this tranche. Q: Is this really defined in the prospectus? A: yes The prospectus lists the characteristics including e.g. \"The notes will be sold in denominations of X AND Increuemtns of Y e.g. $250 000 incremented by $1000. Parameters include: Denominations Minimum amounts what else? Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-pmbs/TrancheNotesParameters,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "tranche notes parameters@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-doc/isAbout,
                      :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSTrancheNote,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-bp-iss-pmbs/maximumAmount,
                      :rdf/type       :owl/Restriction}
                     :fibo-bp-iss-pmbs/TranchedMBSIssueProspectusPart
                     :fibo-bp-iss-pmbs/TrancheNotesParameters
                     :fibo-bp-iss-mbs/ProspectusPart],
   :skos/definition
   #voc/lstr
    "One set of information defining the notes breakdown of one tranche. Covers denominations and amounts that you can byu of the instrument in this tranche. Q: Is this really defined in the prospectus? A: yes The prospectus lists the characteristics including e.g. \"The notes will be sold in denominations of X AND Increuemtns of Y e.g. $250 000 incremented by $1000. Parameters include: Denominations Minimum amounts what else? Term origin:MBS PoC Reviews@en"})

(def TrancheStructureAndTermsheet
  "The termsheet with the terms for individual tranches is a separate component, known as the Tranche Termsheet or Individual Tranche Definitions. These may in practice be in one sheet or document deliverable but is a set of termsheets defining the terms for the set of tranches. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-pmbs/TrancheStructureAndTermsheet,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "tranche structure and termsheet@en",
   :rdfs/subClassOf [:fibo-bp-iss-pmbs/TranchedMBSIssueProspectusPart
                     :fibo-bp-iss-pmbs/TrancheStructureAndTermsheet
                     :fibo-bp-iss-mbs/ProspectusPart],
   :skos/definition
   [#voc/lstr
     "The termsheet with the terms for individual tranches is a separate component, known as the Tranche Termsheet or Individual Tranche Definitions. These may in practice be in one sheet or document deliverable but is a set of termsheets defining the terms for the set of tranches. Term origin:MBS PoC Reviews@en"
    #voc/lstr "One sheet defining the MBS structure.@en"]})

(def TranchedDraftProspectus
  "The draft prospectus for a tranched Mortgage Backed Securities issue, as determined by the issuing entity prior to marketing the issue. Certain terms in the draft prospectus will be finalized later in the issuance process to become the actual Prospectus. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-pmbs/TranchedDraftProspectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "tranched draft prospectus@en",
   :rdfs/subClassOf [{:owl/onProperty :cmns-dt/precedes,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-mbs/TranchedMBSDealProspectus,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-doc/PreliminaryProspectus
                     :fibo-bp-iss-pmbs/TranchedDraftProspectus],
   :skos/definition
   #voc/lstr
    "The draft prospectus for a tranched Mortgage Backed Securities issue, as determined by the issuing entity prior to marketing the issue. Certain terms in the draft prospectus will be finalized later in the issuance process to become the actual Prospectus. Term origin:MBS PoC Reviews@en"})

(def TranchedMBSDealSettlement
  "tranched m b s deal settlement"
  {:db/ident :fibo-bp-iss-pmbs/TranchedMBSDealSettlement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "tranched m b s deal settlement@en",
   :rdfs/subClassOf
   [{:owl/onProperty :fibo-bp-iss-pmbs/decomposesInto,
     :owl/someValuesFrom
     :fibo-bp-iss-pmbs/TranchedMBSPrimaryDealTransactionSettlementProcess,
     :rdf/type :owl/Restriction}
    :fibo-bp-iss-pmbs/TranchedMBSDealSettlement]})

(def TranchedMBSDealTransaction
  "The deal transaction by which the MBS Issue is issued to primary investors. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-pmbs/TranchedMBSDealTransaction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "tranched m b s deal transaction@en",
   :rdfs/subClassOf
   [{:owl/onProperty :fibo-fnd-txn-sec/follows,
     :owl/someValuesFrom
     :fibo-bp-iss-pmbs/TranchedMBSPrimaryDealTransactionSettlementProcess,
     :rdf/type :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-pmbs/hasCounterparty,
     :owl/someValuesFrom :fibo-bp-iss-pmbs/PrimaryInvestor,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-txn-sec/FinancialPrimaryMarketTransaction
    :fibo-bp-iss-pmbs/TranchedMBSDealTransaction],
   :skos/definition
   #voc/lstr
    "The deal transaction by which the MBS Issue is issued to primary investors. Term origin:MBS PoC Reviews@en"})

(def TranchedMBSIssueProspectusPart
  "A part or section of a prospectus for a tranched mortgage backed securities issue. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-pmbs/TranchedMBSIssueProspectusPart,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "tranched m b s issue prospectus part@en",
   :rdfs/subClassOf [:fibo-bp-iss-mbs/ProspectusPart
                     :fibo-bp-iss-pmbs/TranchedMBSIssueProspectusPart],
   :skos/definition
   #voc/lstr
    "A part or section of a prospectus for a tranched mortgage backed securities issue. Term origin:MBS PoC Reviews@en"})

(def TranchedMBSPrimaryDealTransactionSettlementProcess
  "The process by which the primary deal transaction is settled. Term origin:MBS PoC Reviews"
  {:db/ident
   :fibo-bp-iss-pmbs/TranchedMBSPrimaryDealTransactionSettlementProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr
                "tranched m b s primary deal transaction settlement process@en",
   :rdfs/subClassOf
   [:fibo-fnd-txn-sec/SettlementProcess
    :fibo-bp-iss-pmbs/TranchedMBSPrimaryDealTransactionSettlementProcess],
   :skos/definition
   #voc/lstr
    "The process by which the primary deal transaction is settled. Term origin:MBS PoC Reviews@en"})

(def TranchedMBSProspectusOutline
  "An outline of the tranched prospectus, provind an intial representation of the possible tranches and their features. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-pmbs/TranchedMBSProspectusOutline,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "tranched m b s prospectus outline@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-pmbs/hasContent.1,
                      :owl/someValuesFrom
                      :fibo-bp-iss-pmbs/DraftTrancheTermsheet,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-doc/PreliminaryProspectus
                     :fibo-bp-iss-pmbs/TranchedMBSProspectusOutline],
   :skos/definition
   #voc/lstr
    "An outline of the tranched prospectus, provind an intial representation of the possible tranches and their features. Term origin:MBS PoC Reviews@en"})

(def TranchedMBSSecuritizationProcess
  "tranched m b s securitization process"
  {:db/ident :fibo-bp-iss-pmbs/TranchedMBSSecuritizationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "tranched m b s securitization process@en",
   :rdfs/subClassOf [:fibo-bp-iss-mbs/MBSSecuritizationProcess
                     :fibo-bp-iss-pmbs/TranchedMBSSecuritizationProcess]})

(def TranchedOfferingMemorandum
  "The offering memorandum for a tranched MBS issue, setting out basic information about a future issue, for the information of prospective investors and their agents."
  {:db/ident :fibo-bp-iss-pmbs/TranchedOfferingMemorandum,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "tranched offering memorandum@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-bp-iss-pmbs/includesDetailsAbout.1,
     :owl/someValuesFrom :fibo-bp-iss-pmbs/IndividualTrancheDefinitions,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-pmbs/includesDetailsAbout,
     :owl/someValuesFrom :fibo-bp-iss-pmbs/TrancheStructureAndTermsheet,
     :rdf/type           :owl/Restriction}
    {:owl/maxQualifiedCardinality 1,
     :owl/onClass    :fibo-bp-iss-pmbs/DraftTrancheNotesParameters,
     :owl/onProperty :fibo-bp-iss-pmbs/mayIncludeDetailsAbout,
     :rdf/type       :owl/Restriction}
    :fibo-sec-sec-iss/OfferingDocument
    :fibo-bp-iss-pmbs/TranchedOfferingMemorandum],
   :skos/definition
   [#voc/lstr
     "The offering memorandum for a tranched MBS issue, setting out basic information about a future issue, for the information of prospective investors and their agents.@en"
    #voc/lstr
     "The Offering Memorandum will include or attach the terms for two or more individual tranches that will make up the issue, and the structure of the tranches, including how they will relate to one another (priorities and so on). Term origin:MBS PoC Reviews@en"]})

(def addsTo
  "adds to"
  {:db/ident :fibo-bp-iss-pmbs/addsTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/PurchaseMortgageIntoPool,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "adds to@en",
   :rdfs/range :fibo-bp-iss-pmbs/InAssemblyMortgagePool})

(def allocatesIdentifier
  "allocates identifier"
  {:db/ident :fibo-bp-iss-pmbs/allocatesIdentifier,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/NumberingAgency,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "allocates identifier@en",
   :rdfs/range :fibo-bp-iss-pmbs/AllocatePrimaryIdentifier})

(def allocatesRatings
  "allocates ratings"
  {:db/ident :fibo-bp-iss-pmbs/allocatesRatings,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/RatingsAgency,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "allocates ratings@en",
   :rdfs/range :fibo-bp-iss-pmbs/AllocateRatings})

(def commitmentBasedOn
  "commitment based on"
  {:db/ident :fibo-bp-iss-pmbs/commitmentBasedOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/GetCommitmentFromInvestors,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "commitment based on@en",
   :rdfs/range :fibo-bp-iss-pmbs/TranchedDraftProspectus})

(def commitsTo
  "commits to"
  {:db/ident :fibo-bp-iss-pmbs/commitsTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/BrokerDealer,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "commits to@en",
   :rdfs/range :fibo-bp-iss-pmbs/GetCommitmentFromInvestors})

(def decomposesInto
  "decomposes into"
  {:db/ident :fibo-bp-iss-pmbs/decomposesInto,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/TranchedMBSDealSettlement,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "decomposes into@en",
   :rdfs/range
   :fibo-bp-iss-pmbs/TranchedMBSPrimaryDealTransactionSettlementProcess})

(def denominationIncrement
  "denomination increment"
  {:db/ident :fibo-bp-iss-pmbs/denominationIncrement,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/TrancheNotesParameters,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "denomination increment@en",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount})

(def finalizes.1
  "finalizes"
  {:db/ident :fibo-bp-iss-pmbs/finalizes.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/FinalizePoolContent,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "finalizes@en",
   :rdfs/range :fibo-bp-iss-pmbs/InIssuanceNonAgencyMortgagePool})

(def flow
  "flow"
  {:db/ident :fibo-bp-iss-pmbs/flow,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/NonAgencyPoolCreationEnd,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "flow@en",
   :rdfs/range :fibo-bp-iss-pmbs/MBSSecuritizationStart})

(def hasContent
  "has content"
  {:db/ident :fibo-bp-iss-pmbs/hasContent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/TranchedMBSProspectusOutline,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "has content@en",
   :rdfs/range :fibo-bp-iss-pmbs/DraftTrancheStructure,
   :rdfs/subPropertyOf [:cmns-col/hasPart :fibo-bp-iss-pmbs/hasContent]})

(def hasContent.1
  "has content"
  {:db/ident :fibo-bp-iss-pmbs/hasContent.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/TranchedMBSProspectusOutline,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "has content@en",
   :rdfs/range :fibo-bp-iss-pmbs/DraftTrancheTermsheet,
   :rdfs/subPropertyOf [:cmns-col/hasPart :fibo-bp-iss-pmbs/hasContent.1]})

(def hasCounterparty
  "has counterparty"
  {:db/ident :fibo-bp-iss-pmbs/hasCounterparty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/TranchedMBSDealTransaction,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "has counterparty@en",
   :rdfs/range :fibo-bp-iss-pmbs/PrimaryInvestor})

(def hasPrimaryHolder
  "has primary holder"
  {:db/ident :fibo-bp-iss-pmbs/hasPrimaryHolder,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/TranchedMBSInstrument,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "has primary holder@en",
   :rdfs/range :fibo-bp-iss-pmbs/PrimaryInvestor})

(def hasPrincipalParty
  "has principal party"
  {:db/ident :fibo-bp-iss-pmbs/hasPrincipalParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/TranchedMBSDealTransaction,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "has principal party@en",
   :rdfs/range :fibo-sec-dbt-mbs/NonAgencyMBSIssuer})

(def hasResource
  "has resource"
  {:db/ident :fibo-bp-iss-pmbs/hasResource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/GetCommitmentFromInvestors,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "has resource@en",
   :rdfs/range :fibo-bp-iss-pmbs/DraftTrancheNotesParameters})

(def hasResource.1
  "has resource"
  {:db/ident :fibo-bp-iss-pmbs/hasResource.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/MarketIssueToPrimaryInvestors,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "has resource@en",
   :rdfs/range :fibo-bp-iss-pmbs/TranchedOfferingMemorandum})

(def hasResource.2
  "has resource"
  {:db/ident :fibo-bp-iss-pmbs/hasResource.2,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/GetCommitmentFromInvestors,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "has resource@en",
   :rdfs/range :fibo-bp-iss-pmbs/DraftTrancheNotesParameters})

(def hasTrustee
  "has trustee"
  {:db/ident :fibo-bp-iss-pmbs/hasTrustee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/NonAgencyMortgagePool,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "has trustee@en",
   :rdfs/range :fibo-bp-iss-pmbs/PoolTrustee})

(def identifierIssuedBy
  "identifier issued by"
  {:db/ident :fibo-bp-iss-pmbs/identifierIssuedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/TranchedMBSInstrument,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "identifier issued by@en",
   :rdfs/range :fibo-bp-iss-prc/PrimaryIdentifierIssuer})

(def includesDetailsAbout
  "includes details about"
  {:db/ident :fibo-bp-iss-pmbs/includesDetailsAbout,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/TranchedOfferingMemorandum,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "includes details about@en",
   :rdfs/range :fibo-bp-iss-pmbs/TrancheStructureAndTermsheet})

(def includesDetailsAbout.1
  "includes details about"
  {:db/ident :fibo-bp-iss-pmbs/includesDetailsAbout.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/TranchedOfferingMemorandum,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "includes details about@en",
   :rdfs/range :fibo-bp-iss-pmbs/IndividualTrancheDefinitions})

(def isAssessmentOf
  "is assessment of"
  {:db/ident :fibo-bp-iss-pmbs/isAssessmentOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/AssessPoolSuitabilityForIssuance,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "is assessment of@en",
   :rdfs/range :fibo-bp-iss-pmbs/InAssemblyMortgagePool})

(def isDefiningOf
  "isDefiningOf"
  {:db/ident :fibo-bp-iss-pmbs/isDefiningOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/DefinePoolCharacteristics,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "isDefiningOf@en",
   :rdfs/range :fibo-bp-iss-pmbs/NotYetIssuedNonAgencyMortgagePool})

(def isIssueOf
  "is issue of"
  {:db/ident :fibo-bp-iss-pmbs/isIssueOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/MakeSecuritiesAvailableInMarket,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "is issue of@en",
   :rdfs/range :fibo-sec-dbt-mbs/TranchedMBSDeal})

(def isPurchaseOf
  "is purchase of"
  {:db/ident :fibo-bp-iss-pmbs/isPurchaseOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/PurchaseMortgageIntoPool,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "is purchase of@en",
   :rdfs/range :fibo-loan-reln-mtg/Mortgage})

(def maximumAmount
  "This has not been seen - incliuded as it's implicit but we might want to get rid of this. ACTION: Look at example prospectus document, mark up against this model; if this item is not seen, we could remove it"
  {:db/ident :fibo-bp-iss-pmbs/maximumAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/TrancheNotesParameters,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "maximum amount@en",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   #voc/lstr
    "This has not been seen - incliuded as it's implicit but we might want to get rid of this. ACTION: Look at example prospectus document, mark up against this model; if this item is not seen, we could remove it@en"})

(def mayBecome
  "may become"
  {:db/ident :fibo-bp-iss-pmbs/mayBecome,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/PoolTrustee,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "may become@en",
   :rdfs/range :fibo-sec-dbt-mbs/TranchedMBSIssueUnderwriter})

(def mayIncludeDetailsAbout
  "may include details about"
  {:db/ident :fibo-bp-iss-pmbs/mayIncludeDetailsAbout,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/TranchedOfferingMemorandum,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "may include details about@en",
   :rdfs/range :fibo-bp-iss-pmbs/DraftTrancheNotesParameters})

(def minimumDenomination
  "minimum denomination"
  {:db/ident :fibo-bp-iss-pmbs/minimumDenomination,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/TrancheNotesParameters,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "minimum denomination@en",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount})

(def refersTo
  "refers to"
  {:db/ident :fibo-bp-iss-pmbs/refersTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/IdentifyConformingMortgage,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "refers to@en",
   :rdfs/range :fibo-loan-reln-mtg/Mortgage})

(def requires
  "requires"
  {:db/ident :fibo-bp-iss-pmbs/requires,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/DrawUpTrancheTermsheets,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "requires@en",
   :rdfs/range :fibo-sec-dbt-mbs/NonAgencyMortgagePool})

(def requires.1
  "requires"
  {:db/ident :fibo-bp-iss-pmbs/requires.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/MakeSecuritiesAvailableInMarket,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "requires@en",
   :rdfs/range :fibo-sec-dbt-mbs/TranchedMBSDealProspectus})

(def resultsIn
  "results in"
  {:db/ident :fibo-bp-iss-pmbs/resultsIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/CloseDeal,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "results in@en",
   :rdfs/range :fibo-bp-iss-pmbs/TranchedMBSDealTransaction})

(def resultsIn.1
  "results in"
  {:db/ident :fibo-bp-iss-pmbs/resultsIn.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/DefineNotesParameters,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "results in@en",
   :rdfs/range :fibo-bp-iss-pmbs/DraftTrancheNotesParameters})

(def resultsIn.2
  "results in"
  {:db/ident :fibo-bp-iss-pmbs/resultsIn.2,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/FinalizeProspectus,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "results in@en",
   :rdfs/range :fibo-sec-dbt-mbs/TranchedMBSDealProspectus})

(def resultsInPublicationOf
  "results in publication of"
  {:db/ident :fibo-bp-iss-pmbs/resultsInPublicationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-pmbs/CloseDeal,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfs/label #voc/lstr "results in publication of@en",
   :rdfs/range :fibo-bp-iss-pmbs/RemittanceReport})