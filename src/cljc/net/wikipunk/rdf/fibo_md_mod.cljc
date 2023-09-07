(ns net.wikipunk.rdf.fibo-md-mod
  ^{:base "https://spec.edmcouncil.org/fibo/ontology/MD/MetadataMD/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "fibo-md-civx-mod"
     "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/MetadataMDCIVTemporal/",
     "fibo-md-dbtx-mod"
     "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/MetadataMDDebtTemporal/",
     "fibo-md-derx-mod"
     "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/MetadataMDDerivativesTemporal/",
     "fibo-md-mod" "https://spec.edmcouncil.org/fibo/ontology/MD/MetadataMD/",
     "fibo-md-temx-mod"
     "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/MetadataMDTemporalCore/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-md-mod",
    :source "https://spec.edmcouncil.org/fibo/ontology/MD/MetadataMD/MDDomain"}
  {:cmns-av/copyright "Copyright (c) 2018-2023 EDM Council, Inc.",
   :dcterms/abstract
   "The Market Data (MD) domain contains ontologies that represent temporally variant concepts for financial instruments, loans and funds. As such this domain covers the concepts represented in market data, such as prices, yields and analytics for debt and for pools of assets.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-03-31T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/TemporalCore/MetadataMDTemporalCore/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/DebtTemporal/MetadataMDDebtTemporal/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/CIVTemporal/MetadataMDCIVTemporal/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/DerivativesTemporal/MetadataMDDerivativesTemporal/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/MetadataMD/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Metadata for the EDMC-FIBO Market Data (MD) Domain",
   :xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/MD/MetadataMD/"})

(def MDDomain
  {:cmns-av/copyright "Copyright (c) 2018-2023 EDM Council, Inc.",
   :db/ident :fibo-md-mod/MDDomain,
   :dcterms/abstract
   "The Market Data (MD) domain contains ontologies that represent temporally variant concepts for financial instruments, loans and funds. As such this domain covers the concepts represented in market data, such as prices, yields and analytics for debt and for pools of assets.",
   :dcterms/hasPart #{:fibo-md-temx-mod/TemporalCoreModule
                      :fibo-md-derx-mod/DerivativesTemporalModule
                      :fibo-md-civx-mod/CIVTemporalModule
                      :fibo-md-dbtx-mod/DebtTemporalModule},
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-03-31T18:00:00.000-00:00",
   :dcterms/title
   "Financial Industry Business Ontology (FIBO) Market Data (MD) Domain",
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/MD/MetadataMD/"},
   :rdfs/label "market data domain",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:5f53bd2c-e664-5bf3-986c-99d34e33d32a
  {:cmns-av/copyright "Copyright (c) 2018-2023 EDM Council, Inc.",
   :dcterms/abstract
   "The Market Data (MD) domain contains ontologies that represent temporally variant concepts for financial instruments, loans and funds. As such this domain covers the concepts represented in market data, such as prices, yields and analytics for debt and for pools of assets.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-03-31T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/TemporalCore/MetadataMDTemporalCore/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/DebtTemporal/MetadataMDDebtTemporal/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/CIVTemporal/MetadataMDCIVTemporal/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/DerivativesTemporal/MetadataMDDerivativesTemporal/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/MetadataMD/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Metadata for the EDMC-FIBO Market Data (MD) Domain",
   :xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/MD/MetadataMD/"})