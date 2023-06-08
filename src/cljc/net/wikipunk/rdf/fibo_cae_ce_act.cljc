(ns net.wikipunk.rdf.fibo-cae-ce-act
  "This ontology provides a high level overview of actions including corporate, market, and regulatory actions, ranging from business oriented events such as address and name changes, to those that are more specific to securities."
  {:cmns-av/copyright ["Copyright (c) 2016-2023 Object Management Group, Inc."
                       "Copyright (c) 2016-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :dcterms/abstract
   "This ontology provides a high level overview of actions including corporate, market, and regulatory actions, ranging from business oriented events such as address and name changes, to those that are more specific to securities.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://www.omg.org/spec/Commons/CodesAndCodeSets/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/Designators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Lifecycles/"
    "https://www.omg.org/spec/Commons/Classifiers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/Occurrences/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/CAE/CorporateEvents/CorporateActions/",
   :rdf/ns-prefix-map
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-cae-ce-act",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label #voc/lstr "Corporate Actions Ontology@en",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."]})

(def Action
  "event announced, initiated or carried out by an organization that affects a legal entity or the securities it issues and may have a material impact on that entity's stakeholders, such as shareholders and creditors"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Actions initiated by an issuer are typically approved by that company's board of directors and authorized by their shareholders.@en",
   :db/ident :fibo-cae-ce-act/Action,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label #voc/lstr "action@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-be-le-lp/LegalEntity
                                            :fibo-fbc-fi-fi/Security],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-cls/isClassifiedBy,
                      :owl/someValuesFrom :fibo-cae-ce-act/ActionClassifier,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence],
   :skos/definition
   #voc/lstr
    "event announced, initiated or carried out by an organization that affects a legal entity or the securities it issues and may have a material impact on that entity's stakeholders, such as shareholders and creditors@en",
   :skos/example
   #voc/lstr
    "Actions that impact an entity may be initiated by an issuer, exchange, regulator, creditor, or other third party.@en"})

(def ActionClassificationScheme
  "scheme for classifying the kinds of actions and events that may be announced, initiated or carried out by an organization that affects a legal entity or the securities it issues"
  {:cmns-av/usageNote
   "The set of corporate actions and income events included herein are a subset of those specified in a combination of ISO 15022 Securities - Scheme for Messages (Data Field Dictionary) and the GLEIF LEI-related corporate actions. Other schemes that are specific to a custodian, depository, or regulatory agency may also be important, and should take a similar approach with respect to classification.",
   :db/ident :fibo-cae-ce-act/ActionClassificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label "action classification scheme",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-dsg/defines,
                      :owl/someValuesFrom :fibo-cae-ce-act/ActionClassifier,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :fibo-cae-ce-act/ActionClassifier,
                      :owl/onProperty    :cmns-col/hasMember,
                      :rdf/type          :owl/Restriction}
                     :cmns-cds/CodeSet
                     :cmns-cls/ClassificationScheme],
   :skos/definition
   "scheme for classifying the kinds of actions and events that may be announced, initiated or carried out by an organization that affects a legal entity or the securities it issues"})

