(ns net.wikipunk.rdf.fibo-fnd-utl-mod
  "This is the metadata ontology used to describe the Foundations Utilities Module."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/MetadataFNDUtilities/UtilitiesModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Utilities Module.",
   :dcterms/issued #inst "2020-08-28T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/MetadataFNDUtilities/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-fnd-utl-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/MetadataFNDUtilities/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/MetadataFNDUtilities/",
   :rdfa/prefix "fibo-fnd-utl-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/MetadataFNDUtilities/",
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Utilities Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright ["Copyright (c) 2017-2020 EDM Council, Inc."
                  "Copyright (c) 2017-2020 Object Management Group, Inc."],
   :sm/fileAbbreviation "fibo-fnd-utl-mod",
   :sm/filename "MetadataFNDUtilities.rdf"})

(def UtilitiesModule
  "Ontologies which provide annotations and business facing datatypes to be used in other ontologies. These ontologies are not expected to be used directly by business stakeholders and are for the definition of material which is used by semantic modelers in Foundations and in other FIBO ontologies."
  {:db/ident :fibo-fnd-utl-mod/UtilitiesModule,
   :dcterms/abstract
   "Ontologies which provide annotations and business facing datatypes to be used in other ontologies. These ontologies are not expected to be used directly by business stakeholders and are for the definition of material which is used by semantic modelers in Foundations and in other FIBO ontologies.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Foundations (FND) Utilities Module"
    "FIBO FND Utilities Module"],
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/MetadataFNDUtilities/",
   :rdfs/label "Utilities",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/copyright ["Copyright (c) 2017-2020 Object Management Group, Inc."
                  "Copyright (c) 2017-2020 EDM Council, Inc."],
   :sm/moduleAbbreviation "fibo-fnd-utl"})