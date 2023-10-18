(ns net.wikipunk.rdf.fibo-bp-iss-ipo
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :dcterms/abstract
   "Issuance process for equity instruments that are issued via an Initial Public Offering (IPO).",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-bp-iss-doc"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceDocuments/",
    "fibo-bp-iss-ipo"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
    "fibo-bp-iss-prc"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
    "fibo-fbc-fct-mkt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
    "fibo-fbc-fct-ra"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-arr-doc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
    "fibo-fnd-dt-oc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/Markets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BP/SecuritiesIssuance/IssuanceDocuments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BP/SecuritiesIssuance/IssuanceProcess/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-bp-iss-ipo",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Equities IPO Issuance Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"})

(def AgreeBasisForAllocation
  {:db/ident :fibo-bp-iss-ipo/AgreeBasisForAllocation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agree basis for allocation"},
   :rdfs/subClassOf :fibo-bp-iss-ipo/InitialPublicOfferingProcessStep})

(def Allocation
  {:db/ident :fibo-bp-iss-ipo/Allocation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "allocation"},
   :rdfs/subClassOf :fibo-bp-iss-ipo/InitialPublicOfferingProcessStep})

(def AllocationBasisDetails
  {:db/ident :fibo-bp-iss-ipo/AllocationBasisDetails,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "allocation basis details"},
   :rdfs/subClassOf :fibo-fnd-arr-doc/Document})

(def AllocationDetails
  {:db/ident :fibo-bp-iss-ipo/AllocationDetails,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "allocation details"},
   :rdfs/subClassOf :fibo-fnd-arr-doc/Document})

(def AnnounceEquityIssue
  {:db/ident :fibo-bp-iss-ipo/AnnounceEquityIssue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "announce equity issue"},
   :rdfs/subClassOf :fibo-bp-iss-ipo/InitialPublicOfferingProcessStep})

(def ApplicationForShares
  {:db/ident :fibo-bp-iss-ipo/ApplicationForShares,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "application for shares"},
   :rdfs/subClassOf :fibo-fnd-arr-doc/Document})

(def AppointAdvisors
  {:db/ident :fibo-bp-iss-ipo/AppointAdvisors,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "appoint advisors"},
   :rdfs/subClassOf #{:fibo-bp-iss-ipo/InitialPublicOfferingProcessStep
                      {:owl/onProperty :fibo-fnd-rel-rel/designates,
                       :owl/someValuesFrom
                       {:owl/unionOf [:fibo-bp-iss-ipo/CorporateBroker
                                      :fibo-bp-iss-ipo/Sponsor
                                      :fibo-bp-iss-ipo/ReportingAccountant
                                      :fibo-fbc-fct-ra/RegistrationAuthority],
                        :rdf/type    :owl/Class},
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-pty-rl/playsRole,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/Issuer,
                       :rdf/type           :owl/Restriction}}})

(def ApproveForFlotation
  {:db/ident :fibo-bp-iss-ipo/ApproveForFlotation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "approve for flotation"},
   :rdfs/subClassOf #{:fibo-bp-iss-ipo/InitialPublicOfferingProcessStep
                      {:owl/onProperty     :fibo-fnd-rel-rel/isProvidedBy,
                       :owl/someValuesFrom :fibo-fbc-fct-mkt/Exchange,
                       :rdf/type           :owl/Restriction}}})

(def CorporateBroker
  {:db/ident :fibo-bp-iss-ipo/CorporateBroker,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "corporate broker"},
   :rdfs/subClassOf :fibo-fbc-pas-fpas/Broker})

(def EquityAnnouncement
  {:db/ident :fibo-bp-iss-ipo/EquityAnnouncement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity announcement"},
   :rdfs/subClassOf :fibo-fnd-arr-doc/Notice})

(def FilingDetails
  {:db/ident :fibo-bp-iss-ipo/FilingDetails,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "filing details"},
   :rdfs/subClassOf :fibo-fnd-arr-doc/Document})

