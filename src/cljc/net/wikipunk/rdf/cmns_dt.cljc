(ns net.wikipunk.rdf.cmns-dt
  ^{:base       "https://www.omg.org/spec/Commons/DatesAndTimes/",
    :namespaces {"cmns-av"
                 "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
                 "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
                 "dcterms" "http://purl.org/dc/terms/",
                 "owl" "http://www.w3.org/2002/07/owl#",
                 "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                 "skos" "http://www.w3.org/2004/02/skos/core#",
                 "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix     "cmns-dt",
    :source     "https://www.omg.org/spec/Commons/DatesAndTimes/"}
  {:cmns-av/copyright #{"Copyright (c) 2014-2022 Object Management Group, Inc."
                        "Copyright (c) 2021-2022 agnos.ai U.K. Ltd"
                        "Copyright (c) 2014-2022 EDM Council, Inc."
                        "Copyright (c) 2014-2022 Thematix Partners LLC"},
   :dcterms/abstract
   "The dates and times ontology defines commonly used temporal concepts that cover those most frequently needed across domains, with a focus on terminology that is used in business applications. It is designed to be mappable to other date and time ontologies and specifications, such as the W3C Time Ontology in OWL (available at https://www.w3.org/TR/owl-time/), certain temporal elements in BFO 2020 (see https://basic-formal-ontology.org/bfo-2020.html), time concepts defined in schema.org, and the Object Management Group's Date Time Vocabulary (DTV) specification (available at https://www.omg.org/spec/DTV/), without the corresponding overhead or in some cases, issues. The concepts were originally derived from a number of date and time standards including ISO 8601:2004 Representation of Dates and Times. The ontology itself was derived from the Financial Industry Business Ontology (FIBO) Financial Dates ontology, with minor revisions to better reflect requirements for mapping to other ontologies.",
   :dcterms/contributor #{"Pete Rivett, agnos.ai U.K. Ltd"
                          "Elisa Kendall, Thematix Partners LLC"
                          "Mark Linehan, Thematix Partners LLC"},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :owl/imports {:xsd/anyURI
                 "https://www.omg.org/spec/Commons/AnnotationVocabulary/"},
   :owl/versionIRI {:xsd/anyURI
                    "https://www.omg.org/spec/Commons/20221101/DatesAndTimes/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Commons Dates and Times Ontology",
   :skos/changeNote
   "https://www.omg.org/spec/Commons/20220501/DatesAndTimes.rdf version of this ontology was modified to eliminate a double space in the scope note on CombinedDateTime (COMMONS-6).",
   :skos/note
   "The dates and times ontology conforms with the OWL 2 DL semantics, and is outside of OWL 2 RL due to the inclusion of exact cardinality constraints on explicit date, explicit duration and time of day. These constraints can be changed to maximum cardinality constraints if needed to support OWL RL rule-based applications that cannot be extended to support them.",
   :xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"})

(def CombinedDateTime
  {:db/ident :cmns-dt/CombinedDateTime,
   :owl/equivalentClass
   {:owl/unionOf [:xsd/string :xsd/dateTime :xsd/dateTimeStamp],
    :rdf/type    :rdfs/Datatype},
   :rdf/type :rdfs/Datatype,
   :rdfs/label "combined date time",
   :skos/definition
   "datatype that maps to several base types for dates and times",
   :skos/note
   "Valid values must use the ISO 8601 representation for a date, or the corresponding XML Schema Datatypes representation for a date and time, or date and time including the time zone.",
   :skos/scopeNote
   "There are many cases where the representation of a date may or may not include a time, and where the underlying data representation varies. This composite datatype should only be used in cases where a standard representation using one of the options in the union for date or date and time value specification does not work."})

(def Date
  {:db/ident :cmns-dt/Date,
   :rdf/type :owl/Class,
   :rdfs/label "date",
   :rdfs/subClassOf #{:cmns-dt/TimeInstant
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onDataRange :xsd/string,
                       :owl/onProperty  :cmns-dt/hasDateValue,
                       :rdf/type        :owl/Restriction}},
   :skos/definition "calendar day on some calendar",
   :skos/note
   "A date may or may not have a value, and may be explicit or calculated. A date that has a value is one that is either explicitly set as a literal when it is created, or is some form of 'calculated date'. In an instance of date, the existence of the 'has date value' property both indicates that the date is known, and gives the value of the date. A date that does not have a value is likely one that is some form of 'calculated date, in which the actual date has not (yet) been established."})

