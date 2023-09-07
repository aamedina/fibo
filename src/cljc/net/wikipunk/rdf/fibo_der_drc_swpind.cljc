(ns net.wikipunk.rdf.fibo-der-drc-swpind
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
     "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-be-corp-corp"
     "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
     "fibo-be-le-cb"
     "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/",
     "fibo-be-le-fbo"
     "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
     "fibo-be-le-lei"
     "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/",
     "fibo-be-oac-cctl"
     "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/",
     "fibo-be-plc-plc"
     "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/",
     "fibo-der-drc-swp"
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/",
     "fibo-der-drc-swpind"
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/",
     "fibo-fbc-fct-bci"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
     "fibo-fbc-fct-fse"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
     "fibo-fbc-fct-mkt"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
     "fibo-fbc-fct-ra"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
     "fibo-fbc-fct-usfsind"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
     "fibo-fbc-fct-usjrga"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/",
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
     "lcc-3166-2-us"
     "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "skos" "http://www.w3.org/2004/02/skos/core#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-der-drc-swpind",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/"}
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines indiividuals that represent swaps repositories and intermediaries, including and related schemes, registries, and authorities.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/CorporateControl/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/CorporateBodies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/Swaps/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Corporations/Corporations/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/Markets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/BusinessRegistries/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/BusinessCentersIndividuals/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/SwapsIndividuals/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Swaps Individuals Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals.rdf version of this ontology was revised to clean up the LEI data and individual definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals.rdf version of this ontology was revised to move designated contract market to the markets ontology in FBC."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals.rdf version of this ontology was revised to update the LEI URIs to the new form published by the GLEIF on data.world."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals.rdf version of this ontology was revised to replace references to the legacy LCC UnitedStates country representation with UnitedStatesOfAmerica."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/"})

(def BSDRBusinessEntityIdentifier
  {:cmns-id/identifies :fibo-der-drc-swpind/BSDRLLC-US-DE,
   :db/ident :fibo-der-drc-swpind/BSDRBusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredBy
   :fibo-fbc-fct-usjrga/DelawareCorporationsRegulator,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "5202500",
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/"},
   :rdfs/label "BSDR LLC business entity identifier",
   :skos/definition
   "Delaware Division of Corporations business entity identifier for BSDR LLC"})

(def BSDRDateEstablished
  {:cmns-dt/hasDateValue "2012-08-22",
   :db/ident :fibo-der-drc-swpind/BSDRDateEstablished,
   :rdf/type #{:cmns-dt/Date :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/"},
   :rdfs/label "BSDR date established",
   :skos/definition "date that BSDR LLC was established"})

(def BSDRHeadquartersAddress
  {:db/ident :fibo-der-drc-swpind/BSDRHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "731 Lexington Avenue",
   :fibo-fnd-plc-adr/hasPostalCode "10022",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/New_York,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/NewYork,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/"},
   :rdfs/label "BSDR LLC headquarters address",
   :skos/definition "headquarters address for BSDR LLC"})

(def BSDRLLC-US-DE
  {:cmns-id/isIdentifiedBy :fibo-der-drc-swpind/BSDRBusinessEntityIdentifier,
   :db/ident :fibo-der-drc-swpind/BSDRLLC-US-DE,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-der-drc-swpind/BSDRHeadquartersAddress,
   :fibo-be-oac-cctl/hasDomesticUltimateParent
   :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-der-drc-swpind/BSDRDateEstablished,
   :fibo-fnd-rel-rel/hasLegalName "BSDR LLC",
   :rdf/type #{:fibo-be-plc-plc/PrivateCompanyWithLimitedLiability
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/"},
   :rdfs/label "BSDR LLC US-DE",
   :rdfs/seeAlso {:xsd/anyURI "http://www.bloombergsdr.com/"},
   :skos/definition
   "BSDR LLC legal entity that is a Delaware Limited Liability Company"})

(def BloombergSDR
  {:cmns-av/abbreviation "BSDR",
   :db/ident :fibo-der-drc-swpind/BloombergSDR,
   :fibo-fbc-fct-ra/isRegisteredBy
   :fibo-fbc-fct-usjrga/CommoditiesFuturesAndDerivativesRegulator,
   :fibo-fnd-rel-rel/hasIdentity :fibo-der-drc-swpind/BSDRLLC-US-DE,
   :rdf/type #{:fibo-der-drc-swp/SwapDataRepository :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/"},
   :rdfs/label "Bloomberg SDR",
   :skos/definition "BSDR swap data repository"})

(def ChicagoMercantileExchange
  {:cmns-av/abbreviation "CME",
   :db/ident :fibo-der-drc-swpind/ChicagoMercantileExchange,
   :fibo-fbc-fct-ra/isRegisteredBy
   :fibo-fbc-fct-usjrga/CommoditiesFuturesAndDerivativesRegulator,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-der-drc-swpind/ChicagoMercantileExchangeInc-US-DE,
   :rdf/type #{:fibo-der-drc-swp/SwapDataRepository :owl/NamedIndividual
               :fibo-fbc-fct-mkt/DesignatedContractMarket
               :fibo-fbc-fct-fse/SelfRegulatingOrganization},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/"},
   :rdfs/label "Chicago Mercantile Exchange",
   :skos/definition
   "Chicago Mercantile Exchange, established in 1848 as the world's first futures exchange based in Chicago"})

