(ns net.wikipunk.rdf.fibo-fnd-gao-mod
  "This is the metadata ontology used to describe the Foundations Goals and Objectives Module."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/MetadataFNDGoalsAndObjectives/GoalsAndObjectivesModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Goals and Objectives Module.",
   :dcterms/issued #inst "2020-12-28T23:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/GoalsAndObjectives/MetadataFNDGoalsAndObjectives/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-gao-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/MetadataFNDGoalsAndObjectives/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/MetadataFNDGoalsAndObjectives/",
   :rdfa/prefix "fibo-fnd-gao-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/MetadataFNDGoalsAndObjectives/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Foundations (FND) Goals and Objectives Module",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2017-2020 EDM Council, Inc."
                  "Copyright (c) 2017-2020 Object Management Group, Inc."],
   :sm/fileAbbreviation "fibo-fnd-gao-mod",
   :sm/filename "MetadataFNDGoalsAndObjectives.rdf"})

(def GoalsAndObjectivesModule
  "This module includes ontologies for goals and objectives which may be pursued by people or organizations. Goals form the basis for the definition of an organization, and objectives and related concepts are required for describing business plans."
  {:db/ident :fibo-fnd-gao-mod/GoalsAndObjectivesModule,
   :dcterms/abstract
   "This module includes ontologies for goals and objectives which may be pursued by people or organizations. Goals form the basis for the definition of an organization, and objectives and related concepts are required for describing business plans.",
   :dcterms/hasPart
   "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "Financial Industry Business Ontology (FIBO) Foundations (FND) Goals and Objectives Module",
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/MetadataFNDGoalsAndObjectives/",
   :rdfs/label "Goals and Objectives",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/copyright ["Copyright (c) 2017-2020 EDM Council, Inc."
                  "Copyright (c) 2017-2020 Object Management Group, Inc."],
   :sm/moduleAbbreviation "fibo-fnd-gao"})