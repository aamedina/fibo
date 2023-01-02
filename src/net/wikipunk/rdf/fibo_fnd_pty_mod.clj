(ns net.wikipunk.rdf.fibo-fnd-pty-mod
  "This is the metadata ontology used to describe the Foundations Parties Module."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/MetadataFNDParties/PartiesModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Parties Module.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/MetadataFNDParties/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-pty-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/MetadataFNDParties/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/MetadataFNDParties/",
   :rdfa/prefix "fibo-fnd-pty-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/MetadataFNDParties/",
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Parties Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright ["Copyright (c) 2017-2018 EDM Council, Inc."
                  "Copyright (c) 2017-2018 Object Management Group, Inc."],
   :sm/fileAbbreviation "fibo-fnd-pty-mod",
   :sm/filename "MetadataFNDParties.rdf"})

(def PartiesModule
  "This module includes ontologies defining concepts that are highly contextual in nature, such as the meaning of a party in a role, an agent playing a role, and so on. Also covers independent roles themselves. The definitions for agents and parties in roles provide general, reusable patterns for talking about agents performing roles in specific contexts. For example the same person in the context of aviation could be a pilot, and in the context of family could be a mother. These pattern will be refined in other FIBO ontologies to define concepts such as issuer, counterparty, underwriter, etc."
  {:db/ident :fibo-fnd-pty-mod/PartiesModule,
   :dcterms/abstract
   "This module includes ontologies defining concepts that are highly contextual in nature, such as the meaning of a party in a role, an agent playing a role, and so on. Also covers independent roles themselves. \n\nThe definitions for agents and parties in roles provide general, reusable patterns for talking about agents performing roles in specific contexts. For example the same person in the context of aviation could be a pilot, and in the context of family could be a mother.  These pattern will be refined in other FIBO ontologies to define concepts such as issuer, counterparty, underwriter, etc.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "Financial Industry Business Ontology (FIBO) Foundations (FND) Parties Module",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/MetadataFNDParties/",
   :rdfs/label "Parties",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/copyright ["Copyright (c) 2017-2018 Object Management Group, Inc."
                  "Copyright (c) 2017-2018 EDM Council, Inc."],
   :sm/moduleAbbreviation "fibo-fnd-pty"})