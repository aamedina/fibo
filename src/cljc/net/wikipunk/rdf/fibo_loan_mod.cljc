(ns net.wikipunk.rdf.fibo-loan-mod
  "The FIBO Loan domain defines concepts that are common to loans in various market categories including but not limited to commercial, small business, automobile, education and mortgage. High-level concepts relevant to loan contracts include the obligations of parties playing different roles, credit and risk, security agreements as well as additional detail for HMDA-specific loans. Details defining debt instruments in general are covered in a separate debt module in the Securities domain."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 EDM Council, Inc."
                       "Copyright (c) 2018-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/MetadataLOAN/LOANDomain",
   :dcterms/abstract
   "The FIBO Loan domain defines concepts that are common to loans in various market categories including but not limited to commercial, small business, automobile, education and mortgage. High-level concepts relevant to loan contracts include the obligations of parties playing different roles, credit and risk, security agreements as well as additional detail for HMDA-specific loans. Details defining debt instruments in general are covered in a separate debt module in the Securities domain.",
   :dcterms/issued #inst "2018-03-31T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-02-03T23:00:00.000-00:00",
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansSpecific/MetadataLOANLoansSpecific/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansGeneral/MetadataLOANLoansGeneral/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/RealEstateLoans/MetadataLOANRealEstateLoans/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/MetadataLOAN/",
   :rdf/ns-prefix-map
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-loan-mod",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/LOAN/MetadataLOAN/",
   :rdfs/label "Metadata for the EDMC-FIBO Loans (LOAN) Domain"})

(def LOANDomain
  "The FIBO Loan domain defines concepts that are common to loans in various market categories including but not limited to commercial, small business, automobile, education and mortgage. High-level concepts relevant to loan contracts include the obligations of parties playing different roles, credit and risk, security agreements as well as additional detail for HMDA-specific loans. Details defining debt instruments in general are covered in a separate debt module in the Securities domain."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 EDM Council, Inc."
                       "Copyright (c) 2018-2023 Object Management Group, Inc."],
   :db/ident :fibo-loan-mod/LOANDomain,
   :dcterms/abstract
   "The FIBO Loan domain defines concepts that are common to loans in various market categories including but not limited to commercial, small business, automobile, education and mortgage. High-level concepts relevant to loan contracts include the obligations of parties playing different roles, credit and risk, security agreements as well as additional detail for HMDA-specific loans. Details defining debt instruments in general are covered in a separate debt module in the Securities domain.",
   :dcterms/contributor
   ["Adaptive, Inc."
    "Hypercube Ltd."
    "John F. Gemski"
    "Semantic Arts, Inc."
    "Wells Fargo"
    "agnos.ai U.K. Ltd"
    "Tahoe Blue Ltd"
    "Office of Financial Research (US Dept of the Treasury)"
    "Federated Knowledge LLC"
    "Thematix Partners LLC"],
   :dcterms/hasPart [:fibo-loan-ln-mod/LoansGeneralModule
                     :fibo-loan-spc-mod/LoansSpecificModule
                     :fibo-loan-reln-mod/RealEstateLoansModule],
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/title
   ["FIBO LOAN Domain"
    "EDMC Financial Industry Business Ontology (FIBO) Loans (LOAN) Domain"],
   :rdf/type [:owl/NamedIndividual :fibo-fnd-utl-av/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/MetadataLOAN/",
   :rdfs/label "loan domain",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})