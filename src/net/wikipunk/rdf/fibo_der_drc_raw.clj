(ns net.wikipunk.rdf.fibo-der-drc-raw
  "The Rights and Warrants ontology covers a range of financial instruments providing the holder with the privilege to subscribe to or receive specific assets on terms specified. These include rights (privileges) extended to existing security holders to make new securities available to them at reduced prices or for free, and warrants whereby the holder can purchase or sell back a given quantity of the instrument, commodity or currency during a specified period at a pre-defined price."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :dcterms/abstract
   "The Rights and Warrants ontology covers a range of financial instruments providing the holder with the privilege to subscribe to or receive specific assets on terms specified. These include rights (privileges) extended to existing security holders to make new securities available to them at reduced prices or for free, and warrants whereby the holder can purchase or sell back a given quantity of the instrument, commodity or currency during a specified period at a pre-defined price.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/ExerciseConventions/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/Bonds/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesListings/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/FinancialServicesEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/EconomicIndicators/EconomicIndicators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/CommoditiesContracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/Baskets/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/DerivativesBasics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/CorporateBodies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Equities/EquityInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Quantities/QuantitiesAndUnits/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/MarketIndices/BasketIndices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/CurrencyContracts/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/RightsAndWarrants/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-cb"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/",
    "fibo-der-drc-bsc"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
    "fibo-der-drc-comm"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
    "fibo-der-drc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/",
    "fibo-der-drc-raw"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
    "fibo-der-sbd-sbd"
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
    "fibo-fbc-fct-fse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-qt-qtu"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-alx"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
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
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfa/prefix "fibo-der-drc-raw",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Rights and Warrants Ontology"},
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2015-2021 Object Management Group, Inc."
                  "Copyright (c) 2015-2021 EDM Council, Inc."],
   :sm/dependsOn ["https://spec.edmcouncil.org/fibo/ontology/SEC/"
                  "https://spec.edmcouncil.org/fibo/ontology/FND/"
                  "https://spec.edmcouncil.org/fibo/ontology/BE/"
                  "https://spec.edmcouncil.org/fibo/ontology/FBC/"
                  "https://spec.edmcouncil.org/fibo/ontology/IND/"],
   :sm/fileAbbreviation "fibo-der-drc-raw",
   :sm/filename "RightsAndWarrants.rdf"})

(def AllotmentRight
  "privileges allotted to existing security holders, entitling them to receive new securities free of charge"
  {:db/ident :fibo-der-drc-raw/AllotmentRight,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Allotment generally means the distribution of equity, particularly shares granted to a participating underwriting firm during an initial public offering (IPO)."},
   :fibo-fnd-utl-av/synonym {:rdf/language "en",
                             :rdf/value    "bonus right"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "allotment right"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-utl-alx/hasFormula,
                      :owl/someValuesFrom
                      :fibo-der-drc-raw/AllotmentRightFormula,
                      :rdf/type :owl/Restriction}
                     :fibo-der-sbd-sbd/EquityDerivative
                     :fibo-fbc-fi-fi/Entitlement],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "privileges allotted to existing security holders, entitling them to receive new securities free of charge"}})

(def AllotmentRightFormula
  "rule applied to calculate the number of securities for an allotment right, typically based on the number of these instruments that the holder holds"
  {:db/ident :fibo-der-drc-raw/AllotmentRightFormula,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Note that there may be a combination of a rule expressed in text as well as an expression or more complex formula embedded in a contract for making this determination."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "allotment right formula"},
   :rdfs/subClassOf :fibo-fnd-utl-alx/Formula,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "rule applied to calculate the number of securities for an allotment right, typically based on the number of these instruments that the holder holds"}})

(def BasketWarrant
  "warrant that permits the holder to acquire a package or group of assets at a specified price during a specified period"
  {:db/ident :fibo-der-drc-raw/BasketWarrant,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "basket warrant"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-bsc/hasUnderlier,
                      :owl/someValuesFrom :fibo-sec-sec-bsk/BasketOfSecurities,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-raw/Warrant],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "warrant that permits the holder to acquire a package or group of assets at a specified price during a specified period"}})

