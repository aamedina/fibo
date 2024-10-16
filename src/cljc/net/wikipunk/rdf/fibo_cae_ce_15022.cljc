(ns net.wikipunk.rdf.fibo-cae-ce-15022
  {:cmns-av/copyright "Copyright (c) 2016-2024 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :dcterms/abstract
   "This ontology includes the codes for income and corporate action events as specified in ISO 15022, including extensions as of 3 September 2020. Scope excludes lower-level notification and meetings related events and message definitions associated with ISO 15022 as well as related messages covered by ISO 20022.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :namespaces
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
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/CAE/CorporateEvents/CorporateActions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/CAE/CorporateEvents/SecurityRelatedCorporateActions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/DebtAndEquities/CreditEvents/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-cae-ce-15022",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value "ISO 15022 Corporate Action Individuals Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"})

(def BIDS
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/BIDS,
   :fibo-fnd-rel-rel/hasTag "BIDS",
   :rdf/type #{:fibo-cae-ce-act/BusinessStrategyClassifier
               {:owl/allValuesFrom :fibo-cae-ce-srca/RepurchaseOffer,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction} :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "BIDS"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions in which an offer is made to existing shareholders by the issuing company to repurchase equity or other securities convertible into equity"}})

(def BONU
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/BONU,
   :fibo-fnd-rel-rel/hasTag "BONU",
   :rdf/type #{:fibo-cae-ce-act/BusinessStrategyClassifier
               {:owl/allValuesFrom :fibo-cae-ce-srca/BonusIssue,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction} :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "BONU"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions in which security holders are awarded additional assets free of payment from the issuer in proportion to their holding"}})

(def BPUT
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/BPUT,
   :fibo-fnd-rel-rel/hasTag "BPUT",
   :rdf/type #{{:owl/allValuesFrom :fibo-cae-ce-srca/PutRedemptionAction,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction}
               :fibo-cae-ce-act/BusinessStrategyClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "BPUT"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve early redemption of a security at the election of the holder subject to the terms and condition of the issue with no reduction in nominal value"}})

(def CAPD
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/CAPD,
   :fibo-fnd-rel-rel/hasTag "CAPD",
   :rdf/type #{{:owl/allValuesFrom :fibo-cae-ce-srca/CapitalDistribution,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction}
               :fibo-cae-ce-act/IncomeOrientedClassifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CAPD"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that pay shareholders an amount in cash issued from the issuer's capital account"}})

(def CAPG
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/CAPG,
   :fibo-fnd-rel-rel/hasTag "CAPG",
   :rdf/type #{:fibo-cae-ce-act/IncomeOrientedClassifier
               {:owl/allValuesFrom :fibo-cae-ce-srca/CapitalGainsDistribution,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction} :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CAPG"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that distribute profits resulting from the sale of company assets to shareholders"}})

(def CHAN
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/CHAN,
   :fibo-fnd-rel-rel/hasTag "CHAN",
   :rdf/type #{{:owl/allValuesFrom :fibo-cae-ce-act/ChangeAction,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction}
               :fibo-cae-ce-act/BusinessStrategyClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CHAN"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that disseminate information regarding a change further described in the corporate action details"}})

(def CLSA
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/CLSA,
   :fibo-fnd-rel-rel/hasTag "CLSA",
   :rdf/type #{{:owl/allValuesFrom :fibo-cae-ce-act/ClassAction,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction}
               :fibo-cae-ce-act/BusinessStrategyClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CLSA"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions involving a situation where interested parties seek restitution for financial loss"}})

(def CONS
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/CONS,
   :fibo-fnd-rel-rel/hasTag "CONS",
   :rdf/type #{{:owl/allValuesFrom :fibo-cae-ce-act/ConsentSolicitation,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction}
               :fibo-cae-ce-act/BusinessStrategyClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CONS"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve procedures aiming to obtain consent of holder to a proposal by the issuer or a third party without convening a meeting"}})

(def CONV
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/CONV,
   :fibo-fnd-rel-rel/hasTag "CONV",
   :rdf/type #{:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual
               {:owl/allValuesFrom :fibo-cae-ce-srca/ConversionAction,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction}},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CONV"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve conversion of securities (generally convertible bonds or preferred shares) into another form of securities (usually common shares) at a pre-stated price/ratio"}})

(def DECR
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/DECR,
   :fibo-fnd-rel-rel/hasTag "DECR",
   :rdf/type #{{:owl/allValuesFrom :fibo-cae-ce-srca/DecreaseInValueAction,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction}
               :fibo-cae-ce-act/IncomeOrientedClassifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DECR"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that reduce the face value of a share or the value of fund assets"}})

