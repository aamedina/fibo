(ns net.wikipunk.rdf.fibo-fbc-fct-usind
  {:cmns-av/copyright #{"Copyright (c) 2015-2024 Object Management Group, Inc."
                        "Copyright (c) 2015-2024 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :dcterms/abstract
   "This ontology includes example individuals for US national banks, state chartered banks, and other institutions, as well as details related to some of the larger corporations that issue stock and are represented in the Dow Jones Industrial Average and S&P 500.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
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
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Places/Addresses/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/CorporateControl/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/LegalCapacity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/Trusts/Trusts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/RegulatoryAgencies/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/OwnershipParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/BusinessCentersIndividuals/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/ControlParties/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/BusinessRegistries/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/Corporations/Corporations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Places/VirtualPlaces/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/CorporateBodies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/Markets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-fct-usind",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfs/label "US Example Individuals",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals.rdf version of this ontology was revised to update the LEI URIs to the new form published by the GLEIF on data.world."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals.rdf version of this ontology was revised to improve the representation of some of the LEI data and fix spelling errors."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/USJurisdiction/USExampleIndividuals.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FBC 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals.rdf version of this ontology was revised to make incorporation and registration dates explicit and to replace references to the legacy LCC UnitedStates country representation with UnitedStatesOfAmerica."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/USJurisdiction/USExampleIndividuals.rdf version of this ontology was modified to reflect revisions to the GLEIF LEI representation for validation level and entity ownership relations."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/USJurisdiction/USExampleIndividuals.rdf version of this ontology was modified per the FIBO 2.0 RFC."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/USJurisdiction/USExampleIndividuals.rdf version of this ontology was modified to add information about the example corporations included in FIBO use cases for securities instrument data and various indices such as the DJIA, update LEI records generally, eliminate duplication of concepts in LCC, simplify addresses, and merge countries with locations in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"})

(def AlphabetIncCorporateAddress
  {:db/ident :fibo-fbc-fct-usind/AlphabetIncCorporateAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "1600 Amphitheatre Parkway",
   :fibo-fnd-plc-adr/hasPostalCode "94043",
   :fibo-fnd-plc-loc/hasCityName "Mountain View",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/California,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Alphabet Inc. corporate address",
   :skos/definition "registration address for Alphabet Inc."})

(def AlphabetIncLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-5493006MHB84DD0ZWV18-LEI"},
   :db/ident :fibo-fbc-fct-usind/AlphabetIncLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2015-08-31T16:16:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-11-29T23:17:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-11-29T17:57:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Alphabet Inc. legal entity identifier registry entry",
   :skos/definition "legal entity identifier registry entry for Alphabet Inc."})

(def AppleIncCorporateAddress
  {:db/ident :fibo-fbc-fct-usind/AppleIncCorporateAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "One Apple Park WY",
   :fibo-fnd-plc-adr/hasPostalCode "95014",
   :fibo-fnd-plc-loc/hasCityName "Cupertino",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/California,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Apple Inc. corporate address",
   :skos/definition "registration address for Apple Inc."})

(def AppleIncLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-HWUPKR0MPOU8FGXBT394-LEI"},
   :db/ident :fibo-fbc-fct-usind/AppleIncLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T15:53:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-08-19T21:31:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-08-09T17:42:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Apple Inc. legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for for Apple Inc."})

(def BNYMellonNationalAssociation
  {:cmns-rlcmp/isPlayedBy
   :fibo-fbc-fct-usind/BNYMellonNationalAssociation-US-DE,
   :db/ident :fibo-fbc-fct-usind/BNYMellonNationalAssociation,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usind/BNYMellonNationalAssociationDateEstablished,
   :fibo-fbc-fct-fse/hasDateInsured
   :fibo-fbc-fct-usind/BNYMellonNationalAssociationDateInsured,
   :rdf/type #{:owl/NamedIndividual :fibo-fbc-fct-usfse/NationalBank},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "BNY Mellon, National Association",
   :skos/definition
   "BNY Mellon, National Association functional entity that is a state-chartered bank and a member of the Federal Reserve based in New York"})

(def BNYMellonNationalAssociation-US-DE
  {:db/ident :fibo-fbc-fct-usind/BNYMellonNationalAssociation-US-DE,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/BNYMellonNationalAssociationAddress,
   :fibo-be-le-lei/hasLegalAddress
   :fibo-fbc-fct-usind/BNYMellonNationalAssociationAddress,
   :fibo-be-oac-cctl/hasDomesticUltimateParent
   :fibo-fbc-fct-usind/BankOfNewYorkMellonCorporation,
   :fibo-fbc-fct-breg/hasPriorLegalName
   #{"Mellon National Bank and Trust Company" "Mellon Bank, N.A."},
   :fibo-fbc-fct-breg/hasTradingOrOperationalName
   #{"BNY Mellon" "BNY Mellon, N.A." "BNY Mellon Wealth Management"},
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-rel-rel/hasLegalName "BNY Mellon, National Association",
   :rdf/type #{:fibo-be-le-cb/StockCorporation :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "BNY Mellon, National Association US-DE",
   :skos/definition
   "BNY Mellon, National Association legal entity that is a Delaware Corporation"})

(def BNYMellonNationalAssociationAddress
  {:db/ident :fibo-fbc-fct-usind/BNYMellonNationalAssociationAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "500 Grant Street",
   :fibo-fnd-plc-adr/hasPostalCode "15258",
   :fibo-fnd-plc-loc/hasCityName "Pittsburgh",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/Pennsylvania,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "BNY Mellon, National Association address",
   :skos/definition
   "registration address for BNY Mellon, National Association"})

(def BNYMellonNationalAssociationBusinessEntityIdentifier-SD
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
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label
   "business entity identifier for BNY Mellon, National Association",
   :skos/definition
   "South Dakota Business Entity registration identifier for BNY Mellon, National Association"})

(def BNYMellonNationalAssociationBusinessIdentifierCode
  {:cmns-col/comprises
   #{:lcc-3166-1/US
     :fibo-fbc-fct-usind/BNYMellonNationalAssociationBusinessPartySuffix
     :fibo-fbc-fct-usind/BNYMellonNationalAssociationBusinessPartyPrefix},
   :cmns-cxtdsg/appliesTo :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-id/identifies :fibo-fbc-fct-usind/BNYMellonNationalAssociation-US-DE,
   :db/ident
   :fibo-fbc-fct-usind/BNYMellonNationalAssociationBusinessIdentifierCode,
   :fibo-fnd-rel-rel/hasTag "MELNUS3PXXX",
   :rdf/type #{:fibo-fbc-fct-fse/BusinessIdentifierCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label
   "BNY Mellon, National Association - Business Identifier Code (BIC)",
   :skos/definition
   "business identifier code (BIC) for BNY Mellon, National Association"})

(def BNYMellonNationalAssociationBusinessPartyPrefix
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/BNYMellonNationalAssociationBusinessIdentifierCode,
   :db/ident
   :fibo-fbc-fct-usind/BNYMellonNationalAssociationBusinessPartyPrefix,
   :fibo-fnd-rel-rel/hasTag "MELN",
   :rdf/type #{:fibo-fbc-fct-fse/BusinessPartyPrefix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "BNY Mellon, National Association business party prefix"})

(def BNYMellonNationalAssociationBusinessPartySuffix
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/BNYMellonNationalAssociationBusinessIdentifierCode,
   :db/ident
   :fibo-fbc-fct-usind/BNYMellonNationalAssociationBusinessPartySuffix,
   :fibo-fnd-rel-rel/hasTag "3P",
   :rdf/type #{:fibo-fbc-fct-fse/BusinessPartySuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "BNY Mellon, National Association business party suffix"})

(def BNYMellonNationalAssociationDateEstablished
  {:cmns-dt/hasDateValue "1869-01-01",
   :db/ident :fibo-fbc-fct-usind/BNYMellonNationalAssociationDateEstablished,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "BNY Mellon, National Association date established",
   :skos/definition
   "date that BNY Mellon, National Association (originally Mellon National Bank and Trust Company in Pennsylvania) was established according to the NIC Repository"})

(def BNYMellonNationalAssociationDateInsured
  {:cmns-dt/hasDateValue "1934-01-01",
   :db/ident :fibo-fbc-fct-usind/BNYMellonNationalAssociationDateInsured,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "BNY Mellon, National Association date insured",
   :skos/definition
   "date that BNY Mellon, National Association (originally Mellon National Bank and Trust Company in Pennsylvania) was initially insured with respect to deposit insurance"})

(def BNYMellonNationalAssociationFDICCertificateNumber
  {:cmns-id/identifies :fibo-fbc-fct-usind/BNYMellonNationalAssociation,
   :db/ident
   :fibo-fbc-fct-usind/BNYMellonNationalAssociationFDICCertificateNumber,
   :fibo-fnd-rel-rel/hasTag "7946",
   :rdf/type #{:fibo-fbc-fct-usjrga/FDICCertificateNumber :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "BNY Mellon, National Association FDIC Certificate number",
   :skos/definition
   "FDIC Certificate number for BNY Mellon, National Association"})

(def BNYMellonNationalAssociationLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-4EP6JBYBTPTQ47LZOB67-LEI"},
   :db/ident
   :fibo-fbc-fct-usind/BNYMellonNationalAssociationLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-26T13:54:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-04-27T13:02:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-04-27T13:06:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label
   "BNY Mellon, National Association legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for BNY Mellon, National Association"})

(def BNYMellonNationalAssociationRSSDIdentifier
  {:cmns-id/identifies :fibo-fbc-fct-usind/BNYMellonNationalAssociation,
   :db/ident :fibo-fbc-fct-usind/BNYMellonNationalAssociationRSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "934329",
   :rdf/type
   #{:owl/NamedIndividual
     :fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "BNY Mellon, National Association RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to BNY Mellon, National Association"})

(def BNYMellonNationalAssociationRTN
  {:cmns-id/identifies :fibo-fbc-fct-usind/BNYMellonNationalAssociation,
   :db/ident :fibo-fbc-fct-usind/BNYMellonNationalAssociationRTN,
   :fibo-fnd-rel-rel/hasTag "043019265",
   :rdf/type #{:fibo-fbc-fct-usjrga/RoutingTransitNumber :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "BNY Mellon, National Association RTN",
   :skos/definition
   "routing transit number (RTN) for BNY Mellon, National Association"})

(def BankOfNewYorkMellonCorporation
  {:cmns-rlcmp/isPlayedBy
   :fibo-fbc-fct-usind/BankOfNewYorkMellonCorporation-US-DE,
   :db/ident :fibo-fbc-fct-usind/BankOfNewYorkMellonCorporation,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-usfse/FinancialHoldingCompany},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "The Bank of New York Mellon Corporation",
   :skos/definition
   "financial holding company functional entity for the Bank of New York Mellon Corporation"})

(def BankOfNewYorkMellonCorporation-US-DE
  {:db/ident :fibo-fbc-fct-usind/BankOfNewYorkMellonCorporation-US-DE,
   :fibo-be-corp-corp/hasDateOfRegistration
   :fibo-fbc-fct-usind/BankOfNewYorkMellonCorporationIncorporationDate,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/BankOfNewYorkMellonCorporationAddress,
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationTrustCompany,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "https://www.bnymellon.com/"},
   :fibo-fnd-rel-rel/hasLegalName "The Bank of New York Mellon Corporation",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-cb/ForProfitCorporation
               :fibo-be-corp-corp/PubliclyHeldCompany},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "The Bank of New York Mellon Corporation US-DE",
   :skos/definition
   "publicly held company and for profit corporation that is The Bank of New York Mellon Corporation legal entity, incorporated in Delaware"})

