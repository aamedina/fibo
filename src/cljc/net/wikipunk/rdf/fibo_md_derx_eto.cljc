(ns net.wikipunk.rdf.fibo-md-derx-eto
  "Exchange traded options date and time dependent terms such as pricing and other analytics, including greeks (deltas, thetas etc.)"
  {:cmns-av/copyright "Copyright (c) 2015-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/",
   :dcterms/abstract
   "Exchange traded options date and time dependent terms such as pricing and other analytics, including greeks (deltas, thetas etc.)",
   :dcterms/license {:rdfa/uri "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/Publishers/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/Options/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/Indicators/Indicators/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/InstrumentPricing/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/DerivativesBasics/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/Markets/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/DerivativesTemporal/ETOptionsTemporal/"},
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-fct-pub"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
    "fibo-der-drc-bsc"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
    "fibo-fbc-fct-mkt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
    "fibo-fbc-fi-ip"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-md-derx-eto"
    "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-md-derx-eto",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/",
   :rdfs/label #xsd/langString "Exchange-Traded Options Temporal@en"})

(def Delta
  "First derivative of option value with respect to theoretical price is a delta (or on a position). Theoretical price"
  {:cmns-av/explanatoryNote
   #xsd/langString
    "Delta tells you what options to buy to get the equivalent price sensitivity to the underlying. How many at that price to get that hedge. So for example an at the money option has a delta of 50. Units@en",
   :db/ident :fibo-md-derx-eto/Delta,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/"},
   :rdfs/label #xsd/langString "delta@en",
   :rdfs/subClassOf [:fibo-md-derx-eto/OptionsGreek
                     :fibo-fbc-fi-ip/PriceAnalytic],
   :skos/definition
   #xsd/langString
    "First derivative of option value with respect to theoretical price is a delta (or on a position). Theoretical price@en"})

(def OptionDailySettlementPrice
  "The official price at the end of a trading session. This price is established by The Options Clearing Corporation and is used to determine changes in account equity, margin requirements, and for other purposes."
  {:db/ident :fibo-md-derx-eto/OptionDailySettlementPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/"},
   :rdfs/label #xsd/langString "option daily settlement price@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-be-fct-pub/hasPublisher,
                      :owl/someValuesFrom
                      {:owl/unionOf
                       [:fibo-fbc-fct-mkt/DesignatedContractMarket
                        :fibo-der-drc-bsc/DerivativesClearingOrganization],
                       :rdf/type :owl/Class},
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fi-ip/SecurityPrice
                     :fibo-fbc-fi-ip/ClosingPrice],
   :skos/definition
   #xsd/langString
    "The official price at the end of a trading session. This price is established by The Options Clearing Corporation and is used to determine changes in account equity, margin requirements, and for other purposes.@en"})

(def OptionTheoreticalValue
  "fair value of the option as determined by an option pricing model"
  {:cmns-av/explanatoryNote
   #xsd/langString
    "The pricing model (such as the Black-Scholes model) takes into account current values such as implied volatility, the price of the underlying, the strike price, and time to expiration to determine what an option should be worth.  Each of the input values fluctuate, which means theoretical price will also be a fluctuating value.@en",
   :db/ident :fibo-md-derx-eto/OptionTheoreticalValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/"},
   :rdfs/label #xsd/langString "option theoretical value@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-fbc-fi-ip/PricingModel,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-cur/MonetaryAmount],
   :skos/definition
   #xsd/langString
    "fair value of the option as determined by an option pricing model@en"})

(def OptionsGreek
  "quantity representing the sensitivity of the price of an option or options to a change in underlying parameters on which the value depends"
  {:db/ident :fibo-md-derx-eto/OptionsGreek,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/"},
   :rdfs/label #xsd/langString "options greek@en",
   :rdfs/subClassOf :fibo-fbc-fi-ip/PriceAnalytic,
   :skos/definition
   #xsd/langString
    "quantity representing the sensitivity of the price of an option or options to a change in underlying parameters on which the value depends@en"})

(def OptionsTheta
  "A measure of the rate of change in an option's theoretical value for a one-unit change in time to the option's expiration date. Action: add terms that define or influence this."
  {:db/ident :fibo-md-derx-eto/OptionsTheta,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/"},
   :rdfs/label #xsd/langString "options theta@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom
                      :fibo-md-derx-eto/OptionTheoreticalValue,
                      :rdf/type :owl/Restriction}
                     :fibo-md-derx-eto/OptionsGreek
                     :fibo-fbc-fi-ip/PriceAnalytic],
   :skos/definition
   #xsd/langString
    "A measure of the rate of change in an option's theoretical value for a one-unit change in time to the option's expiration date. Action: add terms that define or influence this.@en"})

(def OptionsVega
  "A measure of the rate of change in an option's theoretical value for a one-unit change in the volatility assumption. Action: add terms that define or influence this."
  {:db/ident :fibo-md-derx-eto/OptionsVega,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/"},
   :rdfs/label #xsd/langString "options vega@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom
                      :fibo-md-derx-eto/OptionTheoreticalValue,
                      :rdf/type :owl/Restriction}
                     :fibo-md-derx-eto/OptionsGreek
                     :fibo-fbc-fi-ip/PriceAnalytic],
   :skos/definition
   #xsd/langString
    "A measure of the rate of change in an option's theoretical value for a one-unit change in the volatility assumption. Action: add terms that define or influence this.@en"})