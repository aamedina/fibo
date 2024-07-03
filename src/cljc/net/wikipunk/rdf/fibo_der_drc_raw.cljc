(ns net.wikipunk.rdf.fibo-der-drc-raw
  {:cmns-av/copyright #{"Copyright (c) 2015-2024 Object Management Group, Inc."
                        "Copyright (c) 2015-2024 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/RightsAndWarrants/",
   :dcterms/abstract
   "The Rights and Warrants ontology covers a range of financial instruments providing the holder with the privilege to subscribe to or receive specific assets on terms specified. These include rights (privileges) extended to existing security holders to make new securities available to them at reduced prices or for free, and warrants whereby the holder can purchase or sell back a given quantity of the instrument, commodity or currency during a specified period at a pre-defined price.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-qtu" "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-cb"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/",
    "fibo-der-drc-comm"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
    "fibo-der-drc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/",
    "fibo-der-drc-exo"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/",
    "fibo-der-drc-raw"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
    "fibo-der-sbd-sbd"
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
    "fibo-fbc-fct-fse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-ei-ei"
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/",
    "fibo-ind-mkt-bas"
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/",
    "fibo-sec-dbt-bnd"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/",
    "fibo-sec-dbt-ex"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/",
    "fibo-sec-eq-eq"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
    "fibo-sec-sec-bsk"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Baskets/",
    "fibo-sec-sec-iss"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/",
    "fibo-sec-sec-lst"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/CurrencyContracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/MarketIndices/BasketIndices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Equities/EquityInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/Baskets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/ExoticOptions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/SecuritiesIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/EconomicIndicators/EconomicIndicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/ExerciseConventions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/CorporateBodies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/Bonds/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/CommoditiesContracts/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-der-drc-raw",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Rights and Warrants Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants.rdf version of this ontology was modified to add concepts including mini-future certificate and constant leverage certificate."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants.rdf version of this ontology was modified to replace additional content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"})

(def AllotmentRight
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Allotment generally means the distribution of equity, particularly shares granted to a participating underwriting firm during an initial public offering (IPO)."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "bonus right"},
   :db/ident :fibo-der-drc-raw/AllotmentRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "allotment right"},
   :rdfs/subClassOf
   #{:fibo-der-sbd-sbd/EquityDerivative :fibo-fbc-fi-fi/Entitlement
     {:owl/onProperty     :cmns-qtu/hasExpression,
      :owl/someValuesFrom :fibo-der-drc-raw/AllotmentRightFormula,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "privileges allotted to existing security holders, entitling them to receive new securities free of charge"}})

(def AllotmentRightFormula
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Note that there may be a combination of a rule expressed in text as well as an expression or more complex formula embedded in a contract for making this determination."},
   :db/ident :fibo-der-drc-raw/AllotmentRightFormula,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "allotment right formula"},
   :rdfs/subClassOf :cmns-qtu/Expression,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "rule applied to calculate the number of securities for an allotment right, typically based on the number of these instruments that the holder holds"}})

(def BarrierInstrumentBasedMiniFutureCertificate
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-raw/BarrierInstrumentBasedMiniFutureCertificate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value "barrier instrument-based mini-future certificate"},
   :rdfs/subClassOf :fibo-der-drc-raw/MiniFutureCertificate,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "mini-future certificate that immediately expires if the barrier instrument trading price level is breached during product lifetime"}})

(def BarrierUnderlyingMiniFutureCertificate
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-raw/BarrierUnderlyingMiniFutureCertificate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "barrier underlying mini-future certificate"},
   :rdfs/subClassOf :fibo-der-drc-raw/MiniFutureCertificate,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "mini-future certificate that immediately expires if the barrier underlying level is breached during product lifetime"}})

(def BasketWarrant
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-raw/BasketWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "basket warrant"},
   :rdfs/subClassOf #{:fibo-der-drc-raw/Warrant
                      {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                       :owl/someValuesFrom :fibo-sec-sec-bsk/BasketOfSecurities,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "warrant that permits the holder to acquire a package or group of assets at a specified price during a specified period"}})

