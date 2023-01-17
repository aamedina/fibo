(ns net.wikipunk.rdf.fibo-fnd-aap-agt
  "This ontology defines the concept of autonomous agent for use in other FIBO ontology elements. As defined here, autonomous agent corresponds to what is often referred to as \"agent\" in software and other systems. It is defined as any entity which is able to act on its own part, and embraces all such things, including people, animals, software agents organizations and all forms of legal persons, although not all of these concepts are elaborated in FIBO as not all are relevant to financial services."
  {:cmns-av/copyright ["Copyright (c) 2013-2023 Object Management Group, Inc."
                       "Copyright (c) 2013-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/",
   :dcterms/abstract
   "This ontology defines the concept of autonomous agent for use in other FIBO ontology elements. As defined here, autonomous agent corresponds to what is often referred to as \"agent\" in software and other systems. It is defined as any entity which is able to act on its own part, and embraces all such things, including people, animals, software agents organizations and all forms of legal persons, although not all of these concepts are elaborated in FIBO as not all are relevant to financial services.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/AgentsAndPeople/Agents/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-aap-agt"
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/",
   :rdfa/prefix "fibo-fnd-aap-agt",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/",
   :rdfs/label "Agents Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to add a custom datatype for text values (which might be either xsd:string or rdf:langString) and use that in the restriction on hasName on autonomous agent."
    "The https://spec.edmcouncil.org/fibo/ontology/Foundations/20130601/AgentsAndPeople/Agents.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t\t(1) to use slash style URI/IRIs (also called 303 URIs, vs. hash style) as required to support server side processing \n\t\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to address hygiene issues with respect to text formatting."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to add notes on the custom Text datatype indicating that it is outside the RL profile and that if someone wants to use this ontology with OWL 2 RL rules they might want to comment this out / eliminate it where it is used."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to support the FIBO 2.0 RFC, primarily with respect to equivalence relationships to LCC."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to loosen the range restriction on hasName to rdfs:Literal, facilitating multi-lingual name representation."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to eliminate duplication with concepts in LCC."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/."]})

(def AutomatedSystem
  "a system that reduces or eliminates the need for human involvement in order to complete a task."
  {:cmns-av/adaptedFrom
   "https://www.reference.com/technology/automated-system-c85583d0f17a632",
   :db/ident :fibo-fnd-aap-agt/AutomatedSystem,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/",
   :rdfs/label "automated system",
   :rdfs/subClassOf :fibo-fnd-aap-agt/AutonomousAgent,
   :skos/definition
   "a system that reduces or eliminates the need for human involvement in order to complete a task."})

(def AutonomousAgent
  "something autonomous that can adapt to and interact with its environment"
  {:cmns-av/directSource
   "http://www.omg.org/techprocess/meetings/schedule/AMP.html",
   :cmns-av/explanatoryNote
   ["Note that this does not necessarily imply that an agent is free to act as it sees fit, without constraint. Rather, an autonomous thing in the sense meant here is something which may or may not be subject to controls and constraints but is self-actualizing in its behavior in response to any such constraints. Autonomous things may include human beings, organizations, software agents, robots and animals."
    "Agents, then, can be software agents, hardware agents, firmware agents, robotic agents, human agents, and so on. While software developers naturally think of IT systems as being constructed of only software agents, a combination of agent mechanisms might in fact be used from shop-floor manufacturing to warfare systems. The definition incorporated herein must be sufficiently general to account for these and other uses, such as for describing people and organizations who participate in broader processes and systems, for FIBO, other OMG standards and usage, and in general.\n\nWhether or not you restrict your view of agents to the software variety, most agree that agents deployed for IT systems are not useful without the following three important properties:\n\n(1) Autonomous - an agent is capable of acting without direct external intervention. Agents have some degree of control over their internal state and can act based on their own experiences. They can also possess their own set of internal responsibilities and processing that enable them to act without any external choreography. When an agent acts on behalf of (or as a proxy for) some person or thing, its autonomy is expected to embody the goals and policies of the entity that it represents.\n\n(2) Interactive - an agent communicates with the environment and other agents. Agents are interactive entities because they are capable of exchanging rich forms of messages with other entities in their environment. These messages can support requests for services and other kinds of resources, as well as event detection and notification. They can be synchronous or asynchronous in nature. The interaction can also be conversational in nature, such as negotiating contracts, marketplace-style bidding, or simply making a query.\n\n(3) Adaptive - an agent is capable of responding to other agents and/or its environment. Agents can react to messages and events and then respond appropriately. Agents can be designed to make difficult decisions and even modify their behavior based on their experiences. They can learn and evolve."],
   :cmns-av/usageNote
   "The use of custom datatypes is outside the OWL 2 RL profile and so users should consider commenting out the restriction on hasTextValue altogether or change the data range to rdfs:Literal in applications that are constrained to OWL 2 RL.",
   :db/ident :fibo-fnd-aap-agt/AutonomousAgent,
   :dcterms/source "http://www.omg.org/spec/SoaML/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/",
   :rdfs/label "autonomous agent",
   :rdfs/seeAlso ["http://www.jamesodell.com/WhyShouldWeCareAboutAgents.pdf"
                  "http://www.jamesodell.com/WhatIsAnAgent.pdf"],
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-aap-agt/Name,
                      :owl/onProperty :fibo-fnd-aap-agt/hasStructuredName,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :fibo-fnd-aap-agt/Text,
                      :owl/onProperty  :lcc-lr/hasName,
                      :rdf/type        :owl/Restriction}],
   :skos/definition
   "something autonomous that can adapt to and interact with its environment"})

(def Name
  "designation by which someone, some place, or something is known"
  {:cmns-av/adaptedFrom
   "ISO 1087-1 Terminology work - Vocabulary - Theory and Application, First edition, 2000-10-15",
   :cmns-av/usageNote
   "The use of custom datatypes is outside the OWL 2 RL profile and so users should consider commenting out the restriction on hasTextValue altogether or change the data range to rdfs:Literal in applications that are constrained to OWL 2 RL.",
   :db/ident :fibo-fnd-aap-agt/Name,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/",
   :rdfs/label "name",
   :rdfs/subClassOf {:owl/minQualifiedCardinality 0,
                     :owl/onDataRange :fibo-fnd-aap-agt/Text,
                     :owl/onProperty  :fibo-fnd-aap-agt/hasTextValue,
                     :rdf/type        :owl/Restriction},
   :skos/definition
   "designation by which someone, some place, or something is known"})

(def Text
  "datatype that maps to both base types for string-valued data properties and annotations"
  {:cmns-av/explanatoryNote
   "There are cases where the representation of certain features of something, such as a name, which might be multilingual or might not, defaults to rdfs:Literal when left unspecified, although it should be limited to plain strings or language-typed strings (i.e., exclude numbers, binary types, and so forth). There is no combined option in RDF or OWL, however, which is the role that this datatype is intended to fulfill.",
   :cmns-av/usageNote
   ["This composite datatype should be used in cases where a standard representation using one of the options in the union for string values does not work. Note that certain tools may not support rdf:langString, including, but not limited to some versions of Protege."
    "The use of custom datatypes is outside the OWL 2 RL profile and so users should consider commenting this and its usage here, and in the People, Organizations, and other ontologies out, or replacing it with rdfs:Literal out in applications that are constrained to OWL 2 RL."],
   :db/ident :fibo-fnd-aap-agt/Text,
   :owl/equivalentClass {:owl/unionOf [:xsd/string :rdf/langString],
                         :rdf/type    :rdfs/Datatype},
   :rdf/type :rdfs/Datatype,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/",
   :rdfs/label "text",
   :skos/definition
   "datatype that maps to both base types for string-valued data properties and annotations"})

(def hasStructuredName
  "indicates a designation for something"
  {:cmns-av/usageNote
   "Structured names can include multiple components, such as a full legal name and sorting name for someone, and can be extended to include the time frame for which the name is known to be valid.",
   :db/ident :fibo-fnd-aap-agt/hasStructuredName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/",
   :rdfs/label "has structured name",
   :rdfs/range :fibo-fnd-aap-agt/Name,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition "indicates a designation for something"})

(def hasTextValue
  "provides a string value for something, with or without a language tag"
  {:db/ident :fibo-fnd-aap-agt/hasTextValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/",
   :rdfs/label "has text value",
   :skos/definition
   "provides a string value for something, with or without a language tag"})

(def isStructuredNameOf
  "indicates someone, some place, or something that a structured name designates"
  {:db/ident :fibo-fnd-aap-agt/isStructuredNameOf,
   :owl/inverseOf :fibo-fnd-aap-agt/hasStructuredName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-aap-agt/Name,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/",
   :rdfs/label "is structured name of",
   :skos/definition
   "indicates someone, some place, or something that a structured name designates"})