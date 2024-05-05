(ns net.wikipunk.rdf.fibo-sec-sec-mod
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/MetadataSECSecurities/SecuritiesModule",
   :dcterms/abstract
   "The SEC Securities Module covers basic information that are common to many securities, including classification schemes, parametric schedules, and common identification, issuance, listing, and restriction-specific concepts. This ontology provides metadata about the Securities module and its contents.",
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-03T18:00:00.000-00:00",
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-sec-mod"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/MetadataSECSecurities/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/MetadataSECSecurities/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-sec-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/MetadataSECSecurities/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Securities (SEC), Securities Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/MetadataSECSecurities/"})

(def SecuritiesModule
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :db/ident :fibo-sec-sec-mod/SecuritiesModule,
   :dcterms/abstract
   "This module defines concepts common to all securities contracts or referenced in multiple classes of security.",
   :dcterms/contributor
   #{"Citigroup" "Wells Fargo Bank, N.A." "Dassault Systemes / No Magic"
     "John F. Gemski" "Adaptive, Inc." "Tahoe Blue Ltd" "BIAN"
     "Thematix Partners LLC" "Bloomberg LP" "Quarule" "Nordea Bank AB"
     "Credit Suisse" "State Street Bank and Trust" "agnos.ai U.K. Ltd"
     "Deutsche Bank" "Exprentis" "Statistics Canada" "Goldman Sachs" "Mizuho"
     "John F. Tierney" "Federated Knowledge LLC" "HP Enterprise / Mphasis"
     "Office of Financial Research (US Dept of the Treasury)"},
   :dcterms/hasPart
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Baskets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"}},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"Financial Industry Business Ontology (FIBO) Securities and Equities (SEC) Securities Module"
     "FIBO SEC Securities Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/MetadataSECSecurities/"},
   :rdfs/label "securities module",
   :rdfs/seeAlso {:xsd/anyURI "https://www.edmcouncil.org/fibo/"}})

(def urn:uuid:75d8a111-c07c-5f4a-a9cf-206fc1ef7abc
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcterms/abstract
   "The SEC Securities Module covers basic information that are common to many securities, including classification schemes, parametric schedules, and common identification, issuance, listing, and restriction-specific concepts. This ontology provides metadata about the Securities module and its contents.",
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-03T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/MetadataSECSecurities/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata about the EDMC-FIBO Securities (SEC), Securities Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/MetadataSECSecurities/"})