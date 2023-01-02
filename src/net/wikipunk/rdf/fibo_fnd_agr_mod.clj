(ns net.wikipunk.rdf.fibo-fnd-agr-mod
  "This is the metadata ontology used to describe the Foundations Agreements Module."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/MetadataFNDAgreements/AgreementsModule",
   :dcterms/abstract
   "This is the metadata ontology used to describe the Foundations Agreements Module.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/MetadataFNDAgreements/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-agr-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/MetadataFNDAgreements/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/MetadataFNDAgreements/",
   :rdfa/prefix "fibo-fnd-agr-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/MetadataFNDAgreements/",
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Agreements Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright ["Copyright (c) 2017-2018 EDM Council, Inc."
                  "Copyright (c) 2017-2018 Object Management Group, Inc."],
   :sm/fileAbbreviation "fibo-fnd-agr-mod",
   :sm/filename "MetadataFNDAgreements.rdf"})

(def AgreementsModule
  "This module includes ontologies describing agreements between parties and contracts that formalize those agreements. These cover written and verbal contracts, including contracts which may be transferred from one party to another. The latter form the basis for financial securities contracts. The Contracts ontology also describes fundamental properties of contracts such as contractual terms, contract parties and so on, many of which form the basis for more specialized financial industry concepts such as interest payment terms, bond issuers and so on."
  {:db/ident :fibo-fnd-agr-mod/AgreementsModule,
   :dcterms/abstract
   "This module includes ontologies describing agreements between parties and contracts that formalize those agreements.  These cover written and verbal contracts, including contracts which may be transferred from one party to another. The latter form the basis for financial securities contracts.  The Contracts ontology also describes fundamental properties of contracts such as contractual terms, contract parties and so on, many of which form the basis for more specialized financial industry concepts such as interest payment terms, bond issuers and so on.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "Financial Industry Business Ontology (FIBO) Foundations (FND) Agreements Module",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/MetadataFNDAgreements/",
   :rdfs/label "Agreements",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/copyright ["Copyright (c) 2017-2018 Object Management Group, Inc."
                  "Copyright (c) 2017-2018 EDM Council, Inc."],
   :sm/moduleAbbreviation "fibo-fnd-agr"})