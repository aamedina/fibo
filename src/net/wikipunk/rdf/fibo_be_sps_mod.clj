(ns net.wikipunk.rdf.fibo-be-sps-mod
  "The sole proprietorships module includes ontologies describing business entities or financial ventures that are carried out by a single person who is directly responsible for all liabilities of that venture."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/MetadataBESoleProprietorships/SoleProprietorshipsModule",
   :dcterms/abstract
   "The sole proprietorships module includes ontologies describing business entities or financial ventures that are carried out by a single person who is directly responsible for all liabilities of that venture.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-01-27T23:00:00.000-00:00",
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/SoleProprietorships/MetadataBESoleProprietorships/",
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
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/MetadataBESoleProprietorships/",
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
   "https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/SoleProprietorships/",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Business Entities (BE) Sole Proprietorships Module"
    "FIBO BE Sole Proprietorships Module"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/MetadataBESoleProprietorships/",
   :rdfs/label "sole proprietorships module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})