(ns net.wikipunk.rdf.fibo-bp-iss-ipo
  "Issuance process for equity instruments that are issued via an Initial Public Offering (IPO)."
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :dcterms/abstract
   "Issuance process for equity instruments that are issued via an Initial Public Offering (IPO).",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/Markets/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesListings/"
    "https://www.omg.org/spec/Commons/DatesAndTimes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/IssuanceProcess/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/IssuanceDocuments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/Occurrences/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdf/ns-prefix-map
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-bp-iss-ipo",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "Equities IPO Issuance Ontology@en"})

(def AgreeBasisForAllocation
  "agree basis for allocation"
  {:db/ident :fibo-bp-iss-ipo/AgreeBasisForAllocation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "agree basis for allocation@en",
   :rdfs/subClassOf [:fibo-bp-iss-ipo/InitialPublicOfferingProcessStep
                     :fibo-fnd-dt-oc/OccurrenceKind
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-bp-iss-ipo/IPOProcess,
                      :rdf/type           :owl/Restriction}]})

(def Allocation
  "allocation"
  {:db/ident :fibo-bp-iss-ipo/Allocation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "allocation@en",
   :rdfs/subClassOf [:fibo-bp-iss-ipo/InitialPublicOfferingProcessStep
                     :fibo-fnd-dt-oc/OccurrenceKind
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-bp-iss-ipo/IPOProcess,
                      :rdf/type           :owl/Restriction}]})

(def AllocationBasisDetails
  "allocation basis details"
  {:db/ident :fibo-bp-iss-ipo/AllocationBasisDetails,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "allocation basis details@en",
   :rdfs/subClassOf :fibo-fnd-arr-doc/Document})

(def AllocationDetails
  "allocation details"
  {:db/ident :fibo-bp-iss-ipo/AllocationDetails,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "allocation details@en",
   :rdfs/subClassOf :fibo-fnd-arr-doc/Document})

(def AnnounceEquityIssue
  "announce equity issue"
  {:db/ident :fibo-bp-iss-ipo/AnnounceEquityIssue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "announce equity issue@en",
   :rdfs/subClassOf [:fibo-bp-iss-ipo/InitialPublicOfferingProcessStep
                     :fibo-fnd-dt-oc/OccurrenceKind
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-bp-iss-ipo/IPOProcess,
                      :rdf/type           :owl/Restriction}]})

(def ApplicationForShares
  "application for shares"
  {:db/ident :fibo-bp-iss-ipo/ApplicationForShares,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "application for shares@en",
   :rdfs/subClassOf :fibo-fnd-arr-doc/Document})

(def AppointAdvisors
  "appoint advisors"
  {:db/ident :fibo-bp-iss-ipo/AppointAdvisors,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "appoint advisors@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/designates,
                      :owl/someValuesFrom
                      {:owl/unionOf [:fibo-bp-iss-ipo/CorporateBroker
                                     :fibo-bp-iss-ipo/Sponsor
                                     :fibo-bp-iss-ipo/ReportingAccountant
                                     :fibo-fbc-fct-ra/RegistrationAuthority],
                       :rdf/type    :owl/Class},
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-pty-rl/playsRole,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Issuer,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-ipo/InitialPublicOfferingProcessStep
                     :fibo-fnd-dt-oc/OccurrenceKind
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-bp-iss-ipo/IPOProcess,
                      :rdf/type           :owl/Restriction}]})

(def ApproveForFlotation
  "approve for flotation"
  {:db/ident :fibo-bp-iss-ipo/ApproveForFlotation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "approve for flotation@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/isProvidedBy,
                      :owl/someValuesFrom :fibo-fbc-fct-mkt/Exchange,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-ipo/InitialPublicOfferingProcessStep
                     :fibo-fnd-dt-oc/OccurrenceKind
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-bp-iss-ipo/IPOProcess,
                      :rdf/type           :owl/Restriction}]})

(def CorporateBroker
  "corporate broker"
  {:db/ident :fibo-bp-iss-ipo/CorporateBroker,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "corporate broker@en",
   :rdfs/subClassOf :fibo-fbc-pas-fpas/Broker})

(def EquityAnnouncement
  "equity announcement"
  {:db/ident :fibo-bp-iss-ipo/EquityAnnouncement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "equity announcement@en",
   :rdfs/subClassOf :fibo-fnd-arr-doc/Notice})

(def FilingDetails
  "filing details"
  {:db/ident :fibo-bp-iss-ipo/FilingDetails,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "filing details@en",
   :rdfs/subClassOf :fibo-fnd-arr-doc/Document})

