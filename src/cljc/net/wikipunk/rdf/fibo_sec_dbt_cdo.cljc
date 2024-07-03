(ns net.wikipunk.rdf.fibo-sec-dbt-cdo
  {:cmns-av/copyright "Copyright (c) 2015-2024 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/CollateralizedDebtObligations/",
   :dcterms/abstract
   "Collateralized debt obligations are tranched debt instruments based on pools of debt instruments, and those pools may have different management styles and objectives. Generally includes an equity tranche. This ontology also covers CDO squared.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-dt-bd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-loan-ln-ln"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/",
    "fibo-sec-dbt-abs"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
    "fibo-sec-dbt-bnd"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/",
    "fibo-sec-dbt-cdo"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
    "fibo-sec-dbt-dbti"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/",
    "fibo-sec-dbt-mbs"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
    "fibo-sec-dbt-pbs"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/",
    "fibo-sec-dbt-syn"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
    "fibo-sec-sec-ast"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets/",
    "fibo-sec-sec-pls"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/Pools/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/AssetBackedSecurities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/FunctionalEntities/FunctionalEntities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/SyntheticCDOs/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/MortgageBackedSecurities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Funds/Funds/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/BusinessDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/LOAN/LoansGeneral/Loans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/CreditDerivatives/CreditDefaultSwaps/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/Bonds/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/SecurityAssets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/DebtInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/PoolBackedSecurities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Agreements/Contracts/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/CollateralizedDebtObligations/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-dbt-cdo",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Collateralized Debt Obligations Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"})

(def ABSCDODeal
  {:db/ident :fibo-sec-dbt-cdo/ABSCDODeal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "a b s c d o deal"},
   :rdfs/subClassOf #{:fibo-sec-dbt-cdo/CDODeal
                      {:owl/onProperty     :cmns-col/comprises,
                       :owl/someValuesFrom {:owl/unionOf
                                            [:fibo-sec-dbt-cdo/CDOPool
                                             :fibo-sec-dbt-cdo/CashABSPool],
                                            :rdf/type :owl/Class},
                       :rdf/type           :owl/Restriction}},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An issue of Asset Backed Security CDO notes."}})

(def ABSCDOInstrument
  {:db/ident :fibo-sec-dbt-cdo/ABSCDOInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "a b s c d o instrument"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/CashCDOTranche,
   :skos/definition {:rdf/language "en",
                     :rdf/value "CDO where the underlying asset pool is ABS."}})

(def AgencyCMO
  {:db/ident :fibo-sec-dbt-cdo/AgencyCMO,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agency c m o"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-sec-dbt-cdo/providesPrepaymentSupport,
      :owl/someValuesFrom :fibo-sec-dbt-cdo/AgencyCMO,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom :fibo-sec-dbt-mbs/AgencyMBSPool,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-sec-dbt-cdo/hasTrancheType,
      :owl/someValuesFrom :fibo-sec-dbt-cdo/TrancheType,
      :rdf/type           :owl/Restriction} :fibo-sec-dbt-dbti/DebtOffering},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Definition for the property 'has tranche type' which is now a restriction: The type of tranche for the CMO. Many different structures are used in practice, including stable PAC bonds or risky IOs and POs. There are floaters and inverse floaters. There are also Z-bonds, which are analogous to zero-coupon bonds."}})

(def AgencyIOTranche
  {:db/ident :fibo-sec-dbt-cdo/AgencyIOTranche,
   :owl/disjointWith :fibo-sec-dbt-cdo/AgencyPOTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agency i o tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/AgencyCMO})

