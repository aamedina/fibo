(ns net.wikipunk.rdf.fibo-fbc-fct-rga
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/RegulatoryAgencies/",
   :dcterms/abstract
   "This ontology defines general purpose concepts for representation of regulatory agencies, also known as regulatory authorities or regulators. Examples of financial industry regulatory agencies in the US include the Securities Exchange Commission, FINRA, and the FDIC, among others. The SEC and FINRA are both registration authorities and regulatory agencies. The FDIC is a regulatory agency and an insurer, and may be a registration authority for certain state-chartered banks in the US without bank holding companies.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-ge-ge"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-be-oac-exec"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
    "fibo-fbc-fct-rga"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-arr-rep"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
    "fibo-fnd-law-cor"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCore/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
    "fibo-fnd-law-lcap"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/",
    "fibo-fnd-org-fm"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
    "fibo-fnd-pas-pas"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/LegalCapacity/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/LegalCore/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Agreements/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/Executives/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/Reporting/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/RegulatoryAgencies/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-fct-rga",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies/",
   :rdfs/label "Regulatory Agencies Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies.rdf version of this ontology was modified to clean up the definition of regulatory agency."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies.rdf version of this ontology was modified to eliminate deprecated elements and duplication of concepts with LCC, and remove a redundant superclass declaration on GovernmentIssuedLicense."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies.rdf version of this ontology was modified as a part of organizational hierarchy simplification."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies.rdf version of this ontology was modified per the FIBO 2.0 RFC, including deprecation of the hasJurisdiction property that was duplicated in BE via the BE 1.1 RTF."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies.rdf version of this ontology was modified to add the concept of a tax authority."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies.rdf version of this ontology was modified to address text formatting hygiene issues."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies/"})

(def Examiner
  {:cmns-av/adaptedFrom
   #{{:rdf/value
      "Black's Law Dictionary, see http://thelawdictionary.org/examiner/"}
     {:rdf/value "EDM Council"}},
   :db/ident :fibo-fbc-fct-rga/Examiner,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies/"},
   :rdfs/label "examiner",
   :rdfs/subClassOf
   #{{:owl/onClass    :fibo-be-le-lp/LegallyCompetentNaturalPerson,
      :owl/onProperty :cmns-rlcmp/isPlayedBy,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom {:owl/intersectionOf
                           [{:owl/onProperty :fibo-fnd-law-lcap/hasCapacity,
                             :owl/someValuesFrom
                             :fibo-fbc-fct-rga/RegulatoryCapacity,
                             :rdf/type :owl/Restriction}
                            {:owl/onClass    :fibo-fbc-fct-rga/RegulatoryAgency,
                             :owl/onProperty :cmns-dsg/denotes,
                             :owl/qualifiedCardinality 1,
                             :rdf/type       :owl/Restriction}],
                           :rdf/type :owl/Class},
      :rdf/type           :owl/Restriction} :fibo-be-oac-exec/ResponsibleParty},
   :skos/definition
   "a party empowered as an official representative by a regulatory agency to investigate and review specified documents for accuracy and truthfulness"})

(def GovernmentIssuedLicense
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Barron's Dictionary of Business and Economics Terms, Fifth Edition, 2012"},
   :db/ident :fibo-fbc-fct-rga/GovernmentIssuedLicense,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies/"},
   :rdfs/label "government-issued license",
   :rdfs/subClassOf #{:fibo-fnd-law-lcap/License
                      {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
                       :owl/someValuesFrom :fibo-fbc-fct-rga/RegulatoryAgency,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "grant of permission needed to legally perform some task, provide some service, exercise a certain privilege, or pursue some business or occupation"})

(def RegulationIdentificationScheme
  {:db/ident :fibo-fbc-fct-rga/RegulationIdentificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies/"},
   :rdfs/label "regulation identification scheme",
   :rdfs/subClassOf #{:cmns-id/IdentificationScheme
                      {:owl/onProperty :cmns-col/hasMember,
                       :owl/someValuesFrom
                       :fibo-fbc-fct-rga/RegulationIdentifier,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "a scheme for organizing information and allocating identifiers to regulations"})

(def RegulationIdentifier
  {:db/ident :fibo-fbc-fct-rga/RegulationIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies/"},
   :rdfs/label "regulation identifier",
   :rdfs/subClassOf #{:cmns-id/Identifier
                      {:owl/onClass
                       :fibo-fbc-fct-rga/RegulationIdentificationScheme,
                       :owl/onProperty :cmns-col/isMemberOf,
                       :owl/qualifiedCardinality 1,
                       :rdf/type :owl/Restriction}
                      {:owl/onClass    :fibo-fnd-law-lcap/Regulation,
                       :owl/onProperty :cmns-id/identifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition "an identifier associated with a regulation"})

(def RegulatoryAgency
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI "http://www.thefreedictionary.com/regulatory+agency"}
     {:xsd/anyURI "http://en.wikipedia.org/wiki/Regulatory_agency"}},
   :cmns-av/explanatoryNote
   "Typically, a regulatory agency is chartered to protect some constituancy, (e.g., investors in the financial industry), to ensure the fairness and integrity of some market (e.g., the securities market), and fair and safe business practices among the service providers in that market.",
   :cmns-av/synonym #{"regulatory body" "regulatory authority" "regulator"},
   :db/ident :fibo-fbc-fct-rga/RegulatoryAgency,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies/"},
   :rdfs/label "regulatory agency",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/provides,
                       :owl/someValuesFrom :fibo-fbc-fct-rga/RegulatoryService,
                       :rdf/type           :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass :fibo-fbc-fct-rga/GovernmentIssuedLicense,
                       :owl/onProperty :fibo-fnd-rel-rel/issues,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty     :fibo-be-ge-ge/hasJurisdiction,
                       :owl/someValuesFrom :fibo-fnd-law-jur/Jurisdiction,
                       :rdf/type           :owl/Restriction}
                      {:owl/onClass    :fibo-fnd-org-fm/FormalOrganization,
                       :owl/onProperty :cmns-rlcmp/isPlayedBy,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-pas-pas/ServiceProvider},
   :skos/definition
   "public authority or government agency responsible for exercising authority over something in a regulatory or supervisory capacity",
   :skos/example
   "See http://www.finra.org/AboutFINRA/ for an example describing a regulatory agency."})

