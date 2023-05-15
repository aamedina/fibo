(ns net.wikipunk.rdf.fibo-md-temx-trs
  "This ontology defines the various kinds of trading status that a security may be in at any given point in time. These includes such terms as active and halted, inactive and so on, along with their qualifying terms."
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/",
   :dcterms/abstract
   "This ontology defines the various kinds of trading status that a security may be in at any given point in time. These includes such terms as active and halted, inactive and so on, along with their qualifying terms.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesListings/"
    "https://www.omg.org/spec/Commons/Classifiers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Lifecycles/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/TemporalCore/SecurityTradingStatuses/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-arr-lif"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-md-temx-trs"
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/",
    "fibo-sec-sec-lst"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-md-temx-trs",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/",
   :rdfs/label #voc/lstr "SecurityTradingStatuses@en"})

(def Active
  "Security is actively traded"
  {:db/ident :fibo-md-temx-trs/Active,
   :owl/disjointWith :fibo-md-temx-trs/Inactive,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/",
   :rdfs/label #voc/lstr "active@en",
   :rdfs/subClassOf [:fibo-md-temx-trs/SecurityTradingStatus
                     :fibo-md-temx-trs/Active
                     {:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-lif/LifecycleStatus],
   :skos/definition #voc/lstr "Security is actively traded@en"})

(def ActivelyTrading
  "Security is actively traded on the exchange or trading facility"
  {:db/ident :fibo-md-temx-trs/ActivelyTrading,
   :owl/disjointWith :fibo-md-temx-trs/TradingHalted,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/",
   :rdfs/label #voc/lstr "actively trading@en",
   :rdfs/subClassOf [:fibo-md-temx-trs/ExchangeSecurityTradingStatus
                     :fibo-md-temx-trs/ActivelyTrading
                     {:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :fibo-sec-sec-lst/Listing,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-lif/LifecycleStatus],
   :skos/definition
   #voc/lstr
    "Security is actively traded on the exchange or trading facility@en"})

(def ExchangeSecurityTradingStatus
  "trading status of a listed security on a given trading exchange"
  {:db/ident :fibo-md-temx-trs/ExchangeSecurityTradingStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/",
   :rdfs/label #voc/lstr "exchange security trading status@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :fibo-sec-sec-lst/Listing,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-lif/LifecycleStatus
                     :fibo-md-temx-trs/ExchangeSecurityTradingStatus],
   :skos/definition
   #voc/lstr
    "trading status of a listed security on a given trading exchange@en"})

(def Inactive
  "inactive"
  {:db/ident :fibo-md-temx-trs/Inactive,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/",
   :rdfs/label #voc/lstr "inactive@en",
   :rdfs/subClassOf [:fibo-md-temx-trs/SecurityTradingStatus
                     :fibo-md-temx-trs/Inactive
                     {:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-lif/LifecycleStatus]})

(def Issued
  "The security has been issued into the secondary market."
  {:db/ident :fibo-md-temx-trs/Issued,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/",
   :rdfs/label #voc/lstr "issued@en",
   :rdfs/subClassOf [:fibo-md-temx-trs/SecurityLifecycleStatus
                     :fibo-md-temx-trs/Issued
                     {:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-lif/LifecycleStatus],
   :skos/definition
   #voc/lstr "The security has been issued into the secondary market.@en"})

(def SecurityLifecycleStatus
  "status of a security within its lifecycle"
  {:db/ident :fibo-md-temx-trs/SecurityLifecycleStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/",
   :rdfs/label #voc/lstr "security lifecycle status@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-lif/LifecycleStatus
                     :fibo-md-temx-trs/SecurityLifecycleStatus],
   :skos/definition #voc/lstr "status of a security within its lifecycle@en"})

(def SecurityTradingStatus
  "status of the security in terms of whether it is trading or not, and any special considerations relating to trading"
  {:db/ident :fibo-md-temx-trs/SecurityTradingStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/",
   :rdfs/label #voc/lstr "security trading status@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-lif/LifecycleStatus
                     :fibo-md-temx-trs/SecurityTradingStatus],
   :skos/definition
   #voc/lstr
    "status of the security in terms of whether it is trading or not, and any special considerations relating to trading@en",
   :skos/editorialNote
   #voc/lstr
    "Exchange Traded Security trading status is now a separate term, covering trading suspension on an exchange, so that does not form part of this term.@en"})

(def TradingHalted
  "trading halted"
  {:db/ident :fibo-md-temx-trs/TradingHalted,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/",
   :rdfs/label #voc/lstr "trading halted@en",
   :rdfs/subClassOf [:fibo-md-temx-trs/ExchangeSecurityTradingStatus
                     :fibo-md-temx-trs/TradingHalted
                     {:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :fibo-sec-sec-lst/Listing,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-lif/LifecycleStatus]})

(def WhenDistributed
  "Used to refer to a security that trades after the date of issue but before the time at which the certificates are delivered"
  {:db/ident :fibo-md-temx-trs/WhenDistributed,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/",
   :rdfs/label #voc/lstr "when distributed@en",
   :rdfs/subClassOf [:fibo-md-temx-trs/SecurityLifecycleStatus
                     :fibo-md-temx-trs/WhenDistributed
                     {:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-lif/LifecycleStatus],
   :skos/definition
   #voc/lstr
    "Used to refer to a security that trades after the date of issue but before the time at which the certificates are delivered@en"})

(def WhenIssued
  "When Issued or Gray Market trading is when a security is traded ahead of the date at which it is to be issued."
  {:db/ident :fibo-md-temx-trs/WhenIssued,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/",
   :rdfs/label #voc/lstr "when issued@en",
   :rdfs/subClassOf [:fibo-md-temx-trs/SecurityLifecycleStatus
                     :fibo-md-temx-trs/WhenIssued
                     {:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-lif/LifecycleStatus],
   :skos/definition
   #voc/lstr
    "When Issued or Gray Market trading is when a security is traded ahead of the date at which it is to be issued.@en"})

(def Worthless
  "Announcement by the regulator that the security has become worthless."
  {:cmns-av/explanatoryNote
   #voc/lstr "e.g. bankruptcy hearings - might result in this being said.@en",
   :db/ident :fibo-md-temx-trs/Worthless,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/",
   :rdfs/label #voc/lstr "worthless@en",
   :rdfs/subClassOf [:fibo-md-temx-trs/SecurityLifecycleStatus
                     :fibo-md-temx-trs/Worthless
                     {:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-lif/LifecycleStatus],
   :skos/definition
   #voc/lstr
    "Announcement by the regulator that the security has become worthless.@en"})