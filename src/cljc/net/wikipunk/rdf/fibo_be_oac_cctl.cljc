(ns net.wikipunk.rdf.fibo-be-oac-cctl
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/OwnershipAndControl/CorporateControl/",
   :dcterms/abstract
   "This ontology defines concepts relating to corporation-specific control. These concepts are based on the general types of control (both de facto control and controlling interests), as defined in the ControlParties ontology, and are the specific examples of these concepts as they apply to companies incorporated by the issuance of shares.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-fbo"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-be-oac-cctl"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/",
    "fibo-be-oac-cown"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership/",
    "fibo-be-oac-cpty"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/",
    "fibo-fnd-oac-ctl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
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
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/OwnershipAndControl/Control/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/OwnershipAndControl/ControlParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/OwnershipAndControl/CorporateOwnership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/OwnershipAndControl/OwnershipParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LegalPersons/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/OwnershipAndControl/CorporateControl/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-oac-cctl",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/",
   :rdfs/label "Corporate Control Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl.rdf version of the ontology was modified to simplify control concepts and relations."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl.rdf version of this ontology was revised to further clean up definitions related to control via ownership of shares, which only applies to corporations and some partnerships, and revise and extend the definition of affiliation."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl.rdf version of the ontology was modified to incorporate the latest insights into how control relations should integrate with the control situation."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl.rdf version of this ontology was revised to allow any legal entity to participate in control relations rather than limiting control to a stock corporation, and simplifying others such that any party can be a significant shareholder, for example, rather than limiting this role to a legal entity."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl.rdf version of this ontology was modified per the FIBO 2.0 RFC to add missing definitions and labels, eliminate references to BusinessFacingTypes, replace min 1 QCRs with someValuesFrom, address other hygiene issues, and limit the burden of certain restrictions, such as those on stock corporation, for typical applications."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl.rdf version of this ontology was modified as a part of a simplification strategy for the organizational class hierarchy and to correct reasoning anomalies."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl.rdf version of the ontology was modified to address text formatting hygiene issues."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/"})

(def Affiliate
  {:db/ident :fibo-be-oac-cctl/Affiliate,
   :owl/equivalentClass {:owl/unionOf
                         [:fibo-be-oac-cpty/MajorityControllingParty
                          :fibo-be-oac-cpty/ControlledParty],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/"},
   :rdfs/label "affiliate",
   :rdfs/subClassOf #{:fibo-fnd-pty-pty/PartyInRole
                      {:owl/onProperty     :fibo-be-oac-cctl/isAffiliateOf,
                       :owl/someValuesFrom :fibo-be-oac-cctl/Affiliate,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "party that is related to a legal entity, directly, or indirectly through one or more intermediaries, and controls, or is controlled by, or is under common control with that entity, typically determined by the degree of ownership"})

(def Affiliation
  {:db/ident :fibo-be-oac-cctl/Affiliation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/"},
   :rdfs/label "affiliation",
   :rdfs/subClassOf
   #{:fibo-fnd-oac-ctl/Control
     {:owl/onProperty     :fibo-fnd-pty-pty/hasUndergoer,
      :owl/someValuesFrom :fibo-be-oac-cctl/ControlledAffiliate,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-pty-pty/hasActor,
      :owl/someValuesFrom :fibo-be-oac-cctl/ControllingAffiliate,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "situation in which a controlled party is affiliated with a controlling party for some period of time"})

(def ControlledAffiliate
  {:db/ident :fibo-be-oac-cctl/ControlledAffiliate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/"},
   :rdfs/label "controlled affiliate",
   :rdfs/subClassOf #{:fibo-be-oac-cctl/Affiliate
                      {:owl/allValuesFrom :fibo-be-le-lp/LegalEntity,
                       :owl/onProperty    :fibo-fnd-rel-rel/hasIdentity,
                       :rdf/type          :owl/Restriction}
                      :fibo-be-oac-cpty/ControlledParty},
   :skos/definition "controlled party in an affiliation situation"})

(def ControllingAffiliate
  {:db/ident :fibo-be-oac-cctl/ControllingAffiliate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/"},
   :rdfs/label "controlling affiliate",
   :rdfs/subClassOf #{:fibo-be-oac-cctl/Affiliate
                      :fibo-be-oac-cpty/MajorityControllingParty},
   :skos/definition "controlling party in an affiliation situation"})

(def DomesticUltimateParent
  {:db/ident :fibo-be-oac-cctl/DomesticUltimateParent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/"},
   :rdfs/label "domestic ultimate parent",
   :rdfs/subClassOf :fibo-be-oac-cctl/TotalControllingInterestParty,
   :skos/definition
   "party that is recognized as the ultimate parent of a given organization within the country or jurisdiction of incorporation or organization"})

(def GlobalUltimateParent
  {:db/ident :fibo-be-oac-cctl/GlobalUltimateParent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/"},
   :rdfs/label "global ultimate parent",
   :rdfs/subClassOf :fibo-be-oac-cctl/TotalControllingInterestParty,
   :skos/definition
   "party that is recognized as the ultimate parent of a given organization world-wide"})

(def JointVenturePartner
  {:db/ident :fibo-be-oac-cctl/JointVenturePartner,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/"},
   :rdfs/label "joint venture partner",
   :rdfs/subClassOf #{{:owl/onProperty :fibo-fnd-oac-ctl/isControllingPartyOf,
                       :owl/someValuesFrom :fibo-be-le-fbo/JointVenture,
                       :rdf/type :owl/Restriction}
                      :fibo-be-oac-cpty/EntityControllingParty},
   :skos/definition
   "party that shares capital, technology, human resources, risks, and benefits of an entity under shared control"})

