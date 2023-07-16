(ns net.wikipunk.rdf.fibo-ind-fx-mod
  "This module includes ontologies defining concepts to do with foreign exchange."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 Object Management Group, Inc."
                       "Copyright (c) 2015-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/MetadataINDForeignExchange/ForeignExchangeModule",
   :dcterms/abstract
   "This module includes ontologies defining concepts to do with foreign exchange.",
   :dcterms/issued #xsd/dateTime #inst "2018-08-27T18:00:00.000-04:00",
   :dcterms/license {:rdfa/uri "https://opensource.org/licenses/MIT"},
   :dcterms/modified #xsd/dateTime #inst "2023-02-06T18:00:00.000-05:00",
   :owl/imports
   [{:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/ForeignExchange/MetadataINDForeignExchange/"},
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-fx-mod"
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/MetadataINDForeignExchange/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-ind-fx-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/MetadataINDForeignExchange/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Indices and Indicators (IND) Foreign Exchange Module"})

(def ForeignExchangeModule
  "This module includes ontologies defining concepts to do with foreign exchange."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 Object Management Group, Inc."
                       "Copyright (c) 2015-2023 EDM Council, Inc."],
   :db/ident :fibo-ind-fx-mod/ForeignExchangeModule,
   :dcterms/abstract
   "This module includes ontologies defining concepts to do with foreign exchange.",
   :dcterms/contributor
   ["Deutsche Bank"
    "Tahoe Blue Ltd"
    "Bank of New York Mellon"
    "Adaptive, Inc."
    "Thematix Partners LLC"
    "Statistics Canada"
    "HP Enterprise / Mphasis"
    "Wells Fargo Bank, N. A."
    "Bureau of Economic Analysis (BEA, US Department of Commerce)"
    "Census Bureau (US Department of Commerce)"
    "Bloomberg LP"
    "Federal Reserve Bank of Kansas City"
    "88 Solutions"
    "Dassault Systemes/No Magic"
    "Citigroup"
    "agnos.ai UK Ltd"
    "Office of Financial Research (OFR), U.S. Department of the Treasury"
    "John F. Tierney"
    "John F. Gemski"
    "Pinnacle Bank (Morgan Hill, California)"
    "Bureau of Labor Statistics (BLS, US Department of Commerce)"
    "Nordea Bank AB"
    "State Street Bank and Trust"],
   :dcterms/hasPart
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/"},
   :dcterms/license {:rdfa/uri "http://opensource.org/licenses/MIT"},
   :dcterms/title
   ["FIBO IND Foreign Exchange Module"
    "Financial Industry Business Ontology (FIBO) Indices and Indicators (IND) Foreign Exchange Module"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/MetadataINDForeignExchange/"},
   :rdfs/label "foreign exchange module",
   :rdfs/seeAlso {:rdfa/uri "https://www.edmcouncil.org/fibo/"}})