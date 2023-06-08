(ns net.wikipunk.rdf.fibo-fbc-fi-stl
  "This ontology defines high-level concepts for settlement that are applicable across FIBO domain areas, such as for loans, securities, and derivatives."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 EDM Council, Inc."
                       "Copyright (c) 2018-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/",
   :dcterms/abstract
   "This ontology defines high-level concepts for settlement that are applicable across FIBO domain areas, such as for loans, securities, and derivatives.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/GoalsAndObjectives/Objectives/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/BusinessDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Quantities/QuantitiesAndUnits/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/Occurrences/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/InstrumentPricing/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/Settlement/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
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
    "fibo-fnd-dt-oc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
    "fibo-fnd-qt-qtu"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
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
   :rdfa/prefix "fibo-fbc-fi-stl",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/",
   :rdfs/label #voc/lstr "Settlement Ontology@en",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement.rdf version of this ontology was revised to integrate the notion of a value assessment with a settlement event and to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."]})

(def CashSettlementTerms
  "contractual commitment to settle in cash"
  {:cmns-av/explanatoryNote
   "Note that the security price represents a price per share or per lot, whereas the settlement amount represents a total.",
   :db/ident :fibo-fbc-fi-stl/CashSettlementTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/",
   :rdfs/label #voc/lstr "cash settlement terms@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-fi-stl/hasSettlementAmount,
                      :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryAmount,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-fi-ip/SecurityPrice,
                      :owl/onProperty :fibo-fnd-acc-cur/hasPrice,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   :fibo-fbc-fi-stl/DeliveryInCash,
                      :owl/onProperty :fibo-fbc-fi-stl/hasDeliveryMethod,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-pas-fpas/SettlementTerms
                     {:owl/onProperty     :fibo-fbc-fct-ra/specifies,
                      :owl/someValuesFrom :fibo-fbc-fi-stl/SettlementConvention,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fi-stl/hasDeliveryMethod,
                      :owl/someValuesFrom :fibo-fbc-fi-stl/DeliveryMethod,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-fbc-fi-stl/Settlement,
                      :rdf/type           :owl/Restriction}],
   :skos/definition "contractual commitment to settle in cash"})

(def DeliveryInCash
  "commitment to deliver an amount of money at the earliest available date as per settlement convention"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :db/ident :fibo-fbc-fi-stl/DeliveryInCash,
   :rdf/type [:fibo-fbc-fi-stl/DeliveryMethod
              :owl/NamedIndividual
              :fibo-fnd-gao-obj/DistributionStrategy],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/",
   :rdfs/label "delivery in cash",
   :skos/definition
   "commitment to deliver an amount of money at the earliest available date as per settlement convention"})

(def DeliveryMethod
  "method and commitment to transfer a commodity, currency, security, cash or another instrument as defined in the settlement terms of the contract"
  {:db/ident :fibo-fbc-fi-stl/DeliveryMethod,
   :rdf/type [:fibo-fnd-agr-ctr/ContractualCommitment :owl/Class],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/",
   :rdfs/label #voc/lstr "delivery method@en",
   :rdfs/subClassOf :fibo-fnd-gao-obj/DistributionStrategy,
   :skos/definition
   "method and commitment to transfer a commodity, currency, security, cash or another instrument as defined in the settlement terms of the contract"})

(def ElectAtExerciseMethod
  "commitment to determine the delivery strategy at the time of exercise"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :db/ident :fibo-fbc-fi-stl/ElectAtExerciseMethod,
   :rdf/type [:fibo-fbc-fi-stl/DeliveryMethod
              :owl/NamedIndividual
              :fibo-fnd-gao-obj/DistributionStrategy],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/",
   :rdfs/label #voc/lstr "elect at exercise method@en",
   :skos/definition
   #voc/lstr
    "commitment to determine the delivery strategy at the time of exercise@en"})

(def NonDeliverableMethod
  "commitment with respect to synthetic options on foreign exchange forwards that are based on non-convertible or thinly traded currencies"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :db/ident :fibo-fbc-fi-stl/NonDeliverableMethod,
   :rdf/type [:fibo-fbc-fi-stl/DeliveryMethod
              :owl/NamedIndividual
              :fibo-fnd-gao-obj/DistributionStrategy],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/",
   :rdfs/label #voc/lstr "non-deliverable method@en",
   :skos/definition
   #voc/lstr
    "commitment with respect to synthetic options on foreign exchange forwards that are based on non-convertible or thinly traded currencies@en"})

(def PhysicalDeliveryMethod
  "commitment to settle an obligation through the receipt or delivery of the actual underlying instrument(s) or other asset, such as a commodity, instead of through cash settlement"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :db/ident :fibo-fbc-fi-stl/PhysicalDeliveryMethod,
   :rdf/type [:fibo-fbc-fi-stl/DeliveryMethod
              :owl/NamedIndividual
              :fibo-fnd-gao-obj/DistributionStrategy],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/",
   :rdfs/label #voc/lstr "physical delivery method@en",
   :skos/definition
   #voc/lstr
    "commitment to settle an obligation through the receipt or delivery of the actual underlying instrument(s) or other asset, such as a commodity, instead of through cash settlement@en"})

