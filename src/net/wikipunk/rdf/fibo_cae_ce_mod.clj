(ns net.wikipunk.rdf.fibo-cae-ce-mod
  "This module contains ontologies of general corporate events and securities-related actions."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/MetadataCAECorporateEvents/CorporateEventsModule",
   :dcterms/abstract
   "This module contains ontologies of general corporate events and securities-related actions.",
   :dcterms/issued #inst "2022-03-31T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/CAE/CorporateEvents/MetadataCAECorporateEvents/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-cae-ce-mod"
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/MetadataCAECorporateEvents/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/MetadataCAECorporateEvents/",
   :rdfa/prefix "fibo-cae-ce-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/MetadataCAECorporateEvents/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Corporate Actions and Events (CAE) Corporate Events Module",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright "Copyright (c) 2013-2022 EDM Council, Inc.",
   :sm/fileAbbreviation "fibo-cae-ce-mod",
   :sm/filename "MetadataCAECorporateEvents.rdf"})

(def CorporateEventsModule
  "This module contains ontologies that define common, general corporate events and securities-related actions."
  {:db/ident :fibo-cae-ce-mod/CorporateEventsModule,
   :dcterms/abstract
   "This module contains ontologies that define common, general corporate events and securities-related actions.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/"
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/MetadataCAECorporateEvents/",
   :rdfs/label "Corporate Events Module",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/copyright "Copyright (c) 2013-2022 EDM Council, Inc.",
   :sm/dependsOn ["https://spec.edmcouncil.org/fibo/ontology/BE/"
                  "https://www.omg.org/spec/LCC/"
                  "https://spec.edmcouncil.org/fibo/ontology/SEC/"
                  "https://spec.edmcouncil.org/fibo/ontology/FBC/"
                  "https://spec.edmcouncil.org/fibo/ontology/FND/"],
   :sm/moduleAbbreviation "fibo-cae-ce"})