(def BondPurchaseRight
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-raw/BondPurchaseRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bond purchase right"},
   :rdfs/subClassOf
   #{:fibo-der-drc-raw/PurchaseRight
     {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
      :owl/someValuesFrom {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
                           :owl/someValuesFrom :fibo-sec-dbt-bnd/Bond,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "purchase right that gives a prospective acquiree's bondholders the right to buy bonds of the firm or bonds of anyone who acquires the firm at a deep discount to their fair market value"}})

(def BondSubscriptionRight
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-raw/BondSubscriptionRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bond subscription right"},
   :rdfs/subClassOf
   #{:fibo-der-drc-raw/SubscriptionRight
     {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
      :owl/someValuesFrom {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
                           :owl/someValuesFrom :fibo-sec-dbt-bnd/Bond,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "subscription right entitling existing bond holders to subscribe to new securities at a price normally lower than the prevailing market price"}})

(def CallPutWarrant
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019."},
   :db/ident :fibo-der-drc-raw/CallPutWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "call put warrant"},
   :rdfs/subClassOf #{:fibo-der-drc-raw/PutWarrant
                      :fibo-der-drc-raw/CallWarrant},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "warrant that either does not specify call or put features, or that explicitly includes both a call and put feature"}})

(def CallWarrant
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019."},
   :db/ident :fibo-der-drc-raw/CallWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "call warrant"},
   :rdfs/subClassOf :fibo-der-drc-raw/Warrant,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "warrant giving the buyer (holder) the right, but not the obligation, to acquire specific underlying assets during a specified period at a specified price"}})

(def CombinedInstrumentsPurchaseRight
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-raw/CombinedInstrumentsPurchaseRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "combined instruments purchase right"},
   :rdfs/subClassOf :fibo-der-drc-raw/PurchaseRight,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "purchase right that gives a prospective acquiree's holders of multiple securities the right to buy securities of the firm or securities of anyone who acquires the firm at a deep discount to their fair market value"}})

(def CombinedInstrumentsSubscriptionRight
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-raw/CombinedInstrumentsSubscriptionRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "combined instruments subscription right"},
   :rdfs/subClassOf :fibo-der-drc-raw/SubscriptionRight,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "subscription right entitling existing holders of multiple securities to subscribe to new securities at a price normally lower than the prevailing market price"}})

(def CommodityWarrant
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-raw/CommodityWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "commodity warrant"},
   :rdfs/subClassOf #{:fibo-der-drc-raw/Warrant
                      :fibo-der-drc-comm/CommodityDerivative},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "warrant that permits the holder to acquire a specified amount of a commodity during a specified period at a specified price"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Commodity Warrants Australia (CWA) sells warrants based on 12 commodities and financial markets - crude oil, gold, silver, live cattle, corn, orange juice, soy, coffee, cocoa, the Dow Jones Industrial Average, the NASDAQ Composite Index and the S&P 500 Index."}})

(def CommonConvertibleSharePurchaseRight
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-raw/CommonConvertibleSharePurchaseRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "common convertible share purchase right"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
      :owl/someValuesFrom {:owl/onProperty :cmns-rlcmp/isPlayedBy,
                           :owl/someValuesFrom
                           :fibo-sec-eq-eq/ConvertibleCommonShare,
                           :rdf/type :owl/Restriction},
      :rdf/type           :owl/Restriction} :fibo-der-drc-raw/PurchaseRight},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "purchase right that gives a prospective acquiree's common, convertible shareholders the right to buy common, convertible shares of the firm or common, convertible shares of anyone who acquires the firm at a deep discount to their fair market value"}})

