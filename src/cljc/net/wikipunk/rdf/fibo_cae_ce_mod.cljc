(ns net.wikipunk.rdf.fibo-cae-ce-mod
  "This module contains ontologies of general corporate events and securities-related actions."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 Object Management Group, Inc."
                       "Copyright (c) 2018-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/MetadataCAECorporateEvents/CorporateEventsModule",
   :dcterms/abstract
   "This module contains ontologies of general corporate events and securities-related actions.",
   :dcterms/issued #xsd/dateTime #inst "2018-03-31T18:00:00.000-04:00",
   :dcterms/license {:rdfa/uri "http://opensource.org/licenses/MIT"},
   :dcterms/modified #xsd/dateTime #inst "2023-02-03T18:00:00.000-05:00",
   :owl/imports
   [{:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/CAE/CorporateEvents/MetadataCAECorporateEvents/"},
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-cae-ce-mod"
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/MetadataCAECorporateEvents/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-cae-ce-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/MetadataCAECorporateEvents/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Corporate Actions and Events (CAE) Corporate Events Module"})

(def CorporateEventsModule
  "This module contains ontologies that define common, general corporate events and securities-related actions."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 Object Management Group, Inc."
                       "Copyright (c) 2018-2023 EDM Council, Inc."],
   :db/ident :fibo-cae-ce-mod/CorporateEventsModule,
   :dcterms/abstract
   "This module contains ontologies that define common, general corporate events and securities-related actions.",
   :dcterms/hasPart
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"}],
   :dcterms/license {:rdfa/uri "http://opensource.org/licenses/MIT"},
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Corporate Actions and Events (CAE) Domain, Corporate Events Module"
    "FIBO CAE Corporate Events Module"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/MetadataCAECorporateEvents/"},
   :rdfs/label "corporate events module",
   :rdfs/seeAlso {:rdfa/uri "https://spec.edmcouncil.org/fibo/"}})