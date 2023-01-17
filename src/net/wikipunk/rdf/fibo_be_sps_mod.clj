(ns net.wikipunk.rdf.fibo-be-sps-mod
  "The sole proprietorships module includes ontologies describing business entities or financial ventures that are carried out by a single person who is directly responsible for all liabilities of that venture."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/MetadataBESoleProprietorships/SoleProprietorshipsModule",
   :dcterms/abstract
   "The sole proprietorships module includes ontologies describing business entities or financial ventures that are carried out by a single person who is directly responsible for all liabilities of that venture.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/SoleProprietorships/MetadataBESoleProprietorships/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-be-sps-mod"
    "https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/MetadataBESoleProprietorships/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/MetadataBESoleProprietorships/",
   :rdfa/prefix "fibo-be-sps-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/MetadataBESoleProprietorships/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Business Entities (BE) Sole Proprietorships Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright ["Copyright (c) 2015-2018 Object Management Group, Inc."
                  "Copyright (c) 2015-2018 EDM Council, Inc."],
   :sm/fileAbbreviation "fibo-be-sps-mod",
   :sm/filename "MetadataBESoleProprietorships.rdf"})

(def SoleProprietorshipsModule
  "The sole proprietorships module includes ontologies describing business entities or financial ventures that are carried out by a single person who is directly responsible for all liabilities of that venture."
  {:db/ident :fibo-be-sps-mod/SoleProprietorshipsModule,
   :dcterms/abstract
   "The sole proprietorships module includes ontologies describing business entities or financial ventures that are carried out by a single person who is directly responsible for all liabilities of that venture.",
   :dcterms/hasPart
   "https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/SoleProprietorships/",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "Financial Industry Business Ontology (FIBO) Business Entities (BE) Sole Proprietorships Module",
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/MetadataBESoleProprietorships/",
   :rdfs/label "Sole Proprietorships",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"],
   :sm/copyright ["Copyright (c) 2015-2018 Object Management Group, Inc."
                  "Copyright (c) 2015-2018 EDM Council, Inc."],
   :sm/moduleAbbreviation "fibo-be-sps"})