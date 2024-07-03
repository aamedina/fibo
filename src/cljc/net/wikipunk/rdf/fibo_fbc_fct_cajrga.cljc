(ns net.wikipunk.rdf.fibo-fbc-fct-cajrga
  {:cmns-av/copyright
   #{"Copyright (c) 2016-2024 EDM Council, Inc."
     "Copyright (c) 2016-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :dcterms/abstract
   "This ontology extends the primary regulatory agencies ontology in FBC with additional regulators that are specific to the United States and augments certain U.S. financial services entities based on who regulates them.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
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
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/Corporations/Corporations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Organizations/Organizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/BusinessCentersIndividuals/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Places/Addresses/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/ProductsAndServices/ClientsAndAccounts/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/RegulatoryAgencies/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/NorthAmericanEntities/CAFinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Places/VirtualPlaces/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/BusinessRegistries/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-fct-cajrga",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfs/label "Canadian Regulatory Agencies Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies.rdf version of this ontology was revised to update the LEI URIs to the new form published by the GLEIF on data.world."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgenciess.rdf version of this ontology was revised to update the GLEIF LEI registration information for the Bank of Canada, eliminate duplication of concepts in LCC, simplify addresses, and merge countries with locations in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies.rdf version of this ontology was revised to address text formatting issues identified through hygiene testing."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgenciess.rdf version of this ontology was modified to reflect revisions to the GLEIF LEI representation for validation level."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies.rdf version of this ontology was revised to add Canadian tax identifiers and their related schemes."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies.rdf version of this ontology was revised to reflect the move of certain organization-specific concepts from BE to FND and clean up LEI data."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies.rdf version of this ontology was added via the FIBO 2.0 RFC."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"})

(def BankOfCanada
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "http://www.bankofcanada.ca/wp-content/uploads/2010/11/regulation_canadian_financial.pdf"},
   :cmns-av/explanatoryNote
   "The Bank of Canada's overall goal is to promote a stable and efficient financial system in Canada. The focus on the financial system as a whole parallels the Bank's approach to monetary policy, which focuses on the entire economy.\n \n The Bank provides liquidity to the financial system, gives policy advice to the federal government on the design and development of the system, oversees major clearing and settlement systems, and provides banking services to these systems and their participants.",
   :cmns-col/isPartOf :fibo-be-ge-caj/GovernmentOfCanada,
   :db/ident :fibo-fbc-fct-cajrga/BankOfCanada,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-caj/CanadianJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-cajrga/BankOfCanadaHeadOfficeAddress,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "http://www.bankofcanada.ca/"},
   :fibo-fnd-rel-rel/hasLegalName #{{:rdf/language "en",
                                     :rdf/value    "Bank of Canada"}
                                    {:rdf/language "fr",
                                     :rdf/value    "Banque du Canada"}},
   :rdf/type #{:fibo-be-ge-ge/GovernmentAgency :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Bank of Canada"}
                 {:rdf/language "fr",
                  :rdf/value    "Banque du Canada"}},
   :skos/definition "central bank of Canada"})

(def BankOfCanadaHeadOfficeAddress
  {:db/ident :fibo-fbc-fct-cajrga/BankOfCanadaHeadOfficeAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "234 Wellington Street",
   :fibo-fnd-plc-adr/hasPostalCode "K1A 0G9",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/Canada,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Ottawa,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-ca/Ontario,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/ConventionalStreetAddress},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label "Bank of Canada head office address",
   :skos/definition "head office address for the Bank of Canada"})

(def BankOfCanadaLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-549300PN6MKI0CLP4T28-LEI"},
   :db/ident
   :fibo-fbc-fct-cajrga/BankOfCanadaLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2014-03-28T01:39:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2020-12-23T00:19:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2021-12-22T19:31:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelEntitySuppliedOnly,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label "Bank of Canada legal entity identifier registry entry",
   :skos/definition "legal entity identifier for the Bank of Canada"})

