(ns net.wikipunk.rdf.fibo-der-cr-mod
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/DER/CreditDerivatives/MetadataDERCreditDerivatives/CreditDerivativesModule",
   :dcterms/abstract
   "The credit derivatives module covers derivatives that allow either the lender or borrower to transfer the credit risk, or risk of default, to another party other than the lender or debtholder.",
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-03T18:00:00.000-00:00",
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-der-cr-mod"
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/MetadataDERCreditDerivatives/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/DER/CreditDerivatives/MetadataDERCreditDerivatives/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-der-cr-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/MetadataDERCreditDerivatives/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Derivatives (DER) Credit Derivatives Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/MetadataDERCreditDerivatives/"})

(def CreditDerivativesModule
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :db/ident :fibo-der-cr-mod/CreditDerivativesModule,
   :dcterms/abstract
   "The credit derivatives module covers derivatives that allow either the lender or borrower to transfer the credit risk, or risk of default, to another party other than the lender or debtholder.",
   :dcterms/hasPart
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"FIBO DER Credit Derivatives Module"
     "Financial Industry Business Ontology (FIBO) Derivatives (DER) Credit Derivatives Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/MetadataDERCreditDerivatives/"},
   :rdfs/label "credit derivatives module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:7ccff6a3-34b9-5ed8-9889-74d772ebbb89
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcterms/abstract
   "The credit derivatives module covers derivatives that allow either the lender or borrower to transfer the credit risk, or risk of default, to another party other than the lender or debtholder.",
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-03T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/DER/CreditDerivatives/MetadataDERCreditDerivatives/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Metadata about the EDMC-FIBO Derivatives (DER) Credit Derivatives Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/MetadataDERCreditDerivatives/"})