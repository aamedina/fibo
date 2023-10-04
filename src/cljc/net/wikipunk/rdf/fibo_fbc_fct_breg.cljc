(ns net.wikipunk.rdf.fibo-fbc-fct-breg
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "cmns-cds" "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
     "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
     "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
     "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
     "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
     "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-be-corp-corp"
     "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
     "fibo-be-le-fbo"
     "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
     "fibo-be-le-lei"
     "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/",
     "fibo-be-le-lp"
     "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
     "fibo-fbc-fct-breg"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
     "fibo-fbc-fct-ra"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
     "fibo-fnd-aap-ppl"
     "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
     "fibo-fnd-arr-cls"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/",
     "fibo-fnd-arr-lif"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
     "fibo-fnd-org-fm"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
     "fibo-fnd-plc-adr"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/",
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
    :prefix "fibo-fbc-fct-breg",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/BusinessRegistries/"}
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology extends the Registration Authorities ontology to define specific kinds of registries, such as business entity registries, registries for identifiers and codes of various sorts, and registries for financial institutions and intermediaries based on jurisdiction, who regulates them, and the services they provide.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/ClassificationSchemes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/Addresses/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Organizations/Organizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/Corporations/Corporations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/AgentsAndPeople/People/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LegalPersons/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Business Registries Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FBC 1.1 RTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to clarify the definition of registry identifier and augment the definitions of certain identifiers, such as an LEI, to make them registry identifiers, as well as to modify the definition of an LOU to be a Registrar rather than RegistrationAuthority, and deprecate the redundant LOU identifier."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was modified per FIBO 2.0 RFC primarily to loosen the constraints on address properties and better support standards including ISO 9362 (BIC codes), ISO 13616 (IBAN and BBAN codes), and ISO 17442 (the GLIEF LEI standard)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to reflect the move of certain organization-specific concepts from BE to FND."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to eliminate dead links and address text formatting issues uncovered by hygiene testing."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to eliminate circular and ambiguous definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary and refine the definitions of certain date properties to allow for broader usage, such as for market-related content."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to replace hasDefinition with isDefinedIn to clarify intent."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to eliminate deprecated content."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to eliminate duplication with concepts in LCC, simplify addresses, normalize definitions to be ISO 704 compliant, and rationalize address properties."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was modified to generalize certain unions where they were no longer required, use the composite date datatype where appropriate, add individuals for entity expiration reason and validation level to better align with the GLEIF LEI data, and move international registration authorities, such as SWIFT, to a separate ontology for better modularity."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"})

(def ActiveStatus
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/ActiveStatus,
   :fibo-fnd-rel-rel/hasTag "ACTIVE",
   :rdf/type #{:fibo-fbc-fct-breg/EntityStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "active status",
   :skos/definition
   "status indicating that as of the last report or update, the entity was legally registered and operating"})

(def AnnulledStatus
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/AnnulledStatus,
   :fibo-fnd-rel-rel/hasTag "ANNULLED",
   :rdf/type #{:fibo-fbc-fct-breg/RegistrationStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "annulled status",
   :skos/definition
   "status indicating that the registration was determined to be erroneous or invalid after issuance"})

(def BusinessRegisterIdentifier
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/gleif-registration-authorities-list"},
   :db/ident :fibo-fbc-fct-breg/BusinessRegisterIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "business register identifier",
   :rdfs/subClassOf #{:cmns-id/Identifier
                      {:owl/onClass    :fibo-fbc-fct-breg/BusinessRegistry,
                       :owl/onProperty :cmns-id/identifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty :fibo-fbc-fct-ra/isRegisteredBy,
                       :owl/someValuesFrom
                       :fibo-fbc-fct-breg/BusinessRegistrationAuthority,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "identifier that uniquely identifies a business register, such as a register identified by the Global Legal Entity Identifier Foundation (GLEIF) registration authorities list"})

