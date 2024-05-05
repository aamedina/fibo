(ns net.wikipunk.rdf.cmns-doc
  {:cmns-av/copyright #{"Copyright (c) 2023 Object Management Group, Inc."
                        "Copyright (c) 2022-2023 Mayo Clinic"
                        "Copyright (c) 2022-2023 Thematix Partners LLC"
                        "Copyright (c) 2014-2023 EDM Council, Inc."
                        "Copyright (c) 2022-2023 Federated Knowledge LLC"},
   :dcterms/abstract
   "This ontology defines high-level concepts for representation of documents, including legal documents and records, such as a transaction record, purchase history, or payment history. It is deliberately lightweight in order to accommodate mappings to other document and bibliographic ontologies.",
   :dcterms/contributor
   #{"Pete Rivett, Federated Knowledge LLC"
     "Evan Wallace, U.S. National Institute of Standards and Technology (NIST)"
     "Davide Sottara, Mayo Clinic" "Elisa Kendall, Thematix Partners LLC"},
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :namespaces {"cmns-av"
                "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
                "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
                "dcterms" "http://purl.org/dc/terms/",
                "owl" "http://www.w3.org/2002/07/owl#",
                "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                "skos" "http://www.w3.org/2004/02/skos/core#",
                "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports {:xsd/anyURI
                 "https://www.omg.org/spec/Commons/AnnotationVocabulary/"},
   :owl/versionIRI {:xsd/anyURI
                    "https://www.omg.org/spec/Commons/20230801/Documents/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "cmns-doc",
   :rdfa/uri "https://www.omg.org/spec/Commons/Documents/",
   :rdfs/label "Commons Documents Ontology",
   :skos/note
   "This ontology was derived from the Financial Industry Business Ontology (FIBO), and generalized for use in other domain areas.",
   :xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"})

(def Certificate
  {:cmns-av/adaptedFrom
   {:rdf/value
    "ISO 5127 - Information and documentation - Foundation and vocabulary, Second edition, 2017-05, clause 3.1.1.38"},
   :cmns-av/explanatoryNote
   #{"A certificate may or may not also be a legal document, depending on the issuing authority and how it can be used."
     "Certificates, such as electronic certificates, including public keys, may be issued by some certificate authority."},
   :db/ident :cmns-doc/Certificate,
   :rdf/type :owl/Class,
   :rdfs/label "certificate",
   :rdfs/subClassOf :cmns-doc/Document,
   :skos/definition
   "document attesting to the truth of some fact or set of facts"})

(def Document
  {:cmns-av/adaptedFrom
   #{{:rdf/value
      "ISO 5127 - Information and documentation - Foundation and vocabulary, Second edition, 2017-05, clause 3.1.1.38"}
     {:rdf/value
      "'Functional Requirements for Bibliographic Records', Final Report, IFLA (International Federation of Library Associations and Institutions) Study Group on the Functional Requirements for Bibliographic Records, September 1997 - see https://repository.ifla.org/bitstream/123456789/811/2/ifla-functional-requirements-for-bibliographic-records-frbr.pdf"}},
   :cmns-av/explanatoryNote
   "A document, especially a legal document, may serve to establish one or several facts, and can be relied upon as a proof thereof.",
   :cmns-av/usageNote
   "This definition of document corresponds to a subclass of expression in FRBR. The notion of being a unitary expression is the differentiator between an FRBR expression and document in this sense.",
   :db/ident :cmns-doc/Document,
   :rdf/type :owl/Class,
   :rdfs/label "document",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.ifla.org/wp-content/uploads/2019/05/assets/cataloguing/frbr/frbroo_v2.2.pdf"},
   :rdfs/subClassOf {:owl/minCardinality 0,
                     :owl/onProperty     :cmns-doc/isAbout,
                     :rdf/type           :owl/Restriction},
   :skos/definition
   "unitary expression of some realization of an intellectual or artistic work",
   :skos/note
   #{"The manifestation of a document (FRBR expression) refers not only to written and printed materials in paper or microform versions (for example, conventional books, journals, diagrams, maps), but also to non-printed media such as machine-readable and digitized records, Internet and intranet resources, films, sound recordings, buildings, sites, monuments, three-dimensional objects or realia [when used to carry some sort of engraving]; and to collections of such items or parts of such items. (Note taken from ISO 25964–1:2011, definition 2.15.) Also, software, since recorded, can be considered a document."
     "See also ISO 25964–1:2011, definition 2.15; ISO 11005:2010, definition 3.1; ISO 15489–1:2016, definition 3.10; IEC 82045–1:2001, definition 3.2.3; ISO 9000:2015, definition 3.7.2"
     "The definition of document provided herein roughly corresponds to the concept of an expression in FRBR. A document is a realization of something that typically takes the form of alpha-numeric, musical, or choreographic notation, sound, image, etc., or any combination of such forms. A manifestation of the document must be inscribed, encoded, engraved, recorded, or otherwise imprinted in some medium. The concept of a manifestation of an expression corresponds to the ISO 5127 notion of a document. Documents can differ extensively in form and characteristics."}})

