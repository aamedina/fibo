(ns net.wikipunk.rdf.fibo-loan-mod
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/LOAN/MetadataLOAN/LOANDomain",
   :dcterms/abstract
   "The FIBO Loan domain defines concepts that are common to loans in various market categories including but not limited to commercial, small business, automobile, education and mortgage. High-level concepts relevant to loan contracts include the obligations of parties playing different roles, credit and risk, security agreements as well as additional detail for HMDA-specific loans. Details defining debt instruments in general are covered in a separate debt module in the Securities domain.",
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-03T18:00:00.000-00:00",
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-loan-ln-mod"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/MetadataLOANLoansGeneral/",
    "fibo-loan-mod"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/MetadataLOAN/",
    "fibo-loan-reln-mod"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MetadataLOANRealEstateLoans/",
    "fibo-loan-spc-mod"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MetadataLOANLoansSpecific/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/LOAN/LoansGeneral/MetadataLOANLoansGeneral/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/LOAN/RealEstateLoans/MetadataLOANRealEstateLoans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/LOAN/LoansSpecific/MetadataLOANLoansSpecific/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/LOAN/MetadataLOAN/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-loan-mod",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/LOAN/MetadataLOAN/",
   :rdfs/label "Metadata for the EDMC-FIBO Loans (LOAN) Domain",
   :xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/LOAN/MetadataLOAN/"})

(def LOANDomain
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :db/ident :fibo-loan-mod/LOANDomain,
   :dcterms/abstract
   "The FIBO Loan domain defines concepts that are common to loans in various market categories including but not limited to commercial, small business, automobile, education and mortgage. High-level concepts relevant to loan contracts include the obligations of parties playing different roles, credit and risk, security agreements as well as additional detail for HMDA-specific loans. Details defining debt instruments in general are covered in a separate debt module in the Securities domain.",
   :dcterms/contributor
   #{"Semantic Arts, Inc." "John F. Gemski" "Adaptive, Inc." "Tahoe Blue Ltd"
     "Thematix Partners LLC" "Wells Fargo" "agnos.ai U.K. Ltd" "Hypercube Ltd."
     "Federated Knowledge LLC"
     "Office of Financial Research (US Dept of the Treasury)"},
   :dcterms/hasPart #{:fibo-loan-spc-mod/LoansSpecificModule
                      :fibo-loan-reln-mod/RealEstateLoansModule
                      :fibo-loan-ln-mod/LoansGeneralModule},
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"FIBO LOAN Domain"
     "EDMC Financial Industry Business Ontology (FIBO) Loans (LOAN) Domain"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/LOAN/MetadataLOAN/"},
   :rdfs/label "loan domain",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:98cca302-3dd6-5adb-8f88-839bd44fe7a9
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcterms/abstract
   "The FIBO Loan domain defines concepts that are common to loans in various market categories including but not limited to commercial, small business, automobile, education and mortgage. High-level concepts relevant to loan contracts include the obligations of parties playing different roles, credit and risk, security agreements as well as additional detail for HMDA-specific loans. Details defining debt instruments in general are covered in a separate debt module in the Securities domain.",
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-03T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/LOAN/LoansGeneral/MetadataLOANLoansGeneral/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/LOAN/RealEstateLoans/MetadataLOANRealEstateLoans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/LOAN/LoansSpecific/MetadataLOANLoansSpecific/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/LOAN/MetadataLOAN/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Metadata for the EDMC-FIBO Loans (LOAN) Domain",
   :xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/LOAN/MetadataLOAN/"})