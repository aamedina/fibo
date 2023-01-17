(ns net.wikipunk.rdf.fibo-cae-ce-act
  "This ontology provides a high level overview of actions including corporate, market, and regulatory actions, ranging from business oriented events such as address and name changes, to those that are more specific to securities."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :dcterms/abstract
   "This ontology provides a high level overview of actions including corporate, market, and regulatory actions, ranging from business oriented events such as address and name changes, to those that are more specific to securities.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Lifecycles/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/Occurrences/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/ClassificationSchemes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/CAE/CorporateEvents/CorporateActions/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-cae-ce-act"
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-arr-cls"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/",
    "fibo-fnd-arr-lif"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
    "fibo-fnd-dt-oc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfa/prefix "fibo-cae-ce-act",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Corporate Actions Ontology"},
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright "Copyright (c) 2016-2022 EDM Council, Inc.",
   :sm/dependsOn ["https://www.omg.org/spec/LCC/"
                  "https://spec.edmcouncil.org/fibo/ontology/FND/"
                  "https://spec.edmcouncil.org/fibo/ontology/BE/"
                  "https://spec.edmcouncil.org/fibo/ontology/FBC/"],
   :sm/fileAbbreviation "fibo-cae-ce-act",
   :sm/filename "CorporateActions.rdf"})

(def Action
  "event announced, initiated or carried out by an organization that affects a legal entity or the securities it issues and may have a material impact on that entity's stakeholders, such as shareholders and creditors"
  {:db/ident :fibo-cae-ce-act/Action,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Actions initiated by an issuer are typically approved by that company's board of directors and authorized by their shareholders."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "action"},
   :rdfs/subClassOf [{:owl/onProperty     :lcc-cr/isClassifiedBy,
                      :owl/someValuesFrom :fibo-cae-ce-act/ActionClassifier,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/appliesTo,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-be-le-lp/LegalEntity
                                            :fibo-fbc-fi-fi/Security],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "event announced, initiated or carried out by an organization that affects a legal entity or the securities it issues and may have a material impact on that entity's stakeholders, such as shareholders and creditors"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Actions that impact an entity may be initiated by an issuer, exchange, regulator, creditor, or other third party."}})

(def ActionClassificationScheme
  "scheme for classifying the kinds of actions and events that may be announced, initiated or carried out by an organization that affects a legal entity or the securities it issues"
  {:db/ident :fibo-cae-ce-act/ActionClassificationScheme,
   :fibo-fnd-utl-av/usageNote
   "The set of corporate actions and income events included herein are a subset of those specified in a combination of ISO 15022 Securities - Scheme for Messages (Data Field Dictionary) and the GLEIF LEI-related corporate actions. Other schemes that are specific to a custodian, depository, or regulatory agency may also be important, and should take a similar approach with respect to classification.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label "action classification scheme",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/defines,
                      :owl/someValuesFrom :fibo-cae-ce-act/ActionClassifier,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :fibo-cae-ce-act/ActionClassifier,
                      :owl/onProperty    :lcc-lr/hasMember,
                      :rdf/type          :owl/Restriction}
                     :lcc-lr/CodeSet
                     :fibo-fnd-arr-cls/ClassificationScheme],
   :skos/definition
   "scheme for classifying the kinds of actions and events that may be announced, initiated or carried out by an organization that affects a legal entity or the securities it issues"})

(def ActionClassifier
  "classifier that distinguishes the kinds of actions and events that may be announced, initiated or carried out by an organization that affects a legal entity or the securities it issues, such as income-oriented events"
  {:db/ident :fibo-cae-ce-act/ActionClassifier,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifies events as impacting income vs. others. Other classification schemes distinguish between actions that return profits to shareholders, actions that are designed to influence the share price, and actions involving a change in structure to the issuer organization."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "action classifier"},
   :rdfs/subClassOf [{:owl/onProperty     :lcc-cr/classifies,
                      :owl/someValuesFrom :fibo-cae-ce-act/Action,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass :fibo-cae-ce-act/ActionClassificationScheme,
                      :owl/onProperty :fibo-fnd-rel-rel/isDefinedIn,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :lcc-lr/hasTag,
                      :owl/someValuesFrom :xsd/string,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/OccurrenceKind
                     {:owl/onClass :fibo-cae-ce-act/ActionClassificationScheme,
                      :owl/onProperty :lcc-lr/isMemberOf,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-arr-cls/Classifier],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "classifier that distinguishes the kinds of actions and events that may be announced, initiated or carried out by an organization that affects a legal entity or the securities it issues, such as income-oriented events"}})

(def ActionStatus
  "state of some action at some point in time"
  {:db/ident :fibo-cae-ce-act/ActionStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "action status"},
   :rdfs/subClassOf [{:owl/onProperty     :lcc-lr/hasTag,
                      :owl/someValuesFrom :xsd/string,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :lcc-cr/classifies,
                      :owl/someValuesFrom :fibo-cae-ce-act/Action,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-lif/LifecycleStatus],
   :skos/definition {:rdf/language "en",
                     :rdf/value "state of some action at some point in time"}})

(def BusinessStrategyClassifier
  "classifier of corporate actions that involve improving liquidity or changing the overall structure of the organization through diversification, combining and closing parts of the business, etc, to increase long-term profitability"
  {:db/ident :fibo-cae-ce-act/BusinessStrategyClassifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "business strategy classifier"},
   :rdfs/subClassOf :fibo-cae-ce-act/ActionClassifier,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "classifier of corporate actions that involve improving liquidity or changing the overall structure of the organization through diversification, combining and closing parts of the business, etc, to increase long-term profitability"}})