(def BondPurchaseRight
  "purchase right that gives a prospective acquiree's bondholders the right to buy bonds of the firm or bonds of anyone who acquires the firm at a deep discount to their fair market value"
  {:db/ident :fibo-der-drc-raw/BondPurchaseRight,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bond purchase right"},
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-der-drc-bsc/hasUnderlier,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                          :owl/someValuesFrom :fibo-sec-dbt-bnd/Bond,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-raw/PurchaseRight],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "purchase right that gives a prospective acquiree's bondholders the right to buy bonds of the firm or bonds of anyone who acquires the firm at a deep discount to their fair market value"}})

(def BondSubscriptionRight
  "subscription right entitling existing bond holders to subscribe to new securities at a price normally lower than the prevailing market price"
  {:db/ident :fibo-der-drc-raw/BondSubscriptionRight,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bond subscription right"},
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-der-drc-bsc/hasUnderlier,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                          :owl/someValuesFrom :fibo-sec-dbt-bnd/Bond,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-raw/SubscriptionRight],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "subscription right entitling existing bond holders to subscribe to new securities at a price normally lower than the prevailing market price"}})

(def CallPutWarrant
  "warrant that either does not specify call or put features, or that explicitly includes both a call and put feature"
  {:db/ident :fibo-der-drc-raw/CallPutWarrant,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "call put warrant"},
   :rdfs/subClassOf [:fibo-der-drc-raw/PutWarrant
                     :fibo-der-drc-raw/CallWarrant],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "warrant that either does not specify call or put features, or that explicitly includes both a call and put feature"}})

(def CallWarrant
  "warrant giving the buyer (holder) the right, but not the obligation, to acquire specific underlying assets during a specified period at a specified price"
  {:db/ident :fibo-der-drc-raw/CallWarrant,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "call warrant"},
   :rdfs/subClassOf :fibo-der-drc-raw/Warrant,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "warrant giving the buyer (holder) the right, but not the obligation, to acquire specific underlying assets during a specified period at a specified price"}})

(def CombinedInstrumentsPurchaseRight
  "purchase right that gives a prospective acquiree's holders of multiple securities the right to buy securities of the firm or securities of anyone who acquires the firm at a deep discount to their fair market value"
  {:db/ident :fibo-der-drc-raw/CombinedInstrumentsPurchaseRight,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "combined instruments purchase right"},
   :rdfs/subClassOf :fibo-der-drc-raw/PurchaseRight,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "purchase right that gives a prospective acquiree's holders of multiple securities the right to buy securities of the firm or securities of anyone who acquires the firm at a deep discount to their fair market value"}})

(def CombinedInstrumentsSubscriptionRight
  "subscription right entitling existing holders of multiple securities to subscribe to new securities at a price normally lower than the prevailing market price"
  {:db/ident :fibo-der-drc-raw/CombinedInstrumentsSubscriptionRight,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "combined instruments subscription right"},
   :rdfs/subClassOf :fibo-der-drc-raw/SubscriptionRight,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "subscription right entitling existing holders of multiple securities to subscribe to new securities at a price normally lower than the prevailing market price"}})

(def CommodityWarrant
  "warrant that permits the holder to acquire a specified amount of a commodity during a specified period at a specified price"
  {:db/ident :fibo-der-drc-raw/CommodityWarrant,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "commodity warrant"},
   :rdfs/subClassOf [:fibo-der-drc-raw/Warrant
                     :fibo-der-drc-comm/CommodityDerivative],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "warrant that permits the holder to acquire a specified amount of a commodity during a specified period at a specified price"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Commodity Warrants Australia (CWA) sells warrants based on 12 commodities and financial markets - crude oil, gold, silver, live cattle, corn, orange juice, soy, coffee, cocoa, the Dow Jones Industrial Average, the NASDAQ Composite Index and the S&P 500 Index."}})

(def CommonConvertibleSharePurchaseRight
  "purchase right that gives a prospective acquiree's common, convertible shareholders the right to buy common, convertible shares of the firm or common, convertible shares of anyone who acquires the firm at a deep discount to their fair market value"
  {:db/ident :fibo-der-drc-raw/CommonConvertibleSharePurchaseRight,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "common convertible share purchase right"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-der-drc-bsc/hasUnderlier,
                      :owl/someValuesFrom
                      {:owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                       :owl/someValuesFrom
                       :fibo-sec-eq-eq/ConvertibleCommonShare,
                       :rdf/type :owl/Restriction},
                      :rdf/type :owl/Restriction}
                     :fibo-der-drc-raw/PurchaseRight],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "purchase right that gives a prospective acquiree's common, convertible shareholders the right to buy common, convertible shares of the firm or common, convertible shares of anyone who acquires the firm at a deep discount to their fair market value"}})

