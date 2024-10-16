(ns net.wikipunk.rdf.fibo-be-oac-cpty
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/ControlParties/",
   :dcterms/abstract
   "This ontology defines concepts relating to types of controlling parties. The concepts defined here are party in role concepts, which define the nature of some entity such as an organization or a legal person, in some role such as that of owning a controlling interest in the entity or of controlling that entity. These roles are defined in terms of the types of control enjoyed by the party, for example de facto or de jure control. An important feature of this ontology is the distinction between the holding of a controlling interest (such as voting shares), and the de facto existence of control of one body by another as asserted in company filings or as a conclusion drawn from computational analysis of controlling interests.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-be-oac-cpty"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/",
    "fibo-be-oac-opty"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-law-cor"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCore/",
    "fibo-fnd-oac-ctl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
    "fibo-fnd-org-fm"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
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
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/OwnershipParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/OwnershipAndControl/Control/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/LegalCore/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Organizations/Organizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Organizations/FormalOrganizations/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/ControlParties/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-oac-cpty",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/",
   :rdfs/label "Control Parties Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties.rdf version of the ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties.rdf version of this ontology was modified per the FIBO 2.0 RFC to add missing labels and definitions, eliminate references to BusinessFacingTypes, etc."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties.rdf version of this ontology was modified as a part of a simplification strategy for the organizational class hierarchy and to correct reasoning anomalies."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties.rdf version of this ontology was modified to eliminate duplication of concepts with LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties.rdf version of the ontology was modified to correct the label on hasControllingOrganizationMember and reflect the move of OrganizationMember from Parties to Organizations in FND, and to incorporate the latest insights into how control relations should integrate with the control situation."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties.rdf version of the ontology was modified to simplify control concepts and relations, eliminate ambiguity in definitions, restate definitions to be ISO 704 compliant, and add properties relating control parties to control situations."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties.rdf version of this ontology was modified to integrate the concept of a situation, situational roles, and corresponding relations with the definition of control and eliminate an unused and logically inconsistent property."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/"})

(def ContractualControl
  {:db/ident :fibo-be-oac-cpty/ContractualControl,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/"},
   :rdfs/label "contractual control",
   :rdfs/subClassOf #{:fibo-fnd-oac-ctl/DeJureControl
                      {:owl/onProperty     :fibo-fnd-rel-rel/isConferredBy,
                       :owl/someValuesFrom :fibo-fnd-agr-ctr/Contract,
                       :rdf/type           :owl/Restriction}},
   :skos/definition "control established through the terms of some contract"})

(def ControlledParty
  {:db/ident :fibo-be-oac-cpty/ControlledParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/"},
   :rdfs/label "controlled party",
   :rdfs/subClassOf #{{:owl/onClass    :cmns-pts/Party,
                       :owl/onProperty :cmns-rlcmp/isPlayedBy,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-oac-ctl/ControlledThing},
   :skos/definition
   "person or organization over which some party exercises some form of authority or influence with respect to some situation"})

(def ControllingAlliance
  {:db/ident :fibo-be-oac-cpty/ControllingAlliance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/"},
   :rdfs/label "controlling alliance",
   :rdfs/subClassOf :fibo-fnd-org-fm/Group,
   :skos/definition
   "group that has formed some alliance to jointly exercise control over some entity",
   :skos/editorialNote
   "The types of entity which may enter into such an alliance are the same types of entity as may exercise control in their own right, i.e. independent parties (that is a logical union of natural persons, legal persons and formal organizations)."})

(def CourtAppointedControl
  {:db/ident :fibo-be-oac-cpty/CourtAppointedControl,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/"},
   :rdfs/label "court appointed control",
   :rdfs/subClassOf #{:fibo-fnd-oac-ctl/DeJureControl
                      {:owl/allValuesFrom :fibo-fnd-law-cor/CourtOfLaw,
                       :owl/onProperty    :fibo-fnd-rel-rel/isConferredBy,
                       :rdf/type          :owl/Restriction}},
   :skos/definition
   "control conferred by the actions of some court, for example in the context of receivership"})

