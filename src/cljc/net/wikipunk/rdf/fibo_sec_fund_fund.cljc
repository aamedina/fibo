(ns net.wikipunk.rdf.fibo-sec-fund-fund
  "This ontology defines fundamental concepts about funds and collective investment vehicles (CIVs)."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 Object Management Group, Inc."
                       "Copyright (c) 2018-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/",
   :dcterms/abstract
   "This ontology defines fundamental concepts about funds and collective investment vehicles (CIVs).",
   :dcterms/contributor ["Wells Fargo Bank, N.A." "Thematix Partners LLC"],
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/GoalsAndObjectives/Objectives/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Equities/EquityInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://www.omg.org/spec/Commons/DatesAndTimes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/Pools/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/AccountingEquity/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/LegalCapacity/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Trusts/Trusts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/FormalBusinessOrganizations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/FinancialServicesEntities/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Funds/Funds/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-fbo"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-be-tr-tr"
    "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/",
    "fibo-fbc-fct-fse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
    "fibo-fnd-acc-aeq"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
    "fibo-fnd-law-lcap"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-eq-eq"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
    "fibo-sec-fund-fund"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/",
    "fibo-sec-sec-pls"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-fund-fund",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Funds Ontology"},
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds.rdf version of this ontology was modified to move the definition of SpecialPurposeVehicle to the Pools ontology to make it available for use more generally."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds.rdf version of this ontology was modified to eliminate a deprecated element for SpecialPurposeVehicle, which was moved to Pools last quarter."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds.rdf version of this ontology was modified to replace the original fibo-sec-fnd-fnd prefix with fibo-sec-fund-fund for the sake of clarity and to change the restriction on LegalFundStructure from an equivalence to a subclass relationship to address a reasoning error as well as adding a missing restriction on jurisdiction."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds.rdf version of this ontology was modified to address text formatting hygiene issues."]})

(def ClosedEndInvestment
  "investment fund that has a fixed number of shares offered by an investment company through an initial public offering"
  {:cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "closed-end fund"},
   :db/ident :fibo-sec-fund-fund/ClosedEndInvestment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "closed-end investment"},
   :rdfs/subClassOf [{:owl/hasValue   {:xsd/boolean false},
                      :owl/onProperty :fibo-sec-fund-fund/isOpenEnded,
                      :rdf/type       :owl/Restriction}
                     :fibo-sec-sec-pls/ManagedInvestment],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "investment fund that has a fixed number of shares offered by an investment company through an initial public offering"}})

(def CollectiveInvestmentVehicle
  "assets pooled by investors whose share capital remains separate from the assets of the vehicle"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962:2019 Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth edition, October 2019"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Collective investment vehicles are typically organized and operated by management companies, banks, or trust companies. Shares or units are issued in the form of unit trusts, mutual funds, or other similar contracts. Common kinds of funds include pension funds, insurance funds, foundations, and endowments. Such pools are often invested and professionally managed, including investment pools, umbrella pools, share class pools, etc."},
   :db/ident :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "collective investment vehicle"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-fund-fund/hasLegalStructure,
                      :owl/someValuesFrom
                      :fibo-sec-fund-fund/LegalFundStructure,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-sec-pls/PooledFund],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "assets pooled by investors whose share capital remains separate from the assets of the vehicle"}})

(def ExchangeTradedFund
  "investment fund whose fund units are traded on an exchange, much like stocks"
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "ETF"},
   :cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962:2019 Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth edition, October 2019"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "An ETF holds assets such as stocks, commodities, or bonds, and trades close to its net asset value over the course of the trading day. Most ETFs track an index, such as a stock, bond, or commodity index."},
   :db/ident :fibo-sec-fund-fund/ExchangeTradedFund,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "exchange-traded fund"},
   :rdfs/subClassOf :fibo-sec-fund-fund/OpenEndInvestment,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "investment fund whose fund units are traded on an exchange, much like stocks"}})

(def FundContract
  "contract that embodies and defines the fund legal form in cases where there is no independent organization"
  {:db/ident :fibo-sec-fund-fund/FundContract,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund contract"},
   :rdfs/subClassOf :fibo-be-le-fbo/OrganizationCoveringAgreement,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "contract that embodies and defines the fund legal form in cases where there is no independent organization"}})

