(ns net.wikipunk.rdf.gleif-L1
  {:dcat/downloadURL "https://www.gleif.org/ontology/v1.0/L1/ontology.ttl",
   :dcterms/abstract
   {:rdf/language "en",
    :rdf/value
    "Ontology for legal entity identifier registration. It was designed for Global Legal Entity Identifier Foundation (GLEIF) Level 1 data corresponding to the Common Data Format version 2.1. It covers key reference data for a legal entity identifiable with an LEI. The ISO 17442 standard developed by the International Organization for Standardization defines a set of attributes or LEI reference data that comprises the most essential elements of identification. It specifies the minimum reference data, which must be supplied for each LEI:\n    The official name of the legal entity as recorded in the official registers.\n    The registered address of that legal entity.\n    The country of formation.\n    The codes for the representation of names of countries and their subdivisions.\n    The date of the first LEI assignment; the date of last update of the LEI information; and the date of expiry, if applicable."},
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
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :dcterms/title
   {:rdf/language "en",
    :rdf/value
    "Global Legal Entity Identifier Foundation Level 1 Ontology - Who Is Who"},
   :namespaces
   {"dcterms" "http://purl.org/dc/terms/",
    "gleif-L1" "https://www.gleif.org/ontology/L1/",
    "gleif-base" "https://www.gleif.org/ontology/Base/",
    "gleif-elf" "https://www.gleif.org/ontology/EntityLegalForm/",
    "gleif-ra" "https://www.gleif.org/ontology/RegistrationAuthority/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "vann" "http://purl.org/vocab/vann/",
    "voaf" "http://purl.org/vocommons/voaf#",
    "xml" "http://www.w3.org/XML/1998/namespace",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.gleif.org/ontology/Base/"}
     {:xsd/anyURI "https://www.gleif.org/ontology/EntityLegalForm/"}
     {:xsd/anyURI "https://www.gleif.org/ontology/RegistrationAuthority/"}},
   :owl/versionIRI {:xsd/anyURI "https://www.gleif.org/ontology/L1-v1.0/L1/"},
   :rdf/type #{:owl/Ontology :voaf/Vocabulary},
   :rdfa/prefix "gleif-L1",
   :rdfa/uri "https://www.gleif.org/ontology/L1/",
   :rdfs/label "GLEIF L1 Ontology",
   :vann/preferredNamespacePrefix "gleif-L1",
   :vann/preferredNamespaceUri "https://www.gleif.org/ontology/L1/",
   :xsd/anyURI "https://www.gleif.org/ontology/L1/"})

(def Branch
  {:db/ident         :gleif-L1/Branch,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label       "branch",
   :rdfs/subClassOf  :gleif-L1/RegisteredEntity,
   :skos/definition  "The entity is a branch of another legal entity."})

(def BusinessRegistryIdentifier
  {:db/ident :gleif-L1/BusinessRegistryIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "business registry identifier",
   :rdfs/subClassOf
   #{{:owl/onClass    :gleif-L1/RegisteredEntity,
      :owl/onProperty :gleif-base/identifies,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/onDataRange :xsd/string,
      :owl/onProperty  :gleif-L1/hasEntityID,
      :owl/qualifiedCardinality 1,
      :rdf/type        :owl/Restriction} :gleif-base/RegistryIdentifier
     {:owl/maxQualifiedCardinality 1,
      :owl/onClass    :gleif-ra/BusinessRegistry,
      :owl/onProperty :gleif-L1/hasRegisteredAuthority,
      :rdf/type       :owl/Restriction}
     {:owl/intersectionOf
      [{:owl/unionOf [{:owl/onClass    :gleif-ra/BusinessRegistry,
                       :owl/onProperty :gleif-L1/hasRegisteredAuthority,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :gleif-L1/hasOtherAuthority,
                       :rdf/type        :owl/Restriction}],
        :rdf/type    :owl/Class}
       {:owl/complementOf {:owl/intersectionOf
                           [{:owl/onProperty :gleif-L1/hasRegisteredAuthority,
                             :owl/someValuesFrom :gleif-ra/BusinessRegistry,
                             :rdf/type :owl/Restriction}
                            {:owl/minCardinality 1,
                             :owl/onProperty     :gleif-L1/hasOtherAuthority,
                             :rdf/type           :owl/Restriction}],
                           :rdf/type :owl/Class},
        :rdf/type         :owl/Class}]}
     {:owl/maxCardinality 1,
      :owl/onProperty     :gleif-L1/hasOtherAuthority,
      :rdf/type           :owl/Restriction}},
   :skos/definition "The legal entity is a branch of another legal entity."})

