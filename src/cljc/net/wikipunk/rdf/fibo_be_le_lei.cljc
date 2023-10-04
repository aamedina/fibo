(ns net.wikipunk.rdf.fibo-be-le-lei
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "cmns-cds" "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
     "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
     "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
     "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
     "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
     "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
     "cmns-txt" "https://www.omg.org/spec/Commons/TextDatatype/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-be-le-fbo"
     "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
     "fibo-be-le-lei"
     "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/",
     "fibo-be-le-lp"
     "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
     "fibo-fnd-agr-ctr"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
     "fibo-fnd-law-jur"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
     "fibo-fnd-org-org"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
     "fibo-fnd-plc-adr"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/",
     "fibo-fnd-pty-rl"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
     "fibo-fnd-rel-rel"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "skos" "http://www.w3.org/2004/02/skos/core#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-be-le-lei",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LEIEntities/"}
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines concepts around contractually capable business entities. The terms defined here are those which are relevant to the Legal Entity Identifier (LEI) work. The term known as legal entity in that work is identified as a formal organization which is recognized in some jurisdiction as being capable of incurring some liability, whether or not is a legal person as understood by the legal community. This is labeled as contractually capable entity, to avoid confusion with the accepted legal term for Legal Entity. Such entities are recognized as requiring an LEI, but the identifier itself is allocated to the formal organization which is recognized as being contractually capable.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Quantities/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/Addresses/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Organizations/Organizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/TextDatatype/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LegalPersons/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LEIEntities/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Legal Entity Identifier (LEI) Entities Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities.rdf version of this ontology was revised to reflect the move of some organization-specific concepts from BE to FND."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities.rdf version of this ontology was revised to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities.rdf version of this ontology was revised to replace hasDefinition with isDefinedIn to clarify intent."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities.rdf version of this ontology was revised to clean up circular definitions and augment it to incorporate the Text datatype and structure names, including eliminating redundant restrictions on LegalEntity."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities.rdf version of this ontology was revised to change the restriction on EntityLegalForm from identifies to denotes, in line with the definition of a code as opposed to an identifier, given the nature of an entity legal form."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.1 RTF report. Changes include deprecation of the MunicipalEntity, Sovereign, and SupranationalEntity classes and making them equivalent to classes in the Government Entities ontology."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities.rdf version of this ontology was modified to incorporate LEIEligibleEntity and LEIRegisteredEntity, as well as add restrictions in support of the ISO 17442 LEI effort and related changes to the GLEIF Common Data Format for the FIBO 2.0 RFC."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities.rdf version of this ontology was revised to address text formatting hygiene issues."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities.rdf version of this ontology was modified to deprecate LEIEligibleEntity as a part of a simplification strategy for the organizational class hierarchy, to support GLEIF LEI Level 2 ownership relationships, and eliminate a circular dependency with government entities by removing elements that had been deprecated for the last several FIBO revisions (municipal entity, sovereign, and supranational entity)."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities.rdf version of this ontology was revised to eliminate duplication with concepts in LCC and to correct the parent of relationship record."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"})

(def AccountingFramework
  {:cmns-av/adaptedFrom
   {:rdf/value
    "GLEIF Level 2 Relationship Record (RR) Common Data Format (CDF), see https://www.gleif.org/en/about-lei/common-data-file-format/relationship-record-cdf-format#"},
   :db/ident :fibo-be-le-lei/AccountingFramework,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "accounting framework",
   :rdfs/subClassOf :fibo-be-le-lei/RelationshipQualifier,
   :skos/definition
   "framework, including policies, methods, rules, and processes, used to measure, recognize, present, and disclose the information appearing in an entity's financial statements, and, from a legal ownership perspective, that is applied for accounting consolidation determination"})

(def AccountingPeriod
  {:cmns-av/adaptedFrom
   {:rdf/value
    "GLEIF Level 2 Relationship Record (RR) Common Data Format (CDF), see https://www.gleif.org/en/about-lei/common-data-file-format/relationship-record-cdf-format#"},
   :db/ident :fibo-be-le-lei/AccountingPeriod,
   :rdf/type #{:fibo-be-le-lei/RelationshipPeriodQualifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "accounting period",
   :skos/definition
   "qualifier indicating that the relationship period reflects the period of time covered by the most recent validation documents from an accounting perspective for this relationship"})

