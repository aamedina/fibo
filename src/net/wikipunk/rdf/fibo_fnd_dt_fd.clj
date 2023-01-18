(ns net.wikipunk.rdf.fibo-fnd-dt-fd
  "This ontology provides definitions of date and schedule concepts for use in other FIBO ontologies."
  {:cmns-av/copyright ["Copyright (c) 2014-2023 Object Management Group, Inc."
                       "Copyright (c) 2014-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :dcterms/abstract
   "This ontology provides definitions of date and schedule concepts for use in other FIBO ontologies.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Arrangements/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-arr-arr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfa/prefix "fibo-fnd-dt-fd",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "Financial Dates Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/ version of this ontology was revised to add hasOpeningDateTime and hasClosingDateTime for use in defining trading days and sessions and eliminated the functional property declaration on hasExplicitDate."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/ version of this ontology was revised to eliminate deprecated elements."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/ version of this ontology was revised to move dated collection and dated collection constituent as well as hasObservedDateTime and hasAcquisitionDate to financial dates in order to improve usability, simplify reasoning, made definitions ISO 704 compliant, and eliminate redundant restrictions on ad hoc schedule entry."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/ version of this ontology was revised to add the 'has date added' property, which is needed for the date a constituent is added to a basket, among other purposes, to add a TimeOfDay class, needed for representing rate reset times, eliminate duplication with concepts in LCC, and make AdHocScheduleEntry a child of DatedCollectionConstituent."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/ version of this ontology was revised to introduce a composite date datatype to allow for cases whereby the representation of a date for certain purposes, such as GLEIF LEI data, is inconsistent, and to facilitate mapping FIBO to multiple data sources in user environments."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/ version of this ontology was revised by the FIBO FND 1.2 RTF in order to introduce the definition of a time interval, which is a location, to ground some of the concepts such as a date period, and duration as well as to support the definition of business recurrence intervals for use in parametric schedules for securities."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates.rdf version of this ontology was modified to remove a functional declaration on hasObservedDateTime, which causes reasoning inconsistencies when there are multiple uses of that property for certain individuals, such as for LEI registration."
    "This ontology was added to Foundations in advance of the December 2014 Long Beach meeting in support of the SEC specification. It is also needed to provide temporal relationships for Ownership and Control.\n\nThese three ontologies are designed for use together:\n\n\t* FinancialDates -- financial Dates and Schedules\n\t* BusinessDates -- business day adjustments\n\t* Occurrences -- occurrences (events) and kinds of occurrences\n\nThey are modularized this way to minimize the ontological committments that are imposed upon ontologies that rely upon them. Ontologies can import FinancialDates alone, or FinancialDates + BusinessDates, or FinancialDates + Occurrences, or all three together."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates.rdf version of this ontology was modified to address hygiene issues with respect to text formatting."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates.rdf version of this ontology was modified to add notes on the custom CombinedDateTime datatype indicating that it is outside the RL profile and that if someone wants to use this ontology with OWL 2 RL rules they might want to comment this out / eliminate it where it is used."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/ version of this ontology was revised by the FIBO 2.0 RFC in order to introduce the definition of a time instant, to eliminate a reasoning issue with relative dates, and remove a circular dependency inadvertently incorporated in the ontology with a FIBO FND 1.2 modification."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/ version of this ontology was revised to add the concept of age and a corresponding property that supports its use."]})

(def AdHocSchedule
  "schedule consisting of some number of individual events that are not necessarily recurring"
  {:cmns-av/usageNote
   "Other ontologies can extend AdHocSchedule and/or AdHocScheduleEntry as needed to relate the date to something. In particular, the Occurrences ontology extends AdHocScheduleEntry to associate an OccurrenceKind with each entry. The intended meaning is that an Occurrence of the OccurrenceKind happens on the corresponding Date.",
   :db/ident :fibo-fnd-dt-fd/AdHocSchedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "ad hoc schedule",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-arr/hasConstituent,
                      :owl/someValuesFrom :fibo-fnd-dt-fd/AdHocScheduleEntry,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-fd/Schedule],
   :skos/definition
   "schedule consisting of some number of individual events that are not necessarily recurring"})

(def AdHocScheduleEntry
  "entry, including a date or date and time, among multiple non-regularly-recurring entries in a schedule"
  {:cmns-av/usageNote
   ["The fibo-fnd-dt-fd;hasDate property may be used to reify a date, if it is important to do so for a given application, or if not and typically, the inherited fibo-fnd-dt-fd;hasObservedDateTime property may be used together with a fibo-fnd-dt-fd;CombinedDateTime value, as long as the resulting schedule is consistent in using one or the other."
    "The Date of an AdHocScheduleEntry can be an ExplicitDate or any kind of CalculatedDate, such as:\n\n* An OccurrenceBasedDate -- a Date that itself is defined by an Occurrence (see the Occurrences ontology)\n* A RelativeDate - a Date relative to another Date, such as T+3\n* A SpecifiedDate - a Date that is defined by an arbitrary rule"
    "Other ontologies can extend AdHocScheduleEntry as needed. In particular, the Occurrences ontology extends AdHocScheduleEntry to consist of occurrences (events) of a given OccurrenceKind. The meaning is that an ad hoc schedule entry comprises a date and an event which is scheduled to occur on that date."],
   :db/ident :fibo-fnd-dt-fd/AdHocScheduleEntry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "ad hoc schedule entry",
   :rdfs/subClassOf :fibo-fnd-dt-fd/DatedCollectionConstituent,
   :skos/definition
   "entry, including a date or date and time, among multiple non-regularly-recurring entries in a schedule"})

(def Age
  "length of time that something or someone has been alive or existed"
  {:db/ident :fibo-fnd-dt-fd/Age,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "age",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-dt-fd/hasAsOfDate,
                      :owl/someValuesFrom :fibo-fnd-dt-fd/ExplicitDate,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-fd/Duration],
   :skos/definition
   "length of time that something or someone has been alive or existed"})