(def BusinessRegistrationAuthority
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/gleif-registration-authorities-list"},
   :cmns-av/explanatoryNote
   "A business registry may include any government-managed registry for registering a business, such as a state department of corporations in the US, as well as other registries such as a local operating unit (LOU) for registration of legal entity identifiers (LEIs). Any sanctioned registration authority as defined by the Registration Authorities List, published by GLEIF, is a business registration authority in this sense.",
   :db/ident :fibo-fbc-fct-breg/BusinessRegistrationAuthority,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "business registration authority",
   :rdfs/subClassOf #{:fibo-fbc-fct-ra/RegistrationAuthority
                      {:owl/onProperty :fibo-fbc-fct-ra/registers,
                       :owl/someValuesFrom
                       :fibo-be-corp-corp/RegistrationIdentifier,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-rel-rel/manages,
                       :owl/someValuesFrom :fibo-fbc-fct-breg/BusinessRegistry,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "registration authority that is responsible for maintaining a registry of business entities"})

(def BusinessRegistry
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/gleif-registration-authorities-list"},
   :db/ident :fibo-fbc-fct-breg/BusinessRegistry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "business registry",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fbc-fct-ra/hasRegistryEntry,
      :owl/someValuesFrom :fibo-fbc-fct-breg/BusinessRegistryEntry,
      :rdf/type           :owl/Restriction} :fibo-fbc-fct-ra/Registry
     {:owl/onClass    :fibo-fbc-fct-breg/BusinessRegistrationAuthority,
      :owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onDataRange :xsd/string,
      :owl/onProperty  :fibo-fbc-fct-breg/hasRegistryName,
      :rdf/type        :owl/Restriction}},
   :skos/definition
   "registry for registering and maintaining information about business entities"})

(def BusinessRegistryEntry
  {:db/ident :fibo-fbc-fct-breg/BusinessRegistryEntry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "business registry entry",
   :rdfs/subClassOf
   #{{:owl/maxQualifiedCardinality 1,
      :owl/onClass    :fibo-fbc-fct-breg/RegistrationStatus,
      :owl/onProperty :fibo-fbc-fct-breg/hasRegistrationStatus,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom :fibo-be-corp-corp/RegistrationIdentifier,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fbc-fct-ra/hasRegistrationDate,
      :owl/someValuesFrom :cmns-dt/CombinedDateTime,
      :rdf/type           :owl/Restriction} :fibo-fbc-fct-ra/RegistryEntry},
   :skos/definition "entry in a business registry"})

(def CancelledStatus
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/CancelledStatus,
   :fibo-fnd-rel-rel/hasTag "CANCELLED",
   :rdf/type #{:fibo-fbc-fct-breg/RegistrationStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "cancelled status",
   :skos/definition
   "status indicating that the registration was abandoned prior to issuance"})

(def DuplicateStatus
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/DuplicateStatus,
   :fibo-fnd-rel-rel/hasTag "DUPLICATE",
   :rdf/type #{:fibo-fbc-fct-breg/RegistrationStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "duplicate status",
   :skos/definition
   "status indicating that the registration was determined to be a duplicate registration of the same entity as another registration; duplicate status is assigned to the non-surviving registration (i.e. the identifier that should no longer be used)"})

(def EntityExpirationReason
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/EntityExpirationReason,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "entity expiration reason",
   :rdfs/subClassOf #{{:owl/onDataRange :xsd/string,
                       :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}
                      :cmns-cds/CodeElement},
   :skos/definition
   "code for the reason that a legal entity ceased to exist and/or operate"})

(def EntityExpirationReasonCorporateAction
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/EntityExpirationReasonCorporateAction,
   :fibo-fnd-rel-rel/hasTag "CORPORATE_ACTION",
   :rdf/type #{:fibo-fbc-fct-breg/EntityExpirationReason :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "entity expiration reason - corporate action",
   :skos/definition
   "expiration reason indicating that an entity was acquired or merged with another entity"})

(def EntityExpirationReasonDissolved
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/EntityExpirationReasonDissolved,
   :fibo-fnd-rel-rel/hasTag "DISSOLVED",
   :rdf/type #{:fibo-fbc-fct-breg/EntityExpirationReason :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "entity expiration reason - disolved",
   :skos/definition
   "expiration reason indicating that an entity ceased to operate"})

