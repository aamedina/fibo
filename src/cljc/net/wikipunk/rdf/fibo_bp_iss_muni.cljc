(ns net.wikipunk.rdf.fibo-bp-iss-muni
  "Ontology for the process in which municipal bonds are issued."
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :dcterms/abstract
   "Ontology for the process in which municipal bonds are issued.",
   :dcterms/license {:rdfa/uri "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/DebtIssuance/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/DebtInstruments/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/IssuanceProcess/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Agreements/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/Process/FinancialContextAndProcess/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIssuance/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/IssuanceDocuments/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/DatesAndTimes/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/MuniIssuance/"},
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
   :rdfs/label #xsd/langString "MuniIssuance@en"})

(def AnnounceSecuritiesIssue
  "announce securities issue"
  {:db/ident :fibo-bp-iss-muni/AnnounceSecuritiesIssue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "announce securities issue@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-bp-iss-muni/announcesIssueOf,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-bp-iss-dbti/announces,
                      :owl/someValuesFrom :fibo-sec-sec-iss/SecuritiesOffering,
                      :rdf/type           :owl/Restriction}]})

(def BondCounsel
  "bond counsel"
  {:db/ident :fibo-bp-iss-muni/BondCounsel,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "bond counsel@en",
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/isBondCounsel,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/DebtUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def Correspondent
  "A bank, brokerage or other financial institution that is not a direct DTC member. Correspondents rely on direct DTC Participants to perform their DTC settlement services"
  {:db/ident :fibo-bp-iss-muni/Correspondent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "correspondent@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/participatesIn,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-muni/MuniIssuanceProcessParticipant
                     :fibo-bp-iss-muni/IssuanceProcessParticipant
                     :fibo-bp-iss-muni/ProcessParticipant],
   :skos/definition
   #xsd/langString
    "A bank, brokerage or other financial institution that is not a direct DTC member. Correspondents rely on direct DTC Participants to perform their DTC settlement services@en"})

(def DTCCMember
  "A firm which is a member of DTCC. Note: this Actor may perform any of the Roles described elsewhere in this Issuance model, i.e. the DTCC Member may also be any of the Actors defined. REVIEW: does this apply to ALL the defined Actor types?"
  {:db/ident :fibo-bp-iss-muni/DTCCMember,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "d t c c member@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/participatesIn,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-muni/MuniIssuanceProcessParticipant
                     :fibo-bp-iss-muni/IssuanceProcessParticipant
                     :fibo-bp-iss-muni/ProcessParticipant],
   :skos/definition
   #xsd/langString
    "A firm which is a member of DTCC. Note: this Actor may perform any of the Roles described elsewhere in this Issuance model, i.e. the DTCC Member may also be any of the Actors defined. REVIEW: does this apply to ALL the defined Actor types?@en"})

(def DebtAuctionProcess
  "debt auction process"
  {:db/ident :fibo-bp-iss-muni/DebtAuctionProcess,
   :owl/disjointWith :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "debt auction process@en",
   :rdfs/subClassOf :fibo-bp-iss-prc/SecuritiesIssuanceProcess})

