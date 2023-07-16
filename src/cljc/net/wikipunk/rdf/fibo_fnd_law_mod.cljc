(ns net.wikipunk.rdf.fibo-fnd-law-mod
  "This is the metadata ontology used to describe the Foundations Law Module."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 EDM Council, Inc."
                       "Copyright (c) 2017-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Law/MetadataFNDLaw/LawModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Law Module.",
   :dcterms/issued #xsd/dateTime #inst "2018-08-27T18:00:00.000-04:00",
   :dcterms/license {:rdfa/uri "https://opensource.org/licenses/MIT"},
   :dcterms/modified #xsd/dateTime #inst "2023-01-20T18:00:00.000-05:00",
   :owl/imports
   [{:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/MetadataFNDLaw/"},
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-law-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/MetadataFNDLaw/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-law-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Law/MetadataFNDLaw/",
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Law Module"})

(def LawModule
  "This module includes several ontologies defining legal concepts, including constitutions, laws and jurisdictions. It also includes the definition of legal capacities such as signatory capacity, contractual capability and the like."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 EDM Council, Inc."
                       "Copyright (c) 2017-2023 Object Management Group, Inc."],
   :db/ident :fibo-fnd-law-mod/LawModule,
   :dcterms/abstract
   "This module includes several ontologies defining legal concepts, including constitutions, laws and jurisdictions. It also includes the definition of legal capacities such as signatory capacity, contractual capability and the like.",
   :dcterms/hasPart
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/"}
    {:rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCore/"}],
   :dcterms/license {:rdfa/uri "https://opensource.org/licenses/MIT"},
   :dcterms/title
   ["FIBO FND Law Module"
    "Financial Industry Business Ontology (FIBO) Foundations (FND) Law Module"],
   :rdf/type [:owl/NamedIndividual :fibo-fnd-utl-av/Module],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/MetadataFNDLaw/"},
   :rdfs/label "law module",
   :rdfs/seeAlso {:rdfa/uri "https://spec.edmcouncil.org/fibo/"}})