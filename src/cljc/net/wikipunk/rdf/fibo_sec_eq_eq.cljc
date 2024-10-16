(ns net.wikipunk.rdf.fibo-sec-eq-eq
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2018-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Equities/EquityInstruments/",
   :dcterms/abstract
   "Core terms are those fundamental to all equity instruments. This ontology also distinguishes between privately held and publicly traded equity instruments, and defines a number of related concepts, such as voting rights.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-qtu" "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
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
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
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
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/SecuritiesIssuance/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/LegalCapacity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/Partnerships/Partnerships/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/InstrumentPricing/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/IND/InterestRates/InterestRates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Agreements/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/ProductsAndServices/PaymentsAndSchedules/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/Corporations/Corporations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/AccountingEquity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/CorporateOwnership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/Lifecycles/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/DatesAndTimes/BusinessDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/DebtAndEquities/Debt/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Equities/EquityInstruments/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-eq-eq",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Equity Instruments Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to refine the definition of share to include a restriction for hasSharesOutstanding, eliminate duplication of concepts in LCC, and add the concept of an equity issuer."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to revise the definition of dividend to explicitly state that it reflects the announced commitment of a specific dividend rather than a more general policy."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of the ontology was modified to add a link to the formula used to calculate an adjustable rate dividend and loosen some constraints to make the ontology more useful in cases where one could have information about a preferred share, such as having an adjustable rate dividend, but not necessarily having the details (SEC-138)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to clean up deprecated elements, most of which had been in the ontology for awhile."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of the ontology was modified to add a property for the number of available shares, required for MiFID reporting (SEC-97)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to refine the definition of listed share, update definitions to remove leading articles, add missing properties and restrictions, revise the definition of dividend."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of the ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380) and to clean up details related to regular schedules (FBC-317)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to rename ownership related properties for consistent alignment with the ownership situational pattern and to move properties / restrictions that define how many shares have been issued from the issuer to the share."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to reflect the move of hasMaturityDate from FinancialInstruments to Debt in FBC and eliminate named individuals for specifying voting rights, which caused issues for some tools."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to add the notion of a VIE share and integrate dividend distribution method with strategy."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to replace 'publicly-traded share' with 'exchange-specific share', which is the more commonly used designation and corresponds better with the intended semantics of this concept, to merge in concepts that were formerly in a separate ShareTerms ontology, and eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to incorporate additional features required to map the CFI classification scheme to equity instruments, including features specific to preferred shares."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to add concepts covering additional features of preferred shares, move the two exhaustive CFI-specific classes to the Equity CFI individuals ontology, rename EquityIssuer to ShareIssuer to be clearer about the intent, and add the concept of a price per share."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of the ontology was modified to eliminate deprecations that are more than 6 months old and to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to address text formatting hygiene issues."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to incorporate a property allowing representation of the share class, streamline the representation of voting rights and payment form, clean up ambiguous definitions, and eliminate redundant restrictions related to security form."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to deprecate the notion of a securities restriction specific to a limited partnership fund unit, which required import of unnecessary content and would not be used in practice."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was modified to clarify a restriction on perpetual preferred share, add extendible preferred share, and add the CFI definition for limited partnership unit."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"})

(def AdjustableRateDividend
  {:cmns-av/explanatoryNote
   "The value of the dividend from the preferred share is set by a predetermined formula to move with rates, and because of this flexibility preferred prices are often more stable then fixed-rate preferred stocks.",
   :db/ident :fibo-sec-eq-eq/AdjustableRateDividend,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "adjustable rate dividend",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-sec-eq-eq/hasAdjustableDividendRate,
      :owl/someValuesFrom :fibo-fnd-acc-cur/PercentageMonetaryAmount,
      :rdf/type           :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onDataRange :xsd/string,
      :owl/onProperty  :cmns-qtu/describesActualExpression,
      :rdf/type        :owl/Restriction} :fibo-sec-eq-eq/PreferredDividend
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-ind-ir-ir/InterestRateBenchmark,
      :owl/onProperty :cmns-qtu/hasQuantityKind,
      :rdf/type       :owl/Restriction}},
   :skos/definition "dividend that varies with a benchmark"})

(def AuctionRateDividend
  {:db/ident :fibo-sec-eq-eq/AuctionRateDividend,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "auction rate dividend",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-sec-eq-eq/hasAdjustableDividendRate,
      :owl/someValuesFrom :fibo-fnd-acc-cur/PercentageMonetaryAmount,
      :rdf/type           :owl/Restriction} :fibo-sec-eq-eq/PreferredDividend},
   :skos/definition
   "preferred share dividend whose rate is periodically reset through an auction, typically every 7, 14, 28, or 35 days"})

(def CommonShare
  {:cmns-av/explanatoryNote
   "In the event that the corporation is liquidated, claims of secured and unsecured creditors and owners of bonds and preferred shares take precedence over claims of common share holders.",
   :cmns-av/synonym {:rdf/language "en-GB",
                     :rdf/value    "ordinary share"},
   :db/ident :fibo-sec-eq-eq/CommonShare,
   :owl/disjointWith :fibo-sec-eq-eq/PreferredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "common share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/Share
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-sec-eq-eq/OrdinaryDividend,
                       :owl/onProperty :fibo-sec-eq-eq/hasDividend,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "share that signifies a unit of ownership in a corporation and represents a claim on part of the corporation's assets and earnings"})

(def ConvertibleCommonShare
  {:db/ident :fibo-sec-eq-eq/ConvertibleCommonShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "convertible common share",
   :rdfs/subClassOf #{:fibo-sec-sec-iss/ConvertibleSecurity
                      :fibo-sec-eq-eq/CommonShare},
   :skos/definition "common share that is convertible into another security"})

(def ConvertiblePreferredShare
  {:cmns-av/explanatoryNote
   "Most convertible preferred stock is exchanged at the request of the shareholder, but sometimes there is a provision that allows the company, or issuer, to force conversion. The value of a convertible preferred stock is ultimately based on the performance of the common stock.",
   :db/ident :fibo-sec-eq-eq/ConvertiblePreferredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "convertible preferred share",
   :rdfs/subClassOf #{:fibo-sec-sec-iss/ConvertibleSecurity
                      :fibo-sec-eq-eq/PreferredShare},
   :skos/definition
   "preferred share that includes an option for the holder to convert the shares into a fixed number of common shares after a predetermined date"})

(def CumulativePreferredShare
  {:cmns-av/explanatoryNote
   "These dividends have precedence over ordinary dividends which cannot be paid until any cumulative dividend obligations have been paid. Dividends are typically deferred due to insufficient earnings or other business reasons.",
   :db/ident :fibo-sec-eq-eq/CumulativePreferredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "cumulative preferred share",
   :rdfs/subClassOf :fibo-sec-eq-eq/PreferredShare,
   :skos/definition
   "preferred share whose dividends, if not paid on time, accumulate until paid out"})

