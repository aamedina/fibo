(ns net.wikipunk.rdf.cmns-pts
  {:cmns-av/copyright #{"Copyright (c) 2020-2023 Thematix Partners LLC"
                        "Copyright (c) 2023 Object Management Group, Inc."
                        "Copyright (c) 2020-2023 EDM Council, Inc."
                        "Copyright (c) 2020-2023 Working Ontologist LLC"
                        "Copyright (c) 2022-2023 Pistoia Alliance, Inc."},
   :cmns-av/usageNote
   "Note that inference with respect to property chains, which this ontology makes extensive use of, requires a knowledge graph solution that understands these chains, or requires running a reasoner outside of the graph database and asserting the inferences in order to make use of them.",
   :dcterms/abstract
   "This ontology defines the high-level concepts of parties and the roles they play in various situations.",
   :dcterms/contributor #{"Elisa Kendall, Thematix Partners LLC"
                          "Dean Allemang, Working Ontologist"},
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :namespaces
   {"cmns-av"     "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col"    "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dsg"    "https://www.omg.org/spec/Commons/Designators/",
    "cmns-dt"     "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-pts"    "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-rlcmp"  "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms"     "http://purl.org/dc/terms/",
    "owl"         "http://www.w3.org/2002/07/owl#",
    "rdf"         "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"        "http://www.w3.org/2000/01/rdf-schema#",
    "skos"        "http://www.w3.org/2004/02/skos/core#",
    "xsd"         "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://www.omg.org/spec/Commons/20230801/PartiesAndSituations/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "cmns-pts",
   :rdfa/uri "https://www.omg.org/spec/Commons/PartiesAndSituations/",
   :rdfs/label "Commons Parties and Situations Ontology",
   :skos/note
   "This ontology was originally designed for use in the Financial Industry Business Ontology (FIBO) for representing complex relationships between parties, such as employment, ownership and control. It has since been extended based on usage in other projects, such as the Pistoia Alliance Identification of Medicinal Products (IDMP) ontology project.",
   :xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"})

(def Actor
  {:cmns-av/adaptedFrom
   #{{:rdf/value
      "ISO 14813-1:2015(en), Intelligent transport systems - Reference model architecture(s) for the ITS sector - Part 1: ITS service domains, service groups and services, clause 3.1"}
     {:rdf/value
      "ISO/TR 21965:2019(en), Information and documentation - Records management in enterprise architecture, clause 3.2.1"}
     {:rdf/value
      "ISO 23234:2021(en), Buildings and civil engineering works - Security - Planning of security measures in the built environment, clause 3.4"}},
   :cmns-av/explanatoryNote
   "The concept of actor here is in a more linguistic sense, from core semantic theories reflecting actor/undergoer/null roles of an argument in an expression.",
   :db/ident :cmns-pts/Actor,
   :rdf/type :owl/Class,
   :rdfs/label "actor",
   :rdfs/subClassOf :cmns-pts/PartyRole,
   :skos/definition
   "primary performer in a relationship between parties, i.e., the party that does something, causes something to happen, or otherwise plays an agentive role in the relationship",
   :skos/example
   "Examples include owner, controlling party, beneficiary, guarantor, partner in a partnership, shareholder, etc."})

(def Agent
  {:cmns-av/directSource
   {:xsd/anyURI "http://www.omg.org/techprocess/meetings/schedule/AMP.html"},
   :db/ident :cmns-pts/Agent,
   :owl/disjointWith :cmns-rlcmp/Role,
   :rdf/type :owl/Class,
   :rdfs/label "agent",
   :rdfs/seeAlso
   #{{:xsd/anyURI "http://www.jamesodell.com/WhatIsAnAgent.pdf"}
     {:xsd/anyURI "http://www.jamesodell.com/WhyShouldWeCareAboutAgents.pdf"}},
   :rdfs/subClassOf {:owl/minQualifiedCardinality 0,
                     :owl/onClass    :cmns-cxtdsg/ContextualName,
                     :owl/onProperty :cmns-dsg/hasName,
                     :rdf/type       :owl/Restriction},
   :skos/definition
   "something autonomous that can adapt to and interact with its environment",
   :skos/note
   #{"Agents can be human beings, organizations, software agents, robots and living things other than plants. They are defined as having the following three important properties: autonomy, interactive behavior, and adaptability. (1) Autonomy - an agent is capable of acting without direct external intervention. This includes software or other agents that have some degree of control over their internal state and can act based on their own experiences. They can also possess their own set of internal responsibilities and capabilities that enable them to act without any external choreography. This definition excludes agents that act on on behalf of (or as a proxy for) some person or thing (see AgentRole). (2) Interactive behavior - they are capable of exchanging communicating with other things in their environment. This includes, in the case of software agents, messages that can support requests for services and other kinds of resources, as well as event detection and notification. They can be synchronous or asynchronous in nature. The interaction can also be conversational in nature, such as negotiating contracts, marketplace-style bidding, or simply making a query. (3) Adaptability - an agent is capable of responding to other agents and/or its environment. Agents can react to communications and events and then respond appropriately. Software agents can be designed to make difficult decisions and even modify their behavior based on their experiences. In other words, they can learn and evolve."
     "Note that this does not necessarily imply that an agent is free to act as it sees fit, without constraint. Rather, an agent in the sense meant here is something which may or may not be subject to controls and constraints but is self-actualizing in its behavior in response to any such constraints."}})

