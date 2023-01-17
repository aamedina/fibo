(ns net.wikipunk.rdf.fibo-bp-prc-mod
  "This module contains ontologies of Process concepts including concepts common to a range of business processes, along with basic financial context concepts."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BP/Process/MetadataBPProcess/ProcessModule",
   :dcterms/abstract
   "This module contains ontologies of Process concepts including concepts common to a range of business processes, along with basic financial context concepts.",
   :dcterms/issued #inst "2020-04-06T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/Process/MetadataBPProcess/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-bp-prc-mod"
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/MetadataBPProcess/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/BP/Process/MetadataBPProcess/",
   :rdfa/prefix "fibo-bp-prc-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BP/Process/MetadataBPProcess/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Business Process (BP) Process Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright "Copyright (c) 2013-2020 EDM Council, Inc.",
   :sm/fileAbbreviation "fibo-bp-prc-mod",
   :sm/filename "MetadataBPProcess.rdf"})

(def ProcessModule
  "This module contains ontologies of Process concepts including concepts common to a range of business processes, along with basic financial context concepts."
  {:db/ident :fibo-bp-prc-mod/ProcessModule,
   :dcterms/abstract
   "This module contains ontologies of Process concepts including concepts common to a range of business processes, along with basic financial context concepts.",
   :dcterms/hasPart
   "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/Process/MetadataBPProcess/",
   :rdfs/label "Process Module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"],
   :sm/copyright "Copyright (c) 2013-2020 EDM Council, Inc.",
   :sm/moduleAbbreviation "fibo-bp-prc"})