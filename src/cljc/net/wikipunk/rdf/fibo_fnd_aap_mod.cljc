(ns net.wikipunk.rdf.fibo-fnd-aap-mod
  "This is the metadata ontology used to describe the Foundations Agents and People Module."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 EDM Council, Inc."
                       "Copyright (c) 2017-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/MetadataFNDAgentsAndPeople/AgentsAndPeopleModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Agents and People Module.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-01-20T23:00:00.000-00:00",
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/AgentsAndPeople/MetadataFNDAgentsAndPeople/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-aap-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/MetadataFNDAgentsAndPeople/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-aap-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/MetadataFNDAgentsAndPeople/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Foundations (FND) Agents and People Module"})

(def AgentsAndPeopleModule
  "This module contains ontologies of concepts relating to types of autonomous entity, that is things in the world which are able to determine their own behavior. Includes ontologies for people and for autononomous entities in general."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 Object Management Group, Inc."
                       "Copyright (c) 2017-2023 EDM Council, Inc."],
   :db/ident :fibo-fnd-aap-mod/AgentsAndPeopleModule,
   :dcterms/abstract
   "This module contains ontologies of concepts relating to types of autonomous entity, that is things in the world which are able to determine their own behavior. Includes ontologies for people and for autononomous entities in general.",
   :dcterms/hasPart
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/"}],
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Foundations (FND) Agents and People Module"
    "FIBO FND Agents and People Module"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/MetadataFNDAgentsAndPeople/",
   :rdfs/label "agents and people module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})