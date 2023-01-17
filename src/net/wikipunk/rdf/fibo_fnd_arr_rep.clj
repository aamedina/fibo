(ns net.wikipunk.rdf.fibo-fnd-arr-rep
  "This ontology defines the notion of a Report and related party concepts."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 Object Management Group, Inc."
                       "Copyright (c) 2018-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :dcterms/abstract
   "This ontology defines the notion of a Report and related party concepts.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/Occurrences/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Arrangements/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Reporting/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-arr-doc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
    "fibo-fnd-arr-rep"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-dt-oc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfa/prefix "fibo-fnd-arr-rep",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label "Reporting Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting.rdf version of this ontology was modified to incorporate evaluates and isEvaluatedBy."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting.rdf version of this ontology was modified to eliminate references to deprecated elements and to external dictionary sites that no longer resolve, and to integrate concepts related to making a request for something."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."]})

(def Report
  "document that provides a structured description of something, prepared on ad hoc, periodic, recurring, regular, or as required basis"
  {:cmns-av/explanatoryNote
   "Reports may refer to specific periods, events, occurrences, or subjects, and may be communicated or presented in oral, electronic, or written form.",
   :db/ident :fibo-fnd-arr-rep/Report,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label "report",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-dt-fd/DatePeriod,
                      :owl/onProperty :fibo-fnd-arr-doc/hasReportingPeriod,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/isProvidedBy,
                      :owl/someValuesFrom :fibo-fnd-arr-rep/ReportingParty,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-pty-pty/PartyInRole,
                      :owl/onProperty :fibo-fnd-arr-rep/isSubmittedTo,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-arr-doc/Document
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-dt-fd/ExplicitDate,
                      :owl/onProperty :fibo-fnd-arr-rep/hasReportDate,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-arr-rep/isReportedTo,
                      :owl/someValuesFrom :fibo-fnd-pty-pty/PartyInRole,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-arr-rep/Submitter,
                      :owl/onProperty :fibo-fnd-arr-rep/isSubmittedBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-dt-fd/DateTime,
                      :owl/onProperty :fibo-fnd-arr-rep/hasReportDateTime,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "document that provides a structured description of something, prepared on ad hoc, periodic, recurring, regular, or as required basis"})

(def ReportingParty
  "party providing a report, typically in response to some contractual, legal, regulatory or other business requirement"
  {:db/ident :fibo-fnd-arr-rep/ReportingParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label "reporting party",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/provides,
                      :owl/someValuesFrom :fibo-fnd-arr-rep/Report,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition
   "party providing a report, typically in response to some contractual, legal, regulatory or other business requirement"})

(def Request
  "event in which some party asks another party for something at some point in time"
  {:db/ident :fibo-fnd-arr-rep/Request,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label "request",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-rep/isRequestedOf,
                      :owl/someValuesFrom :fibo-fnd-pty-pty/PartyInRole,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-dt-fd/DateTime,
                      :owl/onProperty :fibo-fnd-arr-rep/hasRequestDateTime,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-dt-oc/exemplifies,
                      :owl/someValuesFrom :fibo-fnd-arr-rep/RequestActivity,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-dt-fd/ExplicitDate,
                      :owl/onProperty :fibo-fnd-arr-rep/hasRequestDate,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-arr-rep/isRequestedBy,
                      :owl/someValuesFrom :fibo-fnd-arr-rep/Requester,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "event in which some party asks another party for something at some point in time"})

(def RequestActivity
  "activity in which some party asks another party for something or to do something"
  {:db/ident :fibo-fnd-arr-rep/RequestActivity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label "request activity",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-rep/requests,
                      :owl/someValuesFrom :owl/Thing,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/OccurrenceKind],
   :skos/definition
   "activity in which some party asks another party for something or to do something"})

(def Requester
  "party that asks for something"
  {:db/ident :fibo-fnd-arr-rep/Requester,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "requester"},
   :rdfs/subClassOf :fibo-fnd-pty-pty/PartyInRole,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "party that asks for something"}})

