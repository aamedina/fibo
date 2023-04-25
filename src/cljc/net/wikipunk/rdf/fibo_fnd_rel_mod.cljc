(ns net.wikipunk.rdf.fibo-fnd-rel-mod
  "This is the metadata ontology used to describe the Foundations Relations Module."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 EDM Council, Inc."
                       "Copyright (c) 2017-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/MetadataFNDRelations/RelationsModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Relations Module.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-01-20T23:00:00.000-00:00",
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/MetadataFNDRelations/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-rel-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/MetadataFNDRelations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-rel-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/MetadataFNDRelations/",
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Relations Module"})

(def RelationsModule
  "This module contains an ontology defining a number of reusable relationships. These are used, refined or restricted to define relationships among more specific concepts in other FIBO ontologies. Some of these relationships stand in for relationships which are defined in external standards ontologies."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 Object Management Group, Inc."
                       "Copyright (c) 2017-2023 EDM Council, Inc."],
   :db/ident :fibo-fnd-rel-mod/RelationsModule,
   :dcterms/abstract
   "This module contains an ontology defining a number of reusable relationships. These are used, refined or restricted to define relationships among more specific concepts in other FIBO ontologies. Some of these relationships stand in for relationships which are defined in external standards ontologies.",
   :dcterms/hasPart
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Foundations (FND) Relations Module"
    "FIBO FND Relations Module"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/MetadataFNDRelations/",
   :rdfs/label "relations module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})