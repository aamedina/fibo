(ns net.wikipunk.rdf.gleif-elf
  {:dcat/downloadURL
   "https://www.gleif.org/ontology/v1.0/EntityLegalForm/ontology.ttl",
   :dcterms/abstract
   {:rdf/language "en",
    :rdf/value
    "Ontology defining concepts for Entity Legal Forms and their abbreviations by jurisdiction, based on ISO 20275. Though used by Global Legal Entity Identifier Foundation (GLEIF)  for Legal Entity Identifier registration, it is more broadly applicable."},
   :dcterms/contributor #{{:xsd/anyURI "http://purl.org/bryon"}
                          {:xsd/anyURI "http://www.workingontologist.com"}
                          {:xsd/anyURI
                           "https://www.linkedin.com/in/peterivett/"}},
   :dcterms/creator :gleif-base/GLEIF,
   :dcterms/issued #inst "2019-02-01T00:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI
                     "https://www.gleif.org/en/meta/lei-data-terms-of-use/"},
   :dcterms/rights
   "Copyright (c) 2019 Global Legal Entity Identifier Foundation (GLEIF)",
   :dcterms/rightsHolder :gleif-base/GLEIF,
   :dcterms/source
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/code-lists/iso-20275-entity-legal-forms-code-list"},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Entity Legal Form Ontology"},
   :namespaces {"dcterms" "http://purl.org/dc/terms/",
                "gleif-base" "https://www.gleif.org/ontology/Base/",
                "gleif-elf" "https://www.gleif.org/ontology/EntityLegalForm/",
                "lcc-cr"
                "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
                "owl" "http://www.w3.org/2002/07/owl#",
                "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                "skos" "http://www.w3.org/2004/02/skos/core#",
                "vann" "http://purl.org/vocab/vann/",
                "voaf" "http://purl.org/vocommons/voaf#",
                "xml" "http://www.w3.org/XML/1998/namespace",
                "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.gleif.org/ontology/Base/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://www.gleif.org/ontology/EntityLegalForm-v1.0/EntityLegalForm/"},
   :rdf/type #{:owl/Ontology :voaf/Vocabulary},
   :rdfa/prefix "gleif-elf",
   :rdfa/uri "https://www.gleif.org/ontology/EntityLegalForm/",
   :rdfs/label "Entity Legal Form Ontology",
   :vann/preferredNamespacePrefix "gleif-elf",
   :vann/preferredNamespaceUri
   "https://www.gleif.org/ontology/EntityLegalForm/",
   :xsd/anyURI "https://www.gleif.org/ontology/EntityLegalForm/"})

(def ELFregistry
  {:db/ident :gleif-elf/ELFregistry,
   :gleif-base/hasWebsite
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/code-lists/iso-20275-entity-legal-forms-code-list"},
   :gleif-base/isManagedBy :gleif-base/GLEIF,
   :rdf/type :gleif-base/Registry,
   :rdfs/isDefinedBy {:xsd/anyURI
                      "https://www.gleif.org/ontology/EntityLegalForm/"},
   :rdfs/label "ELF registry",
   :skos/altLabel #{"ELF list" "Entity Legal Form list"},
   :skos/prefLabel "ELF registry"})

(def EntityLegalForm
  {:db/ident :gleif-elf/EntityLegalForm,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI
                      "https://www.gleif.org/ontology/EntityLegalForm/"},
   :rdfs/label "entity legal form",
   :rdfs/subClassOf #{{:owl/minCardinality 1,
                       :owl/onProperty     :gleif-base/hasNameLegalLocal,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty
                       :gleif-base/hasAbbreviationTransliterated,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty     :gleif-base/hasCoverageArea,
                       :owl/someValuesFrom :lcc-cr/GeographicRegion,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :gleif-base/hasNameTransliterated,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 0,
                       :owl/onProperty     :gleif-base/hasAbbreviationLocal,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "The legal form of the entity, taken from the ISO Entity Legal Form (ELF) code list maintained by GLEIF. "})

(def EntityLegalFormIdentifier
  {:db/ident :gleif-elf/EntityLegalFormIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI
                      "https://www.gleif.org/ontology/EntityLegalForm/"},
   :rdfs/label "entity legal form identifier",
   :rdfs/subClassOf #{:gleif-base/Identifier
                      {:owl/onClass    :gleif-elf/EntityLegalForm,
                       :owl/onProperty :gleif-base/identifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "A current code from the GLEIF-maintained list MUST be used. Values of the LegalFormEnum code list are maintained by GLEIF on behalf of ISO through the Entity Legal Form (ELF) as defined in ISO 20275."})

(def urn:uuid:0759188d-4fe3-58ec-8e11-db09dcacc054
  {:dcterms/abstract
   {:rdf/language "en",
    :rdf/value
    "Ontology defining concepts for Entity Legal Forms and their abbreviations by jurisdiction, based on ISO 20275. Though used by Global Legal Entity Identifier Foundation (GLEIF)  for Legal Entity Identifier registration, it is more broadly applicable."},
   :dcterms/contributor #{{:xsd/anyURI "http://purl.org/bryon"}
                          {:xsd/anyURI "http://www.workingontologist.com"}
                          {:xsd/anyURI
                           "https://www.linkedin.com/in/peterivett/"}},
   :dcterms/creator :gleif-base/GLEIF,
   :dcterms/issued #inst "2019-02-01T00:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI
                     "https://www.gleif.org/en/meta/lei-data-terms-of-use/"},
   :dcterms/rights
   "Copyright (c) 2019 Global Legal Entity Identifier Foundation (GLEIF)",
   :dcterms/rightsHolder :gleif-base/GLEIF,
   :dcterms/source
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/code-lists/iso-20275-entity-legal-forms-code-list"},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Entity Legal Form Ontology"},
   :owl/imports
   #{{:xsd/anyURI "https://www.gleif.org/ontology/Base/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://www.gleif.org/ontology/EntityLegalForm-v1.0/EntityLegalForm/"},
   :rdf/type #{:owl/Ontology :voaf/Vocabulary},
   :rdfs/label "Entity Legal Form Ontology",
   :vann/preferredNamespacePrefix "gleif-elf",
   :vann/preferredNamespaceUri
   "https://www.gleif.org/ontology/EntityLegalForm/",
   :xsd/anyURI "https://www.gleif.org/ontology/EntityLegalForm/"})