(def CommonConvertibleShareSubscriptionRight
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-raw/CommonConvertibleShareSubscriptionRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "common convertible share subscription right"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-fbc-fi-fi/hasUnderlier,
                       :owl/someValuesFrom
                       {:owl/onProperty :cmns-rlcmp/isPlayedBy,
                        :owl/someValuesFrom
                        :fibo-sec-eq-eq/ConvertibleCommonShare,
                        :rdf/type :owl/Restriction},
                       :rdf/type :owl/Restriction}
                      :fibo-der-drc-raw/SubscriptionRight},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "subscription right entitling existing common convertible shareholders to subscribe to new securities at a price normally lower than the prevailing market price"}})

(def CommonSharePurchaseRight
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-raw/CommonSharePurchaseRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "common share purchase right"},
   :rdfs/subClassOf
   #{:fibo-der-drc-raw/PurchaseRight
     {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
      :owl/someValuesFrom {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
                           :owl/someValuesFrom :fibo-sec-eq-eq/CommonShare,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "purchase right that gives a prospective acquiree's common shareholders the right to buy common shares of the firm or common shares of anyone who acquires the firm at a deep discount to their fair market value"}})

(def CommonShareSubscriptionRight
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-raw/CommonShareSubscriptionRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "common share subscription right"},
   :rdfs/subClassOf
   #{:fibo-der-drc-raw/SubscriptionRight
     {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
      :owl/someValuesFrom {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
                           :owl/someValuesFrom :fibo-sec-eq-eq/CommonShare,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "subscription right entitling existing common shareholders to subscribe to new securities at a price normally lower than the prevailing market price"}})

(def CompanyWarrant
  {:db/ident :fibo-der-drc-raw/CompanyWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "company warrant"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.lawinsider.com/dictionary/company-warrant"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
      :owl/someValuesFrom {:owl/allValuesFrom :fibo-be-le-cb/StockCorporation,
                           :owl/onProperty    :cmns-rlcmp/isPlayedBy,
                           :rdf/type          :owl/Restriction},
      :rdf/type           :owl/Restriction} :fibo-der-drc-raw/EquityWarrant
     :fibo-der-drc-raw/TraditionalWarrant},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "equity warrant to purchase shares of capital stock issued by the corporation whose equity is the underlying asset"}})

(def ConstantLeverageCertificate
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-raw/ConstantLeverageCertificate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "constant leverage certificate"},
   :rdfs/subClassOf #{:fibo-fbc-fi-fi/Entitlement :fibo-fbc-fi-fi/Option
                      :fibo-der-sbd-sbd/SecurityBasedDerivative},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "entitlement that combines the structure of an open-end certificate with a leverage option with no fixed term, making leverage available without a term restriction, without a knock-out barrier dependency"}})

(def CoveredWarrant
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "Covered warrants are very similar to options in that they can be created to allow holders to benefit from either rising prices or falling prices, by having both put and call warrants. They can also be created on a wide variety of underlying instruments, not just equities and they are fairly standardised and are mostly traded on exchanges. The main difference is that warrants tend to have longer maturity dates, typically measured in years instead of months (as with options), and are easier to access for individuals as they can be bought and sold in the same way as shares in the stock exchange."}
     {:rdf/language "en",
      :rdf/value
      "In contrast to traditional equity warrants, with covered warrants, no new issuance of common stock occurs if the warrant is exercised. The underlying shares of common stock are usually either owned by the issuer of the covered warrants or the issuer has a mechanism, such as owning equity warrants for the underlying shares, through which they can obtain the shares."}},
   :db/ident :fibo-der-drc-raw/CoveredWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "covered warrant"},
   :rdfs/subClassOf #{:fibo-der-drc-raw/Warrant
                      {:owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
                       :owl/someValuesFrom
                       :fibo-fbc-fct-fse/FinancialInstitution,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "warrant that gives the holder the right, but not the obligation, to buy (call warrant) or to sell (put warrant) an underlying asset at a specified price (the strike or exercise price) by a predetermined date, issued without an accompanying security by a third party that holds as many securities as would be required if all the warrants are exercised"}})