(def ContractuallyCapableEntity
  {:cmns-av/adaptedFrom {:rdf/value "ISO 17442"},
   :db/ident :fibo-be-le-lei/ContractuallyCapableEntity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "contractually capable entity",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-be-le-lp/LegalEntity,
                       :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-pty-rl/AgentInRole},
   :skos/definition
   "a unique entity that is legally or financially responsible for the performance of financial transactions, or has the legal right in its jurisdiction to enter independently into legal contracts, regardless of whether it is incorporated or constituted in some other way (e.g. trust, partnership, contractual). This excludes natural persons, but includes governmental organizations and supranationals."})

(def DocumentFilingPeriod
  {:cmns-av/adaptedFrom
   {:rdf/value
    "GLEIF Level 2 Relationship Record (RR) Common Data Format (CDF), see https://www.gleif.org/en/about-lei/common-data-file-format/relationship-record-cdf-format#"},
   :db/ident :fibo-be-le-lei/DocumentFilingPeriod,
   :rdf/type #{:fibo-be-le-lei/RelationshipPeriodQualifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "document filing period",
   :skos/definition
   "a qualifier indicating that the relationship period reflects the validity period for any regulatory filing, accounting document, other document demonstrating the relationship's validity"})

(def EntityLegalForm
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI "https://www.iso.org/obp/ui/#iso:std:iso:20275:ed-1:v1:en"}
     {:xsd/anyURI
      "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"}},
   :db/ident :fibo-be-le-lei/EntityLegalForm,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "entity legal form",
   :rdfs/subClassOf
   #{{:owl/minQualifiedCardinality 0,
      :owl/onDataRange :cmns-txt/Text,
      :owl/onProperty  :fibo-be-le-lei/hasLegalFormAbbreviation,
      :rdf/type        :owl/Restriction}
     {:owl/onProperty     :cmns-dsg/isDefinedIn,
      :owl/someValuesFrom :fibo-be-le-lei/EntityLegalFormScheme,
      :rdf/type           :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onDataRange :cmns-txt/Text,
      :owl/onProperty  :fibo-be-le-lei/hasTransliteratedName,
      :rdf/type        :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onDataRange :cmns-txt/Text,
      :owl/onProperty  :fibo-fnd-rel-rel/hasTextualName,
      :rdf/type        :owl/Restriction}
     {:owl/onProperty     :cmns-cls/classifies,
      :owl/someValuesFrom :fibo-be-le-lp/LegalPerson,
      :rdf/type           :owl/Restriction} :cmns-cls/Classifier
     {:owl/minQualifiedCardinality 0,
      :owl/onDataRange :cmns-txt/Text,
      :owl/onProperty  :fibo-be-le-lei/hasTransliteratedLegalFormAbbreviation,
      :rdf/type        :owl/Restriction}
     {:owl/onProperty     :cmns-cxtdsg/isApplicableIn,
      :owl/someValuesFrom :fibo-fnd-law-jur/Jurisdiction,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "a classifier for a legal entity that indicates the nature of that entity as defined from a legal or regulatory perspective, in the jurisdiction in which it was established"})

(def EntityLegalFormIdentifier
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI
      "https://www.gleif.org/en/about-lei/code-lists/iso-20275-entity-legal-forms-code-list"}
     {:xsd/anyURI "https://www.iso.org/obp/ui/#iso:std:iso:20275:ed-1:v1:en"}},
   :db/ident :fibo-be-le-lei/EntityLegalFormIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "entity legal form identifier",
   :rdfs/subClassOf #{{:owl/onProperty :cmns-dsg/isDefinedIn,
                       :owl/someValuesFrom
                       :fibo-be-le-lei/EntityLegalFormScheme,
                       :rdf/type :owl/Restriction}
                      {:owl/onClass    :fibo-be-le-lei/EntityLegalForm,
                       :owl/onProperty :cmns-dsg/denotes,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction} :cmns-cds/CodeElement},
   :skos/definition
   "code that denotes an entity legal form as defined in ISO 20275"})

(def EntityLegalFormScheme
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI
      "https://www.gleif.org/en/about-lei/code-lists/iso-20275-entity-legal-forms-code-list"}
     {:xsd/anyURI "https://www.iso.org/obp/ui/#iso:std:iso:20275:ed-1:v1:en"}},
   :db/ident :fibo-be-le-lei/EntityLegalFormScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "entity legal form scheme",
   :rdfs/subClassOf
   #{:cmns-cds/CodeSet
     {:owl/onProperty     :cmns-dsg/defines,
      :owl/someValuesFrom :fibo-be-le-lei/EntityLegalFormIdentifier,
      :rdf/type           :owl/Restriction} :cmns-cls/ClassificationScheme},
   :skos/definition
   "scheme that specifies the elements of the codes for entity legal forms, such as those that are sanctioned in a given jurisdiction as defined in ISO 20725"})

