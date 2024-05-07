(ns net.wikipunk.rdf.fibo-fnd-pty-pty
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Parties/Parties/",
   :dcterms/abstract
   "This ontology defines high-level party roles, over and above those provided in the OMG Commons Ontology Library. It describes entities in terms of one or more roles it performs in situations and other relationships such as in some formal contractual or transactional relationship.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
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
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/Addresses/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Parties/Parties/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-pty-pty",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "Parties Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was revised to make hasRelatedPartyInRole symmetric and move hasMailingAddress from people to this ontology."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was extended to add the concepts of tax identifier and tax identification scheme."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was revised to add semantics to the definition of independent party, making it a direct subclass of autonomous agent (rather than inferred only) and making person and organization direct subclasses (rather than inferred only)."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20160201/Parties/Parties.rdf version of this ontology was revised as a part of the FIBO 2.0 RFC to introduce disjointness axioms to aid users in understanding."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of the ontology was modified extensively to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was revised to add a relationship directly between parties and a party identifier and rename (migrate) the hasDefinition property to isDefinedIn to clarify intent."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was revised to address hygiene issues with respect to text formatting."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was extended to rename 'hasPrimaryParty' to 'hasActiveParty' to be more consistent."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was revised to add the two remaining property chains to complete the lattice, from independent party to thing via the situation, to simplify the class hierarchy for improved understanding, data mapping and alignment, and to add the notion of a contextual name (i.e., a name for someone, some place or something that applies for some period of time in some context)."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20141101/Parties/Parties.rdf version of this ontology was revised as a part of the issue resolutions identified in the FIBO FND 1.1 RTF report to add a parent of hasDate to date properties."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was extended to align the properties holds and isHeldBy with the lattice to improve ownership-related reasoning."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was extended to support more complex situations involving parties in various roles, loosen the restriction on party in role with respect to commencement date, and to eliminate the redundant union in the definition of independent party."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of the ontology was modified to eliminate deprecations that are more than 6 months old."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20130801/Parties/Parties.rdf version of the ontology was was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was revised to eliminate duplication with the concepts in LCC."
     "The http://www.omg.org/spec/FIBO/Foundations/20130601/Roles/Parties.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t(1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations.\n\t(6) to combine Parties, Party Roles, and Roles in a single, new, Parties module, combine Parties and Party Roles into a single ontology, and add an inverse for the hasParty property."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"})

(def Actor
  {:db/ident :fibo-fnd-pty-pty/Actor,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-pts/Actor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def IndependentParty
  {:db/ident :fibo-fnd-pty-pty/IndependentParty,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-pts/Party,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def PartyInRole
  {:db/ident :fibo-fnd-pty-pty/PartyInRole,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-pts/PartyRole,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def PartyInRoleIdentificationScheme
  {:db/ident :fibo-fnd-pty-pty/PartyInRoleIdentificationScheme,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-fnd-pty-pty/PartyRoleIdentificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def PartyInRoleIdentifier
  {:db/ident :fibo-fnd-pty-pty/PartyInRoleIdentifier,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-fnd-pty-pty/PartyRoleIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def PartyRoleIdentificationScheme
  {:db/ident :fibo-fnd-pty-pty/PartyRoleIdentificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"},
   :rdfs/label "party role identification scheme",
   :rdfs/subClassOf #{:cmns-id/IdentificationScheme
                      {:owl/onProperty :cmns-col/hasMember,
                       :owl/someValuesFrom
                       :fibo-fnd-pty-pty/PartyRoleIdentifier,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "system for allocating identifiers to roles that parties play"})

(def PartyRoleIdentifier
  {:db/ident :fibo-fnd-pty-pty/PartyRoleIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"},
   :rdfs/label "party role identifier",
   :rdfs/subClassOf
   #{:cmns-id/Identifier
     {:owl/onClass    :cmns-pts/PartyRole,
      :owl/onProperty :cmns-id/identifies,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/onClass    :fibo-fnd-pty-pty/PartyRoleIdentificationScheme,
      :owl/onProperty :cmns-col/isMemberOf,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/onClass    :fibo-fnd-pty-pty/PartyRoleIdentificationScheme,
      :owl/onProperty :cmns-dsg/isDefinedIn,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "sequence of characters, capable of uniquely identifying a party based on a specific role that they play in some context"})

(def Situation
  {:db/ident :fibo-fnd-pty-pty/Situation,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-pts/Situation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def TaxIdentificationScheme
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.oecd-ilibrary.org/taxation/standard-for-automatic-exchange-of-financial-account-information-in-tax-matters-second-edition_9789264267992-en"},
   :db/ident :fibo-fnd-pty-pty/TaxIdentificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"},
   :rdfs/label "tax identification scheme",
   :rdfs/subClassOf :cmns-id/IdentificationScheme,
   :skos/definition
   "identification scheme used to identify taxpayers in some jurisdiction"})

(def TaxIdentifier
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.oecd-ilibrary.org/taxation/standard-for-automatic-exchange-of-financial-account-information-in-tax-matters-second-edition_9789264267992-en"},
   :cmns-av/explanatoryNote
   "Tax identifiers are used for various tax-related purposes in the United States and in other countries under the Common Reporting Standard (CRS).",
   :db/ident :fibo-fnd-pty-pty/TaxIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"},
   :rdfs/label "tax identifier",
   :rdfs/subClassOf #{{:owl/onClass :fibo-fnd-pty-pty/TaxIdentificationScheme,
                       :owl/onProperty :cmns-col/isMemberOf,
                       :owl/qualifiedCardinality 1,
                       :rdf/type :owl/Restriction} :cmns-id/Identifier
                      {:owl/onClass    :cmns-pts/Party,
                       :owl/onProperty :cmns-id/identifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "identifier assigned to a taxpayer that enables compulsory financial charges and other levies to be imposed on the taxpayer by a governmental organization in order to fund government spending and various public expenditures"})

(def Undergoer
  {:db/ident :fibo-fnd-pty-pty/Undergoer,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-pts/Undergoer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def actsIn
  {:db/ident :fibo-fnd-pty-pty/actsIn,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-pts/actsIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def actsOn
  {:db/ident :fibo-fnd-pty-pty/actsOn,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-pts/actsOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def directlyAffects
  {:db/ident :fibo-fnd-pty-pty/directlyAffects,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-pts/directlyAffects,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def experiences
  {:db/ident :fibo-fnd-pty-pty/experiences,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-pts/experiences,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def experiencesDirectly
  {:db/ident :fibo-fnd-pty-pty/experiencesDirectly,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-pts/experiencesDirectly,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def experiencesWith
  {:db/ident :fibo-fnd-pty-pty/experiencesWith,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-pts/experiencesWith,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def hasActiveParty
  {:db/ident :fibo-fnd-pty-pty/hasActiveParty,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-pts/hasActiveParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def hasActor
  {:db/ident :fibo-fnd-pty-pty/hasActor,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-pts/hasActor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def hasCommencementDate
  {:db/ident :fibo-fnd-pty-pty/hasCommencementDate,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-dt/hasStartDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def hasMailingAddress
  {:db/ident :fibo-fnd-pty-pty/hasMailingAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-pts/Party,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"},
   :rdfs/label "has mailing address",
   :rdfs/range :fibo-fnd-plc-adr/PhysicalAddress,
   :rdfs/subPropertyOf :fibo-fnd-plc-adr/hasAddress,
   :skos/definition
   "identifies a physical address where an independent party can receive communications, including letters and packages"})

(def hasParty
  {:db/ident :fibo-fnd-pty-pty/hasParty,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-pts/hasParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def hasPartyInRole
  {:db/ident :fibo-fnd-pty-pty/hasPartyInRole,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-pts/hasPartyRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def hasRelatedPartyInRole
  {:db/ident :fibo-fnd-pty-pty/hasRelatedPartyInRole,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-pts/hasRelatedPartyRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def hasThingInRole
  {:db/ident :fibo-fnd-pty-pty/hasThingInRole,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-rlcmp/hasRole
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def hasUndergoer
  {:db/ident :fibo-fnd-pty-pty/hasUndergoer,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-pts/hasUndergoer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def isAPartyTo
  {:db/ident :fibo-fnd-pty-pty/isAPartyTo,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-pts/isAPartyTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def isAffectedBy
  {:db/ident :fibo-fnd-pty-pty/isAffectedBy,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-pts/isAffectedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def isDirectlyAffectedBy
  {:db/ident :fibo-fnd-pty-pty/isDirectlyAffectedBy,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-pts/isDirectlyAffectedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def isExperiencedBy
  {:db/ident :fibo-fnd-pty-pty/isExperiencedBy,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-pts/isExperiencedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def playsActiveRoleIn
  {:db/ident :fibo-fnd-pty-pty/playsActiveRoleIn,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-pts/playsActiveRoleIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def playsActiveRoleThatAffects
  {:db/ident :fibo-fnd-pty-pty/playsActiveRoleThatAffects,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-pts/playsActiveRoleThatAffects,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def playsActiveRoleThatDirectlyAffects
  {:db/ident :fibo-fnd-pty-pty/playsActiveRoleThatDirectlyAffects,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-pts/playsActiveRoleThatDirectlyAffects,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def undergoes
  {:db/ident :fibo-fnd-pty-pty/undergoes,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-pts/undergoes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}})

(def urn:uuid:1f9594ba-0a2e-5987-8fb0-56fcbdeb2bd0
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines high-level party roles, over and above those provided in the OMG Commons Ontology Library. It describes entities in terms of one or more roles it performs in situations and other relationships such as in some formal contractual or transactional relationship.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/Addresses/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Parties/Parties/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Parties Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was revised to make hasRelatedPartyInRole symmetric and move hasMailingAddress from people to this ontology."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was extended to add the concepts of tax identifier and tax identification scheme."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was revised to add semantics to the definition of independent party, making it a direct subclass of autonomous agent (rather than inferred only) and making person and organization direct subclasses (rather than inferred only)."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20160201/Parties/Parties.rdf version of this ontology was revised as a part of the FIBO 2.0 RFC to introduce disjointness axioms to aid users in understanding."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of the ontology was modified extensively to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was revised to add a relationship directly between parties and a party identifier and rename (migrate) the hasDefinition property to isDefinedIn to clarify intent."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was revised to address hygiene issues with respect to text formatting."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was extended to rename 'hasPrimaryParty' to 'hasActiveParty' to be more consistent."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was revised to add the two remaining property chains to complete the lattice, from independent party to thing via the situation, to simplify the class hierarchy for improved understanding, data mapping and alignment, and to add the notion of a contextual name (i.e., a name for someone, some place or something that applies for some period of time in some context)."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20141101/Parties/Parties.rdf version of this ontology was revised as a part of the issue resolutions identified in the FIBO FND 1.1 RTF report to add a parent of hasDate to date properties."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was extended to align the properties holds and isHeldBy with the lattice to improve ownership-related reasoning."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was extended to support more complex situations involving parties in various roles, loosen the restriction on party in role with respect to commencement date, and to eliminate the redundant union in the definition of independent party."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of the ontology was modified to eliminate deprecations that are more than 6 months old."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20130801/Parties/Parties.rdf version of the ontology was was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was revised to eliminate duplication with the concepts in LCC."
     "The http://www.omg.org/spec/FIBO/Foundations/20130601/Roles/Parties.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t(1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations.\n\t(6) to combine Parties, Party Roles, and Roles in a single, new, Parties module, combine Parties and Party Roles into a single ontology, and add an inverse for the hasParty property."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"})
