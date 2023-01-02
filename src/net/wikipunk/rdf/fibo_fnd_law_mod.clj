(ns net.wikipunk.rdf.fibo-fnd-law-mod
  "This is the metadata ontology used to describe the Foundations Law Module."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Law/MetadataFNDLaw/LawModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Law Module.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/MetadataFNDLaw/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-law-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/MetadataFNDLaw/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://spec.edmcouncil.org/fibo/ontology/FND/Law/MetadataFNDLaw/",
   :rdfa/prefix "fibo-fnd-law-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Law/MetadataFNDLaw/",
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Law Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright ["Copyright (c) 2017-2018 EDM Council, Inc."
                  "Copyright (c) 2017-2018 Object Management Group, Inc."],
   :sm/fileAbbreviation "fibo-fnd-law-mod",
   :sm/filename "MetadataFNDLaw.rdf"})

(def LawModule
  "This module includes several ontologies defining legal concepts, including constitutions, laws and jurisdictions. It also includes the definition of legal capacities such as signatory capacity, contractual capability and the like."
  {:db/ident :fibo-fnd-law-mod/LawModule,
   :dcterms/abstract
   "This module includes several ontologies defining legal concepts, including constitutions, laws and jurisdictions. It also includes the definition of legal capacities such as signatory capacity, contractual capability and the like.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCore/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "Financial Industry Business Ontology (FIBO) Foundations (FND) Law Module",
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Law/MetadataFNDLaw/",
   :rdfs/label "Law",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/copyright ["Copyright (c) 2017-2018 EDM Council, Inc."
                  "Copyright (c) 2017-2018 Object Management Group, Inc."],
   :sm/moduleAbbreviation "fibo-fnd-law"})