(ns net.wikipunk.rdf.fibo-md-temx-mod
  "This module covers time-dependent concepts common to all instruments, funds and loans, such as pricing, yields and analytics."
  {:cmns-av/copyright "Copyright (c) 2018-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/MetadataMDTemporalCore/TemporalCoreModule",
   :dcterms/abstract
   "This module covers time-dependent concepts common to all instruments, funds and loans, such as pricing, yields and analytics.",
   :dcterms/issued #xsd/dateTime #inst "2018-08-27T18:00:00.000-04:00",
   :dcterms/license {:rdfa/uri "https://opensource.org/licenses/MIT"},
   :dcterms/modified #xsd/dateTime #inst "2023-03-31T18:00:00.000-04:00",
   :owl/imports
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/TemporalCore/MetadataMDTemporalCore/"},
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-md-temx-mod"
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/MetadataMDTemporalCore/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-md-temx-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/MetadataMDTemporalCore/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Market Data (MD) TemporalCore Module"})

(def TemporalCoreModule
  "This module covers time-dependent concepts common to all instruments, funds and loans, such as pricing, yields and analytics."
  {:cmns-av/copyright "Copyright (c) 2018-2023 EDM Council, Inc.",
   :db/ident :fibo-md-temx-mod/TemporalCoreModule,
   :dcterms/abstract
   "This module covers time-dependent concepts common to all instruments, funds and loans, such as pricing, yields and analytics.",
   :dcterms/hasPart
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityCreditStatuses/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/"}],
   :dcterms/license {:rdfa/uri "http://opensource.org/licenses/MIT"},
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Market Data (MD) Temporal Core Module"
    "FIBO MD Temporal Core Module"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/MetadataMDTemporalCore/"},
   :rdfs/label "temporal core module",
   :rdfs/seeAlso {:rdfa/uri "https://spec.edmcouncil.org/fibo/"}})