(def Fund
  {:db/ident         :gleif-L1/Fund,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label       "fund",
   :rdfs/subClassOf  #{{:owl/maxCardinality 1,
                        :owl/onProperty     :gleif-L1/hasFundFamilyName,
                        :rdf/type           :owl/Restriction}
                       {:owl/maxQualifiedCardinality 1,
                        :owl/onClass    :gleif-L1/FundFamily,
                        :owl/onProperty :gleif-L1/hasFundFamily,
                        :rdf/type       :owl/Restriction}
                       {:owl/complementOf {:owl/intersectionOf
                                           [{:owl/onProperty
                                             :gleif-L1/hasFundFamily,
                                             :owl/someValuesFrom
                                             :gleif-L1/FundFamily,
                                             :rdf/type :owl/Restriction}
                                            {:owl/minCardinality 1,
                                             :owl/onProperty
                                             :gleif-L1/hasFundFamilyName,
                                             :rdf/type :owl/Restriction}],
                                           :rdf/type :owl/Class},
                        :rdf/type         :owl/Class}
                       :gleif-L1/RegisteredEntity},
   :skos/definition  "The legal entity is a fund."})

(def FundFamily
  {:db/ident         :gleif-L1/FundFamily,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label       "fund family",
   :rdfs/subClassOf  :gleif-L1/LegalEntity,
   :skos/definition  "The entity that is the manager of one or more funds."})

(def GlobalLegalEntityIdentifierSystem
  {:db/ident :gleif-L1/GlobalLegalEntityIdentifierSystem,
   :gleif-base/hasWebsite
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/gleif-management-of-the-global-lei-system"},
   :gleif-base/isManagedBy :gleif-base/GLEIF,
   :rdf/type :gleif-base/Registry,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "Global Legal Entity Identifier System",
   :skos/altLabel "GLEIS",
   :skos/definition "The global repository of LEIs and reference data.",
   :skos/prefLabel "Global Legal Entity Identifier System"})

(def LEI
  {:db/ident :gleif-L1/LEI,
   :rdf/type #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "LEI",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :gleif-base/hasTag,
   :skos/altLabel "has LEI string",
   :skos/definition
   "The ISO 17442 compatible identifier for the legal entity recorded.",
   :skos/prefLabel "LEI"})

(def LegalEntity
  {:db/ident :gleif-L1/LegalEntity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "legal entity",
   :rdfs/subClassOf #{:gleif-base/LegalPerson :gleif-L1/RegisteredEntity},
   :skos/definition
   "LEI-registered entities that are legally or financially responsible for the performance of financial transactions or have the legal right in their jurisdiction to enter independently into legal contracts, regardless of whether they are incorporated or constituted in some other way (e.g. trust, partnership, contractual). It excludes natural persons, but includes governmental organizations and supranationals."})

(def LegalEntityIdentifier
  {:db/ident :gleif-L1/LegalEntityIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "legal entity identifier",
   :rdfs/subClassOf #{{:owl/onClass    :gleif-L1/RegisteredEntity,
                       :owl/onProperty :gleif-base/identifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction} :gleif-base/Identifier
                      {:owl/onDataRange :xsd/string,
                       :owl/onProperty  :gleif-L1/LEI,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}},
   :skos/definition
   "The ISO 17442 compatible identifier for the legal entity referenced."})