(def DeFactoControllingInterestParty
  {:db/ident :fibo-be-oac-cpty/DeFactoControllingInterestParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/"},
   :rdfs/label "de facto controlling interest party",
   :rdfs/subClassOf #{:fibo-fnd-oac-ctl/ControllingParty
                      {:owl/onProperty :fibo-fnd-oac-ctl/isControllingPartyIn,
                       :owl/someValuesFrom :fibo-fnd-oac-ctl/DeFactoControl,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "party that exercises some control over an entity other than via explicit, legal means",
   :skos/example
   "a silent partner, i.e. where someone has made a large investment, which is bilateral (not part of the constitutional framework of the company)",
   :skos/scopeNote
   "divides further into financial leverage via loans; non fiscal types of leverage (influence)"})

(def DeJureControllingInterestParty
  {:db/ident :fibo-be-oac-cpty/DeJureControllingInterestParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/"},
   :rdfs/label "de jure controlling interest party",
   :rdfs/subClassOf #{{:owl/onProperty :fibo-fnd-oac-ctl/isControllingPartyIn,
                       :owl/someValuesFrom :fibo-fnd-oac-ctl/DeJureControl,
                       :rdf/type :owl/Restriction}
                      :fibo-fnd-oac-ctl/ControllingParty},
   :skos/definition "party that has the legal authority to exercise control"})

(def EntityControllingParty
  {:db/ident :fibo-be-oac-cpty/EntityControllingParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/"},
   :rdfs/label "entity controlling party",
   :rdfs/subClassOf #{:fibo-fnd-oac-ctl/ControllingParty
                      {:owl/onProperty :fibo-fnd-oac-ctl/isControllingPartyOf,
                       :owl/someValuesFrom :fibo-be-le-lp/LegalEntity,
                       :rdf/type :owl/Restriction}},
   :skos/definition "party that has the authority to control some legal entity",
   :skos/editorialNote
   "This type of party is either asserted to be the case by the entity itself or some other party, or is determined through some analysis or calculation based on the available information about controlling interests.",
   :skos/scopeNote
   "It is assumed that since control follows from some form of ownership or contractual instrument, that the range of entities which may fulfil this party role is the same as that for entity ownership, namely a logical union of natural persons, legal persons and formal organizations."})

(def InfluenceBasedDeFactoControl
  {:db/ident :fibo-be-oac-cpty/InfluenceBasedDeFactoControl,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/"},
   :rdfs/label "influence-based de facto control",
   :rdfs/subClassOf #{:fibo-fnd-oac-ctl/DeFactoControl
                      {:owl/onProperty :fibo-fnd-oac-ctl/hasPartyInControl,
                       :owl/someValuesFrom
                       :fibo-be-oac-cpty/InfluenceBasedDeFactoControllingParty,
                       :rdf/type :owl/Restriction}},
   :skos/definition "informal control that involves influence over some party"})

(def InfluenceBasedDeFactoControllingParty
  {:db/ident :fibo-be-oac-cpty/InfluenceBasedDeFactoControllingParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/"},
   :rdfs/label "influence-based de facto controlling party",
   :rdfs/subClassOf #{:fibo-be-oac-cpty/DeFactoControllingInterestParty
                      {:owl/onProperty :fibo-fnd-oac-ctl/isControllingPartyIn,
                       :owl/someValuesFrom
                       :fibo-be-oac-cpty/InfluenceBasedDeFactoControl,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "party that holds influence-based control over some other party",
   :skos/editorialNote
   "Regulatory or jurisdictional control would fall under this control. Court appointed control is de jure control BUT the scenario in which a government takes over something and then hands it over to some new de jure controller i.e. administrator - in the meantime this is de facto control by e.g. the government."})

(def InvestmentBasedDeFactoControl
  {:db/ident :fibo-be-oac-cpty/InvestmentBasedDeFactoControl,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/"},
   :rdfs/label "investment-based de facto control",
   :rdfs/subClassOf
   #{{:owl/allValuesFrom :fibo-be-oac-opty/InvestmentEquity,
      :owl/onProperty    :fibo-fnd-rel-rel/isConferredBy,
      :rdf/type          :owl/Restriction} :fibo-fnd-oac-ctl/DeFactoControl
     {:owl/onProperty :fibo-fnd-oac-ctl/hasPartyInControl,
      :owl/someValuesFrom
      :fibo-be-oac-cpty/InvestmentBasedDeFactoControllingInterestParty,
      :rdf/type :owl/Restriction}},
   :skos/definition
   "control that arises through some investment in some entity, other than via the holding of constitutional equity (shares etc.) in that entity"})