(def Custodian
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.investopedia.com/terms/c/custodian.asp"},
   :cmns-av/explanatoryNote
   "The custodian may hold stocks or other assets in electronic or physical form for mutual funds, individuals, and organizational clients.",
   :db/ident :fibo-sec-eq-eq/Custodian,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "custodian",
   :rdfs/subClassOf #{:fibo-fbc-fct-fse/FinancialInstitution
                      {:owl/onProperty     :fibo-fnd-rel-rel/holds,
                       :owl/someValuesFrom :fibo-sec-eq-eq/Share,
                       :rdf/type           :owl/Restriction}
                      :fibo-fbc-pas-fpas/ThirdPartyAgent},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "financial institution that holds customers' securities for safekeeping"}})

(def DistributionByCashPayment
  {:db/ident :fibo-sec-eq-eq/DistributionByCashPayment,
   :rdf/type #{:fibo-sec-eq-eq/DividendDistributionMethod :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "distribution by payment",
   :skos/definition
   "distribution method involving payment of cash to the shareholder"})

(def DistributionByReinvestment
  {:db/ident :fibo-sec-eq-eq/DistributionByReinvestment,
   :rdf/type #{:fibo-sec-eq-eq/DividendDistributionMethod :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "distribution by reinvestment",
   :skos/definition
   "distribution method involving automatic reinvestment of shareholders' dividends in additional, potentially fractional, shares in the same asset"})

(def Dividend
  {:cmns-av/explanatoryNote
   "The amount and timing of payment is set by the board of directors, typically quarterly. Dividends may be paid in the form of money, shares, scrip, or on rare occasion, property.",
   :db/ident :fibo-sec-eq-eq/Dividend,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "dividend",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-sec-eq-eq/DividendSchedule,
                       :owl/onProperty :fibo-fnd-dt-fd/hasSchedule,
                       :rdf/type       :owl/Restriction}
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onClass :fibo-sec-eq-eq/DividendDistributionMethod,
                       :owl/onProperty :fibo-sec-eq-eq/hasDistributionMethod,
                       :rdf/type :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                       :owl/onProperty :fibo-fnd-pas-psch/hasPaymentAmount,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-agr-agr/Commitment},
   :skos/definition
   "announced commitment to make a specific distribution of a portion of earnings to shareholders, prorated by class of security"})

(def DividendDistributionMethod
  {:cmns-av/explanatoryNote
   "Distribution may be by payment of a monetary amount or by reinvestment, as specified by the board of directors at the time a decision to issue a dividend is made.",
   :db/ident :fibo-sec-eq-eq/DividendDistributionMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "dividend distribution method",
   :rdfs/subClassOf #{:fibo-fnd-dt-bd/Convention :fibo-fnd-gao-obj/Strategy},
   :skos/definition
   "convention by which dividends are provided to shareholders"})

(def DividendSchedule
  {:db/ident :fibo-sec-eq-eq/DividendSchedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "dividend schedule",
   :rdfs/subClassOf #{:fibo-fnd-dt-fd/RegularSchedule
                      :fibo-fnd-pas-psch/PaymentSchedule},
   :skos/definition
   "payment schedule indicating the dates on which dividends are due to be paid"})

(def EnhancedVotingShare
  {:db/ident :fibo-sec-eq-eq/EnhancedVotingShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "enhanced voting share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/Share
     {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
      :owl/someValuesFrom {:owl/onDatatype :xsd/decimal,
                           :owl/withRestrictions [{:xsd/minExclusive 1M}],
                           :rdf/type       :rdfs/Datatype},
      :rdf/type           :owl/Restriction}},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "share that confers more than one vote per share"}})

(def EquityConversionTerms
  {:db/ident :fibo-sec-eq-eq/EquityConversionTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "equity conversion terms",
   :rdfs/subClassOf #{:fibo-sec-sec-iss/ConversionTerms
                      {:owl/onProperty :fibo-sec-eq-eq/specifiesConversionDate,
                       :owl/someValuesFrom :cmns-dt/Date,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty
                       :fibo-sec-sec-iss/specifiesConversionInto,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "conversion terms specifying the details regarding conversion of shares into other securities"})

(def EquityPosition
  {:db/ident :fibo-sec-eq-eq/EquityPosition,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity position"},
   :rdfs/subClassOf
   #{{:owl/onClass    {:owl/unionOf [:fibo-be-oac-cown/Shareholder
                                     :fibo-sec-eq-eq/Custodian],
                       :rdf/type    :owl/Class},
      :owl/onProperty :fibo-fnd-rel-rel/isHeldBy,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-oac-own/hasOwnedAsset,
      :owl/someValuesFrom {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
                           :owl/someValuesFrom :fibo-sec-eq-eq/Share,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction} :fibo-fbc-pas-fpas/Position
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-be-oac-cown/Shareholder,
      :owl/onProperty :fibo-fnd-oac-own/hasOwningParty,
      :rdf/type       :owl/Restriction}
     {:owl/onDataRange :xsd/decimal,
      :owl/onProperty  :fibo-sec-eq-eq/indicatesNumberOfShares,
      :owl/qualifiedCardinality 1,
      :rdf/type        :owl/Restriction}},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "position in an equity instrument"}})

(def EquityRedemptionProvision
  {:db/ident :fibo-sec-eq-eq/EquityRedemptionProvision,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equity redemption provision"},
   :rdfs/subClassOf
   #{{:owl/minQualifiedCardinality 0,
      :owl/onDataRange :xsd/boolean,
      :owl/onProperty  :fibo-sec-eq-eq/hasExtendableRedemptionDate,
      :rdf/type        :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fnd-acc-cur/MonetaryPrice,
      :owl/onProperty :fibo-sec-eq-eq/hasRedemptionPremium,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onDataRange :xsd/boolean,
      :owl/onProperty  :fibo-sec-eq-eq/isRedeemableAtShareholderOption,
      :rdf/type        :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fnd-acc-cur/MonetaryPrice,
      :owl/onProperty :fibo-sec-eq-eq/hasMinimumRedemptionPrice,
      :rdf/type       :owl/Restriction} :fibo-fbc-fi-fi/RedemptionProvision
     {:owl/minQualifiedCardinality 0,
      :owl/onDataRange :xsd/boolean,
      :owl/onProperty  :fibo-sec-eq-eq/isRedeemableAtIssuerOption,
      :rdf/type        :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :cmns-dt/ExplicitDate,
      :owl/onProperty :fibo-sec-eq-eq/hasEarliestRedemptionDate,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "redemption provision that specifies the conditions under which the issuer or shareholder may redeem the shares"}})

