(ns net.wikipunk.rdf.fibo-sec-eq-eqind
  "This ontology provides examples of how to represent simple equities."
  {:cmns-av/copyright ["Copyright (c) 2019-2023 EDM Council, Inc."
                       "Copyright (c) 2019-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :dcterms/abstract
   "This ontology provides examples of how to represent simple equities.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIdentification/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/ISO4217-CurrencyCodes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/MarketsIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIdentificationIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/AgentsAndPeople/Agents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Equities/EquityInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesListings/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Equities/EquitiesExampleIndividuals/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-ge-usj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/",
    "fibo-be-le-usee"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
    "fibo-fbc-fct-mkti"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/MarketsIndividuals/",
    "fibo-fbc-fct-ra"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
    "fibo-fbc-fct-usind"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
    "fibo-fbc-fct-usjrga"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/",
    "fibo-fbc-fct-usmkt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-acc-4217"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-eq-10962"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/",
    "fibo-sec-eq-eq"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
    "fibo-sec-eq-eqind"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
    "fibo-sec-sec-id"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/",
    "fibo-sec-sec-idind"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
    "fibo-sec-sec-iss"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/",
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
   :rdfa/prefix "fibo-sec-eq-eqind",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "Equities Example Individuals Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals.rdf version of this ontology was revised to address changes to the markets individuals ontology."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals.rdf version of this ontology was revised to replace equity issuer with share issuer."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals.rdf version of this ontology was modified to add CFI codes to the example equity instruments."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals.rdf version of this ontology was revised to add the share class to some of the examples, replace registered form with book entry (registered) form, and add detail to the common share and listing individuals."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."]})

