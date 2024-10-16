(ns net.wikipunk.rdf.fibo-be-plc-mod
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/PrivateLimitedCompanies/MetadataBEPrivateLimitedCompanies/PrivateLimitedCompaniesModule",
   :dcterms/abstract
   "The private limited companies module defines business entities that are hybrid in nature, having certain characteristics of both a corporation and a partnership or sole proprietorship.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-27T18:00:00.000-00:00",
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-plc-mod"
    "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/MetadataBEPrivateLimitedCompanies/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/PrivateLimitedCompanies/MetadataBEPrivateLimitedCompanies/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-plc-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/MetadataBEPrivateLimitedCompanies/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Business Entities (BE) Private Limited Companies Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/MetadataBEPrivateLimitedCompanies/"})

(def PrivateLimitedCompaniesModule
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :db/ident :fibo-be-plc-mod/PrivateLimitedCompaniesModule,
   :dcterms/abstract
   "The private limited companies module defines business entities that are hybrid in nature, having certain characteristics of both a corporation and a partnership or sole proprietorship.",
   :dcterms/hasPart
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/"},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"FIBO BE Private Limited Companies Module"
     "Financial Industry Business Ontology (FIBO) Business Entities (BE) Private Limited Companies Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/MetadataBEPrivateLimitedCompanies/"},
   :rdfs/label "private limited companies module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:ab5cffae-4bd6-5e88-9146-098df057fff6
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "The private limited companies module defines business entities that are hybrid in nature, having certain characteristics of both a corporation and a partnership or sole proprietorship.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-27T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/PrivateLimitedCompanies/MetadataBEPrivateLimitedCompanies/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata about the EDMC-FIBO Business Entities (BE) Private Limited Companies Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/MetadataBEPrivateLimitedCompanies/"})