(def EquityRedemptionProvisionWithExtendableRedemptionDate
  {:db/ident
   :fibo-sec-eq-eq/EquityRedemptionProvisionWithExtendableRedemptionDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "equity redemption provision with extendable redemption date"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/EquityRedemptionProvision
                      {:owl/hasValue {:xsd/boolean true},
                       :owl/onProperty
                       :fibo-sec-eq-eq/hasExtendableRedemptionDate,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "equity redemption provision that allows modification of the redemption date beyond the original specified date"}})

(def ExchangeablePreferredShare
  {:db/ident :fibo-sec-eq-eq/ExchangeablePreferredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "exchangeable preferred share",
   :rdfs/subClassOf :fibo-sec-eq-eq/PreferredShare,
   :skos/definition
   "preferred share that may be exchanged for a security of another issuer"})

(def ExtendablePreferredShare
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :cmns-av/explanatoryNote
   "An extendable preferred share may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption (meturity) date.",
   :cmns-av/synonym "extendible preferred share",
   :db/ident :fibo-sec-eq-eq/ExtendablePreferredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "extendable preferred share",
   :rdfs/subClassOf :fibo-sec-eq-eq/PreferredShare,
   :skos/definition
   "preferred share whose redemption date can be extended at the issuer or holder option"})

(def FixedRateDividend
  {:cmns-av/explanatoryNote
   "In other words, the return is not variable depending on whether or not the company makes a profit. Annual dividends are calculated as a percentage of the par value, which is the price of the preferred stock at the time it was issued. Most preferred shares have fixed rate dividends.",
   :db/ident :fibo-sec-eq-eq/FixedRateDividend,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "fixed rate dividend",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-sec-eq-eq/hasFixedDividendRate,
      :owl/someValuesFrom :fibo-fnd-acc-cur/PercentageMonetaryAmount,
      :rdf/type           :owl/Restriction} :fibo-sec-eq-eq/PreferredDividend},
   :skos/definition
   "dividend that provides a specified annual return on the nominal value (and any premium) paid on shares"})

(def FullyPaidShare
  {:db/ident :fibo-sec-eq-eq/FullyPaidShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fully paid share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/Share
                      {:owl/hasValue   :fibo-sec-eq-eq/FullyPaidShareStatus,
                       :owl/onProperty :fibo-sec-eq-eq/hasSharePaymentStatus,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "share whose payment status indicates that no additional money is owed to the company by shareholders on the value of the shares"}})

(def FullyPaidShareStatus
  {:db/ident :fibo-sec-eq-eq/FullyPaidShareStatus,
   :rdf/type #{:fibo-sec-eq-eq/SharePaymentStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "fully paid share status",
   :skos/definition
   "status indicating that no additional money is owed to the company by shareholders on the value of the shares"})

(def HardRetractablePreferredShare
  {:db/ident :fibo-sec-eq-eq/HardRetractablePreferredShare,
   :owl/disjointWith :fibo-sec-eq-eq/SoftRetractablePreferredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "hard retractable preferred share",
   :rdfs/subClassOf :fibo-sec-eq-eq/RetractablePreferredShare,
   :skos/definition
   "retractable preferred share whose retraction value must be paid in cash"})

(def LimitedPartnershipUnit
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Like shareholders in a corporation, the LPs have limited liability, i.e., they are only liable on debts incurred by the firm to the extent of their registered investment and they have no management authority. The GPs pay the LPs the equivalent of a dividend on their investment, the nature and extent of which is usually defined in the partnership agreement."},
   :db/ident :fibo-sec-eq-eq/LimitedPartnershipUnit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "limited partnership unit"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/Share
                      {:owl/onProperty     :fibo-fnd-agr-ctr/hasCounterparty,
                       :owl/someValuesFrom {:owl/onProperty
                                            :cmns-rlcmp/isPlayedBy,
                                            :owl/someValuesFrom
                                            :fibo-be-ptr-ptr/LimitedPartnership,
                                            :rdf/type :owl/Restriction},
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "share in a form of partnership similar to a general partnership, except that in addition to one or more general partners (GPs), there are one or more limited partners (LPs)"}})

(def ListedShare
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Listing requirements vary by exchange and include minimum stockholder's equity, a minimum share price and a minimum number of shareholders. Exchanges have listing requirements to ensure that only high quality securities are traded on them and to uphold the exchange's reputation among investors."},
   :db/ident :fibo-sec-eq-eq/ListedShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "listed share"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.investopedia.com/terms/l/listedsecurity.asp"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/Share :fibo-sec-sec-lst/ListedSecurity},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "share that is listed on at least one platform"}})

(def NilPaidShare
  {:db/ident :fibo-sec-eq-eq/NilPaidShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "nil paid share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/Share
                      {:owl/hasValue   :fibo-sec-eq-eq/NilPaidShareStatus,
                       :owl/onProperty :fibo-sec-eq-eq/hasSharePaymentStatus,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "share whose payment status indicates that none of the market value has been received by the company for the shares"}})

(def NilPaidShareStatus
  {:db/ident :fibo-sec-eq-eq/NilPaidShareStatus,
   :owl/differentFrom #{:fibo-sec-eq-eq/PartiallyPaidShareStatus
                        :fibo-sec-eq-eq/FullyPaidShareStatus},
   :rdf/type #{:fibo-sec-eq-eq/SharePaymentStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "nil paid share status",
   :skos/definition
   "status indicating that none of the market value has been received by the company for the shares",
   :skos/example
   "Unpaid shares may be issued, for example, for convenience by a start-up company."})

(def NonCumulativePreferredShare
  {:db/ident :fibo-sec-eq-eq/NonCumulativePreferredShare,
   :owl/disjointWith :fibo-sec-eq-eq/CumulativePreferredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "non-cumulative preferred share",
   :rdfs/subClassOf :fibo-sec-eq-eq/PreferredShare,
   :skos/definition
   "preferred share whose dividend payments are not carried forward"})

(def NonParticipatingPreferredShare
  {:db/ident :fibo-sec-eq-eq/NonParticipatingPreferredShare,
   :owl/disjointWith :fibo-sec-eq-eq/ParticipatingPreferredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "non-participating preferred share",
   :rdfs/subClassOf :fibo-sec-eq-eq/PreferredShare,
   :skos/definition
   "preferred share that is not a participating preferred share"})

(def NonVotingShare
  {:db/ident :fibo-sec-eq-eq/NonVotingShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non-voting share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/Share
                      {:owl/hasValue {:xsd/long 0},
                       :owl/onProperty
                       :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
                       :rdf/type :owl/Restriction}},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "share that has no voting right"}})

