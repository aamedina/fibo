(ns net.wikipunk.rdf.fibo-md-dbtx-mod
  "This module covers time-dependent concepts related to debt instruments, such as pricing, yields and analytics."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/MetadataMDDebtTemporal/DebtTemporalModule",
   :dcterms/abstract
   "This module covers time-dependent concepts related to debt instruments, such as pricing, yields and analytics.",
   :dcterms/issued #inst "2022-01-26T23:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/DebtTemporal/MetadataMDDebtTemporal/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-md-dbtx-mod"
    "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/MetadataMDDebtTemporal/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/MetadataMDDebtTemporal/",
   :rdfa/prefix "fibo-md-dbtx-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/MetadataMDDebtTemporal/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Market Data (MD) DebtTemporal Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright "Copyright (c) 2014-2022 EDM Council, Inc.",
   :sm/fileAbbreviation "fibo-md-dbtx-mod",
   :sm/filename "MetadataMDDebtTemporal.rdf"})

(def DebtTemporalModule
  "This module covers time-dependent concepts related to debt instruments, such as pricing, yields and analytics."
  {:db/ident :fibo-md-dbtx-mod/DebtTemporalModule,
   :dcterms/abstract
   "This module covers time-dependent concepts related to debt instruments, such as pricing, yields and analytics.",
   :dcterms/hasPart
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title "FIBO Market Data - Debt Temporal Terms Module",
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/MetadataMDDebtTemporal/",
   :rdfs/label "Debt Temporal",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"],
   :sm/copyright "Copyright (c) 2014-2022 EDM Council, Inc.",
   :sm/moduleAbbreviation "fibo-md-dbtx"})