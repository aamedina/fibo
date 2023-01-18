(ns net.wikipunk.rdf.fibo-fnd-pty-pty
  "This ontology defines the high-level concepts for party roles. The concept of a party in a role describes some entity defined specifically in terms of one or more roles it performs in situations and other relationships such as some formal contractual or transactional relationship."
  {:cmns-av/copyright ["Copyright (c) 2013-2023 Object Management Group, Inc."
                       "Copyright (c) 2013-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :dcterms/abstract
   "This ontology defines the high-level concepts for party roles. The concept of a party in a role describes some entity defined specifically in terms of one or more roles it performs in situations and other relationships such as some formal contractual or transactional relationship.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/IdentifiersAndIndices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/BusinessDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/AgentsAndPeople/Agents/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-aap-agt"
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/",
    "fibo-fnd-dt-bd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-plc-adr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/",
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
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfa/prefix "fibo-fnd-pty-pty",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "Parties Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was extended to support more complex situations involving parties in various roles, loosen the restriction on party in role with respect to commencement date, and to eliminate the redundant union in the definition of independent party."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was revised to add a relationship directly between parties and a party identifier and rename (migrate) the hasDefinition property to isDefinedIn to clarify intent."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was extended to align the properties holds and isHeldBy with the lattice to improve ownership-related reasoning."
    "The http://www.omg.org/spec/EDMC-FIBO/FND/20141101/Parties/Parties.rdf version of this ontology was revised as a part of the issue resolutions identified in the FIBO FND 1.1 RTF report to add a parent of hasDate to date properties."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was revised to add semantics to the definition of independent party, making it a direct subclass of autonomous agent (rather than inferred only) and making person and organization direct subclasses (rather than inferred only)."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was extended to rename 'hasPrimaryParty' to 'hasActiveParty' to be more consistent."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was revised to eliminate duplication with the concepts in LCC."
    "The http://www.omg.org/spec/EDMC-FIBO/FND/20160201/Parties/Parties.rdf version of this ontology was revised as a part of the FIBO 2.0 RFC to introduce disjointness axioms to aid users in understanding."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was revised to make hasRelatedPartyInRole symmetric and move hasMailingAddress from people to this ontology."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was extended to add the concepts of tax identifier and tax identification scheme."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was revised to add the two remaining property chains to complete the lattice, from independent party to thing via the situation, to simplify the class hierarchy for improved understanding, data mapping and alignment, and to add the notion of a contextual name (i.e., a name for someone, some place or something that applies for some period of time in some context)."
    "The http://www.omg.org/spec/FIBO/Foundations/20130601/Roles/Parties.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t(1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations.\n\t(6) to combine Parties, Party Roles, and Roles in a single, new, Parties module, combine Parties and Party Roles into a single ontology, and add an inverse for the hasParty property."
    "The http://www.omg.org/spec/EDMC-FIBO/FND/20130801/Parties/Parties.rdf version of the ontology was was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties.rdf version of this ontology was revised to address hygiene issues with respect to text formatting."]})

(def Actor
  "party that is the primary performer in a relationship between parties, i.e., the party that does something, causes something to happen, or otherwise plays an agentive role in the relationship"
  {:db/ident :fibo-fnd-pty-pty/Actor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "actor",
   :rdfs/subClassOf :fibo-fnd-pty-pty/PartyInRole,
   :skos/definition
   "party that is the primary performer in a relationship between parties, i.e., the party that does something, causes something to happen, or otherwise plays an agentive role in the relationship",
   :skos/example
   "Examples include owner, controlling party, beneficiary, guarantor, partner in a partnership, shareholder, etc."})

(def ContextualName
  "designation by which someone, some place, or something is known in some context"
  {:cmns-av/explanatoryNote
   "Names of people, places, and organizations often change over time, and may be used in a particular context, such as a DBA name for a business or legal name for a person.",
   :cmns-av/usageNote
   ["Names for people may be considered to be personally identifying information (PII), especially when other details are also available. Specifying names as string values attached directly to an individual makes name reconciliation and management, including from a privacy perspective, more challenging."
    "This class is designed to be extended to include provenance details regarding the source for a particular name as well as links to the various contexts in which it is used."],
   :db/ident :fibo-fnd-pty-pty/ContextualName,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "contextual name",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-pty-pty/IndependentParty,
                      :owl/onProperty :fibo-fnd-aap-agt/isStructuredNameOf,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-aap-agt/Name
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-dt-fd/DatePeriod,
                      :owl/onProperty :fibo-fnd-dt-bd/holdsDuring,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "designation by which someone, some place, or something is known in some context"})

