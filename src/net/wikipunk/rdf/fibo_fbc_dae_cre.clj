(ns net.wikipunk.rdf.fibo-fbc-dae-cre
  "This ontology defines a range of credit events, that is events in which some payment or payments are not made. These include credit events relating to a specific debt obligation and events relating to the business entity as a whole. Note: the events defined herein are primarily business rather than consumer oriented, and are specified fairly generally. Many credit events are jurisdiction-specific, such as Chapter 11 restructuring and Chapter 7 bankruptcy in the United States. This ontology is designed to facilitate jurisdiction and instrument-specific extensions as needed."
  {:cmns-av/copyright ["Copyright (c) 2020-2023 Object Management Group, Inc."
                       "Copyright (c) 2018-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :dcterms/abstract
   "This ontology defines a range of credit events, that is events in which some payment or payments are not made. These include credit events relating to a specific debt obligation and events relating to the business entity as a whole. \n\t\tNote: the events defined herein are primarily business rather than consumer oriented, and are specified fairly generally. Many credit events are jurisdiction-specific, such as Chapter 11 restructuring and Chapter 7 bankruptcy in the United States. This ontology is designed to facilitate jurisdiction and instrument-specific extensions as needed.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/Occurrences/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/CreditEvents/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-fbc-dae-cre"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-dt-oc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-dae-cre",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit Events Ontology"},
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents.rdf version of this ontology was revised to augment the definition of obligation-specific event with an optional default threshold to better support credit default swaps."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents.rdf version of this ontology was revised to move a restriction involving breach of covenant from credit event, since not all credit events involve breaches, to default event, and loosen the constraint since a breach depends on the contract."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents.rdf version of this ontology was revised to address text formatting issues uncovered by hygiene testing."]})

(def Bankruptcy
  "credit event involving a change in state or condition in which a party becomes insolvent"
  {:cmns-av/adaptedFrom
   ["https://thelawdictionary.org/bankruptcy/"
    "Barron's Dictionary of Banking Terms, Sixth Edition, 2012"],
   :db/ident :fibo-fbc-dae-cre/Bankruptcy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bankruptcy"},
   :rdfs/subClassOf :fibo-fbc-dae-cre/EntitySpecificCreditEvent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit event involving a change in state or condition in which a party becomes insolvent"}})

(def CreditEvent
  "event signifying a sudden change in credit standing, such as bankruptcy or a violation of a bond indenture or loan agreement, that raises doubts about the party's ability to meet current or future obligations"
  {:db/ident :fibo-fbc-dae-cre/CreditEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit event"},
   :rdfs/subClassOf :fibo-fnd-dt-oc/Occurrence,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "event signifying a sudden change in credit standing, such as bankruptcy or a violation of a bond indenture or loan agreement, that raises doubts about the party's ability to meet current or future obligations"}})

(def DefaultEvent
  "credit event representing a failure to meet a contractual obligation, such as failure to repay a debt including interest or principal on a loan or security"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A default can occur when a borrower is unable to make timely payments, misses payments, or avoids or stops making payments, typically with respect to a single transaction. A default has adverse effects on the borrower's credit and ability to borrow in the future, and allows the creditor to demand immediate repayment of the obligation in full."},
   :db/ident :fibo-fbc-dae-cre/DefaultEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "default event"},
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-agr-ctr/BreachOfCovenant,
                      :owl/onProperty :fibo-fnd-dt-oc/exemplifies,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-dae-cre/ObligationSpecificCreditEvent],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit event representing a failure to meet a contractual obligation, such as failure to repay a debt including interest or principal on a loan or security"}})

(def DistressedRatingsDowngrade
  "credit event triggered when the credit rating of an obligation is downgraded to a distressed debt level"
  {:db/ident :fibo-fbc-dae-cre/DistressedRatingsDowngrade,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "distressed ratings downgrade"},
   :rdfs/subClassOf :fibo-fbc-dae-cre/Downgrade,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit event triggered when the credit rating of an obligation is downgraded to a distressed debt level"}})

(def Downgrade
  "credit event triggered when the credit rating of a party or obligation is lowered"
  {:db/ident :fibo-fbc-dae-cre/Downgrade,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "downgrade"},
   :rdfs/subClassOf :fibo-fbc-dae-cre/CreditEvent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit event triggered when the credit rating of a party or obligation is lowered"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "On October 17, 2013, Dagong Global Credit Rating downgraded the United States from A to A- and maintained a negative outlook on the country's credit."}})

(def EntitySpecificCreditEvent
  "credit event that applies to a given legal person"
  {:db/ident :fibo-fbc-dae-cre/EntitySpecificCreditEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "entity-specific credit event"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/appliesTo,
                      :owl/someValuesFrom :fibo-be-le-lp/LegalPerson,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-dae-cre/CreditEvent],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "credit event that applies to a given legal person"}})

(def FailureToPay
  "default event that is triggered following any applicable grace period in which a payment obligation is missed"
  {:db/ident :fibo-fbc-dae-cre/FailureToPay,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "failure to pay"},
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :fibo-fnd-dt-fd/DatePeriod,
                      :owl/onProperty :fibo-fbc-dae-cre/hasGracePeriod,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-dae-cre/DefaultEvent],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "default event that is triggered following any applicable grace period in which a payment obligation is missed"}})

