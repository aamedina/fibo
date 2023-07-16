(ns net.wikipunk.rdf.fibo-der-cr-cds
  "Credit default swaps are financial instruments that allow the transfer of credit risk among market participants, potentially facilitating greater efficiency in the pricing and distribution/offset of credit risk. They are bilateral contracts in which one party (the protection seller) agrees to provide payment(s) to the other party (the protection buyer) should a credit event occur against the underlying. The underlier for a CDS may be a specified debt (the reference obligation), a specific debt issuer (reference entity), in which case the credit events involving the entity is what triggers the payment, a basket of reference entities and/or reference obligations, or a credit index (reference index). This ontology defines the concept of a basic credit default swap as well as more specific kinds of CDS and specifies related details."
  {:cmns-av/copyright ["Copyright (c) 2013-2023 EDM Council, Inc."
                       "Copyright (c) 2013-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :dcterms/abstract
   "Credit default swaps are financial instruments that allow the transfer of credit risk among market participants, potentially facilitating greater efficiency in the pricing and distribution/offset of credit risk. They are bilateral contracts in which one party (the protection seller) agrees to provide payment(s) to the other party (the protection buyer) should a credit event occur against the underlying. The underlier for a CDS may be a specified debt (the reference obligation), a specific debt issuer (reference entity), in which case the credit events involving the entity is what triggers the payment, a basket of reference entities and/or reference obligations, or a credit index (reference index). This ontology defines the concept of a basic credit default swap as well as more specific kinds of CDS and specifies related details.",
   :dcterms/license {:rdfa/uri "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/ProductsAndServices/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/Ownership/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/Settlement/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/Collections/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/Swaps/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/Publishers/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/CreditEvents/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/DerivativesBasics/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/Markets/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/DatesAndTimes/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/Occurrences/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/InstrumentPricing/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
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
   :rdfs/label #xsd/langString "Credit Default Swaps Ontology@en",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps.rdf version of this ontology was modified to move the property, 'is conferred on' to the Legal Capacity ontology and to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."]})

(def AssetBackedCreditDefaultSwap
  "credit default swap whose underlying reference obligation is an asset-backed security rather than corporate credit"
  {:cmns-av/abbreviation #xsd/langString "ABCDS@en",
   :cmns-av/explanatoryNote
   #xsd/langString
    "In the case of an ABCDS, the buyer receives protection for defaults on asset-backed securities or tranches of securities, rather than protecting against the default of a particular issuer. Asset-backed securities are securities backed by a pool of loans or receivables, such as auto loans, home equity loans or credit cards loans.@en",
   :db/ident :fibo-der-cr-cds/AssetBackedCreditDefaultSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label #xsd/langString "asset-backed credit default swap@en",
   :rdfs/subClassOf [:fibo-der-cr-cds/CreditDefaultSwap
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-der-cr-cds/SettlementAuction,
                      :owl/onProperty :fibo-fnd-dt-oc/hasOccurrence,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-ra/specifies,
                      :owl/someValuesFrom :fibo-der-cr-cds/TriggeringEvent,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom
                      :fibo-der-cr-cds/CreditProtectionTerms,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-der-cr-cds/hasContractPrice,
                      :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryPrice,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-bsc/CreditDerivative
                     :fibo-der-drc-swp/Swap],
   :skos/definition
   #xsd/langString
    "credit default swap whose underlying reference obligation is an asset-backed security rather than corporate credit@en"})

(def BasketCreditDefaultSwap
  "credit default swap that references a bespoke, synthetic portfolio of underlying assets whose components have been agreed to for a specific OTC derivative by the parties to the transaction"
  {:cmns-av/adaptedFrom
   [{:xsd/string
     "ISO 10962:2019, Securities and related financial instruments - Classification of financial instruments (CFI) code"}
    {:xsd/string
     "Draft paper on Credit Default Swaps from the Federal Reserve Board, available at https://www.federalreserve.gov/econres/feds/files/2022023pap.pdf"}],
   :db/ident :fibo-der-cr-cds/BasketCreditDefaultSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label #xsd/langString "basket credit default swap@en",
   :rdfs/subClassOf [:fibo-der-cr-cds/MultiNameCreditDefaultSwap
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-der-cr-cds/SettlementAuction,
                      :owl/onProperty :fibo-fnd-dt-oc/hasOccurrence,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-ra/specifies,
                      :owl/someValuesFrom :fibo-der-cr-cds/TriggeringEvent,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom
                      :fibo-der-cr-cds/CreditProtectionTerms,
                      :rdf/type :owl/Restriction}
                     :fibo-der-cr-cds/CreditDefaultSwap
                     {:owl/onProperty     :fibo-der-cr-cds/hasContractPrice,
                      :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryPrice,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-bsc/CreditDerivative
                     :fibo-der-drc-swp/Swap],
   :skos/definition
   #xsd/langString
    "credit default swap that references a bespoke, synthetic portfolio of underlying assets whose components have been agreed to for a specific OTC derivative by the parties to the transaction@en"})

(def CashSettlementMethod
  "strategy for calculating or otherwise establishing a reference final price for the contract"
  {:cmns-av/adaptedFrom
   {:xsd/string
    "ISO 10962:2019, Securities and related financial instruments - Classification of financial instruments (CFI) code"},
   :cmns-av/explanatoryNote
   #xsd/langString
    "The method may include an independently administered synthetic auction process that sets the reference final price.@en",
   :db/ident :fibo-der-cr-cds/CashSettlementMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label #xsd/langString "cash settlement method@en",
   :rdfs/subClassOf :fibo-fbc-fi-ip/PriceDeterminationMethod,
   :skos/definition
   #xsd/langString
    "strategy for calculating or otherwise establishing a reference final price for the contract@en"})

(def ContingentCreditDefaultSwap
  "credit default swap in which an additional triggering event is required"
  {:cmns-av/abbreviation #xsd/langString "CCDS@en",
   :cmns-av/explanatoryNote
   #xsd/langString
    "In a contingent credit default swap, the trigger requires both a credit event (as in a traditional credit default swap) and another specified event. The additional specified event is usually a significant movement in an index covering equities, commodities, interest rates, or some other overall measure of the economy or relevant industry.@en",
   :db/ident :fibo-der-cr-cds/ContingentCreditDefaultSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label #xsd/langString "contingent credit default swap@en",
   :rdfs/subClassOf [:fibo-der-cr-cds/CreditDefaultSwap
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-der-cr-cds/SettlementAuction,
                      :owl/onProperty :fibo-fnd-dt-oc/hasOccurrence,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-ra/specifies,
                      :owl/someValuesFrom :fibo-der-cr-cds/TriggeringEvent,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom
                      :fibo-der-cr-cds/CreditProtectionTerms,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-der-cr-cds/hasContractPrice,
                      :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryPrice,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-bsc/CreditDerivative
                     :fibo-der-drc-swp/Swap],
   :skos/definition
   #xsd/langString
    "credit default swap in which an additional triggering event is required@en"})

(def CreditDefaultSwap
  "bilateral contract in which one party (protection seller) agrees to provide payment to the other party (protection buyer) should a credit event occur against the underlying, which could be a specified debt (the reference obligation), a specific debt issuer (reference entity), a basket of reference entities and/or reference obligations, or a credit index (reference index)"
  {:cmns-av/abbreviation #xsd/langString "CDS@en",
   :cmns-av/adaptedFrom
   {:xsd/string
    "ISO 10962:2019, Securities and related financial instruments - Classification of financial instruments (CFI) code"},
   :cmns-av/explanatoryNote
   [#xsd/langString
     "Note that the effective date of the contract indicates the starting date of the credit protection defined therein.@en"
    #xsd/langString
     "According to a 2022 working paper from the Federal Reserve, \"credit default swaps (CDS) are, by far, the most common type of credit derivative. They are financial instruments that allow the transfer of credit risk among market participants, potentially facilitating greater efficiency in the pricing and distribution of credit risk. In its most basic form, a CDS is a contract where a 'protection buyer' agrees to make periodic payments (the CDS 'spread' or premium) over a predetermined number of years (the maturity or term of the CDS) to a 'protection seller' in exchange for a payment from the protection seller in the event of default by a 'reference entity.' CDS premiums tend to be paid quarterly and are set as a percentage of the total amount of protection bought (the 'notional amount' of the contract). CDS maturities generally range from one to ten years, with the five-year maturity being particularly common.\" See https://www.federalreserve.gov/econres/feds/files/2022023pap.pdf for more detail.@en"],
   :db/ident :fibo-der-cr-cds/CreditDefaultSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label #xsd/langString "credit default swap@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom
                      :fibo-der-cr-cds/CreditProtectionTerms,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-der-cr-cds/SettlementAuction,
                      :owl/onProperty :fibo-fnd-dt-oc/hasOccurrence,
                      :rdf/type       :owl/Restriction}
                     :fibo-der-drc-swp/Swap
                     {:owl/onProperty     :fibo-fbc-fct-ra/specifies,
                      :owl/someValuesFrom :fibo-der-cr-cds/TriggeringEvent,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-der-cr-cds/hasContractPrice,
                      :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryPrice,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-bsc/CreditDerivative],
   :skos/definition
   #xsd/langString
    "bilateral contract in which one party (protection seller) agrees to provide payment to the other party (protection buyer) should a credit event occur against the underlying, which could be a specified debt (the reference obligation), a specific debt issuer (reference entity), a basket of reference entities and/or reference obligations, or a credit index (reference index)@en"})

(def CreditEventNotice
  "irrevocable written or verbal notice that states that a triggering event has occurred"
  {:cmns-av/explanatoryNote
   #xsd/langString
    "Notices of certain kinds of credit events are required as a condition of a credit default swap. Such notices are sent from a notifying party (either the buyer or the seller) to the counterparty. They provide information that assists the contract parties in determining whether a triggering credit event has occurred.@en",
   :db/ident :fibo-der-cr-cds/CreditEventNotice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label #xsd/langString "credit event notice@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/isProvidedBy,
                      :owl/someValuesFrom :fibo-der-cr-cds/NotifyingParty,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-arr-doc/isAbout,
                      :owl/someValuesFrom :fibo-der-cr-cds/TriggeringEvent,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-doc/Notice],
   :skos/definition
   #xsd/langString
    "irrevocable written or verbal notice that states that a triggering event has occurred@en"})

(def CreditProtectionTerms
  "legal terms that define triggering events and associated conditions related to settlement"
  {:cmns-av/explanatoryNote
   #xsd/langString
    "Note that there may be additional payment schedules or a more complex calculation formula required depending on the terms of the contract.@en",
   :cmns-av/synonym #xsd/langString "contingent leg@en",
   :db/ident :fibo-der-cr-cds/CreditProtectionTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label #xsd/langString "credit protection terms@en",
   :rdfs/subClassOf
   [{:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
     :owl/onDataRange :xsd/boolean,
     :owl/onProperty  :fibo-der-cr-cds/allowsSubstitution,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fct-ra/specifies,
     :owl/someValuesFrom :fibo-der-cr-cds/DeliverableObligation,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-pas-pas/hasBuyer,
     :owl/someValuesFrom :fibo-der-cr-cds/DeliverableObligationBuyer,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
     :owl/onClass    :cmns-dt/ExplicitDate,
     :owl/onProperty :fibo-der-cr-cds/hasScheduledTerminationDate,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fct-ra/specifies,
     :owl/someValuesFrom :fibo-der-cr-cds/TriggeringEvent,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-pas-pas/hasSeller,
     :owl/someValuesFrom :fibo-der-cr-cds/DeliverableObligationSeller,
     :rdf/type           :owl/Restriction}
    :fibo-der-drc-bsc/DerivativeTerms],
   :skos/definition
   #xsd/langString
    "legal terms that define triggering events and associated conditions related to settlement@en"})

(def DeliverableObligation
  "asset that must be delivered as a part of the process of settling a credit default swap"
  {:cmns-av/explanatoryNote
   #xsd/langString
    "If the reference obligation is a bond, the deliverable asset (obligation) may be a different bond. If it is a loan, the deliverable asset may involve assigment of a loan.@en",
   :db/ident :fibo-der-cr-cds/DeliverableObligation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label #xsd/langString "deliverable asset@en",
   :rdfs/subClassOf :fibo-fnd-oac-own/Asset,
   :skos/definition
   #xsd/langString
    "asset that must be delivered as a part of the process of settling a credit default swap@en"})

(def DeliverableObligationBuyer
  "contract party that is obliged to purchase a deliverable obligation (asset) if a triggering event occurs, depending on the event and the contract"
  {:db/ident :fibo-der-cr-cds/DeliverableObligationBuyer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label #xsd/langString "deliverable obligation buyer@en",
   :rdfs/subClassOf [:fibo-fnd-pas-pas/Buyer :fibo-fnd-agr-ctr/ContractParty],
   :skos/definition
   #xsd/langString
    "contract party that is obliged to purchase a deliverable obligation (asset) if a triggering event occurs, depending on the event and the contract@en"})

(def DeliverableObligationSeller
  "contract party that is obliged to sell a deliverable obligation (asset) if a triggering event occurs, depending on the event and the contract"
  {:db/ident :fibo-der-cr-cds/DeliverableObligationSeller,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label #xsd/langString "deliverable obligation seller@en",
   :rdfs/subClassOf [:fibo-fnd-pas-pas/Seller :fibo-fnd-agr-ctr/ContractParty],
   :skos/definition
   #xsd/langString
    "contract party that is obliged to sell a deliverable obligation (asset) if a triggering event occurs, depending on the event and the contract@en"})

(def EscrowAgent
  "third party that holds an asset or funds before they are formally transferred from one party to another party, per the terms of a contract, within some specified time period and/or when a triggering event occurs"
  {:cmns-av/explanatoryNote
   #xsd/langString
    "Use of an escrow agent is one possible mechanism that may be used in some cases, as specified in a credit default swap contract, for delivery purposes.@en",
   :db/ident :fibo-der-cr-cds/EscrowAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label #xsd/langString "escrow agent@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/holds,
                      :owl/someValuesFrom
                      :fibo-der-cr-cds/DeliverableObligation,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-agr-ctr/ContractThirdParty
                     :fibo-fbc-pas-fpas/RegisteredAgent],
   :skos/definition
   #xsd/langString
    "third party that holds an asset or funds before they are formally transferred from one party to another party, per the terms of a contract, within some specified time period and/or when a triggering event occurs@en"})

(def IndexCreditDefaultSwap
  "credit default swap that references a family of standardized credit derivative indices, where the underlying reference entities are a defined basket of credit from a particular geographic region (e.g. Asia, North America, Europe), and/or credit rating level (e.g. emerging markets, high yield, investment grade)"
  {:cmns-av/adaptedFrom
   [{:xsd/string
     "ISO 10962:2019, Securities and related financial instruments - Classification of financial instruments (CFI) code"}
    {:xsd/string
     "Draft paper on Credit Default Swaps from the Federal Reserve Board, available at https://www.federalreserve.gov/econres/feds/files/2022023pap.pdf"}],
   :cmns-av/explanatoryNote
   #xsd/langString
    "Credit default indices trade in standard maturities, and the reference entities are typically the most liquid; the reference portfolio is reassessed periodically to maintain this.@en",
   :db/ident :fibo-der-cr-cds/IndexCreditDefaultSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label #xsd/langString "index credit default swap@en",
   :rdfs/subClassOf [:fibo-der-cr-cds/MultiNameCreditDefaultSwap
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-der-cr-cds/SettlementAuction,
                      :owl/onProperty :fibo-fnd-dt-oc/hasOccurrence,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-ra/specifies,
                      :owl/someValuesFrom :fibo-der-cr-cds/TriggeringEvent,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom
                      :fibo-der-cr-cds/CreditProtectionTerms,
                      :rdf/type :owl/Restriction}
                     :fibo-der-cr-cds/CreditDefaultSwap
                     {:owl/onProperty     :fibo-der-cr-cds/hasContractPrice,
                      :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryPrice,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-bsc/CreditDerivative
                     :fibo-der-drc-swp/Swap],
   :skos/definition
   #xsd/langString
    "credit default swap that references a family of standardized credit derivative indices, where the underlying reference entities are a defined basket of credit from a particular geographic region (e.g. Asia, North America, Europe), and/or credit rating level (e.g. emerging markets, high yield, investment grade)@en"})

(def IndexTrancheCreditDefaultSwap
  "credit default swap that references a synthetic collateralized debt obligation (CDO) based on a credit index where each tranche references a different segment of the loss distribution of the underlying index"
  {:cmns-av/adaptedFrom
   {:xsd/string
    "ISO 10962:2019, Securities and related financial instruments - Classification of financial instruments (CFI) code"},
   :cmns-av/explanatoryNote
   #xsd/langString
    "Each tranche has a different priority of claims on the principal and interest flows from the collateral pool, and is traditionally portioned into rising levels of seniority.@en",
   :db/ident :fibo-der-cr-cds/IndexTrancheCreditDefaultSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label #xsd/langString "index tranche credit default swap@en",
   :rdfs/subClassOf [:fibo-der-cr-cds/MultiNameCreditDefaultSwap
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-der-cr-cds/SettlementAuction,
                      :owl/onProperty :fibo-fnd-dt-oc/hasOccurrence,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-ra/specifies,
                      :owl/someValuesFrom :fibo-der-cr-cds/TriggeringEvent,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom
                      :fibo-der-cr-cds/CreditProtectionTerms,
                      :rdf/type :owl/Restriction}
                     :fibo-der-cr-cds/CreditDefaultSwap
                     {:owl/onProperty     :fibo-der-cr-cds/hasContractPrice,
                      :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryPrice,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-bsc/CreditDerivative
                     :fibo-der-drc-swp/Swap],
   :skos/definition
   #xsd/langString
    "credit default swap that references a synthetic collateralized debt obligation (CDO) based on a credit index where each tranche references a different segment of the loss distribution of the underlying index@en"})

(def LoanCreditDefaultSwap
  "credit default swap whose underlying reference obligation is limited strictly to syndicated secured loans, rather than any type of corporate debt"
  {:cmns-av/abbreviation #xsd/langString "LCDS@en",
   :db/ident :fibo-der-cr-cds/LoanCreditDefaultSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label #xsd/langString "loan credit default swap@en",
   :rdfs/subClassOf [:fibo-der-cr-cds/CreditDefaultSwap
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-der-cr-cds/SettlementAuction,
                      :owl/onProperty :fibo-fnd-dt-oc/hasOccurrence,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-ra/specifies,
                      :owl/someValuesFrom :fibo-der-cr-cds/TriggeringEvent,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom
                      :fibo-der-cr-cds/CreditProtectionTerms,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-der-cr-cds/hasContractPrice,
                      :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryPrice,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-bsc/CreditDerivative
                     :fibo-der-drc-swp/Swap],
   :skos/definition
   #xsd/langString
    "credit default swap whose underlying reference obligation is limited strictly to syndicated secured loans, rather than any type of corporate debt@en"})

(def MultiNameCreditDefaultSwap
  "credit default swap that references more than one obligation or borrower"
  {:cmns-av/adaptedFrom
   [{:xsd/string
     "ISO 10962:2019, Securities and related financial instruments - Classification of financial instruments (CFI) code"}
    {:xsd/string
     "Draft paper on Credit Default Swaps from the Federal Reserve Board, available at https://www.federalreserve.gov/econres/feds/files/2022023pap.pdf"}],
   :cmns-av/explanatoryNote
   #xsd/langString
    "For instance, a multiname contract could be written to cover defaults in a reference portfolio (such as in the case of a basket credit default swap) or, as has been increasingly common over the past couple of decades,be based on an index of commonly negotiated single-name CDS. The latter are generally called CDS indexes.@en",
   :cmns-av/synonym "multiname credit default swap",
   :db/ident :fibo-der-cr-cds/MultiNameCreditDefaultSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label #xsd/langString "multi-name credit default swap@en",
   :rdfs/subClassOf [:fibo-der-cr-cds/CreditDefaultSwap
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-der-cr-cds/SettlementAuction,
                      :owl/onProperty :fibo-fnd-dt-oc/hasOccurrence,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-ra/specifies,
                      :owl/someValuesFrom :fibo-der-cr-cds/TriggeringEvent,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom
                      :fibo-der-cr-cds/CreditProtectionTerms,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-der-cr-cds/hasContractPrice,
                      :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryPrice,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-bsc/CreditDerivative
                     :fibo-der-drc-swp/Swap],
   :skos/definition
   #xsd/langString
    "credit default swap that references more than one obligation or borrower@en"})

(def NotifyingParty
  "party responsible for issuing one or more formal notices indicating that an event that is relevant to a given contract has taken place"
  {:cmns-av/explanatoryNote
   #xsd/langString
    "The notifying party is the party that notifies the other party when a credit or other triggering event has occurred by means of a credit event notice. If more than one party is referenced as being the notifying party then either party may notify the other of such an occurrence.@en",
   :db/ident :fibo-der-cr-cds/NotifyingParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label #xsd/langString "notifying party@en",
   :rdfs/subClassOf [{:owl/unionOf [:fibo-fnd-agr-ctr/ContractParty
                                    :fibo-fnd-agr-ctr/ContractThirdParty],
                      :rdf/type    :owl/Class}
                     :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition
   #xsd/langString
    "party responsible for issuing one or more formal notices indicating that an event that is relevant to a given contract has taken place@en"})

(def SettlementAuction
  "independently administered synthetic auction process on a set of defined deliverable obligations that sets the reference final price that can be used to facilitate cash settlement of all covered transactions following a credit event"
  {:cmns-av/adaptedFrom
   {:xsd/string
    "ISO 10962:2019, Securities and related financial instruments - Classification of financial instruments (CFI) code"},
   :db/ident :fibo-der-cr-cds/SettlementAuction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label #xsd/langString "settlement auction@en",
   :rdfs/subClassOf :fibo-fbc-fi-stl/SettlementEvent,
   :skos/definition
   #xsd/langString
    "independently administered synthetic auction process on a set of defined deliverable obligations that sets the reference final price that can be used to facilitate cash settlement of all covered transactions following a credit event@en"})

(def SingleNameCreditDefaultSwap
  "credit default swap whose underlying risk is a single reference obligation, or a single reference entity, such as a corporation or a sovereign borrower"
  {:cmns-av/adaptedFrom
   [{:xsd/string
     "ISO 10962:2019, Securities and related financial instruments - Classification of financial instruments (CFI) code"}
    {:xsd/string
     "Draft paper on Credit Default Swaps from the Federal Reserve Board, available at https://www.federalreserve.gov/econres/feds/files/2022023pap.pdf"}],
   :db/ident :fibo-der-cr-cds/SingleNameCreditDefaultSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label #xsd/langString "single name credit default swap@en",
   :rdfs/subClassOf [:fibo-der-cr-cds/CreditDefaultSwap
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-der-cr-cds/SettlementAuction,
                      :owl/onProperty :fibo-fnd-dt-oc/hasOccurrence,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-ra/specifies,
                      :owl/someValuesFrom :fibo-der-cr-cds/TriggeringEvent,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom
                      :fibo-der-cr-cds/CreditProtectionTerms,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-der-cr-cds/hasContractPrice,
                      :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryPrice,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-bsc/CreditDerivative
                     :fibo-der-drc-swp/Swap],
   :skos/definition
   #xsd/langString
    "credit default swap whose underlying risk is a single reference obligation, or a single reference entity, such as a corporation or a sovereign borrower@en"})

(def TriggeringEvent
  "event that relates to or triggers some aspect of a credit default swap"
  {:cmns-av/explanatoryNote
   #xsd/langString
    "A triggering event is typically a credit event, but could be anything that happens in the marketplace. For example, a weather-specific contract could be triggered by a hurricane - which wouldn't be considered a credit event per se.@en",
   :db/ident :fibo-der-cr-cds/TriggeringEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label #xsd/langString "triggering event@en",
   :rdfs/subClassOf :fibo-fnd-dt-oc/Occurrence,
   :skos/definition
   #xsd/langString
    "event that relates to or triggers some aspect of a credit default swap@en"})

(def allowsSubstitution
  "indicates whether it is possible to substitute other obligations in place of the specified deliverable obligation"
  {:db/ident :fibo-der-cr-cds/allowsSubstitution,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-cr-cds/CreditProtectionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label #xsd/langString "allows substitution@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #xsd/langString
    "indicates whether it is possible to substitute other obligations in place of the specified deliverable obligation@en"})

(def hasContractPrice
  "specifies a predetermined price at which the buyer purchases the credit default swap contract"
  {:db/ident :fibo-der-cr-cds/hasContractPrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label #xsd/langString "has contract price@en",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryPrice,
   :rdfs/subPropertyOf [:fibo-fnd-acc-cur/hasPrice
                        :fibo-fnd-acc-cur/hasNotionalAmount],
   :skos/definition
   #xsd/langString
    "specifies a predetermined price at which the buyer purchases the credit default swap contract@en"})

(def hasMinimumQuotationAmount
  "indicates a minimum intended threshold amount of outstanding principal balance of the reference obligation for which the quote should be obtained"
  {:db/ident :fibo-der-cr-cds/hasMinimumQuotationAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-stl/CashSettlementTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label #xsd/langString "has minimum quotation amount@en",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   #xsd/langString
    "indicates a minimum intended threshold amount of outstanding principal balance of the reference obligation for which the quote should be obtained@en"})

(def hasQuotationMethod
  "indicates the nature of the pricing quotations to be requested from banks and/or dealers when determining the market value of the reference obligation for purposes of cash settlement"
  {:db/ident :fibo-der-cr-cds/hasQuotationMethod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-stl/CashSettlementTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label #xsd/langString "has quotation method@en",
   :rdfs/range :fibo-der-cr-cds/CashSettlementMethod,
   :rdfs/subPropertyOf :fibo-fbc-fi-ip/hasPriceDeterminationMethod,
   :skos/definition
   #xsd/langString
    "indicates the nature of the pricing quotations to be requested from banks and/or dealers when determining the market value of the reference obligation for purposes of cash settlement@en"})

(def hasScheduledTerminationDate
  "date on which credit protection is due to expire as agreed by both parties"
  {:db/ident :fibo-der-cr-cds/hasScheduledTerminationDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-cr-cds/CreditProtectionTerms,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label #xsd/langString "scheduled termination date@en",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf :fibo-fnd-arr-doc/hasTerminationDate,
   :skos/definition
   #xsd/langString
    "date on which credit protection is due to expire as agreed by both parties@en"})