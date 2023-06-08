(ns net.wikipunk.rdf.fibo-sec-sec-sch
  "This ontology defines concepts related to parametric schedules, including how to represent individual schedules as well as related date periods, explicit dates, and other concepts needed for parametric schedule representation."
  {:cmns-av/copyright ["Copyright (c) 2016-2023 EDM Council, Inc."
                       "Copyright (c) 2018-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
   :dcterms/abstract
   "This ontology defines concepts related to parametric schedules, including how to represent individual schedules as well as related date periods, explicit dates, and other concepts needed for parametric schedule representation.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://www.omg.org/spec/Commons/Designators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/BusinessDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/Occurrences/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/DatesAndTimes/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/ParametricSchedules/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-sec-sch",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
   :rdfs/label "Parametric Schedules Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules.rdf version of this ontology was modified to move the property, 'is conferred on' to the Legal Capacity ontology and to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules.rdf version of this ontology was modified to rename (migrate) the hasDefinition property to isDefinedIn to clarify intent."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules.rdf version of this ontology was modified to address text formatting hygiene issues."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules.rdf version of this ontology was modified to eliminate circular definitions."]})

(def AuctionDateRule
  "a business recurrence interval convention that is a published rule for defining the date of some auction event"
  {:db/ident :fibo-sec-sec-sch/AuctionDateRule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
   :rdfs/label "auction date rule",
   :rdfs/subClassOf :fibo-fnd-dt-bd/BusinessRecurrenceIntervalConvention,
   :skos/definition
   "a business recurrence interval convention that is a published rule for defining the date of some auction event"})

(def CalculationPeriod
  "date period defined as the number of days from the start to the scheduled end of the computation window"
  {:db/ident :fibo-sec-sec-sch/CalculationPeriod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
   :rdfs/label "calculation period",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :cmns-dt/hasStartDate,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :cmns-dt/hasEndDate,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :fibo-sec-sec-sch/CalculationPeriodLength,
                      :owl/onProperty :cmns-dt/hasDuration,
                      :rdf/type       :owl/Restriction}
                     :cmns-dt/DatePeriod],
   :skos/definition
   "date period defined as the number of days from the start to the scheduled end of the computation window"})

(def CalculationPeriodLength
  "an explicit duration defined as the number of days from the adjusted effective or start date to the adjusted termination or end date calculated in accordance with the applicable day count fraction"
  {:db/ident :fibo-sec-sec-sch/CalculationPeriodLength,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
   :rdfs/label "calculation period length",
   :rdfs/subClassOf :cmns-dt/ExplicitDuration,
   :skos/definition
   "an explicit duration defined as the number of days from the adjusted effective or start date to the adjusted termination or end date calculated in accordance with the applicable day count fraction"})

(def DateReturnedBySettlementDateRule
  "a rule-determined date that is a published rule for defining the date returned by settlement date"
  {:db/ident :fibo-sec-sec-sch/DateReturnedBySettlementDateRule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
   :rdfs/label "date returned by settlement date rule",
   :rdfs/subClassOf [{:owl/allValuesFrom :fibo-sec-sec-sch/SettlementDateRule,
                      :owl/onProperty    :cmns-dsg/isDefinedIn,
                      :rdf/type          :owl/Restriction}
                     :fibo-sec-sec-sch/RuleDeterminedDate
                     :fibo-fnd-dt-fd/CalculatedDate],
   :skos/definition
   "a rule-determined date that is a published rule for defining the date returned by settlement date"})

(def DateReturnedByTradingDateRule
  "a rule-determined date that is a published rule for defining the date returned by trading date"
  {:db/ident :fibo-sec-sec-sch/DateReturnedByTradingDateRule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
   :rdfs/label "date returned by trading date rule",
   :rdfs/subClassOf [{:owl/allValuesFrom :fibo-sec-sec-sch/TradingDateRule,
                      :owl/onProperty    :cmns-dsg/isDefinedIn,
                      :rdf/type          :owl/Restriction}
                     :fibo-sec-sec-sch/RuleDeterminedDate
                     :fibo-fnd-dt-fd/CalculatedDate],
   :skos/definition
   "a rule-determined date that is a published rule for defining the date returned by trading date"})

