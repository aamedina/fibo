(ns net.wikipunk.rdf.fibo-sec-dbt-cdo
  "Collateralized debt obligations are tranched debt instruments based on pools of debt instruments, and those pools may have different management styles and objectives. Generally includes an equity tranche. This ontology also covers CDO squared."
  {:cmns-av/copyright "Copyright (c) 2015-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :dcterms/abstract
   "Collateralized debt obligations are tranched debt instruments based on pools of debt instruments, and those pools may have different management styles and objectives. Generally includes an equity tranche. This ontology also covers CDO squared.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/DebtInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Funds/Funds/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/SyntheticCDOs/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/MortgageBackedSecurities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/GoalsAndObjectives/Objectives/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/Bonds/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/Ownership/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansGeneral/Loans/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/FunctionalEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecurityAssets/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/CreditDerivatives/CreditDefaultSwaps/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/Pools/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/PoolBackedSecurities/"
    "https://www.omg.org/spec/Commons/Collections/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/CollateralizedDebtObligations/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-loan-ln-ln"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/",
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-dbt-cdo",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Collateralized Debt Obligations Ontology"}})

(def ABSCDODeal
  "An issue of Asset Backed Security CDO notes."
  {:db/ident :fibo-sec-dbt-cdo/ABSCDODeal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "a b s c d o deal"},
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/comprises,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-sec-dbt-cdo/CDOPool
                                            :fibo-sec-dbt-cdo/CashABSPool],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-cdo/CDODeal],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An issue of Asset Backed Security CDO notes."}})

(def ABSCDOInstrument
  "CDO where the underlying asset pool is ABS."
  {:db/ident :fibo-sec-dbt-cdo/ABSCDOInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "a b s c d o instrument"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/CashCDOTranche,
   :skos/definition {:rdf/language "en",
                     :rdf/value "CDO where the underlying asset pool is ABS."}})

