(ns net.wikipunk.rdf.fibo-der-cr-cds
  "Credit default swaps are financial instruments that allow the transfer of credit risk among market participants, potentially facilitating greater efficiency in the pricing and distribution/offset of credit risk. They are bilateral contracts in which one party (the protection seller) agrees to provide payment(s) to the other party (the protection buyer) should a credit event occur against the underlying. The underlier for a CDS may be a specified debt (the reference obligation), a specific debt issuer (reference entity), in which case the credit events involving the entity is what triggers the payment, a basket of reference entities and/or reference obligations, or a credit index (reference index). This ontology defines the concept of a basic credit default swap as well as more specific kinds of CDS and specifies related details."
  {:cmns-av/copyright ["Copyright (c) 2013-2023 EDM Council, Inc."
                       "Copyright (c) 2013-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :dcterms/abstract
   "Credit default swaps are financial instruments that allow the transfer of credit risk among market participants, potentially facilitating greater efficiency in the pricing and distribution/offset of credit risk. They are bilateral contracts in which one party (the protection seller) agrees to provide payment(s) to the other party (the protection buyer) should a credit event occur against the underlying. The underlier for a CDS may be a specified debt (the reference obligation), a specific debt issuer (reference entity), in which case the credit events involving the entity is what triggers the payment, a basket of reference entities and/or reference obligations, or a credit index (reference index). This ontology defines the concept of a basic credit default swap as well as more specific kinds of CDS and specifies related details.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/ProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/Ownership/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/Settlement/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/Swaps/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/Publishers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/CreditEvents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/DerivativesBasics/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/Markets/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/Occurrences/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/InstrumentPricing/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-fct-pub"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
    "fibo-der-cr-cds"
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
    "fibo-der-drc-bsc"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
    "fibo-der-drc-swp"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/",
    "fibo-fbc-dae-cre"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
    "fibo-fbc-fct-mkt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
    "fibo-fbc-fct-ra"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
    "fibo-fbc-fi-ip"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
    "fibo-fbc-fi-stl"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-arr-doc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
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
   :rdfa/prefix "fibo-der-cr-cds",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit Default Swaps Ontology"},
   :skos/changeNote
   "The https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."})

(def AssetBackedCreditDefaultSwap
  "credit default swap whose underlying reference obligation is an asset-backed security rather than corporate credit"
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "ABCDS"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "In the case of an ABCDS, the buyer receives protection for defaults on asset-backed securities or tranches of securities, rather than protecting against the default of a particular issuer. Asset-backed securities are securities backed by a pool of loans or receivables, such as auto loans, home equity loans or credit cards loans."},
   :db/ident :fibo-der-cr-cds/AssetBackedCreditDefaultSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "asset-backed credit default swap"},
   :rdfs/subClassOf :fibo-der-cr-cds/CreditDefaultSwap,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit default swap whose underlying reference obligation is an asset-backed security rather than corporate credit"}})

(def BasketCreditDefaultSwap
  "credit default swap that references a bespoke, synthetic portfolio of underlying assets whose components have been agreed to for a specific OTC derivative by the parties to the transaction"
  {:cmns-av/adaptedFrom
   ["ISO 10962:2019, Securities and related financial instruments - Classification of financial instruments (CFI) code"
    "Draft paper on Credit Default Swaps from the Federal Reserve Board, available at https://www.federalreserve.gov/econres/feds/files/2022023pap.pdf"],
   :db/ident :fibo-der-cr-cds/BasketCreditDefaultSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "basket credit default swap"},
   :rdfs/subClassOf :fibo-der-cr-cds/MultiNameCreditDefaultSwap,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit default swap that references a bespoke, synthetic portfolio of underlying assets whose components have been agreed to for a specific OTC derivative by the parties to the transaction"}})

(def CashSettlementMethod
  "strategy for calculating or otherwise establishing a reference final price for the contract"
  {:cmns-av/adaptedFrom
   "ISO 10962:2019, Securities and related financial instruments - Classification of financial instruments (CFI) code",
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The method may include an independently administered synthetic auction process that sets the reference final price."},
   :db/ident :fibo-der-cr-cds/CashSettlementMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cash settlement method"},
   :rdfs/subClassOf :fibo-fbc-fi-ip/PriceDeterminationMethod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "strategy for calculating or otherwise establishing a reference final price for the contract"}})

