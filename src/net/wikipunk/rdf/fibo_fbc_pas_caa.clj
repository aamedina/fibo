(ns net.wikipunk.rdf.fibo-fbc-pas-caa
  "This ontology provides basic concepts such as account, account holder, account provider, relationship manager that are commonly used by financial services providers to describe customers and to determine counterparty identities."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :dcterms/abstract
   "This ontology provides basic concepts such as account, account holder, account provider, relationship manager that are commonly used by financial services providers to describe customers and to determine counterparty identities.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/Occurrences/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/Executives/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/AccountingEquity/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/ProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/FinancialServicesEntities/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/FunctionalEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Arrangements/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/Ownership/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/IdentifiersAndIndices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/ClassificationSchemes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/BusinessRegistries/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-fct-fct"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities/",
    "fibo-be-oac-exec"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fbc-fct-fse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
    "fibo-fbc-fct-ra"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fbc-pas-caa"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-aeq"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-arr-cls"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/",
    "fibo-fnd-arr-doc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
    "fibo-fnd-arr-id"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-dt-oc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/",
    "fibo-fnd-oac-own"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
    "fibo-fnd-pas-pas"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-pas-caa",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "Clients and Accounts Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts.rdf version of this ontology was revised to change a property on CertificateOfDeposit from has notional amount to has nominal value for the sake of consistency."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts.rdf version of this ontology was revised to clean up dead links and address text formatting hygiene issues."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/ version of this ontology was modified to replace hasDefinition with isDefinedIn to clarify intent."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts.rdf version of this ontology was revised to reflect the move of hasTerm from FinancialInstruments to Contracts and add the definition of a lending officer."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts.rdf version of this ontology was revised per the FIBO 2.0 RFC with respect to the definitions for accounts and account identifiers, such as BBAN and IBAN identifiers, including but not limited to bank accounts."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts.rdf version of this ontology was revised to add definitions for balance, fee, general ledger, ledger account, income and related properties, revise definitions to be ISO 704 compliant, and eliminate duplication with concepts in LCC."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts.rdf version of this ontology was revised to rename ownership related properties for consistent alignment with the ownership situational pattern."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/ version of this ontology was modified to support the addition of maturity-related properties to financial instruments."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts.rdf version of this ontology was revised to eliminate deprecated elements."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts.rdf version of this ontology was revised to eliminate the disjointness between a deposit account and investment account to allow for certain portfolio management accounts that have characteristics of both."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts.rdf version of this ontology was revised to reflect the move of certain organization-specific concepts from BE to FND, to incorporate the concept of a composite identifier for BBAN and IBAN definition, loosen the definition of bank identifier with respect to the nature of the functional entity it identifies, and clarify the identifier hierarchy and fix spelling."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts.rdf version of this ontology was revised to generalize the definition of customer account and eliminate ambiguity in others."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts.rdf version of this ontology was revised to add definitions for transaction records, which are needed to represent statements of various sorts, to add the concept of an account statement, and to clean up and augment definitions related to accounts, account holders, etc. as required for the purpose of representing credit card accounts."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts.rdf version of this ontology was revised to link a credit agreement with an account and loosen transaction-related constraints such that the notion of a transaction can be applied to credit agreements generally."]})

(def Account
  "container for records associated with a business arrangement for regular transactions and services"
  {:cmns-av/explanatoryNote
   "In general, an account is associated with a contractual relationship between a buyer and seller under which payment may be made at a later time. General ledger accounts are an exception to this, however, and typically do not have account holders, including internal account holders. They may, on the other hand, have responsible parties.",
   :db/ident :fibo-fbc-pas-caa/Account,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "account",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-pas-caa/TransactionRecord,
                      :owl/onProperty :fibo-fnd-arr-doc/hasRecord,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-pas-caa/CloseDate,
                      :owl/onProperty :fibo-fbc-pas-caa/hasCloseDate,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-pas-caa/AccountHolder,
                      :owl/onProperty :fibo-fnd-rel-rel/isHeldBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-pas-caa/AccountIdentifier,
                      :owl/onProperty :lcc-lr/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-pas-caa/hasBalance,
                      :owl/someValuesFrom :fibo-fbc-pas-caa/Balance,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/isProvidedBy,
                      :owl/someValuesFrom :fibo-fbc-pas-caa/AccountProvider,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :fibo-fbc-pas-caa/OpenDate,
                      :owl/onProperty :fibo-fbc-pas-caa/hasOpenDate,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "container for records associated with a business arrangement for regular transactions and services"})

(def AccountAsAnAsset
  "financial asset in the form of an account"
  {:db/ident :fibo-fbc-pas-caa/AccountAsAnAsset,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "account as an asset",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
                      :owl/someValuesFrom :fibo-fbc-pas-caa/Account,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-oac-own/isAssetOf,
                      :owl/someValuesFrom :fibo-fbc-pas-caa/AccountHolder,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-aeq/FinancialAsset],
   :skos/definition "financial asset in the form of an account"})

(def AccountHolder
  "party that owns an account"
  {:cmns-av/explanatoryNote
   ["An account holder is named on the account and is authorized to conduct transactions associated with the account. Authorization is typically evidenced by signatures maintained on file by the account provider."
    "Note that this concept of account holder applies to internal accounts that are non-general ledger accounts also have account holders, such as payroll accounts, internal checking accounts associated with cashier's checks, and so forth."],
   :db/ident :fibo-fbc-pas-caa/AccountHolder,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "account holder",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-rel-rel/holds,
     :owl/someValuesFrom :fibo-fbc-pas-caa/Account,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-oac-own/Owner
    {:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-oac-own/owns,
                          :owl/someValuesFrom :fibo-fbc-pas-caa/Account,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-pty-pty/isAPartyTo,
                          :owl/someValuesFrom :fibo-fbc-pas-caa/Account,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}],
   :skos/definition "party that owns an account"})

