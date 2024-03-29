(ns net.wikipunk.rdf.fibo-be-oac-opty
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/OwnershipAndControl/OwnershipParties/",
   :dcterms/abstract
   "This ontology defines concepts relating to types of organization owning parties. The concepts defined here are party in role concepts, which define the nature of some entity such as an organization or a legal person, in some role such as that of owning equity in the entity. These roles are defined in terms of the ownership enjoyed by the party, with distinctions between constitutional ownership i.e. ownership defined in terms of stockholder equity, and investment ownership more generally.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-fbo"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
    "fibo-be-le-lei"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-be-oac-opty"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/",
    "fibo-fnd-acc-aeq"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-arr-doc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
    "fibo-fnd-oac-ctl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
    "fibo-fnd-oac-own"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
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
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/OwnershipAndControl/Control/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/AccountingEquity/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LegalPersons/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/OwnershipAndControl/OwnershipParties/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-oac-opty",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/",
   :rdfs/label "Ownership Parties Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties.rdf version of this ontology was revised to eliminate references to guarantee providing member, which duplicates the concept of a guarantor and references a concept that is no longer needed, namely 'body incorporated with guarantee'."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties.rdf version of this ontology was revised to add a restriction on entity ownership for the ownership percentage."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties.rdf version of this ontology was modified to integrate the concept of a situation, situational roles, and corresponding relations with the definition of entity ownership, and eliminate unused and logically inconsistent properties."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties.rdf version of this ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties.rdf version of this ontology was modified to eliminate duplication of concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties.rdf version of this ontology was revised to eliminate a dead link that was not necessary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties.rdf version of this ontology was revised to align isEquityHeldBy and hasInvestor with the situational pattern."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties.rdf version of this ontology was modified as a part of a simplification strategy for the organizational class hierarchy and to support GLEIF LEI Level 2 ownership relationships."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties.rdf version of this ontology was revised to reflect the name change in FND from 'hasPrimaryParty' to 'hasActiveParty' to be more consistent with other role related properties."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties.rdf version of this ontology was modified per the FIBO 2.0 RFC to address missing labels and comments, and revise terminology related to shareholders' equity due to requirements for SEC/Equities."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/"})

(def ConstitutionalOwner
  {:db/ident :fibo-be-oac-opty/ConstitutionalOwner,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/"},
   :rdfs/label "constitutional owner",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/holds,
                       :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
                       :rdf/type           :owl/Restriction}
                      :fibo-be-oac-opty/EntityOwner},
   :skos/definition
   "a party that holds an equity stake in some entity, in the form of shareholders' equity",
   :skos/editorialNote
   "Typically this would be share ownership or the holding of partnership equity. Ownership in this 'constitutional' sense means that the owner is in some way a member of the organization, such as an employee or director, as distinct from some outside investor."})

(def ControllingEquity
  {:db/ident :fibo-be-oac-opty/ControllingEquity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/"},
   :rdfs/label "controlling equity",
   :rdfs/subClassOf #{:fibo-fnd-acc-aeq/ShareholdersEquity
                      {:owl/allValuesFrom :fibo-fnd-oac-ctl/DeJureControl,
                       :owl/onProperty    :fibo-fnd-rel-rel/confers,
                       :rdf/type          :owl/Restriction}},
   :skos/definition
   "shareholders's equity that formally confers control in the entity, either by law or as explicitly stated in a corresponding equity instrument"})

(def DirectConsolidation
  {:db/ident :fibo-be-oac-opty/DirectConsolidation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/"},
   :rdfs/label "direct consolidation",
   :rdfs/subClassOf :fibo-be-oac-opty/EntityOwnership,
   :skos/definition
   "direct ownership recorded as accounting consolidation, by some party of some other formal organization"})

(def EntityOwner
  {:db/ident :fibo-be-oac-opty/EntityOwner,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/"},
   :rdfs/label "entity owner",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/holds,
                       :owl/someValuesFrom :fibo-fnd-acc-aeq/OwnersEquity,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-oac-own/Owner},
   :skos/definition "a party that has some ownership interest in some entity",
   :skos/editorialNote
   "This is not the same meaning as being some owner of some asset. Rather, this is some party which partakes in the ownership of some kind of entity (a business entity or a legal entity for example) via some mechanism such as the ownership of equity in that entity."})