(def GenerallyAcceptedAccountingPrinciples
  {:cmns-av/abbreviation #{"US GAAP" "GAAP"},
   :cmns-av/adaptedFrom
   {:rdf/value
    "GLEIF Level 2 Relationship Record (RR) Common Data Format (CDF), see https://www.gleif.org/en/about-lei/common-data-file-format/relationship-record-cdf-format#"},
   :db/ident :fibo-be-le-lei/GenerallyAcceptedAccountingPrinciples,
   :rdf/type #{:fibo-be-le-lei/AccountingFramework :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "Generally Accepted Accounting Principles",
   :rdfs/seeAlso {:xsd/anyURI "https://www.fasb.org/home"},
   :skos/definition
   "an accounting framework developed by the US Financial Accounting Standards Board (FASB)"})

(def ISO17442-CodeSet
  {:cmns-av/synonym "GLEIF LEI CDF v2.1 legal entity identifier (LEI) code set",
   :db/ident :fibo-be-le-lei/ISO17442-CodeSet,
   :rdf/type #{:fibo-be-le-lei/LegalEntityIdentifierScheme
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "ISO 17442 code set",
   :skos/definition
   "the set of legal entity identifiers that comprise the ISO 17442 legal entity identifier specification"})

(def ISO20275-CodeSet
  {:cmns-av/synonym "entity legal form (ELF) code set",
   :db/ident :fibo-be-le-lei/ISO20275-CodeSet,
   :rdf/type #{:fibo-be-le-lei/EntityLegalFormScheme :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "ISO 20275 code set",
   :skos/definition
   "the set of entity legal form identifiers that comprise the ISO 20275 entity legal form specification"})

(def InternationalFinancialReportingStandard
  {:cmns-av/abbreviation "IFRS",
   :cmns-av/adaptedFrom
   {:rdf/value
    "GLEIF Level 2 Relationship Record (RR) Common Data Format (CDF), see https://www.gleif.org/en/about-lei/common-data-file-format/relationship-record-cdf-format#"},
   :db/ident :fibo-be-le-lei/InternationalFinancialReportingStandard,
   :rdf/type #{:fibo-be-le-lei/AccountingFramework :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "International Financial Reporting Standard",
   :rdfs/seeAlso {:xsd/anyURI "https://www.ifrs.org/"},
   :skos/definition
   "an accounting framework developed by the International Accounting Standards Board (IASB)"})

(def LEIRegisteredEntity
  {:cmns-av/explanatoryNote
   "Note that the GLEIF data includes multiple LEIs for some entities due to corporate actions or other situations. The duplicates are typically archived after some period of time, but in order to reflect the reality in the data, the restriction is modeled as someValuesFrom rather than exactly 1 LEI for a given entity.",
   :db/ident :fibo-be-le-lei/LEIRegisteredEntity,
   :owl/equivalentClass {:owl/onProperty :cmns-id/isIdentifiedBy,
                         :owl/someValuesFrom
                         :fibo-be-le-lei/LegalEntityIdentifier,
                         :rdf/type :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "LEI registered entity",
   :rdfs/subClassOf :fibo-be-le-lp/LegalPerson,
   :skos/definition
   "a legal person that has registered for and is identified by a legal entity identifier"})

(def LegalEntityIdentifier
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI "https://www.iso.org/standard/59771.html"}
     {:xsd/anyURI
      "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"}},
   :db/ident :fibo-be-le-lei/LegalEntityIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "legal entity identifier",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-be-le-lp/LegalPerson,
                       :owl/onProperty :cmns-id/identifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty :cmns-dsg/isDefinedIn,
                       :owl/someValuesFrom
                       :fibo-be-le-lei/LegalEntityIdentifierScheme,
                       :rdf/type :owl/Restriction}
                      :fibo-fnd-org-org/OrganizationIdentifier},
   :skos/definition
   "an organization identifier that uniquely identifies a legal person as defined in ISO 17442"})

