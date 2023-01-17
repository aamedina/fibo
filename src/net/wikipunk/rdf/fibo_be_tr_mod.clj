(ns net.wikipunk.rdf.fibo-be-tr-mod
  "The trusts module defines types of trusts as formally constituted organizations with specific parties as set down in law for trusts (trustor, trustee and beneficiary), each of these being signatories to a trust agreement."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/MetadataBETrusts/TrustsModule",
   :dcterms/abstract
   "The trusts module defines types of trusts as formally constituted organizations with specific parties as set down in law for trusts (trustor, trustee and beneficiary), each of these being signatories to a trust agreement.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Trusts/MetadataBETrusts/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-be-tr-mod"
    "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/MetadataBETrusts/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/MetadataBETrusts/",
   :rdfa/prefix "fibo-be-tr-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/MetadataBETrusts/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Business Entities (BE) Trusts Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright ["Copyright (c) 2015-2018 EDM Council, Inc."
                  "Copyright (c) 2015-2018 Object Management Group, Inc."],
   :sm/fileAbbreviation "fibo-be-tr-mod",
   :sm/filename "MetadataBETrusts.rdf"})

(def TrustsModule
  "The trusts module defines types of trusts as formally constituted organizations with specific parties as set down in law for trusts (trustor, trustee and beneficiary), each of these being signatories to a trust agreement."
  {:db/ident :fibo-be-tr-mod/TrustsModule,
   :dcterms/abstract
   "The trusts module defines types of trusts as formally constituted organizations with specific parties as set down in law for trusts (trustor, trustee and beneficiary), each of these being signatories to a trust agreement.",
   :dcterms/hasPart
   "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "Financial Industry Business Ontology (FIBO) Business Entities (BE) Trusts Module",
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/MetadataBETrusts/",
   :rdfs/label "Trusts",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"],
   :sm/copyright ["Copyright (c) 2015-2018 Object Management Group, Inc."
                  "Copyright (c) 2015-2018 EDM Council, Inc."],
   :sm/moduleAbbreviation "fibo-be-tr"})