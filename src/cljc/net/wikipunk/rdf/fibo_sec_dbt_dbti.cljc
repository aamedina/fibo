(ns net.wikipunk.rdf.fibo-sec-dbt-dbti
  {:cmns-av/copyright
   #{"Copyright (c) 2016-2024 EDM Council, Inc."
     "Copyright (c) 2018-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/DebtInstruments/",
   :dcterms/abstract
   "This ontology defines concepts that are specific to debt instruments (tradable and non-tradable).",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-qtu" "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fbc-dae-gty"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fbc-fi-ip"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-dt-bd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-dt-oc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-ir-ir"
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
    "fibo-sec-dbt-dbti"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/",
    "fibo-sec-sec-iss"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/BusinessDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/SecuritiesIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/InstrumentPricing/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/EconomicIndicators/EconomicIndicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/DebtAndEquities/Guaranty/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/InterestRates/InterestRates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Agreements/Contracts/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/DebtInstruments/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-dbt-dbti",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/",
   :rdfs/label "Debt Instruments Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments.rdf version of this ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments.rdf version of this ontology was modified to reflect use of actualExpression as an annotation rather than datatype property, to deprecate maturity-related properties which have been moved to financial instruments more generally, and to simplify restrictions on tradable debt instrument."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments.rdf version of this ontology was modified to move the property, hasMaturityDate, to Financial Instruments, since a maturity date can apply to a preferred share in addition to a debt instrument or offering rename 'mayBeSubordinatedTo', which violates the policy related to masquerading properties, eliminate a circular definition and unnecessary references to external sources, eliminate call price and put price, which are overreaching and confusing, in favor of monetary price, and eliminate the restriction for hasTimeToMaturity from debt instrument, made redundant by the broader restriction in financial instruments."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments.rdf version of this ontology was modified to correct the declaration of the property 'has estate or death put feature' to remove an erroneous subproperty relationship and integrate the instrument pricing ontology."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments.rdf version of this ontology was modified to generalize the definition of fixed income security."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments.rdf version of this ontology was modified to reflect a change to make redemption provision a child of contractual commitment and move it to financial instruments, as such provisions apply to preferred shares and other instruments in addition to debt, and eliminate non-tradable and tradable debt instrument redemption provisions, which are synonymous, and adjust the hierarchy for call feature, notification provision, and put feature accordingly."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments.rdf version of this ontology was modified to move the property, 'is conferred on' to the Legal Capacity ontology and to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380) and to augment the ontology with details regarding schedules for interest rate calculations, payment calculations, rate resets and the like (FBC-317)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments.rdf version of this ontology was modified to make hasDefaultLotSize a subproperty of hasLotSize."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments.rdf version of this ontology was modified to support integration of the bonds ontology."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"})

(def AtADiscount
  {:cmns-av/synonym "below par",
   :db/ident :fibo-sec-dbt-dbti/AtADiscount,
   :rdf/type #{:fibo-sec-dbt-dbti/RelativePrice :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "at a discount",
   :skos/definition
   "a selling price that is less than the face or nominal value"})

(def AtAPremium
  {:cmns-av/synonym #{"premium" "above par"},
   :db/ident :fibo-sec-dbt-dbti/AtAPremium,
   :rdf/type #{:fibo-sec-dbt-dbti/RelativePrice :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "at a premium",
   :skos/definition
   "a selling price significantly above the stated face or redemption value due to high demand or timing of redemption"})

(def CallEvent
  {:db/ident :fibo-sec-dbt-dbti/CallEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "call event",
   :rdfs/subClassOf :fibo-sec-dbt-dbti/RedemptionEvent,
   :skos/definition
   "an event associated with the call schedule for a debt instrument"})

(def CallFeature
  {:cmns-av/explanatoryNote
   "Most corporate and municipal bonds have ten-year call features (termed call protection by holders); government securities typically have none.",
   :cmns-av/synonym "call provision",
   :db/ident :fibo-sec-dbt-dbti/CallFeature,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "call feature",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom :fibo-sec-dbt-dbti/CallSchedule,
      :rdf/type           :owl/Restriction} :fibo-fbc-fi-fi/RedemptionProvision
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-sec-dbt-dbti/CallNotificationProvision,
      :owl/onProperty :fibo-sec-dbt-dbti/hasNotificationProvision,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "redemption provision defining the rights of the issuer to buy back a security at a call price after a call protection period"})

