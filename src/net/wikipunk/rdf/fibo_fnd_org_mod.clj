(ns net.wikipunk.rdf.fibo-fnd-org-mod
  "This is the metadata ontology used to describe the Foundations Organizations Module."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/MetadataFNDOrganizations/OrganizationsModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Organizations Module.",
   :dcterms/issued #inst "2020-02-24T23:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Organizations/MetadataFNDOrganizations/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-org-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/MetadataFNDOrganizations/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/MetadataFNDOrganizations/",
   :rdfa/prefix "fibo-fnd-org-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/MetadataFNDOrganizations/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Foundations (FND) Organizations Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright ["Copyright (c) 2017-2020 EDM Council, Inc."
                  "Copyright (c) 2017-2020 Object Management Group, Inc."],
   :sm/fileAbbreviation "fibo-fnd-org-mod",
   :sm/filename "MetadataFNDOrganizations.rdf"})

(def OrganizationsModule
  "This module includes ontologies defining organizations, features of an organization and different types of organization. They are purposefully underspecified to facilitate mapping to specific organization ontologies, such as the W3C organization and formal organization ontologies, organization from a BMM or BPMN perspective, organization from a records management (RMS) perspective, and so forth."
  {:db/ident :fibo-fnd-org-mod/OrganizationsModule,
   :dcterms/abstract
   "This module includes ontologies defining organizations, features of an organization and different types of organization. They are purposefully underspecified to facilitate mapping to specific organization ontologies, such as the W3C organization and formal organization ontologies, organization from a BMM or BPMN perspective, organization from a records management (RMS) perspective, and so forth.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "Financial Industry Business Ontology (FIBO) Foundations (FND) Organizations Module",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/MetadataFNDOrganizations/",
   :rdfs/label "Organizations",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/copyright ["Copyright (c) 2017-2020 EDM Council, Inc."
                  "Copyright (c) 2017-2020 Object Management Group, Inc."],
   :sm/moduleAbbreviation "fibo-fnd-org"})