(ns net.wikipunk.rdf.fibo-sec-eq-eq
  "Core terms are those fundamental to all equity instruments. This ontology also distinguishes between privately held and publicly traded equity instruments, and defines a number of related concepts, such as voting rights."
  {:cmns-av/copyright ["Copyright (c) 2013-2023 EDM Council, Inc."
                       "Copyright (c) 2018-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :dcterms/abstract
   "Core terms are those fundamental to all equity instruments. This ontology also distinguishes between privately held and publicly traded equity instruments, and defines a number of related concepts, such as voting rights.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/ParametricSchedules/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Quantities/QuantitiesAndUnits/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/CorporateOwnership/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Corporations/Corporations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Partnerships/Partnerships/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/InterestRates/InterestRates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Agreements/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/Ownership/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/FinancialServicesEntities/"
    "https://www.omg.org/spec/Commons/Classifiers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/BusinessDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Lifecycles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/AccountingEquity/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/InstrumentPricing/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesListings/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/LegalCapacity/"
    "https://www.omg.org/spec/Commons/DatesAndTimes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/PaymentsAndSchedules/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Equities/EquityInstruments/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-corp-corp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-be-oac-cown"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership/",
    "fibo-be-ptr-ptr"
    "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fbc-fct-fse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fbc-fi-ip"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-aeq"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-agr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-arr-lif"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
    "fibo-fnd-dt-bd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
    "fibo-fnd-law-lcap"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/",
    "fibo-fnd-oac-own"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
    "fibo-fnd-pas-psch"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
    "fibo-fnd-qt-qtu"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-alx"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-ir-ir"
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
    "fibo-sec-eq-eq"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
    "fibo-sec-sec-iss"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/",
    "fibo-sec-sec-lst"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/",
    "fibo-sec-sec-sch"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-eq-eq",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "Equity Instruments Ontology@en",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to add concepts covering additional features of preferred shares, move the two exhaustive CFI-specific classes to the Equity CFI individuals ontology, rename EquityIssuer to ShareIssuer to be clearer about the intent, and add the concept of a price per share."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to replace 'publicly-traded share' with 'exchange-specific share', which is the more commonly used designation and corresponds better with the intended semantics of this concept, to merge in concepts that were formerly in a separate ShareTerms ontology, and eliminate deprecated elements."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to address text formatting hygiene issues."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to incorporate additional features required to map the CFI classification scheme to equity instruments, including features specific to preferred shares."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to refine the definition of share to include a restriction for hasSharesOutstanding, eliminate duplication of concepts in LCC, and add the concept of an equity issuer."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to rename ownership related properties for consistent alignment with the ownership situational pattern and to move properties / restrictions that define how many shares have been issued from the issuer to the share."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to clean up deprecated elements, most of which had been in the ontology for awhile."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to deprecate the notion of a securities restriction specific to a limited partnership fund unit, which required import of unnecessary content and would not be used in practice."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to incorporate a property allowing representation of the share class, streamline the representation of voting rights and payment form, clean up ambiguous definitions, and eliminate redundant restrictions related to security form."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to revise the definition of dividend to explicitly state that it reflects the announced commitment of a specific dividend rather than a more general policy."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to add the notion of a VIE share and integrate dividend distribution method with strategy."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to reflect the move of hasMaturityDate from FinancialInstruments to Debt in FBC and eliminate named individuals for specifying voting rights, which caused issues for some tools."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to refine the definition of listed share, update definitions to remove leading articles, add missing properties and restrictions, revise the definition of dividend."]})

(def AdjustableRateDividend
  "dividend that varies with a benchmark"
  {:cmns-av/explanatoryNote
   "The value of the dividend from the preferred share is set by a predetermined formula to move with rates, and because of this flexibility preferred prices are often more stable then fixed-rate preferred stocks.",
   :db/ident :fibo-sec-eq-eq/AdjustableRateDividend,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "adjustable rate dividend",
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-eq-eq/hasAdjustableDividendRate,
                      :owl/someValuesFrom
                      :fibo-fnd-acc-cur/PercentageMonetaryAmount,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-qt-qtu/hasQuantityKind,
                      :owl/someValuesFrom :fibo-ind-ir-ir/InterestRateBenchmark,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-eq-eq/PreferredDividend
                     :fibo-sec-eq-eq/AdjustableRateDividend
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass :fibo-fnd-acc-cur/PercentageMonetaryAmount,
                      :owl/onProperty :fibo-sec-eq-eq/hasFixedDividendRate,
                      :rdf/type :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :cmns-dt/Duration,
                      :owl/onProperty :fibo-sec-eq-eq/hasDividendGracePeriod,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-agr-agr/Commitment
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fnd-pas-psch/hasPaymentAmount,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-eq-eq/DividendSchedule,
                      :owl/onProperty :fibo-fnd-dt-fd/hasSchedule,
                      :rdf/type       :owl/Restriction}
                     :fibo-sec-eq-eq/Dividend
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass :fibo-sec-eq-eq/DividendDistributionMethod,
                      :owl/onProperty :fibo-sec-eq-eq/hasDistributionMethod,
                      :rdf/type :owl/Restriction}],
   :skos/definition "dividend that varies with a benchmark"})

(def AuctionRateDividend
  "preferred share dividend whose rate is periodically reset through an auction, typically every 7, 14, 28, or 35 days"
  {:db/ident :fibo-sec-eq-eq/AuctionRateDividend,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "auction rate dividend",
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-eq-eq/hasAdjustableDividendRate,
                      :owl/someValuesFrom
                      :fibo-fnd-acc-cur/PercentageMonetaryAmount,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-eq-eq/PreferredDividend
                     :fibo-sec-eq-eq/AuctionRateDividend
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass :fibo-fnd-acc-cur/PercentageMonetaryAmount,
                      :owl/onProperty :fibo-sec-eq-eq/hasFixedDividendRate,
                      :rdf/type :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :cmns-dt/Duration,
                      :owl/onProperty :fibo-sec-eq-eq/hasDividendGracePeriod,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-agr-agr/Commitment
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fnd-pas-psch/hasPaymentAmount,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-eq-eq/DividendSchedule,
                      :owl/onProperty :fibo-fnd-dt-fd/hasSchedule,
                      :rdf/type       :owl/Restriction}
                     :fibo-sec-eq-eq/Dividend
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass :fibo-sec-eq-eq/DividendDistributionMethod,
                      :owl/onProperty :fibo-sec-eq-eq/hasDistributionMethod,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   "preferred share dividend whose rate is periodically reset through an auction, typically every 7, 14, 28, or 35 days"})

(def CommonShare
  "share that signifies a unit of ownership in a corporation and represents a claim on part of the corporation's assets and earnings"
  {:cmns-av/explanatoryNote
   "In the event that the corporation is liquidated, claims of secured and unsecured creditors and owners of bonds and preferred shares take precedence over claims of common share holders.",
   :cmns-av/synonym #voc/lstr "ordinary share@en-GB",
   :db/ident :fibo-sec-eq-eq/CommonShare,
   :owl/disjointWith :fibo-sec-eq-eq/PreferredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "common share@en-US",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-eq-eq/OrdinaryDividend,
                      :owl/onProperty :fibo-sec-eq-eq/hasDividend,
                      :rdf/type       :owl/Restriction}
                     :fibo-sec-eq-eq/Share
                     :fibo-sec-eq-eq/CommonShare
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty
                      :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
                      :owl/someValuesFrom :xsd/decimal,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
                      :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-be-corp-corp/hasSharesAuthorized,
                      :owl/someValuesFrom :xsd/nonNegativeInteger,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
                      :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition
   "share that signifies a unit of ownership in a corporation and represents a claim on part of the corporation's assets and earnings"})