(def CommonConvertibleShareSubscriptionRight
  "subscription right entitling existing common convertible shareholders to subscribe to new securities at a price normally lower than the prevailing market price"
  {:db/ident :fibo-der-drc-raw/CommonConvertibleShareSubscriptionRight,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "common convertible share subscription right"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-der-drc-bsc/hasUnderlier,
                      :owl/someValuesFrom
                      {:owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                       :owl/someValuesFrom
                       :fibo-sec-eq-eq/ConvertibleCommonShare,
                       :rdf/type :owl/Restriction},
                      :rdf/type :owl/Restriction}
                     :fibo-der-drc-raw/SubscriptionRight],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "subscription right entitling existing common convertible shareholders to subscribe to new securities at a price normally lower than the prevailing market price"}})

(def CommonSharePurchaseRight
  "purchase right that gives a prospective acquiree's common shareholders the right to buy common shares of the firm or common shares of anyone who acquires the firm at a deep discount to their fair market value"
  {:db/ident :fibo-der-drc-raw/CommonSharePurchaseRight,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "common share purchase right"},
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-der-drc-bsc/hasUnderlier,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                          :owl/someValuesFrom :fibo-sec-eq-eq/CommonShare,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-raw/PurchaseRight],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "purchase right that gives a prospective acquiree's common shareholders the right to buy common shares of the firm or common shares of anyone who acquires the firm at a deep discount to their fair market value"}})

(def CommonShareSubscriptionRight
  "subscription right entitling existing common shareholders to subscribe to new securities at a price normally lower than the prevailing market price"
  {:db/ident :fibo-der-drc-raw/CommonShareSubscriptionRight,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "common share subscription right"},
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-der-drc-bsc/hasUnderlier,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                          :owl/someValuesFrom :fibo-sec-eq-eq/CommonShare,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-raw/SubscriptionRight],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "subscription right entitling existing common shareholders to subscribe to new securities at a price normally lower than the prevailing market price"}})

(def CompanyWarrant
  "equity warrant to purchase shares of capital stock issued by the corporation whose equity is the underlying asset"
  {:db/ident :fibo-der-drc-raw/CompanyWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "company warrant"},
   :rdfs/seeAlso ["https://www.lawinsider.com/dictionary/company-warrant"],
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
     :owl/someValuesFrom {:owl/allValuesFrom :fibo-be-le-cb/StockCorporation,
                          :owl/onProperty    :fibo-fnd-rel-rel/hasIdentity,
                          :rdf/type          :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-raw/TraditionalWarrant
    :fibo-der-drc-raw/EquityWarrant],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "equity warrant to purchase shares of capital stock issued by the corporation whose equity is the underlying asset"}})

(def CoveredWarrant
  "warrant that gives the holder the right, but not the obligation, to buy (call warrant) or to sell (put warrant) an underlying asset at a specified price (the strike or exercise price) by a predetermined date, issued without an accompanying security by a third party that holds as many securities as would be required if all the warrants are exercised"
  {:db/ident :fibo-der-drc-raw/CoveredWarrant,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "In contrast to traditional equity warrants, with covered warrants, no new issuance of common stock occurs if the warrant is exercised. The underlying shares of common stock are usually either owned by the issuer of the covered warrants or the issuer has a mechanism, such as owning equity warrants for the underlying shares, through which they can obtain the shares."}
    {:rdf/language "en",
     :rdf/value
     "Covered warrants are very similar to options in that they can be created to allow holders to benefit from either rising prices or falling prices, by having both put and call warrants. They can also be created on a wide variety of underlying instruments, not just equities and they are fairly standardised and are mostly traded on exchanges. The main difference is that warrants tend to have longer maturity dates, typically measured in years instead of months (as with options), and are easier to access for individuals as they can be bought and sold in the same way as shares in the stock exchange."}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "covered warrant"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
                      :owl/someValuesFrom
                      :fibo-fbc-fct-fse/FinancialInstitution,
                      :rdf/type :owl/Restriction}
                     :fibo-der-drc-raw/Warrant],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "warrant that gives the holder the right, but not the obligation, to buy (call warrant) or to sell (put warrant) an underlying asset at a specified price (the strike or exercise price) by a predetermined date, issued without an accompanying security by a third party that holds as many securities as would be required if all the warrants are exercised"}})