(def LegalEntityIdentifierScheme
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI "https://www.iso.org/standard/59771.html"}
     {:xsd/anyURI
      "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"}},
   :db/ident :fibo-be-le-lei/LegalEntityIdentifierScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "legal entity identifier scheme",
   :rdfs/subClassOf #{:fibo-fnd-org-org/OrganizationIdentificationScheme
                      {:owl/onProperty :cmns-dsg/defines,
                       :owl/someValuesFrom
                       :fibo-be-le-lei/LegalEntityIdentifier,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "a scheme that specifies the elements of an unambiguous legal entity identifier (LEI) scheme to identify the legal entities relevant to any financial transaction"})

(def OtherAccountingFramework
  {:cmns-av/adaptedFrom
   {:rdf/value
    "GLEIF Level 2 Relationship Record (RR) Common Data Format (CDF), see https://www.gleif.org/en/about-lei/common-data-file-format/relationship-record-cdf-format#"},
   :db/ident :fibo-be-le-lei/OtherAccountingFramework,
   :rdf/type #{:fibo-be-le-lei/AccountingFramework :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "other accounting framework",
   :rdfs/seeAlso {:xsd/anyURI "https://www.ifrs.org/"},
   :skos/definition
   "an accounting framework of unstated origin (other than IFRS or US GAAP)"})

(def RelationshipPeriodQualifier
  {:cmns-av/adaptedFrom
   {:rdf/value
    "GLEIF Level 2 Relationship Record (RR) Common Data Format (CDF), see https://www.gleif.org/en/about-lei/common-data-file-format/relationship-record-cdf-format#"},
   :db/ident :fibo-be-le-lei/RelationshipPeriodQualifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "relationship period qualifier",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition
   "a classifier that qualifies something about the reporting period specified, such as that the date period reflects an accounting or document filing period"})

(def RelationshipQualifier
  {:cmns-av/adaptedFrom
   {:rdf/value
    "GLEIF Level 2 Relationship Record (RR) Common Data Format (CDF), see https://www.gleif.org/en/about-lei/common-data-file-format/relationship-record-cdf-format#"},
   :db/ident :fibo-be-le-lei/RelationshipQualifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "relationship qualifier",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition
   "a classifier that qualifies something about the relationship between consolidated entities during the reporting period, such as the accounting framework used"})

(def RelationshipRecord
  {:cmns-av/adaptedFrom
   {:rdf/value
    "GLEIF Level 2 Relationship Record (RR) Common Data Format (CDF), see https://www.gleif.org/en/about-lei/common-data-file-format/relationship-record-cdf-format#"},
   :db/ident :fibo-be-le-lei/RelationshipRecord,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "relationship record",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-be-le-lei/RelationshipQualifier,
                       :owl/onProperty :fibo-fnd-agr-ctr/isQualifiedBy,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onDataRange :xsd/decimal,
                       :owl/onProperty  :fibo-be-le-lei/isQuantifiedBy,
                       :rdf/type        :owl/Restriction}
                      :cmns-col/Constituent},
   :skos/definition "a record describing relationships between legal entities"})

(def RelationshipStatus
  {:cmns-av/adaptedFrom
   {:rdf/value
    "GLEIF Level 2 Relationship Record (RR) Common Data Format (CDF), see https://www.gleif.org/en/about-lei/common-data-file-format/relationship-record-cdf-format#"},
   :db/ident :fibo-be-le-lei/RelationshipStatus,
   :owl/equivalentClass {:owl/oneOf
                         [:fibo-be-le-lei/RelationshipStatusActive
                          :fibo-be-le-lei/RelationshipStatusInactive],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "relationship status",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition
   "a classifier that specifies the status of the relationship between consolidated entities during the reporting period (active or inactive)"})

(def RelationshipStatusActive
  {:cmns-av/adaptedFrom
   {:rdf/value
    "GLEIF Level 2 Relationship Record (RR) Common Data Format (CDF), see https://www.gleif.org/en/about-lei/common-data-file-format/relationship-record-cdf-format#"},
   :db/ident :fibo-be-le-lei/RelationshipStatusActive,
   :rdf/type #{:fibo-be-le-lei/RelationshipStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "relationship status - active",
   :skos/definition
   "status indicating that as of the last report or update, the reporting legal entity reported that it is legally registered and/or operating, and that the relationship detailed in this relationship record is still valid"})

(def RelationshipStatusInactive
  {:cmns-av/adaptedFrom
   {:rdf/value
    "GLEIF Level 2 Relationship Record (RR) Common Data Format (CDF), see https://www.gleif.org/en/about-lei/common-data-file-format/relationship-record-cdf-format#"},
   :db/ident :fibo-be-le-lei/RelationshipStatusInactive,
   :rdf/type #{:fibo-be-le-lei/RelationshipStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "relationship status - inactive",
   :skos/definition
   "status indicating that it has been determined that the relationship ended, e.g. because entity that reported this relationship is no longer legally registered and/or operating; or the relationship is no longer valid for other reasons"})

(def hasLegalAddress
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-be-le-lei/hasLegalAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-le-lp/LegalEntity,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "has legal address",
   :rdfs/range :fibo-fnd-plc-adr/ConventionalStreetAddress,
   :rdfs/subPropertyOf :fibo-be-le-fbo/hasRegisteredAddress,
   :skos/definition
   "indicates the legal address for the entity, in the jurisdiction in which the entity is established, used for registration purposes with respect to obtaining an LEI"})

