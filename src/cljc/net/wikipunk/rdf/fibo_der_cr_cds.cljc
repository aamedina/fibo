(ns net.wikipunk.rdf.fibo-der-cr-cds
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/CreditDerivatives/CreditDefaultSwaps/",
   :dcterms/abstract
   "Credit default swaps are financial instruments that allow the transfer of credit risk among market participants, potentially facilitating greater efficiency in the pricing and distribution/offset of credit risk. They are bilateral contracts in which one party (the protection seller) agrees to provide payment(s) to the other party (the protection buyer) should a credit event occur against the underlying. The underlier for a CDS may be a specified debt (the reference obligation), a specific debt issuer (reference entity), in which case the credit events involving the entity is what triggers the payment, a basket of reference entities and/or reference obligations, or a credit index (reference index). This ontology defines the concept of a basic credit default swap as well as more specific kinds of CDS and specifies related details.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
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
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
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
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-mkt-bas"
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Arrangements/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/MarketIndices/BasketIndices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/Swaps/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/FunctionalEntities/Publishers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/InstrumentPricing/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/Markets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/Settlement/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/DebtAndEquities/CreditEvents/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-der-cr-cds",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit Default Swaps Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps.rdf version of the ontology was modified to replace additional concepts from FIBO FND with their counterparts in the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps.rdf version of the ontology was modified to eliminate a subproperty relationship between the contract price and notional amount, which may not be appropriate (DER-127), and to replace concepts from several FIBO FND ontologies with their counterparts added to the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps.rdf version of this ontology was modified to move the nominal for auction market from CDS to the pricing ontology (its IRI was that of the instrument pricing ontology but it was mistakenly in the CDS ontology) and simplify the definition (DER-140)."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps.rdf version of this ontology was modified to move the property, 'is conferred on' to the Legal Capacity ontology and to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps.rdf version of this ontology was modified to add the concept of a credit default swap index."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"})

(def AssetBackedCreditDefaultSwap
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "ABCDS"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "In the case of an ABCDS, the buyer receives protection for defaults on asset-backed securities or tranches of securities, rather than protecting against the default of a particular issuer. Asset-backed securities are securities backed by a pool of loans or receivables, such as auto loans, home equity loans or credit cards loans."},
   :db/ident :fibo-der-cr-cds/AssetBackedCreditDefaultSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "asset-backed credit default swap"},
   :rdfs/subClassOf :fibo-der-cr-cds/CreditDefaultSwap,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit default swap whose underlying reference obligation is an asset-backed security rather than corporate credit"}})

(def BasketCreditDefaultSwap
  {:cmns-av/adaptedFrom
   #{{:rdf/value
      "ISO 10962:2019, Securities and related financial instruments - Classification of financial instruments (CFI) code"}
     {:rdf/value
      "Draft paper on Credit Default Swaps from the Federal Reserve Board, available at https://www.federalreserve.gov/econres/feds/files/2022023pap.pdf"}},
   :db/ident :fibo-der-cr-cds/BasketCreditDefaultSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "basket credit default swap"},
   :rdfs/subClassOf :fibo-der-cr-cds/MultiNameCreditDefaultSwap,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit default swap that references a bespoke, synthetic portfolio of underlying assets whose components have been agreed to for a specific OTC derivative by the parties to the transaction"}})

(def BasketOfCreditDefaultSwaps
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Note that the CDS Index is broken down into tranches depending on different types of credits, for example, investment grade and high yield. Tranches are defined by attachment and detachment points for the index loss distribution. It means that when default events occur the lower-level tranches absorb the loss up to the detachment point, before moving to the next senior tranche."},
   :db/ident :fibo-der-cr-cds/BasketOfCreditDefaultSwaps,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "basket of credit default swaps"},
   :rdfs/subClassOf #{:fibo-fbc-pas-fpas/WeightedBasket
                      :fibo-fnd-dt-fd/DatedStructuredCollection
                      {:owl/onProperty     :cmns-col/hasConstituent,
                       :owl/someValuesFrom :fibo-der-cr-cds/CreditDefaultSwap,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "basket of reference obligations are credit default swap instruments"}})

