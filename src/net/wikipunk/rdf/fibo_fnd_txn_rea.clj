(ns net.wikipunk.rdf.fibo-fnd-txn-rea
  "This is the core REA-derived ontology for transactions. A transaction is defined as an exchange of commitments between parties. Other aspects of REA such as claims and transaction events (commitment lifecycles) are given in separate ontologies in this module."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :dcterms/abstract
   "This is the core REA-derived ontology for transactions. A transaction is defined as an exchange of commitments between parties. \n\t\tOther aspects of REA such as claims and transaction events (commitment lifecycles) are given in separate ontologies in this module.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Informative,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Agreements/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/LegalCapacity/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/ClientsAndAccounts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/TransactionsExt/REATransactions/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-fbc-fct-ra"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
    "fibo-fbc-pas-caa"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-agr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-law-lcap"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-txn-rea"
    "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfa/prefix "fibo-fnd-txn-rea",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "REATransactions"},
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright "Copyright (c) 2013-2021 EDM Council, Inc.",
   :sm/fileAbbreviation "fibo-fnd-txn-rea"})

(def ContractualEconomicAgreement
  "An economic agreement forming part of a transaction, which has contractual standing as evidenced by a contract between the two parties to the Agreement."
  {:db/ident :fibo-fnd-txn-rea/ContractualEconomicAgreement,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The REA Economic Agreement may or may not be between two distinct legal persons, as the REA scope includes transactions within organizations. For REA based transaction models which are between separate legal entities or persons, the form of agreement in force is this Contractual Economic Agreement, that is the agreement, backed by a written or implied contract, which is in force between the parties to this agreement."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "contractual economic agreement"},
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-rel-rel/confers,
     :owl/someValuesFrom :fibo-fnd-agr-ctr/ContractualCommitment,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-agr-ctr/hasContractParty,
     :owl/someValuesFrom :fibo-fnd-txn-rea/ContractualTransactionParty,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-txn-rea/EconomicAgreement
    :fibo-fnd-agr-ctr/Contract],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An economic agreement forming part of a transaction, which has contractual standing as evidenced by a contract between the two parties to the Agreement."}})

(def ContractualTransaction
  "An economic transaction which has some contractual basis."
  {:db/ident :fibo-fnd-txn-rea/ContractualTransaction,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This is distinct from a transaction between business units within an enterprise. This is the usual sense of \"Transaction\" and forms the basis for all securities and derivatives transactions, while the parent term \"Economic Transaction\" may also be used to define internal transactions and transactions that have no legal or contractual basis."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "contractual transaction"},
   :rdfs/subClassOf :fibo-fnd-txn-rea/EconomicTransaction,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "An economic transaction which has some contractual basis."}})

(def ContractualTransactionParty
  "That which is party to a transaction which has contractual standing."
  {:db/ident :fibo-fnd-txn-rea/ContractualTransactionParty,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "In REA, transactions may include those which are not between legal entities,such as for example internal transactions within a business and between business units. This term Contractual Transaction Party forms the basis for all party definitions for transactions which have some formal contractual basis as being between discrete legal entities (legal persons or other contractually capable entities e.g. non incorporated entities). This is the basis for all derivatives transactions, securities market transactions and so on."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "contractual transaction party"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                      :owl/someValuesFrom :fibo-be-le-lp/LegalPerson,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-txn-rea/TransactionParty
                     :fibo-fnd-agr-ctr/ContractParty],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "That which is party to a transaction which has contractual standing."}})

(def CoveredTransaction
  "A transaction covered by some Master Agreement."
  {:db/ident :fibo-fnd-txn-rea/CoveredTransaction,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The Master Agreement sets out the terms and conditions under which these transactions are to take place between the parties. These are Over the Counter transactions, including OTC Derivatives."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "covered transaction"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/isGovernedBy,
                      :owl/someValuesFrom :fibo-fnd-agr-ctr/MasterAgreement,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-txn-rea/ContractualTransaction],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A transaction covered by some Master Agreement."}})

(def DischargingEvent
  {:db/ident :fibo-fnd-txn-rea/DischargingEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "discharging event"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-txn-rea/triggers,
                      :owl/someValuesFrom :fibo-fnd-txn-rea/LedgerEntry,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-txn-rea/terminates,
                      :owl/someValuesFrom :fibo-fnd-txn-rea/EconomicCommitment,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-txn-rea/TransactionBusinessEvent]})

