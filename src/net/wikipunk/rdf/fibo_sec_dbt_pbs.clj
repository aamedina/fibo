(ns net.wikipunk.rdf.fibo-sec-dbt-pbs
  "This ontology defines concepts that are common to asset-backed and mortgage-backed securities, including pools, as well as structured finance instruments."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/",
   :dcterms/abstract
   "This ontology defines concepts that are common to asset-backed and mortgage-backed securities, including pools, as well as structured finance instruments.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Arrangements/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/Pools/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/DebtInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/PoolBackedSecurities/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fnd-arr-arr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-dbt-dbti"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/",
    "fibo-sec-dbt-pbs"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/",
    "fibo-sec-sec-pls"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/",
   :rdfa/prefix "fibo-sec-dbt-pbs",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Pool-backed Securities Ontology"},
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2015-2022 Object Management Group, Inc."
                  "Copyright (c) 2015-2022 EDM Council, Inc."],
   :sm/dependsOn
   ["https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/"
    "https://spec.edmcouncil.org/fibo/ontology/BE/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"],
   :sm/fileAbbreviation "fibo-sec-dbt-pbs",
   :sm/filename "PoolBackedSecurities.rdf"})

(def AssetBackedSecurity
  "debt instrument backed by receivables other than those arising out of real estate loans or mortgages"
  {:db/ident :fibo-sec-dbt-pbs/AssetBackedSecurity,
   :fibo-fnd-utl-av/abbreviation {:rdf/language "en",
                                  :rdf/value    "ABS"},
   :fibo-fnd-utl-av/adaptedFrom
   "ISO 10962, Securities and related financial instruments - Classification of Financial Instruments (CFI code), Fourth edition, 2019-10-01.",
   :fibo-fnd-utl-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "One difference between an ABs and a collateralized debt obligation (CDO) is that the CDO issuer is generally a special purpose vehicle (SPV) or trust."}
    {:rdf/language "en",
     :rdf/value
     "Asset-backed securities, for example home equity loans (HEL), credit cards, and so forth are backed by receivables [payments] that are either secured (such as HEL) or unsecured (for example, credit cards). They are typically tranched based on default risk."}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "asset-backed security"},
   :rdfs/subClassOf :fibo-sec-dbt-pbs/PoolBackedSecurity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "debt instrument backed by receivables other than those arising out of real estate loans or mortgages"}})

(def PoolBackedSecurity
  "debt instrument that derives its cashflow from an underlying pool of mortgage loans or other receivables"
  {:db/ident :fibo-sec-dbt-pbs/PoolBackedSecurity,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "If the security is a component of a collateralized debt obligation, then the underlying pool is typically segmented into various tranches, each of which provides cash flows to hedge particular risks, or that offset other gains by time to maturity or other factors."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pool-backed security"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-dae-dbt/isBasedOn,
                      :owl/someValuesFrom :fibo-sec-sec-pls/InstrumentPool,
                      :rdf/type           :owl/Restriction}
                     {:owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :fibo-sec-dbt-pbs/isPassThrough,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     :fibo-sec-dbt-dbti/TradableDebtInstrument],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "debt instrument that derives its cashflow from an underlying pool of mortgage loans or other receivables"}})

(def PrincipalProtectedNote
  "structured finance that offers investors exposure to chosen underlying assets using various approaches and asymmetric pay-off profiles"
  {:db/ident :fibo-sec-dbt-pbs/PrincipalProtectedNote,
   :fibo-fnd-utl-av/adaptedFrom
   "ISO 10962, Securities and related financial instruments - Classification of Financial Instruments (CFI code), Fourth edition, 2019-10-01.",
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "There are one or more reference entities underlying the product. Redemption is made at least in the amount of the conditional capital protection at maturity, provided that no credit event by the reference entity has occurred. Conditional capital protection only applies to the nominal amount and not to the purchase price. The general functioning of a capital guaranteed structured instrument is as follows: the notional amount is split into a zero bond, that will deliver the capital guarantee at maturity, and the difference between the zero bond's value (= present value of the guarantee level at maturity) and the notional amount is used for structuring the performance component with options which deliver the agreed pay-off profile of the structured instrument."},
   :fibo-fnd-utl-av/synonym {:rdf/language "en",
                             :rdf/value    "capital protected note"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "principal protected note"},
   :rdfs/subClassOf :fibo-sec-dbt-pbs/StructuredFinanceInstrument,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "structured finance that offers investors exposure to chosen underlying assets using various approaches and asymmetric pay-off profiles"}})

