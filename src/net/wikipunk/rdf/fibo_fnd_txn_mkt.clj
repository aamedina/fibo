(ns net.wikipunk.rdf.fibo-fnd-txn-mkt
  "Defines the concepts for market transactions in general, on any kind of marketplace. This ontology is not used directly in FIBO content but provides the conceptual underpinnings for securities market transactions."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MarketTransactions/",
   :dcterms/abstract
   "Defines the concepts for market transactions in general, on any kind of marketplace. \n\t\tThis ontology is not used directly in FIBO content but provides the conceptual underpinnings for securities market transactions.",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Informative,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/TransactionsExt/REATransactions/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/PaymentsAndSchedules/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/TransactionsExt/MarketTransactions/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
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
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xs" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MarketTransactions/",
   :rdfa/prefix "fibo-fnd-txn-mkt",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MarketTransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MarketTransactions"},
   :sm/fileAbbreviation "fibo-fnd-txn-mkt"})

(def MarketTransaction
  "Any transaction which defines a supply of some negotiable item in return for some Consideration. The Market Transaction has a Principal and a Counterparty, i.e. it is not symmetrical."
  {:db/ident :fibo-fnd-txn-mkt/MarketTransaction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MarketTransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "market transaction"},
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
    :fibo-fnd-txn-rea/EconomicTransaction],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Any transaction which defines a supply of some negotiable item in return for some Consideration. The Market Transaction has a Principal and a Counterparty, i.e. it is not symmetrical."}})

(def MarketTransactionInvoicingTerms
  {:db/ident :fibo-fnd-txn-mkt/MarketTransactionInvoicingTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MarketTransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "market transaction invoicing terms"},
   :rdfs/subClassOf :fibo-fnd-txn-rea/EconomicContractTermsSet})

(def MarketTransactionPaymentTerms
  {:db/ident :fibo-fnd-txn-mkt/MarketTransactionPaymentTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MarketTransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "market transaction payment terms"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/governs,
                      :owl/someValuesFrom :fibo-fnd-pas-psch/Payment,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-txn-rea/EconomicContractTermsSet]})

(def TransactionCounterparty
  {:db/ident :fibo-fnd-txn-mkt/TransactionCounterparty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MarketTransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transaction counterparty"},
   :rdfs/subClassOf [:fibo-fnd-txn-rea/TransactionParty
                     :fibo-fnd-agr-ctr/Counterparty]})

(def TransactionPrincipal
  {:db/ident :fibo-fnd-txn-mkt/TransactionPrincipal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MarketTransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transaction principal"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-txn-rea/transactsWith,
                      :owl/someValuesFrom
                      :fibo-fnd-txn-mkt/TransactionCounterparty,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-txn-rea/TransactionParty
                     :fibo-fnd-agr-ctr/ContractPrincipal]})

(def consideration
  {:db/ident :fibo-fnd-txn-mkt/consideration,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-txn-mkt/MarketTransaction,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MarketTransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "consideration"},
   :rdfs/range :fibo-fnd-txn-rea/EconomicResource,
   :rdfs/subPropertyOf :fibo-fnd-txn-rea/subject})

(def paymentTerms
  {:db/ident :fibo-fnd-txn-mkt/paymentTerms,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-txn-mkt/MarketTransaction,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MarketTransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "payment terms"},
   :rdfs/range :fibo-fnd-txn-mkt/MarketTransactionPaymentTerms,
   :rdfs/subPropertyOf :fibo-fnd-txn-rea/transactedUnder})