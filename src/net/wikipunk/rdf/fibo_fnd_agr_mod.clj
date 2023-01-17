(ns net.wikipunk.rdf.fibo-fnd-agr-mod
  "This is the metadata ontology used to describe the Foundations Agreements Module."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 Object Management Group, Inc."
                       "Copyright (c) 2017-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/MetadataFNDAgreements/AgreementsModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Agreements Module.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-01-20T23:00:00.000-00:00",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/MetadataFNDAgreements/",
   :rdf/ns-prefix-map
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
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/MetadataFNDAgreements/",
   :rdfa/prefix "fibo-fnd-agr-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/MetadataFNDAgreements/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Foundations (FND) Agreements Module"})

(def AgreementsModule
  "This module includes ontologies describing agreements between parties and contracts that formalize those agreements. These cover written and verbal contracts, including contracts which may be transferred from one party to another. The latter form the basis for financial securities contracts. The Contracts ontology also describes fundamental properties of contracts such as contractual terms, contract parties and so on, many of which form the basis for more specialized financial industry concepts such as interest payment terms, bond issuers and so on."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 Object Management Group, Inc."
                       "Copyright (c) 2017-2023 EDM Council, Inc."],
   :db/ident :fibo-fnd-agr-mod/AgreementsModule,
   :dcterms/abstract
   "This module includes ontologies describing agreements between parties and contracts that formalize those agreements. These cover written and verbal contracts, including contracts which may be transferred from one party to another. The latter form the basis for financial securities contracts. The Contracts ontology also describes fundamental properties of contracts such as contractual terms, contract parties and so on, many of which form the basis for more specialized financial industry concepts such as interest payment terms, bond issuers and so on.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/"],
   :dcterms/license "https://opensource.org/licenses/MIT",
   :dcterms/title
   ["FIBO FND Agreements Module"
    "Financial Industry Business Ontology (FIBO) Foundations (FND) Agreements Module"],
   :rdf/type [:owl/NamedIndividual :fibo-fnd-utl-av/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/MetadataFNDAgreements/",
   :rdfs/label "agreements module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})