(ns net.wikipunk.rdf.fibo-der-drc-raw
  "The Rights and Warrants ontology covers a range of financial instruments providing the holder with the privilege to subscribe to or receive specific assets on terms specified. These include rights (privileges) extended to existing security holders to make new securities available to them at reduced prices or for free, and warrants whereby the holder can purchase or sell back a given quantity of the instrument, commodity or currency during a specified period at a pre-defined price."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 Object Management Group, Inc."
                       "Copyright (c) 2015-2023 EDM Council, Inc."],
   :dcat/downloadURL
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
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/Baskets/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/DerivativesBasics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/CorporateBodies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Equities/EquityInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Quantities/QuantitiesAndUnits/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/MarketIndices/BasketIndices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/CurrencyContracts/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/RightsAndWarrants/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-cb"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/",
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
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-der-drc-raw",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "Rights and Warrants Ontology@en",
   :skos/changeNote
   "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."})

(def AllotmentRight
  "privileges allotted to existing security holders, entitling them to receive new securities free of charge"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :cmns-av/explanatoryNote
   #voc/lstr
    "Allotment generally means the distribution of equity, particularly shares granted to a participating underwriting firm during an initial public offering (IPO).@en",
   :cmns-av/synonym #voc/lstr "bonus right@en",
   :db/ident :fibo-der-drc-raw/AllotmentRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "allotment right@en",
   :rdfs/subClassOf [:fibo-der-sbd-sbd/EquityDerivative
                     :fibo-fbc-fi-fi/Entitlement
                     {:owl/onProperty :fibo-fnd-utl-alx/hasFormula,
                      :owl/someValuesFrom
                      :fibo-der-drc-raw/AllotmentRightFormula,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
                      :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "privileges allotted to existing security holders, entitling them to receive new securities free of charge@en"})

(def AllotmentRightFormula
  "rule applied to calculate the number of securities for an allotment right, typically based on the number of these instruments that the holder holds"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Note that there may be a combination of a rule expressed in text as well as an expression or more complex formula embedded in a contract for making this determination.@en",
   :db/ident :fibo-der-drc-raw/AllotmentRightFormula,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "allotment right formula@en",
   :rdfs/subClassOf :fibo-fnd-utl-alx/Formula,
   :skos/definition
   #voc/lstr
    "rule applied to calculate the number of securities for an allotment right, typically based on the number of these instruments that the holder holds@en"})

(def BasketWarrant
  "warrant that permits the holder to acquire a package or group of assets at a specified price during a specified period"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :db/ident :fibo-der-drc-raw/BasketWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "basket warrant@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom :fibo-sec-sec-bsk/BasketOfSecurities,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-raw/Warrant
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
                      :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-dbt-ex/hasExerciseTerms,
                      :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseTerms,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/Entitlement],
   :skos/definition
   #voc/lstr
    "warrant that permits the holder to acquire a package or group of assets at a specified price during a specified period@en"})

(def BondPurchaseRight
  "purchase right that gives a prospective acquiree's bondholders the right to buy bonds of the firm or bonds of anyone who acquires the firm at a deep discount to their fair market value"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :db/ident :fibo-der-drc-raw/BondPurchaseRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "bond purchase right@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                          :owl/someValuesFrom :fibo-sec-dbt-bnd/Bond,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-raw/PurchaseRight
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
     :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fi-fi/Entitlement],
   :skos/definition
   #voc/lstr
    "purchase right that gives a prospective acquiree's bondholders the right to buy bonds of the firm or bonds of anyone who acquires the firm at a deep discount to their fair market value@en"})

(def BondSubscriptionRight
  "subscription right entitling existing bond holders to subscribe to new securities at a price normally lower than the prevailing market price"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :db/ident :fibo-der-drc-raw/BondSubscriptionRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "bond subscription right@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                          :owl/someValuesFrom :fibo-sec-dbt-bnd/Bond,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-raw/SubscriptionRight
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
     :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fi-fi/Entitlement],
   :skos/definition
   #voc/lstr
    "subscription right entitling existing bond holders to subscribe to new securities at a price normally lower than the prevailing market price@en"})

