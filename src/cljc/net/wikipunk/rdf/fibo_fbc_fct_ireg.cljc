(ns net.wikipunk.rdf.fibo-fbc-fct-ireg
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/",
   :dcterms/abstract
   "This ontology extends the Business Registries ontology to define commonly referenced international registration authorities and related registry details, where the multi-national responsibilities for registering and/or managing various identifiers needed in banking applications occur, such as SWIFT. These individuals and in some cases, such as registry entries, are managed independently to reduce the import footprint for applications that do not require them, in other words, to support modularity needs of FIBO users.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-ge-ge"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/",
    "fibo-be-le-fbo"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
    "fibo-be-le-lei"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/",
    "fibo-fbc-fct-bci"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
    "fibo-fbc-fct-breg"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
    "fibo-fbc-fct-fse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
    "fibo-fbc-fct-ireg"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/",
    "fibo-fbc-fct-mkt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
    "fibo-fbc-fct-ra"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-plc-adr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/",
    "fibo-fnd-plc-loc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
    "fibo-fnd-plc-vrt"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/VirtualPlaces/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
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
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/Addresses/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/BusinessRegistries/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/RegulatoryAgencies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/VirtualPlaces/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/Locations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-fct-ireg",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/",
   :rdfs/label "International Registries and Authorities Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities.rdf version of this ontology was revised to address text formatting issues uncovered via hygiene testing."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities.rdf version of this ontology was revised to add details for the Global LEI Foundation and fix spelling errors."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/"})

(def BankForInternationalSettlements
  {:cmns-av/abbreviation "BIS",
   :cmns-av/adaptedFrom
   {:rdf/value
    "Office of Financial Research (OFR) Annual Report, 2012, Glossary"},
   :cmns-av/explanatoryNote
   "Established in 1930, the BIS is owned by 63 central banks, representing countries from around the world that together account for about 95 percent of world GDP. Its head office is in Basel, Switzerland and it has two representative offices: in Hong Kong SAR and in Mexico City, as well as Innovation Hub Centres around the world.",
   :db/ident :fibo-fbc-fct-ireg/BankForInternationalSettlements,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-ireg/BankForInternationalSettlementsAddress,
   :fibo-be-le-lei/hasLegalAddress
   :fibo-fbc-fct-ireg/BankForInternationalSettlementsAddress,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "https://www.bis.org/"},
   :fibo-fnd-rel-rel/hasLegalName
   {:rdf/language "de",
    :rdf/value    "Bank für Internationalen Zahlungsausgleich"},
   :rdf/type #{:fibo-be-ge-ge/Instrumentality :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Bank for International Settlements"}
                 {:rdf/language "fr",
                  :rdf/value    "Banque Des Reglements Internationaux"}
                 {:rdf/language "de",
                  :rdf/value    "Bank für Internationalen Zahlungsausgleich"}},
   :skos/definition
   "international financial organization that serves central banks in their pursuit of monetary and financial stability, helping to foster international cooperation in those areas and acting as a bank for central banks"})

(def BankForInternationalSettlementsAddress
  {:db/ident :fibo-fbc-fct-ireg/BankForInternationalSettlementsAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "Centralbahnplatz 2",
   :fibo-fnd-plc-adr/hasPostalCode "4051",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/Switzerland,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Basel,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/ConventionalStreetAddress},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/"},
   :rdfs/label "Bank for International Settlements address",
   :skos/definition
   "Tower building address for the Bank for International Settlements (BIS)"})

(def BankForInternationalSettlementsAsBankingServicesProvider
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Office of Financial Research (OFR) Annual Report, 2012, Glossary"},
   :cmns-av/explanatoryNote
   "The Bank for International Settlements offers a wide range of financial services specifically designed to assist central banks and other official monetary institutions in the management of their foreign exchange reserves. BIS facilitates international financial cooperation and endeavors to make monetary policy more predictable and transparent. Its customers are central banks and international organizations; they do not accept deposits from, or provide financial services to, private individuals or corporate entities.",
   :db/ident
   :fibo-fbc-fct-ireg/BankForInternationalSettlementsAsBankingServicesProvider,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-ireg/BankForInternationalSettlementsDateEstablished,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-ireg/BankForInternationalSettlements,
   :rdf/type #{:fibo-fbc-fct-fse/Bank :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/"},
   :rdfs/label
   {:rdf/language "en",
    :rdf/value
    "Bank for International Settlements as banking services provider"},
   :rdfs/seeAlso {:xsd/anyURI "https://www.bis.org/"},
   :skos/definition
   "Bank for International Settlements role as a banking services provider to central banks and other monetary authorities"})

