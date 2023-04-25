(ns net.wikipunk.rdf.fibo-spec
  "This is the metadata ontology used to describe the FIBO Specification."
  {:cmns-av/copyright ["Copyright (c) 2013-2023 Object Management Group, Inc."
                       "Copyright (c) 2013-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/fibo/master/MetadataFIBO.rdf",
   :dcterms/abstract
   "This is the metadata ontology used to describe the FIBO Specification.",
   :dcterms/issued #inst "2018-03-31T22:00:00.000-00:00",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-02-13T23:00:00.000-00:00",
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/DER/MetadataDER/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/MetadataFND/"
    "https://spec.edmcouncil.org/fibo/ontology/MD/MetadataMD/"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/MetadataLOAN/"
    "https://spec.edmcouncil.org/fibo/ontology/CAE/MetadataCAE/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/MetadataFBC/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/BP/MetadataBP/"
    "https://spec.edmcouncil.org/fibo/ontology/BE/MetadataBE/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/MetadataSEC/"
    "https://spec.edmcouncil.org/fibo/ontology/IND/MetadataIND/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/20230201/MetadataFIBO/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-mod" "https://spec.edmcouncil.org/fibo/ontology/BE/MetadataBE/",
    "fibo-bp-mod" "https://spec.edmcouncil.org/fibo/ontology/BP/MetadataBP/",
    "fibo-cae-mod" "https://spec.edmcouncil.org/fibo/ontology/CAE/MetadataCAE/",
    "fibo-der-mod" "https://spec.edmcouncil.org/fibo/ontology/DER/MetadataDER/",
    "fibo-fbc-mod" "https://spec.edmcouncil.org/fibo/ontology/FBC/MetadataFBC/",
    "fibo-fnd-mod" "https://spec.edmcouncil.org/fibo/ontology/FND/MetadataFND/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-mod" "https://spec.edmcouncil.org/fibo/ontology/IND/MetadataIND/",
    "fibo-loan-mod"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/MetadataLOAN/",
    "fibo-md-mod" "https://spec.edmcouncil.org/fibo/ontology/MD/MetadataMD/",
    "fibo-sec-mod" "https://spec.edmcouncil.org/fibo/ontology/SEC/MetadataSEC/",
    "fibo-spec" "https://spec.edmcouncil.org/fibo/ontology/MetadataFIBO/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-spec",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/MetadataFIBO/",
   :rdfs/label "Metadata for the EDMC-FIBO Specification"})

(def FIBOSpecification
  "The Financial Industry Business Ontology (FIBO) is a collaborative effort among industry practitioners, semantic technology experts and information scientists to standardize the language used to precisely define the terms, conditions, and characteristics of financial instruments; the legal and relationship structure of business entities; the content and time dimensions of market data; and the legal obligations and process aspects of corporate actions. The definitions and relationships that comprise the FIBO specification have been modularized into a number of domains, which in turn include a number of modules, each of which is further modularized into one or more constituent ontologies. The FIBO ontologies are available as OWL 2 ontologies from the EDM Council site, and as UML models that are compliant with the Semantics for Information Modeling and Federation (SMIF) draft specification, and are linked at https://spec.edmcouncil.org/fibo/ontology/ ."
  {:cmns-av/copyright ["Copyright (c) 2013-2023 EDM Council, Inc."
                       "Copyright (c) 2013-2023 Object Management Group, Inc."],
   :db/ident :fibo-spec/FIBOSpecification,
   :dcterms/abstract
   "The Financial Industry Business Ontology (FIBO) is a collaborative effort among industry practitioners, semantic technology experts and information scientists to standardize the language used to precisely define the terms, conditions, and characteristics of financial instruments; the legal and relationship structure of business entities; the content and time dimensions of market data; and the legal obligations and process aspects of corporate actions.  The definitions and relationships that comprise the FIBO specification have been modularized into a number of domains, which in turn include a number of modules, each of which is further modularized into one or more constituent ontologies. \n\nThe FIBO ontologies are available as OWL 2 ontologies from the EDM Council site, and as UML models that are compliant with the Semantics for Information Modeling and Federation (SMIF) draft specification, and are linked at https://spec.edmcouncil.org/fibo/ontology/ .",
   :dcterms/hasPart [:fibo-fbc-mod/FBCDomain
                     :fibo-der-mod/DERDomain
                     :fibo-bp-mod/BPDomain
                     :fibo-loan-mod/LOANDomain
                     :fibo-sec-mod/SECDomain
                     :fibo-fnd-mod/FNDDomain
                     :fibo-be-mod/BEDomain
                     :fibo-cae-mod/CAEDomain
                     :fibo-md-mod/MDDomain
                     :fibo-ind-mod/INDDomain],
   :dcterms/issued #inst "2018-03-31T22:00:00.000-00:00",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-02-13T23:00:00.000-00:00",
   :dcterms/title "Financial Industry Business Ontology (FIBO)",
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/label "Financial Industry Business Ontology",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})