(def LegalEntityIdentifierRegistryEntry
  {:db/ident :gleif-L1/LegalEntityIdentifierRegistryEntry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "legal entity identifier registry entry",
   :rdfs/subClassOf
   #{{:owl/onClass    {:owl/oneOf [:gleif-L1/RegistrationStatusAnnulled
                                   :gleif-L1/RegistrationStatusDuplicate
                                   :gleif-L1/RegistrationStatusIssued
                                   :gleif-L1/RegistrationStatusLapsed
                                   :gleif-L1/RegistrationStatusMerged
                                   :gleif-L1/RegistrationStatusPendingArchival
                                   :gleif-L1/RegistrationStatusPendingTransfer
                                   :gleif-L1/RegistrationStatusRetired],
                       :rdf/type  :owl/Class},
      :owl/onProperty :gleif-base/hasRegistrationStatus,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 1,
      :owl/onClass    {:owl/oneOf
                       [:gleif-L1/ValidationSourceKindEntitySuppliedOnly
                        :gleif-L1/ValidationSourceKindFullyCorroborated
                        :gleif-L1/ValidationSourceKindPartiallyCorroborated],
                       :rdf/type :owl/Class},
      :owl/onProperty :gleif-L1/hasValidationSources,
      :rdf/type       :owl/Restriction}
     {:owl/maxQualifiedCardinality 1,
      :owl/onClass    :gleif-L1/BusinessRegistryIdentifier,
      :owl/onProperty :gleif-L1/hasValidationIdentifier,
      :rdf/type       :owl/Restriction}
     {:owl/onClass    :gleif-L1/RegisteredEntity,
      :owl/onProperty :gleif-L1/identifiesAndRecords,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :gleif-L1/BusinessRegistryIdentifier,
      :owl/onProperty :gleif-L1/hasOtherValidationIdentifier,
      :rdf/type       :owl/Restriction} :gleif-base/RegistryEntry
     {:owl/onDataRange :xsd/dateTime,
      :owl/onProperty  :gleif-base/hasLastUpdateDate,
      :owl/qualifiedCardinality 1,
      :rdf/type        :owl/Restriction}
     {:owl/onDataRange :xsd/dateTime,
      :owl/onProperty  :gleif-base/hasInitialRegistrationDate,
      :owl/qualifiedCardinality 1,
      :rdf/type        :owl/Restriction}
     {:owl/onDataRange :xsd/string,
      :owl/onProperty  :gleif-L1/LEI,
      :owl/qualifiedCardinality 1,
      :rdf/type        :owl/Restriction}
     {:owl/onClass    :gleif-L1/LocalOperatingUnit,
      :owl/onProperty :gleif-L1/hasManagingLOU,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/maxQualifiedCardinality 1,
      :owl/onDataRange :xsd/dateTime,
      :owl/onProperty  :gleif-base/hasNextRenewalDate,
      :rdf/type        :owl/Restriction}},
   :skos/definition
   "The Registration container element which contains all information on the legal entity's LEI registration with the Managing LOU."})

(def LocalOperatingUnit
  {:db/ident :gleif-L1/LocalOperatingUnit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "local operating unit",
   :rdfs/subClassOf :gleif-L1/LegalEntity,
   :skos/altLabel #{"LEI issuer" "LOU"},
   :skos/definition
   "An entity that supplies registration, renewal and other services, and acts as the primary interface for legal entities wishing to obtain an LEI. Only organizations duly accredited by the Global Legal Entity Identifier Foundation (GLEIF) are authorized to issue LEIs.",
   :skos/prefLabel "local operating unit"})

