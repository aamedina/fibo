(ns net.wikipunk.rdf.fibo-der-rat-mod
  "The rate derivatives module defines derivatives that are based on numerical rates such as interest rates, indices and the like."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 EDM Council, Inc."
                       "Copyright (c) 2018-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/MetadataDERRateDerivatives/RateDerivativesModule",
   :dcterms/abstract
   "The rate derivatives module defines derivatives that are based on numerical rates such as interest rates, indices and the like.",
   :dcterms/issued #inst "2018-03-31T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-02-03T23:00:00.000-00:00",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/RateDerivatives/MetadataDERRateDerivatives/",
   :rdf/ns-prefix-map
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-der-rat-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/MetadataDERRateDerivatives/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Derivatives (DER) Rate Derivatives Module"})

(def RateDerivativesModule
  "This module defines derivatives that are based on numerical rates such as interest rates, indices and the like."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 Object Management Group, Inc."
                       "Copyright (c) 2018-2023 EDM Council, Inc."],
   :db/ident :fibo-der-rat-mod/RateDerivativesModule,
   :dcterms/abstract
   "This module defines derivatives that are based on numerical rates such as interest rates, indices and the like.",
   :dcterms/contributor
   ["Credit Suisse"
    "Tahoe Blue Ltd"
    "John F. Tierney"
    "Commodities Futures Trading Commission (CFTC)"
    "Bloomberg LP"
    "State Street Bank and Trust"
    "Deutsche Bank"
    "Working Ontologist"
    "Wells Fargo Bank, N.A."
    "Adaptive, Inc."
    "Federated Knowledge LLC"
    "Nordea Bank AB"
    "Exprentis"
    "John F. Gemski"
    "Office of Financial Research (US Dept of the Treasury)"
    "Thematix Partners LLC"
    "Mizuho Financial Group, Inc."
    "Quarule"
    "agnos.ai"
    "Citigroup"],
   :dcterms/hasPart
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/"}],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Derivatives (DER) Rate Derivatives Module"
    "FIBO DER Rate Derivatives Module"],
   :rdf/type [:owl/NamedIndividual :fibo-fnd-utl-av/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/MetadataDERRateDerivatives/",
   :rdfs/label "rate derivatives module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})