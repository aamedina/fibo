(ns net.wikipunk.rdf.fibo-cae-ce-srca
  "This ontology defines the kinds of income and corporate action events covered by ISO 15022 and other standards, including recent extensions to those standards. Scope has been limited to security-related events and actions, and excludes most notification and meetings related events."
  {:cmns-av/copyright "Copyright (c) 2016-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :dcterms/abstract
   "This ontology defines the kinds of income and corporate action events covered by ISO 15022 and other standards, including recent extensions to those standards. Scope has been limited to security-related events and actions, and excludes most notification and meetings related events.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/LegalCapacity/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/Bonds/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/CAE/CorporateEvents/CorporateActions/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Equities/EquityInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Lifecycles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/TemporalCore/SecurityTradingStatuses/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/CreditEvents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-cae-ce-act"
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
    "fibo-cae-ce-srca"
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
    "fibo-fbc-dae-cre"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-arr-doc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
    "fibo-fnd-arr-lif"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
    "fibo-fnd-law-lcap"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-md-temx-trs"
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/",
    "fibo-sec-dbt-bnd"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/",
    "fibo-sec-eq-eq"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-cae-ce-srca",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Security-related Corporate Actions Ontology"}})

(def BondDefaultAction
  "corporate action which indicates a failure by the issuer to perform obligations defined as default events under the bond agreement and that have not been remedied"
  {:db/ident :fibo-cae-ce-srca/BondDefaultAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bond default event"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/appliesTo,
                      :owl/someValuesFrom :fibo-sec-dbt-bnd/Bond,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-dae-cre/ObligationDefault
                     :fibo-cae-ce-act/MandatoryCorporateAction],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action which indicates a failure by the issuer to perform obligations defined as default events under the bond agreement and that have not been remedied"}})

(def BonusIssue
  "corporate action in which security holders are awarded additional assets free of payment from the issuer in proportion to their holding"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "There are different taxation rules for the bonus issue compared to the dividend. There could also be a difference in the ranking of the shares that are given to what the holder already holds. Dividends are paid from current profits and bonus may be from accumulated reserves of the company. A scrip issue is the issue of new shares at no charge pro rata to the holder of existing shares."},
   :cmns-av/synonym [{:rdf/language "en",
                      :rdf/value    "scrip issue"}
                     {:rdf/language "en",
                      :rdf/value    "capitalisation issue"}],
   :db/ident :fibo-cae-ce-srca/BonusIssue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bonus issue"},
   :rdfs/subClassOf :fibo-cae-ce-act/MandatoryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action in which security holders are awarded additional assets free of payment from the issuer in proportion to their holding"}})

(def BonusRightsIssue
  "A Rights Issue in which the rights are given to the holders of the referenced shares for free."
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Rights = right to buy shares at a specified price. May be given the right for nothing (Bonus Rights Issue) or you may be offered to purchase that right at a subscription price (which you take up or don't). Bonus Rights Issue: given the option for free. May exercise at the Exercise Price."},
   :db/ident :fibo-cae-ce-srca/BonusRightsIssue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bonus rights issue"},
   :rdfs/subClassOf :fibo-cae-ce-srca/IntermediateSecuritiesDistribution,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A Rights Issue in which the rights are given to the holders of the referenced shares for free."}})

(def BonusSharePlanDistribution
  "Event in which shares are issued from the Share Premium Reserve of the company and are considered as a capital distribution rather than a disbursement of income, with different tax implications. SWIFT Definition (adapted above) \"Typically found in Australia, shares are issued from the Share Premium Reserve of the company and are considered as a capital distribution rather than a disbursement of income, with different tax implications.\" To be researches further. There are certainly Share Plans in Australia, where you can take a dividend as shares. Thewse would be in the nature of Bonus Shares. They are a tradeoff from cash dividends. Other terms to model: A \"Scheme of Arrangment\" - does this change the capital reserves or is it just another word for restructure. An arrangement with the company's debtors, and coule potentially change the capital base by converting the debt to shares (see other diagram note with these in)."
  {:db/ident :fibo-cae-ce-srca/BonusSharePlanDistribution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bonus share plan distribution"},
   :rdfs/subClassOf :fibo-cae-ce-srca/CapitalDistribution,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Event in which shares are issued from the Share Premium Reserve of the company and are considered as a capital distribution rather than a disbursement of income, with different tax implications. SWIFT Definition (adapted above) \"Typically found in Australia, shares are issued from the Share Premium Reserve of the company and are considered as a capital distribution rather than a disbursement of income, with different tax implications.\" To be researches further. There are certainly Share Plans in Australia, where you can take a dividend as shares. Thewse would be in the nature of Bonus Shares. They are a tradeoff from cash dividends. Other terms to model: A \"Scheme of Arrangment\" - does this change the capital reserves or is it just another word for restructure. An arrangement with the company's debtors, and coule potentially change the capital base by converting the debt to shares (see other diagram note with these in)."}})

(def CallOnIntermediateSecurities
  "corporate action that involves a call or exercise on nil paid securities or intermediate securities resulting from an intermediate securities distribution (RHDI)"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This code is used for the second event, when an intermediate securities' issue (rights/coupons) is composed of two events, the first event being the distribution of intermediate securities."},
   :db/ident :fibo-cae-ce-srca/CallOnIntermediateSecurities,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "call on intermediate securities"},
   :rdfs/subClassOf :fibo-cae-ce-act/MandatoryWithChoiceCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action that involves a call or exercise on nil paid securities or intermediate securities resulting from an intermediate securities distribution (RHDI)"}})

(def CancellationOfShares
  "The cancellation of shares. Further Notes Only possible with shares not publicly issued i.e. treasury shares"
  {:db/ident :fibo-cae-ce-srca/CancellationOfShares,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cancellation of shares"},
   :rdfs/subClassOf :fibo-cae-ce-act/CorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The cancellation of shares. Further Notes Only possible with shares not publicly issued i.e. treasury shares"}})

(def CapitalDistribution
  "corporate action that pays shareholders an amount in cash issued from the issuer's capital account"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This action does not result in a reduction of the face value of a share or in a change to the number of shares in circulation."},
   :db/ident :fibo-cae-ce-srca/CapitalDistribution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "capital distribution"},
   :rdfs/subClassOf :fibo-cae-ce-act/VoluntaryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action that pays shareholders an amount in cash issued from the issuer's capital account"}})

(def CapitalGainsDistribution
  "corporate action that distributes profits resulting from the sale of company assets to shareholders"
  {:db/ident :fibo-cae-ce-srca/CapitalGainsDistribution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "capital gains distribution"},
   :rdfs/subClassOf :fibo-cae-ce-act/VoluntaryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action that distributes profits resulting from the sale of company assets to shareholders"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Shareholders of Mutual Funds, Unit Trusts, or SICAVs are recipients of capital gains distributions which are often reinvested in additional shares of the fund"}})

(def CashDividendAction
  "corporate action that distributes cash to shareholders in proportion to their equity holding"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Ordinary dividends are typically recurring and regular. The shareholder must take cash, and may be offered a choice of currency."},
   :db/ident :fibo-cae-ce-srca/CashDividendAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cash dividend action"},
   :rdfs/subClassOf :fibo-cae-ce-act/MandatoryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action that distributes cash to shareholders in proportion to their equity holding"}})

(def ChangeOfSecurityTradingStatusEvent
  "An event in which the trading status of a tradable security changes."
  {:db/ident :fibo-cae-ce-srca/ChangeOfSecurityTradingStatusEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "change of security trading status event"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/appliesTo,
                      :owl/someValuesFrom
                      :fibo-md-temx-trs/SecurityTradingStatus,
                      :rdf/type :owl/Restriction}
                     :fibo-cae-ce-srca/CorporateChangeOfStatusEvent],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An event in which the trading status of a tradable security changes."}})

(def ChangeToSmallestNegotiableUnit
  "Modification of the smallest negotiable unit of shares in order to obtain a new negotiable unit. SWIFT:SMAL"
  {:db/ident :fibo-cae-ce-srca/ChangeToSmallestNegotiableUnit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "change to smallest negotiable unit"},
   :rdfs/subClassOf :fibo-cae-ce-act/CorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Modification of the smallest negotiable unit of shares in order to obtain a new negotiable unit. SWIFT:SMAL"}})

(def ConversionAction
  "corporate action involving conversion of securities (generally convertible bonds or preferred shares) into another form of securities (usually common shares) at a pre-stated price/ratio"
  {:db/ident :fibo-cae-ce-srca/ConversionAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "conversion action"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-cae-ce-srca/convertsTo,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-cae-ce-srca/convertsFrom,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-cae-ce-act/VoluntaryCorporateAction],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action involving conversion of securities (generally convertible bonds or preferred shares) into another form of securities (usually common shares) at a pre-stated price/ratio"}})

(def ConversionSuspensionAction
  "Suspension of conversion of securities, generally a couple of weeks before a meeting takes place. SWIFT = SCOP"
  {:db/ident :fibo-cae-ce-srca/ConversionSuspensionAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "conversion suspension action"},
   :rdfs/subClassOf :fibo-cae-ce-act/CorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Suspension of conversion of securities, generally a couple of weeks before a meeting takes place. SWIFT = SCOP"}})

(def CorporateActionObligation
  "An obligation related to the holding of a Security."
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Delivery of a security. Not defining direction at this level of the model - one party may have an obligation to deliver security or to pay; other party may have an obligation to deliver or to pay. Or there may be just one."},
   :db/ident :fibo-cae-ce-srca/CorporateActionObligation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "corporate action obligation"},
   :rdfs/subClassOf [:fibo-fnd-law-lcap/Duty :fibo-cae-ce-act/CorporateAction],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An obligation related to the holding of a Security."}})

(def CorporateActionPaymentObligation
  "corporate action payment obligation"
  {:db/ident :fibo-cae-ce-srca/CorporateActionPaymentObligation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "corporate action payment obligation"},
   :rdfs/subClassOf :fibo-cae-ce-srca/CorporateActionObligation})

(def CorporateActionSecuritiesDeliveryObligation
  "Some obligation to deliver some security in the thr context of corporate actions. All cash proceeds and security proceeds can be represented a s acontractual obligation. Where does that obligation arise? Usually in the Contract itself - but there may be other answers to this. Defines what has to be delivered. or paid. Entitlement meanwhile is a calculation based on the Contract."
  {:db/ident :fibo-cae-ce-srca/CorporateActionSecuritiesDeliveryObligation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value "corporate action securities delivery obligation"},
   :rdfs/subClassOf :fibo-cae-ce-srca/CorporateActionObligation,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Some obligation to deliver some security in the thr context of corporate actions. All cash proceeds and security proceeds can be represented a s acontractual obligation. Where does that obligation arise? Usually in the Contract itself - but there may be other answers to this. Defines what has to be delivered. or paid. Entitlement meanwhile is a calculation based on the Contract."}})

(def CorporateChangeOfStatusEvent
  "Some change to the status of some security."
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This is generally described by a corporate event message. For example, change in trading status, listing status."},
   :db/ident :fibo-cae-ce-srca/CorporateChangeOfStatusEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "corporate change of status event"},
   :rdfs/subClassOf [:fibo-fnd-arr-lif/LifecycleEvent
                     :fibo-cae-ce-act/CorporateAction],
   :skos/definition {:rdf/language "en",
                     :rdf/value "Some change to the status of some security."}})

(def CouponStrip
  "Coupon stripping is the process whereby interest coupons for future payment dates are separated from the security corpus that entitles the holder to the principal repayment."
  {:db/ident :fibo-cae-ce-srca/CouponStrip,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "coupon strip"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/appliesTo,
                      :owl/someValuesFrom :fibo-sec-dbt-bnd/Bond,
                      :rdf/type           :owl/Restriction}
                     :fibo-cae-ce-act/CorporateAction],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Coupon stripping is the process whereby interest coupons for future payment dates are separated from the security corpus that entitles the holder to the principal repayment."}})

(def DecreaseInValueAction
  "corporate action resulting in a reduction of face value of a share or the value of fund assets"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The number of circulating shares/units remains unchanged. This event may include a cash pay out to holders."},
   :db/ident :fibo-cae-ce-srca/DecreaseInValueAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "decrease in value action"},
   :rdfs/subClassOf :fibo-cae-ce-act/MandatoryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action resulting in a reduction of face value of a share or the value of fund assets"}})

(def DividendOptionAction
  "corporate action that involves distribution of a dividend to shareholders with a choice of benefit to receive"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Shareholders may choose to receive shares or cash. A dividend option action is distinguished from reinvestment (DRIP) as, like a cash dividend, the company creates new share capital in exchange for the dividend rather than investing the dividend in the market."},
   :db/ident :fibo-cae-ce-srca/DividendOptionAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dividend option action"},
   :rdfs/subClassOf :fibo-cae-ce-act/MandatoryWithChoiceCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action that involves distribution of a dividend to shareholders with a choice of benefit to receive"}})

(def DividendReinvestmentAction
  "corporate action that involves a dividend payment whereby holders can keep cash or have the cash reinvested into additional shares in the issuing company"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Dividend reinvestment is distinguished from a cash dividend in that the issuer invests the dividend in the market rather than creating new share capital in exchange for the dividend."},
   :db/ident :fibo-cae-ce-srca/DividendReinvestmentAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dividend reinvestment action"},
   :rdfs/subClassOf :fibo-cae-ce-act/MandatoryWithChoiceCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action that involves a dividend payment whereby holders can keep cash or have the cash reinvested into additional shares in the issuing company"}})

(def Drawing
  "Redemption in part before the scheduled final maturity date of a security."
  {:cmns-av/explanatoryNote {:rdf/language "en",
                             :rdf/value
                             "Notification in advance of this happening."},
   :db/ident :fibo-cae-ce-srca/Drawing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "drawing"},
   :rdfs/subClassOf :fibo-cae-ce-act/MandatoryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Redemption in part before the scheduled final maturity date of a security."}})

(def DutchAuction
  "corporate action by a party wishing to acquire a security"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Holders of the security are invited to make an offer to sell, within a specific price range. The acquiring party will buy from the holder with lowest offer."},
   :db/ident :fibo-cae-ce-srca/DutchAuction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dutch auction"},
   :rdfs/subClassOf :fibo-cae-ce-act/VoluntaryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "corporate action by a party wishing to acquire a security"}})

(def ExchangeAction
  "corporate action that reflects an exchange of holdings for other securities and/or cash"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The exchange can be either mandatory or voluntary involving the exchange of outstanding securities for different securities and/or cash. For example, 'exchange offer', 'capital reorganisation' or 'funds separation'."},
   :db/ident :fibo-cae-ce-srca/ExchangeAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "exchange action"},
   :rdfs/subClassOf :fibo-cae-ce-act/CorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action that reflects an exchange of holdings for other securities and/or cash"}})

(def FormalOffer
  "corporate action involving an offer to a holder, potential holder, or other intersted party, to enter into a trade which is or would be legally binding on the part of the party making the offer (the offeror)."
  {:db/ident :fibo-cae-ce-srca/FormalOffer,
   :owl/equivalentClass {:owl/unionOf [:fibo-cae-ce-srca/DutchAuction
                                       :fibo-cae-ce-srca/ExchangeAction
                                       :fibo-cae-ce-srca/RepurchaseOffer
                                       :fibo-cae-ce-srca/TenderOffer],
                         :rdf/type    :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "formal offer"},
   :rdfs/subClassOf :fibo-cae-ce-act/VoluntaryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action involving an offer to a holder, potential holder, or other intersted party, to enter into a trade which is or would be legally binding on the part of the party making the offer (the offeror)."}})

(def FullCallEarlyRedemptionAction
  "corporate action that involves redemption of an entire issue outstanding of securities prior to maturity"
  {:db/ident :fibo-cae-ce-srca/FullCallEarlyRedemptionAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "full call early redemption action"},
   :rdfs/subClassOf :fibo-cae-ce-act/MandatoryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action that involves redemption of an entire issue outstanding of securities prior to maturity"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Examples securities that may be subject to a full call/early redemption include bonds, preferred equity, funds, that may be redeemed by the issuer or its agent before final maturity."}})

(def InterestPaymentAction
  "corporate action that involves distribution of a regular interest payment to holders of an interest-bearing asset"
  {:db/ident :fibo-cae-ce-srca/InterestPaymentAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "interest payment action"},
   :rdfs/subClassOf :fibo-cae-ce-act/MandatoryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action that involves distribution of a regular interest payment to holders of an interest-bearing asset"},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Further notes: Are there options on the Holder? Yes, you can opt to be paid in a certain currency. It is not always defined in the security terms. So if the Terms in the Security terms sheet gives you an option, there is a choice for the Holder at this point. Such choices would include: - Currency - Pay in Kind (\"Spinoff\" or PiK - see PiK corporate Action) Could be mandatory. If there were an option then the letter announcing it would require a response. This is usually stated in the message. Is there a message even if there is no option? Yes. Usually have to generate the events artificially as the Servicing organization. you can't rely on a feed or message coming in but because it is part of the security contract the above has to generate at the expected time, and arrange the payments. Q: That is the point at there was a choice you would expect to see a message, or end up still having to generate it but with the choices. A: The ones with Choices come as announcements and don't ave to be generated by the Service. Older definitin (re-scoped now: An Event in which a payment occurs. Anything can have a payment event. If a thing hits a pay date, whether it's voluntary or mandatory, that's a payment event. Divide into: Securities Cash Combination Payment or Distribution? Are these exclusive? Take an event that's always a combination of options, and an option is a combination of payouts. Generates transactions - determine what txns happen when a customer chooses that option. Distribution / delivery: generic concept Payment - implis cash distribution. So payment is specialization of distribution."}})

(def InterestPaymentInKind
  "Interest payment, in any kind except cash, distributed to holders of an interest bearing asset. SWIFT = PINK"
  {:db/ident :fibo-cae-ce-srca/InterestPaymentInKind,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "interest payment in kind"},
   :rdfs/subClassOf :fibo-cae-ce-srca/InterestPaymentAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Interest payment, in any kind except cash, distributed to holders of an interest bearing asset. SWIFT = PINK"}})

(def InterestPaymentWithPrincipal
  "A payment of a portion of the principal of an interest bearing asset, in addition to the interest payment. SWIFT = PRII"
  {:db/ident :fibo-cae-ce-srca/InterestPaymentWithPrincipal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "interest payment with principal"},
   :rdfs/subClassOf :fibo-cae-ce-srca/InterestPaymentAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A payment of a portion of the principal of an interest bearing asset, in addition to the interest payment. SWIFT = PRII"}})

(def InterestRateAdjustment
  "Scheduled change to the coupon rate for a floating or adjustable rate security."
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The SWIFT definition as given defines the notification of the interest rate change, not the adjustment. Adjusted to describe the event. REVIEW: Is this really an action? Usually consider that it's expected. Given definition was for the announcement. SWIFT full definition \"Announcement of the current coupon rate for a floating or adjustable rate security.\""},
   :db/ident :fibo-cae-ce-srca/InterestRateAdjustment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "interest rate adjustment"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/appliesTo,
                      :owl/someValuesFrom :fibo-sec-dbt-bnd/VariableCouponBond,
                      :rdf/type           :owl/Restriction}
                     :fibo-cae-ce-act/MandatoryCorporateAction],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Scheduled change to the coupon rate for a floating or adjustable rate security."}})

(def IntermediateSecuritiesDistribution
  "corporate action involving the distribution of intermediate securities or privilege that gives the holder the right to take part in a future event"
  {:cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "rights distribution"},
   :db/ident :fibo-cae-ce-srca/IntermediateSecuritiesDistribution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "intermediate securities distribution"},
   :rdfs/subClassOf :fibo-cae-ce-act/MandatoryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action involving the distribution of intermediate securities or privilege that gives the holder the right to take part in a future event"}})

(def ListingStatusDelistingMessage
  "Security is no longer able to comply with the listing requirements of a stock exchange and is removed from official board quotation."
  {:db/ident :fibo-cae-ce-srca/ListingStatusDelistingMessage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "listing status delisting message"},
   :rdfs/subClassOf :fibo-fnd-arr-doc/Notice,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Security is no longer able to comply with the listing requirements of a stock exchange and is removed from official board quotation."}})

(def OddLotOffer
  "Offer by issuer to allow holders of an odd lot of a security to order a commission-free transaction at market price, to sell the odd lot, or to buy an amount of shares which will bring the position to a round lot (board lot). SWIFT = ODLT"
  {:db/ident :fibo-cae-ce-srca/OddLotOffer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "odd lot offer"},
   :rdfs/subClassOf :fibo-cae-ce-act/VoluntaryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Offer by issuer to allow holders of an odd lot of a security to order a commission-free transaction at market price, to sell the odd lot, or to buy an amount of shares which will bring the position to a round lot (board lot). SWIFT = ODLT"}})

(def PariPassuAction
  "corporate action that occurs when securities with different characteristics become identical in all respects"
  {:cmns-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "The term, pari-passu, means 'at the same rate or on an equal footing', and in finance is used to describe situations where two or more assets, securities, creditors, or obligations are equally managed without preference. An example of pari-passu occurs during bankruptcy proceedings: When the court reaches a verdict, the court regards all creditors equally, and the trustee will repay them the same fractional amount as other creditors and at the same time."}
    {:rdf/language "en",
     :rdf/value
     "A pari-passu event includes cases, for example, when shares with different entitlements to dividend or voting rights become equivalent through assimilation or pari-passu. Such an event may be scheduled in advance, for example, when shares resulting from a bonus may become fungible after a pre-set period of time, or may result from outside events, for example, merger, reorganisation, issue of supplementary tranches, etc."}],
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "assimilation"},
   :db/ident :fibo-cae-ce-srca/PariPassuAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pari-passu action"},
   :rdfs/subClassOf :fibo-cae-ce-act/MandatoryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action that occurs when securities with different characteristics become identical in all respects"}})

(def PartialRedemptionWithReductionOfNominalValueAction
  "corporate action that involves redemption of securities in part before their scheduled final maturity date with reduction of the nominal value of the securities"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The outstanding amount of securities will be reduced proportionally. May be mandatory or voluntary."},
   :db/ident
   :fibo-cae-ce-srca/PartialRedemptionWithReductionOfNominalValueAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "partial redemption with reduction of nominal value action"},
   :rdfs/subClassOf :fibo-cae-ce-act/CorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action that involves redemption of securities in part before their scheduled final maturity date with reduction of the nominal value of the securities"}})

(def PartialRedemptionWithoutReductionOfNominalValueAction
  "corporate action that involves redemption of securities in part before their scheduled final maturity date with no reduction in nominal value"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This is commonly done by pool factor reduction. May be mandatory or voluntary."},
   :db/ident
   :fibo-cae-ce-srca/PartialRedemptionWithoutReductionOfNominalValueAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "partial redemption without reduction of nominal value action"},
   :rdfs/subClassOf :fibo-cae-ce-act/CorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action that involves redemption of securities in part before their scheduled final maturity date with no reduction in nominal value"}})

(def PostMergerSecuritiesExchange
  "corporate action that involves the exchange of outstanding securities, initiated by the issuer which may include options, as the result of two or more companies combining assets, that is, an external, third party company"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This is an action as a result of the merger, not the merger itself, and may be mandatory or voluntary. Cash payments may accompany share exchange."},
   :db/ident :fibo-cae-ce-srca/PostMergerSecuritiesExchange,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "post-merger securities exchange"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-cae-ce-srca/convertsTo,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-cae-ce-srca/convertsFrom,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fnd-acc-cur/hasMonetaryAmount,
                      :rdf/type       :owl/Restriction}
                     :fibo-cae-ce-act/CorporateAction],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action that involves the exchange of outstanding securities, initiated by the issuer which may include options, as the result of two or more companies combining assets, that is, an external, third party company"}})

(def PutRedemptionAction
  "corporate action involving early redemption of a security at the election of the holder subject to the terms and condition of the issue with no reduction in nominal value"
  {:db/ident :fibo-cae-ce-srca/PutRedemptionAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "put redemption action"},
   :rdfs/subClassOf :fibo-cae-ce-act/VoluntaryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action involving early redemption of a security at the election of the holder subject to the terms and condition of the issue with no reduction in nominal value"}})

(def RedemptionAtMaturityAction
  "corporate action that involves redemption of an entire issue outstanding of securities at final maturity"
  {:db/ident :fibo-cae-ce-srca/RedemptionAtMaturityAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "redemption at maturity action"},
   :rdfs/subClassOf :fibo-cae-ce-act/MandatoryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action that involves redemption of an entire issue outstanding of securities at final maturity"}})

(def RedenominationAction
  "corporate action by which the unit (currency and/or nominal) of a security is restated"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "For example, the nominal/par value of security in a national currency is restated in another currency."},
   :db/ident :fibo-cae-ce-srca/RedenominationAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "redenomination action"},
   :rdfs/subClassOf :fibo-cae-ce-act/MandatoryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action by which the unit (currency and/or nominal) of a security is restated"}})

(def RepurchaseOffer
  "corporate action in which an offer is made to existing shareholders by the issuing company to repurchase equity or other securities convertible into equity"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The objective of the offer is to reduce the number of outstanding equities."},
   :cmns-av/synonym [{:rdf/language "en",
                      :rdf/value    "reverse rights"}
                     {:rdf/language "en",
                      :rdf/value    "issuer bid"}],
   :db/ident :fibo-cae-ce-srca/RepurchaseOffer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "repurchase offer"},
   :rdfs/subClassOf :fibo-cae-ce-act/VoluntaryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action in which an offer is made to existing shareholders by the issuing company to repurchase equity or other securities convertible into equity"}})

(def ReverseStockSplit
  "corporate action involving a decrease in a company's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value    "Equity price and nominal value are increased accordingly."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "change in nominal value"},
   :db/ident :fibo-cae-ce-srca/ReverseStockSplit,
   :owl/disjointWith :fibo-cae-ce-srca/StockSplit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "reverse stock split"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/appliesTo,
                      :owl/someValuesFrom :fibo-sec-eq-eq/Share,
                      :rdf/type           :owl/Restriction}
                     :fibo-cae-ce-act/MandatoryCorporateAction],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action involving a decrease in a company's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split"}})

(def RightsExerciseEvent
  "Exercising the right to purchase the shares. Furhter Notes: This is an action on the part of the holder. SWIFT: Call/exercise on nil-paid securities/rights resulting from a rights distribution (RHDI) (To be used for the second event in case rights issue is dealt with in 2 events, first event being the RHDI)."
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "There is a rights trading period overlaps with rights subscriptiuon period (you can trade the rights) Rights exercise period - expiry date. Some time after the expiry the new shares are distributed. This is the distribution."},
   :db/ident :fibo-cae-ce-srca/RightsExerciseEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "rights exercise event"},
   :rdfs/subClassOf :fibo-cae-ce-act/CorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Exercising the right to purchase the shares. Furhter Notes: This is an action on the part of the holder. SWIFT: Call/exercise on nil-paid securities/rights resulting from a rights distribution (RHDI) (To be used for the second event in case rights issue is dealt with in 2 events, first event being the RHDI)."}})

(def SharesPremiumDividendAction
  "corporate action that pays shareholders an amount in cash issued from the shares premium reserve"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "It is similar to a dividend but with different tax implications."},
   :db/ident :fibo-cae-ce-srca/SharesPremiumDividendAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "shares premium dividend action"},
   :rdfs/subClassOf :fibo-cae-ce-act/MandatoryWithChoiceCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action that pays shareholders an amount in cash issued from the shares premium reserve"}})

(def StockDividendAction
  "corporate action that involves distribution of a dividend to shareholders in the form of equities of the issuing corporation"
  {:db/ident :fibo-cae-ce-srca/StockDividendAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "stock dividend action"},
   :rdfs/subClassOf :fibo-cae-ce-act/MandatoryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action that involves distribution of a dividend to shareholders in the form of equities of the issuing corporation"}})

(def StockSplit
  "corporate action involving an increase in a corporation's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value    "Equity price and nominal value are reduced accordingly."},
   :cmns-av/synonym [{:rdf/language "en",
                      :rdf/value    "subdivision"}
                     {:rdf/language "en",
                      :rdf/value    "change in nominal value"}],
   :db/ident :fibo-cae-ce-srca/StockSplit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "stock split"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/appliesTo,
                      :owl/someValuesFrom :fibo-sec-eq-eq/Share,
                      :rdf/type           :owl/Restriction}
                     :fibo-cae-ce-act/MandatoryCorporateAction],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action involving an increase in a corporation's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split"}})

(def TenderOffer
  "corporate action involving an offer made to shareholders, normally by a third party, requesting them to sell (tender) or exchange their equities"
  {:cmns-av/synonym [{:rdf/language "en",
                      :rdf/value    "buyback"}
                     {:rdf/language "en",
                      :rdf/value    "purchase offer"}
                     {:rdf/language "en",
                      :rdf/value    "acquisition"}
                     {:rdf/language "en",
                      :rdf/value    "takeover"}],
   :db/ident :fibo-cae-ce-srca/TenderOffer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tender offer"},
   :rdfs/subClassOf [:fibo-cae-ce-act/VoluntaryCorporateAction
                     {:owl/onProperty     :fibo-fnd-rel-rel/appliesTo,
                      :owl/someValuesFrom :fibo-sec-eq-eq/Share,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action involving an offer made to shareholders, normally by a third party, requesting them to sell (tender) or exchange their equities"}})

(def TradingStatusActiveMessage
  "Trading in security has commenced or security has been re-activated after a supsension in trading."
  {:db/ident :fibo-cae-ce-srca/TradingStatusActiveMessage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "trading status active message"},
   :rdfs/subClassOf :fibo-cae-ce-srca/TradingStatusMessage,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Trading in security has commenced or security has been re-activated after a supsension in trading."}})

(def TradingStatusMessage
  "A message about trading status."
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "There are a number of such messages. Events v Status: See e.g. Active: this relates to one state OR two transitions (transition from pre-issuance to Trading, or from Suspended to Trading)."},
   :db/ident :fibo-cae-ce-srca/TradingStatusMessage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "trading status message"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-arr-doc/isAbout,
                      :owl/someValuesFrom
                      :fibo-md-temx-trs/SecurityTradingStatus,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-arr-doc/Notice],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A message about trading status."}})

(def TradingStatusSuspendedMessage
  "Trading in the security has been suspended."
  {:db/ident :fibo-cae-ce-srca/TradingStatusSuspendedMessage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "trading status suspended message"},
   :rdfs/subClassOf :fibo-cae-ce-srca/TradingStatusMessage,
   :skos/definition {:rdf/language "en",
                     :rdf/value "Trading in the security has been suspended."}})

(def WarrantExerciseAction
  "corporate action that offers holders the option to buy (call warrant) or to sell (put warrant) a specific amount of stock, cash, or commodity, at a predetermined price, during a predetermined period of time (which usually corresponds to the life of the issue)"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Note that participation by the warrant holder may be mandatory or voluntary and may involve a choice in the mandatory case."},
   :db/ident :fibo-cae-ce-srca/WarrantExerciseAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "warrant exercise action"},
   :rdfs/subClassOf :fibo-cae-ce-act/CorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action that offers holders the option to buy (call warrant) or to sell (put warrant) a specific amount of stock, cash, or commodity, at a predetermined price, during a predetermined period of time (which usually corresponds to the life of the issue)"}})

(def WorthlessSecurityAction
  "corporate action that involves booking out of valueless securities"
  {:db/ident :fibo-cae-ce-srca/WorthlessSecurityAction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "worthless security action"},
   :rdfs/subClassOf :fibo-cae-ce-act/MandatoryCorporateAction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "corporate action that involves booking out of valueless securities"}})

(def convertsFrom
  "converts from"
  {:db/ident :fibo-cae-ce-srca/convertsFrom,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-cae-ce-act/CorporateAction,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "converts from"},
   :rdfs/range :fibo-fbc-fi-fi/Security})

(def convertsTo
  "converts to"
  {:db/ident :fibo-cae-ce-srca/convertsTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-cae-ce-act/CorporateAction,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "converts to"},
   :rdfs/range :fibo-fbc-fi-fi/Security})

(def ^{:private true} MaturityExtension
  {:db/ident        :fibo-fbc-dae-cre/MaturityExtension,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :fibo-cae-ce-act/CorporateAction})