(def BusinessNumber
  {:cmns-av/abbreviation "BN",
   :cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.canada.ca/en/services/taxes/business-number.html"},
   :db/ident :fibo-fbc-fct-cajrga/BusinessNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label "business number",
   :rdfs/subClassOf
   #{:fibo-fnd-pty-pty/TaxIdentifier
     {:owl/hasValue
      :fibo-fbc-fct-cajrga/BusinessNumberRegistrationIdentifierScheme,
      :owl/onProperty :cmns-col/isMemberOf,
      :rdf/type :owl/Restriction}
     {:owl/hasValue   :fibo-be-ge-caj/CanadianJurisdiction,
      :owl/onProperty :cmns-cxtdsg/isApplicableIn,
      :rdf/type       :owl/Restriction}
     :fibo-fnd-org-org/OrganizationIdentifier},
   :skos/definition
   "unique, 9-digit number that is the standard identifier for legal entities in Canada which are typically a business",
   :skos/example "000000000"})

(def BusinessNumberRegistrationIdentifierScheme
  {:db/ident :fibo-fbc-fct-cajrga/BusinessNumberRegistrationIdentifierScheme,
   :rdf/type #{:fibo-fnd-pty-pty/TaxIdentificationScheme :owl/NamedIndividual
               :fibo-be-corp-corp/RegistrationIdentifierScheme},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label
   "Canada Revenue Agency business number registration identifier scheme",
   :skos/definition
   "registration identifier scheme for business numbers defined by the Canada Revenue Agency for the registration of a business or legal entity"})

(def BusinessNumberRegistrationService
  {:db/ident :fibo-fbc-fct-cajrga/BusinessNumberRegistrationService,
   :fibo-fnd-pas-pas/isProvisionedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :fibo-fnd-rel-rel/isProvidedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationService :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label "Canada Revenue Agency business number registration service",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/registering-your-business/you-need-a-business-number-a-program-account.html"},
   :skos/definition
   "Canada Revenue Agency service for the registration of business entities"})

(def BusinessNumberRegistry
  {:cmns-av/explanatoryNote "No public access.",
   :db/ident :fibo-fbc-fct-cajrga/BusinessNumberRegistry,
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-caj/CanadianJurisdiction,
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type #{:fibo-fbc-fct-breg/BusinessRegistry :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label "Canada Revenue Agency business number entity registry",
   :skos/definition "Canada Revenue Agency business number registry"})

(def CanadaRevenueAgency
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.canada.ca/en/revenue-agency.html"},
   :cmns-av/explanatoryNote
   "This agency administers tax laws for the Canadian government and for several of the provinces and territories of Canada.",
   :cmns-col/isPartOf :fibo-be-ge-caj/GovernmentOfCanada,
   :db/ident :fibo-fbc-fct-cajrga/CanadaRevenueAgency,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-caj/CanadianJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-cajrga/CanadaRevenueAgencyHeadOfficeAddress,
   :fibo-fnd-plc-vrt/hasWebsite
   {:xsd/anyURI "https://www.canada.ca/en/revenue-agency.html"},
   :fibo-fnd-rel-rel/hasLegalName #{{:rdf/language "fr",
                                     :rdf/value    "Agence du revenu du Canada"}
                                    {:rdf/language "en",
                                     :rdf/value    "Canada Revenue Agency"}},
   :rdf/type #{:fibo-be-ge-ge/GovernmentAgency :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "Agence du revenu du Canada"}
                 {:rdf/language "en",
                  :rdf/value    "Canada Revenue Agency"}},
   :skos/definition "taxation authority of the Government of Canada"})

(def CanadaRevenueAgencyHeadOfficeAddress
  {:db/ident :fibo-fbc-fct-cajrga/CanadaRevenueAgencyHeadOfficeAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "555 Mackenzie Avenue",
   :fibo-fnd-plc-adr/hasPostalCode "K1A 0L5",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/Canada,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Ottawa,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-ca/Ontario,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/ConventionalStreetAddress},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label "Canada Revenue Agency head office address",
   :skos/definition "head office address for the Canada Revenue Agency"})

(def CanadianBankingRegulatoryAgencyAndCentralBank
  {:cmns-av/adaptedFrom {:xsd/anyURI "http://www.bankofcanada.ca/"},
   :cmns-rlcmp/isPlayedBy :fibo-fbc-fct-cajrga/BankOfCanada,
   :db/ident :fibo-fbc-fct-cajrga/CanadianBankingRegulatoryAgencyAndCentralBank,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationAuthority
               :fibo-fbc-fct-fse/CentralBank :owl/NamedIndividual
               :fibo-fbc-fct-rga/RegulatoryAgency},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label
   "Canadian banking regulatory agency, registration authority and central bank role of the Bank of Canada",
   :skos/definition
   "regulatory agency, registration authority and central banking role of the Bank of Canada"})

