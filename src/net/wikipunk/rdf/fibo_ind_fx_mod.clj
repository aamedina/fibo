(ns net.wikipunk.rdf.fibo-ind-fx-mod
  "This module includes ontologies defining concepts to do with foreign exchange."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/MetadataINDForeignExchange/ForeignExchangeModule",
   :dcterms/abstract
   "This module includes ontologies defining concepts to do with foreign exchange.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/ForeignExchange/MetadataINDForeignExchange/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-ind-fx-mod"
    "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/MetadataINDForeignExchange/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/MetadataINDForeignExchange/",
   :rdfa/prefix "fibo-ind-fx-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/MetadataINDForeignExchange/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Indices and Indicators (IND) Foreign Exchange Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright ["Copyright (c) 2015-2018 Object Management Group, Inc."
                  "Copyright (c) 2015-2018 EDM Council, Inc."],
   :sm/fileAbbreviation "fibo-ind-fx-mod",
   :sm/filename "MetadataINDForeignExchange.rdf"})

(def ForeignExchangeModule
  "This module includes ontologies defining concepts to do with foreign exchange."
  {:db/ident :fibo-ind-fx-mod/ForeignExchangeModule,
   :dcterms/abstract
   "This module includes ontologies defining concepts to do with foreign exchange.",
   :dcterms/hasPart
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/MetadataINDForeignExchange/",
   :rdfs/label "FIBO IND Foreign Exchange Module",
   :rdfs/seeAlso ["https://www.edmcouncil.org/fibo/"],
   :sm/contributor
   ["Thematix Partners LLC"
    "Bureau of Labor Statistics (BLS, US Department of Commerce)"
    "Adaptive, Inc."
    "State Street Bank and Trust"
    "Statistics Canada"],
   :sm/copyright ["Copyright (c) 2015-2018 EDM Council, Inc."
                  "Copyright (c) 2015-2018 Object Management Group, Inc."],
   :sm/moduleAbbreviation "FIBO-IND-FX"})