(def AccountIdentifier
  "identifier that denotes an account"
  {:cmns-av/adaptedFrom
   "ISO 13616-1:2007 Financial services - International bank account number (IBAN)",
   :cmns-av/synonym "account number",
   :db/ident :fibo-fbc-pas-caa/AccountIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "account identifier",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fbc-pas-caa/Account,
                      :owl/onProperty :lcc-lr/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fct-ra/RegistryIdentifier],
   :skos/definition "identifier that denotes an account"})

(def AccountOwnership
  "holding of an account"
  {:db/ident :fibo-fbc-pas-caa/AccountOwnership,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "account ownership",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-oac-own/hasOwningParty,
                      :owl/someValuesFrom :fibo-fbc-pas-caa/AccountHolder,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :fibo-fbc-pas-caa/AccountAsAnAsset,
                      :owl/onProperty :fibo-fnd-oac-own/hasOwnedAsset,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-pas-fpas/Holding],
   :skos/definition "holding of an account"})

(def AccountProvider
  "party that provides and services an account"
  {:db/ident :fibo-fbc-pas-caa/AccountProvider,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "account provider",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-pty-pty/isAPartyTo,
                          :owl/someValuesFrom :fibo-fbc-pas-caa/Account,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-fnd-pas-pas/ServiceProvider],
   :skos/definition "party that provides and services an account"})

(def AccountSpecificServiceAgreement
  "service-agreement that is account-specific, applicable in cases where a client might hold multiple accounts with differing terms and conditions"
  {:cmns-av/explanatoryNote
   "Customers of financial service providers frequently hold multiple accounts - brokerage accounts, checking and savings accounts, trust accounts, and so forth - which may have specific terms and conditions associated with them.",
   :db/ident :fibo-fbc-pas-caa/AccountSpecificServiceAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "account-specific service agreement",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/appliesTo,
                      :owl/someValuesFrom :fibo-fbc-pas-caa/Account,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-agr-ctr/hasContractParty,
                      :owl/someValuesFrom :fibo-fbc-pas-caa/AccountProvider,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-agr-ctr/hasContractParty,
                      :owl/someValuesFrom :fibo-fbc-pas-caa/AccountHolder,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-pas-pas/ServiceAgreement],
   :skos/definition
   "service-agreement that is account-specific, applicable in cases where a client might hold multiple accounts with differing terms and conditions"})

(def AccountStatement
  "periodic summary of account activity for a given period of time"
  {:cmns-av/explanatoryNote
   "Common kinds of account statements include checking account statements, usually provided monthly, and brokerage account statements, which are provided monthly or quarterly, depending on the terms of the account agreement. Monthly credit card bills are also considered account statements.",
   :db/ident :fibo-fbc-pas-caa/AccountStatement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "account statement",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :fibo-fnd-dt-fd/ExplicitDatePeriod,
                      :owl/onProperty :fibo-fnd-arr-doc/hasReportingPeriod,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty :fibo-fbc-pas-caa/recordsTransaction,
                      :owl/someValuesFrom
                      :fibo-fbc-pas-caa/IndividualTransaction,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-arr-doc/LegalDocument
                     {:owl/onClass    :fibo-fbc-pas-caa/Account,
                      :owl/onProperty :fibo-fbc-pas-caa/appliesToAccount,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-arr-doc/Record
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :fibo-fbc-pas-caa/Balance,
                      :owl/onProperty :fibo-fbc-pas-caa/hasStartingBalance,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :fibo-fbc-pas-caa/Balance,
                      :owl/onProperty :fibo-fbc-pas-caa/hasEndingBalance,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "periodic summary of account activity for a given period of time"})

(def AccountingTransaction
  "event recognized by an entry in the records of an account"
  {:db/ident :fibo-fbc-pas-caa/AccountingTransaction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "accounting transaction",
   :rdfs/subClassOf :fibo-fnd-pas-pas/TransactionEvent,
   :skos/definition
   "event recognized by an entry in the records of an account"})

(def Balance
  "amount of money available or owed"
  {:cmns-av/explanatoryNote
   "The balance is the net amount after factoring in all debits and credits, including service charges and fees.",
   :db/ident :fibo-fbc-pas-caa/Balance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "balance",
   :rdfs/subClassOf :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition "amount of money available or owed"})

(def BankAccountIdentifier
  "identifier that identifies a demand deposit account provided by a bank"
  {:cmns-av/adaptedFrom
   "ISO 13616-1:2007 Financial services - International bank account number (IBAN)",
   :cmns-av/synonym "bank account number",
   :db/ident :fibo-fbc-pas-caa/BankAccountIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "bank account identifier",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fbc-pas-caa/DemandDepositAccount,
                      :owl/onProperty :lcc-lr/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-pas-caa/AccountIdentifier],
   :skos/definition
   "identifier that identifies a demand deposit account provided by a bank"})

(def BankIdentifier
  "identifier that uniquely identifies the financial institution and, when appropriate, the branch of that financial institution servicing an account"
  {:cmns-av/adaptedFrom
   "ISO 13616-1:2007 Financial services - International bank account number (IBAN)",
   :cmns-av/synonym "bank number",
   :db/ident :fibo-fbc-pas-caa/BankIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "bank identifier",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fbc-fct-fse/FinancialInstitution,
                      :owl/onProperty :lcc-lr/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fct-fse/FinancialServiceProviderIdentifier],
   :skos/definition
   "identifier that uniquely identifies the financial institution and, when appropriate, the branch of that financial institution servicing an account"})

