(ns net.wikipunk.rdf.fibo-md-derx-mod
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/MetadataMDDerivativesTemporal/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "fibo-md-derx-mod"
     "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/MetadataMDDerivativesTemporal/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-md-derx-mod",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/MD/DerivativesTemporal/MetadataMDDerivativesTemporal/DerivativesTemporalModule"}
  {:cmns-av/copyright "Copyright (c) 2018-2023 EDM Council, Inc.",
   :dcterms/abstract
   "This module covers time-dependent concepts related to derivative instruments, such as the various derivatives-related greeks and other analytics.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-03-31T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/MD/DerivativesTemporal/MetadataMDDerivativesTemporal/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata for the EDMC-FIBO Market Data (MD) DerivativesTemporal Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/MetadataMDDerivativesTemporal/"})

(def DerivativesTemporalModule
  {:cmns-av/copyright "Copyright (c) 2018-2023 EDM Council, Inc.",
   :db/ident :fibo-md-derx-mod/DerivativesTemporalModule,
   :dcterms/abstract
   "This module covers time-dependent concepts related to derivative instruments, such as the various derivatives-related greeks and other analytics.",
   :dcterms/hasPart
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/FuturesTemporal/"}},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"Financial Industry Business Ontology (FIBO) Market Data (MD) Derivatives Temporal Module"
     "FIBO MD Derivatives Temporal Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/MetadataMDDerivativesTemporal/"},
   :rdfs/label "derivatives temporal module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:7975eb64-6aab-5e64-8349-ab383219d3f0
  {:cmns-av/copyright "Copyright (c) 2018-2023 EDM Council, Inc.",
   :dcterms/abstract
   "This module covers time-dependent concepts related to derivative instruments, such as the various derivatives-related greeks and other analytics.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-03-31T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/MD/DerivativesTemporal/MetadataMDDerivativesTemporal/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata for the EDMC-FIBO Market Data (MD) DerivativesTemporal Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/MetadataMDDerivativesTemporal/"})