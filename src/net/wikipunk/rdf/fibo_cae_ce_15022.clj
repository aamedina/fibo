(ns net.wikipunk.rdf.fibo-cae-ce-15022
  "This ontology includes the codes for income and corporate action events as specified in ISO 15022, including extensions as of 3 September 2020. Scope excludes lower-level notification and meetings related events and message definitions associated with ISO 15022 as well as related messages covered by ISO 20022."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :dcterms/abstract
   "This ontology includes the codes for income and corporate action events as specified in ISO 15022, including extensions as of 3 September 2020. Scope excludes lower-level notification and meetings related events and message definitions associated with ISO 15022 as well as related messages covered by ISO 20022.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/CAE/CorporateEvents/CorporateActions/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/CreditEvents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/CAE/CorporateEvents/SecurityRelatedCorporateActions/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
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
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfa/prefix "fibo-cae-ce-15022",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value "ISO 15022 Corporate Action Individuals Ontology"},
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright "Copyright (c) 2016-2022 EDM Council, Inc.",
   :sm/dependsOn ["https://spec.edmcouncil.org/fibo/ontology/FBC/"
                  "https://www.omg.org/spec/LCC/"
                  "https://spec.edmcouncil.org/fibo/ontology/FND/"],
   :sm/fileAbbreviation "fibo-cae-ce-15022",
   :sm/filename "ISO15022-CorporateActionIndividuals.rdf"})

(def BIDS
  "ISO 15022 classifier for corporate actions in which an offer is made to existing shareholders by the issuing company to repurchase equity or other securities convertible into equity"
  {:db/ident :fibo-cae-ce-15022/BIDS,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/RepurchaseOffer,
   :lcc-lr/hasTag "BIDS",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "BIDS"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions in which an offer is made to existing shareholders by the issuing company to repurchase equity or other securities convertible into equity"}})

(def BONU
  "ISO 15022 classifier for corporate actions in which security holders are awarded additional assets free of payment from the issuer in proportion to their holding"
  {:db/ident :fibo-cae-ce-15022/BONU,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/BonusIssue,
   :lcc-lr/hasTag "BONU",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "BONU"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions in which security holders are awarded additional assets free of payment from the issuer in proportion to their holding"}})

(def BPUT
  "ISO 15022 classifier for corporate actions that involve early redemption of a security at the election of the holder subject to the terms and condition of the issue with no reduction in nominal value"
  {:db/ident :fibo-cae-ce-15022/BPUT,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/PutRedemptionAction,
   :lcc-lr/hasTag "BPUT",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "BPUT"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve early redemption of a security at the election of the holder subject to the terms and condition of the issue with no reduction in nominal value"}})

(def CAPD
  "ISO 15022 classifier for corporate actions that pay shareholders an amount in cash issued from the issuer's capital account"
  {:db/ident :fibo-cae-ce-15022/CAPD,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/CapitalDistribution,
   :lcc-lr/hasTag "CAPD",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/IncomeOrientedClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CAPD"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that pay shareholders an amount in cash issued from the issuer's capital account"}})

(def CAPG
  "ISO 15022 classifier for corporate actions that distribute profits resulting from the sale of company assets to shareholders"
  {:db/ident :fibo-cae-ce-15022/CAPG,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/CapitalGainsDistribution,
   :lcc-lr/hasTag "CAPG",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/IncomeOrientedClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CAPG"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that distribute profits resulting from the sale of company assets to shareholders"}})

(def CHAN
  "ISO 15022 classifier for corporate actions that disseminate information regarding a change further described in the corporate action details"
  {:db/ident :fibo-cae-ce-15022/CHAN,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-act/ChangeAction,
   :lcc-lr/hasTag "CHAN",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CHAN"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that disseminate information regarding a change further described in the corporate action details"}})

(def CLSA
  "ISO 15022 classifier for corporate actions involving a situation where interested parties seek restitution for financial loss"
  {:db/ident :fibo-cae-ce-15022/CLSA,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-act/ClassAction,
   :lcc-lr/hasTag "CLSA",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CLSA"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions involving a situation where interested parties seek restitution for financial loss"}})

(def CONS
  "ISO 15022 classifier for corporate actions that involve procedures aiming to obtain consent of holder to a proposal by the issuer or a third party without convening a meeting"
  {:db/ident :fibo-cae-ce-15022/CONS,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-act/ConsentSolicitation,
   :lcc-lr/hasTag "CONS",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CONS"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve procedures aiming to obtain consent of holder to a proposal by the issuer or a third party without convening a meeting"}})

(def CONV
  "ISO 15022 classifier for corporate actions that involve conversion of securities (generally convertible bonds or preferred shares) into another form of securities (usually common shares) at a pre-stated price/ratio"
  {:db/ident :fibo-cae-ce-15022/CONV,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/ConversionAction,
   :lcc-lr/hasTag "CONV",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CONV"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve conversion of securities (generally convertible bonds or preferred shares) into another form of securities (usually common shares) at a pre-stated price/ratio"}})

