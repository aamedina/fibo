(ns net.wikipunk.rdf.fibo-fnd-oac-mod
  "This is the metadata ontology used to describe the Foundations Ownership and Control Module."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/MetadataFNDOwnershipAndControl/OwnershipAndControlModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Ownership and Control Module.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/MetadataFNDOwnershipAndControl/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-oac-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/MetadataFNDOwnershipAndControl/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/MetadataFNDOwnershipAndControl/",
   :rdfa/prefix "fibo-fnd-oac-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/MetadataFNDOwnershipAndControl/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Foundations (FND) Ownership and Control Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright ["Copyright (c) 2017-2018 EDM Council, Inc."
                  "Copyright (c) 2017-2018 Object Management Group, Inc."],
   :sm/fileAbbreviation "fibo-fnd-oac-mod",
   :sm/filename "MetadataFNDOwnershipAndControl.rdf"})

(def OwnershipAndControlModule
  "This module includes ontologies defining the meanings of ownership, asset and owner, and of types of control such as de jure and de facto control. These form the basis of ownership and control relationship hierarchies as well as what it means to own or to control something."
  {:db/ident :fibo-fnd-oac-mod/OwnershipAndControlModule,
   :dcterms/abstract
   "This module includes ontologies defining the meanings of ownership, asset and owner, and of types of control such as de jure and de facto control.  These form the basis of ownership and control relationship hierarchies as well as what it means to own or to control something.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "Financial Industry Business Ontology (FIBO) Foundations (FND) Ownership and Control Module",
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/MetadataFNDOwnershipAndControl/",
   :rdfs/label "Ownership and Control",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/copyright ["Copyright (c) 2017-2018 Object Management Group, Inc."
                  "Copyright (c) 2017-2018 EDM Council, Inc."],
   :sm/moduleAbbreviation "fibo-fnd-oac"})