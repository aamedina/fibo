(ns net.wikipunk.rdf.fibo-md-derx-eto
  "Exchange traded options date and time dependent terms such as pricing and other analytics, including greeks (deltas, thetas etc.)"
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/",
   :dcterms/abstract
   "Exchange traded options date and time dependent terms such as pricing and other analytics, including greeks (deltas, thetas etc.)",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/Publishers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/Options/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/Indicators/Indicators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/InstrumentPricing/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/DerivativesBasics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/Markets/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/DerivativesTemporal/ETOptionsTemporal/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
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
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/",
   :rdfa/prefix "fibo-md-derx-eto",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Exchange-Traded Options Temporal"},
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright "Copyright (c) 2015-2022 EDM Council, Inc.",
   :sm/dependsOn ["https://spec.edmcouncil.org/fibo/ontology/FND/"
                  "https://spec.edmcouncil.org/fibo/ontology/DER/"
                  "https://spec.edmcouncil.org/fibo/ontology/FBC/"
                  "https://spec.edmcouncil.org/fibo/ontology/IND/"
                  "https://spec.edmcouncil.org/fibo/ontology/BE/"],
   :sm/fileAbbreviation "fibo-md-derx-eto",
   :sm/filename "ETOptionsTemporal.rdf"})

(def Delta
  "First derivative of option value with respect to theoretical price is a delta (or on a position). Theoretical price"
  {:db/ident :fibo-md-derx-eto/Delta,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Delta tells you what options to buy to get the equivalent price sensitivity to the underlying. How many at that price to get that hedge. So for example an at the money option has a delta of 50. Units"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "delta"},
   :rdfs/subClassOf :fibo-md-derx-eto/OptionsGreek,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "First derivative of option value with respect to theoretical price is a delta (or on a position). Theoretical price"}})

(def OptionDailySettlementPrice
  "The official price at the end of a trading session. This price is established by The Options Clearing Corporation and is used to determine changes in account equity, margin requirements, and for other purposes."
  {:db/ident :fibo-md-derx-eto/OptionDailySettlementPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "option daily settlement price"},
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
   {:rdf/language "en",
    :rdf/value
    "The official price at the end of a trading session. This price is established by The Options Clearing Corporation and is used to determine changes in account equity, margin requirements, and for other purposes."}})

(def OptionTheoreticalValue
  "fair value of the option as determined by an option pricing model"
  {:db/ident :fibo-md-derx-eto/OptionTheoreticalValue,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The pricing model (such as the Black-Scholes model) takes into account current values such as implied volatility, the price of the underlying, the strike price, and time to expiration to determine what an option should be worth.  Each of the input values fluctuate, which means theoretical price will also be a fluctuating value."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "option theoretical value"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom :fibo-fbc-fi-ip/PricingModel,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-acc-cur/MonetaryAmount],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "fair value of the option as determined by an option pricing model"}})

(def OptionsGreek
  "quantity representing the sensitivity of the price of an option or options to a change in underlying parameters on which the value depends"
  {:db/ident :fibo-md-derx-eto/OptionsGreek,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "options greek"},
   :rdfs/subClassOf :fibo-fbc-fi-ip/PriceAnalytic,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "quantity representing the sensitivity of the price of an option or options to a change in underlying parameters on which the value depends"}})

(def OptionsTheta
  "A measure of the rate of change in an option's theoretical value for a one-unit change in time to the option's expiration date. Action: add terms that define or influence this."
  {:db/ident :fibo-md-derx-eto/OptionsTheta,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "options theta"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom
                      :fibo-md-derx-eto/OptionTheoreticalValue,
                      :rdf/type :owl/Restriction}
                     :fibo-md-derx-eto/OptionsGreek],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A measure of the rate of change in an option's theoretical value for a one-unit change in time to the option's expiration date. Action: add terms that define or influence this."}})

(def OptionsVega
  "A measure of the rate of change in an option's theoretical value for a one-unit change in the volatility assumption. Action: add terms that define or influence this."
  {:db/ident :fibo-md-derx-eto/OptionsVega,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "options vega"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom
                      :fibo-md-derx-eto/OptionTheoreticalValue,
                      :rdf/type :owl/Restriction}
                     :fibo-md-derx-eto/OptionsGreek],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A measure of the rate of change in an option's theoretical value for a one-unit change in the volatility assumption. Action: add terms that define or influence this."}})