(def CallPutWarrant
  "warrant that either does not specify call or put features, or that explicitly includes both a call and put feature"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019.@en",
   :db/ident :fibo-der-drc-raw/CallPutWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "call put warrant@en",
   :rdfs/subClassOf [:fibo-der-drc-raw/PutWarrant
                     :fibo-der-drc-raw/CallWarrant
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
                      :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-dbt-ex/hasExerciseTerms,
                      :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseTerms,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/Entitlement
                     :fibo-der-drc-raw/Warrant],
   :skos/definition
   #voc/lstr
    "warrant that either does not specify call or put features, or that explicitly includes both a call and put feature@en"})

(def CallWarrant
  "warrant giving the buyer (holder) the right, but not the obligation, to acquire specific underlying assets during a specified period at a specified price"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019.@en",
   :db/ident :fibo-der-drc-raw/CallWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "call warrant@en",
   :rdfs/subClassOf [:fibo-der-drc-raw/Warrant
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
                      :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-dbt-ex/hasExerciseTerms,
                      :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseTerms,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/Entitlement],
   :skos/definition
   #voc/lstr
    "warrant giving the buyer (holder) the right, but not the obligation, to acquire specific underlying assets during a specified period at a specified price@en"})

(def CombinedInstrumentsPurchaseRight
  "purchase right that gives a prospective acquiree's holders of multiple securities the right to buy securities of the firm or securities of anyone who acquires the firm at a deep discount to their fair market value"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :db/ident :fibo-der-drc-raw/CombinedInstrumentsPurchaseRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "combined instruments purchase right@en",
   :rdfs/subClassOf [:fibo-der-drc-raw/PurchaseRight
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
                      :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fi-fi/Entitlement],
   :skos/definition
   #voc/lstr
    "purchase right that gives a prospective acquiree's holders of multiple securities the right to buy securities of the firm or securities of anyone who acquires the firm at a deep discount to their fair market value@en"})

(def CombinedInstrumentsSubscriptionRight
  "subscription right entitling existing holders of multiple securities to subscribe to new securities at a price normally lower than the prevailing market price"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :db/ident :fibo-der-drc-raw/CombinedInstrumentsSubscriptionRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "combined instruments subscription right@en",
   :rdfs/subClassOf [:fibo-der-drc-raw/SubscriptionRight
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
                      :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fi-fi/Entitlement],
   :skos/definition
   #voc/lstr
    "subscription right entitling existing holders of multiple securities to subscribe to new securities at a price normally lower than the prevailing market price@en"})

(def CommodityWarrant
  "warrant that permits the holder to acquire a specified amount of a commodity during a specified period at a specified price"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :db/ident :fibo-der-drc-raw/CommodityWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "commodity warrant@en",
   :rdfs/subClassOf [:fibo-der-drc-raw/Warrant
                     :fibo-der-drc-comm/CommodityDerivative
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
                      :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-dbt-ex/hasExerciseTerms,
                      :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseTerms,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/Entitlement],
   :skos/definition
   #voc/lstr
    "warrant that permits the holder to acquire a specified amount of a commodity during a specified period at a specified price@en",
   :skos/example
   #voc/lstr
    "Commodity Warrants Australia (CWA) sells warrants based on 12 commodities and financial markets - crude oil, gold, silver, live cattle, corn, orange juice, soy, coffee, cocoa, the Dow Jones Industrial Average, the NASDAQ Composite Index and the S&P 500 Index.@en"})

