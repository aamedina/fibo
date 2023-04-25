(ns net.wikipunk.rdf.fibo-der-drc-ma
  "Terms that make up the OTC Derivatives Master agreement as defined in the ISDA literature. This is an experimental ontology and needs considerable re-work if it is to be considered for release."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :dcterms/abstract
   "Terms that make up the OTC Derivatives Master agreement as defined in the ISDA literature. This is an experimental ontology and needs considerable re-work if it is to be considered for release.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/Occurrences/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/TransactionsExt/REATransactions/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/GoalsAndObjectives/Objectives/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/DerivativesBasics/"
    "https://www.omg.org/spec/Commons/DatesAndTimes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/CreditEvents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/ProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/LegalCapacity/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-der-drc-ma"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
    "fibo-fbc-dae-cre"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-arr-doc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
    "fibo-fnd-dt-oc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
    "fibo-fnd-law-lcap"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/",
    "fibo-fnd-pas-pas"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/",
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
   :rdfa/prefix "fibo-der-drc-ma",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Derivatives Master Agreements Ontology"}})

(def CreditEventDefinition
  "contract definition for a credit event as it pertains to the master agreement"
  {:db/ident :fibo-der-drc-ma/CreditEventDefinition,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit event definition"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-agr-ctr/definesTermsFor,
                      :owl/someValuesFrom :fibo-fbc-dae-cre/CreditEvent,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-agr-ctr/ContractualDefinition
                     :fibo-der-drc-ma/MasterAgreementElement],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "contract definition for a credit event as it pertains to the master agreement"}})

(def CreditSupportAgreement
  "credit support agreement"
  {:db/ident :fibo-der-drc-ma/CreditSupportAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit support agreement"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/isProvidedBy,
                      :owl/someValuesFrom :fibo-fnd-agr-ctr/ContractPrincipal,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-der-drc-ma/hasBeneficiary,
                      :owl/someValuesFrom
                      :fibo-der-drc-ma/CreditSupportBeneficiary,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-agr-ctr/Contract]})

(def CreditSupportBeneficiary
  "credit support beneficiary"
  {:db/ident :fibo-der-drc-ma/CreditSupportBeneficiary,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit support beneficiary"},
   :rdfs/subClassOf :fibo-fnd-agr-ctr/Counterparty})

(def CreditSupportDefaultEvent
  "Failure of some Credit Support Agreement."
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Per ISDA Master Agreement exmple, this may take one of the following forms (there may be others not in this example): - Failure to comply with some obligation under the Credit Support Agreement (after a suitable grace period has elapsed) - Expiration or Termination of Credit Support Agreement while it is still needed for the transactions it covers (i.e. not normal termination); - Disavowal or repudiation of the Credit Suport Agreement by one or other party to it. Note that these three all relate to the state of the Credit Support Agreement, and have the effect that the Credit Support Agreement is no longer in effect, during a time when there is some Transaction in play which was intended to be covered by that Agreement. ISDA original terms from Master Agreement example, in full: Credit Support Default. (1) Failure by the party or any Credit Support Provider of such party to comply with or perform any agreement or obligation to be complied with or performed by it in accordance with any Credit Support Document if such failure is continuing after any applicable grace period has elapsed; (2) the expiration or termination of such Credit Support Document or the failing or ceasing of such Credit Support Document to be in full force and effect for the purpose of this Agreement (in either case other than in accordance with its terms) prior to the satisfaction of all obligations of such party under each Transaction to which such Credit Support Document relates without the written consent of the other party; or (3) the party or such Credit Support Provider disaffirms, disclaims, repudiates or rejects, in whole or in part, or challenges the validity of, such Credit Support Document Definition Agreement: SR Draft. Details from ISDA above."},
   :db/ident :fibo-der-drc-ma/CreditSupportDefaultEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit support default event"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-der-drc-ma/isFailureInForceOf,
                      :owl/someValuesFrom
                      :fibo-der-drc-ma/CreditSupportAgreement,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence
                     :fibo-fbc-dae-cre/CreditEvent],
   :skos/definition {:rdf/language "en",
                     :rdf/value "Failure of some Credit Support Agreement."}})

(def CrossDefaultProvisions
  "cross default provisions"
  {:db/ident :fibo-der-drc-ma/CrossDefaultProvisions,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cross default provisions"},
   :rdfs/subClassOf :fibo-der-drc-ma/MasterAgreementContractualCommitment})

(def CurrencySpecificationTerm
  "Term defining the currency or currencies for payments."
  {:db/ident :fibo-der-drc-ma/CurrencySpecificationTerm,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "currency specification term"},
   :rdfs/subClassOf [:fibo-fnd-agr-ctr/ContractualDefinition
                     :fibo-der-drc-ma/MasterAgreementElement],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Term defining the currency or currencies for payments."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value    "is found in general terms in example Master Agreement."}})

(def DefaultInterestObligation
  "Obligation in respect of defaults in the performance of any payment obligation."
  {:db/ident :fibo-der-drc-ma/DefaultInterestObligation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "default interest obligation"},
   :rdfs/subClassOf :fibo-fnd-law-lcap/ContractualObligation,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Obligation in respect of defaults in the performance of any payment obligation."},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Example text: Default Interest; Other Amounts. Prior to the occurrence or effective designation of an Early Termination Date in respect of the relevant Transaction, a party that defaults in the performance of any payment obligation will, to the extent permitted by law and subject to Section 6(c), be required to pay interest (before as well as after judgment) on the overdue amount to the other party on demand in the same currency as such overdue amount, for the period from (and including) the original due date for payment to (but excluding) the date of actual payment, at the Default Rate. Such interest will be calculated on the basis of daily compounding and the actual number of days elapsed. If, prior to the occurrence or effective designation of an Early Termination Date in respect of the relevant Transaction, a party defaults in the performance of any obligation required to be settled by delivery, it will compensate the other party on demand if and to the extent provided for in the relevant Confirmation or elsewhere in this Agreement. \" Note that this last sentence relates to a separate Obligation, labeled as Other Amount Obligation."}})

(def DeliveryObligation
  "Obligation to make deliveries on transactions transacted under the Master Agreement, as specified in any Confirmation made by that party."
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This and the Payment Obligation may be set out in one clause of the Master Agreement. This is the clause which obligates the parties to make the payments or deliveries in accordance with those Confirmations, which are generally messages. May be subject to other provisions in the Master Agreement. Example text: \"Each party will make each payment or delivery specified in each Confirmation to be made by it, subject to the other provisions of this Agreement. \""},
   :db/ident :fibo-der-drc-ma/DeliveryObligation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "delivery obligation"},
   :rdfs/subClassOf :fibo-fnd-law-lcap/ContractualObligation,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Obligation to make deliveries on transactions transacted under the Master Agreement, as specified in any Confirmation made by that party."}})

