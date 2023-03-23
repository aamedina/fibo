(ns net.wikipunk.rdf.fibo-fbc-fct-usfsind
  "This ontology extends the financial services entities ontology in FBC with individual American entities that provide broad based services required by other FIBO domains, such as market data providers, instrument identifier issuers, organizations that provide exchanges in multiple countries, and so forth."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 EDM Council, Inc."
                       "Copyright (c) 2017-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :dcterms/abstract
   "This ontology extends the financial services entities ontology in FBC with individual American entities that provide broad based services required by other FIBO domains, such as market data providers, instrument identifier issuers, organizations that provide exchanges in multiple countries, and so forth.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/GovernmentEntities/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/ProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/FinancialServicesEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LEIEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/ControlParties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/BusinessRegistries/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegulatoryAgencies/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/CorporateBodies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/OwnershipParties/"
    "https://www.omg.org/spec/Commons/Identifiers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/CorporateControl/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Partnerships/Partnerships/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/Markets/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Corporations/Corporations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/FormalBusinessOrganizations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/BusinessCentersIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Trusts/Trusts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-corp-corp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
    "fibo-be-ge-ge"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/",
    "fibo-be-le-cb"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/",
    "fibo-be-le-fbo"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
    "fibo-be-le-lei"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/",
    "fibo-be-oac-cctl"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/",
    "fibo-be-oac-opty"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/",
    "fibo-be-ptr-ptr"
    "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/",
    "fibo-be-tr-tr"
    "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/",
    "fibo-fbc-fct-bci"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
    "fibo-fbc-fct-breg"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
    "fibo-fbc-fct-fse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
    "fibo-fbc-fct-ra"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
    "fibo-fbc-fct-usfsind"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
    "fibo-fbc-fct-usjrga"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-plc-adr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/",
    "fibo-fnd-plc-loc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-3166-2-ca"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
    "lcc-3166-2-us"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-fct-usfsind",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "American Financial Services Entities - Individuals Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals.rdf version of this ontology was revised to update the LEI URIs to the new form published by the GLEIF on data.world."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals.rdf version of this ontology was revised to improve the representation of some of the LEI data."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals.rdf version of this ontology was added via the FIBO 2.0 RFC."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals.rdf version of this ontology was revised to make incorporation and registration dates explicit and to replace references to the legacy LCC UnitedStates country representation with UnitedStatesOfAmerica."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals.rdf version of this ontology was modified to reflect revisions to the GLEIF LEI representation for validation level."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals.rdf version of this ontology was modified to normalize a few labels and definitions, revise GLEIF LEI registration data, eliminate duplication of concepts in LCC, simplify addresses, and merge countries with locations in FND."]})

(def BloombergBusinessEntityIdentifier
  "Delaware Division of Corporations business entity identifier for Bloomberg L.P."
  {:cmns-id/identifies :fibo-fbc-fct-usfsind/BloombergLP-US-DE,
   :db/ident :fibo-fbc-fct-usfsind/BloombergBusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "2110234",
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Bloomberg L.P. business entity identifier",
   :skos/definition
   "Delaware Division of Corporations business entity identifier for Bloomberg L.P."})

(def BloombergDateEstablished
  "date that Bloomberg L.P. was established"
  {:db/ident :fibo-fbc-fct-usfsind/BloombergDateEstablished,
   :fibo-fnd-dt-fd/hasDateValue "1986-12-09",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Bloomberg date established",
   :skos/definition "date that Bloomberg L.P. was established"})

(def BloombergFinanceBusinessEntityIdentifier
  "Delaware Division of Corporations business entity identifier for Bloomberg Finance L.P."
  {:cmns-id/identifies :fibo-fbc-fct-usfsind/BloombergFinanceLP-US-DE,
   :db/ident :fibo-fbc-fct-usfsind/BloombergFinanceBusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "4348344",
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Bloomberg Finance L.P. business entity identifier",
   :skos/definition
   "Delaware Division of Corporations business entity identifier for Bloomberg Finance L.P."})

(def BloombergFinanceDateEstablished
  "date that Bloomberg Finance L.P. was established"
  {:db/ident :fibo-fbc-fct-usfsind/BloombergFinanceDateEstablished,
   :fibo-fnd-dt-fd/hasDateValue "2007-06-05",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Bloomberg Finance L.P. date established",
   :skos/definition "date that Bloomberg Finance L.P. was established"})