(def OrdinaryDividend
  {:cmns-av/explanatoryNote
   #{"Most dividends are considered ordinary, unless they are specifically designated as qualified dividends."
     "Note that the terms related to ordinary dividend payment are typically specified in the context of a board resolution rather than contractually."},
   :db/ident :fibo-sec-eq-eq/OrdinaryDividend,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "ordinary dividend",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                       :owl/onProperty :fibo-fnd-pas-psch/hasPaymentAmount,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-sec-eq-eq/Dividend},
   :skos/definition "dividend that is paid to shareholders periodically"})

(def PartiallyPaidShare
  {:db/ident :fibo-sec-eq-eq/PartiallyPaidShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "partially paid share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/Share
                      {:owl/hasValue   :fibo-sec-eq-eq/PartiallyPaidShareStatus,
                       :owl/onProperty :fibo-sec-eq-eq/hasSharePaymentStatus,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "share whose payment status indicates that only a portion of the market value has been received by the company for the shares"}})

(def PartiallyPaidShareStatus
  {:cmns-av/explanatoryNote
   "In the case of partially paid shares, the shareholder is still required to pay the remaining amount to the company. Typically, partially paid shares are only issued to a shareholder if there are compelling business reasons to do so.",
   :db/ident :fibo-sec-eq-eq/PartiallyPaidShareStatus,
   :owl/differentFrom :fibo-sec-eq-eq/FullyPaidShareStatus,
   :rdf/type #{:fibo-sec-eq-eq/SharePaymentStatus :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "partially paid share status",
   :skos/definition
   "status indicating that only a portion of the market value has been received by the company for the shares"})

(def ParticipatingPreferredShare
  {:cmns-av/explanatoryNote
   "Participating preferred shares are rare, typically only issued when needed to attract investors.",
   :db/ident :fibo-sec-eq-eq/ParticipatingPreferredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "participating preferred share",
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShare
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-sec-eq-eq/OrdinaryDividend,
                       :owl/onProperty :fibo-sec-eq-eq/hasDividend,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "preferred share that, in addition to paying a stipulated dividend, gives the holder the right to participate with common share holders in additional distributions of earnings under specified conditions"})

(def PerpetualPreferredShare
  {:db/ident :fibo-sec-eq-eq/PerpetualPreferredShare,
   :owl/disjointWith :fibo-sec-eq-eq/PreferredShareWithFixedMaturityDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "perpetual preferred share",
   :rdfs/subClassOf #{{:owl/maxQualifiedCardinality 0,
                       :owl/onClass    :cmns-dt/ExplicitDate,
                       :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
                       :rdf/type       :owl/Restriction}
                      :fibo-sec-eq-eq/PreferredShare},
   :skos/definition "preferred share that has no fixed maturity date"})

(def PrecedenceRight
  {:db/ident :fibo-sec-eq-eq/PrecedenceRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "precedence right",
   :rdfs/subClassOf :fibo-fnd-law-lcap/ContractualRight,
   :skos/definition
   "right that give the shareholder higher priority with respect to certain pre-defined dividend payments over other shareholders and that pay out first in the case of liquidation"})

(def PreferredDividend
  {:db/ident :fibo-sec-eq-eq/PreferredDividend,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "preferred dividend",
   :rdfs/subClassOf #{{:owl/maxQualifiedCardinality 1,
                       :owl/onClass :fibo-fnd-acc-cur/PercentageMonetaryAmount,
                       :owl/onProperty :fibo-sec-eq-eq/hasFixedDividendRate,
                       :rdf/type :owl/Restriction}
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onClass    :cmns-dt/Duration,
                       :owl/onProperty :fibo-sec-eq-eq/hasDividendGracePeriod,
                       :rdf/type       :owl/Restriction}
                      :fibo-sec-eq-eq/Dividend},
   :skos/definition
   "commitment to distribute a portion of earnings to shareholders, similar to a dividend but often with a fixed payment amount and schedule"})

(def PreferredShare
  {:cmns-av/synonym "preference share",
   :db/ident :fibo-sec-eq-eq/PreferredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "preferred share",
   :rdfs/subClassOf #{:fibo-sec-eq-eq/Share
                      {:owl/onProperty     :fibo-sec-eq-eq/isSeniorTo,
                       :owl/someValuesFrom :fibo-sec-eq-eq/CommonShare,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-sec-eq-eq/hasDividend,
                       :owl/someValuesFrom {:owl/unionOf
                                            [:fibo-sec-eq-eq/OrdinaryDividend
                                             :fibo-sec-eq-eq/PreferredDividend],
                                            :rdf/type :owl/Class},
                       :rdf/type           :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-dt/ExplicitDate,
                       :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "share that pays dividends at a specified rate and has preference over common shares in the payment of dividends and liquidation of corporate assets"})

(def PreferredShareWithAdjustableRateDividend
  {:db/ident :fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend,
   :owl/disjointWith :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "preferred share with adjustable rate dividend",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-sec-eq-eq/AdjustableRateDividend,
                       :owl/onProperty :fibo-sec-eq-eq/hasDividend,
                       :rdf/type       :owl/Restriction}
                      :fibo-sec-eq-eq/PreferredShare},
   :skos/definition
   "preferred share whose dividend rate varies according to some benchmark"})

(def PreferredShareWithAuctionRateDividend
  {:db/ident :fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend,
   :owl/disjointWith :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "preferred share with auction rate dividend",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-sec-eq-eq/AuctionRateDividend,
                       :owl/onProperty :fibo-sec-eq-eq/hasDividend,
                       :rdf/type       :owl/Restriction}
                      :fibo-sec-eq-eq/PreferredShare},
   :skos/definition
   "preferred share whose dividend rate is periodically reset through an auction, such as a Dutch auction"})

(def PreferredShareWithFixedMaturityDate
  {:db/ident :fibo-sec-eq-eq/PreferredShareWithFixedMaturityDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "preferred share with fixed maturity date",
   :rdfs/subClassOf #{{:owl/onClass    :cmns-dt/ExplicitDate,
                       :owl/onProperty :fibo-fbc-dae-dbt/hasMaturityDate,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-sec-eq-eq/PreferredShare},
   :skos/definition
   "preferred share whose maturity date is set, typically according to the terms of the prospectus"})

(def PreferredShareWithFixedRateDividend
  {:db/ident :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "preferred share with fixed rate dividend",
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShare
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-sec-eq-eq/FixedRateDividend,
                       :owl/onProperty :fibo-sec-eq-eq/hasDividend,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "preferred share whose dividends are set, typically according to the terms of the prospectus"})

