(ns net.wikipunk.rdf.fibo-fbc-fct-ra
  "This ontology defines concepts for representation of registration authorities, registrars, registration-specific identifiers and related identification schemes, and registration authorities specific to ISO and the financial industry. Examples of financial industry registration authorities in the US include the Federal Deposit Insurance Corporation (FDIC) and the Securities Exchange Commission (SEC)."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
   :dcterms/abstract
   "This ontology defines concepts for representation of registration authorities, registrars, registration-specific identifiers and related identification schemes, and registration authorities specific to ISO and the financial industry. Examples of financial industry registration authorities in the US include the Federal Deposit Insurance Corporation (FDIC) and the Securities Exchange Commission (SEC).",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/ProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/LegalCapacity/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Arrangements/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-fbc-fct-ra"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
    "fibo-fnd-arr-arr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
    "fibo-fnd-arr-doc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-law-lcap"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/",
    "fibo-fnd-pas-pas"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
   :rdfa/prefix "fibo-fbc-fct-ra",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
   :rdfs/label "Registration Authorities Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities.rdf version of this ontology was modified to address text formatting hygiene issues."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities.rdf version of this ontology was modified to clarify the definition of registry identifier, eliminate an unnecessary restriction on registry identifier, and refine the definition of registry entry and hasRegistrationDate based on usage."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities.rdf version of this ontology was modified per the FIBO 2.0 RFC."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities.rdf version of this ontology was modified to replace isAppointedBy with isDesignatedBy due to a property name change in Relations."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities.rdf version of this ontology was modified to eliminate duplication with concepts in LCC, make Registry a subclass of Record and StructuredCollection, make RegistryEntry a child of CollectionConstituent and correct a misspelled annotation."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities.rdf version of this ontology was modified as a part of organizational hierarchy simplification, to loosen the definition of registrar, and to leverage the composite date value datatype."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2015-2022 Object Management Group, Inc."
                  "Copyright (c) 2015-2022 EDM Council, Inc."],
   :sm/dependsOn ["https://www.omg.org/spec/LCC/"
                  "https://spec.edmcouncil.org/fibo/ontology/BE/"
                  "https://spec.edmcouncil.org/fibo/ontology/FND/"],
   :sm/fileAbbreviation "fibo-fbc-fct-ra",
   :sm/filename "RegistrationAuthorities.rdf"})

(def Registrar
  "party that has the capacity to act as a representative of a registration authority to provide registration services, including official record keeping"
  {:db/ident :fibo-fbc-fct-ra/Registrar,
   :fibo-fnd-utl-av/adaptedFrom
   "Barron's Dictionary of Business and Economic Terms, Fifth Edition, 2012",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
   :rdfs/label "registrar",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-pty-rl/isPlayedBy,
                      :owl/someValuesFrom
                      {:owl/intersectionOf
                       [{:owl/onProperty :fibo-fnd-law-lcap/hasCapacity,
                         :owl/someValuesFrom
                         :fibo-fbc-fct-ra/RegistrationCapacity,
                         :rdf/type :owl/Restriction}
                        {:owl/onProperty :fibo-fnd-rel-rel/isDesignatedBy,
                         :owl/someValuesFrom
                         {:owl/onProperty :fibo-fnd-pty-rl/playsRole,
                          :owl/someValuesFrom
                          :fibo-fbc-fct-ra/RegistrationAuthority,
                          :rdf/type :owl/Restriction},
                         :rdf/type :owl/Restriction}],
                       :rdf/type :owl/Class},
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-ra/registers,
                      :owl/someValuesFrom :owl/Thing,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition
   "party that has the capacity to act as a representative of a registration authority to provide registration services, including official record keeping"})

