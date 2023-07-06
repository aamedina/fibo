(ns net.wikipunk.rdf.fibo-fbc-pas-mod
  "The FBC Products and Services module extends the FND Products and Services module via ontologies defining financial products, financial services, financial service providers, and product catalogs as well as customer/client accounts."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/MetadataFBCProductsAndServices/FBCProductsAndServicesModule",
   :dcterms/abstract
   "The FBC Products and Services module extends the FND Products and Services module via ontologies defining financial products, financial services, financial service providers, and product catalogs as well as customer/client accounts.",
   :dcterms/issued #inst "2015-08-13T22:00:00.000-00:00",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-06-27T22:00:00.000-00:00",
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/MetadataFBCProductsAndServices/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-pas-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/MetadataFBCProductsAndServices/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-pas-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/MetadataFBCProductsAndServices/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Financial Business and Commerce(FBC) Products and Services Module"})

(def FBCProductsAndServicesModule
  "The products and services module extends the FND Products and Services module via ontologies defining financial products, financial services, financial service providers, and product catalogs as well as customer/client accounts."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :db/ident :fibo-fbc-pas-mod/FBCProductsAndServicesModule,
   :dcterms/abstract
   "The products and services module extends the FND Products and Services module via ontologies defining financial products, financial services, financial service providers, and product catalogs as well as customer/client accounts.",
   :dcterms/hasPart
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/"}],
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/title
   ["FIBO FBC Products and Services Module"
    "Financial Industry Business Ontology (FIBO) Financial Business and Commerce (FBC) Products and Services Module"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/MetadataFBCProductsAndServices/",
   :rdfs/label "products and services module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})