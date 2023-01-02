(ns net.wikipunk.rdf.fibo-der-sbd-sbd
  "This ontology defines common concepts for derivatives based on securities as their underliers, including those based on indices or baskets of these assets."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
   :dcterms/abstract
   "This ontology defines common concepts for derivatives based on securities as their underliers, including those based on indices or baskets of these assets.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/MarketIndices/BasketIndices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Equities/EquityInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/DerivativesBasics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/Baskets/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Arrangements/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/Swaps/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/DebtInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/Indicators/Indicators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-der-drc-bsc"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
    "fibo-der-drc-swp"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/",
    "fibo-der-sbd-sbd"
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-arr-arr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
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
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
   :rdfa/prefix "fibo-der-sbd-sbd",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
   :rdfs/label "Security-Based Derivatives Ontology",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2016-2020 EDM Council, Inc."
                  "Copyright (c) 2016-2020 Object Management Group, Inc."],
   :sm/dependsOn
   ["https://spec.edmcouncil.org/fibo/ontology/FND/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/"
    "https://spec.edmcouncil.org/fibo/ontology/IND/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/"],
   :sm/fileAbbreviation "fibo-der-sbd-sbd",
   :sm/filename "SecurityBasedDerivatives.rdf"})

(def BasketOfDebtInstruments
  "basket of securities whose constituents are debt instruments"
  {:db/ident :fibo-der-sbd-sbd/BasketOfDebtInstruments,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "basket of debt instruments"},
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-arr-arr/hasConstituent,
     :owl/someValuesFrom {:owl/allValuesFrom :fibo-fbc-fi-fi/DebtInstrument,
                          :owl/onProperty    :fibo-fnd-rel-rel/comprises,
                          :rdf/type          :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-sec-sec-bsk/BasketOfSecurities],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "basket of securities whose constituents are debt instruments"}})

(def DebtInstrumentDerivative
  "security-based derivative whose underlier is a debt observable"
  {:db/ident :fibo-der-sbd-sbd/DebtInstrumentDerivative,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
   :rdfs/label "debt instrument derivative",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-der-drc-bsc/hasUnderlier,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                          :owl/someValuesFrom :fibo-der-sbd-sbd/DebtObservable,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-der-sbd-sbd/SecurityBasedDerivative],
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
                     :fibo-der-sbd-sbd/SecurityUnderlier],
   :skos/definition
   "security underlier that is debt-based, such as individual debt instruments, credit indices, and custom baskets of debt assets"})

(def EquityDerivative
  "security-based derivative whose underlier is an equity observable"
  {:db/ident :fibo-der-sbd-sbd/EquityDerivative,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
   :rdfs/label "equity derivative",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-bsc/hasUnderlier,
                      :owl/someValuesFrom :fibo-der-sbd-sbd/EquityObservable,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-sbd-sbd/SecurityBasedDerivative],
   :skos/definition
   "security-based derivative whose underlier is an equity observable"})

(def EquityObservable
  "security underlier that is equity based, such as individual shares, equity indices, and custom basket of equity assets"
  {:db/ident :fibo-der-sbd-sbd/EquityObservable,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
   :rdfs/label "equity observable",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-ind-mkt-bas/BasketOfEquities
                                            :fibo-sec-eq-eq/ListedShare
                                            :fibo-ind-mkt-bas/EquityIndex],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-der-sbd-sbd/SecurityUnderlier],
   :skos/definition
   "security underlier that is equity based, such as individual shares, equity indices, and custom basket of equity assets"})

(def SecurityBasedDerivative
  "derivative instrument whose underlier is based on a security, including collections of securities and indices based on securities"
  {:db/ident :fibo-der-sbd-sbd/SecurityBasedDerivative,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "security-based derivative"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-bsc/hasUnderlier,
                      :owl/someValuesFrom :fibo-der-sbd-sbd/SecurityUnderlier,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/DerivativeInstrument],
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
                     :fibo-der-drc-bsc/Underlier],
   :skos/definition
   "underlier consisting of security-based assets, such as baskets of securities, individual securities, reference indices, and combinations thereof"})