(def CanadianBusinessTaxRegistrar
  {:cmns-rlcmp/isPlayedBy :fibo-fbc-fct-cajrga/CanadaRevenueAgency,
   :db/ident :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :fibo-fnd-rel-rel/manages :fibo-fbc-fct-cajrga/BusinessNumberRegistry,
   :fibo-fnd-rel-rel/provides
   :fibo-fbc-fct-cajrga/BusinessNumberRegistrationService,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/BusinessRegistrationAuthority
               :fibo-fbc-fct-rga/RegulatoryAgency},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label "Canadian business and tax registrar",
   :skos/definition
   "regulatory agency and registration authority role of the Canada Revenue Agency"})

(def CorporationIncomeTaxNumber
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/registering-your-business/corporation-income-tax-program-account.html"},
   :cmns-av/explanatoryNote
   "An organization may have more than one tax account through its subunits, this is handled through additional 4-digit subaccount numbers. This is used as both an account and an identifier for the registration.",
   :db/ident :fibo-fbc-fct-cajrga/CorporationIncomeTaxNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label "corporation income tax number",
   :rdfs/subClassOf
   #{{:owl/hasValue
      :fibo-fbc-fct-cajrga/CorporationIncomeTaxNumberIdentifierScheme,
      :owl/onProperty :cmns-col/isMemberOf,
      :rdf/type :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-pas-caa/LedgerAccount,
      :owl/onProperty :cmns-id/identifies,
      :rdf/type       :owl/Restriction} :fibo-fbc-fct-cajrga/BusinessNumber
     {:owl/hasValue   :fibo-be-ge-caj/CanadianJurisdiction,
      :owl/onProperty :cmns-cxtdsg/isApplicableIn,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "concatenation of an entity's business number, the 'RC' abbreviation and a 4-digit subaccount number used for reporting corporate income tax",
   :skos/example "000000000RC0001"})

(def CorporationIncomeTaxNumberIdentifierScheme
  {:cmns-doc/refersTo
   :fibo-fbc-fct-cajrga/BusinessNumberRegistrationIdentifierScheme,
   :db/ident :fibo-fbc-fct-cajrga/CorporationIncomeTaxNumberIdentifierScheme,
   :rdf/type #{:owl/NamedIndividual
               :fibo-be-corp-corp/RegistrationIdentifierScheme},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label
   "Canada Revenue Agency corporation income tax number identifier scheme",
   :skos/definition
   "registration identifier scheme for corporation income tax numbers defined by the Canada Revenue Agency for the registration of a business or legal entity"})

(def CorporationIncomeTaxNumberRegistrationService
  {:db/ident :fibo-fbc-fct-cajrga/CorporationIncomeTaxNumberRegistrationService,
   :fibo-fnd-pas-pas/isProvisionedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :fibo-fnd-rel-rel/isProvidedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationService :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label
   "Canada Revenue Agency corporation income tax number registration service",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/gst-hst-businesses/account-register.html"},
   :skos/definition
   "Canada Revenue Agency service for the registration of corporation income tax accounts"})

(def CorporationIncomeTaxNumberRegistry
  {:cmns-av/explanatoryNote "No public access.",
   :db/ident :fibo-fbc-fct-cajrga/CorporationIncomeTaxNumberRegistry,
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-caj/CanadianJurisdiction,
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type #{:fibo-fbc-fct-breg/BusinessRegistry :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label "Canada Revenue Agency corporation income tax number registry",
   :skos/definition
   "Canada Revenue Agency corporation income tax number registry"})

