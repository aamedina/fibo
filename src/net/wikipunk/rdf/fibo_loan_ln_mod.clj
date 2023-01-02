(ns net.wikipunk.rdf.fibo-loan-ln-mod
  "This module contains ontologies defining concepts that apply to most loans, including but not limited to applications."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/MetadataLOANLoansGeneral/LoansGeneralModule",
   :dcterms/abstract
   "This module contains ontologies defining concepts that apply to most loans, including but not limited to applications.",
   :dcterms/issued #inst "2022-06-10T22:00:00.000-00:00",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansGeneral/MetadataLOANLoansGeneral/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-loan-ln-mod"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/MetadataLOANLoansGeneral/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/MetadataLOANLoansGeneral/",
   :rdfa/prefix "fibo-loan-ln-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/MetadataLOANLoansGeneral/",
   :rdfs/label "Metadata for the EDMC-FIBO Loans (LOAN) Loans General Module",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference",
   :sm/copyright ["Copyright (c) 2022 Object Management Group, Inc."
                  "Copyright (c) 2014-2022 EDM Council, Inc."],
   :sm/fileAbbreviation "fibo-loan-ln-mod",
   :sm/filename "MetadataLOANLoansGeneral.rdf"})

(def LoansGeneralModule
  "This module contains ontologies defining concepts that apply to most loans, including but not limited to applications."
  {:db/ident :fibo-loan-ln-mod/LoansGeneralModule,
   :dcterms/abstract
   "This module contains ontologies defining concepts that apply to most loans, including but not limited to applications.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanEvents/"],
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/title "FIBO LOAN - Loans General Module",
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/MetadataLOANLoansGeneral/",
   :rdfs/label "FIBO LOAN Loans General Module",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/contributor ["Tahoe Blue Ltd"
                    "John F. Gemski"
                    "Office of Financial Research (US Dept of the Treasury)"
                    "Adaptive, Inc."
                    "Wells Fargo"
                    "Semantic Arts, Inc."
                    "Thematix Partners LLC"
                    "Hypercube Ltd."
                    "Federated Knowledge LLC"],
   :sm/copyright ["Copyright (c) 2014-2022 EDM Council, Inc."
                  "Copyright (c) 2022 Object Management Group, Inc."],
   :sm/moduleAbbreviation "fibo-loan-ln"})