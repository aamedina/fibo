(ns net.wikipunk.rdf.fibo-ind-ir-mod
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/IND/InterestRates/MetadataINDInterestRates/InterestRatesModule",
   :dcterms/abstract
   "This module includes ontologies defining concepts for reference interest rates, that is, rates of interest paid on capital by central banks, groups of banks and other lenders, including inter-bank lending rates and rates of certain representative debt instruments.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-06T18:00:00.000-00:00",
   :namespaces
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
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/IND/InterestRates/MetadataINDInterestRates/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-ind-ir-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MetadataINDInterestRates/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Indices and Indicators (IND) Interest Rates Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MetadataINDInterestRates/"})

(def InterestRatesModule
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :db/ident :fibo-ind-ir-mod/InterestRatesModule,
   :dcterms/abstract
   "This module includes ontologies defining concepts for reference interest rates, that is, rates of interest paid on capital by central banks, groups of banks and other lenders, including inter-bank lending rates and rates of certain representative debt instruments.",
   :dcterms/contributor
   #{"Citigroup" "Census Bureau (US Department of Commerce)"
     "Office of Financial Research (OFR), U.S. Department of the Treasury"
     "John F. Gemski" "Dassault Systemes/No Magic" "Adaptive, Inc."
     "Federal Reserve Bank of Kansas City" "Tahoe Blue Ltd"
     "Bureau of Economic Analysis (BEA, US Department of Commerce)"
     "Thematix Partners LLC" "Bloomberg LP" "88 Solutions" "Nordea Bank AB"
     "Pinnacle Bank (Morgan Hill, California)" "State Street Bank and Trust"
     "Deutsche Bank" "Bank of New York Mellon" "Statistics Canada"
     "Bureau of Labor Statistics (BLS, US Department of Commerce)"
     "John F. Tierney" "agnos.ai UK Ltd" "HP Enterprise / Mphasis"
     "Wells Fargo Bank, N. A."},
   :dcterms/hasPart
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"}},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"FIBO IND Interest Rates Module"
     "Financial Industry Business Ontology (FIBO) Indices and Indicators (IND) Interest Rates Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MetadataINDInterestRates/"},
   :rdfs/label "interest rates module",
   :rdfs/seeAlso {:xsd/anyURI "https://www.edmcouncil.org/fibo/"}})

(def urn:uuid:6d11eeaa-f6bc-577b-a638-da43269f898a
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "This module includes ontologies defining concepts for reference interest rates, that is, rates of interest paid on capital by central banks, groups of banks and other lenders, including inter-bank lending rates and rates of certain representative debt instruments.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-06T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/IND/InterestRates/MetadataINDInterestRates/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata about the EDMC-FIBO Indices and Indicators (IND) Interest Rates Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MetadataINDInterestRates/"})