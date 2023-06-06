(ns net.wikipunk.rdf.fibo-fbc-fct-cajrga
  "This ontology extends the primary regulatory agencies ontology in FBC with additional regulators that are specific to the United States and augments certain U.S. financial services entities based on who regulates them."
  {:cmns-av/copyright ["Copyright (c) 2016-2023 Object Management Group, Inc."
                       "Copyright (c) 2016-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :dcterms/abstract
   "This ontology extends the primary regulatory agencies ontology in FBC with additional regulators that are specific to the United States and augments certain U.S. financial services entities based on who regulates them.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/CAFinancialServicesEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/FormalBusinessOrganizations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/ClientsAndAccounts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/BusinessRegistries/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LEIEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Organizations/Organizations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/"
    "https://www.omg.org/spec/Commons/Identifiers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/FinancialServicesEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Corporations/Corporations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/VirtualPlaces/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegulatoryAgencies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/BusinessCentersIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/GovernmentEntities/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-corp-corp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
    "fibo-be-ge-caj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/",
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
    "fibo-fbc-fct-cajrga"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
    "fibo-fbc-fct-fse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
    "fibo-fbc-fct-ra"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
    "fibo-fbc-fct-rga"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies/",
    "fibo-fbc-pas-caa"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
    "fibo-fnd-org-org"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
    "fibo-fnd-pas-pas"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/",
    "fibo-fnd-plc-adr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/",
    "fibo-fnd-plc-loc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
    "fibo-fnd-plc-vrt"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/VirtualPlaces/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-3166-2-ca"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-fct-cajrga",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label "Canadian Regulatory Agencies Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies.rdf version of this ontology was revised to address text formatting issues identified through hygiene testing."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies.rdf version of this ontology was revised to add Canadian tax identifiers and their related schemes."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies.rdf version of this ontology was revised to update the LEI URIs to the new form published by the GLEIF on data.world."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies.rdf version of this ontology was added via the FIBO 2.0 RFC."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgenciess.rdf version of this ontology was modified to reflect revisions to the GLEIF LEI representation for validation level."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgenciess.rdf version of this ontology was revised to update the GLEIF LEI registration information for the Bank of Canada, eliminate duplication of concepts in LCC, simplify addresses, and merge countries with locations in FND."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies.rdf version of this ontology was revised to reflect the move of certain organization-specific concepts from BE to FND and clean up LEI data."]})

