(ns net.wikipunk.rdf.fibo-sec-sec-id
  "This ontology defines concepts required to identify securities, including a number of well-known securities identifiers and related schemes, registries, and registration authorities."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 Object Management Group, Inc."
                       "Copyright (c) 2016-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/",
   :dcterms/abstract
   "This ontology defines concepts required to identify securities, including a number of well-known securities identifiers and related schemes, registries, and registration authorities.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/IdentifiersAndIndices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegulatoryAgencies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/Markets/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesListings/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/FunctionalEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Arrangements/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIdentification/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
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
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-sec-id",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/",
   :rdfs/label "Securities Identification Ontology",
   :skos/changeNote
   ["The http://www.omg.org/spec/EDMC-FIBO/FND/20180801/Securities/SecuritiesIdentification.rdf version of this ontology was modified to use the hasCoverageArea property rather than hasJurisdiction for coverage of national numbering agencies, and eliminate redundant subclass relationships for two of the schemes defined herein."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/ version of this ontology was modified to make a ticker symbol reassignable and address circular or ambiguous definitions."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification.rdf version of this ontology was revised to eliminate confusion between listed security and listing (which caused reasoning issues)."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/ version of this ontology was modified to restructure the concept of a listing and augment it with a number of relevant characteristics."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/ version of this ontology was modified to add the concept of a ticker symbol and rename (migrate) the hasDefinition property to isDefinedIn to clarify intent."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/ version of this ontology was modified to correct the target of a ticker symbol, which identifies a listing not a listed security, refine the restriction on financial instrument identifier to say that it identifies an instrument or listing, normalize definitions to be ISO 704 compliant, eliminate duplication of concepts in LCC, and merge countries with locations in FND."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/ version of this ontology was modified to correct several logic issues."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification.rdf version of this ontology was revised to leverage the notion of a composite identifier and address text formatting hygiene issues."]})

(def FinancialInstrumentIdentificationScheme
  "formal definition of the structure and application of a particular set of financial instrument identifiers"
  {:db/ident :fibo-sec-sec-id/FinancialInstrumentIdentificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/",
   :rdfs/label "financial instrument identification scheme",
   :rdfs/subClassOf [{:owl/onProperty :lcc-lr/hasMember,
                      :owl/someValuesFrom
                      :fibo-fbc-fi-fi/FinancialInstrumentIdentifier,
                      :rdf/type :owl/Restriction}
                     :lcc-lr/IdentificationScheme],
   :skos/definition
   "formal definition of the structure and application of a particular set of financial instrument identifiers"})

(def InternationalSecuritiesIdentificationNumber
  "security identifier that is defined as specified in ISO 6166, Securities and related financial instruments -- International securities identification numbering system (ISIN)"
  {:cmns-av/abbreviation "ISIN",
   :cmns-av/explanatoryNote
   "ISINs consist of two alphabetic characters, which are the ISO 3166-1 alpha-2 code for the issuing country, nine alpha-numeric characters (the National Securities Identifying Number, or NSIN, which identifies the security, padded as necessary with leading zeros), and one numerical check digit. The ISIN is specified as a class of identifiers because although there is a scheme associated with the structure of an ISIN, there are many country-specific variations issued by national numbering agencies.",
   :db/ident :fibo-sec-sec-id/InternationalSecuritiesIdentificationNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/",
   :rdfs/label "international securities identification number",
   :rdfs/seeAlso ["http://www.iso.org/iso/catalogue_detail?csnumber=44811"],
   :rdfs/subClassOf [{:owl/onClass
                      :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumber,
                      :owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-sec-id/SecurityIdentifier
                     {:owl/onClass    :lcc-cr/Alpha2Code,
                      :owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-arr-id/CompositeIdentifier],
   :skos/definition
   "security identifier that is defined as specified in ISO 6166, Securities and related financial instruments -- International securities identification numbering system (ISIN)"})

(def InternationalSecuritiesIdentificationNumberingScheme
  "formal definition of the structure and application of a ISINs as defined in ISO 6166"
  {:cmns-av/abbreviation "ISIN scheme",
   :db/ident
   :fibo-sec-sec-id/InternationalSecuritiesIdentificationNumberingScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/",
   :rdfs/label "international securities identification numbering scheme",
   :rdfs/seeAlso ["http://www.iso.org/iso/catalogue_detail?csnumber=44811"],
   :rdfs/subClassOf
   [{:owl/onProperty :fibo-fnd-rel-rel/defines,
     :owl/someValuesFrom
     :fibo-sec-sec-id/InternationalSecuritiesIdentificationNumber,
     :rdf/type :owl/Restriction}
    :fibo-sec-sec-id/SecurityIdentificationScheme],
   :skos/definition
   "formal definition of the structure and application of a ISINs as defined in ISO 6166"})

(def ListedSecurityIdentifier
  "security identifier issued in the public domain and referred to in listings and other relevant publications"
  {:db/ident :fibo-sec-sec-id/ListedSecurityIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/",
   :rdfs/label "listed security identifier",
   :rdfs/subClassOf [{:owl/onProperty     :lcc-lr/identifies,
                      :owl/someValuesFrom :fibo-sec-sec-lst/ListedSecurity,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-rel-rel/isDefinedIn,
                      :owl/someValuesFrom
                      :fibo-sec-sec-id/SecurityIdentificationScheme,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-ra/isRegisteredIn,
                      :owl/someValuesFrom :fibo-sec-sec-id/SecurityRegistry,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-ra/isRegisteredBy,
                      :owl/someValuesFrom :fibo-fbc-fct-mkt/Exchange,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-id/SecurityIdentifier],
   :skos/definition
   "security identifier issued in the public domain and referred to in listings and other relevant publications"})

(def NationalNumberingAgency
  "registration authority responsible for issuing and managing National Securities Identifying Numbers for securities in accordance with the ISO 6166 standard in some jurisdiction (typically that of a country)"
  {:cmns-av/abbreviation "NNA",
   :db/ident :fibo-sec-sec-id/NationalNumberingAgency,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/",
   :rdfs/label "national numbering agency",
   :rdfs/subClassOf
   [{:owl/onProperty :fibo-fnd-rel-rel/manages,
     :owl/someValuesFrom
     :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumberRegistry,
     :rdf/type :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fct-ra/registers,
     :owl/someValuesFrom :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumber,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-plc-loc/hasCoverageArea,
     :owl/someValuesFrom :lcc-cr/GeopoliticalEntity,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fct-ra/RegistrationAuthority
    {:owl/onProperty     :fibo-fnd-rel-rel/issues,
     :owl/someValuesFrom :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumber,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   "registration authority responsible for issuing and managing National Securities Identifying Numbers for securities in accordance with the ISO 6166 standard in some jurisdiction (typically that of a country)"})

(def NationalSecuritiesIdentifyingNumber
  "generic, nine-digit alpha numeric code which identifies a fungible security, assigned by a national numbering agency under the ISO 6166 standard"
  {:cmns-av/abbreviation "NSIN",
   :db/ident :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/",
   :rdfs/label "National Securities Identifying Number",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-rel-rel/isDefinedIn,
     :owl/someValuesFrom :fibo-sec-sec-id/NationalSecurityIdentificationScheme,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fct-ra/isRegisteredBy,
     :owl/someValuesFrom :fibo-sec-sec-id/NationalNumberingAgency,
     :rdf/type           :owl/Restriction}
    :fibo-sec-sec-id/SecurityIdentifier],
   :skos/definition
   "generic, nine-digit alpha numeric code which identifies a fungible security, assigned by a national numbering agency under the ISO 6166 standard"})

(def NationalSecuritiesIdentifyingNumberRegistry
  "registry used by a national numbering agency to manage the financial instrument identifiers and related information that it registers"
  {:cmns-av/abbreviation "NSIN registry",
   :db/ident :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumberRegistry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/",
   :rdfs/label "National Securities Identifying Number registry",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-rel-rel/isManagedBy,
     :owl/someValuesFrom :fibo-sec-sec-id/NationalNumberingAgency,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty :fibo-fbc-fct-ra/hasRegistryEntry,
     :owl/someValuesFrom
     :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumberRegistryEntry,
     :rdf/type :owl/Restriction}
    {:owl/onClass    :fibo-sec-sec-id/NationalSecurityIdentificationScheme,
     :owl/onProperty :fibo-fnd-rel-rel/isCharacterizedBy,
     :owl/qualifiedCardinality 1,
     :rdf/type       :owl/Restriction}
    :fibo-sec-sec-id/SecurityRegistry],
   :skos/definition
   "registry used by a national numbering agency to manage the financial instrument identifiers and related information that it registers"})

(def NationalSecuritiesIdentifyingNumberRegistryEntry
  "entry in a National Securities Identifying Number registry"
  {:db/ident :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumberRegistryEntry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/",
   :rdfs/label "national numbering agency registry entry",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :owl/someValuesFrom
                      :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumber,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-sec-id/SecurityRegistryEntry],
   :skos/definition
   "entry in a National Securities Identifying Number registry"})

(def NationalSecurityIdentificationScheme
  "security identification scheme, defining the format and structure of a National Securities Identifying Number (NSIN), published nationally on behalf of a country"
  {:cmns-av/explanatoryNote
   "generally incorporated into the ISIN scheme as well",
   :db/ident :fibo-sec-sec-id/NationalSecurityIdentificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/",
   :rdfs/label "national security identification scheme",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/defines,
                      :owl/someValuesFrom
                      :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumber,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/appliesTo,
                      :owl/someValuesFrom :lcc-cr/GeopoliticalEntity,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-id/SecurityIdentificationScheme],
   :skos/definition
   "security identification scheme, defining the format and structure of a National Securities Identifying Number (NSIN), published nationally on behalf of a country"})

(def ProprietarySecurityIdentificationScheme
  "security identification scheme published by a commercial entity"
  {:cmns-av/explanatoryNote
   "Proprietary schemes may be unique to an exchange or data provider, for example.",
   :db/ident :fibo-sec-sec-id/ProprietarySecurityIdentificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/",
   :rdfs/label "proprietary security identification scheme",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/defines,
                      :owl/someValuesFrom
                      :fibo-sec-sec-id/ProprietarySecurityIdentifier,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-sec-id/SecurityIdentificationScheme],
   :skos/definition
   "security identification scheme published by a commercial entity"})

(def ProprietarySecurityIdentifier
  "identifier supplied by a commercial entity"
  {:db/ident :fibo-sec-sec-id/ProprietarySecurityIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/",
   :rdfs/label "proprietary security identifier",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/isDefinedIn,
                      :owl/someValuesFrom
                      :fibo-sec-sec-id/ProprietarySecurityIdentificationScheme,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-sec-id/SecurityIdentifier],
   :skos/definition "identifier supplied by a commercial entity"})

