(ns net.wikipunk.rdf.gleif-base
  ^{:base "https://www.gleif.org/ontology/Base/",
    :namespaces
    {"dcterms" "http://purl.org/dc/terms/",
     "gleif-base" "https://www.gleif.org/ontology/Base/",
     "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "skos" "http://www.w3.org/2004/02/skos/core#",
     "vann" "http://purl.org/vocab/vann/",
     "voaf" "http://purl.org/vocommons/voaf#",
     "xml" "http://www.w3.org/XML/1998/namespace",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "gleif-base",
    :source "https://www.gleif.org/ontology/v1.0/Base/ontology.ttl"}
  {:dcterms/abstract
   {:rdf/language "en",
    :rdf/value
    "Ontology defining generic concepts for reuse by other Global Legal Entity Identifier Foundation (GLEIF) ontologies. It defines generic classes for (legal) Entities and their relationships and statuses; and generic properties for different types of name and address. It makes use of the OMG Languages Countries and Codes (LCC) ontology (based on the ISO 3166 standard) for country and region information."},
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
   :dcterms/title {:rdf/language "en",
                   :rdf/value
                   "Global Legal Entity Identifier Foundation Base Ontology"},
   :owl/imports
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"},
   :owl/versionIRI {:xsd/anyURI
                    "https://www.gleif.org/ontology/Base-v1.0/Base/"},
   :rdf/type #{:owl/Ontology :voaf/Vocabulary},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GLEIF Base Ontology"},
   :vann/preferredNamespacePrefix "gleif-base",
   :vann/preferredNamespaceUri "https://www.gleif.org/ontology/Base/",
   :xsd/anyURI "https://www.gleif.org/ontology/Base/"})

(def Entity
  {:db/ident :gleif-base/Entity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "entity",
   :rdfs/subClassOf #{{:owl/onClass    :gleif-base/EntityStatus,
                       :owl/onProperty :gleif-base/hasEntityStatus,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :gleif-base/Entity,
                       :owl/onProperty :gleif-base/hasSuccessor,
                       :rdf/type       :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :gleif-base/hasNameLegalLocal,
                       :rdf/type        :owl/Restriction}
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onClass    :gleif-base/EntityExpirationReason,
                       :owl/onProperty :gleif-base/hasEntityExpirationReason,
                       :rdf/type       :owl/Restriction}
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onDataRange :xsd/dateTime,
                       :owl/onProperty  :gleif-base/hasEntityExpirationDate,
                       :rdf/type        :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :lcc-cr/GeographicRegion,
                       :owl/onProperty :gleif-base/hasLegalJurisdiction,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "A partnership, corporation, or other organization having the capacity to negotiate contracts, assume financial obligations, and pay off debts, organized under the laws of some jurisdiction."})

(def EntityExpirationReason
  {:db/ident :gleif-base/EntityExpirationReason,
   :owl/oneOf [:gleif-base/EntityExpirationReasonCorporateAction
               :gleif-base/EntityExpirationReasonDissolved
               :gleif-base/EntityExpirationReasonOther],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "entity expiration reason",
   :skos/definition
   "The reason that an entity ceased to exist and/or operate."})