(def CashSettlementMethod
  {:cmns-av/adaptedFrom
   {:rdf/value
    "ISO 10962:2019, Securities and related financial instruments - Classification of financial instruments (CFI) code"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The method may include an independently administered synthetic auction process that sets the reference final price."},
   :db/ident :fibo-der-cr-cds/CashSettlementMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cash settlement method"},
   :rdfs/subClassOf :fibo-fbc-fi-ip/PriceDeterminationMethod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "strategy for calculating or otherwise establishing a reference final price for the contract"}})

(def ContingentCreditDefaultSwap
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "CCDS"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "In a contingent credit default swap, the trigger requires both a credit event (as in a traditional credit default swap) and another specified event. The additional specified event is usually a significant movement in an index covering equities, commodities, interest rates, or some other overall measure of the economy or relevant industry."},
   :db/ident :fibo-der-cr-cds/ContingentCreditDefaultSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "contingent credit default swap"},
   :rdfs/subClassOf :fibo-der-cr-cds/CreditDefaultSwap,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit default swap in which an additional triggering event is required"}})

(def CreditDefaultSwap
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "CDS"},
   :cmns-av/adaptedFrom
   {:rdf/value
    "ISO 10962:2019, Securities and related financial instruments - Classification of financial instruments (CFI) code"},
   :cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "According to a 2022 working paper from the Federal Reserve, \"credit default swaps (CDS) are, by far, the most common type of credit derivative. They are financial instruments that allow the transfer of credit risk among market participants, potentially facilitating greater efficiency in the pricing and distribution of credit risk. In its most basic form, a CDS is a contract where a 'protection buyer' agrees to make periodic payments (the CDS 'spread' or premium) over a predetermined number of years (the maturity or term of the CDS) to a 'protection seller' in exchange for a payment from the protection seller in the event of default by a 'reference entity.' CDS premiums tend to be paid quarterly and are set as a percentage of the total amount of protection bought (the 'notional amount' of the contract). CDS maturities generally range from one to ten years, with the five-year maturity being particularly common.\" See https://www.federalreserve.gov/econres/feds/files/2022023pap.pdf for more detail."}
     {:rdf/language "en",
      :rdf/value
      "Note that the effective date of the contract indicates the starting date of the credit protection defined therein."}},
   :db/ident :fibo-der-cr-cds/CreditDefaultSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit default swap"},
   :rdfs/subClassOf
   #{{:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-der-cr-cds/SettlementAuction,
      :owl/onProperty :fibo-fnd-dt-oc/hasOccurrence,
      :rdf/type       :owl/Restriction} :fibo-der-drc-bsc/CreditDerivative
     {:owl/onProperty     :fibo-der-cr-cds/hasContractPrice,
      :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryPrice,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fbc-fct-ra/specifies,
      :owl/someValuesFrom :fibo-der-cr-cds/TriggeringEvent,
      :rdf/type           :owl/Restriction} :fibo-der-drc-swp/Swap
     {:owl/onProperty     :fibo-fnd-agr-ctr/hasContractualElement,
      :owl/someValuesFrom :fibo-der-cr-cds/CreditProtectionTerms,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "bilateral contract in which one party (protection seller) agrees to provide payment to the other party (protection buyer) should a credit event occur against the underlying, which could be a specified debt (the reference obligation), a specific debt issuer (reference entity), a basket of reference entities and/or reference obligations, or a credit index (reference index)"}})

(def CreditDefaultSwapIndex
  {:db/ident :fibo-der-cr-cds/CreditDefaultSwapIndex,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit default swap index"},
   :rdfs/subClassOf #{:fibo-ind-mkt-bas/ReferenceIndex
                      {:owl/onProperty :fibo-fbc-dae-dbt/isBasedOn,
                       :owl/someValuesFrom
                       :fibo-der-cr-cds/BasketOfCreditDefaultSwaps,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "index whose underlying reference obligations are credit default swap instruments"}})

