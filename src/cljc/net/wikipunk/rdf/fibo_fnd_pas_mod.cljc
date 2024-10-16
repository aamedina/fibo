(ns net.wikipunk.rdf.fibo-fnd-pas-mod
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/ProductsAndServices/MetadataFNDProductsAndServices/ProductsAndServicesModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Products and Services Module.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-20T18:00:00.000-00:00",
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-pas-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/MetadataFNDProductsAndServices/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/ProductsAndServices/MetadataFNDProductsAndServices/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-pas-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/MetadataFNDProductsAndServices/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Foundations (FND) Products and Services Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/MetadataFNDProductsAndServices/"})

(def ProductsAndServicesModule
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :db/ident :fibo-fnd-pas-mod/ProductsAndServicesModule,
   :dcterms/abstract
   "This module includes ontologies defining concepts such as buyers, sellers, customers, clients, products and services generally, as well as very high-level relationships between them.",
   :dcterms/hasPart
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/"}},
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"FIBO FND Products and Services Module"
     "Financial Industry Business Ontology (FIBO) Foundations (FND) Products and Services Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/MetadataFNDProductsAndServices/"},
   :rdfs/label "products and services module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:6137a752-3b2e-5267-985e-92ddef26de46
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Products and Services Module.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-20T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/ProductsAndServices/MetadataFNDProductsAndServices/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata for the EDMC-FIBO Foundations (FND) Products and Services Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/MetadataFNDProductsAndServices/"})