(ns net.wikipunk.rdf.fibo-fbc-fct-usmkt
  "This ontology includes extended individuals (examples that are more complete) for a sampling of markets operating in the US corresponding to the ISO 10383 Codes for exchanges and market identification (MIC)."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :dcterms/abstract
   "This ontology includes extended individuals (examples that are more complete) for a sampling of markets operating in the US corresponding to the ISO 10383 Codes for exchanges and market identification (MIC).",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Arrangements/"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/FinancialServicesEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Corporations/Corporations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/Markets/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/BusinessRegistries/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/ControlParties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/VirtualPlaces/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/BusinessCentersIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/CorporateControl/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/MarketsIndividuals/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/FormalBusinessOrganizations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/CorporateBodies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-be-corp-corp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
    "fibo-be-ge-usj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/",
    "fibo-be-le-cb"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/",
    "fibo-be-le-fbo"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
    "fibo-be-oac-cctl"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/",
    "fibo-be-oac-cpty"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/",
    "fibo-be-plc-plc"
    "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/",
    "fibo-fbc-fct-bci"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
    "fibo-fbc-fct-breg"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
    "fibo-fbc-fct-fse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
    "fibo-fbc-fct-mkt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
    "fibo-fbc-fct-mkti"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/MarketsIndividuals/",
    "fibo-fbc-fct-ra"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
    "fibo-fbc-fct-usfsind"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
    "fibo-fbc-fct-usjrga"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/",
    "fibo-fbc-fct-usmkt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
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
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfa/prefix "fibo-fbc-fct-usmkt",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "US Markets and Exchanges Individuals",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/ version of this ontology was modified to support revisions of the MIC codes as of 11 January 2019, including the new URI strategy, and to move the registry definitions to a new international financial organizations ontology."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals.rdf version of this ontology was revised to replace references to the legacy LCC UnitedStates country representation with UnitedStatesOfAmerica."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/ version of this ontology was modified to eliminate duplication of concepts in LCC, to simplify addresses, and to merge countries with locations in FND."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals.rdf version of this ontology was revised to restructure the various markets individuals per the changes to the markets ontology and replace references to revised individuals in the markets individuals ontology where appropriate."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2018-2022 Object Management Group, Inc."
                  "Copyright (c) 2018-2022 EDM Council, Inc."],
   :sm/fileAbbreviation "fibo-fbc-fct-usmkt",
   :sm/filename "USMarketsAndExchangesIndividuals.rdf"})

(def CBOEGlobalMarketsBusinessEntityIdentifier
  "Delaware Division of Corporations business entity identifier for CBOE Global Markets, Inc."
  {:db/ident :fibo-fbc-fct-usmkt/CBOEGlobalMarketsBusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :lcc-lr/hasTag "4205301",
   :lcc-lr/identifies :fibo-fbc-fct-usmkt/CBOEGlobalMarketsInc-US-DE,
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "CBOE Global Markets, Inc. business entity identifier",
   :skos/definition
   "Delaware Division of Corporations business entity identifier for CBOE Global Markets, Inc."})

(def CBOEGlobalMarketsDateEstablished
  "date that CBOE Global Markets, Inc. was established per their registration with the Delaware Division of Corporations"
  {:db/ident :fibo-fbc-fct-usmkt/CBOEGlobalMarketsDateEstablished,
   :fibo-fnd-dt-fd/hasDateValue "2006-08-15",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "CBOE Global Markets date established",
   :skos/definition
   "date that CBOE Global Markets, Inc. was established per their registration with the Delaware Division of Corporations"})