(def CalculatedDate
  "date that is or will be determined based on some formula"
  {:cmns-av/explanatoryNote
   "The hasDateValue property of a CalculatedDate is not set until the Date is calculated. Since the calculation may depend upon future events that may or may not ever happen, the hasDateValue property may never be set.",
   :db/ident :fibo-fnd-dt-fd/CalculatedDate,
   :owl/disjointWith :fibo-fnd-dt-fd/ExplicitDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "calculated date",
   :rdfs/subClassOf :fibo-fnd-dt-fd/Date,
   :skos/definition "date that is or will be determined based on some formula"})

(def CalendarMonth
  "time interval resulting from the division of a calendar year in 12 time intervals, each with a specific name and containing a specific number of calendar days"
  {:cmns-av/adaptedFrom "ISO 8601, clause 2.2.11",
   :db/ident :fibo-fnd-dt-fd/CalendarMonth,
   :rdf/type [:fibo-fnd-dt-fd/CalendarPeriod :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "calendar month",
   :skos/definition
   "time interval resulting from the division of a calendar year in 12 time intervals, each with a specific name and containing a specific number of calendar days"})

(def CalendarPeriod
  "time interval that occurs within a system that fixes the beginning and length of a segment of the year with respect to that system"
  {:cmns-av/explanatoryNote
   "A calendar-specified date may be figured with respect to a calendar week, a calendar month, a calendar quarter, or a calendar year.",
   :db/ident :fibo-fnd-dt-fd/CalendarPeriod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "calendar period",
   :rdfs/subClassOf :fibo-fnd-dt-fd/TimeInterval,
   :skos/definition
   "time interval that occurs within a system that fixes the beginning and length of a segment of the year with respect to that system",
   :skos/editorialNote
   "The terms 'calendar xxx' are intended to reinforce that these are periods on a calendar, not durations. \n\nFor example, a calendar year always starts on a January 1 and ends on a December 31. The term 'calendar year' does not mean the same thing as a duration (an amount of time) of 1 year, nor can a calendar year start on any arbitrary day of a year. For example, a calendar year never starts on September 1.\n\nSimilar points apply to other kinds of calendar periods, such as calendar week, calendar month, and calendar quarter."})

(def CalendarQuarter
  "time interval of 3 months, starting on January 1, April 1, July 1, or October 1"
  {:db/ident :fibo-fnd-dt-fd/CalendarQuarter,
   :rdf/type [:fibo-fnd-dt-fd/CalendarPeriod :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "calendar quarter",
   :skos/definition
   "time interval of 3 months, starting on January 1, April 1, July 1, or October 1"})

(def CalendarSpecifiedInterval
  "recurrence interval that is defined as the nth day of some calendar period (such as a calendar month), and a time direction (forward from the beginning of the month, or backwards from the end)"
  {:cmns-av/explanatoryNote
   "The nth day is an ordinal number, not a cardinal number. '1' means the first day of the calendar period.",
   :db/ident :fibo-fnd-dt-fd/CalendarSpecifiedInterval,
   :owl/disjointWith :fibo-fnd-dt-fd/ExplicitRecurrenceInterval,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "calendar-specified interval",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fnd-dt-fd/CalendarPeriod,
                      :owl/onProperty :fibo-fnd-dt-fd/hasCalendarPeriod,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onDataRange :xsd/integer,
                      :owl/onProperty  :fibo-fnd-dt-fd/hasOrdinalNumber,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-dt-fd/TimeDirection,
                      :owl/onProperty :fibo-fnd-dt-fd/hasTimeDirection,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-dt-fd/RecurrenceInterval],
   :skos/definition
   "recurrence interval that is defined as the nth day of some calendar period (such as a calendar month), and a time direction (forward from the beginning of the month, or backwards from the end)",
   :skos/example
   ["The last day of each quarter, specified as RelativeDay 1, and TimeDirection set to FromEnd."
    "The 15th day of each calendar month."]})

(def CalendarWeek
  "time interval of seven calendar days starting on a Monday"
  {:cmns-av/adaptedFrom "ISO 8601, clause 2.2.8",
   :db/ident :fibo-fnd-dt-fd/CalendarWeek,
   :rdf/type [:fibo-fnd-dt-fd/CalendarPeriod :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "calendar week",
   :skos/definition
   "time interval of seven calendar days starting on a Monday"})

(def CalendarYear
  "cyclic time interval in a calendar which is required for one revolution of the Earth around the Sun and approximated to an integral number of calendar days; a year in the Gregorian calendar"
  {:cmns-av/adaptedFrom "ISO 8601 clause 2.2.13",
   :db/ident :fibo-fnd-dt-fd/CalendarYear,
   :rdf/type [:fibo-fnd-dt-fd/CalendarPeriod :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "calendar year",
   :skos/definition
   "cyclic time interval in a calendar which is required for one revolution of the Earth around the Sun and approximated to an integral number of calendar days; a year in the Gregorian calendar"})

(def CombinedDateTime
  "datatype that maps to several base types for dates and times"
  {:cmns-av/usageNote
   ["Valid values must use the ISO 8601 representation for a date, or the corresponding XML Schema Datatypes representation for a date and time, or date and time including the time zone."
    "The use of custom datatypes is outside the OWL 2 RL profile and so users should consider commenting this and its usage here, and in other ontologies out, or replacing it with rdfs:Literal out in applications that are constrained to OWL 2 RL."],
   :db/ident :fibo-fnd-dt-fd/CombinedDateTime,
   :owl/equivalentClass
   {:owl/unionOf [:xsd/string :xsd/dateTime :xsd/dateTimeStamp],
    :rdf/type    :rdfs/Datatype},
   :rdf/type :rdfs/Datatype,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "combined date time",
   :skos/definition
   "datatype that maps to several base types for dates and times",
   :skos/scopeNote
   "There are many cases where the representation of a date may or may not include a time, and where the underlying data representation varies. This composite datatype should only be used in cases where a standard representation using one of the options in the union for date or date and time value specification does not work."})

(def Date
  "calendar day on some calendar"
  {:cmns-av/usageNote
   "A Date may or may not have a value, and may be explicit or calculated. A Date that has a value is one that is either explicitly set as a literal when it is created, or is some form of CalculatedDate. In an instance of Date, the existence of the 'hasDateValue' property both indicates that the Date is known, and gives the value of the Date. A Date that does not have a value is one that is some form of CalculatedDate, in which the actual date has not (yet) been established.",
   :db/ident :fibo-fnd-dt-fd/Date,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "date",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-dt-fd/hasDateValue,
                      :rdf/type        :owl/Restriction}
                     :fibo-fnd-dt-fd/TimeInstant],
   :skos/definition "calendar day on some calendar"})

(def DatePeriod
  "time span over one or more calendar days, defined by at least two of three properties: (1) a start date, (2) an end date, and (3) a duration"
  {:cmns-av/explanatoryNote
   "Note that if more than one of these properties is missing, the DatePeriod is invalid.",
   :cmns-av/usageNote
   "A DatePeriod is unknown if either the startDate or the endDate has no value. If a DatePeriod is unknown, then the duration should either be omitted or unknown (have no value).",
   :db/ident :fibo-fnd-dt-fd/DatePeriod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "date period",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :fibo-fnd-dt-fd/Duration,
                      :owl/onProperty :fibo-fnd-dt-fd/hasDuration,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :fibo-fnd-dt-fd/Date,
                      :owl/onProperty :fibo-fnd-dt-fd/hasStartDate,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-dt-fd/TimeInterval
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :fibo-fnd-dt-fd/Date,
                      :owl/onProperty :fibo-fnd-dt-fd/hasEndDate,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "time span over one or more calendar days, defined by at least two of three properties: (1) a start date, (2) an end date, and (3) a duration"})

(def DateTime
  "time point including a date and a time, optionally including a time zone offset"
  {:cmns-av/usageNote
   "'hasDateTimeValue' is omitted if the DateTime is not (yet) known. Note that the time zone is implicitly GMT.",
   :db/ident :fibo-fnd-dt-fd/DateTime,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "date time",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/dateTime,
                      :owl/onProperty  :fibo-fnd-dt-fd/hasDateTimeValue,
                      :rdf/type        :owl/Restriction}
                     :fibo-fnd-dt-fd/TimeInstant],
   :skos/definition
   "time point including a date and a time, optionally including a time zone offset"})

