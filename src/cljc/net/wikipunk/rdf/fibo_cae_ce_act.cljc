(ns net.wikipunk.rdf.fibo-cae-ce-act
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "cmns-cds" "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
     "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
     "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
     "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
     "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-be-le-lp"
     "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
     "fibo-cae-ce-act"
     "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
     "fibo-fbc-fi-fi"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
     "fibo-fnd-arr-lif"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
     "fibo-fnd-dt-oc"
     "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/",
     "fibo-fnd-rel-rel"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "skos" "http://www.w3.org/2004/02/skos/core#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-cae-ce-act",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"}
  {:cmns-av/copyright #{"Copyright (c) 2016-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology provides a high level overview of actions including corporate, market, and regulatory actions, ranging from business oriented events such as address and name changes, to those that are more specific to securities.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Lifecycles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/CAE/CorporateEvents/CorporateActions/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Corporate Actions Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"})

(def Action
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Actions initiated by an issuer are typically approved by that company's board of directors and authorized by their shareholders."},
   :db/ident :fibo-cae-ce-act/Action,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "action"},
   :rdfs/subClassOf #{:fibo-fnd-dt-oc/Occurrence
                      {:owl/onProperty     :cmns-cls/isClassifiedBy,
                       :owl/someValuesFrom :fibo-cae-ce-act/ActionClassifier,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                       :owl/someValuesFrom {:owl/unionOf
                                            [:fibo-be-le-lp/LegalEntity
                                             :fibo-fbc-fi-fi/Security],
                                            :rdf/type :owl/Class},
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "event announced, initiated or carried out by an organization that affects a legal entity or the securities it issues and may have a material impact on that entity's stakeholders, such as shareholders and creditors"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Actions that impact an entity may be initiated by an issuer, exchange, regulator, creditor, or other third party."}})

(def ActionClassificationScheme
  {:cmns-av/usageNote
   "The set of corporate actions and income events included herein are a subset of those specified in a combination of ISO 15022 Securities - Scheme for Messages (Data Field Dictionary) and the GLEIF LEI-related corporate actions. Other schemes that are specific to a custodian, depository, or regulatory agency may also be important, and should take a similar approach with respect to classification.",
   :db/ident :fibo-cae-ce-act/ActionClassificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"},
   :rdfs/label "action classification scheme",
   :rdfs/subClassOf #{{:owl/allValuesFrom :fibo-cae-ce-act/ActionClassifier,
                       :owl/onProperty    :cmns-col/hasMember,
                       :rdf/type          :owl/Restriction} :cmns-cds/CodeSet
                      {:owl/onProperty     :cmns-dsg/defines,
                       :owl/someValuesFrom :fibo-cae-ce-act/ActionClassifier,
                       :rdf/type           :owl/Restriction}
                      :cmns-cls/ClassificationScheme},
   :skos/definition
   "scheme for classifying the kinds of actions and events that may be announced, initiated or carried out by an organization that affects a legal entity or the securities it issues"})

(def ActionClassifier
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifies events as impacting income vs. others. Other classification schemes distinguish between actions that return profits to shareholders, actions that are designed to influence the share price, and actions involving a change in structure to the issuer organization."},
   :db/ident :fibo-cae-ce-act/ActionClassifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "action classifier"},
   :rdfs/subClassOf #{:fibo-fnd-dt-oc/OccurrenceKind
                      {:owl/onClass :fibo-cae-ce-act/ActionClassificationScheme,
                       :owl/onProperty :cmns-col/isMemberOf,
                       :owl/qualifiedCardinality 1,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty     :cmns-cls/classifies,
                       :owl/someValuesFrom :fibo-cae-ce-act/Action,
                       :rdf/type           :owl/Restriction}
                      :cmns-cls/Classifier
                      {:owl/onClass :fibo-cae-ce-act/ActionClassificationScheme,
                       :owl/onProperty :cmns-dsg/isDefinedIn,
                       :owl/qualifiedCardinality 1,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-rel-rel/hasTag,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "classifier that distinguishes the kinds of actions and events that may be announced, initiated or carried out by an organization that affects a legal entity or the securities it issues, such as income-oriented events"}})

(def ActionStatus
  {:db/ident :fibo-cae-ce-act/ActionStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "action status"},
   :rdfs/subClassOf #{:fibo-fnd-arr-lif/LifecycleStatus
                      {:owl/onProperty     :cmns-cls/classifies,
                       :owl/someValuesFrom :fibo-cae-ce-act/Action,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-rel-rel/hasTag,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}},
   :skos/definition {:rdf/language "en",
                     :rdf/value "state of some action at some point in time"}})

