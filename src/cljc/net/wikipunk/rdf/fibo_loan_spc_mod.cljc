(ns net.wikipunk.rdf.fibo-loan-spc-mod
  "This module contains ontologies of concepts descriptive of a range of loans, excluding real estate, including commercial and consumer, loans differentiated by purpose, and their differentiating characteristics."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 Object Management Group, Inc."
                       "Copyright (c) 2018-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MetadataLOANLoansSpecific/LoansSpecificModule",
   :dcterms/abstract
   "This module contains ontologies of concepts descriptive of a range of loans, excluding real estate, including commercial and consumer, loans differentiated by purpose, and their differentiating characteristics.",
   :dcterms/issued #inst "2018-03-31T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-06-27T22:00:00.000-00:00",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansSpecific/MetadataLOANLoansSpecific/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-loan-spc-mod"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MetadataLOANLoansSpecific/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-loan-spc-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MetadataLOANLoansSpecific/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Loans (LOAN) Loans - Specific Module"})

(def LoansSpecificModule
  "This module contains ontologies of concepts descriptive of a range of loans, excluding real estate, including commercial and consumer loans differentiated by purpose."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 Object Management Group, Inc."
                       "Copyright (c) 2018-2023 EDM Council, Inc."],
   :db/ident :fibo-loan-spc-mod/LoansSpecificModule,
   :dcterms/abstract
   "This module contains ontologies of concepts descriptive of a range of loans, excluding real estate, including commercial and consumer loans differentiated by purpose.",
   :dcterms/contributor
   ["Tahoe Blue Ltd"
    "Semantic Arts, Inc."
    "Thematix Partners LLC"
    "Federated Knowledge LLC"
    "John F. Gemski"
    "Wells Fargo"
    "Office of Financial Research (US Dept of the Treasury)"
    "Hypercube Ltd."
    "agnos.ai U.K. Ltd"
    "Adaptive, Inc."],
   :dcterms/hasPart
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/StudentLoans/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/ConsumerLoans/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CommercialLoans/"}],
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/title
   ["FIBO LOAN Loans Specific Module"
    "Financial Industry Business Ontology (FIBO) Loans (LOAN) Loans Specific Module"],
   :rdf/type [:owl/NamedIndividual :fibo-fnd-utl-av/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MetadataLOANLoansSpecific/",
   :rdfs/label "loans specific module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})