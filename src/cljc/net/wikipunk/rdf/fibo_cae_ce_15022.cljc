(ns net.wikipunk.rdf.fibo-cae-ce-15022
  "This ontology includes the codes for income and corporate action events as specified in ISO 15022, including extensions as of 3 September 2020. Scope excludes lower-level notification and meetings related events and message definitions associated with ISO 15022 as well as related messages covered by ISO 20022."
  {:cmns-av/copyright "Copyright (c) 2016-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :dcterms/abstract
   "This ontology includes the codes for income and corporate action events as specified in ISO 15022, including extensions as of 3 September 2020. Scope excludes lower-level notification and meetings related events and message definitions associated with ISO 15022 as well as related messages covered by ISO 20022.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/CAE/CorporateEvents/CorporateActions/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/Classifiers/"
    "https://www.omg.org/spec/Commons/Designators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/CreditEvents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/CAE/CorporateEvents/SecurityRelatedCorporateActions/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-cae-ce-15022"
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
    "fibo-cae-ce-act"
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
    "fibo-cae-ce-srca"
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
    "fibo-fbc-dae-cre"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
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
   :rdfa/prefix "fibo-cae-ce-15022",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "ISO 15022 Corporate Action Individuals Ontology@en"})

(def BIDS
  "ISO 15022 classifier for corporate actions in which an offer is made to existing shareholders by the issuing company to repurchase equity or other securities convertible into equity"
  {:cmns-cls/classifies :fibo-cae-ce-srca/RepurchaseOffer,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/BIDS,
   :fibo-fnd-rel-rel/hasTag "BIDS",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "BIDS@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions in which an offer is made to existing shareholders by the issuing company to repurchase equity or other securities convertible into equity@en"})

(def BONU
  "ISO 15022 classifier for corporate actions in which security holders are awarded additional assets free of payment from the issuer in proportion to their holding"
  {:cmns-cls/classifies :fibo-cae-ce-srca/BonusIssue,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/BONU,
   :fibo-fnd-rel-rel/hasTag "BONU",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "BONU@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions in which security holders are awarded additional assets free of payment from the issuer in proportion to their holding@en"})

(def BPUT
  "ISO 15022 classifier for corporate actions that involve early redemption of a security at the election of the holder subject to the terms and condition of the issue with no reduction in nominal value"
  {:cmns-cls/classifies :fibo-cae-ce-srca/PutRedemptionAction,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/BPUT,
   :fibo-fnd-rel-rel/hasTag "BPUT",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "BPUT@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that involve early redemption of a security at the election of the holder subject to the terms and condition of the issue with no reduction in nominal value@en"})