(def AgencyCMO
  "agency c m o"
  {:db/ident :fibo-sec-dbt-cdo/AgencyCMO,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agency c m o"},
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/comprises,
                      :owl/someValuesFrom :fibo-sec-dbt-mbs/AgencyMBSPool,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-dbt-mbs/hasTrancheType,
                      :owl/someValuesFrom :fibo-sec-dbt-mbs/TrancheType,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty
                      :fibo-sec-dbt-cdo/providesPrepaymentSupport,
                      :owl/someValuesFrom :fibo-sec-dbt-cdo/AgencyCMO,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-dbti/DebtOffering],
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Definition for the property 'has tranche type' which is now a restriction: The type of tranche for the CMO. Many different structures are used in practice, including stable PAC bonds or risky IOs and POs. There are floaters and inverse floaters. There are also Z-bonds, which are analogous to zero-coupon bonds."}})

(def AgencyIOTranche
  "agency i o tranche"
  {:db/ident :fibo-sec-dbt-cdo/AgencyIOTranche,
   :owl/disjointWith :fibo-sec-dbt-cdo/AgencyPOTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agency i o tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/AgencyCMO})

(def AgencyJumpTranche
  "A tranche where if there is some sort of trigger event reached then the holders of the tranche will begin to receive payments."
  {:db/ident :fibo-sec-dbt-cdo/AgencyJumpTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agency jump tranche"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-dbt-cdo/specifiesTrigger,
                      :owl/someValuesFrom :fibo-sec-dbt-cdo/JumpZTriggerEvent,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-cdo/AgencyCMO],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A tranche where if there is some sort of trigger event reached then the holders of the tranche will begin to receive payments."}})

(def AgencyJumpZTranche
  "A Jump Z tranche is like a Z tranche but if there is some sort of trigger event reached then the holders of the Jump Z tranche will begin to receive payments. Regular non-Sticky Jump Z tranches maintain their changed status only while the trigger event is in effect, and revert to their old payment status once the trigger event has passed."
  {:db/ident :fibo-sec-dbt-cdo/AgencyJumpZTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agency jump z tranche"},
   :rdfs/subClassOf [:fibo-sec-dbt-cdo/AgencyZTranche
                     :fibo-sec-dbt-cdo/AgencyJumpTranche],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A Jump Z tranche is like a Z tranche but if there is some sort of trigger event reached then the holders of the Jump Z tranche will begin to receive payments. Regular non-Sticky Jump Z tranches maintain their changed status only while the trigger event is in effect, and revert to their old payment status once the trigger event has passed."}})

(def AgencyPOTranche
  "Principal Only tranche. This tranche will only pay principal."
  {:db/ident :fibo-sec-dbt-cdo/AgencyPOTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agency p o tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/AgencyCMO,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Principal Only tranche. This tranche will only pay principal."}})

(def AgencyRegularJumpZ
  "Regular non-Sticky Jump Z tranches maintain their changed status only while the trigger event is in effect, and revert to their old payment status once the trigger event has passed."
  {:db/ident :fibo-sec-dbt-cdo/AgencyRegularJumpZ,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agency regular jump z"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-dbt-cdo/revertsOn,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-cdo/JumpZTriggerEventReversal,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-cdo/AgencyJumpZTranche],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Regular non-Sticky Jump Z tranches maintain their changed status only while the trigger event is in effect, and revert to their old payment status once the trigger event has passed."}})

(def AgencyStickyJumpZ
  "\"Sticky\" Jump Z tranches maintain the payment priority of a Jump Z tranche until they are retired."
  {:db/ident :fibo-sec-dbt-cdo/AgencyStickyJumpZ,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agency sticky jump z"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/AgencyJumpZTranche,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "\"Sticky\" Jump Z tranches maintain the payment priority of a Jump Z tranche until they are retired."}})

(def AgencyZTranche
  "A tranche that does not receive payments while other tranches remain."
  {:db/ident :fibo-sec-dbt-cdo/AgencyZTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agency z tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/AgencyCMO,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A tranche that does not receive payments while other tranches remain."}})

(def ArbitrageCDO
  "Arbitrage CDO/CLO/CBO - the reference assets are bought by a firm or conduit or SPV (Special Purpose Vehicle) with a view to repackage them and sell them on as the structured product."
  {:db/ident :fibo-sec-dbt-cdo/ArbitrageCDO,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "arbitrage c d o"},
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-sec-dbt-cdo/hasCDOOriginationObjective,
     :owl/someValuesFrom :fibo-sec-dbt-cdo/ArbitrageCdoObjective,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-cdo/CDODeal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Arbitrage CDO/CLO/CBO - the reference assets are bought by a firm or conduit or SPV (Special Purpose Vehicle) with a view to repackage them and sell them on as the structured product."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Arbitrage deals are motivated by the opportunity to add value by repackaging collateral into tranches. This is the same motivation for most CMOs. In finance, the law of one price suggests that the securities of a CDO should have the same market value as its underlying collateral. In practice, this is often not the case. Accordingly, a CDO can represent a theoretical arbitrage. april 28 note: Does this have meaning for Cash CDO? Are these always? Arbitrage is there to exploit market inefficiencies. Would there not be some arbitrage exploited in the CDO. The definition here implies cash CDO only. not cler to reviewers what the ditinctio nis and whether these are mutually excluive. On eview is that the arb CDO has cash inflorws different to cash outflows, e.g. 9.5% v 9% with the 50bp taken as fees. So that might be Arb CDO. There is another type we hav emissed: like an arb CDO where there is instead a spread between in/out as above, you have instead a MArket Value CDO, where its base don the market value of the deal. Not clear how you are supposed to realized that value. you are supposed to realize the xxxx of securities .Seen both referred to. So is arb a risk management tool."}})

(def ArbitrageCdoObjective
  "The objective is arbitrage, whereby the motivation is to add value by repackaging assets into tranches."
  {:db/ident :fibo-sec-dbt-cdo/ArbitrageCdoObjective,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "arbitrage cdo objective"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/CDOOriginationObjective,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The objective is arbitrage, whereby the motivation is to add value by repackaging assets into tranches."}})

(def BalanceSheetCDO
  "Balance Sheet CDO/CLO/CBO - the reference assets for the SDO portfolio are taken from a company/firm's balance sheet."
  {:db/ident :fibo-sec-dbt-cdo/BalanceSheetCDO,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "balance sheet c d o"},
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-sec-dbt-cdo/hasCDOOriginationObjective,
     :owl/someValuesFrom :fibo-sec-dbt-cdo/BalanceSheetCDOObjective,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-cdo/CDODeal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Balance Sheet CDO/CLO/CBO - the reference assets for the SDO portfolio are taken from a company/firm's balance sheet."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "With a balance sheet deal, the sponsoring organization is a bank or other institution that holds - or anticipates acquiring - loans or debt that it wants to remove from its balance sheet. Similar to a traditional ABS, the CDO is a vehicle for it to do so. Balance Sheet CDO = Funded CDO. This is about whether or not ther is actual borrowing or lending underpinning the CDO. Does this have meaning in the context of synthetic CDO? It has meaning in the context of a sythetic CDO because you can constructt hat from a unifirm funding and use the CDSs to break up and creat the manyt risks. Derive the funds from a uniform source using CDSs. So that would be on Balance Sheet CDO. April 28 notes does Balance sheet CDPO have any meaning fo rCash =CDO? No. cash CDOs would have to have a balance sheet impact, so this distinction between Balance sheet and Arbittrrage only has meaning for Synthetics."}})

(def BalanceSheetCDOObjective
  "The objective is that the CDO is created to move assets off the originator balance sheet."
  {:db/ident :fibo-sec-dbt-cdo/BalanceSheetCDOObjective,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "balance sheet c d o objective"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/CDOOriginationObjective,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The objective is that the CDO is created to move assets off the originator balance sheet."}})

(def BondPool
  "A pool investment consisting of a collection of Bonds."
  {:db/ident :fibo-sec-dbt-cdo/BondPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bond pool"},
   :rdfs/subClassOf :fibo-sec-sec-pls/DebtPool,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A pool investment consisting of a collection of Bonds."}})

(def CDOCashflowTreatmentStructure
  "The way in which cash flows are handled in a CDO."
  {:db/ident :fibo-sec-dbt-cdo/CDOCashflowTreatmentStructure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "c d o cashflow treatment structure"},
   :rdfs/subClassOf :fibo-fnd-gao-obj/Strategy,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The way in which cash flows are handled in a CDO."}})

(def CDODeal
  "An Issue of a set of CDO tranches as part of an offering to the market."
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Multiple tranches of securities are issued by the CDO issue (usually referred to simply as the CDO), offering investors various maturity and credit risk characteristics. Note that it is in the sense of CDO as an issue that one might say that a CDO \"has tranches\". The CDO as an individual instrument (labelled CDO in this model) does not have tranches but is itself a member of one or another tranche."},
   :db/ident :fibo-sec-dbt-cdo/CDODeal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "c d o deal"},
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
     :owl/someValuesFrom :fibo-sec-dbt-cdo/CollateralizedDebtObligation,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-col/hasConstituent,
     :owl/someValuesFrom :fibo-sec-dbt-cdo/CDOPortfolio,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-col/hasConstituent,
     :owl/someValuesFrom :fibo-sec-dbt-cdo/SubordinatedCDOEquity,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-col/hasConstituent,
     :owl/someValuesFrom :fibo-sec-dbt-cdo/MezzanineCDOTranche,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-col/hasConstituent,
     :owl/someValuesFrom :fibo-sec-dbt-cdo/SuperSeniorCDOTranche,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-dbti/DebtOffering
    {:owl/onProperty     :fibo-fnd-rel-rel/isManagedBy,
     :owl/someValuesFrom :fibo-sec-dbt-cdo/CDOPortfolioManager,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-col/hasConstituent,
     :owl/someValuesFrom :fibo-sec-dbt-cdo/SeniorCDOTranche,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An Issue of a set of CDO tranches as part of an offering to the market."}})

(def CDOManagementStyle
  "The manner in which reference assets are managed during the life of a CDO."
  {:db/ident :fibo-sec-dbt-cdo/CDOManagementStyle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "c d o management style"},
   :rdfs/subClassOf :fibo-fnd-gao-obj/Strategy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The manner in which reference assets are managed during the life of a CDO."}})

(def CDOOriginationObjective
  "The origin or motivation behind a CDO issue."
  {:db/ident :fibo-sec-dbt-cdo/CDOOriginationObjective,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "c d o origination objective"},
   :rdfs/subClassOf :fibo-fnd-gao-obj/Objective,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The origin or motivation behind a CDO issue."}})

(def CDOPool
  "A pool of CDO securities. The underlying of the CDO Squared is a pool of CDO instruments."
  {:db/ident :fibo-sec-dbt-cdo/CDOPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "c d o pool"},
   :rdfs/subClassOf :fibo-sec-sec-pls/DebtPool,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A pool of CDO securities. The underlying of the CDO Squared is a pool of CDO instruments."}})

(def CDOPortfolio
  "A portfolio in which the reference assets of the CDO are held."
  {:db/ident :fibo-sec-dbt-cdo/CDOPortfolio,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "c d o portfolio"},
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-sec-dbt-cdo/MBSInstrumentSlice,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/isManagedBy,
                      :owl/someValuesFrom :fibo-sec-dbt-cdo/CDOPortfolioManager,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-ast/Portfolio],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A portfolio in which the reference assets of the CDO are held."}})

(def CDOPortfolioManager
  "The portfolio manager for a managed CDO or arbitrage CDO (also called an asset manager). This assumes that the role is the same in both cases."
  {:db/ident :fibo-sec-dbt-cdo/CDOPortfolioManager,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "c d o portfolio manager"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/manages,
                      :owl/someValuesFrom :fibo-sec-dbt-cdo/CDOPortfolio,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The portfolio manager for a managed CDO or arbitrage CDO (also called an asset manager). This assumes that the role is the same in both cases."}})

(def CDOSquaredDeal
  "An issue of CDO Squared notes."
  {:db/ident :fibo-sec-dbt-cdo/CDOSquaredDeal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "c d o squared deal"},
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/comprises,
                      :owl/someValuesFrom :fibo-sec-dbt-cdo/CDOPool,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-cdo/CDODeal],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An issue of CDO Squared notes."}})

(def CDOSquaredInstrument
  "CDOs where the underlying asset pool is CDOs."
  {:db/ident :fibo-sec-dbt-cdo/CDOSquaredInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "c d o squared instrument"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/CollateralizedDebtObligation,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "CDOs where the underlying asset pool is CDOs."}})

(def CDOTrancheSenioritySelection
  "The seniority of a tranche of a CDO issue."
  {:db/ident :fibo-sec-dbt-cdo/CDOTrancheSenioritySelection,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CDOTrancheSenioritySelection"},
   :skos/definition {:rdf/language "en",
                     :rdf/value "The seniority of a tranche of a CDO issue."}})

(def CMODeal
  "An issue of Collateralized mortgaged Obligations."
  {:db/ident :fibo-sec-dbt-cdo/CMODeal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "c m o deal"},
   :rdfs/subClassOf :fibo-sec-dbt-dbti/DebtOffering,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An issue of Collateralized mortgaged Obligations."}})

(def CashABSPool
  "A pool investment consisting of a collection of cash ABS instruments."
  {:db/ident :fibo-sec-dbt-cdo/CashABSPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cash a b s pool"},
   :rdfs/subClassOf :fibo-sec-sec-pls/DebtPool,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A pool investment consisting of a collection of cash ABS instruments."}})

(def CashCDO
  "A CDO which has an uderlying portfolio of assets which are held by the issuer."
  {:db/ident :fibo-sec-dbt-cdo/CashCDO,
   :owl/disjointWith :fibo-sec-dbt-syn/SyntheticCDO,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cash c d o"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-dbt-cdo/issues,
                      :owl/someValuesFrom :fibo-sec-dbt-cdo/CashCDOTranche,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-cdo/CDODeal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A CDO which has an uderlying portfolio of assets which are held by the issuer."}})

(def CashCDOTranche
  "cash c d o tranche"
  {:db/ident :fibo-sec-dbt-cdo/CashCDOTranche,
   :owl/disjointWith [:fibo-sec-dbt-syn/SyntheticCDOTranche
                      :fibo-sec-dbt-pbs/AssetBackedSecurity],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cash c d o tranche"},
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/isConstituentOf,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-sec-dbt-cdo/BondPool
                                            :fibo-sec-sec-pls/DebtPool],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-pbs/Tranche
                     :fibo-sec-dbt-cdo/CollateralizedDebtObligation]})

(def CashflowCDO
  "A cash-flow CDO is analogous to a CMO. Cash flows from collateral are used to pay principal and interest to investors. If such cash flows prove inadequate, principal and interest is paid to tranches according to seniority. At any point in time, all immediate obligations to a given tranch are met before any payments are made to less senior tranches."
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "There are some cases where \"triggers\" can come into effect to cause the payments to be distributed in other ways. For example, if the CDO fails its senior overcollateralization (OC) trigger, it may cause extra cash to be diverted to the senior tranches' principal in order to bring the deal back into compliance with the OC test."},
   :db/ident :fibo-sec-dbt-cdo/CashflowCDO,
   :owl/disjointWith :fibo-sec-dbt-cdo/MarketValueCDO,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cashflow c d o"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-dbt-cdo/structure.2,
                      :owl/someValuesFrom :fibo-sec-dbt-cdo/CashflowStructure,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-cdo/CDODeal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A cash-flow CDO is analogous to a CMO. Cash flows from collateral are used to pay principal and interest to investors. If such cash flows prove inadequate, principal and interest is paid to tranches according to seniority. At any point in time, all immediate obligations to a given tranch are met before any payments are made to less senior tranches."}})

(def CashflowStructure
  "The source of funds for the CDO is cashflow. this means that cash flows from collateral are used to pay principal and interest to investors."
  {:db/ident :fibo-sec-dbt-cdo/CashflowStructure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cashflow structure"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/CDOCashflowTreatmentStructure,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The source of funds for the CDO is cashflow. this means that cash flows from collateral are used to pay principal and interest to investors."}})

(def CollateralizedBondObligation
  "structured debt security that has investment-grade bonds as its underlying assets backed by the receivables on high-yield or junk bonds"
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "CBO"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A multitranche debt structure similar in some respects to a collateralized mortgage obligation (CMO) structure. Typically low-rated bonds rather than mortgages serve as the collateral. The organization creating and promoting the structure usually holds the underlying equity and may also collect a fee. Junk bonds are typically not investment grade, but because they pool several types of credit quality bonds together, they offer enough diversification to be \"investment grade.\" For example high yield [emerging market] CBO which consists of a portfolio of different high yield [emerging market] bonds. Investopedia: Similar in structure to a collateralized mortgage obligation (CMO), but different in that CBOs represent different levels of credit risk, not different maturities. Defoinition Origin:Investopedia"},
   :db/ident :fibo-sec-dbt-cdo/CollateralizedBondObligation,
   :owl/disjointWith [:fibo-sec-dbt-cdo/AgencyCMO
                      :fibo-sec-dbt-cdo/CollateralizedLoanObligationOffering],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "collateralized bond obligation"},
   :rdfs/subClassOf [:fibo-sec-dbt-cdo/CashCDOTranche
                     {:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-sec-dbt-cdo/BondPool,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "structured debt security that has investment-grade bonds as its underlying assets backed by the receivables on high-yield or junk bonds"}})

(def CollateralizedDebtObligation
  "structured finance constructed from a portfolio of fixed income assets including corporate loans and mortgage backed securities. A special purpose vehicle (SPV) issues notes to investors in order to raise funds that are invested in a portfolio of those fixed income assets, held by the SPV as collateral for the notes. Further notes: Collateralized Debt Obligation, for example, ABS CDO which consists of a portfolio of different ABS bonds, and the payments to the holders of these trust certificates are derived from the cash flows of the ABS bonds. This CDO instrument is part of a CDO issue, consisting of individual CDO instruments of a given seniority. Often referred to as tranches and slices (Investopedia). Investopedia: Similar in structure to a collateralized mortgage obligation (CMO) or collateralized bond obligation (CBO), CDOs are unique in that they represent different types of debt and credit risk. In the case of CDOs, these different types of debt are often referred to as 'tranches' or 'slices'. Each slice has a different maturity and risk associated with it. The higher the risk, the more the CDO pays. Further details: Collateralized Debt obligations are securitized interests in pools of - generally non-mortgage - assets. Assets - called collateral - usually comprise loans or debt instruments. A CDO may be called a collateralized loan obligation (CLO) or collateralized bond obligation (CBO) if it holds only loans or bonds, respectively. Investors bear the credit risk of the collateral. Multiple tranches of securities are issued by the CDO, offering investors various maturity and credit risk characteristics."
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "CDO"},
   :db/ident :fibo-sec-dbt-cdo/CollateralizedDebtObligation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "collateralized debt obligation"},
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onClass
                      :fibo-sec-dbt-cdo/CollateralizedDebtObligation,
                      :owl/onProperty :fibo-sec-dbt-dbti/isSubordinatedTo,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-pbs/StructuredFinanceInstrument],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "structured finance constructed from a portfolio of fixed income assets including corporate loans and mortgage backed securities. A special purpose vehicle (SPV) issues notes to investors in order to raise funds that are invested in a portfolio of those fixed income assets, held by the SPV as collateral for the notes. Further notes: Collateralized Debt Obligation, for example, ABS CDO which consists of a portfolio of different ABS bonds, and the payments to the holders of these trust certificates are derived from the cash flows of the ABS bonds. This CDO instrument is part of a CDO issue, consisting of individual CDO instruments of a given seniority. Often referred to as tranches and slices (Investopedia). Investopedia: Similar in structure to a collateralized mortgage obligation (CMO) or collateralized bond obligation (CBO), CDOs are unique in that they represent different types of debt and credit risk. In the case of CDOs, these different types of debt are often referred to as 'tranches' or 'slices'. Each slice has a different maturity and risk associated with it. The higher the risk, the more the CDO pays. Further details: Collateralized Debt obligations are securitized interests in pools of - generally non-mortgage - assets. Assets - called collateral - usually comprise loans or debt instruments. A CDO may be called a collateralized loan obligation (CLO) or collateralized bond obligation (CBO) if it holds only loans or bonds, respectively. Investors bear the credit risk of the collateral. Multiple tranches of securities are issued by the CDO, offering investors various maturity and credit risk characteristics."}})

(def CollateralizedLoanObligationOffering
  "collateralized loan obligation offering"
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "CLO offering"},
   :db/ident :fibo-sec-dbt-cdo/CollateralizedLoanObligationOffering,
   :owl/disjointWith :fibo-sec-dbt-cdo/AgencyCMO,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "collateralized loan obligation offering"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-sec-dbt-cdo/LoanPool,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-dbti/DebtOffering]})

(def HybridCDO
  "A CDO which combines features both of the cash and synthetic CDO. This is a CDO with tranches of cash and tranches of synthetic underlying assets. Further notes: So for example an issiue of $550 million may have $500 million in an asset pool and an additional $50 million created via a synthetic asset."
  {:db/ident :fibo-sec-dbt-cdo/HybridCDO,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "hybrid c d o"},
   :rdfs/subClassOf [{:owl/allValuesFrom
                      {:owl/unionOf [:fibo-sec-dbt-cdo/CashCDOTranche
                                     :fibo-sec-dbt-syn/SyntheticCDOTranche],
                       :rdf/type    :owl/Class},
                      :owl/onProperty :cmns-cxtdsg/appliesTo,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-cdo/CDODeal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A CDO which combines features both of the cash and synthetic CDO. This is a CDO with tranches of cash and tranches of synthetic underlying assets. Further notes: So for example an issiue of $550 million may have $500 million in an asset pool and an additional $50 million created via a synthetic asset."}})

(def IOette
  "REVIEW: Is this a kind of IO Tranche."
  {:db/ident :fibo-sec-dbt-cdo/IOette,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "i oette"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/AgencyIOTranche,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "REVIEW: Is this a kind of IO Tranche."}})

(def JumpZTriggerEvent
  "The event which triggers the Jump Z"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "If this trigger event is reached then the holders of the Jump Z tranche will begin to receive payments. Regular non-Sticky Jump Z tranches maintain their changed status only while the trigger event is in effect, and revert to their old payment status once the trigger event has passed. The event may be a market event or an event relating to the deal."},
   :db/ident :fibo-sec-dbt-cdo/JumpZTriggerEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "jump z trigger event"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/TriggerEvent,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The event which triggers the Jump Z"}})

(def JumpZTriggerEventReversal
  "The reversal of the event which triggers the Jump Z"
  {:db/ident :fibo-sec-dbt-cdo/JumpZTriggerEventReversal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "jump z trigger event reversal"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-dbt-cdo/specifiesReverseTrigger,
                      :owl/someValuesFrom :fibo-sec-dbt-cdo/JumpZTriggerEvent,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-cdo/TriggerEvent],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The reversal of the event which triggers the Jump Z"}})

(def LoanPool
  "debt pool whose consituents are loans"
  {:db/ident :fibo-sec-dbt-cdo/LoanPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "loan pool"},
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-loan-ln-ln/Loan,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/DebtPool],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "debt pool whose consituents are loans"}})

(def MBSInstrumentSlice
  "A holding of an individual slice or slices of a tranche."
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "These may be held in different notes, with different denominations. Tranche slice in this sense is only relevant in the context of something like a CDO or analogous things such as CBO."},
   :db/ident :fibo-sec-dbt-cdo/MBSInstrumentSlice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "m b s instrument slice"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom
                      {:owl/unionOf
                       [:fibo-sec-dbt-mbs/MBSTrancheNote
                        :fibo-sec-dbt-mbs/PassThroughMBSInstrumentNote],
                       :rdf/type :owl/Class},
                      :rdf/type :owl/Restriction}
                     :fibo-sec-sec-ast/PortfolioHolding],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "A holding of an individual slice or slices of a tranche."}})

(def ManagedCDO
  "A CDO where the reference assets are bought (the portfolio is ramped up) and then the CDO manager may alter the portfolio as they see fit."
  {:db/ident :fibo-sec-dbt-cdo/ManagedCDO,
   :owl/disjointWith :fibo-sec-dbt-cdo/StaticCDO,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "managed c d o"},
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-sec-dbt-cdo/ManagedCDOPortfolio,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-sec-dbt-cdo/MBSInstrumentSlice,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-sec-dbt-cdo/managementStyle.1,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-cdo/ManagedManagementStyle,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-cdo/CDODeal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A CDO where the reference assets are bought (the portfolio is ramped up) and then the CDO manager may alter the portfolio as they see fit."}})

(def ManagedCDOPortfolio
  "A portfolio where the reference assets of the CDO are bought (the portfolio is ramped up) and then the CDO manager may alter the portfolio as they see fit."
  {:db/ident :fibo-sec-dbt-cdo/ManagedCDOPortfolio,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "managed c d o portfolio"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/CDOPortfolio,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A portfolio where the reference assets of the CDO are bought (the portfolio is ramped up) and then the CDO manager may alter the portfolio as they see fit."}})

(def ManagedManagementStyle
  "managed management style"
  {:db/ident :fibo-sec-dbt-cdo/ManagedManagementStyle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "managed management style"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/CDOManagementStyle})

(def MarketValueCDO
  "market value c d o"
  {:db/ident :fibo-sec-dbt-cdo/MarketValueCDO,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "market value c d o"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-dbt-cdo/structure.2,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-cdo/MarketValueStructure,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-cdo/CDODeal]})

(def MarketValueStructure
  "market value structure"
  {:db/ident :fibo-sec-dbt-cdo/MarketValueStructure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "market value structure"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/CDOCashflowTreatmentStructure})

(def MezzanineCDOTranche
  "The tranche between senior and subordinated. Mezzanine tranches of a CDO issue are typically rated B to BBB."
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "If there are defaults or the CDO's collateral otherwise underperforms, scheduled payments to mezzanine tranches take precedence over those to subordinated/equity tranches."},
   :db/ident :fibo-sec-dbt-cdo/MezzanineCDOTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mezzanine c d o tranche"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-dbt-cdo/ratedAtIssue,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-mbs/TrancheRatingAtIssue,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-cdo/CollateralizedDebtObligation],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The tranche between senior and subordinated. Mezzanine tranches of a CDO issue are typically rated B to BBB."}})

(def PAC-1Class
  "Planned Amortization Class tranche. PAC-1 is the most senior Planned Amortization Class tranche."
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Principal payment must follow a certain schedule. These tranches have priority over the other tranches in the deal, which are then referred to as the support or companion tranches."},
   :db/ident :fibo-sec-dbt-cdo/PAC-1Class,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "p a c-1 class"},
   :rdfs/subClassOf [{:owl/allValuesFrom :fibo-sec-dbt-cdo/PAC-2Class,
                      :owl/onProperty    :fibo-sec-dbt-cdo/takesPrepaymentAfter,
                      :rdf/type          :owl/Restriction}
                     :fibo-sec-dbt-cdo/PlannedAmortizationClassBond],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Planned Amortization Class tranche. PAC-1 is the most senior Planned Amortization Class tranche."}})

(def PAC-2Class
  "Planned Amortization Class tranche. PAC-2 refers to a support tranche that is given a scheduled payment structure like a PAC bond."
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Principal payment must follow a certain schedule. These tranches have priority over the other tranches in the deal, which are then referred to as the support or companion tranches. For example, let's say you have a deal with a PAC tranche and a support tranche (i.e., a tranche that is a support tranche and is therefore subordinate to the PAC tranche) that has a scheduled payment structure like you did with the PAC bond. That support bond then is called the PAC-2 bond. If you continue, and create another support tranche that also has scheduled payments, that would become the PAC-3 bond."},
   :db/ident :fibo-sec-dbt-cdo/PAC-2Class,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "p a c-2 class"},
   :rdfs/subClassOf [{:owl/allValuesFrom :fibo-sec-dbt-cdo/PAC-3Class,
                      :owl/onProperty :fibo-sec-dbt-cdo/takesPrepaymentAfter.1,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-cdo/PlannedAmortizationClassBond],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Planned Amortization Class tranche. PAC-2 refers to a support tranche that is given a scheduled payment structure like a PAC bond."}})

(def PAC-3Class
  "Planned Amortization Class tranche. Additional support tranche with scheduled payments."
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Principal payment must follow a certain schedule. These tranches have priority over the other tranches in the deal, which are then referred to as the support or companion tranches. See PAC-2 for explanation. If you continue, and create another support tranche that also has scheduled payments, that would become the PAC-3 bond."},
   :db/ident :fibo-sec-dbt-cdo/PAC-3Class,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "p a c-3 class"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/PlannedAmortizationClassBond,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Planned Amortization Class tranche. Additional support tranche with scheduled payments."}})

(def PAC-ZTranche
  "Planned Amortization Class tranche which is also a Z tranche, that is Definition needed."
  {:db/ident :fibo-sec-dbt-cdo/PAC-ZTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "p a c- z tranche"},
   :rdfs/subClassOf [:fibo-sec-dbt-cdo/PlannedAmortizationClassBond
                     :fibo-sec-dbt-cdo/AgencyZTranche],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Planned Amortization Class tranche which is also a Z tranche, that is Definition needed."},
   :skos/editorialNote {:rdf/language "en",
                        :rdf/value
                        "Assume this is a PAC tranche that is a Z Tranche."}})

(def PACPOTranche
  "Planned Amortization Class principal only tranche."
  {:db/ident :fibo-sec-dbt-cdo/PACPOTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "p a c p o tranche"},
   :rdfs/subClassOf [:fibo-sec-dbt-cdo/PlannedAmortizationClassBond
                     :fibo-sec-dbt-cdo/AgencyPOTranche],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Planned Amortization Class principal only tranche."}})

(def PACTrancheAmortizationSchedule
  "p a c tranche amortization schedule"
  {:db/ident :fibo-sec-dbt-cdo/PACTrancheAmortizationSchedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "p a c tranche amortization schedule"},
   :rdfs/subClassOf :fibo-sec-dbt-bnd/RedemptionSchedule})

(def PlannedAmortizationClassBond
  "Planned Amortization Class tranche.This is a tranche where the principal payment must follow a certain schedule."
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "These tranches have priority over the other tranches in the deal, which are then referred to as the support or companion tranches. There are usually several PAC tranches created. PAC-1, PAC-2, PAC-3 -- this requires some more explanation. PAC-2 refers to a support tranche that is given a scheduled payment structure like a PAC bond. For example, let's say you have a deal with a PAC tranche and a support tranche (i.e., a tranche that is a support tranche and is therefore subordinate to the PAC tranche) that has a scheduled payment structure like you did with the PAC bond. That support bond then is called the PAC-2 bond. If you continue, and create another support tranche that also has scheduled payments, that would become the PAC-3 bond. Prospectus will cover each class. Prospectus is at the level of an issue."},
   :db/ident :fibo-sec-dbt-cdo/PlannedAmortizationClassBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "planned amortization class bond"},
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-sec-dbt-cdo/specifies,
     :owl/someValuesFrom :fibo-sec-dbt-cdo/PACTrancheAmortizationSchedule,
     :rdf/type           :owl/Restriction}
    {:owl/allValuesFrom :fibo-sec-dbt-cdo/PlannedAmortizationClassBond,
     :owl/onProperty    :fibo-sec-dbt-cdo/supportedBy,
     :rdf/type          :owl/Restriction}
    {:owl/allValuesFrom :fibo-sec-dbt-cdo/PlannedAmortizationClassBond,
     :owl/onProperty    :fibo-sec-dbt-cdo/providesPrepaymentSupportFor,
     :rdf/type          :owl/Restriction}
    :fibo-sec-dbt-cdo/AgencyCMO],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Planned Amortization Class tranche.This is a tranche where the principal payment must follow a certain schedule."}})

