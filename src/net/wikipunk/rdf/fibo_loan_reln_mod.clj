(ns net.wikipunk.rdf.fibo-loan-reln-mod
  "This module contains ontologies defining concepts that apply to loans related to land and anything permanently attached to it, whether natural or man-made, including but not limited to construction loans."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MetadataLOANRealEstateLoans/RealEstateLoansModule",
   :dcterms/abstract
   "This module contains ontologies defining concepts that apply to loans related to land and anything permanently attached to it, whether natural or man-made, including but not limited to construction loans.",
   :dcterms/issued #inst "2022-06-10T22:00:00.000-00:00",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/RealEstateLoans/MetadataLOANRealEstateLoans/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-loan-reln-mod"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MetadataLOANRealEstateLoans/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MetadataLOANRealEstateLoans/",
   :rdfa/prefix "fibo-loan-reln-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MetadataLOANRealEstateLoans/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Loans (LOAN) Real Estate Loans Module",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference",
   :sm/copyright ["Copyright (c) 2022 Object Management Group, Inc."
                  "Copyright (c) 2022 EDM Council, Inc."],
   :sm/fileAbbreviation "fibo-loan-reln-mod",
   :sm/filename "MetadataLOANRealEstateLoans.rdf"})

(def RealEstateLoansModule
  "This module contains ontologies defining concepts that apply to related to land and anything permanently attached to it, whether natural or man-made, including but not limited to construction loans."
  {:db/ident :fibo-loan-reln-mod/RealEstateLoansModule,
   :dcterms/abstract
   "This module contains ontologies defining concepts that apply to related to land and anything permanently attached to it, whether natural or man-made, including but not limited to construction loans.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/HomeMortgageDisclosureActCoveredMortgages/"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/"],
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/title "FIBO LOAN - Real Estate Loans Module",
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MetadataLOANRealEstateLoans/",
   :rdfs/label "FIBO LOAN Real Estate Loans Module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"],
   :sm/contributor ["Thematix Partners LLC"
                    "Federated Knowledge LLC"
                    "Wells Fargo"
                    "Semantic Arts, Inc."
                    "Office of Financial Research (US Dept of the Treasury)"
                    "John F. Gemski"
                    "Adaptive, Inc."
                    "Hypercube Ltd."
                    "Tahoe Blue Ltd"],
   :sm/copyright ["Copyright (c) 2022 Object Management Group, Inc."
                  "Copyright (c) 2014-2022 EDM Council, Inc."],
   :sm/moduleAbbreviation "fibo-loan-reln"})