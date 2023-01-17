(ns net.wikipunk.rdf.fibo-fbc-fct-breg
  "This ontology extends the Registration Authorities ontology to define specific kinds of registries, such as business entity registries, registries for identifiers and codes of various sorts, and registries for financial institutions and intermediaries based on jurisdiction, who regulates them, and the services they provide."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :dcterms/abstract
   "This ontology extends the Registration Authorities ontology to define specific kinds of registries, such as business entity registries, registries for identifiers and codes of various sorts, and registries for financial institutions and intermediaries based on jurisdiction, who regulates them, and the services they provide.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Organizations/FormalOrganizations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/IdentifiersAndIndices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LEIEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/FormalBusinessOrganizations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/ClassificationSchemes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Organizations/Organizations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Corporations/Corporations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/FinancialServicesEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/AgentsAndPeople/People/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/BusinessRegistries/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
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
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-aap-ppl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
    "fibo-fnd-arr-cls"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/",
    "fibo-fnd-arr-lif"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-org-fm"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
    "fibo-fnd-plc-adr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfa/prefix "fibo-fbc-fct-breg",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "Business Registries Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to eliminate deprecated elements."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to replace hasDefinition with isDefinedIn to clarify intent."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FBC 1.1 RTF report."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was modified to generalize certain unions where they were no longer required, use the composite date datatype where appropriate, add individuals for entity expiration reason and validation level to better align with the GLEIF LEI data, and move international registration authorities, such as SWIFT, to a separate ontology for better modularity."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was modified per FIBO 2.0 RFC primarily to loosen the constraints on address properties and better support standards including ISO 9362 (BIC codes), ISO 13616 (IBAN and BBAN codes), and ISO 17442 (the GLIEF LEI standard)."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to eliminate deprecated content."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to eliminate duplication with concepts in LCC, simplify addresses, normalize definitions to be ISO 704 compliant, and rationalize address properties."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to refine the definitions of certain date properties to allow for broader usage, such as for market-related content."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to eliminate dead links and address text formatting issues uncovered by hygiene testing."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to eliminate circular and ambiguous definitions."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to reflect the move of certain organization-specific concepts from BE to FND."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to clarify the definition of registry identifier and augment the definitions of certain identifiers, such as an LEI, to make them registry identifiers, as well as to modify the definition of an LOU to be a Registrar rather than RegistrationAuthority, and deprecate the redundant LOU identifier."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2015-2022 Object Management Group, Inc."
                  "Copyright (c) 2015-2022 EDM Council, Inc."],
   :sm/dependsOn
   ["https://spec.edmcouncil.org/fibo/ontology/FND/"
    "https://www.omg.org/spec/LCC/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/"
    "https://spec.edmcouncil.org/fibo/ontology/BE/"],
   :sm/fileAbbreviation "fibo-fbc-fct-breg",
   :sm/filename "BusinessRegistries.rdf"})

(def ActiveStatus
  "status indicating that as of the last report or update, the entity was legally registered and operating"
  {:db/ident :fibo-fbc-fct-breg/ActiveStatus,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :lcc-lr/hasTag "ACTIVE",
   :rdf/type [:fibo-fbc-fct-breg/EntityStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "active status",
   :skos/definition
   "status indicating that as of the last report or update, the entity was legally registered and operating"})

(def AnnulledStatus
  "status indicating that the registration was determined to be erroneous or invalid after issuance"
  {:db/ident :fibo-fbc-fct-breg/AnnulledStatus,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :lcc-lr/hasTag "ANNULLED",
   :rdf/type [:fibo-fbc-fct-breg/RegistrationStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "annulled status",
   :skos/definition
   "status indicating that the registration was determined to be erroneous or invalid after issuance"})

(def BusinessRegisterIdentifier
  "identifier that uniquely identifies a business register, such as a register identified by the Global Legal Entity Identifier Foundation (GLEIF) registration authorities list"
  {:db/ident :fibo-fbc-fct-breg/BusinessRegisterIdentifier,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/gleif-registration-authorities-list",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "business register identifier",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fbc-fct-ra/isRegisteredBy,
                      :owl/someValuesFrom
                      :fibo-fbc-fct-breg/BusinessRegistrationAuthority,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass    :fibo-fbc-fct-breg/BusinessRegistry,
                      :owl/onProperty :lcc-lr/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :lcc-lr/Identifier],
   :skos/definition
   "identifier that uniquely identifies a business register, such as a register identified by the Global Legal Entity Identifier Foundation (GLEIF) registration authorities list"})

(def BusinessRegistrationAuthority
  "registration authority that is responsible for maintaining a registry of business entities"
  {:db/ident :fibo-fbc-fct-breg/BusinessRegistrationAuthority,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/gleif-registration-authorities-list",
   :fibo-fnd-utl-av/explanatoryNote
   "A business registry may include any government-managed registry for registering a business, such as a state department of corporations in the US, as well as other registries such as a local operating unit (LOU) for registration of legal entity identifiers (LEIs). Any sanctioned registration authority as defined by the Registration Authorities List, published by GLEIF, is a business registration authority in this sense.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "business registration authority",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/manages,
                      :owl/someValuesFrom :fibo-fbc-fct-breg/BusinessRegistry,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fbc-fct-ra/registers,
                      :owl/someValuesFrom
                      :fibo-be-corp-corp/RegistrationIdentifier,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fct-ra/RegistrationAuthority],
   :skos/definition
   "registration authority that is responsible for maintaining a registry of business entities"})