(def InvestmentBasedDeFactoControllingInterestParty
  {:db/ident :fibo-be-oac-cpty/InvestmentBasedDeFactoControllingInterestParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/"},
   :rdfs/label "investment-based de facto controlling interest party",
   :rdfs/subClassOf #{{:owl/allValuesFrom
                       :fibo-be-oac-cpty/InvestmentBasedDeFactoControl,
                       :owl/onProperty :fibo-fnd-oac-ctl/isControllingPartyIn,
                       :rdf/type :owl/Restriction} :fibo-be-oac-opty/Investor
                      :fibo-be-oac-cpty/DeFactoControllingInterestParty},
   :skos/definition
   "party that holds investment-based control over some other party"})

(def JointControllingParty
  {:db/ident :fibo-be-oac-cpty/JointControllingParty,
   :owl/disjointWith :fibo-be-oac-cpty/SoleControllingParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/"},
   :rdfs/label "joint controlling party",
   :rdfs/subClassOf #{{:owl/allValuesFrom :fibo-be-oac-cpty/ControllingAlliance,
                       :owl/onProperty    :cmns-rlcmp/isPlayedBy,
                       :rdf/type          :owl/Restriction}
                      :fibo-be-oac-cpty/EntityControllingParty},
   :skos/definition
   "party that collectively has the authority to control the affairs of some business organization"})

(def MajorityControllingParty
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Electronic Code of Federal Regulations, Title 17, Chapter 1, Section 49.2"},
   :db/ident :fibo-be-oac-cpty/MajorityControllingParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/"},
   :rdfs/label "majority controlling party",
   :rdfs/subClassOf :fibo-be-oac-cpty/EntityControllingParty,
   :skos/definition
   "controlling party that possesses, either directly or indirectly, the power to direct or cause the direction of the management and policies of a legal person, whether through the ownership of a majority of voting securities, by contract, or otherwise"})

(def Receiver
  {:db/ident :fibo-be-oac-cpty/Receiver,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/"},
   :rdfs/label "receiver",
   :rdfs/subClassOf #{{:owl/onProperty :fibo-fnd-oac-ctl/isControllingPartyIn,
                       :owl/someValuesFrom
                       :fibo-be-oac-cpty/CourtAppointedControl,
                       :rdf/type :owl/Restriction}
                      :fibo-be-oac-cpty/DeJureControllingInterestParty},
   :skos/definition
   "party appointed by some court for the purposes of winding up the affairs of some entity which is no longer solvent"})

(def SoleControllingParty
  {:db/ident :fibo-be-oac-cpty/SoleControllingParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/"},
   :rdfs/label "sole controlling party",
   :rdfs/subClassOf :fibo-be-oac-cpty/EntityControllingParty,
   :skos/definition
   "party that has sole control over and directs the affairs of some legal entity"})

(def TotalOwner
  {:db/ident :fibo-be-oac-cpty/TotalOwner,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/"},
   :rdfs/label "total owner",
   :rdfs/subClassOf :fibo-be-oac-opty/ConstitutionalOwner,
   :skos/definition "party that has 100 percent ownership some legal entity",
   :skos/editorialNote
   "By virtue of holding 100 percent of the equity ownership, the Total Owner also holds 100 percent of the controlling equity, if there is a difference. Therefore it is both a total owner and a total controlling party."})

(def advises
  {:db/ident :fibo-be-oac-cpty/advises,
   :owl/inverseOf :fibo-be-oac-cpty/isAdvisedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-oac-ctl/ControllingParty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/"},
   :rdfs/label "advises",
   :rdfs/range :fibo-be-oac-cpty/ControlledParty,
   :rdfs/subPropertyOf :fibo-fnd-oac-ctl/isPartyControlling,
   :skos/definition "provides counsel or guidance to"})