(def EntityOwnership
  {:db/ident :fibo-be-oac-opty/EntityOwnership,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/"},
   :rdfs/label "entity ownership",
   :rdfs/subClassOf #{:fibo-fnd-oac-own/Ownership
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    {:owl/unionOf
                                        [:fibo-fnd-acc-aeq/OwnersEquity
                                         :fibo-fnd-agr-ctr/Contract],
                                        :rdf/type :owl/Class},
                       :owl/onProperty :fibo-fnd-rel-rel/isConferredBy,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onDataRange :xsd/decimal,
                       :owl/onProperty  :fibo-be-le-lei/hasOwnershipPercentage,
                       :rdf/type        :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-be-le-lei/RelationshipQualifier,
                       :owl/onProperty :fibo-fnd-agr-ctr/isQualifiedBy,
                       :rdf/type       :owl/Restriction}
                      {:owl/onClass    :fibo-be-le-lei/RelationshipStatus,
                       :owl/onProperty :cmns-cls/isClassifiedBy,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :fibo-be-oac-opty/hasOwningEntity,
                       :owl/someValuesFrom :fibo-be-le-lp/LegalPerson,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty :fibo-be-oac-opty/hasOwnedEntity,
                       :owl/someValuesFrom
                       {:owl/unionOf [:fibo-be-le-fbo/NotForProfitOrganization
                                      :fibo-be-le-lp/BusinessEntity
                                      :fibo-be-le-lp/LegalEntity],
                        :rdf/type    :owl/Class},
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "ownership by some party of an interest in some non-governmental formal organization"})

(def ForeignBranchOwnership
  {:db/ident :fibo-be-oac-opty/ForeignBranchOwnership,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/"},
   :rdfs/label "foreign branch ownership",
   :rdfs/subClassOf :fibo-be-oac-opty/EntityOwnership,
   :skos/definition
   "ownership by some party of some formal organization or organizational sub-unit that is a foreign affiliate and legally part of the owning entity"})

(def InvestmentEquity
  {:db/ident :fibo-be-oac-opty/InvestmentEquity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/"},
   :rdfs/label "investment equity",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/isHeldBy,
                       :owl/someValuesFrom :fibo-be-oac-opty/Investor,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-acc-aeq/OwnersEquity},
   :skos/definition
   "equity that represents an ownership interest in some entity, but may or may not take the form of shareholders's equity",
   :skos/editorialNote
   "Typically an investment in some entity may take the form of shares (issued or privately held), i.e., shareholders' equity, or it may take the form of some capital amount which is not reflected in shareholders' equity. In each case, there would typically be a contractual basis for the investment setting out what controls or other benefits accrue to the investor."})

(def Investor
  {:db/ident :fibo-be-oac-opty/Investor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/"},
   :rdfs/label "investor",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/holds,
                       :owl/someValuesFrom :fibo-be-oac-opty/InvestmentEquity,
                       :rdf/type           :owl/Restriction}
                      :fibo-be-oac-opty/EntityOwner},
   :skos/definition
   "a party that owns some stake in some organization by way of investment",
   :skos/editorialNote
   "This is regardless of whether or not the investor is also a constitutional owner (e.g. shareholder) in the entity."})

(def InvestorContract
  {:db/ident :fibo-be-oac-opty/InvestorContract,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/"},
   :rdfs/label "investor contract",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-agr-ctr/definesTermsFor,
                       :owl/someValuesFrom :fibo-be-oac-opty/InvestmentEquity,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-agr-ctr/WrittenContract},
   :skos/definition
   "Contract setting out the terms under which some investor invests in the entity and setting out the rights which are conferred on that investor."})

(def UltimateConsolidation
  {:db/ident :fibo-be-oac-opty/UltimateConsolidation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/"},
   :rdfs/label "ultimate ownership",
   :rdfs/subClassOf :fibo-be-oac-opty/EntityOwnership,
   :skos/definition
   "highest-level (top, end) ancestral ownership, evidenced by accounting consolidation, by some party of some other legal entity"})

(def guarantees
  {:db/ident :fibo-be-oac-opty/guarantees,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/"},
   :rdfs/label "guarantees",
   :skos/definition
   "provides a formal assurance or promise, esp. that certain conditions shall be fulfilled relating to a product, service, or transaction"})