(def CreditEventNotice
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Notices of certain kinds of credit events are required as a condition of a credit default swap. Such notices are sent from a notifying party (either the buyer or the seller) to the counterparty. They provide information that assists the contract parties in determining whether a triggering credit event has occurred."},
   :db/ident :fibo-der-cr-cds/CreditEventNotice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit event notice"},
   :rdfs/subClassOf #{:cmns-doc/Notice
                      {:owl/onProperty     :cmns-doc/isAbout,
                       :owl/someValuesFrom :fibo-der-cr-cds/TriggeringEvent,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-rel-rel/isProvidedBy,
                       :owl/someValuesFrom :fibo-der-cr-cds/NotifyingParty,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "irrevocable written or verbal notice that states that a triggering event has occurred"}})

(def CreditProtectionTerms
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Note that there may be additional payment schedules or a more complex calculation formula required depending on the terms of the contract."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "contingent leg"},
   :db/ident :fibo-der-cr-cds/CreditProtectionTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit protection terms"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-pas-pas/hasBuyer,
      :owl/someValuesFrom :fibo-der-cr-cds/DeliverableObligationBuyer,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-pas-pas/hasSeller,
      :owl/someValuesFrom :fibo-der-cr-cds/DeliverableObligationSeller,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fbc-fct-ra/specifies,
      :owl/someValuesFrom :fibo-der-cr-cds/TriggeringEvent,
      :rdf/type           :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :cmns-dt/ExplicitDate,
      :owl/onProperty :fibo-der-cr-cds/hasScheduledTerminationDate,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onDataRange :xsd/boolean,
      :owl/onProperty  :fibo-der-cr-cds/allowsSubstitution,
      :rdf/type        :owl/Restriction} :fibo-der-drc-bsc/DerivativeTerms
     {:owl/onProperty     :fibo-fbc-fct-ra/specifies,
      :owl/someValuesFrom :fibo-der-cr-cds/DeliverableObligation,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "legal terms that define triggering events and associated conditions related to settlement"}})

(def DeliverableObligation
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "If the reference obligation is a bond, the deliverable asset (obligation) may be a different bond. If it is a loan, the deliverable asset may involve assigment of a loan."},
   :db/ident :fibo-der-cr-cds/DeliverableObligation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "deliverable asset"},
   :rdfs/subClassOf :fibo-fnd-oac-own/Asset,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "asset that must be delivered as a part of the process of settling a credit default swap"}})

(def DeliverableObligationBuyer
  {:db/ident :fibo-der-cr-cds/DeliverableObligationBuyer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "deliverable obligation buyer"},
   :rdfs/subClassOf #{:fibo-fnd-agr-ctr/ContractParty :fibo-fnd-pas-pas/Buyer},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "contract party that is obliged to purchase a deliverable obligation (asset) if a triggering event occurs, depending on the event and the contract"}})

(def DeliverableObligationSeller
  {:db/ident :fibo-der-cr-cds/DeliverableObligationSeller,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "deliverable obligation seller"},
   :rdfs/subClassOf #{:fibo-fnd-agr-ctr/ContractParty :fibo-fnd-pas-pas/Seller},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "contract party that is obliged to sell a deliverable obligation (asset) if a triggering event occurs, depending on the event and the contract"}})

(def EscrowAgent
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Use of an escrow agent is one possible mechanism that may be used in some cases, as specified in a credit default swap contract, for delivery purposes."},
   :db/ident :fibo-der-cr-cds/EscrowAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "escrow agent"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-rel-rel/holds,
      :owl/someValuesFrom :fibo-der-cr-cds/DeliverableObligation,
      :rdf/type           :owl/Restriction} :fibo-fbc-pas-fpas/RegisteredAgent
     :fibo-fnd-agr-ctr/ContractThirdParty},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "third party that holds an asset or funds before they are formally transferred from one party to another party, per the terms of a contract, within some specified time period and/or when a triggering event occurs"}})