(def CurrencyWarrant
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-raw/CurrencyWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "currency warrant"},
   :rdfs/subClassOf #{:fibo-der-drc-raw/Warrant
                      :fibo-der-drc-cur/CurrencyDerivative},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "warrant that permits the holder to acquire a specified amount in a certain currency at a specified exchange rate during a specified period"}})

(def DebtWarrant
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-raw/DebtWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt warrant"},
   :rdfs/subClassOf #{:fibo-der-drc-raw/Warrant
                      :fibo-der-sbd-sbd/DebtInstrumentDerivative},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "warrant that permits the holder to acquire a specified amount of a debt instrument or related debt observable a specified period at a specified price"}})

(def EquityWarrant
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-raw/EquityWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity warrant"},
   :rdfs/subClassOf #{:fibo-der-drc-raw/Warrant
                      :fibo-der-sbd-sbd/EquityDerivative},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "warrant that permits the holder to acquire a specified amount of an equity instrument during a specified period at a specified price"}})

(def ExchangeTradedWarrant
  {:db/ident :fibo-der-drc-raw/ExchangeTradedWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "exchange-traded warrant"},
   :rdfs/subClassOf #{:fibo-sec-sec-lst/ListedSecurity
                      :fibo-der-drc-raw/PublicWarrant},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "warrant that is listed on a securities exchange"}})

(def IndexWarrant
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-raw/IndexWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "index warrant"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
      :owl/someValuesFrom {:owl/minQualifiedCardinality 0,
                           :owl/onClass    {:owl/unionOf
                                            [:fibo-ind-ei-ei/EconomicIndicator
                                             :fibo-ind-mkt-bas/ReferenceIndex],
                                            :rdf/type :owl/Class},
                           :owl/onProperty :cmns-rlcmp/isPlayedBy,
                           :rdf/type       :owl/Restriction},
      :rdf/type           :owl/Restriction} :fibo-der-drc-raw/Warrant},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "warrant that permits the holder to acquire a specified amount based on the performance of an index during a specified period at a specified price"}})

(def LongMiniFutureCertificate
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-raw/LongMiniFutureCertificate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "long mini-future certificate"},
   :rdfs/subClassOf :fibo-der-drc-raw/MiniFutureCertificate,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "mini-future certificate that typically entitles the holder to acquire specific underlying assets during a specified period at a specified price"}})

(def MiniFutureCertificate
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The price of a mini-future always corresponds to its intrinsic value, i.e. the capital outlay, plus the bid-ask spread. The financing costs associated with building up the leverage effect are offset against the capital outlay on a daily basis, thereby eliminating the need for a premium. Investors have to pay only financing costs they actually utilize. In contrast to options, factors like volatility have no influence at all on the price of mini-futures."},
   :db/ident :fibo-der-drc-raw/MiniFutureCertificate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mini-future certificate"},
   :rdfs/subClassOf #{:fibo-fbc-fi-fi/Entitlement
                      :fibo-der-sbd-sbd/SecurityBasedDerivative
                      :fibo-der-drc-exo/BarrierOption},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "entitlement that combines the structure of an open-end certificate with a leverage option with no fixed term, making leverage available without a term restriction, and whose payoff depends on whether or not the underlying asset has reached or exceeded a predetermined price"}})

(def NakedWarrant
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-raw/NakedWarrant,
   :owl/disjointWith :fibo-der-drc-raw/CoveredWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "naked warrant"},
   :rdfs/subClassOf #{:fibo-der-drc-raw/Warrant
                      {:owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
                       :owl/someValuesFrom
                       :fibo-fbc-fct-fse/FinancialInstitution,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "warrant that gives the holder the right, but not the obligation, to buy (call warrant) or to sell (put warrant) an underlying asset at a specified price (the strike or exercise price) by a predetermined date, issued without an accompanying security by a third party that does not hold as many securities as would be required if all the warrants are exercised"}})