(def EntityExpirationReasonCorporateAction
  {:db/ident          :gleif-base/EntityExpirationReasonCorporateAction,
   :gleif-base/hasTag "CORPORATE_ACTION",
   :rdf/type          :gleif-base/EntityExpirationReason,
   :rdfs/isDefinedBy  {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label        "corporate action",
   :skos/definition   "The entity was acquired or merged with another entity."})

(def EntityExpirationReasonDissolved
  {:db/ident          :gleif-base/EntityExpirationReasonDissolved,
   :gleif-base/hasTag "DISSOLVED",
   :rdf/type          :gleif-base/EntityExpirationReason,
   :rdfs/isDefinedBy  {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label        "dissolved",
   :skos/definition   "The entity ceased to operate."})

(def EntityExpirationReasonOther
  {:db/ident :gleif-base/EntityExpirationReasonOther,
   :gleif-base/hasTag "OTHER",
   :rdf/type :gleif-base/EntityExpirationReason,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "other",
   :skos/definition
   "The reason for expiry is neither of dissolved nor corporate action."})

(def EntityStatus
  {:db/ident :gleif-base/EntityStatus,
   :owl/oneOf [:gleif-base/EntityStatusActive :gleif-base/EntityStatusInactive],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "entity status",
   :skos/definition
   "The operational and/or legal registration status of the entity (may be ACTIVE or INACTIVE)"})

(def EntityStatusActive
  {:db/ident :gleif-base/EntityStatusActive,
   :gleif-base/hasTag "ACTIVE",
   :rdf/type #{:owl/NamedIndividual :gleif-base/EntityStatus},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "active",
   :skos/definition
   "As of the last report or update, the entity reported that it was legally registered and operating."})

(def EntityStatusInactive
  {:db/ident :gleif-base/EntityStatusInactive,
   :gleif-base/hasTag "INACTIVE",
   :rdf/type #{:owl/NamedIndividual :gleif-base/EntityStatus},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "inactive",
   :skos/definition
   "It has been determined that the entity that was assigned the LEI is no longer legally registered and/or operating, whether as a result of business closure, acquisition by or merger with another (or new) entity, or determination of illegitimacy."})

(def GLEIF
  {:db/ident         :gleif-base/GLEIF,
   :gleif-base/hasLegalName "Global Legal Entity Identifier Foundation",
   :gleif-base/hasNameLegalLocal {:rdf/language "en",
                                  :rdf/value
                                  "Global Legal Entity Identifier Foundation"},
   :rdf/type         :gleif-base/RegistrationAuthority,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"}})

(def Identifier
  {:db/ident :gleif-base/Identifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "identifier",
   :rdfs/subClassOf #{{:owl/cardinality 1,
                       :owl/onProperty  :gleif-base/identifies,
                       :rdf/type        :owl/Restriction}
                      {:owl/onDataRange :xsd/string,
                       :owl/onProperty  :gleif-base/hasTag,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}},
   :skos/definition
   "Sequence of characters, capable of uniquely identifying that with which it is associated, within a specified context."})

(def LegalEntityRelationship
  {:db/ident :gleif-base/LegalEntityRelationship,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "legal entity relationship",
   :rdfs/subClassOf #{{:owl/onClass    :gleif-base/Entity,
                       :owl/onProperty :gleif-base/hasTarget,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onClass    :gleif-base/Entity,
                       :owl/onProperty :gleif-base/hasSource,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "abstract superclass to represent a reified directed relationship"})

(def LegalPerson
  {:db/ident :gleif-base/LegalPerson,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "legal person",
   :rdfs/subClassOf :gleif-base/Entity,
   :skos/definition
   "Any entity which can incur legal obligation and can be sued at law."})

(def Period
  {:db/ident :gleif-base/Period,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "period"},
   :rdfs/subClassOf #{{:owl/maxQualifiedCardinality 1,
                       :owl/onDataRange :xsd/dateTime,
                       :owl/onProperty  :gleif-base/hasEnd,
                       :rdf/type        :owl/Restriction}
                      {:owl/onDataRange :xsd/dateTime,
                       :owl/onProperty  :gleif-base/hasStart,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}},
   :skos/definition
   "A period of time, with at least a start time, and possibly an end."})

(def PhysicalAddress
  {:db/ident :gleif-base/PhysicalAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "physical address"},
   :rdfs/subClassOf #{{:owl/onClass    :lcc-cr/Country,
                       :owl/onProperty :gleif-base/hasCountry,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :gleif-base/hasAddressLine4,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :gleif-base/hasAddressLine2,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :gleif-base/hasAddressLine3,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty
                       :gleif-base/hasAddressNumberWithinBuilding,
                       :rdf/type :owl/Restriction}
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onClass    :lcc-cr/GeographicRegion,
                       :owl/onProperty :gleif-base/hasRegion,
                       :rdf/type       :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :gleif-base/hasMailRouting,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :gleif-base/hasPostalCode,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :gleif-base/hasAddressNumber,
                       :rdf/type           :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :gleif-base/hasCity,
                       :rdf/type        :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :gleif-base/hasAddressLine1,
                       :rdf/type        :owl/Restriction}},
   :skos/definition
   "a physical address where communications can be addressed, papers served or representatives located for any kind of organization or person",
   :skos/note
   "An address is a collection of information, presented in a mostly fixed format, used for describing the location of a building, apartment, or other structure or a plot of land, generally using political boundaries and street names as references, along with other identifiers such as house or apartment numbers.  Some addresses also contain special codes to aid routing of mail and packages, such as a ZIP code or post code. (Wikipedia)"})

