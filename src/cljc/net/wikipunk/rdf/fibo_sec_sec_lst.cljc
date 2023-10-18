(ns net.wikipunk.rdf.fibo-sec-sec-lst
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesListings/",
   :dcterms/abstract
   "This ontology defines the fundamental concepts for listing securities, such as registered, listed, and exchange-traded security, the notion of a securities exchange, and related services.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-fct-breg"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
    "fibo-fbc-fct-mkt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
    "fibo-fbc-fct-ra"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fbc-fi-ip"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-pas-pas"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-sec-iss"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/",
    "fibo-sec-sec-lst"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/Markets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/BusinessRegistries/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/InstrumentPricing/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/VirtualPlaces/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/Facilities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesListings/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-sec-lst",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/",
   :rdfs/label "Securities Listings Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings.rdf version of this ontology was modified to normalize the representation of security forms (all individuals rather than a mixed representation)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings.rdf version of this ontology was revised to eliminate an extraneous subclass axiom."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings.rdf version of this ontology was revised to eliminate confusion between listed security and listing (which caused reasoning issues), adjust definitions to eliminate ambiguity, add a property for lot size on listing, and eliminate the now redundant and confusing registered security form class."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings.rdf version of this ontology was revised to eliminate duplication of concepts in LCC and to eliminate the redundancy between hasIssue and lists."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings.rdf version of this ontology was revised to incorporate the form of registration and loosen the restriction on the number of possible registration authorities for a registered security."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings.rdf version of this ontology was revised to eliminate an unused ontology import, changed the range of hasLotSize to xsd:decimal, and modified the definition of listing to point to an offering rather than directly to the instrument that the offering pertains to."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings.rdf version of this ontology was revised to rename isIssuedIn to isIssuedOn, which is more natural to most securities SMEs, generalized certain references to securities exchanges, and eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings.rdf version of this ontology was revised to reuse the composite date value datatype and add disjointness between registered security and exempt security."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings.rdf version of this ontology was revised to restructure the concept of a listing and augment it with a number of relevant characteristics."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings.rdf version of this ontology was revised to eliminate a false positive hygiene testing issue due to a concept whose name included 'and' but that actually was a singular concept."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/"})

(def ListedSecurity
  {:cmns-av/synonym "exchange-traded security",
   :cmns-av/usageNote
   "One can, as appropriate, multiply classify a share as being a common share and listed share, and, in the case whereby multiple securities are issued in different currencies (i.e., there are multiple listed shares corresponding to a given common share that have different identifiers, including more than one ISIN, CUSIP, share class FIGI), multiply classify the listed share individuals as individuals of the same common share.",
   :db/ident :fibo-sec-sec-lst/ListedSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/"},
   :rdfs/label "listed security",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-sec-sec-lst/isListedVia,
      :owl/someValuesFrom :fibo-sec-sec-lst/Listing,
      :rdf/type           :owl/Restriction}
     {:owl/onClass    :fibo-fbc-fct-mkt/Exchange,
      :owl/onProperty :fibo-sec-sec-lst/hasHomeExchange,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction} :fibo-sec-sec-lst/RegisteredSecurity
     {:owl/onClass    :fibo-fbc-fct-mkt/Exchange,
      :owl/onProperty :fibo-sec-sec-lst/hasOriginalPlaceOfListing,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}},
   :skos/definition "registered security listed on at least one exchange"})

