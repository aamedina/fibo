(ns net.wikipunk.rdf.fibo-bp-iss-muni
  "Ontology for the process in which municipal bonds are issued."
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :dcterms/abstract
   "Ontology for the process in which municipal bonds are issued.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/DebtIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/DebtInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/IssuanceProcess/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Agreements/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/Process/FinancialContextAndProcess/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/IssuanceDocuments/"
    "https://www.omg.org/spec/Commons/DatesAndTimes/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/MuniIssuance/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-bp-iss-dbti"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
    "fibo-bp-iss-doc"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceDocuments/",
    "fibo-bp-iss-muni"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
    "fibo-bp-iss-prc"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
    "fibo-bp-prc-fcp"
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-alx"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-dbt-dbti"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/",
    "fibo-sec-sec-iss"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-bp-iss-muni",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "MuniIssuance@en"})

(def AnnounceSecuritiesIssue
  "announce securities issue"
  {:db/ident :fibo-bp-iss-muni/AnnounceSecuritiesIssue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "announce securities issue@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-bp-iss-muni/announcesIssueOf,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-bp-iss-dbti/announces,
                      :owl/someValuesFrom :fibo-sec-sec-iss/SecuritiesOffering,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-muni/AnnounceSecuritiesIssue]})

(def BondCounsel
  "bond counsel"
  {:db/ident :fibo-bp-iss-muni/BondCounsel,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "bond counsel@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/isBondCounsel,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/DebtUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-muni/BondCounsel]})

(def Correspondent
  "A bank, brokerage or other financial institution that is not a direct DTC member. Correspondents rely on direct DTC Participants to perform their DTC settlement services"
  {:db/ident :fibo-bp-iss-muni/Correspondent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "correspondent@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/participatesIn,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-muni/MuniIssuanceProcessParticipant
                     :fibo-bp-iss-muni/Correspondent
                     :fibo-bp-iss-muni/ProcessParticipant
                     :fibo-bp-iss-muni/IssuanceProcessParticipant],
   :skos/definition
   #voc/lstr
    "A bank, brokerage or other financial institution that is not a direct DTC member. Correspondents rely on direct DTC Participants to perform their DTC settlement services@en"})

(def DTCCMember
  "A firm which is a member of DTCC. Note: this Actor may perform any of the Roles described elsewhere in this Issuance model, i.e. the DTCC Member may also be any of the Actors defined. REVIEW: does this apply to ALL the defined Actor types?"
  {:db/ident :fibo-bp-iss-muni/DTCCMember,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "d t c c member@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/participatesIn,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-muni/MuniIssuanceProcessParticipant
                     :fibo-bp-iss-muni/DTCCMember
                     :fibo-bp-iss-muni/ProcessParticipant
                     :fibo-bp-iss-muni/IssuanceProcessParticipant],
   :skos/definition
   #voc/lstr
    "A firm which is a member of DTCC. Note: this Actor may perform any of the Roles described elsewhere in this Issuance model, i.e. the DTCC Member may also be any of the Actors defined. REVIEW: does this apply to ALL the defined Actor types?@en"})

(def DebtAuctionProcess
  "debt auction process"
  {:db/ident :fibo-bp-iss-muni/DebtAuctionProcess,
   :owl/disjointWith :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "debt auction process@en",
   :rdfs/subClassOf [:fibo-bp-iss-prc/SecuritiesIssuanceProcess
                     :fibo-bp-iss-muni/DebtAuctionProcess]})