(def PerpetualWarrant
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The strike price, in the case of a perpetual warrant, is usually higher than the market value of the underlying asset at the time of issue."},
   :db/ident :fibo-der-drc-raw/PerpetualWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label "perpetual warrant",
   :rdfs/subClassOf :fibo-der-drc-raw/Warrant,
   :skos/definition
   "warrant without an expiration date, giving the holder the right, but not the obligation, to buy (call warrant) or to sell (put warrant) an underlying asset at a certain strike price"})

(def PreferredConvertibleSharePurchaseRight
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-raw/PreferredConvertibleSharePurchaseRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "preferred convertible share purchase right"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
      :owl/someValuesFrom {:owl/onProperty :cmns-rlcmp/isPlayedBy,
                           :owl/someValuesFrom
                           :fibo-sec-eq-eq/ConvertiblePreferredShare,
                           :rdf/type :owl/Restriction},
      :rdf/type           :owl/Restriction} :fibo-der-drc-raw/PurchaseRight},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "purchase right that gives a prospective acquiree's preferred, convertible shareholders the right to buy preferred, convertible shares of the firm or preferred, convertible shares of anyone who acquires the firm at a deep discount to their fair market value"}})

(def PreferredConvertibleShareSubscriptionRight
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-raw/PreferredConvertibleShareSubscriptionRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "preferred convertible share subscription right"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-fbc-fi-fi/hasUnderlier,
                       :owl/someValuesFrom
                       {:owl/onProperty :cmns-rlcmp/isPlayedBy,
                        :owl/someValuesFrom
                        :fibo-sec-eq-eq/ConvertiblePreferredShare,
                        :rdf/type :owl/Restriction},
                       :rdf/type :owl/Restriction}
                      :fibo-der-drc-raw/SubscriptionRight},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "subscription right entitling existing preferred, convertible shareholders to subscribe to new securities at a price normally lower than the prevailing market price"}})

(def PreferredSharePurchaseRight
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-raw/PreferredSharePurchaseRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "preferred share purchase right"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
      :owl/someValuesFrom {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
                           :owl/someValuesFrom :fibo-sec-eq-eq/PreferredShare,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction} :fibo-der-drc-raw/PurchaseRight},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "purchase right that gives a prospective acquiree's preferred shareholders the right to buy preferred shares of the firm or preferred shares of anyone who acquires the firm at a deep discount to their fair market value"}})

(def PreferredShareSubscriptionRight
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-raw/PreferredShareSubscriptionRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "preferred share subscription right"},
   :rdfs/subClassOf
   #{:fibo-der-drc-raw/SubscriptionRight
     {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
      :owl/someValuesFrom {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
                           :owl/someValuesFrom :fibo-sec-eq-eq/PreferredShare,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "subscription right entitling existing preferred shareholders to subscribe to new securities at a price normally lower than the prevailing market price"}})

(def PrivateWarrant
  {:db/ident :fibo-der-drc-raw/PrivateWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label "private warrant",
   :rdfs/subClassOf #{:fibo-der-drc-raw/Warrant
                      :fibo-fbc-fi-fi/NonNegotiableSecurity},
   :skos/definition "warrant that is not tradable"})

(def PublicWarrant
  {:db/ident :fibo-der-drc-raw/PublicWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label "public warrant",
   :rdfs/subClassOf #{:fibo-der-drc-raw/Warrant
                      :fibo-fbc-fi-fi/NegotiableSecurity},
   :skos/definition
   "warrant that may be traded over the counter (OTC) or through an exchange"})

(def PurchaseRight
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The underlying is usually shares but this not necessarily the case. Also known as \"Poison Pill\"."},
   :db/ident :fibo-der-drc-raw/PurchaseRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "purchase right"},
   :rdfs/subClassOf :fibo-fbc-fi-fi/Entitlement,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "anti-takeover device that gives a prospective acquiree's shareholders the right to buy shares of the firm or shares of anyone who acquires the firm at a deep discount to their fair market value"}})

(def PutWarrant
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019."},
   :db/ident :fibo-der-drc-raw/PutWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "put warrant"},
   :rdfs/subClassOf :fibo-der-drc-raw/Warrant,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "warrant giving the buyer (holder) the right, but not the obligation, to sell the assets specified (i.e., acquire cash in exchange for the underlying assets) back to the issuer at a fixed price or formula, on or before a specified date"}})

