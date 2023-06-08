(ns net.wikipunk.rdf.fibo-md-der-fut
  "Exchange traded futures date and time dependent terms such as prices and margining. Also covers greeks (thetas etc.)"
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/FuturesTemporal/",
   :dcterms/abstract
   "Exchange traded futures date and time dependent terms such as prices and margining. Also covers greeks (thetas etc.)",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://www.omg.org/spec/Commons/DatesAndTimes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/Ownership/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/InstrumentPricing/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/DerivativesTemporal/FuturesTemporal/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "dcterms" "http://purl.org/dc/terms/",
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
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-md-der-fut",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/FuturesTemporal/",
   :rdfs/label #voc/lstr "Futures Temporal Ontology@en"})

(def ExchangeFuturesPrice
  "exchange futures price"
  {:db/ident :fibo-md-der-fut/ExchangeFuturesPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/FuturesTemporal/",
   :rdfs/label #voc/lstr "exchange futures price@en",
   :rdfs/subClassOf :fibo-fbc-fi-ip/SecurityPrice})

(def FuturesClosingPrice
  "futures closing price"
  {:db/ident :fibo-md-der-fut/FuturesClosingPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/FuturesTemporal/",
   :rdfs/label #voc/lstr "futures closing price@en",
   :rdfs/subClassOf [:fibo-md-der-fut/ExchangeFuturesPrice
                     :fibo-fbc-fi-ip/SecurityPrice]})

(def FuturesDailySettlementPrice
  "Review whether this exists"
  {:db/ident :fibo-md-der-fut/FuturesDailySettlementPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/FuturesTemporal/",
   :rdfs/label #voc/lstr "futures daily settlement price@en",
   :rdfs/subClassOf :fibo-fbc-fi-ip/SecurityPrice,
   :skos/definition #voc/lstr "Review whether this exists@en"})

(def FuturesGreek
  "quantity representing the sensitivity of the price of a future or futures to a change in underlying parameters on which the value depends"
  {:db/ident :fibo-md-der-fut/FuturesGreek,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/FuturesTemporal/",
   :rdfs/label #voc/lstr "futures greek@en",
   :rdfs/subClassOf :fibo-fbc-fi-ip/PriceAnalytic,
   :skos/definition
   #voc/lstr
    "quantity representing the sensitivity of the price of a future or futures to a change in underlying parameters on which the value depends@en"})

(def FuturesTheta
  "futures theta"
  {:db/ident :fibo-md-der-fut/FuturesTheta,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/FuturesTemporal/",
   :rdfs/label #voc/lstr "futures theta@en",
   :rdfs/subClassOf [:fibo-md-der-fut/FuturesGreek
                     :fibo-fbc-fi-ip/PriceAnalytic]})

(def FuturesTradingAccountHolder
  "A party who has an account for futures trading at a derivatives exchange. Further notes: The trader opens an account with a given amount known as a margin."
  {:db/ident :fibo-md-der-fut/FuturesTradingAccountHolder,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/FuturesTemporal/",
   :rdfs/label #voc/lstr "futures trading account holder@en",
   :skos/definition
   #voc/lstr
    "A party who has an account for futures trading at a derivatives exchange. Further notes: The trader opens an account with a given amount known as a margin.@en"})

(def FuturesVega
  "futures vega"
  {:db/ident :fibo-md-der-fut/FuturesVega,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/FuturesTemporal/",
   :rdfs/label #voc/lstr "futures vega@en",
   :rdfs/subClassOf [:fibo-md-der-fut/FuturesGreek
                     :fibo-fbc-fi-ip/PriceAnalytic]})

(def InitialMargin
  "money or securities put up as a good faith deposit assuring that a future contract will be fulfilled"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "When you open a futures contract, the futures exchange will state a minimum amount of money that you must deposit into your account. This original deposit of money is called the initial margin. When your contract is liquidated, you will be refunded the initial margin plus or minus any gains or losses that occur over the span of the futures contract. In other words, the amount in your margin account changes daily as the market fluctuates in relation to your futures contract. The minimum-level margin is determined by the futures exchange and is usually 5% to 10% of the futures contract. These predetermined initial margin amounts are continuously under review: at times of high market volatility, initial margin requirements can be raised.@en",
   :cmns-av/synonym #voc/lstr "security deposit@en",
   :db/ident :fibo-md-der-fut/InitialMargin,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/FuturesTemporal/",
   :rdfs/label #voc/lstr "initial margin@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/isHeldBy,
                      :owl/someValuesFrom
                      :fibo-md-der-fut/FuturesTradingAccountHolder,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-dt-fd/hasAsOfDate,
                      :owl/someValuesFrom :cmns-dt/ExplicitDate,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-oac-own/Asset],
   :skos/definition
   #voc/lstr
    "money or securities put up as a good faith deposit assuring that a future contract will be fulfilled@en"})

(def MinimumMargin
  "The lowest amount an account can reach before needing to be replenished."
  {:db/ident :fibo-md-der-fut/MinimumMargin,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/FuturesTemporal/",
   :rdfs/label #voc/lstr "minimum margin@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/isHeldBy,
                      :owl/someValuesFrom
                      :fibo-md-der-fut/FuturesTradingAccountHolder,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-dt-fd/hasAsOfDate,
                      :owl/someValuesFrom :cmns-dt/ExplicitDate,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-oac-own/Asset],
   :skos/definition
   #voc/lstr
    "The lowest amount an account can reach before needing to be replenished.@en"})