(def CommonConvertibleSharePurchaseRight
  "purchase right that gives a prospective acquiree's common, convertible shareholders the right to buy common, convertible shares of the firm or common, convertible shares of anyone who acquires the firm at a deep discount to their fair market value"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :db/ident :fibo-der-drc-raw/CommonConvertibleSharePurchaseRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "common convertible share purchase right@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom
                      {:owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                       :owl/someValuesFrom
                       :fibo-sec-eq-eq/ConvertibleCommonShare,
                       :rdf/type :owl/Restriction},
                      :rdf/type :owl/Restriction}
                     :fibo-der-drc-raw/PurchaseRight
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
                      :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fi-fi/Entitlement],
   :skos/definition
   #voc/lstr
    "purchase right that gives a prospective acquiree's common, convertible shareholders the right to buy common, convertible shares of the firm or common, convertible shares of anyone who acquires the firm at a deep discount to their fair market value@en"})

(def CommonConvertibleShareSubscriptionRight
  "subscription right entitling existing common convertible shareholders to subscribe to new securities at a price normally lower than the prevailing market price"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :db/ident :fibo-der-drc-raw/CommonConvertibleShareSubscriptionRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "common convertible share subscription right@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom
                      {:owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                       :owl/someValuesFrom
                       :fibo-sec-eq-eq/ConvertibleCommonShare,
                       :rdf/type :owl/Restriction},
                      :rdf/type :owl/Restriction}
                     :fibo-der-drc-raw/SubscriptionRight
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
                      :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fi-fi/Entitlement],
   :skos/definition
   #voc/lstr
    "subscription right entitling existing common convertible shareholders to subscribe to new securities at a price normally lower than the prevailing market price@en"})

(def CommonSharePurchaseRight
  "purchase right that gives a prospective acquiree's common shareholders the right to buy common shares of the firm or common shares of anyone who acquires the firm at a deep discount to their fair market value"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :db/ident :fibo-der-drc-raw/CommonSharePurchaseRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "common share purchase right@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                          :owl/someValuesFrom :fibo-sec-eq-eq/CommonShare,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-raw/PurchaseRight
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
     :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fi-fi/Entitlement],
   :skos/definition
   #voc/lstr
    "purchase right that gives a prospective acquiree's common shareholders the right to buy common shares of the firm or common shares of anyone who acquires the firm at a deep discount to their fair market value@en"})

(def CommonShareSubscriptionRight
  "subscription right entitling existing common shareholders to subscribe to new securities at a price normally lower than the prevailing market price"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :db/ident :fibo-der-drc-raw/CommonShareSubscriptionRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "common share subscription right@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                          :owl/someValuesFrom :fibo-sec-eq-eq/CommonShare,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-raw/SubscriptionRight
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
     :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fi-fi/Entitlement],
   :skos/definition
   #voc/lstr
    "subscription right entitling existing common shareholders to subscribe to new securities at a price normally lower than the prevailing market price@en"})

(def CompanyWarrant
  "equity warrant to purchase shares of capital stock issued by the corporation whose equity is the underlying asset"
  {:db/ident :fibo-der-drc-raw/CompanyWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "company warrant@en",
   :rdfs/seeAlso ["https://www.lawinsider.com/dictionary/company-warrant"],
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
     :owl/someValuesFrom {:owl/allValuesFrom :fibo-be-le-cb/StockCorporation,
                          :owl/onProperty    :fibo-fnd-rel-rel/hasIdentity,
                          :rdf/type          :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-raw/TraditionalWarrant
    :fibo-der-drc-raw/EquityWarrant
    :fibo-der-sbd-sbd/EquityDerivative
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
     :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-sec-dbt-ex/hasExerciseTerms,
     :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseTerms,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/Entitlement
    :fibo-der-drc-raw/Warrant],
   :skos/definition
   #voc/lstr
    "equity warrant to purchase shares of capital stock issued by the corporation whose equity is the underlying asset@en"})

