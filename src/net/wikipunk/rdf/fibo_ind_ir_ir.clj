(ns net.wikipunk.rdf.fibo-ind-ir-ir
  "This ontology provides the basic types of interest rate which are recognized in the financial markets, and the relationships between these where applicable. These include bank base rates, inter-bank offer rates, overnight rates of interest and the US Federal Funds rate which is widely used as a rate of reference. It also includes the concept of a market rate spread between two interest rates."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :dcterms/abstract
   "This ontology provides the basic types of interest rate which are recognized in the financial markets, and the relationships between these where applicable. These include bank base rates, inter-bank offer rates, overnight rates of interest and the US Federal Funds rate which is widely used as a rate of reference. It also includes the concept of a market rate spread between two interest rates.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/FinancialServicesEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Quantities/QuantitiesAndUnits/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/Indicators/Indicators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/Publishers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/ClassificationSchemes/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/InterestRates/InterestRates/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-be-fct-pub"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-arr-cls"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-qt-qtu"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-ind-ind"
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/",
    "fibo-ind-ir-ir"
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfa/prefix "fibo-ind-ir-ir",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "Interest Rates Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was modified per the issue resolutions identified in the FIBO IND 1.0 FTF 2 report."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was modified to add the notion of a classifier for reference rates, so that we can differentiate between kinds of rates and the rates themselves, clean up definitions to conform with ISO 704, merge classes referenced in interest rate publishers to eliminate potential circular references, and eliminate duplication of concepts in LCC."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was modified to replace 'financial information publisher' with publisher for simplification purposes."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was modified to eliminate deprecated elements."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was modified per the issue resolutions identified in the FIBO IND 1.0 FTF 1 report."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was modified per the FIBO 2.0 RFC, including adding support for reference rates from FpML."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2014-2022 Object Management Group, Inc."
                  "Copyright (c) 2014-2022 EDM Council, Inc."],
   :sm/dependsOn
   ["https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/"
    "https://www.omg.org/spec/LCC/"
    "https://spec.edmcouncil.org/fibo/ontology/BE/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/"],
   :sm/fileAbbreviation "fibo-ind-ir-ir",
   :sm/filename "InterestRates.rdf"})

(def BaseRate
  "basic rate of interest on which the actual rate a bank charges on loans to its customers is calculated"
  {:db/ident :fibo-ind-ir-ir/BaseRate,
   :fibo-fnd-utl-av/abbreviation "BBR",
   :fibo-fnd-utl-av/explanatoryNote
   "Typically, the bank base rate is a reference rate set by a central bank. Banks that are regulated by a given central bank cannot lend below the base rate to their customers. The bank base rate is determined on an ongoing basis and represents the central bank's judgement of the price of short-term funds on their interbank market.",
   :fibo-fnd-utl-av/synonym "bank base rate",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "base rate",
   :rdfs/subClassOf :fibo-ind-ir-ir/ReferenceInterestRate,
   :skos/definition
   "basic rate of interest on which the actual rate a bank charges on loans to its customers is calculated"})

(def EighteenMonths
  "duration of exactly eighteen months, regardless of the length in days of a given calendar month, but typically 30 days"
  {:db/ident :fibo-ind-ir-ir/EighteenMonths,
   :fibo-fnd-dt-fd/hasDurationValue "P18M",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDuration :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "eighteen months",
   :skos/definition
   "duration of exactly eighteen months, regardless of the length in days of a given calendar month, but typically 30 days"})

(def FifteenYears
  "duration of exactly fifteen years"
  {:db/ident :fibo-ind-ir-ir/FifteenYears,
   :fibo-fnd-dt-fd/hasDurationValue "P15Y",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDuration :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "fifteen years",
   :skos/definition "duration of exactly fifteen years"})

(def FiveYears
  "duration of exactly five years"
  {:db/ident :fibo-ind-ir-ir/FiveYears,
   :fibo-fnd-dt-fd/hasDurationValue "P5Y",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDuration :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "five years",
   :skos/definition "duration of exactly five years"})