(def DerivativeTransactionMasterAgreement
  "a master agreement covering derivatives transactions to be carried out between the parties to this contract"
  {:db/ident :fibo-der-drc-ma/DerivativeTransactionMasterAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "derivative transaction master agreement"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom
                      :fibo-der-drc-ma/MasterAgreementElement,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-agr-ctr/MasterAgreement],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a master agreement covering derivatives transactions to be carried out between the parties to this contract"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Sample preamble to one of these: \"EXAMPLE BANK, a Michigan banking corporation and SAMPLECOMPANY US, INC. a Delaware corporation have entered and/or anticipate entering into one or more transactions (each a \"Transaction\") that are or will be governed by this Master Agreement, which includes the schedule (the \"Schedule\"), and the documents and other confirming evidence (each a \"Confirmation\") exchanged between the parties confirming those Transactions. \""}})

(def EarlyTermination
  "termination of an agreement for any reason prior to its expiration date"
  {:cmns-av/explanatoryNote
   "Early termination may be automatically triggered by an event of default with respect to any contract obligation, due to corporate action, or for other reasons.  An early termination date may be calculated per the terms of the agreement or specified explicitly at the time the termination event occurs.",
   :db/ident :fibo-der-drc-ma/EarlyTermination,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label "early termination",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-doc/hasExpirationDate,
                      :owl/someValuesFrom :cmns-dt/ExplicitDate,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-der-drc-ma/hasEarlyTerminationDate,
                      :owl/someValuesFrom :cmns-dt/Date,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-agr-ctr/ContractualCommitment],
   :skos/definition
   "termination of an agreement for any reason prior to its expiration date"})

(def MasterAgreementAccountChangeNotificationObligation
  "The obligtation to notify the counterparty to this agreement, of any changes in account details."
  {:db/ident
   :fibo-der-drc-ma/MasterAgreementAccountChangeNotificationObligation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "master agreement account change notification obligation"},
   :rdfs/subClassOf
   :fibo-der-drc-ma/MasterAgreementChangeNotificationObligation,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The obligtation to notify the counterparty to this agreement, of any changes in account details."},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Example text: \"Either party may change its account for receiving a payment or delivery by giving notice to the other party at least five Local Business Days prior to the scheduled date for the payment or delivery to which such change applies unless such other party gives timely notice of a reasonable objection to such change.\" Note that the notice period is given as a fact about the general kind of obligation which is Master Agreement Change notification Obligation."}})

(def MasterAgreementChangeNotificationObligation
  "The obligtaion to notify the counterparty to this agreement, of any changes in details."
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value    "General term of which Change of Account is an example."},
   :db/ident :fibo-der-drc-ma/MasterAgreementChangeNotificationObligation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value "master agreement change notification obligation"},
   :rdfs/subClassOf :fibo-fnd-law-lcap/ContractualObligation,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The obligtaion to notify the counterparty to this agreement, of any changes in details."}})

(def MasterAgreementConditionsPrecedent
  "Conditions precedent on payment or delivery on a transaction transacted under this Master Agreement."
  {:db/ident :fibo-der-drc-ma/MasterAgreementConditionsPrecedent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "master agreement conditions precedent"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-ma/isPredicatedOn,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-der-drc-ma/DeliveryObligation
                                            :fibo-der-drc-ma/PaymentObligation],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-agr-ctr/ConditionPrecedent
                     :fibo-der-drc-ma/MasterAgreementElement],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Conditions precedent on payment or delivery on a transaction transacted under this Master Agreement."},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Example text: \"Each obligation of each party under Section 2(a)(i) is subject to (1) the condition precedent that no Event of Default or Potential Event of Default with respect to the other party has occurred and is continuing, (2) the condition precedent that no Early Termination Date in respect of the relevant Transaction has occurred or been effectively designated and (3) each other applicable condition precedent specified in this Agreement. \" In the above, the Obligations defined under Section 2(a)(i) of the Master Agrement is the obligation to make each payment or delivery defined in a Confirmation for a transaction carried out under this Master Agreement."}})

(def MasterAgreementContractualCommitment
  "master agreement contractual commitment"
  {:db/ident :fibo-der-drc-ma/MasterAgreementContractualCommitment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "master agreement contractual commitment"},
   :rdfs/subClassOf [:fibo-fnd-agr-ctr/ContractualCommitment
                     :fibo-der-drc-ma/MasterAgreementElement]})

(def MasterAgreementEarlyTerminationProvisions
  "Terms and Conditions around early termination of the Master Agreement."
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Terms here include: Additional Terminaton Event Affected Parties"},
   :db/ident :fibo-der-drc-ma/MasterAgreementEarlyTerminationProvisions,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "master agreement early termination provisions"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-agr-ctr/definesTermsFor,
                      :owl/someValuesFrom
                      :fibo-der-drc-ma/MasterAgreementEarlyTerminationRight,
                      :rdf/type :owl/Restriction}
                     :fibo-der-drc-ma/MasterAgreementTerminationProvision],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Terms and Conditions around early termination of the Master Agreement."}})

(def MasterAgreementEarlyTerminationRight
  "a contractual right of a party to the master agreement to terminate the agreement early"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This generally arises from some Default Event on the part of the other party."},
   :db/ident :fibo-der-drc-ma/MasterAgreementEarlyTerminationRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "master agreement early termination right"},
   :rdfs/subClassOf :fibo-fnd-law-lcap/ContractualRight,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a contractual right of a party to the master agreement to terminate the agreement early"}})

(def MasterAgreementElement
  "a contract element specific to a master agreement governing derivatives transactions between contract parties"
  {:db/ident :fibo-der-drc-ma/MasterAgreementElement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "master agreement element"},
   :rdfs/subClassOf :fibo-fnd-agr-ctr/ContractualElement,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a contract element specific to a master agreement governing derivatives transactions between contract parties"},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "This is included so that all OTC Master Agreement Contract Terms Sets may be included under this one set. Terms are also described as specializations of the sorts of terms that they are (e.g. conditions Precedent, Commitments Terms and so on)."}})

(def MasterAgreementObligationTerms
  "contract terms setting out the obligations on a party to the agreement"
  {:db/ident :fibo-der-drc-ma/MasterAgreementObligationTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "master agreement obligations terms"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-agr-ctr/definesTermsFor,
                      :owl/someValuesFrom
                      :fibo-fnd-law-lcap/ContractualObligation,
                      :rdf/type :owl/Restriction}
                     :fibo-der-drc-ma/MasterAgreementContractualCommitment],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "contract terms setting out the obligations on a party to the agreement"},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "The obligations are modeled in detail as Obligations. There is little merit in setting out the terms themselves as a model of textual elements - these terms are bext understood in relation to the Obligations which they represent, which are modeled in detail."}})

