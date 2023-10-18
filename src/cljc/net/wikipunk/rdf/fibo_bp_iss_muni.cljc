(ns net.wikipunk.rdf.fibo-bp-iss-muni
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BP/SecuritiesIssuance/MuniIssuance/",
   :dcterms/abstract
   "Ontology for the process in which municipal bonds are issued.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :namespaces
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
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BP/SecuritiesIssuance/DebtIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Agreements/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BP/Process/FinancialContextAndProcess/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BP/SecuritiesIssuance/IssuanceDocuments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Debt/DebtInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BP/SecuritiesIssuance/IssuanceProcess/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-bp-iss-muni",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MuniIssuance"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"})

(def AnnounceSecuritiesIssue
  {:db/ident :fibo-bp-iss-muni/AnnounceSecuritiesIssue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "announce securities issue"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-bp-iss-dbti/announces,
                       :owl/someValuesFrom :fibo-sec-sec-iss/SecuritiesOffering,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-bp-iss-muni/announcesIssueOf,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                       :rdf/type           :owl/Restriction}}})

(def BondCounsel
  {:db/ident :fibo-bp-iss-muni/BondCounsel,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bond counsel"},
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/isBondCounsel,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/DebtUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def Correspondent
  {:db/ident :fibo-bp-iss-muni/Correspondent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "correspondent"},
   :rdfs/subClassOf #{:fibo-bp-iss-muni/MuniIssuanceProcessParticipant
                      {:owl/onProperty :fibo-bp-iss-muni/participatesIn,
                       :owl/someValuesFrom
                       :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A bank, brokerage or other financial institution that is not a direct DTC member. Correspondents rely on direct DTC Participants to perform their DTC settlement services"}})

(def DTCCMember
  {:db/ident :fibo-bp-iss-muni/DTCCMember,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "d t c c member"},
   :rdfs/subClassOf #{:fibo-bp-iss-muni/MuniIssuanceProcessParticipant
                      {:owl/onProperty :fibo-bp-iss-muni/participatesIn,
                       :owl/someValuesFrom
                       :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A firm which is a member of DTCC. Note: this Actor may perform any of the Roles described elsewhere in this Issuance model, i.e. the DTCC Member may also be any of the Actors defined. REVIEW: does this apply to ALL the defined Actor types?"}})

(def DebtAuctionProcess
  {:db/ident :fibo-bp-iss-muni/DebtAuctionProcess,
   :owl/disjointWith :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt auction process"},
   :rdfs/subClassOf :fibo-bp-iss-prc/SecuritiesIssuanceProcess})

(def DebtIssueOverAllotmentTerms
  {:db/ident :fibo-bp-iss-muni/DebtIssueOverAllotmentTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt issue over allotment terms"},
   :rdfs/subClassOf :fibo-bp-iss-muni/IssueOverAllotmentTerms,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Terms for Change to an Issue Amount for Debt securities"}})

(def DebtUnderwritingClosing
  {:db/ident :fibo-bp-iss-muni/DebtUnderwritingClosing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt underwriting closing"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-bp-iss-muni/refersTo,
                       :owl/someValuesFrom
                       :fibo-bp-iss-dbti/UnderwriterTakedownForDebt,
                       :rdf/type :owl/Restriction}
                      :fibo-bp-iss-muni/UnderwritingIssuanceClosing}})

(def DebtUnderwritingIssuanceProcess
  {:db/ident :fibo-bp-iss-muni/DebtUnderwritingIssuanceProcess,
   :owl/disjointWith :fibo-bp-iss-muni/EquityUnderwritingIssuanceProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt underwriting issuance process"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-bp-iss-muni/step,
                       :owl/someValuesFrom :fibo-sec-dbt-dbti/DebtOffering,
                       :rdf/type           :owl/Restriction}
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess
                      {:owl/onProperty     :fibo-bp-iss-muni/hasBondCounsel,
                       :owl/someValuesFrom :fibo-bp-iss-muni/BondCounsel,
                       :rdf/type           :owl/Restriction}}})

(def Dissemination
  {:db/ident :fibo-bp-iss-muni/Dissemination,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dissemination"},
   :rdfs/subClassOf :fibo-bp-iss-muni/UnderwritingProcessActivity})

(def DisseminationUnderwriter
  {:db/ident :fibo-bp-iss-muni/DisseminationUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dissemination underwriter"},
   :rdfs/subClassOf #{:fibo-bp-iss-muni/PotentialMuniUnderwriter
                      {:owl/onProperty     :fibo-bp-iss-muni/makesDecisionOn,
                       :owl/someValuesFrom :fibo-bp-iss-muni/Dissemination,
                       :rdf/type           :owl/Restriction}}})

(def EquityDemutualizationProcess
  {:db/ident :fibo-bp-iss-muni/EquityDemutualizationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity demutualization process"},
   :rdfs/subClassOf :fibo-bp-iss-prc/SecuritiesIssuanceProcess})

(def EquityIPOProcess
  {:db/ident :fibo-bp-iss-muni/EquityIPOProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity i p o process"},
   :rdfs/subClassOf :fibo-bp-iss-muni/RegisteredSecurityIssuanceProcess})

(def EquityUnderwritingIssuanceProcess
  {:db/ident :fibo-bp-iss-muni/EquityUnderwritingIssuanceProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity underwriting issuance process"},
   :rdfs/subClassOf :fibo-bp-iss-muni/RegisteredSecurityIssuanceProcess})

(def IssuanceAgent
  {:db/ident :fibo-bp-iss-muni/IssuanceAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issuance agent"},
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/isAgentIn,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def IssuanceClosing
  {:db/ident :fibo-bp-iss-muni/IssuanceClosing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issuance closing"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/IssuanceProcessActivity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process of crediting the DTC participant account on settlement date with the position for the new issue. The overall closing process includes the exchange of funds that happens outside of DTC."}})

(def IssuanceCreditingParticipant
  {:db/ident :fibo-bp-iss-muni/IssuanceCreditingParticipant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issuance crediting participant"},
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/isCreditingParticipant,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def IssuanceFinancialAdvisor
  {:db/ident :fibo-bp-iss-muni/IssuanceFinancialAdvisor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issuance financial advisor"},
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/advises,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def IssuancePrinter
  {:db/ident :fibo-bp-iss-muni/IssuancePrinter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issuance printer"},
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/prints,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def IssuanceProcessParticipant
  {:db/ident :fibo-bp-iss-muni/IssuanceProcessParticipant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issuance process participant"},
   :rdfs/subClassOf :fibo-bp-iss-muni/ProcessParticipant})

(def IssuanceSettlement
  {:db/ident :fibo-bp-iss-muni/IssuanceSettlement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issuance settlement"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/IssuanceProcessActivity})

(def IssueOverAllotmentTerms
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Also known as a green shoe. Note that this set of terms does not refer to over-allotment as change to a the total issue amount issued to an individual investor. That would require separate but similar terms. FIBIM has \"Over Allotment Amount\" as an individual term."},
   :db/ident :fibo-bp-iss-muni/IssueOverAllotmentTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issue over allotment terms"},
   :rdfs/subClassOf
   #{{:owl/maxQualifiedCardinality 1,
      :owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
      :owl/onProperty :fibo-bp-iss-muni/maximumOverAllotmentAmount,
      :rdf/type       :owl/Restriction} :fibo-bp-iss-doc/OfferingDocumentTerms},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Terms for Change to an Issue Amount. A provision in an underwriting agreement, which allows members of the underwriting syndicate to purchase additional shares at the original price."}})

(def IssuerCounsel
  {:db/ident :fibo-bp-iss-muni/IssuerCounsel,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issuer counsel"},
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/isIssuerCounsel,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def MuniDebtOffering
  {:db/ident :fibo-bp-iss-muni/MuniDebtOffering,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "muni debt offering"},
   :rdfs/subClassOf :fibo-sec-dbt-dbti/DebtOffering,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process step of offering a Municipal Debt security for issue."}})

(def MuniIssuanceProcessParticipant
  {:db/ident :fibo-bp-iss-muni/MuniIssuanceProcessParticipant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "muni issuance process participant"},
   :rdfs/subClassOf :fibo-bp-iss-muni/IssuanceProcessParticipant})

(def Obligor
  {:db/ident :fibo-bp-iss-muni/Obligor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "obligor"},
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/obligorTo,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def PayingAgent
  {:db/ident :fibo-bp-iss-muni/PayingAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "paying agent"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-bp-iss-muni/facilitatesPayment,
                       :owl/someValuesFrom
                       :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                       :rdf/type :owl/Restriction}
                      :fibo-bp-iss-muni/IssuanceAgent}})

(def PotentialMuniUnderwriter
  {:db/ident :fibo-bp-iss-muni/PotentialMuniUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "potential muni underwriter"},
   :rdfs/subClassOf #{:fibo-bp-iss-prc/PotentialUnderwriter
                      {:owl/onProperty :fibo-bp-iss-muni/underwrites,
                       :owl/someValuesFrom
                       :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An intermediary between an issuer of a security and the investing public. An underwriter can either be DTC Participant or Correspondent who would clear the underwriting deal using the Crediting Participant."}})

(def PrivatePlacement
  {:db/ident :fibo-bp-iss-muni/PrivatePlacement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "private placement"},
   :rdfs/subClassOf :fibo-bp-iss-prc/SecuritiesIssuanceProcess})

(def ProcessParticipant
  {:db/ident :fibo-bp-iss-muni/ProcessParticipant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "process participant"}})

(def RegisteredSecurityIssuanceProcess
  {:db/ident :fibo-bp-iss-muni/RegisteredSecurityIssuanceProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "registered security issuance process"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-bp-iss-muni/includesStep,
                       :owl/someValuesFrom :fibo-bp-iss-muni/Registration,
                       :rdf/type           :owl/Restriction}
                      :fibo-bp-iss-prc/SecuritiesIssuanceProcess}})

(def Registration
  {:db/ident :fibo-bp-iss-muni/Registration,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "registration"},
   :rdfs/subClassOf #{:fibo-bp-iss-dbti/IssuanceProcessActivity
                      {:owl/onProperty     :fibo-bp-iss-muni/registeredUnder,
                       :owl/someValuesFrom :fibo-fnd-law-jur/Jurisdiction,
                       :rdf/type           :owl/Restriction}}})