(def ContingentCreditDefaultSwap
  "credit default swap in which an additional triggering event is required"
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "CCDS"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "In a contingent credit default swap, the trigger requires both a credit event (as in a traditional credit default swap) and another specified event. The additional specified event is usually a significant movement in an index covering equities, commodities, interest rates, or some other overall measure of the economy or relevant industry."},
   :db/ident :fibo-der-cr-cds/ContingentCreditDefaultSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "contingent credit default swap"},
   :rdfs/subClassOf :fibo-der-cr-cds/CreditDefaultSwap,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit default swap in which an additional triggering event is required"}})

(def CreditDefaultSwap
  "bilateral contract in which one party (protection seller) agrees to provide payment to the other party (protection buyer) should a credit event occur against the underlying, which could be a specified debt (the reference obligation), a specific debt issuer (reference entity), a basket of reference entities and/or reference obligations, or a credit index (reference index)"
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "CDS"},
   :cmns-av/adaptedFrom
   "ISO 10962:2019, Securities and related financial instruments - Classification of financial instruments (CFI) code",
   :cmns-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "Note that the effective date of the contract indicates the starting date of the credit protection defined therein."}
    {:rdf/language "en",
     :rdf/value
     "According to a 2022 working paper from the Federal Reserve, \"credit default swaps (CDS) are, by far, the most common type of credit derivative. They are financial instruments that allow the transfer of credit risk among market participants, potentially facilitating greater efficiency in the pricing and distribution of credit risk. In its most basic form, a CDS is a contract where a 'protection buyer' agrees to make periodic payments (the CDS 'spread' or premium) over a predetermined number of years (the maturity or term of the CDS) to a 'protection seller' in exchange for a payment from the protection seller in the event of default by a 'reference entity.' CDS premiums tend to be paid quarterly and are set as a percentage of the total amount of protection bought (the 'notional amount' of the contract). CDS maturities generally range from one to ten years, with the five-year maturity being particularly common.\" See https://www.federalreserve.gov/econres/feds/files/2022023pap.pdf for more detail."}],
   :db/ident :fibo-der-cr-cds/CreditDefaultSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit default swap"},
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-der-cr-cds/SettlementAuction,
                      :owl/onProperty :fibo-fnd-dt-oc/hasOccurrence,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom
                      :fibo-der-cr-cds/CreditProtectionTerms,
                      :rdf/type :owl/Restriction}
                     :fibo-der-drc-swp/Swap
                     {:owl/onProperty     :fibo-der-cr-cds/hasContractPrice,
                      :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryPrice,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-bsc/CreditDerivative
                     {:owl/onProperty     :fibo-fbc-fct-ra/specifies,
                      :owl/someValuesFrom :fibo-der-cr-cds/TriggeringEvent,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "bilateral contract in which one party (protection seller) agrees to provide payment to the other party (protection buyer) should a credit event occur against the underlying, which could be a specified debt (the reference obligation), a specific debt issuer (reference entity), a basket of reference entities and/or reference obligations, or a credit index (reference index)"}})

(def CreditEventNotice
  "irrevocable written or verbal notice that states that a triggering event has occurred"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Notices of certain kinds of credit events are required as a condition of a credit default swap. Such notices are sent from a notifying party (either the buyer or the seller) to the counterparty. They provide information that assists the contract parties in determining whether a triggering credit event has occurred."},
   :db/ident :fibo-der-cr-cds/CreditEventNotice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit event notice"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/isProvidedBy,
                      :owl/someValuesFrom :fibo-der-cr-cds/NotifyingParty,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-arr-doc/isAbout,
                      :owl/someValuesFrom :fibo-der-cr-cds/TriggeringEvent,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-doc/Notice],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "irrevocable written or verbal notice that states that a triggering event has occurred"}})

(def CreditProtectionTerms
  "legal terms that define triggering events and associated conditions related to settlement"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Note that there may be additional payment schedules or a more complex calculation formula required depending on the terms of the contract."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "contingent leg"},
   :db/ident :fibo-der-cr-cds/CreditProtectionTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit protection terms"},
   :rdfs/subClassOf
   [{:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fnd-dt-fd/ExplicitDate,
     :owl/onProperty :fibo-der-cr-cds/hasScheduledTerminationDate,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fct-ra/specifies,
     :owl/someValuesFrom :fibo-der-cr-cds/DeliverableObligation,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-pas-pas/hasSeller,
     :owl/someValuesFrom :fibo-der-cr-cds/DeliverableObligationSeller,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-pas-pas/hasBuyer,
     :owl/someValuesFrom :fibo-der-cr-cds/DeliverableObligationBuyer,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/boolean,
     :owl/onProperty  :fibo-der-cr-cds/allowsSubstitution,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fct-ra/specifies,
     :owl/someValuesFrom :fibo-der-cr-cds/TriggeringEvent,
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-bsc/DerivativeTerms],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "legal terms that define triggering events and associated conditions related to settlement"}})

