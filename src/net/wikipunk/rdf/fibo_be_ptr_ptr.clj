(ns net.wikipunk.rdf.fibo-be-ptr-ptr
  "This ontology defines partnerships and related concepts. The concepts distinguish general from limited partners, as well as the types of equity that they hold. Included are abstract definitions of partnership types based on whether they have general, limited or both kinds of partners. Both legally incorporated and non incorporated forms of partnerships are covered."
  {:cmns-av/copyright ["Copyright (c) 2013-2023 Object Management Group, Inc."
                       "Copyright (c) 2013-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/",
   :dcterms/abstract
   "This ontology defines partnerships and related concepts. The concepts distinguish general from limited partners, as well as the types of equity that they hold. Included are abstract definitions of partnership types based on whether they have general, limited or both kinds of partners. Both legally incorporated and non incorporated forms of partnerships are covered.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/OwnershipParties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/FormalBusinessOrganizations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/LegalCapacity/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/ControlParties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Organizations/Organizations/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/GoalsAndObjectives/Objectives/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Partnerships/Partnerships/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
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
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-ptr-ptr",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/",
   :rdfs/label "Partnerships Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified to simplify / merge the legal person and formal organization class hierarchies."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified to eliminate duplication with concepts in LCC."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified per the FIBO 2.0 RFC to reference shareholders' equity vs. stockholders' equity and correct a number of restrictions."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified to eliminate deprecated elements."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified to fix spelling errors."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was restructured to simplify the overall structure of partnerships, eliminate kinds of partnerships that do not exist, simplify the concept of a partnership agreement, loosen or eliminate restrictions as appropriate, add common forms of partnership that were missing, and revise definitions to be ISO 704 compliant."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified to address text formatting hygiene issues."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified to reflect the move of hasObjective to FND to enable higher level reuse."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of this ontology was modified to reflect the move of OrganizationMember from Parties to Organizations in FND."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."]})

(def GeneralPartner
  "partner and part-owner that is responsible for managing the day to day operations of the partnership and that may be jointly and severally liable for the obligations of the partnership"
  {:cmns-av/explanatoryNote
   "Note that although typically a general partner is a person, in the context of certain funds, such as private equity, a general partner may be a firm that manages the fund.",
   :db/ident :fibo-be-ptr-ptr/GeneralPartner,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/",
   :rdfs/label "general partner",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
                      :owl/someValuesFrom {:owl/onProperty
                                           :fibo-fnd-law-lcap/hasCapacity,
                                           :owl/someValuesFrom
                                           :fibo-fnd-law-lcap/LiabilityCapacity,
                                           :rdf/type :owl/Restriction},
                      :rdf/type           :owl/Restriction}
                     :fibo-be-ptr-ptr/Partner
                     :fibo-be-oac-cpty/DeJureControllingInterestParty],
   :skos/definition
   "partner and part-owner that is responsible for managing the day to day operations of the partnership and that may be jointly and severally liable for the obligations of the partnership"})

(def GeneralPartnership
  "partnership that has at least two general partners that agree to share in all assets, profits, and financial and legal liabilities of the business"
  {:cmns-av/abbreviation "GP",
   :cmns-av/explanatoryNote
   "General partnerships are the most basic and common form of partnership world-wide.",
   :db/ident :fibo-be-ptr-ptr/GeneralPartnership,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/",
   :rdfs/label "general partnership",
   :rdfs/subClassOf
   [{:owl/onProperty     :lcc-lr/hasMember,
     :owl/someValuesFrom {:owl/minQualifiedCardinality 2,
                          :owl/onClass    :fibo-be-ptr-ptr/GeneralPartner,
                          :owl/onProperty :fibo-fnd-pty-rl/playsRole,
                          :rdf/type       :owl/Restriction},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-ptr-ptr/hasGeneralPartner,
     :owl/someValuesFrom :fibo-be-ptr-ptr/GeneralPartner,
     :rdf/type           :owl/Restriction}
    :fibo-be-ptr-ptr/Partnership],
   :skos/definition
   "partnership that has at least two general partners that agree to share in all assets, profits, and financial and legal liabilities of the business"})

(def LimitedLiabilityLimitedPartnership
  "limited partnership that consists of one or more general partners who are liable for the obligations of the entity as well as one or more protected limited liability partners"
  {:cmns-av/abbreviation "LLLP",
   :cmns-av/explanatoryNote
   "The primary difference between an LLLP and more traditional limited partnership is that an LLLP allows liability transfer from the general partner's (to external insurer) for debts and obligations of the limited partnership. Typically, general partners manage the LLLP, while the limited partners' interest is primarily for investment purposes.",
   :db/ident :fibo-be-ptr-ptr/LimitedLiabilityLimitedPartnership,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/",
   :rdfs/label "limited liability limited partnership",
   :rdfs/subClassOf :fibo-be-ptr-ptr/LimitedPartnership,
   :skos/definition
   "limited partnership that consists of one or more general partners who are liable for the obligations of the entity as well as one or more protected limited liability partners"})

(def LimitedLiabilityPartnership
  "partnership that has general partners but provides its individual partners some level of protection against personal liability for certain partnership liabilities"
  {:cmns-av/abbreviation "LLP",
   :cmns-av/explanatoryNote
   "LLPs are a flexible legal and tax entity that allows partners to benefit from economies of scale by working together while also reducing their liability for the actions of other partners.",
   :db/ident :fibo-be-ptr-ptr/LimitedLiabilityPartnership,
   :owl/disjointWith :fibo-be-ptr-ptr/LimitedPartnership,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/",
   :rdfs/label "limited liability partnership",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-be-ptr-ptr/hasGeneralPartner,
                      :owl/someValuesFrom :fibo-be-ptr-ptr/GeneralPartner,
                      :rdf/type           :owl/Restriction}
                     :fibo-be-ptr-ptr/Partnership],
   :skos/definition
   "partnership that has general partners but provides its individual partners some level of protection against personal liability for certain partnership liabilities",
   :skos/example
   ["Law firms, accountancies, wealth managers, professional medical groups, and other professional consultancies often take the form of a limited liability partnership."
    "One example of a limited liability partnership is that of an incorporated limited partnership (ILP) in Australia."]})

