(ns net.wikipunk.rdf.fibo-ind-ir-ir
  {:cmns-av/copyright #{"Copyright (c) 2014-2023 Object Management Group, Inc."
                        "Copyright (c) 2014-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/InterestRates/InterestRates/",
   :dcterms/abstract
   "This ontology provides the basic types of interest rate which are recognized in the financial markets, and the relationships between these where applicable. These include bank base rates, inter-bank offer rates, overnight rates of interest and the US Federal Funds rate which is widely used as a rate of reference. It also includes the concept of a market rate spread between two interest rates.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-fct-pub"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
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
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Quantities/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/Indicators/Indicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/FunctionalEntities/Publishers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/InterestRates/InterestRates/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-ind-ir-ir",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfs/label "Interest Rates Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was modified per the FIBO 2.0 RFC, including adding support for reference rates from FpML."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was modified per the issue resolutions identified in the FIBO IND 1.0 FTF 2 report."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was modified to move the property, 'is conferred on' to the Legal Capacity ontology and to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was modified to add the notion of a classifier for reference rates, so that we can differentiate between kinds of rates and the rates themselves, clean up definitions to conform with ISO 704, merge classes referenced in interest rate publishers to eliminate potential circular references, and eliminate duplication of concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was modified to replace 'financial information publisher' with publisher for simplification purposes."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was modified per the issue resolutions identified in the FIBO IND 1.0 FTF 1 report."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was modified to correct a restriction on specific provider interest rate benchmark."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"})

(def BaseRate
  {:cmns-av/abbreviation "BBR",
   :cmns-av/explanatoryNote
   "Typically, the bank base rate is a reference rate set by a central bank. Banks that are regulated by a given central bank cannot lend below the base rate to their customers. The bank base rate is determined on an ongoing basis and represents the central bank's judgement of the price of short-term funds on their interbank market.",
   :cmns-av/synonym "bank base rate",
   :db/ident :fibo-ind-ir-ir/BaseRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "base rate",
   :rdfs/subClassOf :fibo-ind-ir-ir/ReferenceInterestRate,
   :skos/definition
   "basic rate of interest on which the actual rate a bank charges on loans to its customers is calculated"})

(def EighteenMonths
  {:cmns-dt/hasDurationValue "P18M",
   :db/ident :fibo-ind-ir-ir/EighteenMonths,
   :rdf/type #{:cmns-dt/ExplicitDuration :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "eighteen months",
   :skos/definition
   "duration of exactly eighteen months, regardless of the length in days of a given calendar month, but typically 30 days"})

(def FifteenYears
  {:cmns-dt/hasDurationValue "P15Y",
   :db/ident :fibo-ind-ir-ir/FifteenYears,
   :rdf/type #{:cmns-dt/ExplicitDuration :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "fifteen years",
   :skos/definition "duration of exactly fifteen years"})

(def FiveYears
  {:cmns-dt/hasDurationValue "P5Y",
   :db/ident :fibo-ind-ir-ir/FiveYears,
   :rdf/type #{:cmns-dt/ExplicitDuration :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "five years",
   :skos/definition "duration of exactly five years"})

(def FortyEightMonths
  {:cmns-dt/hasDurationValue "P48M",
   :db/ident :fibo-ind-ir-ir/FortyEightMonths,
   :rdf/type #{:cmns-dt/ExplicitDuration :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "forty-eight months",
   :skos/definition
   "duration of exactly forty-eight months, regardless of the length in days of a given calendar month, but typically 30 days"})

(def FourYears
  {:cmns-dt/hasDurationValue "P4Y",
   :db/ident :fibo-ind-ir-ir/FourYears,
   :rdf/type #{:cmns-dt/ExplicitDuration :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "four years",
   :skos/definition "duration of exactly four years"})