(def SignificantShareholder
  {:cmns-av/explanatoryNote
   "Note that the concept of significance varies depending on the jurisdiction, and particularly with respect to reporting requirements. For example, in some cases, three (3) percent ownership of any class or series of shares is considered significant, and in others it means more than five or ten percent of the total combined voting power across all classes of securities.",
   :db/ident :fibo-be-oac-cctl/SignificantShareholder,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/"},
   :rdfs/label "significant shareholder",
   :rdfs/subClassOf :fibo-be-oac-cctl/VotingShareholder,
   :skos/definition
   "party that owns a significant voting stake in an organization that is less than 50 percent but greater than some threshold"})

(def Subsidiary
  {:cmns-av/explanatoryNote
   "A subsidiary is a separate, distinct legal entity from its parent company(ies) for the purposes of taxation, regulatory compliance, and with respect to liability.",
   :db/ident :fibo-be-oac-cctl/Subsidiary,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/"},
   :rdfs/label "subsidiary",
   :rdfs/subClassOf :fibo-be-oac-cctl/ControlledAffiliate,
   :skos/definition
   "legal entity that is entirely or majority owned and controlled by another legal entity"})

(def TotalControllingInterestParty
  {:cmns-av/explanatoryNote
   "By virtue of holding 100 percent of the share ownership, the total controlling interest company also holds 100 percent of the controlling equity, if there is a difference. Therefore, it is both a total owner and a total controlling party.",
   :cmns-av/synonym "parent company",
   :db/ident :fibo-be-oac-cctl/TotalControllingInterestParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/"},
   :rdfs/label "total controlling interest party",
   :rdfs/subClassOf #{:fibo-be-oac-cpty/TotalOwner
                      :fibo-be-oac-cctl/SignificantShareholder},
   :skos/definition
   "voting shareholder that owns 100 percent of the voting shares in some legal entity"})

(def VotingShareholder
  {:db/ident :fibo-be-oac-cctl/VotingShareholder,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/"},
   :rdfs/label "voting shareholder",
   :rdfs/subClassOf #{:fibo-be-oac-cown/Shareholder
                      :fibo-be-oac-cpty/DeJureControllingInterestParty},
   :skos/definition
   "shareholder whose shares confer the right to vote in corporate elections, including the right to elect directors at annual or special meetings, and to express their views to corporate management and directors on significant issues that may affect the value of those shares"})

