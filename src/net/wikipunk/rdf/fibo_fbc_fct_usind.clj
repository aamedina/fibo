(ns net.wikipunk.rdf.fibo-fbc-fct-usind
  "This ontology includes example individuals for US national banks, state chartered banks, and other institutions, as well as details related to some of the larger corporations that issue stock and are represented in the Dow Jones Industrial Average and S&P 500."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :dcterms/abstract
   "This ontology includes example individuals for US national banks, state chartered banks, and other institutions, as well as details related to some of the larger corporations that issue stock and are represented in the Dow Jones Industrial Average and S&P 500.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/VirtualPlaces/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/OwnershipParties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/FinancialServicesEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/CorporateControl/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/LegalCapacity/"
    "https://www.omg.org/spec/Commons/Identifiers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Organizations/FormalOrganizations/"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/CorporateBodies/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/BusinessRegistries/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/ControlParties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LEIEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegulatoryAgencies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/BusinessCentersIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Trusts/Trusts/"
    "https://www.omg.org/spec/Commons/Designators/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/GovernmentEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/FormalBusinessOrganizations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/ProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Corporations/Corporations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/Markets/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-corp-corp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
    "fibo-be-ge-usj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/",
    "fibo-be-le-cb"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/",
    "fibo-be-le-fbo"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
    "fibo-be-le-lei"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-be-le-usee"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
    "fibo-be-oac-cctl"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/",
    "fibo-be-oac-opty"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/",
    "fibo-be-plc-plc"
    "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/",
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
    "fibo-fbc-fct-rga"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies/",
    "fibo-fbc-fct-usfse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
    "fibo-fbc-fct-usfsind"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
    "fibo-fbc-fct-usind"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
    "fibo-fbc-fct-usjrga"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-law-lcap"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/",
    "fibo-fnd-org-fm"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
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
    "lcc-3166-2-us"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-fct-usind",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "US Example Individuals",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals.rdf version of this ontology was revised to improve the representation of some of the LEI data and fix spelling errors."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/USJurisdiction/USExampleIndividuals.rdf version of this ontology was modified per the FIBO 2.0 RFC."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals.rdf version of this ontology was revised to make incorporation and registration dates explicit and to replace references to the legacy LCC UnitedStates country representation with UnitedStatesOfAmerica."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals.rdf version of this ontology was revised to update the LEI URIs to the new form published by the GLEIF on data.world."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/USJurisdiction/USExampleIndividuals.rdf version of this ontology was modified to add information about the example corporations included in FIBO use cases for securities instrument data and various indices such as the DJIA, update LEI records generally, eliminate duplication of concepts in LCC, simplify addresses, and merge countries with locations in FND."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/USJurisdiction/USExampleIndividuals.rdf version of this ontology was modified to reflect revisions to the GLEIF LEI representation for validation level and entity ownership relations."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/USJurisdiction/USExampleIndividuals.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FBC 1.0 FTF report."]})

