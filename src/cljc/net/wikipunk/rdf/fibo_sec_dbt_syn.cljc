(ns net.wikipunk.rdf.fibo-sec-dbt-syn
  "Synthetic collateralized debt obligations are instruments designed to provide the same kind of structure and returns as a CDO, but these are not backed by an actual pool of debt assets."
  {:cmns-av/copyright "Copyright (c) 2015-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :dcterms/abstract
   "Synthetic collateralized debt obligations are instruments designed to provide the same kind of structure and returns as a CDO, but these are not backed by an actual pool of debt assets.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/PoolBackedSecurities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Funds/Funds/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/CollateralizedDebtObligations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/CreditRatings/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/Pools/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/AccountingEquity/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/CreditDerivatives/CreditDefaultSwaps/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/SyntheticCDOs/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-der-cr-cds"
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
    "fibo-fbc-dae-crt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
    "fibo-fnd-acc-aeq"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-alx"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-dbt-cdo"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
    "fibo-sec-dbt-pbs"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/",
    "fibo-sec-dbt-syn"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
    "fibo-sec-sec-pls"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-dbt-syn",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "SyntheticCDOs@en"})

(def ArbitrageSyntheticCDO
  "Arbitrage synthetic CDO deals are motivated by regulatory or practical considerations that might make a bank want to retain ownership of debt while achieving capital relief through CDSs. In this case, the sponsoring bank has a portfolio of obligations, called the reference portfolio. It retains that portfolio, but offloads its credit risk by transacting CDSs with the CDO."
  {:cmns-av/explanatoryNote
   #voc/lstr
    "For arbitrage synthetic deals, two advantages are - an abbreviated ramp-up period (for managed deals), and - the possibility that selling protection through CDSs can be less expensive than directly buying the underlying bonds. This is often true at the lower end of the credit spectrum.@en",
   :db/ident :fibo-sec-dbt-syn/ArbitrageSyntheticCDO,
   :owl/disjointWith :fibo-sec-dbt-syn/SyntheticBalanceSheetCDO,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "arbitrage synthetic c d o@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-dbt-syn/assetsManagedBy,
                      :owl/someValuesFrom :fibo-sec-dbt-cdo/CDOPortfolioManager,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-dbt-syn/issues,
                      :owl/someValuesFrom :fibo-sec-dbt-syn/SyntheticCDOTranche,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-syn/SyntheticCDO
                     :fibo-sec-dbt-cdo/ArbitrageCDO
                     :fibo-sec-dbt-syn/ArbitrageSyntheticCDO
                     :fibo-sec-dbt-cdo/CDODeal
                     {:owl/onProperty     :fibo-sec-dbt-syn/issues,
                      :owl/someValuesFrom :fibo-sec-dbt-syn/SyntheticCDOTranche,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "Arbitrage synthetic CDO deals are motivated by regulatory or practical considerations that might make a bank want to retain ownership of debt while achieving capital relief through CDSs. In this case, the sponsoring bank has a portfolio of obligations, called the reference portfolio. It retains that portfolio, but offloads its credit risk by transacting CDSs with the CDO.@en"})

(def SyntheticAmortizingSecurity
  "Security constructed to emulate an amortizing security."
  {:db/ident :fibo-sec-dbt-syn/SyntheticAmortizingSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "synthetic amortizing security@en",
   :rdfs/subClassOf [:fibo-sec-dbt-syn/SyntheticStructuredFinanceInstrument
                     :fibo-sec-dbt-syn/SyntheticAmortizingSecurity
                     :fibo-sec-dbt-pbs/StructuredFinanceInstrument
                     {:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-sec-dbt-syn/SyntheticPoolAsset,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr "Security constructed to emulate an amortizing security.@en",
   :skos/scopeNote
   #voc/lstr
    "Synthetic instruments can be created to mimic a wide range of debt instruments. These are not all shown here. This one is shown as an example@en"})

(def SyntheticBalanceSheetCDO
  "synthetic balance sheet c d o"
  {:db/ident :fibo-sec-dbt-syn/SyntheticBalanceSheetCDO,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "synthetic balance sheet c d o@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-dbt-syn/issues,
                      :owl/someValuesFrom :fibo-sec-dbt-syn/SyntheticCDOTranche,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-syn/SyntheticCDO
                     :fibo-sec-dbt-cdo/BalanceSheetCDO
                     :fibo-sec-dbt-syn/SyntheticBalanceSheetCDO
                     :fibo-sec-dbt-cdo/CDODeal
                     {:owl/onProperty     :fibo-sec-dbt-syn/issues,
                      :owl/someValuesFrom :fibo-sec-dbt-syn/SyntheticCDOTranche,
                      :rdf/type           :owl/Restriction}]})

(def SyntheticCDO
  "synthetic c d o"
  {:db/ident :fibo-sec-dbt-syn/SyntheticCDO,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "synthetic c d o@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-dbt-syn/issues,
                      :owl/someValuesFrom :fibo-sec-dbt-syn/SyntheticCDOTranche,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-cdo/CDODeal
                     :fibo-sec-dbt-syn/SyntheticCDO]})

(def SyntheticCDOPortfolio
  "synthetic c d o portfolio"
  {:db/ident :fibo-sec-dbt-syn/SyntheticCDOPortfolio,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "synthetic c d o portfolio@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-dbt-syn/notionallyHolds,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-syn/SyntheticCDOPortfolioConstituent,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-syn/SyntheticCDOPortfolio],
   :skos/editorialNote
   #voc/lstr
    "Review notes: What real stuff is this made of? Would be the actual contracts (the Ref Obligation contracts or the CDS contract)? Buyer of protection is buying protection and paying a fee. Similar to shorting on a stock. Seller of the protection is the one creating the instruments. So the Protection Seller is using the synthetic CDO as some kind of synthetic vehicle. Inside the portfolio is the actual contract that generates the cash.@en"})

(def SyntheticCDOPortfolioConstituent
  "An instrument which is defined as a constituent of a synthetic pool of instruments. These are not holdings because they are not held, but in all other respects they are the constituents of the portfolio."
  {:db/ident :fibo-sec-dbt-syn/SyntheticCDOPortfolioConstituent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "synthetic c d o portfolio constituent@en",
   :skos/definition
   #voc/lstr
    "An instrument which is defined as a constituent of a synthetic pool of instruments. These are not holdings because they are not held, but in all other respects they are the constituents of the portfolio.@en"})

(def SyntheticCDOTranche
  "synthetic c d o tranche"
  {:db/ident :fibo-sec-dbt-syn/SyntheticCDOTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "synthetic c d o tranche@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-dbt-syn/isTrancheOf,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-syn/SyntheticDebtInstrumentPool,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-cdo/CollateralizedDebtObligation
                     :fibo-sec-dbt-syn/SyntheticCDOTranche]})

(def SyntheticDebtInstrumentPool
  "A cash flow structure which synthesizes the behavior of a portfolio of debt securities. For example a synthesized portfolio of CDO / Bonds / ABS using Total Returns Swaps and CDS. This does exist, it is just manufactured from different instruments."
  {:db/ident :fibo-sec-dbt-syn/SyntheticDebtInstrumentPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "synthetic debt instrument pool@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-dbt-syn/makesReferenceTo,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-syn/SyntheticCDOPortfolio,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-sec-dbt-syn/hasUnderlyingContract,
                      :owl/someValuesFrom :fibo-der-cr-cds/CreditDefaultSwap,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-sec-dbt-syn/fundedBy,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-syn/SyntheticDebtInstrumentPoolFundingAsset,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-sec-pls/DebtPool
                     :fibo-sec-dbt-syn/SyntheticDebtInstrumentPool],
   :skos/definition
   #voc/lstr
    "A cash flow structure which synthesizes the behavior of a portfolio of debt securities. For example a synthesized portfolio of CDO / Bonds / ABS using Total Returns Swaps and CDS. This does exist, it is just manufactured from different instruments.@en"})

(def SyntheticDebtInstrumentPoolFundingAsset
  "From April 28 review session: CDS mechanization: Q: Are the CDS taken out on the constituents of the (non owned) pool or on some other instrument? A: There is funding to underpin the pool. The funding may be high grade debt or may be low grade. There is an undedrlying source of funds. then you swap (using CDS) into other risks. so I might lend to a government institution, and then sell protection against a whole series of corporates. So I've taken the high quality portfolio and added other risks to it. Or the other way round. conclusions:"
  {:db/ident :fibo-sec-dbt-syn/SyntheticDebtInstrumentPoolFundingAsset,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "synthetic debt instrument pool funding asset@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-dbt-syn/hasInvestmentGrade,
                      :owl/someValuesFrom
                      :fibo-fbc-dae-crt/InstrumentCreditRating,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-syn/SyntheticDebtInstrumentPoolFundingAsset],
   :skos/definition
   [#voc/lstr
     "From April 28 review session: CDS mechanization: Q: Are the CDS taken out on the constituents of the (non owned) pool or on some other instrument? A: There is funding to underpin the pool. The funding may be high grade debt or may be low grade. There is an undedrlying source of funds. then you swap (using CDS) into other risks. so I might lend to a government institution, and then sell protection against a whole series of corporates. So I've taken the high quality portfolio and added other risks to it. Or the other way round. conclusions:@en"
    #voc/lstr
     "An asset which provides the funding for a synthetic debt instrument pool, as used in a synthetic CDO.@en"]})