(def MasterAgreementRepresentation
  "a representation made by one of the parties included in the master agreement"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "These typically include: Basic Representations - Status of the organization - Powers of the organization - Absence of conflicts - Existence of the relevant consents - Binding nature of the Agreement. Absence of default and similar events Absence of litigation Accuracy of information Tax representations (withholding; notifications) - Payer - Payee Representations as to the Credit Support Agreement Representations as to regulatory matters"},
   :db/ident :fibo-der-drc-ma/MasterAgreementRepresentation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "master agreement representation"},
   :rdfs/subClassOf [:fibo-fnd-agr-ctr/Representation
                     :fibo-fnd-agr-ctr/ContractualElement],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a representation made by one of the parties included in the master agreement"}})

(def MasterAgreementRightToTerminationFollowingDefaultEvent
  "the right to terminate a master agreement following an event of default"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This is a right which may be invoked by either party to the Master Agreement; in so doing they acome the \"Non Defaulting Party\" with respect to this Right. ISDA Definition in full: Right to Terminate Following Event of Default. If at any time an Event of Default with respect to a party (the \"Defaulting Party\") has occurred and is then continuing, the other party (the \"Non-defaulting Party\") may, by not more than 20 days notice to the Defaulting Party specifying the relevant Event of Default, designate a day not earlier than the day such notice is effective as an Early Termination Date in respect of all outstanding Transactions. If, however, \"Automatic Early Termination\" is specified in the Schedule as applying to a party, then an Early Termination Date in respect of all outstanding Transactions will occur immediately upon the occurrence with respect to such party of an Event of Default specified in Section 5(a)(vii)(1), (3), (5), (6) or, to the extent analogous thereto, (8), and as of the time immediately preceding the institution of the relevant proceeding or the presentation of the relevant petition upon the occurrence with respect to such party of an Event of Default specified in Section 5(a)(vii)(4) or, to the extent analogous thereto, (8)."},
   :db/ident
   :fibo-der-drc-ma/MasterAgreementRightToTerminationFollowingDefaultEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label
   {:rdf/language "en",
    :rdf/value "master agreement right to termination following default event"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-ma/invokedInEventOf.1,
                      :owl/someValuesFrom :fibo-fbc-dae-cre/CreditEvent,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-ma/MasterAgreementEarlyTerminationRight],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "the right to terminate a master agreement following an event of default"}})

(def MasterAgreementRightToTerminationFollowingTerminationEvent
  "the right to terminate the agreement following some termination-triggering event"
  {:db/ident
   :fibo-der-drc-ma/MasterAgreementRightToTerminationFollowingTerminationEvent,
   :fibo-fnd-utl-av/definitionOrigin
   {:rdf/language "en",
    :rdf/value
    "This specifies an event which is predefined in the Agreement as constituting a Termination Event, with the effect that this right (tro termination) is invoked by the occurrence of that event. That is the assumption modeled here. ISDA Master Agreement example text in full: Right to Terminate Following Termination Event. (i) Notice. If a Termination Event occurs, an Affected Party will, promptly upon becoming aware of it, notify the other party, specifying the nature of that Termination Event and each Affected Transaction and will also give such other information about that Termination Event as the other party may reasonably require. (ii) Transfer to Avoid Termination Event. If either an Illegality under Section 5(b)(i)(1) or a Tax Event occurs and there is only one Affected Party, or if a Tax Event Upon Merger occurs and the Burdened Party is the Affected Party, the Affected Party will, as a condition to its right to designate an Early Termination Date under Section 6(b)(iv), use all reasonable efforts (which will not require such party to incur a loss, excluding immaterial, incidental expenses) to transfer within 20 days after it gives notice under Section 6(b)(i) all its rights and obligations under this Agreement in respect of the Affected Transactions to another of its Offices or Affiliates so that such Termination Event ceases to exist. If the Affected Party is not able to make such a transfer it will give notice to the other party to that effect within such 20 day period, whereupon the other party may effect such a transfer within 30 days after the notice is given under Section 6(b)(i). Any such transfer by a party under this Section 6(b)(ii) will be subject to and conditional upon the prior written consent of the other party, which consent will not be withheld if such other party&rsquo;s policies in effect at such time would permit it to enter into transactions with the transferee on the terms proposed. (iii) Two Affected Parties. If an Illegality under Section 5(b)(i)(1) or a Tax Event occurs and there are two Affected Parties, each party will use all reasonable efforts to reach agreement within 30 days after notice thereof is given under Section 6(b)(i) on action to avoid that Termination Event. (iv) Right to Terminate. If:- (1) a transfer under Section 6(b)(ii) or an agreement under Section 6(b)(iii), as the case may be, has not been effected with respect to all Affected Transactions within 30 days after an Affected Party gives notice under Section 6(b)(i); or (2) an Illegality under Section 5(b)(i)(2), a Credit Event Upon Merger or an Additional Termination Event occurs, or a Tax Event Upon Merger occurs and the Burdened Party is not the Affected Party, either party in the case of an Illegality, the Burdened Party in the case of a Tax Event Upon Merger, any Affected Party in the case of a Tax Event or an Additional Termination Event if there is more than one Affected Party, or the party which is not the Affected Party in the case of a Credit Event Upon Merger or an Additional Termination Event if there is only one Affected Party may, by not more than 20 days notice to the other party and provided that the relevant Termination Event is then continuing, designate a day not earlier than the day such notice is effective as an Early Termination Date in respect of all Affected Transactions."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label
   {:rdf/language "en",
    :rdf/value
    "master agreement right to termination following termination event"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-der-drc-ma/invokedInEventOf,
                      :owl/someValuesFrom
                      :fibo-der-drc-ma/MasterAgreementTerminationEvent,
                      :rdf/type :owl/Restriction}
                     :fibo-der-drc-ma/MasterAgreementEarlyTerminationRight],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "the right to terminate the agreement following some termination-triggering event"}})

(def MasterAgreementTerminationEvent
  "\"Termination Event\" means an Illegality, a Tax Event or a Tax Event Upon Merger or, if specified to be applicable, a Credit Event Upon Merger or an Additional Termination Event."
  {:db/ident :fibo-der-drc-ma/MasterAgreementTerminationEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "master agreement termination event"},
   :rdfs/subClassOf :fibo-fnd-dt-oc/OccurrenceKind,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "\"Termination Event\" means an Illegality, a Tax Event or a Tax Event Upon Merger or, if specified to be applicable, a Credit Event Upon Merger or an Additional Termination Event."}})

