(ns net.wikipunk.rdf.fibo-ind-fx-mod
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/MetadataINDForeignExchange/",
    :namespaces
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
    :prefix "fibo-ind-fx-mod",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/MetadataINDForeignExchange/ForeignExchangeModule"}
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "This module includes ontologies defining concepts to do with foreign exchange.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-06T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/ForeignExchange/MetadataINDForeignExchange/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata about the EDMC-FIBO Indices and Indicators (IND) Foreign Exchange Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/MetadataINDForeignExchange/"})

(def ForeignExchangeModule
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :db/ident :fibo-ind-fx-mod/ForeignExchangeModule,
   :dcterms/abstract
   "This module includes ontologies defining concepts to do with foreign exchange.",
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
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/"},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"FIBO IND Foreign Exchange Module"
     "Financial Industry Business Ontology (FIBO) Indices and Indicators (IND) Foreign Exchange Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/MetadataINDForeignExchange/"},
   :rdfs/label "foreign exchange module",
   :rdfs/seeAlso {:xsd/anyURI "https://www.edmcouncil.org/fibo/"}})

(def urn:uuid:4a031fb2-0cae-566e-a3a6-10bfb1cb0abc
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "This module includes ontologies defining concepts to do with foreign exchange.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-06T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/ForeignExchange/MetadataINDForeignExchange/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata about the EDMC-FIBO Indices and Indicators (IND) Foreign Exchange Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/MetadataINDForeignExchange/"})