(def PhysicalAddressASCII
  {:db/ident         :gleif-base/PhysicalAddressASCII,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label       "physical address ASCII",
   :rdfs/subClassOf  :gleif-base/PhysicalAddress,
   :skos/definition  "An address transliterated to ASCII characters."})

(def RegistrationAuthority
  {:db/ident :gleif-base/RegistrationAuthority,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "registration authority",
   :rdfs/subClassOf :gleif-base/Entity,
   :skos/altLabel "RA",
   :skos/definition
   "An organization that is responsible for maintaining a registry and provides registration services.",
   :skos/prefLabel "registration authority"})

(def RegistrationStatus
  {:db/ident :gleif-base/RegistrationStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "registration status",
   :skos/definition
   "A lifecycle stage indicating the status of a given registration of something, such as a business or legal entity."})

(def Registry
  {:db/ident :gleif-base/Registry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "registry",
   :rdfs/subClassOf {:owl/onClass    :gleif-base/Entity,
                     :owl/onProperty :gleif-base/isManagedBy,
                     :owl/qualifiedCardinality 1,
                     :rdf/type       :owl/Restriction},
   :skos/definition
   "A system, typically an information system, that records the registration of items."})

(def RegistryEntry
  {:db/ident :gleif-base/RegistryEntry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "registry entry",
   :skos/definition
   "An entry in a registry that specifies something about the thing that is recorded."})

(def RegistryIdentifier
  {:db/ident :gleif-base/RegistryIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "registry identifier",
   :rdfs/subClassOf #{{:owl/onProperty     :gleif-base/isRegisteredIn,
                       :owl/someValuesFrom :gleif-base/Registry,
                       :rdf/type           :owl/Restriction}
                      :gleif-base/Identifier},
   :skos/definition
   "An identifier associated with an entry in a registry, i.e., one that provides an index to the registry for the recorded item."})

(def hasAbbreviation
  {:db/ident           :gleif-base/hasAbbreviation,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label         "has abbreviation",
   :rdfs/subPropertyOf :skos/altLabel,
   :skos/definition    "An abbreviation for the entity identified."})

(def hasAbbreviationLocal
  {:db/ident :gleif-base/hasAbbreviationLocal,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has abbreviation local",
   :rdfs/subPropertyOf :gleif-base/hasAbbreviation,
   :skos/definition
   "An abbreviation using a language local to the entity identified; may be English."})

(def hasAbbreviationTransliterated
  {:db/ident :gleif-base/hasAbbreviationTransliterated,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has abbreviation transliterated",
   :rdfs/subPropertyOf :gleif-base/hasAbbreviation,
   :skos/definition "An abbreviation transliterated into a Western alphabet."})

(def hasAdditionalAddressLine
  {:db/ident :gleif-base/hasAdditionalAddressLine,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :gleif-base/PhysicalAddress,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has additional address line",
   :skos/definition
   "Means to collect the one to three specifically-named optional additional address line elements."})

(def hasAddress
  {:db/ident :gleif-base/hasAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :gleif-base/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has address",
   :rdfs/range :gleif-base/PhysicalAddress,
   :skos/definition
   "Has a means by which the entity may be located or contacted or may receive correspondence."})

(def hasAddressHeadquarters
  {:db/ident           :gleif-base/hasAddressHeadquarters,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label         "has address headquarters",
   :rdfs/subPropertyOf :gleif-base/hasAddress,
   :skos/definition    "An address of the headquarters of the Entity."})

(def hasAddressLegal
  {:db/ident :gleif-base/hasAddressLegal,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has address legal",
   :rdfs/subPropertyOf :gleif-base/hasAddress,
   :skos/definition
   "An address of the entity as recorded in the registration of the entity in its legal jurisdiction."})

