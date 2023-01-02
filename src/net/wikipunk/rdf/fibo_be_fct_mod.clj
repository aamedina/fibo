(ns net.wikipunk.rdf.fibo-be-fct-mod
  "The functional entities module includes ontologies describing entities that are defined according to their function, as opposed to their form, such as businesses, service providers, and publishers."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/MetadataBEFunctionalEntities/FunctionalEntitiesModule",
   :dcterms/abstract
   "The functional entities module includes ontologies describing entities that are defined according to their function, as opposed to their form, such as businesses, service providers, and publishers.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/MetadataBEFunctionalEntities/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-be-fct-mod"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/MetadataBEFunctionalEntities/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/MetadataBEFunctionalEntities/",
   :rdfa/prefix "fibo-be-fct-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/MetadataBEFunctionalEntities/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Business Entities (BE) Functional Entities Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright ["Copyright (c) 2015-2018 EDM Council, Inc."
                  "Copyright (c) 2015-2018 Object Management Group, Inc."],
   :sm/fileAbbreviation "fibo-be-fct-mod",
   :sm/filename "MetadataBEFunctionalEntities.rdf"})

(def FunctionalEntitiesModule
  "The functional entities module includes ontologies describing entities that are defined according to their function, as opposed to their form, such as businesses, service providers, and publishers."
  {:db/ident :fibo-be-fct-mod/FunctionalEntitiesModule,
   :dcterms/abstract
   "The functional entities module includes ontologies describing entities that are defined according to their function, as opposed to their form, such as businesses, service providers, and publishers.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "Financial Industry Business Ontology (FIBO) Business Entities (BE) Functional Entities Module",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/MetadataBEFunctionalEntities/",
   :rdfs/label "Functional Entities",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/copyright ["Copyright (c) 2015-2018 Object Management Group, Inc."
                  "Copyright (c) 2015-2018 EDM Council, Inc."],
   :sm/moduleAbbreviation "fibo-be-fct"})