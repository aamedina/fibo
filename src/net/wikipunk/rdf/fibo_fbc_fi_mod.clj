(ns net.wikipunk.rdf.fibo-fbc-fi-mod
  "The financial instruments module includes ontologies defining general purpose financial instruments, i.e., agreements, contracts, notes, equities, options, debt instruments, and so forth, some of which may be negotiable."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/MetadataFBCFinancialInstruments/FinancialInstrumentsModule",
   :dcterms/abstract
   "The financial instruments module includes ontologies defining general purpose financial instruments, i.e., agreements, contracts, notes, equities, options, debt instruments, and so forth, some of which may be negotiable.",
   :dcterms/issued #inst "2022-08-13T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/MetadataFBCFinancialInstruments/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-fi-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/MetadataFBCFinancialInstruments/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/MetadataFBCFinancialInstruments/",
   :rdfa/prefix "fibo-fbc-fi-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/MetadataFBCFinancialInstruments/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Financial Business and Commerce(FBC) Financial Instruments Module",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2015-2022 EDM Council, Inc."
                  "Copyright (c) 2015-2022 Object Management Group, Inc."],
   :sm/fileAbbreviation "fibo-fbc-fi-mod",
   :sm/filename "MetadataFBCFinancialInstruments.rdf"})

(def FinancialInstrumentsModule
  "The financial instruments module includes ontologies defining general purpose financial instruments, i.e., agreements, contracts, notes, equities, options, debt instruments, and so forth, some of which may be negotiable."
  {:db/ident :fibo-fbc-fi-mod/FinancialInstrumentsModule,
   :dcterms/abstract
   "The financial instruments module includes ontologies defining general purpose financial instruments, i.e., agreements, contracts, notes, equities, options, debt instruments, and so forth, some of which may be negotiable.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/MetadataFBCFinancialInstruments/",
   :rdfs/label "FIBO FBC Financial Instruments Module",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/copyright ["Copyright (c) 2015-2022 EDM Council, Inc."
                  "Copyright (c) 2015-2022 Object Management Group, Inc."],
   :sm/moduleAbbreviation "FIBO-FBC-FI"})