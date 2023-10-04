(ns net.wikipunk.rdf.fibo-der-drc-exo
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
     "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
     "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-der-drc-bsc"
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
     "fibo-der-drc-exo"
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/",
     "fibo-der-drc-opt"
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
     "fibo-der-drc-swp"
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/",
     "fibo-fbc-fi-fi"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
     "fibo-fbc-fi-ip"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
     "fibo-fnd-acc-cur"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
     "fibo-fnd-agr-ctr"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
     "fibo-fnd-dt-fd"
     "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
     "fibo-fnd-gao-obj"
     "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
     "fibo-fnd-utl-alx"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "fibo-ind-ind-ind"
     "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/",
     "fibo-sec-dbt-ex"
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/",
     "fibo-sec-sec-bsk"
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Baskets/",
     "fibo-sec-sec-cls"
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "skos" "http://www.w3.org/2004/02/skos/core#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-der-drc-exo",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/DerivativesContracts/ExoticOptions/"}
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology covers exotic options, a category of options contracts that differ from traditional options in their payment structures, expiration dates, and strike prices. The underlying asset or security can vary with exotic options allowing for more investment alternatives. Exotic options are hybrid securities that are often customizable to the needs of the investor, and most are traded over the counter (OTC).",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/Indicators/Indicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/InstrumentPricing/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesClassification/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/DerivativesContracts/Swaps/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Debt/ExerciseConventions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/DerivativesContracts/Options/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/Baskets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/FinancialDates/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/DerivativesContracts/ExoticOptions/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Exotic Options Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/ version of this ontology was modified to rephrase definitions on knock-in and knock-out options."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions.rdf version of this ontology was modified to move the property, 'is conferred on' to the Legal Capacity ontology and to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions.rdf version of this ontology was modified to add a definition for European options, such as LEPOs, to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, and to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"})

(def ArithmeticCalculationStrategy
  {:db/ident :fibo-der-drc-exo/ArithmeticCalculationStrategy,
   :rdf/type #{:fibo-der-drc-exo/AveragingStrategy :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label "arithmetic calculation strategy",
   :rdfs/seeAlso :fibo-fnd-utl-alx/ArithmeticMean,
   :skos/definition "strategy that uses an arithmetic mean calculation"})

(def AsianOption
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019."},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "These options allow the buyer to purchase (or sell) the underlying asset at the average price instead of the spot price. There are various ways to interpret the word 'average,' and that needs to be specified in the options contract. Typically, the average price is a geometric or arithmetic average of the price of the underlying asset at discreet intervals, which are also specified in the options contract. Because of the averaging feature, Asian options reduce the volatility inherent in the option; therefore, Asian options are typically cheaper than European or American options. They are used by traders who are exposed to the underlying asset over some time, such as consumers and suppliers of commodities, etc."},
   :db/ident :fibo-der-drc-exo/AsianOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Asian option"},
   :rdfs/subClassOf
   #{{:owl/onClass    :cmns-dt/ExplicitDate,
      :owl/onProperty :fibo-sec-dbt-ex/hasExerciseDate,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/onClass    :fibo-der-drc-exo/AveragingStrategy,
      :owl/onProperty :cmns-cls/isClassifiedBy,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/onClass    :cmns-dt/DatePeriod,
      :owl/onProperty :fibo-der-drc-exo/hasAsianTailPeriod,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction} :fibo-der-drc-opt/ExoticOption
     {:owl/onClass    :fibo-der-drc-exo/AsianOptionClassifier,
      :owl/onProperty :cmns-cls/isClassifiedBy,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/onClass    :fibo-fnd-acc-cur/Currency,
      :owl/onProperty :fibo-der-drc-exo/usesCurrencyInAveraging,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/onDataRange :xsd/boolean,
      :owl/onProperty  :fibo-der-drc-exo/usesWeightedAverage,
      :owl/qualifiedCardinality 1,
      :rdf/type        :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "option whose exercise terms involve a payoff determined by the average underlying price (either the strike price or the settlement price) of the underlying asset over a predetermined period"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "For an Asian call option using arithmetic averaging and a 30-day period for sampling the data: On Nov. 1, a trader purchased a 90-day arithmetic call option on stock XYZ with an exercise price of $22, where the averaging is based on the value of the stock after each 30-day period. The stock price after 30, 60, and 90 days was $21.00, $22.00, and $24.00. The arithmetic average (mean) is (21.00 + 22.00 + 24.00) / 3 = 22.33. The profit is the average minus the strike price 22.33 - 22 = 0.33 or $33.00 per 100 share contract. As with standard options, if the average price is below the strike price, the loss is limited to the premium paid for the call options."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "The averaging can be either a geometric or arithmetic average."}})

(def AsianOptionClassifier
  {:db/ident :fibo-der-drc-exo/AsianOptionClassifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label "Asian option classifier",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-cls/classifies,
                       :owl/someValuesFrom :fibo-der-drc-exo/AsianOption,
                       :rdf/type           :owl/Restriction}
                      :fibo-sec-sec-cls/FinancialInstrumentClassifier},
   :skos/definition
   "financial instrument classifier that classifies Asian options based on whether they are rate-based or price based"})

