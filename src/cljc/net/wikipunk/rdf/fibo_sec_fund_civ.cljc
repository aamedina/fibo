(ns net.wikipunk.rdf.fibo-sec-fund-civ
  {:cmns-av/copyright "Copyright (c) 2013-2024 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Funds/CollectiveInvestmentVehicles/",
   :dcterms/abstract
   "Reference data terms and non time dependent facts about funds and CIVs.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-qtu" "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
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
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
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
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Law/LegalCapacity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/OwnershipAndControl/OwnershipParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/SecuritiesRestrictions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/Ratings/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/Indicators/Indicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Organizations/Organizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/SecuritiesClassification/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/Lifecycles/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/SecurityAssets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Law/LegalCore/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/SecuritiesIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/ProductsAndServices/ClientsAndAccounts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Equities/EquityInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Accounting/AccountingEquity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/SecuritiesIdentification/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Funds/Funds/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/CorporateBodies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FinancialInstruments/Settlement/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/DatesAndTimes/BusinessDates/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-fund-civ",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Collective Investment Vehicles Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"}
  (:refer-clojure :exclude [name]))

(def AccumulatingShareClass
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This fact would be determined by the fund unit having a specific Fund Distribution Policy of Accumulating."},
   :db/ident :fibo-sec-fund-civ/AccumulatingShareClass,
   :owl/disjointWith :fibo-sec-fund-civ/DistributingShareClass,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "accumulating share class"},
   :rdfs/subClassOf :fibo-sec-fund-civ/FundShareClassUnit,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A share class in which there is no option to reinvest."}})

(def AnnualReportingPolicy
  {:db/ident :fibo-sec-fund-civ/AnnualReportingPolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "annual reporting policy"},
   :rdfs/subClassOf :fibo-sec-fund-civ/ReportingFrequencyPolicy,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Reports are presented once a year"}})

(def AnnualizedPerformanceDeterminationMethod
  {:db/ident :fibo-sec-fund-civ/AnnualizedPerformanceDeterminationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "annualized performance determination method"},
   :rdfs/subClassOf :fibo-sec-fund-civ/PerformanceDeterminationMethod,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Annualized performance determination."}})

(def AssetClassStrategy
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "EFAMA: The type of securities or other holdings that may be invested in. FIBIM: Strategy which is asset class based. Can implement this in terms of a classification of those things. Wording implies this is a policy."},
   :db/ident :fibo-sec-fund-civ/AssetClassStrategy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "asset class strategy"},
   :rdfs/subClassOf
   #{:fibo-sec-fund-civ/FundPortfolioInvestmentLimitations
     {:owl/onProperty     :fibo-sec-fund-civ/identifiesAssetTypesBy,
      :owl/someValuesFrom :fibo-sec-sec-cls/FinancialInstrumentClassifier,
      :rdf/type           :owl/Restriction}},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Strategy which is asset class based."}})

(def BricksAndMortarHolding
  {:db/ident :fibo-sec-fund-civ/BricksAndMortarHolding,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bricks and mortar holding"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-sec-fund-civ/takesFormOf,
                       :owl/someValuesFrom :fibo-fnd-plc-loc/RealEstate,
                       :rdf/type           :owl/Restriction}
                      :fibo-sec-sec-ast/PortfolioHolding},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A holding of built property."}})

(def CommonShareInFund
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "SR Review session notes: US: Closed and open ended funds may have common and preferred shares."},
   :db/ident :fibo-sec-fund-civ/CommonShareInFund,
   :owl/disjointWith :fibo-sec-fund-civ/PreferredShareInFund,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "common share in fund"},
   :rdfs/subClassOf :fibo-sec-fund-civ/FundShareClassUnit,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A share unit in a fund, which is classified as a Common Share class."}})

(def CurrencyStrategy
  {:db/ident :fibo-sec-fund-civ/CurrencyStrategy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "currency strategy"},
   :rdfs/subClassOf :fibo-sec-fund-civ/FundPortfolioInvestmentLimitations,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Strategy which is currency based."}})

(def DebtStakeInFund
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Note that you cannot buy fractional amounts in a bond. Review Session Note: Similar to what happens in a CDO where the collaterial manager and the issuer are two different entities. So model this along the same lines as the SPV in the structured finance model. Therefore: further modeling and review required"},
   :db/ident :fibo-sec-fund-civ/DebtStakeInFund,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt stake in fund"},
   :rdfs/subClassOf :fibo-sec-fund-civ/StakeInFund,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A stake held in a fund by way of a Bond Unit."}})

(def DistributingShareClass
  {:db/ident :fibo-sec-fund-civ/DistributingShareClass,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "distributing share class"},
   :rdfs/subClassOf :fibo-sec-fund-civ/FundShareClassUnit})

(def EquityAsset
  {:db/ident :fibo-sec-fund-civ/EquityAsset,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity asset"},
   :rdfs/subClassOf #{{:owl/allValuesFrom :fibo-sec-eq-eq/Share,
                       :owl/onProperty    :cmns-rlcmp/isPlayedBy,
                       :rdf/type          :owl/Restriction}
                      :fibo-sec-sec-ast/PortfolioHolding},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The holding of equity securities in a portfolio."}})

(def EquityFund
  {:db/ident :fibo-sec-fund-civ/EquityFund,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity fund"},
   :rdfs/subClassOf #{:fibo-sec-fund-fund/CollectiveInvestmentVehicle
                      {:owl/onProperty     :cmns-col/comprises,
                       :owl/someValuesFrom :fibo-sec-fund-civ/EquityPortfolio,
                       :rdf/type           :owl/Restriction}},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A fund which invests in at least 85% shares."}})

(def EquityPortfolio
  {:db/ident :fibo-sec-fund-civ/EquityPortfolio,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity portfolio"},
   :rdfs/subClassOf :fibo-sec-fund-civ/FundPortfolio,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A portfolio which has at least 85% exposure to shares."}})

(def EquityStakeInFund
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Theoretically you can buy a fraction of a share in a fund. This would depend on the legal structure of the fund, e.g. a minimum investment. There is always a distribution plan."},
   :db/ident :fibo-sec-fund-civ/EquityStakeInFund,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity stake in fund"},
   :rdfs/subClassOf :fibo-sec-fund-civ/StakeInFund,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A stake held in a fund by way of a Share Class Unit."}})

(def FondsCommunDePlacement
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "FCP"},
   :db/ident :fibo-sec-fund-civ/FondsCommunDePlacement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "fr-FR",
                :rdf/value    "fonds commun de placement"},
   :rdfs/seeAlso
   #{{:xsd/anyURI
      "https://iclg.com/practice-areas/public-investment-funds-laws-and-regulations/france"}
     {:xsd/anyURI
      "https://www.ubp.com/en/glossary-risk-management/glossary-legal-compliance/fcp"}
     {:xsd/anyURI
      "https://www.alfi.lu/en-gb/understandinginvesting/post/which-structure-to-choose"}},
   :rdfs/subClassOf :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "open-ended collective investment fund, which is a contractual form set up between the fund manager and investors and not a separate legal entity"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "An FCP is similar to a unit trust in the UK. FCPs are not investment companies, but more like open partnerships. They can be set up as a single fund or as an umbrella fund with multiple sub-funds, typically issued in the French-speaking countries of Europe."}})

(def FundAccountant
  {:db/ident :fibo-sec-fund-civ/FundAccountant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund accountant"},
   :rdfs/subClassOf :fibo-sec-fund-civ/FundsProcessingParty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The party that keeps accounting records of the available assets and liabilities of the Fund. It calculates dealing prices, the Net Asset Value (NAV) of the Fund, and may provide fund performance and tax data. Can be subcontracted by the FundAdministrator."}})

(def FundAdministrator
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "If the unit is a bond, then the issuer is separate from the Fund Administrator. WG11 text: The party in charge of financial accounting, NAV calculation, management and performance fee calculation. Can also be in charge of orders centralisation and registration. Definition origin:EFAMA DD"},
   :db/ident :fibo-sec-fund-civ/FundAdministrator,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund administrator"},
   :rdfs/subClassOf #{:fibo-sec-fund-civ/FundsProcessingParty
                      {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
                       :owl/someValuesFrom :fibo-be-le-lp/LegalEntity,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-sec-fund-civ/mayAlsoBe,
                       :owl/someValuesFrom :fibo-sec-fund-civ/UnitIssuer,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Entity that has to fulfil the legal and supervisory requirements of the fund. Responsible for all the business purposes around the investment pool, and so is reponsible for the issuing of the shares."}})

(def FundAuditor
  {:db/ident :fibo-sec-fund-civ/FundAuditor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund auditor"},
   :rdfs/subClassOf :fibo-sec-fund-civ/FundsProcessingParty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The party that is in charge of examining and verifying a fund's financial and accounting records as well as supporting documents and fulfilment of legal requirements. Definition origin:EFAMA DD"}})

(def FundBondClassUnit
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "From EFAMA Review: called denominations e.g. issued in $5000 pieces. You cannot buy fractional amounts in a bond."},
   :db/ident :fibo-sec-fund-civ/FundBondClassUnit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund bond class unit"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-agr-ctr/definesTermsFor,
      :owl/someValuesFrom :fibo-sec-fund-civ/FundDebt,
      :rdf/type           :owl/Restriction} :fibo-sec-fund-fund/FundUnit
     {:owl/onProperty     :fibo-sec-fund-civ/hasExpectedCoupon,
      :owl/someValuesFrom :fibo-sec-fund-civ/FundBondUnitCoupon,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-gao-obj/hasStrategy,
      :owl/someValuesFrom :fibo-sec-fund-civ/FundUnitDistributionPolicy,
      :rdf/type           :owl/Restriction}},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A fund unit which takes the form of debt in that fund."}})

(def FundBondUnitCoupon
  {:db/ident :fibo-sec-fund-civ/FundBondUnitCoupon,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund bond unit coupon"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-sec-fund-civ/hasPolicyTerms,
                       :owl/someValuesFrom :fibo-sec-fund-civ/FundCouponPolicy,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-acc-cur/InterestRate},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "A fixed coupon paid out to holders of the Fund Bond Unit."}})

(def FundCashDistributionPolicy
  {:db/ident :fibo-sec-fund-civ/FundCashDistributionPolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund cash distribution policy"},
   :rdfs/subClassOf :fibo-sec-fund-civ/FundUnitDistributionPolicy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Policy for distribution of cash dividends or notes in the event that the fund units have a distribution policy of \"Cash\" rather than \"Reinvestment\"."}})

(def FundClassification
  {:db/ident :fibo-sec-fund-civ/FundClassification,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund classification"},
   :rdfs/subClassOf #{:cmns-cls/Classifier
                      {:owl/onProperty :cmns-cls/classifies,
                       :owl/someValuesFrom
                       :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The category of the fund according to the asset class. This is a published code by which the Fund is classified. Further notes: Could be EFCF codes. This is the way in which \"Type of fund\" is articulated."}})

