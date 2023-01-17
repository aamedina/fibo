(ns net.wikipunk.rdf.fibo-md-dbtx-aly
  "This ontology covers an extensive range of analytical measures for debt instruments and pools of debt instruments. These cover the well-known concepts of convexity, duration and life, as well as weighted average loan ages and maturities, prepayments speeds etc. for debt pools. Most of the widely referenced variants of these are included, for example modified duration. Some yield related concepts (e.g. for equivalent yield) are also included. Debt pricing and yields are intimately related, and this ontology sets out the basic concepts of debt price, including different ways in which debt and bod prices are described and calculated, as well as a range of different kinds of yield (simple yield, Wall Street Yield, Japanese Yield and so on). The pricing terms are supported by a range of trading and exchange related concepts that are used to differentiate different kinds of debt price, for example last, high and low exchange prices."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :dcterms/abstract
   "This ontology covers an extensive range of analytical measures for debt instruments and pools of debt instruments. These cover the well-known concepts of convexity, duration and life, as well as weighted average loan ages and maturities, prepayments speeds etc. for debt pools. Most of the widely referenced variants of these are included, for example modified duration. Some yield related concepts (e.g. for equivalent yield) are also included. Debt pricing and yields are intimately related, and this ontology sets out the basic concepts of debt price, including different ways in which debt and bod prices are described and calculated, as well as a range of different kinds of yield (simple yield, Wall Street Yield, Japanese Yield and so on). The pricing terms are supported by a range of trading and exchange related concepts that are used to differentiate different kinds of debt price, for example last, high and low exchange prices.",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Arrangements/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/Indicators/Indicators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/DebtInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/InterestRates/InterestRates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/Pools/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/Bonds/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/PoolBackedSecurities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/MortgageBackedSecurities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/ProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/InstrumentPricing/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/DebtTemporal/DebtAnalytics/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fbc-fi-ip"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
    "fibo-fnd-arr-arr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
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
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfa/prefix "fibo-md-dbtx-aly",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Debt Analytics Ontology"},
   :sm/fileAbbreviation "fibo-md-dbtx-aly"})

(def AbsolutePrepaymentRate
  "The absolute prepayment rate (for ABS) is the standard measure of prepayment rates in the auto-loan sector. ABS measures the monthly rate of loan prepayments as a percentage of the original pool balance. ABS is defined by the following formula where SMM refers to Single Monthly Mortality, which measures the percentage of dollars prepaid in a given month expressed as a percentage of the scheduled loan balance. ABS = (100 * SMM)/100 + (SMM X (Age- 1)"
  {:db/ident :fibo-md-dbtx-aly/AbsolutePrepaymentRate,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The ABS measurement differs from conditional prepayment rate (CPR) used in the mortgage industry, which measures prepayment as an annualized percentage of the current pool balance."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "absolute prepayment rate"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-utl-alx/hasFormula,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/AbsolutePrepaymentRateFormula,
                      :rdf/type :owl/Restriction}
                     :fibo-md-dbtx-aly/DebtPoolAnalyticalParameter],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The absolute prepayment rate (for ABS) is the standard measure of prepayment rates in the auto-loan sector. ABS measures the monthly rate of loan prepayments as a percentage of the original pool balance. ABS is defined by the following formula where SMM refers to Single Monthly Mortality, which measures the percentage of dollars prepaid in a given month expressed as a percentage of the scheduled loan balance. ABS = (100 * SMM)/100 + (SMM X (Age- 1)"}})

(def AbsolutePrepaymentRateFormula
  "ABS is defined by the following formula where SMM refers to Single Monthly Mortality, which measures the percentage of dollars prepaid in a given month expressed as a percentage of the scheduled loan balance. ABS = (100 * SMM)/100 + (SMM X (Age- 1)"
  {:db/ident :fibo-md-dbtx-aly/AbsolutePrepaymentRateFormula,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "absolute prepayment rate formula"},
   :rdfs/subClassOf :fibo-fnd-utl-alx/Formula,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ABS is defined by the following formula where SMM refers to Single Monthly Mortality, which measures the percentage of dollars prepaid in a given month expressed as a percentage of the scheduled loan balance. ABS = (100 * SMM)/100 + (SMM X (Age- 1)"}})

(def AccruedInterestAmount
  "The interest accrued on the bond or debt instrument at the time that the price is quoted. If this is a dirty price, this is the amount of accrued interest that is included in the price. This is therefore passed on to the purchaser of the bond or debt instrument."
  {:db/ident :fibo-md-dbtx-aly/AccruedInterestAmount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "accrued interest amount"},
   :rdfs/subClassOf :fibo-fbc-dae-dbt/Interest,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The interest accrued on the bond or debt instrument at the time that the price is quoted. If this is a dirty price, this is the amount of accrued interest that is included in the price. This is therefore passed on to the purchaser of the bond or debt instrument."}})

(def AverageLife
  "An estimate of the number of terms to maturity, taking the possibility of early payments into account. Average life is calculated using the weighted average time to the receipt of all future cash flows."
  {:db/ident :fibo-md-dbtx-aly/AverageLife,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Where it refers to pre-payment above, if the bond does not include prepayment then this is not included. However, analytics that refer to this e.g. Yield to Average Life, then this figure is relevant. It is not relevant for other types of bond where e.g. you would use yield to next call, yield to worst etc. Average Life used in place of Maturity for Yield Calculation. This is not only used for Yield calculations though. It is referred to as an analytic figure in its own right. Average Life uses one of a number of standard pre-payment models (for structured finance at least). For MBS, the average life includes some calculations to take account of pre-payments on the underlying mortgages. This takes account of the possibillity of borrowers paying early. This has to be modeled or forecast (not given) as it's a function of market conditions and interest rate. You would not see this in a market data feed. When you model MBS you calculate Average Life as part of the model i.e. you estimate the percentage of prepayment in the next x length of time and factor this into the Average Life. Refers to Weighted Average Time to receipt of future cash flows. For MBS, early payments will shorten the Average Life. For Student Loans, Credit Card, Loan etc, i.e. all Pool Backed (any bond that has securitized debt). Other bonds: Sinking Funds etc., also Early Payment - partial Call for a corporate / regular bond. Early Payment for pass through has the same effect. Sinking Fund: Each payment is part principal and part interest, this is implicit in the overall definition of \"Early payment\"."},
   :owl/disjointWith :fibo-md-dbtx-aly/EquivalentLifeAnalytic,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "average life"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/PrepaymentSpeed,
                      :rdf/type           :owl/Restriction}
                     :fibo-md-dbtx-aly/LifeAnalytic],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An estimate of the number of terms to maturity, taking the possibility of early payments into account. Average life is calculated using the weighted average time to the receipt of all future cash flows."}})

(def AverageLifeAtIssue
  "The Average Life analytic at the time the security was issued."
  {:db/ident :fibo-md-dbtx-aly/AverageLifeAtIssue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "average life at issue"},
   :rdfs/subClassOf :fibo-md-dbtx-aly/AverageLife,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The Average Life analytic at the time the security was issued."}})

(def BondEquivalentYield
  "Yield determined on an equivalent basis to the yield of another bond. This is used to be able to realistically compare prices between debt instruments across different markets."
  {:db/ident :fibo-md-dbtx-aly/BondEquivalentYield,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "For example when comparing Treasury with Corp it's called a Corp Bond Equivalent Yield; when comparing other kinds of yields this would be labelled differently. Treasury bills typically in discount rates - that's one of the ways you would compare TB or MM or RePo to BEQ - by changing the day count. Detailed implementation of this: This term refers to the type of bond that it is equivalent to, that is the type of bond whose yield is normally determined according to the yield calculation method that is used in determining this Bond Equivalent Yield figure. The type of bond in this instance is defined in relation to the market on which that bond trades, for example the US Corporate Bond Market."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bond equivalent yield"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fbc-dae-dbt/isBasedOn,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/EquivalentYieldCalculationMethod,
                      :rdf/type :owl/Restriction}
                     :fibo-md-dbtx-aly/RelativelyDefinedDebtInstrumentYield],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Yield determined on an equivalent basis to the yield of another bond. This is used to be able to realistically compare prices between debt instruments across different markets."}})

(def CashStructuredFinanceInstrumentPrice
  "When the price is above a certain level (70), you get a quote in reference to an index e.g. LIBOR+50bp i.e. the yield. When you get below a certain price you get a quote such as 65c to a dollar. Percentage? not seen. Would be a whole number, interpreted as c/$"
  {:db/ident :fibo-md-dbtx-aly/CashStructuredFinanceInstrumentPrice,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This might be a Price, a Spread or a Yield, i.e. \"here's the price., the current Yield is this, and here's the Spread\"."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cash structured finance instrument price"},
   :rdfs/subClassOf :fibo-fbc-fi-ip/SecurityPrice,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "When the price is above a certain level (70), you get a quote in reference to an index e.g. LIBOR+50bp i.e. the yield. When you get below a certain price you get a quote such as 65c to a dollar. Percentage? not seen. Would be a whole number, interpreted as c/$"}})

(def CleanPrice
  "A bond or debt instrument price that does not include accrued interest."
  {:db/ident :fibo-md-dbtx-aly/CleanPrice,
   :owl/disjointWith :fibo-md-dbtx-aly/DirtyPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "clean price"},
   :rdfs/subClassOf :fibo-fbc-fi-ip/SecurityPrice,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A bond or debt instrument price that does not include accrued interest."}})

(def CollectionOfDebtPools
  "pool consisting of one or more pools of debt instrument(s)"
  {:db/ident :fibo-md-dbtx-aly/CollectionOfDebtPools,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "collection of debt pools"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-arr/hasConstituent,
                      :owl/someValuesFrom :fibo-sec-sec-pls/DebtPool,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/Pool],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "pool consisting of one or more pools of debt instrument(s)"}})

(def CreditSpread
  "yield spread that reflects the additional net yield an investor can earn from a security with more credit risk relative to one with less credit risk"
  {:db/ident :fibo-md-dbtx-aly/CreditSpread,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The credit spread of a particular security is often quoted in relation to the yield on a credit risk-free benchmark security or reference rate. Further Notes There are several measures of credit spread, including Z-spread and option-adjusted spread. Old definition (Algo) The spread between the credit rating of something and its maturity. THis is now defined as a different term pending further review with Algorithmics. Update from SMER. difference between risk free price (price of govt bond) and the price of this security. (matches Wikipedia definition above) i.e. price of this credit versus the price of a (near) risk free credit. The latter is a reference security with low risk such as a Treasury Bond. Is this between prices or between yields? can be expressed as either wrt price or yield, and this is detemined by context for different markets. Try and get a list. This is more generic - the meaning is not that it is speciufically wrt yield as such. Debt Price Spread is in context of price, whereas this is more generic."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit spread"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
                      :owl/someValuesFrom :fibo-ind-ir-ir/ReferenceInterestRate,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-ip/YieldSpread],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "yield spread that reflects the additional net yield an investor can earn from a security with more credit risk relative to one with less credit risk"}})

(def CurrentYieldCalculationMethod
  "The ratio of the interest payment amount to the clean price."
  {:db/ident :fibo-md-dbtx-aly/CurrentYieldCalculationMethod,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This is a kind of yield that applies to debt instruments only as it relates to the clean price. It differs from the simple yield in that simple yield relates to the actual price paid for the bond, which on will differ from the clean price by the amount of accrued interest."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "current yield calculation method"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/CleanPrice,
                      :rdf/type           :owl/Restriction}
                     :fibo-md-dbtx-aly/YieldCalculationMethod],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "The ratio of the interest payment amount to the clean price."}})