(def AverageRate
  {:db/ident :fibo-der-drc-exo/AverageRate,
   :rdf/type #{:fibo-der-drc-exo/AsianOptionClassifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label "average rate classification",
   :skos/definition
   "Asian option classifier indicating that the payoff is based on the difference between a fixed strike price and the calculated average price of the underlying"})

(def AverageStrike
  {:db/ident :fibo-der-drc-exo/AverageStrike,
   :rdf/type #{:fibo-der-drc-exo/AsianOptionClassifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label "average strike classification",
   :skos/definition
   "Asian option classifier indicating that the payoff is based on the difference between the price of the underlying at expiration and a strike price equal to the calculated average price of the underlying issue"})

(def AveragingStrategy
  {:db/ident :fibo-der-drc-exo/AveragingStrategy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "averaging strategy"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-cls/classifies,
                       :owl/someValuesFrom :fibo-der-drc-exo/AsianOption,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-gao-obj/Strategy},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "method used for calculating the average rate or price of an Asian option"}})

(def BarrierOption
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019."},
   :cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "Barrier features include any terms related to exercising the option ahead of the expiry date."}
     {:rdf/language "en",
      :rdf/value
      "A barrier option can be a knock-out, meaning it expires worthless if the underlying exceeds a certain price, limiting profits for the holder and limiting losses for the writer. It can also be a knock-in, meaning it has no value until the underlying reaches a certain price. Barrier options can be puts or calls. Barrier options typically have cheaper premiums than traditional vanilla options, primarily because the barrier increases the chances of the option expiring worthless. A trader may choose the cheaper (relative to a comparable vanilla) barrier option if they feel it is quite likely the underlying will hit the barrier."}},
   :db/ident :fibo-der-drc-exo/BarrierOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "barrier option"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-der-drc-exo/isAboveStrikePrice,
                       :owl/someValuesFrom :xsd/boolean,
                       :rdf/type           :owl/Restriction}
                      :fibo-der-drc-opt/ExoticOption
                      {:owl/onProperty :fibo-der-drc-exo/hasMonitoringPeriod,
                       :owl/someValuesFrom :cmns-dt/DatePeriod,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty :fibo-der-drc-exo/hasMonitoringFrequency,
                       :owl/someValuesFrom :xsd/positiveInteger,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "option whose final exercise depends upon the path taken by the price of an underlying instrument, i.e., whose payoff depends on whether or not the underlying asset has reached or exceeded a predetermined price"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "For a knock-out barrier option, the option is cancelled if the underlying price crosses a predetermined barrier level; for a knock-in barrier option, the option becomes available-for-exercise if the underlying price crosses a predetermined barrier level."}})

(def ChooserOption
  {:cmns-av/adaptedFrom
   #{{:rdf/language "en",
      :rdf/value
      "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019."}
     {:rdf/language "en",
      :rdf/value
      "Commodity Futures Trading Commission (CFTC) glossary, https://www.cftc.gov/LearnAndProtect/EducationCenter/CFTCGlossary/glossary_c.html"}},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A chooser option is an option contract that allows the holder to decide whether it is a call or put prior to the expiration date. Chooser options usually have the same strike price and expiration date regardless of what decision the holder makes. Because the option could benefit from upside or downside movement, chooser options provide investors a great deal of flexibility and thus may cost more than comparable vanilla options. Chooser options are typically European style, and have one strike price and one expiration date regardless of whether the option is exercised as a call or put."},
   :db/ident :fibo-der-drc-exo/ChooserOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "chooser option"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom {:owl/unionOf [:fibo-der-drc-opt/CallOption
                                         :fibo-der-drc-opt/PutOption],
                           :rdf/type    :owl/Class},
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-der-drc-exo/hasOptionTypeElectionDate,
      :owl/someValuesFrom :cmns-dt/ExplicitDate,
      :rdf/type           :owl/Restriction} :fibo-der-drc-opt/ExoticOption},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "exotic option that allows its holder (buyer) to exercise the right to buy (call) or sell (put) specified assets at a fixed price whereby the buyer does not have to decide whether the contract will be a put or a call until an agreed future date, prior to expiration"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "For example, assume a trader wants to have an option position for the updated XYZ Inc. earnings release. They think the stock will have a big move, but they are not sure in which direction. The earnings release is in one month, so the trader decides to buy a chooser option that will expire about three weeks after the earnings release. They believe this should provide enough time for the stock to make a significant move if it is going to make one, and fully digest the earnings release. Therefore, the option they choose will expire in seven to eight weeks. The chooser option allows them to exercise the option as a call if the price of XYZ rises, or as a put if the price falls. At the time of the chooser option purchase, XYZ is trading at $28. The trader chooses an at-the-money strike price of $28 and pays a premium of $2 or $200 for one contract ($2 x 100 shares). The buyer can't exercise the option prior to expiry since it is a European option. At expiry, the trader will determine if they will exercise the option as a call or put. Assume the price of XYZ at the time of expiry is $31. This is higher than the strike price of $28, therefore the trader will exercise the option as a call. Their profit is $1 ($31 - $28 - $2) or $100. If XYZ is trading between $28 and $29.99 the trader will still choose to exercise the option as a call, but they will still be losing money since the profit is not enough to offset their $2 cost. $30 is the breakeven point on the call. If the price of BAC is below $28, the trader will exercise the option as a put. In this case, $26 is the breakeven point ($28 - $2). If the underlying is trading between $28 and $26.01 the trader will lose money since the price didn't fall enough to offset the cost of the option. If the price of BAC falls below $26, say to $24, the trader will make money on the put. Their profit is $2 ($28 - $24 - $2) or $200."}})

