(ns net.wikipunk.rdf.fibo-bp-mod
  "The Business Process (BP) domain includes ontologies that define financial process flows such as securities issuance and transaction workflows. In the case of securities issuance process models, these are provided in order to be able to represent reference data concepts that are dependent on the process by which a security was issued. Transaction process semantics provide the basis for the temporal dimension of securities and derivatives transactions. These are process models represented using basic semantic primitive concepts of events, activities and control flows."
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BP/MetadataBP/BPDomain",
   :dcterms/abstract
   "The Business Process (BP) domain includes ontologies that define financial process flows such as securities issuance and transaction workflows. In the case of securities issuance process models, these are provided in order to be able to represent reference data concepts that are dependent on the process by which a security was issued. Transaction process semantics provide the basis for the temporal dimension of securities and derivatives transactions.  These are process models represented using basic semantic primitive concepts of events, activities and control flows.",
   :dcterms/issued #inst "2018-03-01T23:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-03-31T22:00:00.000-00:00",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/Process/MetadataBPProcess/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/MetadataBPSecuritiesIssuance/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/MetadataBP/",
   :rdf/ns-prefix-map
   {"cmns-av"     "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms"     "http://purl.org/dc/terms/",
    "fibo-bp-iss-mod"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MetadataBPSecuritiesIssuance/",
    "fibo-bp-mod" "https://spec.edmcouncil.org/fibo/ontology/BP/MetadataBP/",
    "fibo-bp-prc-mod"
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/MetadataBPProcess/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl"         "http://www.w3.org/2002/07/owl#",
    "rdf"         "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"        "http://www.w3.org/2000/01/rdf-schema#",
    "xsd"         "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-bp-mod",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/BP/MetadataBP/",
   :rdfs/label "Metadata for the EDMC-FIBO Business Process (BP) Domain"})

(def BPDomain
  "The Business Process (BP) domain includes ontologies that define financial process flows such as securities issuance and transaction workflows. In the case of securities issuance process models, these are provided in order to be able to represent reference data concepts that are dependent on the process by which a security was issued. Transaction process semantics provide the basis for the temporal dimension of securities and derivatives transactions. These are process models represented using basic semantic primitive concepts of events, activities and control flows."
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :db/ident :fibo-bp-mod/BPDomain,
   :dcterms/abstract
   "The Business Process (BP) domain includes ontologies that define financial process flows such as securities issuance and transaction workflows. In the case of securities issuance process models, these are provided in order to be able to represent reference data concepts that are dependent on the process by which a security was issued. Transaction process semantics provide the basis for the temporal dimension of securities and derivatives transactions.  These are process models represented using basic semantic primitive concepts of events, activities and control flows.",
   :dcterms/hasPart [:fibo-bp-iss-mod/SecuritiesIssuanceModule
                     :fibo-bp-prc-mod/ProcessModule],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Business Process (BP) Domain"
    "FIBO BP Domain"],
   :rdf/type [:owl/NamedIndividual :fibo-fnd-utl-av/Module],
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/fibo/ontology/BP/MetadataBP/",
   :rdfs/label "business process domain",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})