(def AgencyJumpTranche
  {:db/ident :fibo-sec-dbt-cdo/AgencyJumpTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agency jump tranche"},
   :rdfs/subClassOf #{:fibo-sec-dbt-cdo/AgencyCMO
                      {:owl/onProperty     :fibo-sec-dbt-cdo/specifiesTrigger,
                       :owl/someValuesFrom :fibo-sec-dbt-cdo/JumpZTriggerEvent,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A tranche where if there is some sort of trigger event reached then the holders of the tranche will begin to receive payments."}})

(def AgencyJumpZTranche
  {:db/ident :fibo-sec-dbt-cdo/AgencyJumpZTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agency jump z tranche"},
   :rdfs/subClassOf #{:fibo-sec-dbt-cdo/AgencyZTranche
                      :fibo-sec-dbt-cdo/AgencyJumpTranche},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A Jump Z tranche is like a Z tranche but if there is some sort of trigger event reached then the holders of the Jump Z tranche will begin to receive payments. Regular non-Sticky Jump Z tranches maintain their changed status only while the trigger event is in effect, and revert to their old payment status once the trigger event has passed."}})

(def AgencyPOTranche
  {:db/ident :fibo-sec-dbt-cdo/AgencyPOTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agency p o tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/AgencyCMO,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Principal Only tranche. This tranche will only pay principal."}})

(def AgencyRegularJumpZ
  {:db/ident :fibo-sec-dbt-cdo/AgencyRegularJumpZ,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agency regular jump z"},
   :rdfs/subClassOf #{:fibo-sec-dbt-cdo/AgencyJumpZTranche
                      {:owl/onProperty :fibo-sec-dbt-cdo/revertsOn,
                       :owl/someValuesFrom
                       :fibo-sec-dbt-cdo/JumpZTriggerEventReversal,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Regular non-Sticky Jump Z tranches maintain their changed status only while the trigger event is in effect, and revert to their old payment status once the trigger event has passed."}})

(def AgencyStickyJumpZ
  {:db/ident :fibo-sec-dbt-cdo/AgencyStickyJumpZ,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agency sticky jump z"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/AgencyJumpZTranche,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "\"Sticky\" Jump Z tranches maintain the payment priority of a Jump Z tranche until they are retired."}})

(def AgencyZTranche
  {:db/ident :fibo-sec-dbt-cdo/AgencyZTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agency z tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/AgencyCMO,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A tranche that does not receive payments while other tranches remain."}})

(def ArbitrageCDO
  {:db/ident :fibo-sec-dbt-cdo/ArbitrageCDO,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "arbitrage c d o"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-sec-dbt-cdo/hasCDOOriginationObjective,
      :owl/someValuesFrom :fibo-sec-dbt-cdo/ArbitrageCdoObjective,
      :rdf/type           :owl/Restriction} :fibo-sec-dbt-cdo/CDODeal},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Arbitrage CDO/CLO/CBO - the reference assets are bought by a firm or conduit or SPV (Special Purpose Vehicle) with a view to repackage them and sell them on as the structured product."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Arbitrage deals are motivated by the opportunity to add value by repackaging collateral into tranches. This is the same motivation for most CMOs. In finance, the law of one price suggests that the securities of a CDO should have the same market value as its underlying collateral. In practice, this is often not the case. Accordingly, a CDO can represent a theoretical arbitrage. april 28 note: Does this have meaning for Cash CDO? Are these always? Arbitrage is there to exploit market inefficiencies. Would there not be some arbitrage exploited in the CDO. The definition here implies cash CDO only. not cler to reviewers what the ditinctio nis and whether these are mutually excluive. On eview is that the arb CDO has cash inflorws different to cash outflows, e.g. 9.5% v 9% with the 50bp taken as fees. So that might be Arb CDO. There is another type we hav emissed: like an arb CDO where there is instead a spread between in/out as above, you have instead a MArket Value CDO, where its base don the market value of the deal. Not clear how you are supposed to realized that value. you are supposed to realize the xxxx of securities .Seen both referred to. So is arb a risk management tool."}})

(def ArbitrageCdoObjective
  {:db/ident :fibo-sec-dbt-cdo/ArbitrageCdoObjective,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "arbitrage cdo objective"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/CDOOriginationObjective,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The objective is arbitrage, whereby the motivation is to add value by repackaging assets into tranches."}})

(def BalanceSheetCDO
  {:db/ident :fibo-sec-dbt-cdo/BalanceSheetCDO,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "balance sheet c d o"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-sec-dbt-cdo/hasCDOOriginationObjective,
      :owl/someValuesFrom :fibo-sec-dbt-cdo/BalanceSheetCDOObjective,
      :rdf/type           :owl/Restriction} :fibo-sec-dbt-cdo/CDODeal},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Balance Sheet CDO/CLO/CBO - the reference assets for the SDO portfolio are taken from a company/firm's balance sheet."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "With a balance sheet deal, the sponsoring organization is a bank or other institution that holds - or anticipates acquiring - loans or debt that it wants to remove from its balance sheet. Similar to a traditional ABS, the CDO is a vehicle for it to do so. Balance Sheet CDO = Funded CDO. This is about whether or not ther is actual borrowing or lending underpinning the CDO. Does this have meaning in the context of synthetic CDO? It has meaning in the context of a sythetic CDO because you can constructt hat from a unifirm funding and use the CDSs to break up and creat the manyt risks. Derive the funds from a uniform source using CDSs. So that would be on Balance Sheet CDO. April 28 notes does Balance sheet CDPO have any meaning fo rCash =CDO? No. cash CDOs would have to have a balance sheet impact, so this distinction between Balance sheet and Arbittrrage only has meaning for Synthetics."}})

(def BalanceSheetCDOObjective
  {:db/ident :fibo-sec-dbt-cdo/BalanceSheetCDOObjective,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "balance sheet c d o objective"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/CDOOriginationObjective,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The objective is that the CDO is created to move assets off the originator balance sheet."}})

(def CDOCashflowTreatmentStructure
  {:db/ident :fibo-sec-dbt-cdo/CDOCashflowTreatmentStructure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "c d o cashflow treatment structure"},
   :rdfs/subClassOf :fibo-fnd-gao-obj/Strategy,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The way in which cash flows are handled in a CDO."}})

(def CDODeal
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Multiple tranches of securities are issued by the CDO issue (usually referred to simply as the CDO), offering investors various maturity and credit risk characteristics. Note that it is in the sense of CDO as an issue that one might say that a CDO \"has tranches\". The CDO as an individual instrument (labelled CDO in this model) does not have tranches but is itself a member of one or another tranche."},
   :db/ident :fibo-sec-dbt-cdo/CDODeal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "c d o deal"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-cxtdsg/appliesTo,
      :owl/someValuesFrom :fibo-sec-dbt-cdo/CollateralizedDebtObligation,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-col/hasConstituent,
      :owl/someValuesFrom :fibo-sec-dbt-cdo/CDOPortfolio,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-col/hasConstituent,
      :owl/someValuesFrom :fibo-sec-dbt-cdo/SubordinatedCDOEquity,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-col/hasConstituent,
      :owl/someValuesFrom :fibo-sec-dbt-cdo/SuperSeniorCDOTranche,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-col/hasConstituent,
      :owl/someValuesFrom :fibo-sec-dbt-cdo/SeniorCDOTranche,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-rel-rel/isManagedBy,
      :owl/someValuesFrom :fibo-sec-dbt-cdo/CDOPortfolioManager,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-col/hasConstituent,
      :owl/someValuesFrom :fibo-sec-dbt-cdo/MezzanineCDOTranche,
      :rdf/type           :owl/Restriction} :fibo-sec-dbt-dbti/DebtOffering},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An Issue of a set of CDO tranches as part of an offering to the market."}})

(def CDOManagementStyle
  {:db/ident :fibo-sec-dbt-cdo/CDOManagementStyle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "c d o management style"},
   :rdfs/subClassOf :fibo-fnd-gao-obj/Strategy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The manner in which reference assets are managed during the life of a CDO."}})

(def CDOOriginationObjective
  {:db/ident :fibo-sec-dbt-cdo/CDOOriginationObjective,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "c d o origination objective"},
   :rdfs/subClassOf :fibo-fnd-gao-obj/Objective,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The origin or motivation behind a CDO issue."}})

(def CDOPool
  {:db/ident :fibo-sec-dbt-cdo/CDOPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "c d o pool"},
   :rdfs/subClassOf :fibo-sec-sec-pls/DebtPool,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A pool of CDO securities. The underlying of the CDO Squared is a pool of CDO instruments."}})

(def CDOPortfolio
  {:db/ident :fibo-sec-dbt-cdo/CDOPortfolio,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "c d o portfolio"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-col/hasConstituent,
      :owl/someValuesFrom :fibo-sec-dbt-cdo/MBSInstrumentSlice,
      :rdf/type           :owl/Restriction} :fibo-sec-sec-ast/Portfolio
     {:owl/onProperty     :fibo-fnd-rel-rel/isManagedBy,
      :owl/someValuesFrom :fibo-sec-dbt-cdo/CDOPortfolioManager,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A portfolio in which the reference assets of the CDO are held."}})

(def CDOPortfolioManager
  {:db/ident :fibo-sec-dbt-cdo/CDOPortfolioManager,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "c d o portfolio manager"},
   :rdfs/subClassOf #{:cmns-pts/PartyRole
                      {:owl/onProperty     :fibo-fnd-rel-rel/manages,
                       :owl/someValuesFrom :fibo-sec-dbt-cdo/CDOPortfolio,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The portfolio manager for a managed CDO or arbitrage CDO (also called an asset manager). This assumes that the role is the same in both cases."}})

(def CDOSquaredDeal
  {:db/ident :fibo-sec-dbt-cdo/CDOSquaredDeal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "c d o squared deal"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-col/comprises,
                       :owl/someValuesFrom :fibo-sec-dbt-cdo/CDOPool,
                       :rdf/type           :owl/Restriction}
                      :fibo-sec-dbt-cdo/CDODeal},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An issue of CDO Squared notes."}})

(def CDOSquaredInstrument
  {:db/ident :fibo-sec-dbt-cdo/CDOSquaredInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "c d o squared instrument"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/CollateralizedDebtObligation,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "CDOs where the underlying asset pool is CDOs."}})

(def CDOTrancheSenioritySelection
  {:db/ident :fibo-sec-dbt-cdo/CDOTrancheSenioritySelection,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CDOTrancheSenioritySelection"},
   :skos/definition {:rdf/language "en",
                     :rdf/value "The seniority of a tranche of a CDO issue."}})

(def CMODeal
  {:db/ident :fibo-sec-dbt-cdo/CMODeal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "c m o deal"},
   :rdfs/subClassOf :fibo-sec-dbt-dbti/DebtOffering,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An issue of Collateralized mortgaged Obligations."}})

(def CashABSPool
  {:db/ident :fibo-sec-dbt-cdo/CashABSPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cash a b s pool"},
   :rdfs/subClassOf :fibo-sec-sec-pls/DebtPool,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A pool investment consisting of a collection of cash ABS instruments."}})

(def CashCDO
  {:db/ident :fibo-sec-dbt-cdo/CashCDO,
   :owl/disjointWith :fibo-sec-dbt-syn/SyntheticCDO,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cash c d o"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-sec-dbt-cdo/issues,
                       :owl/someValuesFrom :fibo-sec-dbt-cdo/CashCDOTranche,
                       :rdf/type           :owl/Restriction}
                      :fibo-sec-dbt-cdo/CDODeal},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A CDO which has an uderlying portfolio of assets which are held by the issuer."}})

(def CashCDOTranche
  {:db/ident :fibo-sec-dbt-cdo/CashCDOTranche,
   :owl/disjointWith #{:fibo-sec-dbt-syn/SyntheticCDOTranche
                       :fibo-sec-dbt-pbs/AssetBackedSecurity},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cash c d o tranche"},
   :rdfs/subClassOf #{:fibo-sec-dbt-pbs/Tranche
                      {:owl/onProperty     :cmns-col/isConstituentOf,
                       :owl/someValuesFrom {:owl/unionOf
                                            [:fibo-sec-dbt-abs/BondPool
                                             :fibo-sec-sec-pls/DebtPool],
                                            :rdf/type :owl/Class},
                       :rdf/type           :owl/Restriction}
                      :fibo-sec-dbt-cdo/CollateralizedDebtObligation}})

(def CashflowCDO
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "There are some cases where \"triggers\" can come into effect to cause the payments to be distributed in other ways. For example, if the CDO fails its senior overcollateralization (OC) trigger, it may cause extra cash to be diverted to the senior tranches' principal in order to bring the deal back into compliance with the OC test."},
   :db/ident :fibo-sec-dbt-cdo/CashflowCDO,
   :owl/disjointWith :fibo-sec-dbt-cdo/MarketValueCDO,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cashflow c d o"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-sec-dbt-cdo/structure.2,
                       :owl/someValuesFrom :fibo-sec-dbt-cdo/CashflowStructure,
                       :rdf/type           :owl/Restriction}
                      :fibo-sec-dbt-cdo/CDODeal},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A cash-flow CDO is analogous to a CMO. Cash flows from collateral are used to pay principal and interest to investors. If such cash flows prove inadequate, principal and interest is paid to tranches according to seniority. At any point in time, all immediate obligations to a given tranch are met before any payments are made to less senior tranches."}})

(def CashflowStructure
  {:db/ident :fibo-sec-dbt-cdo/CashflowStructure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cashflow structure"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/CDOCashflowTreatmentStructure,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The source of funds for the CDO is cashflow. this means that cash flows from collateral are used to pay principal and interest to investors."}})

(def CollateralizedBondObligation
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "CBO"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A multitranche debt structure similar in some respects to a collateralized mortgage obligation (CMO) structure. Typically low-rated bonds rather than mortgages serve as the collateral. The organization creating and promoting the structure usually holds the underlying equity and may also collect a fee. Junk bonds are typically not investment grade, but because they pool several types of credit quality bonds together, they offer enough diversification to be \"investment grade.\" For example high yield [emerging market] CBO which consists of a portfolio of different high yield [emerging market] bonds. Investopedia: Similar in structure to a collateralized mortgage obligation (CMO), but different in that CBOs represent different levels of credit risk, not different maturities. Defoinition Origin:Investopedia"},
   :db/ident :fibo-sec-dbt-cdo/CollateralizedBondObligation,
   :owl/disjointWith #{:fibo-sec-dbt-cdo/AgencyCMO
                       :fibo-sec-dbt-cdo/CollateralizedLoanObligationOffering},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "collateralized bond obligation"},
   :rdfs/subClassOf #{:fibo-sec-dbt-cdo/CashCDOTranche
                      {:owl/onProperty     :cmns-doc/refersTo,
                       :owl/someValuesFrom :fibo-sec-dbt-abs/BondPool,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "structured debt security that has investment-grade bonds as its underlying assets backed by the receivables on high-yield or junk bonds"}})

(def CollateralizedDebtObligation
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "CDO"},
   :db/ident :fibo-sec-dbt-cdo/CollateralizedDebtObligation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "collateralized debt obligation"},
   :rdfs/subClassOf #{:fibo-sec-dbt-pbs/StructuredFinanceInstrument
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onClass
                       :fibo-sec-dbt-cdo/CollateralizedDebtObligation,
                       :owl/onProperty :fibo-sec-dbt-dbti/isSubordinatedTo,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "structured finance constructed from a portfolio of fixed income assets including corporate loans and mortgage backed securities. A special purpose vehicle (SPV) issues notes to investors in order to raise funds that are invested in a portfolio of those fixed income assets, held by the SPV as collateral for the notes. Further notes: Collateralized Debt Obligation, for example, ABS CDO which consists of a portfolio of different ABS bonds, and the payments to the holders of these trust certificates are derived from the cash flows of the ABS bonds. This CDO instrument is part of a CDO issue, consisting of individual CDO instruments of a given seniority. Often referred to as tranches and slices (Investopedia). Investopedia: Similar in structure to a collateralized mortgage obligation (CMO) or collateralized bond obligation (CBO), CDOs are unique in that they represent different types of debt and credit risk. In the case of CDOs, these different types of debt are often referred to as 'tranches' or 'slices'. Each slice has a different maturity and risk associated with it. The higher the risk, the more the CDO pays. Further details: Collateralized Debt obligations are securitized interests in pools of - generally non-mortgage - assets. Assets - called collateral - usually comprise loans or debt instruments. A CDO may be called a collateralized loan obligation (CLO) or collateralized bond obligation (CBO) if it holds only loans or bonds, respectively. Investors bear the credit risk of the collateral. Multiple tranches of securities are issued by the CDO, offering investors various maturity and credit risk characteristics."}})

(def CollateralizedLoanObligationOffering
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "CLO offering"},
   :db/ident :fibo-sec-dbt-cdo/CollateralizedLoanObligationOffering,
   :owl/disjointWith :fibo-sec-dbt-cdo/AgencyCMO,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "collateralized loan obligation offering"},
   :rdfs/subClassOf #{:fibo-sec-dbt-dbti/DebtOffering
                      {:owl/onProperty     :cmns-doc/refersTo,
                       :owl/someValuesFrom :fibo-sec-dbt-cdo/LoanPool,
                       :rdf/type           :owl/Restriction}}})

(def FloaterTranche
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "For example, 3 month LIBOR +50 -- meaning that the coupon would be whatever the 3 month LIBOR is plus 50 basis points. This is not a continuously updated number, rather it resets at specified intervals."},
   :db/ident :fibo-sec-dbt-cdo/FloaterTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "floater tranche"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-fnd-dt-fd/hasRecurrenceInterval,
                       :owl/someValuesFrom :fibo-fnd-dt-bd/DayOfMonth,
                       :rdf/type :owl/Restriction}
                      :fibo-sec-dbt-cdo/TranchedMBSInstrument},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A floater tranche is a tranche that is keyed to an index and a spread."}})

