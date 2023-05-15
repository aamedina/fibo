(ns net.wikipunk.rdf.fibo-fnd-txn-mkt
  "Defines the concepts for market transactions in general, on any kind of marketplace. This ontology is not used directly in FIBO content but provides the conceptual underpinnings for securities market transactions."
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MarketTransactions/",
   :dcterms/abstract
   "Defines the concepts for market transactions in general, on any kind of marketplace. \n\t\tThis ontology is not used directly in FIBO content but provides the conceptual underpinnings for securities market transactions.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Informative,
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/TransactionsExt/REATransactions/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/PaymentsAndSchedules/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/TransactionsExt/MarketTransactions/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-pas-psch"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-txn-mkt"
    "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MarketTransactions/",
    "fibo-fnd-txn-rea"
    "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-txn-mkt",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MarketTransactions/",
   :rdfs/label #voc/lstr "Market Transactions Ontology@en"})

(def MarketTransaction
  "Any transaction which defines a supply of some negotiable item in return for some Consideration. The Market Transaction has a Principal and a Counterparty, i.e. it is not symmetrical."
  {:db/ident :fibo-fnd-txn-mkt/MarketTransaction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MarketTransactions/",
   :rdfs/label #voc/lstr "market transaction@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-txn-mkt/paymentTerms,
     :owl/someValuesFrom :fibo-fnd-txn-mkt/MarketTransactionPaymentTerms,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-txn-mkt/consideration,
     :owl/someValuesFrom :fibo-fnd-txn-rea/EconomicResource,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-agr-ctr/hasPrincipalParty,
     :owl/someValuesFrom :fibo-fnd-txn-mkt/TransactionPrincipal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-agr-ctr/hasCounterparty,
     :owl/someValuesFrom :fibo-fnd-txn-mkt/TransactionCounterparty,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-txn-rea/EconomicTransaction
    :fibo-fnd-txn-mkt/MarketTransaction],
   :skos/definition
   #voc/lstr
    "Any transaction which defines a supply of some negotiable item in return for some Consideration. The Market Transaction has a Principal and a Counterparty, i.e. it is not symmetrical.@en"})

(def MarketTransactionInvoicingTerms
  "market transaction invoicing terms"
  {:db/ident :fibo-fnd-txn-mkt/MarketTransactionInvoicingTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MarketTransactions/",
   :rdfs/label #voc/lstr "market transaction invoicing terms@en",
   :rdfs/subClassOf [:fibo-fnd-txn-rea/EconomicContractTermsSet
                     :fibo-fnd-txn-mkt/MarketTransactionInvoicingTerms]})

(def MarketTransactionPaymentTerms
  "market transaction payment terms"
  {:db/ident :fibo-fnd-txn-mkt/MarketTransactionPaymentTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MarketTransactions/",
   :rdfs/label #voc/lstr "market transaction payment terms@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/governs,
                      :owl/someValuesFrom :fibo-fnd-pas-psch/Payment,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-txn-rea/EconomicContractTermsSet
                     :fibo-fnd-txn-mkt/MarketTransactionPaymentTerms]})

(def TransactionCounterparty
  "transaction counterparty"
  {:db/ident :fibo-fnd-txn-mkt/TransactionCounterparty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MarketTransactions/",
   :rdfs/label #voc/lstr "transaction counterparty@en",
   :rdfs/subClassOf [:fibo-fnd-txn-rea/TransactionParty
                     :fibo-fnd-agr-ctr/Counterparty
                     :fibo-fnd-txn-mkt/TransactionCounterparty]})

(def TransactionPrincipal
  "transaction principal"
  {:db/ident :fibo-fnd-txn-mkt/TransactionPrincipal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MarketTransactions/",
   :rdfs/label #voc/lstr "transaction principal@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-txn-rea/transactsWith,
                      :owl/someValuesFrom
                      :fibo-fnd-txn-mkt/TransactionCounterparty,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-txn-rea/TransactionParty
                     :fibo-fnd-agr-ctr/ContractPrincipal
                     :fibo-fnd-txn-mkt/TransactionPrincipal]})

(def consideration
  "consideration"
  {:db/ident :fibo-fnd-txn-mkt/consideration,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-txn-mkt/MarketTransaction,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MarketTransactions/",
   :rdfs/label #voc/lstr "consideration@en",
   :rdfs/range :fibo-fnd-txn-rea/EconomicResource,
   :rdfs/subPropertyOf [:fibo-fnd-txn-rea/subject
                        :fibo-fnd-txn-mkt/consideration]})

(def paymentTerms
  "payment terms"
  {:db/ident :fibo-fnd-txn-mkt/paymentTerms,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-txn-mkt/MarketTransaction,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MarketTransactions/",
   :rdfs/label #voc/lstr "payment terms@en",
   :rdfs/range :fibo-fnd-txn-mkt/MarketTransactionPaymentTerms,
   :rdfs/subPropertyOf [:fibo-fnd-txn-rea/transactedUnder
                        :fibo-fnd-txn-mkt/paymentTerms]})