(ns net.wikipunk.rdf.fibo-fnd-arr-doc
  "This ontology defines abstract concepts for representation documents for use in other FIBO ontology elements."
  {:cmns-av/copyright ["Copyright (c) 2014-2023 Object Management Group, Inc."
                       "Copyright (c) 2014-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
   :dcterms/abstract
   "This ontology defines abstract concepts for representation documents for use in other FIBO ontology elements.",
   :dcterms/license {:rdfa/uri "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   [{:rdfa/uri "https://www.omg.org/spec/Commons/DatesAndTimes/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/Collections/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"},
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-arr-doc",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
   :rdfs/label "Documents Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/Arrangements/Documents.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was revised as a part of the issue resolutions identified in the FIBO FND 1.2 RTF report to add a definition for a record."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was revised as a part of the FIBO 2.0 RFC to add definitions for general purpose reports."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was introduced as a part of the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/ in advance of the Long Beach meeting in December 2014."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was revised as a part of the issue resolutions identified in the FIBO FND 1.1 RTF report to add a parent of hasDate to date properties."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was revised to add a new records property."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was revised to integrate additional document concepts, including certificate, draft, and notice and eliminate duplication with concepts in LCC."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was revised to eliminate deprecated properties."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was revised to add a hasRecord property."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was revised to clarify the definition of legal document."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of this ontology was revised to eliminate references to external dictionary sites that no longer resolve."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."]})

(def Certificate
  "document attesting to the truth of some fact or set of facts"
  {:db/ident :fibo-fnd-arr-doc/Certificate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"},
   :rdfs/label "certificate",
   :rdfs/subClassOf [:fibo-fnd-arr-doc/Document
                     {:owl/onProperty     :fibo-fnd-arr-doc/isAbout,
                      :owl/someValuesFrom :owl/Thing,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "document attesting to the truth of some fact or set of facts"})

(def Document
  "something tangible that records something, such as a recording or a photograph, or a writing that can be used to furnish evidence or information"
  {:cmns-av/explanatoryNote
   "A document serves to establish one or several facts, and can be relied upon as a proof thereof.",
   :db/ident :fibo-fnd-arr-doc/Document,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"},
   :rdfs/label "document",
   :rdfs/subClassOf {:owl/onProperty     :fibo-fnd-arr-doc/isAbout,
                     :owl/someValuesFrom :owl/Thing,
                     :rdf/type           :owl/Restriction},
   :skos/definition
   "something tangible that records something, such as a recording or a photograph, or a writing that can be used to furnish evidence or information"})

(def LegalDocument
  "document that bears the original, official, or legal form of something, that can be fully attributed to its author, that records and formally expresses a legally enforceable act, process, or contractual duty, obligation, or right and that can be used to furnish decisive evidence for that act, process, or agreement"
  {:cmns-av/explanatoryNote
   "In order for a document to be legal, it must conform to the laws of the jurisdiction where it will be enforced. Typically, such a document should also be properly signed, witnessed and filed to be considered legal.",
   :db/ident :fibo-fnd-arr-doc/LegalDocument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"},
   :rdfs/label "legal document",
   :rdfs/subClassOf [:fibo-fnd-arr-doc/Document
                     {:owl/onProperty     :fibo-fnd-arr-doc/isAbout,
                      :owl/someValuesFrom :owl/Thing,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "document that bears the original, official, or legal form of something, that can be fully attributed to its author, that records and formally expresses a legally enforceable act, process, or contractual duty, obligation, or right and that can be used to furnish decisive evidence for that act, process, or agreement",
   :skos/example
   "Examples include some certificates, deeds, bonds, business documents (such as articles of incorporation, bylaws, partnership agreements), contracts, certain identity documents, wills, trusts, legislative acts, notarial acts, court writs or processes (such as related complaints and pleadings in the context of litigation as well as other documents relevant to some legal issue), and any law passed by a competent legislative body in municipal (domestic) or international law."})

(def Notice
  "announcement, intimation, or warning of something, especially to allow preparations to be made"
  {:cmns-av/explanatoryNote
   "Certain notices must be given given in writing, often by regular mail or hand delivery, with the sender retaining sufficient proof of having given such notice (e.g., through a certificate of service).",
   :db/ident :fibo-fnd-arr-doc/Notice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"},
   :rdfs/label "notice",
   :rdfs/subClassOf [:fibo-fnd-arr-doc/Document
                     {:owl/onProperty     :fibo-fnd-arr-doc/isAbout,
                      :owl/someValuesFrom :owl/Thing,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "announcement, intimation, or warning of something, especially to allow preparations to be made"})

(def Record
  "a memorialization and objective evidence of activities performed, events occurred, results achieved, or statements made, regardless of its characteristics, media, physical form, or the manner in which it is recorded or stored"
  {:cmns-av/explanatoryNote
   "Records are created or received by an organization in routine transaction of its business or in pursuance of its legal obligations.",
   :db/ident :fibo-fnd-arr-doc/Record,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"},
   :rdfs/label "record",
   :rdfs/subClassOf :cmns-col/Collection,
   :skos/definition
   "a memorialization and objective evidence of activities performed, events occurred, results achieved, or statements made, regardless of its characteristics, media, physical form, or the manner in which it is recorded or stored",
   :skos/example
   "Records include accounts, agreements, books, drawings, letters, magnetic/optical disks, memos, micrographics, etc."})

(def ReferenceDocument
  "a document that provides pertinent details for consultation about a subject"
  {:cmns-av/adaptedFrom
   {:xsd/string
    "ISO/IEC 11179-3 Information technology - Metadata registries (MDR) - Part 3: Registry metamodel and basic attributes, Third edition, 2013-02-15"},
   :db/ident :fibo-fnd-arr-doc/ReferenceDocument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"},
   :rdfs/label "reference document",
   :rdfs/subClassOf [:fibo-fnd-arr-doc/Document
                     {:owl/onProperty     :fibo-fnd-arr-doc/isAbout,
                      :owl/someValuesFrom :owl/Thing,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "a document that provides pertinent details for consultation about a subject"})

(def hasDataSource
  "relates something, such as an agreement, contract, document, report, process, and so forth to a source of data used to analyze, develop, explain, produce, or otherwise create it (e.g., Experian provides data for a CreditReport)"
  {:db/ident :fibo-fnd-arr-doc/hasDataSource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"},
   :rdfs/label "has data source",
   :skos/definition
   "relates something, such as an agreement, contract, document, report, process, and so forth to a source of data used to analyze, develop, explain, produce, or otherwise create it (e.g., Experian provides data for a CreditReport)"})

(def hasDateOfIssuance
  "links something, typically an agreement, contract, or document, with the date it was issued"
  {:db/ident :fibo-fnd-arr-doc/hasDateOfIssuance,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"},
   :rdfs/label "has date of issuance",
   :rdfs/range :cmns-dt/Date,
   :rdfs/subPropertyOf :cmns-dt/hasStartDate,
   :skos/definition
   "links something, typically an agreement, contract, or document, with the date it was issued"})

(def hasExpirationDate
  "links something, typically an agreement, contract, document, or perishable item, with an expiration date"
  {:db/ident :fibo-fnd-arr-doc/hasExpirationDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"},
   :rdfs/label "has expiration date",
   :rdfs/range :cmns-dt/Date,
   :rdfs/subPropertyOf :cmns-dt/hasEndDate,
   :skos/definition
   "links something, typically an agreement, contract, document, or perishable item, with an expiration date"})

(def hasRecord
  "links something to a record that pertains to it"
  {:db/ident :fibo-fnd-arr-doc/hasRecord,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"},
   :rdfs/label "has record",
   :rdfs/range :fibo-fnd-arr-doc/Record,
   :rdfs/subPropertyOf :cmns-col/comprises,
   :skos/definition "links something to a record that pertains to it"})

(def hasReportingPeriod
  "specifies the reporting period for which a report or something else, such as a market rate or economic indicator, applies"
  {:db/ident :fibo-fnd-arr-doc/hasReportingPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"},
   :rdfs/label "has reporting period",
   :rdfs/range :cmns-dt/ExplicitDatePeriod,
   :rdfs/subPropertyOf :cmns-dt/hasDatePeriod,
   :skos/definition
   "specifies the reporting period for which a report or something else, such as a market rate or economic indicator, applies"})

(def hasTerminationDate
  "links something, typically an agreement, contract, document, or process, with a date on which it was terminated"
  {:db/ident :fibo-fnd-arr-doc/hasTerminationDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"},
   :rdfs/label "has termination date",
   :rdfs/range :cmns-dt/Date,
   :rdfs/subPropertyOf :cmns-dt/hasEndDate,
   :skos/definition
   "links something, typically an agreement, contract, document, or process, with a date on which it was terminated"})

(def isAbout
  "indicates the subject or topic of a given document"
  {:db/ident :fibo-fnd-arr-doc/isAbout,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"},
   :rdfs/label "is about",
   :skos/definition "indicates the subject or topic of a given document"})

(def records
  "documents for later reference"
  {:db/ident :fibo-fnd-arr-doc/records,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"},
   :rdfs/label "records",
   :skos/definition "documents for later reference"})