(def AgentRole
  {:db/ident        :cmns-pts/AgentRole,
   :rdf/type        :owl/Class,
   :rdfs/label      "agent role",
   :rdfs/subClassOf #{:cmns-rlcmp/Role
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-pts/Agent,
                       :owl/onProperty :cmns-rlcmp/isPlayedBy,
                       :rdf/type       :owl/Restriction}},
   :skos/definition "role played by any agent"})

(def Party
  {:db/ident        :cmns-pts/Party,
   :rdf/type        :owl/Class,
   :rdfs/label      "party",
   :rdfs/subClassOf :cmns-pts/Agent,
   :skos/definition "person or organization"})

(def PartyRole
  {:cmns-av/adaptedFrom
   #{{:rdf/value
      "ISO 14813-1:2015(en), Intelligent transport systems - Reference model architecture(s) for the ITS sector - Part 1: ITS service domains, service groups and services, clause 3.1"}
     {:rdf/value
      "ISO 23234:2021(en), Buildings and civil engineering works - Security - Planning of security measures in the built environment, clause 3.4"}},
   :db/ident :cmns-pts/PartyRole,
   :rdf/type :owl/Class,
   :rdfs/label "party role",
   :rdfs/subClassOf #{:cmns-pts/AgentRole
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-pts/Party,
                       :owl/onProperty :cmns-rlcmp/isPlayedBy,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-dt/DatePeriod,
                       :owl/onProperty :cmns-cxtdsg/hasApplicablePeriod,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "role played by an organization or individual that may be time bound",
   :skos/example
   "Examples include organization member, employee, issuer, owner, partner in a partnership, shareholder, and so forth.",
   :skos/note
   "Note that there may be cases where the identity of the party playing the role is not known, as well as cases where in some situation, such as ownership, there may be more than one party playing the role of owner.",
   :skos/scopeNote
   "The concept of a party role is used in contexts in which one would call someone a 'party to something', such as party to a contract or to a transaction, a supplier, buyer, customer, student, employee, and so forth. More specific roles such as those that are performed in the context of some activity or process are actors in that situation."})

(def Situation
  {:db/ident :cmns-pts/Situation,
   :rdf/type :owl/Class,
   :rdfs/label "situation",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-rlcmp/Role,
                       :owl/onProperty :cmns-pts/hasObjectRole,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-dt/DatePeriod,
                       :owl/onProperty :cmns-pts/holdsDuring,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :cmns-pts/hasSubjectRole,
                       :owl/someValuesFrom :cmns-rlcmp/Role,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "setting, state of being, or relationship that is relatively stable for some period of time",
   :skos/example
   "Examples include ownership, control, possession, affiliation, beneficial ownership, employment, and other similar situations.",
   :skos/note
   "From a usage perspective, situations are essentially reified relations, sometimes called mediating relationships."})

(def SoftwareAgent
  {:db/ident :cmns-pts/SoftwareAgent,
   :dcterms/source
   {:rdf/value
    "ISO/IEC TR 29119-11:2020(en), Software and systems engineering - Software testing - Part 11: Guidelines on the testing of AI-based systems, clause 3.1.73"},
   :owl/disjointWith :cmns-pts/Party,
   :rdf/type :owl/Class,
   :rdfs/label "software agent",
   :rdfs/subClassOf :cmns-pts/Agent,
   :skos/definition
   "digital entity that perceives its environment and takes actions that maximize its chance of successfully achieving its goals"})