(def CallNotificationProvision
  {:db/ident :fibo-sec-dbt-dbti/CallNotificationProvision,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "call notification provision",
   :rdfs/subClassOf #{{:owl/allValuesFrom :fibo-sec-dbt-dbti/CallWindow,
                       :owl/onProperty    :cmns-dt/hasDatePeriod,
                       :rdf/type          :owl/Restriction}
                      :fibo-sec-dbt-dbti/NotificationProvision},
   :skos/definition
   "provision of a call feature defining notification requirements"})

(def CallPremium
  {:db/ident :fibo-sec-dbt-dbti/CallPremium,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "call premium",
   :rdfs/subClassOf :fibo-fnd-acc-cur/MonetaryPrice,
   :skos/definition
   "the price over par paid by an issuer to redeem securities when exercising a call provision"})

(def CallSchedule
  {:db/ident :fibo-sec-dbt-dbti/CallSchedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "call schedule",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom :fibo-sec-dbt-dbti/CallEvent,
      :rdf/type           :owl/Restriction} :fibo-fnd-dt-fd/Schedule
     {:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom {:owl/unionOf [:fibo-sec-dbt-dbti/CallPremium
                                         :fibo-fnd-acc-cur/MonetaryPrice],
                           :rdf/type    :owl/Class},
      :rdf/type           :owl/Restriction}},
   :skos/definition "a schedule of call prices and when they are in effect"})

(def CallWindow
  {:db/ident :fibo-sec-dbt-dbti/CallWindow,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "call window",
   :rdfs/subClassOf :cmns-dt/DatePeriod,
   :skos/definition
   "an explicit period of time prior to a call date during which an issuer or agent must give notice to holders"})

(def DebtOffering
  {:db/ident :fibo-sec-dbt-dbti/DebtOffering,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "debt offering",
   :rdfs/subClassOf #{:fibo-sec-sec-iss/SecuritiesOffering
                      {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/DebtInstrument,
                       :rdf/type           :owl/Restriction}},
   :skos/definition "an offering of one or more debt instruments for sale"})

(def FixedIncomeSecurity
  {:cmns-av/explanatoryNote
   "Fixed income securities provide payments according to a regular schedule. This does not necessarily mean that the payments themselves are of a fixed amount, however.",
   :db/ident :fibo-sec-dbt-dbti/FixedIncomeSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "fixed income security",
   :rdfs/subClassOf :fibo-sec-dbt-dbti/TradableDebtInstrument,
   :skos/definition
   "tradeable debt instrument that provides a return in the form of fixed periodic payments and typically the return of principal at maturity"})

(def FullyIndexedInterestRate
  {:cmns-av/explanatoryNote
   "Fully indexed interest rates are used for variable rate credit products. The interest rate on a variable (adjustable) rate mortgage corresponds to a specific benchmark (often the prime rate, but sometimes LIBOR, the one-year constant-maturity Treasury, or other benchmarks) plus a spread (also called the margin. The margin on a fully indexed interest rate product is determined by the underwriter and based on the borrower's credit quality.",
   :db/ident :fibo-sec-dbt-dbti/FullyIndexedInterestRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "fully-indexed interest rate",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-ind-ir-ir/BaseRate,
                       :owl/onProperty :cmns-qtu/hasArgument,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-fbc-dae-dbt/FloatingInterestRate
                      :cmns-qtu/Expression
                      {:owl/onProperty     :cmns-qtu/hasArgument,
                       :owl/someValuesFrom :fibo-sec-dbt-dbti/Margin,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "a variable interest rate that is calculated by adding a margin to a specified index rate"})

(def InterestOnlyStrip
  {:cmns-av/explanatoryNote
   "An interest-only strip holder is interested in rising rates and no prepayment, as prepayment would cause them forfeit future interest payments and receive nothing from the return of the principal.",
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "IO strip"},
   :db/ident :fibo-sec-dbt-dbti/InterestOnlyStrip,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "interest-only strip"},
   :rdfs/subClassOf :fibo-sec-dbt-dbti/Strip,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a strip that represents the non-principal portion of the monthly payments on the underlying debt instrument, such as a bond"},
   :skos/example
   "An interest-only strip can be reintegrated into other synthetic or engineered products. For example, interest-only strips can be pooled to create or make up a portion of a larger collateralized mortgage obligation (CMO), asset-backed security (ABS) or collateralized debt obligation (CDO) structure."})

