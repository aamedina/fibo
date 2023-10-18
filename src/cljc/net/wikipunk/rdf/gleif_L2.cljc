(ns net.wikipunk.rdf.gleif-L2
  {:dcat/downloadURL "https://www.gleif.org/ontology/v1.0/L2/ontology.ttl",
   :dcterms/abstract
   {:rdf/language "en",
    :rdf/value
    "Ontology for legal entity parent relationships. It was designed for Global Legal Entity Identifier Foundation (GLEIF) Level 2 data corresponding to the Relationship Record format, version 1.1. Legal entities that have or acquire an LEI report their ‘direct accounting consolidating parent’ as well as their ‘ultimate accounting consolidating parent’, or for International Branches ‘is an International Branch of'. Otherwise they must provide a Reporting Exception."},
   :dcterms/contributor #{{:xsd/anyURI "http://purl.org/bryon"}
                          {:xsd/anyURI "http://www.workingontologist.com"}
                          {:xsd/anyURI
                           "https://www.linkedin.com/in/peterivett/"}},
   :dcterms/creator :gleif-base/GLEIF,
   :dcterms/issued #inst "2019-02-01T00:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI
                     "https://www.gleif.org/en/meta/lei-data-terms-of-use/"},
   :dcterms/rights
   "Copyright (c) 2019 Global Legal Entity Identifier Foundation (GLEIF)",
   :dcterms/rightsHolder :gleif-base/GLEIF,
   :dcterms/source
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/relationship-record-cdf-format"},
   :dcterms/title
   {:rdf/language "en",
    :rdf/value
    "Global Legal Entity Identifier Foundation Level 2 Ontology - Who Owns Whom"},
   :namespaces {"dcterms"    "http://purl.org/dc/terms/",
                "gleif-L1"   "https://www.gleif.org/ontology/L1/",
                "gleif-L2"   "https://www.gleif.org/ontology/L2/",
                "gleif-base" "https://www.gleif.org/ontology/Base/",
                "owl"        "http://www.w3.org/2002/07/owl#",
                "rdf"        "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs"       "http://www.w3.org/2000/01/rdf-schema#",
                "skos"       "http://www.w3.org/2004/02/skos/core#",
                "vann"       "http://purl.org/vocab/vann/",
                "voaf"       "http://purl.org/vocommons/voaf#",
                "xml"        "http://www.w3.org/XML/1998/namespace",
                "xsd"        "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports #{{:xsd/anyURI "https://www.gleif.org/ontology/Base/"}
                  {:xsd/anyURI "https://www.gleif.org/ontology/L1/"}},
   :owl/versionIRI {:xsd/anyURI "https://www.gleif.org/ontology/L2-v1.0/L2/"},
   :rdf/type #{:owl/Ontology :voaf/Vocabulary},
   :rdfa/prefix "gleif-L2",
   :rdfa/uri "https://www.gleif.org/ontology/L2/",
   :rdfs/label "GLEIF L2 Ontology",
   :vann/preferredNamespacePrefix "gleif-L2",
   :vann/preferredNamespaceUri "https://www.gleif.org/ontology/L2/",
   :xsd/anyURI "https://www.gleif.org/ontology/L2/"})

(def AccountingConsolidation
  {:db/ident :gleif-L2/AccountingConsolidation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "accounting consolidation",
   :rdfs/subClassOf #{{:owl/onClass    :gleif-L2/AccountingStandard,
                       :owl/onProperty :gleif-L2/hasAccountingStandard,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :gleif-base/LegalEntityRelationship},
   :skos/definition
   "Accounting consolidation holds when '[in the] financial statements of a group [...] the assets, liabilities, equity, income, expenses and cash flows of the parent and its subsidiaries are presented as those of a single economic entity'."})

(def AccountingStandard
  {:db/ident :gleif-L2/AccountingStandard,
   :owl/oneOf [:gleif-L2/AccountingStandardIFRS
               :gleif-L2/AccountingStandardOtherAccountingStandard
               :gleif-L2/AccountingStandardUSGAAP],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "accounting standard",
   :skos/definition
   "the type of accounting standard used to source consolidation information, which is based on reported accounting roll-ups"})

(def AccountingStandardIFRS
  {:db/ident :gleif-L2/AccountingStandardIFRS,
   :gleif-base/hasTag "IFRS",
   :rdf/type #{:gleif-L2/AccountingStandard :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "IFRS",
   :skos/definition
   "International Financial Reporting Standard (developed by the International Accounting Standards Board – IASB)"})

