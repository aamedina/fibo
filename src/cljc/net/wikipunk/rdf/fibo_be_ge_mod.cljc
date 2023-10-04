(ns net.wikipunk.rdf.fibo-be-ge-mod
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/MetadataBEGovernmentEntities/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-be-ge-mod"
     "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/MetadataBEGovernmentEntities/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-be-ge-mod",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/GovernmentEntities/MetadataBEGovernmentEntities/GovernmentEntitiesModule"}
  {:cmns-av/copyright
   #{"Copyright (c) 2021-2023 EDM Council, Inc."
     "Copyright (c) 2021-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "The government entities module includes ontologies describing polities, government entities and their relations.",
   :dcterms/issued #inst "2021-06-28T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-27T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/GovernmentEntities/MetadataBEGovernmentEntities/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata about the EDMC-FIBO Business Entities (BE) Government Entities Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/MetadataBEGovernmentEntities/"})

(def GovernmentEntitiesModule
  {:cmns-av/copyright
   #{"Copyright (c) 2021-2023 EDM Council, Inc."
     "Copyright (c) 2021-2023 Object Management Group, Inc."},
   :db/ident :fibo-be-ge-mod/GovernmentEntitiesModule,
   :dcterms/abstract
   "The government entities module includes ontologies describing polities, government entities and their relations.",
   :dcterms/hasPart
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/MXGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/CentralAsiaGovernmentEntitiesAndJurisdictions/"}},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"FIBO BE Government Entities Module"
     "Financial Industry Business Ontology (FIBO) Business Entities (BE) Government Entities Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/MetadataBEGovernmentEntities/"},
   :rdfs/label "government entities module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:1a0ea18e-2b4a-53fe-be23-4f52cac28f39
  {:cmns-av/copyright
   #{"Copyright (c) 2021-2023 EDM Council, Inc."
     "Copyright (c) 2021-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "The government entities module includes ontologies describing polities, government entities and their relations.",
   :dcterms/issued #inst "2021-06-28T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-27T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/GovernmentEntities/MetadataBEGovernmentEntities/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata about the EDMC-FIBO Business Entities (BE) Government Entities Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/MetadataBEGovernmentEntities/"})