(def IssuedDebt
  {:db/ident :fibo-sec-dbt-dbti/IssuedDebt,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "issued debt",
   :rdfs/subClassOf #{{:owl/allValuesFrom :fibo-fnd-acc-cur/MonetaryAmount,
                       :owl/onProperty    :fibo-fbc-dae-dbt/hasDebtAmount,
                       :rdf/type          :owl/Restriction}
                      :fibo-fbc-dae-dbt/Debt
                      {:owl/allValuesFrom :fibo-fbc-fi-fi/DebtInstrument,
                       :owl/onProperty    :fibo-fnd-rel-rel/isConferredBy,
                       :rdf/type          :owl/Restriction}},
   :skos/definition
   "debt that is set out by the borrower in some form of financial security in which the lender is the holder or counterparty of that security"})

(def MakeWholeFeature
  {:cmns-av/explanatoryNote
   "The issuer typically has to make a lump sum payment to the investor derived from a formula based on the net present value (NPV) of future interest or coupon payments that will not be paid incrementally because of the call combined with the principal payment the investor would have received at maturity.",
   :cmns-av/synonym "make whole provision",
   :db/ident :fibo-sec-dbt-dbti/MakeWholeFeature,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "make whole feature",
   :rdfs/subClassOf :fibo-sec-dbt-dbti/CallFeature,
   :skos/definition
   "a call provision allowing the issuer to pay off remaining debt early"})

(def Margin
  {:cmns-av/synonym "spread",
   :db/ident :fibo-sec-dbt-dbti/Margin,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "margin",
   :rdfs/subClassOf :cmns-qtu/Variable,
   :skos/definition
   "a variable that is added to a specified index rate to determine the fully indexed interest rate charged to a borrower on a credit balance"})

(def NonTradableDebtInstrument
  {:cmns-av/explanatoryNote
   "Generally, a nonnegotiable instrument may be redeemed by the issuer, but this is often subject to some limitations.",
   :db/ident :fibo-sec-dbt-dbti/NonTradableDebtInstrument,
   :owl/disjointWith :fibo-sec-dbt-dbti/TradableDebtInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "non-tradable debt instrument",
   :rdfs/subClassOf
   #{:fibo-fnd-agr-ctr/MutualContractualAgreement
     {:owl/onProperty     :fibo-sec-dbt-dbti/hasRelativePriceAtRedemption,
      :owl/someValuesFrom :fibo-sec-dbt-dbti/RelativePrice,
      :rdf/type           :owl/Restriction} :fibo-fbc-fi-fi/DebtInstrument
     {:owl/onProperty     :fibo-sec-dbt-dbti/hasRelativePriceAtIssue,
      :owl/someValuesFrom :fibo-sec-dbt-dbti/RelativePrice,
      :rdf/type           :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-fi-fi/RedemptionProvision,
      :owl/onProperty :fibo-fbc-fi-fi/hasRedemptionProvision,
      :rdf/type       :owl/Restriction}},
   :skos/definition "a debt instrument that may not be bought or sold",
   :skos/example
   "Low-risk instruments such as savings bonds are examples of nonnegotiable debt instruments."})