(def DatePeriod
  {:db/ident :cmns-dt/DatePeriod,
   :rdf/type :owl/Class,
   :rdfs/label "date period",
   :rdfs/subClassOf #{{:owl/maxQualifiedCardinality 1,
                       :owl/onClass    :cmns-dt/Duration,
                       :owl/onProperty :cmns-dt/hasDuration,
                       :rdf/type       :owl/Restriction}
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onClass    :cmns-dt/Date,
                       :owl/onProperty :cmns-dt/hasEndDate,
                       :rdf/type       :owl/Restriction} :cmns-dt/TimeInterval
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onClass    :cmns-dt/Date,
                       :owl/onProperty :cmns-dt/hasStartDate,
                       :rdf/type       :owl/Restriction}},
   :skos/definition "time span over one or more calendar days",
   :skos/note
   #{"A date period is unknown if either the start date or the end date has no value. If a date period is unknown, then the duration should either be omitted or unknown (have no value)."
     "A date period is defined by at least two of three properties: (1) a start date, (2) an end date, and (3) a duration. If more than one of these properties is missing, the date period may be invalid or unknown."}})

(def DateTime
  {:db/ident :cmns-dt/DateTime,
   :rdf/type :owl/Class,
   :rdfs/label "date time",
   :rdfs/subClassOf #{:cmns-dt/TimeInstant
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onDataRange :xsd/dateTime,
                       :owl/onProperty  :cmns-dt/hasDateTimeValue,
                       :rdf/type        :owl/Restriction}},
   :skos/definition
   "time point including a date and a time, optionally including a time zone offset",
   :skos/note
   "'has date time value' is omitted if the 'date time' is not (yet) known. The time zone is implicitly GMT."})

(def DateTimeStamp
  {:cmns-av/synonym "time stamp",
   :db/ident :cmns-dt/DateTimeStamp,
   :rdf/type :owl/Class,
   :rdfs/label "date time stamp",
   :rdfs/subClassOf #{:cmns-dt/TimeInstant
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onDataRange :xsd/dateTimeStamp,
                       :owl/onProperty  :cmns-dt/hasDateTimeStampValue,
                       :rdf/type        :owl/Restriction}},
   :skos/definition
   "time point including a date and a time that requires a time zone offset",
   :skos/note
   "'has date time stamp value' is omitted if the 'date time stamp' is not (yet) established."})

(def Day
  {:cmns-dt/hasDurationValue "P1D",
   :db/ident        :cmns-dt/Day,
   :rdf/type        #{:cmns-dt/ExplicitDuration :owl/NamedIndividual},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "day"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "explicit period of 24 hours"}})

(def Duration
  {:db/ident :cmns-dt/Duration,
   :rdf/type :owl/Class,
   :rdfs/label "duration",
   :rdfs/subClassOf #{:cmns-dt/TimeInterval
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onDataRange :xsd/string,
                       :owl/onProperty  :cmns-dt/hasDurationValue,
                       :rdf/type        :owl/Restriction}},
   :skos/definition "interval of time of some specific length",
   :skos/note
   "The 'has duration value' property is absent if the duration is not (yet) known."})

(def ExplicitDate
  {:db/ident        :cmns-dt/ExplicitDate,
   :rdf/type        :owl/Class,
   :rdfs/label      "explicit date",
   :rdfs/subClassOf #{:cmns-dt/Date
                      {:owl/onDataRange :xsd/string,
                       :owl/onProperty  :cmns-dt/hasDateValue,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}},
   :skos/definition "date in which the 'has date value' property is required"})

(def ExplicitDatePeriod
  {:db/ident :cmns-dt/ExplicitDatePeriod,
   :rdf/type :owl/Class,
   :rdfs/label "explicit date period",
   :rdfs/subClassOf #{{:owl/maxQualifiedCardinality 1,
                       :owl/onClass    :cmns-dt/ExplicitDuration,
                       :owl/onProperty :cmns-dt/hasDuration,
                       :rdf/type       :owl/Restriction}
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onClass    :cmns-dt/ExplicitDate,
                       :owl/onProperty :cmns-dt/hasStartDate,
                       :rdf/type       :owl/Restriction}
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onClass    :cmns-dt/ExplicitDate,
                       :owl/onProperty :cmns-dt/hasEndDate,
                       :rdf/type       :owl/Restriction} :cmns-dt/DatePeriod
                      :cmns-dt/ProperInterval},
   :skos/definition
   "date period for which the start date, end date, and/or duration are required",
   :skos/note
   "As with 'date period', any one of {start date, end date, duration} may be omitted because the missing property can be inferred from the other two."})

