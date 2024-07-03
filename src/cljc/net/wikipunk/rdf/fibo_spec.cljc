(ns net.wikipunk.rdf.fibo-spec
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/MetadataFIBO/FIBOSpecification",
   :dcterms/abstract
   "This is the metadata ontology used to describe the FIBO Specification.",
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-13T18:00:00.000-00:00",
   :namespaces
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
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/MetadataIND/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/MetadataSEC/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/MetadataDER/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/MetadataFBC/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/MetadataFND/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/MD/MetadataMD/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/LOAN/MetadataLOAN/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/CAE/MetadataCAE/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/MetadataBE/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BP/MetadataBP/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/MetadataFIBO/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-spec",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/MetadataFIBO/",
   :rdfs/label "Metadata for the EDMC-FIBO Specification",
   :xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/MetadataFIBO/"})

(def FIBOSpecification
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :db/ident :fibo-spec/FIBOSpecification,
   :dcterms/abstract
   "The Financial Industry Business Ontology (FIBO) is a collaborative effort among industry practitioners, semantic technology experts and information scientists to standardize the language used to precisely define the terms, conditions, and characteristics of financial instruments; the legal and relationship structure of business entities; the content and time dimensions of market data; and the legal obligations and process aspects of corporate actions.  The definitions and relationships that comprise the FIBO specification have been modularized into a number of domains, which in turn include a number of modules, each of which is further modularized into one or more constituent ontologies. \n\nThe FIBO ontologies are available as OWL 2 ontologies from the EDM Council site, and as UML models that are compliant with the Semantics for Information Modeling and Federation (SMIF) draft specification, and are linked at https://spec.edmcouncil.org/fibo/ontology/ .",
   :dcterms/hasPart #{:fibo-cae-mod/CAEDomain :fibo-sec-mod/SECDomain
                      :fibo-fbc-mod/FBCDomain :fibo-fnd-mod/FNDDomain
                      :fibo-ind-mod/INDDomain :fibo-loan-mod/LOANDomain
                      :fibo-bp-mod/BPDomain :fibo-be-mod/BEDomain
                      :fibo-md-mod/MDDomain :fibo-der-mod/DERDomain},
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-13T18:00:00.000-00:00",
   :dcterms/title "Financial Industry Business Ontology (FIBO)",
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/MetadataFIBO/"},
   :rdfs/label "Financial Industry Business Ontology",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:eb2b718c-cacf-52ec-935e-38c22d833dee
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This is the metadata ontology used to describe the FIBO Specification.",
   :dcterms/issued #inst "2018-03-31T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-02-13T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/MetadataIND/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/MetadataSEC/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/MetadataDER/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/MetadataFBC/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/MetadataFND/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/MD/MetadataMD/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/LOAN/MetadataLOAN/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/CAE/MetadataCAE/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/MetadataBE/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BP/MetadataBP/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/MetadataFIBO/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Metadata for the EDMC-FIBO Specification",
   :xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/MetadataFIBO/"})