(def BasicBankAccountIdentifier
  "identifier that uniquely identifies an individual account at a specific financial institution in a particular country and which includes a bank identifier of the financial institution servicing that account"
  {:cmns-av/abbreviation "BBAN",
   :cmns-av/adaptedFrom
   "ISO 13616-1:2007 Financial services - International bank account number (IBAN)",
   :cmns-av/synonym "basic bank account number",
   :db/ident :fibo-fbc-pas-caa/BasicBankAccountIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "basic bank account identifier",
   :rdfs/subClassOf [:fibo-fnd-arr-id/CompositeIdentifier
                     {:owl/onClass    :fibo-fbc-pas-caa/BankAccountIdentifier,
                      :owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-pas-caa/BankAccountIdentifier
                     {:owl/onClass    :fibo-fbc-pas-caa/BankIdentifier,
                      :owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "identifier that uniquely identifies an individual account at a specific financial institution in a particular country and which includes a bank identifier of the financial institution servicing that account"})

(def BrokerageAccount
  "account offered by a broker that allows the investor to deposit funds and place investment orders"
  {:cmns-av/explanatoryNote
   "The investor owns the assets contained in the brokerage account and must usually claim as income any capital gains incurred.",
   :db/ident :fibo-fbc-pas-caa/BrokerageAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "brokerage account",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/isProvidedBy,
                      :owl/someValuesFrom
                      {:owl/unionOf
                       [:fibo-fbc-fct-fse/Bank
                        :fibo-fbc-fct-fse/BrokerageFirm
                        :fibo-fbc-fct-fse/FuturesCommissionMerchant],
                       :rdf/type :owl/Class},
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-pas-caa/InvestmentAccount],
   :skos/definition
   "account offered by a broker that allows the investor to deposit funds and place investment orders"})

(def CertificateOfDeposit
  "cash instrument associated with a time deposit account that cannot be withdrawn for a certain period of time (term)"
  {:cmns-av/abbreviation "CD",
   :cmns-av/explanatoryNote
   "When the term is over it can be withdrawn or it can be held for another term. The longer the term the better the yield on the money.",
   :db/ident :fibo-fbc-pas-caa/CertificateOfDeposit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "certificate of deposit"},
   :rdfs/subClassOf [:fibo-fbc-fi-fi/CashInstrument
                     {:owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fbc-fi-fi/hasNominalValue,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-dt-fd/Duration,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasContractDuration,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-acc-cur/InterestRate,
                      :owl/onProperty :fibo-fbc-dae-dbt/hasInterestRate,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "cash instrument associated with a time deposit account that cannot be withdrawn for a certain period of time (term)"}})

(def CloseDate
  "date on which something was closed"
  {:db/ident :fibo-fbc-pas-caa/CloseDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "close date",
   :rdfs/subClassOf :fibo-fnd-dt-fd/ExplicitDate,
   :skos/definition "date on which something was closed",
   :skos/example
   "account close date, transaction record close date, and so forth"})

(def CustomerAccount
  "account that represents an identified, named collection of balances and cumulative totals used to summarize customer transaction-related activity over a designated period of time"
  {:cmns-av/synonym "financial service account",
   :db/ident :fibo-fbc-pas-caa/CustomerAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "customer account",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fbc-pas-caa/realizes,
     :owl/someValuesFrom {:owl/unionOf [:fibo-fbc-pas-fpas/FinancialProduct
                                        :fibo-fbc-pas-fpas/FinancialService],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/isHeldBy,
     :owl/someValuesFrom :fibo-fbc-pas-caa/CustomerAccountHolder,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/isDefinedIn,
     :owl/someValuesFrom :fibo-fnd-pas-pas/ServiceAgreement,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :lcc-lr/isIdentifiedBy,
     :owl/someValuesFrom :fibo-fbc-pas-caa/AccountIdentifier,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-pas-caa/Account
    {:owl/onProperty     :fibo-fnd-rel-rel/isProvidedBy,
     :owl/someValuesFrom {:owl/intersectionOf
                          [:fibo-fbc-pas-caa/AccountProvider
                           :fibo-fbc-pas-fpas/FinancialServiceProvider],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}],
   :skos/definition
   "account that represents an identified, named collection of balances and cumulative totals used to summarize customer transaction-related activity over a designated period of time"})

(def CustomerAccountHolder
  "party that owns a customer account"
  {:db/ident :fibo-fbc-pas-caa/CustomerAccountHolder,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "customer account holder",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/holds,
                      :owl/someValuesFrom :fibo-fbc-pas-caa/CustomerAccount,
                      :rdf/type           :owl/Restriction}
                     {:owl/unionOf [:fibo-fnd-pas-pas/Client
                                    :fibo-fnd-pas-pas/Customer],
                      :rdf/type    :owl/Class}
                     :fibo-fbc-pas-caa/AccountHolder],
   :skos/definition "party that owns a customer account"})

(def DemandDepositAccount
  "non-interest-bearing deposit account in which deposits are payable immediately on demand, or that are issued with an original maturity or required notice period of less than seven days, or that represent funds for which the depository institution does not reserve the right to require at least seven days' written notice of an intended withdrawal"
  {:cmns-av/abbreviation "DDA",
   :cmns-av/explanatoryNote
   "Demand deposits include any matured time deposits without automatic renewal provisions, unless the deposit agreement provides for the funds to be transferred at maturity to another type of account. Demand deposits do not include: (i) money market deposit accounts (MMDAs) or (ii) NOW accounts.",
   :db/ident :fibo-fbc-pas-caa/DemandDepositAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "demand deposit account",
   :rdfs/subClassOf :fibo-fbc-pas-caa/TransactionDepositAccount,
   :skos/definition
   "non-interest-bearing deposit account in which deposits are payable immediately on demand, or that are issued with an original maturity or required notice period of less than seven days, or that represent funds for which the depository institution does not reserve the right to require at least seven days' written notice of an intended withdrawal"})

(def DepositAccount
  "account that provides a record of money placed with a depository institution for safekeeping and management"
  {:cmns-av/explanatoryNote
   "The account holder has the right to withdraw deposited funds, as set forth in the terms and conditions governing the account agreement. Deposit accounts may be insured up to a certain amount, depending on the jurisdiction.",
   :db/ident :fibo-fbc-pas-caa/DepositAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "deposit account",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/isProvidedBy,
                      :owl/someValuesFrom
                      :fibo-fbc-fct-fse/DepositoryInstitution,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-pas-caa/InvestmentOrDepositAccount
                     :fibo-fbc-fct-fse/BankingProduct],
   :skos/definition
   "account that provides a record of money placed with a depository institution for safekeeping and management",
   :skos/example
   "Deposit accounts include savings accounts, money market accounts, and transactional accounts, such as demand deposit accounts, among others."})

