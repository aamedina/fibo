(ns net.wikipunk.rdf.fibo-fnd-gao-mod
  "This is the metadata ontology used to describe the Foundations Goals and Objectives Module."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 EDM Council, Inc."
                       "Copyright (c) 2017-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/MetadataFNDGoalsAndObjectives/GoalsAndObjectivesModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Goals and Objectives Module.",
   :dcterms/issued #inst "2020-12-28T23:00:00.000-00:00",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-01-20T23:00:00.000-00:00",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/GoalsAndObjectives/MetadataFNDGoalsAndObjectives/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-gao-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/MetadataFNDGoalsAndObjectives/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-gao-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/MetadataFNDGoalsAndObjectives/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Foundations (FND) Goals and Objectives Module"})

(def GoalsAndObjectivesModule
  "This module includes ontologies for goals and objectives which may be pursued by people or organizations. Goals form the basis for the definition of an organization, and objectives and related concepts are required for describing business plans."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 Object Management Group, Inc."
                       "Copyright (c) 2017-2023 EDM Council, Inc."],
   :db/ident :fibo-fnd-gao-mod/GoalsAndObjectivesModule,
   :dcterms/abstract
   "This module includes ontologies for goals and objectives which may be pursued by people or organizations. Goals form the basis for the definition of an organization, and objectives and related concepts are required for describing business plans.",
   :dcterms/hasPart
   "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/title
   ["FIBO FND Goals and Objectives Module"
    "Financial Industry Business Ontology (FIBO) Foundations (FND) Goals and Objectives Module"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/MetadataFNDGoalsAndObjectives/",
   :rdfs/label "goals and objectives module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})