(def SyntheticDebtSPV
  "A Special Purpose Vehicle set up for the issuance of synthetics CDOs. This entity (like all SPVs) its itself registered as some kind of legal entity, distinct from the sponsoring organization. It becomes the Issuer of Synthetic CDO issues."
  {:db/ident :fibo-sec-dbt-syn/SyntheticDebtSPV,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "synthetic debt s p v@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-dbt-syn/holds,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-syn/SyntheticDebtInstrumentPoolFundingAsset,
                      :rdf/type :owl/Restriction}
                     :fibo-be-le-lp/SpecialPurposeVehicle
                     :fibo-sec-dbt-syn/SyntheticDebtSPV],
   :skos/definition
   #voc/lstr
    "A Special Purpose Vehicle set up for the issuance of synthetics CDOs. This entity (like all SPVs) its itself registered as some kind of legal entity, distinct from the sponsoring organization. It becomes the Issuer of Synthetic CDO issues.@en",
   :skos/editorialNote
   #voc/lstr
    "REVIEW: Whether this is (or is ever) a separate SPV for Synthetics, as it is for Cash CDO and other Cash structured finance. If not, how to define the facts at the level of SPV without contradictions. Moving stuff off the balance sheet is involved in putting it into the SPV. So talking a bout balance sheet or off balanc sheet, this is about creating the pool which is going to be sold off. This applies whether hte pool is cash (real holdings) or synthetics. Either way ,the instruments are transferred into the CPV to sell them off. conclusion: applies to cash and non cash. In the old days there were all sorts of guarantees added to that SPOV. Now if you provide support to that =SPV it is no longer \"Off balance sheet\" froma regulatory point of view. Accounting rules refer.@en"})