(def AccountingStandardOtherAccountingStandard
  {:db/ident :gleif-L2/AccountingStandardOtherAccountingStandard,
   :gleif-base/hasTag "OTHER_ACCOUNTING_STANDARD",
   :rdf/type #{:gleif-L2/AccountingStandard :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "other accounting standard",
   :skos/definition
   "A financial reporting (accounting) standard not otherwise listed in the latest version of the relationship data file format."})

(def AccountingStandardUSGAAP
  {:db/ident :gleif-L2/AccountingStandardUSGAAP,
   :gleif-base/hasTag "US_GAAP",
   :rdf/type #{:gleif-L2/AccountingStandard :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "US GAAP",
   :skos/definition "United States-Generally Accepted Accounting Principles."})

(def DirectConsolidation
  {:db/ident :gleif-L2/DirectConsolidation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "direct consolidation",
   :rdfs/subClassOf :gleif-L2/AccountingConsolidation,
   :skos/altLabel "is directly consolidated by",
   :skos/definition
   "The 'child' entity has its accounts fully consolidated by the 'parent' entity, in the sense given by the accounting standard(s) specified; the parent entity is the closest fully consolidating parent to the child entity in any applicable hierarchical ownership structure.",
   :skos/prefLabel "direct consolidation"})

(def InternationalBranchRelationship
  {:db/ident :gleif-L2/InternationalBranchRelationship,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "international branch relationship",
   :rdfs/subClassOf :gleif-base/LegalEntityRelationship,
   :skos/altLabel "is international branch of",
   :skos/definition
   "Child is a lead international branch or international branch network outside of the head office’s jurisdiction. The Parent is the Head Office and MUST have an LEI.",
   :skos/note
   "A non-incorporated establishment of a head office legal entity, when this establishment is located in a separate jurisdiction from the jurisdiction in which the head office legal entity is located, i.e., in a host jurisdiction outside of its home jurisdiction. Under this definition, an establishment may consist of a single office or other business premises, or of several offices (i.e., a branch network) in different locations of the same host jurisdiction: even in the latter case, only one LEI would be issued per host jurisdiction, essentially amounting to, “one country-one LEI.” Unlike foreign subsidiaries of a parent entity, which are separately incorporated or organised under the laws of the host jurisdictions, an international branch, as defined here, is legally dependent on the head office legal entity and cannot exist without its head office legal entity ",
   :skos/prefLabel "international branch relationship"})

(def LegalEntityRelationshipRecord
  {:db/ident :gleif-L2/LegalEntityRelationshipRecord,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "legal entity relationship record",
   :rdfs/subClassOf
   #{{:owl/minQualifiedCardinality 1,
      :owl/onClass    :gleif-L2/RelationshipValidationDocumentsKind,
      :owl/onProperty :gleif-L2/hasValidationDocuments,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 1,
      :owl/onClass    {:owl/oneOf
                       [:gleif-L1/ValidationSourceKindEntitySuppliedOnly
                        :gleif-L1/ValidationSourceKindFullyCorroborated
                        :gleif-L1/ValidationSourceKindPartiallyCorroborated],
                       :rdf/type :owl/Class},
      :owl/onProperty :gleif-L2/hasValidationSources,
      :rdf/type       :owl/Restriction}
     {:owl/onClass    {:owl/oneOf [:gleif-L2/RegistrationStatusAnnulled
                                   :gleif-L2/RegistrationStatusDuplicate
                                   :gleif-L2/RegistrationStatusLapsed
                                   :gleif-L2/RegistrationStatusPendingArchival
                                   :gleif-L2/RegistrationStatusPendingTransfer
                                   :gleif-L2/RegistrationStatusPublished
                                   :gleif-L2/RegistrationStatusRetired],
                       :rdf/type  :owl/Class},
      :owl/onProperty :gleif-base/hasRegistrationStatus,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction} :gleif-base/RegistryEntry
     {:owl/onDataRange :xsd/dateTime,
      :owl/onProperty  :gleif-base/hasLastUpdateDate,
      :owl/qualifiedCardinality 1,
      :rdf/type        :owl/Restriction}
     {:owl/minCardinality 0,
      :owl/onProperty     :gleif-L2/hasValidationReference,
      :rdf/type           :owl/Restriction}
     {:owl/onDataRange :xsd/dateTime,
      :owl/onProperty  :gleif-base/hasInitialRegistrationDate,
      :owl/qualifiedCardinality 1,
      :rdf/type        :owl/Restriction}
     {:owl/onClass    :gleif-base/LegalEntityRelationship,
      :owl/onProperty :gleif-base/records,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/onClass    :gleif-L1/LocalOperatingUnit,
      :owl/onProperty :gleif-L1/hasManagingLOU,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/maxQualifiedCardinality 1,
      :owl/onDataRange :xsd/dateTime,
      :owl/onProperty  :gleif-base/hasNextRenewalDate,
      :rdf/type        :owl/Restriction}},
   :skos/definition
   "The Registration container element contains information specifying the LOU's administration of the relationship record."})

