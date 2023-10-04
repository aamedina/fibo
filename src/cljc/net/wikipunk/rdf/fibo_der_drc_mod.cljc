(ns net.wikipunk.rdf.fibo-der-drc-mod
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/MetadataDERDerivativesContracts/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-der-drc-mod"
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/MetadataDERDerivativesContracts/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-der-drc-mod",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/DerivativesContracts/MetadataDERDerivativesContracts/DerivativesContractsModule"}
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcterms/abstract
   "The derivatives contracts module includes the contractual components common to all derivatives or to entire classes of derivatives.",
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-04-14T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/DerivativesContracts/MetadataDERDerivativesContracts/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata about the EDMC-FIBO Derivatives (DER) Derivatives Contracts Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/MetadataDERDerivativesContracts/"})

(def DerivativesContractsModule
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :db/ident :fibo-der-drc-mod/DerivativesContractsModule,
   :dcterms/abstract
   "The derivatives contracts module includes the contractual components common to all derivatives or to entire classes of derivatives.",
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
      "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"}},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"Financial Industry Business Ontology (FIBO) Derivatives (DER) Derivatives Contracts Module"
     "FIBO DER Derivatives Contracts Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/MetadataDERDerivativesContracts/"},
   :rdfs/label "derivatives contracts module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:6e1d161e-5598-5a25-8db8-86be3bb6e4f9
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcterms/abstract
   "The derivatives contracts module includes the contractual components common to all derivatives or to entire classes of derivatives.",
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-04-14T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/DerivativesContracts/MetadataDERDerivativesContracts/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata about the EDMC-FIBO Derivatives (DER) Derivatives Contracts Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/MetadataDERDerivativesContracts/"})