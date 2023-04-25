(ns net.wikipunk.rdf.fibo-loan-reln-mod
  "This module contains ontologies defining concepts that apply to loans related to land and anything permanently attached to it, whether natural or man-made, including but not limited to construction loans."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 Object Management Group, Inc."
                       "Copyright (c) 2018-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MetadataLOANRealEstateLoans/RealEstateLoansModule",
   :dcterms/abstract
   "This module contains ontologies defining concepts that apply to loans related to land and anything permanently attached to it, whether natural or man-made, including but not limited to construction loans.",
   :dcterms/issued #inst "2018-03-31T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-03-31T22:00:00.000-00:00",
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/RealEstateLoans/MetadataLOANRealEstateLoans/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-loan-reln-mod"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MetadataLOANRealEstateLoans/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-loan-reln-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MetadataLOANRealEstateLoans/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Loans (LOAN) Real Estate Loans Module"})

(def RealEstateLoansModule
  "This module contains ontologies defining concepts that apply to related to land and anything permanently attached to it, whether natural or man-made, including but not limited to construction loans."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 Object Management Group, Inc."
                       "Copyright (c) 2018-2023 EDM Council, Inc."],
   :db/ident :fibo-loan-reln-mod/RealEstateLoansModule,
   :dcterms/abstract
   "This module contains ontologies defining concepts that apply to related to land and anything permanently attached to it, whether natural or man-made, including but not limited to construction loans.",
   :dcterms/contributor
   ["Tahoe Blue Ltd"
    "Thematix Partners LLC"
    "Federated Knowledge LLC"
    "Semantic Arts, Inc."
    "agnos.ai U.K. Ltd"
    "Adaptive, Inc."
    "John F. Gemski"
    "Wells Fargo"
    "Office of Financial Research (US Dept of the Treasury)"
    "Hypercube Ltd."],
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/HomeMortgageDisclosureActCoveredMortgages/"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"],
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/title
   ["FIBO LOAN Real Estate Loans Module"
    "Financial Industry Business Ontology (FIBO) Loans (LOAN) Real Estate Loans Module"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MetadataLOANRealEstateLoans/",
   :rdfs/label "real estate loans module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})