(def BusinessStrategyClassifier
  {:db/ident :fibo-cae-ce-act/BusinessStrategyClassifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "business strategy classifier"},
   :rdfs/subClassOf :fibo-cae-ce-act/ActionClassifier,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "classifier of corporate actions that involve improving liquidity or changing the overall structure of the organization through diversification, combining and closing parts of the business, etc, to increase long-term profitability"}})

(def ChangeAction
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Generic changes may include a change in the terms of an issue, change in the identification of a security, change of board lot, change from global to definitive, etc."},
   :db/ident :fibo-cae-ce-act/ChangeAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "change action"},
   :rdfs/subClassOf :fibo-cae-ce-act/MandatoryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action to disseminate information regarding a change further described in the corporate action details"}})

(def ClassAction
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The security holder may be offered the opportunity to join a class action proceeding and would need to respond with an instruction."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "proposed settlement"},
   :db/ident :fibo-cae-ce-act/ClassAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "class action"},
   :rdfs/subClassOf :fibo-cae-ce-act/VoluntaryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action involving a situation where interested parties seek restitution for financial loss"}})

(def ConsentSolicitation
  {:db/ident :fibo-cae-ce-act/ConsentSolicitation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "consent solicitation"},
   :rdfs/subClassOf :fibo-cae-ce-act/VoluntaryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action that is a procedure that aims to obtain consent of holder to a proposal by the issuer or a third party without convening a meeting"},
   :skos/example {:rdf/language "en",
                  :rdf/value
                  "For example, consent to change the terms of a bond."}})

(def CorporateAction
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Corporate actions are typically approved by a company's board of directors and authorized by the shareholders."},
   :db/ident :fibo-cae-ce-act/CorporateAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "corporate action"},
   :rdfs/subClassOf :fibo-cae-ce-act/Action,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "action carried out by or specifically relating to a legal entity that may affect the securities it issues and may have a material impact on its stakeholders, such as shareholders and creditors"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Examples of corporate actions include share issues, stock splits, consolidation, dividends, mergers and acquisitions, rights issues, spin-offs, and the inception of court actions."}})

(def DisclosureAction
  {:db/ident :fibo-cae-ce-act/DisclosureAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "disclosure action"},
   :rdfs/subClassOf :fibo-cae-ce-act/VoluntaryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action involving a request for holders or beneficial owners to disclose their name, location and holdings of any issue to the issuer"}})

(def Divestiture
  {:db/ident :fibo-cae-ce-act/Divestiture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "divestiture"},
   :rdfs/subClassOf :fibo-cae-ce-act/MandatoryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action involving the sales of subsidiary business interests or investments"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Divestiture is an action or process involving the sale, spinoff, or liquidation of business assets, including product lines, services, subsidiaries, business property, or even an entire business. Companies may pursue a divestment strategy to refocus on their core business, in response to the operating environment in their industry, to raise capital, or to release underperforming assets."}})

(def IncomeOrientedClassifier
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Cash dividends are a classic example where a public company declares a dividend to be paid on each outstanding share. Bonus is another case where the shareholder is rewarded. In a stricter sense, the bonus issue should not impact the share price but in reality, in rare cases, it does and results in an overall increase in value."},
   :db/ident :fibo-cae-ce-act/IncomeOrientedClassifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "income-oriented classifier"},
   :rdfs/subClassOf :fibo-cae-ce-act/ActionClassifier,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "classifier of corporate actions that impacts income to shareholders"}})

(def LegalFormChange
  {:db/ident :fibo-cae-ce-act/LegalFormChange,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "legal form change"},
   :rdfs/subClassOf :fibo-cae-ce-act/MandatoryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action indicating a modification of the legal form of the organization"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "In the United States it is common for companies established as Subchapter S Corporations (S-Corp), typically early stage companies, to modify their structure to become full-fledged Subchapter C Corporations (C-Corp) to facilitate outside fundraising, mergers, acquisitions, and public offerings. Other common form changes include migration from sole proprietorships to more formally registered organizations (e.g., LLC, S-Corp, C-Corp, etc.)"}})

(def Liquidation
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Debt may be paid in order of priority based on preferred claims to assets specified by a security, for example."},
   :db/ident :fibo-cae-ce-act/Liquidation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "liquidation"},
   :rdfs/subClassOf :fibo-cae-ce-act/Divestiture,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action related to winding up a business, including but not limited to distribution of cash, assets, or both"}})

(def MandatoryCorporateAction
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Mandatory means mandatory participation by all shareholders, however the shareholder is not required to do anything."},
   :db/ident :fibo-cae-ce-act/MandatoryCorporateAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mandatory corporate action"},
   :rdfs/subClassOf :fibo-cae-ce-act/CorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "action initiated by the board of directors of a corporation that affects all shareholders"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Examples of mandatory corporate actions include cash dividends, stock splits, mergers, pre-refunding, return of capital, bonus issue, asset ID change, and spin-offs."}})

(def MandatoryWithChoiceCorporateAction
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "In case a shareholder does not submit the election, the default option will be applied."},
   :db/ident :fibo-cae-ce-act/MandatoryWithChoiceCorporateAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mandatory with choice corporate action"},
   :rdfs/subClassOf :fibo-cae-ce-act/MandatoryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "mandatory corporate action where shareholders are given an opportunity to choose among several options"}})

