(ns net.wikipunk.rdf.fibo-sec-fund-civ
  "Reference data terms and non time dependent facts about funds and CIVs."
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/",
   :dcterms/abstract
   "Reference data terms and non time dependent facts about funds and CIVs.",
   :dcterms/license {:rdfa/uri "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/FunctionalEntities/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Organizations/Organizations/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/BusinessDates/"}
    {:rdfa/uri "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/AccountingEquity/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecurityAssets/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/Ownership/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/FormalBusinessOrganizations/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIdentification/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/Designators/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/OwnershipParties/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/Indicators/Indicators/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/ContextualDesignators/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/DatesAndTimes/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Ratings/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/ClientsAndAccounts/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Lifecycles/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesClassification/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Funds/Funds/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/Settlement/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/GoalsAndObjectives/Objectives/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/Classifiers/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/Collections/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/CorporateBodies/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/LegalCapacity/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesRestrictions/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIssuance/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/LegalCore/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Equities/EquityInstruments/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-fct-fct"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities/",
    "fibo-be-ge-euj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/",
    "fibo-be-le-cb"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-be-oac-opty"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fbc-fi-stl"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/",
    "fibo-fbc-pas-caa"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-arr-doc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
    "fibo-fnd-arr-lif"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
    "fibo-fnd-arr-rt"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/",
    "fibo-fnd-dt-bd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
    "fibo-fnd-law-cor"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCore/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
    "fibo-fnd-law-lcap"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/",
    "fibo-fnd-oac-own"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
    "fibo-fnd-org-org"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-alx"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-ind-ind"
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/",
    "fibo-sec-eq-eq"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
    "fibo-sec-fund-civ"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/",
    "fibo-sec-fund-fund"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/",
    "fibo-sec-sec-ast"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets/",
    "fibo-sec-sec-cls"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification/",
    "fibo-sec-sec-iss"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/",
    "fibo-sec-sec-rst"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-fund-civ",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/",
   :rdfs/label #xsd/langString "Collective Investment Vehicles Ontology@en"}
  (:refer-clojure :exclude [name]))

(def AccumulatingShareClass
  "A share class in which there is no option to reinvest."
  {:cmns-av/explanatoryNote
   #xsd/langString
    "This fact would be determined by the fund unit having a specific Fund Distribution Policy of Accumulating.@en",
   :db/ident :fibo-sec-fund-civ/AccumulatingShareClass,
   :owl/disjointWith :fibo-sec-fund-civ/DistributingShareClass,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "accumulating share class@en",
   :rdfs/subClassOf
   [:fibo-sec-fund-civ/FundShareClassUnit
    {:owl/onProperty     :fibo-sec-fund-civ/hasDetails,
     :owl/someValuesFrom :fibo-sec-fund-civ/NetAssetValueCalculationMethod,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasFundProcessingTerms,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundProcessingGeneralTerms,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasFundProcessingTerms,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundRedemptionTerms,
     :rdf/type           :owl/Restriction}
    :fibo-sec-fund-fund/FundUnit
    {:owl/onProperty     :fibo-sec-fund-civ/hasDistributionPolicy,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundUnitDistributionPolicy,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #xsd/langString "A share class in which there is no option to reinvest.@en"})

(def AnnualReportingPolicy
  "Reports are presented once a year"
  {:db/ident :fibo-sec-fund-civ/AnnualReportingPolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "annual reporting policy@en",
   :rdfs/subClassOf [:fibo-sec-fund-civ/ReportingFrequencyPolicy
                     :fibo-fnd-law-lcap/ReportingPolicy],
   :skos/definition #xsd/langString "Reports are presented once a year@en"})

(def AnnualizedPerformanceDeterminationMethod
  "Annualized performance determination."
  {:db/ident :fibo-sec-fund-civ/AnnualizedPerformanceDeterminationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "annualized performance determination method@en",
   :rdfs/subClassOf [:fibo-sec-fund-civ/PerformanceDeterminationMethod
                     :fibo-fnd-gao-obj/Strategy],
   :skos/definition #xsd/langString "Annualized performance determination.@en"})

(def AssetClassStrategy
  "Strategy which is asset class based."
  {:cmns-av/explanatoryNote
   #xsd/langString
    "EFAMA: The type of securities or other holdings that may be invested in. FIBIM: Strategy which is asset class based. Can implement this in terms of a classification of those things. Wording implies this is a policy.@en",
   :db/ident :fibo-sec-fund-civ/AssetClassStrategy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "asset class strategy@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-fund-civ/identifiesAssetTypesBy,
                      :owl/someValuesFrom
                      :fibo-sec-sec-cls/FinancialInstrumentClassifier,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-fund-civ/FundPortfolioInvestmentLimitations
                     :fibo-sec-fund-civ/InvestmentRestriction
                     {:owl/onProperty     :cmns-col/isPartOf,
                      :owl/someValuesFrom :fibo-sec-fund-civ/FundProspectus,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-rst/SecuritiesRestriction],
   :skos/definition #xsd/langString "Strategy which is asset class based.@en"})

(def BricksAndMortarHolding
  "A holding of built property."
  {:db/ident :fibo-sec-fund-civ/BricksAndMortarHolding,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "bricks and mortar holding@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-fund-civ/takesFormOf,
                      :owl/someValuesFrom :fibo-fnd-plc-loc/RealEstate,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-ast/PortfolioHolding],
   :skos/definition #xsd/langString "A holding of built property.@en"})

(def CommonShareInFund
  "A share unit in a fund, which is classified as a Common Share class."
  {:cmns-av/explanatoryNote
   #xsd/langString
    "SR Review session notes: US: Closed and open ended funds may have common and preferred shares.@en",
   :db/ident :fibo-sec-fund-civ/CommonShareInFund,
   :owl/disjointWith :fibo-sec-fund-civ/PreferredShareInFund,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "common share in fund@en",
   :rdfs/subClassOf
   [:fibo-sec-fund-civ/FundShareClassUnit
    {:owl/onProperty     :fibo-sec-fund-civ/hasDetails,
     :owl/someValuesFrom :fibo-sec-fund-civ/NetAssetValueCalculationMethod,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasFundProcessingTerms,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundProcessingGeneralTerms,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasFundProcessingTerms,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundRedemptionTerms,
     :rdf/type           :owl/Restriction}
    :fibo-sec-fund-fund/FundUnit
    {:owl/onProperty     :fibo-sec-fund-civ/hasDistributionPolicy,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundUnitDistributionPolicy,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "A share unit in a fund, which is classified as a Common Share class.@en"})

(def CurrencyStrategy
  "Strategy which is currency based."
  {:db/ident :fibo-sec-fund-civ/CurrencyStrategy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "currency strategy@en",
   :rdfs/subClassOf [:fibo-sec-fund-civ/FundPortfolioInvestmentLimitations
                     :fibo-sec-fund-civ/InvestmentRestriction
                     {:owl/onProperty     :cmns-col/isPartOf,
                      :owl/someValuesFrom :fibo-sec-fund-civ/FundProspectus,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-rst/SecuritiesRestriction],
   :skos/definition #xsd/langString "Strategy which is currency based.@en"})

(def DebtStakeInFund
  "A stake held in a fund by way of a Bond Unit."
  {:cmns-av/explanatoryNote
   #xsd/langString
    "Note that you cannot buy fractional amounts in a bond. Review Session Note: Similar to what happens in a CDO where the collaterial manager and the issuer are two different entities. So model this along the same lines as the SPV in the structured finance model. Therefore: further modeling and review required@en",
   :db/ident :fibo-sec-fund-civ/DebtStakeInFund,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "debt stake in fund@en",
   :rdfs/subClassOf [:fibo-sec-fund-civ/StakeInFund
                     :fibo-fbc-pas-fpas/Position
                     {:owl/onProperty :fibo-sec-fund-civ/givesOwnershipOf,
                      :owl/someValuesFrom
                      :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-fund-civ/identifiedAs.5,
                      :owl/someValuesFrom :fibo-sec-fund-fund/FundUnit,
                      :rdf/type           :owl/Restriction}],
   :skos/definition #xsd/langString
                     "A stake held in a fund by way of a Bond Unit.@en"})

(def DistributingShareClass
  "distributing share class"
  {:db/ident :fibo-sec-fund-civ/DistributingShareClass,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "distributing share class@en",
   :rdfs/subClassOf
   [:fibo-sec-fund-civ/FundShareClassUnit
    {:owl/onProperty     :fibo-sec-fund-civ/hasDetails,
     :owl/someValuesFrom :fibo-sec-fund-civ/NetAssetValueCalculationMethod,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasFundProcessingTerms,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundProcessingGeneralTerms,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasFundProcessingTerms,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundRedemptionTerms,
     :rdf/type           :owl/Restriction}
    :fibo-sec-fund-fund/FundUnit
    {:owl/onProperty     :fibo-sec-fund-civ/hasDistributionPolicy,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundUnitDistributionPolicy,
     :rdf/type           :owl/Restriction}]})

(def EquityAsset
  "The holding of equity securities in a portfolio."
  {:db/ident :fibo-sec-fund-civ/EquityAsset,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "equity asset@en",
   :rdfs/subClassOf [{:owl/allValuesFrom :fibo-sec-eq-eq/Share,
                      :owl/onProperty    :fibo-fnd-rel-rel/hasIdentity,
                      :rdf/type          :owl/Restriction}
                     :fibo-sec-sec-ast/PortfolioHolding],
   :skos/definition #xsd/langString
                     "The holding of equity securities in a portfolio.@en"})

(def EquityFund
  "A fund which invests in at least 85% shares."
  {:db/ident :fibo-sec-fund-civ/EquityFund,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "equity fund@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-col/comprises,
     :owl/someValuesFrom :fibo-sec-fund-civ/EquityPortfolio,
     :rdf/type           :owl/Restriction}
    :fibo-sec-fund-fund/CollectiveInvestmentVehicle
    {:owl/onProperty     :fibo-sec-fund-civ/hasTransferAgent,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundTransferAgent,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasFundPolicy,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundInvestmentPolicy,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasAccountingInformation,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundReportingTerms,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/distributedBy,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundDistributor,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/fundHasRelatedParty,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundsProcessingParty,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasSubscriptionTerms,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundSubscriptionTerms,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/describedIn,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundProspectus,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasAccountant,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundAccountant,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasDataProvider,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundDataProvider,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasDepository,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundDepositary,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasAdditionalInformation,
     :owl/someValuesFrom :fibo-sec-fund-civ/OtherInvestmentFundInformation,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/administeredBy,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundAdministrator,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasRelatedFundTerms,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundProcessingTerms,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/advisedBy,
     :owl/someValuesFrom :fibo-sec-fund-civ/InvestmentAdvisor,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/legallyRecordedIn,
     :owl/someValuesFrom :fibo-fnd-law-jur/Jurisdiction,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/promotedBy,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundPromoter,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasDistributionPolicy.1,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundUnitDistributionMethod,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasManagementCompany,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundManager,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasUnitIssuer,
     :owl/someValuesFrom :fibo-sec-fund-civ/UnitIssuer,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasPerformanceDeterminationMethod,
     :owl/someValuesFrom :fibo-sec-fund-civ/PerformanceDeterminationMethod,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/supervisedBy,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundSupervisoryAuthority,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasAuditor,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundAuditor,
     :rdf/type           :owl/Restriction}],
   :skos/definition #xsd/langString
                     "A fund which invests in at least 85% shares.@en"})

(def EquityPortfolio
  "A portfolio which has at least 85% exposure to shares."
  {:db/ident :fibo-sec-fund-civ/EquityPortfolio,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "equity portfolio@en",
   :rdfs/subClassOf
   [:fibo-sec-fund-civ/FundPortfolio
    {:owl/onProperty     :fibo-fnd-rel-rel/isManagedBy,
     :owl/someValuesFrom :fibo-sec-fund-civ/PortfolioManager,
     :rdf/type           :owl/Restriction}
    :fibo-sec-sec-ast/Portfolio
    {:owl/onProperty     :fibo-sec-fund-civ/hasLiquidity,
     :owl/someValuesFrom :fibo-sec-fund-civ/Liquidity,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-acc-cur/hasMonetaryAmount,
     :owl/someValuesFrom :fibo-fbc-pas-caa/Balance,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/assessedAgainst,
     :owl/someValuesFrom :fibo-sec-fund-civ/PortfolioBenchmark,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-col/hasConstituent,
     :owl/someValuesFrom :fibo-sec-sec-ast/PortfolioHolding,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasInvestmentStrategy,
     :owl/someValuesFrom :fibo-sec-fund-civ/PortfolioInvestmentStrategy,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/implementsFundPolicy,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundPortfolioInvestmentPolicy,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #xsd/langString "A portfolio which has at least 85% exposure to shares.@en"})

(def EquityStakeInFund
  "A stake held in a fund by way of a Share Class Unit."
  {:cmns-av/explanatoryNote
   #xsd/langString
    "Theoretically you can buy a fraction of a share in a fund. This would depend on the legal structure of the fund, e.g. a minimum investment. There is always a distribution plan.@en",
   :db/ident :fibo-sec-fund-civ/EquityStakeInFund,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "equity stake in fund@en",
   :rdfs/subClassOf [:fibo-sec-fund-civ/StakeInFund
                     :fibo-fbc-pas-fpas/Position
                     {:owl/onProperty :fibo-sec-fund-civ/givesOwnershipOf,
                      :owl/someValuesFrom
                      :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-fund-civ/identifiedAs.5,
                      :owl/someValuesFrom :fibo-sec-fund-fund/FundUnit,
                      :rdf/type           :owl/Restriction}],
   :skos/definition #xsd/langString
                     "A stake held in a fund by way of a Share Class Unit.@en"})

(def FCP
  "A French fund vehicle type. Designation and definition needed."
  {:db/ident :fibo-sec-fund-civ/FCP,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "f c p@en",
   :rdfs/subClassOf :fibo-be-fct-fct/FunctionalBusinessEntity,
   :skos/definition
   #xsd/langString
    "A French fund vehicle type. Designation and definition needed.@en"})

(def FundAccountant
  "The party that keeps accounting records of the available assets and liabilities of the Fund. It calculates dealing prices, the Net Asset Value (NAV) of the Fund, and may provide fund performance and tax data. Can be subcontracted by the FundAdministrator."
  {:db/ident :fibo-sec-fund-civ/FundAccountant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund accountant@en",
   :rdfs/subClassOf [:fibo-sec-fund-civ/FundsProcessingParty
                     :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition
   #xsd/langString
    "The party that keeps accounting records of the available assets and liabilities of the Fund. It calculates dealing prices, the Net Asset Value (NAV) of the Fund, and may provide fund performance and tax data. Can be subcontracted by the FundAdministrator.@en"})

(def FundAdministrator
  "Entity that has to fulfil the legal and supervisory requirements of the fund. Responsible for all the business purposes around the investment pool, and so is reponsible for the issuing of the shares."
  {:cmns-av/explanatoryNote
   #xsd/langString
    "If the unit is a bond, then the issuer is separate from the Fund Administrator. WG11 text: The party in charge of financial accounting, NAV calculation, management and performance fee calculation. Can also be in charge of orders centralisation and registration. Definition origin:EFAMA DD@en",
   :db/ident :fibo-sec-fund-civ/FundAdministrator,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund administrator@en",
   :rdfs/subClassOf [{:owl/onProperty
                      :fibo-sec-fund-civ/processingPartyHasIdentity,
                      :owl/someValuesFrom :fibo-be-le-lp/LegalEntity,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-fund-civ/mayAlsoBe,
                      :owl/someValuesFrom :fibo-sec-fund-civ/UnitIssuer,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-fund-civ/FundsProcessingParty
                     :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition
   #xsd/langString
    "Entity that has to fulfil the legal and supervisory requirements of the fund. Responsible for all the business purposes around the investment pool, and so is reponsible for the issuing of the shares.@en"})

(def FundAuditor
  "The party that is in charge of examining and verifying a fund's financial and accounting records as well as supporting documents and fulfilment of legal requirements. Definition origin:EFAMA DD"
  {:db/ident :fibo-sec-fund-civ/FundAuditor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund auditor@en",
   :rdfs/subClassOf [:fibo-sec-fund-civ/FundsProcessingParty
                     :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition
   #xsd/langString
    "The party that is in charge of examining and verifying a fund's financial and accounting records as well as supporting documents and fulfilment of legal requirements. Definition origin:EFAMA DD@en"})

(def FundBondClassUnit
  "A fund unit which takes the form of debt in that fund."
  {:cmns-av/explanatoryNote
   #xsd/langString
    "From EFAMA Review: called denominations e.g. issued in $5000 pieces. You cannot buy fractional amounts in a bond.@en",
   :db/ident :fibo-sec-fund-civ/FundBondClassUnit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund bond class unit@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-sec-fund-civ/hasExpectedCoupon,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundBondUnitCoupon,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasDistributiojnPolicy,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundUnitDistributionPolicy,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-agr-ctr/definesTermsFor,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundDebt,
     :rdf/type           :owl/Restriction}
    :fibo-sec-fund-fund/FundUnit
    {:owl/onProperty     :fibo-sec-fund-civ/hasDetails,
     :owl/someValuesFrom :fibo-sec-fund-civ/NetAssetValueCalculationMethod,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasFundProcessingTerms,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundProcessingGeneralTerms,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasFundProcessingTerms,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundRedemptionTerms,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #xsd/langString "A fund unit which takes the form of debt in that fund.@en"})

(def FundBondUnitCoupon
  "A fixed coupon paid out to holders of the Fund Bond Unit."
  {:db/ident :fibo-sec-fund-civ/FundBondUnitCoupon,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund bond unit coupon@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-fund-civ/hasPolicyTerms,
                      :owl/someValuesFrom :fibo-sec-fund-civ/FundCouponPolicy,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-cur/InterestRate],
   :skos/definition
   #xsd/langString
    "A fixed coupon paid out to holders of the Fund Bond Unit.@en"})

(def FundCashDistributionPolicy
  "Policy for distribution of cash dividends or notes in the event that the fund units have a distribution policy of \"Cash\" rather than \"Reinvestment\"."
  {:db/ident :fibo-sec-fund-civ/FundCashDistributionPolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund cash distribution policy@en",
   :rdfs/subClassOf
   [:fibo-sec-fund-civ/FundUnitDistributionPolicy
    :fibo-fnd-law-lcap/Policy
    {:owl/onProperty     :fibo-sec-fund-civ/hasDistributionPolicy.2,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundUnitDistributionMethod,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "Policy for distribution of cash dividends or notes in the event that the fund units have a distribution policy of \"Cash\" rather than \"Reinvestment\".@en"})

(def FundClassification
  "The category of the fund according to the asset class. This is a published code by which the Fund is classified. Further notes: Could be EFCF codes. This is the way in which \"Type of fund\" is articulated."
  {:db/ident :fibo-sec-fund-civ/FundClassification,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund classification@en",
   :rdfs/subClassOf [{:owl/onProperty :cmns-cls/classifies,
                      :owl/someValuesFrom
                      :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
                      :rdf/type :owl/Restriction}
                     :cmns-cls/Classifier],
   :skos/definition
   #xsd/langString
    "The category of the fund according to the asset class. This is a published code by which the Fund is classified. Further notes: Could be EFCF codes. This is the way in which \"Type of fund\" is articulated.@en"})

(def FundClassificationScheme
  "A published scheme for the category of a fund according to the asset class."
  {:db/ident :fibo-sec-fund-civ/FundClassificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund classification scheme@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-dsg/defines,
                      :owl/someValuesFrom :fibo-sec-fund-civ/FundClassification,
                      :rdf/type           :owl/Restriction}
                     :cmns-cls/ClassificationScheme],
   :skos/definition
   #xsd/langString
    "A published scheme for the category of a fund according to the asset class.@en"})

(def FundCouponPolicy
  "Terms for the expected distribution of bond unit coupons."
  {:db/ident :fibo-sec-fund-civ/FundCouponPolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund coupon policy@en",
   :rdfs/subClassOf
   [:fibo-sec-fund-civ/FundCashDistributionPolicy
    :fibo-fnd-law-lcap/Policy
    :fibo-sec-fund-civ/FundUnitDistributionPolicy
    {:owl/onProperty     :fibo-sec-fund-civ/hasDistributionPolicy.2,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundUnitDistributionMethod,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "Terms for the expected distribution of bond unit coupons.@en"})

(def FundDataProvider
  "A party which supplies market data to a fund."
  {:db/ident :fibo-sec-fund-civ/FundDataProvider,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund data provider@en",
   :rdfs/subClassOf [{:owl/onProperty
                      :fibo-sec-fund-civ/processingPartyHasIdentity,
                      :owl/someValuesFrom :fibo-be-le-lp/LegalEntity,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-fund-civ/FundsProcessingParty
                     :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition #xsd/langString
                     "A party which supplies market data to a fund.@en"})

(def FundDebt
  "Debt issued by a Fund."
  {:cmns-av/explanatoryNote
   #xsd/langString
    "This would normally be held by participants in that pool. in this case the pool is a fund which is formed by each of the participants extending credit to that pool and holding bond units in the pool representing that debt.@en",
   :db/ident :fibo-sec-fund-civ/FundDebt,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund debt@en",
   :rdfs/subClassOf :fibo-fbc-dae-dbt/Debt,
   :skos/definition #xsd/langString "Debt issued by a Fund.@en"})

(def FundDepositary
  "The party that holds and safeguards holdings owned by a fund. It is also responsible for compliance of the portfolio with legal ratios etc."
  {:cmns-av/explanatoryNote
   #xsd/langString
    "The depository may delegate custody to another entity (custodian). Definition origin:EFAMA DD@en",
   :db/ident :fibo-sec-fund-civ/FundDepositary,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund depositary@en",
   :rdfs/subClassOf [{:owl/onProperty
                      :fibo-sec-fund-civ/providesDepositaryServiceFor,
                      :owl/someValuesFrom :fibo-sec-fund-fund/FundUnit,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-fund-civ/FundsProcessingParty
                     :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition
   #xsd/langString
    "The party that holds and safeguards holdings owned by a fund. It is also responsible for compliance of the portfolio with legal ratios etc.@en"})

(def FundDistributionPolicy
  "policy indicating the overall strategy or limitations on distribution for the fund"
  {:cmns-av/explanatoryNote
   #xsd/langString
    "Note that individual classes of Fund Unit also have specific distribution polcies as they effect that class of unit. This class is for terms with wording of the form: \" ... whether or not it is possible to hold shares ...\" for a given parameter.@en",
   :db/ident :fibo-sec-fund-civ/FundDistributionPolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund distribution policy@en",
   :rdfs/subClassOf :fibo-fnd-law-lcap/Policy,
   :skos/definition
   #xsd/langString
    "policy indicating the overall strategy or limitations on distribution for the fund@en"})

(def FundDistributor
  "an entity through which a fund may be bought by or for an investor. This may be on a discretionary or advisory basis, or as an execution-only service. Definition origin:EFAMA DD"
  {:db/ident :fibo-sec-fund-civ/FundDistributor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund distributor@en",
   :rdfs/subClassOf [:fibo-sec-fund-civ/FundsProcessingParty
                     :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition
   #xsd/langString
    "an entity through which a fund may be bought by or for an investor. This may be on a discretionary or advisory basis, or as an execution-only service. Definition origin:EFAMA DD@en"})

(def FundDividendPolicy
  "Terms for the expected distributions of dividends."
  {:db/ident :fibo-sec-fund-civ/FundDividendPolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund dividend policy@en",
   :rdfs/subClassOf
   [:fibo-sec-fund-civ/FundCashDistributionPolicy
    :fibo-fnd-law-lcap/Policy
    :fibo-sec-fund-civ/FundUnitDistributionPolicy
    {:owl/onProperty     :fibo-sec-fund-civ/hasDistributionPolicy.2,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundUnitDistributionMethod,
     :rdf/type           :owl/Restriction}],
   :skos/definition #xsd/langString
                     "Terms for the expected distributions of dividends.@en"})

(def FundInvestmentObjective
  "The aim of a Fund e.g outperfom a given benchmark."
  {:db/ident :fibo-sec-fund-civ/FundInvestmentObjective,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund investment objective@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-fund-civ/statedIn,
                      :owl/someValuesFrom :fibo-sec-fund-civ/FundProspectus,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-sec-fund-civ/hasIntendedRiskLevel,
                      :owl/someValuesFrom :fibo-sec-fund-civ/RiskLevel,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-gao-obj/InvestmentObjective],
   :skos/definition #xsd/langString
                     "The aim of a Fund e.g outperfom a given benchmark.@en",
   :skos/editorialNote
   #xsd/langString
    "This could be broken down into other terms that can be itemised here, that are not in the EFAMA DD explicitly. Examples may include: - Risk level - Return - Exposure to different markets@en"})

(def FundInvestmentPolicy
  "policy that the fund implements in order to achieve the stated fund objectives"
  {:cmns-av/explanatoryNote
   #xsd/langString
    "EFAMA Note: Model distinguishes between strategy (what you intend to invest in) and portfolio structure (what is held). This semantics matches the EFAMA DD \"Fund Investment Policy\" No stated definition in EFAMA DD (\"Further discussion required\").@en",
   :db/ident :fibo-sec-fund-civ/FundInvestmentPolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund investment policy@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-dsg/defines,
     :owl/someValuesFrom :fibo-sec-fund-civ/InvestmentRestriction,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/governs,
     :owl/someValuesFrom :fibo-sec-fund-civ/PortfolioInvestmentStrategy,
     :rdf/type           :owl/Restriction}
    {:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
     :owl/onClass    :fibo-ind-ind-ind/MarketRate,
     :owl/onProperty :fibo-sec-fund-civ/stipulatesBenchmark,
     :rdf/type       :owl/Restriction}
    :fibo-fnd-law-lcap/Policy],
   :skos/definition
   #xsd/langString
    "policy that the fund implements in order to achieve the stated fund objectives@en"})

(def FundLegalFormDocumentation
  "For a fund which is constituted under the law of contract, the constitution or articles that define the fund. These are embodied in a Contract."
  {:cmns-av/explanatoryNote
   #xsd/langString
    "From ISO FIBIM \"Umbrella Fund\" narrative: In securities, a collective investment scheme that has a contractual or a corporate form. When it has a contractual form, a fund is constituted under either the law of contract or under the trust law and thus it is not a legal entity. In its corporate form, a fund is a legal entity and is structured as a company.@en",
   :db/ident :fibo-sec-fund-civ/FundLegalFormDocumentation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund legal form documentation@en",
   :rdfs/subClassOf :fibo-fnd-law-cor/Constitution,
   :skos/definition
   #xsd/langString
    "For a fund which is constituted under the law of contract, the constitution or articles that define the fund. These are embodied in a Contract.@en"})

(def FundManagementCompany
  "The party that sets up the fund, decides the investment strategy, appoints the agents, and is responsible for the promotion and the marketing of the fund. It makes all of the important decisions related to the fund. Also called fund promotor or fund sponsor or fund manager."
  {:cmns-av/explanatoryNote
   #xsd/langString
    "In the US: operates on a percentage of the Portfolio assets under management.@en",
   :db/ident :fibo-sec-fund-civ/FundManagementCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund management company@en",
   :rdfs/subClassOf :fibo-be-le-lp/LegalEntity,
   :skos/definition
   #xsd/langString
    "The party that sets up the fund, decides the investment strategy, appoints the agents, and is responsible for the promotion and the marketing of the fund. It makes all of the important decisions related to the fund. Also called fund promotor or fund sponsor or fund manager.@en"})

(def FundManager
  "The party that sets up the fund, decides the investment strategy, appoints the agents, and is responsible for the promotion and the marketing of the fund. It makes all of the important decisions related to the fund. Also called fund promotor or fund sponsor. This is a dupliucate of Fund Management Company at the moment"
  {:db/ident :fibo-sec-fund-civ/FundManager,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund manager@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-sec-fund-civ/processingPartyHasIdentity,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundManagementCompany,
     :rdf/type           :owl/Restriction}
    :fibo-sec-fund-civ/FundsProcessingParty
    :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition
   #xsd/langString
    "The party that sets up the fund, decides the investment strategy, appoints the agents, and is responsible for the promotion and the marketing of the fund. It makes all of the important decisions related to the fund. Also called fund promotor or fund sponsor. This is a dupliucate of Fund Management Company at the moment@en"})

(def FundOrderDesk
  "The Fund Order Desk is a party to the Fund Order Desk Account."
  {:db/ident :fibo-sec-fund-civ/FundOrderDesk,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund order desk@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-fund-civ/providerHasIdentity,
                      :owl/someValuesFrom :fibo-be-le-lp/LegalEntity,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-pas-caa/AccountProvider],
   :skos/definition
   #xsd/langString
    "The Fund Order Desk is a party to the Fund Order Desk Account.@en",
   :skos/editorialNote
   #xsd/langString
    "This party would presumably be identified as the Fund Management Company in terms of what legal entity fulcils this role? to be determined at further review.@en"})

(def FundOrderDeskPhysicalFormDocument
  "A phsyical form obtained through the main fund order desk."
  {:db/ident :fibo-sec-fund-civ/FundOrderDeskPhysicalFormDocument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund order desk physical form document@en",
   :rdfs/subClassOf :fibo-fnd-arr-doc/Document,
   :skos/definition
   #xsd/langString
    "A phsyical form obtained through the main fund order desk.@en"})

(def FundPortfolio
  "An account containing a number of financial instruments along with cash positions in one or more currencies and belonging to a Fund"
  {:db/ident :fibo-sec-fund-civ/FundPortfolio,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund portfolio@en",
   :rdfs/subClassOf
   [:fibo-sec-sec-ast/Portfolio
    {:owl/onProperty     :fibo-sec-fund-civ/hasLiquidity,
     :owl/someValuesFrom :fibo-sec-fund-civ/Liquidity,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-acc-cur/hasMonetaryAmount,
     :owl/someValuesFrom :fibo-fbc-pas-caa/Balance,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasInvestmentStrategy,
     :owl/someValuesFrom :fibo-sec-fund-civ/PortfolioInvestmentStrategy,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-col/hasConstituent,
     :owl/someValuesFrom :fibo-sec-sec-ast/PortfolioHolding,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/implementsFundPolicy,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundPortfolioInvestmentPolicy,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/isManagedBy,
     :owl/someValuesFrom :fibo-sec-fund-civ/PortfolioManager,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/assessedAgainst,
     :owl/someValuesFrom :fibo-sec-fund-civ/PortfolioBenchmark,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "An account containing a number of financial instruments along with cash positions in one or more currencies and belonging to a Fund@en"})

(def FundPortfolioInvestmentLimitations
  "Detailed Policy on approximately how the portfolio is to be allocated to achieve the stated investment goals. This underpins the detailed strategy of how to achieve this."
  {:cmns-av/explanatoryNote
   #xsd/langString
    "Defined as \"Strategy\" in FIBIM and elsewhere. WG11: Rough allocation of the portfolio.@en",
   :db/ident :fibo-sec-fund-civ/FundPortfolioInvestmentLimitations,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund portfolio investment limitations@en",
   :rdfs/subClassOf [:fibo-sec-fund-civ/InvestmentRestriction
                     {:owl/onProperty     :cmns-col/isPartOf,
                      :owl/someValuesFrom :fibo-sec-fund-civ/FundProspectus,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-rst/SecuritiesRestriction],
   :skos/definition
   #xsd/langString
    "Detailed Policy on approximately how the portfolio is to be allocated to achieve the stated investment goals. This underpins the detailed strategy of how to achieve this.@en"})

(def FundPortfolioInvestmentPolicy
  "policy with respect to allocation of the portfolio that is designed to meet the stated investment strategy and goals"
  {:cmns-av/explanatoryNote #xsd/langString
                             "ISO FIBIM: Rough allocation of the portfolio.@en",
   :db/ident :fibo-sec-fund-civ/FundPortfolioInvestmentPolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund portfolio investment policy@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-sec-fund-civ/definesAllocations,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundPortfolioInvestmentLimitations,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/governs,
     :owl/someValuesFrom :fibo-sec-fund-civ/PortfolioInvestmentStrategy,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-law-lcap/Policy],
   :skos/definition
   #xsd/langString
    "policy with respect to allocation of the portfolio that is designed to meet the stated investment strategy and goals@en"})

(def FundProcessingForm
  "The form of documentation or control mechanism required for some funds processing activity."
  {:cmns-av/explanatoryNote
   #xsd/langString
    "Equates to the \"Physical Form\" in SIO FIBIM for certain activities in funds processing. May or may not be a written physical document. ISO FIBIM Definition: Specifies whether a physical form is required.@en",
   :db/ident :fibo-sec-fund-civ/FundProcessingForm,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund processing form@en",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onClass
                      :fibo-sec-fund-civ/FundOrderDeskPhysicalFormDocument,
                      :owl/onProperty :fibo-sec-fund-civ/mayBe.1,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-arr-doc/Document],
   :skos/definition
   #xsd/langString
    "The form of documentation or control mechanism required for some funds processing activity.@en"})

(def FundProcessingGeneralTerms
  "Formal terms for general processing of the fund. These set out what the investor and the fund may or may not do."
  {:db/ident :fibo-sec-fund-civ/FundProcessingGeneralTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund processing general terms@en",
   :rdfs/subClassOf
   [:fibo-sec-fund-civ/FundProcessingTerms
    {:owl/onProperty     :fibo-sec-fund-civ/definesMainFundOrderDeskAccount,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundsProcessingAccount,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasDefaultSettlementConvention,
     :owl/someValuesFrom :fibo-fbc-fi-stl/SettlementConvention,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-agr-ctr/ContractualCommitment],
   :skos/definition
   #xsd/langString
    "Formal terms for general processing of the fund. These set out what the investor and the fund may or may not do.@en"})

(def FundProcessingTerms
  "Formal terms for processing of the fund. These set out what the investor and the fund may or may not do. These include terms for redemption and subscription processing as well as general processing terms. ISO FIBIM definition: Processing characteristics linked to the instrument, ie, not to the market."
  {:cmns-av/explanatoryNote
   #xsd/langString
    "These include Fund Subscription Terms, Fund Redemption Terms. and terms which relate to general processing and restrictions or otherwise on the holder. FPP notes: FPP presentation identifies many of these terms under the heading of Valuation Dealing characteristics. May need to revise which goes where in line with FPP. See also terms under NAV Valuation Calculation Method. Others of these terms appear in FPP under Instrument Restrictions. These cover the subscription, redemption and holding amounts and units and minimum holding period.@en",
   :db/ident :fibo-sec-fund-civ/FundProcessingTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund processing terms@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-sec-fund-civ/hasDefaultSettlementConvention,
     :owl/someValuesFrom :fibo-fbc-fi-stl/SettlementConvention,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/definesMainFundOrderDeskAccount,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundsProcessingAccount,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-agr-ctr/ContractualCommitment],
   :skos/definition
   #xsd/langString
    "Formal terms for processing of the fund. These set out what the investor and the fund may or may not do. These include terms for redemption and subscription processing as well as general processing terms. ISO FIBIM definition: Processing characteristics linked to the instrument, ie, not to the market.@en"})

(def FundPromoter
  "An entity that promotes a fund. May be an investor, pension fund, bank, insurance company or management company"
  {:db/ident :fibo-sec-fund-civ/FundPromoter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund promoter@en",
   :rdfs/subClassOf [:fibo-sec-fund-civ/FundsProcessingParty
                     :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition
   #xsd/langString
    "An entity that promotes a fund. May be an investor, pension fund, bank, insurance company or management company@en"})

(def FundProspectus
  "The Prospectus for the Fund. This is a document made available publicly for potential investors. It will include facts about the fund investment objective, investment focus and other details of the fund. Some of this information becomes binding on the fund once it is issued, while other information is guidelines only."
  {:db/ident :fibo-sec-fund-civ/FundProspectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund prospectus@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-fund-civ/outlines,
                      :owl/someValuesFrom
                      :fibo-sec-fund-civ/FundInvestmentObjective,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-fund-civ/anticipates,
                      :owl/someValuesFrom :fibo-ind-ind-ind/MarketRate,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-iss/Prospectus],
   :skos/definition
   #xsd/langString
    "The Prospectus for the Fund. This is a document made available publicly for potential investors. It will include facts about the fund investment objective, investment focus and other details of the fund. Some of this information becomes binding on the fund once it is issued, while other information is guidelines only.@en",
   :skos/editorialNote
   #xsd/langString
    "EFAMA Review description for this: The fund is issued with a prospectus; there is material in the prospectus that is binding; material that is expected but not binding, and information that may or may not be in the prospectus or a given fund.@en"})

(def FundRedemptionRestriction
  "fund redemption restriction"
  {:db/ident :fibo-sec-fund-civ/FundRedemptionRestriction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund redemption restriction@en",
   :rdfs/subClassOf :fibo-sec-sec-rst/SecuritiesRestriction})

(def FundRedemptionTerms
  "Formal terms for redemption of units in the fund. These set out what the investor and the fund may or may not do."
  {:db/ident :fibo-sec-fund-civ/FundRedemptionTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund redemption terms@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-sec-fund-civ/hasAdditionalRedemptionRestrictions,
     :owl/someValuesFrom :fibo-sec-fund-civ/ReferToFundOrderDesk,
     :rdf/type           :owl/Restriction}
    :fibo-sec-fund-civ/FundProcessingTerms
    {:owl/onProperty     :fibo-sec-fund-civ/definesMainFundOrderDeskAccount,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundsProcessingAccount,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasDefaultSettlementConvention,
     :owl/someValuesFrom :fibo-fbc-fi-stl/SettlementConvention,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-agr-ctr/ContractualCommitment],
   :skos/definition
   #xsd/langString
    "Formal terms for redemption of units in the fund. These set out what the investor and the fund may or may not do.@en"})

(def FundReinvestmentPolicy
  "Terms for the expected reinvestment of profits on fund units."
  {:db/ident :fibo-sec-fund-civ/FundReinvestmentPolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund reinvestment policy@en",
   :rdfs/subClassOf
   [:fibo-sec-fund-civ/FundUnitDistributionPolicy
    :fibo-fnd-law-lcap/Policy
    {:owl/onProperty     :fibo-sec-fund-civ/hasDistributionPolicy.2,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundUnitDistributionMethod,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "Terms for the expected reinvestment of profits on fund units.@en"})

(def FundReportingTerms
  "Terms describing the accounting methods and reporting arrangements used by the fund."
  {:db/ident :fibo-sec-fund-civ/FundReportingTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund reporting terms@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-sec-fund-civ/hasAccountingReportingFrequency,
     :owl/someValuesFrom :fibo-sec-fund-civ/ReportingFrequencyPolicy,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-agr-ctr/ContractualCommitment],
   :skos/definition
   #xsd/langString
    "Terms describing the accounting methods and reporting arrangements used by the fund.@en"})

(def FundShareClassUnit
  "The legal structure in which you can purchase part of an investment pool, defined by a variety of characteristics like investor type, minimum size of investment, distribution type, fee and currency. A fund unit which gives the holder an equity stake in the fund."
  {:cmns-av/explanatoryNote
   #xsd/langString
    "From review sessions: Theoretically you can buy a fraction of a share in a fund. This would depend on the legal structure of the fund, e.g. a minimum investment. There is always a distribution plan.@en",
   :db/ident :fibo-sec-fund-civ/FundShareClassUnit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund share class unit@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-sec-fund-civ/hasDistributionPolicy,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundUnitDistributionPolicy,
     :rdf/type           :owl/Restriction}
    :fibo-sec-fund-fund/FundUnit
    {:owl/onProperty     :fibo-sec-fund-civ/hasDetails,
     :owl/someValuesFrom :fibo-sec-fund-civ/NetAssetValueCalculationMethod,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasFundProcessingTerms,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundProcessingGeneralTerms,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasFundProcessingTerms,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundRedemptionTerms,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "The legal structure in which you can purchase part of an investment pool, defined by a variety of characteristics like investor type, minimum size of investment, distribution type, fee and currency. A fund unit which gives the holder an equity stake in the fund.@en"})

(def FundSubscriptionTerms
  "Subscription terms for the fund. Further notes: ISO FIBIM, EFAMA DD and FPP combine terms for subscription, redemption and general holding requirements. These have been separated here as they are different kinds of term, but this can be reviewed. Subscription Terms are identified as terms of the fund and not the fund unit, since terms for how you might subscribe can't be binding one someone who has not yet subscribed."
  {:db/ident :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund subscription terms@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
     :owl/someValuesFrom :fibo-sec-fund-fund/FundUnit,
     :rdf/type           :owl/Restriction}
    :fibo-sec-fund-civ/FundProcessingTerms
    {:owl/onProperty     :fibo-sec-fund-civ/definesMainFundOrderDeskAccount,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundsProcessingAccount,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasDefaultSettlementConvention,
     :owl/someValuesFrom :fibo-fbc-fi-stl/SettlementConvention,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-agr-ctr/ContractualCommitment],
   :skos/definition
   #xsd/langString
    "Subscription terms for the fund. Further notes: ISO FIBIM, EFAMA DD and FPP combine terms for subscription, redemption and general holding requirements. These have been separated here as they are different kinds of term, but this can be reviewed. Subscription Terms are identified as terms of the fund and not the fund unit, since terms for how you might subscribe can't be binding one someone who has not yet subscribed.@en"})

(def FundSupervisoryAuthority
  "The legal entity which supervises the fund or fund industry"
  {:db/ident :fibo-sec-fund-civ/FundSupervisoryAuthority,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund supervisory authority@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                      :owl/someValuesFrom :fibo-be-le-cb/Corporation,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition
   #xsd/langString
    "The legal entity which supervises the fund or fund industry@en"})

(def FundTransferAgent
  "An entity that undertakes the execution of subscription, redemption and switch orders on behalf of a fund. Definition origin:EFAMA DD"
  {:db/ident :fibo-sec-fund-civ/FundTransferAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund transfer agent@en",
   :rdfs/subClassOf [:fibo-sec-fund-civ/FundsProcessingParty
                     :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition
   #xsd/langString
    "An entity that undertakes the execution of subscription, redemption and switch orders on behalf of a fund. Definition origin:EFAMA DD@en"})

(def FundUnitDistributionMethod
  "The normal distribution policy for funds."
  {:db/ident :fibo-sec-fund-civ/FundUnitDistributionMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund unit distribution method@en",
   :rdfs/subClassOf :fibo-fnd-gao-obj/DistributionStrategy,
   :skos/definition #xsd/langString
                     "The normal distribution policy for funds.@en"})

(def FundUnitDistributionPolicy
  "policy relating to the unit, e.g. if income is paid out or retained in the fund and how this is treated, including distribution policy details for dividends and coupons."
  {:db/ident :fibo-sec-fund-civ/FundUnitDistributionPolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund unit distribution policy@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-sec-fund-civ/hasDistributionPolicy.2,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundUnitDistributionMethod,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-law-lcap/Policy],
   :skos/definition
   #xsd/langString
    "policy relating to the unit, e.g. if income is paid out or retained in the fund and how this is treated, including distribution policy details for dividends and coupons.@en"})

(def FundUnitHolding
  "A holding of a unit in another fund."
  {:db/ident :fibo-sec-fund-civ/FundUnitHolding,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund unit holding@en",
   :rdfs/subClassOf [{:owl/allValuesFrom :fibo-sec-fund-fund/FundUnit,
                      :owl/onProperty    :cmns-col/comprises,
                      :rdf/type          :owl/Restriction}
                     :fibo-sec-sec-ast/PortfolioHolding],
   :skos/definition #xsd/langString "A holding of a unit in another fund.@en"})

(def FundsCashDistribution
  "Accrued income is distributed periodically to the investor."
  {:db/ident :fibo-sec-fund-civ/FundsCashDistribution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "funds cash distribution@en",
   :rdfs/subClassOf [:fibo-sec-fund-civ/FundUnitDistributionMethod
                     :fibo-fnd-gao-obj/DistributionStrategy],
   :skos/definition
   #xsd/langString
    "Accrued income is distributed periodically to the investor.@en"})

(def FundsCreation
  "SPV set up for fund management Conesnsus:Review"
  {:db/ident :fibo-sec-fund-civ/FundsCreation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "funds creation@en",
   :rdfs/subClassOf [:fibo-sec-fund-civ/SPVPurpose
                     :fibo-fnd-gao-obj/BusinessObjective],
   :skos/definition #xsd/langString
                     "SPV set up for fund management Conesnsus:Review@en"})

(def FundsProcessing
  "The context of managing and processing funds, issuing funds units etc. This is the context in which the different parties involved in a fund are defined as parties."
  {:db/ident :fibo-sec-fund-civ/FundsProcessing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "funds processing@en",
   :rdfs/subClassOf :fibo-fnd-arr-lif/LifecycleStage,
   :skos/definition
   #xsd/langString
    "The context of managing and processing funds, issuing funds units etc. This is the context in which the different parties involved in a fund are defined as parties.@en"})

(def FundsProcessingAccount
  "An account used specifically in the processing of funds. Like all accounts this is (per FIBIM definition) a business relationship between two entities; one entity is the account owner, the other entity is the account servicer. Please refer to Financial global model for treatment of accounts relationships in this model."
  {:cmns-av/explanatoryNote
   #xsd/langString
    "Derived from FIBIM definition for \"Account\", which is: \"Business relationship between two entities; one entity is the account owner, the other entity is the account servicer.\" this corresponds to the Global Terms definition for Account.@en",
   :db/ident :fibo-sec-fund-civ/FundsProcessingAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "funds processing account@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/isProvidedBy,
                      :owl/someValuesFrom :fibo-sec-fund-civ/FundOrderDesk,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-pas-caa/Account],
   :skos/definition
   #xsd/langString
    "An account used specifically in the processing of funds. Like all accounts this is (per FIBIM definition) a business relationship between two entities; one entity is the account owner, the other entity is the account servicer. Please refer to Financial global model for treatment of accounts relationships in this model.@en"})

(def FundsProcessingParty
  "A party involved in the processing of funds in some way."
  {:db/ident :fibo-sec-fund-civ/FundsProcessingParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "funds processing party@en",
   :rdfs/subClassOf :fibo-fnd-pty-pty/PartyInRole,
   :skos/definition
   #xsd/langString
    "A party involved in the processing of funds in some way.@en"})

(def FundsProcessingPassport
  "The Funds Processing Passport. This is defined as a document. This has terms drawn from elsewhere in the model which are defined as part of the FPP for reasons defined in the FPP descriptions."
  {:db/ident :fibo-sec-fund-civ/FundsProcessingPassport,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "funds processing passport@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-fund-civ/mayBeDefinedIn,
                      :owl/someValuesFrom :fibo-sec-fund-civ/FundProspectus,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-sec-fund-civ/hasInformationAbout,
                      :owl/someValuesFrom :fibo-sec-fund-fund/FundUnit,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-agr-ctr/definesTermsFor,
                      :owl/someValuesFrom
                      :fibo-sec-fund-civ/FundProcessingTerms,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-arr-doc/Document],
   :skos/definition
   #xsd/langString
    "The Funds Processing Passport. This is defined as a document. This has terms drawn from elsewhere in the model which are defined as part of the FPP for reasons defined in the FPP descriptions.@en",
   :skos/editorialNote
   #xsd/langString
    "Please see FPP Data Descriptions for more information (when available - not included in this model). See EFAMA website for this. Also see XLS for terms of this. These terms are often but net necessarily part of the Prospectus. See also the Thing Formerly Referred To As Investment. The definitions in the FPP descriptions may not be accurate. This is defining what kind of information is requested. Further Action: Now that we have defined sets of formal contractual terems for subvscriptions, redemptions and general terms, and since these terms don't have a direct relationship to any one Contract at present (as contractual terms should do), there may be a relationship between those terms and the FPP. To be handled in next review.@en"})

(def GrossOfFeePerformanceDeterminationMethod
  "Performance determined gross of fee. Review: Is this mutually exclusive with the other listed method? It sounds like it is not."
  {:db/ident :fibo-sec-fund-civ/GrossOfFeePerformanceDeterminationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString
                "gross of fee performance determination method@en",
   :rdfs/subClassOf [:fibo-sec-fund-civ/PerformanceDeterminationMethod
                     :fibo-fnd-gao-obj/Strategy],
   :skos/definition
   #xsd/langString
    "Performance determined gross of fee. Review: Is this mutually exclusive with the other listed method? It sounds like it is not.@en"})

(def IncomeAccumulation
  "Accrued income is not distributed and instead remains reflected within the unit/share price."
  {:db/ident :fibo-sec-fund-civ/IncomeAccumulation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "income accumulation@en",
   :rdfs/subClassOf [:fibo-sec-fund-civ/FundUnitDistributionMethod
                     :fibo-fnd-gao-obj/DistributionStrategy],
   :skos/definition
   #xsd/langString
    "Accrued income is not distributed and instead remains reflected within the unit/share price.@en"})

(def InvestmentAdvisor
  "The party that provides investment guidance at a fee. Definition origin:EFAMA DD"
  {:db/ident :fibo-sec-fund-civ/InvestmentAdvisor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "investment advisor@en",
   :rdfs/subClassOf [{:owl/onProperty
                      :fibo-sec-fund-civ/processingPartyHasIdentity,
                      :owl/someValuesFrom :fibo-be-le-lp/LegalEntity,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-fund-civ/FundsProcessingParty
                     :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition
   #xsd/langString
    "The party that provides investment guidance at a fee. Definition origin:EFAMA DD@en"})

(def InvestmentRestriction
  "Limitations that apply to the fund as a whole, such as risk factors. these are used to determine whether the fund is appropriate for a given type of investor to invest in."
  {:cmns-av/explanatoryNote
   #xsd/langString
    "These are defined by the overall Fund investment policy. Not the same as the detailed policies for investing in percentages of this or that.@en",
   :db/ident :fibo-sec-fund-civ/InvestmentRestriction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund investment restrictions set@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/isPartOf,
                      :owl/someValuesFrom :fibo-sec-fund-civ/FundProspectus,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-rst/SecuritiesRestriction],
   :skos/definition
   #xsd/langString
    "Limitations that apply to the fund as a whole, such as risk factors. these are used to determine whether the fund is appropriate for a given type of investor to invest in.@en"})

(def InvestmentStrategy
  "plan, method, or series of maneuvers or stratagems for obtaining a specific investment goal"
  {:db/ident :fibo-sec-fund-civ/InvestmentStrategy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "investment strategy@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-gao-obj/hasObjective,
                      :owl/someValuesFrom :fibo-fnd-gao-obj/InvestmentObjective,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-gao-obj/BusinessStrategy],
   :skos/definition
   #xsd/langString
    "plan, method, or series of maneuvers or stratagems for obtaining a specific investment goal@en"})

(def JurisdictionStrategy
  "Strategy which is jurisdiction based."
  {:db/ident :fibo-sec-fund-civ/JurisdictionStrategy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "jurisdiction strategy@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-fund-civ/identifies.1,
                      :owl/someValuesFrom :fibo-fnd-law-jur/Jurisdiction,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-fund-civ/FundPortfolioInvestmentLimitations
                     :fibo-sec-fund-civ/InvestmentRestriction
                     {:owl/onProperty     :cmns-col/isPartOf,
                      :owl/someValuesFrom :fibo-sec-fund-civ/FundProspectus,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-rst/SecuritiesRestriction],
   :skos/definition #xsd/langString "Strategy which is jurisdiction based.@en"})

(def KeyInvestorInformationDocument
  "short document that provides critical information for investors, summarizing content derived from a prospectus such that it can be understood by investors without reference to other documents, as required by law in the European Union"
  {:cmns-av/abbreviation "KIID",
   :cmns-av/adaptedFrom
   {:rdfa/uri "https://eur-lex.europa.eu/eli/dir/2009/65/2020-01-07"},
   :cmns-av/explanatoryNote
   "Key investor information shall include appropriate information about the essential characteristics of the UCITS concerned, which is to be provided to investors so that they are reasonably able to understand the nature and the risks of the investment product that is being offered to them and, consequently, to take investment decisions on an informed basis.",
   :db/ident :fibo-sec-fund-civ/KeyInvestorInformationDocument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label "key investor information document",
   :rdfs/subClassOf [{:owl/hasValue   :fibo-be-ge-euj/EuropeanUnionJurisdiction,
                      :owl/onProperty :cmns-cxtdsg/isApplicableIn,
                      :rdf/type       :owl/Restriction}
                     :fibo-sec-sec-iss/OfferingDocument
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-sec-fund-fund/FundUnit,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "short document that provides critical information for investors, summarizing content derived from a prospectus such that it can be understood by investors without reference to other documents, as required by law in the European Union"})

(def Liquidity
  "Precise definition needed for liquidity, and check that it is modeled accordingly."
  {:db/ident :fibo-sec-fund-civ/Liquidity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "liquidity@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-fund-civ/denominatedIn,
                      :owl/someValuesFrom :fibo-fnd-acc-cur/Currency,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-oac-own/Asset],
   :skos/definition
   #xsd/langString
    "Precise definition needed for liquidity, and check that it is modeled accordingly.@en"})

(def MoneyWeightedRateOfReturnPerformanceDeterminationMethod
  "Money weighted rate of return."
  {:db/ident
   :fibo-sec-fund-civ/MoneyWeightedRateOfReturnPerformanceDeterminationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label
   #xsd/langString
    "money weighted rate of return performance determination method@en",
   :rdfs/subClassOf [:fibo-sec-fund-civ/PerformanceDeterminationMethod
                     :fibo-fnd-gao-obj/Strategy],
   :skos/definition #xsd/langString "Money weighted rate of return.@en"})

(def NetAssetValueCalculationMethod
  "Parameters for the calculation of the net asset value for an investment fund/fund class."
  {:db/ident :fibo-sec-fund-civ/NetAssetValueCalculationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "net asset value calculation method@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-fund-civ/isCalculatedIn,
                      :owl/someValuesFrom :fibo-fnd-acc-cur/Currency,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-utl-alx/Expression],
   :skos/definition
   #xsd/langString
    "Parameters for the calculation of the net asset value for an investment fund/fund class.@en",
   :skos/editorialNote
   #xsd/langString
    "These terms were in the ISO FIBIM model but correspond to some details in the EFAMA DD.@en"})

(def NoteFundUnit
  "Need a legal definition - to follow. This is one of the mechanisms by which an investor may hold an interest in a fund, but is not a Bond or a Share."
  {:db/ident :fibo-sec-fund-civ/NoteFundUnit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "note fund unit@en",
   :rdfs/subClassOf
   [:fibo-sec-fund-fund/FundUnit
    {:owl/onProperty     :fibo-sec-fund-civ/hasDetails,
     :owl/someValuesFrom :fibo-sec-fund-civ/NetAssetValueCalculationMethod,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasFundProcessingTerms,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundProcessingGeneralTerms,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasFundProcessingTerms,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundRedemptionTerms,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "Need a legal definition - to follow. This is one of the mechanisms by which an investor may hold an interest in a fund, but is not a Bond or a Share.@en",
   :skos/editorialNote
   #xsd/langString
    "It is not possible to determine at this time whether some of the policy facts that apply to bund and share class units apply to all fund units including this one. Once this is defined, all Fund Distribution Policy terms and relationships should be rechecked.@en"})

(def OrganizationStrategy
  "Strategy which is organization based."
  {:db/ident :fibo-sec-fund-civ/OrganizationStrategy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "organization strategy@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-fund-civ/definedInRelationTo,
                      :owl/someValuesFrom :fibo-be-le-cb/Corporation,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-fund-civ/FundPortfolioInvestmentLimitations
                     :fibo-sec-fund-civ/InvestmentRestriction
                     {:owl/onProperty     :cmns-col/isPartOf,
                      :owl/someValuesFrom :fibo-sec-fund-civ/FundProspectus,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-rst/SecuritiesRestriction],
   :skos/definition #xsd/langString "Strategy which is organization based.@en"})

(def OtherInvestmentFundInformation
  "Things which are not part of the prospectus but are important if you want to understand the fund."
  {:db/ident :fibo-sec-fund-civ/OtherInvestmentFundInformation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "other investment fund information@en",
   :rdfs/subClassOf :fibo-fnd-arr-doc/Document,
   :skos/definition
   #xsd/langString
    "Things which are not part of the prospectus but are important if you want to understand the fund.@en",
   :skos/editorialNote
   #xsd/langString
    "See terms in EFAMA spreadsheet. These are properties of the fund but are not legally binding. Author follow-up note: I have managed to find a \"home\" for disposition for most of the entries that are in the spreadsheet. It is not clear which of the spreadsheet terms are indended to come under the general heading in this class. The first place I would look is in the terms I have defined as \"Fund Processing Terms\", which are defined as formal, legal contractual terms. If any of those are not legally binding on some party, then this is where they belong instead.@en"})

(def PerformanceDeterminationMethod
  "A method for performance determination (e.g. Time weighted and money weighted, annualized, gross of fee) along with the time frame in which this is determined. PLUS Performances NamePeriod"
  {:db/ident :fibo-sec-fund-civ/PerformanceDeterminationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "performance determination method@en",
   :rdfs/subClassOf :fibo-fnd-gao-obj/Strategy,
   :skos/definition
   #xsd/langString
    "A method for performance determination (e.g. Time weighted and money weighted, annualized, gross of fee) along with the time frame in which this is determined. PLUS Performances NamePeriod@en"})

(def PortfolioBenchmark
  "Security or other price against which the performance of the portfolio is evaluated."
  {:db/ident :fibo-sec-fund-civ/PortfolioBenchmark,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "portfolio benchmark@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-sec-fund-civ/FundPortfolio,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-fund-civ/definesBenchmark,
                      :owl/someValuesFrom :fibo-ind-ind-ind/MarketRate,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-utl-alx/Measure],
   :skos/definition
   #xsd/langString
    "Security or other price against which the performance of the portfolio is evaluated.@en"})

(def PortfolioInvestmentStrategy
  "The manner in which the portfolio manager tries to reach the funds objectives."
  {:cmns-av/explanatoryNote
   #xsd/langString
    "Describes how you get there. E.g fully invested v not fully invested. MB Note: The terms labeled \"Strategy\" in EFAMA and in FIBIM are more like dictionary definition of policy, while \"How you get there\" is a dictionary definition of Strategy. Therefore original labels may be reversed from dictionary definition of the global semantics these are derived from.@en",
   :db/ident :fibo-sec-fund-civ/PortfolioInvestmentStrategy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "portfolio investment strategy@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-fund-civ/includes,
                      :owl/someValuesFrom
                      :fibo-sec-fund-civ/FundPortfolioInvestmentLimitations,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-fund-civ/InvestmentStrategy
                     {:owl/onProperty     :fibo-fnd-gao-obj/hasObjective,
                      :owl/someValuesFrom :fibo-fnd-gao-obj/InvestmentObjective,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-gao-obj/BusinessStrategy],
   :skos/definition
   #xsd/langString
    "The manner in which the portfolio manager tries to reach the funds objectives.@en"})

(def PortfolioManager
  "person or entity responsible for day to day investment decisions for a fund or asset"
  {:db/ident :fibo-sec-fund-civ/PortfolioManager,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label "portfolio manager",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/manages,
                      :owl/someValuesFrom :fibo-sec-fund-civ/FundPortfolio,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-pty-rl/isPlayedBy,
                      :owl/someValuesFrom
                      {:owl/allValuesFrom
                       :fibo-sec-fund-civ/FundManagementCompany,
                       :owl/onProperty :cmns-col/isMemberOf,
                       :rdf/type :owl/Restriction},
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-org-org/OrganizationMember],
   :skos/definition
   "person or entity responsible for day to day investment decisions for a fund or asset"})

(def PreferredShareInFund
  "preferred share in fund"
  {:db/ident :fibo-sec-fund-civ/PreferredShareInFund,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "preferred share in fund@en",
   :rdfs/subClassOf
   [:fibo-sec-fund-civ/FundShareClassUnit
    {:owl/onProperty     :fibo-sec-fund-civ/hasDetails,
     :owl/someValuesFrom :fibo-sec-fund-civ/NetAssetValueCalculationMethod,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasFundProcessingTerms,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundProcessingGeneralTerms,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-fund-civ/hasFundProcessingTerms,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundRedemptionTerms,
     :rdf/type           :owl/Restriction}
    :fibo-sec-fund-fund/FundUnit
    {:owl/onProperty     :fibo-sec-fund-civ/hasDistributionPolicy,
     :owl/someValuesFrom :fibo-sec-fund-civ/FundUnitDistributionPolicy,
     :rdf/type           :owl/Restriction}]})

(def PrivateEquityHolding
  "A holding of private equity."
  {:db/ident :fibo-sec-fund-civ/PrivateEquityHolding,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "private equity holding@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/comprises,
                      :owl/someValuesFrom :fibo-sec-eq-eq/PrivatelyHeldShare,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-ast/PortfolioHolding],
   :skos/definition #xsd/langString "A holding of private equity.@en"})

(def ReferToFundOrderDesk
  "Restriction requiring an investor to refer to the fund order desk prior to redeeming a fund."
  {:db/ident :fibo-sec-fund-civ/ReferToFundOrderDesk,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "refer to fund order desk@en",
   :rdfs/subClassOf [:fibo-sec-fund-civ/FundRedemptionRestriction
                     :fibo-sec-sec-rst/SecuritiesRestriction],
   :skos/definition
   #xsd/langString
    "Restriction requiring an investor to refer to the fund order desk prior to redeeming a fund.@en",
   :skos/editorialNote
   #xsd/langString
    "While it's unclear from original data models, it's likely that this restriction is actually to learn from the fund order desk of any other individual kinds of restriction that will apply. This is itself treated as a kind of restriction here.@en"})

(def ReportingFrequencyPolicy
  "Frequency with which financial reports will be presented."
  {:db/ident :fibo-sec-fund-civ/ReportingFrequencyPolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "reporting frequency policy@en",
   :rdfs/subClassOf :fibo-fnd-law-lcap/ReportingPolicy,
   :skos/definition
   #xsd/langString
    "Frequency with which financial reports will be presented.@en",
   :skos/editorialNote
   #xsd/langString
    "This could theoretically be defined in terms of a Frequency (reciprocal of time), but since this kind of reporting in accounting is always either annual or semi-annual these are defined as policies for the provision of such reports@en"})

(def RiskLevel
  "risk level"
  {:db/ident :fibo-sec-fund-civ/RiskLevel,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "risk level@en",
   :rdfs/subClassOf :cmns-cls/Classifier})

(def SICAF
  "A French fund vehicle type. Designation and definition needed."
  {:db/ident :fibo-sec-fund-civ/SICAF,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "s i c a f@en",
   :rdfs/subClassOf :fibo-be-fct-fct/FunctionalBusinessEntity,
   :skos/definition
   #xsd/langString
    "A French fund vehicle type. Designation and definition needed.@en"})

(def SICAV
  "Societe Collective a Capital Variable"
  {:db/ident :fibo-sec-fund-civ/SICAV,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "s i c a v@en",
   :rdfs/subClassOf :fibo-be-fct-fct/FunctionalBusinessEntity,
   :skos/definition #xsd/langString "Societe Collective a Capital Variable@en"})

(def SPVPurpose
  "The reason for the creation of a Special Purpose Vehicle."
  {:db/ident :fibo-sec-fund-civ/SPVPurpose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "s p v purpose@en",
   :rdfs/subClassOf :fibo-fnd-gao-obj/BusinessObjective,
   :skos/definition
   #xsd/langString
    "The reason for the creation of a Special Purpose Vehicle.@en",
   :skos/editorialNote
   #xsd/langString
    "This is used to identify different kinds of SPV which may have different detailed facts about them; however in general all SPVs are much the same.@en"})

(def SectorStrategy
  "Strategy which is sector based."
  {:db/ident :fibo-sec-fund-civ/SectorStrategy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "sector strategy@en",
   :rdfs/subClassOf [:fibo-sec-fund-civ/FundPortfolioInvestmentLimitations
                     :fibo-sec-fund-civ/InvestmentRestriction
                     {:owl/onProperty     :cmns-col/isPartOf,
                      :owl/someValuesFrom :fibo-sec-fund-civ/FundProspectus,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-rst/SecuritiesRestriction],
   :skos/definition #xsd/langString "Strategy which is sector based.@en"})

(def SemiAnnualReportingPolicy
  "Reports are presented twice a year."
  {:db/ident :fibo-sec-fund-civ/SemiAnnualReportingPolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "semi annual reporting policy@en",
   :rdfs/subClassOf [:fibo-sec-fund-civ/ReportingFrequencyPolicy
                     :fibo-fnd-law-lcap/ReportingPolicy],
   :skos/definition #xsd/langString "Reports are presented twice a year.@en"})

(def StakeInFund
  "The holding of some portion in a fund, by some party. This stake will generally tak ethe form of some sort of unit in that fund."
  {:db/ident :fibo-sec-fund-civ/StakeInFund,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "stake in fund@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-fund-civ/identifiedAs.5,
                      :owl/someValuesFrom :fibo-sec-fund-fund/FundUnit,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-sec-fund-civ/givesOwnershipOf,
                      :owl/someValuesFrom
                      :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-pas-fpas/Position],
   :skos/definition
   #xsd/langString
    "The holding of some portion in a fund, by some party. This stake will generally tak ethe form of some sort of unit in that fund.@en"})

(def TimeWeightedRateOfReturnPerformanceDeterminationMethod
  "Time weighted rate of return."
  {:db/ident
   :fibo-sec-fund-civ/TimeWeightedRateOfReturnPerformanceDeterminationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label
   #xsd/langString
    "time weighted rate of return performance determination method@en",
   :rdfs/subClassOf [:fibo-sec-fund-civ/PerformanceDeterminationMethod
                     :fibo-fnd-gao-obj/Strategy],
   :skos/definition #xsd/langString "Time weighted rate of return.@en"})

(def UnitIssuer
  "The party which issues the Fund Unit."
  {:db/ident :fibo-sec-fund-civ/UnitIssuer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "unit issuer@en",
   :rdfs/subClassOf [{:owl/onProperty
                      :fibo-sec-fund-civ/processingPartyHasIdentity,
                      :owl/someValuesFrom :fibo-be-le-cb/Corporation,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-fund-civ/issues,
                      :owl/someValuesFrom :fibo-sec-fund-fund/FundUnit,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-fund-civ/FundsProcessingParty
                     :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition #xsd/langString "The party which issues the Fund Unit.@en"})

(def accountingYearEndDate
  "Last day of the accounting year for the fund."
  {:db/ident :fibo-sec-fund-civ/accountingYearEndDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundReportingTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "accounting year end date@en",
   :rdfs/range :fibo-fnd-dt-bd/DayOfMonth,
   :skos/definition #xsd/langString
                     "Last day of the accounting year for the fund.@en"})

(def additionalRestrictions
  "Other restrictions or treatment information in respect of this strategy and the organization to which it refers."
  {:db/ident :fibo-sec-fund-civ/additionalRestrictions,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/OrganizationStrategy,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "additional restrictions@en",
   :rdfs/range :xsd/string,
   :skos/definition
   #xsd/langString
    "Other restrictions or treatment information in respect of this strategy and the organization to which it refers.@en"})

(def administeredBy
  "administered by"
  {:db/ident :fibo-sec-fund-civ/administeredBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "administered by@en",
   :rdfs/range :fibo-sec-fund-civ/FundAdministrator,
   :rdfs/subPropertyOf :fibo-sec-fund-civ/fundHasRelatedParty})

(def advisedBy
  "advised by"
  {:db/ident :fibo-sec-fund-civ/advisedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "advised by@en",
   :rdfs/range :fibo-sec-fund-civ/InvestmentAdvisor,
   :rdfs/subPropertyOf :fibo-sec-fund-civ/fundHasRelatedParty})

(def anticipatedVolatility
  "anticipated volatility"
  {:db/ident :fibo-sec-fund-civ/anticipatedVolatility,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProspectus,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "anticipated volatility@en",
   :rdfs/range :fibo-fnd-utl-alx/Percentage})

(def anticipates
  "anticipates"
  {:db/ident :fibo-sec-fund-civ/anticipates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProspectus,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "anticipates@en",
   :rdfs/range :fibo-ind-ind-ind/MarketRate})

(def assessedAgainst
  "assessed against"
  {:db/ident :fibo-sec-fund-civ/assessedAgainst,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolio,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "assessed against@en",
   :rdfs/range :fibo-sec-fund-civ/PortfolioBenchmark})

(def authorizedCountry
  "Country in which it is authorised to commercialise the fund."
  {:db/ident :fibo-sec-fund-civ/authorizedCountry,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingGeneralTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "authorized country@en",
   :rdfs/range :lcc-cr/Country,
   :skos/definition
   #xsd/langString
    "Country in which it is authorised to commercialise the fund.@en"})

(def backEndLoadApplicable
  "Whether an exit charge, eg, CDSC, on redemption orders for this class can be applied."
  {:db/ident :fibo-sec-fund-civ/backEndLoadApplicable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingGeneralTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "back end load applicable@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #xsd/langString
    "Whether an exit charge, eg, CDSC, on redemption orders for this class can be applied.@en"})

(def benchmarkWeight
  "Instrument weighting in the benchmark for the portfolio."
  {:db/ident :fibo-sec-fund-civ/benchmarkWeight,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/PortfolioBenchmark,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "benchmark weight@en",
   :rdfs/range :fibo-fnd-utl-alx/Percentage,
   :skos/definition
   #xsd/langString
    "Instrument weighting in the benchmark for the portfolio.@en"})

(def blacklisted
  "Whether or not the strategy in framed so as to include the referenced business entity as being blacklisted. If yes, the strategy prevents investment in securities issued by that organization."
  {:db/ident :fibo-sec-fund-civ/blacklisted,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/OrganizationStrategy,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "blacklisted@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #xsd/langString
    "Whether or not the strategy in framed so as to include the referenced business entity as being blacklisted. If yes, the strategy prevents investment in securities issued by that organization.@en"})

(def clearFundsRequired
  "Whether cleared funds may be required before a subscription order can be executed."
  {:db/ident :fibo-sec-fund-civ/clearFundsRequired,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/SettlementTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "clear funds required@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #xsd/langString
    "Whether cleared funds may be required before a subscription order can be executed.@en"})

(def couponPaymentDate
  "The date at which the coupon is distributed to the bond unit holder."
  {:db/ident :fibo-sec-fund-civ/couponPaymentDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundCouponPolicy,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "coupon payment date@en",
   :rdfs/range :fibo-fnd-dt-bd/DayOfMonth,
   :skos/definition
   #xsd/langString
    "The date at which the coupon is distributed to the bond unit holder.@en"})

(def dealingFrequencyDescription
  "Description of frequency at which the subscriptions and redemptions are done."
  {:db/ident :fibo-sec-fund-civ/dealingFrequencyDescription,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "dealing frequency description@en",
   :rdfs/range :xsd/string,
   :skos/definition
   #xsd/langString
    "Description of frequency at which the subscriptions and redemptions are done.@en"})

(def decimalPlaceRounding
  "Number of decimal places to which quantities of units/shares are rounded."
  {:db/ident :fibo-sec-fund-civ/decimalPlaceRounding,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "decimal place rounding@en",
   :rdfs/range :xsd/integer,
   :skos/definition
   #xsd/langString
    "Number of decimal places to which quantities of units/shares are rounded.@en"})

(def declarationChannel
  "Means of the net asset value publication, eg, a newspaper."
  {:db/ident :fibo-sec-fund-civ/declarationChannel,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/NetAssetValueCalculationMethod,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "declaration channel@en",
   :rdfs/range :xsd/string,
   :skos/definition
   #xsd/langString
    "Means of the net asset value publication, eg, a newspaper.@en"})

(def definedInRelationTo
  "defined in relation to"
  {:db/ident :fibo-sec-fund-civ/definedInRelationTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/OrganizationStrategy,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "defined in relation to@en",
   :rdfs/range :fibo-be-le-cb/Corporation})

(def definesAllocations
  "defines allocations"
  {:db/ident :fibo-sec-fund-civ/definesAllocations,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolioInvestmentPolicy,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "defines allocations@en",
   :rdfs/range :fibo-sec-fund-civ/FundPortfolioInvestmentLimitations,
   :rdfs/subPropertyOf :cmns-dsg/defines})

(def definesBenchmark
  "defines benchmark"
  {:db/ident :fibo-sec-fund-civ/definesBenchmark,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/PortfolioBenchmark,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "defines benchmark@en",
   :rdfs/range :fibo-ind-ind-ind/MarketRate})

(def definesMainFundOrderDeskAccount
  "defines main fund order desk account"
  {:db/ident :fibo-sec-fund-civ/definesMainFundOrderDeskAccount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "defines main fund order desk account@en",
   :rdfs/range :fibo-sec-fund-civ/FundsProcessingAccount})

(def denominatedIn
  "denominated in"
  {:db/ident :fibo-sec-fund-civ/denominatedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/Liquidity,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "denominated in@en",
   :rdfs/range :fibo-fnd-acc-cur/Currency})

(def denomination
  "Denomination Currency of the fund - Currency in which the fund unit is issued or redenominated and the currency of the NAV calculation."
  {:db/ident :fibo-sec-fund-civ/denomination,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "denomination@en",
   :rdfs/range :fibo-fnd-acc-cur/Currency,
   :skos/definition
   #xsd/langString
    "Denomination Currency of the fund - Currency in which the fund unit is issued or redenominated and the currency of the NAV calculation.@en"})

(def denominationCurrency
  "denomination currency"
  {:db/ident :fibo-sec-fund-civ/denominationCurrency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/FundUnit,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "denomination currency@en",
   :rdfs/range :fibo-fnd-acc-cur/Currency})

(def describedIn
  "described in"
  {:db/ident :fibo-sec-fund-civ/describedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "described in@en",
   :rdfs/range :fibo-sec-fund-civ/FundProspectus})

(def description
  "The manner in which the manager tries to reach the funds objectives"
  {:db/ident :fibo-sec-fund-civ/description,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolioInvestmentPolicy,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "description@en",
   :rdfs/range :xsd/string,
   :skos/definition
   #xsd/langString
    "The manner in which the manager tries to reach the funds objectives@en"})

(def description_1
  "Description of the benchmark used to determine the performance of a portfolio."
  {:db/ident :fibo-sec-fund-civ/description.1,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/PortfolioBenchmark,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "description@en",
   :rdfs/range :xsd/string,
   :skos/definition
   #xsd/langString
    "Description of the benchmark used to determine the performance of a portfolio.@en"})

(def distributedBy
  "distributed by"
  {:db/ident :fibo-sec-fund-civ/distributedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "distributed by@en",
   :rdfs/range :fibo-sec-fund-civ/FundDistributor,
   :rdfs/subPropertyOf :fibo-sec-fund-civ/fundHasRelatedParty})

(def distributionWithReinvestment
  "It is possible to hold shares for which the accrued income is distributed, but then reinvested automatically in additional units/shares allocated to the investor."
  {:db/ident :fibo-sec-fund-civ/distributionWithReinvestment,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain [:fibo-sec-fund-civ/FundUnitDistributionPolicy
                 :fibo-sec-fund-civ/FundReinvestmentPolicy],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "distribution with reinvestment@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #xsd/langString
    "It is possible to hold shares for which the accrued income is distributed, but then reinvested automatically in additional units/shares allocated to the investor.@en"})

(def dualFund
  "Whether the fund has two prices."
  {:db/ident :fibo-sec-fund-civ/dualFund,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingGeneralTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "dual fund@en",
   :rdfs/range :xsd/boolean,
   :skos/definition #xsd/langString "Whether the fund has two prices.@en"})

(def endOfFiscalYear
  "Day and month on any given year at which the books are closed and profit and loss is determined."
  {:db/ident :fibo-sec-fund-civ/endOfFiscalYear,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundReportingTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "end of fiscal year@en",
   :rdfs/range :fibo-fnd-dt-bd/DayOfMonth,
   :skos/definition
   #xsd/langString
    "Day and month on any given year at which the books are closed and profit and loss is determined.@en"})

(def exCouponDate
  "The date at which the coupon is substracted from the NAV"
  {:db/ident :fibo-sec-fund-civ/exCouponDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundCouponPolicy,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "ex coupon date@en",
   :rdfs/range :fibo-fnd-dt-bd/DayOfMonth,
   :skos/definition
   #xsd/langString
    "The date at which the coupon is substracted from the NAV@en"})

(def firstAccountingYearEndDate
  "Last day of the first accounting year for the fund."
  {:db/ident :fibo-sec-fund-civ/firstAccountingYearEndDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundReportingTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "first accounting year end date@en",
   :skos/definition #xsd/langString
                     "Last day of the first accounting year for the fund.@en"})

(def firstNAVCalculationDate
  "The first date of NAV calculation"
  {:db/ident :fibo-sec-fund-civ/firstNAVCalculationDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "first n a v calculation date@en",
   :skos/definition #xsd/langString "The first date of NAV calculation@en"})

(def frontEndLoadApplicable
  "Whether a front end charge on subscription orders for this class can be applied."
  {:db/ident :fibo-sec-fund-civ/frontEndLoadApplicable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "front end load applicable@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #xsd/langString
    "Whether a front end charge on subscription orders for this class can be applied.@en"})

(def fundClassTypeIdentifier
  "A textual identification of the class of fund units. This is used to uniquely identify a particular class of fund units, and thereby identify features of this type of unit within the fund."
  {:db/ident :fibo-sec-fund-civ/fundClassTypeIdentifier,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-fund/FundUnit,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund class type identifier@en",
   :rdfs/range :xsd/string,
   :skos/definition
   #xsd/langString
    "A textual identification of the class of fund units. This is used to uniquely identify a particular class of fund units, and thereby identify features of this type of unit within the fund.@en"})

(def fundHasRelatedParty
  "fund has related party"
  {:db/ident :fibo-sec-fund-civ/fundHasRelatedParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund has related party@en",
   :rdfs/range :fibo-sec-fund-civ/FundsProcessingParty})

(def givesOwnershipOf
  "gives ownership of"
  {:db/ident :fibo-sec-fund-civ/givesOwnershipOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/StakeInFund,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "gives ownership of@en",
   :rdfs/range :fibo-sec-fund-fund/CollectiveInvestmentVehicle})

(def hasAccountant
  "has accountant"
  {:db/ident :fibo-sec-fund-civ/hasAccountant,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has accountant@en",
   :rdfs/range :fibo-sec-fund-civ/FundAccountant,
   :rdfs/subPropertyOf :fibo-sec-fund-civ/fundHasRelatedParty})

(def hasAccountingInformation
  "has accounting information"
  {:db/ident :fibo-sec-fund-civ/hasAccountingInformation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has accounting information@en",
   :rdfs/range :fibo-sec-fund-civ/FundReportingTerms})

(def hasAccountingReportingFrequency
  "has accounting reporting frequency"
  {:db/ident :fibo-sec-fund-civ/hasAccountingReportingFrequency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundReportingTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has accounting reporting frequency@en",
   :rdfs/range :fibo-sec-fund-civ/ReportingFrequencyPolicy})

(def hasAdditionalInformation
  "has additional information"
  {:db/ident :fibo-sec-fund-civ/hasAdditionalInformation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has additional information@en",
   :rdfs/range :fibo-sec-fund-civ/OtherInvestmentFundInformation})

(def hasAdditionalRedemptionRestrictions
  "has additional redemption restrictions"
  {:db/ident :fibo-sec-fund-civ/hasAdditionalRedemptionRestrictions,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundRedemptionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has additional redemption restrictions@en",
   :rdfs/range :fibo-sec-fund-civ/ReferToFundOrderDesk})

(def hasAuditor
  "has auditor"
  {:db/ident :fibo-sec-fund-civ/hasAuditor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has auditor@en",
   :rdfs/range :fibo-sec-fund-civ/FundAuditor,
   :rdfs/subPropertyOf :fibo-sec-fund-civ/fundHasRelatedParty})

(def hasContactDetails
  "has contact details"
  {:db/ident :fibo-sec-fund-civ/hasContactDetails,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/PortfolioManager,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has contact details@en"})

(def hasDataProvider
  "has an organization which is the data provider and is legally responsible for the information provided"
  {:db/ident :fibo-sec-fund-civ/hasDataProvider,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has data provider@en",
   :rdfs/range :fibo-sec-fund-civ/FundDataProvider,
   :rdfs/subPropertyOf :fibo-sec-fund-civ/fundHasRelatedParty,
   :skos/definition
   #xsd/langString
    "has an organization which is the data provider and is legally responsible for the information provided@en"})

(def hasDefaultSettlementConvention
  "has default settlement convention"
  {:db/ident :fibo-sec-fund-civ/hasDefaultSettlementConvention,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has default settlement convention@en",
   :rdfs/range :fibo-fbc-fi-stl/SettlementConvention})

(def hasDepository
  "has depository"
  {:db/ident :fibo-sec-fund-civ/hasDepository,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has depository@en",
   :rdfs/range :fibo-sec-fund-civ/FundDepositary,
   :rdfs/subPropertyOf :fibo-sec-fund-civ/fundHasRelatedParty})

(def hasDetails
  "Information on the net asset value calculation of the investment fund component."
  {:db/ident :fibo-sec-fund-civ/hasDetails,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/FundUnit,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has details@en",
   :rdfs/range :fibo-sec-fund-civ/NetAssetValueCalculationMethod,
   :skos/definition
   #xsd/langString
    "Information on the net asset value calculation of the investment fund component.@en"})

(def hasDistributiojnPolicy
  "has distributiojn policy"
  {:db/ident :fibo-sec-fund-civ/hasDistributiojnPolicy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundBondClassUnit,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has distributiojn policy@en",
   :rdfs/range :fibo-sec-fund-civ/FundUnitDistributionPolicy})

(def hasDistributionPolicy
  "has distribution policy"
  {:db/ident :fibo-sec-fund-civ/hasDistributionPolicy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundShareClassUnit,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has distribution policy@en",
   :rdfs/range :fibo-sec-fund-civ/FundUnitDistributionPolicy})

(def hasDistributionPolicy_1
  "Income policy relating to a class type, ie, if income is paid out or retained in the fund."
  {:cmns-av/explanatoryNote
   #xsd/langString
    "This is a fact about each individual type of Fund Unit. Additional facts may apply to the Fund as a whole - to be reviewed. Need to determine if there is an overall distribution policy term applicable to the Fund. Kept as a place holder in case there is.@en",
   :db/ident :fibo-sec-fund-civ/hasDistributionPolicy.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has distribution policy@en",
   :rdfs/range :fibo-sec-fund-civ/FundUnitDistributionMethod,
   :skos/definition
   #xsd/langString
    "Income policy relating to a class type, ie, if income is paid out or retained in the fund.@en"})

(def hasDistributionPolicy_2
  "Income policy relating to a class type, ie, if income is paid out or retained in the fund."
  {:db/ident :fibo-sec-fund-civ/hasDistributionPolicy.2,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundUnitDistributionPolicy,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has distribution policy@en",
   :rdfs/range :fibo-sec-fund-civ/FundUnitDistributionMethod,
   :skos/definition
   #xsd/langString
    "Income policy relating to a class type, ie, if income is paid out or retained in the fund.@en"})

(def hasExpectedCoupon
  "has expected coupon"
  {:db/ident :fibo-sec-fund-civ/hasExpectedCoupon,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundBondClassUnit,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has expected coupon@en",
   :rdfs/range :fibo-sec-fund-civ/FundBondUnitCoupon})

(def hasFundPolicy
  "Overall policy for amounts invested, limitations etc. Not the same as the detailed Portfolio policy."
  {:db/ident :fibo-sec-fund-civ/hasFundPolicy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has fund policy@en",
   :rdfs/range :fibo-sec-fund-civ/FundInvestmentPolicy,
   :skos/definition
   #xsd/langString
    "Overall policy for amounts invested, limitations etc. Not the same as the detailed Portfolio policy.@en"})

(def hasFundProcessingTerms
  "has fund processing terms"
  {:db/ident :fibo-sec-fund-civ/hasFundProcessingTerms,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/FundUnit,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has fund processing terms@en",
   :rdfs/range :fibo-sec-fund-civ/FundProcessingTerms,
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasContractualElement})

(def hasInformationAbout
  "has information about"
  {:db/ident :fibo-sec-fund-civ/hasInformationAbout,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundsProcessingPassport,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has information about@en",
   :rdfs/range :fibo-sec-fund-fund/FundUnit})

(def hasIntendedRiskLevel
  "has intended risk level"
  {:db/ident :fibo-sec-fund-civ/hasIntendedRiskLevel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundInvestmentObjective,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has intended risk level@en",
   :rdfs/range :fibo-sec-fund-civ/RiskLevel})

(def hasInvestmentStrategy
  "strategy"
  {:db/ident :fibo-sec-fund-civ/hasInvestmentStrategy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-sec-ast/Portfolio,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "strategy@en",
   :rdfs/range :fibo-sec-fund-civ/InvestmentStrategy})

(def hasIssueDate
  "Date of first NAV calculation and start of performance calculations (same as launch date)"
  {:db/ident :fibo-sec-fund-civ/hasIssueDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/FundUnit,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has issue date@en",
   :rdfs/range :cmns-dt/Date,
   :skos/definition
   #xsd/langString
    "Date of first NAV calculation and start of performance calculations (same as launch date)@en"})

(def hasLiquidity
  "has liquidity"
  {:db/ident :fibo-sec-fund-civ/hasLiquidity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolio,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has liquidity@en",
   :rdfs/range :fibo-sec-fund-civ/Liquidity})

(def hasManagementCompany
  "has management company"
  {:db/ident :fibo-sec-fund-civ/hasManagementCompany,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has management company@en",
   :rdfs/range :fibo-sec-fund-civ/FundManager,
   :rdfs/subPropertyOf :fibo-sec-fund-civ/fundHasRelatedParty})

(def hasPerformanceDeterminationMethod
  "has performance determination method"
  {:db/ident :fibo-sec-fund-civ/hasPerformanceDeterminationMethod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has performance determination method@en",
   :rdfs/range :fibo-sec-fund-civ/PerformanceDeterminationMethod})

(def hasPolicyTerms
  "has policy terms"
  {:db/ident :fibo-sec-fund-civ/hasPolicyTerms,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundBondUnitCoupon,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has policy terms@en",
   :rdfs/range :fibo-sec-fund-civ/FundCouponPolicy})

(def hasPortfolio
  "has portfolio"
  {:db/ident :fibo-sec-fund-civ/hasPortfolio,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has portfolio@en",
   :rdfs/range :fibo-sec-fund-civ/FundPortfolio})

(def hasRelatedFundTerms
  "has related fund terms"
  {:db/ident :fibo-sec-fund-civ/hasRelatedFundTerms,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has related fund terms@en",
   :rdfs/range :fibo-sec-fund-civ/FundProcessingTerms,
   :rdfs/subPropertyOf :fibo-sec-fund-civ/hasRelatedTerms})

(def hasRelatedTerms
  "has related terms"
  {:db/ident :fibo-sec-fund-civ/hasRelatedTerms,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has related terms@en",
   :rdfs/range :fibo-fnd-agr-ctr/ContractualElement})

(def hasSubscriptionTerms
  "has subscription terms"
  {:db/ident :fibo-sec-fund-civ/hasSubscriptionTerms,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has subscription terms@en",
   :rdfs/range :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/subPropertyOf [:fibo-sec-fund-civ/hasRelatedFundTerms
                        :fibo-sec-fund-civ/hasRelatedTerms]})

(def hasTradableUnit
  "has tradable unit"
  {:db/ident :fibo-sec-fund-civ/hasTradableUnit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has tradable unit@en",
   :rdfs/range :fibo-sec-fund-fund/FundUnit})

(def hasTransferAgent
  "has transfer agent"
  {:db/ident :fibo-sec-fund-civ/hasTransferAgent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has transfer agent@en",
   :rdfs/range :fibo-sec-fund-civ/FundTransferAgent,
   :rdfs/subPropertyOf :fibo-sec-fund-civ/fundHasRelatedParty})

(def hasUnitIssuer
  "has unit issuer"
  {:db/ident :fibo-sec-fund-civ/hasUnitIssuer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "has unit issuer@en",
   :rdfs/range :fibo-sec-fund-civ/UnitIssuer,
   :rdfs/subPropertyOf :fibo-sec-fund-civ/fundHasRelatedParty})

(def historicPricingIndicator
  "Indicates whether the price is historic or forward."
  {:db/ident :fibo-sec-fund-civ/historicPricingIndicator,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/NetAssetValueCalculationMethod,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "historic pricing indicator@en",
   :rdfs/range :xsd/boolean,
   :skos/definition #xsd/langString
                     "Indicates whether the price is historic or forward.@en"})

(def holderMayReinvest
  "Whether or not the holder may reinvest dividends in the fund."
  {:db/ident :fibo-sec-fund-civ/holderMayReinvest,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/DistributingShareClass,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "holder may reinvest@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #xsd/langString
    "Whether or not the holder may reinvest dividends in the fund.@en"})

(def holdingTransferable
  "Whether registered investors are able to transfer some or all of their holdings to third parties."
  {:db/ident :fibo-sec-fund-civ/holdingTransferable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingGeneralTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "holding transferable@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #xsd/langString
    "Whether registered investors are able to transfer some or all of their holdings to third parties.@en"})

(def holds
  "The Funds Special Purpose Vehicle holds this Fund."
  {:db/ident :fibo-sec-fund-civ/holds,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-le-lp/SpecialPurposeVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "holds@en",
   :rdfs/range :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :skos/definition #xsd/langString
                     "The Funds Special Purpose Vehicle holds this Fund.@en"})

(def identifiedAs_5
  "identified as"
  {:db/ident :fibo-sec-fund-civ/identifiedAs.5,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/StakeInFund,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "identified as@en",
   :rdfs/range :fibo-sec-fund-fund/FundUnit})

(def identifies_1
  "Jurisdiction (country, county, state, province, city) of the investment."
  {:db/ident :fibo-sec-fund-civ/identifies.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/JurisdictionStrategy,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "identifies@en",
   :rdfs/range :fibo-fnd-law-jur/Jurisdiction,
   :skos/definition
   #xsd/langString
    "Jurisdiction (country, county, state, province, city) of the investment.@en"})

(def identifiesAssetTypesBy
  "identifies asset types by"
  {:db/ident :fibo-sec-fund-civ/identifiesAssetTypesBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/AssetClassStrategy,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "identifies asset types by@en",
   :rdfs/range :fibo-sec-sec-cls/FinancialInstrumentClassifier})

(def implementsFundPolicy
  "implements fund policy"
  {:db/ident :fibo-sec-fund-civ/implementsFundPolicy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolio,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "implements fund policy@en",
   :rdfs/range :fibo-sec-fund-civ/FundPortfolioInvestmentPolicy})

(def inceptionDate
  "Authorization date in the country of origin."
  {:db/ident :fibo-sec-fund-civ/inceptionDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "inception date@en",
   :rdfs/range :cmns-dt/Date,
   :skos/definition #xsd/langString
                     "Authorization date in the country of origin.@en"})

(def inceptionDate_1
  "Authorization date in the country of origin. Further Notes See definition in Inception Date for Fund. Separate fact exists here. Same definition used. EFAMA Review notes: Inception Date exists as soon as there is a prospectus, so it is a fact about a Share Class even if the share class is never formally issued or offered to the public. Legal structure exists even if something is not launched. Editor question: Review stated this was a fact about Share Class; confirm this fact does not apply to Bond and Note units, or was the term Share Class being used to mean all three? Meanwhile I have put the term \"Issue Date\" as a fact about all Fund Unit, as this is given a sa separate term in the EFAMA DD spreadsheet. MAy come clearer in the next version of that."
  {:db/ident :fibo-sec-fund-civ/inceptionDate.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundShareClassUnit,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "inception date@en",
   :rdfs/range :cmns-dt/Date,
   :skos/definition
   #xsd/langString
    "Authorization date in the country of origin. Further Notes See definition in Inception Date for Fund. Separate fact exists here. Same definition used. EFAMA Review notes: Inception Date exists as soon as there is a prospectus, so it is a fact about a Share Class even if the share class is never formally issued or offered to the public. Legal structure exists even if something is not launched. Editor question: Review stated this was a fact about Share Class; confirm this fact does not apply to Bond and Note units, or was the term Share Class being used to mean all three? Meanwhile I have put the term \"Issue Date\" as a fact about all Fund Unit, as this is given a sa separate term in the EFAMA DD spreadsheet. MAy come clearer in the next version of that.@en"})

(def includeRelatedFirms
  "Whether or not the strategy includes firms which are related in some way to the referenced organization."
  {:db/ident :fibo-sec-fund-civ/includeRelatedFirms,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/OrganizationStrategy,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "include related firms@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #xsd/langString
    "Whether or not the strategy includes firms which are related in some way to the referenced organization.@en"})

(def includes
  "includes"
  {:db/ident :fibo-sec-fund-civ/includes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/PortfolioInvestmentStrategy,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "includes@en",
   :rdfs/range :fibo-sec-fund-civ/FundPortfolioInvestmentLimitations})

(def inclusion
  "Whether the referred strategy is included. No means this description refers to the exclusion of what is described, from the portfolio."
  {:db/ident :fibo-sec-fund-civ/inclusion,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolioInvestmentLimitations,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "inclusion@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #xsd/langString
    "Whether the referred strategy is included. No means this description refers to the exclusion of what is described, from the portfolio.@en"})

(def initialApplicationForm
  "Physical application form for the initial subscription by the investor."
  {:db/ident :fibo-sec-fund-civ/initialApplicationForm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "initial application form@en",
   :rdfs/range :fibo-sec-fund-civ/FundProcessingForm,
   :skos/definition
   #xsd/langString
    "Physical application form for the initial subscription by the investor.@en"})

(def intendedLiquidationDate
  "The date on which the SPV is scheduled to be disbanded and wound up."
  {:db/ident :fibo-sec-fund-civ/intendedLiquidationDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-le-lp/SpecialPurposeVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "intended liquidation date@en",
   :rdfs/range :cmns-dt/Date,
   :skos/definition
   #xsd/langString
    "The date on which the SPV is scheduled to be disbanded and wound up.@en"})

(def investmentFocus
  "The information about the area the fund is mostly invested into (for example stock market in Germany)."
  {:db/ident :fibo-sec-fund-civ/investmentFocus,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/PortfolioInvestmentStrategy,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "investment focus@en",
   :rdfs/range :xsd/string,
   :skos/definition
   #xsd/langString
    "The information about the area the fund is mostly invested into (for example stock market in Germany).@en"})

(def isCalculatedIn
  "is calculated in"
  {:db/ident :fibo-sec-fund-civ/isCalculatedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/NetAssetValueCalculationMethod,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "is calculated in@en",
   :rdfs/range :fibo-fnd-acc-cur/Currency})

(def isSetUpFor
  "is set up for"
  {:db/ident :fibo-sec-fund-civ/isSetUpFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-le-lp/SpecialPurposeVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "is set up for@en",
   :rdfs/range :fibo-sec-fund-civ/SPVPurpose})

(def isUnitHolder
  "is unit holder"
  {:db/ident :fibo-sec-fund-civ/isUnitHolder,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-opty/Investor,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "is unit holder@en",
   :rdfs/range :fibo-sec-fund-fund/FundUnit})

(def issuePrice
  "The price at which the Fund Unit was first issued."
  {:db/ident :fibo-sec-fund-civ/issuePrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/FundUnit,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "issue price@en",
   :rdfs/range :fibo-fnd-acc-cur/Price,
   :skos/definition #xsd/langString
                     "The price at which the Fund Unit was first issued.@en"})

(def issues
  "issues"
  {:db/ident :fibo-sec-fund-civ/issues,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/UnitIssuer,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "issues@en",
   :rdfs/range :fibo-sec-fund-fund/FundUnit})

(def launchDate
  "Date of first NAV calculation and start of performance calculations"
  {:db/ident :fibo-sec-fund-civ/launchDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "launch date@en",
   :skos/definition
   #xsd/langString
    "Date of first NAV calculation and start of performance calculations@en"})

(def legallyRecordedIn
  "Relationship note: This relationship has no obvious parent; it is similar to Security legally recorded in Jurisdiction, but that inherits from Contract jurisdiction whereas a Fund is a Pool not a Contract. So the meaning is not the same. Assign parent relationship in future if a more general one exists; at present there is none."
  {:db/ident :fibo-sec-fund-civ/legallyRecordedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "fund legally recorded in@en",
   :rdfs/range :fibo-fnd-law-jur/Jurisdiction,
   :skos/definition
   #xsd/langString
    "Relationship note: This relationship has no obvious parent; it is similar to Security legally recorded in Jurisdiction, but that inherits from Contract jurisdiction whereas a Fund is a Pool not a Contract. So the meaning is not the same. Assign parent relationship in future if a more general one exists; at present there is none.@en"})

(def limitedSharesAreIssued
  "Whether or not new shares can be issued in the fund. This is what makes it a closed end or open end fund."
  {:db/ident :fibo-sec-fund-civ/limitedSharesAreIssued,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundShareClassUnit,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "limited shares are issued@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #xsd/langString
    "Whether or not new shares can be issued in the fund. This is what makes it a closed end or open end fund.@en"})

(def mainFundOrderDesk
  "Whether the fund order desk is the principal entity appointed by the fund to which orders should be submitted."
  {:db/ident :fibo-sec-fund-civ/mainFundOrderDesk,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "main fund order desk@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #xsd/langString
    "Whether the fund order desk is the principal entity appointed by the fund to which orders should be submitted.@en"})

(def maximumDeviation
  "Maximum allowable deviation from the benchmark."
  {:db/ident :fibo-sec-fund-civ/maximumDeviation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/PortfolioBenchmark,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "maximum deviation@en",
   :rdfs/range :fibo-fnd-utl-alx/Percentage,
   :skos/definition #xsd/langString
                     "Maximum allowable deviation from the benchmark.@en"})

(def maximumInvestmentAmount
  "Maximum amount that may be invested in the specified strategy."
  {:db/ident :fibo-sec-fund-civ/maximumInvestmentAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolioInvestmentLimitations,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "maximum investment amount@en",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   #xsd/langString
    "Maximum amount that may be invested in the specified strategy.@en"})

(def maximumInvestmentPercentage
  "Maximum percentage that may be invested in the specified strategy."
  {:db/ident :fibo-sec-fund-civ/maximumInvestmentPercentage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolioInvestmentLimitations,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "maximum investment percentage@en",
   :rdfs/range :fibo-fnd-utl-alx/Percentage,
   :skos/definition
   #xsd/langString
    "Maximum percentage that may be invested in the specified strategy.@en"})

(def maximumPurchasingFee
  "Maximum percentage or fixed amount of money due when purchasing fund shares Definition origin:EFAMA DD"
  {:db/ident :fibo-sec-fund-civ/maximumPurchasingFee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "maximum purchasing fee@en",
   :rdfs/range :fibo-fbc-pas-caa/Fee,
   :skos/definition
   #xsd/langString
    "Maximum percentage or fixed amount of money due when purchasing fund shares Definition origin:EFAMA DD@en"})

(def maximumRedemptionAmount
  "Maximum quantity of securities, expressed as an amount that can be sold."
  {:db/ident :fibo-sec-fund-civ/maximumRedemptionAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundRedemptionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "maximum redemption amount@en",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   #xsd/langString
    "Maximum quantity of securities, expressed as an amount that can be sold.@en"})

(def maximumRedemptionFee
  "Maximum percentage or fixed amount of money due when redeeming fund shares Definition origin:EFAMA DD"
  {:db/ident :fibo-sec-fund-civ/maximumRedemptionFee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "maximum redemption fee@en",
   :rdfs/range :fibo-fbc-pas-caa/Fee,
   :skos/definition
   #xsd/langString
    "Maximum percentage or fixed amount of money due when redeeming fund shares Definition origin:EFAMA DD@en"})

(def maximumRedemptionPercentage
  "Maximum quantity of securities, expressed as a percentage that can be sold."
  {:db/ident :fibo-sec-fund-civ/maximumRedemptionPercentage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundRedemptionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "maximum redemption percentage@en",
   :rdfs/range :fibo-fnd-utl-alx/Percentage,
   :skos/definition
   #xsd/langString
    "Maximum quantity of securities, expressed as a percentage that can be sold.@en"})

(def maximumRedemptionUnits
  "Maximum number of shares/units that may be redeemed on a single dealing day."
  {:db/ident :fibo-sec-fund-civ/maximumRedemptionUnits,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundRedemptionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "maximum redemption units@en",
   :rdfs/range :xsd/integer,
   :skos/definition
   #xsd/langString
    "Maximum number of shares/units that may be redeemed on a single dealing day.@en"})

(def mayAlsoBe
  "The unit issuer would be the fund administrator (except when it is a Bond)."
  {:db/ident :fibo-sec-fund-civ/mayAlsoBe,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundAdministrator,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "may also be@en",
   :rdfs/range :fibo-sec-fund-civ/UnitIssuer,
   :skos/definition
   #xsd/langString
    "The unit issuer would be the fund administrator (except when it is a Bond).@en"})

(def mayBe_1
  "may be"
  {:db/ident :fibo-sec-fund-civ/mayBe.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingForm,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "may be@en",
   :rdfs/range :fibo-sec-fund-civ/FundOrderDeskPhysicalFormDocument})

(def mayBeDefinedIn
  "may be defined in"
  {:db/ident :fibo-sec-fund-civ/mayBeDefinedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundsProcessingPassport,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "may be defined in@en",
   :rdfs/range :fibo-sec-fund-civ/FundProspectus})

(def minimumDeviation
  "Minimum allowable deviation from the benchmark."
  {:db/ident :fibo-sec-fund-civ/minimumDeviation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/PortfolioBenchmark,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "minimum deviation@en",
   :rdfs/range :fibo-fnd-utl-alx/Percentage,
   :skos/definition #xsd/langString
                     "Minimum allowable deviation from the benchmark.@en"})

(def minimumHoldingPeriod
  "Period, in days, during which the units/shares must be held following their issue before redemption will be permitted."
  {:db/ident :fibo-sec-fund-civ/minimumHoldingPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingGeneralTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "minimum holding period@en",
   :rdfs/range :cmns-dt/Duration,
   :skos/definition
   #xsd/langString
    "Period, in days, during which the units/shares must be held following their issue before redemption will be permitted.@en"})

(def minimumInitialSubscriptionAmount
  "Minimum initial subscription value."
  {:db/ident :fibo-sec-fund-civ/minimumInitialSubscriptionAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "minimum initial subscription amount@en",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition #xsd/langString "Minimum initial subscription value.@en"})

(def minimumInitialSubscriptionUnits
  "Minimum initial number of units/shares that must be purchased."
  {:db/ident :fibo-sec-fund-civ/minimumInitialSubscriptionUnits,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "minimum initial subscription units@en",
   :rdfs/range :xsd/integer,
   :skos/definition
   #xsd/langString
    "Minimum initial number of units/shares that must be purchased.@en"})

(def minimumInvestmentAmount
  "Minimum amount that has to be invested in the specified strategy."
  {:db/ident :fibo-sec-fund-civ/minimumInvestmentAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolioInvestmentLimitations,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "minimum investment amount@en",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   #xsd/langString
    "Minimum amount that has to be invested in the specified strategy.@en"})

(def minimumInvestmentPercentage
  "Minimum percentage that has to be invested in the specified strategy."
  {:db/ident :fibo-sec-fund-civ/minimumInvestmentPercentage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolioInvestmentLimitations,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "minimum investment percentage@en",
   :rdfs/range :fibo-fnd-utl-alx/Percentage,
   :skos/definition
   #xsd/langString
    "Minimum percentage that has to be invested in the specified strategy.@en"})

(def minimumRatingRestriction
  "The minimum rating of securities to be invested in."
  {:db/ident :fibo-sec-fund-civ/minimumRatingRestriction,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/InvestmentRestriction,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "minimum rating restriction@en",
   :rdfs/range :fibo-fnd-arr-rt/RatingScore,
   :skos/definition #xsd/langString
                     "The minimum rating of securities to be invested in.@en"})

(def minimumRemainingHoldingAmount
  "Minimum value of units/shares that must be retained to avoid automatic redemption."
  {:db/ident :fibo-sec-fund-civ/minimumRemainingHoldingAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingGeneralTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "minimum remaining holding amount@en",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   #xsd/langString
    "Minimum value of units/shares that must be retained to avoid automatic redemption.@en"})

(def minimumRemainingHoldingUnits
  "Minimum number of units/shares that must be retained to avoid automatic redemption."
  {:db/ident :fibo-sec-fund-civ/minimumRemainingHoldingUnits,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingGeneralTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "minimum remaining holding units@en",
   :rdfs/range :xsd/integer,
   :skos/definition
   #xsd/langString
    "Minimum number of units/shares that must be retained to avoid automatic redemption.@en"})

(def minimumSubscriptionAmount
  "Minimum subscription value for existing investors."
  {:db/ident :fibo-sec-fund-civ/minimumSubscriptionAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "minimum subscription amount@en",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition #xsd/langString
                     "Minimum subscription value for existing investors.@en"})

(def minimumSubscriptionUnits
  "Minimum number of units/shares that must be purchased by existing investors."
  {:db/ident :fibo-sec-fund-civ/minimumSubscriptionUnits,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "minimum subscription units@en",
   :rdfs/range :xsd/integer,
   :skos/definition
   #xsd/langString
    "Minimum number of units/shares that must be purchased by existing investors.@en"})

(def name
  "Name of the investment fund."
  {:db/ident :fibo-sec-fund-civ/name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "name@en",
   :rdfs/range :xsd/string,
   :skos/definition #xsd/langString "Name of the investment fund.@en"})

(def name_1
  "Name given to the defined strategy."
  {:db/ident :fibo-sec-fund-civ/name.1,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolioInvestmentPolicy,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "name@en",
   :rdfs/range :xsd/string,
   :skos/definition #xsd/langString "Name given to the defined strategy.@en"})

(def outlines
  "outlines"
  {:db/ident :fibo-sec-fund-civ/outlines,
   :owl/inverseOf :fibo-sec-fund-civ/statedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProspectus,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "outlines@en",
   :rdfs/range :fibo-sec-fund-civ/FundInvestmentObjective})

(def percentageInvested
  "The percentage of funds that is to be invested at any given time."
  {:db/ident :fibo-sec-fund-civ/percentageInvested,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/InvestmentRestriction,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "percentage invested@en",
   :rdfs/range :fibo-fnd-utl-alx/Percentage,
   :skos/definition
   #xsd/langString
    "The percentage of funds that is to be invested at any given time.@en"})

(def performanceDeterminationTimeframe
  "The timeframe on which the performance is reported (e.g. 1month, 1 year, YTD)."
  {:db/ident :fibo-sec-fund-civ/performanceDeterminationTimeframe,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/PerformanceDeterminationMethod,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "performance determination timeframe@en",
   :rdfs/range :cmns-dt/DatePeriod,
   :skos/definition
   #xsd/langString
    "The timeframe on which the performance is reported (e.g. 1month, 1 year, YTD).@en"})

(def performanceFee
  "Fees paid for the achivements of predefined outperformance objectives Definition origin:EFAMA DD"
  {:db/ident :fibo-sec-fund-civ/performanceFee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "performance fee@en",
   :rdfs/range :fibo-fbc-pas-caa/Fee,
   :skos/definition
   #xsd/langString
    "Fees paid for the achivements of predefined outperformance objectives Definition origin:EFAMA DD@en"})

(def physicalDocumentRequired
  "Whether a phsyical form is required through the main fund order desk. Yes: A phsyical form is required through the main fund order desk. No: A phsyical form is not required through the main fund order desk."
  {:db/ident :fibo-sec-fund-civ/physicalDocumentRequired,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingForm,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "physical document required@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #xsd/langString
    "Whether a phsyical form is required through the main fund order desk. Yes: A phsyical form is required through the main fund order desk. No: A phsyical form is not required through the main fund order desk.@en"})

(def processingCountry
  "Country in which the processing characteristic applies."
  {:db/ident :fibo-sec-fund-civ/processingCountry,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "processing country@en",
   :rdfs/range :lcc-cr/Country,
   :skos/definition
   #xsd/langString
    "Country in which the processing characteristic applies.@en"})

(def processingPartyHasIdentity
  "The organization which plays the role of the funds processing party"
  {:db/ident :fibo-sec-fund-civ/processingPartyHasIdentity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundsProcessingParty,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "processing party has identity@en",
   :rdfs/range :fibo-be-le-lp/LegalEntity,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/hasIdentity,
   :skos/definition
   #xsd/langString
    "The organization which plays the role of the funds processing party@en"})

(def productGroupDescription
  "Company specific description of a group of funds."
  {:db/ident :fibo-sec-fund-civ/productGroupDescription,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "product group description@en",
   :rdfs/range :xsd/string,
   :skos/definition #xsd/langString
                     "Company specific description of a group of funds.@en"})

(def promotedBy
  "promoted by"
  {:db/ident :fibo-sec-fund-civ/promotedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "promoted by@en",
   :rdfs/range :fibo-sec-fund-civ/FundPromoter,
   :rdfs/subPropertyOf :fibo-sec-fund-civ/fundHasRelatedParty})

(def providerHasIdentity
  "provider has identity"
  {:db/ident :fibo-sec-fund-civ/providerHasIdentity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-caa/AccountProvider,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "provider has identity@en",
   :rdfs/range :fibo-be-le-lp/LegalEntity,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/hasIdentity})

(def providesDepositaryServiceFor
  "provides depositary service for"
  {:db/ident :fibo-sec-fund-civ/providesDepositaryServiceFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundDepositary,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "provides depositary service for@en",
   :rdfs/range :fibo-sec-fund-fund/FundUnit})

(def purchasingFee
  "Actual percentage or fixed amount of money due when purchasing fund shares Definition origin:EFAMA DD"
  {:db/ident :fibo-sec-fund-civ/purchasingFee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "purchasing fee@en",
   :rdfs/range :fibo-fbc-pas-caa/Fee,
   :skos/definition
   #xsd/langString
    "Actual percentage or fixed amount of money due when purchasing fund shares Definition origin:EFAMA DD@en"})

(def redemptionCutoffDateTime
  "Last date/time at which an order to redeem can be given."
  {:db/ident :fibo-sec-fund-civ/redemptionCutoffDateTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundRedemptionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "redemption cutoff date time@en",
   :rdfs/range :cmns-dt/DateTime,
   :skos/definition
   #xsd/langString
    "Last date/time at which an order to redeem can be given.@en"})

(def redemptionCycleInBusinessDays
  "The last business day following the day on which a redemption order is priced (T) by which settlement will be due for orders placed with the main Fund Order Desk. Alternatively, if proceeds will be paid following receipt of written renunciation, the last business day following receipt of the relevant renunciation documentation by the main Fund Order Desk (R) by which the proceeds will be sent."
  {:db/ident :fibo-sec-fund-civ/redemptionCycleInBusinessDays,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-fi-stl/SettlementConvention,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "redemption cycle in business days@en",
   :rdfs/range :xsd/integer,
   :skos/definition
   #xsd/langString
    "The last business day following the day on which a redemption order is priced (T) by which settlement will be due for orders placed with the main Fund Order Desk. Alternatively, if proceeds will be paid following receipt of written renunciation, the last business day following receipt of the relevant renunciation documentation by the main Fund Order Desk (R) by which the proceeds will be sent.@en"})

(def redemptionDealingFrequency
  "Frequency at which the redemptions are done."
  {:db/ident :fibo-sec-fund-civ/redemptionDealingFrequency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundRedemptionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "redemption dealing frequency@en",
   :rdfs/range :fibo-fnd-dt-fd/RecurrenceInterval,
   :skos/definition #xsd/langString
                     "Frequency at which the redemptions are done.@en"})

(def redemptionFee
  "Actual percentage or fixed amount of money due when redeeming fund shares Definition origin:EFAMA DD"
  {:db/ident :fibo-sec-fund-civ/redemptionFee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "redemption fee@en",
   :rdfs/range :fibo-fbc-pas-caa/Fee,
   :skos/definition
   #xsd/langString
    "Actual percentage or fixed amount of money due when redeeming fund shares Definition origin:EFAMA DD@en"})

(def redemptionForm
  "Physical written instruction/renunciation form for redemption of units/shares by the investor."
  {:db/ident :fibo-sec-fund-civ/redemptionForm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundRedemptionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "redemption form@en",
   :rdfs/range :fibo-sec-fund-civ/FundProcessingForm,
   :skos/definition
   #xsd/langString
    "Physical written instruction/renunciation form for redemption of units/shares by the investor.@en"})

(def redemptionInAmountAllowed
  "Whether redemptions in amount are allowed."
  {:db/ident :fibo-sec-fund-civ/redemptionInAmountAllowed,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundRedemptionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "redemption in amount allowed@en",
   :rdfs/range :xsd/boolean,
   :skos/definition #xsd/langString
                     "Whether redemptions in amount are allowed.@en"})

(def redemptionPeriod
  "Specific period, eg, for some guaranteed funds, during which the units/shares may be redeemed."
  {:db/ident :fibo-sec-fund-civ/redemptionPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundRedemptionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "redemption period@en",
   :rdfs/range :cmns-dt/DatePeriod,
   :skos/definition
   #xsd/langString
    "Specific period, eg, for some guaranteed funds, during which the units/shares may be redeemed.@en"})

(def registrationDate
  "The date at which the fund is legally approved in a country other than the country of origin."
  {:db/ident :fibo-sec-fund-civ/registrationDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "registration date@en",
   :skos/definition
   #xsd/langString
    "The date at which the fund is legally approved in a country other than the country of origin.@en"})

(def reinvestmentFrequency
  "For units where there is Reinvestment distribution, the frequency with which the reinvestment takes place (this will be the same or less frequently than the Dividend Payment Frequency), otherwise this fact does not apply."
  {:db/ident :fibo-sec-fund-civ/reinvestmentFrequency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundReinvestmentPolicy,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "reinvestment frequency@en",
   :rdfs/range :fibo-fnd-dt-fd/RecurrenceInterval,
   :skos/definition
   #xsd/langString
    "For units where there is Reinvestment distribution, the frequency with which the reinvestment takes place (this will be the same or less frequently than the Dividend Payment Frequency), otherwise this fact does not apply.@en"})

(def signatureRequired
  "Whether a phsyical form with the investor's written signature is required through the main fund order desk. Yes:A phsyical form with the investor's written signature is required through the main fund order desk."
  {:db/ident :fibo-sec-fund-civ/signatureRequired,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingForm,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "signature required@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #xsd/langString
    "Whether a phsyical form with the investor's written signature is required through the main fund order desk. Yes:A phsyical form with the investor's written signature is required through the main fund order desk.@en"})

(def statedDistributionFee
  "stated distribution fee"
  {:db/ident :fibo-sec-fund-civ/statedDistributionFee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProspectus,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "stated distribution fee@en",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount})

(def statedIn
  "stated in"
  {:db/ident :fibo-sec-fund-civ/statedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundInvestmentObjective,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "stated in@en",
   :rdfs/range :fibo-sec-fund-civ/FundProspectus})

(def statedInvestmentAim
  "The stated aim of the Fund in words, e.g outperfom a given benchmark."
  {:db/ident :fibo-sec-fund-civ/statedInvestmentAim,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundInvestmentObjective,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "stated investment aim@en",
   :rdfs/range :xsd/string,
   :skos/definition
   #xsd/langString
    "The stated aim of the Fund in words, e.g outperfom a given benchmark.@en"})

(def statedManagementFee
  "The fee that is stated in the Prospectus as being what is to be charged for management. Further notes: Can be monetary amount or a percentage or a combination. Action: simple type is wrong."
  {:db/ident :fibo-sec-fund-civ/statedManagementFee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProspectus,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "stated management fee@en",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   #xsd/langString
    "The fee that is stated in the Prospectus as being what is to be charged for management. Further notes: Can be monetary amount or a percentage or a combination. Action: simple type is wrong.@en"})

(def statedObjective
  "The stated objective of the fund, in words."
  {:db/ident :fibo-sec-fund-civ/statedObjective,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProspectus,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "stated objective@en",
   :rdfs/range :xsd/string,
   :skos/definition #xsd/langString
                     "The stated objective of the fund, in words.@en"})

(def stipulatesBenchmark
  "stipulates benchmark"
  {:db/ident :fibo-sec-fund-civ/stipulatesBenchmark,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundInvestmentPolicy,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "stipulates benchmark@en",
   :rdfs/range :fibo-ind-ind-ind/MarketRate})

(def subscriptionCutoffDateTime
  "Last date/time at which an order to subscribe can be given."
  {:db/ident :fibo-sec-fund-civ/subscriptionCutoffDateTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "subscription cutoff date time@en",
   :rdfs/range :cmns-dt/DateTime,
   :skos/definition
   #xsd/langString
    "Last date/time at which an order to subscribe can be given.@en"})

(def subscriptionDealingFrequency
  "Frequency at which the subscriptions are done."
  {:db/ident :fibo-sec-fund-civ/subscriptionDealingFrequency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "subscription dealing frequency@en",
   :rdfs/range :fibo-fnd-dt-fd/RecurrenceInterval,
   :skos/definition #xsd/langString
                     "Frequency at which the subscriptions are done.@en"})

(def subscriptionPeriod
  "Specific period, eg, for some guaranteed funds, during which the units/shares may be subscribed to."
  {:db/ident :fibo-sec-fund-civ/subscriptionPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "subscription period@en",
   :rdfs/range :cmns-dt/DatePeriod,
   :skos/definition
   #xsd/langString
    "Specific period, eg, for some guaranteed funds, during which the units/shares may be subscribed to.@en"})

(def subscriptionsInAmountAllowed
  "Whether subscriptions in amount are allowed."
  {:db/ident :fibo-sec-fund-civ/subscriptionsInAmountAllowed,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "subscriptions in amount allowed@en",
   :rdfs/range :xsd/boolean,
   :skos/definition #xsd/langString
                     "Whether subscriptions in amount are allowed.@en"})

(def subsequentApplicationForm
  "Physical application form for subsequent investments by the same investor."
  {:db/ident :fibo-sec-fund-civ/subsequentApplicationForm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "subsequent application form@en",
   :rdfs/range :fibo-sec-fund-civ/FundProcessingForm,
   :skos/definition
   #xsd/langString
    "Physical application form for subsequent investments by the same investor.@en"})

(def supervisedBy
  "supervised by"
  {:db/ident :fibo-sec-fund-civ/supervisedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "supervised by@en",
   :rdfs/range :fibo-sec-fund-civ/FundSupervisoryAuthority})

(def switchingChargeable
  "Whether a switching charge for changing between sub-funds of the same umbrella can be applied."
  {:db/ident :fibo-sec-fund-civ/switchingChargeable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingGeneralTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "switching chargeable@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #xsd/langString
    "Whether a switching charge for changing between sub-funds of the same umbrella can be applied.@en"})

(def switchingFee
  "Actual percentage or fixed amount of money due when switching to another fund. Definition origin:EFAMA DD"
  {:db/ident :fibo-sec-fund-civ/switchingFee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "switching fee@en",
   :rdfs/range :fibo-fbc-pas-caa/Fee,
   :skos/definition
   #xsd/langString
    "Actual percentage or fixed amount of money due when switching to another fund. Definition origin:EFAMA DD@en"})

(def takesFormOf
  "takes form of"
  {:db/ident :fibo-sec-fund-civ/takesFormOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/BricksAndMortarHolding,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "takes form of@en",
   :rdfs/range :fibo-fnd-plc-loc/RealEstate,
   :rdfs/subPropertyOf :cmns-col/comprises})

(def trackingError
  "See RiskFactors narrative in EFAMA DD"
  {:db/ident :fibo-sec-fund-civ/trackingError,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/InvestmentRestriction,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "tracking error@en",
   :rdfs/range :fibo-fnd-utl-alx/Percentage,
   :skos/definition #xsd/langString "See RiskFactors narrative in EFAMA DD@en"})

(def typeOfSecurities
  "The type of securities or other holdings that may be invested in."
  {:db/ident :fibo-sec-fund-civ/typeOfSecurities,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/InvestmentRestriction,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "type of securities@en",
   :rdfs/range :xsd/string,
   :skos/definition
   #xsd/langString
    "The type of securities or other holdings that may be invested in.@en"})

(def valuationFrequency
  "Frequency of the net asset value calculation."
  {:db/ident :fibo-sec-fund-civ/valuationFrequency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/NetAssetValueCalculationMethod,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "valuation frequency@en",
   :rdfs/range :fibo-fnd-dt-fd/RecurrenceInterval,
   :skos/definition #xsd/langString
                     "Frequency of the net asset value calculation.@en"})

(def valuationFrequencyTextualDescription
  "Description of the frequency of the net asset value calculation."
  {:db/ident :fibo-sec-fund-civ/valuationFrequencyTextualDescription,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/NetAssetValueCalculationMethod,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "valuation frequency textual description@en",
   :rdfs/range :xsd/string,
   :skos/definition
   #xsd/langString
    "Description of the frequency of the net asset value calculation.@en"})

(def valueAtRisk
  "See RiskClassification_NameOf in EFAMA DD Applies to Fund not Portfolio."
  {:db/ident :fibo-sec-fund-civ/valueAtRisk,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/InvestmentRestriction,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label #xsd/langString "value at risk@en",
   :rdfs/range :fibo-fnd-utl-alx/Percentage,
   :skos/definition
   #xsd/langString
    "See RiskClassification_NameOf in EFAMA DD Applies to Fund not Portfolio.@en"})