(def EntityExpirationReasonOther
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/EntityExpirationReasonOther,
   :fibo-fnd-rel-rel/hasTag "OTHER",
   :rdf/type #{:fibo-fbc-fct-breg/EntityExpirationReason :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "entity expiration reason - other",
   :skos/definition
   "expiration reason indicating something that is neither due to disolution nor corporate action"})

(def EntityLegalFormRegistry
  {:cmns-av/abbreviation "ELF registry",
   :cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/code-lists/iso-20275-entity-legal-forms-code-list"},
   :db/ident :fibo-fbc-fct-breg/EntityLegalFormRegistry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "entity legal form registry",
   :rdfs/subClassOf #{{:owl/onProperty :fibo-fbc-fct-ra/hasRegistryEntry,
                       :owl/someValuesFrom
                       :fibo-fbc-fct-breg/EntityLegalFormRegistryEntry,
                       :rdf/type :owl/Restriction} :fibo-fbc-fct-ra/Registry},
   :skos/definition
   "registry for registering and maintaining information about the legal forms that are valid for business entities for a particular jurisdiction following the ISO 20275 standard"})

(def EntityLegalFormRegistryEntry
  {:cmns-av/abbreviation "ELF registry entry",
   :cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/code-lists/iso-20275-entity-legal-forms-code-list"},
   :db/ident :fibo-fbc-fct-breg/EntityLegalFormRegistryEntry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "entity legal form registry entry",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom :fibo-be-le-lei/EntityLegalFormIdentifier,
      :rdf/type           :owl/Restriction} :fibo-fbc-fct-ra/RegistryEntry},
   :skos/definition
   "entry in an entity legal form registry that conforms to ISO 20275"})

(def EntityStatus
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :cmns-av/explanatoryNote
   "In some jurisdictions, there may be other possible values for entity status, such as suspended in the State of California, thus the individuals provided herein are not intended to be exhaustive.",
   :db/ident :fibo-fbc-fct-breg/EntityStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "entity status",
   :rdfs/subClassOf :fibo-fnd-arr-lif/LifecycleStage,
   :skos/definition
   "lifecycle stage indicating the operational and/or legal status of an entity"})

(def EntityValidationLevel
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/EntityValidationLevel,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "entity validation level",
   :rdfs/subClassOf #{{:owl/onDataRange :xsd/string,
                       :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}
                      :cmns-cds/CodeElement},
   :skos/definition
   "code for the level of validation performed by the GLEIF or LOU with respect to the reference data provided by the registrant"})

(def EntityValidationLevelEntitySuppliedOnly
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/EntityValidationLevelEntitySuppliedOnly,
   :fibo-fnd-rel-rel/hasTag "ENTITY_SUPPLIED_ONLY",
   :rdf/type #{:fibo-fbc-fct-breg/EntityValidationLevel :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "entity validation level - entity-supplied only",
   :skos/definition
   "Based on the validation procedures in use by the LOU responsible for the record, the information associated with this record has significant reliance on the information that a submitter provided due to the unavailability of corroborating information."})

(def EntityValidationLevelFullyCorroborated
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :fibo-fnd-rel-rel/hasTag "FULLY_CORROBORATED",
   :rdf/type #{:fibo-fbc-fct-breg/EntityValidationLevel :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "entity validation level - fully corroborated",
   :skos/definition
   "Based on the validation procedures in use by the LOU responsible for the record, there is sufficient information contained in authoritative public sources to corroborate the information that the submitter has provided for the record."})

(def EntityValidationLevelPartiallyCorroborated
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/EntityValidationLevelPartiallyCorroborated,
   :fibo-fnd-rel-rel/hasTag "PARTIALLY_CORROBORATED",
   :rdf/type #{:fibo-fbc-fct-breg/EntityValidationLevel :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "entity validation level - partially corroborated",
   :skos/definition
   "Based on the validation procedures in use by the LOU responsible for the record, the information supplied by the registrant can be partially corroborated by public authoritative sources, while some of the record is dependent upon the information that the registrant submitted, either due to conflicts with authoritative information, or due to data unavailability."})