(def hasLegalForm
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI "https://www.iso.org/obp/ui/#iso:std:iso:20275:ed-1:v1:en"}
     {:xsd/anyURI
      "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"}},
   :db/ident :fibo-be-le-lei/hasLegalForm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-le-lp/LegalEntity,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "has legal form",
   :rdfs/range :fibo-be-le-lei/EntityLegalForm,
   :rdfs/subPropertyOf :cmns-cls/isClassifiedBy,
   :skos/definition
   "indicates the nature of the entity as defined from a legal or regulatory perspective in a given jurisdiction"})

(def hasLegalFormAbbreviation
  {:db/ident :fibo-be-le-lei/hasLegalFormAbbreviation,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "has legal form abbreviation",
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "the precise abbreviation for the entity legal form as defined in the jurisdiction in which it is registered, for example LLC, LLP, Ltd, PLC, Corp."})

(def hasOwnershipPercentage
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-be-le-lei/hasOwnershipPercentage,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "has ownership percentage",
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :fibo-be-le-lei/isQuantifiedBy,
   :skos/definition
   "the percentage ownership interest in the owned entity owned by owning entity, if known"})

(def hasTransliteratedLegalFormAbbreviation
  {:db/ident :fibo-be-le-lei/hasTransliteratedLegalFormAbbreviation,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "has transliterated legal form abbreviation",
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "a transliterated (i.e., in Latin or Romanized ASCII) representation of the abbreviation for the entity legal form"})

(def hasTransliteratedName
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-be-le-lei/hasTransliteratedName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "has transliterated name",
   :rdfs/subPropertyOf #{:cmns-txt/hasTextValue
                         :fibo-fnd-rel-rel/hasTextualName},
   :skos/definition
   "a transliterated (i.e., in Latin or Romanized ASCII) representation of a name for the entity"})

(def isConsolidatedBy
  {:cmns-av/adaptedFrom
   {:rdf/value
    "GLEIF Level 2 Relationship Record (RR) Common Data Format (CDF), see https://www.gleif.org/en/about-lei/common-data-file-format/relationship-record-cdf-format#"},
   :db/ident :fibo-be-le-lei/isConsolidatedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "is consolidated by",
   :rdfs/range :fibo-be-le-lp/LegalEntity,
   :skos/definition
   "indicates the entity considered the 'end node' or consolidating entity (parent) from an ISO 17442 perspective"})

(def isConsolidationOf
  {:cmns-av/adaptedFrom
   {:rdf/value
    "GLEIF Level 2 Relationship Record (RR) Common Data Format (CDF), see https://www.gleif.org/en/about-lei/common-data-file-format/relationship-record-cdf-format#"},
   :db/ident :fibo-be-le-lei/isConsolidationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "is consolidation of",
   :rdfs/range :fibo-be-le-lp/LegalEntity,
   :rdfs/subPropertyOf :cmns-col/comprises,
   :skos/definition
   "indicates the entity considered the 'start node' or consolidated entity from an ISO 17442 perspective"})

(def isDirectlyConsolidatedBy
  {:cmns-av/adaptedFrom
   {:rdf/value
    "GLEIF Level 2 Relationship Record (RR) Common Data Format (CDF), see https://www.gleif.org/en/about-lei/common-data-file-format/relationship-record-cdf-format#"},
   :db/ident :fibo-be-le-lei/isDirectlyConsolidatedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "is directly consolidated by",
   :rdfs/range :fibo-be-le-lp/LegalEntity,
   :rdfs/subPropertyOf :fibo-be-le-lei/isConsolidatedBy,
   :skos/definition
   "indicates that the entity considered the 'end node' or consolidating entity (parent) fully consolidates the accounting of the 'start node' (child) per the accounting rules specified, and is the closest consolidating entity to that child in any applicable ownership hierarchy"})

