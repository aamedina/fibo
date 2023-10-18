(ns net.wikipunk.rdf.fibo-sec-sec-pls
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/Pools/",
   :dcterms/abstract
   "This ontology defines concepts related to high-level securities pools.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-fbc-fct-fse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-acc-aeq"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-oac-own"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-sec-pls"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/",
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
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LegalPersons/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/Pools/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-sec-pls",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/",
   :rdfs/label "Securities Pools Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/ version of this ontology was modified to eliminate duplication with concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/ version of this ontology was modified to correct a logical inconsistency with respect to the representation of baskets."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/ version of this ontology was modified to replace equity with owners equity in the definition of pool equity."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/ version of this ontology was modified to deprecate the concept of 'pool equity' which was not used elsewhere and was poorly defined and eliminate an improper restriction on managed investment."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/ version of this ontology was modified to eliminate the deprecated concept for pool equity."
     "The https://spec.edmcouncil.org/fibo/ontology/Securities/Pools.rdf version of this ontology was modified to move the definition of SpecialPurposeVehicle to this ontology to make it available for use more generally and augment the definition of an instrument pool with ownership."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/"})

(def DebtPool
  {:db/ident :fibo-sec-sec-pls/DebtPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/"},
   :rdfs/label "debt pool",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-col/hasConstituent,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/DebtInstrument,
                       :rdf/type           :owl/Restriction}
                      :fibo-sec-sec-pls/InstrumentPool},
   :skos/definition
   "a pool consisting of debt instruments, such as bonds, loans or mortgages"})

(def FundFamily
  {:db/ident :fibo-sec-sec-pls/FundFamily,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/"},
   :rdfs/label "fund family",
   :rdfs/subClassOf #{:cmns-col/Collection
                      {:owl/onClass    :fibo-fbc-fct-fse/FinancialInstitution,
                       :owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :cmns-col/hasConstituent,
                       :owl/someValuesFrom :fibo-sec-sec-pls/ManagedInvestment,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "a collection of managed investments that are all managed by a single investment institution"})

(def InstrumentPool
  {:db/ident :fibo-sec-sec-pls/InstrumentPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/"},
   :rdfs/label "instrument pool",
   :rdfs/subClassOf #{:fibo-sec-sec-pls/Pool
                      {:owl/onProperty     :cmns-col/hasConstituent,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/FinancialInstrument,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "pool consisting of financial instruments that may be included in the same investment vehicle"})

(def InstrumentPoolAsAsset
  {:db/ident :fibo-sec-sec-pls/InstrumentPoolAsAsset,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/"},
   :rdfs/label "instrument pool as asset",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
      :owl/someValuesFrom :fibo-sec-sec-pls/InstrumentPool,
      :rdf/type           :owl/Restriction} :fibo-fnd-acc-aeq/FinancialAsset
     {:owl/onProperty     :fibo-fnd-oac-own/isAssetOf,
      :owl/someValuesFrom {:owl/unionOf [:fibo-fbc-fct-fse/FinancialInstitution
                                         {:owl/onProperty
                                          :fibo-fnd-pty-rl/isPlayedBy,
                                          :owl/someValuesFrom
                                          :fibo-be-le-lp/SpecialPurposeVehicle,
                                          :rdf/type :owl/Restriction}],
                           :rdf/type    :owl/Class},
      :rdf/type           :owl/Restriction}},
   :skos/definition "financial asset in the form of an instrument pool"})

(def ManagedInvestment
  {:cmns-av/adaptedFrom {:rdf/value "Bloomberg LP"},
   :db/ident :fibo-sec-sec-pls/ManagedInvestment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/"},
   :rdfs/label "managed investment",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-rel-rel/isManagedBy,
      :owl/someValuesFrom :fibo-fbc-fct-fse/FinancialInstitution,
      :rdf/type           :owl/Restriction} :fibo-sec-sec-pls/PooledFund},
   :skos/definition
   "investment pool that is controlled by a professional investment manager who invests the pool in various financial instruments and assets that align with their investment objectives and is overseen by a board of directors"})