(def CAPD
  "ISO 15022 classifier for corporate actions that pay shareholders an amount in cash issued from the issuer's capital account"
  {:cmns-cls/classifies :fibo-cae-ce-srca/CapitalDistribution,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/CAPD,
   :fibo-fnd-rel-rel/hasTag "CAPD",
   :rdf/type [:fibo-cae-ce-act/IncomeOrientedClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "CAPD@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that pay shareholders an amount in cash issued from the issuer's capital account@en"})

(def CAPG
  "ISO 15022 classifier for corporate actions that distribute profits resulting from the sale of company assets to shareholders"
  {:cmns-cls/classifies :fibo-cae-ce-srca/CapitalGainsDistribution,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/CAPG,
   :fibo-fnd-rel-rel/hasTag "CAPG",
   :rdf/type [:fibo-cae-ce-act/IncomeOrientedClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "CAPG@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that distribute profits resulting from the sale of company assets to shareholders@en"})

(def CHAN
  "ISO 15022 classifier for corporate actions that disseminate information regarding a change further described in the corporate action details"
  {:cmns-cls/classifies :fibo-cae-ce-act/ChangeAction,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/CHAN,
   :fibo-fnd-rel-rel/hasTag "CHAN",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "CHAN@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that disseminate information regarding a change further described in the corporate action details@en"})

(def CLSA
  "ISO 15022 classifier for corporate actions involving a situation where interested parties seek restitution for financial loss"
  {:cmns-cls/classifies :fibo-cae-ce-act/ClassAction,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/CLSA,
   :fibo-fnd-rel-rel/hasTag "CLSA",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "CLSA@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions involving a situation where interested parties seek restitution for financial loss@en"})

(def CONS
  "ISO 15022 classifier for corporate actions that involve procedures aiming to obtain consent of holder to a proposal by the issuer or a third party without convening a meeting"
  {:cmns-cls/classifies :fibo-cae-ce-act/ConsentSolicitation,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/CONS,
   :fibo-fnd-rel-rel/hasTag "CONS",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "CONS@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that involve procedures aiming to obtain consent of holder to a proposal by the issuer or a third party without convening a meeting@en"})

(def CONV
  "ISO 15022 classifier for corporate actions that involve conversion of securities (generally convertible bonds or preferred shares) into another form of securities (usually common shares) at a pre-stated price/ratio"
  {:cmns-cls/classifies :fibo-cae-ce-srca/ConversionAction,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/CONV,
   :fibo-fnd-rel-rel/hasTag "CONV",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "CONV@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that involve conversion of securities (generally convertible bonds or preferred shares) into another form of securities (usually common shares) at a pre-stated price/ratio@en"})

(def DECR
  "ISO 15022 classifier for corporate actions that reduce the face value of a share or the value of fund assets"
  {:cmns-cls/classifies :fibo-cae-ce-srca/DecreaseInValueAction,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/DECR,
   :fibo-fnd-rel-rel/hasTag "DECR",
   :rdf/type [:fibo-cae-ce-act/IncomeOrientedClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "DECR@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that reduce the face value of a share or the value of fund assets@en"})

(def DFLT
  "ISO 15022 classifier for corporate actions that indicate a failure by the issuer to perform obligations defined as default events under the bond agreement and that have not been remedied"
  {:cmns-cls/classifies :fibo-cae-ce-srca/BondDefaultAction,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/DFLT,
   :fibo-fnd-rel-rel/hasTag "DFLT",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "DFLT@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that indicate a failure by the issuer to perform obligations defined as default events under the bond agreement and that have not been remedied@en"})

(def DRIP
  "ISO 15022 classifier for corporate actions that involve a dividend payment whereby holders can keep cash or have the cash reinvested into additional shares in the issuing company"
  {:cmns-cls/classifies :fibo-cae-ce-srca/DividendReinvestmentAction,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/DRIP,
   :fibo-fnd-rel-rel/hasTag "DRIP",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "DRIP@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that involve a dividend payment whereby holders can keep cash or have the cash reinvested into additional shares in the issuing company@en"})

(def DSCL
  "ISO 15022 classifier for corporate actions that involve a requirement for holders or beneficial owners to disclose their name, location and holdings of any issue to the issuer"
  {:cmns-cls/classifies :fibo-cae-ce-act/DisclosureAction,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/DSCL,
   :fibo-fnd-rel-rel/hasTag "DSCL",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "DSCL@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that involve a requirement for holders or beneficial owners to disclose their name, location and holdings of any issue to the issuer@en"})

(def DTCH
  "ISO 15022 classifier for corporate actions involving parties wishing to acquire a security"
  {:cmns-cls/classifies :fibo-cae-ce-srca/DutchAuction,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/DTCH,
   :fibo-fnd-rel-rel/hasTag "DTCH",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "DTCH@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions involving parties wishing to acquire a security@en"})

(def DVCA
  "ISO 15022 classifier for corporate actions that distribute cash to shareholders in proportion to their equity holding"
  {:cmns-cls/classifies :fibo-cae-ce-srca/CashDividendAction,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/DVCA,
   :fibo-fnd-rel-rel/hasTag "DVCA",
   :rdf/type [:fibo-cae-ce-act/IncomeOrientedClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "DVCA@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that distribute cash to shareholders in proportion to their equity holding@en"})

(def DVOP
  "ISO 15022 classifier for corporate actions that involve distribution of a dividend to shareholders with a choice of benefit to receive"
  {:cmns-cls/classifies :fibo-cae-ce-srca/DividendOptionAction,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/DVOP,
   :fibo-fnd-rel-rel/hasTag "DVOP",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "DVOP@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that involve distribution of a dividend to shareholders with a choice of benefit to receive@en"})

(def DVSE
  "ISO 15022 classifier for corporate actions that involve distribution of a dividend to shareholders in the form of equities of the issuing corporation"
  {:cmns-cls/classifies :fibo-cae-ce-srca/StockDividendAction,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/DVSE,
   :fibo-fnd-rel-rel/hasTag "DVSE",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "DVSE@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that involve distribution of a dividend to shareholders in the form of equities of the issuing corporation@en"})

(def EXOF
  "ISO 15022 classifier for corporate actions that reflect an exchange of holdings for other securities and/or cash"
  {:cmns-cls/classifies :fibo-cae-ce-srca/ExchangeAction,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/EXOF,
   :fibo-fnd-rel-rel/hasTag "EXOF",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "EXOF@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that reflect an exchange of holdings for other securities and/or cash@en"})

(def EXRI
  "ISO 15022 classifier for corporate actions that involve a call or exercise on nil paid securities or intermediate securities resulting from an intermediate securities distribution (RHDI)"
  {:cmns-cls/classifies :fibo-cae-ce-srca/CallOnIntermediateSecurities,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/EXRI,
   :fibo-fnd-rel-rel/hasTag "EXRI",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "EXRI@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that involve a call or exercise on nil paid securities or intermediate securities resulting from an intermediate securities distribution (RHDI)@en"})

(def EXTM
  "ISO 15022 classifier for corporate actions that involve prolonging the maturity date of a bond"
  {:cmns-cls/classifies :fibo-fbc-dae-cre/MaturityExtension,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/EXTM,
   :fibo-fnd-rel-rel/hasTag "EXTM",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "EXTM@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that involve prolonging the maturity date of a bond@en"})

(def EXWA
  "ISO 15022 classifier for corporate actions that offer holders the option to buy (call warrant) or to sell (put warrant) a specific amount of stock, cash, or commodity, at a predetermined price, during a predetermined period of time"
  {:cmns-cls/classifies :fibo-cae-ce-srca/WarrantExerciseAction,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/EXWA,
   :fibo-fnd-rel-rel/hasTag "EXWA",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier
              :owl/NamedIndividual
              :fibo-cae-ce-act/IncomeOrientedClassifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "EXWA@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that offer holders the option to buy (call warrant) or to sell (put warrant) a specific amount of stock, cash, or commodity, at a predetermined price, during a predetermined period of time@en"})

(def INFO
  "ISO 15022 classifier for corporate actions involving information provided by the issuer having no accounting/financial impact on the holder"
  {:cmns-cls/classifies :fibo-cae-ce-act/Notification,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/INFO,
   :fibo-fnd-rel-rel/hasTag "INFO",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "INFO@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions involving information provided by the issuer having no accounting/financial impact on the holder@en"})

(def INTR
  "ISO 15022 classifier for corporate actions that involve distribution of a regular interest payment to holders of an interest-bearing asset"
  {:cmns-cls/classifies :fibo-cae-ce-srca/InterestPaymentAction,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/INTR,
   :fibo-fnd-rel-rel/hasTag "INTR",
   :rdf/type [:fibo-cae-ce-act/IncomeOrientedClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "INTR@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that involve distribution of a regular interest payment to holders of an interest-bearing asset@en"})

(def ISO15022CorporateActionClassificationScheme
  "scheme for classifying corporate actions according to ISO 15022 Securities - Scheme for Messages (Data Field Dictionary)"
  {:db/ident :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/ActionClassificationScheme :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label "ISO 15022 corporate action classification scheme",
   :skos/definition
   "scheme for classifying corporate actions according to ISO 15022 Securities - Scheme for Messages (Data Field Dictionary)"})

(def LIQU
  "ISO 15022 classifier for corporate actions consisting of distribution of cash, assets, or both"
  {:cmns-cls/classifies :fibo-cae-ce-act/Liquidation,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/LIQU,
   :fibo-fnd-rel-rel/hasTag "LIQU",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "LIQU@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions consisting of distribution of cash, assets, or both@en"})

(def MCAL
  "ISO 15022 classifier for corporate actions that involve redemption of an entire issue outstanding of securities prior to maturity"
  {:cmns-cls/classifies :fibo-cae-ce-srca/FullCallEarlyRedemptionAction,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/MCAL,
   :fibo-fnd-rel-rel/hasTag "MCAL",
   :rdf/type [:fibo-cae-ce-act/IncomeOrientedClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "MCAL@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that involve redemption of an entire issue outstanding of securities prior to maturity@en"})

(def MRGR
  "ISO 15022 classifier for corporate actions that involve the exchange of outstanding securities, initiated by the issuer which may include options, as the result of two or more companies combining assets, that is, an external, third party company"
  {:cmns-cls/classifies :fibo-cae-ce-srca/PostMergerSecuritiesExchange,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/MRGR,
   :fibo-fnd-rel-rel/hasTag "MRGR",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "MRGR@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that involve the exchange of outstanding securities, initiated by the issuer which may include options, as the result of two or more companies combining assets, that is, an external, third party company@en"})

(def PARI
  "ISO 15022 classifier for corporate actions that occur when securities with different characteristics become identical in all respects"
  {:cmns-cls/classifies :fibo-cae-ce-srca/PariPassuAction,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/PARI,
   :fibo-fnd-rel-rel/hasTag "PARI",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "PARI@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that occur when securities with different characteristics become identical in all respects@en"})

(def PCAL
  "ISO 15022 classifier for corporate actions that involve redemption of securities in part before their scheduled final maturity date with reduction of the nominal value of the securities"
  {:cmns-cls/classifies
   :fibo-cae-ce-srca/PartialRedemptionWithReductionOfNominalValueAction,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/PCAL,
   :fibo-fnd-rel-rel/hasTag "PCAL",
   :rdf/type [:fibo-cae-ce-act/IncomeOrientedClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "PCAL@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that involve redemption of securities in part before their scheduled final maturity date with reduction of the nominal value of the securities@en"})

(def PRED
  "ISO 15022 classifier for corporate actions that involve redemption of securities in part before their scheduled final maturity date with no reduction in nominal value"
  {:cmns-cls/classifies
   :fibo-cae-ce-srca/PartialRedemptionWithoutReductionOfNominalValueAction,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/PRED,
   :fibo-fnd-rel-rel/hasTag "PRED",
   :rdf/type [:fibo-cae-ce-act/IncomeOrientedClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "PRED@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that involve redemption of securities in part before their scheduled final maturity date with no reduction in nominal value@en"})

(def PRIO
  "ISO 15022 classifier for corporate actions that involve a public offer where priority is given to existing shareholders"
  {:cmns-cls/classifies :fibo-cae-ce-act/PriorityIssue,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/PRIO,
   :fibo-fnd-rel-rel/hasTag "PRIO",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "PRIO@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that involve a public offer where priority is given to existing shareholders@en"})

(def REDM
  "ISO 15022 classifier for corporate actions that involve redemption of an entire issue outstanding of securities at final maturity"
  {:cmns-cls/classifies :fibo-cae-ce-srca/RedemptionAtMaturityAction,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/REDM,
   :fibo-fnd-rel-rel/hasTag "REDM",
   :rdf/type [:fibo-cae-ce-act/IncomeOrientedClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "REDM@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that involve redemption of an entire issue outstanding of securities at final maturity@en"})

(def REDO
  "ISO 15022 classifier for corporate actions by which the unit (currency and/or nominal) of a security is restated"
  {:cmns-cls/classifies :fibo-cae-ce-srca/RedenominationAction,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/REDO,
   :fibo-fnd-rel-rel/hasTag "REDO",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "REDO@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions by which the unit (currency and/or nominal) of a security is restated@en"})

(def RHDI
  "ISO 15022 classifier for corporate actions involving the distribution of intermediate securities or privilege that gives the holder the right to take part in a future event"
  {:cmns-cls/classifies :fibo-cae-ce-srca/IntermediateSecuritiesDistribution,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/RHDI,
   :fibo-fnd-rel-rel/hasTag "RHDI",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "RHDI@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions involving the distribution of intermediate securities or privilege that gives the holder the right to take part in a future event@en"})

(def SHPR
  "ISO 15022 classifier for corporate actions that pay shareholders an amount in cash issued from the shares premium reserve"
  {:cmns-cls/classifies :fibo-cae-ce-srca/SharesPremiumDividendAction,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/SHPR,
   :fibo-fnd-rel-rel/hasTag "SHPR",
   :rdf/type [:fibo-cae-ce-act/IncomeOrientedClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "SHPR@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that pay shareholders an amount in cash issued from the shares premium reserve@en"})

(def SOFF
  "ISO 15022 classifier for corporate actions that involve the distribution of subsidiary stock to the shareholders of the parent company without a surrender of shares"
  {:cmns-cls/classifies :fibo-cae-ce-act/SpinOff,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/SOFF,
   :fibo-fnd-rel-rel/hasTag "SOFF",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "SOFF@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that involve the distribution of subsidiary stock to the shareholders of the parent company without a surrender of shares@en"})

(def SPLF
  "ISO 15022 classifier for corporate actions that involve an increase in a corporation's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split"
  {:cmns-cls/classifies :fibo-cae-ce-srca/StockSplit,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/SPLF,
   :fibo-fnd-rel-rel/hasTag "SPLF",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "SPLF@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that involve an increase in a corporation's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split@en"})

(def SPLR
  "ISO 15022 classifier for corporate actions that involve a decrease in a company's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split"
  {:cmns-cls/classifies :fibo-cae-ce-srca/ReverseStockSplit,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/SPLR,
   :fibo-fnd-rel-rel/hasTag "SPLR",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "SPLR@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that involve a decrease in a company's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split@en"})

(def TEND
  "ISO 15022 classifier for corporate actions involving information provided by the issuer having no accounting/financial impact on the holder"
  {:cmns-cls/classifies :fibo-cae-ce-srca/TenderOffer,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/TEND,
   :fibo-fnd-rel-rel/hasTag "TEND",
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "TEND@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions involving information provided by the issuer having no accounting/financial impact on the holder@en"})

(def WRTH
  "ISO 15022 classifier for corporate actions that involve booking out of valueless securities"
  {:cmns-cls/classifies :fibo-cae-ce-srca/WorthlessSecurityAction,
   :cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/WRTH,
   :fibo-fnd-rel-rel/hasTag "WRTH",
   :rdf/type [:owl/NamedIndividual
              :fibo-cae-ce-act/IncomeOrientedClassifier
              :fibo-cae-ce-act/BusinessStrategyClassifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label #voc/lstr "WRTH@en",
   :skos/definition
   #voc/lstr
    "ISO 15022 classifier for corporate actions that involve booking out of valueless securities@en"})