(def ChicagoMercantileExchangeBusinessEntityIdentifier
  {:cmns-id/identifies :fibo-der-drc-swpind/ChicagoMercantileExchangeInc-US-DE,
   :db/ident
   :fibo-der-drc-swpind/ChicagoMercantileExchangeBusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredBy
   :fibo-fbc-fct-usjrga/DelawareCorporationsRegulator,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "3151025",
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/"},
   :rdfs/label "Chicago Mercantile Exchange (CME) business entity identifier",
   :skos/definition
   "Delaware Division of Corporations business entity identifier for Chicago Mercantile Exchange, Inc."})

(def ChicagoMercantileExchangeDateEstablished
  {:cmns-dt/hasDateValue "1999-12-30",
   :db/ident :fibo-der-drc-swpind/ChicagoMercantileExchangeDateEstablished,
   :rdf/type #{:cmns-dt/Date :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/"},
   :rdfs/label "Chicago Mercantile Exchange (CME) date established",
   :skos/definition
   "date that Chicago Mercantile Exchange (CME) was established as a Delaware Corporation"})

(def ChicagoMercantileExchangeHeadquartersAddress
  {:db/ident :fibo-der-drc-swpind/ChicagoMercantileExchangeHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "20 South Wacker Drive",
   :fibo-fnd-plc-adr/hasPostalCode "60606",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Chicago,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/Illinois,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/"},
   :rdfs/label "Chicago Mercantile Exchange (CME) headquarters address",
   :skos/definition
   "headquarters address for Chicago Mercantile Exchange (CME)"})

(def ChicagoMercantileExchangeInc-US-DE
  {:cmns-id/isIdentifiedBy
   :fibo-der-drc-swpind/ChicagoMercantileExchangeBusinessEntityIdentifier,
   :db/ident :fibo-der-drc-swpind/ChicagoMercantileExchangeInc-US-DE,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-der-drc-swpind/ChicagoMercantileExchangeHeadquartersAddress,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-der-drc-swpind/ChicagoMercantileExchangeDateEstablished,
   :fibo-fnd-rel-rel/hasLegalName "Chicago Mercantile Exchange, Inc.",
   :rdf/type #{:fibo-be-le-cb/StockCorporation :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/"},
   :rdfs/label "Chicago Mercantile Exchange, Inc. US-DE",
   :rdfs/seeAlso {:xsd/anyURI "http://www.cmegroup.com/company/cme.html"},
   :skos/definition
   "Chicago Mercantile Exchange legal entity that is a Delaware Corporation"})

(def DTCCDataRepository
  {:cmns-av/abbreviation "DDR",
   :db/ident :fibo-der-drc-swpind/DTCCDataRepository,
   :fibo-fbc-fct-ra/isRegisteredBy
   :fibo-fbc-fct-usjrga/CommoditiesFuturesAndDerivativesRegulator,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-der-drc-swpind/DTCCDataRepositoryLLC-US-NY,
   :rdf/type #{:fibo-der-drc-swp/SwapDataRepository :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/"},
   :rdfs/label "DTCC Data Repository",
   :skos/definition "DTCC Data Repository"})

(def DTCCDataRepositoryBusinessEntityIdentifier
  {:cmns-id/identifies :fibo-der-drc-swpind/DTCCDataRepositoryLLC-US-NY,
   :db/ident :fibo-der-drc-swpind/DTCCDataRepositoryBusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredBy
   :fibo-fbc-fct-usjrga/NewYorkCorporationsRegulator,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/NewYorkBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "4156912",
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/"},
   :rdfs/label "business entity identifier for DTCC Data Repository (U.S) LLC",
   :skos/definition
   "New York State Division of Corporations business entity identifier for DTCC Data Repository (U.S.) LLC"})

(def DTCCDataRepositoryDateEstablished
  {:cmns-dt/hasDateValue "2011-10-24",
   :db/ident :fibo-der-drc-swpind/DTCCDataRepositoryDateEstablished,
   :rdf/type #{:cmns-dt/Date :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/"},
   :rdfs/label "DTCC Data Repository (U.S) LLC date established",
   :skos/definition "date that DTCC Data Repository (U.S) LLC was established"})

(def DTCCDataRepositoryHeadquartersAddress
  {:db/ident :fibo-der-drc-swpind/DTCCDataRepositoryHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "55 Water Street",
   :fibo-fnd-plc-adr/hasPostalCode "10041",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/New_York,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/NewYork,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/"},
   :rdfs/label "DTCC Data Repository (U.S) LLC headquarters address",
   :skos/definition "headquarters address for DTCC Data Repository (U.S) LLC"})