(def DateTimeStamp
  "time point including a date and a time that requires a time zone offset"
  {:cmns-av/synonym "time stamp",
   :cmns-av/usageNote
   "'hasDateTimeStampValue' is omitted if the DateTimeStamp is not (yet) established.",
   :db/ident :fibo-fnd-dt-fd/DateTimeStamp,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "date time stamp",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/dateTimeStamp,
                      :owl/onProperty  :fibo-fnd-dt-fd/hasDateTimeStampValue,
                      :rdf/type        :owl/Restriction}
                     :fibo-fnd-dt-fd/TimeInstant],
   :skos/definition
   "time point including a date and a time that requires a time zone offset"})

(def DatedCollectionConstituent
  "element of a collection that is associated with a date and time"
  {:cmns-av/explanatoryNote
   "Note that the use of several options for the representation of a date and time stamp enables extensions for milliseconds, nanoseconds using an xsd:string that has the format of an xsd:dateTime datatype but extends the level of granularity consistently. An example of where this is required is to represent prices that change multiple times in a given day.",
   :cmns-av/usageNote
   "The use of custom datatypes is outside the OWL 2 RL profile and so users should consider commenting out the restriction on hasObservedDateTime altogether or change the data range to rdfs:Literal in applications that are constrained to OWL 2 RL.",
   :db/ident :fibo-fnd-dt-fd/DatedCollectionConstituent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "dated collection constituent",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-dt-fd/hasObservedDateTime,
                      :owl/someValuesFrom :fibo-fnd-dt-fd/CombinedDateTime,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-arr/CollectionConstituent],
   :skos/definition
   "element of a collection that is associated with a date and time"})

(def DatedStructuredCollection
  "structured collection whose elements are required to have a date and time"
  {:db/ident :fibo-fnd-dt-fd/DatedStructuredCollection,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "dated structured collection",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-arr-arr/hasConstituent,
                      :owl/someValuesFrom
                      :fibo-fnd-dt-fd/DatedCollectionConstituent,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-arr-arr/StructuredCollection],
   :skos/definition
   "structured collection whose elements are required to have a date and time"})

(def Day
  "explicit period of 24 hours"
  {:db/ident :fibo-fnd-dt-fd/Day,
   :fibo-fnd-dt-fd/hasDurationValue "P1D",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDuration :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "day"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "explicit period of 24 hours"}})

(def Duration
  "interval of time of some specific length"
  {:cmns-av/usageNote
   "The 'hasDurationValue' property is absent if the duration is not (yet) known.",
   :db/ident :fibo-fnd-dt-fd/Duration,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "duration",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-dt-fd/hasDurationValue,
                      :rdf/type        :owl/Restriction}
                     :fibo-fnd-dt-fd/TimeInterval],
   :skos/definition "interval of time of some specific length"})

(def ExplicitDate
  "date in which the 'hasDateValue' property is required"
  {:db/ident :fibo-fnd-dt-fd/ExplicitDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "explicit date",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-dt-fd/hasDateValue,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     :fibo-fnd-dt-fd/Date],
   :skos/definition "date in which the 'hasDateValue' property is required"})

(def ExplicitDatePeriod
  "date period for which the start date, end date, and/or duration are required"
  {:cmns-av/usageNote
   "As with DatePeriod, any one of {start date, end date, duration} may be omitted because the missing property can be inferred from the other two.",
   :db/ident :fibo-fnd-dt-fd/ExplicitDatePeriod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "explicit date period",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :fibo-fnd-dt-fd/ExplicitDuration,
                      :owl/onProperty :fibo-fnd-dt-fd/hasDuration,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :fibo-fnd-dt-fd/ExplicitDate,
                      :owl/onProperty :fibo-fnd-dt-fd/hasStartDate,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :fibo-fnd-dt-fd/ExplicitDate,
                      :owl/onProperty :fibo-fnd-dt-fd/hasEndDate,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-dt-fd/DatePeriod],
   :skos/definition
   "date period for which the start date, end date, and/or duration are required"})