(def SecurityIdentificationScheme
  "formal definition of the structure and application of a particular set of securities identifiers"
  {:db/ident :fibo-sec-sec-id/SecurityIdentificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/",
   :rdfs/label "security identification scheme",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/defines,
                      :owl/someValuesFrom :fibo-sec-sec-id/SecurityIdentifier,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-id/FinancialInstrumentIdentificationScheme
                     :fibo-fbc-fct-ra/RegistrationScheme],
   :skos/definition
   "formal definition of the structure and application of a particular set of securities identifiers"})

(def SecurityIdentifier
  "any publicly available identifier that is used to identify a security"
  {:db/ident :fibo-sec-sec-id/SecurityIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/",
   :rdfs/label "security identifier",
   :rdfs/subClassOf [{:owl/onProperty     :lcc-lr/identifies,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-rel-rel/isDefinedIn,
                      :owl/someValuesFrom
                      :fibo-sec-sec-id/SecurityIdentificationScheme,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fi-fi/FinancialInstrumentIdentifier],
   :skos/definition
   "any publicly available identifier that is used to identify a security"})

(def SecurityRegistry
  "registry used to manage security identifiers and related information"
  {:cmns-av/explanatoryNote
   "Securities registries may be managed by an exchange, clearing house, custodian, bank, or other financial services provider.",
   :db/ident :fibo-sec-sec-id/SecurityRegistry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/",
   :rdfs/label "security registry",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-rel-rel/isManagedBy,
     :owl/someValuesFrom :fibo-fbc-fct-ra/RegistrationAuthority,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fct-ra/hasRegistryEntry,
     :owl/someValuesFrom :fibo-sec-sec-id/SecurityRegistryEntry,
     :rdf/type           :owl/Restriction}
    {:owl/onClass    :fibo-sec-sec-id/SecurityIdentificationScheme,
     :owl/onProperty :fibo-fnd-rel-rel/isCharacterizedBy,
     :owl/qualifiedCardinality 1,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-ra/Registry],
   :skos/definition
   "registry used to manage security identifiers and related information"})

