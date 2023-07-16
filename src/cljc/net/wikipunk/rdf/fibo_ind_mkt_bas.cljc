(ns net.wikipunk.rdf.fibo-ind-mkt-bas
  "This ontology defines market indices as hypothetical portfolios of investment holdings that correspond to some segment of the financial market, whose value is determined by the prices of the underlying holdings. Coverage includes credit indices, security-based indices, economic indicator based indices, and combinations thereof."
  {:cmns-av/copyright ["Copyright (c) 2014-2023 Object Management Group, Inc."
                       "Copyright (c) 2014-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/",
   :dcterms/abstract
   "This ontology defines market indices as hypothetical portfolios of investment holdings that correspond to some segment of the financial market, whose value is determined by the prices of the underlying holdings. Coverage includes credit indices, security-based indices, economic indicator based indices, and combinations thereof.",
   :dcterms/license {:rdfa/uri "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesClassification/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/ClassificationSchemes/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/Classifiers/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Equities/EquityInstruments/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Quantities/QuantitiesAndUnits/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/Baskets/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/CreditEvents/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/ContextualDesignators/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/Collections/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/DatesAndTimes/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/MarketIndices/BasketIndices/"},
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-dae-cre"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-arr-cls"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/",
    "fibo-fnd-arr-doc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-qt-qtu"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-alx"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-mkt-bas"
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/",
    "fibo-sec-eq-eq"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
    "fibo-sec-sec-bsk"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Baskets/",
    "fibo-sec-sec-cls"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-ind-mkt-bas",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/",
   :rdfs/label #xsd/langString "Basket Indices Ontology@en",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices.rdf version of this ontology was revised to add the details needed to calculate market cap for a capitalization-based weighting function."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices.rdf version of this ontology was revised to remedy an illegal property chain (replacing it with an existing non-chained property) in the definition of market capitalization."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices.rdf version of this ontology was revised to reflect the move of hasTerm from FinancialInstruments to Contracts."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices.rdf version of this ontology was revised to loosen the restriction on a reference index to simply reference any weighted basket so that one could include commodity indices, for example."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices.rdf version of this ontology was revised to address text processing hygiene issues."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices.rdf version of this ontology was revised to eliminate the restriction on reference index that it has an index value - the restriction should be on the quantity value such that the value refers to the indicator it represents."]})

(def BasketOfCreditRisks
  "basket of instruments, legal entities, or a combination thereof collected for the purpose of analyzing risk"
  {:cmns-av/explanatoryNote
   #xsd/langString
    "Note that the risk related to a given constituent may be calculated based on either (1) the overall credit risk associated with the entity or, (2) the combined risk associated with an entity and the specific instrument identified, or (3) risk associated with the instrument on its own. Criteria for constituents is based on sectors (emerging market, financial, sovereign, etc), spread range (investment grade, non-investment grade), or asset type (loan, bond, mortgage-backed, asset-backed), second criteria is based on maturity of protection (2,3,5,7,10 yrs). Markit manages over 2000 CDS indexes, for example.@en",
   :db/ident :fibo-ind-mkt-bas/BasketOfCreditRisks,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/"},
   :rdfs/label #xsd/langString "basket of credit risks@en",
   :rdfs/subClassOf [{:owl/onProperty :cmns-col/hasConstituent,
                      :owl/someValuesFrom
                      :fibo-ind-mkt-bas/CreditIndexConstituent,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-dt-fd/DatedStructuredCollection
                     :fibo-fbc-pas-fpas/WeightedBasket],
   :skos/definition
   #xsd/langString
    "basket of instruments, legal entities, or a combination thereof collected for the purpose of analyzing risk@en"})

(def BasketOfEquities
  "basket of securities whose constituents are listed shares"
  {:db/ident :fibo-ind-mkt-bas/BasketOfEquities,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/"},
   :rdfs/label #xsd/langString "basket of equities@en",
   :rdfs/subClassOf [{:owl/onProperty :cmns-col/hasConstituent,
                      :owl/someValuesFrom
                      {:owl/unionOf
                       [:fibo-sec-sec-bsk/SecuritiesBasketConstituent
                        {:owl/allValuesFrom :fibo-sec-eq-eq/ListedShare,
                         :owl/onProperty    :cmns-col/comprises,
                         :rdf/type          :owl/Restriction}],
                       :rdf/type :owl/Class},
                      :rdf/type :owl/Restriction}
                     :fibo-sec-sec-bsk/BasketOfSecurities],
   :skos/definition
   #xsd/langString
    "basket of securities whose constituents are listed shares@en"})

(def CapitalizationBasedWeightingFunction
  "weighting function derived from the relative market capitalization (share price times the number of shares outstanding) of the companies tracked by an index"
  {:db/ident :fibo-ind-mkt-bas/CapitalizationBasedWeightingFunction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/"},
   :rdfs/label #xsd/langString "capitalization-based weighting function@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-utl-alx/hasArgument,
                      :owl/someValuesFrom
                      :fibo-ind-mkt-bas/MarketCapitalization,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/WeightingFunction],
   :skos/definition
   #xsd/langString
    "weighting function derived from the relative market capitalization (share price times the number of shares outstanding) of the companies tracked by an index@en"})

(def CreditIndex
  "reference index that is a function of credit events that change the value of an underlying portfolio"
  {:cmns-av/explanatoryNote
   #xsd/langString
    "Such an index does not necessarily reference a static portfolio, as there may be provisions for replacing defaulted securities on which the index depends.@en",
   :db/ident :fibo-ind-mkt-bas/CreditIndex,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/"},
   :rdfs/label #xsd/langString "credit index@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-dae-dbt/isBasedOn,
                      :owl/someValuesFrom :fibo-ind-mkt-bas/BasketOfCreditRisks,
                      :rdf/type           :owl/Restriction}
                     :fibo-ind-mkt-bas/ReferenceIndex
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-utl-alx/hasReleaseDate,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-sec-sec-cls/AssetClass,
                      :owl/onProperty :cmns-cls/isClassifiedBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/allValuesFrom :fibo-fnd-dt-fd/RecurrenceInterval,
                      :owl/onProperty    :fibo-fnd-utl-alx/hasPeriodicity,
                      :rdf/type          :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-dae-dbt/isBasedOn,
                      :owl/someValuesFrom :fibo-fbc-pas-fpas/WeightedBasket,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :cmns-dt/ExplicitDatePeriod,
                      :owl/onProperty :fibo-fnd-arr-doc/hasReportingPeriod,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :fibo-fnd-utl-alx/hasReleaseDateTime,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass :fibo-fnd-arr-cls/IndustrySectorClassifier,
                      :owl/onProperty :cmns-cls/isClassifiedBy,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/ScopedMeasure],
   :skos/definition
   #xsd/langString
    "reference index that is a function of credit events that change the value of an underlying portfolio@en"})

(def CreditIndexConstituent
  "constituent of a basket of credit risks"
  {:db/ident :fibo-ind-mkt-bas/CreditIndexConstituent,
   :owl/equivalentClass {:owl/onProperty :cmns-col/isConstituentOf,
                         :owl/someValuesFrom
                         :fibo-ind-mkt-bas/BasketOfCreditRisks,
                         :rdf/type :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/"},
   :rdfs/label #xsd/langString "credit index constituent@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-fbc-dae-cre/CreditEvent,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-acc-cur/hasCurrency,
                      :owl/someValuesFrom :fibo-fnd-acc-cur/Currency,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-fd/DatedCollectionConstituent
                     :fibo-fbc-pas-fpas/WeightedBasketConstituent],
   :skos/definition #xsd/langString
                     "constituent of a basket of credit risks@en"})

(def EquityIndex
  "benchmark whose constituents are exclusively equity instruments"
  {:db/ident :fibo-ind-mkt-bas/EquityIndex,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/"},
   :rdfs/label #xsd/langString "equity index@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-dae-dbt/isBasedOn,
                      :owl/someValuesFrom :fibo-ind-mkt-bas/BasketOfEquities,
                      :rdf/type           :owl/Restriction}
                     :fibo-ind-mkt-bas/ReferenceIndex
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-utl-alx/hasReleaseDate,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-sec-sec-cls/AssetClass,
                      :owl/onProperty :cmns-cls/isClassifiedBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/allValuesFrom :fibo-fnd-dt-fd/RecurrenceInterval,
                      :owl/onProperty    :fibo-fnd-utl-alx/hasPeriodicity,
                      :rdf/type          :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-dae-dbt/isBasedOn,
                      :owl/someValuesFrom :fibo-fbc-pas-fpas/WeightedBasket,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :cmns-dt/ExplicitDatePeriod,
                      :owl/onProperty :fibo-fnd-arr-doc/hasReportingPeriod,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :fibo-fnd-utl-alx/hasReleaseDateTime,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass :fibo-fnd-arr-cls/IndustrySectorClassifier,
                      :owl/onProperty :cmns-cls/isClassifiedBy,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/ScopedMeasure],
   :skos/definition
   #xsd/langString
    "benchmark whose constituents are exclusively equity instruments@en"})

