(ns net.wikipunk.rdf.fibo-sec-dbt-pbs
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
     "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
     "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
     "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-be-le-lp"
     "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
     "fibo-fbc-dae-dbt"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
     "fibo-fnd-pty-rl"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
     "fibo-fnd-rel-rel"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
     "fibo-fnd-utl-alx"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "fibo-sec-dbt-dbti"
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/",
     "fibo-sec-dbt-pbs"
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/",
     "fibo-sec-sec-pls"
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "skos" "http://www.w3.org/2004/02/skos/core#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-sec-dbt-pbs",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Debt/PoolBackedSecurities/"}
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines concepts that are common to asset-backed and mortgage-backed securities, including pools, as well as structured finance instruments.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Debt/DebtInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/Pools/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Debt/PoolBackedSecurities/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Pool-backed Securities Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate, and added an explanatory note to ABS."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities.rdf version of this ontology was modified add a number of commonly used pool-backed security related statistical measures."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/"})

(def AbsolutePrepaymentRate
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "ABS"},
   :cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "The ABS measurement differs from conditional prepayment rate (CPR) used in the mortgage industry, which measures prepayment as an annualized percentage of the current pool balance."}
     {:rdf/language "en",
      :rdf/value
      "ABS is defined by the following formula where SMM refers to Single Monthly Mortality, which measures the percentage of dollars prepaid in a given month expressed as a percentage of the scheduled loan balance. ABS = (100 * SMM)/100 + (SMM X (Age - 1)."}},
   :db/ident :fibo-sec-dbt-pbs/AbsolutePrepaymentRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "absolute prepayment rate"},
   :rdfs/subClassOf :fibo-sec-dbt-pbs/DebtPoolStatisticalMeasure,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "measure of the monthly rate of loan prepayments as a percentage of the original pool balance"}})

(def AssetBackedSecurity
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "ABS"},
   :cmns-av/adaptedFrom
   {:rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of Financial Instruments (CFI code), Fourth edition, 2019-10-01"},
   :cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "An asset-backed security (ABS) is a type of financial investment that is collateralized by an underlying pool of assets—usually ones that generate a cash flow from debt, such as loans, leases, credit card balances, or receivables. It takes the form of a bond or note, paying income at a fixed rate for a set amount of time, until maturity. ABS are financial securities backed by income-generating assets such as credit card receivables, home equity loans, student loans, and auto loans. Pooling assets into an ABS is a process called securitization. One difference between an ABS and a collateralized debt obligation (CDO) is that the CDO issuer is generally a special purpose vehicle (SPV) or trust."}
     {:rdf/language "en",
      :rdf/value
      "Asset-backed securities, for example home equity loans (HEL), credit cards, and so forth are backed by receivables [payments] that are either secured (such as HEL) or unsecured (for example, credit cards). They are typically tranched based on default risk."}},
   :db/ident :fibo-sec-dbt-pbs/AssetBackedSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "asset-backed security"},
   :rdfs/subClassOf :fibo-sec-dbt-pbs/PoolBackedSecurity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "debt instrument backed by receivables other than those arising out of real estate loans or mortgages"}})

(def DebtPoolStatisticalMeasure
  {:db/ident :fibo-sec-dbt-pbs/DebtPoolStatisticalMeasure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt pool statistical measure"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-cxtdsg/appliesTo,
      :owl/someValuesFrom :fibo-sec-sec-pls/DebtPool,
      :rdf/type           :owl/Restriction} :fibo-fnd-utl-alx/QualifiedMeasure
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :cmns-dt/DatePeriod,
      :owl/onProperty :fibo-fnd-utl-alx/hasApplicableDatePeriod,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "qualified measure of some aspect of the behavior of one or more debt instrument(s) that may vary over time"}})

