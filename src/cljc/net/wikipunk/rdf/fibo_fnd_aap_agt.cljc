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
   ["https://www.omg.org/spec/Commons/Designators/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://www.omg.org/spec/Commons/TextDatatype/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/AgentsAndPeople/Agents/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-txt" "https://www.omg.org/spec/Commons/TextDatatype/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-aap-agt"
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-aap-agt",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/",
   :rdfs/label "Agents Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to add a custom datatype for text values (which might be either xsd:string or rdf:langString) and use that in the restriction on hasName on autonomous agent."
    "The https://spec.edmcouncil.org/fibo/ontology/Foundations/20130601/AgentsAndPeople/Agents.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t\t(1) to use slash style URI/IRIs (also called 303 URIs, vs. hash style) as required to support server side processing \n\t\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to address hygiene issues with respect to text formatting."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to add notes on the custom Text datatype indicating that it is outside the RL profile and that if someone wants to use this ontology with OWL 2 RL rules they might want to comment this out / eliminate it where it is used."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to support the FIBO 2.0 RFC, primarily with respect to equivalence relationships to LCC."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to loosen the range restriction on hasName to rdfs:Literal, facilitating multi-lingual name representation."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to eliminate duplication with concepts in LCC."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/."]})

(def AutomatedSystem
  "system that reduces or eliminates the need for human involvement in order to complete a task"
  {:cmns-av/adaptedFrom
   "https://www.reference.com/technology/automated-system-c85583d0f17a632",
   :db/ident :fibo-fnd-aap-agt/AutomatedSystem,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/",
   :rdfs/label "automated system",
   :rdfs/subClassOf [:fibo-fnd-aap-agt/AutonomousAgent
                     :fibo-fnd-aap-agt/AutomatedSystem
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-dsg/Name,
                      :owl/onProperty :cmns-dsg/hasName,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :cmns-txt/Text,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasTextualName,
                      :rdf/type        :owl/Restriction}],
   :skos/definition
   "system that reduces or eliminates the need for human involvement in order to complete a task"})

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
                      :owl/onDataRange :cmns-txt/Text,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasTextualName,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-dsg/Name,
                      :owl/onProperty :cmns-dsg/hasName,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-aap-agt/AutonomousAgent],
   :skos/definition
   "something autonomous that can adapt to and interact with its environment"})

(def Name
  {:db/ident :fibo-fnd-aap-agt/Name,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-dsg/Name,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/"})

(def Text
  {:db/ident :fibo-fnd-aap-agt/Text,
   :owl/deprecated true,
   :owl/equivalentDatatype :cmns-txt/Text,
   :rdf/type :rdfs/Datatype,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/"})

(def hasStructuredName
  {:db/ident :fibo-fnd-aap-agt/hasStructuredName,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-dsg/hasName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/"})

(def hasTextValue
  {:db/ident :fibo-fnd-aap-agt/hasTextValue,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-txt/hasTextValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/"})

(def isStructuredNameOf
  {:db/ident :fibo-fnd-aap-agt/isStructuredNameOf,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-dsg/isNameOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/"})