(def SyntheticPoolAsset
  "synthetic pool asset"
  {:db/ident :fibo-sec-dbt-syn/SyntheticPoolAsset,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "synthetic pool asset@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-dbt-syn/simulatedBy,
                      :owl/someValuesFrom :fibo-der-cr-cds/CreditDefaultSwap,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-aeq/FinancialAsset
                     :fibo-sec-dbt-syn/SyntheticPoolAsset]})

(def SyntheticStructuredFinanceInstrument
  "synthetic structured finance instrument"
  {:db/ident :fibo-sec-dbt-syn/SyntheticStructuredFinanceInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "synthetic structured finance instrument@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-sec-dbt-syn/SyntheticPoolAsset,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-pbs/StructuredFinanceInstrument
                     :fibo-sec-dbt-syn/SyntheticStructuredFinanceInstrument]})

(def assetsManagedBy
  "assets managed by"
  {:db/ident :fibo-sec-dbt-syn/assetsManagedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/ArbitrageSyntheticCDO,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "assets managed by@en",
   :rdfs/range :fibo-sec-dbt-cdo/CDOPortfolioManager})

(def fundedBy
  "funded by"
  {:db/ident :fibo-sec-dbt-syn/fundedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticDebtInstrumentPool,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "funded by@en",
   :rdfs/range :fibo-sec-dbt-syn/SyntheticDebtInstrumentPoolFundingAsset})

(def hasInvestmentGrade
  "has investment grade"
  {:db/ident :fibo-sec-dbt-syn/hasInvestmentGrade,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticDebtInstrumentPoolFundingAsset,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "has investment grade@en",
   :rdfs/range :fibo-fbc-dae-crt/InstrumentCreditRating})

(def hasUnderlyingContract
  "The underlying CDS which is created to mechanise the cash flows in the synthetic portfolio."
  {:db/ident :fibo-sec-dbt-syn/hasUnderlyingContract,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticDebtInstrumentPool,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "has underlying contract@en",
   :rdfs/range :fibo-der-cr-cds/CreditDefaultSwap,
   :skos/definition
   #voc/lstr
    "The underlying CDS which is created to mechanise the cash flows in the synthetic portfolio.@en"})

