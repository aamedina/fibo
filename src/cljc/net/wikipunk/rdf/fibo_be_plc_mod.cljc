(ns net.wikipunk.rdf.fibo-be-plc-mod
  "The private limited companies module defines business entities that are hybrid in nature, having certain characteristics of both a corporation and a partnership or sole proprietorship."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 Object Management Group, Inc."
                       "Copyright (c) 2015-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/MetadataBEPrivateLimitedCompanies/PrivateLimitedCompaniesModule",
   :dcterms/abstract
   "The private limited companies module defines business entities that are hybrid in nature, having certain characteristics of both a corporation and a partnership or sole proprietorship.",
   :dcterms/issued #xsd/dateTime #inst "2018-08-27T18:00:00.000-04:00",
   :dcterms/license {:rdfa/uri "http://opensource.org/licenses/MIT"},
   :dcterms/modified #xsd/dateTime #inst "2023-01-27T18:00:00.000-05:00",
   :owl/imports
   [{:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/PrivateLimitedCompanies/MetadataBEPrivateLimitedCompanies/"},
   :rdf/ns-prefix-map
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-plc-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/MetadataBEPrivateLimitedCompanies/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Business Entities (BE) Private Limited Companies Module"})

(def PrivateLimitedCompaniesModule
  "The private limited companies module defines business entities that are hybrid in nature, having certain characteristics of both a corporation and a partnership or sole proprietorship."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :db/ident :fibo-be-plc-mod/PrivateLimitedCompaniesModule,
   :dcterms/abstract
   "The private limited companies module defines business entities that are hybrid in nature, having certain characteristics of both a corporation and a partnership or sole proprietorship.",
   :dcterms/hasPart
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/"},
   :dcterms/license {:rdfa/uri "http://opensource.org/licenses/MIT"},
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Business Entities (BE) Private Limited Companies Module"
    "FIBO BE Private Limited Companies Module"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/MetadataBEPrivateLimitedCompanies/"},
   :rdfs/label "private limited companies module",
   :rdfs/seeAlso {:rdfa/uri "https://spec.edmcouncil.org/fibo/"}})