(def CliquetOption
  {:cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "A cliquet is a cash-settled, exotic option that settles at predetermined dates and then resets its strike price based on the price of the underlying security at the time of settlement. Each new option within the cliquet enters into force when the previous option expires. The total premium and the exact reset dates are known at the time of transacting a cliquet. Investors can opt to receive their payout when each option expires or wait until the entire series plays out."}
     {:rdf/language "en",
      :rdf/value
      "A cliquet is a series of forward start options, all related to each other. Each forward start option represents the advance purchase of a put, or call, option with an at-the-money (ATM) strike price to be determined at a later date, typically when the option becomes active. A forward start option becomes active at a specified date in the future. The premium is paid in advance, while the time to expiration and the underlying security are established at the time the forward start option is purchased. If at the first settlement date the underlying security trades below the strike price of the option (for a call), then it expires worthless and resets to the price of the underlying security at the time of settlement. If at the end of the next settlement the underlying security trades above the new strike, the holder may elect to receive the difference between the market price of the underlying security and the strike price. Alternatively, the holder can let it ride to receive the sum of all payouts at maturity. The main advantage of initiating a cliquet is, if an investor expects volatility to rise, they can lock in their profits at predetermined levels and thus maximize their overall portfolio return."}},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "rachet option"},
   :db/ident :fibo-der-drc-exo/CliquetOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cliquet option"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-col/comprises,
                       :owl/someValuesFrom :fibo-der-drc-exo/ForwardStartOption,
                       :rdf/type           :owl/Restriction}
                      :fibo-der-drc-opt/ExoticOption},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "exotic option that is a series of at-the-money (ATM) options, either puts or calls, where each successive option becomes active when the previous one expires"}})

(def CommodoreOption
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Sometimes the digital barrier increases with the number of years since the trade began. All of the options are active from the start of the trade."},
   :db/ident :fibo-der-drc-exo/CommodoreOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "commodore option"},
   :rdfs/subClassOf #{:fibo-der-drc-opt/ExoticOption
                      {:owl/onProperty     :cmns-col/comprises,
                       :owl/someValuesFrom :fibo-der-drc-exo/DigitalOption,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "exotic option consisting of a number of digital barrier options that pay a coupon if a pre-determined level of the underlying or basket of underlyings is reached"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "A three-year commodore option with annual barriers would have three potential payoffs. The first would pay at the end of the first year and would be dependent on the pre-determined barrier being reached or exceeded. For example, if the underlying or basket of underlyings reached or exceeded 102% of its initial level at the end of year one, a coupon of 6% would be paid. At the end of year two, if the underlying reached or exceeded 104% of its initial level, another 6% coupon would be paid. The coupon in the final year would be 6% if the underlying reached or exceeded 106%. The coupon should exceed the performance level of the underlying, otherwise the investor would achieve the same result by investing directly in the underlying."}})

(def CompoundOption
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Therefore, there are two strike prices and two exercise dates. They are available for any combination of calls and puts. For example, a put where the underlying is a call option or a call where the underlying is a put option. The underlying is the second option, while the initial option is called the overlying. If the compound option is exercised, there are two premiums."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "split-fee options"},
   :db/ident :fibo-der-drc-exo/CompoundOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "compound option"},
   :rdfs/subClassOf #{:fibo-der-drc-opt/ExoticOption
                      {:owl/onProperty     :cmns-col/comprises,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/Option,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "exotic option for which the underlying asset is another option"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "For example, assume an investor wants to buy a put to sell 100 shares of stock at $50. The stock is currently trading at $55. The investor could buy a Call-Put, which allows them to buy a call now, for say $1 per share ($100), which will allow them to buy a put with a $50 strike in the future. They pay the $1 per share now, but only need to pay the fee for the second option if they exercise the first resulting in them receiving the second option."}})

(def DigitalOption
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019."},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "There is an upfront fee called the premium for digital options, which is the maximum loss for the option. Unlike traditional options, digital options don't convert or exercise to the underlying asset's shares. Instead, they pay out a fixed reward if the asset's price is above or below the option's strike price."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "binary option"},
   :db/ident :fibo-der-drc-exo/DigitalOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "digital option"},
   :rdfs/subClassOf :fibo-der-drc-exo/BarrierOption,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "exotic option that has a pre-determined payout if the option is in-the-money and the payoff condition is satisfied"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "For example, let's say the ABC Index is trading at a level of 2,795 on June 2. An investor believes the ABC Index will trade above 2,800 before the end of the trading day, June 4th. The trader purchases 10 ABC Index options at a strike price of 2,800 options for $40 per contract. If the ABC Index closes above 2,800 at the end of the trading day on June 4, the investor is paid $100 per contract, which is a profit of $60 per contract or $600 (($100 - $40) x 10 contracts). However, if the ABC Index closes below 2,800 on June 4. The investor loses all of the premium amount or $400 ($40 x 10 contracts)."}})

