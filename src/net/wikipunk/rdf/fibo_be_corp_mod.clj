(ns net.wikipunk.rdf.fibo-be-corp-mod
  "The corporations module includes ontologies describing the essential features of companies incorporated through the issuance of shares."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/MetadataBECorporations/CorporationsModule",
   :dcterms/abstract
   "The corporations module includes ontologies describing the essential features of companies incorporated through the issuance of shares.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Corporations/MetadataBECorporations/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-be-corp-mod"
    "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/MetadataBECorporations/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/MetadataBECorporations/",
   :rdfa/prefix "fibo-be-corp-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/MetadataBECorporations/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Business Entities (BE) Corporations Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright ["Copyright (c) 2015-2018 Object Management Group, Inc."
                  "Copyright (c) 2015-2018 EDM Council, Inc."],
   :sm/fileAbbreviation "fibo-be-corp-mod",
   :sm/filename "MetadataBECorporations.rdf"})

(def CorporationsModule
  "The corporations module includes ontologies describing the essential features of companies incorporated through the issuance of shares."
  {:db/ident :fibo-be-corp-mod/CorporationsModule,
   :dcterms/abstract
   "The corporations module includes ontologies describing the essential features of companies incorporated through the issuance of shares.",
   :dcterms/hasPart
   "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "Financial Industry Business Ontology (FIBO) Business Entities (BE) Corporations Module",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/MetadataBECorporations/",
   :rdfs/label "Corporations",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"],
   :sm/copyright ["Copyright (c) 2015-2018 EDM Council, Inc."
                  "Copyright (c) 2015-2018 Object Management Group, Inc."],
   :sm/moduleAbbreviation "fibo-be-corp"})