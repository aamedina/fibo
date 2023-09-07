(ns net.wikipunk.rdf.fibo-sec-sec-id
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
     "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
     "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
     "cmns-cxtid" "https://www.omg.org/spec/Commons/ContextualIdentifiers/",
     "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
     "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-fbc-fct-mkt"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
     "fibo-fbc-fct-ra"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
     "fibo-fbc-fi-fi"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
     "fibo-fnd-arr-id"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/",
     "fibo-fnd-plc-loc"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
     "fibo-fnd-rel-rel"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "fibo-sec-sec-id"
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/",
     "fibo-sec-sec-lst"
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/",
     "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "skos" "http://www.w3.org/2004/02/skos/core#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-sec-sec-id",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/"}
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines concepts required to identify securities, including a number of well-known securities identifiers and related schemes, registries, and registration authorities.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/IdentifiersAndIndices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegulatoryAgencies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualIdentifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/Markets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/FunctionalEntities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIdentification/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Securities Identification Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/ version of this ontology was modified to correct several logic issues."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/ version of this ontology was modified to add the concept of a ticker symbol and rename (migrate) the hasDefinition property to isDefinedIn to clarify intent."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/ version of this ontology was modified to restructure the concept of a listing and augment it with a number of relevant characteristics."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/ version of this ontology was modified to correct the target of a ticker symbol, which identifies a listing not a listed security, refine the restriction on financial instrument identifier to say that it identifies an instrument or listing, normalize definitions to be ISO 704 compliant, eliminate duplication of concepts in LCC, and merge countries with locations in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification.rdf version of this ontology was revised to leverage the notion of a composite identifier and address text formatting hygiene issues."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20180801/Securities/SecuritiesIdentification.rdf version of this ontology was modified to use the hasCoverageArea property rather than hasJurisdiction for coverage of national numbering agencies, and eliminate redundant subclass relationships for two of the schemes defined herein."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/ version of this ontology was modified to make a ticker symbol reassignable and address circular or ambiguous definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification.rdf version of this ontology was revised to eliminate confusion between listed security and listing (which caused reasoning issues)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/"})

