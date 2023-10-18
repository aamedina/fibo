(ns net.wikipunk.rdf.fibo-der-mod
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/MetadataDER/DERDomain",
   :dcterms/abstract
   "The Derivatives (DER) Domain covers many of the concepts that are common to derivative instruments, including but not limited to options, futures, forwards, swaps, and a wide range of other derivatives. This ontology provides metadata about the Derivatives Domain and its contents.",
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-03T18:00:00.000-00:00",
   :namespaces
   {"cmns-av"      "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms"      "http://purl.org/dc/terms/",
    "fibo-der-cr-mod"
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/MetadataDERCreditDerivatives/",
    "fibo-der-drc-mod"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/MetadataDERDerivativesContracts/",
    "fibo-der-mod" "https://spec.edmcouncil.org/fibo/ontology/DER/MetadataDER/",
    "fibo-der-rat-mod"
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/MetadataDERRateDerivatives/",
    "fibo-der-sbd-mod"
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/MetadataDERSecurityBasedDerivatives/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl"          "http://www.w3.org/2002/07/owl#",
    "rdf"          "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"         "http://www.w3.org/2000/01/rdf-schema#",
    "xsd"          "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/DerivativesContracts/MetadataDERDerivativesContracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/CreditDerivatives/MetadataDERCreditDerivatives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/RateDerivatives/MetadataDERRateDerivatives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/SecurityBasedDerivatives/MetadataDERSecurityBasedDerivatives/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/MetadataDER/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-der-mod",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/DER/MetadataDER/",
   :rdfs/label "Metadata about the EDMC-FIBO Derivatives (DER) Domain",
   :xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/DER/MetadataDER/"})

(def DERDomain
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :db/ident :fibo-der-mod/DERDomain,
   :dcterms/abstract
   "The Derivatives (DER) Domain covers many of the concepts that are common to derivative instruments, including but not limited to options, futures, forwards, swaps, and a wide range of other derivatives.",
   :dcterms/contributor
   #{"Citigroup" "Wells Fargo Bank, N.A." "John F. Gemski" "Adaptive, Inc."
     "Tahoe Blue Ltd" "Thematix Partners LLC" "agnos.ai" "Bloomberg LP"
     "Quarule" "Nordea Bank AB" "Mizuho Financial Group, Inc." "Credit Suisse"
     "State Street Bank and Trust" "Deutsche Bank" "Exprentis"
     "Working Ontologist" "John F. Tierney" "Federated Knowledge LLC"
     "Commodities Futures Trading Commission (CFTC)"
     "Office of Financial Research (US Dept of the Treasury)"},
   :dcterms/creator
   {:xsd/anyURI
    "https://wiki.edmcouncil.org/display/DER/FIBO+-+FCT+-+Derivatives+Home"},
   :dcterms/hasPart #{:fibo-der-sbd-mod/SecurityBasedDerivativesModule
                      :fibo-der-rat-mod/RateDerivativesModule
                      :fibo-der-cr-mod/CreditDerivativesModule
                      :fibo-der-drc-mod/DerivativesContractsModule},
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-03T18:00:00.000-00:00",
   :dcterms/title
   #{"Financial Industry Business Ontology (FIBO) Derivatives (DER) Domain"
     "FIBO DER Domain"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/DER/MetadataDER/"},
   :rdfs/label "derivatives domain",
   :rdfs/seeAlso {:xsd/anyURI "https://www.edmcouncil.org/fibo/"}})

(def urn:uuid:7c7d84fd-4109-59e2-90f3-c68dfb23104d
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcterms/abstract
   "The Derivatives (DER) Domain covers many of the concepts that are common to derivative instruments, including but not limited to options, futures, forwards, swaps, and a wide range of other derivatives. This ontology provides metadata about the Derivatives Domain and its contents.",
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-03T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/DerivativesContracts/MetadataDERDerivativesContracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/CreditDerivatives/MetadataDERCreditDerivatives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/RateDerivatives/MetadataDERRateDerivatives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/SecurityBasedDerivatives/MetadataDERSecurityBasedDerivatives/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/MetadataDER/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Metadata about the EDMC-FIBO Derivatives (DER) Domain",
   :xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/DER/MetadataDER/"})