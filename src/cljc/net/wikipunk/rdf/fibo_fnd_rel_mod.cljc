(ns net.wikipunk.rdf.fibo-fnd-rel-mod
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/MetadataFNDRelations/",
    :namespaces
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
    :prefix "fibo-fnd-rel-mod",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/MetadataFNDRelations/RelationsModule"}
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Relations Module.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-20T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/MetadataFNDRelations/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Relations Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/MetadataFNDRelations/"})

(def RelationsModule
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :db/ident :fibo-fnd-rel-mod/RelationsModule,
   :dcterms/abstract
   "This module contains an ontology defining a number of reusable relationships. These are used, refined or restricted to define relationships among more specific concepts in other FIBO ontologies. Some of these relationships stand in for relationships which are defined in external standards ontologies.",
   :dcterms/hasPart
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"FIBO FND Relations Module"
     "Financial Industry Business Ontology (FIBO) Foundations (FND) Relations Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/MetadataFNDRelations/"},
   :rdfs/label "relations module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:f55fd926-0bd8-5d00-843b-15608043fbad
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Relations Module.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-20T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/MetadataFNDRelations/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Relations Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/MetadataFNDRelations/"})