(def InactiveStatus
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/InactiveStatus,
   :fibo-fnd-rel-rel/hasTag "INACTIVE",
   :rdf/type #{:fibo-fbc-fct-breg/EntityStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "inactive status",
   :skos/definition
   "status indicating that the entity is no longer legally registered and/or operating, whether as a result of business closure, acquisition by or merger with another (or new) entity, or determination of illegitimacy"})

(def IssuedStatus
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fnd-rel-rel/hasTag "ISSUED",
   :rdf/type #{:fibo-fbc-fct-breg/RegistrationStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "issued status",
   :skos/definition
   "status indicating that the registration has been validated and issued, and which identifies an entity that was operating legally as of the last update"})

(def LapsedStatus
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/LapsedStatus,
   :fibo-fnd-rel-rel/hasTag "LAPSED",
   :rdf/type #{:fibo-fbc-fct-breg/RegistrationStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "lapsed status",
   :skos/definition
   "status indicating that the registration that has not been renewed by the specified renewal date and is not known by public sources to have ceased operation as of the last update"})

(def LegalEntityIdentifierRegistry
  {:cmns-av/abbreviation "LEI registry",
   :cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/LegalEntityIdentifierRegistry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "legal entity identifier registry",
   :rdfs/subClassOf #{:fibo-fbc-fct-breg/BusinessRegistry
                      {:owl/onProperty :fibo-fbc-fct-ra/hasRegistryEntry,
                       :owl/someValuesFrom
                       :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "registry for registering and maintaining information about business entities for a particular jurisdiction"})

(def LegalEntityIdentifierRegistryEntry
  {:cmns-av/abbreviation "LEI registry entry",
   :cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "legal entity identifier registry entry",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fbc-fct-breg/hasRegistrationStatus,
      :owl/someValuesFrom :fibo-fbc-fct-breg/RegistrationStatus,
      :rdf/type           :owl/Restriction}
     :fibo-fbc-fct-breg/BusinessRegistryEntry
     {:owl/onProperty     :fibo-fbc-fct-breg/hasValidationLevel,
      :owl/someValuesFrom :fibo-fbc-fct-breg/EntityValidationLevel,
      :rdf/type           :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-fct-breg/BusinessRegistrationAuthority,
      :owl/onProperty :fibo-fbc-fct-breg/hasValidationAuthority,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom :fibo-be-le-lei/LegalEntityIdentifier,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "entry in a legal entity identifier registry that conforms to ISO 17442 and the Global Legal Entity Identifier Foundation (GLEIF) Common Data Format (CDF)"})

(def LocalOperatingUnit
  {:cmns-av/abbreviation "LOU",
   :cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :cmns-av/explanatoryNote
   "LOUs supply registration, renewal and other services, and act as the primary interface for legal entities wishing to obtain an LEI.",
   :db/ident :fibo-fbc-fct-breg/LocalOperatingUnit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "local operating unit",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-rel-rel/issues,
      :owl/someValuesFrom :fibo-be-le-lei/LegalEntityIdentifier,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fbc-fct-ra/registers,
      :owl/someValuesFrom :fibo-be-le-lei/LegalEntityIdentifier,
      :rdf/type           :owl/Restriction} :fibo-fbc-fct-ra/Registrar},
   :skos/definition
   "registrar that is authorized by the Global LEI Foundation to issue legal entity identifiers"})

(def MergedStatus
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/MergedStatus,
   :fibo-fnd-rel-rel/hasTag "MERGED",
   :rdf/type #{:fibo-fbc-fct-breg/RegistrationStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "merged status",
   :skos/definition
   "status indicating that the registration is for an entity that has been merged into another legal entity, such that this legal entity no longer exists as an independently operating entity"})

