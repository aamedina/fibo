(ns net.wikipunk.rdf.fibo-fnd-plc-mod
  "This is the metadata ontology used to describe the Foundations Places Module."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 Object Management Group, Inc."
                       "Copyright (c) 2017-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/MetadataFNDPlaces/PlacesModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Places Module.",
   :dcterms/issued #inst "2022-06-14T22:00:00.000-00:00",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-01-20T23:00:00.000-00:00",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/MetadataFNDPlaces/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-plc-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/MetadataFNDPlaces/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-plc-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/MetadataFNDPlaces/",
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Places Module"})

(def PlacesModule
  "This module includes ontologies defining concepts to do with real or virtual places and the addresses to such places."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 EDM Council, Inc."
                       "Copyright (c) 2017-2023 Object Management Group, Inc."],
   :db/ident :fibo-fnd-plc-mod/PlacesModule,
   :dcterms/abstract
   "This module includes ontologies defining concepts to do with real or virtual places and the addresses to such places.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/VirtualPlaces/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Facilities/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"],
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Foundations (FND) Places Module"
    "FIBO FND Places Module"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/MetadataFNDPlaces/",
   :rdfs/label "places module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})