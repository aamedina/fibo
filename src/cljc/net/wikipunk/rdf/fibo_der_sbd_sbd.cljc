(ns net.wikipunk.rdf.fibo-der-sbd-sbd
  "This ontology defines common concepts for derivatives based on securities as their underliers, including those based on indices or baskets of these assets."
  {:cmns-av/copyright ["Copyright (c) 2016-2023 Object Management Group, Inc."
                       "Copyright (c) 2016-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
   :dcterms/abstract
   "This ontology defines common concepts for derivatives based on securities as their underliers, including those based on indices or baskets of these assets.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/MarketIndices/BasketIndices/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Equities/EquityInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/DerivativesBasics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/Baskets/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/Swaps/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/DebtInstruments/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/Indicators/Indicators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-der-sbd-sbd"
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-mkt-bas"
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/",
    "fibo-sec-dbt-dbti"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/",
    "fibo-sec-eq-eq"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
    "fibo-sec-sec-bsk"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Baskets/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-der-sbd-sbd",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
   :rdfs/label "Security-Based Derivatives Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."]})

(def BasketOfDebtInstruments
  "basket of securities whose constituents are debt instruments"
  {:db/ident :fibo-der-sbd-sbd/BasketOfDebtInstruments,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
   :rdfs/label #voc/lstr "basket of debt instruments@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom {:owl/allValuesFrom
                                           :fibo-fbc-fi-fi/DebtInstrument,
                                           :owl/onProperty :cmns-col/comprises,
                                           :rdf/type :owl/Restriction},
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-bsk/BasketOfSecurities
                     :fibo-der-sbd-sbd/BasketOfDebtInstruments],
   :skos/definition
   #voc/lstr "basket of securities whose constituents are debt instruments@en"})

(def DebtInstrumentDerivative
  "security-based derivative whose underlier is a debt observable"
  {:db/ident :fibo-der-sbd-sbd/DebtInstrumentDerivative,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
   :rdfs/label "debt instrument derivative",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                          :owl/someValuesFrom :fibo-der-sbd-sbd/DebtObservable,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-der-sbd-sbd/SecurityBasedDerivative
    :fibo-der-sbd-sbd/DebtInstrumentDerivative
    {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
     :owl/someValuesFrom :fibo-der-sbd-sbd/SecurityUnderlier,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fi-fi/DerivativeInstrument],
   :skos/definition
   "security-based derivative whose underlier is a debt observable"})

(def DebtObservable
  "security underlier that is debt-based, such as individual debt instruments, credit indices, and custom baskets of debt assets"
  {:db/ident :fibo-der-sbd-sbd/DebtObservable,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
   :rdfs/label "debt observable",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                      :owl/someValuesFrom
                      {:owl/unionOf [:fibo-der-sbd-sbd/BasketOfDebtInstruments
                                     :fibo-sec-dbt-dbti/TradableDebtInstrument
                                     :fibo-ind-mkt-bas/CreditIndex
                                     :fibo-ind-mkt-bas/BasketOfCreditRisks],
                       :rdf/type    :owl/Class},
                      :rdf/type :owl/Restriction}
                     :fibo-der-sbd-sbd/SecurityUnderlier
                     :fibo-der-sbd-sbd/DebtObservable
                     :fibo-fbc-fi-fi/Underlier
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    {:owl/unionOf
                                       [:fibo-sec-sec-bsk/BasketOfSecurities
                                        :fibo-fbc-fi-fi/Security
                                        :fibo-ind-mkt-bas/ReferenceIndex],
                                       :rdf/type :owl/Class},
                      :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "security underlier that is debt-based, such as individual debt instruments, credit indices, and custom baskets of debt assets"})

(def EquityDerivative
  "security-based derivative whose underlier is an equity observable"
  {:db/ident :fibo-der-sbd-sbd/EquityDerivative,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
   :rdfs/label "equity derivative",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom :fibo-der-sbd-sbd/EquityObservable,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-sbd-sbd/SecurityBasedDerivative
                     :fibo-der-sbd-sbd/EquityDerivative
                     {:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom :fibo-der-sbd-sbd/SecurityUnderlier,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/DerivativeInstrument],
   :skos/definition
   "security-based derivative whose underlier is an equity observable"})

(def EquityObservable
  "security underlier that is equity based, such as individual shares, equity indices, and custom basket of equity assets"
  {:db/ident :fibo-der-sbd-sbd/EquityObservable,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
   :rdfs/label "equity observable",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
     :owl/someValuesFrom {:owl/unionOf [:fibo-ind-mkt-bas/BasketOfEquities
                                        :fibo-sec-eq-eq/ListedShare
                                        :fibo-ind-mkt-bas/EquityIndex],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    :fibo-der-sbd-sbd/SecurityUnderlier
    :fibo-der-sbd-sbd/EquityObservable
    :fibo-fbc-fi-fi/Underlier
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    {:owl/unionOf [:fibo-sec-sec-bsk/BasketOfSecurities
                                    :fibo-fbc-fi-fi/Security
                                    :fibo-ind-mkt-bas/ReferenceIndex],
                      :rdf/type    :owl/Class},
     :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   "security underlier that is equity based, such as individual shares, equity indices, and custom basket of equity assets"})

(def SecurityBasedDerivative
  "derivative instrument whose underlier is based on a security, including collections of securities and indices based on securities"
  {:db/ident :fibo-der-sbd-sbd/SecurityBasedDerivative,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
   :rdfs/label #voc/lstr "security-based derivative@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom :fibo-der-sbd-sbd/SecurityUnderlier,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/DerivativeInstrument
                     :fibo-der-sbd-sbd/SecurityBasedDerivative],
   :skos/definition
   "derivative instrument whose underlier is based on a security, including collections of securities and indices based on securities"})

(def SecurityUnderlier
  "underlier consisting of security-based assets, such as baskets of securities, individual securities, reference indices, and combinations thereof"
  {:db/ident :fibo-der-sbd-sbd/SecurityUnderlier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
   :rdfs/label "security underlier",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    {:owl/unionOf
                                       [:fibo-sec-sec-bsk/BasketOfSecurities
                                        :fibo-fbc-fi-fi/Security
                                        :fibo-ind-mkt-bas/ReferenceIndex],
                                       :rdf/type :owl/Class},
                      :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fi-fi/Underlier
                     :fibo-der-sbd-sbd/SecurityUnderlier],
   :skos/definition
   "underlier consisting of security-based assets, such as baskets of securities, individual securities, reference indices, and combinations thereof"})