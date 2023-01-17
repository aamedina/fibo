(ns net.wikipunk.rdf.fibo-der-rat-mod
  "The rate derivatives module defines derivatives that are based on numerical rates such as interest rates, indices and the like."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/MetadataDERRateDerivatives/RateDerivativesModule",
   :dcterms/abstract
   "The rate derivatives module defines derivatives that are based on numerical rates such as interest rates, indices and the like.",
   :dcterms/issued #inst "2022-03-31T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["http://www.omg.org/techprocess/ab/SpecificationMetadata/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/RateDerivatives/MetadataDERRateDerivatives/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-der-rat-mod"
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/MetadataDERRateDerivatives/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/MetadataDERRateDerivatives/",
   :rdfa/prefix "fibo-der-rat-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/MetadataDERRateDerivatives/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Derivatives (DER) Rate Derivatives Module",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2018-2022 EDM Council, Inc."
                  "Copyright (c) 2018-2022 Object Management Group, Inc."],
   :sm/fileAbbreviation "fibo-der-rat-mod",
   :sm/filename "MetadataDERRateDerivatives.rdf"})

(def RateDerivativesModule
  "This module defines derivatives that are based on numerical rates such as interest rates, indices and the like."
  {:db/ident :fibo-der-rat-mod/RateDerivativesModule,
   :dcterms/abstract
   "This module defines derivatives that are based on numerical rates such as interest rates, indices and the like.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "EDMC Financial Industry Business Ontology (FIBO) Derivatives (DER) Rate Derivatives Module",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/MetadataDERRateDerivatives/",
   :rdfs/label "Rate Derivatives",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"],
   :sm/contributor ["Thematix Partners LLC"
                    "Nordea Bank AB"
                    "Quarule"
                    "Mizuho Financial Group, Inc."
                    "Tahoe Blue Ltd"
                    "John F. Gemski"
                    "Adaptive, Inc."
                    "Deutsche Bank"
                    "Federated Knowledge LLC"
                    "Wells Fargo Bank, N.A."
                    "John F. Tierney"
                    "Citigroup"
                    "State Street Bank and Trust"
                    "Working Ontologist"
                    "Office of Financial Research (US Dept of the Treasury)"
                    "Bloomberg LP"
                    "agnos.ai UK Ltd."
                    "Commodities Futures Trading Commission (CFTC)"],
   :sm/copyright ["Copyright (c) 2018-2022 Object Management Group, Inc."
                  "Copyright (c) 2018-2022 EDM Council, Inc."],
   :sm/moduleAbbreviation "fibo-der-rat"})