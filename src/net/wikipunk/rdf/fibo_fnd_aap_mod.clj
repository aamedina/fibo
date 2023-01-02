(ns net.wikipunk.rdf.fibo-fnd-aap-mod
  "This is the metadata ontology used to describe the Foundations Agents and People Module."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/MetadataFNDAgentsAndPeople/AgentsAndPeopleModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Agents and People Module.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/AgentsAndPeople/MetadataFNDAgentsAndPeople/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-aap-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/MetadataFNDAgentsAndPeople/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/MetadataFNDAgentsAndPeople/",
   :rdfa/prefix "fibo-fnd-aap-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/MetadataFNDAgentsAndPeople/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Foundations (FND) Agents and People Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright ["Copyright (c) 2017-2018 Object Management Group, Inc."
                  "Copyright (c) 2017-2018 EDM Council, Inc."],
   :sm/fileAbbreviation "fibo-fnd-aap-mod",
   :sm/filename "MetadataFNDAgentsAndPeople.rdf"})

(def AgentsAndPeopleModule
  "This module contains ontologies of concepts relating to types of autonomous entity, that is things in the world which are able to determine their own behavior. Includes ontologies for people and for autononomous entities in general."
  {:db/ident :fibo-fnd-aap-mod/AgentsAndPeopleModule,
   :dcterms/abstract
   "This module contains ontologies of concepts relating to types of autonomous entity, that is things in the world which are able to determine their own behavior. Includes ontologies for people and for autononomous entities in general.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "Financial Industry Business Ontology (FIBO) Foundations (FND) Agents and People Module",
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/MetadataFNDAgentsAndPeople/",
   :rdfs/label "Agents And People",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/copyright ["Copyright (c) 2017-2018 Object Management Group, Inc."
                  "Copyright (c) 2017-2018 EDM Council, Inc."],
   :sm/moduleAbbreviation "fibo-fnd-aap"})