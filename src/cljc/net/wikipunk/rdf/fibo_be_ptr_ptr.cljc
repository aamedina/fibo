(ns net.wikipunk.rdf.fibo-be-ptr-ptr
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/Partnerships/Partnerships/",
   :dcterms/abstract
   "This ontology defines partnerships and related concepts. The concepts distinguish general from limited partners, as well as the types of equity that they hold. Included are abstract definitions of partnership types based on whether they have general, limited or both kinds of partners. Both legally incorporated and non incorporated forms of partnerships are covered.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-fbo"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-be-oac-cpty"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/",
    "fibo-be-oac-opty"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/",
    "fibo-be-ptr-ptr"
    "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
    "fibo-fnd-law-lcap"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/",
    "fibo-fnd-org-org"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
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
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Law/LegalCapacity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/OwnershipAndControl/OwnershipParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Organizations/Organizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/OwnershipAndControl/ControlParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/Partnerships/Partnerships/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-ptr-ptr",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/",
   :rdfs/label "Partnerships Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified per the FIBO 2.0 RFC to reference shareholders' equity vs. stockholders' equity and correct a number of restrictions."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified to simplify / merge the legal person and formal organization class hierarchies."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified to address text formatting hygiene issues."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified to reflect the move of OrganizationMember from Parties to Organizations in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified to fix spelling errors."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified to eliminate duplication with concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was restructured to simplify the overall structure of partnerships, eliminate kinds of partnerships that do not exist, simplify the concept of a partnership agreement, loosen or eliminate restrictions as appropriate, add common forms of partnership that were missing, and revise definitions to be ISO 704 compliant."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified to reflect the move of hasObjective to FND to enable higher level reuse."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/"})

(def GeneralPartner
  {:cmns-av/explanatoryNote
   "Note that although typically a general partner is a person, in the context of certain funds, such as private equity, a general partner may be a firm that manages the fund.",
   :db/ident :fibo-be-ptr-ptr/GeneralPartner,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/"},
   :rdfs/label "general partner",
   :rdfs/subClassOf #{{:owl/onProperty :cmns-rlcmp/isPlayedBy,
                       :owl/someValuesFrom
                       {:owl/onProperty :fibo-fnd-law-lcap/hasCapacity,
                        :owl/someValuesFrom
                        :fibo-fnd-law-lcap/LiabilityCapacity,
                        :rdf/type :owl/Restriction},
                       :rdf/type :owl/Restriction} :fibo-be-ptr-ptr/Partner
                      :fibo-be-oac-cpty/DeJureControllingInterestParty},
   :skos/definition
   "partner and part-owner that is responsible for managing the day to day operations of the partnership and that may be jointly and severally liable for the obligations of the partnership"})

(def GeneralPartnership
  {:cmns-av/abbreviation "GP",
   :cmns-av/explanatoryNote
   "General partnerships are the most basic and common form of partnership world-wide.",
   :db/ident :fibo-be-ptr-ptr/GeneralPartnership,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/"},
   :rdfs/label "general partnership",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-col/hasMember,
      :owl/someValuesFrom {:owl/minQualifiedCardinality 2,
                           :owl/onClass    :fibo-be-ptr-ptr/GeneralPartner,
                           :owl/onProperty :cmns-rlcmp/playsRole,
                           :rdf/type       :owl/Restriction},
      :rdf/type           :owl/Restriction} :fibo-be-ptr-ptr/Partnership
     {:owl/onProperty     :fibo-be-ptr-ptr/hasGeneralPartner,
      :owl/someValuesFrom :fibo-be-ptr-ptr/GeneralPartner,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "partnership that has at least two general partners that agree to share in all assets, profits, and financial and legal liabilities of the business"})

(def LimitedLiabilityLimitedPartnership
  {:cmns-av/abbreviation "LLLP",
   :cmns-av/explanatoryNote
   "The primary difference between an LLLP and more traditional limited partnership is that an LLLP allows liability transfer from the general partner's (to external insurer) for debts and obligations of the limited partnership. Typically, general partners manage the LLLP, while the limited partners' interest is primarily for investment purposes.",
   :db/ident :fibo-be-ptr-ptr/LimitedLiabilityLimitedPartnership,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/"},
   :rdfs/label "limited liability limited partnership",
   :rdfs/subClassOf :fibo-be-ptr-ptr/LimitedPartnership,
   :skos/definition
   "limited partnership that consists of one or more general partners who are liable for the obligations of the entity as well as one or more protected limited liability partners"})

