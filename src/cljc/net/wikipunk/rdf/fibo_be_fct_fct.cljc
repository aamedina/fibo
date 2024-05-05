(ns net.wikipunk.rdf.fibo-be-fct-fct
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/FunctionalEntities/FunctionalEntities/",
   :dcterms/abstract
   "This ontology defines the fundamental concepts for entities defined by their function, such as the relationship to the various forms which one or another functionally-defined entity may take. It also includes a number of basic types of entity defined by function, such as business and non-profit. The concepts in this ontology are intended to be extensible in other ontologies which may be dedicated to specific kinds of functionally-defined business entity or organization.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cds" "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-fct-fct"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities/",
    "fibo-be-le-fbo"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
    "fibo-fnd-arr-cls"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/",
    "fibo-fnd-org-fm"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
    "fibo-fnd-org-org"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
    "fibo-fnd-pas-pas"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/",
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
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/ClassificationSchemes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Organizations/FormalOrganizations/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/FunctionalEntities/FunctionalEntities/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-fct-fct",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities/",
   :rdfs/label "Functional Entities Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of this ontology was modified by the FIBO 2.0 revision to address missing labels and definitions on the deprecated sole proprietorship class to match those in the equivalent class."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of this ontology was modified to reflect the move of some organization-specific concepts from BE to FND."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of this ontology was modified to eliminate duplication of concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of this ontology was modified to address a circular definition on association."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of this ontology was modified to revise and extend the definition of merchant, to support merchant category codes as needed for representation of credit card transactions, merge business and functional business entity and eliminate commerce and commercial activity (which are not used anywhere in FIBO), and to clean up definitions and make them ISO 704 compliant."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.1 RTF report. Changes include deprecation of the SoleProprietorship class and making it equivalent to the class with the same name in the Sole Proprietorships ontology. This version also introduces a new FunctionalEntity class, as the parent of FunctionalBusinessEntity in this ontology and as the parent of Government in the GovernmentEntities ontology."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of this ontology was modified to add the concept of an association."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of this ontology was modified to generalize certain unions where they were no longer required and eliminate an unused import."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of this ontology was modified to address text formatting hygiene issues."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of this ontology was modified to eliminate deprecated elements."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities/"})

(def Association
  {:cmns-av/explanatoryNote
   "Associations include trade or business associations, industry sector-specific groups, and professional associations, among others. They also commonly include cooperative farms and markets.",
   :db/ident :fibo-be-fct-fct/Association,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities/"},
   :rdfs/label "association",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-rlcmp/playsRole,
                       :owl/someValuesFrom :fibo-be-fct-fct/CooperativeSociety,
                       :rdf/type           :owl/Restriction}
                      :fibo-be-le-fbo/NotForProfitOrganization},
   :skos/definition
   "not-for-profit organization that is owned by and acts on behalf of its members"})

(def CooperativeSociety
  {:cmns-av/synonym "cooperative",
   :db/ident :fibo-be-fct-fct/CooperativeSociety,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities/"},
   :rdfs/label "cooperative society",
   :rdfs/subClassOf :fibo-be-fct-fct/FunctionalBusinessEntity,
   :skos/definition
   "organization owned by and operated for the benefit of those using its services",
   :skos/example
   "In agriculture, there are broadly three types of cooperatives: a machinery pool, a manufacturing/marketing cooperative, and a credit union"})

(def FamilyOffice
  {:cmns-av/explanatoryNote
   "Family offices are often privately held companies set up to handle investment and wealth management for wealthy families.",
   :db/ident :fibo-be-fct-fct/FamilyOffice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities/"},
   :rdfs/label "family office",
   :rdfs/subClassOf :fibo-be-fct-fct/FunctionalBusinessEntity,
   :skos/definition
   "organization that assumes the day-to-day administration and management of a family's affairs"})

(def FunctionalBusinessEntity
  {:db/ident :fibo-be-fct-fct/FunctionalBusinessEntity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities/"},
   :rdfs/label "functional business entity",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-fnd-org-fm/FormalOrganization,
                       :owl/onProperty :cmns-rlcmp/isPlayedBy,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-be-fct-fct/FunctionalEntity},
   :skos/definition
   "functional entity defined in terms of the nature of the commercial activity it conducts"})

(def FunctionalEntity
  {:db/ident :fibo-be-fct-fct/FunctionalEntity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities/"},
   :rdfs/label "functional entity",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-rlcmp/isPlayedBy,
                       :owl/someValuesFrom :cmns-pts/Party,
                       :rdf/type           :owl/Restriction}
                      :cmns-rlcmp/FunctionalRole},
   :skos/definition "party defined in terms of a function it performs"})