(def FinancialInstrumentIdentificationScheme
  {:db/ident :fibo-sec-sec-id/FinancialInstrumentIdentificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/"},
   :rdfs/label "financial instrument identification scheme",
   :rdfs/subClassOf #{:cmns-id/IdentificationScheme
                      {:owl/onProperty :cmns-col/hasMember,
                       :owl/someValuesFrom
                       :fibo-fbc-fi-fi/FinancialInstrumentIdentifier,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "formal definition of the structure and application of a particular set of financial instrument identifiers"})

(def InternationalSecuritiesIdentificationNumber
  {:cmns-av/abbreviation "ISIN",
   :cmns-av/explanatoryNote
   "ISINs consist of two alphabetic characters, which are the ISO 3166-1 alpha-2 code for the issuing country, nine alpha-numeric characters (the National Securities Identifying Number, or NSIN, which identifies the security, padded as necessary with leading zeros), and one numerical check digit. The ISIN is specified as a class of identifiers because although there is a scheme associated with the structure of an ISIN, there are many country-specific variations issued by national numbering agencies.",
   :db/ident :fibo-sec-sec-id/InternationalSecuritiesIdentificationNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/"},
   :rdfs/label "international securities identification number",
   :rdfs/seeAlso {:xsd/anyURI
                  "http://www.iso.org/iso/catalogue_detail?csnumber=44811"},
   :rdfs/subClassOf
   #{:cmns-cxtid/StructuredIdentifier
     {:owl/onClass    :lcc-cr/Alpha2Code,
      :owl/onProperty :cmns-col/comprises,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction} :fibo-sec-sec-id/SecurityIdentifier
     {:owl/onClass    :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumber,
      :owl/onProperty :cmns-col/comprises,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "security identifier that is defined as specified in ISO 6166, Securities and related financial instruments -- International securities identification numbering system (ISIN)"})

(def InternationalSecuritiesIdentificationNumberingScheme
  {:cmns-av/abbreviation "ISIN scheme",
   :db/ident
   :fibo-sec-sec-id/InternationalSecuritiesIdentificationNumberingScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/"},
   :rdfs/label "international securities identification numbering scheme",
   :rdfs/seeAlso {:xsd/anyURI
                  "http://www.iso.org/iso/catalogue_detail?csnumber=44811"},
   :rdfs/subClassOf
   #{:fibo-sec-sec-id/SecurityIdentificationScheme
     {:owl/onProperty :cmns-dsg/defines,
      :owl/someValuesFrom
      :fibo-sec-sec-id/InternationalSecuritiesIdentificationNumber,
      :rdf/type :owl/Restriction}},
   :skos/definition
   "formal definition of the structure and application of a ISINs as defined in ISO 6166"})

(def ListedSecurityIdentifier
  {:db/ident :fibo-sec-sec-id/ListedSecurityIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/"},
   :rdfs/label "listed security identifier",
   :rdfs/subClassOf #{:fibo-sec-sec-id/SecurityIdentifier
                      {:owl/onProperty :cmns-dsg/isDefinedIn,
                       :owl/someValuesFrom
                       :fibo-sec-sec-id/SecurityIdentificationScheme,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty     :fibo-fbc-fct-ra/isRegisteredBy,
                       :owl/someValuesFrom :fibo-fbc-fct-mkt/Exchange,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fbc-fct-ra/isRegisteredIn,
                       :owl/someValuesFrom :fibo-sec-sec-id/SecurityRegistry,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-id/identifies,
                       :owl/someValuesFrom :fibo-sec-sec-lst/ListedSecurity,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "security identifier issued in the public domain and referred to in listings and other relevant publications"})

(def NationalNumberingAgency
  {:cmns-av/abbreviation "NNA",
   :db/ident :fibo-sec-sec-id/NationalNumberingAgency,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/"},
   :rdfs/label "national numbering agency",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-rel-rel/issues,
      :owl/someValuesFrom :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumber,
      :rdf/type           :owl/Restriction}
     :fibo-fbc-fct-ra/RegistrationAuthority
     {:owl/onProperty     :fibo-fnd-plc-loc/hasCoverageArea,
      :owl/someValuesFrom :lcc-cr/GeopoliticalEntity,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fbc-fct-ra/registers,
      :owl/someValuesFrom :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumber,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty :fibo-fnd-rel-rel/manages,
      :owl/someValuesFrom
      :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumberRegistry,
      :rdf/type :owl/Restriction}},
   :skos/definition
   "registration authority responsible for issuing and managing National Securities Identifying Numbers for securities in accordance with the ISO 6166 standard in some jurisdiction (typically that of a country)"})

(def NationalSecuritiesIdentifyingNumber
  {:cmns-av/abbreviation "NSIN",
   :db/ident :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/"},
   :rdfs/label "National Securities Identifying Number",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-dsg/isDefinedIn,
      :owl/someValuesFrom :fibo-sec-sec-id/NationalSecurityIdentificationScheme,
      :rdf/type           :owl/Restriction} :fibo-sec-sec-id/SecurityIdentifier
     {:owl/onProperty     :fibo-fbc-fct-ra/isRegisteredBy,
      :owl/someValuesFrom :fibo-sec-sec-id/NationalNumberingAgency,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "generic, nine-digit alpha numeric code which identifies a fungible security, assigned by a national numbering agency under the ISO 6166 standard"})

(def NationalSecuritiesIdentifyingNumberRegistry
  {:cmns-av/abbreviation "NSIN registry",
   :db/ident :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumberRegistry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/"},
   :rdfs/label "National Securities Identifying Number registry",
   :rdfs/subClassOf
   #{:fibo-sec-sec-id/SecurityRegistry
     {:owl/onClass    :fibo-sec-sec-id/NationalSecurityIdentificationScheme,
      :owl/onProperty :cmns-cls/isCharacterizedBy,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-rel-rel/isManagedBy,
      :owl/someValuesFrom :fibo-sec-sec-id/NationalNumberingAgency,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty :fibo-fbc-fct-ra/hasRegistryEntry,
      :owl/someValuesFrom
      :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumberRegistryEntry,
      :rdf/type :owl/Restriction}},
   :skos/definition
   "registry used by a national numbering agency to manage the financial instrument identifiers and related information that it registers"})