(def DefaultRate
  {:db/ident :fibo-sec-dbt-pbs/DefaultRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "default rate"},
   :rdfs/subClassOf #{:fibo-fnd-utl-alx/Ratio
                      :fibo-sec-dbt-pbs/DebtPoolStatisticalMeasure},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "qualified measure of the rate at which holders of the debt instruments in the pool default on those instruments"}})

(def PoolBackedSecurity
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "If the security is a component of a collateralized debt obligation, then the underlying pool is typically segmented into various tranches, each of which provides cash flows to hedge particular risks, or that offset other gains by time to maturity or other factors."},
   :db/ident :fibo-sec-dbt-pbs/PoolBackedSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pool-backed security"},
   :rdfs/subClassOf #{:fibo-sec-dbt-dbti/TradableDebtInstrument
                      {:owl/onProperty     :fibo-fbc-dae-dbt/isBasedOn,
                       :owl/someValuesFrom :fibo-sec-sec-pls/InstrumentPool,
                       :rdf/type           :owl/Restriction}
                      {:owl/onDataRange :xsd/boolean,
                       :owl/onProperty  :fibo-sec-dbt-pbs/isPassThrough,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass
                       :fibo-sec-dbt-pbs/DebtPoolStatisticalMeasure,
                       :owl/onProperty :cmns-cls/isCharacterizedBy,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "debt instrument that derives its cashflow from an underlying pool of mortgage loans or other receivables"}})

(def PrepaymentSpeed
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A prepayment model is used to estimate the level of prepayments (speed) on a loan portfolio that will occur in a set period of time, given possible changes in interest rates. Understanding prepayment speed is critical in assessing the value of mortgage pass-through securities. Prepayment models are based on mathematical equations and usually involve the analysis of historical prepayment trends to predict what will happen in the future. Prepayment models are often used to value mortgage pools such as GNMA securities or other securitized debt products, including mortgage-backed securities (MBS)."},
   :db/ident :fibo-sec-dbt-pbs/PrepaymentSpeed,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "prepayment speed"},
   :rdfs/subClassOf :fibo-sec-dbt-pbs/DebtPoolStatisticalMeasure,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "estimated rate at which a debt or part of a debt is paid off ahead of schedule"}})

(def PrincipalProtectedNote
  {:cmns-av/adaptedFrom
   {:rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of Financial Instruments (CFI code), Fourth edition, 2019-10-01."},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "There are one or more reference entities underlying the product. Redemption is made at least in the amount of the conditional capital protection at maturity, provided that no credit event by the reference entity has occurred. Conditional capital protection only applies to the nominal amount and not to the purchase price. The general functioning of a capital guaranteed structured instrument is as follows: the notional amount is split into a zero bond, that will deliver the capital guarantee at maturity, and the difference between the zero bond's value (= present value of the guarantee level at maturity) and the notional amount is used for structuring the performance component with options which deliver the agreed pay-off profile of the structured instrument."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "capital protected note"},
   :db/ident :fibo-sec-dbt-pbs/PrincipalProtectedNote,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "principal protected note"},
   :rdfs/subClassOf :fibo-sec-dbt-pbs/StructuredFinanceInstrument,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "structured finance that offers investors exposure to chosen underlying assets using various approaches and asymmetric pay-off profiles"}})

(def SingleMonthlyMortality
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "SMM"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Single monthly mortality (SMM) is a way to gauge the prepayment risk of a mortgage-backed security."},
   :db/ident :fibo-sec-dbt-pbs/SingleMonthlyMortality,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "single monthly mortality"},
   :rdfs/subClassOf #{:fibo-fnd-utl-alx/Percentage
                      :fibo-sec-dbt-pbs/DebtPoolStatisticalMeasure},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "estimated per-month percentage of mortgages in an MBS pool that will be paid off early"}})

