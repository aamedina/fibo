(ns net.wikipunk.rdf.fibo-be-ptr-mod
  "The partnerships module contains ontologies that define concepts relating to types of partnerships, including incorporated and non-incorporated organizations. Partnerships are defined without reference to jurisdiction-specific legal forms. The abstractions distinguish between types of partnerships and related formation characteristics, as well as kinds of partners and types of partnership equity."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/MetadataBEPartnerships/PartnershipsModule",
   :dcterms/abstract
   "The partnerships module contains ontologies that define concepts relating to types of partnerships, including incorporated and non-incorporated organizations. Partnerships are defined without reference to jurisdiction-specific legal forms. The abstractions distinguish between types of partnerships and related formation characteristics, as well as kinds of partners and types of partnership equity.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-01-27T23:00:00.000-00:00",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Partnerships/MetadataBEPartnerships/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-ptr-mod"
    "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/MetadataBEPartnerships/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/MetadataBEPartnerships/",
   :rdfa/prefix "fibo-be-ptr-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/MetadataBEPartnerships/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Business Entities (BE) Partnerships Module"})

(def PartnershipsModule
  "The partnerships module contains ontologies that define concepts relating to types of partnerships, including incorporated and non-incorporated organizations. Partnerships are defined without reference to jurisdiction-specific legal forms. The abstractions distinguish between types of partnerships and related formation characteristics, as well as kinds of partners and types of partnership equity."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 Object Management Group, Inc."
                       "Copyright (c) 2015-2023 EDM Council, Inc."],
   :db/ident :fibo-be-ptr-mod/PartnershipsModule,
   :dcterms/abstract
   "The partnerships module contains ontologies that define concepts relating to types of partnerships, including incorporated and non-incorporated organizations. Partnerships are defined without reference to jurisdiction-specific legal forms. The abstractions distinguish between types of partnerships and related formation characteristics, as well as kinds of partners and types of partnership equity.",
   :dcterms/hasPart
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   ["FIBO BE Partnerships Module"
    "Financial Industry Business Ontology (FIBO) Business Entities (BE) Partnerships Module"],
   :rdf/type [:owl/NamedIndividual :fibo-fnd-utl-av/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/MetadataBEPartnerships/",
   :rdfs/label "partnerships module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})