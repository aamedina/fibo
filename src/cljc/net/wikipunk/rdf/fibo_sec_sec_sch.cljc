(ns net.wikipunk.rdf.fibo-sec-sec-sch
  {:cmns-av/copyright
   #{"Copyright (c) 2016-2024 EDM Council, Inc."
     "Copyright (c) 2018-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/ParametricSchedules/",
   :dcterms/abstract
   "This ontology defines concepts related to parametric schedules, including how to represent individual schedules as well as related date periods, explicit dates, and other concepts needed for parametric schedule representation.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-dt-bd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-dt-oc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-sec-sch"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/BusinessDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/ParametricSchedules/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-sec-sch",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
   :rdfs/label "Parametric Schedules Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules.rdf version of this ontology was modified to address text formatting hygiene issues."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules.rdf version of this ontology was modified to eliminate circular definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules.rdf version of this ontology was modified to eliminate a hygiene issue related to parametric schedule."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules.rdf version of this ontology was modified to move the property, 'is conferred on' to the Legal Capacity ontology and to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules.rdf version of this ontology was modified to move certain very general concepts related to calculation dates and events to FND and to integrate concepts related to scheduled interest rate related events that were previously embedded in DER to make them available for broader use."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules.rdf version of this ontology was modified to rename (migrate) the hasDefinition property to isDefinedIn to clarify intent."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/"})

(def AuctionDateRule
  {:db/ident :fibo-sec-sec-sch/AuctionDateRule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/"},
   :rdfs/label "auction date rule",
   :rdfs/subClassOf :fibo-fnd-dt-bd/BusinessRecurrenceIntervalConvention,
   :skos/definition
   "business recurrence interval convention that is a published rule for defining the date of some auction event"})