(def DebtConvexityAnalytic
  "The second derivative of a security's price with respect to its yield, divided by the security's price. A security exhibits positive convexity when its price rises more for a downward move in its yield than its price declines for an equal upward move in its yield. Further notes: A measure of the change in price for a given change in Modified Duration. This always (necessarily) refers to Modified Duration. This is used as another risk measurement. Numerator is always (a) duration - either MacCaulays or Modified. Always rate of change of (one of the) Duration against some other parameter. The other paramater can be characterised as a Yield (it may be the Price, but that has a relationship to the Yield in any case). REVIEW: Inconsistency in the above - is it always necessarily Modified Duration that is referred to, or \"any\" Duration measure (Macaulays and.or Modified)? notes 9 Dec A measure of the sensitivity of the price with reference to interest rates. This is normally determined with reference to maturity, but since there are different maturity dates, this figure gives an estimate of the equitvalent if you had a homogenous portfolio, i.e. this is an estimate based on a pure equivalent, homogenous portfolio. Convexity of instrument versus portfolio. Sees instrument in terms of the set of cashflows. The term Convexity can be applied either to a bond or to a portfolio. More notes: When you get Convexit in MD, it will tell you what Duration it is refrfering to, along with Redemption Date (logically). Also if there is Option Adjusted Yield, there is a third set of analytics. What are they? i.e. OA Convexity, Duration Yield and the rest. Conclusions: Agreed to revisit this in OTC."
  {:db/ident :fibo-md-dbtx-aly/DebtConvexityAnalytic,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt convexity analytic"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-md-dbtx-aly/isRateOfChangeOf,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/DurationAnalytic,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
                      :owl/someValuesFrom :fibo-ind-ind-ind/MarketSpread,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/DebtInstrumentYield,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-fd/DatedCollectionConstituent],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The second derivative of a security's price with respect to its yield, divided by the security's price. A security exhibits positive convexity when its price rises more for a downward move in its yield than its price declines for an equal upward move in its yield. Further notes: A measure of the change in price for a given change in Modified Duration. This always (necessarily) refers to Modified Duration. This is used as another risk measurement. Numerator is always (a) duration - either MacCaulays or Modified. Always rate of change of (one of the) Duration against some other parameter. The other paramater can be characterised as a Yield (it may be the Price, but that has a relationship to the Yield in any case). REVIEW: Inconsistency in the above - is it always necessarily Modified Duration that is referred to, or \"any\" Duration measure (Macaulays and.or Modified)? notes 9 Dec A measure of the sensitivity of the price with reference to interest rates. This is normally determined with reference to maturity, but since there are different maturity dates, this figure gives an estimate of the equitvalent if you had a homogenous portfolio, i.e. this is an estimate based on a pure equivalent, homogenous portfolio. Convexity of instrument versus portfolio. Sees instrument in terms of the set of cashflows. The term Convexity can be applied either to a bond or to a portfolio. More notes: When you get Convexit in MD, it will tell you what Duration it is refrfering to, along with Redemption Date (logically). Also if there is Option Adjusted Yield, there is a third set of analytics. What are they? i.e. OA Convexity, Duration Yield and the rest. Conclusions: Agreed to revisit this in OTC."}})

(def DebtInstrumentAnalyticalParameter
  "parameter describing some aspect of the behavior of one or more debt instrument(s) that may vary over time"
  {:db/ident :fibo-md-dbtx-aly/DebtInstrumentAnalyticalParameter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt instrument analytical parameter"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :fibo-fnd-dt-fd/DatePeriod,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/appliesTo,
                      :owl/someValuesFrom :fibo-sec-sec-pls/DebtPool,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-utl-alx/ScopedMeasure],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "parameter describing some aspect of the behavior of one or more debt instrument(s) that may vary over time"}})

(def DebtInstrumentYield
  "The return on the debt instrument at the stated price."
  {:db/ident :fibo-md-dbtx-aly/DebtInstrumentYield,
   :fibo-fnd-utl-av/explanatoryNote {:rdf/language "en",
                                     :rdf/value
                                     "Yield has a relationship to the price."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt instrument yield"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-md-dbtx-aly/hasOutlookPeriod,
                      :owl/someValuesFrom
                      {:owl/unionOf
                       [:fibo-md-dbtx-aly/LifeAnalytic
                        {:owl/onProperty
                         :fibo-fbc-dae-dbt/hasOriginalTimeToMaturity,
                         :owl/someValuesFrom :fibo-fnd-dt-fd/ExplicitDuration,
                         :rdf/type :owl/Restriction}
                        :fibo-sec-dbt-dbti/PrescriptiveEvent
                        :fibo-sec-dbt-dbti/RedemptionEvent],
                       :rdf/type :owl/Class},
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-md-dbtx-aly/calculationFollowing,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/YieldCalculationMethod,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
                      :owl/someValuesFrom :fibo-fbc-fi-ip/SecurityPrice,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-ip/Yield],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The return on the debt instrument at the stated price."}})

(def DebtPoolAnalyticalParameter
  "measure of some aspect of some pool or pools of debt, such as a pool of loans or a pool of securitized debt products"
  {:db/ident :fibo-md-dbtx-aly/DebtPoolAnalyticalParameter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt pool analytical parameter"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
                      :owl/someValuesFrom :fibo-fnd-dt-fd/DatePeriod,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-rel-rel/appliesTo,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/CollectionOfDebtPools,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/ScopedMeasure],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "measure of some aspect of some pool or pools of debt, such as a pool of loans or a pool of securitized debt products"}})