(def hasAddressLine1
  {:db/ident         :gleif-base/hasAddressLine1,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :gleif-base/PhysicalAddress,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label       "has address line 1",
   :skos/definition  "The mandatory first address line element."})

(def hasAddressLine2
  {:db/ident :gleif-base/hasAddressLine2,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :gleif-base/PhysicalAddress,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has address line 2",
   :rdfs/subPropertyOf :gleif-base/hasAdditionalAddressLine,
   :skos/definition
   "The second line of the one to three optional additional address line elements."})

(def hasAddressLine3
  {:db/ident :gleif-base/hasAddressLine3,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :gleif-base/PhysicalAddress,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has address line 3",
   :rdfs/subPropertyOf :gleif-base/hasAdditionalAddressLine,
   :skos/definition
   "The third line of the one to three optional additional address line elements.",
   :skos/note "This element SHALL be omitted if address line 2 is omitted."})

(def hasAddressLine4
  {:db/ident :gleif-base/hasAddressLine4,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :gleif-base/PhysicalAddress,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has address line 4",
   :rdfs/subPropertyOf :gleif-base/hasAdditionalAddressLine,
   :skos/definition
   "The fourth line of the one to three optional additional address line elements.",
   :skos/note "This element SHALL be omitted if address line 3 is omitted."})

(def hasAddressNumber
  {:db/ident :gleif-base/hasAddressNumber,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :gleif-base/PhysicalAddress,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has address number",
   :skos/definition
   "Optional, additional structured version of an external house number, or range of numbers, contained in one of the address line elements."})

(def hasAddressNumberWithinBuilding
  {:db/ident :gleif-base/hasAddressNumberWithinBuilding,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :gleif-base/PhysicalAddress,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has address number within building",
   :skos/definition
   "Optional, additional structured version of an internal location number, or range of numbers, contained in one of the address line elements."})

(def hasAddressTransliterated
  {:db/ident :gleif-base/hasAddressTransliterated,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has address transliterated",
   :rdfs/range :gleif-base/PhysicalAddressASCII,
   :rdfs/subPropertyOf :gleif-base/hasAddress,
   :skos/definition
   "An address which has been converted from original to western text."})

(def hasCity
  {:db/ident         :gleif-base/hasCity,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :gleif-base/PhysicalAddress,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label       "has city",
   :skos/definition  "The mandatory name of the city."})

(def hasCountry
  {:db/ident :gleif-base/hasCountry,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :gleif-base/PhysicalAddress,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has country",
   :rdfs/range :lcc-cr/Country,
   :rdfs/subPropertyOf :gleif-base/hasGeographicRegion,
   :skos/definition
   "The country, based on the 2-character ISO 3166-1 country code."})

(def hasCoverageArea
  {:db/ident :gleif-base/hasCoverageArea,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has coverage area",
   :rdfs/range :lcc-cr/GeographicRegion,
   :skos/definition
   "Indicates a geographic region in which some service is provided, or to which some policy applies, or in which something is available."})

(def hasEnd
  {:db/ident         :gleif-base/hasEnd,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :gleif-base/Period,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has end"},
   :rdfs/range       :xsd/dateTime,
   :skos/definition  "The end time of a period."})

(def hasEntityExpirationDate
  {:db/ident :gleif-base/hasEntityExpirationDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :gleif-base/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has entity expiration date",
   :rdfs/range :xsd/dateTime,
   :skos/definition
   "The date that the entity ceased to operate, whether due to dissolution, merger or acquisition."})

(def hasEntityExpirationReason
  {:db/ident :gleif-base/hasEntityExpirationReason,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :gleif-base/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has entity expiration reason",
   :rdfs/range :gleif-base/EntityExpirationReason,
   :skos/definition
   "The reason that an entity ceased to exist and/or operate."})

(def hasEntityStatus
  {:db/ident :gleif-base/hasEntityStatus,
   :rdf/type #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/domain :gleif-base/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has entity status",
   :rdfs/range :gleif-base/EntityStatus,
   :skos/definition
   "Indicates the status of the entity (i.e., active, inactive)."})