(def CurrencyWarrant
  "warrant that permits the holder to acquire a specified amount in a certain currency at a specified exchange rate during a specified period"
  {:db/ident :fibo-der-drc-raw/CurrencyWarrant,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "currency warrant"},
   :rdfs/subClassOf [:fibo-der-drc-raw/Warrant
                     :fibo-der-drc-cur/CurrencyDerivative],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "warrant that permits the holder to acquire a specified amount in a certain currency at a specified exchange rate during a specified period"}})

(def DebtWarrant
  "warrant that permits the holder to acquire a specified amount of a debt instrument or related debt observable a specified period at a specified price"
  {:db/ident :fibo-der-drc-raw/DebtWarrant,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt warrant"},
   :rdfs/subClassOf [:fibo-der-sbd-sbd/DebtInstrumentDerivative
                     :fibo-der-drc-raw/Warrant],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "warrant that permits the holder to acquire a specified amount of a debt instrument or related debt observable a specified period at a specified price"}})

(def EquityWarrant
  "warrant that permits the holder to acquire a specified amount of an equity instrument during a specified period at a specified price"
  {:db/ident :fibo-der-drc-raw/EquityWarrant,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity warrant"},
   :rdfs/subClassOf [:fibo-der-sbd-sbd/EquityDerivative
                     :fibo-der-drc-raw/Warrant],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "warrant that permits the holder to acquire a specified amount of an equity instrument during a specified period at a specified price"}})

(def ExchangeTradedWarrant
  "warrant that is listed on a securities exchange"
  {:db/ident :fibo-der-drc-raw/ExchangeTradedWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "exchange-traded warrant"},
   :rdfs/subClassOf [:fibo-sec-sec-lst/ListedSecurity
                     :fibo-der-drc-raw/PublicWarrant],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "warrant that is listed on a securities exchange"}})

(def IndexWarrant
  "warrant that permits the holder to acquire a specified amount based on the performance of an index during a specified period at a specified price"
  {:db/ident :fibo-der-drc-raw/IndexWarrant,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "index warrant"},
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-der-drc-bsc/hasUnderlier,
     :owl/someValuesFrom {:owl/minQualifiedCardinality 0,
                          :owl/onClass    {:owl/unionOf
                                           [:fibo-ind-ei-ei/EconomicIndicator
                                            :fibo-ind-mkt-bas/ReferenceIndex],
                                           :rdf/type :owl/Class},
                          :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                          :rdf/type       :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-raw/Warrant],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "warrant that permits the holder to acquire a specified amount based on the performance of an index during a specified period at a specified price"}})

(def NakedWarrant
  "warrant that gives the holder the right, but not the obligation, to buy (call warrant) or to sell (put warrant) an underlying asset at a specified price (the strike or exercise price) by a predetermined date, issued without an accompanying security by a third party that does not hold as many securities as would be required if all the warrants are exercised"
  {:db/ident :fibo-der-drc-raw/NakedWarrant,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :owl/disjointWith :fibo-der-drc-raw/CoveredWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "naked warrant"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
                      :owl/someValuesFrom
                      :fibo-fbc-fct-fse/FinancialInstitution,
                      :rdf/type :owl/Restriction}
                     :fibo-der-drc-raw/Warrant],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "warrant that gives the holder the right, but not the obligation, to buy (call warrant) or to sell (put warrant) an underlying asset at a specified price (the strike or exercise price) by a predetermined date, issued without an accompanying security by a third party that does not hold as many securities as would be required if all the warrants are exercised"}})

(def PerpetualWarrant
  "warrant without an expiration date, giving the holder the right, but not the obligation, to buy (call warrant) or to sell (put warrant) an underlying asset at a certain strike price"
  {:db/ident :fibo-der-drc-raw/PerpetualWarrant,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The strike price, in the case of a perpetual warrant, is usually higher than the market value of the underlying asset at the time of issue."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label "perpetual warrant",
   :rdfs/subClassOf :fibo-der-drc-raw/Warrant,
   :skos/definition
   "warrant without an expiration date, giving the holder the right, but not the obligation, to buy (call warrant) or to sell (put warrant) an underlying asset at a certain strike price"})