(def NorthAmericanIndustryClassificationSystemCode
  {:cmns-av/abbreviation "NAICS code",
   :db/ident :fibo-fbc-fct-breg/NorthAmericanIndustryClassificationSystemCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "North American Industry Classification System code",
   :rdfs/subClassOf
   #{:fibo-fnd-arr-cls/IndustrySectorClassifier
     {:owl/onDataRange :xsd/string,
      :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
      :owl/qualifiedCardinality 1,
      :rdf/type        :owl/Restriction}
     {:owl/onClass
      :fibo-fbc-fct-breg/NorthAmericanIndustryClassificationSystemScheme,
      :owl/onProperty :cmns-dsg/isDefinedIn,
      :owl/qualifiedCardinality 1,
      :rdf/type :owl/Restriction} :cmns-cds/CodeElement
     {:owl/onProperty     :cmns-cls/classifies,
      :owl/someValuesFrom :fibo-fnd-org-fm/FormalOrganization,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "the North American Industry Classification System (NAICS) code representing an industry"})

(def NorthAmericanIndustryClassificationSystemScheme
  {:cmns-av/explanatoryNote
   "The North American Industry Classification System (NAICS) is the standard used by Federal statistical agencies in classifying business establishments for the purpose of collecting, analyzing, and publishing statistical data related to the U.S. business economy.\n\nNAICS was developed under the auspices of the Office of Management and Budget (OMB), and adopted in 1997 to replace the Standard Industrial Classification (SIC) system. It was developed jointly by the U.S. Economic Classification Policy Committee (ECPC), Statistics Canada and Mexico's Instituto Nacional Estadistica y Geografia, to allow for a high level of comparability in business statistics among the North American countries.",
   :db/ident :fibo-fbc-fct-breg/NorthAmericanIndustryClassificationSystemScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "North American Industry Classification System scheme",
   :rdfs/seeAlso {:xsd/anyURI "https://www.census.gov/naics/"},
   :rdfs/subClassOf
   #{{:owl/onProperty :cmns-dsg/defines,
      :owl/someValuesFrom
      :fibo-fbc-fct-breg/NorthAmericanIndustryClassificationSystemCode,
      :rdf/type :owl/Restriction}
     :fibo-fnd-arr-cls/IndustrySectorClassificationScheme :cmns-cds/CodeSet},
   :skos/definition
   "the scheme defining the North American Industry Classification System (NAICS) Codes"})

(def PendingArchivalStatus
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/PendingArchivalStatus,
   :fibo-fnd-rel-rel/hasTag "PENDING_ARCHIVAL",
   :rdf/type #{:fibo-fbc-fct-breg/RegistrationStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "pending archival status",
   :skos/definition
   "status indicating that the registration is about to be transferred to a different registration authority, after which its registration status will revert to a non-pending status"})

(def PendingTransferStatus
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/PendingTransferStatus,
   :fibo-fnd-rel-rel/hasTag "PENDING_TRANSFER",
   :rdf/type #{:fibo-fbc-fct-breg/RegistrationStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "pending transfer status",
   :skos/definition
   "status indicating that the registration has requested transfer to a different registration authority, and for which transfer is in progress"})

(def PendingValidationStatus
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/PendingValidationStatus,
   :fibo-fnd-rel-rel/hasTag "PENDING_VALIDATION",
   :rdf/type #{:fibo-fbc-fct-breg/RegistrationStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "pending validation status",
   :skos/definition
   "status indicating that an application for registration has been submitted and is in process, pending validation"})

(def RegistrationAuthorityCode
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/gleif-registration-authorities-list"},
   :db/ident :fibo-fbc-fct-breg/RegistrationAuthorityCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "registration authority code",
   :rdfs/subClassOf #{:fibo-fbc-fct-ra/RegistryIdentifier :cmns-cds/CodeElement
                      {:owl/onClass    :fibo-fbc-fct-breg/BusinessRegistry,
                       :owl/onProperty :cmns-id/identifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "identifier that uniquely identifies a business registry, and is associated with a registration authority and jurisdiction, issued by the Global Legal Entity Identifier Foundation (GLEIF)"})