(def HybridCDO
  {:db/ident :fibo-sec-dbt-cdo/HybridCDO,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "hybrid c d o"},
   :rdfs/subClassOf #{{:owl/allValuesFrom
                       {:owl/unionOf [:fibo-sec-dbt-cdo/CashCDOTranche
                                      :fibo-sec-dbt-syn/SyntheticCDOTranche],
                        :rdf/type    :owl/Class},
                       :owl/onProperty :cmns-cxtdsg/appliesTo,
                       :rdf/type :owl/Restriction} :fibo-sec-dbt-cdo/CDODeal},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A CDO which combines features both of the cash and synthetic CDO. This is a CDO with tranches of cash and tranches of synthetic underlying assets. Further notes: So for example an issiue of $550 million may have $500 million in an asset pool and an additional $50 million created via a synthetic asset."}})

(def IOette
  {:db/ident :fibo-sec-dbt-cdo/IOette,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "i oette"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/AgencyIOTranche,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "REVIEW: Is this a kind of IO Tranche."}})

(def InverseFloaterTranche
  {:db/ident :fibo-sec-dbt-cdo/InverseFloaterTranche,
   :owl/disjointWith #{:fibo-sec-dbt-cdo/SuperFloaterTranche
                       :fibo-sec-dbt-cdo/RegularFloaterTranche},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "inverse floater tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/FloaterTranche})

(def JumpZTriggerEvent
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "If this trigger event is reached then the holders of the Jump Z tranche will begin to receive payments. Regular non-Sticky Jump Z tranches maintain their changed status only while the trigger event is in effect, and revert to their old payment status once the trigger event has passed. The event may be a market event or an event relating to the deal."},
   :db/ident :fibo-sec-dbt-cdo/JumpZTriggerEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "jump z trigger event"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/TriggerEvent,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The event which triggers the Jump Z"}})

(def JumpZTriggerEventReversal
  {:db/ident :fibo-sec-dbt-cdo/JumpZTriggerEventReversal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "jump z trigger event reversal"},
   :rdfs/subClassOf #{:fibo-sec-dbt-cdo/TriggerEvent
                      {:owl/onProperty
                       :fibo-sec-dbt-cdo/specifiesReverseTrigger,
                       :owl/someValuesFrom :fibo-sec-dbt-cdo/JumpZTriggerEvent,
                       :rdf/type :owl/Restriction}},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The reversal of the event which triggers the Jump Z"}})

(def LoanPool
  {:db/ident :fibo-sec-dbt-cdo/LoanPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "loan pool"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-col/hasConstituent,
                       :owl/someValuesFrom :fibo-loan-ln-ln/Loan,
                       :rdf/type           :owl/Restriction}
                      :fibo-sec-sec-pls/DebtPool},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "debt pool whose consituents are loans"}})