(def ExplicitDuration
  {:db/ident :cmns-dt/ExplicitDuration,
   :rdf/type :owl/Class,
   :rdfs/label "explicit duration",
   :rdfs/subClassOf #{:cmns-dt/Duration
                      {:owl/onDataRange :xsd/string,
                       :owl/onProperty  :cmns-dt/hasDurationValue,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}
                      :cmns-dt/ProperInterval},
   :skos/definition
   "duration for which the 'has duration value' property must have a value",
   :skos/note
   "This class is used when a duration is guaranteed to be known when it is created."})

(def ProperInterval
  {:db/ident :cmns-dt/ProperInterval,
   :dcterms/source {:xsd/anyURI
                    "https://www.w3.org/TR/owl-time/#time:ProperInterval"},
   :owl/disjointWith :cmns-dt/TimeInstant,
   :rdf/type :owl/Class,
   :rdfs/label "proper interval",
   :rdfs/subClassOf :cmns-dt/TimeInterval,
   :skos/definition "time interval with a non-zero extent or duration",
   :skos/note
   "Proper interval is included explicitly to enable mapping to the same term in the Time Ontology in OWL for use with the Allen intervals encoded therein."})

(def TemporalEntity
  {:db/ident        :cmns-dt/TemporalEntity,
   :rdf/type        :owl/Class,
   :rdfs/label      "temporal entity",
   :rdfs/seeAlso    :time/TemporalEntity,
   :skos/definition "time interval or instant"})

(def TimeInstant
  {:cmns-av/adaptedFrom #{{:xsd/anyURI
                           "https://www.w3.org/TR/owl-time/#time:Instant"}
                          {:xsd/anyURI "https://www.omg.org/spec/DTV/"}},
   :cmns-av/synonym #{"time point" "instant in time"},
   :db/ident :cmns-dt/TimeInstant,
   :rdf/type :owl/Class,
   :rdfs/label "time instant",
   :rdfs/subClassOf :cmns-dt/TemporalEntity,
   :skos/definition
   "temporal entity that is a member of a time scale, with no extent or duration",
   :skos/example
   "The Battle of Hastings was on '14 October 1066'. (This gives the Julian date of the battle at a granularity of 'day'. If desired, the battle could be given more precisely as a time period within that calendar day.)",
   :skos/note
   #{"For scales that have a granularity specified in days, a date is a time point; for scales down to the seconds, the equivalent of an xsd:dateTime or xsd:dateTimeStamp is a time point."
     "The duration of each time interval that is an instance of the time point is the granularity of the time scale of the time point."}})

(def TimeInterval
  {:cmns-av/adaptedFrom #{{:xsd/anyURI
                           "https://www.w3.org/TR/owl-time/#time:Interval"}
                          {:xsd/anyURI "https://www.omg.org/spec/DTV/"}},
   :db/ident :cmns-dt/TimeInterval,
   :rdf/type :owl/Class,
   :rdfs/label "time interval",
   :rdfs/subClassOf :cmns-dt/TemporalEntity,
   :skos/definition
   "segment of the time axis, a location in time, with an extent or duration",
   :skos/example #{"the day whose Gregorian calendar date is September 11, 2001"
                   "the lifetime of Henry V"},
   :skos/note
   #{"Every time interval has a beginning, an end, and a duration, even if not known. Every time interval is 'finite', a bounded segment of the time axis. The beginning or end of a time interval may be defined by reference to events that occur for a time interval that is not known."
     "Time intervals may be indefinite, meaning that their beginning is primordiality or their end is perpetuity, or both (eternity). This vocabulary assumes that indefinite time intervals exist and have some duration, but their duration is unknown."}})

