(ns net.wikipunk.rdf.fibo-md-dbtx-aly
  "This ontology covers an extensive range of analytical measures for debt instruments and pools of debt instruments. These cover the well-known concepts of convexity, duration and life, as well as weighted average loan ages and maturities, prepayments speeds etc. for debt pools. Most of the widely referenced variants of these are included, for example modified duration. Some yield related concepts (e.g. for equivalent yield) are also included. Debt pricing and yields are intimately related, and this ontology sets out the basic concepts of debt price, including different ways in which debt and bod prices are described and calculated, as well as a range of different kinds of yield (simple yield, Wall Street Yield, Japanese Yield and so on). The pricing terms are supported by a range of trading and exchange related concepts that are used to differentiate different kinds of debt price, for example last, high and low exchange prices."
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :dcterms/abstract
   "This ontology covers an extensive range of analytical measures for debt instruments and pools of debt instruments. These cover the well-known concepts of convexity, duration and life, as well as weighted average loan ages and maturities, prepayments speeds etc. for debt pools. Most of the widely referenced variants of these are included, for example modified duration. Some yield related concepts (e.g. for equivalent yield) are also included. Debt pricing and yields are intimately related, and this ontology sets out the basic concepts of debt price, including different ways in which debt and bod prices are described and calculated, as well as a range of different kinds of yield (simple yield, Wall Street Yield, Japanese Yield and so on). The pricing terms are supported by a range of trading and exchange related concepts that are used to differentiate different kinds of debt price, for example last, high and low exchange prices.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/Indicators/Indicators/"
    "https://www.omg.org/spec/Commons/DatesAndTimes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/DebtInstruments/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/InterestRates/InterestRates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/Pools/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"
    "https://www.omg.org/spec/Commons/Classifiers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/Bonds/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/PoolBackedSecurities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/MortgageBackedSecurities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/ProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/InstrumentPricing/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/DebtTemporal/DebtAnalytics/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fbc-fi-ip"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-pas-pas"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-alx"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-ind-ind"
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/",
    "fibo-ind-ir-ir"
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
    "fibo-md-dbtx-aly"
    "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
    "fibo-sec-dbt-bnd"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/",
    "fibo-sec-dbt-dbti"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/",
    "fibo-sec-dbt-mbs"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
    "fibo-sec-dbt-pbs"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/",
    "fibo-sec-sec-pls"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-md-dbtx-aly",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "Debt Analytics Ontology@en"})

(def AbsolutePrepaymentRate
  "The absolute prepayment rate (for ABS) is the standard measure of prepayment rates in the auto-loan sector. ABS measures the monthly rate of loan prepayments as a percentage of the original pool balance. ABS is defined by the following formula where SMM refers to Single Monthly Mortality, which measures the percentage of dollars prepaid in a given month expressed as a percentage of the scheduled loan balance. ABS = (100 * SMM)/100 + (SMM X (Age- 1)"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "The ABS measurement differs from conditional prepayment rate (CPR) used in the mortgage industry, which measures prepayment as an annualized percentage of the current pool balance.@en",
   :db/ident :fibo-md-dbtx-aly/AbsolutePrepaymentRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "absolute prepayment rate@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-utl-alx/hasFormula,
     :owl/someValuesFrom :fibo-md-dbtx-aly/AbsolutePrepaymentRateFormula,
     :rdf/type           :owl/Restriction}
    :fibo-md-dbtx-aly/DebtPoolAnalyticalParameter
    :fibo-md-dbtx-aly/AbsolutePrepaymentRate
    {:owl/onProperty     :cmns-cxtdsg/appliesTo,
     :owl/someValuesFrom :fibo-md-dbtx-aly/CollectionOfDebtPools,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-utl-alx/ScopedMeasure
    {:owl/onProperty     :fibo-fnd-utl-alx/hasApplicableDatePeriod,
     :owl/someValuesFrom :cmns-dt/DatePeriod,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "The absolute prepayment rate (for ABS) is the standard measure of prepayment rates in the auto-loan sector. ABS measures the monthly rate of loan prepayments as a percentage of the original pool balance. ABS is defined by the following formula where SMM refers to Single Monthly Mortality, which measures the percentage of dollars prepaid in a given month expressed as a percentage of the scheduled loan balance. ABS = (100 * SMM)/100 + (SMM X (Age- 1)@en"})

(def AbsolutePrepaymentRateFormula
  "ABS is defined by the following formula where SMM refers to Single Monthly Mortality, which measures the percentage of dollars prepaid in a given month expressed as a percentage of the scheduled loan balance. ABS = (100 * SMM)/100 + (SMM X (Age- 1)"
  {:db/ident :fibo-md-dbtx-aly/AbsolutePrepaymentRateFormula,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "absolute prepayment rate formula@en",
   :rdfs/subClassOf [:fibo-fnd-utl-alx/Formula
                     :fibo-md-dbtx-aly/AbsolutePrepaymentRateFormula],
   :skos/definition
   #voc/lstr
    "ABS is defined by the following formula where SMM refers to Single Monthly Mortality, which measures the percentage of dollars prepaid in a given month expressed as a percentage of the scheduled loan balance. ABS = (100 * SMM)/100 + (SMM X (Age- 1)@en"})

(def AccruedInterestAmount
  "The interest accrued on the bond or debt instrument at the time that the price is quoted. If this is a dirty price, this is the amount of accrued interest that is included in the price. This is therefore passed on to the purchaser of the bond or debt instrument."
  {:db/ident :fibo-md-dbtx-aly/AccruedInterestAmount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "accrued interest amount@en",
   :rdfs/subClassOf [:fibo-fbc-dae-dbt/Interest
                     :fibo-md-dbtx-aly/AccruedInterestAmount],
   :skos/definition
   #voc/lstr
    "The interest accrued on the bond or debt instrument at the time that the price is quoted. If this is a dirty price, this is the amount of accrued interest that is included in the price. This is therefore passed on to the purchaser of the bond or debt instrument.@en"})

(def AverageLife
  "An estimate of the number of terms to maturity, taking the possibility of early payments into account. Average life is calculated using the weighted average time to the receipt of all future cash flows."
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Where it refers to pre-payment above, if the bond does not include prepayment then this is not included. However, analytics that refer to this e.g. Yield to Average Life, then this figure is relevant. It is not relevant for other types of bond where e.g. you would use yield to next call, yield to worst etc. Average Life used in place of Maturity for Yield Calculation. This is not only used for Yield calculations though. It is referred to as an analytic figure in its own right. Average Life uses one of a number of standard pre-payment models (for structured finance at least). For MBS, the average life includes some calculations to take account of pre-payments on the underlying mortgages. This takes account of the possibillity of borrowers paying early. This has to be modeled or forecast (not given) as it's a function of market conditions and interest rate. You would not see this in a market data feed. When you model MBS you calculate Average Life as part of the model i.e. you estimate the percentage of prepayment in the next x length of time and factor this into the Average Life. Refers to Weighted Average Time to receipt of future cash flows. For MBS, early payments will shorten the Average Life. For Student Loans, Credit Card, Loan etc, i.e. all Pool Backed (any bond that has securitized debt). Other bonds: Sinking Funds etc., also Early Payment - partial Call for a corporate / regular bond. Early Payment for pass through has the same effect. Sinking Fund: Each payment is part principal and part interest, this is implicit in the overall definition of \"Early payment\".@en",
   :db/ident :fibo-md-dbtx-aly/AverageLife,
   :owl/disjointWith :fibo-md-dbtx-aly/EquivalentLifeAnalytic,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "average life@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/PrepaymentSpeed,
                      :rdf/type           :owl/Restriction}
                     :fibo-md-dbtx-aly/LifeAnalytic
                     :fibo-md-dbtx-aly/AverageLife
                     :fibo-md-dbtx-aly/DebtInstrumentAnalyticalParameter
                     {:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/ScopedMeasure
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-sec-sec-pls/DebtPool,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "An estimate of the number of terms to maturity, taking the possibility of early payments into account. Average life is calculated using the weighted average time to the receipt of all future cash flows.@en"})