(def RegisteredEntity
  {:db/ident :gleif-L1/RegisteredEntity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "registered entity",
   :rdfs/subClassOf
   #{:gleif-base/Entity
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :gleif-base/PhysicalAddress,
      :owl/onProperty :gleif-L1/hasOtherAddresses,
      :rdf/type       :owl/Restriction}
     {:owl/complementOf {:owl/intersectionOf [{:owl/onProperty
                                               :gleif-base/hasSuccessor,
                                               :owl/someValuesFrom
                                               :gleif-L1/RegisteredEntity,
                                               :rdf/type :owl/Restriction}
                                              {:owl/minCardinality 1,
                                               :owl/onProperty
                                               :gleif-base/hasSuccessorName,
                                               :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class},
      :rdf/type         :owl/Class}
     {:owl/maxCardinality 1,
      :owl/onProperty     :gleif-base/hasSuccessorName,
      :rdf/type           :owl/Restriction}
     {:owl/onClass    :gleif-base/EntityStatus,
      :owl/onProperty :gleif-base/hasEntityStatus,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/onClass    :lcc-cr/GeographicRegion,
      :owl/onProperty :gleif-base/hasLegalJurisdiction,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/maxQualifiedCardinality 1,
      :owl/onClass    :gleif-L1/LegalEntity,
      :owl/onProperty :gleif-base/hasSuccessor,
      :rdf/type       :owl/Restriction}
     {:owl/maxQualifiedCardinality 1,
      :owl/onClass    :gleif-base/PhysicalAddressASCII,
      :owl/onProperty :gleif-L1/hasTransliteratedHeadquartersAddress,
      :rdf/type       :owl/Restriction}
     {:owl/maxQualifiedCardinality 1,
      :owl/onClass    :gleif-base/EntityExpirationReason,
      :owl/onProperty :gleif-base/hasEntityExpirationReason,
      :rdf/type       :owl/Restriction}
     {:owl/cardinality 1,
      :owl/onProperty  :gleif-L1/hasLegalName,
      :rdf/type        :owl/Restriction}
     {:owl/onClass    :gleif-base/PhysicalAddress,
      :owl/onProperty :gleif-L1/hasHeadquartersAddress,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/maxQualifiedCardinality 1,
      :owl/onClass    :gleif-base/PhysicalAddressASCII,
      :owl/onProperty :gleif-L1/hasTransliteratedLegalAddress,
      :rdf/type       :owl/Restriction}
     {:owl/onClass    :gleif-base/PhysicalAddress,
      :owl/onProperty :gleif-L1/hasLegalAddress,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/maxQualifiedCardinality 1,
      :owl/onDataRange :xsd/dateTime,
      :owl/onProperty  :gleif-base/hasEntityExpirationDate,
      :rdf/type        :owl/Restriction}
     {:owl/intersectionOf
      [{:owl/unionOf [{:owl/onClass    :gleif-elf/EntityLegalForm,
                       :owl/onProperty :gleif-L1/hasLegalForm,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :gleif-L1/hasLegalFormText,
                       :rdf/type        :owl/Restriction}],
        :rdf/type    :owl/Class}
       {:owl/complementOf {:owl/intersectionOf [{:owl/onProperty
                                                 :gleif-L1/hasLegalForm,
                                                 :owl/someValuesFrom
                                                 :gleif-elf/EntityLegalForm,
                                                 :rdf/type :owl/Restriction}
                                                {:owl/minCardinality 1,
                                                 :owl/onProperty
                                                 :gleif-L1/hasLegalFormText,
                                                 :rdf/type :owl/Restriction}],
                           :rdf/type :owl/Class},
        :rdf/type         :owl/Class}]}
     {:owl/minCardinality 0,
      :owl/onProperty     :gleif-L1/hasOtherEntityNames,
      :rdf/type           :owl/Restriction}
     {:owl/onClass    :gleif-L1/BusinessRegistryIdentifier,
      :owl/onProperty :gleif-L1/hasRegistrationIdentifier,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "LEI-registered entities including, but not limited to, unique parties that are legally or financially responsible for the performance of financial transactions or have the legal right in their jurisdiction to enter independently into legal contracts, regardless of whether they are incorporated or constituted in some other way (e.g. trust, partnership, contractual). It excludes natural persons, but includes governmental organizations and supranationals."})

(def RegistrationStatus
  {:db/ident :gleif-L1/RegistrationStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "legal entity identifier registration status",
   :rdfs/subClassOf :gleif-base/RegistrationStatus,
   :skos/definition
   "The status of the legal entity's LEI registration with the Managing LOU."})

(def RegistrationStatusAnnulled
  {:db/ident :gleif-L1/RegistrationStatusAnnulled,
   :gleif-base/hasTag "ANNULLED",
   :rdf/type #{:owl/NamedIndividual :gleif-L1/RegistrationStatus},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "annulled",
   :skos/definition
   "An LEI registration that was marked as erroneous or invalid after it was issued."})

(def RegistrationStatusDuplicate
  {:db/ident :gleif-L1/RegistrationStatusDuplicate,
   :gleif-base/hasTag "DUPLICATE",
   :rdf/type #{:owl/NamedIndividual :gleif-L1/RegistrationStatus},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "duplicate",
   :skos/definition
   "An LEI Registration that has been determined to be a duplicate registration of the same legal entity as another LEI Registration; the DUPLICATE status is assigned to the non-surviving registration (i.e. the LEI that should no longer be used)."})

(def RegistrationStatusIssued
  {:db/ident :gleif-L1/RegistrationStatusIssued,
   :gleif-base/hasTag "ISSUED",
   :rdf/type #{:owl/NamedIndividual :gleif-L1/RegistrationStatus},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "issued",
   :skos/definition
   "An LEI Registration that has been validated and issued, and which identifies an entity that was an operating legal entity as of the last update."})

(def RegistrationStatusLapsed
  {:db/ident :gleif-L1/RegistrationStatusLapsed,
   :gleif-base/hasTag "LAPSED",
   :rdf/type #{:owl/NamedIndividual :gleif-L1/RegistrationStatus},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "lapsed",
   :skos/definition
   "An LEI Registration that has not been renewed by the specified next renewal date and is not known by public sources to have ceased operation."})

(def RegistrationStatusMerged
  {:db/ident :gleif-L1/RegistrationStatusMerged,
   :gleif-base/hasTag "MERGED",
   :rdf/type #{:owl/NamedIndividual :gleif-L1/RegistrationStatus},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "merged",
   :skos/definition
   "An LEI registration for an entity that has been merged into another legal entity, such that this legal entity no longer exists as an operating entity."})

(def RegistrationStatusPendingArchival
  {:db/ident :gleif-L1/RegistrationStatusPendingArchival,
   :gleif-base/hasTag "PENDING_ARCHIVAL",
   :rdf/type #{:owl/NamedIndividual :gleif-L1/RegistrationStatus},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "pending archival",
   :skos/definition
   "An LEI registration is about to be transferred to a different LOU, after which its registration status will revert to a non-pending status."})

(def RegistrationStatusPendingTransfer
  {:db/ident :gleif-L1/RegistrationStatusPendingTransfer,
   :gleif-base/hasTag "PENDING_TRANSFER",
   :rdf/type #{:owl/NamedIndividual :gleif-L1/RegistrationStatus},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "pending transfer",
   :skos/definition
   "An LEI registration that has been requested to be transferred to another LOU. The request is being processed at the sending LOU."})

(def RegistrationStatusRetired
  {:db/ident :gleif-L1/RegistrationStatusRetired,
   :gleif-base/hasTag "RETIRED",
   :rdf/type #{:owl/NamedIndividual :gleif-L1/RegistrationStatus},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "retired",
   :skos/definition
   "An LEI registration for an entity that has ceased operation, without having been merged into another entity."})

(def SoleProprietor
  {:db/ident :gleif-L1/SoleProprietor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "sole proprietor",
   :rdfs/subClassOf :gleif-L1/LegalEntity,
   :skos/definition
   "The legal entity represents an individual acting in a business capacity"})

(def ValidationSourceKind
  {:db/ident :gleif-L1/ValidationSourceKind,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "LEI validation source kind",
   :rdfs/subClassOf :gleif-base/RegistrationStatus,
   :skos/definition
   "The level of validation of the reference data provided by the registrant."})

(def ValidationSourceKindEntitySuppliedOnly
  {:db/ident :gleif-L1/ValidationSourceKindEntitySuppliedOnly,
   :gleif-base/hasTag "ENTITY_SUPPLIED_ONLY",
   :rdf/type #{:gleif-L1/ValidationSourceKind :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "entity supplied only",
   :skos/definition
   "Based on the validation procedures in use by the LOU responsible for the record, the information associated with this record has significant reliance on the information that a submitter provided due to the unavailability of corroborating information."})

(def ValidationSourceKindFullyCorroborated
  {:db/ident :gleif-L1/ValidationSourceKindFullyCorroborated,
   :gleif-base/hasTag "FULLY_CORROBORATED",
   :rdf/type #{:gleif-L1/ValidationSourceKind :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "fully corroborated",
   :skos/definition
   "Based on the validation procedures in use by the LOU responsible for the record, there is sufficient information contained in authoritative public sources to corroborate the information that the submitter has provided for the record."})

(def ValidationSourceKindPartiallyCorroborated
  {:db/ident :gleif-L1/ValidationSourceKindPartiallyCorroborated,
   :gleif-base/hasTag "PARTIALLY_CORROBORATED",
   :rdf/type #{:gleif-L1/ValidationSourceKind :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "partially corroborated",
   :skos/definition
   "Based on the validation procedures in use by the LOU responsible for the record, the information supplied by the registrant can be partially corroborated by public authoritative sources, while some of the record is dependent upon the information that the registrant submitted, either due to conflicts with authoritative information, or due to data unavailability."})

(def hasAlternativeLanguageHeadquartersAddress
  {:db/ident :gleif-L1/hasAlternativeLanguageHeadquartersAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has alternative language headquarters address",
   :rdfs/subPropertyOf #{:gleif-base/hasAddressHeadquarters
                         :gleif-L1/hasOtherAddresses},
   :skos/definition
   "Address of the headquarters of the entity, in an alternative language used in the legal jurisdiction."})

(def hasAlternativeLanguageLegalAddress
  {:db/ident :gleif-L1/hasAlternativeLanguageLegalAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has alternative language legal address",
   :rdfs/subPropertyOf #{:gleif-L1/hasOtherAddresses
                         :gleif-base/hasAddressLegal},
   :skos/definition
   "Registered address of the entity in the legal jurisdiction, in analternative language used in the legal jurisdiction."})