(def Fee
  "charge for services performed"
  {:db/ident :fibo-fbc-pas-caa/Fee,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "fee",
   :rdfs/subClassOf :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition "charge for services performed"})

(def GeneralLedger
  "accounting record summarizing changes in position as transactions are posted during an accounting period"
  {:db/ident :fibo-fbc-pas-caa/GeneralLedger,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "general ledger",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/comprises,
                      :owl/someValuesFrom :fibo-fbc-pas-caa/LedgerAccount,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-doc/Record],
   :skos/definition
   "accounting record summarizing changes in position as transactions are posted during an accounting period"})

(def IndividualTransaction
  "event that has a monetary impact and is documented in the records associated with an account"
  {:db/ident :fibo-fbc-pas-caa/IndividualTransaction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "individual transaction",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fbc-pas-caa/PostingDate,
                      :owl/onProperty :fibo-fbc-pas-caa/hasPostingDate,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fnd-acc-cur/hasMonetaryAmount,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-be-fct-fct/Merchant,
                      :owl/onProperty :fibo-fbc-pas-caa/involvesMerchant,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fbc-pas-caa/Account,
                      :owl/onProperty :fibo-fbc-pas-caa/appliesToAccount,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/allValuesFrom :fibo-fbc-pas-caa/TransactionRecord,
                      :owl/onProperty    :fibo-fbc-fct-ra/isRegisteredIn,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-dt-fd/DatedCollectionConstituent
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :fibo-fbc-pas-caa/TransactionIdentifier,
                      :owl/onProperty :lcc-lr/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fbc-pas-caa/TransactionDate,
                      :owl/onProperty :fibo-fbc-pas-caa/hasTransactionDate,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-pas-pas/TransactionEvent,
                      :owl/onProperty :fibo-fnd-dt-oc/exemplifies,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fct-ra/RegistryEntry
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty
                      :fibo-fbc-pas-caa/hasTransactionDescription,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-pas-caa/TransactionSubcategory,
                      :owl/onProperty :lcc-cr/isClassifiedBy,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-pas-caa/TransactionCategory,
                      :owl/onProperty :lcc-cr/isClassifiedBy,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "event that has a monetary impact and is documented in the records associated with an account"})

