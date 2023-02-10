(ns net.wikipunk.rdf.fibo-fnd-dt-bd
  "This ontology extends definitions of date and schedule concepts from the FinancialDates ontology with concepts defining dates that may be adjusted when they fall on weekends or holidays as defined in a given business center, for use in other FIBO ontologies."
  {:cmns-av/copyright ["Copyright (c) 2014-2023 Object Management Group, Inc."
                       "Copyright (c) 2014-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
   :dcterms/abstract
   "This ontology extends definitions of date and schedule concepts from the FinancialDates ontology with concepts defining dates that may be adjusted when they fall on weekends or holidays as defined in a given business center, for use in other FIBO ontologies.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/BusinessDates/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-dt-bd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-plc-loc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
   :rdfa/prefix "fibo-fnd-dt-bd",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
   :rdfs/label "Business Dates Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/ version of this ontology was revised to loosen domains on properties related to business day and day count (recurrence interval) conventions, eliminate a duplicate individual, normalize definitions to be ISO 704 compliant, eliminate duplication of concepts in LCC, move hasBusinessCenter to locations, where the class BusinessCenter is defined and merge countries with locations."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/ version of this ontology was revised by the FIBO FND 1.2 RTF in order to add definitions for business recurrence intervals such as the day of the month and week, and to revise the representation of the end of the month to correspond to the way that the other intervals are represented for use in parametric schedules."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/ version of this ontology was revised to address hygiene issues with respect to text processing."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/ version of this ontology was revised to eliminate a remaining circular definition."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/ version of this ontology was revised to better support definitions related to business day adjustments."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "This ontology was added to Foundations in advance of the December 2014 Long Beach meeting in support of the SEC specification. It is also needed to provide temporal relationships for Ownership and Control.\n\nThese three ontologies are designed for use together:\n\n\t* FinancialDates -- financial Dates and Schedules\n\t* BusinessDates -- business day adjustments\n\t* Occurrences -- occurrences (events) and kinds of occurrences\n\nThey are modularized this way to minimize the ontological committments that are imposed upon ontologies that rely upon them. Ontologies can import FinancialDates alone, or FinancialDates + BusinessDates, or FinancialDates + Occurrences, or all three together."]})

(def BusinessDayAdjustment
  "convention that specifies what happens when a date falls on a day that is a weekend or a holiday in one or more business centers"
  {:db/ident :fibo-fnd-dt-bd/BusinessDayAdjustment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
   :rdfs/label "business day adjustment",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-plc-loc/hasBusinessCenter,
                      :owl/someValuesFrom :fibo-fnd-plc-loc/BusinessCenter,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-dt-bd/BusinessDayConvention,
                      :owl/onProperty :fibo-fnd-dt-bd/hasBusinessDayConvention,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-dt-bd/Convention],
   :skos/definition
   "convention that specifies what happens when a date falls on a day that is a weekend or a holiday in one or more business centers"})

(def BusinessDayConvention
  "convention that enumerates the possible ways to handle a date that falls on a weekend or holiday"
  {:db/ident :fibo-fnd-dt-bd/BusinessDayConvention,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
   :rdfs/label "business day convention",
   :rdfs/subClassOf :fibo-fnd-dt-bd/Convention,
   :skos/definition
   "convention that enumerates the possible ways to handle a date that falls on a weekend or holiday"})