(def DeliverableObligation
  "asset that must be delivered as a part of the process of settling a credit default swap"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "If the reference obligation is a bond, the deliverable asset (obligation) may be a different bond. If it is a loan, the deliverable asset may involve assigment of a loan."},
   :db/ident :fibo-der-cr-cds/DeliverableObligation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "deliverable asset"},
   :rdfs/subClassOf :fibo-fnd-oac-own/Asset,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "asset that must be delivered as a part of the process of settling a credit default swap"}})

(def DeliverableObligationBuyer
  "contract party that is obliged to purchase a deliverable obligation (asset) if a triggering event occurs, depending on the event and the contract"
  {:db/ident :fibo-der-cr-cds/DeliverableObligationBuyer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "deliverable obligation buyer"},
   :rdfs/subClassOf [:fibo-fnd-pas-pas/Buyer :fibo-fnd-agr-ctr/ContractParty],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "contract party that is obliged to purchase a deliverable obligation (asset) if a triggering event occurs, depending on the event and the contract"}})

(def DeliverableObligationSeller
  "contract party that is obliged to sell a deliverable obligation (asset) if a triggering event occurs, depending on the event and the contract"
  {:db/ident :fibo-der-cr-cds/DeliverableObligationSeller,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "deliverable obligation seller"},
   :rdfs/subClassOf [:fibo-fnd-pas-pas/Seller :fibo-fnd-agr-ctr/ContractParty],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "contract party that is obliged to sell a deliverable obligation (asset) if a triggering event occurs, depending on the event and the contract"}})

(def EscrowAgent
  "third party that holds an asset or funds before they are formally transferred from one party to another party, per the terms of a contract, within some specified time period and/or when a triggering event occurs"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Use of an escrow agent is one possible mechanism that may be used in some cases, as specified in a credit default swap contract, for delivery purposes."},
   :db/ident :fibo-der-cr-cds/EscrowAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "escrow agent"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/holds,
                      :owl/someValuesFrom
                      :fibo-der-cr-cds/DeliverableObligation,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-agr-ctr/ContractThirdParty
                     :fibo-fbc-pas-fpas/RegisteredAgent],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "third party that holds an asset or funds before they are formally transferred from one party to another party, per the terms of a contract, within some specified time period and/or when a triggering event occurs"}})

