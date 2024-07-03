(ns net.wikipunk.rdf.fibo-fbc-fi-stl
  {:cmns-av/copyright
   #{"Copyright (c) 2018-2024 EDM Council, Inc."
     "Copyright (c) 2018-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/Settlement/",
   :dcterms/abstract
   "This ontology defines high-level concepts for settlement that are applicable across FIBO domain areas, such as for loans, securities, and derivatives.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-qtu" "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
    "dcterms" "http://purl.org/dc/terms/",
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
    "fibo-fnd-arr-asmt"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
    "fibo-fnd-dt-bd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/BusinessDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/InstrumentPricing/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Agreements/Contracts/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/Settlement/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-fi-stl",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Settlement Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement.rdf version of this ontology was revised to better integrate settlement with the overall lifecycle of a contract (FBC-317)"
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement.rdf version of this ontology was revised to integrate the notion of a value assessment with a settlement event and to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement.rdf version of this ontology was revised to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/"})

(def CashSettlementTerms
  {:cmns-av/explanatoryNote
   "Note that the security price represents a price per share or per lot, whereas the settlement amount represents a total.",
   :db/ident :fibo-fbc-fi-stl/CashSettlementTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cash settlement terms"},
   :rdfs/subClassOf #{{:owl/hasValue   :fibo-fbc-fi-stl/DeliveryInCash,
                       :owl/onProperty :fibo-fbc-fi-stl/hasDeliveryMethod,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :fibo-fbc-fi-stl/hasSettlementAmount,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryAmount,
                       :rdf/type           :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fbc-fi-ip/SecurityPrice,
                       :owl/onProperty :fibo-fnd-acc-cur/hasPrice,
                       :rdf/type       :owl/Restriction}
                      :fibo-fbc-pas-fpas/SettlementTerms},
   :skos/definition "contractual commitment to settle in cash"})

(def DeliveryInCash
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-fbc-fi-stl/DeliveryInCash,
   :rdf/type #{:owl/NamedIndividual :fibo-fbc-fi-stl/DeliveryMethod},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/"},
   :rdfs/label "delivery in cash",
   :skos/definition
   "commitment to deliver an amount of money at the earliest available date as per settlement convention"})

(def DeliveryMethod
  {:db/ident :fibo-fbc-fi-stl/DeliveryMethod,
   :rdf/type #{:fibo-fnd-agr-ctr/ContractualCommitment :owl/Class},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "delivery method"},
   :rdfs/subClassOf :fibo-fnd-gao-obj/DistributionStrategy,
   :skos/definition
   "method and commitment to transfer a commodity, currency, security, cash or another instrument as defined in the settlement terms of the contract"})

(def ElectAtExerciseMethod
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-fbc-fi-stl/ElectAtExerciseMethod,
   :rdf/type #{:owl/NamedIndividual :fibo-fbc-fi-stl/DeliveryMethod},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "elect at exercise method"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "commitment to determine the delivery strategy at the time of exercise"}})

(def NonDeliverableMethod
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-fbc-fi-stl/NonDeliverableMethod,
   :rdf/type #{:owl/NamedIndividual :fibo-fbc-fi-stl/DeliveryMethod},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non-deliverable method"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "commitment with respect to synthetic options on foreign exchange forwards that are based on non-convertible or thinly traded currencies"}})

(def PhysicalDeliveryMethod
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-fbc-fi-stl/PhysicalDeliveryMethod,
   :rdf/type #{:owl/NamedIndividual :fibo-fbc-fi-stl/DeliveryMethod},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "physical delivery method"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "commitment to settle an obligation through the receipt or delivery of the actual underlying instrument(s) or other asset, such as a commodity, instead of through cash settlement"}})

(def PhysicalSettlementTerms
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "If you sell a gold futures contract of say 100 troy ounces then you have to deliver real gold to the buyer on the mutually agreed date. Most derivatives are not actually exercised, but are traded out before their delivery date. However, physical delivery still occurs with some trades: it is most common with commodities, but can also occur with other financial instruments."},
   :db/ident :fibo-fbc-fi-stl/PhysicalSettlementTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "physical settlement terms"},
   :rdfs/subClassOf #{{:owl/hasValue   :fibo-fbc-fi-stl/PhysicalDeliveryMethod,
                       :owl/onProperty :fibo-fbc-fi-stl/hasDeliveryMethod,
                       :rdf/type       :owl/Restriction}
                      :fibo-fbc-pas-fpas/SettlementTerms},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "commitment to deliver the actual underlying asset on the specified delivery date, rather than cash"}})