(def LegalDocument
  {:cmns-av/adaptedFrom
   {:rdf/value
    "ISO 5127 - Information and documentation - Foundation and vocabulary, Second edition, 2017-05, clause 3.4.6.02"},
   :db/ident :cmns-doc/LegalDocument,
   :rdf/type :owl/Class,
   :rdfs/label "legal document",
   :rdfs/subClassOf :cmns-doc/Document,
   :skos/definition
   "document specifying the terms of, or provides evidence for, an agreement, attestation, certification, conditions, permissions, and/or decisions of legal persons, government entities, or courts of law, drawn up in accordance with certain rules that apply in the relevant jurisdiction(s)",
   :skos/example
   "Examples include some certificates, deeds, bonds, business documents (such as articles of incorporation, bylaws, partnership agreements), contracts, certain identity documents, wills, trusts, legislative acts, notarial acts, court writs or processes (such as related complaints and pleadings in the context of litigation as well as other documents relevant to some legal issue), and any law passed by a competent legislative body in municipal (domestic) or international law.",
   :skos/note
   #{"Many legal documents only become 'legal' once they are signed and dated, and possibly notarized."
     "A legal document bears the original, official, or legal form of something, that can be fully attributed to its author(s), that records and formally expresses a legally enforceable act, process, or contractual duty, obligation, or right and that can be used to furnish decisive evidence for that act, process, or agreement."}})

(def Notice
  {:cmns-av/adaptedFrom
   {:rdf/value
    "ISO 5127 - Information and documentation - Foundation and vocabulary, Second edition, 2017-05"},
   :db/ident :cmns-doc/Notice,
   :rdf/type :owl/Class,
   :rdfs/label "notice",
   :rdfs/subClassOf :cmns-doc/Document,
   :skos/definition
   "announcement, communication, intimation, or advance warning of something, usually, but not necessarily, to allow preparations to be made",
   :skos/example
   "registered trademark notice, disclaimer, copyright notice, overdue notice, recall notice",
   :skos/note
   "Although many notices are delivered electronically, certain legal notices must be given given in writing, often by regular mail or hand delivery, with the sender retaining sufficient proof of having given such notice (e.g., through a certificate of service)."})

(def Record
  {:db/ident :cmns-doc/Record,
   :rdf/type :owl/Class,
   :rdfs/label "record",
   :rdfs/subClassOf :cmns-doc/Document,
   :skos/definition
   "memorialization and objective evidence of activities performed, events occurred, results achieved, or statements made, regardless of its characteristics, media, physical form, or the manner in which it is recorded or stored",
   :skos/note
   "Records are created or received by an organization in routine transaction of its business or in pursuance of its legal obligations."})

(def Reference
  {:cmns-av/explanatoryNote
   #{"In linguistics, a reference characterizes, provides context for, or specifies the relationship of one linguistic expression to another, i.e., provides the information necessary to interpret the dependent expression."
     "References may be rendered in the form of a document, but may also take other forms, such as reference materials, scientific equations, and constants, including in some cases physical things, used as the basis for units of measure."},
   :db/ident :cmns-doc/Reference,
   :rdf/type :owl/Class,
   :rdfs/label "reference",
   :skos/definition
   "source that may be used to ascertain, interpret, or understand something"})

