(ns net.wikipunk.rdf.fibo-cae-ce-mod
  "This module contains ontologies of general corporate events and securities-related actions."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 Object Management Group, Inc."
                       "Copyright (c) 2018-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/MetadataCAECorporateEvents/CorporateEventsModule",
   :dcterms/abstract
   "This module contains ontologies of general corporate events and securities-related actions.",
   :dcterms/issued #inst "2018-03-31T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-02-03T23:00:00.000-00:00",
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/CAE/CorporateEvents/MetadataCAECorporateEvents/",
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
   ["https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/"
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Corporate Actions and Events (CAE) Domain, Corporate Events Module"
    "FIBO CAE Corporate Events Module"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/MetadataCAECorporateEvents/",
   :rdfs/label "corporate events module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})