(ns net.wikipunk.rdf.fibo-fnd-pas-psch
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
     "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-fnd-acc-cur"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
     "fibo-fnd-agr-agr"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
     "fibo-fnd-agr-ctr"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
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
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "skos" "http://www.w3.org/2004/02/skos/core#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-fnd-pas-psch",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/ProductsAndServices/PaymentsAndSchedules/"}
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines basic concepts such as payment, payee, payer, and payment schedule, extending the scheduling concepts from the Dates and Times module, among others.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Agreements/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Law/LegalCapacity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/ProductsAndServices/ProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/ProductsAndServices/PaymentsAndSchedules/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Payments and Schedules Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.1 RTF report to replace MoneyAmount with MonetaryAmount."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules.rdf version of this ontology was modified to fix spelling errors."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules.rdf version of this ontology was modified to revise payments to better support loan requirements and eliminate duplication of concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules.rdf version of this ontology was modified to eliminate remaining circular references."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules.rdf version of this ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules.rdf version of this ontology was modified per the FIBO 2.0 RFC to make hasPaymentAmount a child of hasMonetaryAmount and move hasObligation and isObligationOf to Agreements."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules.rdf version of this ontology was modified to clean up the definition and augment the restrictions on payment obligation to include the payee."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/"})

(def Payee
  {:db/ident :fibo-fnd-pas-psch/Payee,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/"},
   :rdfs/label "payee",
   :rdfs/subClassOf #{{:owl/onProperty :fibo-fnd-pty-rl/isPlayedBy,
                       :owl/someValuesFrom
                       {:owl/onProperty :fibo-fnd-pty-pty/isAPartyTo,
                        :owl/someValuesFrom
                        :fibo-fnd-pas-psch/PaymentObligation,
                        :rdf/type :owl/Restriction},
                       :rdf/type :owl/Restriction} :fibo-fnd-agr-agr/Obligee},
   :skos/definition
   "a party to whom a debt should be paid, or to whose order a bill of exchange, note, or check is made payable, or who receives or will receive a payment from a payer in partial or complete fulfillment of an obligation"})

(def Payer
  {:db/ident :fibo-fnd-pas-psch/Payer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/"},
   :rdfs/label "payer",
   :rdfs/subClassOf #{:fibo-fnd-agr-agr/Obligor
                      {:owl/allValuesFrom :fibo-fnd-pas-psch/PaymentObligation,
                       :owl/onProperty    :fibo-fnd-agr-agr/hasObligation,
                       :rdf/type          :owl/Restriction}},
   :skos/definition
   "a party who pays a bill or fees, or who makes payments to a payee in partial or complete fulfillment of an obligation"})

(def Payment
  {:db/ident :fibo-fnd-pas-psch/Payment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/"},
   :rdfs/label "payment",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-pas-psch/hasPaymentAmount,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryAmount,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-dt-oc/Occurrence},
   :skos/definition
   "delivery of money in fulfillment of an obligation, such as to satisfy a claim or debt"})

(def PaymentEvent
  {:db/ident :fibo-fnd-pas-psch/PaymentEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/"},
   :rdfs/label "payment event",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-fnd-pas-psch/Payment,
                       :owl/onProperty :fibo-fnd-rel-rel/involves,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-pas-pas/TransactionEvent
                      {:owl/onClass    :fibo-fnd-pas-psch/PaymentObligation,
                       :owl/onProperty :cmns-cxtdsg/appliesTo,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "an event that involves delivery of money in fulfillment of an obligation"})

(def PaymentObligation
  {:db/ident :fibo-fnd-pas-psch/PaymentObligation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/"},
   :rdfs/label "payment obligation",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-pty-pty/hasPartyInRole,
      :owl/someValuesFrom :fibo-fnd-pas-psch/Payee,
      :rdf/type           :owl/Restriction} :fibo-fnd-law-lcap/Duty
     {:owl/onProperty     :fibo-fnd-agr-agr/isObligationOf,
      :owl/someValuesFrom :fibo-fnd-pas-psch/Payer,
      :rdf/type           :owl/Restriction} :fibo-fnd-agr-agr/Commitment
     {:owl/allValuesFrom :fibo-fnd-agr-ctr/Contract,
      :owl/onProperty    :fibo-fnd-rel-rel/isConferredBy,
      :rdf/type          :owl/Restriction}},
   :skos/definition
   "legally enforceable duty to pay a sum of money according to the terms stated in a contract",
   :skos/example
   "the duty of a borrower to repay a loan, related to the legal right of a lender to enforce payment"})

(def PaymentSchedule
  {:db/ident :fibo-fnd-pas-psch/PaymentSchedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/"},
   :rdfs/label "payment schedule",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-col/hasConstituent,
                       :owl/someValuesFrom :fibo-fnd-pas-psch/Payment,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-dt-fd/Schedule},
   :skos/definition
   "schedule for delivery of money in fulfillment of an obligation",
   :skos/example
   "Examples include coupon payment, loan payment, and interest payment schedules, among others."})

(def fulfillsObligation
  {:db/ident :fibo-fnd-pas-psch/fulfillsObligation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-pas-psch/Payment,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/"},
   :rdfs/label "fulfills obligation",
   :rdfs/range :fibo-fnd-pas-psch/PaymentObligation,
   :skos/definition
   "satisfies a requirement for payment of some claim, debt, or other obligation"})

(def hasPaymentAmount
  {:db/ident :fibo-fnd-pas-psch/hasPaymentAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-pas-psch/Payment,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/"},
   :rdfs/label "has payment amount",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition "specifies the amount of money involved in a payment"})

(def hasPaymentSchedule
  {:db/ident :fibo-fnd-pas-psch/hasPaymentSchedule,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/"},
   :rdfs/label "has payment schedule",
   :rdfs/range :fibo-fnd-pas-psch/PaymentSchedule,
   :skos/definition "specifies the schedule for fulfillment of an obligation"})

(def urn:uuid:2da8dcf8-f46a-503b-b369-eb26392a6f78
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines basic concepts such as payment, payee, payer, and payment schedule, extending the scheduling concepts from the Dates and Times module, among others.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Agreements/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Law/LegalCapacity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/ProductsAndServices/ProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/ProductsAndServices/PaymentsAndSchedules/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Payments and Schedules Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.1 RTF report to replace MoneyAmount with MonetaryAmount."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules.rdf version of this ontology was modified to fix spelling errors."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules.rdf version of this ontology was modified to revise payments to better support loan requirements and eliminate duplication of concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules.rdf version of this ontology was modified to eliminate remaining circular references."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules.rdf version of this ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules.rdf version of this ontology was modified per the FIBO 2.0 RFC to make hasPaymentAmount a child of hasMonetaryAmount and move hasObligation and isObligationOf to Agreements."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules.rdf version of this ontology was modified to clean up the definition and augment the restrictions on payment obligation to include the payee."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/"})