(def FundOfFunds
  "investment fund that invests directly in other investment funds rather than investing in stocks, bonds, and other securities"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962:2019 Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth edition, October 2019"},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "umbrella fund"},
   :db/ident :fibo-sec-fund-fund/FundOfFunds,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund of funds"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-fund-fund/hasSubFund,
                      :owl/someValuesFrom
                      :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-sec-pls/ManagedInvestment],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "investment fund that invests directly in other investment funds rather than investing in stocks, bonds, and other securities"}})

(def FundUnit
  "security representing a unit in a fund"
  {:db/ident :fibo-sec-fund-fund/FundUnit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund unit"},
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/isConstituentOf,
                      :owl/someValuesFrom :fibo-sec-sec-pls/PooledFund,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-acc-cur/hasCurrency,
                      :owl/someValuesFrom :fibo-fnd-acc-cur/Currency,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-eq-eq/Share],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "security representing a unit in a fund"}})

(def HedgeFund
  "investment fund that pursues a total return and is usually open to qualified investors only"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962:2019 Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth edition, October 2019"},
   :db/ident :fibo-sec-fund-fund/HedgeFund,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "hedge fund"},
   :rdfs/subClassOf :fibo-sec-fund-fund/OpenEndInvestment,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "investment fund that pursues a total return and is usually open to qualified investors only"}})

(def LegalFundStructure
  "structure of a fund with respect to its legal formation in some jurisdiction"
  {:db/ident :fibo-sec-fund-fund/LegalFundStructure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "legal fund structure"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/isGovernedBy,
                      :owl/someValuesFrom :fibo-fnd-law-jur/Jurisdiction,
                      :rdf/type           :owl/Restriction}
                     {:owl/unionOf [:fibo-be-le-lp/LegalEntity
                                    :fibo-sec-fund-fund/FundContract],
                      :rdf/type    :owl/Class}
                     :fibo-fnd-law-lcap/LegalConstruct],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "structure of a fund with respect to its legal formation in some jurisdiction"}})

(def MutualFund
  "open-end professionally managed investment fund established for the purpose of investing in securities such as stocks, bonds, money market instruments and similar assets"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962:2019 Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth edition, October 2019"},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "standard (vanilla) investment fund"},
   :db/ident :fibo-sec-fund-fund/MutualFund,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mutual fund"},
   :rdfs/subClassOf :fibo-sec-fund-fund/OpenEndInvestment,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "open-end professionally managed investment fund established for the purpose of investing in securities such as stocks, bonds, money market instruments and similar assets"}})

(def OpenEndInvestment
  "investment fund that offered through a fund company that sells shares directly to investors"
  {:cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "open-end fund"},
   :db/ident :fibo-sec-fund-fund/OpenEndInvestment,
   :owl/disjointWith :fibo-sec-fund-fund/ClosedEndInvestment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "open-end investment"},
   :rdfs/subClassOf [{:owl/hasValue   {:xsd/boolean true},
                      :owl/onProperty :fibo-sec-fund-fund/isOpenEnded,
                      :rdf/type       :owl/Restriction}
                     :fibo-sec-sec-pls/ManagedInvestment],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "investment fund that offered through a fund company that sells shares directly to investors"}})

(def PensionFund
  "investment fund run by a financial intermediary on behalf of an organization and its employees/members"
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "ETF"},
   :cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962:2019 Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth edition, October 2019"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A pension fund is a common asset pool meant to generate stable growth over a long-term investment horizon."},
   :db/ident :fibo-sec-fund-fund/PensionFund,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pension fund"},
   :rdfs/subClassOf :fibo-sec-sec-pls/ManagedInvestment,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "investment fund run by a financial intermediary on behalf of an organization and its employees/members"}})

(def PrivateEquityFund
  "investment fund used for making investments in various equity (and to a lesser extent debt) securities according to an investment strategy associated with private equity"
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "ETF"},
   :cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962:2019 Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth edition, October 2019"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Private equity funds are typically structured as limited partnerships or limited liability companies, wherein investors are limited partners, and the fund is managed by one or more general partners. It is composed of investors and funds that invest directly in private companies, or that engage in buyouts of public companies, resulting in the delisting of the public equity."},
   :db/ident :fibo-sec-fund-fund/PrivateEquityFund,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "private equity fund"},
   :rdfs/subClassOf :fibo-sec-sec-pls/ManagedInvestment,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "investment fund used for making investments in various equity (and to a lesser extent debt) securities according to an investment strategy associated with private equity"}})

