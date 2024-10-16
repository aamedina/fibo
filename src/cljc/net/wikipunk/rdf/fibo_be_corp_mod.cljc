(ns net.wikipunk.rdf.fibo-be-corp-mod
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/Corporations/MetadataBECorporations/CorporationsModule",
   :dcterms/abstract
   "The corporations module includes ontologies describing the essential features of companies incorporated through the issuance of shares.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-24T18:00:00.000-00:00",
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-corp-mod"
    "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/MetadataBECorporations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
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
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/Corporations/MetadataBECorporations/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-corp-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/MetadataBECorporations/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Business Entities (BE) Corporations Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/MetadataBECorporations/"})

(def CorporationsModule
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :db/ident :fibo-be-corp-mod/CorporationsModule,
   :dcterms/abstract
   "The corporations module includes ontologies describing the essential features of companies incorporated through the issuance of shares.",
   :dcterms/hasPart
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/"},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"Financial Industry Business Ontology (FIBO) Business Entities (BE) Corporations Module"
     "FIBO BE Corporations Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/MetadataBECorporations/"},
   :rdfs/label "corporations module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:8fe8815c-eaa2-576c-b95f-a6f92da5f347
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "The corporations module includes ontologies describing the essential features of companies incorporated through the issuance of shares.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-24T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/Corporations/MetadataBECorporations/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata about the EDMC-FIBO Business Entities (BE) Corporations Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/MetadataBECorporations/"})