(def holds
  "holds"
  {:db/ident :fibo-sec-dbt-syn/holds,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticDebtSPV,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "holds@en",
   :rdfs/range :fibo-sec-dbt-syn/SyntheticDebtInstrumentPoolFundingAsset})

(def isCash
  "Whether the CDO has an underlying pool of real assets. This is No: the CDO has a synthetic pool of underlying assets."
  {:db/ident :fibo-sec-dbt-syn/isCash,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticCDOTranche,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "is cash@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #voc/lstr
    "Whether the CDO has an underlying pool of real assets. This is No: the CDO has a synthetic pool of underlying assets.@en"})

(def isTrancheOf
  "is tranche of"
  {:db/ident :fibo-sec-dbt-syn/isTrancheOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticCDOTranche,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "is tranche of@en",
   :rdfs/range :fibo-sec-dbt-syn/SyntheticDebtInstrumentPool})

(def issues
  "issues"
  {:db/ident :fibo-sec-dbt-syn/issues,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticCDO,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "issues@en",
   :rdfs/range :fibo-sec-dbt-syn/SyntheticCDOTranche})

(def makesReferenceTo
  "makes reference to"
  {:db/ident :fibo-sec-dbt-syn/makesReferenceTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticDebtInstrumentPool,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "makes reference to@en",
   :rdfs/range :fibo-sec-dbt-syn/SyntheticCDOPortfolio})

(def notionallyHolds
  "notionally holds"
  {:db/ident :fibo-sec-dbt-syn/notionallyHolds,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticCDOPortfolio,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "notionally holds@en",
   :rdfs/range :fibo-sec-dbt-syn/SyntheticCDOPortfolioConstituent})

(def percentageOfDefaultsThisTranche
  "The percentage of defaults which holders of this are exposed to, that is the percentage of defaults that this tranche represents. Further Notes Review session notes 21 April: The first, second and so on, to stop paying out when there is a default. In each case you get the first, second etc. x% of defaults. Base underlying may be high or low quality. Create the pool by buying or selling protection depending on hich way you want to go, e..g. have high quality funds, (borrowers), would sell protection. If low quality, would buy protection to improve quality. So risk is no longer bound to the funding. REVIEW: More likely this is a band of percentages (from and to); review and formalize. See also note on attachment and detachment points."
  {:db/ident :fibo-sec-dbt-syn/percentageOfDefaultsThisTranche,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticCDOTranche,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "percentage of defaults this tranche@en",
   :rdfs/range :fibo-fnd-utl-alx/Percentage,
   :skos/definition
   #voc/lstr
    "The percentage of defaults which holders of this are exposed to, that is the percentage of defaults that this tranche represents. Further Notes Review session notes 21 April: The first, second and so on, to stop paying out when there is a default. In each case you get the first, second etc. x% of defaults. Base underlying may be high or low quality. Create the pool by buying or selling protection depending on hich way you want to go, e..g. have high quality funds, (borrowers), would sell protection. If low quality, would buy protection to improve quality. So risk is no longer bound to the funding. REVIEW: More likely this is a band of percentages (from and to); review and formalize. See also note on attachment and detachment points.@en"})

(def simulatedBy
  "The underlying CDS which is created to mechanise the cash flows in the synthetic portfolio."
  {:db/ident :fibo-sec-dbt-syn/simulatedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticPoolAsset,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "simulated by@en",
   :rdfs/range :fibo-der-cr-cds/CreditDefaultSwap,
   :skos/definition
   #voc/lstr
    "The underlying CDS which is created to mechanise the cash flows in the synthetic portfolio.@en"})

(def simulates
  "simulates"
  {:db/ident :fibo-sec-dbt-syn/simulates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticPoolAsset,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "simulates@en"})

(def simulates_1
  "simulates"
  {:db/ident :fibo-sec-dbt-syn/simulates.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticDebtInstrumentPool,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "simulates@en"})

(def trancheType
  "tranche type"
  {:db/ident :fibo-sec-dbt-syn/trancheType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticCDOTranche,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label #voc/lstr "tranche type@en",
   :rdfs/range :fibo-sec-dbt-cdo/CDOTrancheSenioritySelection})