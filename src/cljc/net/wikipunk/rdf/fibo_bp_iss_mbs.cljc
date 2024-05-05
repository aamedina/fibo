(ns net.wikipunk.rdf.fibo-bp-iss-mbs
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/MBSIssuance/",
   :dcterms/abstract
   "Ontology of the overall process of issuing mortgage backed securities. These are the process elements that are common to different kinds of MBS issuance (agency and private label).",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-bp-iss-dbti"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
    "fibo-bp-iss-mbs"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MBSIssuance/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/DebtIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/IssuanceDocuments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Agreements/Contracts/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/MBSIssuance/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-bp-iss-mbs",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MBSIssuance/",
   :rdfs/label "MBSIssuance",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MBSIssuance/"})

(def MBSSecuritizationProcess
  {:db/ident :fibo-bp-iss-mbs/MBSSecuritizationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MBSIssuance/"},
   :rdfs/label "m b s securitization process",
   :rdfs/subClassOf :fibo-bp-iss-dbti/PoolBackedSecuritySecuritizationProcess})

(def ProspectusPart
  {:cmns-av/explanatoryNote
   "This may for example be a termsheet, information about tranche breakdown and so on. These are defined as separate information entities in as far as each of these has some specific individual relationship to some other information deliverable, such as a draft of each part which is defined in separate process activities but becomes part of the whole prospectus. Term origin:MBS PoC Reviews",
   :db/ident :fibo-bp-iss-mbs/ProspectusPart,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MBSIssuance/"},
   :rdfs/label "prospectus part",
   :rdfs/subClassOf :fibo-fnd-agr-ctr/ContractualElement,
   :skos/definition
   "A part or section of a prospectus for a securities issue."})

(def includesDetailsAbout
  {:db/ident :fibo-bp-iss-mbs/includesDetailsAbout,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MBSIssuance/"},
   :rdfs/label "includes details about"})

(def urn:uuid:c4c95ce9-5cec-58ff-b324-bae2f66af147
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcterms/abstract
   "Ontology of the overall process of issuing mortgage backed securities. These are the process elements that are common to different kinds of MBS issuance (agency and private label).",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/DebtIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/IssuanceDocuments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Agreements/Contracts/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/MBSIssuance/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "MBSIssuance",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MBSIssuance/"})