(def Settlement
  {:db/ident :fibo-fbc-fi-stl/Settlement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "settlement"},
   :rdfs/subClassOf :fibo-fbc-pas-fpas/ContractLifecycleEvent,
   :skos/definition
   "act of finalizing a transaction, including but not limited to finalizing accounting, exchanging consideration, and/or legally recording documents, as applicable"})

(def SettlementConvention
  {:cmns-av/explanatoryNote
   "This is often stated in the form 'T+n' where n is the number of business days from the specified settlement date (T).",
   :db/ident :fibo-fbc-fi-stl/SettlementConvention,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/"},
   :rdfs/label "settlement convention",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-qtu/hasNumericValue,
                       :owl/someValuesFrom :xsd/positiveInteger,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-dt-bd/Convention},
   :skos/definition
   "convention employed to determine the closing date (from the stated settlement date) in the process of settling a transaction on which securities or interests in securities are delivered, usually against (in simultaneous exchange for) payment of some consideration"})

(def SettlementEvent
  {:db/ident :fibo-fbc-fi-stl/SettlementEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "settlement event"},
   :rdfs/subClassOf #{:fibo-fbc-pas-fpas/ContractLifecycleEventOccurrence
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fbc-fi-ip/SecurityPrice,
                       :owl/onProperty :fibo-fnd-acc-cur/hasPrice,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-arr-asmt/ValueAssessment,
                       :owl/onProperty :fibo-fnd-rel-rel/involves,
                       :rdf/type       :owl/Restriction}
                      {:owl/onClass    :fibo-fbc-fi-stl/Settlement,
                       :owl/onProperty :fibo-fnd-rel-rel/exemplifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "specific event involving the finalization a transaction or portion thereof, including but not limited to finalizing accounting, exchanging consideration, and/or legally recording documents, as applicable"})

(def hasDeliveryMethod
  {:db/ident :fibo-fbc-fi-stl/hasDeliveryMethod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/SettlementTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has settlement method"},
   :rdfs/range :fibo-fbc-fi-stl/DeliveryMethod,
   :rdfs/subPropertyOf :fibo-fnd-gao-obj/hasStrategy,
   :skos/definition
   "specifies the strategy for settlement from a delivery perspective"})

(def hasPreferredSettlementCurrency
  {:cmns-av/explanatoryNote
   "This property should only be used in cases where the settlement currency is distinct from the currency in which the instrument is denominated.",
   :db/ident :fibo-fbc-fi-stl/hasPreferredSettlementCurrency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/SettlementTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/"},
   :rdfs/label "has preferred settlement currency",
   :rdfs/range :fibo-fnd-acc-cur/Currency,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasCurrency,
   :skos/definition "indicates the preferred currency for settlement purposes"})

(def hasSettlementAmount
  {:db/ident :fibo-fbc-fi-stl/hasSettlementAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/SettlementTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has settlement amount"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   "indicates the monetary amount required for cash settlement"})

(def isFractionalEligible
  {:db/ident :fibo-fbc-fi-stl/isFractionalEligible,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/SettlementTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/"},
   :rdfs/label "is fractional eligible",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether the security can contain fractional share/amounts"})

(def isFullyAutomatedSecuritiesTransferApplicable
  {:cmns-av/abbreviation "is FAST applicable",
   :cmns-av/explanatoryNote
   "The Fast Automated Securities Transfer Program (FAST) is a contract between DTC (and its subsidiaries) and transfer agents whereby FAST agents act as custodians for DTC.",
   :db/ident :fibo-fbc-fi-stl/isFullyAutomatedSecuritiesTransferApplicable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/SettlementTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/"},
   :rdfs/label "is fully automated securities transfer applicable",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether the security is to be held at the transfer agent as part of the FAST (Fully Automated Securities Transfer) program"})

(def urn:uuid:c6b3df9c-5513-55a8-a258-a3d23f67f1cc
  {:cmns-av/copyright
   #{"Copyright (c) 2018-2024 EDM Council, Inc."
     "Copyright (c) 2018-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines high-level concepts for settlement that are applicable across FIBO domain areas, such as for loans, securities, and derivatives.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/BusinessDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/InstrumentPricing/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Agreements/Contracts/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/Settlement/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Settlement Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement.rdf version of this ontology was revised to better integrate settlement with the overall lifecycle of a contract (FBC-317)"
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement.rdf version of this ontology was revised to integrate the notion of a value assessment with a settlement event and to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement.rdf version of this ontology was revised to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/"})