(def CalculationEvent
  {:db/ident :fibo-sec-sec-sch/CalculationEvent,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-fnd-dt-oc/CalculationEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/"}})

(def CalculationPeriod
  {:db/ident :fibo-sec-sec-sch/CalculationPeriod,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-fnd-dt-fd/CalculationPeriod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/"}})

(def CalculationPeriodLength
  {:db/ident :fibo-sec-sec-sch/CalculationPeriodLength,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-fnd-dt-fd/CalculationPeriodLength,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/"}})

(def DateReturnedBySettlementDateRule
  {:db/ident :fibo-sec-sec-sch/DateReturnedBySettlementDateRule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/"},
   :rdfs/label "date returned by settlement date rule",
   :rdfs/subClassOf #{{:owl/allValuesFrom :fibo-sec-sec-sch/SettlementDateRule,
                       :owl/onProperty    :cmns-dsg/isDefinedIn,
                       :rdf/type          :owl/Restriction}
                      :fibo-fnd-dt-fd/CalculatedDate},
   :skos/definition "calculated date that is determined via a settlement rule"})

(def DateReturnedByTradingDateRule
  {:db/ident :fibo-sec-sec-sch/DateReturnedByTradingDateRule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/"},
   :rdfs/label "date returned by trading date rule",
   :rdfs/subClassOf #{:fibo-fnd-dt-fd/CalculatedDate
                      {:owl/allValuesFrom :fibo-sec-sec-sch/TradingDateRule,
                       :owl/onProperty    :cmns-dsg/isDefinedIn,
                       :rdf/type          :owl/Restriction}},
   :skos/definition "calculated date that is determined via a trading rule"})

(def FloatingRateNoteDate
  {:cmns-av/abbreviation "FRN date",
   :db/ident :fibo-sec-sec-sch/FloatingRateNoteDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/"},
   :rdfs/label "floating-rate note date",
   :rdfs/subClassOf #{{:owl/onClass :fibo-sec-sec-sch/FloatingRateNoteDateRule,
                       :owl/onProperty :fibo-fnd-dt-bd/hasBusinessDayAdjustment,
                       :owl/qualifiedCardinality 1,
                       :rdf/type :owl/Restriction}
                      :fibo-fnd-dt-fd/CalculatedDate},
   :skos/definition
   "calculated date associated with a floating-rate note, also known as a floater or FRN, which is a debt instrument with a variable interest rate"})

(def FloatingRateNoteDateRule
  {:cmns-av/abbreviation "FRN date rule",
   :db/ident :fibo-sec-sec-sch/FloatingRateNoteDateRule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/"},
   :rdfs/label "floating-rate note date rule",
   :rdfs/subClassOf :fibo-fnd-dt-bd/BusinessDayAdjustment,
   :skos/definition
   "business day adjustment rule applied to floating-rate note instruments"})

(def InternationalMoneyMarketAustralianDollarTradingDateRule
  {:cmns-av/abbreviation "IMM AUD trading date rule",
   :cmns-av/adaptedFrom
   {:xsd/anyURI
    "http://www.asx.com.au/documents/products/90-Day-bank-bill-futures-factsheet.pdf"},
   :db/ident
   :fibo-sec-sec-sch/InternationalMoneyMarketAustralianDollarTradingDateRule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/"},
   :rdfs/label
   "International Money Market (IMM) Australian Dollar (AUD) trading date rule",
   :rdfs/subClassOf :fibo-sec-sec-sch/TradingDateRule,
   :skos/definition
   "trading date rule defined as the last trading day of an Australian Stock Exchange (ASX) 90-Day Bank Accepted Futures and Options product, one Sydney business day preceding the second Friday of the relevant settlement month"})

(def InternationalMoneyMarketCanadianDollarTradingDateRule
  {:cmns-av/abbreviation "IMM CAD trading date rule",
   :cmns-av/explanatoryNote
   "If the determined day is a bourse or bank holiday in Toronto or Montreal, the last trading day shall be the previous bank business day, per the Canadian Derivatives Exchange BAX contract specification. The above description implies a Date Roll Rule which is presumably referenced by referring to this rule, so that when this rule is referenced, there would be no Date Roll Rule defined in the FpML message. Semantically, this is still a Date Roll Rule, specifically a \"Roll forward\" rule with no modification (the third Wednesday of a month will never roll forward to a day in the following month so no Modified rule is required).",
   :db/ident
   :fibo-sec-sec-sch/InternationalMoneyMarketCanadianDollarTradingDateRule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/"},
   :rdfs/label
   "International Money Market (IMM) Canadian Dollar (CAD) trading date rule",
   :rdfs/subClassOf #{:fibo-sec-sec-sch/TradingDateRule
                      {:owl/hasValue   :fibo-fnd-dt-bd/BusinessDayPreceding,
                       :owl/onProperty :fibo-fnd-dt-bd/hasBusinessDayConvention,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "trading date rule defined as the last trading day / expiration day of the Canadian Derivatives Exchange (Bourse do Montreal Inc.), three month Bankers' Acceptance Futures (Ticker symbol BAX), the second London banking day prior to the third Wednesday of the contract month"})

(def InternationalMoneyMarketNewZealandDollarTradingDateRule
  {:cmns-av/abbreviation "IMM NZD trading date rule",
   :db/ident
   :fibo-sec-sec-sch/InternationalMoneyMarketNewZealandDollarTradingDateRule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/"},
   :rdfs/label
   "International Money Market (IMM) New Zealand Dollar (NZD) trading date rule",
   :rdfs/subClassOf :fibo-sec-sec-sch/TradingDateRule,
   :skos/definition
   "trading date rule defined as the last trading day of an Australian Stock Exchange (ASX) New Zealand (NZ) 90-Day Bank Accepted Futures and Options product, the first Wednesday after the ninth day of the relevant settlement month"})

(def InternationalMoneyMarketSettlementDateRule
  {:cmns-av/abbreviation "IMM settlement date rule",
   :cmns-av/explanatoryNote
   "The International Money Market (IMM) is a division of the Chicago Mercantile Exchange (CME) that deals with the trading of currency and interest rate futures and options.",
   :db/ident :fibo-sec-sec-sch/InternationalMoneyMarketSettlementDateRule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/"},
   :rdfs/label "International Money Market (IMM) settlement date rule",
   :rdfs/subClassOf :fibo-sec-sec-sch/SettlementDateRule,
   :skos/definition
   "settlement date rule as defined in the International Money Market (IMM) settlement dates calendar"})

(def NonRollingDate
  {:db/ident :fibo-sec-sec-sch/NonRollingDate,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-dt/ExplicitDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/"}})

(def ParametricSchedule
  {:db/ident :fibo-sec-sec-sch/ParametricSchedule,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-fnd-dt-fd/RegularSchedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/"}})

(def PeriodicScheduledEventDate
  {:db/ident :fibo-sec-sec-sch/PeriodicScheduledEventDate,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-dt/Date,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/"}})

(def RuleDeterminedDate
  {:db/ident :fibo-sec-sec-sch/RuleDeterminedDate,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-fnd-dt-fd/CalculatedDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/"}})

(def ScheduledCalculationPeriodEndEvent
  {:cmns-av/explanatoryNote
   "Note that this is not necessarily the same as the day before the next period's start date. Calculation schedules specify periods of time, with a start and an end as well as a duration, with the end date being determined by some convention or published list of dates. FpML for CalculationPeriod 'A type defining the parameters used in the calculation of a fixed or floating rate calculation period amount. This type forms part of cashflows representation of a swap stream.'",
   :db/ident :fibo-sec-sec-sch/ScheduledCalculationPeriodEndEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/"},
   :rdfs/label "scheduled calculation period end event",
   :rdfs/subClassOf :fibo-fnd-dt-oc/OccurrenceKind,
   :skos/definition "the end date of a specific calculation period"})

(def ScheduledCalculationPeriodStartEvent
  {:cmns-av/explanatoryNote
   "FpML for CalculationPeriod 'A type defining the parameters used in the calculation of a fixed or floating rate calculation period amount. This type forms part of cashflows representation of a swap stream.'",
   :db/ident :fibo-sec-sec-sch/ScheduledCalculationPeriodStartEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/"},
   :rdfs/label "scheduled calculation period start event",
   :rdfs/subClassOf :fibo-fnd-dt-oc/OccurrenceKind,
   :skos/definition "the start of a specific calculation period"})

(def SettlementDateRule
  {:db/ident :fibo-sec-sec-sch/SettlementDateRule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/"},
   :rdfs/label "settlement date rule",
   :rdfs/subClassOf :fibo-fnd-dt-bd/BusinessRecurrenceIntervalConvention,
   :skos/definition
   "convention for determining settlement dates by reference to some jurisdiction or as set by a given exchange or similar venue"})

(def TradingDateRule
  {:cmns-av/explanatoryNote
   "Corresponds to several ISDA FpML enumeration entries for determining Calculation Date, but refers to other kinds of trading date defined in those calendars. These include Canadian, Australian and New Zealand dates. Note also that some of these have roll rules included within them for when the date determined by the specification returns a non working day, while others explicitly return a business day and require no date roll rule. At least one is silent on this matter.",
   :db/ident :fibo-sec-sec-sch/TradingDateRule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/"},
   :rdfs/label "trading date rule",
   :rdfs/subClassOf :fibo-fnd-dt-bd/BusinessRecurrenceIntervalConvention,
   :skos/definition
   "convention for determining trading dates defined with reference to some trading date calendar published by some trading facility or exchange"})

(def USTreasuryBillAuctionDateRule
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.treasurydirect.gov/instit/auctfund/work/work.htm"},
   :cmns-av/explanatoryNote
   "To finance the public debt, the U.S. Treasury sells bills, notes, bonds, Floating Rate Notes (FRNs), and Treasury Inflation-Protected Securities (TIPS) to institutional and individual investors through public auctions. Treasury auctions occur regularly and have a set schedule. Rules and other information are available via announcements of pending auctions.",
   :db/ident :fibo-sec-sec-sch/USTreasuryBillAuctionDateRule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/"},
   :rdfs/label "US Treasury bill auction date rule",
   :rdfs/subClassOf #{{:owl/hasValue   :fibo-fnd-dt-bd/BusinessDayFollowing,
                       :owl/onProperty :fibo-fnd-dt-bd/hasBusinessDayConvention,
                       :rdf/type       :owl/Restriction}
                      :fibo-sec-sec-sch/AuctionDateRule},
   :skos/definition "rule for setting auction dates for US Treasury bills"})

(def USTreasuryBillDate
  {:cmns-av/explanatoryNote
   "Per FpML notes/definition, this is every Monday except on New York holidays when it will be on a Tuesday.",
   :db/ident :fibo-sec-sec-sch/USTreasuryBillDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/"},
   :rdfs/label "US Treasury bill date",
   :rdfs/subClassOf
   #{{:owl/onClass    :fibo-sec-sec-sch/USTreasuryBillAuctionDateRule,
      :owl/onProperty :fibo-fnd-dt-bd/hasBusinessDayAdjustment,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction} :fibo-fnd-dt-fd/CalculatedDate},
   :skos/definition "auction date for US 13 week and 26 week Treasury bills"})

(def urn:uuid:e6dd5cb1-cdca-5066-bbd4-1849b93151f5
  {:cmns-av/copyright
   #{"Copyright (c) 2016-2024 EDM Council, Inc."
     "Copyright (c) 2018-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines concepts related to parametric schedules, including how to represent individual schedules as well as related date periods, explicit dates, and other concepts needed for parametric schedule representation.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/BusinessDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/ParametricSchedules/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Parametric Schedules Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules.rdf version of this ontology was modified to address text formatting hygiene issues."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules.rdf version of this ontology was modified to eliminate circular definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules.rdf version of this ontology was modified to eliminate a hygiene issue related to parametric schedule."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules.rdf version of this ontology was modified to move the property, 'is conferred on' to the Legal Capacity ontology and to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules.rdf version of this ontology was modified to move certain very general concepts related to calculation dates and events to FND and to integrate concepts related to scheduled interest rate related events that were previously embedded in DER to make them available for broader use."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules.rdf version of this ontology was modified to rename (migrate) the hasDefinition property to isDefinedIn to clarify intent."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/"})