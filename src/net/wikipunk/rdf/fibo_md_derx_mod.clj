(ns net.wikipunk.rdf.fibo-md-derx-mod
  "This module covers time-dependent concepts related to derivative instruments, such as the various derivatives-related greeks and other analytics."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/MetadataMDDerivativesTemporal/DerivativesTemporalModule",
   :dcterms/abstract
   "This module covers time-dependent concepts related to derivative instruments, such as the various derivatives-related greeks and other analytics.",
   :dcterms/issued #inst "2020-04-07T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/DerivativesTemporal/MetadataMDDerivativesTemporal/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-md-derx-mod"
    "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/MetadataMDDerivativesTemporal/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/MetadataMDDerivativesTemporal/",
   :rdfa/prefix "fibo-md-derx-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/MetadataMDDerivativesTemporal/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Market Data (MD) DerivativesTemporal Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright "Copyright (c) 2014-2020 EDM Council, Inc.",
   :sm/fileAbbreviation "fibo-md-derx-mod",
   :sm/filename "MetadataMDDerivativesTemporal.rdf"})

(def DerivativesTemporalModule
  "This module covers time-dependent concepts related to derivative instruments, such as the various derivatives-related greeks and other analytics."
  {:db/ident :fibo-md-derx-mod/DerivativesTemporalModule,
   :dcterms/abstract
   "This module covers time-dependent concepts related to derivative instruments, such as the various derivatives-related greeks and other analytics.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/"
    "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/FuturesTemporal/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title "FIBO Market Data - Derivatives Temporal Terms Module",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/MetadataMDDerivativesTemporal/",
   :rdfs/label "Derivatives Temporal",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"],
   :sm/copyright "Copyright (c) 2014-2020 EDM Council, Inc.",
   :sm/moduleAbbreviation "fibo-md-derx"})