(def RegistrationStatus
  {:db/ident :gleif-L2/RegistrationStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "relationship registration status",
   :rdfs/subClassOf :gleif-base/RegistrationStatus,
   :skos/definition
   "The status of the legal entity's relationship record registration with the Managing LOU."})

(def RegistrationStatusAnnulled
  {:db/ident :gleif-L2/RegistrationStatusAnnulled,
   :gleif-base/hasTag "ANNULLED",
   :rdf/type #{:owl/NamedIndividual :gleif-L2/RegistrationStatus},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "annulled",
   :skos/definition
   "A relationship data report that was marked as erroneous or invalid after it was published. The relationship report is kept in publication for historical audit trail purposes only (so that data recipients can correct their local data)."})

(def RegistrationStatusDuplicate
  {:db/ident :gleif-L2/RegistrationStatusDuplicate,
   :gleif-base/hasTag "DUPLICATE",
   :rdf/type #{:owl/NamedIndividual :gleif-L2/RegistrationStatus},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "duplicate",
   :skos/definition
   "A relationship data report that has been determined to be a  duplicate registration of the same relationship. In many cases this will mean more than one report with e.g. the same 2 entity IDs, the same relationship type, certain status values and the same relationship date(s), but this determination will depend on the relationship type in question."})

(def RegistrationStatusLapsed
  {:db/ident :gleif-L2/RegistrationStatusLapsed,
   :gleif-base/hasTag "LAPSED",
   :rdf/type #{:owl/NamedIndividual :gleif-L2/RegistrationStatus},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "lapsed",
   :skos/definition
   "A relationship data report that has not been renewed by the NextRenewalDate"})

(def RegistrationStatusPendingArchival
  {:db/ident :gleif-L2/RegistrationStatusPendingArchival,
   :gleif-base/hasTag "PENDING_ARCHIVAL",
   :rdf/type #{:owl/NamedIndividual :gleif-L2/RegistrationStatus},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "pending archival",
   :skos/definition
   "An LEI registration is about to be transferred to a different LOU, after which its registration status will revert to a non-pending status."})

(def RegistrationStatusPendingTransfer
  {:db/ident :gleif-L2/RegistrationStatusPendingTransfer,
   :gleif-base/hasTag "PENDING_TRANSFER",
   :rdf/type #{:owl/NamedIndividual :gleif-L2/RegistrationStatus},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "pending transfer",
   :skos/definition
   "An LEI registration that has been requested to be transferred to another LOU. The request is being processed at the sending LOU."})

(def RegistrationStatusPublished
  {:db/ident :gleif-L2/RegistrationStatusPublished,
   :gleif-base/hasTag "PUBLISHED",
   :rdf/type #{:owl/NamedIndividual :gleif-L2/RegistrationStatus},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "published",
   :skos/definition
   "A relationship data report that has been validated and published, and which is reported by an entity that was an operating legal entity as of the last update."})

(def RegistrationStatusRetired
  {:db/ident :gleif-L2/RegistrationStatusRetired,
   :gleif-base/hasTag "RETIRED",
   :rdf/type #{:owl/NamedIndividual :gleif-L2/RegistrationStatus},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "retired",
   :skos/definition
   "status indicating that the registration is for an entity that has ceased operation, without having been merged into another entity"})

(def RelationshipStatus
  {:db/ident :gleif-L2/RelationshipStatus,
   :owl/oneOf [:gleif-L2/RelationshipStatusActive
               :gleif-L2/RelationshipStatusInactive],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "relationship status",
   :skos/definition
   "The status of the legal entities' relationship itself: active or inactive."})

(def RelationshipStatusActive
  {:db/ident :gleif-L2/RelationshipStatusActive,
   :gleif-base/hasTag "ACTIVE",
   :rdf/type #{:owl/NamedIndividual :gleif-L2/RelationshipStatus},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "active",
   :skos/definition
   "As of the last report or update, the reporting legal entity reported that it is legally registered and/or operating, AND that the relationship detailed in this RelationshipRecord is still valid."})

(def RelationshipStatusInactive
  {:db/ident :gleif-L2/RelationshipStatusInactive,
   :gleif-base/hasTag "INACTIVE",
   :rdf/type #{:owl/NamedIndividual :gleif-L2/RelationshipStatus},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "inactive",
   :skos/definition
   "It has been determined that the relationship ended, e.g. because entity that reported this relationship is no longer legally registered and/or operating; or the relationship is no longer valid for other reasons"})