(def IndexCreditDefaultSwap
  {:cmns-av/adaptedFrom
   #{{:rdf/value
      "ISO 10962:2019, Securities and related financial instruments - Classification of financial instruments (CFI) code"}
     {:rdf/value
      "Draft paper on Credit Default Swaps from the Federal Reserve Board, available at https://www.federalreserve.gov/econres/feds/files/2022023pap.pdf"}},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Credit default indices trade in standard maturities, and the reference entities are typically the most liquid; the reference portfolio is reassessed periodically to maintain this."},
   :db/ident :fibo-der-cr-cds/IndexCreditDefaultSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "index credit default swap"},
   :rdfs/subClassOf :fibo-der-cr-cds/MultiNameCreditDefaultSwap,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit default swap that references a family of standardized credit derivative indices, where the underlying reference entities are a defined basket of credit from a particular geographic region (e.g. Asia, North America, Europe), and/or credit rating level (e.g. emerging markets, high yield, investment grade)"}})

(def IndexTrancheCreditDefaultSwap
  {:cmns-av/adaptedFrom
   {:rdf/value
    "ISO 10962:2019, Securities and related financial instruments - Classification of financial instruments (CFI) code"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Each tranche has a different priority of claims on the principal and interest flows from the collateral pool, and is traditionally portioned into rising levels of seniority."},
   :db/ident :fibo-der-cr-cds/IndexTrancheCreditDefaultSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "index tranche credit default swap"},
   :rdfs/subClassOf :fibo-der-cr-cds/MultiNameCreditDefaultSwap,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit default swap that references a synthetic collateralized debt obligation (CDO) based on a credit index where each tranche references a different segment of the loss distribution of the underlying index"}})

(def LoanCreditDefaultSwap
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "LCDS"},
   :db/ident :fibo-der-cr-cds/LoanCreditDefaultSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "loan credit default swap"},
   :rdfs/subClassOf :fibo-der-cr-cds/CreditDefaultSwap,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit default swap whose underlying reference obligation is limited strictly to syndicated secured loans, rather than any type of corporate debt"}})

(def MultiNameCreditDefaultSwap
  {:cmns-av/adaptedFrom
   #{{:rdf/value
      "ISO 10962:2019, Securities and related financial instruments - Classification of financial instruments (CFI) code"}
     {:rdf/value
      "Draft paper on Credit Default Swaps from the Federal Reserve Board, available at https://www.federalreserve.gov/econres/feds/files/2022023pap.pdf"}},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "For instance, a multiname contract could be written to cover defaults in a reference portfolio (such as in the case of a basket credit default swap) or, as has been increasingly common over the past couple of decades,be based on an index of commonly negotiated single-name CDS. The latter are generally called CDS indexes."},
   :cmns-av/synonym "multiname credit default swap",
   :db/ident :fibo-der-cr-cds/MultiNameCreditDefaultSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "multi-name credit default swap"},
   :rdfs/subClassOf :fibo-der-cr-cds/CreditDefaultSwap,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit default swap that references more than one obligation or borrower"}})

(def NotifyingParty
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The notifying party is the party that notifies the other party when a credit or other triggering event has occurred by means of a credit event notice. If more than one party is referenced as being the notifying party then either party may notify the other of such an occurrence."},
   :db/ident :fibo-der-cr-cds/NotifyingParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "notifying party"},
   :rdfs/subClassOf #{:cmns-pts/PartyRole
                      {:owl/unionOf [:fibo-fnd-agr-ctr/ContractParty
                                     :fibo-fnd-agr-ctr/ContractThirdParty],
                       :rdf/type    :owl/Class}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "party responsible for issuing one or more formal notices indicating that an event that is relevant to a given contract has taken place"}})

(def SettlementAuction
  {:cmns-av/adaptedFrom
   {:rdf/value
    "ISO 10962:2019, Securities and related financial instruments - Classification of financial instruments (CFI) code"},
   :db/ident :fibo-der-cr-cds/SettlementAuction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "settlement auction"},
   :rdfs/subClassOf :fibo-fbc-fi-stl/SettlementEvent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "independently administered synthetic auction process on a set of defined deliverable obligations that sets the reference final price that can be used to facilitate cash settlement of all covered transactions following a credit event"}})

