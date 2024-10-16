(ns net.wikipunk.rdf.fibo-fnd-utl-mod
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/MetadataFNDUtilities/UtilitiesModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Utilities Module.",
   :dcterms/issued #inst "2020-08-28T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-06T18:00:00.000-00:00",
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-fnd-utl-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/MetadataFNDUtilities/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/MetadataFNDUtilities/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-utl-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/MetadataFNDUtilities/",
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Utilities Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/MetadataFNDUtilities/"})

(def UtilitiesModule
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :db/ident :fibo-fnd-utl-mod/UtilitiesModule,
   :dcterms/abstract
   "The utilities module includes ontologies that provide metadata and other basic concepts to be used in other ontologies.",
   :dcterms/hasPart
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/"}},
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"Financial Industry Business Ontology (FIBO) Foundations (FND) Utilities Module"
     "FIBO FND Utilities Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/MetadataFNDUtilities/"},
   :rdfs/label "utilities module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:c93a8c14-20ad-5693-8ecf-5e00827cf71e
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Utilities Module.",
   :dcterms/issued #inst "2020-08-28T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-06T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/MetadataFNDUtilities/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Utilities Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/MetadataFNDUtilities/"})