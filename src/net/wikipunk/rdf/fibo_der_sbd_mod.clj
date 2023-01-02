(ns net.wikipunk.rdf.fibo-der-sbd-mod
  "The security-based derivatives module covers derivatives that have underlying securities, including those based on market indices or baskets securities."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/MetadataDERSecurityBasedDerivatives/SecurityBasedDerivativesModule",
   :dcterms/abstract
   "The security-based derivatives module covers derivatives that have underlying securities, including those based on market indices or baskets securities.",
   :dcterms/issued #inst "2022-09-30T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "http://www.omg.org/techprocess/ab/SpecificationMetadata/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/SecurityBasedDerivatives/MetadataDERSecurityBasedDerivatives/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-der-sbd-mod"
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/MetadataDERSecurityBasedDerivatives/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/MetadataDERSecurityBasedDerivatives/",
   :rdfa/prefix "fibo-der-sbd-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/MetadataDERSecurityBasedDerivatives/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Derivatives (DER) Security-Based Derivatives Module",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright "Copyright (c) 2018-2022 EDM Council, Inc.",
   :sm/fileAbbreviation "fibo-der-sbd-mod",
   :sm/filename "MetadataDERSecurityBasedDerivatives.rdf"})

(def SecurityBasedDerivativesModule
  "The security-based derivatives module covers derivatives that have underlying securities, including those based on market indices or baskets securities."
  {:db/ident :fibo-der-sbd-mod/SecurityBasedDerivativesModule,
   :dcterms/abstract
   "The security-based derivatives module covers derivatives that have underlying securities, including those based on market indices or baskets securities.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/"
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "EDMC Financial Industry Business Ontology (FIBO) Derivatives (DER) Security-Based Derivatives Module",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/MetadataDERSecurityBasedDerivatives/",
   :rdfs/label "Security-Based Derivatives",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/copyright "Copyright (c) 2018-2022 EDM Council, Inc.",
   :sm/moduleAbbreviation "fibo-der-sbd"})