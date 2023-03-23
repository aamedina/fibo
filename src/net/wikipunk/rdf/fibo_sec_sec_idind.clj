(ns net.wikipunk.rdf.fibo-sec-sec-idind
  "This ontology defines concepts and primarily individuals required to identify securities, including the individuals that represent a number of well-known securities identifiers and related schemes, registries, and registration authorities."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 Object Management Group, Inc."
                       "Copyright (c) 2016-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :dcterms/abstract
   "This ontology defines concepts and primarily individuals required to identify securities, including the individuals that represent a number of well-known securities identifiers and related schemes, registries, and registration authorities.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIdentification/"
    "https://www.omg.org/spec/Commons/Designators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/GovernmentEntities/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/FinancialServicesEntities/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://www.omg.org/spec/Commons/Identifiers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/FunctionalEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegulatoryAgencies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/Publishers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesListings/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-sec-idind",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "Securities Identification Individuals Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/ version of this ontology was modified to replace 'characterizes' with 'describes', which more accurately expresses the intent."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was revised to correct a bad character in a note on the Valoren."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was revised to eliminate confusion between listed security and listing (which caused reasoning issues) and add the Telekurs Id (now retired) and Valoren as securities identifiers."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/ version of this ontology was updated to represent identifiers as classes rather than individuals and rename (migrate) the hasDefinition property to isDefinedIn to clarify intent."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was revised to address text formatting hygiene issues and clean up dead or irrelevant links."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/ version of this ontology was modified to restructure the concept of a listing and augment it with a number of relevant characteristics."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was revised to eliminate punning with respect to the FIGI registry entry."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was revised to correct a typo in an annotation property name."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/ version of this ontology was modified to eliminate duplication of concepts with LCC and eliminate punning in individual definitions."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was revised to replace 'financial information publisher' with 'publisher'."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/ version of this ontology was modified to correct several logic issues."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."]})

(def CGSCUSIPAccessRepository
  "CGS (CUSIP Global Services) CUSIP Access services and repository, a proprietary repository of security identifiers, issued by CUSIP Global Services, that is the National Securities Identifying Number (NSIN) for securities issued in North America, which is also part of the ISIN for the security it identifies"
  {:db/ident :fibo-sec-sec-idind/CGSCUSIPAccessRepository,
   :fibo-fnd-rel-rel/isManagedBy :fibo-sec-sec-idind/CUSIPGlobalServices,
   :rdf/type [:fibo-sec-sec-id/NationalSecuritiesIdentifyingNumberRegistry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "CGS CUSIP Access Repository",
   :rdfs/seeAlso ["https://www.cusip.com/cusip/index.htm"],
   :skos/definition
   "CGS (CUSIP Global Services) CUSIP Access services and repository, a proprietary repository of security identifiers, issued by CUSIP Global Services, that is the National Securities Identifying Number (NSIN) for securities issued in North America, which is also part of the ISIN for the security it identifies"})

(def CUSIPGlobalServices
  "CUSIP Global Services financial services provider that is the national numbering agency (NNA) for CUSIPs in North America"
  {:db/ident :fibo-sec-sec-idind/CUSIPGlobalServices,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usfsind/SPGlobalInc-US-NY,
   :rdf/type [:fibo-sec-sec-id/NationalNumberingAgency
              :fibo-fbc-pas-fpas/FinancialServiceProvider
              :fibo-be-fct-pub/Publisher
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "CUSIP Global Services",
   :rdfs/seeAlso ["http://www.cusip.com/"],
   :skos/definition
   "CUSIP Global Services financial services provider that is the national numbering agency (NNA) for CUSIPs in North America"})

(def CUSIPInternationalNumberingSystemNumber
  "9-character alphanumeric identifier that employs the same 9 characters as CUSIP, but also contains a letter of the alphabet in the first position signifying the issuer's country or geographic region, issued by CUSIP Global Services"
  {:cmns-av/abbreviation "CINS",
   :cmns-av/adaptedFrom "https://www.cusip.com/cusip/about-cgs-identifiers.htm",
   :cmns-av/synonym "CINS number",
   :db/ident :fibo-sec-sec-idind/CUSIPInternationalNumberingSystemNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "CUSIP International Numbering System (CINS) number",
   :rdfs/subClassOf
   [:fibo-sec-sec-id/ProprietarySecurityIdentifier
    {:owl/onClass    :fibo-fbc-fi-fi/Security,
     :owl/onProperty :cmns-id/identifies,
     :owl/qualifiedCardinality 1,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-ra/RegistryIdentifier
    {:owl/hasValue   :fibo-sec-sec-idind/CUSIPGlobalServices,
     :owl/onProperty :fibo-fbc-fct-ra/isRegisteredBy,
     :rdf/type       :owl/Restriction}
    {:owl/hasValue   :fibo-sec-sec-idind/CUSIPGlobalServices,
     :owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
     :rdf/type       :owl/Restriction}
    {:owl/hasValue :fibo-sec-sec-idind/CUSIPInternationalNumberingSystemScheme,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/hasValue   :fibo-sec-sec-idind/CGSCUSIPAccessRepository,
     :owl/onProperty :fibo-fbc-fct-ra/isRegisteredIn,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   "9-character alphanumeric identifier that employs the same 9 characters as CUSIP, but also contains a letter of the alphabet in the first position signifying the issuer's country or geographic region, issued by CUSIP Global Services"})

(def CUSIPInternationalNumberingSystemScheme
  "security identification scheme that extends the CUSIP scheme, used to identify securities outside of the United States and Canada for the purposes of facilitating clearing and settlement of trades"
  {:cmns-av/abbreviation "CINS scheme",
   :db/ident :fibo-sec-sec-idind/CUSIPInternationalNumberingSystemScheme,
   :rdf/type [:fibo-sec-sec-id/ProprietarySecurityIdentificationScheme
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "CUSIP International Numbering System (CINS) scheme",
   :skos/definition
   "security identification scheme that extends the CUSIP scheme, used to identify securities outside of the United States and Canada for the purposes of facilitating clearing and settlement of trades"})

(def CommitteeOnUniformSecuritiesIdentificationProceduresNumber
  "nine-character alphanumeric number that identifies all North American stocks and registered bonds for the purposes of facilitating clearing and settlement of trades, issued by CUSIP Global Services on behalf of the American Bankers' Association, which is a part of Standard and Poor's Capital IQ, that is the National Numbering Agency Identifier for securities issued in North America, which is also part of the ISIN for the security it identifies"
  {:cmns-av/abbreviation "CUSIP",
   :cmns-av/synonym "CUSIP number",
   :db/ident
   :fibo-sec-sec-idind/CommitteeOnUniformSecuritiesIdentificationProceduresNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label
   "Committee on Uniform Securities Identification Procedures (CUSIP) number",
   :rdfs/seeAlso ["https://www.cusip.com/cusip/about-cgs-identifiers.htm"],
   :rdfs/subClassOf
   [{:owl/onClass    :fibo-fbc-fi-fi/Security,
     :owl/onProperty :cmns-id/identifies,
     :owl/qualifiedCardinality 1,
     :rdf/type       :owl/Restriction}
    :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumber
    {:owl/hasValue   :fibo-sec-sec-idind/CGSCUSIPAccessRepository,
     :owl/onProperty :fibo-fbc-fct-ra/isRegisteredIn,
     :rdf/type       :owl/Restriction}
    :fibo-sec-sec-id/ProprietarySecurityIdentifier
    {:owl/hasValue   :fibo-sec-sec-idind/CUSIPGlobalServices,
     :owl/onProperty :fibo-fbc-fct-ra/isRegisteredBy,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-ra/RegistryIdentifier
    {:owl/hasValue
     :fibo-sec-sec-idind/CommitteeOnUniformSecuritiesIdentificationProceduresScheme,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/hasValue   :fibo-sec-sec-idind/CUSIPGlobalServices,
     :owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   "nine-character alphanumeric number that identifies all North American stocks and registered bonds for the purposes of facilitating clearing and settlement of trades, issued by CUSIP Global Services on behalf of the American Bankers' Association, which is a part of Standard and Poor's Capital IQ, that is the National Numbering Agency Identifier for securities issued in North America, which is also part of the ISIN for the security it identifies"})

(def CommitteeOnUniformSecuritiesIdentificationProceduresScheme
  "national security identification scheme used to identify all North American stocks and registered bonds for the purposes of facilitating clearing and settlement of trades"
  {:cmns-av/abbreviation "CUSIP scheme",
   :db/ident
   :fibo-sec-sec-idind/CommitteeOnUniformSecuritiesIdentificationProceduresScheme,
   :rdf/type [:fibo-sec-sec-id/ProprietarySecurityIdentificationScheme
              :fibo-sec-sec-id/NationalSecurityIdentificationScheme
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label
   "Committee on Uniform Securities Identification Procedures (CUSIP) scheme",
   :rdfs/seeAlso ["https://www.cusip.com/cusip/about-cgs-identifiers.htm"],
   :skos/definition
   "national security identification scheme used to identify all North American stocks and registered bonds for the purposes of facilitating clearing and settlement of trades"})

(def CommonCodeRegistryEntry
  "entry in a common code registry"
  {:db/ident :fibo-sec-sec-idind/CommonCodeRegistryEntry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "common code registry entry",
   :rdfs/subClassOf [{:owl/hasValue
                      :fibo-sec-sec-idind/EuroclearClearstreamCommonCode,
                      :owl/onProperty :cmns-col/comprises,
                      :rdf/type :owl/Restriction}
                     {:owl/hasValue   :fibo-sec-sec-idind/CommonCodeRepository,
                      :owl/onProperty :cmns-col/isIncludedIn,
                      :rdf/type       :owl/Restriction}
                     {:owl/allValuesFrom :fibo-fbc-fi-fi/Security,
                      :owl/onProperty    :cmns-cxtdsg/appliesTo,
                      :rdf/type          :owl/Restriction}
                     :fibo-fbc-fct-ra/RegistryEntry],
   :skos/definition "entry in a common code registry"})

(def CommonCodeRepository
  "distributed international repository of security identifiers, issued by Euroclear or Clearstream (CEDEL), that are used to identify securities in Europe for the purposes of facilitating clearing and settlement of trades"
  {:cmns-av/adaptedFrom "http://www.isin.net/common-code-isin/",
   :db/ident :fibo-sec-sec-idind/CommonCodeRepository,
   :fibo-fnd-rel-rel/isManagedBy :fibo-fbc-fct-eufseind/Clearstream,
   :rdf/type [:fibo-fbc-fct-ra/Registry :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "common code repository",
   :rdfs/seeAlso ["http://www.isin.net/common-code-isin/"],
   :skos/definition
   "distributed international repository of security identifiers, issued by Euroclear or Clearstream (CEDEL), that are used to identify securities in Europe for the purposes of facilitating clearing and settlement of trades"})

(def EuroclearClearstreamCommonCode
  "nine-character alphanumeric securities identifier, issued in Luxembourg, jointly by Euroclear and Clearstream"
  {:cmns-av/adaptedFrom "http://www.isin.net/common-code-isin/",
   :cmns-av/synonym "common code",
   :db/ident :fibo-sec-sec-idind/EuroclearClearstreamCommonCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "Euroclear Clearstream common code",
   :rdfs/subClassOf
   [:fibo-fbc-fct-ra/RegistryIdentifier
    {:owl/allValuesFrom {:owl/oneOf [:fibo-fbc-fct-eufseind/Clearstream
                                     :fibo-fbc-fct-eufseind/Euroclear],
                         :rdf/type  :owl/Class},
     :owl/onProperty    :fibo-fbc-fct-ra/isRegisteredBy,
     :rdf/type          :owl/Restriction}
    :fibo-sec-sec-id/ProprietarySecurityIdentifier
    {:owl/hasValue   :fibo-sec-sec-idind/CommonCodeRepository,
     :owl/onProperty :fibo-fbc-fct-ra/isRegisteredIn,
     :rdf/type       :owl/Restriction}
    {:owl/hasValue   :fibo-sec-sec-idind/EuroclearClearstreamCommonCodeScheme,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type       :owl/Restriction}
    {:owl/onClass    :fibo-fbc-fi-fi/Security,
     :owl/onProperty :cmns-id/identifies,
     :owl/qualifiedCardinality 1,
     :rdf/type       :owl/Restriction}
    {:owl/allValuesFrom {:owl/oneOf [:fibo-fbc-fct-eufseind/Clearstream
                                     :fibo-fbc-fct-eufseind/Euroclear],
                         :rdf/type  :owl/Class},
     :owl/onProperty    :fibo-fnd-rel-rel/isIssuedBy,
     :rdf/type          :owl/Restriction}],
   :skos/definition
   "nine-character alphanumeric securities identifier, issued in Luxembourg, jointly by Euroclear and Clearstream"})

(def EuroclearClearstreamCommonCodeScheme
  "nine-digit security identification scheme, defined originally by Euroclear and CEDEL (now Clearstream) that is used to identify securities in Europe for the purposes of facilitating clearing and settlement of trades"
  {:cmns-av/synonym "common code scheme",
   :cmns-dsg/describes :fibo-sec-sec-idind/CommonCodeRepository,
   :db/ident :fibo-sec-sec-idind/EuroclearClearstreamCommonCodeScheme,
   :rdf/type [:fibo-sec-sec-id/ProprietarySecurityIdentificationScheme
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "Euroclear Clearstream common code scheme",
   :skos/definition
   "nine-digit security identification scheme, defined originally by Euroclear and CEDEL (now Clearstream) that is used to identify securities in Europe for the purposes of facilitating clearing and settlement of trades"})

(def FinancialInstrumentGlobalIdentifier
  "financial instrument identifier that is defined as specified in the Object Management Group (OMG) Financial Instrument Global Identifier (FIGI) Specification"
  {:cmns-av/abbreviation "FIGI",
   :cmns-av/explanatoryNote
   "While in most cases, a FIGI uniquely identifies a security, there are situations outside of the U.S. where it instead identifies a listing for a security, similarly to a ticker symbol.",
   :db/ident :fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "financial instrument global identifier",
   :rdfs/subClassOf
   [{:owl/hasValue   :fibo-fbc-fct-usfsind/BloombergLP,
     :owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
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
    :fibo-fbc-fct-ra/RegistryIdentifier
    {:owl/hasValue   :fibo-fbc-fct-usfsind/BloombergLP,
     :owl/onProperty :fibo-fbc-fct-ra/isRegisteredBy,
     :rdf/type       :owl/Restriction}
    {:owl/hasValue
     :fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifierRegistry,
     :owl/onProperty :fibo-fbc-fct-ra/isRegisteredIn,
     :rdf/type :owl/Restriction}],
   :skos/definition
   "financial instrument identifier that is defined as specified in the Object Management Group (OMG) Financial Instrument Global Identifier (FIGI) Specification"})

(def FinancialInstrumentGlobalIdentifierRegistry
  "open, OMG standards-based registry used by the FIGI registration authority to manage the financial instrument identifiers and related information that it registers according to the Financial Instrument Global Identifier (FIGI) standard"
  {:cmns-av/abbreviation "FIGI Registry",
   :db/ident :fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifierRegistry,
   :fibo-fnd-rel-rel/isManagedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :rdf/type [:fibo-fbc-fct-ra/Registry :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "Financial Instrument Global Identifier (FIGI) Registry",
   :rdfs/seeAlso ["http://www.openfigi.com/"],
   :skos/definition
   "open, OMG standards-based registry used by the FIGI registration authority to manage the financial instrument identifiers and related information that it registers according to the Financial Instrument Global Identifier (FIGI) standard"})

(def FinancialInstrumentGlobalIdentifierRegistryEntry
  "entry in a Financial Instrument Global Identifier (FIGI) registry"
  {:cmns-av/abbreviation "FIGI registry entry",
   :db/ident
   :fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifierRegistryEntry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "Financial Instrument Global Identifier (FIGI) registry entry",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
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
     :rdf/type :owl/Restriction}
    :fibo-fbc-fct-ra/RegistryEntry],
   :skos/definition
   "entry in a Financial Instrument Global Identifier (FIGI) registry"})

(def FinancialInstrumentGlobalIdentifierScheme
  "standard identification scheme for financial instrument identifiers (not limited to securities) and, in some cases, related listings, published by the Object Management Group (OMG)"
  {:cmns-av/abbreviation "FIGI scheme",
   :cmns-dsg/describes
   :fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifierRegistry,
   :db/ident :fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifierScheme,
   :rdf/type [:fibo-sec-sec-id/FinancialInstrumentIdentificationScheme
              :fibo-fbc-fct-ra/RegistrationScheme
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "financial instrument global identifier scheme",
   :skos/definition
   "standard identification scheme for financial instrument identifiers (not limited to securities) and, in some cases, related listings, published by the Object Management Group (OMG)"})

(def FinancialTimesInteractiveDataScheme
  "proprietary identification scheme for securities identifiers managed by the Financial Times"
  {:cmns-av/abbreviation "FTID scheme",
   :db/ident :fibo-sec-sec-idind/FinancialTimesInteractiveDataScheme,
   :rdf/type [:fibo-sec-sec-id/ProprietarySecurityIdentificationScheme
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "Financial Times interactive data scheme",
   :skos/definition
   "proprietary identification scheme for securities identifiers managed by the Financial Times"})

(def ReutersInstrumentCode
  "ticker-like identifier to identify financial instruments and indices owned, managed, and distributed by Thomson Reuters"
  {:cmns-av/abbreviation "RIC",
   :db/ident :fibo-sec-sec-idind/ReutersInstrumentCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "Reuters instrument code",
   :rdfs/subClassOf [{:owl/hasValue
                      :fibo-sec-sec-idind/ReutersInstrumentCodeScheme,
                      :owl/onProperty :cmns-dsg/isDefinedIn,
                      :rdf/type :owl/Restriction}
                     {:owl/hasValue   :fibo-fbc-fct-usfsind/ThomsonReuters,
                      :owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   :fibo-fbc-fct-usfsind/ThomsonReuters,
                      :owl/onProperty :fibo-fbc-fct-ra/isRegisteredBy,
                      :rdf/type       :owl/Restriction}
                     :fibo-sec-sec-id/ProprietarySecurityIdentifier],
   :skos/definition
   "ticker-like identifier to identify financial instruments and indices owned, managed, and distributed by Thomson Reuters"})

(def ReutersInstrumentCodeScheme
  "proprietary identification scheme for securities identifiers managed by Thomson Reuters"
  {:cmns-av/abbreviation "RIC scheme",
   :db/ident :fibo-sec-sec-idind/ReutersInstrumentCodeScheme,
   :rdf/type [:fibo-sec-sec-id/ProprietarySecurityIdentificationScheme
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "Reuters instrument code scheme",
   :skos/definition
   "proprietary identification scheme for securities identifiers managed by Thomson Reuters"})

(def SEDOLMasterFile
  "repository of security identifiers, issued by the London Stock Exchange, that is the National Securities Identifying Number (NSIN) for securities issued in the United Kingdom, which is also part of the ISIN for the security it identifies"
  {:db/ident :fibo-sec-sec-idind/SEDOLMasterFile,
   :fibo-fnd-rel-rel/isManagedBy :fibo-fbc-fct-eufseind/LondonStockExchange,
   :rdf/type [:fibo-sec-sec-id/SecurityRegistry
              :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumberRegistry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "SEDOL Master File",
   :skos/definition
   "repository of security identifiers, issued by the London Stock Exchange, that is the National Securities Identifying Number (NSIN) for securities issued in the United Kingdom, which is also part of the ISIN for the security it identifies"})

(def StockExchangeDailyOfficialListCode
  "seven-character security identifier, issued by the London Stock Exchange, that is the National Securities Identifying Number (NSIN) for securities issued in the United Kingdom, which is also part of the ISIN for the security it identifies"
  {:cmns-av/abbreviation "SEDOL code",
   :db/ident :fibo-sec-sec-idind/StockExchangeDailyOfficialListCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "Stock Exchange Daily Official List (SEDOL) code",
   :rdfs/subClassOf [{:owl/hasValue :fibo-fbc-fct-eufseind/LondonStockExchange,
                      :owl/onProperty :fibo-fbc-fct-ra/isRegisteredBy,
                      :rdf/type :owl/Restriction}
                     {:owl/hasValue
                      :fibo-sec-sec-idind/StockExchangeDailyOfficialListScheme,
                      :owl/onProperty :cmns-dsg/isDefinedIn,
                      :rdf/type :owl/Restriction}
                     {:owl/hasValue :fibo-fbc-fct-eufseind/LondonStockExchange,
                      :owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
                      :rdf/type :owl/Restriction}
                     {:owl/hasValue   :fibo-sec-sec-idind/SEDOLMasterFile,
                      :owl/onProperty :fibo-fbc-fct-ra/isRegisteredIn,
                      :rdf/type       :owl/Restriction}
                     :fibo-sec-sec-id/ProprietarySecurityIdentifier
                     :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumber
                     :fibo-sec-sec-id/ListedSecurityIdentifier],
   :skos/definition
   "seven-character security identifier, issued by the London Stock Exchange, that is the National Securities Identifying Number (NSIN) for securities issued in the United Kingdom, which is also part of the ISIN for the security it identifies"})

(def StockExchangeDailyOfficialListScheme
  "national security identification scheme used to identify all stocks and registered bonds in the United Kingdom for the purposes of facilitating clearing and settlement of trades"
  {:cmns-av/abbreviation "SEDOL scheme",
   :cmns-dsg/describes :fibo-sec-sec-idind/SEDOLMasterFile,
   :db/ident :fibo-sec-sec-idind/StockExchangeDailyOfficialListScheme,
   :rdf/type [:fibo-sec-sec-id/SecurityIdentificationScheme
              :fibo-sec-sec-id/ProprietarySecurityIdentificationScheme
              :fibo-sec-sec-id/NationalSecurityIdentificationScheme
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "Stock Exchange Daily Official List (SEDOL) scheme",
   :skos/definition
   "national security identification scheme used to identify all stocks and registered bonds in the United Kingdom for the purposes of facilitating clearing and settlement of trades"})

(def TelekursId
  "identifier used to identify financial instruments owned, managed, and distributed by SIX Financial Information (formerly Telekurs AG and subsequently SIX Telekurs Ltd.)"
  {:cmns-av/explanatoryNote
   "The Telekurs Id was phased out in favor of the Valoren (Valor Nummer in Swiss German) in 2013.",
   :db/ident :fibo-sec-sec-idind/TelekursId,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "Telekurs Id",
   :rdfs/subClassOf
   [{:owl/hasValue   :fibo-sec-sec-idind/TelekursSecurityIdentifierScheme,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type       :owl/Restriction}
    {:owl/hasValue   :fibo-fbc-fct-eufseind/SIXFinancialInformation,
     :owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
     :rdf/type       :owl/Restriction}
    {:owl/hasValue   :fibo-fbc-fct-eufseind/SIXFinancialInformation,
     :owl/onProperty :fibo-fbc-fct-ra/isRegisteredBy,
     :rdf/type       :owl/Restriction}
    :fibo-sec-sec-id/ProprietarySecurityIdentifier],
   :skos/definition
   "identifier used to identify financial instruments owned, managed, and distributed by SIX Financial Information (formerly Telekurs AG and subsequently SIX Telekurs Ltd.)"})

(def TelekursSecurityIdentifierScheme
  "proprietary identification scheme for securities identifiers formerly managed by SIX Telekurs Ltd, a subsidiary of the SIX Group (Swiss Infrastructure and eXchange), now SIX Financial Information AG"
  {:cmns-av/abbreviation "Telekurs security ID scheme",
   :db/ident :fibo-sec-sec-idind/TelekursSecurityIdentifierScheme,
   :rdf/type [:fibo-sec-sec-id/ProprietarySecurityIdentificationScheme
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "Telekurs security identifier scheme",
   :skos/definition
   "proprietary identification scheme for securities identifiers formerly managed by SIX Telekurs Ltd, a subsidiary of the SIX Group (Swiss Infrastructure and eXchange), now SIX Financial Information AG"})

(def Valoren
  "identification number assigned to financial instruments in Switzerland, Liechtenstein and Belgium, issued by SIX Financial Information, that is the National Securities Identifying Number (NSIN) for securities issued in those countries and is also part of the ISIN for the security it identifies"
  {:cmns-av/adaptedFrom "https://www.isin.net/valoren/",
   :cmns-av/explanatoryNote
   "A VALOR code is between six and nine characters in length and like other securities identification codes (like ISIN, CUSIPs etc). A VALOR is utilized for identification purposes as well as clearing and settlement, similar to an ISIN code, and identifies debt and equity securities.",
   :cmns-av/synonym [{:rdf/language "en",
                      :rdf/value    "Valor Code"}
                     {:rdf/language "en",
                      :rdf/value    "Valoren Number"}
                     {:rdf/language "en",
                      :rdf/value    "Valoren Code"}
                     {:rdf/language "de",
                      :rdf/value    "Valor Nummer"}
                     {:rdf/language "en",
                      :rdf/value    "Valor"}
                     {:rdf/language "de",
                      :rdf/value    "Valor"}],
   :db/ident :fibo-sec-sec-idind/Valoren,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "Valoren",
   :rdfs/seeAlso
   ["https://www.six-group.com/en/products-services/financial-information.html"],
   :rdfs/subClassOf
   [{:owl/hasValue   :fibo-sec-sec-idind/ValorenScheme,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type       :owl/Restriction}
    :fibo-sec-sec-id/ListedSecurityIdentifier
    {:owl/hasValue   :fibo-fbc-fct-eufseind/SIXFinancialInformation,
     :owl/onProperty :fibo-fbc-fct-ra/isRegisteredBy,
     :rdf/type       :owl/Restriction}
    :fibo-sec-sec-id/ProprietarySecurityIdentifier
    :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumber
    {:owl/hasValue   :fibo-fbc-fct-eufseind/SIXFinancialInformation,
     :owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   "identification number assigned to financial instruments in Switzerland, Liechtenstein and Belgium, issued by SIX Financial Information, that is the National Securities Identifying Number (NSIN) for securities issued in those countries and is also part of the ISIN for the security it identifies"})

(def ValorenScheme
  "national security identification scheme used to identify equity and debt securities in Switzerland, Liechtenstein and Belgium for the purposes of facilitating clearing and settlement of trades"
  {:cmns-av/explanatoryNote
   "The VALOR number is a numeric code that intrinsically has no meaning. When a new VALOR is needed, the next one from the list is simply allocated. An instrument's number indicates nothing about the instrument itself.",
   :db/ident :fibo-sec-sec-idind/ValorenScheme,
   :rdf/type [:fibo-sec-sec-id/SecurityIdentificationScheme
              :fibo-sec-sec-id/ProprietarySecurityIdentificationScheme
              :fibo-sec-sec-id/NationalSecurityIdentificationScheme
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "Valoren scheme",
   :skos/definition
   "national security identification scheme used to identify equity and debt securities in Switzerland, Liechtenstein and Belgium for the purposes of facilitating clearing and settlement of trades"})

(def ^{:private true} Clearstream
  {:db/ident :fibo-fbc-fct-eufseind/Clearstream,
   :rdf/type [:fibo-fbc-fct-ra/RegistrationAuthority
              :fibo-fbc-fct-fse/ClearingBank
              :fibo-fbc-fct-fse/CentralSecuritiesDepository
              :fibo-be-fct-pub/Publisher
              :owl/NamedIndividual]})

(def ^{:private true} Euroclear
  {:db/ident :fibo-fbc-fct-eufseind/Euroclear,
   :rdf/type [:fibo-fbc-fct-ra/RegistrationAuthority
              :fibo-fbc-fct-fse/ClearingBank
              :fibo-fbc-fct-fse/CentralSecuritiesDepository
              :fibo-be-fct-pub/Publisher
              :owl/NamedIndividual]})

(def ^{:private true} LondonStockExchange
  {:db/ident :fibo-fbc-fct-eufseind/LondonStockExchange,
   :rdf/type [:fibo-sec-sec-id/NationalNumberingAgency
              :fibo-fbc-fct-ra/RegistrationAuthority
              :fibo-be-fct-pub/Publisher
              :owl/NamedIndividual]})

(def ^{:private true} SIXFinancialInformation
  {:db/ident :fibo-fbc-fct-eufseind/SIXFinancialInformation,
   :rdf/type [:fibo-sec-sec-id/NationalNumberingAgency
              :fibo-be-fct-pub/Publisher
              :owl/NamedIndividual]})

(def ^{:private true} BloombergLP
  {:db/ident :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-fnd-rel-rel/manages
   :fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifierRegistry,
   :rdf/type [:fibo-be-fct-pub/Publisher :owl/NamedIndividual]})

(def ^{:private true} ThomsonReuters
  {:db/ident :fibo-fbc-fct-usfsind/ThomsonReuters,
   :rdf/type [:fibo-fbc-fct-ra/RegistrationAuthority
              :fibo-be-fct-pub/Publisher
              :owl/NamedIndividual]})