(def FormalApprovalForListingAndTrading
  {:db/ident :fibo-bp-iss-ipo/FormalApprovalForListingAndTrading,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "formal approval for listing and trading"},
   :rdfs/subClassOf #{:fibo-bp-iss-ipo/InitialPublicOfferingProcessStep
                      {:owl/onProperty     :fibo-fnd-rel-rel/isProvidedBy,
                       :owl/someValuesFrom :fibo-fbc-fct-mkt/Exchange,
                       :rdf/type           :owl/Restriction}}})

(def IPOFullProspectus
  {:db/ident :fibo-bp-iss-ipo/IPOFullProspectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "i p o full prospectus"},
   :rdfs/subClassOf :fibo-bp-iss-doc/FinalProspectus})

(def IPOPreliminaryProspectus
  {:db/ident :fibo-bp-iss-ipo/IPOPreliminaryProspectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "i p o preliminary prospectus"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-dt/precedes,
                       :owl/someValuesFrom :fibo-bp-iss-ipo/IPOFullProspectus,
                       :rdf/type           :owl/Restriction}
                      :fibo-bp-iss-doc/PreliminaryProspectus}})

(def IPOProcess
  {:db/ident :fibo-bp-iss-ipo/IPOProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "i p o process"},
   :rdfs/subClassOf {:owl/onProperty     :cmns-dt/hasDatePeriod,
                     :owl/someValuesFrom :cmns-dt/DatePeriod,
                     :rdf/type           :owl/Restriction}})

(def IPOSettlementDetails
  {:db/ident :fibo-bp-iss-ipo/IPOSettlementDetails,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "i p o settlement details"},
   :rdfs/subClassOf :fibo-fnd-arr-doc/Document})

(def IndicationOfInterest
  {:db/ident :fibo-bp-iss-ipo/IndicationOfInterest,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "indication of interest"},
   :rdfs/subClassOf :fibo-fnd-arr-doc/Document})

(def InitialPublicOfferingProcessStep
  {:cmns-av/abbreviation "IPO process step",
   :db/ident :fibo-bp-iss-ipo/InitialPublicOfferingProcessStep,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label "initial public offering process step",
   :rdfs/subClassOf #{:fibo-fnd-dt-oc/OccurrenceKind
                      {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                       :owl/someValuesFrom :fibo-bp-iss-ipo/IPOProcess,
                       :rdf/type           :owl/Restriction}}})

(def MarketingOfShareIssue
  {:db/ident :fibo-bp-iss-ipo/MarketingOfShareIssue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "marketing of share issue"},
   :rdfs/subClassOf :fibo-bp-iss-ipo/InitialPublicOfferingProcessStep})

(def NoticeOfAllocation
  {:db/ident :fibo-bp-iss-ipo/NoticeOfAllocation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "notice of allocation"},
   :rdfs/subClassOf :fibo-bp-iss-ipo/InitialPublicOfferingProcessStep})

(def PotentialShareUnderwriter
  {:db/ident :fibo-bp-iss-ipo/PotentialShareUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "potential share underwriter"},
   :rdfs/subClassOf :fibo-bp-iss-prc/PotentialUnderwriter})

(def PublishInitialProspectus
  {:db/ident :fibo-bp-iss-ipo/PublishInitialProspectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "publish initial prospectus"},
   :rdfs/subClassOf :fibo-bp-iss-ipo/InitialPublicOfferingProcessStep})

(def PurchasePrice
  {:db/ident :fibo-bp-iss-ipo/PurchasePrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "purchase price"},
   :rdfs/subClassOf :fibo-fnd-acc-cur/MonetaryPrice})

(def PurchaseUnallocatedStock
  {:db/ident :fibo-bp-iss-ipo/PurchaseUnallocatedStock,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "purchase unallocated stock"},
   :rdfs/subClassOf :fibo-bp-iss-ipo/InitialPublicOfferingProcessStep})

(def ReceiveApplications
  {:db/ident :fibo-bp-iss-ipo/ReceiveApplications,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "receive applications"},
   :rdfs/subClassOf :fibo-bp-iss-ipo/InitialPublicOfferingProcessStep})