(def isInternationalBranchOf
  {:cmns-av/adaptedFrom
   {:rdf/value
    "GLEIF Level 2 Relationship Record (RR) Common Data Format (CDF), see https://www.gleif.org/en/about-lei/common-data-file-format/relationship-record-cdf-format#"},
   :db/ident :fibo-be-le-lei/isInternationalBranchOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "is an international branch of",
   :rdfs/range :fibo-be-le-lp/LegalEntity,
   :rdfs/subPropertyOf :fibo-be-le-lei/isConsolidatedBy,
   :skos/definition
   "indicates that the entity considered the 'start node' or consolidated entity (child) is an international subsidiary of the 'end node' (parent) in the jurisdiction of the child"})

(def isQuantifiedBy
  {:cmns-av/adaptedFrom
   {:rdf/value
    "GLEIF Level 2 Relationship Record (RR) Common Data Format (CDF), see https://www.gleif.org/en/about-lei/common-data-file-format/relationship-record-cdf-format#"},
   :db/ident :fibo-be-le-lei/isQuantifiedBy,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "is quantified by",
   :rdfs/range :xsd/decimal,
   :skos/definition
   "indicates that something is limited to or conditional due to some rate or other statistical value"})

(def isUltimatelyConsolidatedBy
  {:cmns-av/adaptedFrom
   {:rdf/value
    "GLEIF Level 2 Relationship Record (RR) Common Data Format (CDF), see https://www.gleif.org/en/about-lei/common-data-file-format/relationship-record-cdf-format#"},
   :db/ident :fibo-be-le-lei/isUltimatelyConsolidatedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"},
   :rdfs/label "is ultimately consolidated by",
   :rdfs/range :fibo-be-le-lp/LegalEntity,
   :rdfs/subPropertyOf :fibo-be-le-lei/isConsolidatedBy,
   :skos/definition
   "indicates that the entity considered the 'end node' or consolidating entity (parent) fully consolidates the accounting of the 'start node' (child) per the accounting rules specified, and is the most distant consolidating entity to that child in any applicable ownership hierarchy"})

(def urn:uuid:9c7b255b-e7a9-5692-b019-15b789cd60a5
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines concepts around contractually capable business entities. The terms defined here are those which are relevant to the Legal Entity Identifier (LEI) work. The term known as legal entity in that work is identified as a formal organization which is recognized in some jurisdiction as being capable of incurring some liability, whether or not is a legal person as understood by the legal community. This is labeled as contractually capable entity, to avoid confusion with the accepted legal term for Legal Entity. Such entities are recognized as requiring an LEI, but the identifier itself is allocated to the formal organization which is recognized as being contractually capable.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Quantities/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/Addresses/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Organizations/Organizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/TextDatatype/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LegalPersons/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LEIEntities/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Legal Entity Identifier (LEI) Entities Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities.rdf version of this ontology was revised to reflect the move of some organization-specific concepts from BE to FND."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities.rdf version of this ontology was revised to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities.rdf version of this ontology was revised to replace hasDefinition with isDefinedIn to clarify intent."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities.rdf version of this ontology was revised to clean up circular definitions and augment it to incorporate the Text datatype and structure names, including eliminating redundant restrictions on LegalEntity."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities.rdf version of this ontology was revised to change the restriction on EntityLegalForm from identifies to denotes, in line with the definition of a code as opposed to an identifier, given the nature of an entity legal form."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.1 RTF report. Changes include deprecation of the MunicipalEntity, Sovereign, and SupranationalEntity classes and making them equivalent to classes in the Government Entities ontology."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities.rdf version of this ontology was modified to incorporate LEIEligibleEntity and LEIRegisteredEntity, as well as add restrictions in support of the ISO 17442 LEI effort and related changes to the GLEIF Common Data Format for the FIBO 2.0 RFC."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities.rdf version of this ontology was revised to address text formatting hygiene issues."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities.rdf version of this ontology was modified to deprecate LEIEligibleEntity as a part of a simplification strategy for the organizational class hierarchy, to support GLEIF LEI Level 2 ownership relationships, and eliminate a circular dependency with government entities by removing elements that had been deprecated for the last several FIBO revisions (municipal entity, sovereign, and supranational entity)."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities.rdf version of this ontology was revised to eliminate duplication with concepts in LCC and to correct the parent of relationship record."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"})