(def ChangeAction
  "corporate action to disseminate information regarding a change further described in the corporate action details"
  {:db/ident :fibo-cae-ce-act/ChangeAction,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Generic changes may include a change in the terms of an issue, change in the identification of a security, change of board lot, change from global to definitive, etc."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "change action"},
   :rdfs/subClassOf :fibo-cae-ce-act/MandatoryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action to disseminate information regarding a change further described in the corporate action details"}})

(def ClassAction
  "corporate action involving a situation where interested parties seek restitution for financial loss"
  {:db/ident :fibo-cae-ce-act/ClassAction,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The security holder may be offered the opportunity to join a class action proceeding and would need to respond with an instruction."},
   :fibo-fnd-utl-av/synonym {:rdf/language "en",
                             :rdf/value    "proposed settlement"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "class action"},
   :rdfs/subClassOf :fibo-cae-ce-act/VoluntaryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action involving a situation where interested parties seek restitution for financial loss"}})

(def ConsentSolicitation
  "corporate action that is a procedure that aims to obtain consent of holder to a proposal by the issuer or a third party without convening a meeting"
  {:db/ident :fibo-cae-ce-act/ConsentSolicitation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
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
  "action carried out by or specifically relating to a legal entity that may affect the securities it issues and may have a material impact on its stakeholders, such as shareholders and creditors"
  {:db/ident :fibo-cae-ce-act/CorporateAction,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Corporate actions are typically approved by a company's board of directors and authorized by the shareholders."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
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
  "corporate action involving a request for holders or beneficial owners to disclose their name, location and holdings of any issue to the issuer"
  {:db/ident :fibo-cae-ce-act/DisclosureAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "disclosure action"},
   :rdfs/subClassOf :fibo-cae-ce-act/VoluntaryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action involving a request for holders or beneficial owners to disclose their name, location and holdings of any issue to the issuer"}})

(def Divestiture
  "corporate action involving the sales of subsidiary business interests or investments"
  {:db/ident :fibo-cae-ce-act/Divestiture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
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
  "classifier of corporate actions that impacts income to shareholders"
  {:db/ident :fibo-cae-ce-act/IncomeOrientedClassifier,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Cash dividends are a classic example where a public company declares a dividend to be paid on each outstanding share. Bonus is another case where the shareholder is rewarded. In a stricter sense, the bonus issue should not impact the share price but in reality, in rare cases, it does and results in an overall increase in value."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "income-oriented classifier"},
   :rdfs/subClassOf :fibo-cae-ce-act/ActionClassifier,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "classifier of corporate actions that impacts income to shareholders"}})

(def LegalFormChange
  "corporate action indicating a modification of the legal form of the organization"
  {:db/ident :fibo-cae-ce-act/LegalFormChange,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
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
    "In the United States it is common for companies established as Subchapter S Corporations (S-Corp), typically early stage companies, to modify their structure to become full-fledged Subchapter C Corporations (C-Corp) to facilitate outside fundraising, mergers, acquisitions, and public offerings.  Other common form changes include migration from sole proprietorships to more formally registered organizations (e.g., LLC, S-Corp, C-Corp, etc.)"}})

(def Liquidation
  "corporate action related to winding up a business, including but not limited to distribution of cash, assets, or both"
  {:db/ident :fibo-cae-ce-act/Liquidation,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Debt may be paid in order of priority based on preferred claims to assets specified by a security, for example."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "liquidation"},
   :rdfs/subClassOf :fibo-cae-ce-act/Divestiture,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action related to winding up a business, including but not limited to distribution of cash, assets, or both"}})

(def MandatoryCorporateAction
  "action initiated by the board of directors of a corporation that affects all shareholders"
  {:db/ident :fibo-cae-ce-act/MandatoryCorporateAction,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Mandatory means mandatory participation by all shareholders, however the shareholder is not required to do anything."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
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
  "mandatory corporate action where shareholders are given an opportunity to choose among several options"
  {:db/ident :fibo-cae-ce-act/MandatoryWithChoiceCorporateAction,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "In case a shareholder does not submit the election, the default option will be applied."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mandatory with choice corporate action"},
   :rdfs/subClassOf :fibo-cae-ce-act/MandatoryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "mandatory corporate action where shareholders are given an opportunity to choose among several options"}})

(def MarketAction
  "action that is initiated by a market, such as a securities exchange, that affects a legal entity or the securities it issues and may have a material impact on that entity's stakeholders, such as shareholders and creditors"
  {:db/ident :fibo-cae-ce-act/MarketAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "market action"},
   :rdfs/subClassOf :fibo-cae-ce-act/Action,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "action that is initiated by a market, such as a securities exchange, that affects a legal entity or the securities it issues and may have a material impact on that entity's stakeholders, such as shareholders and creditors"}})

(def MergerAcquisition
  "corporate action involving the consolidation of legal entities or assets"
  {:db/ident :fibo-cae-ce-act/MergerAcquisition,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Such consolidation may be accomplished via financial transactions such as mergers, acquisitions, consolidations, tender offers, purchase of assets, and management acquisitions."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "merger / acquisition"},
   :rdfs/subClassOf :fibo-cae-ce-act/MandatoryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action involving the consolidation of legal entities or assets"}})

(def Notification
  "corporate action involving information provided by the issuer having no accounting/financial impact on the holder"
  {:db/ident :fibo-cae-ce-act/Notification,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "notification"},
   :rdfs/subClassOf :fibo-cae-ce-act/MandatoryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action involving information provided by the issuer having no accounting/financial impact on the holder"}})

(def OrganizationAddressChange
  "information action that provides details of address changes for a legal entity"
  {:db/ident :fibo-cae-ce-act/OrganizationAddressChange,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
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
  "information action that provides details of name changes for a legal entity"
  {:db/ident :fibo-cae-ce-act/OrganizationNameChange,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
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
  "corporate action that is a public offer where, due to a limited amount of securities available, priority is given to existing shareholders"
  {:db/ident :fibo-cae-ce-act/PriorityIssue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "priority issue"},
   :rdfs/subClassOf :fibo-cae-ce-act/VoluntaryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action that is a public offer where, due to a limited amount of securities available, priority is given to existing shareholders"}})

(def RegulatoryAction
  "action initiated by a regulatory agency that affects a legal entity or the securities it issues and may have a material impact on that entity's stakeholders, such as shareholders and creditors"
  {:db/ident :fibo-cae-ce-act/RegulatoryAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "regulatory action"},
   :rdfs/subClassOf :fibo-cae-ce-act/Action,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "action initiated by a regulatory agency that affects a legal entity or the securities it issues and may have a material impact on that entity's stakeholders, such as shareholders and creditors"}})

(def SpinOff
  "corporate action involving the distribution of subsidiary stock to the shareholders of the parent company without a surrender of shares"
  {:db/ident :fibo-cae-ce-act/SpinOff,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Spin-off represents a form of divestiture usually resulting in an independent company or in an existing company. Examples include demerger, distribution, and unbundling."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "spin off"},
   :rdfs/subClassOf :fibo-cae-ce-act/Divestiture,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action involving the distribution of subsidiary stock to the shareholders of the parent company without a surrender of shares"}})

(def VoluntaryCorporateAction
  "event in which the shareholders elect to participate and must respond in order for the issuer to process the action"
  {:db/ident :fibo-cae-ce-act/VoluntaryCorporateAction,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Shareholders send responses to the issuer's agents, and the issuer will send the proceeds of the action to those shareholders who elect to participate."},
   :owl/disjointWith :fibo-cae-ce-act/MandatoryCorporateAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
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