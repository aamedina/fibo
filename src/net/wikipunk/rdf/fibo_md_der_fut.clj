(ns net.wikipunk.rdf.fibo-md-der-fut
  "Exchange traded futures date and time dependent terms such as prices and margining. Also covers greeks (thetas etc.)"
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/FuturesTemporal/",
   :dcterms/abstract
   "Exchange traded futures date and time dependent terms such as prices and margining. Also covers greeks (thetas etc.)",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/Ownership/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/InstrumentPricing/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/DerivativesTemporal/FuturesTemporal/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-fi-ip"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-oac-own"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-md-der-fut"
    "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/FuturesTemporal/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xs" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/FuturesTemporal/",
   :rdfa/prefix "fibo-md-der-fut",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/FuturesTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FuturesTemporal"},
   :sm/fileAbbreviation "fibo-md-der-fut"})

(def ExchangeFuturesPrice
  {:db/ident :fibo-md-der-fut/ExchangeFuturesPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/FuturesTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "exchange futures price"},
   :rdfs/subClassOf :fibo-fbc-fi-ip/SecurityPrice})

(def FuturesClosingPrice
  {:db/ident :fibo-md-der-fut/FuturesClosingPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/FuturesTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "futures closing price"},
   :rdfs/subClassOf :fibo-md-der-fut/ExchangeFuturesPrice})

(def FuturesDailySettlementPrice
  "Review whether this exists"
  {:db/ident :fibo-md-der-fut/FuturesDailySettlementPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/FuturesTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "futures daily settlement price"},
   :rdfs/subClassOf :fibo-fbc-fi-ip/SecurityPrice,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Review whether this exists"}})

(def FuturesGreek
  "quantity representing the sensitivity of the price of a future or futures to a change in underlying parameters on which the value depends"
  {:db/ident :fibo-md-der-fut/FuturesGreek,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/FuturesTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "futures greek"},
   :rdfs/subClassOf :fibo-fbc-fi-ip/PriceAnalytic,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "quantity representing the sensitivity of the price of a future or futures to a change in underlying parameters on which the value depends"}})

(def FuturesTheta
  {:db/ident :fibo-md-der-fut/FuturesTheta,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/FuturesTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "futures theta"},
   :rdfs/subClassOf :fibo-md-der-fut/FuturesGreek})

(def FuturesTradingAccountHolder
  "A party who has an account for futures trading at a derivatives exchange. Further notes: The trader opens an account with a given amount known as a margin."
  {:db/ident :fibo-md-der-fut/FuturesTradingAccountHolder,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/FuturesTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "futures trading account holder"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A party who has an account for futures trading at a derivatives exchange. Further notes: The trader opens an account with a given amount known as a margin."}})

(def FuturesVega
  {:db/ident :fibo-md-der-fut/FuturesVega,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/FuturesTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "futures vega"},
   :rdfs/subClassOf :fibo-md-der-fut/FuturesGreek})

(def InitialMargin
  "money or securities put up as a good faith deposit assuring that a future contract will be fulfilled"
  {:db/ident :fibo-md-der-fut/InitialMargin,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "When you open a futures contract, the futures exchange will state a minimum amount of money that you must deposit into your account. This original deposit of money is called the initial margin. When your contract is liquidated, you will be refunded the initial margin plus or minus any gains or losses that occur over the span of the futures contract. In other words, the amount in your margin account changes daily as the market fluctuates in relation to your futures contract. The minimum-level margin is determined by the futures exchange and is usually 5% to 10% of the futures contract. These predetermined initial margin amounts are continuously under review: at times of high market volatility, initial margin requirements can be raised."},
   :fibo-fnd-utl-av/synonym {:rdf/language "en",
                             :rdf/value    "security deposit"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/FuturesTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "initial margin"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/isHeldBy,
                      :owl/someValuesFrom
                      :fibo-md-der-fut/FuturesTradingAccountHolder,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-dt-fd/hasAsOfDate,
                      :owl/someValuesFrom :fibo-fnd-dt-fd/ExplicitDate,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-oac-own/Asset],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "money or securities put up as a good faith deposit assuring that a future contract will be fulfilled"}})

(def MinimumMargin
  "The lowest amount an account can reach before needing to be replenished."
  {:db/ident :fibo-md-der-fut/MinimumMargin,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/FuturesTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "minimum margin"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/isHeldBy,
                      :owl/someValuesFrom
                      :fibo-md-der-fut/FuturesTradingAccountHolder,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-dt-fd/hasAsOfDate,
                      :owl/someValuesFrom :fibo-fnd-dt-fd/ExplicitDate,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-oac-own/Asset],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The lowest amount an account can reach before needing to be replenished."}})