(def PricePerShare
  {:cmns-av/abbreviation "PPS",
   :cmns-av/synonym "share price",
   :db/ident :fibo-sec-eq-eq/PricePerShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "price per share",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-acc-cur/isPriceFor,
                       :owl/someValuesFrom :fibo-sec-eq-eq/Share,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-acc-cur/UnitPrice
                      :fibo-fbc-fi-ip/SecurityPrice},
   :skos/definition
   "price for one share of a given security at some point in time"})

(def PrivatelyHeldShare
  {:cmns-av/explanatoryNote
   "Privately owned companies include family-owned businesses, sole proprietorships and the vast majority of small and medium-sized businesses. These companies are often too small for an initial public offering (IPO) due, for example to a small market capitalization and/or low trading volume, and fulfill their financing requirements in other ways, including through smaller offerings.",
   :db/ident :fibo-sec-eq-eq/PrivatelyHeldShare,
   :owl/disjointWith :fibo-sec-eq-eq/ListedShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "privately held share"},
   :rdfs/subClassOf :fibo-sec-eq-eq/Share,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "share in a security that signifies ownership in an entity that is not publicly traded"}})

(def QualifiedDividend
  {:db/ident :fibo-sec-eq-eq/QualifiedDividend,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "qualified dividend",
   :rdfs/subClassOf :fibo-sec-eq-eq/Dividend,
   :skos/definition
   "dividend that falls under capital gains tax rates that are lower than the income tax rates on unqualified (ordinary) dividends"})

(def RedeemablePreferredShare
  {:db/ident :fibo-sec-eq-eq/RedeemablePreferredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "redeemable preferred share",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fbc-fi-fi/hasRedemptionProvision,
      :owl/someValuesFrom :fibo-sec-eq-eq/EquityRedemptionProvision,
      :rdf/type           :owl/Restriction} :fibo-sec-eq-eq/PreferredShare},
   :skos/definition
   "preferred share that gives the issuer the right to redeem the stock under specified conditions"})

(def RedeemablePreferredShareWithExtendableMaturityDate
  {:db/ident :fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "redeemable preferred share with extendable maturity date",
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithFixedMaturityDate
                      :fibo-sec-eq-eq/RedeemablePreferredShare
                      {:owl/hasValue {:xsd/boolean true},
                       :owl/onProperty
                       :fibo-sec-eq-eq/hasExtendableMaturityDate,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "redeemable preferred share with a fixed maturity date whose issuer has the option to extend the maturity date"})

(def RedeemablePreferredShareWithExtendableRedemptionDate
  {:cmns-av/synonym "extendible preferred share",
   :db/ident
   :fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "redeemable preferred share with extendable redemption date",
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/RedeemablePreferredShare
     {:owl/onProperty :fibo-fnd-agr-ctr/hasExtensionProvision,
      :owl/someValuesFrom
      :fibo-sec-eq-eq/EquityRedemptionProvisionWithExtendableRedemptionDate,
      :rdf/type :owl/Restriction}},
   :skos/definition
   "redeemable preferred share whose redemption date can be modified"})

(def RestrictedShare
  {:db/ident :fibo-sec-eq-eq/RestrictedShare,
   :owl/disjointWith :fibo-sec-eq-eq/UnrestrictedShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "restricted share"},
   :rdfs/subClassOf :fibo-sec-eq-eq/Share,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "share whose ownership/transfer/sale is subject to special conditions including country-specific restrictions"}})

(def RestrictedVotingShare
  {:db/ident :fibo-sec-eq-eq/RestrictedVotingShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "restricted voting share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/Share
     {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
      :owl/someValuesFrom {:owl/onDatatype :xsd/decimal,
                           :owl/withRestrictions [{:xsd/maxExclusive 1M}],
                           :rdf/type       :rdfs/Datatype},
      :rdf/type           :owl/Restriction}},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "share that confers less than one vote per share"}})

(def RetractablePreferredShare
  {:cmns-av/explanatoryNote
   "When retractable preferred shares reach maturity, the shareholder has the right to sell them back to the stock issuer at the price stated on the agreement. In some cases, the issuer can force the shareholder to sell, and may have the option of exchanging retractable preferred shares for common shares instead of cash.",
   :db/ident :fibo-sec-eq-eq/RetractablePreferredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "retractable preferred share",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fbc-fi-fi/hasRedemptionProvision,
      :owl/someValuesFrom :fibo-sec-eq-eq/EquityRedemptionProvision,
      :rdf/type           :owl/Restriction} :fibo-sec-eq-eq/PreferredShare},
   :skos/definition
   "preferred share that gives the owner (shareholder) the right to redeem the stock under specified conditions"})

(def RetractablePreferredShareWithExtendableMaturityDate
  {:db/ident
   :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "retractable preferred share with extendable maturity date",
   :rdfs/subClassOf #{{:owl/onProperty :fibo-fnd-agr-ctr/hasExtensionProvision,
                       :owl/someValuesFrom :fibo-fnd-agr-ctr/ExtensionProvision,
                       :rdf/type :owl/Restriction}
                      :fibo-sec-eq-eq/PreferredShareWithFixedMaturityDate
                      :fibo-sec-eq-eq/RetractablePreferredShare
                      {:owl/hasValue {:xsd/boolean true},
                       :owl/onProperty
                       :fibo-sec-eq-eq/hasExtendableMaturityDate,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "retractable preferred share with a fixed maturity date whose issuer and/or holders have the option to extend the maturity date"})

(def RetractablePreferredShareWithExtendableRedemptionDate
  {:cmns-av/synonym "extendible preferred share",
   :db/ident
   :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "retractable preferred share with extendable redemption date",
   :rdfs/subClassOf
   #{{:owl/onProperty :fibo-fnd-agr-ctr/hasExtensionProvision,
      :owl/someValuesFrom
      :fibo-sec-eq-eq/EquityRedemptionProvisionWithExtendableRedemptionDate,
      :rdf/type :owl/Restriction} :fibo-sec-eq-eq/RetractablePreferredShare},
   :skos/definition
   "retractable preferred share whose redemption date can be modified"})

