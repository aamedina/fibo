(ns net.wikipunk.rdf.fibo-fnd-oac-mod
  "This is the metadata ontology used to describe the Foundations Ownership and Control Module."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 EDM Council, Inc."
                       "Copyright (c) 2017-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/MetadataFNDOwnershipAndControl/OwnershipAndControlModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Ownership and Control Module.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-01-20T23:00:00.000-00:00",
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/MetadataFNDOwnershipAndControl/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-oac-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/MetadataFNDOwnershipAndControl/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-oac-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/MetadataFNDOwnershipAndControl/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Foundations (FND) Ownership and Control Module"})

(def OwnershipAndControlModule
  "This module includes ontologies defining the meanings of ownership and owner, and of types of control such as de jure and de facto control. These form the basis of ownership and control relationship hierarchies as well as what it means to own or to control something."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 Object Management Group, Inc."
                       "Copyright (c) 2017-2023 EDM Council, Inc."],
   :db/ident :fibo-fnd-oac-mod/OwnershipAndControlModule,
   :dcterms/abstract
   "This module includes ontologies defining the meanings of ownership and owner, and of types of control such as de jure and de facto control. These form the basis of ownership and control relationship hierarchies as well as what it means to own or to control something.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/"],
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/title
   ["FIBO FND Ownership and Control Module"
    "Financial Industry Business Ontology (FIBO) Foundations (FND) Ownership and Control Module"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/MetadataFNDOwnershipAndControl/",
   :rdfs/label "ownership and control module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})