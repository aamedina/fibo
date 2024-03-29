(ns net.wikipunk.rdf.fibo-md-temx-trs
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/MD/TemporalCore/SecurityTradingStatuses/",
   :dcterms/abstract
   "This ontology defines the various kinds of trading status that a security may be in at any given point in time. These includes such terms as active and halted, inactive and so on, along with their qualifying terms.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :namespaces
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
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Lifecycles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/MD/TemporalCore/SecurityTradingStatuses/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-md-temx-trs",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SecurityTradingStatuses"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/"})

(def Active
  {:db/ident :fibo-md-temx-trs/Active,
   :owl/disjointWith :fibo-md-temx-trs/Inactive,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "active"},
   :rdfs/subClassOf :fibo-md-temx-trs/SecurityTradingStatus,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Security is actively traded"}})

(def ActivelyTrading
  {:db/ident :fibo-md-temx-trs/ActivelyTrading,
   :owl/disjointWith :fibo-md-temx-trs/TradingHalted,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "actively trading"},
   :rdfs/subClassOf :fibo-md-temx-trs/ExchangeSecurityTradingStatus,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Security is actively traded on the exchange or trading facility"}})

(def ExchangeSecurityTradingStatus
  {:db/ident :fibo-md-temx-trs/ExchangeSecurityTradingStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "exchange security trading status"},
   :rdfs/subClassOf #{:fibo-fnd-arr-lif/LifecycleStatus
                      {:owl/onProperty     :cmns-cls/classifies,
                       :owl/someValuesFrom :fibo-sec-sec-lst/Listing,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "trading status of a listed security on a given trading exchange"}})

(def Inactive
  {:db/ident :fibo-md-temx-trs/Inactive,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "inactive"},
   :rdfs/subClassOf :fibo-md-temx-trs/SecurityTradingStatus})

(def Issued
  {:db/ident :fibo-md-temx-trs/Issued,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issued"},
   :rdfs/subClassOf :fibo-md-temx-trs/SecurityLifecycleStatus,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "The security has been issued into the secondary market."}})

(def SecurityLifecycleStatus
  {:db/ident :fibo-md-temx-trs/SecurityLifecycleStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "security lifecycle status"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-cls/classifies,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-arr-lif/LifecycleStatus},
   :skos/definition {:rdf/language "en",
                     :rdf/value "status of a security within its lifecycle"}})

(def SecurityTradingStatus
  {:db/ident :fibo-md-temx-trs/SecurityTradingStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "security trading status"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-cls/classifies,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-arr-lif/LifecycleStatus},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "status of the security in terms of whether it is trading or not, and any special considerations relating to trading"},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Exchange Traded Security trading status is now a separate term, covering trading suspension on an exchange, so that does not form part of this term."}})

(def TradingHalted
  {:db/ident :fibo-md-temx-trs/TradingHalted,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "trading halted"},
   :rdfs/subClassOf :fibo-md-temx-trs/ExchangeSecurityTradingStatus})

(def WhenDistributed
  {:db/ident :fibo-md-temx-trs/WhenDistributed,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "when distributed"},
   :rdfs/subClassOf :fibo-md-temx-trs/SecurityLifecycleStatus,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Used to refer to a security that trades after the date of issue but before the time at which the certificates are delivered"}})

(def WhenIssued
  {:db/ident :fibo-md-temx-trs/WhenIssued,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "when issued"},
   :rdfs/subClassOf :fibo-md-temx-trs/SecurityLifecycleStatus,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "When Issued or Gray Market trading is when a security is traded ahead of the date at which it is to be issued."}})

(def Worthless
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value "e.g. bankruptcy hearings - might result in this being said."},
   :db/ident :fibo-md-temx-trs/Worthless,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "worthless"},
   :rdfs/subClassOf :fibo-md-temx-trs/SecurityLifecycleStatus,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Announcement by the regulator that the security has become worthless."}})

(def urn:uuid:1349d741-d2d4-542e-bded-c770ad56226c
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcterms/abstract
   "This ontology defines the various kinds of trading status that a security may be in at any given point in time. These includes such terms as active and halted, inactive and so on, along with their qualifying terms.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Lifecycles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/MD/TemporalCore/SecurityTradingStatuses/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SecurityTradingStatuses"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/"})