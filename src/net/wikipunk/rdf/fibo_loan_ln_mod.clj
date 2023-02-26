(ns net.wikipunk.rdf.fibo-loan-ln-mod
  "This module contains ontologies defining concepts that apply to most loans, including but not limited to applications."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 EDM Council, Inc."
                       "Copyright (c) 2018-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/MetadataLOANLoansGeneral/LoansGeneralModule",
   :dcterms/abstract
   "This module contains ontologies defining concepts that apply to most loans, including but not limited to applications.",
   :dcterms/issued #inst "2018-03-31T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-02-03T23:00:00.000-00:00",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansGeneral/MetadataLOANLoansGeneral/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-loan-ln-mod"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/MetadataLOANLoansGeneral/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-loan-ln-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/MetadataLOANLoansGeneral/",
   :rdfs/label "Metadata for the EDMC-FIBO Loans (LOAN) Loans General Module"})

(def LoansGeneralModule
  "This module contains ontologies defining concepts that apply to most loans, including but not limited to applications."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 Object Management Group, Inc."
                       "Copyright (c) 2018-2023 EDM Council, Inc."],
   :db/ident :fibo-loan-ln-mod/LoansGeneralModule,
   :dcterms/abstract
   "This module contains ontologies defining concepts that apply to most loans, including but not limited to applications.",
   :dcterms/contributor
   ["Wells Fargo"
    "agnos.ai U.K. Ltd"
    "Federated Knowledge LLC"
    "Hypercube Ltd."
    "John F. Gemski"
    "Thematix Partners LLC"
    "Office of Financial Research (US Dept of the Treasury)"
    "Tahoe Blue Ltd"
    "Adaptive, Inc."
    "Semantic Arts, Inc."],
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanEvents/"],
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/title
   ["FIBO LOAN Loans General Module"
    "Financial Industry Business Ontology (FIBO) Loans (LOAN) Loans General Module"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/MetadataLOANLoansGeneral/",
   :rdfs/label "loans general module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})