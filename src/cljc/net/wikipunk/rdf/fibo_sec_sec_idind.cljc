(ns net.wikipunk.rdf.fibo-sec-sec-idind
  {:cmns-av/copyright
   #{"Copyright (c) 2016-2024 EDM Council, Inc."
     "Copyright (c) 2018-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :dcterms/abstract
   "This ontology defines concepts and primarily individuals required to identify securities, including the individuals that represent a number of well-known securities identifiers and related schemes, registries, and registration authorities.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-fct-pub"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
    "fibo-fbc-fct-eufseind"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
    "fibo-fbc-fct-fse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
    "fibo-fbc-fct-ra"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
    "fibo-fbc-fct-usfsind"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-ir-mdp"
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders/",
    "fibo-sec-sec-id"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/",
    "fibo-sec-sec-idind"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
    "fibo-sec-sec-lst"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/RegulatoryAgencies/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/SecuritiesIdentification/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/FunctionalEntities/Publishers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/FunctionalEntities/FunctionalEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/IND/InterestRates/MarketDataProviders/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/SecuritiesIdentificationIndividuals/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-sec-idind",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "Securities Identification Individuals Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was revised to correct a typo in an annotation property name."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/ version of this ontology was modified to correct several logic issues."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/ version of this ontology was updated to represent identifiers as classes rather than individuals and rename (migrate) the hasDefinition property to isDefinedIn to clarify intent."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was revised to correct a bad character in a note on the Valoren."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was revised to address text formatting hygiene issues and clean up dead or irrelevant links."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/ version of this ontology was modified to restructure the concept of a listing and augment it with a number of relevant characteristics."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was modified to address a punning issue (GitHub-2040)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was revised to eliminate punning with respect to the FIGI registry entry."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was modified to revise the representation of a RIC code to reflect that it is now published by the London Stock Exchange and is branded using their Refinitiv brand (SEC-196)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/ version of this ontology was modified to replace 'characterizes' with 'describes', which more accurately expresses the intent."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was revised to replace 'financial information publisher' with 'publisher'."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was revised to eliminate confusion between listed security and listing (which caused reasoning issues) and add the Telekurs Id (now retired) and Valoren as securities identifiers."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/ version of this ontology was modified to eliminate duplication of concepts with LCC and eliminate punning in individual definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"})

(def CGSCUSIPAccessRepository
  {:db/ident :fibo-sec-sec-idind/CGSCUSIPAccessRepository,
   :fibo-fnd-rel-rel/isManagedBy :fibo-sec-sec-idind/CUSIPGlobalServices,
   :rdf/type #{:fibo-sec-sec-id/NationalSecuritiesIdentifyingNumberRegistry
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"},
   :rdfs/label "CGS CUSIP Access Repository",
   :rdfs/seeAlso {:xsd/anyURI "https://www.cusip.com/cusip/index.htm"},
   :skos/definition
   "CGS (CUSIP Global Services) CUSIP Access services and repository, a proprietary repository of security identifiers, issued by CUSIP Global Services, that is the National Securities Identifying Number (NSIN) for securities issued in North America, which is also part of the ISIN for the security it identifies"})

(def CUSIPGlobalServices
  {:cmns-rlcmp/isPlayedBy :fibo-fbc-fct-usfsind/SPGlobalInc-US-NY,
   :db/ident :fibo-sec-sec-idind/CUSIPGlobalServices,
   :rdf/type #{:fibo-sec-sec-id/NationalNumberingAgency
               :fibo-fbc-pas-fpas/FinancialServiceProvider :owl/NamedIndividual
               :fibo-be-fct-pub/Publisher},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"},
   :rdfs/label "CUSIP Global Services",
   :rdfs/seeAlso {:xsd/anyURI "http://www.cusip.com/"},
   :skos/definition
   "CUSIP Global Services financial services provider that is the national numbering agency (NNA) for CUSIPs in North America"})

(def CUSIPInternationalNumberingSystemNumber
  {:cmns-av/abbreviation "CINS",
   :cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.cusip.com/cusip/about-cgs-identifiers.htm"},
   :cmns-av/synonym "CINS number",
   :db/ident :fibo-sec-sec-idind/CUSIPInternationalNumberingSystemNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"},
   :rdfs/label "CUSIP International Numbering System (CINS) number",
   :rdfs/subClassOf
   #{:fibo-fbc-fct-ra/RegistryIdentifier
     :fibo-sec-sec-id/ProprietarySecurityIdentifier
     {:owl/hasValue   :fibo-sec-sec-idind/CUSIPGlobalServices,
      :owl/onProperty :fibo-fbc-fct-ra/isRegisteredBy,
      :rdf/type       :owl/Restriction}
     {:owl/hasValue   :fibo-sec-sec-idind/CGSCUSIPAccessRepository,
      :owl/onProperty :fibo-fbc-fct-ra/isRegisteredIn,
      :rdf/type       :owl/Restriction}
     {:owl/hasValue   :fibo-sec-sec-idind/CUSIPGlobalServices,
      :owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
      :rdf/type       :owl/Restriction}
     {:owl/hasValue :fibo-sec-sec-idind/CUSIPInternationalNumberingSystemScheme,
      :owl/onProperty :cmns-dsg/isDefinedIn,
      :rdf/type :owl/Restriction}
     {:owl/onClass    :fibo-fbc-fi-fi/Security,
      :owl/onProperty :cmns-id/identifies,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "9-character alphanumeric identifier that employs the same 9 characters as CUSIP, but also contains a letter of the alphabet in the first position signifying the issuer's country or geographic region, issued by CUSIP Global Services"})

(def CUSIPInternationalNumberingSystemScheme
  {:cmns-av/abbreviation "CINS scheme",
   :cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.cusip.com/cusip/about-cgs-identifiers.htm"},
   :db/ident :fibo-sec-sec-idind/CUSIPInternationalNumberingSystemScheme,
   :rdf/type #{:fibo-sec-sec-id/ProprietarySecurityIdentificationScheme
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"},
   :rdfs/label "CUSIP International Numbering System (CINS) scheme",
   :skos/definition
   "security identification scheme that extends the CUSIP scheme, used to identify securities outside of the United States and Canada for the purposes of facilitating clearing and settlement of trades"})

(def CommitteeOnUniformSecuritiesIdentificationProceduresNumber
  {:cmns-av/abbreviation "CUSIP",
   :cmns-av/synonym "CUSIP number",
   :db/ident
   :fibo-sec-sec-idind/CommitteeOnUniformSecuritiesIdentificationProceduresNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"},
   :rdfs/label
   "Committee on Uniform Securities Identification Procedures (CUSIP) number",
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.cusip.com/cusip/about-cgs-identifiers.htm"},
   :rdfs/subClassOf
   #{:fibo-fbc-fct-ra/RegistryIdentifier
     :fibo-sec-sec-id/ProprietarySecurityIdentifier
     {:owl/hasValue   :fibo-sec-sec-idind/CUSIPGlobalServices,
      :owl/onProperty :fibo-fbc-fct-ra/isRegisteredBy,
      :rdf/type       :owl/Restriction}
     {:owl/hasValue   :fibo-sec-sec-idind/CGSCUSIPAccessRepository,
      :owl/onProperty :fibo-fbc-fct-ra/isRegisteredIn,
      :rdf/type       :owl/Restriction}
     {:owl/hasValue   :fibo-sec-sec-idind/CUSIPGlobalServices,
      :owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
      :rdf/type       :owl/Restriction}
     :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumber
     {:owl/hasValue
      :fibo-sec-sec-idind/CommitteeOnUniformSecuritiesIdentificationProceduresScheme,
      :owl/onProperty :cmns-dsg/isDefinedIn,
      :rdf/type :owl/Restriction}
     {:owl/onClass    :fibo-fbc-fi-fi/Security,
      :owl/onProperty :cmns-id/identifies,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "nine-character alphanumeric number that identifies all North American stocks and registered bonds for the purposes of facilitating clearing and settlement of trades, issued by CUSIP Global Services on behalf of the American Bankers' Association, which is a part of Standard and Poor's Capital IQ, that is the National Numbering Agency Identifier for securities issued in North America, which is also part of the ISIN for the security it identifies"})

(def CommitteeOnUniformSecuritiesIdentificationProceduresScheme
  {:cmns-av/abbreviation "CUSIP scheme",
   :db/ident
   :fibo-sec-sec-idind/CommitteeOnUniformSecuritiesIdentificationProceduresScheme,
   :rdf/type #{:fibo-sec-sec-id/ProprietarySecurityIdentificationScheme
               :fibo-sec-sec-id/NationalSecurityIdentificationScheme
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"},
   :rdfs/label
   "Committee on Uniform Securities Identification Procedures (CUSIP) scheme",
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.cusip.com/cusip/about-cgs-identifiers.htm"},
   :skos/definition
   "national security identification scheme used to identify all North American stocks and registered bonds for the purposes of facilitating clearing and settlement of trades"})

(def CommonCodeRegistryEntry
  {:db/ident :fibo-sec-sec-idind/CommonCodeRegistryEntry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"},
   :rdfs/label "common code registry entry",
   :rdfs/seeAlso {:xsd/anyURI "http://www.isin.net/common-code-isin/"},
   :rdfs/subClassOf
   #{{:owl/allValuesFrom :fibo-fbc-fi-fi/Security,
      :owl/onProperty    :cmns-cxtdsg/appliesTo,
      :rdf/type          :owl/Restriction}
     {:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom :fibo-sec-sec-idind/EuroclearClearstreamCommonCode,
      :rdf/type           :owl/Restriction}
     {:owl/hasValue   :fibo-sec-sec-idind/CommonCodeRepository,
      :owl/onProperty :cmns-col/isIncludedIn,
      :rdf/type       :owl/Restriction} :fibo-fbc-fct-ra/RegistryEntry},
   :skos/definition "entry in a common code registry"})

(def CommonCodeRepository
  {:cmns-av/adaptedFrom {:xsd/anyURI "http://www.isin.net/common-code-isin/"},
   :db/ident :fibo-sec-sec-idind/CommonCodeRepository,
   :fibo-fnd-rel-rel/isManagedBy :fibo-fbc-fct-eufseind/Clearstream,
   :rdf/type #{:fibo-fbc-fct-ra/Registry :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"},
   :rdfs/label "common code repository",
   :rdfs/seeAlso {:xsd/anyURI "http://www.isin.net/common-code-isin/"},
   :skos/definition
   "distributed international repository of security identifiers, issued by Euroclear or Clearstream (CEDEL), that are used to identify securities in Europe for the purposes of facilitating clearing and settlement of trades"})

(def EuroclearClearstreamCommonCode
  {:cmns-av/adaptedFrom {:xsd/anyURI "http://www.isin.net/common-code-isin/"},
   :cmns-av/synonym "common code",
   :db/ident :fibo-sec-sec-idind/EuroclearClearstreamCommonCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"},
   :rdfs/label "Euroclear Clearstream common code",
   :rdfs/subClassOf
   #{{:owl/allValuesFrom {:owl/oneOf [:fibo-fbc-fct-eufseind/Clearstream
                                      :fibo-fbc-fct-eufseind/Euroclear],
                          :rdf/type  :owl/Class},
      :owl/onProperty    :fibo-fnd-rel-rel/isIssuedBy,
      :rdf/type          :owl/Restriction} :fibo-fbc-fct-ra/RegistryIdentifier
     :fibo-sec-sec-id/ProprietarySecurityIdentifier
     {:owl/hasValue   :fibo-sec-sec-idind/EuroclearClearstreamCommonCodeScheme,
      :owl/onProperty :cmns-dsg/isDefinedIn,
      :rdf/type       :owl/Restriction}
     {:owl/hasValue   :fibo-sec-sec-idind/CommonCodeRepository,
      :owl/onProperty :fibo-fbc-fct-ra/isRegisteredIn,
      :rdf/type       :owl/Restriction}
     {:owl/allValuesFrom {:owl/oneOf [:fibo-fbc-fct-eufseind/Clearstream
                                      :fibo-fbc-fct-eufseind/Euroclear],
                          :rdf/type  :owl/Class},
      :owl/onProperty    :fibo-fbc-fct-ra/isRegisteredBy,
      :rdf/type          :owl/Restriction}
     {:owl/onClass    :fibo-fbc-fi-fi/Security,
      :owl/onProperty :cmns-id/identifies,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "nine-character alphanumeric securities identifier, issued in Luxembourg, jointly by Euroclear and Clearstream"})

