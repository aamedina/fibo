(ns net.wikipunk.rdf.fibo-der-drc-mod
  "The derivatives contracts module includes the contractual components common to all derivatives or to entire classes of derivatives."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 Object Management Group, Inc."
                       "Copyright (c) 2018-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/MetadataDERDerivativesContracts/DerivativesContractsModule",
   :dcterms/abstract
   "The derivatives contracts module includes the contractual components common to all derivatives or to entire classes of derivatives.",
   :dcterms/issued #inst "2018-03-31T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-04-14T22:00:00.000-00:00",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/MetadataDERDerivativesContracts/",
   :rdf/ns-prefix-map
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-der-drc-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/MetadataDERDerivativesContracts/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Derivatives (DER) Derivatives Contracts Module"})

(def DerivativesContractsModule
  "The derivatives contracts module includes the contractual components common to all derivatives or to entire classes of derivatives."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 Object Management Group, Inc."
                       "Copyright (c) 2018-2023 EDM Council, Inc."],
   :db/ident :fibo-der-drc-mod/DerivativesContractsModule,
   :dcterms/abstract
   "The derivatives contracts module includes the contractual components common to all derivatives or to entire classes of derivatives.",
   :dcterms/contributor
   ["Wells Fargo Bank, N.A."
    "Federated Knowledge LLC"
    "Credit Suisse"
    "agnos.ai"
    "Office of Financial Research (US Dept of the Treasury)"
    "Tahoe Blue Ltd"
    "Quarule"
    "Thematix Partners LLC"
    "Citigroup"
    "Mizuho Financial Group, Inc."
    "Adaptive, Inc."
    "John F. Gemski"
    "Working Ontologist"
    "State Street Bank and Trust"
    "Deutsche Bank"
    "Bloomberg LP"
    "Exprentis"
    "Nordea Bank AB"
    "Commodities Futures Trading Commission (CFTC)"
    "John F. Tierney"],
   :dcterms/hasPart
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"}],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Derivatives (DER) Derivatives Contracts Module"
    "FIBO DER Derivatives Contracts Module"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/MetadataDERDerivativesContracts/",
   :rdfs/label "derivatives contracts module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})