(def hasControllingOrganizationMember
  {:db/ident :fibo-be-oac-cpty/hasControllingOrganizationMember,
   :owl/inverseOf :fibo-be-oac-cpty/isControllingMemberOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-cpty/ControlledParty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/"},
   :rdfs/label "has controlling organization member",
   :rdfs/range :fibo-fnd-org-org/OrganizationMember,
   :rdfs/subPropertyOf :fibo-fnd-oac-ctl/hasControllingParty,
   :skos/definition
   "relates a controlled party to a controlling member of the organization"})

(def hasMajorityControllingParty
  {:db/ident :fibo-be-oac-cpty/hasMajorityControllingParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-le-lp/LegalEntity,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/"},
   :rdfs/label "has majority controlling party",
   :rdfs/range :fibo-be-oac-cpty/MajorityControllingParty,
   :rdfs/subPropertyOf :fibo-fnd-oac-ctl/isControlledPartyOf,
   :skos/definition
   "indicates a party that owns a controlling stake (over 50 percent) in the entity"})

(def isAdvisedBy
  {:db/ident :fibo-be-oac-cpty/isAdvisedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-cpty/ControlledParty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/"},
   :rdfs/label "has advisor",
   :rdfs/range :fibo-fnd-oac-ctl/ControllingParty,
   :rdfs/subPropertyOf :fibo-fnd-oac-ctl/hasControllingParty,
   :skos/definition
   "indicates the party that acts in an advisory capacity to the controlled party"})

(def isBasedOnInvestmentEquity
  {:db/ident :fibo-be-oac-cpty/isBasedOnInvestmentEquity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-cpty/InvestmentBasedDeFactoControl,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/"},
   :rdfs/label "is based on investment equity",
   :rdfs/range :fibo-be-oac-opty/InvestmentEquity,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/isConferredBy,
   :skos/definition
   "indicates investment-based de facto control, which is is based on the holding of some investment equity by some party"})

(def isControllingMemberOf
  {:db/ident :fibo-be-oac-cpty/isControllingMemberOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-org-org/OrganizationMember,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/"},
   :rdfs/label "is controlling member of",
   :rdfs/range :fibo-be-oac-cpty/ControlledParty,
   :rdfs/subPropertyOf :fibo-fnd-oac-ctl/isPartyControlling,
   :skos/definition
   "identifies a controlled organization over which the member has some measure of control"})

(def urn:uuid:47c89296-e3ba-5a06-9f95-331794f2e35f
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines concepts relating to types of controlling parties. The concepts defined here are party in role concepts, which define the nature of some entity such as an organization or a legal person, in some role such as that of owning a controlling interest in the entity or of controlling that entity. These roles are defined in terms of the types of control enjoyed by the party, for example de facto or de jure control. An important feature of this ontology is the distinction between the holding of a controlling interest (such as voting shares), and the de facto existence of control of one body by another as asserted in company filings or as a conclusion drawn from computational analysis of controlling interests.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/OwnershipParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/OwnershipAndControl/Control/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/LegalCore/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Organizations/Organizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Organizations/FormalOrganizations/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/ControlParties/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Control Parties Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties.rdf version of the ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties.rdf version of this ontology was modified per the FIBO 2.0 RFC to add missing labels and definitions, eliminate references to BusinessFacingTypes, etc."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties.rdf version of this ontology was modified as a part of a simplification strategy for the organizational class hierarchy and to correct reasoning anomalies."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties.rdf version of this ontology was modified to eliminate duplication of concepts with LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties.rdf version of the ontology was modified to correct the label on hasControllingOrganizationMember and reflect the move of OrganizationMember from Parties to Organizations in FND, and to incorporate the latest insights into how control relations should integrate with the control situation."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties.rdf version of the ontology was modified to simplify control concepts and relations, eliminate ambiguity in definitions, restate definitions to be ISO 704 compliant, and add properties relating control parties to control situations."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties.rdf version of this ontology was modified to integrate the concept of a situation, situational roles, and corresponding relations with the definition of control and eliminate an unused and logically inconsistent property."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/"})