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
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/DatesAndTimes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/Occurrences/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Reporting/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-arr-doc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
    "fibo-fnd-arr-rep"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
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
   :rdfa/prefix "fibo-fnd-arr-rep",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label "Reporting Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting.rdf version of this ontology was modified to incorporate evaluates and isEvaluatedBy."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
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
                      :owl/onClass    :fibo-fnd-pty-pty/PartyInRole,
                      :owl/onProperty :fibo-fnd-arr-rep/isSubmittedTo,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-arr-doc/Document
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-dt/DatePeriod,
                      :owl/onProperty :fibo-fnd-arr-doc/hasReportingPeriod,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-arr-rep/isReportedTo,
                      :owl/someValuesFrom :fibo-fnd-pty-pty/PartyInRole,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-arr-rep/Submitter,
                      :owl/onProperty :fibo-fnd-arr-rep/isSubmittedBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/isProvidedBy,
                      :owl/someValuesFrom :fibo-fnd-arr-rep/ReportingParty,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-dt/DateTime,
                      :owl/onProperty :fibo-fnd-arr-rep/hasReportDateTime,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-dt/ExplicitDate,
                      :owl/onProperty :fibo-fnd-arr-rep/hasReportDate,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-arr-rep/Report],
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
                     :fibo-fnd-pty-pty/PartyInRole
                     :fibo-fnd-arr-rep/ReportingParty],
   :skos/definition
   "party providing a report, typically in response to some contractual, legal, regulatory or other business requirement"})

(def Request
  "event in which some party asks another party for something at some point in time"
  {:db/ident :fibo-fnd-arr-rep/Request,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label "request",
   :rdfs/subClassOf [:fibo-fnd-dt-oc/Occurrence
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-dt/ExplicitDate,
                      :owl/onProperty :fibo-fnd-arr-rep/hasRequestDate,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-arr-rep/isRequestedOf,
                      :owl/someValuesFrom :fibo-fnd-pty-pty/PartyInRole,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-dt/DateTime,
                      :owl/onProperty :fibo-fnd-arr-rep/hasRequestDateTime,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-dt-oc/exemplifies,
                      :owl/someValuesFrom :fibo-fnd-arr-rep/RequestActivity,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-arr-rep/isRequestedBy,
                      :owl/someValuesFrom :fibo-fnd-arr-rep/Requester,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-rep/Request],
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
                     :fibo-fnd-dt-oc/OccurrenceKind
                     :fibo-fnd-arr-rep/RequestActivity],
   :skos/definition
   "activity in which some party asks another party for something or to do something"})

(def Requester
  "party that asks for something"
  {:db/ident :fibo-fnd-arr-rep/Requester,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label #voc/lstr "requester@en",
   :rdfs/subClassOf [:fibo-fnd-pty-pty/PartyInRole :fibo-fnd-arr-rep/Requester],
   :skos/definition #voc/lstr "party that asks for something@en"})

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
                     :fibo-fnd-pty-pty/PartyInRole
                     :fibo-fnd-arr-rep/Submitter],
   :skos/definition "party presenting something, such as a regulatory report"})