(def Share
  {:db/ident :fibo-sec-eq-eq/Share,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "share"},
   :rdfs/subClassOf
   #{{:owl/minQualifiedCardinality 0,
      :owl/onDataRange :xsd/string,
      :owl/onProperty  :fibo-sec-eq-eq/hasShareClass,
      :rdf/type        :owl/Restriction}
     {:owl/onProperty     :fibo-sec-eq-eq/confersOwnershipOf,
      :owl/someValuesFrom :fibo-fnd-acc-aeq/ShareholdersEquity,
      :rdf/type           :owl/Restriction} :fibo-fbc-fi-fi/EquityInstrument
     {:owl/minQualifiedCardinality 0,
      :owl/onDataRange :xsd/nonNegativeInteger,
      :owl/onProperty  :fibo-sec-eq-eq/hasSharesOutstanding,
      :rdf/type        :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onDataRange :xsd/string,
      :owl/onProperty  :fibo-sec-eq-eq/hasVotingRestriction,
      :rdf/type        :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onDataRange :xsd/nonNegativeInteger,
      :owl/onProperty  :fibo-sec-eq-eq/hasAvailableShares,
      :rdf/type        :owl/Restriction}
     {:owl/onProperty     :fibo-be-corp-corp/hasSharesAuthorized,
      :owl/someValuesFrom :xsd/nonNegativeInteger,
      :rdf/type           :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onDataRange :xsd/nonNegativeInteger,
      :owl/onProperty  :fibo-sec-eq-eq/hasTreasuryShares,
      :rdf/type        :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onDataRange :xsd/nonNegativeInteger,
      :owl/onProperty  :fibo-sec-eq-eq/hasSharesIssued,
      :rdf/type        :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onDataRange :xsd/nonNegativeInteger,
      :owl/onProperty  :fibo-sec-eq-eq/hasFloatingShares,
      :rdf/type        :owl/Restriction}
     {:owl/onProperty     :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
      :owl/someValuesFrom :xsd/decimal,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-sec-eq-eq/hasSharePaymentStatus,
      :owl/someValuesFrom :fibo-sec-eq-eq/SharePaymentStatus,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "financial instrument that signifies a unit of equity ownership in a corporation, or a unit of ownership in a mutual fund, or interest in a general or limited partnership, or a unit of ownership in a structured product, such as a real estate investment trust"}})

(def ShareIssuer
  {:cmns-av/explanatoryNote
   "This includes shares that represent equity ownership in a corporation, or ownership in a mutual fund, or an interest in a general or limited partnership, or ownership in a structured product, such as a real estate investment trust.",
   :db/ident :fibo-sec-eq-eq/ShareIssuer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "share issuer",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/issues,
                       :owl/someValuesFrom :fibo-sec-eq-eq/Share,
                       :rdf/type           :owl/Restriction}
                      :fibo-fbc-fi-fi/Issuer},
   :skos/definition
   "issuer of securities that represent an ownership interest in something"})

(def SharePaymentStatus
  {:cmns-av/explanatoryNote
   "When a company issues shares upon incorporation or through an initial or secondary issuance, shareholders are required to pay a set amount for those shares. Once the company has received the full amount from shareholders, the shares become fully paid shares.",
   :db/ident :fibo-sec-eq-eq/SharePaymentStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "share payment status",
   :rdfs/subClassOf #{:fibo-fnd-arr-lif/LifecycleStatus
                      {:owl/onProperty     :cmns-cls/classifies,
                       :owl/someValuesFrom :fibo-sec-eq-eq/Share,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "classifier that specifies the overall payment status for shares issued"})

(def ShareYield
  {:cmns-av/synonym #{{:rdf/language "en",
                       :rdf/value    "dividend yield"}
                      {:rdf/language "en",
                       :rdf/value    "dividend-price ratio"}},
   :db/ident :fibo-sec-eq-eq/ShareYield,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "share yield"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-qtu/hasArgument,
      :owl/someValuesFrom {:owl/unionOf [:fibo-sec-eq-eq/OrdinaryDividend
                                         :fibo-fbc-fi-ip/SecurityPrice],
                           :rdf/type    :owl/Class},
      :rdf/type           :owl/Restriction} :fibo-fbc-fi-ip/Yield},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "ratio of the annualized dividend per share divided by the (current) price per share"}})

(def SingleVotingShare
  {:db/ident :fibo-sec-eq-eq/SingleVotingShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "single voting share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/Share
                      {:owl/hasValue {:xsd/long 1},
                       :owl/onProperty
                       :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
                       :rdf/type :owl/Restriction}},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "share that has the right to exactly one vote"}})

(def SoftRetractablePreferredShare
  {:db/ident :fibo-sec-eq-eq/SoftRetractablePreferredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "soft retractable preferred share",
   :rdfs/subClassOf :fibo-sec-eq-eq/RetractablePreferredShare,
   :skos/definition
   "retractable preferred share whose retraction value may be paid in cash or in an equal value of common stock of the issuer, at the option of the issuer"})

(def SpecialDividend
  {:cmns-av/usageNote
   {:rdf/language "en",
    :rdf/value
    "Special dividends may be included in a dividend schedule as an ad-hoc entry, since they still need to be tracked based on the date of issuance."},
   :db/ident :fibo-sec-eq-eq/SpecialDividend,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "special dividend",
   :rdfs/subClassOf :fibo-sec-eq-eq/Dividend,
   :skos/definition
   "dividend that is paid to shareholders on a one-time basis"})

(def UnrestrictedShare
  {:db/ident :fibo-sec-eq-eq/UnrestrictedShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "unrestricted share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/Share :fibo-fbc-fi-fi/NegotiableSecurity},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "share whose ownership/transfer/sale is not subject to special conditions including country-specific restrictions"}})

(def VariableInterestEntityShare
  {:cmns-av/explanatoryNote
   "Unlike a traditional stock certificate, the VIE share provides a legal proprietary interest in a completely separate company's assets, sometimes referred to as a shell company. The contractual right certified by the VIE share is derived from a contract between (1) the company named on the VIE share and (2) the shell company. In other words, VIE shareholders only have a traditional stock certificate in the completely separate shell company, which is entitled to a percentage of the named company's profits via a private contract.",
   :cmns-av/synonym {:rdf/language "en-GB",
                     :rdf/value    "VIE share"},
   :db/ident :fibo-sec-eq-eq/VariableInterestEntityShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "variable interest entity share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/Share
                      {:owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
                       :owl/someValuesFrom
                       {:owl/onProperty :cmns-rlcmp/isPlayedBy,
                        :owl/someValuesFrom
                        :fibo-be-le-lp/VariableInterestEntity,
                        :rdf/type :owl/Restriction},
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "share that certifies ownership of a contractual right to a percentage of a company's profits"})

(def VotingRight
  {:cmns-av/explanatoryNote
   "Voting may involve decisions on issuing securities, initiating stock splits, and making substantial changes in the corporation's operations. Note that a given share may not have voting rights, in which case the number of votes per share would be zero.",
   :db/ident :fibo-sec-eq-eq/VotingRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "voting right",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/isConferredBy,
                       :owl/someValuesFrom :fibo-fnd-agr-ctr/WrittenContract,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-law-lcap/ContractualRight},
   :skos/definition
   "contractual right that specifies shareholder voting entitlements, such as to elect directors, elect outside auditors, and vote on matters of corporate policy"})

(def confersNumberOfVotesPerShare
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A given share may have zero, fractional, one, or more votes per share, depending on the contract."},
   :db/ident :fibo-sec-eq-eq/confersNumberOfVotesPerShare,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "number of votes per share"},
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "grants the right to vote on a per share basis to the shareholder"}})