(def TimeOfDay
  {:db/ident :cmns-dt/TimeOfDay,
   :rdf/type :owl/Class,
   :rdfs/label "time of day",
   :rdfs/subClassOf #{:cmns-dt/TimeInstant
                      {:owl/onDataRange :xsd/string,
                       :owl/onProperty  :cmns-dt/hasTimeValue,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}},
   :skos/definition "explicit time, according to a clock",
   :skos/note
   "The representation similar to xsd:dateTime, but should exclude the date component and time zone. The value of the has time value property roughly corresponds to xsd:time in XML schema datatypes, which is prohibited from use in OWL due to ambiguity in its definition."})

(def hasDate
  {:db/ident        :cmns-dt/hasDate,
   :rdf/type        :owl/ObjectProperty,
   :rdfs/label      "has date",
   :rdfs/range      :cmns-dt/Date,
   :skos/definition "identifies a calendar day, month and year"})

(def hasDatePeriod
  {:db/ident :cmns-dt/hasDatePeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has date period",
   :rdfs/range :cmns-dt/DatePeriod,
   :skos/definition
   "identifies a specific window of time, including a start date, end date and/or duration"})

(def hasDateTime
  {:db/ident :cmns-dt/hasDateTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has date time",
   :rdfs/range :cmns-dt/DateTime,
   :skos/definition
   "identifies a specific date and time of day, possibly excluding the time zone"})

(def hasDateTimeStamp
  {:db/ident :cmns-dt/hasDateTimeStamp,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has date time stamp",
   :rdfs/range :cmns-dt/DateTimeStamp,
   :skos/definition
   "identifies a specific date and time of day, explicitly including the time zone"})

(def hasDateTimeStampValue
  {:db/ident :cmns-dt/hasDateTimeStampValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "has date time stamp value",
   :rdfs/range :xsd/dateTimeStamp,
   :skos/definition
   "specifies an actual literal (explicit) date and time, including the time zone"})

(def hasDateTimeValue
  {:db/ident        :cmns-dt/hasDateTimeValue,
   :rdf/type        :owl/DatatypeProperty,
   :rdfs/label      "has date time value",
   :rdfs/range      :xsd/dateTime,
   :skos/definition "specifies an actual literal (explicit) date and time"})

(def hasDateValue
  {:db/ident :cmns-dt/hasDateValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "has date value",
   :rdfs/range :xsd/string,
   :skos/definition
   "specifies an actual literal (explicit) date captured in the format specified for xsd:date (i.e., ISO 8601 format), WITHOUT the time or timezone information; the semantics are identical to those of xsd:date",
   :skos/example "2002-10-10 means October 10, 2002",
   :skos/note
   "In the Finance domain, for consistency with FpML (reference FpML Coding Schemes 30 June 2014, Version 1.56, section 2.1.1), the year MUST be specified as 4 digits, and the month and day MUST be specified as 2 digits with a leading zero if needed. Times and timezones should NOT be specified."})

(def hasDuration
  {:db/ident :cmns-dt/hasDuration,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has duration",
   :rdfs/range :cmns-dt/Duration,
   :skos/definition "specifies the time during which something continues",
   :skos/note
   "This duration may be omitted or unknown if either the start or end Date of the DatePeriod is an ExplicitDate."})

(def hasDurationValue
  {:db/ident :cmns-dt/hasDurationValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :cmns-dt/Duration,
   :rdfs/label "has duration value",
   :rdfs/range :xsd/string,
   :skos/definition
   "specifies a literal (explicit) duration (amount of time) captured in the format specified for xsd:duration (i.e., ISO 8601 format); the semantics are identical to those of xsd:duration",
   :skos/example
   #{"P2M means 2 months" "PT5M means 5 minutes" "PT6S means 6 seconds"
     "PT4H means 4 hours" "P3D means 3 days"
     "P1Y2M3DT4H5M6S means 1 year, 2 months, 3 days, 4 hours, 5 minutes, 6 seconds"
     "P1Y means 1 year"
     "-P3D means negative 3 days duration. This is used with OffsetDates to specify 3 days before (prior) to some other Date."},
   :skos/note
   "Negative durations are used to indicate relative dates that are before (rather than after) some other Date."})

(def hasEndDate
  {:db/ident           :cmns-dt/hasEndDate,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "has end date",
   :rdfs/range         :cmns-dt/Date,
   :rdfs/subPropertyOf :cmns-dt/hasDate,
   :skos/definition    "indicates the ending date of some date period"})

