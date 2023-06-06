(ns net.wikipunk.rdf.fibo-sec-dbt-abs
  "Debt securities backed by a pool of assets, including loans of various kinds, credit card pools and home equity lines of credit, as well as esoteric assets."
  {:cmns-av/copyright "Copyright (c) 2015-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :dcterms/abstract
   "Debt securities backed by a pool of assets, including loans of various kinds, credit card pools and home equity lines of credit, as well as esoteric assets.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansSpecific/ConsumerLoans/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/EconomicIndicators/EconomicIndicators/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Funds/Funds/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansSpecific/StudentLoans/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/Pools/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/Indicators/Indicators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/PoolBackedSecurities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/Ownership/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/Bonds/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/FunctionalEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/DebtInstruments/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/AssetBackedSecurities/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-loan-spc-cns"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/ConsumerLoans/",
    "fibo-loan-spc-stu"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/StudentLoans/",
    "fibo-sec-dbt-abs"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
    "fibo-sec-dbt-bnd"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/",
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
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-dbt-abs",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label #voc/lstr "Asset-backed Securities Ontology@en"})

(def AutoAssetBackedSecurity
  "asset-backed security issued by an auto finance company that is backed by an underlying pool of auto-related loans or leases"
  {:cmns-av/adaptedFrom
   "https://content.naic.org/sites/default/files/capital-markets-primer-auto-abs.pdf",
   :cmns-av/explanatoryNote
   [#voc/lstr
     "If the credit risk of the pool has been decoupled from the institution via an SPV, then an auto asset-backed security is also a structured finance instrument.@en"
    #voc/lstr
     "Auto asset-backed securities (auto ABS) are typically structured finance securities that are collateralized by auto loans or leases, such as those to prime (good credit standing) and subprime (poor credit standing) borrowers. Loans or leases are bundled into pools and transferred to a special-purpose entity (SPE), which, in turn, transfers the pool to a (bankruptcy remote) trust. Payments on the underlying auto loans and leases are pooled in the trust, and the funds are used to pay note investors their respective principal which, in turn, transfers the pool to a (bankruptcy remote) trust. Payments on the underlying auto loans and leases are pooled in the trust, and the funds are used to pay note investors their respective principal and interest when due. Any leftover funds - known as excess spread, or the net interest margin - are paid to the equity holder (usually the issuer, such as an auto finance company).@en"],
   :db/ident :fibo-sec-dbt-abs/AutoAssetBackedSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label #voc/lstr "auto asset-backed security@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom :fibo-sec-dbt-abs/AutoDebtPool,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-pbs/AssetBackedSecurity
                     :fibo-sec-dbt-abs/AutoAssetBackedSecurity],
   :skos/definition
   #voc/lstr
    "asset-backed security issued by an auto finance company that is backed by an underlying pool of auto-related loans or leases@en"})

(def AutoDebtPool
  "debt pool of auto-related loans or leases"
  {:db/ident :fibo-sec-dbt-abs/AutoDebtPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label #voc/lstr "auto debt pool@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-loan-spc-cns/AutoLoan,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/DebtPool
                     :fibo-sec-dbt-abs/AutoDebtPool],
   :skos/definition #voc/lstr "debt pool of auto-related loans or leases@en"})

(def BondPool
  "debt pool of consisting of bonds"
  {:db/ident :fibo-sec-dbt-abs/BondPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label #voc/lstr "bond pool@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-sec-dbt-bnd/Bond,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/DebtPool
                     :fibo-sec-dbt-abs/BondPool],
   :skos/definition #voc/lstr "debt pool of consisting of bonds@en"})

(def ConsumerAssetBackedSecurity
  "structured finance securities collateralized by pools of auto loans and leases (auto ABS), credit card receivables (credit card ABS) or student loans (student loan ABS)"
  {:cmns-av/adaptedFrom
   "https://content.naic.org/sites/default/files/capital-markets-primer-consumer-abs.pdf",
   :db/ident :fibo-sec-dbt-abs/ConsumerAssetBackedSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label #voc/lstr "consumer asset-backed security@en",
   :rdfs/subClassOf [{:owl/unionOf
                      [:fibo-sec-dbt-abs/AutoAssetBackedSecurity
                       :fibo-sec-dbt-abs/CreditCardAssetBackedSecurity
                       :fibo-sec-dbt-abs/StudentLoanAssetBackedSecurity],
                      :rdf/type :owl/Class}
                     :fibo-sec-dbt-pbs/StructuredFinanceInstrument
                     :fibo-sec-dbt-pbs/AssetBackedSecurity
                     :fibo-sec-dbt-abs/ConsumerAssetBackedSecurity],
   :skos/definition
   #voc/lstr
    "structured finance securities collateralized by pools of auto loans and leases (auto ABS), credit card receivables (credit card ABS) or student loans (student loan ABS)@en"})

(def ControlledAmortizationAssetBackedSecurity
  "asset-backed security based on a pool of bonds securitized using a controlled amortization structure"
  {:cmns-av/adaptedFrom
   "http://www.investinginbonds.com/learnmore.asp?catid=11&subcatid=57&id=15",
   :cmns-av/explanatoryNote
   ["Revolving debt (primarily credit card receivables, but also HELOCs, trade receivables, dealer floor-plan loans and some leases) may be securitized using a controlled amortization structure. This is a method of providing investors with a relatively predictable repayment schedule, even though the underlying assets are nonamortizing. A risk inherent in this kind of ABS is an early amortization event."
    "Controlled-amortization ABS resemble corporate bonds with a sinking fund. After a predetermined 'revolving' period during which only interest payments are made, these securities attempt to return principal to investors in a series of defined periodic payments that usually occur over less than a year."],
   :db/ident :fibo-sec-dbt-abs/ControlledAmortizationAssetBackedSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label "controlled amortization asset-backed security",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
     :owl/someValuesFrom :fibo-sec-sec-pls/DebtPool,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-dbt-dbti/hasRepaymentTerms,
     :owl/someValuesFrom :fibo-sec-dbt-abs/ControlledAmortizationStructure,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-pbs/AssetBackedSecurity
    :fibo-sec-dbt-abs/ControlledAmortizationAssetBackedSecurity],
   :skos/definition
   "asset-backed security based on a pool of bonds securitized using a controlled amortization structure"})

(def ControlledAmortizationStructure
  "method of providing investors with a relatively predictable repayment schedule, even though the underlying assets are non-amortizing"
  {:db/ident :fibo-sec-dbt-abs/ControlledAmortizationStructure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label "controlled amortization structure",
   :rdfs/subClassOf [:fibo-sec-dbt-bnd/BondAmortizationPaymentTerms
                     :fibo-sec-dbt-abs/ControlledAmortizationStructure],
   :skos/definition
   "method of providing investors with a relatively predictable repayment schedule, even though the underlying assets are non-amortizing"})

(def CreditCardAssetBackedSecurity
  "asset-backed security based on credit card receivables"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "Federal Deposit Insurance Corporation (FDIC) Credit Card Securitization Manual, available at https://www.fdic.gov/regulations/examinations/credit_card_securitization/ch2.html@en",
   :cmns-av/explanatoryNote
   #voc/lstr
    "Credit card securitizations currently represent the primary funding vehicle for unsecured revolving consumer credit. Similar to mortgage and other asset securitizations, the financial institution that originates the credit card receivables sells a group of these receivables to a trust. The trust then creates and sells certificates backed by the credit card receivables to investors, which are predominately institutional investors. Very few credit card ABS are marketed to retail customers, primarily due to the complex nature of the transactions and the need to continually monitor various performance indices on the underlying receivables. The underlying credit card receivables generate income to support the interest payments on the certificates.@en",
   :db/ident :fibo-sec-dbt-abs/CreditCardAssetBackedSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label #voc/lstr "credit card asset-backed security@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom :fibo-sec-dbt-abs/CreditCardPool,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-pbs/AssetBackedSecurity
                     :fibo-sec-dbt-abs/CreditCardAssetBackedSecurity],
   :skos/definition
   #voc/lstr "asset-backed security based on credit card receivables@en"})

(def CreditCardPool
  "pool of outstanding balances on designated accounts"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "Federal Deposit Insurance Corporation (FDIC) Credit Card Securitization Manual, available at https://www.fdic.gov/regulations/examinations/credit_card_securitization/ch2.html@en",
   :cmns-av/explanatoryNote
   #voc/lstr
    "In a credit card securitization transaction only the receivables are sold, not the accounts that generate the receivables. The financial institution retains legal ownership of the credit card accounts and can continue to change the terms on the accounts. Accounts corresponding to securitized loans are typically referred to as the designated accounts (or sometimes trust accounts). The initial outstanding balances on the designated accounts are sold to the trust as are the rights to any new charges on the designated accounts. Subsequently, as cardholder purchase activity generates more receivables on the designated accounts, these new receivables are purchased by the trust from the originating institution/seller/transferor. The trust uses the monthly principal payments received from the cardholders to acquire these new charges or receivables. When the securitization is initially set up, the originating institution/seller adds sufficient receivables to support the principal balance of the certificates plus an additional amount (seller's interest) that serves to absorb fluctuations in the outstanding balance of the receivables. The originating institution/seller will make subsequent additions to the trust in order to keep the seller's interest at the required level.@en",
   :db/ident :fibo-sec-dbt-abs/CreditCardPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label #voc/lstr "credit card pool@en",
   :rdfs/subClassOf [:fibo-sec-sec-pls/DebtPool
                     :fibo-sec-dbt-abs/CreditCardPool],
   :skos/definition #voc/lstr
                     "pool of outstanding balances on designated accounts@en"})

(def FullyAmortizingAssetBackedSecurity
  "asset-backed security based on a pool of debt instruments that returns principal to investors over the life of the security"
  {:cmns-av/adaptedFrom
   "http://www.investinginbonds.com/learnmore.asp?catid=11&subcatid=57&id=15",
   :cmns-av/explanatoryNote
   ["These are typically backed by HELs, auto loans, manufactured-housing contracts and other fully amortizing assets. Prepayment risk is a key consideration with such ABS, although the rate of prepayment may vary considerably by the type of underlying asset."
    "Fully amortizing asset-backed securities are designed to closely reflect the full repayment of the underlying loans through scheduled interest and principal payments."],
   :db/ident :fibo-sec-dbt-abs/FullyAmortizingAssetBackedSecurity,
   :owl/disjointWith
   :fibo-sec-dbt-abs/ControlledAmortizationAssetBackedSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label "fully amortizing asset-backed security",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom :fibo-sec-sec-pls/DebtPool,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-sec-dbt-dbti/hasRepaymentTerms,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-abs/ControlledAmortizationStructure,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-pbs/AssetBackedSecurity
                     :fibo-sec-dbt-abs/FullyAmortizingAssetBackedSecurity],
   :skos/definition
   "asset-backed security based on a pool of debt instruments that returns principal to investors over the life of the security"})