(def Pool
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Barron's Dictionary of Finance and Investment Terms, Ninth Edition, 2014"},
   :db/ident :fibo-sec-sec-pls/Pool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/"},
   :rdfs/label "pool",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-col/hasConstituent,
                       :owl/someValuesFrom :fibo-sec-sec-pls/PoolConstituent,
                       :rdf/type           :owl/Restriction}
                      :cmns-col/Collection},
   :skos/definition
   "a combination of resources for a common purpose or benefit"})

(def PoolConstituent
  {:cmns-av/explanatoryNote
   "The pool may be a pool of almost anything, brought together for some purpose. It differs from a less formal collection in that there are facts defined about the constituents and the proportions of these in the pool. Modeling note: A constituent of a pool may have facts which vary over time (such as balances) but the basic nature of the thing as a member of the pool remains the same, along with some facts which vary over time but which have a value as of the time they become members of the pool.",
   :db/ident :fibo-sec-sec-pls/PoolConstituent,
   :owl/equivalentClass {:owl/onProperty     :cmns-col/isConstituentOf,
                         :owl/someValuesFrom :fibo-sec-sec-pls/Pool,
                         :rdf/type           :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/"},
   :rdfs/label "pool constituent",
   :rdfs/subClassOf :cmns-col/Constituent,
   :skos/definition "component of a pool"})

(def PooledFund
  {:db/ident :fibo-sec-sec-pls/PooledFund,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/"},
   :rdfs/label "pooled fund",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-col/hasConstituent,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/AmountOfMoney,
                       :rdf/type           :owl/Restriction}
                      :fibo-sec-sec-pls/Pool},
   :skos/definition
   "a pool of funds that a group of investors combines for common benefit",
   :skos/example
   "An investment club pools the funds of its members, giving them the opportunity to share in a portfolio offering greater diversification and the hope of a better return on their money than they could get individually."})

(def SecuritiesPool
  {:db/ident :fibo-sec-sec-pls/SecuritiesPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/"},
   :rdfs/label "securities pool",
   :rdfs/subClassOf #{:fibo-sec-sec-pls/InstrumentPool
                      {:owl/onProperty :cmns-col/hasConstituent,
                       :owl/someValuesFrom
                       :fibo-sec-sec-pls/SecuritiesPoolConstituent,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "a pool of securities organized for the purpose of issuing notes against those securities"})

(def SecuritiesPoolConstituent
  {:cmns-av/explanatoryNote
   "This is a pool of any kind of security, and not therefore necessarily a pool of debt, though usually it is debt securities which are pooled.",
   :db/ident :fibo-sec-sec-pls/SecuritiesPoolConstituent,
   :owl/equivalentClass {:owl/onProperty     :cmns-col/isConstituentOf,
                         :owl/someValuesFrom :fibo-sec-sec-pls/SecuritiesPool,
                         :rdf/type           :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/"},
   :rdfs/label "securities pool constituent",
   :rdfs/subClassOf #{:fibo-fbc-fi-fi/Security
                      :fibo-sec-sec-pls/PoolConstituent},
   :skos/definition "security that is included in a securities pool"})

(def urn:uuid:e8adb035-f51b-5d66-945f-50cb316d7c1d
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines concepts related to high-level securities pools.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/AccountingEquity/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LegalPersons/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/Pools/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Securities Pools Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/ version of this ontology was modified to eliminate duplication with concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/ version of this ontology was modified to correct a logical inconsistency with respect to the representation of baskets."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/ version of this ontology was modified to replace equity with owners equity in the definition of pool equity."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/ version of this ontology was modified to deprecate the concept of 'pool equity' which was not used elsewhere and was poorly defined and eliminate an improper restriction on managed investment."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/ version of this ontology was modified to eliminate the deprecated concept for pool equity."
     "The https://spec.edmcouncil.org/fibo/ontology/Securities/Pools.rdf version of this ontology was modified to move the definition of SpecialPurposeVehicle to this ontology to make it available for use more generally and augment the definition of an instrument pool with ownership."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/"})