(def Undergoer
  {:db/ident :cmns-pts/Undergoer,
   :rdf/type :owl/Class,
   :rdfs/label "undergoer",
   :rdfs/subClassOf :cmns-rlcmp/Role,
   :skos/definition
   "something that plays the role of the object or recipient in a situation, i.e., the thing (or party) that the situation impacts, affects, or that otherwise plays a passive recipient / patient or thematic role",
   :skos/example "Examples include something that is owned or controlled."})

(def actsIn
  {:db/ident :cmns-pts/actsIn,
   :owl/inverseOf :cmns-pts/hasActor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-pts/Actor,
   :rdfs/label "acts in",
   :rdfs/range :cmns-pts/Situation,
   :rdfs/subPropertyOf :cmns-pts/isSubjectRoleIn,
   :skos/definition
   "indicates a situation in which the actor plays a primary role"})

(def actsOn
  {:db/ident :cmns-pts/actsOn,
   :owl/propertyChainAxiom [:cmns-pts/actsIn :cmns-pts/hasUndergoer],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "acts on",
   :skos/definition
   "relates an actor in a given situation to the undergoer that they affect under the circumstances"})

(def directlyAffects
  {:db/ident :cmns-pts/directlyAffects,
   :owl/inverseOf :cmns-pts/experiencesWith,
   :owl/propertyChainAxiom
   [:cmns-pts/actsIn :cmns-pts/hasUndergoer :cmns-rlcmp/isPlayedBy],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "directly affects",
   :skos/definition
   "relates an actor in a given situation to the thing (or party) that they impact under the circumstances"})

(def experiences
  {:db/ident :cmns-pts/experiences,
   :owl/propertyChainAxiom [:cmns-rlcmp/playsRole :cmns-pts/undergoes],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "experiences",
   :skos/definition
   "relates something to a situation that affects them in some way"})

(def experiencesDirectly
  {:db/ident :cmns-pts/experiencesDirectly,
   :owl/propertyChainAxiom [:cmns-rlcmp/playsRole
                            :cmns-pts/undergoes
                            :cmns-pts/hasActor
                            :cmns-rlcmp/isPlayedBy],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "experiences directly",
   :skos/definition
   "relates something directly to a party that drives a situation involving it"})

(def experiencesWith
  {:db/ident :cmns-pts/experiencesWith,
   :owl/propertyChainAxiom
   [:cmns-rlcmp/playsRole :cmns-pts/undergoes :cmns-pts/hasActor],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "experiences with",
   :skos/definition
   "relates something to an actor that drives a situation involving it"})

(def hasActiveParty
  {:db/ident :cmns-pts/hasActiveParty,
   :owl/inverseOf :cmns-pts/playsActivePartyIn,
   :owl/propertyChainAxiom [:cmns-pts/hasActor :cmns-rlcmp/isPlayedBy],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has active party",
   :skos/definition
   "relates a situation to the person or organization acting in a primary (agentive) role"})

(def hasActiveRole
  {:db/ident :cmns-pts/hasActiveRole,
   :owl/inverseOf :cmns-pts/playsActiveRoleIn,
   :owl/propertyChainAxiom [:cmns-pts/hasSubjectRole :cmns-rlcmp/isPlayedBy],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has active role",
   :skos/definition
   "relates a situation to something that is acting in a primary (agentive) role"})

(def hasActor
  {:db/ident :cmns-pts/hasActor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-pts/Situation,
   :rdfs/label "has actor",
   :rdfs/range :cmns-pts/Actor,
   :rdfs/subPropertyOf #{:cmns-pts/hasSubjectRole :cmns-pts/hasPartyRole},
   :skos/definition
   "identifies the primary party acting in a specific role with respect to a given situation"})

(def hasObjectRole
  {:db/ident :cmns-pts/hasObjectRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:cmns-rlcmp/Composition :cmns-pts/Situation],
                 :rdf/type    :owl/Class},
   :rdfs/label "has object role",
   :rdfs/range :cmns-rlcmp/Role,
   :rdfs/subPropertyOf :cmns-rlcmp/hasRole,
   :skos/definition
   "identifies a person or thing that is affected by, or is a secondary argument in a specific role with respect to a given relation or situation"})