(def SecurityRegistryEntry
  "record for a security in a securities registry"
  {:db/ident :fibo-sec-sec-id/SecurityRegistryEntry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/",
   :rdfs/label "security registry entry",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/comprises,
                      :owl/someValuesFrom :fibo-sec-sec-id/SecurityIdentifier,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/appliesTo,
                      :owl/someValuesFrom :fibo-sec-sec-lst/RegisteredSecurity,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fct-ra/RegistryEntry],
   :skos/definition "record for a security in a securities registry"})

(def TickerSymbol
  "exchange-specific identifier for a particular security or listing for that security, depending on the country"
  {:cmns-av/explanatoryNote
   "Every listed security has at least one unique ticker symbol, facilitating the vast array of trade orders that flow through the financial markets every day. However, in some countries this relationship may be indirect, through the listing, rather than direct, as is the case in the United States. In the US, the relationship between a ticker symbol and the listed security is one-to-one. This is not, however, the case in Singapore, where there may be unique ticker symbols for the same security based on the lot size.",
   :cmns-av/usageNote
   "Ticker symbols are reusable, assigned to a given instrument by an exchange for some period of time.",
   :db/ident :fibo-sec-sec-id/TickerSymbol,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/",
   :rdfs/label "ticker symbol",
   :rdfs/seeAlso ["https://www.investopedia.com/terms/t/tickersymbol.asp"],
   :rdfs/subClassOf [{:owl/onProperty     :lcc-lr/identifies,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-sec-sec-lst/ListedSecurity
                                            :fibo-sec-sec-lst/Listing],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-id/ReassignableIdentifier],
   :skos/definition
   "exchange-specific identifier for a particular security or listing for that security, depending on the country"})

(def ^{:private true} Listing
  {:db/ident        :fibo-sec-sec-lst/Listing,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :fibo-sec-sec-id/SecurityRegistryEntry})