(def RegulatoryCapacity
  {:db/ident :fibo-fbc-fct-rga/RegulatoryCapacity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies/"},
   :rdfs/label "regulatory capacity",
   :rdfs/subClassOf :fibo-fnd-law-lcap/LegalCapacity,
   :skos/definition
   "the capacity of some natural person to regulate some industry, organization, or product by virtue of some certification program on behalf of some regulatory agency"})

(def RegulatoryReport
  {:cmns-av/explanatoryNote
   "Such a report may be needed for licensing, monitoring, taxation, or for other purposes that demonstrate the integrity, fairness, safety, or other capacity of a given industry, organization, or product",
   :db/ident :fibo-fbc-fct-rga/RegulatoryReport,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies/"},
   :rdfs/label "regulatory report",
   :rdfs/subClassOf #{:fibo-fnd-arr-rep/Report
                      {:owl/onProperty     :fibo-fnd-rel-rel/isGovernedBy,
                       :owl/someValuesFrom {:owl/unionOf
                                            [:fibo-fnd-agr-ctr/Contract
                                             :fibo-fnd-law-cor/Constitution
                                             :fibo-fnd-law-cor/Law
                                             :fibo-fnd-law-lcap/Regulation],
                                            :rdf/type :owl/Class},
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "a report required to support operational transparency that demonstrates compliance with some specification, law, policy, restriction, or other rule specified by a regulatory agency"})

(def RegulatoryService
  {:db/ident :fibo-fbc-fct-rga/RegulatoryService,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies/"},
   :rdfs/label "regulatory service",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/isProvidedBy,
                       :owl/someValuesFrom :fibo-fbc-fct-rga/RegulatoryAgency,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-pas-pas/Service},
   :skos/definition
   "a service provided by a regulatory agency, which may include, but not be limited to, examination, monitoring, supervision, testing, or other capabilities required to ensure the integrity, fairness, safety, or other capacity of a given industry, organization, or product"})

(def TaxAuthority
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI
      "https://www.collinsdictionary.com/dictionary/english/tax-authority"}
     {:xsd/anyURI "https://www.lawinsider.com/dictionary/tax-authority"}},
   :db/ident :fibo-fbc-fct-rga/TaxAuthority,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies/"},
   :rdfs/label "tax authority",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-rel-rel/manages,
      :owl/someValuesFrom :fibo-fnd-pty-pty/TaxIdentificationScheme,
      :rdf/type           :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fnd-pty-pty/TaxIdentifier,
      :owl/onProperty :fibo-fnd-rel-rel/issues,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :fibo-be-ge-ge/hasJurisdiction,
      :owl/someValuesFrom :fibo-fnd-law-jur/Jurisdiction,
      :rdf/type           :owl/Restriction} :fibo-fbc-fct-rga/RegulatoryAgency},
   :skos/definition
   "regulatory agency that has jurisdiction over the assessment, determination, collection, imposition and other aspects of any tax"})

(def isRegulatedBy
  {:db/ident :fibo-fbc-fct-rga/isRegulatedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies/"},
   :rdfs/label "is regulated by",
   :rdfs/range :fibo-fbc-fct-rga/RegulatoryAgency,
   :skos/definition
   "indicates a regulatory agency that has regulatory authority for something"})

(def regulates
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "http://www.merriam-webster.com/dictionary/regulate"},
   :db/ident :fibo-fbc-fct-rga/regulates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fct-rga/RegulatoryAgency,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies/"},
   :rdfs/label "regulates",
   :skos/definition
   "has regulatory authority over or directs according to rule or law, typically an industry, organization, or product"})

(def urn:uuid:553d68ac-f429-5b08-b817-5fd3e09626fb
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines general purpose concepts for representation of regulatory agencies, also known as regulatory authorities or regulators. Examples of financial industry regulatory agencies in the US include the Securities Exchange Commission, FINRA, and the FDIC, among others. The SEC and FINRA are both registration authorities and regulatory agencies. The FDIC is a regulatory agency and an insurer, and may be a registration authority for certain state-chartered banks in the US without bank holding companies.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/LegalCapacity/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/LegalCore/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Agreements/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/Executives/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/Reporting/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/RegulatoryAgencies/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Regulatory Agencies Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies.rdf version of this ontology was modified to clean up the definition of regulatory agency."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies.rdf version of this ontology was modified to eliminate deprecated elements and duplication of concepts with LCC, and remove a redundant superclass declaration on GovernmentIssuedLicense."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies.rdf version of this ontology was modified as a part of organizational hierarchy simplification."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies.rdf version of this ontology was modified per the FIBO 2.0 RFC, including deprecation of the hasJurisdiction property that was duplicated in BE via the BE 1.1 RTF."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies.rdf version of this ontology was modified to add the concept of a tax authority."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies.rdf version of this ontology was modified to address text formatting hygiene issues."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies/"})