(def DebtPriceSpread
  "The difference between the [what?] of a security and the fair price value of a different security which is used as a point of reference. The spread is used to determine the price of the instrument. (draft definition)"
  {:db/ident :fibo-md-dbtx-aly/DebtPriceSpread,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt price spread"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/appliesTo,
                      :owl/someValuesFrom :fibo-fbc-fi-ip/SecurityPrice,
                      :rdf/type           :owl/Restriction}
                     :fibo-ind-ind-ind/MarketSpread],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The difference between the [what?] of a security and the fair price value of a different security which is used as a point of reference. The spread is used to determine the price of the instrument. (draft definition)"},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "This was \"Spread\" in the Debt pricing reviews, however that word has at least 2 other uses (spread between equity bid and offer prices; spread for derivatives). Detailed notes from Debt Pricing Review session 5 Aug: Identify what the spread is in relation to e.g. LIBOR. ALSO If fixed of floating. So if it's a FRN, For a fixed rate bond, it's priced off the on-the-run, e.g. a 30 year bond is priced as a spread wrt a 30 year treasury bond. So e..g spread would be something like 10bp+the value of the 30 year on the run Treasury. On the Run: definition needed. Also class of Thing and where this should go."}})

(def DebtSecuritiesMarketMaker
  "An actor which has the role of Market Maker in a given market."
  {:db/ident :fibo-md-dbtx-aly/DebtSecuritiesMarketMaker,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt securities market maker"},
   :rdfs/subClassOf [{:owl/onProperty
                      :fibo-md-dbtx-aly/determinesMarketPriceForDebt,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/OTCBondMarketPrice,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-pas-pas/ServiceProvider],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An actor which has the role of Market Maker in a given market."}})

(def DebtYieldToAverageLife
  "The yield achieved by substituting a bond's average life for the issue's final maturity date."
  {:db/ident :fibo-md-dbtx-aly/DebtYieldToAverageLife,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt yield to average life"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-md-dbtx-aly/hasOutlookPeriod,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/AverageLife,
                      :rdf/type           :owl/Restriction}
                     :fibo-md-dbtx-aly/DebtInstrumentYield],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The yield achieved by substituting a bond's average life for the issue's final maturity date."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Assume from this that there is also a Yield to Equivalent Life. Some sources have these as the same term, whereas we have separated them."}})

(def DebtYieldToEquivalentLife
  "The yield achieved by substituting a bond's equivalent life for the issue's final maturity date."
  {:db/ident :fibo-md-dbtx-aly/DebtYieldToEquivalentLife,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt yield to equivalent life"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-md-dbtx-aly/hasOutlookPeriod,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/EquivalentLifeAnalytic,
                      :rdf/type :owl/Restriction}
                     :fibo-md-dbtx-aly/DebtInstrumentYield],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The yield achieved by substituting a bond's equivalent life for the issue's final maturity date."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Some sources have Average Life and Equivalent Life as the same term, whereas we have separated them."}})

(def DebtYieldToMaturity
  "The internal rate of return an investor would achieve if he or she purchased that bond at its current dirty price, and held it to maturity, assuming all coupon and principal payments are received as scheduled."
  {:db/ident :fibo-md-dbtx-aly/DebtYieldToMaturity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt yield to maturity"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-md-dbtx-aly/hasOutlookPeriod,
                      :owl/someValuesFrom
                      {:owl/onProperty
                       :fibo-fbc-dae-dbt/hasOriginalTimeToMaturity,
                       :owl/someValuesFrom :fibo-fnd-dt-fd/ExplicitDuration,
                       :rdf/type :owl/Restriction},
                      :rdf/type :owl/Restriction}
                     :fibo-md-dbtx-aly/DebtInstrumentYield],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The internal rate of return an investor would achieve if he or she purchased that bond at its current dirty price, and held it to maturity, assuming all coupon and principal payments are received as scheduled."}})

(def DebtYieldToNextCall
  "The yield of a bond to the next possible call date."
  {:db/ident :fibo-md-dbtx-aly/DebtYieldToNextCall,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt yield to next call"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-md-dbtx-aly/hasOutlookPeriod,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/NextCall,
                      :rdf/type           :owl/Restriction}
                     :fibo-md-dbtx-aly/DebtInstrumentYield],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The yield of a bond to the next possible call date."}})

(def DebtYieldToWorst
  "Yield to the worst case of when the instrument might be called."
  {:db/ident :fibo-md-dbtx-aly/DebtYieldToWorst,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt yield to worst"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-md-dbtx-aly/hasOutlookPeriod,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/WorstCall,
                      :rdf/type           :owl/Restriction}
                     :fibo-md-dbtx-aly/DebtInstrumentYield],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Yield to the worst case of when the instrument might be called."}})

(def DefaultRate
  "The rate at which holders of loans in the pool default on those loans."
  {:db/ident :fibo-md-dbtx-aly/DefaultRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "default rate"},
   :rdfs/subClassOf :fibo-md-dbtx-aly/DebtPoolAnalyticalParameter,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The rate at which holders of loans in the pool default on those loans."}})

(def DerivedPrice
  "price that stems from another source or calculation rather than being quoted or based on actual trading data"
  {:db/ident :fibo-md-dbtx-aly/DerivedPrice,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "There are evaluated prices in which an independent source evaluates a price they have derived, and there are prices which are derived within a firm, from supplied, published end of day price spreads or other market data."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "derived price"},
   :rdfs/subClassOf :fibo-fbc-fi-ip/SecurityPrice,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "price that stems from another source or calculation rather than being quoted or based on actual trading data"}})

(def DirtyPrice
  "dirty price"
  {:db/ident :fibo-md-dbtx-aly/DirtyPrice,
   :owl/disjointWith :fibo-ind-ind-ind/QuotedPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dirty price"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/AccruedInterestAmount,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fi-ip/SecurityPrice]})

(def DiscountedInstrumentYield
  "Yield quoted for a discount instrument. This is the ratio of the discount to the face value, divided by the period to maturity as a fraction of a year."
  {:db/ident :fibo-md-dbtx-aly/DiscountedInstrumentYield,
   :fibo-fnd-utl-av/usageNote {:rdf/language "en",
                               :rdf/value    "Applies to Debt only."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "discounted instrument yield"},
   :rdfs/subClassOf :fibo-md-dbtx-aly/DebtInstrumentYield,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Yield quoted for a discount instrument. This is the ratio of the discount to the face value, divided by the period to maturity as a fraction of a year."}})

(def DurationAnalytic
  "Weighted average time to receipt of all the payments."
  {:db/ident :fibo-md-dbtx-aly/DurationAnalytic,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "duration analytic"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/DebtInstrumentYield,
                      :rdf/type           :owl/Restriction}
                     :fibo-md-dbtx-aly/DebtInstrumentAnalyticalParameter],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Weighted average time to receipt of all the payments."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Duration in general is a measure of % price change for a given change in yield. See definition from BMB The duration on a traditional bond will be much shorter than the duration relative to the maturity. Duration is the first derivative of the curve between Price and Yield. There are multiple types of duration, all of which are variants of this. So Duration is the first derivative and the different type of duration measure are different ways of measuring this, for example a \"quick and dirty\" measure of duration or one which."}})

(def EffectiveDuration
  "effective duration"
  {:db/ident :fibo-md-dbtx-aly/EffectiveDuration,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "effective duration"},
   :rdfs/subClassOf :fibo-md-dbtx-aly/DurationAnalytic})

(def EffectiveYield
  "effective yield"
  {:db/ident :fibo-md-dbtx-aly/EffectiveYield,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "effective yield"},
   :rdfs/subClassOf :fibo-md-dbtx-aly/DebtInstrumentYield,
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "The difference between this and Native yield is as per note: Native yield relates to price quotation context; Effective Yild is in relation to portfolio analytics. Recall: every analytic formula relates to the set of cash flows, so there are assumptions underlying each of these, For example the assumption that Y is constant, which it isn't (because there is a curve, which may be convex not linear (is that right?). So you can compare rate or return between what I see and what the market has out there. In the US market: a Y which is calculated using Monto Carlo method simulation. relationship facts to add: Relation to method / formula (e.g. Monte Carlo), and the method used to determine the actual figure for the MC method. eff Y for single instrument: E Y for bonds without calls and stuff. Variation in this: whether we look at a whole set of bonds YTM quoted by Bmb would be the YTM quoted according to whatever the market is - = the NAtive Yield. SO: Publicly quoted more: choose another adjective."}})

