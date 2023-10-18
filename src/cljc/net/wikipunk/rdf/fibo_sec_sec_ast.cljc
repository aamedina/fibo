(ns net.wikipunk.rdf.fibo-sec-sec-ast
  {:cmns-av/copyright #{"Copyright (c) 2016-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecurityAssets/",
   :dcterms/abstract
   "This ontology defines basic concepts such as portfolio, security holding and holder, and extends the notion of a financial asset to include an acquisition price.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
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
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/AccountingEquity/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/OwnershipAndControl/OwnershipParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecurityAssets/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-sec-ast",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets/",
   :rdfs/label "Security Assets Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets.rdf version of this ontology was revised to fix spelling errors."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets.rdf version of this ontology was revised to eliminate duplication with concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets.rdf version of this ontology was revised to simplify the contract party hierarchy and eliminate complexity introduced by 'security holding'."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets.rdf version of this ontology was revised to address text formatting hygiene issues."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets/"})

(def Portfolio
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "http://www.investopedia.com/terms/p/portfolio.asp"},
   :db/ident :fibo-sec-sec-ast/Portfolio,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets/"},
   :rdfs/label "portfolio",
   :rdfs/subClassOf
   #{:cmns-col/Collection
     {:owl/allValuesFrom {:owl/unionOf
                          [:fibo-be-oac-opty/Investor
                           :fibo-fbc-pas-fpas/FinancialServiceProvider],
                          :rdf/type :owl/Class},
      :owl/onProperty    :fibo-fnd-rel-rel/isHeldBy,
      :rdf/type          :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-rel-rel/isManagedBy,
      :owl/someValuesFrom {:owl/unionOf
                           [:fibo-be-oac-opty/Investor
                            :fibo-fbc-pas-fpas/FinancialServiceProvider],
                           :rdf/type :owl/Class},
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom :fibo-sec-sec-ast/PortfolioHolding,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "a collection of investments (financial assets) such as stocks, bonds and cash equivalents, as well as mutual funds"})

(def PortfolioHolding
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "http://www.investopedia.com/terms/h/holdings.asp"},
   :cmns-av/explanatoryNote
   "Portfolio holdings may cover a variety of investment products, including stocks, bonds and mutual funds to options, futures and exchange-traded funds, and relatively esoteric instruments such as private equity and hedge funds. \n\nThe number and nature of holdings contribute to the degree of diversification of a portfolio. A mix of stocks across different sectors, bonds of different maturities, and other investments would suggest a well-diversified portfolio, while concentrated holdings in a handful of stocks within a single sector indicates a portfolio with limited diversification.",
   :db/ident :fibo-sec-sec-ast/PortfolioHolding,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets/"},
   :rdfs/label "portfolio holding",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-col/isPartOf,
      :owl/someValuesFrom :fibo-sec-sec-ast/Portfolio,
      :rdf/type           :owl/Restriction} :fibo-fnd-acc-aeq/FinancialAsset
     {:owl/allValuesFrom {:owl/unionOf
                          [:fibo-be-oac-opty/Investor
                           :fibo-fbc-pas-fpas/FinancialServiceProvider],
                          :rdf/type :owl/Class},
      :owl/onProperty    :fibo-fnd-rel-rel/isHeldBy,
      :rdf/type          :owl/Restriction}},
   :skos/definition
   "the contents of holding of one or more portfolios of investments held by an individual investor or entity"})

(def hasAcquisitionPrice
  {:db/ident :fibo-sec-sec-ast/hasAcquisitionPrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets/"},
   :rdfs/label "has acquisition price",
   :rdfs/range :fibo-fnd-acc-cur/Price,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasPrice,
   :skos/definition
   "has a value as of the date of acquisition, expressed as an amount of money or goods"})

(def urn:uuid:28d117c4-9b2c-599a-be55-a0ece714ec7d
  {:cmns-av/copyright #{"Copyright (c) 2016-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines basic concepts such as portfolio, security holding and holder, and extends the notion of a financial asset to include an acquisition price.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/AccountingEquity/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/OwnershipAndControl/OwnershipParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecurityAssets/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Security Assets Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets.rdf version of this ontology was revised to fix spelling errors."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets.rdf version of this ontology was revised to eliminate duplication with concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets.rdf version of this ontology was revised to simplify the contract party hierarchy and eliminate complexity introduced by 'security holding'."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets.rdf version of this ontology was revised to address text formatting hygiene issues."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets/"})