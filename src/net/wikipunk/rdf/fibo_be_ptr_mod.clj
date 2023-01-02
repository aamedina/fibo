(ns net.wikipunk.rdf.fibo-be-ptr-mod
  "The partnerships module contains ontologies that define concepts relating to types of partnerships, including incorporated and non-incorporated organizations. Partnerships are defined without reference to jurisdiction-specific legal forms. The abstractions distinguish between types of partnerships and related formation characteristics, as well as kinds of partners and types of partnership equity."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/MetadataBEPartnerships/PartnershipsModule",
   :dcterms/abstract
   "The partnerships module contains ontologies that define concepts relating to types of partnerships, including incorporated and non-incorporated organizations. Partnerships are defined without reference to jurisdiction-specific legal forms. The abstractions distinguish between types of partnerships and related formation characteristics, as well as kinds of partners and types of partnership equity.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Partnerships/MetadataBEPartnerships/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-be-ptr-mod"
    "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/MetadataBEPartnerships/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/MetadataBEPartnerships/",
   :rdfa/prefix "fibo-be-ptr-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/MetadataBEPartnerships/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Business Entities (BE) Partnerships Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright ["Copyright (c) 2015-2018 Object Management Group, Inc."
                  "Copyright (c) 2015-2018 EDM Council, Inc."],
   :sm/fileAbbreviation "fibo-be-ptr-mod",
   :sm/filename "MetadataBEPartnerships.rdf"})

(def PartnershipsModule
  "The partnerships module contains ontologies that define concepts relating to types of partnerships, including incorporated and non-incorporated organizations. Partnerships are defined without reference to jurisdiction-specific legal forms. The abstractions distinguish between types of partnerships and related formation characteristics, as well as kinds of partners and types of partnership equity."
  {:db/ident :fibo-be-ptr-mod/PartnershipsModule,
   :dcterms/abstract
   "The partnerships module contains ontologies that define concepts relating to types of partnerships, including incorporated and non-incorporated organizations. Partnerships are defined without reference to jurisdiction-specific legal forms. The abstractions distinguish between types of partnerships and related formation characteristics, as well as kinds of partners and types of partnership equity.",
   :dcterms/hasPart
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "Financial Industry Business Ontology (FIBO) Business Entities (BE) Partnerships Module",
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/MetadataBEPartnerships/",
   :rdfs/label "Partnerships",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/copyright ["Copyright (c) 2015-2018 Object Management Group, Inc."
                  "Copyright (c) 2015-2018 EDM Council, Inc."],
   :sm/moduleAbbreviation "fibo-be-ptr"})