(def MBSInstrumentSlice
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "These may be held in different notes, with different denominations. Tranche slice in this sense is only relevant in the context of something like a CDO or analogous things such as CBO."},
   :db/ident :fibo-sec-dbt-cdo/MBSInstrumentSlice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "m b s instrument slice"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-doc/refersTo,
      :owl/someValuesFrom {:owl/unionOf
                           [:fibo-sec-dbt-cdo/MBSTrancheNote
                            :fibo-sec-dbt-mbs/PassThroughMBSInstrumentNote],
                           :rdf/type :owl/Class},
      :rdf/type           :owl/Restriction} :fibo-sec-sec-ast/PortfolioHolding},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "A holding of an individual slice or slices of a tranche."}})

(def MBSTrancheNote
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A Tranche is made up of e.g. $500m in notes and so on. These may be in different notes, with different denominations. Analytics that would apply to the Tranche would by implication apply to each slice of the tranche."},
   :db/ident :fibo-sec-dbt-cdo/MBSTrancheNote,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "m b s tranche note"},
   :rdfs/subClassOf :fibo-fbc-dae-dbt/PromissoryNote,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An individual note of a tranche."}})

(def ManagedCDO
  {:db/ident :fibo-sec-dbt-cdo/ManagedCDO,
   :owl/disjointWith :fibo-sec-dbt-cdo/StaticCDO,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "managed c d o"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-sec-dbt-cdo/managementStyle.1,
      :owl/someValuesFrom :fibo-sec-dbt-cdo/ManagedManagementStyle,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-col/hasConstituent,
      :owl/someValuesFrom :fibo-sec-dbt-cdo/MBSInstrumentSlice,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-col/hasConstituent,
      :owl/someValuesFrom :fibo-sec-dbt-cdo/ManagedCDOPortfolio,
      :rdf/type           :owl/Restriction} :fibo-sec-dbt-cdo/CDODeal},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A CDO where the reference assets are bought (the portfolio is ramped up) and then the CDO manager may alter the portfolio as they see fit."}})

(def ManagedCDOPortfolio
  {:db/ident :fibo-sec-dbt-cdo/ManagedCDOPortfolio,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "managed c d o portfolio"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/CDOPortfolio,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A portfolio where the reference assets of the CDO are bought (the portfolio is ramped up) and then the CDO manager may alter the portfolio as they see fit."}})

(def ManagedManagementStyle
  {:db/ident :fibo-sec-dbt-cdo/ManagedManagementStyle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "managed management style"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/CDOManagementStyle})

(def MarketValueCDO
  {:db/ident :fibo-sec-dbt-cdo/MarketValueCDO,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "market value c d o"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-sec-dbt-cdo/structure.2,
                       :owl/someValuesFrom
                       :fibo-sec-dbt-cdo/MarketValueStructure,
                       :rdf/type :owl/Restriction} :fibo-sec-dbt-cdo/CDODeal}})

(def MarketValueStructure
  {:db/ident :fibo-sec-dbt-cdo/MarketValueStructure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "market value structure"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/CDOCashflowTreatmentStructure})

