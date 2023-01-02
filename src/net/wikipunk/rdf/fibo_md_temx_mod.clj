(ns net.wikipunk.rdf.fibo-md-temx-mod
  "This module covers time-dependent concepts common to all instruments, funds and loans, such as pricing, yields and analytics."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/MetadataMDTemporalCore/TemporalCoreModule",
   :dcterms/abstract
   "This module covers time-dependent concepts common to all instruments, funds and loans, such as pricing, yields and analytics.",
   :dcterms/issued #inst "2020-04-07T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/TemporalCore/MetadataMDTemporalCore/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-md-temx-mod"
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/MetadataMDTemporalCore/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/MetadataMDTemporalCore/",
   :rdfa/prefix "fibo-md-temx-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/MetadataMDTemporalCore/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Market Data (MD) TemporalCore Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright "Copyright (c) 2014-2020 EDM Council, Inc.",
   :sm/fileAbbreviation "fibo-md-temx-mod",
   :sm/filename "MetadataMDTemporalCore.rdf"})

(def TemporalCoreModule
  "This module covers time-dependent concepts common to all instruments, funds and loans, such as pricing, yields and analytics."
  {:db/ident :fibo-md-temx-mod/TemporalCoreModule,
   :dcterms/abstract
   "This module covers time-dependent concepts common to all instruments, funds and loans, such as pricing, yields and analytics.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityCreditStatuses/"
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title "FIBO Market Data - Core Temporal Terms Module",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/MetadataMDTemporalCore/",
   :rdfs/label "Temporal Core",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/copyright "Copyright (c) 2014-2020 EDM Council, Inc.",
   :sm/moduleAbbreviation "fibo-md-temx"})