(def DFLT
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/DFLT,
   :fibo-fnd-rel-rel/hasTag "DFLT",
   :rdf/type #{{:owl/allValuesFrom :fibo-cae-ce-srca/BondDefaultAction,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction}
               :fibo-cae-ce-act/BusinessStrategyClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DFLT"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that indicate a failure by the issuer to perform obligations defined as default events under the bond agreement and that have not been remedied"}})

(def DRIP
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/DRIP,
   :fibo-fnd-rel-rel/hasTag "DRIP",
   :rdf/type #{{:owl/allValuesFrom :fibo-cae-ce-srca/DividendReinvestmentAction,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction}
               :fibo-cae-ce-act/BusinessStrategyClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DRIP"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve a dividend payment whereby holders can keep cash or have the cash reinvested into additional shares in the issuing company"}})

(def DSCL
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/DSCL,
   :fibo-fnd-rel-rel/hasTag "DSCL",
   :rdf/type #{:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual
               {:owl/allValuesFrom :fibo-cae-ce-act/DisclosureAction,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction}},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DSCL"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve a requirement for holders or beneficial owners to disclose their name, location and holdings of any issue to the issuer"}})

(def DTCH
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/DTCH,
   :fibo-fnd-rel-rel/hasTag "DTCH",
   :rdf/type #{:fibo-cae-ce-act/BusinessStrategyClassifier
               {:owl/allValuesFrom :fibo-cae-ce-srca/DutchAuction,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction} :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DTCH"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions involving parties wishing to acquire a security"}})

(def DVCA
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/DVCA,
   :fibo-fnd-rel-rel/hasTag "DVCA",
   :rdf/type #{:fibo-cae-ce-act/IncomeOrientedClassifier :owl/NamedIndividual
               {:owl/allValuesFrom :fibo-cae-ce-srca/CashDividendAction,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction}},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DVCA"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that distribute cash to shareholders in proportion to their equity holding"}})

(def DVOP
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/DVOP,
   :fibo-fnd-rel-rel/hasTag "DVOP",
   :rdf/type #{:fibo-cae-ce-act/BusinessStrategyClassifier
               {:owl/allValuesFrom :fibo-cae-ce-srca/DividendOptionAction,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction} :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DVOP"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve distribution of a dividend to shareholders with a choice of benefit to receive"}})

(def DVSE
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/DVSE,
   :fibo-fnd-rel-rel/hasTag "DVSE",
   :rdf/type #{{:owl/allValuesFrom :fibo-cae-ce-srca/StockDividendAction,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction}
               :fibo-cae-ce-act/BusinessStrategyClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DVSE"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve distribution of a dividend to shareholders in the form of equities of the issuing corporation"}})

(def EXOF
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/EXOF,
   :fibo-fnd-rel-rel/hasTag "EXOF",
   :rdf/type #{{:owl/allValuesFrom :fibo-cae-ce-srca/ExchangeAction,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction}
               :fibo-cae-ce-act/BusinessStrategyClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EXOF"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that reflect an exchange of holdings for other securities and/or cash"}})

(def EXRI
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/EXRI,
   :fibo-fnd-rel-rel/hasTag "EXRI",
   :rdf/type #{:fibo-cae-ce-act/BusinessStrategyClassifier
               {:owl/allValuesFrom
                :fibo-cae-ce-srca/CallOnIntermediateSecurities,
                :owl/onProperty :cmns-cls/classifies,
                :rdf/type :owl/Restriction} :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EXRI"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve a call or exercise on nil paid securities or intermediate securities resulting from an intermediate securities distribution (RHDI)"}})

(def EXTM
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/EXTM,
   :fibo-fnd-rel-rel/hasTag "EXTM",
   :rdf/type #{{:owl/allValuesFrom :fibo-fbc-dae-cre/MaturityExtension,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction}
               :fibo-cae-ce-act/BusinessStrategyClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EXTM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve prolonging the maturity date of a bond"}})

(def EXWA
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/EXWA,
   :fibo-fnd-rel-rel/hasTag "EXWA",
   :rdf/type #{:fibo-cae-ce-act/IncomeOrientedClassifier
               :fibo-cae-ce-act/BusinessStrategyClassifier
               {:owl/allValuesFrom :fibo-cae-ce-srca/WarrantExerciseAction,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction} :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EXWA"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that offer holders the option to buy (call warrant) or to sell (put warrant) a specific amount of stock, cash, or commodity, at a predetermined price, during a predetermined period of time"}})