(def PreferredConvertibleSharePurchaseRight
  "purchase right that gives a prospective acquiree's preferred, convertible shareholders the right to buy preferred, convertible shares of the firm or preferred, convertible shares of anyone who acquires the firm at a deep discount to their fair market value"
  {:db/ident :fibo-der-drc-raw/PreferredConvertibleSharePurchaseRight,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "preferred convertible share purchase right"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-der-drc-bsc/hasUnderlier,
                      :owl/someValuesFrom
                      {:owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                       :owl/someValuesFrom
                       :fibo-sec-eq-eq/ConvertiblePreferredShare,
                       :rdf/type :owl/Restriction},
                      :rdf/type :owl/Restriction}
                     :fibo-der-drc-raw/PurchaseRight],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "purchase right that gives a prospective acquiree's preferred, convertible shareholders the right to buy preferred, convertible shares of the firm or preferred, convertible shares of anyone who acquires the firm at a deep discount to their fair market value"}})

(def PreferredConvertibleShareSubscriptionRight
  "subscription right entitling existing preferred, convertible shareholders to subscribe to new securities at a price normally lower than the prevailing market price"
  {:db/ident :fibo-der-drc-raw/PreferredConvertibleShareSubscriptionRight,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "preferred convertible share subscription right"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-der-drc-bsc/hasUnderlier,
                      :owl/someValuesFrom
                      {:owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                       :owl/someValuesFrom
                       :fibo-sec-eq-eq/ConvertiblePreferredShare,
                       :rdf/type :owl/Restriction},
                      :rdf/type :owl/Restriction}
                     :fibo-der-drc-raw/SubscriptionRight],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "subscription right entitling existing preferred, convertible shareholders to subscribe to new securities at a price normally lower than the prevailing market price"}})

(def PreferredSharePurchaseRight
  "purchase right that gives a prospective acquiree's preferred shareholders the right to buy preferred shares of the firm or preferred shares of anyone who acquires the firm at a deep discount to their fair market value"
  {:db/ident :fibo-der-drc-raw/PreferredSharePurchaseRight,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "preferred share purchase right"},
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-der-drc-bsc/hasUnderlier,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                          :owl/someValuesFrom :fibo-sec-eq-eq/PreferredShare,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-raw/PurchaseRight],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "purchase right that gives a prospective acquiree's preferred shareholders the right to buy preferred shares of the firm or preferred shares of anyone who acquires the firm at a deep discount to their fair market value"}})

(def PreferredShareSubscriptionRight
  "subscription right entitling existing preferred shareholders to subscribe to new securities at a price normally lower than the prevailing market price"
  {:db/ident :fibo-der-drc-raw/PreferredShareSubscriptionRight,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "preferred share subscription right"},
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-der-drc-bsc/hasUnderlier,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                          :owl/someValuesFrom :fibo-sec-eq-eq/PreferredShare,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-raw/SubscriptionRight],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "subscription right entitling existing preferred shareholders to subscribe to new securities at a price normally lower than the prevailing market price"}})

(def PrivateWarrant
  "warrant that is not tradable"
  {:db/ident :fibo-der-drc-raw/PrivateWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label "private warrant",
   :rdfs/subClassOf [:fibo-fbc-fi-fi/NonNegotiableSecurity
                     :fibo-der-drc-raw/Warrant],
   :skos/definition "warrant that is not tradable"})

(def PublicWarrant
  "warrant that may be traded over the counter (OTC) or through an exchange"
  {:db/ident :fibo-der-drc-raw/PublicWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label "public warrant",
   :rdfs/subClassOf [:fibo-fbc-fi-fi/NegotiableSecurity
                     :fibo-der-drc-raw/Warrant],
   :skos/definition
   "warrant that may be traded over the counter (OTC) or through an exchange"})