(def DTCCDataRepositoryLLC-US-NY
  {:cmns-id/isIdentifiedBy
   :fibo-der-drc-swpind/DTCCDataRepositoryBusinessEntityIdentifier,
   :db/ident :fibo-der-drc-swpind/DTCCDataRepositoryLLC-US-NY,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-der-drc-swpind/DTCCDataRepositoryHeadquartersAddress,
   :fibo-be-oac-cctl/hasDomesticUltimateParent
   :fibo-fbc-fct-usfsind/DepositoryTrustAndClearingCorporation,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-der-drc-swpind/DTCCDataRepositoryDateEstablished,
   :fibo-fnd-rel-rel/hasLegalName "DTCC Data Repository (U.S) LLC",
   :rdf/type #{:fibo-be-plc-plc/PrivateCompanyWithLimitedLiability
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/"},
   :rdfs/label "DTCC Data Repository (U.S) LLC US-NY",
   :rdfs/seeAlso
   {:xsd/anyURI "http://www.dtcc.com/about/businesses-and-subsidiaries/ddr-us"},
   :skos/definition
   "DTCC Data Repository (U.S) LLC legal entity that is a New York Limited Liability Company"})

(def ICETradeVault
  {:db/ident :fibo-der-drc-swpind/ICETradeVault,
   :fibo-fbc-fct-ra/isRegisteredBy
   :fibo-fbc-fct-usjrga/CommoditiesFuturesAndDerivativesRegulator,
   :fibo-fnd-rel-rel/hasIdentity :fibo-der-drc-swpind/ICETradeVaultLLC-US-DE,
   :rdf/type #{:fibo-der-drc-swp/SwapDataRepository :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/"},
   :rdfs/label "ICE Trade Vault",
   :skos/definition "ICE Trade Vault"})

(def ICETradeVaultLLC-US-DE
  {:cmns-id/isIdentifiedBy
   :fibo-der-drc-swpind/ICETradeVaultLLCBusinessEntityIdentifier,
   :db/ident :fibo-der-drc-swpind/ICETradeVaultLLC-US-DE,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-der-drc-swpind/ICETradeVaultLLCHeadquartersAddress,
   :fibo-be-oac-cctl/hasDomesticUltimateParent
   :fibo-fbc-fct-usfsind/IntercontinentalExchange,
   :fibo-fbc-fct-fse/hasDateEstablished
   :fibo-der-drc-swpind/ICETradeVaultLLCDateEstablished,
   :fibo-fnd-rel-rel/hasLegalName "ICE Trade Vault, LLC",
   :rdf/type #{:fibo-be-plc-plc/PrivateCompanyWithLimitedLiability
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/"},
   :rdfs/label "ICE Trade Vault, LLC US-DE",
   :rdfs/seeAlso {:xsd/anyURI "https://www.icetradevault.com/"},
   :skos/definition
   "ICE Trade Vault, LLC legal entity that is a Delaware Limited Liability Company"})

(def ICETradeVaultLLCBusinessEntityIdentifier
  {:cmns-id/identifies :fibo-der-drc-swpind/ICETradeVaultLLC-US-DE,
   :db/ident :fibo-der-drc-swpind/ICETradeVaultLLCBusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredBy
   :fibo-fbc-fct-usjrga/DelawareCorporationsRegulator,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "4960384",
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/"},
   :rdfs/label "business entity identifier for ICE Trade Vault, LLC",
   :skos/definition
   "Delaware Division of Corporations business entity identifier for ICE Trade Vault, LLC"})

(def ICETradeVaultLLCDateEstablished
  {:cmns-dt/hasDateValue "2011-03-28",
   :db/ident :fibo-der-drc-swpind/ICETradeVaultLLCDateEstablished,
   :rdf/type #{:cmns-dt/Date :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/"},
   :rdfs/label "ICE Trade Vault, LLC date established",
   :skos/definition "date that ICE Trade Vault, LLC was established"})

(def ICETradeVaultLLCHeadquartersAddress
  {:db/ident :fibo-der-drc-swpind/ICETradeVaultLLCHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "5660 New Northside Drive",
   :fibo-fnd-plc-adr/hasPostalCode "30328",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Atlanta,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/Georgia,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/"},
   :rdfs/label "ICE Trade Vault, LLC headquarters address",
   :skos/definition "headquarters address for ICE Trade Vault, LLC"})

(def urn:uuid:bd280b53-a8ee-5882-ba07-7d15b9a664b0
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2018-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines indiividuals that represent swaps repositories and intermediaries, including and related schemes, registries, and authorities.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/CorporateControl/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/CorporateBodies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/Swaps/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Corporations/Corporations/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/Markets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/BusinessRegistries/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/BusinessCentersIndividuals/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/SwapsIndividuals/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Swaps Individuals Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals.rdf version of this ontology was revised to clean up the LEI data and individual definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals.rdf version of this ontology was revised to move designated contract market to the markets ontology in FBC."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals.rdf version of this ontology was revised to update the LEI URIs to the new form published by the GLEIF on data.world."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals.rdf version of this ontology was revised to replace references to the legacy LCC UnitedStates country representation with UnitedStatesOfAmerica."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/"})