(def CoveredWarrant
  "warrant that gives the holder the right, but not the obligation, to buy (call warrant) or to sell (put warrant) an underlying asset at a specified price (the strike or exercise price) by a predetermined date, issued without an accompanying security by a third party that holds as many securities as would be required if all the warrants are exercised"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :cmns-av/explanatoryNote
   [#voc/lstr
     "In contrast to traditional equity warrants, with covered warrants, no new issuance of common stock occurs if the warrant is exercised. The underlying shares of common stock are usually either owned by the issuer of the covered warrants or the issuer has a mechanism, such as owning equity warrants for the underlying shares, through which they can obtain the shares.@en"
    #voc/lstr
     "Covered warrants are very similar to options in that they can be created to allow holders to benefit from either rising prices or falling prices, by having both put and call warrants. They can also be created on a wide variety of underlying instruments, not just equities and they are fairly standardised and are mostly traded on exchanges. The main difference is that warrants tend to have longer maturity dates, typically measured in years instead of months (as with options), and are easier to access for individuals as they can be bought and sold in the same way as shares in the stock exchange.@en"],
   :db/ident :fibo-der-drc-raw/CoveredWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "covered warrant@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
                      :owl/someValuesFrom
                      :fibo-fbc-fct-fse/FinancialInstitution,
                      :rdf/type :owl/Restriction}
                     :fibo-der-drc-raw/Warrant
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
                      :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-dbt-ex/hasExerciseTerms,
                      :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseTerms,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/Entitlement],
   :skos/definition
   #voc/lstr
    "warrant that gives the holder the right, but not the obligation, to buy (call warrant) or to sell (put warrant) an underlying asset at a specified price (the strike or exercise price) by a predetermined date, issued without an accompanying security by a third party that holds as many securities as would be required if all the warrants are exercised@en"})

(def CurrencyWarrant
  "warrant that permits the holder to acquire a specified amount in a certain currency at a specified exchange rate during a specified period"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :db/ident :fibo-der-drc-raw/CurrencyWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "currency warrant@en",
   :rdfs/subClassOf [:fibo-der-drc-raw/Warrant
                     :fibo-der-drc-cur/CurrencyDerivative
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
                      :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-dbt-ex/hasExerciseTerms,
                      :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseTerms,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/Entitlement],
   :skos/definition
   #voc/lstr
    "warrant that permits the holder to acquire a specified amount in a certain currency at a specified exchange rate during a specified period@en"})

(def DebtWarrant
  "warrant that permits the holder to acquire a specified amount of a debt instrument or related debt observable a specified period at a specified price"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :db/ident :fibo-der-drc-raw/DebtWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "debt warrant@en",
   :rdfs/subClassOf [:fibo-der-sbd-sbd/DebtInstrumentDerivative
                     :fibo-der-drc-raw/Warrant
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
                      :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-dbt-ex/hasExerciseTerms,
                      :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseTerms,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/Entitlement],
   :skos/definition
   #voc/lstr
    "warrant that permits the holder to acquire a specified amount of a debt instrument or related debt observable a specified period at a specified price@en"})

(def EquityWarrant
  "warrant that permits the holder to acquire a specified amount of an equity instrument during a specified period at a specified price"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :db/ident :fibo-der-drc-raw/EquityWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "equity warrant@en",
   :rdfs/subClassOf [:fibo-der-sbd-sbd/EquityDerivative
                     :fibo-der-drc-raw/Warrant
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
                      :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-dbt-ex/hasExerciseTerms,
                      :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseTerms,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/Entitlement],
   :skos/definition
   #voc/lstr
    "warrant that permits the holder to acquire a specified amount of an equity instrument during a specified period at a specified price@en"})

(def ExchangeTradedWarrant
  "warrant that is listed on a securities exchange"
  {:db/ident :fibo-der-drc-raw/ExchangeTradedWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "exchange-traded warrant@en",
   :rdfs/subClassOf [:fibo-sec-sec-lst/ListedSecurity
                     :fibo-der-drc-raw/PublicWarrant
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
                      :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-dbt-ex/hasExerciseTerms,
                      :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseTerms,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/Entitlement
                     :fibo-fbc-fi-fi/NegotiableSecurity
                     :fibo-der-drc-raw/Warrant],
   :skos/definition #voc/lstr
                     "warrant that is listed on a securities exchange@en"})