(def RegisterWithRegulatoryAuthority
  {:db/ident :fibo-bp-iss-ipo/RegisterWithRegulatoryAuthority,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "register with regulatory authority"},
   :rdfs/subClassOf #{:fibo-bp-iss-ipo/InitialPublicOfferingProcessStep
                      {:owl/onProperty     :fibo-fnd-rel-rel/isProvidedBy,
                       :owl/someValuesFrom :fibo-fbc-fct-mkt/Exchange,
                       :rdf/type           :owl/Restriction}}})

(def RegistrationStatementDocument
  {:db/ident :fibo-bp-iss-ipo/RegistrationStatementDocument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "registration statement document"},
   :rdfs/subClassOf :fibo-fnd-arr-doc/Document})

(def ReportingAccountant
  {:db/ident :fibo-bp-iss-ipo/ReportingAccountant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "reporting accountant"},
   :rdfs/subClassOf :fibo-fnd-pty-pty/PartyInRole})

(def SetPrice
  {:db/ident :fibo-bp-iss-ipo/SetPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "set price"},
   :rdfs/subClassOf :fibo-bp-iss-ipo/InitialPublicOfferingProcessStep})

(def SettlementOfAllocatedShares
  {:db/ident :fibo-bp-iss-ipo/SettlementOfAllocatedShares,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "settlement of allocated shares"},
   :rdfs/subClassOf :fibo-bp-iss-ipo/InitialPublicOfferingProcessStep})

(def ShareRegister
  {:db/ident :fibo-bp-iss-ipo/ShareRegister,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "share register"},
   :rdfs/subClassOf :fibo-fbc-fct-ra/Registry})

(def Sponsor
  {:db/ident :fibo-bp-iss-ipo/Sponsor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "sponsor"},
   :rdfs/subClassOf #{:fibo-fnd-pty-pty/PartyInRole
                      {:owl/onProperty     :fibo-bp-iss-ipo/mayBe,
                       :owl/someValuesFrom :fibo-bp-iss-ipo/CorporateBroker,
                       :rdf/type           :owl/Restriction}}})

(def SyndicateMember
  {:db/ident :fibo-bp-iss-ipo/SyndicateMember,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "syndicate member"},
   :rdfs/subClassOf :fibo-fnd-pty-pty/PartyInRole})

(def Underwriting
  {:db/ident :fibo-bp-iss-ipo/Underwriting,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "underwriting"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-bp-iss-ipo/shareUnderwriter,
                       :owl/someValuesFrom
                       :fibo-bp-iss-ipo/PotentialShareUnderwriter,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty     :fibo-bp-iss-ipo/syndicateMember,
                       :owl/someValuesFrom :fibo-bp-iss-ipo/SyndicateMember,
                       :rdf/type           :owl/Restriction}}})

(def lead
  {:db/ident :fibo-bp-iss-ipo/lead,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ipo/AppointAdvisors,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "lead"},
   :rdfs/range :fibo-bp-iss-ipo/Sponsor})

(def mayBe
  {:db/ident :fibo-bp-iss-ipo/mayBe,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ipo/Sponsor,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "may be"},
   :rdfs/range :fibo-bp-iss-ipo/CorporateBroker})

(def shareUnderwriter
  {:db/ident :fibo-bp-iss-ipo/shareUnderwriter,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ipo/Underwriting,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "share underwriter"},
   :rdfs/range :fibo-bp-iss-ipo/PotentialShareUnderwriter})

(def syndicateMember
  {:db/ident :fibo-bp-iss-ipo/syndicateMember,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ipo/Underwriting,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "syndicate member"},
   :rdfs/range :fibo-bp-iss-ipo/SyndicateMember})

(def urn:uuid:ab52f445-6f83-534f-83ab-a7473b9e895d
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcterms/abstract
   "Issuance process for equity instruments that are issued via an Initial Public Offering (IPO).",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/Markets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BP/SecuritiesIssuance/IssuanceDocuments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BP/SecuritiesIssuance/IssuanceProcess/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BP/SecuritiesIssuance/EquitiesIPOIssuance/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Equities IPO Issuance Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"})