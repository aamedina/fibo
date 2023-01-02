(ns net.wikipunk.rdf.fibo-sec-dbt-syn
  "Synthetic collateralized debt obligations are instruments designed to provide the same kind of structure and returns as a CDO, but these are not backed by an actual pool of debt assets."
  {:dcat/downloadURL
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
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/Pools/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/AccountingEquity/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/CreditDerivatives/CreditDefaultSwaps/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/SyntheticCDOs/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
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
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfa/prefix "fibo-sec-dbt-syn",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SyntheticCDOs"},
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright "Copyright (c) 2015-2022 EDM Council, Inc.",
   :sm/dependsOn
   ["https://spec.edmcouncil.org/fibo/ontology/FBC/"
    "https://spec.edmcouncil.org/fibo/ontology/BE/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"],
   :sm/fileAbbreviation "fibo-sec-dbt-syn",
   :sm/filename "SyntheticCDOs.rdf"})

(def ArbitrageSyntheticCDO
  "Arbitrage synthetic CDO deals are motivated by regulatory or practical considerations that might make a bank want to retain ownership of debt while achieving capital relief through CDSs. In this case, the sponsoring bank has a portfolio of obligations, called the reference portfolio. It retains that portfolio, but offloads its credit risk by transacting CDSs with the CDO."
  {:db/ident :fibo-sec-dbt-syn/ArbitrageSyntheticCDO,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "For arbitrage synthetic deals, two advantages are - an abbreviated ramp-up period (for managed deals), and - the possibility that selling protection through CDSs can be less expensive than directly buying the underlying bonds. This is often true at the lower end of the credit spectrum."},
   :owl/disjointWith :fibo-sec-dbt-syn/SyntheticBalanceSheetCDO,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "arbitrage synthetic c d o"},
   :rdfs/subClassOf [:fibo-sec-dbt-syn/SyntheticCDO
                     :fibo-sec-dbt-cdo/ArbitrageCDO
                     {:owl/onProperty     :fibo-sec-dbt-syn/issues,
                      :owl/someValuesFrom :fibo-sec-dbt-syn/SyntheticCDOTranche,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-dbt-syn/assetsManagedBy,
                      :owl/someValuesFrom :fibo-sec-dbt-cdo/CDOPortfolioManager,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Arbitrage synthetic CDO deals are motivated by regulatory or practical considerations that might make a bank want to retain ownership of debt while achieving capital relief through CDSs. In this case, the sponsoring bank has a portfolio of obligations, called the reference portfolio. It retains that portfolio, but offloads its credit risk by transacting CDSs with the CDO."}})

(def SyntheticAmortizingSecurity
  "Security constructed to emulate an amortizing security."
  {:db/ident :fibo-sec-dbt-syn/SyntheticAmortizingSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "synthetic amortizing security"},
   :rdfs/subClassOf :fibo-sec-dbt-syn/SyntheticStructuredFinanceInstrument,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Security constructed to emulate an amortizing security."},
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Synthetic instruments can be created to mimic a wide range of debt instruments. These are not all shown here. This one is shown as an example"}})

(def SyntheticBalanceSheetCDO
  {:db/ident :fibo-sec-dbt-syn/SyntheticBalanceSheetCDO,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "synthetic balance sheet c d o"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-dbt-syn/issues,
                      :owl/someValuesFrom :fibo-sec-dbt-syn/SyntheticCDOTranche,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-syn/SyntheticCDO
                     :fibo-sec-dbt-cdo/BalanceSheetCDO]})

(def SyntheticCDO
  {:db/ident :fibo-sec-dbt-syn/SyntheticCDO,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "synthetic c d o"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-dbt-syn/issues,
                      :owl/someValuesFrom :fibo-sec-dbt-syn/SyntheticCDOTranche,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-cdo/CDODeal]})

(def SyntheticCDOPortfolio
  {:db/ident :fibo-sec-dbt-syn/SyntheticCDOPortfolio,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "synthetic c d o portfolio"},
   :rdfs/subClassOf {:owl/onProperty :fibo-sec-dbt-syn/notionallyHolds,
                     :owl/someValuesFrom
                     :fibo-sec-dbt-syn/SyntheticCDOPortfolioConstituent,
                     :rdf/type :owl/Restriction},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Review notes: What real stuff is this made of? Would be the actual contracts (the Ref Obligation contracts or the CDS contract)? Buyer of protection is buying protection and paying a fee. Similar to shorting on a stock. Seller of the protection is the one creating the instruments. So the Protection Seller is using the synthetic CDO as some kind of synthetic vehicle. Inside the portfolio is the actual contract that generates the cash."}})

(def SyntheticCDOPortfolioConstituent
  "An instrument which is defined as a constituent of a synthetic pool of instruments. These are not holdings because they are not held, but in all other respects they are the constituents of the portfolio."
  {:db/ident :fibo-sec-dbt-syn/SyntheticCDOPortfolioConstituent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "synthetic c d o portfolio constituent"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An instrument which is defined as a constituent of a synthetic pool of instruments. These are not holdings because they are not held, but in all other respects they are the constituents of the portfolio."}})

(def SyntheticCDOTranche
  {:db/ident :fibo-sec-dbt-syn/SyntheticCDOTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "synthetic c d o tranche"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-dbt-syn/isTrancheOf,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-syn/SyntheticDebtInstrumentPool,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-cdo/CollateralizedDebtObligation]})

(def SyntheticDebtInstrumentPool
  "A cash flow structure which synthesizes the behavior of a portfolio of debt securities. For example a synthesized portfolio of CDO / Bonds / ABS using Total Returns Swaps and CDS. This does exist, it is just manufactured from different instruments."
  {:db/ident :fibo-sec-dbt-syn/SyntheticDebtInstrumentPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "synthetic debt instrument pool"},
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
                     :fibo-sec-sec-pls/DebtPool],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A cash flow structure which synthesizes the behavior of a portfolio of debt securities. For example a synthesized portfolio of CDO / Bonds / ABS using Total Returns Swaps and CDS. This does exist, it is just manufactured from different instruments."}})

(def SyntheticDebtInstrumentPoolFundingAsset
  "From April 28 review session: CDS mechanization: Q: Are the CDS taken out on the constituents of the (non owned) pool or on some other instrument? A: There is funding to underpin the pool. The funding may be high grade debt or may be low grade. There is an undedrlying source of funds. then you swap (using CDS) into other risks. so I might lend to a government institution, and then sell protection against a whole series of corporates. So I've taken the high quality portfolio and added other risks to it. Or the other way round. conclusions:"
  {:db/ident :fibo-sec-dbt-syn/SyntheticDebtInstrumentPoolFundingAsset,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "synthetic debt instrument pool funding asset"},
   :rdfs/subClassOf {:owl/onProperty :fibo-sec-dbt-syn/hasInvestmentGrade,
                     :owl/someValuesFrom
                     :fibo-fbc-dae-crt/InstrumentCreditRating,
                     :rdf/type :owl/Restriction},
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "From April 28 review session: CDS mechanization: Q: Are the CDS taken out on the constituents of the (non owned) pool or on some other instrument? A: There is funding to underpin the pool. The funding may be high grade debt or may be low grade. There is an undedrlying source of funds. then you swap (using CDS) into other risks. so I might lend to a government institution, and then sell protection against a whole series of corporates. So I've taken the high quality portfolio and added other risks to it. Or the other way round. conclusions:"}
    {:rdf/language "en",
     :rdf/value
     "An asset which provides the funding for a synthetic debt instrument pool, as used in a synthetic CDO."}]})

