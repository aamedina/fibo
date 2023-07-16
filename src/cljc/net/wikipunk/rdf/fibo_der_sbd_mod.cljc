(ns net.wikipunk.rdf.fibo-der-sbd-mod
  "The security-based derivatives module covers derivatives that have underlying securities, including those based on market indices or baskets securities."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 EDM Council, Inc."
                       "Copyright (c) 2018-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/MetadataDERSecurityBasedDerivatives/SecurityBasedDerivativesModule",
   :dcterms/abstract
   "The security-based derivatives module covers derivatives that have underlying securities, including those based on market indices or baskets securities.",
   :dcterms/issued #xsd/dateTime #inst "2018-03-31T18:00:00.000-04:00",
   :dcterms/license {:rdfa/uri "http://opensource.org/licenses/MIT"},
   :dcterms/modified #xsd/dateTime #inst "2023-02-03T18:00:00.000-05:00",
   :owl/imports
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/SecurityBasedDerivatives/MetadataDERSecurityBasedDerivatives/"},
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-der-sbd-mod"
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/MetadataDERSecurityBasedDerivatives/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-der-sbd-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/MetadataDERSecurityBasedDerivatives/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Derivatives (DER) Security-Based Derivatives Module"})

(def SecurityBasedDerivativesModule
  "The security-based derivatives module covers derivatives that have underlying securities, including those based on market indices or baskets securities."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 EDM Council, Inc."
                       "Copyright (c) 2018-2023 Object Management Group, Inc."],
   :db/ident :fibo-der-sbd-mod/SecurityBasedDerivativesModule,
   :dcterms/abstract
   "The security-based derivatives module covers derivatives that have underlying securities, including those based on market indices or baskets securities.",
   :dcterms/contributor
   ["Bloomberg LP"
    "Wells Fargo Bank, N.A."
    "Office of Financial Research (US Dept of the Treasury)"
    "John F. Tierney"
    "Tahoe Blue Ltd"
    "Credit Suisse"
    "Nordea Bank AB"
    "Mizuho Financial Group, Inc."
    "Deutsche Bank"
    "John F. Gemski"
    "Citigroup"
    "Commodities Futures Trading Commission (CFTC)"
    "Adaptive, Inc."
    "Thematix Partners LLC"
    "State Street Bank and Trust"
    "Quarule"
    "Federated Knowledge LLC"
    "Exprentis"
    "Working Ontologist"
    "agnos.ai"],
   :dcterms/hasPart
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"}],
   :dcterms/license {:rdfa/uri "http://opensource.org/licenses/MIT"},
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Derivatives (DER) Security-based Derivatives Module"
    "FIBO DER Security-based Derivatives Module"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/MetadataDERSecurityBasedDerivatives/"},
   :rdfs/label "security-based derivatives module",
   :rdfs/seeAlso {:rdfa/uri "https://spec.edmcouncil.org/fibo/"}})