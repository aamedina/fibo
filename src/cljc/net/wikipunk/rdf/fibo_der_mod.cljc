(ns net.wikipunk.rdf.fibo-der-mod
  "The Derivatives (DER) Domain covers many of the concepts that are common to derivative instruments, including but not limited to options, futures, forwards, swaps, and a wide range of other derivatives. This ontology provides metadata about the Derivatives Domain and its contents."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 EDM Council, Inc."
                       "Copyright (c) 2018-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/DER/MetadataDER/DERDomain",
   :dcterms/abstract
   "The Derivatives (DER) Domain covers many of the concepts that are common to derivative instruments, including but not limited to options, futures, forwards, swaps, and a wide range of other derivatives. This ontology provides metadata about the Derivatives Domain and its contents.",
   :dcterms/issued #xsd/dateTime #inst "2018-03-31T18:00:00.000-04:00",
   :dcterms/license {:rdfa/uri "http://opensource.org/licenses/MIT"},
   :dcterms/modified #xsd/dateTime #inst "2023-02-03T18:00:00.000-05:00",
   :owl/imports
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/MetadataDERDerivativesContracts/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/RateDerivatives/MetadataDERRateDerivatives/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/CreditDerivatives/MetadataDERCreditDerivatives/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/SecurityBasedDerivatives/MetadataDERSecurityBasedDerivatives/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/MetadataDER/"},
   :rdf/ns-prefix-map
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-der-mod",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/DER/MetadataDER/",
   :rdfs/label "Metadata about the EDMC-FIBO Derivatives (DER) Domain"})

(def DERDomain
  "The Derivatives (DER) Domain covers many of the concepts that are common to derivative instruments, including but not limited to options, futures, forwards, swaps, and a wide range of other derivatives."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 EDM Council, Inc."
                       "Copyright (c) 2018-2023 Object Management Group, Inc."],
   :db/ident :fibo-der-mod/DERDomain,
   :dcterms/abstract
   "The Derivatives (DER) Domain covers many of the concepts that are common to derivative instruments, including but not limited to options, futures, forwards, swaps, and a wide range of other derivatives.",
   :dcterms/contributor
   ["Quarule"
    "John F. Gemski"
    "Thematix Partners LLC"
    "Tahoe Blue Ltd"
    "John F. Tierney"
    "Deutsche Bank"
    "agnos.ai"
    "Commodities Futures Trading Commission (CFTC)"
    "Working Ontologist"
    "Bloomberg LP"
    "Citigroup"
    "Wells Fargo Bank, N.A."
    "State Street Bank and Trust"
    "Credit Suisse"
    "Federated Knowledge LLC"
    "Office of Financial Research (US Dept of the Treasury)"
    "Mizuho Financial Group, Inc."
    "Nordea Bank AB"
    "Adaptive, Inc."
    "Exprentis"],
   :dcterms/creator
   {:rdfa/uri
    "https://wiki.edmcouncil.org/display/DER/FIBO+-+FCT+-+Derivatives+Home"},
   :dcterms/hasPart [:fibo-der-sbd-mod/SecurityBasedDerivativesModule
                     :fibo-der-drc-mod/DerivativesContractsModule
                     :fibo-der-cr-mod/CreditDerivativesModule
                     :fibo-der-rat-mod/RateDerivativesModule],
   :dcterms/issued #xsd/dateTime #inst "2018-03-31T18:00:00.000-04:00",
   :dcterms/license {:rdfa/uri "http://opensource.org/licenses/MIT"},
   :dcterms/modified #xsd/dateTime #inst "2023-02-03T18:00:00.000-05:00",
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Derivatives (DER) Domain"
    "FIBO DER Domain"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/DER/MetadataDER/"},
   :rdfs/label "derivatives domain",
   :rdfs/seeAlso {:rdfa/uri "https://www.edmcouncil.org/fibo/"}})