(def SingleNameCreditDefaultSwap
  {:cmns-av/adaptedFrom
   #{{:rdf/value
      "ISO 10962:2019, Securities and related financial instruments - Classification of financial instruments (CFI) code"}
     {:rdf/value
      "Draft paper on Credit Default Swaps from the Federal Reserve Board, available at https://www.federalreserve.gov/econres/feds/files/2022023pap.pdf"}},
   :db/ident :fibo-der-cr-cds/SingleNameCreditDefaultSwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "single name credit default swap"},
   :rdfs/subClassOf :fibo-der-cr-cds/CreditDefaultSwap,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit default swap whose underlying risk is a single reference obligation, or a single reference entity, such as a corporation or a sovereign borrower"}})

(def TriggeringEvent
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A triggering event is typically a credit event, but could be anything that happens in the marketplace. For example, a weather-specific contract could be triggered by a hurricane - which wouldn't be considered a credit event per se."},
   :db/ident :fibo-der-cr-cds/TriggeringEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "triggering event"},
   :rdfs/subClassOf :fibo-fnd-dt-oc/Occurrence,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "event that relates to or triggers some aspect of a credit default swap"}})

(def allowsSubstitution
  {:db/ident :fibo-der-cr-cds/allowsSubstitution,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-cr-cds/CreditProtectionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "allows substitution"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates whether it is possible to substitute other obligations in place of the specified deliverable obligation"}})

(def hasContractPrice
  {:db/ident :fibo-der-cr-cds/hasContractPrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has contract price"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryPrice,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasPrice,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "specifies a predetermined price at which the buyer purchases the credit default swap contract"}})

(def hasMinimumQuotationAmount
  {:db/ident :fibo-der-cr-cds/hasMinimumQuotationAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-stl/CashSettlementTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has minimum quotation amount"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates a minimum intended threshold amount of outstanding principal balance of the reference obligation for which the quote should be obtained"}})

(def hasQuotationMethod
  {:db/ident :fibo-der-cr-cds/hasQuotationMethod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-stl/CashSettlementTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has quotation method"},
   :rdfs/range :fibo-der-cr-cds/CashSettlementMethod,
   :rdfs/subPropertyOf :fibo-fbc-fi-ip/hasPriceDeterminationMethod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the nature of the pricing quotations to be requested from banks and/or dealers when determining the market value of the reference obligation for purposes of cash settlement"}})

(def hasScheduledTerminationDate
  {:db/ident :fibo-der-cr-cds/hasScheduledTerminationDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-cr-cds/CreditProtectionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "scheduled termination date"},
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf :fibo-fnd-arr-doc/hasTerminationDate,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "date on which credit protection is due to expire as agreed by both parties"}})

(def urn:uuid:338614ac-0343-507e-9d59-be8dcd3e1dbc
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "Credit default swaps are financial instruments that allow the transfer of credit risk among market participants, potentially facilitating greater efficiency in the pricing and distribution/offset of credit risk. They are bilateral contracts in which one party (the protection seller) agrees to provide payment(s) to the other party (the protection buyer) should a credit event occur against the underlying. The underlier for a CDS may be a specified debt (the reference obligation), a specific debt issuer (reference entity), in which case the credit events involving the entity is what triggers the payment, a basket of reference entities and/or reference obligations, or a credit index (reference index). This ontology defines the concept of a basic credit default swap as well as more specific kinds of CDS and specifies related details.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Arrangements/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/MarketIndices/BasketIndices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/Swaps/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/FunctionalEntities/Publishers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/InstrumentPricing/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/Markets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/Settlement/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/DebtAndEquities/CreditEvents/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/CreditDerivatives/CreditDefaultSwaps/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit Default Swaps Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps.rdf version of the ontology was modified to replace additional concepts from FIBO FND with their counterparts in the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps.rdf version of the ontology was modified to eliminate a subproperty relationship between the contract price and notional amount, which may not be appropriate (DER-127), and to replace concepts from several FIBO FND ontologies with their counterparts added to the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps.rdf version of this ontology was modified to move the nominal for auction market from CDS to the pricing ontology (its IRI was that of the instrument pricing ontology but it was mistakenly in the CDS ontology) and simplify the definition (DER-140)."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps.rdf version of this ontology was modified to move the property, 'is conferred on' to the Legal Capacity ontology and to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps.rdf version of this ontology was modified to add the concept of a credit default swap index."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/"})