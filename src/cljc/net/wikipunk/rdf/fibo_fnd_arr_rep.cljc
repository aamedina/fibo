(ns net.wikipunk.rdf.fibo-fnd-arr-rep
  {:cmns-av/copyright
   #{"Copyright (c) 2018-2024 EDM Council, Inc."
     "Copyright (c) 2018-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/Reporting/",
   :dcterms/abstract
   "This ontology defines the notion of a Report and related party concepts.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-arr-doc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
    "fibo-fnd-arr-rep"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
    "fibo-fnd-dt-oc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/Documents/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/Reporting/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-arr-rep",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfs/label "Reporting Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting.rdf version of this ontology was modified to eliminate references to deprecated elements and to external dictionary sites that no longer resolve, and to integrate concepts related to making a request for something."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting.rdf version of this ontology was modified to incorporate evaluates and isEvaluatedBy."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting.rdf version of the ontology was modified to replace additional concepts from several FIBO FND ontologies with their counterparts added to the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting.rdf version of the ontology was modified to replace concepts from several FIBO FND ontologies with their counterparts added to the Commons Ontology Library (Commons) v1.1."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/"})

(def Report
  {:cmns-av/explanatoryNote
   "Reports may refer to specific periods, events, occurrences, or subjects, and may be communicated or presented in oral, electronic, or written form.",
   :db/ident :fibo-fnd-arr-rep/Report,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/"},
   :rdfs/label "report",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-pts/PartyRole,
                       :owl/onProperty :fibo-fnd-arr-rep/isSubmittedTo,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-dt/ExplicitDate,
                       :owl/onProperty :fibo-fnd-arr-rep/hasReportDate,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-dt/DateTime,
                       :owl/onProperty :fibo-fnd-arr-rep/hasReportDateTime,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-arr-rep/isReportedTo,
                       :owl/someValuesFrom :cmns-pts/PartyRole,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-rel-rel/isProvidedBy,
                       :owl/someValuesFrom :fibo-fnd-arr-rep/ReportingParty,
                       :rdf/type           :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-dt/DatePeriod,
                       :owl/onProperty :fibo-fnd-arr-doc/hasReportingPeriod,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-arr-rep/Submitter,
                       :owl/onProperty :fibo-fnd-arr-rep/isSubmittedBy,
                       :rdf/type       :owl/Restriction} :cmns-doc/Document},
   :skos/definition
   "document that provides a structured description of something, prepared on ad hoc, periodic, recurring, regular, or as required basis"})

(def ReportingParty
  {:db/ident :fibo-fnd-arr-rep/ReportingParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/"},
   :rdfs/label "reporting party",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/provides,
                       :owl/someValuesFrom :fibo-fnd-arr-rep/Report,
                       :rdf/type           :owl/Restriction}
                      :cmns-pts/PartyRole},
   :skos/definition
   "party providing a report, typically in response to some contractual, legal, regulatory or other business requirement"})

(def Request
  {:db/ident :fibo-fnd-arr-rep/Request,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/"},
   :rdfs/label "request",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-dt/DateTime,
                       :owl/onProperty :fibo-fnd-arr-rep/hasRequestDateTime,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-rel-rel/exemplifies,
                       :owl/someValuesFrom :fibo-fnd-arr-rep/RequestActivity,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-dt-oc/Occurrence
                      {:owl/onProperty     :fibo-fnd-arr-rep/isRequestedOf,
                       :owl/someValuesFrom :cmns-pts/PartyRole,
                       :rdf/type           :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-dt/ExplicitDate,
                       :owl/onProperty :fibo-fnd-arr-rep/hasRequestDate,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-arr-rep/isRequestedBy,
                       :owl/someValuesFrom :fibo-fnd-arr-rep/Requester,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "event in which some party asks another party for something at some point in time"})

(def RequestActivity
  {:db/ident :fibo-fnd-arr-rep/RequestActivity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/"},
   :rdfs/label "request activity",
   :rdfs/subClassOf #{:fibo-fnd-dt-oc/OccurrenceKind
                      {:owl/onProperty     :fibo-fnd-arr-rep/requests,
                       :owl/someValuesFrom :owl/Thing,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "activity in which some party asks another party for something or to do something"})

(def Requester
  {:db/ident :fibo-fnd-arr-rep/Requester,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "requester"},
   :rdfs/subClassOf :cmns-pts/PartyRole,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "party that asks for something"}})

(def Submitter
  {:db/ident :fibo-fnd-arr-rep/Submitter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/"},
   :rdfs/label "submitter",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-arr-rep/submits,
                       :owl/someValuesFrom :fibo-fnd-arr-rep/Report,
                       :rdf/type           :owl/Restriction}
                      :cmns-pts/PartyRole},
   :skos/definition "party presenting something, such as a regulatory report"})

