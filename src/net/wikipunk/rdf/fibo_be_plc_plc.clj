(ns net.wikipunk.rdf.fibo-be-plc-plc
  "This ontology defines the fundamental concepts for representing private limited companies -- i.e., companies that have characteristics of corporations and of partnerships but are neither."
  {:cmns-av/copyright ["Copyright (c) 2016-2023 EDM Council, Inc."
                       "Copyright (c) 2016-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/",
   :dcterms/abstract
   "This ontology defines the fundamental concepts for representing private limited companies -- i.e., companies that have characteristics of corporations and of partnerships but are neither.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/OwnershipParties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/ControlParties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Organizations/Organizations/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/Executives/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-be-oac-cpty"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/",
    "fibo-be-oac-exec"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
    "fibo-be-oac-opty"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/",
    "fibo-be-plc-plc"
    "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/",
    "fibo-fnd-org-org"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
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
   :rdfa/prefix "fibo-be-plc-plc",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/",
   :rdfs/label "Private Limited Companies Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/PrivateLimitedCompanies.rdf version of this ontology was modified to eliminate a smart quote in an explanatory note on manager-managed limited liability company, and to reflect the move of OrganizationMember from Parties to Organizations in FND"
    "The https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/PrivateLimitedCompanies.rdf version of this ontology was modified to simplify / merge the legal person and formal organization class hierarchies, and add limited liability company, limited liability company taxed as a corporation, managing member, and private limited company."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/PrivateLimitedCompanies.rdf version of this ontology was modified to fix spelling errors."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/PrivateLimitedCompanies.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/PrivateLimitedCompanies.rdf version of this ontology was modified per the FIBO 2.0 RFC."]})

(def LimitedLiabilityCompany
  "private limited company that combines the pass through taxation of a sole proprietorship or partnership with the limited liability of a corporation"
  {:cmns-av/abbreviation "LLC",
   :db/ident :fibo-be-plc-plc/LimitedLiabilityCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/",
   :rdfs/label "limited liability company",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-pty-rl/playsRole,
     :owl/someValuesFrom {:owl/onProperty
                          :fibo-be-oac-cpty/hasControllingOrganizationMember,
                          :owl/someValuesFrom
                          :fibo-be-plc-plc/LimitedLiabilityCompanyMember,
                          :rdf/type :owl/Restriction},
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    {:owl/onProperty     :fibo-be-plc-plc/hasManagingMember,
                      :owl/someValuesFrom :fibo-be-plc-plc/ManagingMember,
                      :rdf/type           :owl/Restriction},
     :owl/onProperty :fibo-fnd-pty-rl/playsRole,
     :rdf/type       :owl/Restriction}
    :fibo-be-plc-plc/PrivateCompanyWithLimitedLiability],
   :skos/definition
   "private limited company that combines the pass through taxation of a sole proprietorship or partnership with the limited liability of a corporation"})

(def LimitedLiabilityCompanyMember
  "owner of an interest in a limited liability company"
  {:db/ident :fibo-be-plc-plc/LimitedLiabilityCompanyMember,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/",
   :rdfs/label "limited liability company member",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/onProperty :lcc-lr/isMemberOf,
                          :owl/someValuesFrom
                          :fibo-be-plc-plc/LimitedLiabilityCompany,
                          :rdf/type :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-be-oac-cpty/DeJureControllingInterestParty
    :fibo-fnd-org-org/OrganizationMember
    :fibo-be-oac-cpty/EntityControllingParty
    {:owl/onClass    :fibo-be-le-lp/LegallyCompetentNaturalPerson,
     :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
     :owl/qualifiedCardinality 1,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    {:owl/onProperty :fibo-fnd-pty-rl/isPlayedBy,
                      :owl/someValuesFrom
                      :fibo-be-plc-plc/LimitedLiabilityCompany,
                      :rdf/type :owl/Restriction},
     :owl/onProperty :fibo-be-oac-cpty/isControllingMemberOf,
     :rdf/type       :owl/Restriction}
    :fibo-be-oac-opty/EntityOwner],
   :skos/definition "owner of an interest in a limited liability company"})

(def LimitedLiabilityCompanyTaxedAsACorporation
  "limited liability company that has elected to have corporate tax status"
  {:cmns-av/abbreviation "C-LLC",
   :cmns-av/explanatoryNote
   "In the United States, LLCs that elect to be taxed as a corporation do so by filing an IRS Form 8832.",
   :db/ident :fibo-be-plc-plc/LimitedLiabilityCompanyTaxedAsACorporation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/",
   :rdfs/label "limited liability company taxed as a corporation",
   :rdfs/subClassOf :fibo-be-plc-plc/LimitedLiabilityCompany,
   :skos/definition
   "limited liability company that has elected to have corporate tax status"})

