(ns net.wikipunk.rdf.fibo-fnd-pas-psch
  "This ontology defines basic concepts such as payment, payee, payer, and payment schedule, extending the scheduling concepts from the Dates and Times module, among others."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
   :dcterms/abstract
   "This ontology defines basic concepts such as payment, payee, payer, and payment schedule, extending the scheduling concepts from the Dates and Times module, among others.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/ProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Agreements/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Arrangements/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/LegalCapacity/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/Occurrences/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/PaymentsAndSchedules/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-agr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-arr-arr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-dt-oc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/",
    "fibo-fnd-law-lcap"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/",
    "fibo-fnd-pas-pas"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/",
    "fibo-fnd-pas-psch"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
   :rdfa/prefix "fibo-fnd-pas-psch",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
   :rdfs/label "Payments and Schedules Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules.rdf version of this ontology was modified to revise payments to better support loan requirements and eliminate duplication of concepts in LCC."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules.rdf version of this ontology was modified to eliminate deprecated elements."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules.rdf version of this ontology was modified to clean up the definition and augment the restrictions on payment obligation to include the payee."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules.rdf version of this ontology was modified to fix spelling errors."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules.rdf version of this ontology was modified to eliminate remaining circular references."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules.rdf version of this ontology was modified per the FIBO 2.0 RFC to make hasPaymentAmount a child of hasMonetaryAmount and move hasObligation and isObligationOf to Agreements."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.1 RTF report to replace MoneyAmount with MonetaryAmount."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2013-2022 EDM Council, Inc."
                  "Copyright (c) 2013-2022 Object Management Group, Inc."],
   :sm/dependsOn
   ["https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/LCC/"],
   :sm/fileAbbreviation "fibo-fnd-pas-psch",
   :sm/filename "PaymentsAndSchedules.rdf"})

(def Payee
  "a party to whom a debt should be paid, or to whose order a bill of exchange, note, or check is made payable, or who receives or will receive a payment from a payer in partial or complete fulfillment of an obligation"
  {:db/ident :fibo-fnd-pas-psch/Payee,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
   :rdfs/label "payee",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
                      :owl/someValuesFrom {:owl/onProperty
                                           :fibo-fnd-pty-pty/isAPartyTo,
                                           :owl/someValuesFrom
                                           :fibo-fnd-pas-psch/PaymentObligation,
                                           :rdf/type :owl/Restriction},
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-agr-agr/Obligee],
   :skos/definition
   "a party to whom a debt should be paid, or to whose order a bill of exchange, note, or check is made payable, or who receives or will receive a payment from a payer in partial or complete fulfillment of an obligation"})

(def Payer
  "a party who pays a bill or fees, or who makes payments to a payee in partial or complete fulfillment of an obligation"
  {:db/ident :fibo-fnd-pas-psch/Payer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
   :rdfs/label "payer",
   :rdfs/subClassOf [{:owl/allValuesFrom :fibo-fnd-pas-psch/PaymentObligation,
                      :owl/onProperty    :fibo-fnd-agr-agr/hasObligation,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-agr-agr/Obligor],
   :skos/definition
   "a party who pays a bill or fees, or who makes payments to a payee in partial or complete fulfillment of an obligation"})

(def Payment
  "delivery of money in fulfillment of an obligation, such as to satisfy a claim or debt"
  {:db/ident :fibo-fnd-pas-psch/Payment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
   :rdfs/label "payment",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-pas-psch/hasPaymentAmount,
                      :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryAmount,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence],
   :skos/definition
   "delivery of money in fulfillment of an obligation, such as to satisfy a claim or debt"})

(def PaymentEvent
  "an event that involves delivery of money in fulfillment of an obligation"
  {:db/ident :fibo-fnd-pas-psch/PaymentEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
   :rdfs/label "payment event",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fnd-pas-psch/PaymentObligation,
                      :owl/onProperty :fibo-fnd-rel-rel/appliesTo,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-pas-psch/Payment,
                      :owl/onProperty :fibo-fnd-rel-rel/involves,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-pas-pas/TransactionEvent],
   :skos/definition
   "an event that involves delivery of money in fulfillment of an obligation"})

(def PaymentObligation
  "legally enforceable duty to pay a sum of money according to the terms stated in a contract"
  {:db/ident :fibo-fnd-pas-psch/PaymentObligation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
   :rdfs/label "payment obligation",
   :rdfs/subClassOf [:fibo-fnd-agr-agr/Commitment
                     {:owl/onProperty     :fibo-fnd-agr-agr/isObligationOf,
                      :owl/someValuesFrom :fibo-fnd-pas-psch/Payer,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :fibo-fnd-agr-ctr/Contract,
                      :owl/onProperty    :fibo-fnd-rel-rel/isConferredBy,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-law-lcap/Duty
                     {:owl/onProperty     :fibo-fnd-pty-pty/hasPartyInRole,
                      :owl/someValuesFrom :fibo-fnd-pas-psch/Payee,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "legally enforceable duty to pay a sum of money according to the terms stated in a contract",
   :skos/example
   "the duty of a borrower to repay a loan, related to the legal right of a lender to enforce payment"})

(def PaymentSchedule
  "schedule for delivery of money in fulfillment of an obligation"
  {:db/ident :fibo-fnd-pas-psch/PaymentSchedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
   :rdfs/label "payment schedule",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-arr/hasConstituent,
                      :owl/someValuesFrom :fibo-fnd-pas-psch/Payment,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-fd/Schedule],
   :skos/definition
   "schedule for delivery of money in fulfillment of an obligation",
   :skos/example
   "Examples include coupon payment, loan payment, and interest payment schedules, among others."})

(def fulfillsObligation
  "satisfies a requirement for payment of some claim, debt, or other obligation"
  {:db/ident :fibo-fnd-pas-psch/fulfillsObligation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-pas-psch/Payment,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
   :rdfs/label "fulfills obligation",
   :rdfs/range :fibo-fnd-pas-psch/PaymentObligation,
   :skos/definition
   "satisfies a requirement for payment of some claim, debt, or other obligation"})

(def hasPaymentAmount
  "specifies the amount of money involved in a payment"
  {:db/ident :fibo-fnd-pas-psch/hasPaymentAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-pas-psch/Payment,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
   :rdfs/label "has payment amount",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition "specifies the amount of money involved in a payment"})

(def hasPaymentSchedule
  "specifies the schedule for fulfillment of an obligation"
  {:db/ident :fibo-fnd-pas-psch/hasPaymentSchedule,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
   :rdfs/label "has payment schedule",
   :rdfs/range :fibo-fnd-pas-psch/PaymentSchedule,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition "specifies the schedule for fulfillment of an obligation"})