(def hasReportDate
  {:db/ident :fibo-fnd-arr-rep/hasReportDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has report date"},
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf #{:fibo-fnd-arr-doc/hasDateOfIssuance
                         :cmns-dt/hasExplicitDate},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "date on which a report was issued"}})

(def hasReportDateTime
  {:db/ident :fibo-fnd-arr-rep/hasReportDateTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has report date time"},
   :rdfs/range :cmns-dt/DateTime,
   :rdfs/subPropertyOf :cmns-dt/hasDateTime,
   :skos/definition {:rdf/language "en",
                     :rdf/value "date and time at which a report was issued"}})

(def hasRequestDate
  {:db/ident :fibo-fnd-arr-rep/hasRequestDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has request date"},
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf :cmns-dt/hasExplicitDate,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "date on which a request was made"}})

(def hasRequestDateTime
  {:db/ident :fibo-fnd-arr-rep/hasRequestDateTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has request date time"},
   :rdfs/range :cmns-dt/DateTime,
   :rdfs/subPropertyOf :cmns-dt/hasDateTime,
   :skos/definition {:rdf/language "en",
                     :rdf/value "date and time at which a request was made"}})

(def isReportedTo
  {:db/ident :fibo-fnd-arr-rep/isReportedTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/"},
   :rdfs/label "is reported to",
   :rdfs/range :cmns-pts/PartyRole,
   :rdfs/subPropertyOf :cmns-pts/hasPartyRole,
   :skos/definition "indicates the party to which something is reported"})

(def isRequestedBy
  {:db/ident :fibo-fnd-arr-rep/isRequestedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/"},
   :rdfs/label "is requested by",
   :rdfs/range :fibo-fnd-arr-rep/Requester,
   :rdfs/subPropertyOf :cmns-pts/hasPartyRole,
   :skos/definition "indicates the party that asks for something"})

(def isRequestedOf
  {:db/ident :fibo-fnd-arr-rep/isRequestedOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/"},
   :rdfs/label "is requested of",
   :rdfs/range :cmns-pts/PartyRole,
   :rdfs/subPropertyOf :cmns-pts/hasPartyRole,
   :skos/definition "indicates the party that is asked for something"})

(def isSubmittedBy
  {:db/ident :fibo-fnd-arr-rep/isSubmittedBy,
   :owl/inverseOf :fibo-fnd-arr-rep/submits,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/"},
   :rdfs/label "is submitted by",
   :rdfs/range :fibo-fnd-arr-rep/Submitter,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/isProvidedBy,
   :skos/definition "indicates the party that submits something"})

(def isSubmittedTo
  {:db/ident :fibo-fnd-arr-rep/isSubmittedTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/"},
   :rdfs/label "is submitted to",
   :rdfs/range :cmns-pts/PartyRole,
   :rdfs/subPropertyOf :cmns-pts/hasPartyRole,
   :skos/definition "indicates the party to which something is submitted"})

(def reportsOn
  {:db/ident :fibo-fnd-arr-rep/reportsOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-arr-rep/Report,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/"},
   :rdfs/label "reports on",
   :rdfs/subPropertyOf :cmns-doc/isAbout,
   :skos/definition
   "indicates a subject matter, observation(s), assessment(s), focus or other topic of a report"})

(def requests
  {:db/ident :fibo-fnd-arr-rep/requests,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/"},
   :rdfs/label "requests",
   :rdfs/subPropertyOf :cmns-doc/isAbout,
   :skos/definition "asks for something"})

(def submits
  {:db/ident :fibo-fnd-arr-rep/submits,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-arr-rep/Submitter,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/"},
   :rdfs/label "submits",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/provides,
   :skos/definition
   "presents something (a proposal, application, report, or other document) for consideration or review"})

(def urn:uuid:6b54709a-dde6-5a0e-b0bc-e2d0f8077a0c
  {:cmns-av/copyright
   #{"Copyright (c) 2018-2024 EDM Council, Inc."
     "Copyright (c) 2018-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines the notion of a Report and related party concepts.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/Documents/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/Reporting/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Reporting Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting.rdf version of this ontology was modified to eliminate references to deprecated elements and to external dictionary sites that no longer resolve, and to integrate concepts related to making a request for something."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting.rdf version of this ontology was modified to incorporate evaluates and isEvaluatedBy."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting.rdf version of the ontology was modified to replace additional concepts from several FIBO FND ontologies with their counterparts added to the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting.rdf version of the ontology was modified to replace concepts from several FIBO FND ontologies with their counterparts added to the Commons Ontology Library (Commons) v1.1."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/"})