(def hasFirstAddressLine
  {:db/ident         :gleif-base/hasFirstAddressLine,
   :owl/equivalentProperty :gleif-base/hasAddressLine1,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :gleif-base/PhysicalAddress,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label       "has first address line",
   :skos/definition  "The mandatory first address line element."})

(def hasGeographicRegion
  {:db/ident         :gleif-base/hasGeographicRegion,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label       "has geographic region",
   :rdfs/range       :lcc-cr/GeographicRegion,
   :skos/definition  "The country or region where something is located."})

(def hasInitialRegistrationDate
  {:db/ident :gleif-base/hasInitialRegistrationDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has initial registration date",
   :rdfs/range :xsd/dateTime,
   :rdfs/subPropertyOf :dcterms/created,
   :skos/definition
   "The date on which an identifier or other registered item was first registered."})

(def hasLastUpdateDate
  {:db/ident :gleif-base/hasLastUpdateDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has last modification date",
   :rdfs/range :xsd/dateTime,
   :rdfs/subPropertyOf :dcterms/modified,
   :skos/definition
   "The date that the detail of a specific registration in the registry was last revised."})

(def hasLegalJurisdiction
  {:db/ident :gleif-base/hasLegalJurisdiction,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :gleif-base/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has legal jurisdiction",
   :rdfs/range :lcc-cr/GeographicRegion,
   :skos/definition
   "The jurisdiction of legal formation and registration of the entity (and upon which the LegalForm data element is also dependent). "})

(def hasMailRouting
  {:db/ident :gleif-base/hasMailRouting,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :gleif-base/PhysicalAddress,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "mail routing",
   :skos/definition
   "Optional free text address line to hold content from other address lines containing explicit routing information (this element's presence indicates that this address is a routing / 'care of' address)."})

(def hasName
  {:db/ident :gleif-base/hasName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has name",
   :rdfs/subPropertyOf :rdfs/label,
   :skos/definition
   "Associates a name, reference name, or appellation with an individual resource."})

(def hasNameASCII
  {:db/ident :gleif-base/hasNameASCII,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has name ASCII",
   :rdfs/subPropertyOf :gleif-base/hasNameTransliterated,
   :skos/altLabel "has ASCII name",
   :skos/definition
   "The name used to refer to a person or organization in 7 bit ASCII text (ISO 646); also valid UNICODE (ISO 10646).",
   :skos/prefLabel "has name ASCII"})

(def hasNameASCIIAutomatic
  {:db/ident :gleif-base/hasNameASCIIAutomatic,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has name ASCII automatic",
   :rdfs/subPropertyOf #{:gleif-base/hasNameASCII :gleif-base/hasNameLegal},
   :skos/altLabel "has auto ASCII transliterated legal name",
   :skos/definition
   "Legal name of the entity transliterated to ASCII characters, auto-transliterated by the managing LOU.",
   :skos/prefLabel "has name ASCII automatic"})

(def hasNameASCIIPreferred
  {:db/ident :gleif-base/hasNameASCIIPreferred,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has name ASCII preferred",
   :rdfs/subPropertyOf #{:gleif-base/hasNameASCII :gleif-base/hasNameLegal},
   :skos/altLabel "has preferred transliterated legal name",
   :skos/definition
   "Legal name of the entity transliterated to ASCII characters, provided by the entity for this purpose.",
   :skos/prefLabel "has name ASCII preferred"})

(def hasNameAdditional
  {:db/ident :gleif-base/hasNameAdditional,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has name additional",
   :rdfs/subPropertyOf #{:skos/altLabel :gleif-base/hasName},
   :skos/altLabel "has other name",
   :skos/definition
   "The name used to refer to an person or organization informally.",
   :skos/prefLabel "has name additional"})

(def hasNameAdditionalLocal
  {:db/ident :gleif-base/hasNameAdditionalLocal,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has name additional local",
   :rdfs/subPropertyOf #{:gleif-base/hasNameAdditional
                         :gleif-base/hasNameLocal},
   :skos/definition
   "Registered name of the entity in an alternative language in the legal jurisdiction in which the entity is registered."})