(def StructuredFinanceInstrument
  "pool-backed security wherein the risk associated with the pool has been uncoupled from the risk associated with the originating institution through a special purpose vehicle"
  {:db/ident :fibo-sec-dbt-pbs/StructuredFinanceInstrument,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Structured finance instruments represent a form of securitization technology which can be defined by three key characteristics: (1) pooling of financial assets, such as loans, bonds, or credit-default swaps; (2) de-linking of the credit risk of the asset pool from the credit risk of the originating firm, usually through use of a finite-lived, stand-alone special purpose vehicle (SPV); and (3) issuance by the SPV of \"tranched\" liabilities backed by the asset pool. Structured finance instruments are typically presented to large financial institutions or companies with complicated financing needs that are unsatisfied with conventional financial products."},
   :fibo-fnd-utl-av/synonym {:rdf/language "en",
                             :rdf/value    "structured finance"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "structured finance instrument"},
   :rdfs/seeAlso ["https://www.bis.org/publ/cgfs23mitchell.pdf"],
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
                      :owl/someValuesFrom {:owl/onProperty
                                           :fibo-fnd-pty-rl/isPlayedBy,
                                           :owl/someValuesFrom
                                           :fibo-be-le-lp/SpecialPurposeVehicle,
                                           :rdf/type :owl/Restriction},
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-pbs/PoolBackedSecurity],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "pool-backed security wherein the risk associated with the pool has been uncoupled from the risk associated with the originating institution through a special purpose vehicle"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Collateralized debt obligations (CDOs), synthetic financial instruments, collateralized bond obligations (CBOs), and syndicated loans are examples of structured finance instruments."}})

(def StructuredFinanceWithoutPrincipalProtection
  "structured finance that is a short-term note linked to an underlying asset that offers a steady stream of income"
  {:db/ident :fibo-sec-dbt-pbs/StructuredFinanceWithoutPrincipalProtection,
   :fibo-fnd-utl-av/adaptedFrom
   "ISO 10962, Securities and related financial instruments - Classification of Financial Instruments (CFI code), Fourth edition, 2019-10-01.",
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The redemption at the end of the term is determined on the basis of the performance and final fixing of the underlying asset: a redemption at the nominal value is guaranteed as long as the underlying asset has not touched its barrier during relevant barrier monitoring. If the underlying asset has touched its barrier but is again above the strike price at final fixing, the nominal price is also repaid. Nevertheless, if the underlying asset has touched its barrier during barrier monitoring and closes below the strike price at final fixing, the underlying asset is delivered or cash compensation paid, provided that no credit event by the reference entity has occurred. Depending on the characteristics of the product, either a coupon or a discount to the underlying asset can apply. A coupon is paid out regardless of the performance of the underlying asset, provided that no credit event by the reference entity has occurred."},
   :fibo-fnd-utl-av/synonym {:rdf/language "en",
                             :rdf/value
                             "structured finance without capital protection"},
   :owl/disjointWith :fibo-sec-dbt-pbs/PrincipalProtectedNote,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value "structured finance without principal protection"},
   :rdfs/subClassOf :fibo-sec-dbt-pbs/StructuredFinanceInstrument,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "structured finance that is a short-term note linked to an underlying asset that offers a steady stream of income"}})

(def Tranche
  "segment of a pool of securities, typically debt instruments"
  {:db/ident :fibo-sec-dbt-pbs/Tranche,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A tranche is one of a number of related securities in the same offering that represents a partition of a debt pool whose cash flow is derived from the combined cash flows of the instruments in that partition."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tranche"},
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-rel-rel/comprises,
     :owl/someValuesFrom {:owl/onClass    :fibo-sec-sec-pls/InstrumentPool,
                          :owl/onProperty :fibo-fnd-arr-arr/isConstituentOf,
                          :owl/qualifiedCardinality 1,
                          :rdf/type       :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-pbs/StructuredFinanceInstrument],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "segment of a pool of securities, typically debt instruments"}})

(def isPassThrough
  "indicates whether the cash flows from the underlying asset pool are passed through to the investor by way of redemption payments"
  {:db/ident :fibo-sec-dbt-pbs/isPassThrough,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-dbt-pbs/PoolBackedSecurity,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is pass through"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates whether the cash flows from the underlying asset pool are passed through to the investor by way of redemption payments"}})