(def BusinessRegistry
  "registry for registering and maintaining information about business entities"
  {:db/ident :fibo-fbc-fct-breg/BusinessRegistry,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/gleif-registration-authorities-list",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "business registry",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fbc-fct-ra/hasRegistryEntry,
     :owl/someValuesFrom :fibo-fbc-fct-breg/BusinessRegistryEntry,
     :rdf/type           :owl/Restriction}
    {:owl/onClass    :fibo-fbc-fct-breg/BusinessRegistrationAuthority,
     :owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
     :owl/qualifiedCardinality 1,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-fbc-fct-breg/hasRegistryName,
     :rdf/type        :owl/Restriction}
    :fibo-fbc-fct-ra/Registry],
   :skos/definition
   "registry for registering and maintaining information about business entities"})

(def BusinessRegistryEntry
  "entry in a business registry"
  {:db/ident :fibo-fbc-fct-breg/BusinessRegistryEntry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "business registry entry",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :owl/someValuesFrom
                      :fibo-be-corp-corp/RegistrationIdentifier,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-ra/hasRegistrationDate,
                      :owl/someValuesFrom :fibo-fnd-dt-fd/CombinedDateTime,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :fibo-fbc-fct-breg/RegistrationStatus,
                      :owl/onProperty :fibo-fbc-fct-breg/hasRegistrationStatus,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fct-ra/RegistryEntry],
   :skos/definition "entry in a business registry"})

