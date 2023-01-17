(ns net.wikipunk.rdf.fibo-loan-mod
  "The FIBO Loan domain defines concepts that are common to loans in various market categories including but not limited to commercial, small business, automobile, education and mortgage. High-level concepts relevant to loan contracts include the obligations of parties playing different roles, credit and risk, security agreements as well as additional detail for HMDA-specific loans. Details defining debt instruments in general are covered in a separate debt module in the Securities domain."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/MetadataLOAN/LOANDomain",
   :dcterms/abstract
   "The FIBO Loan domain defines concepts that are common to loans in various market categories including but not limited to commercial, small business, automobile, education and mortgage. High-level concepts relevant to loan contracts include the obligations of parties playing different roles, credit and risk, security agreements as well as additional detail for HMDA-specific loans. Details defining debt instruments in general are covered in a separate debt module in the Securities domain.",
   :dcterms/issued #inst "2022-06-10T22:00:00.000-00:00",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansSpecific/MetadataLOANLoansSpecific/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansGeneral/MetadataLOANLoansGeneral/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/RealEstateLoans/MetadataLOANRealEstateLoans/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/MetadataLOAN/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
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
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://spec.edmcouncil.org/fibo/ontology/LOAN/MetadataLOAN/",
   :rdfa/prefix "fibo-loan-mod",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/LOAN/MetadataLOAN/",
   :rdfs/label "Metadata for the EDMC-FIBO Loans (LOAN) Domain",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference",
   :sm/copyright ["Copyright (c) 2014-2022 EDM Council, Inc."
                  "Copyright (c) 2022 Object Management Group, Inc."],
   :sm/fileAbbreviation "fibo-loan-mod",
   :sm/filename "MetadataLOAN.rdf"})

(def LOANDomain
  "The FIBO Loan domain defines concepts that are common to loans in various market categories including but not limited to commercial, small business, automobile, education and mortgage. High-level concepts relevant to loan contracts include the obligations of parties playing different roles, credit and risk, security agreements as well as additional detail for HMDA-specific loans. Details defining debt instruments in general are covered in a separate debt module in the Securities domain."
  {:db/ident :fibo-loan-mod/LOANDomain,
   :dcterms/abstract
   "The FIBO Loan domain defines concepts that are common to loans in various market categories including but not limited to commercial, small business, automobile, education and mortgage. High-level concepts relevant to loan contracts include the obligations of parties playing different roles, credit and risk, security agreements as well as additional detail for HMDA-specific loans. Details defining debt instruments in general are covered in a separate debt module in the Securities domain.",
   :dcterms/hasPart [:fibo-loan-ln-mod/LoansGeneralModule
                     :fibo-loan-spc-mod/LoansSpecificModule
                     :fibo-loan-reln-mod/RealEstateLoansModule],
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/title
   "EDMC Financial Industry Business Ontology (FIBO) Loans (LOAN) Domain",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/MetadataLOAN/",
   :rdfs/label "Loans",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"],
   :sm/contributor ["Wells Fargo"
                    "Thematix Partners LLC"
                    "Federated Knowledge LLC"
                    "Office of Financial Research (US Dept of the Treasury)"
                    "John F. Gemski"
                    "Semantic Arts, Inc."
                    "Hypercube Ltd."
                    "Adaptive, Inc."
                    "Tahoe Blue Ltd"],
   :sm/copyright ["Copyright (c) 2022 Object Management Group, Inc."
                  "Copyright (c) 2014-2022 EDM Council, Inc."],
   :sm/dependsOn [:fibo-fbc-mod/FBCDomain
                  :fibo-be-mod/BEDomain
                  :fibo-fnd-mod/FNDDomain
                  "http://www.omg.org/techprocess/ab/SpecificationMetadata/"
                  :fibo-ind-mod/INDDomain],
   :sm/keyword ["loans"
                "debt instruments"
                "mortgages"
                "financial instruments"
                "loan contracts"],
   :sm/moduleAbbreviation "fibo-loan"})