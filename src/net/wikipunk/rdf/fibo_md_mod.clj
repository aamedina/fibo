(ns net.wikipunk.rdf.fibo-md-mod
  "The Market Data (MD) domain contains ontologies that represent temporally variant concepts for financial instruments, loans and funds. As such this domain covers the concepts represented in market data, such as prices, yields and analytics for debt and for pools of assets."
  {:cmns-av/copyright "Copyright (c) 2018-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/MD/MetadataMD/MDDomain",
   :dcterms/abstract
   "The Market Data (MD) domain contains ontologies that represent temporally variant concepts for financial instruments, loans and funds. As such this domain covers the concepts represented in market data, such as prices, yields and analytics for debt and for pools of assets.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-02-13T23:00:00.000-00:00",
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/TemporalCore/MetadataMDTemporalCore/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/CIVTemporal/MetadataMDCIVTemporal/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/DerivativesTemporal/MetadataMDDerivativesTemporal/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/DebtTemporal/MetadataMDDebtTemporal/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/MetadataMD/",
   :rdf/ns-prefix-map
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-md-mod",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/MD/MetadataMD/",
   :rdfs/label "Metadata for the EDMC-FIBO Market Data (MD) Domain"})

(def MDDomain
  "The Market Data (MD) domain contains ontologies that represent temporally variant concepts for financial instruments, loans and funds. As such this domain covers the concepts represented in market data, such as prices, yields and analytics for debt and for pools of assets."
  {:cmns-av/copyright "Copyright (c) 2018-2023 EDM Council, Inc.",
   :db/ident :fibo-md-mod/MDDomain,
   :dcterms/abstract
   "The Market Data (MD) domain contains ontologies that represent temporally variant concepts for financial instruments, loans and funds. As such this domain covers the concepts represented in market data, such as prices, yields and analytics for debt and for pools of assets.",
   :dcterms/hasPart [:fibo-md-temx-mod/TemporalCoreModule
                     :fibo-md-dbtx-mod/DebtTemporalModule
                     :fibo-md-civx-mod/CIVTemporalModule
                     :fibo-md-derx-mod/DerivativesTemporalModule],
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-02-13T23:00:00.000-00:00",
   :dcterms/title
   "Financial Industry Business Ontology (FIBO) Market Data (MD) Domain",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-utl-av/Module],
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/fibo/ontology/MD/MetadataMD/",
   :rdfs/label "Market Data Domain",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})