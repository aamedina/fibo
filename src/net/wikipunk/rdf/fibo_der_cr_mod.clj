(ns net.wikipunk.rdf.fibo-der-cr-mod
  "The credit derivatives module covers derivatives that allow either the lender or borrower to transfer the credit risk, or risk of default, to another party other than the lender or debtholder."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/MetadataDERCreditDerivatives/CreditDerivativesModule",
   :dcterms/abstract
   "The credit derivatives module covers derivatives that allow either the lender or borrower to transfer the credit risk, or risk of default, to another party other than the lender or debtholder.",
   :dcterms/issued #inst "2022-12-30T23:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "http://www.omg.org/techprocess/ab/SpecificationMetadata/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/CreditDerivatives/MetadataDERCreditDerivatives/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-der-cr-mod"
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/MetadataDERCreditDerivatives/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/MetadataDERCreditDerivatives/",
   :rdfa/prefix "fibo-der-cr-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/MetadataDERCreditDerivatives/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Derivatives (DER) Credit Derivatives Module",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2018-2022 Object Management Group, Inc."
                  "Copyright (c) 2018-2022 EDM Council, Inc."],
   :sm/fileAbbreviation "fibo-der-cr-mod",
   :sm/filename "MetadataDERCreditDerivatives.rdf"})

(def CreditDerivativesModule
  "The credit derivatives module covers derivatives that allow either the lender or borrower to transfer the credit risk, or risk of default, to another party other than the lender or debtholder."
  {:db/ident :fibo-der-cr-mod/CreditDerivativesModule,
   :dcterms/abstract
   "The credit derivatives module covers derivatives that allow either the lender or borrower to transfer the credit risk, or risk of default, to another party other than the lender or debtholder.",
   :dcterms/hasPart
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "EDMC Financial Industry Business Ontology (FIBO) Derivatives (DER) Credit Derivatives Module",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/MetadataDERCreditDerivatives/",
   :rdfs/label "Credit Derivatives",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/copyright ["Copyright (c) 2018-2022 EDM Council, Inc."
                  "Copyright (c) 2018-2022 Object Management Group, Inc."],
   :sm/moduleAbbreviation "fibo-der-cr"})