(def DECR
  "ISO 15022 classifier for corporate actions that reduce the face value of a share or the value of fund assets"
  {:db/ident :fibo-cae-ce-15022/DECR,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/DecreaseInValueAction,
   :lcc-lr/hasTag "DECR",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/IncomeOrientedClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DECR"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that reduce the face value of a share or the value of fund assets"}})

(def DFLT
  "ISO 15022 classifier for corporate actions that indicate a failure by the issuer to perform obligations defined as default events under the bond agreement and that have not been remedied"
  {:db/ident :fibo-cae-ce-15022/DFLT,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/BondDefaultAction,
   :lcc-lr/hasTag "DFLT",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DFLT"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that indicate a failure by the issuer to perform obligations defined as default events under the bond agreement and that have not been remedied"}})

(def DRIP
  "ISO 15022 classifier for corporate actions that involve a dividend payment whereby holders can keep cash or have the cash reinvested into additional shares in the issuing company"
  {:db/ident :fibo-cae-ce-15022/DRIP,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/DividendReinvestmentAction,
   :lcc-lr/hasTag "DRIP",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DRIP"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve a dividend payment whereby holders can keep cash or have the cash reinvested into additional shares in the issuing company"}})

(def DSCL
  "ISO 15022 classifier for corporate actions that involve a requirement for holders or beneficial owners to disclose their name, location and holdings of any issue to the issuer"
  {:db/ident :fibo-cae-ce-15022/DSCL,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-act/DisclosureAction,
   :lcc-lr/hasTag "DSCL",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DSCL"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve a requirement for holders or beneficial owners to disclose their name, location and holdings of any issue to the issuer"}})

(def DTCH
  "ISO 15022 classifier for corporate actions involving parties wishing to acquire a security"
  {:db/ident :fibo-cae-ce-15022/DTCH,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/DutchAuction,
   :lcc-lr/hasTag "DTCH",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DTCH"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions involving parties wishing to acquire a security"}})

(def DVCA
  "ISO 15022 classifier for corporate actions that distribute cash to shareholders in proportion to their equity holding"
  {:db/ident :fibo-cae-ce-15022/DVCA,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/CashDividendAction,
   :lcc-lr/hasTag "DVCA",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/IncomeOrientedClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DVCA"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that distribute cash to shareholders in proportion to their equity holding"}})

(def DVOP
  "ISO 15022 classifier for corporate actions that involve distribution of a dividend to shareholders with a choice of benefit to receive"
  {:db/ident :fibo-cae-ce-15022/DVOP,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/DividendOptionAction,
   :lcc-lr/hasTag "DVOP",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DVOP"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve distribution of a dividend to shareholders with a choice of benefit to receive"}})

(def DVSE
  "ISO 15022 classifier for corporate actions that involve distribution of a dividend to shareholders in the form of equities of the issuing corporation"
  {:db/ident :fibo-cae-ce-15022/DVSE,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/StockDividendAction,
   :lcc-lr/hasTag "DVSE",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DVSE"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve distribution of a dividend to shareholders in the form of equities of the issuing corporation"}})

(def EXOF
  "ISO 15022 classifier for corporate actions that reflect an exchange of holdings for other securities and/or cash"
  {:db/ident :fibo-cae-ce-15022/EXOF,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/ExchangeAction,
   :lcc-lr/hasTag "EXOF",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EXOF"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that reflect an exchange of holdings for other securities and/or cash"}})

