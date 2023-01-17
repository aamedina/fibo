(ns net.wikipunk.rdf.fibo-fbc-pas-mod
  "The FBC Products and Services module extends the FND Products and Services module via ontologies defining financial products, financial services, financial service providers, and product catalogs as well as customer/client accounts."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/MetadataFBCProductsAndServices/FBCProductsAndServicesModule",
   :dcterms/abstract
   "The FBC Products and Services module extends the FND Products and Services module via ontologies defining financial products, financial services, financial service providers, and product catalogs as well as customer/client accounts.",
   :dcterms/issued #inst "2022-08-13T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/MetadataFBCProductsAndServices/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-pas-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/MetadataFBCProductsAndServices/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/MetadataFBCProductsAndServices/",
   :rdfa/prefix "fibo-fbc-pas-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/MetadataFBCProductsAndServices/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Financial Business and Commerce(FBC) Products and Services Module",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2015-2022 Object Management Group, Inc."
                  "Copyright (c) 2015-2022 EDM Council, Inc."],
   :sm/fileAbbreviation "fibo-fbc-pas-mod",
   :sm/filename "MetadataFBCProductsAndServices.rdf"})

(def FBCProductsAndServicesModule
  "The products and services module extends the FND Products and Services module via ontologies defining financial products, financial services, financial service providers, and product catalogs as well as customer/client accounts."
  {:db/ident :fibo-fbc-pas-mod/FBCProductsAndServicesModule,
   :dcterms/abstract
   "The products and services module extends the FND Products and Services module via ontologies defining financial products, financial services, financial service providers, and product catalogs as well as customer/client accounts.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/MetadataFBCProductsAndServices/",
   :rdfs/label "FIBO FBC Products and Services Module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"],
   :sm/copyright ["Copyright (c) 2015-2022 EDM Council, Inc."
                  "Copyright (c) 2015-2022 Object Management Group, Inc."],
   :sm/moduleAbbreviation "FIBO-FBC-PAS"})