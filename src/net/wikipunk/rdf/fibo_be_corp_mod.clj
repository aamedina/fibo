(ns net.wikipunk.rdf.fibo-be-corp-mod
  "The corporations module includes ontologies describing the essential features of companies incorporated through the issuance of shares."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/MetadataBECorporations/CorporationsModule",
   :dcterms/abstract
   "The corporations module includes ontologies describing the essential features of companies incorporated through the issuance of shares.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-01-24T23:00:00.000-00:00",
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Corporations/MetadataBECorporations/",
   :rdf/ns-prefix-map
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
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/MetadataBECorporations/",
   :rdfa/prefix "fibo-be-corp-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/MetadataBECorporations/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Business Entities (BE) Corporations Module"})

(def CorporationsModule
  "The corporations module includes ontologies describing the essential features of companies incorporated through the issuance of shares."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 Object Management Group, Inc."
                       "Copyright (c) 2015-2023 EDM Council, Inc."],
   :db/ident :fibo-be-corp-mod/CorporationsModule,
   :dcterms/abstract
   "The corporations module includes ontologies describing the essential features of companies incorporated through the issuance of shares.",
   :dcterms/hasPart
   "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   ["FIBO BE Corporations Module"
    "Financial Industry Business Ontology (FIBO) Business Entities (BE) Corporations Module"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/MetadataBECorporations/",
   :rdfs/label "corporations module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})