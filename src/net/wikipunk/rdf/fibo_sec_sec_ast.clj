(ns net.wikipunk.rdf.fibo-sec-sec-ast
  "This ontology defines basic concepts such as portfolio, security holding and holder, and extends the notion of a financial asset to include an acquisition price."
  {:cmns-av/copyright ["Copyright (c) 2016-2023 Object Management Group, Inc."
                       "Copyright (c) 2016-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets/",
   :dcterms/abstract
   "This ontology defines basic concepts such as portfolio, security holding and holder, and extends the notion of a financial asset to include an acquisition price.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/Ownership/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/AccountingEquity/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/OwnershipParties/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecurityAssets/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-oac-opty"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-aeq"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-sec-ast"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-sec-ast",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets/",
   :rdfs/label "Security Assets Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets.rdf version of this ontology was revised to eliminate duplication with concepts in LCC."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets.rdf version of this ontology was revised to simplify the contract party hierarchy and eliminate complexity introduced by 'security holding'."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets.rdf version of this ontology was revised to address text formatting hygiene issues."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets.rdf version of this ontology was revised to fix spelling errors."]})

(def Portfolio
  "a collection of investments (financial assets) such as stocks, bonds and cash equivalents, as well as mutual funds"
  {:cmns-av/adaptedFrom "http://www.investopedia.com/terms/p/portfolio.asp",
   :db/ident :fibo-sec-sec-ast/Portfolio,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets/",
   :rdfs/label "portfolio",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-rel-rel/isManagedBy,
     :owl/someValuesFrom {:owl/unionOf
                          [:fibo-be-oac-opty/Investor
                           :fibo-fbc-pas-fpas/FinancialServiceProvider],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/comprises,
     :owl/someValuesFrom :fibo-sec-sec-ast/PortfolioHolding,
     :rdf/type           :owl/Restriction}
    {:owl/allValuesFrom {:owl/unionOf
                         [:fibo-be-oac-opty/Investor
                          :fibo-fbc-pas-fpas/FinancialServiceProvider],
                         :rdf/type :owl/Class},
     :owl/onProperty    :fibo-fnd-rel-rel/isHeldBy,
     :rdf/type          :owl/Restriction}
    :lcc-lr/Collection],
   :skos/definition
   "a collection of investments (financial assets) such as stocks, bonds and cash equivalents, as well as mutual funds"})

(def PortfolioHolding
  "the contents of holding of one or more portfolios of investments held by an individual investor or entity"
  {:cmns-av/adaptedFrom "http://www.investopedia.com/terms/h/holdings.asp",
   :cmns-av/explanatoryNote
   "Portfolio holdings may cover a variety of investment products, including stocks, bonds and mutual funds to options, futures and exchange-traded funds, and relatively esoteric instruments such as private equity and hedge funds. \n\nThe number and nature of holdings contribute to the degree of diversification of a portfolio. A mix of stocks across different sectors, bonds of different maturities, and other investments would suggest a well-diversified portfolio, while concentrated holdings in a handful of stocks within a single sector indicates a portfolio with limited diversification.",
   :db/ident :fibo-sec-sec-ast/PortfolioHolding,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets/",
   :rdfs/label "portfolio holding",
   :rdfs/subClassOf [{:owl/onProperty     :lcc-cr/isPartOf,
                      :owl/someValuesFrom :fibo-sec-sec-ast/Portfolio,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom
                      {:owl/unionOf
                       [:fibo-be-oac-opty/Investor
                        :fibo-fbc-pas-fpas/FinancialServiceProvider],
                       :rdf/type :owl/Class},
                      :owl/onProperty :fibo-fnd-rel-rel/isHeldBy,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-acc-aeq/FinancialAsset],
   :skos/definition
   "the contents of holding of one or more portfolios of investments held by an individual investor or entity"})

(def hasAcquisitionPrice
  "has a value as of the date of acquisition, expressed as an amount of money or goods"
  {:db/ident :fibo-sec-sec-ast/hasAcquisitionPrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets/",
   :rdfs/label "has acquisition price",
   :rdfs/range :fibo-fnd-acc-cur/Price,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasPrice,
   :skos/definition
   "has a value as of the date of acquisition, expressed as an amount of money or goods"})

(def ^{:private true} FinancialAsset
  {:db/ident        :fibo-fnd-acc-aeq/FinancialAsset,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf {:owl/allValuesFrom :fibo-fnd-acc-cur/Price,
                     :owl/onProperty    :fibo-sec-sec-ast/hasAcquisitionPrice,
                     :rdf/type          :owl/Restriction}})