(def ConvertibleCommonShare
  "common share that is convertible into another security"
  {:db/ident :fibo-sec-eq-eq/ConvertibleCommonShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "convertible common share",
   :rdfs/subClassOf [:fibo-sec-sec-iss/ConvertibleSecurity
                     :fibo-sec-eq-eq/CommonShare
                     :fibo-sec-eq-eq/ConvertibleCommonShare
                     :fibo-sec-eq-eq/Share
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty
                      :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
                      :owl/someValuesFrom :xsd/decimal,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
                      :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-be-corp-corp/hasSharesAuthorized,
                      :owl/someValuesFrom :xsd/nonNegativeInteger,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-eq-eq/OrdinaryDividend,
                      :owl/onProperty :fibo-sec-eq-eq/hasDividend,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
                      :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition "common share that is convertible into another security"})

(def ConvertiblePreferredShare
  "preferred share that includes an option for the holder to convert the shares into a fixed number of common shares after a predetermined date"
  {:cmns-av/explanatoryNote
   "Most convertible preferred stock is exchanged at the request of the shareholder, but sometimes there is a provision that allows the company, or issuer, to force conversion. The value of a convertible preferred stock is ultimately based on the performance of the common stock.",
   :db/ident :fibo-sec-eq-eq/ConvertiblePreferredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "convertible preferred share",
   :rdfs/subClassOf
   [:fibo-sec-sec-iss/ConvertibleSecurity
    :fibo-sec-eq-eq/PreferredShare
    :fibo-sec-eq-eq/ConvertiblePreferredShare
    {:owl/onProperty     :fibo-sec-eq-eq/hasDividend,
     :owl/someValuesFrom {:owl/unionOf [:fibo-sec-eq-eq/OrdinaryDividend
                                        :fibo-sec-eq-eq/PreferredDividend],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :cmns-dt/ExplicitDate,
     :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/Share
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/isSeniorTo,
     :owl/someValuesFrom :fibo-sec-eq-eq/CommonShare,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
     :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-corp-corp/hasSharesAuthorized,
     :owl/someValuesFrom :xsd/nonNegativeInteger,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
     :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition
   "preferred share that includes an option for the holder to convert the shares into a fixed number of common shares after a predetermined date"})

(def CumulativePreferredShare
  "preferred share whose dividends, if not paid on time, accumulate until paid out"
  {:cmns-av/explanatoryNote
   "These dividends have precedence over ordinary dividends which cannot be paid until any cumulative dividend obligations have been paid. Dividends are typically deferred due to insufficient earnings or other business reasons.",
   :db/ident :fibo-sec-eq-eq/CumulativePreferredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "cumulative preferred share",
   :rdfs/subClassOf
   [:fibo-sec-eq-eq/PreferredShare
    :fibo-sec-eq-eq/CumulativePreferredShare
    {:owl/onProperty     :fibo-sec-eq-eq/hasDividend,
     :owl/someValuesFrom {:owl/unionOf [:fibo-sec-eq-eq/OrdinaryDividend
                                        :fibo-sec-eq-eq/PreferredDividend],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :cmns-dt/ExplicitDate,
     :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/Share
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/isSeniorTo,
     :owl/someValuesFrom :fibo-sec-eq-eq/CommonShare,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
     :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-corp-corp/hasSharesAuthorized,
     :owl/someValuesFrom :xsd/nonNegativeInteger,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
     :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition
   "preferred share whose dividends, if not paid on time, accumulate until paid out"})

(def Custodian
  "financial institution that holds customers' securities for safekeeping"
  {:cmns-av/adaptedFrom "https://www.investopedia.com/terms/c/custodian.asp",
   :cmns-av/explanatoryNote
   "The custodian may hold stocks or other assets in electronic or physical form for mutual funds, individuals, and organizational clients.",
   :db/ident :fibo-sec-eq-eq/Custodian,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "custodian",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/holds,
                      :owl/someValuesFrom :fibo-sec-eq-eq/Share,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-pas-fpas/ThirdPartyAgent
                     :fibo-fbc-fct-fse/FinancialInstitution
                     :fibo-sec-eq-eq/Custodian],
   :skos/definition
   #voc/lstr
    "financial institution that holds customers' securities for safekeeping@en"})

(def DistributionByCashPayment
  "distribution method involving payment of cash to the shareholder"
  {:db/ident :fibo-sec-eq-eq/DistributionByCashPayment,
   :rdf/type [:fibo-sec-eq-eq/DividendDistributionMethod
              :owl/NamedIndividual
              :fibo-fnd-dt-bd/Convention
              :fibo-fnd-gao-obj/Strategy],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "distribution by payment",
   :skos/definition
   "distribution method involving payment of cash to the shareholder"})

(def DistributionByReinvestment
  "distribution method involving automatic reinvestment of shareholders' dividends in additional, potentially fractional, shares in the same asset"
  {:db/ident :fibo-sec-eq-eq/DistributionByReinvestment,
   :rdf/type [:fibo-sec-eq-eq/DividendDistributionMethod
              :owl/NamedIndividual
              :fibo-fnd-dt-bd/Convention
              :fibo-fnd-gao-obj/Strategy],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "distribution by reinvestment",
   :skos/definition
   "distribution method involving automatic reinvestment of shareholders' dividends in additional, potentially fractional, shares in the same asset"})

(def Dividend
  "announced commitment to make a specific distribution of a portion of earnings to shareholders, prorated by class of security"
  {:cmns-av/explanatoryNote
   "The amount and timing of payment is set by the board of directors, typically quarterly. Dividends may be paid in the form of money, shares, scrip, or on rare occasion, property.",
   :db/ident :fibo-sec-eq-eq/Dividend,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "dividend",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-eq-eq/DividendSchedule,
                      :owl/onProperty :fibo-fnd-dt-fd/hasSchedule,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fnd-pas-psch/hasPaymentAmount,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass :fibo-sec-eq-eq/DividendDistributionMethod,
                      :owl/onProperty :fibo-sec-eq-eq/hasDistributionMethod,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-agr-agr/Commitment
                     :fibo-sec-eq-eq/Dividend],
   :skos/definition
   "announced commitment to make a specific distribution of a portion of earnings to shareholders, prorated by class of security"})

(def DividendDistributionMethod
  "convention by which dividends are provided to shareholders"
  {:cmns-av/explanatoryNote
   "Distribution may be by payment of a monetary amount or by reinvestment, as specified by the board of directors at the time a decision to issue a dividend is made.",
   :db/ident :fibo-sec-eq-eq/DividendDistributionMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "dividend distribution method",
   :rdfs/subClassOf [:fibo-fnd-gao-obj/Strategy
                     :fibo-fnd-dt-bd/Convention
                     :fibo-sec-eq-eq/DividendDistributionMethod],
   :skos/definition
   "convention by which dividends are provided to shareholders"})

(def DividendSchedule
  "payment schedule indicating the dates on which dividends are due to be paid"
  {:db/ident :fibo-sec-eq-eq/DividendSchedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "dividend schedule",
   :rdfs/subClassOf [:fibo-sec-sec-sch/ParametricSchedule
                     :fibo-fnd-pas-psch/PaymentSchedule
                     :fibo-sec-eq-eq/DividendSchedule],
   :skos/definition
   "payment schedule indicating the dates on which dividends are due to be paid"})

(def EnhancedVotingShare
  "share that confers more than one vote per share"
  {:db/ident :fibo-sec-eq-eq/EnhancedVotingShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "enhanced voting share@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom {:owl/onDatatype :xsd/decimal,
                          :owl/withRestrictions [{:xsd/minExclusive 1.0}],
                          :rdf/type       :rdfs/Datatype},
     :rdf/type           :owl/Restriction}
    :fibo-sec-eq-eq/Share
    :fibo-sec-eq-eq/EnhancedVotingShare
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
     :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-corp-corp/hasSharesAuthorized,
     :owl/someValuesFrom :xsd/nonNegativeInteger,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
     :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition #voc/lstr
                     "share that confers more than one vote per share@en"})

(def EquityConversionTerms
  "conversion terms specifying the details regarding conversion of shares into other securities"
  {:db/ident :fibo-sec-eq-eq/EquityConversionTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "equity conversion terms",
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-sec-iss/specifiesConversionInto,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-sec-eq-eq/specifiesConversionDate,
                      :owl/someValuesFrom :cmns-dt/Date,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-sec-iss/ConversionTerms
                     :fibo-sec-eq-eq/EquityConversionTerms],
   :skos/definition
   "conversion terms specifying the details regarding conversion of shares into other securities"})

(def EquityPosition
  "position in an equity instrument"
  {:db/ident :fibo-sec-eq-eq/EquityPosition,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "equity position@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-oac-own/hasOwnedAsset,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
                          :owl/someValuesFrom :fibo-sec-eq-eq/Share,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    {:owl/onDataRange :xsd/decimal,
     :owl/onProperty  :fibo-sec-eq-eq/indicatesNumberOfShares,
     :owl/qualifiedCardinality 1,
     :rdf/type        :owl/Restriction}
    {:owl/onClass    {:owl/unionOf [:fibo-be-oac-cown/Shareholder
                                    :fibo-sec-eq-eq/Custodian],
                      :rdf/type    :owl/Class},
     :owl/onProperty :fibo-fnd-rel-rel/isHeldBy,
     :owl/qualifiedCardinality 1,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-be-oac-cown/Shareholder,
     :owl/onProperty :fibo-fnd-oac-own/hasOwningParty,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-pas-fpas/Position
    :fibo-sec-eq-eq/EquityPosition],
   :skos/definition #voc/lstr "position in an equity instrument@en"})

(def EquityRedemptionProvision
  "redemption provision that specifies the conditions under which the issuer or shareholder may redeem the shares"
  {:db/ident :fibo-sec-eq-eq/EquityRedemptionProvision,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "equity redemption provision@en",
   :rdfs/subClassOf
   [{:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fnd-acc-cur/MonetaryPrice,
     :owl/onProperty :fibo-sec-eq-eq/hasMinimumRedemptionPrice,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/boolean,
     :owl/onProperty  :fibo-sec-eq-eq/isRedeemableAtIssuerOption,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fnd-acc-cur/MonetaryPrice,
     :owl/onProperty :fibo-sec-eq-eq/hasRedemptionPremium,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/boolean,
     :owl/onProperty  :fibo-sec-eq-eq/isRedeemableAtShareholderOption,
     :rdf/type        :owl/Restriction}
    :fibo-fbc-fi-fi/RedemptionProvision
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :cmns-dt/ExplicitDate,
     :owl/onProperty :fibo-sec-eq-eq/hasEarliestRedemptionDate,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/boolean,
     :owl/onProperty  :fibo-sec-eq-eq/hasExtendableRedemptionDate,
     :rdf/type        :owl/Restriction}
    :fibo-sec-eq-eq/EquityRedemptionProvision],
   :skos/definition
   #voc/lstr
    "redemption provision that specifies the conditions under which the issuer or shareholder may redeem the shares@en"})

(def EquityRedemptionProvisionWithExtendableRedemptionDate
  "equity redemption provision that allows modification of the redemption date beyond the original specified date"
  {:db/ident
   :fibo-sec-eq-eq/EquityRedemptionProvisionWithExtendableRedemptionDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label
   #voc/lstr "equity redemption provision with extendable redemption date@en",
   :rdfs/subClassOf
   [{:owl/hasValue   {:xsd/boolean true},
     :owl/onProperty :fibo-sec-eq-eq/hasExtendableRedemptionDate,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/EquityRedemptionProvision
    :fibo-sec-eq-eq/EquityRedemptionProvisionWithExtendableRedemptionDate
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fnd-acc-cur/MonetaryPrice,
     :owl/onProperty :fibo-sec-eq-eq/hasMinimumRedemptionPrice,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fnd-acc-cur/MonetaryPrice,
     :owl/onProperty :fibo-sec-eq-eq/hasRedemptionPremium,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :cmns-dt/ExplicitDate,
     :owl/onProperty :fibo-sec-eq-eq/hasEarliestRedemptionDate,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/boolean,
     :owl/onProperty  :fibo-sec-eq-eq/isRedeemableAtShareholderOption,
     :rdf/type        :owl/Restriction}
    :fibo-fbc-fi-fi/RedemptionProvision
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/boolean,
     :owl/onProperty  :fibo-sec-eq-eq/hasExtendableRedemptionDate,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/boolean,
     :owl/onProperty  :fibo-sec-eq-eq/isRedeemableAtIssuerOption,
     :rdf/type        :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "equity redemption provision that allows modification of the redemption date beyond the original specified date@en"})

(def ExchangeablePreferredShare
  "preferred share that may be exchanged for a security of another issuer"
  {:db/ident :fibo-sec-eq-eq/ExchangeablePreferredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "exchangeable preferred share",
   :rdfs/subClassOf
   [:fibo-sec-eq-eq/PreferredShare
    :fibo-sec-eq-eq/ExchangeablePreferredShare
    {:owl/onProperty     :fibo-sec-eq-eq/hasDividend,
     :owl/someValuesFrom {:owl/unionOf [:fibo-sec-eq-eq/OrdinaryDividend
                                        :fibo-sec-eq-eq/PreferredDividend],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :cmns-dt/ExplicitDate,
     :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/Share
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/isSeniorTo,
     :owl/someValuesFrom :fibo-sec-eq-eq/CommonShare,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
     :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-corp-corp/hasSharesAuthorized,
     :owl/someValuesFrom :xsd/nonNegativeInteger,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
     :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition
   "preferred share that may be exchanged for a security of another issuer"})

(def FixedRateDividend
  "dividend that provides a specified annual return on the nominal value (and any premium) paid on shares"
  {:cmns-av/explanatoryNote
   "In other words, the return is not variable depending on whether or not the company makes a profit. Annual dividends are calculated as a percentage of the par value, which is the price of the preferred stock at the time it was issued. Most preferred shares have fixed rate dividends.",
   :db/ident :fibo-sec-eq-eq/FixedRateDividend,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "fixed rate dividend",
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-eq-eq/hasFixedDividendRate,
                      :owl/someValuesFrom
                      :fibo-fnd-acc-cur/PercentageMonetaryAmount,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-eq-eq/PreferredDividend
                     :fibo-sec-eq-eq/FixedRateDividend
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass :fibo-fnd-acc-cur/PercentageMonetaryAmount,
                      :owl/onProperty :fibo-sec-eq-eq/hasFixedDividendRate,
                      :rdf/type :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :cmns-dt/Duration,
                      :owl/onProperty :fibo-sec-eq-eq/hasDividendGracePeriod,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-agr-agr/Commitment
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fnd-pas-psch/hasPaymentAmount,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-eq-eq/DividendSchedule,
                      :owl/onProperty :fibo-fnd-dt-fd/hasSchedule,
                      :rdf/type       :owl/Restriction}
                     :fibo-sec-eq-eq/Dividend
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass :fibo-sec-eq-eq/DividendDistributionMethod,
                      :owl/onProperty :fibo-sec-eq-eq/hasDistributionMethod,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   "dividend that provides a specified annual return on the nominal value (and any premium) paid on shares"})

(def FullyPaidShare
  "share whose payment status indicates that no additional money is owed to the company by shareholders on the value of the shares"
  {:db/ident :fibo-sec-eq-eq/FullyPaidShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "fully paid share@en",
   :rdfs/subClassOf [{:owl/hasValue   :fibo-sec-eq-eq/FullyPaidShareStatus,
                      :owl/onProperty :fibo-sec-eq-eq/hasSharePaymentStatus,
                      :rdf/type       :owl/Restriction}
                     :fibo-sec-eq-eq/Share
                     :fibo-sec-eq-eq/FullyPaidShare
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty
                      :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
                      :owl/someValuesFrom :xsd/decimal,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
                      :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-be-corp-corp/hasSharesAuthorized,
                      :owl/someValuesFrom :xsd/nonNegativeInteger,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
                      :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition
   #voc/lstr
    "share whose payment status indicates that no additional money is owed to the company by shareholders on the value of the shares@en"})

(def FullyPaidShareStatus
  "status indicating that no additional money is owed to the company by shareholders on the value of the shares"
  {:db/ident :fibo-sec-eq-eq/FullyPaidShareStatus,
   :rdf/type [:fibo-sec-eq-eq/SharePaymentStatus
              :owl/NamedIndividual
              {:owl/onProperty     :cmns-cls/classifies,
               :owl/someValuesFrom :fibo-sec-eq-eq/Share,
               :rdf/type           :owl/Restriction}
              :fibo-fnd-arr-lif/LifecycleStatus],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "fully paid share status",
   :skos/definition
   "status indicating that no additional money is owed to the company by shareholders on the value of the shares"})

(def HardRetractablePreferredShare
  "retractable preferred share whose retraction value must be paid in cash"
  {:db/ident :fibo-sec-eq-eq/HardRetractablePreferredShare,
   :owl/disjointWith :fibo-sec-eq-eq/SoftRetractablePreferredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "hard retractable preferred share",
   :rdfs/subClassOf
   [:fibo-sec-eq-eq/RetractablePreferredShare
    :fibo-sec-eq-eq/HardRetractablePreferredShare
    {:owl/onProperty     :fibo-fbc-fi-fi/hasRedemptionProvision,
     :owl/someValuesFrom :fibo-sec-eq-eq/EquityRedemptionProvision,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasDividend,
     :owl/someValuesFrom {:owl/unionOf [:fibo-sec-eq-eq/OrdinaryDividend
                                        :fibo-sec-eq-eq/PreferredDividend],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :cmns-dt/ExplicitDate,
     :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/Share
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/isSeniorTo,
     :owl/someValuesFrom :fibo-sec-eq-eq/CommonShare,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
     :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-corp-corp/hasSharesAuthorized,
     :owl/someValuesFrom :xsd/nonNegativeInteger,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
     :rdf/type        :owl/Restriction}
    :fibo-sec-eq-eq/PreferredShare
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
     :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition
   "retractable preferred share whose retraction value must be paid in cash"})

(def LimitedPartnershipUnit
  "share in a limited partnership"
  {:db/ident :fibo-sec-eq-eq/LimitedPartnershipUnit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "limited partnership unit@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-agr-ctr/hasCounterparty,
     :owl/someValuesFrom {:owl/unionOf [:fibo-be-ptr-ptr/GeneralPartner
                                        :fibo-be-ptr-ptr/LimitedPartner],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    :fibo-sec-eq-eq/Share
    :fibo-sec-eq-eq/LimitedPartnershipUnit
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
     :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-corp-corp/hasSharesAuthorized,
     :owl/someValuesFrom :xsd/nonNegativeInteger,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
     :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition #voc/lstr "share in a limited partnership@en"})

(def ListedShare
  "share that is listed on at least one platform"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Listing requirements vary by exchange and include minimum stockholder's equity, a minimum share price and a minimum number of shareholders. Exchanges have listing requirements to ensure that only high quality securities are traded on them and to uphold the exchange's reputation among investors.@en",
   :db/ident :fibo-sec-eq-eq/ListedShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "listed share@en",
   :rdfs/seeAlso ["https://www.investopedia.com/terms/l/listedsecurity.asp"],
   :rdfs/subClassOf [:fibo-sec-sec-lst/ListedSecurity
                     :fibo-sec-eq-eq/Share
                     :fibo-sec-eq-eq/ListedShare
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty
                      :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
                      :owl/someValuesFrom :xsd/decimal,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
                      :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-be-corp-corp/hasSharesAuthorized,
                      :owl/someValuesFrom :xsd/nonNegativeInteger,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
                      :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition #voc/lstr
                     "share that is listed on at least one platform@en"})

(def NilPaidShare
  "share whose payment status indicates that none of the market value has been received by the company for the shares"
  {:db/ident :fibo-sec-eq-eq/NilPaidShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "nil paid share@en",
   :rdfs/subClassOf [{:owl/hasValue   :fibo-sec-eq-eq/NilPaidShareStatus,
                      :owl/onProperty :fibo-sec-eq-eq/hasSharePaymentStatus,
                      :rdf/type       :owl/Restriction}
                     :fibo-sec-eq-eq/Share
                     :fibo-sec-eq-eq/NilPaidShare
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty
                      :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
                      :owl/someValuesFrom :xsd/decimal,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
                      :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-be-corp-corp/hasSharesAuthorized,
                      :owl/someValuesFrom :xsd/nonNegativeInteger,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
                      :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition
   #voc/lstr
    "share whose payment status indicates that none of the market value has been received by the company for the shares@en"})

(def NilPaidShareStatus
  "status indicating that none of the market value has been received by the company for the shares"
  {:db/ident :fibo-sec-eq-eq/NilPaidShareStatus,
   :owl/differentFrom [:fibo-sec-eq-eq/PartiallyPaidShareStatus
                       :fibo-sec-eq-eq/FullyPaidShareStatus],
   :rdf/type [:fibo-sec-eq-eq/SharePaymentStatus
              :owl/NamedIndividual
              {:owl/onProperty     :cmns-cls/classifies,
               :owl/someValuesFrom :fibo-sec-eq-eq/Share,
               :rdf/type           :owl/Restriction}
              :fibo-fnd-arr-lif/LifecycleStatus],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "nil paid share status",
   :skos/definition
   "status indicating that none of the market value has been received by the company for the shares",
   :skos/example
   "Unpaid shares may be issued, for example, for convenience by a start-up company."})

(def NonCumulativePreferredShare
  "preferred share whose dividend payments are not carried forward"
  {:db/ident :fibo-sec-eq-eq/NonCumulativePreferredShare,
   :owl/disjointWith :fibo-sec-eq-eq/CumulativePreferredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "non-cumulative preferred share",
   :rdfs/subClassOf
   [:fibo-sec-eq-eq/PreferredShare
    :fibo-sec-eq-eq/NonCumulativePreferredShare
    {:owl/onProperty     :fibo-sec-eq-eq/hasDividend,
     :owl/someValuesFrom {:owl/unionOf [:fibo-sec-eq-eq/OrdinaryDividend
                                        :fibo-sec-eq-eq/PreferredDividend],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :cmns-dt/ExplicitDate,
     :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/Share
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/isSeniorTo,
     :owl/someValuesFrom :fibo-sec-eq-eq/CommonShare,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
     :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-corp-corp/hasSharesAuthorized,
     :owl/someValuesFrom :xsd/nonNegativeInteger,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
     :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition
   "preferred share whose dividend payments are not carried forward"})

(def NonParticipatingPreferredShare
  "preferred share that is not a participating preferred share"
  {:db/ident :fibo-sec-eq-eq/NonParticipatingPreferredShare,
   :owl/disjointWith :fibo-sec-eq-eq/ParticipatingPreferredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "non-participating preferred share",
   :rdfs/subClassOf
   [:fibo-sec-eq-eq/PreferredShare
    :fibo-sec-eq-eq/NonParticipatingPreferredShare
    {:owl/onProperty     :fibo-sec-eq-eq/hasDividend,
     :owl/someValuesFrom {:owl/unionOf [:fibo-sec-eq-eq/OrdinaryDividend
                                        :fibo-sec-eq-eq/PreferredDividend],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :cmns-dt/ExplicitDate,
     :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/Share
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/isSeniorTo,
     :owl/someValuesFrom :fibo-sec-eq-eq/CommonShare,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
     :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-corp-corp/hasSharesAuthorized,
     :owl/someValuesFrom :xsd/nonNegativeInteger,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
     :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition
   "preferred share that is not a participating preferred share"})

(def NonVotingShare
  "share that has no voting right"
  {:db/ident :fibo-sec-eq-eq/NonVotingShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "non-voting share@en",
   :rdfs/subClassOf
   [{:owl/hasValue   {:xsd/long 0},
     :owl/onProperty :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/Share
    :fibo-sec-eq-eq/NonVotingShare
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
     :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-corp-corp/hasSharesAuthorized,
     :owl/someValuesFrom :xsd/nonNegativeInteger,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
     :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition #voc/lstr "share that has no voting right@en"})

(def OrdinaryDividend
  "dividend that is paid to shareholders periodically"
  {:cmns-av/explanatoryNote
   ["Note that the terms related to ordinary dividend payment are typically specified in the context of a board resolution rather than contractually."
    "Most dividends are considered ordinary, unless they are specifically designated as qualified dividends."],
   :db/ident :fibo-sec-eq-eq/OrdinaryDividend,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "ordinary dividend",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fnd-pas-psch/hasPaymentAmount,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-sec-eq-eq/Dividend
                     :fibo-sec-eq-eq/OrdinaryDividend
                     :fibo-fnd-agr-agr/Commitment
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fnd-pas-psch/hasPaymentAmount,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-eq-eq/DividendSchedule,
                      :owl/onProperty :fibo-fnd-dt-fd/hasSchedule,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass :fibo-sec-eq-eq/DividendDistributionMethod,
                      :owl/onProperty :fibo-sec-eq-eq/hasDistributionMethod,
                      :rdf/type :owl/Restriction}],
   :skos/definition "dividend that is paid to shareholders periodically"})

(def PartiallyPaidShare
  "share whose payment status indicates that only a portion of the market value has been received by the company for the shares"
  {:db/ident :fibo-sec-eq-eq/PartiallyPaidShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "partially paid share@en",
   :rdfs/subClassOf [{:owl/hasValue   :fibo-sec-eq-eq/PartiallyPaidShareStatus,
                      :owl/onProperty :fibo-sec-eq-eq/hasSharePaymentStatus,
                      :rdf/type       :owl/Restriction}
                     :fibo-sec-eq-eq/Share
                     :fibo-sec-eq-eq/PartiallyPaidShare
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty
                      :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
                      :owl/someValuesFrom :xsd/decimal,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
                      :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-be-corp-corp/hasSharesAuthorized,
                      :owl/someValuesFrom :xsd/nonNegativeInteger,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
                      :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition
   #voc/lstr
    "share whose payment status indicates that only a portion of the market value has been received by the company for the shares@en"})

(def PartiallyPaidShareStatus
  "status indicating that only a portion of the market value has been received by the company for the shares"
  {:cmns-av/explanatoryNote
   "In the case of partially paid shares, the shareholder is still required to pay the remaining amount to the company. Typically, partially paid shares are only issued to a shareholder if there are compelling business reasons to do so.",
   :db/ident :fibo-sec-eq-eq/PartiallyPaidShareStatus,
   :owl/differentFrom :fibo-sec-eq-eq/FullyPaidShareStatus,
   :rdf/type [:fibo-sec-eq-eq/SharePaymentStatus
              :owl/NamedIndividual
              {:owl/onProperty     :cmns-cls/classifies,
               :owl/someValuesFrom :fibo-sec-eq-eq/Share,
               :rdf/type           :owl/Restriction}
              :fibo-fnd-arr-lif/LifecycleStatus],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "partially paid share status",
   :skos/definition
   "status indicating that only a portion of the market value has been received by the company for the shares"})

(def ParticipatingPreferredShare
  "preferred share that, in addition to paying a stipulated dividend, gives the holder the right to participate with common share holders in additional distributions of earnings under specified conditions"
  {:cmns-av/explanatoryNote
   "Participating preferred shares are rare, typically only issued when needed to attract investors.",
   :db/ident :fibo-sec-eq-eq/ParticipatingPreferredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "participating preferred share",
   :rdfs/subClassOf
   [{:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-sec-eq-eq/OrdinaryDividend,
     :owl/onProperty :fibo-sec-eq-eq/hasDividend,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/PreferredShare
    :fibo-sec-eq-eq/ParticipatingPreferredShare
    {:owl/onProperty     :fibo-sec-eq-eq/hasDividend,
     :owl/someValuesFrom {:owl/unionOf [:fibo-sec-eq-eq/OrdinaryDividend
                                        :fibo-sec-eq-eq/PreferredDividend],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :cmns-dt/ExplicitDate,
     :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/Share
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/isSeniorTo,
     :owl/someValuesFrom :fibo-sec-eq-eq/CommonShare,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
     :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-corp-corp/hasSharesAuthorized,
     :owl/someValuesFrom :xsd/nonNegativeInteger,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
     :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition
   "preferred share that, in addition to paying a stipulated dividend, gives the holder the right to participate with common share holders in additional distributions of earnings under specified conditions"})

(def PerpetualPreferredShare
  "preferred share that has no fixed maturity date"
  {:db/ident :fibo-sec-eq-eq/PerpetualPreferredShare,
   :owl/disjointWith :fibo-sec-eq-eq/PreferredShareWithFixedMaturityDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "perpetual preferred share",
   :rdfs/subClassOf
   [{:owl/onClass    :cmns-dt/ExplicitDate,
     :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
     :owl/qualifiedCardinality 0,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/PreferredShare
    :fibo-sec-eq-eq/PerpetualPreferredShare
    {:owl/onProperty     :fibo-sec-eq-eq/hasDividend,
     :owl/someValuesFrom {:owl/unionOf [:fibo-sec-eq-eq/OrdinaryDividend
                                        :fibo-sec-eq-eq/PreferredDividend],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :cmns-dt/ExplicitDate,
     :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/Share
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/isSeniorTo,
     :owl/someValuesFrom :fibo-sec-eq-eq/CommonShare,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
     :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-corp-corp/hasSharesAuthorized,
     :owl/someValuesFrom :xsd/nonNegativeInteger,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
     :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition "preferred share that has no fixed maturity date"})

(def PrecedenceRight
  "right that give the shareholder higher priority with respect to certain pre-defined dividend payments over other shareholders and that pay out first in the case of liquidation"
  {:db/ident :fibo-sec-eq-eq/PrecedenceRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "precedence right",
   :rdfs/subClassOf [:fibo-fnd-law-lcap/ContractualRight
                     :fibo-sec-eq-eq/PrecedenceRight],
   :skos/definition
   "right that give the shareholder higher priority with respect to certain pre-defined dividend payments over other shareholders and that pay out first in the case of liquidation"})

(def PreferredDividend
  "commitment to distribute a portion of earnings to shareholders, similar to a dividend but often with a fixed payment amount and schedule"
  {:db/ident :fibo-sec-eq-eq/PreferredDividend,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "preferred dividend",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :cmns-dt/Duration,
                      :owl/onProperty :fibo-sec-eq-eq/hasDividendGracePeriod,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass :fibo-fnd-acc-cur/PercentageMonetaryAmount,
                      :owl/onProperty :fibo-sec-eq-eq/hasFixedDividendRate,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-eq-eq/Dividend
                     :fibo-sec-eq-eq/PreferredDividend
                     :fibo-fnd-agr-agr/Commitment
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fnd-pas-psch/hasPaymentAmount,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-eq-eq/DividendSchedule,
                      :owl/onProperty :fibo-fnd-dt-fd/hasSchedule,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass :fibo-sec-eq-eq/DividendDistributionMethod,
                      :owl/onProperty :fibo-sec-eq-eq/hasDistributionMethod,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   "commitment to distribute a portion of earnings to shareholders, similar to a dividend but often with a fixed payment amount and schedule"})

(def PreferredShare
  "share that pays dividends at a specified rate and has preference over common shares in the payment of dividends and liquidation of corporate assets"
  {:cmns-av/synonym "preference share",
   :db/ident :fibo-sec-eq-eq/PreferredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "preferred share",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-sec-eq-eq/isSeniorTo,
     :owl/someValuesFrom :fibo-sec-eq-eq/CommonShare,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasDividend,
     :owl/someValuesFrom {:owl/unionOf [:fibo-sec-eq-eq/OrdinaryDividend
                                        :fibo-sec-eq-eq/PreferredDividend],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :cmns-dt/ExplicitDate,
     :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/Share
    :fibo-sec-eq-eq/PreferredShare
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
     :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-corp-corp/hasSharesAuthorized,
     :owl/someValuesFrom :xsd/nonNegativeInteger,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
     :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition
   "share that pays dividends at a specified rate and has preference over common shares in the payment of dividends and liquidation of corporate assets"})

(def PreferredShareWithAdjustableRateDividend
  "preferred share whose dividend rate varies according to some benchmark"
  {:db/ident :fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend,
   :owl/disjointWith :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "preferred share with adjustable rate dividend",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-sec-eq-eq/hasDividend,
     :owl/someValuesFrom :fibo-sec-eq-eq/AdjustableRateDividend,
     :rdf/type           :owl/Restriction}
    :fibo-sec-eq-eq/PreferredShare
    :fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
    {:owl/onProperty     :fibo-sec-eq-eq/hasDividend,
     :owl/someValuesFrom {:owl/unionOf [:fibo-sec-eq-eq/OrdinaryDividend
                                        :fibo-sec-eq-eq/PreferredDividend],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :cmns-dt/ExplicitDate,
     :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/Share
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/isSeniorTo,
     :owl/someValuesFrom :fibo-sec-eq-eq/CommonShare,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
     :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-corp-corp/hasSharesAuthorized,
     :owl/someValuesFrom :xsd/nonNegativeInteger,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
     :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition
   "preferred share whose dividend rate varies according to some benchmark"})

(def PreferredShareWithAuctionRateDividend
  "preferred share whose dividend rate is periodically reset through an auction, such as a Dutch auction"
  {:db/ident :fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend,
   :owl/disjointWith :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "preferred share with auction rate dividend",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-sec-eq-eq/hasDividend,
     :owl/someValuesFrom :fibo-sec-eq-eq/AuctionRateDividend,
     :rdf/type           :owl/Restriction}
    :fibo-sec-eq-eq/PreferredShare
    :fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
    {:owl/onProperty     :fibo-sec-eq-eq/hasDividend,
     :owl/someValuesFrom {:owl/unionOf [:fibo-sec-eq-eq/OrdinaryDividend
                                        :fibo-sec-eq-eq/PreferredDividend],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :cmns-dt/ExplicitDate,
     :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/Share
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/isSeniorTo,
     :owl/someValuesFrom :fibo-sec-eq-eq/CommonShare,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
     :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-corp-corp/hasSharesAuthorized,
     :owl/someValuesFrom :xsd/nonNegativeInteger,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
     :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition
   "preferred share whose dividend rate is periodically reset through an auction, such as a Dutch auction"})

(def PreferredShareWithFixedMaturityDate
  "preferred share whose maturity date is set, typically according to the terms of the prospectus"
  {:db/ident :fibo-sec-eq-eq/PreferredShareWithFixedMaturityDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "preferred share with fixed maturity date",
   :rdfs/subClassOf
   [{:owl/onClass    :cmns-dt/ExplicitDate,
     :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
     :owl/qualifiedCardinality 1,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/PreferredShare
    :fibo-sec-eq-eq/PreferredShareWithFixedMaturityDate
    {:owl/onProperty     :fibo-sec-eq-eq/hasDividend,
     :owl/someValuesFrom {:owl/unionOf [:fibo-sec-eq-eq/OrdinaryDividend
                                        :fibo-sec-eq-eq/PreferredDividend],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :cmns-dt/ExplicitDate,
     :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/Share
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/isSeniorTo,
     :owl/someValuesFrom :fibo-sec-eq-eq/CommonShare,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
     :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-corp-corp/hasSharesAuthorized,
     :owl/someValuesFrom :xsd/nonNegativeInteger,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
     :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition
   "preferred share whose maturity date is set, typically according to the terms of the prospectus"})

(def PreferredShareWithFixedRateDividend
  "preferred share whose dividends are set, typically according to the terms of the prospectus"
  {:db/ident :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "preferred share with fixed rate dividend",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-sec-eq-eq/hasDividend,
     :owl/someValuesFrom :fibo-sec-eq-eq/FixedRateDividend,
     :rdf/type           :owl/Restriction}
    :fibo-sec-eq-eq/PreferredShare
    :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
    {:owl/onProperty     :fibo-sec-eq-eq/hasDividend,
     :owl/someValuesFrom {:owl/unionOf [:fibo-sec-eq-eq/OrdinaryDividend
                                        :fibo-sec-eq-eq/PreferredDividend],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :cmns-dt/ExplicitDate,
     :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/Share
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/isSeniorTo,
     :owl/someValuesFrom :fibo-sec-eq-eq/CommonShare,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
     :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-corp-corp/hasSharesAuthorized,
     :owl/someValuesFrom :xsd/nonNegativeInteger,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
     :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition
   "preferred share whose dividends are set, typically according to the terms of the prospectus"})

(def PricePerShare
  "price for one share of a given security at some point in time"
  {:cmns-av/abbreviation "PPS",
   :cmns-av/synonym "share price",
   :db/ident :fibo-sec-eq-eq/PricePerShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "price per share",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-acc-cur/isPriceFor,
                      :owl/someValuesFrom :fibo-sec-eq-eq/Share,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-cur/UnitPrice
                     :fibo-fbc-fi-ip/SecurityPrice
                     :fibo-sec-eq-eq/PricePerShare],
   :skos/definition
   "price for one share of a given security at some point in time"})

(def PrivatelyHeldShare
  "share in a security that signifies ownership in an entity that is not publicly traded"
  {:cmns-av/explanatoryNote
   "Privately owned companies include family-owned businesses, sole proprietorships and the vast majority of small and medium-sized businesses. These companies are often too small for an initial public offering (IPO) due, for example to a small market capitalization and/or low trading volume, and fulfill their financing requirements in other ways, including through smaller offerings.",
   :db/ident :fibo-sec-eq-eq/PrivatelyHeldShare,
   :owl/disjointWith :fibo-sec-eq-eq/ListedShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "privately held share@en",
   :rdfs/subClassOf [:fibo-sec-eq-eq/Share
                     :fibo-sec-eq-eq/PrivatelyHeldShare
                     {:owl/onProperty :fibo-be-corp-corp/hasSharesAuthorized,
                      :owl/someValuesFrom :xsd/nonNegativeInteger,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
                      :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty
                      :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
                      :owl/someValuesFrom :xsd/decimal,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
                      :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition
   #voc/lstr
    "share in a security that signifies ownership in an entity that is not publicly traded@en"})

(def QualifiedDividend
  "dividend that falls under capital gains tax rates that are lower than the income tax rates on unqualified (ordinary) dividends"
  {:db/ident :fibo-sec-eq-eq/QualifiedDividend,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "qualified dividend",
   :rdfs/subClassOf [:fibo-sec-eq-eq/Dividend
                     :fibo-sec-eq-eq/QualifiedDividend
                     :fibo-fnd-agr-agr/Commitment
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fnd-pas-psch/hasPaymentAmount,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-eq-eq/DividendSchedule,
                      :owl/onProperty :fibo-fnd-dt-fd/hasSchedule,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass :fibo-sec-eq-eq/DividendDistributionMethod,
                      :owl/onProperty :fibo-sec-eq-eq/hasDistributionMethod,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   "dividend that falls under capital gains tax rates that are lower than the income tax rates on unqualified (ordinary) dividends"})

(def RedeemablePreferredShare
  "preferred share that gives the issuer the right to redeem the stock under specified conditions"
  {:db/ident :fibo-sec-eq-eq/RedeemablePreferredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "redeemable preferred share",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fbc-fi-fi/hasRedemptionProvision,
     :owl/someValuesFrom :fibo-sec-eq-eq/EquityRedemptionProvision,
     :rdf/type           :owl/Restriction}
    :fibo-sec-eq-eq/PreferredShare
    :fibo-sec-eq-eq/RedeemablePreferredShare
    {:owl/onProperty     :fibo-sec-eq-eq/hasDividend,
     :owl/someValuesFrom {:owl/unionOf [:fibo-sec-eq-eq/OrdinaryDividend
                                        :fibo-sec-eq-eq/PreferredDividend],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :cmns-dt/ExplicitDate,
     :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/Share
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/isSeniorTo,
     :owl/someValuesFrom :fibo-sec-eq-eq/CommonShare,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
     :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-corp-corp/hasSharesAuthorized,
     :owl/someValuesFrom :xsd/nonNegativeInteger,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
     :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition
   "preferred share that gives the issuer the right to redeem the stock under specified conditions"})

(def RedeemablePreferredShareWithExtendableMaturityDate
  "redeemable preferred share with a fixed maturity date whose issuer has the option to extend the maturity date"
  {:db/ident :fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "redeemable preferred share with extendable maturity date",
   :rdfs/subClassOf
   [{:owl/hasValue   {:xsd/boolean true},
     :owl/onProperty :fibo-sec-eq-eq/hasExtendableMaturityDate,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/RedeemablePreferredShare
    :fibo-sec-eq-eq/PreferredShareWithFixedMaturityDate
    :fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
    {:owl/onProperty     :fibo-sec-eq-eq/hasDividend,
     :owl/someValuesFrom {:owl/unionOf [:fibo-sec-eq-eq/OrdinaryDividend
                                        :fibo-sec-eq-eq/PreferredDividend],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/onClass    :cmns-dt/ExplicitDate,
     :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
     :owl/qualifiedCardinality 1,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :cmns-dt/ExplicitDate,
     :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/Share
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/isSeniorTo,
     :owl/someValuesFrom :fibo-sec-eq-eq/CommonShare,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
     :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fi-fi/hasRedemptionProvision,
     :owl/someValuesFrom :fibo-sec-eq-eq/EquityRedemptionProvision,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-corp-corp/hasSharesAuthorized,
     :owl/someValuesFrom :xsd/nonNegativeInteger,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
     :rdf/type        :owl/Restriction}
    :fibo-sec-eq-eq/PreferredShare
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
     :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition
   "redeemable preferred share with a fixed maturity date whose issuer has the option to extend the maturity date"})

(def RedeemablePreferredShareWithExtendableRedemptionDate
  "redeemable preferred share whose redemption date can be modified"
  {:cmns-av/synonym "extendible preferred share",
   :db/ident
   :fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "redeemable preferred share with extendable redemption date",
   :rdfs/subClassOf
   [{:owl/onProperty :fibo-fnd-agr-ctr/hasExtensionProvision,
     :owl/someValuesFrom
     :fibo-sec-eq-eq/EquityRedemptionProvisionWithExtendableRedemptionDate,
     :rdf/type :owl/Restriction}
    :fibo-sec-eq-eq/RedeemablePreferredShare
    :fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
    {:owl/onProperty     :fibo-sec-eq-eq/hasDividend,
     :owl/someValuesFrom {:owl/unionOf [:fibo-sec-eq-eq/OrdinaryDividend
                                        :fibo-sec-eq-eq/PreferredDividend],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :cmns-dt/ExplicitDate,
     :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/Share
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/isSeniorTo,
     :owl/someValuesFrom :fibo-sec-eq-eq/CommonShare,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
     :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fi-fi/hasRedemptionProvision,
     :owl/someValuesFrom :fibo-sec-eq-eq/EquityRedemptionProvision,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-corp-corp/hasSharesAuthorized,
     :owl/someValuesFrom :xsd/nonNegativeInteger,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
     :rdf/type        :owl/Restriction}
    :fibo-sec-eq-eq/PreferredShare
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
     :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition
   "redeemable preferred share whose redemption date can be modified"})

(def RestrictedShare
  "share whose ownership/transfer/sale is subject to special conditions including country-specific restrictions"
  {:db/ident :fibo-sec-eq-eq/RestrictedShare,
   :owl/disjointWith :fibo-sec-eq-eq/UnrestrictedShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "restricted share@en",
   :rdfs/subClassOf [:fibo-sec-eq-eq/Share
                     :fibo-sec-eq-eq/RestrictedShare
                     {:owl/onProperty :fibo-be-corp-corp/hasSharesAuthorized,
                      :owl/someValuesFrom :xsd/nonNegativeInteger,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
                      :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty
                      :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
                      :owl/someValuesFrom :xsd/decimal,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
                      :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition
   #voc/lstr
    "share whose ownership/transfer/sale is subject to special conditions including country-specific restrictions@en"})

(def RestrictedVotingShare
  "share that confers less than one vote per share"
  {:db/ident :fibo-sec-eq-eq/RestrictedVotingShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "restricted voting share@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom {:owl/onDatatype :xsd/decimal,
                          :owl/withRestrictions [{:xsd/maxExclusive 1.0}],
                          :rdf/type       :rdfs/Datatype},
     :rdf/type           :owl/Restriction}
    :fibo-sec-eq-eq/Share
    :fibo-sec-eq-eq/RestrictedVotingShare
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
     :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-corp-corp/hasSharesAuthorized,
     :owl/someValuesFrom :xsd/nonNegativeInteger,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
     :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition #voc/lstr
                     "share that confers less than one vote per share@en"})

(def RetractablePreferredShare
  "preferred share that gives the owner (shareholder) the right to redeem the stock under specified conditions"
  {:cmns-av/explanatoryNote
   "When retractable preferred shares reach maturity, the shareholder has the right to sell them back to the stock issuer at the price stated on the agreement. In some cases, the issuer can force the shareholder to sell, and may have the option of exchanging retractable preferred shares for common shares instead of cash.",
   :db/ident :fibo-sec-eq-eq/RetractablePreferredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "retractable preferred share",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fbc-fi-fi/hasRedemptionProvision,
     :owl/someValuesFrom :fibo-sec-eq-eq/EquityRedemptionProvision,
     :rdf/type           :owl/Restriction}
    :fibo-sec-eq-eq/PreferredShare
    :fibo-sec-eq-eq/RetractablePreferredShare
    {:owl/onProperty     :fibo-sec-eq-eq/hasDividend,
     :owl/someValuesFrom {:owl/unionOf [:fibo-sec-eq-eq/OrdinaryDividend
                                        :fibo-sec-eq-eq/PreferredDividend],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :cmns-dt/ExplicitDate,
     :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/Share
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/isSeniorTo,
     :owl/someValuesFrom :fibo-sec-eq-eq/CommonShare,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
     :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-corp-corp/hasSharesAuthorized,
     :owl/someValuesFrom :xsd/nonNegativeInteger,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
     :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition
   "preferred share that gives the owner (shareholder) the right to redeem the stock under specified conditions"})

(def RetractablePreferredShareWithExtendableMaturityDate
  "retractable preferred share with a fixed maturity date whose issuer and/or holders have the option to extend the maturity date"
  {:db/ident
   :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "retractable preferred share with extendable maturity date",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-agr-ctr/hasExtensionProvision,
     :owl/someValuesFrom :fibo-fnd-agr-ctr/ExtensionProvision,
     :rdf/type           :owl/Restriction}
    {:owl/hasValue   {:xsd/boolean true},
     :owl/onProperty :fibo-sec-eq-eq/hasExtendableMaturityDate,
     :rdf/type       :owl/Restriction}
    {:owl/hasValue   {:xsd/boolean true},
     :owl/onProperty :fibo-sec-eq-eq/hasExtendableMaturityDate,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/RetractablePreferredShare
    :fibo-sec-eq-eq/PreferredShareWithFixedMaturityDate
    :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate
    {:owl/onProperty     :fibo-fbc-fi-fi/hasRedemptionProvision,
     :owl/someValuesFrom :fibo-sec-eq-eq/EquityRedemptionProvision,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasDividend,
     :owl/someValuesFrom {:owl/unionOf [:fibo-sec-eq-eq/OrdinaryDividend
                                        :fibo-sec-eq-eq/PreferredDividend],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/onClass    :cmns-dt/ExplicitDate,
     :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
     :owl/qualifiedCardinality 1,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :cmns-dt/ExplicitDate,
     :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/Share
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/isSeniorTo,
     :owl/someValuesFrom :fibo-sec-eq-eq/CommonShare,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
     :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-corp-corp/hasSharesAuthorized,
     :owl/someValuesFrom :xsd/nonNegativeInteger,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
     :rdf/type        :owl/Restriction}
    :fibo-sec-eq-eq/PreferredShare
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
     :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition
   "retractable preferred share with a fixed maturity date whose issuer and/or holders have the option to extend the maturity date"})

(def RetractablePreferredShareWithExtendableRedemptionDate
  "retractable preferred share whose redemption date can be modified"
  {:cmns-av/synonym "extendible preferred share",
   :db/ident
   :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "retractable preferred share with extendable redemption date",
   :rdfs/subClassOf
   [{:owl/onProperty :fibo-fnd-agr-ctr/hasExtensionProvision,
     :owl/someValuesFrom
     :fibo-sec-eq-eq/EquityRedemptionProvisionWithExtendableRedemptionDate,
     :rdf/type :owl/Restriction}
    :fibo-sec-eq-eq/RetractablePreferredShare
    :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate
    {:owl/onProperty     :fibo-fbc-fi-fi/hasRedemptionProvision,
     :owl/someValuesFrom :fibo-sec-eq-eq/EquityRedemptionProvision,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasDividend,
     :owl/someValuesFrom {:owl/unionOf [:fibo-sec-eq-eq/OrdinaryDividend
                                        :fibo-sec-eq-eq/PreferredDividend],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :cmns-dt/ExplicitDate,
     :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/Share
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/isSeniorTo,
     :owl/someValuesFrom :fibo-sec-eq-eq/CommonShare,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
     :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-corp-corp/hasSharesAuthorized,
     :owl/someValuesFrom :xsd/nonNegativeInteger,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
     :rdf/type        :owl/Restriction}
    :fibo-sec-eq-eq/PreferredShare
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
     :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition
   "retractable preferred share whose redemption date can be modified"})

(def Share
  "financial instrument that signifies a unit of equity ownership in a corporation, or a unit of ownership in a mutual fund, or interest in a general or limited partnership, or a unit of ownership in a structured product, such as a real estate investment trust"
  {:db/ident :fibo-sec-eq-eq/Share,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "share@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
                      :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
                      :rdf/type        :owl/Restriction}
                     :fibo-fbc-fi-fi/EquityInstrument
                     {:owl/onProperty :fibo-be-corp-corp/hasSharesAuthorized,
                      :owl/someValuesFrom :xsd/nonNegativeInteger,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
                      :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty
                      :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
                      :owl/someValuesFrom :xsd/decimal,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
                      :rdf/type        :owl/Restriction}
                     :fibo-sec-eq-eq/Share],
   :skos/definition
   #voc/lstr
    "financial instrument that signifies a unit of equity ownership in a corporation, or a unit of ownership in a mutual fund, or interest in a general or limited partnership, or a unit of ownership in a structured product, such as a real estate investment trust@en"})

(def ShareIssuer
  "issuer of securities that represent an ownership interest in something"
  {:cmns-av/explanatoryNote
   "This includes shares that represent equity ownership in a corporation, or ownership in a mutual fund, or an interest in a general or limited partnership, or ownership in a structured product, such as a real estate investment trust.",
   :db/ident :fibo-sec-eq-eq/ShareIssuer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "share issuer",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/issues,
                      :owl/someValuesFrom :fibo-sec-eq-eq/Share,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/Issuer
                     :fibo-sec-eq-eq/ShareIssuer],
   :skos/definition
   "issuer of securities that represent an ownership interest in something"})

(def SharePaymentStatus
  "classifier that specifies the overall payment status for shares issued"
  {:cmns-av/explanatoryNote
   "When a company issues shares upon incorporation or through an initial or secondary issuance, shareholders are required to pay a set amount for those shares. Once the company has received the full amount from shareholders, the shares become fully paid shares.",
   :db/ident :fibo-sec-eq-eq/SharePaymentStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "share payment status",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :fibo-sec-eq-eq/Share,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-lif/LifecycleStatus
                     :fibo-sec-eq-eq/SharePaymentStatus],
   :skos/definition
   "classifier that specifies the overall payment status for shares issued"})

(def ShareYield
  "ratio of the annualized dividend per share divided by the (current) price per share"
  {:cmns-av/synonym [#voc/lstr "dividend-price ratio@en"
                     #voc/lstr "dividend yield@en"],
   :db/ident :fibo-sec-eq-eq/ShareYield,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "share yield@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-sec-eq-eq/OrdinaryDividend
                                            :fibo-fbc-fi-ip/SecurityPrice],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-ip/Yield
                     :fibo-sec-eq-eq/ShareYield],
   :skos/definition
   #voc/lstr
    "ratio of the annualized dividend per share divided by the (current) price per share@en"})

(def SingleVotingShare
  "share that has the right to exactly one vote"
  {:db/ident :fibo-sec-eq-eq/SingleVotingShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "single voting share@en",
   :rdfs/subClassOf
   [{:owl/hasValue   {:xsd/long 1},
     :owl/onProperty :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/Share
    :fibo-sec-eq-eq/SingleVotingShare
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
     :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-corp-corp/hasSharesAuthorized,
     :owl/someValuesFrom :xsd/nonNegativeInteger,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
     :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition #voc/lstr
                     "share that has the right to exactly one vote@en"})

(def SoftRetractablePreferredShare
  "retractable preferred share whose retraction value may be paid in cash or in an equal value of common stock of the issuer, at the option of the issuer"
  {:db/ident :fibo-sec-eq-eq/SoftRetractablePreferredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "soft retractable preferred share",
   :rdfs/subClassOf
   [:fibo-sec-eq-eq/RetractablePreferredShare
    :fibo-sec-eq-eq/SoftRetractablePreferredShare
    {:owl/onProperty     :fibo-fbc-fi-fi/hasRedemptionProvision,
     :owl/someValuesFrom :fibo-sec-eq-eq/EquityRedemptionProvision,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasDividend,
     :owl/someValuesFrom {:owl/unionOf [:fibo-sec-eq-eq/OrdinaryDividend
                                        :fibo-sec-eq-eq/PreferredDividend],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :cmns-dt/ExplicitDate,
     :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
     :rdf/type       :owl/Restriction}
    :fibo-sec-eq-eq/Share
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/isSeniorTo,
     :owl/someValuesFrom :fibo-sec-eq-eq/CommonShare,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
     :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-corp-corp/hasSharesAuthorized,
     :owl/someValuesFrom :xsd/nonNegativeInteger,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
     :rdf/type        :owl/Restriction}
    :fibo-sec-eq-eq/PreferredShare
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
     :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition
   "retractable preferred share whose retraction value may be paid in cash or in an equal value of common stock of the issuer, at the option of the issuer"})

(def SpecialDividend
  "dividend that is paid to shareholders on a one-time basis"
  {:cmns-av/usageNote
   #voc/lstr
    "Special dividends may be included in a dividend schedule as an ad-hoc entry, since they still need to be tracked based on the date of issuance.@en",
   :db/ident :fibo-sec-eq-eq/SpecialDividend,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "special dividend",
   :rdfs/subClassOf [:fibo-sec-eq-eq/Dividend
                     :fibo-sec-eq-eq/SpecialDividend
                     :fibo-fnd-agr-agr/Commitment
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fnd-pas-psch/hasPaymentAmount,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-eq-eq/DividendSchedule,
                      :owl/onProperty :fibo-fnd-dt-fd/hasSchedule,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass :fibo-sec-eq-eq/DividendDistributionMethod,
                      :owl/onProperty :fibo-sec-eq-eq/hasDistributionMethod,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   "dividend that is paid to shareholders on a one-time basis"})

(def UnrestrictedShare
  "share whose ownership/transfer/sale is not subject to special conditions including country-specific restrictions"
  {:db/ident :fibo-sec-eq-eq/UnrestrictedShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "unrestricted share@en",
   :rdfs/subClassOf [:fibo-sec-eq-eq/Share
                     :fibo-fbc-fi-fi/NegotiableSecurity
                     :fibo-sec-eq-eq/UnrestrictedShare
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty
                      :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
                      :owl/someValuesFrom :xsd/decimal,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
                      :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-be-corp-corp/hasSharesAuthorized,
                      :owl/someValuesFrom :xsd/nonNegativeInteger,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
                      :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition
   #voc/lstr
    "share whose ownership/transfer/sale is not subject to special conditions including country-specific restrictions@en"})

(def VariableInterestEntityShare
  "share that certifies ownership of a contractual right to a percentage of a company's profits"
  {:cmns-av/explanatoryNote
   "Unlike a traditional stock certificate, the VIE share provides a legal proprietary interest in a completely separate company's assets, sometimes referred to as a shell company. The contractual right certified by the VIE share is derived from a contract between (1) the company named on the VIE share and (2) the shell company. In other words, VIE shareholders only have a traditional stock certificate in the completely separate shell company, which is entitled to a percentage of the named company's profits via a private contract.",
   :cmns-av/synonym #voc/lstr "VIE share@en-GB",
   :db/ident :fibo-sec-eq-eq/VariableInterestEntityShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "variable interest entity share@en-US",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
     :owl/someValuesFrom {:owl/onProperty :fibo-fnd-pty-rl/isPlayedBy,
                          :owl/someValuesFrom
                          :fibo-be-le-lp/VariableInterestEntity,
                          :rdf/type :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-sec-eq-eq/Share
    :fibo-sec-eq-eq/VariableInterestEntityShare
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
     :owl/someValuesFrom :xsd/decimal,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
     :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-corp-corp/hasSharesAuthorized,
     :owl/someValuesFrom :xsd/nonNegativeInteger,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/string,
     :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :xsd/nonNegativeInteger,
     :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
     :rdf/type        :owl/Restriction}
    {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
     :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/EquityInstrument],
   :skos/definition
   "share that certifies ownership of a contractual right to a percentage of a company's profits"})

(def VotingRight
  "contractual right that specifies shareholder voting entitlements, such as to elect directors, elect outside auditors, and vote on matters of corporate policy"
  {:cmns-av/explanatoryNote
   "Voting may involve decisions on issuing securities, initiating stock splits, and making substantial changes in the corporation's operations. Note that a given share may not have voting rights, in which case the number of votes per share would be zero.",
   :db/ident :fibo-sec-eq-eq/VotingRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "voting right",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/isConferredBy,
                      :owl/someValuesFrom :fibo-fnd-agr-ctr/WrittenContract,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-law-lcap/ContractualRight
                     :fibo-sec-eq-eq/VotingRight],
   :skos/definition
   "contractual right that specifies shareholder voting entitlements, such as to elect directors, elect outside auditors, and vote on matters of corporate policy"})

(def confersNumberOfVotesPerShare
  "grants the right to vote on a per share basis to the shareholder"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "A given share may have zero, fractional, one, or more votes per share, depending on the contract.@en",
   :db/ident :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "number of votes per share@en",
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf [:fibo-fnd-acc-cur/hasAmount
                        :fibo-sec-eq-eq/confersNumberOfVotesPerShare],
   :skos/definition
   #voc/lstr
    "grants the right to vote on a per share basis to the shareholder@en"})

(def confersOwnershipOf
  "grants ownership via contract"
  {:db/ident :fibo-sec-eq-eq/confersOwnershipOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-agr-ctr/Contract,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "confers ownership of",
   :rdfs/subPropertyOf [:fibo-fnd-rel-rel/confers
                        :fibo-sec-eq-eq/confersOwnershipOf],
   :skos/definition #voc/lstr "grants ownership via contract@en"})

(def hasAdjustableDividendRate
  "indicates a variable dividend rate, typically specified in the prospectus as a formula based on a benchmark or set at auction"
  {:db/ident :fibo-sec-eq-eq/hasAdjustableDividendRate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-eq/PreferredDividend,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "has adjustable dividend rate",
   :rdfs/range :fibo-fnd-acc-cur/PercentageMonetaryAmount,
   :rdfs/subPropertyOf [:fibo-fnd-qt-qtu/hasQuantityValue
                        :fibo-sec-eq-eq/hasAdjustableDividendRate],
   :skos/definition
   "indicates a variable dividend rate, typically specified in the prospectus as a formula based on a benchmark or set at auction"})

(def hasDistributionMethod
  "indicates the method by which dividend payments are to be distributed"
  {:db/ident :fibo-sec-eq-eq/hasDistributionMethod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-eq/Dividend,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "has distribution method",
   :rdfs/range :fibo-sec-eq-eq/DividendDistributionMethod,
   :rdfs/subPropertyOf [:fibo-fnd-gao-obj/hasStrategy
                        :fibo-sec-eq-eq/hasDistributionMethod],
   :skos/definition
   "indicates the method by which dividend payments are to be distributed"})

(def hasDividend
  "relates a share to a dividend that applies to that share, or that the share may pay"
  {:db/ident :fibo-sec-eq-eq/hasDividend,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-eq/Share,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "has dividend",
   :rdfs/range :fibo-sec-eq-eq/Dividend,
   :rdfs/subPropertyOf [:cmns-cls/isClassifiedBy :fibo-sec-eq-eq/hasDividend],
   :skos/definition
   "relates a share to a dividend that applies to that share, or that the share may pay"})

(def hasDividendDeclarationDate
  "indicates a date on which an organization states that a dividend payment may be anticipated, including the the dividend amount and the ex-dividend and payment dates"
  {:cmns-av/synonym "has announcement date",
   :db/ident :fibo-sec-eq-eq/hasDividendDeclarationDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-eq/Share,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "has declaration date",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf [:cmns-dt/hasExplicitDate
                        :fibo-sec-eq-eq/hasDividendDeclarationDate],
   :skos/definition
   "indicates a date on which an organization states that a dividend payment may be anticipated, including the the dividend amount and the ex-dividend and payment dates"})

(def hasDividendGracePeriod
  "indicates a period of time after a dividend payment becomes due, before the issuer is subject to penalties"
  {:db/ident :fibo-sec-eq-eq/hasDividendGracePeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-eq/PreferredDividend,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "has dividend grace period",
   :rdfs/range :cmns-dt/Duration,
   :rdfs/subPropertyOf [:cmns-dt/hasDuration
                        :fibo-sec-eq-eq/hasDividendGracePeriod],
   :skos/definition
   "indicates a period of time after a dividend payment becomes due, before the issuer is subject to penalties"})

(def hasEarliestRedemptionDate
  "indicates a date on or after which a stock can be redeemed"
  {:db/ident :fibo-sec-eq-eq/hasEarliestRedemptionDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-eq/EquityRedemptionProvision,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "has earliest redemption date",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf [:cmns-dt/hasExplicitDate
                        :fibo-sec-eq-eq/hasEarliestRedemptionDate],
   :skos/definition
   "indicates a date on or after which a stock can be redeemed"})

(def hasExDividendDate
  "indicates a date on which a stock 'goes ex-dividend', typically about three weeks before the dividend is paid to shareholders of record"
  {:cmns-av/adaptedFrom
   "https://www.investor.gov/introduction-investing/investing-basics/glossary/ex-dividend-dates-when-are-you-entitled-stock-and",
   :cmns-av/explanatoryNote
   ["Once the company sets the record date, the ex-dividend date is set based on stock exchange rules. If you purchase a stock on its ex-dividend date or after, you will not receive the next dividend payment."
    "Shares listed on the New York Stock Exchange go ex-dividend four business days prior to the record date."],
   :cmns-av/synonym ["has ex-date" "has expected dividend date"],
   :db/ident :fibo-sec-eq-eq/hasExDividendDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-eq/Share,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "has ex-dividend date",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf [:cmns-dt/hasExplicitDate
                        :fibo-sec-eq-eq/hasExDividendDate],
   :skos/definition
   "indicates a date on which a stock 'goes ex-dividend', typically about three weeks before the dividend is paid to shareholders of record"})

(def hasExtendableMaturityDate
  "indicates whether the issuer and/or holders of redeemable shares with a fixed maturity date have the option to extend the maturity date"
  {:db/ident :fibo-sec-eq-eq/hasExtendableMaturityDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-eq-eq/PreferredShare,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "has extendable maturity date",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether the issuer and/or holders of redeemable shares with a fixed maturity date have the option to extend the maturity date"})

(def hasExtendableRedemptionDate
  "indicates whether the issuer and/or holders of redeemable shares with a specified redemption date have the option to extend that date"
  {:db/ident :fibo-sec-eq-eq/hasExtendableRedemptionDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-eq-eq/EquityRedemptionProvision,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "has extendable redemption date",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether the issuer and/or holders of redeemable shares with a specified redemption date have the option to extend that date"})

(def hasFixedDividendRate
  "indicates a pre-arranged fixed dividend rate, typically specified in the prospectus, for a preferred share"
  {:db/ident :fibo-sec-eq-eq/hasFixedDividendRate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-eq/PreferredDividend,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "has fixed dividend rate",
   :rdfs/range :fibo-fnd-acc-cur/PercentageMonetaryAmount,
   :rdfs/subPropertyOf [:fibo-fnd-qt-qtu/hasQuantityValue
                        :fibo-sec-eq-eq/hasFixedDividendRate],
   :skos/definition
   "indicates a pre-arranged fixed dividend rate, typically specified in the prospectus, for a preferred share"})

(def hasFloatingShares
  "indicates the number of shares that are available for trading, i.e., the number of shares outstanding less closely held shares (those held by insiders) and restricted shares"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "A relatively small float results in higher volatility, as a large purchase or sell order will have significant influence on the value of the stock.@en",
   :db/ident :fibo-sec-eq-eq/hasFloatingShares,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "has floating shares@en",
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf [:fibo-fnd-acc-cur/hasAmount
                        :fibo-sec-eq-eq/hasFloatingShares],
   :skos/definition
   #voc/lstr
    "indicates the number of shares that are available for trading, i.e., the number of shares outstanding less closely held shares (those held by insiders) and restricted shares@en"})

(def hasMinimumRedemptionPrice
  "indicates the lowest market price above which a share may be redeemed"
  {:db/ident :fibo-sec-eq-eq/hasMinimumRedemptionPrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-eq/EquityRedemptionProvision,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "has minimum redemption price",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf [:fibo-fnd-acc-cur/hasPrice
                        :fibo-sec-eq-eq/hasMinimumRedemptionPrice],
   :skos/definition
   "indicates the lowest market price above which a share may be redeemed"})

(def hasRecordDate
  "indicates the date on which the issuer checks to determine whether a party was on the company's books as a shareholder when required (i.e., they must have been on the books prior to the ex-dividend date), to identify who is eligible to receive the next dividend"
  {:cmns-av/adaptedFrom
   "https://www.investor.gov/introduction-investing/investing-basics/glossary/ex-dividend-dates-when-are-you-entitled-stock-and",
   :cmns-av/explanatoryNote
   "Companies also use this date to determine who is sent proxy statements, financial reports, and other information.",
   :cmns-av/synonym "has date of record",
   :db/ident :fibo-sec-eq-eq/hasRecordDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-eq/Share,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "has record date",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf [:cmns-dt/hasExplicitDate :fibo-sec-eq-eq/hasRecordDate],
   :skos/definition
   "indicates the date on which the issuer checks to determine whether a party was on the company's books as a shareholder when required (i.e., they must have been on the books prior to the ex-dividend date), to identify who is eligible to receive the next dividend"})

(def hasRedemptionPremium
  "indicates the premium price per share over the market price, if any, that must be paid in order to redeem the stock"
  {:db/ident :fibo-sec-eq-eq/hasRedemptionPremium,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-eq/EquityRedemptionProvision,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "has redemption premium",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryPrice,
   :rdfs/subPropertyOf [:fibo-fnd-acc-cur/hasPrice
                        :fibo-sec-eq-eq/hasRedemptionPremium],
   :skos/definition
   "indicates the premium price per share over the market price, if any, that must be paid in order to redeem the stock"})

(def hasShareClass
  "indicates the class to which the share belongs, typically differentiated by privileges, such as voting rights"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Classes of shares, including shares in a mutual fund, are designated by name or a character (letter), such as A, B, C, etc. In the case of a mutual fund, different classes of shares may incur different fees and expenses.@en",
   :db/ident :fibo-sec-eq-eq/hasShareClass,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-eq-eq/Share,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "has share class@en",
   :rdfs/range :xsd/string,
   :skos/definition
   #voc/lstr
    "indicates the class to which the share belongs, typically differentiated by privileges, such as voting rights@en"})

(def hasSharePaymentStatus
  "indicates the payment status for shares issued"
  {:db/ident :fibo-sec-eq-eq/hasSharePaymentStatus,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-eq/Share,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "has share payment status@en",
   :rdfs/range :fibo-sec-eq-eq/SharePaymentStatus,
   :rdfs/subPropertyOf [:cmns-cls/isClassifiedBy
                        :fibo-sec-eq-eq/hasSharePaymentStatus],
   :skos/definition #voc/lstr
                     "indicates the payment status for shares issued@en"})

(def hasSharesIssued
  "indicates the actual number of shares held by shareholders (i.e., shares outstanding) and treasury shares"
  {:db/ident :fibo-sec-eq-eq/hasSharesIssued,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "has shares issued@en",
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf [:fibo-fnd-acc-cur/hasAmount
                        :fibo-sec-eq-eq/hasSharesIssued],
   :skos/definition
   #voc/lstr
    "indicates the actual number of shares held by shareholders (i.e., shares outstanding) and treasury shares@en"})

(def hasSharesOutstanding
  "indicates the number of shares currently held by shareholders, including those held by retail investors, institutional investors and insiders, and typically available for trading"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "The number of outstanding shares is used in calculating key metrics such as a company's market capitalization, as well as its earnings per share (EPS) and cash flow per share (CFPS).@en",
   :db/ident :fibo-sec-eq-eq/hasSharesOutstanding,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "has shares outstanding@en",
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf [:fibo-fnd-acc-cur/hasAmount
                        :fibo-sec-eq-eq/hasSharesOutstanding],
   :skos/definition
   #voc/lstr
    "indicates the number of shares currently held by shareholders, including those held by retail investors, institutional investors and insiders, and typically available for trading@en"})

(def hasTreasuryShares
  "indicates the number of shares issued but not outstanding, including those that were available in the market at one time but have been repurchased by the company"
  {:db/ident :fibo-sec-eq-eq/hasTreasuryShares,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "has treasury shares@en",
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf [:fibo-fnd-acc-cur/hasAmount
                        :fibo-sec-eq-eq/hasTreasuryShares],
   :skos/definition
   #voc/lstr
    "indicates the number of shares issued but not outstanding, including those that were available in the market at one time but have been repurchased by the company@en"})

(def hasVotingRestriction
  "specifies restrictions on voting rights, if any"
  {:cmns-av/explanatoryNote
   "Such restrictions may apply regardless of the number of votes per share.",
   :db/ident :fibo-sec-eq-eq/hasVotingRestriction,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-eq-eq/Share,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "has voting restriction@en",
   :rdfs/range :xsd/string,
   :skos/definition "specifies restrictions on voting rights, if any"})

(def indicatesNumberOfShares
  "indicates the number of shares associated with the position"
  {:db/ident :fibo-sec-eq-eq/indicatesNumberOfShares,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-eq-eq/EquityPosition,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label #voc/lstr "indicates number of shares@en",
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf [:fibo-fnd-acc-cur/hasAmount
                        :fibo-sec-eq-eq/indicatesNumberOfShares],
   :skos/definition
   #voc/lstr "indicates the number of shares associated with the position@en"})

(def isRedeemableAtIssuerOption
  "indicates whether the issuer has the option of initiating the buy-back, similar to a call feature"
  {:db/ident :fibo-sec-eq-eq/isRedeemableAtIssuerOption,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-fi-fi/RedemptionProvision,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "is redeemable at issuer option",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether the issuer has the option of initiating the buy-back, similar to a call feature"})

(def isRedeemableAtShareholderOption
  "indicates whether the shareholder has the option of initiating the buy-back, similar to a put feature"
  {:db/ident :fibo-sec-eq-eq/isRedeemableAtShareholderOption,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-fi-fi/RedemptionProvision,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "is redeemable at shareholder option",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether the shareholder has the option of initiating the buy-back, similar to a put feature"})

(def isSeniorTo
  "indicates that a given share (share class) has higher seniority than the related share, meaning that it gives the holder a higher claim on the assets of the issuer"
  {:db/ident :fibo-sec-eq-eq/isSeniorTo,
   :rdf/type [:owl/TransitiveProperty :owl/ObjectProperty],
   :rdfs/domain :fibo-sec-eq-eq/Share,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "is senior to",
   :rdfs/range :fibo-sec-eq-eq/Share,
   :skos/definition
   "indicates that a given share (share class) has higher seniority than the related share, meaning that it gives the holder a higher claim on the assets of the issuer"})

(def pays
  {:db/ident :fibo-sec-eq-eq/pays,
   :owl/deprecated true,
   :owl/equivalentProperty :fibo-sec-eq-eq/hasDividend,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"})

(def specifiesConversionDate
  "indicates the date on which, or after which, conversion may occur"
  {:db/ident :fibo-sec-eq-eq/specifiesConversionDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-eq/EquityConversionTerms,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label "specifies conversion date",
   :rdfs/range :cmns-dt/Date,
   :skos/definition
   "indicates the date on which, or after which, conversion may occur"})