(def InternationalBankAccountIdentifier
  "identifier for a bank account that is an expanded version of the basic bank account number (BBAN), intended for use internationally"
  {:cmns-av/abbreviation "IBAN",
   :cmns-av/adaptedFrom
   "ISO 13616-1:2007 Financial services - International bank account number (IBAN)",
   :cmns-av/explanatoryNote
   ["Note that international bank account numbers are formatted uniquely by country. A description of the country-specific formats is available from SWIFT (https://www.swift.com/), which is the ISO registrar for ISO 13616."
    "The IBAN structure is defined in ISO 13616-1 and consists of a two-letter ISO 3166-1 country code, followed by two check digits and up to thirty alphanumeric characters for a BBAN (Basic Bank Account Number) which has a fixed length per country and, included within it, a bank identifier with a fixed position and a fixed length per country. The check digits are calculated based on the scheme defined in ISO/IEC 7064 (MOD97-10)."],
   :cmns-av/synonym "international bank account number",
   :db/ident :fibo-fbc-pas-caa/InternationalBankAccountIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "international bank account identifier",
   :rdfs/subClassOf [{:owl/onClass :fibo-fbc-pas-caa/BasicBankAccountIdentifier,
                      :owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-arr-id/CompositeIdentifier
                     {:owl/onClass    :lcc-cr/Alpha2Code,
                      :owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-pas-caa/BankAccountIdentifier],
   :skos/definition
   "identifier for a bank account that is an expanded version of the basic bank account number (BBAN), intended for use internationally",
   :skos/example
   "For an account in Switzerland, suppose that an example domestic account number is 762 1162-3852.957. Suppose further that the bank identifier portion of that domestic account number is 762, or normalized for the BBAN is '00762'. For that example, the corresponding BBAN is '00762011623852957' and IBAN is 'CH9300762011623852957'."})

(def InvestmentAccount
  "account that provides a record of deposits of funds and/or securities held at a financial institution"
  {:cmns-av/explanatoryNote
   "The typical objectives of an investment account are to achieve long term growth, income or capital preservation from the deposited asset portfolio. Investment accounts are typically not insured.",
   :db/ident :fibo-fbc-pas-caa/InvestmentAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "investment account",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/isProvidedBy,
                      :owl/someValuesFrom
                      :fibo-fbc-fct-fse/FinancialInstitution,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-pas-caa/InvestmentOrDepositAccount],
   :skos/definition
   "account that provides a record of deposits of funds and/or securities held at a financial institution"})

(def InvestmentOrDepositAccount
  "account associated with a product or service that requires the account holder to provide funds for management by the account provider"
  {:cmns-av/explanatoryNote
   "The account holder may or may not be entitled to consideration in exchange for providing such funds, for example, interest, depending on the type of account and the terms and conditions associated with it. Also, there may be fees associated with management services provided by the account provider. Note too that this may be an internal account held on behalf of an institution or a customer account.",
   :db/ident :fibo-fbc-pas-caa/InvestmentOrDepositAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "investment or deposit account",
   :rdfs/subClassOf :fibo-fbc-pas-caa/Account,
   :skos/definition
   "account associated with a product or service that requires the account holder to provide funds for management by the account provider"})

(def LedgerAccount
  "account recorded in a general ledger"
  {:db/ident :fibo-fbc-pas-caa/LedgerAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "ledger account",
   :rdfs/subClassOf :fibo-fbc-pas-caa/Account,
   :skos/definition "account recorded in a general ledger"})

(def LendingOfficer
  "corporate officer that has overarching responsibility for the relationship with a specific borrower or account"
  {:db/ident :fibo-fbc-pas-caa/LendingOfficer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "lending officer",
   :rdfs/subClassOf [:fibo-fbc-pas-caa/RelationshipManager
                     :fibo-be-oac-exec/CorporateOfficer],
   :skos/definition
   "corporate officer that has overarching responsibility for the relationship with a specific borrower or account"})

(def LoanOrCreditAccount
  "account associated with a service in which the account holder receives funds from the account provider under certain terms and conditions for repayment"
  {:cmns-av/explanatoryNote
   "Note that this may be an internal account held on behalf of an institution or a customer account, such as a line of credit account associated with an internal line of business.",
   :db/ident :fibo-fbc-pas-caa/LoanOrCreditAccount,
   :owl/disjointWith :fibo-fbc-pas-caa/InvestmentOrDepositAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "loan or credit account",
   :rdfs/subClassOf :fibo-fbc-pas-caa/Account,
   :skos/definition
   "account associated with a service in which the account holder receives funds from the account provider under certain terms and conditions for repayment"})

(def NonTransactionDepositAccount
  "any deposit account that is not explicitly considered a transaction account"
  {:cmns-av/explanatoryNote
   "Non-transaction accounts include: (a) savings deposits ((i) money market deposit accounts (MMDAs) and (ii) other savings deposits) and (b) time deposits ((i) time certificates of deposit and (ii) time deposits, open account).",
   :db/ident :fibo-fbc-pas-caa/NonTransactionDepositAccount,
   :owl/disjointWith :fibo-fbc-pas-caa/TransactionDepositAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "non-transaction deposit account",
   :rdfs/subClassOf :fibo-fbc-pas-caa/DepositAccount,
   :skos/definition
   "any deposit account that is not explicitly considered a transaction account"})

(def OpenDate
  "date on which something was created"
  {:db/ident :fibo-fbc-pas-caa/OpenDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "open date",
   :rdfs/subClassOf :fibo-fnd-dt-fd/ExplicitDate,
   :skos/definition "date on which something was created"})

(def PaymentDueDate
  "date by which payment of the current outstanding balance, part thereof, or a minimum amount due must be made to the creditor"
  {:db/ident :fibo-fbc-pas-caa/PaymentDueDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "payment due date",
   :rdfs/subClassOf :fibo-fnd-dt-fd/ExplicitDate,
   :skos/definition
   "date by which payment of the current outstanding balance, part thereof, or a minimum amount due must be made to the creditor"})

(def PostingDate
  "date that determines in which posting period a document or journal entry is added to an account record"
  {:db/ident :fibo-fbc-pas-caa/PostingDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "posting date",
   :rdfs/subClassOf :fibo-fnd-dt-fd/ExplicitDate,
   :skos/definition
   "date that determines in which posting period a document or journal entry is added to an account record"})

(def RelationshipManager
  "responsible party who manages a client's account and oversees their relationship with the service provider"
  {:cmns-av/synonym "account manager",
   :db/ident :fibo-fbc-pas-caa/RelationshipManager,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "relationship manager",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/manages,
                      :owl/someValuesFrom :fibo-fbc-pas-caa/Account,
                      :rdf/type           :owl/Restriction}
                     :fibo-be-oac-exec/ResponsibleParty],
   :skos/definition
   "responsible party who manages a client's account and oversees their relationship with the service provider"})

(def TimeCertificateOfDepositAccount
  "time deposit account that allows deposits evidenced by a negotiable or nonnegotiable instrument, or a deposit in book entry form evidenced by a receipt or similar acknowledgement issued by the bank, that provides, on its face, that the amount of such deposit is payable to the bearer, to any specified person, or to the order of a specified person, as follows: (1) on a certain date not less than seven days after the date of deposit, (2) at the expiration of a specified period not less than seven days after the date of the deposit, or (3) upon written notice to the bank which is to be given not less than seven days before the date of withdrawal."
  {:cmns-av/abbreviation "CDA",
   :db/ident :fibo-fbc-pas-caa/TimeCertificateOfDepositAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "time certificate of deposit account",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fbc-pas-caa/isRealizedBy,
                      :owl/someValuesFrom
                      :fibo-fbc-pas-caa/CertificateOfDeposit,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-pas-caa/TimeDepositAccount],
   :skos/definition
   "time deposit account that allows deposits evidenced by a negotiable or nonnegotiable instrument, or a deposit in book entry form evidenced by a receipt or similar acknowledgement issued by the bank, that provides, on its face, that the amount of such deposit is payable to the bearer, to any specified person, or to the order of a specified person, as follows: (1) on a certain date not less than seven days after the date of deposit, (2) at the expiration of a specified period not less than seven days after the date of the deposit, or (3) upon written notice to the bank which is to be given not less than seven days before the date of withdrawal."})