(def FailureToPayInterest
  "default event that where either an expected interest payment is missed altogether or the amount paid is less than the required amount"
  {:db/ident :fibo-fbc-dae-cre/FailureToPayInterest,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "failure to pay interest"},
   :rdfs/subClassOf :fibo-fbc-dae-cre/FailureToPay,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "default event that where either an expected interest payment is missed altogether or the amount paid is less than the required amount"}})

(def FailureToPayPrincipal
  "default event that where either an expected principal payment is missed altogether or the amount paid is less than the required amount"
  {:db/ident :fibo-fbc-dae-cre/FailureToPayPrincipal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "failure to pay principal"},
   :rdfs/subClassOf :fibo-fbc-dae-cre/FailureToPay,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "default event that where either an expected principal payment is missed altogether or the amount paid is less than the required amount"}})

(def FilingForBankruptcy
  "credit event that involves a request to a court to be recognized as bankrupt"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The bankruptcy process is initiated via a petition filed by the debtor or on behalf of creditors. The debtor's assets may be used to repay a portion of outstanding debt as specified by the court or a court-appointed individual."},
   :db/ident :fibo-fbc-dae-cre/FilingForBankruptcy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "filing for bankruptcy"},
   :rdfs/subClassOf :fibo-fbc-dae-cre/EntitySpecificCreditEvent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit event that involves a request to a court to be recognized as bankrupt"}})

(def HardCreditEvent
  "default event that is not repairable"
  {:db/ident :fibo-fbc-dae-cre/HardCreditEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "hard credit event"},
   :rdfs/subClassOf :fibo-fbc-dae-cre/DefaultEvent,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "default event that is not repairable"}})

(def InstallmentDefault
  "default event involving non-payment of several installment payments as scheduled in the terms of the agreement, or non-payment of a call by the beneficial owner"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The latter may result in a court action by the issuer or the sale of the securities to recover costs and/or a forfeit of partially paid securities."},
   :db/ident :fibo-fbc-dae-cre/InstallmentDefault,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "installment default"},
   :rdfs/subClassOf :fibo-fbc-dae-cre/DefaultEvent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "default event involving non-payment of several installment payments as scheduled in the terms of the agreement, or non-payment of a call by the beneficial owner"}})

(def MaturityExtension
  "credit event involving extension of payments beyond the original maturity date of the obligation"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "As stipulated in the terms and conditions for a bond, for example, the issuer or the bondholder may prolong the maturity date. After extension, the security may differ from original issue (new rate or maturity date). May be subject to bondholder's approval."},
   :db/ident :fibo-fbc-dae-cre/MaturityExtension,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "maturity extension"},
   :rdfs/subClassOf :fibo-fbc-dae-cre/ObligationSpecificCreditEvent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit event involving extension of payments beyond the original maturity date of the obligation"}})

(def Moratorium
  "entity-specific credit event involving a temporary suspension of payments until related issues are resolved"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A moratorium may be a legally-mandated hiatus in debt collection as a part of a bankruptcy process."},
   :db/ident :fibo-fbc-dae-cre/Moratorium,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "moratorium"},
   :rdfs/subClassOf :fibo-fbc-dae-cre/EntitySpecificCreditEvent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "entity-specific credit event involving a temporary suspension of payments until related issues are resolved"}})