(def NotificationProvision
  {:db/ident :fibo-sec-dbt-dbti/NotificationProvision,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "notification provision",
   :rdfs/subClassOf #{{:owl/allValuesFrom :cmns-dt/DatePeriod,
                       :owl/onProperty    :cmns-dt/hasDatePeriod,
                       :rdf/type          :owl/Restriction}
                      :fibo-fbc-fi-fi/RedemptionProvision},
   :skos/definition
   "provision of a redemption feature defining notification requirements"})

(def ParValue
  {:cmns-av/synonym #{"nominal value" "par" "face value"},
   :db/ident :fibo-sec-dbt-dbti/ParValue,
   :rdf/type #{:fibo-sec-dbt-dbti/RelativePrice :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "par value",
   :skos/definition
   "the stated value of a negotiable instrument, stock, or bond, as compared with the value that instrument might receive when sold"})

(def PrescriptiveEvent
  {:db/ident :fibo-sec-dbt-dbti/PrescriptiveEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "prescriptive event",
   :rdfs/subClassOf :fibo-fnd-dt-oc/OccurrenceKind,
   :skos/definition
   "event related to the imposition or enforcement of a rule, method, formula, etc."})

(def PrincipalOnlyStrip
  {:db/ident :fibo-sec-dbt-dbti/PrincipalOnlyStrip,
   :owl/disjointWith :fibo-sec-dbt-dbti/InterestOnlyStrip,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "principal-only strip"},
   :rdfs/subClassOf :fibo-sec-dbt-dbti/Strip,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a strip that represents the principal portion of the monthly payments on the underlying debt instrument, such as a bond"}})

(def PubliclyIssuedDebt
  {:db/ident :fibo-sec-dbt-dbti/PubliclyIssuedDebt,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "publicly issued debt",
   :rdfs/subClassOf #{:fibo-sec-dbt-dbti/IssuedDebt
                      {:owl/allValuesFrom
                       :fibo-sec-dbt-dbti/TradableDebtInstrument,
                       :owl/onProperty :fibo-fnd-rel-rel/isConferredBy,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "an issued debt in the form of a tradable debt instrument (security)"})

(def PutEvent
  {:db/ident :fibo-sec-dbt-dbti/PutEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "put event",
   :rdfs/subClassOf :fibo-sec-dbt-dbti/RedemptionEvent,
   :skos/definition
   "an event associated with the put schedule for a debt instrument, i.e., an event involving the 'put', or surrender of the instrument by the holder"})

(def PutFeature
  {:cmns-av/synonym "put provision",
   :db/ident :fibo-sec-dbt-dbti/PutFeature,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "put feature",
   :rdfs/subClassOf
   #{:fibo-fbc-dae-dbt/DebtTerms
     {:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom :fibo-sec-dbt-dbti/PutSchedule,
      :rdf/type           :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-sec-dbt-dbti/PutNotificationProvision,
      :owl/onProperty :fibo-sec-dbt-dbti/hasNotificationProvision,
      :rdf/type       :owl/Restriction} :fibo-fbc-fi-fi/RedemptionProvision},
   :skos/definition
   "redemption provision giving the holder the right, but not the obligation, to sell a specified amount of the debt instrument (i.e., redeem it), prior to maturity",
   :skos/editorialNote
   "FIBIM has term \"Putable Date\" which (by implication, and comparing with definition for \"Next Call Date\") is presumably a single calendar date in the future, at a given point in time. That does not cover the definition of formal terms defining when and how the issue may be put, which is what is modeled here."})

(def PutNotificationProvision
  {:db/ident :fibo-sec-dbt-dbti/PutNotificationProvision,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "put notification provision",
   :rdfs/subClassOf #{{:owl/allValuesFrom :fibo-sec-dbt-dbti/PutWindow,
                       :owl/onProperty    :cmns-dt/hasDatePeriod,
                       :rdf/type          :owl/Restriction}
                      :fibo-sec-dbt-dbti/NotificationProvision},
   :skos/definition
   "a provision of a put feature defining notification requirements"})

(def PutPremium
  {:db/ident :fibo-sec-dbt-dbti/PutPremium,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "put premium",
   :rdfs/subClassOf :fibo-fnd-acc-cur/MonetaryPrice,
   :skos/definition
   "an amount over par that a debt instrument holder must pay to sell the security early"})