(def confersOwnershipOf
  {:db/ident :fibo-sec-eq-eq/confersOwnershipOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-agr-ctr/Contract,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "confers ownership of",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/confers,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "grants ownership via contract"}})

(def hasAdjustableDividendRate
  {:db/ident :fibo-sec-eq-eq/hasAdjustableDividendRate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-eq/PreferredDividend,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "has adjustable dividend rate",
   :rdfs/range :fibo-fnd-acc-cur/PercentageMonetaryAmount,
   :rdfs/subPropertyOf :cmns-qtu/hasQuantityValue,
   :skos/definition
   "indicates a variable dividend rate, typically specified in the prospectus as a formula based on a benchmark or set at auction"})

(def hasAvailableShares
  {:db/ident :fibo-sec-eq-eq/hasAvailableShares,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has available shares"},
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the number of shares outstanding less those shares that are restricted, i.e., those that are available for trading"}})

(def hasDistributionMethod
  {:db/ident :fibo-sec-eq-eq/hasDistributionMethod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-eq/Dividend,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "has distribution method",
   :rdfs/range :fibo-sec-eq-eq/DividendDistributionMethod,
   :rdfs/subPropertyOf :fibo-fnd-gao-obj/hasStrategy,
   :skos/definition
   "indicates the method by which dividend payments are to be distributed"})

(def hasDividend
  {:db/ident :fibo-sec-eq-eq/hasDividend,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-eq/Share,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "has dividend",
   :rdfs/range :fibo-sec-eq-eq/Dividend,
   :rdfs/subPropertyOf :cmns-cls/isClassifiedBy,
   :skos/definition
   "relates a share to a dividend that applies to that share, or that the share may pay"})

(def hasDividendDeclarationDate
  {:cmns-av/synonym "has announcement date",
   :db/ident :fibo-sec-eq-eq/hasDividendDeclarationDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-eq/Share,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "has declaration date",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf :cmns-dt/hasExplicitDate,
   :skos/definition
   "indicates a date on which an organization states that a dividend payment may be anticipated, including the the dividend amount and the ex-dividend and payment dates"})

(def hasDividendGracePeriod
  {:db/ident :fibo-sec-eq-eq/hasDividendGracePeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-eq/PreferredDividend,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "has dividend grace period",
   :rdfs/range :cmns-dt/Duration,
   :rdfs/subPropertyOf :cmns-dt/hasDuration,
   :skos/definition
   "indicates a period of time after a dividend payment becomes due, before the issuer is subject to penalties"})

(def hasEarliestRedemptionDate
  {:db/ident :fibo-sec-eq-eq/hasEarliestRedemptionDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-eq/EquityRedemptionProvision,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "has earliest redemption date",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf :cmns-dt/hasExplicitDate,
   :skos/definition
   "indicates a date on or after which a stock can be redeemed"})

(def hasExDividendDate
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.investor.gov/introduction-investing/investing-basics/glossary/ex-dividend-dates-when-are-you-entitled-stock-and"},
   :cmns-av/explanatoryNote
   #{"Once the company sets the record date, the ex-dividend date is set based on stock exchange rules. If you purchase a stock on its ex-dividend date or after, you will not receive the next dividend payment."
     "Shares listed on the New York Stock Exchange go ex-dividend four business days prior to the record date."},
   :cmns-av/synonym #{"has ex-date" "has expected dividend date"},
   :db/ident :fibo-sec-eq-eq/hasExDividendDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-eq/Share,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "has ex-dividend date",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf :cmns-dt/hasExplicitDate,
   :skos/definition
   "indicates a date on which a stock 'goes ex-dividend', typically about three weeks before the dividend is paid to shareholders of record"})

