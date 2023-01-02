(ns net.wikipunk.rdf.fibo-md-mod
  "The Market Data (MD) domain contains ontologies that represent temporally variant concepts for financial instruments, loans and funds. As such this domain covers the concepts represented in market data, such as prices, yields and analytics for debt and for pools of assets."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/MD/MetadataMD/MDDomain",
   :dcterms/abstract
   "The Market Data (MD) domain contains ontologies that represent temporally variant concepts for financial instruments, loans and funds. As such this domain covers the concepts represented in market data, such as prices, yields and analytics for debt and for pools of assets.",
   :dcterms/issued #inst "2020-12-28T23:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/TemporalCore/MetadataMDTemporalCore/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/CIVTemporal/MetadataMDCIVTemporal/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/DerivativesTemporal/MetadataMDDerivativesTemporal/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/DebtTemporal/MetadataMDDebtTemporal/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/MetadataMD/",
   :rdf/ns-prefix-map
   {"dcterms"     "http://purl.org/dc/terms/",
    "fibo-md-civx-mod"
    "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/MetadataMDCIVTemporal/",
    "fibo-md-dbtx-mod"
    "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/MetadataMDDebtTemporal/",
    "fibo-md-derx-mod"
    "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/MetadataMDDerivativesTemporal/",
    "fibo-md-mod" "https://spec.edmcouncil.org/fibo/ontology/MD/MetadataMD/",
    "fibo-md-temx-mod"
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/MetadataMDTemporalCore/",
    "owl"         "http://www.w3.org/2002/07/owl#",
    "rdf"         "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"        "http://www.w3.org/2000/01/rdf-schema#",
    "sm"          "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"         "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://spec.edmcouncil.org/fibo/ontology/MD/MetadataMD/",
   :rdfa/prefix "fibo-md-mod",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/MD/MetadataMD/",
   :rdfs/label "Metadata for the EDMC-FIBO Market Data (MD) Domain",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference",
   :sm/copyright "Copyright (c) 2014-2020 EDM Council, Inc.",
   :sm/fileAbbreviation "fibo-md-mod",
   :sm/filename "MetadataMD.rdf"})

(def MDDomain
  "The Market Data (MD) domain contains ontologies that represent temporally variant concepts for financial instruments, loans and funds. As such this domain covers the concepts represented in market data, such as prices, yields and analytics for debt and for pools of assets."
  {:db/ident :fibo-md-mod/MDDomain,
   :dcterms/abstract
   "The Market Data (MD) domain contains ontologies that represent temporally variant concepts for financial instruments, loans and funds. As such this domain covers the concepts represented in market data, such as prices, yields and analytics for debt and for pools of assets.",
   :dcterms/hasPart [:fibo-md-temx-mod/TemporalCoreModule
                     :fibo-md-dbtx-mod/DebtTemporalModule
                     :fibo-md-civx-mod/CIVTemporalModule
                     :fibo-md-derx-mod/DerivativesTemporalModule],
   :dcterms/issued #inst "2020-12-28T23:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "EDMC Financial Industry Business Ontology (FIBO) Market Data (MD) Domain",
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/fibo/ontology/MD/MetadataMD/",
   :rdfs/label "Market Data Domain",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/copyright "Copyright (c) 2013-2020 EDM Council, Inc.",
   :sm/dependsOn [:fibo-sec-mod/SECDomain
                  :fibo-loan-mod/LOANDomain
                  :fibo-fnd-mod/FNDDomain
                  "http://www.omg.org/techprocess/ab/SpecificationMetadata/"
                  :fibo-fbc-mod/FBCDomain
                  :fibo-der-mod/DERDomain
                  :fibo-ind-mod/INDDomain
                  :fibo-bp-mod/BPDomain
                  :fibo-be-mod/BEDomain],
   :sm/keyword "market data",
   :sm/moduleAbbreviation "fibo-md"})