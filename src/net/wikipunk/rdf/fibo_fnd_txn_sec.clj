(ns net.wikipunk.rdf.fibo-fnd-txn-sec
  "Describes the basic concepts for securities transactions, as an extension of market transactions more generally. Incudes types of securities transactions, parties to the transaction, settlement and the covering contract for the transaction. This ontology would form the basis for more detailed securities transaction concepts that would ideally be derived from the FIX standard."
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/SecuritiesTransactions/",
   :dcterms/abstract
   "Describes the basic concepts for securities transactions, as an extension of market transactions more generally. Incudes types of securities transactions, parties to the transaction, settlement and the covering contract for the transaction. This ontology would form the basis for more detailed securities transaction concepts that would ideally be derived from the FIX standard.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Informative,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/TransactionsExt/MarketTransactions/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/TransactionsExt/REATransactions/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/TransactionsExt/SecuritiesTransactions/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-txn-mkt"
    "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MarketTransactions/",
    "fibo-fnd-txn-rea"
    "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
    "fibo-fnd-txn-sec"
    "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/SecuritiesTransactions/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-txn-sec",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/SecuritiesTransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Securities Transactions Ontology"}})

(def FinancialPrimaryMarketTransaction
  "financial primary market transaction"
  {:db/ident :fibo-fnd-txn-sec/FinancialPrimaryMarketTransaction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/SecuritiesTransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "financial primary market transaction"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-txn-sec/follows,
                      :owl/someValuesFrom :fibo-fnd-txn-sec/SettlementProcess,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-txn-rea/ContractualTransaction
                     :fibo-fnd-txn-mkt/MarketTransaction]})

(def FinancialSecuritiesSecondaryMarketTransaction
  "A Transaction in which some negotiable security is provided in exchange for some Consideration."
  {:db/ident :fibo-fnd-txn-sec/FinancialSecuritiesSecondaryMarketTransaction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/SecuritiesTransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value "financial securities secondary market transaction"},
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-txn-rea/subject,
     :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-txn-mkt/MarketTransaction
    {:owl/onProperty     :fibo-fnd-agr-ctr/hasCounterparty,
     :owl/someValuesFrom :fibo-fnd-txn-sec/SecuritiesTransactionCounterparty,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-agr-ctr/hasPrincipalParty,
     :owl/someValuesFrom :fibo-fnd-txn-sec/SecuritiesTransactionPrincipal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-txn-mkt/consideration,
     :owl/someValuesFrom {:owl/unionOf [:fibo-fnd-acc-cur/AmountOfMoney
                                        :fibo-fbc-fi-fi/Security],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    :fibo-fnd-txn-rea/ContractualTransaction
    {:owl/onProperty     :fibo-fnd-txn-sec/embodies,
     :owl/someValuesFrom :fibo-fnd-txn-sec/SecuritiesTransactionContract,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A Transaction in which some negotiable security is provided in exchange for some Consideration."}})

(def SecuritiesTransactionContract
  "The contract (written or implied) which governs the transaction of securities in the secondary Market."
  {:db/ident :fibo-fnd-txn-sec/SecuritiesTransactionContract,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/SecuritiesTransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "securities transaction contract"},
   :rdfs/subClassOf
   [{:owl/onProperty :fibo-fnd-txn-sec/governs,
     :owl/someValuesFrom
     :fibo-fnd-txn-sec/FinancialSecuritiesSecondaryMarketTransaction,
     :rdf/type :owl/Restriction}
    :fibo-fnd-txn-rea/EconomicContract],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The contract (written or implied) which governs the transaction of securities in the secondary Market."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "This is in line with the REA Ontology in which all Transactions are embodied in some Contract, whether written or implied. forms part of future \"Transaction\" model to be reviewed, but is ancestral to Options contract and transactions model."}})

(def SecuritiesTransactionCounterparty
  "securities transaction counterparty"
  {:db/ident :fibo-fnd-txn-sec/SecuritiesTransactionCounterparty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/SecuritiesTransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "securities transaction counterparty"},
   :rdfs/subClassOf :fibo-fnd-txn-mkt/TransactionCounterparty})

(def SecuritiesTransactionPrincipal
  "securities transaction principal"
  {:db/ident :fibo-fnd-txn-sec/SecuritiesTransactionPrincipal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/SecuritiesTransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "securities transaction principal"},
   :rdfs/subClassOf :fibo-fnd-txn-mkt/TransactionPrincipal})

(def SettlementProcess
  "settlement process"
  {:db/ident :fibo-fnd-txn-sec/SettlementProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/SecuritiesTransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "settlement process"}})

(def WhenIssuedTransaction
  "Trading in securities ahead of them being traded."
  {:db/ident :fibo-fnd-txn-sec/WhenIssuedTransaction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/SecuritiesTransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "when issued transaction"},
   :rdfs/subClassOf
   :fibo-fnd-txn-sec/FinancialSecuritiesSecondaryMarketTransaction,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Trading in securities ahead of them being traded."}})

(def embodies
  "embodies"
  {:db/ident :fibo-fnd-txn-sec/embodies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-txn-sec/FinancialSecuritiesSecondaryMarketTransaction,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/SecuritiesTransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "embodies"},
   :rdfs/range :fibo-fnd-txn-sec/SecuritiesTransactionContract,
   :rdfs/subPropertyOf :fibo-fnd-txn-rea/transactionEmbodiesEconomicAgreement})

(def follows
  "follows"
  {:db/ident :fibo-fnd-txn-sec/follows,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-txn-sec/FinancialPrimaryMarketTransaction,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/SecuritiesTransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "follows"},
   :rdfs/range :fibo-fnd-txn-sec/SettlementProcess,
   :rdfs/subPropertyOf
   :fibo-fnd-txn-rea/transactionEventFollowsBusinessProcess})

(def governs
  "governs"
  {:db/ident :fibo-fnd-txn-sec/governs,
   :owl/inverseOf :fibo-fnd-txn-sec/embodies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-txn-sec/SecuritiesTransactionContract,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/SecuritiesTransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "governs"},
   :rdfs/range :fibo-fnd-txn-sec/FinancialSecuritiesSecondaryMarketTransaction,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/governs})

(def offsetForWIIssueDate
  "Used to calculate actual settlement date from given WI issue date. If issue date is unknwn, this determines how many days form the issue date it's going to settle."
  {:db/ident :fibo-fnd-txn-sec/offsetForWIIssueDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fnd-txn-sec/WhenIssuedTransaction,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/SecuritiesTransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "offset for w i issue date"},
   :rdfs/range :xsd/integer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Used to calculate actual settlement date from given WI issue date. If issue date is unknwn, this determines how many days form the issue date it's going to settle."}})