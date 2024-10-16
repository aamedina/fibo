(ns net.wikipunk.rdf.fibo-loan-spc-mod
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/LOAN/LoansSpecific/MetadataLOANLoansSpecific/LoansSpecificModule",
   :dcterms/abstract
   "This module contains ontologies of concepts descriptive of a range of loans, excluding real estate, including commercial and consumer, loans differentiated by purpose, and their differentiating characteristics.",
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-06-27T18:00:00.000-00:00",
   :namespaces
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
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/LOAN/LoansSpecific/MetadataLOANLoansSpecific/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-loan-spc-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MetadataLOANLoansSpecific/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Loans (LOAN) Loans - Specific Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MetadataLOANLoansSpecific/"})

(def LoansSpecificModule
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :db/ident :fibo-loan-spc-mod/LoansSpecificModule,
   :dcterms/abstract
   "This module contains ontologies of concepts descriptive of a range of loans, excluding real estate, including commercial and consumer loans differentiated by purpose.",
   :dcterms/contributor
   #{"Semantic Arts, Inc." "John F. Gemski" "Adaptive, Inc." "Tahoe Blue Ltd"
     "Thematix Partners LLC" "Wells Fargo" "agnos.ai U.K. Ltd" "Hypercube Ltd."
     "Federated Knowledge LLC"
     "Office of Financial Research (US Dept of the Treasury)"},
   :dcterms/hasPart
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/ConsumerLoans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/StudentLoans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CommercialLoans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"}},
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"FIBO LOAN Loans Specific Module"
     "Financial Industry Business Ontology (FIBO) Loans (LOAN) Loans Specific Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MetadataLOANLoansSpecific/"},
   :rdfs/label "loans specific module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:c4a7e4e9-3b3b-54bd-bf58-864cb68a0966
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This module contains ontologies of concepts descriptive of a range of loans, excluding real estate, including commercial and consumer, loans differentiated by purpose, and their differentiating characteristics.",
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-06-27T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/LOAN/LoansSpecific/MetadataLOANLoansSpecific/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata for the EDMC-FIBO Loans (LOAN) Loans - Specific Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MetadataLOANLoansSpecific/"})