(def MezzanineCDOTranche
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "If there are defaults or the CDO's collateral otherwise underperforms, scheduled payments to mezzanine tranches take precedence over those to subordinated/equity tranches."},
   :db/ident :fibo-sec-dbt-cdo/MezzanineCDOTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mezzanine c d o tranche"},
   :rdfs/subClassOf #{:fibo-sec-dbt-cdo/CollateralizedDebtObligation
                      {:owl/onProperty :fibo-sec-dbt-cdo/ratedAtIssue,
                       :owl/someValuesFrom
                       :fibo-sec-dbt-cdo/TrancheRatingAtIssue,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The tranche between senior and subordinated. Mezzanine tranches of a CDO issue are typically rated B to BBB."}})

(def MezzanineMBSTranche
  {:db/ident :fibo-sec-dbt-cdo/MezzanineMBSTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mezzanine m b s tranche"},
   :rdfs/subClassOf #{:fibo-sec-dbt-cdo/TranchedMBSInstrument
                      {:owl/onProperty :fibo-sec-dbt-cdo/seniorTo,
                       :owl/someValuesFrom
                       :fibo-sec-dbt-cdo/SubordinatedMBSTranche,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Specific kinds of tranche are modeled for example and investigation only and have been removed from the diagrams. These will be removed from the final model."}})

(def NonAgencyIOTranche
  {:db/ident :fibo-sec-dbt-cdo/NonAgencyIOTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non agency i o tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/TranchedMBSInstrument,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Interest Only tranche, meaning that this tranche will only pay interest."}})

(def NonAgencyJumpTranche
  {:db/ident :fibo-sec-dbt-cdo/NonAgencyJumpTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non agency jump tranche"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-sec-dbt-cdo/specifiesTrigger,
                       :owl/someValuesFrom :fibo-sec-dbt-cdo/JumpZTriggerEvent,
                       :rdf/type           :owl/Restriction}
                      :fibo-sec-dbt-cdo/TranchedMBSInstrument},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A tranche where if there is some sort of trigger event reached then the holders of the tranche will begin to receive payments."}})

(def NonAgencyJumpZTranche
  {:db/ident :fibo-sec-dbt-cdo/NonAgencyJumpZTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non agency jump z tranche"},
   :rdfs/subClassOf #{:fibo-sec-dbt-cdo/NonAgencyZTranche
                      :fibo-sec-dbt-cdo/NonAgencyJumpTranche},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A Jump Z tranche is like a Z tranche but if there is some sort of trigger event reached then the holders of the Jump Z tranche will begin to receive payments. Regular non-Sticky Jump Z tranches maintain their changed status only while the trigger event is in effect, and revert to their old payment status once the trigger event has passed."}})

(def NonAgencyPOTranche
  {:db/ident :fibo-sec-dbt-cdo/NonAgencyPOTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non agency p o tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/TranchedMBSInstrument,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Principal Only tranche. This tranche will only pay principal."}})

(def NonAgencyRegularJumpZTranche
  {:db/ident :fibo-sec-dbt-cdo/NonAgencyRegularJumpZTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non agency regular jump z tranche"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-sec-dbt-cdo/reverts,
                       :owl/someValuesFrom
                       :fibo-sec-dbt-cdo/JumpZTriggerEventReversal,
                       :rdf/type :owl/Restriction}
                      :fibo-sec-dbt-cdo/NonAgencyJumpZTranche},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Regular non-Sticky Jump Z tranches maintain their changed status only while the trigger event is in effect, and revert to their old payment status once the trigger event has passed."}})

(def NonAgencyStickyJumpZTranche
  {:db/ident :fibo-sec-dbt-cdo/NonAgencyStickyJumpZTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non agency sticky jump z tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/NonAgencyJumpZTranche,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "\"Sticky\" Jump Z tranches maintain the payment priority of a Jump Z tranche until they are retired."}})

(def NonAgencyZTranche
  {:db/ident :fibo-sec-dbt-cdo/NonAgencyZTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non agency z tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/TranchedMBSInstrument,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A tranche that does not receive payments while other tranches remain."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "These tranches are credited for interest that would have been received and that interest is accrued to the Z tranche. Once all other tranches have been paid, the holders of the Z tranche receive payments. Types of Z Tranche: A Jump Z tranche is like a Z tranche but if there is some sort of trigger event reached then the holders of the Jump Z tranche will begin to receive payments. \"Sticky\" Jump Z tranches maintain this payment priority until they are retired, while regular, non-Sticky Jump Z tranches maintain their changed status only while the trigger event is in effect, and revert to their old payment status once the trigger event has passed. Review note: These are currently separate entries - they should be entries for types of Z Tranche. Add new list and move these to there."}})

(def PAC-1Class
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Principal payment must follow a certain schedule. These tranches have priority over the other tranches in the deal, which are then referred to as the support or companion tranches."},
   :db/ident :fibo-sec-dbt-cdo/PAC-1Class,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "p a c-1 class"},
   :rdfs/subClassOf #{{:owl/allValuesFrom :fibo-sec-dbt-cdo/PAC-2Class,
                       :owl/onProperty :fibo-sec-dbt-cdo/takesPrepaymentAfter,
                       :rdf/type :owl/Restriction}
                      :fibo-sec-dbt-cdo/PlannedAmortizationClassBond},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Planned Amortization Class tranche. PAC-1 is the most senior Planned Amortization Class tranche."}})

(def PAC-2Class
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Principal payment must follow a certain schedule. These tranches have priority over the other tranches in the deal, which are then referred to as the support or companion tranches. For example, let's say you have a deal with a PAC tranche and a support tranche (i.e., a tranche that is a support tranche and is therefore subordinate to the PAC tranche) that has a scheduled payment structure like you did with the PAC bond. That support bond then is called the PAC-2 bond. If you continue, and create another support tranche that also has scheduled payments, that would become the PAC-3 bond."},
   :db/ident :fibo-sec-dbt-cdo/PAC-2Class,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "p a c-2 class"},
   :rdfs/subClassOf #{{:owl/allValuesFrom :fibo-sec-dbt-cdo/PAC-3Class,
                       :owl/onProperty :fibo-sec-dbt-cdo/takesPrepaymentAfter.1,
                       :rdf/type :owl/Restriction}
                      :fibo-sec-dbt-cdo/PlannedAmortizationClassBond},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Planned Amortization Class tranche. PAC-2 refers to a support tranche that is given a scheduled payment structure like a PAC bond."}})

(def PAC-3Class
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Principal payment must follow a certain schedule. These tranches have priority over the other tranches in the deal, which are then referred to as the support or companion tranches. See PAC-2 for explanation. If you continue, and create another support tranche that also has scheduled payments, that would become the PAC-3 bond."},
   :db/ident :fibo-sec-dbt-cdo/PAC-3Class,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "p a c-3 class"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/PlannedAmortizationClassBond,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Planned Amortization Class tranche. Additional support tranche with scheduled payments."}})

(def PAC-ZTranche
  {:db/ident :fibo-sec-dbt-cdo/PAC-ZTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "p a c- z tranche"},
   :rdfs/subClassOf #{:fibo-sec-dbt-cdo/AgencyZTranche
                      :fibo-sec-dbt-cdo/PlannedAmortizationClassBond},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Planned Amortization Class tranche which is also a Z tranche, that is Definition needed."},
   :skos/editorialNote {:rdf/language "en",
                        :rdf/value
                        "Assume this is a PAC tranche that is a Z Tranche."}})

(def PACPOTranche
  {:db/ident :fibo-sec-dbt-cdo/PACPOTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "p a c p o tranche"},
   :rdfs/subClassOf #{:fibo-sec-dbt-cdo/AgencyPOTranche
                      :fibo-sec-dbt-cdo/PlannedAmortizationClassBond},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Planned Amortization Class principal only tranche."}})

(def PACTrancheAmortizationSchedule
  {:db/ident :fibo-sec-dbt-cdo/PACTrancheAmortizationSchedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "p a c tranche amortization schedule"},
   :rdfs/subClassOf :fibo-sec-dbt-bnd/RedemptionSchedule})

(def PlannedAmortizationClassBond
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "These tranches have priority over the other tranches in the deal, which are then referred to as the support or companion tranches. There are usually several PAC tranches created. PAC-1, PAC-2, PAC-3 -- this requires some more explanation. PAC-2 refers to a support tranche that is given a scheduled payment structure like a PAC bond. For example, let's say you have a deal with a PAC tranche and a support tranche (i.e., a tranche that is a support tranche and is therefore subordinate to the PAC tranche) that has a scheduled payment structure like you did with the PAC bond. That support bond then is called the PAC-2 bond. If you continue, and create another support tranche that also has scheduled payments, that would become the PAC-3 bond. Prospectus will cover each class. Prospectus is at the level of an issue."},
   :db/ident :fibo-sec-dbt-cdo/PlannedAmortizationClassBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "planned amortization class bond"},
   :rdfs/subClassOf
   #{:fibo-sec-dbt-cdo/AgencyCMO
     {:owl/allValuesFrom :fibo-sec-dbt-cdo/PlannedAmortizationClassBond,
      :owl/onProperty    :fibo-sec-dbt-cdo/supportedBy,
      :rdf/type          :owl/Restriction}
     {:owl/allValuesFrom :fibo-sec-dbt-cdo/PlannedAmortizationClassBond,
      :owl/onProperty    :fibo-sec-dbt-cdo/providesPrepaymentSupportFor,
      :rdf/type          :owl/Restriction}
     {:owl/onProperty     :fibo-sec-dbt-cdo/specifies,
      :owl/someValuesFrom :fibo-sec-dbt-cdo/PACTrancheAmortizationSchedule,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Planned Amortization Class tranche.This is a tranche where the principal payment must follow a certain schedule."}})

(def RegularFloaterTranche
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "For example, 3 month LIBOR +50 -- meaning that the coupon would be whatever the 3 month LIBOR is plus 50 basis points. This is not a continuously updated number, rather it resets at specified intervals."},
   :db/ident :fibo-sec-dbt-cdo/RegularFloaterTranche,
   :owl/disjointWith :fibo-sec-dbt-cdo/SuperFloaterTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "regular floater tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/FloaterTranche,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A floater tranche is a tranche that is keyed to an index and a spread. The spread is added to the index."}})