(def StructuredFinanceInstrument
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Structured finance instruments represent a form of securitization technology which can be defined by three key characteristics: (1) pooling of financial assets, such as loans, bonds, or credit-default swaps; (2) de-linking of the credit risk of the asset pool from the credit risk of the originating firm, usually through use of a finite-lived, stand-alone special purpose vehicle (SPV); and (3) issuance by the SPV of \"tranched\" liabilities backed by the asset pool. Structured finance instruments are typically presented to large financial institutions or companies with complicated financing needs that are unsatisfied with conventional financial products."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "structured finance"},
   :db/ident :fibo-sec-dbt-pbs/StructuredFinanceInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "structured finance instrument"},
   :rdfs/seeAlso {:xsd/anyURI "https://www.bis.org/publ/cgfs23mitchell.pdf"},
   :rdfs/subClassOf #{:fibo-sec-dbt-pbs/PoolBackedSecurity
                      {:owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
                       :owl/someValuesFrom
                       {:owl/onProperty :fibo-fnd-pty-rl/isPlayedBy,
                        :owl/someValuesFrom
                        :fibo-be-le-lp/SpecialPurposeVehicle,
                        :rdf/type :owl/Restriction},
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "pool-backed security wherein the risk associated with the pool has been uncoupled from the risk associated with the originating institution through a special purpose vehicle"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Collateralized debt obligations (CDOs), synthetic financial instruments, collateralized bond obligations (CBOs), and syndicated loans are examples of structured finance instruments."}})

(def StructuredFinanceWithoutPrincipalProtection
  {:cmns-av/adaptedFrom
   {:rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of Financial Instruments (CFI code), Fourth edition, 2019-10-01."},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The redemption at the end of the term is determined on the basis of the performance and final fixing of the underlying asset: a redemption at the nominal value is guaranteed as long as the underlying asset has not touched its barrier during relevant barrier monitoring. If the underlying asset has touched its barrier but is again above the strike price at final fixing, the nominal price is also repaid. Nevertheless, if the underlying asset has touched its barrier during barrier monitoring and closes below the strike price at final fixing, the underlying asset is delivered or cash compensation paid, provided that no credit event by the reference entity has occurred. Depending on the characteristics of the product, either a coupon or a discount to the underlying asset can apply. A coupon is paid out regardless of the performance of the underlying asset, provided that no credit event by the reference entity has occurred."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value
                     "structured finance without capital protection"},
   :db/ident :fibo-sec-dbt-pbs/StructuredFinanceWithoutPrincipalProtection,
   :owl/disjointWith :fibo-sec-dbt-pbs/PrincipalProtectedNote,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value "structured finance without principal protection"},
   :rdfs/subClassOf :fibo-sec-dbt-pbs/StructuredFinanceInstrument,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "structured finance that is a short-term note linked to an underlying asset that offers a steady stream of income"}})

(def Tranche
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A tranche is one of a number of related securities in the same offering that represents a partition of a debt pool whose cash flow is derived from the combined cash flows of the instruments in that partition."},
   :db/ident :fibo-sec-dbt-pbs/Tranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tranche"},
   :rdfs/subClassOf
   #{:fibo-sec-dbt-pbs/StructuredFinanceInstrument
     {:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom {:owl/onClass    :fibo-sec-sec-pls/InstrumentPool,
                           :owl/onProperty :cmns-col/isConstituentOf,
                           :owl/qualifiedCardinality 1,
                           :rdf/type       :owl/Restriction},
      :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "segment of a pool of securities, typically debt instruments"}})

