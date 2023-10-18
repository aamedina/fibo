(ns net.wikipunk.rdf.fibo-be-oac-cown
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/OwnershipAndControl/CorporateOwnership/",
   :dcterms/abstract
   "This ontology defines concepts relating to corporation-specific ownership. Roles are defined in terms of the ownership enjoyed by the party, and are the specific examples of these concepts as they apply to companies incorporated by the issuance of shares.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-be-oac-cown"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership/",
    "fibo-be-oac-opty"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/",
    "fibo-fnd-acc-aeq"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/",
    "fibo-fnd-agr-agr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-oac-ctl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
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
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/AgentsAndPeople/Agents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/OwnershipAndControl/Control/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/CorporateBodies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/Corporations/Corporations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/AccountingEquity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Agreements/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/OwnershipAndControl/OwnershipParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LegalPersons/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/OwnershipAndControl/CorporateOwnership/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-oac-cown",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership/",
   :rdfs/label "Corporate Ownership Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership.rdf version of this ontology was modified to modify the inheritance hierarchy for beneficial owner to replace owner with controlling party as one of its parent classes."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership.rdf version of this ontology was revised to incorporate the latest insights into how control relations should integrate with the control situation."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership.rdf version of this ontology was modified to generalize the definition of beneficial owner rather than limiting it to shareholding and eliminate a duplicate restriction on shareholder."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership.rdf version of this ontology was revised to eliminate references to external dictionary sites that no longer resolve."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership.rdf version of this ontology was modified to replace isEquityHeldBy with its parent, isHeldBy, eliminate redundant classes that were not used anywhere, and clean up a few definitions to be less ambiguous, not circular, and to conform with ISO 704."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership.rdf version of this ontology was revised to simplify the contract party hierarchy and add concepts related to beneficial ownership."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership.rdf version of this ontology was modified per the FIBO 2.0 RFC to reference shareholders' equity in the definition of a shareholder."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership/"})

(def BeneficialOwner
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI
      "https://www.ncua.gov/regulation-supervision/letters-credit-unions-other-guidance/beneficial-ownership-requirements-legal-entity-customers-overview"}
     {:xsd/anyURI
      "https://www.fincen.gov/resources/statutes-regulations/guidance/guidance-obtaining-and-retaining-beneficial-ownership"}
     {:xsd/anyURI
      "https://en.wikipedia.org/wiki/Beneficial_ownership#Financial_Action_Task_Force_on_Money_Laundering_(FATF)"}},
   :cmns-av/explanatoryNote
   #{"The National Credit Union Administration (NCUA) defines a 'beneficial owner' as (1) a single individual with significant responsibility to control, manage or direct a legal entity customer, or (2) each individual, if any, who, directly or indirectly, through any contract, arrangement, understanding, relationship or otherwise, owns 25 percent or more of the equity interests of a legal entity customer; if a trust owns directly or indirectly, through any contract, arrangement, understanding, relationship or otherwise, 25 percent or more of the equity interests of a legal entity customer, the beneficial owner is the trustee."
     "The Financial Action Task Force on Money Laundering (FATF) refers to a 'beneficial owner' as the natural person(s) who ultimately owns or controls a legal entity and/or the natural person on whose behalf a transaction is being conducted. It also includes those persons who exercise ultimate effective control over a legal person or arrangement."
     "From World Bank Report: In identifying the beneficial owner, the focus should be on two factors: the control exercised and the benefit derived. Control of a corporate vehicle will always depend on context, as control can be exercised in many different ways, including through ownership, contractually or informally."
     "Use of a nominee (who may be an agent, custodian, or a trustee) does not change the position regarding tax reporting and tax liability, and the beneficial owner remains responsible."},
   :db/ident :fibo-be-oac-cown/BeneficialOwner,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership/"},
   :rdfs/label "beneficial owner",
   :rdfs/subClassOf
   #{{:owl/onClass    :fibo-be-le-lp/LegallyCompetentNaturalPerson,
      :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction} :fibo-fnd-oac-ctl/ControllingParty
     {:owl/onProperty     :fibo-be-oac-cown/isBeneficialOwnerOf,
      :owl/someValuesFrom :fibo-fnd-oac-ctl/ControlledThing,
      :rdf/type           :owl/Restriction} :fibo-fnd-agr-agr/Beneficiary},
   :skos/definition
   "party that enjoys the benefits of ownership (such as receipt of income) of something even though its ownership (title) may be in the name of another party (called a nominee or registered owner)"})