(def EuroclearClearstreamCommonCodeScheme
  {:cmns-av/adaptedFrom {:xsd/anyURI "http://www.isin.net/common-code-isin/"},
   :cmns-av/synonym "common code scheme",
   :cmns-dsg/describes :fibo-sec-sec-idind/CommonCodeRepository,
   :db/ident :fibo-sec-sec-idind/EuroclearClearstreamCommonCodeScheme,
   :rdf/type #{:fibo-sec-sec-id/ProprietarySecurityIdentificationScheme
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"},
   :rdfs/label "Euroclear Clearstream common code scheme",
   :skos/definition
   "nine-digit security identification scheme, defined originally by Euroclear and CEDEL (now Clearstream) that is used to identify securities in Europe for the purposes of facilitating clearing and settlement of trades"})

(def FinancialInstrumentGlobalIdentifier
  {:cmns-av/abbreviation "FIGI",
   :cmns-av/adaptedFrom {:xsd/anyURI "https://www.omg.org/spec/FIGI"},
   :cmns-av/explanatoryNote
   "The development of the Financial Instrument Global Identifier (FIGI) originated from a need for a standard methodology to bridge across multiple identification systems for financial instruments. Without prejudice against any existing symbol-based solutions, or any question of the validity of one system over the other, the FIGI standard utilizes a metadata driven approach to enable the unique and persistent identification of financial instruments. While in most cases, a FIGI uniquely identifies a security, there are situations outside of the U.S. where it instead identifies a listing for a security, similar to a ticker symbol.",
   :db/ident :fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"},
   :rdfs/label "financial instrument global identifier",
   :rdfs/subClassOf
   #{:fibo-fbc-fct-ra/RegistryIdentifier
     {:owl/hasValue   :fibo-fbc-fct-usfsind/BloombergLP,
      :owl/onProperty :fibo-fbc-fct-ra/isRegisteredBy,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :cmns-id/identifies,
      :owl/someValuesFrom {:owl/unionOf [:fibo-fbc-fi-fi/FinancialInstrument
                                         :fibo-sec-sec-lst/Listing],
                           :rdf/type    :owl/Class},
      :rdf/type           :owl/Restriction}
     {:owl/hasValue
      :fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifierScheme,
      :owl/onProperty :cmns-dsg/isDefinedIn,
      :rdf/type :owl/Restriction}
     {:owl/hasValue
      :fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifierRegistry,
      :owl/onProperty :fibo-fbc-fct-ra/isRegisteredIn,
      :rdf/type :owl/Restriction}
     {:owl/hasValue   :fibo-fbc-fct-usfsind/BloombergLP,
      :owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "financial instrument identifier that is defined as specified in the Object Management Group (OMG) Financial Instrument Global Identifier (FIGI) Specification"})

(def FinancialInstrumentGlobalIdentifierRegistry
  {:cmns-av/abbreviation "FIGI Registry",
   :cmns-av/adaptedFrom {:xsd/anyURI "https://www.omg.org/spec/FIGI"},
   :db/ident :fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifierRegistry,
   :fibo-fnd-rel-rel/isManagedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :rdf/type #{:fibo-fbc-fct-ra/Registry :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"},
   :rdfs/label "Financial Instrument Global Identifier (FIGI) Registry",
   :rdfs/seeAlso {:xsd/anyURI "http://www.openfigi.com/"},
   :skos/definition
   "open, OMG standards-based registry used by the FIGI registration authority to manage the financial instrument identifiers and related information that it registers according to the Financial Instrument Global Identifier (FIGI) standard"})

(def FinancialInstrumentGlobalIdentifierRegistryEntry
  {:cmns-av/abbreviation "FIGI registry entry",
   :cmns-av/adaptedFrom {:xsd/anyURI "https://www.omg.org/spec/FIGI"},
   :db/ident
   :fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifierRegistryEntry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"},
   :rdfs/label "Financial Instrument Global Identifier (FIGI) registry entry",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-cxtdsg/appliesTo,
      :owl/someValuesFrom {:owl/unionOf [:fibo-fbc-fi-fi/FinancialInstrument
                                         :fibo-sec-sec-lst/Listing],
                           :rdf/type    :owl/Class},
      :rdf/type           :owl/Restriction}
     {:owl/onProperty :cmns-col/comprises,
      :owl/someValuesFrom
      :fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifier,
      :rdf/type :owl/Restriction}
     {:owl/hasValue
      :fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifierRegistry,
      :owl/onProperty :cmns-col/isIncludedIn,
      :rdf/type :owl/Restriction} :fibo-fbc-fct-ra/RegistryEntry},
   :skos/definition
   "entry in a Financial Instrument Global Identifier (FIGI) registry"})