(def InterbankBidRate
  {:cmns-av/explanatoryNote
   "Unlike an interbank offered rate, which is the rate at which banks lend money, an interbank bid rate is the rate at which banks ask to borrow.",
   :db/ident :fibo-ind-ir-ir/InterbankBidRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "interbank bid rate",
   :rdfs/subClassOf :fibo-ind-ir-ir/InterbankRate,
   :skos/definition
   "interbank rate that is the interest rate at which participating banks are willing to borrow deposits from other banks"})

(def InterbankMidRate
  {:db/ident :fibo-ind-ir-ir/InterbankMidRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "interbank mid rate",
   :rdfs/subClassOf :fibo-ind-ir-ir/InterbankRate,
   :skos/definition
   "interbank rate that represents the mid-point between bid and offer rates"})

(def InterbankOfferedRate
  {:db/ident :fibo-ind-ir-ir/InterbankOfferedRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "interbank offered rate",
   :rdfs/subClassOf :fibo-ind-ir-ir/InterbankRate,
   :skos/definition
   "interbank rate that is the interest rate at which participating banks lend money"})

(def InterbankRate
  {:cmns-av/explanatoryNote
   "Banks borrow and lend money in the interbank market in order to manage liquidity and meet the requirements placed on them. The interest rate charged depends on the availability of money in the market, on prevailing rates and on the specific terms of the contract, such as term length.",
   :db/ident :fibo-ind-ir-ir/InterbankRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "interbank rate",
   :rdfs/subClassOf :fibo-ind-ir-ir/ReferenceInterestRate,
   :skos/definition
   "reference rate that is the rate of interest charged on short-term loans between banks"})

(def InterestRateAuthority
  {:db/ident :fibo-ind-ir-ir/InterestRateAuthority,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "interest rate authority",
   :rdfs/subClassOf #{:fibo-fbc-pas-fpas/FinancialServiceProvider
                      {:owl/onProperty :fibo-fnd-rel-rel/produces,
                       :owl/someValuesFrom
                       :fibo-ind-ir-ir/ReferenceInterestRate,
                       :rdf/type :owl/Restriction} :fibo-be-fct-pub/Publisher},
   :skos/definition
   "financial service provider/publisher responsible for specifying some benchmark interest rate",
   :skos/example
   "This is typically a bank, central bank in the case of the publication of bank interest rates, or the committee responsible for publishing interbank rates, such as EURIBOR."})

(def InterestRateBenchmark
  {:cmns-av/explanatoryNote
   "Benchmark rates, such as EURIBOR, the Fed Funds rate, and many others including those identified as FpML rates, are used as benchmarks for a variety of debt instruments.",
   :db/ident :fibo-ind-ir-ir/InterestRateBenchmark,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "interest rate benchmark",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-fnd-acc-cur/Currency,
                       :owl/onProperty :fibo-ind-ir-ir/hasReferenceCurrency,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-dt/DateTime,
                       :owl/onProperty :fibo-ind-ir-ir/hasRateResetTimeOfDay,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-dt/Duration,
                       :owl/onProperty :fibo-ind-ir-ir/hasTenor,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty :cmns-cls/classifies,
                       :owl/someValuesFrom
                       :fibo-ind-ir-ir/ReferenceInterestRate,
                       :rdf/type :owl/Restriction} :fibo-fnd-qt-qtu/QuantityKind
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-be-fct-pub/MarketDataProvider,
                       :owl/onProperty :fibo-fnd-rel-rel/isProvidedBy,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-be-fct-pub/Publisher,
                       :owl/onProperty :fibo-fnd-rel-rel/isProducedBy,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "classifier for regularly updated interest rates that are publicly accessible, typically set by a central bank or group of financial institutions"})