(def FloatingRateNoteDate
  "a calculated date associated with a floating-rate note, also known as a floater or FRN, which is a debt instrument with a variable interest rate"
  {:cmns-av/abbreviation "FRN date",
   :db/ident :fibo-sec-sec-sch/FloatingRateNoteDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
   :rdfs/label "floating-rate note date",
   :rdfs/subClassOf [{:owl/onClass :fibo-sec-sec-sch/FloatingRateNoteDateRule,
                      :owl/onProperty :fibo-fnd-dt-bd/hasBusinessDayAdjustment,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-dt-fd/CalculatedDate],
   :skos/definition
   "a calculated date associated with a floating-rate note, also known as a floater or FRN, which is a debt instrument with a variable interest rate"})

(def FloatingRateNoteDateRule
  "a business day adjustment rule applied to floating-rate note instruments"
  {:cmns-av/abbreviation "FRN date rule",
   :db/ident :fibo-sec-sec-sch/FloatingRateNoteDateRule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
   :rdfs/label "floating-rate note date rule",
   :rdfs/subClassOf :fibo-fnd-dt-bd/BusinessDayAdjustment,
   :skos/definition
   "a business day adjustment rule applied to floating-rate note instruments"})

(def InternationalMoneyMarketAustralianDollarTradingDateRule
  "a trading date rule defined as the last trading day of an Australian Stock Exchange (ASX) 90-Day Bank Accepted Futures and Options product, one Sydney business day preceding the second Friday of the relevant settlement month"
  {:cmns-av/abbreviation "IMM AUD trading date rule",
   :cmns-av/adaptedFrom
   "http://www.asx.com.au/documents/products/90-Day-bank-bill-futures-factsheet.pdf",
   :db/ident
   :fibo-sec-sec-sch/InternationalMoneyMarketAustralianDollarTradingDateRule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
   :rdfs/label
   "International Money Market (IMM) Australian Dollar (AUD) trading date rule",
   :rdfs/subClassOf [:fibo-sec-sec-sch/TradingDateRule
                     :fibo-fnd-dt-bd/BusinessRecurrenceIntervalConvention],
   :skos/definition
   "a trading date rule defined as the last trading day of an Australian Stock Exchange (ASX) 90-Day Bank Accepted Futures and Options product, one Sydney business day preceding the second Friday of the relevant settlement month"})

(def InternationalMoneyMarketCanadianDollarTradingDateRule
  "a trading date rule defined as the last trading day / expiration day of the Canadian Derivatives Exchange (Bourse do Montreal Inc.), three month Bankers' Acceptance Futures (Ticker symbol BAX), the second London banking day prior to the third Wednesday of the contract month"
  {:cmns-av/abbreviation "IMM CAD trading date rule",
   :db/ident
   :fibo-sec-sec-sch/InternationalMoneyMarketCanadianDollarTradingDateRule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
   :rdfs/label
   "International Money Market (IMM) Canadian Dollar (CAD) trading date rule",
   :rdfs/subClassOf [{:owl/hasValue   :fibo-fnd-dt-bd/BusinessDayPreceding,
                      :owl/onProperty :fibo-fnd-dt-bd/hasBusinessDayConvention,
                      :rdf/type       :owl/Restriction}
                     :fibo-sec-sec-sch/TradingDateRule
                     :fibo-fnd-dt-bd/BusinessRecurrenceIntervalConvention],
   :skos/definition
   "a trading date rule defined as the last trading day / expiration day of the Canadian Derivatives Exchange (Bourse do Montreal Inc.), three month Bankers' Acceptance Futures (Ticker symbol BAX), the second London banking day prior to the third Wednesday of the contract month",
   :skos/editorialNote
   "(continued within FpML definition): If the determined day is a bourse or bank holiday in Toronto or Montreal, the last trading day shall be the previous bank business day. Per Canadian Derivatives Exchange BAX contract specification. The above description implies a Date Roll Rule which is presumably referenced by referring to this rule, so that when this rule is referenced, there would be no Date Roll Rule defined in the FpML message. Semantically, this is still a Date Roll Rule, specifically a \"Roll forward\" rule with no modification (the third Wednesday of a month will never roll forward to a day in the following month so no Modified rule is required)."})

(def InternationalMoneyMarketNewZealandDollarTradingDateRule
  "a trading date rule defined as the last trading day of an Australian Stock Exchange (ASX) New Zealand (NZ) 90-Day Bank Accepted Futures and Options product, the first Wednesday after the ninth day of the relevant settlement month"
  {:cmns-av/abbreviation "IMM NZD trading date rule",
   :db/ident
   :fibo-sec-sec-sch/InternationalMoneyMarketNewZealandDollarTradingDateRule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
   :rdfs/label
   "International Money Market (IMM) New Zealand Dollar (NZD) trading date rule",
   :rdfs/subClassOf [:fibo-sec-sec-sch/TradingDateRule
                     :fibo-fnd-dt-bd/BusinessRecurrenceIntervalConvention],
   :skos/definition
   "a trading date rule defined as the last trading day of an Australian Stock Exchange (ASX) New Zealand (NZ) 90-Day Bank Accepted Futures and Options product, the first Wednesday after the ninth day of the relevant settlement month"})

(def InternationalMoneyMarketSettlementDateRule
  "a settlement date rule as defined in the International Money Market (IMM) settlement dates calendar"
  {:cmns-av/abbreviation "IMM settlement date rule",
   :cmns-av/explanatoryNote
   "The International Money Market (IMM) is a division of the Chicago Mercantile Exchange (CME) that deals with the trading of currency and interest rate futures and options.",
   :db/ident :fibo-sec-sec-sch/InternationalMoneyMarketSettlementDateRule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
   :rdfs/label "International Money Market (IMM) settlement date rule",
   :rdfs/subClassOf [:fibo-sec-sec-sch/SettlementDateRule
                     :fibo-fnd-dt-bd/BusinessRecurrenceIntervalConvention],
   :skos/definition
   "a settlement date rule as defined in the International Money Market (IMM) settlement dates calendar"})

(def NonRollingDate
  "an explicit date that equates to a calendar date with no adjustments and with no reference to any date specification"
  {:db/ident :fibo-sec-sec-sch/NonRollingDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
   :rdfs/label "non-rolling date",
   :rdfs/subClassOf :cmns-dt/ExplicitDate,
   :skos/definition
   "an explicit date that equates to a calendar date with no adjustments and with no reference to any date specification"})

(def ParametricSchedule
  "a regular, parameterized schedule typically used for the calculation of payments for coupons, dividends, and interest"
  {:db/ident :fibo-sec-sec-sch/ParametricSchedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
   :rdfs/label "parametric schedule",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-dt-fd/hasRecurrenceStartDate,
                      :owl/someValuesFrom
                      :fibo-sec-sec-sch/PeriodicScheduledEventDate,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-dt-fd/RegularSchedule],
   :skos/definition
   "a regular, parameterized schedule typically used for the calculation of payments for coupons, dividends, and interest",
   :skos/editorialNote
   "This is a schedule for one of the events that occur in a periodic schedule of interest accruals, interest payments, and (for floating rate swapstreams), changes to the interest rate. These may be specified individually but more commonly the Calculation event is the one scheduled according to this kind of parametric schedule, with the other dates specified as an offset to these. Here we have allowed for each of the related dates to be independently parametrically scheduled. The notional amount step schedule is a separate kind of schedule, with similar terms but without a period length. For calculation schedules (and possibly payments, resets), there is a different end date to the end /start of the period, since events may be specified as being on specific dates - this is where the Roll Convention comes in. This has the same basic concepts as the generic schedule shown as the parent to this. However, where the upper model has Date with various applicable sub types (known i.e. calendar, specified or determined). For example, an ISDA FpML schedule has a Specified Date (via a convention), and then has a date roll rule which is specified for the whole schedule and applies to each of the dates returned by the parametric specification of the schedule. It has: A schedule beginning and end; A set of regular repeating periods: the scheduled event takes place once per period; Optionally one or two stubs (one start and one end); these may be longer than the repeating period, or shorter. The precise parameters used are: Start of the overall Schedule period: Effective Date End of the overall Schedule period: Termination Date Start of first regular period: not specified (assume Effective Date?) Length of each regular period: Frequency (actually a duration) There are generally three ways in which the regular periods of a parametric schedule may be expressed: first plus last first plus period length last plus period length event date plus period length. In FpML, Roll events (the date that something rolls over from the value used in one period to the value used in the next) is defined in a Roll Convention, which may be a day of the month, a day of the week, or some published set of dates, typically the ISDA quarterly dates for these events. This is therefore the date within the regular period (before adjustments) when the event occurs. This is in addition so a date for the start or end of such a period. In general this applies to the Calculation Schedule (i.e. the event is the calculation event) with other dates specified relative to this, however in principle the other related events (payment and reset or refix) are specified relative to this. It is not immediately clear what specification of a date replaces the Roll event convention element when this happens."})