(def EquivalentLifeAnalytic
  "equivalent life analytic"
  {:db/ident :fibo-md-dbtx-aly/EquivalentLifeAnalytic,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equivalent life analytic"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-sec-dbt-bnd/BondWithPartialCall,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fbc-dae-dbt/isBasedOn,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/PartialCallsEstimationModel,
                      :rdf/type :owl/Restriction}
                     :fibo-md-dbtx-aly/LifeAnalytic]})

(def EquivalentYieldCalculationMethod
  "equivalent yield calculation method"
  {:db/ident :fibo-md-dbtx-aly/EquivalentYieldCalculationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equivalent yield calculation method"},
   :rdfs/subClassOf :fibo-md-dbtx-aly/RelativeYieldCalculationMethod})

(def ExchangeTradedBondPrice
  "exchange traded bond price"
  {:db/ident :fibo-md-dbtx-aly/ExchangeTradedBondPrice,
   :owl/disjointWith :fibo-md-dbtx-aly/OTCBondMarketPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "exchange traded bond price"},
   :rdfs/subClassOf :fibo-fbc-fi-ip/SecurityPrice})

(def FFIECDown300PrepaySpeed
  "Public Securities Association (PSA) speed used for the underlying collateral for cash-flow calculations in the \"down 300\" scenario."
  {:db/ident :fibo-md-dbtx-aly/FFIECDown300PrepaySpeed,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "f f i e c down 300 prepay speed"},
   :rdfs/subClassOf :fibo-md-dbtx-aly/PrepaymentSpeed,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Public Securities Association (PSA) speed used for the underlying collateral for cash-flow calculations in the \"down 300\" scenario."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Detailed parameters to follow, but basically these three PSA terms are differentiated by the fact that they reference 3 different prepayment models, so each of these will refer to a sub-type of the term \"Loan Pool Prepayment Model\". For now the semantics are defined only in this written definition. Add model variants and terms in a future version."}})

(def FFIECUp300PrepaySpeed
  "Public Securities Association (PSA) speed used for the underlying collateral for cash-flow calculations in the \"up 300\" scenario."
  {:db/ident :fibo-md-dbtx-aly/FFIECUp300PrepaySpeed,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "f f i e c up 300 prepay speed"},
   :rdfs/subClassOf :fibo-md-dbtx-aly/PrepaymentSpeed,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Public Securities Association (PSA) speed used for the underlying collateral for cash-flow calculations in the \"up 300\" scenario."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Detailed parameters to follow, but basically these three PSA terms are differentiated by the fact that they reference 3 different prepayment models, so each of these will refer to a sub-type of the term \"Loan Pool Prepayment Model\". For now the semantics are defined only in this written definition. Add model variants and terms in a future version."}})

(def ICMAYieldFormula
  "The calculation method specified by ICMA (formerly ISMA) for determination of yield for fixed-rate bonds."
  {:db/ident :fibo-md-dbtx-aly/ICMAYieldFormula,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This basic formula is used across many markets, including the US and most of Europe. While individual markets may have different flavors (French round their bonds to 5 decimals, UK Gilts have ex-div), the formula is still the same. This would be the formula used by \"Wall Street Yield\", \"US Treasury Yield\", \"Corporate Bond Yield\" etc. Notes Origin:Fidessa"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "i c m a yield formula"},
   :rdfs/subClassOf :fibo-md-dbtx-aly/YieldCalculationFormula,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The calculation method specified by ICMA (formerly ISMA) for determination of yield for fixed-rate bonds."}})

(def ImpliedForwardRate
  "implied forward rate"
  {:db/ident :fibo-md-dbtx-aly/ImpliedForwardRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "implied forward rate"},
   :rdfs/subClassOf :fibo-fnd-utl-alx/RatioValue})

(def InstrumentWeightedAverageLoanAge
  "A dollar-weighted average measuring the age of the individual loans in a mortgage pass-through or pooled security, such as Ginnie Mae or a Freddie Mac security. The WALA is measured as the time in months since the origination of the loans, with the weighting based on each loan's size in proportion to the aggregate total of the pool."
  {:db/ident :fibo-md-dbtx-aly/InstrumentWeightedAverageLoanAge,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This is defined by the issuer. WALA is more official, not an analysis from a vendor. This changes but the values are relayed by the issuer on an ongoing basis. Investopedia explains Weighted Average Loan Age - WALA The weighted average age will change over time as some mortgages get paid off faster than others. Based on the issuer of the mortgage-backed securities (MBS), the WALA may be weighted on the remaining principal balance dollar figure, or the beginning notional value of the loan. The flip side of the WALA is the weighted average maturity (WAM), which is a dollar-weighted measure of the months remaining until the principal amounts are completely repaid on each loan in the pool."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "instrument weighted average loan age"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-md-dbtx-aly/aggregateOf,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/PoolWeightedAverageLoanAge,
                      :rdf/type :owl/Restriction}
                     :fibo-md-dbtx-aly/DebtPoolAnalyticalParameter],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A dollar-weighted average measuring the age of the individual loans in a mortgage pass-through or pooled security, such as Ginnie Mae or a Freddie Mac security. The WALA is measured as the time in months since the origination of the loans, with the weighting based on each loan's size in proportion to the aggregate total of the pool."}})

(def InstrumentWeightedAverageRemainingMaturity
  "The weighted average of the time until all maturities on loans in a mortgage-backed or asset backed security. The higher the weighted average to maturity of the loans, the longer the loans in the security have until maturity."
  {:db/ident :fibo-md-dbtx-aly/InstrumentWeightedAverageRemainingMaturity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "instrument weighted average remaining maturity"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-md-dbtx-aly/aggregateOf.1,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/PoolWeightedAverageRemainingMaturity,
                      :rdf/type :owl/Restriction}
                     :fibo-md-dbtx-aly/DebtPoolAnalyticalParameter],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The weighted average of the time until all maturities on loans in a mortgage-backed or asset backed security. The higher the weighted average to maturity of the loans, the longer the loans in the security have until maturity."}})

(def InternallyDeterminedPriceSpread
  "The spread determined internally within the organisation from information available at their own trading desks. Further Notes Internal prices within a bank would be determined by surveying their own traders. So e.g. corporate desk trades these 30 bonds, get the daily spreads on those at the end of the day and calculate the price. The traders determine the pricing during the based on market movements. (this is all for OTC traded bonds, not exchange traded bonds)."
  {:db/ident :fibo-md-dbtx-aly/InternallyDeterminedPriceSpread,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "internally determined price spread"},
   :rdfs/subClassOf :fibo-md-dbtx-aly/DebtPriceSpread,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The spread determined internally within the organisation from information available at their own trading desks. Further Notes Internal prices within a bank would be determined by surveying their own traders. So e.g. corporate desk trades these 30 bonds, get the daily spreads on those at the end of the day and calculate the price. The traders determine the pricing during the based on market movements. (this is all for OTC traded bonds, not exchange traded bonds)."}})

(def InterpolatedPrice
  "A price determined by interpolation between available price figures, using some algorithm or curve."
  {:db/ident :fibo-md-dbtx-aly/InterpolatedPrice,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Uses an algorithm to interpolate a price from two observed prices. Examples include price derived by interpolation between prices e.g. between Bid and Offer (among others). also includes Yield Curves and implied forward curves. That is, interpolation may either be linear (straight line interpolation between two values) or may be expressed as a non linear curve such as a yield curve or an implied forward curve."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "interpolated price"},
   :rdfs/subClassOf :fibo-md-dbtx-aly/DerivedPrice,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A price determined by interpolation between available price figures, using some algorithm or curve."}})

(def JapaneseCompoundYieldCalculationMethod
  "No definition in selection list."
  {:db/ident :fibo-md-dbtx-aly/JapaneseCompoundYieldCalculationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "japanese compound yield calculation method"},
   :rdfs/subClassOf :fibo-md-dbtx-aly/YieldCalculationMethod,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "No definition in selection list."}})

(def JapaneseSimpleYieldCalculationMethod
  "No definition.Term put here from memory. 02 Dec changed from Japanese Yield to Japanese Simple Yield. note hat Japanese Compound yield also here (from FIBIM or anothe rlist, added 25 nov with the rest)."
  {:db/ident :fibo-md-dbtx-aly/JapaneseSimpleYieldCalculationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "japanese simple yield calculation method"},
   :rdfs/subClassOf :fibo-md-dbtx-aly/YieldCalculationMethod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "No definition.Term put here from memory. 02 Dec changed from Japanese Yield to Japanese Simple Yield. note hat Japanese Compound yield also here (from FIBIM or anothe rlist, added 25 nov with the rest)."}})