(def AlphabetIncCorporateAddress
  "registration address for Alphabet Inc."
  {:db/ident :fibo-fbc-fct-usind/AlphabetIncCorporateAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "1600 Amphitheatre Parkway",
   :fibo-fnd-plc-adr/hasPostalCode "94043",
   :fibo-fnd-plc-loc/hasCityName "Mountain View",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/California,
   :rdf/type [:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Alphabet Inc. corporate address",
   :skos/definition "registration address for Alphabet Inc."})

(def AlphabetIncLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for Alphabet Inc."
  {:cmns-col/comprises :gleif-L1-data/L-5493006MHB84DD0ZWV18-LEI,
   :db/ident :fibo-fbc-fct-usind/AlphabetIncLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2015-08-31T20:16:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-11-30T04:17:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-11-29T22:57:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Alphabet Inc. legal entity identifier registry entry",
   :skos/definition "legal entity identifier registry entry for Alphabet Inc."})

(def AppleIncCorporateAddress
  "registration address for Apple Inc."
  {:db/ident :fibo-fbc-fct-usind/AppleIncCorporateAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "One Apple Park WY",
   :fibo-fnd-plc-adr/hasPostalCode "95014",
   :fibo-fnd-plc-loc/hasCityName "Cupertino",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/California,
   :rdf/type [:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Apple Inc. corporate address",
   :skos/definition "registration address for Apple Inc."})

(def AppleIncLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for for Apple Inc."
  {:cmns-col/comprises :gleif-L1-data/L-HWUPKR0MPOU8FGXBT394-LEI,
   :db/ident :fibo-fbc-fct-usind/AppleIncLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T19:53:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-08-20T01:31:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-08-09T21:42:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type [:owl/NamedIndividual
              :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Apple Inc. legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for for Apple Inc."})

(def BNYMellonNationalAssociation
  "BNY Mellon, National Association functional entity that is a state-chartered bank and a member of the Federal Reserve based in New York"
  {:db/ident :fibo-fbc-fct-usind/BNYMellonNationalAssociation,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usind/BNYMellonNationalAssociationDateEstablished,
   :fibo-fbc-fct-fse/hasDateInsured
   :fibo-fbc-fct-usind/BNYMellonNationalAssociationDateInsured,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usind/BNYMellonNationalAssociation-US-DE,
   :rdf/type [:fibo-fbc-fct-usfse/NationalBank :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "BNY Mellon, National Association",
   :skos/definition
   "BNY Mellon, National Association functional entity that is a state-chartered bank and a member of the Federal Reserve based in New York"})

(def BNYMellonNationalAssociation-US-DE
  "BNY Mellon, National Association legal entity that is a Delaware Corporation"
  {:db/ident :fibo-fbc-fct-usind/BNYMellonNationalAssociation-US-DE,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/BNYMellonNationalAssociationAddress,
   :fibo-be-le-lei/hasLegalAddress
   :fibo-fbc-fct-usind/BNYMellonNationalAssociationAddress,
   :fibo-be-oac-cctl/hasDomesticUltimateParent
   :fibo-fbc-fct-usind/BankOfNewYorkMellonCorporation,
   :fibo-fbc-fct-breg/hasPriorLegalName
   ["Mellon National Bank and Trust Company" "Mellon Bank, N.A."],
   :fibo-fbc-fct-breg/hasTradingOrOperationalName
   ["BNY Mellon Wealth Management" "BNY Mellon, N.A." "BNY Mellon"],
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-rel-rel/hasLegalName "BNY Mellon, National Association",
   :rdf/type [:fibo-be-le-cb/StockCorporation :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "BNY Mellon, National Association US-DE",
   :skos/definition
   "BNY Mellon, National Association legal entity that is a Delaware Corporation"})

(def BNYMellonNationalAssociationAddress
  "registration address for BNY Mellon, National Association"
  {:db/ident :fibo-fbc-fct-usind/BNYMellonNationalAssociationAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "500 Grant Street",
   :fibo-fnd-plc-adr/hasPostalCode "15258",
   :fibo-fnd-plc-loc/hasCityName "Pittsburgh",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/Pennsylvania,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/PhysicalAddress],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "BNY Mellon, National Association address",
   :skos/definition
   "registration address for BNY Mellon, National Association"})

(def BNYMellonNationalAssociationBusinessEntityIdentifier-SD
  "South Dakota Business Entity registration identifier for BNY Mellon, National Association"
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/SouthDakotaBusinessRegistrationIdentifierScheme,
   :cmns-id/identifies :fibo-fbc-fct-usind/BNYMellonNationalAssociation-US-DE,
   :db/ident
   :fibo-fbc-fct-usind/BNYMellonNationalAssociationBusinessEntityIdentifier-SD,
   :fibo-fbc-fct-breg/hasEntityStatus :fibo-fbc-fct-breg/ActiveStatus,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate "1997-06-05",
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/SouthDakotaBusinessInformationRegistry,
   :fibo-fnd-rel-rel/hasTag "FK010222",
   :fibo-fnd-rel-rel/isGovernedBy
   :fibo-be-ge-usj/StateOfSouthDakotaJurisdiction,
   :rdf/type [:owl/NamedIndividual :fibo-be-corp-corp/RegistrationIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label
   "business entity identifier for BNY Mellon, National Association",
   :skos/definition
   "South Dakota Business Entity registration identifier for BNY Mellon, National Association"})

(def BNYMellonNationalAssociationBusinessIdentifierCode
  "business identifier code (BIC) for BNY Mellon, National Association"
  {:cmns-col/comprises
   [:fibo-fbc-fct-usind/BNYMellonNationalAssociationBusinessPartyPrefix
    :fibo-fbc-fct-usind/BNYMellonNationalAssociationBusinessPartySuffix
    :lcc-3166-1/US],
   :cmns-cxtdsg/appliesTo :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-id/identifies :fibo-fbc-fct-usind/BNYMellonNationalAssociation-US-DE,
   :db/ident
   :fibo-fbc-fct-usind/BNYMellonNationalAssociationBusinessIdentifierCode,
   :fibo-fnd-rel-rel/hasTag "MELNUS3PXXX",
   :rdf/type [:fibo-fbc-fct-fse/BusinessIdentifierCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label
   "BNY Mellon, National Association - Business Identifier Code (BIC)",
   :skos/definition
   "business identifier code (BIC) for BNY Mellon, National Association"})

(def BNYMellonNationalAssociationBusinessPartyPrefix
  "BNY Mellon, National Association business party prefix"
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/BNYMellonNationalAssociationBusinessIdentifierCode,
   :db/ident
   :fibo-fbc-fct-usind/BNYMellonNationalAssociationBusinessPartyPrefix,
   :fibo-fnd-rel-rel/hasTag "MELN",
   :rdf/type [:fibo-fbc-fct-fse/BusinessPartyPrefix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "BNY Mellon, National Association business party prefix"})

(def BNYMellonNationalAssociationBusinessPartySuffix
  "BNY Mellon, National Association business party suffix"
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/BNYMellonNationalAssociationBusinessIdentifierCode,
   :db/ident
   :fibo-fbc-fct-usind/BNYMellonNationalAssociationBusinessPartySuffix,
   :fibo-fnd-rel-rel/hasTag "3P",
   :rdf/type [:fibo-fbc-fct-fse/BusinessPartySuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "BNY Mellon, National Association business party suffix"})

(def BNYMellonNationalAssociationDateEstablished
  "date that BNY Mellon, National Association (originally Mellon National Bank and Trust Company in Pennsylvania) was established according to the NIC Repository"
  {:db/ident :fibo-fbc-fct-usind/BNYMellonNationalAssociationDateEstablished,
   :fibo-fnd-dt-fd/hasDateValue "1869-01-01",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "BNY Mellon, National Association date established",
   :skos/definition
   "date that BNY Mellon, National Association (originally Mellon National Bank and Trust Company in Pennsylvania) was established according to the NIC Repository"})

(def BNYMellonNationalAssociationDateInsured
  "date that BNY Mellon, National Association (originally Mellon National Bank and Trust Company in Pennsylvania) was initially insured with respect to deposit insurance"
  {:db/ident :fibo-fbc-fct-usind/BNYMellonNationalAssociationDateInsured,
   :fibo-fnd-dt-fd/hasDateValue "1934-01-01",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "BNY Mellon, National Association date insured",
   :skos/definition
   "date that BNY Mellon, National Association (originally Mellon National Bank and Trust Company in Pennsylvania) was initially insured with respect to deposit insurance"})

(def BNYMellonNationalAssociationFDICCertificateNumber
  "FDIC Certificate number for BNY Mellon, National Association"
  {:cmns-id/identifies :fibo-fbc-fct-usind/BNYMellonNationalAssociation,
   :db/ident
   :fibo-fbc-fct-usind/BNYMellonNationalAssociationFDICCertificateNumber,
   :fibo-fnd-rel-rel/hasTag "7946",
   :rdf/type [:fibo-fbc-fct-usjrga/FDICCertificateNumber :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "BNY Mellon, National Association FDIC Certificate number",
   :skos/definition
   "FDIC Certificate number for BNY Mellon, National Association"})

(def BNYMellonNationalAssociationLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for BNY Mellon, National Association"
  {:cmns-col/comprises :gleif-L1-data/L-4EP6JBYBTPTQ47LZOB67-LEI,
   :db/ident
   :fibo-fbc-fct-usind/BNYMellonNationalAssociationLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-26T17:54:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-04-27T17:02:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-04-27T17:06:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label
   "BNY Mellon, National Association legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for BNY Mellon, National Association"})

(def BNYMellonNationalAssociationRSSDIdentifier
  "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to BNY Mellon, National Association"
  {:cmns-id/identifies :fibo-fbc-fct-usind/BNYMellonNationalAssociation,
   :db/ident :fibo-fbc-fct-usind/BNYMellonNationalAssociationRSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "934329",
   :rdf/type
   [:fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "BNY Mellon, National Association RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to BNY Mellon, National Association"})

(def BNYMellonNationalAssociationRTN
  "routing transit number (RTN) for BNY Mellon, National Association"
  {:cmns-id/identifies :fibo-fbc-fct-usind/BNYMellonNationalAssociation,
   :db/ident :fibo-fbc-fct-usind/BNYMellonNationalAssociationRTN,
   :fibo-fnd-rel-rel/hasTag "043019265",
   :rdf/type [:fibo-fbc-fct-usjrga/RoutingTransitNumber :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "BNY Mellon, National Association RTN",
   :skos/definition
   "routing transit number (RTN) for BNY Mellon, National Association"})

(def BankOfNewYorkMellonCorporation
  "financial holding company functional entity for the Bank of New York Mellon Corporation"
  {:db/ident :fibo-fbc-fct-usind/BankOfNewYorkMellonCorporation,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usind/BankOfNewYorkMellonCorporation-US-DE,
   :rdf/type [:fibo-fbc-fct-usfse/FinancialHoldingCompany :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "The Bank of New York Mellon Corporation",
   :skos/definition
   "financial holding company functional entity for the Bank of New York Mellon Corporation"})

(def BankOfNewYorkMellonCorporation-US-DE
  "publicly held company and for profit corporation that is The Bank of New York Mellon Corporation legal entity, incorporated in Delaware"
  {:db/ident :fibo-fbc-fct-usind/BankOfNewYorkMellonCorporation-US-DE,
   :fibo-be-corp-corp/hasDateOfRegistration
   :fibo-fbc-fct-usind/BankOfNewYorkMellonCorporationIncorporationDate,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/BankOfNewYorkMellonCorporationAddress,
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationTrustCompany,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-vrt/hasWebsite "https://www.bnymellon.com/",
   :fibo-fnd-rel-rel/hasLegalName "The Bank of New York Mellon Corporation",
   :rdf/type [:fibo-be-le-cb/ForProfitCorporation
              :owl/NamedIndividual
              :fibo-be-corp-corp/PubliclyHeldCompany],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "The Bank of New York Mellon Corporation US-DE",
   :skos/definition
   "publicly held company and for profit corporation that is The Bank of New York Mellon Corporation legal entity, incorporated in Delaware"})

(def BankOfNewYorkMellonCorporationAddress
  "registration address for The Bank of New York Mellon Corporation"
  {:db/ident :fibo-fbc-fct-usind/BankOfNewYorkMellonCorporationAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "225 Liberty Street",
   :fibo-fnd-plc-adr/hasPostalCode "10286",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/New_York,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/NewYork,
   :rdf/type [:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Bank of New York Mellon Corporation address",
   :skos/definition
   "registration address for The Bank of New York Mellon Corporation"})

(def BankOfNewYorkMellonCorporationBusinessEntityIdentifier
  "registration identifier assigned by the Delaware Department of Corporations for the Bank of New York Mellon Corporation"
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/DelawareBusinessRegistrationIdentifierScheme,
   :cmns-id/identifies :fibo-fbc-fct-usind/BankOfNewYorkMellonCorporation-US-DE,
   :db/ident
   :fibo-fbc-fct-usind/BankOfNewYorkMellonCorporationBusinessEntityIdentifier,
   :fibo-fbc-fct-breg/hasEntityStatus :fibo-fbc-fct-breg/ActiveStatus,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "4299124",
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :rdf/type [:owl/NamedIndividual :fibo-be-corp-corp/RegistrationIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Bank of New York Mellon Corporation business entity identifier",
   :skos/definition
   "registration identifier assigned by the Delaware Department of Corporations for the Bank of New York Mellon Corporation"})

(def BankOfNewYorkMellonCorporationIncorporationDate
  "the date that the Bank of New York Mellon Corporation was first incorporated in the State of Delaware"
  {:db/ident
   :fibo-fbc-fct-usind/BankOfNewYorkMellonCorporationIncorporationDate,
   :fibo-fnd-dt-fd/hasDateValue "2007-02-09",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Bank of New York Mellon Corporation incorporation date",
   :skos/definition
   "the date that the Bank of New York Mellon Corporation was first incorporated in the State of Delaware"})

(def BankOfNewYorkMellonCorporationLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for The Bank of New York Mellon Corporation"
  {:cmns-col/comprises :gleif-L1-data/L-WFLLPEPC7FZXENRZV188-LEI,
   :db/ident
   :fibo-fbc-fct-usind/BankOfNewYorkMellonCorporationLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T19:53:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-09-01T19:31:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-08-04T03:22:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type [:owl/NamedIndividual
              :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label
   "Bank of New York Mellon Corporation legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for The Bank of New York Mellon Corporation"})

(def BankOfNewYorkMellonCorporationRSSDIdentifier
  "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to The Bank of New York Mellon Corporation"
  {:cmns-id/identifies :fibo-fbc-fct-usind/BankOfNewYorkMellonCorporation,
   :db/ident :fibo-fbc-fct-usind/BankOfNewYorkMellonCorporationRSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "3587146",
   :rdf/type
   [:fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Bank of New York Mellon Corporation RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to The Bank of New York Mellon Corporation"})

(def BankOfNewYorkMellonDateEstablished
  "date that The Bank of New York Mellon Corporation was established by Alexander Hamilton"
  {:db/ident :fibo-fbc-fct-usind/BankOfNewYorkMellonDateEstablished,
   :fibo-fnd-dt-fd/hasDateValue "1784-01-01",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "The Bank of New York Mellon Corporation date established",
   :skos/definition
   "date that The Bank of New York Mellon Corporation was established by Alexander Hamilton"})

(def CitiCardsSouthDakotaAcceptanceCorp
  "finance company functional entity for the Citi Cards South Dakota Acceptance Corp., a credit card provider based in Sioux Falls, South Dakota"
  {:db/ident :fibo-fbc-fct-usind/CitiCardsSouthDakotaAcceptanceCorp,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usind/CitiCardsSouthDakotaAcceptanceCorp-US-DE,
   :rdf/type [:fibo-fbc-fct-fse/FinanceCompany :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citi Cards South Dakota Acceptance Corp.",
   :skos/definition
   "finance company functional entity for the Citi Cards South Dakota Acceptance Corp., a credit card provider based in Sioux Falls, South Dakota"})

(def CitiCardsSouthDakotaAcceptanceCorp-US-DE
  "stock corporation legal entity for Citi Cards South Dakota Acceptance Corp., a Delaware Corporation headquartered in Sioux Falls, South Dakota"
  {:db/ident :fibo-fbc-fct-usind/CitiCardsSouthDakotaAcceptanceCorp-US-DE,
   :fibo-be-corp-corp/hasDateOfRegistration
   :fibo-fbc-fct-usind/CitiCardsSouthDakotaAcceptanceCorpIncorporationDate,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/CitiCardsSouthDakotaAcceptanceCorpHeadquartersAddress,
   :fibo-be-oac-cctl/hasDomesticUltimateParent :fibo-fbc-fct-usind/CitigroupInc,
   :fibo-be-oac-opty/hasDirectOwnership
   :fibo-fbc-fct-usind/CitiCardsSouthDakotaAcceptanceCorpOwnership,
   :fibo-be-oac-opty/hasDirectOwningEntity
   :fibo-fbc-fct-usind/CitigroupInc-US-DE,
   :fibo-fbc-fct-breg/hasTradingOrOperationalName "Citibank, N.A.",
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationTrustCompany,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-rel-rel/hasLegalName "Citi Cards South Dakota Acceptance Corp.",
   :rdf/type [:fibo-be-le-cb/StockCorporation :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citi Cards South Dakota Acceptance Corp. US-DE",
   :skos/definition
   "stock corporation legal entity for Citi Cards South Dakota Acceptance Corp., a Delaware Corporation headquartered in Sioux Falls, South Dakota"})

(def CitiCardsSouthDakotaAcceptanceCorpBusinessEntityIdentifier
  "registration identifier assigned by the Delaware Department of Corporations for Citi Cards South Dakota Acceptance Corp."
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/DelawareBusinessRegistrationIdentifierScheme,
   :cmns-id/identifies
   :fibo-fbc-fct-usind/CitiCardsSouthDakotaAcceptanceCorp-US-DE,
   :db/ident
   :fibo-fbc-fct-usind/CitiCardsSouthDakotaAcceptanceCorpBusinessEntityIdentifier,
   :fibo-be-corp-corp/hasDateOfRegistration
   :fibo-fbc-fct-usind/CitiCardsSouthDakotaAcceptanceCorpIncorporationDate,
   :fibo-fbc-fct-breg/hasEntityStatus :fibo-fbc-fct-breg/ActiveStatus,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "3686137",
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label
   "Citi Cards South Dakota Acceptance Corp. business entity identifier",
   :skos/definition
   "registration identifier assigned by the Delaware Department of Corporations for Citi Cards South Dakota Acceptance Corp."})

(def CitiCardsSouthDakotaAcceptanceCorpHeadquartersAddress
  "registration address for Citi Cards South Dakota Acceptance Corp."
  {:db/ident
   :fibo-fbc-fct-usind/CitiCardsSouthDakotaAcceptanceCorpHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "701 East 60th Street North",
   :fibo-fnd-plc-adr/hasPostalCode "57104-0432",
   :fibo-fnd-plc-loc/hasCityName "Sioux Falls",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/SouthDakota,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/PhysicalAddress],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citi Cards South Dakota Acceptance Corp. headquarters address",
   :skos/definition
   "registration address for Citi Cards South Dakota Acceptance Corp."})

(def CitiCardsSouthDakotaAcceptanceCorpIncorporationDate
  "date that Citi Cards South Dakota Acceptance Corp. was first incorporated in the State of Delaware"
  {:db/ident
   :fibo-fbc-fct-usind/CitiCardsSouthDakotaAcceptanceCorpIncorporationDate,
   :fibo-fnd-dt-fd/hasDateValue "2003-07-28",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citi Cards South Dakota Acceptance Corp. incorporation date",
   :skos/definition
   "date that Citi Cards South Dakota Acceptance Corp. was first incorporated in the State of Delaware"})

(def CitiCardsSouthDakotaAcceptanceCorpOwnership
  "entity ownership context for Citi Cards South Dakota Acceptance Corp., a wholly owned subsidiary of Citigroup Inc."
  {:db/ident :fibo-fbc-fct-usind/CitiCardsSouthDakotaAcceptanceCorpOwnership,
   :fibo-be-le-lei/hasOwnershipPercentage 100,
   :fibo-be-oac-opty/hasOwnedEntity
   :fibo-fbc-fct-usind/CitiCardsSouthDakotaAcceptanceCorp-US-DE,
   :fibo-be-oac-opty/hasOwningEntity :fibo-fbc-fct-usind/CitigroupInc-US-DE,
   :fibo-fnd-agr-ctr/isQualifiedBy
   :fibo-be-le-lei/GenerallyAcceptedAccountingPrinciples,
   :rdf/type [:fibo-be-oac-opty/DirectConsolidation :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citi Cards South Dakota Acceptance Corp. ownership",
   :skos/definition
   "entity ownership context for Citi Cards South Dakota Acceptance Corp., a wholly owned subsidiary of Citigroup Inc."})

(def CitiCardsSouthDakotaAcceptanceCorpRSSDIdentifier
  "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to Citi Cards South Dakota Acceptance Corp."
  {:cmns-id/identifies :fibo-fbc-fct-usind/CitiCardsSouthDakotaAcceptanceCorp,
   :db/ident
   :fibo-fbc-fct-usind/CitiCardsSouthDakotaAcceptanceCorpRSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "3225130",
   :rdf/type
   [:fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citi Cards South Dakota Acceptance Corp. RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to Citi Cards South Dakota Acceptance Corp."})

(def CitibankNA
  "national bank functional entity for Citibank, N.A. (National Association), a national bank based in Sioux Falls, South Dakota"
  {:db/ident :fibo-fbc-fct-usind/CitibankNA,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usind/CitibankNADateEstablished,
   :fibo-fbc-fct-fse/hasDateInsured :fibo-fbc-fct-usind/CitibankNADateInsured,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usind/CitibankNA-US-DE,
   :rdf/type [:fibo-fbc-fct-usfse/NationalBank :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citibank, N.A.",
   :skos/definition
   "national bank functional entity for Citibank, N.A. (National Association), a national bank based in Sioux Falls, South Dakota"})

(def CitibankNA-US-DE
  "stock corporation legal entity for Citibank, N.A. (National Association), a Delaware Corporation headquartered in Sioux Falls, South Dakota"
  {:db/ident :fibo-fbc-fct-usind/CitibankNA-US-DE,
   :fibo-be-corp-corp/hasDateOfRegistration
   :fibo-fbc-fct-usind/CitibankNAIncorporationDate,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/CitibankNAHeadquartersAddress,
   :fibo-be-le-lei/hasLegalAddress :fibo-fbc-fct-usind/CitibankNALegalAddress,
   :fibo-be-oac-cctl/hasDomesticUltimateParent :fibo-fbc-fct-usind/CitigroupInc,
   :fibo-fbc-fct-breg/hasPriorLegalName ["First National City Bank of New York"
                                         "First National City Bank"],
   :fibo-fbc-fct-breg/hasTradingOrOperationalName "Citibank, N.A.",
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-rel-rel/hasLegalName "Citibank, National Association",
   :rdf/type [:owl/NamedIndividual :fibo-be-le-cb/StockCorporation],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citibank, N.A. US-DE",
   :skos/definition
   "stock corporation legal entity for Citibank, N.A. (National Association), a Delaware Corporation headquartered in Sioux Falls, South Dakota"})

(def CitibankNABusinessEntityIdentifier
  "registration identifier assigned by the Delaware Department of Corporations for Citibank N.A."
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/DelawareBusinessRegistrationIdentifierScheme,
   :cmns-id/identifies :fibo-fbc-fct-usind/CitibankNA-US-DE,
   :db/ident :fibo-fbc-fct-usind/CitibankNABusinessEntityIdentifier,
   :fibo-be-corp-corp/hasDateOfRegistration
   :fibo-fbc-fct-usind/CitibankNAIncorporationDate,
   :fibo-fbc-fct-breg/hasEntityStatus :fibo-fbc-fct-breg/ActiveStatus,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "944169",
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :rdf/type [:owl/NamedIndividual :fibo-be-corp-corp/RegistrationIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citibank, N.A. business entity identifier",
   :skos/definition
   "registration identifier assigned by the Delaware Department of Corporations for Citibank N.A."})

(def CitibankNADateEstablished
  "date that Citibank, N.A. (originally First National City Bank Of New York) was established"
  {:db/ident :fibo-fbc-fct-usind/CitibankNADateEstablished,
   :fibo-fnd-dt-fd/hasDateValue "1812-06-16",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citibank, N.A. date established",
   :skos/definition
   "date that Citibank, N.A. (originally First National City Bank Of New York) was established"})

(def CitibankNADateInsured
  "date that Citibank, N.A. (as First National City Bank Of New York) was initially insured with respect to deposit insurance by the FDIC"
  {:db/ident :fibo-fbc-fct-usind/CitibankNADateInsured,
   :fibo-fnd-dt-fd/hasDateValue "1934-01-01",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citibank, N.A. date insured",
   :skos/definition
   "date that Citibank, N.A. (as First National City Bank Of New York) was initially insured with respect to deposit insurance by the FDIC"})

(def CitibankNAFDICCertificateNumber
  "FDIC Certificate number for Citibank, N.A."
  {:cmns-av/explanatoryNote
   "From the NIC and FDIC records, it appears that Citibank, National Association (with RSSD of 112855 and FDIC certificate of 16100) and Citibank, N.A. have been merged into a single national bank, with the surviving FDIC certificate and RSSD as defined herein.",
   :cmns-id/identifies :fibo-fbc-fct-usind/CitibankNA,
   :db/ident :fibo-fbc-fct-usind/CitibankNAFDICCertificateNumber,
   :fibo-fnd-rel-rel/hasTag "7213",
   :rdf/type [:fibo-fbc-fct-usjrga/FDICCertificateNumber :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citibank, N.A. FDIC Certificate number",
   :skos/definition "FDIC Certificate number for Citibank, N.A."})

(def CitibankNAHeadquartersAddress
  "registration address that is identified as a headquarters address for Citibank N.A."
  {:db/ident :fibo-fbc-fct-usind/CitibankNAHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "399 Park Avenue",
   :fibo-fnd-plc-adr/hasPostalCode "10022-4617",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/New_York,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/NewYork,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/PhysicalAddress],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citibank, N.A headquarters address",
   :skos/definition
   "registration address that is identified as a headquarters address for Citibank N.A."})

(def CitibankNAIncorporationDate
  "date that Citibank, N.A. (National Association) was first incorporated in the State of Delaware"
  {:db/ident :fibo-fbc-fct-usind/CitibankNAIncorporationDate,
   :fibo-fnd-dt-fd/hasDateValue "1982-09-10",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citibank, N.A. incorporation date",
   :skos/definition
   "date that Citibank, N.A. (National Association) was first incorporated in the State of Delaware"})

(def CitibankNALegalAddress
  "registration address that is identified as a legal address for Citibank N.A. (National Association)"
  {:db/ident :fibo-fbc-fct-usind/CitibankNALegalAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "701 East 60th Street North",
   :fibo-fnd-plc-adr/hasPostalCode "57104-0432",
   :fibo-fnd-plc-loc/hasCityName "Sioux Falls",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/SouthDakota,
   :rdf/type [:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citibank N.A. legal address",
   :skos/definition
   "registration address that is identified as a legal address for Citibank N.A. (National Association)"})

(def CitibankNALegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for Citibank, N.A."
  {:cmns-col/comprises :gleif-L1-data/L-E57ODZWZ7FF32TWEFA76-LEI,
   :db/ident :fibo-fbc-fct-usind/CitibankNALegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T19:53:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-05-27T23:56:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-05-28T00:19:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citibank, N.A. legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for Citibank, N.A."})

(def CitibankNAOwnership
  "entity ownership context for Citibank, N.A., a wholly owned subsidiary of Citicorp LLC"
  {:db/ident :fibo-fbc-fct-usind/CitibankNAOwnership,
   :fibo-be-le-lei/hasOwnershipPercentage 100,
   :fibo-be-oac-opty/hasOwnedEntity :fibo-fbc-fct-usind/CitibankNA-US-DE,
   :fibo-be-oac-opty/hasOwningEntity :fibo-fbc-fct-usind/CiticorpLLC-US-DE,
   :fibo-fnd-agr-ctr/isQualifiedBy
   :fibo-be-le-lei/GenerallyAcceptedAccountingPrinciples,
   :rdf/type [:fibo-be-oac-opty/DirectConsolidation :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citibank, N.A. ownership",
   :skos/definition
   "entity ownership context for Citibank, N.A., a wholly owned subsidiary of Citicorp LLC"})

(def CitibankNARSSDIdentifier
  "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to Citibank, N.A."
  {:cmns-av/explanatoryNote
   "From the NIC and FDIC records, it appears that Citibank, National Association (with RSSD of 112855 and FDIC certificate of 16100) and Citibank, N.A. have been merged into a single national bank, with the surviving FDIC certificate and RSSD as defined herein.",
   :cmns-id/identifies :fibo-fbc-fct-usind/CitibankNA,
   :db/ident :fibo-fbc-fct-usind/CitibankNARSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "476810",
   :rdf/type
   [:fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citibank, N.A. RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to Citibank, N.A."})

(def CitibankNARTN
  "routing transit number (RTN) for Citibank, N.A."
  {:cmns-id/identifies :fibo-fbc-fct-usind/CitibankNA,
   :db/ident :fibo-fbc-fct-usind/CitibankNARTN,
   :fibo-fnd-rel-rel/hasTag "021000089",
   :rdf/type [:fibo-fbc-fct-usjrga/RoutingTransitNumber :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citibank, N.A. RTN",
   :skos/definition "routing transit number (RTN) for Citibank, N.A."})

(def CiticorpLLC
  "financial holding company functional entity for Citicorp LLC"
  {:db/ident :fibo-fbc-fct-usind/CiticorpLLC,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usind/CiticorpLLC-US-DE,
   :rdf/type [:fibo-fbc-fct-usfse/FinancialHoldingCompany :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citicorp LLC",
   :skos/definition
   "financial holding company functional entity for Citicorp LLC"})

(def CiticorpLLC-US-DE
  "private company with limited liability legal entity for Citicorp LLC, a Delaware Limited Liability Company"
  {:db/ident :fibo-fbc-fct-usind/CiticorpLLC-US-DE,
   :fibo-be-corp-corp/hasDateOfRegistration
   :fibo-fbc-fct-usind/CiticorpLLCRegistrationDate,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/CitigroupIncHeadquartersAddress,
   :fibo-be-oac-cctl/hasSubsidiary :fibo-fbc-fct-usind/CitibankNA,
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationTrustCompany,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-rel-rel/hasLegalName "Citicorp LLC",
   :rdf/type [:owl/NamedIndividual
              :fibo-be-plc-plc/PrivateCompanyWithLimitedLiability],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citicorp LLC US-DE",
   :skos/definition
   "private company with limited liability legal entity for Citicorp LLC, a Delaware Limited Liability Company"})

(def CiticorpLLCBusinessEntityIdentifier
  "registration identifier assigned by the Delaware Department of Corporations for Citicorp LLC"
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/DelawareBusinessRegistrationIdentifierScheme,
   :cmns-id/identifies :fibo-fbc-fct-usind/CiticorpLLC-US-DE,
   :db/ident :fibo-fbc-fct-usind/CiticorpLLCBusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "3911630",
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citicorp LLC business entity identifier",
   :skos/definition
   "registration identifier assigned by the Delaware Department of Corporations for Citicorp LLC"})

(def CiticorpLLCLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for Citicorp LLC"
  {:cmns-col/comprises :gleif-L1-data/L-549300PSHWOM1D1JVL23-LEI,
   :db/ident :fibo-fbc-fct-usind/CiticorpLLCLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2016-05-05T05:54:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-06-09T19:32:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-05-28T00:19:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citicorp LLC legal entity identifier registry entry",
   :skos/definition "legal entity identifier registry entry for Citicorp LLC"})

(def CiticorpLLCOwnership
  "entity ownership context for Citicorp LLC, a wholly owned subsidiary of Citigroup Inc."
  {:db/ident :fibo-fbc-fct-usind/CiticorpLLCOwnership,
   :fibo-be-le-lei/hasOwnershipPercentage 100,
   :fibo-be-oac-opty/hasOwnedEntity :fibo-fbc-fct-usind/CiticorpLLC-US-DE,
   :fibo-be-oac-opty/hasOwningEntity :fibo-fbc-fct-usind/CitigroupInc-US-DE,
   :fibo-fnd-agr-ctr/isQualifiedBy
   :fibo-be-le-lei/GenerallyAcceptedAccountingPrinciples,
   :rdf/type [:fibo-be-oac-opty/DirectConsolidation :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citicorp LLC ownership",
   :skos/definition
   "entity ownership context for Citicorp LLC, a wholly owned subsidiary of Citigroup Inc."})

(def CiticorpLLCRSSDIdentifier
  "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to Citicorp LLC"
  {:cmns-id/identifies :fibo-fbc-fct-usind/CiticorpLLC,
   :db/ident :fibo-fbc-fct-usind/CiticorpLLCRSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "3375370",
   :rdf/type
   [:fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citicorp LLC RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to Citicorp LLC"})

(def CiticorpLLCRegistrationDate
  "date that Citicorp LLC was first registered as a limited liability company in the State of Delaware"
  {:db/ident :fibo-fbc-fct-usind/CiticorpLLCRegistrationDate,
   :fibo-fnd-dt-fd/hasDateValue "2005-01-13",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citicorp LLC registration date",
   :skos/definition
   "date that Citicorp LLC was first registered as a limited liability company in the State of Delaware"})

(def CitigroupInc
  "financial holding company functional entity for Citigroup Inc."
  {:db/ident :fibo-fbc-fct-usind/CitigroupInc,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usind/CitigroupInc-US-DE,
   :rdf/type [:fibo-fbc-fct-usfse/FinancialHoldingCompany :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citigroup Inc.",
   :skos/definition
   "financial holding company functional entity for Citigroup Inc."})

(def CitigroupInc-US-DE
  "stock corporation legal entity for Citigroup Inc., a Delaware Corporation"
  {:db/ident :fibo-fbc-fct-usind/CitigroupInc-US-DE,
   :fibo-be-corp-corp/hasDateOfRegistration
   :fibo-fbc-fct-usind/CitigroupIncIncorporationDate,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/CitigroupIncHeadquartersAddress,
   :fibo-be-oac-cctl/hasSubsidiary
   [:fibo-fbc-fct-usind/CitiCardsSouthDakotaAcceptanceCorp
    :fibo-fbc-fct-usind/CiticorpLLC],
   :fibo-fbc-fct-breg/hasPriorLegalName
   ["Primerica Corporation" "The Travelers Inc." "Travelers Group Inc."],
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationTrustCompany,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-rel-rel/hasLegalName "Citigroup Inc.",
   :rdf/type [:owl/NamedIndividual
              :fibo-be-le-cb/ForProfitCorporation
              :fibo-be-corp-corp/PubliclyHeldCompany],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citigroup Inc. US-DE",
   :skos/definition
   "stock corporation legal entity for Citigroup Inc., a Delaware Corporation"})

(def CitigroupIncBusinessEntityIdentifier
  "registration identifier assigned by the Delaware Department of Corporations for Citigroup Inc."
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/DelawareBusinessRegistrationIdentifierScheme,
   :cmns-id/identifies :fibo-fbc-fct-usind/CitigroupInc-US-DE,
   :db/ident :fibo-fbc-fct-usind/CitigroupIncBusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "2154254",
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :rdf/type [:owl/NamedIndividual :fibo-be-corp-corp/RegistrationIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citigroup Inc. business entity identifier",
   :skos/definition
   "registration identifier assigned by the Delaware Department of Corporations for Citigroup Inc."})

(def CitigroupIncHeadquartersAddress
  "registration address identified as a headquarters address for Citigroup Inc."
  {:db/ident :fibo-fbc-fct-usind/CitigroupIncHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "388 Greenwich Street",
   :fibo-fnd-plc-adr/hasPostalCode "10013",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/New_York,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/NewYork,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/PhysicalAddress],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citigroup Inc. headquarters address",
   :skos/definition
   "registration address identified as a headquarters address for Citigroup Inc."})

(def CitigroupIncIncorporationDate
  "date that Citigroup Inc. was first registered as a corporation in the State of Delaware"
  {:db/ident :fibo-fbc-fct-usind/CitigroupIncIncorporationDate,
   :fibo-fnd-dt-fd/hasDateValue "1988-03-08",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citigroup Inc. incorporation date",
   :skos/definition
   "date that Citigroup Inc. was first registered as a corporation in the State of Delaware"})

(def CitigroupIncLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for Citigroup Inc."
  {:cmns-col/comprises :gleif-L1-data/L-6SHGI4ZSSLCXXQSBB395-LEI,
   :db/ident :fibo-fbc-fct-usind/CitigroupIncLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T19:53:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-06-17T19:33:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-05-28T00:19:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citigroup Inc. legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for Citigroup Inc."})

(def CitigroupIncRSSDIdentifier
  "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to Citigroup Inc."
  {:cmns-id/identifies :fibo-fbc-fct-usind/CitigroupInc,
   :db/ident :fibo-fbc-fct-usind/CitigroupIncRSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "1951350",
   :rdf/type
   [:fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Citigroup Inc. RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to Citigroup Inc."})

(def FMRLLC
  "management company functional entity for FMR LLC, a multinational financial services corporation based in Boston, MA"
  {:db/ident :fibo-fbc-fct-usind/FMRLLC,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usind/FMRLLCDateEstablished,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usind/FMRLLC-US-DE,
   :rdf/type [:fibo-fbc-fct-fse/ManagementCompany :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "FMR LLC",
   :skos/definition
   "management company functional entity for FMR LLC, a multinational financial services corporation based in Boston, MA"})

(def FMRLLC-US-DE
  "private company with limited liability legal entity for FMR LLC that is a Delaware Limited Liability Company"
  {:db/ident :fibo-fbc-fct-usind/FMRLLC-US-DE,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/FMRLLCHeadquartersAddress,
   :fibo-fbc-fct-breg/hasPriorLegalName
   "Fidelity Management and Research Company",
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationTrustCompany,
   :fibo-fnd-plc-vrt/hasWebsite "https://www.fidelity.com/",
   :fibo-fnd-rel-rel/hasLegalName "FMR LLC",
   :rdf/type [:fibo-be-plc-plc/PrivateCompanyWithLimitedLiability
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "FMR LLC US-DE",
   :skos/definition
   "private company with limited liability legal entity for FMR LLC that is a Delaware Limited Liability Company"})

(def FMRLLCBusinessEntityIdentifier
  "registration identifier assigned by the Delaware Department of Corporations for FMR LLC"
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/DelawareBusinessRegistrationIdentifierScheme,
   :cmns-id/identifies :fibo-fbc-fct-usind/FMRLLC-US-DE,
   :db/ident :fibo-fbc-fct-usind/FMRLLCBusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "4403845",
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "FMR LLC business entity identifier",
   :skos/definition
   "registration identifier assigned by the Delaware Department of Corporations for FMR LLC"})

(def FMRLLCDateEstablished
  "date that FMR LLC (originally Fidelity Management and Research Company) was first established"
  {:db/ident :fibo-fbc-fct-usind/FMRLLCDateEstablished,
   :fibo-fnd-dt-fd/hasDateValue "1946-01-01",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "FMR LLC date established",
   :skos/definition
   "date that FMR LLC (originally Fidelity Management and Research Company) was first established"})

(def FMRLLCHeadquartersAddress
  "registration address identified as a headquarters address for FMR LLC"
  {:db/ident :fibo-fbc-fct-usind/FMRLLCHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "245 Summer Street",
   :fibo-fnd-plc-adr/hasPostalCode "02210",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Boston,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/Massachusetts,
   :rdf/type [:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "FMR LLC headquarters address",
   :skos/definition
   "registration address identified as a headquarters address for FMR LLC"})

(def FMRLLCLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for FMR LLC"
  {:cmns-col/comprises :gleif-L1-data/L-6X064LF7Y6B4DKF2GZ26-LEI,
   :db/ident :fibo-fbc-fct-usind/FMRLLCLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T19:52:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-06-28T16:47:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-06-28T16:51:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "FMR LLC legal entity identifier registry entry",
   :skos/definition "legal entity identifier registry entry for FMR LLC"})

(def FMRLLCRSSDIdentifier
  "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to FMR LLC"
  {:cmns-id/identifies :fibo-fbc-fct-usind/FMRLLC,
   :db/ident :fibo-fbc-fct-usind/FMRLLCRSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "1245983",
   :rdf/type
   [:fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "FMR LLC RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to FMR LLC"})

(def InternationalBusinessMachinesCorporationAddress
  "registration address for International Business Machines Corporation"
  {:db/ident
   :fibo-fbc-fct-usind/InternationalBusinessMachinesCorporationAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "New Orchard Road",
   :fibo-fnd-plc-adr/hasPostalCode "10504",
   :fibo-fnd-plc-loc/hasCityName "Armonk",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/NewYork,
   :rdf/type [:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "International Business Machines Corporation address",
   :skos/definition
   "registration address for International Business Machines Corporation"})

(def InternationalBusinessMachinesCorporationBusinessIdentifierCode
  "business identifier code (BIC) for International Business Machines Corporation"
  {:cmns-col/comprises
   [:fibo-fbc-fct-usind/InternationalBusinessMachinesCorporationBusinessPartySuffix
    :lcc-3166-1/US
    :fibo-fbc-fct-usind/InternationalBusinessMachinesCorporationBusinessPartyPrefix],
   :cmns-cxtdsg/appliesTo :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-id/identifies
   :fibo-be-le-usee/InternationalBusinessMachinesCorporation-US-NY,
   :db/ident
   :fibo-fbc-fct-usind/InternationalBusinessMachinesCorporationBusinessIdentifierCode,
   :fibo-fnd-rel-rel/hasTag "IBMXUS33XXX",
   :rdf/type [:owl/NamedIndividual :fibo-fbc-fct-fse/BusinessIdentifierCode],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label
   "International Business Machines Corporation Business Identifier Code (BIC)",
   :skos/definition
   "business identifier code (BIC) for International Business Machines Corporation"})

(def InternationalBusinessMachinesCorporationBusinessPartyPrefix
  "business party prefix for International Business Machines Corporation"
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/InternationalBusinessMachinesCorporationBusinessIdentifierCode,
   :db/ident
   :fibo-fbc-fct-usind/InternationalBusinessMachinesCorporationBusinessPartyPrefix,
   :fibo-fnd-rel-rel/hasTag "IBMX",
   :rdf/type [:fibo-fbc-fct-fse/BusinessPartyPrefix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label
   "International Business Machines Corporation business party prefix",
   :skos/definition
   "business party prefix for International Business Machines Corporation"})

(def InternationalBusinessMachinesCorporationBusinessPartySuffix
  "business party suffix for International Business Machines Corporation"
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/InternationalBusinessMachinesCorporationBusinessIdentifierCode,
   :db/ident
   :fibo-fbc-fct-usind/InternationalBusinessMachinesCorporationBusinessPartySuffix,
   :fibo-fnd-rel-rel/hasTag "33",
   :rdf/type [:fibo-fbc-fct-fse/BusinessPartySuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label
   "International Business Machines Corporation business party suffix",
   :skos/definition
   "business party suffix for International Business Machines Corporation"})

(def InternationalBusinessMachinesCorporationLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for International Business Machines Corporation"
  {:cmns-col/comprises :gleif-L1-data/L-VGRQXHF3J8VDLUA7XE92-LEI,
   :db/ident
   :fibo-fbc-fct-usind/InternationalBusinessMachinesCorporationLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-27T15:47:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-05-28T01:33:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-05-11T01:00:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type [:owl/NamedIndividual
              :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label
   "International Business Machines Corporation legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for International Business Machines Corporation"})

(def JPMorganChaseAndCo
  "financial holding company functional entity for JPMorgan Chase & Co."
  {:db/ident :fibo-fbc-fct-usind/JPMorganChaseAndCo,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usind/JPMorganChaseAndCo-US-DE,
   :rdf/type [:fibo-fbc-fct-usfse/FinancialHoldingCompany :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "JPMorgan Chase & Co.",
   :skos/definition
   "financial holding company functional entity for JPMorgan Chase & Co."})

(def JPMorganChaseAndCo-US-DE
  "publicly held company and for profit corporation legal entity for the JPMorgan Chase & Co., a Delaware Corporation"
  {:db/ident :fibo-fbc-fct-usind/JPMorganChaseAndCo-US-DE,
   :fibo-be-corp-corp/hasDateOfRegistration
   :fibo-fbc-fct-usind/JPMorganChaseAndCoIncorporationDate,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/JPMorganChaseAndCoHeadquartersAddress,
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationTrustCompany,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-vrt/hasWebsite "https://www.jpmorganchase.com/",
   :fibo-fnd-rel-rel/hasLegalName "JPMorgan Chase & Co.",
   :rdf/type [:owl/NamedIndividual
              :fibo-be-le-cb/ForProfitCorporation
              :fibo-be-corp-corp/PubliclyHeldCompany],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "JPMorgan Chase & Co. US-DE",
   :skos/definition
   "publicly held company and for profit corporation legal entity for the JPMorgan Chase & Co., a Delaware Corporation"})

(def JPMorganChaseAndCoBusinessEntityIdentifier
  "registration identifier assigned by the Delaware Department of Corporations for JPMorgan Chase & Co."
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/DelawareBusinessRegistrationIdentifierScheme,
   :cmns-id/identifies :fibo-fbc-fct-usind/JPMorganChaseAndCo-US-DE,
   :db/ident :fibo-fbc-fct-usind/JPMorganChaseAndCoBusinessEntityIdentifier,
   :fibo-fbc-fct-breg/hasEntityStatus :fibo-fbc-fct-breg/ActiveStatus,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "691011",
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :rdf/type [:owl/NamedIndividual :fibo-be-corp-corp/RegistrationIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "JPMorgan Chase & Co. business entity identifier",
   :skos/definition
   "registration identifier assigned by the Delaware Department of Corporations for JPMorgan Chase & Co."})

(def JPMorganChaseAndCoBusinessIdentifierCode
  "business identifier code (BIC) for JPMorgan Chase & Co."
  {:cmns-col/comprises
   [:fibo-fbc-fct-usind/JPMorganChaseAndCoBusinessPartySuffix
    :lcc-3166-1/US
    :fibo-fbc-fct-usind/JPMorganChaseAndCoBusinessPartyPrefix],
   :cmns-cxtdsg/appliesTo :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-id/identifies :fibo-fbc-fct-usind/JPMorganChaseAndCo-US-DE,
   :db/ident :fibo-fbc-fct-usind/JPMorganChaseAndCoBusinessIdentifierCode,
   :fibo-fnd-rel-rel/hasTag "HAMQUS31XXX",
   :rdf/type [:owl/NamedIndividual :fibo-fbc-fct-fse/BusinessIdentifierCode],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "JPMorgan Chase & Co. Business Identifier Code (BIC)",
   :skos/definition "business identifier code (BIC) for JPMorgan Chase & Co."})

(def JPMorganChaseAndCoBusinessPartyPrefix
  "business party prefix for JPMorgan Chase & Co."
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/JPMorganChaseAndCoBusinessIdentifierCode,
   :db/ident :fibo-fbc-fct-usind/JPMorganChaseAndCoBusinessPartyPrefix,
   :fibo-fnd-rel-rel/hasTag "HAMQ",
   :rdf/type [:fibo-fbc-fct-fse/BusinessPartyPrefix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "JPMorgan Chase & Co. business party prefix",
   :skos/definition "business party prefix for JPMorgan Chase & Co."})

(def JPMorganChaseAndCoBusinessPartySuffix
  "business party suffix for JPMorgan Chase & Co."
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/JPMorganChaseAndCoBusinessIdentifierCode,
   :db/ident :fibo-fbc-fct-usind/JPMorganChaseAndCoBusinessPartySuffix,
   :fibo-fnd-rel-rel/hasTag "31",
   :rdf/type [:fibo-fbc-fct-fse/BusinessPartySuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "JPMorgan Chase & Co. business party suffix",
   :skos/definition "business party suffix for JPMorgan Chase & Co."})

(def JPMorganChaseAndCoHeadquartersAddress
  "registration address identified as the headquarters address for JPMorgan Chase & Co."
  {:db/ident :fibo-fbc-fct-usind/JPMorganChaseAndCoHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "270 Park Avenue",
   :fibo-fnd-plc-adr/hasPostalCode "10017-2070",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/New_York,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/NewYork,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/PhysicalAddress],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "JPMorgan Chase & Co. headquarters address",
   :skos/definition
   "registration address identified as the headquarters address for JPMorgan Chase & Co."})

(def JPMorganChaseAndCoIncorporationDate
  "date that JPMorgan Chase & Co. was first registered as a corporation in the State of Delaware"
  {:db/ident :fibo-fbc-fct-usind/JPMorganChaseAndCoIncorporationDate,
   :fibo-fnd-dt-fd/hasDateValue "1968-10-28",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "JPMorgan Chase & Co. incorporation date",
   :skos/definition
   "date that JPMorgan Chase & Co. was first registered as a corporation in the State of Delaware"})

(def JPMorganChaseAndCoLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for JPMorgan Chase & Co."
  {:cmns-col/comprises :gleif-L1-data/L-8I5DZWZKVSZI1NUHU748-LEI,
   :db/ident
   :fibo-fbc-fct-usind/JPMorganChaseAndCoLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T19:53:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-01-08T04:26:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-01-08T04:27:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "JPMorgan Chase & Co. legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for JPMorgan Chase & Co."})

(def JPMorganChaseAndCoRSSDIdentifier
  "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to JPMorgan Chase & Co."
  {:cmns-id/identifies :fibo-fbc-fct-usind/JPMorganChaseAndCo,
   :db/ident :fibo-fbc-fct-usind/JPMorganChaseAndCoRSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "1039502",
   :rdf/type
   [:fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "JPMorgan Chase & Co. RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to JPMorgan Chase & Co."})

(def JPMorganChaseBankNationalAssociation
  "national bank functional entity for JPMorgan Chase Bank, National Association"
  {:db/ident :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociation,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationDateEstablished,
   :fibo-fbc-fct-fse/hasDateInsured
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationDateInsured,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociation-US-OH,
   :rdf/type [:fibo-fbc-fct-usfse/NationalBank :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "JPMorgan Chase Bank, National Association",
   :skos/definition
   "national bank functional entity for JPMorgan Chase Bank, National Association"})

(def JPMorganChaseBankNationalAssociation-US-OH
  "stock corporation legal entity for JPMorgan Chase Bank, National Association, an Ohio Corporation"
  {:db/ident :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociation-US-OH,
   :fibo-be-corp-corp/hasDateOfRegistration
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationRegistrationDate,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfOhioJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationAddress,
   :fibo-be-le-lei/hasLegalAddress
   :fibo-fbc-fct-usind/JPMorganChaseAndCoHeadquartersAddress,
   :fibo-be-oac-cctl/hasDomesticUltimateParent
   :fibo-fbc-fct-usind/JPMorganChaseAndCo,
   :fibo-fbc-fct-breg/hasTradingOrOperationalName "JPMorgan Chase Bank, N.A.",
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationTrustCompany,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-vrt/hasWebsite "https://www.chase.com/",
   :fibo-fnd-rel-rel/hasLegalName "JPMorgan Chase Bank, National Association",
   :rdf/type [:fibo-be-le-cb/StockCorporation :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "JPMorgan Chase Bank, National Association US-DE",
   :skos/definition
   "stock corporation legal entity for JPMorgan Chase Bank, National Association, an Ohio Corporation"})

(def JPMorganChaseBankNationalAssociationAddress
  "registration address for JPMorgan Chase Bank, National Association"
  {:db/ident :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "1111 Polaris Parkway",
   :fibo-fnd-plc-adr/hasPostalCode "43240",
   :fibo-fnd-plc-loc/hasCityName "Columbus",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/Ohio,
   :rdf/type [:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "JPMorgan Chase Bank, National Association address",
   :skos/definition
   "registration address for JPMorgan Chase Bank, National Association"})

(def JPMorganChaseBankNationalAssociationBusinessEntityIdentifier
  "registration identifier assigned by the Ohio Department of Corporations for JPMorgan Chase Bank, National Association"
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/OhioBusinessRegistrationIdentifierScheme,
   :cmns-id/identifies
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociation-US-OH,
   :db/ident
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationBusinessEntityIdentifier,
   :fibo-fbc-fct-breg/hasEntityStatus :fibo-fbc-fct-breg/ActiveStatus,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/OhioBusinessFilingPortal,
   :fibo-fnd-rel-rel/hasTag "2118141",
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfOhioJurisdiction,
   :rdf/type [:owl/NamedIndividual :fibo-be-corp-corp/RegistrationIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label
   "JPMorgan Chase Bank, National Association business entity identifier",
   :skos/definition
   "registration identifier assigned by the Ohio Department of Corporations for JPMorgan Chase Bank, National Association"})

(def JPMorganChaseBankNationalAssociationBusinessIdentifierCode
  "business identifier code (BIC) for JPMorgan Chase Bank, National Association"
  {:cmns-col/comprises
   [:lcc-3166-1/US
    :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationBusinessPartyPrefix
    :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationBusinessPartySuffix],
   :cmns-cxtdsg/appliesTo :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-id/identifies
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociation-US-OH,
   :db/ident
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationBusinessIdentifierCode,
   :fibo-fnd-rel-rel/hasTag "CHASUS33XXX",
   :rdf/type [:fibo-fbc-fct-fse/BusinessIdentifierCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label
   "JPMorgan Chase Bank, National Association - business identifier code (BIC)",
   :skos/definition
   "business identifier code (BIC) for JPMorgan Chase Bank, National Association"})

(def JPMorganChaseBankNationalAssociationBusinessPartyPrefix
  "business party prefix for JPMorgan Chase Bank, National Association"
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationBusinessIdentifierCode,
   :db/ident
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationBusinessPartyPrefix,
   :fibo-fnd-rel-rel/hasTag "CHAS",
   :rdf/type [:fibo-fbc-fct-fse/BusinessPartyPrefix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label
   "JPMorgan Chase Bank, National Association business party prefix",
   :skos/definition
   "business party prefix for JPMorgan Chase Bank, National Association"})

(def JPMorganChaseBankNationalAssociationBusinessPartySuffix
  "business party suffix for JPMorgan Chase Bank, National Association"
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationBusinessIdentifierCode,
   :db/ident
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationBusinessPartySuffix,
   :fibo-fnd-rel-rel/hasTag "33",
   :rdf/type [:fibo-fbc-fct-fse/BusinessPartySuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label
   "JPMorgan Chase Bank, National Association business party suffix",
   :skos/definition
   "business party suffix for JPMorgan Chase Bank, National Association"})

(def JPMorganChaseBankNationalAssociationDateEstablished
  "date that JPMorgan Chase Bank, National Association was established"
  {:db/ident
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationDateEstablished,
   :fibo-fnd-dt-fd/hasDateValue "1824-01-01",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "JPMorgan Chase Bank, National Association date established",
   :skos/definition
   "date that JPMorgan Chase Bank, National Association was established"})

(def JPMorganChaseBankNationalAssociationDateInsured
  "date that JPMorgan Chase Bank, National Association was initially insured with respect to deposit insurance by the FDIC"
  {:db/ident
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationDateInsured,
   :fibo-fnd-dt-fd/hasDateValue "1934-01-01",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "JPMorgan Chase Bank, National Association date insured",
   :skos/definition
   "date that JPMorgan Chase Bank, National Association was initially insured with respect to deposit insurance by the FDIC"})

(def JPMorganChaseBankNationalAssociationFDICCertificateNumber
  "FDIC Certificate number for JPMorgan Chase Bank, National Association"
  {:cmns-id/identifies :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociation,
   :db/ident
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationFDICCertificateNumber,
   :fibo-fnd-rel-rel/hasTag "628",
   :rdf/type [:fibo-fbc-fct-usjrga/FDICCertificateNumber :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label
   "JPMorgan Chase Bank, National Association FDIC Certificate number",
   :skos/definition
   "FDIC Certificate number for JPMorgan Chase Bank, National Association"})

(def JPMorganChaseBankNationalAssociationLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for JPMorgan Chase Bank, National Association"
  {:cmns-col/comprises :gleif-L1-data/L-7H6GLXDRUGQFU57RNE97-LEI,
   :db/ident
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T19:51:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-08-25T00:52:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-01-08T04:30:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label
   "JPMorgan Chase Bank, National Association legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for JPMorgan Chase Bank, National Association"})

(def JPMorganChaseBankNationalAssociationRSSDIdentifier
  "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to JPMorgan Chase Bank, National Association"
  {:cmns-id/identifies :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociation,
   :db/ident
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationRSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "852218",
   :rdf/type
   [:fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "JPMorgan Chase Bank, National Association RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to JPMorgan Chase Bank, National Association"})

(def JPMorganChaseBankNationalAssociationRTN
  "routing transit number (RTN) for JPMorgan Chase Bank, National Association"
  {:cmns-id/identifies :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociation,
   :db/ident :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationRTN,
   :fibo-fnd-rel-rel/hasTag "021000021",
   :rdf/type [:fibo-fbc-fct-usjrga/RoutingTransitNumber :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "JPMorgan Chase Bank, National Association RTN",
   :skos/definition
   "routing transit number (RTN) for JPMorgan Chase Bank, National Association"})

(def JPMorganChaseBankNationalAssociationRegistrationDate
  "date that JPMorgan Chase Bank, National Association was first registered as a corporation in the State of Ohio"
  {:db/ident
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationRegistrationDate,
   :fibo-fnd-dt-fd/hasDateValue "2012-06-28",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "JPMorgan Chase Bank, National Association registration date",
   :skos/definition
   "date that JPMorgan Chase Bank, National Association was first registered as a corporation in the State of Ohio"})

(def PinnacleBank
  "state-chartered bank functional entity for Pinnacle Bank"
  {:db/ident :fibo-fbc-fct-usind/PinnacleBank,
   :fibo-fbc-fct-rga/isRegulatedBy
   :fibo-fbc-fct-usjrga/CaliforniaBankingRegulator,
   :fibo-fbc-fct-usjrga/hasPrimaryFederalRegulator
   :fibo-fbc-fct-usjrga/FederalDepositInsurerAndRegulator,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usind/PinnacleBank-US-CA,
   :rdf/type [:fibo-fbc-fct-usfse/StateCharteredBank :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Pinnacle Bank",
   :skos/definition "state-chartered bank functional entity for Pinnacle Bank"})

(def PinnacleBank-US-CA
  "stock corporation legal entity for Pinnacle Bank, a California Corporation"
  {:db/ident :fibo-fbc-fct-usind/PinnacleBank-US-CA,
   :fibo-be-le-cb/isIncorporatedIn
   :fibo-be-ge-usj/StateOfCaliforniaJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/PinnacleBankHeadquartersAddress,
   :fibo-be-le-lei/hasLegalAddress :fibo-fbc-fct-usind/PinnacleBankLegalAddress,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-vrt/hasWebsite "https://pinnacle.bank/",
   :fibo-fnd-rel-rel/hasLegalName "Pinnacle Bank",
   :rdf/type [:owl/NamedIndividual :fibo-be-le-cb/StockCorporation],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Pinnacle Bank US-CA",
   :skos/definition
   "stock corporation legal entity for Pinnacle Bank, a California Corporation"})

(def PinnacleBankBusinessEntityIdentifier
  "registration identifier assigned by the California Division of Corporations for Pinnacle Bank"
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/CaliforniaBusinessRegistrationIdentifierScheme,
   :cmns-id/identifies :fibo-fbc-fct-usind/PinnacleBank-US-CA,
   :db/ident :fibo-fbc-fct-usind/PinnacleBankBusinessEntityIdentifier,
   :fibo-fbc-fct-breg/hasEntityStatus :fibo-fbc-fct-breg/ActiveStatus,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/CaliforniaBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "C2859719",
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfCaliforniaJurisdiction,
   :rdf/type [:owl/NamedIndividual
              :fibo-fbc-fct-ra/RegistryIdentifier
              :fibo-be-corp-corp/RegistrationIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Pinnacle Bank business entity identifier",
   :skos/definition
   "registration identifier assigned by the California Division of Corporations for Pinnacle Bank"})

(def PinnacleBankCaliforniaCertificateOfAuthority
  "certificate issued by the California Department of Business Oversight, California's primary regulator of financial service providers and products, for Pinnacle Bank"
  {:cmns-cxtdsg/appliesTo :fibo-fbc-fct-usind/PinnacleBank,
   :db/ident :fibo-fbc-fct-usind/PinnacleBankCaliforniaCertificateOfAuthority,
   :fibo-fnd-rel-rel/isIssuedBy :fibo-fbc-fct-usjrga/CaliforniaBankingRegulator,
   :rdf/type [:fibo-fbc-fct-rga/GovernmentIssuedLicense :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Pinnacle Bank California Certificate of Authority",
   :skos/definition
   "certificate issued by the California Department of Business Oversight, California's primary regulator of financial service providers and products, for Pinnacle Bank"})

(def PinnacleBankCaliforniaCertificateOfAuthorityIdentifier
  "registration identifier assigned by the California Department of Business Oversight for the California Certificate of Authority (banking license) for Pinnacle Bank"
  {:cmns-id/identifies
   :fibo-fbc-fct-usind/PinnacleBankCaliforniaCertificateOfAuthority,
   :db/ident
   :fibo-fbc-fct-usind/PinnacleBankCaliforniaCertificateOfAuthorityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredBy
   :fibo-fbc-fct-usjrga/CaliforniaBankingRegulator,
   :fibo-fnd-rel-rel/hasTag "2261",
   :rdf/type [:fibo-fnd-law-lcap/LicenseIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Pinnacle Bank California Certificate of Authority identifier",
   :skos/definition
   "registration identifier assigned by the California Department of Business Oversight for the California Certificate of Authority (banking license) for Pinnacle Bank"})

(def PinnacleBankDateOfRegistration
  "date that Pinnacle Bank was first registered as a stock corporation in the State of California"
  {:db/ident :fibo-fbc-fct-usind/PinnacleBankDateOfRegistration,
   :fibo-fnd-dt-fd/hasDateValue "2006-03-20",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Pinnacle Bank date of registration",
   :skos/definition
   "date that Pinnacle Bank was first registered as a stock corporation in the State of California"})

(def PinnacleBankFDICCertificateNumber
  "FDIC Certificate number for Pinnacle Bank"
  {:cmns-id/identifies :fibo-fbc-fct-usind/PinnacleBank,
   :db/ident :fibo-fbc-fct-usind/PinnacleBankFDICCertificateNumber,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/FDICInstitutionDirectory,
   :fibo-fnd-rel-rel/hasTag "58297",
   :rdf/type [:fibo-fbc-fct-usjrga/FDICCertificateNumber :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Pinnacle Bank FDIC Certificate",
   :skos/definition "FDIC Certificate number for Pinnacle Bank"})

(def PinnacleBankHeadquartersAddress
  "registration address identified as the headquarters address for Pinnacle Bank"
  {:db/ident :fibo-fbc-fct-usind/PinnacleBankHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "7597 Monterey Street",
   :fibo-fnd-plc-adr/hasPostalCode "95020",
   :fibo-fnd-plc-loc/hasCityName "Gilroy",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/California,
   :rdf/type [:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Pinnacle Bank headquarters address",
   :skos/definition
   "registration address identified as the headquarters address for Pinnacle Bank"})

(def PinnacleBankLegalAddress
  "registration address identified as the legal address for Pinnacle Bank"
  {:db/ident :fibo-fbc-fct-usind/PinnacleBankLegalAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "18181 Butterfield Blvd. STE 135",
   :fibo-fnd-plc-adr/hasPostalCode "95037-8101",
   :fibo-fnd-plc-loc/hasCityName "Morgan Hill",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/California,
   :rdf/type [:fibo-fnd-plc-adr/ConventionalStreetAddress
              :fibo-fnd-plc-adr/PhysicalAddress
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Pinnacle Bank legal address",
   :skos/definition
   "registration address identified as the legal address for Pinnacle Bank"})

(def PinnacleBankRSSDIdentifier
  "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to Pinnacle Bank"
  {:cmns-id/identifies :fibo-fbc-fct-usind/PinnacleBank,
   :db/ident :fibo-fbc-fct-usind/PinnacleBankRSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "3455227",
   :rdf/type
   [:fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Pinnacle Bank RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to Pinnacle Bank"})

(def PinnacleBankRTN
  "routing transit number (RTN) for Pinnacle Bank"
  {:cmns-id/identifies :fibo-fbc-fct-usind/PinnacleBank,
   :db/ident :fibo-fbc-fct-usind/PinnacleBankRTN,
   :fibo-fnd-rel-rel/hasTag "121144340",
   :rdf/type [:fibo-fbc-fct-usjrga/RoutingTransitNumber :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Pinnacle Bank RTN",
   :skos/definition "routing transit number (RTN) for Pinnacle Bank"})

(def StateStreetBankAndTrustCompany
  "Federal Reserve state-chartered member bank functional entity for the State Street Bank and Trust, based in Boston, Massachusetts"
  {:db/ident :fibo-fbc-fct-usind/StateStreetBankAndTrustCompany,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyDateEstablished,
   :fibo-fbc-fct-fse/hasDateInsured
   :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyDateInsured,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usind/StateStreetBankAndTrustCompany-US-MA,
   :rdf/type [:fibo-fbc-fct-usjrga/FRSStateMemberBank :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "State Street Bank and Trust",
   :skos/definition
   "Federal Reserve state-chartered member bank functional entity for the State Street Bank and Trust, based in Boston, Massachusetts"})

(def StateStreetBankAndTrustCompany-US-MA
  "trust legal entity for the State Street Bank and Trust Company, a Massachusetts Trust Company headquartered in Boston"
  {:db/ident :fibo-fbc-fct-usind/StateStreetBankAndTrustCompany-US-MA,
   :fibo-be-corp-corp/hasDateOfRegistration
   :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyRegistrationDate,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/StateStreetCorporationHeadquartersAddress,
   :fibo-be-le-lp/isOrganizedIn
   :fibo-be-ge-usj/StateOfMassachusettsJurisdiction,
   :fibo-be-oac-cctl/hasDomesticUltimateParent
   :fibo-fbc-fct-usind/StateStreetCorporation,
   :fibo-fbc-fct-breg/hasPriorLegalName
   ["State Street Trust Company" "Second Bank - State Street Trust Company"],
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationTrustCompany,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-rel-rel/hasLegalName "State Street Bank And Trust Company",
   :rdf/type [:fibo-be-tr-tr/Trust :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "State Street Bank and Trust Company US-MA",
   :skos/definition
   "trust legal entity for the State Street Bank and Trust Company, a Massachusetts Trust Company headquartered in Boston"})

(def StateStreetBankAndTrustCompanyBusinessEntityIdentifier
  "registration identifier assigned by the Massachusetts Corporations Division for State Street Bank and Trust Company"
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/MassachusettsBusinessRegistrationIdentifierScheme,
   :cmns-id/identifies :fibo-fbc-fct-usind/StateStreetBankAndTrustCompany-US-MA,
   :db/ident
   :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyBusinessEntityIdentifier,
   :fibo-fbc-fct-breg/hasEntityStatus :fibo-fbc-fct-breg/ActiveStatus,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/MassachusettsCorporationRegistry,
   :fibo-fnd-rel-rel/hasTag "00011313",
   :fibo-fnd-rel-rel/isGovernedBy
   :fibo-be-ge-usj/StateOfMassachusettsJurisdiction,
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "State Street Bank and Trust Company business entity identifier",
   :skos/definition
   "registration identifier assigned by the Massachusetts Corporations Division for State Street Bank and Trust Company"})

(def StateStreetBankAndTrustCompanyBusinessIdentifierCode
  "business identifier code (BIC) for State Street Bank and Trust Company"
  {:cmns-col/comprises
   [:fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyBusinessPartyPrefix
    :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyBusinessPartySuffix
    :lcc-3166-1/US],
   :cmns-cxtdsg/appliesTo :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-id/identifies :fibo-fbc-fct-usind/StateStreetBankAndTrustCompany-US-MA,
   :db/ident
   :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyBusinessIdentifierCode,
   :fibo-fnd-rel-rel/hasTag "SBOSUS33XXX",
   :rdf/type [:fibo-fbc-fct-fse/BusinessIdentifierCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label
   "State Street Bank and Trust Company - business identifier code (BIC)",
   :skos/definition
   "business identifier code (BIC) for State Street Bank and Trust Company"})

(def StateStreetBankAndTrustCompanyBusinessPartyPrefix
  "business party prefix for State Street Bank and Trust Company"
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyBusinessIdentifierCode,
   :db/ident
   :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyBusinessPartyPrefix,
   :fibo-fnd-rel-rel/hasTag "SBOS",
   :rdf/type [:fibo-fbc-fct-fse/BusinessPartyPrefix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "State Street Bank and Trust Company business party prefix",
   :skos/definition
   "business party prefix for State Street Bank and Trust Company"})

(def StateStreetBankAndTrustCompanyBusinessPartySuffix
  "business party suffix for State Street Bank and Trust Company"
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyBusinessIdentifierCode,
   :db/ident
   :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyBusinessPartySuffix,
   :fibo-fnd-rel-rel/hasTag "33",
   :rdf/type [:fibo-fbc-fct-fse/BusinessPartySuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "State Street Bank and Trust Company business party suffix",
   :skos/definition
   "business party suffix for State Street Bank and Trust Company"})

(def StateStreetBankAndTrustCompanyDateEstablished
  "date that State Street Bank and Trust (originally Second Bank - State Street Trust Company) was established as a state member bank with the FRS"
  {:db/ident :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyDateEstablished,
   :fibo-fnd-dt-fd/hasDateValue "1892-12-31",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "State Street Bank and Trust Company date established",
   :skos/definition
   "date that State Street Bank and Trust (originally Second Bank - State Street Trust Company) was established as a state member bank with the FRS"})

(def StateStreetBankAndTrustCompanyDateInsured
  "date that State Street Bank and Trust Company was initially insured with respect to deposit insurance by the FDIC"
  {:db/ident :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyDateInsured,
   :fibo-fnd-dt-fd/hasDateValue "1934-01-01",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "State Street Bank and Trust Company date insured",
   :skos/definition
   "date that State Street Bank and Trust Company was initially insured with respect to deposit insurance by the FDIC"})

(def StateStreetBankAndTrustCompanyFDICCertificateNumber
  "FDIC Certificate number for State Street Bank and Trust Company"
  {:cmns-id/identifies :fibo-fbc-fct-usind/StateStreetBankAndTrustCompany,
   :db/ident
   :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyFDICCertificateNumber,
   :fibo-fnd-rel-rel/hasTag "14",
   :rdf/type [:fibo-fbc-fct-usjrga/FDICCertificateNumber :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "State Street Bank and Trust Company FDIC Certificate number",
   :skos/definition
   "FDIC Certificate number for State Street Bank and Trust Company"})

(def StateStreetBankAndTrustCompanyLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for State Street Bank and Trust Company"
  {:cmns-col/comprises :gleif-L1-data/L-571474TGEMMWANRLN572-LEI,
   :db/ident
   :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T19:51:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-10-22T19:33:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-08-26T22:01:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type [:owl/NamedIndividual
              :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label
   "State Street Bank and Trust Company legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for State Street Bank and Trust Company"})

(def StateStreetBankAndTrustCompanyRSSDIdentifier
  "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to State Street Bank and Trust Company"
  {:cmns-id/identifies :fibo-fbc-fct-usind/StateStreetBankAndTrustCompany,
   :db/ident :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyRSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "35301",
   :rdf/type
   [:fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "State Street Bank and Trust Company RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to State Street Bank and Trust Company"})

(def StateStreetBankAndTrustCompanyRTN
  "routing transit number (RTN) for State Street Bank and Trust Company"
  {:cmns-id/identifies :fibo-fbc-fct-usind/StateStreetBankAndTrustCompany,
   :db/ident :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyRTN,
   :fibo-fnd-rel-rel/hasTag "011000028",
   :rdf/type [:fibo-fbc-fct-usjrga/RoutingTransitNumber :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "State Street Bank and Trust Company RTN",
   :skos/definition
   "routing transit number (RTN) for State Street Bank and Trust Company"})

(def StateStreetBankAndTrustCompanyRegistrationDate
  "date that State Street Bank and Trust Company was first registered as a trust company in the State of Massachusetts"
  {:db/ident :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyRegistrationDate,
   :fibo-fnd-dt-fd/hasDateValue "1891-04-14",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "State Street Bank and Trust Company registration date",
   :skos/definition
   "date that State Street Bank and Trust Company was first registered as a trust company in the State of Massachusetts"})

(def StateStreetCorporation
  "financial holding company functional entity for the State Street Corporation"
  {:db/ident :fibo-fbc-fct-usind/StateStreetCorporation,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usind/StateStreetCorporation-US-MA,
   :rdf/type [:fibo-fbc-fct-usfse/FinancialHoldingCompany :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "State Street Corporation",
   :skos/definition
   "financial holding company functional entity for the State Street Corporation"})

(def StateStreetCorporation-US-MA
  "publicly held company and for profit corporation legal entity for State Street Corporation"
  {:db/ident :fibo-fbc-fct-usind/StateStreetCorporation-US-MA,
   :fibo-be-corp-corp/hasDateOfRegistration
   :fibo-fbc-fct-usind/StateStreetCorporationIncorporationDate,
   :fibo-be-le-cb/isIncorporatedIn
   :fibo-be-ge-usj/StateOfMassachusettsJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/StateStreetCorporationHeadquartersAddress,
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationTrustCompany,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-vrt/hasWebsite "http://www.statestreet.com/home.html",
   :fibo-fnd-rel-rel/hasLegalName "State Street Corporation",
   :rdf/type [:fibo-be-corp-corp/PubliclyHeldCompany
              :owl/NamedIndividual
              :fibo-be-le-cb/ForProfitCorporation],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "State Street Corporation US-MA",
   :skos/definition
   "publicly held company and for profit corporation legal entity for State Street Corporation"})

(def StateStreetCorporationBusinessEntityIdentifier
  "registration identifier assigned by the Massachusetts Corporations Division for State Street Corporation"
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/MassachusettsBusinessRegistrationIdentifierScheme,
   :cmns-id/identifies :fibo-fbc-fct-usind/StateStreetCorporation-US-MA,
   :db/ident :fibo-fbc-fct-usind/StateStreetCorporationBusinessEntityIdentifier,
   :fibo-fbc-fct-breg/hasEntityStatus :fibo-fbc-fct-breg/ActiveStatus,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/MassachusettsCorporationRegistry,
   :fibo-fnd-rel-rel/hasTag "042456637",
   :fibo-fnd-rel-rel/isGovernedBy
   :fibo-be-ge-usj/StateOfMassachusettsJurisdiction,
   :rdf/type [:owl/NamedIndividual :fibo-be-corp-corp/RegistrationIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "State Street Corporation business entity identifier",
   :skos/definition
   "registration identifier assigned by the Massachusetts Corporations Division for State Street Corporation"})

(def StateStreetCorporationHeadquartersAddress
  "registration address identified as the headquarters address for State Street Corporation"
  {:db/ident :fibo-fbc-fct-usind/StateStreetCorporationHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "One Lincoln Street",
   :fibo-fnd-plc-adr/hasPostalCode "02111",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Boston,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/Massachusetts,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/PhysicalAddress],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "State Street Corporation headquarters address",
   :skos/definition
   "registration address identified as the headquarters address for State Street Corporation"})

(def StateStreetCorporationIncorporationDate
  "date that State Street Corporation was first registered as a corporation in the State of Delaware"
  {:db/ident :fibo-fbc-fct-usind/StateStreetCorporationIncorporationDate,
   :fibo-fnd-dt-fd/hasDateValue "1969-10-16",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "State Street Corporation incorporation date",
   :skos/definition
   "date that State Street Corporation was first registered as a corporation in the State of Delaware"})

(def StateStreetCorporationLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for State Street Corporation"
  {:cmns-col/comprises :gleif-L1-data/L-549300ZFEEJ2IP5VME73-LEI,
   :db/ident
   :fibo-fbc-fct-usind/StateStreetCorporationLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-12-12T02:45:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-09-06T19:31:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-08-26T22:01:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label
   "State Street Corporation legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for State Street Corporation"})

(def StateStreetCorporationRSSDIdentifier
  "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to State Street Corporation"
  {:cmns-id/identifies :fibo-fbc-fct-usind/StateStreetCorporation,
   :db/ident :fibo-fbc-fct-usind/StateStreetCorporationRSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "1111435",
   :rdf/type
   [:fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "State Street Corporation RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to State Street Corporation"})

(def TheCoca-ColaCompanyBusinessIdentifierCode
  "business identifier code (BIC) for The Coca-Cola Company"
  {:cmns-col/comprises
   [:fibo-fbc-fct-usind/TheCoca-ColaCompanyBusinessPartyPrefix
    :lcc-3166-1/US
    :fibo-fbc-fct-usind/TheCoca-ColaCompanyBusinessPartySuffix],
   :cmns-cxtdsg/appliesTo :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-id/identifies :fibo-be-le-usee/TheCoca-ColaCompany-US-DE,
   :db/ident :fibo-fbc-fct-usind/TheCoca-ColaCompanyBusinessIdentifierCode,
   :fibo-fnd-rel-rel/hasTag "TCCCUS33XXX",
   :rdf/type [:owl/NamedIndividual :fibo-fbc-fct-fse/BusinessIdentifierCode],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "The Coca-Cola Company business identifier code (BIC)",
   :skos/definition "business identifier code (BIC) for The Coca-Cola Company"})

(def TheCoca-ColaCompanyBusinessPartyPrefix
  "business party prefix for The Coca-Cola Company"
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/TheCoca-ColaCompanyBusinessIdentifierCode,
   :db/ident :fibo-fbc-fct-usind/TheCoca-ColaCompanyBusinessPartyPrefix,
   :fibo-fnd-rel-rel/hasTag "TCCC",
   :rdf/type [:fibo-fbc-fct-fse/BusinessPartyPrefix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "The Coca-Cola Company business party prefix",
   :skos/definition "business party prefix for The Coca-Cola Company"})

(def TheCoca-ColaCompanyBusinessPartySuffix
  "business party suffix for The Coca-Cola Company"
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/TheCoca-ColaCompanyBusinessIdentifierCode,
   :db/ident :fibo-fbc-fct-usind/TheCoca-ColaCompanyBusinessPartySuffix,
   :fibo-fnd-rel-rel/hasTag "33",
   :rdf/type [:fibo-fbc-fct-fse/BusinessPartySuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "The Coca-Cola Company business party suffix",
   :skos/definition "business party suffix for The Coca-Cola Company"})

(def TheCoca-ColaCompanyCorporateAddress
  "registration address for The Coca-Cola Company"
  {:db/ident :fibo-fbc-fct-usind/TheCoca-ColaCompanyCorporateAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "One Coca-Cola Plaza",
   :fibo-fnd-plc-adr/hasPostalCode "30313",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Atlanta,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/Georgia,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/PhysicalAddress],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "The Coca-Cola Company corporate address",
   :skos/definition "registration address for The Coca-Cola Company"})

(def TheCoca-ColaCompanyLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for The Coca-Cola Company"
  {:cmns-col/comprises :gleif-L1-data/L-UWJKFUJFZ02DKWI3RY53-LEI,
   :db/ident
   :fibo-fbc-fct-usind/TheCoca-ColaCompanyLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-10-19T22:57:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-04-26T18:19:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-04-27T17:14:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type [:owl/NamedIndividual
              :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "The Coca-Cola Company legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for The Coca-Cola Company"})

(def TheHomeDepotIncCorporateAddress
  "registration address for The Home Depot, Inc."
  {:db/ident :fibo-fbc-fct-usind/TheHomeDepotIncCorporateAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "2455 Paces Ferry Road",
   :fibo-fnd-plc-adr/hasPostalCode "30339",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Atlanta,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/Georgia,
   :rdf/type [:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "The Home Depot, Inc. corporate address",
   :skos/definition "registration address for The Home Depot, Inc."})

(def TheHomeDepotIncLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for The Home Depot, Inc."
  {:cmns-col/comprises :gleif-L1-data/L-QEKMOTMBBKA8I816DO57-LEI,
   :db/ident
   :fibo-fbc-fct-usind/TheHomeDepotIncLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T19:51:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-09-29T01:32:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-09-02T20:53:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type [:owl/NamedIndividual
              :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "The Home Depot, Inc. legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for The Home Depot, Inc."})

(def TheProctorAndGambleCompanyBusinessIdentifierCode
  "business identifier code (BIC) for The Proctor & Gamble Company"
  {:cmns-col/comprises
   [:lcc-3166-1/US
    :fibo-fbc-fct-usind/TheProctorAndGambleCompanyBusinessPartyPrefix
    :fibo-fbc-fct-usind/TheProctorAndGambleCompanyBusinessPartySuffix],
   :cmns-cxtdsg/appliesTo :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-id/identifies :fibo-be-le-usee/TheProctorAndGambleCompany-US-OH,
   :db/ident
   :fibo-fbc-fct-usind/TheProctorAndGambleCompanyBusinessIdentifierCode,
   :fibo-fnd-rel-rel/hasTag "PGGTUS33XXX",
   :rdf/type [:owl/NamedIndividual :fibo-fbc-fct-fse/BusinessIdentifierCode],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "The Proctor & Gamble Company business identifier code (BIC)",
   :skos/definition
   "business identifier code (BIC) for The Proctor & Gamble Company"})

(def TheProctorAndGambleCompanyBusinessPartyPrefix
  "business party prefix for The Proctor & Gamble Company"
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/TheProctorAndGambleCompanyBusinessIdentifierCode,
   :db/ident :fibo-fbc-fct-usind/TheProctorAndGambleCompanyBusinessPartyPrefix,
   :fibo-fnd-rel-rel/hasTag "PGGT",
   :rdf/type [:fibo-fbc-fct-fse/BusinessPartyPrefix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "The Proctor & Gamble Company business party prefix",
   :skos/definition "business party prefix for The Proctor & Gamble Company"})

(def TheProctorAndGambleCompanyBusinessPartySuffix
  "business party suffix for The Proctor & Gamble Company"
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/TheProctorAndGambleCompanyBusinessIdentifierCode,
   :db/ident :fibo-fbc-fct-usind/TheProctorAndGambleCompanyBusinessPartySuffix,
   :fibo-fnd-rel-rel/hasTag "33",
   :rdf/type [:fibo-fbc-fct-fse/BusinessPartySuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "The Proctor & Gamble Company business party suffix",
   :skos/definition "business party suffix for The Proctor & Gamble Company"})

(def TheProctorAndGambleCompanyCorporateAddress
  "registration address for The Proctor & Gamble Company"
  {:db/ident :fibo-fbc-fct-usind/TheProctorAndGambleCompanyCorporateAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "1 Procter & Gamble Plaza",
   :fibo-fnd-plc-adr/hasPostalCode "45202",
   :fibo-fnd-plc-loc/hasCityName "Cincinnati",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/Ohio,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/PhysicalAddress],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "The Proctor & Gamble Company corporate address",
   :skos/definition "registration address for The Proctor & Gamble Company"})

(def TheProctorAndGambleCompanyDateEstablished
  "date that The Proctor & Gamble was founded"
  {:db/ident :fibo-fbc-fct-usind/TheProctorAndGambleCompanyDateEstablished,
   :fibo-fnd-dt-fd/hasDateValue "1837-01-01",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "The Proctor & Gamble Company date established",
   :skos/definition "date that The Proctor & Gamble was founded"})

(def TheProctorAndGambleCompanyLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for The Proctor & Gamble Company"
  {:cmns-col/comprises :gleif-L1-data/L-2572IBTT8CCZW6AU4141-LEI,
   :db/ident
   :fibo-fbc-fct-usind/TheProctorAndGambleCompanyLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-11-29T01:59:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-08-12T19:32:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-08-02T11:54:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label
   "The Proctor & Gamble Company legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for The Proctor & Gamble Company"})

(def WFCHoldingsLLC
  "financial holding company functional entity for WFC Holdings, LLC"
  {:db/ident :fibo-fbc-fct-usind/WFCHoldingsLLC,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usind/WFCHoldingsLLC-US-DE,
   :rdf/type [:fibo-fbc-fct-usfse/FinancialHoldingCompany :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "WFC Holdings, LLC",
   :skos/definition
   "financial holding company functional entity for WFC Holdings, LLC"})

(def WFCHoldingsLLC-US-DE
  "private company with limited liability legal entity for WFC Holdings, LLC legal entity, a Delaware Limited Liability Corporation"
  {:db/ident :fibo-fbc-fct-usind/WFCHoldingsLLC-US-DE,
   :fibo-be-corp-corp/hasDateOfIncorporation
   :fibo-fbc-fct-usind/WFCHoldingsLLCIncorporationDate,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/WFCHoldingsLLCHeadquartersAddress,
   :fibo-be-le-lp/isOrganizedIn :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-be-oac-cctl/hasDomesticUltimateParent
   :fibo-fbc-fct-usind/WellsFargoAndCompany,
   :fibo-be-oac-cctl/hasSubsidiary
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociation,
   :fibo-fbc-fct-breg/hasPriorLegalName "WFC Holdings Corporation",
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationServiceCompany,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-rel-rel/hasLegalName "WFC Holdings, LLC",
   :rdf/type [:owl/NamedIndividual
              :fibo-be-plc-plc/PrivateCompanyWithLimitedLiability],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "WFC Holdings, LLC US-DE",
   :skos/definition
   "private company with limited liability legal entity for WFC Holdings, LLC legal entity, a Delaware Limited Liability Corporation"})

(def WFCHoldingsLLCBusinessEntityIdentifier
  "registration identifier assigned by the Delaware Department of Corporations for WFC Holdings, LLC"
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/DelawareBusinessRegistrationIdentifierScheme,
   :cmns-id/identifies :fibo-fbc-fct-usind/WFCHoldingsLLC-US-DE,
   :db/ident :fibo-fbc-fct-usind/WFCHoldingsLLCBusinessEntityIdentifier,
   :fibo-fbc-fct-breg/hasEntityStatus :fibo-fbc-fct-breg/ActiveStatus,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "2939552",
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :rdf/type [:owl/NamedIndividual :fibo-be-corp-corp/RegistrationIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "WFC Holdings, LLC business entity identifier",
   :skos/definition
   "registration identifier assigned by the Delaware Department of Corporations for WFC Holdings, LLC"})

(def WFCHoldingsLLCHeadquartersAddress
  "registration address identified as the headquarters address for WFC Holdings, LLC"
  {:db/ident :fibo-fbc-fct-usind/WFCHoldingsLLCHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "45 Fremont Street",
   :fibo-fnd-plc-adr/hasPostalCode "94105",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/San_Francisco,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/California,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/PhysicalAddress],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "WFC Holdings, LLC headquarters address",
   :skos/definition
   "registration address identified as the headquarters address for WFC Holdings, LLC"})

(def WFCHoldingsLLCIncorporationDate
  "date that WFC Holdings, LLC was first registered as a corporation in the State of Delaware"
  {:db/ident :fibo-fbc-fct-usind/WFCHoldingsLLCIncorporationDate,
   :fibo-fnd-dt-fd/hasDateValue "1998-09-09",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "WFC Holdings, LLC incorporation date",
   :skos/definition
   "date that WFC Holdings, LLC was first registered as a corporation in the State of Delaware"})

(def WFCHoldingsLLCLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for WFC Holdings, LLC"
  {:cmns-col/comprises :gleif-L1-data/L-OT19FZZ6Z7A27CCLDY33-LEI,
   :db/ident
   :fibo-fbc-fct-usind/WFCHoldingsLLCLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T19:51:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-10-06T23:01:53.589-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-10-24T04:30:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelPartiallyCorroborated,
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "WFC Holdings, LLC legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for WFC Holdings, LLC"})

(def WFCHoldingsLLCOwnership
  "entity ownership context for WFC Holdings, LLC, a wholly-owned subsidiary of Wells Fargo & Company"
  {:db/ident :fibo-fbc-fct-usind/WFCHoldingsLLCOwnership,
   :fibo-be-le-lei/hasOwnershipPercentage 100,
   :fibo-be-oac-opty/hasOwnedEntity :fibo-fbc-fct-usind/WFCHoldingsLLC-US-DE,
   :fibo-be-oac-opty/hasOwningEntity
   :fibo-fbc-fct-usind/WellsFargoAndCompany-US-DE,
   :fibo-fnd-agr-ctr/isQualifiedBy
   :fibo-be-le-lei/GenerallyAcceptedAccountingPrinciples,
   :rdf/type [:fibo-be-oac-opty/DirectConsolidation :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "WFC Holdings, LLC ownership",
   :skos/definition
   "entity ownership context for WFC Holdings, LLC, a wholly-owned subsidiary of Wells Fargo & Company"})

(def WellsFargoAndCompany
  "financial holding company functional entity for Wells Fargo & Company"
  {:db/ident :fibo-fbc-fct-usind/WellsFargoAndCompany,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usind/WellsFargoAndCompany-US-DE,
   :rdf/type [:fibo-fbc-fct-usfse/FinancialHoldingCompany :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Wells Fargo & Company",
   :skos/definition
   "financial holding company functional entity for Wells Fargo & Company"})

(def WellsFargoAndCompany-US-DE
  "publicly held company and for profit corporation legal entity for Wells Fargo & Company, a Delaware Corporation"
  {:db/ident :fibo-fbc-fct-usind/WellsFargoAndCompany-US-DE,
   :fibo-be-corp-corp/hasDateOfIncorporation
   :fibo-fbc-fct-usind/WellsFargoAndCompanyIncorporationDate,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/WellsFargoAndCompanyHeadquartersAddress,
   :fibo-be-oac-cctl/hasSubsidiary :fibo-fbc-fct-usind/WFCHoldingsLLC,
   :fibo-fbc-fct-breg/hasPriorLegalName ["Northwest Bancorporation"
                                         "Norwest Corporation"],
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationTrustCompany,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-rel-rel/hasLegalName "Wells Fargo & Company",
   :rdf/type [:fibo-be-corp-corp/PubliclyHeldCompany
              :owl/NamedIndividual
              :fibo-be-le-cb/ForProfitCorporation],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Wells Fargo & Company US-DE",
   :skos/definition
   "publicly held company and for profit corporation legal entity for Wells Fargo & Company, a Delaware Corporation"})

(def WellsFargoAndCompanyBusinessEntityIdentifier
  "registration identifier assigned by the Delaware Department of Corporations for Wells Fargo & Company"
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/DelawareBusinessRegistrationIdentifierScheme,
   :cmns-id/identifies :fibo-fbc-fct-usind/WellsFargoAndCompany-US-DE,
   :db/ident :fibo-fbc-fct-usind/WellsFargoAndCompanyBusinessEntityIdentifier,
   :fibo-fbc-fct-breg/hasEntityStatus :fibo-fbc-fct-breg/ActiveStatus,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "637901",
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Wells Fargo & Company business entity identifier",
   :skos/definition
   "registration identifier assigned by the Delaware Department of Corporations for Wells Fargo & Company"})

(def WellsFargoAndCompanyHeadquartersAddress
  "registration address identified as the headquarters address for Wells Fargo & Company"
  {:db/ident :fibo-fbc-fct-usind/WellsFargoAndCompanyHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "420 Montgomery Street",
   :fibo-fnd-plc-adr/hasPostalCode "94104",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/San_Francisco,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/California,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/PhysicalAddress],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Wells Fargo & Company headquarters address",
   :skos/definition
   "registration address identified as the headquarters address for Wells Fargo & Company"})

(def WellsFargoAndCompanyIncorporationDate
  "date that Wells Fargo & Company was first registered as a corporation in the State of Delaware"
  {:cmns-av/explanatoryNote
   "Note that one of its predecessor companies was registered was first registered in Delaware in 1929, and the bank itself was founded in 1870.",
   :db/ident :fibo-fbc-fct-usind/WellsFargoAndCompanyIncorporationDate,
   :fibo-fnd-dt-fd/hasDateValue "1966-03-02",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Wells Fargo & Company incorporation date",
   :skos/definition
   "date that Wells Fargo & Company was first registered as a corporation in the State of Delaware"})

(def WellsFargoAndCompanyLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for Wells Fargo & Company"
  {:cmns-col/comprises :gleif-L1-data/L-PBLD0EJDB5FWOLXP3B76-LEI,
   :db/ident
   :fibo-fbc-fct-usind/WellsFargoAndCompanyLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T19:52:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-10-06T23:01:52.884-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-10-11T04:31:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelPartiallyCorroborated,
   :rdf/type [:owl/NamedIndividual
              :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Wells Fargo & Company legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for Wells Fargo & Company"})

(def WellsFargoAndCompanyRSSDIdentifier
  "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to Wells Fargo & Company"
  {:cmns-id/identifies :fibo-fbc-fct-usind/WellsFargoAndCompany,
   :db/ident :fibo-fbc-fct-usind/WellsFargoAndCompanyRSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "1120754",
   :rdf/type
   [:fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Wells Fargo & Company RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to Wells Fargo & Company"})

(def WellsFargoBankNationalAssociation
  "national bank functional entity for Wells Fargo Bank, National Association"
  {:db/ident :fibo-fbc-fct-usind/WellsFargoBankNationalAssociation,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationDateEstablished,
   :fibo-fbc-fct-fse/hasDateInsured
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationDateInsured,
   :fibo-fbc-fct-usjrga/hasSecondaryFederalRegulator
   :fibo-fbc-fct-usjrga/ConsumerFinanceRegulator,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociation-US,
   :rdf/type [:fibo-fbc-fct-usfse/NationalBank :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Wells Fargo Bank, National Association",
   :skos/definition
   "national bank functional entity for Wells Fargo Bank, National Association"})

(def WellsFargoBankNationalAssociation-US
  "business entity for the Wells Fargo Bank, National Association, a national banking entity established under the National Banking Act of 1864"
  {:db/ident :fibo-fbc-fct-usind/WellsFargoBankNationalAssociation-US,
   :fibo-be-corp-corp/hasDateOfRegistration
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationDateEstablished,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationHeadquartersAddress,
   :fibo-be-le-lei/hasLegalAddress
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationLegalAddress,
   :fibo-be-le-lp/isOrganizedIn :fibo-be-ge-usj/UnitedStatesJurisdiction,
   :fibo-be-oac-cctl/hasDomesticUltimateParent
   :fibo-fbc-fct-usind/WellsFargoAndCompany,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-rel-rel/hasLegalName "Wells Fargo Bank, National Association",
   :rdf/type [:owl/NamedIndividual :fibo-be-le-lp/BusinessEntity],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Wells Fargo Bank, National Association, US",
   :skos/definition
   "business entity for the Wells Fargo Bank, National Association, a national banking entity established under the National Banking Act of 1864"})

(def WellsFargoBankNationalAssociationBusinessIdentifierCode
  "business identifier code (BIC) for Wells Fargo Bank, National Association"
  {:cmns-col/comprises
   [:lcc-3166-1/US
    :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationBusinessPartySuffix
    :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationBusinessPartyPrefix],
   :cmns-cxtdsg/appliesTo :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-id/identifies :fibo-fbc-fct-usind/WellsFargoBankNationalAssociation-US,
   :db/ident
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationBusinessIdentifierCode,
   :fibo-fnd-rel-rel/hasTag "WFBIUS6SXXX",
   :rdf/type [:owl/NamedIndividual :fibo-fbc-fct-fse/BusinessIdentifierCode],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label
   "Wells Fargo Bank, National Association - business identifier code (BIC)",
   :skos/definition
   "business identifier code (BIC) for Wells Fargo Bank, National Association"})

(def WellsFargoBankNationalAssociationBusinessPartyPrefix
  "business party prefix for Wells Fargo Bank, National Association"
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationBusinessIdentifierCode,
   :db/ident
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationBusinessPartyPrefix,
   :fibo-fnd-rel-rel/hasTag "WFBI",
   :rdf/type [:fibo-fbc-fct-fse/BusinessPartyPrefix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Wells Fargo Bank, National Association business party prefix",
   :skos/definition
   "business party prefix for Wells Fargo Bank, National Association"})

(def WellsFargoBankNationalAssociationBusinessPartySuffix
  "business party suffix for Wells Fargo Bank, National Association"
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationBusinessIdentifierCode,
   :db/ident
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationBusinessPartySuffix,
   :fibo-fnd-rel-rel/hasTag "6S",
   :rdf/type [:fibo-fbc-fct-fse/BusinessPartySuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Wells Fargo Bank, National Association business party suffix",
   :skos/definition
   "business party suffix for Wells Fargo Bank, National Association"})

(def WellsFargoBankNationalAssociationDateEstablished
  "date that Wells Fargo Bank, National Association was established under the National Banking Act of 1863"
  {:db/ident
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationDateEstablished,
   :fibo-fnd-dt-fd/hasDateValue "1870-01-01",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Wells Fargo Bank, National Association date established",
   :skos/definition
   "date that Wells Fargo Bank, National Association was established under the National Banking Act of 1863"})

(def WellsFargoBankNationalAssociationDateInsured
  "date that Wells Fargo Bank, National Association was initially insured with respect to deposit insurance by the FDIC"
  {:db/ident :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationDateInsured,
   :fibo-fnd-dt-fd/hasDateValue "1934-01-01",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Wells Fargo Bank, National Association date insured",
   :skos/definition
   "date that Wells Fargo Bank, National Association was initially insured with respect to deposit insurance by the FDIC"})

(def WellsFargoBankNationalAssociationFDICCertificateNumber
  "FDIC Certificate number for Wells Fargo Bank, National Association"
  {:cmns-id/identifies :fibo-fbc-fct-usind/WellsFargoBankNationalAssociation,
   :db/ident
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationFDICCertificateNumber,
   :fibo-fnd-rel-rel/hasTag "3511",
   :rdf/type [:fibo-fbc-fct-usjrga/FDICCertificateNumber :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Wells Fargo Bank, National Association FDIC Certificate number",
   :skos/definition
   "FDIC Certificate number for Wells Fargo Bank, National Association"})

(def WellsFargoBankNationalAssociationHeadquartersAddress
  "registration address identified as the headquarters address for Wells Fargo Bank, National Association"
  {:db/ident
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "301 South College Street",
   :fibo-fnd-plc-adr/hasPostalCode "28202",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Charlotte,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/NorthCarolina,
   :rdf/type [:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Wells Fargo Bank, National Association headquarters address",
   :skos/definition
   "registration address identified as the headquarters address for Wells Fargo Bank, National Association"})

(def WellsFargoBankNationalAssociationLegalAddress
  "registration address identified as the legal address for Wells Fargo Bank, National Association"
  {:db/ident :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationLegalAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "101 North Phillips Avenue",
   :fibo-fnd-plc-adr/hasPostalCode "57104",
   :fibo-fnd-plc-loc/hasCityName "Sioux Falls",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/SouthDakota,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/PhysicalAddress],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Wells Fargo Bank, National Association legal address",
   :skos/definition
   "registration address identified as the legal address for Wells Fargo Bank, National Association"})

(def WellsFargoBankNationalAssociationLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for Wells Fargo Bank, National Association"
  {:cmns-col/comprises :gleif-L1-data/L-KB1H1DSPRFMYMCUFXT09-LEI,
   :db/ident
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T19:53:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-08-18T18:04:54.256-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-08-28T00:07:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type [:owl/NamedIndividual
              :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label
   "Wells Fargo Bank, National Association legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for Wells Fargo Bank, National Association"})

(def WellsFargoBankNationalAssociationOwnership
  "entity ownership context for Wells Fargo Bank, National Association, a subsidiary of WFC Holdings, LLC"
  {:db/ident :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationOwnership,
   :fibo-be-le-lei/hasOwnershipPercentage 97.9M,
   :fibo-be-oac-opty/hasOwnedEntity
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociation-US,
   :fibo-be-oac-opty/hasOwningEntity :fibo-fbc-fct-usind/WFCHoldingsLLC-US-DE,
   :fibo-fnd-agr-ctr/isQualifiedBy
   :fibo-be-le-lei/GenerallyAcceptedAccountingPrinciples,
   :rdf/type [:fibo-be-oac-opty/DirectConsolidation :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Wells Fargo Bank, National Association ownership",
   :skos/definition
   "entity ownership context for Wells Fargo Bank, National Association, a subsidiary of WFC Holdings, LLC"})

(def WellsFargoBankNationalAssociationRSSDIdentifier
  "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to Wells Fargo Bank, National Association"
  {:cmns-id/identifies :fibo-fbc-fct-usind/WellsFargoBankNationalAssociation,
   :db/ident
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationRSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "451965",
   :rdf/type
   [:fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier
    :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Wells Fargo Bank, National Association RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to Wells Fargo Bank, National Association"})

(def WellsFargoBankNationalAssociationRTN
  "routing transit number (RTN) for Wells Fargo Bank, National Association"
  {:cmns-id/identifies :fibo-fbc-fct-usind/WellsFargoBankNationalAssociation,
   :db/ident :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationRTN,
   :fibo-fnd-rel-rel/hasTag "121000248",
   :rdf/type [:fibo-fbc-fct-usjrga/RoutingTransitNumber :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "Wells Fargo Bank, National Association RTN",
   :skos/definition
   "routing transit number (RTN) for Wells Fargo Bank, National Association"})

(def ^{:private true} AlphabetInc-US-CA
  {:db/ident :fibo-be-le-usee/AlphabetInc-US-CA,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/AlphabetIncCorporateAddress,
   :fibo-fbc-fct-breg/hasTradingOrOperationalName "Alphabet",
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationServiceCompany,
   :fibo-fnd-plc-vrt/hasWebsite "https://abc.xyz/",
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} AlphabetIncBusinessEntityIdentifier
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/DelawareBusinessRegistrationIdentifierScheme,
   :db/ident :fibo-be-le-usee/AlphabetIncBusinessEntityIdentifier,
   :fibo-fbc-fct-breg/hasEntityStatus :fibo-fbc-fct-breg/ActiveStatus,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate "2015-07-23",
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} AppleInc-US-CA
  {:db/ident :fibo-be-le-usee/AppleInc-US-CA,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/AppleIncCorporateAddress,
   :fibo-be-le-lei/hasLegalAddress :fibo-fbc-fct-usind/AppleIncCorporateAddress,
   :fibo-fbc-fct-breg/hasPriorLegalName "Apple Computer, Inc.",
   :fibo-fbc-fct-breg/hasTradingOrOperationalName "Apple",
   :fibo-fnd-plc-vrt/hasWebsite "https://www.apple.com/",
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} AppleIncBusinessEntityIdentifier
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/CaliforniaBusinessRegistrationIdentifierScheme,
   :db/ident :fibo-be-le-usee/AppleIncBusinessEntityIdentifier,
   :fibo-fbc-fct-breg/hasEntityStatus :fibo-fbc-fct-breg/ActiveStatus,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate "1977-01-03",
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/CaliforniaBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfCaliforniaJurisdiction,
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} InternationalBusinessMachinesCorporation-US-NY
  {:db/ident :fibo-be-le-usee/InternationalBusinessMachinesCorporation-US-NY,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/InternationalBusinessMachinesCorporationAddress,
   :fibo-be-le-lei/hasLegalAddress
   :fibo-fbc-fct-usind/InternationalBusinessMachinesCorporationAddress,
   :fibo-fbc-fct-breg/hasPriorLegalName "COMPUTING-TABULATING-RECORDING-CO.",
   :fibo-fbc-fct-breg/hasTradingOrOperationalName "IBM",
   :fibo-fnd-plc-vrt/hasWebsite "https://www.ibm.com/",
   :rdf/type :owl/NamedIndividual})

(def ^{:private true}
     InternationalBusinessMachinesCorporationBusinessEntityIdentifier
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/NewYorkBusinessRegistrationIdentifierScheme,
   :db/ident
   :fibo-be-le-usee/InternationalBusinessMachinesCorporationBusinessEntityIdentifier,
   :fibo-fbc-fct-breg/hasEntityStatus :fibo-fbc-fct-breg/ActiveStatus,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate "1924-02-14",
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NewYorkBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfNewYorkJurisdiction,
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} TheCoca-ColaCompany-US-DE
  {:db/ident :fibo-be-le-usee/TheCoca-ColaCompany-US-DE,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/TheCoca-ColaCompanyCorporateAddress,
   :fibo-be-le-lei/hasLegalAddress
   :fibo-fbc-fct-usind/TheCoca-ColaCompanyCorporateAddress,
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationTrustCompany,
   :fibo-fnd-plc-vrt/hasWebsite "https://www.coca-colacompany.com/",
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} TheCoca-ColaCompanyBusinessEntityIdentifier
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/DelawareBusinessRegistrationIdentifierScheme,
   :db/ident :fibo-be-le-usee/TheCoca-ColaCompanyBusinessEntityIdentifier,
   :fibo-fbc-fct-breg/hasEntityStatus :fibo-fbc-fct-breg/ActiveStatus,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate "1919-09-05",
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} TheHomeDepotBusinessEntityIdentifier
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/DelawareBusinessRegistrationIdentifierScheme,
   :db/ident :fibo-be-le-usee/TheHomeDepotBusinessEntityIdentifier,
   :fibo-fbc-fct-breg/hasEntityStatus :fibo-fbc-fct-breg/ActiveStatus,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate "1978-06-29",
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} TheHomeDepotInc-US-DE
  {:db/ident :fibo-be-le-usee/TheHomeDepotInc-US-DE,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/TheHomeDepotIncCorporateAddress,
   :fibo-be-le-lei/hasLegalAddress
   :fibo-fbc-fct-usind/TheHomeDepotIncCorporateAddress,
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationServiceCompany,
   :fibo-fnd-plc-vrt/hasWebsite "https://www.homedepot.com/",
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} TheProctorAndGambleCompany-US-OH
  {:db/ident :fibo-be-le-usee/TheProctorAndGambleCompany-US-OH,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/TheProctorAndGambleCompanyCorporateAddress,
   :fibo-fnd-plc-vrt/hasWebsite "https://us.pg.com/",
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} TheProctorAndGambleCompanyBusinessEntityIdentifier
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/OhioBusinessRegistrationIdentifierScheme,
   :db/ident
   :fibo-be-le-usee/TheProctorAndGambleCompanyBusinessEntityIdentifier,
   :fibo-fbc-fct-breg/hasEntityStatus :fibo-fbc-fct-breg/ActiveStatus,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate "1905-05-05",
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/OhioBusinessFilingPortal,
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfOhioJurisdiction,
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} L-4EP6JBYBTPTQ47LZOB67-LEI
  "legal entity identifier for BNY Mellon, National Association"
  {:cmns-id/identifies :fibo-fbc-fct-usind/BNYMellonNationalAssociation-US-DE,
   :db/ident :gleif-L1-data/L-4EP6JBYBTPTQ47LZOB67-LEI,
   :fibo-fnd-rel-rel/hasTag "4EP6JBYBTPTQ47LZOB67",
   :rdf/type [:fibo-be-le-lei/LegalEntityIdentifier :owl/NamedIndividual],
   :rdfs/label "BNY Mellon, National Association legal entity identifier",
   :skos/definition
   "legal entity identifier for BNY Mellon, National Association"})

(def ^{:private true} L-549300PSHWOM1D1JVL23-LEI
  "legal entity identifier for Citicorp LLC"
  {:cmns-id/identifies :fibo-fbc-fct-usind/CiticorpLLC-US-DE,
   :db/ident           :gleif-L1-data/L-549300PSHWOM1D1JVL23-LEI,
   :fibo-fnd-rel-rel/hasTag "549300PSHWOM1D1JVL23",
   :rdf/type           [:fibo-be-le-lei/LegalEntityIdentifier
                        :owl/NamedIndividual],
   :rdfs/label         "Citicorp LLC legal entity identifier",
   :skos/definition    "legal entity identifier for Citicorp LLC"})

(def ^{:private true} L-549300ZFEEJ2IP5VME73-LEI
  "legal entity identifier for State Street Corporation"
  {:cmns-id/identifies :fibo-fbc-fct-usind/StateStreetCorporation-US-MA,
   :db/ident           :gleif-L1-data/L-549300ZFEEJ2IP5VME73-LEI,
   :fibo-fnd-rel-rel/hasTag "549300ZFEEJ2IP5VME73",
   :rdf/type           [:fibo-be-le-lei/LegalEntityIdentifier
                        :owl/NamedIndividual],
   :rdfs/label         "State Street Corporation legal entity identifier",
   :skos/definition    "legal entity identifier for State Street Corporation"})

(def ^{:private true} L-571474TGEMMWANRLN572-LEI
  "legal entity identifier for State Street Bank and Trust Company"
  {:cmns-id/identifies :fibo-fbc-fct-usind/StateStreetBankAndTrustCompany-US-MA,
   :db/ident :gleif-L1-data/L-571474TGEMMWANRLN572-LEI,
   :fibo-fnd-rel-rel/hasTag "571474TGEMMWANRLN572",
   :rdf/type [:fibo-be-le-lei/LegalEntityIdentifier :owl/NamedIndividual],
   :rdfs/label "State Street Bank and Trust Company legal entity identifier",
   :skos/definition
   "legal entity identifier for State Street Bank and Trust Company"})

(def ^{:private true} L-6SHGI4ZSSLCXXQSBB395-LEI
  "legal entity identifier for Citigroup Inc."
  {:cmns-id/identifies :fibo-fbc-fct-usind/CitigroupInc-US-DE,
   :db/ident           :gleif-L1-data/L-6SHGI4ZSSLCXXQSBB395-LEI,
   :fibo-fnd-rel-rel/hasTag "6SHGI4ZSSLCXXQSBB395",
   :rdf/type           [:fibo-be-le-lei/LegalEntityIdentifier
                        :owl/NamedIndividual],
   :rdfs/label         "Citigroup Inc. legal entity identifier",
   :skos/definition    "legal entity identifier for Citigroup Inc."})

(def ^{:private true} L-6X064LF7Y6B4DKF2GZ26-LEI
  "legal entity identifier for FMR LLC"
  {:cmns-id/identifies :fibo-fbc-fct-usind/FMRLLC-US-DE,
   :db/ident           :gleif-L1-data/L-6X064LF7Y6B4DKF2GZ26-LEI,
   :fibo-fnd-rel-rel/hasTag "6X064LF7Y6B4DKF2GZ26",
   :rdf/type           [:fibo-be-le-lei/LegalEntityIdentifier
                        :owl/NamedIndividual],
   :rdfs/label         "FMR LLC legal entity identifier",
   :skos/definition    "legal entity identifier for FMR LLC"})

(def ^{:private true} L-7H6GLXDRUGQFU57RNE97-LEI
  "legal entity identifier for JPMorgan Chase Bank, National Association"
  {:cmns-id/identifies
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociation-US-OH,
   :db/ident :gleif-L1-data/L-7H6GLXDRUGQFU57RNE97-LEI,
   :fibo-fnd-rel-rel/hasTag "7H6GLXDRUGQFU57RNE97",
   :rdf/type [:fibo-be-le-lei/LegalEntityIdentifier :owl/NamedIndividual],
   :rdfs/label
   "JPMorgan Chase Bank, National Association legal entity identifier",
   :skos/definition
   "legal entity identifier for JPMorgan Chase Bank, National Association"})

(def ^{:private true} L-8I5DZWZKVSZI1NUHU748-LEI
  "legal entity identifier for JPMorgan Chase & Co."
  {:cmns-id/identifies :fibo-fbc-fct-usind/JPMorganChaseAndCo-US-DE,
   :db/ident           :gleif-L1-data/L-8I5DZWZKVSZI1NUHU748-LEI,
   :fibo-fnd-rel-rel/hasTag "8I5DZWZKVSZI1NUHU748",
   :rdf/type           [:fibo-be-le-lei/LegalEntityIdentifier
                        :owl/NamedIndividual],
   :rdfs/label         "JPMorgan Chase & Co. legal entity identifier",
   :skos/definition    "legal entity identifier for JPMorgan Chase & Co."})

(def ^{:private true} L-E57ODZWZ7FF32TWEFA76-LEI
  "legal entity identifier for Citibank N.A."
  {:cmns-id/identifies :fibo-fbc-fct-usind/CitibankNA-US-DE,
   :db/ident           :gleif-L1-data/L-E57ODZWZ7FF32TWEFA76-LEI,
   :fibo-fnd-rel-rel/hasTag "E57ODZWZ7FF32TWEFA76",
   :rdf/type           [:fibo-be-le-lei/LegalEntityIdentifier
                        :owl/NamedIndividual],
   :rdfs/label         "Citibank, N.A. legal entity identifier",
   :skos/definition    "legal entity identifier for Citibank N.A."})

(def ^{:private true} L-KB1H1DSPRFMYMCUFXT09-LEI
  "legal entity identifier for Wells Fargo Bank, National Association"
  {:cmns-id/identifies :fibo-fbc-fct-usind/WellsFargoBankNationalAssociation-US,
   :db/ident :gleif-L1-data/L-KB1H1DSPRFMYMCUFXT09-LEI,
   :fibo-fbc-fct-ra/isRegisteredBy
   :fibo-fbc-fct-usfsind/BloombergFinanceLPAsLocalOperatingUnit,
   :fibo-fnd-rel-rel/hasTag "KB1H1DSPRFMYMCUFXT09",
   :rdf/type [:fibo-be-le-lei/LegalEntityIdentifier :owl/NamedIndividual],
   :rdfs/label "Wells Fargo Bank, National Association legal entity identifier",
   :skos/definition
   "legal entity identifier for Wells Fargo Bank, National Association"})

(def ^{:private true} L-OT19FZZ6Z7A27CCLDY33-LEI
  "legal entity identifier for WFC Holdings, LLC"
  {:cmns-id/identifies :fibo-fbc-fct-usind/WFCHoldingsLLC-US-DE,
   :db/ident           :gleif-L1-data/L-OT19FZZ6Z7A27CCLDY33-LEI,
   :fibo-fbc-fct-ra/isRegisteredBy
   :fibo-fbc-fct-usfsind/BloombergFinanceLPAsLocalOperatingUnit,
   :fibo-fnd-rel-rel/hasTag "OT19FZZ6Z7A27CCLDY33",
   :rdf/type           [:fibo-be-le-lei/LegalEntityIdentifier
                        :owl/NamedIndividual],
   :rdfs/label         "WFC Holdings, LLC legal entity identifier",
   :skos/definition    "legal entity identifier for WFC Holdings, LLC"})

(def ^{:private true} L-PBLD0EJDB5FWOLXP3B76-LEI
  "legal entity identifier for Wells Fargo & Company"
  {:cmns-id/identifies :fibo-fbc-fct-usind/WellsFargoAndCompany-US-DE,
   :db/ident           :gleif-L1-data/L-PBLD0EJDB5FWOLXP3B76-LEI,
   :fibo-fnd-rel-rel/hasTag "PBLD0EJDB5FWOLXP3B76",
   :rdf/type           [:fibo-be-le-lei/LegalEntityIdentifier
                        :owl/NamedIndividual],
   :rdfs/label         "Wells Fargo & Company legal entity identifier",
   :skos/definition    "legal entity identifier for Wells Fargo & Company"})

(def ^{:private true} L-WFLLPEPC7FZXENRZV188-LEI
  "legal entity identifier for The Bank of New York Mellon Corporation"
  {:cmns-id/identifies :fibo-fbc-fct-usind/BankOfNewYorkMellonCorporation-US-DE,
   :db/ident :gleif-L1-data/L-WFLLPEPC7FZXENRZV188-LEI,
   :fibo-fnd-rel-rel/hasTag "WFLLPEPC7FZXENRZV188",
   :rdf/type [:fibo-be-le-lei/LegalEntityIdentifier :owl/NamedIndividual],
   :rdfs/label
   "The Bank of New York Mellon Corporation legal entity identifier",
   :skos/definition
   "legal entity identifier for The Bank of New York Mellon Corporation"})