(def ActionClassifier
  "classifier that distinguishes the kinds of actions and events that may be announced, initiated or carried out by an organization that affects a legal entity or the securities it issues, such as income-oriented events"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "ISO 15022 classifies events as impacting income vs. others. Other classification schemes distinguish between actions that return profits to shareholders, actions that are designed to influence the share price, and actions involving a change in structure to the issuer organization.@en",
   :db/ident :fibo-cae-ce-act/ActionClassifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label #voc/lstr "action classifier@en",
   :rdfs/subClassOf [{:owl/onClass :fibo-cae-ce-act/ActionClassificationScheme,
                      :owl/onProperty :cmns-col/isMemberOf,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :fibo-cae-ce-act/Action,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass :fibo-cae-ce-act/ActionClassificationScheme,
                      :owl/onProperty :cmns-dsg/isDefinedIn,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     :cmns-cls/Classifier
                     {:owl/onProperty     :fibo-fnd-rel-rel/hasTag,
                      :owl/someValuesFrom :xsd/string,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/OccurrenceKind],
   :skos/definition
   #voc/lstr
    "classifier that distinguishes the kinds of actions and events that may be announced, initiated or carried out by an organization that affects a legal entity or the securities it issues, such as income-oriented events@en"})

(def ActionStatus
  "state of some action at some point in time"
  {:db/ident :fibo-cae-ce-act/ActionStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label #voc/lstr "action status@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :fibo-cae-ce-act/Action,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/hasTag,
                      :owl/someValuesFrom :xsd/string,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-lif/LifecycleStatus],
   :skos/definition #voc/lstr "state of some action at some point in time@en"})

(def BusinessStrategyClassifier
  "classifier of corporate actions that involve improving liquidity or changing the overall structure of the organization through diversification, combining and closing parts of the business, etc, to increase long-term profitability"
  {:db/ident :fibo-cae-ce-act/BusinessStrategyClassifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label #voc/lstr "business strategy classifier@en",
   :rdfs/subClassOf [:fibo-cae-ce-act/ActionClassifier
                     {:owl/onClass :fibo-cae-ce-act/ActionClassificationScheme,
                      :owl/onProperty :cmns-col/isMemberOf,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-dt-oc/OccurrenceKind
                     {:owl/onClass :fibo-cae-ce-act/ActionClassificationScheme,
                      :owl/onProperty :cmns-dsg/isDefinedIn,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :fibo-cae-ce-act/Action,
                      :rdf/type           :owl/Restriction}
                     :cmns-cls/Classifier
                     {:owl/onProperty     :fibo-fnd-rel-rel/hasTag,
                      :owl/someValuesFrom :xsd/string,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "classifier of corporate actions that involve improving liquidity or changing the overall structure of the organization through diversification, combining and closing parts of the business, etc, to increase long-term profitability@en"})

(def ChangeAction
  "corporate action to disseminate information regarding a change further described in the corporate action details"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Generic changes may include a change in the terms of an issue, change in the identification of a security, change of board lot, change from global to definitive, etc.@en",
   :db/ident :fibo-cae-ce-act/ChangeAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label #voc/lstr "change action@en",
   :rdfs/subClassOf [:fibo-cae-ce-act/MandatoryCorporateAction
                     {:owl/onProperty     :cmns-cls/isClassifiedBy,
                      :owl/someValuesFrom :fibo-cae-ce-act/ActionClassifier,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-be-le-lp/LegalEntity
                                            :fibo-fbc-fi-fi/Security],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-cae-ce-act/Action
                     :fibo-cae-ce-act/CorporateAction],
   :skos/definition
   #voc/lstr
    "corporate action to disseminate information regarding a change further described in the corporate action details@en"})

(def ClassAction
  "corporate action involving a situation where interested parties seek restitution for financial loss"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "The security holder may be offered the opportunity to join a class action proceeding and would need to respond with an instruction.@en",
   :cmns-av/synonym #voc/lstr "proposed settlement@en",
   :db/ident :fibo-cae-ce-act/ClassAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label #voc/lstr "class action@en",
   :rdfs/subClassOf [:fibo-cae-ce-act/VoluntaryCorporateAction
                     {:owl/onProperty     :cmns-cls/isClassifiedBy,
                      :owl/someValuesFrom :fibo-cae-ce-act/ActionClassifier,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-be-le-lp/LegalEntity
                                            :fibo-fbc-fi-fi/Security],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-cae-ce-act/Action
                     :fibo-cae-ce-act/CorporateAction],
   :skos/definition
   #voc/lstr
    "corporate action involving a situation where interested parties seek restitution for financial loss@en"})

(def ConsentSolicitation
  "corporate action that is a procedure that aims to obtain consent of holder to a proposal by the issuer or a third party without convening a meeting"
  {:db/ident :fibo-cae-ce-act/ConsentSolicitation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label #voc/lstr "consent solicitation@en",
   :rdfs/subClassOf [:fibo-cae-ce-act/VoluntaryCorporateAction
                     {:owl/onProperty     :cmns-cls/isClassifiedBy,
                      :owl/someValuesFrom :fibo-cae-ce-act/ActionClassifier,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-be-le-lp/LegalEntity
                                            :fibo-fbc-fi-fi/Security],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-cae-ce-act/Action
                     :fibo-cae-ce-act/CorporateAction],
   :skos/definition
   #voc/lstr
    "corporate action that is a procedure that aims to obtain consent of holder to a proposal by the issuer or a third party without convening a meeting@en",
   :skos/example #voc/lstr
                  "For example, consent to change the terms of a bond.@en"})

(def CorporateAction
  "action carried out by or specifically relating to a legal entity that may affect the securities it issues and may have a material impact on its stakeholders, such as shareholders and creditors"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Corporate actions are typically approved by a company's board of directors and authorized by the shareholders.@en",
   :db/ident :fibo-cae-ce-act/CorporateAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label #voc/lstr "corporate action@en",
   :rdfs/subClassOf [:fibo-cae-ce-act/Action
                     {:owl/onProperty     :cmns-cls/isClassifiedBy,
                      :owl/someValuesFrom :fibo-cae-ce-act/ActionClassifier,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-be-le-lp/LegalEntity
                                            :fibo-fbc-fi-fi/Security],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "action carried out by or specifically relating to a legal entity that may affect the securities it issues and may have a material impact on its stakeholders, such as shareholders and creditors@en",
   :skos/example
   #voc/lstr
    "Examples of corporate actions include share issues, stock splits, consolidation, dividends, mergers and acquisitions, rights issues, spin-offs, and the inception of court actions.@en"})

(def DisclosureAction
  "corporate action involving a request for holders or beneficial owners to disclose their name, location and holdings of any issue to the issuer"
  {:db/ident :fibo-cae-ce-act/DisclosureAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label #voc/lstr "disclosure action@en",
   :rdfs/subClassOf [:fibo-cae-ce-act/VoluntaryCorporateAction
                     {:owl/onProperty     :cmns-cls/isClassifiedBy,
                      :owl/someValuesFrom :fibo-cae-ce-act/ActionClassifier,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-be-le-lp/LegalEntity
                                            :fibo-fbc-fi-fi/Security],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-cae-ce-act/Action
                     :fibo-cae-ce-act/CorporateAction],
   :skos/definition
   #voc/lstr
    "corporate action involving a request for holders or beneficial owners to disclose their name, location and holdings of any issue to the issuer@en"})

(def Divestiture
  "corporate action involving the sales of subsidiary business interests or investments"
  {:db/ident :fibo-cae-ce-act/Divestiture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label #voc/lstr "divestiture@en",
   :rdfs/subClassOf [:fibo-cae-ce-act/MandatoryCorporateAction
                     {:owl/onProperty     :cmns-cls/isClassifiedBy,
                      :owl/someValuesFrom :fibo-cae-ce-act/ActionClassifier,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-be-le-lp/LegalEntity
                                            :fibo-fbc-fi-fi/Security],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-cae-ce-act/Action
                     :fibo-cae-ce-act/CorporateAction],
   :skos/definition
   #voc/lstr
    "corporate action involving the sales of subsidiary business interests or investments@en",
   :skos/note
   #voc/lstr
    "Divestiture is an action or process involving the sale, spinoff, or liquidation of business assets, including product lines, services, subsidiaries, business property, or even an entire business. Companies may pursue a divestment strategy to refocus on their core business, in response to the operating environment in their industry, to raise capital, or to release underperforming assets.@en"})

(def IncomeOrientedClassifier
  "classifier of corporate actions that impacts income to shareholders"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Cash dividends are a classic example where a public company declares a dividend to be paid on each outstanding share. Bonus is another case where the shareholder is rewarded. In a stricter sense, the bonus issue should not impact the share price but in reality, in rare cases, it does and results in an overall increase in value.@en",
   :db/ident :fibo-cae-ce-act/IncomeOrientedClassifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label #voc/lstr "income-oriented classifier@en",
   :rdfs/subClassOf [:fibo-cae-ce-act/ActionClassifier
                     {:owl/onClass :fibo-cae-ce-act/ActionClassificationScheme,
                      :owl/onProperty :cmns-col/isMemberOf,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-dt-oc/OccurrenceKind
                     {:owl/onClass :fibo-cae-ce-act/ActionClassificationScheme,
                      :owl/onProperty :cmns-dsg/isDefinedIn,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :fibo-cae-ce-act/Action,
                      :rdf/type           :owl/Restriction}
                     :cmns-cls/Classifier
                     {:owl/onProperty     :fibo-fnd-rel-rel/hasTag,
                      :owl/someValuesFrom :xsd/string,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "classifier of corporate actions that impacts income to shareholders@en"})

(def LegalFormChange
  "corporate action indicating a modification of the legal form of the organization"
  {:db/ident :fibo-cae-ce-act/LegalFormChange,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label #voc/lstr "legal form change@en",
   :rdfs/subClassOf [:fibo-cae-ce-act/MandatoryCorporateAction
                     {:owl/onProperty     :cmns-cls/isClassifiedBy,
                      :owl/someValuesFrom :fibo-cae-ce-act/ActionClassifier,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-be-le-lp/LegalEntity
                                            :fibo-fbc-fi-fi/Security],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-cae-ce-act/Action
                     :fibo-cae-ce-act/CorporateAction],
   :skos/definition
   #voc/lstr
    "corporate action indicating a modification of the legal form of the organization@en",
   :skos/example
   #voc/lstr
    "In the United States it is common for companies established as Subchapter S Corporations (S-Corp), typically early stage companies, to modify their structure to become full-fledged Subchapter C Corporations (C-Corp) to facilitate outside fundraising, mergers, acquisitions, and public offerings. Other common form changes include migration from sole proprietorships to more formally registered organizations (e.g., LLC, S-Corp, C-Corp, etc.)@en"})

(def Liquidation
  "corporate action related to winding up a business, including but not limited to distribution of cash, assets, or both"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Debt may be paid in order of priority based on preferred claims to assets specified by a security, for example.@en",
   :db/ident :fibo-cae-ce-act/Liquidation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label #voc/lstr "liquidation@en",
   :rdfs/subClassOf [:fibo-cae-ce-act/Divestiture
                     :fibo-cae-ce-act/MandatoryCorporateAction
                     {:owl/onProperty     :cmns-cls/isClassifiedBy,
                      :owl/someValuesFrom :fibo-cae-ce-act/ActionClassifier,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-be-le-lp/LegalEntity
                                            :fibo-fbc-fi-fi/Security],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-cae-ce-act/Action
                     :fibo-cae-ce-act/CorporateAction],
   :skos/definition
   #voc/lstr
    "corporate action related to winding up a business, including but not limited to distribution of cash, assets, or both@en"})

(def MandatoryCorporateAction
  "action initiated by the board of directors of a corporation that affects all shareholders"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Mandatory means mandatory participation by all shareholders, however the shareholder is not required to do anything.@en",
   :db/ident :fibo-cae-ce-act/MandatoryCorporateAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label #voc/lstr "mandatory corporate action@en",
   :rdfs/subClassOf [:fibo-cae-ce-act/CorporateAction
                     {:owl/onProperty     :cmns-cls/isClassifiedBy,
                      :owl/someValuesFrom :fibo-cae-ce-act/ActionClassifier,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-be-le-lp/LegalEntity
                                            :fibo-fbc-fi-fi/Security],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-cae-ce-act/Action],
   :skos/definition
   #voc/lstr
    "action initiated by the board of directors of a corporation that affects all shareholders@en",
   :skos/example
   #voc/lstr
    "Examples of mandatory corporate actions include cash dividends, stock splits, mergers, pre-refunding, return of capital, bonus issue, asset ID change, and spin-offs.@en"})

(def MandatoryWithChoiceCorporateAction
  "mandatory corporate action where shareholders are given an opportunity to choose among several options"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "In case a shareholder does not submit the election, the default option will be applied.@en",
   :db/ident :fibo-cae-ce-act/MandatoryWithChoiceCorporateAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label #voc/lstr "mandatory with choice corporate action@en",
   :rdfs/subClassOf [:fibo-cae-ce-act/MandatoryCorporateAction
                     {:owl/onProperty     :cmns-cls/isClassifiedBy,
                      :owl/someValuesFrom :fibo-cae-ce-act/ActionClassifier,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-be-le-lp/LegalEntity
                                            :fibo-fbc-fi-fi/Security],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-cae-ce-act/Action
                     :fibo-cae-ce-act/CorporateAction],
   :skos/definition
   #voc/lstr
    "mandatory corporate action where shareholders are given an opportunity to choose among several options@en"})

(def MarketAction
  "action that is initiated by a market, such as a securities exchange, that affects a legal entity or the securities it issues and may have a material impact on that entity's stakeholders, such as shareholders and creditors"
  {:db/ident :fibo-cae-ce-act/MarketAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label #voc/lstr "market action@en",
   :rdfs/subClassOf [:fibo-cae-ce-act/Action
                     {:owl/onProperty     :cmns-cls/isClassifiedBy,
                      :owl/someValuesFrom :fibo-cae-ce-act/ActionClassifier,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-be-le-lp/LegalEntity
                                            :fibo-fbc-fi-fi/Security],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "action that is initiated by a market, such as a securities exchange, that affects a legal entity or the securities it issues and may have a material impact on that entity's stakeholders, such as shareholders and creditors@en"})

(def MergerAcquisition
  "corporate action involving the consolidation of legal entities or assets"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Such consolidation may be accomplished via financial transactions such as mergers, acquisitions, consolidations, tender offers, purchase of assets, and management acquisitions.@en",
   :db/ident :fibo-cae-ce-act/MergerAcquisition,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label #voc/lstr "merger / acquisition@en",
   :rdfs/subClassOf [:fibo-cae-ce-act/MandatoryCorporateAction
                     {:owl/onProperty     :cmns-cls/isClassifiedBy,
                      :owl/someValuesFrom :fibo-cae-ce-act/ActionClassifier,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-be-le-lp/LegalEntity
                                            :fibo-fbc-fi-fi/Security],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-cae-ce-act/Action
                     :fibo-cae-ce-act/CorporateAction],
   :skos/definition
   #voc/lstr
    "corporate action involving the consolidation of legal entities or assets@en"})

(def Notification
  "corporate action involving information provided by the issuer having no accounting/financial impact on the holder"
  {:db/ident :fibo-cae-ce-act/Notification,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label #voc/lstr "notification@en",
   :rdfs/subClassOf [:fibo-cae-ce-act/MandatoryCorporateAction
                     {:owl/onProperty     :cmns-cls/isClassifiedBy,
                      :owl/someValuesFrom :fibo-cae-ce-act/ActionClassifier,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-be-le-lp/LegalEntity
                                            :fibo-fbc-fi-fi/Security],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-cae-ce-act/Action
                     :fibo-cae-ce-act/CorporateAction],
   :skos/definition
   #voc/lstr
    "corporate action involving information provided by the issuer having no accounting/financial impact on the holder@en"})

(def OrganizationAddressChange
  "information action that provides details of address changes for a legal entity"
  {:db/ident :fibo-cae-ce-act/OrganizationAddressChange,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label #voc/lstr "organization address change@en",
   :rdfs/subClassOf [:fibo-cae-ce-act/Notification
                     :fibo-cae-ce-act/MandatoryCorporateAction
                     {:owl/onProperty     :cmns-cls/isClassifiedBy,
                      :owl/someValuesFrom :fibo-cae-ce-act/ActionClassifier,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-be-le-lp/LegalEntity
                                            :fibo-fbc-fi-fi/Security],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-cae-ce-act/Action
                     :fibo-cae-ce-act/CorporateAction],
   :skos/definition
   #voc/lstr
    "information action that provides details of address changes for a legal entity@en",
   :skos/note
   #voc/lstr
    "Address changes may impact securities master data management, including but not limited to where shares are registered and by whom.@en"})

(def OrganizationNameChange
  "information action that provides details of name changes for a legal entity"
  {:db/ident :fibo-cae-ce-act/OrganizationNameChange,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label #voc/lstr "organization name change@en",
   :rdfs/subClassOf [:fibo-cae-ce-act/Notification
                     :fibo-cae-ce-act/MandatoryCorporateAction
                     {:owl/onProperty     :cmns-cls/isClassifiedBy,
                      :owl/someValuesFrom :fibo-cae-ce-act/ActionClassifier,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-be-le-lp/LegalEntity
                                            :fibo-fbc-fi-fi/Security],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-cae-ce-act/Action
                     :fibo-cae-ce-act/CorporateAction],
   :skos/definition
   #voc/lstr
    "information action that provides details of name changes for a legal entity@en",
   :skos/note
   #voc/lstr
    "Name changes may include legal name changes as well as 'doing business as', and other operational names for an organization.@en"})

(def PriorityIssue
  "corporate action that is a public offer where, due to a limited amount of securities available, priority is given to existing shareholders"
  {:db/ident :fibo-cae-ce-act/PriorityIssue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label #voc/lstr "priority issue@en",
   :rdfs/subClassOf [:fibo-cae-ce-act/VoluntaryCorporateAction
                     {:owl/onProperty     :cmns-cls/isClassifiedBy,
                      :owl/someValuesFrom :fibo-cae-ce-act/ActionClassifier,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-be-le-lp/LegalEntity
                                            :fibo-fbc-fi-fi/Security],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-cae-ce-act/Action
                     :fibo-cae-ce-act/CorporateAction],
   :skos/definition
   #voc/lstr
    "corporate action that is a public offer where, due to a limited amount of securities available, priority is given to existing shareholders@en"})

(def RegulatoryAction
  "action initiated by a regulatory agency that affects a legal entity or the securities it issues and may have a material impact on that entity's stakeholders, such as shareholders and creditors"
  {:db/ident :fibo-cae-ce-act/RegulatoryAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label #voc/lstr "regulatory action@en",
   :rdfs/subClassOf [:fibo-cae-ce-act/Action
                     {:owl/onProperty     :cmns-cls/isClassifiedBy,
                      :owl/someValuesFrom :fibo-cae-ce-act/ActionClassifier,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-be-le-lp/LegalEntity
                                            :fibo-fbc-fi-fi/Security],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "action initiated by a regulatory agency that affects a legal entity or the securities it issues and may have a material impact on that entity's stakeholders, such as shareholders and creditors@en"})

(def SpinOff
  "corporate action involving the distribution of subsidiary stock to the shareholders of the parent company without a surrender of shares"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Spin-off represents a form of divestiture usually resulting in an independent company or in an existing company. Examples include demerger, distribution, and unbundling.@en",
   :db/ident :fibo-cae-ce-act/SpinOff,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label #voc/lstr "spin off@en",
   :rdfs/subClassOf [:fibo-cae-ce-act/Divestiture
                     :fibo-cae-ce-act/MandatoryCorporateAction
                     {:owl/onProperty     :cmns-cls/isClassifiedBy,
                      :owl/someValuesFrom :fibo-cae-ce-act/ActionClassifier,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-be-le-lp/LegalEntity
                                            :fibo-fbc-fi-fi/Security],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-cae-ce-act/Action
                     :fibo-cae-ce-act/CorporateAction],
   :skos/definition
   #voc/lstr
    "corporate action involving the distribution of subsidiary stock to the shareholders of the parent company without a surrender of shares@en"})

(def VoluntaryCorporateAction
  "event in which the shareholders elect to participate and must respond in order for the issuer to process the action"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Shareholders send responses to the issuer's agents, and the issuer will send the proceeds of the action to those shareholders who elect to participate.@en",
   :db/ident :fibo-cae-ce-act/VoluntaryCorporateAction,
   :owl/disjointWith :fibo-cae-ce-act/MandatoryCorporateAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfs/label #voc/lstr "voluntary corporate action@en",
   :rdfs/subClassOf [:fibo-cae-ce-act/CorporateAction
                     {:owl/onProperty     :cmns-cls/isClassifiedBy,
                      :owl/someValuesFrom :fibo-cae-ce-act/ActionClassifier,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-be-le-lp/LegalEntity
                                            :fibo-fbc-fi-fi/Security],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-cae-ce-act/Action],
   :skos/definition
   #voc/lstr
    "event in which the shareholders elect to participate and must respond in order for the issuer to process the action@en",
   :skos/example
   #voc/lstr
    "An example of a voluntary corporate action is a tender offer, in which the issuer may request shareholders to tender their shares at a predetermined price.@en"})