(def CBOEGlobalMarketsHeadquartersAddress
  "the headquarters address for CBOE Global Markets, Inc."
  {:db/ident :fibo-fbc-fct-usmkt/CBOEGlobalMarketsHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "400 South LaSalle Street",
   :fibo-fnd-plc-adr/hasPostalCode "60605",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Chicago,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/Illinois,
   :rdf/type [:fibo-fnd-plc-adr/ConventionalStreetAddress :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "CBOE Global Markets headquarters address",
   :skos/definition "the headquarters address for CBOE Global Markets, Inc."})

(def CBOEGlobalMarketsInc-US-DE
  "the CBOE Global Markets, Inc. legal entity that is a Delaware corporation"
  {:db/ident :fibo-fbc-fct-usmkt/CBOEGlobalMarketsInc-US-DE,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usmkt/CBOEGlobalMarketsHeadquartersAddress,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usmkt/CBOEGlobalMarketsDateEstablished,
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationTrustCompany,
   :fibo-fnd-rel-rel/hasLegalName "CBOE Global Markets, Inc.",
   :rdf/type [:owl/NamedIndividual :fibo-be-le-cb/StockCorporation],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "CBOE Global Markets, Inc. US-DE",
   :rdfs/seeAlso "http://www.bloomberg.com/",
   :skos/definition
   "the CBOE Global Markets, Inc. legal entity that is a Delaware corporation"})

(def ChicagoBoardOptionsExchange
  "Chicago Board Options Exchange operating-level market founded in 1973 that is the world's largest options market with contracts focusing on individual equities, indexes, and interest rates"
  {:db/ident :fibo-fbc-fct-usmkt/ChicagoBoardOptionsExchange,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usmkt/ChicagoBoardOptionsExchangeDateEstablished,
   :fibo-fbc-fct-mkt/hasFacilityAcronym "CBOE",
   :fibo-fbc-fct-mkt/operatesInCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fbc-fct-mkt/operatesInMunicipality :fibo-fbc-fct-bci/Chicago,
   :fibo-fnd-plc-vrt/hasWebsite "https://www.cboe.com/",
   :fibo-fnd-rel-rel/hasFormalName "Chicago Board Options Exchange",
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-usmkt/ChicagoBoardOptionsExchangeAsServiceProvider,
   :owl/sameAs :fibo-fbc-fct-mkti/Facility-XCBO,
   :rdf/type [:owl/NamedIndividual :fibo-fbc-fct-mkt/OperatingLevelMarket],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "Chicago Board Options Exchange",
   :skos/definition
   "Chicago Board Options Exchange operating-level market founded in 1973 that is the world's largest options market with contracts focusing on individual equities, indexes, and interest rates"})

(def ChicagoBoardOptionsExchangeAsServiceProvider
  "Chicago Board Options Exchange (CBOE) in its role as a financial service provider and holding company, which is one of the world's largest exchange holding companies, offering cutting-edge trading and investment solutions to investors around the world. CBOE offers trading across a diverse range of products in multiple asset classes and geographies, including options, futures, U.S. and European equities, exchange-traded products (ETPs), global foreign exchange (FX), and multi-asset volatility products. Our trading venues include the largest options exchange in the U.S. and the largest stock exchange by value traded in Europe. In addition, the company is the second-largest stock exchange operator in the U.S. and a leading market globally for ETP trading."
  {:db/ident :fibo-fbc-fct-usmkt/ChicagoBoardOptionsExchangeAsServiceProvider,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usmkt/CBOEGlobalMarketsInc-US-DE,
   :owl/sameAs :fibo-fbc-fct-mkti/ServiceProvider-L-529900RLNSGA90UPEH54,
   :rdf/type [:owl/NamedIndividual
              :fibo-fbc-pas-fpas/FinancialServiceProvider
              :fibo-fbc-fct-fse/HoldingCompany
              :fibo-be-oac-cpty/EntityControllingParty
              :fibo-be-oac-cpty/DeJureControllingInterestParty],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "Chicago Board Options Exchange as service provider",
   :skos/definition
   "Chicago Board Options Exchange (CBOE) in its role as a financial service provider and holding company, which is one of the world's largest exchange holding companies, offering cutting-edge trading and investment solutions to investors around the world. CBOE offers trading across a diverse range of products in multiple asset classes and geographies, including options, futures, U.S. and European equities, exchange-traded products (ETPs), global foreign exchange (FX), and multi-asset volatility products. Our trading venues include the largest options exchange in the U.S. and the largest stock exchange by value traded in Europe. In addition, the company is the second-largest stock exchange operator in the U.S. and a leading market globally for ETP trading."})

(def ChicagoBoardOptionsExchangeDateEstablished
  "date that the Chicago Board Options Exchange was established"
  {:db/ident :fibo-fbc-fct-usmkt/ChicagoBoardOptionsExchangeDateEstablished,
   :fibo-fnd-dt-fd/hasDateValue "1973-04-26",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "Chicago Board Options Exchange date established",
   :skos/definition
   "date that the Chicago Board Options Exchange was established"})

(def IntercontinentalExchangeHoldings
  "Intercontinental Exchange holding company and financial service provider that owns exchanges for financial and commodity markets, and operates 23 regulated exchanges and marketplaces"
  {:db/ident :fibo-fbc-fct-usmkt/IntercontinentalExchangeHoldings,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usfsind/IntercontinentalExchangeInc-US-DE,
   :fibo-fnd-utl-av/abbreviation "ICE",
   :rdf/type [:fibo-fbc-pas-fpas/FinancialServiceProvider
              :fibo-fbc-fct-fse/HoldingCompany
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "Intercontinental Exchange Holdings",
   :rdfs/seeAlso "http://www.theice.com/",
   :skos/definition
   "Intercontinental Exchange holding company and financial service provider that owns exchanges for financial and commodity markets, and operates 23 regulated exchanges and marketplaces"})

(def NYSEAmericanOptions
  "NYSE (New York Stock Exchange) American Options segment-level market that is an options trading platform under the name AMEX options exchange which facilitates trading of the options on domestic stocks; American depository receipts; broad-based, industry sector, and international indexes; exchange traded funds; HOLDRS; LEAPS; and equity and index FLEX options"
  {:db/ident :fibo-fbc-fct-usmkt/NYSEAmericanOptions,
   :fibo-fbc-fct-breg/hasPriorLegalName ["NYSE Amex Options"
                                         "American Stock Exchange"],
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usmkt/NYSEAmericanOptionsDateEstablished,
   :fibo-fbc-fct-mkt/hasFacilityAcronym "NYSE",
   :fibo-fbc-fct-mkt/operatesInCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fbc-fct-mkt/operatesInMunicipality :fibo-fbc-fct-bci/New_York,
   :fibo-fnd-plc-vrt/hasWebsite "https://www.nyse.com/markets/american-options",
   :fibo-fnd-rel-rel/hasFormalName "NYSE American Options",
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-usmkt/NYSEAmericanOptionsAsServiceProvider,
   :lcc-cr/isPartOf :fibo-fbc-fct-usmkt/NewYorkStockExchange,
   :owl/sameAs :fibo-fbc-fct-mkti/Facility-AMXO,
   :rdf/type [:fibo-fbc-fct-mkt/MarketSegmentLevelMarket :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "NYSE American Options",
   :skos/definition
   "NYSE (New York Stock Exchange) American Options segment-level market that is an options trading platform under the name AMEX options exchange which facilitates trading of the options on domestic stocks; American depository receipts; broad-based, industry sector, and international indexes; exchange traded funds; HOLDRS; LEAPS; and equity and index FLEX options"})

(def NYSEAmericanOptionsAsServiceProvider
  "NYSE (New York Stock Exchange) American Options functional entity that operates an options trading platform under the name AMEX options exchange, facilitating trading of options on domestic stocks; American depository receipts; broad-based, industry sector, and international indexes; exchange traded funds; HOLDRS; LEAPS; and equity and index FLEX options"
  {:db/ident :fibo-fbc-fct-usmkt/NYSEAmericanOptionsAsServiceProvider,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usmkt/NYSEAmericanOptionsLLC-US-DE,
   :owl/sameAs :fibo-fbc-fct-mkti/ServiceProvider-NYSEAMEXOPTIONS,
   :rdf/type [:fibo-fbc-pas-fpas/FinancialServiceProvider :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "NYSE American Options as service provider",
   :skos/definition
   "NYSE (New York Stock Exchange) American Options functional entity that operates an options trading platform under the name AMEX options exchange, facilitating trading of options on domestic stocks; American depository receipts; broad-based, industry sector, and international indexes; exchange traded funds; HOLDRS; LEAPS; and equity and index FLEX options"})

(def NYSEAmericanOptionsBusinessEntityIdentifier
  "the Delaware Division of Corporations business entity identifier for NYSE American Options LLC"
  {:db/ident :fibo-fbc-fct-usmkt/NYSEAmericanOptionsBusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :lcc-lr/hasTag "4982468",
   :lcc-lr/identifies :fibo-fbc-fct-usmkt/NYSEAmericanOptionsLLC-US-DE,
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "NYSE American Options, LLC business entity identifier",
   :skos/definition
   "the Delaware Division of Corporations business entity identifier for NYSE American Options LLC"})

(def NYSEAmericanOptionsDateEstablished
  "date that NYSE American Options LLC was established"
  {:db/ident :fibo-fbc-fct-usmkt/NYSEAmericanOptionsDateEstablished,
   :fibo-fnd-dt-fd/hasDateValue "2011-05-13",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "NYSE American Options LLC date established",
   :skos/definition "date that NYSE American Options LLC was established"})

(def NYSEAmericanOptionsLLC-US-DE
  "the NYSE American Options LLC legal entity that is a Delaware limited liability company"
  {:db/ident :fibo-fbc-fct-usmkt/NYSEAmericanOptionsLLC-US-DE,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usmkt/NewYorkStockExchangeHeadquartersAddress,
   :fibo-be-oac-cctl/hasDomesticUltimateParent
   :fibo-fbc-fct-usfsind/IntercontinentalExchange,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usmkt/NYSEAmericanOptionsDateEstablished,
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usmkt/UnitedAgentGroup-Delaware,
   :fibo-fnd-rel-rel/hasLegalName "NYSE American Options LLC",
   :rdf/type [:fibo-be-plc-plc/PrivateCompanyWithLimitedLiability
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "NYSE American Options LLC US-DE",
   :skos/definition
   "the NYSE American Options LLC legal entity that is a Delaware limited liability company"})

(def NYSEArca
  "NYSE Arca functional entity that is an electronic stock market, supporting trading of equity securities and options products listed in the United States, including trading exchange-traded funds (ETFs) and exchange-listed securities"
  {:db/ident :fibo-fbc-fct-usmkt/NYSEArca,
   :fibo-fbc-fct-breg/hasPriorLegalName "The Archipelago Exchange",
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usmkt/NYSEArcaDateEstablished,
   :fibo-fbc-fct-mkt/hasFacilityAcronym "NYSE",
   :fibo-fbc-fct-mkt/operatesInCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fbc-fct-mkt/operatesInMunicipality :fibo-fbc-fct-bci/Chicago,
   :fibo-fnd-plc-vrt/hasWebsite "https://www.nyse.com/",
   :fibo-fnd-rel-rel/hasFormalName "NYSE Arca",
   :fibo-fnd-rel-rel/isManagedBy :fibo-fbc-fct-usmkt/NYSEArcaAsServiceProvider,
   :lcc-cr/isPartOf :fibo-fbc-fct-usmkt/NewYorkStockExchange,
   :owl/sameAs :fibo-fbc-fct-mkti/Facility-ARCX,
   :rdf/type [:fibo-fbc-fct-mkt/MarketSegmentLevelMarket :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "NYSE Arca",
   :skos/definition
   "NYSE Arca functional entity that is an electronic stock market, supporting trading of equity securities and options products listed in the United States, including trading exchange-traded funds (ETFs) and exchange-listed securities"})

(def NYSEArcaAsServiceProvider
  "NYSE (New York Stock Exchange) Arca functional entity that operates an electronic stock market, supporting trading of equity securities and options products listed in the United States, including trading exchange-traded funds (ETFs) and exchange-listed securities"
  {:db/ident :fibo-fbc-fct-usmkt/NYSEArcaAsServiceProvider,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usmkt/NYSEArcaInc-US-DE,
   :owl/sameAs :fibo-fbc-fct-mkti/ServiceProvider-NYSEARCA,
   :rdf/type [:fibo-fbc-pas-fpas/FinancialServiceProvider :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "NYSE Arca as service provider",
   :skos/definition
   "NYSE (New York Stock Exchange) Arca functional entity that operates an electronic stock market, supporting trading of equity securities and options products listed in the United States, including trading exchange-traded funds (ETFs) and exchange-listed securities"})

(def NYSEArcaBusinessEntityIdentifier
  "the Delaware Division of Corporations business entity identifier for NYSE Arca, Inc."
  {:db/ident :fibo-fbc-fct-usmkt/NYSEArcaBusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :lcc-lr/hasTag "787634",
   :lcc-lr/identifies :fibo-fbc-fct-usmkt/NYSEArcaInc-US-DE,
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "NYSE Arca, Inc. business entity identifier",
   :skos/definition
   "the Delaware Division of Corporations business entity identifier for NYSE Arca, Inc."})

(def NYSEArcaDateEstablished
  "the date that NYSE Arca was established"
  {:db/ident :fibo-fbc-fct-usmkt/NYSEArcaDateEstablished,
   :fibo-fnd-dt-fd/hasDateValue "1882",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "NYSE Arca date established",
   :skos/definition "the date that NYSE Arca was established"})

(def NYSEArcaHoldings
  "NYSE Group holding company and financial service provider that operates three listings exchanges, NYSE, NYSE American and NYSE Arca, each of which has a unique market model designed for corporate and ETF issuers, as well as NYSE National, which is a trading venue but not a listings market"
  {:db/ident :fibo-fbc-fct-usmkt/NYSEArcaHoldings,
   :fibo-fnd-plc-vrt/hasWebsite "https://www.nyse.com/",
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usmkt/NYSEArcaHoldingsInc-US-DE,
   :rdf/type [:fibo-fbc-pas-fpas/FinancialServiceProvider
              :fibo-fbc-fct-fse/HoldingCompany
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "NYSE Arca Holdings",
   :skos/definition
   "NYSE Group holding company and financial service provider that operates three listings exchanges, NYSE, NYSE American and NYSE Arca, each of which has a unique market model designed for corporate and ETF issuers, as well as NYSE National, which is a trading venue but not a listings market"})

(def NYSEArcaHoldingsBusinessEntityIdentifier
  "the Delaware Division of Corporations business entity identifier for NYSE Arca Holdings, Inc."
  {:db/ident :fibo-fbc-fct-usmkt/NYSEArcaHoldingsBusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :lcc-lr/hasTag "3703898",
   :lcc-lr/identifies :fibo-fbc-fct-usmkt/NYSEArcaHoldingsInc-US-DE,
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "NYSE Arca Holdings, Inc. business entity identifier",
   :skos/definition
   "the Delaware Division of Corporations business entity identifier for NYSE Arca Holdings, Inc."})

(def NYSEArcaHoldingsInc-US-DE
  "NYSE Arca Holdings, Inc. legal entity that is a Delaware corporation"
  {:db/ident :fibo-fbc-fct-usmkt/NYSEArcaHoldingsInc-US-DE,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usmkt/NYSEArcaIncHeadquartersAddress,
   :fibo-be-oac-cpty/hasMajorityControllingParty :fibo-fbc-fct-usmkt/NYSEGroup,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usmkt/NYSEArcaHoldingsIncDateEstablished,
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationTrustCompany,
   :fibo-fnd-rel-rel/hasLegalName "NYSE Arca Holdings, Inc.",
   :rdf/type [:owl/NamedIndividual :fibo-be-le-cb/StockCorporation],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "NYSE Arca Holdings, Inc. US-DE",
   :skos/definition
   "NYSE Arca Holdings, Inc. legal entity that is a Delaware corporation"})

(def NYSEArcaHoldingsIncDateEstablished
  "date that NYSE Arca Holdings, Inc. was established as a Delaware corporation"
  {:db/ident :fibo-fbc-fct-usmkt/NYSEArcaHoldingsIncDateEstablished,
   :fibo-fnd-dt-fd/hasDateValue "2003-09-15",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "NYSE Arca Holdings, Inc. date established",
   :skos/definition
   "date that NYSE Arca Holdings, Inc. was established as a Delaware corporation"})

(def NYSEArcaInc-US-DE
  "the NYSE Arca, Inc. legal entity that is a Delaware corporation"
  {:db/ident :fibo-fbc-fct-usmkt/NYSEArcaInc-US-DE,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usmkt/NYSEArcaIncHeadquartersAddress,
   :fibo-be-oac-cpty/hasMajorityControllingParty
   :fibo-fbc-fct-usmkt/NYSEArcaHoldings,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usmkt/NYSEArcaIncDateEstablished,
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usmkt/UnitedAgentGroup-Delaware,
   :fibo-fnd-rel-rel/hasLegalName "NYSE Arca, Inc.",
   :rdf/type [:owl/NamedIndividual :fibo-be-le-cb/StockCorporation],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "NYSE Arca, Inc. US-DE",
   :skos/definition
   "the NYSE Arca, Inc. legal entity that is a Delaware corporation"})

(def NYSEArcaIncDateEstablished
  "date that NYSE Arca, Inc. was established as a Delaware corporation"
  {:db/ident :fibo-fbc-fct-usmkt/NYSEArcaIncDateEstablished,
   :fibo-fnd-dt-fd/hasDateValue "1972-12-21",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "NYSE Arca, Inc. date established",
   :skos/definition
   "date that NYSE Arca, Inc. was established as a Delaware corporation"})

(def NYSEArcaIncHeadquartersAddress
  "the headquarters address for NYSE Arca, Inc."
  {:db/ident :fibo-fbc-fct-usmkt/NYSEArcaIncHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "100 South Wacker Drive",
   :fibo-fnd-plc-adr/hasAddressLine2 "Suite 1800",
   :fibo-fnd-plc-adr/hasPostalCode "60606",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Chicago,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/Illinois,
   :rdf/type [:fibo-fnd-plc-adr/ConventionalStreetAddress :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "NYSE Arca, Inc. headquarters address",
   :skos/definition "the headquarters address for NYSE Arca, Inc."})

(def NYSEDark
  "NYSE Dark segment-level market that is a segment of the NYSE involved in trading of dark pools"
  {:db/ident :fibo-fbc-fct-usmkt/NYSEDark,
   :fibo-fbc-fct-mkt/hasFacilityAcronym "NYSEDARK",
   :fibo-fbc-fct-mkt/operatesInCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fbc-fct-mkt/operatesInMunicipality :fibo-fbc-fct-bci/New_York,
   :fibo-fnd-plc-vrt/hasWebsite "https://www.nyse.com/",
   :fibo-fnd-rel-rel/hasFormalName "NYSE Dark",
   :fibo-fnd-rel-rel/isManagedBy :fibo-fbc-fct-usfsind/IntercontinentalExchange,
   :lcc-cr/isPartOf :fibo-fbc-fct-usmkt/NewYorkStockExchange,
   :owl/sameAs :fibo-fbc-fct-mkti/Facility-NYSD,
   :rdf/type [:fibo-fbc-fct-mkt/DarkPool
              :fibo-fbc-fct-mkt/MarketSegmentLevelMarket
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "NYSE Dark",
   :skos/definition
   "NYSE Dark segment-level market that is a segment of the NYSE involved in trading of dark pools"})

(def NYSEGroup
  "NYSE Group functional entity that operates three listings exchanges, NYSE, NYSE American and NYSE Arca, each of which has a unique market model designed for corporate and ETF issuers, as well as NYSE National, which is a trading venue but not a listings market"
  {:db/ident :fibo-fbc-fct-usmkt/NYSEGroup,
   :fibo-fnd-plc-vrt/hasWebsite "https://www.nyse.com/",
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usmkt/NYSEGroupInc-US-DE,
   :rdf/type [:fibo-fbc-pas-fpas/FinancialServiceProvider
              :fibo-fbc-fct-fse/HoldingCompany
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "NYSE Group",
   :skos/definition
   "NYSE Group functional entity that operates three listings exchanges, NYSE, NYSE American and NYSE Arca, each of which has a unique market model designed for corporate and ETF issuers, as well as NYSE National, which is a trading venue but not a listings market"})

(def NYSEGroupBusinessEntityIdentifier
  "the Delaware Division of Corporations business entity identifier for NYSE Group, Inc."
  {:db/ident :fibo-fbc-fct-usmkt/NYSEGroupBusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :lcc-lr/hasTag "4160866",
   :lcc-lr/identifies :fibo-fbc-fct-usmkt/NYSEGroupInc-US-DE,
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "NYSE Group, Inc. business entity identifier",
   :skos/definition
   "the Delaware Division of Corporations business entity identifier for NYSE Group, Inc."})

(def NYSEGroupDateEstablished
  "the date that NYSE Group, Inc. was established"
  {:db/ident :fibo-fbc-fct-usmkt/NYSEGroupDateEstablished,
   :fibo-fnd-dt-fd/hasDateValue "2006-05-19",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "NYSE Group, Inc. date established",
   :skos/definition "the date that NYSE Group, Inc. was established"})

(def NYSEGroupInc-US-DE
  "NYSE Group, Inc. legal entity that is a Delaware corporation"
  {:db/ident :fibo-fbc-fct-usmkt/NYSEGroupInc-US-DE,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usmkt/NewYorkStockExchangeHeadquartersAddress,
   :fibo-be-oac-cpty/hasMajorityControllingParty
   :fibo-fbc-fct-usmkt/NYSEHoldings,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usmkt/NYSEGroupDateEstablished,
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usmkt/UnitedAgentGroup-Delaware,
   :fibo-fnd-rel-rel/hasLegalName "NYSE Group, Inc.",
   :rdf/type [:owl/NamedIndividual :fibo-be-le-cb/StockCorporation],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "NYSE Group, Inc. US-DE",
   :skos/definition
   "NYSE Group, Inc. legal entity that is a Delaware corporation"})

(def NYSEHoldings
  "NYSE Holdings functional entity that through its subsidiaries, operates stock exchanges, including the New York Stock Exchange (NYSE), NYSE Arca, Inc., and NYSE MKT LLC in the United States; and European based exchanges comprising Euronext N.V. - the London, Paris, Amsterdam, Brussels, and Lisbon stock exchanges, as well as the NYSE Liffe derivatives markets in London, Paris, Amsterdam, Brussels, and Lisbon"
  {:db/ident :fibo-fbc-fct-usmkt/NYSEHoldings,
   :fibo-fnd-plc-vrt/hasWebsite "https://www.nyse.com/",
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usmkt/NYSEHoldingsLLC-US-DE,
   :rdf/type [:fibo-fbc-pas-fpas/FinancialServiceProvider
              :fibo-fbc-fct-fse/HoldingCompany
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "NYSE Holdings",
   :skos/definition
   "NYSE Holdings functional entity that through its subsidiaries, operates stock exchanges, including the New York Stock Exchange (NYSE), NYSE Arca, Inc., and NYSE MKT LLC in the United States; and European based exchanges comprising Euronext N.V. - the London, Paris, Amsterdam, Brussels, and Lisbon stock exchanges, as well as the NYSE Liffe derivatives markets in London, Paris, Amsterdam, Brussels, and Lisbon"})

(def NYSEHoldingsBusinessEntityIdentifier
  "Delaware Division of Corporations business entity identifier for NYSE Holdings LLC"
  {:db/ident :fibo-fbc-fct-usmkt/NYSEHoldingsBusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :lcc-lr/hasTag "5257784",
   :lcc-lr/identifies :fibo-fbc-fct-usmkt/NYSEHoldingsLLC-US-DE,
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "NYSE Holdings LLC business entity identifier",
   :skos/definition
   "Delaware Division of Corporations business entity identifier for NYSE Holdings LLC"})

(def NYSEHoldingsDateEstablished
  "the date that NYSE Holdings LLC was established as a Delaware limited liability company"
  {:db/ident :fibo-fbc-fct-usmkt/NYSEHoldingsDateEstablished,
   :fibo-fnd-dt-fd/hasDateValue "2012-12-12",
   :rdf/type [:fibo-fnd-dt-fd/Date :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "NYSE Holdings LLC date established",
   :skos/definition
   "the date that NYSE Holdings LLC was established as a Delaware limited liability company"})

(def NYSEHoldingsLLC-US-DE
  "the NYSE Holdings LLC legal entity that is a Delaware limited liability company"
  {:db/ident :fibo-fbc-fct-usmkt/NYSEHoldingsLLC-US-DE,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usmkt/NewYorkStockExchangeHeadquartersAddress,
   :fibo-be-oac-cctl/hasDomesticUltimateParent
   :fibo-fbc-fct-usfsind/IntercontinentalExchange,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usmkt/NYSEHoldingsDateEstablished,
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usmkt/UnitedAgentGroup-Delaware,
   :fibo-fnd-rel-rel/hasLegalName "NYSE Group, Inc.",
   :rdf/type [:owl/NamedIndividual
              :fibo-be-plc-plc/PrivateCompanyWithLimitedLiability],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "NYSE Holdings LLC US-DE",
   :skos/definition
   "the NYSE Holdings LLC legal entity that is a Delaware limited liability company"})

(def NewYorkStockExchange
  "New York Stock Exchange operating-level market founded in 1792 that is a market place for trading of common stock and other securities"
  {:db/ident :fibo-fbc-fct-usmkt/NewYorkStockExchange,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usmkt/NewYorkStockExchangeDateEstablished,
   :fibo-fbc-fct-mkt/hasFacilityAcronym "NYSE",
   :fibo-fbc-fct-mkt/operatesInCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fbc-fct-mkt/operatesInMunicipality :fibo-fbc-fct-bci/New_York,
   :fibo-fnd-plc-vrt/hasWebsite "https://www.nyse.com/",
   :fibo-fnd-rel-rel/hasFormalName "New York Stock Exchange",
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-usmkt/NewYorkStockExchangeAsServiceProvider,
   :fibo-fnd-utl-av/explanatoryNote
   "The New York Stock Exchange is a leading global cash equity exchange. It is the leading equity exchange for initial public offerings, or IPOs, globally, and enables companies seeking to raise capital to become publicly listed through the IPO process upon meeting exchange listing standards. In addition to common stocks, preferred stocks and warrants, the NYSE lists structured products, such as capital securities and mandatory convertible securities. In addition, NYSE operates NYSE Bonds, an electronic trading platform with transparent pricing for debt securities, including corporate bonds.",
   :owl/sameAs :fibo-fbc-fct-mkti/Facility-XNYS,
   :rdf/type [:owl/NamedIndividual :fibo-fbc-fct-mkt/OperatingLevelMarket],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "New York Stock Exchange",
   :skos/definition
   "New York Stock Exchange operating-level market founded in 1792 that is a market place for trading of common stock and other securities"})

(def NewYorkStockExchangeAsServiceProvider
  "New York Stock Exchange (NYSE) functional entity that manages the NYSE operating-level market"
  {:db/ident :fibo-fbc-fct-usmkt/NewYorkStockExchangeAsServiceProvider,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usmkt/NewYorkStockExchangeLLC-US-NY,
   :owl/sameAs :fibo-fbc-fct-mkti/ServiceProvider-NEWYORKSTOCKEXCHANGEINC,
   :rdf/type [:fibo-fbc-pas-fpas/FinancialServiceProvider :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "New York Stock Exchange as service provider",
   :skos/definition
   "New York Stock Exchange (NYSE) functional entity that manages the NYSE operating-level market"})

(def NewYorkStockExchangeDateEstablished
  "date that the New York Stock Exchange was founded"
  {:db/ident :fibo-fbc-fct-usmkt/NewYorkStockExchangeDateEstablished,
   :fibo-fnd-dt-fd/hasDateValue "1792-05-17",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "New York Stock Exchange date established",
   :skos/definition "date that the New York Stock Exchange was founded"})

(def NewYorkStockExchangeHeadquartersAddress
  "headquarters address for the New York Stock Exchange"
  {:db/ident :fibo-fbc-fct-usmkt/NewYorkStockExchangeHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "11 Wall Street",
   :fibo-fnd-plc-adr/hasPostalCode "10005",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/New_York,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/NewYork,
   :rdf/type [:fibo-fnd-plc-adr/ConventionalStreetAddress :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "New York Stock Exchange headquarters address",
   :skos/definition "headquarters address for the New York Stock Exchange"})

(def NewYorkStockExchangeLLC-US-NY
  "New York Stock Exchange LLC legal entity that is a New York domestic limited liability company, which is the successor organization to New York Stock Exchange, Inc."
  {:db/ident :fibo-fbc-fct-usmkt/NewYorkStockExchangeLLC-US-NY,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usmkt/NewYorkStockExchangeHeadquartersAddress,
   :fibo-be-oac-cpty/hasMajorityControllingParty :fibo-fbc-fct-usmkt/NYSEGroup,
   :fibo-fbc-fct-breg/hasPriorLegalName "New York Stock Exchange Inc.",
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-fbc-fct-usmkt/NewYorkStockExchangeLLCDateEstablished,
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usmkt/UnitedAgentGroup-NewYork,
   :fibo-fnd-rel-rel/hasLegalName "New York Stock Exchange LLC",
   :rdf/type [:owl/NamedIndividual
              :fibo-be-plc-plc/PrivateCompanyWithLimitedLiability],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "New York Stock Exchange LLC US-NY",
   :skos/definition
   "New York Stock Exchange LLC legal entity that is a New York domestic limited liability company, which is the successor organization to New York Stock Exchange, Inc."})

(def NewYorkStockExchangeLLCBusinessEntityIdentifier
  "the New York Department of State Division of Corporations business entity identifier for New York Stock Exchange LLC"
  {:db/ident
   :fibo-fbc-fct-usmkt/NewYorkStockExchangeLLCBusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NewYorkBusinessEntitiesRegistry,
   :lcc-lr/hasTag "3230916",
   :lcc-lr/identifies :fibo-fbc-fct-usmkt/NewYorkStockExchangeLLC-US-NY,
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "New York Stock Exchange LLC business entity identifier",
   :skos/definition
   "the New York Department of State Division of Corporations business entity identifier for New York Stock Exchange LLC"})

(def NewYorkStockExchangeLLCDateEstablished
  "date that the New York Stock Exchange LLC was established as a New York limited liability company"
  {:db/ident :fibo-fbc-fct-usmkt/NewYorkStockExchangeLLCDateEstablished,
   :fibo-fnd-dt-fd/hasDateValue "2005-07-14",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "New York Stock Exchange LLC date established",
   :skos/definition
   "date that the New York Stock Exchange LLC was established as a New York limited liability company"})

(def UnitedAgentGroup-Delaware
  "registration and legal agency role of the Delaware-based, United Agent Group subsidiary of Corporate Creations Network, Inc., which has operating units throughout the US"
  {:db/ident :fibo-fbc-fct-usmkt/UnitedAgentGroup-Delaware,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usmkt/UnitedAgentGroupInc-US-DE,
   :rdf/type [:fibo-fbc-pas-fpas/ThirdPartyAgent
              :fibo-fbc-pas-fpas/AgentForServiceOfProcess
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "United Agent Group - Delaware",
   :skos/definition
   "registration and legal agency role of the Delaware-based, United Agent Group subsidiary of Corporate Creations Network, Inc., which has operating units throughout the US"})

(def UnitedAgentGroup-NewYork
  "registration and legal agency role of the New York-based, United Agent Group subsidiary of Corporate Creations Network, Inc., which has operating units throughout the US"
  {:db/ident :fibo-fbc-fct-usmkt/UnitedAgentGroup-NewYork,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usmkt/UnitedAgentGroupInc-US-NY,
   :rdf/type [:fibo-fbc-pas-fpas/ThirdPartyAgent
              :fibo-fbc-pas-fpas/AgentForServiceOfProcess
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "United Agent Group - New York",
   :skos/definition
   "registration and legal agency role of the New York-based, United Agent Group subsidiary of Corporate Creations Network, Inc., which has operating units throughout the US"})

(def UnitedAgentGroupInc-US-DE
  "United Agent Group Inc. legal entity, registered in Delaware, that provides registered agent and incorporation services"
  {:db/ident :fibo-fbc-fct-usmkt/UnitedAgentGroupInc-US-DE,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usmkt/UnitedAgentGroupInc-US-DE-HeadquartersAddress,
   :fibo-fnd-rel-rel/hasLegalName "United Agent Group Inc.",
   :rdf/type [:fibo-be-le-cb/Corporation :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "United Agent Group Inc. US-DE",
   :skos/definition
   "United Agent Group Inc. legal entity, registered in Delaware, that provides registered agent and incorporation services"})

(def UnitedAgentGroupInc-US-DE-BusinessEntityIdentifier
  "Delaware Department of Corporations business entity identifier for the United Agent Group Inc."
  {:db/ident
   :fibo-fbc-fct-usmkt/UnitedAgentGroupInc-US-DE-BusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :lcc-lr/hasTag "5991300",
   :lcc-lr/identifies :fibo-fbc-fct-usmkt/UnitedAgentGroupInc-US-DE,
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "United Agent Group Inc. US-DE business entity identifier",
   :skos/definition
   "Delaware Department of Corporations business entity identifier for the United Agent Group Inc."})

(def UnitedAgentGroupInc-US-DE-HeadquartersAddress
  "headquarters address for the United Agent Group Inc. US-DE"
  {:db/ident :fibo-fbc-fct-usmkt/UnitedAgentGroupInc-US-DE-HeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "3411 Silverside Road",
   :fibo-fnd-plc-adr/hasAddressLine2 "Tatnall Building STE 104",
   :fibo-fnd-plc-adr/hasPostalCode "19810",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Wilmington,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/Delaware,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/PhysicalAddress],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "United Agent Group Inc. US-DE headquarters address",
   :skos/definition
   "headquarters address for the United Agent Group Inc. US-DE"})

(def UnitedAgentGroupInc-US-NY
  "United Agent Group Inc. legal entity, registered in New York, that provides registered agent and incorporation services"
  {:db/ident :fibo-fbc-fct-usmkt/UnitedAgentGroupInc-US-NY,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfNewYorkJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usmkt/UnitedAgentGroupInc-US-NY-HeadquartersAddress,
   :fibo-fnd-rel-rel/hasLegalName "United Agent Group Inc.",
   :rdf/type [:fibo-be-le-cb/Corporation :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "United Agent Group Inc. US-NY",
   :skos/definition
   "United Agent Group Inc. legal entity, registered in New York, that provides registered agent and incorporation services"})

(def UnitedAgentGroupInc-US-NY-BusinessEntityIdentifier
  "New York Department of State Division of Corporations business entity identifier for the United Agent Group Inc."
  {:db/ident
   :fibo-fbc-fct-usmkt/UnitedAgentGroupInc-US-NY-BusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NewYorkBusinessEntitiesRegistry,
   :lcc-lr/hasTag "4914572",
   :lcc-lr/identifies :fibo-fbc-fct-usmkt/UnitedAgentGroupInc-US-NY,
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "United Agent Group Inc. US-NY business entity identifier",
   :skos/definition
   "New York Department of State Division of Corporations business entity identifier for the United Agent Group Inc."})

(def UnitedAgentGroupInc-US-NY-HeadquartersAddress
  "headquarters address for the United Agent Group Inc. US-NY"
  {:db/ident :fibo-fbc-fct-usmkt/UnitedAgentGroupInc-US-NY-HeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "15 North Mill Street",
   :fibo-fnd-plc-adr/hasPostalCode "10960",
   :fibo-fnd-plc-loc/hasCityName "Nyack",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/NewYork,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/PhysicalAddress],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfs/label "United Agent Group Inc. US-NY headquarters address",
   :skos/definition
   "headquarters address for the United Agent Group Inc. US-NY"})