(def GoodsServicesTaxHarmonizedSalesTaxNumberRegistry
  {:cmns-av/abbreviation "GST/HST number registry",
   :cmns-av/explanatoryNote "Limited public access.",
   :db/ident
   :fibo-fbc-fct-cajrga/GoodsServicesTaxHarmonizedSalesTaxNumberRegistry,
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-caj/CanadianJurisdiction,
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type #{:fibo-fbc-fct-breg/BusinessRegistry :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label
   "Canada Revenue Agency Goods and Services Tax / Harmonized Sales Tax number registry",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.canada.ca/en/revenue-agency/services/e-services/e-services-businesses/confirming-a-gst-hst-account-number/terms-conditions-use.html"},
   :skos/definition
   "registry that records and tracks individual GST/HST numbers for the Canada Revenue Agency"})

(def GoodsServicesTaxHarmonizedSalesTaxRegistrationIdentifierScheme
  {:cmns-av/abbreviation
   "Canada Revenue Agency GST/HST registation number identifier scheme",
   :cmns-doc/refersTo
   :fibo-fbc-fct-cajrga/BusinessNumberRegistrationIdentifierScheme,
   :db/ident
   :fibo-fbc-fct-cajrga/GoodsServicesTaxHarmonizedSalesTaxRegistrationIdentifierScheme,
   :rdf/type #{:owl/NamedIndividual
               :fibo-be-corp-corp/RegistrationIdentifierScheme},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label
   "Canada Revenue Agency Goods and Services Tax / Harmonized Sales Tax registration number identifier scheme",
   :skos/definition
   "registration identifier scheme for GST/HST accounts defined by the Canada Revenue Agency for the registration of a business or legal entity"})

(def GoodsServicesTaxHarmonizedSalesTaxRegistrationNumber
  {:cmns-av/abbreviation "GST/HST registation number",
   :cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/gst-hst-businesses/account-register.html"},
   :cmns-av/explanatoryNote
   "An organization may have more than one GST/HST account through its subunits, this is handled through additional 4-digit subaccount numbers. This is used as both an account and an identifier for the registration.",
   :db/ident
   :fibo-fbc-fct-cajrga/GoodsServicesTaxHarmonizedSalesTaxRegistrationNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label
   "Goods and Services Tax / Harmonized Sales Tax registration number",
   :rdfs/subClassOf
   #{:fibo-be-le-fbo/ValueAddedTaxIdentificationNumber
     {:owl/hasValue
      :fibo-fbc-fct-cajrga/GoodsServicesTaxHarmonizedSalesTaxRegistrationIdentifierScheme,
      :owl/onProperty :cmns-col/isMemberOf,
      :rdf/type :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-pas-caa/LedgerAccount,
      :owl/onProperty :cmns-id/identifies,
      :rdf/type       :owl/Restriction} :fibo-fbc-fct-cajrga/BusinessNumber
     {:owl/hasValue   :fibo-be-ge-caj/CanadianJurisdiction,
      :owl/onProperty :cmns-cxtdsg/isApplicableIn,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "concatenation of an entity's business number, the 'RT' abbreviation and a 4-digit subaccount number used for reporting GST/HST",
   :skos/example "000000000RT0001"})

(def GoodsServicesTaxHarmonizedSalesTaxRegistrationService
  {:db/ident
   :fibo-fbc-fct-cajrga/GoodsServicesTaxHarmonizedSalesTaxRegistrationService,
   :fibo-fnd-pas-pas/isProvisionedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :fibo-fnd-rel-rel/isProvidedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationService :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label "Canada Revenue Agency GST/HST number registration service",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/gst-hst-businesses/account-register.html"},
   :skos/definition
   "Canada Revenue Agency service for the registration of GST/HST accounts"})

(def ImportExportProgramNumber
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/registering-your-business/import-export-program-account.html"},
   :cmns-av/explanatoryNote
   "An organization may have more than one import-exports account through its subunits, this is handled through additional 4-digit subaccount numbers. This is used as both an account and an identifier for the registration.",
   :db/ident :fibo-fbc-fct-cajrga/ImportExportProgramNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label "import export program number",
   :rdfs/subClassOf
   #{{:owl/hasValue
      :fibo-fbc-fct-cajrga/ImportExportProgramNumberIdentifierScheme,
      :owl/onProperty :cmns-col/isMemberOf,
      :rdf/type :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-pas-caa/LedgerAccount,
      :owl/onProperty :cmns-id/identifies,
      :rdf/type       :owl/Restriction} :fibo-fbc-fct-cajrga/BusinessNumber
     {:owl/hasValue   :fibo-be-ge-caj/CanadianJurisdiction,
      :owl/onProperty :cmns-cxtdsg/isApplicableIn,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "concatenation of an entity's business number, the 'RM' abbreviation and a 4-digit subaccount number used for customs and import/export reporting purposes",
   :skos/example "000000000RM0001"})