(def SeniorCDOTranche
  "The most senior tranche of the CDO issue. Typically rated A to AAA. If there are defaults or the CDO's collateral otherwise underperforms, scheduled payments to senior tranches take precedence over those of mezzanine tranches."
  {:db/ident :fibo-sec-dbt-cdo/SeniorCDOTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "senior c d o tranche"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-dbt-cdo/ratedAtIssue.1,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-mbs/TrancheRatingAtIssue,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-pbs/Tranche
                     :fibo-sec-dbt-cdo/CollateralizedDebtObligation],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The most senior tranche of the CDO issue. Typically rated A to AAA. If there are defaults or the CDO's collateral otherwise underperforms, scheduled payments to senior tranches take precedence over those of mezzanine tranches."}})

(def StaticCDO
  "A CDO where collateral is fixed through the life of the CDO. The reference assets are bought and then are kept untouched for the term of the product."
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Investors can assess the various tranches of the CDO with full knowledge of what the collateral will be. The primary risk they face is credit risk. A deal that starts off managed can become static if the performance is too poor. Also, some deals are static but allow managers to sell out poorly performing assets subject to certain conditions, but do not allow purchase of new assets, so are semi-static."},
   :db/ident :fibo-sec-dbt-cdo/StaticCDO,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "static c d o"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-dbt-cdo/managementStyle.1,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-cdo/StaticManagementStyle,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-cdo/CDODeal],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A CDO where collateral is fixed through the life of the CDO. The reference assets are bought and then are kept untouched for the term of the product."}})

(def StaticCDOPortfolio
  "A portfolio where collateral of the CDO is fixed through the life of the CDO. The reference assets are bought and then are kept untouched for the term of the product."
  {:db/ident :fibo-sec-dbt-cdo/StaticCDOPortfolio,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
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
  "static management style"
  {:db/ident :fibo-sec-dbt-cdo/StaticManagementStyle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "static management style"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/CDOManagementStyle})

(def SubordinatedCDOEquity
  "The subordinated (also known as equity) CDO tranche is the most junior tranche in the CDO issue. If there are defaults or the CDO's collateral otherwise underperforms, scheduled payments to senior and mezzanine tranches take precedence over those to subordinated/equity tranches."
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This is not a tranche of the debt in the CDO but an equity interest in the pool of underlying. There is a very bottom piece, not a tranche, but rather called the preferred shares (or just pref shares, or equity) that is the very bottom most layer in a CDO and is also referred to as the \"first loss piece\" since, like equity in a corporation, losses are incurred here before any of the actual bond holders take losses. This isn't a tranche"},
   :db/ident :fibo-sec-dbt-cdo/SubordinatedCDOEquity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subordinated c d o equity"},
   :rdfs/subClassOf :fibo-fbc-fi-fi/Security,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The subordinated (also known as equity) CDO tranche is the most junior tranche in the CDO issue. If there are defaults or the CDO's collateral otherwise underperforms, scheduled payments to senior and mezzanine tranches take precedence over those to subordinated/equity tranches."}})

(def SuperPOTranche
  "Principal Only tranche. This tranche will only pay principal. Not clear how this is distinct from generic PO."
  {:db/ident :fibo-sec-dbt-cdo/SuperPOTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "super p o tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/AgencyPOTranche,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Principal Only tranche. This tranche will only pay principal. Not clear how this is distinct from generic PO."}})

(def SuperSeniorCDOTranche
  "A tranche at the very top of a CDO Issue."
  {:db/ident :fibo-sec-dbt-cdo/SuperSeniorCDOTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "super senior c d o tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/CollateralizedDebtObligation,
   :skos/definition {:rdf/language "en",
                     :rdf/value "A tranche at the very top of a CDO Issue."}})

(def SupportTranche
  "A tranche which provides payment support to a PAC Tranche."
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "PAC tranches have priority over the other tranches in the deal, which are then referred to as the support or companion tranches."},
   :db/ident :fibo-sec-dbt-cdo/SupportTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "support tranche"},
   :rdfs/subClassOf {:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
                     :owl/someValuesFrom :fibo-sec-dbt-cdo/PAC-2Class,
                     :rdf/type           :owl/Restriction},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "A tranche which provides payment support to a PAC Tranche."}})

