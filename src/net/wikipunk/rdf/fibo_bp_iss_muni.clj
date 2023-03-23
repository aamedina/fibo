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
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
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
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/IssuanceDocuments/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/MuniIssuance/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
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
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MuniIssuance"}})

(def AnnounceSecuritiesIssue
  "announce securities issue"
  {:db/ident :fibo-bp-iss-muni/AnnounceSecuritiesIssue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "announce securities issue"},
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
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bond counsel"},
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/isBondCounsel,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/DebtUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def Correspondent
  "A bank, brokerage or other financial institution that is not a direct DTC member. Correspondents rely on direct DTC Participants to perform their DTC settlement services"
  {:db/ident :fibo-bp-iss-muni/Correspondent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "correspondent"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/participatesIn,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-muni/MuniIssuanceProcessParticipant],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A bank, brokerage or other financial institution that is not a direct DTC member. Correspondents rely on direct DTC Participants to perform their DTC settlement services"}})

(def DTCCMember
  "A firm which is a member of DTCC. Note: this Actor may perform any of the Roles described elsewhere in this Issuance model, i.e. the DTCC Member may also be any of the Actors defined. REVIEW: does this apply to ALL the defined Actor types?"
  {:db/ident :fibo-bp-iss-muni/DTCCMember,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "d t c c member"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/participatesIn,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-muni/MuniIssuanceProcessParticipant],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A firm which is a member of DTCC. Note: this Actor may perform any of the Roles described elsewhere in this Issuance model, i.e. the DTCC Member may also be any of the Actors defined. REVIEW: does this apply to ALL the defined Actor types?"}})

(def DebtAuctionProcess
  "debt auction process"
  {:db/ident :fibo-bp-iss-muni/DebtAuctionProcess,
   :owl/disjointWith :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt auction process"},
   :rdfs/subClassOf :fibo-bp-iss-prc/SecuritiesIssuanceProcess})

(def DebtIssueOverAllotmentTerms
  "Terms for Change to an Issue Amount for Debt securities"
  {:db/ident :fibo-bp-iss-muni/DebtIssueOverAllotmentTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt issue over allotment terms"},
   :rdfs/subClassOf :fibo-bp-iss-muni/IssueOverAllotmentTerms,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Terms for Change to an Issue Amount for Debt securities"}})

(def DebtUnderwritingClosing
  "debt underwriting closing"
  {:db/ident :fibo-bp-iss-muni/DebtUnderwritingClosing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt underwriting closing"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/refersTo,
                      :owl/someValuesFrom
                      :fibo-bp-iss-dbti/UnderwriterTakedownForDebt,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-muni/UnderwritingIssuanceClosing]})

(def DebtUnderwritingIssuanceProcess
  "debt underwriting issuance process"
  {:db/ident :fibo-bp-iss-muni/DebtUnderwritingIssuanceProcess,
   :owl/disjointWith :fibo-bp-iss-muni/EquityUnderwritingIssuanceProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt underwriting issuance process"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-bp-iss-muni/step,
                      :owl/someValuesFrom :fibo-sec-dbt-dbti/DebtOffering,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-bp-iss-muni/hasBondCounsel,
                      :owl/someValuesFrom :fibo-bp-iss-muni/BondCounsel,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess]})

(def Dissemination
  "dissemination"
  {:db/ident :fibo-bp-iss-muni/Dissemination,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dissemination"},
   :rdfs/subClassOf :fibo-bp-iss-muni/UnderwritingProcessActivity})

(def DisseminationUnderwriter
  "dissemination underwriter"
  {:db/ident :fibo-bp-iss-muni/DisseminationUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dissemination underwriter"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-bp-iss-muni/makesDecisionOn,
                      :owl/someValuesFrom :fibo-bp-iss-muni/Dissemination,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-muni/PotentialMuniUnderwriter]})

(def EquityDemutualizationProcess
  "equity demutualization process"
  {:db/ident :fibo-bp-iss-muni/EquityDemutualizationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity demutualization process"},
   :rdfs/subClassOf :fibo-bp-iss-prc/SecuritiesIssuanceProcess})

(def EquityIPOProcess
  "equity i p o process"
  {:db/ident :fibo-bp-iss-muni/EquityIPOProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity i p o process"},
   :rdfs/subClassOf :fibo-bp-iss-muni/RegisteredSecurityIssuanceProcess})

(def EquityUnderwritingIssuanceProcess
  "equity underwriting issuance process"
  {:db/ident :fibo-bp-iss-muni/EquityUnderwritingIssuanceProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity underwriting issuance process"},
   :rdfs/subClassOf :fibo-bp-iss-muni/RegisteredSecurityIssuanceProcess})

(def IssuanceAgent
  "issuance agent"
  {:db/ident :fibo-bp-iss-muni/IssuanceAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issuance agent"},
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/isAgentIn,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def IssuanceClosing
  "The process of crediting the DTC participant account on settlement date with the position for the new issue. The overall closing process includes the exchange of funds that happens outside of DTC."
  {:db/ident :fibo-bp-iss-muni/IssuanceClosing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issuance closing"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/IssuanceProcessActivity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of crediting the DTC participant account on settlement date with the position for the new issue. The overall closing process includes the exchange of funds that happens outside of DTC."}})

(def IssuanceCreditingParticipant
  "issuance crediting participant"
  {:db/ident :fibo-bp-iss-muni/IssuanceCreditingParticipant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issuance crediting participant"},
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/isCreditingParticipant,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def IssuanceFinancialAdvisor
  "issuance financial advisor"
  {:db/ident :fibo-bp-iss-muni/IssuanceFinancialAdvisor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issuance financial advisor"},
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/advises,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def IssuancePrinter
  "issuance printer"
  {:db/ident :fibo-bp-iss-muni/IssuancePrinter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issuance printer"},
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/prints,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def IssuanceProcessParticipant
  "issuance process participant"
  {:db/ident :fibo-bp-iss-muni/IssuanceProcessParticipant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issuance process participant"},
   :rdfs/subClassOf :fibo-bp-iss-muni/ProcessParticipant})

(def IssuanceSettlement
  "issuance settlement"
  {:db/ident :fibo-bp-iss-muni/IssuanceSettlement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issuance settlement"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/IssuanceProcessActivity})

(def IssueOverAllotmentTerms
  "Terms for Change to an Issue Amount. A provision in an underwriting agreement, which allows members of the underwriting syndicate to purchase additional shares at the original price."
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Also known as a green shoe. Note that this set of terms does not refer to over-allotment as change to a the total issue amount issued to an individual investor. That would require separate but similar terms. FIBIM has \"Over Allotment Amount\" as an individual term."},
   :db/ident :fibo-bp-iss-muni/IssueOverAllotmentTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issue over allotment terms"},
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onClass :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty
                      :fibo-bp-iss-muni/maximumOverAllotmentAmount,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-doc/OfferingDocumentTerms],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Terms for Change to an Issue Amount. A provision in an underwriting agreement, which allows members of the underwriting syndicate to purchase additional shares at the original price."}})

(def IssuerCounsel
  "issuer counsel"
  {:db/ident :fibo-bp-iss-muni/IssuerCounsel,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issuer counsel"},
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/isIssuerCounsel,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def MuniDebtOffering
  "The process step of offering a Municipal Debt security for issue."
  {:db/ident :fibo-bp-iss-muni/MuniDebtOffering,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "muni debt offering"},
   :rdfs/subClassOf :fibo-sec-dbt-dbti/DebtOffering,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process step of offering a Municipal Debt security for issue."}})

(def MuniIssuanceProcessParticipant
  "muni issuance process participant"
  {:db/ident :fibo-bp-iss-muni/MuniIssuanceProcessParticipant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "muni issuance process participant"},
   :rdfs/subClassOf :fibo-bp-iss-muni/IssuanceProcessParticipant})

(def Obligor
  "obligor"
  {:db/ident :fibo-bp-iss-muni/Obligor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "obligor"},
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/obligorTo,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def PayingAgent
  "paying agent"
  {:db/ident :fibo-bp-iss-muni/PayingAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "paying agent"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/facilitatesPayment,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-muni/IssuanceAgent]})

(def PotentialMuniUnderwriter
  "An intermediary between an issuer of a security and the investing public. An underwriter can either be DTC Participant or Correspondent who would clear the underwriting deal using the Crediting Participant."
  {:db/ident :fibo-bp-iss-muni/PotentialMuniUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "potential muni underwriter"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/underwrites,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-prc/PotentialUnderwriter],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An intermediary between an issuer of a security and the investing public. An underwriter can either be DTC Participant or Correspondent who would clear the underwriting deal using the Crediting Participant."}})

(def PrivatePlacement
  "private placement"
  {:db/ident :fibo-bp-iss-muni/PrivatePlacement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "private placement"},
   :rdfs/subClassOf :fibo-bp-iss-prc/SecuritiesIssuanceProcess})

(def ProcessParticipant
  "process participant"
  {:db/ident :fibo-bp-iss-muni/ProcessParticipant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "process participant"}})

(def RegisteredSecurityIssuanceProcess
  "registered security issuance process"
  {:db/ident :fibo-bp-iss-muni/RegisteredSecurityIssuanceProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "registered security issuance process"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-bp-iss-muni/includesStep,
                      :owl/someValuesFrom :fibo-bp-iss-muni/Registration,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-prc/SecuritiesIssuanceProcess]})

(def Registration
  "registration"
  {:db/ident :fibo-bp-iss-muni/Registration,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "registration"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-bp-iss-muni/registeredUnder,
                      :owl/someValuesFrom :fibo-fnd-law-jur/Jurisdiction,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-dbti/IssuanceProcessActivity]})

(def RemarketingAgent
  "remarketing agent"
  {:db/ident :fibo-bp-iss-muni/RemarketingAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "remarketing agent"},
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/facililtatesRemarketing,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def SecuritiesIssuanceContext
  "securities issuance context"
  {:db/ident :fibo-bp-iss-muni/SecuritiesIssuanceContext,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "securities issuance context"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-prc-fcp/PrimaryMarket]})

(def SecuritiesUnderwritingIssuance
  "Underwriting, as a method of Securities Issuance."
  {:db/ident :fibo-bp-iss-muni/SecuritiesUnderwritingIssuance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "securities underwriting issuance"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-muni/SecuritiesIssuanceContext],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Underwriting, as a method of Securities Issuance."}})

(def SecuritiesUnderwritingIssuanceProcess
  "The process by which debt instruments are offered to the market by a syndicate of underwriters who underwrite the issue."
  {:db/ident :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "securities underwriting issuance process"},
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-bp-iss-muni/hasFinancialAdvisor,
     :owl/someValuesFrom :fibo-bp-iss-muni/IssuanceFinancialAdvisor,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasServicer,
     :owl/someValuesFrom :fibo-bp-iss-muni/Servicer,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/produces,
     :owl/someValuesFrom :fibo-bp-iss-prc/UnderwritingProcessDetails,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasRemarketingAgent,
     :owl/someValuesFrom :fibo-bp-iss-muni/RemarketingAgent,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasPrinter,
     :owl/someValuesFrom :fibo-bp-iss-muni/IssuancePrinter,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/underwrittenBy,
     :owl/someValuesFrom :fibo-bp-iss-muni/PotentialMuniUnderwriter,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/requestedBy,
     :owl/someValuesFrom :fibo-bp-iss-muni/UnderwritingIssuanceRequestor,
     :rdf/type           :owl/Restriction}
    :fibo-bp-iss-prc/SecuritiesIssuanceProcess
    {:owl/onProperty     :fibo-bp-iss-muni/hasAgent,
     :owl/someValuesFrom :fibo-bp-iss-muni/IssuanceAgent,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasTrustee,
     :owl/someValuesFrom :fibo-bp-iss-muni/Trustee,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasTransferAgent,
     :owl/someValuesFrom :fibo-bp-iss-muni/TransferAgent,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasSubscriber,
     :owl/someValuesFrom :fibo-bp-iss-prc/Subscriber,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasPayingAgent,
     :owl/someValuesFrom :fibo-bp-iss-muni/PayingAgent,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasObligor,
     :owl/someValuesFrom :fibo-bp-iss-muni/Obligor,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasIssuerCounsel,
     :owl/someValuesFrom :fibo-bp-iss-muni/IssuerCounsel,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process by which debt instruments are offered to the market by a syndicate of underwriters who underwrite the issue."}})

(def Servicer
  "servicer"
  {:db/ident :fibo-bp-iss-muni/Servicer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "servicer"},
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/services,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def TransferAgent
  "transfer agent"
  {:db/ident :fibo-bp-iss-muni/TransferAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transfer agent"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/facilitatesTransfer,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-muni/IssuanceAgent]})

(def Trustee
  "trustee"
  {:db/ident :fibo-bp-iss-muni/Trustee,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "trustee"},
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/isTrustee,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def UnderwritingIssuanceClosing
  "underwriting issuance closing"
  {:db/ident :fibo-bp-iss-muni/UnderwritingIssuanceClosing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "underwriting issuance closing"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-bp-iss-muni/refersTo,
                      :owl/someValuesFrom :fibo-bp-iss-prc/UnderwriterTakedown,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-muni/IssuanceClosing]})

(def UnderwritingIssuanceRequestor
  "underwriting issuance requestor"
  {:db/ident :fibo-bp-iss-muni/UnderwritingIssuanceRequestor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "underwriting issuance requestor"},
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
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "underwriting process activity"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/IssuanceProcessActivity})

(def UnderwritingProcessActor
  "any actor within the DTYCC Underwriting Process or any other Underwriting Process. Note: At present all these Actors (e.g. Underwriter) are defined simply as Process Actors and not as specializations of this type of Actor. Therefore this Actor is a Union of all of those."
  {:db/ident :fibo-bp-iss-muni/UnderwritingProcessActor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "underwriting process actor"},
   :rdfs/subClassOf
   {:owl/onProperty     :fibo-bp-iss-muni/underwritingProcessActorHasIdentity,
    :owl/someValuesFrom {:owl/unionOf [:fibo-bp-iss-muni/Correspondent
                                       :fibo-bp-iss-muni/DTCCMember],
                         :rdf/type    :owl/Class},
    :rdf/type           :owl/Restriction},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "any actor within the DTYCC Underwriting Process or any other Underwriting Process. Note: At present all these Actors (e.g. Underwriter) are defined simply as Process Actors and not as specializations of this type of Actor. Therefore this Actor is a Union of all of those."}})

(def actualClosingDate
  "The date in which closing has been done for the underwriter of a security."
  {:db/ident :fibo-bp-iss-muni/actualClosingDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuanceClosing,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "actual closing date"},
   :rdfs/range :fibo-fnd-dt-fd/Date,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The date in which closing has been done for the underwriter of a security."}})

(def advises
  "advises"
  {:db/ident :fibo-bp-iss-muni/advises,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuanceFinancialAdvisor,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "advises"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def announcementComments
  "Free form description of Purpose of Issue, Source of funds etc."
  {:db/ident :fibo-bp-iss-muni/announcementComments,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-muni/AnnounceSecuritiesIssue,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "announcement comments"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Free form description of Purpose of Issue, Source of funds etc."}})

(def announcesIssueOf
  "announces issue of"
  {:db/ident :fibo-bp-iss-muni/announcesIssueOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/AnnounceSecuritiesIssue,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "announces issue of"},
   :rdfs/range :fibo-fbc-fi-fi/Security})

(def disseminationDecisionDateAndTime
  "Date and Time when the Dissemination Underwriter made the Decision about Dissemination."
  {:db/ident :fibo-bp-iss-muni/disseminationDecisionDateAndTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/Dissemination,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dissemination decision date and time"},
   :rdfs/range :fibo-fnd-dt-fd/DateTime,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Date and Time when the Dissemination Underwriter made the Decision about Dissemination."}})

(def facililtatesRemarketing
  "facililtates remarketing"
  {:db/ident :fibo-bp-iss-muni/facililtatesRemarketing,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/RemarketingAgent,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "facililtates remarketing"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def facilitatesPayment
  "facilitates payment"
  {:db/ident :fibo-bp-iss-muni/facilitatesPayment,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/PayingAgent,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "facilitates payment"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def facilitatesTransfer
  "facilitates transfer"
  {:db/ident :fibo-bp-iss-muni/facilitatesTransfer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/TransferAgent,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "facilitates transfer"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def formalAwardDateAndTime
  "Date and time the issuer formally accepts a bid for Competitive Issues or, the Date and Time the Bond Purchase Agreement is executed for Negotiated Issues. Time Zone: Include in date/time data or add a term for it?"
  {:db/ident :fibo-bp-iss-muni/formalAwardDateAndTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-dbti/DebtOffering,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "formal award date and time"},
   :rdfs/range :fibo-fnd-dt-fd/DateTime,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Date and time the issuer formally accepts a bid for Competitive Issues or, the Date and Time the Bond Purchase Agreement is executed for Negotiated Issues. Time Zone: Include in date/time data or add a term for it?"}})

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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has agent"},
   :rdfs/range :fibo-bp-iss-muni/IssuanceAgent})

(def hasBondCounsel
  "has bond counsel"
  {:db/ident :fibo-bp-iss-muni/hasBondCounsel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/DebtUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has bond counsel"},
   :rdfs/range :fibo-bp-iss-muni/BondCounsel})

(def hasFinancialAdvisor
  "has financial advisor"
  {:db/ident :fibo-bp-iss-muni/hasFinancialAdvisor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has financial advisor"},
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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has issuer counsel"},
   :rdfs/range :fibo-bp-iss-muni/IssuerCounsel})

(def hasObligor
  "has obligor"
  {:db/ident :fibo-bp-iss-muni/hasObligor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has obligor"},
   :rdfs/range :fibo-bp-iss-muni/Obligor})

(def hasPayingAgent
  "has paying agent"
  {:db/ident :fibo-bp-iss-muni/hasPayingAgent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has paying agent"},
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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has printer"},
   :rdfs/range :fibo-bp-iss-muni/IssuancePrinter})

(def hasRemarketingAgent
  "has remarketing agent"
  {:db/ident :fibo-bp-iss-muni/hasRemarketingAgent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has remarketing agent"},
   :rdfs/range :fibo-bp-iss-muni/RemarketingAgent})

(def hasServicer
  "has servicer"
  {:db/ident :fibo-bp-iss-muni/hasServicer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has servicer"},
   :rdfs/range :fibo-bp-iss-muni/Servicer})

(def hasSubscriber
  "has subscriber"
  {:db/ident :fibo-bp-iss-muni/hasSubscriber,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has subscriber"},
   :rdfs/range :fibo-bp-iss-prc/Subscriber})

(def hasTransferAgent
  "has transfer agent"
  {:db/ident :fibo-bp-iss-muni/hasTransferAgent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has transfer agent"},
   :rdfs/range :fibo-bp-iss-muni/TransferAgent})

(def hasTrustee
  "has trustee"
  {:db/ident :fibo-bp-iss-muni/hasTrustee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has trustee"},
   :rdfs/range :fibo-bp-iss-muni/Trustee})

(def includesStep
  "includes step"
  {:db/ident :fibo-bp-iss-muni/includesStep,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/RegisteredSecurityIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "includes step"},
   :rdfs/range :fibo-bp-iss-muni/Registration})

(def isAgentIn
  "is agent in"
  {:db/ident :fibo-bp-iss-muni/isAgentIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuanceAgent,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is agent in"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def isBondCounsel
  "is bond counsel"
  {:db/ident :fibo-bp-iss-muni/isBondCounsel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/BondCounsel,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is bond counsel"},
   :rdfs/range :fibo-bp-iss-muni/DebtUnderwritingIssuanceProcess})

(def isCreditingParticipant
  "is crediting participant"
  {:db/ident :fibo-bp-iss-muni/isCreditingParticipant,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuanceCreditingParticipant,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is crediting participant"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def isIssuerCounsel
  "is issuer counsel"
  {:db/ident :fibo-bp-iss-muni/isIssuerCounsel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuerCounsel,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is issuer counsel"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def isTrustee
  "is trustee"
  {:db/ident :fibo-bp-iss-muni/isTrustee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/Trustee,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is trustee"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def issuanceSettlementDate
  "Settlement date for the initial Issuance transaction."
  {:db/ident :fibo-bp-iss-muni/issuanceSettlementDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuanceSettlement,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issuance settlement date"},
   :rdfs/range :fibo-fnd-dt-fd/Date,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Settlement date for the initial Issuance transaction."}})

(def makesDecisionOn
  "makes decision on"
  {:db/ident :fibo-bp-iss-muni/makesDecisionOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/DisseminationUnderwriter,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "makes decision on"},
   :rdfs/range :fibo-bp-iss-muni/Dissemination})

(def maximumOverAllotmentAmount
  "The maximum amount that is available as part of providing the over-allotment option."
  {:db/ident :fibo-bp-iss-muni/maximumOverAllotmentAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain [:fibo-bp-iss-muni/IssueOverAllotmentTerms
                 :fibo-bp-iss-muni/DebtIssueOverAllotmentTerms],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "maximum over allotment amount"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The maximum amount that is available as part of providing the over-allotment option."}})

(def maximumOverAllotmentPercentage
  "The percentage that is available as part of providing the over-allotment option."
  {:db/ident :fibo-bp-iss-muni/maximumOverAllotmentPercentage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssueOverAllotmentTerms,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "maximum over allotment percentage"},
   :rdfs/range :fibo-fnd-utl-alx/Percentage,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The percentage that is available as part of providing the over-allotment option."}})

(def maximumOverAllotmentShares
  "The maximum amount of shares that are available as part of providing the over-allotment option."
  {:db/ident :fibo-bp-iss-muni/maximumOverAllotmentShares,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssueOverAllotmentTerms,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "maximum over allotment shares"},
   :rdfs/range :xsd/integer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The maximum amount of shares that are available as part of providing the over-allotment option."}})

(def obligorTo
  "obligor to"
  {:db/ident :fibo-bp-iss-muni/obligorTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/Obligor,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "obligor to"},
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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "over allotment available"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether an over-allotment option is available for the security."}})

(def overAllotmentExpiryPeriodDays
  "Number of calendar days after the closing of initial offering for expiry of over-allotment option."
  {:db/ident :fibo-bp-iss-muni/overAllotmentExpiryPeriodDays,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssueOverAllotmentTerms,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "over allotment expiry period days"},
   :rdfs/range :xsd/integer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Number of calendar days after the closing of initial offering for expiry of over-allotment option."}})

(def participatesIn
  "participates in"
  {:db/ident :fibo-bp-iss-muni/participatesIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/MuniIssuanceProcessParticipant,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "participates in"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def prints
  "prints"
  {:db/ident :fibo-bp-iss-muni/prints,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuancePrinter,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "prints"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def produces
  "produces"
  {:db/ident :fibo-bp-iss-muni/produces,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "produces"},
   :rdfs/range :fibo-bp-iss-prc/UnderwritingProcessDetails})

(def refersTo
  "refers to"
  {:db/ident :fibo-bp-iss-muni/refersTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/UnderwritingIssuanceClosing,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "refers to"},
   :rdfs/range :fibo-bp-iss-prc/UnderwriterTakedown})

(def registeredUnder
  "registered under"
  {:db/ident :fibo-bp-iss-muni/registeredUnder,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/Registration,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "registered under"},
   :rdfs/range :fibo-fnd-law-jur/Jurisdiction})

(def requestedBy
  "requested by"
  {:db/ident :fibo-bp-iss-muni/requestedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "requested by"},
   :rdfs/range :fibo-bp-iss-muni/UnderwritingIssuanceRequestor})

(def requests
  "requests"
  {:db/ident :fibo-bp-iss-muni/requests,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/UnderwritingIssuanceRequestor,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "requests"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def saleMethod
  "Sale Method of the security."
  {:db/ident :fibo-bp-iss-muni/saleMethod,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-muni/MuniDebtOffering,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "sale method"},
   :rdfs/range :xsd/string,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sale Method of the security."}})

(def services
  "services"
  {:db/ident :fibo-bp-iss-muni/services,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/Servicer,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "services"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def step
  "step"
  {:db/ident :fibo-bp-iss-muni/step,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/DebtUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "step"},
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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subscribes to"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Subscriber responds to marketing / draft propspectus, indicates interest and is allocated shares / debt units based on interest."}})

(def subscribesTo.1
  "subscribes to"
  {:db/ident :fibo-bp-iss-muni/subscribesTo.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/Subscriber,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subscribes to"},
   :rdfs/range :fibo-bp-iss-prc/SecuritiesIssuanceProcess})

(def underwrites
  "underwrites"
  {:db/ident :fibo-bp-iss-muni/underwrites,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/PotentialMuniUnderwriter,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "underwrites"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def underwritingProcessActorHasIdentity
  "underwriting process actor has identity"
  {:db/ident :fibo-bp-iss-muni/underwritingProcessActorHasIdentity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/UnderwritingProcessActor,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "underwriting process actor has identity"},
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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "underwritten by"},
   :rdfs/range :fibo-bp-iss-muni/PotentialMuniUnderwriter})