(def LimitedLiabilityPartnership
  {:cmns-av/abbreviation "LLP",
   :cmns-av/explanatoryNote
   "LLPs are a flexible legal and tax entity that allows partners to benefit from economies of scale by working together while also reducing their liability for the actions of other partners.",
   :db/ident :fibo-be-ptr-ptr/LimitedLiabilityPartnership,
   :owl/disjointWith :fibo-be-ptr-ptr/LimitedPartnership,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/"},
   :rdfs/label "limited liability partnership",
   :rdfs/subClassOf #{:fibo-be-ptr-ptr/Partnership
                      {:owl/onProperty     :fibo-be-ptr-ptr/hasGeneralPartner,
                       :owl/someValuesFrom :fibo-be-ptr-ptr/GeneralPartner,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "partnership that has general partners but provides its individual partners some level of protection against personal liability for certain partnership liabilities",
   :skos/example
   #{"One example of a limited liability partnership is that of an incorporated limited partnership (ILP) in Australia."
     "Law firms, accountancies, wealth managers, professional medical groups, and other professional consultancies often take the form of a limited liability partnership."}})

(def LimitedPartner
  {:db/ident :fibo-be-ptr-ptr/LimitedPartner,
   :owl/disjointWith :fibo-be-ptr-ptr/GeneralPartner,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/"},
   :rdfs/label "limited partner",
   :rdfs/subClassOf :fibo-be-ptr-ptr/Partner,
   :skos/definition
   "partner whose liabilities are limited to the extent of their investment or guarantees and that has no involvement in the day to day operations of the partnership"})

(def LimitedPartnership
  {:cmns-av/abbreviation "LP",
   :cmns-av/explanatoryNote
   "Limited partnerships are distinct from limited liability partnerships, in which all partners have limited liability. Similar to a general partnership, the general partners have management control, share the right to use partnership property, share the profits of the firm in predefined proportions, and have joint and several liability for the debts of the partnership.",
   :db/ident :fibo-be-ptr-ptr/LimitedPartnership,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/"},
   :rdfs/label "limited partnership",
   :rdfs/subClassOf #{:fibo-be-ptr-ptr/Partnership
                      {:owl/onProperty     :fibo-be-ptr-ptr/hasGeneralPartner,
                       :owl/someValuesFrom :fibo-be-ptr-ptr/GeneralPartner,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-be-ptr-ptr/hasLimitedPartner,
                       :owl/someValuesFrom :fibo-be-ptr-ptr/LimitedPartner,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "partnership that has at least one general partner and at least one limited partner",
   :skos/example
   "In the United States, film production companies, real estate investment firms, and private equity firms are typically formed as limited partnerships. In the United Kingdom, limited partnerships are governed by the Limited Partnerships Act 1907 and, on matters on which that Act is silent, also by the Partnership Act 1890."})

(def Partner
  {:db/ident :fibo-be-ptr-ptr/Partner,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/"},
   :rdfs/label "partner",
   :rdfs/subClassOf
   #{{:owl/onClass    :fibo-be-le-lp/LegalPerson,
      :owl/onProperty :cmns-rlcmp/isPlayedBy,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction} :fibo-be-oac-opty/ConstitutionalOwner
     {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom {:owl/onProperty :cmns-pts/isAPartyTo,
                           :owl/someValuesFrom
                           :fibo-be-ptr-ptr/PartnershipAgreement,
                           :rdf/type :owl/Restriction},
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom {:owl/onProperty     :cmns-col/isMemberOf,
                           :owl/someValuesFrom :fibo-be-ptr-ptr/Partnership,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction}
     :fibo-fnd-org-org/OrganizationMember},
   :skos/definition
   "co-owner, member, and agent of a partnership whose participation level, including proportional liabilities and share in the profit / loss of the business is specified in a partnership agreement"})

