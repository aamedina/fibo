(ns net.wikipunk.rdf.fibo-fnd-dt-mod
  "This is the metadata ontology used to describe the Foundations Dates and Times Module."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 Object Management Group, Inc."
                       "Copyright (c) 2017-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/MetadataFNDDatesAndTimes/DatesAndTimesModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Dates and Times Module.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-01-20T23:00:00.000-00:00",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/MetadataFNDDatesAndTimes/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-dt-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/MetadataFNDDatesAndTimes/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-dt-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/MetadataFNDDatesAndTimes/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Foundations (FND) Dates and Times Module"})

(def DatesAndTimesModule
  "This module includes ontologies describing date and time concepts which are of specific reference in financial services. These cover foundational date and time concepts in a form usable for financial subject matter ontologies, including occurrences and conventions for business days and the like. Business day conventions may be further extended in specialized ontologies for securities and derivatives."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 Object Management Group, Inc."
                       "Copyright (c) 2017-2023 EDM Council, Inc."],
   :db/ident :fibo-fnd-dt-mod/DatesAndTimesModule,
   :dcterms/abstract
   "This module includes ontologies describing date and time concepts which are of specific reference in financial services. These cover foundational date and time concepts in a form usable for financial subject matter ontologies, including occurrences and conventions for business days and the like. Business day conventions may be further extended in specialized ontologies for securities and derivatives.",
   :dcterms/hasPart
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/"}],
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/title
   ["FIBO FND Dates and Times Module"
    "Financial Industry Business Ontology (FIBO) Foundations (FND) Dates and Times Module"],
   :rdf/type [:owl/NamedIndividual :fibo-fnd-utl-av/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/MetadataFNDDatesAndTimes/",
   :rdfs/label "dates and times module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})