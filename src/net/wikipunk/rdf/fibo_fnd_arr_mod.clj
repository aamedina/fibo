(ns net.wikipunk.rdf.fibo-fnd-arr-mod
  "This is the metadata ontology used to describe the Foundations Arrangements Module."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/MetadataFNDArrangements/ArrangementsModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Arrangements Module.",
   :dcterms/issued #inst "2021-03-29T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "EDMC Financial Industry Business Ontology (FIBO) Foundations (FND) Domain, Arrangements Module",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/MetadataFNDArrangements/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-arr-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/MetadataFNDArrangements/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/MetadataFNDArrangements/",
   :rdfa/prefix "fibo-fnd-arr-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/MetadataFNDArrangements/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Foundations (FND) Arrangements Module",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference",
   :sm/copyright ["Copyright (c) 2017-2021 EDM Council, Inc."
                  "Copyright (c) 2017-2021 Object Management Group, Inc."],
   :sm/dependsOn "https://www.omg.org/spec/LCC/",
   :sm/fileAbbreviation "fibo-fnd-arr-mod",
   :sm/filename "MetadataFNDArrangements.rdf"})

(def ArrangementsModule
  "This module contains ontologies that define abstract concepts, structures and schemata, such as identifiers and identification schemes, indices and indexing schemes, codes and coding schemes, and classification strategies."
  {:db/ident :fibo-fnd-arr-mod/ArrangementsModule,
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
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "Financial Industry Business Ontology (FIBO) Foundations (FND) Arrangements Module",
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/MetadataFNDArrangements/",
   :rdfs/label "Arrangements Module",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/copyright ["Copyright (c) 2017-2021 EDM Council, Inc."
                  "Copyright (c) 2017-2021 Object Management Group, Inc."],
   :sm/keyword
   "arrangements, assessments, classifiers, documents, identifiers, lifecycles, ratings, reports, schema",
   :sm/moduleAbbreviation "fibo-fnd-arr"})