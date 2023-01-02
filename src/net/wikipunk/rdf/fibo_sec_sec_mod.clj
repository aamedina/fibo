(ns net.wikipunk.rdf.fibo-sec-sec-mod
  "The SEC Securities Module covers basic information that are common to many securities, including classification schemes, parametric schedules, and common identification, issuance, listing, and restriction-specific concepts. This ontology provides metadata about the Securities module and its contents."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/MetadataSECSecurities/SecuritiesModule",
   :dcterms/abstract
   "The SEC Securities Module covers basic information that are common to many securities, including classification schemes, parametric schedules, and common identification, issuance, listing, and restriction-specific concepts. This ontology provides metadata about the Securities module and its contents.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/MetadataSECSecurities/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-sec-sec-mod"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/MetadataSECSecurities/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/MetadataSECSecurities/",
   :rdfa/prefix "fibo-sec-sec-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/MetadataSECSecurities/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Securities (SEC), Securities Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright ["Copyright (c) 2018 Object Management Group, Inc."
                  "Copyright (c) 2018 EDM Council, Inc."],
   :sm/fileAbbreviation "fibo-sec-sec-mod",
   :sm/filename "MetadataSECSecurities.rdf"})

(def SecuritiesModule
  "This module defines concepts common to all securities contracts or referenced in multiple classes of security."
  {:db/ident :fibo-sec-sec-mod/SecuritiesModule,
   :dcterms/abstract
   "This module defines concepts common to all securities contracts or referenced in multiple classes of security.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Baskets/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/MetadataSECSecurities/",
   :rdfs/label "FIBO SEC Securities Module",
   :rdfs/seeAlso "https://www.edmcouncil.org/fibo/",
   :sm/contributor ["HP Enterprise / Mphasis"
                    "Tahoe Blue Ltd"
                    "Statistics Canada"
                    "Exprentis"
                    "Thematix Partners LLC"
                    "Nordea Bank AB"
                    "State Street Bank and Trust"
                    "Bloomberg LP"
                    "NoMagic"
                    "Citigroup"
                    "Mizuho"
                    "Quarule"
                    "Credit Suisse"
                    "Deutsche Bank"
                    "BIAN"
                    "Goldman Sachs"
                    "Adaptive, Inc."
                    "Wells Fargo"
                    "Office of Financial Research (US Dept of the Treasury)"],
   :sm/copyright ["Copyright (c) 2018 EDM Council, Inc."
                  "Copyright (c) 2018 Object Management Group, Inc."],
   :sm/moduleAbbreviation "FIBO-SEC-SEC"})