(def BeneficialOwnership
  {:cmns-av/explanatoryNote
   "Beneficial ownership may be shared among a group of individuals. If a beneficial owner acquires a position of more than 5 percent in the United States, it must file Schedule 13D or 13G under Section 12 of the Securities Exchange Act of 1934.",
   :db/ident :fibo-be-oac-cown/BeneficialOwnership,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership/"},
   :rdfs/label "beneficial ownership",
   :rdfs/subClassOf #{:fibo-fnd-oac-ctl/Control
                      {:owl/onProperty     :fibo-fnd-oac-ctl/hasPartyInControl,
                       :owl/someValuesFrom :fibo-be-oac-cown/BeneficialOwner,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty
                       :fibo-fnd-oac-ctl/involvesControlledThing,
                       :owl/someValuesFrom :fibo-fnd-oac-ctl/ControlledThing,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "control situation linking something at least one beneficial owner"})

(def Shareholder
  {:cmns-av/explanatoryNote
   "The shares represent an ownership interest in a corporation, mutual fund, or partnership, or a unit of ownership in a structured product, such as a real estate investment trust.",
   :cmns-av/synonym {:rdf/language "en-US",
                     :rdf/value    "stockholder"},
   :db/ident :fibo-be-oac-cown/Shareholder,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "shareholder"},
   :rdfs/subClassOf #{:fibo-fnd-agr-ctr/Counterparty
                      :fibo-be-oac-opty/ConstitutionalOwner},
   :skos/definition
   "party that owns shares in and has rights and responsibilities with respect to some asset, provided in exchange for investment"})

(def Shareholding
  {:cmns-av/explanatoryNote
   "The legal power of a shareholder varies in proportion to their shareholding. Typically, ten percent and below stockholding provides no protection. Fifteen percent stockholding may give the power to petition courts against changing the shares class rights. Up to 49.9 percent stockholding normally gives power to demand calling of an extraordinary general meeting. Fifty percent and over stockholding gives power to fire a director and force out minority stockholders by acquiring their shares as per the rules of the firm. Holder of 75 percent of the stock has the power to change the articles and memorandum of association and the firms name, reduce the share capital, allow the firm to buy its own shares from other stockholders, and to shut down the business. One hundred percent stockholding of course gives total power under the corporate legislation.",
   :db/ident :fibo-be-oac-cown/Shareholding,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership/"},
   :rdfs/label "shareholding",
   :rdfs/subClassOf #{:fibo-fnd-acc-aeq/FinancialAsset
                      {:owl/allValuesFrom :fibo-be-oac-cown/Shareholder,
                       :owl/onProperty    :fibo-fnd-rel-rel/isHeldBy,
                       :rdf/type          :owl/Restriction}},
   :skos/definition
   "financial asset that takes the form of shares considered as a unit"})

(def hasBeneficialOwner
  {:db/ident :fibo-be-oac-cown/hasBeneficialOwner,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-oac-ctl/ControlledThing,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership/"},
   :rdfs/label "has beneficial owner",
   :rdfs/range :fibo-be-oac-cown/BeneficialOwner,
   :rdfs/subPropertyOf :fibo-fnd-oac-ctl/hasControllingParty,
   :skos/definition
   "indicates the party that retains rights in the asset they control in a beneficial ownership situation"})

(def isBeneficialOwnerOf
  {:db/ident :fibo-be-oac-cown/isBeneficialOwnerOf,
   :owl/inverseOf :fibo-be-oac-cown/hasBeneficialOwner,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-cown/BeneficialOwner,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership/"},
   :rdfs/label "is beneficial owner of",
   :rdfs/range :fibo-fnd-oac-ctl/ControlledThing,
   :rdfs/subPropertyOf :fibo-fnd-oac-ctl/isPartyControlling,
   :skos/definition
   "indicates an asset in which the beneficial owner holds rights (typically voting rights, management rights, etc.) in a beneficial ownership situation"})

(def urn:uuid:a7774100-3d24-5895-ac3a-bc131ce7abee
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines concepts relating to corporation-specific ownership. Roles are defined in terms of the ownership enjoyed by the party, and are the specific examples of these concepts as they apply to companies incorporated by the issuance of shares.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/AgentsAndPeople/Agents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/OwnershipAndControl/Control/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/CorporateBodies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/Corporations/Corporations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/AccountingEquity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Agreements/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/OwnershipAndControl/OwnershipParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LegalPersons/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/OwnershipAndControl/CorporateOwnership/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Corporate Ownership Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership.rdf version of this ontology was modified to modify the inheritance hierarchy for beneficial owner to replace owner with controlling party as one of its parent classes."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership.rdf version of this ontology was revised to incorporate the latest insights into how control relations should integrate with the control situation."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership.rdf version of this ontology was modified to generalize the definition of beneficial owner rather than limiting it to shareholding and eliminate a duplicate restriction on shareholder."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership.rdf version of this ontology was revised to eliminate references to external dictionary sites that no longer resolve."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership.rdf version of this ontology was modified to replace isEquityHeldBy with its parent, isHeldBy, eliminate redundant classes that were not used anywhere, and clean up a few definitions to be less ambiguous, not circular, and to conform with ISO 704."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership.rdf version of this ontology was revised to simplify the contract party hierarchy and add concepts related to beneficial ownership."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership.rdf version of this ontology was modified per the FIBO 2.0 RFC to reference shareholders' equity in the definition of a shareholder."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership/"})