(def MasterAgreementTerminationProvision
  "a provision in the master agreement, setting out the conditions, consequences etc. of termination of the agreement"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Early Termination is a specific set of terms within this, that are specific to this kind of Master Agreement."},
   :db/ident :fibo-der-drc-ma/MasterAgreementTerminationProvision,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "master agreement termination provision"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-der-drc-ma/describesTreatmentOf,
                      :owl/someValuesFrom
                      :fibo-der-drc-ma/MasterAgreementTerminationEvent,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-agr-ctr/TerminationProvision
                     :fibo-der-drc-ma/MasterAgreementElement],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a provision in the master agreement, setting out the conditions, consequences etc. of termination of the agreement"}})

(def NettingTerms
  "Terms setting out how Netting may or may not take place and the Obligations on each party in respect of that Netting."
  {:db/ident :fibo-der-drc-ma/NettingTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "netting terms"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-agr-ctr/definesTermsFor,
                      :owl/someValuesFrom
                      :fibo-der-drc-ma/ObligationInRespectOfNetting,
                      :rdf/type :owl/Restriction}
                     :fibo-der-drc-ma/MasterAgreementContractualCommitment],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Terms setting out how Netting may or may not take place and the Obligations on each party in respect of that Netting."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "These terms are set out as text in the Sample Master Agreement and may be difficult (and unproductive) to model). Here they are: Example Text: \"Netting. If on any date amounts would otherwise be payable:- (i) in the same currency; and (ii) in respect of the same Transaction, by each party to the other, then, on such date, each party’s obligation to make payment of any such amount will be automatically satisfied and discharged and, if the aggregate amount that would otherwise have been payable by one party exceeds the aggregate amount that would otherwise have been payable by the other party, replaced by an obligation upon the party by whom the larger aggregate amount would have been payable to pay to the other party the excess of the larger aggregate amount over the smaller aggregate amount. The parties may elect in respect of two or more Transactions that a net amount will be determined in respect of all amounts payable on the same date in the same currency in respect of such Transactions, regardless of whether such amounts are payable in respect of the same Transaction. The election may be made in the Schedule or a Confirmation by specifying that subparagraph (ii) above will not apply to the Transactions identified as being subject to the election, together with the starting date (in which case subparagraph (ii) above will not, or will cease to, apply to such Transactions from such date). This election may be made separately for different groups of Transactions and will apply separately to each pairing of Offices through which the parties make and receive payments or deliveries. \""}})

(def ObligationInRespectOfNetting
  "Some obligation on one or other party in respect of any netting up of amounts due under a combination of transactions transacted under this Master Agreement."
  {:db/ident :fibo-der-drc-ma/ObligationInRespectOfNetting,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "obligation in respect of netting"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-der-drc-ma/mayBeVariedByOne,
                      :owl/someValuesFrom
                      :fibo-fnd-pas-pas/TransactionConfirmation,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-law-lcap/ContractualObligation],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Some obligation on one or other party in respect of any netting up of amounts due under a combination of transactions transacted under this Master Agreement."}})

(def OtherAmountsObligation
  "Obligation in regard to other defaults on obligations. Example Contract Text: \"If, prior to the occurrence or effective designation of an Early Termination Date in respect of the relevant Transaction, a party defaults in the performance of any obligation required to be settled by delivery, it will compensate the other party on demand if and to the extent provided for in the relevant Confirmation or elsewhere in this Agreement. \""
  {:db/ident :fibo-der-drc-ma/OtherAmountsObligation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "other amounts obligation"},
   :rdfs/subClassOf :fibo-fnd-law-lcap/ContractualObligation,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Obligation in regard to other defaults on obligations. Example Contract Text: \"If, prior to the occurrence or effective designation of an Early Termination Date in respect of the relevant Transaction, a party defaults in the performance of any obligation required to be settled by delivery, it will compensate the other party on demand if and to the extent provided for in the relevant Confirmation or elsewhere in this Agreement. \""}})

(def PaymentObligation
  "Obligation to make payments on transactions transacted under the Master Agreement, as specified in any Confirmation made by that party."
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This and the Delivery Obligation may be set out in one clause of the Master Agreement. This is the clause which obligates the parties to make the payments or deliveries in accordance with those Confirmations, which are generally messages. May be subject to other provisions in the Master Agreement. Example text: \"Each party will make each payment or delivery specified in each Confirmation to be made by it, subject to the other provisions of this Agreement. \" Additional terms in the clause which follows the above, deal with more specific terms about payments."},
   :db/ident :fibo-der-drc-ma/PaymentObligation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "payment obligation"},
   :rdfs/subClassOf :fibo-fnd-law-lcap/ContractualObligation,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Obligation to make payments on transactions transacted under the Master Agreement, as specified in any Confirmation made by that party."}})

(def PaymentObligationAsDelivery
  "Obligation for payment in settlement of a transaction when this payment takes the form of delivery of some payment in kind."
  {:db/ident :fibo-der-drc-ma/PaymentObligationAsDelivery,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "payment obligation as delivery"},
   :rdfs/subClassOf :fibo-der-drc-ma/PaymentObligation,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Obligation for payment in settlement of a transaction when this payment takes the form of delivery of some payment in kind."},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Sample text: \"... Where settlement is by delivery (that is, other than by payment), such delivery will be made for receipt on the due date in the manner customary for the relevant obligation unless otherwise specified in the relevant Confirmation or elsewhere in this Agreement. \""}})

(def PaymentPlaceSpecificationMethod
  "Selection of possible places to be specified for the payments in a Master Agreement."
  {:db/ident :fibo-der-drc-ma/PaymentPlaceSpecificationMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "payment place specification method"},
   :rdfs/subClassOf :fibo-fnd-gao-obj/Strategy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Selection of possible places to be specified for the payments in a Master Agreement."}})

(def PaymentPlaceSpecifiedEitherInMasterAgreementOrConfirmation
  "payment place specified either in master agreement or confirmation"
  {:db/ident
   :fibo-der-drc-ma/PaymentPlaceSpecifiedEitherInMasterAgreementOrConfirmation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label
   {:rdf/language "en",
    :rdf/value
    "payment place specified either in master agreement or confirmation"},
   :rdfs/subClassOf :fibo-der-drc-ma/PaymentPlaceSpecificationMethod})

(def PaymentPlaceSpecifiedInConfirmationMessage
  "payment place specified in confirmation message"
  {:db/ident :fibo-der-drc-ma/PaymentPlaceSpecifiedInConfirmationMessage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value "payment place specified in confirmation message"},
   :rdfs/subClassOf :fibo-der-drc-ma/PaymentPlaceSpecificationMethod})

