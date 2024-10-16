(ns net.wikipunk.rdf.fibo-der-sbd-mod
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/DER/SecurityBasedDerivatives/MetadataDERSecurityBasedDerivatives/SecurityBasedDerivativesModule",
   :dcterms/abstract
   "The security-based derivatives module covers derivatives that have underlying securities, including those based on market indices or baskets securities.",
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-03T18:00:00.000-00:00",
   :namespaces
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
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/DER/SecurityBasedDerivatives/MetadataDERSecurityBasedDerivatives/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-der-sbd-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/MetadataDERSecurityBasedDerivatives/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Derivatives (DER) Security-Based Derivatives Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/MetadataDERSecurityBasedDerivatives/"})

(def SecurityBasedDerivativesModule
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :db/ident :fibo-der-sbd-mod/SecurityBasedDerivativesModule,
   :dcterms/abstract
   "The security-based derivatives module covers derivatives that have underlying securities, including those based on market indices or baskets securities.",
   :dcterms/contributor
   #{"Citigroup" "Wells Fargo Bank, N.A." "John F. Gemski" "Adaptive, Inc."
     "Tahoe Blue Ltd" "Thematix Partners LLC" "agnos.ai" "Bloomberg LP"
     "Quarule" "Nordea Bank AB" "Mizuho Financial Group, Inc." "Credit Suisse"
     "State Street Bank and Trust" "Deutsche Bank" "Exprentis"
     "Working Ontologist" "John F. Tierney" "Federated Knowledge LLC"
     "Commodities Futures Trading Commission (CFTC)"
     "Office of Financial Research (US Dept of the Treasury)"},
   :dcterms/hasPart
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"}},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"FIBO DER Security-based Derivatives Module"
     "Financial Industry Business Ontology (FIBO) Derivatives (DER) Security-based Derivatives Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/MetadataDERSecurityBasedDerivatives/"},
   :rdfs/label "security-based derivatives module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:27babf9e-6901-55e8-8ef4-de31bfe155e9
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcterms/abstract
   "The security-based derivatives module covers derivatives that have underlying securities, including those based on market indices or baskets securities.",
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-03T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/DER/SecurityBasedDerivatives/MetadataDERSecurityBasedDerivatives/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata about the EDMC-FIBO Derivatives (DER) Security-Based Derivatives Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/MetadataDERSecurityBasedDerivatives/"})