(def hasExtendableMaturityDate
  {:db/ident :fibo-sec-eq-eq/hasExtendableMaturityDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-eq-eq/PreferredShare,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "has extendable maturity date",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether the issuer and/or holders of redeemable shares with a fixed maturity date have the option to extend the maturity date"})

(def hasExtendableRedemptionDate
  {:db/ident :fibo-sec-eq-eq/hasExtendableRedemptionDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-eq-eq/EquityRedemptionProvision,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "has extendable redemption date",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether the issuer and/or holders of redeemable shares with a specified redemption date have the option to extend that date"})

(def hasFixedDividendRate
  {:db/ident :fibo-sec-eq-eq/hasFixedDividendRate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-eq/PreferredDividend,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "has fixed dividend rate",
   :rdfs/range :fibo-fnd-acc-cur/PercentageMonetaryAmount,
   :rdfs/subPropertyOf :cmns-qtu/hasQuantityValue,
   :skos/definition
   "indicates a pre-arranged fixed dividend rate, typically specified in the prospectus, for a preferred share"})

(def hasFloatingShares
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A relatively small float results in higher volatility, as a large purchase or sell order will have significant influence on the value of the stock."},
   :db/ident :fibo-sec-eq-eq/hasFloatingShares,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has floating shares"},
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the number of shares that are available for trading, i.e., the number of shares outstanding less closely held shares (those held by insiders) and restricted shares"}})

(def hasMinimumRedemptionPrice
  {:db/ident :fibo-sec-eq-eq/hasMinimumRedemptionPrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-eq/EquityRedemptionProvision,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "has minimum redemption price",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasPrice,
   :skos/definition
   "indicates the lowest market price above which a share may be redeemed"})

(def hasRecordDate
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.investor.gov/introduction-investing/investing-basics/glossary/ex-dividend-dates-when-are-you-entitled-stock-and"},
   :cmns-av/explanatoryNote
   "Companies also use this date to determine who is sent proxy statements, financial reports, and other information.",
   :cmns-av/synonym "has date of record",
   :db/ident :fibo-sec-eq-eq/hasRecordDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-eq/Share,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "has record date",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf :cmns-dt/hasExplicitDate,
   :skos/definition
   "indicates the date on which the issuer checks to determine whether a party was on the company's books as a shareholder when required (i.e., they must have been on the books prior to the ex-dividend date), to identify who is eligible to receive the next dividend"})

(def hasRedemptionPremium
  {:db/ident :fibo-sec-eq-eq/hasRedemptionPremium,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-eq/EquityRedemptionProvision,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "has redemption premium",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryPrice,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasPrice,
   :skos/definition
   "indicates the premium price per share over the market price, if any, that must be paid in order to redeem the stock"})

(def hasShareClass
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Classes of shares, including shares in a mutual fund, are designated by name or a character (letter), such as A, B, C, etc. In the case of a mutual fund, different classes of shares may incur different fees and expenses."},
   :db/ident :fibo-sec-eq-eq/hasShareClass,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-eq-eq/Share,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has share class"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the class to which the share belongs, typically differentiated by privileges, such as voting rights"}})

(def hasSharePaymentStatus
  {:db/ident :fibo-sec-eq-eq/hasSharePaymentStatus,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-eq/Share,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has share payment status"},
   :rdfs/range :fibo-sec-eq-eq/SharePaymentStatus,
   :rdfs/subPropertyOf :cmns-cls/isClassifiedBy,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "indicates the payment status for shares issued"}})

(def hasSharesIssued
  {:db/ident :fibo-sec-eq-eq/hasSharesIssued,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has shares issued"},
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the actual number of shares held by shareholders (i.e., shares outstanding) and treasury shares"}})

(def hasSharesOutstanding
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The number of outstanding shares is used in calculating key metrics such as a company's market capitalization, as well as its earnings per share (EPS) and cash flow per share (CFPS)."},
   :db/ident :fibo-sec-eq-eq/hasSharesOutstanding,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has shares outstanding"},
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the number of shares currently held by shareholders, including those held by retail investors, institutional investors and insiders, and typically available for trading"}})

(def hasTreasuryShares
  {:db/ident :fibo-sec-eq-eq/hasTreasuryShares,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has treasury shares"},
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the number of shares issued but not outstanding, including those that were available in the market at one time but have been repurchased by the company"}})

(def hasVotingRestriction
  {:cmns-av/explanatoryNote
   "Such restrictions may apply regardless of the number of votes per share.",
   :db/ident :fibo-sec-eq-eq/hasVotingRestriction,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-eq-eq/Share,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has voting restriction"},
   :rdfs/range :xsd/string,
   :skos/definition "specifies restrictions on voting rights, if any"})

(def indicatesNumberOfShares
  {:db/ident :fibo-sec-eq-eq/indicatesNumberOfShares,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-eq-eq/EquityPosition,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "indicates number of shares"},
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "indicates the number of shares associated with the position"}})

(def isRedeemableAtIssuerOption
  {:db/ident :fibo-sec-eq-eq/isRedeemableAtIssuerOption,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-fi-fi/RedemptionProvision,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "is redeemable at issuer option",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether the issuer has the option of initiating the buy-back, similar to a call feature"})

(def isRedeemableAtShareholderOption
  {:db/ident :fibo-sec-eq-eq/isRedeemableAtShareholderOption,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-fi-fi/RedemptionProvision,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "is redeemable at shareholder option",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether the shareholder has the option of initiating the buy-back, similar to a put feature"})

(def isSeniorTo
  {:db/ident :fibo-sec-eq-eq/isSeniorTo,
   :rdf/type #{:owl/TransitiveProperty :owl/ObjectProperty},
   :rdfs/domain :fibo-sec-eq-eq/Share,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "is senior to",
   :rdfs/range :fibo-sec-eq-eq/Share,
   :skos/definition
   "indicates that a given share (share class) has higher seniority than the related share, meaning that it gives the holder a higher claim on the assets of the issuer"})

(def specifiesConversionDate
  {:db/ident :fibo-sec-eq-eq/specifiesConversionDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-eq/EquityConversionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"},
   :rdfs/label "specifies conversion date",
   :rdfs/range :cmns-dt/Date,
   :skos/definition
   "indicates the date on which, or after which, conversion may occur"})

(def urn:uuid:ff18aee1-7299-5194-87bc-1a8fda446973
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2018-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "Core terms are those fundamental to all equity instruments. This ontology also distinguishes between privately held and publicly traded equity instruments, and defines a number of related concepts, such as voting rights.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/SecuritiesIssuance/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/LegalCapacity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/Partnerships/Partnerships/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/InstrumentPricing/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/IND/InterestRates/InterestRates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Agreements/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/ProductsAndServices/PaymentsAndSchedules/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/Corporations/Corporations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/AccountingEquity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/CorporateOwnership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/Lifecycles/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/DatesAndTimes/BusinessDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/DebtAndEquities/Debt/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Equities/EquityInstruments/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Equity Instruments Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to refine the definition of share to include a restriction for hasSharesOutstanding, eliminate duplication of concepts in LCC, and add the concept of an equity issuer."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to revise the definition of dividend to explicitly state that it reflects the announced commitment of a specific dividend rather than a more general policy."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of the ontology was modified to add a link to the formula used to calculate an adjustable rate dividend and loosen some constraints to make the ontology more useful in cases where one could have information about a preferred share, such as having an adjustable rate dividend, but not necessarily having the details (SEC-138)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to clean up deprecated elements, most of which had been in the ontology for awhile."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of the ontology was modified to add a property for the number of available shares, required for MiFID reporting (SEC-97)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to refine the definition of listed share, update definitions to remove leading articles, add missing properties and restrictions, revise the definition of dividend."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of the ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380) and to clean up details related to regular schedules (FBC-317)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to rename ownership related properties for consistent alignment with the ownership situational pattern and to move properties / restrictions that define how many shares have been issued from the issuer to the share."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to reflect the move of hasMaturityDate from FinancialInstruments to Debt in FBC and eliminate named individuals for specifying voting rights, which caused issues for some tools."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to add the notion of a VIE share and integrate dividend distribution method with strategy."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to replace 'publicly-traded share' with 'exchange-specific share', which is the more commonly used designation and corresponds better with the intended semantics of this concept, to merge in concepts that were formerly in a separate ShareTerms ontology, and eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to incorporate additional features required to map the CFI classification scheme to equity instruments, including features specific to preferred shares."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to add concepts covering additional features of preferred shares, move the two exhaustive CFI-specific classes to the Equity CFI individuals ontology, rename EquityIssuer to ShareIssuer to be clearer about the intent, and add the concept of a price per share."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of the ontology was modified to eliminate deprecations that are more than 6 months old and to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to address text formatting hygiene issues."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to incorporate a property allowing representation of the share class, streamline the representation of voting rights and payment form, clean up ambiguous definitions, and eliminate redundant restrictions related to security form."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was revised to deprecate the notion of a securities restriction specific to a limited partnership fund unit, which required import of unnecessary content and would not be used in practice."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments.rdf version of this ontology was modified to clarify a restriction on perpetual preferred share, add extendible preferred share, and add the CFI definition for limited partnership unit."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/"})