(def ReferenceDocument
  {:cmns-av/adaptedFrom
   {:rdf/value
    "ISO/IEC 11179-3 Information technology - Metadata registries (MDR) - Part 3: Registry metamodel and basic attributes, Third edition, 2013-02-15"},
   :cmns-av/explanatoryNote
   "A reference document is typically one that provides pertinent details for consultation about a subject.",
   :db/ident :cmns-doc/ReferenceDocument,
   :owl/equivalentClass {:owl/intersectionOf [:cmns-doc/Document
                                              {:owl/onProperty
                                               :cmns-doc/isReferredToBy,
                                               :owl/someValuesFrom :owl/Thing,
                                               :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/label "reference document",
   :rdfs/subClassOf #{:cmns-doc/Reference :cmns-doc/Document},
   :skos/definition "document that is used as a reference for something"})

(def Specification
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "spec"},
   :cmns-av/adaptedFrom
   {:rdf/value
    "ISO 6707-2:2017 Buildings and civil engineering works - Vocabulary - Part 2: Contract and communication terms, clause 3.2.22"},
   :db/ident :cmns-doc/Specification,
   :rdf/type :owl/Class,
   :rdfs/label "specification",
   :skos/definition
   "explicit requirement or set of requirements to be satisfied by something, such as a product, material, model, process or system"})

(def TechnicalSpecificationDocument
  {:cmns-av/adaptedFrom
   #{{:rdf/value
      "ISO 10795:2019 Space systems - Programme management and quality - Vocabulary, clause 3.238"}
     {:rdf/value
      "ISO 6707-2:2017 Buildings and civil engineering works - Vocabulary - Part 2: Contract and communication terms, clause 3.2.22"}},
   :cmns-av/explanatoryNote
   "A technical specification is a specification expressing technical requirements, such as one for designing and developing a solution to be implemented.",
   :db/ident :cmns-doc/TechnicalSpecificationDocument,
   :rdf/type :owl/Class,
   :rdfs/label "technical specification document",
   :rdfs/subClassOf #{:cmns-doc/ReferenceDocument :cmns-doc/Specification},
   :skos/definition
   "document that sets out detailed requirements to be satisfied by a product, material, process or system and the procedures for checking conformity to these requirements",
   :skos/note
   "Technical specifications may evolve from a functional specification and define the technical requirements for the selected solution as part of a business agreement."})

(def hasDataSource
  {:cmns-av/usageNote
   "Although in many cases an annotation property, such as dct:source, is sufficient for this purpose, there are occasions when a more complete description of a source is required, such as to meet data lineage requirements, for which this property may be used.",
   :db/ident :cmns-doc/hasDataSource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has data source",
   :rdfs/subPropertyOf :cmns-doc/refersTo,
   :skos/definition
   "relates something, such as an agreement, contract, document, record, report, or process, to a source of data used to analyze, develop, explain, produce, or otherwise create it"})

(def isAbout
  {:db/ident :cmns-doc/isAbout,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is about",
   :skos/definition
   "indicates the subject or topic of something, such as a document"})

(def isReferredToBy
  {:db/ident :cmns-doc/isReferredToBy,
   :owl/inverseOf :cmns-doc/refersTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is referred to by",
   :skos/definition
   "indicates something that is referenced as a source for information or explanation"})

(def isSpecifiedIn
  {:db/ident :cmns-doc/isSpecifiedIn,
   :owl/inverseOf :cmns-doc/specifies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is specified in",
   :rdfs/subPropertyOf :cmns-doc/refersTo,
   :skos/definition
   "indicates the explicit source for some requirement, fact, or set of facts"})

(def records
  {:db/ident        :cmns-doc/records,
   :rdf/type        :owl/ObjectProperty,
   :rdfs/label      "records",
   :skos/definition "documents for later reference"})

(def refersTo
  {:db/ident :cmns-doc/refersTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "refers to",
   :skos/definition
   "makes reference to as a source for information or explanation"})

(def specifies
  {:cmns-av/explanatoryNote
   "Specifies may be used to refer to a requirement, fact, or set of facts.",
   :db/ident :cmns-doc/specifies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "specifies",
   :skos/definition
   "mentions, names or states something clearly and definitively"})

(def urn:uuid:bf16143a-811c-5395-80b1-44f495b116c7
  {:cmns-av/copyright #{"Copyright (c) 2023 Object Management Group, Inc."
                        "Copyright (c) 2022-2023 Mayo Clinic"
                        "Copyright (c) 2022-2023 Thematix Partners LLC"
                        "Copyright (c) 2014-2023 EDM Council, Inc."
                        "Copyright (c) 2022-2023 Federated Knowledge LLC"},
   :dcterms/abstract
   "This ontology defines high-level concepts for representation of documents, including legal documents and records, such as a transaction record, purchase history, or payment history. It is deliberately lightweight in order to accommodate mappings to other document and bibliographic ontologies.",
   :dcterms/contributor
   #{"Pete Rivett, Federated Knowledge LLC"
     "Evan Wallace, U.S. National Institute of Standards and Technology (NIST)"
     "Davide Sottara, Mayo Clinic" "Elisa Kendall, Thematix Partners LLC"},
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :owl/imports {:xsd/anyURI
                 "https://www.omg.org/spec/Commons/AnnotationVocabulary/"},
   :owl/versionIRI {:xsd/anyURI
                    "https://www.omg.org/spec/Commons/20230801/Documents/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Commons Documents Ontology",
   :skos/note
   "This ontology was derived from the Financial Industry Business Ontology (FIBO), and generalized for use in other domain areas.",
   :xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"})