(def EXRI
  "ISO 15022 classifier for corporate actions that involve a call or exercise on nil paid securities or intermediate securities resulting from an intermediate securities distribution (RHDI)"
  {:db/ident :fibo-cae-ce-15022/EXRI,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/CallOnIntermediateSecurities,
   :lcc-lr/hasTag "EXRI",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EXRI"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve a call or exercise on nil paid securities or intermediate securities resulting from an intermediate securities distribution (RHDI)"}})

(def EXTM
  "ISO 15022 classifier for corporate actions that involve prolonging the maturity date of a bond"
  {:db/ident :fibo-cae-ce-15022/EXTM,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-fbc-dae-cre/MaturityExtension,
   :lcc-lr/hasTag "EXTM",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EXTM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve prolonging the maturity date of a bond"}})

(def EXWA
  "ISO 15022 classifier for corporate actions that offer holders the option to buy (call warrant) or to sell (put warrant) a specific amount of stock, cash, or commodity, at a predetermined price, during a predetermined period of time"
  {:db/ident :fibo-cae-ce-15022/EXWA,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/WarrantExerciseAction,
   :lcc-lr/hasTag "EXWA",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier
              :owl/NamedIndividual
              :fibo-cae-ce-act/IncomeOrientedClassifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EXWA"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that offer holders the option to buy (call warrant) or to sell (put warrant) a specific amount of stock, cash, or commodity, at a predetermined price, during a predetermined period of time"}})

(def INFO
  "ISO 15022 classifier for corporate actions involving information provided by the issuer having no accounting/financial impact on the holder"
  {:db/ident :fibo-cae-ce-15022/INFO,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-act/Notification,
   :lcc-lr/hasTag "INFO",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "INFO"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions involving information provided by the issuer having no accounting/financial impact on the holder"}})

(def INTR
  "ISO 15022 classifier for corporate actions that involve distribution of a regular interest payment to holders of an interest-bearing asset"
  {:db/ident :fibo-cae-ce-15022/INTR,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/InterestPaymentAction,
   :lcc-lr/hasTag "INTR",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/IncomeOrientedClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "INTR"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve distribution of a regular interest payment to holders of an interest-bearing asset"}})

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
  {:db/ident :fibo-cae-ce-15022/LIQU,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-act/Liquidation,
   :lcc-lr/hasTag "LIQU",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "LIQU"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions consisting of distribution of cash, assets, or both"}})

(def MCAL
  "ISO 15022 classifier for corporate actions that involve redemption of an entire issue outstanding of securities prior to maturity"
  {:db/ident :fibo-cae-ce-15022/MCAL,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/FullCallEarlyRedemptionAction,
   :lcc-lr/hasTag "MCAL",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/IncomeOrientedClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MCAL"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve redemption of an entire issue outstanding of securities prior to maturity"}})

(def MRGR
  "ISO 15022 classifier for corporate actions that involve the exchange of outstanding securities, initiated by the issuer which may include options, as the result of two or more companies combining assets, that is, an external, third party company"
  {:db/ident :fibo-cae-ce-15022/MRGR,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/PostMergerSecuritiesExchange,
   :lcc-lr/hasTag "MRGR",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MRGR"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve the exchange of outstanding securities, initiated by the issuer which may include options, as the result of two or more companies combining assets, that is, an external, third party company"}})

(def PARI
  "ISO 15022 classifier for corporate actions that occur when securities with different characteristics become identical in all respects"
  {:db/ident :fibo-cae-ce-15022/PARI,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/PariPassuAction,
   :lcc-lr/hasTag "PARI",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PARI"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that occur when securities with different characteristics become identical in all respects"}})

(def PCAL
  "ISO 15022 classifier for corporate actions that involve redemption of securities in part before their scheduled final maturity date with reduction of the nominal value of the securities"
  {:db/ident :fibo-cae-ce-15022/PCAL,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies
   :fibo-cae-ce-srca/PartialRedemptionWithReductionOfNominalValueAction,
   :lcc-lr/hasTag "PCAL",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/IncomeOrientedClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PCAL"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve redemption of securities in part before their scheduled final maturity date with reduction of the nominal value of the securities"}})

(def PRED
  "ISO 15022 classifier for corporate actions that involve redemption of securities in part before their scheduled final maturity date with no reduction in nominal value"
  {:db/ident :fibo-cae-ce-15022/PRED,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies
   :fibo-cae-ce-srca/PartialRedemptionWithoutReductionOfNominalValueAction,
   :lcc-lr/hasTag "PRED",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/IncomeOrientedClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PRED"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve redemption of securities in part before their scheduled final maturity date with no reduction in nominal value"}})

(def PRIO
  "ISO 15022 classifier for corporate actions that involve a public offer where priority is given to existing shareholders"
  {:db/ident :fibo-cae-ce-15022/PRIO,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-act/PriorityIssue,
   :lcc-lr/hasTag "PRIO",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PRIO"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve a public offer where priority is given to existing shareholders"}})