(def Listing
  {:cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "market listing"},
   :db/ident :fibo-sec-sec-lst/Listing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "listing"},
   :rdfs/subClassOf #{{:owl/maxQualifiedCardinality 1,
                       :owl/onClass    :fibo-fbc-fct-breg/RegistrationStatus,
                       :owl/onProperty :fibo-fbc-fct-breg/hasRegistrationStatus,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                       :owl/onProperty :fibo-sec-sec-lst/hasTickSize,
                       :rdf/type       :owl/Restriction}
                      {:owl/onDataRange :cmns-dt/CombinedDateTime,
                       :owl/onProperty  :fibo-sec-sec-lst/hasListingDate,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-dt/DateTime,
                       :owl/onProperty :fibo-sec-sec-lst/hasLastTradingDateTime,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onDataRange :xsd/decimal,
                       :owl/onProperty  :fibo-fbc-fi-ip/hasLotSize,
                       :rdf/type        :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-acc-cur/hasCurrency,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/Currency,
                       :rdf/type           :owl/Restriction}
                      {:owl/onClass    :fibo-sec-sec-iss/SecuritiesOffering,
                       :owl/onProperty :fibo-sec-sec-lst/lists,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onDataRange :cmns-dt/CombinedDateTime,
                       :owl/onProperty  :fibo-sec-sec-lst/hasDelistingDate,
                       :rdf/type        :owl/Restriction}},
   :skos/definition
   "catalog entry for a securities offering managed by an exchange that provides the terms under which that security is made available on that exchange"})

(def ListingService
  {:db/ident :fibo-sec-sec-lst/ListingService,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/"},
   :rdfs/label "listing service",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-sec-sec-lst/Listing,
                       :owl/onProperty :fibo-fnd-rel-rel/provides,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fbc-fct-mkt/Exchange,
                       :owl/onProperty :fibo-fnd-rel-rel/isProvidedBy,
                       :rdf/type       :owl/Restriction}
                      :fibo-fbc-pas-fpas/FinancialService
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fbc-fct-mkt/Exchange,
                       :owl/onProperty :fibo-fnd-pas-pas/isProvisionedBy,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "service provided by an exchange to facilitate securities trading"})

