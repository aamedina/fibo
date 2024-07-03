(ns net.wikipunk.rdf.fibo-sec-fnd-mod
  {:cmns-av/copyright #{"Copyright (c) 2020-2023 Object Management Group, Inc."
                        "Copyright (c) 2020-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Funds/MetadataSECFunds/FundsModule",
   :dcterms/abstract
   "This module contains ontologies of funds concepts covering fund structure, definition and involved parties, along with concepts for tradable fund units.",
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-03T18:00:00.000-00:00",
   :namespaces
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
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Funds/MetadataSECFunds/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-fnd-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/MetadataSECFunds/",
   :rdfs/label "Metadata SEC Funds Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/MetadataSECFunds/"})

(def FundsModule
  {:cmns-av/copyright #{"Copyright (c) 2020-2023 Object Management Group, Inc."
                        "Copyright (c) 2020-2023 EDM Council, Inc."},
   :db/ident :fibo-sec-fnd-mod/FundsModule,
   :dcterms/abstract
   "This module contains ontologies of funds concepts covering fund structure, definition and involved parties, along with concepts for tradable fund units.",
   :dcterms/contributor
   #{"Citigroup" "Wells Fargo Bank, N.A." "Dassault Systemes / No Magic"
     "John F. Gemski" "Adaptive, Inc." "Tahoe Blue Ltd" "BIAN"
     "Thematix Partners LLC" "Bloomberg LP" "Quarule" "Nordea Bank AB"
     "Credit Suisse" "State Street Bank and Trust" "agnos.ai U.K. Ltd"
     "Deutsche Bank" "Exprentis" "Statistics Canada" "Goldman Sachs" "Mizuho"
     "John F. Tierney" "Federated Knowledge LLC" "HP Enterprise / Mphasis"
     "Office of Financial Research (US Dept of the Treasury)"},
   :dcterms/hasPart
   #{{:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"}},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"FIBO SEC Funds Module"
     "EDMC Financial Industry Business Ontology (FIBO) Securities (SEC) Domain Funds Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/MetadataSECFunds/"},
   :rdfs/label "funds module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:15ac3c4d-83be-539a-961d-3af8adbf0529
  {:cmns-av/copyright #{"Copyright (c) 2020-2023 Object Management Group, Inc."
                        "Copyright (c) 2020-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This module contains ontologies of funds concepts covering fund structure, definition and involved parties, along with concepts for tradable fund units.",
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-03T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Funds/MetadataSECFunds/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Metadata SEC Funds Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/MetadataSECFunds/"})