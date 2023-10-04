(ns net.wikipunk.rdf.fibo-fnd-org-mod
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/MetadataFNDOrganizations/",
    :namespaces
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
    :prefix "fibo-fnd-org-mod",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Organizations/MetadataFNDOrganizations/OrganizationsModule"}
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Organizations Module.",
   :dcterms/issued #inst "2020-02-24T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-20T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Organizations/MetadataFNDOrganizations/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata for the EDMC-FIBO Foundations (FND) Organizations Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/MetadataFNDOrganizations/"})

(def OrganizationsModule
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :db/ident :fibo-fnd-org-mod/OrganizationsModule,
   :dcterms/abstract
   "This module includes ontologies defining organizations, features of an organization and different types of organization. They are purposefully underspecified to facilitate mapping to specific organization ontologies, such as the W3C organization and formal organization ontologies, organization from a BMM or BPMN perspective, organization from a records management (RMS) perspective, and so forth.",
   :dcterms/hasPart
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/"}},
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"FIBO FND Organizations Module"
     "Financial Industry Business Ontology (FIBO) Foundations (FND) Organizations Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/MetadataFNDOrganizations/"},
   :rdfs/label "organizations module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:d76d2bdb-607c-54c3-ad7d-2efcaac95ffc
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Organizations Module.",
   :dcterms/issued #inst "2020-02-24T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-20T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Organizations/MetadataFNDOrganizations/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata for the EDMC-FIBO Foundations (FND) Organizations Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/MetadataFNDOrganizations/"})