(def RegisteredSecurity
  {:db/ident :fibo-sec-sec-lst/RegisteredSecurity,
   :owl/disjointWith :fibo-fbc-fi-fi/ExemptSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/"},
   :rdfs/label "registered security",
   :rdfs/subClassOf
   #{:fibo-fbc-fi-fi/Security
     {:owl/onProperty     :fibo-sec-sec-iss/isIssuedInForm,
      :owl/someValuesFrom {:owl/oneOf [:fibo-sec-sec-iss/BearerAndRegisteredForm
                                       :fibo-sec-sec-iss/BookEntryForm
                                       :fibo-sec-sec-iss/RegisteredForm],
                           :rdf/type  :owl/Class},
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-sec-sec-iss/isRegisteredWith,
      :owl/someValuesFrom :fibo-fbc-fct-ra/RegistrationAuthority,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fbc-fct-ra/hasRegistrationDate,
      :owl/someValuesFrom :cmns-dt/CombinedDateTime,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "security that is registered with some registration authority"})

(def hasDelistingDate
  {:db/ident :fibo-sec-sec-lst/hasDelistingDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/"},
   :rdfs/label "has delisting date",
   :rdfs/range :cmns-dt/CombinedDateTime,
   :skos/definition
   "specifies the date set by the exchange for delisting a security"})

(def hasHomeExchange
  {:cmns-av/explanatoryNote
   "A primary market is one that issues new securities on an exchange for companies, governments, and other groups to obtain financing through debt-based or equity-based securities.",
   :cmns-av/synonym #{"has primary trading market" "has primary market"},
   :db/ident :fibo-sec-sec-lst/hasHomeExchange,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/"},
   :rdfs/label "has home exchange",
   :rdfs/range :fibo-fbc-fct-mkt/Exchange,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/isProvidedBy,
   :skos/definition
   "indicates the exchange that is considered the primary market for a security; typically, but not always, in the country in which the security was originally issued",
   :skos/example
   "A security may have been originally listed on the Frankfurt exchange, but its current home is the London Stock Exchange, for example."})

(def hasLastTradingDateTime
  {:db/ident :fibo-sec-sec-lst/hasLastTradingDateTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-sec-lst/Listing,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/"},
   :rdfs/label "has last trading date and time",
   :rdfs/range :cmns-dt/DateTime,
   :rdfs/subPropertyOf :cmns-dt/hasDateTime,
   :skos/definition
   "specifies the last date and time that the security was traded on the exchange"})

(def hasListingDate
  {:db/ident :fibo-sec-sec-lst/hasListingDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/"},
   :rdfs/label "has listing date",
   :rdfs/range :cmns-dt/CombinedDateTime,
   :skos/definition "indicates the date on which a security is listed"})

(def hasOriginalPlaceOfListing
  {:db/ident :fibo-sec-sec-lst/hasOriginalPlaceOfListing,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/"},
   :rdfs/label "has original place of listing",
   :rdfs/range :fibo-fbc-fct-mkt/Exchange,
   :skos/definition "indicates the original exchange that listed the security"})

(def hasTickSize
  {:db/ident :fibo-sec-sec-lst/hasTickSize,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-sec-lst/Listing,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has tick size"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "specifies a minimum price movement for the security with respect to an exchange"}})

(def isListedVia
  {:db/ident :fibo-sec-sec-lst/isListedVia,
   :owl/inverseOf :fibo-sec-sec-lst/lists,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-sec-lst/ListedSecurity,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/"},
   :rdfs/label "is listed via",
   :rdfs/range :fibo-sec-sec-lst/Listing,
   :skos/definition
   "identifies the service responsible for listing the security"})

(def isSeasoned
  {:cmns-av/explanatoryNote
   "Short-term volatility may be with respect to price or trading volume.",
   :db/ident :fibo-sec-sec-lst/isSeasoned,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-sec-lst/ListedSecurity,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/"},
   :rdfs/label "is seasoned",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates that the security has been publicly traded long enough to eliminate any short-term volume volatility from its initial public offering"})

(def isTradedOn
  {:db/ident :fibo-sec-sec-lst/isTradedOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-sec-lst/ListedSecurity,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/"},
   :rdfs/label "is traded on",
   :rdfs/range :fibo-fbc-fct-mkt/Exchange,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/isProvidedBy,
   :skos/definition
   "identifies the trading facility on which the security is traded"})

(def lists
  {:db/ident :fibo-sec-sec-lst/lists,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-sec-lst/Listing,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/"},
   :rdfs/label "lists",
   :rdfs/range :fibo-sec-sec-lst/ListedSecurity,
   :skos/definition
   "relates a given exchange-specific security listing to its issue"})

(def urn:uuid:a0e00cc4-f486-59a1-a6d1-2ea5473f1276
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines the fundamental concepts for listing securities, such as registered, listed, and exchange-traded security, the notion of a securities exchange, and related services.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/Markets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/BusinessRegistries/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/InstrumentPricing/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/VirtualPlaces/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/Facilities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesListings/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Securities Listings Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings.rdf version of this ontology was modified to normalize the representation of security forms (all individuals rather than a mixed representation)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings.rdf version of this ontology was revised to eliminate an extraneous subclass axiom."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings.rdf version of this ontology was revised to eliminate confusion between listed security and listing (which caused reasoning issues), adjust definitions to eliminate ambiguity, add a property for lot size on listing, and eliminate the now redundant and confusing registered security form class."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings.rdf version of this ontology was revised to eliminate duplication of concepts in LCC and to eliminate the redundancy between hasIssue and lists."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings.rdf version of this ontology was revised to incorporate the form of registration and loosen the restriction on the number of possible registration authorities for a registered security."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings.rdf version of this ontology was revised to eliminate an unused ontology import, changed the range of hasLotSize to xsd:decimal, and modified the definition of listing to point to an offering rather than directly to the instrument that the offering pertains to."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings.rdf version of this ontology was revised to rename isIssuedIn to isIssuedOn, which is more natural to most securities SMEs, generalized certain references to securities exchanges, and eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings.rdf version of this ontology was revised to reuse the composite date value datatype and add disjointness between registered security and exempt security."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings.rdf version of this ontology was revised to restructure the concept of a listing and augment it with a number of relevant characteristics."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings.rdf version of this ontology was revised to eliminate a false positive hygiene testing issue due to a concept whose name included 'and' but that actually was a singular concept."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/"})