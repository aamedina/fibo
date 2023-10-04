(ns net.wikipunk.rdf.fibo-fbc-fi-mod
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/MetadataFBCFinancialInstruments/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-fbc-fi-mod"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/MetadataFBCFinancialInstruments/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "owl"     "http://www.w3.org/2002/07/owl#",
     "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
     "xsd"     "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-fbc-fi-mod",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/MetadataFBCFinancialInstruments/FinancialInstrumentsModule"}
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "The financial instruments module includes ontologies defining general purpose financial instruments, i.e., agreements, contracts, notes, equities, options, debt instruments, and so forth, some of which may be negotiable.",
   :dcterms/issued #inst "2015-08-13T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-30T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/MetadataFBCFinancialInstruments/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata about the EDMC-FIBO Financial Business and Commerce(FBC) Financial Instruments Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/MetadataFBCFinancialInstruments/"})

(def FinancialInstrumentsModule
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :db/ident :fibo-fbc-fi-mod/FinancialInstrumentsModule,
   :dcterms/abstract
   "The financial instruments module includes ontologies defining general purpose financial instruments, i.e., agreements, contracts, notes, equities, options, debt instruments, and so forth, some of which may be negotiable.",
   :dcterms/hasPart
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/"}},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"Financial Industry Business Ontology (FIBO) Financial Business and Commerce (FBC) Financial Instruments Module"
     "FIBO FBC Financial Instruments Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/MetadataFBCFinancialInstruments/"},
   :rdfs/label "financial instruments module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:02cde29d-e09c-5739-ad56-42dcde52b237
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "The financial instruments module includes ontologies defining general purpose financial instruments, i.e., agreements, contracts, notes, equities, options, debt instruments, and so forth, some of which may be negotiable.",
   :dcterms/issued #inst "2015-08-13T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-30T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/MetadataFBCFinancialInstruments/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata about the EDMC-FIBO Financial Business and Commerce(FBC) Financial Instruments Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/MetadataFBCFinancialInstruments/"})