(def DoubleBarrierOption
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Considered an exotic option, a double barrier option is a combination of two single barrier options, with one barrier above and one barrier below the current price of the underlying. It is a bet by the holder that the underlying asset will move significantly, in the case of a knock-in barrier option, or will move by a very small amount, in the case of a knock-out barrier option, over the life of the contract. Traders use these options when they have an opinion on volatility but not on the direction of the underlying asset's next price move. A barrier option is a type of option where the payoff, and the very existence of the option, depends on whether or not the underlying asset reaches a predetermined price."},
   :db/ident :fibo-der-drc-exo/DoubleBarrierOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "double barrier option"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-der-drc-exo/hasSecondBarrierPrice,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryPrice,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty :fibo-der-drc-exo/hasFirstBarrierPrice,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryPrice,
                       :rdf/type :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass :fibo-fnd-acc-cur/PercentageMonetaryAmount,
                       :owl/onProperty :fibo-der-drc-exo/hasFirstRebateAmount,
                       :rdf/type :owl/Restriction}
                      :fibo-der-drc-exo/BarrierOption
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass :fibo-fnd-acc-cur/PercentageMonetaryAmount,
                       :owl/onProperty :fibo-der-drc-exo/hasSecondRebateAmount,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "barrier option applied to currencies or over the counter stocks that works as a binary, or digital option in that it pays out only under defined circumstances, or it is worthless, at expiration"}})

(def FixedLookbackStrikeExpression
  {:db/ident :fibo-der-drc-exo/FixedLookbackStrikeExpression,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fixed lookback strike expression"},
   :rdfs/subClassOf #{:fibo-der-drc-bsc/CashflowExpression
                      {:owl/onProperty     :fibo-fnd-utl-alx/hasSubtrahend,
                       :owl/someValuesFrom :fibo-der-drc-exo/ObservedBestValue,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-utl-alx/hasMinuend,
                       :owl/someValuesFrom :fibo-der-drc-opt/StrikePrice,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "cashflow expression specifying the arguments required to calculate the fixed price at which the lookback option is to be exercised"}})

(def FloatingLookbackStrikeExpression
  {:db/ident :fibo-der-drc-exo/FloatingLookbackStrikeExpression,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "floating lookback strike expression"},
   :rdfs/subClassOf #{:fibo-der-drc-bsc/CashflowExpression
                      {:owl/onProperty :fibo-fnd-utl-alx/hasMinuend,
                       :owl/someValuesFrom
                       :fibo-der-drc-exo/ProjectedValueAtMaturity,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-utl-alx/hasSubtrahend,
                       :owl/someValuesFrom :fibo-der-drc-exo/ObservedBestValue,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "cashflow expression specifying the arguments required to calculate the best projected price at which the lookback option may be exercised"}})

(def ForwardStartOption
  {:cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "The only unknown for the contract is the strike price. In terms of pricing the contract, the future price of the underlying asset is also unknown. The contract typically stipulates some parameters for where the strike price will be in relation to the underlying asset's price."}
     {:rdf/language "en",
      :rdf/value
      "Forward start options typically attempt to keep future strike prices at the money or near the money. In this way, the holder will have the right, but not the obligation, to buy (call) or sell (put) the underlying asset in the future at or near the then-current market price. Knowing where the strike price will be in relation to the underlying's price makes it easier to come up with the premium (cost) of the option, which is also typically determined and paid at the initiation of the contract prior to the activation date. If, at the expiration date, the underlying trades below the strike price of the option (for a call), then it expires worthless. If the underlying is above the strike (for a call), then the holder exercises it and owns the underlying at the strike price. For a put option, if the underlying is below the strike price, the option has value and will be sold or exercised to realize a gain. If the underlying is above the strike price, the option will expire worthless. Typically, as with most options, the holder may sell the option if it is in the money and take the cash instead of exercising the option. Since it is an exotic option, the seller and buyer of the option may also agree to settle the option with cash instead of delivering the underlying. Once a forward start option becomes active (strike price is set), then the option is valued like a vanilla option."}},
   :db/ident :fibo-der-drc-exo/ForwardStartOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "forward start option"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom {:owl/unionOf [:fibo-der-drc-opt/CallOption
                                         :fibo-der-drc-opt/PutOption],
                           :rdf/type    :owl/Class},
      :rdf/type           :owl/Restriction} :fibo-der-drc-opt/ExoticOption},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "exotic option that is fully specified with respect to a set expiry date, underlying asset and other parameters, purchased and paid for on initiation, but that becomes active at a set activation date with a strike price determined at the time of activation"},
   :skos/example
   #{{:rdf/language "en",
      :rdf/value
      "For example, the people buying/selling the option could specify that the strike will be at the money (ATM) at activation, or 3% or 5% in the money or out of the money (OTM). Since it is a customized contract, they can negotiate any terms they want."}
     {:rdf/language "en",
      :rdf/value
      "For example, assume that two parties agree to enter into a call forward start option on XYZ stock. It is September and they agree that the forward start option will activate on January 1 at the money. That means on January 1 the strike price for the option will be the price that stock is trading at on that day. The option will expire in June. The exact strike price is unknown, but the parties do know the strike and underlying's price will be the same at activation. They can look at current six-month options (January to June) and assess volatility to determine a premium for the option. They agree to trade one contract, equivalent to 100 shares of the underlying stock. They decide on a premium of $40, or $4,000 for the contract ($40 x 100 shares). The call buyer agrees to pay the $4,000 now (September), even though the option doesn't activate till January. On January 1, assume the stock price is $400. The strike is set at $400, and an option is now a vanilla option with a June expiry. At the June expiry, assume XYZ is trading at $420. In this case, the option is worth $20 ($420 - $400 strike). If they settle in cash, the buyer receives $2,000, or if they exercise, they receive 100 shares at $400 and can keep them, or sell them at $420 to make $2,000. Notice that this still results in a loss for the buyer, since they paid $4,000 but are only receiving back $2,000. To make money on the call, the price of the underlying needs to move above the strike price plus the premium. Therefore, if the price moves up to $450 by expiration, the option is worth $50 ($450 - $400 strike), and the buyer receives $5,000. That's a net profit of $1,000 over their $4,000 cost. If the underlying is trading below the $400 strike at expiry, the call option expires worthless and the buyer's premium is lost ($4,000 profit to the seller)."}}})