(def InterestRateBenchmarkClassificationScheme
  {:db/ident :fibo-ind-ir-ir/InterestRateBenchmarkClassificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "interest rate benchmark classification scheme",
   :rdfs/subClassOf #{:cmns-cls/ClassificationScheme
                      {:owl/onProperty :cmns-dsg/defines,
                       :owl/someValuesFrom
                       :fibo-ind-ir-ir/InterestRateBenchmark,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "scheme for classifying interest rate benchmarks, such as the FpML classification scheme"})

(def MarketDataProvider
  {:db/ident :fibo-ind-ir-ir/MarketDataProvider,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-be-fct-pub/MarketDataProvider,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"}})

(def NineMonths
  {:cmns-dt/hasDurationValue "P9M",
   :db/ident :fibo-ind-ir-ir/NineMonths,
   :rdf/type #{:cmns-dt/ExplicitDuration :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "nine months",
   :skos/definition
   "duration of exactly nine months, regardless of the length in days of a given calendar month, but typically 30 days"})

(def OneDay
  {:cmns-dt/hasDurationValue "P1D",
   :db/ident :fibo-ind-ir-ir/OneDay,
   :rdf/type #{:cmns-dt/ExplicitDuration :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "one day",
   :skos/definition
   "duration of exactly one day, or 24 hours, such as for an overnight rate"})

(def OneHundredEightyMonths
  {:cmns-dt/hasDurationValue "P180M",
   :db/ident :fibo-ind-ir-ir/OneHundredEightyMonths,
   :rdf/type #{:cmns-dt/ExplicitDuration :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "one hundred eighty months",
   :skos/definition
   "duration of exactly one hundred eighty months, regardless of the length in days of a given calendar month, but typically 30 days"})

(def OneMonth
  {:cmns-dt/hasDurationValue "P1M",
   :db/ident :fibo-ind-ir-ir/OneMonth,
   :rdf/type #{:cmns-dt/ExplicitDuration :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "one month",
   :skos/definition
   "duration of exactly one month, regardless of the length in days of a given calendar month, but typically 30 days"})

(def OneWeek
  {:cmns-dt/hasDurationValue "P7D",
   :db/ident :fibo-ind-ir-ir/OneWeek,
   :rdf/type #{:cmns-dt/ExplicitDuration :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "one week",
   :skos/definition "duration of exactly one week, or 7 days"})

(def OneYear
  {:cmns-dt/hasDurationValue "P1Y",
   :db/ident :fibo-ind-ir-ir/OneYear,
   :rdf/type #{:cmns-dt/ExplicitDuration :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "one year",
   :skos/definition "duration of exactly one year"})

(def OvernightRate
  {:cmns-av/explanatoryNote
   "The overnight rate is the lowest available interest rate, and as such, it is only available to the most creditworthy institutions. It is the underlying rate for Overnight Interest Rate Swaps (IOS).",
   :db/ident :fibo-ind-ir-ir/OvernightRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "overnight rate",
   :rdfs/subClassOf #{:fibo-ind-ir-ir/ReferenceInterestRate
                      {:owl/hasValue   :fibo-ind-ir-ir/OneDay,
                       :owl/onProperty :fibo-ind-ir-ir/hasTenor,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "reference rate that is an interest rate at which a depository institution lends funds to another depository institution (short-term), or the interest rate the central bank charges a financial institution to borrow money overnight"})

(def ReferenceInterestRate
  {:cmns-av/explanatoryNote
   "The reference rate is a moving index such as EURIBOR, the prime rate or the rate on benchmark U.S. Treasuries.",
   :db/ident :fibo-ind-ir-ir/ReferenceInterestRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "reference interest rate",
   :rdfs/subClassOf
   #{:fibo-ind-ind-ind/MarketRate
     {:owl/onProperty     :fibo-fnd-qt-qtu/hasQuantityKind,
      :owl/someValuesFrom :fibo-ind-ir-ir/InterestRateBenchmark,
      :rdf/type           :owl/Restriction}
     {:owl/onClass    :fibo-fnd-acc-cur/Currency,
      :owl/onProperty :fibo-ind-ir-ir/hasReferenceCurrency,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :cmns-dt/DateTime,
      :owl/onProperty :fibo-ind-ir-ir/hasRateResetTimeOfDay,
      :rdf/type       :owl/Restriction}
     {:owl/allValuesFrom :cmns-dt/Duration,
      :owl/onProperty    :fibo-ind-ir-ir/hasTenor,
      :rdf/type          :owl/Restriction} :fibo-fnd-acc-cur/InterestRate},
   :skos/definition
   "market rate that is a rate of interest paid by or agreed among some bank or set of banks"})

(def SixMonths
  {:cmns-dt/hasDurationValue "P6M",
   :db/ident :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:cmns-dt/ExplicitDuration :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "six months",
   :skos/definition
   "duration of exactly six months, regardless of the length in days of a given calendar month, but typically 30 days"})

(def SixtyMonths
  {:cmns-dt/hasDurationValue "P60M",
   :db/ident :fibo-ind-ir-ir/SixtyMonths,
   :rdf/type #{:cmns-dt/ExplicitDuration :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "sixty months",
   :skos/definition
   "duration of exactly sixty months, regardless of the length in days of a given calendar month, but typically 30 days"})

(def SpecificProviderInterestRateBenchmark
  {:cmns-av/explanatoryNote
   "Benchmarks, such as those published by Bloomberg, Thomson-Reuters, and others, are usually quoted as of a specific date and time of day.",
   :db/ident :fibo-ind-ir-ir/SpecificProviderInterestRateBenchmark,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "specific-provider interest rate benchmark",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-be-fct-pub/MarketDataProvider,
                       :owl/onProperty :fibo-fnd-rel-rel/isProvidedBy,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-ind-ir-ir/InterestRateBenchmark},
   :skos/definition
   "interest rate benchmark that is made available by a specific market data provider for reference purposes"})

(def TenYears
  {:cmns-dt/hasDurationValue "P10Y",
   :db/ident :fibo-ind-ir-ir/TenYears,
   :rdf/type #{:cmns-dt/ExplicitDuration :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "ten years",
   :skos/definition "duration of exactly ten years"})

(def ThirtySixMonths
  {:cmns-dt/hasDurationValue "P36M",
   :db/ident :fibo-ind-ir-ir/ThirtySixMonths,
   :rdf/type #{:cmns-dt/ExplicitDuration :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "thirty-six months",
   :skos/definition
   "duration of exactly thirty-six months, regardless of the length in days of a given calendar month, but typically 30 days"})

(def ThirtyYears
  {:cmns-dt/hasDurationValue "P30Y",
   :db/ident :fibo-ind-ir-ir/ThirtyYears,
   :rdf/type #{:cmns-dt/ExplicitDuration :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "thirty years",
   :skos/definition "duration of exactly thirty years"})

(def ThreeHundredSixtyMonths
  {:cmns-dt/hasDurationValue "P360M",
   :db/ident :fibo-ind-ir-ir/ThreeHundredSixtyMonths,
   :rdf/type #{:cmns-dt/ExplicitDuration :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "three hundred sixty months",
   :skos/definition
   "duration of exactly three hundred sixty months, regardless of the length in days of a given calendar month, but typically 30 days"})

(def ThreeMonths
  {:cmns-dt/hasDurationValue "P3M",
   :db/ident :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type #{:cmns-dt/ExplicitDuration :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "three months",
   :skos/definition
   "duration of exactly three months, regardless of the length in days of a given calendar month, but typically 30 days"})

(def ThreeYears
  {:cmns-dt/hasDurationValue "P3Y",
   :db/ident :fibo-ind-ir-ir/ThreeYears,
   :rdf/type #{:cmns-dt/ExplicitDuration :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "three years",
   :skos/definition "duration of exactly three years"})

(def TwelveMonths
  {:cmns-dt/hasDurationValue "P12M",
   :db/ident :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:cmns-dt/ExplicitDuration :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "twelve months",
   :skos/definition
   "duration of exactly twelve months, regardless of the length in days of a given calendar month, but typically 30 days"})

(def TwentyFourMonths
  {:cmns-dt/hasDurationValue "P24M",
   :db/ident :fibo-ind-ir-ir/TwentyFourMonths,
   :rdf/type #{:cmns-dt/ExplicitDuration :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "twenty-four months",
   :skos/definition
   "duration of exactly twenty-four months, regardless of the length in days of a given calendar month, but typically 30 days"})

(def TwentyYears
  {:cmns-dt/hasDurationValue "P20Y",
   :db/ident :fibo-ind-ir-ir/TwentyYears,
   :rdf/type #{:cmns-dt/ExplicitDuration :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "twenty years",
   :skos/definition "duration of exactly twenty years"})

(def TwoMonths
  {:cmns-dt/hasDurationValue "P2M",
   :db/ident :fibo-ind-ir-ir/TwoMonths,
   :rdf/type #{:cmns-dt/ExplicitDuration :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "two months",
   :skos/definition
   "duration of exactly two months, regardless of the length in days of a given calendar month, but typically 30 days"})

(def TwoYears
  {:cmns-dt/hasDurationValue "P2Y",
   :db/ident :fibo-ind-ir-ir/TwoYears,
   :rdf/type #{:cmns-dt/ExplicitDuration :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "two years",
   :skos/definition "duration of exactly two years"})

(def hasRateResetTimeOfDay
  {:db/ident :fibo-ind-ir-ir/hasRateResetTimeOfDay,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "has rate reset time of day",
   :rdfs/range :cmns-dt/DateTime,
   :rdfs/subPropertyOf :cmns-dt/hasDateTime,
   :skos/definition
   "indicates the time of day when a change in a benchmark rate is published, typically the same time every business day"})

(def hasReferenceCurrency
  {:db/ident :fibo-ind-ir-ir/hasReferenceCurrency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "has reference currency",
   :rdfs/range :fibo-fnd-acc-cur/Currency,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasCurrency,
   :skos/definition "relates something to the currency it is based on"})

(def hasTenor
  {:cmns-av/explanatoryNote
   "The tenor of most financial instruments declines over time, while the maturity remains constant. Risk associated with a given asset tends to decline with the reduction of the time remaining to maturity. The tenor of an interest rate swap can also refer to the frequency with which coupon payments are exchanged.",
   :db/ident :fibo-ind-ir-ir/hasTenor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"},
   :rdfs/label "has tenor",
   :rdfs/range :cmns-dt/Duration,
   :rdfs/subPropertyOf :cmns-dt/hasDuration,
   :skos/definition
   "indicates the length of time for which a given rate, such as an interbank rate, exchange rate, other market rate is quoted, or a debt instrument has remaining prior to maturity or expiration"})

(def urn:uuid:93bfef75-26c0-5b53-a463-60b90a4206b2
  {:cmns-av/copyright #{"Copyright (c) 2014-2023 Object Management Group, Inc."
                        "Copyright (c) 2014-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology provides the basic types of interest rate which are recognized in the financial markets, and the relationships between these where applicable. These include bank base rates, inter-bank offer rates, overnight rates of interest and the US Federal Funds rate which is widely used as a rate of reference. It also includes the concept of a market rate spread between two interest rates.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Quantities/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/Indicators/Indicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/FunctionalEntities/Publishers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/InterestRates/InterestRates/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Interest Rates Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was modified per the FIBO 2.0 RFC, including adding support for reference rates from FpML."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was modified per the issue resolutions identified in the FIBO IND 1.0 FTF 2 report."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was modified to move the property, 'is conferred on' to the Legal Capacity ontology and to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was modified to add the notion of a classifier for reference rates, so that we can differentiate between kinds of rates and the rates themselves, clean up definitions to conform with ISO 704, merge classes referenced in interest rate publishers to eliminate potential circular references, and eliminate duplication of concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was modified to replace 'financial information publisher' with publisher for simplification purposes."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was modified per the issue resolutions identified in the FIBO IND 1.0 FTF 1 report."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was modified to correct a restriction on specific provider interest rate benchmark."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"})