(def hasAlternativeLanguageLegalName
  {:db/ident :gleif-L1/hasAlternativeLanguageLegalName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has other entity names",
   :rdfs/subPropertyOf #{:gleif-base/hasNameAdditionalLocal
                         :gleif-L1/hasOtherEntityNames},
   :skos/definition
   "Registered name of the entity in an alternative language in the legal jurisdiction in which the entity is registered."})

(def hasAssociatedEntity
  {:db/ident :gleif-L1/hasAssociatedEntity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :gleif-L1/RegisteredEntity,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has associated entity",
   :rdfs/range :gleif-L1/RegisteredEntity,
   :skos/definition
   "Another entity associated with this entity if needed to fully identify this entity or to place it in an appropriate context."})

(def hasAssociatedEntityName
  {:db/ident :gleif-L1/hasAssociatedEntityName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :gleif-L1/RegisteredEntity,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has associated entity name",
   :skos/definition
   "The name of another entity associated with this entity if needed to fully identify this entity or to place it in an appropriate context."})

(def hasAutoASCIITransliteratedHeadquartersAddress
  {:db/ident :gleif-L1/hasAutoASCIITransliteratedHeadquartersAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has auto ASCII transliterated headquarters address",
   :rdfs/subPropertyOf :gleif-L1/hasTransliteratedHeadquartersAddress,
   :skos/definition
   "Auto transliterated headquarters address for the legal entity."})

