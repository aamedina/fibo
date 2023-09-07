(ns net.wikipunk.rdf.fibo-md-derx-eto
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/",
    :namespaces
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
    :prefix "fibo-md-derx-eto",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/"}
  {:cmns-av/copyright "Copyright (c) 2015-2023 EDM Council, Inc.",
   :dcterms/abstract
   "Exchange traded options date and time dependent terms such as pricing and other analytics, including greeks (deltas, thetas etc.)",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/Options/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/InstrumentPricing/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/Publishers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/Indicators/Indicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/Markets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/DerivativesTemporal/ETOptionsTemporal/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Exchange-Traded Options Temporal"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/"})

(def Delta
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Delta tells you what options to buy to get the equivalent price sensitivity to the underlying. How many at that price to get that hedge. So for example an at the money option has a delta of 50. Units"},
   :db/ident :fibo-md-derx-eto/Delta,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "delta"},
   :rdfs/subClassOf :fibo-md-derx-eto/OptionsGreek,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "First derivative of option value with respect to theoretical price is a delta (or on a position). Theoretical price"}})

(def OptionDailySettlementPrice
  {:db/ident :fibo-md-derx-eto/OptionDailySettlementPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "option daily settlement price"},
   :rdfs/subClassOf #{:fibo-fbc-fi-ip/ClosingPrice :fibo-fbc-fi-ip/SecurityPrice
                      {:owl/onProperty :fibo-be-fct-pub/hasPublisher,
                       :owl/someValuesFrom
                       {:owl/unionOf
                        [:fibo-fbc-fct-mkt/DesignatedContractMarket
                         :fibo-der-drc-bsc/DerivativesClearingOrganization],
                        :rdf/type :owl/Class},
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The official price at the end of a trading session. This price is established by The Options Clearing Corporation and is used to determine changes in account equity, margin requirements, and for other purposes."}})

(def OptionTheoreticalValue
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The pricing model (such as the Black-Scholes model) takes into account current values such as implied volatility, the price of the underlying, the strike price, and time to expiration to determine what an option should be worth.  Each of the input values fluctuate, which means theoretical price will also be a fluctuating value."},
   :db/ident :fibo-md-derx-eto/OptionTheoreticalValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "option theoretical value"},
   :rdfs/subClassOf #{:fibo-fnd-acc-cur/MonetaryAmount
                      {:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                       :owl/someValuesFrom :fibo-fbc-fi-ip/PricingModel,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "fair value of the option as determined by an option pricing model"}})

(def OptionsGreek
  {:db/ident :fibo-md-derx-eto/OptionsGreek,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "options greek"},
   :rdfs/subClassOf :fibo-fbc-fi-ip/PriceAnalytic,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "quantity representing the sensitivity of the price of an option or options to a change in underlying parameters on which the value depends"}})

(def OptionsTheta
  {:db/ident :fibo-md-derx-eto/OptionsTheta,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "options theta"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
      :owl/someValuesFrom :fibo-md-derx-eto/OptionTheoreticalValue,
      :rdf/type           :owl/Restriction} :fibo-md-derx-eto/OptionsGreek},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A measure of the rate of change in an option's theoretical value for a one-unit change in time to the option's expiration date. Action: add terms that define or influence this."}})

(def OptionsVega
  {:db/ident :fibo-md-derx-eto/OptionsVega,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "options vega"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
      :owl/someValuesFrom :fibo-md-derx-eto/OptionTheoreticalValue,
      :rdf/type           :owl/Restriction} :fibo-md-derx-eto/OptionsGreek},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A measure of the rate of change in an option's theoretical value for a one-unit change in the volatility assumption. Action: add terms that define or influence this."}})

(def urn:uuid:14fed738-e5e4-520d-8e6a-32a97f2415eb
  {:cmns-av/copyright "Copyright (c) 2015-2023 EDM Council, Inc.",
   :dcterms/abstract
   "Exchange traded options date and time dependent terms such as pricing and other analytics, including greeks (deltas, thetas etc.)",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/Options/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/InstrumentPricing/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/Publishers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/Indicators/Indicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/Markets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/DerivativesTemporal/ETOptionsTemporal/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Exchange-Traded Options Temporal"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/"})