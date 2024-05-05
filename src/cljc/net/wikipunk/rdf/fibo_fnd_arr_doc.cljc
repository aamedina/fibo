(ns net.wikipunk.rdf.fibo-fnd-arr-doc
  {:cmns-av/copyright #{"Copyright (c) 2014-2023 Object Management Group, Inc."
                        "Copyright (c) 2014-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/Documents/",
   :dcterms/abstract
   "This ontology defines abstract concepts for representation documents for use in other FIBO ontology elements.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-arr-doc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/Documents/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-arr-doc",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
   :rdfs/label "Documents Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/Arrangements/Documents.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was revised as a part of the FIBO 2.0 RFC to add definitions for general purpose reports."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was revised to integrate additional document concepts, including certificate, draft, and notice and eliminate duplication with concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of the ontology was modified to replace many of the concepts with those in the Documents ontology added to the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was introduced as a part of the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/ in advance of the Long Beach meeting in December 2014."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was revised to clarify the definition of legal document."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was revised to add a hasRecord property."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was revised as a part of the issue resolutions identified in the FIBO FND 1.2 RTF report to add a definition for a record."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was revised to eliminate references to external dictionary sites that no longer resolve."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was revised as a part of the issue resolutions identified in the FIBO FND 1.1 RTF report to add a parent of hasDate to date properties."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was revised to eliminate deprecated properties."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was revised to add a new records property."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"})

(def Certificate
  {:db/ident :fibo-fnd-arr-doc/Certificate,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-doc/Certificate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"}})

(def Document
  {:db/ident :fibo-fnd-arr-doc/Document,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-doc/Document,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"}})

(def FinancialRecord
  {:db/ident :fibo-fnd-arr-doc/FinancialRecord,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"},
   :rdfs/label "financial record",
   :rdfs/subClassOf #{:cmns-col/Collection :cmns-doc/Record},
   :skos/definition "record of financial information",
   :skos/example
   "Financial records include accounts, agreements, trading books, etc."})

(def LegalDocument
  {:db/ident :fibo-fnd-arr-doc/LegalDocument,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-doc/LegalDocument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"}})

(def Notice
  {:db/ident :fibo-fnd-arr-doc/Notice,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-doc/Notice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"}})

(def Record
  {:db/ident :fibo-fnd-arr-doc/Record,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-doc/Record,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"}})

(def ReferenceDocument
  {:db/ident :fibo-fnd-arr-doc/ReferenceDocument,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-doc/ReferenceDocument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"}})

(def hasDataSource
  {:db/ident :fibo-fnd-arr-doc/hasDataSource,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-doc/hasDataSource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"}})

(def hasDateOfIssuance
  {:db/ident :fibo-fnd-arr-doc/hasDateOfIssuance,
   :rdf/type #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"},
   :rdfs/label "has date of issuance",
   :rdfs/range :cmns-dt/Date,
   :rdfs/subPropertyOf :cmns-dt/hasStartDate,
   :skos/definition
   "links something, typically an agreement, contract, or document, with the date it was issued"})

(def hasExpirationDate
  {:db/ident :fibo-fnd-arr-doc/hasExpirationDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"},
   :rdfs/label "has expiration date",
   :rdfs/range :cmns-dt/Date,
   :rdfs/subPropertyOf :cmns-dt/hasEndDate,
   :skos/definition
   "links something, typically an agreement, contract, document, or perishable item, with an expiration date"})

(def hasRecord
  {:db/ident :fibo-fnd-arr-doc/hasRecord,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"},
   :rdfs/label "has record",
   :rdfs/range :cmns-doc/Record,
   :rdfs/subPropertyOf :cmns-col/comprises,
   :skos/definition "links something to a record that pertains to it"})

(def hasReportingPeriod
  {:db/ident :fibo-fnd-arr-doc/hasReportingPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"},
   :rdfs/label "has reporting period",
   :rdfs/range :cmns-dt/ExplicitDatePeriod,
   :rdfs/subPropertyOf :cmns-dt/hasDatePeriod,
   :skos/definition
   "specifies the reporting period for which a report or something else, such as a market rate or economic indicator, applies"})

(def hasTerminationDate
  {:db/ident :fibo-fnd-arr-doc/hasTerminationDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"},
   :rdfs/label "has termination date",
   :rdfs/range :cmns-dt/Date,
   :rdfs/subPropertyOf :cmns-dt/hasEndDate,
   :skos/definition
   "links something, typically an agreement, contract, document, or process, with a date on which it was terminated"})

(def isAbout
  {:db/ident :fibo-fnd-arr-doc/isAbout,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-doc/isAbout,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"}})

(def records
  {:db/ident :fibo-fnd-arr-doc/records,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-doc/records,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"}})

(def urn:uuid:f269f840-638f-57d7-8e67-ac1bfecf1643
  {:cmns-av/copyright #{"Copyright (c) 2014-2023 Object Management Group, Inc."
                        "Copyright (c) 2014-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines abstract concepts for representation documents for use in other FIBO ontology elements.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/Documents/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Documents Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/Arrangements/Documents.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was revised as a part of the FIBO 2.0 RFC to add definitions for general purpose reports."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was revised to integrate additional document concepts, including certificate, draft, and notice and eliminate duplication with concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of the ontology was modified to replace many of the concepts with those in the Documents ontology added to the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was introduced as a part of the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/ in advance of the Long Beach meeting in December 2014."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was revised to clarify the definition of legal document."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was revised to add a hasRecord property."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was revised as a part of the issue resolutions identified in the FIBO FND 1.2 RTF report to add a definition for a record."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was revised to eliminate references to external dictionary sites that no longer resolve."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was revised as a part of the issue resolutions identified in the FIBO FND 1.1 RTF report to add a parent of hasDate to date properties."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was revised to eliminate deprecated properties."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was revised to add a new records property."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"})