(def ImportExportProgramNumberIdentifierScheme
  {:cmns-doc/refersTo
   :fibo-fbc-fct-cajrga/BusinessNumberRegistrationIdentifierScheme,
   :db/ident :fibo-fbc-fct-cajrga/ImportExportProgramNumberIdentifierScheme,
   :rdf/type #{:owl/NamedIndividual
               :fibo-be-corp-corp/RegistrationIdentifierScheme},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label
   "Canada Revenue Agency import export program number identifier scheme",
   :skos/definition
   "registration identifier scheme for an import export program number defined by the Canada Revenue Agency for the registration of a business or legal entity"})

(def ImportExportProgramNumberRegistrationService
  {:db/ident :fibo-fbc-fct-cajrga/ImportExportProgramNumberRegistrationService,
   :fibo-fnd-pas-pas/isProvisionedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :fibo-fnd-rel-rel/isProvidedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationService :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label
   "Canada Revenue Agency import export program number registration service",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/registering-your-business/register.html"},
   :skos/definition
   "Canada Revenue Agency service for the registration of import export program number accounts"})

(def ImportExportProgramNumberRegistry
  {:cmns-av/explanatoryNote "No public access.",
   :db/ident :fibo-fbc-fct-cajrga/ImportExportProgramNumberRegistry,
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-caj/CanadianJurisdiction,
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type #{:fibo-fbc-fct-breg/BusinessRegistry :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label "Canada Revenue Agency import export program number registry",
   :skos/definition
   "Canada Revenue Agency import export program number registry"})

(def InformationReturnsIdentifierScheme
  {:cmns-doc/refersTo
   :fibo-fbc-fct-cajrga/BusinessNumberRegistrationIdentifierScheme,
   :db/ident :fibo-fbc-fct-cajrga/InformationReturnsIdentifierScheme,
   :rdf/type #{:owl/NamedIndividual
               :fibo-be-corp-corp/RegistrationIdentifierScheme},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label
   "Canada Revenue Agency information return program number identifier scheme",
   :skos/definition
   "registration identifier scheme for information return program numbers defined by the Canada Revenue Agency for the registration of a business or legal entity"})

(def InformationReturnsProgramNumber
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/completing-slips-summaries/financial-slips-summaries/information-returns-program-account.html"},
   :cmns-av/explanatoryNote
   "An organization may have more than one information returns program number through its subunits, this is handled through additional 4-digit subaccount numbers. This is used as both an account and an identifier for the registration. As opposed to other program numbers, this number is used for filing information returns and not as an account.",
   :db/ident :fibo-fbc-fct-cajrga/InformationReturnsProgramNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label "information return program number",
   :rdfs/subClassOf
   #{{:owl/hasValue   :fibo-fbc-fct-cajrga/InformationReturnsIdentifierScheme,
      :owl/onProperty :cmns-col/isMemberOf,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-pas-caa/LedgerAccount,
      :owl/onProperty :cmns-id/identifies,
      :rdf/type       :owl/Restriction} :fibo-fbc-fct-cajrga/BusinessNumber
     {:owl/hasValue   :fibo-be-ge-caj/CanadianJurisdiction,
      :owl/onProperty :cmns-cxtdsg/isApplicableIn,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "concatenation of an entity's business number, the 'RZ' abbreviation and a 4-digit subaccount number used for information returns",
   :skos/example "000000000RZ0001"})

(def InformationReturnsProgramNumberRegistrationService
  {:db/ident
   :fibo-fbc-fct-cajrga/InformationReturnsProgramNumberRegistrationService,
   :fibo-fnd-pas-pas/isProvisionedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :fibo-fnd-rel-rel/isProvidedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationService :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label
   "Canada Revenue Agency information return program number registration service",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/registering-your-business/register.html"},
   :skos/definition
   "Canada Revenue Agency service for the registration of an information return program number accounts"})