(def IndependentParty
  "any person or organization"
  {:db/ident :fibo-fnd-pty-pty/IndependentParty,
   :owl/disjointWith :fibo-fnd-pty-rl/AgentInRole,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "independent party",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-plc-adr/PhysicalAddress,
                      :owl/onProperty :fibo-fnd-plc-adr/hasAddress,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-plc-adr/PhysicalAddress,
                      :owl/onProperty :fibo-fnd-pty-pty/hasMailingAddress,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-aap-agt/AutonomousAgent],
   :skos/definition "any person or organization"})

(def PartyInRole
  "relative concept that ties a person or organization to a specific role they stand in"
  {:cmns-av/adaptedFrom
   "OMG Property and Casualty Information Models, dtc/12-01-04, Annex A, Glossary of Data Model Terms and Definitions",
   :db/ident :fibo-fnd-pty-pty/PartyInRole,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "party in role",
   :rdfs/subClassOf [:fibo-fnd-pty-rl/AgentInRole
                     {:owl/onClass    :fibo-fnd-pty-pty/IndependentParty,
                      :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-dt-fd/Date,
                      :owl/onProperty :fibo-fnd-pty-pty/hasCommencementDate,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "relative concept that ties a person or organization to a specific role they stand in",
   :skos/example
   "Examples include organization member, issuer, owner, partner in a partnership, shareholder, etc.",
   :skos/scopeNote
   "The concept of a party in a role refers only to those contexts in which in natural English one would call someone a 'party' for example being party to a contract or to a transaction; it does not cover entities as performing some role in some activity or process (the separate concept Actor covers that). A good test is whether the relative thing defined as PartyInRole can be sensibly said to have a part or play a part in something. Corresponds to the English (not data modeling) sense of the word 'Party'."})

(def PartyInRoleIdentificationScheme
  "system for allocating identifiers to parties"
  {:db/ident :fibo-fnd-pty-pty/PartyInRoleIdentificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "party-in-role identification scheme",
   :rdfs/subClassOf [{:owl/onProperty :lcc-lr/hasMember,
                      :owl/someValuesFrom
                      :fibo-fnd-pty-pty/PartyInRoleIdentifier,
                      :rdf/type :owl/Restriction}
                     :lcc-lr/IdentificationScheme],
   :skos/definition "system for allocating identifiers to parties"})

(def PartyInRoleIdentifier
  "sequence of characters, capable of uniquely identifying a party based on a specific role that they play in some context"
  {:db/ident :fibo-fnd-pty-pty/PartyInRoleIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "party-in-role identifier",
   :rdfs/subClassOf
   [{:owl/onClass    :fibo-fnd-pty-pty/PartyInRoleIdentificationScheme,
     :owl/onProperty :lcc-lr/isMemberOf,
     :owl/qualifiedCardinality 1,
     :rdf/type       :owl/Restriction}
    {:owl/onClass    :fibo-fnd-pty-pty/PartyInRoleIdentificationScheme,
     :owl/onProperty :fibo-fnd-rel-rel/isDefinedIn,
     :owl/qualifiedCardinality 1,
     :rdf/type       :owl/Restriction}
    {:owl/onClass    :fibo-fnd-pty-pty/PartyInRole,
     :owl/onProperty :lcc-lr/identifies,
     :owl/qualifiedCardinality 1,
     :rdf/type       :owl/Restriction}
    :lcc-lr/Identifier],
   :skos/definition
   "sequence of characters, capable of uniquely identifying a party based on a specific role that they play in some context"})

(def Situation
  "setting, state of being, or relationship that that is relatively stable for some period of time"
  {:cmns-av/usageNote
   "From a usage perspective, situations are essentially reified relations at the top of the FIBO relationship lattice, also known as mediating relationships.",
   :db/ident :fibo-fnd-pty-pty/Situation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "situation",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-pty-pty/hasActor,
                      :owl/someValuesFrom :fibo-fnd-pty-pty/Actor,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-pty-pty/Undergoer,
                      :owl/onProperty :fibo-fnd-pty-pty/hasUndergoer,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-dt-fd/DatePeriod,
                      :owl/onProperty :fibo-fnd-dt-bd/holdsDuring,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "setting, state of being, or relationship that that is relatively stable for some period of time",
   :skos/example
   "Examples include ownership, control, possession, affiliation, beneficiary, and other similar relations."})

(def TaxIdentificationScheme
  "identification scheme used to identify taxpayers in some jurisdiction"
  {:cmns-av/adaptedFrom
   "https://www.oecd-ilibrary.org/taxation/standard-for-automatic-exchange-of-financial-account-information-in-tax-matters-second-edition_9789264267992-en",
   :db/ident :fibo-fnd-pty-pty/TaxIdentificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "tax identification scheme",
   :rdfs/subClassOf :lcc-lr/IdentificationScheme,
   :skos/definition
   "identification scheme used to identify taxpayers in some jurisdiction"})

(def TaxIdentifier
  "identifier assigned to a taxpayer that enables compulsory financial charges and other levies to be imposed on the taxpayer by a governmental organization in order to fund government spending and various public expenditures"
  {:cmns-av/adaptedFrom
   "https://www.oecd-ilibrary.org/taxation/standard-for-automatic-exchange-of-financial-account-information-in-tax-matters-second-edition_9789264267992-en",
   :cmns-av/explanatoryNote
   "Tax identifiers are used for various tax-related purposes in the United States and in other countries under the Common Reporting Standard (CRS).",
   :db/ident :fibo-fnd-pty-pty/TaxIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "tax identifier",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fnd-pty-pty/TaxIdentificationScheme,
                      :owl/onProperty :lcc-lr/isMemberOf,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-pty-pty/IndependentParty,
                      :owl/onProperty :lcc-lr/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :lcc-lr/Identifier],
   :skos/definition
   "identifier assigned to a taxpayer that enables compulsory financial charges and other levies to be imposed on the taxpayer by a governmental organization in order to fund government spending and various public expenditures"})

(def Undergoer
  "something that is the recipient in a relationship, i.e., the thing (or party) that something impacts, affects, or otherwise plays passive recipient / patient or theme role in the relationship"
  {:db/ident :fibo-fnd-pty-pty/Undergoer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "undergoer",
   :rdfs/subClassOf :fibo-fnd-pty-rl/ThingInRole,
   :skos/definition
   "something that is the recipient in a relationship, i.e., the thing (or party) that something impacts, affects, or otherwise plays passive recipient / patient or theme role in the relationship",
   :skos/example "Examples include something that is owned or controlled."})

(def actsIn
  "indicates a situation in which the actor plays a primary role"
  {:db/ident :fibo-fnd-pty-pty/actsIn,
   :owl/inverseOf :fibo-fnd-pty-pty/hasActor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-pty-pty/Actor,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "acts in",
   :rdfs/range :fibo-fnd-pty-pty/Situation,
   :skos/definition
   "indicates a situation in which the actor plays a primary role"})

(def actsOn
  "relates an actor in a given situation to the undergoer that they affect under the circumstances"
  {:db/ident :fibo-fnd-pty-pty/actsOn,
   :owl/propertyChainAxiom [:fibo-fnd-pty-pty/actsIn
                            :fibo-fnd-pty-pty/hasUndergoer],
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "acts on",
   :skos/definition
   "relates an actor in a given situation to the undergoer that they affect under the circumstances"})

(def directlyAffects
  "relates an actor in a given situation to the thing (or party) that they impact under the circumstances"
  {:db/ident :fibo-fnd-pty-pty/directlyAffects,
   :owl/inverseOf :fibo-fnd-pty-pty/experiencesWith,
   :owl/propertyChainAxiom [:fibo-fnd-pty-pty/actsIn
                            :fibo-fnd-pty-pty/hasUndergoer
                            :fibo-fnd-pty-rl/isPlayedBy],
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "directly affects",
   :skos/definition
   "relates an actor in a given situation to the thing (or party) that they impact under the circumstances"})

(def experiences
  "relates something to a situation that affects them in some way"
  {:db/ident :fibo-fnd-pty-pty/experiences,
   :owl/propertyChainAxiom [:fibo-fnd-pty-rl/playsRole
                            :fibo-fnd-pty-pty/undergoes],
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "experiences",
   :skos/definition
   "relates something to a situation that affects them in some way"})

(def experiencesDirectly
  "relates something directly to a party that drives a situation involving it"
  {:db/ident :fibo-fnd-pty-pty/experiencesDirectly,
   :owl/propertyChainAxiom [:fibo-fnd-pty-rl/playsRole
                            :fibo-fnd-pty-pty/undergoes
                            :fibo-fnd-pty-pty/hasActor
                            :fibo-fnd-pty-rl/isPlayedBy],
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "experiences directly",
   :skos/definition
   "relates something directly to a party that drives a situation involving it"})

(def experiencesWith
  "relates something to an actor that drives a situation involving it"
  {:db/ident :fibo-fnd-pty-pty/experiencesWith,
   :owl/propertyChainAxiom [:fibo-fnd-pty-rl/playsRole
                            :fibo-fnd-pty-pty/undergoes
                            :fibo-fnd-pty-pty/hasActor],
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "experiences with",
   :skos/definition
   "relates something to an actor that drives a situation involving it"})

(def hasActiveParty
  "relates a situation to the person or organization acting in a primary (agentive) role"
  {:db/ident :fibo-fnd-pty-pty/hasActiveParty,
   :owl/inverseOf :fibo-fnd-pty-pty/playsActiveRoleIn,
   :owl/propertyChainAxiom [:fibo-fnd-pty-pty/hasActor
                            :fibo-fnd-pty-rl/isPlayedBy],
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "has active party",
   :skos/definition
   "relates a situation to the person or organization acting in a primary (agentive) role"})

(def hasActor
  "identifies the primary party acting in a specific role with respect to a given situation"
  {:db/ident :fibo-fnd-pty-pty/hasActor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-pty-pty/Situation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "has actor",
   :rdfs/range :fibo-fnd-pty-pty/Actor,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/hasPartyInRole,
   :skos/definition
   "identifies the primary party acting in a specific role with respect to a given situation"})

(def hasCommencementDate
  "the date a party relationship comes into force"
  {:db/ident :fibo-fnd-pty-pty/hasCommencementDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-pty-pty/PartyInRole,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "has commencement date",
   :rdfs/range :fibo-fnd-dt-fd/Date,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasStartDate,
   :skos/definition "the date a party relationship comes into force"})

(def hasMailingAddress
  "identifies a physical address where an independent party can receive communications, including letters and packages"
  {:db/ident :fibo-fnd-pty-pty/hasMailingAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-pty-pty/IndependentParty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "has mailing address",
   :rdfs/range :fibo-fnd-plc-adr/PhysicalAddress,
   :rdfs/subPropertyOf :fibo-fnd-plc-adr/hasAddress,
   :skos/definition
   "identifies a physical address where an independent party can receive communications, including letters and packages"})

(def hasParty
  "identifies an independent party associated with an agreement, contract, policy, regulation, or other business arrangement"
  {:db/ident :fibo-fnd-pty-pty/hasParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "has party",
   :rdfs/range :fibo-fnd-pty-pty/IndependentParty,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition
   "identifies an independent party associated with an agreement, contract, policy, regulation, or other business arrangement"})

(def hasPartyInRole
  "identifies a party acting in a specific role as related to the particular agreement, contract, policy, regulation, or other business relationship"
  {:db/ident :fibo-fnd-pty-pty/hasPartyInRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "has party in role",
   :rdfs/range :fibo-fnd-pty-pty/PartyInRole,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition
   "identifies a party acting in a specific role as related to the particular agreement, contract, policy, regulation, or other business relationship"})

(def hasRelatedPartyInRole
  "relates a party acting in a specific role directly to another party acting in the same or another role"
  {:cmns-av/usageNote
   "This property is intended as an abstract property, whose subproperties may or may not be symmetric, but could be inverses of one another.",
   :db/ident :fibo-fnd-pty-pty/hasRelatedPartyInRole,
   :rdf/type [:owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/domain :fibo-fnd-pty-pty/PartyInRole,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "has related party-in-role",
   :rdfs/range :fibo-fnd-pty-pty/PartyInRole,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition
   "relates a party acting in a specific role directly to another party acting in the same or another role"})

(def hasThingInRole
  "identifies something acting in a recipient or target role as related to the particular agreement, contract, policy, regulation, situation, or other business relationship"
  {:db/ident :fibo-fnd-pty-pty/hasThingInRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "has thing in role",
   :rdfs/range :fibo-fnd-pty-rl/ThingInRole,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition
   "identifies something acting in a recipient or target role as related to the particular agreement, contract, policy, regulation, situation, or other business relationship"})

(def hasUndergoer
  "identifies the experiencer in a specific role with respect to a given situation"
  {:db/ident :fibo-fnd-pty-pty/hasUndergoer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-pty-pty/Situation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "has undergoer",
   :rdfs/range :fibo-fnd-pty-pty/Undergoer,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/hasThingInRole,
   :skos/definition
   "identifies the experiencer in a specific role with respect to a given situation"})

(def isAPartyTo
  "identifies an agreement, contract, policy, regulation, or other business transaction that an independent party is associated with"
  {:cmns-av/explanatoryNote
   "This property should be read referring to some context (known as a 'mediating thing' in the informative upper ontology).",
   :db/ident :fibo-fnd-pty-pty/isAPartyTo,
   :owl/inverseOf :fibo-fnd-pty-pty/hasParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-pty-pty/IndependentParty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "is a party to",
   :skos/definition
   "identifies an agreement, contract, policy, regulation, or other business transaction that an independent party is associated with"})

(def isAffectedBy
  "relates an undergoer in a given situation to the actor that has an impact on them under the circumstances"
  {:db/ident :fibo-fnd-pty-pty/isAffectedBy,
   :owl/propertyChainAxiom [:fibo-fnd-pty-pty/undergoes
                            :fibo-fnd-pty-pty/hasActor],
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "is affected by",
   :skos/definition
   "relates an undergoer in a given situation to the actor that has an impact on them under the circumstances"})

(def isDirectlyAffectedBy
  "relates an undergoer in a given situation to the person or organization that has an impact on them under the circumstances"
  {:db/ident :fibo-fnd-pty-pty/isDirectlyAffectedBy,
   :owl/propertyChainAxiom [:fibo-fnd-pty-pty/undergoes
                            :fibo-fnd-pty-pty/hasActor
                            :fibo-fnd-pty-rl/isPlayedBy],
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "is directly affected by",
   :skos/definition
   "relates an undergoer in a given situation to the person or organization that has an impact on them under the circumstances"})

(def isExperiencedBy
  "relates a situation to something that is directly involved in or affected by it"
  {:db/ident :fibo-fnd-pty-pty/isExperiencedBy,
   :owl/inverseOf :fibo-fnd-pty-pty/experiences,
   :owl/propertyChainAxiom [:fibo-fnd-pty-pty/hasUndergoer
                            :fibo-fnd-pty-rl/isPlayedBy],
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "is experienced by",
   :skos/definition
   "relates a situation to something that is directly involved in or affected by it"})

(def playsActiveRoleIn
  "relates a person or organization to a situation that they are directly involved in"
  {:db/ident :fibo-fnd-pty-pty/playsActiveRoleIn,
   :owl/propertyChainAxiom [:fibo-fnd-pty-rl/playsRole
                            :fibo-fnd-pty-pty/actsIn],
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "plays active role in",
   :skos/definition
   "relates a person or organization to a situation that they are directly involved in"})

(def playsActiveRoleThatAffects
  "relates a person or organization to an undergoer they have an impact on under the circumstances"
  {:db/ident :fibo-fnd-pty-pty/playsActiveRoleThatAffects,
   :owl/inverseOf :fibo-fnd-pty-pty/isDirectlyAffectedBy,
   :owl/propertyChainAxiom [:fibo-fnd-pty-rl/playsRole
                            :fibo-fnd-pty-pty/actsIn
                            :fibo-fnd-pty-pty/hasUndergoer],
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "plays active role that affects",
   :skos/definition
   "relates a person or organization to an undergoer they have an impact on under the circumstances"})

(def playsActiveRoleThatDirectlyAffects
  "relates a person or organization to something they have a direct impact on under the circumstances"
  {:db/ident :fibo-fnd-pty-pty/playsActiveRoleThatDirectlyAffects,
   :owl/inverseOf :fibo-fnd-pty-pty/experiencesDirectly,
   :owl/propertyChainAxiom [:fibo-fnd-pty-rl/playsRole
                            :fibo-fnd-pty-pty/actsIn
                            :fibo-fnd-pty-pty/hasUndergoer
                            :fibo-fnd-pty-rl/isPlayedBy],
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "plays active role that directly affects",
   :skos/definition
   "relates a person or organization to something they have a direct impact on under the circumstances"})

(def undergoes
  "indicates a situation that the undergoer experiences"
  {:db/ident :fibo-fnd-pty-pty/undergoes,
   :owl/inverseOf :fibo-fnd-pty-pty/hasUndergoer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-pty-pty/Undergoer,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfs/label "undergoes",
   :rdfs/range :fibo-fnd-pty-pty/Situation,
   :skos/definition "indicates a situation that the undergoer experiences"})