(def hasNameLegal
  {:db/ident :gleif-base/hasNameLegal,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has name legal",
   :rdfs/subPropertyOf :gleif-base/hasName,
   :skos/altLabel "has legal name",
   :skos/definition
   "The name used to refer to an person or organization in legal communications.",
   :skos/prefLabel "has name legal"})

(def hasNameLegalLocal
  {:db/ident :gleif-base/hasNameLegalLocal,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has name legal local",
   :rdfs/subPropertyOf #{:skos/prefLabel :gleif-base/hasNameLegal
                         :gleif-base/hasNameLocal},
   :skos/altLabel "has local legal name",
   :skos/definition
   "The name used to refer to an person or organization in legal communications in local alphabet, which may be English.",
   :skos/prefLabel "has name legal local"})

(def hasNameLocal
  {:db/ident :gleif-base/hasNameLocal,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has name local",
   :rdfs/subPropertyOf :gleif-base/hasName,
   :skos/altLabel "has local name",
   :skos/definition
   "A name in a language local to the entity identified; may be English.",
   :skos/prefLabel "has name local"})

(def hasNamePreviousLegal
  {:db/ident           :gleif-base/hasNamePreviousLegal,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   {:xsd/anyURI "https://www.gleif.org/ontology/base/"},
   :rdfs/label         "has name previous legal",
   :rdfs/subPropertyOf :gleif-base/hasNameAdditional,
   :skos/definition    "A primary legal name previously used by this entity."})

(def hasNameTradingOrOperating
  {:db/ident :gleif-base/hasNameTradingOrOperating,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/base/"},
   :rdfs/label "has name trading or operating",
   :rdfs/subPropertyOf :gleif-base/hasNameAdditional,
   :skos/altLabel #{"brand name" "trading as" "doing business as"
                    "operating under" "has trading or operating name"},
   :skos/definition
   "A 'trading as', 'brand name' or 'operating under' name currently used by this entity in addition to, but not replacing, the (primary) legal, official registered name",
   :skos/prefLabel "has name trading or operating"})

(def hasNameTranslatedEnglish
  {:db/ident :gleif-base/hasNameTranslatedEnglish,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has name translated English",
   :rdfs/subPropertyOf :gleif-base/hasNameASCII,
   :skos/altLabel #{"has international name" "has English name"},
   :skos/definition
   "The name used to refer to a person or organization, translated into English. Transliterated to ASCII by definition.",
   :skos/prefLabel "has name translated English"})

(def hasNameTransliterated
  {:db/ident :gleif-base/hasNameTransliterated,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has name transliterated",
   :rdfs/subPropertyOf #{:skos/altLabel :gleif-base/hasName},
   :skos/altLabel #{"has transliterated name" "has transliterated other names"},
   :skos/definition
   "The name used to refer to a person or organization, converted from original to western text. Not generally the legal name.",
   :skos/prefLabel "has name transliterated"})

(def hasNextRenewalDate
  {:db/ident :gleif-base/hasNextRenewalDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has next renewal date",
   :rdfs/range :xsd/dateTime,
   :skos/definition
   "The date by which a specific registration in the registry must be renewed or updated."})

(def hasPostalCode
  {:db/ident :gleif-base/hasPostalCode,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :gleif-base/PhysicalAddress,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has postal code",
   :skos/definition
   "The (optional) postal code of this address as specified by the local postal service."})

(def hasRegion
  {:db/ident :gleif-base/hasRegion,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has region",
   :rdfs/range :lcc-cr/CountrySubdivision,
   :rdfs/subPropertyOf :gleif-base/hasGeographicRegion,
   :skos/altLabel #{"has state" "has subdivision"},
   :skos/definition
   "The (optional) region or subdivision (state, province, region, etc.) based on the 4- to 6-character ISO 3166-2 region code",
   :skos/prefLabel "has region"})

(def hasRegistrationStatus
  {:db/ident :gleif-base/hasRegistrationStatus,
   :rdf/type #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has registration status",
   :rdfs/range :gleif-base/RegistrationStatus,
   :skos/definition
   "indicates the status of a specific registration, such as for an identifier or license"})