(def InformationReturnsProgramNumberRegistry
  {:cmns-av/explanatoryNote "No public access.",
   :db/ident :fibo-fbc-fct-cajrga/InformationReturnsProgramNumberRegistry,
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-caj/CanadianJurisdiction,
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type #{:fibo-fbc-fct-breg/BusinessRegistry :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label
   "Canada Revenue Agency import information return program number registry",
   :skos/definition
   "Canada Revenue Agency information return program number registry"})

(def PayrollDeductionsProgramIdentifierRegistrationService
  {:db/ident
   :fibo-fbc-fct-cajrga/PayrollDeductionsProgramIdentifierRegistrationService,
   :fibo-fnd-pas-pas/isProvisionedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :fibo-fnd-rel-rel/isProvidedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationService :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label
   "Canada Revenue Agency payroll deductions program number registration service",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/payroll/How-open-payroll-account.html"},
   :skos/definition
   "Canada Revenue Agency service for the registration of payroll deductions program number accounts"})

(def PayrollDeductionsProgramIdentifierScheme
  {:cmns-doc/refersTo
   :fibo-fbc-fct-cajrga/BusinessNumberRegistrationIdentifierScheme,
   :db/ident :fibo-fbc-fct-cajrga/PayrollDeductionsProgramIdentifierScheme,
   :rdf/type #{:owl/NamedIndividual
               :fibo-be-corp-corp/RegistrationIdentifierScheme},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label
   "Canada Revenue Agency payroll deductions program number identifier scheme",
   :skos/definition
   "registration identifier scheme for payroll deductions program number defined by the Canada Revenue Agency for the registration of a business or legal entity"})

(def PayrollDeductionsProgramNumber
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/payroll/what-payroll-account.html"},
   :cmns-av/explanatoryNote
   "An organization may have more than one deduction account through its subunits, this is handled through additional 4-digit subaccount numbers. This is used as both an account and an identifier for the registration.",
   :db/ident :fibo-fbc-fct-cajrga/PayrollDeductionsProgramNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label "payroll deductions program number",
   :rdfs/subClassOf
   #{{:owl/hasValue
      :fibo-fbc-fct-cajrga/PayrollDeductionsProgramIdentifierRegistrationService,
      :owl/onProperty :cmns-col/isMemberOf,
      :rdf/type :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-pas-caa/LedgerAccount,
      :owl/onProperty :cmns-id/identifies,
      :rdf/type       :owl/Restriction} :fibo-fbc-fct-cajrga/BusinessNumber
     {:owl/hasValue   :fibo-be-ge-caj/CanadianJurisdiction,
      :owl/onProperty :cmns-cxtdsg/isApplicableIn,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "concatenation of an entity's business number, the 'RP' abbreviation and a 4-digit subaccount number used for reporting payroll deductions",
   :skos/example "000000000RP0001"})

(def PayrollDeductionsProgramNumberRegistry
  {:cmns-av/explanatoryNote "No public access.",
   :db/ident :fibo-fbc-fct-cajrga/PayrollDeductionsProgramNumberRegistry,
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-caj/CanadianJurisdiction,
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type #{:fibo-fbc-fct-breg/BusinessRegistry :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label
   "Canada Revenue Agency payroll deductions program number registry",
   :skos/definition "Canada Revenue Agency payroll deduction program registry"})

(def RegisteredCharityProgramNumber
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.canada.ca/en/revenue-agency/services/charities-giving/charities/operating-a-registered-charity/registration-number.html"},
   :cmns-av/explanatoryNote
   "An organization may have more than one registered charity account through its subunits, this is handled through additional 4-digit subaccount numbers. This is used as both an account and an identifier for the registration.",
   :db/ident :fibo-fbc-fct-cajrga/RegisteredCharityProgramNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label "registered charity program number",
   :rdfs/subClassOf
   #{{:owl/hasValue
      :fibo-fbc-fct-cajrga/RegisteredCharityProgramNumberIdentifierScheme,
      :owl/onProperty :cmns-col/isMemberOf,
      :rdf/type :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-pas-caa/LedgerAccount,
      :owl/onProperty :cmns-id/identifies,
      :rdf/type       :owl/Restriction} :fibo-fbc-fct-cajrga/BusinessNumber
     {:owl/hasValue   :fibo-be-ge-caj/CanadianJurisdiction,
      :owl/onProperty :cmns-cxtdsg/isApplicableIn,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "concatenation of an entity's business number, the 'RR' abbreviation and a 4-digit subaccount number used for registered charity contribution",
   :skos/example "000000000RR0001"})

