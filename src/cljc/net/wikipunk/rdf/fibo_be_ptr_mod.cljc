(ns net.wikipunk.rdf.fibo-be-ptr-mod
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/Partnerships/MetadataBEPartnerships/PartnershipsModule",
   :dcterms/abstract
   "The partnerships module contains ontologies that define concepts relating to types of partnerships, including incorporated and non-incorporated organizations. Partnerships are defined without reference to jurisdiction-specific legal forms. The abstractions distinguish between types of partnerships and related formation characteristics, as well as kinds of partners and types of partnership equity.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-27T18:00:00.000-00:00",
   :namespaces
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
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/Partnerships/MetadataBEPartnerships/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-ptr-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/MetadataBEPartnerships/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Business Entities (BE) Partnerships Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/MetadataBEPartnerships/"})

(def PartnershipsModule
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :db/ident :fibo-be-ptr-mod/PartnershipsModule,
   :dcterms/abstract
   "The partnerships module contains ontologies that define concepts relating to types of partnerships, including incorporated and non-incorporated organizations. Partnerships are defined without reference to jurisdiction-specific legal forms. The abstractions distinguish between types of partnerships and related formation characteristics, as well as kinds of partners and types of partnership equity.",
   :dcterms/hasPart
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/"},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"Financial Industry Business Ontology (FIBO) Business Entities (BE) Partnerships Module"
     "FIBO BE Partnerships Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/MetadataBEPartnerships/"},
   :rdfs/label "partnerships module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:d7c1d7c6-ef87-50b6-a7c3-9a4ee3fc88ed
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "The partnerships module contains ontologies that define concepts relating to types of partnerships, including incorporated and non-incorporated organizations. Partnerships are defined without reference to jurisdiction-specific legal forms. The abstractions distinguish between types of partnerships and related formation characteristics, as well as kinds of partners and types of partnership equity.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-27T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/Partnerships/MetadataBEPartnerships/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata about the EDMC-FIBO Business Entities (BE) Partnerships Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/MetadataBEPartnerships/"})