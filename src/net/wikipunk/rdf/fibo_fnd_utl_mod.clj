(ns net.wikipunk.rdf.fibo-fnd-utl-mod
  "This is the metadata ontology used to describe the Foundations Utilities Module."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 EDM Council, Inc."
                       "Copyright (c) 2017-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/MetadataFNDUtilities/UtilitiesModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Utilities Module.",
   :dcterms/issued #inst "2020-08-28T22:00:00.000-00:00",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-01-06T23:00:00.000-00:00",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/MetadataFNDUtilities/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-fnd-utl-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/MetadataFNDUtilities/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/MetadataFNDUtilities/",
   :rdfa/prefix "fibo-fnd-utl-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/MetadataFNDUtilities/",
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Utilities Module"})

(def UtilitiesModule
  "The utilities module includes ontologies that provide metadata and other basic concepts to be used in other ontologies."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 EDM Council, Inc."
                       "Copyright (c) 2017-2023 Object Management Group, Inc."],
   :db/ident :fibo-fnd-utl-mod/UtilitiesModule,
   :dcterms/abstract
   "The utilities module includes ontologies that provide metadata and other basic concepts to be used in other ontologies.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/"],
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Foundations (FND) Utilities Module"
    "FIBO FND Utilities Module"],
   :rdf/type [:owl/NamedIndividual :fibo-fnd-utl-av/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/MetadataFNDUtilities/",
   :rdfs/label "utilities module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})