(def PeriodicScheduledEventDate
  "the date on which a schedule event occurs in some parametric schedule"
  {:db/ident :fibo-sec-sec-sch/PeriodicScheduledEventDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
   :rdfs/label "periodic scheduled event date",
   :rdfs/subClassOf [{:owl/unionOf [:fibo-fnd-dt-bd/DayOfMonth
                                    :fibo-fnd-dt-bd/DayOfWeek
                                    :fibo-fnd-dt-bd/EndOfMonth
                                    :fibo-sec-sec-sch/NonRollingDate
                                    :fibo-sec-sec-sch/RuleDeterminedDate],
                      :rdf/type    :owl/Class}
                     :cmns-dt/Date],
   :skos/definition
   "the date on which a schedule event occurs in some parametric schedule"})

(def RuleDeterminedDate
  "a date determined by the application of some rule"
  {:db/ident :fibo-sec-sec-sch/RuleDeterminedDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
   :rdfs/label "rule-determined date",
   :rdfs/subClassOf :fibo-fnd-dt-fd/CalculatedDate,
   :skos/definition "a date determined by the application of some rule"})

(def ScheduledCalculationPeriodEndEvent
  "the end date of a specific calculation period"
  {:cmns-av/explanatoryNote
   "Note that this is not necessarily the same as the day before the next period's start date. Calculation schedules specify periods of time, with a start and an end as well as a duration, with the end date being determined by some convention or published list of dates. FpML for CalculationPeriod 'A type defining the parameters used in the calculation of a fixed or floating rate calculation period amount. This type forms part of cashflows representation of a swap stream.'",
   :db/ident :fibo-sec-sec-sch/ScheduledCalculationPeriodEndEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
   :rdfs/label "scheduled calculation period end event",
   :rdfs/subClassOf :fibo-fnd-dt-oc/OccurrenceKind,
   :skos/definition "the end date of a specific calculation period"})