(def RealEstateInvestmentTrust
  "investment fund that offers shares/units to the public and invests in real estate directly"
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "REIT"},
   :cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962:2019 Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth edition, October 2019"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Real estate investment trusts own, and in most cases operate, income-producing real estate. REITs own many types of commercial real estate, ranging from office and apartment buildings to warehouses, hospitals, shopping centers, hotels and commercial forests. Some REITs engage in financing real estate."},
   :db/ident :fibo-sec-fund-fund/RealEstateInvestmentTrust,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "real estate investment trust"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-fund-fund/hasLegalStructure,
                      :owl/someValuesFrom :fibo-be-tr-tr/Trust,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/ManagedInvestment],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "investment fund that offers shares/units to the public and invests in real estate directly"}})

(def SovereignWealthFund
  "state-owned investment fund that consists of pools of money derived from a country's reserves"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Sovereign wealth funds include the International Monetary Fund, whose corresponding legal entity is a polity."},
   :cmns-av/synonym [{:rdf/language "en",
                      :rdf/value    "sovereign investment fund"}
                     {:rdf/language "en",
                      :rdf/value    "social wealth fund"}],
   :db/ident :fibo-sec-fund-fund/SovereignWealthFund,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "sovereign wealth fund"},
   :rdfs/subClassOf :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "state-owned investment fund that consists of pools of money derived from a country's reserves"}})

(def hasLegalStructure
  "indicates the legal form that the fund takes"
  {:db/ident :fibo-sec-fund-fund/hasLegalStructure,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-sec-pls/PooledFund,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has legal structure"},
   :rdfs/range :fibo-sec-fund-fund/LegalFundStructure,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "indicates the legal form that the fund takes"}})

(def hasSubFund
  "relates a pooled fund to a sub-fund that is a constituent of the parent fund"
  {:db/ident :fibo-sec-fund-fund/hasSubFund,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-sec-pls/PooledFund,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has sub-fund"},
   :rdfs/range :fibo-sec-sec-pls/PooledFund,
   :rdfs/subPropertyOf :cmns-col/hasPart,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "relates a pooled fund to a sub-fund that is a constituent of the parent fund"}})

(def isOpenEnded
  "indicates whether the fund is an open-end/closed-end fund"
  {:db/ident :fibo-sec-fund-fund/isOpenEnded,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-sec-pls/PooledFund,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is open ended"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "indicates whether the fund is an open-end/closed-end fund"}})

(def isSubFundOf
  "relates a pooled fund to a parent fund"
  {:db/ident :fibo-sec-fund-fund/isSubFundOf,
   :owl/inverseOf :fibo-sec-fund-fund/hasSubFund,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-sec-pls/PooledFund,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is sub-fund of"},
   :rdfs/range :fibo-sec-sec-pls/PooledFund,
   :rdfs/subPropertyOf :cmns-col/isPartOf,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "relates a pooled fund to a parent fund"}})

(def ^{:private true} ManagedInvestment
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962:2019 Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth edition, October 2019"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A managed investment is an investment vehicle that consists of a pool of funds collected from many different investors run by a management company."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "investment fund"},
   :db/ident :fibo-sec-sec-pls/ManagedInvestment,
   :rdf/type :owl/Class,
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-fund-fund/isOpenEnded,
                      :owl/someValuesFrom :xsd/boolean,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-fund-fund/CollectiveInvestmentVehicle]})

(def ^{:private true} PooledFund
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A fund can be established for any purpose, such as a municipality setting aside money for a construction project, monies designated to endow a university chair or for scholarships, or funds set aside by insurance companies to settle claims."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "fund"},
   :db/ident        :fibo-sec-sec-pls/PooledFund,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-sec-fund-fund/FundUnit,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-gao-obj/hasObjective,
                      :owl/someValuesFrom :fibo-fnd-gao-obj/InvestmentObjective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-fse/hasDateEstablished,
                      :owl/someValuesFrom :cmns-dt/ExplicitDate,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-aeq/FinancialAsset]})