(def ShortMiniFutureCertificate
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-raw/ShortMiniFutureCertificate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "short mini-future certificate"},
   :rdfs/subClassOf :fibo-der-drc-raw/MiniFutureCertificate,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "mini-future certificate that entitles the holder to acquire cash in exchange for specific underlying assets"}})

(def SubscriptionRight
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A subscription rights issue increases the number of shares in the market, thus leading to a dilution in each share's value."},
   :cmns-av/synonym #{{:rdf/language "en",
                       :rdf/value    "anti-dilution right"}
                      {:rdf/language "en",
                       :rdf/value    "preemptive right"}
                      {:rdf/language "en",
                       :rdf/value    "subscription privilege"}},
   :db/ident :fibo-der-drc-raw/SubscriptionRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subscription right"},
   :rdfs/subClassOf :fibo-fbc-fi-fi/Entitlement,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "privileges allotted to existing security holders, entitling them to subscribe to new securities at a price normally lower than the prevailing market price"}})

(def TraditionalWarrant
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-raw/TraditionalWarrant,
   :owl/disjointWith #{:fibo-der-drc-raw/NakedWarrant
                       :fibo-der-drc-raw/CoveredWarrant},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "traditional warrant"},
   :rdfs/subClassOf :fibo-der-drc-raw/Warrant,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "warrant that gives the holder the right, but not the obligation, to buy (call warrant) or to sell (put warrant) an underlying asset at a specified price (the strike or exercise price) by a predetermined date, issued by the issuer of the underlying instrument"}})

(def Warrant
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Warrants are for any kind of instrument. Warrants may be privately issued and may not necessarily be traded on an exchange."},
   :db/ident :fibo-der-drc-raw/Warrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "warrant"},
   :rdfs/subClassOf #{:fibo-fbc-fi-fi/Entitlement
                      {:owl/onProperty     :fibo-sec-dbt-ex/hasExerciseTerms,
                       :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseTerms,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "entitlement that permits the holder to purchase a specified amount of a financial instrument, commodity, currency or other asset during a specified period at a specified price"}})

(def hasConversionRatio
  {:db/ident :fibo-der-drc-raw/hasConversionRatio,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-fi-fi/Entitlement,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has conversion ratio"},
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :cmns-qtu/hasNumericValue,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the factor used to determine the number of warrants needed in order to buy or sell a specific number of securities or investment units"}})

(def hasOversubscribeOption
  {:db/ident :fibo-der-drc-raw/hasOversubscribeOption,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-fi-fi/Entitlement,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has oversubscribe option"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates whether the holders of the rights instrument may get securities in the event that other right holders choose not to subscribe"}})

(def urn:uuid:6046dcea-6005-54d9-9824-589a68688304
  {:cmns-av/copyright #{"Copyright (c) 2015-2024 Object Management Group, Inc."
                        "Copyright (c) 2015-2024 EDM Council, Inc."},
   :dcterms/abstract
   "The Rights and Warrants ontology covers a range of financial instruments providing the holder with the privilege to subscribe to or receive specific assets on terms specified. These include rights (privileges) extended to existing security holders to make new securities available to them at reduced prices or for free, and warrants whereby the holder can purchase or sell back a given quantity of the instrument, commodity or currency during a specified period at a pre-defined price.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/CurrencyContracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/MarketIndices/BasketIndices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Equities/EquityInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/Baskets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/ExoticOptions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/SecuritiesIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/EconomicIndicators/EconomicIndicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/ExerciseConventions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/CorporateBodies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/Bonds/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/CommoditiesContracts/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/RightsAndWarrants/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Rights and Warrants Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants.rdf version of this ontology was modified to add concepts including mini-future certificate and constant leverage certificate."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants.rdf version of this ontology was modified to replace additional content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/"})