(def IndexCreditDefaultSwap
  "credit default swap that references a family of standardized credit derivative indices, where the underlying reference entities are a defined basket of credit from a particular geographic region (e.g. Asia, North America, Europe), and/or credit rating level (e.g. emerging markets, high yield, investment grade)"
  {:cmns-av/adaptedFrom
   ["ISO 10962:2019, Securities and related financial instruments - Classification of financial instruments (CFI) code"
    "Draft paper on Credit Default Swaps from the Federal Reserve Board, available at https://www.federalreserve.gov/econres/feds/files/2022023pap.pdf"],
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Credit default indices trade in standard maturities, and the reference entities are typically the most liquid; the reference portfolio is reassessed periodically to maintain this."},
   :db/ident :fibo-der-cr-cds/IndexCreditDefaultSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "index credit default swap"},
   :rdfs/subClassOf :fibo-der-cr-cds/MultiNameCreditDefaultSwap,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit default swap that references a family of standardized credit derivative indices, where the underlying reference entities are a defined basket of credit from a particular geographic region (e.g. Asia, North America, Europe), and/or credit rating level (e.g. emerging markets, high yield, investment grade)"}})

(def IndexTrancheCreditDefaultSwap
  "credit default swap that references a synthetic collateralized debt obligation (CDO) based on a credit index where each tranche references a different segment of the loss distribution of the underlying index"
  {:cmns-av/adaptedFrom
   "ISO 10962:2019, Securities and related financial instruments - Classification of financial instruments (CFI) code",
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Each tranche has a different priority of claims on the principal and interest flows from the collateral pool, and is traditionally portioned into rising levels of seniority."},
   :db/ident :fibo-der-cr-cds/IndexTrancheCreditDefaultSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "index tranche credit default swap"},
   :rdfs/subClassOf :fibo-der-cr-cds/MultiNameCreditDefaultSwap,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit default swap that references a synthetic collateralized debt obligation (CDO) based on a credit index where each tranche references a different segment of the loss distribution of the underlying index"}})

(def LoanCreditDefaultSwap
  "credit default swap whose underlying reference obligation is limited strictly to syndicated secured loans, rather than any type of corporate debt"
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "LCDS"},
   :db/ident :fibo-der-cr-cds/LoanCreditDefaultSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "loan credit default swap"},
   :rdfs/subClassOf :fibo-der-cr-cds/CreditDefaultSwap,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit default swap whose underlying reference obligation is limited strictly to syndicated secured loans, rather than any type of corporate debt"}})

(def MultiNameCreditDefaultSwap
  "credit default swap that references more than one obligation or borrower"
  {:cmns-av/adaptedFrom
   ["ISO 10962:2019, Securities and related financial instruments - Classification of financial instruments (CFI) code"
    "Draft paper on Credit Default Swaps from the Federal Reserve Board, available at https://www.federalreserve.gov/econres/feds/files/2022023pap.pdf"],
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "For instance, a multiname contract could be written to cover defaults in a reference portfolio (such as in the case of a basket credit default swap) or, as has been increasingly common over the past couple of decades,be based on an index of commonly negotiated single-name CDS. The latter are generally called CDS indexes."},
   :cmns-av/synonym "multiname credit default swap",
   :db/ident :fibo-der-cr-cds/MultiNameCreditDefaultSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "multi-name credit default swap"},
   :rdfs/subClassOf :fibo-der-cr-cds/CreditDefaultSwap,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit default swap that references more than one obligation or borrower"}})

(def NotifyingParty
  "party responsible for issuing one or more formal notices indicating that an event that is relevant to a given contract has taken place"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The notifying party is the party that notifies the other party when a credit or other triggering event has occurred by means of a credit event notice. If more than one party is referenced as being the notifying party then either party may notify the other of such an occurrence."},
   :db/ident :fibo-der-cr-cds/NotifyingParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "notifying party"},
   :rdfs/subClassOf [{:owl/unionOf [:fibo-fnd-agr-ctr/ContractParty
                                    :fibo-fnd-agr-ctr/ContractThirdParty],
                      :rdf/type    :owl/Class}
                     :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "party responsible for issuing one or more formal notices indicating that an event that is relevant to a given contract has taken place"}})

(def SettlementAuction
  "independently administered synthetic auction process on a set of defined deliverable obligations that sets the reference final price that can be used to facilitate cash settlement of all covered transactions following a credit event"
  {:cmns-av/adaptedFrom
   "ISO 10962:2019, Securities and related financial instruments - Classification of financial instruments (CFI) code",
   :db/ident :fibo-der-cr-cds/SettlementAuction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "settlement auction"},
   :rdfs/subClassOf :fibo-fbc-fi-stl/SettlementEvent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "independently administered synthetic auction process on a set of defined deliverable obligations that sets the reference final price that can be used to facilitate cash settlement of all covered transactions following a credit event"}})

(def SingleNameCreditDefaultSwap
  "credit default swap whose underlying risk is a single reference obligation, or a single reference entity, such as a corporation or a sovereign borrower"
  {:cmns-av/adaptedFrom
   ["ISO 10962:2019, Securities and related financial instruments - Classification of financial instruments (CFI) code"
    "Draft paper on Credit Default Swaps from the Federal Reserve Board, available at https://www.federalreserve.gov/econres/feds/files/2022023pap.pdf"],
   :db/ident :fibo-der-cr-cds/SingleNameCreditDefaultSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "single name credit default swap"},
   :rdfs/subClassOf :fibo-der-cr-cds/CreditDefaultSwap,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit default swap whose underlying risk is a single reference obligation, or a single reference entity, such as a corporation or a sovereign borrower"}})

(def TriggeringEvent
  "event that relates to or triggers some aspect of a credit default swap"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A triggering event is typically a credit event, but could be anything that happens in the marketplace. For example, a weather-specific contract could be triggered by a hurricane - which wouldn't be considered a credit event per se."},
   :db/ident :fibo-der-cr-cds/TriggeringEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "triggering event"},
   :rdfs/subClassOf :fibo-fnd-dt-oc/Occurrence,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "event that relates to or triggers some aspect of a credit default swap"}})