(def ResidualTranche
  {:db/ident :fibo-sec-dbt-cdo/ResidualTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "residual tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/TranchedMBSInstrument,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Unknown Further notes: Verify whether Residual Tranche and Support Tranche are meant to be in the same list of types as PAC etc. i.e. can a tranche not be PAC and Residual? this looks suspicioulsy like two semantics."}})

(def SeniorCDOTranche
  {:db/ident :fibo-sec-dbt-cdo/SeniorCDOTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "senior c d o tranche"},
   :rdfs/subClassOf
   #{:fibo-sec-dbt-pbs/Tranche :fibo-sec-dbt-cdo/CollateralizedDebtObligation
     {:owl/onProperty     :fibo-sec-dbt-cdo/ratedAtIssue.1,
      :owl/someValuesFrom :fibo-sec-dbt-cdo/TrancheRatingAtIssue,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The most senior tranche of the CDO issue. Typically rated A to AAA. If there are defaults or the CDO's collateral otherwise underperforms, scheduled payments to senior tranches take precedence over those of mezzanine tranches."}})

(def SeniorMBSTranche
  {:db/ident :fibo-sec-dbt-cdo/SeniorMBSTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "senior m b s tranche"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-sec-dbt-cdo/seniorTo,
                       :owl/someValuesFrom
                       :fibo-sec-dbt-cdo/MezzanineMBSTranche,
                       :rdf/type :owl/Restriction}
                      :fibo-sec-dbt-cdo/TranchedMBSInstrument},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Specific kinds of tranche are modeled for example and investigation only and have been removed from the diagrams. These will be removed from the final model."}})

(def StaticCDO
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Investors can assess the various tranches of the CDO with full knowledge of what the collateral will be. The primary risk they face is credit risk. A deal that starts off managed can become static if the performance is too poor. Also, some deals are static but allow managers to sell out poorly performing assets subject to certain conditions, but do not allow purchase of new assets, so are semi-static."},
   :db/ident :fibo-sec-dbt-cdo/StaticCDO,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "static c d o"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-sec-dbt-cdo/managementStyle.1,
                       :owl/someValuesFrom
                       :fibo-sec-dbt-cdo/StaticManagementStyle,
                       :rdf/type :owl/Restriction} :fibo-sec-dbt-cdo/CDODeal},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A CDO where collateral is fixed through the life of the CDO. The reference assets are bought and then are kept untouched for the term of the product."}})

(def StaticCDOPortfolio
  {:db/ident :fibo-sec-dbt-cdo/StaticCDOPortfolio,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "static c d o portfolio"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/CDOPortfolio,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A portfolio where collateral of the CDO is fixed through the life of the CDO. The reference assets are bought and then are kept untouched for the term of the product."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "There are cases where badly performing assets may be sold off. These are not modeled at present and it's possible that a third type of CDO may be indicated where the portfolio manager has certain capabilities."}})

(def StaticManagementStyle
  {:db/ident :fibo-sec-dbt-cdo/StaticManagementStyle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "static management style"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/CDOManagementStyle})

(def SubordinatedCDOEquity
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This is not a tranche of the debt in the CDO but an equity interest in the pool of underlying. There is a very bottom piece, not a tranche, but rather called the preferred shares (or just pref shares, or equity) that is the very bottom most layer in a CDO and is also referred to as the \"first loss piece\" since, like equity in a corporation, losses are incurred here before any of the actual bond holders take losses. This isn't a tranche"},
   :db/ident :fibo-sec-dbt-cdo/SubordinatedCDOEquity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subordinated c d o equity"},
   :rdfs/subClassOf :fibo-fbc-fi-fi/Security,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The subordinated (also known as equity) CDO tranche is the most junior tranche in the CDO issue. If there are defaults or the CDO's collateral otherwise underperforms, scheduled payments to senior and mezzanine tranches take precedence over those to subordinated/equity tranches."}})

(def SubordinatedMBSTranche
  {:db/ident :fibo-sec-dbt-cdo/SubordinatedMBSTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subordinated m b s tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/TranchedMBSInstrument,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Specific kinds of tranche are modeled for example and investigation only and have been removed from the diagrams. These will be removed from the final model."}})

(def SuperFloaterTranche
  {:db/ident :fibo-sec-dbt-cdo/SuperFloaterTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "super floater tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/FloaterTranche})

(def SuperPOTranche
  {:db/ident :fibo-sec-dbt-cdo/SuperPOTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "super p o tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/AgencyPOTranche,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Principal Only tranche. This tranche will only pay principal. Not clear how this is distinct from generic PO."}})

(def SuperSeniorCDOTranche
  {:db/ident :fibo-sec-dbt-cdo/SuperSeniorCDOTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "super senior c d o tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/CollateralizedDebtObligation,
   :skos/definition {:rdf/language "en",
                     :rdf/value "A tranche at the very top of a CDO Issue."}})

(def SupportTranche
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "PAC tranches have priority over the other tranches in the deal, which are then referred to as the support or companion tranches."},
   :db/ident :fibo-sec-dbt-cdo/SupportTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "support tranche"},
   :rdfs/subClassOf {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
                     :owl/someValuesFrom :fibo-sec-dbt-cdo/PAC-2Class,
                     :rdf/type           :owl/Restriction},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "A tranche which provides payment support to a PAC Tranche."}})

(def TACTranche
  {:db/ident :fibo-sec-dbt-cdo/TACTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "t a c tranche"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-sec-dbt-cdo/specifies.1,
                       :owl/someValuesFrom
                       :fibo-sec-dbt-cdo/TACTrancheAmortizationSchedule,
                       :rdf/type :owl/Restriction} :fibo-sec-dbt-cdo/AgencyCMO
                      :fibo-sec-dbt-cdo/TranchedMBSInstrument},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Targeted Amortization Class. This is related to a PAC tranche and has a payment schedule geared towards a specified prepayment speed (called the pricing speed). Agency CMO"},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "The main difference between TAC and PAC is that the PAC schedule remains under a certain prepayment range (such as 50-150 PSA) while the TAC tranche is geared from the outset at a specified prepayment speed (such as 150 PSA). Math note: Originally specified in PSAin the examples. What is PSA? Review how we have modeled \"Payment Speed\" as a concept."}})

(def TACTrancheAmortizationSchedule
  {:db/ident :fibo-sec-dbt-cdo/TACTrancheAmortizationSchedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "t a c tranche amortization schedule"},
   :rdfs/subClassOf :fibo-sec-dbt-bnd/RedemptionSchedule})