(def BankOfNewYorkMellonCorporationAddress
  {:db/ident :fibo-fbc-fct-usind/BankOfNewYorkMellonCorporationAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "225 Liberty Street",
   :fibo-fnd-plc-adr/hasPostalCode "10286",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/New_York,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/NewYork,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Bank of New York Mellon Corporation address",
   :skos/definition
   "registration address for The Bank of New York Mellon Corporation"})

(def BankOfNewYorkMellonCorporationBusinessEntityIdentifier
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
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Bank of New York Mellon Corporation business entity identifier",
   :skos/definition
   "registration identifier assigned by the Delaware Department of Corporations for the Bank of New York Mellon Corporation"})

(def BankOfNewYorkMellonCorporationIncorporationDate
  {:cmns-dt/hasDateValue "2007-02-09",
   :db/ident
   :fibo-fbc-fct-usind/BankOfNewYorkMellonCorporationIncorporationDate,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Bank of New York Mellon Corporation incorporation date",
   :skos/definition
   "the date that the Bank of New York Mellon Corporation was first incorporated in the State of Delaware"})

(def BankOfNewYorkMellonCorporationLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-WFLLPEPC7FZXENRZV188-LEI"},
   :db/ident
   :fibo-fbc-fct-usind/BankOfNewYorkMellonCorporationLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T15:53:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-09-01T15:31:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-08-03T23:22:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label
   "Bank of New York Mellon Corporation legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for The Bank of New York Mellon Corporation"})

(def BankOfNewYorkMellonCorporationRSSDIdentifier
  {:cmns-id/identifies :fibo-fbc-fct-usind/BankOfNewYorkMellonCorporation,
   :db/ident :fibo-fbc-fct-usind/BankOfNewYorkMellonCorporationRSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "3587146",
   :rdf/type
   #{:owl/NamedIndividual
     :fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Bank of New York Mellon Corporation RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to The Bank of New York Mellon Corporation"})

(def BankOfNewYorkMellonDateEstablished
  {:cmns-dt/hasDateValue "1784-01-01",
   :db/ident :fibo-fbc-fct-usind/BankOfNewYorkMellonDateEstablished,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "The Bank of New York Mellon Corporation date established",
   :skos/definition
   "date that The Bank of New York Mellon Corporation was established by Alexander Hamilton"})

(def CitiCardsSouthDakotaAcceptanceCorp
  {:cmns-rlcmp/isPlayedBy
   :fibo-fbc-fct-usind/CitiCardsSouthDakotaAcceptanceCorp-US-DE,
   :db/ident :fibo-fbc-fct-usind/CitiCardsSouthDakotaAcceptanceCorp,
   :rdf/type #{:fibo-fbc-fct-fse/FinanceCompany :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citi Cards South Dakota Acceptance Corp.",
   :skos/definition
   "finance company functional entity for the Citi Cards South Dakota Acceptance Corp., a credit card provider based in Sioux Falls, South Dakota"})

(def CitiCardsSouthDakotaAcceptanceCorp-US-DE
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
   :rdf/type #{:fibo-be-le-cb/StockCorporation :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citi Cards South Dakota Acceptance Corp. US-DE",
   :skos/definition
   "stock corporation legal entity for Citi Cards South Dakota Acceptance Corp., a Delaware Corporation headquartered in Sioux Falls, South Dakota"})

(def CitiCardsSouthDakotaAcceptanceCorpBusinessEntityIdentifier
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
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label
   "Citi Cards South Dakota Acceptance Corp. business entity identifier",
   :skos/definition
   "registration identifier assigned by the Delaware Department of Corporations for Citi Cards South Dakota Acceptance Corp."})

(def CitiCardsSouthDakotaAcceptanceCorpHeadquartersAddress
  {:db/ident
   :fibo-fbc-fct-usind/CitiCardsSouthDakotaAcceptanceCorpHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "701 East 60th Street North",
   :fibo-fnd-plc-adr/hasPostalCode "57104-0432",
   :fibo-fnd-plc-loc/hasCityName "Sioux Falls",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/SouthDakota,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citi Cards South Dakota Acceptance Corp. headquarters address",
   :skos/definition
   "registration address for Citi Cards South Dakota Acceptance Corp."})

(def CitiCardsSouthDakotaAcceptanceCorpIncorporationDate
  {:cmns-dt/hasDateValue "2003-07-28",
   :db/ident
   :fibo-fbc-fct-usind/CitiCardsSouthDakotaAcceptanceCorpIncorporationDate,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citi Cards South Dakota Acceptance Corp. incorporation date",
   :skos/definition
   "date that Citi Cards South Dakota Acceptance Corp. was first incorporated in the State of Delaware"})

(def CitiCardsSouthDakotaAcceptanceCorpOwnership
  {:db/ident :fibo-fbc-fct-usind/CitiCardsSouthDakotaAcceptanceCorpOwnership,
   :fibo-be-le-lei/hasOwnershipPercentage 100,
   :fibo-be-oac-opty/hasOwnedEntity
   :fibo-fbc-fct-usind/CitiCardsSouthDakotaAcceptanceCorp-US-DE,
   :fibo-be-oac-opty/hasOwningEntity :fibo-fbc-fct-usind/CitigroupInc-US-DE,
   :fibo-fnd-agr-ctr/isQualifiedBy
   :fibo-be-le-lei/GenerallyAcceptedAccountingPrinciples,
   :rdf/type #{:owl/NamedIndividual :fibo-be-oac-opty/DirectConsolidation},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citi Cards South Dakota Acceptance Corp. ownership",
   :skos/definition
   "entity ownership context for Citi Cards South Dakota Acceptance Corp., a wholly owned subsidiary of Citigroup Inc."})

(def CitiCardsSouthDakotaAcceptanceCorpRSSDIdentifier
  {:cmns-id/identifies :fibo-fbc-fct-usind/CitiCardsSouthDakotaAcceptanceCorp,
   :db/ident
   :fibo-fbc-fct-usind/CitiCardsSouthDakotaAcceptanceCorpRSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "3225130",
   :rdf/type
   #{:owl/NamedIndividual
     :fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citi Cards South Dakota Acceptance Corp. RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to Citi Cards South Dakota Acceptance Corp."})

(def CitibankNA
  {:cmns-rlcmp/isPlayedBy :fibo-fbc-fct-usind/CitibankNA-US-DE,
   :db/ident :fibo-fbc-fct-usind/CitibankNA,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usind/CitibankNADateEstablished,
   :fibo-fbc-fct-fse/hasDateInsured :fibo-fbc-fct-usind/CitibankNADateInsured,
   :rdf/type #{:owl/NamedIndividual :fibo-fbc-fct-usfse/NationalBank},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citibank, N.A.",
   :skos/definition
   "national bank functional entity for Citibank, N.A. (National Association), a national bank based in Sioux Falls, South Dakota"})

(def CitibankNA-US-DE
  {:db/ident :fibo-fbc-fct-usind/CitibankNA-US-DE,
   :fibo-be-corp-corp/hasDateOfRegistration
   :fibo-fbc-fct-usind/CitibankNAIncorporationDate,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/CitibankNAHeadquartersAddress,
   :fibo-be-le-lei/hasLegalAddress :fibo-fbc-fct-usind/CitibankNALegalAddress,
   :fibo-be-oac-cctl/hasDomesticUltimateParent :fibo-fbc-fct-usind/CitigroupInc,
   :fibo-fbc-fct-breg/hasPriorLegalName #{"First National City Bank of New York"
                                          "First National City Bank"},
   :fibo-fbc-fct-breg/hasTradingOrOperationalName "Citibank, N.A.",
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-rel-rel/hasLegalName "Citibank, National Association",
   :rdf/type #{:fibo-be-le-cb/StockCorporation :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citibank, N.A. US-DE",
   :skos/definition
   "stock corporation legal entity for Citibank, N.A. (National Association), a Delaware Corporation headquartered in Sioux Falls, South Dakota"})

(def CitibankNABusinessEntityIdentifier
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
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citibank, N.A. business entity identifier",
   :skos/definition
   "registration identifier assigned by the Delaware Department of Corporations for Citibank N.A."})

(def CitibankNADateEstablished
  {:cmns-dt/hasDateValue "1812-06-16",
   :db/ident :fibo-fbc-fct-usind/CitibankNADateEstablished,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citibank, N.A. date established",
   :skos/definition
   "date that Citibank, N.A. (originally First National City Bank Of New York) was established"})

(def CitibankNADateInsured
  {:cmns-dt/hasDateValue "1934-01-01",
   :db/ident :fibo-fbc-fct-usind/CitibankNADateInsured,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citibank, N.A. date insured",
   :skos/definition
   "date that Citibank, N.A. (as First National City Bank Of New York) was initially insured with respect to deposit insurance by the FDIC"})

(def CitibankNAFDICCertificateNumber
  {:cmns-av/explanatoryNote
   "From the NIC and FDIC records, it appears that Citibank, National Association (with RSSD of 112855 and FDIC certificate of 16100) and Citibank, N.A. have been merged into a single national bank, with the surviving FDIC certificate and RSSD as defined herein.",
   :cmns-id/identifies :fibo-fbc-fct-usind/CitibankNA,
   :db/ident :fibo-fbc-fct-usind/CitibankNAFDICCertificateNumber,
   :fibo-fnd-rel-rel/hasTag "7213",
   :rdf/type #{:fibo-fbc-fct-usjrga/FDICCertificateNumber :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citibank, N.A. FDIC Certificate number",
   :skos/definition "FDIC Certificate number for Citibank, N.A."})

(def CitibankNAHeadquartersAddress
  {:db/ident :fibo-fbc-fct-usind/CitibankNAHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "399 Park Avenue",
   :fibo-fnd-plc-adr/hasPostalCode "10022-4617",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/New_York,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/NewYork,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citibank, N.A headquarters address",
   :skos/definition
   "registration address that is identified as a headquarters address for Citibank N.A."})

(def CitibankNAIncorporationDate
  {:cmns-dt/hasDateValue "1982-09-10",
   :db/ident :fibo-fbc-fct-usind/CitibankNAIncorporationDate,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citibank, N.A. incorporation date",
   :skos/definition
   "date that Citibank, N.A. (National Association) was first incorporated in the State of Delaware"})

(def CitibankNALegalAddress
  {:db/ident :fibo-fbc-fct-usind/CitibankNALegalAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "701 East 60th Street North",
   :fibo-fnd-plc-adr/hasPostalCode "57104-0432",
   :fibo-fnd-plc-loc/hasCityName "Sioux Falls",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/SouthDakota,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citibank N.A. legal address",
   :skos/definition
   "registration address that is identified as a legal address for Citibank N.A. (National Association)"})