(def hasAutoASCIITransliteratedLegalAddress
  {:db/ident :gleif-L1/hasAutoASCIITransliteratedLegalAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has auto ASCII transliterated legal address",
   :rdfs/subPropertyOf :gleif-L1/hasTransliteratedLegalAddress,
   :skos/definition "Auto transliterated legal address for the legal entity."})

(def hasAutoASCIITransliteratedLegalName
  {:db/ident :gleif-L1/hasAutoASCIITransliteratedLegalName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has auto ASCII transliterated legal name",
   :rdfs/subPropertyOf #{:gleif-base/hasNameASCIIAutomatic
                         :gleif-L1/hasTransliteratedOtherEntityNames},
   :skos/definition
   "Legal name of the entity transliterated to ASCII characters, auto-transliterated by the managing LOU."})

(def hasEntityID
  {:db/ident :gleif-L1/hasEntityID,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :gleif-L1/BusinessRegistryIdentifier,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has entity id",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :gleif-base/hasTag,
   :skos/definition
   "The identifier of the entity at the indicated registration authority. Typically, the identifier of the legal entity as maintained by a business registry in the jurisdiction of legal registration, or if the entity is one that is not recorded in a business registry (e.g. one of the varieties of funds registered instead with financial regulators), the identifier of the entity in the appropriate registration authority."})

