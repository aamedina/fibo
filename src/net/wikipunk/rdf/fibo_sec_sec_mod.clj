(ns net.wikipunk.rdf.fibo-sec-sec-mod
  "The SEC Securities Module covers basic information that are common to many securities, including classification schemes, parametric schedules, and common identification, issuance, listing, and restriction-specific concepts. This ontology provides metadata about the Securities module and its contents."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 EDM Council, Inc."
                       "Copyright (c) 2018-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/MetadataSECSecurities/SecuritiesModule",
   :dcterms/abstract
   "The SEC Securities Module covers basic information that are common to many securities, including classification schemes, parametric schedules, and common identification, issuance, listing, and restriction-specific concepts. This ontology provides metadata about the Securities module and its contents.",
   :dcterms/issued #inst "2018-03-31T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-02-03T23:00:00.000-00:00",
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/MetadataSECSecurities/",
   :rdf/ns-prefix-map
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-sec-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/MetadataSECSecurities/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Securities (SEC), Securities Module"})

(def SecuritiesModule
  "This module defines concepts common to all securities contracts or referenced in multiple classes of security."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 EDM Council, Inc."
                       "Copyright (c) 2018-2023 Object Management Group, Inc."],
   :db/ident :fibo-sec-sec-mod/SecuritiesModule,
   :dcterms/abstract
   "This module defines concepts common to all securities contracts or referenced in multiple classes of security.",
   :dcterms/contributor
   ["Goldman Sachs"
    "Office of Financial Research (US Dept of the Treasury)"
    "Thematix Partners LLC"
    "HP Enterprise / Mphasis"
    "Statistics Canada"
    "State Street Bank and Trust"
    "Credit Suisse"
    "Adaptive, Inc."
    "Bloomberg LP"
    "Quarule"
    "BIAN"
    "John F. Gemski"
    "Deutsche Bank"
    "Tahoe Blue Ltd"
    "Federated Knowledge LLC"
    "Mizuho"
    "John F. Tierney"
    "Nordea Bank AB"
    "Exprentis"
    "Citigroup"
    "agnos.ai U.K. Ltd"
    "Dassault Systemes / No Magic"
    "Wells Fargo Bank, N.A."],
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Baskets/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Securities and Equities (SEC) Securities Module"
    "FIBO SEC Securities Module"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/MetadataSECSecurities/",
   :rdfs/label "securities module",
   :rdfs/seeAlso ["https://www.edmcouncil.org/fibo/"]})