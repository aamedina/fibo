(ns net.wikipunk.rdf.fibo-bp-iss-mod
  "This module contains ontologies of securities issuance process concepts, both for processes common to all securities issuance and variants for common types of equity and debt issuance such as auction and syndication."
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MetadataBPSecuritiesIssuance/SecuritiesIssuanceModule",
   :dcterms/abstract
   "This module contains ontologies of securities issuance process concepts, both for processes common to all securities issuance and variants for common types of equity and debt issuance such as auction and syndication.",
   :dcterms/issued #inst "2018-03-01T23:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-01-30T23:00:00.000-00:00",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/MetadataBPSecuritiesIssuance/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-bp-iss-mod"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MetadataBPSecuritiesIssuance/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-bp-iss-mod",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MetadataBPSecuritiesIssuance/",
   :rdfs/label
   "Metadata for the EDMC-FIBO Business Process (BP) Securities Issuance Module"})

(def SecuritiesIssuanceModule
  "This module contains ontologies of securities issuance process concepts, both for processes common to all securities issuance and variants for common types of equity and debt issuance such as auction and syndication."
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :db/ident :fibo-bp-iss-mod/SecuritiesIssuanceModule,
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
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Business Process (BP) Securities Issuance Module"
    "FIBO BP Securities Issuance Module"],
   :rdf/type [:owl/NamedIndividual :fibo-fnd-utl-av/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MetadataBPSecuritiesIssuance/",
   :rdfs/label "securities issuance module",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})