(def AlphabetIncClassACommonStock
  "common share class that represents class A series shares in Alphabet Inc."
  {:db/ident :fibo-sec-eq-eqind/AlphabetIncClassACommonStock,
   :fibo-fbc-fct-ra/hasRegistrationDate "2015-10-02",
   :fibo-fbc-fi-fi/isDenominatedIn :fibo-fnd-acc-4217/USDollar,
   :fibo-fbc-fi-fi/isLegallyRecordedIn
   :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-fbc-fi-fi/isNegotiable true,
   :fibo-fnd-agr-ctr/hasPrincipalParty
   :fibo-sec-eq-eqind/AlphabetIncEquityIssuer,
   :fibo-fnd-agr-ctr/isAssignable false,
   :fibo-fnd-rel-rel/isIssuedBy :fibo-sec-eq-eqind/AlphabetIncEquityIssuer,
   :fibo-sec-eq-eq/hasShareClass "A",
   :fibo-sec-sec-iss/isIssuedInForm :fibo-sec-sec-iss/BookEntryForm,
   :fibo-sec-sec-iss/isRegisteredWith
   :fibo-fbc-fct-usjrga/SecuritiesAndExchangeRegulator,
   :fibo-sec-sec-lst/hasHomeExchange :fibo-fbc-fct-mkti/Facility-XNAS,
   :fibo-sec-sec-lst/hasOriginalPlaceOfListing :fibo-fbc-fct-mkti/Facility-XNAS,
   :fibo-sec-sec-lst/isListedVia
   :fibo-sec-eq-eqind/XNASListedAlphabetIncClassACommonStock,
   :lcc-cr/isClassifiedBy :fibo-sec-eq-10962/ESVUFR,
   :rdf/type
   [:fibo-sec-eq-eq/ListedShare
    :fibo-sec-eq-10962/CommonVotingUnrestrictedFullyPaidRegisteredShare
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "Alphabet Inc. class A common stock",
   :skos/definition
   "common share class that represents class A series shares in Alphabet Inc."})

(def AlphabetIncClassAFinancialInstrumentShortName
  "Alphabet Inc. class A common share financial instrument short name (FISN)"
  {:db/ident :fibo-sec-eq-eqind/AlphabetIncClassAFinancialInstrumentShortName,
   :fibo-sec-sec-iss/hasInstrumentDescription "SH CL A",
   :fibo-sec-sec-iss/hasIssuerShortName "ALPHABET INC",
   :lcc-lr/hasTag "ALPHABET INC/SH CL A",
   :lcc-lr/identifies :fibo-sec-eq-eqind/AlphabetIncClassACommonStock,
   :rdf/type [:fibo-sec-sec-iss/FinancialInstrumentShortName
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "Alphabet Inc. class A financial instrument short name",
   :skos/definition
   "Alphabet Inc. class A common share financial instrument short name (FISN)"})

(def AlphabetIncClassCCapitalStock
  "common share class that represents class C series shares in Alphabet Inc."
  {:db/ident :fibo-sec-eq-eqind/AlphabetIncClassCCapitalStock,
   :fibo-fbc-fct-ra/hasRegistrationDate "2015-10-02",
   :fibo-fbc-fi-fi/isDenominatedIn :fibo-fnd-acc-4217/USDollar,
   :fibo-fbc-fi-fi/isLegallyRecordedIn
   :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-fbc-fi-fi/isNegotiable true,
   :fibo-fnd-agr-ctr/hasPrincipalParty
   :fibo-sec-eq-eqind/AlphabetIncEquityIssuer,
   :fibo-fnd-agr-ctr/isAssignable false,
   :fibo-fnd-rel-rel/isIssuedBy :fibo-sec-eq-eqind/AlphabetIncEquityIssuer,
   :fibo-sec-eq-eq/hasShareClass "C",
   :fibo-sec-sec-iss/isIssuedInForm :fibo-sec-sec-iss/BookEntryForm,
   :fibo-sec-sec-iss/isRegisteredWith
   :fibo-fbc-fct-usjrga/SecuritiesAndExchangeRegulator,
   :fibo-sec-sec-lst/hasHomeExchange :fibo-fbc-fct-mkti/Facility-XNAS,
   :fibo-sec-sec-lst/hasOriginalPlaceOfListing :fibo-fbc-fct-mkti/Facility-XNAS,
   :fibo-sec-sec-lst/isListedVia
   :fibo-sec-eq-eqind/XNASListedAlphabetIncClassCCapitalStock,
   :lcc-cr/isClassifiedBy :fibo-sec-eq-10962/ESNUFR,
   :rdf/type
   [:owl/NamedIndividual
    :fibo-sec-eq-eq/ListedShare
    :fibo-sec-eq-10962/CommonNonVotingUnrestrictedFullyPaidRegisteredShare],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "Alphabet Inc. class C capital stock",
   :skos/definition
   "common share class that represents class C series shares in Alphabet Inc."})

(def AlphabetIncClassCFinancialInstrumentShortName
  "Alphabet Inc. class C capital stock financial instrument short name (FISN)"
  {:db/ident :fibo-sec-eq-eqind/AlphabetIncClassCFinancialInstrumentShortName,
   :fibo-sec-sec-iss/hasInstrumentDescription "SH CAP SH NV",
   :fibo-sec-sec-iss/hasIssuerShortName "ALPHABET INC",
   :lcc-lr/hasTag "ALPHABET INC/SH CAP SH NV",
   :lcc-lr/identifies :fibo-sec-eq-eqind/AlphabetIncClassCCapitalStock,
   :rdf/type [:fibo-sec-sec-iss/FinancialInstrumentShortName
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "Alphabet Inc. class C financial instrument short name",
   :skos/definition
   "Alphabet Inc. class C capital stock financial instrument short name (FISN)"})

(def AlphabetIncEquityIssuer
  "Alphabet Inc. functional entity that is an issuer of stock"
  {:db/ident :fibo-sec-eq-eqind/AlphabetIncEquityIssuer,
   :fibo-fnd-rel-rel/hasIdentity :fibo-be-le-usee/AlphabetInc-US-CA,
   :fibo-sec-sec-iss/hasIssuerShortName "ALPHABET INC",
   :rdf/type [:fibo-sec-eq-eq/ShareIssuer :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "Alphabet Inc. equity issuer",
   :skos/definition
   "Alphabet Inc. functional entity that is an issuer of stock"})

(def AppleIncCommonStock
  "common share class representing shares in Apple Inc."
  {:db/ident :fibo-sec-eq-eqind/AppleIncCommonStock,
   :fibo-fbc-fct-ra/hasRegistrationDate "1980-12-01",
   :fibo-fbc-fi-fi/isDenominatedIn :fibo-fnd-acc-4217/USDollar,
   :fibo-fbc-fi-fi/isLegallyRecordedIn
   :fibo-be-ge-usj/StateOfCaliforniaJurisdiction,
   :fibo-fbc-fi-fi/isNegotiable true,
   :fibo-fnd-agr-ctr/hasPrincipalParty :fibo-sec-eq-eqind/AppleIncEquityIssuer,
   :fibo-fnd-agr-ctr/isAssignable false,
   :fibo-fnd-rel-rel/isIssuedBy :fibo-sec-eq-eqind/AppleIncEquityIssuer,
   :fibo-sec-sec-iss/isIssuedInForm :fibo-sec-sec-iss/BookEntryForm,
   :fibo-sec-sec-iss/isRegisteredWith
   :fibo-fbc-fct-usjrga/SecuritiesAndExchangeRegulator,
   :fibo-sec-sec-lst/hasHomeExchange :fibo-fbc-fct-mkti/Facility-XNAS,
   :fibo-sec-sec-lst/hasOriginalPlaceOfListing :fibo-fbc-fct-mkti/Facility-XNAS,
   :fibo-sec-sec-lst/isListedVia
   [:fibo-sec-eq-eqind/XNASListedAppleIncCommonStock
    :fibo-sec-eq-eqind/XLOMListedAppleIncCommonStock],
   :lcc-cr/isClassifiedBy :fibo-sec-eq-10962/ESVUFR,
   :rdf/type
   [:fibo-sec-eq-10962/CommonVotingUnrestrictedFullyPaidRegisteredShare
    :owl/NamedIndividual
    :fibo-sec-eq-eq/ListedShare],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "Apple Inc. common stock",
   :skos/definition "common share class representing shares in Apple Inc."})

(def AppleIncCommonStockFinancialInstrumentShortName
  "Apple Inc. common stock financial instrument short name (FISN)"
  {:db/ident :fibo-sec-eq-eqind/AppleIncCommonStockFinancialInstrumentShortName,
   :fibo-sec-sec-iss/hasInstrumentDescription "SH SH",
   :fibo-sec-sec-iss/hasIssuerShortName "APPLE INC",
   :lcc-lr/hasTag "APPLE INC/SH SH",
   :lcc-lr/identifies :fibo-sec-eq-eqind/AppleIncCommonStock,
   :rdf/type [:fibo-sec-sec-iss/FinancialInstrumentShortName
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "Apple Inc. common stock financial instrument short name",
   :skos/definition
   "Apple Inc. common stock financial instrument short name (FISN)"})

(def AppleIncEquityIssuer
  "Apple Inc. functional entity that is an issuer of common stock"
  {:db/ident :fibo-sec-eq-eqind/AppleIncEquityIssuer,
   :fibo-fnd-rel-rel/hasIdentity :fibo-be-le-usee/AppleInc-US-CA,
   :fibo-sec-sec-iss/hasIssuerShortName "APPLE INC",
   :rdf/type [:fibo-sec-eq-eq/ShareIssuer :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "Apple Inc. common stock issuer",
   :skos/definition
   "Apple Inc. functional entity that is an issuer of common stock"})

(def BBG000B9Y5X2
  "Financial Instrument Global Identifier (FIGI) for Apple Inc. common shares listed in the Nasdaq (NASDAQ-NGS)"
  {:db/ident :fibo-sec-eq-eqind/BBG000B9Y5X2,
   :lcc-lr/hasTag "BBG000B9Y5X2",
   :lcc-lr/identifies :fibo-sec-eq-eqind/XNASListedAppleIncCommonStock,
   :rdf/type [:fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifier
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "BBG000B9Y5X2",
   :skos/definition
   "Financial Instrument Global Identifier (FIGI) for Apple Inc. common shares listed in the Nasdaq (NASDAQ-NGS)"})

(def BBG000BKZDM1
  "Financial Instrument Global Identifier (FIGI) for The Home Depot common shares listed in the New York Stock Exchange (NYSE)"
  {:db/ident :fibo-sec-eq-eqind/BBG000BKZDM1,
   :lcc-lr/hasTag "BBG000BKZDM1",
   :lcc-lr/identifies :fibo-sec-eq-eqind/XNYSListedTheHomeDepotIncCommonStock,
   :rdf/type [:fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifier
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "BBG000BKZDM1",
   :skos/definition
   "Financial Instrument Global Identifier (FIGI) for The Home Depot common shares listed in the New York Stock Exchange (NYSE)"})

(def BBG000BLNQ16
  "Financial Instrument Global Identifier (FIGI) for IBM common shares listed in the New York Stock Exchange (NYSE)"
  {:db/ident :fibo-sec-eq-eqind/BBG000BLNQ16,
   :lcc-lr/hasTag "BBG000BLNQ16",
   :lcc-lr/identifies
   :fibo-sec-eq-eqind/XNYSListedInternationalBusinessMachinesCorporationCommonStock,
   :rdf/type [:fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifier
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "BBG000BLNQ16",
   :skos/definition
   "Financial Instrument Global Identifier (FIGI) for IBM common shares listed in the New York Stock Exchange (NYSE)"})

(def BBG000BMX4N8
  "Financial Instrument Global Identifier (FIGI) for The Coca-Cola Company common shares listed in the New York Stock Exchange (NYSE)"
  {:db/ident :fibo-sec-eq-eqind/BBG000BMX4N8,
   :lcc-lr/hasTag "BBG000BMX4N8",
   :lcc-lr/identifies
   :fibo-sec-eq-eqind/XNYSListedTheCoca-ColaCompanyCommonStock,
   :rdf/type [:fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifier
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "BBG000BMX4N8",
   :skos/definition
   "Financial Instrument Global Identifier (FIGI) for The Coca-Cola Company common shares listed in the New York Stock Exchange (NYSE)"})

(def BBG000BR2WS4
  "Financial Instrument Global Identifier (FIGI) for The Proctor & Gamble Company common shares listed in the New York Stock Exchange (NYSE)"
  {:db/ident :fibo-sec-eq-eqind/BBG000BR2WS4,
   :lcc-lr/hasTag "BBG000BR2WS4",
   :lcc-lr/identifies
   :fibo-sec-eq-eqind/XNYSListedTheProctorAndGambleCompanyCommonStock,
   :rdf/type [:fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifier
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "BBG000BR2WS4",
   :skos/definition
   "Financial Instrument Global Identifier (FIGI) for The Proctor & Gamble Company common shares listed in the New York Stock Exchange (NYSE)"})

(def BBG000BWQFY7
  "Financial Instrument Global Identifier (FIGI) for Wells Fargo & Company common shares listed in the New York Stock Exchange (NYSE)"
  {:db/ident :fibo-sec-eq-eqind/BBG000BWQFY7,
   :lcc-lr/hasTag "BBG000BWQFY7",
   :lcc-lr/identifies :fibo-sec-eq-eqind/XNYSListedWellsFargoCommonStock,
   :rdf/type [:fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifier
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "BBG000BWQFY7",
   :skos/definition
   "Financial Instrument Global Identifier (FIGI) for Wells Fargo & Company common shares listed in the New York Stock Exchange (NYSE)"})

(def BBG000DMBZW1
  "Financial Instrument Global Identifier (FIGI) for JPMorgan Chase & Co. common shares listed in the New York Stock Exchange (NYSE)"
  {:db/ident :fibo-sec-eq-eqind/BBG000DMBZW1,
   :lcc-lr/hasTag "BBG000DMBZW1",
   :lcc-lr/identifies
   :fibo-sec-eq-eqind/XNYSListedJPMorganChaseAndCoCommonStock,
   :rdf/type [:fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifier
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "BBG000DMBZW1",
   :skos/definition
   "Financial Instrument Global Identifier (FIGI) for JPMorgan Chase & Co. common shares listed in the New York Stock Exchange (NYSE)"})

(def BBG000FY4VG8
  "Financial Instrument Global Identifier (FIGI) for Citigroup Inc. common shares listed in the New York Stock Exchange (NYSE)"
  {:db/ident :fibo-sec-eq-eqind/BBG000FY4VG8,
   :lcc-lr/hasTag "BBG000FY4VG8",
   :lcc-lr/identifies :fibo-sec-eq-eqind/XNYSListedCitigroupIncCommonStock,
   :rdf/type [:fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifier
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "BBG000FY4VG8",
   :skos/definition
   "Financial Instrument Global Identifier (FIGI) for Citigroup Inc. common shares listed in the New York Stock Exchange (NYSE)"})

(def BBG001S5MQ8
  "Financial Instrument Global Identifier (FIGI) for The Coca-Cola Company common shares"
  {:db/ident :fibo-sec-eq-eqind/BBG001S5MQ8,
   :lcc-lr/hasTag "BBG001S5MQ8",
   :lcc-lr/identifies :fibo-sec-eq-eqind/TheCoca-ColaCompanyCommonStock,
   :rdf/type [:fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifier
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "BBG001S5MQ8",
   :skos/definition
   "Financial Instrument Global Identifier (FIGI) for The Coca-Cola Company common shares"})

(def BBG001S5N8V8
  "Financial Instrument Global Identifier (FIGI) for Apple Inc. common shares"
  {:db/ident :fibo-sec-eq-eqind/BBG001S5N8V8,
   :lcc-lr/hasTag "BBG001S5N8V8",
   :lcc-lr/identifies :fibo-sec-eq-eqind/AppleIncCommonStock,
   :rdf/type [:fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifier
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "BBG001S5N8V8",
   :skos/definition
   "Financial Instrument Global Identifier (FIGI) for Apple Inc. common shares"})

(def BBG001S5RTW7
  "Financial Instrument Global Identifier (FIGI) for The Home Depot, Inc. common shares"
  {:db/ident :fibo-sec-eq-eqind/BBG001S5RTW7,
   :lcc-lr/hasTag "BBG001S5RTW7",
   :lcc-lr/identifies :fibo-sec-eq-eqind/TheHomeDepotIncCommonStock,
   :rdf/type [:fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifier
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "BBG001S5RTW7",
   :skos/definition
   "Financial Instrument Global Identifier (FIGI) for The Home Depot, Inc. common shares"})

(def BBG001S5S399
  "Financial Instrument Global Identifier (FIGI) for IBM common shares"
  {:db/ident :fibo-sec-eq-eqind/BBG001S5S399,
   :lcc-lr/hasTag "BBG001S5S399",
   :lcc-lr/identifies
   :fibo-sec-eq-eqind/InternationalBusinessMachinesCorporationCommonStock,
   :rdf/type [:fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifier
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "BBG001S5S399",
   :skos/definition
   "Financial Instrument Global Identifier (FIGI) for IBM common shares"})

(def BBG001S5V4L9
  "Financial Instrument Global Identifier (FIGI) for The Proctor & Gamble Company common shares"
  {:db/ident :fibo-sec-eq-eqind/BBG001S5V4L9,
   :lcc-lr/hasTag "BBG001S5V4L9",
   :lcc-lr/identifies :fibo-sec-eq-eqind/TheProctorAndGambleCompanyCommonStock,
   :rdf/type [:fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifier
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "BBG001S5V4L9",
   :skos/definition
   "Financial Instrument Global Identifier (FIGI) for The Proctor & Gamble Company common shares"})

(def BBG001S5XF23
  "Financial Instrument Global Identifier (FIGI) for Wells Fargo & Company common shares"
  {:db/ident :fibo-sec-eq-eqind/BBG001S5XF23,
   :lcc-lr/hasTag "BBG001S5XF23",
   :lcc-lr/identifies :fibo-sec-eq-eqind/WellsFargoCommonStock,
   :rdf/type [:fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifier
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "BBG001S5XF23",
   :skos/definition
   "Financial Instrument Global Identifier (FIGI) for Wells Fargo & Company common shares"})

(def BBG001S72ZG4
  "Financial Instrument Global Identifier (FIGI) for Citigroup Inc. common shares"
  {:db/ident :fibo-sec-eq-eqind/BBG001S72ZG4,
   :lcc-lr/hasTag "BBG001S72ZG4",
   :lcc-lr/identifies :fibo-sec-eq-eqind/CitigroupIncCommonStock,
   :rdf/type [:fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifier
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "BBG001S72ZG4",
   :skos/definition
   "Financial Instrument Global Identifier (FIGI) for Citigroup Inc. common shares"})

(def BBG001S8CRC3
  "Financial Instrument Global Identifier (FIGI) for JPMorgan Chase & Co. common shares"
  {:db/ident :fibo-sec-eq-eqind/BBG001S8CRC3,
   :lcc-lr/hasTag "BBG001S8CRC3",
   :lcc-lr/identifies :fibo-sec-eq-eqind/JPMorganChaseAndCoCommonStock,
   :rdf/type [:fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifier
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "BBG001S8CRC3",
   :skos/definition
   "Financial Instrument Global Identifier (FIGI) for JPMorgan Chase & Co. common shares"})

(def BBG009S39JY5
  "Financial Instrument Global Identifier (FIGI) for Alphabet Inc. class A common shares"
  {:db/ident :fibo-sec-eq-eqind/BBG009S39JY5,
   :lcc-lr/hasTag "BBG009S39JY5",
   :lcc-lr/identifies :fibo-sec-eq-eqind/AlphabetIncClassACommonStock,
   :rdf/type [:fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifier
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "BBG009S39JY5",
   :skos/definition
   "Financial Instrument Global Identifier (FIGI) for Alphabet Inc. class A common shares"})

(def BBG009S3NB21
  "Financial Instrument Global Identifier (FIGI) for Alphabet Inc. class C common shares"
  {:db/ident :fibo-sec-eq-eqind/BBG009S3NB21,
   :lcc-lr/hasTag "BBG009S3NB21",
   :lcc-lr/identifies :fibo-sec-eq-eqind/AlphabetIncClassCCapitalStock,
   :rdf/type [:fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifier
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "BBG009S3NB21",
   :skos/definition
   "Financial Instrument Global Identifier (FIGI) for Alphabet Inc. class C common shares"})

(def BBG009S4MT03
  "Financial Instrument Global Identifier (FIGI) for Alphabet Inc. class A common shares listed in the Nasdaq (NASDAQ-NGS)"
  {:db/ident :fibo-sec-eq-eqind/BBG009S4MT03,
   :lcc-lr/hasTag "BBG009S4MT03",
   :lcc-lr/identifies :fibo-sec-eq-eqind/XNASListedAlphabetIncClassACommonStock,
   :rdf/type [:fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifier
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "BBG009S4MT03",
   :skos/definition
   "Financial Instrument Global Identifier (FIGI) for Alphabet Inc. class A common shares listed in the Nasdaq (NASDAQ-NGS)"})

(def BBG009S4MVF2
  "Financial Instrument Global Identifier (FIGI) for Alphabet Inc. class C common shares listed in the Nasdaq (NASDAQ-NGS)"
  {:db/ident :fibo-sec-eq-eqind/BBG009S4MVF2,
   :lcc-lr/hasTag "BBG009S4MVF2",
   :lcc-lr/identifies
   :fibo-sec-eq-eqind/XNASListedAlphabetIncClassCCapitalStock,
   :rdf/type [:fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifier
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "BBG009S4MVF2",
   :skos/definition
   "Financial Instrument Global Identifier (FIGI) for Alphabet Inc. class C common shares listed in the Nasdaq (NASDAQ-NGS)"})

(def BBG00JPR0LX8
  "Financial Instrument Global Identifier (FIGI) for Apple Inc. common shares listed in the London Stock Exchange"
  {:db/ident :fibo-sec-eq-eqind/BBG00JPR0LX8,
   :lcc-lr/hasTag "BBG00JPR0LX8",
   :lcc-lr/identifies :fibo-sec-eq-eqind/XLOMListedAppleIncCommonStock,
   :rdf/type [:fibo-sec-sec-idind/FinancialInstrumentGlobalIdentifier
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "BBG00JPR0LX8",
   :skos/definition
   "Financial Instrument Global Identifier (FIGI) for Apple Inc. common shares listed in the London Stock Exchange"})

(def CUSIP-02079K107
  "Alphabet Inc. class C common share CUSIP"
  {:db/ident :fibo-sec-eq-eqind/CUSIP-02079K107,
   :lcc-lr/hasTag "02079K107",
   :lcc-lr/identifies :fibo-sec-eq-eqind/AlphabetIncClassCCapitalStock,
   :rdf/type
   [:fibo-sec-sec-idind/CommitteeOnUniformSecuritiesIdentificationProceduresNumber
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "02079K107",
   :skos/definition "Alphabet Inc. class C common share CUSIP"})

(def CUSIP-02079K305
  "Alphabet Inc. class A common share CUSIP"
  {:db/ident :fibo-sec-eq-eqind/CUSIP-02079K305,
   :lcc-lr/hasTag "02079K305",
   :lcc-lr/identifies :fibo-sec-eq-eqind/AlphabetIncClassACommonStock,
   :rdf/type
   [:fibo-sec-sec-idind/CommitteeOnUniformSecuritiesIdentificationProceduresNumber
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "02079K305",
   :skos/definition "Alphabet Inc. class A common share CUSIP"})

(def CUSIP-037833100
  "Apple Inc. common share CUSIP"
  {:db/ident :fibo-sec-eq-eqind/CUSIP-037833100,
   :lcc-lr/hasTag "037833100",
   :lcc-lr/identifies :fibo-sec-eq-eqind/AppleIncCommonStock,
   :rdf/type
   [:fibo-sec-sec-idind/CommitteeOnUniformSecuritiesIdentificationProceduresNumber
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "037833100",
   :skos/definition "Apple Inc. common share CUSIP"})

(def CUSIP-172967424
  "Citigroup Inc. common share CUSIP"
  {:db/ident :fibo-sec-eq-eqind/CUSIP-172967424,
   :lcc-lr/hasTag "172967424",
   :lcc-lr/identifies :fibo-sec-eq-eqind/CitigroupIncCommonStock,
   :rdf/type
   [:fibo-sec-sec-idind/CommitteeOnUniformSecuritiesIdentificationProceduresNumber
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "172967424",
   :skos/definition "Citigroup Inc. common share CUSIP"})

(def CUSIP-191216100
  "The Coca-Cola Company common share CUSIP"
  {:db/ident :fibo-sec-eq-eqind/CUSIP-191216100,
   :lcc-lr/hasTag "191216100",
   :lcc-lr/identifies :fibo-sec-eq-eqind/TheCoca-ColaCompanyCommonStock,
   :rdf/type
   [:fibo-sec-sec-idind/CommitteeOnUniformSecuritiesIdentificationProceduresNumber
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "191216100",
   :skos/definition "The Coca-Cola Company common share CUSIP"})

(def CUSIP-437076102
  "The Home Depot, Inc. common share CUSIP"
  {:db/ident :fibo-sec-eq-eqind/CUSIP-437076102,
   :lcc-lr/hasTag "437076102",
   :lcc-lr/identifies :fibo-sec-eq-eqind/TheHomeDepotIncCommonStock,
   :rdf/type
   [:fibo-sec-sec-idind/CommitteeOnUniformSecuritiesIdentificationProceduresNumber
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "437076102",
   :skos/definition "The Home Depot, Inc. common share CUSIP"})

(def CUSIP-459200101
  "IBM common share CUSIP"
  {:db/ident :fibo-sec-eq-eqind/CUSIP-459200101,
   :lcc-lr/hasTag "459200101",
   :lcc-lr/identifies
   :fibo-sec-eq-eqind/InternationalBusinessMachinesCorporationCommonStock,
   :rdf/type
   [:fibo-sec-sec-idind/CommitteeOnUniformSecuritiesIdentificationProceduresNumber
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "459200101",
   :skos/definition "IBM common share CUSIP"})

(def CUSIP-46625H100
  "JPMorgan Chase & Co. common share CUSIP"
  {:db/ident :fibo-sec-eq-eqind/CUSIP-46625H100,
   :lcc-lr/hasTag "46625H100",
   :lcc-lr/identifies :fibo-sec-eq-eqind/JPMorganChaseAndCoCommonStock,
   :rdf/type
   [:fibo-sec-sec-idind/CommitteeOnUniformSecuritiesIdentificationProceduresNumber
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "46625H100",
   :skos/definition "JPMorgan Chase & Co. common share CUSIP"})

(def CUSIP-742718109
  "The Proctor & Gamble Company common share CUSIP"
  {:db/ident :fibo-sec-eq-eqind/CUSIP-742718109,
   :lcc-lr/hasTag "742718109",
   :lcc-lr/identifies :fibo-sec-eq-eqind/TheProctorAndGambleCompanyCommonStock,
   :rdf/type
   [:fibo-sec-sec-idind/CommitteeOnUniformSecuritiesIdentificationProceduresNumber
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "742718109",
   :skos/definition "The Proctor & Gamble Company common share CUSIP"})

(def CUSIP-949746101
  "Wells Fargo & Company common share CUSIP"
  {:db/ident :fibo-sec-eq-eqind/CUSIP-949746101,
   :lcc-lr/hasTag "949746101",
   :lcc-lr/identifies :fibo-sec-eq-eqind/WellsFargoCommonStock,
   :rdf/type
   [:fibo-sec-sec-idind/CommitteeOnUniformSecuritiesIdentificationProceduresNumber
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "949746101",
   :skos/definition "Wells Fargo & Company common share CUSIP"})

(def CitigroupIncCommonStock
  "common share class representing shares in Citigroup Inc."
  {:db/ident :fibo-sec-eq-eqind/CitigroupIncCommonStock,
   :fibo-fbc-fct-ra/hasRegistrationDate "1998-09-29",
   :fibo-fbc-fi-fi/isDenominatedIn :fibo-fnd-acc-4217/USDollar,
   :fibo-fbc-fi-fi/isLegallyRecordedIn
   :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-fbc-fi-fi/isNegotiable true,
   :fibo-fnd-agr-ctr/hasPrincipalParty
   :fibo-sec-eq-eqind/CitigroupIncEquityIssuer,
   :fibo-fnd-agr-ctr/isAssignable false,
   :fibo-fnd-rel-rel/isIssuedBy :fibo-sec-eq-eqind/CitigroupIncEquityIssuer,
   :fibo-sec-sec-iss/isIssuedInForm [:fibo-sec-sec-iss/BearerAndRegisteredForm
                                     :fibo-sec-sec-iss/BookEntryForm],
   :fibo-sec-sec-iss/isRegisteredWith
   :fibo-fbc-fct-usjrga/SecuritiesAndExchangeRegulator,
   :fibo-sec-sec-lst/hasHomeExchange :fibo-fbc-fct-mkti/Facility-XNYS,
   :fibo-sec-sec-lst/hasOriginalPlaceOfListing :fibo-fbc-fct-mkti/Facility-XNYS,
   :fibo-sec-sec-lst/isListedVia
   :fibo-sec-eq-eqind/XNYSListedCitigroupIncCommonStock,
   :lcc-cr/isClassifiedBy :fibo-sec-eq-10962/ESVUFR,
   :rdf/type
   [:fibo-sec-eq-eq/ListedShare
    :fibo-sec-eq-10962/CommonVotingUnrestrictedFullyPaidRegisteredShare
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "Citigroup Inc. common stock",
   :skos/definition "common share class representing shares in Citigroup Inc."})

(def CitigroupIncCommonStockFinancialInstrumentShortName
  "Citigroup Inc. common stock financial instrument short name (FISN)"
  {:db/ident
   :fibo-sec-eq-eqind/CitigroupIncCommonStockFinancialInstrumentShortName,
   :fibo-sec-sec-iss/hasInstrumentDescription "SH",
   :fibo-sec-sec-iss/hasIssuerShortName "CITIGROUP INC",
   :lcc-lr/hasTag "CITIGROUP INC/SH",
   :lcc-lr/identifies :fibo-sec-eq-eqind/CitigroupIncCommonStock,
   :rdf/type [:fibo-sec-sec-iss/FinancialInstrumentShortName
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "Citigroup Inc. common stock financial instrument short name",
   :skos/definition
   "Citigroup Inc. common stock financial instrument short name (FISN)"})

(def CitigroupIncEquityIssuer
  "Citigroup Inc. functional entity that is an issuer of common stock"
  {:db/ident :fibo-sec-eq-eqind/CitigroupIncEquityIssuer,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usind/CitigroupInc-US-DE,
   :fibo-sec-sec-iss/hasIssuerShortName "CITIGROUP INC",
   :rdf/type [:fibo-sec-eq-eq/ShareIssuer :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "Citigroup Inc. common stock issuer",
   :skos/definition
   "Citigroup Inc. functional entity that is an issuer of common stock"})

(def ISIN-US02079K1079
  "Alphabet Inc. class C common share ISIN"
  {:db/ident :fibo-sec-eq-eqind/ISIN-US02079K1079,
   :lcc-lr/hasTag "US02079K1079",
   :lcc-lr/identifies :fibo-sec-eq-eqind/AlphabetIncClassCCapitalStock,
   :rdf/type [:fibo-sec-sec-id/InternationalSecuritiesIdentificationNumber
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "US02079K1079",
   :skos/definition "Alphabet Inc. class C common share ISIN"})

(def ISIN-US02079K3059
  "Alphabet Inc. class A common share ISIN"
  {:db/ident :fibo-sec-eq-eqind/ISIN-US02079K3059,
   :lcc-lr/hasTag "US02079K3059",
   :lcc-lr/identifies :fibo-sec-eq-eqind/AlphabetIncClassACommonStock,
   :rdf/type [:fibo-sec-sec-id/InternationalSecuritiesIdentificationNumber
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "US02079K3059",
   :skos/definition "Alphabet Inc. class A common share ISIN"})

(def ISIN-US0378331005
  "Apple Inc. common share ISIN"
  {:db/ident :fibo-sec-eq-eqind/ISIN-US0378331005,
   :lcc-lr/hasTag "US0378331005",
   :lcc-lr/identifies :fibo-sec-eq-eqind/AppleIncCommonStock,
   :rdf/type [:fibo-sec-sec-id/InternationalSecuritiesIdentificationNumber
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "US0378331005",
   :skos/definition "Apple Inc. common share ISIN"})

(def ISIN-US1729674242
  "Citigroup Inc. common share ISIN"
  {:db/ident :fibo-sec-eq-eqind/ISIN-US1729674242,
   :lcc-lr/hasTag "US1729674242",
   :lcc-lr/identifies :fibo-sec-eq-eqind/CitigroupIncCommonStock,
   :rdf/type [:fibo-sec-sec-id/InternationalSecuritiesIdentificationNumber
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "US1729674242",
   :skos/definition "Citigroup Inc. common share ISIN"})

(def ISIN-US1912161007
  "The Coca-Cola Company common share ISIN"
  {:db/ident :fibo-sec-eq-eqind/ISIN-US1912161007,
   :lcc-lr/hasTag "US1912161007",
   :lcc-lr/identifies :fibo-sec-eq-eqind/TheCoca-ColaCompanyCommonStock,
   :rdf/type [:fibo-sec-sec-id/InternationalSecuritiesIdentificationNumber
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "US1912161007",
   :skos/definition "The Coca-Cola Company common share ISIN"})

(def ISIN-US4370761029
  "The Home Depot, Inc. common share ISIN"
  {:db/ident :fibo-sec-eq-eqind/ISIN-US4370761029,
   :lcc-lr/hasTag "US4370761029",
   :lcc-lr/identifies :fibo-sec-eq-eqind/TheHomeDepotIncCommonStock,
   :rdf/type [:fibo-sec-sec-id/InternationalSecuritiesIdentificationNumber
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "US4370761029",
   :skos/definition "The Home Depot, Inc. common share ISIN"})

(def ISIN-US4592001014
  "IBM common share ISIN"
  {:db/ident :fibo-sec-eq-eqind/ISIN-US4592001014,
   :lcc-lr/hasTag "US4592001014",
   :lcc-lr/identifies
   :fibo-sec-eq-eqind/InternationalBusinessMachinesCorporationCommonStock,
   :rdf/type [:fibo-sec-sec-id/InternationalSecuritiesIdentificationNumber
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "US4592001014",
   :skos/definition "IBM common share ISIN"})

(def ISIN-US46625H1005
  "JPMorgan Chase & Co. common share ISIN"
  {:db/ident :fibo-sec-eq-eqind/ISIN-US46625H1005,
   :lcc-lr/hasTag "US46625H1005",
   :lcc-lr/identifies :fibo-sec-eq-eqind/JPMorganChaseAndCoCommonStock,
   :rdf/type [:fibo-sec-sec-id/InternationalSecuritiesIdentificationNumber
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "US46625H1005",
   :skos/definition "JPMorgan Chase & Co. common share ISIN"})

(def ISIN-US7427181091
  "The Proctor & Gamble Company common share ISIN"
  {:db/ident :fibo-sec-eq-eqind/ISIN-US7427181091,
   :lcc-lr/hasTag "US7427181091",
   :lcc-lr/identifies :fibo-sec-eq-eqind/TheProctorAndGambleCompanyCommonStock,
   :rdf/type [:fibo-sec-sec-id/InternationalSecuritiesIdentificationNumber
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "US7427181091",
   :skos/definition "The Proctor & Gamble Company common share ISIN"})

(def ISIN-US9497461015
  "Wells Fargo & Company common share ISIN"
  {:db/ident :fibo-sec-eq-eqind/ISIN-US9497461015,
   :lcc-lr/hasTag "US9497461015",
   :lcc-lr/identifies :fibo-sec-eq-eqind/WellsFargoCommonStock,
   :rdf/type [:fibo-sec-sec-id/InternationalSecuritiesIdentificationNumber
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "US9497461015",
   :skos/definition "Wells Fargo & Company common share ISIN"})

(def InternationalBusinessMachinesCorporationCommonStock
  "common share class representing shares in International Business Machines Corporation"
  {:db/ident
   :fibo-sec-eq-eqind/InternationalBusinessMachinesCorporationCommonStock,
   :fibo-fbc-fi-fi/isDenominatedIn :fibo-fnd-acc-4217/USDollar,
   :fibo-fbc-fi-fi/isLegallyRecordedIn
   :fibo-be-ge-usj/StateOfNewYorkJurisdiction,
   :fibo-fbc-fi-fi/isNegotiable true,
   :fibo-fnd-agr-ctr/hasPrincipalParty
   :fibo-sec-eq-eqind/InternationalBusinessMachinesCorporationEquityIssuer,
   :fibo-fnd-agr-ctr/isAssignable false,
   :fibo-fnd-rel-rel/isIssuedBy
   :fibo-sec-eq-eqind/InternationalBusinessMachinesCorporationEquityIssuer,
   :fibo-sec-sec-iss/isIssuedInForm [:fibo-sec-sec-iss/BearerAndRegisteredForm
                                     :fibo-sec-sec-iss/BookEntryForm],
   :fibo-sec-sec-iss/isRegisteredWith
   :fibo-fbc-fct-usjrga/SecuritiesAndExchangeRegulator,
   :fibo-sec-sec-lst/hasHomeExchange :fibo-fbc-fct-mkti/Facility-XNYS,
   :fibo-sec-sec-lst/hasOriginalPlaceOfListing :fibo-fbc-fct-mkti/Facility-XNYS,
   :fibo-sec-sec-lst/isListedVia
   :fibo-sec-eq-eqind/XNYSListedInternationalBusinessMachinesCorporationCommonStock,
   :lcc-cr/isClassifiedBy :fibo-sec-eq-10962/ESVUFR,
   :rdf/type
   [:owl/NamedIndividual
    :fibo-sec-eq-eq/ListedShare
    :fibo-sec-eq-10962/CommonVotingUnrestrictedFullyPaidRegisteredShare],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "International Business Machines Corporation common stock",
   :skos/definition
   "common share class representing shares in International Business Machines Corporation"})

(def
  InternationalBusinessMachinesCorporationCommonStockFinancialInstrumentShortName
  "IBM common stock financial instrument short name (FISN)"
  {:db/ident
   :fibo-sec-eq-eqind/InternationalBusinessMachinesCorporationCommonStockFinancialInstrumentShortName,
   :fibo-sec-sec-iss/hasInstrumentDescription "SH",
   :fibo-sec-sec-iss/hasIssuerShortName "INTL BUS MACHIN",
   :lcc-lr/hasTag "INTL BUS MACHIN/SH",
   :lcc-lr/identifies
   :fibo-sec-eq-eqind/InternationalBusinessMachinesCorporationCommonStock,
   :rdf/type [:fibo-sec-sec-iss/FinancialInstrumentShortName
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label
   "International Business Machines Corporation common stock financial instrument short name",
   :skos/definition "IBM common stock financial instrument short name (FISN)"})

(def InternationalBusinessMachinesCorporationEquityIssuer
  "IBM functional entity that is an issuer of common stock"
  {:db/ident
   :fibo-sec-eq-eqind/InternationalBusinessMachinesCorporationEquityIssuer,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-be-le-usee/InternationalBusinessMachinesCorporation-US-NY,
   :fibo-sec-sec-iss/hasIssuerShortName "INTL BUS MACHIN",
   :rdf/type [:fibo-sec-eq-eq/ShareIssuer :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label
   "International Business Machines Corporation common stock issuer",
   :skos/definition "IBM functional entity that is an issuer of common stock"})

(def JPMorganChaseAndCoCommonStock
  "common share class representing shares in J.P. Morgan Chase & Co."
  {:db/ident :fibo-sec-eq-eqind/JPMorganChaseAndCoCommonStock,
   :fibo-fbc-fct-ra/hasRegistrationDate "2000-12-28",
   :fibo-fbc-fi-fi/isDenominatedIn :fibo-fnd-acc-4217/USDollar,
   :fibo-fbc-fi-fi/isLegallyRecordedIn
   :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-fbc-fi-fi/isNegotiable true,
   :fibo-fnd-agr-ctr/hasPrincipalParty
   :fibo-sec-eq-eqind/JPMorganChaseAndCoEquityIssuer,
   :fibo-fnd-agr-ctr/isAssignable false,
   :fibo-fnd-rel-rel/isIssuedBy
   :fibo-sec-eq-eqind/JPMorganChaseAndCoEquityIssuer,
   :fibo-sec-sec-iss/isIssuedInForm [:fibo-sec-sec-iss/BearerAndRegisteredForm
                                     :fibo-sec-sec-iss/BookEntryForm],
   :fibo-sec-sec-iss/isRegisteredWith
   :fibo-fbc-fct-usjrga/SecuritiesAndExchangeRegulator,
   :fibo-sec-sec-lst/hasHomeExchange :fibo-fbc-fct-mkti/Facility-XNYS,
   :fibo-sec-sec-lst/hasOriginalPlaceOfListing :fibo-fbc-fct-mkti/Facility-XNYS,
   :fibo-sec-sec-lst/isListedVia
   :fibo-sec-eq-eqind/XNYSListedJPMorganChaseAndCoCommonStock,
   :lcc-cr/isClassifiedBy :fibo-sec-eq-10962/ESVUFR,
   :rdf/type
   [:owl/NamedIndividual
    :fibo-sec-eq-10962/CommonVotingUnrestrictedFullyPaidRegisteredShare
    :fibo-sec-eq-eq/ListedShare],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "JPMorgan Chase & Co. common stock",
   :skos/definition
   "common share class representing shares in J.P. Morgan Chase & Co."})

(def JPMorganChaseAndCoCommonStockFinancialInstrumentShortName
  "J.P. Morgan Chase & Co. common stock financial instrument short name (FISN)"
  {:db/ident
   :fibo-sec-eq-eqind/JPMorganChaseAndCoCommonStockFinancialInstrumentShortName,
   :fibo-sec-sec-iss/hasInstrumentDescription "SH",
   :fibo-sec-sec-iss/hasIssuerShortName "JPMORGAN CHASE",
   :lcc-lr/hasTag "JPMORGAN CHASE/SH",
   :lcc-lr/identifies :fibo-sec-eq-eqind/JPMorganChaseAndCoCommonStock,
   :rdf/type [:fibo-sec-sec-iss/FinancialInstrumentShortName
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label
   "J.P. Morgan Chase & Co. common stock financial instrument short name",
   :skos/definition
   "J.P. Morgan Chase & Co. common stock financial instrument short name (FISN)"})

(def JPMorganChaseAndCoEquityIssuer
  "J.P. Morgan Chase & Co. functional entity that is an issuer of common stock"
  {:db/ident :fibo-sec-eq-eqind/JPMorganChaseAndCoEquityIssuer,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usind/JPMorganChaseAndCo-US-DE,
   :fibo-sec-sec-iss/hasIssuerShortName "JPMORGAN CHASE",
   :rdf/type [:fibo-sec-eq-eq/ShareIssuer :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "J.P. Morgan Chase & Co. common stock issuer",
   :skos/definition
   "J.P. Morgan Chase & Co. functional entity that is an issuer of common stock"})

(def SEDOL-B0YQ5W0
  "Apple Inc. common share SEDOL listed in the London Stock Exchange"
  {:db/ident :fibo-sec-eq-eqind/SEDOL-B0YQ5W0,
   :lcc-lr/hasTag "B0YQ5W0",
   :lcc-lr/identifies :fibo-sec-eq-eqind/XLOMListedAppleIncCommonStock,
   :rdf/type [:fibo-sec-sec-idind/StockExchangeDailyOfficialListCode
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "B0YQ5W0",
   :skos/definition
   "Apple Inc. common share SEDOL listed in the London Stock Exchange"})

(def TheCoca-ColaCompanyCommonStock
  "common share class representing shares in The Coca-Cola Company"
  {:db/ident :fibo-sec-eq-eqind/TheCoca-ColaCompanyCommonStock,
   :fibo-fbc-fi-fi/isDenominatedIn :fibo-fnd-acc-4217/USDollar,
   :fibo-fbc-fi-fi/isLegallyRecordedIn
   :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-fbc-fi-fi/isNegotiable true,
   :fibo-fnd-agr-ctr/hasPrincipalParty
   :fibo-sec-eq-eqind/TheCoca-ColaCompanyEquityIssuer,
   :fibo-fnd-agr-ctr/isAssignable false,
   :fibo-fnd-rel-rel/isIssuedBy
   :fibo-sec-eq-eqind/TheCoca-ColaCompanyEquityIssuer,
   :fibo-sec-sec-iss/isIssuedInForm [:fibo-sec-sec-iss/BookEntryForm
                                     :fibo-sec-sec-iss/BearerAndRegisteredForm],
   :fibo-sec-sec-iss/isRegisteredWith
   :fibo-fbc-fct-usjrga/SecuritiesAndExchangeRegulator,
   :fibo-sec-sec-lst/hasHomeExchange :fibo-fbc-fct-mkti/Facility-XNYS,
   :fibo-sec-sec-lst/hasOriginalPlaceOfListing :fibo-fbc-fct-mkti/Facility-XNYS,
   :fibo-sec-sec-lst/isListedVia
   :fibo-sec-eq-eqind/XNYSListedTheCoca-ColaCompanyCommonStock,
   :lcc-cr/isClassifiedBy :fibo-sec-eq-10962/ESVUFR,
   :rdf/type
   [:owl/NamedIndividual
    :fibo-sec-eq-10962/CommonVotingUnrestrictedFullyPaidRegisteredShare
    :fibo-sec-eq-eq/ListedShare],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "The Coca-Cola Company common stock",
   :skos/definition
   "common share class representing shares in The Coca-Cola Company"})

(def TheCoca-ColaCompanyCommonStockFinancialInstrumentShortName
  "The Coca-Cola Company common stock financial instrument short name (FISN)"
  {:db/ident
   :fibo-sec-eq-eqind/TheCoca-ColaCompanyCommonStockFinancialInstrumentShortName,
   :fibo-sec-sec-iss/hasInstrumentDescription "SH",
   :fibo-sec-sec-iss/hasIssuerShortName "COCA COLA CO",
   :lcc-lr/hasTag "COCA COLA CO/SH",
   :lcc-lr/identifies :fibo-sec-eq-eqind/TheCoca-ColaCompanyCommonStock,
   :rdf/type [:fibo-sec-sec-iss/FinancialInstrumentShortName
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label
   "The Coca-Cola Company common stock financial instrument short name",
   :skos/definition
   "The Coca-Cola Company common stock financial instrument short name (FISN)"})

(def TheCoca-ColaCompanyEquityIssuer
  "The Coca-Cola Company functional entity that is an issuer of common stock"
  {:db/ident :fibo-sec-eq-eqind/TheCoca-ColaCompanyEquityIssuer,
   :fibo-fnd-rel-rel/hasIdentity :fibo-be-le-usee/TheCoca-ColaCompany-US-DE,
   :fibo-sec-sec-iss/hasIssuerShortName "COCA COLA CO",
   :rdf/type [:fibo-sec-eq-eq/ShareIssuer :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "The Coca-Cola Company common stock issuer",
   :skos/definition
   "The Coca-Cola Company functional entity that is an issuer of common stock"})

(def TheHomeDepotIncCommonStock
  "common share class representing shares in The Home Depot, Inc."
  {:db/ident :fibo-sec-eq-eqind/TheHomeDepotIncCommonStock,
   :fibo-fbc-fct-ra/hasRegistrationDate "1981-09-22",
   :fibo-fbc-fi-fi/isDenominatedIn :fibo-fnd-acc-4217/USDollar,
   :fibo-fbc-fi-fi/isLegallyRecordedIn
   :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-fbc-fi-fi/isNegotiable true,
   :fibo-fnd-agr-ctr/hasPrincipalParty
   :fibo-sec-eq-eqind/TheHomeDepotIncEquityIssuer,
   :fibo-fnd-agr-ctr/isAssignable false,
   :fibo-fnd-rel-rel/isIssuedBy :fibo-sec-eq-eqind/TheHomeDepotIncEquityIssuer,
   :fibo-sec-sec-iss/isIssuedInForm [:fibo-sec-sec-iss/BookEntryForm
                                     :fibo-sec-sec-iss/BearerAndRegisteredForm],
   :fibo-sec-sec-iss/isRegisteredWith
   :fibo-fbc-fct-usjrga/SecuritiesAndExchangeRegulator,
   :fibo-sec-sec-lst/hasHomeExchange :fibo-fbc-fct-mkti/Facility-XNYS,
   :fibo-sec-sec-lst/hasOriginalPlaceOfListing :fibo-fbc-fct-mkti/Facility-XNAS,
   :fibo-sec-sec-lst/isListedVia
   :fibo-sec-eq-eqind/XNYSListedTheHomeDepotIncCommonStock,
   :lcc-cr/isClassifiedBy :fibo-sec-eq-10962/ESVUFR,
   :rdf/type
   [:owl/NamedIndividual
    :fibo-sec-eq-10962/CommonVotingUnrestrictedFullyPaidRegisteredShare
    :fibo-sec-eq-eq/ListedShare],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "The Home Depot, Inc. common stock",
   :skos/definition
   "common share class representing shares in The Home Depot, Inc."})

(def TheHomeDepotIncCommonStockFinancialInstrumentShortName
  "Home Depot, Inc. common stock financial instrument short name (FISN)"
  {:db/ident
   :fibo-sec-eq-eqind/TheHomeDepotIncCommonStockFinancialInstrumentShortName,
   :fibo-sec-sec-iss/hasInstrumentDescription "SH",
   :fibo-sec-sec-iss/hasIssuerShortName "HOME DEPOT INC",
   :lcc-lr/hasTag "HOME DEPOT INC/SH",
   :lcc-lr/identifies :fibo-sec-eq-eqind/TheHomeDepotIncCommonStock,
   :rdf/type [:fibo-sec-sec-iss/FinancialInstrumentShortName
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label
   "The Home Depot, Inc. common stock financial instrument short name",
   :skos/definition
   "Home Depot, Inc. common stock financial instrument short name (FISN)"})

(def TheHomeDepotIncEquityIssuer
  "Home Depot, Inc. functional entity that is an issuer of common stock"
  {:db/ident :fibo-sec-eq-eqind/TheHomeDepotIncEquityIssuer,
   :fibo-fnd-rel-rel/hasIdentity :fibo-be-le-usee/TheHomeDepotInc-US-DE,
   :fibo-sec-sec-iss/hasIssuerShortName "HOME DEPOT INC",
   :rdf/type [:fibo-sec-eq-eq/ShareIssuer :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "The Home Depot, Inc. common stock issuer",
   :skos/definition
   "Home Depot, Inc. functional entity that is an issuer of common stock"})

(def TheProctorAndGambleCompanyCommonStock
  "common share class representing shares in The Proctor & Gamble Company"
  {:db/ident :fibo-sec-eq-eqind/TheProctorAndGambleCompanyCommonStock,
   :fibo-fbc-fi-fi/isDenominatedIn :fibo-fnd-acc-4217/USDollar,
   :fibo-fbc-fi-fi/isLegallyRecordedIn :fibo-be-ge-usj/StateOfOhioJurisdiction,
   :fibo-fbc-fi-fi/isNegotiable true,
   :fibo-fnd-agr-ctr/hasPrincipalParty
   :fibo-sec-eq-eqind/TheProctorAndGambleCompanyEquityIssuer,
   :fibo-fnd-agr-ctr/isAssignable false,
   :fibo-fnd-rel-rel/isIssuedBy
   :fibo-sec-eq-eqind/TheProctorAndGambleCompanyEquityIssuer,
   :fibo-sec-sec-iss/isIssuedInForm [:fibo-sec-sec-iss/BookEntryForm
                                     :fibo-sec-sec-iss/BearerAndRegisteredForm],
   :fibo-sec-sec-iss/isRegisteredWith
   :fibo-fbc-fct-usjrga/SecuritiesAndExchangeRegulator,
   :fibo-sec-sec-lst/hasHomeExchange :fibo-fbc-fct-mkti/Facility-XNYS,
   :fibo-sec-sec-lst/hasOriginalPlaceOfListing :fibo-fbc-fct-mkti/Facility-XNYS,
   :fibo-sec-sec-lst/isListedVia
   :fibo-sec-eq-eqind/XNYSListedTheProctorAndGambleCompanyCommonStock,
   :lcc-cr/isClassifiedBy :fibo-sec-eq-10962/ESVUFR,
   :rdf/type
   [:owl/NamedIndividual
    :fibo-sec-eq-10962/CommonVotingUnrestrictedFullyPaidRegisteredShare
    :fibo-sec-eq-eq/ListedShare],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "The Proctor & Gamble Company common stock",
   :skos/definition
   "common share class representing shares in The Proctor & Gamble Company"})

(def TheProctorAndGambleCompanyCommonStockFinancialInstrumentShortName
  "The Proctor & Gamble Company common stock financial instrument short name (FISN)"
  {:db/ident
   :fibo-sec-eq-eqind/TheProctorAndGambleCompanyCommonStockFinancialInstrumentShortName,
   :fibo-sec-sec-iss/hasInstrumentDescription "SH",
   :fibo-sec-sec-iss/hasIssuerShortName "PROCTER & GAMBL",
   :lcc-lr/hasTag "PROCTER & GAMBL/SH",
   :lcc-lr/identifies :fibo-sec-eq-eqind/TheProctorAndGambleCompanyCommonStock,
   :rdf/type [:fibo-sec-sec-iss/FinancialInstrumentShortName
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label
   "The Proctor & Gamble Company common stock financial instrument short name",
   :skos/definition
   "The Proctor & Gamble Company common stock financial instrument short name (FISN)"})

(def TheProctorAndGambleCompanyEquityIssuer
  "The Proctor & Gamble Company functional entity that is an issuer of common stock"
  {:db/ident :fibo-sec-eq-eqind/TheProctorAndGambleCompanyEquityIssuer,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-be-le-usee/TheProctorAndGambleCompany-US-OH,
   :fibo-sec-sec-iss/hasIssuerShortName "PROCTOR & GAMBL",
   :rdf/type [:fibo-sec-eq-eq/ShareIssuer :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "The Proctor & Gamble Company common stock issuer",
   :skos/definition
   "The Proctor & Gamble Company functional entity that is an issuer of common stock"})

(def TickerSymbol-XLOM-0R2V
  "ticker symbol for Apple Inc. common stock listed in the London Stock Exchange"
  {:db/ident :fibo-sec-eq-eqind/TickerSymbol-XLOM-0R2V,
   :fibo-fbc-fct-ra/isRegisteredBy :fibo-fbc-fct-mkti/Facility-XLOM,
   :lcc-lr/hasTag "0R2V",
   :lcc-lr/identifies :fibo-sec-eq-eqind/XLOMListedAppleIncCommonStock,
   :rdf/type [:fibo-sec-sec-id/TickerSymbol :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "XLOM - 0R2V",
   :skos/definition
   "ticker symbol for Apple Inc. common stock listed in the London Stock Exchange"})

(def TickerSymbol-XNAS-AAPL
  "ticker symbol for Apple Inc. common stock listed in the Nasdaq (NASDAQ-NGS)"
  {:db/ident :fibo-sec-eq-eqind/TickerSymbol-XNAS-AAPL,
   :fibo-fbc-fct-ra/isRegisteredBy :fibo-fbc-fct-mkti/Facility-XNAS,
   :lcc-lr/hasTag "AAPL",
   :lcc-lr/identifies :fibo-sec-eq-eqind/XNASListedAppleIncCommonStock,
   :rdf/type [:fibo-sec-sec-id/TickerSymbol :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "XNAS - AAPL",
   :skos/definition
   "ticker symbol for Apple Inc. common stock listed in the Nasdaq (NASDAQ-NGS)"})

(def TickerSymbol-XNAS-GOOG
  "ticker symbol for Alphabet Inc. class C capital stock listed in the Nasdaq (NASDAQ-NGS)"
  {:db/ident :fibo-sec-eq-eqind/TickerSymbol-XNAS-GOOG,
   :fibo-fbc-fct-ra/isRegisteredBy :fibo-fbc-fct-mkti/Facility-XNAS,
   :lcc-lr/hasTag "GOOG",
   :lcc-lr/identifies
   :fibo-sec-eq-eqind/XNASListedAlphabetIncClassCCapitalStock,
   :rdf/type [:fibo-sec-sec-id/TickerSymbol :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "XNAS - GOOG",
   :skos/definition
   "ticker symbol for Alphabet Inc. class C capital stock listed in the Nasdaq (NASDAQ-NGS)"})

(def TickerSymbol-XNAS-GOOGL
  "ticker symbol for Alphabet Inc. class A common stock listed in the Nasdaq (NASDAQ-NGS)"
  {:db/ident :fibo-sec-eq-eqind/TickerSymbol-XNAS-GOOGL,
   :fibo-fbc-fct-ra/isRegisteredBy :fibo-fbc-fct-mkti/Facility-XNAS,
   :lcc-lr/hasTag "GOOGL",
   :lcc-lr/identifies :fibo-sec-eq-eqind/XNASListedAlphabetIncClassACommonStock,
   :rdf/type [:fibo-sec-sec-id/TickerSymbol :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "XNAS - GOOGL",
   :skos/definition
   "ticker symbol for Alphabet Inc. class A common stock listed in the Nasdaq (NASDAQ-NGS)"})

(def TickerSymbol-XNYS-C
  "ticker symbol for Citigroup Inc. common stock listed on the New York Stock Exchange (NYSE)"
  {:db/ident :fibo-sec-eq-eqind/TickerSymbol-XNYS-C,
   :fibo-fbc-fct-ra/isRegisteredBy :fibo-fbc-fct-usmkt/NewYorkStockExchange,
   :lcc-lr/hasTag "C",
   :lcc-lr/identifies :fibo-sec-eq-eqind/XNYSListedCitigroupIncCommonStock,
   :rdf/type [:fibo-sec-sec-id/TickerSymbol :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "XNYS - C",
   :skos/definition
   "ticker symbol for Citigroup Inc. common stock listed on the New York Stock Exchange (NYSE)"})

(def TickerSymbol-XNYS-HD
  "ticker symbol for The Home Depot, Inc. common stock listed on the New York Stock Exchange (NYSE)"
  {:db/ident :fibo-sec-eq-eqind/TickerSymbol-XNYS-HD,
   :fibo-fbc-fct-ra/isRegisteredBy :fibo-fbc-fct-usmkt/NewYorkStockExchange,
   :lcc-lr/hasTag "HD",
   :lcc-lr/identifies :fibo-sec-eq-eqind/XNYSListedTheHomeDepotIncCommonStock,
   :rdf/type [:fibo-sec-sec-id/TickerSymbol :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "XNYS - HD",
   :skos/definition
   "ticker symbol for The Home Depot, Inc. common stock listed on the New York Stock Exchange (NYSE)"})

(def TickerSymbol-XNYS-IBM
  "ticker symbol for Wells Fargo & Company common stock listed on the New York Stock Exchange (NYSE)"
  {:db/ident :fibo-sec-eq-eqind/TickerSymbol-XNYS-IBM,
   :fibo-fbc-fct-ra/isRegisteredBy :fibo-fbc-fct-usmkt/NewYorkStockExchange,
   :lcc-lr/hasTag "IBM",
   :lcc-lr/identifies
   :fibo-sec-eq-eqind/XNYSListedInternationalBusinessMachinesCorporationCommonStock,
   :rdf/type [:fibo-sec-sec-id/TickerSymbol :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "XNYS - IBM",
   :skos/definition
   "ticker symbol for Wells Fargo & Company common stock listed on the New York Stock Exchange (NYSE)"})

(def TickerSymbol-XNYS-JPM
  "ticker symbol for JPMorgan Chase & Co. common stock listed on the New York Stock Exchange (NYSE)"
  {:db/ident :fibo-sec-eq-eqind/TickerSymbol-XNYS-JPM,
   :fibo-fbc-fct-ra/isRegisteredBy :fibo-fbc-fct-usmkt/NewYorkStockExchange,
   :lcc-lr/hasTag "JPM",
   :lcc-lr/identifies
   :fibo-sec-eq-eqind/XNYSListedJPMorganChaseAndCoCommonStock,
   :rdf/type [:fibo-sec-sec-id/TickerSymbol :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "XNYS - JPM",
   :skos/definition
   "ticker symbol for JPMorgan Chase & Co. common stock listed on the New York Stock Exchange (NYSE)"})

(def TickerSymbol-XNYS-KO
  "ticker symbol for The Coca-Cola Company common stock listed on the New York Stock Exchange (NYSE)"
  {:db/ident :fibo-sec-eq-eqind/TickerSymbol-XNYS-KO,
   :fibo-fbc-fct-ra/isRegisteredBy :fibo-fbc-fct-usmkt/NewYorkStockExchange,
   :lcc-lr/hasTag "KO",
   :lcc-lr/identifies
   :fibo-sec-eq-eqind/XNYSListedTheCoca-ColaCompanyCommonStock,
   :rdf/type [:fibo-sec-sec-id/TickerSymbol :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "XNYS - KO",
   :skos/definition
   "ticker symbol for The Coca-Cola Company common stock listed on the New York Stock Exchange (NYSE)"})

(def TickerSymbol-XNYS-PG
  "ticker symbol for The Proctor & Gamble Company common stock listed on the New York Stock Exchange (NYSE)"
  {:db/ident :fibo-sec-eq-eqind/TickerSymbol-XNYS-PG,
   :fibo-fbc-fct-ra/isRegisteredBy :fibo-fbc-fct-usmkt/NewYorkStockExchange,
   :lcc-lr/hasTag "PG",
   :lcc-lr/identifies
   :fibo-sec-eq-eqind/XNYSListedTheProctorAndGambleCompanyCommonStock,
   :rdf/type [:fibo-sec-sec-id/TickerSymbol :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "XNYS - PG",
   :skos/definition
   "ticker symbol for The Proctor & Gamble Company common stock listed on the New York Stock Exchange (NYSE)"})

(def TickerSymbol-XNYS-WFC
  "ticker symbol for Wells Fargo & Company common stock listed on the New York Stock Exchange (NYSE)"
  {:db/ident :fibo-sec-eq-eqind/TickerSymbol-XNYS-WFC,
   :fibo-fbc-fct-ra/isRegisteredBy :fibo-fbc-fct-usmkt/NewYorkStockExchange,
   :lcc-lr/hasTag "WFC",
   :lcc-lr/identifies :fibo-sec-eq-eqind/XNYSListedWellsFargoCommonStock,
   :rdf/type [:fibo-sec-sec-id/TickerSymbol :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "XNYS - WFC",
   :skos/definition
   "ticker symbol for Wells Fargo & Company common stock listed on the New York Stock Exchange (NYSE)"})

(def WellsFargoCommonStock
  "Wells Fargo & Company common share"
  {:db/ident :fibo-sec-eq-eqind/WellsFargoCommonStock,
   :fibo-fbc-fct-ra/hasRegistrationDate "1998-09-11",
   :fibo-fbc-fi-fi/isDenominatedIn :fibo-fnd-acc-4217/USDollar,
   :fibo-fbc-fi-fi/isLegallyRecordedIn
   :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-fbc-fi-fi/isNegotiable true,
   :fibo-fnd-agr-ctr/hasPrincipalParty :fibo-fbc-fct-usind/WellsFargoAndCompany,
   :fibo-fnd-agr-ctr/isAssignable false,
   :fibo-fnd-rel-rel/isIssuedBy :fibo-fbc-fct-usind/WellsFargoAndCompany,
   :fibo-sec-sec-iss/isIssuedInForm [:fibo-sec-sec-iss/BookEntryForm
                                     :fibo-sec-sec-iss/BearerAndRegisteredForm],
   :fibo-sec-sec-iss/isRegisteredWith
   :fibo-fbc-fct-usjrga/SecuritiesAndExchangeRegulator,
   :fibo-sec-sec-lst/hasHomeExchange :fibo-fbc-fct-mkti/Facility-XNYS,
   :fibo-sec-sec-lst/hasOriginalPlaceOfListing :fibo-fbc-fct-mkti/Facility-XNYS,
   :fibo-sec-sec-lst/isListedVia
   :fibo-sec-eq-eqind/XNYSListedWellsFargoCommonStock,
   :lcc-cr/isClassifiedBy :fibo-sec-eq-10962/ESVUFR,
   :rdf/type
   [:fibo-sec-eq-10962/CommonVotingUnrestrictedFullyPaidRegisteredShare
    :owl/NamedIndividual
    :fibo-sec-eq-eq/ListedShare],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "Wells Fargo common stock",
   :skos/definition "Wells Fargo & Company common share"})

(def XLOMListedAppleIncCommonStock
  "Apple Inc. common share listed in the London Stock Exchange"
  {:db/ident :fibo-sec-eq-eqind/XLOMListedAppleIncCommonStock,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/USDollar,
   :fibo-sec-sec-lst/isTradedOn :fibo-fbc-fct-mkti/Facility-XLOM,
   :fibo-sec-sec-lst/lists :fibo-sec-eq-eqind/AppleIncCommonStock,
   :rdf/type [:fibo-sec-sec-lst/Listing :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "XLOM-listed Apple Inc. common stock",
   :skos/definition
   "Apple Inc. common share listed in the London Stock Exchange"})

(def XNASListedAlphabetIncClassACommonStock
  "Alphabet Inc. class A common share listed in the Nasdaq (NASDAQ-NGS)"
  {:db/ident :fibo-sec-eq-eqind/XNASListedAlphabetIncClassACommonStock,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/USDollar,
   :fibo-sec-sec-lst/hasListingDate "2004-08-01",
   :fibo-sec-sec-lst/isTradedOn :fibo-fbc-fct-mkti/Facility-XNAS,
   :fibo-sec-sec-lst/lists :fibo-sec-eq-eqind/AlphabetIncClassACommonStock,
   :rdf/type [:fibo-sec-sec-lst/Listing :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "XNAS-listed Alphabet Inc. class A common stock",
   :skos/definition
   "Alphabet Inc. class A common share listed in the Nasdaq (NASDAQ-NGS)"})

(def XNASListedAlphabetIncClassCCapitalStock
  "Alphabet Inc. class C capital stock listed in the Nasdaq (NASDAQ-NGS)"
  {:db/ident :fibo-sec-eq-eqind/XNASListedAlphabetIncClassCCapitalStock,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/USDollar,
   :fibo-sec-sec-lst/hasListingDate "2004-08-01",
   :fibo-sec-sec-lst/isTradedOn :fibo-fbc-fct-mkti/Facility-XNAS,
   :fibo-sec-sec-lst/lists :fibo-sec-eq-eqind/AlphabetIncClassCCapitalStock,
   :rdf/type [:fibo-sec-sec-lst/Listing :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "XNAS-listed Alphabet Inc. class C capital stock",
   :skos/definition
   "Alphabet Inc. class C capital stock listed in the Nasdaq (NASDAQ-NGS)"})

(def XNASListedAppleIncCommonStock
  "Apple Inc. common share listed in the Nasdaq (NASDAQ-NGS)"
  {:db/ident :fibo-sec-eq-eqind/XNASListedAppleIncCommonStock,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/USDollar,
   :fibo-sec-sec-lst/hasListingDate "1980-12-12",
   :fibo-sec-sec-lst/isTradedOn :fibo-fbc-fct-mkti/Facility-XNAS,
   :fibo-sec-sec-lst/lists :fibo-sec-eq-eqind/AppleIncCommonStock,
   :rdf/type [:fibo-sec-sec-lst/Listing :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "XNAS-listed Apple Inc. common stock",
   :skos/definition
   "Apple Inc. common share listed in the Nasdaq (NASDAQ-NGS)"})

(def XNYSListedCitigroupIncCommonStock
  "Citigroup Inc. common share listed in the New York Stock Exchange (NYSE)"
  {:db/ident :fibo-sec-eq-eqind/XNYSListedCitigroupIncCommonStock,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/USDollar,
   :fibo-sec-sec-lst/hasListingDate "1988-10-08",
   :fibo-sec-sec-lst/isTradedOn :fibo-fbc-fct-usmkt/NewYorkStockExchange,
   :fibo-sec-sec-lst/lists :fibo-sec-eq-eqind/CitigroupIncCommonStock,
   :rdf/type [:fibo-sec-sec-lst/Listing :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "XNYS-listed Citigroup Inc. common stock",
   :skos/definition
   "Citigroup Inc. common share listed in the New York Stock Exchange (NYSE)"})

(def XNYSListedInternationalBusinessMachinesCorporationCommonStock
  "IBM common share listed in the New York Stock Exchange (NYSE)"
  {:db/ident
   :fibo-sec-eq-eqind/XNYSListedInternationalBusinessMachinesCorporationCommonStock,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/USDollar,
   :fibo-sec-sec-lst/hasListingDate "1924-02-14",
   :fibo-sec-sec-lst/isTradedOn :fibo-fbc-fct-usmkt/NewYorkStockExchange,
   :fibo-sec-sec-lst/lists
   :fibo-sec-eq-eqind/InternationalBusinessMachinesCorporationCommonStock,
   :rdf/type [:fibo-sec-sec-lst/Listing :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "XNYS-listed IBM common stock",
   :skos/definition
   "IBM common share listed in the New York Stock Exchange (NYSE)"})

(def XNYSListedJPMorganChaseAndCoCommonStock
  "JPMorgan Chase & Co. common share listed in the New York Stock Exchange (NYSE)"
  {:db/ident :fibo-sec-eq-eqind/XNYSListedJPMorganChaseAndCoCommonStock,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/USDollar,
   :fibo-sec-sec-lst/hasListingDate "1978-10-06",
   :fibo-sec-sec-lst/isTradedOn :fibo-fbc-fct-usmkt/NewYorkStockExchange,
   :fibo-sec-sec-lst/lists :fibo-sec-eq-eqind/JPMorganChaseAndCoCommonStock,
   :rdf/type [:fibo-sec-sec-lst/Listing :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "XNYS-listed JPMorgan Chase & Co. common stock",
   :skos/definition
   "JPMorgan Chase & Co. common share listed in the New York Stock Exchange (NYSE)"})

(def XNYSListedTheCoca-ColaCompanyCommonStock
  "The Coca-Cola Company common share listed in the New York Stock Exchange (NYSE)"
  {:db/ident :fibo-sec-eq-eqind/XNYSListedTheCoca-ColaCompanyCommonStock,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/USDollar,
   :fibo-sec-sec-lst/hasListingDate "1919-09-05",
   :fibo-sec-sec-lst/isTradedOn :fibo-fbc-fct-usmkt/NewYorkStockExchange,
   :fibo-sec-sec-lst/lists :fibo-sec-eq-eqind/TheCoca-ColaCompanyCommonStock,
   :rdf/type [:fibo-sec-sec-lst/Listing :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "XNYS-listed The Coca-Cola Company common stock",
   :skos/definition
   "The Coca-Cola Company common share listed in the New York Stock Exchange (NYSE)"})

(def XNYSListedTheHomeDepotIncCommonStock
  "The Home Depot, Inc. common share listed in the New York Stock Exchange (NYSE)"
  {:db/ident :fibo-sec-eq-eqind/XNYSListedTheHomeDepotIncCommonStock,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/USDollar,
   :fibo-sec-sec-lst/hasListingDate "1984-04-19",
   :fibo-sec-sec-lst/isTradedOn :fibo-fbc-fct-usmkt/NewYorkStockExchange,
   :fibo-sec-sec-lst/lists :fibo-sec-eq-eqind/TheHomeDepotIncCommonStock,
   :rdf/type [:fibo-sec-sec-lst/Listing :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "XNYS-listed The Home Depot, Inc. common stock",
   :skos/definition
   "The Home Depot, Inc. common share listed in the New York Stock Exchange (NYSE)"})

(def XNYSListedTheProctorAndGambleCompanyCommonStock
  "The Proctor & Gamble Company common share listed in the New York Stock Exchange (NYSE)"
  {:db/ident :fibo-sec-eq-eqind/XNYSListedTheProctorAndGambleCompanyCommonStock,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/USDollar,
   :fibo-sec-sec-lst/hasListingDate "1978-01-13",
   :fibo-sec-sec-lst/isTradedOn :fibo-fbc-fct-usmkt/NewYorkStockExchange,
   :fibo-sec-sec-lst/lists
   :fibo-sec-eq-eqind/TheProctorAndGambleCompanyCommonStock,
   :rdf/type [:fibo-sec-sec-lst/Listing :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "XNYS-listed The Proctor & Gamble Company common stock",
   :skos/definition
   "The Proctor & Gamble Company common share listed in the New York Stock Exchange (NYSE)"})

(def XNYSListedWellsFargoCommonStock
  "Wells Fargo & Company common share listed in the New York Stock Exchange (NYSE)"
  {:db/ident :fibo-sec-eq-eqind/XNYSListedWellsFargoCommonStock,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/USDollar,
   :fibo-sec-sec-lst/isTradedOn :fibo-fbc-fct-usmkt/NewYorkStockExchange,
   :fibo-sec-sec-lst/lists :fibo-sec-eq-eqind/WellsFargoCommonStock,
   :rdf/type [:fibo-sec-sec-lst/Listing :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfs/label "XNYS-listed Wells Fargo common stock",
   :skos/definition
   "Wells Fargo & Company common share listed in the New York Stock Exchange (NYSE)"})