(def TimeDepositAccount
  "deposit account that the depositor does not have a right, and is not permitted, to make withdrawals from within six days after the date of deposit unless the deposit is subject to an early withdrawal penalty of at least seven days' simple interest on amounts withdrawn within the first six days after deposit"
  {:cmns-av/explanatoryNote
   "A time deposit from which partial early withdrawals are permitted must impose additional early withdrawal penalties of at least seven days' simple interest on amounts withdrawn within six days after each partial withdrawal. If such additional early withdrawal penalties are not imposed, the account ceases to be a time deposit. The account may become a savings deposit if it meets the requirements for a savings deposit; otherwise it becomes a demand deposit.",
   :db/ident :fibo-fbc-pas-caa/TimeDepositAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "time deposit account",
   :rdfs/subClassOf [:fibo-fnd-pas-pas/ContractualProduct
                     :fibo-fbc-pas-caa/NonTransactionDepositAccount],
   :skos/definition
   "deposit account that the depositor does not have a right, and is not permitted, to make withdrawals from within six days after the date of deposit unless the deposit is subject to an early withdrawal penalty of at least seven days' simple interest on amounts withdrawn within the first six days after deposit"})

(def TimeDepositOpenAccount
  "time deposit account that allows deposits (other than time certificates of deposit) for which there is in force a written contract with the depositor that neither the whole nor any part of such deposit may be withdrawn prior to (1) the date of maturity, which shall be not less than seven days after the date of the deposit, or (2) the expiration of a specified period of written notice of not less than seven days"
  {:db/ident :fibo-fbc-pas-caa/TimeDepositOpenAccount,
   :owl/disjointWith :fibo-fbc-pas-caa/TimeCertificateOfDepositAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "time deposit open account",
   :rdfs/subClassOf :fibo-fbc-pas-caa/TimeDepositAccount,
   :skos/definition
   "time deposit account that allows deposits (other than time certificates of deposit) for which there is in force a written contract with the depositor that neither the whole nor any part of such deposit may be withdrawn prior to (1) the date of maturity, which shall be not less than seven days after the date of the deposit, or (2) the expiration of a specified period of written notice of not less than seven days"})

(def TransactionCategory
  "high-level classifier for an individual transaction"
  {:db/ident :fibo-fbc-pas-caa/TransactionCategory,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "transaction category",
   :rdfs/subClassOf [{:owl/onProperty :lcc-cr/classifies,
                      :owl/someValuesFrom
                      :fibo-fbc-pas-caa/IndividualTransaction,
                      :rdf/type :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :lcc-lr/hasTag,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     :lcc-lr/CodeElement
                     :fibo-fnd-arr-cls/Classifier],
   :skos/definition "high-level classifier for an individual transaction",
   :skos/example "credit, debit, fee"})

(def TransactionDate
  "date on which a specific transaction was initiated"
  {:db/ident :fibo-fbc-pas-caa/TransactionDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "transaction date",
   :rdfs/subClassOf :fibo-fnd-dt-fd/ExplicitDate,
   :skos/definition "date on which a specific transaction was initiated"})

(def TransactionDepositAccount
  "deposit account from which the depositor / account holder is permitted to make transfers or withdrawals by negotiable / transferable instruments, payment orders of withdrawal, telephone transfers, and so forth, and that may be accessible via an electronic device such as an automated teller machine (ATM), remote service unit (RSU), mobile device, and by debit card"
  {:cmns-av/explanatoryNote
   "Excluded from transaction accounts are savings deposits (both money market deposit accounts (MMDAs) and other savings deposits), even though such deposits permit some third-party transfers. However, an account that otherwise meets the definition of a savings deposit but that authorizes or permits the depositor to exceed the transfer limitations specified for that account shall be reported as a transaction account.",
   :db/ident :fibo-fbc-pas-caa/TransactionDepositAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "transaction deposit account",
   :rdfs/subClassOf :fibo-fbc-pas-caa/DepositAccount,
   :skos/definition
   "deposit account from which the depositor / account holder is permitted to make transfers or withdrawals by negotiable / transferable instruments, payment orders of withdrawal, telephone transfers, and so forth, and that may be accessible via an electronic device such as an automated teller machine (ATM), remote service unit (RSU), mobile device, and by debit card"})

(def TransactionIdentifier
  "identifier for an individual transaction associated with an account"
  {:db/ident :fibo-fbc-pas-caa/TransactionIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "transaction identifier",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fbc-pas-caa/IndividualTransaction,
                      :owl/onProperty :lcc-lr/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :lcc-lr/Identifier],
   :skos/definition
   "identifier for an individual transaction associated with an account"})