(def RegistrationStatus
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :cmns-av/explanatoryNote
   "There may be other possible values for registration status, depending on the registry, thus the individuals provided herein are not intended to be exhaustive.",
   :db/ident :fibo-fbc-fct-breg/RegistrationStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "registration status",
   :rdfs/subClassOf :fibo-fnd-arr-lif/LifecycleStage,
   :skos/definition
   "lifecycle stage indicating the status of a given registration of something, such as a business or legal entity, as specified by the registration authority"})

(def RetiredStatus
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/RetiredStatus,
   :fibo-fnd-rel-rel/hasTag "RETIRED",
   :rdf/type #{:fibo-fbc-fct-breg/RegistrationStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "retired status",
   :skos/definition
   "status indicating that the registration is for an entity that has ceased operation, without having been merged into another entity"})

(def StandardIndustrialClassificationCode
  {:cmns-av/abbreviation "SIC code",
   :db/ident :fibo-fbc-fct-breg/StandardIndustrialClassificationCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "standard industrial classification code",
   :rdfs/subClassOf
   #{:fibo-fnd-arr-cls/IndustrySectorClassifier
     {:owl/onDataRange :xsd/string,
      :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
      :owl/qualifiedCardinality 1,
      :rdf/type        :owl/Restriction}
     {:owl/onClass    :fibo-fbc-fct-breg/StandardIndustrialClassificationScheme,
      :owl/onProperty :cmns-dsg/isDefinedIn,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction} :cmns-cds/CodeElement
     {:owl/onProperty     :cmns-cls/classifies,
      :owl/someValuesFrom :fibo-fnd-org-fm/FormalOrganization,
      :rdf/type           :owl/Restriction}},
   :skos/definition "the SIC code representing an industry"})

(def StandardIndustrialClassificationScheme
  {:cmns-av/explanatoryNote
   "Standard Industrial Classifications are four-digit codes that categorize companies by the type of business activities they engage in. These codes were created by the U.S. government in 1937 to facilitate analysis of economic activity across government agencies and within industries. They were mostly replaced in 1997 by a new system of six-digit codes called the North American Industry Classification System (NAICS). The new codes were adopted in part to standardize industry data collection and analysis in between Canada, the United States and Mexico which had entered into the North American Free Trade Agreement. Note that certain organizations, such as the Securities and Exchange Commission (SEC) still use SIC codes for some purposes.",
   :db/ident :fibo-fbc-fct-breg/StandardIndustrialClassificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "standard industrial classification scheme",
   :rdfs/seeAlso {:xsd/anyURI "https://www.osha.gov/pls/imis/sic_manual.html/"},
   :rdfs/subClassOf #{:fibo-fnd-arr-cls/IndustrySectorClassificationScheme
                      :cmns-cds/CodeSet
                      {:owl/onProperty :cmns-dsg/defines,
                       :owl/someValuesFrom
                       :fibo-fbc-fct-breg/StandardIndustrialClassificationCode,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "the scheme defining the Standard Industrial Classification (SIC) Code List"})

(def TransferredStatus
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/TransferredStatus,
   :fibo-fnd-rel-rel/hasTag "TRANSFERRED",
   :rdf/type #{:fibo-fbc-fct-breg/RegistrationStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "transferred status",
   :skos/definition
   "status indicating that the registration that has been transferred to a different registration authority"})

(def hasAlternativeLanguageLegalName
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/hasAlternativeLanguageLegalName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "has alternative language legal name",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/hasLegalName,
   :skos/definition
   "denotes a registered legal name for the entity in an alternative language used in the legal jurisdiction in which the entity is registered"})

(def hasAutomaticallyTransliteratedLegalName
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/hasAutomaticallyTransliteratedLegalName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "has automatically transliterated legal name",
   :rdfs/subPropertyOf :fibo-fbc-fct-breg/hasTransliteratedLegalName,
   :skos/definition
   "denotes an auto-generated ASCII-transliterated representation of the legal name for the entity"})

