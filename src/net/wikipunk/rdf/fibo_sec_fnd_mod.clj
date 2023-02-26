(ns net.wikipunk.rdf.fibo-sec-fnd-mod
  "This module contains ontologies of funds concepts covering fund structure, definition and involved parties, along with concepts for tradable fund units."
  {:cmns-av/copyright ["Copyright (c) 2020-2023 Object Management Group, Inc."
                       "Copyright (c) 2020-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/MetadataSECFunds/FundsModule",
   :dcterms/abstract
   "This module contains ontologies of funds concepts covering fund structure, definition and involved parties, along with concepts for tradable fund units.",
   :dcterms/issued #inst "2018-03-31T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-02-03T23:00:00.000-00:00",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Funds/MetadataSECFunds/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-fnd-mod"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/MetadataSECFunds/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-fnd-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/MetadataSECFunds/",
   :rdfs/label "Metadata SEC Funds Module"})

(def FundsModule
  "This module contains ontologies of funds concepts covering fund structure, definition and involved parties, along with concepts for tradable fund units."
  {:cmns-av/copyright ["Copyright (c) 2020-2023 EDM Council, Inc."
                       "Copyright (c) 2020-2023 Object Management Group, Inc."],
   :db/ident :fibo-sec-fnd-mod/FundsModule,
   :dcterms/abstract
   "This module contains ontologies of funds concepts covering fund structure, definition and involved parties, along with concepts for tradable fund units.",
   :dcterms/contributor
   ["Tahoe Blue Ltd"
    "BIAN"
    "Statistics Canada"
    "Quarule"
    "HP Enterprise / Mphasis"
    "Nordea Bank AB"
    "Deutsche Bank"
    "Federated Knowledge LLC"
    "Thematix Partners LLC"
    "Citigroup"
    "agnos.ai U.K. Ltd"
    "Credit Suisse"
    "Dassault Systemes / No Magic"
    "John F. Tierney"
    "Adaptive, Inc."
    "Wells Fargo Bank, N.A."
    "Office of Financial Research (US Dept of the Treasury)"
    "Mizuho"
    "John F. Gemski"
    "Bloomberg LP"
    "Goldman Sachs"
    "Exprentis"
    "State Street Bank and Trust"],
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   ["EDMC Financial Industry Business Ontology (FIBO) Securities (SEC) Domain Funds Module"
    "FIBO SEC Funds Module"],
   :rdf/type [:owl/NamedIndividual :fibo-fnd-utl-av/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/MetadataSECFunds/",
   :rdfs/label "funds module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})