(def LimitedPartner
  "partner whose liabilities are limited to the extent of their investment or guarantees and that has no involvement in the day to day operations of the partnership"
  {:db/ident :fibo-be-ptr-ptr/LimitedPartner,
   :owl/disjointWith :fibo-be-ptr-ptr/GeneralPartner,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/",
   :rdfs/label "limited partner",
   :rdfs/subClassOf :fibo-be-ptr-ptr/Partner,
   :skos/definition
   "partner whose liabilities are limited to the extent of their investment or guarantees and that has no involvement in the day to day operations of the partnership"})

(def LimitedPartnership
  "partnership that has at least one general partner and at least one limited partner"
  {:cmns-av/abbreviation "LP",
   :cmns-av/explanatoryNote
   "Limited partnerships are distinct from limited liability partnerships, in which all partners have limited liability. Similar to a general partnership, the general partners have management control, share the right to use partnership property, share the profits of the firm in predefined proportions, and have joint and several liability for the debts of the partnership.",
   :db/ident :fibo-be-ptr-ptr/LimitedPartnership,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/",
   :rdfs/label "limited partnership",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-be-ptr-ptr/hasGeneralPartner,
                      :owl/someValuesFrom :fibo-be-ptr-ptr/GeneralPartner,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-be-ptr-ptr/hasLimitedPartner,
                      :owl/someValuesFrom :fibo-be-ptr-ptr/LimitedPartner,
                      :rdf/type           :owl/Restriction}
                     :fibo-be-ptr-ptr/Partnership],
   :skos/definition
   "partnership that has at least one general partner and at least one limited partner",
   :skos/example
   "In the United States, film production companies, real estate investment firms, and private equity firms are typically formed as limited partnerships. In the United Kingdom, limited partnerships are governed by the Limited Partnerships Act 1907 and, on matters on which that Act is silent, also by the Partnership Act 1890."})

(def Partner
  "co-owner, member, and agent of a partnership whose participation level, including proportional liabilities and share in the profit / loss of the business is specified in a partnership agreement"
  {:db/ident :fibo-be-ptr-ptr/Partner,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/",
   :rdfs/label "partner",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/onProperty     :lcc-lr/isMemberOf,
                          :owl/someValuesFrom :fibo-be-ptr-ptr/Partnership,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/onProperty :fibo-fnd-pty-pty/isAPartyTo,
                          :owl/someValuesFrom
                          :fibo-be-ptr-ptr/PartnershipAgreement,
                          :rdf/type :owl/Restriction},
     :rdf/type           :owl/Restriction}
    {:owl/onClass    :fibo-be-le-lp/LegalPerson,
     :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
     :owl/qualifiedCardinality 1,
     :rdf/type       :owl/Restriction}
    :fibo-fnd-org-org/OrganizationMember
    :fibo-be-oac-opty/ConstitutionalOwner],
   :skos/definition
   "co-owner, member, and agent of a partnership whose participation level, including proportional liabilities and share in the profit / loss of the business is specified in a partnership agreement"})