(def MarketAction
  {:db/ident :fibo-cae-ce-act/MarketAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "market action"},
   :rdfs/subClassOf :fibo-cae-ce-act/Action,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "action that is initiated by a market, such as a securities exchange, that affects a legal entity or the securities it issues and may have a material impact on that entity's stakeholders, such as shareholders and creditors"}})

(def MergerAcquisition
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Such consolidation may be accomplished via financial transactions such as mergers, acquisitions, consolidations, tender offers, purchase of assets, and management acquisitions."},
   :db/ident :fibo-cae-ce-act/MergerAcquisition,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "merger / acquisition"},
   :rdfs/subClassOf :fibo-cae-ce-act/MandatoryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action involving the consolidation of legal entities or assets"}})

(def Notification
  {:db/ident :fibo-cae-ce-act/Notification,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "notification"},
   :rdfs/subClassOf :fibo-cae-ce-act/MandatoryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action involving information provided by the issuer having no accounting/financial impact on the holder"}})

(def OrganizationAddressChange
  {:db/ident :fibo-cae-ce-act/OrganizationAddressChange,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "organization address change"},
   :rdfs/subClassOf :fibo-cae-ce-act/Notification,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "information action that provides details of address changes for a legal entity"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Address changes may impact securities master data management, including but not limited to where shares are registered and by whom."}})

(def OrganizationNameChange
  {:db/ident :fibo-cae-ce-act/OrganizationNameChange,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "organization name change"},
   :rdfs/subClassOf :fibo-cae-ce-act/Notification,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "information action that provides details of name changes for a legal entity"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Name changes may include legal name changes as well as 'doing business as', and other operational names for an organization."}})

(def PriorityIssue
  {:db/ident :fibo-cae-ce-act/PriorityIssue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "priority issue"},
   :rdfs/subClassOf :fibo-cae-ce-act/VoluntaryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action that is a public offer where, due to a limited amount of securities available, priority is given to existing shareholders"}})

(def RegulatoryAction
  {:db/ident :fibo-cae-ce-act/RegulatoryAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "regulatory action"},
   :rdfs/subClassOf :fibo-cae-ce-act/Action,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "action initiated by a regulatory agency that affects a legal entity or the securities it issues and may have a material impact on that entity's stakeholders, such as shareholders and creditors"}})

(def SpinOff
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Spin-off represents a form of divestiture usually resulting in an independent company or in an existing company. Examples include demerger, distribution, and unbundling."},
   :db/ident :fibo-cae-ce-act/SpinOff,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "spin off"},
   :rdfs/subClassOf :fibo-cae-ce-act/Divestiture,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action involving the distribution of subsidiary stock to the shareholders of the parent company without a surrender of shares"}})

(def VoluntaryCorporateAction
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Shareholders send responses to the issuer's agents, and the issuer will send the proceeds of the action to those shareholders who elect to participate."},
   :db/ident :fibo-cae-ce-act/VoluntaryCorporateAction,
   :owl/disjointWith :fibo-cae-ce-act/MandatoryCorporateAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "voluntary corporate action"},
   :rdfs/subClassOf :fibo-cae-ce-act/CorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "event in which the shareholders elect to participate and must respond in order for the issuer to process the action"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "An example of a voluntary corporate action is a tender offer, in which the issuer may request shareholders to tender their shares at a predetermined price."}})

(def urn:uuid:3ea36d4c-f29a-5119-a8f4-df2ab160b6fc
  {:cmns-av/copyright #{"Copyright (c) 2016-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology provides a high level overview of actions including corporate, market, and regulatory actions, ranging from business oriented events such as address and name changes, to those that are more specific to securities.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Lifecycles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/CAE/CorporateEvents/CorporateActions/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Corporate Actions Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/"})