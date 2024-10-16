(ns net.wikipunk.rdf.fibo-md-dbtx-mod
  {:cmns-av/copyright "Copyright (c) 2018-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/MD/DebtTemporal/MetadataMDDebtTemporal/DebtTemporalModule",
   :dcterms/abstract
   "This module covers time-dependent concepts related to debt instruments, such as pricing, yields and analytics.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-03-31T18:00:00.000-00:00",
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-md-dbtx-mod"
    "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/MetadataMDDebtTemporal/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/MD/DebtTemporal/MetadataMDDebtTemporal/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-md-dbtx-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/MetadataMDDebtTemporal/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Market Data (MD) DebtTemporal Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/MetadataMDDebtTemporal/"})

(def DebtTemporalModule
  {:cmns-av/copyright "Copyright (c) 2018-2023 EDM Council, Inc.",
   :db/ident :fibo-md-dbtx-mod/DebtTemporalModule,
   :dcterms/abstract
   "This module covers time-dependent concepts related to debt instruments, such as pricing, yields and analytics.",
   :dcterms/hasPart
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/"},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"Financial Industry Business Ontology (FIBO) Market Data (MD) Debt Temporal Module"
     "FIBO MD Debt Temporal Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/MetadataMDDebtTemporal/"},
   :rdfs/label "debt temporal module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:0cac9877-21cd-5dd3-a909-6ef283c8ee0f
  {:cmns-av/copyright "Copyright (c) 2018-2023 EDM Council, Inc.",
   :dcterms/abstract
   "This module covers time-dependent concepts related to debt instruments, such as pricing, yields and analytics.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-03-31T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/MD/DebtTemporal/MetadataMDDebtTemporal/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata for the EDMC-FIBO Market Data (MD) DebtTemporal Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/MetadataMDDebtTemporal/"})