(def Submitter
  "party presenting something, such as a regulatory report"
  {:db/ident :fibo-fnd-arr-rep/Submitter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label "submitter",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-rep/submits,
                      :owl/someValuesFrom :fibo-fnd-arr-rep/Report,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition "party presenting something, such as a regulatory report"})

(def hasReportDate
  "date on which a report was issued"
  {:db/ident :fibo-fnd-arr-rep/hasReportDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has report date"},
   :rdfs/range :fibo-fnd-dt-fd/ExplicitDate,
   :rdfs/subPropertyOf [:fibo-fnd-dt-fd/hasExplicitDate
                        :fibo-fnd-arr-doc/hasDateOfIssuance],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "date on which a report was issued"}})

(def hasReportDateTime
  "date and time at which a report was issued"
  {:db/ident :fibo-fnd-arr-rep/hasReportDateTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has report date time"},
   :rdfs/range :fibo-fnd-dt-fd/DateTime,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasDateTime,
   :skos/definition {:rdf/language "en",
                     :rdf/value "date and time at which a report was issued"}})

(def hasRequestDate
  "date on which a request was made"
  {:db/ident :fibo-fnd-arr-rep/hasRequestDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has request date"},
   :rdfs/range :fibo-fnd-dt-fd/ExplicitDate,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasExplicitDate,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "date on which a request was made"}})

(def hasRequestDateTime
  "date and time at which a request was made"
  {:db/ident :fibo-fnd-arr-rep/hasRequestDateTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has request date time"},
   :rdfs/range :fibo-fnd-dt-fd/DateTime,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasDateTime,
   :skos/definition {:rdf/language "en",
                     :rdf/value "date and time at which a request was made"}})

(def isReportedTo
  "indicates the party to which something is reported"
  {:db/ident :fibo-fnd-arr-rep/isReportedTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label "is reported to",
   :rdfs/range :fibo-fnd-pty-pty/PartyInRole,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/hasPartyInRole,
   :skos/definition "indicates the party to which something is reported"})

(def isRequestedBy
  "indicates the party that asks for something"
  {:db/ident :fibo-fnd-arr-rep/isRequestedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label "is requested by",
   :rdfs/range :fibo-fnd-arr-rep/Requester,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/hasPartyInRole,
   :skos/definition "indicates the party that asks for something"})

(def isRequestedOf
  "indicates the party that is asked for something"
  {:db/ident :fibo-fnd-arr-rep/isRequestedOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label "is requested of",
   :rdfs/range :fibo-fnd-pty-pty/PartyInRole,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/hasPartyInRole,
   :skos/definition "indicates the party that is asked for something"})

(def isSubmittedBy
  "indicates the party that submits something"
  {:db/ident :fibo-fnd-arr-rep/isSubmittedBy,
   :owl/inverseOf :fibo-fnd-arr-rep/submits,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label "is submitted by",
   :rdfs/range :fibo-fnd-arr-rep/Submitter,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/isProvidedBy,
   :skos/definition "indicates the party that submits something"})

(def isSubmittedTo
  "indicates the party to which something is submitted"
  {:db/ident :fibo-fnd-arr-rep/isSubmittedTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label "is submitted to",
   :rdfs/range :fibo-fnd-pty-pty/PartyInRole,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/hasPartyInRole,
   :skos/definition "indicates the party to which something is submitted"})

(def reportsOn
  "indicates a subject matter, observation(s), assessment(s), focus or other topic of a report"
  {:db/ident :fibo-fnd-arr-rep/reportsOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-arr-rep/Report,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label "reports on",
   :rdfs/subPropertyOf :fibo-fnd-arr-doc/isAbout,
   :skos/definition
   "indicates a subject matter, observation(s), assessment(s), focus or other topic of a report"})

(def requests
  "asks for something"
  {:db/ident :fibo-fnd-arr-rep/requests,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label "requests",
   :rdfs/subPropertyOf :fibo-fnd-arr-doc/isAbout,
   :skos/definition "asks for something"})

(def submits
  "presents something (a proposal, application, report, or other document) for consideration or review"
  {:db/ident :fibo-fnd-arr-rep/submits,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-arr-rep/Submitter,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label "submits",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/provides,
   :skos/definition
   "presents something (a proposal, application, report, or other document) for consideration or review"})