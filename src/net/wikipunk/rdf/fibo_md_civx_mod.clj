(ns net.wikipunk.rdf.fibo-md-civx-mod
  "This module provides time-dependent concepts specific to funds and other collective investment vehicles."
  {:cmns-av/copyright "Copyright (c) 2018-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/MetadataMDCIVTemporal/CIVTemporalModule",
   :dcterms/abstract
   "This module provides time-dependent concepts specific to funds and other collective investment vehicles.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-02-13T23:00:00.000-00:00",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/CIVTemporal/MetadataMDCIVTemporal/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-md-civx-mod"
    "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/MetadataMDCIVTemporal/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-md-civx-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/MetadataMDCIVTemporal/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Market Data (MD) CIV Temporal Module"})

(def CIVTemporalModule
  "This module provides time-dependent concepts specific to funds and other collective investment vehicles."
  {:cmns-av/copyright "Copyright (c) 2018-2023 EDM Council, Inc.",
   :db/ident :fibo-md-civx-mod/CIVTemporalModule,
   :dcterms/abstract
   "This module provides time-dependent concepts specific to funds and other collective investment vehicles.",
   :dcterms/hasPart
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   ["FIBO MD Collective Investment Vehicles Temporal Module"
    "Financial Industry Business Ontology (FIBO) Market Data (MD) Collective Investment Vehicles Temporal Module"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/MetadataMDCIVTemporal/",
   :rdfs/label "CIV temporal module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})