(def hasDirectOwnership
  {:db/ident :fibo-be-oac-opty/hasDirectOwnership,
   :owl/inverseOf :fibo-be-oac-opty/hasOwnedEntity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:fibo-be-le-fbo/NotForProfitOrganization
                               :fibo-be-le-lp/BusinessEntity
                               :fibo-be-le-lp/LegalEntity],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/"},
   :rdfs/label "has direct ownership",
   :rdfs/range :fibo-be-oac-opty/EntityOwnership,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/experiences,
   :skos/definition
   "relates a formal organization to the situation in which it is owned directly by another entity"})

(def hasDirectOwningEntity
  {:db/ident :fibo-be-oac-opty/hasDirectOwningEntity,
   :owl/propertyChainAxiom [:fibo-be-oac-opty/hasDirectOwnership
                            :fibo-be-oac-opty/hasOwningEntity],
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/"},
   :rdfs/label "has direct owning entity",
   :skos/definition
   "relates a formal organization to a direct legal person / owner"})

(def hasInvestmentEntity
  {:db/ident :fibo-be-oac-opty/hasInvestmentEntity,
   :owl/propertyChainAxiom [:fibo-be-oac-opty/hasInvestmentOwnership
                            :fibo-be-oac-opty/hasOwnedEntity],
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/"},
   :rdfs/label "has investment entity",
   :skos/definition
   "relates a legal person to a directly owned formal organization or subsidiary, depending on the percent ownership interest"})

(def hasInvestmentOwnership
  {:db/ident :fibo-be-oac-opty/hasInvestmentOwnership,
   :owl/inverseOf :fibo-be-oac-opty/hasOwningEntity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-le-lp/LegalPerson,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/"},
   :rdfs/label "has investment ownership",
   :rdfs/range :fibo-be-oac-opty/EntityOwnership,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/playsActiveRoleIn,
   :skos/definition
   "relates a legal person to the context in which it owns a formal organization"})

(def hasOwnedEntity
  {:db/ident :fibo-be-oac-opty/hasOwnedEntity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-opty/EntityOwnership,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/"},
   :rdfs/label "has owned entity",
   :rdfs/range {:owl/unionOf [:fibo-be-le-fbo/NotForProfitOrganization
                              :fibo-be-le-lp/BusinessEntity
                              :fibo-be-le-lp/LegalEntity],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/isExperiencedBy,
   :skos/definition
   "indicates a formal organization, including potentially a sole proprietorship, that is owned by a legal person"})

(def hasOwningEntity
  {:db/ident :fibo-be-oac-opty/hasOwningEntity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-opty/EntityOwnership,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/"},
   :rdfs/label "has owning entity",
   :rdfs/range :fibo-be-le-lp/LegalPerson,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/hasActiveParty,
   :skos/definition "indicates a party that owns a formal organization"})

(def urn:uuid:fdf6f856-6396-55c2-893b-6a2858ffdb96
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines concepts relating to types of organization owning parties. The concepts defined here are party in role concepts, which define the nature of some entity such as an organization or a legal person, in some role such as that of owning equity in the entity. These roles are defined in terms of the ownership enjoyed by the party, with distinctions between constitutional ownership i.e. ownership defined in terms of stockholder equity, and investment ownership more generally.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/OwnershipAndControl/Control/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/AccountingEquity/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LegalPersons/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/OwnershipAndControl/OwnershipParties/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Ownership Parties Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties.rdf version of this ontology was revised to eliminate references to guarantee providing member, which duplicates the concept of a guarantor and references a concept that is no longer needed, namely 'body incorporated with guarantee'."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties.rdf version of this ontology was revised to add a restriction on entity ownership for the ownership percentage."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties.rdf version of this ontology was modified to integrate the concept of a situation, situational roles, and corresponding relations with the definition of entity ownership, and eliminate unused and logically inconsistent properties."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties.rdf version of this ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties.rdf version of this ontology was modified to eliminate duplication of concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties.rdf version of this ontology was revised to eliminate a dead link that was not necessary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties.rdf version of this ontology was revised to align isEquityHeldBy and hasInvestor with the situational pattern."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties.rdf version of this ontology was modified as a part of a simplification strategy for the organizational class hierarchy and to support GLEIF LEI Level 2 ownership relationships."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties.rdf version of this ontology was revised to reflect the name change in FND from 'hasPrimaryParty' to 'hasActiveParty' to be more consistent with other role related properties."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties.rdf version of this ontology was modified per the FIBO 2.0 RFC to address missing labels and comments, and revise terminology related to shareholders' equity due to requirements for SEC/Equities."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/"})