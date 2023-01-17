(ns net.wikipunk.rdf.fibo-bp-mod
  "The Business Process (BP) domain includes ontologies that define financial process flows such as securities issuance and transaction workflows. In the case of securities issuance process models, these are provided in order to be able to represent reference data concepts that are dependent on the process by which a security was issued. Transaction process semantics provide the basis for the temporal dimension of securities and derivatives transactions. These are process models represented using basic semantic primitive concepts of events, activities and control flows."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BP/MetadataBP/BPDomain",
   :dcterms/abstract
   "The Business Process (BP) domain includes ontologies that define financial process flows such as securities issuance and transaction workflows. In the case of securities issuance process models, these are provided in order to be able to represent reference data concepts that are dependent on the process by which a security was issued. Transaction process semantics provide the basis for the temporal dimension of securities and derivatives transactions.  These are process models represented using basic semantic primitive concepts of events, activities and control flows.",
   :dcterms/issued #inst "2020-04-06T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/Process/MetadataBPProcess/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/MetadataBPSecuritiesIssuance/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/MetadataBP/",
   :rdf/ns-prefix-map
   {"dcterms"     "http://purl.org/dc/terms/",
    "fibo-bp-iss-mod"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MetadataBPSecuritiesIssuance/",
    "fibo-bp-mod" "https://spec.edmcouncil.org/fibo/ontology/BP/MetadataBP/",
    "fibo-bp-prc-mod"
    "https://spec.edmcouncil.org/fibo/ontology/BP/Process/MetadataBPProcess/",
    "owl"         "http://www.w3.org/2002/07/owl#",
    "rdf"         "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"        "http://www.w3.org/2000/01/rdf-schema#",
    "sm"          "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"         "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://spec.edmcouncil.org/fibo/ontology/BP/MetadataBP/",
   :rdfa/prefix "fibo-bp-mod",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/BP/MetadataBP/",
   :rdfs/label "Metadata for the EDMC-FIBO Business Process (BP) Domain",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright "Copyright (c) 2013-2020 EDM Council, Inc.",
   :sm/fileAbbreviation "fibo-bp-mod",
   :sm/filename "MetadataBP.rdf"})

(def BPDomain
  "The Business Process (BP) domain includes ontologies that define financial process flows such as securities issuance and transaction workflows. In the case of securities issuance process models, these are provided in order to be able to represent reference data concepts that are dependent on the process by which a security was issued. Transaction process semantics provide the basis for the temporal dimension of securities and derivatives transactions. These are process models represented using basic semantic primitive concepts of events, activities and control flows."
  {:db/ident :fibo-bp-mod/BPDomain,
   :dcterms/abstract
   "The Business Process (BP) domain includes ontologies that define financial process flows such as securities issuance and transaction workflows. In the case of securities issuance process models, these are provided in order to be able to represent reference data concepts that are dependent on the process by which a security was issued. Transaction process semantics provide the basis for the temporal dimension of securities and derivatives transactions.  These are process models represented using basic semantic primitive concepts of events, activities and control flows.",
   :dcterms/hasPart [:fibo-bp-iss-mod/SecuritiesIssuanceModule
                     :fibo-bp-prc-mod/ProcessModule],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/fibo/ontology/BP/MetadataBP/",
   :rdfs/label "Business Process Domain",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"],
   :sm/copyright "Copyright (c) 2013-2020 EDM Council, Inc.",
   :sm/moduleAbbreviation "fibo-bp"})