(def GeometricCalculationStrategy
  {:db/ident :fibo-der-drc-exo/GeometricCalculationStrategy,
   :rdf/type #{:fibo-der-drc-exo/AveragingStrategy :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label "geometric calculation strategy",
   :rdfs/seeAlso :fibo-fnd-utl-alx/GeometricMean,
   :skos/definition "strategy that uses an geometric mean calculation"})

(def InterestRateCapOption
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The interest in each period is effectively capped by the strike rate. That is, the rate of interest may not go above the strike rate because the holder is expected to exercise the option to take the strike as the rate of interest instead."},
   :db/ident :fibo-der-drc-exo/InterestRateCapOption,
   :owl/disjointWith :fibo-der-drc-exo/InterestRateFloorOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "interest rate cap option"},
   :rdfs/subClassOf :fibo-der-drc-opt/InterestRateOption,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "interest rate derivative in which the buyer receives payments at the end of each period in which the interest rate exceeds the agreed strike price"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "An example of a cap would be an agreement to receive a payment for each month the LIBOR rate exceeds 2.5%."}})

(def InterestRateFloorOption
  {:db/ident :fibo-der-drc-exo/InterestRateFloorOption,
   :owl/disjointWith :fibo-der-drc-exo/InterestRateCapOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "interest rate floor option"},
   :rdfs/subClassOf :fibo-der-drc-opt/InterestRateOption,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "interest rate derivative in which the buyer receives payments at the end of each period in which the interest rate is below the agreed strike price"}})

(def KnockInOption
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "If the price is never reached, it is as if the contract never existed. However, if the underlying asset reaches a specified barrier, the knock-in option comes into existence. The difference between a knock-in and knock-out option is that a knock-in option comes into existence only when the underlying security reaches a barrier, while a knock-out option ceases to exist when the underlying security reaches a barrier."},
   :db/ident :fibo-der-drc-exo/KnockInOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "knock-in option"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-der-drc-exo/hasFirstBarrierPrice,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryPrice,
                       :rdf/type :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass :fibo-fnd-acc-cur/PercentageMonetaryAmount,
                       :owl/onProperty :fibo-der-drc-exo/hasFirstRebateAmount,
                       :rdf/type :owl/Restriction}
                      :fibo-der-drc-exo/BarrierOption},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "barrier option that is not triggered until a certain price threshold is met"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Assume an investor purchases a knock-in put option with a down Direction, with a barrier price of $90 and a strike price of $100. The underlying security is trading at $110, and the option expires in three months. If the price of the underlying security reaches $90, the option comes into existence and becomes a vanilla option with a strike price of $100. Thereafter, the holder of the option has the right to sell the underlying asset at the strike price of $100, even though it is trading below $90. It is this right that gives the option value. The put option remains active until the expiration date, even if the underlying security rebounds back above $90. However, if the underlying asset does not fall below the barrier price during the life of the contract, the down-and-in option expires worthless. Just because the barrier is reached does not assure a profit on the trade since the underlying would need to stay below $100 (after triggering the barrier) in order for the option to have value."}})

(def KnockOutOption
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A knock-out option sets a cap on the level an option can reach in the holder's favor. As knock-out options limit the profit potential for the option buyer, they can be purchased for a smaller premium than an equivalent option without a knock-out stipulation."},
   :db/ident :fibo-der-drc-exo/KnockOutOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "knock-out option"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-der-drc-exo/hasFirstBarrierPrice,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryPrice,
                       :rdf/type :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass :fibo-fnd-acc-cur/PercentageMonetaryAmount,
                       :owl/onProperty :fibo-der-drc-exo/hasFirstRebateAmount,
                       :rdf/type :owl/Restriction}
                      :fibo-der-drc-exo/BarrierOption},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "barrier option with a built-in mechanism to expire as worthless if a specified price level in the underlying asset is reached"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Assume an investor purchases a Knock-Out call option with a down Direction, also called a 'Down and Out Option', on a stock that is trading at $60 with a strike price of $55 and a barrier of $50. Assume the stock trades below $50, at any time, before the call option expires. Therefore, the down-and-out call option promptly ceases to exist."}})

