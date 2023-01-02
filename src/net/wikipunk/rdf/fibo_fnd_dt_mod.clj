(ns net.wikipunk.rdf.fibo-fnd-dt-mod
  "This is the metadata ontology used to describe the Foundations Dates and Times Module."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/MetadataFNDDatesAndTimes/DatesAndTimesModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Dates and Times Module.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/MetadataFNDDatesAndTimes/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-dt-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/MetadataFNDDatesAndTimes/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/MetadataFNDDatesAndTimes/",
   :rdfa/prefix "fibo-fnd-dt-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/MetadataFNDDatesAndTimes/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Foundations (FND) Dates and Times Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright ["Copyright (c) 2017-2018 EDM Council, Inc."
                  "Copyright (c) 2017-2018 Object Management Group, Inc."],
   :sm/fileAbbreviation "fibo-fnd-dt-mod",
   :sm/filename "MetadataFNDDatesAndTimes.rdf"})

(def DatesAndTimesModule
  "This module includes ontologies describing date and time concepts which are of specific reference in financial services. These cover foundational date and time concepts in a form usable for financial subject matter ontologies, including occurrences and conventions for business days and the like. The business day convention concepts are to be further extended in specialized ontologies for securities and derivatives, building on the ontologies in this module."
  {:db/ident :fibo-fnd-dt-mod/DatesAndTimesModule,
   :dcterms/abstract
   "This module includes ontologies describing date and time concepts which are of specific reference in financial services.  These cover foundational date and time concepts in a form usable for financial subject matter ontologies, including occurrences and conventions for business days and the like.  The business day convention concepts are to be further extended in specialized ontologies for securities and derivatives, building on the ontologies in this module.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "Financial Industry Business Ontology (FIBO) Foundations (FND) Dates and Times Module",
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/MetadataFNDDatesAndTimes/",
   :rdfs/label "Dates and Times",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/copyright ["Copyright (c) 2017-2018 Object Management Group, Inc."
                  "Copyright (c) 2017-2018 EDM Council, Inc."],
   :sm/moduleAbbreviation "fibo-fnd-dt"})