(def FormalApprovalForListingAndTrading
  "formal approval for listing and trading"
  {:db/ident :fibo-bp-iss-ipo/FormalApprovalForListingAndTrading,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "formal approval for listing and trading@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/isProvidedBy,
                      :owl/someValuesFrom :fibo-fbc-fct-mkt/Exchange,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-ipo/InitialPublicOfferingProcessStep
                     :fibo-fnd-dt-oc/OccurrenceKind
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-bp-iss-ipo/IPOProcess,
                      :rdf/type           :owl/Restriction}]})

(def IPOFullProspectus
  "i p o full prospectus"
  {:db/ident :fibo-bp-iss-ipo/IPOFullProspectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "i p o full prospectus@en",
   :rdfs/subClassOf :fibo-bp-iss-doc/FinalProspectus})

(def IPOPreliminaryProspectus
  "i p o preliminary prospectus"
  {:db/ident :fibo-bp-iss-ipo/IPOPreliminaryProspectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "i p o preliminary prospectus@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-dt/precedes,
                      :owl/someValuesFrom :fibo-bp-iss-ipo/IPOFullProspectus,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-doc/PreliminaryProspectus]})

(def IPOProcess
  "i p o process"
  {:db/ident :fibo-bp-iss-ipo/IPOProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "i p o process@en",
   :rdfs/subClassOf {:owl/onProperty     :cmns-dt/hasDatePeriod,
                     :owl/someValuesFrom :cmns-dt/DatePeriod,
                     :rdf/type           :owl/Restriction}})

(def IPOSettlementDetails
  "i p o settlement details"
  {:db/ident :fibo-bp-iss-ipo/IPOSettlementDetails,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "i p o settlement details@en",
   :rdfs/subClassOf :fibo-fnd-arr-doc/Document})

(def IndicationOfInterest
  "indication of interest"
  {:db/ident :fibo-bp-iss-ipo/IndicationOfInterest,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "indication of interest@en",
   :rdfs/subClassOf :fibo-fnd-arr-doc/Document})

(def InitialPublicOfferingProcessStep
  "initial public offering process step"
  {:cmns-av/abbreviation "IPO process step",
   :db/ident :fibo-bp-iss-ipo/InitialPublicOfferingProcessStep,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label "initial public offering process step",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-bp-iss-ipo/IPOProcess,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/OccurrenceKind]})

(def MarketingOfShareIssue
  "marketing of share issue"
  {:db/ident :fibo-bp-iss-ipo/MarketingOfShareIssue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "marketing of share issue@en",
   :rdfs/subClassOf [:fibo-bp-iss-ipo/InitialPublicOfferingProcessStep
                     :fibo-fnd-dt-oc/OccurrenceKind
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-bp-iss-ipo/IPOProcess,
                      :rdf/type           :owl/Restriction}]})

(def NoticeOfAllocation
  "notice of allocation"
  {:db/ident :fibo-bp-iss-ipo/NoticeOfAllocation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "notice of allocation@en",
   :rdfs/subClassOf [:fibo-bp-iss-ipo/InitialPublicOfferingProcessStep
                     :fibo-fnd-dt-oc/OccurrenceKind
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-bp-iss-ipo/IPOProcess,
                      :rdf/type           :owl/Restriction}]})

(def PotentialShareUnderwriter
  "potential share underwriter"
  {:db/ident :fibo-bp-iss-ipo/PotentialShareUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "potential share underwriter@en",
   :rdfs/subClassOf :fibo-bp-iss-prc/PotentialUnderwriter})

(def PublishInitialProspectus
  "publish initial prospectus"
  {:db/ident :fibo-bp-iss-ipo/PublishInitialProspectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "publish initial prospectus@en",
   :rdfs/subClassOf [:fibo-bp-iss-ipo/InitialPublicOfferingProcessStep
                     :fibo-fnd-dt-oc/OccurrenceKind
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-bp-iss-ipo/IPOProcess,
                      :rdf/type           :owl/Restriction}]})

(def PurchasePrice
  "purchase price"
  {:db/ident :fibo-bp-iss-ipo/PurchasePrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "purchase price@en",
   :rdfs/subClassOf :fibo-fnd-acc-cur/MonetaryPrice})

(def PurchaseUnallocatedStock
  "purchase unallocated stock"
  {:db/ident :fibo-bp-iss-ipo/PurchaseUnallocatedStock,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "purchase unallocated stock@en",
   :rdfs/subClassOf [:fibo-bp-iss-ipo/InitialPublicOfferingProcessStep
                     :fibo-fnd-dt-oc/OccurrenceKind
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-bp-iss-ipo/IPOProcess,
                      :rdf/type           :owl/Restriction}]})