(def TACTranche
  "Targeted Amortization Class. This is related to a PAC tranche and has a payment schedule geared towards a specified prepayment speed (called the pricing speed). Agency CMO"
  {:db/ident :fibo-sec-dbt-cdo/TACTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "t a c tranche"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-dbt-cdo/specifies.1,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-cdo/TACTrancheAmortizationSchedule,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-mbs/TranchedMBSInstrument
                     :fibo-sec-dbt-cdo/AgencyCMO],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Targeted Amortization Class. This is related to a PAC tranche and has a payment schedule geared towards a specified prepayment speed (called the pricing speed). Agency CMO"},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "The main difference between TAC and PAC is that the PAC schedule remains under a certain prepayment range (such as 50-150 PSA) while the TAC tranche is geared from the outset at a specified prepayment speed (such as 150 PSA). Math note: Originally specified in PSAin the examples. What is PSA? Review how we have modeled \"Payment Speed\" as a concept."}})

(def TACTrancheAmortizationSchedule
  "t a c tranche amortization schedule"
  {:db/ident :fibo-sec-dbt-cdo/TACTrancheAmortizationSchedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "t a c tranche amortization schedule"},
   :rdfs/subClassOf :fibo-sec-dbt-bnd/RedemptionSchedule})

(def TriggerEvent
  "Any event where some value passes some threashold. Or some other type of business event. This is not restricted to \"trigger\" in the sense of a value passing a threshold. Can also be an seen such as a CDO manager going into bankruptcy."
  {:db/ident :fibo-sec-dbt-cdo/TriggerEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "trigger event"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Any event where some value passes some threashold. Or some other type of business event. This is not restricted to \"trigger\" in the sense of a value passing a threshold. Can also be an seen such as a CDO manager going into bankruptcy."}})