(def CitibankNALegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-E57ODZWZ7FF32TWEFA76-LEI"},
   :db/ident :fibo-fbc-fct-usind/CitibankNALegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T15:53:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-05-27T19:56:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-05-27T20:19:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citibank, N.A. legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for Citibank, N.A."})

(def CitibankNAOwnership
  {:db/ident :fibo-fbc-fct-usind/CitibankNAOwnership,
   :fibo-be-le-lei/hasOwnershipPercentage 100,
   :fibo-be-oac-opty/hasOwnedEntity :fibo-fbc-fct-usind/CitibankNA-US-DE,
   :fibo-be-oac-opty/hasOwningEntity :fibo-fbc-fct-usind/CiticorpLLC-US-DE,
   :fibo-fnd-agr-ctr/isQualifiedBy
   :fibo-be-le-lei/GenerallyAcceptedAccountingPrinciples,
   :rdf/type #{:owl/NamedIndividual :fibo-be-oac-opty/DirectConsolidation},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citibank, N.A. ownership",
   :skos/definition
   "entity ownership context for Citibank, N.A., a wholly owned subsidiary of Citicorp LLC"})

(def CitibankNARSSDIdentifier
  {:cmns-av/explanatoryNote
   "From the NIC and FDIC records, it appears that Citibank, National Association (with RSSD of 112855 and FDIC certificate of 16100) and Citibank, N.A. have been merged into a single national bank, with the surviving FDIC certificate and RSSD as defined herein.",
   :cmns-id/identifies :fibo-fbc-fct-usind/CitibankNA,
   :db/ident :fibo-fbc-fct-usind/CitibankNARSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "476810",
   :rdf/type
   #{:owl/NamedIndividual
     :fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citibank, N.A. RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to Citibank, N.A."})

(def CitibankNARTN
  {:cmns-id/identifies :fibo-fbc-fct-usind/CitibankNA,
   :db/ident :fibo-fbc-fct-usind/CitibankNARTN,
   :fibo-fnd-rel-rel/hasTag "021000089",
   :rdf/type #{:fibo-fbc-fct-usjrga/RoutingTransitNumber :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citibank, N.A. RTN",
   :skos/definition "routing transit number (RTN) for Citibank, N.A."})

(def CiticorpLLC
  {:cmns-rlcmp/isPlayedBy :fibo-fbc-fct-usind/CiticorpLLC-US-DE,
   :db/ident :fibo-fbc-fct-usind/CiticorpLLC,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-usfse/FinancialHoldingCompany},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citicorp LLC",
   :skos/definition
   "financial holding company functional entity for Citicorp LLC"})

(def CiticorpLLC-US-DE
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
   :rdf/type #{:fibo-be-plc-plc/PrivateCompanyWithLimitedLiability
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citicorp LLC US-DE",
   :skos/definition
   "private company with limited liability legal entity for Citicorp LLC, a Delaware Limited Liability Company"})

(def CiticorpLLCBusinessEntityIdentifier
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/DelawareBusinessRegistrationIdentifierScheme,
   :cmns-id/identifies :fibo-fbc-fct-usind/CiticorpLLC-US-DE,
   :db/ident :fibo-fbc-fct-usind/CiticorpLLCBusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "3911630",
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citicorp LLC business entity identifier",
   :skos/definition
   "registration identifier assigned by the Delaware Department of Corporations for Citicorp LLC"})

(def CiticorpLLCLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-549300PSHWOM1D1JVL23-LEI"},
   :db/ident :fibo-fbc-fct-usind/CiticorpLLCLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2016-05-05T01:54:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-06-09T15:32:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-05-27T20:19:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citicorp LLC legal entity identifier registry entry",
   :skos/definition "legal entity identifier registry entry for Citicorp LLC"})

(def CiticorpLLCOwnership
  {:db/ident :fibo-fbc-fct-usind/CiticorpLLCOwnership,
   :fibo-be-le-lei/hasOwnershipPercentage 100,
   :fibo-be-oac-opty/hasOwnedEntity :fibo-fbc-fct-usind/CiticorpLLC-US-DE,
   :fibo-be-oac-opty/hasOwningEntity :fibo-fbc-fct-usind/CitigroupInc-US-DE,
   :fibo-fnd-agr-ctr/isQualifiedBy
   :fibo-be-le-lei/GenerallyAcceptedAccountingPrinciples,
   :rdf/type #{:owl/NamedIndividual :fibo-be-oac-opty/DirectConsolidation},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citicorp LLC ownership",
   :skos/definition
   "entity ownership context for Citicorp LLC, a wholly owned subsidiary of Citigroup Inc."})

(def CiticorpLLCRSSDIdentifier
  {:cmns-id/identifies :fibo-fbc-fct-usind/CiticorpLLC,
   :db/ident :fibo-fbc-fct-usind/CiticorpLLCRSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "3375370",
   :rdf/type
   #{:owl/NamedIndividual
     :fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citicorp LLC RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to Citicorp LLC"})

(def CiticorpLLCRegistrationDate
  {:cmns-dt/hasDateValue "2005-01-13",
   :db/ident :fibo-fbc-fct-usind/CiticorpLLCRegistrationDate,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citicorp LLC registration date",
   :skos/definition
   "date that Citicorp LLC was first registered as a limited liability company in the State of Delaware"})

(def CitigroupInc
  {:cmns-rlcmp/isPlayedBy :fibo-fbc-fct-usind/CitigroupInc-US-DE,
   :db/ident :fibo-fbc-fct-usind/CitigroupInc,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-usfse/FinancialHoldingCompany},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citigroup Inc.",
   :skos/definition
   "financial holding company functional entity for Citigroup Inc."})

(def CitigroupInc-US-DE
  {:db/ident :fibo-fbc-fct-usind/CitigroupInc-US-DE,
   :fibo-be-corp-corp/hasDateOfRegistration
   :fibo-fbc-fct-usind/CitigroupIncIncorporationDate,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/CitigroupIncHeadquartersAddress,
   :fibo-be-oac-cctl/hasSubsidiary
   #{:fibo-fbc-fct-usind/CiticorpLLC
     :fibo-fbc-fct-usind/CitiCardsSouthDakotaAcceptanceCorp},
   :fibo-fbc-fct-breg/hasPriorLegalName
   #{"Primerica Corporation" "Travelers Group Inc." "The Travelers Inc."},
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationTrustCompany,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-rel-rel/hasLegalName "Citigroup Inc.",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-cb/ForProfitCorporation
               :fibo-be-corp-corp/PubliclyHeldCompany},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citigroup Inc. US-DE",
   :skos/definition
   "stock corporation legal entity for Citigroup Inc., a Delaware Corporation"})

(def CitigroupIncBusinessEntityIdentifier
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/DelawareBusinessRegistrationIdentifierScheme,
   :cmns-id/identifies :fibo-fbc-fct-usind/CitigroupInc-US-DE,
   :db/ident :fibo-fbc-fct-usind/CitigroupIncBusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "2154254",
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citigroup Inc. business entity identifier",
   :skos/definition
   "registration identifier assigned by the Delaware Department of Corporations for Citigroup Inc."})

(def CitigroupIncHeadquartersAddress
  {:db/ident :fibo-fbc-fct-usind/CitigroupIncHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "388 Greenwich Street",
   :fibo-fnd-plc-adr/hasPostalCode "10013",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/New_York,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/NewYork,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citigroup Inc. headquarters address",
   :skos/definition
   "registration address identified as a headquarters address for Citigroup Inc."})

(def CitigroupIncIncorporationDate
  {:cmns-dt/hasDateValue "1988-03-08",
   :db/ident :fibo-fbc-fct-usind/CitigroupIncIncorporationDate,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citigroup Inc. incorporation date",
   :skos/definition
   "date that Citigroup Inc. was first registered as a corporation in the State of Delaware"})

(def CitigroupIncLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-6SHGI4ZSSLCXXQSBB395-LEI"},
   :db/ident :fibo-fbc-fct-usind/CitigroupIncLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T15:53:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-06-17T15:33:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-05-27T20:19:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citigroup Inc. legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for Citigroup Inc."})

(def CitigroupIncRSSDIdentifier
  {:cmns-id/identifies :fibo-fbc-fct-usind/CitigroupInc,
   :db/ident :fibo-fbc-fct-usind/CitigroupIncRSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "1951350",
   :rdf/type
   #{:owl/NamedIndividual
     :fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Citigroup Inc. RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to Citigroup Inc."})

(def FMRLLC
  {:cmns-rlcmp/isPlayedBy :fibo-fbc-fct-usind/FMRLLC-US-DE,
   :db/ident :fibo-fbc-fct-usind/FMRLLC,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usind/FMRLLCDateEstablished,
   :rdf/type #{:fibo-fbc-fct-fse/ManagementCompany :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "FMR LLC",
   :skos/definition
   "management company functional entity for FMR LLC, a multinational financial services corporation based in Boston, MA"})

(def FMRLLC-US-DE
  {:db/ident :fibo-fbc-fct-usind/FMRLLC-US-DE,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/FMRLLCHeadquartersAddress,
   :fibo-fbc-fct-breg/hasPriorLegalName
   "Fidelity Management and Research Company",
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationTrustCompany,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "https://www.fidelity.com/"},
   :fibo-fnd-rel-rel/hasLegalName "FMR LLC",
   :rdf/type #{:fibo-be-plc-plc/PrivateCompanyWithLimitedLiability
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "FMR LLC US-DE",
   :skos/definition
   "private company with limited liability legal entity for FMR LLC that is a Delaware Limited Liability Company"})

(def FMRLLCBusinessEntityIdentifier
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/DelawareBusinessRegistrationIdentifierScheme,
   :cmns-id/identifies :fibo-fbc-fct-usind/FMRLLC-US-DE,
   :db/ident :fibo-fbc-fct-usind/FMRLLCBusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "4403845",
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "FMR LLC business entity identifier",
   :skos/definition
   "registration identifier assigned by the Delaware Department of Corporations for FMR LLC"})

(def FMRLLCDateEstablished
  {:cmns-dt/hasDateValue "1946-01-01",
   :db/ident :fibo-fbc-fct-usind/FMRLLCDateEstablished,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "FMR LLC date established",
   :skos/definition
   "date that FMR LLC (originally Fidelity Management and Research Company) was first established"})

(def FMRLLCHeadquartersAddress
  {:db/ident :fibo-fbc-fct-usind/FMRLLCHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "245 Summer Street",
   :fibo-fnd-plc-adr/hasPostalCode "02210",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Boston,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/Massachusetts,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "FMR LLC headquarters address",
   :skos/definition
   "registration address identified as a headquarters address for FMR LLC"})

(def FMRLLCLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-6X064LF7Y6B4DKF2GZ26-LEI"},
   :db/ident :fibo-fbc-fct-usind/FMRLLCLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T15:52:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-06-28T12:47:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-06-28T12:51:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "FMR LLC legal entity identifier registry entry",
   :skos/definition "legal entity identifier registry entry for FMR LLC"})

(def FMRLLCRSSDIdentifier
  {:cmns-id/identifies :fibo-fbc-fct-usind/FMRLLC,
   :db/ident :fibo-fbc-fct-usind/FMRLLCRSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "1245983",
   :rdf/type
   #{:owl/NamedIndividual
     :fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "FMR LLC RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to FMR LLC"})

(def InternationalBusinessMachinesCorporationAddress
  {:db/ident
   :fibo-fbc-fct-usind/InternationalBusinessMachinesCorporationAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "New Orchard Road",
   :fibo-fnd-plc-adr/hasPostalCode "10504",
   :fibo-fnd-plc-loc/hasCityName "Armonk",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/NewYork,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "International Business Machines Corporation address",
   :skos/definition
   "registration address for International Business Machines Corporation"})

(def InternationalBusinessMachinesCorporationBusinessIdentifierCode
  {:cmns-col/comprises
   #{:lcc-3166-1/US
     :fibo-fbc-fct-usind/InternationalBusinessMachinesCorporationBusinessPartySuffix
     :fibo-fbc-fct-usind/InternationalBusinessMachinesCorporationBusinessPartyPrefix},
   :cmns-cxtdsg/appliesTo :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-id/identifies
   :fibo-be-le-usee/InternationalBusinessMachinesCorporation-US-NY,
   :db/ident
   :fibo-fbc-fct-usind/InternationalBusinessMachinesCorporationBusinessIdentifierCode,
   :fibo-fnd-rel-rel/hasTag "IBMXUS33XXX",
   :rdf/type #{:fibo-fbc-fct-fse/BusinessIdentifierCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label
   "International Business Machines Corporation Business Identifier Code (BIC)",
   :skos/definition
   "business identifier code (BIC) for International Business Machines Corporation"})

