(ns net.wikipunk.rdf.fibo-be-tr-mod
  "The trusts module defines types of trusts as formally constituted organizations with specific parties as set down in law for trusts (trustor, trustee and beneficiary), each of these being signatories to a trust agreement."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/MetadataBETrusts/TrustsModule",
   :dcterms/abstract
   "The trusts module defines types of trusts as formally constituted organizations with specific parties as set down in law for trusts (trustor, trustee and beneficiary), each of these being signatories to a trust agreement.",
   :dcterms/issued #xsd/dateTime #inst "2018-08-27T18:00:00.000-04:00",
   :dcterms/license {:rdfa/uri "http://opensource.org/licenses/MIT"},
   :dcterms/modified #xsd/dateTime #inst "2023-01-27T18:00:00.000-05:00",
   :owl/imports
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Trusts/MetadataBETrusts/"},
   :rdf/ns-prefix-map
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-tr-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/MetadataBETrusts/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Business Entities (BE) Trusts Module"})

(def TrustsModule
  "The trusts module defines types of trusts as formally constituted organizations with specific parties as set down in law for trusts (trustor, trustee and beneficiary), each of these being signatories to a trust agreement."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :db/ident :fibo-be-tr-mod/TrustsModule,
   :dcterms/abstract
   "The trusts module defines types of trusts as formally constituted organizations with specific parties as set down in law for trusts (trustor, trustee and beneficiary), each of these being signatories to a trust agreement.",
   :dcterms/hasPart
   {:rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/"},
   :dcterms/license {:rdfa/uri "http://opensource.org/licenses/MIT"},
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Business Entities (BE) Trusts Module"
    "FIBO BE Trusts Module"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/MetadataBETrusts/"},
   :rdfs/label "trusts module",
   :rdfs/seeAlso {:rdfa/uri "https://spec.edmcouncil.org/fibo/"}})