(def DebtIssueOverAllotmentTerms
  "Terms for Change to an Issue Amount for Debt securities"
  {:db/ident :fibo-bp-iss-muni/DebtIssueOverAllotmentTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "debt issue over allotment terms@en",
   :rdfs/subClassOf [:fibo-bp-iss-muni/IssueOverAllotmentTerms
                     :fibo-bp-iss-doc/OfferingDocumentTerms
                     {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onClass :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty
                      :fibo-bp-iss-muni/maximumOverAllotmentAmount,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "Terms for Change to an Issue Amount for Debt securities@en"})

(def DebtUnderwritingClosing
  "debt underwriting closing"
  {:db/ident :fibo-bp-iss-muni/DebtUnderwritingClosing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "debt underwriting closing@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/refersTo,
                      :owl/someValuesFrom
                      :fibo-bp-iss-dbti/UnderwriterTakedownForDebt,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-muni/UnderwritingIssuanceClosing
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
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "debt underwriting issuance process@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-bp-iss-muni/step,
     :owl/someValuesFrom :fibo-sec-dbt-dbti/DebtOffering,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasBondCounsel,
     :owl/someValuesFrom :fibo-bp-iss-muni/BondCounsel,
     :rdf/type           :owl/Restriction}
    :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess
    {:owl/onProperty     :fibo-bp-iss-muni/hasRemarketingAgent,
     :owl/someValuesFrom :fibo-bp-iss-muni/RemarketingAgent,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasTransferAgent,
     :owl/someValuesFrom :fibo-bp-iss-muni/TransferAgent,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasSubscriber,
     :owl/someValuesFrom :fibo-bp-iss-prc/Subscriber,
     :rdf/type           :owl/Restriction}
    :fibo-bp-iss-prc/SecuritiesIssuanceProcess
    {:owl/onProperty     :fibo-bp-iss-muni/underwrittenBy,
     :owl/someValuesFrom :fibo-bp-iss-muni/PotentialMuniUnderwriter,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasPrinter,
     :owl/someValuesFrom :fibo-bp-iss-muni/IssuancePrinter,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasIssuerCounsel,
     :owl/someValuesFrom :fibo-bp-iss-muni/IssuerCounsel,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasPayingAgent,
     :owl/someValuesFrom :fibo-bp-iss-muni/PayingAgent,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasObligor,
     :owl/someValuesFrom :fibo-bp-iss-muni/Obligor,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasServicer,
     :owl/someValuesFrom :fibo-bp-iss-muni/Servicer,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/requestedBy,
     :owl/someValuesFrom :fibo-bp-iss-muni/UnderwritingIssuanceRequestor,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/produces,
     :owl/someValuesFrom :fibo-bp-iss-prc/UnderwritingProcessDetails,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasTrustee,
     :owl/someValuesFrom :fibo-bp-iss-muni/Trustee,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasAgent,
     :owl/someValuesFrom :fibo-bp-iss-muni/IssuanceAgent,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasFinancialAdvisor,
     :owl/someValuesFrom :fibo-bp-iss-muni/IssuanceFinancialAdvisor,
     :rdf/type           :owl/Restriction}]})

(def Dissemination
  "dissemination"
  {:db/ident :fibo-bp-iss-muni/Dissemination,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "dissemination@en",
   :rdfs/subClassOf [:fibo-bp-iss-muni/UnderwritingProcessActivity
                     :fibo-bp-iss-dbti/IssuanceProcessActivity]})

(def DisseminationUnderwriter
  "dissemination underwriter"
  {:db/ident :fibo-bp-iss-muni/DisseminationUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "dissemination underwriter@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-bp-iss-muni/makesDecisionOn,
                      :owl/someValuesFrom :fibo-bp-iss-muni/Dissemination,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-muni/PotentialMuniUnderwriter
                     :fibo-bp-iss-prc/PotentialUnderwriter
                     {:owl/onProperty :fibo-bp-iss-muni/underwrites,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}]})

(def EquityDemutualizationProcess
  "equity demutualization process"
  {:db/ident :fibo-bp-iss-muni/EquityDemutualizationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "equity demutualization process@en",
   :rdfs/subClassOf :fibo-bp-iss-prc/SecuritiesIssuanceProcess})

(def EquityIPOProcess
  "equity i p o process"
  {:db/ident :fibo-bp-iss-muni/EquityIPOProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "equity i p o process@en",
   :rdfs/subClassOf [:fibo-bp-iss-muni/RegisteredSecurityIssuanceProcess
                     :fibo-bp-iss-prc/SecuritiesIssuanceProcess
                     {:owl/onProperty     :fibo-bp-iss-muni/includesStep,
                      :owl/someValuesFrom :fibo-bp-iss-muni/Registration,
                      :rdf/type           :owl/Restriction}]})

(def EquityUnderwritingIssuanceProcess
  "equity underwriting issuance process"
  {:db/ident :fibo-bp-iss-muni/EquityUnderwritingIssuanceProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "equity underwriting issuance process@en",
   :rdfs/subClassOf [:fibo-bp-iss-muni/RegisteredSecurityIssuanceProcess
                     :fibo-bp-iss-prc/SecuritiesIssuanceProcess
                     {:owl/onProperty     :fibo-bp-iss-muni/includesStep,
                      :owl/someValuesFrom :fibo-bp-iss-muni/Registration,
                      :rdf/type           :owl/Restriction}]})