(def INFO
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/INFO,
   :fibo-fnd-rel-rel/hasTag "INFO",
   :rdf/type #{:fibo-cae-ce-act/BusinessStrategyClassifier
               {:owl/allValuesFrom :fibo-cae-ce-act/Notification,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction} :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "INFO"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions involving information provided by the issuer having no accounting/financial impact on the holder"}})

(def INTR
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/INTR,
   :fibo-fnd-rel-rel/hasTag "INTR",
   :rdf/type #{:fibo-cae-ce-act/IncomeOrientedClassifier
               {:owl/allValuesFrom :fibo-cae-ce-srca/InterestPaymentAction,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction} :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "INTR"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve distribution of a regular interest payment to holders of an interest-bearing asset"}})

(def ISO15022CorporateActionClassificationScheme
  {:db/ident :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :rdf/type #{:owl/NamedIndividual
               :fibo-cae-ce-act/ActionClassificationScheme},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label "ISO 15022 corporate action classification scheme",
   :skos/definition
   "scheme for classifying corporate actions according to ISO 15022 Securities - Scheme for Messages (Data Field Dictionary)"})

(def LIQU
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/LIQU,
   :fibo-fnd-rel-rel/hasTag "LIQU",
   :rdf/type #{{:owl/allValuesFrom :fibo-cae-ce-act/Liquidation,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction}
               :fibo-cae-ce-act/BusinessStrategyClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "LIQU"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions consisting of distribution of cash, assets, or both"}})

(def MCAL
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/MCAL,
   :fibo-fnd-rel-rel/hasTag "MCAL",
   :rdf/type #{:fibo-cae-ce-act/IncomeOrientedClassifier
               {:owl/allValuesFrom
                :fibo-cae-ce-srca/FullCallEarlyRedemptionAction,
                :owl/onProperty :cmns-cls/classifies,
                :rdf/type :owl/Restriction} :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MCAL"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve redemption of an entire issue outstanding of securities prior to maturity"}})

(def MRGR
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/MRGR,
   :fibo-fnd-rel-rel/hasTag "MRGR",
   :rdf/type #{:fibo-cae-ce-act/BusinessStrategyClassifier
               {:owl/allValuesFrom
                :fibo-cae-ce-srca/PostMergerSecuritiesExchange,
                :owl/onProperty :cmns-cls/classifies,
                :rdf/type :owl/Restriction} :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MRGR"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve the exchange of outstanding securities, initiated by the issuer which may include options, as the result of two or more companies combining assets, that is, an external, third party company"}})

(def PARI
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/PARI,
   :fibo-fnd-rel-rel/hasTag "PARI",
   :rdf/type #{:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual
               {:owl/allValuesFrom :fibo-cae-ce-srca/PariPassuAction,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction}},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PARI"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that occur when securities with different characteristics become identical in all respects"}})

(def PCAL
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/PCAL,
   :fibo-fnd-rel-rel/hasTag "PCAL",
   :rdf/type
   #{{:owl/allValuesFrom
      :fibo-cae-ce-srca/PartialRedemptionWithReductionOfNominalValueAction,
      :owl/onProperty :cmns-cls/classifies,
      :rdf/type :owl/Restriction} :fibo-cae-ce-act/IncomeOrientedClassifier
     :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PCAL"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve redemption of securities in part before their scheduled final maturity date with reduction of the nominal value of the securities"}})

(def PRED
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/PRED,
   :fibo-fnd-rel-rel/hasTag "PRED",
   :rdf/type
   #{:fibo-cae-ce-act/IncomeOrientedClassifier
     {:owl/allValuesFrom
      :fibo-cae-ce-srca/PartialRedemptionWithoutReductionOfNominalValueAction,
      :owl/onProperty :cmns-cls/classifies,
      :rdf/type :owl/Restriction} :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PRED"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve redemption of securities in part before their scheduled final maturity date with no reduction in nominal value"}})

(def PRIO
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/PRIO,
   :fibo-fnd-rel-rel/hasTag "PRIO",
   :rdf/type #{:fibo-cae-ce-act/BusinessStrategyClassifier
               {:owl/allValuesFrom :fibo-cae-ce-act/PriorityIssue,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction} :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PRIO"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve a public offer where priority is given to existing shareholders"}})

