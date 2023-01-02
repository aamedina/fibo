(ns net.wikipunk.rdf.fibo-fnd-rel-mod
  "This is the metadata ontology used to describe the Foundations Relations Module."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/MetadataFNDRelations/RelationsModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Relations Module.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/MetadataFNDRelations/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-rel-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/MetadataFNDRelations/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/MetadataFNDRelations/",
   :rdfa/prefix "fibo-fnd-rel-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/MetadataFNDRelations/",
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Relations Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright ["Copyright (c) 2017-2018 EDM Council, Inc."
                  "Copyright (c) 2017-2018 Object Management Group, Inc."],
   :sm/fileAbbreviation "fibo-fnd-rel-mod",
   :sm/filename "MetadataFNDRelations.rdf"})

(def RelationsModule
  "This module contains an ontology defining a number of reusable relationships. These are used, refined or restricted to define relationships among more specific concepts in other FIBO ontologies. Some of these relationships stand in for relationships which are defined in external standards ontologies."
  {:db/ident :fibo-fnd-rel-mod/RelationsModule,
   :dcterms/abstract
   "This module contains an ontology defining a number of reusable relationships. These are used, refined or restricted to define relationships among more specific concepts in other FIBO ontologies. Some of these relationships stand in for relationships which are defined in external standards ontologies.",
   :dcterms/hasPart
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "Financial Industry Business Ontology (FIBO) Foundations (FND) Relations Module",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/MetadataFNDRelations/",
   :rdfs/label "Relations",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/copyright ["Copyright (c) 2017-2018 EDM Council, Inc."
                  "Copyright (c) 2017-2018 Object Management Group, Inc."],
   :sm/moduleAbbreviation "fibo-fnd-rel"})