(def TruePSObjective
  "true p s objective"
  {:db/ident :fibo-sec-dbt-cdo/TruePSObjective,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "true p s objective"},
   :rdfs/subClassOf :fibo-sec-dbt-cdo/CDOOriginationObjective})

(def confersOwnershipOf
  "confers ownership of"
  {:db/ident :fibo-sec-dbt-cdo/confersOwnershipOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/SubordinatedCDOEquity,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "confers ownership of"}})

(def hasCDOOriginationObjective
  "has c d o origination objective"
  {:db/ident :fibo-sec-dbt-cdo/hasCDOOriginationObjective,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/CDODeal,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has c d o origination objective"},
   :rdfs/range :fibo-sec-dbt-cdo/CDOOriginationObjective})

(def isCash
  "Whether the CDO has an underlying pool of real assets. If yes, the CDO has an underlying pool of real assets. If no, the CDO has a synthetic pool of underlying assets."
  {:db/ident :fibo-sec-dbt-cdo/isCash,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/CollateralizedDebtObligation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is cash"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether the CDO has an underlying pool of real assets. If yes, the CDO has an underlying pool of real assets. If no, the CDO has a synthetic pool of underlying assets."}})

(def isCash.1
  "Whether the CDO has an underlying pool of real assets. This is yes: the CDO has an underlying pool of real assets,"
  {:db/ident :fibo-sec-dbt-cdo/isCash.1,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/CashCDOTranche,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is cash"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether the CDO has an underlying pool of real assets. This is yes: the CDO has an underlying pool of real assets,"}})