(def hasFundFamily
  {:db/ident           :gleif-L1/hasFundFamily,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :gleif-L1/Fund,
   :rdfs/isDefinedBy   {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label         "has fund family",
   :rdfs/range         :gleif-L1/FundFamily,
   :rdfs/subPropertyOf #{:gleif-base/isManagedBy :gleif-L1/hasAssociatedEntity},
   :skos/definition    "The entity that is the manager of the fund."})

(def hasFundFamilyName
  {:db/ident :gleif-L1/hasFundFamilyName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :gleif-L1/Fund,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has fund family name",
   :rdfs/subPropertyOf :gleif-L1/hasAssociatedEntityName,
   :skos/definition "The name of an entity that is the manager of the fund."})

(def hasHeadquartersAddress
  {:db/ident :gleif-L1/hasHeadquartersAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :gleif-base/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has headquarters address",
   :rdfs/range :gleif-base/PhysicalAddress,
   :rdfs/subPropertyOf :gleif-base/hasAddressHeadquarters,
   :skos/definition "The primary address of the headquarters of the Entity."})

(def hasLegalAddress
  {:db/ident :gleif-L1/hasLegalAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :gleif-base/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has legal address",
   :rdfs/range :gleif-base/PhysicalAddress,
   :rdfs/subPropertyOf :gleif-base/hasAddressLegal,
   :skos/definition
   "The primary legal address of the entity as recorded in the registration of the entity in its legal jurisdiction."})

(def hasLegalForm
  {:db/ident :gleif-L1/hasLegalForm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :gleif-base/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has legal form",
   :rdfs/range :gleif-elf/EntityLegalForm,
   :skos/definition
   "The legal form of the entity, taken from the ISO 20275 Entity Legal Form (ELF) data set maintained by GLEIF."})

(def hasLegalFormText
  {:db/ident :gleif-L1/hasLegalFormText,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :gleif-base/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has legal form",
   :skos/definition
   "A legacy code or textual description for the legal entity's legal form, used until a current code from the GLEIF-maintained list can be used."})

(def hasLegalName
  {:db/ident           :gleif-L1/hasLegalName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label         "has legal name",
   :rdfs/subPropertyOf :gleif-base/hasNameLegalLocal,
   :skos/definition    "The legal name of the entity."})

(def hasManagingLOU
  {:db/ident :gleif-L1/hasManagingLOU,
   :rdf/type #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/domain :gleif-base/RegistryEntry,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has managing LOU",
   :rdfs/range :gleif-L1/LocalOperatingUnit,
   :rdfs/subPropertyOf :gleif-base/isManagedBy,
   :skos/definition
   "The LOU that is responsible for administering this LEI registration."})

(def hasOtherAddresses
  {:db/ident :gleif-L1/hasOtherAddresses,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has other addresses",
   :rdfs/subPropertyOf :gleif-base/hasAddress,
   :skos/definition
   "An optional list of other addresses for the legal entity, excluding transliterations."})

(def hasOtherAuthority
  {:db/ident :gleif-L1/hasOtherAuthority,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :gleif-ra/BusinessRegistry
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has other authority",
   :skos/definition
   "A legacy / historical reference code of a registration authority which is not yet entered in the Registration Authorities Code List (RAL) maintained by GLEIF, or the designation of an interim register until such time as an entry from RAL can be delivered. "})

(def hasOtherEntityNames
  {:db/ident :gleif-L1/hasOtherEntityNames,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has other entity names",
   :rdfs/subPropertyOf :gleif-base/hasNameAdditional,
   :skos/definition
   "An optional list of other names (excluding transliterations) for the legal entity.",
   :skos/note
   "Not expected to be used directly: use one of its subProperties."})

(def hasOtherValidationIdentifier
  {:db/ident :gleif-L1/hasOtherValidationIdentifier,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has other validation identifier",
   :rdfs/range :gleif-base/RegistryIdentifier,
   :skos/altLabel "has additional validation identifier",
   :skos/definition
   "An optional list of additional registrations used by the LEI Issuer to validate the entity data.",
   :skos/prefLabel "has other validation identifier"})

(def hasPreferredASCIITransliteratedHeadquartersAddress
  {:db/ident :gleif-L1/hasPreferredASCIITransliteratedHeadquartersAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has preferred ASCII transliterated headquarters address",
   :rdfs/subPropertyOf :gleif-L1/hasTransliteratedHeadquartersAddress,
   :skos/definition
   "Preferred transliterated headquarters address for the legal entity."})

(def hasPreferredASCIITransliteratedLegalAddress
  {:db/ident :gleif-L1/hasPreferredASCIITransliteratedLegalAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has preferred ASCII transliterated legal address",
   :rdfs/subPropertyOf :gleif-L1/hasTransliteratedLegalAddress,
   :skos/definition
   "Preferred transliterated legal address for the legal entity."})

(def hasPreferredASCIITransliteratedLegalName
  {:db/ident :gleif-L1/hasPreferredASCIITransliteratedLegalName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has preferred ASCII transliterated legal name",
   :rdfs/subPropertyOf #{:gleif-base/hasNameASCIIPreferred
                         :gleif-L1/hasTransliteratedOtherEntityNames},
   :skos/definition
   "Legal name of the entity transliterated to ASCII characters, provided by the entity for this purpose."})

(def hasPreviousLegalName
  {:db/ident           :gleif-L1/hasPreviousLegalName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label         "has previous legal name",
   :rdfs/subPropertyOf #{:gleif-base/hasNamePreviousLegal
                         :gleif-L1/hasOtherEntityNames},
   :skos/definition    "A primary legal name previously used by this entity."})

(def hasRegisteredAuthority
  {:db/ident :gleif-L1/hasRegisteredAuthority,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :gleif-ra/RegistrationAuthorityCode,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has registered authority",
   :rdfs/range :gleif-ra/BusinessRegistry,
   :rdfs/subPropertyOf :gleif-base/isRegisteredIn,
   :skos/definition
   "The reference of the registration authority, taken from the Registration Authorities Code List (RAL) maintained by GLEIF."})

(def hasRegistrationIdentifier
  {:db/ident :gleif-L1/hasRegistrationIdentifier,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has registration identifier",
   :rdfs/range :gleif-base/RegistryIdentifier,
   :skos/altLabel #{"has registration authority"
                    "has business register entity ID"},
   :skos/definition
   "An identifier for the legal entity in a business registry in the jurisdiction of legal registration, or in the appropriate registration authority.",
   :skos/prefLabel "has registration identifier"})

(def hasTradingOrOperatingName
  {:db/ident :gleif-L1/hasTradingOrOperatingName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has trading or operating name",
   :rdfs/subPropertyOf #{:gleif-base/hasNameTradingOrOperating
                         :gleif-L1/hasOtherEntityNames},
   :skos/altLabel #{"brand name" "trading as" "doing business as"
                    "operating under" "has trading or operating name"},
   :skos/definition
   "A 'trading as', 'brand name' or 'operating under' name currently used by this entity in addition to, but not replacing, the (primary) legal, official registered name",
   :skos/prefLabel "has trading or operating name"})

