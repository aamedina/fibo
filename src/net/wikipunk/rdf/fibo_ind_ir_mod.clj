(ns net.wikipunk.rdf.fibo-ind-ir-mod
  "This module includes ontologies defining concepts for reference interest rates, that is, rates of interest paid on capital by central banks, groups of banks and other lenders, including inter-bank lending rates and rates of certain representative debt instruments."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MetadataINDInterestRates/InterestRatesModule",
   :dcterms/abstract
   "This module includes ontologies defining concepts for reference interest rates, that is, rates of interest paid on capital by central banks, groups of banks and other lenders, including inter-bank lending rates and rates of certain representative debt instruments.",
   :dcterms/issued #inst "2020-02-24T23:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/InterestRates/MetadataINDInterestRates/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-ind-ir-mod"
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MetadataINDInterestRates/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MetadataINDInterestRates/",
   :rdfa/prefix "fibo-ind-ir-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MetadataINDInterestRates/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Indices and Indicators (IND) Interest Rates Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright ["Copyright (c) 2015-2020 EDM Council, Inc."
                  "Copyright (c) 2015-2020 Object Management Group, Inc."],
   :sm/fileAbbreviation "fibo-ind-ir-mod",
   :sm/filename "MetadataINDInterestRates.rdf"})

(def InterestRatesModule
  "This module includes ontologies defining concepts for reference interest rates, that is, rates of interest paid on capital by central banks, groups of banks and other lenders, including inter-bank lending rates and rates of certain representative debt instruments."
  {:db/ident :fibo-ind-ir-mod/InterestRatesModule,
   :dcterms/abstract
   "This module includes ontologies defining concepts for reference interest rates, that is, rates of interest paid on capital by central banks, groups of banks and other lenders, including inter-bank lending rates and rates of certain representative debt instruments.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders/"
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MetadataINDInterestRates/",
   :rdfs/label "FIBO IND Interest Rates Module",
   :rdfs/seeAlso ["https://www.edmcouncil.org/fibo/"],
   :sm/contributor
   ["Bureau of Labor Statistics (BLS, US Department of Commerce)"
    "Thematix Partners LLC"
    "State Street Bank and Trust"
    "Statistics Canada"
    "Adaptive, Inc."],
   :sm/copyright ["Copyright (c) 2015-2020 Object Management Group, Inc."
                  "Copyright (c) 2015-2020 EDM Council, Inc."],
   :sm/moduleAbbreviation "FIBO-IND-IR"})