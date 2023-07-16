(ns net.wikipunk.rdf.gleif-ra
  "Ontology defining concepts for Business Registries, including the jurisdictions served. This is based on the Registration Authority Code List (RAL) used for Global Legal Entity Identifier Foundation (GLEIF) registration, but is more broadly applicable."
  {:dcat/downloadURL
   "https://www.gleif.org/ontology/v1.0/RegistrationAuthority/ontology.ttl",
   :dcterms/abstract
   #xsd/langString
    "Ontology defining concepts for Business Registries, including the jurisdictions served. This is based on the Registration Authority Code List (RAL) used for Global Legal Entity Identifier Foundation (GLEIF) registration, but is more broadly applicable.@en",
   :dcterms/contributor [{:rdfa/uri "http://www.workingontologist.com"}
                         {:rdfa/uri "http://purl.org/bryon"}
                         {:rdfa/uri "https://www.linkedin.com/in/peterivett/"}],
   :dcterms/creator :gleif-base/GLEIF,
   :dcterms/issued #xsd/dateTime #inst "2019-02-01T00:00:00.000+00:00",
   :dcterms/license {:rdfa/uri
                     "https://www.gleif.org/en/meta/lei-data-terms-of-use/"},
   :dcterms/rights
   "Copyright (c) 2019 Global Legal Entity Identifier Foundation (GLEIF)",
   :dcterms/rightsHolder :gleif-base/GLEIF,
   :dcterms/source
   {:rdfa/uri
    "https://www.gleif.org/en/about-lei/gleif-registration-authorities-list"},
   :dcterms/title
   #xsd/langString
    "Global Legal Entity Identifier Foundation Registration Authority Ontology@en",
   :owl/imports
   [{:rdfa/uri "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
    {:rdfa/uri "https://www.gleif.org/ontology/Base/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://www.gleif.org/ontology/RegistrationAuthority-1.0/RegistrationAuthority/"},
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "gleif-base" "https://www.gleif.org/ontology/Base/",
    "gleif-ra" "https://www.gleif.org/ontology/RegistrationAuthority/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "vann" "http://purl.org/vocab/vann/",
    "voaf" "http://purl.org/vocommons/voaf#",
    "xml" "http://www.w3.org/XML/1998/namespace",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type [:voaf/Vocabulary :owl/Ontology],
   :rdfa/prefix "gleif-ra",
   :rdfa/uri "https://www.gleif.org/ontology/RegistrationAuthority/",
   :rdfs/label "GLEIF Registration Authority Ontology",
   :vann/preferredNamespacePrefix "gleif-ra",
   :vann/preferredNamespaceUri
   "https://www.gleif.org/ontology/RegistrationAuthority/"})

(def BusinessRegistry
  "business registry"
  {:db/ident :gleif-ra/BusinessRegistry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri
                      "https://www.gleif.org/ontology/RegistrationAuthority/"},
   :rdfs/label "business registry",
   :rdfs/subClassOf [:gleif-base/Registry
                     {:owl/minCardinality #xsd/nonNegativeInteger 0,
                      :owl/onProperty     :gleif-base/hasWebsite,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :gleif-base/RegistrationAuthority,
                      :owl/onProperty :gleif-base/isManagedBy,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :gleif-base/hasNameTranslatedEnglish,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :gleif-base/hasCoverageArea,
                      :owl/someValuesFrom :lcc-cr/GeographicRegion,
                      :rdf/type           :owl/Restriction}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :gleif-base/hasNameLegalLocal,
                      :rdf/type        :owl/Restriction}],
   :skos/definition
   "a registry for registering and maintaining information about business entities"})

(def RAregistry
  "RA registry"
  {:db/ident :gleif-ra/RAregistry,
   :gleif-base/hasNameLocal #xsd/langString
                             "GLEIF Registration Authorities List@en",
   :gleif-base/hasWebsite
   {:rdfa/uri
    "https://www.gleif.org/en/about-lei/code-lists/gleif-registration-authorities-list"},
   :gleif-base/isManagedBy :gleif-base/GLEIF,
   :rdf/type :gleif-base/Registry,
   :rdfs/isDefinedBy {:rdfa/uri
                      "https://www.gleif.org/ontology/RegistrationAuthority/"},
   :rdfs/label "RA registry",
   :skos/altLabel ["RAL" "GLEIF Registration Authorities List"],
   :skos/prefLabel "RA registry"})

(def RegistrationAuthorityCode
  "registration authority code"
  {:db/ident :gleif-ra/RegistrationAuthorityCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri
                      "https://www.gleif.org/ontology/RegistrationAuthority/"},
   :rdfs/label "registration authority code",
   :rdfs/subClassOf [:gleif-base/Identifier
                     {:owl/onClass    :gleif-ra/BusinessRegistry,
                      :owl/onProperty :gleif-base/identifies,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "The reference code of the registration authority, taken from the Registration Authorities Code List maintained by GLEIF."})