(def ReceiveApplications
  "receive applications"
  {:db/ident :fibo-bp-iss-ipo/ReceiveApplications,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "receive applications@en",
   :rdfs/subClassOf [:fibo-bp-iss-ipo/InitialPublicOfferingProcessStep
                     :fibo-fnd-dt-oc/OccurrenceKind
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-bp-iss-ipo/IPOProcess,
                      :rdf/type           :owl/Restriction}]})

(def RegisterWithRegulatoryAuthority
  "register with regulatory authority"
  {:db/ident :fibo-bp-iss-ipo/RegisterWithRegulatoryAuthority,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "register with regulatory authority@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/isProvidedBy,
                      :owl/someValuesFrom :fibo-fbc-fct-mkt/Exchange,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-ipo/InitialPublicOfferingProcessStep
                     :fibo-fnd-dt-oc/OccurrenceKind
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-bp-iss-ipo/IPOProcess,
                      :rdf/type           :owl/Restriction}]})

(def RegistrationStatementDocument
  "registration statement document"
  {:db/ident :fibo-bp-iss-ipo/RegistrationStatementDocument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "registration statement document@en",
   :rdfs/subClassOf :fibo-fnd-arr-doc/Document})

(def ReportingAccountant
  "reporting accountant"
  {:db/ident :fibo-bp-iss-ipo/ReportingAccountant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "reporting accountant@en",
   :rdfs/subClassOf :fibo-fnd-pty-pty/PartyInRole})

(def SetPrice
  "set price"
  {:db/ident :fibo-bp-iss-ipo/SetPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "set price@en",
   :rdfs/subClassOf [:fibo-bp-iss-ipo/InitialPublicOfferingProcessStep
                     :fibo-fnd-dt-oc/OccurrenceKind
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-bp-iss-ipo/IPOProcess,
                      :rdf/type           :owl/Restriction}]})

(def SettlementOfAllocatedShares
  "settlement of allocated shares"
  {:db/ident :fibo-bp-iss-ipo/SettlementOfAllocatedShares,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "settlement of allocated shares@en",
   :rdfs/subClassOf [:fibo-bp-iss-ipo/InitialPublicOfferingProcessStep
                     :fibo-fnd-dt-oc/OccurrenceKind
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-bp-iss-ipo/IPOProcess,
                      :rdf/type           :owl/Restriction}]})

(def ShareRegister
  "share register"
  {:db/ident :fibo-bp-iss-ipo/ShareRegister,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "share register@en",
   :rdfs/subClassOf :fibo-fbc-fct-ra/Registry})

(def Sponsor
  "sponsor"
  {:db/ident :fibo-bp-iss-ipo/Sponsor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "sponsor@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-bp-iss-ipo/mayBe,
                      :owl/someValuesFrom :fibo-bp-iss-ipo/CorporateBroker,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-pty-pty/PartyInRole]})

(def SyndicateMember
  "syndicate member"
  {:db/ident :fibo-bp-iss-ipo/SyndicateMember,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "syndicate member@en",
   :rdfs/subClassOf :fibo-fnd-pty-pty/PartyInRole})

(def Underwriting
  "underwriting"
  {:db/ident :fibo-bp-iss-ipo/Underwriting,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "underwriting@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-bp-iss-ipo/syndicateMember,
                      :owl/someValuesFrom :fibo-bp-iss-ipo/SyndicateMember,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-bp-iss-ipo/shareUnderwriter,
                      :owl/someValuesFrom
                      :fibo-bp-iss-ipo/PotentialShareUnderwriter,
                      :rdf/type :owl/Restriction}]})

(def lead
  "lead"
  {:db/ident :fibo-bp-iss-ipo/lead,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ipo/AppointAdvisors,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "lead@en",
   :rdfs/range :fibo-bp-iss-ipo/Sponsor})

(def mayBe
  "may be"
  {:db/ident :fibo-bp-iss-ipo/mayBe,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ipo/Sponsor,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "may be@en",
   :rdfs/range :fibo-bp-iss-ipo/CorporateBroker})

(def shareUnderwriter
  "share underwriter"
  {:db/ident :fibo-bp-iss-ipo/shareUnderwriter,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ipo/Underwriting,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "share underwriter@en",
   :rdfs/range :fibo-bp-iss-ipo/PotentialShareUnderwriter})

(def syndicateMember
  "syndicate member"
  {:db/ident :fibo-bp-iss-ipo/syndicateMember,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-ipo/Underwriting,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfs/label #voc/lstr "syndicate member@en",
   :rdfs/range :fibo-bp-iss-ipo/SyndicateMember})