(def hasAffiliate
  {:db/ident :fibo-be-oac-cctl/hasAffiliate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-le-lp/LegalEntity,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/"},
   :rdfs/label "has affiliate",
   :rdfs/range :fibo-be-oac-cctl/Affiliate,
   :rdfs/subPropertyOf :fibo-fnd-oac-ctl/isControlledPartyOf,
   :skos/definition
   "has a party which directly, or indirectly through one or more intermediaries, controls, or is controlled by, or is under common control with the company"})

(def hasControllingAffiliate
  {:db/ident :fibo-be-oac-cctl/hasControllingAffiliate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-cctl/ControlledAffiliate,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/"},
   :rdfs/label "has controlling affiliate",
   :rdfs/range :fibo-be-oac-cctl/ControllingAffiliate,
   :rdfs/subPropertyOf #{:fibo-be-oac-cctl/isAffiliateOf
                         :fibo-fnd-pty-pty/isAffectedBy},
   :skos/definition
   "is directly, or indirectly through one or more intermediaries, controlled by"})

(def hasDomesticUltimateParent
  {:cmns-av/adaptedFrom
   {:rdf/value
    "consensus definition of ultimate parent, with the split between domestic and global parent"},
   :db/ident :fibo-be-oac-cctl/hasDomesticUltimateParent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/"},
   :rdfs/label "has domestic ultimate parent",
   :rdfs/range :fibo-be-oac-cctl/DomesticUltimateParent,
   :rdfs/subPropertyOf :fibo-be-oac-cpty/hasMajorityControllingParty,
   :skos/definition
   "relates an organization to another recognized as its ultimate parent, within its country or jurisdiction of incorporation, if it has one",
   :skos/editorialNote
   "In the case of companies that are subsidiaries of another company that itself has a parent, this identifies the organization at the top of the hierarchy of organizations in the country of registration. Adapted from consensus definition of Ultimate Parent, now that this is split into national and global parent."})

(def hasGlobalUltimateParent
  {:cmns-av/adaptedFrom
   {:rdf/value
    "consensus definition of ultimate parent, with the split between domestic and global parent"},
   :db/ident :fibo-be-oac-cctl/hasGlobalUltimateParent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/"},
   :rdfs/label "has global ultimate parent",
   :rdfs/range :fibo-be-oac-cctl/GlobalUltimateParent,
   :rdfs/subPropertyOf :fibo-be-oac-cpty/hasMajorityControllingParty,
   :skos/definition
   "relates an organization to another recognized as its ultimate parent, if it has one",
   :skos/editorialNote
   "In the case of companies that are subsidiaries of another company that itself has a parent, this identifies the organization at the top of the hierarchy, world-wide. Adapted from consensus definition of Ultimate Parent, now that this is split into national and global parent."})

(def hasSubsidiary
  {:db/ident :fibo-be-oac-cctl/hasSubsidiary,
   :owl/propertyChainAxiom [:fibo-fnd-pty-rl/playsRole
                            :fibo-be-oac-cctl/isParentCompanyOf],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-le-lp/LegalEntity,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/"},
   :rdfs/label "has subsidiary",
   :rdfs/range :fibo-be-oac-cctl/Subsidiary,
   :skos/definition
   "relates a legal entity to another organization that it owns at least 50 percent of"})

(def isAffiliateOf
  {:db/ident :fibo-be-oac-cctl/isAffiliateOf,
   :rdf/type #{:owl/SymmetricProperty :owl/ObjectProperty},
   :rdfs/domain :fibo-be-oac-cctl/Affiliate,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/"},
   :rdfs/label "is affiliate of",
   :rdfs/range :fibo-be-oac-cctl/Affiliate,
   :skos/definition
   "relates a party which directly, or indirectly through one or more intermediaries, controls, or is controlled by, or is under common control by another party to that party"})