(def hasExplicitDate
  {:db/ident :cmns-dt/hasExplicitDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has explicit date",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf :cmns-dt/hasDate,
   :skos/definition
   "indicates a stated date, as opposed to a calculated or unknown date, associated with something"})

(def hasObservedDateTime
  {:db/ident :cmns-dt/hasObservedDateTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "has observed date and time",
   :rdfs/range :cmns-dt/CombinedDateTime,
   :skos/definition
   "indicates a date and time associated with an event, measurement, record, or observation"})

(def hasStartDate
  {:db/ident           :cmns-dt/hasStartDate,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "has start date",
   :rdfs/range         :cmns-dt/Date,
   :rdfs/subPropertyOf :cmns-dt/hasDate,
   :skos/definition    "indicates the initial date of something"})

(def hasTimeValue
  {:db/ident :cmns-dt/hasTimeValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "has time value",
   :rdfs/range :xsd/string,
   :skos/definition
   "specifies an explicit time, captured in the format specified for xsd:time (i.e., ISO 8601 format), WITHOUT the date or timezone information"})

(def precedes
  {:db/ident :cmns-dt/precedes,
   :dcterms/source
   {:rdf/value
    "ISO 1087 Terminology work and terminology science - Vocabulary, Second edition, 2019-09, clause 3.2.24"},
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "precedes",
   :skos/definition
   "associates based on prior spatial or temporal proximity; occurs before in a logical order or sequence"})

(def succeeds
  {:db/ident :cmns-dt/succeeds,
   :dcterms/source
   {:rdf/value
    "ISO 1087 Terminology work and terminology science - Vocabulary, Second edition, 2019-09, clause 3.2.24"},
   :owl/inverseOf :cmns-dt/precedes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "succeeds",
   :skos/definition
   "associates based on subsequent spatial or temporal proximity; follows in a logical order or sequence"})

(def urn:uuid:719920ff-3a09-5349-bd0f-485a704c7266
  {:cmns-av/copyright #{"Copyright (c) 2014-2022 Object Management Group, Inc."
                        "Copyright (c) 2021-2022 agnos.ai U.K. Ltd"
                        "Copyright (c) 2014-2022 EDM Council, Inc."
                        "Copyright (c) 2014-2022 Thematix Partners LLC"},
   :dcterms/abstract
   "The dates and times ontology defines commonly used temporal concepts that cover those most frequently needed across domains, with a focus on terminology that is used in business applications. It is designed to be mappable to other date and time ontologies and specifications, such as the W3C Time Ontology in OWL (available at https://www.w3.org/TR/owl-time/), certain temporal elements in BFO 2020 (see https://basic-formal-ontology.org/bfo-2020.html), time concepts defined in schema.org, and the Object Management Group's Date Time Vocabulary (DTV) specification (available at https://www.omg.org/spec/DTV/), without the corresponding overhead or in some cases, issues. The concepts were originally derived from a number of date and time standards including ISO 8601:2004 Representation of Dates and Times. The ontology itself was derived from the Financial Industry Business Ontology (FIBO) Financial Dates ontology, with minor revisions to better reflect requirements for mapping to other ontologies.",
   :dcterms/contributor #{"Pete Rivett, agnos.ai U.K. Ltd"
                          "Elisa Kendall, Thematix Partners LLC"
                          "Mark Linehan, Thematix Partners LLC"},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :owl/imports {:xsd/anyURI
                 "https://www.omg.org/spec/Commons/AnnotationVocabulary/"},
   :owl/versionIRI {:xsd/anyURI
                    "https://www.omg.org/spec/Commons/20221101/DatesAndTimes/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Commons Dates and Times Ontology",
   :skos/changeNote
   "https://www.omg.org/spec/Commons/20220501/DatesAndTimes.rdf version of this ontology was modified to eliminate a double space in the scope note on CombinedDateTime (COMMONS-6).",
   :skos/note
   "The dates and times ontology conforms with the OWL 2 DL semantics, and is outside of OWL 2 RL due to the inclusion of exact cardinality constraints on explicit date, explicit duration and time of day. These constraints can be changed to maximum cardinality constraints if needed to support OWL RL rule-based applications that cannot be extended to support them.",
   :xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"})