(def allowsSubstitution
  "indicates whether it is possible to substitute other obligations in place of the specified deliverable obligation"
  {:db/ident :fibo-der-cr-cds/allowsSubstitution,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-cr-cds/CreditProtectionTerms,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "allows substitution"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates whether it is possible to substitute other obligations in place of the specified deliverable obligation"}})

(def hasContractPrice
  "specifies a predetermined price at which the buyer purchases the credit default swap contract"
  {:db/ident :fibo-der-cr-cds/hasContractPrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has contract price"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryPrice,
   :rdfs/subPropertyOf [:fibo-fnd-acc-cur/hasPrice
                        :fibo-fnd-acc-cur/hasNotionalAmount],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "specifies a predetermined price at which the buyer purchases the credit default swap contract"}})

(def hasMinimumQuotationAmount
  "indicates a minimum intended threshold amount of outstanding principal balance of the reference obligation for which the quote should be obtained"
  {:db/ident :fibo-der-cr-cds/hasMinimumQuotationAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-stl/CashSettlementTerms,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has minimum quotation amount"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates a minimum intended threshold amount of outstanding principal balance of the reference obligation for which the quote should be obtained"}})

(def hasQuotationMethod
  "indicates the nature of the pricing quotations to be requested from banks and/or dealers when determining the market value of the reference obligation for purposes of cash settlement"
  {:db/ident :fibo-der-cr-cds/hasQuotationMethod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-stl/CashSettlementTerms,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has quotation method"},
   :rdfs/range :fibo-der-cr-cds/CashSettlementMethod,
   :rdfs/subPropertyOf :fibo-fbc-fi-ip/hasPriceDeterminationMethod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the nature of the pricing quotations to be requested from banks and/or dealers when determining the market value of the reference obligation for purposes of cash settlement"}})

(def hasScheduledTerminationDate
  "date on which credit protection is due to expire as agreed by both parties"
  {:db/ident :fibo-der-cr-cds/hasScheduledTerminationDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-cr-cds/CreditProtectionTerms,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "scheduled termination date"},
   :rdfs/range :fibo-fnd-dt-fd/ExplicitDate,
   :rdfs/subPropertyOf :fibo-fnd-arr-doc/hasTerminationDate,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "date on which credit protection is due to expire as agreed by both parties"}})

(def ^{:private true} ObligationSpecificCreditEvent
  {:db/ident        :fibo-fbc-dae-cre/ObligationSpecificCreditEvent,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :fibo-der-cr-cds/TriggeringEvent})

(def ^{:private true} AuctionMethod
  "method for determining a price that represents use of an independently administered synthetic auction in order to set a price"
  {:db/ident :fibo-fbc-fi-ip/AuctionMethod,
   :rdf/type [:fibo-fbc-fi-ip/PriceDeterminationMethod :owl/NamedIndividual],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "auction method"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "method for determining a price that represents use of an independently administered synthetic auction in order to set a price"}})

(def ^{:private true} CashSettlementTerms
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Note that the valuation determined via the appraisal of the underlying asset may include a quotation that is either an upper limit to the outstanding principal balance of the reference obligation for which the quote should be obtained, or a floating rate payer calculation amount."},
   :db/ident        :fibo-fbc-fi-stl/CashSettlementTerms,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [{:owl/onProperty :fibo-fbc-fi-ip/hasPricingSource,
                      :owl/someValuesFrom
                      {:owl/unionOf [:fibo-be-fct-pub/Publisher
                                     :fibo-fbc-pas-fpas/FinancialServiceProvider
                                     :fibo-fbc-pas-fpas/Dealer
                                     :fibo-fbc-fi-ip/PricingModel
                                     :fibo-fbc-fct-mkt/Exchange
                                     :fibo-fbc-fi-ip/CompositeMarket],
                       :rdf/type    :owl/Class},
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty
                      :fibo-der-cr-cds/hasMinimumQuotationAmount,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-der-drc-bsc/ValuationTerms,
                      :owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-der-cr-cds/CashSettlementMethod,
                      :owl/onProperty :fibo-der-cr-cds/hasQuotationMethod,
                      :rdf/type       :owl/Restriction}]})

(def ^{:private true} PhysicalSettlementTerms
  {:db/ident        :fibo-fbc-fi-stl/PhysicalSettlementTerms,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf {:owl/minQualifiedCardinality 0,
                     :owl/onClass    :fibo-der-cr-cds/EscrowAgent,
                     :owl/onProperty :fibo-fbc-fct-ra/specifies,
                     :rdf/type       :owl/Restriction}})