(def FinancialInstrumentGlobalIdentifierScheme
  {:cmns-av/abbreviation "FIGI scheme",
   :cmns-av/adaptedFrom {:xsd/anyURI "https://www.omg.org/spec/FIGI"},
   :cmns-dsg/describes
   :fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifierRegistry,
   :db/ident :fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifierScheme,
   :rdf/type #{:fibo-sec-sec-id/FinancialInstrumentIdentificationScheme
               :fibo-fbc-fct-ra/RegistrationScheme :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"},
   :rdfs/label "financial instrument global identifier scheme",
   :skos/definition
   "standard identification scheme for financial instrument identifiers (not limited to securities) and, in some cases, related listings, published by the Object Management Group (OMG)"})

(def FinancialTimesInteractiveDataScheme
  {:cmns-av/abbreviation "FTID scheme",
   :db/ident :fibo-sec-sec-idind/FinancialTimesInteractiveDataScheme,
   :rdf/type #{:fibo-sec-sec-id/ProprietarySecurityIdentificationScheme
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"},
   :rdfs/label "Financial Times interactive data scheme",
   :skos/definition
   "proprietary identification scheme for securities identifiers managed by the Financial Times"})

(def RefinitivInstrumentCode
  {:cmns-av/abbreviation "RIC",
   :cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://community.developers.refinitiv.com/questions/28938/ric-code-understandingidentificaiton.html"},
   :db/ident :fibo-sec-sec-idind/RefinitivInstrumentCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"},
   :rdfs/label "Refinitiv instrument code",
   :rdfs/subClassOf
   #{:fibo-sec-sec-id/ProprietarySecurityIdentifier
     {:owl/hasValue :fibo-ind-ir-mdp/LSEGFinancialSolutionsAsMarketDataProvider,
      :owl/onProperty :fibo-fbc-fct-ra/isRegisteredBy,
      :rdf/type :owl/Restriction}
     {:owl/hasValue   :fibo-sec-sec-idind/RefinitivInstrumentCodeScheme,
      :owl/onProperty :cmns-dsg/isDefinedIn,
      :rdf/type       :owl/Restriction}
     {:owl/hasValue :fibo-ind-ir-mdp/LSEGFinancialSolutionsAsMarketDataProvider,
      :owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
      :rdf/type :owl/Restriction}},
   :skos/definition
   "proprietary code for financial instruments and indices owned, managed, and distributed by the London Stock Exchange Group's LSEG Financial Solutions (branded as Refinitiv)",
   :skos/note
   "A Refinitiv Instrument Code (RIC), previously known as the Reuters Instrument Code, is a proprietary identifier used by Refinitiv (now LSEG Financial Solutions) to represent financial instrument related data. The composition of a RIC is dependent on the type of instrument.\n\n- Instrument code : Can be based on the exchange ticker code, ISIN or local code, currency code, and so on\n- Period or time interval : Can be an expiry month code for example\n- Delimiter : Usually a full stop used to separate the instrument code from the exchange code or a = sign for money securities.\n- Source code : Usually a single or double alpha-character capital unique to an exchange\n\nAn equity RIC has several components: the Equity RIC root is in upper case, brokerage characters in lower case (if applicable), and finally an exchange identifier. These codes facilitate information lookup across various financial networks. The concept of RICs traces back to the Quotron service, which Thomson Reuters acquired in the 1980s. The division was spun out as Refinitiv in 2018. Refinitiv was acquired by the London Stock Exchange Group in 2021, and the organization was rebranded as LSEG Financial Solutions in 2023, though the name of the code and certain other branded concepts were retained."})