(def SyntheticDebtSPV
  "A Special Purpose Vehicle set up for the issuance of synthetics CDOs. This entity (like all SPVs) its itself registered as some kind of legal entity, distinct from the sponsoring organization. It becomes the Issuer of Synthetic CDO issues."
  {:db/ident :fibo-sec-dbt-syn/SyntheticDebtSPV,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "synthetic debt s p v"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-dbt-syn/holds,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-syn/SyntheticDebtInstrumentPoolFundingAsset,
                      :rdf/type :owl/Restriction}
                     :fibo-be-le-lp/SpecialPurposeVehicle],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A Special Purpose Vehicle set up for the issuance of synthetics CDOs. This entity (like all SPVs) its itself registered as some kind of legal entity, distinct from the sponsoring organization. It becomes the Issuer of Synthetic CDO issues."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "REVIEW: Whether this is (or is ever) a separate SPV for Synthetics, as it is for Cash CDO and other Cash structured finance. If not, how to define the facts at the level of SPV without contradictions. Moving stuff off the balance sheet is involved in putting it into the SPV. So talking a bout balance sheet or off balanc sheet, this is about creating the pool which is going to be sold off. This applies whether hte pool is cash (real holdings) or synthetics. Either way ,the instruments are transferred into the CPV to sell them off. conclusion: applies to cash and non cash. In the old days there were all sorts of guarantees added to that SPOV. Now if you provide support to that =SPV it is no longer \"Off balance sheet\" froma regulatory point of view. Accounting rules refer."}})

(def SyntheticPoolAsset
  {:db/ident :fibo-sec-dbt-syn/SyntheticPoolAsset,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "synthetic pool asset"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-dbt-syn/simulatedBy,
                      :owl/someValuesFrom :fibo-der-cr-cds/CreditDefaultSwap,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-aeq/FinancialAsset]})

(def SyntheticStructuredFinanceInstrument
  {:db/ident :fibo-sec-dbt-syn/SyntheticStructuredFinanceInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "synthetic structured finance instrument"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-sec-dbt-syn/SyntheticPoolAsset,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-pbs/StructuredFinanceInstrument]})

(def assetsManagedBy
  {:db/ident :fibo-sec-dbt-syn/assetsManagedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/ArbitrageSyntheticCDO,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "assets managed by"},
   :rdfs/range :fibo-sec-dbt-cdo/CDOPortfolioManager})