(def WeightedAverageCoupon
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "WAC"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The weighted average coupon (WAC) is calculated by taking the gross of the interest rates owed on the underlying mortgages of the MBS and weighting them according to the percentage of the security that each mortgage represents. The WAC represents the average interest rate of different pools of mortgages with varying interest rates. In the weighted average calculation, the principal balance of each underlying mortgage is used as the weighting factor. To calculate the WAC, the coupon rate of each mortgage or MBS is multiplied by its remaining principal balance. The results are added together, and the sum total is divided by the remaining balance. A mortgage-backed security's current WAC can differ from its original WAC as the underlying mortgages pay down at different speeds. In the weighted-average calculation, the principal balance of each underlying mortgage is used as the weighting factor."},
   :db/ident :fibo-sec-dbt-pbs/WeightedAverageCoupon,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "weighted average coupon"},
   :rdfs/subClassOf #{:fibo-fnd-utl-alx/ArithmeticMean
                      :fibo-sec-dbt-pbs/DebtPoolStatisticalMeasure},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "weighted-average gross interest rates of the pool of mortgages that underlie a mortgage-backed security (MBS) weighed by their balances at the time the securities were issued"},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Provided by the Issuer (loan servicer?) along with the WALA etc. If you know the underlying loans you can calculate this yourself. For ABS you don't know this so you have to get this information from the loan servicer. Investopedia explains Weighted Average Coupon - WAC For example, suppose a MBS is composed of two different pools of mortgages: $6 million worth of mortgages that yield 7.5% and a pool of $4 million mortgages that yield 5%. The WAC would be 6.5%. The WAC on a mortgage-backed security is an important piece of information used by analysts to estimate the pre-pay characteristics of that security. It is an important relative value tool in MBS portfolio management and analysis."}})

(def WeightedAverageLife
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "WAL"},
   :cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "Average life is calculated using the weighted average time to the receipt of all future cash flows of an amortizing loan or amortizing bond. it's the average time until a dollar of principal is repaid."}
     {:rdf/language "en",
      :rdf/value
      "The time weightings used in weighted average life calculations are based on payments to the principal. In many loans, such as mortgages, each payment consists of payments to principal and payments to interest. In WAL, only the principal payments are considered and these payments tend to get larger over time, with early payments of a mortgage going mostly to interest, while payments made towards the end of the loan are applied mostly to the principal balance of the loan."}
     {:rdf/language "en",
      :rdf/value
      "Where it refers to pre-payment above, if the bond does not include prepayment then this is not included. However, analytics that refer to this e.g. Yield to Average Life, then this figure is relevant. It is not relevant for other types of bond where e.g. you would use yield to next call, yield to worst etc. Average Life used in place of Maturity for Yield Calculation. This is not only used for Yield calculations though. It is referred to as an analytic figure in its own right. Average Life uses one of a number of standard pre-payment models (for structured finance at least). For MBS, the average life includes some calculations to take account of pre-payments on the underlying mortgages. This takes account of the possibillity of borrowers paying early. This has to be modeled or forecast (not given) as it's a function of market conditions and interest rate. You would not see this in a market data feed. When you model MBS you calculate Average Life as part of the model i.e. you estimate the percentage of prepayment in the next x length of time and factor this into the Average Life. Refers to Weighted Average Time to receipt of future cash flows. For MBS, early payments will shorten the Average Life. For Student Loans, Credit Card, Loan etc, i.e. all Pool Backed (any bond that has securitized debt). Other bonds: Sinking Funds etc., also Early Payment - partial Call for a corporate / regular bond. Early Payment for pass through has the same effect. Sinking Fund: Each payment is part principal and part interest, this is implicit in the overall definition of \"Early payment\"."}},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "average life"},
   :db/ident :fibo-sec-dbt-pbs/WeightedAverageLife,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "weighted average life"},
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-sec-dbt-pbs/PrepaymentSpeed,
                       :owl/onProperty :fibo-fnd-rel-rel/refersTo,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-utl-alx/ArithmeticMean
                      :fibo-sec-dbt-pbs/DebtPoolStatisticalMeasure},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "weighted average of the times of the principal repayments Average life is calculated using the weighted average time to the receipt of all future cash flows."}})