(def TransactionRecord
  "record of transactions associated with an account"
  {:cmns-av/usageNote
   "The date a particular transaction record is closed typically corresponds to (and may precede) the date the account is closed, though in the case of certain accounts, such as a credit card account, if a customer is issued a new account or card number due to loss, fraud, or for some other reason, it is possible that multiple transaction records would be associated with the account. In that case, the close date might correspond to the date that a hold was placed on the original account.",
   :db/ident :fibo-fbc-pas-caa/TransactionRecord,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "transaction record",
   :rdfs/subClassOf
   [{:owl/maxQualifiedCardinality 1,
     :owl/onClass    :fibo-fbc-pas-caa/TransactionRecordIdentifier,
     :owl/onProperty :lcc-lr/isIdentifiedBy,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-fbc-pas-caa/hasTransactionRecordStatus,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-caa/OpenDate,
     :owl/onProperty :fibo-fbc-pas-caa/hasOpenDate,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-caa/CloseDate,
     :owl/onProperty :fibo-fbc-pas-caa/hasCloseDate,
     :rdf/type       :owl/Restriction}
    :fibo-fnd-arr-doc/Record
    :fibo-fbc-fct-ra/Registry
    {:owl/onClass    :fibo-fbc-pas-caa/Account,
     :owl/onProperty :fibo-fbc-pas-caa/appliesToAccount,
     :owl/qualifiedCardinality 1,
     :rdf/type       :owl/Restriction}
    {:owl/onClass    :fibo-fbc-pas-caa/AccountProvider,
     :owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
     :owl/qualifiedCardinality 1,
     :rdf/type       :owl/Restriction}
    :fibo-fnd-dt-fd/DatedStructuredCollection
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-caa/IndividualTransaction,
     :owl/onProperty :fibo-fbc-fct-ra/hasRegistryEntry,
     :rdf/type       :owl/Restriction}],
   :skos/definition "record of transactions associated with an account"})

(def TransactionRecordIdentifier
  "unique identifier for record of transactions"
  {:db/ident :fibo-fbc-pas-caa/TransactionRecordIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "transaction record identifier",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/string,
                      :owl/onProperty  :lcc-lr/hasTag,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onClass    :fibo-fbc-pas-caa/TransactionRecord,
                      :owl/onProperty :lcc-lr/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fct-ra/RegistryIdentifier],
   :skos/definition "unique identifier for record of transactions"})