(def ObligationAcceleration
  "credit event triggered when one or more reference obligations become immediately due and payable as a result of a default or covenant breach on the reference entity's other debt instruments, subject to a materiality threshold"
  {:db/ident :fibo-fbc-dae-cre/ObligationAcceleration,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "obligation acceleration"},
   :rdfs/subClassOf :fibo-fbc-dae-cre/ObligationSpecificCreditEvent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit event triggered when one or more reference obligations become immediately due and payable as a result of a default or covenant breach on the reference entity's other debt instruments, subject to a materiality threshold"}})

(def ObligationDefault
  "credit event triggered as a result of an obligation-specific default"
  {:db/ident :fibo-fbc-dae-cre/ObligationDefault,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "obligation default"},
   :rdfs/subClassOf [:fibo-fbc-dae-cre/ObligationSpecificCreditEvent
                     :fibo-fbc-dae-cre/DefaultEvent],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit event triggered as a result of an obligation-specific default"}})

(def ObligationRestructuring
  "credit event that materially impacts an obligation, such as an interest rate reduction, principal reduction, deferral of interest or principal, change in priority ranking, or change in currency or composition of payment"
  {:db/ident :fibo-fbc-dae-cre/ObligationRestructuring,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "obligation restructuring"},
   :rdfs/subClassOf :fibo-fbc-dae-cre/ObligationSpecificCreditEvent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit event that materially impacts an obligation, such as an interest rate reduction, principal reduction, deferral of interest or principal, change in priority ranking, or change in currency or composition of payment"}})

(def ObligationSpecificCreditEvent
  "credit event that relates to an individual credit agreement or debt instrument (reference obligation)"
  {:db/ident :fibo-fbc-dae-cre/ObligationSpecificCreditEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "obligation-specific credit event"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/appliesTo,
                      :owl/someValuesFrom :fibo-fbc-dae-dbt/CreditAgreement,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty
                      :fibo-fbc-dae-cre/hasDefaultThresholdAmount,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-dae-cre/CreditEvent],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit event that relates to an individual credit agreement or debt instrument (reference obligation)"}})

(def Repudiation
  "credit event involving the refusal to honor the terms of a contract"
  {:db/ident :fibo-fbc-dae-cre/Repudiation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "repudiation"},
   :rdfs/subClassOf :fibo-fbc-dae-cre/ObligationSpecificCreditEvent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit event involving the refusal to honor the terms of a contract"}})

(def SoftCreditEvent
  "default event that is repairable"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "If the default is not repaired within a grace period, then a failure to repair (failure to pay) credit event is triggered, potentially as a hard default."},
   :db/ident :fibo-fbc-dae-cre/SoftCreditEvent,
   :owl/disjointWith :fibo-fbc-dae-cre/HardCreditEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "soft credit event"},
   :rdfs/subClassOf :fibo-fbc-dae-cre/DefaultEvent,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "default event that is repairable"}})

(def WriteDown
  "obligation-specific credit event whereby the book value of the obligation, such as the outstanding principal amount, is reduced"
  {:db/ident :fibo-fbc-dae-cre/WriteDown,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "write-down"},
   :rdfs/subClassOf :fibo-fbc-dae-cre/ObligationSpecificCreditEvent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "obligation-specific credit event whereby the book value of the obligation, such as the outstanding principal amount, is reduced"}})

(def hasDefaultThresholdAmount
  "specifies an amount of money that triggers a failure to pay, repudiation/moratorium or restructuring event"
  {:db/ident :fibo-fbc-dae-cre/hasDefaultThresholdAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has default threshold amount"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "specifies an amount of money that triggers a failure to pay, repudiation/moratorium or restructuring event"}})

(def hasGracePeriod
  "window following any payment due date during which a party must fulfill its obligations before a failure to pay credit event occurs"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Note that this may be a period denominated in business days or calendar days."},
   :db/ident :fibo-fbc-dae-cre/hasGracePeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has grace period"},
   :rdfs/range :fibo-fnd-dt-fd/DatePeriod,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasDatePeriod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "window following any payment due date during which a party must fulfill its obligations before a failure to pay credit event occurs"}})

(def involvesMultipleEvents
  "indicates that the restructuring spans more than one credit event"
  {:db/ident :fibo-fbc-dae-cre/involvesMultipleEvents,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-dae-cre/ObligationRestructuring,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "involves multiple events"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates that the restructuring spans more than one credit event"}})

(def isGracePeriodExtendable
  "indicates whether or not the grace period may be extended, which may be jurisdiction specific"
  {:db/ident :fibo-fbc-dae-cre/isGracePeriodExtendable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is grace period extendable"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates whether or not the grace period may be extended, which may be jurisdiction specific"}})