(def HomeEquityLineOfCreditPool
  "debt pool consisting of home equity loans"
  {:db/ident :fibo-sec-dbt-abs/HomeEquityLineOfCreditPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label #voc/lstr "home equity line of credit pool@en",
   :rdfs/subClassOf [{:owl/onProperty :cmns-col/hasConstituent,
                      :owl/someValuesFrom
                      :fibo-loan-spc-cns/HomeEquityLineOfCredit,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-sec-pls/DebtPool
                     :fibo-sec-dbt-abs/HomeEquityLineOfCreditPool],
   :skos/definition #voc/lstr "debt pool consisting of home equity loans@en"})

(def HomeEquityLoanAssetBackedSecurity
  "asset-backed security based on home equity loan receivables"
  {:cmns-av/explanatoryNote
   [#voc/lstr
     "Similar to mortgages, home equity loans are often taken out by borrowers who have less-than-stellar credit scores or few assets - the reason why they didn’t qualify for a mortgage. These are amortizing loans - that is, payment goes toward satisfying a specific sum and consists of three categories: interest, principal, and prepayments.@en"
    #voc/lstr
     "If the credit risk of the pool has been decoupled from the institution via an SPV, then home equity asset-backed securities are also structured finance instruments.@en"],
   :db/ident :fibo-sec-dbt-abs/HomeEquityLoanAssetBackedSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label #voc/lstr "home equity loan asset-backed security@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-abs/HomeEquityLineOfCreditPool,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-pbs/AssetBackedSecurity
                     :fibo-sec-dbt-abs/HomeEquityLoanAssetBackedSecurity],
   :skos/definition
   #voc/lstr "asset-backed security based on home equity loan receivables@en"})

(def StudentLoanAssetBackedSecurity
  "asset-backed security based on student loan receivables"
  {:cmns-av/explanatoryNote
   [#voc/lstr
     "The main purpose behind Student Loan ABS is to diversify the risk for lenders across many investors. By pooling and then packaging the loans into securities and selling them to investors, agencies can spread around the default risk, which allows them to give out more loans and larger loans. This way, more students have access to loans, investors have a diversifying investment instrument, and lenders can generate consistent cash flow from their securitization and debt collection services.@en"
    #voc/lstr
     "If the credit risk of the pool has been decoupled from the institution via an SPV, then student loan asset-backed securities are also structured finance instruments.@en"],
   :db/ident :fibo-sec-dbt-abs/StudentLoanAssetBackedSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label #voc/lstr "student loan asset-backed security@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom :fibo-sec-dbt-abs/StudentLoanPool,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-pbs/AssetBackedSecurity
                     :fibo-sec-dbt-abs/StudentLoanAssetBackedSecurity],
   :skos/definition
   #voc/lstr "asset-backed security based on student loan receivables@en"})

(def StudentLoanPool
  "debt pool consisting of student loans"
  {:db/ident :fibo-sec-dbt-abs/StudentLoanPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label #voc/lstr "student loan pool@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-loan-spc-stu/StudentLoan,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/DebtPool
                     :fibo-sec-dbt-abs/StudentLoanPool],
   :skos/definition #voc/lstr "debt pool consisting of student loans@en"})

(def WACBondCoupon
  "w a c bond coupon"
  {:db/ident :fibo-sec-dbt-abs/WACBondCoupon,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfs/label "w a c bond coupon",
   :rdfs/subClassOf [:fibo-sec-dbt-bnd/BondVariableCoupon
                     :fibo-sec-dbt-abs/WACBondCoupon]})