(def TrancheRatingAtIssue
  {:db/ident :fibo-sec-dbt-cdo/TrancheRatingAtIssue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tranche rating at issue"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The rating at issue of a tranche of a security. Note this is under review"},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "In the case of CDOs, senior and mezzanine tranches of a CDO issue are typically rated, with the former receiving ratings of A to AAA and the latter receiving ratings of B to BBB. The ratings reflect both the credit quality of underlying collateral as well as how much protection a given tranch is afforded by tranches that are subordinate to it. Review note: Remove this it's no different from an instrument."}})

(def TrancheType
  {:db/ident :fibo-sec-dbt-cdo/TrancheType,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tranche type"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the type of tranche in a tranched MBS security"}})

(def TranchedMBSDeal
  {:db/ident :fibo-sec-dbt-cdo/TranchedMBSDeal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tranched m b s deal"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-sec-dbt-cdo/isAlso.1,
      :owl/someValuesFrom :fibo-sec-dbt-mbs/PrivateLabelMBSDeal,
      :rdf/type           :owl/Restriction} :fibo-sec-dbt-dbti/DebtOffering}})

(def TranchedMBSDealProspectus
  {:db/ident :fibo-sec-dbt-cdo/TranchedMBSDealProspectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tranched m b s deal prospectus"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/MortgageBackedSecurityOfferingProspectus})

(def TranchedMBSInstrument
  {:db/ident :fibo-sec-dbt-cdo/TranchedMBSInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tranched m b s instrument"},
   :rdfs/subClassOf
   #{{:owl/allValuesFrom :fibo-sec-dbt-cdo/TranchedMBSInstrument,
      :owl/onProperty    :fibo-sec-dbt-cdo/providesCreditSupportTo,
      :rdf/type          :owl/Restriction}
     {:owl/allValuesFrom :fibo-sec-dbt-cdo/TranchedMBSInstrument,
      :owl/onProperty    :fibo-sec-dbt-cdo/cashflowPrecedence,
      :rdf/type          :owl/Restriction}
     {:owl/onProperty     :fibo-sec-dbt-mbs/hasNote,
      :owl/someValuesFrom :fibo-sec-dbt-cdo/MBSTrancheNote,
      :rdf/type           :owl/Restriction}
     :fibo-sec-dbt-mbs/MortgageBackedSecurity}})

(def TriggerEvent
  {:db/ident :fibo-sec-dbt-cdo/TriggerEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "trigger event"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Any event where some value passes some threashold. Or some other type of business event. This is not restricted to \"trigger\" in the sense of a value passing a threshold. Can also be an seen such as a CDO manager going into bankruptcy."}})

(def TruePSObjective
  {:db/ident :fibo-sec-dbt-cdo/TruePSObjective,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "true p s objective"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/CDOOriginationObjective})

(def cashflowPrecedence
  {:db/ident :fibo-sec-dbt-cdo/cashflowPrecedence,
   :owl/inverseOf :fibo-sec-dbt-cdo/providesCreditSupportTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/TranchedMBSInstrument,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cashflow precedence"},
   :rdfs/range :fibo-sec-dbt-cdo/TranchedMBSInstrument})

(def confersOwnershipOf
  {:db/ident :fibo-sec-dbt-cdo/confersOwnershipOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/SubordinatedCDOEquity,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "confers ownership of"}})

(def denomination
  {:db/ident :fibo-sec-dbt-cdo/denomination,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/MBSTrancheNote,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "denomination"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The currency amount in which the Note is denominated, for example $500 notes."}})

(def hasCDOOriginationObjective
  {:db/ident :fibo-sec-dbt-cdo/hasCDOOriginationObjective,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/CDODeal,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has c d o origination objective"},
   :rdfs/range :fibo-sec-dbt-cdo/CDOOriginationObjective})

(def hasTrancheType
  {:db/ident :fibo-sec-dbt-cdo/hasTrancheType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-pbs/StructuredFinanceInstrument,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has tranche type"},
   :rdfs/range :fibo-sec-dbt-cdo/TrancheType})

(def isAlso_1
  {:db/ident :fibo-sec-dbt-cdo/isAlso.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/TranchedMBSDeal,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is also"},
   :rdfs/range :fibo-sec-dbt-mbs/PrivateLabelMBSDeal})

(def isCash
  {:db/ident :fibo-sec-dbt-cdo/isCash,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/CollateralizedDebtObligation,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is cash"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether the CDO has an underlying pool of real assets. If yes, the CDO has an underlying pool of real assets. If no, the CDO has a synthetic pool of underlying assets."}})

(def isCash_1
  {:db/ident :fibo-sec-dbt-cdo/isCash.1,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/CashCDOTranche,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is cash"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether the CDO has an underlying pool of real assets. This is yes: the CDO has an underlying pool of real assets,"}})

(def issues
  {:db/ident :fibo-sec-dbt-cdo/issues,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/CashCDO,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issues"},
   :rdfs/range :fibo-sec-dbt-cdo/CashCDOTranche})

(def managementStyle
  {:db/ident :fibo-sec-dbt-cdo/managementStyle,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/CollateralizedDebtObligation,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has deal management style"},
   :rdfs/range :fibo-sec-dbt-cdo/CDOManagementStyle,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether the CDO is static or managed. This refers to whether or not the CDO manager may make changes to the reference portfolio during the life of the security. Further notes: If it is static, collateral is fixed through the life of the CDO. The reference assets are bought and then are kept untouched for the term of the product.If it is managed, the reference assets are bought (the portfolio is ramped up) and then the CDO manager may alter the portfolio as they see fit."}})

(def managementStyle_1
  {:db/ident :fibo-sec-dbt-cdo/managementStyle.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/CDODeal,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "management style"},
   :rdfs/range :fibo-sec-dbt-cdo/CDOManagementStyle,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A CDO where the reference assets are bought (the portfolio is ramped up) and then the CDO manager may alter the portfolio as they see fit."}})

(def origination_2
  {:db/ident :fibo-sec-dbt-cdo/origination.2,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/CollateralizedDebtObligation,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has origination objective"},
   :rdfs/range :fibo-sec-dbt-cdo/CDOOriginationObjective})

(def providesCreditSupportTo
  {:db/ident :fibo-sec-dbt-cdo/providesCreditSupportTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/TranchedMBSInstrument,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "provides credit support to"},
   :rdfs/range :fibo-sec-dbt-cdo/TranchedMBSInstrument,
   :rdfs/subPropertyOf :fibo-sec-dbt-dbti/isSubordinatedTo})

(def providesPrepaymentSupport
  {:db/ident :fibo-sec-dbt-cdo/providesPrepaymentSupport,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/AgencyCMO,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "provides prepayment support"},
   :rdfs/range :fibo-sec-dbt-cdo/AgencyCMO})

(def providesPrepaymentSupportFor
  {:db/ident :fibo-sec-dbt-cdo/providesPrepaymentSupportFor,
   :owl/inverseOf :fibo-sec-dbt-cdo/supportedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/PlannedAmortizationClassBond,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "provides prepayment support for"},
   :rdfs/range :fibo-sec-dbt-cdo/PlannedAmortizationClassBond,
   :rdfs/subPropertyOf :fibo-sec-dbt-cdo/providesPrepaymentSupport})

