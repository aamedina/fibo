(ns net.wikipunk.rdf.fibo-loan-spc-mod
  "This module contains ontologies of concepts descriptive of a range of loans, excluding real estate, including commercial and consumer, loans differentiated by purpose, and their differentiating characteristics."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MetadataLOANLoansSpecific/LoansSpecificModule",
   :dcterms/abstract
   "This module contains ontologies of concepts descriptive of a range of loans, excluding real estate, including commercial and consumer, loans differentiated by purpose, and their differentiating characteristics.",
   :dcterms/issued #inst "2022-06-10T22:00:00.000-00:00",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansSpecific/MetadataLOANLoansSpecific/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-loan-spc-mod"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MetadataLOANLoansSpecific/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MetadataLOANLoansSpecific/",
   :rdfa/prefix "fibo-loan-spc-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MetadataLOANLoansSpecific/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Loans (LOAN) Loans - Specific Module",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference",
   :sm/copyright "Copyright (c) 2014-2022 EDM Council, Inc.",
   :sm/fileAbbreviation "fibo-loan-spc-mod",
   :sm/filename "MetadataLOANLoansSpecific.rdf"})

(def LoansSpecificModule
  "This module contains ontologies of concepts descriptive of a range of loans, excluding real estate, including commercial and consumer, loans differentiated by purpose, and their differentiating characteristics."
  {:db/ident :fibo-loan-spc-mod/LoansSpecificModule,
   :dcterms/abstract
   "This module contains ontologies of concepts descriptive of a range of loans, excluding real estate, including commercial and consumer, loans differentiated by purpose, and their differentiating characteristics.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/StudentLoans/"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/ConsumerLoans/"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CommercialLoans/"],
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/title "FIBO LOAN - Loans Specific Module",
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MetadataLOANLoansSpecific/",
   :rdfs/label "Loans - Specific Module",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/contributor ["Tahoe Blue Ltd"
                    "Thematix Partners LLC"
                    "John F. Gemski"
                    "Adaptive, Inc."
                    "Federated Knowledge LLC"
                    "Wells Fargo"
                    "Office of Financial Research (US Dept of the Treasury)"
                    "Semantic Arts, Inc."
                    "Hypercube Ltd."],
   :sm/copyright "Copyright (c) 2014-2022 EDM Council, Inc.",
   :sm/moduleAbbreviation "fibo-loan-spc"})