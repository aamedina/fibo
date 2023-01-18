(ns net.wikipunk.rdf.fibo-sec-sec-idind
  "This ontology defines concepts and primarily individuals required to identify securities, including the individuals that represent a number of well-known securities identifiers and related schemes, registries, and registration authorities."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :dcterms/abstract
   "This ontology defines concepts and primarily individuals required to identify securities, including the individuals that represent a number of well-known securities identifiers and related schemes, registries, and registration authorities.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIdentification/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Arrangements/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/GovernmentEntities/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/FinancialServicesEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/FunctionalEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegulatoryAgencies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/Publishers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesListings/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/IdentifiersAndIndices/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
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
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
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
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/ version of this ontology was modified to eliminate duplication of concepts with LCC and eliminate punning in individual definitions."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals.rdf version of this ontology was revised to replace 'financial information publisher' with 'publisher'."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/ version of this ontology was modified to correct several logic issues."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference",
   :sm/copyright ["Copyright (c) 2016-2022 EDM Council, Inc."
                  "Copyright (c) 2018-2022 Object Management Group, Inc."],
   :sm/dependsOn
   ["https://www.omg.org/spec/LCC/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/"
    "https://spec.edmcouncil.org/fibo/ontology/BE/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/"],
   :sm/fileAbbreviation "fibo-sec-sec-idind",
   :sm/filename "SecuritiesIdentificationIndividuals.rdf"})

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
  {:db/ident :fibo-sec-sec-idind/CUSIPInternationalNumberingSystemNumber,
   :fibo-fnd-utl-av/abbreviation "CINS",
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.cusip.com/cusip/about-cgs-identifiers.htm",
   :fibo-fnd-utl-av/synonym "CINS number",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "CUSIP International Numbering System (CINS) number",
   :rdfs/subClassOf
   [{:owl/hasValue   :fibo-sec-sec-idind/CUSIPGlobalServices,
     :owl/onProperty :fibo-fbc-fct-ra/isRegisteredBy,
     :rdf/type       :owl/Restriction}
    {:owl/hasValue   :fibo-sec-sec-idind/CGSCUSIPAccessRepository,
     :owl/onProperty :fibo-fbc-fct-ra/isRegisteredIn,
     :rdf/type       :owl/Restriction}
    :fibo-sec-sec-id/ProprietarySecurityIdentifier
    :fibo-fbc-fct-ra/RegistryIdentifier
    {:owl/hasValue :fibo-sec-sec-idind/CUSIPInternationalNumberingSystemScheme,
     :owl/onProperty :fibo-fnd-rel-rel/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/onClass    :fibo-fbc-fi-fi/Security,
     :owl/onProperty :lcc-lr/identifies,
     :owl/qualifiedCardinality 1,
     :rdf/type       :owl/Restriction}
    {:owl/hasValue   :fibo-sec-sec-idind/CUSIPGlobalServices,
     :owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   "9-character alphanumeric identifier that employs the same 9 characters as CUSIP, but also contains a letter of the alphabet in the first position signifying the issuer's country or geographic region, issued by CUSIP Global Services"})

(def CUSIPInternationalNumberingSystemScheme
  "security identification scheme that extends the CUSIP scheme, used to identify securities outside of the United States and Canada for the purposes of facilitating clearing and settlement of trades"
  {:db/ident :fibo-sec-sec-idind/CUSIPInternationalNumberingSystemScheme,
   :fibo-fnd-utl-av/abbreviation "CINS scheme",
   :rdf/type [:fibo-sec-sec-id/ProprietarySecurityIdentificationScheme
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "CUSIP International Numbering System (CINS) scheme",
   :skos/definition
   "security identification scheme that extends the CUSIP scheme, used to identify securities outside of the United States and Canada for the purposes of facilitating clearing and settlement of trades"})

(def CommitteeOnUniformSecuritiesIdentificationProceduresNumber
  "nine-character alphanumeric number that identifies all North American stocks and registered bonds for the purposes of facilitating clearing and settlement of trades, issued by CUSIP Global Services on behalf of the American Bankers' Association, which is a part of Standard and Poor's Capital IQ, that is the National Numbering Agency Identifier for securities issued in North America, which is also part of the ISIN for the security it identifies"
  {:db/ident
   :fibo-sec-sec-idind/CommitteeOnUniformSecuritiesIdentificationProceduresNumber,
   :fibo-fnd-utl-av/abbreviation "CUSIP",
   :fibo-fnd-utl-av/synonym "CUSIP number",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label
   "Committee on Uniform Securities Identification Procedures (CUSIP) number",
   :rdfs/seeAlso ["https://www.cusip.com/cusip/about-cgs-identifiers.htm"],
   :rdfs/subClassOf
   [{:owl/hasValue
     :fibo-sec-sec-idind/CommitteeOnUniformSecuritiesIdentificationProceduresScheme,
     :owl/onProperty :fibo-fnd-rel-rel/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/onClass    :fibo-fbc-fi-fi/Security,
     :owl/onProperty :lcc-lr/identifies,
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
    {:owl/hasValue   :fibo-sec-sec-idind/CUSIPGlobalServices,
     :owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   "nine-character alphanumeric number that identifies all North American stocks and registered bonds for the purposes of facilitating clearing and settlement of trades, issued by CUSIP Global Services on behalf of the American Bankers' Association, which is a part of Standard and Poor's Capital IQ, that is the National Numbering Agency Identifier for securities issued in North America, which is also part of the ISIN for the security it identifies"})

(def CommitteeOnUniformSecuritiesIdentificationProceduresScheme
  "national security identification scheme used to identify all North American stocks and registered bonds for the purposes of facilitating clearing and settlement of trades"
  {:db/ident
   :fibo-sec-sec-idind/CommitteeOnUniformSecuritiesIdentificationProceduresScheme,
   :fibo-fnd-utl-av/abbreviation "CUSIP scheme",
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
                      :owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :rdf/type :owl/Restriction}
                     {:owl/hasValue   :fibo-sec-sec-idind/CommonCodeRepository,
                      :owl/onProperty :fibo-fnd-rel-rel/isIncludedIn,
                      :rdf/type       :owl/Restriction}
                     {:owl/allValuesFrom :fibo-fbc-fi-fi/Security,
                      :owl/onProperty    :fibo-fnd-rel-rel/appliesTo,
                      :rdf/type          :owl/Restriction}
                     :fibo-fbc-fct-ra/RegistryEntry],
   :skos/definition "entry in a common code registry"})

(def CommonCodeRepository
  "distributed international repository of security identifiers, issued by Euroclear or Clearstream (CEDEL), that are used to identify securities in Europe for the purposes of facilitating clearing and settlement of trades"
  {:db/ident :fibo-sec-sec-idind/CommonCodeRepository,
   :fibo-fnd-rel-rel/isManagedBy :fibo-fbc-fct-eufseind/Clearstream,
   :fibo-fnd-utl-av/adaptedFrom "http://www.isin.net/common-code-isin/",
   :rdf/type [:fibo-fbc-fct-ra/Registry :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "common code repository",
   :rdfs/seeAlso ["http://www.isin.net/common-code-isin/"],
   :skos/definition
   "distributed international repository of security identifiers, issued by Euroclear or Clearstream (CEDEL), that are used to identify securities in Europe for the purposes of facilitating clearing and settlement of trades"})

(def EuroclearClearstreamCommonCode
  "nine-character alphanumeric securities identifier, issued in Luxembourg, jointly by Euroclear and Clearstream"
  {:db/ident :fibo-sec-sec-idind/EuroclearClearstreamCommonCode,
   :fibo-fnd-utl-av/adaptedFrom "http://www.isin.net/common-code-isin/",
   :fibo-fnd-utl-av/synonym "common code",
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
    {:owl/allValuesFrom {:owl/oneOf [:fibo-fbc-fct-eufseind/Clearstream
                                     :fibo-fbc-fct-eufseind/Euroclear],
                         :rdf/type  :owl/Class},
     :owl/onProperty    :fibo-fnd-rel-rel/isIssuedBy,
     :rdf/type          :owl/Restriction}
    {:owl/hasValue   :fibo-sec-sec-idind/EuroclearClearstreamCommonCodeScheme,
     :owl/onProperty :fibo-fnd-rel-rel/isDefinedIn,
     :rdf/type       :owl/Restriction}
    {:owl/onClass    :fibo-fbc-fi-fi/Security,
     :owl/onProperty :lcc-lr/identifies,
     :owl/qualifiedCardinality 1,
     :rdf/type       :owl/Restriction}
    {:owl/hasValue   :fibo-sec-sec-idind/CommonCodeRepository,
     :owl/onProperty :fibo-fbc-fct-ra/isRegisteredIn,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   "nine-character alphanumeric securities identifier, issued in Luxembourg, jointly by Euroclear and Clearstream"})

(def EuroclearClearstreamCommonCodeScheme
  "nine-digit security identification scheme, defined originally by Euroclear and CEDEL (now Clearstream) that is used to identify securities in Europe for the purposes of facilitating clearing and settlement of trades"
  {:db/ident :fibo-sec-sec-idind/EuroclearClearstreamCommonCodeScheme,
   :fibo-fnd-rel-rel/describes :fibo-sec-sec-idind/CommonCodeRepository,
   :fibo-fnd-utl-av/synonym "common code scheme",
   :rdf/type [:fibo-sec-sec-id/ProprietarySecurityIdentificationScheme
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "Euroclear Clearstream common code scheme",
   :skos/definition
   "nine-digit security identification scheme, defined originally by Euroclear and CEDEL (now Clearstream) that is used to identify securities in Europe for the purposes of facilitating clearing and settlement of trades"})

(def FinancialInstrumentGlobalIdentifier
  "financial instrument identifier that is defined as specified in the Object Management Group (OMG) Financial Instrument Global Identifier (FIGI) Specification"
  {:db/ident :fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifier,
   :fibo-fnd-utl-av/abbreviation "FIGI",
   :fibo-fnd-utl-av/explanatoryNote
   "While in most cases, a FIGI uniquely identifies a security, there are situations outside of the U.S. where it instead identifies a listing for a security, similarly to a ticker symbol.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "financial instrument global identifier",
   :rdfs/subClassOf
   [{:owl/hasValue   :fibo-fbc-fct-usfsind/BloombergLP,
     :owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
     :rdf/type       :owl/Restriction}
    {:owl/hasValue
     :fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifierScheme,
     :owl/onProperty :fibo-fnd-rel-rel/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/onProperty     :lcc-lr/identifies,
     :owl/someValuesFrom {:owl/unionOf [:fibo-fbc-fi-fi/FinancialInstrument
                                        :fibo-sec-sec-lst/Listing],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fct-ra/RegistryIdentifier
    {:owl/hasValue
     :fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifierRegistry,
     :owl/onProperty :fibo-fbc-fct-ra/isRegisteredIn,
     :rdf/type :owl/Restriction}
    {:owl/hasValue   :fibo-fbc-fct-usfsind/BloombergLP,
     :owl/onProperty :fibo-fbc-fct-ra/isRegisteredBy,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   "financial instrument identifier that is defined as specified in the Object Management Group (OMG) Financial Instrument Global Identifier (FIGI) Specification"})

(def FinancialInstrumentGlobalIdentifierRegistry
  "open, OMG standards-based registry used by the FIGI registration authority to manage the financial instrument identifiers and related information that it registers according to the Financial Instrument Global Identifier (FIGI) standard"
  {:db/ident :fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifierRegistry,
   :fibo-fnd-rel-rel/isManagedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-fnd-utl-av/abbreviation "FIGI Registry",
   :rdf/type [:fibo-fbc-fct-ra/Registry :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "Financial Instrument Global Identifier (FIGI) Registry",
   :rdfs/seeAlso ["http://www.openfigi.com/"],
   :skos/definition
   "open, OMG standards-based registry used by the FIGI registration authority to manage the financial instrument identifiers and related information that it registers according to the Financial Instrument Global Identifier (FIGI) standard"})

(def FinancialInstrumentGlobalIdentifierRegistryEntry
  "entry in a Financial Instrument Global Identifier (FIGI) registry"
  {:db/ident
   :fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifierRegistryEntry,
   :fibo-fnd-utl-av/abbreviation "FIGI registry entry",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "Financial Instrument Global Identifier (FIGI) registry entry",
   :rdfs/subClassOf
   [{:owl/onProperty :fibo-fnd-rel-rel/comprises,
     :owl/someValuesFrom
     :fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifier,
     :rdf/type :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/appliesTo,
     :owl/someValuesFrom {:owl/unionOf [:fibo-fbc-fi-fi/FinancialInstrument
                                        :fibo-sec-sec-lst/Listing],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/hasValue
     :fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifierRegistry,
     :owl/onProperty :fibo-fnd-rel-rel/isIncludedIn,
     :rdf/type :owl/Restriction}
    :fibo-fbc-fct-ra/RegistryEntry],
   :skos/definition
   "entry in a Financial Instrument Global Identifier (FIGI) registry"})

(def FinancialInstrumentGlobalIdentifierScheme
  "standard identification scheme for financial instrument identifiers (not limited to securities) and, in some cases, related listings, published by the Object Management Group (OMG)"
  {:db/ident :fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifierScheme,
   :fibo-fnd-rel-rel/describes
   :fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifierRegistry,
   :fibo-fnd-utl-av/abbreviation "FIGI scheme",
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
  {:db/ident :fibo-sec-sec-idind/FinancialTimesInteractiveDataScheme,
   :fibo-fnd-utl-av/abbreviation "FTID scheme",
   :rdf/type [:fibo-sec-sec-id/ProprietarySecurityIdentificationScheme
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "Financial Times interactive data scheme",
   :skos/definition
   "proprietary identification scheme for securities identifiers managed by the Financial Times"})

(def ReutersInstrumentCode
  "ticker-like identifier to identify financial instruments and indices owned, managed, and distributed by Thomson Reuters"
  {:db/ident :fibo-sec-sec-idind/ReutersInstrumentCode,
   :fibo-fnd-utl-av/abbreviation "RIC",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "Reuters instrument code",
   :rdfs/subClassOf [{:owl/hasValue
                      :fibo-sec-sec-idind/ReutersInstrumentCodeScheme,
                      :owl/onProperty :fibo-fnd-rel-rel/isDefinedIn,
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
  {:db/ident :fibo-sec-sec-idind/ReutersInstrumentCodeScheme,
   :fibo-fnd-utl-av/abbreviation "RIC scheme",
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
  {:db/ident :fibo-sec-sec-idind/StockExchangeDailyOfficialListCode,
   :fibo-fnd-utl-av/abbreviation "SEDOL code",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "Stock Exchange Daily Official List (SEDOL) code",
   :rdfs/subClassOf [{:owl/hasValue :fibo-fbc-fct-eufseind/LondonStockExchange,
                      :owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-sec-id/ProprietarySecurityIdentifier
                     :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumber
                     {:owl/hasValue :fibo-fbc-fct-eufseind/LondonStockExchange,
                      :owl/onProperty :fibo-fbc-fct-ra/isRegisteredBy,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-sec-id/ListedSecurityIdentifier
                     {:owl/hasValue
                      :fibo-sec-sec-idind/StockExchangeDailyOfficialListScheme,
                      :owl/onProperty :fibo-fnd-rel-rel/isDefinedIn,
                      :rdf/type :owl/Restriction}
                     {:owl/hasValue   :fibo-sec-sec-idind/SEDOLMasterFile,
                      :owl/onProperty :fibo-fbc-fct-ra/isRegisteredIn,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "seven-character security identifier, issued by the London Stock Exchange, that is the National Securities Identifying Number (NSIN) for securities issued in the United Kingdom, which is also part of the ISIN for the security it identifies"})

(def StockExchangeDailyOfficialListScheme
  "national security identification scheme used to identify all stocks and registered bonds in the United Kingdom for the purposes of facilitating clearing and settlement of trades"
  {:db/ident :fibo-sec-sec-idind/StockExchangeDailyOfficialListScheme,
   :fibo-fnd-rel-rel/describes :fibo-sec-sec-idind/SEDOLMasterFile,
   :fibo-fnd-utl-av/abbreviation "SEDOL scheme",
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
  {:db/ident :fibo-sec-sec-idind/TelekursId,
   :fibo-fnd-utl-av/explanatoryNote
   "The Telekurs Id was phased out in favor of the Valoren (Valor Nummer in Swiss German) in 2013.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "Telekurs Id",
   :rdfs/subClassOf
   [{:owl/hasValue   :fibo-sec-sec-idind/TelekursSecurityIdentifierScheme,
     :owl/onProperty :fibo-fnd-rel-rel/isDefinedIn,
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
  {:db/ident :fibo-sec-sec-idind/TelekursSecurityIdentifierScheme,
   :fibo-fnd-utl-av/abbreviation "Telekurs security ID scheme",
   :rdf/type [:fibo-sec-sec-id/ProprietarySecurityIdentificationScheme
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "Telekurs security identifier scheme",
   :skos/definition
   "proprietary identification scheme for securities identifiers formerly managed by SIX Telekurs Ltd, a subsidiary of the SIX Group (Swiss Infrastructure and eXchange), now SIX Financial Information AG"})

(def Valoren
  "identification number assigned to financial instruments in Switzerland, Liechtenstein and Belgium, issued by SIX Financial Information, that is the National Securities Identifying Number (NSIN) for securities issued in those countries and is also part of the ISIN for the security it identifies"
  {:db/ident :fibo-sec-sec-idind/Valoren,
   :fibo-fnd-utl-av/adaptedFrom "https://www.isin.net/valoren/",
   :fibo-fnd-utl-av/explanatoryNote
   "A VALOR code is between six and nine characters in length and like other securities identification codes (like ISIN, CUSIPs etc). A VALOR is utilized for identification purposes as well as clearing and settlement, similar to an ISIN code, and identifies debt and equity securities.",
   :fibo-fnd-utl-av/synonym [{:rdf/language "en",
                              :rdf/value    "Valoren Number"}
                             {:rdf/language "de",
                              :rdf/value    "Valor Nummer"}
                             {:rdf/language "en",
                              :rdf/value    "Valor Code"}
                             {:rdf/language "en",
                              :rdf/value    "Valoren Code"}
                             {:rdf/language "en",
                              :rdf/value    "Valor"}
                             {:rdf/language "de",
                              :rdf/value    "Valor"}],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "Valoren",
   :rdfs/seeAlso
   ["https://www.six-group.com/en/products-services/financial-information.html"],
   :rdfs/subClassOf
   [:fibo-sec-sec-id/ListedSecurityIdentifier
    {:owl/hasValue   :fibo-fbc-fct-eufseind/SIXFinancialInformation,
     :owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
     :rdf/type       :owl/Restriction}
    :fibo-sec-sec-id/ProprietarySecurityIdentifier
    :fibo-sec-sec-id/NationalSecuritiesIdentifyingNumber
    {:owl/hasValue   :fibo-fbc-fct-eufseind/SIXFinancialInformation,
     :owl/onProperty :fibo-fbc-fct-ra/isRegisteredBy,
     :rdf/type       :owl/Restriction}
    {:owl/hasValue   :fibo-sec-sec-idind/ValorenScheme,
     :owl/onProperty :fibo-fnd-rel-rel/isDefinedIn,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   "identification number assigned to financial instruments in Switzerland, Liechtenstein and Belgium, issued by SIX Financial Information, that is the National Securities Identifying Number (NSIN) for securities issued in those countries and is also part of the ISIN for the security it identifies"})

(def ValorenScheme
  "national security identification scheme used to identify equity and debt securities in Switzerland, Liechtenstein and Belgium for the purposes of facilitating clearing and settlement of trades"
  {:db/ident :fibo-sec-sec-idind/ValorenScheme,
   :fibo-fnd-utl-av/explanatoryNote
   "The VALOR number is a numeric code that intrinsically has no meaning. When a new VALOR is needed, the next one from the list is simply allocated. An instrument's number indicates nothing about the instrument itself.",
   :rdf/type [:fibo-sec-sec-id/SecurityIdentificationScheme
              :fibo-sec-sec-id/ProprietarySecurityIdentificationScheme
              :fibo-sec-sec-id/NationalSecurityIdentificationScheme
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfs/label "Valoren scheme",
   :skos/definition
   "national security identification scheme used to identify equity and debt securities in Switzerland, Liechtenstein and Belgium for the purposes of facilitating clearing and settlement of trades"})