(def IndexWarrant
  "warrant that permits the holder to acquire a specified amount based on the performance of an index during a specified period at a specified price"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :db/ident :fibo-der-drc-raw/IndexWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "index warrant@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
     :owl/someValuesFrom {:owl/minQualifiedCardinality 0,
                          :owl/onClass    {:owl/unionOf
                                           [:fibo-ind-ei-ei/EconomicIndicator
                                            :fibo-ind-mkt-bas/ReferenceIndex],
                                           :rdf/type :owl/Class},
                          :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                          :rdf/type       :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-raw/Warrant
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
     :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-sec-dbt-ex/hasExerciseTerms,
     :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseTerms,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/Entitlement],
   :skos/definition
   #voc/lstr
    "warrant that permits the holder to acquire a specified amount based on the performance of an index during a specified period at a specified price@en"})

(def NakedWarrant
  "warrant that gives the holder the right, but not the obligation, to buy (call warrant) or to sell (put warrant) an underlying asset at a specified price (the strike or exercise price) by a predetermined date, issued without an accompanying security by a third party that does not hold as many securities as would be required if all the warrants are exercised"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :db/ident :fibo-der-drc-raw/NakedWarrant,
   :owl/disjointWith :fibo-der-drc-raw/CoveredWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "naked warrant@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
                      :owl/someValuesFrom
                      :fibo-fbc-fct-fse/FinancialInstitution,
                      :rdf/type :owl/Restriction}
                     :fibo-der-drc-raw/Warrant
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
                      :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-dbt-ex/hasExerciseTerms,
                      :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseTerms,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/Entitlement],
   :skos/definition
   #voc/lstr
    "warrant that gives the holder the right, but not the obligation, to buy (call warrant) or to sell (put warrant) an underlying asset at a specified price (the strike or exercise price) by a predetermined date, issued without an accompanying security by a third party that does not hold as many securities as would be required if all the warrants are exercised@en"})

(def PerpetualWarrant
  "warrant without an expiration date, giving the holder the right, but not the obligation, to buy (call warrant) or to sell (put warrant) an underlying asset at a certain strike price"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :cmns-av/explanatoryNote
   #voc/lstr
    "The strike price, in the case of a perpetual warrant, is usually higher than the market value of the underlying asset at the time of issue.@en",
   :db/ident :fibo-der-drc-raw/PerpetualWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label "perpetual warrant",
   :rdfs/subClassOf [:fibo-der-drc-raw/Warrant
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
                      :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-dbt-ex/hasExerciseTerms,
                      :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseTerms,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/Entitlement],
   :skos/definition
   "warrant without an expiration date, giving the holder the right, but not the obligation, to buy (call warrant) or to sell (put warrant) an underlying asset at a certain strike price"})

(def PreferredConvertibleSharePurchaseRight
  "purchase right that gives a prospective acquiree's preferred, convertible shareholders the right to buy preferred, convertible shares of the firm or preferred, convertible shares of anyone who acquires the firm at a deep discount to their fair market value"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :db/ident :fibo-der-drc-raw/PreferredConvertibleSharePurchaseRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "preferred convertible share purchase right@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom
                      {:owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                       :owl/someValuesFrom
                       :fibo-sec-eq-eq/ConvertiblePreferredShare,
                       :rdf/type :owl/Restriction},
                      :rdf/type :owl/Restriction}
                     :fibo-der-drc-raw/PurchaseRight
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
                      :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fi-fi/Entitlement],
   :skos/definition
   #voc/lstr
    "purchase right that gives a prospective acquiree's preferred, convertible shareholders the right to buy preferred, convertible shares of the firm or preferred, convertible shares of anyone who acquires the firm at a deep discount to their fair market value@en"})