(def InternationalBusinessMachinesCorporationBusinessPartyPrefix
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/InternationalBusinessMachinesCorporationBusinessIdentifierCode,
   :db/ident
   :fibo-fbc-fct-usind/InternationalBusinessMachinesCorporationBusinessPartyPrefix,
   :fibo-fnd-rel-rel/hasTag "IBMX",
   :rdf/type #{:fibo-fbc-fct-fse/BusinessPartyPrefix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label
   "International Business Machines Corporation business party prefix",
   :skos/definition
   "business party prefix for International Business Machines Corporation"})

(def InternationalBusinessMachinesCorporationBusinessPartySuffix
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/InternationalBusinessMachinesCorporationBusinessIdentifierCode,
   :db/ident
   :fibo-fbc-fct-usind/InternationalBusinessMachinesCorporationBusinessPartySuffix,
   :fibo-fnd-rel-rel/hasTag "33",
   :rdf/type #{:fibo-fbc-fct-fse/BusinessPartySuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label
   "International Business Machines Corporation business party suffix",
   :skos/definition
   "business party suffix for International Business Machines Corporation"})

(def InternationalBusinessMachinesCorporationLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-VGRQXHF3J8VDLUA7XE92-LEI"},
   :db/ident
   :fibo-fbc-fct-usind/InternationalBusinessMachinesCorporationLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-27T11:47:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-05-27T21:33:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-05-10T21:00:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label
   "International Business Machines Corporation legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for International Business Machines Corporation"})

(def JPMorganChaseAndCo
  {:cmns-rlcmp/isPlayedBy :fibo-fbc-fct-usind/JPMorganChaseAndCo-US-DE,
   :db/ident :fibo-fbc-fct-usind/JPMorganChaseAndCo,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-usfse/FinancialHoldingCompany},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "JPMorgan Chase & Co.",
   :skos/definition
   "financial holding company functional entity for JPMorgan Chase & Co."})

(def JPMorganChaseAndCo-US-DE
  {:db/ident :fibo-fbc-fct-usind/JPMorganChaseAndCo-US-DE,
   :fibo-be-corp-corp/hasDateOfRegistration
   :fibo-fbc-fct-usind/JPMorganChaseAndCoIncorporationDate,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/JPMorganChaseAndCoHeadquartersAddress,
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationTrustCompany,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "https://www.jpmorganchase.com/"},
   :fibo-fnd-rel-rel/hasLegalName "JPMorgan Chase & Co.",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-cb/ForProfitCorporation
               :fibo-be-corp-corp/PubliclyHeldCompany},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "JPMorgan Chase & Co. US-DE",
   :skos/definition
   "publicly held company and for profit corporation legal entity for the JPMorgan Chase & Co., a Delaware Corporation"})

(def JPMorganChaseAndCoBusinessEntityIdentifier
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/DelawareBusinessRegistrationIdentifierScheme,
   :cmns-id/identifies :fibo-fbc-fct-usind/JPMorganChaseAndCo-US-DE,
   :db/ident :fibo-fbc-fct-usind/JPMorganChaseAndCoBusinessEntityIdentifier,
   :fibo-fbc-fct-breg/hasEntityStatus :fibo-fbc-fct-breg/ActiveStatus,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "691011",
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "JPMorgan Chase & Co. business entity identifier",
   :skos/definition
   "registration identifier assigned by the Delaware Department of Corporations for JPMorgan Chase & Co."})

(def JPMorganChaseAndCoBusinessIdentifierCode
  {:cmns-col/comprises
   #{:lcc-3166-1/US :fibo-fbc-fct-usind/JPMorganChaseAndCoBusinessPartyPrefix
     :fibo-fbc-fct-usind/JPMorganChaseAndCoBusinessPartySuffix},
   :cmns-cxtdsg/appliesTo :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-id/identifies :fibo-fbc-fct-usind/JPMorganChaseAndCo-US-DE,
   :db/ident :fibo-fbc-fct-usind/JPMorganChaseAndCoBusinessIdentifierCode,
   :fibo-fnd-rel-rel/hasTag "HAMQUS31XXX",
   :rdf/type #{:fibo-fbc-fct-fse/BusinessIdentifierCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "JPMorgan Chase & Co. Business Identifier Code (BIC)",
   :skos/definition "business identifier code (BIC) for JPMorgan Chase & Co."})

(def JPMorganChaseAndCoBusinessPartyPrefix
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/JPMorganChaseAndCoBusinessIdentifierCode,
   :db/ident :fibo-fbc-fct-usind/JPMorganChaseAndCoBusinessPartyPrefix,
   :fibo-fnd-rel-rel/hasTag "HAMQ",
   :rdf/type #{:fibo-fbc-fct-fse/BusinessPartyPrefix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "JPMorgan Chase & Co. business party prefix",
   :skos/definition "business party prefix for JPMorgan Chase & Co."})

(def JPMorganChaseAndCoBusinessPartySuffix
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/JPMorganChaseAndCoBusinessIdentifierCode,
   :db/ident :fibo-fbc-fct-usind/JPMorganChaseAndCoBusinessPartySuffix,
   :fibo-fnd-rel-rel/hasTag "31",
   :rdf/type #{:fibo-fbc-fct-fse/BusinessPartySuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "JPMorgan Chase & Co. business party suffix",
   :skos/definition "business party suffix for JPMorgan Chase & Co."})

(def JPMorganChaseAndCoHeadquartersAddress
  {:db/ident :fibo-fbc-fct-usind/JPMorganChaseAndCoHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "270 Park Avenue",
   :fibo-fnd-plc-adr/hasPostalCode "10017-2070",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/New_York,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/NewYork,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "JPMorgan Chase & Co. headquarters address",
   :skos/definition
   "registration address identified as the headquarters address for JPMorgan Chase & Co."})

(def JPMorganChaseAndCoIncorporationDate
  {:cmns-dt/hasDateValue "1968-10-28",
   :db/ident :fibo-fbc-fct-usind/JPMorganChaseAndCoIncorporationDate,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "JPMorgan Chase & Co. incorporation date",
   :skos/definition
   "date that JPMorgan Chase & Co. was first registered as a corporation in the State of Delaware"})

(def JPMorganChaseAndCoLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-8I5DZWZKVSZI1NUHU748-LEI"},
   :db/ident
   :fibo-fbc-fct-usind/JPMorganChaseAndCoLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T15:53:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-01-07T23:26:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-01-07T23:27:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "JPMorgan Chase & Co. legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for JPMorgan Chase & Co."})

(def JPMorganChaseAndCoRSSDIdentifier
  {:cmns-id/identifies :fibo-fbc-fct-usind/JPMorganChaseAndCo,
   :db/ident :fibo-fbc-fct-usind/JPMorganChaseAndCoRSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "1039502",
   :rdf/type
   #{:owl/NamedIndividual
     :fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "JPMorgan Chase & Co. RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to JPMorgan Chase & Co."})

(def JPMorganChaseBankNationalAssociation
  {:cmns-rlcmp/isPlayedBy
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociation-US-OH,
   :db/ident :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociation,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationDateEstablished,
   :fibo-fbc-fct-fse/hasDateInsured
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationDateInsured,
   :rdf/type #{:owl/NamedIndividual :fibo-fbc-fct-usfse/NationalBank},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "JPMorgan Chase Bank, National Association",
   :skos/definition
   "national bank functional entity for JPMorgan Chase Bank, National Association"})

(def JPMorganChaseBankNationalAssociation-US-OH
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
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "https://www.chase.com/"},
   :fibo-fnd-rel-rel/hasLegalName "JPMorgan Chase Bank, National Association",
   :rdf/type #{:fibo-be-le-cb/StockCorporation :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "JPMorgan Chase Bank, National Association US-DE",
   :skos/definition
   "stock corporation legal entity for JPMorgan Chase Bank, National Association, an Ohio Corporation"})

(def JPMorganChaseBankNationalAssociationAddress
  {:db/ident :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "1111 Polaris Parkway",
   :fibo-fnd-plc-adr/hasPostalCode "43240",
   :fibo-fnd-plc-loc/hasCityName "Columbus",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/Ohio,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "JPMorgan Chase Bank, National Association address",
   :skos/definition
   "registration address for JPMorgan Chase Bank, National Association"})

(def JPMorganChaseBankNationalAssociationBusinessEntityIdentifier
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
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label
   "JPMorgan Chase Bank, National Association business entity identifier",
   :skos/definition
   "registration identifier assigned by the Ohio Department of Corporations for JPMorgan Chase Bank, National Association"})

(def JPMorganChaseBankNationalAssociationBusinessIdentifierCode
  {:cmns-col/comprises
   #{:lcc-3166-1/US
     :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationBusinessPartySuffix
     :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationBusinessPartyPrefix},
   :cmns-cxtdsg/appliesTo :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-id/identifies
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociation-US-OH,
   :db/ident
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationBusinessIdentifierCode,
   :fibo-fnd-rel-rel/hasTag "CHASUS33XXX",
   :rdf/type #{:fibo-fbc-fct-fse/BusinessIdentifierCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label
   "JPMorgan Chase Bank, National Association - business identifier code (BIC)",
   :skos/definition
   "business identifier code (BIC) for JPMorgan Chase Bank, National Association"})

(def JPMorganChaseBankNationalAssociationBusinessPartyPrefix
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationBusinessIdentifierCode,
   :db/ident
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationBusinessPartyPrefix,
   :fibo-fnd-rel-rel/hasTag "CHAS",
   :rdf/type #{:fibo-fbc-fct-fse/BusinessPartyPrefix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label
   "JPMorgan Chase Bank, National Association business party prefix",
   :skos/definition
   "business party prefix for JPMorgan Chase Bank, National Association"})

(def JPMorganChaseBankNationalAssociationBusinessPartySuffix
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationBusinessIdentifierCode,
   :db/ident
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationBusinessPartySuffix,
   :fibo-fnd-rel-rel/hasTag "33",
   :rdf/type #{:fibo-fbc-fct-fse/BusinessPartySuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label
   "JPMorgan Chase Bank, National Association business party suffix",
   :skos/definition
   "business party suffix for JPMorgan Chase Bank, National Association"})

(def JPMorganChaseBankNationalAssociationDateEstablished
  {:cmns-dt/hasDateValue "1824-01-01",
   :db/ident
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationDateEstablished,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "JPMorgan Chase Bank, National Association date established",
   :skos/definition
   "date that JPMorgan Chase Bank, National Association was established"})

(def JPMorganChaseBankNationalAssociationDateInsured
  {:cmns-dt/hasDateValue "1934-01-01",
   :db/ident
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationDateInsured,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "JPMorgan Chase Bank, National Association date insured",
   :skos/definition
   "date that JPMorgan Chase Bank, National Association was initially insured with respect to deposit insurance by the FDIC"})

(def JPMorganChaseBankNationalAssociationFDICCertificateNumber
  {:cmns-id/identifies :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociation,
   :db/ident
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationFDICCertificateNumber,
   :fibo-fnd-rel-rel/hasTag "628",
   :rdf/type #{:fibo-fbc-fct-usjrga/FDICCertificateNumber :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label
   "JPMorgan Chase Bank, National Association FDIC Certificate number",
   :skos/definition
   "FDIC Certificate number for JPMorgan Chase Bank, National Association"})

(def JPMorganChaseBankNationalAssociationLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-7H6GLXDRUGQFU57RNE97-LEI"},
   :db/ident
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T15:51:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-08-24T20:52:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-01-07T23:30:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label
   "JPMorgan Chase Bank, National Association legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for JPMorgan Chase Bank, National Association"})

(def JPMorganChaseBankNationalAssociationRSSDIdentifier
  {:cmns-id/identifies :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociation,
   :db/ident
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationRSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "852218",
   :rdf/type
   #{:owl/NamedIndividual
     :fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "JPMorgan Chase Bank, National Association RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to JPMorgan Chase Bank, National Association"})

(def JPMorganChaseBankNationalAssociationRTN
  {:cmns-id/identifies :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociation,
   :db/ident :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationRTN,
   :fibo-fnd-rel-rel/hasTag "021000021",
   :rdf/type #{:fibo-fbc-fct-usjrga/RoutingTransitNumber :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "JPMorgan Chase Bank, National Association RTN",
   :skos/definition
   "routing transit number (RTN) for JPMorgan Chase Bank, National Association"})

(def JPMorganChaseBankNationalAssociationRegistrationDate
  {:cmns-dt/hasDateValue "2012-06-28",
   :db/ident
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociationRegistrationDate,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "JPMorgan Chase Bank, National Association registration date",
   :skos/definition
   "date that JPMorgan Chase Bank, National Association was first registered as a corporation in the State of Ohio"})

(def PinnacleBank
  {:cmns-rlcmp/isPlayedBy :fibo-fbc-fct-usind/PinnacleBank-US-CA,
   :db/ident :fibo-fbc-fct-usind/PinnacleBank,
   :fibo-fbc-fct-rga/isRegulatedBy
   :fibo-fbc-fct-usjrga/CaliforniaBankingRegulator,
   :fibo-fbc-fct-usjrga/hasPrimaryFederalRegulator
   :fibo-fbc-fct-usjrga/FederalDepositInsurerAndRegulator,
   :rdf/type #{:fibo-fbc-fct-usfse/StateCharteredBank :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Pinnacle Bank",
   :skos/definition "state-chartered bank functional entity for Pinnacle Bank"})

(def PinnacleBank-US-CA
  {:db/ident :fibo-fbc-fct-usind/PinnacleBank-US-CA,
   :fibo-be-le-cb/isIncorporatedIn
   :fibo-be-ge-usj/StateOfCaliforniaJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/PinnacleBankHeadquartersAddress,
   :fibo-be-le-lei/hasLegalAddress :fibo-fbc-fct-usind/PinnacleBankLegalAddress,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "https://pinnacle.bank/"},
   :fibo-fnd-rel-rel/hasLegalName "Pinnacle Bank",
   :rdf/type #{:fibo-be-le-cb/StockCorporation :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Pinnacle Bank US-CA",
   :skos/definition
   "stock corporation legal entity for Pinnacle Bank, a California Corporation"})

(def PinnacleBankBusinessEntityIdentifier
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/CaliforniaBusinessRegistrationIdentifierScheme,
   :cmns-id/identifies :fibo-fbc-fct-usind/PinnacleBank-US-CA,
   :db/ident :fibo-fbc-fct-usind/PinnacleBankBusinessEntityIdentifier,
   :fibo-fbc-fct-breg/hasEntityStatus :fibo-fbc-fct-breg/ActiveStatus,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/CaliforniaBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "C2859719",
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfCaliforniaJurisdiction,
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier
               :fibo-fbc-fct-ra/RegistryIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Pinnacle Bank business entity identifier",
   :skos/definition
   "registration identifier assigned by the California Division of Corporations for Pinnacle Bank"})

(def PinnacleBankCaliforniaCertificateOfAuthority
  {:cmns-cxtdsg/appliesTo :fibo-fbc-fct-usind/PinnacleBank,
   :db/ident :fibo-fbc-fct-usind/PinnacleBankCaliforniaCertificateOfAuthority,
   :fibo-fnd-rel-rel/isIssuedBy :fibo-fbc-fct-usjrga/CaliforniaBankingRegulator,
   :rdf/type #{:owl/NamedIndividual :fibo-fbc-fct-rga/GovernmentIssuedLicense},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Pinnacle Bank California Certificate of Authority",
   :skos/definition
   "certificate issued by the California Department of Business Oversight, California's primary regulator of financial service providers and products, for Pinnacle Bank"})

(def PinnacleBankCaliforniaCertificateOfAuthorityIdentifier
  {:cmns-id/identifies
   :fibo-fbc-fct-usind/PinnacleBankCaliforniaCertificateOfAuthority,
   :db/ident
   :fibo-fbc-fct-usind/PinnacleBankCaliforniaCertificateOfAuthorityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredBy
   :fibo-fbc-fct-usjrga/CaliforniaBankingRegulator,
   :fibo-fnd-rel-rel/hasTag "2261",
   :rdf/type #{:fibo-fnd-law-lcap/LicenseIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Pinnacle Bank California Certificate of Authority identifier",
   :skos/definition
   "registration identifier assigned by the California Department of Business Oversight for the California Certificate of Authority (banking license) for Pinnacle Bank"})

(def PinnacleBankDateOfRegistration
  {:cmns-dt/hasDateValue "2006-03-20",
   :db/ident :fibo-fbc-fct-usind/PinnacleBankDateOfRegistration,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Pinnacle Bank date of registration",
   :skos/definition
   "date that Pinnacle Bank was first registered as a stock corporation in the State of California"})

(def PinnacleBankFDICCertificateNumber
  {:cmns-id/identifies :fibo-fbc-fct-usind/PinnacleBank,
   :db/ident :fibo-fbc-fct-usind/PinnacleBankFDICCertificateNumber,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/FDICInstitutionDirectory,
   :fibo-fnd-rel-rel/hasTag "58297",
   :rdf/type #{:fibo-fbc-fct-usjrga/FDICCertificateNumber :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Pinnacle Bank FDIC Certificate",
   :skos/definition "FDIC Certificate number for Pinnacle Bank"})

(def PinnacleBankHeadquartersAddress
  {:db/ident :fibo-fbc-fct-usind/PinnacleBankHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "7597 Monterey Street",
   :fibo-fnd-plc-adr/hasPostalCode "95020",
   :fibo-fnd-plc-loc/hasCityName "Gilroy",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/California,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Pinnacle Bank headquarters address",
   :skos/definition
   "registration address identified as the headquarters address for Pinnacle Bank"})

(def PinnacleBankLegalAddress
  {:db/ident :fibo-fbc-fct-usind/PinnacleBankLegalAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "18181 Butterfield Blvd. STE 135",
   :fibo-fnd-plc-adr/hasPostalCode "95037-8101",
   :fibo-fnd-plc-loc/hasCityName "Morgan Hill",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/California,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual
               :fibo-fnd-plc-adr/ConventionalStreetAddress},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Pinnacle Bank legal address",
   :skos/definition
   "registration address identified as the legal address for Pinnacle Bank"})

(def PinnacleBankRSSDIdentifier
  {:cmns-id/identifies :fibo-fbc-fct-usind/PinnacleBank,
   :db/ident :fibo-fbc-fct-usind/PinnacleBankRSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "3455227",
   :rdf/type
   #{:owl/NamedIndividual
     :fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Pinnacle Bank RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to Pinnacle Bank"})

(def PinnacleBankRTN
  {:cmns-id/identifies :fibo-fbc-fct-usind/PinnacleBank,
   :db/ident :fibo-fbc-fct-usind/PinnacleBankRTN,
   :fibo-fnd-rel-rel/hasTag "121144340",
   :rdf/type #{:fibo-fbc-fct-usjrga/RoutingTransitNumber :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Pinnacle Bank RTN",
   :skos/definition "routing transit number (RTN) for Pinnacle Bank"})

(def StateStreetBankAndTrustCompany
  {:cmns-rlcmp/isPlayedBy
   :fibo-fbc-fct-usind/StateStreetBankAndTrustCompany-US-MA,
   :db/ident :fibo-fbc-fct-usind/StateStreetBankAndTrustCompany,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyDateEstablished,
   :fibo-fbc-fct-fse/hasDateInsured
   :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyDateInsured,
   :rdf/type #{:fibo-fbc-fct-usjrga/StateMemberBank :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "State Street Bank and Trust",
   :skos/definition
   "Federal Reserve state-chartered member bank functional entity for the State Street Bank and Trust, based in Boston, Massachusetts"})

(def StateStreetBankAndTrustCompany-US-MA
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
   #{"State Street Trust Company" "Second Bank - State Street Trust Company"},
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationTrustCompany,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-rel-rel/hasLegalName "State Street Bank And Trust Company",
   :rdf/type #{:fibo-be-tr-tr/Trust :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "State Street Bank and Trust Company US-MA",
   :skos/definition
   "trust legal entity for the State Street Bank and Trust Company, a Massachusetts Trust Company headquartered in Boston"})

(def StateStreetBankAndTrustCompanyBusinessEntityIdentifier
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
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "State Street Bank and Trust Company business entity identifier",
   :skos/definition
   "registration identifier assigned by the Massachusetts Corporations Division for State Street Bank and Trust Company"})

(def StateStreetBankAndTrustCompanyBusinessIdentifierCode
  {:cmns-col/comprises
   #{:lcc-3166-1/US
     :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyBusinessPartySuffix
     :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyBusinessPartyPrefix},
   :cmns-cxtdsg/appliesTo :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-id/identifies :fibo-fbc-fct-usind/StateStreetBankAndTrustCompany-US-MA,
   :db/ident
   :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyBusinessIdentifierCode,
   :fibo-fnd-rel-rel/hasTag "SBOSUS33XXX",
   :rdf/type #{:fibo-fbc-fct-fse/BusinessIdentifierCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label
   "State Street Bank and Trust Company - business identifier code (BIC)",
   :skos/definition
   "business identifier code (BIC) for State Street Bank and Trust Company"})

(def StateStreetBankAndTrustCompanyBusinessPartyPrefix
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyBusinessIdentifierCode,
   :db/ident
   :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyBusinessPartyPrefix,
   :fibo-fnd-rel-rel/hasTag "SBOS",
   :rdf/type #{:fibo-fbc-fct-fse/BusinessPartyPrefix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "State Street Bank and Trust Company business party prefix",
   :skos/definition
   "business party prefix for State Street Bank and Trust Company"})

(def StateStreetBankAndTrustCompanyBusinessPartySuffix
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyBusinessIdentifierCode,
   :db/ident
   :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyBusinessPartySuffix,
   :fibo-fnd-rel-rel/hasTag "33",
   :rdf/type #{:fibo-fbc-fct-fse/BusinessPartySuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "State Street Bank and Trust Company business party suffix",
   :skos/definition
   "business party suffix for State Street Bank and Trust Company"})

(def StateStreetBankAndTrustCompanyDateEstablished
  {:cmns-dt/hasDateValue "1892-12-31",
   :db/ident :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyDateEstablished,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "State Street Bank and Trust Company date established",
   :skos/definition
   "date that State Street Bank and Trust (originally Second Bank - State Street Trust Company) was established as a state member bank with the FRS"})

(def StateStreetBankAndTrustCompanyDateInsured
  {:cmns-dt/hasDateValue "1934-01-01",
   :db/ident :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyDateInsured,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "State Street Bank and Trust Company date insured",
   :skos/definition
   "date that State Street Bank and Trust Company was initially insured with respect to deposit insurance by the FDIC"})