(def RemarketingAgent
  {:db/ident :fibo-bp-iss-muni/RemarketingAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "remarketing agent"},
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/facililtatesRemarketing,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def SecuritiesIssuanceContext
  {:db/ident :fibo-bp-iss-muni/SecuritiesIssuanceContext,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "securities issuance context"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                       :rdf/type           :owl/Restriction}
                      :fibo-bp-prc-fcp/PrimaryMarket}})

(def SecuritiesUnderwritingIssuance
  {:db/ident :fibo-bp-iss-muni/SecuritiesUnderwritingIssuance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "securities underwriting issuance"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                       :rdf/type           :owl/Restriction}
                      :fibo-bp-iss-muni/SecuritiesIssuanceContext},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Underwriting, as a method of Securities Issuance."}})

(def SecuritiesUnderwritingIssuanceProcess
  {:db/ident :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "securities underwriting issuance process"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-bp-iss-muni/hasTrustee,
      :owl/someValuesFrom :fibo-bp-iss-muni/Trustee,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-bp-iss-muni/underwrittenBy,
      :owl/someValuesFrom :fibo-bp-iss-muni/PotentialMuniUnderwriter,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-bp-iss-muni/hasSubscriber,
      :owl/someValuesFrom :fibo-bp-iss-prc/Subscriber,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-bp-iss-muni/hasFinancialAdvisor,
      :owl/someValuesFrom :fibo-bp-iss-muni/IssuanceFinancialAdvisor,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-bp-iss-muni/hasIssuerCounsel,
      :owl/someValuesFrom :fibo-bp-iss-muni/IssuerCounsel,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-bp-iss-muni/hasPrinter,
      :owl/someValuesFrom :fibo-bp-iss-muni/IssuancePrinter,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-bp-iss-muni/requestedBy,
      :owl/someValuesFrom :fibo-bp-iss-muni/UnderwritingIssuanceRequestor,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-bp-iss-muni/produces,
      :owl/someValuesFrom :fibo-bp-iss-prc/UnderwritingProcessDetails,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-bp-iss-muni/hasServicer,
      :owl/someValuesFrom :fibo-bp-iss-muni/Servicer,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-bp-iss-muni/hasRemarketingAgent,
      :owl/someValuesFrom :fibo-bp-iss-muni/RemarketingAgent,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-bp-iss-muni/hasTransferAgent,
      :owl/someValuesFrom :fibo-bp-iss-muni/TransferAgent,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-bp-iss-muni/hasAgent,
      :owl/someValuesFrom :fibo-bp-iss-muni/IssuanceAgent,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-bp-iss-muni/hasPayingAgent,
      :owl/someValuesFrom :fibo-bp-iss-muni/PayingAgent,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-bp-iss-muni/hasObligor,
      :owl/someValuesFrom :fibo-bp-iss-muni/Obligor,
      :rdf/type           :owl/Restriction}
     :fibo-bp-iss-prc/SecuritiesIssuanceProcess},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process by which debt instruments are offered to the market by a syndicate of underwriters who underwrite the issue."}})