(def isControllingAffiliateOf
  {:db/ident :fibo-be-oac-cctl/isControllingAffiliateOf,
   :owl/inverseOf :fibo-be-oac-cctl/hasControllingAffiliate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-cctl/ControllingAffiliate,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/"},
   :rdfs/label "is controlling affiliate of",
   :rdfs/range :fibo-be-oac-cctl/ControlledAffiliate,
   :rdfs/subPropertyOf #{:fibo-fnd-pty-pty/actsOn
                         :fibo-be-oac-cctl/isAffiliateOf},
   :skos/definition
   "controls directly, or indirectly through one or more intermediaries"})

(def isParentCompanyOf
  {:db/ident :fibo-be-oac-cctl/isParentCompanyOf,
   :owl/inverseOf :fibo-be-oac-cctl/isSubsidiaryOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-cctl/ControllingAffiliate,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/"},
   :rdfs/label "is parent company of",
   :rdfs/range :fibo-be-oac-cctl/Subsidiary,
   :rdfs/subPropertyOf :fibo-be-oac-cctl/isControllingAffiliateOf,
   :skos/definition
   "indicates a controlled affiliate that it owns at least 50 percent of"})

(def isSubsidiaryOf
  {:db/ident :fibo-be-oac-cctl/isSubsidiaryOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-cctl/Subsidiary,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/"},
   :rdfs/label "is subsidiary of",
   :rdfs/range :fibo-be-oac-cctl/ControllingAffiliate,
   :rdfs/subPropertyOf :fibo-be-oac-cctl/hasControllingAffiliate,
   :skos/definition
   "is controlled directly, or indirectly through one or more intermediaries and owned at least 50 percent by"})

(def isWhollyOwnedBy
  {:db/ident :fibo-be-oac-cctl/isWhollyOwnedBy,
   :owl/propertyChainAxiom [:fibo-fnd-pty-rl/playsRole
                            :fibo-be-oac-cctl/isSubsidiaryOf],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-le-lp/LegalEntity,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/"},
   :rdfs/label "is wholly owned by",
   :rdfs/range :fibo-be-oac-cctl/TotalControllingInterestParty,
   :skos/definition
   "relates a legal entity to a party that has 100 percent ownership and control over it"})

(def urn:uuid:ed871bea-c671-5d8b-a50e-25115c6a171e
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines concepts relating to corporation-specific control. These concepts are based on the general types of control (both de facto control and controlling interests), as defined in the ControlParties ontology, and are the specific examples of these concepts as they apply to companies incorporated by the issuance of shares.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/OwnershipAndControl/Control/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/OwnershipAndControl/ControlParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/OwnershipAndControl/CorporateOwnership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/OwnershipAndControl/OwnershipParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LegalPersons/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/OwnershipAndControl/CorporateControl/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Corporate Control Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl.rdf version of the ontology was modified to simplify control concepts and relations."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl.rdf version of this ontology was revised to further clean up definitions related to control via ownership of shares, which only applies to corporations and some partnerships, and revise and extend the definition of affiliation."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl.rdf version of the ontology was modified to incorporate the latest insights into how control relations should integrate with the control situation."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl.rdf version of this ontology was revised to allow any legal entity to participate in control relations rather than limiting control to a stock corporation, and simplifying others such that any party can be a significant shareholder, for example, rather than limiting this role to a legal entity."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl.rdf version of this ontology was modified per the FIBO 2.0 RFC to add missing definitions and labels, eliminate references to BusinessFacingTypes, replace min 1 QCRs with someValuesFrom, address other hygiene issues, and limit the burden of certain restrictions, such as those on stock corporation, for typical applications."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl.rdf version of this ontology was modified as a part of a simplification strategy for the organizational class hierarchy and to correct reasoning anomalies."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl.rdf version of the ontology was modified to address text formatting hygiene issues."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/"})