(def hasReportDate
  "date on which a report was issued"
  {:db/ident :fibo-fnd-arr-rep/hasReportDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label #voc/lstr "has report date@en",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf [:cmns-dt/hasExplicitDate
                        :fibo-fnd-arr-doc/hasDateOfIssuance
                        :fibo-fnd-arr-rep/hasReportDate],
   :skos/definition #voc/lstr "date on which a report was issued@en"})

(def hasReportDateTime
  "date and time at which a report was issued"
  {:db/ident :fibo-fnd-arr-rep/hasReportDateTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label #voc/lstr "has report date time@en",
   :rdfs/range :cmns-dt/DateTime,
   :rdfs/subPropertyOf [:cmns-dt/hasDateTime
                        :fibo-fnd-arr-rep/hasReportDateTime],
   :skos/definition #voc/lstr "date and time at which a report was issued@en"})

(def hasRequestDate
  "date on which a request was made"
  {:db/ident :fibo-fnd-arr-rep/hasRequestDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label #voc/lstr "has request date@en",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf [:cmns-dt/hasExplicitDate
                        :fibo-fnd-arr-rep/hasRequestDate],
   :skos/definition #voc/lstr "date on which a request was made@en"})

(def hasRequestDateTime
  "date and time at which a request was made"
  {:db/ident :fibo-fnd-arr-rep/hasRequestDateTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label #voc/lstr "has request date time@en",
   :rdfs/range :cmns-dt/DateTime,
   :rdfs/subPropertyOf [:cmns-dt/hasDateTime
                        :fibo-fnd-arr-rep/hasRequestDateTime],
   :skos/definition #voc/lstr "date and time at which a request was made@en"})

(def isReportedTo
  "indicates the party to which something is reported"
  {:db/ident :fibo-fnd-arr-rep/isReportedTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label "is reported to",
   :rdfs/range :fibo-fnd-pty-pty/PartyInRole,
   :rdfs/subPropertyOf [:fibo-fnd-pty-pty/hasPartyInRole
                        :fibo-fnd-arr-rep/isReportedTo],
   :skos/definition "indicates the party to which something is reported"})

(def isRequestedBy
  "indicates the party that asks for something"
  {:db/ident :fibo-fnd-arr-rep/isRequestedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label "is requested by",
   :rdfs/range :fibo-fnd-arr-rep/Requester,
   :rdfs/subPropertyOf [:fibo-fnd-pty-pty/hasPartyInRole
                        :fibo-fnd-arr-rep/isRequestedBy],
   :skos/definition "indicates the party that asks for something"})

(def isRequestedOf
  "indicates the party that is asked for something"
  {:db/ident :fibo-fnd-arr-rep/isRequestedOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label "is requested of",
   :rdfs/range :fibo-fnd-pty-pty/PartyInRole,
   :rdfs/subPropertyOf [:fibo-fnd-pty-pty/hasPartyInRole
                        :fibo-fnd-arr-rep/isRequestedOf],
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
   :rdfs/subPropertyOf [:fibo-fnd-rel-rel/isProvidedBy
                        :fibo-fnd-arr-rep/isSubmittedBy],
   :skos/definition "indicates the party that submits something"})

(def isSubmittedTo
  "indicates the party to which something is submitted"
  {:db/ident :fibo-fnd-arr-rep/isSubmittedTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label "is submitted to",
   :rdfs/range :fibo-fnd-pty-pty/PartyInRole,
   :rdfs/subPropertyOf [:fibo-fnd-pty-pty/hasPartyInRole
                        :fibo-fnd-arr-rep/isSubmittedTo],
   :skos/definition "indicates the party to which something is submitted"})

(def reportsOn
  "indicates a subject matter, observation(s), assessment(s), focus or other topic of a report"
  {:db/ident :fibo-fnd-arr-rep/reportsOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-arr-rep/Report,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label "reports on",
   :rdfs/subPropertyOf [:fibo-fnd-arr-doc/isAbout :fibo-fnd-arr-rep/reportsOn],
   :skos/definition
   "indicates a subject matter, observation(s), assessment(s), focus or other topic of a report"})

(def requests
  "asks for something"
  {:db/ident :fibo-fnd-arr-rep/requests,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label "requests",
   :rdfs/subPropertyOf [:fibo-fnd-arr-doc/isAbout :fibo-fnd-arr-rep/requests],
   :skos/definition "asks for something"})

(def submits
  "presents something (a proposal, application, report, or other document) for consideration or review"
  {:db/ident :fibo-fnd-arr-rep/submits,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-arr-rep/Submitter,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label "submits",
   :rdfs/subPropertyOf [:fibo-fnd-rel-rel/provides :fibo-fnd-arr-rep/submits],
   :skos/definition
   "presents something (a proposal, application, report, or other document) for consideration or review"})