(def Servicer
  {:db/ident :fibo-bp-iss-muni/Servicer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "servicer"},
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/services,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def TransferAgent
  {:db/ident :fibo-bp-iss-muni/TransferAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transfer agent"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-bp-iss-muni/facilitatesTransfer,
                       :owl/someValuesFrom
                       :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                       :rdf/type :owl/Restriction}
                      :fibo-bp-iss-muni/IssuanceAgent}})

(def Trustee
  {:db/ident :fibo-bp-iss-muni/Trustee,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "trustee"},
   :rdfs/subClassOf {:owl/onProperty :fibo-bp-iss-muni/isTrustee,
                     :owl/someValuesFrom
                     :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                     :rdf/type :owl/Restriction}})

(def UnderwritingIssuanceClosing
  {:db/ident :fibo-bp-iss-muni/UnderwritingIssuanceClosing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "underwriting issuance closing"},
   :rdfs/subClassOf #{:fibo-bp-iss-muni/IssuanceClosing
                      {:owl/onProperty     :fibo-bp-iss-muni/refersTo,
                       :owl/someValuesFrom :fibo-bp-iss-prc/UnderwriterTakedown,
                       :rdf/type           :owl/Restriction}}})

(def UnderwritingIssuanceRequestor
  {:db/ident :fibo-bp-iss-muni/UnderwritingIssuanceRequestor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "underwriting issuance requestor"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-bp-iss-muni/requests,
                       :owl/someValuesFrom
                       :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                       :rdf/type :owl/Restriction}
                      :fibo-bp-iss-prc/PotentialIssuer}})