(def IssuanceAgent
  "issuance agent"
  {:db/ident :fibo-bp-iss-muni/IssuanceAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "issuance agent@en",
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/isAgentIn,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def IssuanceClosing
  "The process of crediting the DTC participant account on settlement date with the position for the new issue. The overall closing process includes the exchange of funds that happens outside of DTC."
  {:db/ident :fibo-bp-iss-muni/IssuanceClosing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "issuance closing@en",
   :rdfs/subClassOf :fibo-bp-iss-dbti/IssuanceProcessActivity,
   :skos/definition
   #xsd/langString
    "The process of crediting the DTC participant account on settlement date with the position for the new issue. The overall closing process includes the exchange of funds that happens outside of DTC.@en"})

(def IssuanceCreditingParticipant
  "issuance crediting participant"
  {:db/ident :fibo-bp-iss-muni/IssuanceCreditingParticipant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "issuance crediting participant@en",
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/isCreditingParticipant,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def IssuanceFinancialAdvisor
  "issuance financial advisor"
  {:db/ident :fibo-bp-iss-muni/IssuanceFinancialAdvisor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "issuance financial advisor@en",
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/advises,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def IssuancePrinter
  "issuance printer"
  {:db/ident :fibo-bp-iss-muni/IssuancePrinter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "issuance printer@en",
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/prints,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def IssuanceProcessParticipant
  "issuance process participant"
  {:db/ident :fibo-bp-iss-muni/IssuanceProcessParticipant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "issuance process participant@en",
   :rdfs/subClassOf :fibo-bp-iss-muni/ProcessParticipant})

(def IssuanceSettlement
  "issuance settlement"
  {:db/ident :fibo-bp-iss-muni/IssuanceSettlement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "issuance settlement@en",
   :rdfs/subClassOf :fibo-bp-iss-dbti/IssuanceProcessActivity})

(def IssueOverAllotmentTerms
  "Terms for Change to an Issue Amount. A provision in an underwriting agreement, which allows members of the underwriting syndicate to purchase additional shares at the original price."
  {:cmns-av/explanatoryNote
   #xsd/langString
    "Also known as a green shoe. Note that this set of terms does not refer to over-allotment as change to a the total issue amount issued to an individual investor. That would require separate but similar terms. FIBIM has \"Over Allotment Amount\" as an individual term.@en",
   :db/ident :fibo-bp-iss-muni/IssueOverAllotmentTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "issue over allotment terms@en",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onClass :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty
                      :fibo-bp-iss-muni/maximumOverAllotmentAmount,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-doc/OfferingDocumentTerms],
   :skos/definition
   #xsd/langString
    "Terms for Change to an Issue Amount. A provision in an underwriting agreement, which allows members of the underwriting syndicate to purchase additional shares at the original price.@en"})

(def IssuerCounsel
  "issuer counsel"
  {:db/ident :fibo-bp-iss-muni/IssuerCounsel,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "issuer counsel@en",
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/isIssuerCounsel,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def MuniDebtOffering
  "The process step of offering a Municipal Debt security for issue."
  {:db/ident :fibo-bp-iss-muni/MuniDebtOffering,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "muni debt offering@en",
   :rdfs/subClassOf :fibo-sec-dbt-dbti/DebtOffering,
   :skos/definition
   #xsd/langString
    "The process step of offering a Municipal Debt security for issue.@en"})

(def MuniIssuanceProcessParticipant
  "muni issuance process participant"
  {:db/ident :fibo-bp-iss-muni/MuniIssuanceProcessParticipant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "muni issuance process participant@en",
   :rdfs/subClassOf [:fibo-bp-iss-muni/IssuanceProcessParticipant
                     :fibo-bp-iss-muni/ProcessParticipant]})

(def Obligor
  "obligor"
  {:db/ident :fibo-bp-iss-muni/Obligor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "obligor@en",
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/obligorTo,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def PayingAgent
  "paying agent"
  {:db/ident :fibo-bp-iss-muni/PayingAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "paying agent@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/facilitatesPayment,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-muni/IssuanceAgent
                     {:owl/onProperty :fibo-bp-iss-muni/isAgentIn,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}]})

(def PotentialMuniUnderwriter
  "An intermediary between an issuer of a security and the investing public. An underwriter can either be DTC Participant or Correspondent who would clear the underwriting deal using the Crediting Participant."
  {:db/ident :fibo-bp-iss-muni/PotentialMuniUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "potential muni underwriter@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/underwrites,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-prc/PotentialUnderwriter],
   :skos/definition
   #xsd/langString
    "An intermediary between an issuer of a security and the investing public. An underwriter can either be DTC Participant or Correspondent who would clear the underwriting deal using the Crediting Participant.@en"})

(def PrivatePlacement
  "private placement"
  {:db/ident :fibo-bp-iss-muni/PrivatePlacement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "private placement@en",
   :rdfs/subClassOf :fibo-bp-iss-prc/SecuritiesIssuanceProcess})

(def ProcessParticipant
  "process participant"
  {:db/ident :fibo-bp-iss-muni/ProcessParticipant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "process participant@en"})

(def RegisteredSecurityIssuanceProcess
  "registered security issuance process"
  {:db/ident :fibo-bp-iss-muni/RegisteredSecurityIssuanceProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "registered security issuance process@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-bp-iss-muni/includesStep,
                      :owl/someValuesFrom :fibo-bp-iss-muni/Registration,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-prc/SecuritiesIssuanceProcess]})

(def Registration
  "registration"
  {:db/ident :fibo-bp-iss-muni/Registration,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "registration@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-bp-iss-muni/registeredUnder,
                      :owl/someValuesFrom :fibo-fnd-law-jur/Jurisdiction,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-dbti/IssuanceProcessActivity]})

(def RemarketingAgent
  "remarketing agent"
  {:db/ident :fibo-bp-iss-muni/RemarketingAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "remarketing agent@en",
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/facililtatesRemarketing,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def SecuritiesIssuanceContext
  "securities issuance context"
  {:db/ident :fibo-bp-iss-muni/SecuritiesIssuanceContext,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "securities issuance context@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-prc-fcp/PrimaryMarket]})

(def SecuritiesUnderwritingIssuance
  "Underwriting, as a method of Securities Issuance."
  {:db/ident :fibo-bp-iss-muni/SecuritiesUnderwritingIssuance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "securities underwriting issuance@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-muni/SecuritiesIssuanceContext
                     :fibo-bp-prc-fcp/PrimaryMarket
                     {:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}],
   :skos/definition #xsd/langString
                     "Underwriting, as a method of Securities Issuance.@en"})

(def SecuritiesUnderwritingIssuanceProcess
  "The process by which debt instruments are offered to the market by a syndicate of underwriters who underwrite the issue."
  {:db/ident :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "securities underwriting issuance process@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-bp-iss-muni/requestedBy,
     :owl/someValuesFrom :fibo-bp-iss-muni/UnderwritingIssuanceRequestor,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasFinancialAdvisor,
     :owl/someValuesFrom :fibo-bp-iss-muni/IssuanceFinancialAdvisor,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasAgent,
     :owl/someValuesFrom :fibo-bp-iss-muni/IssuanceAgent,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasTransferAgent,
     :owl/someValuesFrom :fibo-bp-iss-muni/TransferAgent,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasTrustee,
     :owl/someValuesFrom :fibo-bp-iss-muni/Trustee,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasServicer,
     :owl/someValuesFrom :fibo-bp-iss-muni/Servicer,
     :rdf/type           :owl/Restriction}
    :fibo-bp-iss-prc/SecuritiesIssuanceProcess
    {:owl/onProperty     :fibo-bp-iss-muni/hasPayingAgent,
     :owl/someValuesFrom :fibo-bp-iss-muni/PayingAgent,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/underwrittenBy,
     :owl/someValuesFrom :fibo-bp-iss-muni/PotentialMuniUnderwriter,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasObligor,
     :owl/someValuesFrom :fibo-bp-iss-muni/Obligor,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasIssuerCounsel,
     :owl/someValuesFrom :fibo-bp-iss-muni/IssuerCounsel,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/produces,
     :owl/someValuesFrom :fibo-bp-iss-prc/UnderwritingProcessDetails,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasSubscriber,
     :owl/someValuesFrom :fibo-bp-iss-prc/Subscriber,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasRemarketingAgent,
     :owl/someValuesFrom :fibo-bp-iss-muni/RemarketingAgent,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasPrinter,
     :owl/someValuesFrom :fibo-bp-iss-muni/IssuancePrinter,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "The process by which debt instruments are offered to the market by a syndicate of underwriters who underwrite the issue.@en"})

(def Servicer
  "servicer"
  {:db/ident :fibo-bp-iss-muni/Servicer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "servicer@en",
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/services,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def TransferAgent
  "transfer agent"
  {:db/ident :fibo-bp-iss-muni/TransferAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "transfer agent@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/facilitatesTransfer,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-muni/IssuanceAgent
                     {:owl/onProperty :fibo-bp-iss-muni/isAgentIn,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}]})

(def Trustee
  "trustee"
  {:db/ident :fibo-bp-iss-muni/Trustee,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "trustee@en",
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/isTrustee,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def UnderwritingIssuanceClosing
  "underwriting issuance closing"
  {:db/ident :fibo-bp-iss-muni/UnderwritingIssuanceClosing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "underwriting issuance closing@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-bp-iss-muni/refersTo,
                      :owl/someValuesFrom :fibo-bp-iss-prc/UnderwriterTakedown,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-muni/IssuanceClosing
                     :fibo-bp-iss-dbti/IssuanceProcessActivity]})

(def UnderwritingIssuanceRequestor
  "underwriting issuance requestor"
  {:db/ident :fibo-bp-iss-muni/UnderwritingIssuanceRequestor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "underwriting issuance requestor@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/requests,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-prc/PotentialIssuer]})

(def UnderwritingProcessActivity
  "underwriting process activity"
  {:db/ident :fibo-bp-iss-muni/UnderwritingProcessActivity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "underwriting process activity@en",
   :rdfs/subClassOf :fibo-bp-iss-dbti/IssuanceProcessActivity})

(def UnderwritingProcessActor
  "any actor within the DTYCC Underwriting Process or any other Underwriting Process. Note: At present all these Actors (e.g. Underwriter) are defined simply as Process Actors and not as specializations of this type of Actor. Therefore this Actor is a Union of all of those."
  {:db/ident :fibo-bp-iss-muni/UnderwritingProcessActor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "underwriting process actor@en",
   :rdfs/subClassOf
   {:owl/onProperty     :fibo-bp-iss-muni/underwritingProcessActorHasIdentity,
    :owl/someValuesFrom {:owl/unionOf [:fibo-bp-iss-muni/Correspondent
                                       :fibo-bp-iss-muni/DTCCMember],
                         :rdf/type    :owl/Class},
    :rdf/type           :owl/Restriction},
   :skos/definition
   #xsd/langString
    "any actor within the DTYCC Underwriting Process or any other Underwriting Process. Note: At present all these Actors (e.g. Underwriter) are defined simply as Process Actors and not as specializations of this type of Actor. Therefore this Actor is a Union of all of those.@en"})

(def actualClosingDate
  "The date in which closing has been done for the underwriter of a security."
  {:db/ident :fibo-bp-iss-muni/actualClosingDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuanceClosing,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "actual closing date@en",
   :rdfs/range :cmns-dt/Date,
   :skos/definition
   #xsd/langString
    "The date in which closing has been done for the underwriter of a security.@en"})

(def advises
  "advises"
  {:db/ident :fibo-bp-iss-muni/advises,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuanceFinancialAdvisor,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "advises@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def announcementComments
  "Free form description of Purpose of Issue, Source of funds etc."
  {:db/ident :fibo-bp-iss-muni/announcementComments,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-muni/AnnounceSecuritiesIssue,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "announcement comments@en",
   :rdfs/range :xsd/string,
   :skos/definition
   #xsd/langString
    "Free form description of Purpose of Issue, Source of funds etc.@en"})

(def announcesIssueOf
  "announces issue of"
  {:db/ident :fibo-bp-iss-muni/announcesIssueOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/AnnounceSecuritiesIssue,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "announces issue of@en",
   :rdfs/range :fibo-fbc-fi-fi/Security})

(def disseminationDecisionDateAndTime
  "Date and Time when the Dissemination Underwriter made the Decision about Dissemination."
  {:db/ident :fibo-bp-iss-muni/disseminationDecisionDateAndTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/Dissemination,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "dissemination decision date and time@en",
   :rdfs/range :cmns-dt/DateTime,
   :skos/definition
   #xsd/langString
    "Date and Time when the Dissemination Underwriter made the Decision about Dissemination.@en"})

(def facililtatesRemarketing
  "facililtates remarketing"
  {:db/ident :fibo-bp-iss-muni/facililtatesRemarketing,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/RemarketingAgent,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "facililtates remarketing@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def facilitatesPayment
  "facilitates payment"
  {:db/ident :fibo-bp-iss-muni/facilitatesPayment,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/PayingAgent,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "facilitates payment@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def facilitatesTransfer
  "facilitates transfer"
  {:db/ident :fibo-bp-iss-muni/facilitatesTransfer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/TransferAgent,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "facilitates transfer@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def formalAwardDateAndTime
  "Date and time the issuer formally accepts a bid for Competitive Issues or, the Date and Time the Bond Purchase Agreement is executed for Negotiated Issues. Time Zone: Include in date/time data or add a term for it?"
  {:db/ident :fibo-bp-iss-muni/formalAwardDateAndTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-dbti/DebtOffering,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "formal award date and time@en",
   :rdfs/range :cmns-dt/DateTime,
   :skos/definition
   #xsd/langString
    "Date and time the issuer formally accepts a bid for Competitive Issues or, the Date and Time the Bond Purchase Agreement is executed for Negotiated Issues. Time Zone: Include in date/time data or add a term for it?@en"})

(def givesRiseTo
  "gives rise to"
  {:db/ident :fibo-bp-iss-muni/givesRiseTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label "gives rise to"})

(def hasAgent
  "has agent"
  {:db/ident :fibo-bp-iss-muni/hasAgent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "has agent@en",
   :rdfs/range :fibo-bp-iss-muni/IssuanceAgent})

(def hasBondCounsel
  "has bond counsel"
  {:db/ident :fibo-bp-iss-muni/hasBondCounsel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/DebtUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "has bond counsel@en",
   :rdfs/range :fibo-bp-iss-muni/BondCounsel})

(def hasFinancialAdvisor
  "has financial advisor"
  {:db/ident :fibo-bp-iss-muni/hasFinancialAdvisor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "has financial advisor@en",
   :rdfs/range :fibo-bp-iss-muni/IssuanceFinancialAdvisor})

(def hasIssuanceGuarantor
  "has issuance guarantor"
  {:db/ident :fibo-bp-iss-muni/hasIssuanceGuarantor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label "has issuance guarantor"})

(def hasIssuerCounsel
  "has issuer counsel"
  {:db/ident :fibo-bp-iss-muni/hasIssuerCounsel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "has issuer counsel@en",
   :rdfs/range :fibo-bp-iss-muni/IssuerCounsel})

(def hasObligor
  "has obligor"
  {:db/ident :fibo-bp-iss-muni/hasObligor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "has obligor@en",
   :rdfs/range :fibo-bp-iss-muni/Obligor})

(def hasPayingAgent
  "has paying agent"
  {:db/ident :fibo-bp-iss-muni/hasPayingAgent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "has paying agent@en",
   :rdfs/range :fibo-bp-iss-muni/PayingAgent})

(def hasPotentialIssuer
  "has potential issuer"
  {:db/ident :fibo-bp-iss-muni/hasPotentialIssuer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label "has potential issuer"})

(def hasPrinter
  "has printer"
  {:db/ident :fibo-bp-iss-muni/hasPrinter,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "has printer@en",
   :rdfs/range :fibo-bp-iss-muni/IssuancePrinter})

(def hasRemarketingAgent
  "has remarketing agent"
  {:db/ident :fibo-bp-iss-muni/hasRemarketingAgent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "has remarketing agent@en",
   :rdfs/range :fibo-bp-iss-muni/RemarketingAgent})

(def hasServicer
  "has servicer"
  {:db/ident :fibo-bp-iss-muni/hasServicer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "has servicer@en",
   :rdfs/range :fibo-bp-iss-muni/Servicer})

(def hasSubscriber
  "has subscriber"
  {:db/ident :fibo-bp-iss-muni/hasSubscriber,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "has subscriber@en",
   :rdfs/range :fibo-bp-iss-prc/Subscriber})

(def hasTransferAgent
  "has transfer agent"
  {:db/ident :fibo-bp-iss-muni/hasTransferAgent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "has transfer agent@en",
   :rdfs/range :fibo-bp-iss-muni/TransferAgent})

(def hasTrustee
  "has trustee"
  {:db/ident :fibo-bp-iss-muni/hasTrustee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "has trustee@en",
   :rdfs/range :fibo-bp-iss-muni/Trustee})

(def includesStep
  "includes step"
  {:db/ident :fibo-bp-iss-muni/includesStep,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/RegisteredSecurityIssuanceProcess,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "includes step@en",
   :rdfs/range :fibo-bp-iss-muni/Registration})

(def isAgentIn
  "is agent in"
  {:db/ident :fibo-bp-iss-muni/isAgentIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuanceAgent,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "is agent in@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def isBondCounsel
  "is bond counsel"
  {:db/ident :fibo-bp-iss-muni/isBondCounsel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/BondCounsel,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "is bond counsel@en",
   :rdfs/range :fibo-bp-iss-muni/DebtUnderwritingIssuanceProcess})

(def isCreditingParticipant
  "is crediting participant"
  {:db/ident :fibo-bp-iss-muni/isCreditingParticipant,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuanceCreditingParticipant,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "is crediting participant@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def isIssuerCounsel
  "is issuer counsel"
  {:db/ident :fibo-bp-iss-muni/isIssuerCounsel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuerCounsel,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "is issuer counsel@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def isTrustee
  "is trustee"
  {:db/ident :fibo-bp-iss-muni/isTrustee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/Trustee,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "is trustee@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def issuanceSettlementDate
  "Settlement date for the initial Issuance transaction."
  {:db/ident :fibo-bp-iss-muni/issuanceSettlementDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuanceSettlement,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "issuance settlement date@en",
   :rdfs/range :cmns-dt/Date,
   :skos/definition
   #xsd/langString "Settlement date for the initial Issuance transaction.@en"})

(def makesDecisionOn
  "makes decision on"
  {:db/ident :fibo-bp-iss-muni/makesDecisionOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/DisseminationUnderwriter,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "makes decision on@en",
   :rdfs/range :fibo-bp-iss-muni/Dissemination})

(def maximumOverAllotmentAmount
  "The maximum amount that is available as part of providing the over-allotment option."
  {:db/ident :fibo-bp-iss-muni/maximumOverAllotmentAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain [:fibo-bp-iss-muni/IssueOverAllotmentTerms
                 :fibo-bp-iss-muni/DebtIssueOverAllotmentTerms],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "maximum over allotment amount@en",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   #xsd/langString
    "The maximum amount that is available as part of providing the over-allotment option.@en"})

(def maximumOverAllotmentPercentage
  "The percentage that is available as part of providing the over-allotment option."
  {:db/ident :fibo-bp-iss-muni/maximumOverAllotmentPercentage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssueOverAllotmentTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "maximum over allotment percentage@en",
   :rdfs/range :fibo-fnd-utl-alx/Percentage,
   :skos/definition
   #xsd/langString
    "The percentage that is available as part of providing the over-allotment option.@en"})

(def maximumOverAllotmentShares
  "The maximum amount of shares that are available as part of providing the over-allotment option."
  {:db/ident :fibo-bp-iss-muni/maximumOverAllotmentShares,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssueOverAllotmentTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "maximum over allotment shares@en",
   :rdfs/range :xsd/integer,
   :skos/definition
   #xsd/langString
    "The maximum amount of shares that are available as part of providing the over-allotment option.@en"})

(def obligorTo
  "obligor to"
  {:db/ident :fibo-bp-iss-muni/obligorTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/Obligor,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "obligor to@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def offeringRequestor
  "offering requestor"
  {:db/ident :fibo-bp-iss-muni/offeringRequestor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label "offering requestor"})

(def overAllotmentAvailable
  "Whether an over-allotment option is available for the security."
  {:db/ident :fibo-bp-iss-muni/overAllotmentAvailable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssueOverAllotmentTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "over allotment available@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #xsd/langString
    "Whether an over-allotment option is available for the security.@en"})

(def overAllotmentExpiryPeriodDays
  "Number of calendar days after the closing of initial offering for expiry of over-allotment option."
  {:db/ident :fibo-bp-iss-muni/overAllotmentExpiryPeriodDays,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssueOverAllotmentTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "over allotment expiry period days@en",
   :rdfs/range :xsd/integer,
   :skos/definition
   #xsd/langString
    "Number of calendar days after the closing of initial offering for expiry of over-allotment option.@en"})

(def participatesIn
  "participates in"
  {:db/ident :fibo-bp-iss-muni/participatesIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/MuniIssuanceProcessParticipant,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "participates in@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def prints
  "prints"
  {:db/ident :fibo-bp-iss-muni/prints,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuancePrinter,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "prints@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def produces
  "produces"
  {:db/ident :fibo-bp-iss-muni/produces,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "produces@en",
   :rdfs/range :fibo-bp-iss-prc/UnderwritingProcessDetails})

(def refersTo
  "refers to"
  {:db/ident :fibo-bp-iss-muni/refersTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/UnderwritingIssuanceClosing,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "refers to@en",
   :rdfs/range :fibo-bp-iss-prc/UnderwriterTakedown})

(def registeredUnder
  "registered under"
  {:db/ident :fibo-bp-iss-muni/registeredUnder,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/Registration,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "registered under@en",
   :rdfs/range :fibo-fnd-law-jur/Jurisdiction})

(def requestedBy
  "requested by"
  {:db/ident :fibo-bp-iss-muni/requestedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "requested by@en",
   :rdfs/range :fibo-bp-iss-muni/UnderwritingIssuanceRequestor})

(def requests
  "requests"
  {:db/ident :fibo-bp-iss-muni/requests,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/UnderwritingIssuanceRequestor,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "requests@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def saleMethod
  "Sale Method of the security."
  {:db/ident :fibo-bp-iss-muni/saleMethod,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-muni/MuniDebtOffering,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "sale method@en",
   :rdfs/range :xsd/string,
   :skos/definition #xsd/langString "Sale Method of the security.@en"})

(def services
  "services"
  {:db/ident :fibo-bp-iss-muni/services,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/Servicer,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "services@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def step
  "step"
  {:db/ident :fibo-bp-iss-muni/step,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/DebtUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "step@en",
   :rdfs/range :fibo-sec-dbt-dbti/DebtOffering})

(def subscriber_1
  "subscriber"
  {:db/ident :fibo-bp-iss-muni/subscriber.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label "subscriber"})

(def subscribesTo
  "Subscriber responds to marketing / draft propspectus, indicates interest and is allocated shares / debt units based on interest."
  {:db/ident :fibo-bp-iss-muni/subscribesTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/Subscriber,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "subscribes to@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :skos/definition
   #xsd/langString
    "Subscriber responds to marketing / draft propspectus, indicates interest and is allocated shares / debt units based on interest.@en"})

(def subscribesTo_1
  "subscribes to"
  {:db/ident :fibo-bp-iss-muni/subscribesTo.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/Subscriber,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "subscribes to@en",
   :rdfs/range :fibo-bp-iss-prc/SecuritiesIssuanceProcess})

(def underwrites
  "underwrites"
  {:db/ident :fibo-bp-iss-muni/underwrites,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/PotentialMuniUnderwriter,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "underwrites@en",
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def underwritingProcessActorHasIdentity
  "underwriting process actor has identity"
  {:db/ident :fibo-bp-iss-muni/underwritingProcessActorHasIdentity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/UnderwritingProcessActor,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "underwriting process actor has identity@en",
   :rdfs/range {:owl/unionOf [:fibo-bp-iss-muni/Correspondent
                              :fibo-bp-iss-muni/DTCCMember],
                :rdf/type    :owl/Class}})

(def underwrittenBy
  "underwritten by"
  {:db/ident :fibo-bp-iss-muni/underwrittenBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label #xsd/langString "underwritten by@en",
   :rdfs/range :fibo-bp-iss-muni/PotentialMuniUnderwriter})