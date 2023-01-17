(ns net.wikipunk.rdf.fibo-md-civx-mod
  "This module provides time-dependent concepts specific to funds and other collective investment vehicles."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/MetadataMDCIVTemporal/CIVTemporalModule",
   :dcterms/abstract
   "This module provides time-dependent concepts specific to funds and other collective investment vehicles.",
   :dcterms/issued #inst "2020-04-07T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/CIVTemporal/MetadataMDCIVTemporal/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-md-civx-mod"
    "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/MetadataMDCIVTemporal/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/MetadataMDCIVTemporal/",
   :rdfa/prefix "fibo-md-civx-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/MetadataMDCIVTemporal/",
   :rdfs/label "Metadata for the EDMC-FIBO Market Data (MD) CIVTemporal Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright "Copyright (c) 2014-2020 EDM Council, Inc.",
   :sm/fileAbbreviation "fibo-md-civx-mod",
   :sm/filename "MetadataMDCIVTemporal.rdf"})

(def CIVTemporalModule
  "This module provides time-dependent concepts specific to funds and other collective investment vehicles."
  {:db/ident :fibo-md-civx-mod/CIVTemporalModule,
   :dcterms/abstract
   "This module provides time-dependent concepts specific to funds and other collective investment vehicles.",
   :dcterms/hasPart
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "FIBO Market Data - Collective Investment Vehicles Temporal Terms Module",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/MetadataMDCIVTemporal/",
   :rdfs/label "CIV Temporal",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"],
   :sm/copyright "Copyright (c) 2014-2020 EDM Council, Inc.",
   :sm/moduleAbbreviation "fibo-md-civx"})