(def StateStreetBankAndTrustCompanyFDICCertificateNumber
  {:cmns-id/identifies :fibo-fbc-fct-usind/StateStreetBankAndTrustCompany,
   :db/ident
   :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyFDICCertificateNumber,
   :fibo-fnd-rel-rel/hasTag "14",
   :rdf/type #{:fibo-fbc-fct-usjrga/FDICCertificateNumber :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "State Street Bank and Trust Company FDIC Certificate number",
   :skos/definition
   "FDIC Certificate number for State Street Bank and Trust Company"})

(def StateStreetBankAndTrustCompanyLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-571474TGEMMWANRLN572-LEI"},
   :db/ident
   :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T15:51:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-10-22T15:33:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-08-26T18:01:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label
   "State Street Bank and Trust Company legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for State Street Bank and Trust Company"})

(def StateStreetBankAndTrustCompanyRSSDIdentifier
  {:cmns-id/identifies :fibo-fbc-fct-usind/StateStreetBankAndTrustCompany,
   :db/ident :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyRSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "35301",
   :rdf/type
   #{:owl/NamedIndividual
     :fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "State Street Bank and Trust Company RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to State Street Bank and Trust Company"})

(def StateStreetBankAndTrustCompanyRTN
  {:cmns-id/identifies :fibo-fbc-fct-usind/StateStreetBankAndTrustCompany,
   :db/ident :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyRTN,
   :fibo-fnd-rel-rel/hasTag "011000028",
   :rdf/type #{:fibo-fbc-fct-usjrga/RoutingTransitNumber :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "State Street Bank and Trust Company RTN",
   :skos/definition
   "routing transit number (RTN) for State Street Bank and Trust Company"})

(def StateStreetBankAndTrustCompanyRegistrationDate
  {:cmns-dt/hasDateValue "1891-04-14",
   :db/ident :fibo-fbc-fct-usind/StateStreetBankAndTrustCompanyRegistrationDate,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "State Street Bank and Trust Company registration date",
   :skos/definition
   "date that State Street Bank and Trust Company was first registered as a trust company in the State of Massachusetts"})

(def StateStreetCorporation
  {:cmns-rlcmp/isPlayedBy :fibo-fbc-fct-usind/StateStreetCorporation-US-MA,
   :db/ident :fibo-fbc-fct-usind/StateStreetCorporation,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-usfse/FinancialHoldingCompany},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "State Street Corporation",
   :skos/definition
   "financial holding company functional entity for the State Street Corporation"})

(def StateStreetCorporation-US-MA
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
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI
                                 "http://www.statestreet.com/home.html"},
   :fibo-fnd-rel-rel/hasLegalName "State Street Corporation",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-cb/ForProfitCorporation
               :fibo-be-corp-corp/PubliclyHeldCompany},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "State Street Corporation US-MA",
   :skos/definition
   "publicly held company and for profit corporation legal entity for State Street Corporation"})

(def StateStreetCorporationBusinessEntityIdentifier
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
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "State Street Corporation business entity identifier",
   :skos/definition
   "registration identifier assigned by the Massachusetts Corporations Division for State Street Corporation"})

(def StateStreetCorporationHeadquartersAddress
  {:db/ident :fibo-fbc-fct-usind/StateStreetCorporationHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "One Lincoln Street",
   :fibo-fnd-plc-adr/hasPostalCode "02111",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Boston,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/Massachusetts,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "State Street Corporation headquarters address",
   :skos/definition
   "registration address identified as the headquarters address for State Street Corporation"})

(def StateStreetCorporationIncorporationDate
  {:cmns-dt/hasDateValue "1969-10-16",
   :db/ident :fibo-fbc-fct-usind/StateStreetCorporationIncorporationDate,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "State Street Corporation incorporation date",
   :skos/definition
   "date that State Street Corporation was first registered as a corporation in the State of Delaware"})

(def StateStreetCorporationLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-549300ZFEEJ2IP5VME73-LEI"},
   :db/ident
   :fibo-fbc-fct-usind/StateStreetCorporationLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-12-11T21:45:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-09-06T15:31:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-08-26T18:01:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label
   "State Street Corporation legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for State Street Corporation"})

(def StateStreetCorporationRSSDIdentifier
  {:cmns-id/identifies :fibo-fbc-fct-usind/StateStreetCorporation,
   :db/ident :fibo-fbc-fct-usind/StateStreetCorporationRSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "1111435",
   :rdf/type
   #{:owl/NamedIndividual
     :fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "State Street Corporation RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to State Street Corporation"})

(def TheCoca-ColaCompanyBusinessIdentifierCode
  {:cmns-col/comprises
   #{:lcc-3166-1/US :fibo-fbc-fct-usind/TheCoca-ColaCompanyBusinessPartySuffix
     :fibo-fbc-fct-usind/TheCoca-ColaCompanyBusinessPartyPrefix},
   :cmns-cxtdsg/appliesTo :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-id/identifies :fibo-be-le-usee/TheCoca-ColaCompany-US-DE,
   :db/ident :fibo-fbc-fct-usind/TheCoca-ColaCompanyBusinessIdentifierCode,
   :fibo-fnd-rel-rel/hasTag "TCCCUS33XXX",
   :rdf/type #{:fibo-fbc-fct-fse/BusinessIdentifierCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "The Coca-Cola Company business identifier code (BIC)",
   :skos/definition "business identifier code (BIC) for The Coca-Cola Company"})

(def TheCoca-ColaCompanyBusinessPartyPrefix
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/TheCoca-ColaCompanyBusinessIdentifierCode,
   :db/ident :fibo-fbc-fct-usind/TheCoca-ColaCompanyBusinessPartyPrefix,
   :fibo-fnd-rel-rel/hasTag "TCCC",
   :rdf/type #{:fibo-fbc-fct-fse/BusinessPartyPrefix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "The Coca-Cola Company business party prefix",
   :skos/definition "business party prefix for The Coca-Cola Company"})

(def TheCoca-ColaCompanyBusinessPartySuffix
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/TheCoca-ColaCompanyBusinessIdentifierCode,
   :db/ident :fibo-fbc-fct-usind/TheCoca-ColaCompanyBusinessPartySuffix,
   :fibo-fnd-rel-rel/hasTag "33",
   :rdf/type #{:fibo-fbc-fct-fse/BusinessPartySuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "The Coca-Cola Company business party suffix",
   :skos/definition "business party suffix for The Coca-Cola Company"})

(def TheCoca-ColaCompanyCorporateAddress
  {:db/ident :fibo-fbc-fct-usind/TheCoca-ColaCompanyCorporateAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "One Coca-Cola Plaza",
   :fibo-fnd-plc-adr/hasPostalCode "30313",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Atlanta,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/Georgia,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "The Coca-Cola Company corporate address",
   :skos/definition "registration address for The Coca-Cola Company"})

(def TheCoca-ColaCompanyLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-UWJKFUJFZ02DKWI3RY53-LEI"},
   :db/ident
   :fibo-fbc-fct-usind/TheCoca-ColaCompanyLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-10-19T18:57:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-04-26T14:19:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-04-27T13:14:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "The Coca-Cola Company legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for The Coca-Cola Company"})

(def TheHomeDepotIncCorporateAddress
  {:db/ident :fibo-fbc-fct-usind/TheHomeDepotIncCorporateAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "2455 Paces Ferry Road",
   :fibo-fnd-plc-adr/hasPostalCode "30339",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Atlanta,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/Georgia,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "The Home Depot, Inc. corporate address",
   :skos/definition "registration address for The Home Depot, Inc."})

(def TheHomeDepotIncLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-QEKMOTMBBKA8I816DO57-LEI"},
   :db/ident
   :fibo-fbc-fct-usind/TheHomeDepotIncLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T15:51:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-09-28T21:32:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-09-02T16:53:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "The Home Depot, Inc. legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for The Home Depot, Inc."})

(def TheProctorAndGambleCompanyBusinessIdentifierCode
  {:cmns-col/comprises
   #{:lcc-3166-1/US
     :fibo-fbc-fct-usind/TheProctorAndGambleCompanyBusinessPartySuffix
     :fibo-fbc-fct-usind/TheProctorAndGambleCompanyBusinessPartyPrefix},
   :cmns-cxtdsg/appliesTo :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-id/identifies :fibo-be-le-usee/TheProctorAndGambleCompany-US-OH,
   :db/ident
   :fibo-fbc-fct-usind/TheProctorAndGambleCompanyBusinessIdentifierCode,
   :fibo-fnd-rel-rel/hasTag "PGGTUS33XXX",
   :rdf/type #{:fibo-fbc-fct-fse/BusinessIdentifierCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "The Proctor & Gamble Company business identifier code (BIC)",
   :skos/definition
   "business identifier code (BIC) for The Proctor & Gamble Company"})

(def TheProctorAndGambleCompanyBusinessPartyPrefix
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/TheProctorAndGambleCompanyBusinessIdentifierCode,
   :db/ident :fibo-fbc-fct-usind/TheProctorAndGambleCompanyBusinessPartyPrefix,
   :fibo-fnd-rel-rel/hasTag "PGGT",
   :rdf/type #{:fibo-fbc-fct-fse/BusinessPartyPrefix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "The Proctor & Gamble Company business party prefix",
   :skos/definition "business party prefix for The Proctor & Gamble Company"})

(def TheProctorAndGambleCompanyBusinessPartySuffix
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/TheProctorAndGambleCompanyBusinessIdentifierCode,
   :db/ident :fibo-fbc-fct-usind/TheProctorAndGambleCompanyBusinessPartySuffix,
   :fibo-fnd-rel-rel/hasTag "33",
   :rdf/type #{:fibo-fbc-fct-fse/BusinessPartySuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "The Proctor & Gamble Company business party suffix",
   :skos/definition "business party suffix for The Proctor & Gamble Company"})

(def TheProctorAndGambleCompanyCorporateAddress
  {:db/ident :fibo-fbc-fct-usind/TheProctorAndGambleCompanyCorporateAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "1 Procter & Gamble Plaza",
   :fibo-fnd-plc-adr/hasPostalCode "45202",
   :fibo-fnd-plc-loc/hasCityName "Cincinnati",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/Ohio,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "The Proctor & Gamble Company corporate address",
   :skos/definition "registration address for The Proctor & Gamble Company"})

(def TheProctorAndGambleCompanyDateEstablished
  {:cmns-dt/hasDateValue "1837-01-01",
   :db/ident :fibo-fbc-fct-usind/TheProctorAndGambleCompanyDateEstablished,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "The Proctor & Gamble Company date established",
   :skos/definition "date that The Proctor & Gamble was founded"})

(def TheProctorAndGambleCompanyLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-2572IBTT8CCZW6AU4141-LEI"},
   :db/ident
   :fibo-fbc-fct-usind/TheProctorAndGambleCompanyLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-11-28T20:59:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-08-12T15:32:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-08-02T07:54:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label
   "The Proctor & Gamble Company legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for The Proctor & Gamble Company"})

(def WFCHoldingsLLC
  {:cmns-rlcmp/isPlayedBy :fibo-fbc-fct-usind/WFCHoldingsLLC-US-DE,
   :db/ident :fibo-fbc-fct-usind/WFCHoldingsLLC,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-usfse/FinancialHoldingCompany},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "WFC Holdings, LLC",
   :skos/definition
   "financial holding company functional entity for WFC Holdings, LLC"})

(def WFCHoldingsLLC-US-DE
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
   :rdf/type #{:fibo-be-plc-plc/PrivateCompanyWithLimitedLiability
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "WFC Holdings, LLC US-DE",
   :skos/definition
   "private company with limited liability legal entity for WFC Holdings, LLC legal entity, a Delaware Limited Liability Corporation"})