(def ManagerManagedLimitedLiabilityCompany
  "limited liability company in which the members appoint one or more managers to handle the daily operations and administrative responsibilities of the organization"
  {:cmns-av/explanatoryNote
   "If no members are interested in managing the LLC, an external manager (someone who doesn't own any portion of the LLC) can be hired to run the business operations, including, in some jurisdictions, a third-party entity, such as another company.",
   :db/ident :fibo-be-plc-plc/ManagerManagedLimitedLiabilityCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/",
   :rdfs/label "manager-managed limited liability company",
   :rdfs/subClassOf :fibo-be-plc-plc/LimitedLiabilityCompany,
   :skos/definition
   "limited liability company in which the members appoint one or more managers to handle the daily operations and administrative responsibilities of the organization"})

(def ManagingMember
  "owner of an interest in a limited liability company who also runs the day-to-day business operations"
  {:db/ident :fibo-be-plc-plc/ManagingMember,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/",
   :rdfs/label "managing member",
   :rdfs/subClassOf [{:owl/onProperty :fibo-be-plc-plc/isManagingMemberOf,
                      :owl/someValuesFrom
                      {:owl/onProperty :fibo-fnd-pty-rl/isPlayedBy,
                       :owl/someValuesFrom
                       :fibo-be-plc-plc/LimitedLiabilityCompany,
                       :rdf/type :owl/Restriction},
                      :rdf/type :owl/Restriction}
                     :fibo-be-plc-plc/LimitedLiabilityCompanyMember
                     :fibo-be-oac-exec/PrincipalParty],
   :skos/definition
   "owner of an interest in a limited liability company who also runs the day-to-day business operations"})

(def PrivateCompanyWithLimitedLiability
  "hybrid business entity having characteristics of both a corporation and a partnership or sole proprietorship (depending on how many owners there are)"
  {:cmns-av/adaptedFrom
   "https://en.wikipedia.org/wiki/Limited_liability_company#Overview",
   :cmns-av/explanatoryNote
   "A private company with limited liability, although a business entity, is not a corporation. The primary characteristic this legal form shares with a corporation is limited liability, and the primary characteristic it shares with a partnership is the availability of pass-through income taxation. It is often more flexible than a corporation, and it is well-suited for companies with a single owner.",
   :db/ident :fibo-be-plc-plc/PrivateCompanyWithLimitedLiability,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/",
   :rdfs/label "private company with limited liability",
   :rdfs/subClassOf [:fibo-be-le-lp/LegalEntity :fibo-be-le-lp/BusinessEntity],
   :skos/definition
   "hybrid business entity having characteristics of both a corporation and a partnership or sole proprietorship (depending on how many owners there are)"})

(def PrivateLimitedCompany
  "private limited company whose shareholders' liability is limited to the capital they originally invested"
  {:cmns-av/abbreviation "Ltd.",
   :cmns-av/explanatoryNote
   "Private limited companies are common in countries including the U.K., Ireland, and Canada. They have one or more members, also called shareholders or owners, who buy in through private sales. Directors are company employees who keep up with all administrative tasks and tax filings but do not need to be shareholders.",
   :db/ident :fibo-be-plc-plc/PrivateLimitedCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/",
   :rdfs/label "private limited company",
   :rdfs/subClassOf :fibo-be-plc-plc/PrivateCompanyWithLimitedLiability,
   :skos/definition
   "private limited company whose shareholders' liability is limited to the capital they originally invested"})

(def hasManagingMember
  "indicates a managing member in a controlling role of a limited liability company that has responsibility for the day-to-day business operations"
  {:db/ident :fibo-be-plc-plc/hasManagingMember,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/",
   :rdfs/label "has managing member",
   :rdfs/range :fibo-be-plc-plc/ManagingMember,
   :rdfs/subPropertyOf :fibo-be-oac-cpty/hasControllingOrganizationMember,
   :skos/definition
   "indicates a managing member in a controlling role of a limited liability company that has responsibility for the day-to-day business operations"})

(def isManagingMemberOf
  "indicates the controlled limited liability company that the managing member runs"
  {:db/ident :fibo-be-plc-plc/isManagingMemberOf,
   :owl/inverseOf :fibo-be-plc-plc/hasManagingMember,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-plc-plc/ManagingMember,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/",
   :rdfs/label "is managing member of",
   :rdfs/subPropertyOf :fibo-be-oac-cpty/isControllingMemberOf,
   :skos/definition
   "indicates the controlled limited liability company that the managing member runs"})