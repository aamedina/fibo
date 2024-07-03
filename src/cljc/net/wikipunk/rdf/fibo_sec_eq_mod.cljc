(ns net.wikipunk.rdf.fibo-sec-eq-mod
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Equities/MetadataSECEquities/EquitiesModule",
   :dcterms/abstract
   "The SEC Equities Module covers concepts that are common to equities, including share-specific terminology and shareholder rights, for stocks and partnership equity, as well as depository receipts. This ontology provides metadata about the Equities module and its contents.",
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-03T18:00:00.000-00:00",
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-eq-mod"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/MetadataSECEquities/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Equities/MetadataSECEquities/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-eq-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/MetadataSECEquities/",
   :rdfs/label "Metadata about the EDMC-FIBO Securities (SEC), Equities Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/MetadataSECEquities/"})

(def EquitiesModule
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :db/ident :fibo-sec-eq-mod/EquitiesModule,
   :dcterms/abstract
   "This module defines concepts common to equities, including share-specific terminology and shareholder rights, for stocks and partnership equity, as well as depository receipts.",
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
      "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/"}},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"Financial Industry Business Ontology (FIBO) Securities and Equities (SEC) Equities Module"
     "FIBO SEC Equities Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/MetadataSECEquities/"},
   :rdfs/label "equities module",
   :rdfs/seeAlso {:xsd/anyURI "https://www.edmcouncil.org/fibo/"}})

(def urn:uuid:ef700a77-69e4-5997-9d80-24169755cadd
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcterms/abstract
   "The SEC Equities Module covers concepts that are common to equities, including share-specific terminology and shareholder rights, for stocks and partnership equity, as well as depository receipts. This ontology provides metadata about the Equities module and its contents.",
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-03T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Equities/MetadataSECEquities/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Metadata about the EDMC-FIBO Securities (SEC), Equities Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/MetadataSECEquities/"})