(def RelationshipValidationDocumentsKind
  {:db/ident :gleif-L2/RelationshipValidationDocumentsKind,
   :owl/oneOf
   [:gleif-L2/RelationshipValidationDocumentsKindAccountsFiling
    :gleif-L2/RelationshipValidationDocumentsKindContracts
    :gleif-L2/RelationshipValidationDocumentsKindOtherOfficialDocuments
    :gleif-L2/RelationshipValidationDocumentsKindRegulatoryFiling
    :gleif-L2/RelationshipValidationDocumentsKindSupportingDocuments],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "relationship validation documents kind",
   :skos/definition
   "Type of source document(s) used for validating the relationship."})

(def RelationshipValidationDocumentsKindAccountsFiling
  {:db/ident :gleif-L2/RelationshipValidationDocumentsKindAccountsFiling,
   :gleif-base/hasTag "ACCOUNTS_FILING",
   :rdf/type #{:gleif-L2/RelationshipValidationDocumentsKind
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "accounts filing",
   :skos/definition
   "A consolidated financial (accounting) statement, prepared and submitted to the relevant authority."})

(def RelationshipValidationDocumentsKindContracts
  {:db/ident :gleif-L2/RelationshipValidationDocumentsKindContracts,
   :gleif-base/hasTag "CONTRACTS",
   :rdf/type #{:gleif-L2/RelationshipValidationDocumentsKind
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "contracts",
   :skos/definition
   "Other documents supporting the preparation of consolidated financial statements."})

(def RelationshipValidationDocumentsKindOtherOfficialDocuments
  {:db/ident
   :gleif-L2/RelationshipValidationDocumentsKindOtherOfficialDocuments,
   :gleif-base/hasTag "OTHER_OFFICIAL_DOCUMENTS",
   :rdf/type #{:gleif-L2/RelationshipValidationDocumentsKind
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "other official documents",
   :skos/definition
   "Other official document(s) attesting to the validity of the relationship."})

(def RelationshipValidationDocumentsKindRegulatoryFiling
  {:db/ident :gleif-L2/RelationshipValidationDocumentsKindRegulatoryFiling,
   :gleif-base/hasTag "REGULATORY_FILING",
   :rdf/type #{:gleif-L2/RelationshipValidationDocumentsKind
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "regulatory filing",
   :skos/definition
   "An annual regulatory filing providing public information on parent relationships"})

(def RelationshipValidationDocumentsKindSupportingDocuments
  {:db/ident :gleif-L2/RelationshipValidationDocumentsKindSupportingDocuments,
   :gleif-base/hasTag "SUPPORTING_DOCUMENTS",
   :rdf/type #{:gleif-L2/RelationshipValidationDocumentsKind
               :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "supporting documents",
   :skos/definition
   "Other documents supporting the preparation of consolidated financial statements."})

(def UltimateConsolidation
  {:db/ident :gleif-L2/UltimateConsolidation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "ultimate consolidation",
   :rdfs/subClassOf :gleif-L2/AccountingConsolidation,
   :skos/altLabel "is ultimately consolidated by",
   :skos/definition
   "The 'child' entity has its accounts fully consolidated by the 'parent' entity, in the sense given by the accounting standard(s) specified; the child entity is the most distant fully consolidating parent from the child entity in any applicable hierarchical ownership structure.",
   :skos/prefLabel "ultimate consolidation"})

(def hasAccountingPeriod
  {:db/ident :gleif-L2/hasAccountingPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :gleif-L2/LegalEntityRelationshipRecord,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "has accounting period",
   :rdfs/range :gleif-base/Period,
   :skos/definition
   "The dates in this Period indicate the accounting period covered by the most recent validation documents for this relationship."})

(def hasAccountingStandard
  {:db/ident :gleif-L2/hasAccountingStandard,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :gleif-L2/AccountingConsolidation,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "has accounting standard",
   :rdfs/range :gleif-L2/AccountingStandard,
   :rdfs/subPropertyOf :gleif-base/isQualifiedBy,
   :skos/definition
   "The accounting standard applied to determine the definition of e.g. ultimate or direct accounting consolidating parent for the relationship. The relevant accounting standard is that applicable to the 'parent' entity."})