(def KeyRateDuration
  "key rate duration"
  {:db/ident :fibo-md-dbtx-aly/KeyRateDuration,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "key rate duration"},
   :rdfs/subClassOf :fibo-md-dbtx-aly/DurationAnalytic})

(def LifeAnalytic
  "Some measure of the life of a security, other than the actual time to maturity itself. This is a derived figure, based on certain parameters as appropriate to that type of instrument, to give a figure that is equivalent to and similar to the basic maturity of the instrument, for the purposes of analysing that security."
  {:db/ident :fibo-md-dbtx-aly/LifeAnalytic,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "life analytic"},
   :rdfs/subClassOf :fibo-md-dbtx-aly/DebtInstrumentAnalyticalParameter,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Some measure of the life of a security, other than the actual time to maturity itself. This is a derived figure, based on certain parameters as appropriate to that type of instrument, to give a figure that is equivalent to and similar to the basic maturity of the instrument, for the purposes of analysing that security."}})

(def LoanPoolPrepaymentModel
  "Model of the prepayments of loans in a pool of individual loans, such as a mortgage pool or loan pool."
  {:db/ident :fibo-md-dbtx-aly/LoanPoolPrepaymentModel,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This model captures the parameters that may influence the prepayment of loans or mortgages and relates these mathematically."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "loan pool prepayment model"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/LoanPrepaymentFormula,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/Formula],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Model of the prepayments of loans in a pool of individual loans, such as a mortgage pool or loan pool."}})

(def LoanPrepaymentFormula
  "The formula which embodies the model for loan pool prepayment speed."
  {:db/ident :fibo-md-dbtx-aly/LoanPrepaymentFormula,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "loan prepayment formula"},
   :rdfs/subClassOf :fibo-fnd-utl-alx/Formula,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The formula which embodies the model for loan pool prepayment speed."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "From SMER sessions: This is a model. Includes other factors such as homogeniety. To model this more completely we need to identify the parameters that go in to this formula. Among these is the above homogeneity measure - need to know how that is measured and in what terms it is expressed, e.g. as a percentage, with reference to some mean or standard deviation and so on. Also some of the parameters used in this model would presumably make reference to standard mathematical model constructs such as normal distribution, variaous deviation measures, Chi squared and so on. These are not presently in the semantics model, but can be modeled semantically if required. This would not however be a mathematical model - we only need to identify these and show meaningful relationships (not mathematical relationships) between them."}})

(def MacCaulaysDurationAnalytic
  "MacCaulays Duration Analytic"
  {:db/ident :fibo-md-dbtx-aly/MacCaulaysDurationAnalytic,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MacCaulays Duration Analytic"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-fbc-fi-ip/InternalRateOfReturn,
                      :rdf/type           :owl/Restriction}
                     :fibo-md-dbtx-aly/DurationAnalytic]})

(def MaturityEquivalentPSA
  "Prepayment speed that results in the same average life as that computed for the Collateralized Mortgage Obligation (CMO), Asset Backed Securities (ABS) or Mortgage Backed Securities (MBS) using the Maturity Prepay Model."
  {:db/ident :fibo-md-dbtx-aly/MaturityEquivalentPSA,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "maturity equivalent p s a"},
   :rdfs/subClassOf :fibo-md-dbtx-aly/PrepaymentSpeed,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Prepayment speed that results in the same average life as that computed for the Collateralized Mortgage Obligation (CMO), Asset Backed Securities (ABS) or Mortgage Backed Securities (MBS) using the Maturity Prepay Model."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Detailed parameters to follow, but basically these three PSA terms are differentiated by the fact that they reference 3 different prepayment models, so each of these will refer to a sub-type of the term \"Loan Pool Prepayment Model\". For now the semantics are defined only in this written definition. Add model variants and terms in a future version."}})

(def ModifiedDurationAnalytic
  "The percentage price change of a security for a given change in yield. The higher the modified duration of a security, the higher its risk. Ad/ModDuration = [duration / {1 + (IRR/M)}]; where IRR is the internal rate of return and M is the number of compounding periods per year."
  {:db/ident :fibo-md-dbtx-aly/ModifiedDurationAnalytic,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The higher the MD the greater the change in price for a given change in yield."},
   :owl/disjointWith :fibo-md-dbtx-aly/MacCaulaysDurationAnalytic,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "modified duration analytic"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/MacCaulaysDurationAnalytic,
                      :rdf/type :owl/Restriction}
                     :fibo-md-dbtx-aly/DurationAnalytic],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The percentage price change of a security for a given change in yield. The higher the modified duration of a security, the higher its risk. Ad/ModDuration = [duration / {1 + (IRR/M)}]; where IRR is the internal rate of return and M is the number of compounding periods per year."}})

(def MortgageInstrumentWeightedAverageRemainingMaturity
  "The weighted average of the time until all maturities on mortgages in a mortgage-backed security (MBS). The higher the weighted average to maturity, the longer the mortgages in the security have until maturity."
  {:db/ident
   :fibo-md-dbtx-aly/MortgageInstrumentWeightedAverageRemainingMaturity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "mortgage instrument weighted average remaining maturity"},
   :rdfs/subClassOf
   :fibo-md-dbtx-aly/InstrumentWeightedAverageRemainingMaturity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The weighted average of the time until all maturities on mortgages in a mortgage-backed security (MBS). The higher the weighted average to maturity, the longer the mortgages in the security have until maturity."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Synonym (if this is the same term): Also known as \"average effective maturity\". Investopedia explains Weighted Average Maturity - WAM The measure is calculated by totaling each mortgage value represented by the MBS. The weights of each mortgage is found by dividing the value of each into the total of all. To arrive at the WAM number the weight of each security is multiplied by the time until maturity of each mortgage, and then all the values are added together. For example say an MBS has three mortgages valued at $1,000, $2,000 and $3,000 (a total of $6,000) and mature in one, two and three years respectively. The weights of these are 1/6 (1,000/6,000), 1/3 (2,000/6,000) and 1/2 (3,000/6,000). The WAM is 2 1/3 years (1/6 x 1 year + 1/3 x 2 years + 1/2 x 3 years). Analysis: this investopedia decription does not take account of there being more than one Pool behind the MBS."}})

(def NativeYield
  "The yield of the security as determined using the Yield Calculation Method that is the default for the market that the security is traded in."
  {:db/ident :fibo-md-dbtx-aly/NativeYield,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "conventional yield for that security type and geo location, ie. would be in relation too"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "native yield"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fbc-dae-dbt/isBasedOn,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/NativeYieldCalculationMethod,
                      :rdf/type :owl/Restriction}
                     :fibo-md-dbtx-aly/RelativelyDefinedDebtInstrumentYield],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The yield of the security as determined using the Yield Calculation Method that is the default for the market that the security is traded in."}})

(def NativeYieldCalculationMethod
  "The convention used in the marketplace for that security."
  {:db/ident :fibo-md-dbtx-aly/NativeYieldCalculationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "native yield calculation method"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-md-dbtx-aly/isDefaultMethodFor,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-dbti/TradableDebtInstrument,
                      :rdf/type :owl/Restriction}
                     :fibo-md-dbtx-aly/RelativeYieldCalculationMethod],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "The convention used in the marketplace for that security."}})

(def NextCall
  "The next call of the issue, as at the current time."
  {:db/ident :fibo-md-dbtx-aly/NextCall,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "next call"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-dt-fd/hasDate,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/NextCallDate,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-dbti/CallEvent],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The next call of the issue, as at the current time."}})

(def NextCallDate
  "The next date on which the issue can be called, from the present date."
  {:db/ident :fibo-md-dbtx-aly/NextCallDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "next call date"},
   :rdfs/subClassOf :fibo-fnd-dt-fd/Date,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The next date on which the issue can be called, from the present date."}})

(def NextPut
  "The next available put date for the issue, as at the current time."
  {:db/ident :fibo-md-dbtx-aly/NextPut,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "next put"},
   :rdfs/subClassOf :fibo-sec-dbt-dbti/PutEvent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The next available put date for the issue, as at the current time."}})

(def OTCBondMarketPrice
  "The price determined for the marketplace for a bond which is traded over the counter."
  {:db/ident :fibo-md-dbtx-aly/OTCBondMarketPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "o t c bond market price"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fbc-fi-ip/hasPricingSource,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/DebtSecuritiesMarketMaker,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fi-ip/SecurityPrice],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The price determined for the marketplace for a bond which is traded over the counter."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Review comment: Must include Attribution. This is in the model in the form of tha Market Maker (an actor in the activity of secondary market trading for OTC-traded debt)."}})

(def OptionAdjustedYield
  "NB specified as a spread. synonym: OAS Based on different Int Rate paths. There are different OAS models just like there are different Yield methods. Also would make reference to the Yield Curve - but these are parameters that go into that model. Limit this model at the point where it distinguishes the difference between things - we are not in a position to mathematically model the things themselves, just capture the basic facts."
  {:db/ident :fibo-md-dbtx-aly/OptionAdjustedYield,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "option adjusted yield"},
   :rdfs/subClassOf :fibo-md-dbtx-aly/DebtInstrumentYield,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "NB specified as a spread. synonym: OAS Based on different Int Rate paths. There are different OAS models just like there are different Yield methods. Also would make reference to the Yield Curve - but these are parameters that go into that model. Limit this model at the point where it distinguishes the difference between things - we are not in a position to mathematically model the things themselves, just capture the basic facts."}})