(def hasParty
  {:db/ident :cmns-pts/hasParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has party",
   :rdfs/range :cmns-pts/Party,
   :skos/definition
   "identifies a party associated with an agreement, contract, policy, regulation, situation, or other arrangement"})

(def hasPartyRole
  {:db/ident :cmns-pts/hasPartyRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has party role",
   :rdfs/range :cmns-pts/PartyRole,
   :rdfs/subPropertyOf :cmns-rlcmp/hasRole,
   :skos/definition
   "identifies a specific role played by some person or organization as related to a situation, agreement, contract, policy, regulation, activity or other relationship"})

(def hasRelatedPartyRole
  {:cmns-av/usageNote
   "This property is intended as an abstract property, whose subproperties may or may not be symmetric, but could be inverses of one another.",
   :db/ident :cmns-pts/hasRelatedPartyRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-pts/PartyRole,
   :rdfs/label "has related party role",
   :rdfs/range :cmns-pts/PartyRole,
   :rdfs/subPropertyOf :cmns-rlcmp/hasRole,
   :skos/definition
   "relates a party acting in a specific role directly to another party acting in the same or another role"})

(def hasSubjectRole
  {:db/ident :cmns-pts/hasSubjectRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-pts/Situation,
   :rdfs/label "has subject role",
   :rdfs/range :cmns-rlcmp/Role,
   :rdfs/subPropertyOf :cmns-rlcmp/hasRole,
   :skos/definition
   "identifies the person or thing that is being discussed, described, dealt with, or is the main topic in a specific role with respect to a given situation"})

(def hasUndergoer
  {:db/ident :cmns-pts/hasUndergoer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-pts/Situation,
   :rdfs/label "has undergoer",
   :rdfs/range :cmns-pts/Undergoer,
   :rdfs/subPropertyOf :cmns-pts/hasObjectRole,
   :skos/definition
   "identifies an experiencer / passive or other object role in a given situation"})

(def holdsDuring
  {:db/ident :cmns-pts/holdsDuring,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "holds during",
   :rdfs/range :cmns-dt/DatePeriod,
   :rdfs/subPropertyOf :cmns-cxtdsg/hasApplicablePeriod,
   :skos/definition "indicates a date period during which something is true"})

(def isAPartyTo
  {:db/ident :cmns-pts/isAPartyTo,
   :owl/inverseOf :cmns-pts/hasParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-pts/Party,
   :rdfs/label "is a party to",
   :skos/definition
   "identifies an agreement, contract, policy, regulation, situation, or other arrangement that a party is associated with"})

(def isAffectedBy
  {:db/ident :cmns-pts/isAffectedBy,
   :owl/propertyChainAxiom [:cmns-pts/undergoes :cmns-pts/hasActor],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is affected by",
   :skos/definition
   "relates an undergoer in a given situation to the actor that has an impact on them under the circumstances"})

(def isDirectlyAffectedBy
  {:db/ident :cmns-pts/isDirectlyAffectedBy,
   :owl/propertyChainAxiom
   [:cmns-pts/undergoes :cmns-pts/hasActor :cmns-rlcmp/isPlayedBy],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is directly affected by",
   :skos/definition
   "relates an undergoer in a given situation to the person or organization that has an impact on them under the circumstances"})

(def isExperiencedBy
  {:db/ident :cmns-pts/isExperiencedBy,
   :owl/inverseOf :cmns-pts/experiences,
   :owl/propertyChainAxiom [:cmns-pts/hasUndergoer :cmns-rlcmp/isPlayedBy],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is experienced by",
   :skos/definition
   "relates a situation to something that is directly involved in or affected by it"})

