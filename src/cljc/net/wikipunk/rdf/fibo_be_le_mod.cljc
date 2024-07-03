(ns net.wikipunk.rdf.fibo-be-le-mod
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/MetadataBELegalEntities/LegalEntitiesModule",
   :dcterms/abstract
   "The legal entities module contains ontologies which define the basis for legal personhood and business entities generally. This includes (1) definitions that distinguish between judicial and natural person, (2) definitions of formally constituted organizations, their members and high-level subdivisions, and identification and classification schemes, (3) definitions of corporate entities and the ways in which they may be incorporated, and (4) definitions required for implementation and use of the ISO 17442 Legal Entity Identifier (LEI) standard, including concepts for contractually capable and legal entities that reuse properties defined elsewhere in FIBO FND and BE.",
   :dcterms/issued #inst "2015-01-25T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-27T18:00:00.000-00:00",
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-mod"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/MetadataBELegalEntities/",
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
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/MetadataBELegalEntities/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-le-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/MetadataBELegalEntities/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Business Entities (BE) Legal Entities Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/MetadataBELegalEntities/"})

(def LegalEntitiesModule
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :db/ident :fibo-be-le-mod/LegalEntitiesModule,
   :dcterms/abstract
   "The legal entities module contains ontologies which define the basis for legal personhood and business entities generally. This includes (1) definitions that distinguish between judicial and natural person, (2) definitions of formally constituted organizations, their members and high-level subdivisions, and identification and classification schemes, (3) definitions of corporate entities and the ways in which they may be incorporated, and (4) definitions required for implementation and use of the ISO 17442 Legal Entity Identifier (LEI) standard.",
   :dcterms/hasPart
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/"}},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"Financial Industry Business Ontology (FIBO) Business Entities (BE) Legal Entities Module"
     "FIBO BE Legal Entities Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/MetadataBELegalEntities/"},
   :rdfs/label "legal entities module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:c0ec1777-85de-56df-9dc1-07f1624654e9
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "The legal entities module contains ontologies which define the basis for legal personhood and business entities generally. This includes (1) definitions that distinguish between judicial and natural person, (2) definitions of formally constituted organizations, their members and high-level subdivisions, and identification and classification schemes, (3) definitions of corporate entities and the ways in which they may be incorporated, and (4) definitions required for implementation and use of the ISO 17442 Legal Entity Identifier (LEI) standard, including concepts for contractually capable and legal entities that reuse properties defined elsewhere in FIBO FND and BE.",
   :dcterms/issued #inst "2015-01-25T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-27T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/MetadataBELegalEntities/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata about the EDMC-FIBO Business Entities (BE) Legal Entities Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/MetadataBELegalEntities/"})