(def PartialCallsEstimationModel
  "A model of how the early partial calls are estimated."
  {:db/ident :fibo-md-dbtx-aly/PartialCallsEstimationModel,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "partial calls estimation model"},
   :rdfs/subClassOf :fibo-fnd-utl-alx/Formula,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A model of how the early partial calls are estimated."}})

(def PoolFactor
  "How much of the original pool is still outstanding. This is a number below one. Expressed as percentage."
  {:db/ident :fibo-md-dbtx-aly/PoolFactor,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Would multiply the factor by the starting value of the pool. This determines how much it is paying down. Would take the form of a 10 digit decimal factor showing how much of the pool is outstanding. You get Factor information every month or so which includes the WAM figure (and the WALA and WAC). The rate can be derived from this. that would be the rate at which the pool is paying down. These all come from the issuer."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pool factor"},
   :rdfs/subClassOf :fibo-fnd-utl-alx/Percentage,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "How much of the original pool is still outstanding. This is a number below one. Expressed as percentage."}})

(def PoolPaydownRate
  "The rate at which the pool is paying down. This is based on observed factor. CPR, SMM, etc. etc. Measured differently for different kinds of security. CBO might have a prepayment rate for example if the underlying bond is callable. with a non agency mortgge dela, defualts will effect this. so for instance there is principal is no lnger inthe pool because the mortgagee defaults. With agency these are not taken out in the case of default but for non agency these mortgages are removed from the pool if and when a mortgagee defualts."
  {:db/ident :fibo-md-dbtx-aly/PoolPaydownRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pool paydown rate"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-dae-dbt/isBasedOn,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/PoolFactor,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-utl-alx/RatioValue],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The rate at which the pool is paying down. This is based on observed factor. CPR, SMM, etc. etc. Measured differently for different kinds of security. CBO might have a prepayment rate for example if the underlying bond is callable. with a non agency mortgge dela, defualts will effect this. so for instance there is principal is no lnger inthe pool because the mortgagee defaults. With agency these are not taken out in the case of default but for non agency these mortgages are removed from the pool if and when a mortgagee defualts."}})

(def PoolWeightedAverageLoanAge
  "A dollar-weighted average measuring the age of the individual loans in a mortgage pass-through or pooled security, such as Ginnie Mae or a Freddie Mac security. The WALA is measured as the time in months since the origination of the loans, with the weighting based on each loan's size in proportion to the aggregate total of the pool."
  {:db/ident :fibo-md-dbtx-aly/PoolWeightedAverageLoanAge,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pool weighted average loan age"},
   :rdfs/subClassOf :fibo-md-dbtx-aly/DebtPoolAnalyticalParameter,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A dollar-weighted average measuring the age of the individual loans in a mortgage pass-through or pooled security, such as Ginnie Mae or a Freddie Mac security. The WALA is measured as the time in months since the origination of the loans, with the weighting based on each loan's size in proportion to the aggregate total of the pool."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Adaptation taken from the instrument level figure. This definition looks as though it may already be defined with reference to the Loan Pool. Note also that this figure is specific to Pass Through securities. These are mutually exclusive with Tranched securities (static model update to come)."}})

(def PoolWeightedAverageRemainingMaturity
  "The weighted average of the time until all maturities on loans in a pool. The higher the weighted average to maturity of the loans, the longer the loans in the pool have until maturity. REVIEW: Adapted from instrument specific definition from Investopedia. Review of 23 September identified that certain figures exist for pool and for instrument, whereas Investopedia definition was for Instrument (tranche, class etc.)."
  {:db/ident :fibo-md-dbtx-aly/PoolWeightedAverageRemainingMaturity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pool weighted average remaining maturity"},
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fbc-dae-dbt/isBasedOn,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fbc-dae-dbt/hasMaturityDate,
                          :owl/someValuesFrom :fibo-fnd-dt-fd/ExplicitDate,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-md-dbtx-aly/DebtPoolAnalyticalParameter],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The weighted average of the time until all maturities on loans in a pool. The higher the weighted average to maturity of the loans, the longer the loans in the pool have until maturity. REVIEW: Adapted from instrument specific definition from Investopedia. Review of 23 September identified that certain figures exist for pool and for instrument, whereas Investopedia definition was for Instrument (tranche, class etc.)."}})

(def PrepaymentSpeed
  "The rate at which the pool is paying down."
  {:db/ident :fibo-md-dbtx-aly/PrepaymentSpeed,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "prepayment speed"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fbc-dae-dbt/isBasedOn,
                      :owl/someValuesFrom
                      :fibo-md-dbtx-aly/LoanPoolPrepaymentModel,
                      :rdf/type :owl/Restriction}
                     :fibo-md-dbtx-aly/DebtPoolAnalyticalParameter],
   :skos/definition {:rdf/language "en",
                     :rdf/value "The rate at which the pool is paying down."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "This is a model. Includes other factors such as homogeniety. Earlier notes: Same as Payment. Curtailment. Paydown is normally scheduled payments of the mortgage. Prepayment is when someone pays off the mortgage early I may send in 1500 when my monthly amount is 1000 a month. So the 500 is a prepayment. Scheduled principal payment. More notes 25 nov: Also factor in changes to the pool constituents where this is allowed for that kind of MBS. So we make estimates of how face value will will change. face value won't change but the underlying value of the Pf changes, so eg. the current mortgage factor. Model update note June 2010: Detailed types of \"Prepayment Speed\" analytic received from thomson Reuters, now modeled as sub types of this term. So term origin is PSA by extension, since this is the common super class of 3 specific prepayment speed analytic types defined by PSA. PSA stands for Public Securities Association. Type: PSA gives this as numeric, however definitions imply percentage, so defined as dated percentage for now. Many data models use numbers which are interpreted later as percentages so this may be the case here."}})

(def PriceValueOfBasisPoint
  "Sensitivity of the price for one basis point change in yield, defined as the difference in price given 1 bp change in yield."
  {:db/ident :fibo-md-dbtx-aly/PriceValueOfBasisPoint,
   :fibo-fnd-utl-av/abbreviation {:rdf/language "en",
                                  :rdf/value    "PVBP"},
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Price value of Basis Point Definition: The difference in price given 1 bp change in yield. This is like Duration but normalized to 1 basis point. Synonym DV01"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "price value of basis point"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/DebtInstrumentYield,
                      :rdf/type           :owl/Restriction}
                     :fibo-md-dbtx-aly/DebtInstrumentAnalyticalParameter],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Sensitivity of the price for one basis point change in yield, defined as the difference in price given 1 bp change in yield."}})

(def RelativeYieldCalculationMethod
  "relative yield calculation method"
  {:db/ident :fibo-md-dbtx-aly/RelativeYieldCalculationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "relative yield calculation method"},
   :rdfs/subClassOf :fibo-md-dbtx-aly/YieldCalculationMethod})

(def RelativelyDefinedDebtInstrumentYield
  "relatively defined debt instrument yield"
  {:db/ident :fibo-md-dbtx-aly/RelativelyDefinedDebtInstrumentYield,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "relatively defined debt instrument yield"},
   :rdfs/subClassOf :fibo-md-dbtx-aly/DebtInstrumentYield})

(def RussianYieldCalculationMethod
  "The method used in determining Yield in the Russian markets. This is based on an effective yield with fundamentally different math. To give an example of the use of a different \"yield type\", we have Russia, which trades based on an effective yield. The price-yield math is fundamentally different. Notes Origin:Fidessa Uses a trade space and effective yield formula. MAy have same day types but different math."
  {:db/ident :fibo-md-dbtx-aly/RussianYieldCalculationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "russian yield calculation method"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-utl-alx/hasFormula,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/RussianYieldFormula,
                      :rdf/type           :owl/Restriction}
                     :fibo-md-dbtx-aly/YieldCalculationMethod],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The method used in determining Yield in the Russian markets. This is based on an effective yield with fundamentally different math. To give an example of the use of a different \"yield type\", we have Russia, which trades based on an effective yield. The price-yield math is fundamentally different. Notes Origin:Fidessa Uses a trade space and effective yield formula. MAy have same day types but different math."}})