(def BankForInternationalSettlementsDateEstablished
  {:cmns-dt/hasDateValue "1930-05-01",
   :db/ident :fibo-fbc-fct-ireg/BankForInternationalSettlementsDateEstablished,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/"},
   :rdfs/label "Bank for International Settlements date established",
   :skos/definition
   "date that Bank for International Settlements was established to offer financial services to BIS member central banks"})

(def BankForInternationalSettlementsLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises :gleif-L1-data/L-UXIATLMNPCXXT5KR1S08-LEI,
   :db/ident
   :fibo-fbc-fct-ireg/BankForInternationalSettlementsLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T15:55:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-06-29T21:31:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-06-25T14:42:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/"},
   :rdfs/label
   "Bank for International Settlements legal entity identifier registry entry",
   :skos/definition
   "Global LEI Index registry entry for Bank for International Settlements (BIS)"})

(def BusinessIdentifierCodeDataRecord
  {:cmns-av/abbreviation "BIC data record",
   :cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.swift.com/standards/data-standards/bic"},
   :db/ident :fibo-fbc-fct-ireg/BusinessIdentifierCodeDataRecord,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/"},
   :rdfs/label "business identifier code data record",
   :rdfs/subClassOf
   #{{:owl/hasValue   :fibo-fbc-fct-ireg/BusinessIdentifierCodeRegistry,
      :owl/onProperty :cmns-col/isIncludedIn,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom :fibo-fbc-fct-fse/BusinessIdentifierCode,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fbc-fct-breg/isSelfMaintained,
      :owl/someValuesFrom :xsd/string,
      :rdf/type           :owl/Restriction}
     :fibo-fbc-fct-breg/BusinessRegistryEntry},
   :skos/definition
   "entry in a registry that conforms to ISO 9362 for the management of BIC codes and related registration information"})

(def BusinessIdentifierCodeRegistrationAuthority
  {:cmns-av/abbreviation #{"BIC registration authority" "BIC RA"},
   :cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.swift.com/standards/data-standards/bic"},
   :cmns-av/synonym "BIC code registrar",
   :db/ident :fibo-fbc-fct-ireg/BusinessIdentifierCodeRegistrationAuthority,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-ireg/SocietyForWorldwideInterbankFinancialTelecommunication,
   :fibo-fnd-rel-rel/manages :fibo-fbc-fct-ireg/BusinessIdentifierCodeRegistry,
   :rdf/type #{:fibo-fbc-pas-fpas/FinancialServiceProvider :owl/NamedIndividual
               :fibo-fbc-fct-breg/BusinessRegistrationAuthority},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/"},
   :rdfs/label "Business Identifier Code registration authority",
   :skos/definition
   "registration authority and financial service provider, appointed by the International Standards Organization (ISO), that is the official registration authority (RA) for ISO 9362, Banking - Banking telecommunication messages - Business identifier code (BIC)"})

(def BusinessIdentifierCodeRegistry
  {:cmns-av/abbreviation "BIC registry",
   :cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.swift.com/standards/data-standards/bic"},
   :db/ident :fibo-fbc-fct-ireg/BusinessIdentifierCodeRegistry,
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-ireg/BusinessIdentifierCodeRegistrationAuthority,
   :rdf/type #{:fibo-fbc-fct-breg/BusinessRegistry :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/"},
   :rdfs/label "business identifier code registry",
   :skos/definition
   "registry for registering and maintaining information about bank and other business identifier codes that conform to ISO 9362"})

(def GLEIFLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises :gleif-L1-data/L-506700GE1G29325QX363-LEI,
   :db/ident :fibo-fbc-fct-ireg/GLEIFLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2018-03-16T05:13:33.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-07-15T12:29:06.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-03-15T23:00:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/"},
   :rdfs/label
   "Global Legal Entity Identifier Foundation (GLEIF) legal entity identifier registry entry",
   :skos/definition
   "Global LEI Index registry entry for Global Legal Entity Identifier Foundation (GLEIF)"})

(def GlobalLEIIndex
  {:cmns-av/explanatoryNote
   "The reference data provides the information on a legal entity identifiable with an LEI. The Global LEI Index is the only global online source that provides open, standardized and high quality legal entity reference data.",
   :db/ident :fibo-fbc-fct-ireg/GlobalLEIIndex,
   :rdf/type #{:fibo-fbc-fct-breg/LegalEntityIdentifierRegistry
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/"},
   :rdfs/label "Global LEI Index",
   :skos/definition
   "registry that contains historical and current LEI records including related reference data in one authoritative, central repository"})