(def BankOfCanada
  "central bank of Canada"
  {:cmns-av/adaptedFrom
   "http://www.bankofcanada.ca/wp-content/uploads/2010/11/regulation_canadian_financial.pdf",
   :cmns-av/explanatoryNote
   "The Bank of Canada's overall goal is to promote a stable and efficient financial system in Canada. The focus on the financial system as a whole parallels the Bank's approach to monetary policy, which focuses on the entire economy.\n \n The Bank provides liquidity to the financial system, gives policy advice to the federal government on the design and development of the system, oversees major clearing and settlement systems, and provides banking services to these systems and their participants.",
   :cmns-col/isPartOf :fibo-be-ge-caj/GovernmentOfCanada,
   :db/ident :fibo-fbc-fct-cajrga/BankOfCanada,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-caj/CanadianJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-cajrga/BankOfCanadaHeadOfficeAddress,
   :fibo-fnd-plc-vrt/hasWebsite "http://www.bankofcanada.ca/",
   :fibo-fnd-rel-rel/hasLegalName [#voc/lstr "Banque du Canada@fr"
                                   #voc/lstr "Bank of Canada@en"],
   :rdf/type [:owl/NamedIndividual :fibo-be-ge-ge/GovernmentAgency],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label [#voc/lstr "Banque du Canada@fr" #voc/lstr "Bank of Canada@en"],
   :skos/definition "central bank of Canada"})

(def BankOfCanadaHeadOfficeAddress
  "head office address for the Bank of Canada"
  {:db/ident :fibo-fbc-fct-cajrga/BankOfCanadaHeadOfficeAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "234 Wellington Street",
   :fibo-fnd-plc-adr/hasPostalCode "K1A 0G9",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/Canada,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Ottawa,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-ca/Ontario,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/ConventionalStreetAddress],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label "Bank of Canada head office address",
   :skos/definition "head office address for the Bank of Canada"})

(def BankOfCanadaLegalEntityIdentifierRegistryEntry
  "legal entity identifier for the Bank of Canada"
  {:cmns-col/comprises :gleif-L1-data/L-549300PN6MKI0CLP4T28-LEI,
   :db/ident
   :fibo-fbc-fct-cajrga/BankOfCanadaLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2014-03-28T05:39:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2020-12-23T05:19:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2021-12-23T00:31:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelEntitySuppliedOnly,
   :rdf/type [:owl/NamedIndividual
              :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label "Bank of Canada legal entity identifier registry entry",
   :skos/definition "legal entity identifier for the Bank of Canada"})

(def BusinessNumber
  "unique, 9-digit number that is the standard identifier for legal entities in Canada which are typically a business"
  {:cmns-av/abbreviation "BN",
   :cmns-av/adaptedFrom
   "https://www.canada.ca/en/services/taxes/business-number.html",
   :db/ident :fibo-fbc-fct-cajrga/BusinessNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label "business number",
   :rdfs/subClassOf
   [:fibo-fnd-org-org/OrganizationIdentifier
    {:owl/hasValue   :fibo-be-ge-caj/CanadianJurisdiction,
     :owl/onProperty :cmns-cxtdsg/isApplicableIn,
     :rdf/type       :owl/Restriction}
    :fibo-fnd-pty-pty/TaxIdentifier
    {:owl/hasValue
     :fibo-fbc-fct-cajrga/BusinessNumberRegistrationIdentifierScheme,
     :owl/onProperty :cmns-col/isMemberOf,
     :rdf/type :owl/Restriction}
    :fibo-fbc-fct-cajrga/BusinessNumber],
   :skos/definition
   "unique, 9-digit number that is the standard identifier for legal entities in Canada which are typically a business",
   :skos/example "000000000"})

(def BusinessNumberRegistrationIdentifierScheme
  "registration identifier scheme for business numbers defined by the Canada Revenue Agency for the registration of a business or legal entity"
  {:db/ident :fibo-fbc-fct-cajrga/BusinessNumberRegistrationIdentifierScheme,
   :rdf/type [:fibo-fnd-pty-pty/TaxIdentificationScheme
              :fibo-be-corp-corp/RegistrationIdentifierScheme
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label
   "Canada Revenue Agency business number registration identifier scheme",
   :skos/definition
   "registration identifier scheme for business numbers defined by the Canada Revenue Agency for the registration of a business or legal entity"})

(def BusinessNumberRegistrationService
  "Canada Revenue Agency service for the registration of business entities"
  {:db/ident :fibo-fbc-fct-cajrga/BusinessNumberRegistrationService,
   :fibo-fnd-pas-pas/isProvisionedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :fibo-fnd-rel-rel/isProvidedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type [:fibo-fbc-fct-ra/RegistrationService :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label "Canada Revenue Agency business number registration service",
   :rdfs/seeAlso
   ["https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/registering-your-business/you-need-a-business-number-a-program-account.html"],
   :skos/definition
   "Canada Revenue Agency service for the registration of business entities"})

(def BusinessNumberRegistry
  "Canada Revenue Agency business number registry"
  {:cmns-av/explanatoryNote "No public access.",
   :db/ident :fibo-fbc-fct-cajrga/BusinessNumberRegistry,
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-caj/CanadianJurisdiction,
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type [:fibo-fbc-fct-breg/BusinessRegistry :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label "Canada Revenue Agency business number entity registry",
   :skos/definition "Canada Revenue Agency business number registry"})

(def CanadaRevenueAgency
  "taxation authority of the Government of Canada"
  {:cmns-av/adaptedFrom "https://www.canada.ca/en/revenue-agency.html",
   :cmns-av/explanatoryNote
   "This agency administers tax laws for the Canadian government and for several of the provinces and territories of Canada.",
   :cmns-col/isPartOf :fibo-be-ge-caj/GovernmentOfCanada,
   :db/ident :fibo-fbc-fct-cajrga/CanadaRevenueAgency,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-caj/CanadianJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-cajrga/CanadaRevenueAgencyHeadOfficeAddress,
   :fibo-fnd-plc-vrt/hasWebsite "https://www.canada.ca/en/revenue-agency.html",
   :fibo-fnd-rel-rel/hasLegalName [#voc/lstr "Agence du revenu du Canada@fr"
                                   #voc/lstr "Canada Revenue Agency@en"],
   :rdf/type [:fibo-be-ge-ge/GovernmentAgency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label [#voc/lstr "Agence du revenu du Canada@fr"
                #voc/lstr "Canada Revenue Agency@en"],
   :skos/definition "taxation authority of the Government of Canada"})

(def CanadaRevenueAgencyHeadOfficeAddress
  "head office address for the Canada Revenue Agency"
  {:db/ident :fibo-fbc-fct-cajrga/CanadaRevenueAgencyHeadOfficeAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "555 Mackenzie Avenue",
   :fibo-fnd-plc-adr/hasPostalCode "K1A 0L5",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/Canada,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Ottawa,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-ca/Ontario,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/ConventionalStreetAddress],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label "Canada Revenue Agency head office address",
   :skos/definition "head office address for the Canada Revenue Agency"})

(def CanadianBankingRegulatoryAgencyAndCentralBank
  "regulatory agency, registration authority and central banking role of the Bank of Canada"
  {:cmns-av/adaptedFrom "http://www.bankofcanada.ca/",
   :db/ident :fibo-fbc-fct-cajrga/CanadianBankingRegulatoryAgencyAndCentralBank,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-cajrga/BankOfCanada,
   :rdf/type [:fibo-fbc-fct-rga/RegulatoryAgency
              :fibo-fbc-fct-ra/RegistrationAuthority
              :fibo-fbc-fct-fse/CentralBank
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label
   "Canadian banking regulatory agency, registration authority and central bank role of the Bank of Canada",
   :skos/definition
   "regulatory agency, registration authority and central banking role of the Bank of Canada"})

(def CanadianBusinessTaxRegistrar
  "regulatory agency and registration authority role of the Canada Revenue Agency"
  {:db/ident :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-cajrga/CanadaRevenueAgency,
   :fibo-fnd-rel-rel/manages :fibo-fbc-fct-cajrga/BusinessNumberRegistry,
   :fibo-fnd-rel-rel/provides
   :fibo-fbc-fct-cajrga/BusinessNumberRegistrationService,
   :rdf/type [:fibo-fbc-fct-rga/RegulatoryAgency
              :fibo-fbc-fct-breg/BusinessRegistrationAuthority
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label "Canadian business and tax registrar",
   :skos/definition
   "regulatory agency and registration authority role of the Canada Revenue Agency"})

(def CorporationIncomeTaxNumber
  "concatenation of an entity's business number, the 'RC' abbreviation and a 4-digit subaccount number used for reporting corporate income tax"
  {:cmns-av/adaptedFrom
   "https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/registering-your-business/corporation-income-tax-program-account.html",
   :cmns-av/explanatoryNote
   "An organization may have more than one tax account through its subunits, this is handled through additional 4-digit subaccount numbers. This is used as both an account and an identifier for the registration.",
   :db/ident :fibo-fbc-fct-cajrga/CorporationIncomeTaxNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label "corporation income tax number",
   :rdfs/subClassOf
   [{:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-caa/LedgerAccount,
     :owl/onProperty :cmns-id/identifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-cajrga/BusinessNumber
    {:owl/hasValue
     :fibo-fbc-fct-cajrga/CorporationIncomeTaxNumberIdentifierScheme,
     :owl/onProperty :cmns-col/isMemberOf,
     :rdf/type :owl/Restriction}
    {:owl/hasValue   :fibo-be-ge-caj/CanadianJurisdiction,
     :owl/onProperty :cmns-cxtdsg/isApplicableIn,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-cajrga/CorporationIncomeTaxNumber
    {:owl/hasValue
     :fibo-fbc-fct-cajrga/BusinessNumberRegistrationIdentifierScheme,
     :owl/onProperty :cmns-col/isMemberOf,
     :rdf/type :owl/Restriction}
    :fibo-fnd-pty-pty/TaxIdentifier
    :fibo-fnd-org-org/OrganizationIdentifier
    {:owl/hasValue   :fibo-be-ge-caj/CanadianJurisdiction,
     :owl/onProperty :cmns-cxtdsg/isApplicableIn,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   "concatenation of an entity's business number, the 'RC' abbreviation and a 4-digit subaccount number used for reporting corporate income tax",
   :skos/example "000000000RC0001"})

(def CorporationIncomeTaxNumberIdentifierScheme
  "registration identifier scheme for corporation income tax numbers defined by the Canada Revenue Agency for the registration of a business or legal entity"
  {:db/ident :fibo-fbc-fct-cajrga/CorporationIncomeTaxNumberIdentifierScheme,
   :fibo-fnd-rel-rel/refersTo
   :fibo-fbc-fct-cajrga/BusinessNumberRegistrationIdentifierScheme,
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifierScheme
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label
   "Canada Revenue Agency corporation income tax number identifier scheme",
   :skos/definition
   "registration identifier scheme for corporation income tax numbers defined by the Canada Revenue Agency for the registration of a business or legal entity"})

(def CorporationIncomeTaxNumberRegistrationService
  "Canada Revenue Agency service for the registration of corporation income tax accounts"
  {:db/ident :fibo-fbc-fct-cajrga/CorporationIncomeTaxNumberRegistrationService,
   :fibo-fnd-pas-pas/isProvisionedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :fibo-fnd-rel-rel/isProvidedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type [:fibo-fbc-fct-ra/RegistrationService :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label
   "Canada Revenue Agency corporation income tax number registration service",
   :rdfs/seeAlso
   ["https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/gst-hst-businesses/account-register.html"],
   :skos/definition
   "Canada Revenue Agency service for the registration of corporation income tax accounts"})

(def CorporationIncomeTaxNumberRegistry
  "Canada Revenue Agency corporation income tax number registry"
  {:cmns-av/explanatoryNote "No public access.",
   :db/ident :fibo-fbc-fct-cajrga/CorporationIncomeTaxNumberRegistry,
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-caj/CanadianJurisdiction,
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type [:fibo-fbc-fct-breg/BusinessRegistry :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label "Canada Revenue Agency corporation income tax number registry",
   :skos/definition
   "Canada Revenue Agency corporation income tax number registry"})

(def GoodsServicesTaxHarmonizedSalesTaxNumberRegistry
  "registry that records and tracks individual GST/HST numbers for the Canada Revenue Agency"
  {:cmns-av/abbreviation "GST/HST number registry",
   :cmns-av/explanatoryNote "Limited public access.",
   :db/ident
   :fibo-fbc-fct-cajrga/GoodsServicesTaxHarmonizedSalesTaxNumberRegistry,
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-caj/CanadianJurisdiction,
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type [:fibo-fbc-fct-breg/BusinessRegistry :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label
   "Canada Revenue Agency Goods and Services Tax / Harmonized Sales Tax number registry",
   :rdfs/seeAlso
   ["https://www.canada.ca/en/revenue-agency/services/e-services/e-services-businesses/confirming-a-gst-hst-account-number/terms-conditions-use.html"],
   :skos/definition
   "registry that records and tracks individual GST/HST numbers for the Canada Revenue Agency"})

(def GoodsServicesTaxHarmonizedSalesTaxRegistrationIdentifierScheme
  "registration identifier scheme for GST/HST accounts defined by the Canada Revenue Agency for the registration of a business or legal entity"
  {:cmns-av/abbreviation
   "Canada Revenue Agency GST/HST registation number identifier scheme",
   :db/ident
   :fibo-fbc-fct-cajrga/GoodsServicesTaxHarmonizedSalesTaxRegistrationIdentifierScheme,
   :fibo-fnd-rel-rel/refersTo
   :fibo-fbc-fct-cajrga/BusinessNumberRegistrationIdentifierScheme,
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifierScheme
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label
   "Canada Revenue Agency Goods and Services Tax / Harmonized Sales Tax registration number identifier scheme",
   :skos/definition
   "registration identifier scheme for GST/HST accounts defined by the Canada Revenue Agency for the registration of a business or legal entity"})

(def GoodsServicesTaxHarmonizedSalesTaxRegistrationNumber
  "concatenation of an entity's business number, the 'RT' abbreviation and a 4-digit subaccount number used for reporting GST/HST"
  {:cmns-av/abbreviation "GST/HST registation number",
   :cmns-av/adaptedFrom
   "https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/gst-hst-businesses/account-register.html",
   :cmns-av/explanatoryNote
   "An organization may have more than one GST/HST account through its subunits, this is handled through additional 4-digit subaccount numbers. This is used as both an account and an identifier for the registration.",
   :db/ident
   :fibo-fbc-fct-cajrga/GoodsServicesTaxHarmonizedSalesTaxRegistrationNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label
   "Goods and Services Tax / Harmonized Sales Tax registration number",
   :rdfs/subClassOf
   [:fibo-fbc-fct-cajrga/BusinessNumber
    {:owl/hasValue
     :fibo-fbc-fct-cajrga/GoodsServicesTaxHarmonizedSalesTaxRegistrationIdentifierScheme,
     :owl/onProperty :cmns-col/isMemberOf,
     :rdf/type :owl/Restriction}
    {:owl/hasValue   :fibo-be-ge-caj/CanadianJurisdiction,
     :owl/onProperty :cmns-cxtdsg/isApplicableIn,
     :rdf/type       :owl/Restriction}
    :fibo-be-le-fbo/ValueAddedTaxIdentificationNumber
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-caa/LedgerAccount,
     :owl/onProperty :cmns-id/identifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-cajrga/GoodsServicesTaxHarmonizedSalesTaxRegistrationNumber
    {:owl/hasValue
     :fibo-fbc-fct-cajrga/BusinessNumberRegistrationIdentifierScheme,
     :owl/onProperty :cmns-col/isMemberOf,
     :rdf/type :owl/Restriction}
    :fibo-fnd-pty-pty/TaxIdentifier
    :fibo-fnd-org-org/OrganizationIdentifier
    {:owl/hasValue   :fibo-be-ge-caj/CanadianJurisdiction,
     :owl/onProperty :cmns-cxtdsg/isApplicableIn,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   "concatenation of an entity's business number, the 'RT' abbreviation and a 4-digit subaccount number used for reporting GST/HST",
   :skos/example "000000000RT0001"})

(def GoodsServicesTaxHarmonizedSalesTaxRegistrationService
  "Canada Revenue Agency service for the registration of GST/HST accounts"
  {:db/ident
   :fibo-fbc-fct-cajrga/GoodsServicesTaxHarmonizedSalesTaxRegistrationService,
   :fibo-fnd-pas-pas/isProvisionedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :fibo-fnd-rel-rel/isProvidedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type [:fibo-fbc-fct-ra/RegistrationService :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label "Canada Revenue Agency GST/HST number registration service",
   :rdfs/seeAlso
   ["https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/gst-hst-businesses/account-register.html"],
   :skos/definition
   "Canada Revenue Agency service for the registration of GST/HST accounts"})

(def ImportExportProgramNumber
  "concatenation of an entity's business number, the 'RM' abbreviation and a 4-digit subaccount number used for customs and import/export reporting purposes"
  {:cmns-av/adaptedFrom
   "https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/registering-your-business/import-export-program-account.html",
   :cmns-av/explanatoryNote
   "An organization may have more than one import-exports account through its subunits, this is handled through additional 4-digit subaccount numbers. This is used as both an account and an identifier for the registration.",
   :db/ident :fibo-fbc-fct-cajrga/ImportExportProgramNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label "import export program number",
   :rdfs/subClassOf
   [{:owl/hasValue   :fibo-be-ge-caj/CanadianJurisdiction,
     :owl/onProperty :cmns-cxtdsg/isApplicableIn,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-caa/LedgerAccount,
     :owl/onProperty :cmns-id/identifies,
     :rdf/type       :owl/Restriction}
    {:owl/hasValue
     :fibo-fbc-fct-cajrga/ImportExportProgramNumberIdentifierScheme,
     :owl/onProperty :cmns-col/isMemberOf,
     :rdf/type :owl/Restriction}
    :fibo-fbc-fct-cajrga/BusinessNumber
    :fibo-fbc-fct-cajrga/ImportExportProgramNumber
    {:owl/hasValue
     :fibo-fbc-fct-cajrga/BusinessNumberRegistrationIdentifierScheme,
     :owl/onProperty :cmns-col/isMemberOf,
     :rdf/type :owl/Restriction}
    :fibo-fnd-pty-pty/TaxIdentifier
    :fibo-fnd-org-org/OrganizationIdentifier
    {:owl/hasValue   :fibo-be-ge-caj/CanadianJurisdiction,
     :owl/onProperty :cmns-cxtdsg/isApplicableIn,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   "concatenation of an entity's business number, the 'RM' abbreviation and a 4-digit subaccount number used for customs and import/export reporting purposes",
   :skos/example "000000000RM0001"})

(def ImportExportProgramNumberIdentifierScheme
  "registration identifier scheme for an import export program number defined by the Canada Revenue Agency for the registration of a business or legal entity"
  {:db/ident :fibo-fbc-fct-cajrga/ImportExportProgramNumberIdentifierScheme,
   :fibo-fnd-rel-rel/refersTo
   :fibo-fbc-fct-cajrga/BusinessNumberRegistrationIdentifierScheme,
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifierScheme
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label
   "Canada Revenue Agency import export program number identifier scheme",
   :skos/definition
   "registration identifier scheme for an import export program number defined by the Canada Revenue Agency for the registration of a business or legal entity"})

(def ImportExportProgramNumberRegistrationService
  "Canada Revenue Agency service for the registration of import export program number accounts"
  {:db/ident :fibo-fbc-fct-cajrga/ImportExportProgramNumberRegistrationService,
   :fibo-fnd-pas-pas/isProvisionedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :fibo-fnd-rel-rel/isProvidedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type [:fibo-fbc-fct-ra/RegistrationService :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label
   "Canada Revenue Agency import export program number registration service",
   :rdfs/seeAlso
   ["https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/registering-your-business/register.html"],
   :skos/definition
   "Canada Revenue Agency service for the registration of import export program number accounts"})

(def ImportExportProgramNumberRegistry
  "Canada Revenue Agency import export program number registry"
  {:cmns-av/explanatoryNote "No public access.",
   :db/ident :fibo-fbc-fct-cajrga/ImportExportProgramNumberRegistry,
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-caj/CanadianJurisdiction,
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type [:fibo-fbc-fct-breg/BusinessRegistry :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label "Canada Revenue Agency import export program number registry",
   :skos/definition
   "Canada Revenue Agency import export program number registry"})

(def InformationReturnsIdentifierScheme
  "registration identifier scheme for information return program numbers defined by the Canada Revenue Agency for the registration of a business or legal entity"
  {:db/ident :fibo-fbc-fct-cajrga/InformationReturnsIdentifierScheme,
   :fibo-fnd-rel-rel/refersTo
   :fibo-fbc-fct-cajrga/BusinessNumberRegistrationIdentifierScheme,
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifierScheme
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label
   "Canada Revenue Agency information return program number identifier scheme",
   :skos/definition
   "registration identifier scheme for information return program numbers defined by the Canada Revenue Agency for the registration of a business or legal entity"})

(def InformationReturnsProgramNumber
  "concatenation of an entity's business number, the 'RZ' abbreviation and a 4-digit subaccount number used for information returns"
  {:cmns-av/adaptedFrom
   "https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/completing-slips-summaries/financial-slips-summaries/information-returns-program-account.html",
   :cmns-av/explanatoryNote
   "An organization may have more than one information returns program number through its subunits, this is handled through additional 4-digit subaccount numbers. This is used as both an account and an identifier for the registration. As opposed to other program numbers, this number is used for filing information returns and not as an account.",
   :db/ident :fibo-fbc-fct-cajrga/InformationReturnsProgramNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label "information return program number",
   :rdfs/subClassOf
   [:fibo-fbc-fct-cajrga/BusinessNumber
    {:owl/hasValue   :fibo-fbc-fct-cajrga/InformationReturnsIdentifierScheme,
     :owl/onProperty :cmns-col/isMemberOf,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-caa/LedgerAccount,
     :owl/onProperty :cmns-id/identifies,
     :rdf/type       :owl/Restriction}
    {:owl/hasValue   :fibo-be-ge-caj/CanadianJurisdiction,
     :owl/onProperty :cmns-cxtdsg/isApplicableIn,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-cajrga/InformationReturnsProgramNumber
    {:owl/hasValue
     :fibo-fbc-fct-cajrga/BusinessNumberRegistrationIdentifierScheme,
     :owl/onProperty :cmns-col/isMemberOf,
     :rdf/type :owl/Restriction}
    :fibo-fnd-pty-pty/TaxIdentifier
    :fibo-fnd-org-org/OrganizationIdentifier
    {:owl/hasValue   :fibo-be-ge-caj/CanadianJurisdiction,
     :owl/onProperty :cmns-cxtdsg/isApplicableIn,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   "concatenation of an entity's business number, the 'RZ' abbreviation and a 4-digit subaccount number used for information returns",
   :skos/example "000000000RZ0001"})

(def InformationReturnsProgramNumberRegistrationService
  "Canada Revenue Agency service for the registration of an information return program number accounts"
  {:db/ident
   :fibo-fbc-fct-cajrga/InformationReturnsProgramNumberRegistrationService,
   :fibo-fnd-pas-pas/isProvisionedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :fibo-fnd-rel-rel/isProvidedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type [:fibo-fbc-fct-ra/RegistrationService :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label
   "Canada Revenue Agency information return program number registration service",
   :rdfs/seeAlso
   ["https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/registering-your-business/register.html"],
   :skos/definition
   "Canada Revenue Agency service for the registration of an information return program number accounts"})

(def InformationReturnsProgramNumberRegistry
  "Canada Revenue Agency information return program number registry"
  {:cmns-av/explanatoryNote "No public access.",
   :db/ident :fibo-fbc-fct-cajrga/InformationReturnsProgramNumberRegistry,
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-caj/CanadianJurisdiction,
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type [:fibo-fbc-fct-breg/BusinessRegistry :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label
   "Canada Revenue Agency import information return program number registry",
   :skos/definition
   "Canada Revenue Agency information return program number registry"})

(def PayrollDeductionsProgramIdentifierRegistrationService
  "Canada Revenue Agency service for the registration of payroll deductions program number accounts"
  {:db/ident
   :fibo-fbc-fct-cajrga/PayrollDeductionsProgramIdentifierRegistrationService,
   :fibo-fnd-pas-pas/isProvisionedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :fibo-fnd-rel-rel/isProvidedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type [:fibo-fbc-fct-ra/RegistrationService :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label
   "Canada Revenue Agency payroll deductions program number registration service",
   :rdfs/seeAlso
   ["https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/payroll/How-open-payroll-account.html"],
   :skos/definition
   "Canada Revenue Agency service for the registration of payroll deductions program number accounts"})

(def PayrollDeductionsProgramIdentifierScheme
  "registration identifier scheme for payroll deductions program number defined by the Canada Revenue Agency for the registration of a business or legal entity"
  {:db/ident :fibo-fbc-fct-cajrga/PayrollDeductionsProgramIdentifierScheme,
   :fibo-fnd-rel-rel/refersTo
   :fibo-fbc-fct-cajrga/BusinessNumberRegistrationIdentifierScheme,
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifierScheme
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label
   "Canada Revenue Agency payroll deductions program number identifier scheme",
   :skos/definition
   "registration identifier scheme for payroll deductions program number defined by the Canada Revenue Agency for the registration of a business or legal entity"})

(def PayrollDeductionsProgramNumber
  "concatenation of an entity's business number, the 'RP' abbreviation and a 4-digit subaccount number used for reporting payroll deductions"
  {:cmns-av/adaptedFrom
   "https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/payroll/what-payroll-account.html",
   :cmns-av/explanatoryNote
   "An organization may have more than one deduction account through its subunits, this is handled through additional 4-digit subaccount numbers. This is used as both an account and an identifier for the registration.",
   :db/ident :fibo-fbc-fct-cajrga/PayrollDeductionsProgramNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label "payroll deductions program number",
   :rdfs/subClassOf
   [{:owl/hasValue   :fibo-be-ge-caj/CanadianJurisdiction,
     :owl/onProperty :cmns-cxtdsg/isApplicableIn,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-caa/LedgerAccount,
     :owl/onProperty :cmns-id/identifies,
     :rdf/type       :owl/Restriction}
    {:owl/hasValue
     :fibo-fbc-fct-cajrga/PayrollDeductionsProgramIdentifierRegistrationService,
     :owl/onProperty :cmns-col/isMemberOf,
     :rdf/type :owl/Restriction}
    :fibo-fbc-fct-cajrga/BusinessNumber
    :fibo-fbc-fct-cajrga/PayrollDeductionsProgramNumber
    {:owl/hasValue
     :fibo-fbc-fct-cajrga/BusinessNumberRegistrationIdentifierScheme,
     :owl/onProperty :cmns-col/isMemberOf,
     :rdf/type :owl/Restriction}
    :fibo-fnd-pty-pty/TaxIdentifier
    :fibo-fnd-org-org/OrganizationIdentifier
    {:owl/hasValue   :fibo-be-ge-caj/CanadianJurisdiction,
     :owl/onProperty :cmns-cxtdsg/isApplicableIn,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   "concatenation of an entity's business number, the 'RP' abbreviation and a 4-digit subaccount number used for reporting payroll deductions",
   :skos/example "000000000RP0001"})

(def PayrollDeductionsProgramNumberRegistry
  "Canada Revenue Agency payroll deduction program registry"
  {:cmns-av/explanatoryNote "No public access.",
   :db/ident :fibo-fbc-fct-cajrga/PayrollDeductionsProgramNumberRegistry,
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-caj/CanadianJurisdiction,
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type [:fibo-fbc-fct-breg/BusinessRegistry :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label
   "Canada Revenue Agency payroll deductions program number registry",
   :skos/definition "Canada Revenue Agency payroll deduction program registry"})

(def RegisteredCharityProgramNumber
  "concatenation of an entity's business number, the 'RR' abbreviation and a 4-digit subaccount number used for registered charity contribution"
  {:cmns-av/adaptedFrom
   "https://www.canada.ca/en/revenue-agency/services/charities-giving/charities/operating-a-registered-charity/registration-number.html",
   :cmns-av/explanatoryNote
   "An organization may have more than one registered charity account through its subunits, this is handled through additional 4-digit subaccount numbers. This is used as both an account and an identifier for the registration.",
   :db/ident :fibo-fbc-fct-cajrga/RegisteredCharityProgramNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label "registered charity program number",
   :rdfs/subClassOf
   [{:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-caa/LedgerAccount,
     :owl/onProperty :cmns-id/identifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-cajrga/BusinessNumber
    {:owl/hasValue
     :fibo-fbc-fct-cajrga/RegisteredCharityProgramNumberIdentifierScheme,
     :owl/onProperty :cmns-col/isMemberOf,
     :rdf/type :owl/Restriction}
    {:owl/hasValue   :fibo-be-ge-caj/CanadianJurisdiction,
     :owl/onProperty :cmns-cxtdsg/isApplicableIn,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-cajrga/RegisteredCharityProgramNumber
    {:owl/hasValue
     :fibo-fbc-fct-cajrga/BusinessNumberRegistrationIdentifierScheme,
     :owl/onProperty :cmns-col/isMemberOf,
     :rdf/type :owl/Restriction}
    :fibo-fnd-pty-pty/TaxIdentifier
    :fibo-fnd-org-org/OrganizationIdentifier
    {:owl/hasValue   :fibo-be-ge-caj/CanadianJurisdiction,
     :owl/onProperty :cmns-cxtdsg/isApplicableIn,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   "concatenation of an entity's business number, the 'RR' abbreviation and a 4-digit subaccount number used for registered charity contribution",
   :skos/example "000000000RR0001"})

(def RegisteredCharityProgramNumberIdentifierScheme
  "registration identifier scheme for registered charity program numbers defined by the Canada Revenue Agency for the registration of a business or legal entity"
  {:db/ident
   :fibo-fbc-fct-cajrga/RegisteredCharityProgramNumberIdentifierScheme,
   :fibo-fnd-rel-rel/refersTo
   :fibo-fbc-fct-cajrga/BusinessNumberRegistrationIdentifierScheme,
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifierScheme
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label
   "Canada Revenue Agency registered charity program number identifier scheme",
   :skos/definition
   "registration identifier scheme for registered charity program numbers defined by the Canada Revenue Agency for the registration of a business or legal entity"})

(def RegisteredCharityProgramNumberRegistrationService
  "Canada Revenue Agency service for the registration of a registered charity program number accounts"
  {:db/ident
   :fibo-fbc-fct-cajrga/RegisteredCharityProgramNumberRegistrationService,
   :fibo-fnd-pas-pas/isProvisionedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :fibo-fnd-rel-rel/isProvidedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type [:fibo-fbc-fct-ra/RegistrationService :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label
   "Canada Revenue Agency registered charity program number registration service",
   :rdfs/seeAlso
   ["https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/registering-your-business/register.html"],
   :skos/definition
   "Canada Revenue Agency service for the registration of a registered charity program number accounts"})

(def RegisteredCharityProgramNumberRegistry
  "Canada Revenue Agency registered charity program number registry"
  {:cmns-av/explanatoryNote "Full public access.",
   :db/ident :fibo-fbc-fct-cajrga/RegisteredCharityProgramNumberRegistry,
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-caj/CanadianJurisdiction,
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type [:fibo-fbc-fct-breg/BusinessRegistry :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label
   "Canada Revenue Agency import registered charity program number registry",
   :rdfs/seeAlso
   ["https://apps.cra-arc.gc.ca/ebci/hacc/srch/pub/dsplyBscSrch?request_locale=en"],
   :skos/definition
   "Canada Revenue Agency registered charity program number registry"})