(def PutSchedule
  {:db/ident :fibo-sec-dbt-dbti/PutSchedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "put schedule",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom :fibo-sec-dbt-dbti/PutEvent,
      :rdf/type           :owl/Restriction} :fibo-fnd-dt-fd/Schedule
     {:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom {:owl/unionOf [:fibo-sec-dbt-dbti/PutPremium
                                         :fibo-fnd-acc-cur/MonetaryPrice],
                           :rdf/type    :owl/Class},
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "a schedule that defines the events associated with the put feature of a debt instrument, i.e, the dates on which the debt instrument may be sold at what price by the holder"})

(def PutWindow
  {:db/ident :fibo-sec-dbt-dbti/PutWindow,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "put window",
   :rdfs/subClassOf :cmns-dt/DatePeriod,
   :skos/definition
   "an explicit period of time prior to a put date during which holder or agent must give notice to an issuer"})

(def RedemptionEvent
  {:db/ident :fibo-sec-dbt-dbti/RedemptionEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "redemption event",
   :rdfs/subClassOf :fibo-sec-dbt-dbti/PrescriptiveEvent,
   :skos/definition
   "a prescriptive event involving the return of an investor's principal in a fixed-income security, such as a preferred stock or bond, or the sale of units in a mutual fund"})

(def RelativePrice
  {:db/ident :fibo-sec-dbt-dbti/RelativePrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "relative price",
   :rdfs/subClassOf :fibo-fbc-fi-ip/SecurityPrice,
   :skos/definition
   "security price specified in comparison with either a stated or market value for a debt instrument at some point in time"})

(def StepEvent
  {:db/ident :fibo-sec-dbt-dbti/StepEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "step event",
   :rdfs/subClassOf #{:fibo-fnd-dt-oc/CalculationEvent
                      :fibo-sec-dbt-dbti/PrescriptiveEvent},
   :skos/definition
   "event that prescribes a change in a contractual term, such as a rate or notional amount, for a given contract"})

(def StepSchedule
  {:db/ident :fibo-sec-dbt-dbti/StepSchedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "step schedule",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-col/comprises,
                       :owl/someValuesFrom :fibo-sec-dbt-dbti/StepEvent,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-dt-fd/Schedule},
   :skos/definition
   "schedule specifying the date(s) and change in a contractual term(s), e.g., rate or notional amount, for a contract that has a feature where stipulated changes occur at specified intervals or on specified dates"})

(def Strip
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "STRIPS is an acronym for Separate Trading of Registered Interest and Principal of Securities, which has come to be used as a term in its own right."},
   :cmns-av/synonym
   {:rdf/language "en",
    :rdf/value
    "Separate Trading of Registered Interest and Principal of Securities"},
   :db/ident :fibo-sec-dbt-dbti/Strip,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "strip"},
   :rdfs/subClassOf :fibo-sec-dbt-dbti/FixedIncomeSecurity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a tradeable debt instrument created either through the process of removing coupons from a bond and then selling the separate parts as a zero coupon bond and an interest paying coupon bond or through taking the opposite position from some variant in the options market"}})

(def TradableDebtInstrument
  {:cmns-av/explanatoryNote
   "Details from Ecofin: A [debt] instrument can be traded, if its features depend only on one borrower. If the instrument has no bilateral or multilateral obligations, the investor can easily transfer it to another investor without asking the borrower (except the terms prohibit this explicitly). This is simplified with securitised instruments, where the debt is already split into handy denominations which trade easily (e.g. in round thousands or millions as with bonds, commercial paper, etc.). But in principle it works also with interbank loans and similar instruments. FIBIM Definition: Financial instruments evidencing moneys owed by the issuer to the holder on terms as specified.",
   :db/ident :fibo-sec-dbt-dbti/TradableDebtInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "tradable debt instrument",
   :rdfs/subClassOf #{:fibo-fbc-fi-fi/Security
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fbc-dae-gty/Guarantor,
                       :owl/onProperty :fibo-fbc-dae-gty/hasGuarantor,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass :fibo-sec-dbt-dbti/TradableDebtInstrument,
                       :owl/onProperty :fibo-sec-dbt-dbti/isSubordinatedTo,
                       :rdf/type :owl/Restriction}
                      :fibo-fbc-fi-fi/DebtInstrument},
   :skos/definition
   "a debt instrument that is also a security, i.e., that can be bought and sold by the holder"})