(def NationalSecuritiesIdentifyingNumberRegistryEntry
  {:db/ident :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumberRegistryEntry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/"},
   :rdfs/label "national numbering agency registry entry",
   :rdfs/subClassOf #{{:owl/onProperty :cmns-col/comprises,
                       :owl/someValuesFrom
                       :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumber,
                       :rdf/type :owl/Restriction}
                      :fibo-sec-sec-id/SecurityRegistryEntry},
   :skos/definition
   "entry in a National Securities Identifying Number registry"})

(def NationalSecurityIdentificationScheme
  {:cmns-av/explanatoryNote
   "generally incorporated into the ISIN scheme as well",
   :db/ident :fibo-sec-sec-id/NationalSecurityIdentificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/"},
   :rdfs/label "national security identification scheme",
   :rdfs/subClassOf #{:fibo-sec-sec-id/SecurityIdentificationScheme
                      {:owl/onProperty :cmns-dsg/defines,
                       :owl/someValuesFrom
                       :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumber,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                       :owl/someValuesFrom :lcc-cr/GeopoliticalEntity,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "security identification scheme, defining the format and structure of a National Securities Identifying Number (NSIN), published nationally on behalf of a country"})

(def ProprietarySecurityIdentificationScheme
  {:cmns-av/explanatoryNote
   "Proprietary schemes may be unique to an exchange or data provider, for example.",
   :db/ident :fibo-sec-sec-id/ProprietarySecurityIdentificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/"},
   :rdfs/label "proprietary security identification scheme",
   :rdfs/subClassOf #{:fibo-sec-sec-id/SecurityIdentificationScheme
                      {:owl/onProperty :cmns-dsg/defines,
                       :owl/someValuesFrom
                       :fibo-sec-sec-id/ProprietarySecurityIdentifier,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "security identification scheme published by a commercial entity"})

(def ProprietarySecurityIdentifier
  {:db/ident :fibo-sec-sec-id/ProprietarySecurityIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/"},
   :rdfs/label "proprietary security identifier",
   :rdfs/subClassOf #{:fibo-sec-sec-id/SecurityIdentifier
                      {:owl/onProperty :cmns-dsg/isDefinedIn,
                       :owl/someValuesFrom
                       :fibo-sec-sec-id/ProprietarySecurityIdentificationScheme,
                       :rdf/type :owl/Restriction}},
   :skos/definition "identifier supplied by a commercial entity"})

(def SecurityIdentificationScheme
  {:db/ident :fibo-sec-sec-id/SecurityIdentificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/"},
   :rdfs/label "security identification scheme",
   :rdfs/subClassOf #{:fibo-sec-sec-id/FinancialInstrumentIdentificationScheme
                      :fibo-fbc-fct-ra/RegistrationScheme
                      {:owl/onProperty     :cmns-dsg/defines,
                       :owl/someValuesFrom :fibo-sec-sec-id/SecurityIdentifier,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "formal definition of the structure and application of a particular set of securities identifiers"})

(def SecurityIdentifier
  {:db/ident :fibo-sec-sec-id/SecurityIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/"},
   :rdfs/label "security identifier",
   :rdfs/subClassOf #{{:owl/onProperty :cmns-dsg/isDefinedIn,
                       :owl/someValuesFrom
                       :fibo-sec-sec-id/SecurityIdentificationScheme,
                       :rdf/type :owl/Restriction}
                      :fibo-fbc-fi-fi/FinancialInstrumentIdentifier
                      {:owl/onProperty     :cmns-id/identifies,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "any publicly available identifier that is used to identify a security"})

(def SecurityRegistry
  {:cmns-av/explanatoryNote
   "Securities registries may be managed by an exchange, clearing house, custodian, bank, or other financial services provider.",
   :db/ident :fibo-sec-sec-id/SecurityRegistry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/"},
   :rdfs/label "security registry",
   :rdfs/subClassOf
   #{{:owl/onClass    :fibo-sec-sec-id/SecurityIdentificationScheme,
      :owl/onProperty :cmns-cls/isCharacterizedBy,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction} :fibo-fbc-fct-ra/Registry
     {:owl/onProperty     :fibo-fbc-fct-ra/hasRegistryEntry,
      :owl/someValuesFrom :fibo-sec-sec-id/SecurityRegistryEntry,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-rel-rel/isManagedBy,
      :owl/someValuesFrom :fibo-fbc-fct-ra/RegistrationAuthority,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "registry used to manage security identifiers and related information"})

(def SecurityRegistryEntry
  {:db/ident :fibo-sec-sec-id/SecurityRegistryEntry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/"},
   :rdfs/label "security registry entry",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-cxtdsg/appliesTo,
                       :owl/someValuesFrom :fibo-sec-sec-lst/RegisteredSecurity,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-col/comprises,
                       :owl/someValuesFrom :fibo-sec-sec-id/SecurityIdentifier,
                       :rdf/type           :owl/Restriction}
                      :fibo-fbc-fct-ra/RegistryEntry},
   :skos/definition "record for a security in a securities registry"})