(def ratedAtIssue
  {:db/ident :fibo-sec-dbt-cdo/ratedAtIssue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/MezzanineCDOTranche,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "rated at issue"},
   :rdfs/range :fibo-sec-dbt-cdo/TrancheRatingAtIssue})

(def ratedAtIssue_1
  {:db/ident :fibo-sec-dbt-cdo/ratedAtIssue.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/SeniorCDOTranche,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "rated at issue"},
   :rdfs/range :fibo-sec-dbt-cdo/TrancheRatingAtIssue})

(def reverts
  {:db/ident :fibo-sec-dbt-cdo/reverts,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/NonAgencyRegularJumpZTranche,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "reverts"},
   :rdfs/range :fibo-sec-dbt-cdo/JumpZTriggerEventReversal})

(def revertsOn
  {:db/ident :fibo-sec-dbt-cdo/revertsOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/AgencyRegularJumpZ,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "reverts on"},
   :rdfs/range :fibo-sec-dbt-cdo/JumpZTriggerEventReversal})

(def seniorTo
  {:db/ident :fibo-sec-dbt-cdo/seniorTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain #{:fibo-sec-dbt-cdo/SeniorMBSTranche
                  :fibo-sec-dbt-cdo/MezzanineMBSTranche},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "senior to"},
   :rdfs/range #{:fibo-sec-dbt-cdo/SubordinatedMBSTranche
                 :fibo-sec-dbt-cdo/MezzanineMBSTranche},
   :rdfs/subPropertyOf :fibo-sec-dbt-cdo/cashflowPrecedence,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Specific kinds of tranche are modeled for example and investigation only and have been removed from the diagrams. These will be removed from the final model."}})

(def seniority
  {:db/ident :fibo-sec-dbt-cdo/seniority,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/CollateralizedDebtObligation,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "seniority"},
   :rdfs/range :fibo-sec-dbt-cdo/CDOTrancheSenioritySelection,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The seniority which defines this tranche. This is the precedence order for scheduled payments. Further notes: Tranches are categorized as senior, mezzanine, and subordinated/equity, according to their degree of credit risk. If there are defaults or the CDO's collateral otherwise underperforms, scheduled payments to senior tranches take precedence over those of mezzanine tranches, and scheduled payments to mezzanine tranches take precedence over those to subordinated/equity tranches. Senior and mezzanine tranches are typically rated, with the former receiving ratings of A to AAA and the latter receiving ratings of B to BBB. The ratings reflect both the credit quality of underlying collateral as well as how much protection a given tranch is afforded by tranches that are subordinate to it."}})

(def seniority_1
  {:db/ident :fibo-sec-dbt-cdo/seniority.1,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/MezzanineCDOTranche,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "seniority"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The seniority which defines this tranche. This is the precedence order for scheduled payments. This is Mezzanine, meaning the tranche between senior and subordinated."}})

(def seniority_2
  {:db/ident :fibo-sec-dbt-cdo/seniority.2,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/SeniorCDOTranche,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "seniority"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The seniority which defines this tranche. This is the precedence order for scheduled payments. This is defined as Senior, i.e. this is the most senior tranche of the CDO issue."}})

(def seniority_3
  {:db/ident :fibo-sec-dbt-cdo/seniority.3,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/SubordinatedCDOEquity,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "seniority"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The seniority which defines this tranche. This is the precedence order for scheduled payments. This is subordinated (also known as equity) and is the most junior tranche in the CDO issue."}})

(def seniority_4
  {:db/ident :fibo-sec-dbt-cdo/seniority.4,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/SuperSeniorCDOTranche,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "seniority"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The seniority which defines this tranche. This is the precedence order for scheduled payments. This is defined as Senior, i.e. this is the most senior tranche of the CDO issue."}})

(def specifies
  {:db/ident :fibo-sec-dbt-cdo/specifies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/PlannedAmortizationClassBond,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "specifies"},
   :rdfs/range :fibo-sec-dbt-cdo/PACTrancheAmortizationSchedule})

(def specifies_1
  {:db/ident :fibo-sec-dbt-cdo/specifies.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/TACTranche,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "specifies"},
   :rdfs/range :fibo-sec-dbt-cdo/TACTrancheAmortizationSchedule})

(def specifiesReverseTrigger
  {:db/ident :fibo-sec-dbt-cdo/specifiesReverseTrigger,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/JumpZTriggerEventReversal,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "specifies reverse trigger"},
   :rdfs/range :fibo-sec-dbt-cdo/JumpZTriggerEvent})

(def specifiesTrigger
  {:db/ident :fibo-sec-dbt-cdo/specifiesTrigger,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain #{:fibo-sec-dbt-cdo/AgencyJumpTranche
                  :fibo-sec-dbt-cdo/NonAgencyJumpTranche},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "specifies trigger"},
   :rdfs/range :fibo-sec-dbt-cdo/JumpZTriggerEvent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The event which, when it takes place, causes the Jump Z holders to begin receiving payments."}})

(def structure
  {:db/ident :fibo-sec-dbt-cdo/structure,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/CollateralizedDebtObligation,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has structure type"},
   :rdfs/range :fibo-sec-dbt-cdo/CDOCashflowTreatmentStructure,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The source of funds for the CDO. This is either cashflow or market value."}})

(def structure_2
  {:db/ident :fibo-sec-dbt-cdo/structure.2,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/CDODeal,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "structure"},
   :rdfs/range :fibo-sec-dbt-cdo/CDOCashflowTreatmentStructure,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The source of funds for the CDO is market value. This means that principal and interest payments to investors come from both collateral cash flows as well as sales of collateral."}})

(def supportedBy
  {:db/ident :fibo-sec-dbt-cdo/supportedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/PlannedAmortizationClassBond,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "supported by"},
   :rdfs/range :fibo-sec-dbt-cdo/PlannedAmortizationClassBond})

(def takesPrepaymentAfter
  {:db/ident :fibo-sec-dbt-cdo/takesPrepaymentAfter,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/PAC-1Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "takes prepayment after"},
   :rdfs/range :fibo-sec-dbt-cdo/PAC-2Class,
   :rdfs/subPropertyOf :fibo-sec-dbt-cdo/supportedBy})

(def takesPrepaymentAfter_1
  {:db/ident :fibo-sec-dbt-cdo/takesPrepaymentAfter.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/PAC-2Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "takes prepayment after"},
   :rdfs/range :fibo-sec-dbt-cdo/PAC-3Class,
   :rdfs/subPropertyOf :fibo-sec-dbt-cdo/supportedBy})

(def urn:uuid:7aed461f-a696-5c99-aa07-bbf4756d656d
  {:cmns-av/copyright "Copyright (c) 2015-2024 EDM Council, Inc.",
   :dcterms/abstract
   "Collateralized debt obligations are tranched debt instruments based on pools of debt instruments, and those pools may have different management styles and objectives. Generally includes an equity tranche. This ontology also covers CDO squared.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/Pools/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/AssetBackedSecurities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/FunctionalEntities/FunctionalEntities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/SyntheticCDOs/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/MortgageBackedSecurities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Funds/Funds/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/BusinessDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/LOAN/LoansGeneral/Loans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/CreditDerivatives/CreditDefaultSwaps/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/Bonds/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/SecurityAssets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/DebtInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/PoolBackedSecurities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Agreements/Contracts/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/CollateralizedDebtObligations/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Collateralized Debt Obligations Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"})