(def Partnership
  "association of two or more legal persons to carry on as co-owners a business for profit"
  {:cmns-av/explanatoryNote
   ["Whether or not partnerships are established through, for example, incorporation, depends on the jurisdiction. Partnerships typically not corporations in the US, but can be in Australia and Ghana. See https://legalvision.com.au/what-are-incorporated-limited-partnerships/ and http://swiftlaw.co/incorporated-partnership/ for additional details."
    "Partnerships exist in many countries world-wide. Examples of the laws related to the establishment and operation of partnerships include the Partnership Act of 1890 in the United Kingdom and the Uniform Partnership Act in the United States."],
   :db/ident :fibo-be-ptr-ptr/Partnership,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/",
   :rdfs/label "partnership",
   :rdfs/subClassOf
   [:fibo-be-le-lp/LegalEntity
    {:owl/onProperty     :fibo-fnd-rel-rel/isGovernedBy,
     :owl/someValuesFrom :fibo-be-ptr-ptr/PartnershipAgreement,
     :rdf/type           :owl/Restriction}
    :fibo-be-le-lp/BusinessEntity
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-be-le-lp/ProfitObjective,
     :owl/onProperty :fibo-fnd-gao-obj/hasObjective,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :lcc-lr/hasMember,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-pty-rl/playsRole,
                          :owl/someValuesFrom :fibo-be-ptr-ptr/Partner,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}],
   :skos/definition
   "association of two or more legal persons to carry on as co-owners a business for profit"})

(def PartnershipAgreement
  "contract between partners in a partnership that establishes the terms and conditions of the relationship between the partners"
  {:cmns-av/synonym "articles of partnership",
   :db/ident :fibo-be-ptr-ptr/PartnershipAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/",
   :rdfs/label "partnership agreement",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-pty-pty/hasPartyInRole,
                      :owl/someValuesFrom :fibo-be-ptr-ptr/Partner,
                      :rdf/type           :owl/Restriction}
                     :fibo-be-le-fbo/OrganizationCoveringAgreement],
   :skos/definition
   "contract between partners in a partnership that establishes the terms and conditions of the relationship between the partners"})

(def hasGeneralPartner
  "indicates an actor that has some measure of control over the partnership"
  {:db/ident :fibo-be-ptr-ptr/hasGeneralPartner,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-ptr-ptr/Partnership,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/",
   :rdfs/label "has general partner",
   :rdfs/range :fibo-be-ptr-ptr/GeneralPartner,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/isAffectedBy,
   :skos/definition
   "indicates an actor that has some measure of control over the partnership"})

(def hasLimitedPartner
  "indicates an actor that may have some measure of influence over the partnership"
  {:db/ident :fibo-be-ptr-ptr/hasLimitedPartner,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-ptr-ptr/Partnership,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/",
   :rdfs/label "has limited partner",
   :rdfs/range :fibo-be-ptr-ptr/LimitedPartner,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/isAffectedBy,
   :skos/definition
   "indicates an actor that may have some measure of influence over the partnership"})

(def isGeneralPartnerOf
  "indicates the organization that the general partner manages"
  {:db/ident :fibo-be-ptr-ptr/isGeneralPartnerOf,
   :owl/inverseOf :fibo-be-ptr-ptr/hasGeneralPartner,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-ptr-ptr/GeneralPartner,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/",
   :rdfs/label "is general partner of",
   :rdfs/range :fibo-be-ptr-ptr/Partnership,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/actsOn,
   :skos/definition
   "indicates the organization that the general partner manages"})

(def isLimitedPartnerOf
  "indicates the organization that the limited partner participates in"
  {:db/ident :fibo-be-ptr-ptr/isLimitedPartnerOf,
   :owl/inverseOf :fibo-be-ptr-ptr/hasLimitedPartner,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-ptr-ptr/LimitedPartner,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/",
   :rdfs/label "is limited partner of",
   :rdfs/range :fibo-be-ptr-ptr/Partnership,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/actsOn,
   :skos/definition
   "indicates the organization that the limited partner participates in"})