(def hasChild
  {:db/ident           :gleif-L2/hasChild,
   :rdf/type           #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/domain        :gleif-base/LegalEntityRelationship,
   :rdfs/isDefinedBy   {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label         "has child",
   :rdfs/range         :gleif-base/Entity,
   :rdfs/subPropertyOf :gleif-base/hasSource,
   :skos/definition    "The entity that plays the child role."})

(def hasDocumentFilingPeriod
  {:db/ident :gleif-L2/hasDocumentFilingPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :gleif-L2/LegalEntityRelationshipRecord,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "has document filing period",
   :rdfs/range :gleif-base/Period,
   :skos/definition
   "The dates in this instance of Period indicate the validity period of a regulatory filing, accounting document, or other document demonstrating the relationship's validity"})

(def hasParent
  {:db/ident           :gleif-L2/hasParent,
   :rdf/type           #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/domain        :gleif-base/LegalEntityRelationship,
   :rdfs/isDefinedBy   {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label         "has parent",
   :rdfs/range         :gleif-base/Entity,
   :rdfs/subPropertyOf :gleif-base/hasTarget,
   :skos/definition    "The entity that plays the parent role."})

(def hasRelationshipPeriod
  {:db/ident :gleif-L2/hasRelationshipPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :gleif-base/LegalEntityRelationship,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "has relationship period",
   :rdfs/range :gleif-base/Period,
   :skos/definition
   "The dates in this instance of Period indicate the duration of validity of the relationship itself, as distinct from any administrative or reporting aspects."})

(def hasRelationshipStatus
  {:db/ident :gleif-L2/hasRelationshipStatus,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :gleif-base/LegalEntityRelationship,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "has relationship status",
   :rdfs/range :gleif-L2/RelationshipStatus,
   :skos/definition
   "Indicates the status of the relationship (i.e., active, inactive)."})

(def hasValidationDocuments
  {:db/ident :gleif-L2/hasValidationDocuments,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :gleif-L2/LegalEntityRelationshipRecord,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "has validation documents",
   :rdfs/range :gleif-L2/RelationshipValidationDocumentsKind,
   :skos/definition
   "Type of source document(s) used for validating the relationship."})

(def hasValidationReference
  {:db/ident :gleif-L2/hasValidationReference,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :gleif-L2/LegalEntityRelationshipRecord,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label "has validation reference",
   :skos/definition
   "A reference to a specific document or other source used as the basis of relationship validation for this relationship record."})

(def hasValidationSources
  {:db/ident         :gleif-L2/hasValidationSources,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :gleif-L2/LegalEntityRelationshipRecord,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L2/"},
   :rdfs/label       "has validation sources",
   :rdfs/range       :gleif-L1/ValidationSourceKind,
   :skos/definition  "Level of relationship validation."})

(def urn:uuid:54595bb8-5d26-53fb-b3e6-0737716e7daa
  {:dcterms/abstract
   {:rdf/language "en",
    :rdf/value
    "Ontology for legal entity parent relationships. It was designed for Global Legal Entity Identifier Foundation (GLEIF) Level 2 data corresponding to the Relationship Record format, version 1.1. Legal entities that have or acquire an LEI report their ‘direct accounting consolidating parent’ as well as their ‘ultimate accounting consolidating parent’, or for International Branches ‘is an International Branch of'. Otherwise they must provide a Reporting Exception."},
   :dcterms/contributor #{{:xsd/anyURI "http://purl.org/bryon"}
                          {:xsd/anyURI "http://www.workingontologist.com"}
                          {:xsd/anyURI
                           "https://www.linkedin.com/in/peterivett/"}},
   :dcterms/creator :gleif-base/GLEIF,
   :dcterms/issued #inst "2019-02-01T00:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI
                     "https://www.gleif.org/en/meta/lei-data-terms-of-use/"},
   :dcterms/rights
   "Copyright (c) 2019 Global Legal Entity Identifier Foundation (GLEIF)",
   :dcterms/rightsHolder :gleif-base/GLEIF,
   :dcterms/source
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/relationship-record-cdf-format"},
   :dcterms/title
   {:rdf/language "en",
    :rdf/value
    "Global Legal Entity Identifier Foundation Level 2 Ontology - Who Owns Whom"},
   :owl/imports #{{:xsd/anyURI "https://www.gleif.org/ontology/Base/"}
                  {:xsd/anyURI "https://www.gleif.org/ontology/L1/"}},
   :owl/versionIRI {:xsd/anyURI "https://www.gleif.org/ontology/L2-v1.0/L2/"},
   :rdf/type #{:owl/Ontology :voaf/Vocabulary},
   :rdfs/label "GLEIF L2 Ontology",
   :vann/preferredNamespacePrefix "gleif-L2",
   :vann/preferredNamespaceUri "https://www.gleif.org/ontology/L2/",
   :xsd/anyURI "https://www.gleif.org/ontology/L2/"})