(def hasSource
  {:db/ident :gleif-base/hasSource,
   :rdf/type #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/domain :gleif-base/LegalEntityRelationship,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has source",
   :rdfs/range :gleif-base/Entity,
   :skos/definition
   "The entity that is the source of the directed relationship."})

(def hasStart
  {:db/ident         :gleif-base/hasStart,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :gleif-base/Period,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has start"},
   :rdfs/range       :xsd/dateTime,
   :skos/definition  "The start time of a period."})

(def hasSuccessor
  {:db/ident :gleif-base/hasSuccessor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :gleif-base/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has successor",
   :rdfs/range :gleif-base/Entity,
   :skos/definition
   "The surviving/new entity which continues/replaces this registration."})

(def hasSuccessorName
  {:db/ident         :gleif-base/hasSuccessorName,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :gleif-base/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label       "has successor name",
   :skos/definition  "The name of the successor entity."})

(def hasTag
  {:db/ident :gleif-base/hasTag,
   :rdf/type #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has tag",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :skos/notation,
   :skos/definition
   "Has a unique combination of alphanumeric characters or binary representation corresponding to the identifier, code, or other element to which it applies."})

(def hasTarget
  {:db/ident :gleif-base/hasTarget,
   :rdf/type #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/domain :gleif-base/LegalEntityRelationship,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has target",
   :rdfs/range :gleif-base/Entity,
   :skos/definition
   "The entity that plays the target of the directed relationship."})

(def hasWebsite
  {:db/ident :gleif-base/hasWebsite,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "has website",
   :rdfs/range :xsd/anyURI,
   :skos/definition
   "A website associated with something, including but not limited to an organization."})

(def identifies
  {:db/ident :gleif-base/identifies,
   :rdf/type #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "identifies",
   :skos/definition
   "The relationship between an identifier and the thing it uniquely identifies."})

(def isManagedBy
  {:db/ident :gleif-base/isManagedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "is managed by",
   :skos/definition
   "Relates something to another thing that has some role in directing its affairs."})

(def isQualifiedBy
  {:db/ident :gleif-base/isQualifiedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :gleif-base/LegalEntityRelationship,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "is qualified by",
   :skos/definition
   "Any additional qualitative properties that help to categorize the relationship."})

(def isQuantifiedBy
  {:db/ident :gleif-base/isQuantifiedBy,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :gleif-base/LegalEntityRelationship,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label "is quantified by",
   :rdfs/range :xsd/decimal,
   :skos/definition
   "Any additional quantitative properties that help to categorize the relationship."})

(def isRegisteredIn
  {:db/ident         :gleif-base/isRegisteredIn,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label       "is registered in",
   :rdfs/range       :gleif-base/Registry,
   :skos/definition  "indicates the registry that something is registered in"})

(def records
  {:db/ident         :gleif-base/records,
   :rdf/type         #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/domain      :gleif-base/RegistryEntry,
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.gleif.org/ontology/Base/"},
   :rdfs/label       "records",
   :skos/definition  "The thing which the registry entry is a record of."})

(def urn:uuid:56123697-5115-567b-bc1f-dcf285706155
  {:dcterms/abstract
   {:rdf/language "en",
    :rdf/value
    "Ontology defining generic concepts for reuse by other Global Legal Entity Identifier Foundation (GLEIF) ontologies. It defines generic classes for (legal) Entities and their relationships and statuses; and generic properties for different types of name and address. It makes use of the OMG Languages Countries and Codes (LCC) ontology (based on the ISO 3166 standard) for country and region information."},
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
   :dcterms/title {:rdf/language "en",
                   :rdf/value
                   "Global Legal Entity Identifier Foundation Base Ontology"},
   :owl/imports
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"},
   :owl/versionIRI {:xsd/anyURI
                    "https://www.gleif.org/ontology/Base-v1.0/Base/"},
   :rdf/type #{:owl/Ontology :voaf/Vocabulary},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GLEIF Base Ontology"},
   :vann/preferredNamespacePrefix "gleif-base",
   :vann/preferredNamespaceUri "https://www.gleif.org/ontology/Base/",
   :xsd/anyURI "https://www.gleif.org/ontology/Base/"})
