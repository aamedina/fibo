(ns net.wikipunk.rdf.fibo-fnd-arr-mod
  "This is the metadata ontology used to describe the Foundations Arrangements Module."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 EDM Council, Inc."
                       "Copyright (c) 2017-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/MetadataFNDArrangements/ArrangementsModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Arrangements Module.",
   :dcterms/issued #inst "2021-03-29T22:00:00.000-00:00",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-01-20T23:00:00.000-00:00",
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/MetadataFNDArrangements/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-arr-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/MetadataFNDArrangements/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-arr-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/MetadataFNDArrangements/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Foundations (FND) Arrangements Module"})

(def ArrangementsModule
  "This module contains ontologies that define abstract concepts, structures and schemata, such as identifiers and identification schemes, indices and indexing schemes, codes and coding schemes, and classification strategies."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 Object Management Group, Inc."
                       "Copyright (c) 2017-2023 EDM Council, Inc."],
   :db/ident :fibo-fnd-arr-mod/ArrangementsModule,
   :dcterms/abstract
   "This module contains ontologies that define abstract concepts, structures and schemata, such as identifiers and identification schemes, indices and indexing schemes, codes and coding schemes, and classification strategies.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/"],
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Foundations (FND) Arrangements Module"
    "FIBO FND Arrangements Module"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/MetadataFNDArrangements/",
   :rdfs/label "Arrangements Module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})