(def LookbackOption
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019."},
   :cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "Lookback options are cash settled options, which means the holder receives a cash settlement at execution based on the most advantageous differential between high and low prices during the purchase period. Sellers of lookback options would price the option at or near the widest expected distance of price differential based on past volatility and demand for the options. The cost to purchase this option would be taken up front. The settlement will equate to the profits they could have made from buying or selling the underlying asset. If the settlement was greater than the initial cost of the option, then the option buyer would have profit at settlement, otherwise loss."}
     {:rdf/language "en",
      :rdf/value
      "As a type of exotic option, the lookback allows the user to 'look back,' or review, the prices of an underlying asset over the lifespan of the option after it has been purchased. The holder may then exercise the option based on the most beneficial price of the underlying asset. The holder can take advantage of the widest differential between the strike price and the price of the underlying asset. Lookback options do not trade on major exchanges. Instead, they are unlisted and trade over-the-counter (OTC). This type of option reduces uncertainties associated with the timing of market entry and reduces the chances the option will expire worthlessly. Lookback options are expensive to execute, so these advantages come at a cost."}},
   :db/ident :fibo-der-drc-exo/LookbackOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "lookback option"},
   :rdfs/subClassOf #{:fibo-der-drc-opt/ExoticOption
                      {:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                       :owl/someValuesFrom
                       :fibo-der-drc-exo/LookbackStrikeTerms,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "exotic option that minimizes the uncertainties related to the timing of market entry, providing the holder the advantage of knowing history when determining when to exercise their option"}})

(def LookbackStrikeTerms
  {:cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "In the case of a fixed strike, the terms depend on whether the option is a call or put. If it is a call, the calculated payout reflects the difference between a running maximum value of the observable during the lookback period, and the pre-agreed strike."}
     {:rdf/language "en",
      :rdf/value
      "The payoff may either be the difference between a fixed, pre-agreed Strike Price and the observable, or the difference between the best or worst valuable of the observable and the value of that same observable at maturity of the contract (these are the Fixed and Floating lookback terms respectively). This (per review at Nordea) is not mutually exclusive with the terms for Fixed Strike and Resettable Strike, that is, either of those kinds of strike terms may apply, and Lookback strike terms may also apply."}},
   :db/ident :fibo-der-drc-exo/LookbackStrikeTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "lookback strike terms"},
   :rdfs/subClassOf
   #{{:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-der-drc-exo/FloatingLookbackStrikeExpression,
      :owl/onProperty :fibo-fnd-utl-alx/hasExpression,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :fibo-der-drc-exo/hasLookbackPeriod,
      :owl/someValuesFrom :cmns-dt/DatePeriod,
      :rdf/type           :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-der-drc-exo/FixedLookbackStrikeExpression,
      :owl/onProperty :fibo-fnd-utl-alx/hasExpression,
      :rdf/type       :owl/Restriction} :fibo-der-drc-bsc/DerivativeTerms
     {:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
      :owl/someValuesFrom :fibo-ind-ind-ind/PriceStructure,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "terms specifying the value of the underlying asset based on analysis during a specific period, typically ending in the maturity of the option, whereby the payoff is determined by comparing the strike price with the value of the selected price"}})

(def LowExercisePriceOption
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "LEPO"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "LEPOs function as deep-in-the-money options similar to the stock itself. Both buyer and seller of a LEPO operate on margin. LEPO options are not available on any U.S. exchanges. Since the strike price is so close to zero, the investor purchasing the LEPO gains most of the features of owning the share directly with the major exceptions of dividends and voting rights. They are only available with European style expirations."},
   :db/ident :fibo-der-drc-exo/LowExercisePriceOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "low exercise price option"},
   :rdfs/subClassOf
   #{{:owl/hasValue   :fibo-sec-dbt-ex/EuropeanExerciseConvention,
      :owl/onProperty :fibo-der-drc-opt/hasExerciseStyle,
      :rdf/type       :owl/Restriction} :fibo-der-drc-opt/ExoticOption
     :fibo-der-drc-opt/CallOption},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "exotic option that is a European-style call option with an exercise price of one cent that mimics a futures contract"}})