(def FortyEightMonths
  "duration of exactly forty-eight months, regardless of the length in days of a given calendar month, but typically 30 days"
  {:db/ident :fibo-ind-ir-ir/FortyEightMonths,
   :fibo-fnd-dt-fd/hasDurationValue "P48M",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDuration :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "forty-eight months",
   :skos/definition
   "duration of exactly forty-eight months, regardless of the length in days of a given calendar month, but typically 30 days"})

(def FourYears
  "duration of exactly four years"
  {:db/ident :fibo-ind-ir-ir/FourYears,
   :fibo-fnd-dt-fd/hasDurationValue "P4Y",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDuration :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "four years",
   :skos/definition "duration of exactly four years"})

(def InterbankBidRate
  "interbank rate that is the interest rate at which participating banks are willing to borrow deposits from other banks"
  {:db/ident :fibo-ind-ir-ir/InterbankBidRate,
   :fibo-fnd-utl-av/explanatoryNote
   "Unlike an interbank offered rate, which is the rate at which banks lend money, an interbank bid rate is the rate at which banks ask to borrow.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "interbank bid rate",
   :rdfs/subClassOf :fibo-ind-ir-ir/InterbankRate,
   :skos/definition
   "interbank rate that is the interest rate at which participating banks are willing to borrow deposits from other banks"})

(def InterbankMidRate
  "interbank rate that represents the mid-point between bid and offer rates"
  {:db/ident :fibo-ind-ir-ir/InterbankMidRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "interbank mid rate",
   :rdfs/subClassOf :fibo-ind-ir-ir/InterbankRate,
   :skos/definition
   "interbank rate that represents the mid-point between bid and offer rates"})

(def InterbankOfferedRate
  "interbank rate that is the interest rate at which participating banks lend money"
  {:db/ident :fibo-ind-ir-ir/InterbankOfferedRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "interbank offered rate",
   :rdfs/subClassOf :fibo-ind-ir-ir/InterbankRate,
   :skos/definition
   "interbank rate that is the interest rate at which participating banks lend money"})

(def InterbankRate
  "reference rate that is the rate of interest charged on short-term loans between banks"
  {:db/ident :fibo-ind-ir-ir/InterbankRate,
   :fibo-fnd-utl-av/explanatoryNote
   "Banks borrow and lend money in the interbank market in order to manage liquidity and meet the requirements placed on them. The interest rate charged depends on the availability of money in the market, on prevailing rates and on the specific terms of the contract, such as term length.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "interbank rate",
   :rdfs/subClassOf :fibo-ind-ir-ir/ReferenceInterestRate,
   :skos/definition
   "reference rate that is the rate of interest charged on short-term loans between banks"})

(def InterestRateAuthority
  "financial service provider/publisher responsible for specifying some benchmark interest rate"
  {:db/ident :fibo-ind-ir-ir/InterestRateAuthority,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "interest rate authority",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/produces,
                      :owl/someValuesFrom :fibo-ind-ir-ir/ReferenceInterestRate,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-pas-fpas/FinancialServiceProvider
                     :fibo-be-fct-pub/Publisher],
   :skos/definition
   "financial service provider/publisher responsible for specifying some benchmark interest rate",
   :skos/example
   "This is typically a bank, central bank in the case of the publication of bank interest rates, or the committee responsible for publishing interbank rates, such as EURIBOR."})

(def InterestRateBenchmark
  "classifier for regularly updated interest rates that are publicly accessible, typically set by a central bank or group of financial institutions"
  {:db/ident :fibo-ind-ir-ir/InterestRateBenchmark,
   :fibo-fnd-utl-av/explanatoryNote
   "Benchmark rates, such as EURIBOR, the Fed Funds rate, and many others including those identified as FpML rates, are used as benchmarks for a variety of debt instruments.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "interest rate benchmark",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-be-fct-pub/Publisher,
                      :owl/onProperty :fibo-fnd-rel-rel/isProducedBy,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-qt-qtu/QuantityKind
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-dt-fd/Duration,
                      :owl/onProperty :fibo-ind-ir-ir/hasTenor,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-acc-cur/Currency,
                      :owl/onProperty :fibo-ind-ir-ir/hasReferenceCurrency,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :lcc-cr/classifies,
                      :owl/someValuesFrom :fibo-ind-ir-ir/ReferenceInterestRate,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-dt-fd/DateTime,
                      :owl/onProperty :fibo-ind-ir-ir/hasRateResetTimeOfDay,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-be-fct-pub/MarketDataProvider,
                      :owl/onProperty :fibo-fnd-rel-rel/isProvidedBy,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "classifier for regularly updated interest rates that are publicly accessible, typically set by a central bank or group of financial institutions"})