(def fundedBy
  {:db/ident :fibo-sec-dbt-syn/fundedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticDebtInstrumentPool,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "funded by"},
   :rdfs/range :fibo-sec-dbt-syn/SyntheticDebtInstrumentPoolFundingAsset})

(def hasInvestmentGrade
  {:db/ident :fibo-sec-dbt-syn/hasInvestmentGrade,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticDebtInstrumentPoolFundingAsset,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has investment grade"},
   :rdfs/range :fibo-fbc-dae-crt/InstrumentCreditRating})

(def hasUnderlyingContract
  "The underlying CDS which is created to mechanise the cash flows in the synthetic portfolio."
  {:db/ident :fibo-sec-dbt-syn/hasUnderlyingContract,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticDebtInstrumentPool,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has underlying contract"},
   :rdfs/range :fibo-der-cr-cds/CreditDefaultSwap,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The underlying CDS which is created to mechanise the cash flows in the synthetic portfolio."}})

(def holds
  {:db/ident :fibo-sec-dbt-syn/holds,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticDebtSPV,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "holds"},
   :rdfs/range :fibo-sec-dbt-syn/SyntheticDebtInstrumentPoolFundingAsset})

(def isCash
  "Whether the CDO has an underlying pool of real assets. This is No: the CDO has a synthetic pool of underlying assets."
  {:db/ident :fibo-sec-dbt-syn/isCash,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticCDOTranche,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is cash"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether the CDO has an underlying pool of real assets. This is No: the CDO has a synthetic pool of underlying assets."}})

(def isTrancheOf
  {:db/ident :fibo-sec-dbt-syn/isTrancheOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticCDOTranche,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is tranche of"},
   :rdfs/range :fibo-sec-dbt-syn/SyntheticDebtInstrumentPool})

(def issues
  {:db/ident :fibo-sec-dbt-syn/issues,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticCDO,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issues"},
   :rdfs/range :fibo-sec-dbt-syn/SyntheticCDOTranche})

(def makesReferenceTo
  {:db/ident :fibo-sec-dbt-syn/makesReferenceTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticDebtInstrumentPool,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "makes reference to"},
   :rdfs/range :fibo-sec-dbt-syn/SyntheticCDOPortfolio})

(def notionallyHolds
  {:db/ident :fibo-sec-dbt-syn/notionallyHolds,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticCDOPortfolio,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "notionally holds"},
   :rdfs/range :fibo-sec-dbt-syn/SyntheticCDOPortfolioConstituent})

(def percentageOfDefaultsThisTranche
  "The percentage of defaults which holders of this are exposed to, that is the percentage of defaults that this tranche represents. Further Notes Review session notes 21 April: The first, second and so on, to stop paying out when there is a default. In each case you get the first, second etc. x% of defaults. Base underlying may be high or low quality. Create the pool by buying or selling protection depending on hich way you want to go, e..g. have high quality funds, (borrowers), would sell protection. If low quality, would buy protection to improve quality. So risk is no longer bound to the funding. REVIEW: More likely this is a band of percentages (from and to); review and formalize. See also note on attachment and detachment points."
  {:db/ident :fibo-sec-dbt-syn/percentageOfDefaultsThisTranche,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticCDOTranche,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "percentage of defaults this tranche"},
   :rdfs/range :fibo-fnd-utl-alx/Percentage,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The percentage of defaults which holders of this are exposed to, that is the percentage of defaults that this tranche represents. Further Notes Review session notes 21 April: The first, second and so on, to stop paying out when there is a default. In each case you get the first, second etc. x% of defaults. Base underlying may be high or low quality. Create the pool by buying or selling protection depending on hich way you want to go, e..g. have high quality funds, (borrowers), would sell protection. If low quality, would buy protection to improve quality. So risk is no longer bound to the funding. REVIEW: More likely this is a band of percentages (from and to); review and formalize. See also note on attachment and detachment points."}})

(def simulatedBy
  "The underlying CDS which is created to mechanise the cash flows in the synthetic portfolio."
  {:db/ident :fibo-sec-dbt-syn/simulatedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticPoolAsset,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "simulated by"},
   :rdfs/range :fibo-der-cr-cds/CreditDefaultSwap,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The underlying CDS which is created to mechanise the cash flows in the synthetic portfolio."}})

(def simulates
  {:db/ident :fibo-sec-dbt-syn/simulates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticPoolAsset,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "simulates"}})

(def simulates.1
  {:db/ident :fibo-sec-dbt-syn/simulates.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticDebtInstrumentPool,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "simulates"}})

(def trancheType
  {:db/ident :fibo-sec-dbt-syn/trancheType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-syn/SyntheticCDOTranche,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tranche type"},
   :rdfs/range :fibo-sec-dbt-cdo/CDOTrancheSenioritySelection})