(def REDM
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/REDM,
   :fibo-fnd-rel-rel/hasTag "REDM",
   :rdf/type #{:fibo-cae-ce-act/IncomeOrientedClassifier
               {:owl/allValuesFrom :fibo-cae-ce-srca/RedemptionAtMaturityAction,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction} :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "REDM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve redemption of an entire issue outstanding of securities at final maturity"}})

(def REDO
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/REDO,
   :fibo-fnd-rel-rel/hasTag "REDO",
   :rdf/type #{:fibo-cae-ce-act/BusinessStrategyClassifier
               {:owl/allValuesFrom :fibo-cae-ce-srca/RedenominationAction,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction} :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "REDO"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions by which the unit (currency and/or nominal) of a security is restated"}})

(def RHDI
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/RHDI,
   :fibo-fnd-rel-rel/hasTag "RHDI",
   :rdf/type
   #{{:owl/allValuesFrom :fibo-cae-ce-srca/IntermediateSecuritiesDistribution,
      :owl/onProperty    :cmns-cls/classifies,
      :rdf/type          :owl/Restriction}
     :fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "RHDI"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions involving the distribution of intermediate securities or privilege that gives the holder the right to take part in a future event"}})

(def SHPR
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/SHPR,
   :fibo-fnd-rel-rel/hasTag "SHPR",
   :rdf/type #{{:owl/allValuesFrom
                :fibo-cae-ce-srca/SharesPremiumDividendAction,
                :owl/onProperty :cmns-cls/classifies,
                :rdf/type :owl/Restriction}
               :fibo-cae-ce-act/IncomeOrientedClassifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SHPR"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that pay shareholders an amount in cash issued from the shares premium reserve"}})

(def SOFF
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/SOFF,
   :fibo-fnd-rel-rel/hasTag "SOFF",
   :rdf/type #{:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual
               {:owl/allValuesFrom :fibo-cae-ce-act/SpinOff,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction}},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SOFF"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve the distribution of subsidiary stock to the shareholders of the parent company without a surrender of shares"}})

(def SPLF
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/SPLF,
   :fibo-fnd-rel-rel/hasTag "SPLF",
   :rdf/type #{{:owl/allValuesFrom :fibo-cae-ce-srca/StockSplit,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction}
               :fibo-cae-ce-act/BusinessStrategyClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SPLF"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve an increase in a corporation's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split"}})

(def SPLR
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/SPLR,
   :fibo-fnd-rel-rel/hasTag "SPLR",
   :rdf/type #{{:owl/allValuesFrom :fibo-cae-ce-srca/ReverseStockSplit,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction}
               :fibo-cae-ce-act/BusinessStrategyClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SPLR"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve a decrease in a company's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split"}})

(def TEND
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/TEND,
   :fibo-fnd-rel-rel/hasTag "TEND",
   :rdf/type #{:fibo-cae-ce-act/BusinessStrategyClassifier :owl/NamedIndividual
               {:owl/allValuesFrom :fibo-cae-ce-srca/TenderOffer,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction}},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "TEND"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions involving information provided by the issuer having no accounting/financial impact on the holder"}})

(def WRTH
  {:cmns-col/isMemberOf
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :cmns-dsg/isDefinedIn
   :fibo-cae-ce-15022/ISO15022CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-15022/WRTH,
   :fibo-fnd-rel-rel/hasTag "WRTH",
   :rdf/type #{{:owl/allValuesFrom :fibo-cae-ce-srca/WorthlessSecurityAction,
                :owl/onProperty    :cmns-cls/classifies,
                :rdf/type          :owl/Restriction}
               :fibo-cae-ce-act/IncomeOrientedClassifier
               :fibo-cae-ce-act/BusinessStrategyClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "WRTH"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ISO 15022 classifier for corporate actions that involve booking out of valueless securities"}})

(def urn:uuid:86d872f3-9cb5-5f8a-a10f-12c4275e4dc2
  {:cmns-av/copyright "Copyright (c) 2016-2024 EDM Council, Inc.",
   :dcterms/abstract
   "This ontology includes the codes for income and corporate action events as specified in ISO 15022, including extensions as of 3 September 2020. Scope excludes lower-level notification and meetings related events and message definitions associated with ISO 15022 as well as related messages covered by ISO 20022.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/CAE/CorporateEvents/CorporateActions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/CAE/CorporateEvents/SecurityRelatedCorporateActions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/DebtAndEquities/CreditEvents/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value "ISO 15022 Corporate Action Individuals Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/"})