(def RegisteredCharityProgramNumberIdentifierScheme
  {:cmns-doc/refersTo
   :fibo-fbc-fct-cajrga/BusinessNumberRegistrationIdentifierScheme,
   :db/ident
   :fibo-fbc-fct-cajrga/RegisteredCharityProgramNumberIdentifierScheme,
   :rdf/type #{:owl/NamedIndividual
               :fibo-be-corp-corp/RegistrationIdentifierScheme},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label
   "Canada Revenue Agency registered charity program number identifier scheme",
   :skos/definition
   "registration identifier scheme for registered charity program numbers defined by the Canada Revenue Agency for the registration of a business or legal entity"})

(def RegisteredCharityProgramNumberRegistrationService
  {:db/ident
   :fibo-fbc-fct-cajrga/RegisteredCharityProgramNumberRegistrationService,
   :fibo-fnd-pas-pas/isProvisionedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :fibo-fnd-rel-rel/isProvidedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationService :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label
   "Canada Revenue Agency registered charity program number registration service",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.canada.ca/en/revenue-agency/services/tax/businesses/topics/registering-your-business/register.html"},
   :skos/definition
   "Canada Revenue Agency service for the registration of a registered charity program number accounts"})

(def RegisteredCharityProgramNumberRegistry
  {:cmns-av/explanatoryNote "Full public access.",
   :db/ident :fibo-fbc-fct-cajrga/RegisteredCharityProgramNumberRegistry,
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-caj/CanadianJurisdiction,
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-cajrga/CanadianBusinessTaxRegistrar,
   :rdf/type #{:fibo-fbc-fct-breg/BusinessRegistry :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdfs/label
   "Canada Revenue Agency import registered charity program number registry",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://apps.cra-arc.gc.ca/ebci/hacc/srch/pub/dsplyBscSrch?request_locale=en"},
   :skos/definition
   "Canada Revenue Agency registered charity program number registry"})

(def urn:uuid:50f00330-a106-553d-8526-c388dbb1514e
  {:cmns-id/identifies :fibo-fbc-fct-cajrga/BankOfCanada,
   :fibo-fnd-rel-rel/hasTag "549300PN6MKI0CLP4T28",
   :rdf/type           #{:owl/NamedIndividual
                         :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label         "Bank of Canada legal entity identifier",
   :skos/definition    "legal entity identifier for the Bank of Canada",
   :xsd/anyURI         "https://rdf.gleif.org/L1/L-549300PN6MKI0CLP4T28-LEI"})

(def urn:uuid:ae801256-3504-504b-a2d1-bc09507de474
  {:cmns-av/copyright
   #{"Copyright (c) 2016-2024 EDM Council, Inc."
     "Copyright (c) 2016-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology extends the primary regulatory agencies ontology in FBC with additional regulators that are specific to the United States and augments certain U.S. financial services entities based on who regulates them.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/Corporations/Corporations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Organizations/Organizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/BusinessCentersIndividuals/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Places/Addresses/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/ProductsAndServices/ClientsAndAccounts/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/RegulatoryAgencies/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/NorthAmericanEntities/CAFinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Places/VirtualPlaces/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/BusinessRegistries/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Canadian Regulatory Agencies Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies.rdf version of this ontology was revised to update the LEI URIs to the new form published by the GLEIF on data.world."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgenciess.rdf version of this ontology was revised to update the GLEIF LEI registration information for the Bank of Canada, eliminate duplication of concepts in LCC, simplify addresses, and merge countries with locations in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies.rdf version of this ontology was revised to address text formatting issues identified through hygiene testing."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgenciess.rdf version of this ontology was modified to reflect revisions to the GLEIF LEI representation for validation level."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies.rdf version of this ontology was revised to add Canadian tax identifiers and their related schemes."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies.rdf version of this ontology was revised to reflect the move of certain organization-specific concepts from BE to FND and clean up LEI data."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies.rdf version of this ontology was added via the FIBO 2.0 RFC."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/"})