(def PreferredConvertibleShareSubscriptionRight
  "subscription right entitling existing preferred, convertible shareholders to subscribe to new securities at a price normally lower than the prevailing market price"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :db/ident :fibo-der-drc-raw/PreferredConvertibleShareSubscriptionRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "preferred convertible share subscription right@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom
                      {:owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                       :owl/someValuesFrom
                       :fibo-sec-eq-eq/ConvertiblePreferredShare,
                       :rdf/type :owl/Restriction},
                      :rdf/type :owl/Restriction}
                     :fibo-der-drc-raw/SubscriptionRight
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
                      :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fi-fi/Entitlement],
   :skos/definition
   #voc/lstr
    "subscription right entitling existing preferred, convertible shareholders to subscribe to new securities at a price normally lower than the prevailing market price@en"})

(def PreferredSharePurchaseRight
  "purchase right that gives a prospective acquiree's preferred shareholders the right to buy preferred shares of the firm or preferred shares of anyone who acquires the firm at a deep discount to their fair market value"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :db/ident :fibo-der-drc-raw/PreferredSharePurchaseRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "preferred share purchase right@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                          :owl/someValuesFrom :fibo-sec-eq-eq/PreferredShare,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-raw/PurchaseRight
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
     :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fi-fi/Entitlement],
   :skos/definition
   #voc/lstr
    "purchase right that gives a prospective acquiree's preferred shareholders the right to buy preferred shares of the firm or preferred shares of anyone who acquires the firm at a deep discount to their fair market value@en"})

(def PreferredShareSubscriptionRight
  "subscription right entitling existing preferred shareholders to subscribe to new securities at a price normally lower than the prevailing market price"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :db/ident :fibo-der-drc-raw/PreferredShareSubscriptionRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "preferred share subscription right@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                          :owl/someValuesFrom :fibo-sec-eq-eq/PreferredShare,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-raw/SubscriptionRight
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
     :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fi-fi/Entitlement],
   :skos/definition
   #voc/lstr
    "subscription right entitling existing preferred shareholders to subscribe to new securities at a price normally lower than the prevailing market price@en"})

(def PrivateWarrant
  "warrant that is not tradable"
  {:db/ident :fibo-der-drc-raw/PrivateWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label "private warrant",
   :rdfs/subClassOf [:fibo-fbc-fi-fi/NonNegotiableSecurity
                     :fibo-der-drc-raw/Warrant
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
                      :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-dbt-ex/hasExerciseTerms,
                      :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseTerms,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/Entitlement],
   :skos/definition "warrant that is not tradable"})

(def PublicWarrant
  "warrant that may be traded over the counter (OTC) or through an exchange"
  {:db/ident :fibo-der-drc-raw/PublicWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label "public warrant",
   :rdfs/subClassOf [:fibo-fbc-fi-fi/NegotiableSecurity
                     :fibo-der-drc-raw/Warrant
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
                      :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-dbt-ex/hasExerciseTerms,
                      :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseTerms,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/Entitlement],
   :skos/definition
   "warrant that may be traded over the counter (OTC) or through an exchange"})

(def PurchaseRight
  "anti-takeover device that gives a prospective acquiree's shareholders the right to buy shares of the firm or shares of anyone who acquires the firm at a deep discount to their fair market value"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :cmns-av/explanatoryNote
   #voc/lstr
    "The underlying is usually shares but this not necessarily the case. Also known as \"Poison Pill\".@en",
   :db/ident :fibo-der-drc-raw/PurchaseRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "purchase right@en",
   :rdfs/subClassOf [:fibo-fbc-fi-fi/Entitlement
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
                      :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "anti-takeover device that gives a prospective acquiree's shareholders the right to buy shares of the firm or shares of anyone who acquires the firm at a deep discount to their fair market value@en"})

