(ns net.wikipunk.rdf.fibo-fnd-org-mod
  "This is the metadata ontology used to describe the Foundations Organizations Module."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 Object Management Group, Inc."
                       "Copyright (c) 2017-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/MetadataFNDOrganizations/OrganizationsModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Organizations Module.",
   :dcterms/issued #inst "2020-02-24T23:00:00.000-00:00",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-01-20T23:00:00.000-00:00",
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Organizations/MetadataFNDOrganizations/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-org-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/MetadataFNDOrganizations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-org-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/MetadataFNDOrganizations/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Foundations (FND) Organizations Module"})

(def OrganizationsModule
  "This module includes ontologies defining organizations, features of an organization and different types of organization. They are purposefully underspecified to facilitate mapping to specific organization ontologies, such as the W3C organization and formal organization ontologies, organization from a BMM or BPMN perspective, organization from a records management (RMS) perspective, and so forth."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 Object Management Group, Inc."
                       "Copyright (c) 2017-2023 EDM Council, Inc."],
   :db/ident :fibo-fnd-org-mod/OrganizationsModule,
   :dcterms/abstract
   "This module includes ontologies defining organizations, features of an organization and different types of organization. They are purposefully underspecified to facilitate mapping to specific organization ontologies, such as the W3C organization and formal organization ontologies, organization from a BMM or BPMN perspective, organization from a records management (RMS) perspective, and so forth.",
   :dcterms/hasPart
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/"}],
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/title
   ["FIBO FND Organizations Module"
    "Financial Industry Business Ontology (FIBO) Foundations (FND) Organizations Module"],
   :rdf/type [:owl/NamedIndividual :fibo-fnd-utl-av/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/MetadataFNDOrganizations/",
   :rdfs/label "organizations module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})