(def PurchaseRight
  "anti-takeover device that gives a prospective acquiree's shareholders the right to buy shares of the firm or shares of anyone who acquires the firm at a deep discount to their fair market value"
  {:db/ident :fibo-der-drc-raw/PurchaseRight,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The underlying is usually shares but this not necessarily the case. Also known as \"Poison Pill\"."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "purchase right"},
   :rdfs/subClassOf :fibo-fbc-fi-fi/Entitlement,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "anti-takeover device that gives a prospective acquiree's shareholders the right to buy shares of the firm or shares of anyone who acquires the firm at a deep discount to their fair market value"}})

(def PutWarrant
  "warrant giving the buyer (holder) the right, but not the obligation, to sell the assets specified (i.e., acquire cash in exchange for the underlying assets) back to the issuer at a fixed price or formula, on or before a specified date"
  {:db/ident :fibo-der-drc-raw/PutWarrant,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "put warrant"},
   :rdfs/subClassOf :fibo-der-drc-raw/Warrant,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "warrant giving the buyer (holder) the right, but not the obligation, to sell the assets specified (i.e., acquire cash in exchange for the underlying assets) back to the issuer at a fixed price or formula, on or before a specified date"}})

(def SubscriptionRight
  "privileges allotted to existing security holders, entitling them to subscribe to new securities at a price normally lower than the prevailing market price"
  {:db/ident :fibo-der-drc-raw/SubscriptionRight,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A subscription rights issue increases the number of shares in the market, thus leading to a dilution in each share's value."},
   :fibo-fnd-utl-av/synonym [{:rdf/language "en",
                              :rdf/value    "subscription privilege"}
                             {:rdf/language "en",
                              :rdf/value    "anti-dilution right"}
                             {:rdf/language "en",
                              :rdf/value    "preemptive right"}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subscription right"},
   :rdfs/subClassOf :fibo-fbc-fi-fi/Entitlement,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "privileges allotted to existing security holders, entitling them to subscribe to new securities at a price normally lower than the prevailing market price"}})

(def TraditionalWarrant
  "warrant that gives the holder the right, but not the obligation, to buy (call warrant) or to sell (put warrant) an underlying asset at a specified price (the strike or exercise price) by a predetermined date, issued by the issuer of the underlying instrument"
  {:db/ident :fibo-der-drc-raw/TraditionalWarrant,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :owl/disjointWith [:fibo-der-drc-raw/NakedWarrant
                      :fibo-der-drc-raw/CoveredWarrant],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "traditional warrant"},
   :rdfs/subClassOf :fibo-der-drc-raw/Warrant,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "warrant that gives the holder the right, but not the obligation, to buy (call warrant) or to sell (put warrant) an underlying asset at a specified price (the strike or exercise price) by a predetermined date, issued by the issuer of the underlying instrument"}})

(def Warrant
  "entitlement that permits the holder to purchase a specified amount of a financial instrument, commodity, currency or other asset during a specified period at a specified price"
  {:db/ident :fibo-der-drc-raw/Warrant,
   :fibo-fnd-utl-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Warrants are for any kind of instrument. Warrants may be privately issued and may not necessarily be traded on an exchange."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "warrant"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-dbt-ex/hasExerciseTerms,
                      :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseTerms,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/Entitlement],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "entitlement that permits the holder to purchase a specified amount of a financial instrument, commodity, currency or other asset during a specified period at a specified price"}})

(def hasConversionRatio
  "indicates the factor used to determine the number of warrants needed in order to buy or sell a specific number of securities or investment units"
  {:db/ident :fibo-der-drc-raw/hasConversionRatio,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-fi-fi/Entitlement,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has conversion ratio"},
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :fibo-fnd-qt-qtu/hasNumericValue,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the factor used to determine the number of warrants needed in order to buy or sell a specific number of securities or investment units"}})

(def hasOversubscribeOption
  "indicates whether the holders of the rights instrument may get securities in the event that other right holders choose not to subscribe"
  {:db/ident :fibo-der-drc-raw/hasOversubscribeOption,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-fi-fi/Entitlement,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has oversubscribe option"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates whether the holders of the rights instrument may get securities in the event that other right holders choose not to subscribe"}})

(def ^{:private true} Entitlement
  {:db/ident        :fibo-fbc-fi-fi/Entitlement,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf {:owl/minQualifiedCardinality 0,
                     :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
                     :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
                     :rdf/type       :owl/Restriction}})