(ns net.wikipunk.rdf.fibo-be-fct-mod
  "The functional entities module includes ontologies describing entities that are defined according to their function, as opposed to their form, such as businesses, service providers, and publishers."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 Object Management Group, Inc."
                       "Copyright (c) 2015-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/MetadataBEFunctionalEntities/FunctionalEntitiesModule",
   :dcterms/abstract
   "The functional entities module includes ontologies describing entities that are defined according to their function, as opposed to their form, such as businesses, service providers, and publishers.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-01-27T23:00:00.000-00:00",
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/MetadataBEFunctionalEntities/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-fct-mod"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/MetadataBEFunctionalEntities/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-fct-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/MetadataBEFunctionalEntities/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Business Entities (BE) Functional Entities Module"})

(def FunctionalEntitiesModule
  "The functional entities module includes ontologies describing entities that are defined according to their function, as opposed to their form, such as businesses, service providers, and publishers."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :db/ident :fibo-be-fct-mod/FunctionalEntitiesModule,
   :dcterms/abstract
   "The functional entities module includes ontologies describing entities that are defined according to their function, as opposed to their form, such as businesses, service providers, and publishers.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Business Entities (BE) Functional Entities Module"
    "FIBO BE Functional Entities Module"],
   :rdf/type [:owl/NamedIndividual :fibo-fnd-utl-av/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/MetadataBEFunctionalEntities/",
   :rdfs/label "functional entities module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})