(def VariableIncomeSecurity
  {:cmns-av/explanatoryNote
   "Variable-income securities provide investors with both greater risks as well as rewards.",
   :db/ident :fibo-sec-dbt-dbti/VariableIncomeSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "variable income security",
   :rdfs/subClassOf :fibo-sec-dbt-dbti/TradableDebtInstrument,
   :skos/definition
   "tradeable debt instrument that provide their owners with a rate of return that is dynamic and determined by market forces"})

(def allowsAutoReinvestment
  {:db/ident :fibo-sec-dbt-dbti/allowsAutoReinvestment,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-dae-dbt/InterestPaymentTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "allows auto-reinvestment",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether the security allows automatically re-investing the interest on that security towards purchasing additional shares or units of the same security"})

(def allowsPaymentInKind
  {:db/ident :fibo-sec-dbt-dbti/allowsPaymentInKind,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-fi-fi/RedemptionProvision,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "allows payment in kind",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether the principal may be repaid in kind (i.e., replaced with another instrument) rather than in cash"})

(def hasCallFeature
  {:db/ident :fibo-sec-dbt-dbti/hasCallFeature,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:fibo-sec-dbt-dbti/DebtOffering
                               :fibo-fbc-fi-fi/DebtInstrument],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "has call feature",
   :rdfs/range :fibo-sec-dbt-dbti/CallFeature,
   :rdfs/subPropertyOf :fibo-sec-dbt-dbti/hasRepaymentTerms,
   :skos/definition
   "indicates the specific terms related to any inherent call feature as specified in the offering/instrument"})

(def hasDatedDate
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Investors who purchase a fixed-income security between interest payment dates must also pay the seller or issuer any interest that has accrued from the dated date to the purchase date, or settlement date, in addition to the face value."},
   :db/ident :fibo-sec-dbt-dbti/hasDatedDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-dae-dbt/InterestPaymentTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "has dated date",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf :cmns-dt/hasExplicitDate,
   :skos/definition
   "specifies the date on which interest begins to accrue on a fixed-income security"})

(def hasDefaultLotSize
  {:cmns-av/explanatoryNote
   "This is the minimum denomination required for transfer or change of ownership of a tradable debt security.",
   :db/ident :fibo-sec-dbt-dbti/hasDefaultLotSize,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain {:owl/unionOf [:fibo-sec-dbt-dbti/DebtOffering
                               :fibo-fbc-fi-fi/DebtInstrument],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "has default lot size",
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :fibo-fbc-fi-ip/hasLotSize,
   :skos/definition
   "indicates the default number of units of the security that may be held at any one time"})

(def hasEstateOrDeathPutFeature
  {:db/ident :fibo-sec-dbt-dbti/hasEstateOrDeathPutFeature,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-dbt-dbti/PutFeature,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "has estate or death put feature",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates that a security is subject to redemption upon the passing of the holder"})

(def hasInterestPaymentTerms
  {:db/ident :fibo-sec-dbt-dbti/hasInterestPaymentTerms,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "has interest payment terms",
   :rdfs/range :fibo-fbc-dae-dbt/InterestPaymentTerms,
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasContractualElement,
   :skos/definition
   "indicates the specific terms related to interest payments on the principal as specified in the instrument or a related contract document"})

(def hasNotificationProvision
  {:db/ident :fibo-sec-dbt-dbti/hasNotificationProvision,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/RedemptionProvision,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "has notification provision",
   :rdfs/range :fibo-sec-dbt-dbti/NotificationProvision,
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasContractualElement,
   :skos/definition
   "relates the redemption provision of a debt instrument to a notification provision (e.g., call or put notification)"})

(def hasPoolNumber
  {:db/ident :fibo-sec-dbt-dbti/hasPoolNumber,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-dbt-dbti/PubliclyIssuedDebt,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "has pool number",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :cmns-qtu/hasNumericValue,
   :skos/definition "indicates the pool number of the debt"})

(def hasPriceAndYieldDayCountConvention
  {:db/ident :fibo-sec-dbt-dbti/hasPriceAndYieldDayCountConvention,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "has price and yield day count convention",
   :rdfs/range :fibo-fbc-dae-dbt/DayCountConvention,
   :rdfs/subPropertyOf :fibo-fnd-dt-bd/hasBusinessRecurrenceIntervalConvention,
   :skos/definition
   "indicates the convention used to determine the number of days in a month and days in a year that are counted when performing calculations for yield and price figures"})

(def hasPutFeature
  {:db/ident :fibo-sec-dbt-dbti/hasPutFeature,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:fibo-sec-dbt-dbti/DebtOffering
                               :fibo-fbc-fi-fi/DebtInstrument],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "has put feature",
   :rdfs/range :fibo-sec-dbt-dbti/PutFeature,
   :rdfs/subPropertyOf :fibo-sec-dbt-dbti/hasRepaymentTerms,
   :skos/definition
   "indicates the specific terms related to any inherent put feature as specified in the offering/instrument"})

(def hasRelativePriceAtIssue
  {:db/ident :fibo-sec-dbt-dbti/hasRelativePriceAtIssue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "has relative price at issue",
   :rdfs/range :fibo-sec-dbt-dbti/RelativePrice,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasPrice,
   :skos/definition
   "indicates a relative price with respect to the face value at which an instrument is issued, namely par, premium or discount"})

(def hasRelativePriceAtMaturity
  {:db/ident :fibo-sec-dbt-dbti/hasRelativePriceAtMaturity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "has relative price at maturity",
   :rdfs/range :fibo-sec-dbt-dbti/RelativePrice,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasPrice,
   :skos/definition
   "indicates a relative price with respect to the face value at the time an instrument matures, namely par, discount or premium"})

(def hasRelativePriceAtRedemption
  {:db/ident :fibo-sec-dbt-dbti/hasRelativePriceAtRedemption,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "has relative price at redemption",
   :rdfs/range :fibo-sec-dbt-dbti/RelativePrice,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasPrice,
   :skos/definition
   "indicates a relative price with respect to the face value at the time an instrument is redeemed, namely par, discount or premium"})

(def hasRepaymentTerms
  {:db/ident :fibo-sec-dbt-dbti/hasRepaymentTerms,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "has repayment terms",
   :rdfs/range :fibo-fbc-dae-dbt/PrincipalRepaymentTerms,
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasContractualElement,
   :skos/definition
   "indicates the specific terms related to repayment of principal as specified in the instrument or a related contract document"})

(def hasRightToRetain
  {:db/ident :fibo-sec-dbt-dbti/hasRightToRetain,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-dbt-dbti/PutFeature,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "right to retain",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether the holder has an option to retain the security in the event of an issuer exercising the put feature"})

(def isCallable
  {:db/ident :fibo-sec-dbt-dbti/isCallable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain {:owl/unionOf [:fibo-sec-dbt-dbti/DebtOffering
                               :fibo-fbc-fi-fi/DebtInstrument],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "is callable",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether the issuer (writer) of the debt contract (the debtor) can call the debt prior to maturity"})

(def isExchangeable
  {:db/ident :fibo-sec-dbt-dbti/isExchangeable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain {:owl/unionOf [:fibo-sec-dbt-dbti/DebtOffering
                               :fibo-fbc-fi-fi/DebtInstrument],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "is exchangeable",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether the security can be exchanged for another security at the issuers discretion"})

(def isExtendableByHolder
  {:db/ident :fibo-sec-dbt-dbti/isExtendableByHolder,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-fi-fi/RedemptionProvision,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "is extendable by holder",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether the expiration date or maturity date can be extended by the holder"})

(def isExtendableByIssuer
  {:cmns-av/explanatoryNote
   "If not, the issuer may only refinance the debt by calling the issue and creating a new issue.",
   :db/ident :fibo-sec-dbt-dbti/isExtendableByIssuer,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-fi-fi/RedemptionProvision,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "is extendable by issuer",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether the issuer has the option to extend the debt rather than refinancing"})

(def isPutable
  {:db/ident :fibo-sec-dbt-dbti/isPutable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain {:owl/unionOf [:fibo-sec-dbt-dbti/DebtOffering
                               :fibo-fbc-fi-fi/DebtInstrument],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "is putable",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether the holder has the right to ask for redemption of the security prior to final maturity"})

(def isStrippable
  {:db/ident :fibo-sec-dbt-dbti/isStrippable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain {:owl/unionOf [:fibo-sec-dbt-dbti/DebtOffering
                               :fibo-fbc-fi-fi/DebtInstrument],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "is strippable",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether or not the instrument can be stripped, so that interest and principal may be traded separately"})

(def isSubordinated
  {:db/ident :fibo-sec-dbt-dbti/isSubordinated,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain {:owl/unionOf [:fibo-sec-dbt-dbti/DebtOffering
                               :fibo-fbc-fi-fi/DebtInstrument],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "is subordinated",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether the security is a subordinated security, meaning that the security has a lower priority than another security so that when the assets are liquidated this one is not first in line"})

(def isSubordinatedTo
  {:db/ident :fibo-sec-dbt-dbti/isSubordinatedTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-dbti/TradableDebtInstrument,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"},
   :rdfs/label "is subordinated to",
   :rdfs/range :fibo-sec-dbt-dbti/TradableDebtInstrument,
   :skos/definition
   "indicates the target security (i.e., the one in the range) has a higher priority than the security in question"})

(def urn:uuid:1b3248c1-b3fe-5e08-b2dd-18ba6c1ca286
  {:cmns-av/copyright
   #{"Copyright (c) 2016-2024 EDM Council, Inc."
     "Copyright (c) 2018-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines concepts that are specific to debt instruments (tradable and non-tradable).",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/BusinessDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/SecuritiesIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/InstrumentPricing/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/EconomicIndicators/EconomicIndicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/DebtAndEquities/Guaranty/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/InterestRates/InterestRates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Agreements/Contracts/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/DebtInstruments/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Debt Instruments Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments.rdf version of this ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments.rdf version of this ontology was modified to reflect use of actualExpression as an annotation rather than datatype property, to deprecate maturity-related properties which have been moved to financial instruments more generally, and to simplify restrictions on tradable debt instrument."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments.rdf version of this ontology was modified to move the property, hasMaturityDate, to Financial Instruments, since a maturity date can apply to a preferred share in addition to a debt instrument or offering rename 'mayBeSubordinatedTo', which violates the policy related to masquerading properties, eliminate a circular definition and unnecessary references to external sources, eliminate call price and put price, which are overreaching and confusing, in favor of monetary price, and eliminate the restriction for hasTimeToMaturity from debt instrument, made redundant by the broader restriction in financial instruments."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments.rdf version of this ontology was modified to correct the declaration of the property 'has estate or death put feature' to remove an erroneous subproperty relationship and integrate the instrument pricing ontology."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments.rdf version of this ontology was modified to generalize the definition of fixed income security."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments.rdf version of this ontology was modified to reflect a change to make redemption provision a child of contractual commitment and move it to financial instruments, as such provisions apply to preferred shares and other instruments in addition to debt, and eliminate non-tradable and tradable debt instrument redemption provisions, which are synonymous, and adjust the hierarchy for call feature, notification provision, and put feature accordingly."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments.rdf version of this ontology was modified to move the property, 'is conferred on' to the Legal Capacity ontology and to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380) and to augment the ontology with details regarding schedules for interest rate calculations, payment calculations, rate resets and the like (FBC-317)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments.rdf version of this ontology was modified to make hasDefaultLotSize a subproperty of hasLotSize."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments.rdf version of this ontology was modified to support integration of the bonds ontology."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"})