(def TickerSymbol
  {:cmns-av/explanatoryNote
   "Every listed security has at least one unique ticker symbol, facilitating the vast array of trade orders that flow through the financial markets every day. However, in some countries this relationship may be indirect, through the listing, rather than direct, as is the case in the United States. In the US, the relationship between a ticker symbol and the listed security is one-to-one. This is not, however, the case in Singapore, where there may be unique ticker symbols for the same security based on the lot size.",
   :cmns-av/usageNote
   "Ticker symbols are reusable, assigned to a given instrument by an exchange for some period of time.",
   :db/ident :fibo-sec-sec-id/TickerSymbol,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/"},
   :rdfs/label "ticker symbol",
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.investopedia.com/terms/t/tickersymbol.asp"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-id/identifies,
                       :owl/someValuesFrom {:owl/unionOf
                                            [:fibo-sec-sec-lst/ListedSecurity
                                             :fibo-sec-sec-lst/Listing],
                                            :rdf/type :owl/Class},
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-arr-id/ReassignableIdentifier},
   :skos/definition
   "exchange-specific identifier for a particular security or listing for that security, depending on the country"})

(def urn:uuid:f51da83a-ae6c-5119-86ee-38471359d474
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines concepts required to identify securities, including a number of well-known securities identifiers and related schemes, registries, and registration authorities.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/IdentifiersAndIndices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegulatoryAgencies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualIdentifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/Markets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/FunctionalEntities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIdentification/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Securities Identification Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/ version of this ontology was modified to correct several logic issues."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/ version of this ontology was modified to add the concept of a ticker symbol and rename (migrate) the hasDefinition property to isDefinedIn to clarify intent."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/ version of this ontology was modified to restructure the concept of a listing and augment it with a number of relevant characteristics."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/ version of this ontology was modified to correct the target of a ticker symbol, which identifies a listing not a listed security, refine the restriction on financial instrument identifier to say that it identifies an instrument or listing, normalize definitions to be ISO 704 compliant, eliminate duplication of concepts in LCC, and merge countries with locations in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification.rdf version of this ontology was revised to leverage the notion of a composite identifier and address text formatting hygiene issues."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20180801/Securities/SecuritiesIdentification.rdf version of this ontology was modified to use the hasCoverageArea property rather than hasJurisdiction for coverage of national numbering agencies, and eliminate redundant subclass relationships for two of the schemes defined herein."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/ version of this ontology was modified to make a ticker symbol reassignable and address circular or ambiguous definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification.rdf version of this ontology was revised to eliminate confusion between listed security and listing (which caused reasoning issues)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/"})