(def hasEntityExpirationDate
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/hasEntityExpirationDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "has entity expiration date",
   :rdfs/range :cmns-dt/CombinedDateTime,
   :rdfs/subPropertyOf :fibo-fbc-fct-breg/hasExpiryDate,
   :skos/definition "indicates the date on which an entity ceases(d) to exist"})

(def hasEntityExpirationReason
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/hasEntityExpirationReason,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "has entity expiration reason",
   :rdfs/range :fibo-fbc-fct-breg/EntityExpirationReason,
   :rdfs/subPropertyOf :cmns-dsg/isSignifiedBy,
   :skos/definition
   "indicates the reason that an entity ceased to exist (i.e., disolved, merged with another entity, etc.)"})

(def hasEntityStatus
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/hasEntityStatus,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "has entity status",
   :rdfs/range :fibo-fbc-fct-breg/EntityStatus,
   :rdfs/subPropertyOf :fibo-fnd-arr-lif/hasStage,
   :skos/definition
   "indicates the status of the entity (i.e., active, inactive)"})

(def hasExpiryDate
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/hasExpiryDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "has expiry date",
   :rdfs/range :cmns-dt/CombinedDateTime,
   :skos/definition "indicates the date on which something ceases(d) to exist"})

(def hasInitialRegistrationDate
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/hasInitialRegistrationDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "has initial registration date",
   :rdfs/range :cmns-dt/CombinedDateTime,
   :rdfs/subPropertyOf :fibo-fbc-fct-ra/hasRegistrationDate,
   :skos/definition
   "indicates the date on which an identifier or other registered item was created and/or first registered"})

(def hasPreferredTransliteratedLegalName
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/hasPreferredTransliteratedLegalName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "has preferred transliterated legal name",
   :rdfs/subPropertyOf :fibo-fbc-fct-breg/hasTransliteratedLegalName,
   :skos/definition
   "denotes a preferred ASCII-transliterated representation of the legal name for the entity"})

(def hasPriorLegalName
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/hasPriorLegalName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "has prior legal name",
   :rdfs/subPropertyOf #{:fibo-fnd-rel-rel/wasFormerlyKnownAs
                         :fibo-fnd-rel-rel/hasLegalName},
   :skos/definition
   "denotes a primary legal name that was used previously for the entity"})

(def hasRegistrationRevisionDate
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/hasRegistrationRevisionDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "has registration status revision date",
   :rdfs/range :cmns-dt/CombinedDateTime,
   :rdfs/subPropertyOf :fibo-fbc-fct-ra/hasRegistrationDate,
   :skos/definition
   "indicates the date that the status of a specific registration in the registry was revised"})

(def hasRegistrationStatus
  {:db/ident :fibo-fbc-fct-breg/hasRegistrationStatus,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "has registration status",
   :rdfs/range :fibo-fbc-fct-breg/RegistrationStatus,
   :rdfs/subPropertyOf :fibo-fnd-arr-lif/hasStage,
   :skos/definition
   "indicates the status of a specific registration, such as for an identifier or license"})

(def hasRegistrationStatusRevisionDate
  {:db/ident :fibo-fbc-fct-breg/hasRegistrationStatusRevisionDate,
   :owl/deprecated true,
   :owl/equivalentProperty :fibo-fbc-fct-breg/hasRegistrationRevisionDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"}})

(def hasRegistryName
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/hasRegistryName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-fct-ra/Registry,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "has registry name",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/hasTextualName,
   :skos/definition
   "denotes a name for the registry, for example, for a business registry in which a business registration identifier for the legal entity is registered"})

(def hasRenewalDate
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI
      "https://www.swift.com/standards/data-standards/bic?tl=en#BICPolicyandDatarecord"}
     {:xsd/anyURI
      "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"}},
   :cmns-av/usageNote
   "This property is equivalent to the date of expiry in some registries, such as the BIC registry.",
   :db/ident :fibo-fbc-fct-breg/hasRenewalDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "has renewal date",
   :rdfs/range :cmns-dt/CombinedDateTime,
   :rdfs/subPropertyOf :fibo-fbc-fct-ra/hasRegistrationDate,
   :skos/definition
   "indicates the date by which a specific registration in the registry must be renewed or updated"})

