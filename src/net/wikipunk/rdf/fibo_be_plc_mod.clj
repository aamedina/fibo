(ns net.wikipunk.rdf.fibo-be-plc-mod
  "The private limited companies module defines business entities that are hybrid in nature, having certain characteristics of both a corporation and a partnership or sole proprietorship."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/MetadataBEPrivateLimitedCompanies/PrivateLimitedCompaniesModule",
   :dcterms/abstract
   "The private limited companies module defines business entities that are hybrid in nature, having certain characteristics of both a corporation and a partnership or sole proprietorship.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/PrivateLimitedCompanies/MetadataBEPrivateLimitedCompanies/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-be-plc-mod"
    "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/MetadataBEPrivateLimitedCompanies/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/MetadataBEPrivateLimitedCompanies/",
   :rdfa/prefix "fibo-be-plc-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/MetadataBEPrivateLimitedCompanies/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Business Entities (BE) Private Limited Companies Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright ["Copyright (c) 2015-2018 Object Management Group, Inc."
                  "Copyright (c) 2015-2018 EDM Council, Inc."],
   :sm/fileAbbreviation "fibo-be-plc-mod",
   :sm/filename "MetadataBEPrivateLimitedCompanies.rdf"})

(def PrivateLimitedCompaniesModule
  "The private limited companies module defines business entities that are hybrid in nature, having certain characteristics of both a corporation and a partnership or sole proprietorship."
  {:db/ident :fibo-be-plc-mod/PrivateLimitedCompaniesModule,
   :dcterms/abstract
   "The private limited companies module defines business entities that are hybrid in nature, having certain characteristics of both a corporation and a partnership or sole proprietorship.",
   :dcterms/hasPart
   "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "Financial Industry Business Ontology (FIBO) Business Entities (BE) Private Limited Companies Module",
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/MetadataBEPrivateLimitedCompanies/",
   :rdfs/label "Private Limited Companies",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"],
   :sm/copyright ["Copyright (c) 2015-2018 EDM Council, Inc."
                  "Copyright (c) 2015-2018 Object Management Group, Inc."],
   :sm/moduleAbbreviation "fibo-be-plc"})