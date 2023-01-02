(ns net.wikipunk.rdf.fibo-bp-iss-mod
  "This module contains ontologies of securities issuance process concepts, both for processes common to all securities issuance and variants for common types of equity and debt issuance such as auction and syndication."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MetadataBPSecuritiesIssuance/SecuritiesIssuanceModule",
   :dcterms/abstract
   "This module contains ontologies of securities issuance process concepts, both for processes common to all securities issuance and variants for common types of equity and debt issuance such as auction and syndication.",
   :dcterms/issued #inst "2020-04-06T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/MetadataBPSecuritiesIssuance/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-bp-iss-mod"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MetadataBPSecuritiesIssuance/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MetadataBPSecuritiesIssuance/",
   :rdfa/prefix "fibo-bp-iss-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MetadataBPSecuritiesIssuance/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Business Process (BP) Securities Issuance Module",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright "Copyright (c) 2013-2020 EDM Council, Inc.",
   :sm/fileAbbreviation "fibo-bp-iss-mod",
   :sm/filename "MetadataBPSecuritiesIssuance.rdf"})

(def SecuritiesIssuanceModule
  "This module contains ontologies of securities issuance process concepts, both for processes common to all securities issuance and variants for common types of equity and debt issuance such as auction and syndication."
  {:db/ident :fibo-bp-iss-mod/SecuritiesIssuanceModule,
   :dcterms/abstract
   "This module contains ontologies of securities issuance process concepts, both for processes common to all securities issuance and variants for common types of equity and debt issuance such as auction and syndication.",
   :dcterms/hasPart
   ["https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceDocuments/"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MBSIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MetadataBPSecuritiesIssuance/",
   :rdfs/label "Securities Issuance Module",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/copyright "Copyright (c) 2013-2020 EDM Council, Inc.",
   :sm/moduleAbbreviation "fibo-bp-iss"})