(def WeightedAverageLoanAge
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "WALA"},
   :cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "A weighted average loan age (WALA) may apply to pool-backed securities such as Ginnie Mae or Freddie Mac securities. The WALA is measured as the time in months since the origination of the loans, with the weighting based on each loan's size in proportion to the aggregate total of the pool."}
     {:rdf/language "en",
      :rdf/value
      "This is defined by the issuer. WALA is more official, not an analysis from a vendor. This changes but the values are relayed by the issuer on an ongoing basis. Investopedia explains Weighted Average Loan Age - WALA The weighted average age will change over time as some mortgages get paid off faster than others. Based on the issuer of the mortgage-backed securities (MBS), the WALA may be weighted on the remaining principal balance dollar figure, or the beginning notional value of the loan. The flip side of the WALA is the weighted average maturity (WAM), which is a dollar-weighted measure of the months remaining until the principal amounts are completely repaid on each loan in the pool."}},
   :db/ident :fibo-sec-dbt-pbs/WeightedAverageLoanAge,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "weighted average loan age"},
   :rdfs/subClassOf #{:fibo-fnd-utl-alx/ArithmeticMean
                      :fibo-sec-dbt-pbs/DebtPoolStatisticalMeasure},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "dollar-weighted average measuring the age of the individual loans in a mortgage pass-through or pooled security"}})

(def WeightedAverageMaturity
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "WAM"},
   :cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "The measure is calculated by totaling each mortgage value represented by the MBS. The weights of each mortgage is found by dividing the value of each into the total of all. To arrive at the WAM number the weight of each security is multiplied by the time until maturity of each mortgage, and then all the values are added together. For example say an MBS has three mortgages valued at $1,000, $2,000 and $3,000 (a total of $6,000) and mature in one, two and three years respectively. The weights of these are 1/6 (1,000/6,000), 1/3 (2,000/6,000) and 1/2 (3,000/6,000). The WAM is 2 1/3 years (1/6 x 1 year + 1/3 x 2 years + 1/2 x 3 years). Note that this calculation would need to be adjusted if there are multiple pools behind the MBS."}
     {:rdf/language "en",
      :rdf/value
      "This term is used more broadly to describe maturities in a portfolio of debt securities, including corporate debt and municipal bonds. The higher the WAM, the longer it takes for all of the mortgages or bonds in the portfolio to mature. WAM is used to manage debt portfolios and to assess the performance of debt portfolio managers."}},
   :db/ident :fibo-sec-dbt-pbs/WeightedAverageMaturity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "weighted average maturity"},
   :rdfs/subClassOf #{:fibo-fnd-utl-alx/ArithmeticMean
                      :fibo-sec-dbt-pbs/DebtPoolStatisticalMeasure},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "weighted average amount of time until the maturities on mortgages in a mortgage-backed security (MBS)"}})

(def WeightedAverageRemainingTerm
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "WART"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The longer the WART, the longer the portfolio's assets will take to mature, on average. WART is often used in relation to mortgage-backed securities (MBS) but can also be applied to any portfolio of fixed-income securities. WART is closely related to weighted average loan age (WALA), which is its inverse."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "weighted average remaining maturity"},
   :db/ident :fibo-sec-dbt-pbs/WeightedAverageRemainingTerm,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "weighted average remaining term"},
   :rdfs/subClassOf #{:fibo-fnd-utl-alx/ArithmeticMean
                      :fibo-sec-dbt-pbs/DebtPoolStatisticalMeasure},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "weighted average time to maturity of a portfolio of asset-backed securities (ABS) or mortgage-backed (MBS) securities"}})

(def isPassThrough
  {:db/ident :fibo-sec-dbt-pbs/isPassThrough,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-dbt-pbs/PoolBackedSecurity,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is pass through"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates whether the cash flows from the underlying asset pool are passed through to the investor by way of redemption payments"}})

(def urn:uuid:1eac53e9-7ce0-53ed-9b2c-55e8593fcbbc
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines concepts that are common to asset-backed and mortgage-backed securities, including pools, as well as structured finance instruments.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Debt/DebtInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/Pools/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Debt/PoolBackedSecurities/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Pool-backed Securities Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate, and added an explanatory note to ABS."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities.rdf version of this ontology was modified add a number of commonly used pool-backed security related statistical measures."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/"})