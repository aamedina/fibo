(ns net.wikipunk.rdf.fibo-sec-sec-bsk
  "This ontology defines the concept of a tradable container of securities, indices, and/or market rates, and identifies the elements that can be constituents of a such a basket."
  {:cmns-av/copyright ["Copyright (c) 2016-2023 EDM Council, Inc."
                       "Copyright (c) 2018-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Baskets/",
   :dcterms/abstract
   "This ontology defines the concept of a tradable container of securities, indices, and/or market rates, and identifies the elements that can be constituents of a such a basket.",
   :dcterms/license {:rdfa/uri "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   [{:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/Collections/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/EconomicIndicators/EconomicIndicators/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/DatesAndTimes/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/Indicators/Indicators/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/Baskets/"},
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-ei-ei"
    "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/",
    "fibo-ind-ind-ind"
    "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/",
    "fibo-sec-sec-bsk"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Baskets/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-sec-bsk",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Baskets/",
   :rdfs/label "Baskets Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Baskets.rdf version of this ontology was revised to augment the definitions of various baskets to include weighting and to be dated, as needed to represent various benchmarks and funds based on these baskets."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Baskets.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Baskets.rdf version of this ontology was revised to reflect the move of dated collections from arrangements to financial dates, and replace 'involves' with 'comprises' for consistency across basket definitions."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Baskets.rdf version of this ontology was revised to add the date a given constituent is added to a basket, and use involves rather than hasIdentity to link a security or index to the basket constituent it is referenced by."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Baskets.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."]})

(def BasketOfIndices
  "basket composed of market indices"
  {:db/ident :fibo-sec-sec-bsk/BasketOfIndices,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Baskets/"},
   :rdfs/label "market basket",
   :rdfs/subClassOf [{:owl/onProperty :cmns-col/hasConstituent,
                      :owl/someValuesFrom
                      :fibo-sec-sec-bsk/BasketOfIndicesConstituent,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-dt-fd/DatedStructuredCollection
                     :fibo-fbc-pas-fpas/WeightedBasket],
   :skos/definition "basket composed of market indices",
   :skos/example
   "For example, certain equities derivatives have an underlying basket which is a basket of more than one index, not a basket of securities."})

(def BasketOfIndicesConstituent
  "single constituent of a basket of indices"
  {:db/ident :fibo-sec-sec-bsk/BasketOfIndicesConstituent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Baskets/"},
   :rdfs/label "basket Of indices constituent",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onClass    :cmns-dt/ExplicitDate,
                      :owl/onProperty :fibo-fnd-dt-fd/hasDateAdded,
                      :rdf/type       :owl/Restriction}
                     {:owl/allValuesFrom {:owl/unionOf
                                          [:fibo-ind-ei-ei/EconomicIndicator
                                           :fibo-ind-ind-ind/MarketRate],
                                          :rdf/type :owl/Class},
                      :owl/onProperty    :cmns-col/comprises,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-dt-fd/DatedCollectionConstituent
                     :fibo-fbc-pas-fpas/WeightedBasketConstituent],
   :skos/definition "single constituent of a basket of indices"})

(def BasketOfSecurities
  "basket composed of securities, typically of a particular asset class such as equities or bonds"
  {:db/ident :fibo-sec-sec-bsk/BasketOfSecurities,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Baskets/"},
   :rdfs/label "basket of securities",
   :rdfs/subClassOf [{:owl/onProperty :cmns-col/hasConstituent,
                      :owl/someValuesFrom
                      :fibo-sec-sec-bsk/SecuritiesBasketConstituent,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-dt-fd/DatedStructuredCollection
                     :fibo-fbc-pas-fpas/WeightedBasket],
   :skos/definition
   "basket composed of securities, typically of a particular asset class such as equities or bonds"})

(def MixedBasket
  "basket that has a mix of constituents, including securities and indices"
  {:db/ident :fibo-sec-sec-bsk/MixedBasket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Baskets/"},
   :rdfs/label "mixed basket",
   :rdfs/subClassOf [{:owl/onProperty :cmns-col/hasConstituent,
                      :owl/someValuesFrom
                      {:owl/unionOf
                       [:fibo-sec-sec-bsk/BasketOfIndicesConstituent
                        :fibo-sec-sec-bsk/SecuritiesBasketConstituent],
                       :rdf/type :owl/Class},
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-dt-fd/DatedStructuredCollection
                     :fibo-fbc-pas-fpas/WeightedBasket],
   :skos/definition
   "basket that has a mix of constituents, including securities and indices"})

(def SecuritiesBasketConstituent
  "security identified as a component of a basket of securities"
  {:db/ident :fibo-sec-sec-bsk/SecuritiesBasketConstituent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Baskets/"},
   :rdfs/label "securities basket constituent",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality #xsd/nonNegativeInteger 1,
                      :owl/onClass    :cmns-dt/ExplicitDate,
                      :owl/onProperty :fibo-fnd-dt-fd/hasDateAdded,
                      :rdf/type       :owl/Restriction}
                     {:owl/allValuesFrom :fibo-fbc-fi-fi/Security,
                      :owl/onProperty    :cmns-col/comprises,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-dt-fd/DatedCollectionConstituent
                     :fibo-fbc-pas-fpas/WeightedBasketConstituent],
   :skos/definition
   "security identified as a component of a basket of securities"})