(def isObjectRoleIn
  {:db/ident :cmns-pts/isObjectRoleIn,
   :owl/inverseOf :cmns-pts/hasObjectRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-rlcmp/Role,
   :rdfs/label "is object role in",
   :rdfs/range {:owl/unionOf [:cmns-rlcmp/Composition :cmns-pts/Situation],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :cmns-rlcmp/isRoleIn,
   :skos/definition
   "indicates a situation in which the role is secondary, such as an experiencer or passive participant"})

(def isRealizedIn
  {:db/ident :cmns-pts/isRealizedIn,
   :owl/inverseOf :cmns-pts/realizes,
   :owl/propertyChainAxiom [:cmns-pts/hasObjectRole :cmns-rlcmp/isPlayedBy],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is realized in",
   :skos/definition
   "relates a situation or constituency to something that is affected by, or is a secondary argument to in a specific role with respect to a given relation or situation"})

(def isSubjectRoleIn
  {:db/ident :cmns-pts/isSubjectRoleIn,
   :owl/inverseOf :cmns-pts/hasSubjectRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-rlcmp/Role,
   :rdfs/label "is subject role in",
   :rdfs/range :cmns-pts/Situation,
   :rdfs/subPropertyOf :cmns-rlcmp/isRoleIn,
   :skos/definition
   "indicates a situation in which the role is the primary topic"})

(def playsActivePartyIn
  {:db/ident :cmns-pts/playsActivePartyIn,
   :owl/propertyChainAxiom [:cmns-rlcmp/playsRole :cmns-pts/actsIn],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "plays active party in",
   :skos/definition
   "relates a person or organization to a situation that they are directly involved in"})

(def playsActiveRoleIn
  {:db/ident :cmns-pts/playsActiveRoleIn,
   :owl/propertyChainAxiom [:cmns-rlcmp/playsRole :cmns-pts/isSubjectRoleIn],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "plays active role in",
   :skos/definition
   "relates something to a situation that it is directly involved in"})

(def playsActiveRoleThatAffects
  {:db/ident :cmns-pts/playsActiveRoleThatAffects,
   :owl/inverseOf :cmns-pts/isDirectlyAffectedBy,
   :owl/propertyChainAxiom
   [:cmns-rlcmp/playsRole :cmns-pts/actsIn :cmns-pts/hasUndergoer],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "plays active role that affects",
   :skos/definition
   "relates a person or organization to an undergoer they have an impact on under the circumstances"})

(def playsActiveRoleThatDirectlyAffects
  {:db/ident :cmns-pts/playsActiveRoleThatDirectlyAffects,
   :owl/inverseOf :cmns-pts/experiencesDirectly,
   :owl/propertyChainAxiom [:cmns-rlcmp/playsRole
                            :cmns-pts/actsIn
                            :cmns-pts/hasUndergoer
                            :cmns-rlcmp/isPlayedBy],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "plays active role that directly affects",
   :skos/definition
   "relates a person or organization to something they have a direct impact on under the circumstances"})

(def realizes
  {:db/ident :cmns-pts/realizes,
   :owl/propertyChainAxiom [:cmns-rlcmp/playsRole :cmns-pts/isObjectRoleIn],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "realizes",
   :skos/definition
   "relates something to a situation or constituency in which the role they play is secondary, such as an experiencer or passive participant"})

(def undergoes
  {:db/ident           :cmns-pts/undergoes,
   :owl/inverseOf      :cmns-pts/hasUndergoer,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :cmns-pts/Undergoer,
   :rdfs/label         "undergoes",
   :rdfs/range         :cmns-pts/Situation,
   :rdfs/subPropertyOf :cmns-pts/isObjectRoleIn,
   :skos/definition    "indicates a situation that the undergoer experiences"})

(def urn:uuid:91dd71ff-83ab-5dec-a5ba-53bdd76486e0
  {:cmns-av/copyright #{"Copyright (c) 2020-2023 Thematix Partners LLC"
                        "Copyright (c) 2023 Object Management Group, Inc."
                        "Copyright (c) 2020-2023 EDM Council, Inc."
                        "Copyright (c) 2020-2023 Working Ontologist LLC"
                        "Copyright (c) 2022-2023 Pistoia Alliance, Inc."},
   :cmns-av/usageNote
   "Note that inference with respect to property chains, which this ontology makes extensive use of, requires a knowledge graph solution that understands these chains, or requires running a reasoner outside of the graph database and asserting the inferences in order to make use of them.",
   :dcterms/abstract
   "This ontology defines the high-level concepts of parties and the roles they play in various situations.",
   :dcterms/contributor #{"Elisa Kendall, Thematix Partners LLC"
                          "Dean Allemang, Working Ontologist"},
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://www.omg.org/spec/Commons/20230801/PartiesAndSituations/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Commons Parties and Situations Ontology",
   :skos/note
   "This ontology was originally designed for use in the Financial Industry Business Ontology (FIBO) for representing complex relationships between parties, such as employment, ownership and control. It has since been extended based on usage in other projects, such as the Pistoia Alliance Identification of Medicinal Products (IDMP) ontology project.",
   :xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"})