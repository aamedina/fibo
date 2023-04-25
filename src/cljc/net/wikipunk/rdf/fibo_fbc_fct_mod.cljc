(ns net.wikipunk.rdf.fibo-fbc-fct-mod
  "The functional entities module includes ontologies that define business entities according to their function as opposed to their form. They include service providers such as financial institutions (e.g., banks, investment companies, and insurance companies), government regulatory and registration agencies, as well as entities described in terms of their function in some process, such as clearing houses."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/MetadataFBCFunctionalEntities/FunctionalEntitiesModule",
   :dcterms/abstract
   "The functional entities module includes ontologies that define business entities according to their function as opposed to their form. They include service providers such as financial institutions (e.g., banks, investment companies, and insurance companies), government regulatory and registration agencies, as well as entities described in terms of their function in some process, such as clearing houses.",
   :dcterms/issued #inst "2015-08-13T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-03-31T22:00:00.000-00:00",
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/MetadataFBCFunctionalEntities/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-fct-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/MetadataFBCFunctionalEntities/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-fct-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/MetadataFBCFunctionalEntities/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Financial Business and Commerce(FBC) Functional Entities Module"})

(def FunctionalEntitiesModule
  "The functional entities module includes ontologies that define business entities according to their function as opposed to their form. They include service providers such as financial institutions (e.g., banks, investment companies, and insurance companies), government regulatory and registration agencies, as well as entities described in terms of their function in some process, such as clearing houses."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 Object Management Group, Inc."
                       "Copyright (c) 2015-2023 EDM Council, Inc."],
   :db/ident :fibo-fbc-fct-mod/FunctionalEntitiesModule,
   :dcterms/abstract
   "The functional entities module includes ontologies that define business entities according to their function as opposed to their form. They include service providers such as financial institutions (e.g., banks, investment companies, and insurance companies), government regulatory and registration agencies, as well as entities described in terms of their function in some process, such as clearing houses.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/MarketsIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EUFinancialServicesEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCenters/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CAFinancialServicesEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   ["FIBO FBC Functional Entities Module"
    "Financial Industry Business Ontology (FIBO) Financial Business and Commerce (FBC) Functional Entities Module"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/MetadataFBCFunctionalEntities/",
   :rdfs/label "functional entities module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})