(def PutWarrant
  "warrant giving the buyer (holder) the right, but not the obligation, to sell the assets specified (i.e., acquire cash in exchange for the underlying assets) back to the issuer at a fixed price or formula, on or before a specified date"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019.@en",
   :db/ident :fibo-der-drc-raw/PutWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "put warrant@en",
   :rdfs/subClassOf [:fibo-der-drc-raw/Warrant
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
                      :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-dbt-ex/hasExerciseTerms,
                      :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseTerms,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/Entitlement],
   :skos/definition
   #voc/lstr
    "warrant giving the buyer (holder) the right, but not the obligation, to sell the assets specified (i.e., acquire cash in exchange for the underlying assets) back to the issuer at a fixed price or formula, on or before a specified date@en"})

(def SubscriptionRight
  "privileges allotted to existing security holders, entitling them to subscribe to new securities at a price normally lower than the prevailing market price"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :cmns-av/explanatoryNote
   #voc/lstr
    "A subscription rights issue increases the number of shares in the market, thus leading to a dilution in each share's value.@en",
   :cmns-av/synonym [#voc/lstr "preemptive right@en"
                     #voc/lstr "anti-dilution right@en"
                     #voc/lstr "subscription privilege@en"],
   :db/ident :fibo-der-drc-raw/SubscriptionRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "subscription right@en",
   :rdfs/subClassOf [:fibo-fbc-fi-fi/Entitlement
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
                      :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "privileges allotted to existing security holders, entitling them to subscribe to new securities at a price normally lower than the prevailing market price@en"})

(def TraditionalWarrant
  "warrant that gives the holder the right, but not the obligation, to buy (call warrant) or to sell (put warrant) an underlying asset at a specified price (the strike or exercise price) by a predetermined date, issued by the issuer of the underlying instrument"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :db/ident :fibo-der-drc-raw/TraditionalWarrant,
   :owl/disjointWith [:fibo-der-drc-raw/NakedWarrant
                      :fibo-der-drc-raw/CoveredWarrant],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "traditional warrant@en",
   :rdfs/subClassOf [:fibo-der-drc-raw/Warrant
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
                      :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-dbt-ex/hasExerciseTerms,
                      :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseTerms,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/Entitlement],
   :skos/definition
   #voc/lstr
    "warrant that gives the holder the right, but not the obligation, to buy (call warrant) or to sell (put warrant) an underlying asset at a specified price (the strike or exercise price) by a predetermined date, issued by the issuer of the underlying instrument@en"})

(def Warrant
  "entitlement that permits the holder to purchase a specified amount of a financial instrument, commodity, currency or other asset during a specified period at a specified price"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :cmns-av/explanatoryNote
   #voc/lstr
    "Warrants are for any kind of instrument. Warrants may be privately issued and may not necessarily be traded on an exchange.@en",
   :db/ident :fibo-der-drc-raw/Warrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "warrant@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-dbt-ex/hasExerciseTerms,
                      :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseTerms,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/Entitlement
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-sec-iss/SecurityForm,
                      :owl/onProperty :fibo-sec-sec-iss/isIssuedInForm,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "entitlement that permits the holder to purchase a specified amount of a financial instrument, commodity, currency or other asset during a specified period at a specified price@en"})

(def hasConversionRatio
  "indicates the factor used to determine the number of warrants needed in order to buy or sell a specific number of securities or investment units"
  {:db/ident :fibo-der-drc-raw/hasConversionRatio,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-fi-fi/Entitlement,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "has conversion ratio@en",
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :fibo-fnd-qt-qtu/hasNumericValue,
   :skos/definition
   #voc/lstr
    "indicates the factor used to determine the number of warrants needed in order to buy or sell a specific number of securities or investment units@en"})

(def hasOversubscribeOption
  "indicates whether the holders of the rights instrument may get securities in the event that other right holders choose not to subscribe"
  {:db/ident :fibo-der-drc-raw/hasOversubscribeOption,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-fi-fi/Entitlement,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfs/label #voc/lstr "has oversubscribe option@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #voc/lstr
    "indicates whether the holders of the rights instrument may get securities in the event that other right holders choose not to subscribe@en"})