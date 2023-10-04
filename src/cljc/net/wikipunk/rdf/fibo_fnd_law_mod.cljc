(ns net.wikipunk.rdf.fibo-fnd-law-mod
  ^{:base "https://spec.edmcouncil.org/fibo/ontology/FND/Law/MetadataFNDLaw/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-fnd-law-mod"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Law/MetadataFNDLaw/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-fnd-law-mod",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Law/MetadataFNDLaw/LawModule"}
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Law Module.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-20T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Law/MetadataFNDLaw/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Law Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Law/MetadataFNDLaw/"})

(def LawModule
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :db/ident :fibo-fnd-law-mod/LawModule,
   :dcterms/abstract
   "This module includes several ontologies defining legal concepts, including constitutions, laws and jurisdictions. It also includes the definition of legal capacities such as signatory capacity, contractual capability and the like.",
   :dcterms/hasPart
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCore/"}},
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"Financial Industry Business Ontology (FIBO) Foundations (FND) Law Module"
     "FIBO FND Law Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/MetadataFNDLaw/"},
   :rdfs/label "law module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:a51bbaf3-b3f0-5b38-995a-14a9a71970c6
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Law Module.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-20T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Law/MetadataFNDLaw/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Law Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Law/MetadataFNDLaw/"})