(def DebtIssueOverAllotmentTerms
  "Terms for Change to an Issue Amount for Debt securities"
  {:db/ident :fibo-bp-iss-muni/DebtIssueOverAllotmentTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "debt issue over allotment terms@en",
   :rdfs/subClassOf [:fibo-bp-iss-muni/IssueOverAllotmentTerms
                     :fibo-bp-iss-muni/DebtIssueOverAllotmentTerms
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty
                      :fibo-bp-iss-muni/maximumOverAllotmentAmount,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-doc/OfferingDocumentTerms],
   :skos/definition
   #voc/lstr "Terms for Change to an Issue Amount for Debt securities@en"})

(def DebtUnderwritingClosing
  "debt underwriting closing"
  {:db/ident :fibo-bp-iss-muni/DebtUnderwritingClosing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "debt underwriting closing@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/refersTo,
                      :owl/someValuesFrom
                      :fibo-bp-iss-dbti/UnderwriterTakedownForDebt,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-muni/UnderwritingIssuanceClosing
                     :fibo-bp-iss-muni/DebtUnderwritingClosing
                     :fibo-bp-iss-muni/IssuanceClosing
                     {:owl/onProperty     :fibo-bp-iss-muni/refersTo,
                      :owl/someValuesFrom :fibo-bp-iss-prc/UnderwriterTakedown,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-dbti/IssuanceProcessActivity]})

(def DebtUnderwritingIssuanceProcess
  "debt underwriting issuance process"
  {:db/ident :fibo-bp-iss-muni/DebtUnderwritingIssuanceProcess,
   :owl/disjointWith :fibo-bp-iss-muni/EquityUnderwritingIssuanceProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "debt underwriting issuance process@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-bp-iss-muni/step,
     :owl/someValuesFrom :fibo-sec-dbt-dbti/DebtOffering,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasBondCounsel,
     :owl/someValuesFrom :fibo-bp-iss-muni/BondCounsel,
     :rdf/type           :owl/Restriction}
    :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess
    :fibo-bp-iss-muni/DebtUnderwritingIssuanceProcess
    {:owl/onProperty     :fibo-bp-iss-muni/hasTransferAgent,
     :owl/someValuesFrom :fibo-bp-iss-muni/TransferAgent,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasTrustee,
     :owl/someValuesFrom :fibo-bp-iss-muni/Trustee,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/produces,
     :owl/someValuesFrom :fibo-bp-iss-prc/UnderwritingProcessDetails,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasAgent,
     :owl/someValuesFrom :fibo-bp-iss-muni/IssuanceAgent,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/requestedBy,
     :owl/someValuesFrom :fibo-bp-iss-muni/UnderwritingIssuanceRequestor,
     :rdf/type           :owl/Restriction}
    :fibo-bp-iss-prc/SecuritiesIssuanceProcess
    {:owl/onProperty     :fibo-bp-iss-muni/underwrittenBy,
     :owl/someValuesFrom :fibo-bp-iss-muni/PotentialMuniUnderwriter,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasObligor,
     :owl/someValuesFrom :fibo-bp-iss-muni/Obligor,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasPayingAgent,
     :owl/someValuesFrom :fibo-bp-iss-muni/PayingAgent,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasIssuerCounsel,
     :owl/someValuesFrom :fibo-bp-iss-muni/IssuerCounsel,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasPrinter,
     :owl/someValuesFrom :fibo-bp-iss-muni/IssuancePrinter,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasServicer,
     :owl/someValuesFrom :fibo-bp-iss-muni/Servicer,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasSubscriber,
     :owl/someValuesFrom :fibo-bp-iss-prc/Subscriber,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasRemarketingAgent,
     :owl/someValuesFrom :fibo-bp-iss-muni/RemarketingAgent,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasFinancialAdvisor,
     :owl/someValuesFrom :fibo-bp-iss-muni/IssuanceFinancialAdvisor,
     :rdf/type           :owl/Restriction}]})

(def Dissemination
  "dissemination"
  {:db/ident :fibo-bp-iss-muni/Dissemination,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "dissemination@en",
   :rdfs/subClassOf [:fibo-bp-iss-muni/UnderwritingProcessActivity
                     :fibo-bp-iss-muni/Dissemination
                     :fibo-bp-iss-dbti/IssuanceProcessActivity]})

(def DisseminationUnderwriter
  "dissemination underwriter"
  {:db/ident :fibo-bp-iss-muni/DisseminationUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "dissemination underwriter@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-bp-iss-muni/makesDecisionOn,
                      :owl/someValuesFrom :fibo-bp-iss-muni/Dissemination,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-muni/PotentialMuniUnderwriter
                     :fibo-bp-iss-muni/DisseminationUnderwriter
                     {:owl/onProperty :fibo-bp-iss-muni/underwrites,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-prc/PotentialUnderwriter]})

(def EquityDemutualizationProcess
  "equity demutualization process"
  {:db/ident :fibo-bp-iss-muni/EquityDemutualizationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "equity demutualization process@en",
   :rdfs/subClassOf [:fibo-bp-iss-prc/SecuritiesIssuanceProcess
                     :fibo-bp-iss-muni/EquityDemutualizationProcess]})

(def EquityIPOProcess
  "equity i p o process"
  {:db/ident :fibo-bp-iss-muni/EquityIPOProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "equity i p o process@en",
   :rdfs/subClassOf [:fibo-bp-iss-muni/RegisteredSecurityIssuanceProcess
                     :fibo-bp-iss-muni/EquityIPOProcess
                     :fibo-bp-iss-prc/SecuritiesIssuanceProcess
                     {:owl/onProperty     :fibo-bp-iss-muni/includesStep,
                      :owl/someValuesFrom :fibo-bp-iss-muni/Registration,
                      :rdf/type           :owl/Restriction}]})

