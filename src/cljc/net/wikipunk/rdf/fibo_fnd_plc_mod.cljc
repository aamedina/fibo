(ns net.wikipunk.rdf.fibo-fnd-plc-mod
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/MetadataFNDPlaces/PlacesModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Places Module.",
   :dcterms/issued #inst "2022-06-14T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-20T18:00:00.000-00:00",
   :namespaces
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
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/MetadataFNDPlaces/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-plc-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/MetadataFNDPlaces/",
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Places Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/MetadataFNDPlaces/"})

(def PlacesModule
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :db/ident :fibo-fnd-plc-mod/PlacesModule,
   :dcterms/abstract
   "This module includes ontologies defining concepts to do with real or virtual places and the addresses to such places.",
   :dcterms/hasPart
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FND/Places/VirtualPlaces/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Facilities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/"}},
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"Financial Industry Business Ontology (FIBO) Foundations (FND) Places Module"
     "FIBO FND Places Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/MetadataFNDPlaces/"},
   :rdfs/label "places module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:340a6638-8477-58ca-b1ee-f1c2876c345a
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Places Module.",
   :dcterms/issued #inst "2022-06-14T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-20T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/MetadataFNDPlaces/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Places Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/MetadataFNDPlaces/"})