(def EconomicAgreement
  {:db/ident :fibo-fnd-txn-rea/EconomicAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "economic agreement"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/governs,
                      :owl/someValuesFrom :fibo-fnd-txn-rea/EconomicTransaction,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/confers,
                      :owl/someValuesFrom :fibo-fnd-txn-rea/EconomicCommitment,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-pty-pty/hasPartyInRole,
                      :owl/someValuesFrom :fibo-fnd-txn-rea/TransactionParty,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-agr-ctr/MutualContractualAgreement]})

(def EconomicCommitment
  "Some Commitment which forms part of the subject of some Transaction, being an undertaking by one or other of the parties to the transaction, extended to the other party to that same transaction."
  {:db/ident :fibo-fnd-txn-rea/EconomicCommitment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "economic commitment"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-txn-rea/madeBy,
                      :owl/someValuesFrom :fibo-fnd-txn-rea/TransactionParty,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/isConferredBy,
                      :owl/someValuesFrom :fibo-fnd-txn-rea/EconomicAgreement,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-agr-agr/MutualCommitment],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Some Commitment which forms part of the subject of some Transaction, being an undertaking by one or other of the parties to the transaction, extended to the other party to that same transaction."}})

(def EconomicContract
  "A contract relating to and governing an economic transaction between two parties."
  {:db/ident :fibo-fnd-txn-rea/EconomicContract,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "economic contract"},
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-rel-rel/embodies,
     :owl/someValuesFrom :fibo-fnd-txn-rea/ContractualEconomicAgreement,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-agr-ctr/hasContractualElement,
     :owl/someValuesFrom :fibo-fnd-txn-rea/EconomicContractTermsSet,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-agr-ctr/MutualContractualAgreement],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A contract relating to and governing an economic transaction between two parties."},
   :skos/editorialNote {:rdf/language "en",
                        :rdf/value    "From REA ontology."}})

(def EconomicContractTermsSet
  "Terms underlying the contract for a transaction."
  {:db/ident :fibo-fnd-txn-rea/EconomicContractTermsSet,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "economic contract commitment"},
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-txn-rea/setsOutContractualEconomicCommitment,
     :owl/someValuesFrom :fibo-fnd-agr-ctr/ContractualCommitment,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-agr-ctr/ContractualCommitment],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Terms underlying the contract for a transaction."}})