(def issues
  "issues"
  {:db/ident :fibo-sec-dbt-cdo/issues,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/CashCDO,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issues"},
   :rdfs/range :fibo-sec-dbt-cdo/CashCDOTranche})

(def managementStyle
  "Whether the CDO is static or managed. This refers to whether or not the CDO manager may make changes to the reference portfolio during the life of the security. Further notes: If it is static, collateral is fixed through the life of the CDO. The reference assets are bought and then are kept untouched for the term of the product.If it is managed, the reference assets are bought (the portfolio is ramped up) and then the CDO manager may alter the portfolio as they see fit."
  {:db/ident :fibo-sec-dbt-cdo/managementStyle,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/CollateralizedDebtObligation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has deal management style"},
   :rdfs/range :fibo-sec-dbt-cdo/CDOManagementStyle,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether the CDO is static or managed. This refers to whether or not the CDO manager may make changes to the reference portfolio during the life of the security. Further notes: If it is static, collateral is fixed through the life of the CDO. The reference assets are bought and then are kept untouched for the term of the product.If it is managed, the reference assets are bought (the portfolio is ramped up) and then the CDO manager may alter the portfolio as they see fit."}})

(def managementStyle.1
  "A CDO where the reference assets are bought (the portfolio is ramped up) and then the CDO manager may alter the portfolio as they see fit."
  {:db/ident :fibo-sec-dbt-cdo/managementStyle.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/CDODeal,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "management style"},
   :rdfs/range :fibo-sec-dbt-cdo/CDOManagementStyle,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A CDO where the reference assets are bought (the portfolio is ramped up) and then the CDO manager may alter the portfolio as they see fit."}})

(def origination.2
  "has origination objective"
  {:db/ident :fibo-sec-dbt-cdo/origination.2,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/CollateralizedDebtObligation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has origination objective"},
   :rdfs/range :fibo-sec-dbt-cdo/CDOOriginationObjective})

(def providesPrepaymentSupport
  "provides prepayment support"
  {:db/ident :fibo-sec-dbt-cdo/providesPrepaymentSupport,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/AgencyCMO,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "provides prepayment support"},
   :rdfs/range :fibo-sec-dbt-cdo/AgencyCMO})

(def providesPrepaymentSupportFor
  "provides prepayment support for"
  {:db/ident :fibo-sec-dbt-cdo/providesPrepaymentSupportFor,
   :owl/inverseOf :fibo-sec-dbt-cdo/supportedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/PlannedAmortizationClassBond,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "provides prepayment support for"},
   :rdfs/range :fibo-sec-dbt-cdo/PlannedAmortizationClassBond,
   :rdfs/subPropertyOf :fibo-sec-dbt-cdo/providesPrepaymentSupport})

(def ratedAtIssue
  "rated at issue"
  {:db/ident :fibo-sec-dbt-cdo/ratedAtIssue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/MezzanineCDOTranche,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "rated at issue"},
   :rdfs/range :fibo-sec-dbt-mbs/TrancheRatingAtIssue})

