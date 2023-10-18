(ns net.wikipunk.rdf.fibo-fnd-dt-oc
  {:cmns-av/copyright #{"Copyright (c) 2014-2023 Object Management Group, Inc."
                        "Copyright (c) 2014-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/Occurrences/",
   :dcterms/abstract
   "This ontology extends definitions of date and schedule concepts from the FinancialDates ontology with concepts defining occurrences (i.e., event-related concepts) for use in other FIBO ontologies.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-dt-bd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-dt-oc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/",
    "fibo-fnd-plc-loc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/Locations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/BusinessDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/FinancialDates/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/Occurrences/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-dt-oc",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/",
   :rdfs/label "Occurrences Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/ version of this ontology was revised to address the issue resolutions in the FIBO 2.0 RFC, primarily to add properties that are relevant to the inputs and outputs from processes, events, systems and the like."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/ version of this ontology was revised to fix spelling errors."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/ version of this ontology was revised to eliminate duplication of concepts in LCC, and eliminate unnecessary complexity in restrictions."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/ version of this ontology was revised to address hygiene errors with respect to text formatting."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/ version of this ontology was revised to make use of the new composite date type added to Financial Dates."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/ version of this ontology was revised to eliminate the hasDescription property, which can easily supported using an annotation or isDescribedBy, depending on the situation, clarify the formal definition of occurrence kind, and correct circular and/or non-ISO 704 compliant definitions."
     "This ontology was added to Foundations in advance of the December 2014 Long Beach meeting in support of the SEC specification. It is also needed to provide temporal relationships for Ownership and Control.\n\nThese three ontologies are designed for use together:\n\n\t* FinancialDates -- financial Dates and Schedules\n\t* BusinessDates -- business day adjustments\n\t* Occurrences -- occurrences (events) and kinds of occurrences\n\nThey are modularized this way to minimize the ontological committments that are imposed upon ontologies that rely upon them. Ontologies can import FinancialDates alone, or FinancialDates + BusinessDates, or FinancialDates + Occurrences, or all three together."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/"})

(def Occurrence
  {:cmns-av/explanatoryNote
   "Each occurrence has a date time stamp, which identifies when the event occurred, and, optionally, a location (possibly virtual), that identifies where the occurrence happened.",
   :cmns-av/synonym "event",
   :cmns-av/usageNote
   "In order for other ontologies to accept FinancialDates without committing to the particular notions of 'Occurrence' and 'OccurrenceKind' that is modeled here, all aspects of Occurrences are captured in this ontology.",
   :db/ident :fibo-fnd-dt-oc/Occurrence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/"},
   :rdfs/label "occurrence",
   :rdfs/subClassOf
   #{{:owl/unionOf [{:owl/onClass    :cmns-dt/DatePeriod,
                     :owl/onProperty :fibo-fnd-dt-bd/holdsDuring,
                     :owl/qualifiedCardinality 1,
                     :rdf/type       :owl/Restriction}
                    {:owl/onClass    :cmns-dt/Date,
                     :owl/onProperty :fibo-fnd-dt-oc/hasEventDate,
                     :owl/qualifiedCardinality 1,
                     :rdf/type       :owl/Restriction}
                    {:owl/onDataRange :cmns-dt/CombinedDateTime,
                     :owl/onProperty  :fibo-fnd-dt-oc/hasEventDateValue,
                     :owl/qualifiedCardinality 1,
                     :rdf/type        :owl/Restriction}],
      :rdf/type    :owl/Class}
     {:owl/onClass    :fibo-fnd-dt-oc/OccurrenceKind,
      :owl/onProperty :fibo-fnd-dt-oc/exemplifies,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :lcc-cr/Location,
      :owl/onProperty :fibo-fnd-plc-loc/isLocatedAt,
      :rdf/type       :owl/Restriction}},
   :skos/definition "happening of an OccurrenceKind, i.e., an event"})

(def OccurrenceBasedDate
  {:cmns-av/explanatoryNote
   "The 'hasDateValue' property of an OccurrenceBasedDate is not set until the Occurrence happens. The 'triggeredBy' property relates an OccurrenceBasedDate to the OccurrenceKind that gives the meaning of the OccurrenceBasedDate.",
   :db/ident :fibo-fnd-dt-oc/OccurrenceBasedDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/"},
   :rdfs/label "occurrence-based date",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-fnd-dt-oc/OccurrenceKind,
                       :owl/onProperty :fibo-fnd-dt-oc/isTriggeredBy,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-dt-fd/CalculatedDate},
   :skos/definition
   "calculated date that is defined with respect to the occurrence of some occurrence kind"})

(def OccurrenceKind
  {:cmns-av/explanatoryNote
   "As types (or categories) of events, OccurenceKinds do not happen; OccurenceKinds describe Occurrences which happen and exemplify an OccurenceKind. As occurrences are things that actually happen, they have an actual date where as OccurenceKinds do not have an actual date.",
   :cmns-av/usageNote
   "In order for other ontologies to accept FinancialDates without committing to the particular notions of 'Occurrence' and 'OccurrenceKind' that is modeled here, all aspects of Occurrences are captured in this ontolog",
   :db/ident :fibo-fnd-dt-oc/OccurrenceKind,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/"},
   :rdfs/label "occurrence kind",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-cls/classifies,
                       :owl/someValuesFrom :fibo-fnd-dt-oc/Occurrence,
                       :rdf/type           :owl/Restriction}
                      :cmns-cls/Classifier},
   :skos/definition
   "classifier that specifies the general nature of an occurrence (event)",
   :skos/example #{"loan origination" "trade settlement"}})

