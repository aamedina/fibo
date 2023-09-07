(ns net.wikipunk.rdf.fibo-bp-prc-mod
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/MetadataBPProcess/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-bp-prc-mod"
     "https://spec.edmcouncil.org/fibo/ontology/BP/Process/MetadataBPProcess/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "owl"     "http://www.w3.org/2002/07/owl#",
     "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
     "xsd"     "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-bp-prc-mod",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/MetadataBPProcess/ProcessModule"}
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcterms/abstract
   "This module contains ontologies of Process concepts including concepts common to a range of business processes, along with basic financial context concepts.",
   :dcterms/issued #inst "2018-03-01T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-30T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/Process/MetadataBPProcess/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata for the EDMC-FIBO Business Process (BP) Process Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BP/Process/MetadataBPProcess/"})

(def ProcessModule
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :db/ident :fibo-bp-prc-mod/ProcessModule,
   :dcterms/abstract
   "This module contains ontologies of Process concepts including concepts common to a range of business processes, along with basic financial context concepts.",
   :dcterms/hasPart
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"Financial Industry Business Ontology (FIBO) Business Process (BP) Process Module"
     "FIBO BP Process Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/MetadataBPProcess/"},
   :rdfs/label "process module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:d9c17bfa-08ae-5920-9343-4f710d152852
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcterms/abstract
   "This module contains ontologies of Process concepts including concepts common to a range of business processes, along with basic financial context concepts.",
   :dcterms/issued #inst "2018-03-01T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-30T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/Process/MetadataBPProcess/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata for the EDMC-FIBO Business Process (BP) Process Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BP/Process/MetadataBPProcess/"})