(def ratedAtIssue.1
  "rated at issue"
  {:db/ident :fibo-sec-dbt-cdo/ratedAtIssue.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/SeniorCDOTranche,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "rated at issue"},
   :rdfs/range :fibo-sec-dbt-mbs/TrancheRatingAtIssue})

(def revertsOn
  "reverts on"
  {:db/ident :fibo-sec-dbt-cdo/revertsOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/AgencyRegularJumpZ,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "reverts on"},
   :rdfs/range :fibo-sec-dbt-cdo/JumpZTriggerEventReversal})

(def seniority
  "The seniority which defines this tranche. This is the precedence order for scheduled payments. Further notes: Tranches are categorized as senior, mezzanine, and subordinated/equity, according to their degree of credit risk. If there are defaults or the CDO's collateral otherwise underperforms, scheduled payments to senior tranches take precedence over those of mezzanine tranches, and scheduled payments to mezzanine tranches take precedence over those to subordinated/equity tranches. Senior and mezzanine tranches are typically rated, with the former receiving ratings of A to AAA and the latter receiving ratings of B to BBB. The ratings reflect both the credit quality of underlying collateral as well as how much protection a given tranch is afforded by tranches that are subordinate to it."
  {:db/ident :fibo-sec-dbt-cdo/seniority,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/CollateralizedDebtObligation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "seniority"},
   :rdfs/range :fibo-sec-dbt-cdo/CDOTrancheSenioritySelection,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The seniority which defines this tranche. This is the precedence order for scheduled payments. Further notes: Tranches are categorized as senior, mezzanine, and subordinated/equity, according to their degree of credit risk. If there are defaults or the CDO's collateral otherwise underperforms, scheduled payments to senior tranches take precedence over those of mezzanine tranches, and scheduled payments to mezzanine tranches take precedence over those to subordinated/equity tranches. Senior and mezzanine tranches are typically rated, with the former receiving ratings of A to AAA and the latter receiving ratings of B to BBB. The ratings reflect both the credit quality of underlying collateral as well as how much protection a given tranch is afforded by tranches that are subordinate to it."}})

(def seniority.1
  "The seniority which defines this tranche. This is the precedence order for scheduled payments. This is Mezzanine, meaning the tranche between senior and subordinated."
  {:db/ident :fibo-sec-dbt-cdo/seniority.1,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/MezzanineCDOTranche,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "seniority"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The seniority which defines this tranche. This is the precedence order for scheduled payments. This is Mezzanine, meaning the tranche between senior and subordinated."}})

(def seniority.2
  "The seniority which defines this tranche. This is the precedence order for scheduled payments. This is defined as Senior, i.e. this is the most senior tranche of the CDO issue."
  {:db/ident :fibo-sec-dbt-cdo/seniority.2,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/SeniorCDOTranche,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "seniority"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The seniority which defines this tranche. This is the precedence order for scheduled payments. This is defined as Senior, i.e. this is the most senior tranche of the CDO issue."}})

(def seniority.3
  "The seniority which defines this tranche. This is the precedence order for scheduled payments. This is subordinated (also known as equity) and is the most junior tranche in the CDO issue."
  {:db/ident :fibo-sec-dbt-cdo/seniority.3,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/SubordinatedCDOEquity,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "seniority"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The seniority which defines this tranche. This is the precedence order for scheduled payments. This is subordinated (also known as equity) and is the most junior tranche in the CDO issue."}})

(def seniority.4
  "The seniority which defines this tranche. This is the precedence order for scheduled payments. This is defined as Senior, i.e. this is the most senior tranche of the CDO issue."
  {:db/ident :fibo-sec-dbt-cdo/seniority.4,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/SuperSeniorCDOTranche,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "seniority"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The seniority which defines this tranche. This is the precedence order for scheduled payments. This is defined as Senior, i.e. this is the most senior tranche of the CDO issue."}})

(def specifies
  "specifies"
  {:db/ident :fibo-sec-dbt-cdo/specifies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/PlannedAmortizationClassBond,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "specifies"},
   :rdfs/range :fibo-sec-dbt-cdo/PACTrancheAmortizationSchedule})

(def specifies.1
  "specifies"
  {:db/ident :fibo-sec-dbt-cdo/specifies.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/TACTranche,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "specifies"},
   :rdfs/range :fibo-sec-dbt-cdo/TACTrancheAmortizationSchedule})

(def specifiesReverseTrigger
  "specifies reverse trigger"
  {:db/ident :fibo-sec-dbt-cdo/specifiesReverseTrigger,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/JumpZTriggerEventReversal,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "specifies reverse trigger"},
   :rdfs/range :fibo-sec-dbt-cdo/JumpZTriggerEvent})

(def specifiesTrigger
  "specifies trigger"
  {:db/ident :fibo-sec-dbt-cdo/specifiesTrigger,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/AgencyJumpTranche,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "specifies trigger"},
   :rdfs/range :fibo-sec-dbt-cdo/JumpZTriggerEvent})

(def structure
  "The source of funds for the CDO. This is either cashflow or market value."
  {:db/ident :fibo-sec-dbt-cdo/structure,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/CollateralizedDebtObligation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has structure type"},
   :rdfs/range :fibo-sec-dbt-cdo/CDOCashflowTreatmentStructure,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The source of funds for the CDO. This is either cashflow or market value."}})

(def structure.2
  "The source of funds for the CDO is market value. This means that principal and interest payments to investors come from both collateral cash flows as well as sales of collateral."
  {:db/ident :fibo-sec-dbt-cdo/structure.2,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/CDODeal,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "structure"},
   :rdfs/range :fibo-sec-dbt-cdo/CDOCashflowTreatmentStructure,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The source of funds for the CDO is market value. This means that principal and interest payments to investors come from both collateral cash flows as well as sales of collateral."}})

(def supportedBy
  "supported by"
  {:db/ident :fibo-sec-dbt-cdo/supportedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/PlannedAmortizationClassBond,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "supported by"},
   :rdfs/range :fibo-sec-dbt-cdo/PlannedAmortizationClassBond})

(def takesPrepaymentAfter
  "takes prepayment after"
  {:db/ident :fibo-sec-dbt-cdo/takesPrepaymentAfter,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/PAC-1Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "takes prepayment after"},
   :rdfs/range :fibo-sec-dbt-cdo/PAC-2Class,
   :rdfs/subPropertyOf :fibo-sec-dbt-cdo/supportedBy})

(def takesPrepaymentAfter.1
  "takes prepayment after"
  {:db/ident :fibo-sec-dbt-cdo/takesPrepaymentAfter.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-cdo/PAC-2Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "takes prepayment after"},
   :rdfs/range :fibo-sec-dbt-cdo/PAC-3Class,
   :rdfs/subPropertyOf :fibo-sec-dbt-cdo/supportedBy})