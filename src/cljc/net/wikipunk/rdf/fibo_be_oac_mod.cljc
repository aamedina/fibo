(ns net.wikipunk.rdf.fibo-be-oac-mod
  "The ownership and control module contains ontologies that define various types and aspects of ownership and control as they apply among and between business entities. The ontologies in this module include the definition of types of party as defined in the roles of ownership and control along with the capacities which define those parties, and separately the relationships of ownership and control directly between organizations, which arise from the existence of those roles. Specific types of ownership and control relationships that are unique to incorporated companies are defined in addition to the more general terms to which these relate. Also included is an ontology of the types of control relationships that exist by virtue of the powers conferred upon corporate officers, board members and other executive roles."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 Object Management Group, Inc."
                       "Copyright (c) 2015-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/MetadataBEOwnershipAndControl/OwnershipAndControlModule",
   :dcterms/abstract
   "The ownership and control module contains ontologies that define various types and aspects of ownership and control as they apply among and between business entities. The ontologies in this module include the definition of types of party as defined in the roles of ownership and control along with the capacities which define those parties, and separately the relationships of ownership and control directly between organizations, which arise from the existence of those roles. Specific types of ownership and control relationships that are unique to incorporated companies are defined in addition to the more general terms to which these relate. Also included is an ontology of the types of control relationships that exist by virtue of the powers conferred upon corporate officers, board members and other executive roles.",
   :dcterms/issued #xsd/dateTime #inst "2018-08-27T18:00:00.000-04:00",
   :dcterms/license {:rdfa/uri "http://opensource.org/licenses/MIT"},
   :dcterms/modified #xsd/dateTime #inst "2023-01-27T18:00:00.000-05:00",
   :owl/imports
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/MetadataBEOwnershipAndControl/"},
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-oac-mod"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/MetadataBEOwnershipAndControl/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-oac-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/MetadataBEOwnershipAndControl/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Business Entities (BE) Ownership and Control Module"})

(def OwnershipAndControlModule
  "The ownership and control module contains ontologies that define various types and aspects of ownership and control as they apply among and between business entities. The ontologies in this module include the definition of types of party as defined in the roles of ownership and control along with the capacities which define those parties, and separately the relationships of ownership and control directly between organizations, which arise from the existence of those roles. Specific types of ownership and control relationships that are unique to incorporated companies are defined in addition to the more general terms to which these relate. Also included is an ontology of the types of control relationships that exist by virtue of the powers conferred upon corporate officers, board members and other executive roles."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 Object Management Group, Inc."
                       "Copyright (c) 2015-2023 EDM Council, Inc."],
   :db/ident :fibo-be-oac-mod/OwnershipAndControlModule,
   :dcterms/abstract
   "The ownership and control module contains ontologies that define various types and aspects of ownership and control as they apply among and between business entities. The ontologies in this module include the definition of types of party as defined in the roles of ownership and control along with the capacities which define those parties, and separately the relationships of ownership and control directly between organizations, which arise from the existence of those roles. Specific types of ownership and control relationships that are unique to incorporated companies are defined in addition to the more general terms to which these relate. Also included is an ontology of the types of control relationships that exist by virtue of the powers conferred upon corporate officers, board members and other executive roles.",
   :dcterms/hasPart
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership/"}],
   :dcterms/license {:rdfa/uri "http://opensource.org/licenses/MIT"},
   :dcterms/title
   ["FIBO BE Ownership and Control Module"
    "Financial Industry Business Ontology (FIBO) Business Entities (BE) Ownership and Control Module"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/MetadataBEOwnershipAndControl/"},
   :rdfs/label "ownership and control module",
   :rdfs/seeAlso {:rdfa/uri "https://spec.edmcouncil.org/fibo/"}})