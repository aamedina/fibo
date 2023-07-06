(ns net.wikipunk.rdf.fibo-bp-prc-mod
  "This module contains ontologies of Process concepts including concepts common to a range of business processes, along with basic financial context concepts."
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BP/Process/MetadataBPProcess/ProcessModule",
   :dcterms/abstract
   "This module contains ontologies of Process concepts including concepts common to a range of business processes, along with basic financial context concepts.",
   :dcterms/issued #inst "2018-03-01T23:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-01-30T23:00:00.000-00:00",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/Process/MetadataBPProcess/",
   :rdf/ns-prefix-map
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-bp-prc-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BP/Process/MetadataBPProcess/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Business Process (BP) Process Module"})

(def ProcessModule
  "This module contains ontologies of Process concepts including concepts common to a range of business processes, along with basic financial context concepts."
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :db/ident :fibo-bp-prc-mod/ProcessModule,
   :dcterms/abstract
   "This module contains ontologies of Process concepts including concepts common to a range of business processes, along with basic financial context concepts.",
   :dcterms/hasPart
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/"},
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Business Process (BP) Process Module"
    "FIBO BP Process Module"],
   :rdf/type [:owl/NamedIndividual :fibo-fnd-utl-av/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/Process/MetadataBPProcess/",
   :rdfs/label "process module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})