(def WFCHoldingsLLCBusinessEntityIdentifier
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/DelawareBusinessRegistrationIdentifierScheme,
   :cmns-id/identifies :fibo-fbc-fct-usind/WFCHoldingsLLC-US-DE,
   :db/ident :fibo-fbc-fct-usind/WFCHoldingsLLCBusinessEntityIdentifier,
   :fibo-fbc-fct-breg/hasEntityStatus :fibo-fbc-fct-breg/ActiveStatus,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "2939552",
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "WFC Holdings, LLC business entity identifier",
   :skos/definition
   "registration identifier assigned by the Delaware Department of Corporations for WFC Holdings, LLC"})

(def WFCHoldingsLLCHeadquartersAddress
  {:db/ident :fibo-fbc-fct-usind/WFCHoldingsLLCHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "45 Fremont Street",
   :fibo-fnd-plc-adr/hasPostalCode "94105",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/San_Francisco,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/California,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "WFC Holdings, LLC headquarters address",
   :skos/definition
   "registration address identified as the headquarters address for WFC Holdings, LLC"})

(def WFCHoldingsLLCIncorporationDate
  {:cmns-dt/hasDateValue "1998-09-09",
   :db/ident :fibo-fbc-fct-usind/WFCHoldingsLLCIncorporationDate,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "WFC Holdings, LLC incorporation date",
   :skos/definition
   "date that WFC Holdings, LLC was first registered as a corporation in the State of Delaware"})

(def WFCHoldingsLLCLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-OT19FZZ6Z7A27CCLDY33-LEI"},
   :db/ident
   :fibo-fbc-fct-usind/WFCHoldingsLLCLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T15:51:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-10-06T19:01:53.589-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-10-24T00:30:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelPartiallyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "WFC Holdings, LLC legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for WFC Holdings, LLC"})

(def WFCHoldingsLLCOwnership
  {:db/ident :fibo-fbc-fct-usind/WFCHoldingsLLCOwnership,
   :fibo-be-le-lei/hasOwnershipPercentage 100,
   :fibo-be-oac-opty/hasOwnedEntity :fibo-fbc-fct-usind/WFCHoldingsLLC-US-DE,
   :fibo-be-oac-opty/hasOwningEntity
   :fibo-fbc-fct-usind/WellsFargoAndCompany-US-DE,
   :fibo-fnd-agr-ctr/isQualifiedBy
   :fibo-be-le-lei/GenerallyAcceptedAccountingPrinciples,
   :rdf/type #{:owl/NamedIndividual :fibo-be-oac-opty/DirectConsolidation},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "WFC Holdings, LLC ownership",
   :skos/definition
   "entity ownership context for WFC Holdings, LLC, a wholly-owned subsidiary of Wells Fargo & Company"})

(def WellsFargoAndCompany
  {:cmns-rlcmp/isPlayedBy :fibo-fbc-fct-usind/WellsFargoAndCompany-US-DE,
   :db/ident :fibo-fbc-fct-usind/WellsFargoAndCompany,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-usfse/FinancialHoldingCompany},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Wells Fargo & Company",
   :skos/definition
   "financial holding company functional entity for Wells Fargo & Company"})

(def WellsFargoAndCompany-US-DE
  {:db/ident :fibo-fbc-fct-usind/WellsFargoAndCompany-US-DE,
   :fibo-be-corp-corp/hasDateOfIncorporation
   :fibo-fbc-fct-usind/WellsFargoAndCompanyIncorporationDate,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usind/WellsFargoAndCompanyHeadquartersAddress,
   :fibo-be-oac-cctl/hasSubsidiary :fibo-fbc-fct-usind/WFCHoldingsLLC,
   :fibo-fbc-fct-breg/hasPriorLegalName #{"Northwest Bancorporation"
                                          "Norwest Corporation"},
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationTrustCompany,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-rel-rel/hasLegalName "Wells Fargo & Company",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-cb/ForProfitCorporation
               :fibo-be-corp-corp/PubliclyHeldCompany},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Wells Fargo & Company US-DE",
   :skos/definition
   "publicly held company and for profit corporation legal entity for Wells Fargo & Company, a Delaware Corporation"})

(def WellsFargoAndCompanyBusinessEntityIdentifier
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/DelawareBusinessRegistrationIdentifierScheme,
   :cmns-id/identifies :fibo-fbc-fct-usind/WellsFargoAndCompany-US-DE,
   :db/ident :fibo-fbc-fct-usind/WellsFargoAndCompanyBusinessEntityIdentifier,
   :fibo-fbc-fct-breg/hasEntityStatus :fibo-fbc-fct-breg/ActiveStatus,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "637901",
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Wells Fargo & Company business entity identifier",
   :skos/definition
   "registration identifier assigned by the Delaware Department of Corporations for Wells Fargo & Company"})

(def WellsFargoAndCompanyHeadquartersAddress
  {:db/ident :fibo-fbc-fct-usind/WellsFargoAndCompanyHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "420 Montgomery Street",
   :fibo-fnd-plc-adr/hasPostalCode "94104",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/San_Francisco,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/California,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Wells Fargo & Company headquarters address",
   :skos/definition
   "registration address identified as the headquarters address for Wells Fargo & Company"})

(def WellsFargoAndCompanyIncorporationDate
  {:cmns-av/explanatoryNote
   "Note that one of its predecessor companies was registered was first registered in Delaware in 1929, and the bank itself was founded in 1870.",
   :cmns-dt/hasDateValue "1966-03-02",
   :db/ident :fibo-fbc-fct-usind/WellsFargoAndCompanyIncorporationDate,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Wells Fargo & Company incorporation date",
   :skos/definition
   "date that Wells Fargo & Company was first registered as a corporation in the State of Delaware"})

(def WellsFargoAndCompanyLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-PBLD0EJDB5FWOLXP3B76-LEI"},
   :db/ident
   :fibo-fbc-fct-usind/WellsFargoAndCompanyLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T15:52:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-10-06T19:01:52.884-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-10-11T00:31:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelPartiallyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Wells Fargo & Company legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for Wells Fargo & Company"})

(def WellsFargoAndCompanyRSSDIdentifier
  {:cmns-id/identifies :fibo-fbc-fct-usind/WellsFargoAndCompany,
   :db/ident :fibo-fbc-fct-usind/WellsFargoAndCompanyRSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "1120754",
   :rdf/type
   #{:owl/NamedIndividual
     :fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Wells Fargo & Company RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to Wells Fargo & Company"})

(def WellsFargoBankNationalAssociation
  {:cmns-rlcmp/isPlayedBy
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociation-US,
   :db/ident :fibo-fbc-fct-usind/WellsFargoBankNationalAssociation,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationDateEstablished,
   :fibo-fbc-fct-fse/hasDateInsured
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationDateInsured,
   :fibo-fbc-fct-usjrga/hasSecondaryFederalRegulator
   :fibo-fbc-fct-usjrga/ConsumerFinanceRegulator,
   :rdf/type #{:owl/NamedIndividual :fibo-fbc-fct-usfse/NationalBank},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Wells Fargo Bank, National Association",
   :skos/definition
   "national bank functional entity for Wells Fargo Bank, National Association"})

(def WellsFargoBankNationalAssociation-US
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
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-lp/BusinessEntity},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Wells Fargo Bank, National Association, US",
   :skos/definition
   "business entity for the Wells Fargo Bank, National Association, a national banking entity established under the National Banking Act of 1864"})

(def WellsFargoBankNationalAssociationBusinessIdentifierCode
  {:cmns-col/comprises
   #{:lcc-3166-1/US
     :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationBusinessPartyPrefix
     :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationBusinessPartySuffix},
   :cmns-cxtdsg/appliesTo :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-id/identifies :fibo-fbc-fct-usind/WellsFargoBankNationalAssociation-US,
   :db/ident
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationBusinessIdentifierCode,
   :fibo-fnd-rel-rel/hasTag "WFBIUS6SXXX",
   :rdf/type #{:fibo-fbc-fct-fse/BusinessIdentifierCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label
   "Wells Fargo Bank, National Association - business identifier code (BIC)",
   :skos/definition
   "business identifier code (BIC) for Wells Fargo Bank, National Association"})

(def WellsFargoBankNationalAssociationBusinessPartyPrefix
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationBusinessIdentifierCode,
   :db/ident
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationBusinessPartyPrefix,
   :fibo-fnd-rel-rel/hasTag "WFBI",
   :rdf/type #{:fibo-fbc-fct-fse/BusinessPartyPrefix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Wells Fargo Bank, National Association business party prefix",
   :skos/definition
   "business party prefix for Wells Fargo Bank, National Association"})

(def WellsFargoBankNationalAssociationBusinessPartySuffix
  {:cmns-col/isIncludedIn
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationBusinessIdentifierCode,
   :db/ident
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationBusinessPartySuffix,
   :fibo-fnd-rel-rel/hasTag "6S",
   :rdf/type #{:fibo-fbc-fct-fse/BusinessPartySuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Wells Fargo Bank, National Association business party suffix",
   :skos/definition
   "business party suffix for Wells Fargo Bank, National Association"})

(def WellsFargoBankNationalAssociationDateEstablished
  {:cmns-dt/hasDateValue "1870-01-01",
   :db/ident
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationDateEstablished,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Wells Fargo Bank, National Association date established",
   :skos/definition
   "date that Wells Fargo Bank, National Association was established under the National Banking Act of 1863"})

(def WellsFargoBankNationalAssociationDateInsured
  {:cmns-dt/hasDateValue "1934-01-01",
   :db/ident :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationDateInsured,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Wells Fargo Bank, National Association date insured",
   :skos/definition
   "date that Wells Fargo Bank, National Association was initially insured with respect to deposit insurance by the FDIC"})

(def WellsFargoBankNationalAssociationFDICCertificateNumber
  {:cmns-id/identifies :fibo-fbc-fct-usind/WellsFargoBankNationalAssociation,
   :db/ident
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationFDICCertificateNumber,
   :fibo-fnd-rel-rel/hasTag "3511",
   :rdf/type #{:fibo-fbc-fct-usjrga/FDICCertificateNumber :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Wells Fargo Bank, National Association FDIC Certificate number",
   :skos/definition
   "FDIC Certificate number for Wells Fargo Bank, National Association"})

(def WellsFargoBankNationalAssociationHeadquartersAddress
  {:db/ident
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "301 South College Street",
   :fibo-fnd-plc-adr/hasPostalCode "28202",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Charlotte,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/NorthCarolina,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Wells Fargo Bank, National Association headquarters address",
   :skos/definition
   "registration address identified as the headquarters address for Wells Fargo Bank, National Association"})

(def WellsFargoBankNationalAssociationLegalAddress
  {:db/ident :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationLegalAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "101 North Phillips Avenue",
   :fibo-fnd-plc-adr/hasPostalCode "57104",
   :fibo-fnd-plc-loc/hasCityName "Sioux Falls",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/SouthDakota,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Wells Fargo Bank, National Association legal address",
   :skos/definition
   "registration address identified as the legal address for Wells Fargo Bank, National Association"})

(def WellsFargoBankNationalAssociationLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-KB1H1DSPRFMYMCUFXT09-LEI"},
   :db/ident
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T15:53:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-08-18T14:04:54.256-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-08-27T20:07:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label
   "Wells Fargo Bank, National Association legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for Wells Fargo Bank, National Association"})

