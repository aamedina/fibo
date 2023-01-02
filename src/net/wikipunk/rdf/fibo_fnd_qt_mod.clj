(ns net.wikipunk.rdf.fibo-fnd-qt-mod
  "This is the metadata ontology used to describe the Foundations Quantities Module."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/MetadataFNDQuantities/QuantitiesModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Quantities Module.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Quantities/MetadataFNDQuantities/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-qt-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/MetadataFNDQuantities/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/MetadataFNDQuantities/",
   :rdfa/prefix "fibo-fnd-qt-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/MetadataFNDQuantities/",
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Quantities Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright ["Copyright (c) 2017-2018 EDM Council, Inc."
                  "Copyright (c) 2017-2018 Object Management Group, Inc."],
   :sm/fileAbbreviation "fibo-fnd-qt-mod",
   :sm/filename "MetadataFNDQuantities.rdf"})

(def QuantitiesModule
  "This module contains ontologies that define concepts related to quantities, units, dimensions, and quantity values."
  {:db/ident :fibo-fnd-qt-mod/QuantitiesModule,
   :dcterms/abstract
   "This module contains ontologies that define concepts related to quantities, units, dimensions, and quantity values.",
   :dcterms/hasPart
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "Financial Industry Business Ontology (FIBO) Foundations (FND) Quantities Module",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/MetadataFNDQuantities/",
   :rdfs/label "Quantities",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/copyright ["Copyright (c) 2017-2018 EDM Council, Inc."
                  "Copyright (c) 2017-2018 Object Management Group, Inc."],
   :sm/moduleAbbreviation "fibo-fnd-qt"})