(def ScheduledCalculationPeriodStartEvent
  "the start of a specific calculation period"
  {:cmns-av/explanatoryNote
   "FpML for CalculationPeriod 'A type defining the parameters used in the calculation of a fixed or floating rate calculation period amount. This type forms part of cashflows representation of a swap stream.'",
   :db/ident :fibo-sec-sec-sch/ScheduledCalculationPeriodStartEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
   :rdfs/label "scheduled calculation period start event",
   :rdfs/subClassOf :fibo-fnd-dt-oc/OccurrenceKind,
   :skos/definition "the start of a specific calculation period"})

(def SettlementDateRule
  "a rule for determining dates by reference to some calendar or specification of settlement dates"
  {:db/ident :fibo-sec-sec-sch/SettlementDateRule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
   :rdfs/label "settlement date rule",
   :rdfs/subClassOf :fibo-fnd-dt-bd/BusinessRecurrenceIntervalConvention,
   :skos/definition
   "a rule for determining dates by reference to some calendar or specification of settlement dates"})

(def TradingDateRule
  "a rule for dates defined with reference to some trading date calendar published by some trading facility or authority, such as a stock exchange"
  {:db/ident :fibo-sec-sec-sch/TradingDateRule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
   :rdfs/label "trading date rule",
   :rdfs/subClassOf :fibo-fnd-dt-bd/BusinessRecurrenceIntervalConvention,
   :skos/definition
   "a rule for dates defined with reference to some trading date calendar published by some trading facility or authority, such as a stock exchange",
   :skos/editorialNote
   "Corresponds to several ISDA FpML enumeration entries for determining Calculation Date, but refers to other kinds of trading date defined in those calendars. These include Canadian, Australian and New Zealand dates. Note also that some of these have roll rules included within them for when the date determined by the specification returns a non working day, while others explicitly return a business day and require no date roll rule. At least one is silent on this matter."})

(def USTreasuryBillAuctionDateRule
  "a rule for setting auction dates for US Treasury bills"
  {:cmns-av/adaptedFrom
   "https://www.treasurydirect.gov/instit/auctfund/work/work.htm",
   :cmns-av/explanatoryNote
   "To finance the public debt, the U.S. Treasury sells bills, notes, bonds, Floating Rate Notes (FRNs), and Treasury Inflation-Protected Securities (TIPS) to institutional and individual investors through public auctions. Treasury auctions occur regularly and have a set schedule. Rules and other information are available via announcements of pending auctions.",
   :db/ident :fibo-sec-sec-sch/USTreasuryBillAuctionDateRule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
   :rdfs/label "US Treasury bill auction date rule",
   :rdfs/subClassOf [{:owl/hasValue   :fibo-fnd-dt-bd/BusinessDayFollowing,
                      :owl/onProperty :fibo-fnd-dt-bd/hasBusinessDayConvention,
                      :rdf/type       :owl/Restriction}
                     :fibo-sec-sec-sch/AuctionDateRule
                     :fibo-fnd-dt-bd/BusinessRecurrenceIntervalConvention],
   :skos/definition "a rule for setting auction dates for US Treasury bills"})

(def USTreasuryBillDate
  "an auction date for US 13 week and 26 week Treasury bills"
  {:db/ident :fibo-sec-sec-sch/USTreasuryBillDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
   :rdfs/label "US Treasury bill date",
   :rdfs/subClassOf [{:owl/onClass
                      :fibo-sec-sec-sch/USTreasuryBillAuctionDateRule,
                      :owl/onProperty :fibo-fnd-dt-bd/hasBusinessDayAdjustment,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-dt-fd/CalculatedDate],
   :skos/definition "an auction date for US 13 week and 26 week Treasury bills",
   :skos/editorialNote
   "Per FpML notes/definition, this is every Monday except on New York holidays when it will be on a Tuesday."})