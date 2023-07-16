(ns net.wikipunk.rdf.fibo-be-sps-mod
  "The sole proprietorships module includes ontologies describing business entities or financial ventures that are carried out by a single person who is directly responsible for all liabilities of that venture."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/MetadataBESoleProprietorships/SoleProprietorshipsModule",
   :dcterms/abstract
   "The sole proprietorships module includes ontologies describing business entities or financial ventures that are carried out by a single person who is directly responsible for all liabilities of that venture.",
   :dcterms/issued #xsd/dateTime #inst "2018-08-27T18:00:00.000-04:00",
   :dcterms/license {:rdfa/uri "http://opensource.org/licenses/MIT"},
   :dcterms/modified #xsd/dateTime #inst "2023-01-27T18:00:00.000-05:00",
   :owl/imports
   [{:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/SoleProprietorships/MetadataBESoleProprietorships/"},
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-sps-mod"
    "https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/MetadataBESoleProprietorships/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-sps-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/MetadataBESoleProprietorships/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Business Entities (BE) Sole Proprietorships Module"})

(def SoleProprietorshipsModule
  "The sole proprietorships module includes ontologies describing business entities or financial ventures that are carried out by a single person who is directly responsible for all liabilities of that venture."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :db/ident :fibo-be-sps-mod/SoleProprietorshipsModule,
   :dcterms/abstract
   "The sole proprietorships module includes ontologies describing business entities or financial ventures that are carried out by a single person who is directly responsible for all liabilities of that venture.",
   :dcterms/hasPart
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/SoleProprietorships/"},
   :dcterms/license {:rdfa/uri "http://opensource.org/licenses/MIT"},
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Business Entities (BE) Sole Proprietorships Module"
    "FIBO BE Sole Proprietorships Module"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/MetadataBESoleProprietorships/"},
   :rdfs/label "sole proprietorships module",
   :rdfs/seeAlso {:rdfa/uri "https://spec.edmcouncil.org/fibo/"}})