(def MountainRangeOption
  {:cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "These options blend some of the key characteristics of basket-style or rainbow options—both of which have more than one underlying security or asset—and range options with multiyear time ranges. Prices are based on multiple variables - notably the correlations between the individual securities in the basket."}
     {:rdf/language "en",
      :rdf/value
      "The price of a mountain range option is based on multiple variables, the most important of which are the correlations between the individual securities in the basket. Some options have discrete payout levels, such as double the investment or triple the investment, if certain performance metrics are hit by the underlying securities while the option is in effect. Mountain range options cannot be priced with standard closed-form approaches. These exotic instruments instead require Monte Carlo simulation methods. Effects such as volatility skew, which is found in most options, can be even more pronounced within mountain range options."}},
   :db/ident :fibo-der-drc-exo/MountainRangeOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mountain range option"},
   :rdfs/subClassOf #{:fibo-der-drc-opt/ExoticOption
                      {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                       :owl/someValuesFrom :fibo-sec-sec-bsk/MixedBasket,
                       :rdf/type           :owl/Restriction}},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "exotic option based on multiple underlying securities"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Mountain range options are named after a series of mountains, each representing a different type of contract. Some of the most common include: (a) Altiplano options: Altiplano options provide investors with the features of both a traditional vanilla option along with a coupon payment, (b) Annapurna options: coupon rates are determined by the performance of the basket's worst-performing security when it drops under a specified range, (c) Everest options: Everest options place a long-term limit on an investor's option while offering a payout based on the lagging performers in the basket, (d) Atlas options: this type of option eliminates both the best - and worst - performing stocks in a basket of securities, and (e) Himalayan options: traders receive a payout based on the basket's best performing stock; payouts are provided on multiple dates."}})

(def ObservedBestValue
  {:db/ident :fibo-der-drc-exo/ObservedBestValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "observed best value"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-dt-fd/hasAsOfDate,
                       :owl/someValuesFrom :cmns-dt/Date,
                       :rdf/type           :owl/Restriction}
                      :fibo-fbc-fi-ip/MarketPrice},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "observed value of the underlying asset as of some date during the lookback period that is considered the best value from the perspective of the option holder during the lookback period (depending on whether the option is a call or put)"}})

(def ProjectedValueAtMaturity
  {:db/ident :fibo-der-drc-exo/ProjectedValueAtMaturity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "projected value at maturity"},
   :rdfs/subClassOf #{:fibo-fnd-acc-cur/CalculatedPrice
                      {:owl/onProperty     :cmns-dt/hasObservedDateTime,
                       :owl/someValuesFrom :cmns-dt/CombinedDateTime,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "expected value of the underlying asset at maturity calculated as of some date during the lookback period"}})

(def RainbowOption
  {:cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "Rainbbow options can speculate on the best performer in the group or minimum performances of all the underlying assets at one time. Each underlying may be called a color so the sum of all of these factors makes up a rainbow. These structures can be rather exotic and made for institutional clients when referring to financial assets. Rainbow options can be structured in many ways depending on how the performances of each underlying asset are considered. Some pay off based on the best or worst performance among the underlying assets. In other words, it looks at the top or bottom performance and pays off based on that single asset. These are sometimes called 'best of' or 'worst of' rainbow options."}
     {:rdf/language "en",
      :rdf/value
      "Rainbow options are usually calls or puts on the best or worst of n underlying assets. Like a basket option, which is written on a group of assets and pays out on a weighted-average gain on the basket as a whole, a rainbow option also considers a group of assets, but usually pays out on the level of one of them. A simple example is a call rainbow option written on FTSE 100, Nikkei and S&P 500 which will pay out the difference between the strike price and the level of the index that has risen by the largest amount of the three."}},
   :db/ident :fibo-der-drc-exo/RainbowOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "rainbow option"},
   :rdfs/subClassOf #{:fibo-der-drc-opt/ExoticOption
                      {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                       :owl/someValuesFrom :fibo-sec-sec-bsk/MixedBasket,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "exotic option linked to the performances of two or more underlying assets"},
   :skos/example
   #{{:rdf/language "en",
      :rdf/value
      "Better of n Assets This type of rainbow is similar to the best of n assets plus cash but with the exception that there is no possible cash payoff, and X is set to 0. With this in mind, a better of 2 assets rainbow is essentially a two-asset call option, with a payoff being: Rainbow = max[0, max(S1, S2)] Worse of n Assets Essentially the opposite to the better of n assets, with the payoff being on the asset with the lower value. We can give the payoff for this option on 2 assets as: Rainbow = max[0, min(S1, S2)]"}
     {:rdf/language "en",
      :rdf/value
      "An asset maximum or minimum payout rainbow is similar to the best of n assets plus cash, with the exception that no cash payoff is possible and there is a strike price for this type of option. The payoff of a call and put are given as: Rainbow-Call = max[0, max(S1, S2) - X] Rainbow-Put = max[0, X - max(S1, S2)] Minimum of n Assets. The counterpart to a maximum of n assets, this rainbow pays out the value of the underperformer of the n assets. The payoff for minimum of 2 asset rainbow calls and puts are given as: Rainbow-Call = max[0, mainS1, S2) - X] Rainbow-Put = max[0, X - min(S1, S2)]"}
     {:rdf/language "en",
      :rdf/value
      "A best of assets plus cash rainbow effectively has n + 1 payoff possibilities. If we consider a 2 asset \"best of plus cash\", the payoff at expiry is a choice between Asset 1, Asset 2, or the predetermined cash amount. There is no strike price and the payoff is given as: Rainbow = max(S1, S2, Cash;T)"}}})