(def RussianYieldFormula
  "This is based on a different Effective Yield than on another market."
  {:db/ident :fibo-md-dbtx-aly/RussianYieldFormula,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "russian yield formula"},
   :rdfs/subClassOf :fibo-md-dbtx-aly/YieldCalculationFormula,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "This is based on a different Effective Yield than on another market."}})

(def SimpleYieldCalculationMethod
  "The annual rate of return expressed as a percentage. This is the return divided by the outlay and multiplied by 100 to express the figure as a percentage."
  {:db/ident :fibo-md-dbtx-aly/SimpleYieldCalculationMethod,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This is yield in its simplest sense, expressed as a percentage of return to outlay. As such, this is the same way that yield is determined for any investments, not just financial instruments or debt investments."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "simple yield calculation method"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/DirtyPrice,
                      :rdf/type           :owl/Restriction}
                     :fibo-md-dbtx-aly/YieldCalculationMethod],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The annual rate of return expressed as a percentage. This is the return divided by the outlay and multiplied by 100 to express the figure as a percentage."}})

(def SpanishYieldCalculationMethod
  "The method used in determining annual yield in Spanish corporate bonds."
  {:db/ident :fibo-md-dbtx-aly/SpanishYieldCalculationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "spanish yield calculation method"},
   :rdfs/subClassOf :fibo-md-dbtx-aly/YieldCalculationMethod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The method used in determining annual yield in Spanish corporate bonds."}})

(def USCorporateBondYieldCalculationMethod
  "This has 30/360 and semi-annual compounding."
  {:db/ident :fibo-md-dbtx-aly/USCorporateBondYieldCalculationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "u s corporate bond yield calculation method"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-utl-alx/hasFormula,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/ICMAYieldFormula,
                      :rdf/type           :owl/Restriction}
                     :fibo-md-dbtx-aly/YieldCalculationMethod],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "This has 30/360 and semi-annual compounding."}})

(def USTreasuryYieldCalculationMethod
  "u s treasury yield calculation method"
  {:db/ident :fibo-md-dbtx-aly/USTreasuryYieldCalculationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "u s treasury yield calculation method"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-utl-alx/hasFormula,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/ICMAYieldFormula,
                      :rdf/type           :owl/Restriction}
                     :fibo-md-dbtx-aly/YieldCalculationMethod]})

(def WallStreetYieldCalculationMethod
  "No definition.Term put here from memory."
  {:db/ident :fibo-md-dbtx-aly/WallStreetYieldCalculationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "wall street yield calculation method"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-utl-alx/hasFormula,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/ICMAYieldFormula,
                      :rdf/type           :owl/Restriction}
                     :fibo-md-dbtx-aly/YieldCalculationMethod],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "No definition.Term put here from memory."}})

(def WeightedAverageCoupon
  "The weighted-average gross interest rates of the pool of mortgages that underlie a mortgage-backed security (MBS) at the time the securities were issued. A mortgage-backed security's current WAC can differ from its original WAC as the underlying mortgages pay down at different speeds. In the weighted-average calculation, the principal balance of each underlying mortgage is used as the weighting factor"
  {:db/ident :fibo-md-dbtx-aly/WeightedAverageCoupon,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "weighted average coupon"},
   :rdfs/subClassOf :fibo-md-dbtx-aly/DebtPoolAnalyticalParameter,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The weighted-average gross interest rates of the pool of mortgages that underlie a mortgage-backed security (MBS) at the time the securities were issued. A mortgage-backed security's current WAC can differ from its original WAC as the underlying mortgages pay down at different speeds. In the weighted-average calculation, the principal balance of each underlying mortgage is used as the weighting factor"},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Provided by the Issuer (loan servicer?) along with the WALA etc. If you know the underlying loans you can calculate this yourself. For ABS you don't know this so you have to get this information from the loan servicer. Investopedia explains Weighted Average Coupon - WAC For example, suppose a MBS is composed of two different pools of mortgages: $6 million worth of mortgages that yield 7.5% and a pool of $4 million mortgages that yield 5%. The WAC would be 6.5%. The WAC on a mortgage-backed security is an important piece of information used by analysts to estimate the pre-pay characteristics of that security. It is an important relative value tool in MBS portfolio management and analysis."}})

(def WeightedAverageTimeToReceiptOfCashflows
  "The weighted average time to the receipt of cashflows for an instrument."
  {:db/ident :fibo-md-dbtx-aly/WeightedAverageTimeToReceiptOfCashflows,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "weighted average time to receipt of cashflows"},
   :rdfs/subClassOf :fibo-fnd-utl-alx/Formula,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The weighted average time to the receipt of cashflows for an instrument."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "A formal definition is needed for this. The name is almost self defining, but only to those who already know what this means. In particular we should define how the weighted average is weighted, and what this means, along with a formula for calculating this at the most generic level (cashflow, time, without assumptions about particular types of instrument)."}})

(def WorstCall
  "call event representing the worst case with respect to when the instrument might be called"
  {:db/ident :fibo-md-dbtx-aly/WorstCall,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "worst call"},
   :rdfs/subClassOf :fibo-sec-dbt-dbti/CallEvent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "call event representing the worst case with respect to when the instrument might be called"},
   :skos/editorialNote
   [{:rdf/language "en",
     :rdf/value
     "We should refine what we mean by worst here - soonest, or most distant?"}
    {:rdf/language "en",
     :rdf/value
     "Note that the actual date associated with an occurrence of a worst call event might be calculated or explicit."}]})

(def YieldCalculationFormula
  "The formula used in determining the Yield."
  {:db/ident :fibo-md-dbtx-aly/YieldCalculationFormula,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The subject of this Formula is the Yield. The formula has an expression which can be defined either in tectual terms or by further local extension of the term \"Formula Expression\" to define the parameters used."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "yield calculation formula"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/appliesTo,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/DebtInstrumentYield,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-utl-alx/Formula],
   :skos/definition {:rdf/language "en",
                     :rdf/value "The formula used in determining the Yield."}})

(def YieldCalculationMethod
  "The method by which the yield is calculated. This includes a formula for calculation and a specific day count convention and compounding. You would apply this calculation method on top of the underlying terms and conditions, do for example the holiday calenders and so on, are used in these formulae. For final cash flow: Japanese yield will round down accrued interest. Add: The actual underlying math. Wall Street uses the same ICMA formula."
  {:db/ident :fibo-md-dbtx-aly/YieldCalculationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "yield calculation method"},
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
                     :fibo-fnd-utl-alx/Formula],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The method by which the yield is calculated. This includes a formula for calculation and a specific day count convention and compounding. You would apply this calculation method on top of the underlying terms and conditions, do for example the holiday calenders and so on, are used in these formulae. For final cash flow: Japanese yield will round down accrued interest. Add: The actual underlying math. Wall Street uses the same ICMA formula."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Initial reviewer notes 18 Nov: this uses the combination of the day count and the compounding gives you the name of the yield calculation method. Names are associated with algorithms. What yield you use to determining the present value. These are typically defined in a prospectus (for exchange traded) or Info Memorandum if it's traded in an OTC market. where it also defines the method itself. Action: look at some prospecti or get this from a vendor. Additional features 25 nov: Question - maybe Holiday calendar? Also date roll rules and roll back rules. These all apply. YC feeds in to Yield itself."}})

(def YieldToNextPut
  "yield to next put"
  {:db/ident :fibo-md-dbtx-aly/YieldToNextPut,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "yield to next put"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-md-dbtx-aly/hasOutlookPeriod,
                      :owl/someValuesFrom :fibo-md-dbtx-aly/NextPut,
                      :rdf/type           :owl/Restriction}
                     :fibo-md-dbtx-aly/DebtInstrumentYield]})

(def aggregateOf
  "aggregate of"
  {:db/ident :fibo-md-dbtx-aly/aggregateOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-dbtx-aly/InstrumentWeightedAverageLoanAge,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "aggregate of"},
   :rdfs/range :fibo-md-dbtx-aly/PoolWeightedAverageLoanAge,
   :rdfs/subPropertyOf :fibo-md-dbtx-aly/isAggregateOf})