(def BusinessDayFollowing
  "convention specifying that a non-business date will be adjusted to the first following day that is a business day"
  {:cmns-av/adaptedFrom "FPML 5.1 \"BusinessDayConventionEnum\"",
   :db/ident :fibo-fnd-dt-bd/BusinessDayFollowing,
   :rdf/type [:fibo-fnd-dt-bd/BusinessDayConvention :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
   :rdfs/label "business day following",
   :skos/definition
   "convention specifying that a non-business date will be adjusted to the first following day that is a business day"})

(def BusinessDayModifiedFollowing
  "convention specifying that a non-business date will be adjusted to the first following day that is a business day unless that day falls in the next calendar month, in which case that date will be the first preceding day that is a calendar date"
  {:cmns-av/adaptedFrom "FPML 5.1 \"BusinessDayConventionEnum\"",
   :db/ident :fibo-fnd-dt-bd/BusinessDayModifiedFollowing,
   :rdf/type [:fibo-fnd-dt-bd/BusinessDayConvention :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
   :rdfs/label "business day modified following",
   :skos/definition
   "convention specifying that a non-business date will be adjusted to the first following day that is a business day unless that day falls in the next calendar month, in which case that date will be the first preceding day that is a calendar date"})

(def BusinessDayModifiedPreceding
  "convention specifying that a non-business date will be adjusted to the first preceding day that is a business day unless that day falls in the previous month, in which case that date will be the first following day that is a business day"
  {:cmns-av/adaptedFrom "FPML 5.1 \"BusinessDayConventionEnum\"",
   :db/ident :fibo-fnd-dt-bd/BusinessDayModifiedPreceding,
   :rdf/type [:fibo-fnd-dt-bd/BusinessDayConvention :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
   :rdfs/label "business day modified preceding",
   :skos/definition
   "convention specifying that a non-business date will be adjusted to the first preceding day that is a business day unless that day falls in the previous month, in which case that date will be the first following day that is a business day"})

(def BusinessDayNearest
  "convention specifying that a non-business date will be adjusted to the nearest day that is a business day -- i.e. if the non-business day falls on any day other than a Sunday or a Monday, it will be the first preceding day that is a business day, and will be the first following business day if it falls on a Sunday or a Monday"
  {:cmns-av/adaptedFrom "FPML 5.1 \"BusinessDayConventionEnum\"",
   :db/ident :fibo-fnd-dt-bd/BusinessDayNearest,
   :rdf/type [:fibo-fnd-dt-bd/BusinessDayConvention :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
   :rdfs/label "business day nearest",
   :skos/definition
   "convention specifying that a non-business date will be adjusted to the nearest day that is a business day -- i.e. if the non-business day falls on any day other than a Sunday or a Monday, it will be the first preceding day that is a business day, and will be the first following business day if it falls on a Sunday or a Monday"})

(def BusinessDayNone
  "convention specifying that a date will not be adjusted if it falls on a day that is not a business day"
  {:cmns-av/adaptedFrom "FPML 5.1 \"BusinessDayConventionEnum\"",
   :db/ident :fibo-fnd-dt-bd/BusinessDayNone,
   :rdf/type [:fibo-fnd-dt-bd/BusinessDayConvention :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
   :rdfs/label "business day none",
   :skos/definition
   "convention specifying that a date will not be adjusted if it falls on a day that is not a business day"})

(def BusinessDayPreceding
  "convention specifying that a date will be adjusted to the first previous day that is a business day"
  {:db/ident :fibo-fnd-dt-bd/BusinessDayPreceding,
   :rdf/type [:fibo-fnd-dt-bd/BusinessDayConvention :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
   :rdfs/label "business day preceding",
   :skos/definition
   "convention specifying that a date will be adjusted to the first previous day that is a business day"})

(def BusinessRecurrenceInterval
  "recurrence interval that is defined per a specific convention that determines how recurring days should be handled"
  {:db/ident :fibo-fnd-dt-bd/BusinessRecurrenceInterval,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
   :rdfs/label "business recurrence interval",
   :rdfs/subClassOf
   [{:owl/onClass    :fibo-fnd-dt-bd/BusinessRecurrenceIntervalConvention,
     :owl/onProperty :fibo-fnd-dt-bd/hasBusinessRecurrenceIntervalConvention,
     :owl/qualifiedCardinality 1,
     :rdf/type       :owl/Restriction}
    :fibo-fnd-dt-fd/RecurrenceInterval],
   :skos/definition
   "recurrence interval that is defined per a specific convention that determines how recurring days should be handled"})

(def BusinessRecurrenceIntervalConvention
  "convention that specifies how recurring days should be handled, such as the end of the month, a particular day of the month, a day of the week, or more specifically, a t-bill auction date"
  {:db/ident :fibo-fnd-dt-bd/BusinessRecurrenceIntervalConvention,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
   :rdfs/label "business recurrence interval convention",
   :rdfs/subClassOf :fibo-fnd-dt-bd/Convention,
   :skos/definition
   "convention that specifies how recurring days should be handled, such as the end of the month, a particular day of the month, a day of the week, or more specifically, a t-bill auction date"})

(def Convention
  "widely accepted or established way of doing 'something' within some community of practice"
  {:db/ident :fibo-fnd-dt-bd/Convention,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
   :rdfs/label "convention",
   :skos/definition
   "widely accepted or established way of doing 'something' within some community of practice"})

(def DayOfMonth
  "specific, recurring day of the month"
  {:db/ident :fibo-fnd-dt-bd/DayOfMonth,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
   :rdfs/label "day of month",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-fnd-dt-fd/hasOrdinalNumber,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     :fibo-fnd-dt-bd/BusinessRecurrenceInterval],
   :skos/definition "specific, recurring day of the month"})

(def DayOfWeek
  "specific, recurring day of the week"
  {:db/ident :fibo-fnd-dt-bd/DayOfWeek,
   :owl/equivalentClass {:owl/oneOf [:fibo-fnd-dt-fd/Monday
                                     :fibo-fnd-dt-fd/Tuesday
                                     :fibo-fnd-dt-fd/Wednesday
                                     :fibo-fnd-dt-fd/Thursday
                                     :fibo-fnd-dt-fd/Friday
                                     :fibo-fnd-dt-fd/Saturday
                                     :fibo-fnd-dt-fd/Sunday],
                         :rdf/type  :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
   :rdfs/label "day of the week",
   :rdfs/subClassOf :fibo-fnd-dt-bd/BusinessRecurrenceInterval,
   :skos/definition "specific, recurring day of the week"})

(def EndOfMonth
  "the last day of a calendar month, irrespective of the length of the calendar month"
  {:db/ident :fibo-fnd-dt-bd/EndOfMonth,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
   :rdfs/label "end of the month",
   :rdfs/subClassOf :fibo-fnd-dt-bd/BusinessRecurrenceInterval,
   :skos/definition
   "the last day of a calendar month, irrespective of the length of the calendar month"})

(def hasBusinessDayAdjustment
  "identifies a convention for adjustment of the business day for handling weekends and holidays"
  {:db/ident :fibo-fnd-dt-bd/hasBusinessDayAdjustment,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
   :rdfs/label "has business day adjustment",
   :rdfs/range :fibo-fnd-dt-bd/BusinessDayAdjustment,
   :skos/definition
   "identifies a convention for adjustment of the business day for handling weekends and holidays"})

(def hasBusinessDayConvention
  "identifies a convention regarding how a date should be handled when it falls on a day that is not a business day"
  {:db/ident :fibo-fnd-dt-bd/hasBusinessDayConvention,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
   :rdfs/label "has business day convention",
   :rdfs/range :fibo-fnd-dt-bd/BusinessDayConvention,
   :skos/definition
   "identifies a convention regarding how a date should be handled when it falls on a day that is not a business day"})

(def hasBusinessRecurrenceIntervalConvention
  "identifies a convention regarding how certain recurring dates should be handled with respect to a given schedule, such as the end of the month"
  {:db/ident :fibo-fnd-dt-bd/hasBusinessRecurrenceIntervalConvention,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
   :rdfs/label "has business recurrence interval convention",
   :rdfs/range :fibo-fnd-dt-bd/BusinessRecurrenceIntervalConvention,
   :skos/definition
   "identifies a convention regarding how certain recurring dates should be handled with respect to a given schedule, such as the end of the month"})

(def holdsDuring
  "specifies that some condition or state is true (holds) during a specified date period"
  {:db/ident :fibo-fnd-dt-bd/holdsDuring,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
   :rdfs/label "holds during",
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasDatePeriod,
   :skos/definition
   "specifies that some condition or state is true (holds) during a specified date period"})

(def ^{:private true} CalculatedDate
  {:db/ident        :fibo-fnd-dt-fd/CalculatedDate,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf {:owl/maxQualifiedCardinality 1,
                     :owl/onClass    :fibo-fnd-dt-bd/BusinessDayAdjustment,
                     :owl/onProperty :fibo-fnd-dt-bd/hasBusinessDayAdjustment,
                     :rdf/type       :owl/Restriction}})

(def ^{:private true} RegularSchedule
  {:db/ident        :fibo-fnd-dt-fd/RegularSchedule,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf {:owl/maxQualifiedCardinality 1,
                     :owl/onClass    :fibo-fnd-dt-bd/BusinessDayAdjustment,
                     :owl/onProperty :fibo-fnd-dt-bd/hasBusinessDayAdjustment,
                     :rdf/type       :owl/Restriction}})