(def RegistrationAuthority
  "service provider that is responsible for maintaining a registry and provides registration services"
  {:db/ident :fibo-fbc-fct-ra/RegistrationAuthority,
   :fibo-fnd-utl-av/abbreviation "RA",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
   :rdfs/label "registration authority",
   :rdfs/subClassOf [:fibo-fnd-pas-pas/ServiceProvider
                     {:owl/minCardinality 0,
                      :owl/onProperty     :fibo-fbc-fct-ra/registers,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-fct-ra/Registry,
                      :owl/onProperty :fibo-fnd-rel-rel/manages,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-fct-ra/RegistrationService,
                      :owl/onProperty :fibo-fnd-rel-rel/provides,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-be-le-lp/LegalEntity,
                      :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty
                      :fibo-fbc-fct-ra/isRegistrationAuthorityFor,
                      :owl/someValuesFrom :owl/Thing,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   "service provider that is responsible for maintaining a registry and provides registration services"})

(def RegistrationCapacity
  "the capacity of some natural person to formally register information in a registry on behalf of some registration authority"
  {:db/ident :fibo-fbc-fct-ra/RegistrationCapacity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
   :rdfs/label "registration capacity",
   :rdfs/subClassOf :fibo-fnd-law-lcap/LegalCapacity,
   :skos/definition
   "the capacity of some natural person to formally register information in a registry on behalf of some registration authority"})

(def RegistrationScheme
  "scheme for organizing information and allocating identifiers to items in a registry"
  {:db/ident :fibo-fbc-fct-ra/RegistrationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
   :rdfs/label "registration scheme",
   :rdfs/subClassOf [{:owl/onProperty     :lcc-lr/hasMember,
                      :owl/someValuesFrom :fibo-fbc-fct-ra/RegistryIdentifier,
                      :rdf/type           :owl/Restriction}
                     :lcc-lr/IdentificationScheme],
   :skos/definition
   "scheme for organizing information and allocating identifiers to items in a registry"})

(def RegistrationService
  "service provided to individuals and/or organizations to register items in a registry"
  {:db/ident :fibo-fbc-fct-ra/RegistrationService,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
   :rdfs/label "registration service",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/isProvidedBy,
                      :owl/someValuesFrom
                      {:owl/unionOf [:fibo-fbc-fct-ra/RegistrationAuthority
                                     :fibo-fbc-fct-ra/Registrar],
                       :rdf/type    :owl/Class},
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-pas-pas/Service],
   :skos/definition
   "service provided to individuals and/or organizations to register items in a registry"})

(def Registry
  "authoritative record or collection of records relating to something"
  {:db/ident :fibo-fbc-fct-ra/Registry,
   :fibo-fnd-utl-av/explanatoryNote
   "Electronic registries typically contain a unique identifier for each entry, so that individual records can be referenced from other documents and registries.",
   :fibo-fnd-utl-av/synonym "register",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
   :rdfs/label "registry",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-fct-ra/hasRegistryEntry,
                      :owl/someValuesFrom :fibo-fbc-fct-ra/RegistryEntry,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-arr/StructuredCollection
                     {:owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
                      :owl/someValuesFrom
                      {:owl/unionOf [:fibo-fbc-fct-ra/RegistrationAuthority
                                     :fibo-fbc-fct-ra/Registrar],
                       :rdf/type    :owl/Class},
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-arr-doc/Record],
   :skos/definition
   "authoritative record or collection of records relating to something"})

(def RegistryEntry
  "independently identified entry for something recorded in a registry"
  {:db/ident :fibo-fbc-fct-ra/RegistryEntry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
   :rdfs/label "registry entry",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/comprises,
                      :owl/someValuesFrom :fibo-fbc-fct-ra/RegistryIdentifier,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :fibo-fbc-fct-ra/Registry,
                      :owl/onProperty    :fibo-fnd-arr-arr/isConstituentOf,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-dt-fd/DatedCollectionConstituent],
   :skos/definition
   "independently identified entry for something recorded in a registry"})

(def RegistryIdentifier
  "identifier associated with an entry in a registry, i.e., one that provides an index into the registry for the identified item"
  {:db/ident :fibo-fbc-fct-ra/RegistryIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
   :rdfs/label "registry identifier",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-fct-ra/isRegisteredIn,
                      :owl/someValuesFrom :fibo-fbc-fct-ra/Registry,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :fibo-fbc-fct-ra/RegistrationScheme,
                      :owl/onProperty :lcc-lr/isMemberOf,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :lcc-lr/Identifier],
   :skos/definition
   "identifier associated with an entry in a registry, i.e., one that provides an index into the registry for the identified item"})

(def hasRegistrationAuthority
  "indicates the registration authority for something"
  {:db/ident :fibo-fbc-fct-ra/hasRegistrationAuthority,
   :owl/inverseOf :fibo-fbc-fct-ra/isRegistrationAuthorityFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
   :rdfs/label "has registration authority",
   :rdfs/range :fibo-fbc-fct-ra/RegistrationAuthority,
   :skos/definition "indicates the registration authority for something"})

(def hasRegistrationDate
  "the date or date and time on which something is recorded"
  {:db/ident :fibo-fbc-fct-ra/hasRegistrationDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
   :rdfs/label "has registration date",
   :rdfs/range :fibo-fnd-dt-fd/CombinedDateTime,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasObservedDateTime,
   :skos/definition "the date or date and time on which something is recorded"})

(def hasRegistryEntry
  "links a registry to entries that it contains"
  {:db/ident :fibo-fbc-fct-ra/hasRegistryEntry,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fct-ra/Registry,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
   :rdfs/label "has registry entry",
   :rdfs/range :fibo-fbc-fct-ra/RegistryEntry,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/comprises,
   :skos/definition "links a registry to entries that it contains"})

(def isRegisteredBy
  "indicates the registration authority or registrar that registers something"
  {:db/ident :fibo-fbc-fct-ra/isRegisteredBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
   :rdfs/label "is registered by",
   :rdfs/range {:owl/unionOf [:fibo-fbc-fct-ra/RegistrationAuthority
                              :fibo-fbc-fct-ra/Registrar],
                :rdf/type    :owl/Class},
   :skos/definition
   "indicates the registration authority or registrar that registers something"})

(def isRegisteredIn
  "indicates the registry that something is registered in"
  {:db/ident :fibo-fbc-fct-ra/isRegisteredIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
   :rdfs/label "is registered in",
   :rdfs/range :fibo-fbc-fct-ra/Registry,
   :skos/definition "indicates the registry that something is registered in"})

(def isRegistrationAuthorityFor
  "indicates the thing (typically an identifier or code) that the registration authority has authority for"
  {:db/ident :fibo-fbc-fct-ra/isRegistrationAuthorityFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fct-ra/RegistrationAuthority,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
   :rdfs/label "is registration authority for",
   :skos/definition
   "indicates the thing (typically an identifier or code) that the registration authority has authority for"})

(def registers
  "records something in a registry or archive"
  {:db/ident :fibo-fbc-fct-ra/registers,
   :owl/inverseOf :fibo-fbc-fct-ra/isRegisteredBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:fibo-fbc-fct-ra/RegistrationAuthority
                               :fibo-fbc-fct-ra/Registrar],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
   :rdfs/label "registers",
   :skos/definition "records something in a registry or archive"})

(def specifies
  "states a fact about something"
  {:db/ident :fibo-fbc-fct-ra/specifies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
   :rdfs/label "specifies",
   :skos/definition "states a fact about something"})