(def hasTradingOrOperationalName
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/hasTradingOrOperationalName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "has trading or operational name",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/hasTextualName,
   :skos/definition
   "denotes a 'trading as', 'brand name', 'doing business as', or 'operating under' name currently used by the entity in addition to, but not replacing, the (primary) legal, official registered name"})

(def hasTransliteratedLegalName
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/hasTransliteratedLegalName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "has transliterated legal name",
   :rdfs/subPropertyOf #{:fibo-be-le-lei/hasTransliteratedName
                         :fibo-fnd-rel-rel/hasLegalName},
   :skos/definition
   "denotes an optional ASCII-transliterated (i.e. Latin- or Romanized) representation of the legal name for the entity"})

(def hasValidationAuthority
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fbc-fct-breg/hasValidationAuthority,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "has validation authority",
   :rdfs/range :fibo-fbc-fct-breg/BusinessRegistrationAuthority,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/hasPartyInRole,
   :skos/definition
   "identifies the business registration authority for the legal entity, used by the Local Operating Unit (LOU) as the basis for validation, as defined in the GLEIF Registration Authorities List"})

(def hasValidationDate
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.swift.com/standards/data-standards/bic?tl=en#BICPolicyandDatarecord"},
   :db/ident :fibo-fbc-fct-breg/hasValidationDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "has validation date",
   :rdfs/range :cmns-dt/CombinedDateTime,
   :rdfs/subPropertyOf :fibo-fbc-fct-ra/hasRegistrationDate,
   :skos/definition
   "indicates the date that a specific registration in the registry was most recently reviewed and validated"})

(def hasValidationLevel
  {:db/ident :fibo-fbc-fct-breg/hasValidationLevel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "has validation level",
   :rdfs/range :fibo-fbc-fct-breg/EntityValidationLevel,
   :skos/definition
   "indicates the level of validation performed by the registrar with respect to the legal entity"})

(def isSelfMaintained
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.swift.com/standards/data-standards/bic?tl=en#BICPolicyandDatarecord"},
   :db/ident :fibo-fbc-fct-breg/isSelfMaintained,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdfs/label "is self-maintained",
   :rdfs/range :xsd/string,
   :skos/definition
   "indicates whether the information about the entity is maintained internally or by a third-party"})

(def urn:uuid:c0f48f94-df73-591e-9d8c-29efb6ebad4e
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology extends the Registration Authorities ontology to define specific kinds of registries, such as business entity registries, registries for identifiers and codes of various sorts, and registries for financial institutions and intermediaries based on jurisdiction, who regulates them, and the services they provide.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/ClassificationSchemes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/Addresses/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Organizations/Organizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/Corporations/Corporations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/AgentsAndPeople/People/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LegalPersons/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/BusinessRegistries/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Business Registries Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FBC 1.1 RTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to clarify the definition of registry identifier and augment the definitions of certain identifiers, such as an LEI, to make them registry identifiers, as well as to modify the definition of an LOU to be a Registrar rather than RegistrationAuthority, and deprecate the redundant LOU identifier."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was modified per FIBO 2.0 RFC primarily to loosen the constraints on address properties and better support standards including ISO 9362 (BIC codes), ISO 13616 (IBAN and BBAN codes), and ISO 17442 (the GLIEF LEI standard)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to reflect the move of certain organization-specific concepts from BE to FND."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to eliminate dead links and address text formatting issues uncovered by hygiene testing."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to eliminate circular and ambiguous definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary and refine the definitions of certain date properties to allow for broader usage, such as for market-related content."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to replace hasDefinition with isDefinedIn to clarify intent."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to eliminate deprecated content."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to eliminate duplication with concepts in LCC, simplify addresses, normalize definitions to be ISO 704 compliant, and rationalize address properties."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was modified to generalize certain unions where they were no longer required, use the composite date datatype where appropriate, add individuals for entity expiration reason and validation level to better align with the GLEIF LEI data, and move international registration authorities, such as SWIFT, to a separate ontology for better modularity."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"})