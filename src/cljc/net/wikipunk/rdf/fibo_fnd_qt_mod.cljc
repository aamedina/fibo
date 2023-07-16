(ns net.wikipunk.rdf.fibo-fnd-qt-mod
  "This is the metadata ontology used to describe the Foundations Quantities Module."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 Object Management Group, Inc."
                       "Copyright (c) 2017-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/MetadataFNDQuantities/QuantitiesModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Quantities Module.",
   :dcterms/issued #xsd/dateTime #inst "2018-08-27T18:00:00.000-04:00",
   :dcterms/license {:rdfa/uri "https://opensource.org/licenses/MIT"},
   :dcterms/modified #xsd/dateTime #inst "2023-01-20T18:00:00.000-05:00",
   :owl/imports
   [{:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Quantities/MetadataFNDQuantities/"},
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-qt-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/MetadataFNDQuantities/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-qt-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/MetadataFNDQuantities/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Foundations (FND) Quantities Module"})

(def QuantitiesModule
  "This module contains ontologies that define concepts related to quantities, units, dimensions, and quantity values."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 Object Management Group, Inc."
                       "Copyright (c) 2017-2023 EDM Council, Inc."],
   :db/ident :fibo-fnd-qt-mod/QuantitiesModule,
   :dcterms/abstract
   "This module contains ontologies that define concepts related to quantities, units, dimensions, and quantity values.",
   :dcterms/hasPart
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/"},
   :dcterms/license {:rdfa/uri "https://opensource.org/licenses/MIT"},
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Foundations (FND) Quantities Module"
    "FIBO FND Quantities Module"],
   :rdf/type [:owl/NamedIndividual :fibo-fnd-utl-av/Module],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/MetadataFNDQuantities/"},
   :rdfs/label "quantities module",
   :rdfs/seeAlso {:rdfa/uri "https://spec.edmcouncil.org/fibo/"}})