(def FundClassificationScheme
  {:db/ident :fibo-sec-fund-civ/FundClassificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund classification scheme"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-dsg/defines,
      :owl/someValuesFrom :fibo-sec-fund-civ/FundClassification,
      :rdf/type           :owl/Restriction} :cmns-cls/ClassificationScheme},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A published scheme for the category of a fund according to the asset class."}})

(def FundCouponPolicy
  {:db/ident :fibo-sec-fund-civ/FundCouponPolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund coupon policy"},
   :rdfs/subClassOf :fibo-sec-fund-civ/FundCashDistributionPolicy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Terms for the expected distribution of bond unit coupons."}})

(def FundDataProvider
  {:db/ident :fibo-sec-fund-civ/FundDataProvider,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund data provider"},
   :rdfs/subClassOf #{:fibo-sec-fund-civ/FundsProcessingParty
                      {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
                       :owl/someValuesFrom :fibo-be-le-lp/LegalEntity,
                       :rdf/type           :owl/Restriction}},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A party which supplies market data to a fund."}})

(def FundDebt
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This would normally be held by participants in that pool. in this case the pool is a fund which is formed by each of the participants extending credit to that pool and holding bond units in the pool representing that debt."},
   :db/ident :fibo-sec-fund-civ/FundDebt,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund debt"},
   :rdfs/subClassOf :fibo-fbc-dae-dbt/Debt,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Debt issued by a Fund."}})

(def FundDepositary
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The depository may delegate custody to another entity (custodian). Definition origin:EFAMA DD"},
   :db/ident :fibo-sec-fund-civ/FundDepositary,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund depositary"},
   :rdfs/subClassOf #{:fibo-sec-fund-civ/FundsProcessingParty
                      {:owl/onProperty
                       :fibo-sec-fund-civ/providesDepositaryServiceFor,
                       :owl/someValuesFrom :fibo-sec-fund-fund/FundUnit,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The party that holds and safeguards holdings owned by a fund. It is also responsible for compliance of the portfolio with legal ratios etc."}})

(def FundDistributionPolicy
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Note that individual classes of Fund Unit also have specific distribution polcies as they effect that class of unit. This class is for terms with wording of the form: \" ... whether or not it is possible to hold shares ...\" for a given parameter."},
   :db/ident :fibo-sec-fund-civ/FundDistributionPolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund distribution policy"},
   :rdfs/subClassOf :fibo-fnd-law-lcap/Policy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "policy indicating the overall strategy or limitations on distribution for the fund"}})

(def FundDistributor
  {:db/ident :fibo-sec-fund-civ/FundDistributor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund distributor"},
   :rdfs/subClassOf :fibo-sec-fund-civ/FundsProcessingParty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "an entity through which a fund may be bought by or for an investor. This may be on a discretionary or advisory basis, or as an execution-only service. Definition origin:EFAMA DD"}})

(def FundDividendPolicy
  {:db/ident :fibo-sec-fund-civ/FundDividendPolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund dividend policy"},
   :rdfs/subClassOf :fibo-sec-fund-civ/FundCashDistributionPolicy,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Terms for the expected distributions of dividends."}})

(def FundInvestmentObjective
  {:db/ident :fibo-sec-fund-civ/FundInvestmentObjective,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund investment objective"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-sec-fund-civ/hasIntendedRiskLevel,
                       :owl/someValuesFrom :fibo-sec-fund-civ/RiskLevel,
                       :rdf/type :owl/Restriction}
                      :fibo-fnd-gao-obj/InvestmentObjective
                      {:owl/onProperty     :fibo-sec-fund-civ/statedIn,
                       :owl/someValuesFrom :fibo-sec-fund-civ/FundProspectus,
                       :rdf/type           :owl/Restriction}},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The aim of a Fund e.g outperfom a given benchmark."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "This could be broken down into other terms that can be itemised here, that are not in the EFAMA DD explicitly. Examples may include: - Risk level - Return - Exposure to different markets"}})

(def FundInvestmentPolicy
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "EFAMA Note: Model distinguishes between strategy (what you intend to invest in) and portfolio structure (what is held). This semantics matches the EFAMA DD \"Fund Investment Policy\" No stated definition in EFAMA DD (\"Further discussion required\")."},
   :db/ident :fibo-sec-fund-civ/FundInvestmentPolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund investment policy"},
   :rdfs/subClassOf
   #{:fibo-fnd-law-lcap/Policy
     {:owl/onProperty     :fibo-fnd-rel-rel/governs,
      :owl/someValuesFrom :fibo-sec-fund-civ/PortfolioInvestmentStrategy,
      :rdf/type           :owl/Restriction}
     {:owl/maxQualifiedCardinality 1,
      :owl/onClass    :fibo-ind-ind-ind/MarketRate,
      :owl/onProperty :fibo-sec-fund-civ/stipulatesBenchmark,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :cmns-dsg/defines,
      :owl/someValuesFrom :fibo-sec-fund-civ/InvestmentRestriction,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "policy that the fund implements in order to achieve the stated fund objectives"}})

(def FundLegalFormDocumentation
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "From ISO FIBIM \"Umbrella Fund\" narrative: In securities, a collective investment scheme that has a contractual or a corporate form. When it has a contractual form, a fund is constituted under either the law of contract or under the trust law and thus it is not a legal entity. In its corporate form, a fund is a legal entity and is structured as a company."},
   :db/ident :fibo-sec-fund-civ/FundLegalFormDocumentation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund legal form documentation"},
   :rdfs/subClassOf :fibo-fnd-law-cor/Constitution,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "For a fund which is constituted under the law of contract, the constitution or articles that define the fund. These are embodied in a Contract."}})

(def FundManagementCompany
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "In the US: operates on a percentage of the Portfolio assets under management."},
   :db/ident :fibo-sec-fund-civ/FundManagementCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund management company"},
   :rdfs/subClassOf :fibo-be-le-lp/LegalEntity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The party that sets up the fund, decides the investment strategy, appoints the agents, and is responsible for the promotion and the marketing of the fund. It makes all of the important decisions related to the fund. Also called fund promotor or fund sponsor or fund manager."}})