(def PaymentPlaceSpecifiedInMasterAgreement
  "payment place specified in master agreement"
  {:db/ident :fibo-der-drc-ma/PaymentPlaceSpecifiedInMasterAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "payment place specified in master agreement"},
   :rdfs/subClassOf :fibo-der-drc-ma/PaymentPlaceSpecificationMethod})

(def TaxWithholdingGrossupObligation
  "Grossup Obligations in respect of Tax, that is an obligation to deduct or withhold tax in respect of payments made under transactions governed by the Master Agreement."
  {:db/ident :fibo-der-drc-ma/TaxWithholdingGrossupObligation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tax withholding grossup obligation"},
   :rdfs/subClassOf :fibo-der-drc-ma/TaxWithholdingObligation,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Grossup Obligations in respect of Tax, that is an obligation to deduct or withhold tax in respect of payments made under transactions governed by the Master Agreement."},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Example Text Gross-Up. All payments under this Agreement will be made without any deduction or withholding for or on account of any Tax unless such deduction or withholding is required by any applicable law, as modified by the practice of any relevant governmental revenue authority, then in effect. If a party is so required to deduct or withhold, then that party (\"X\") will:- (1) promptly notify the other party (\"Y\") of such requirement; (2) pay to the relevant authorities the full amount required to be deducted or withheld (including the full amount required to be deducted or withheld from any additional amount paid by X to Y under this Section 2(d)) promptly upon the earlier of determining that such deduction or withholding is required or receiving notice that such amount has been assessed against Y; (3) promptly forward to Y an official receipt (or a certified copy), or other documentation reasonably acceptable to Y, evidencing such payment to such authorities; and (4) if such Tax is an Indemnifiable Tax, pay to Y, in addition to the payment to which Y is otherwise entitled under this Agreement, such additional amount as is necessary to ensure that the net amount actually received by Y (free and clear of Indemnifiable Taxes, whether assessed against X or Y) will equal the full amount Y would have received had no such deduction or withholding been required. However, X will not be required to pay any additional amount to Y to the extent that it would not be required to be paid but for:- (A) the failure by Y to comply with or perform any agreement contained in Section 4(a)(i), 4(a)(iii) or 4(d); or (B) the failure of a representation made by Y pursuant to Section 3(f) to be accurate and true unless such failure would not have occurred but for (I) any action taken by a taxing authority, or brought in a court of competent jurisdiction, on or after the date on which a Transaction is entered into (regardless of whether such action is taken or brought with respect to a party to this Agreement) or (II) a Change in Tax Law."}})

(def TaxWithholdingLiability
  "Obligation in respect of liability for tax. This defines whether or not the party which is required to deduct some tax payment and does not do so, is then entitled to receive the funds from the other party in the event that a liability for this tax is later assessed against the first party."
  {:db/ident :fibo-der-drc-ma/TaxWithholdingLiability,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tax withholding liability"},
   :rdfs/subClassOf :fibo-der-drc-ma/TaxWithholdingObligation,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Obligation in respect of liability for tax. This defines whether or not the party which is required to deduct some tax payment and does not do so, is then entitled to receive the funds from the other party in the event that a liability for this tax is later assessed against the first party."},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Example text: Liability. If:- (1) X is required by any applicable law, as modified by the practice of any relevant governmental revenue authority, to make any deduction or withholding in respect of which X would not be required to pay an additional amount to Y under Section 2(d)(i)(4); (2) X does not so deduct or withhold; and (3) a liability resulting from such Tax is assessed directly against X, then, except to the extent Y has satisfied or then satisfies the liability resulting from such Tax, Y will promptly pay to X the amount of such liability (including any related liability for interest, but including any related liability for penalties only if Y has failed to comply with or perform any agreement contained in Section 4(a)(i), 4(a)(iii) or 4(d))."}})