(def EquityUnderwritingIssuanceProcess
  "equity underwriting issuance process"
  {:db/ident :fibo-bp-iss-muni/EquityUnderwritingIssuanceProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "equity underwriting issuance process@en",
   :rdfs/subClassOf [:fibo-bp-iss-muni/RegisteredSecurityIssuanceProcess
                     :fibo-bp-iss-muni/EquityUnderwritingIssuanceProcess
                     :fibo-bp-iss-prc/SecuritiesIssuanceProcess
                     {:owl/onProperty     :fibo-bp-iss-muni/includesStep,
                      :owl/someValuesFrom :fibo-bp-iss-muni/Registration,
                      :rdf/type           :owl/Restriction}]})

(def IssuanceAgent
  "issuance agent"
  {:db/ident :fibo-bp-iss-muni/IssuanceAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "issuance agent@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/isAgentIn,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-muni/IssuanceAgent]})

(def IssuanceClosing
  "The process of crediting the DTC participant account on settlement date with the position for the new issue. The overall closing process includes the exchange of funds that happens outside of DTC."
  {:db/ident :fibo-bp-iss-muni/IssuanceClosing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "issuance closing@en",
   :rdfs/subClassOf [:fibo-bp-iss-dbti/IssuanceProcessActivity
                     :fibo-bp-iss-muni/IssuanceClosing],
   :skos/definition
   #voc/lstr
    "The process of crediting the DTC participant account on settlement date with the position for the new issue. The overall closing process includes the exchange of funds that happens outside of DTC.@en"})

(def IssuanceCreditingParticipant
  "issuance crediting participant"
  {:db/ident :fibo-bp-iss-muni/IssuanceCreditingParticipant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "issuance crediting participant@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/isCreditingParticipant,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-muni/IssuanceCreditingParticipant]})

(def IssuanceFinancialAdvisor
  "issuance financial advisor"
  {:db/ident :fibo-bp-iss-muni/IssuanceFinancialAdvisor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "issuance financial advisor@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/advises,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-muni/IssuanceFinancialAdvisor]})

(def IssuancePrinter
  "issuance printer"
  {:db/ident :fibo-bp-iss-muni/IssuancePrinter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "issuance printer@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/prints,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-muni/IssuancePrinter]})

(def IssuanceProcessParticipant
  "issuance process participant"
  {:db/ident :fibo-bp-iss-muni/IssuanceProcessParticipant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "issuance process participant@en",
   :rdfs/subClassOf [:fibo-bp-iss-muni/ProcessParticipant
                     :fibo-bp-iss-muni/IssuanceProcessParticipant]})

(def IssuanceSettlement
  "issuance settlement"
  {:db/ident :fibo-bp-iss-muni/IssuanceSettlement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "issuance settlement@en",
   :rdfs/subClassOf [:fibo-bp-iss-dbti/IssuanceProcessActivity
                     :fibo-bp-iss-muni/IssuanceSettlement]})

(def IssueOverAllotmentTerms
  "Terms for Change to an Issue Amount. A provision in an underwriting agreement, which allows members of the underwriting syndicate to purchase additional shares at the original price."
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Also known as a green shoe. Note that this set of terms does not refer to over-allotment as change to a the total issue amount issued to an individual investor. That would require separate but similar terms. FIBIM has \"Over Allotment Amount\" as an individual term.@en",
   :db/ident :fibo-bp-iss-muni/IssueOverAllotmentTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "issue over allotment terms@en",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onClass :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty
                      :fibo-bp-iss-muni/maximumOverAllotmentAmount,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-doc/OfferingDocumentTerms
                     :fibo-bp-iss-muni/IssueOverAllotmentTerms],
   :skos/definition
   #voc/lstr
    "Terms for Change to an Issue Amount. A provision in an underwriting agreement, which allows members of the underwriting syndicate to purchase additional shares at the original price.@en"})

(def IssuerCounsel
  "issuer counsel"
  {:db/ident :fibo-bp-iss-muni/IssuerCounsel,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "issuer counsel@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/isIssuerCounsel,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-muni/IssuerCounsel]})

(def MuniDebtOffering
  "The process step of offering a Municipal Debt security for issue."
  {:db/ident :fibo-bp-iss-muni/MuniDebtOffering,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "muni debt offering@en",
   :rdfs/subClassOf [:fibo-sec-dbt-dbti/DebtOffering
                     :fibo-bp-iss-muni/MuniDebtOffering],
   :skos/definition
   #voc/lstr
    "The process step of offering a Municipal Debt security for issue.@en"})

(def MuniIssuanceProcessParticipant
  "muni issuance process participant"
  {:db/ident :fibo-bp-iss-muni/MuniIssuanceProcessParticipant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "muni issuance process participant@en",
   :rdfs/subClassOf [:fibo-bp-iss-muni/IssuanceProcessParticipant
                     :fibo-bp-iss-muni/MuniIssuanceProcessParticipant
                     :fibo-bp-iss-muni/ProcessParticipant]})

(def Obligor
  "obligor"
  {:db/ident :fibo-bp-iss-muni/Obligor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "obligor@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/obligorTo,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-muni/Obligor]})

(def PayingAgent
  "paying agent"
  {:db/ident :fibo-bp-iss-muni/PayingAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "paying agent@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/facilitatesPayment,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-muni/IssuanceAgent
                     :fibo-bp-iss-muni/PayingAgent
                     {:owl/onProperty :fibo-bp-iss-muni/isAgentIn,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}]})

(def PotentialMuniUnderwriter
  "An intermediary between an issuer of a security and the investing public. An underwriter can either be DTC Participant or Correspondent who would clear the underwriting deal using the Crediting Participant."
  {:db/ident :fibo-bp-iss-muni/PotentialMuniUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "potential muni underwriter@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/underwrites,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-prc/PotentialUnderwriter
                     :fibo-bp-iss-muni/PotentialMuniUnderwriter],
   :skos/definition
   #voc/lstr
    "An intermediary between an issuer of a security and the investing public. An underwriter can either be DTC Participant or Correspondent who would clear the underwriting deal using the Crediting Participant.@en"})

(def PrivatePlacement
  "private placement"
  {:db/ident :fibo-bp-iss-muni/PrivatePlacement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "private placement@en",
   :rdfs/subClassOf [:fibo-bp-iss-prc/SecuritiesIssuanceProcess
                     :fibo-bp-iss-muni/PrivatePlacement]})

(def ProcessParticipant
  "process participant"
  {:db/ident :fibo-bp-iss-muni/ProcessParticipant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "process participant@en",
   :rdfs/subClassOf :fibo-bp-iss-muni/ProcessParticipant})

(def RegisteredSecurityIssuanceProcess
  "registered security issuance process"
  {:db/ident :fibo-bp-iss-muni/RegisteredSecurityIssuanceProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "registered security issuance process@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-bp-iss-muni/includesStep,
                      :owl/someValuesFrom :fibo-bp-iss-muni/Registration,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-prc/SecuritiesIssuanceProcess
                     :fibo-bp-iss-muni/RegisteredSecurityIssuanceProcess]})

(def Registration
  "registration"
  {:db/ident :fibo-bp-iss-muni/Registration,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "registration@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-bp-iss-muni/registeredUnder,
                      :owl/someValuesFrom :fibo-fnd-law-jur/Jurisdiction,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-dbti/IssuanceProcessActivity
                     :fibo-bp-iss-muni/Registration]})

(def RemarketingAgent
  "remarketing agent"
  {:db/ident :fibo-bp-iss-muni/RemarketingAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "remarketing agent@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/facililtatesRemarketing,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-muni/RemarketingAgent]})

(def SecuritiesIssuanceContext
  "securities issuance context"
  {:db/ident :fibo-bp-iss-muni/SecuritiesIssuanceContext,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "securities issuance context@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-prc-fcp/PrimaryMarket
                     :fibo-bp-iss-muni/SecuritiesIssuanceContext]})

(def SecuritiesUnderwritingIssuance
  "Underwriting, as a method of Securities Issuance."
  {:db/ident :fibo-bp-iss-muni/SecuritiesUnderwritingIssuance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "securities underwriting issuance@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-muni/SecuritiesIssuanceContext
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuance
                     {:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-prc-fcp/PrimaryMarket],
   :skos/definition #voc/lstr
                     "Underwriting, as a method of Securities Issuance.@en"})

(def SecuritiesUnderwritingIssuanceProcess
  "The process by which debt instruments are offered to the market by a syndicate of underwriters who underwrite the issue."
  {:db/ident :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "securities underwriting issuance process@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-bp-iss-muni/hasServicer,
     :owl/someValuesFrom :fibo-bp-iss-muni/Servicer,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasAgent,
     :owl/someValuesFrom :fibo-bp-iss-muni/IssuanceAgent,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasObligor,
     :owl/someValuesFrom :fibo-bp-iss-muni/Obligor,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/produces,
     :owl/someValuesFrom :fibo-bp-iss-prc/UnderwritingProcessDetails,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasRemarketingAgent,
     :owl/someValuesFrom :fibo-bp-iss-muni/RemarketingAgent,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasTransferAgent,
     :owl/someValuesFrom :fibo-bp-iss-muni/TransferAgent,
     :rdf/type           :owl/Restriction}
    :fibo-bp-iss-prc/SecuritiesIssuanceProcess
    {:owl/onProperty     :fibo-bp-iss-muni/hasIssuerCounsel,
     :owl/someValuesFrom :fibo-bp-iss-muni/IssuerCounsel,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasPayingAgent,
     :owl/someValuesFrom :fibo-bp-iss-muni/PayingAgent,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasPrinter,
     :owl/someValuesFrom :fibo-bp-iss-muni/IssuancePrinter,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/underwrittenBy,
     :owl/someValuesFrom :fibo-bp-iss-muni/PotentialMuniUnderwriter,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasFinancialAdvisor,
     :owl/someValuesFrom :fibo-bp-iss-muni/IssuanceFinancialAdvisor,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasSubscriber,
     :owl/someValuesFrom :fibo-bp-iss-prc/Subscriber,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/requestedBy,
     :owl/someValuesFrom :fibo-bp-iss-muni/UnderwritingIssuanceRequestor,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasTrustee,
     :owl/someValuesFrom :fibo-bp-iss-muni/Trustee,
     :rdf/type           :owl/Restriction}
    :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess],
   :skos/definition
   #voc/lstr
    "The process by which debt instruments are offered to the market by a syndicate of underwriters who underwrite the issue.@en"})

(def Servicer
  "servicer"
  {:db/ident :fibo-bp-iss-muni/Servicer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "servicer@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/services,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-muni/Servicer]})

(def TransferAgent
  "transfer agent"
  {:db/ident :fibo-bp-iss-muni/TransferAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "transfer agent@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/facilitatesTransfer,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-muni/IssuanceAgent
                     :fibo-bp-iss-muni/TransferAgent
                     {:owl/onProperty :fibo-bp-iss-muni/isAgentIn,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}]})

(def Trustee
  "trustee"
  {:db/ident :fibo-bp-iss-muni/Trustee,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "trustee@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/isTrustee,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-muni/Trustee]})

(def UnderwritingIssuanceClosing
  "underwriting issuance closing"
  {:db/ident :fibo-bp-iss-muni/UnderwritingIssuanceClosing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "underwriting issuance closing@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-bp-iss-muni/refersTo,
                      :owl/someValuesFrom :fibo-bp-iss-prc/UnderwriterTakedown,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-muni/IssuanceClosing
                     :fibo-bp-iss-muni/UnderwritingIssuanceClosing
                     :fibo-bp-iss-dbti/IssuanceProcessActivity]})

(def UnderwritingIssuanceRequestor
  "underwriting issuance requestor"
  {:db/ident :fibo-bp-iss-muni/UnderwritingIssuanceRequestor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "underwriting issuance requestor@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/requests,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-prc/PotentialIssuer
                     :fibo-bp-iss-muni/UnderwritingIssuanceRequestor]})

(def UnderwritingProcessActivity
  "underwriting process activity"
  {:db/ident :fibo-bp-iss-muni/UnderwritingProcessActivity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "underwriting process activity@en",
   :rdfs/subClassOf [:fibo-bp-iss-dbti/IssuanceProcessActivity
                     :fibo-bp-iss-muni/UnderwritingProcessActivity]})

(def UnderwritingProcessActor
  "any actor within the DTYCC Underwriting Process or any other Underwriting Process. Note: At present all these Actors (e.g. Underwriter) are defined simply as Process Actors and not as specializations of this type of Actor. Therefore this Actor is a Union of all of those."
  {:db/ident :fibo-bp-iss-muni/UnderwritingProcessActor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "underwriting process actor@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-bp-iss-muni/underwritingProcessActorHasIdentity,
     :owl/someValuesFrom {:owl/unionOf [:fibo-bp-iss-muni/Correspondent
                                        :fibo-bp-iss-muni/DTCCMember],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    :fibo-bp-iss-muni/UnderwritingProcessActor],
   :skos/definition
   #voc/lstr
    "any actor within the DTYCC Underwriting Process or any other Underwriting Process. Note: At present all these Actors (e.g. Underwriter) are defined simply as Process Actors and not as specializations of this type of Actor. Therefore this Actor is a Union of all of those.@en"})

(def actualClosingDate
  "The date in which closing has been done for the underwriter of a security."
  {:db/ident :fibo-bp-iss-muni/actualClosingDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuanceClosing,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "actual closing date@en",
   :rdfs/range :cmns-dt/Date,
   :skos/definition
   #voc/lstr
    "The date in which closing has been done for the underwriter of a security.@en"})

(def advises
  "advises"
  {:db/ident :fibo-bp-iss-muni/advises,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuanceFinancialAdvisor,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "advises@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def announcementComments
  "Free form description of Purpose of Issue, Source of funds etc."
  {:db/ident :fibo-bp-iss-muni/announcementComments,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-muni/AnnounceSecuritiesIssue,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "announcement comments@en",
   :rdfs/range :xsd/string,
   :skos/definition
   #voc/lstr
    "Free form description of Purpose of Issue, Source of funds etc.@en"})

(def announcesIssueOf
  "announces issue of"
  {:db/ident :fibo-bp-iss-muni/announcesIssueOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/AnnounceSecuritiesIssue,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "announces issue of@en",
   :rdfs/range :fibo-fbc-fi-fi/Security})

(def disseminationDecisionDateAndTime
  "Date and Time when the Dissemination Underwriter made the Decision about Dissemination."
  {:db/ident :fibo-bp-iss-muni/disseminationDecisionDateAndTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/Dissemination,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "dissemination decision date and time@en",
   :rdfs/range :cmns-dt/DateTime,
   :skos/definition
   #voc/lstr
    "Date and Time when the Dissemination Underwriter made the Decision about Dissemination.@en"})

(def facililtatesRemarketing
  "facililtates remarketing"
  {:db/ident :fibo-bp-iss-muni/facililtatesRemarketing,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/RemarketingAgent,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "facililtates remarketing@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def facilitatesPayment
  "facilitates payment"
  {:db/ident :fibo-bp-iss-muni/facilitatesPayment,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/PayingAgent,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "facilitates payment@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def facilitatesTransfer
  "facilitates transfer"
  {:db/ident :fibo-bp-iss-muni/facilitatesTransfer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/TransferAgent,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "facilitates transfer@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def formalAwardDateAndTime
  "Date and time the issuer formally accepts a bid for Competitive Issues or, the Date and Time the Bond Purchase Agreement is executed for Negotiated Issues. Time Zone: Include in date/time data or add a term for it?"
  {:db/ident :fibo-bp-iss-muni/formalAwardDateAndTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-dbti/DebtOffering,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "formal award date and time@en",
   :rdfs/range :cmns-dt/DateTime,
   :skos/definition
   #voc/lstr
    "Date and time the issuer formally accepts a bid for Competitive Issues or, the Date and Time the Bond Purchase Agreement is executed for Negotiated Issues. Time Zone: Include in date/time data or add a term for it?@en"})

(def givesRiseTo
  "gives rise to"
  {:db/ident :fibo-bp-iss-muni/givesRiseTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label "gives rise to"})

(def hasAgent
  "has agent"
  {:db/ident :fibo-bp-iss-muni/hasAgent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "has agent@en",
   :rdfs/range :fibo-bp-iss-muni/IssuanceAgent})

(def hasBondCounsel
  "has bond counsel"
  {:db/ident :fibo-bp-iss-muni/hasBondCounsel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/DebtUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "has bond counsel@en",
   :rdfs/range :fibo-bp-iss-muni/BondCounsel})

(def hasFinancialAdvisor
  "has financial advisor"
  {:db/ident :fibo-bp-iss-muni/hasFinancialAdvisor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "has financial advisor@en",
   :rdfs/range :fibo-bp-iss-muni/IssuanceFinancialAdvisor})

(def hasIssuanceGuarantor
  "has issuance guarantor"
  {:db/ident :fibo-bp-iss-muni/hasIssuanceGuarantor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label "has issuance guarantor"})

(def hasIssuerCounsel
  "has issuer counsel"
  {:db/ident :fibo-bp-iss-muni/hasIssuerCounsel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "has issuer counsel@en",
   :rdfs/range :fibo-bp-iss-muni/IssuerCounsel})

(def hasObligor
  "has obligor"
  {:db/ident :fibo-bp-iss-muni/hasObligor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "has obligor@en",
   :rdfs/range :fibo-bp-iss-muni/Obligor})

(def hasPayingAgent
  "has paying agent"
  {:db/ident :fibo-bp-iss-muni/hasPayingAgent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "has paying agent@en",
   :rdfs/range :fibo-bp-iss-muni/PayingAgent})

(def hasPotentialIssuer
  "has potential issuer"
  {:db/ident :fibo-bp-iss-muni/hasPotentialIssuer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label "has potential issuer"})

(def hasPrinter
  "has printer"
  {:db/ident :fibo-bp-iss-muni/hasPrinter,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "has printer@en",
   :rdfs/range :fibo-bp-iss-muni/IssuancePrinter})

(def hasRemarketingAgent
  "has remarketing agent"
  {:db/ident :fibo-bp-iss-muni/hasRemarketingAgent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "has remarketing agent@en",
   :rdfs/range :fibo-bp-iss-muni/RemarketingAgent})

(def hasServicer
  "has servicer"
  {:db/ident :fibo-bp-iss-muni/hasServicer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "has servicer@en",
   :rdfs/range :fibo-bp-iss-muni/Servicer})

(def hasSubscriber
  "has subscriber"
  {:db/ident :fibo-bp-iss-muni/hasSubscriber,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "has subscriber@en",
   :rdfs/range :fibo-bp-iss-prc/Subscriber})

(def hasTransferAgent
  "has transfer agent"
  {:db/ident :fibo-bp-iss-muni/hasTransferAgent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "has transfer agent@en",
   :rdfs/range :fibo-bp-iss-muni/TransferAgent})

(def hasTrustee
  "has trustee"
  {:db/ident :fibo-bp-iss-muni/hasTrustee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "has trustee@en",
   :rdfs/range :fibo-bp-iss-muni/Trustee})

(def includesStep
  "includes step"
  {:db/ident :fibo-bp-iss-muni/includesStep,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/RegisteredSecurityIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "includes step@en",
   :rdfs/range :fibo-bp-iss-muni/Registration})

(def isAgentIn
  "is agent in"
  {:db/ident :fibo-bp-iss-muni/isAgentIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuanceAgent,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "is agent in@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def isBondCounsel
  "is bond counsel"
  {:db/ident :fibo-bp-iss-muni/isBondCounsel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/BondCounsel,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "is bond counsel@en",
   :rdfs/range :fibo-bp-iss-muni/DebtUnderwritingIssuanceProcess})

(def isCreditingParticipant
  "is crediting participant"
  {:db/ident :fibo-bp-iss-muni/isCreditingParticipant,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuanceCreditingParticipant,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "is crediting participant@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def isIssuerCounsel
  "is issuer counsel"
  {:db/ident :fibo-bp-iss-muni/isIssuerCounsel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuerCounsel,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "is issuer counsel@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def isTrustee
  "is trustee"
  {:db/ident :fibo-bp-iss-muni/isTrustee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/Trustee,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "is trustee@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def issuanceSettlementDate
  "Settlement date for the initial Issuance transaction."
  {:db/ident :fibo-bp-iss-muni/issuanceSettlementDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuanceSettlement,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "issuance settlement date@en",
   :rdfs/range :cmns-dt/Date,
   :skos/definition
   #voc/lstr "Settlement date for the initial Issuance transaction.@en"})

(def makesDecisionOn
  "makes decision on"
  {:db/ident :fibo-bp-iss-muni/makesDecisionOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/DisseminationUnderwriter,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "makes decision on@en",
   :rdfs/range :fibo-bp-iss-muni/Dissemination})

(def maximumOverAllotmentAmount
  "The maximum amount that is available as part of providing the over-allotment option."
  {:db/ident :fibo-bp-iss-muni/maximumOverAllotmentAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain [:fibo-bp-iss-muni/IssueOverAllotmentTerms
                 :fibo-bp-iss-muni/DebtIssueOverAllotmentTerms],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "maximum over allotment amount@en",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   #voc/lstr
    "The maximum amount that is available as part of providing the over-allotment option.@en"})

(def maximumOverAllotmentPercentage
  "The percentage that is available as part of providing the over-allotment option."
  {:db/ident :fibo-bp-iss-muni/maximumOverAllotmentPercentage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssueOverAllotmentTerms,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "maximum over allotment percentage@en",
   :rdfs/range :fibo-fnd-utl-alx/Percentage,
   :skos/definition
   #voc/lstr
    "The percentage that is available as part of providing the over-allotment option.@en"})

(def maximumOverAllotmentShares
  "The maximum amount of shares that are available as part of providing the over-allotment option."
  {:db/ident :fibo-bp-iss-muni/maximumOverAllotmentShares,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssueOverAllotmentTerms,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "maximum over allotment shares@en",
   :rdfs/range :xsd/integer,
   :skos/definition
   #voc/lstr
    "The maximum amount of shares that are available as part of providing the over-allotment option.@en"})

(def obligorTo
  "obligor to"
  {:db/ident :fibo-bp-iss-muni/obligorTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/Obligor,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "obligor to@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def offeringRequestor
  "offering requestor"
  {:db/ident :fibo-bp-iss-muni/offeringRequestor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label "offering requestor"})

(def overAllotmentAvailable
  "Whether an over-allotment option is available for the security."
  {:db/ident :fibo-bp-iss-muni/overAllotmentAvailable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssueOverAllotmentTerms,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "over allotment available@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #voc/lstr
    "Whether an over-allotment option is available for the security.@en"})

(def overAllotmentExpiryPeriodDays
  "Number of calendar days after the closing of initial offering for expiry of over-allotment option."
  {:db/ident :fibo-bp-iss-muni/overAllotmentExpiryPeriodDays,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssueOverAllotmentTerms,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "over allotment expiry period days@en",
   :rdfs/range :xsd/integer,
   :skos/definition
   #voc/lstr
    "Number of calendar days after the closing of initial offering for expiry of over-allotment option.@en"})

(def participatesIn
  "participates in"
  {:db/ident :fibo-bp-iss-muni/participatesIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/MuniIssuanceProcessParticipant,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "participates in@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def prints
  "prints"
  {:db/ident :fibo-bp-iss-muni/prints,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuancePrinter,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "prints@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def produces
  "produces"
  {:db/ident :fibo-bp-iss-muni/produces,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "produces@en",
   :rdfs/range :fibo-bp-iss-prc/UnderwritingProcessDetails})

(def refersTo
  "refers to"
  {:db/ident :fibo-bp-iss-muni/refersTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/UnderwritingIssuanceClosing,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "refers to@en",
   :rdfs/range :fibo-bp-iss-prc/UnderwriterTakedown})

(def registeredUnder
  "registered under"
  {:db/ident :fibo-bp-iss-muni/registeredUnder,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/Registration,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "registered under@en",
   :rdfs/range :fibo-fnd-law-jur/Jurisdiction})

(def requestedBy
  "requested by"
  {:db/ident :fibo-bp-iss-muni/requestedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "requested by@en",
   :rdfs/range :fibo-bp-iss-muni/UnderwritingIssuanceRequestor})

(def requests
  "requests"
  {:db/ident :fibo-bp-iss-muni/requests,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/UnderwritingIssuanceRequestor,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "requests@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def saleMethod
  "Sale Method of the security."
  {:db/ident :fibo-bp-iss-muni/saleMethod,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-muni/MuniDebtOffering,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "sale method@en",
   :rdfs/range :xsd/string,
   :skos/definition #voc/lstr "Sale Method of the security.@en"})

(def services
  "services"
  {:db/ident :fibo-bp-iss-muni/services,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/Servicer,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "services@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def step
  "step"
  {:db/ident :fibo-bp-iss-muni/step,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/DebtUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "step@en",
   :rdfs/range :fibo-sec-dbt-dbti/DebtOffering})

(def subscriber.1
  "subscriber"
  {:db/ident :fibo-bp-iss-muni/subscriber.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label "subscriber"})

(def subscribesTo
  "Subscriber responds to marketing / draft propspectus, indicates interest and is allocated shares / debt units based on interest."
  {:db/ident :fibo-bp-iss-muni/subscribesTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/Subscriber,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "subscribes to@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :skos/definition
   #voc/lstr
    "Subscriber responds to marketing / draft propspectus, indicates interest and is allocated shares / debt units based on interest.@en"})

(def subscribesTo.1
  "subscribes to"
  {:db/ident :fibo-bp-iss-muni/subscribesTo.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/Subscriber,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "subscribes to@en",
   :rdfs/range :fibo-bp-iss-prc/SecuritiesIssuanceProcess})

(def underwrites
  "underwrites"
  {:db/ident :fibo-bp-iss-muni/underwrites,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/PotentialMuniUnderwriter,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "underwrites@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def underwritingProcessActorHasIdentity
  "underwriting process actor has identity"
  {:db/ident :fibo-bp-iss-muni/underwritingProcessActorHasIdentity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/UnderwritingProcessActor,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "underwriting process actor has identity@en",
   :rdfs/range {:owl/unionOf [:fibo-bp-iss-muni/Correspondent
                              :fibo-bp-iss-muni/DTCCMember],
                :rdf/type    :owl/Class}})

(def underwrittenBy
  "underwritten by"
  {:db/ident :fibo-bp-iss-muni/underwrittenBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label #voc/lstr "underwritten by@en",
   :rdfs/range :fibo-bp-iss-muni/PotentialMuniUnderwriter})