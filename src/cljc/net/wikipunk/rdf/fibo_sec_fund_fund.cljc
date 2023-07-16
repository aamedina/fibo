(ns net.wikipunk.rdf.fibo-sec-fund-fund
  "This ontology defines fundamental concepts about funds and collective investment vehicles (CIVs)."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 Object Management Group, Inc."
                       "Copyright (c) 2018-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/",
   :dcterms/abstract
   "This ontology defines fundamental concepts about funds and collective investment vehicles (CIVs).",
   :dcterms/contributor ["Wells Fargo Bank, N.A." "Thematix Partners LLC"],
   :dcterms/license {:rdfa/uri "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/GoalsAndObjectives/Objectives/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Equities/EquityInstruments/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/DatesAndTimes/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/Pools/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/AccountingEquity/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/LegalCapacity/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Trusts/Trusts/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/Collections/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/FormalBusinessOrganizations/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/FinancialServicesEntities/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Funds/Funds/"},
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
   :rdfs/label #xsd/langString "Funds Ontology@en",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds.rdf version of this ontology was modified to move the definition of SpecialPurposeVehicle to the Pools ontology to make it available for use more generally."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds.rdf version of this ontology was modified to eliminate a deprecated element for SpecialPurposeVehicle, which was moved to Pools last quarter."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds.rdf version of this ontology was modified to replace the original fibo-sec-fnd-fnd prefix with fibo-sec-fund-fund for the sake of clarity and to change the restriction on LegalFundStructure from an equivalence to a subclass relationship to address a reasoning error as well as adding a missing restriction on jurisdiction."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds.rdf version of this ontology was modified to address text formatting hygiene issues."]})

(def ClosedEndInvestment
  "investment fund that has a fixed number of shares offered by an investment company through an initial public offering"
  {:cmns-av/synonym #xsd/langString "closed-end fund@en",
   :db/ident :fibo-sec-fund-fund/ClosedEndInvestment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/"},
   :rdfs/label #xsd/langString "closed-end investment@en",
   :rdfs/subClassOf [{:owl/hasValue   #xsd/boolean false,
                      :owl/onProperty :fibo-sec-fund-fund/isOpenEnded,
                      :rdf/type       :owl/Restriction}
                     :fibo-sec-sec-pls/ManagedInvestment
                     :fibo-sec-fund-fund/CollectiveInvestmentVehicle
                     {:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-sec-fund-fund/FundUnit,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-aeq/FinancialAsset
                     {:owl/onProperty     :fibo-fnd-gao-obj/hasObjective,
                      :owl/someValuesFrom :fibo-fnd-gao-obj/InvestmentObjective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-fse/hasDateEstablished,
                      :owl/someValuesFrom :cmns-dt/ExplicitDate,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/PooledFund
                     {:owl/onProperty     :fibo-sec-fund-fund/isOpenEnded,
                      :owl/someValuesFrom :xsd/boolean,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-sec-fund-fund/hasLegalStructure,
                      :owl/someValuesFrom
                      :fibo-sec-fund-fund/LegalFundStructure,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "investment fund that has a fixed number of shares offered by an investment company through an initial public offering@en"})

(def CollectiveInvestmentVehicle
  "assets pooled by investors whose share capital remains separate from the assets of the vehicle"
  {:cmns-av/adaptedFrom
   #xsd/langString
    "ISO 10962:2019 Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth edition, October 2019@en",
   :cmns-av/explanatoryNote
   #xsd/langString
    "Collective investment vehicles are typically organized and operated by management companies, banks, or trust companies. Shares or units are issued in the form of unit trusts, mutual funds, or other similar contracts. Common kinds of funds include pension funds, insurance funds, foundations, and endowments. Such pools are often invested and professionally managed, including investment pools, umbrella pools, share class pools, etc.@en",
   :db/ident :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/"},
   :rdfs/label #xsd/langString "collective investment vehicle@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-fund-fund/hasLegalStructure,
                      :owl/someValuesFrom
                      :fibo-sec-fund-fund/LegalFundStructure,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-sec-pls/PooledFund
                     {:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-sec-fund-fund/FundUnit,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-aeq/FinancialAsset
                     {:owl/onProperty     :fibo-fnd-gao-obj/hasObjective,
                      :owl/someValuesFrom :fibo-fnd-gao-obj/InvestmentObjective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-fse/hasDateEstablished,
                      :owl/someValuesFrom :cmns-dt/ExplicitDate,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "assets pooled by investors whose share capital remains separate from the assets of the vehicle@en"})

(def ExchangeTradedFund
  "investment fund whose fund units are traded on an exchange, much like stocks"
  {:cmns-av/abbreviation #xsd/langString "ETF@en",
   :cmns-av/adaptedFrom
   #xsd/langString
    "ISO 10962:2019 Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth edition, October 2019@en",
   :cmns-av/explanatoryNote
   #xsd/langString
    "An ETF holds assets such as stocks, commodities, or bonds, and trades close to its net asset value over the course of the trading day. Most ETFs track an index, such as a stock, bond, or commodity index.@en",
   :db/ident :fibo-sec-fund-fund/ExchangeTradedFund,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/"},
   :rdfs/label #xsd/langString "exchange-traded fund@en",
   :rdfs/subClassOf [:fibo-sec-fund-fund/OpenEndInvestment
                     :fibo-sec-fund-fund/CollectiveInvestmentVehicle
                     {:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-sec-fund-fund/FundUnit,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-aeq/FinancialAsset
                     :fibo-sec-sec-pls/ManagedInvestment
                     {:owl/onProperty     :fibo-fnd-gao-obj/hasObjective,
                      :owl/someValuesFrom :fibo-fnd-gao-obj/InvestmentObjective,
                      :rdf/type           :owl/Restriction}
                     {:owl/hasValue   #xsd/boolean true,
                      :owl/onProperty :fibo-sec-fund-fund/isOpenEnded,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-fse/hasDateEstablished,
                      :owl/someValuesFrom :cmns-dt/ExplicitDate,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/PooledFund
                     {:owl/onProperty     :fibo-sec-fund-fund/isOpenEnded,
                      :owl/someValuesFrom :xsd/boolean,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-sec-fund-fund/hasLegalStructure,
                      :owl/someValuesFrom
                      :fibo-sec-fund-fund/LegalFundStructure,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "investment fund whose fund units are traded on an exchange, much like stocks@en"})

(def FundContract
  "contract that embodies and defines the fund legal form in cases where there is no independent organization"
  {:db/ident :fibo-sec-fund-fund/FundContract,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/"},
   :rdfs/label #xsd/langString "fund contract@en",
   :rdfs/subClassOf :fibo-be-le-fbo/OrganizationCoveringAgreement,
   :skos/definition
   #xsd/langString
    "contract that embodies and defines the fund legal form in cases where there is no independent organization@en"})

(def FundOfFunds
  "investment fund that invests directly in other investment funds rather than investing in stocks, bonds, and other securities"
  {:cmns-av/adaptedFrom
   #xsd/langString
    "ISO 10962:2019 Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth edition, October 2019@en",
   :cmns-av/synonym #xsd/langString "umbrella fund@en",
   :db/ident :fibo-sec-fund-fund/FundOfFunds,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/"},
   :rdfs/label #xsd/langString "fund of funds@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-sec-fund-fund/hasSubFund,
     :owl/someValuesFrom :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
     :rdf/type           :owl/Restriction}
    :fibo-sec-sec-pls/ManagedInvestment
    :fibo-sec-fund-fund/CollectiveInvestmentVehicle
    {:owl/onProperty     :cmns-col/hasConstituent,
     :owl/someValuesFrom :fibo-sec-fund-fund/FundUnit,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-acc-aeq/FinancialAsset
    {:owl/onProperty     :fibo-fnd-gao-obj/hasObjective,
     :owl/someValuesFrom :fibo-fnd-gao-obj/InvestmentObjective,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fct-fse/hasDateEstablished,
     :owl/someValuesFrom :cmns-dt/ExplicitDate,
     :rdf/type           :owl/Restriction}
    :fibo-sec-sec-pls/PooledFund
    {:owl/onProperty     :fibo-sec-fund-fund/isOpenEnded,
     :owl/someValuesFrom :xsd/boolean,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-fund/hasLegalStructure,
     :owl/someValuesFrom :fibo-sec-fund-fund/LegalFundStructure,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "investment fund that invests directly in other investment funds rather than investing in stocks, bonds, and other securities@en"})

(def FundUnit
  "security representing a unit in a fund"
  {:db/ident :fibo-sec-fund-fund/FundUnit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/"},
   :rdfs/label #xsd/langString "fund unit@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/isConstituentOf,
                      :owl/someValuesFrom :fibo-sec-sec-pls/PooledFund,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-acc-cur/hasCurrency,
                      :owl/someValuesFrom :fibo-fnd-acc-cur/Currency,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-eq-eq/Share],
   :skos/definition #xsd/langString
                     "security representing a unit in a fund@en"})

(def HedgeFund
  "investment fund that pursues a total return and is usually open to qualified investors only"
  {:cmns-av/adaptedFrom
   #xsd/langString
    "ISO 10962:2019 Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth edition, October 2019@en",
   :db/ident :fibo-sec-fund-fund/HedgeFund,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/"},
   :rdfs/label #xsd/langString "hedge fund@en",
   :rdfs/subClassOf [:fibo-sec-fund-fund/OpenEndInvestment
                     :fibo-sec-fund-fund/CollectiveInvestmentVehicle
                     {:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-sec-fund-fund/FundUnit,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-aeq/FinancialAsset
                     :fibo-sec-sec-pls/ManagedInvestment
                     {:owl/onProperty     :fibo-fnd-gao-obj/hasObjective,
                      :owl/someValuesFrom :fibo-fnd-gao-obj/InvestmentObjective,
                      :rdf/type           :owl/Restriction}
                     {:owl/hasValue   #xsd/boolean true,
                      :owl/onProperty :fibo-sec-fund-fund/isOpenEnded,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-fse/hasDateEstablished,
                      :owl/someValuesFrom :cmns-dt/ExplicitDate,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/PooledFund
                     {:owl/onProperty     :fibo-sec-fund-fund/isOpenEnded,
                      :owl/someValuesFrom :xsd/boolean,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-sec-fund-fund/hasLegalStructure,
                      :owl/someValuesFrom
                      :fibo-sec-fund-fund/LegalFundStructure,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "investment fund that pursues a total return and is usually open to qualified investors only@en"})

(def LegalFundStructure
  "structure of a fund with respect to its legal formation in some jurisdiction"
  {:db/ident :fibo-sec-fund-fund/LegalFundStructure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/"},
   :rdfs/label #xsd/langString "legal fund structure@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/isGovernedBy,
                      :owl/someValuesFrom :fibo-fnd-law-jur/Jurisdiction,
                      :rdf/type           :owl/Restriction}
                     {:owl/unionOf [:fibo-be-le-lp/LegalEntity
                                    :fibo-sec-fund-fund/FundContract],
                      :rdf/type    :owl/Class}
                     :fibo-fnd-law-lcap/LegalConstruct],
   :skos/definition
   #xsd/langString
    "structure of a fund with respect to its legal formation in some jurisdiction@en"})

(def MutualFund
  "open-end professionally managed investment fund established for the purpose of investing in securities such as stocks, bonds, money market instruments and similar assets"
  {:cmns-av/adaptedFrom
   #xsd/langString
    "ISO 10962:2019 Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth edition, October 2019@en",
   :cmns-av/synonym #xsd/langString "standard (vanilla) investment fund@en",
   :db/ident :fibo-sec-fund-fund/MutualFund,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/"},
   :rdfs/label #xsd/langString "mutual fund@en",
   :rdfs/subClassOf [:fibo-sec-fund-fund/OpenEndInvestment
                     :fibo-sec-fund-fund/CollectiveInvestmentVehicle
                     {:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-sec-fund-fund/FundUnit,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-aeq/FinancialAsset
                     :fibo-sec-sec-pls/ManagedInvestment
                     {:owl/onProperty     :fibo-fnd-gao-obj/hasObjective,
                      :owl/someValuesFrom :fibo-fnd-gao-obj/InvestmentObjective,
                      :rdf/type           :owl/Restriction}
                     {:owl/hasValue   #xsd/boolean true,
                      :owl/onProperty :fibo-sec-fund-fund/isOpenEnded,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-fse/hasDateEstablished,
                      :owl/someValuesFrom :cmns-dt/ExplicitDate,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/PooledFund
                     {:owl/onProperty     :fibo-sec-fund-fund/isOpenEnded,
                      :owl/someValuesFrom :xsd/boolean,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-sec-fund-fund/hasLegalStructure,
                      :owl/someValuesFrom
                      :fibo-sec-fund-fund/LegalFundStructure,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "open-end professionally managed investment fund established for the purpose of investing in securities such as stocks, bonds, money market instruments and similar assets@en"})

(def OpenEndInvestment
  "investment fund that offered through a fund company that sells shares directly to investors"
  {:cmns-av/synonym #xsd/langString "open-end fund@en",
   :db/ident :fibo-sec-fund-fund/OpenEndInvestment,
   :owl/disjointWith :fibo-sec-fund-fund/ClosedEndInvestment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/"},
   :rdfs/label #xsd/langString "open-end investment@en",
   :rdfs/subClassOf [{:owl/hasValue   #xsd/boolean true,
                      :owl/onProperty :fibo-sec-fund-fund/isOpenEnded,
                      :rdf/type       :owl/Restriction}
                     :fibo-sec-sec-pls/ManagedInvestment
                     :fibo-sec-fund-fund/CollectiveInvestmentVehicle
                     {:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-sec-fund-fund/FundUnit,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-aeq/FinancialAsset
                     {:owl/onProperty     :fibo-fnd-gao-obj/hasObjective,
                      :owl/someValuesFrom :fibo-fnd-gao-obj/InvestmentObjective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-fse/hasDateEstablished,
                      :owl/someValuesFrom :cmns-dt/ExplicitDate,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/PooledFund
                     {:owl/onProperty     :fibo-sec-fund-fund/isOpenEnded,
                      :owl/someValuesFrom :xsd/boolean,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-sec-fund-fund/hasLegalStructure,
                      :owl/someValuesFrom
                      :fibo-sec-fund-fund/LegalFundStructure,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "investment fund that offered through a fund company that sells shares directly to investors@en"})

(def PensionFund
  "investment fund run by a financial intermediary on behalf of an organization and its employees/members"
  {:cmns-av/abbreviation #xsd/langString "ETF@en",
   :cmns-av/adaptedFrom
   #xsd/langString
    "ISO 10962:2019 Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth edition, October 2019@en",
   :cmns-av/explanatoryNote
   #xsd/langString
    "A pension fund is a common asset pool meant to generate stable growth over a long-term investment horizon.@en",
   :db/ident :fibo-sec-fund-fund/PensionFund,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/"},
   :rdfs/label #xsd/langString "pension fund@en",
   :rdfs/subClassOf [:fibo-sec-sec-pls/ManagedInvestment
                     :fibo-sec-fund-fund/CollectiveInvestmentVehicle
                     {:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-sec-fund-fund/FundUnit,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-aeq/FinancialAsset
                     {:owl/onProperty     :fibo-fnd-gao-obj/hasObjective,
                      :owl/someValuesFrom :fibo-fnd-gao-obj/InvestmentObjective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-fse/hasDateEstablished,
                      :owl/someValuesFrom :cmns-dt/ExplicitDate,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/PooledFund
                     {:owl/onProperty     :fibo-sec-fund-fund/isOpenEnded,
                      :owl/someValuesFrom :xsd/boolean,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-sec-fund-fund/hasLegalStructure,
                      :owl/someValuesFrom
                      :fibo-sec-fund-fund/LegalFundStructure,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "investment fund run by a financial intermediary on behalf of an organization and its employees/members@en"})

(def PrivateEquityFund
  "investment fund used for making investments in various equity (and to a lesser extent debt) securities according to an investment strategy associated with private equity"
  {:cmns-av/abbreviation #xsd/langString "ETF@en",
   :cmns-av/adaptedFrom
   #xsd/langString
    "ISO 10962:2019 Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth edition, October 2019@en",
   :cmns-av/explanatoryNote
   #xsd/langString
    "Private equity funds are typically structured as limited partnerships or limited liability companies, wherein investors are limited partners, and the fund is managed by one or more general partners. It is composed of investors and funds that invest directly in private companies, or that engage in buyouts of public companies, resulting in the delisting of the public equity.@en",
   :db/ident :fibo-sec-fund-fund/PrivateEquityFund,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/"},
   :rdfs/label #xsd/langString "private equity fund@en",
   :rdfs/subClassOf [:fibo-sec-sec-pls/ManagedInvestment
                     :fibo-sec-fund-fund/CollectiveInvestmentVehicle
                     {:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-sec-fund-fund/FundUnit,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-aeq/FinancialAsset
                     {:owl/onProperty     :fibo-fnd-gao-obj/hasObjective,
                      :owl/someValuesFrom :fibo-fnd-gao-obj/InvestmentObjective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-fse/hasDateEstablished,
                      :owl/someValuesFrom :cmns-dt/ExplicitDate,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/PooledFund
                     {:owl/onProperty     :fibo-sec-fund-fund/isOpenEnded,
                      :owl/someValuesFrom :xsd/boolean,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-sec-fund-fund/hasLegalStructure,
                      :owl/someValuesFrom
                      :fibo-sec-fund-fund/LegalFundStructure,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "investment fund used for making investments in various equity (and to a lesser extent debt) securities according to an investment strategy associated with private equity@en"})

(def RealEstateInvestmentTrust
  "investment fund that offers shares/units to the public and invests in real estate directly"
  {:cmns-av/abbreviation #xsd/langString "REIT@en",
   :cmns-av/adaptedFrom
   #xsd/langString
    "ISO 10962:2019 Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth edition, October 2019@en",
   :cmns-av/explanatoryNote
   #xsd/langString
    "Real estate investment trusts own, and in most cases operate, income-producing real estate. REITs own many types of commercial real estate, ranging from office and apartment buildings to warehouses, hospitals, shopping centers, hotels and commercial forests. Some REITs engage in financing real estate.@en",
   :db/ident :fibo-sec-fund-fund/RealEstateInvestmentTrust,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/"},
   :rdfs/label #xsd/langString "real estate investment trust@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-fund-fund/hasLegalStructure,
                      :owl/someValuesFrom :fibo-be-tr-tr/Trust,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/ManagedInvestment
                     :fibo-sec-fund-fund/CollectiveInvestmentVehicle
                     {:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-sec-fund-fund/FundUnit,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-aeq/FinancialAsset
                     {:owl/onProperty     :fibo-fnd-gao-obj/hasObjective,
                      :owl/someValuesFrom :fibo-fnd-gao-obj/InvestmentObjective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-fse/hasDateEstablished,
                      :owl/someValuesFrom :cmns-dt/ExplicitDate,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/PooledFund
                     {:owl/onProperty     :fibo-sec-fund-fund/isOpenEnded,
                      :owl/someValuesFrom :xsd/boolean,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-sec-fund-fund/hasLegalStructure,
                      :owl/someValuesFrom
                      :fibo-sec-fund-fund/LegalFundStructure,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "investment fund that offers shares/units to the public and invests in real estate directly@en"})

(def SovereignWealthFund
  "state-owned investment fund that consists of pools of money derived from a country's reserves"
  {:cmns-av/explanatoryNote
   #xsd/langString
    "Sovereign wealth funds include the International Monetary Fund, whose corresponding legal entity is a polity.@en",
   :cmns-av/synonym [#xsd/langString "sovereign investment fund@en"
                     #xsd/langString "social wealth fund@en"],
   :db/ident :fibo-sec-fund-fund/SovereignWealthFund,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/"},
   :rdfs/label #xsd/langString "sovereign wealth fund@en",
   :rdfs/subClassOf [:fibo-sec-fund-fund/CollectiveInvestmentVehicle
                     {:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-sec-fund-fund/FundUnit,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-aeq/FinancialAsset
                     {:owl/onProperty     :fibo-fnd-gao-obj/hasObjective,
                      :owl/someValuesFrom :fibo-fnd-gao-obj/InvestmentObjective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-fse/hasDateEstablished,
                      :owl/someValuesFrom :cmns-dt/ExplicitDate,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/PooledFund
                     {:owl/onProperty :fibo-sec-fund-fund/hasLegalStructure,
                      :owl/someValuesFrom
                      :fibo-sec-fund-fund/LegalFundStructure,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "state-owned investment fund that consists of pools of money derived from a country's reserves@en"})

(def hasLegalStructure
  "indicates the legal form that the fund takes"
  {:db/ident :fibo-sec-fund-fund/hasLegalStructure,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-sec-pls/PooledFund,
   :rdfs/isDefinedBy
   {:rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/"},
   :rdfs/label #xsd/langString "has legal structure@en",
   :rdfs/range :fibo-sec-fund-fund/LegalFundStructure,
   :skos/definition #xsd/langString
                     "indicates the legal form that the fund takes@en"})

(def hasSubFund
  "relates a pooled fund to a sub-fund that is a constituent of the parent fund"
  {:db/ident :fibo-sec-fund-fund/hasSubFund,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-sec-pls/PooledFund,
   :rdfs/isDefinedBy
   {:rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/"},
   :rdfs/label #xsd/langString "has sub-fund@en",
   :rdfs/range :fibo-sec-sec-pls/PooledFund,
   :rdfs/subPropertyOf :cmns-col/hasPart,
   :skos/definition
   #xsd/langString
    "relates a pooled fund to a sub-fund that is a constituent of the parent fund@en"})

(def isOpenEnded
  "indicates whether the fund is an open-end/closed-end fund"
  {:db/ident :fibo-sec-fund-fund/isOpenEnded,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-sec-pls/PooledFund,
   :rdfs/isDefinedBy
   {:rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/"},
   :rdfs/label #xsd/langString "is open ended@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #xsd/langString
    "indicates whether the fund is an open-end/closed-end fund@en"})

(def isSubFundOf
  "relates a pooled fund to a parent fund"
  {:db/ident :fibo-sec-fund-fund/isSubFundOf,
   :owl/inverseOf :fibo-sec-fund-fund/hasSubFund,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-sec-pls/PooledFund,
   :rdfs/isDefinedBy
   {:rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/"},
   :rdfs/label #xsd/langString "is sub-fund of@en",
   :rdfs/range :fibo-sec-sec-pls/PooledFund,
   :rdfs/subPropertyOf :cmns-col/isPartOf,
   :skos/definition #xsd/langString
                     "relates a pooled fund to a parent fund@en"})