(def Partnership
  {:cmns-av/explanatoryNote
   #{"Partnerships exist in many countries world-wide. Examples of the laws related to the establishment and operation of partnerships include the Partnership Act of 1890 in the United Kingdom and the Uniform Partnership Act in the United States."
     "Whether or not partnerships are established through, for example, incorporation, depends on the jurisdiction. Partnerships typically not corporations in the US, but can be in Australia and Ghana. See https://legalvision.com.au/what-are-incorporated-limited-partnerships/ and http://swiftlaw.co/incorporated-partnership/ for additional details."},
   :db/ident :fibo-be-ptr-ptr/Partnership,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/"},
   :rdfs/label "partnership",
   :rdfs/subClassOf
   #{:fibo-be-le-lp/LegalEntity
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-be-le-lp/ProfitObjective,
      :owl/onProperty :fibo-fnd-gao-obj/hasObjective,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-rel-rel/isGovernedBy,
      :owl/someValuesFrom :fibo-be-ptr-ptr/PartnershipAgreement,
      :rdf/type           :owl/Restriction} :fibo-be-le-lp/BusinessEntity
     {:owl/onProperty     :cmns-col/hasMember,
      :owl/someValuesFrom {:owl/onProperty     :cmns-rlcmp/playsRole,
                           :owl/someValuesFrom :fibo-be-ptr-ptr/Partner,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "association of two or more legal persons to carry on as co-owners a business for profit"})

(def PartnershipAgreement
  {:cmns-av/synonym "articles of partnership",
   :db/ident :fibo-be-ptr-ptr/PartnershipAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/"},
   :rdfs/label "partnership agreement",
   :rdfs/subClassOf #{:fibo-be-le-fbo/OrganizationCoveringAgreement
                      {:owl/onProperty     :cmns-pts/hasPartyRole,
                       :owl/someValuesFrom :fibo-be-ptr-ptr/Partner,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "contract between partners in a partnership that establishes the terms and conditions of the relationship between the partners"})

(def hasGeneralPartner
  {:db/ident :fibo-be-ptr-ptr/hasGeneralPartner,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-ptr-ptr/Partnership,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/"},
   :rdfs/label "has general partner",
   :rdfs/range :fibo-be-ptr-ptr/GeneralPartner,
   :rdfs/subPropertyOf :cmns-pts/isAffectedBy,
   :skos/definition
   "indicates an actor that has some measure of control over the partnership"})

(def hasLimitedPartner
  {:db/ident :fibo-be-ptr-ptr/hasLimitedPartner,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-ptr-ptr/Partnership,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/"},
   :rdfs/label "has limited partner",
   :rdfs/range :fibo-be-ptr-ptr/LimitedPartner,
   :rdfs/subPropertyOf :cmns-pts/isAffectedBy,
   :skos/definition
   "indicates an actor that may have some measure of influence over the partnership"})

(def isGeneralPartnerOf
  {:db/ident :fibo-be-ptr-ptr/isGeneralPartnerOf,
   :owl/inverseOf :fibo-be-ptr-ptr/hasGeneralPartner,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-ptr-ptr/GeneralPartner,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/"},
   :rdfs/label "is general partner of",
   :rdfs/range :fibo-be-ptr-ptr/Partnership,
   :rdfs/subPropertyOf :cmns-pts/actsOn,
   :skos/definition
   "indicates the organization that the general partner manages"})

(def isLimitedPartnerOf
  {:db/ident :fibo-be-ptr-ptr/isLimitedPartnerOf,
   :owl/inverseOf :fibo-be-ptr-ptr/hasLimitedPartner,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-ptr-ptr/LimitedPartner,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/"},
   :rdfs/label "is limited partner of",
   :rdfs/range :fibo-be-ptr-ptr/Partnership,
   :rdfs/subPropertyOf :cmns-pts/actsOn,
   :skos/definition
   "indicates the organization that the limited partner participates in"})

(def urn:uuid:3f1c264d-4c54-57cf-913c-2f629924ed50
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines partnerships and related concepts. The concepts distinguish general from limited partners, as well as the types of equity that they hold. Included are abstract definitions of partnership types based on whether they have general, limited or both kinds of partners. Both legally incorporated and non incorporated forms of partnerships are covered.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Law/LegalCapacity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/OwnershipAndControl/OwnershipParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Organizations/Organizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/OwnershipAndControl/ControlParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/Partnerships/Partnerships/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Partnerships Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified per the FIBO 2.0 RFC to reference shareholders' equity vs. stockholders' equity and correct a number of restrictions."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified to simplify / merge the legal person and formal organization class hierarchies."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified to address text formatting hygiene issues."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified to reflect the move of OrganizationMember from Parties to Organizations in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified to fix spelling errors."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified to eliminate duplication with concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was restructured to simplify the overall structure of partnerships, eliminate kinds of partnerships that do not exist, simplify the concept of a partnership agreement, loosen or eliminate restrictions as appropriate, add common forms of partnership that were missing, and revise definitions to be ISO 704 compliant."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified to reflect the move of hasObjective to FND to enable higher level reuse."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/"})