(def TransactionSubcategory
  "second-level classifier for a transaction, e.g., direct deposit, check, cash advance, withdrawal, payment, purchase, and so forth"
  {:db/ident :fibo-fbc-pas-caa/TransactionSubcategory,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "transaction subcategory",
   :rdfs/subClassOf [{:owl/onProperty :lcc-cr/classifies,
                      :owl/someValuesFrom
                      :fibo-fbc-pas-caa/IndividualTransaction,
                      :rdf/type :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :lcc-lr/hasTag,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     :lcc-lr/CodeElement
                     :fibo-fnd-arr-cls/Classifier],
   :skos/definition
   "second-level classifier for a transaction, e.g., direct deposit, check, cash advance, withdrawal, payment, purchase, and so forth"})

(def appliesToAccount
  "indicates the account to which the transaction record or individual transaction applies"
  {:db/ident :fibo-fbc-pas-caa/appliesToAccount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "applies to account",
   :rdfs/range :fibo-fbc-pas-caa/Account,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/appliesTo,
   :skos/definition
   "indicates the account to which the transaction record or individual transaction applies"})

(def hasBalance
  "relates an account to the net amount of money available in that account"
  {:db/ident :fibo-fbc-pas-caa/hasBalance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "has balance",
   :rdfs/range :fibo-fbc-pas-caa/Balance,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   "relates an account to the net amount of money available in that account"})

(def hasCloseDate
  "relates something to the date that it was closed"
  {:db/ident :fibo-fbc-pas-caa/hasCloseDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "has close date",
   :rdfs/range :fibo-fbc-pas-caa/CloseDate,
   :rdfs/subPropertyOf [:fibo-fnd-dt-fd/hasExplicitDate
                        :fibo-fnd-dt-fd/hasEndDate],
   :skos/definition "relates something to the date that it was closed"})

(def hasCorrespondingAccount
  "relates a credit agreement to an account used as the basis for managing transactions"
  {:db/ident :fibo-fbc-pas-caa/hasCorrespondingAccount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-dae-dbt/CreditAgreement,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "has corresponding account",
   :rdfs/range :fibo-fbc-pas-caa/LoanOrCreditAccount,
   :rdfs/subPropertyOf :fibo-fbc-pas-fpas/relatesTo,
   :skos/definition
   "relates a credit agreement to an account used as the basis for managing transactions"})

(def hasEndingBalance
  "relates an account statement to the amount of money available in that account at the end of the statement period"
  {:db/ident :fibo-fbc-pas-caa/hasEndingBalance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-caa/AccountStatement,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "has ending balance",
   :rdfs/range :fibo-fbc-pas-caa/Balance,
   :rdfs/subPropertyOf :fibo-fbc-pas-caa/hasBalance,
   :skos/definition
   "relates an account statement to the amount of money available in that account at the end of the statement period"})

(def hasOpenDate
  "relates something to the date that it was created"
  {:db/ident :fibo-fbc-pas-caa/hasOpenDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "has open date",
   :rdfs/range :fibo-fbc-pas-caa/OpenDate,
   :rdfs/subPropertyOf [:fibo-fnd-dt-fd/hasStartDate
                        :fibo-fnd-dt-fd/hasExplicitDate],
   :skos/definition "relates something to the date that it was created"})

(def hasPaymentDueDate
  "indicates the date by which payment of some amount must be made to the creditor"
  {:db/ident :fibo-fbc-pas-caa/hasPaymentDueDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "has payment due date",
   :rdfs/range :fibo-fbc-pas-caa/PaymentDueDate,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasExplicitDate,
   :skos/definition
   "indicates the date by which payment of some amount must be made to the creditor"})

(def hasPostingDate
  "indicates the date that the transaction was posted to the account"
  {:db/ident :fibo-fbc-pas-caa/hasPostingDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "has posting date",
   :rdfs/range :fibo-fbc-pas-caa/PostingDate,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasExplicitDate,
   :skos/definition
   "indicates the date that the transaction was posted to the account"})

(def hasPrimaryAccountHolder
  "relates an account to a client or customer that is considered the primary owner of the account"
  {:cmns-av/explanatoryNote
   "Note that for many financial institutions, there must be a client or customer designated as the primary owner. In cases where there is a tax identifier associated with the account, it is that of the primary owner.",
   :cmns-av/synonym "has primary account owner",
   :db/ident :fibo-fbc-pas-caa/hasPrimaryAccountHolder,
   :rdf/type [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/domain :fibo-fbc-pas-caa/CustomerAccount,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "has primary account holder",
   :rdfs/range :fibo-fbc-pas-caa/CustomerAccountHolder,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/isHeldBy,
   :skos/definition
   "relates an account to a client or customer that is considered the primary owner of the account"})

(def hasSecondaryAccountHolder
  "relates an account to a client or customer that is considered a secondary, co-owner of the account"
  {:cmns-av/synonym ["has secondary account owner" "has account co-owner"],
   :db/ident :fibo-fbc-pas-caa/hasSecondaryAccountHolder,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-caa/CustomerAccount,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "has secondary account holder",
   :rdfs/range :fibo-fbc-pas-caa/CustomerAccountHolder,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/isHeldBy,
   :skos/definition
   "relates an account to a client or customer that is considered a secondary, co-owner of the account"})

(def hasStartingBalance
  "relates an account statement to the amount of money available in that account at the beginning of the statement period"
  {:db/ident :fibo-fbc-pas-caa/hasStartingBalance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-caa/AccountStatement,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "has starting balance",
   :rdfs/range :fibo-fbc-pas-caa/Balance,
   :rdfs/subPropertyOf :fibo-fbc-pas-caa/hasBalance,
   :skos/definition
   "relates an account statement to the amount of money available in that account at the beginning of the statement period"})

(def hasTransactionDate
  "indicates the date on which the transaction actually occurred"
  {:db/ident :fibo-fbc-pas-caa/hasTransactionDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "has transaction date",
   :rdfs/range :fibo-fbc-pas-caa/TransactionDate,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasExplicitDate,
   :skos/definition
   "indicates the date on which the transaction actually occurred"})

(def hasTransactionDescription
  "provides a textual description of the transaction"
  {:db/ident :fibo-fbc-pas-caa/hasTransactionDescription,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-pas-caa/IndividualTransaction,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "has transaction description",
   :rdfs/range :xsd/string,
   :skos/definition "provides a textual description of the transaction"})

(def hasTransactionRecordStatus
  "indicates the status of the transaction record"
  {:db/ident :fibo-fbc-pas-caa/hasTransactionRecordStatus,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "has transaction record status",
   :rdfs/range :xsd/string,
   :skos/definition "indicates the status of the transaction record"})

(def involvesMerchant
  "indicates the merchant (seller) involved in the transaction"
  {:db/ident :fibo-fbc-pas-caa/involvesMerchant,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "involves merchant",
   :rdfs/range :fibo-be-fct-fct/Merchant,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/involves,
   :skos/definition
   "indicates the merchant (seller) involved in the transaction"})

(def isLinkedToAccount
  "connects a given customer account to another customer account"
  {:db/ident :fibo-fbc-pas-caa/isLinkedToAccount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-caa/CustomerAccount,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "is linked to account",
   :rdfs/range :fibo-fbc-pas-caa/CustomerAccount,
   :rdfs/subPropertyOf :fibo-fbc-pas-fpas/relatesTo,
   :skos/definition
   "connects a given customer account to another customer account"})

(def isRealizedBy
  "is made concrete by"
  {:db/ident :fibo-fbc-pas-caa/isRealizedBy,
   :owl/inverseOf :fibo-fbc-pas-caa/realizes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "is realized by",
   :skos/definition "is made concrete by"})

(def realizes
  "makes concrete"
  {:db/ident :fibo-fbc-pas-caa/realizes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "realizes",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/appliesTo,
   :skos/definition "makes concrete"})

(def recordsTransaction
  "links an account statement to the individual transactions it documents"
  {:db/ident :fibo-fbc-pas-caa/recordsTransaction,
   :owl/propertyChainAxiom [:fibo-fbc-pas-caa/appliesToAccount
                            :fibo-fnd-arr-doc/hasRecord
                            :fibo-fbc-fct-ra/hasRegistryEntry],
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfs/label "records transaction",
   :skos/definition
   "links an account statement to the individual transactions it documents"})

(def ^{:private true} CreditAgreement
  {:db/ident        :fibo-fbc-dae-dbt/CreditAgreement,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf {:owl/minQualifiedCardinality 0,
                     :owl/onClass    :fibo-fbc-pas-caa/LoanOrCreditAccount,
                     :owl/onProperty :fibo-fbc-pas-caa/hasCorrespondingAccount,
                     :rdf/type       :owl/Restriction}})

(def ^{:private true} ContractualProduct
  {:db/ident        :fibo-fnd-pas-pas/ContractualProduct,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf {:owl/onProperty     :fibo-fbc-pas-caa/isRealizedBy,
                     :owl/someValuesFrom :fibo-fnd-agr-ctr/Contract,
                     :rdf/type           :owl/Restriction}})