(def EconomicResource
  "Anything that can bought sold or exchanged."
  {:db/ident :fibo-fnd-txn-rea/EconomicResource,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "economic resource"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-txn-rea/takesMaterialForm,
                      :owl/someValuesFrom :owl/Thing,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-txn-rea/definedInContextOf,
                      :owl/someValuesFrom :fibo-fnd-txn-rea/EconomicTransaction,
                      :rdf/type           :owl/Restriction}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "Anything that can bought sold or exchanged."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Formerly labeled as Negotiable Thing. Changed to REA terminology with no effect on meaning. Note that this is a relative thing - the thing which is itself the economic resource, is some good or some service (i.e. some physical thing or some event/activity) which can be framed as an economic resource in the context of exchanging it for some other economic resource. Scope Note: Economic Resource may also define things which are not exchanged but are defined as resources in some other context, for example Capital is a kind of economic resource."}})

(def EconomicTransaction
  "Some exchange of some items of economic value between two parties (economic agents)."
  {:db/ident :fibo-fnd-txn-rea/EconomicTransaction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "economic transaction"},
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-txn-rea/transactionEmbodiesEconomicAgreement,
     :owl/someValuesFrom :fibo-fnd-txn-rea/EconomicAgreement,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-txn-rea/transactedUnder,
     :owl/someValuesFrom :fibo-fnd-txn-rea/EconomicContractTermsSet,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 2,
     :owl/onClass    :fibo-fnd-txn-rea/EconomicResource,
     :owl/onProperty :fibo-fnd-txn-rea/subject,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Some exchange of some items of economic value between two parties (economic agents)."}})

(def LedgerEntry
  {:db/ident :fibo-fnd-txn-rea/LedgerEntry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ledger entry"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-fct-ra/isRegisteredIn,
                      :owl/someValuesFrom :fibo-fbc-pas-caa/LedgerAccount,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fnd-acc-cur/hasMonetaryAmount,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fbc-pas-caa/TransactionDate,
                      :owl/onProperty :fibo-fbc-pas-caa/hasTransactionDate,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fbc-pas-caa/PostingDate,
                      :owl/onProperty :fibo-fbc-pas-caa/hasPostingDate,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-dt-fd/DatedCollectionConstituent
                     :fibo-fbc-fct-ra/RegistryEntry]})

(def REAClaim
  "Some imbalance, at a given point in time, between the respective rights and obligations of two parties with respect to one another."
  {:db/ident :fibo-fnd-txn-rea/REAClaim,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "r e a claim"},
   :rdfs/subClassOf {:owl/onProperty     :fibo-fnd-txn-rea/isImbalanceIn,
                     :owl/someValuesFrom :fibo-fnd-law-lcap/LegalConstruct,
                     :rdf/type           :owl/Restriction},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Some imbalance, at a given point in time, between the respective rights and obligations of two parties with respect to one another."}})

(def Revaluation
  {:db/ident :fibo-fnd-txn-rea/Revaluation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "revaluation"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-txn-rea/triggers,
                      :owl/someValuesFrom :fibo-fnd-txn-rea/LedgerEntry,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-txn-rea/TransactionBusinessEvent]})

(def TransactionBusinessEvent
  "Occurrence in time that partners to a business transaction wish to monitor or control."
  {:db/ident :fibo-fnd-txn-rea/TransactionBusinessEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transaction business event"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Occurrence in time that partners to a business transaction wish to monitor or control."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Term derived from REA as expressed in ISO 15944-4 Additional notes in ISO 15944-4 itself: NOTE 1 Business events are the workflow tasks that business partners need to accomplish to complete a business transaction among themselves. As business events occur, they cause a business transaction to move through its various phases of planning, identification, negotiation, actualization and post-actualization. NOTE 2 Occurrences in time can either - be internal as mutually agreed to among the parties to a business transaction; and/or, - reference some common publicly available and recognized date/time referencing schema (e.g. one based on using ISO 8601 and/or ISO 19135)."}})

(def TransactionEvent
  "The event component of a transaction"
  {:db/ident :fibo-fnd-txn-rea/TransactionEvent,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This describes an event. The event may be delivery of something or settlement of monies in payment for something delivered. A Transaction Event will have terms describing the commitment embodied in that side of that transaction."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transaction event"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-txn-rea/hasStart,
                      :owl/someValuesFrom
                      :fibo-fnd-txn-rea/TransactionUndertaking,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-txn-rea/hasEnd,
                      :owl/someValuesFrom :fibo-fnd-txn-rea/DischargingEvent,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-txn-rea/hasCorresponding,
                      :owl/someValuesFrom :fibo-fnd-txn-rea/TransactionEvent,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/embodies,
                      :owl/someValuesFrom :fibo-fnd-txn-rea/EconomicCommitment,
                      :rdf/type           :owl/Restriction}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The event component of a transaction"}})

(def TransactionEventAspect
  "A transaction side as seen from the perspective of one of the parties to the transaction."
  {:db/ident :fibo-fnd-txn-rea/TransactionEventAspect,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This describes one side of one transaction event. The event may be delivery of something or settlement of monies in payment for something delivered. A Transaction Event Side shows that side of that transaction from the perspective of one or other party."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transaction event aspect"},
   :rdfs/subClassOf
   {:owl/onProperty     :fibo-fnd-txn-rea/hasCorrespondingAlternativeAspect,
    :owl/someValuesFrom :fibo-fnd-txn-rea/TransactionEventAspect,
    :rdf/type           :owl/Restriction},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A transaction side as seen from the perspective of one of the parties to the transaction."}})

(def TransactionParty
  "Some entity which takes part in some transaction by receiving and/or parting with some item of economic value or some payment or both."
  {:db/ident :fibo-fnd-txn-rea/TransactionParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transaction party"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-txn-rea/transactsWith,
                      :owl/someValuesFrom :fibo-fnd-txn-rea/TransactionParty,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Some entity which takes part in some transaction by receiving and/or parting with some item of economic value or some payment or both."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Referred to in REA as Economic Agent (in the context of the economic event, known here as transaction)."}})

(def TransactionUndertaking
  "A contractually defined and established commitment to deliver some goods, perform some service or make some payment in cash or in kind."
  {:db/ident :fibo-fnd-txn-rea/TransactionUndertaking,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transaction undertaking"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-txn-rea/givesRiseTo,
                      :owl/someValuesFrom :fibo-fnd-txn-rea/EconomicCommitment,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-txn-rea/UndertakingEvent],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A contractually defined and established commitment to deliver some goods, perform some service or make some payment in cash or in kind."},
   :skos/editorialNote {:rdf/language "en",
                        :rdf/value    "From REA ontology."}})

(def Undertaking
  "Some undertaking to act."
  {:db/ident :fibo-fnd-txn-rea/Undertaking,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This could be an undertaking to deliver something, to do something and so on. These correspond to negative and positive pledges in the contract."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "undertaking"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-agr-ctr/hasContractParty,
                      :owl/someValuesFrom :fibo-fnd-agr-ctr/ContractParty,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-txn-rea/givesRiseTo,
                      :owl/someValuesFrom :fibo-fnd-agr-agr/MutualCommitment,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-txn-rea/isUndertakingTo,
                      :owl/someValuesFrom
                      :fibo-fnd-law-lcap/ContingentObligation,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-txn-rea/isMadeAsPartOf,
                      :owl/someValuesFrom :fibo-fnd-agr-agr/Agreement,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-txn-rea/bestows,
                      :owl/someValuesFrom :fibo-fnd-law-lcap/ContingentRight,
                      :rdf/type           :owl/Restriction}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Some undertaking to act."}})

(def UndertakingEvent
  "Something which occurs at a point in time, at which a party makes some commitment to some other party."
  {:db/ident :fibo-fnd-txn-rea/UndertakingEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "undertaking event"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-txn-rea/triggers,
                      :owl/someValuesFrom :fibo-fnd-txn-rea/LedgerEntry,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-txn-rea/Undertaking
                     :fibo-fnd-txn-rea/TransactionBusinessEvent],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Something which occurs at a point in time, at which a party makes some commitment to some other party."}})

(def bestows
  {:db/ident :fibo-fnd-txn-rea/bestows,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-txn-rea/Undertaking,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bestows"},
   :rdfs/range :fibo-fnd-law-lcap/ContingentRight})

(def definedInContextOf
  {:db/ident :fibo-fnd-txn-rea/definedInContextOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label "defined in context of"})

(def givesRiseTo
  {:db/ident :fibo-fnd-txn-rea/givesRiseTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-txn-rea/Undertaking,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "gives rise to"},
   :rdfs/range :fibo-fnd-agr-agr/MutualCommitment})

(def hasCorresponding
  {:db/ident :fibo-fnd-txn-rea/hasCorresponding,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-txn-rea/TransactionEvent,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has corresponding"},
   :rdfs/range :fibo-fnd-txn-rea/TransactionEvent})

(def hasCorrespondingAlternativeAspect
  {:db/ident :fibo-fnd-txn-rea/hasCorrespondingAlternativeAspect,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-txn-rea/TransactionEventAspect,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has corresponding alternative aspect"},
   :rdfs/range :fibo-fnd-txn-rea/TransactionEventAspect})

(def hasEnd
  {:db/ident :fibo-fnd-txn-rea/hasEnd,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has end"},
   :rdfs/range :fibo-fnd-txn-rea/DischargingEvent})

(def hasPerspective
  {:db/ident :fibo-fnd-txn-rea/hasPerspective,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-txn-rea/TransactionEvent,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has perspective"},
   :rdfs/range :fibo-fnd-txn-rea/TransactionEventAspect})

(def hasStart
  {:db/ident :fibo-fnd-txn-rea/hasStart,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has start"},
   :rdfs/range :fibo-fnd-txn-rea/TransactionUndertaking})

(def hasTransactionComponent
  {:db/ident :fibo-fnd-txn-rea/hasTransactionComponent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-txn-rea/EconomicTransaction,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has transaction component"},
   :rdfs/range :fibo-fnd-txn-rea/TransactionEvent})

(def hasTransactionParty
  {:db/ident :fibo-fnd-txn-rea/hasTransactionParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-txn-rea/EconomicTransaction,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has transaction party"},
   :rdfs/range :fibo-fnd-txn-rea/TransactionParty})

(def isImbalanceIn
  "The imbalance in Obligations or Rights (depending on the viewpoint from which it is described) between one party and another."
  {:db/ident :fibo-fnd-txn-rea/isImbalanceIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-txn-rea/REAClaim,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is imbalance in"},
   :rdfs/range :fibo-fnd-law-lcap/LegalConstruct,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The imbalance in Obligations or Rights (depending on the viewpoint from which it is described) between one party and another."}})

(def isMadeAsPartOf
  {:db/ident :fibo-fnd-txn-rea/isMadeAsPartOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-txn-rea/Undertaking,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is made as part of"},
   :rdfs/range :fibo-fnd-agr-agr/Agreement})

(def isUndertakingTo
  {:db/ident :fibo-fnd-txn-rea/isUndertakingTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-txn-rea/Undertaking,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is undertaking to"},
   :rdfs/range :fibo-fnd-law-lcap/ContingentObligation})

(def madeBy
  {:db/ident :fibo-fnd-txn-rea/madeBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "made by"},
   :rdfs/range :fibo-fnd-txn-rea/TransactionParty})

(def setsOutContractualEconomicCommitment
  "The economic commitment set out in the terms to the contract which formalizes the agreement to the transaction."
  {:db/ident :fibo-fnd-txn-rea/setsOutContractualEconomicCommitment,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-txn-rea/EconomicContractTermsSet,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "sets out contractual economic commitment"},
   :rdfs/range :fibo-fnd-agr-ctr/ContractualCommitment,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The economic commitment set out in the terms to the contract which formalizes the agreement to the transaction."}})

(def subject
  {:db/ident :fibo-fnd-txn-rea/subject,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-txn-rea/EconomicTransaction,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subject"},
   :rdfs/range :fibo-fnd-txn-rea/EconomicResource})

(def takesMaterialForm
  "The material form of the Economic Resource; that is the thing which is recognized as being an Economic Resource as defined here, Editorial Note: This would usually be some Independent Thing. However it is conceivable that the existence of some relative thing, for example an asset, may itself be regarded and defined as a resource, over and above the role or context already defined for it. Therefore this identity relationship has a range of Thing, but is modeled as a sub property of \"identity\" to make this conclusion explicit. Editorial Note: This is a relationship with the sense that some relative thing takes the form of something, but is distinct from the similar concept as applied to Asset, in which the thing which takes the form of some asset is owned by someone. Here it is a resource, irrespective of whether or by whom it is owned. Labeled as \"takes material form\" to disambiguate these two relationships."
  {:db/ident :fibo-fnd-txn-rea/takesMaterialForm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-txn-rea/EconomicResource,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "takes material form"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The material form of the Economic Resource; that is the thing which is recognized as being an Economic Resource as defined here, Editorial Note: This would usually be some Independent Thing. However it is conceivable that the existence of some relative thing, for example an asset, may itself be regarded and defined as a resource, over and above the role or context already defined for it. Therefore this identity relationship has a range of Thing, but is modeled as a sub property of \"identity\" to make this conclusion explicit. Editorial Note: This is a relationship with the sense that some relative thing takes the form of something, but is distinct from the similar concept as applied to Asset, in which the thing which takes the form of some asset is owned by someone. Here it is a resource, irrespective of whether or by whom it is owned. Labeled as \"takes material form\" to disambiguate these two relationships."}})

(def terminates
  {:db/ident :fibo-fnd-txn-rea/terminates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-txn-rea/DischargingEvent,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "terminates"},
   :rdfs/range :fibo-fnd-txn-rea/EconomicCommitment})

(def transactedUnder
  {:db/ident :fibo-fnd-txn-rea/transactedUnder,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-txn-rea/EconomicTransaction,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transacted under"},
   :rdfs/range :fibo-fnd-txn-rea/EconomicContractTermsSet})

(def transactionEmbodiesEconomicAgreement
  {:db/ident :fibo-fnd-txn-rea/transactionEmbodiesEconomicAgreement,
   :owl/inverseOf :fibo-fnd-rel-rel/governs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-txn-rea/EconomicTransaction,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transaction embodies economic agreement"},
   :rdfs/range :fibo-fnd-txn-rea/EconomicAgreement})

(def transactionEventFollowsBusinessProcess
  {:db/ident :fibo-fnd-txn-rea/transactionEventFollowsBusinessProcess,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-txn-rea/TransactionEvent,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transaction event follows business process"}})

(def transactsWith
  {:db/ident :fibo-fnd-txn-rea/transactsWith,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-txn-rea/TransactionParty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transacts with"},
   :rdfs/range :fibo-fnd-txn-rea/TransactionParty})

(def triggers
  {:db/ident :fibo-fnd-txn-rea/triggers,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-txn-rea/TransactionBusinessEvent,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "triggers"},
   :rdfs/range :fibo-fnd-txn-rea/LedgerEntry})