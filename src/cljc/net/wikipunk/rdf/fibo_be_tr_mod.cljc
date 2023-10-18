(ns net.wikipunk.rdf.fibo-be-tr-mod
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/Trusts/MetadataBETrusts/TrustsModule",
   :dcterms/abstract
   "The trusts module defines types of trusts as formally constituted organizations with specific parties as set down in law for trusts (trustor, trustee and beneficiary), each of these being signatories to a trust agreement.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-27T18:00:00.000-00:00",
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-tr-mod"
    "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/MetadataBETrusts/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/Trusts/MetadataBETrusts/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-tr-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/MetadataBETrusts/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Business Entities (BE) Trusts Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/MetadataBETrusts/"})

(def TrustsModule
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :db/ident :fibo-be-tr-mod/TrustsModule,
   :dcterms/abstract
   "The trusts module defines types of trusts as formally constituted organizations with specific parties as set down in law for trusts (trustor, trustee and beneficiary), each of these being signatories to a trust agreement.",
   :dcterms/hasPart
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/"},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"FIBO BE Trusts Module"
     "Financial Industry Business Ontology (FIBO) Business Entities (BE) Trusts Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/MetadataBETrusts/"},
   :rdfs/label "trusts module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:855d38ec-8cea-5206-a275-f8f0f2dcde48
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "The trusts module defines types of trusts as formally constituted organizations with specific parties as set down in law for trusts (trustor, trustee and beneficiary), each of these being signatories to a trust agreement.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-27T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/Trusts/MetadataBETrusts/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata about the EDMC-FIBO Business Entities (BE) Trusts Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/MetadataBETrusts/"})