(def AverageLifeAtIssue
  "The Average Life analytic at the time the security was issued."
  {:db/ident :fibo-md-dbtx-aly/AverageLifeAtIssue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "average life at issue@en",
   :rdfs/subClassOf [:fibo-md-dbtx-aly/AverageLife
                     :fibo-md-dbtx-aly/AverageLifeAtIssue
                     :fibo-md-dbtx-aly/LifeAnalytic
                     :fibo-md-dbtx-aly/DebtInstrumentAnalyticalParameter
                     {:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/ScopedMeasure
                     {:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/PrepaymentSpeed,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-sec-sec-pls/DebtPool,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "The Average Life analytic at the time the security was issued.@en"})

(def BondEquivalentYield
  "Yield determined on an equivalent basis to the yield of another bond. This is used to be able to realistically compare prices between debt instruments across different markets."
  {:cmns-av/explanatoryNote
   #voc/lstr
    "For example when comparing Treasury with Corp it's called a Corp Bond Equivalent Yield; when comparing other kinds of yields this would be labelled differently. Treasury bills typically in discount rates - that's one of the ways you would compare TB or MM or RePo to BEQ - by changing the day count. Detailed implementation of this: This term refers to the type of bond that it is equivalent to, that is the type of bond whose yield is normally determined according to the yield calculation method that is used in determining this Bond Equivalent Yield figure. The type of bond in this instance is defined in relation to the market on which that bond trades, for example the US Corporate Bond Market.@en",
   :db/ident :fibo-md-dbtx-aly/BondEquivalentYield,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "bond equivalent yield@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fbc-dae-dbt/isBasedOn,
     :owl/someValuesFrom :fibo-md-dbtx-aly/EquivalentYieldCalculationMethod,
     :rdf/type           :owl/Restriction}
    :fibo-md-dbtx-aly/RelativelyDefinedDebtInstrumentYield
    :fibo-md-dbtx-aly/BondEquivalentYield
    {:owl/onProperty     :fibo-md-dbtx-aly/hasOutlookPeriod,
     :owl/someValuesFrom {:owl/unionOf
                          [:fibo-md-dbtx-aly/LifeAnalytic
                           {:owl/onProperty
                            :fibo-fbc-dae-dbt/hasOriginalTimeToMaturity,
                            :owl/someValuesFrom :cmns-dt/ExplicitDuration,
                            :rdf/type :owl/Restriction}
                           :fibo-sec-dbt-dbti/PrescriptiveEvent
                           :fibo-sec-dbt-dbti/RedemptionEvent],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
     :owl/someValuesFrom :fibo-fbc-fi-ip/SecurityPrice,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-ip/Yield
    {:owl/onProperty     :fibo-md-dbtx-aly/calculationFollowing,
     :owl/someValuesFrom :fibo-md-dbtx-aly/YieldCalculationMethod,
     :rdf/type           :owl/Restriction}
    :fibo-md-dbtx-aly/DebtInstrumentYield],
   :skos/definition
   #voc/lstr
    "Yield determined on an equivalent basis to the yield of another bond. This is used to be able to realistically compare prices between debt instruments across different markets.@en"})

(def CashStructuredFinanceInstrumentPrice
  "When the price is above a certain level (70), you get a quote in reference to an index e.g. LIBOR+50bp i.e. the yield. When you get below a certain price you get a quote such as 65c to a dollar. Percentage? not seen. Would be a whole number, interpreted as c/$"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "This might be a Price, a Spread or a Yield, i.e. \"here's the price., the current Yield is this, and here's the Spread\".@en",
   :db/ident :fibo-md-dbtx-aly/CashStructuredFinanceInstrumentPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "cash structured finance instrument price@en",
   :rdfs/subClassOf [:fibo-fbc-fi-ip/SecurityPrice
                     :fibo-md-dbtx-aly/CashStructuredFinanceInstrumentPrice],
   :skos/definition
   #voc/lstr
    "When the price is above a certain level (70), you get a quote in reference to an index e.g. LIBOR+50bp i.e. the yield. When you get below a certain price you get a quote such as 65c to a dollar. Percentage? not seen. Would be a whole number, interpreted as c/$@en"})

(def CleanPrice
  "A bond or debt instrument price that does not include accrued interest."
  {:db/ident :fibo-md-dbtx-aly/CleanPrice,
   :owl/disjointWith :fibo-md-dbtx-aly/DirtyPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "clean price@en",
   :rdfs/subClassOf [:fibo-fbc-fi-ip/SecurityPrice
                     :fibo-md-dbtx-aly/CleanPrice],
   :skos/definition
   #voc/lstr
    "A bond or debt instrument price that does not include accrued interest.@en"})

(def CollectionOfDebtPools
  "pool consisting of one or more pools of debt instrument(s)"
  {:db/ident :fibo-md-dbtx-aly/CollectionOfDebtPools,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "collection of debt pools@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-sec-sec-pls/DebtPool,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/Pool
                     :fibo-md-dbtx-aly/CollectionOfDebtPools],
   :skos/definition
   #voc/lstr "pool consisting of one or more pools of debt instrument(s)@en"})

(def CreditSpread
  "yield spread that reflects the additional net yield an investor can earn from a security with more credit risk relative to one with less credit risk"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "The credit spread of a particular security is often quoted in relation to the yield on a credit risk-free benchmark security or reference rate. Further Notes There are several measures of credit spread, including Z-spread and option-adjusted spread. Old definition (Algo) The spread between the credit rating of something and its maturity. THis is now defined as a different term pending further review with Algorithmics. Update from SMER. difference between risk free price (price of govt bond) and the price of this security. (matches Wikipedia definition above) i.e. price of this credit versus the price of a (near) risk free credit. The latter is a reference security with low risk such as a Treasury Bond. Is this between prices or between yields? can be expressed as either wrt price or yield, and this is detemined by context for different markets. Try and get a list. This is more generic - the meaning is not that it is speciufically wrt yield as such. Debt Price Spread is in context of price, whereas this is more generic.@en",
   :db/ident :fibo-md-dbtx-aly/CreditSpread,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "credit spread@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
                      :owl/someValuesFrom :fibo-ind-ir-ir/ReferenceInterestRate,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-ip/YieldSpread
                     :fibo-md-dbtx-aly/CreditSpread],
   :skos/definition
   #voc/lstr
    "yield spread that reflects the additional net yield an investor can earn from a security with more credit risk relative to one with less credit risk@en"})

(def CurrentYieldCalculationMethod
  "The ratio of the interest payment amount to the clean price."
  {:cmns-av/explanatoryNote
   #voc/lstr
    "This is a kind of yield that applies to debt instruments only as it relates to the clean price. It differs from the simple yield in that simple yield relates to the actual price paid for the bond, which on will differ from the clean price by the amount of accrued interest.@en",
   :db/ident :fibo-md-dbtx-aly/CurrentYieldCalculationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "current yield calculation method@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/CleanPrice,
                      :rdf/type           :owl/Restriction}
                     :fibo-md-dbtx-aly/YieldCalculationMethod
                     :fibo-md-dbtx-aly/CurrentYieldCalculationMethod
                     {:owl/allValuesFrom :fibo-fnd-utl-alx/Variable,
                      :owl/onProperty    :fibo-fnd-utl-alx/hasArgument,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-utl-alx/Formula
                     {:owl/allValuesFrom :fibo-fnd-dt-fd/RecurrenceInterval,
                      :owl/onProperty :fibo-fbc-dae-dbt/hasCompoundingFrequency,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-utl-alx/hasFormula,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/YieldCalculationFormula,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #voc/lstr "The ratio of the interest payment amount to the clean price.@en"})

(def DebtConvexityAnalytic
  "The second derivative of a security's price with respect to its yield, divided by the security's price. A security exhibits positive convexity when its price rises more for a downward move in its yield than its price declines for an equal upward move in its yield. Further notes: A measure of the change in price for a given change in Modified Duration. This always (necessarily) refers to Modified Duration. This is used as another risk measurement. Numerator is always (a) duration - either MacCaulays or Modified. Always rate of change of (one of the) Duration against some other parameter. The other paramater can be characterised as a Yield (it may be the Price, but that has a relationship to the Yield in any case). REVIEW: Inconsistency in the above - is it always necessarily Modified Duration that is referred to, or \"any\" Duration measure (Macaulays and.or Modified)? notes 9 Dec A measure of the sensitivity of the price with reference to interest rates. This is normally determined with reference to maturity, but since there are different maturity dates, this figure gives an estimate of the equitvalent if you had a homogenous portfolio, i.e. this is an estimate based on a pure equivalent, homogenous portfolio. Convexity of instrument versus portfolio. Sees instrument in terms of the set of cashflows. The term Convexity can be applied either to a bond or to a portfolio. More notes: When you get Convexit in MD, it will tell you what Duration it is refrfering to, along with Redemption Date (logically). Also if there is Option Adjusted Yield, there is a third set of analytics. What are they? i.e. OA Convexity, Duration Yield and the rest. Conclusions: Agreed to revisit this in OTC."
  {:db/ident :fibo-md-dbtx-aly/DebtConvexityAnalytic,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "debt convexity analytic@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-md-dbtx-aly/isRateOfChangeOf,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/DurationAnalytic,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
                      :owl/someValuesFrom :fibo-ind-ind-ind/MarketSpread,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/DebtInstrumentYield,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-fd/DatedCollectionConstituent
                     :fibo-md-dbtx-aly/DebtConvexityAnalytic],
   :skos/definition
   #voc/lstr
    "The second derivative of a security's price with respect to its yield, divided by the security's price. A security exhibits positive convexity when its price rises more for a downward move in its yield than its price declines for an equal upward move in its yield. Further notes: A measure of the change in price for a given change in Modified Duration. This always (necessarily) refers to Modified Duration. This is used as another risk measurement. Numerator is always (a) duration - either MacCaulays or Modified. Always rate of change of (one of the) Duration against some other parameter. The other paramater can be characterised as a Yield (it may be the Price, but that has a relationship to the Yield in any case). REVIEW: Inconsistency in the above - is it always necessarily Modified Duration that is referred to, or \"any\" Duration measure (Macaulays and.or Modified)? notes 9 Dec A measure of the sensitivity of the price with reference to interest rates. This is normally determined with reference to maturity, but since there are different maturity dates, this figure gives an estimate of the equitvalent if you had a homogenous portfolio, i.e. this is an estimate based on a pure equivalent, homogenous portfolio. Convexity of instrument versus portfolio. Sees instrument in terms of the set of cashflows. The term Convexity can be applied either to a bond or to a portfolio. More notes: When you get Convexit in MD, it will tell you what Duration it is refrfering to, along with Redemption Date (logically). Also if there is Option Adjusted Yield, there is a third set of analytics. What are they? i.e. OA Convexity, Duration Yield and the rest. Conclusions: Agreed to revisit this in OTC.@en"})

(def DebtInstrumentAnalyticalParameter
  "parameter describing some aspect of the behavior of one or more debt instrument(s) that may vary over time"
  {:db/ident :fibo-md-dbtx-aly/DebtInstrumentAnalyticalParameter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "debt instrument analytical parameter@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-sec-sec-pls/DebtPool,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/ScopedMeasure
                     :fibo-md-dbtx-aly/DebtInstrumentAnalyticalParameter],
   :skos/definition
   #voc/lstr
    "parameter describing some aspect of the behavior of one or more debt instrument(s) that may vary over time@en"})

(def DebtInstrumentYield
  "The return on the debt instrument at the stated price."
  {:cmns-av/explanatoryNote #voc/lstr
                             "Yield has a relationship to the price.@en",
   :db/ident :fibo-md-dbtx-aly/DebtInstrumentYield,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "debt instrument yield@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-md-dbtx-aly/hasOutlookPeriod,
     :owl/someValuesFrom {:owl/unionOf
                          [:fibo-md-dbtx-aly/LifeAnalytic
                           {:owl/onProperty
                            :fibo-fbc-dae-dbt/hasOriginalTimeToMaturity,
                            :owl/someValuesFrom :cmns-dt/ExplicitDuration,
                            :rdf/type :owl/Restriction}
                           :fibo-sec-dbt-dbti/PrescriptiveEvent
                           :fibo-sec-dbt-dbti/RedemptionEvent],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-md-dbtx-aly/calculationFollowing,
     :owl/someValuesFrom :fibo-md-dbtx-aly/YieldCalculationMethod,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
     :owl/someValuesFrom :fibo-fbc-fi-ip/SecurityPrice,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-ip/Yield
    :fibo-md-dbtx-aly/DebtInstrumentYield],
   :skos/definition
   #voc/lstr "The return on the debt instrument at the stated price.@en"})

(def DebtPoolAnalyticalParameter
  "measure of some aspect of some pool or pools of debt, such as a pool of loans or a pool of securitized debt products"
  {:db/ident :fibo-md-dbtx-aly/DebtPoolAnalyticalParameter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "debt pool analytical parameter@en",
   :rdfs/subClassOf [{:owl/onProperty :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/CollectionOfDebtPools,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/ScopedMeasure
                     :fibo-md-dbtx-aly/DebtPoolAnalyticalParameter],
   :skos/definition
   #voc/lstr
    "measure of some aspect of some pool or pools of debt, such as a pool of loans or a pool of securitized debt products@en"})

(def DebtPriceSpread
  "The difference between the [what?] of a security and the fair price value of a different security which is used as a point of reference. The spread is used to determine the price of the instrument. (draft definition)"
  {:db/ident :fibo-md-dbtx-aly/DebtPriceSpread,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "debt price spread@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-fbc-fi-ip/SecurityPrice,
                      :rdf/type           :owl/Restriction}
                     :fibo-ind-ind-ind/MarketSpread
                     :fibo-md-dbtx-aly/DebtPriceSpread],
   :skos/definition
   #voc/lstr
    "The difference between the [what?] of a security and the fair price value of a different security which is used as a point of reference. The spread is used to determine the price of the instrument. (draft definition)@en",
   :skos/editorialNote
   #voc/lstr
    "This was \"Spread\" in the Debt pricing reviews, however that word has at least 2 other uses (spread between equity bid and offer prices; spread for derivatives). Detailed notes from Debt Pricing Review session 5 Aug: Identify what the spread is in relation to e.g. LIBOR. ALSO If fixed of floating. So if it's a FRN, For a fixed rate bond, it's priced off the on-the-run, e.g. a 30 year bond is priced as a spread wrt a 30 year treasury bond. So e..g spread would be something like 10bp+the value of the 30 year on the run Treasury. On the Run: definition needed. Also class of Thing and where this should go.@en"})

(def DebtSecuritiesMarketMaker
  "An actor which has the role of Market Maker in a given market."
  {:db/ident :fibo-md-dbtx-aly/DebtSecuritiesMarketMaker,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "debt securities market maker@en",
   :rdfs/subClassOf [{:owl/onProperty
                      :fibo-md-dbtx-aly/determinesMarketPriceForDebt,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/OTCBondMarketPrice,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-pas-pas/ServiceProvider
                     :fibo-md-dbtx-aly/DebtSecuritiesMarketMaker],
   :skos/definition
   #voc/lstr
    "An actor which has the role of Market Maker in a given market.@en"})

(def DebtYieldToAverageLife
  "The yield achieved by substituting a bond's average life for the issue's final maturity date."
  {:db/ident :fibo-md-dbtx-aly/DebtYieldToAverageLife,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "debt yield to average life@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-md-dbtx-aly/hasOutlookPeriod,
     :owl/someValuesFrom :fibo-md-dbtx-aly/AverageLife,
     :rdf/type           :owl/Restriction}
    :fibo-md-dbtx-aly/DebtInstrumentYield
    :fibo-md-dbtx-aly/DebtYieldToAverageLife
    {:owl/onProperty     :fibo-md-dbtx-aly/hasOutlookPeriod,
     :owl/someValuesFrom {:owl/unionOf
                          [:fibo-md-dbtx-aly/LifeAnalytic
                           {:owl/onProperty
                            :fibo-fbc-dae-dbt/hasOriginalTimeToMaturity,
                            :owl/someValuesFrom :cmns-dt/ExplicitDuration,
                            :rdf/type :owl/Restriction}
                           :fibo-sec-dbt-dbti/PrescriptiveEvent
                           :fibo-sec-dbt-dbti/RedemptionEvent],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
     :owl/someValuesFrom :fibo-fbc-fi-ip/SecurityPrice,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-ip/Yield
    {:owl/onProperty     :fibo-md-dbtx-aly/calculationFollowing,
     :owl/someValuesFrom :fibo-md-dbtx-aly/YieldCalculationMethod,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "The yield achieved by substituting a bond's average life for the issue's final maturity date.@en",
   :skos/editorialNote
   #voc/lstr
    "Assume from this that there is also a Yield to Equivalent Life. Some sources have these as the same term, whereas we have separated them.@en"})

(def DebtYieldToEquivalentLife
  "The yield achieved by substituting a bond's equivalent life for the issue's final maturity date."
  {:db/ident :fibo-md-dbtx-aly/DebtYieldToEquivalentLife,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "debt yield to equivalent life@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-md-dbtx-aly/hasOutlookPeriod,
     :owl/someValuesFrom :fibo-md-dbtx-aly/EquivalentLifeAnalytic,
     :rdf/type           :owl/Restriction}
    :fibo-md-dbtx-aly/DebtInstrumentYield
    :fibo-md-dbtx-aly/DebtYieldToEquivalentLife
    {:owl/onProperty     :fibo-md-dbtx-aly/hasOutlookPeriod,
     :owl/someValuesFrom {:owl/unionOf
                          [:fibo-md-dbtx-aly/LifeAnalytic
                           {:owl/onProperty
                            :fibo-fbc-dae-dbt/hasOriginalTimeToMaturity,
                            :owl/someValuesFrom :cmns-dt/ExplicitDuration,
                            :rdf/type :owl/Restriction}
                           :fibo-sec-dbt-dbti/PrescriptiveEvent
                           :fibo-sec-dbt-dbti/RedemptionEvent],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
     :owl/someValuesFrom :fibo-fbc-fi-ip/SecurityPrice,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-ip/Yield
    {:owl/onProperty     :fibo-md-dbtx-aly/calculationFollowing,
     :owl/someValuesFrom :fibo-md-dbtx-aly/YieldCalculationMethod,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "The yield achieved by substituting a bond's equivalent life for the issue's final maturity date.@en",
   :skos/editorialNote
   #voc/lstr
    "Some sources have Average Life and Equivalent Life as the same term, whereas we have separated them.@en"})

(def DebtYieldToMaturity
  "The internal rate of return an investor would achieve if he or she purchased that bond at its current dirty price, and held it to maturity, assuming all coupon and principal payments are received as scheduled."
  {:db/ident :fibo-md-dbtx-aly/DebtYieldToMaturity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "debt yield to maturity@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-md-dbtx-aly/hasOutlookPeriod,
     :owl/someValuesFrom {:owl/onProperty
                          :fibo-fbc-dae-dbt/hasOriginalTimeToMaturity,
                          :owl/someValuesFrom :cmns-dt/ExplicitDuration,
                          :rdf/type :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-md-dbtx-aly/DebtInstrumentYield
    :fibo-md-dbtx-aly/DebtYieldToMaturity
    {:owl/onProperty     :fibo-md-dbtx-aly/hasOutlookPeriod,
     :owl/someValuesFrom {:owl/unionOf
                          [:fibo-md-dbtx-aly/LifeAnalytic
                           {:owl/onProperty
                            :fibo-fbc-dae-dbt/hasOriginalTimeToMaturity,
                            :owl/someValuesFrom :cmns-dt/ExplicitDuration,
                            :rdf/type :owl/Restriction}
                           :fibo-sec-dbt-dbti/PrescriptiveEvent
                           :fibo-sec-dbt-dbti/RedemptionEvent],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
     :owl/someValuesFrom :fibo-fbc-fi-ip/SecurityPrice,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-ip/Yield
    {:owl/onProperty     :fibo-md-dbtx-aly/calculationFollowing,
     :owl/someValuesFrom :fibo-md-dbtx-aly/YieldCalculationMethod,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "The internal rate of return an investor would achieve if he or she purchased that bond at its current dirty price, and held it to maturity, assuming all coupon and principal payments are received as scheduled.@en"})

(def DebtYieldToNextCall
  "The yield of a bond to the next possible call date."
  {:db/ident :fibo-md-dbtx-aly/DebtYieldToNextCall,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "debt yield to next call@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-md-dbtx-aly/hasOutlookPeriod,
     :owl/someValuesFrom :fibo-md-dbtx-aly/NextCall,
     :rdf/type           :owl/Restriction}
    :fibo-md-dbtx-aly/DebtInstrumentYield
    :fibo-md-dbtx-aly/DebtYieldToNextCall
    {:owl/onProperty     :fibo-md-dbtx-aly/hasOutlookPeriod,
     :owl/someValuesFrom {:owl/unionOf
                          [:fibo-md-dbtx-aly/LifeAnalytic
                           {:owl/onProperty
                            :fibo-fbc-dae-dbt/hasOriginalTimeToMaturity,
                            :owl/someValuesFrom :cmns-dt/ExplicitDuration,
                            :rdf/type :owl/Restriction}
                           :fibo-sec-dbt-dbti/PrescriptiveEvent
                           :fibo-sec-dbt-dbti/RedemptionEvent],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
     :owl/someValuesFrom :fibo-fbc-fi-ip/SecurityPrice,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-ip/Yield
    {:owl/onProperty     :fibo-md-dbtx-aly/calculationFollowing,
     :owl/someValuesFrom :fibo-md-dbtx-aly/YieldCalculationMethod,
     :rdf/type           :owl/Restriction}],
   :skos/definition #voc/lstr
                     "The yield of a bond to the next possible call date.@en"})

(def DebtYieldToWorst
  "Yield to the worst case of when the instrument might be called."
  {:db/ident :fibo-md-dbtx-aly/DebtYieldToWorst,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "debt yield to worst@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-md-dbtx-aly/hasOutlookPeriod,
     :owl/someValuesFrom :fibo-md-dbtx-aly/WorstCall,
     :rdf/type           :owl/Restriction}
    :fibo-md-dbtx-aly/DebtInstrumentYield
    :fibo-md-dbtx-aly/DebtYieldToWorst
    {:owl/onProperty     :fibo-md-dbtx-aly/hasOutlookPeriod,
     :owl/someValuesFrom {:owl/unionOf
                          [:fibo-md-dbtx-aly/LifeAnalytic
                           {:owl/onProperty
                            :fibo-fbc-dae-dbt/hasOriginalTimeToMaturity,
                            :owl/someValuesFrom :cmns-dt/ExplicitDuration,
                            :rdf/type :owl/Restriction}
                           :fibo-sec-dbt-dbti/PrescriptiveEvent
                           :fibo-sec-dbt-dbti/RedemptionEvent],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
     :owl/someValuesFrom :fibo-fbc-fi-ip/SecurityPrice,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-ip/Yield
    {:owl/onProperty     :fibo-md-dbtx-aly/calculationFollowing,
     :owl/someValuesFrom :fibo-md-dbtx-aly/YieldCalculationMethod,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "Yield to the worst case of when the instrument might be called.@en"})

(def DefaultRate
  "The rate at which holders of loans in the pool default on those loans."
  {:db/ident :fibo-md-dbtx-aly/DefaultRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "default rate@en",
   :rdfs/subClassOf [:fibo-md-dbtx-aly/DebtPoolAnalyticalParameter
                     :fibo-md-dbtx-aly/DefaultRate
                     {:owl/onProperty :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/CollectionOfDebtPools,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/ScopedMeasure
                     {:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "The rate at which holders of loans in the pool default on those loans.@en"})

(def DerivedPrice
  "price that stems from another source or calculation rather than being quoted or based on actual trading data"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "There are evaluated prices in which an independent source evaluates a price they have derived, and there are prices which are derived within a firm, from supplied, published end of day price spreads or other market data.@en",
   :db/ident :fibo-md-dbtx-aly/DerivedPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "derived price@en",
   :rdfs/subClassOf [:fibo-fbc-fi-ip/SecurityPrice
                     :fibo-md-dbtx-aly/DerivedPrice],
   :skos/definition
   #voc/lstr
    "price that stems from another source or calculation rather than being quoted or based on actual trading data@en"})

(def DirtyPrice
  "dirty price"
  {:db/ident :fibo-md-dbtx-aly/DirtyPrice,
   :owl/disjointWith :fibo-ind-ind-ind/QuotedPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "dirty price@en",
   :rdfs/subClassOf [{:owl/onProperty :cmns-col/comprises,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/AccruedInterestAmount,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fi-ip/SecurityPrice
                     :fibo-md-dbtx-aly/DirtyPrice]})

(def DiscountedInstrumentYield
  "Yield quoted for a discount instrument. This is the ratio of the discount to the face value, divided by the period to maturity as a fraction of a year."
  {:cmns-av/usageNote #voc/lstr "Applies to Debt only.@en",
   :db/ident :fibo-md-dbtx-aly/DiscountedInstrumentYield,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "discounted instrument yield@en",
   :rdfs/subClassOf
   [:fibo-md-dbtx-aly/DebtInstrumentYield
    :fibo-md-dbtx-aly/DiscountedInstrumentYield
    {:owl/onProperty     :fibo-md-dbtx-aly/hasOutlookPeriod,
     :owl/someValuesFrom {:owl/unionOf
                          [:fibo-md-dbtx-aly/LifeAnalytic
                           {:owl/onProperty
                            :fibo-fbc-dae-dbt/hasOriginalTimeToMaturity,
                            :owl/someValuesFrom :cmns-dt/ExplicitDuration,
                            :rdf/type :owl/Restriction}
                           :fibo-sec-dbt-dbti/PrescriptiveEvent
                           :fibo-sec-dbt-dbti/RedemptionEvent],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
     :owl/someValuesFrom :fibo-fbc-fi-ip/SecurityPrice,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-ip/Yield
    {:owl/onProperty     :fibo-md-dbtx-aly/calculationFollowing,
     :owl/someValuesFrom :fibo-md-dbtx-aly/YieldCalculationMethod,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "Yield quoted for a discount instrument. This is the ratio of the discount to the face value, divided by the period to maturity as a fraction of a year.@en"})

(def DurationAnalytic
  "Weighted average time to receipt of all the payments."
  {:db/ident :fibo-md-dbtx-aly/DurationAnalytic,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "duration analytic@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/DebtInstrumentYield,
                      :rdf/type           :owl/Restriction}
                     :fibo-md-dbtx-aly/DebtInstrumentAnalyticalParameter
                     :fibo-md-dbtx-aly/DurationAnalytic
                     {:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/ScopedMeasure
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-sec-sec-pls/DebtPool,
                      :rdf/type           :owl/Restriction}],
   :skos/definition #voc/lstr
                     "Weighted average time to receipt of all the payments.@en",
   :skos/editorialNote
   #voc/lstr
    "Duration in general is a measure of % price change for a given change in yield. See definition from BMB The duration on a traditional bond will be much shorter than the duration relative to the maturity. Duration is the first derivative of the curve between Price and Yield. There are multiple types of duration, all of which are variants of this. So Duration is the first derivative and the different type of duration measure are different ways of measuring this, for example a \"quick and dirty\" measure of duration or one which.@en"})

(def EffectiveDuration
  "effective duration"
  {:db/ident :fibo-md-dbtx-aly/EffectiveDuration,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "effective duration@en",
   :rdfs/subClassOf [:fibo-md-dbtx-aly/DurationAnalytic
                     :fibo-md-dbtx-aly/EffectiveDuration
                     :fibo-md-dbtx-aly/DebtInstrumentAnalyticalParameter
                     {:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/ScopedMeasure
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-sec-sec-pls/DebtPool,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/DebtInstrumentYield,
                      :rdf/type           :owl/Restriction}]})

(def EffectiveYield
  "effective yield"
  {:db/ident :fibo-md-dbtx-aly/EffectiveYield,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "effective yield@en",
   :rdfs/subClassOf
   [:fibo-md-dbtx-aly/DebtInstrumentYield
    :fibo-md-dbtx-aly/EffectiveYield
    {:owl/onProperty     :fibo-md-dbtx-aly/hasOutlookPeriod,
     :owl/someValuesFrom {:owl/unionOf
                          [:fibo-md-dbtx-aly/LifeAnalytic
                           {:owl/onProperty
                            :fibo-fbc-dae-dbt/hasOriginalTimeToMaturity,
                            :owl/someValuesFrom :cmns-dt/ExplicitDuration,
                            :rdf/type :owl/Restriction}
                           :fibo-sec-dbt-dbti/PrescriptiveEvent
                           :fibo-sec-dbt-dbti/RedemptionEvent],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
     :owl/someValuesFrom :fibo-fbc-fi-ip/SecurityPrice,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-ip/Yield
    {:owl/onProperty     :fibo-md-dbtx-aly/calculationFollowing,
     :owl/someValuesFrom :fibo-md-dbtx-aly/YieldCalculationMethod,
     :rdf/type           :owl/Restriction}],
   :skos/editorialNote
   #voc/lstr
    "The difference between this and Native yield is as per note: Native yield relates to price quotation context; Effective Yild is in relation to portfolio analytics. Recall: every analytic formula relates to the set of cash flows, so there are assumptions underlying each of these, For example the assumption that Y is constant, which it isn't (because there is a curve, which may be convex not linear (is that right?). So you can compare rate or return between what I see and what the market has out there. In the US market: a Y which is calculated using Monto Carlo method simulation. relationship facts to add: Relation to method / formula (e.g. Monte Carlo), and the method used to determine the actual figure for the MC method. eff Y for single instrument: E Y for bonds without calls and stuff. Variation in this: whether we look at a whole set of bonds YTM quoted by Bmb would be the YTM quoted according to whatever the market is - = the NAtive Yield. SO: Publicly quoted more: choose another adjective.@en"})

(def EquivalentLifeAnalytic
  "equivalent life analytic"
  {:db/ident :fibo-md-dbtx-aly/EquivalentLifeAnalytic,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "equivalent life analytic@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-sec-dbt-bnd/BondWithPartialCall,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fbc-dae-dbt/isBasedOn,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/PartialCallsEstimationModel,
                      :rdf/type :owl/Restriction}
                     :fibo-md-dbtx-aly/LifeAnalytic
                     :fibo-md-dbtx-aly/EquivalentLifeAnalytic
                     :fibo-md-dbtx-aly/DebtInstrumentAnalyticalParameter
                     {:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/ScopedMeasure
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-sec-sec-pls/DebtPool,
                      :rdf/type           :owl/Restriction}]})

(def EquivalentYieldCalculationMethod
  "equivalent yield calculation method"
  {:db/ident :fibo-md-dbtx-aly/EquivalentYieldCalculationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "equivalent yield calculation method@en",
   :rdfs/subClassOf [:fibo-md-dbtx-aly/RelativeYieldCalculationMethod
                     :fibo-md-dbtx-aly/EquivalentYieldCalculationMethod
                     {:owl/allValuesFrom :fibo-fnd-utl-alx/Variable,
                      :owl/onProperty    :fibo-fnd-utl-alx/hasArgument,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-utl-alx/Formula
                     :fibo-md-dbtx-aly/YieldCalculationMethod
                     {:owl/allValuesFrom :fibo-fnd-dt-fd/RecurrenceInterval,
                      :owl/onProperty :fibo-fbc-dae-dbt/hasCompoundingFrequency,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-utl-alx/hasFormula,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/YieldCalculationFormula,
                      :rdf/type :owl/Restriction}]})

(def ExchangeTradedBondPrice
  "exchange traded bond price"
  {:db/ident :fibo-md-dbtx-aly/ExchangeTradedBondPrice,
   :owl/disjointWith :fibo-md-dbtx-aly/OTCBondMarketPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "exchange traded bond price@en",
   :rdfs/subClassOf [:fibo-fbc-fi-ip/SecurityPrice
                     :fibo-md-dbtx-aly/ExchangeTradedBondPrice]})

(def FFIECDown300PrepaySpeed
  "Public Securities Association (PSA) speed used for the underlying collateral for cash-flow calculations in the \"down 300\" scenario."
  {:db/ident :fibo-md-dbtx-aly/FFIECDown300PrepaySpeed,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "f f i e c down 300 prepay speed@en",
   :rdfs/subClassOf
   [:fibo-md-dbtx-aly/PrepaymentSpeed
    :fibo-md-dbtx-aly/FFIECDown300PrepaySpeed
    {:owl/onProperty     :cmns-cxtdsg/appliesTo,
     :owl/someValuesFrom :fibo-md-dbtx-aly/CollectionOfDebtPools,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-dae-dbt/isBasedOn,
     :owl/someValuesFrom :fibo-md-dbtx-aly/LoanPoolPrepaymentModel,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-utl-alx/ScopedMeasure
    :fibo-md-dbtx-aly/DebtPoolAnalyticalParameter
    {:owl/onProperty     :fibo-fnd-utl-alx/hasApplicableDatePeriod,
     :owl/someValuesFrom :cmns-dt/DatePeriod,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "Public Securities Association (PSA) speed used for the underlying collateral for cash-flow calculations in the \"down 300\" scenario.@en",
   :skos/editorialNote
   #voc/lstr
    "Detailed parameters to follow, but basically these three PSA terms are differentiated by the fact that they reference 3 different prepayment models, so each of these will refer to a sub-type of the term \"Loan Pool Prepayment Model\". For now the semantics are defined only in this written definition. Add model variants and terms in a future version.@en"})

(def FFIECUp300PrepaySpeed
  "Public Securities Association (PSA) speed used for the underlying collateral for cash-flow calculations in the \"up 300\" scenario."
  {:db/ident :fibo-md-dbtx-aly/FFIECUp300PrepaySpeed,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "f f i e c up 300 prepay speed@en",
   :rdfs/subClassOf
   [:fibo-md-dbtx-aly/PrepaymentSpeed
    :fibo-md-dbtx-aly/FFIECUp300PrepaySpeed
    {:owl/onProperty     :cmns-cxtdsg/appliesTo,
     :owl/someValuesFrom :fibo-md-dbtx-aly/CollectionOfDebtPools,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-dae-dbt/isBasedOn,
     :owl/someValuesFrom :fibo-md-dbtx-aly/LoanPoolPrepaymentModel,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-utl-alx/ScopedMeasure
    :fibo-md-dbtx-aly/DebtPoolAnalyticalParameter
    {:owl/onProperty     :fibo-fnd-utl-alx/hasApplicableDatePeriod,
     :owl/someValuesFrom :cmns-dt/DatePeriod,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "Public Securities Association (PSA) speed used for the underlying collateral for cash-flow calculations in the \"up 300\" scenario.@en",
   :skos/editorialNote
   #voc/lstr
    "Detailed parameters to follow, but basically these three PSA terms are differentiated by the fact that they reference 3 different prepayment models, so each of these will refer to a sub-type of the term \"Loan Pool Prepayment Model\". For now the semantics are defined only in this written definition. Add model variants and terms in a future version.@en"})

(def ICMAYieldFormula
  "The calculation method specified by ICMA (formerly ISMA) for determination of yield for fixed-rate bonds."
  {:cmns-av/explanatoryNote
   #voc/lstr
    "This basic formula is used across many markets, including the US and most of Europe. While individual markets may have different flavors (French round their bonds to 5 decimals, UK Gilts have ex-div), the formula is still the same. This would be the formula used by \"Wall Street Yield\", \"US Treasury Yield\", \"Corporate Bond Yield\" etc. Notes Origin:Fidessa@en",
   :db/ident :fibo-md-dbtx-aly/ICMAYieldFormula,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "i c m a yield formula@en",
   :rdfs/subClassOf [:fibo-md-dbtx-aly/YieldCalculationFormula
                     :fibo-md-dbtx-aly/ICMAYieldFormula
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/DebtInstrumentYield,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-utl-alx/Formula],
   :skos/definition
   #voc/lstr
    "The calculation method specified by ICMA (formerly ISMA) for determination of yield for fixed-rate bonds.@en"})

(def ImpliedForwardRate
  "implied forward rate"
  {:db/ident :fibo-md-dbtx-aly/ImpliedForwardRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "implied forward rate@en",
   :rdfs/subClassOf [:fibo-fnd-utl-alx/RatioValue
                     :fibo-md-dbtx-aly/ImpliedForwardRate]})

(def InstrumentWeightedAverageLoanAge
  "A dollar-weighted average measuring the age of the individual loans in a mortgage pass-through or pooled security, such as Ginnie Mae or a Freddie Mac security. The WALA is measured as the time in months since the origination of the loans, with the weighting based on each loan's size in proportion to the aggregate total of the pool."
  {:cmns-av/explanatoryNote
   #voc/lstr
    "This is defined by the issuer. WALA is more official, not an analysis from a vendor. This changes but the values are relayed by the issuer on an ongoing basis. Investopedia explains Weighted Average Loan Age - WALA The weighted average age will change over time as some mortgages get paid off faster than others. Based on the issuer of the mortgage-backed securities (MBS), the WALA may be weighted on the remaining principal balance dollar figure, or the beginning notional value of the loan. The flip side of the WALA is the weighted average maturity (WAM), which is a dollar-weighted measure of the months remaining until the principal amounts are completely repaid on each loan in the pool.@en",
   :db/ident :fibo-md-dbtx-aly/InstrumentWeightedAverageLoanAge,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "instrument weighted average loan age@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-md-dbtx-aly/aggregateOf,
     :owl/someValuesFrom :fibo-md-dbtx-aly/PoolWeightedAverageLoanAge,
     :rdf/type           :owl/Restriction}
    :fibo-md-dbtx-aly/DebtPoolAnalyticalParameter
    :fibo-md-dbtx-aly/InstrumentWeightedAverageLoanAge
    {:owl/onProperty     :cmns-cxtdsg/appliesTo,
     :owl/someValuesFrom :fibo-md-dbtx-aly/CollectionOfDebtPools,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-utl-alx/ScopedMeasure
    {:owl/onProperty     :fibo-fnd-utl-alx/hasApplicableDatePeriod,
     :owl/someValuesFrom :cmns-dt/DatePeriod,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "A dollar-weighted average measuring the age of the individual loans in a mortgage pass-through or pooled security, such as Ginnie Mae or a Freddie Mac security. The WALA is measured as the time in months since the origination of the loans, with the weighting based on each loan's size in proportion to the aggregate total of the pool.@en"})

(def InstrumentWeightedAverageRemainingMaturity
  "The weighted average of the time until all maturities on loans in a mortgage-backed or asset backed security. The higher the weighted average to maturity of the loans, the longer the loans in the security have until maturity."
  {:db/ident :fibo-md-dbtx-aly/InstrumentWeightedAverageRemainingMaturity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "instrument weighted average remaining maturity@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-md-dbtx-aly/aggregateOf.1,
     :owl/someValuesFrom :fibo-md-dbtx-aly/PoolWeightedAverageRemainingMaturity,
     :rdf/type           :owl/Restriction}
    :fibo-md-dbtx-aly/DebtPoolAnalyticalParameter
    :fibo-md-dbtx-aly/InstrumentWeightedAverageRemainingMaturity
    {:owl/onProperty     :cmns-cxtdsg/appliesTo,
     :owl/someValuesFrom :fibo-md-dbtx-aly/CollectionOfDebtPools,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-utl-alx/ScopedMeasure
    {:owl/onProperty     :fibo-fnd-utl-alx/hasApplicableDatePeriod,
     :owl/someValuesFrom :cmns-dt/DatePeriod,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "The weighted average of the time until all maturities on loans in a mortgage-backed or asset backed security. The higher the weighted average to maturity of the loans, the longer the loans in the security have until maturity.@en"})

(def InternallyDeterminedPriceSpread
  "The spread determined internally within the organisation from information available at their own trading desks. Further Notes Internal prices within a bank would be determined by surveying their own traders. So e.g. corporate desk trades these 30 bonds, get the daily spreads on those at the end of the day and calculate the price. The traders determine the pricing during the based on market movements. (this is all for OTC traded bonds, not exchange traded bonds)."
  {:db/ident :fibo-md-dbtx-aly/InternallyDeterminedPriceSpread,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "internally determined price spread@en",
   :rdfs/subClassOf [:fibo-md-dbtx-aly/DebtPriceSpread
                     :fibo-md-dbtx-aly/InternallyDeterminedPriceSpread
                     :fibo-ind-ind-ind/MarketSpread
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-fbc-fi-ip/SecurityPrice,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "The spread determined internally within the organisation from information available at their own trading desks. Further Notes Internal prices within a bank would be determined by surveying their own traders. So e.g. corporate desk trades these 30 bonds, get the daily spreads on those at the end of the day and calculate the price. The traders determine the pricing during the based on market movements. (this is all for OTC traded bonds, not exchange traded bonds).@en"})

(def InterpolatedPrice
  "A price determined by interpolation between available price figures, using some algorithm or curve."
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Uses an algorithm to interpolate a price from two observed prices. Examples include price derived by interpolation between prices e.g. between Bid and Offer (among others). also includes Yield Curves and implied forward curves. That is, interpolation may either be linear (straight line interpolation between two values) or may be expressed as a non linear curve such as a yield curve or an implied forward curve.@en",
   :db/ident :fibo-md-dbtx-aly/InterpolatedPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "interpolated price@en",
   :rdfs/subClassOf [:fibo-md-dbtx-aly/DerivedPrice
                     :fibo-md-dbtx-aly/InterpolatedPrice
                     :fibo-fbc-fi-ip/SecurityPrice],
   :skos/definition
   #voc/lstr
    "A price determined by interpolation between available price figures, using some algorithm or curve.@en"})

(def JapaneseCompoundYieldCalculationMethod
  "No definition in selection list."
  {:db/ident :fibo-md-dbtx-aly/JapaneseCompoundYieldCalculationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "japanese compound yield calculation method@en",
   :rdfs/subClassOf [:fibo-md-dbtx-aly/YieldCalculationMethod
                     :fibo-md-dbtx-aly/JapaneseCompoundYieldCalculationMethod
                     {:owl/allValuesFrom :fibo-fnd-utl-alx/Variable,
                      :owl/onProperty    :fibo-fnd-utl-alx/hasArgument,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-utl-alx/Formula
                     {:owl/allValuesFrom :fibo-fnd-dt-fd/RecurrenceInterval,
                      :owl/onProperty :fibo-fbc-dae-dbt/hasCompoundingFrequency,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-utl-alx/hasFormula,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/YieldCalculationFormula,
                      :rdf/type :owl/Restriction}],
   :skos/definition #voc/lstr "No definition in selection list.@en"})

(def JapaneseSimpleYieldCalculationMethod
  "No definition.Term put here from memory. 02 Dec changed from Japanese Yield to Japanese Simple Yield. note hat Japanese Compound yield also here (from FIBIM or anothe rlist, added 25 nov with the rest)."
  {:db/ident :fibo-md-dbtx-aly/JapaneseSimpleYieldCalculationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "japanese simple yield calculation method@en",
   :rdfs/subClassOf [:fibo-md-dbtx-aly/YieldCalculationMethod
                     :fibo-md-dbtx-aly/JapaneseSimpleYieldCalculationMethod
                     {:owl/allValuesFrom :fibo-fnd-utl-alx/Variable,
                      :owl/onProperty    :fibo-fnd-utl-alx/hasArgument,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-utl-alx/Formula
                     {:owl/allValuesFrom :fibo-fnd-dt-fd/RecurrenceInterval,
                      :owl/onProperty :fibo-fbc-dae-dbt/hasCompoundingFrequency,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-utl-alx/hasFormula,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/YieldCalculationFormula,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "No definition.Term put here from memory. 02 Dec changed from Japanese Yield to Japanese Simple Yield. note hat Japanese Compound yield also here (from FIBIM or anothe rlist, added 25 nov with the rest).@en"})

(def KeyRateDuration
  "key rate duration"
  {:db/ident :fibo-md-dbtx-aly/KeyRateDuration,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "key rate duration@en",
   :rdfs/subClassOf [:fibo-md-dbtx-aly/DurationAnalytic
                     :fibo-md-dbtx-aly/KeyRateDuration
                     :fibo-md-dbtx-aly/DebtInstrumentAnalyticalParameter
                     {:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/ScopedMeasure
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-sec-sec-pls/DebtPool,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/DebtInstrumentYield,
                      :rdf/type           :owl/Restriction}]})

(def LifeAnalytic
  "Some measure of the life of a security, other than the actual time to maturity itself. This is a derived figure, based on certain parameters as appropriate to that type of instrument, to give a figure that is equivalent to and similar to the basic maturity of the instrument, for the purposes of analysing that security."
  {:db/ident :fibo-md-dbtx-aly/LifeAnalytic,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "life analytic@en",
   :rdfs/subClassOf [:fibo-md-dbtx-aly/DebtInstrumentAnalyticalParameter
                     :fibo-md-dbtx-aly/LifeAnalytic
                     {:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/ScopedMeasure
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-sec-sec-pls/DebtPool,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "Some measure of the life of a security, other than the actual time to maturity itself. This is a derived figure, based on certain parameters as appropriate to that type of instrument, to give a figure that is equivalent to and similar to the basic maturity of the instrument, for the purposes of analysing that security.@en"})

(def LoanPoolPrepaymentModel
  "Model of the prepayments of loans in a pool of individual loans, such as a mortgage pool or loan pool."
  {:cmns-av/explanatoryNote
   #voc/lstr
    "This model captures the parameters that may influence the prepayment of loans or mortgages and relates these mathematically.@en",
   :db/ident :fibo-md-dbtx-aly/LoanPoolPrepaymentModel,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "loan pool prepayment model@en",
   :rdfs/subClassOf [{:owl/onProperty :cmns-col/comprises,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/LoanPrepaymentFormula,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/Formula
                     :fibo-md-dbtx-aly/LoanPoolPrepaymentModel],
   :skos/definition
   #voc/lstr
    "Model of the prepayments of loans in a pool of individual loans, such as a mortgage pool or loan pool.@en"})

(def LoanPrepaymentFormula
  "The formula which embodies the model for loan pool prepayment speed."
  {:db/ident :fibo-md-dbtx-aly/LoanPrepaymentFormula,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "loan prepayment formula@en",
   :rdfs/subClassOf [:fibo-fnd-utl-alx/Formula
                     :fibo-md-dbtx-aly/LoanPrepaymentFormula],
   :skos/definition
   #voc/lstr
    "The formula which embodies the model for loan pool prepayment speed.@en",
   :skos/editorialNote
   #voc/lstr
    "From SMER sessions: This is a model. Includes other factors such as homogeniety. To model this more completely we need to identify the parameters that go in to this formula. Among these is the above homogeneity measure - need to know how that is measured and in what terms it is expressed, e.g. as a percentage, with reference to some mean or standard deviation and so on. Also some of the parameters used in this model would presumably make reference to standard mathematical model constructs such as normal distribution, variaous deviation measures, Chi squared and so on. These are not presently in the semantics model, but can be modeled semantically if required. This would not however be a mathematical model - we only need to identify these and show meaningful relationships (not mathematical relationships) between them.@en"})

(def MacCaulaysDurationAnalytic
  "MacCaulays Duration Analytic"
  {:db/ident :fibo-md-dbtx-aly/MacCaulaysDurationAnalytic,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "MacCaulays Duration Analytic@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-fbc-fi-ip/InternalRateOfReturn,
                      :rdf/type           :owl/Restriction}
                     :fibo-md-dbtx-aly/DurationAnalytic
                     :fibo-md-dbtx-aly/MacCaulaysDurationAnalytic
                     :fibo-md-dbtx-aly/DebtInstrumentAnalyticalParameter
                     {:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/ScopedMeasure
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-sec-sec-pls/DebtPool,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/DebtInstrumentYield,
                      :rdf/type           :owl/Restriction}]})

(def MaturityEquivalentPSA
  "Prepayment speed that results in the same average life as that computed for the Collateralized Mortgage Obligation (CMO), Asset Backed Securities (ABS) or Mortgage Backed Securities (MBS) using the Maturity Prepay Model."
  {:db/ident :fibo-md-dbtx-aly/MaturityEquivalentPSA,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "maturity equivalent p s a@en",
   :rdfs/subClassOf
   [:fibo-md-dbtx-aly/PrepaymentSpeed
    :fibo-md-dbtx-aly/MaturityEquivalentPSA
    {:owl/onProperty     :cmns-cxtdsg/appliesTo,
     :owl/someValuesFrom :fibo-md-dbtx-aly/CollectionOfDebtPools,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-dae-dbt/isBasedOn,
     :owl/someValuesFrom :fibo-md-dbtx-aly/LoanPoolPrepaymentModel,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-utl-alx/ScopedMeasure
    :fibo-md-dbtx-aly/DebtPoolAnalyticalParameter
    {:owl/onProperty     :fibo-fnd-utl-alx/hasApplicableDatePeriod,
     :owl/someValuesFrom :cmns-dt/DatePeriod,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "Prepayment speed that results in the same average life as that computed for the Collateralized Mortgage Obligation (CMO), Asset Backed Securities (ABS) or Mortgage Backed Securities (MBS) using the Maturity Prepay Model.@en",
   :skos/editorialNote
   #voc/lstr
    "Detailed parameters to follow, but basically these three PSA terms are differentiated by the fact that they reference 3 different prepayment models, so each of these will refer to a sub-type of the term \"Loan Pool Prepayment Model\". For now the semantics are defined only in this written definition. Add model variants and terms in a future version.@en"})

(def ModifiedDurationAnalytic
  "The percentage price change of a security for a given change in yield. The higher the modified duration of a security, the higher its risk. Ad/ModDuration = [duration / {1 + (IRR/M)}]; where IRR is the internal rate of return and M is the number of compounding periods per year."
  {:cmns-av/explanatoryNote
   #voc/lstr
    "The higher the MD the greater the change in price for a given change in yield.@en",
   :db/ident :fibo-md-dbtx-aly/ModifiedDurationAnalytic,
   :owl/disjointWith :fibo-md-dbtx-aly/MacCaulaysDurationAnalytic,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "modified duration analytic@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/MacCaulaysDurationAnalytic,
                      :rdf/type :owl/Restriction}
                     :fibo-md-dbtx-aly/DurationAnalytic
                     :fibo-md-dbtx-aly/ModifiedDurationAnalytic
                     :fibo-md-dbtx-aly/DebtInstrumentAnalyticalParameter
                     {:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/ScopedMeasure
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-sec-sec-pls/DebtPool,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/DebtInstrumentYield,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "The percentage price change of a security for a given change in yield. The higher the modified duration of a security, the higher its risk. Ad/ModDuration = [duration / {1 + (IRR/M)}]; where IRR is the internal rate of return and M is the number of compounding periods per year.@en"})

(def MortgageInstrumentWeightedAverageRemainingMaturity
  "The weighted average of the time until all maturities on mortgages in a mortgage-backed security (MBS). The higher the weighted average to maturity, the longer the mortgages in the security have until maturity."
  {:db/ident
   :fibo-md-dbtx-aly/MortgageInstrumentWeightedAverageRemainingMaturity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr
                "mortgage instrument weighted average remaining maturity@en",
   :rdfs/subClassOf
   [:fibo-md-dbtx-aly/InstrumentWeightedAverageRemainingMaturity
    :fibo-md-dbtx-aly/MortgageInstrumentWeightedAverageRemainingMaturity
    {:owl/onProperty     :cmns-cxtdsg/appliesTo,
     :owl/someValuesFrom :fibo-md-dbtx-aly/CollectionOfDebtPools,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-md-dbtx-aly/aggregateOf.1,
     :owl/someValuesFrom :fibo-md-dbtx-aly/PoolWeightedAverageRemainingMaturity,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-utl-alx/ScopedMeasure
    :fibo-md-dbtx-aly/DebtPoolAnalyticalParameter
    {:owl/onProperty     :fibo-fnd-utl-alx/hasApplicableDatePeriod,
     :owl/someValuesFrom :cmns-dt/DatePeriod,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "The weighted average of the time until all maturities on mortgages in a mortgage-backed security (MBS). The higher the weighted average to maturity, the longer the mortgages in the security have until maturity.@en",
   :skos/editorialNote
   #voc/lstr
    "Synonym (if this is the same term): Also known as \"average effective maturity\". Investopedia explains Weighted Average Maturity - WAM The measure is calculated by totaling each mortgage value represented by the MBS. The weights of each mortgage is found by dividing the value of each into the total of all. To arrive at the WAM number the weight of each security is multiplied by the time until maturity of each mortgage, and then all the values are added together. For example say an MBS has three mortgages valued at $1,000, $2,000 and $3,000 (a total of $6,000) and mature in one, two and three years respectively. The weights of these are 1/6 (1,000/6,000), 1/3 (2,000/6,000) and 1/2 (3,000/6,000). The WAM is 2 1/3 years (1/6 x 1 year + 1/3 x 2 years + 1/2 x 3 years). Analysis: this investopedia decription does not take account of there being more than one Pool behind the MBS.@en"})

(def NativeYield
  "The yield of the security as determined using the Yield Calculation Method that is the default for the market that the security is traded in."
  {:cmns-av/explanatoryNote
   #voc/lstr
    "conventional yield for that security type and geo location, ie. would be in relation too@en",
   :db/ident :fibo-md-dbtx-aly/NativeYield,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "native yield@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fbc-dae-dbt/isBasedOn,
     :owl/someValuesFrom :fibo-md-dbtx-aly/NativeYieldCalculationMethod,
     :rdf/type           :owl/Restriction}
    :fibo-md-dbtx-aly/RelativelyDefinedDebtInstrumentYield
    :fibo-md-dbtx-aly/NativeYield
    {:owl/onProperty     :fibo-md-dbtx-aly/hasOutlookPeriod,
     :owl/someValuesFrom {:owl/unionOf
                          [:fibo-md-dbtx-aly/LifeAnalytic
                           {:owl/onProperty
                            :fibo-fbc-dae-dbt/hasOriginalTimeToMaturity,
                            :owl/someValuesFrom :cmns-dt/ExplicitDuration,
                            :rdf/type :owl/Restriction}
                           :fibo-sec-dbt-dbti/PrescriptiveEvent
                           :fibo-sec-dbt-dbti/RedemptionEvent],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
     :owl/someValuesFrom :fibo-fbc-fi-ip/SecurityPrice,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-ip/Yield
    {:owl/onProperty     :fibo-md-dbtx-aly/calculationFollowing,
     :owl/someValuesFrom :fibo-md-dbtx-aly/YieldCalculationMethod,
     :rdf/type           :owl/Restriction}
    :fibo-md-dbtx-aly/DebtInstrumentYield],
   :skos/definition
   #voc/lstr
    "The yield of the security as determined using the Yield Calculation Method that is the default for the market that the security is traded in.@en"})

(def NativeYieldCalculationMethod
  "The convention used in the marketplace for that security."
  {:db/ident :fibo-md-dbtx-aly/NativeYieldCalculationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "native yield calculation method@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-md-dbtx-aly/isDefaultMethodFor,
     :owl/someValuesFrom :fibo-sec-dbt-dbti/TradableDebtInstrument,
     :rdf/type           :owl/Restriction}
    :fibo-md-dbtx-aly/RelativeYieldCalculationMethod
    :fibo-md-dbtx-aly/NativeYieldCalculationMethod
    {:owl/allValuesFrom :fibo-fnd-utl-alx/Variable,
     :owl/onProperty    :fibo-fnd-utl-alx/hasArgument,
     :rdf/type          :owl/Restriction}
    :fibo-fnd-utl-alx/Formula
    :fibo-md-dbtx-aly/YieldCalculationMethod
    {:owl/allValuesFrom :fibo-fnd-dt-fd/RecurrenceInterval,
     :owl/onProperty    :fibo-fbc-dae-dbt/hasCompoundingFrequency,
     :rdf/type          :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-utl-alx/hasFormula,
     :owl/someValuesFrom :fibo-md-dbtx-aly/YieldCalculationFormula,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr "The convention used in the marketplace for that security.@en"})

(def NextCall
  "The next call of the issue, as at the current time."
  {:db/ident :fibo-md-dbtx-aly/NextCall,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "next call@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-dt/hasDate,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/NextCallDate,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-dbti/CallEvent
                     :fibo-md-dbtx-aly/NextCall],
   :skos/definition #voc/lstr
                     "The next call of the issue, as at the current time.@en"})

(def NextCallDate
  "The next date on which the issue can be called, from the present date."
  {:db/ident :fibo-md-dbtx-aly/NextCallDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "next call date@en",
   :rdfs/subClassOf [:cmns-dt/Date :fibo-md-dbtx-aly/NextCallDate],
   :skos/definition
   #voc/lstr
    "The next date on which the issue can be called, from the present date.@en"})

(def NextPut
  "The next available put date for the issue, as at the current time."
  {:db/ident :fibo-md-dbtx-aly/NextPut,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "next put@en",
   :rdfs/subClassOf [:fibo-sec-dbt-dbti/PutEvent :fibo-md-dbtx-aly/NextPut],
   :skos/definition
   #voc/lstr
    "The next available put date for the issue, as at the current time.@en"})

(def OTCBondMarketPrice
  "The price determined for the marketplace for a bond which is traded over the counter."
  {:db/ident :fibo-md-dbtx-aly/OTCBondMarketPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "o t c bond market price@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fbc-fi-ip/hasPricingSource,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/DebtSecuritiesMarketMaker,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fi-ip/SecurityPrice
                     :fibo-md-dbtx-aly/OTCBondMarketPrice],
   :skos/definition
   #voc/lstr
    "The price determined for the marketplace for a bond which is traded over the counter.@en",
   :skos/editorialNote
   #voc/lstr
    "Review comment: Must include Attribution. This is in the model in the form of tha Market Maker (an actor in the activity of secondary market trading for OTC-traded debt).@en"})

(def OptionAdjustedYield
  "NB specified as a spread. synonym: OAS Based on different Int Rate paths. There are different OAS models just like there are different Yield methods. Also would make reference to the Yield Curve - but these are parameters that go into that model. Limit this model at the point where it distinguishes the difference between things - we are not in a position to mathematically model the things themselves, just capture the basic facts."
  {:db/ident :fibo-md-dbtx-aly/OptionAdjustedYield,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "option adjusted yield@en",
   :rdfs/subClassOf
   [:fibo-md-dbtx-aly/DebtInstrumentYield
    :fibo-md-dbtx-aly/OptionAdjustedYield
    {:owl/onProperty     :fibo-md-dbtx-aly/hasOutlookPeriod,
     :owl/someValuesFrom {:owl/unionOf
                          [:fibo-md-dbtx-aly/LifeAnalytic
                           {:owl/onProperty
                            :fibo-fbc-dae-dbt/hasOriginalTimeToMaturity,
                            :owl/someValuesFrom :cmns-dt/ExplicitDuration,
                            :rdf/type :owl/Restriction}
                           :fibo-sec-dbt-dbti/PrescriptiveEvent
                           :fibo-sec-dbt-dbti/RedemptionEvent],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
     :owl/someValuesFrom :fibo-fbc-fi-ip/SecurityPrice,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-ip/Yield
    {:owl/onProperty     :fibo-md-dbtx-aly/calculationFollowing,
     :owl/someValuesFrom :fibo-md-dbtx-aly/YieldCalculationMethod,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "NB specified as a spread. synonym: OAS Based on different Int Rate paths. There are different OAS models just like there are different Yield methods. Also would make reference to the Yield Curve - but these are parameters that go into that model. Limit this model at the point where it distinguishes the difference between things - we are not in a position to mathematically model the things themselves, just capture the basic facts.@en"})

(def PartialCallsEstimationModel
  "A model of how the early partial calls are estimated."
  {:db/ident :fibo-md-dbtx-aly/PartialCallsEstimationModel,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "partial calls estimation model@en",
   :rdfs/subClassOf [:fibo-fnd-utl-alx/Formula
                     :fibo-md-dbtx-aly/PartialCallsEstimationModel],
   :skos/definition
   #voc/lstr "A model of how the early partial calls are estimated.@en"})

(def PoolFactor
  "How much of the original pool is still outstanding. This is a number below one. Expressed as percentage."
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Would multiply the factor by the starting value of the pool. This determines how much it is paying down. Would take the form of a 10 digit decimal factor showing how much of the pool is outstanding. You get Factor information every month or so which includes the WAM figure (and the WALA and WAC). The rate can be derived from this. that would be the rate at which the pool is paying down. These all come from the issuer.@en",
   :db/ident :fibo-md-dbtx-aly/PoolFactor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "pool factor@en",
   :rdfs/subClassOf [:fibo-fnd-utl-alx/Percentage :fibo-md-dbtx-aly/PoolFactor],
   :skos/definition
   #voc/lstr
    "How much of the original pool is still outstanding. This is a number below one. Expressed as percentage.@en"})

(def PoolPaydownRate
  "The rate at which the pool is paying down. This is based on observed factor. CPR, SMM, etc. etc. Measured differently for different kinds of security. CBO might have a prepayment rate for example if the underlying bond is callable. with a non agency mortgge dela, defualts will effect this. so for instance there is principal is no lnger inthe pool because the mortgagee defaults. With agency these are not taken out in the case of default but for non agency these mortgages are removed from the pool if and when a mortgagee defualts."
  {:db/ident :fibo-md-dbtx-aly/PoolPaydownRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "pool paydown rate@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-dae-dbt/isBasedOn,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/PoolFactor,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-utl-alx/RatioValue
                     :fibo-md-dbtx-aly/PoolPaydownRate],
   :skos/definition
   #voc/lstr
    "The rate at which the pool is paying down. This is based on observed factor. CPR, SMM, etc. etc. Measured differently for different kinds of security. CBO might have a prepayment rate for example if the underlying bond is callable. with a non agency mortgge dela, defualts will effect this. so for instance there is principal is no lnger inthe pool because the mortgagee defaults. With agency these are not taken out in the case of default but for non agency these mortgages are removed from the pool if and when a mortgagee defualts.@en"})

(def PoolWeightedAverageLoanAge
  "A dollar-weighted average measuring the age of the individual loans in a mortgage pass-through or pooled security, such as Ginnie Mae or a Freddie Mac security. The WALA is measured as the time in months since the origination of the loans, with the weighting based on each loan's size in proportion to the aggregate total of the pool."
  {:db/ident :fibo-md-dbtx-aly/PoolWeightedAverageLoanAge,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "pool weighted average loan age@en",
   :rdfs/subClassOf [:fibo-md-dbtx-aly/DebtPoolAnalyticalParameter
                     :fibo-md-dbtx-aly/PoolWeightedAverageLoanAge
                     {:owl/onProperty :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/CollectionOfDebtPools,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/ScopedMeasure
                     {:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "A dollar-weighted average measuring the age of the individual loans in a mortgage pass-through or pooled security, such as Ginnie Mae or a Freddie Mac security. The WALA is measured as the time in months since the origination of the loans, with the weighting based on each loan's size in proportion to the aggregate total of the pool.@en",
   :skos/editorialNote
   #voc/lstr
    "Adaptation taken from the instrument level figure. This definition looks as though it may already be defined with reference to the Loan Pool. Note also that this figure is specific to Pass Through securities. These are mutually exclusive with Tranched securities (static model update to come).@en"})

(def PoolWeightedAverageRemainingMaturity
  "The weighted average of the time until all maturities on loans in a pool. The higher the weighted average to maturity of the loans, the longer the loans in the pool have until maturity. REVIEW: Adapted from instrument specific definition from Investopedia. Review of 23 September identified that certain figures exist for pool and for instrument, whereas Investopedia definition was for Instrument (tranche, class etc.)."
  {:db/ident :fibo-md-dbtx-aly/PoolWeightedAverageRemainingMaturity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "pool weighted average remaining maturity@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fbc-dae-dbt/isBasedOn,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fbc-dae-dbt/hasMaturityDate,
                          :owl/someValuesFrom :cmns-dt/ExplicitDate,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-md-dbtx-aly/DebtPoolAnalyticalParameter
    :fibo-md-dbtx-aly/PoolWeightedAverageRemainingMaturity
    {:owl/onProperty     :cmns-cxtdsg/appliesTo,
     :owl/someValuesFrom :fibo-md-dbtx-aly/CollectionOfDebtPools,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-utl-alx/ScopedMeasure
    {:owl/onProperty     :fibo-fnd-utl-alx/hasApplicableDatePeriod,
     :owl/someValuesFrom :cmns-dt/DatePeriod,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "The weighted average of the time until all maturities on loans in a pool. The higher the weighted average to maturity of the loans, the longer the loans in the pool have until maturity. REVIEW: Adapted from instrument specific definition from Investopedia. Review of 23 September identified that certain figures exist for pool and for instrument, whereas Investopedia definition was for Instrument (tranche, class etc.).@en"})

(def PrepaymentSpeed
  "The rate at which the pool is paying down."
  {:db/ident :fibo-md-dbtx-aly/PrepaymentSpeed,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "prepayment speed@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fbc-dae-dbt/isBasedOn,
     :owl/someValuesFrom :fibo-md-dbtx-aly/LoanPoolPrepaymentModel,
     :rdf/type           :owl/Restriction}
    :fibo-md-dbtx-aly/DebtPoolAnalyticalParameter
    :fibo-md-dbtx-aly/PrepaymentSpeed
    {:owl/onProperty     :cmns-cxtdsg/appliesTo,
     :owl/someValuesFrom :fibo-md-dbtx-aly/CollectionOfDebtPools,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-utl-alx/ScopedMeasure
    {:owl/onProperty     :fibo-fnd-utl-alx/hasApplicableDatePeriod,
     :owl/someValuesFrom :cmns-dt/DatePeriod,
     :rdf/type           :owl/Restriction}],
   :skos/definition #voc/lstr "The rate at which the pool is paying down.@en",
   :skos/editorialNote
   #voc/lstr
    "This is a model. Includes other factors such as homogeniety. Earlier notes: Same as Payment. Curtailment. Paydown is normally scheduled payments of the mortgage. Prepayment is when someone pays off the mortgage early I may send in 1500 when my monthly amount is 1000 a month. So the 500 is a prepayment. Scheduled principal payment. More notes 25 nov: Also factor in changes to the pool constituents where this is allowed for that kind of MBS. So we make estimates of how face value will will change. face value won't change but the underlying value of the Pf changes, so eg. the current mortgage factor. Model update note June 2010: Detailed types of \"Prepayment Speed\" analytic received from thomson Reuters, now modeled as sub types of this term. So term origin is PSA by extension, since this is the common super class of 3 specific prepayment speed analytic types defined by PSA. PSA stands for Public Securities Association. Type: PSA gives this as numeric, however definitions imply percentage, so defined as dated percentage for now. Many data models use numbers which are interpreted later as percentages so this may be the case here.@en"})

(def PriceValueOfBasisPoint
  "Sensitivity of the price for one basis point change in yield, defined as the difference in price given 1 bp change in yield."
  {:cmns-av/abbreviation #voc/lstr "PVBP@en",
   :cmns-av/explanatoryNote
   #voc/lstr
    "Price value of Basis Point Definition: The difference in price given 1 bp change in yield. This is like Duration but normalized to 1 basis point. Synonym DV01@en",
   :db/ident :fibo-md-dbtx-aly/PriceValueOfBasisPoint,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "price value of basis point@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/DebtInstrumentYield,
                      :rdf/type           :owl/Restriction}
                     :fibo-md-dbtx-aly/DebtInstrumentAnalyticalParameter
                     :fibo-md-dbtx-aly/PriceValueOfBasisPoint
                     {:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/ScopedMeasure
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-sec-sec-pls/DebtPool,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "Sensitivity of the price for one basis point change in yield, defined as the difference in price given 1 bp change in yield.@en"})

(def RelativeYieldCalculationMethod
  "relative yield calculation method"
  {:db/ident :fibo-md-dbtx-aly/RelativeYieldCalculationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "relative yield calculation method@en",
   :rdfs/subClassOf [:fibo-md-dbtx-aly/YieldCalculationMethod
                     :fibo-md-dbtx-aly/RelativeYieldCalculationMethod
                     {:owl/allValuesFrom :fibo-fnd-utl-alx/Variable,
                      :owl/onProperty    :fibo-fnd-utl-alx/hasArgument,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-utl-alx/Formula
                     {:owl/allValuesFrom :fibo-fnd-dt-fd/RecurrenceInterval,
                      :owl/onProperty :fibo-fbc-dae-dbt/hasCompoundingFrequency,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-utl-alx/hasFormula,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/YieldCalculationFormula,
                      :rdf/type :owl/Restriction}]})

(def RelativelyDefinedDebtInstrumentYield
  "relatively defined debt instrument yield"
  {:db/ident :fibo-md-dbtx-aly/RelativelyDefinedDebtInstrumentYield,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "relatively defined debt instrument yield@en",
   :rdfs/subClassOf
   [:fibo-md-dbtx-aly/DebtInstrumentYield
    :fibo-md-dbtx-aly/RelativelyDefinedDebtInstrumentYield
    {:owl/onProperty     :fibo-md-dbtx-aly/hasOutlookPeriod,
     :owl/someValuesFrom {:owl/unionOf
                          [:fibo-md-dbtx-aly/LifeAnalytic
                           {:owl/onProperty
                            :fibo-fbc-dae-dbt/hasOriginalTimeToMaturity,
                            :owl/someValuesFrom :cmns-dt/ExplicitDuration,
                            :rdf/type :owl/Restriction}
                           :fibo-sec-dbt-dbti/PrescriptiveEvent
                           :fibo-sec-dbt-dbti/RedemptionEvent],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
     :owl/someValuesFrom :fibo-fbc-fi-ip/SecurityPrice,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-ip/Yield
    {:owl/onProperty     :fibo-md-dbtx-aly/calculationFollowing,
     :owl/someValuesFrom :fibo-md-dbtx-aly/YieldCalculationMethod,
     :rdf/type           :owl/Restriction}]})

(def RussianYieldCalculationMethod
  "The method used in determining Yield in the Russian markets. This is based on an effective yield with fundamentally different math. To give an example of the use of a different \"yield type\", we have Russia, which trades based on an effective yield. The price-yield math is fundamentally different. Notes Origin:Fidessa Uses a trade space and effective yield formula. MAy have same day types but different math."
  {:db/ident :fibo-md-dbtx-aly/RussianYieldCalculationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "russian yield calculation method@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-utl-alx/hasFormula,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/RussianYieldFormula,
                      :rdf/type           :owl/Restriction}
                     :fibo-md-dbtx-aly/YieldCalculationMethod
                     :fibo-md-dbtx-aly/RussianYieldCalculationMethod
                     {:owl/allValuesFrom :fibo-fnd-utl-alx/Variable,
                      :owl/onProperty    :fibo-fnd-utl-alx/hasArgument,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-utl-alx/Formula
                     {:owl/allValuesFrom :fibo-fnd-dt-fd/RecurrenceInterval,
                      :owl/onProperty :fibo-fbc-dae-dbt/hasCompoundingFrequency,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-utl-alx/hasFormula,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/YieldCalculationFormula,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "The method used in determining Yield in the Russian markets. This is based on an effective yield with fundamentally different math. To give an example of the use of a different \"yield type\", we have Russia, which trades based on an effective yield. The price-yield math is fundamentally different. Notes Origin:Fidessa Uses a trade space and effective yield formula. MAy have same day types but different math.@en"})

(def RussianYieldFormula
  "This is based on a different Effective Yield than on another market."
  {:db/ident :fibo-md-dbtx-aly/RussianYieldFormula,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "russian yield formula@en",
   :rdfs/subClassOf [:fibo-md-dbtx-aly/YieldCalculationFormula
                     :fibo-md-dbtx-aly/RussianYieldFormula
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/DebtInstrumentYield,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-utl-alx/Formula],
   :skos/definition
   #voc/lstr
    "This is based on a different Effective Yield than on another market.@en"})

(def SimpleYieldCalculationMethod
  "The annual rate of return expressed as a percentage. This is the return divided by the outlay and multiplied by 100 to express the figure as a percentage."
  {:cmns-av/explanatoryNote
   #voc/lstr
    "This is yield in its simplest sense, expressed as a percentage of return to outlay. As such, this is the same way that yield is determined for any investments, not just financial instruments or debt investments.@en",
   :db/ident :fibo-md-dbtx-aly/SimpleYieldCalculationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "simple yield calculation method@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/DirtyPrice,
                      :rdf/type           :owl/Restriction}
                     :fibo-md-dbtx-aly/YieldCalculationMethod
                     :fibo-md-dbtx-aly/SimpleYieldCalculationMethod
                     {:owl/allValuesFrom :fibo-fnd-utl-alx/Variable,
                      :owl/onProperty    :fibo-fnd-utl-alx/hasArgument,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-utl-alx/Formula
                     {:owl/allValuesFrom :fibo-fnd-dt-fd/RecurrenceInterval,
                      :owl/onProperty :fibo-fbc-dae-dbt/hasCompoundingFrequency,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-utl-alx/hasFormula,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/YieldCalculationFormula,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "The annual rate of return expressed as a percentage. This is the return divided by the outlay and multiplied by 100 to express the figure as a percentage.@en"})

(def SpanishYieldCalculationMethod
  "The method used in determining annual yield in Spanish corporate bonds."
  {:db/ident :fibo-md-dbtx-aly/SpanishYieldCalculationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "spanish yield calculation method@en",
   :rdfs/subClassOf [:fibo-md-dbtx-aly/YieldCalculationMethod
                     :fibo-md-dbtx-aly/SpanishYieldCalculationMethod
                     {:owl/allValuesFrom :fibo-fnd-utl-alx/Variable,
                      :owl/onProperty    :fibo-fnd-utl-alx/hasArgument,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-utl-alx/Formula
                     {:owl/allValuesFrom :fibo-fnd-dt-fd/RecurrenceInterval,
                      :owl/onProperty :fibo-fbc-dae-dbt/hasCompoundingFrequency,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-utl-alx/hasFormula,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/YieldCalculationFormula,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "The method used in determining annual yield in Spanish corporate bonds.@en"})

(def USCorporateBondYieldCalculationMethod
  "This has 30/360 and semi-annual compounding."
  {:db/ident :fibo-md-dbtx-aly/USCorporateBondYieldCalculationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "u s corporate bond yield calculation method@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-utl-alx/hasFormula,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/ICMAYieldFormula,
                      :rdf/type           :owl/Restriction}
                     :fibo-md-dbtx-aly/YieldCalculationMethod
                     :fibo-md-dbtx-aly/USCorporateBondYieldCalculationMethod
                     {:owl/allValuesFrom :fibo-fnd-utl-alx/Variable,
                      :owl/onProperty    :fibo-fnd-utl-alx/hasArgument,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-utl-alx/Formula
                     {:owl/allValuesFrom :fibo-fnd-dt-fd/RecurrenceInterval,
                      :owl/onProperty :fibo-fbc-dae-dbt/hasCompoundingFrequency,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-utl-alx/hasFormula,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/YieldCalculationFormula,
                      :rdf/type :owl/Restriction}],
   :skos/definition #voc/lstr
                     "This has 30/360 and semi-annual compounding.@en"})

(def USTreasuryYieldCalculationMethod
  "u s treasury yield calculation method"
  {:db/ident :fibo-md-dbtx-aly/USTreasuryYieldCalculationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "u s treasury yield calculation method@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-utl-alx/hasFormula,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/ICMAYieldFormula,
                      :rdf/type           :owl/Restriction}
                     :fibo-md-dbtx-aly/YieldCalculationMethod
                     :fibo-md-dbtx-aly/USTreasuryYieldCalculationMethod
                     {:owl/allValuesFrom :fibo-fnd-utl-alx/Variable,
                      :owl/onProperty    :fibo-fnd-utl-alx/hasArgument,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-utl-alx/Formula
                     {:owl/allValuesFrom :fibo-fnd-dt-fd/RecurrenceInterval,
                      :owl/onProperty :fibo-fbc-dae-dbt/hasCompoundingFrequency,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-utl-alx/hasFormula,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/YieldCalculationFormula,
                      :rdf/type :owl/Restriction}]})

(def WallStreetYieldCalculationMethod
  "No definition.Term put here from memory."
  {:db/ident :fibo-md-dbtx-aly/WallStreetYieldCalculationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "wall street yield calculation method@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-utl-alx/hasFormula,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/ICMAYieldFormula,
                      :rdf/type           :owl/Restriction}
                     :fibo-md-dbtx-aly/YieldCalculationMethod
                     :fibo-md-dbtx-aly/WallStreetYieldCalculationMethod
                     {:owl/allValuesFrom :fibo-fnd-utl-alx/Variable,
                      :owl/onProperty    :fibo-fnd-utl-alx/hasArgument,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-utl-alx/Formula
                     {:owl/allValuesFrom :fibo-fnd-dt-fd/RecurrenceInterval,
                      :owl/onProperty :fibo-fbc-dae-dbt/hasCompoundingFrequency,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-utl-alx/hasFormula,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/YieldCalculationFormula,
                      :rdf/type :owl/Restriction}],
   :skos/definition #voc/lstr "No definition.Term put here from memory.@en"})

(def WeightedAverageCoupon
  "The weighted-average gross interest rates of the pool of mortgages that underlie a mortgage-backed security (MBS) at the time the securities were issued. A mortgage-backed security's current WAC can differ from its original WAC as the underlying mortgages pay down at different speeds. In the weighted-average calculation, the principal balance of each underlying mortgage is used as the weighting factor"
  {:db/ident :fibo-md-dbtx-aly/WeightedAverageCoupon,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "weighted average coupon@en",
   :rdfs/subClassOf [:fibo-md-dbtx-aly/DebtPoolAnalyticalParameter
                     :fibo-md-dbtx-aly/WeightedAverageCoupon
                     {:owl/onProperty :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/CollectionOfDebtPools,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/ScopedMeasure
                     {:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "The weighted-average gross interest rates of the pool of mortgages that underlie a mortgage-backed security (MBS) at the time the securities were issued. A mortgage-backed security's current WAC can differ from its original WAC as the underlying mortgages pay down at different speeds. In the weighted-average calculation, the principal balance of each underlying mortgage is used as the weighting factor@en",
   :skos/editorialNote
   #voc/lstr
    "Provided by the Issuer (loan servicer?) along with the WALA etc. If you know the underlying loans you can calculate this yourself. For ABS you don't know this so you have to get this information from the loan servicer. Investopedia explains Weighted Average Coupon - WAC For example, suppose a MBS is composed of two different pools of mortgages: $6 million worth of mortgages that yield 7.5% and a pool of $4 million mortgages that yield 5%. The WAC would be 6.5%. The WAC on a mortgage-backed security is an important piece of information used by analysts to estimate the pre-pay characteristics of that security. It is an important relative value tool in MBS portfolio management and analysis.@en"})

(def WeightedAverageTimeToReceiptOfCashflows
  "The weighted average time to the receipt of cashflows for an instrument."
  {:db/ident :fibo-md-dbtx-aly/WeightedAverageTimeToReceiptOfCashflows,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "weighted average time to receipt of cashflows@en",
   :rdfs/subClassOf [:fibo-fnd-utl-alx/Formula
                     :fibo-md-dbtx-aly/WeightedAverageTimeToReceiptOfCashflows],
   :skos/definition
   #voc/lstr
    "The weighted average time to the receipt of cashflows for an instrument.@en",
   :skos/editorialNote
   #voc/lstr
    "A formal definition is needed for this. The name is almost self defining, but only to those who already know what this means. In particular we should define how the weighted average is weighted, and what this means, along with a formula for calculating this at the most generic level (cashflow, time, without assumptions about particular types of instrument).@en"})

(def WorstCall
  "call event representing the worst case with respect to when the instrument might be called"
  {:db/ident :fibo-md-dbtx-aly/WorstCall,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "worst call@en",
   :rdfs/subClassOf [:fibo-sec-dbt-dbti/CallEvent :fibo-md-dbtx-aly/WorstCall],
   :skos/definition
   #voc/lstr
    "call event representing the worst case with respect to when the instrument might be called@en",
   :skos/editorialNote
   [#voc/lstr
     "We should refine what we mean by worst here - soonest, or most distant?@en"
    #voc/lstr
     "Note that the actual date associated with an occurrence of a worst call event might be calculated or explicit.@en"]})

(def YieldCalculationFormula
  "The formula used in determining the Yield."
  {:cmns-av/explanatoryNote
   #voc/lstr
    "The subject of this Formula is the Yield. The formula has an expression which can be defined either in tectual terms or by further local extension of the term \"Formula Expression\" to define the parameters used.@en",
   :db/ident :fibo-md-dbtx-aly/YieldCalculationFormula,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "yield calculation formula@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/DebtInstrumentYield,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-utl-alx/Formula
                     :fibo-md-dbtx-aly/YieldCalculationFormula],
   :skos/definition #voc/lstr "The formula used in determining the Yield.@en"})

(def YieldCalculationMethod
  "The method by which the yield is calculated. This includes a formula for calculation and a specific day count convention and compounding. You would apply this calculation method on top of the underlying terms and conditions, do for example the holiday calenders and so on, are used in these formulae. For final cash flow: Japanese yield will round down accrued interest. Add: The actual underlying math. Wall Street uses the same ICMA formula."
  {:db/ident :fibo-md-dbtx-aly/YieldCalculationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "yield calculation method@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-utl-alx/hasFormula,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/YieldCalculationFormula,
                      :rdf/type :owl/Restriction}
                     {:owl/allValuesFrom :fibo-fnd-utl-alx/Variable,
                      :owl/onProperty    :fibo-fnd-utl-alx/hasArgument,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :fibo-fnd-dt-fd/RecurrenceInterval,
                      :owl/onProperty :fibo-fbc-dae-dbt/hasCompoundingFrequency,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/Formula
                     :fibo-md-dbtx-aly/YieldCalculationMethod],
   :skos/definition
   #voc/lstr
    "The method by which the yield is calculated. This includes a formula for calculation and a specific day count convention and compounding. You would apply this calculation method on top of the underlying terms and conditions, do for example the holiday calenders and so on, are used in these formulae. For final cash flow: Japanese yield will round down accrued interest. Add: The actual underlying math. Wall Street uses the same ICMA formula.@en",
   :skos/editorialNote
   #voc/lstr
    "Initial reviewer notes 18 Nov: this uses the combination of the day count and the compounding gives you the name of the yield calculation method. Names are associated with algorithms. What yield you use to determining the present value. These are typically defined in a prospectus (for exchange traded) or Info Memorandum if it's traded in an OTC market. where it also defines the method itself. Action: look at some prospecti or get this from a vendor. Additional features 25 nov: Question - maybe Holiday calendar? Also date roll rules and roll back rules. These all apply. YC feeds in to Yield itself.@en"})

(def YieldToNextPut
  "yield to next put"
  {:db/ident :fibo-md-dbtx-aly/YieldToNextPut,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "yield to next put@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-md-dbtx-aly/hasOutlookPeriod,
     :owl/someValuesFrom :fibo-md-dbtx-aly/NextPut,
     :rdf/type           :owl/Restriction}
    :fibo-md-dbtx-aly/DebtInstrumentYield
    :fibo-md-dbtx-aly/YieldToNextPut
    {:owl/onProperty     :fibo-md-dbtx-aly/hasOutlookPeriod,
     :owl/someValuesFrom {:owl/unionOf
                          [:fibo-md-dbtx-aly/LifeAnalytic
                           {:owl/onProperty
                            :fibo-fbc-dae-dbt/hasOriginalTimeToMaturity,
                            :owl/someValuesFrom :cmns-dt/ExplicitDuration,
                            :rdf/type :owl/Restriction}
                           :fibo-sec-dbt-dbti/PrescriptiveEvent
                           :fibo-sec-dbt-dbti/RedemptionEvent],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
     :owl/someValuesFrom :fibo-fbc-fi-ip/SecurityPrice,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-ip/Yield
    {:owl/onProperty     :fibo-md-dbtx-aly/calculationFollowing,
     :owl/someValuesFrom :fibo-md-dbtx-aly/YieldCalculationMethod,
     :rdf/type           :owl/Restriction}]})

(def aggregateOf
  "aggregate of"
  {:db/ident :fibo-md-dbtx-aly/aggregateOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-dbtx-aly/InstrumentWeightedAverageLoanAge,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "aggregate of@en",
   :rdfs/range :fibo-md-dbtx-aly/PoolWeightedAverageLoanAge,
   :rdfs/subPropertyOf [:fibo-md-dbtx-aly/isAggregateOf
                        :fibo-md-dbtx-aly/aggregateOf]})

(def aggregateOf.1
  "aggregate of"
  {:db/ident :fibo-md-dbtx-aly/aggregateOf.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-dbtx-aly/InstrumentWeightedAverageRemainingMaturity,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "aggregate of@en",
   :rdfs/range :fibo-md-dbtx-aly/PoolWeightedAverageRemainingMaturity,
   :rdfs/subPropertyOf [:fibo-md-dbtx-aly/isAggregateOf
                        :fibo-md-dbtx-aly/aggregateOf.1]})

(def calculationFollowing
  "calculation following"
  {:db/ident :fibo-md-dbtx-aly/calculationFollowing,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-dbtx-aly/DebtInstrumentYield,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "calculation following@en",
   :rdfs/range :fibo-md-dbtx-aly/YieldCalculationMethod})

(def daysAccrued
  "The number of days that interest has accrued, as reflected in the price."
  {:db/ident :fibo-md-dbtx-aly/daysAccrued,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-md-dbtx-aly/DirtyPrice,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "days accrued@en",
   :rdfs/range :xsd/integer,
   :skos/definition
   #voc/lstr
    "The number of days that interest has accrued, as reflected in the price.@en"})

(def decimalPlaces
  "The number of decimal places used in the publication of the factor value."
  {:db/ident :fibo-md-dbtx-aly/decimalPlaces,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-md-dbtx-aly/PoolFactor,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "decimal places@en",
   :rdfs/range :xsd/integer,
   :skos/definition
   #voc/lstr
    "The number of decimal places used in the publication of the factor value.@en"})

(def defaultRateValue
  "default rate value"
  {:db/ident :fibo-md-dbtx-aly/defaultRateValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-dbtx-aly/DefaultRate,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "default rate value@en",
   :rdfs/range :fibo-fnd-utl-alx/Percentage})

(def determinesMarketPriceForDebt
  "determines market price for debt"
  {:db/ident :fibo-md-dbtx-aly/determinesMarketPriceForDebt,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-dbtx-aly/DebtSecuritiesMarketMaker,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "determines market price for debt@en",
   :rdfs/range :fibo-md-dbtx-aly/OTCBondMarketPrice})

(def equivalentLifeValue
  "The Equivalent Life in years at the stated date."
  {:db/ident :fibo-md-dbtx-aly/equivalentLifeValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-dbtx-aly/EquivalentLifeAnalytic,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "equivalent life value@en",
   :rdfs/range :cmns-dt/Duration,
   :skos/definition #voc/lstr
                     "The Equivalent Life in years at the stated date.@en"})

(def expressedAs
  "ABS = (100 * SMM)/100 + (SMM X (Age- 1)"
  {:db/ident :fibo-md-dbtx-aly/expressedAs,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-md-dbtx-aly/AbsolutePrepaymentRateFormula,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "expressed as@en",
   :rdfs/range :xsd/string,
   :skos/definition #voc/lstr "ABS = (100 * SMM)/100 + (SMM X (Age- 1)@en"})

(def hasAnalytic
  "has analytic"
  {:db/ident :fibo-md-dbtx-aly/hasAnalytic,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-sec-pls/DebtPool,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "has analytic@en",
   :rdfs/range :fibo-md-dbtx-aly/DebtPoolAnalyticalParameter})

(def hasDefaultRate
  "has default rate"
  {:db/ident :fibo-md-dbtx-aly/hasDefaultRate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-sec-pls/DebtPool,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "has default rate@en",
   :rdfs/range :fibo-md-dbtx-aly/DefaultRate})

(def hasFactor
  "has factor"
  {:db/ident :fibo-md-dbtx-aly/hasFactor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-sec-pls/DebtPool,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "has factor@en",
   :rdfs/range :fibo-md-dbtx-aly/PoolFactor})

(def hasMeasure
  "has measure"
  {:db/ident :fibo-md-dbtx-aly/hasMeasure,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-sec-pls/DebtPool,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "has measure@en",
   :rdfs/range :fibo-md-dbtx-aly/PrepaymentSpeed})

(def hasOutlookPeriod
  "has outlook period"
  {:db/ident :fibo-md-dbtx-aly/hasOutlookPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-dbtx-aly/DebtInstrumentYield,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "has outlook period@en",
   :rdfs/range {:owl/unionOf [:fibo-md-dbtx-aly/LifeAnalytic
                              {:owl/onProperty
                               :fibo-fbc-dae-dbt/hasOriginalTimeToMaturity,
                               :owl/someValuesFrom :cmns-dt/ExplicitDuration,
                               :rdf/type :owl/Restriction}
                              :fibo-sec-dbt-dbti/PrescriptiveEvent
                              :fibo-sec-dbt-dbti/RedemptionEvent],
                :rdf/type    :owl/Class}})

(def hasWac
  "has wac"
  {:db/ident :fibo-md-dbtx-aly/hasWac,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/MortgageBackedSecurity,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "has wac@en",
   :rdfs/range :fibo-md-dbtx-aly/WeightedAverageCoupon})

(def hasYield
  "has yield"
  {:db/ident :fibo-md-dbtx-aly/hasYield,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-dbti/TradableDebtInstrument,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "has yield@en",
   :rdfs/range :fibo-md-dbtx-aly/DebtInstrumentYield})

(def isAggregateOf
  "is aggregate of"
  {:db/ident :fibo-md-dbtx-aly/isAggregateOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-dbtx-aly/DebtPoolAnalyticalParameter,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "is aggregate of@en",
   :rdfs/range :fibo-md-dbtx-aly/DebtPoolAnalyticalParameter,
   :rdfs/subPropertyOf :fibo-md-dbtx-aly/isAggregateOf})

(def isCompounded
  "Definition needed Moved from Yield - assume this can only be about debt instrument or loan / debt yields i..e where the income relates to interest payments. ."
  {:db/ident :fibo-md-dbtx-aly/isCompounded,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-md-dbtx-aly/DebtInstrumentYield,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "is compounded@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #voc/lstr
    "Definition needed Moved from Yield - assume this can only be about debt instrument or loan / debt yields i..e where the income relates to interest payments. .@en"})

(def isDefaultMethodFor
  "is default method for"
  {:db/ident :fibo-md-dbtx-aly/isDefaultMethodFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-dbtx-aly/NativeYieldCalculationMethod,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "is default method for@en",
   :rdfs/range :fibo-sec-dbt-dbti/TradableDebtInstrument})

(def isRateOfChangeOf
  "is rate of change of"
  {:db/ident :fibo-md-dbtx-aly/isRateOfChangeOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-dbtx-aly/DebtConvexityAnalytic,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "is rate of change of@en",
   :rdfs/range :fibo-md-dbtx-aly/DurationAnalytic})

(def modifiedDurationValue
  "The Modified Duration in Years."
  {:db/ident :fibo-md-dbtx-aly/modifiedDurationValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-dbtx-aly/ModifiedDurationAnalytic,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "modified duration value@en",
   :rdfs/range :cmns-dt/Duration,
   :skos/definition #voc/lstr "The Modified Duration in Years.@en"})

(def priceIsTraded
  "The highest valuation over the period specified. Notes from Equity review, may apply to Debt also: this can be regarded as a derived price. See also note in LowPrice Difference: different rules used. May be based on trade OR quote price Analytic or Price?? this is a derived type but with a much simpler rule."
  {:db/ident :fibo-md-dbtx-aly/priceIsTraded,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-md-dbtx-aly/ExchangeTradedBondPrice,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "price is traded@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #voc/lstr
    "The highest valuation over the period specified. Notes from Equity review, may apply to Debt also: this can be regarded as a derived price. See also note in LowPrice Difference: different rules used. May be based on trade OR quote price Analytic or Price?? this is a derived type but with a much simpler rule.@en"})

(def priceQuotedExDividend
  "Whether or not the yield is based on a price which is quoted ex-dividend. When a bond is said to trade ex-dividend it means that there is a period of time prior to each coupon payment during which a bond purchaser does not receive custody of the next coupon. That payment is made to the previous bond holder and accrued interest is therefore negative during the ex-dividend period."
  {:db/ident :fibo-md-dbtx-aly/priceQuotedExDividend,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-md-dbtx-aly/DebtInstrumentYield,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "price quoted ex dividend@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #voc/lstr
    "Whether or not the yield is based on a price which is quoted ex-dividend. When a bond is said to trade ex-dividend it means that there is a period of time prior to each coupon payment during which a bond purchaser does not receive custody of the next coupon. That payment is made to the previous bond holder and accrued interest is therefore negative during the ex-dividend period.@en"})

(def quotedExDividend
  "Whether or not the price is quoted ex-dividend. When a bond is said to trade ex-dividend it means that there is a period of time prior to each coupon payment during which a bond purchaser does not receive custody of the next coupon. That payment is made to the previous bond holder and accrued interest is therefore negative during the ex-dividend period."
  {:db/ident :fibo-md-dbtx-aly/quotedExDividend,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-fi-ip/SecurityPrice,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "quoted ex dividend@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #voc/lstr
    "Whether or not the price is quoted ex-dividend. When a bond is said to trade ex-dividend it means that there is a period of time prior to each coupon payment during which a bond purchaser does not receive custody of the next coupon. That payment is made to the previous bond holder and accrued interest is therefore negative during the ex-dividend period.@en"})

(def roundingConvention
  "The rounding convention used in the calculation method."
  {:db/ident :fibo-md-dbtx-aly/roundingConvention,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-md-dbtx-aly/YieldCalculationMethod,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label #voc/lstr "rounding convention@en",
   :rdfs/range :xsd/string,
   :skos/definition
   #voc/lstr "The rounding convention used in the calculation method.@en"})