(def ExplicitDuration
  "duration for which the 'hasDurationValue' property must have a value"
  {:cmns-av/explanatoryNote
   "This class is used when a duration is guaranteed to be known when it is created.",
   :db/ident :fibo-fnd-dt-fd/ExplicitDuration,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "explicit duration",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-dt-fd/hasDurationValue,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     :fibo-fnd-dt-fd/Duration],
   :skos/definition
   "duration for which the 'hasDurationValue' property must have a value"})

(def ExplicitRecurrenceInterval
  "recurrence interval defined via an explicit duration"
  {:db/ident :fibo-fnd-dt-fd/ExplicitRecurrenceInterval,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "explicit recurrence interval",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-dt-fd/hasDurationValue,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     :fibo-fnd-dt-fd/RecurrenceInterval],
   :skos/definition "recurrence interval defined via an explicit duration"})

(def Friday
  "time interval that has duration 1 day and that meets a Saturday"
  {:db/ident :fibo-fnd-dt-fd/Friday,
   :rdf/type [:fibo-fnd-dt-fd/TimeInterval :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "Friday",
   :skos/definition
   "time interval that has duration 1 day and that meets a Saturday"})

(def FromEnd
  "time direction indicating that a calendar-specified date is the nth date from the end of a calendar period"
  {:db/ident :fibo-fnd-dt-fd/FromEnd,
   :rdf/type [:fibo-fnd-dt-fd/TimeDirection :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "from the end",
   :skos/definition
   "time direction indicating that a calendar-specified date is the nth date from the end of a calendar period",
   :skos/example "Two days before the end of a calendar month."})

(def FromStart
  "time direction indicating that a calendar-specified date is the nth day from the beginning of a calendar period."
  {:db/ident :fibo-fnd-dt-fd/FromStart,
   :rdf/type [:fibo-fnd-dt-fd/TimeDirection :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "from the start",
   :skos/definition
   "time direction indicating that a calendar-specified date is the nth day from the beginning of a calendar period.",
   :skos/example
   "The first day of a calendar quarter. (The offsetDay is zero.)"})

(def Monday
  "time interval that has duration 1 day and that meets a Tuesday"
  {:db/ident :fibo-fnd-dt-fd/Monday,
   :rdf/type [:fibo-fnd-dt-fd/TimeInterval :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "Monday",
   :skos/definition
   "time interval that has duration 1 day and that meets a Tuesday"})

(def RecurrenceInterval
  "time interval that is consistent between elements of a regular schedule"
  {:cmns-av/synonym "frequency",
   :db/ident :fibo-fnd-dt-fd/RecurrenceInterval,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "recurrence interval",
   :rdfs/subClassOf :fibo-fnd-dt-fd/TimeInterval,
   :skos/definition
   "time interval that is consistent between elements of a regular schedule"})

(def RegularSchedule
  "schedule whose time intervals recur regularly"
  {:cmns-av/explanatoryNote
   "A RegularSchedule is a Schedule defined as a set of Dates that start on a recurrence start date and repeat after each recurrence interval. The size of this set is defined by a count.\n\nThe 'initial ScheduleStub' associated with a RegularSchedule identifies any special treatment applied before the recurrence start date. Similarly, a 'final ScheduleStub' identifies any special handling at the end of the recurrences. For example, a mortgage loan that is due each calendar month may have an initial payment due before the first calendar month, or a final payment due after the last monthly payment.",
   :cmns-av/usageNote
   ["Other ontologies can extend RegularSchedule as needed.\n\nIn particular, the Occurrences ontology extends RegularSchedule to 'comprise' an 'OccurrenceKind'. The intended meaning is that a regular schedule comprises a number of scheduled dates and an event which is scheduled to occur on each of those dates, in other words an Occurrence of the OccurrenceKind should happen on each Date defined by the RegularSchedule."
    "The recurrence start date can be an ExplicitDate or any kind of CalculatedDate. Hence, the starting date could be relative to another Date (e.g. T+3) or triggered by the Occurrence of an OccurrenceKind, etc.\n\nThe recurrence start date can also be relative to the starting Date of the overall DatePeriod of the Schedule."],
   :db/ident :fibo-fnd-dt-fd/RegularSchedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "regular schedule",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-dt-fd/ScheduleStub,
                      :owl/onProperty :fibo-fnd-dt-fd/hasFinalStub,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-dt-fd/ScheduleStub,
                      :owl/onProperty :fibo-fnd-dt-fd/hasInitialStub,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-dt-fd/Schedule
                     {:owl/onProperty     :fibo-fnd-dt-fd/hasRecurrenceInterval,
                      :owl/someValuesFrom :fibo-fnd-dt-fd/RecurrenceInterval,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-dt-fd/hasRecurrenceStartDate,
                      :owl/someValuesFrom :fibo-fnd-dt-fd/Date,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-dt-fd/hasCount,
                      :owl/someValuesFrom :xsd/positiveInteger,
                      :rdf/type           :owl/Restriction}],
   :skos/definition "schedule whose time intervals recur regularly",
   :skos/editorialNote
   "The BusinessDates ontology extends 'RegularSchedule' with an optional BusinessDayAdjustment that specifies what should happen if a scheduled date falls on a weekend or a holiday.",
   :skos/example
   ["A 30 year mortgage is payable monthly on the 10th of the month, starting July 2015. The mortgage is issued on June 15, 2015 so the first payment is for the period June 15-June 30, and the last payment is for June 1-14 2045.\n\nThe payment schedule is a RegularSchedule with these properties:\n\n* comprises: regular payment OccurrenceKind (with payment details) (see the 'comprises' property of the Occurrences ontology)\n* hasInitialStub: June 15-30, 2015 for initial payment\n* hasFinalStub: June 1-14, 2045 for final payment\n* hasCount: 358\n* hasOverallPeriod starting Date: June 15, 2015 with a duration of 30 years\n* hasRecurrenceInterval: specifies 10th day of each calendar month\n* hasRecurrenceStartDate: July 1, 2015"
    "A corporate bond pays interest for 10 years starting on the first day of 2015. Interest payments are due 15 days after the expiration of each 6 month period: on July 15 and January 16.\n\nThe payment schedule is a RegularSchedule, with these properties:\n\n* comprises: identifies the interest payment details\n* overall DatePeriod starting date is '2015-01-01', ending date is '2025-01-15', and duration is 'P10Y15D'\n* hasCount is 20 (2 payments per year for 10 years)\n* hasRecurrenceInterval is 'P6M'\n* hasRecurrenceStartDate is '2015-01-15'"]})

(def RelativeDate
  "calculated date that is some duration before or after another date"
  {:cmns-av/explanatoryNote
   "When the 'hasRelativeDuration' property is negative, the RelativeDate is before the 'isRelativeTo' Date; otherwise the RelativeDate is after the 'isRelativeTo' Date.",
   :db/ident :fibo-fnd-dt-fd/RelativeDate,
   :owl/disjointWith :fibo-fnd-dt-fd/SpecifiedDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "relative date",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-dt-fd/hasRelativeDuration,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     :fibo-fnd-dt-fd/CalculatedDate
                     {:owl/onClass    :fibo-fnd-dt-fd/Date,
                      :owl/onProperty :fibo-fnd-dt-fd/isRelativeTo,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "calculated date that is some duration before or after another date",
   :skos/example
   "A settlement date, defined as T+3: three days after the trade date. The 'hasRelativeDuration' property is set to '3D'."})

(def Saturday
  "time interval that has duration 1 day and that meets a Sunday"
  {:cmns-av/explanatoryNote
   "One Saturday is the time interval that has duration 1 day and that starts Gregorian year 2000. This requirement anchors the repeating sequence of days of week to specific Gregorian days. It requires that January 1, 2000 is a Saturday. It follows that January 2, 2000 must be the Sunday that it meets, and so on.",
   :db/ident :fibo-fnd-dt-fd/Saturday,
   :rdf/type [:fibo-fnd-dt-fd/TimeInterval :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "Saturday",
   :skos/definition
   "time interval that has duration 1 day and that meets a Sunday"})

(def Schedule
  "collection of events, observations, or other occurrences and the associated dates and/or times when they will be done"
  {:cmns-av/explanatoryNote
   "The overall period covers the entire DatePeriod of the Schedule, from the earliest Date to the final Date of the Schedule. Schedules may be ad hoc, essentially a list of dates and events without any consistency in the durations between events, regular, in which case there is a consistently recurring interval between events, or a combination of the two.",
   :db/ident :fibo-fnd-dt-fd/Schedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "schedule",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fnd-dt-fd/DatePeriod,
                      :owl/onProperty :fibo-fnd-dt-fd/hasOverallPeriod,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :lcc-lr/Collection],
   :skos/definition
   "collection of events, observations, or other occurrences and the associated dates and/or times when they will be done"})

(def ScheduleStub
  "date period before the start of the recurring part of a schedule or after the end of the recurring part, which may be associated with a specific occurrence kind"
  {:db/ident :fibo-fnd-dt-fd/ScheduleStub,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "schedule stub",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fnd-dt-fd/DatePeriod,
                      :owl/onProperty :fibo-fnd-dt-fd/hasDatePeriod,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :lcc-lr/Collection],
   :skos/definition
   "date period before the start of the recurring part of a schedule or after the end of the recurring part, which may be associated with a specific occurrence kind",
   :skos/editorialNote
   "The Occurrences ontology extends ScheduleStub to 'comprise' an OccurrenceKind. The meaning is that a schedule stub comprises a date period and an event which is scheduled to occur during that date period; in other words that an Occurrence of the OccurrenceKind should happen during the DatePeriod of the ScheduleStub.",
   :skos/example
   "A 30 year mortgage calls for monthly payments on the first day of each month, according to a RegularSchedule. If the mortgage does not start on the first day of a calendar month, then an initial ScheduleStub specifies the payment due for the DatePeriod up to the first day of the next calendar month. Similarly, a final ScheduleStub specifies the last payment due for the DatePeriod after the end of the last full calendar month."})

(def SpecifiedDate
  "calculated date that is defined by a rule that is captured as a string by the 'hasDateSpecification' property"
  {:db/ident :fibo-fnd-dt-fd/SpecifiedDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "specified date",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-dt-fd/hasDateSpecification,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     :fibo-fnd-dt-fd/CalculatedDate],
   :skos/definition
   "calculated date that is defined by a rule that is captured as a string by the 'hasDateSpecification' property"})

(def Sunday
  "time interval that has duration 1 day and that meets a Monday"
  {:db/ident :fibo-fnd-dt-fd/Sunday,
   :rdf/type [:fibo-fnd-dt-fd/TimeInterval :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "Sunday",
   :skos/definition
   "time interval that has duration 1 day and that meets a Monday"})

(def Thursday
  "time interval that has duration 1 day and that meets a Friday"
  {:db/ident :fibo-fnd-dt-fd/Thursday,
   :rdf/type [:fibo-fnd-dt-fd/TimeInterval :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "Thursday",
   :skos/definition
   "time interval that has duration 1 day and that meets a Friday"})

(def TimeDirection
  "enumeration that indicates whether a calendar-specified date is figured from the start or the end of a calendar period"
  {:db/ident :fibo-fnd-dt-fd/TimeDirection,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "time direction",
   :skos/definition
   "enumeration that indicates whether a calendar-specified date is figured from the start or the end of a calendar period"})

(def TimeInstant
  "temporal entity that is a member of a time scale, with no extent or duration"
  {:cmns-av/adaptedFrom ["http://www.omg.org/spec/DTV/"
                         "https://www.w3.org/TR/owl-time/#time:Instant"],
   :cmns-av/explanatoryNote
   ["For scales that have a granularity specified in days, a date is a time point; for scales down to the seconds, the equivalent of an xsd:dateTime or xsd:dateTimeStamp is a time point."
    "The duration of each time interval that is an instance of the time point is the granularity of the time scale of the time point."],
   :cmns-av/synonym ["instant in time" "time point"],
   :db/ident :fibo-fnd-dt-fd/TimeInstant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "time instant",
   :rdfs/seeAlso ["http://www.w3.org/2006/time#Instant"],
   :skos/definition
   "temporal entity that is a member of a time scale, with no extent or duration",
   :skos/example
   "The Battle of Hastings was on '14 October 1066'. (This gives the Julian date of the battle at a granularity of 'day'. If desired, the battle could be given more precisely as a time period within that calendar day.)"})

(def TimeInterval
  "segment of the time axis, a location in time, with an extent or duration"
  {:cmns-av/adaptedFrom ["http://www.omg.org/spec/DTV/"
                         "https://www.w3.org/TR/owl-time/#time:Interval"],
   :cmns-av/explanatoryNote
   ["Every time interval has a beginning, an end, and a duration, even if not known. Every time interval is 'finite', a bounded segment of the time axis. The beginning or end of a time interval may be defined by reference to events that occur for a time interval that is not known."
    "Time intervals may be indefinite, meaning that their beginning is primordiality or their end is perpetuity, or both (eternity). This vocabulary assumes that indefinite time intervals exist and have some duration, but their duration is unknown."],
   :db/ident :fibo-fnd-dt-fd/TimeInterval,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "time interval",
   :rdfs/seeAlso ["http://www.w3.org/2006/time#Interval"],
   :skos/definition
   "segment of the time axis, a location in time, with an extent or duration",
   :skos/example ["the day whose Gregorian calendar date is September 11, 2001"
                  "the lifetime of Henry V"]})

(def TimeOfDay
  "explicit time, according to a clock"
  {:cmns-av/usageNote
   "The representation similar to xsd:dateTime, but should exclude the date component and time zone. The value of the hasTimeValue property roughly corresponds to xsd:time in XML schema datatypes, which is prohibited from use in OWL due to ambiguity in its definition. Use of TimeOfDay with a business center would enable inferred time zone, using the hasBusinessCenter property from Business Dates.",
   :db/ident :fibo-fnd-dt-fd/TimeOfDay,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "time of day",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-dt-fd/hasTimeValue,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     :fibo-fnd-dt-fd/TimeInstant],
   :skos/definition "explicit time, according to a clock"})

(def Tuesday
  "time interval that has duration 1 day and that meets a Wednesday"
  {:db/ident :fibo-fnd-dt-fd/Tuesday,
   :rdf/type [:fibo-fnd-dt-fd/TimeInterval :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "Tuesday",
   :skos/definition
   "time interval that has duration 1 day and that meets a Wednesday"})

(def Wednesday
  "time interval that has duration 1 day and that meets a Thursday"
  {:db/ident :fibo-fnd-dt-fd/Wednesday,
   :rdf/type [:fibo-fnd-dt-fd/TimeInterval :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "Wednesday",
   :skos/definition
   "time interval that has duration 1 day and that meets a Thursday"})

(def hasAcquisitionDate
  "links an asset or owner/controller/controllee to the date or date and time of purchase"
  {:cmns-av/usageNote
   "The use of custom datatypes is outside the OWL 2 RL profile and so users should consider commenting out the range restriction or change the range to rdfs:Literal in applications that are constrained to OWL 2 RL.",
   :db/ident :fibo-fnd-dt-fd/hasAcquisitionDate,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has acquisition date",
   :rdfs/range :fibo-fnd-dt-fd/CombinedDateTime,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasObservedDateTime,
   :skos/definition
   "links an asset or owner/controller/controllee to the date or date and time of purchase"})

(def hasAge
  "relates something to the length of time it has existed"
  {:db/ident :fibo-fnd-dt-fd/hasAge,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has age",
   :rdfs/range :fibo-fnd-dt-fd/Duration,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasDuration,
   :skos/definition "relates something to the length of time it has existed"})

(def hasAsOfDate
  "relates something to the date on which it is accurate or valid (e.g. a credit report has an asOfDate that means the date when the information was drawn)"
  {:cmns-av/explanatoryNote
   "It is different from the creation date and need not be the last date of the DatePeriod covered.",
   :db/ident :fibo-fnd-dt-fd/hasAsOfDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has as-of date",
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasDate,
   :skos/definition
   "relates something to the date on which it is accurate or valid (e.g. a credit report has an asOfDate that means the date when the information was drawn)"})

(def hasCalendarPeriod
  "identifies a period of time used in computing a calendar-specified date, such as a calendar week, calendar month, calendar quarter, or calendar year"
  {:db/ident :fibo-fnd-dt-fd/hasCalendarPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has calendar period",
   :rdfs/range :fibo-fnd-dt-fd/CalendarPeriod,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition
   "identifies a period of time used in computing a calendar-specified date, such as a calendar week, calendar month, calendar quarter, or calendar year"})

(def hasClosingDateTime
  "the day and time at which something closes"
  {:cmns-av/usageNote
   "The use of custom datatypes is outside the OWL 2 RL profile and so users should consider commenting out the range restriction or change the range to rdfs:Literal in applications that are constrained to OWL 2 RL.",
   :db/ident :fibo-fnd-dt-fd/hasClosingDateTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has closing date time"},
   :rdfs/range :fibo-fnd-dt-fd/CombinedDateTime,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasObservedDateTime,
   :skos/definition {:rdf/language "en",
                     :rdf/value "the day and time at which something closes"}})

(def hasCount
  "specifies the total number of things in a collection, such as the number of entries in a regular schedule"
  {:db/ident :fibo-fnd-dt-fd/hasCount,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has count",
   :rdfs/range :xsd/positiveInteger,
   :skos/definition
   "specifies the total number of things in a collection, such as the number of entries in a regular schedule"})

(def hasDate
  "identifies a calendar day, month and year"
  {:db/ident :fibo-fnd-dt-fd/hasDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has date",
   :rdfs/range :fibo-fnd-dt-fd/Date,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition "identifies a calendar day, month and year"})

(def hasDateAdded
  "indicates the date something was included in something else"
  {:db/ident :fibo-fnd-dt-fd/hasDateAdded,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has date added",
   :rdfs/range :fibo-fnd-dt-fd/ExplicitDate,
   :rdfs/subPropertyOf [:fibo-fnd-dt-fd/hasStartDate
                        :fibo-fnd-dt-fd/hasExplicitDate],
   :skos/definition
   "indicates the date something was included in something else"})

(def hasDatePeriod
  "identifies a specific window of time, including a start date, end date and/or duration"
  {:db/ident :fibo-fnd-dt-fd/hasDatePeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has date period",
   :rdfs/range :fibo-fnd-dt-fd/DatePeriod,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition
   "identifies a specific window of time, including a start date, end date and/or duration"})

(def hasDateReceived
  "relates something to the date it arrived or was delivered, e.g., a loan application request"
  {:db/ident :fibo-fnd-dt-fd/hasDateReceived,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has date received",
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasDate,
   :skos/definition
   "relates something to the date it arrived or was delivered, e.g., a loan application request"})

(def hasDateSpecification
  "rule that specifies how a specified date is computed"
  {:db/ident :fibo-fnd-dt-fd/hasDateSpecification,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fnd-dt-fd/SpecifiedDate,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has date specification",
   :rdfs/range :xsd/string,
   :skos/definition "rule that specifies how a specified date is computed",
   :skos/editorialNote
   "The rule is modeled as a simple String because OWL2 provides no way to model the semantics of such a rule."})

(def hasDateTime
  "identifies a specific date and time of day, excluding the time zone"
  {:db/ident :fibo-fnd-dt-fd/hasDateTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has date time",
   :rdfs/range :fibo-fnd-dt-fd/DateTime,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition
   "identifies a specific date and time of day, excluding the time zone"})

(def hasDateTimeStamp
  "identifies a specific date and time of day, including the time zone"
  {:db/ident :fibo-fnd-dt-fd/hasDateTimeStamp,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has date time stamp",
   :rdfs/range :fibo-fnd-dt-fd/DateTimeStamp,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition
   "identifies a specific date and time of day, including the time zone"})

(def hasDateTimeStampValue
  "specifies an actual literal (explicit) date and time, including the time zone"
  {:db/ident :fibo-fnd-dt-fd/hasDateTimeStampValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has date time stamp value",
   :rdfs/range :xsd/dateTimeStamp,
   :skos/definition
   "specifies an actual literal (explicit) date and time, including the time zone"})

(def hasDateTimeValue
  "specifies an actual literal (explicit) date and time"
  {:db/ident :fibo-fnd-dt-fd/hasDateTimeValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has date time value",
   :rdfs/range :xsd/dateTime,
   :skos/definition "specifies an actual literal (explicit) date and time"})

(def hasDateValue
  "specifies an actual literal (explicit) date captured in the format specified for xsd:date (i.e., ISO 8601 format), WITHOUT the time or timezone information; the semantics are identical to those of xsd:date"
  {:cmns-av/usageNote
   "For consistency with FPML (reference FPML Coding Schemes 30 June 2014, Version 1.56, section 2.1.1), the year MUST be specified as 4 digits, and the month and day MUST be specified as 2 digits with a leading zero if needed. Times and timezones should NOT be specified.",
   :db/ident :fibo-fnd-dt-fd/hasDateValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has date value",
   :rdfs/range :xsd/string,
   :skos/definition
   "specifies an actual literal (explicit) date captured in the format specified for xsd:date (i.e., ISO 8601 format), WITHOUT the time or timezone information; the semantics are identical to those of xsd:date",
   :skos/example "2002-10-10 means October 10, 2002"})

(def hasDuration
  "specifies the time during which something continues"
  {:cmns-av/usageNote
   "This duration may be omitted or unknown if either the start or end Date of the DatePeriod is a CalculatedDate or an ExplicitDate.",
   :db/ident :fibo-fnd-dt-fd/hasDuration,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has duration",
   :rdfs/range :fibo-fnd-dt-fd/Duration,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition "specifies the time during which something continues"})

(def hasDurationValue
  "specifies a literal (explicit) duration (amount of time) captured in the format specified for xsd:duration (i.e., ISO 8601 format); the semantics are identical to those of xsd:duration"
  {:cmns-av/usageNote
   "Negative durations are used to indicate relative dates that are before (rather than after) some other Date.",
   :db/ident :fibo-fnd-dt-fd/hasDurationValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fnd-dt-fd/Duration,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has duration value",
   :rdfs/range :xsd/string,
   :skos/definition
   "specifies a literal (explicit) duration (amount of time) captured in the format specified for xsd:duration (i.e., ISO 8601 format); the semantics are identical to those of xsd:duration",
   :skos/example
   ["PT4H means 4 hours"
    "PT6S means 6 seconds"
    "-P3D means negative 3 days duration. This is used with OffsetDates to specify 3 days before (prior) to some other Date."
    "P2M means 2 months"
    "P3D means 3 days"
    "P1Y means 1 year"
    "P1Y2M3DT4H5M6S means 1 year, 2 months, 3 days, 4 hours, 5 minutes, 6 seconds"
    "PT5M means 5 minutes"]})

(def hasEndDate
  "indicates the ending date of some Schedule or DatePeriod"
  {:db/ident :fibo-fnd-dt-fd/hasEndDate,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has end date",
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasDate,
   :skos/definition "indicates the ending date of some Schedule or DatePeriod"})

(def hasExplicitDate
  "indicates a stated date, as opposed to calculated or unknown date, associated with something"
  {:db/ident :fibo-fnd-dt-fd/hasExplicitDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has explicit date",
   :rdfs/range :fibo-fnd-dt-fd/ExplicitDate,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasDate,
   :skos/definition
   "indicates a stated date, as opposed to calculated or unknown date, associated with something"})

(def hasFinalStub
  "identifies any special period at the end of a regular schedule"
  {:db/ident :fibo-fnd-dt-fd/hasFinalStub,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has final stub",
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasStub,
   :skos/definition
   "identifies any special period at the end of a regular schedule"})

(def hasInitialStub
  "identifies any special period at the start of a regular schedule"
  {:db/ident :fibo-fnd-dt-fd/hasInitialStub,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has initial stub",
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasStub,
   :skos/definition
   "identifies any special period at the start of a regular schedule"})

(def hasObservedDateTime
  "indicates a date and time for an event, measurement, or other observation"
  {:cmns-av/usageNote
   "The use of custom datatypes is outside the OWL 2 RL profile and so users should consider commenting out the range restriction or change the range to rdfs:Literal in applications that are constrained to OWL 2 RL.",
   :db/ident :fibo-fnd-dt-fd/hasObservedDateTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has observed date and time",
   :rdfs/range :fibo-fnd-dt-fd/CombinedDateTime,
   :skos/definition
   "indicates a date and time for an event, measurement, or other observation"})

(def hasOpeningDateTime
  "the day and time at which something opens"
  {:cmns-av/usageNote
   "The use of custom datatypes is outside the OWL 2 RL profile and so users should consider commenting out the range restriction or change the range to rdfs:Literal in applications that are constrained to OWL 2 RL.",
   :db/ident :fibo-fnd-dt-fd/hasOpeningDateTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has opening date time"},
   :rdfs/range :fibo-fnd-dt-fd/CombinedDateTime,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasObservedDateTime,
   :skos/definition {:rdf/language "en",
                     :rdf/value "the day and time at which something opens"}})

(def hasOrdinalNumber
  "specifies a number designating place in an ordered sequence, i.e., 1st, 2nd, 3rd, etc."
  {:cmns-av/explanatoryNote
   "Negative ordinal numbers mean 1st before, 2nd before, etc.",
   :db/ident :fibo-fnd-dt-fd/hasOrdinalNumber,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has ordinal number",
   :rdfs/range :xsd/integer,
   :skos/definition
   "specifies a number designating place in an ordered sequence, i.e., 1st, 2nd, 3rd, etc."})

(def hasOverallPeriod
  "identifies a date period that includes all the dates of a schedule, including any schedule stubs"
  {:db/ident :fibo-fnd-dt-fd/hasOverallPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-dt-fd/Schedule,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has overall period",
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasDatePeriod,
   :skos/definition
   "identifies a date period that includes all the dates of a schedule, including any schedule stubs"})

(def hasRecurrenceInterval
  "indicates the frequency with which some event or publication occurs"
  {:db/ident :fibo-fnd-dt-fd/hasRecurrenceInterval,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has recurrence interval",
   :rdfs/range :fibo-fnd-dt-fd/RecurrenceInterval,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition
   "indicates the frequency with which some event or publication occurs"})

(def hasRecurrenceStartDate
  "the starting date of the first recurrence in a regular schedule"
  {:db/ident :fibo-fnd-dt-fd/hasRecurrenceStartDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has recurrence start date",
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasStartDate,
   :skos/definition
   "the starting date of the first recurrence in a regular schedule"})

(def hasRelativeDuration
  "duration between two explicit dates"
  {:cmns-av/explanatoryNote
   ["Note that this property is distinct from hasDurationValue, as a relative duration may resolve to a relative date or date time (both of which are time points) rather than an interval, which would result in a logical inconsistency if its parent property is hasDurationValue."
    "A relative duration may be negative."],
   :db/ident :fibo-fnd-dt-fd/hasRelativeDuration,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has relative duration",
   :rdfs/range :xsd/string,
   :skos/definition "duration between two explicit dates"})

(def hasSchedule
  "indicates a schedule for something"
  {:db/ident :fibo-fnd-dt-fd/hasSchedule,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has schedule",
   :rdfs/range :fibo-fnd-dt-fd/Schedule,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition "indicates a schedule for something"})

(def hasStartDate
  "indicates the initial date of something"
  {:db/ident :fibo-fnd-dt-fd/hasStartDate,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has start date",
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasDate,
   :skos/definition "indicates the initial date of something"})

(def hasStub
  "links an abbreviated period at the start or end of some schedule to the overall schedule"
  {:db/ident :fibo-fnd-dt-fd/hasStub,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-dt-fd/RegularSchedule,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has stub",
   :rdfs/range :fibo-fnd-dt-fd/ScheduleStub,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition
   "links an abbreviated period at the start or end of some schedule to the overall schedule"})

(def hasTimeDirection
  "indicates whether a calendar-specified date is figured from the beginning or end of a calendar period"
  {:db/ident :fibo-fnd-dt-fd/hasTimeDirection,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has time direction",
   :rdfs/range :fibo-fnd-dt-fd/TimeDirection,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition
   "indicates whether a calendar-specified date is figured from the beginning or end of a calendar period"})

(def hasTimeValue
  "specifies an explicit time, captured in the format specified for xsd:time (i.e., ISO 8601 format), WITHOUT the date or timezone information"
  {:db/ident :fibo-fnd-dt-fd/hasTimeValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "has time value",
   :rdfs/range :xsd/string,
   :skos/definition
   "specifies an explicit time, captured in the format specified for xsd:time (i.e., ISO 8601 format), WITHOUT the date or timezone information"})

(def isRelativeTo
  "identifies a specific date that a relative date or relative date period references"
  {:db/ident :fibo-fnd-dt-fd/isRelativeTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfs/label "is relative to",
   :rdfs/range :fibo-fnd-dt-fd/Date,
   :skos/definition
   "identifies a specific date that a relative date or relative date period references"})