(def BloombergFinanceLP
  "Bloomberg Finance L.P. functional entity, which is the professional services and financial data management part of the Bloomberg organization"
  {:db/ident :fibo-fbc-fct-usfsind/BloombergFinanceLP,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usfsind/BloombergFinanceLP-US-DE,
   :rdf/type [:fibo-fbc-pas-fpas/FinancialServiceProvider :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Bloomberg Finance L.P.",
   :skos/definition
   "Bloomberg Finance L.P. functional entity, which is the professional services and financial data management part of the Bloomberg organization"})

(def BloombergFinanceLP-US-DE
  "Bloomberg Finance L.P. legal entity that is a Delaware Limited Partnership"
  {:db/ident :fibo-fbc-fct-usfsind/BloombergFinanceLP-US-DE,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usfsind/BloombergHeadquartersAddress,
   :fibo-be-oac-cctl/hasDomesticUltimateParent
   :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-be-oac-opty/hasDirectOwnership
   :fibo-fbc-fct-usfsind/BloombergFinanceOwnership,
   :fibo-be-oac-opty/hasDirectOwningEntity
   :fibo-fbc-fct-usfsind/BloombergLP-US-DE,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usfsind/BloombergFinanceDateEstablished,
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationServiceCompany,
   :fibo-fnd-rel-rel/hasLegalName "Bloomberg Finance L.P.",
   :rdf/type [:owl/NamedIndividual :fibo-be-ptr-ptr/LimitedPartnership],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Bloomberg Finance L.P. US-DE",
   :rdfs/seeAlso ["http://www.bloomberg.com/"],
   :skos/definition
   "Bloomberg Finance L.P. legal entity that is a Delaware Limited Partnership"})

(def BloombergFinanceLPAsLocalOperatingUnit
  "Bloomberg Finance L.P. functional entity that is a legal entity identifier (LEI) local operating unit (LOU) registrar"
  {:db/ident :fibo-fbc-fct-usfsind/BloombergFinanceLPAsLocalOperatingUnit,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usfsind/BloombergFinanceLP-US-DE,
   :fibo-fnd-rel-rel/manages :fibo-fbc-fct-usfsind/BloombergLEIRegistry,
   :rdf/type [:fibo-fbc-fct-breg/LocalOperatingUnit :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Bloomberg Finance L.P. as local operating unit",
   :skos/definition
   "Bloomberg Finance L.P. functional entity that is a legal entity identifier (LEI) local operating unit (LOU) registrar"})

(def BloombergFinanceLPLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for Bloomberg Finance L.P."
  {:cmns-col/comprises :gleif-L1-data/L-5493001KJTIIGC8Y1R12-LEI,
   :db/ident
   :fibo-fbc-fct-usfsind/BloombergFinanceLPLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-12-07T01:55:22.718-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-07-20T21:18:41.850-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-01-25T21:50:02.081-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Bloomberg Finance L.P. legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for Bloomberg Finance L.P."})

(def BloombergFinanceOwnership
  "entity ownership context for Bloomberg Finance, a wholly owned subsidiary of Bloomberg L.P."
  {:db/ident :fibo-fbc-fct-usfsind/BloombergFinanceOwnership,
   :fibo-be-le-lei/hasOwnershipPercentage 100,
   :fibo-be-oac-opty/hasOwnedEntity
   :fibo-fbc-fct-usfsind/BloombergFinanceLP-US-DE,
   :fibo-be-oac-opty/hasOwningEntity :fibo-fbc-fct-usfsind/BloombergLP-US-DE,
   :fibo-fnd-agr-ctr/isQualifiedBy
   :fibo-be-le-lei/GenerallyAcceptedAccountingPrinciples,
   :rdf/type [:fibo-be-oac-opty/DirectConsolidation :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Bloomberg Finance ownership",
   :skos/definition
   "entity ownership context for Bloomberg Finance, a wholly owned subsidiary of Bloomberg L.P."})

(def BloombergHeadquartersAddress
  "headquarters address for Bloomberg L.P."
  {:db/ident :fibo-fbc-fct-usfsind/BloombergHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "731 Lexington Avenue",
   :fibo-fnd-plc-adr/hasPostalCode "10022",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/New_York,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/NewYork,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/ConventionalStreetAddress],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Bloomberg headquarters address",
   :skos/definition "headquarters address for Bloomberg L.P."})

(def BloombergLEIRegistry
  "Bloomberg LEI registry"
  {:db/ident :fibo-fbc-fct-usfsind/BloombergLEIRegistry,
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Bloomberg LEI registry",
   :rdfs/seeAlso ["https://lei.bloomberg.com"],
   :skos/definition "Bloomberg LEI registry"})

(def BloombergLP
  "Bloomberg L.P. functional entity, which is a global business and financial information services and news provider as well as a FIGI registration authority"
  {:db/ident :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usfsind/BloombergLP-US-DE,
   :rdf/type [:fibo-fbc-pas-fpas/FinancialServiceProvider
              :fibo-fbc-fct-ra/RegistrationAuthority
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Bloomberg L.P.",
   :skos/definition
   "Bloomberg L.P. functional entity, which is a global business and financial information services and news provider as well as a FIGI registration authority"})

(def BloombergLP-US-DE
  "Bloomberg L.P. legal entity that is a Delaware Limited Partnership"
  {:db/ident :fibo-fbc-fct-usfsind/BloombergLP-US-DE,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usfsind/BloombergHeadquartersAddress,
   :fibo-be-oac-cctl/hasSubsidiary :fibo-fbc-fct-usfsind/BloombergFinanceLP,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usfsind/BloombergDateEstablished,
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationServiceCompany,
   :fibo-fnd-rel-rel/hasLegalName "Bloomberg L.P.",
   :rdf/type [:owl/NamedIndividual :fibo-be-ptr-ptr/LimitedPartnership],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Bloomberg L.P. US-DE",
   :rdfs/seeAlso ["http://www.bloomberg.com/"],
   :skos/definition
   "Bloomberg L.P. legal entity that is a Delaware Limited Partnership"})

(def BloombergLPLegalEntityIdentifierRegistryEntry
  "legal entity identifier Global LEI Index registry entry for Bloomberg L.P."
  {:cmns-col/comprises :gleif-L1-data/L-549300B56MD0ZC402L06-LEI,
   :db/ident
   :fibo-fbc-fct-usfsind/BloombergLPLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-12-07T02:00:04.761-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-07-20T21:18:41.850-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-01-25T21:50:01.379-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Bloomberg L.P. legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier Global LEI Index registry entry for Bloomberg L.P."})

(def BloombergLPRSSDIdentifier
  "Federal Reserve RSSD identifier for Bloomberg L.P. as a data processing servicer"
  {:cmns-id/identifies :fibo-fbc-fct-usfsind/BloombergLP,
   :db/ident :fibo-fbc-fct-usfsind/BloombergLPRSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "2217129",
   :rdf/type
   [:fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "RSSD identifier for Bloomberg L.P.",
   :skos/definition
   "Federal Reserve RSSD identifier for Bloomberg L.P. as a data processing servicer"})

(def CorporationServiceCompanyEntityIdentifierRegistryEntry
  "legal entity identifier for Corporation Service Company"
  {:cmns-col/comprises :gleif-L1-data/L-549300NOPSIMGJNT8J31-LEI,
   :db/ident
   :fibo-fbc-fct-usfsind/CorporationServiceCompanyEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2013-08-14T06:34:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-09-30T01:32:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-09-09T16:59:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type [:owl/NamedIndividual
              :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label
   "Corporation Service Company legal entity identifier registry entry",
   :skos/definition "legal entity identifier for Corporation Service Company"})

(def DTC-US-NY
  "Depository Trust Company legal entity that is a limited-purpose trust company under New York State banking law"
  {:db/ident :fibo-fbc-fct-usfsind/DTC-US-NY,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usfsind/DTCHeadquartersAndLegalAddress,
   :fibo-be-le-lei/hasLegalAddress
   :fibo-fbc-fct-usfsind/DTCHeadquartersAndLegalAddress,
   :fibo-be-oac-cctl/hasDomesticUltimateParent
   :fibo-fbc-fct-usfsind/DepositoryTrustAndClearingCorporation,
   :fibo-be-oac-opty/hasDirectOwnership
   :fibo-fbc-fct-usfsind/DepositoryTrustCompanyOwnership,
   :fibo-be-oac-opty/hasDirectOwningEntity :fibo-fbc-fct-usfsind/DTCC-US-DE,
   :fibo-fnd-rel-rel/hasLegalName "Depository Trust Company",
   :rdf/type [:fibo-be-tr-tr/Trust :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "The Depository Trust Company US-NY",
   :skos/definition
   "Depository Trust Company legal entity that is a limited-purpose trust company under New York State banking law"})

(def DTCC-US-DE
  "The Depository Trust & Clearing Corporation (DTCC) legal entity that is a Delaware corporation"
  {:db/ident :fibo-fbc-fct-usfsind/DTCC-US-DE,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usfsind/DTCCHeadquartersAddress,
   :fibo-be-le-lei/hasLegalAddress :fibo-fbc-fct-usfsind/DTCCLegalAddress,
   :fibo-be-oac-cctl/hasSubsidiary :fibo-fbc-fct-usfsind/DepositoryTrustCompany,
   :fibo-fnd-rel-rel/hasLegalName "DTCC INC.",
   :rdf/type [:fibo-be-le-cb/StockCorporation :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "DTCC US-DE",
   :skos/definition
   "The Depository Trust & Clearing Corporation (DTCC) legal entity that is a Delaware corporation"})

(def DTCCHeadquartersAddress
  "headquarters address for the The Depository Trust & Clearing Corporation"
  {:db/ident :fibo-fbc-fct-usfsind/DTCCHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "570 Washington Boulevard",
   :fibo-fnd-plc-adr/hasPostalCode "07310",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Jersey_City,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/NewJersey,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/ConventionalStreetAddress],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label
   "The Depository Trust & Clearing Corporation headquarters address",
   :skos/definition
   "headquarters address for the The Depository Trust & Clearing Corporation"})

(def DTCCINCBusinessEntityIdentifier
  "Delaware Department of Corporations business entity identifier for The Depository Trust & Clearing Corporation"
  {:cmns-id/identifies :fibo-fbc-fct-usfsind/DTCC-US-DE,
   :db/ident :fibo-fbc-fct-usfsind/DTCCINCBusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "628925",
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label
   "The Depository Trust & Clearing Corporation business entity identifier",
   :skos/definition
   "Delaware Department of Corporations business entity identifier for The Depository Trust & Clearing Corporation"})

(def DTCCLegalAddress
  "legal address for the The Depository Trust & Clearing Corporation"
  {:db/ident :fibo-fbc-fct-usfsind/DTCCLegalAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "C/O General Counsel",
   :fibo-fnd-plc-adr/hasAddressLine2 "55 Water Street",
   :fibo-fnd-plc-adr/hasAddressLine3 "19th Floor",
   :fibo-fnd-plc-adr/hasPostalCode "10041",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/New_York,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/NewYork,
   :rdf/type [:fibo-fnd-plc-adr/ConventionalStreetAddress :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "The Depository Trust & Clearing Corporation legal address",
   :skos/definition
   "legal address for the The Depository Trust & Clearing Corporation"})

(def DTCCLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for The Depository Trust & Clearing Corporation"
  {:cmns-col/comprises :gleif-L1-data/L-MLDY5N6PZ58ZE60QU102-LEI,
   :db/ident :fibo-fbc-fct-usfsind/DTCCLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T19:50:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-11-15T20:32:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-11-02T22:50:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label
   "The Depository Trust & Clearing Corporation legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for The Depository Trust & Clearing Corporation"})

(def DTCFDICCertificateNumber
  "FDIC certificate number for The Depository Trust Company"
  {:cmns-id/identifies :fibo-fbc-fct-usfsind/DepositoryTrustCompany,
   :db/ident :fibo-fbc-fct-usfsind/DTCFDICCertificateNumber,
   :fibo-fnd-rel-rel/hasTag "90544",
   :rdf/type [:fibo-fbc-fct-usjrga/FDICCertificateNumber :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "DTC FDIC certificate number",
   :skos/definition "FDIC certificate number for The Depository Trust Company"})

(def DTCHeadquartersAndLegalAddress
  "headquarters and legal address for The Depository Trust Company"
  {:db/ident :fibo-fbc-fct-usfsind/DTCHeadquartersAndLegalAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "55 Water Street",
   :fibo-fnd-plc-adr/hasPostalCode "10041",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/New_York,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/NewYork,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/ConventionalStreetAddress],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "DTC headquarters and legal address",
   :skos/definition
   "headquarters and legal address for The Depository Trust Company"})

(def DTCLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for The Depository Trust & Clearing Corporation"
  {:cmns-col/comprises :gleif-L1-data/L-549300HBJLRO8YFMI370-LEI,
   :db/ident :fibo-fbc-fct-usfsind/DTCLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2017-12-29T20:32:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-11-16T20:33:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-11-02T22:50:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelEntitySuppliedOnly,
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "DTC legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for The Depository Trust & Clearing Corporation"})

(def DTCRSSDIdentifier
  "Federal Reserve RSSD identifier for The Depository Trust Company (DTC)"
  {:cmns-id/identifies :fibo-fbc-fct-usfsind/DepositoryTrustCompany,
   :db/ident :fibo-fbc-fct-usfsind/DTCRSSDIdentifier,
   :fibo-fnd-rel-rel/hasTag "52719",
   :rdf/type
   [:fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "RSSD identifier for The Depository Trust Company",
   :skos/definition
   "Federal Reserve RSSD identifier for The Depository Trust Company (DTC)"})

(def DTCRTN
  "Routing Transit Number (RTN) for the Depository Trust Company (DTC)"
  {:cmns-id/identifies :fibo-fbc-fct-usfsind/DepositoryTrustCompany,
   :db/ident :fibo-fbc-fct-usfsind/DTCRTN,
   :fibo-fnd-rel-rel/hasTag "026002066",
   :rdf/type [:fibo-fbc-fct-usjrga/RoutingTransitNumber :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "The Depository Trust Company RTN",
   :skos/definition
   "Routing Transit Number (RTN) for the Depository Trust Company (DTC)"})

(def DepositoryTrustAndClearingCorporation
  "Depository Trust & Clearing Corporation"
  {:cmns-av/abbreviation "DTCC",
   :cmns-av/explanatoryNote
   "DTCC is a global financial services organization focused on developing solutions to secure today's marketplace, while shaping the future of our industry, whose mission includes risk mitigation, creation of market efficiencies, and cost reduction. They are a large financial services holding company, developing trade repositories and building global capabilities across the spectrum of asset classes.",
   :db/ident :fibo-fbc-fct-usfsind/DepositoryTrustAndClearingCorporation,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usfsind/DTCC-US-DE,
   :rdf/type [:fibo-fbc-pas-fpas/FinancialServiceProvider :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "The Depository Trust & Clearing Corporation",
   :rdfs/seeAlso ["http://www.dtcc.com/about/businesses-and-subsidiaries"],
   :skos/definition "Depository Trust & Clearing Corporation"})

(def DepositoryTrustCompany
  "central counterparty clearing house (CCP), securities depository, and registration authority (RA) functional entity for The Depository Trust Company"
  {:cmns-av/abbreviation "DTC",
   :cmns-av/explanatoryNote
   "DTCC's subsidiary, The Depository Trust Company (DTC), established in 1973, was created to reduce costs and provide clearing and settlement efficiencies by immobilizing securities and making 'book-entry' changes to ownership of the securities.\n\nDTC brings efficiency to the securities industry by retaining custody of more than 3.5 million securities issues valued at US$37.2 trillion, including securities issued in the US and more than 131 countries and territories.",
   :db/ident :fibo-fbc-fct-usfsind/DepositoryTrustCompany,
   :fibo-fbc-fct-ra/isRegisteredBy
   :fibo-fbc-fct-usjrga/SecuritiesAndExchangeRegulator,
   :fibo-fbc-fct-usjrga/hasPrimaryFederalRegulator
   :fibo-fbc-fct-usjrga/FederalReserveRegulatoryAgencyAndCentralBank,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usfsind/DTC-US-NY,
   :rdf/type [:fibo-fbc-fct-fse/CentralSecuritiesDepository
              :owl/NamedIndividual
              :fibo-fbc-fct-fse/CentralCounterpartyClearingHouse
              :fibo-fbc-fct-ra/RegistrationAuthority],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Depository Trust Company",
   :rdfs/seeAlso
   ["http://www.dtcc.com/about/businesses-and-subsidiaries/dtc.aspx"],
   :skos/definition
   "central counterparty clearing house (CCP), securities depository, and registration authority (RA) functional entity for The Depository Trust Company"})

(def DepositoryTrustCompanyOwnership
  "entity ownership context for the Depository Trust Company, a wholly owned subsidiary of the Depository Trust & Clearing Corporation"
  {:db/ident :fibo-fbc-fct-usfsind/DepositoryTrustCompanyOwnership,
   :fibo-be-le-lei/hasOwnershipPercentage 100,
   :fibo-be-oac-opty/hasOwnedEntity :fibo-fbc-fct-usfsind/DTC-US-NY,
   :fibo-be-oac-opty/hasOwningEntity :fibo-fbc-fct-usfsind/DTCC-US-DE,
   :fibo-fnd-agr-ctr/isQualifiedBy
   :fibo-be-le-lei/GenerallyAcceptedAccountingPrinciples,
   :rdf/type [:fibo-be-oac-opty/DirectConsolidation :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Depository Trust Company ownership",
   :skos/definition
   "entity ownership context for the Depository Trust Company, a wholly owned subsidiary of the Depository Trust & Clearing Corporation"})

(def FederalReserveBankOfNewYorkLegalEntityIdentifierRegistryEntry
  "legal entity identifier for the Federal Reserve Bank of New York"
  {:cmns-col/comprises :gleif-L1-data/L-254900Y8NKGV541U8Q32-LEI,
   :db/ident
   :fibo-fbc-fct-usfsind/FederalReserveBankOfNewYorkLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2017-10-06T01:46:14.433-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-07-20T21:18:41.850-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-06-29T00:23:33.650-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelEntitySuppliedOnly,
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label
   "Federal Reserve Bank of New York legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier for the Federal Reserve Bank of New York"})

(def GlobalLEIIndex
  "Global LEI Index registry, which contains historical and current LEI records including related reference data in one authoritative, central repository"
  {:db/ident :fibo-fbc-fct-usfsind/GlobalLEIIndex,
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Global LEI Index",
   :rdfs/seeAlso ["https://www.gleif.org/en/lei-data/global-lei-index"],
   :skos/definition
   "Global LEI Index registry, which contains historical and current LEI records including related reference data in one authoritative, central repository"})

(def GlobalMarketsEntityIdentifierRegistry
  "Global Markets Entity Identifier (GMEI) registry. The GMEI utility is a pre-Local Operating Unit of the Global Legal Entity Identifier System (GLEIS)."
  {:cmns-av/abbreviation "GMEI registry",
   :db/ident :fibo-fbc-fct-usfsind/GlobalMarketsEntityIdentifierRegistry,
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Global Markets Entity Identifier registry",
   :rdfs/seeAlso ["https://www.gmeiutility.org/"],
   :skos/definition
   "Global Markets Entity Identifier (GMEI) registry. The GMEI utility is a pre-Local Operating Unit of the Global Legal Entity Identifier System (GLEIS)."})

(def ICEBenchmarkAdministration
  "ICE Benchmark Administration Limited (IBA) was established in July 2013 following an announcement by the Hogg Tendering Advisory Committee, an independent committee set up by the UK government to select the new administrator for the London Interbank Offered Rate (LIBOR)."
  {:cmns-av/abbreviation "IBA",
   :db/ident :fibo-fbc-fct-usfsind/ICEBenchmarkAdministration,
   :fibo-fnd-rel-rel/isManagedBy :fibo-fbc-fct-usfsind/IntercontinentalExchange,
   :fibo-fnd-utl-av/definitionOrigin "https://www.theice.com/iba.jhtml",
   :rdf/type [:fibo-be-ge-ge/Instrumentality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "ICE Benchmark Administration",
   :skos/definition
   "ICE Benchmark Administration Limited (IBA) was established in July 2013 following an announcement by the Hogg Tendering Advisory Committee, an independent committee set up by the UK government to select the new administrator for the London Interbank Offered Rate (LIBOR)."})

(def IntercontinentalExchange
  "Intercontinental Exchange functional entity, which owns exchanges for financial and commodity markets, and operates 23 regulated exchanges and marketplaces"
  {:cmns-av/abbreviation "ICE",
   :db/ident :fibo-fbc-fct-usfsind/IntercontinentalExchange,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usfsind/IntercontinentalExchangeInc-US-DE,
   :rdf/type [:fibo-fbc-pas-fpas/FinancialServiceProvider :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Intercontinental Exchange",
   :rdfs/seeAlso ["http://www.theice.com/"],
   :skos/definition
   "Intercontinental Exchange functional entity, which owns exchanges for financial and commodity markets, and operates 23 regulated exchanges and marketplaces"})

(def IntercontinentalExchangeBusinessEntityIdentifier
  "Delaware Division of Corporations business entity identifier for Intercontinental Exchange, Inc."
  {:cmns-id/identifies :fibo-fbc-fct-usfsind/IntercontinentalExchangeInc-US-DE,
   :db/ident
   :fibo-fbc-fct-usfsind/IntercontinentalExchangeBusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "5298907",
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Intercontinental Exchange, Inc. business entity identifier",
   :skos/definition
   "Delaware Division of Corporations business entity identifier for Intercontinental Exchange, Inc."})

(def IntercontinentalExchangeDateEstablished
  "date that Intercontinental Exchange was established"
  {:db/ident :fibo-fbc-fct-usfsind/IntercontinentalExchangeDateEstablished,
   :fibo-fnd-dt-fd/hasDateValue "2000-05-11",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Intercontinental Exchange date established",
   :skos/definition "date that Intercontinental Exchange was established"})

(def IntercontinentalExchangeDateRegistered
  "date that Intercontinental Exchange, Inc. was registered as a legal entity with the Delaware Division of Corporations"
  {:db/ident :fibo-fbc-fct-usfsind/IntercontinentalExchangeDateRegistered,
   :fibo-fnd-dt-fd/hasDateValue "2013-03-06",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Intercontinental Exchange date registered",
   :skos/definition
   "date that Intercontinental Exchange, Inc. was registered as a legal entity with the Delaware Division of Corporations"})

(def IntercontinentalExchangeHeadquartersAddress
  "headquarters address for Intercontinental Exchange, Inc."
  {:db/ident :fibo-fbc-fct-usfsind/IntercontinentalExchangeHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "5660 New Northside Drive NW",
   :fibo-fnd-plc-adr/hasAddressLine2 "3rd Floor",
   :fibo-fnd-plc-adr/hasPostalCode "30328",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Atlanta,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/Georgia,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/ConventionalStreetAddress],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Intercontinental Exchange headquarters address",
   :skos/definition "headquarters address for Intercontinental Exchange, Inc."})

(def IntercontinentalExchangeInc-US-DE
  "Intercontinental Exchange legal entity that is a Delaware Corporation"
  {:db/ident :fibo-fbc-fct-usfsind/IntercontinentalExchangeInc-US-DE,
   :fibo-be-corp-corp/hasDateOfRegistration
   :fibo-fbc-fct-usfsind/IntercontinentalExchangeDateRegistered,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usfsind/IntercontinentalExchangeHeadquartersAddress,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usfsind/IntercontinentalExchangeDateEstablished,
   :fibo-fnd-rel-rel/hasLegalName "Intercontinental Exchange, Inc.",
   :rdf/type [:owl/NamedIndividual :fibo-be-le-cb/StockCorporation],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Intercontinental Exchange, Inc. US-DE",
   :rdfs/seeAlso ["http://www.theice.com/"],
   :skos/definition
   "Intercontinental Exchange legal entity that is a Delaware Corporation"})

(def IntercontinentalExchangeLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for Intercontinental Exchange"
  {:cmns-col/comprises :gleif-L1-data/L-5493000F4ZO33MV32P92-LEI,
   :db/ident
   :fibo-fbc-fct-usfsind/IntercontinentalExchangeLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2013-12-10T08:07:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-12-01T04:23:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-12-01T01:13:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type [:owl/NamedIndividual
              :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label
   "Intercontinental Exchange legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for Intercontinental Exchange"})

(def SPGlobal
  "S&P Global functional entity that is a global data, research, benchmark, and analytics provider, including S&P Dow Jones Indices, S&P Global Platts (commodities and energy market data), S&P Global Ratings, and S&P Global Market Intelligence (which manages CUSIP Global Services) divisions"
  {:db/ident :fibo-fbc-fct-usfsind/SPGlobal,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usfsind/SPGlobalInc-US-NY,
   :rdf/type [:fibo-fbc-pas-fpas/FinancialServiceProvider :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "S&P Global",
   :skos/definition
   "S&P Global functional entity that is a global data, research, benchmark, and analytics provider, including S&P Dow Jones Indices, S&P Global Platts (commodities and energy market data), S&P Global Ratings, and S&P Global Market Intelligence (which manages CUSIP Global Services) divisions"})

(def SPGlobalBusinessEntityIdentifier
  "New York Division of Corporations business entity identifier for S&P Global Inc."
  {:cmns-id/identifies :fibo-fbc-fct-usfsind/SPGlobalInc-US-NY,
   :db/ident :fibo-fbc-fct-usfsind/SPGlobalBusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NewYorkBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "99979",
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "S&P Global Inc. business entity identifier",
   :skos/definition
   "New York Division of Corporations business entity identifier for S&P Global Inc."})

(def SPGlobalDateEstablished
  "date that S&P Global was established"
  {:cmns-av/explanatoryNote
   "The data established reflects the historical establishment of McGraw-Hill Publishing Company, Inc., including intermediate name and ownership changes.",
   :db/ident :fibo-fbc-fct-usfsind/SPGlobalDateEstablished,
   :fibo-fnd-dt-fd/hasDateValue "1925-12-29",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "S&P Global date established",
   :skos/definition "date that S&P Global was established"})

(def SPGlobalHeadquartersAddress
  "headquarters address for S&P Global, as represented in the New York Division of Corporations repository"
  {:db/ident :fibo-fbc-fct-usfsind/SPGlobalHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "55 Water Street",
   :fibo-fnd-plc-adr/hasPostalCode "10041",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/New_York,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/NewYork,
   :rdf/type [:fibo-fnd-plc-adr/ConventionalStreetAddress :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "S&P Global headquarters address",
   :skos/definition
   "headquarters address for S&P Global, as represented in the New York Division of Corporations repository"})

(def SPGlobalInc-US-NY
  "S&P Global legal entity that is a New York Domestic Business Corporation"
  {:db/ident :fibo-fbc-fct-usfsind/SPGlobalInc-US-NY,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usfsind/SPGlobalHeadquartersAddress,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usfsind/SPGlobalDateEstablished,
   :fibo-fnd-rel-rel/hasLegalName "S&P Global Inc.",
   :fibo-fnd-rel-rel/wasFormerlyKnownAs ["The McGraw-Hill Companies, Inc."
                                         "McGraw Hill Financial, Inc."],
   :rdf/type [:owl/NamedIndividual :fibo-be-le-cb/StockCorporation],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "S&P Global Inc. US-NY",
   :rdfs/seeAlso ["http://www.spglobal.com/"],
   :skos/definition
   "S&P Global legal entity that is a New York Domestic Business Corporation"})

(def SPGlobalLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for S&P Global, Inc."
  {:cmns-col/comprises :gleif-L1-data/L-Y6X4K52KMJMZE7I7MY94-LEI,
   :db/ident :fibo-fbc-fct-usfsind/SPGlobalLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T19:51:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-09-23T06:31:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/LapsedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2021-09-23T04:46:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "S&P Global legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for S&P Global, Inc."})

(def ThomsonReuters
  "Thomson Reuters functional entity, which is a global business and financial information services and news provider as well as the RIC issuer and registration authority"
  {:db/ident :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usfsind/ThomsonReutersCorporation,
   :rdf/type [:fibo-fbc-pas-fpas/FinancialServiceProvider :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Thomson Reuters",
   :skos/definition
   "Thomson Reuters functional entity, which is a global business and financial information services and news provider as well as the RIC issuer and registration authority"})

(def ThomsonReutersCorporation
  "Thomson Reuters legal entity, founded in Toronto with operating headquarters in New York that is both a Canadian and U.S. entity listed on both the Toronto Stock Exchange and New York Stock Exchange"
  {:db/ident :fibo-fbc-fct-usfsind/ThomsonReutersCorporation,
   :fibo-be-le-fbo/hasHeadquartersAddress
   [:fibo-fbc-fct-usfsind/ThomsonReutersHeadquartersAddress-US
    :fibo-fbc-fct-usfsind/ThomsonReutersHeadquartersAddress-CA],
   :fibo-be-le-lei/hasLegalAddress
   :fibo-fbc-fct-usfsind/ThomsonReutersLegalAddress,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usfsind/ThomsonReutersDateEstablished,
   :fibo-fnd-rel-rel/hasLegalName ["Thomson Reuters PLC"
                                   "Thomson Reuters Corporation"],
   :rdf/type [:owl/NamedIndividual :fibo-be-le-cb/StockCorporation],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Thomson Reuters Corporation",
   :rdfs/seeAlso ["https://www.thomsonreuters.com/en.html"],
   :skos/definition
   "Thomson Reuters legal entity, founded in Toronto with operating headquarters in New York that is both a Canadian and U.S. entity listed on both the Toronto Stock Exchange and New York Stock Exchange"})

(def ThomsonReutersDateEstablished
  "date that Thomson Reuters was established"
  {:cmns-av/explanatoryNote
   "The data established reflects the date that the Thomson Corporation merged with (purchased) the Reuters Group",
   :db/ident :fibo-fbc-fct-usfsind/ThomsonReutersDateEstablished,
   :fibo-fnd-dt-fd/hasDateValue "2008-04-17",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Thomson Reuters date established",
   :skos/definition "date that Thomson Reuters was established"})

(def ThomsonReutersHeadquartersAddress-CA
  "Canadian headquarters address for Thomson Reuters Corporation"
  {:db/ident :fibo-fbc-fct-usfsind/ThomsonReutersHeadquartersAddress-CA,
   :fibo-fnd-plc-adr/hasAddressLine1 "Bay Adelaide Centre",
   :fibo-fnd-plc-adr/hasAddressLine2 "333 Bay Street",
   :fibo-fnd-plc-adr/hasAddressLine3 "Suite 400",
   :fibo-fnd-plc-adr/hasPostalCode "M5H 2R2",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/Canada,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Toronto,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-ca/Ontario,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/ConventionalStreetAddress],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Thomson Reuters Corporation Canadian headquarters address",
   :skos/definition
   "Canadian headquarters address for Thomson Reuters Corporation"})

(def ThomsonReutersHeadquartersAddress-US
  "headquarters address for Thomson Reuters Corporation"
  {:db/ident :fibo-fbc-fct-usfsind/ThomsonReutersHeadquartersAddress-US,
   :fibo-fnd-plc-adr/hasAddressLine1 "3 Times Square",
   :fibo-fnd-plc-adr/hasPostalCode "10036",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/New_York,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/NewYork,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/ConventionalStreetAddress],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Thomson Reuters headquarters address",
   :skos/definition "headquarters address for Thomson Reuters Corporation"})

(def ThomsonReutersLegalAddress
  "Canadian legal domicile address for Thomson Reuters"
  {:db/ident :fibo-fbc-fct-usfsind/ThomsonReutersLegalAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "Bay Adelaide Centre",
   :fibo-fnd-plc-adr/hasAddressLine2 "333 Bay Street",
   :fibo-fnd-plc-adr/hasAddressLine3 "Suite 400",
   :fibo-fnd-plc-adr/hasPostalCode "M5H 2R2",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/Canada,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Toronto,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-ca/Ontario,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/ConventionalStreetAddress],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Thomson Reuters legal domicile address",
   :skos/definition "Canadian legal domicile address for Thomson Reuters"})

(def ThomsonReutersLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for Thomson Reuters Corporation"
  {:cmns-col/comprises :gleif-L1-data/L-549300561UZND4C7B569-LEI,
   :db/ident
   :fibo-fbc-fct-usfsind/ThomsonReutersLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2013-03-01T21:35:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-11-18T04:23:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-11-17T23:01:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type [:owl/NamedIndividual
              :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfs/label
   "Thomson Reuters Corporation legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for Thomson Reuters Corporation"})

(def ^{:private true} L-254900Y8NKGV541U8Q32-LEI
  "legal entity identifier for the Federal Reserve Bank of New York"
  {:cmns-id/identifies :fibo-fbc-fct-usjrga/FederalReserveBankOfNewYork-US-NY,
   :db/ident :gleif-L1-data/L-254900Y8NKGV541U8Q32-LEI,
   :fibo-fbc-fct-ra/isRegisteredBy
   :fibo-fbc-fct-usfsind/BloombergFinanceLPAsLocalOperatingUnit,
   :fibo-fnd-rel-rel/hasTag "254900Y8NKGV541U8Q32",
   :rdf/type [:fibo-be-le-lei/LegalEntityIdentifier :owl/NamedIndividual],
   :rdfs/label "Federal Reserve Bank of New York legal entity identifier",
   :skos/definition
   "legal entity identifier for the Federal Reserve Bank of New York"})

(def ^{:private true} L-5493000F4ZO33MV32P92-LEI
  "legal entity identifier for Intercontinental Exchange"
  {:cmns-id/identifies :fibo-fbc-fct-usfsind/IntercontinentalExchangeInc-US-DE,
   :db/ident           :gleif-L1-data/L-5493000F4ZO33MV32P92-LEI,
   :fibo-fnd-rel-rel/hasTag "5493000F4ZO33MV32P92",
   :rdf/type           [:fibo-be-le-lei/LegalEntityIdentifier
                        :owl/NamedIndividual],
   :rdfs/label         "Intercontinental Exchange legal entity identifier",
   :skos/definition    "legal entity identifier for Intercontinental Exchange"})

(def ^{:private true} L-5493001KJTIIGC8Y1R12-LEI
  "legal entity identifier for Bloomberg Finance L.P."
  {:cmns-id/identifies :fibo-fbc-fct-usfsind/BloombergFinanceLP-US-DE,
   :db/ident           :gleif-L1-data/L-5493001KJTIIGC8Y1R12-LEI,
   :fibo-fbc-fct-ra/isRegisteredBy
   :fibo-fbc-fct-usfsind/BloombergFinanceLPAsLocalOperatingUnit,
   :fibo-fnd-rel-rel/hasTag "5493001KJTIIGC8Y1R12",
   :rdf/type           [:fibo-be-le-lei/LegalEntityIdentifier
                        :owl/NamedIndividual],
   :rdfs/label         "Bloomberg Finance L.P. legal entity identifier",
   :skos/definition    "legal entity identifier for Bloomberg Finance L.P."})

(def ^{:private true} L-549300561UZND4C7B569-LEI
  "legal entity identifier for Thomson Reuters Corporation"
  {:cmns-id/identifies :fibo-fbc-fct-usfsind/ThomsonReutersCorporation,
   :db/ident :gleif-L1-data/L-549300561UZND4C7B569-LEI,
   :fibo-fnd-rel-rel/hasTag "549300561UZND4C7B569",
   :rdf/type [:fibo-be-le-lei/LegalEntityIdentifier :owl/NamedIndividual],
   :rdfs/label "Thomson Reuters Corporation legal entity identifier",
   :skos/definition "legal entity identifier for Thomson Reuters Corporation"})

(def ^{:private true} L-549300B56MD0ZC402L06-LEI
  "legal entity identifier for Bloomberg L.P."
  {:cmns-id/identifies :fibo-fbc-fct-usfsind/BloombergLP-US-DE,
   :db/ident           :gleif-L1-data/L-549300B56MD0ZC402L06-LEI,
   :fibo-fbc-fct-ra/isRegisteredBy
   :fibo-fbc-fct-usfsind/BloombergFinanceLPAsLocalOperatingUnit,
   :fibo-fnd-rel-rel/hasTag "549300B56MD0ZC402L06",
   :rdf/type           [:fibo-be-le-lei/LegalEntityIdentifier
                        :owl/NamedIndividual],
   :rdfs/label         "Bloomberg L.P. legal entity identifier",
   :skos/definition    "legal entity identifier for Bloomberg L.P."})

(def ^{:private true} L-549300HBJLRO8YFMI370-LEI
  "legal entity identifier for The Depository Trust Company"
  {:cmns-id/identifies :fibo-fbc-fct-usfsind/DTC-US-NY,
   :db/ident :gleif-L1-data/L-549300HBJLRO8YFMI370-LEI,
   :fibo-fnd-rel-rel/hasTag "MLDY5N6PZ58ZE60QU102",
   :rdf/type [:fibo-be-le-lei/LegalEntityIdentifier :owl/NamedIndividual],
   :rdfs/label "The Depository Trust Company legal entity identifier",
   :skos/definition "legal entity identifier for The Depository Trust Company"})

(def ^{:private true} L-549300NOPSIMGJNT8J31-LEI
  "legal entity identifier for the Corporation Service Company"
  {:cmns-id/identifies :fibo-fbc-fct-usjrga/CorporationServiceCompany-US-DE,
   :db/ident :gleif-L1-data/L-549300NOPSIMGJNT8J31-LEI,
   :fibo-fnd-rel-rel/hasTag "549300NOPSIMGJNT8J31",
   :rdf/type [:fibo-be-le-lei/LegalEntityIdentifier :owl/NamedIndividual],
   :rdfs/label "Corporation Service Company legal entity identifier",
   :skos/definition
   "legal entity identifier for the Corporation Service Company"})

(def ^{:private true} L-MLDY5N6PZ58ZE60QU102-LEI
  "legal entity identifier for The Depository Trust & Clearing Corporation"
  {:cmns-id/identifies :fibo-fbc-fct-usfsind/DTCC-US-DE,
   :db/ident :gleif-L1-data/L-MLDY5N6PZ58ZE60QU102-LEI,
   :fibo-fnd-rel-rel/hasTag "MLDY5N6PZ58ZE60QU102",
   :rdf/type [:fibo-be-le-lei/LegalEntityIdentifier :owl/NamedIndividual],
   :rdfs/label
   "The Depository Trust & Clearing Corporation legal entity identifier",
   :skos/definition
   "legal entity identifier for The Depository Trust & Clearing Corporation"})

(def ^{:private true} L-Y6X4K52KMJMZE7I7MY94-LEI
  "legal entity identifier for S&P Global, Inc."
  {:cmns-id/identifies :fibo-fbc-fct-usfsind/SPGlobalInc-US-NY,
   :db/ident           :gleif-L1-data/L-Y6X4K52KMJMZE7I7MY94-LEI,
   :fibo-fnd-rel-rel/hasTag "Y6X4K52KMJMZE7I7MY94",
   :rdf/type           [:fibo-be-le-lei/LegalEntityIdentifier
                        :owl/NamedIndividual],
   :rdfs/label         "S&P Global, Inc. legal entity identifier",
   :skos/definition    "legal entity identifier for S&P Global, Inc."})