(def UnderwritingProcessActivity
  {:db/ident :fibo-bp-iss-muni/UnderwritingProcessActivity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "underwriting process activity"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/IssuanceProcessActivity})

(def UnderwritingProcessActor
  {:db/ident :fibo-bp-iss-muni/UnderwritingProcessActor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
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
  {:db/ident :fibo-bp-iss-muni/actualClosingDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuanceClosing,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "actual closing date"},
   :rdfs/range :cmns-dt/Date,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The date in which closing has been done for the underwriter of a security."}})

(def advises
  {:db/ident :fibo-bp-iss-muni/advises,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuanceFinancialAdvisor,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "advises"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def announcementComments
  {:db/ident :fibo-bp-iss-muni/announcementComments,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-muni/AnnounceSecuritiesIssue,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "announcement comments"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Free form description of Purpose of Issue, Source of funds etc."}})

(def announcesIssueOf
  {:db/ident :fibo-bp-iss-muni/announcesIssueOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/AnnounceSecuritiesIssue,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "announces issue of"},
   :rdfs/range :fibo-fbc-fi-fi/Security})

(def disseminationDecisionDateAndTime
  {:db/ident :fibo-bp-iss-muni/disseminationDecisionDateAndTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/Dissemination,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dissemination decision date and time"},
   :rdfs/range :cmns-dt/DateTime,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Date and Time when the Dissemination Underwriter made the Decision about Dissemination."}})

(def facililtatesRemarketing
  {:db/ident :fibo-bp-iss-muni/facililtatesRemarketing,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/RemarketingAgent,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "facililtates remarketing"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def facilitatesPayment
  {:db/ident :fibo-bp-iss-muni/facilitatesPayment,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/PayingAgent,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "facilitates payment"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def facilitatesTransfer
  {:db/ident :fibo-bp-iss-muni/facilitatesTransfer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/TransferAgent,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "facilitates transfer"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def formalAwardDateAndTime
  {:db/ident :fibo-bp-iss-muni/formalAwardDateAndTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-dbti/DebtOffering,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "formal award date and time"},
   :rdfs/range :cmns-dt/DateTime,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Date and time the issuer formally accepts a bid for Competitive Issues or, the Date and Time the Bond Purchase Agreement is executed for Negotiated Issues. Time Zone: Include in date/time data or add a term for it?"}})

(def givesRiseTo
  {:db/ident :fibo-bp-iss-muni/givesRiseTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label "gives rise to"})

(def hasAgent
  {:db/ident :fibo-bp-iss-muni/hasAgent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has agent"},
   :rdfs/range :fibo-bp-iss-muni/IssuanceAgent})

(def hasBondCounsel
  {:db/ident :fibo-bp-iss-muni/hasBondCounsel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/DebtUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has bond counsel"},
   :rdfs/range :fibo-bp-iss-muni/BondCounsel})

(def hasFinancialAdvisor
  {:db/ident :fibo-bp-iss-muni/hasFinancialAdvisor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has financial advisor"},
   :rdfs/range :fibo-bp-iss-muni/IssuanceFinancialAdvisor})

(def hasIssuanceGuarantor
  {:db/ident :fibo-bp-iss-muni/hasIssuanceGuarantor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label "has issuance guarantor"})

(def hasIssuerCounsel
  {:db/ident :fibo-bp-iss-muni/hasIssuerCounsel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has issuer counsel"},
   :rdfs/range :fibo-bp-iss-muni/IssuerCounsel})

(def hasObligor
  {:db/ident :fibo-bp-iss-muni/hasObligor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has obligor"},
   :rdfs/range :fibo-bp-iss-muni/Obligor})

(def hasPayingAgent
  {:db/ident :fibo-bp-iss-muni/hasPayingAgent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has paying agent"},
   :rdfs/range :fibo-bp-iss-muni/PayingAgent})

(def hasPotentialIssuer
  {:db/ident :fibo-bp-iss-muni/hasPotentialIssuer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label "has potential issuer"})

(def hasPrinter
  {:db/ident :fibo-bp-iss-muni/hasPrinter,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has printer"},
   :rdfs/range :fibo-bp-iss-muni/IssuancePrinter})

(def hasRemarketingAgent
  {:db/ident :fibo-bp-iss-muni/hasRemarketingAgent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has remarketing agent"},
   :rdfs/range :fibo-bp-iss-muni/RemarketingAgent})

(def hasServicer
  {:db/ident :fibo-bp-iss-muni/hasServicer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has servicer"},
   :rdfs/range :fibo-bp-iss-muni/Servicer})

(def hasSubscriber
  {:db/ident :fibo-bp-iss-muni/hasSubscriber,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has subscriber"},
   :rdfs/range :fibo-bp-iss-prc/Subscriber})

(def hasTransferAgent
  {:db/ident :fibo-bp-iss-muni/hasTransferAgent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has transfer agent"},
   :rdfs/range :fibo-bp-iss-muni/TransferAgent})

(def hasTrustee
  {:db/ident :fibo-bp-iss-muni/hasTrustee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has trustee"},
   :rdfs/range :fibo-bp-iss-muni/Trustee})

(def includesStep
  {:db/ident :fibo-bp-iss-muni/includesStep,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/RegisteredSecurityIssuanceProcess,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "includes step"},
   :rdfs/range :fibo-bp-iss-muni/Registration})

(def isAgentIn
  {:db/ident :fibo-bp-iss-muni/isAgentIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuanceAgent,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is agent in"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def isBondCounsel
  {:db/ident :fibo-bp-iss-muni/isBondCounsel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/BondCounsel,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is bond counsel"},
   :rdfs/range :fibo-bp-iss-muni/DebtUnderwritingIssuanceProcess})

(def isCreditingParticipant
  {:db/ident :fibo-bp-iss-muni/isCreditingParticipant,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuanceCreditingParticipant,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is crediting participant"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def isIssuerCounsel
  {:db/ident :fibo-bp-iss-muni/isIssuerCounsel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuerCounsel,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is issuer counsel"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def isTrustee
  {:db/ident :fibo-bp-iss-muni/isTrustee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/Trustee,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is trustee"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def issuanceSettlementDate
  {:db/ident :fibo-bp-iss-muni/issuanceSettlementDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuanceSettlement,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issuance settlement date"},
   :rdfs/range :cmns-dt/Date,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Settlement date for the initial Issuance transaction."}})

(def makesDecisionOn
  {:db/ident :fibo-bp-iss-muni/makesDecisionOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/DisseminationUnderwriter,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "makes decision on"},
   :rdfs/range :fibo-bp-iss-muni/Dissemination})

(def maximumOverAllotmentAmount
  {:db/ident :fibo-bp-iss-muni/maximumOverAllotmentAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain #{:fibo-bp-iss-muni/IssueOverAllotmentTerms
                  :fibo-bp-iss-muni/DebtIssueOverAllotmentTerms},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "maximum over allotment amount"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The maximum amount that is available as part of providing the over-allotment option."}})

(def maximumOverAllotmentPercentage
  {:db/ident :fibo-bp-iss-muni/maximumOverAllotmentPercentage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssueOverAllotmentTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "maximum over allotment percentage"},
   :rdfs/range :fibo-fnd-utl-alx/Percentage,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The percentage that is available as part of providing the over-allotment option."}})

(def maximumOverAllotmentShares
  {:db/ident :fibo-bp-iss-muni/maximumOverAllotmentShares,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssueOverAllotmentTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "maximum over allotment shares"},
   :rdfs/range :xsd/integer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The maximum amount of shares that are available as part of providing the over-allotment option."}})

(def obligorTo
  {:db/ident :fibo-bp-iss-muni/obligorTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/Obligor,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "obligor to"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def offeringRequestor
  {:db/ident :fibo-bp-iss-muni/offeringRequestor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label "offering requestor"})

(def overAllotmentAvailable
  {:db/ident :fibo-bp-iss-muni/overAllotmentAvailable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssueOverAllotmentTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "over allotment available"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether an over-allotment option is available for the security."}})

(def overAllotmentExpiryPeriodDays
  {:db/ident :fibo-bp-iss-muni/overAllotmentExpiryPeriodDays,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssueOverAllotmentTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "over allotment expiry period days"},
   :rdfs/range :xsd/integer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Number of calendar days after the closing of initial offering for expiry of over-allotment option."}})

(def participatesIn
  {:db/ident :fibo-bp-iss-muni/participatesIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/MuniIssuanceProcessParticipant,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "participates in"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def prints
  {:db/ident :fibo-bp-iss-muni/prints,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/IssuancePrinter,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "prints"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def produces
  {:db/ident :fibo-bp-iss-muni/produces,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "produces"},
   :rdfs/range :fibo-bp-iss-prc/UnderwritingProcessDetails})

(def refersTo
  {:db/ident :fibo-bp-iss-muni/refersTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/UnderwritingIssuanceClosing,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "refers to"},
   :rdfs/range :fibo-bp-iss-prc/UnderwriterTakedown})

(def registeredUnder
  {:db/ident :fibo-bp-iss-muni/registeredUnder,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/Registration,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "registered under"},
   :rdfs/range :fibo-fnd-law-jur/Jurisdiction})

(def requestedBy
  {:db/ident :fibo-bp-iss-muni/requestedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "requested by"},
   :rdfs/range :fibo-bp-iss-muni/UnderwritingIssuanceRequestor})

(def requests
  {:db/ident :fibo-bp-iss-muni/requests,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/UnderwritingIssuanceRequestor,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "requests"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def saleMethod
  {:db/ident :fibo-bp-iss-muni/saleMethod,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-muni/MuniDebtOffering,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "sale method"},
   :rdfs/range :xsd/string,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sale Method of the security."}})

(def services
  {:db/ident :fibo-bp-iss-muni/services,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/Servicer,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "services"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def step
  {:db/ident :fibo-bp-iss-muni/step,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/DebtUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "step"},
   :rdfs/range :fibo-sec-dbt-dbti/DebtOffering})

(def subscribesTo
  {:db/ident :fibo-bp-iss-muni/subscribesTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/Subscriber,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subscribes to"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Subscriber responds to marketing / draft propspectus, indicates interest and is allocated shares / debt units based on interest."}})

(def underwrites
  {:db/ident :fibo-bp-iss-muni/underwrites,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/PotentialMuniUnderwriter,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "underwrites"},
   :rdfs/range :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess})

(def underwritingProcessActorHasIdentity
  {:db/ident :fibo-bp-iss-muni/underwritingProcessActorHasIdentity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/UnderwritingProcessActor,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "underwriting process actor has identity"},
   :rdfs/range {:owl/unionOf [:fibo-bp-iss-muni/Correspondent
                              :fibo-bp-iss-muni/DTCCMember],
                :rdf/type    :owl/Class}})

(def underwrittenBy
  {:db/ident :fibo-bp-iss-muni/underwrittenBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "underwritten by"},
   :rdfs/range :fibo-bp-iss-muni/PotentialMuniUnderwriter})

(def urn:uuid:e4616e83-8ce7-55ed-97b0-75d66ed6a71a
  {:rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label "subscriber",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/subscriber.1"})

(def urn:uuid:f42677a7-c86e-5eae-b4f9-10221be6972f
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcterms/abstract
   "Ontology for the process in which municipal bonds are issued.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BP/SecuritiesIssuance/DebtIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Agreements/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BP/Process/FinancialContextAndProcess/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BP/SecuritiesIssuance/IssuanceDocuments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Debt/DebtInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BP/SecuritiesIssuance/IssuanceProcess/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MuniIssuance"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"})

(def urn:uuid:2e22b1cb-7224-5e6d-b8e0-5324b265626f
  {:rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/Subscriber,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subscribes to"},
   :rdfs/range :fibo-bp-iss-prc/SecuritiesIssuanceProcess,
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/subscribesTo.1"})