(def GlobalLegalEntityIdentifierFoundation
  {:cmns-av/abbreviation "GLEIF",
   :db/ident :fibo-fbc-fct-ireg/GlobalLegalEntityIdentifierFoundation,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-ireg/GlobalLegalEntityIdentifierFoundationAddress,
   :fibo-be-le-lei/hasLegalAddress
   :fibo-fbc-fct-ireg/GlobalLegalEntityIdentifierFoundationAddress,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "https://www.gleif.org/en/"},
   :fibo-fnd-rel-rel/hasLegalName "Global Legal Entity Identifier Foundation",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-fbo/NotForProfitOrganization},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/"},
   :rdfs/label "Global Legal Entity Identifier Foundation",
   :skos/definition
   "Global Legal Entity Identifier Foundation (GLEIF) legal entity, tasked to support the implementation and use of the Legal Entity Identifier (LEI)"})

(def GlobalLegalEntityIdentifierFoundationAddress
  {:db/ident :fibo-fbc-fct-ireg/GlobalLegalEntityIdentifierFoundationAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "St. Alban-Vorstadt 5",
   :fibo-fnd-plc-adr/hasPostalCode "4052",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/Switzerland,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Basel,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/ConventionalStreetAddress},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/"},
   :rdfs/label "Global Legal Entity Identifier Foundation address",
   :skos/definition
   "physical address of the Global Legal Entity Identifier Foundation (GLEIF)"})

(def IBANRegistrationAuthority
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.swift.com/standards/data-standards/iban"},
   :db/ident :fibo-fbc-fct-ireg/IBANRegistrationAuthority,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-ireg/SocietyForWorldwideInterbankFinancialTelecommunication,
   :fibo-fnd-rel-rel/manages :fibo-fbc-fct-ireg/BusinessIdentifierCodeRegistry,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationAuthority
               :fibo-fbc-pas-fpas/FinancialServiceProvider
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/"},
   :rdfs/label "IBAN registration authority",
   :skos/definition
   "ISO 13616:2007, International Bank Account Number (IBAN) Registration Authority (RA) and financial service provider, appointed by the International Standards Organization (ISO), that is the official registration authority (RA) for ISO 13616:2007, Financial services - International bank account number (IBAN)"})

(def LegalEntityIdentfierRegistrationAuthority
  {:db/ident :fibo-fbc-fct-ireg/LegalEntityIdentfierRegistrationAuthority,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-ireg/GlobalLegalEntityIdentifierFoundation,
   :fibo-fnd-rel-rel/manages :fibo-fbc-fct-ireg/GlobalLEIIndex,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationAuthority :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/"},
   :rdfs/label "Legal Entity Identifier registration authority",
   :skos/definition
   "registration authority appointed by the International Standards Organization (ISO) that is the official registration authority (RA) for ISO 17442, Financial services - Legal entity identifier (LEI)"})

(def MICRegistrationAuthority
  {:cmns-av/abbreviation "MIC RA",
   :cmns-av/adaptedFrom
   #{{:xsd/anyURI "https://www.anna-web.org/standards/mic-iso-10383/"}
     {:xsd/anyURI
      "https://www.iso20022.org/10383/iso-10383-market-identifier-codes"}},
   :cmns-av/synonym "ISO 10383 Registration Authority",
   :db/ident :fibo-fbc-fct-ireg/MICRegistrationAuthority,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-ireg/SocietyForWorldwideInterbankFinancialTelecommunication,
   :fibo-fnd-rel-rel/manages :fibo-fbc-fct-ireg/MarketIdentifierCodeRegistry,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationAuthority
               :fibo-fbc-pas-fpas/FinancialServiceProvider
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/"},
   :rdfs/label "MIC registration authority",
   :skos/definition
   "ISO 10383, Market Identifier Code (MIC) Registration Authority (RA) and financial service provider, appointed by the International Standards Organization (ISO), that is the official registration authority (RA) for ISO 10383, Codes for exchanges and market identification (MIC)"})

(def MarketIdentifierCodeRegistry
  {:cmns-av/abbreviation "MIC registry",
   :cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.iso20022.org/10383/iso-10383-market-identifier-codes"},
   :db/ident :fibo-fbc-fct-ireg/MarketIdentifierCodeRegistry,
   :fibo-fnd-rel-rel/isManagedBy :fibo-fbc-fct-ireg/MICRegistrationAuthority,
   :rdf/type #{:fibo-fbc-fct-ra/Registry :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/"},
   :rdfs/label "market identifier code registry",
   :skos/definition
   "registry for registering and maintaining information for market identifier codes that conform to ISO 10383"})