(def aggregateOf.1
  "aggregate of"
  {:db/ident :fibo-md-dbtx-aly/aggregateOf.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-dbtx-aly/InstrumentWeightedAverageRemainingMaturity,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "aggregate of"},
   :rdfs/range :fibo-md-dbtx-aly/PoolWeightedAverageRemainingMaturity,
   :rdfs/subPropertyOf :fibo-md-dbtx-aly/isAggregateOf})

(def calculationFollowing
  "calculation following"
  {:db/ident :fibo-md-dbtx-aly/calculationFollowing,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-dbtx-aly/DebtInstrumentYield,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "calculation following"},
   :rdfs/range :fibo-md-dbtx-aly/YieldCalculationMethod})

(def daysAccrued
  "The number of days that interest has accrued, as reflected in the price."
  {:db/ident :fibo-md-dbtx-aly/daysAccrued,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-md-dbtx-aly/DirtyPrice,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "days accrued"},
   :rdfs/range :xsd/integer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The number of days that interest has accrued, as reflected in the price."}})

(def decimalPlaces
  "The number of decimal places used in the publication of the factor value."
  {:db/ident :fibo-md-dbtx-aly/decimalPlaces,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-md-dbtx-aly/PoolFactor,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "decimal places"},
   :rdfs/range :xsd/integer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The number of decimal places used in the publication of the factor value."}})

(def defaultRateValue
  "default rate value"
  {:db/ident :fibo-md-dbtx-aly/defaultRateValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-dbtx-aly/DefaultRate,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "default rate value"},
   :rdfs/range :fibo-fnd-utl-alx/Percentage})

(def determinesMarketPriceForDebt
  "determines market price for debt"
  {:db/ident :fibo-md-dbtx-aly/determinesMarketPriceForDebt,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-dbtx-aly/DebtSecuritiesMarketMaker,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "determines market price for debt"},
   :rdfs/range :fibo-md-dbtx-aly/OTCBondMarketPrice})

(def equivalentLifeValue
  "The Equivalent Life in years at the stated date."
  {:db/ident :fibo-md-dbtx-aly/equivalentLifeValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-dbtx-aly/EquivalentLifeAnalytic,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equivalent life value"},
   :rdfs/range :fibo-fnd-dt-fd/Duration,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The Equivalent Life in years at the stated date."}})

(def expressedAs
  "ABS = (100 * SMM)/100 + (SMM X (Age- 1)"
  {:db/ident :fibo-md-dbtx-aly/expressedAs,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-md-dbtx-aly/AbsolutePrepaymentRateFormula,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "expressed as"},
   :rdfs/range :xsd/string,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "ABS = (100 * SMM)/100 + (SMM X (Age- 1)"}})

(def hasAnalytic
  "has analytic"
  {:db/ident :fibo-md-dbtx-aly/hasAnalytic,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-sec-pls/DebtPool,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has analytic"},
   :rdfs/range :fibo-md-dbtx-aly/DebtPoolAnalyticalParameter})

(def hasDefaultRate
  "has default rate"
  {:db/ident :fibo-md-dbtx-aly/hasDefaultRate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-sec-pls/DebtPool,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has default rate"},
   :rdfs/range :fibo-md-dbtx-aly/DefaultRate})

(def hasFactor
  "has factor"
  {:db/ident :fibo-md-dbtx-aly/hasFactor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-sec-pls/DebtPool,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has factor"},
   :rdfs/range :fibo-md-dbtx-aly/PoolFactor})

(def hasMeasure
  "has measure"
  {:db/ident :fibo-md-dbtx-aly/hasMeasure,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-sec-pls/DebtPool,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has measure"},
   :rdfs/range :fibo-md-dbtx-aly/PrepaymentSpeed})

(def hasOutlookPeriod
  "has outlook period"
  {:db/ident :fibo-md-dbtx-aly/hasOutlookPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-dbtx-aly/DebtInstrumentYield,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has outlook period"},
   :rdfs/range
   {:owl/unionOf [:fibo-md-dbtx-aly/LifeAnalytic
                  {:owl/onProperty :fibo-fbc-dae-dbt/hasOriginalTimeToMaturity,
                   :owl/someValuesFrom :fibo-fnd-dt-fd/ExplicitDuration,
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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has wac"},
   :rdfs/range :fibo-md-dbtx-aly/WeightedAverageCoupon})

(def hasYield
  "has yield"
  {:db/ident :fibo-md-dbtx-aly/hasYield,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-dbti/TradableDebtInstrument,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has yield"},
   :rdfs/range :fibo-md-dbtx-aly/DebtInstrumentYield})

(def isAggregateOf
  "is aggregate of"
  {:db/ident :fibo-md-dbtx-aly/isAggregateOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-dbtx-aly/DebtPoolAnalyticalParameter,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is aggregate of"},
   :rdfs/range :fibo-md-dbtx-aly/DebtPoolAnalyticalParameter})

(def isCompounded
  "Definition needed Moved from Yield - assume this can only be about debt instrument or loan / debt yields i..e where the income relates to interest payments. ."
  {:db/ident :fibo-md-dbtx-aly/isCompounded,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-md-dbtx-aly/DebtInstrumentYield,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is compounded"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Definition needed Moved from Yield - assume this can only be about debt instrument or loan / debt yields i..e where the income relates to interest payments. ."}})

(def isDefaultMethodFor
  "is default method for"
  {:db/ident :fibo-md-dbtx-aly/isDefaultMethodFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-dbtx-aly/NativeYieldCalculationMethod,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is default method for"},
   :rdfs/range :fibo-sec-dbt-dbti/TradableDebtInstrument})

(def isRateOfChangeOf
  "is rate of change of"
  {:db/ident :fibo-md-dbtx-aly/isRateOfChangeOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-dbtx-aly/DebtConvexityAnalytic,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is rate of change of"},
   :rdfs/range :fibo-md-dbtx-aly/DurationAnalytic})

(def modifiedDurationValue
  "The Modified Duration in Years."
  {:db/ident :fibo-md-dbtx-aly/modifiedDurationValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-dbtx-aly/ModifiedDurationAnalytic,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "modified duration value"},
   :rdfs/range :fibo-fnd-dt-fd/Duration,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The Modified Duration in Years."}})

(def priceIsTraded
  "The highest valuation over the period specified. Notes from Equity review, may apply to Debt also: this can be regarded as a derived price. See also note in LowPrice Difference: different rules used. May be based on trade OR quote price Analytic or Price?? this is a derived type but with a much simpler rule."
  {:db/ident :fibo-md-dbtx-aly/priceIsTraded,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-md-dbtx-aly/ExchangeTradedBondPrice,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "price is traded"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The highest valuation over the period specified. Notes from Equity review, may apply to Debt also: this can be regarded as a derived price. See also note in LowPrice Difference: different rules used. May be based on trade OR quote price Analytic or Price?? this is a derived type but with a much simpler rule."}})

(def priceQuotedExDividend
  "Whether or not the yield is based on a price which is quoted ex-dividend. When a bond is said to trade ex-dividend it means that there is a period of time prior to each coupon payment during which a bond purchaser does not receive custody of the next coupon. That payment is made to the previous bond holder and accrued interest is therefore negative during the ex-dividend period."
  {:db/ident :fibo-md-dbtx-aly/priceQuotedExDividend,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-md-dbtx-aly/DebtInstrumentYield,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "price quoted ex dividend"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether or not the yield is based on a price which is quoted ex-dividend. When a bond is said to trade ex-dividend it means that there is a period of time prior to each coupon payment during which a bond purchaser does not receive custody of the next coupon. That payment is made to the previous bond holder and accrued interest is therefore negative during the ex-dividend period."}})

(def quotedExDividend
  "Whether or not the price is quoted ex-dividend. When a bond is said to trade ex-dividend it means that there is a period of time prior to each coupon payment during which a bond purchaser does not receive custody of the next coupon. That payment is made to the previous bond holder and accrued interest is therefore negative during the ex-dividend period."
  {:db/ident :fibo-md-dbtx-aly/quotedExDividend,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-fi-ip/SecurityPrice,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "quoted ex dividend"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether or not the price is quoted ex-dividend. When a bond is said to trade ex-dividend it means that there is a period of time prior to each coupon payment during which a bond purchaser does not receive custody of the next coupon. That payment is made to the previous bond holder and accrued interest is therefore negative during the ex-dividend period."}})

(def roundingConvention
  "The rounding convention used in the calculation method."
  {:db/ident :fibo-md-dbtx-aly/roundingConvention,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-md-dbtx-aly/YieldCalculationMethod,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "rounding convention"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "The rounding convention used in the calculation method."}})