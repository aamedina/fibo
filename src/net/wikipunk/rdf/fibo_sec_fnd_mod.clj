(ns net.wikipunk.rdf.fibo-sec-fnd-mod
  "This module contains ontologies of funds concepts covering fund structure, definition and involved parties, along with concepts for tradable fund units."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/MetadataSECFunds/FundsModule",
   :dcterms/abstract
   "This module contains ontologies of funds concepts covering fund structure, definition and involved parties, along with concepts for tradable fund units.",
   :dcterms/issued #inst "2021-03-29T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "EDMC Financial Industry Business Ontology (FIBO) Securities (SEC) Domain, Funds Module",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Funds/MetadataSECFunds/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-sec-fnd-mod"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/MetadataSECFunds/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/MetadataSECFunds/",
   :rdfa/prefix "fibo-sec-fnd-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/MetadataSECFunds/",
   :rdfs/label "Metadata SEC Funds Module",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference",
   :sm/copyright ["Copyright (c) 2020-2021 Object Management Group, Inc."
                  "Copyright (c) 2020-2021 EDM Council, Inc."],
   :sm/dependsOn ["https://spec.edmcouncil.org/fibo/ontology/IND/"
                  "https://spec.edmcouncil.org/fibo/ontology/FND/"
                  "https://www.omg.org/spec/LCC/"
                  "https://spec.edmcouncil.org/fibo/ontology/BE/"
                  "https://spec.edmcouncil.org/fibo/ontology/FBC/"],
   :sm/fileAbbreviation "fibo-sec-fnd-mod",
   :sm/filename "MetadataSECFunds.rdf"})

(def FundsModule
  "This module contains ontologies of funds concepts covering fund structure, definition and involved parties, along with concepts for tradable fund units."
  {:db/ident :fibo-sec-fnd-mod/FundsModule,
   :dcterms/abstract
   "This module contains ontologies of funds concepts covering fund structure, definition and involved parties, along with concepts for tradable fund units.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/MetadataSECFunds/",
   :rdfs/label "Funds Module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"],
   :sm/contributor ["Wells Fargo Bank, N.A." "Thematix Partners LLC"],
   :sm/copyright ["Copyright (c) 2020-2021 EDM Council, Inc."
                  "Copyright (c) 2020-2021 Object Management Group, Inc."],
   :sm/keyword
   ["collective investment vehicles, CIV, special purpose vehicles"
    "exchange traded funds (ETFs), hedge funds, mutual funds, pension funds, real estate investment trusts (REITs)"
    "funds"],
   :sm/moduleAbbreviation "fibo-sec-fund"})