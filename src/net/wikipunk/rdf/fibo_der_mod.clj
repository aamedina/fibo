(ns net.wikipunk.rdf.fibo-der-mod
  "The Derivatives (DER) Domain covers many of the concepts that are common to derivative instruments, including but not limited to options, futures, forwards, swaps, and a wide range of other derivatives. This ontology provides metadata about the Derivatives Domain and its contents."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/DER/MetadataDER/DERDomain",
   :dcterms/abstract
   "The Derivatives (DER) Domain covers many of the concepts that are common to derivative instruments, including but not limited to options, futures, forwards, swaps, and a wide range of other derivatives. This ontology provides metadata about the Derivatives Domain and its contents.",
   :dcterms/issued #inst "2021-09-30T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/MetadataDERDerivativesContracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/RateDerivatives/MetadataDERRateDerivatives/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/CreditDerivatives/MetadataDERCreditDerivatives/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/SecurityBasedDerivatives/MetadataDERSecurityBasedDerivatives/"
    "http://www.omg.org/techprocess/ab/SpecificationMetadata/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/MetadataDER/",
   :rdf/ns-prefix-map
   {"dcterms"      "http://purl.org/dc/terms/",
    "fibo-der-cr-mod"
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/MetadataDERCreditDerivatives/",
    "fibo-der-drc-mod"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/MetadataDERDerivativesContracts/",
    "fibo-der-mod" "https://spec.edmcouncil.org/fibo/ontology/DER/MetadataDER/",
    "fibo-der-rat-mod"
    "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/MetadataDERRateDerivatives/",
    "fibo-der-sbd-mod"
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/MetadataDERSecurityBasedDerivatives/",
    "owl"          "http://www.w3.org/2002/07/owl#",
    "rdf"          "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"         "http://www.w3.org/2000/01/rdf-schema#",
    "sm"           "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"          "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://spec.edmcouncil.org/fibo/ontology/DER/MetadataDER/",
   :rdfa/prefix "fibo-der-mod",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/DER/MetadataDER/",
   :rdfs/label "Metadata about the EDMC-FIBO Derivatives (DER) Domain",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2018-2021 Object Management Group, Inc."
                  "Copyright (c) 2018-2021 EDM Council, Inc."],
   :sm/dependsOn ["https://spec.edmcouncil.org/fibo/ontology/IND/"
                  "https://spec.edmcouncil.org/fibo/ontology/FBC/"
                  "http://www.omg.org/techprocess/ab/SpecificationMetadata/"
                  "https://www.omg.org/spec/LCC/"
                  "https://spec.edmcouncil.org/fibo/ontology/BE/"
                  "https://spec.edmcouncil.org/fibo/ontology/FND/"
                  "https://spec.edmcouncil.org/fibo/ontology/SEC/"],
   :sm/fileAbbreviation "fibo-der-mod",
   :sm/filename "MetadataDER.rdf"})

(def DERDomain
  "The Derivatives (DER) Domain covers many of the concepts that are common to derivative instruments, including but not limited to options, futures, forwards, swaps, and a wide range of other derivatives."
  {:db/ident :fibo-der-mod/DERDomain,
   :dcterms/abstract
   "The Derivatives (DER) Domain covers many of the concepts that are common to derivative instruments, including but not limited to options, futures, forwards, swaps, and a wide range of other derivatives.",
   :dcterms/creator
   "https://wiki.edmcouncil.org/display/DER/FIBO+-+FCT+-+Derivatives+Home",
   :dcterms/hasPart [:fibo-der-drc-mod/DerivativesContractsModule
                     :fibo-der-cr-mod/CreditDerivativesModule
                     :fibo-der-rat-mod/RateDerivativesModule
                     :fibo-der-sbd-mod/SecurityBasedDerivativesModule],
   :dcterms/issued #inst "2021-09-30T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "EDMC Financial Industry Business Ontology (FIBO) Derivatives (DER) Domain",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/MetadataDER/",
   :rdfs/label "Derivatives Domain",
   :rdfs/seeAlso "https://www.edmcouncil.org/fibo/",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/contributor ["Tahoe Blue Ltd"
                    "Mizuho Financial Group, Inc."
                    "Working Ontologist"
                    "Office of Financial Research (US Dept of the Treasury)"
                    "John F. Tierney"
                    "John F. Gemski"
                    "Thematix Partners LLC"
                    "Deutsche Bank"
                    "Bloomberg LP"
                    "agnos.ai"
                    "Adaptive, Inc."
                    "Wells Fargo Bank, N.A."
                    "Commodities Futures Trading Commission (CFTC)"
                    "Quarule"
                    "State Street Bank and Trust"
                    "Citigroup"
                    "Nordea Bank AB"],
   :sm/copyright ["Copyright (c) 2018-2021 EDM Council, Inc."
                  "Copyright (c) 2018-2021 Object Management Group, Inc."],
   :sm/dependsOn ["https://spec.edmcouncil.org/fibo/ontology/BE/"
                  "https://www.omg.org/spec/LCC/"
                  "http://www.omg.org/techprocess/ab/SpecificationMetadata/"
                  "https://spec.edmcouncil.org/fibo/ontology/FBC/"
                  "https://spec.edmcouncil.org/fibo/ontology/SEC/"
                  "https://spec.edmcouncil.org/fibo/ontology/IND/"
                  "https://spec.edmcouncil.org/fibo/ontology/FND/"],
   :sm/keyword "derivative instruments",
   :sm/moduleAbbreviation "fibo-der"})