(def FundManager
  {:db/ident :fibo-sec-fund-civ/FundManager,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund manager"},
   :rdfs/subClassOf #{:fibo-sec-fund-civ/FundsProcessingParty
                      {:owl/onProperty :cmns-rlcmp/isPlayedBy,
                       :owl/someValuesFrom
                       :fibo-sec-fund-civ/FundManagementCompany,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The party that sets up the fund, decides the investment strategy, appoints the agents, and is responsible for the promotion and the marketing of the fund. It makes all of the important decisions related to the fund. Also called fund promotor or fund sponsor. This is a dupliucate of Fund Management Company at the moment"}})

(def FundOrderDesk
  {:db/ident :fibo-sec-fund-civ/FundOrderDesk,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund order desk"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-rlcmp/isPlayedBy,
                       :owl/someValuesFrom :fibo-be-le-lp/LegalEntity,
                       :rdf/type           :owl/Restriction}
                      :fibo-fbc-pas-caa/AccountProvider},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The Fund Order Desk is a party to the Fund Order Desk Account."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "This party would presumably be identified as the Fund Management Company in terms of what legal entity fulcils this role? to be determined at further review."}})

(def FundOrderDeskPhysicalFormDocument
  {:db/ident :fibo-sec-fund-civ/FundOrderDeskPhysicalFormDocument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund order desk physical form document"},
   :rdfs/subClassOf :cmns-doc/Document,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "A phsyical form obtained through the main fund order desk."}})

(def FundPortfolio
  {:db/ident :fibo-sec-fund-civ/FundPortfolio,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund portfolio"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-acc-cur/hasMonetaryAmount,
      :owl/someValuesFrom :fibo-fbc-pas-caa/Balance,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-sec-fund-civ/hasLiquidity,
      :owl/someValuesFrom :fibo-sec-fund-civ/Liquidity,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-sec-fund-civ/assessedAgainst,
      :owl/someValuesFrom :fibo-sec-fund-civ/PortfolioBenchmark,
      :rdf/type           :owl/Restriction} :fibo-sec-sec-ast/Portfolio
     {:owl/onProperty     :cmns-col/hasConstituent,
      :owl/someValuesFrom :fibo-sec-sec-ast/PortfolioHolding,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-sec-fund-civ/hasInvestmentStrategy,
      :owl/someValuesFrom :fibo-sec-fund-civ/PortfolioInvestmentStrategy,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-sec-fund-civ/implementsFundPolicy,
      :owl/someValuesFrom :fibo-sec-fund-civ/FundPortfolioInvestmentPolicy,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-rel-rel/isManagedBy,
      :owl/someValuesFrom :fibo-sec-fund-civ/PortfolioManager,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An account containing a number of financial instruments along with cash positions in one or more currencies and belonging to a Fund"}})

(def FundPortfolioInvestmentLimitations
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Defined as \"Strategy\" in FIBIM and elsewhere. WG11: Rough allocation of the portfolio."},
   :db/ident :fibo-sec-fund-civ/FundPortfolioInvestmentLimitations,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund portfolio investment limitations"},
   :rdfs/subClassOf :fibo-sec-fund-civ/InvestmentRestriction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Detailed Policy on approximately how the portfolio is to be allocated to achieve the stated investment goals. This underpins the detailed strategy of how to achieve this."}})

(def FundPortfolioInvestmentPolicy
  {:cmns-av/explanatoryNote {:rdf/language "en",
                             :rdf/value
                             "ISO FIBIM: Rough allocation of the portfolio."},
   :db/ident :fibo-sec-fund-civ/FundPortfolioInvestmentPolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund portfolio investment policy"},
   :rdfs/subClassOf
   #{:fibo-fnd-law-lcap/Policy
     {:owl/onProperty     :fibo-sec-fund-civ/definesAllocations,
      :owl/someValuesFrom :fibo-sec-fund-civ/FundPortfolioInvestmentLimitations,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-rel-rel/governs,
      :owl/someValuesFrom :fibo-sec-fund-civ/PortfolioInvestmentStrategy,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "policy with respect to allocation of the portfolio that is designed to meet the stated investment strategy and goals"}})

(def FundProcessingForm
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Equates to the \"Physical Form\" in SIO FIBIM for certain activities in funds processing. May or may not be a written physical document. ISO FIBIM Definition: Specifies whether a physical form is required."},
   :db/ident :fibo-sec-fund-civ/FundProcessingForm,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund processing form"},
   :rdfs/subClassOf #{{:owl/maxQualifiedCardinality 1,
                       :owl/onClass
                       :fibo-sec-fund-civ/FundOrderDeskPhysicalFormDocument,
                       :owl/onProperty :fibo-sec-fund-civ/mayBe.1,
                       :rdf/type :owl/Restriction} :cmns-doc/Document},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The form of documentation or control mechanism required for some funds processing activity."}})

(def FundProcessingGeneralTerms
  {:db/ident :fibo-sec-fund-civ/FundProcessingGeneralTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund processing general terms"},
   :rdfs/subClassOf :fibo-sec-fund-civ/FundProcessingTerms,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Formal terms for general processing of the fund. These set out what the investor and the fund may or may not do."}})

(def FundProcessingTerms
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "These include Fund Subscription Terms, Fund Redemption Terms. and terms which relate to general processing and restrictions or otherwise on the holder. FPP notes: FPP presentation identifies many of these terms under the heading of Valuation Dealing characteristics. May need to revise which goes where in line with FPP. See also terms under NAV Valuation Calculation Method. Others of these terms appear in FPP under Instrument Restrictions. These cover the subscription, redemption and holding amounts and units and minimum holding period."},
   :db/ident :fibo-sec-fund-civ/FundProcessingTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund processing terms"},
   :rdfs/subClassOf
   #{:fibo-fnd-agr-ctr/ContractualCommitment
     {:owl/onProperty     :fibo-sec-fund-civ/definesMainFundOrderDeskAccount,
      :owl/someValuesFrom :fibo-sec-fund-civ/FundsProcessingAccount,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-sec-fund-civ/hasDefaultSettlementConvention,
      :owl/someValuesFrom :fibo-fbc-fi-stl/SettlementConvention,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Formal terms for processing of the fund. These set out what the investor and the fund may or may not do. These include terms for redemption and subscription processing as well as general processing terms. ISO FIBIM definition: Processing characteristics linked to the instrument, ie, not to the market."}})

(def FundPromoter
  {:db/ident :fibo-sec-fund-civ/FundPromoter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund promoter"},
   :rdfs/subClassOf :fibo-sec-fund-civ/FundsProcessingParty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An entity that promotes a fund. May be an investor, pension fund, bank, insurance company or management company"}})

(def FundProspectus
  {:db/ident :fibo-sec-fund-civ/FundProspectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund prospectus"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-sec-fund-civ/anticipates,
      :owl/someValuesFrom :fibo-ind-ind-ind/MarketRate,
      :rdf/type           :owl/Restriction} :fibo-sec-sec-iss/Prospectus
     {:owl/onProperty     :fibo-sec-fund-civ/outlines,
      :owl/someValuesFrom :fibo-sec-fund-civ/FundInvestmentObjective,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The Prospectus for the Fund. This is a document made available publicly for potential investors. It will include facts about the fund investment objective, investment focus and other details of the fund. Some of this information becomes binding on the fund once it is issued, while other information is guidelines only."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "EFAMA Review description for this: The fund is issued with a prospectus; there is material in the prospectus that is binding; material that is expected but not binding, and information that may or may not be in the prospectus or a given fund."}})

(def FundRedemptionRestriction
  {:db/ident :fibo-sec-fund-civ/FundRedemptionRestriction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund redemption restriction"},
   :rdfs/subClassOf :fibo-sec-sec-rst/SecuritiesRestriction})

(def FundRedemptionTerms
  {:db/ident :fibo-sec-fund-civ/FundRedemptionTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund redemption terms"},
   :rdfs/subClassOf
   #{{:owl/onProperty :fibo-sec-fund-civ/hasAdditionalRedemptionRestrictions,
      :owl/someValuesFrom :fibo-sec-fund-civ/ReferToFundOrderDesk,
      :rdf/type :owl/Restriction} :fibo-sec-fund-civ/FundProcessingTerms},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Formal terms for redemption of units in the fund. These set out what the investor and the fund may or may not do."}})

(def FundReinvestmentPolicy
  {:db/ident :fibo-sec-fund-civ/FundReinvestmentPolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund reinvestment policy"},
   :rdfs/subClassOf :fibo-sec-fund-civ/FundUnitDistributionPolicy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Terms for the expected reinvestment of profits on fund units."}})

(def FundReportingTerms
  {:db/ident :fibo-sec-fund-civ/FundReportingTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund reporting terms"},
   :rdfs/subClassOf
   #{:fibo-fnd-agr-ctr/ContractualCommitment
     {:owl/onProperty     :fibo-sec-fund-civ/hasAccountingReportingFrequency,
      :owl/someValuesFrom :fibo-sec-fund-civ/ReportingFrequencyPolicy,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Terms describing the accounting methods and reporting arrangements used by the fund."}})

(def FundShareClassUnit
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "From review sessions: Theoretically you can buy a fraction of a share in a fund. This would depend on the legal structure of the fund, e.g. a minimum investment. There is always a distribution plan."},
   :db/ident :fibo-sec-fund-civ/FundShareClassUnit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund share class unit"},
   :rdfs/subClassOf #{:fibo-sec-fund-fund/FundUnit
                      {:owl/onProperty :fibo-fnd-gao-obj/hasStrategy,
                       :owl/someValuesFrom
                       :fibo-sec-fund-civ/FundUnitDistributionPolicy,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The legal structure in which you can purchase part of an investment pool, defined by a variety of characteristics like investor type, minimum size of investment, distribution type, fee and currency. A fund unit which gives the holder an equity stake in the fund."}})

(def FundSubscriptionTerms
  {:db/ident :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund subscription terms"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-cxtdsg/appliesTo,
                       :owl/someValuesFrom :fibo-sec-fund-fund/FundUnit,
                       :rdf/type           :owl/Restriction}
                      :fibo-sec-fund-civ/FundProcessingTerms},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Subscription terms for the fund. Further notes: ISO FIBIM, EFAMA DD and FPP combine terms for subscription, redemption and general holding requirements. These have been separated here as they are different kinds of term, but this can be reviewed. Subscription Terms are identified as terms of the fund and not the fund unit, since terms for how you might subscribe can't be binding one someone who has not yet subscribed."}})

(def FundSupervisoryAuthority
  {:db/ident :fibo-sec-fund-civ/FundSupervisoryAuthority,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund supervisory authority"},
   :rdfs/subClassOf :cmns-pts/PartyRole,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "party that supervises the fund or fund industry"}})

(def FundTransferAgent
  {:db/ident :fibo-sec-fund-civ/FundTransferAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund transfer agent"},
   :rdfs/subClassOf :fibo-sec-fund-civ/FundsProcessingParty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An entity that undertakes the execution of subscription, redemption and switch orders on behalf of a fund. Definition origin:EFAMA DD"}})

(def FundUnitDistributionMethod
  {:db/ident :fibo-sec-fund-civ/FundUnitDistributionMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund unit distribution method"},
   :rdfs/subClassOf :fibo-fnd-gao-obj/DistributionStrategy,
   :skos/definition {:rdf/language "en",
                     :rdf/value "The normal distribution policy for funds."}})

(def FundUnitDistributionPolicy
  {:db/ident :fibo-sec-fund-civ/FundUnitDistributionPolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund unit distribution policy"},
   :rdfs/subClassOf #{:fibo-fnd-law-lcap/Policy
                      {:owl/onProperty :fibo-fnd-gao-obj/hasStrategy,
                       :owl/someValuesFrom
                       :fibo-sec-fund-civ/FundUnitDistributionMethod,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "policy relating to the unit, e.g. if income is paid out or retained in the fund and how this is treated, including distribution policy details for dividends and coupons."}})

(def FundUnitHolding
  {:db/ident :fibo-sec-fund-civ/FundUnitHolding,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund unit holding"},
   :rdfs/subClassOf #{:fibo-sec-sec-ast/PortfolioHolding
                      {:owl/allValuesFrom :fibo-sec-fund-fund/FundUnit,
                       :owl/onProperty    :cmns-col/comprises,
                       :rdf/type          :owl/Restriction}},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A holding of a unit in another fund."}})

(def FundsCashDistribution
  {:db/ident :fibo-sec-fund-civ/FundsCashDistribution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "funds cash distribution"},
   :rdfs/subClassOf :fibo-sec-fund-civ/FundUnitDistributionMethod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Accrued income is distributed periodically to the investor."}})

(def FundsCreation
  {:db/ident :fibo-sec-fund-civ/FundsCreation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "funds creation"},
   :rdfs/subClassOf :fibo-sec-fund-civ/SPVPurpose,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "SPV set up for fund management Conesnsus:Review"}})

(def FundsProcessing
  {:db/ident :fibo-sec-fund-civ/FundsProcessing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "funds processing"},
   :rdfs/subClassOf :fibo-fnd-arr-lif/LifecycleStage,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The context of managing and processing funds, issuing funds units etc. This is the context in which the different parties involved in a fund are defined as parties."}})

(def FundsProcessingAccount
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Derived from FIBIM definition for \"Account\", which is: \"Business relationship between two entities; one entity is the account owner, the other entity is the account servicer.\" this corresponds to the Global Terms definition for Account."},
   :db/ident :fibo-sec-fund-civ/FundsProcessingAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "funds processing account"},
   :rdfs/subClassOf #{:fibo-fbc-pas-caa/Account
                      {:owl/onProperty     :fibo-fnd-rel-rel/isProvidedBy,
                       :owl/someValuesFrom :fibo-sec-fund-civ/FundOrderDesk,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An account used specifically in the processing of funds. Like all accounts this is (per FIBIM definition) a business relationship between two entities; one entity is the account owner, the other entity is the account servicer. Please refer to Financial global model for treatment of accounts relationships in this model."}})

(def FundsProcessingParty
  {:db/ident :fibo-sec-fund-civ/FundsProcessingParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "funds processing party"},
   :rdfs/subClassOf :cmns-pts/PartyRole,
   :skos/definition {:rdf/language "en",
                     :rdf/value "party involved in the processing of funds"}})

(def FundsProcessingPassport
  {:db/ident :fibo-sec-fund-civ/FundsProcessingPassport,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "funds processing passport"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-sec-fund-civ/mayBeDefinedIn,
                       :owl/someValuesFrom :fibo-sec-fund-civ/FundProspectus,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty :fibo-fnd-agr-ctr/definesTermsFor,
                       :owl/someValuesFrom
                       :fibo-sec-fund-civ/FundProcessingTerms,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty :fibo-sec-fund-civ/hasInformationAbout,
                       :owl/someValuesFrom :fibo-sec-fund-fund/FundUnit,
                       :rdf/type :owl/Restriction} :cmns-doc/Document},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The Funds Processing Passport. This is defined as a document. This has terms drawn from elsewhere in the model which are defined as part of the FPP for reasons defined in the FPP descriptions."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Please see FPP Data Descriptions for more information (when available - not included in this model). See EFAMA website for this. Also see XLS for terms of this. These terms are often but net necessarily part of the Prospectus. See also the Thing Formerly Referred To As Investment. The definitions in the FPP descriptions may not be accurate. This is defining what kind of information is requested. Further Action: Now that we have defined sets of formal contractual terems for subvscriptions, redemptions and general terms, and since these terms don't have a direct relationship to any one Contract at present (as contractual terms should do), there may be a relationship between those terms and the FPP. To be handled in next review."}})

(def GrossOfFeePerformanceDeterminationMethod
  {:db/ident :fibo-sec-fund-civ/GrossOfFeePerformanceDeterminationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "gross of fee performance determination method"},
   :rdfs/subClassOf :fibo-sec-fund-civ/PerformanceDeterminationMethod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Performance determined gross of fee. Review: Is this mutually exclusive with the other listed method? It sounds like it is not."}})

(def IncomeAccumulation
  {:db/ident :fibo-sec-fund-civ/IncomeAccumulation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "income accumulation"},
   :rdfs/subClassOf :fibo-sec-fund-civ/FundUnitDistributionMethod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Accrued income is not distributed and instead remains reflected within the unit/share price."}})

(def InvestmentAdvisor
  {:db/ident :fibo-sec-fund-civ/InvestmentAdvisor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "investment advisor"},
   :rdfs/subClassOf #{:fibo-sec-fund-civ/FundsProcessingParty
                      {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
                       :owl/someValuesFrom :fibo-be-le-lp/LegalEntity,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The party that provides investment guidance at a fee. Definition origin:EFAMA DD"}})

(def InvestmentRestriction
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "These are defined by the overall Fund investment policy. Not the same as the detailed policies for investing in percentages of this or that."},
   :db/ident :fibo-sec-fund-civ/InvestmentRestriction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund investment restrictions set"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-col/isPartOf,
                       :owl/someValuesFrom :fibo-sec-fund-civ/FundProspectus,
                       :rdf/type           :owl/Restriction}
                      :fibo-sec-sec-rst/SecuritiesRestriction},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Limitations that apply to the fund as a whole, such as risk factors. these are used to determine whether the fund is appropriate for a given type of investor to invest in."}})

(def InvestmentStrategy
  {:db/ident :fibo-sec-fund-civ/InvestmentStrategy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "investment strategy"},
   :rdfs/subClassOf #{:fibo-fnd-gao-obj/BusinessStrategy
                      {:owl/onProperty :fibo-fnd-gao-obj/hasObjective,
                       :owl/someValuesFrom
                       :fibo-fnd-gao-obj/InvestmentObjective,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "plan, method, or series of maneuvers or stratagems for obtaining a specific investment goal"}})

(def JurisdictionStrategy
  {:db/ident :fibo-sec-fund-civ/JurisdictionStrategy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "jurisdiction strategy"},
   :rdfs/subClassOf #{:fibo-sec-fund-civ/FundPortfolioInvestmentLimitations
                      {:owl/onProperty     :fibo-sec-fund-civ/identifies.1,
                       :owl/someValuesFrom :fibo-fnd-law-jur/Jurisdiction,
                       :rdf/type           :owl/Restriction}},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Strategy which is jurisdiction based."}})

(def KeyInvestorInformationDocument
  {:cmns-av/abbreviation "KIID",
   :cmns-av/adaptedFrom
   {:xsd/anyURI "https://eur-lex.europa.eu/eli/dir/2009/65/2020-01-07"},
   :cmns-av/explanatoryNote
   "Key investor information shall include appropriate information about the essential characteristics of the UCITS concerned, which is to be provided to investors so that they are reasonably able to understand the nature and the risks of the investment product that is being offered to them and, consequently, to take investment decisions on an informed basis.",
   :db/ident :fibo-sec-fund-civ/KeyInvestorInformationDocument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label "key investor information document",
   :rdfs/subClassOf #{:fibo-sec-sec-iss/OfferingDocument
                      {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                       :owl/someValuesFrom :fibo-sec-fund-fund/FundUnit,
                       :rdf/type           :owl/Restriction}
                      {:owl/hasValue :fibo-be-ge-euj/EuropeanUnionJurisdiction,
                       :owl/onProperty :cmns-cxtdsg/isApplicableIn,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "short document that provides critical information for investors, summarizing content derived from a prospectus such that it can be understood by investors without reference to other documents, as required by law in the European Union"})

(def Liquidity
  {:db/ident :fibo-sec-fund-civ/Liquidity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "liquidity"},
   :rdfs/subClassOf #{:fibo-fnd-oac-own/Asset
                      {:owl/onProperty     :fibo-sec-fund-civ/denominatedIn,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/Currency,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Precise definition needed for liquidity, and check that it is modeled accordingly."}})

(def MoneyWeightedRateOfReturnPerformanceDeterminationMethod
  {:db/ident
   :fibo-sec-fund-civ/MoneyWeightedRateOfReturnPerformanceDeterminationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label
   {:rdf/language "en",
    :rdf/value
    "money weighted rate of return performance determination method"},
   :rdfs/subClassOf :fibo-sec-fund-civ/PerformanceDeterminationMethod,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Money weighted rate of return."}})

(def NetAssetValueCalculationMethod
  {:db/ident :fibo-sec-fund-civ/NetAssetValueCalculationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "net asset value calculation method"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-sec-fund-civ/isCalculatedIn,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/Currency,
                       :rdf/type           :owl/Restriction}
                      :cmns-qtu/Expression},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Parameters for the calculation of the net asset value for an investment fund/fund class."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "These terms were in the ISO FIBIM model but correspond to some details in the EFAMA DD."}})

(def NoteFundUnit
  {:db/ident :fibo-sec-fund-civ/NoteFundUnit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "note fund unit"},
   :rdfs/subClassOf :fibo-sec-fund-fund/FundUnit,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Need a legal definition - to follow. This is one of the mechanisms by which an investor may hold an interest in a fund, but is not a Bond or a Share."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "It is not possible to determine at this time whether some of the policy facts that apply to bund and share class units apply to all fund units including this one. Once this is defined, all Fund Distribution Policy terms and relationships should be rechecked."}})

(def OrganizationStrategy
  {:db/ident :fibo-sec-fund-civ/OrganizationStrategy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "organization strategy"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-sec-fund-civ/definedInRelationTo,
                       :owl/someValuesFrom :fibo-be-le-cb/Corporation,
                       :rdf/type :owl/Restriction}
                      :fibo-sec-fund-civ/FundPortfolioInvestmentLimitations},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Strategy which is organization based."}})

(def OtherInvestmentFundInformation
  {:db/ident :fibo-sec-fund-civ/OtherInvestmentFundInformation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "other investment fund information"},
   :rdfs/subClassOf :cmns-doc/Document,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Things which are not part of the prospectus but are important if you want to understand the fund."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "See terms in EFAMA spreadsheet. These are properties of the fund but are not legally binding. Author follow-up note: I have managed to find a \"home\" for disposition for most of the entries that are in the spreadsheet. It is not clear which of the spreadsheet terms are indended to come under the general heading in this class. The first place I would look is in the terms I have defined as \"Fund Processing Terms\", which are defined as formal, legal contractual terms. If any of those are not legally binding on some party, then this is where they belong instead."}})

(def PerformanceDeterminationMethod
  {:db/ident :fibo-sec-fund-civ/PerformanceDeterminationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "performance determination method"},
   :rdfs/subClassOf :fibo-fnd-gao-obj/Strategy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A method for performance determination (e.g. Time weighted and money weighted, annualized, gross of fee) along with the time frame in which this is determined. PLUS Performances NamePeriod"}})

(def PortfolioBenchmark
  {:db/ident :fibo-sec-fund-civ/PortfolioBenchmark,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "portfolio benchmark"},
   :rdfs/subClassOf #{:cmns-qtu/Measure
                      {:owl/onProperty     :fibo-sec-fund-civ/definesBenchmark,
                       :owl/someValuesFrom :fibo-ind-ind-ind/MarketRate,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                       :owl/someValuesFrom :fibo-sec-fund-civ/FundPortfolio,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Security or other price against which the performance of the portfolio is evaluated."}})

(def PortfolioInvestmentStrategy
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Describes how you get there. E.g fully invested v not fully invested. MB Note: The terms labeled \"Strategy\" in EFAMA and in FIBIM are more like dictionary definition of policy, while \"How you get there\" is a dictionary definition of Strategy. Therefore original labels may be reversed from dictionary definition of the global semantics these are derived from."},
   :db/ident :fibo-sec-fund-civ/PortfolioInvestmentStrategy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "portfolio investment strategy"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-sec-fund-civ/includes,
                       :owl/someValuesFrom
                       :fibo-sec-fund-civ/FundPortfolioInvestmentLimitations,
                       :rdf/type :owl/Restriction}
                      :fibo-sec-fund-civ/InvestmentStrategy},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The manner in which the portfolio manager tries to reach the funds objectives."}})

(def PortfolioManager
  {:db/ident :fibo-sec-fund-civ/PortfolioManager,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label "portfolio manager",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/manages,
                       :owl/someValuesFrom :fibo-sec-fund-civ/FundPortfolio,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty :cmns-rlcmp/isPlayedBy,
                       :owl/someValuesFrom
                       {:owl/allValuesFrom
                        :fibo-sec-fund-civ/FundManagementCompany,
                        :owl/onProperty :cmns-col/isMemberOf,
                        :rdf/type :owl/Restriction},
                       :rdf/type :owl/Restriction}
                      :fibo-fnd-org-org/OrganizationMember},
   :skos/definition
   "person or entity responsible for day to day investment decisions for a fund or asset"})

(def PreferredShareInFund
  {:db/ident :fibo-sec-fund-civ/PreferredShareInFund,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "preferred share in fund"},
   :rdfs/subClassOf :fibo-sec-fund-civ/FundShareClassUnit})

(def PrivateEquityHolding
  {:db/ident :fibo-sec-fund-civ/PrivateEquityHolding,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "private equity holding"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-col/comprises,
                       :owl/someValuesFrom :fibo-sec-eq-eq/PrivatelyHeldShare,
                       :rdf/type           :owl/Restriction}
                      :fibo-sec-sec-ast/PortfolioHolding},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A holding of private equity."}})

(def ReferToFundOrderDesk
  {:db/ident :fibo-sec-fund-civ/ReferToFundOrderDesk,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "refer to fund order desk"},
   :rdfs/subClassOf :fibo-sec-fund-civ/FundRedemptionRestriction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Restriction requiring an investor to refer to the fund order desk prior to redeeming a fund."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "While it's unclear from original data models, it's likely that this restriction is actually to learn from the fund order desk of any other individual kinds of restriction that will apply. This is itself treated as a kind of restriction here."}})

(def ReportingFrequencyPolicy
  {:db/ident :fibo-sec-fund-civ/ReportingFrequencyPolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "reporting frequency policy"},
   :rdfs/subClassOf :fibo-fnd-law-lcap/ReportingPolicy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Frequency with which financial reports will be presented."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "This could theoretically be defined in terms of a Frequency (reciprocal of time), but since this kind of reporting in accounting is always either annual or semi-annual these are defined as policies for the provision of such reports"}})

(def RiskLevel
  {:db/ident :fibo-sec-fund-civ/RiskLevel,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "risk level"},
   :rdfs/subClassOf :cmns-cls/Classifier})

(def SICAF
  {:db/ident :fibo-sec-fund-civ/SICAF,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "s i c a f"},
   :rdfs/subClassOf :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A French fund vehicle type. Designation and definition needed."}})

(def SICAV
  {:db/ident :fibo-sec-fund-civ/SICAV,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "s i c a v"},
   :rdfs/subClassOf :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Societe Collective a Capital Variable"}})

(def SPVPurpose
  {:db/ident :fibo-sec-fund-civ/SPVPurpose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "s p v purpose"},
   :rdfs/subClassOf :fibo-fnd-gao-obj/BusinessObjective,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "The reason for the creation of a Special Purpose Vehicle."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "This is used to identify different kinds of SPV which may have different detailed facts about them; however in general all SPVs are much the same."}})

(def SectorStrategy
  {:db/ident :fibo-sec-fund-civ/SectorStrategy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "sector strategy"},
   :rdfs/subClassOf :fibo-sec-fund-civ/FundPortfolioInvestmentLimitations,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Strategy which is sector based."}})

(def SemiAnnualReportingPolicy
  {:db/ident :fibo-sec-fund-civ/SemiAnnualReportingPolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "semi annual reporting policy"},
   :rdfs/subClassOf :fibo-sec-fund-civ/ReportingFrequencyPolicy,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Reports are presented twice a year."}})

(def StakeInFund
  {:db/ident :fibo-sec-fund-civ/StakeInFund,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "stake in fund"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-sec-fund-civ/givesOwnershipOf,
                       :owl/someValuesFrom
                       :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
                       :rdf/type :owl/Restriction} :fibo-fbc-pas-fpas/Position
                      {:owl/onProperty     :fibo-sec-fund-civ/identifiedAs.5,
                       :owl/someValuesFrom :fibo-sec-fund-fund/FundUnit,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The holding of some portion in a fund, by some party. This stake will generally tak ethe form of some sort of unit in that fund."}})

(def TimeWeightedRateOfReturnPerformanceDeterminationMethod
  {:db/ident
   :fibo-sec-fund-civ/TimeWeightedRateOfReturnPerformanceDeterminationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label
   {:rdf/language "en",
    :rdf/value "time weighted rate of return performance determination method"},
   :rdfs/subClassOf :fibo-sec-fund-civ/PerformanceDeterminationMethod,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Time weighted rate of return."}})

(def UnitIssuer
  {:db/ident :fibo-sec-fund-civ/UnitIssuer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "unit issuer"},
   :rdfs/subClassOf #{:fibo-sec-fund-civ/FundsProcessingParty
                      {:owl/onProperty     :fibo-sec-fund-civ/issues,
                       :owl/someValuesFrom :fibo-sec-fund-fund/FundUnit,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
                       :owl/someValuesFrom :fibo-be-le-cb/Corporation,
                       :rdf/type           :owl/Restriction}},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The party which issues the Fund Unit."}})

(def accountingYearEndDate
  {:db/ident :fibo-sec-fund-civ/accountingYearEndDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundReportingTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "accounting year end date"},
   :rdfs/range :fibo-fnd-dt-bd/DayOfMonth,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Last day of the accounting year for the fund."}})

(def additionalRestrictions
  {:db/ident :fibo-sec-fund-civ/additionalRestrictions,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/OrganizationStrategy,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "additional restrictions"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Other restrictions or treatment information in respect of this strategy and the organization to which it refers."}})

(def administeredBy
  {:db/ident :fibo-sec-fund-civ/administeredBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "administered by"},
   :rdfs/range :fibo-sec-fund-civ/FundAdministrator,
   :rdfs/subPropertyOf :fibo-sec-fund-civ/fundHasRelatedParty})

(def advisedBy
  {:db/ident :fibo-sec-fund-civ/advisedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "advised by"},
   :rdfs/range :fibo-sec-fund-civ/InvestmentAdvisor,
   :rdfs/subPropertyOf :fibo-sec-fund-civ/fundHasRelatedParty})

(def anticipatedVolatility
  {:db/ident :fibo-sec-fund-civ/anticipatedVolatility,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProspectus,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "anticipated volatility"},
   :rdfs/range :cmns-qtu/Percentage})

(def anticipates
  {:db/ident :fibo-sec-fund-civ/anticipates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProspectus,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "anticipates"},
   :rdfs/range :fibo-ind-ind-ind/MarketRate})

(def assessedAgainst
  {:db/ident :fibo-sec-fund-civ/assessedAgainst,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolio,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "assessed against"},
   :rdfs/range :fibo-sec-fund-civ/PortfolioBenchmark})

(def authorizedCountry
  {:db/ident :fibo-sec-fund-civ/authorizedCountry,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingGeneralTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "authorized country"},
   :rdfs/range :lcc-cr/Country,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Country in which it is authorised to commercialise the fund."}})

(def backEndLoadApplicable
  {:db/ident :fibo-sec-fund-civ/backEndLoadApplicable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingGeneralTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "back end load applicable"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether an exit charge, eg, CDSC, on redemption orders for this class can be applied."}})

(def benchmarkWeight
  {:db/ident :fibo-sec-fund-civ/benchmarkWeight,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/PortfolioBenchmark,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "benchmark weight"},
   :rdfs/range :cmns-qtu/Percentage,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Instrument weighting in the benchmark for the portfolio."}})

(def blacklisted
  {:db/ident :fibo-sec-fund-civ/blacklisted,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/OrganizationStrategy,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "blacklisted"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether or not the strategy in framed so as to include the referenced business entity as being blacklisted. If yes, the strategy prevents investment in securities issued by that organization."}})

(def clearFundsRequired
  {:db/ident :fibo-sec-fund-civ/clearFundsRequired,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/SettlementTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "clear funds required"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether cleared funds may be required before a subscription order can be executed."}})

(def couponPaymentDate
  {:db/ident :fibo-sec-fund-civ/couponPaymentDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundCouponPolicy,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "coupon payment date"},
   :rdfs/range :fibo-fnd-dt-bd/DayOfMonth,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The date at which the coupon is distributed to the bond unit holder."}})

(def dealingFrequencyDescription
  {:db/ident :fibo-sec-fund-civ/dealingFrequencyDescription,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dealing frequency description"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Description of frequency at which the subscriptions and redemptions are done."}})

(def decimalPlaceRounding
  {:db/ident :fibo-sec-fund-civ/decimalPlaceRounding,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "decimal place rounding"},
   :rdfs/range :xsd/integer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Number of decimal places to which quantities of units/shares are rounded."}})

(def declarationChannel
  {:db/ident :fibo-sec-fund-civ/declarationChannel,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/NetAssetValueCalculationMethod,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "declaration channel"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Means of the net asset value publication, eg, a newspaper."}})

(def definedInRelationTo
  {:db/ident :fibo-sec-fund-civ/definedInRelationTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/OrganizationStrategy,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "defined in relation to"},
   :rdfs/range :fibo-be-le-cb/Corporation})

(def definesAllocations
  {:db/ident :fibo-sec-fund-civ/definesAllocations,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolioInvestmentPolicy,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "defines allocations"},
   :rdfs/range :fibo-sec-fund-civ/FundPortfolioInvestmentLimitations,
   :rdfs/subPropertyOf :cmns-dsg/defines})

(def definesBenchmark
  {:db/ident :fibo-sec-fund-civ/definesBenchmark,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/PortfolioBenchmark,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "defines benchmark"},
   :rdfs/range :fibo-ind-ind-ind/MarketRate})

(def definesMainFundOrderDeskAccount
  {:db/ident :fibo-sec-fund-civ/definesMainFundOrderDeskAccount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "defines main fund order desk account"},
   :rdfs/range :fibo-sec-fund-civ/FundsProcessingAccount})

(def denominatedIn
  {:db/ident :fibo-sec-fund-civ/denominatedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/Liquidity,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "denominated in"},
   :rdfs/range :fibo-fnd-acc-cur/Currency})

(def denomination
  {:db/ident :fibo-sec-fund-civ/denomination,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "denomination"},
   :rdfs/range :fibo-fnd-acc-cur/Currency,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Denomination Currency of the fund - Currency in which the fund unit is issued or redenominated and the currency of the NAV calculation."}})

(def denominationCurrency
  {:db/ident :fibo-sec-fund-civ/denominationCurrency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/FundUnit,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "denomination currency"},
   :rdfs/range :fibo-fnd-acc-cur/Currency})

(def describedIn
  {:db/ident :fibo-sec-fund-civ/describedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "described in"},
   :rdfs/range :fibo-sec-fund-civ/FundProspectus})

(def description
  {:db/ident :fibo-sec-fund-civ/description,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolioInvestmentPolicy,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "description"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The manner in which the manager tries to reach the funds objectives"}})

(def description_1
  {:db/ident :fibo-sec-fund-civ/description.1,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/PortfolioBenchmark,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "description"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Description of the benchmark used to determine the performance of a portfolio."}})

(def distributedBy
  {:db/ident :fibo-sec-fund-civ/distributedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "distributed by"},
   :rdfs/range :fibo-sec-fund-civ/FundDistributor,
   :rdfs/subPropertyOf :fibo-sec-fund-civ/fundHasRelatedParty})

(def distributionWithReinvestment
  {:db/ident :fibo-sec-fund-civ/distributionWithReinvestment,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain #{:fibo-sec-fund-civ/FundUnitDistributionPolicy
                  :fibo-sec-fund-civ/FundReinvestmentPolicy},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "distribution with reinvestment"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "It is possible to hold shares for which the accrued income is distributed, but then reinvested automatically in additional units/shares allocated to the investor."}})

(def dualFund
  {:db/ident :fibo-sec-fund-civ/dualFund,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingGeneralTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dual fund"},
   :rdfs/range :xsd/boolean,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Whether the fund has two prices."}})

(def endOfFiscalYear
  {:db/ident :fibo-sec-fund-civ/endOfFiscalYear,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundReportingTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "end of fiscal year"},
   :rdfs/range :fibo-fnd-dt-bd/DayOfMonth,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Day and month on any given year at which the books are closed and profit and loss is determined."}})

(def exCouponDate
  {:db/ident :fibo-sec-fund-civ/exCouponDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundCouponPolicy,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ex coupon date"},
   :rdfs/range :fibo-fnd-dt-bd/DayOfMonth,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "The date at which the coupon is substracted from the NAV"}})

(def firstAccountingYearEndDate
  {:db/ident :fibo-sec-fund-civ/firstAccountingYearEndDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundReportingTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "first accounting year end date"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Last day of the first accounting year for the fund."}})

(def firstNAVCalculationDate
  {:db/ident :fibo-sec-fund-civ/firstNAVCalculationDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "first n a v calculation date"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The first date of NAV calculation"}})

(def frontEndLoadApplicable
  {:db/ident :fibo-sec-fund-civ/frontEndLoadApplicable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "front end load applicable"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether a front end charge on subscription orders for this class can be applied."}})

(def fundClassTypeIdentifier
  {:db/ident :fibo-sec-fund-civ/fundClassTypeIdentifier,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-fund/FundUnit,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund class type identifier"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A textual identification of the class of fund units. This is used to uniquely identify a particular class of fund units, and thereby identify features of this type of unit within the fund."}})

(def fundHasRelatedParty
  {:db/ident :fibo-sec-fund-civ/fundHasRelatedParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund has related party"},
   :rdfs/range :fibo-sec-fund-civ/FundsProcessingParty})

(def givesOwnershipOf
  {:db/ident :fibo-sec-fund-civ/givesOwnershipOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/StakeInFund,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "gives ownership of"},
   :rdfs/range :fibo-sec-fund-fund/CollectiveInvestmentVehicle})

(def hasAccountant
  {:db/ident :fibo-sec-fund-civ/hasAccountant,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has accountant"},
   :rdfs/range :fibo-sec-fund-civ/FundAccountant,
   :rdfs/subPropertyOf :fibo-sec-fund-civ/fundHasRelatedParty})

(def hasAccountingInformation
  {:db/ident :fibo-sec-fund-civ/hasAccountingInformation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has accounting information"},
   :rdfs/range :fibo-sec-fund-civ/FundReportingTerms})

(def hasAccountingReportingFrequency
  {:db/ident :fibo-sec-fund-civ/hasAccountingReportingFrequency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundReportingTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has accounting reporting frequency"},
   :rdfs/range :fibo-sec-fund-civ/ReportingFrequencyPolicy})

(def hasAdditionalInformation
  {:db/ident :fibo-sec-fund-civ/hasAdditionalInformation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has additional information"},
   :rdfs/range :fibo-sec-fund-civ/OtherInvestmentFundInformation})

(def hasAdditionalRedemptionRestrictions
  {:db/ident :fibo-sec-fund-civ/hasAdditionalRedemptionRestrictions,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundRedemptionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has additional redemption restrictions"},
   :rdfs/range :fibo-sec-fund-civ/ReferToFundOrderDesk})

(def hasAuditor
  {:db/ident :fibo-sec-fund-civ/hasAuditor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has auditor"},
   :rdfs/range :fibo-sec-fund-civ/FundAuditor,
   :rdfs/subPropertyOf :fibo-sec-fund-civ/fundHasRelatedParty})

(def hasContactDetails
  {:db/ident :fibo-sec-fund-civ/hasContactDetails,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/PortfolioManager,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has contact details"}})

(def hasDataProvider
  {:db/ident :fibo-sec-fund-civ/hasDataProvider,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has data provider"},
   :rdfs/range :fibo-sec-fund-civ/FundDataProvider,
   :rdfs/subPropertyOf :fibo-sec-fund-civ/fundHasRelatedParty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "has an organization which is the data provider and is legally responsible for the information provided"}})

(def hasDefaultSettlementConvention
  {:db/ident :fibo-sec-fund-civ/hasDefaultSettlementConvention,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has default settlement convention"},
   :rdfs/range :fibo-fbc-fi-stl/SettlementConvention})

(def hasDepository
  {:db/ident :fibo-sec-fund-civ/hasDepository,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has depository"},
   :rdfs/range :fibo-sec-fund-civ/FundDepositary,
   :rdfs/subPropertyOf :fibo-sec-fund-civ/fundHasRelatedParty})

(def hasDetails
  {:db/ident :fibo-sec-fund-civ/hasDetails,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/FundUnit,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has details"},
   :rdfs/range :fibo-sec-fund-civ/NetAssetValueCalculationMethod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Information on the net asset value calculation of the investment fund component."}})

(def hasExpectedCoupon
  {:db/ident :fibo-sec-fund-civ/hasExpectedCoupon,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundBondClassUnit,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has expected coupon"},
   :rdfs/range :fibo-sec-fund-civ/FundBondUnitCoupon})

(def hasFundPolicy
  {:db/ident :fibo-sec-fund-civ/hasFundPolicy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has fund policy"},
   :rdfs/range :fibo-sec-fund-civ/FundInvestmentPolicy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Overall policy for amounts invested, limitations etc. Not the same as the detailed Portfolio policy."}})

(def hasFundProcessingTerms
  {:db/ident :fibo-sec-fund-civ/hasFundProcessingTerms,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/FundUnit,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has fund processing terms"},
   :rdfs/range :fibo-sec-fund-civ/FundProcessingTerms,
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasContractualElement})

(def hasInformationAbout
  {:db/ident :fibo-sec-fund-civ/hasInformationAbout,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundsProcessingPassport,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has information about"},
   :rdfs/range :fibo-sec-fund-fund/FundUnit})

(def hasIntendedRiskLevel
  {:db/ident :fibo-sec-fund-civ/hasIntendedRiskLevel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundInvestmentObjective,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has intended risk level"},
   :rdfs/range :fibo-sec-fund-civ/RiskLevel})

(def hasInvestmentStrategy
  {:db/ident :fibo-sec-fund-civ/hasInvestmentStrategy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-sec-ast/Portfolio,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "strategy"},
   :rdfs/range :fibo-sec-fund-civ/InvestmentStrategy})

(def hasIssueDate
  {:db/ident :fibo-sec-fund-civ/hasIssueDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/FundUnit,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has issue date"},
   :rdfs/range :cmns-dt/Date,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Date of first NAV calculation and start of performance calculations (same as launch date)"}})

(def hasLiquidity
  {:db/ident :fibo-sec-fund-civ/hasLiquidity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolio,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has liquidity"},
   :rdfs/range :fibo-sec-fund-civ/Liquidity})

(def hasManagementCompany
  {:db/ident :fibo-sec-fund-civ/hasManagementCompany,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has management company"},
   :rdfs/range :fibo-sec-fund-civ/FundManager,
   :rdfs/subPropertyOf :fibo-sec-fund-civ/fundHasRelatedParty})

(def hasPerformanceDeterminationMethod
  {:db/ident :fibo-sec-fund-civ/hasPerformanceDeterminationMethod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has performance determination method"},
   :rdfs/range :fibo-sec-fund-civ/PerformanceDeterminationMethod})

(def hasPolicyTerms
  {:db/ident :fibo-sec-fund-civ/hasPolicyTerms,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundBondUnitCoupon,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has policy terms"},
   :rdfs/range :fibo-sec-fund-civ/FundCouponPolicy})

(def hasPortfolio
  {:db/ident :fibo-sec-fund-civ/hasPortfolio,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has portfolio"},
   :rdfs/range :fibo-sec-fund-civ/FundPortfolio})

(def hasRelatedFundTerms
  {:db/ident :fibo-sec-fund-civ/hasRelatedFundTerms,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has related fund terms"},
   :rdfs/range :fibo-sec-fund-civ/FundProcessingTerms,
   :rdfs/subPropertyOf :fibo-sec-fund-civ/hasRelatedTerms})

(def hasRelatedTerms
  {:db/ident :fibo-sec-fund-civ/hasRelatedTerms,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has related terms"},
   :rdfs/range :fibo-fnd-agr-ctr/ContractualElement})

(def hasSubscriptionTerms
  {:db/ident :fibo-sec-fund-civ/hasSubscriptionTerms,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has subscription terms"},
   :rdfs/range :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/subPropertyOf :fibo-sec-fund-civ/hasRelatedFundTerms})

(def hasTradableUnit
  {:db/ident :fibo-sec-fund-civ/hasTradableUnit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has tradable unit"},
   :rdfs/range :fibo-sec-fund-fund/FundUnit})

(def hasTransferAgent
  {:db/ident :fibo-sec-fund-civ/hasTransferAgent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has transfer agent"},
   :rdfs/range :fibo-sec-fund-civ/FundTransferAgent,
   :rdfs/subPropertyOf :fibo-sec-fund-civ/fundHasRelatedParty})

(def hasUnitIssuer
  {:db/ident :fibo-sec-fund-civ/hasUnitIssuer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has unit issuer"},
   :rdfs/range :fibo-sec-fund-civ/UnitIssuer,
   :rdfs/subPropertyOf :fibo-sec-fund-civ/fundHasRelatedParty})

(def historicPricingIndicator
  {:db/ident :fibo-sec-fund-civ/historicPricingIndicator,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/NetAssetValueCalculationMethod,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "historic pricing indicator"},
   :rdfs/range :xsd/boolean,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Indicates whether the price is historic or forward."}})

(def holderMayReinvest
  {:db/ident :fibo-sec-fund-civ/holderMayReinvest,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/DistributingShareClass,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "holder may reinvest"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether or not the holder may reinvest dividends in the fund."}})

(def holdingTransferable
  {:db/ident :fibo-sec-fund-civ/holdingTransferable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingGeneralTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "holding transferable"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether registered investors are able to transfer some or all of their holdings to third parties."}})

(def holds
  {:db/ident :fibo-sec-fund-civ/holds,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-le-lp/SpecialPurposeVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "holds"},
   :rdfs/range :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The Funds Special Purpose Vehicle holds this Fund."}})

(def identifiedAs_5
  {:db/ident :fibo-sec-fund-civ/identifiedAs.5,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/StakeInFund,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "identified as"},
   :rdfs/range :fibo-sec-fund-fund/FundUnit})

(def identifies_1
  {:db/ident :fibo-sec-fund-civ/identifies.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/JurisdictionStrategy,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "identifies"},
   :rdfs/range :fibo-fnd-law-jur/Jurisdiction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Jurisdiction (country, county, state, province, city) of the investment."}})

(def identifiesAssetTypesBy
  {:db/ident :fibo-sec-fund-civ/identifiesAssetTypesBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/AssetClassStrategy,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "identifies asset types by"},
   :rdfs/range :fibo-sec-sec-cls/FinancialInstrumentClassifier})

(def implementsFundPolicy
  {:db/ident :fibo-sec-fund-civ/implementsFundPolicy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolio,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "implements fund policy"},
   :rdfs/range :fibo-sec-fund-civ/FundPortfolioInvestmentPolicy})

(def inceptionDate
  {:db/ident :fibo-sec-fund-civ/inceptionDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "inception date"},
   :rdfs/range :cmns-dt/Date,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Authorization date in the country of origin."}})

(def inceptionDate_1
  {:db/ident :fibo-sec-fund-civ/inceptionDate.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundShareClassUnit,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "inception date"},
   :rdfs/range :cmns-dt/Date,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Authorization date in the country of origin. Further Notes See definition in Inception Date for Fund. Separate fact exists here. Same definition used. EFAMA Review notes: Inception Date exists as soon as there is a prospectus, so it is a fact about a Share Class even if the share class is never formally issued or offered to the public. Legal structure exists even if something is not launched. Editor question: Review stated this was a fact about Share Class; confirm this fact does not apply to Bond and Note units, or was the term Share Class being used to mean all three? Meanwhile I have put the term \"Issue Date\" as a fact about all Fund Unit, as this is given a sa separate term in the EFAMA DD spreadsheet. MAy come clearer in the next version of that."}})

(def includeRelatedFirms
  {:db/ident :fibo-sec-fund-civ/includeRelatedFirms,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/OrganizationStrategy,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "include related firms"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether or not the strategy includes firms which are related in some way to the referenced organization."}})

(def includes
  {:db/ident :fibo-sec-fund-civ/includes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/PortfolioInvestmentStrategy,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "includes"},
   :rdfs/range :fibo-sec-fund-civ/FundPortfolioInvestmentLimitations})

(def inclusion
  {:db/ident :fibo-sec-fund-civ/inclusion,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolioInvestmentLimitations,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "inclusion"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether the referred strategy is included. No means this description refers to the exclusion of what is described, from the portfolio."}})

(def initialApplicationForm
  {:db/ident :fibo-sec-fund-civ/initialApplicationForm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "initial application form"},
   :rdfs/range :fibo-sec-fund-civ/FundProcessingForm,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Physical application form for the initial subscription by the investor."}})

(def intendedLiquidationDate
  {:db/ident :fibo-sec-fund-civ/intendedLiquidationDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-le-lp/SpecialPurposeVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "intended liquidation date"},
   :rdfs/range :cmns-dt/Date,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The date on which the SPV is scheduled to be disbanded and wound up."}})

(def investmentFocus
  {:db/ident :fibo-sec-fund-civ/investmentFocus,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/PortfolioInvestmentStrategy,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "investment focus"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The information about the area the fund is mostly invested into (for example stock market in Germany)."}})

(def isCalculatedIn
  {:db/ident :fibo-sec-fund-civ/isCalculatedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/NetAssetValueCalculationMethod,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is calculated in"},
   :rdfs/range :fibo-fnd-acc-cur/Currency})

(def isSetUpFor
  {:db/ident :fibo-sec-fund-civ/isSetUpFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-le-lp/SpecialPurposeVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is set up for"},
   :rdfs/range :fibo-sec-fund-civ/SPVPurpose})

(def isUnitHolder
  {:db/ident :fibo-sec-fund-civ/isUnitHolder,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-opty/Investor,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is unit holder"},
   :rdfs/range :fibo-sec-fund-fund/FundUnit})

(def issuePrice
  {:db/ident :fibo-sec-fund-civ/issuePrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/FundUnit,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issue price"},
   :rdfs/range :fibo-fnd-acc-cur/Price,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The price at which the Fund Unit was first issued."}})

(def issues
  {:db/ident :fibo-sec-fund-civ/issues,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/UnitIssuer,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issues"},
   :rdfs/range :fibo-sec-fund-fund/FundUnit})

(def launchDate
  {:db/ident :fibo-sec-fund-civ/launchDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "launch date"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Date of first NAV calculation and start of performance calculations"}})

(def legallyRecordedIn
  {:db/ident :fibo-sec-fund-civ/legallyRecordedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund legally recorded in"},
   :rdfs/range :fibo-fnd-law-jur/Jurisdiction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relationship note: This relationship has no obvious parent; it is similar to Security legally recorded in Jurisdiction, but that inherits from Contract jurisdiction whereas a Fund is a Pool not a Contract. So the meaning is not the same. Assign parent relationship in future if a more general one exists; at present there is none."}})

(def limitedSharesAreIssued
  {:db/ident :fibo-sec-fund-civ/limitedSharesAreIssued,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundShareClassUnit,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "limited shares are issued"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether or not new shares can be issued in the fund. This is what makes it a closed end or open end fund."}})

(def mainFundOrderDesk
  {:db/ident :fibo-sec-fund-civ/mainFundOrderDesk,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "main fund order desk"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether the fund order desk is the principal entity appointed by the fund to which orders should be submitted."}})

(def maximumDeviation
  {:db/ident :fibo-sec-fund-civ/maximumDeviation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/PortfolioBenchmark,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "maximum deviation"},
   :rdfs/range :cmns-qtu/Percentage,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Maximum allowable deviation from the benchmark."}})

(def maximumInvestmentAmount
  {:db/ident :fibo-sec-fund-civ/maximumInvestmentAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolioInvestmentLimitations,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "maximum investment amount"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Maximum amount that may be invested in the specified strategy."}})

(def maximumInvestmentPercentage
  {:db/ident :fibo-sec-fund-civ/maximumInvestmentPercentage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolioInvestmentLimitations,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "maximum investment percentage"},
   :rdfs/range :cmns-qtu/Percentage,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Maximum percentage that may be invested in the specified strategy."}})

(def maximumPurchasingFee
  {:db/ident :fibo-sec-fund-civ/maximumPurchasingFee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "maximum purchasing fee"},
   :rdfs/range :fibo-fbc-pas-caa/Fee,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Maximum percentage or fixed amount of money due when purchasing fund shares Definition origin:EFAMA DD"}})

(def maximumRedemptionAmount
  {:db/ident :fibo-sec-fund-civ/maximumRedemptionAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundRedemptionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "maximum redemption amount"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Maximum quantity of securities, expressed as an amount that can be sold."}})

(def maximumRedemptionFee
  {:db/ident :fibo-sec-fund-civ/maximumRedemptionFee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "maximum redemption fee"},
   :rdfs/range :fibo-fbc-pas-caa/Fee,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Maximum percentage or fixed amount of money due when redeeming fund shares Definition origin:EFAMA DD"}})

(def maximumRedemptionPercentage
  {:db/ident :fibo-sec-fund-civ/maximumRedemptionPercentage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundRedemptionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "maximum redemption percentage"},
   :rdfs/range :cmns-qtu/Percentage,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Maximum quantity of securities, expressed as a percentage that can be sold."}})

(def maximumRedemptionUnits
  {:db/ident :fibo-sec-fund-civ/maximumRedemptionUnits,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundRedemptionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "maximum redemption units"},
   :rdfs/range :xsd/integer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Maximum number of shares/units that may be redeemed on a single dealing day."}})

(def mayAlsoBe
  {:db/ident :fibo-sec-fund-civ/mayAlsoBe,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundAdministrator,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "may also be"},
   :rdfs/range :fibo-sec-fund-civ/UnitIssuer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The unit issuer would be the fund administrator (except when it is a Bond)."}})

(def mayBe_1
  {:db/ident :fibo-sec-fund-civ/mayBe.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingForm,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "may be"},
   :rdfs/range :fibo-sec-fund-civ/FundOrderDeskPhysicalFormDocument})

(def mayBeDefinedIn
  {:db/ident :fibo-sec-fund-civ/mayBeDefinedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundsProcessingPassport,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "may be defined in"},
   :rdfs/range :fibo-sec-fund-civ/FundProspectus})

(def minimumDeviation
  {:db/ident :fibo-sec-fund-civ/minimumDeviation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/PortfolioBenchmark,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "minimum deviation"},
   :rdfs/range :cmns-qtu/Percentage,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Minimum allowable deviation from the benchmark."}})

(def minimumHoldingPeriod
  {:db/ident :fibo-sec-fund-civ/minimumHoldingPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingGeneralTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "minimum holding period"},
   :rdfs/range :cmns-dt/Duration,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Period, in days, during which the units/shares must be held following their issue before redemption will be permitted."}})

(def minimumInitialSubscriptionAmount
  {:db/ident :fibo-sec-fund-civ/minimumInitialSubscriptionAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "minimum initial subscription amount"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Minimum initial subscription value."}})

(def minimumInitialSubscriptionUnits
  {:db/ident :fibo-sec-fund-civ/minimumInitialSubscriptionUnits,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "minimum initial subscription units"},
   :rdfs/range :xsd/integer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Minimum initial number of units/shares that must be purchased."}})

(def minimumInvestmentAmount
  {:db/ident :fibo-sec-fund-civ/minimumInvestmentAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolioInvestmentLimitations,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "minimum investment amount"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Minimum amount that has to be invested in the specified strategy."}})

(def minimumInvestmentPercentage
  {:db/ident :fibo-sec-fund-civ/minimumInvestmentPercentage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolioInvestmentLimitations,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "minimum investment percentage"},
   :rdfs/range :cmns-qtu/Percentage,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Minimum percentage that has to be invested in the specified strategy."}})

(def minimumRatingRestriction
  {:db/ident :fibo-sec-fund-civ/minimumRatingRestriction,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/InvestmentRestriction,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "minimum rating restriction"},
   :rdfs/range :fibo-fnd-arr-rt/RatingScore,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The minimum rating of securities to be invested in."}})

(def minimumRemainingHoldingAmount
  {:db/ident :fibo-sec-fund-civ/minimumRemainingHoldingAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingGeneralTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "minimum remaining holding amount"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Minimum value of units/shares that must be retained to avoid automatic redemption."}})

(def minimumRemainingHoldingUnits
  {:db/ident :fibo-sec-fund-civ/minimumRemainingHoldingUnits,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingGeneralTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "minimum remaining holding units"},
   :rdfs/range :xsd/integer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Minimum number of units/shares that must be retained to avoid automatic redemption."}})

(def minimumSubscriptionAmount
  {:db/ident :fibo-sec-fund-civ/minimumSubscriptionAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "minimum subscription amount"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Minimum subscription value for existing investors."}})

(def minimumSubscriptionUnits
  {:db/ident :fibo-sec-fund-civ/minimumSubscriptionUnits,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "minimum subscription units"},
   :rdfs/range :xsd/integer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Minimum number of units/shares that must be purchased by existing investors."}})

(def name
  {:db/ident :fibo-sec-fund-civ/name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "name"},
   :rdfs/range :xsd/string,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Name of the investment fund."}})

(def name_1
  {:db/ident :fibo-sec-fund-civ/name.1,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolioInvestmentPolicy,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "name"},
   :rdfs/range :xsd/string,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Name given to the defined strategy."}})

(def outlines
  {:db/ident :fibo-sec-fund-civ/outlines,
   :owl/inverseOf :fibo-sec-fund-civ/statedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProspectus,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "outlines"},
   :rdfs/range :fibo-sec-fund-civ/FundInvestmentObjective})

(def percentageInvested
  {:db/ident :fibo-sec-fund-civ/percentageInvested,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/InvestmentRestriction,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "percentage invested"},
   :rdfs/range :cmns-qtu/Percentage,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The percentage of funds that is to be invested at any given time."}})

(def performanceDeterminationTimeframe
  {:db/ident :fibo-sec-fund-civ/performanceDeterminationTimeframe,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/PerformanceDeterminationMethod,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "performance determination timeframe"},
   :rdfs/range :cmns-dt/DatePeriod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The timeframe on which the performance is reported (e.g. 1month, 1 year, YTD)."}})

(def performanceFee
  {:db/ident :fibo-sec-fund-civ/performanceFee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "performance fee"},
   :rdfs/range :fibo-fbc-pas-caa/Fee,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Fees paid for the achivements of predefined outperformance objectives Definition origin:EFAMA DD"}})

(def physicalDocumentRequired
  {:db/ident :fibo-sec-fund-civ/physicalDocumentRequired,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingForm,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "physical document required"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether a phsyical form is required through the main fund order desk. Yes: A phsyical form is required through the main fund order desk. No: A phsyical form is not required through the main fund order desk."}})

(def processingCountry
  {:db/ident :fibo-sec-fund-civ/processingCountry,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "processing country"},
   :rdfs/range :lcc-cr/Country,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Country in which the processing characteristic applies."}})

(def productGroupDescription
  {:db/ident :fibo-sec-fund-civ/productGroupDescription,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "product group description"},
   :rdfs/range :xsd/string,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Company specific description of a group of funds."}})

(def promotedBy
  {:db/ident :fibo-sec-fund-civ/promotedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "promoted by"},
   :rdfs/range :fibo-sec-fund-civ/FundPromoter,
   :rdfs/subPropertyOf :fibo-sec-fund-civ/fundHasRelatedParty})

(def providesDepositaryServiceFor
  {:db/ident :fibo-sec-fund-civ/providesDepositaryServiceFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundDepositary,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "provides depositary service for"},
   :rdfs/range :fibo-sec-fund-fund/FundUnit})

(def purchasingFee
  {:db/ident :fibo-sec-fund-civ/purchasingFee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "purchasing fee"},
   :rdfs/range :fibo-fbc-pas-caa/Fee,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Actual percentage or fixed amount of money due when purchasing fund shares Definition origin:EFAMA DD"}})

(def redemptionCutoffDateTime
  {:db/ident :fibo-sec-fund-civ/redemptionCutoffDateTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundRedemptionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "redemption cutoff date time"},
   :rdfs/range :cmns-dt/DateTime,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Last date/time at which an order to redeem can be given."}})

(def redemptionCycleInBusinessDays
  {:db/ident :fibo-sec-fund-civ/redemptionCycleInBusinessDays,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-fi-stl/SettlementConvention,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "redemption cycle in business days"},
   :rdfs/range :xsd/integer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The last business day following the day on which a redemption order is priced (T) by which settlement will be due for orders placed with the main Fund Order Desk. Alternatively, if proceeds will be paid following receipt of written renunciation, the last business day following receipt of the relevant renunciation documentation by the main Fund Order Desk (R) by which the proceeds will be sent."}})

(def redemptionDealingFrequency
  {:db/ident :fibo-sec-fund-civ/redemptionDealingFrequency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundRedemptionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "redemption dealing frequency"},
   :rdfs/range :fibo-fnd-dt-fd/RecurrenceInterval,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Frequency at which the redemptions are done."}})

(def redemptionFee
  {:db/ident :fibo-sec-fund-civ/redemptionFee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "redemption fee"},
   :rdfs/range :fibo-fbc-pas-caa/Fee,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Actual percentage or fixed amount of money due when redeeming fund shares Definition origin:EFAMA DD"}})

(def redemptionForm
  {:db/ident :fibo-sec-fund-civ/redemptionForm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundRedemptionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "redemption form"},
   :rdfs/range :fibo-sec-fund-civ/FundProcessingForm,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Physical written instruction/renunciation form for redemption of units/shares by the investor."}})

(def redemptionInAmountAllowed
  {:db/ident :fibo-sec-fund-civ/redemptionInAmountAllowed,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundRedemptionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "redemption in amount allowed"},
   :rdfs/range :xsd/boolean,
   :skos/definition {:rdf/language "en",
                     :rdf/value "Whether redemptions in amount are allowed."}})

(def redemptionPeriod
  {:db/ident :fibo-sec-fund-civ/redemptionPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundRedemptionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "redemption period"},
   :rdfs/range :cmns-dt/DatePeriod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Specific period, eg, for some guaranteed funds, during which the units/shares may be redeemed."}})

(def registrationDate
  {:db/ident :fibo-sec-fund-civ/registrationDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "registration date"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The date at which the fund is legally approved in a country other than the country of origin."}})

(def reinvestmentFrequency
  {:db/ident :fibo-sec-fund-civ/reinvestmentFrequency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundReinvestmentPolicy,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "reinvestment frequency"},
   :rdfs/range :fibo-fnd-dt-fd/RecurrenceInterval,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "For units where there is Reinvestment distribution, the frequency with which the reinvestment takes place (this will be the same or less frequently than the Dividend Payment Frequency), otherwise this fact does not apply."}})

(def signatureRequired
  {:db/ident :fibo-sec-fund-civ/signatureRequired,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingForm,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "signature required"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether a phsyical form with the investor's written signature is required through the main fund order desk. Yes:A phsyical form with the investor's written signature is required through the main fund order desk."}})

(def statedDistributionFee
  {:db/ident :fibo-sec-fund-civ/statedDistributionFee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProspectus,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "stated distribution fee"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount})

(def statedIn
  {:db/ident :fibo-sec-fund-civ/statedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundInvestmentObjective,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "stated in"},
   :rdfs/range :fibo-sec-fund-civ/FundProspectus})

(def statedInvestmentAim
  {:db/ident :fibo-sec-fund-civ/statedInvestmentAim,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundInvestmentObjective,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "stated investment aim"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The stated aim of the Fund in words, e.g outperfom a given benchmark."}})

(def statedManagementFee
  {:db/ident :fibo-sec-fund-civ/statedManagementFee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProspectus,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "stated management fee"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The fee that is stated in the Prospectus as being what is to be charged for management. Further notes: Can be monetary amount or a percentage or a combination. Action: simple type is wrong."}})

(def statedObjective
  {:db/ident :fibo-sec-fund-civ/statedObjective,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProspectus,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "stated objective"},
   :rdfs/range :xsd/string,
   :skos/definition {:rdf/language "en",
                     :rdf/value "The stated objective of the fund, in words."}})

(def stipulatesBenchmark
  {:db/ident :fibo-sec-fund-civ/stipulatesBenchmark,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundInvestmentPolicy,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "stipulates benchmark"},
   :rdfs/range :fibo-ind-ind-ind/MarketRate})

(def subscriptionCutoffDateTime
  {:db/ident :fibo-sec-fund-civ/subscriptionCutoffDateTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subscription cutoff date time"},
   :rdfs/range :cmns-dt/DateTime,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Last date/time at which an order to subscribe can be given."}})

(def subscriptionDealingFrequency
  {:db/ident :fibo-sec-fund-civ/subscriptionDealingFrequency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subscription dealing frequency"},
   :rdfs/range :fibo-fnd-dt-fd/RecurrenceInterval,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Frequency at which the subscriptions are done."}})

(def subscriptionPeriod
  {:db/ident :fibo-sec-fund-civ/subscriptionPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subscription period"},
   :rdfs/range :cmns-dt/DatePeriod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Specific period, eg, for some guaranteed funds, during which the units/shares may be subscribed to."}})

(def subscriptionsInAmountAllowed
  {:db/ident :fibo-sec-fund-civ/subscriptionsInAmountAllowed,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subscriptions in amount allowed"},
   :rdfs/range :xsd/boolean,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Whether subscriptions in amount are allowed."}})

(def subsequentApplicationForm
  {:db/ident :fibo-sec-fund-civ/subsequentApplicationForm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subsequent application form"},
   :rdfs/range :fibo-sec-fund-civ/FundProcessingForm,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Physical application form for subsequent investments by the same investor."}})

(def supervisedBy
  {:db/ident :fibo-sec-fund-civ/supervisedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "supervised by"},
   :rdfs/range :fibo-sec-fund-civ/FundSupervisoryAuthority})

(def switchingChargeable
  {:db/ident :fibo-sec-fund-civ/switchingChargeable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundProcessingGeneralTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "switching chargeable"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether a switching charge for changing between sub-funds of the same umbrella can be applied."}})

(def switchingFee
  {:db/ident :fibo-sec-fund-civ/switchingFee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundSubscriptionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "switching fee"},
   :rdfs/range :fibo-fbc-pas-caa/Fee,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Actual percentage or fixed amount of money due when switching to another fund. Definition origin:EFAMA DD"}})

(def takesFormOf
  {:db/ident :fibo-sec-fund-civ/takesFormOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/BricksAndMortarHolding,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "takes form of"},
   :rdfs/range :fibo-fnd-plc-loc/RealEstate,
   :rdfs/subPropertyOf :cmns-col/comprises})

(def trackingError
  {:db/ident :fibo-sec-fund-civ/trackingError,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/InvestmentRestriction,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tracking error"},
   :rdfs/range :cmns-qtu/Percentage,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "See RiskFactors narrative in EFAMA DD"}})

(def typeOfSecurities
  {:db/ident :fibo-sec-fund-civ/typeOfSecurities,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/InvestmentRestriction,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "type of securities"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The type of securities or other holdings that may be invested in."}})

(def valuationFrequency
  {:db/ident :fibo-sec-fund-civ/valuationFrequency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/NetAssetValueCalculationMethod,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "valuation frequency"},
   :rdfs/range :fibo-fnd-dt-fd/RecurrenceInterval,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Frequency of the net asset value calculation."}})

(def valuationFrequencyTextualDescription
  {:db/ident :fibo-sec-fund-civ/valuationFrequencyTextualDescription,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-fund-civ/NetAssetValueCalculationMethod,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "valuation frequency textual description"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Description of the frequency of the net asset value calculation."}})

(def valueAtRisk
  {:db/ident :fibo-sec-fund-civ/valueAtRisk,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/InvestmentRestriction,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "value at risk"},
   :rdfs/range :cmns-qtu/Percentage,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "See RiskClassification_NameOf in EFAMA DD Applies to Fund not Portfolio."}})

(def urn:uuid:8f8222bc-fe26-5132-be0f-e6cf30b52d0a
  {:cmns-av/copyright "Copyright (c) 2013-2024 EDM Council, Inc.",
   :dcterms/abstract
   "Reference data terms and non time dependent facts about funds and CIVs.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Law/LegalCapacity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/OwnershipAndControl/OwnershipParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/SecuritiesRestrictions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/Ratings/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/Indicators/Indicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Organizations/Organizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/SecuritiesClassification/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/Lifecycles/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/SecurityAssets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Law/LegalCore/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/SecuritiesIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/ProductsAndServices/ClientsAndAccounts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Equities/EquityInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Accounting/AccountingEquity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/SecuritiesIdentification/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Funds/Funds/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/CorporateBodies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FinancialInstruments/Settlement/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/DatesAndTimes/BusinessDates/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Funds/CollectiveInvestmentVehicles/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Collective Investment Vehicles Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/"})