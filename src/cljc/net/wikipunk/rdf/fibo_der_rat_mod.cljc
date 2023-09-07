(ns net.wikipunk.rdf.fibo-der-rat-mod
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/MetadataDERRateDerivatives/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-der-rat-mod"
     "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/MetadataDERRateDerivatives/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-der-rat-mod",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/MetadataDERRateDerivatives/RateDerivativesModule"}
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcterms/abstract
   "The rate derivatives module defines derivatives that are based on numerical rates such as interest rates, indices and the like.",
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-03T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/RateDerivatives/MetadataDERRateDerivatives/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata about the EDMC-FIBO Derivatives (DER) Rate Derivatives Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/MetadataDERRateDerivatives/"})

(def RateDerivativesModule
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :db/ident :fibo-der-rat-mod/RateDerivativesModule,
   :dcterms/abstract
   "This module defines derivatives that are based on numerical rates such as interest rates, indices and the like.",
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
      "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"}},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"Financial Industry Business Ontology (FIBO) Derivatives (DER) Rate Derivatives Module"
     "FIBO DER Rate Derivatives Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/MetadataDERRateDerivatives/"},
   :rdfs/label "rate derivatives module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:86ac91b3-9c55-546c-a8f2-56977a43af8b
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcterms/abstract
   "The rate derivatives module defines derivatives that are based on numerical rates such as interest rates, indices and the like.",
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-03T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/RateDerivatives/MetadataDERRateDerivatives/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata about the EDMC-FIBO Derivatives (DER) Rate Derivatives Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/MetadataDERRateDerivatives/"})