(ns net.wikipunk.rdf.fibo-fnd-pas-mod
  "This is the metadata ontology used to describe the Foundations Products and Services Module."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/MetadataFNDProductsAndServices/ProductsAndServicesModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Products and Services Module.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/MetadataFNDProductsAndServices/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-pas-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/MetadataFNDProductsAndServices/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/MetadataFNDProductsAndServices/",
   :rdfa/prefix "fibo-fnd-pas-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/MetadataFNDProductsAndServices/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Foundations (FND) Products and Services Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright ["Copyright (c) 2017-2018 EDM Council, Inc."
                  "Copyright (c) 2017-2018 Object Management Group, Inc."],
   :sm/fileAbbreviation "fibo-fnd-pas-mod",
   :sm/filename "MetadataFNDProductsAndServices.rdf"})

(def ProductsAndServicesModule
  "This module includes ontologies defining concepts such as buyers, sellers, customers, clients, products and services generally, as well as very high-level relationships between them, for use in other FIBO ontologies."
  {:db/ident :fibo-fnd-pas-mod/ProductsAndServicesModule,
   :dcterms/abstract
   "This module includes ontologies defining concepts such as buyers, sellers, customers, clients, products and services generally, as well as very high-level relationships between them, for use in other FIBO ontologies.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "Financial Industry Business Ontology (FIBO) Foundations (FND) Products and Services Module",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/MetadataFNDProductsAndServices/",
   :rdfs/label "Products and Services",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/copyright ["Copyright (c) 2017-2018 Object Management Group, Inc."
                  "Copyright (c) 2017-2018 EDM Council, Inc."],
   :sm/moduleAbbreviation "fibo-fnd-pas"})