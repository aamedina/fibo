(ns net.wikipunk.rdf.fibo-fnd-plc-mod
  "This is the metadata ontology used to describe the Foundations Places Module."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/MetadataFNDPlaces/PlacesModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Places Module.",
   :dcterms/issued #inst "2022-06-14T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/MetadataFNDPlaces/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-plc-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/MetadataFNDPlaces/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/MetadataFNDPlaces/",
   :rdfa/prefix "fibo-fnd-plc-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/MetadataFNDPlaces/",
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Places Module",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2017-2022 EDM Council, Inc."
                  "Copyright (c) 2017-2022 Object Management Group, Inc."],
   :sm/fileAbbreviation "fibo-fnd-plc-mod",
   :sm/filename "MetadataFNDPlaces.rdf"})

(def PlacesModule
  "This module includes ontologies defining concepts to do with real or virtual places and the addresses to such places."
  {:db/ident :fibo-fnd-plc-mod/PlacesModule,
   :dcterms/abstract
   "This module includes ontologies defining concepts to do with real or virtual places and the addresses to such places.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/VirtualPlaces/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Facilities/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "Financial Industry Business Ontology (FIBO) Foundations (FND) Places Module",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/MetadataFNDPlaces/",
   :rdfs/label "Places",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/copyright ["Copyright (c) 2017-2022 EDM Council, Inc."
                  "Copyright (c) 2017-2022 Object Management Group, Inc."],
   :sm/moduleAbbreviation "fibo-fnd-plc"})