(def Swaption
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A swaption, also known as a swap option, refers to an option to enter into an interest rate swap or some other type of swap. In exchange for an options premium, the buyer gains the right but not the obligation to enter into a specified swap agreement with the issuer on a specified future date."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "swap option"},
   :db/ident :fibo-der-drc-exo/Swaption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "swaption"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                       :owl/someValuesFrom :fibo-der-drc-swp/Swap,
                       :rdf/type           :owl/Restriction}
                      :fibo-der-drc-opt/ExoticOption},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "over-the-counter option that confers the right but not the obligation, to enter into a swap transaction at some time in the future"}})

(def hasAsianTailPeriod
  {:db/ident :fibo-der-drc-exo/hasAsianTailPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-exo/AsianOption,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has Asian tail period"},
   :rdfs/range :cmns-dt/DatePeriod,
   :rdfs/subPropertyOf :cmns-dt/hasDatePeriod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "window of time during which averaging of the price of the underlying contract is effective"}})

(def hasFirstBarrierPrice
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "For a double barrier option, this is the level of the first barrier. Otherwise it is the only barrier price."},
   :db/ident :fibo-der-drc-exo/hasFirstBarrierPrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has first barrier price"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryPrice,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasPrice,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "has price (or level) that activates or deactivates the option"}})

(def hasFirstRebateAmount
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Both knock-out and knock-in barrier options can contain a provision to provide rebates to holders, if the option does not reach the barrier price and becomes worthless."},
   :db/ident :fibo-der-drc-exo/hasFirstRebateAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has first rebate amount"},
   :rdfs/range :fibo-fnd-acc-cur/PercentageMonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasPrice,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the percentage of the premium paid by the holder for the option"}})

(def hasLookbackPeriod
  {:db/ident :fibo-der-drc-exo/hasLookbackPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-exo/LookbackStrikeTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has lookback period"},
   :rdfs/range :cmns-dt/DatePeriod,
   :rdfs/subPropertyOf :cmns-dt/hasDatePeriod,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "window of time during which the lookback is effective"}})

(def hasMonitoringFrequency
  {:db/ident :fibo-der-drc-exo/hasMonitoringFrequency,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-exo/BarrierOption,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has monitoring frequency"},
   :rdfs/range :xsd/positiveInteger,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "has frequency with respect to how often, in days, the asset price is checked to see if the barrier has been breached"}})

(def hasMonitoringPeriod
  {:db/ident :fibo-der-drc-exo/hasMonitoringPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-exo/BarrierOption,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has monitoring period"},
   :rdfs/range :cmns-dt/DatePeriod,
   :rdfs/subPropertyOf :cmns-dt/hasDatePeriod,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "window of time during which pricing is monitored"}})

(def hasOptionTypeElectionDate
  {:db/ident :fibo-der-drc-exo/hasOptionTypeElectionDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-exo/ChooserOption,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has option type election date"},
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf :cmns-dt/hasExplicitDate,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the date on which the holder of the chooser option contract determines a choice of either a call or a put"}})

(def hasSecondBarrierPrice
  {:db/ident :fibo-der-drc-exo/hasSecondBarrierPrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has second barrier price"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryPrice,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasPrice,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "has price (or level) that the second barrier activates or deactivates in the case of a double barrier option"}})

(def hasSecondRebateAmount
  {:db/ident :fibo-der-drc-exo/hasSecondRebateAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has second rebate amount"},
   :rdfs/range :fibo-fnd-acc-cur/PercentageMonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasPrice,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the percentage of the premium paid by the holder in the case of a double barrier option"}})

(def isAboveStrikePrice
  {:db/ident :fibo-der-drc-exo/isAboveStrikePrice,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-exo/BarrierOption,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is above strike price"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates whether the barrier is crossed when the price of the underlier is above (or below, if not) the strike price (threshold)"}})

(def usesCurrencyInAveraging
  {:db/ident :fibo-der-drc-exo/usesCurrencyInAveraging,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "uses currency in averaging"},
   :rdfs/range :fibo-fnd-acc-cur/Currency,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasCurrency,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "indicates the currency used in averaging calculation"}})

(def usesWeightedAverage
  {:db/ident :fibo-der-drc-exo/usesWeightedAverage,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-der-drc-exo/AsianOption,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "uses weighted average"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates whether a weighted average is being used to calculate the average rate or strike price"}})

(def urn:uuid:7cdadba2-e751-53c5-8595-49c12a44d7bb
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology covers exotic options, a category of options contracts that differ from traditional options in their payment structures, expiration dates, and strike prices. The underlying asset or security can vary with exotic options allowing for more investment alternatives. Exotic options are hybrid securities that are often customizable to the needs of the investor, and most are traded over the counter (OTC).",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/Indicators/Indicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/InstrumentPricing/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesClassification/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/DerivativesContracts/Swaps/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Debt/ExerciseConventions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/DerivativesContracts/Options/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/Baskets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/FinancialDates/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/DER/DerivativesContracts/ExoticOptions/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Exotic Options Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/ version of this ontology was modified to rephrase definitions on knock-in and knock-out options."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions.rdf version of this ontology was modified to move the property, 'is conferred on' to the Legal Capacity ontology and to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions.rdf version of this ontology was modified to add a definition for European options, such as LEPOs, to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, and to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/"})