(def MarketCapitalization
  "expression representing the perceived value of a company as determined by the stock market at a specific point in time"
  {:cmns-av/synonym #xsd/langString "market cap@en",
   :db/ident :fibo-ind-mkt-bas/MarketCapitalization,
   :fibo-fnd-utl-alx/actualExpression
   #xsd/langString "number of shares outstanding x price per share@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/"},
   :rdfs/label #xsd/langString "market capitalization@en",
   :rdfs/subClassOf [{:owl/onProperty
                      :fibo-ind-mkt-bas/hasMarketCapitalizationValue,
                      :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryAmount,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
                      :owl/someValuesFrom :fibo-sec-eq-eq/PricePerShare,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-sec-eq-eq/ShareIssuer,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-dt/hasObservedDateTime,
                      :owl/someValuesFrom :cmns-dt/CombinedDateTime,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-utl-alx/Expression
                     {:owl/onProperty     :fibo-sec-eq-eq/hasSharesOutstanding,
                      :owl/someValuesFrom :xsd/nonNegativeInteger,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "expression representing the perceived value of a company as determined by the stock market at a specific point in time@en"})

(def ReferenceIndex
  "measure of change in the value of the contents of a basket over a given period of time"
  {:cmns-av/explanatoryNote
   #xsd/langString
    "An index is a function based on a set of structured calculations with respect to a basket of credit risks, financial instruments or other indices over time. Analysis may be computed based on historical values, projected values, etc.@en",
   :cmns-av/synonym #xsd/langString "benchmark@en",
   :db/ident :fibo-ind-mkt-bas/ReferenceIndex,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/"},
   :rdfs/label #xsd/langString "reference index@en",
   :rdfs/subClassOf [:fibo-fnd-utl-alx/ScopedMeasure
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-utl-alx/hasReleaseDate,
                      :rdf/type       :owl/Restriction}
                     {:owl/allValuesFrom :fibo-fnd-dt-fd/RecurrenceInterval,
                      :owl/onProperty    :fibo-fnd-utl-alx/hasPeriodicity,
                      :rdf/type          :owl/Restriction}
                     {:owl/onClass    :cmns-dt/ExplicitDatePeriod,
                      :owl/onProperty :fibo-fnd-arr-doc/hasReportingPeriod,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass :fibo-fnd-arr-cls/IndustrySectorClassifier,
                      :owl/onProperty :cmns-cls/isClassifiedBy,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-dae-dbt/isBasedOn,
                      :owl/someValuesFrom :fibo-fbc-pas-fpas/WeightedBasket,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-sec-sec-cls/AssetClass,
                      :owl/onProperty :cmns-cls/isClassifiedBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :fibo-fnd-utl-alx/hasReleaseDateTime,
                      :rdf/type        :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "measure of change in the value of the contents of a basket over a given period of time@en"})

(def hasDebtRanking
  "indicates the ranking of this debt instrument with respect to the credit index as a whole"
  {:db/ident :fibo-ind-mkt-bas/hasDebtRanking,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-ind-mkt-bas/CreditIndexConstituent,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/"},
   :rdfs/label #xsd/langString "has debt ranking@en",
   :rdfs/range :xsd/string,
   :skos/definition
   #xsd/langString
    "indicates the ranking of this debt instrument with respect to the credit index as a whole@en"})

(def hasDurationOfProtection
  {:db/ident :fibo-ind-mkt-bas/hasDurationOfProtection,
   :owl/deprecated true,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/"}})

(def hasIndexName
  "specifies a formal name for the index"
  {:db/ident :fibo-ind-mkt-bas/hasIndexName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-ind-mkt-bas/ReferenceIndex,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/"},
   :rdfs/label #xsd/langString "has index name@en",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/hasFormalName,
   :skos/definition #xsd/langString "specifies a formal name for the index@en"})

(def hasIndexValue
  "specifies the value of a given index as of the release date"
  {:db/ident :fibo-ind-mkt-bas/hasIndexValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/"},
   :rdfs/label "has index value",
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :fibo-fnd-qt-qtu/hasNumericValue,
   :skos/definition
   "specifies the value of a given index as of the release date"})

(def hasMarketCapitalization
  "indicates the market capitalization of some issuer as of some date"
  {:db/ident :fibo-ind-mkt-bas/hasMarketCapitalization,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-eq/ShareIssuer,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/"},
   :rdfs/label #xsd/langString "has market capitalization@en",
   :rdfs/range :fibo-ind-mkt-bas/MarketCapitalization,
   :skos/definition
   #xsd/langString
    "indicates the market capitalization of some issuer as of some date@en"})

(def hasMarketCapitalizationValue
  "indicates the monetary amount representing the market capitalization of some issuer as of some date"
  {:db/ident :fibo-ind-mkt-bas/hasMarketCapitalizationValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-ind-mkt-bas/MarketCapitalization,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/"},
   :rdfs/label #xsd/langString "has market capitalization value@en",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   #xsd/langString
    "indicates the monetary amount representing the market capitalization of some issuer as of some date@en"})

(def hasOriginalNotionalValue
  "indicates the notional amount represented by the index when it is first constituted"
  {:db/ident :fibo-ind-mkt-bas/hasOriginalNotionalValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-ind-mkt-bas/CreditIndex,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/"},
   :rdfs/label #xsd/langString "has original notional value@en",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasNotionalAmount,
   :skos/definition
   #xsd/langString
    "indicates the notional amount represented by the index when it is first constituted@en"})

(def hasPremium
  "indicates a premium payable for a contract based on the index"
  {:db/ident :fibo-ind-mkt-bas/hasPremium,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-ind-mkt-bas/CreditIndex,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/"},
   :rdfs/label #xsd/langString "has premium@en",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   #xsd/langString
    "indicates a premium payable for a contract based on the index@en"})

(def hasSpreadRange
  "the range of credit spread for the constituents of the index"
  {:db/ident :fibo-ind-mkt-bas/hasSpreadRange,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-ind-mkt-bas/CreditIndex,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/"},
   :rdfs/label #xsd/langString "has spread range@en",
   :rdfs/range :xsd/string,
   :skos/definition
   #xsd/langString
    "the range of credit spread for the constituents of the index@en"})

(def hasUpFrontFee
  "specifies a fee payable by any party that wishes to participate in a contract based on the index after the start of its life"
  {:db/ident :fibo-ind-mkt-bas/hasUpFrontFee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-ind-mkt-bas/CreditIndex,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/"},
   :rdfs/label #xsd/langString "has up front fee@en",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   #xsd/langString
    "specifies a fee payable by any party that wishes to participate in a contract based on the index after the start of its life@en"})