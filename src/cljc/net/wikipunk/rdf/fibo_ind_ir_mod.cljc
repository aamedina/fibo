(ns net.wikipunk.rdf.fibo-ind-ir-mod
  "This module includes ontologies defining concepts for reference interest rates, that is, rates of interest paid on capital by central banks, groups of banks and other lenders, including inter-bank lending rates and rates of certain representative debt instruments."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MetadataINDInterestRates/InterestRatesModule",
   :dcterms/abstract
   "This module includes ontologies defining concepts for reference interest rates, that is, rates of interest paid on capital by central banks, groups of banks and other lenders, including inter-bank lending rates and rates of certain representative debt instruments.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-02-06T23:00:00.000-00:00",
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/InterestRates/MetadataINDInterestRates/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-ir-mod"
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MetadataINDInterestRates/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-ind-ir-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MetadataINDInterestRates/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Indices and Indicators (IND) Interest Rates Module"})

(def InterestRatesModule
  "This module includes ontologies defining concepts for reference interest rates, that is, rates of interest paid on capital by central banks, groups of banks and other lenders, including inter-bank lending rates and rates of certain representative debt instruments."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 Object Management Group, Inc."
                       "Copyright (c) 2015-2023 EDM Council, Inc."],
   :db/ident :fibo-ind-ir-mod/InterestRatesModule,
   :dcterms/abstract
   "This module includes ontologies defining concepts for reference interest rates, that is, rates of interest paid on capital by central banks, groups of banks and other lenders, including inter-bank lending rates and rates of certain representative debt instruments.",
   :dcterms/contributor
   ["agnos.ai UK Ltd"
    "Bloomberg LP"
    "Dassault Systemes/No Magic"
    "Thematix Partners LLC"
    "Pinnacle Bank (Morgan Hill, California)"
    "Bureau of Economic Analysis (BEA, US Department of Commerce)"
    "Bureau of Labor Statistics (BLS, US Department of Commerce)"
    "Citigroup"
    "Office of Financial Research (OFR), U.S. Department of the Treasury"
    "Census Bureau (US Department of Commerce)"
    "Deutsche Bank"
    "John F. Gemski"
    "Federal Reserve Bank of Kansas City"
    "Bank of New York Mellon"
    "State Street Bank and Trust"
    "John F. Tierney"
    "Nordea Bank AB"
    "88 Solutions"
    "Adaptive, Inc."
    "Statistics Canada"
    "Wells Fargo Bank, N. A."
    "HP Enterprise / Mphasis"
    "Tahoe Blue Ltd"],
   :dcterms/hasPart
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"}],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   ["FIBO IND Interest Rates Module"
    "Financial Industry Business Ontology (FIBO) Indices and Indicators (IND) Interest Rates Module"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MetadataINDInterestRates/",
   :rdfs/label "interest rates module",
   :rdfs/seeAlso ["https://www.edmcouncil.org/fibo/"]})