(ns net.wikipunk.rdf.fibo-fbc-fi-mod
  "The financial instruments module includes ontologies defining general purpose financial instruments, i.e., agreements, contracts, notes, equities, options, debt instruments, and so forth, some of which may be negotiable."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/MetadataFBCFinancialInstruments/FinancialInstrumentsModule",
   :dcterms/abstract
   "The financial instruments module includes ontologies defining general purpose financial instruments, i.e., agreements, contracts, notes, equities, options, debt instruments, and so forth, some of which may be negotiable.",
   :dcterms/issued #xsd/dateTime #inst "2015-08-13T18:00:00.000-04:00",
   :dcterms/license {:rdfa/uri "http://opensource.org/licenses/MIT"},
   :dcterms/modified #xsd/dateTime #inst "2023-01-30T18:00:00.000-05:00",
   :owl/imports
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/MetadataFBCFinancialInstruments/"},
   :rdf/ns-prefix-map
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-fi-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/MetadataFBCFinancialInstruments/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Financial Business and Commerce(FBC) Financial Instruments Module"})

(def FinancialInstrumentsModule
  "The financial instruments module includes ontologies defining general purpose financial instruments, i.e., agreements, contracts, notes, equities, options, debt instruments, and so forth, some of which may be negotiable."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :db/ident :fibo-fbc-fi-mod/FinancialInstrumentsModule,
   :dcterms/abstract
   "The financial instruments module includes ontologies defining general purpose financial instruments, i.e., agreements, contracts, notes, equities, options, debt instruments, and so forth, some of which may be negotiable.",
   :dcterms/hasPart
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"}],
   :dcterms/license {:rdfa/uri "http://opensource.org/licenses/MIT"},
   :dcterms/title
   ["FIBO FBC Financial Instruments Module"
    "Financial Industry Business Ontology (FIBO) Financial Business and Commerce (FBC) Financial Instruments Module"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/MetadataFBCFinancialInstruments/"},
   :rdfs/label "financial instruments module",
   :rdfs/seeAlso {:rdfa/uri "https://spec.edmcouncil.org/fibo/"}})