(def RefinitivInstrumentCodeScheme
  {:cmns-av/abbreviation "RIC scheme",
   :cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://community.developers.refinitiv.com/questions/28938/ric-code-understandingidentificaiton.html"},
   :db/ident :fibo-sec-sec-idind/RefinitivInstrumentCodeScheme,
   :rdf/type #{:fibo-sec-sec-id/ProprietarySecurityIdentificationScheme
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"},
   :rdfs/label "Refinitiv instrument code scheme",
   :skos/definition
   "proprietary identification scheme for securities identifiers managed by the London Stock Exchange Group's LSEG Financial Solutions"})

(def ReutersInstrumentCode
  {:db/ident :fibo-sec-sec-idind/ReutersInstrumentCode,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-sec-sec-idind/RefinitivInstrumentCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"}})

(def ReutersInstrumentCodeScheme
  {:db/ident :fibo-sec-sec-idind/ReutersInstrumentCodeScheme,
   :owl/deprecated true,
   :owl/sameAs :fibo-sec-sec-idind/RefinitivInstrumentCodeScheme,
   :rdf/type :owl/NamedIndividual,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"}})

(def SEDOLMasterFile
  {:db/ident :fibo-sec-sec-idind/SEDOLMasterFile,
   :fibo-fnd-rel-rel/isManagedBy :fibo-fbc-fct-eufseind/LondonStockExchange,
   :rdf/type #{:fibo-sec-sec-id/NationalSecuritiesIdentifyingNumberRegistry
               :fibo-sec-sec-id/SecurityRegistry :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"},
   :rdfs/label "SEDOL Master File",
   :rdfs/seeAlso {:xsd/anyURI "https://www.isin.net/sedol/"},
   :skos/definition
   "repository of security identifiers, issued by the London Stock Exchange, that is the National Securities Identifying Number (NSIN) for securities issued in the United Kingdom, which is also part of the ISIN for the security it identifies"})

(def StockExchangeDailyOfficialListCode
  {:cmns-av/abbreviation "SEDOL code",
   :db/ident :fibo-sec-sec-idind/StockExchangeDailyOfficialListCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"},
   :rdfs/label "Stock Exchange Daily Official List (SEDOL) code",
   :rdfs/seeAlso {:xsd/anyURI "https://www.isin.net/sedol/"},
   :rdfs/subClassOf #{:fibo-sec-sec-id/ProprietarySecurityIdentifier
                      {:owl/hasValue :fibo-fbc-fct-eufseind/LondonStockExchange,
                       :owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
                       :rdf/type :owl/Restriction}
                      {:owl/hasValue
                       :fibo-sec-sec-idind/StockExchangeDailyOfficialListScheme,
                       :owl/onProperty :cmns-dsg/isDefinedIn,
                       :rdf/type :owl/Restriction}
                      {:owl/hasValue   :fibo-sec-sec-idind/SEDOLMasterFile,
                       :owl/onProperty :fibo-fbc-fct-ra/isRegisteredIn,
                       :rdf/type       :owl/Restriction}
                      {:owl/hasValue :fibo-fbc-fct-eufseind/LondonStockExchange,
                       :owl/onProperty :fibo-fbc-fct-ra/isRegisteredBy,
                       :rdf/type :owl/Restriction}
                      :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumber
                      :fibo-sec-sec-id/ListedSecurityIdentifier},
   :skos/definition
   "seven-character security identifier, issued by the London Stock Exchange, that is the National Securities Identifying Number (NSIN) for securities issued in the United Kingdom, which is also part of the ISIN for the security it identifies"})

(def StockExchangeDailyOfficialListScheme
  {:cmns-av/abbreviation "SEDOL scheme",
   :cmns-dsg/describes :fibo-sec-sec-idind/SEDOLMasterFile,
   :db/ident :fibo-sec-sec-idind/StockExchangeDailyOfficialListScheme,
   :rdf/type #{:fibo-sec-sec-id/SecurityIdentificationScheme
               :fibo-sec-sec-id/ProprietarySecurityIdentificationScheme
               :fibo-sec-sec-id/NationalSecurityIdentificationScheme
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"},
   :rdfs/label "Stock Exchange Daily Official List (SEDOL) scheme",
   :rdfs/seeAlso {:xsd/anyURI "https://www.isin.net/sedol/"},
   :skos/definition
   "national security identification scheme used to identify all stocks and registered bonds in the United Kingdom for the purposes of facilitating clearing and settlement of trades"})

(def TelekursId
  {:cmns-av/explanatoryNote
   "The Telekurs Id was phased out in favor of the Valoren (Valor Nummer in Swiss German) in 2013.",
   :db/ident :fibo-sec-sec-idind/TelekursId,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"},
   :rdfs/label "Telekurs Id",
   :rdfs/subClassOf
   #{:fibo-sec-sec-id/ProprietarySecurityIdentifier
     {:owl/hasValue   :fibo-sec-sec-idind/TelekursSecurityIdentifierScheme,
      :owl/onProperty :cmns-dsg/isDefinedIn,
      :rdf/type       :owl/Restriction}
     {:owl/hasValue   :fibo-fbc-fct-eufseind/SIXFinancialInformation,
      :owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
      :rdf/type       :owl/Restriction}
     {:owl/hasValue   :fibo-fbc-fct-eufseind/SIXFinancialInformation,
      :owl/onProperty :fibo-fbc-fct-ra/isRegisteredBy,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "identifier used to identify financial instruments owned, managed, and distributed by SIX Financial Information (formerly Telekurs AG and subsequently SIX Telekurs Ltd.)"})

(def TelekursSecurityIdentifierScheme
  {:cmns-av/abbreviation "Telekurs security ID scheme",
   :db/ident :fibo-sec-sec-idind/TelekursSecurityIdentifierScheme,
   :rdf/type #{:fibo-sec-sec-id/ProprietarySecurityIdentificationScheme
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"},
   :rdfs/label "Telekurs security identifier scheme",
   :skos/definition
   "proprietary identification scheme for securities identifiers formerly managed by SIX Telekurs Ltd, a subsidiary of the SIX Group (Swiss Infrastructure and eXchange), now SIX Financial Information AG"})

(def Valoren
  {:cmns-av/adaptedFrom {:xsd/anyURI "https://www.isin.net/valoren/"},
   :cmns-av/explanatoryNote
   "A VALOR code is between six and nine characters in length and like other securities identification codes (like ISIN, CUSIPs etc). A VALOR is utilized for identification purposes as well as clearing and settlement, similar to an ISIN code, and identifies debt and equity securities.",
   :cmns-av/synonym #{{:rdf/language "en",
                       :rdf/value    "Valoren Number"}
                      {:rdf/language "en",
                       :rdf/value    "Valoren Code"}
                      {:rdf/language "en",
                       :rdf/value    "Valor"}
                      {:rdf/language "de",
                       :rdf/value    "Valor"}
                      {:rdf/language "en",
                       :rdf/value    "Valor Code"}
                      {:rdf/language "de",
                       :rdf/value    "Valor Nummer"}},
   :db/ident :fibo-sec-sec-idind/Valoren,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"},
   :rdfs/label "Valoren",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.six-group.com/en/products-services/financial-information.html"},
   :rdfs/subClassOf
   #{:fibo-sec-sec-id/ProprietarySecurityIdentifier
     {:owl/hasValue   :fibo-fbc-fct-eufseind/SIXFinancialInformation,
      :owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
      :rdf/type       :owl/Restriction}
     {:owl/hasValue   :fibo-fbc-fct-eufseind/SIXFinancialInformation,
      :owl/onProperty :fibo-fbc-fct-ra/isRegisteredBy,
      :rdf/type       :owl/Restriction}
     {:owl/hasValue   :fibo-sec-sec-idind/ValorenScheme,
      :owl/onProperty :cmns-dsg/isDefinedIn,
      :rdf/type       :owl/Restriction}
     :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumber
     :fibo-sec-sec-id/ListedSecurityIdentifier},
   :skos/definition
   "identification number assigned to financial instruments in Switzerland, Liechtenstein and Belgium, issued by SIX Financial Information, that is the National Securities Identifying Number (NSIN) for securities issued in those countries and is also part of the ISIN for the security it identifies"})

(def ValorenScheme
  {:cmns-av/explanatoryNote
   "The VALOR number is a numeric code that intrinsically has no meaning. When a new VALOR is needed, the next one from the list is simply allocated. An instrument's number indicates nothing about the instrument itself.",
   :db/ident :fibo-sec-sec-idind/ValorenScheme,
   :rdf/type #{:fibo-sec-sec-id/SecurityIdentificationScheme
               :fibo-sec-sec-id/ProprietarySecurityIdentificationScheme
               :fibo-sec-sec-id/NationalSecurityIdentificationScheme
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"},
   :rdfs/label "Valoren scheme",
   :skos/definition
   "national security identification scheme used to identify equity and debt securities in Switzerland, Liechtenstein and Belgium for the purposes of facilitating clearing and settlement of trades"})

(def urn:uuid:f874b76f-3bb5-5055-9323-1605de322ebc
  {:cmns-av/copyright
   #{"Copyright (c) 2016-2024 EDM Council, Inc."
     "Copyright (c) 2018-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines concepts and primarily individuals required to identify securities, including the individuals that represent a number of well-known securities identifiers and related schemes, registries, and registration authorities.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/RegulatoryAgencies/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/SecuritiesIdentification/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/FunctionalEntities/Publishers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/FunctionalEntities/FunctionalEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/IND/InterestRates/MarketDataProviders/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/SecuritiesIdentificationIndividuals/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Securities Identification Individuals Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was revised to correct a typo in an annotation property name."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/ version of this ontology was modified to correct several logic issues."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/ version of this ontology was updated to represent identifiers as classes rather than individuals and rename (migrate) the hasDefinition property to isDefinedIn to clarify intent."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was revised to correct a bad character in a note on the Valoren."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was revised to address text formatting hygiene issues and clean up dead or irrelevant links."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/ version of this ontology was modified to restructure the concept of a listing and augment it with a number of relevant characteristics."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was modified to address a punning issue (GitHub-2040)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was revised to eliminate punning with respect to the FIGI registry entry."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was modified to revise the representation of a RIC code to reflect that it is now published by the London Stock Exchange and is branded using their Refinitiv brand (SEC-196)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/ version of this ontology was modified to replace 'characterizes' with 'describes', which more accurately expresses the intent."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was revised to replace 'financial information publisher' with 'publisher'."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was revised to eliminate confusion between listed security and listing (which caused reasoning issues) and add the Telekurs Id (now retired) and Valoren as securities identifiers."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/ version of this ontology was modified to eliminate duplication of concepts with LCC and eliminate punning in individual definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/"})