(def PhysicalSettlementTerms
  "commitment to deliver the actual underlying asset on the specified delivery date, rather than cash"
  {:cmns-av/adaptedFrom
   #voc/lstr
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019@en",
   :cmns-av/explanatoryNote
   #voc/lstr
    "If you sell a gold futures contract of say 100 troy ounces then you have to deliver real gold to the buyer on the mutually agreed date. Most derivatives are not actually exercised, but are traded out before their delivery date. However, physical delivery still occurs with some trades: it is most common with commodities, but can also occur with other financial instruments.@en",
   :db/ident :fibo-fbc-fi-stl/PhysicalSettlementTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/",
   :rdfs/label #voc/lstr "physical settlement terms@en",
   :rdfs/subClassOf [{:owl/hasValue   :fibo-fbc-fi-stl/PhysicalDeliveryMethod,
                      :owl/onProperty :fibo-fbc-fi-stl/hasDeliveryMethod,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-pas-fpas/SettlementTerms
                     {:owl/onProperty     :fibo-fbc-fct-ra/specifies,
                      :owl/someValuesFrom :fibo-fbc-fi-stl/SettlementConvention,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fi-stl/hasDeliveryMethod,
                      :owl/someValuesFrom :fibo-fbc-fi-stl/DeliveryMethod,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-fbc-fi-stl/Settlement,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "commitment to deliver the actual underlying asset on the specified delivery date, rather than cash@en"})

(def Settlement
  "act of finalizing a transaction, including but not limited to finalizing accounting, exchanging consideration, and/or legally recording documents, as applicable"
  {:db/ident :fibo-fbc-fi-stl/Settlement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/",
   :rdfs/label #voc/lstr "settlement@en",
   :rdfs/subClassOf :fibo-fnd-dt-oc/OccurrenceKind,
   :skos/definition
   "act of finalizing a transaction, including but not limited to finalizing accounting, exchanging consideration, and/or legally recording documents, as applicable"})

(def SettlementConvention
  "convention employed to determine the closing date (from the stated settlement date) in the process of settling a transaction on which securities or interests in securities are delivered, usually against (in simultaneous exchange for) payment of some consideration"
  {:cmns-av/explanatoryNote
   "This is often stated in the form 'T+n' where n is the number of business days from the specified settlement date (T).",
   :db/ident :fibo-fbc-fi-stl/SettlementConvention,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/",
   :rdfs/label "settlement convention",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-qt-qtu/hasNumericValue,
                      :owl/someValuesFrom :xsd/positiveInteger,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-bd/Convention],
   :skos/definition
   "convention employed to determine the closing date (from the stated settlement date) in the process of settling a transaction on which securities or interests in securities are delivered, usually against (in simultaneous exchange for) payment of some consideration"})

(def SettlementEvent
  "specific event involving the finalization a transaction or portion thereof, including but not limited to finalizing accounting, exchanging consideration, and/or legally recording documents, as applicable"
  {:db/ident :fibo-fbc-fi-stl/SettlementEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/",
   :rdfs/label #voc/lstr "settlement event@en",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fbc-fi-stl/Settlement,
                      :owl/onProperty :fibo-fnd-dt-oc/exemplifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-arr-asmt/ValueAssessment,
                      :owl/onProperty :fibo-fnd-rel-rel/involves,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-fi-ip/SecurityPrice,
                      :owl/onProperty :fibo-fnd-acc-cur/hasPrice,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence],
   :skos/definition
   "specific event involving the finalization a transaction or portion thereof, including but not limited to finalizing accounting, exchanging consideration, and/or legally recording documents, as applicable"})

(def hasDeliveryMethod
  "specifies the strategy for settlement from a delivery perspective"
  {:db/ident :fibo-fbc-fi-stl/hasDeliveryMethod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/SettlementTerms,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/",
   :rdfs/label #voc/lstr "has settlement method@en",
   :rdfs/range :fibo-fbc-fi-stl/DeliveryMethod,
   :rdfs/subPropertyOf :fibo-fnd-gao-obj/hasStrategy,
   :skos/definition
   "specifies the strategy for settlement from a delivery perspective"})

(def hasPreferredSettlementCurrency
  "indicates the preferred currency for settlement purposes"
  {:cmns-av/explanatoryNote
   "This property should only be used in cases where the settlement currency is distinct from the currency in which the instrument is denominated.",
   :db/ident :fibo-fbc-fi-stl/hasPreferredSettlementCurrency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/SettlementTerms,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/",
   :rdfs/label "has preferred settlement currency",
   :rdfs/range :fibo-fnd-acc-cur/Currency,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasCurrency,
   :skos/definition "indicates the preferred currency for settlement purposes"})

(def hasSettlementAmount
  "indicates the monetary amount required for cash settlement"
  {:db/ident :fibo-fbc-fi-stl/hasSettlementAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/SettlementTerms,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/",
   :rdfs/label #voc/lstr "has settlement amount@en",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   "indicates the monetary amount required for cash settlement"})

(def isFractionalEligible
  "indicates whether the security can contain fractional share/amounts"
  {:db/ident :fibo-fbc-fi-stl/isFractionalEligible,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/SettlementTerms,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/",
   :rdfs/label "is fractional eligible",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether the security can contain fractional share/amounts"})

(def isFullyAutomatedSecuritiesTransferApplicable
  "indicates whether the security is to be held at the transfer agent as part of the FAST (Fully Automated Securities Transfer) program"
  {:cmns-av/abbreviation "is FAST applicable",
   :cmns-av/explanatoryNote
   "The Fast Automated Securities Transfer Program (FAST) is a contract between DTC (and its subsidiaries) and transfer agents whereby FAST agents act as custodians for DTC.",
   :db/ident :fibo-fbc-fi-stl/isFullyAutomatedSecuritiesTransferApplicable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/SettlementTerms,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/",
   :rdfs/label "is fully automated securities transfer applicable",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether the security is to be held at the transfer agent as part of the FAST (Fully Automated Securities Transfer) program"})