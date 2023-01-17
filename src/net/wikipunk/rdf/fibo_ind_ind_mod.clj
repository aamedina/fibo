(ns net.wikipunk.rdf.fibo-ind-ind-mod
  "This module includes ontologies for concepts common to all market indices and market indicators, including economic measures."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/MetadataINDIndicators/IndicatorsModule",
   :dcterms/abstract
   "This module includes ontologies for concepts common to all market indices and market indicators, including economic measures.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["http://www.omg.org/techprocess/ab/SpecificationMetadata/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/Indicators/MetadataINDIndicators/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-ind-ind-mod"
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/MetadataINDIndicators/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/MetadataINDIndicators/",
   :rdfa/prefix "fibo-ind-ind-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/MetadataINDIndicators/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Indices and Indicators (IND) Indicators Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright ["Copyright (c) 2015-2018 EDM Council, Inc."
                  "Copyright (c) 2015-2018 Object Management Group, Inc."],
   :sm/fileAbbreviation "fibo-ind-ind-mod",
   :sm/filename "MetadataINDIndicators.rdf"})

(def IndicatorsModule
  "This module includes ontologies for concepts common to all market indices and market indicators, including economic measures."
  {:db/ident :fibo-ind-ind-mod/IndicatorsModule,
   :dcterms/abstract
   "This module includes ontologies for concepts common to all market indices and market indicators, including economic measures.",
   :dcterms/hasPart
   "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/MetadataINDIndicators/",
   :rdfs/label "FIBO IND Indicators Module",
   :rdfs/seeAlso ["https://www.edmcouncil.org/fibo/"],
   :sm/contributor
   ["Bureau of Labor Statistics (BLS, US Department of Commerce)"
    "State Street Bank and Trust"
    "Thematix Partners LLC"
    "Adaptive, Inc."
    "Statistics Canada"],
   :sm/copyright ["Copyright (c) 2015-2018 Object Management Group, Inc."
                  "Copyright (c) 2015-2018 EDM Council, Inc."],
   :sm/moduleAbbreviation "FIBO-IND-IND"})