(def REDM
  "ISO 15022 classifier for corporate actions that involve redemption of an entire issue outstanding of securities at final maturity"
  {:db/ident :fibo-cae-ce-15022/REDM,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/RedemptionAtMaturityAction,
   :lcc-lr/hasTag "REDM",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/IncomeOrientedClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "REDM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve redemption of an entire issue outstanding of securities at final maturity"}})

(def REDO
  "ISO 15022 classifier for corporate actions by which the unit (currency and/or nominal) of a security is restated"
  {:db/ident :fibo-cae-ce-15022/REDO,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/RedenominationAction,
   :lcc-lr/hasTag "REDO",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "REDO"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions by which the unit (currency and/or nominal) of a security is restated"}})

(def RHDI
  "ISO 15022 classifier for corporate actions involving the distribution of intermediate securities or privilege that gives the holder the right to take part in a future event"
  {:db/ident :fibo-cae-ce-15022/RHDI,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/IntermediateSecuritiesDistribution,
   :lcc-lr/hasTag "RHDI",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "RHDI"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions involving the distribution of intermediate securities or privilege that gives the holder the right to take part in a future event"}})

(def SHPR
  "ISO 15022 classifier for corporate actions that pay shareholders an amount in cash issued from the shares premium reserve"
  {:db/ident :fibo-cae-ce-15022/SHPR,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/SharesPremiumDividendAction,
   :lcc-lr/hasTag "SHPR",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/IncomeOrientedClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SHPR"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that pay shareholders an amount in cash issued from the shares premium reserve"}})

(def SOFF
  "ISO 15022 classifier for corporate actions that involve the distribution of subsidiary stock to the shareholders of the parent company without a surrender of shares"
  {:db/ident :fibo-cae-ce-15022/SOFF,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-act/SpinOff,
   :lcc-lr/hasTag "SOFF",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SOFF"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve the distribution of subsidiary stock to the shareholders of the parent company without a surrender of shares"}})

(def SPLF
  "ISO 15022 classifier for corporate actions that involve an increase in a corporation's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split"
  {:db/ident :fibo-cae-ce-15022/SPLF,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/StockSplit,
   :lcc-lr/hasTag "SPLF",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SPLF"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve an increase in a corporation's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split"}})

(def SPLR
  "ISO 15022 classifier for corporate actions that involve a decrease in a company's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split"
  {:db/ident :fibo-cae-ce-15022/SPLR,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/ReverseStockSplit,
   :lcc-lr/hasTag "SPLR",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SPLR"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve a decrease in a company's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split"}})

(def TEND
  "ISO 15022 classifier for corporate actions involving information provided by the issuer having no accounting/financial impact on the holder"
  {:db/ident :fibo-cae-ce-15022/TEND,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/TenderOffer,
   :lcc-lr/hasTag "TEND",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "TEND"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions involving information provided by the issuer having no accounting/financial impact on the holder"}})

(def WRTH
  "ISO 15022 classifier for corporate actions that involve booking out of valueless securities"
  {:db/ident :fibo-cae-ce-15022/WRTH,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :lcc-cr/classifies :fibo-cae-ce-srca/WorthlessSecurityAction,
   :lcc-lr/hasTag "WRTH",
   :lcc-lr/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type [:owl/NamedIndividual
              :fibo-cae-ce-act/IncomeOrientedClassifier
              :fibo-cae-ce-act/BusinessStrategyClassifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "WRTH"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve booking out of valueless securities"}})