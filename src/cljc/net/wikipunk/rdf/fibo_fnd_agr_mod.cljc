(ns net.wikipunk.rdf.fibo-fnd-agr-mod
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/MetadataFNDAgreements/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-fnd-agr-mod"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/MetadataFNDAgreements/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-fnd-agr-mod",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/MetadataFNDAgreements/AgreementsModule"}
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Agreements Module.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-20T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/MetadataFNDAgreements/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Agreements Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/MetadataFNDAgreements/"})

(def AgreementsModule
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :db/ident :fibo-fnd-agr-mod/AgreementsModule,
   :dcterms/abstract
   "This module includes ontologies describing agreements between parties and contracts that formalize those agreements. These cover written and verbal contracts, including contracts which may be transferred from one party to another. The latter form the basis for financial securities contracts. The Contracts ontology also describes fundamental properties of contracts such as contractual terms, contract parties and so on, many of which form the basis for more specialized financial industry concepts such as interest payment terms, bond issuers and so on.",
   :dcterms/hasPart
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/"}},
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"Financial Industry Business Ontology (FIBO) Foundations (FND) Agreements Module"
     "FIBO FND Agreements Module"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/MetadataFNDAgreements/"},
   :rdfs/label "agreements module",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:11029dc5-c694-55c4-924b-d3f1e0b628d5
  {:cmns-av/copyright #{"Copyright (c) 2017-2023 Object Management Group, Inc."
                        "Copyright (c) 2017-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Agreements Module.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-01-20T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/MetadataFNDAgreements/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Agreements Module",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/MetadataFNDAgreements/"})