(def MarketIdentifierCodeRegistryEntry
  {:cmns-av/abbreviation "MIC registry entry",
   :cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.iso20022.org/10383/iso-10383-market-identifier-codes"},
   :db/ident :fibo-fbc-fct-ireg/MarketIdentifierCodeRegistryEntry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/"},
   :rdfs/label "market identifier code registry entry",
   :rdfs/subClassOf
   #{{:owl/onDataRange :xsd/string,
      :owl/onProperty  :fibo-fbc-fct-breg/hasInitialRegistrationDate,
      :owl/qualifiedCardinality 1,
      :rdf/type        :owl/Restriction}
     {:owl/hasValue   :fibo-fbc-fct-ireg/MarketIdentifierCodeRegistry,
      :owl/onProperty :cmns-col/isIncludedIn,
      :rdf/type       :owl/Restriction}
     {:owl/maxQualifiedCardinality 1,
      :owl/onDataRange :xsd/string,
      :owl/onProperty  :fibo-fbc-fct-breg/hasRegistrationRevisionDate,
      :rdf/type        :owl/Restriction}
     {:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom :fibo-fbc-fct-mkt/MarketIdentifier,
      :rdf/type           :owl/Restriction}
     {:owl/onClass    :fibo-fbc-fct-mkt/MarketIdentifierCodeStatus,
      :owl/onProperty :fibo-fbc-fct-mkt/hasMarketIdentifierCodeStatus,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction} :fibo-fbc-fct-ra/RegistryEntry},
   :skos/definition
   "entry in a market identifier code registry that conforms to ISO 10383"})

(def SWIFTLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises :gleif-L1-data/L-HB7FFAZI0OMZ8PP8OE26-LEI,
   :db/ident :fibo-fbc-fct-ireg/SWIFTLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T15:54:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-02-12T21:35:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-01-20T08:21:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/"},
   :rdfs/label
   "Society for Worldwide Interbank Financial Telecommunication (SWIFT) legal entity identifier registry entry",
   :skos/definition
   "Global LEI Index registry entry for the Society for Worldwide Interbank Financial Telecommunication (SWIFT)"})

(def SocietyForWorldwideInterbankFinancialTelecommunication
  {:cmns-av/abbreviation "SWIFT",
   :db/ident
   :fibo-fbc-fct-ireg/SocietyForWorldwideInterbankFinancialTelecommunication,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-ireg/SocietyForWorldwideInterbankFinancialTelecommunicationAddress,
   :fibo-be-le-lei/hasLegalAddress
   :fibo-fbc-fct-ireg/SocietyForWorldwideInterbankFinancialTelecommunicationAddress,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "https://www.swift.com/"},
   :fibo-fnd-rel-rel/hasLegalName
   "Society for Worldwide Interbank Financial Telecommunication SCRL/CVBA",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-fbo/NotForProfitOrganization},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/"},
   :rdfs/label "Society for Worldwide Interbank Financial Telecommunication",
   :skos/definition
   "Society for Worldwide Interbank Financial Telecommunication (SWIFT) legal entity, which is a global member-owned cooperative and the world's leading provider of secure financial messaging services"})

(def SocietyForWorldwideInterbankFinancialTelecommunicationAddress
  {:db/ident
   :fibo-fbc-fct-ireg/SocietyForWorldwideInterbankFinancialTelecommunicationAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "Avenue Adèle 1",
   :fibo-fnd-plc-adr/hasPostalCode "1310",
   :fibo-fnd-plc-loc/hasCityName "La Hulpe",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/Belgium,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/ConventionalStreetAddress},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/"},
   :rdfs/label
   "Society for Worldwide Interbank Financial Telecommunication address",
   :skos/definition
   "corporate address for the Society for Worldwide Interbank Financial Telecommunication (SWIFT)"})

(def urn:uuid:148fc614-383c-53a7-bf4f-adedf1560d9a
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology extends the Business Registries ontology to define commonly referenced international registration authorities and related registry details, where the multi-national responsibilities for registering and/or managing various identifiers needed in banking applications occur, such as SWIFT. These individuals and in some cases, such as registry entries, are managed independently to reduce the import footprint for applications that do not require them, in other words, to support modularity needs of FIBO users.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/Markets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/Addresses/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/BusinessRegistries/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/RegulatoryAgencies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/VirtualPlaces/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/Locations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "International Registries and Authorities Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities.rdf version of this ontology was revised to address text formatting issues uncovered via hygiene testing."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities.rdf version of this ontology was revised to add details for the Global LEI Foundation and fix spelling errors."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/"})