(def InterestRateBenchmarkClassificationScheme
  "scheme for classifying interest rate benchmarks, such as the FpML classification scheme"
  {:db/ident :fibo-ind-ir-ir/InterestRateBenchmarkClassificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "interest rate benchmark classification scheme",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/defines,
                      :owl/someValuesFrom :fibo-ind-ir-ir/InterestRateBenchmark,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-cls/ClassificationScheme],
   :skos/definition
   "scheme for classifying interest rate benchmarks, such as the FpML classification scheme"})

(def MarketDataProvider
  {:db/ident :fibo-ind-ir-ir/MarketDataProvider,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-be-fct-pub/MarketDataProvider,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"})

(def NineMonths
  "duration of exactly nine months, regardless of the length in days of a given calendar month, but typically 30 days"
  {:db/ident :fibo-ind-ir-ir/NineMonths,
   :fibo-fnd-dt-fd/hasDurationValue "P9M",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDuration :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "nine months",
   :skos/definition
   "duration of exactly nine months, regardless of the length in days of a given calendar month, but typically 30 days"})

(def OneDay
  "duration of exactly one day, or 24 hours, such as for an overnight rate"
  {:db/ident :fibo-ind-ir-ir/OneDay,
   :fibo-fnd-dt-fd/hasDurationValue "P1D",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDuration :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "one day",
   :skos/definition
   "duration of exactly one day, or 24 hours, such as for an overnight rate"})

(def OneHundredEightyMonths
  "duration of exactly one hundred eighty months, regardless of the length in days of a given calendar month, but typically 30 days"
  {:db/ident :fibo-ind-ir-ir/OneHundredEightyMonths,
   :fibo-fnd-dt-fd/hasDurationValue "P180M",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDuration :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "one hundred eighty months",
   :skos/definition
   "duration of exactly one hundred eighty months, regardless of the length in days of a given calendar month, but typically 30 days"})

(def OneMonth
  "duration of exactly one month, regardless of the length in days of a given calendar month, but typically 30 days"
  {:db/ident :fibo-ind-ir-ir/OneMonth,
   :fibo-fnd-dt-fd/hasDurationValue "P1M",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDuration :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "one month",
   :skos/definition
   "duration of exactly one month, regardless of the length in days of a given calendar month, but typically 30 days"})

(def OneWeek
  "duration of exactly one week, or 7 days"
  {:db/ident :fibo-ind-ir-ir/OneWeek,
   :fibo-fnd-dt-fd/hasDurationValue "P7D",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDuration :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "one week",
   :skos/definition "duration of exactly one week, or 7 days"})

(def OneYear
  "duration of exactly one year"
  {:db/ident :fibo-ind-ir-ir/OneYear,
   :fibo-fnd-dt-fd/hasDurationValue "P1Y",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDuration :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "one year",
   :skos/definition "duration of exactly one year"})

(def OvernightRate
  "reference rate that is an interest rate at which a depository institution lends funds to another depository institution (short-term), or the interest rate the central bank charges a financial institution to borrow money overnight"
  {:db/ident :fibo-ind-ir-ir/OvernightRate,
   :fibo-fnd-utl-av/explanatoryNote
   "The overnight rate is the lowest available interest rate, and as such, it is only available to the most creditworthy institutions. It is the underlying rate for Overnight Interest Rate Swaps (IOS).",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "overnight rate",
   :rdfs/subClassOf [{:owl/hasValue   :fibo-ind-ir-ir/OneDay,
                      :owl/onProperty :fibo-ind-ir-ir/hasTenor,
                      :rdf/type       :owl/Restriction}
                     :fibo-ind-ir-ir/ReferenceInterestRate],
   :skos/definition
   "reference rate that is an interest rate at which a depository institution lends funds to another depository institution (short-term), or the interest rate the central bank charges a financial institution to borrow money overnight"})

(def ReferenceInterestRate
  "market rate that is a rate of interest paid by or agreed among some bank or set of banks"
  {:db/ident :fibo-ind-ir-ir/ReferenceInterestRate,
   :fibo-fnd-utl-av/explanatoryNote
   "The reference rate is a moving index such as EURIBOR, the prime rate or the rate on benchmark U.S. Treasuries.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "reference interest rate",
   :rdfs/subClassOf [{:owl/allValuesFrom :fibo-fnd-dt-fd/Duration,
                      :owl/onProperty    :fibo-ind-ir-ir/hasTenor,
                      :rdf/type          :owl/Restriction}
                     :fibo-ind-ind-ind/MarketRate
                     {:owl/onProperty     :fibo-fnd-qt-qtu/hasQuantityKind,
                      :owl/someValuesFrom :fibo-ind-ir-ir/InterestRateBenchmark,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-dt-fd/DateTime,
                      :owl/onProperty :fibo-ind-ir-ir/hasRateResetTimeOfDay,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-acc-cur/InterestRate
                     {:owl/onClass    :fibo-fnd-acc-cur/Currency,
                      :owl/onProperty :fibo-ind-ir-ir/hasReferenceCurrency,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "market rate that is a rate of interest paid by or agreed among some bank or set of banks"})

(def SixMonths
  "duration of exactly six months, regardless of the length in days of a given calendar month, but typically 30 days"
  {:db/ident :fibo-ind-ir-ir/SixMonths,
   :fibo-fnd-dt-fd/hasDurationValue "P6M",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDuration :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "six months",
   :skos/definition
   "duration of exactly six months, regardless of the length in days of a given calendar month, but typically 30 days"})

(def SixtyMonths
  "duration of exactly sixty months, regardless of the length in days of a given calendar month, but typically 30 days"
  {:db/ident :fibo-ind-ir-ir/SixtyMonths,
   :fibo-fnd-dt-fd/hasDurationValue "P60M",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDuration :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "sixty months",
   :skos/definition
   "duration of exactly sixty months, regardless of the length in days of a given calendar month, but typically 30 days"})

(def SpecificProviderInterestRateBenchmark
  "interest rate benchmark that is made available by a specific market data provider for reference purposes"
  {:db/ident :fibo-ind-ir-ir/SpecificProviderInterestRateBenchmark,
   :fibo-fnd-utl-av/explanatoryNote
   "Benchmarks, such as those published by Bloomberg, Thomson-Reuters, and others, are usually quoted as of a specific date and time of day.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "specific-provider interest rate benchmark",
   :rdfs/subClassOf [{:owl/onClass    :fibo-be-fct-pub/MarketDataProvider,
                      :owl/onProperty :fibo-fnd-rel-rel/isProvidedBy,
                      :owl/qualifiedCardinality 0,
                      :rdf/type       :owl/Restriction}
                     :fibo-ind-ir-ir/InterestRateBenchmark],
   :skos/definition
   "interest rate benchmark that is made available by a specific market data provider for reference purposes"})

(def TenYears
  "duration of exactly ten years"
  {:db/ident :fibo-ind-ir-ir/TenYears,
   :fibo-fnd-dt-fd/hasDurationValue "P10Y",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDuration :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "ten years",
   :skos/definition "duration of exactly ten years"})

(def ThirtySixMonths
  "duration of exactly thirty-six months, regardless of the length in days of a given calendar month, but typically 30 days"
  {:db/ident :fibo-ind-ir-ir/ThirtySixMonths,
   :fibo-fnd-dt-fd/hasDurationValue "P36M",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDuration :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "thirty-six months",
   :skos/definition
   "duration of exactly thirty-six months, regardless of the length in days of a given calendar month, but typically 30 days"})

(def ThirtyYears
  "duration of exactly thirty years"
  {:db/ident :fibo-ind-ir-ir/ThirtyYears,
   :fibo-fnd-dt-fd/hasDurationValue "P30Y",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDuration :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "thirty years",
   :skos/definition "duration of exactly thirty years"})

(def ThreeHundredSixtyMonths
  "duration of exactly three hundred sixty months, regardless of the length in days of a given calendar month, but typically 30 days"
  {:db/ident :fibo-ind-ir-ir/ThreeHundredSixtyMonths,
   :fibo-fnd-dt-fd/hasDurationValue "P360M",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDuration :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "three hundred sixty months",
   :skos/definition
   "duration of exactly three hundred sixty months, regardless of the length in days of a given calendar month, but typically 30 days"})

(def ThreeMonths
  "duration of exactly three months, regardless of the length in days of a given calendar month, but typically 30 days"
  {:db/ident :fibo-ind-ir-ir/ThreeMonths,
   :fibo-fnd-dt-fd/hasDurationValue "P3M",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDuration :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "three months",
   :skos/definition
   "duration of exactly three months, regardless of the length in days of a given calendar month, but typically 30 days"})

(def ThreeYears
  "duration of exactly three years"
  {:db/ident :fibo-ind-ir-ir/ThreeYears,
   :fibo-fnd-dt-fd/hasDurationValue "P3Y",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDuration :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "three years",
   :skos/definition "duration of exactly three years"})

(def TwelveMonths
  "duration of exactly twelve months, regardless of the length in days of a given calendar month, but typically 30 days"
  {:db/ident :fibo-ind-ir-ir/TwelveMonths,
   :fibo-fnd-dt-fd/hasDurationValue "P12M",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDuration :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "twelve months",
   :skos/definition
   "duration of exactly twelve months, regardless of the length in days of a given calendar month, but typically 30 days"})

(def TwentyFourMonths
  "duration of exactly twenty-four months, regardless of the length in days of a given calendar month, but typically 30 days"
  {:db/ident :fibo-ind-ir-ir/TwentyFourMonths,
   :fibo-fnd-dt-fd/hasDurationValue "P24M",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDuration :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "twenty-four months",
   :skos/definition
   "duration of exactly twenty-four months, regardless of the length in days of a given calendar month, but typically 30 days"})

(def TwentyYears
  "duration of exactly twenty years"
  {:db/ident :fibo-ind-ir-ir/TwentyYears,
   :fibo-fnd-dt-fd/hasDurationValue "P20Y",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDuration :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "twenty years",
   :skos/definition "duration of exactly twenty years"})

(def TwoMonths
  "duration of exactly two months, regardless of the length in days of a given calendar month, but typically 30 days"
  {:db/ident :fibo-ind-ir-ir/TwoMonths,
   :fibo-fnd-dt-fd/hasDurationValue "P2M",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDuration :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "two months",
   :skos/definition
   "duration of exactly two months, regardless of the length in days of a given calendar month, but typically 30 days"})

(def TwoYears
  "duration of exactly two years"
  {:db/ident :fibo-ind-ir-ir/TwoYears,
   :fibo-fnd-dt-fd/hasDurationValue "P2Y",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDuration :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "two years",
   :skos/definition "duration of exactly two years"})

(def hasRateResetTimeOfDay
  "indicates the time of day when a change in a benchmark rate is published, typically the same time every business day"
  {:db/ident :fibo-ind-ir-ir/hasRateResetTimeOfDay,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "has rate reset time of day",
   :rdfs/range :fibo-fnd-dt-fd/DateTime,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasDateTime,
   :skos/definition
   "indicates the time of day when a change in a benchmark rate is published, typically the same time every business day"})

(def hasReferenceCurrency
  "relates something to the currency it is based on"
  {:db/ident :fibo-ind-ir-ir/hasReferenceCurrency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "has reference currency",
   :rdfs/range :fibo-fnd-acc-cur/Currency,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition "relates something to the currency it is based on"})

(def hasTenor
  "indicates the length of time for which a given rate, such as an interbank rate, exchange rate, other market rate is quoted, or a debt instrument has remaining prior to maturity or expiration"
  {:db/ident :fibo-ind-ir-ir/hasTenor,
   :fibo-fnd-utl-av/explanatoryNote
   "The tenor of most financial instruments declines over time, while the maturity remains constant. Risk associated with a given asset tends to decline with the reduction of the time remaining to maturity. The tenor of an interest rate swap can also refer to the frequency with which coupon payments are exchanged.",
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "has tenor",
   :rdfs/range :fibo-fnd-dt-fd/Duration,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasDuration,
   :skos/definition
   "indicates the length of time for which a given rate, such as an interbank rate, exchange rate, other market rate is quoted, or a debt instrument has remaining prior to maturity or expiration"})