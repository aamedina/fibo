(ns net.wikipunk.rdf.fibo-der-drc-mod
  "The derivatives contracts module includes the contractual components common to all derivatives or to entire classes of derivatives."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/MetadataDERDerivativesContracts/DerivativesContractsModule",
   :dcterms/abstract
   "The derivatives contracts module includes the contractual components common to all derivatives or to entire classes of derivatives.",
   :dcterms/issued #inst "2022-03-31T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "http://www.omg.org/techprocess/ab/SpecificationMetadata/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/MetadataDERDerivativesContracts/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-der-drc-mod"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/MetadataDERDerivativesContracts/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/MetadataDERDerivativesContracts/",
   :rdfa/prefix "fibo-der-drc-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/MetadataDERDerivativesContracts/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Derivatives (DER) Derivatives Contracts Module",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2018-2022 EDM Council, Inc."
                  "Copyright (c) 2018-2022 Object Management Group, Inc."],
   :sm/fileAbbreviation "fibo-der-drc-mod",
   :sm/filename "MetadataDERDerivativesContracts.rdf"})

(def DerivativesContractsModule
  "The derivatives contracts module includes the contractual components common to all derivatives or to entire classes of derivatives."
  {:db/ident :fibo-der-drc-mod/DerivativesContractsModule,
   :dcterms/abstract
   "The derivatives contracts module includes the contractual components common to all derivatives or to entire classes of derivatives.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "EDMC Financial Industry Business Ontology (FIBO) Derivatives (DER) Derivatives Contracts Module",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/MetadataDERDerivativesContracts/",
   :rdfs/label "Derivatives Contracts",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"],
   :sm/contributor ["Deutsche Bank"
                    "John F. Tierney"
                    "Bloomberg LP"
                    "State Street Bank and Trust"
                    "Tahoe Blue Ltd"
                    "Commodities Futures Trading Commission (CFTC)"
                    "Thematix Partners LLC"
                    "agnos.ai"
                    "Office of Financial Research (US Dept of the Treasury)"
                    "Nordea Bank AB"
                    "John F. Gemski"
                    "Quarule"
                    "Mizuho Financial Group, Inc."
                    "Citigroup"
                    "Wells Fargo Bank, N.A."
                    "Working Ontologist"
                    "Adaptive, Inc."],
   :sm/copyright ["Copyright (c) 2018-2022 EDM Council, Inc."
                  "Copyright (c) 2018-2022 Object Management Group, Inc."],
   :sm/moduleAbbreviation "fibo-der-drc"})