(def TaxWithholdingObligation
  "An obligation with regard to the payment of taxes."
  {:db/ident :fibo-der-drc-ma/TaxWithholdingObligation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tax withholding obligation"},
   :rdfs/subClassOf :fibo-fnd-law-lcap/ContractualObligation,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An obligation with regard to the payment of taxes."}})

(def automaticNettingApplicable
  "Whether netting takes place automatically in respect of one transaction. Example text: \"If on any date amounts would otherwise be payable:- (i) in the same currency; and (ii) in respect of the same Transaction, by each party to the other, then, on such date, each party’s obligation to make payment of any such amount will be automatically satisfied and discharged and, if the aggregate amount that would otherwise have been payable by one party exceeds the aggregate amount that would otherwise have been payable by the other party, replaced by an obligation upon the party by whom the larger aggregate amount would have been payable to pay to the other party the excess of the larger aggregate amount over the smaller aggregate amount. \""
  {:db/ident :fibo-der-drc-ma/automaticNettingApplicable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-ma/NettingTerms,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "automatic netting applicable"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether netting takes place automatically in respect of one transaction. Example text: \"If on any date amounts would otherwise be payable:- (i) in the same currency; and (ii) in respect of the same Transaction, by each party to the other, then, on such date, each party’s obligation to make payment of any such amount will be automatically satisfied and discharged and, if the aggregate amount that would otherwise have been payable by one party exceeds the aggregate amount that would otherwise have been payable by the other party, replaced by an obligation upon the party by whom the larger aggregate amount would have been payable to pay to the other party the excess of the larger aggregate amount over the smaller aggregate amount. \""}})

(def changeOfAccountDetailsAllowed
  "Whether the account details may be varied for individual transactions transacted under this Master Agreement."
  {:db/ident :fibo-der-drc-ma/changeOfAccountDetailsAllowed,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain
   :fibo-der-drc-ma/MasterAgreementAccountChangeNotificationObligation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "change of account details allowed"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether the account details may be varied for individual transactions transacted under this Master Agreement."}})

(def compensateOtherParty
  "Whether or not, under the stated circumstances, if a party defaults in the performance of any obligation required to be settled by delivery, it is obliged to compensate the other party on demand if and to the extent provided for in the relevant Confirmation or elsewhere in this Agreement."
  {:db/ident :fibo-der-drc-ma/compensateOtherParty,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-ma/OtherAmountsObligation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "compensate other party"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether or not, under the stated circumstances, if a party defaults in the performance of any obligation required to be settled by delivery, it is obliged to compensate the other party on demand if and to the extent provided for in the relevant Confirmation or elsewhere in this Agreement."}})

(def crossTransactionNettingElection
  "Whether either party may elect to carry out netting in respect of two or more transactions carried out under this Master Agreement."
  {:db/ident :fibo-der-drc-ma/crossTransactionNettingElection,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-ma/NettingTerms,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cross transaction netting election"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether either party may elect to carry out netting in respect of two or more transactions carried out under this Master Agreement."}})

(def currencySpecificMethods
  "Payment is to be in the manner customary for the currency in question. Example text: \"... in the manner customary for payments in the required currency.\" It is not clear what if anything the alternative would be. Included as a \"yes/no\" term for completeness."
  {:db/ident :fibo-der-drc-ma/currencySpecificMethods,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-ma/PaymentObligation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "currency specific methods"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Payment is to be in the manner customary for the currency in question. Example text: \"... in the manner customary for payments in the required currency.\" It is not clear what if anything the alternative would be. Included as a \"yes/no\" term for completeness."}})

(def defaultInterestApplicable
  "Whether a party that defaults in the performance of any payment obligation will, to the extent permitted by law and this agreement be required to pay interest (before as well as after judgment) on the overdue amount to the other party on demand in the same currency as such overdue amount, for the period from (and including) the original due date for payment to (but excluding) the date of actual payment."
  {:db/ident :fibo-der-drc-ma/defaultInterestApplicable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-ma/DefaultInterestObligation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "default interest applicable"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether a party that defaults in the performance of any payment obligation will, to the extent permitted by law and this agreement be required to pay interest (before as well as after judgment) on the overdue amount to the other party on demand in the same currency as such overdue amount, for the period from (and including) the original due date for payment to (but excluding) the date of actual payment."}})

(def defaultInterestCompoundingBasis
  "The basis upon which default interest is to be calculated, as a period of time (e.g. daily)."
  {:db/ident :fibo-der-drc-ma/defaultInterestCompoundingBasis,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-ma/DefaultInterestObligation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "default interest compounding basis"},
   :rdfs/range :cmns-dt/DatePeriod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The basis upon which default interest is to be calculated, as a period of time (e.g. daily)."}})

(def describesTreatmentOf
  "describes treatment of"
  {:db/ident :fibo-der-drc-ma/describesTreatmentOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-ma/MasterAgreementTerminationProvision,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "describes treatment of"},
   :rdfs/range :fibo-der-drc-ma/MasterAgreementTerminationEvent})

(def dischargedByNetting
  "The obligations for payment by either party is automatically discharged or satisfied in the event of other amounts being due on the same day and in the same currency. The Obligation in question is ether discharged completely or replaced with an obligation in respect of the outstanding difference, on the part of whichever party has a greater amount due to the other (a positive amount after netting) for that transaction on that date."
  {:db/ident :fibo-der-drc-ma/dischargedByNetting,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-ma/ObligationInRespectOfNetting,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "discharged by netting"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The obligations for payment by either party is automatically discharged or satisfied in the event of other amounts being due on the same day and in the same currency. The Obligation in question is ether discharged completely or replaced with an obligation in respect of the outstanding difference, on the part of whichever party has a greater amount due to the other (a positive amount after netting) for that transaction on that date."}})

(def effectOfDesignation
  "Description of the effect of designation of this right."
  {:db/ident :fibo-der-drc-ma/effectOfDesignation,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-ma/MasterAgreementEarlyTerminationProvisions,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "effect of designation"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Description of the effect of designation of this right."}})

(def forward
  "If a party is required to deduct or withhold tax, whether that party is to promptly forward to the other party an official receipt (or a certified copy), or other documentation reasonably acceptable to that party, evidencing such payment to such authorities."
  {:db/ident :fibo-der-drc-ma/forward,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-ma/TaxWithholdingGrossupObligation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "forward"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "If a party is required to deduct or withhold tax, whether that party is to promptly forward to the other party an official receipt (or a certified copy), or other documentation reasonably acceptable to that party, evidencing such payment to such authorities."}})

(def freelyTransferableFunds
  "freely transferable funds"
  {:db/ident :fibo-der-drc-ma/freelyTransferableFunds,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-ma/PaymentObligation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "freely transferable funds"},
   :rdfs/range :xsd/boolean})

(def hasBeneficiary
  "has beneficiary"
  {:db/ident :fibo-der-drc-ma/hasBeneficiary,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-ma/CreditSupportAgreement,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has beneficiary"},
   :rdfs/range :fibo-der-drc-ma/CreditSupportBeneficiary,
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasCounterparty})

(def hasEarlyTerminationDate
  "indicates a termination date that occurs prior to an explicit expiration date"
  {:db/ident :fibo-der-drc-ma/hasEarlyTerminationDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has early termination date"},
   :rdfs/range :cmns-dt/Date,
   :rdfs/subPropertyOf :fibo-fnd-arr-doc/hasTerminationDate,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates a termination date that occurs prior to an explicit expiration date"}})

(def inDefault
  "The condition that some default has occurred in respect to the other party. Further notes: Conditions precedent typically include that no default has occurred, so this is typically or always \"no\". Sample text (of which this term is a part): \" the condition precedent that no Event of Default or Potential Event of Default with respect to the other party has occurred and is continuing, \""
  {:db/ident :fibo-der-drc-ma/inDefault,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-ma/MasterAgreementConditionsPrecedent,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "in default"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The condition that some default has occurred in respect to the other party. Further notes: Conditions precedent typically include that no default has occurred, so this is typically or always \"no\". Sample text (of which this term is a part): \" the condition precedent that no Event of Default or Potential Event of Default with respect to the other party has occurred and is continuing, \""}})

(def includesPenaltyPayments
  "Whether liability on the part of the counterparty (the party which is not assessed as being liable for the relevant tax) includes liability for penalties in respect of the late or non payment of that tax by the party so assessed."
  {:db/ident :fibo-der-drc-ma/includesPenaltyPayments,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-ma/TaxWithholdingLiability,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "includes penalty payments"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether liability on the part of the counterparty (the party which is not assessed as being liable for the relevant tax) includes liability for penalties in respect of the late or non payment of that tax by the party so assessed."}})

(def invokedInEventOf
  "invoked in event of"
  {:db/ident :fibo-der-drc-ma/invokedInEventOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain
   :fibo-der-drc-ma/MasterAgreementRightToTerminationFollowingTerminationEvent,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "invoked in event of"},
   :rdfs/range :fibo-der-drc-ma/MasterAgreementTerminationEvent})

(def invokedInEventOf.1
  "invoked in event of"
  {:db/ident :fibo-der-drc-ma/invokedInEventOf.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain
   :fibo-der-drc-ma/MasterAgreementRightToTerminationFollowingDefaultEvent,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "invoked in event of"},
   :rdfs/range :fibo-fbc-dae-cre/CreditEvent})

(def isFailureInForceOf
  "is failure in force of"
  {:db/ident :fibo-der-drc-ma/isFailureInForceOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-ma/CreditSupportDefaultEvent,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is failure in force of"},
   :rdfs/range :fibo-der-drc-ma/CreditSupportAgreement})

(def isPredicatedOn
  "is predicated on"
  {:db/ident :fibo-der-drc-ma/isPredicatedOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-agr-ctr/ConditionPrecedent,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is predicated on"},
   :rdfs/range :fibo-fnd-agr-ctr/ContractualCommitment})

(def makeUpForIndemnifiable
  "If a party (\"X\") is required to deduct or withhold tax, and if such Tax is an Indemnifiable Tax, whether X is to pay to the other party (\"Y\"), in addition to the payment to which Y is otherwise entitled under this Agreement, such additional amount as is necessary to ensure that the net amount actually received by Y (free and clear of Indemnifiable Taxes, whether assessed against X or Y) will equal the full amount Y would have received had no such deduction or withholding been required. However, X will not be required to pay any additional amount to Y to the extent that it would not be required to be paid but for:- (A) the failure by Y to comply with or perform any agreement contained in the provisions for furnishing specified information in this agreement; or (B) the failure of a representation made by Y pursuant to the Representation Section of the agreement to be accurate and true unless such failure would not have occurred but for (I) any action taken by a taxing authority, or brought in a court of competent jurisdiction, on or after the date on which a Transaction is entered into (regardless of whether such action is taken or brought with respect to a party to this Agreement) or (II) a Change in Tax Law. Further notes: The above is all definitional of this term."
  {:db/ident :fibo-der-drc-ma/makeUpForIndemnifiable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-ma/TaxWithholdingGrossupObligation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "make up for indemnifiable"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "If a party (\"X\") is required to deduct or withhold tax, and if such Tax is an Indemnifiable Tax, whether X is to pay to the other party (\"Y\"), in addition to the payment to which Y is otherwise entitled under this Agreement, such additional amount as is necessary to ensure that the net amount actually received by Y (free and clear of Indemnifiable Taxes, whether assessed against X or Y) will equal the full amount Y would have received had no such deduction or withholding been required. However, X will not be required to pay any additional amount to Y to the extent that it would not be required to be paid but for:- (A) the failure by Y to comply with or perform any agreement contained in the provisions for furnishing specified information in this agreement; or (B) the failure of a representation made by Y pursuant to the Representation Section of the agreement to be accurate and true unless such failure would not have occurred but for (I) any action taken by a taxing authority, or brought in a court of competent jurisdiction, on or after the date on which a Transaction is entered into (regardless of whether such action is taken or brought with respect to a party to this Agreement) or (II) a Change in Tax Law. Further notes: The above is all definitional of this term."}})

(def masterAgreementCurrency
  "The currency for payments under this Master Agreement. ISDA Master Agreement example text: Payment in the Contractual Currency. Each payment under this Agreement will be made in the relevant currency specified in this Agreement for that payment (the \"Contractual Currency\"). To the extent permitted by applicable law, any obligation to make payments under this Agreement in the Contractual Currency will not be discharged or satisfied by any tender in any currency other than the Contractual Currency, except to the extent such tender results in the actual receipt by the party to which payment is owed, acting in a reasonable manner and in good faith in converting the currency so tendered into the Contractual Currency, of the full amount in the Contractual Currency of all amounts payable in respect of this Agreement. If for any reason the amount in the Contractual Currency so received falls short of the amount in the Contractual Currency payable in respect of this Agreement, the party required to make the payment will, to the extent permitted by applicable law, immediately pay such additional amount in the Contractual Currency as may be necessary to compensate for the shortfall. If for any reason the amount in the Contractual Currency so received exceeds the amount in the Contractual Currency payable in respect of this Agreement, the party receiving the payment will refund promptly the amount of such excess."
  {:db/ident :fibo-der-drc-ma/masterAgreementCurrency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-ma/CurrencySpecificationTerm,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "master agreement currency"},
   :rdfs/range :fibo-fnd-acc-cur/Currency,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The currency for payments under this Master Agreement. ISDA Master Agreement example text: Payment in the Contractual Currency. Each payment under this Agreement will be made in the relevant currency specified in this Agreement for that payment (the \"Contractual Currency\"). To the extent permitted by applicable law, any obligation to make payments under this Agreement in the Contractual Currency will not be discharged or satisfied by any tender in any currency other than the Contractual Currency, except to the extent such tender results in the actual receipt by the party to which payment is owed, acting in a reasonable manner and in good faith in converting the currency so tendered into the Contractual Currency, of the full amount in the Contractual Currency of all amounts payable in respect of this Agreement. If for any reason the amount in the Contractual Currency so received falls short of the amount in the Contractual Currency payable in respect of this Agreement, the party required to make the payment will, to the extent permitted by applicable law, immediately pay such additional amount in the Contractual Currency as may be necessary to compensate for the shortfall. If for any reason the amount in the Contractual Currency so received exceeds the amount in the Contractual Currency payable in respect of this Agreement, the party receiving the payment will refund promptly the amount of such excess."}})

(def mayBeVariedByOne
  "may be varied by one"
  {:db/ident :fibo-der-drc-ma/mayBeVariedByOne,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-ma/ObligationInRespectOfNetting,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "may be varied by one"},
   :rdfs/range :fibo-fnd-pas-pas/TransactionConfirmation})

(def notify
  "If a party is required to deduct or withhold tax, whether obligation is to promptly notify the other party of Tax Withholding Grossup requirement."
  {:db/ident :fibo-der-drc-ma/notify,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-ma/TaxWithholdingGrossupObligation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "notify"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "If a party is required to deduct or withhold tax, whether obligation is to promptly notify the other party of Tax Withholding Grossup requirement."}})

(def ongoingDefault
  "The condition that some default or potential default is ongoing in respect to the other party. Further notes: Conditions precedent typically include that no default is ongoing, so this is typically or always \"no\". Sample text (of which this term is a part): \" the condition precedent that no Event of Default or Potential Event of Default with respect to the other party has occurred and is continuing, \""
  {:db/ident :fibo-der-drc-ma/ongoingDefault,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-ma/MasterAgreementConditionsPrecedent,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ongoing default"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The condition that some default or potential default is ongoing in respect to the other party. Further notes: Conditions precedent typically include that no default is ongoing, so this is typically or always \"no\". Sample text (of which this term is a part): \" the condition precedent that no Event of Default or Potential Event of Default with respect to the other party has occurred and is continuing, \""}})

(def pay
  "If a party \"X\" is required to deduct or withhold tax, whether Obligation is to pay to the relevant authorities the full amount required to be deducted or withheld (including the full amount required to be deducted or withheld from any additional amount paid by X to Y under this obligation promptly upon the earlier of determining that such deduction or withholding is required or receiving notice that such amount has been assessed against Y;"
  {:db/ident :fibo-der-drc-ma/pay,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-ma/TaxWithholdingGrossupObligation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pay"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "If a party \"X\" is required to deduct or withhold tax, whether Obligation is to pay to the relevant authorities the full amount required to be deducted or withheld (including the full amount required to be deducted or withheld from any additional amount paid by X to Y under this obligation promptly upon the earlier of determining that such deduction or withholding is required or receiving notice that such amount has been assessed against Y;"}})

(def payableByCounterparty
  "Whether the counterparty is obliged to promptly pay to the party which is assessed as being liable for the relevant tax, the amount of such liability."
  {:db/ident :fibo-der-drc-ma/payableByCounterparty,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-ma/TaxWithholdingLiability,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "payable by counterparty"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether the counterparty is obliged to promptly pay to the party which is assessed as being liable for the relevant tax, the amount of such liability."}})

(def paymentDateCalculationRequirement
  "Provisions for calculation of Payment dates in the event of this Early Termination."
  {:db/ident :fibo-der-drc-ma/paymentDateCalculationRequirement,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-ma/MasterAgreementEarlyTerminationProvisions,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "payment date calculation requirement"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Provisions for calculation of Payment dates in the event of this Early Termination."}})

(def paymentInKindDeliveryObligation
  "Precise description of the form in which payment is to be made when payment is in kind."
  {:db/ident :fibo-der-drc-ma/paymentInKindDeliveryObligation,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-ma/PaymentObligationAsDelivery,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "payment in kind delivery obligation"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Precise description of the form in which payment is to be made when payment is in kind."}})

(def paymentPlaceSpecification
  "The place for payments specified in this Master Agreement."
  {:db/ident :fibo-der-drc-ma/paymentPlaceSpecification,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-ma/PaymentObligation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "payment place specification"},
   :rdfs/range :fibo-der-drc-ma/PaymentPlaceSpecificationMethod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "The place for payments specified in this Master Agreement."}})

(def potentialDefault
  "The condition that some potential default has occurred in respect to the other party. Further notes: Conditions precedent typically include that no potential default has occurred, so this is typically or always \"no\". Sample text (of which this term is a part): \" the condition precedent that no Event of Default or Potential Event of Default with respect to the other party has occurred and is continuing, \""
  {:db/ident :fibo-der-drc-ma/potentialDefault,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-ma/MasterAgreementConditionsPrecedent,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "potential default"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The condition that some potential default has occurred in respect to the other party. Further notes: Conditions precedent typically include that no potential default has occurred, so this is typically or always \"no\". Sample text (of which this term is a part): \" the condition precedent that no Event of Default or Potential Event of Default with respect to the other party has occurred and is continuing, \""}})

(def requiredDaysNotice
  "The number of days notice to be given for a change in the given kinds of details."
  {:db/ident :fibo-der-drc-ma/requiredDaysNotice,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-ma/MasterAgreementChangeNotificationObligation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "required days notice"},
   :rdfs/range :xsd/integer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The number of days notice to be given for a change in the given kinds of details."}})

(def specifiedIndebtedness
  "Any obligation (whether present or future, contingent or otherwise, as principal or surety or otherwise) in respect of borrowed money. May not include obligations in respect of deposits received in the ordinary course of a party’s banking business. FpML: In Schedule: \"Specified Indebtedness\" will have the meaning specified in Section 14 except that such term shall not include obligations in respect of deposits received in the ordinary course of a party’s banking business. Section 14: \"Specified Indebtedness\" means, subject to the Schedule, any obligation (whether present or future, contingent or otherwise, as principal or surety or otherwise) in respect of borrowed money. Modeling note: Could extend this to have a yes/no option on the exclusion described in the Schedule to the sample Master Agreement"
  {:db/ident :fibo-der-drc-ma/specifiedIndebtedness,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-ma/CrossDefaultProvisions,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "specified indebtedness"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Any obligation (whether present or future, contingent or otherwise, as principal or surety or otherwise) in respect of borrowed money. May not include obligations in respect of deposits received in the ordinary course of a party’s banking business. FpML: In Schedule: \"Specified Indebtedness\" will have the meaning specified in Section 14 except that such term shall not include obligations in respect of deposits received in the ordinary course of a party’s banking business. Section 14: \"Specified Indebtedness\" means, subject to the Schedule, any obligation (whether present or future, contingent or otherwise, as principal or surety or otherwise) in respect of borrowed money. Modeling note: Could extend this to have a yes/no option on the exclusion described in the Schedule to the sample Master Agreement"}})

(def statementCalculationRequirements
  "Provisions for calculation of statements and statement amounts in the event of this Early Termination."
  {:db/ident :fibo-der-drc-ma/statementCalculationRequirements,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-ma/MasterAgreementEarlyTerminationProvisions,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "statement calculation requirements"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Provisions for calculation of statements and statement amounts in the event of this Early Termination."}})

(def subjectToOtherProvisions
  "Whether this Obligation is subject to other provisions in the Master Agreement."
  {:db/ident :fibo-der-drc-ma/subjectToOtherProvisions,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain [:fibo-der-drc-ma/PaymentObligation
                 :fibo-der-drc-ma/DeliveryObligation],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subject to other provisions"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether this Obligation is subject to other provisions in the Master Agreement."}})

(def thresholdAmount
  "threshold amount"
  {:db/ident :fibo-der-drc-ma/thresholdAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-ma/CrossDefaultProvisions,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "threshold amount"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount})

(def transactionEarlyTerminationDate
  "The condition that some early termination date as been defined in respect to the transaction carried out under this Master Agreement. Further notes: note that this is in respect of a specific transaction transacted under the Master Agreement, so that the condition precedent for the obligation in respect of that specific transaction, is that this early transaction termation has not taken place in respect of this same transaction. Conditions precedent typically include this is not the case, so this is typically or always \"no\". Sample text: \"the condition precedent that no Early Termination Date in respect of the relevant Transaction has occurred or been effectively designated.\""
  {:db/ident :fibo-der-drc-ma/transactionEarlyTerminationDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-ma/MasterAgreementConditionsPrecedent,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "transaction early termination date"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The condition that some early termination date as been defined in respect to the transaction carried out under this Master Agreement. Further notes: note that this is in respect of a specific transaction transacted under the Master Agreement, so that the condition precedent for the obligation in respect of that specific transaction, is that this early transaction termation has not taken place in respect of this same transaction. Conditions precedent typically include this is not the case, so this is typically or always \"no\". Sample text: \"the condition precedent that no Early Termination Date in respect of the relevant Transaction has occurred or been effectively designated.\""}})