(def Merchant
  {:db/ident :fibo-be-fct-fct/Merchant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities/"},
   :rdfs/label "merchant",
   :rdfs/subClassOf #{:fibo-be-fct-fct/FunctionalBusinessEntity
                      {:owl/onProperty     :cmns-id/isIdentifiedBy,
                       :owl/someValuesFrom :fibo-be-fct-fct/MerchantIdentifier,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty :cmns-cls/isClassifiedBy,
                       :owl/someValuesFrom
                       :fibo-be-fct-fct/MerchantCategoryCode,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "party engaged in the purchase and sales of goods produced by others for profit"})

(def MerchantCategoryCode
  {:cmns-av/abbreviation "MCC",
   :cmns-av/adaptedFrom
   {:rdf/value
    "ISO 18245:2003 Retail financial services - Merchant category codes"},
   :cmns-av/explanatoryNote
   #{"Merchant categories are organized by the type of business, trade or services supplied. Certain category codes including those for very large businesses, such as airlines and some hotel chains, may be delineated to the point of identifying the business. Merchant category codes and/or the descriptions of the service categories are frequently used in credit card and other banking transactions for analysis, transaction classification, such as for use in promotional rewards, and sometimes tax-related purposes."
     "Values are specified only for those merchant categories that are generally expected to originate retail financial transactions. Criteria for establishing a new category code includes (a) the merchant category is reasonable and substantially different from all other merchant categories currently represented in the list of code values; (b) the merchant category is separate and distinct from all other industries currently represented in the list of code values; (c) the proposal describes a merchant category or industry, and not a process; (d) the minimum annual sales volume of merchants included in the merchant category, taken as a whole, is USD 10 million; and (e) sufficient justification for the addition of a new code value is found."},
   :db/ident :fibo-be-fct-fct/MerchantCategoryCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities/"},
   :rdfs/label "merchant category code",
   :rdfs/subClassOf #{:fibo-fnd-arr-cls/IndustrySectorClassifier
                      {:owl/onDataRange :xsd/string,
                       :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}
                      {:owl/onClass :fibo-be-fct-fct/MerchantCategoryCodeScheme,
                       :owl/onProperty :cmns-dsg/isDefinedIn,
                       :owl/qualifiedCardinality 1,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty
                       :fibo-be-fct-fct/hasMerchantCategoryDescription,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type :owl/Restriction} :cmns-cds/CodeElement
                      {:owl/onProperty     :cmns-cls/classifies,
                       :owl/someValuesFrom :fibo-be-fct-fct/Merchant,
                       :rdf/type           :owl/Restriction}},
   :skos/definition "code used internationally to classify a merchant"})

(def MerchantCategoryCodeScheme
  {:cmns-av/adaptedFrom
   {:rdf/value
    "ISO 18245:2003 Retail financial services - Merchant category codes"},
   :cmns-av/explanatoryNote
   "ISO 18245 provides a set of merchant category codes that are used internationally. Some countries, regional governments, banks, and other large organizations extend the basic codes with custom additions to fit business needs.",
   :db/ident :fibo-be-fct-fct/MerchantCategoryCodeScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities/"},
   :rdfs/label "merchant category code scheme",
   :rdfs/subClassOf #{:fibo-fnd-arr-cls/IndustrySectorClassificationScheme
                      {:owl/onProperty :cmns-dsg/defines,
                       :owl/someValuesFrom
                       :fibo-be-fct-fct/MerchantCategoryCode,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "scheme defining a set of codes for classifying merchant services"})

(def MerchantIdentifier
  {:db/ident :fibo-be-fct-fct/MerchantIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities/"},
   :rdfs/label "merchant identifier",
   :rdfs/subClassOf #{:cmns-id/Identifier
                      {:owl/onClass    :fibo-be-fct-fct/Merchant,
                       :owl/onProperty :cmns-id/identifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "unique identifier for a merchant that is used, for example, for transaction interchange purposes"})

(def hasMerchantCategoryDescription
  {:db/ident :fibo-be-fct-fct/hasMerchantCategoryDescription,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-be-fct-fct/MerchantCategoryCode,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities/"},
   :rdfs/label "has merchant category description",
   :rdfs/range :xsd/string,
   :skos/definition
   "provides a text description of the sector to which the code applies"})

(def urn:uuid:95182dc9-9fce-59ff-8962-0a6994aa6645
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines the fundamental concepts for entities defined by their function, such as the relationship to the various forms which one or another functionally-defined entity may take. It also includes a number of basic types of entity defined by function, such as business and non-profit. The concepts in this ontology are intended to be extensible in other ontologies which may be dedicated to specific kinds of functionally-defined business entity or organization.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/ClassificationSchemes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Organizations/FormalOrganizations/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/FunctionalEntities/FunctionalEntities/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Functional Entities Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of this ontology was modified by the FIBO 2.0 revision to address missing labels and definitions on the deprecated sole proprietorship class to match those in the equivalent class."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of this ontology was modified to reflect the move of some organization-specific concepts from BE to FND."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of this ontology was modified to eliminate duplication of concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of this ontology was modified to address a circular definition on association."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of this ontology was modified to revise and extend the definition of merchant, to support merchant category codes as needed for representation of credit card transactions, merge business and functional business entity and eliminate commerce and commercial activity (which are not used anywhere in FIBO), and to clean up definitions and make them ISO 704 compliant."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.1 RTF report. Changes include deprecation of the SoleProprietorship class and making it equivalent to the class with the same name in the Sole Proprietorships ontology. This version also introduces a new FunctionalEntity class, as the parent of FunctionalBusinessEntity in this ontology and as the parent of Government in the GovernmentEntities ontology."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of this ontology was modified to add the concept of an association."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of this ontology was modified to generalize certain unions where they were no longer required and eliminate an unused import."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of this ontology was modified to address text formatting hygiene issues."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities.rdf version of this ontology was modified to eliminate deprecated elements."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities/"})