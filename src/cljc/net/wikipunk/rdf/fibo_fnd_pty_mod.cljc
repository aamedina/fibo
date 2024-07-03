(ns net.wikipunk.rdf.fibo-fnd-pty-mod
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Parties/MetadataFNDParties/PartiesModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Parties Module.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-20T18:00:00.000-00:00",
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-pty-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/MetadataFNDParties/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Parties/MetadataFNDParties/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-pty-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/MetadataFNDParties/",
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Parties Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/MetadataFNDParties/"})

(def PartiesModule
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :db/ident :fibo-fnd-pty-mod/PartiesModule,
   :dcterms/abstract
   "This module includes ontologies defining concepts that are highly contextual in nature, such as the meaning of a party in a role, an agent playing a role, and so on. Also covers independent roles themselves. \n\nThe definitions for agents and parties in roles provide general, reusable patterns for talking about agents performing roles in specific contexts. For example the same person in the context of aviation could be a pilot, and in the context of family could be a mother. These pattern will be refined in other FIBO ontologies to define concepts such as issuer, counterparty, underwriter, etc.",
   :dcterms/hasPart
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"}},
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"FIBO FND Parties Module"
     "Financial Industry Business Ontology (FIBO) Foundations (FND) Parties Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/MetadataFNDParties/"},
   :rdfs/label "parties module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:7f8be49f-0c5a-5b61-bed9-10f74a96149f
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Parties Module.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-20T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Parties/MetadataFNDParties/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Parties Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/MetadataFNDParties/"})