(def hasTransliteratedHeadquartersAddress
  {:db/ident :gleif-L1/hasTransliteratedHeadquartersAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has transliterated headquarters address",
   :rdfs/subPropertyOf #{:gleif-L1/hasTransliteratedOtherAddresses
                         :gleif-base/hasAddressHeadquarters},
   :skos/definition
   "A transliterated headquarters address for the legal entity."})

(def hasTransliteratedLegalAddress
  {:db/ident           :gleif-L1/hasTransliteratedLegalAddress,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label         "has transliterated legal address",
   :rdfs/subPropertyOf #{:gleif-L1/hasTransliteratedOtherAddresses
                         :gleif-base/hasAddressLegal},
   :skos/definition    "A transliterated legal address for the legal entity."})

(def hasTransliteratedOtherAddresses
  {:db/ident :gleif-L1/hasTransliteratedOtherAddresses,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has transliterated other addresses",
   :rdfs/subPropertyOf :gleif-base/hasAddressTransliterated,
   :skos/definition
   "An optional list of transliterated addresses for the legal entity."})

(def hasTransliteratedOtherEntityNames
  {:db/ident :gleif-L1/hasTransliteratedOtherEntityNames,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has transliterated other entity names",
   :rdfs/subPropertyOf :gleif-base/hasNameTransliterated,
   :skos/definition
   "An optional list of ASCII-transliterated (i.e. Latin- or Romanized) representations of names for the legal entity.",
   :skos/note
   "Not expected to be used directly: use one of its subProperties."})

(def hasValidationIdentifier
  {:db/ident :gleif-L1/hasValidationIdentifier,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has validation identifier",
   :rdfs/range :gleif-L1/BusinessRegistryIdentifier,
   :skos/altLabel "has validation authority",
   :skos/definition
   "The (primary) registration used by the LOU to validate the entity data.",
   :skos/prefLabel "has validation identifier"})

(def hasValidationSources
  {:db/ident :gleif-L1/hasValidationSources,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "has validation sources",
   :rdfs/range :gleif-L1/ValidationSourceKind,
   :skos/definition
   "The level of validation of the reference data provided by the registrant."})

(def identifiesAndRecords
  {:db/ident :gleif-L1/identifiesAndRecords,
   :rdf/type #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/L1/"},
   :rdfs/label "identifies and records",
   :rdfs/range :gleif-L1/RegisteredEntity,
   :rdfs/subPropertyOf #{:gleif-base/records :gleif-base/identifies},
   :skos/definition
   "The legal entity that is recorded by this registry entry and identified by the LEI."})

(def urn:uuid:5981be11-96b8-5a85-bd42-08fd54d4a104
  {:dcterms/abstract
   {:rdf/language "en",
    :rdf/value
    "Ontology for legal entity identifier registration. It was designed for Global Legal Entity Identifier Foundation (GLEIF) Level 1 data corresponding to the Common Data Format version 2.1. It covers key reference data for a legal entity identifiable with an LEI. The ISO 17442 standard developed by the International Organization for Standardization defines a set of attributes or LEI reference data that comprises the most essential elements of identification. It specifies the minimum reference data, which must be supplied for each LEI:\n    The official name of the legal entity as recorded in the official registers.\n    The registered address of that legal entity.\n    The country of formation.\n    The codes for the representation of names of countries and their subdivisions.\n    The date of the first LEI assignment; the date of last update of the LEI information; and the date of expiry, if applicable."},
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
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :dcterms/title
   {:rdf/language "en",
    :rdf/value
    "Global Legal Entity Identifier Foundation Level 1 Ontology - Who Is Who"},
   :owl/imports
   #{{:xsd/anyURI "https://www.gleif.org/ontology/Base/"}
     {:xsd/anyURI "https://www.gleif.org/ontology/EntityLegalForm/"}
     {:xsd/anyURI "https://www.gleif.org/ontology/RegistrationAuthority/"}},
   :owl/versionIRI {:xsd/anyURI "https://www.gleif.org/ontology/L1-v1.0/L1/"},
   :rdf/type #{:owl/Ontology :voaf/Vocabulary},
   :rdfs/label "GLEIF L1 Ontology",
   :vann/preferredNamespacePrefix "gleif-L1",
   :vann/preferredNamespaceUri "https://www.gleif.org/ontology/L1/",
   :xsd/anyURI "https://www.gleif.org/ontology/L1/"})