(def WellsFargoBankNationalAssociationOwnership
  {:db/ident :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationOwnership,
   :fibo-be-le-lei/hasOwnershipPercentage 97.9M,
   :fibo-be-oac-opty/hasOwnedEntity
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociation-US,
   :fibo-be-oac-opty/hasOwningEntity :fibo-fbc-fct-usind/WFCHoldingsLLC-US-DE,
   :fibo-fnd-agr-ctr/isQualifiedBy
   :fibo-be-le-lei/GenerallyAcceptedAccountingPrinciples,
   :rdf/type #{:owl/NamedIndividual :fibo-be-oac-opty/DirectConsolidation},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Wells Fargo Bank, National Association ownership",
   :skos/definition
   "entity ownership context for Wells Fargo Bank, National Association, a subsidiary of WFC Holdings, LLC"})

(def WellsFargoBankNationalAssociationRSSDIdentifier
  {:cmns-id/identifies :fibo-fbc-fct-usind/WellsFargoBankNationalAssociation,
   :db/ident
   :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationRSSDIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-rel-rel/hasTag "451965",
   :rdf/type
   #{:owl/NamedIndividual
     :fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Wells Fargo Bank, National Association RSSD identifier",
   :skos/definition
   "research statistics supervision discount identifier (RSSD ID), assigned by the Federal Reserve to Wells Fargo Bank, National Association"})

(def WellsFargoBankNationalAssociationRTN
  {:cmns-id/identifies :fibo-fbc-fct-usind/WellsFargoBankNationalAssociation,
   :db/ident :fibo-fbc-fct-usind/WellsFargoBankNationalAssociationRTN,
   :fibo-fnd-rel-rel/hasTag "121000248",
   :rdf/type #{:fibo-fbc-fct-usjrga/RoutingTransitNumber :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdfs/label "Wells Fargo Bank, National Association RTN",
   :skos/definition
   "routing transit number (RTN) for Wells Fargo Bank, National Association"})

(def urn:uuid:979b603c-5755-540b-b090-be69f9547b2b
  {:cmns-id/identifies :fibo-fbc-fct-usind/JPMorganChaseAndCo-US-DE,
   :fibo-fnd-rel-rel/hasTag "8I5DZWZKVSZI1NUHU748",
   :rdf/type           #{:owl/NamedIndividual
                         :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label         "JPMorgan Chase & Co. legal entity identifier",
   :skos/definition    "legal entity identifier for JPMorgan Chase & Co.",
   :xsd/anyURI         "https://rdf.gleif.org/L1/L-8I5DZWZKVSZI1NUHU748-LEI"})

(def urn:uuid:f184b115-20f4-5171-ae90-1b4474b14a13
  {:cmns-id/identifies
   :fibo-fbc-fct-usind/JPMorganChaseBankNationalAssociation-US-OH,
   :fibo-fnd-rel-rel/hasTag "7H6GLXDRUGQFU57RNE97",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label
   "JPMorgan Chase Bank, National Association legal entity identifier",
   :skos/definition
   "legal entity identifier for JPMorgan Chase Bank, National Association",
   :xsd/anyURI "https://rdf.gleif.org/L1/L-7H6GLXDRUGQFU57RNE97-LEI"})

(def urn:uuid:8f91109e-cd1b-5a68-8970-26c92239d98d
  {:cmns-id/identifies :fibo-fbc-fct-usind/FMRLLC-US-DE,
   :fibo-fnd-rel-rel/hasTag "6X064LF7Y6B4DKF2GZ26",
   :rdf/type           #{:owl/NamedIndividual
                         :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label         "FMR LLC legal entity identifier",
   :skos/definition    "legal entity identifier for FMR LLC",
   :xsd/anyURI         "https://rdf.gleif.org/L1/L-6X064LF7Y6B4DKF2GZ26-LEI"})

(def urn:uuid:59aca0d8-8e25-5c2a-a027-8d3a4b2d050e
  {:cmns-av/copyright #{"Copyright (c) 2015-2024 Object Management Group, Inc."
                        "Copyright (c) 2015-2024 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology includes example individuals for US national banks, state chartered banks, and other institutions, as well as details related to some of the larger corporations that issue stock and are represented in the Dow Jones Industrial Average and S&P 500.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Places/Addresses/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/CorporateControl/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/LegalCapacity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/Trusts/Trusts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/RegulatoryAgencies/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/OwnershipParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/BusinessCentersIndividuals/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/ControlParties/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/BusinessRegistries/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/Corporations/Corporations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Places/VirtualPlaces/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/CorporateBodies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/Markets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "US Example Individuals",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals.rdf version of this ontology was revised to update the LEI URIs to the new form published by the GLEIF on data.world."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals.rdf version of this ontology was revised to improve the representation of some of the LEI data and fix spelling errors."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/USJurisdiction/USExampleIndividuals.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FBC 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals.rdf version of this ontology was revised to make incorporation and registration dates explicit and to replace references to the legacy LCC UnitedStates country representation with UnitedStatesOfAmerica."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/USJurisdiction/USExampleIndividuals.rdf version of this ontology was modified to reflect revisions to the GLEIF LEI representation for validation level and entity ownership relations."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/USJurisdiction/USExampleIndividuals.rdf version of this ontology was modified per the FIBO 2.0 RFC."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/USJurisdiction/USExampleIndividuals.rdf version of this ontology was modified to add information about the example corporations included in FIBO use cases for securities instrument data and various indices such as the DJIA, update LEI records generally, eliminate duplication of concepts in LCC, simplify addresses, and merge countries with locations in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/"})

(def urn:uuid:f3916383-f1b1-58e0-8162-ce42d6800c0f
  {:cmns-id/identifies :fibo-fbc-fct-usind/WFCHoldingsLLC-US-DE,
   :fibo-fbc-fct-ra/isRegisteredBy
   :fibo-fbc-fct-usfsind/BloombergFinanceLPAsLocalOperatingUnit,
   :fibo-fnd-rel-rel/hasTag "OT19FZZ6Z7A27CCLDY33",
   :rdf/type           #{:owl/NamedIndividual
                         :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label         "WFC Holdings, LLC legal entity identifier",
   :skos/definition    "legal entity identifier for WFC Holdings, LLC",
   :xsd/anyURI         "https://rdf.gleif.org/L1/L-OT19FZZ6Z7A27CCLDY33-LEI"})

(def urn:uuid:829ee2b3-1a25-5d60-8422-16eefe0b77f1
  {:cmns-id/identifies :fibo-fbc-fct-usind/CitibankNA-US-DE,
   :fibo-fnd-rel-rel/hasTag "E57ODZWZ7FF32TWEFA76",
   :rdf/type           #{:owl/NamedIndividual
                         :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label         "Citibank, N.A. legal entity identifier",
   :skos/definition    "legal entity identifier for Citibank N.A.",
   :xsd/anyURI         "https://rdf.gleif.org/L1/L-E57ODZWZ7FF32TWEFA76-LEI"})

(def urn:uuid:afe11464-850f-5ac9-8503-f6809135bc65
  {:cmns-id/identifies :fibo-fbc-fct-usind/WellsFargoBankNationalAssociation-US,
   :fibo-fbc-fct-ra/isRegisteredBy
   :fibo-fbc-fct-usfsind/BloombergFinanceLPAsLocalOperatingUnit,
   :fibo-fnd-rel-rel/hasTag "KB1H1DSPRFMYMCUFXT09",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label "Wells Fargo Bank, National Association legal entity identifier",
   :skos/definition
   "legal entity identifier for Wells Fargo Bank, National Association",
   :xsd/anyURI "https://rdf.gleif.org/L1/L-KB1H1DSPRFMYMCUFXT09-LEI"})

(def urn:uuid:9ecd192a-66a2-538d-b65c-260d520b9f4b
  {:cmns-id/identifies :fibo-fbc-fct-usind/StateStreetCorporation-US-MA,
   :fibo-fnd-rel-rel/hasTag "549300ZFEEJ2IP5VME73",
   :rdf/type           #{:owl/NamedIndividual
                         :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label         "State Street Corporation legal entity identifier",
   :skos/definition    "legal entity identifier for State Street Corporation",
   :xsd/anyURI         "https://rdf.gleif.org/L1/L-549300ZFEEJ2IP5VME73-LEI"})

(def urn:uuid:185bfb83-5845-59ee-bd39-44e850953919
  {:cmns-id/identifies :fibo-fbc-fct-usind/CiticorpLLC-US-DE,
   :fibo-fnd-rel-rel/hasTag "549300PSHWOM1D1JVL23",
   :rdf/type           #{:owl/NamedIndividual
                         :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label         "Citicorp LLC legal entity identifier",
   :skos/definition    "legal entity identifier for Citicorp LLC",
   :xsd/anyURI         "https://rdf.gleif.org/L1/L-549300PSHWOM1D1JVL23-LEI"})

(def urn:uuid:7ff23bd5-3392-50ea-b191-c777db070763
  {:cmns-id/identifies :fibo-fbc-fct-usind/StateStreetBankAndTrustCompany-US-MA,
   :fibo-fnd-rel-rel/hasTag "571474TGEMMWANRLN572",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label "State Street Bank and Trust Company legal entity identifier",
   :skos/definition
   "legal entity identifier for State Street Bank and Trust Company",
   :xsd/anyURI "https://rdf.gleif.org/L1/L-571474TGEMMWANRLN572-LEI"})

(def urn:uuid:756a2a9a-8d28-5af4-9930-5b559a8960d7
  {:cmns-id/identifies :fibo-fbc-fct-usind/BankOfNewYorkMellonCorporation-US-DE,
   :fibo-fnd-rel-rel/hasTag "WFLLPEPC7FZXENRZV188",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label
   "The Bank of New York Mellon Corporation legal entity identifier",
   :skos/definition
   "legal entity identifier for The Bank of New York Mellon Corporation",
   :xsd/anyURI "https://rdf.gleif.org/L1/L-WFLLPEPC7FZXENRZV188-LEI"})

(def urn:uuid:86354699-e396-5e94-81e3-666c4442fa8d
  {:cmns-id/identifies :fibo-fbc-fct-usind/WellsFargoAndCompany-US-DE,
   :fibo-fnd-rel-rel/hasTag "PBLD0EJDB5FWOLXP3B76",
   :rdf/type           #{:owl/NamedIndividual
                         :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label         "Wells Fargo & Company legal entity identifier",
   :skos/definition    "legal entity identifier for Wells Fargo & Company",
   :xsd/anyURI         "https://rdf.gleif.org/L1/L-PBLD0EJDB5FWOLXP3B76-LEI"})

(def urn:uuid:d5a3b1fd-3132-53a9-917d-bf774d5a76d2
  {:cmns-id/identifies :fibo-fbc-fct-usind/BNYMellonNationalAssociation-US-DE,
   :fibo-fnd-rel-rel/hasTag "4EP6JBYBTPTQ47LZOB67",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label "BNY Mellon, National Association legal entity identifier",
   :skos/definition
   "legal entity identifier for BNY Mellon, National Association",
   :xsd/anyURI "https://rdf.gleif.org/L1/L-4EP6JBYBTPTQ47LZOB67-LEI"})

(def urn:uuid:79d8a9dc-89ed-5626-a083-b5e25d72b574
  {:cmns-id/identifies :fibo-fbc-fct-usind/CitigroupInc-US-DE,
   :fibo-fnd-rel-rel/hasTag "6SHGI4ZSSLCXXQSBB395",
   :rdf/type           #{:owl/NamedIndividual
                         :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label         "Citigroup Inc. legal entity identifier",
   :skos/definition    "legal entity identifier for Citigroup Inc.",
   :xsd/anyURI         "https://rdf.gleif.org/L1/L-6SHGI4ZSSLCXXQSBB395-LEI"})