(def CancelledStatus
  "status indicating that the registration was abandoned prior to issuance"
  {:db/ident :fibo-fbc-fct-breg/CancelledStatus,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :lcc-lr/hasTag "CANCELLED",
   :rdf/type [:fibo-fbc-fct-breg/RegistrationStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "cancelled status",
   :skos/definition
   "status indicating that the registration was abandoned prior to issuance"})

(def DuplicateStatus
  "status indicating that the registration was determined to be a duplicate registration of the same entity as another registration; duplicate status is assigned to the non-surviving registration (i.e. the identifier that should no longer be used)"
  {:db/ident :fibo-fbc-fct-breg/DuplicateStatus,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :lcc-lr/hasTag "DUPLICATE",
   :rdf/type [:fibo-fbc-fct-breg/RegistrationStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "duplicate status",
   :skos/definition
   "status indicating that the registration was determined to be a duplicate registration of the same entity as another registration; duplicate status is assigned to the non-surviving registration (i.e. the identifier that should no longer be used)"})

(def EntityExpirationReason
  "code for the reason that a legal entity ceased to exist and/or operate"
  {:db/ident :fibo-fbc-fct-breg/EntityExpirationReason,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "entity expiration reason",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/string,
                      :owl/onProperty  :lcc-lr/hasTag,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     :lcc-lr/CodeElement],
   :skos/definition
   "code for the reason that a legal entity ceased to exist and/or operate"})

(def EntityExpirationReasonCorporateAction
  "expiration reason indicating that an entity was acquired or merged with another entity"
  {:db/ident :fibo-fbc-fct-breg/EntityExpirationReasonCorporateAction,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :lcc-lr/hasTag "CORPORATE_ACTION",
   :rdf/type [:fibo-fbc-fct-breg/EntityExpirationReason :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "entity expiration reason - corporate action",
   :skos/definition
   "expiration reason indicating that an entity was acquired or merged with another entity"})

(def EntityExpirationReasonDissolved
  "expiration reason indicating that an entity ceased to operate"
  {:db/ident :fibo-fbc-fct-breg/EntityExpirationReasonDissolved,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :lcc-lr/hasTag "DISSOLVED",
   :rdf/type [:fibo-fbc-fct-breg/EntityExpirationReason :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "entity expiration reason - disolved",
   :skos/definition
   "expiration reason indicating that an entity ceased to operate"})

(def EntityExpirationReasonOther
  "expiration reason indicating something that is neither due to disolution nor corporate action"
  {:db/ident :fibo-fbc-fct-breg/EntityExpirationReasonOther,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :lcc-lr/hasTag "OTHER",
   :rdf/type [:fibo-fbc-fct-breg/EntityExpirationReason :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "entity expiration reason - other",
   :skos/definition
   "expiration reason indicating something that is neither due to disolution nor corporate action"})

(def EntityLegalFormRegistry
  "registry for registering and maintaining information about the legal forms that are valid for business entities for a particular jurisdiction following the ISO 20275 standard"
  {:db/ident :fibo-fbc-fct-breg/EntityLegalFormRegistry,
   :fibo-fnd-utl-av/abbreviation "ELF registry",
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/code-lists/iso-20275-entity-legal-forms-code-list",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "entity legal form registry",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fbc-fct-ra/hasRegistryEntry,
                      :owl/someValuesFrom
                      :fibo-fbc-fct-breg/EntityLegalFormRegistryEntry,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fct-ra/Registry],
   :skos/definition
   "registry for registering and maintaining information about the legal forms that are valid for business entities for a particular jurisdiction following the ISO 20275 standard"})

(def EntityLegalFormRegistryEntry
  "entry in an entity legal form registry that conforms to ISO 20275"
  {:db/ident :fibo-fbc-fct-breg/EntityLegalFormRegistryEntry,
   :fibo-fnd-utl-av/abbreviation "ELF registry entry",
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/code-lists/iso-20275-entity-legal-forms-code-list",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "entity legal form registry entry",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :owl/someValuesFrom
                      :fibo-be-le-lei/EntityLegalFormIdentifier,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fct-ra/RegistryEntry],
   :skos/definition
   "entry in an entity legal form registry that conforms to ISO 20275"})

(def EntityStatus
  "lifecycle stage indicating the operational and/or legal status of an entity"
  {:db/ident :fibo-fbc-fct-breg/EntityStatus,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :fibo-fnd-utl-av/explanatoryNote
   "In some jurisdictions, there may be other possible values for entity status, such as suspended in the State of California, thus the individuals provided herein are not intended to be exhaustive.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "entity status",
   :rdfs/subClassOf :fibo-fnd-arr-lif/LifecycleStage,
   :skos/definition
   "lifecycle stage indicating the operational and/or legal status of an entity"})

(def EntityValidationLevel
  "code for the level of validation performed by the GLEIF or LOU with respect to the reference data provided by the registrant"
  {:db/ident :fibo-fbc-fct-breg/EntityValidationLevel,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "entity validation level",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/string,
                      :owl/onProperty  :lcc-lr/hasTag,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     :lcc-lr/CodeElement],
   :skos/definition
   "code for the level of validation performed by the GLEIF or LOU with respect to the reference data provided by the registrant"})

(def EntityValidationLevelEntitySuppliedOnly
  "Based on the validation procedures in use by the LOU responsible for the record, the information associated with this record has significant reliance on the information that a submitter provided due to the unavailability of corroborating information."
  {:db/ident :fibo-fbc-fct-breg/EntityValidationLevelEntitySuppliedOnly,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :lcc-lr/hasTag "ENTITY_SUPPLIED_ONLY",
   :rdf/type [:fibo-fbc-fct-breg/EntityValidationLevel :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "entity validation level - entity-supplied only",
   :skos/definition
   "Based on the validation procedures in use by the LOU responsible for the record, the information associated with this record has significant reliance on the information that a submitter provided due to the unavailability of corroborating information."})

(def EntityValidationLevelFullyCorroborated
  "Based on the validation procedures in use by the LOU responsible for the record, there is sufficient information contained in authoritative public sources to corroborate the information that the submitter has provided for the record."
  {:db/ident :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :lcc-lr/hasTag "FULLY_CORROBORATED",
   :rdf/type [:fibo-fbc-fct-breg/EntityValidationLevel :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "entity validation level - fully corroborated",
   :skos/definition
   "Based on the validation procedures in use by the LOU responsible for the record, there is sufficient information contained in authoritative public sources to corroborate the information that the submitter has provided for the record."})

(def EntityValidationLevelPartiallyCorroborated
  "Based on the validation procedures in use by the LOU responsible for the record, the information supplied by the registrant can be partially corroborated by public authoritative sources, while some of the record is dependent upon the information that the registrant submitted, either due to conflicts with authoritative information, or due to data unavailability."
  {:db/ident :fibo-fbc-fct-breg/EntityValidationLevelPartiallyCorroborated,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :lcc-lr/hasTag "PARTIALLY_CORROBORATED",
   :rdf/type [:fibo-fbc-fct-breg/EntityValidationLevel :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "entity validation level - partially corroborated",
   :skos/definition
   "Based on the validation procedures in use by the LOU responsible for the record, the information supplied by the registrant can be partially corroborated by public authoritative sources, while some of the record is dependent upon the information that the registrant submitted, either due to conflicts with authoritative information, or due to data unavailability."})

(def InactiveStatus
  "status indicating that the entity is no longer legally registered and/or operating, whether as a result of business closure, acquisition by or merger with another (or new) entity, or determination of illegitimacy"
  {:db/ident :fibo-fbc-fct-breg/InactiveStatus,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :lcc-lr/hasTag "INACTIVE",
   :rdf/type [:fibo-fbc-fct-breg/EntityStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "inactive status",
   :skos/definition
   "status indicating that the entity is no longer legally registered and/or operating, whether as a result of business closure, acquisition by or merger with another (or new) entity, or determination of illegitimacy"})

(def IssuedStatus
  "status indicating that the registration has been validated and issued, and which identifies an entity that was operating legally as of the last update"
  {:db/ident :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :lcc-lr/hasTag "ISSUED",
   :rdf/type [:fibo-fbc-fct-breg/RegistrationStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "issued status",
   :skos/definition
   "status indicating that the registration has been validated and issued, and which identifies an entity that was operating legally as of the last update"})

(def LapsedStatus
  "status indicating that the registration that has not been renewed by the specified renewal date and is not known by public sources to have ceased operation as of the last update"
  {:db/ident :fibo-fbc-fct-breg/LapsedStatus,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :lcc-lr/hasTag "LAPSED",
   :rdf/type [:fibo-fbc-fct-breg/RegistrationStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "lapsed status",
   :skos/definition
   "status indicating that the registration that has not been renewed by the specified renewal date and is not known by public sources to have ceased operation as of the last update"})

(def LegalEntityIdentifierRegistry
  "registry for registering and maintaining information about business entities for a particular jurisdiction"
  {:db/ident :fibo-fbc-fct-breg/LegalEntityIdentifierRegistry,
   :fibo-fnd-utl-av/abbreviation "LEI registry",
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "legal entity identifier registry",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fbc-fct-ra/hasRegistryEntry,
                      :owl/someValuesFrom
                      :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fct-breg/BusinessRegistry],
   :skos/definition
   "registry for registering and maintaining information about business entities for a particular jurisdiction"})

(def LegalEntityIdentifierRegistryEntry
  "entry in a legal entity identifier registry that conforms to ISO 17442 and the Global Legal Entity Identifier Foundation (GLEIF) Common Data Format (CDF)"
  {:db/ident :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry,
   :fibo-fnd-utl-av/abbreviation "LEI registry entry",
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "legal entity identifier registry entry",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-rel-rel/comprises,
     :owl/someValuesFrom :fibo-be-le-lei/LegalEntityIdentifier,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fct-breg/hasRegistrationStatus,
     :owl/someValuesFrom :fibo-fbc-fct-breg/RegistrationStatus,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-fct-breg/BusinessRegistrationAuthority,
     :owl/onProperty :fibo-fbc-fct-breg/hasValidationAuthority,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fct-breg/hasValidationLevel,
     :owl/someValuesFrom :fibo-fbc-fct-breg/EntityValidationLevel,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fct-breg/BusinessRegistryEntry],
   :skos/definition
   "entry in a legal entity identifier registry that conforms to ISO 17442 and the Global Legal Entity Identifier Foundation (GLEIF) Common Data Format (CDF)"})

(def LocalOperatingUnit
  "registrar that is authorized by the Global LEI Foundation to issue legal entity identifiers"
  {:db/ident :fibo-fbc-fct-breg/LocalOperatingUnit,
   :fibo-fnd-utl-av/abbreviation "LOU",
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :fibo-fnd-utl-av/explanatoryNote
   "LOUs supply registration, renewal and other services, and act as the primary interface for legal entities wishing to obtain an LEI.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "local operating unit",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-fct-ra/registers,
                      :owl/someValuesFrom :fibo-be-le-lei/LegalEntityIdentifier,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/issues,
                      :owl/someValuesFrom :fibo-be-le-lei/LegalEntityIdentifier,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fct-ra/Registrar],
   :skos/definition
   "registrar that is authorized by the Global LEI Foundation to issue legal entity identifiers"})

(def MergedStatus
  "status indicating that the registration is for an entity that has been merged into another legal entity, such that this legal entity no longer exists as an independently operating entity"
  {:db/ident :fibo-fbc-fct-breg/MergedStatus,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :lcc-lr/hasTag "MERGED",
   :rdf/type [:fibo-fbc-fct-breg/RegistrationStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "merged status",
   :skos/definition
   "status indicating that the registration is for an entity that has been merged into another legal entity, such that this legal entity no longer exists as an independently operating entity"})

(def NorthAmericanIndustryClassificationSystemCode
  "the North American Industry Classification System (NAICS) code representing an industry"
  {:db/ident :fibo-fbc-fct-breg/NorthAmericanIndustryClassificationSystemCode,
   :fibo-fnd-utl-av/abbreviation "NAICS code",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "North American Industry Classification System code",
   :rdfs/subClassOf
   [{:owl/onClass
     :fibo-fbc-fct-breg/NorthAmericanIndustryClassificationSystemScheme,
     :owl/onProperty :fibo-fnd-rel-rel/isDefinedIn,
     :owl/qualifiedCardinality 1,
     :rdf/type :owl/Restriction}
    :lcc-lr/CodeElement
    {:owl/onDataRange :xsd/string,
     :owl/onProperty  :lcc-lr/hasTag,
     :owl/qualifiedCardinality 1,
     :rdf/type        :owl/Restriction}
    :fibo-fnd-arr-cls/IndustrySectorClassifier
    {:owl/onProperty     :lcc-cr/classifies,
     :owl/someValuesFrom :fibo-fnd-org-fm/FormalOrganization,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   "the North American Industry Classification System (NAICS) code representing an industry"})

(def NorthAmericanIndustryClassificationSystemScheme
  "the scheme defining the North American Industry Classification System (NAICS) Codes"
  {:db/ident :fibo-fbc-fct-breg/NorthAmericanIndustryClassificationSystemScheme,
   :fibo-fnd-utl-av/explanatoryNote
   "The North American Industry Classification System (NAICS) is the standard used by Federal statistical agencies in classifying business establishments for the purpose of collecting, analyzing, and publishing statistical data related to the U.S. business economy.\n\nNAICS was developed under the auspices of the Office of Management and Budget (OMB), and adopted in 1997 to replace the Standard Industrial Classification (SIC) system. It was developed jointly by the U.S. Economic Classification Policy Committee (ECPC), Statistics Canada and Mexico's Instituto Nacional Estadistica y Geografia, to allow for a high level of comparability in business statistics among the North American countries.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "North American Industry Classification System scheme",
   :rdfs/seeAlso ["https://www.census.gov/naics/"],
   :rdfs/subClassOf
   [{:owl/onProperty :fibo-fnd-rel-rel/defines,
     :owl/someValuesFrom
     :fibo-fbc-fct-breg/NorthAmericanIndustryClassificationSystemCode,
     :rdf/type :owl/Restriction}
    :lcc-lr/CodeSet
    :fibo-fnd-arr-cls/IndustrySectorClassificationScheme],
   :skos/definition
   "the scheme defining the North American Industry Classification System (NAICS) Codes"})

(def PendingArchivalStatus
  "status indicating that the registration is about to be transferred to a different registration authority, after which its registration status will revert to a non-pending status"
  {:db/ident :fibo-fbc-fct-breg/PendingArchivalStatus,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :lcc-lr/hasTag "PENDING_ARCHIVAL",
   :rdf/type [:fibo-fbc-fct-breg/RegistrationStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "pending archival status",
   :skos/definition
   "status indicating that the registration is about to be transferred to a different registration authority, after which its registration status will revert to a non-pending status"})

(def PendingTransferStatus
  "status indicating that the registration has requested transfer to a different registration authority, and for which transfer is in progress"
  {:db/ident :fibo-fbc-fct-breg/PendingTransferStatus,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :lcc-lr/hasTag "PENDING_TRANSFER",
   :rdf/type [:fibo-fbc-fct-breg/RegistrationStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "pending transfer status",
   :skos/definition
   "status indicating that the registration has requested transfer to a different registration authority, and for which transfer is in progress"})

(def PendingValidationStatus
  "status indicating that an application for registration has been submitted and is in process, pending validation"
  {:db/ident :fibo-fbc-fct-breg/PendingValidationStatus,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :lcc-lr/hasTag "PENDING_VALIDATION",
   :rdf/type [:fibo-fbc-fct-breg/RegistrationStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "pending validation status",
   :skos/definition
   "status indicating that an application for registration has been submitted and is in process, pending validation"})

(def RegistrationAuthorityCode
  "identifier that uniquely identifies a business registry, and is associated with a registration authority and jurisdiction, issued by the Global Legal Entity Identifier Foundation (GLEIF)"
  {:db/ident :fibo-fbc-fct-breg/RegistrationAuthorityCode,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/gleif-registration-authorities-list",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "registration authority code",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fbc-fct-breg/BusinessRegistry,
                      :owl/onProperty :lcc-lr/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :lcc-lr/CodeElement
                     :fibo-fbc-fct-ra/RegistryIdentifier],
   :skos/definition
   "identifier that uniquely identifies a business registry, and is associated with a registration authority and jurisdiction, issued by the Global Legal Entity Identifier Foundation (GLEIF)"})

(def RegistrationStatus
  "lifecycle stage indicating the status of a given registration of something, such as a business or legal entity, as specified by the registration authority"
  {:db/ident :fibo-fbc-fct-breg/RegistrationStatus,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :fibo-fnd-utl-av/explanatoryNote
   "There may be other possible values for registration status, depending on the registry, thus the individuals provided herein are not intended to be exhaustive.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "registration status",
   :rdfs/subClassOf :fibo-fnd-arr-lif/LifecycleStage,
   :skos/definition
   "lifecycle stage indicating the status of a given registration of something, such as a business or legal entity, as specified by the registration authority"})

(def RetiredStatus
  "status indicating that the registration is for an entity that has ceased operation, without having been merged into another entity"
  {:db/ident :fibo-fbc-fct-breg/RetiredStatus,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :lcc-lr/hasTag "RETIRED",
   :rdf/type [:fibo-fbc-fct-breg/RegistrationStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "retired status",
   :skos/definition
   "status indicating that the registration is for an entity that has ceased operation, without having been merged into another entity"})

(def StandardIndustrialClassificationCode
  "the SIC code representing an industry"
  {:db/ident :fibo-fbc-fct-breg/StandardIndustrialClassificationCode,
   :fibo-fnd-utl-av/abbreviation "SIC code",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "standard industrial classification code",
   :rdfs/subClassOf [:fibo-fnd-arr-cls/IndustrySectorClassifier
                     {:owl/onProperty     :lcc-cr/classifies,
                      :owl/someValuesFrom :fibo-fnd-org-fm/FormalOrganization,
                      :rdf/type           :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :lcc-lr/hasTag,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     :lcc-lr/CodeElement
                     {:owl/onClass
                      :fibo-fbc-fct-breg/StandardIndustrialClassificationScheme,
                      :owl/onProperty :fibo-fnd-rel-rel/isDefinedIn,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}],
   :skos/definition "the SIC code representing an industry"})

(def StandardIndustrialClassificationScheme
  "the scheme defining the Standard Industrial Classification (SIC) Code List"
  {:db/ident :fibo-fbc-fct-breg/StandardIndustrialClassificationScheme,
   :fibo-fnd-utl-av/explanatoryNote
   "Standard Industrial Classifications are four-digit codes that categorize companies by the type of business activities they engage in. These codes were created by the U.S. government in 1937 to facilitate analysis of economic activity across government agencies and within industries. They were mostly replaced in 1997 by a new system of six-digit codes called the North American Industry Classification System (NAICS). The new codes were adopted in part to standardize industry data collection and analysis in between Canada, the United States and Mexico which had entered into the North American Free Trade Agreement. Note that certain organizations, such as the Securities and Exchange Commission (SEC) still use SIC codes for some purposes.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "standard industrial classification scheme",
   :rdfs/seeAlso ["https://www.osha.gov/pls/imis/sic_manual.html/"],
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/defines,
                      :owl/someValuesFrom
                      :fibo-fbc-fct-breg/StandardIndustrialClassificationCode,
                      :rdf/type :owl/Restriction}
                     :lcc-lr/CodeSet
                     :fibo-fnd-arr-cls/IndustrySectorClassificationScheme],
   :skos/definition
   "the scheme defining the Standard Industrial Classification (SIC) Code List"})

(def TransferredStatus
  "status indicating that the registration that has been transferred to a different registration authority"
  {:db/ident :fibo-fbc-fct-breg/TransferredStatus,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :lcc-lr/hasTag "TRANSFERRED",
   :rdf/type [:fibo-fbc-fct-breg/RegistrationStatus :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "transferred status",
   :skos/definition
   "status indicating that the registration that has been transferred to a different registration authority"})

(def hasAlternativeLanguageLegalName
  "denotes a registered legal name for the entity in an alternative language used in the legal jurisdiction in which the entity is registered"
  {:db/ident :fibo-fbc-fct-breg/hasAlternativeLanguageLegalName,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "has alternative language legal name",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/hasLegalName,
   :skos/definition
   "denotes a registered legal name for the entity in an alternative language used in the legal jurisdiction in which the entity is registered"})

(def hasAutomaticallyTransliteratedLegalName
  "denotes an auto-generated ASCII-transliterated representation of the legal name for the entity"
  {:db/ident :fibo-fbc-fct-breg/hasAutomaticallyTransliteratedLegalName,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "has automatically transliterated legal name",
   :rdfs/subPropertyOf :fibo-fbc-fct-breg/hasTransliteratedLegalName,
   :skos/definition
   "denotes an auto-generated ASCII-transliterated representation of the legal name for the entity"})

(def hasEntityExpirationDate
  "indicates the date on which an entity ceases(d) to exist"
  {:db/ident :fibo-fbc-fct-breg/hasEntityExpirationDate,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "has entity expiration date",
   :rdfs/range :fibo-fnd-dt-fd/CombinedDateTime,
   :rdfs/subPropertyOf :fibo-fbc-fct-breg/hasExpiryDate,
   :skos/definition "indicates the date on which an entity ceases(d) to exist"})

(def hasEntityExpirationReason
  "indicates the reason that an entity ceased to exist (i.e., disolved, merged with another entity, etc.)"
  {:db/ident :fibo-fbc-fct-breg/hasEntityExpirationReason,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "has entity expiration reason",
   :rdfs/range :fibo-fbc-fct-breg/EntityExpirationReason,
   :rdfs/subPropertyOf :lcc-lr/hasDenotation,
   :skos/definition
   "indicates the reason that an entity ceased to exist (i.e., disolved, merged with another entity, etc.)"})

(def hasEntityStatus
  "indicates the status of the entity (i.e., active, inactive)"
  {:db/ident :fibo-fbc-fct-breg/hasEntityStatus,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "has entity status",
   :rdfs/range :fibo-fbc-fct-breg/EntityStatus,
   :rdfs/subPropertyOf :fibo-fnd-arr-lif/hasStage,
   :skos/definition
   "indicates the status of the entity (i.e., active, inactive)"})

(def hasExpiryDate
  "indicates the date on which something ceases(d) to exist"
  {:db/ident :fibo-fbc-fct-breg/hasExpiryDate,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "has expiry date",
   :rdfs/range :fibo-fnd-dt-fd/CombinedDateTime,
   :skos/definition "indicates the date on which something ceases(d) to exist"})

(def hasInitialRegistrationDate
  "indicates the date on which an identifier or other registered item was created and/or first registered"
  {:db/ident :fibo-fbc-fct-breg/hasInitialRegistrationDate,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "has initial registration date",
   :rdfs/range :fibo-fnd-dt-fd/CombinedDateTime,
   :rdfs/subPropertyOf :fibo-fbc-fct-ra/hasRegistrationDate,
   :skos/definition
   "indicates the date on which an identifier or other registered item was created and/or first registered"})

(def hasPreferredTransliteratedLegalName
  "denotes a preferred ASCII-transliterated representation of the legal name for the entity"
  {:db/ident :fibo-fbc-fct-breg/hasPreferredTransliteratedLegalName,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "has preferred transliterated legal name",
   :rdfs/subPropertyOf :fibo-fbc-fct-breg/hasTransliteratedLegalName,
   :skos/definition
   "denotes a preferred ASCII-transliterated representation of the legal name for the entity"})

(def hasPriorLegalName
  "denotes a primary legal name that was used previously for the entity"
  {:db/ident :fibo-fbc-fct-breg/hasPriorLegalName,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "has prior legal name",
   :rdfs/subPropertyOf [:fibo-fnd-rel-rel/wasFormerlyKnownAs
                        :fibo-fnd-rel-rel/hasLegalName],
   :skos/definition
   "denotes a primary legal name that was used previously for the entity"})

(def hasRegistrationRevisionDate
  "indicates the date that the status of a specific registration in the registry was revised"
  {:db/ident :fibo-fbc-fct-breg/hasRegistrationRevisionDate,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "has registration status revision date",
   :rdfs/range :fibo-fnd-dt-fd/CombinedDateTime,
   :rdfs/subPropertyOf :fibo-fbc-fct-ra/hasRegistrationDate,
   :skos/definition
   "indicates the date that the status of a specific registration in the registry was revised"})

(def hasRegistrationStatus
  "indicates the status of a specific registration, such as for an identifier or license"
  {:db/ident :fibo-fbc-fct-breg/hasRegistrationStatus,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
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
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"})

(def hasRegistryName
  "denotes a name for the registry, for example, for a business registry in which a business registration identifier for the legal entity is registered"
  {:db/ident :fibo-fbc-fct-breg/hasRegistryName,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-fct-ra/Registry,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "has registry name",
   :rdfs/subPropertyOf :lcc-lr/hasName,
   :skos/definition
   "denotes a name for the registry, for example, for a business registry in which a business registration identifier for the legal entity is registered"})

(def hasRenewalDate
  "indicates the date by which a specific registration in the registry must be renewed or updated"
  {:db/ident :fibo-fbc-fct-breg/hasRenewalDate,
   :fibo-fnd-utl-av/adaptedFrom
   ["https://www.swift.com/standards/data-standards/bic?tl=en#BICPolicyandDatarecord"
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"],
   :fibo-fnd-utl-av/usageNote
   "This property is equivalent to the date of expiry in some registries, such as the BIC registry.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "has renewal date",
   :rdfs/range :fibo-fnd-dt-fd/CombinedDateTime,
   :rdfs/subPropertyOf :fibo-fbc-fct-ra/hasRegistrationDate,
   :skos/definition
   "indicates the date by which a specific registration in the registry must be renewed or updated"})

(def hasTradingOrOperationalName
  "denotes a 'trading as', 'brand name', 'doing business as', or 'operating under' name currently used by the entity in addition to, but not replacing, the (primary) legal, official registered name"
  {:db/ident :fibo-fbc-fct-breg/hasTradingOrOperationalName,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "has trading or operational name",
   :rdfs/subPropertyOf :lcc-lr/hasName,
   :skos/definition
   "denotes a 'trading as', 'brand name', 'doing business as', or 'operating under' name currently used by the entity in addition to, but not replacing, the (primary) legal, official registered name"})

(def hasTransliteratedLegalName
  "denotes an optional ASCII-transliterated (i.e. Latin- or Romanized) representation of the legal name for the entity"
  {:db/ident :fibo-fbc-fct-breg/hasTransliteratedLegalName,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "has transliterated legal name",
   :rdfs/subPropertyOf [:fibo-fnd-rel-rel/hasLegalName
                        :fibo-be-le-lei/hasTransliteratedName],
   :skos/definition
   "denotes an optional ASCII-transliterated (i.e. Latin- or Romanized) representation of the legal name for the entity"})

(def hasValidationAuthority
  "identifies the business registration authority for the legal entity, used by the Local Operating Unit (LOU) as the basis for validation, as defined in the GLEIF Registration Authorities List"
  {:db/ident :fibo-fbc-fct-breg/hasValidationAuthority,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "has validation authority",
   :rdfs/range :fibo-fbc-fct-breg/BusinessRegistrationAuthority,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition
   "identifies the business registration authority for the legal entity, used by the Local Operating Unit (LOU) as the basis for validation, as defined in the GLEIF Registration Authorities List"})

(def hasValidationDate
  "indicates the date that a specific registration in the registry was most recently reviewed and validated"
  {:db/ident :fibo-fbc-fct-breg/hasValidationDate,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.swift.com/standards/data-standards/bic?tl=en#BICPolicyandDatarecord",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "has validation date",
   :rdfs/range :fibo-fnd-dt-fd/CombinedDateTime,
   :rdfs/subPropertyOf :fibo-fbc-fct-ra/hasRegistrationDate,
   :skos/definition
   "indicates the date that a specific registration in the registry was most recently reviewed and validated"})

(def hasValidationLevel
  "indicates the level of validation performed by the registrar with respect to the legal entity"
  {:db/ident :fibo-fbc-fct-breg/hasValidationLevel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "has validation level",
   :rdfs/range :fibo-fbc-fct-breg/EntityValidationLevel,
   :skos/definition
   "indicates the level of validation performed by the registrar with respect to the legal entity"})

(def isSelfMaintained
  "indicates whether the information about the entity is maintained internally or by a third-party"
  {:db/ident :fibo-fbc-fct-breg/isSelfMaintained,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.swift.com/standards/data-standards/bic?tl=en#BICPolicyandDatarecord",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfs/label "is self-maintained",
   :rdfs/range :xsd/string,
   :skos/definition
   "indicates whether the information about the entity is maintained internally or by a third-party"})