(def exemplifies
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "http://www.merriam-webster.com/dictionary/exemplify"},
   :db/ident :fibo-fnd-dt-oc/exemplifies,
   :rdf/type #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/domain :fibo-fnd-dt-oc/Occurrence,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/"},
   :rdfs/label "exemplifies",
   :rdfs/range :fibo-fnd-dt-oc/OccurrenceKind,
   :skos/definition "is a realization or example of"})

(def hasEventDate
  {:db/ident :fibo-fnd-dt-oc/hasEventDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/"},
   :rdfs/label "has event date",
   :rdfs/range :cmns-dt/Date,
   :rdfs/subPropertyOf :cmns-dt/hasDate,
   :skos/definition "identifies a date associated with an event (occurrence)"})

(def hasEventDateValue
  {:db/ident :fibo-fnd-dt-oc/hasEventDateValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/"},
   :rdfs/label "has event date value",
   :rdfs/range :cmns-dt/CombinedDateTime,
   :skos/definition
   "identifies a date or date and time value associated with an event (occurrence)"})

(def hasInput
  {:db/ident :fibo-fnd-dt-oc/hasInput,
   :owl/inverseOf :fibo-fnd-dt-oc/isInputTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/"},
   :rdfs/label "has input",
   :skos/definition
   "relates something (e.g. an occurrence) to something that is used as an input to some activity or process"})

(def hasOccurrence
  {:db/ident :fibo-fnd-dt-oc/hasOccurrence,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/"},
   :rdfs/label "has occurrence",
   :rdfs/range :fibo-fnd-dt-oc/Occurrence,
   :skos/definition
   "identifies events of a given occurrence kind, typically as they occur in a schedule"})

(def hasOutput
  {:db/ident :fibo-fnd-dt-oc/hasOutput,
   :owl/inverseOf :fibo-fnd-dt-oc/isOutputFrom,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/"},
   :rdfs/label "has output",
   :skos/definition
   "relates something (e.g. an occurrence) to something that is the result of some activity or process"})

(def isExemplifiedBy
  {:db/ident :fibo-fnd-dt-oc/isExemplifiedBy,
   :owl/inverseOf :fibo-fnd-dt-oc/exemplifies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-dt-oc/OccurrenceKind,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/"},
   :rdfs/label "is exemplified by",
   :rdfs/range :fibo-fnd-dt-oc/Occurrence,
   :skos/definition "identifies examples of a given concept"})

(def isInputTo
  {:db/ident :fibo-fnd-dt-oc/isInputTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/"},
   :rdfs/label "is input to",
   :skos/definition
   "indicates a precondition, requirement, or other contribution (e.g., data) to some activity, process, system, report, analysis, etc."})

(def isOutputFrom
  {:db/ident :fibo-fnd-dt-oc/isOutputFrom,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/"},
   :rdfs/label "is output from",
   :skos/definition
   "indicates post condition or other product of some activity, process, system, report, analysis, etc."})

(def isTriggeredBy
  {:cmns-av/explanatoryNote
   "An OccurrenceBasedDate is triggered by an Occurrence that exemplifies the OccurrenceKind.",
   :db/ident :fibo-fnd-dt-oc/isTriggeredBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-dt-oc/OccurrenceBasedDate,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/"},
   :rdfs/label "is triggered by",
   :rdfs/range :fibo-fnd-dt-oc/OccurrenceKind,
   :skos/definition "is activated or initiated by"})

(def urn:uuid:1ad9cd38-52d7-5322-89be-42c78d8c828c
  {:cmns-av/copyright #{"Copyright (c) 2014-2023 Object Management Group, Inc."
                        "Copyright (c) 2014-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology extends definitions of date and schedule concepts from the FinancialDates ontology with concepts defining occurrences (i.e., event-related concepts) for use in other FIBO ontologies.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/Locations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/BusinessDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/FinancialDates/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/Occurrences/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Occurrences Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/ version of this ontology was revised to address the issue resolutions in the FIBO 2.0 RFC, primarily to add properties that are relevant to the inputs and outputs from processes, events, systems and the like."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/ version of this ontology was revised to fix spelling errors."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/ version of this ontology was revised to eliminate duplication of concepts in LCC, and eliminate unnecessary complexity in restrictions."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/ version of this ontology was revised to address hygiene errors with respect to text formatting."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/ version of this ontology was revised to make use of the new composite date type added to Financial Dates."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/ version of this ontology was revised to eliminate the hasDescription property, which can easily supported using an annotation or isDescribedBy, depending on the situation, clarify the formal definition of occurrence kind, and correct circular and/or non-ISO 704 compliant definitions."
     "This ontology was added to Foundations in advance of the December 2014 Long Beach meeting in support of the SEC specification. It is also needed to provide temporal relationships for Ownership and Control.\n\nThese three ontologies are designed for use together:\n\n\t* FinancialDates -- financial Dates and Schedules\n\t* BusinessDates -- business day adjustments\n\t* Occurrences -- occurrences (events) and kinds of occurrences\n\nThey are modularized this way to minimize the ontological committments that are imposed upon ontologies that rely upon them. Ontologies can import FinancialDates alone, or FinancialDates + BusinessDates, or FinancialDates + Occurrences, or all three together."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/"})