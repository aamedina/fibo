(ns net.wikipunk.rdf.fibo-fbc-fct-eufseind
  {:cmns-av/copyright #{"Copyright (c) 2017-2024 Object Management Group, Inc."
                        "Copyright (c) 2017-2024 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :dcterms/abstract
   "This ontology extends the primary financial services entities ontology in FBC with additional kinds of entities that provide services internationally, such as international market data providers, organizations that provide exchanges in multiple countries, etc.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
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
    "fibo-fbc-fct-bci"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
    "fibo-fbc-fct-breg"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
    "fibo-fbc-fct-eufseind"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
    "fibo-fbc-fct-fse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
    "fibo-fbc-fct-ra"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
    "fibo-fbc-fct-usfsind"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-org-fm"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
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
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/BusinessCentersIndividuals/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/OwnershipAndControl/CorporateControl/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/Addresses/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/BusinessRegistries/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/Corporations/Corporations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/CorporateBodies/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-fct-eufseind",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "International Financial Services Entities Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was revised to clarify the definitions of various LOUs as well as to update the LEI data for all LEIs to correspond to the content published by the GLEIF and clean up individual definitions as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was modified to reflect revisions to the GLEIF LEI representation for validation level."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was revised to add the SIX Group and SIX Financial Information, which owns and operates a number of exchanges and issues the valoren, which is a commonly used financial instrument identifier, as well as to update the LEI data for all LEIs to correspond to the content published by the GLEIF on data.world."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was modified to eliminate usage of deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was revised to clean up dead links."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was added via the FIBO 2.0 RFC."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was modified to eliminate duplication of concepts in LCC, simplify addresses and merge countries with locations in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"})

(def BusinessEntityData
  {:cmns-av/explanatoryNote
   "wholly-owned subsidiary of DTCC that owns and operates the Global Market Entity Identifier Utility (GMEI) legal entity identifier (LEI) solution in the federated Global LEI system (GLEIS)",
   :cmns-rlcmp/isPlayedBy :fibo-fbc-fct-eufseind/BusinessEntityData-NL,
   :db/ident :fibo-fbc-fct-eufseind/BusinessEntityData,
   :fibo-fnd-rel-rel/manages
   :fibo-fbc-fct-usfsind/GlobalMarketsEntityIdentifierRegistry,
   :rdf/type #{:fibo-fbc-fct-breg/LocalOperatingUnit :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "Business Entity Data (BED) B.V.",
   :rdfs/seeAlso {:xsd/anyURI "https://www.gmeiutility.org/"},
   :skos/definition "individual representing Business Entity Data (BED) B.V."})

(def BusinessEntityData-NL
  {:db/ident :fibo-fbc-fct-eufseind/BusinessEntityData-NL,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-eufseind/BusinessEntityDataHeadquartersAddress,
   :fibo-be-le-lei/hasLegalAddress
   :fibo-fbc-fct-eufseind/BusinessEntityDataLegalAddress,
   :fibo-be-le-lei/hasLegalFormAbbreviation "Besloten Vennootschap",
   :fibo-be-oac-cctl/hasGlobalUltimateParent
   :fibo-fbc-fct-usfsind/DepositoryTrustAndClearingCorporation,
   :fibo-fnd-rel-rel/hasLegalName "Business Entity Data (BED) B.V.",
   :rdf/type #{:fibo-be-corp-corp/PrivatelyHeldCompany :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "Business Entity Data (BED) B.V. NL",
   :skos/definition
   "individual representing Business Entity Data (BED) B.V. legal entity that is a privately held company in the Netherlands"})

(def BusinessEntityDataHeadquartersAddress
  {:db/ident :fibo-fbc-fct-eufseind/BusinessEntityDataHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "Bernhardplein 200",
   :fibo-fnd-plc-adr/hasPostalCode "1097 JB",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/Netherlands,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Amsterdam,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/ConventionalStreetAddress},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "Business Entity Data (BED) B.V. headquarters address",
   :skos/definition "headquarters address for Business Entity Data (BED) B.V."})

(def BusinessEntityDataLegalAddress
  {:db/ident :fibo-fbc-fct-eufseind/BusinessEntityDataLegalAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "Prins Bernhardplein 200",
   :fibo-fnd-plc-adr/hasPostalCode "1097 JB",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/Netherlands,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Amsterdam,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/ConventionalStreetAddress},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "Business Entity Data (BED) B.V. legal address",
   :skos/definition "legal address for Business Entity Data (BED) B.V."})

(def BusinessEntityDataLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-EVK05KS7XY1DEII3R011-LEI"},
   :db/ident
   :fibo-fbc-fct-eufseind/BusinessEntityDataLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T15:54:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-09-15T15:32:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-08-05T19:16:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label
   "Business Entity Data (BED) B.V. legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier Global LEI Index registry entry for Business Entity Data (BED) B.V."})

(def Clearstream
  {:cmns-rlcmp/isPlayedBy :fibo-fbc-fct-eufseind/ClearstreamBankingSA,
   :db/ident :fibo-fbc-fct-eufseind/Clearstream,
   :rdf/type #{:fibo-fbc-fct-fse/CentralCounterpartyClearingHouse
               :fibo-fbc-fct-fse/CentralSecuritiesDepository
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "Clearstream Banking",
   :rdfs/seeAlso
   {:xsd/anyURI "http://www.clearstream.com/clearstream-en/about-clearstream"},
   :skos/definition
   "Clearstream functional entity, which is an international central securities depository (ICSD) based in Luxembourg, providing post-trade infrastructure and securities services for the international market and 56 domestic markets worldwide"})

(def ClearstreamBankingHeadquartersAddress
  {:db/ident :fibo-fbc-fct-eufseind/ClearstreamBankingHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "42, Avenue J.F. Kennedy",
   :fibo-fnd-plc-adr/hasPostalCode "L-1855",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/Luxembourg,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Luxembourg,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/ConventionalStreetAddress},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "Clearstream Banking S.A. headquarters address",
   :skos/definition "headquarters address for Clearstream Banking S.A."})

(def ClearstreamBankingLegalAddress
  {:db/ident :fibo-fbc-fct-eufseind/ClearstreamBankingLegalAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "42, Avenue J.F. Kennedy",
   :fibo-fnd-plc-adr/hasPostalCode "L-1855",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/Luxembourg,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Luxembourg,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/ConventionalStreetAddress},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "Clearstream Banking S.A. legal address",
   :skos/definition "legal address for Clearstream Banking S.A."})

(def ClearstreamBankingLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-549300OL514RA0SXJJ44-LEI"},
   :db/ident
   :fibo-fbc-fct-eufseind/ClearstreamBankingLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2015-01-09T22:33:24.097-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-06-07T16:35:00.470-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-06-07T00:00:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label
   "Clearstream Banking S.A. legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier Global LEI Index registry entry for Clearstream Banking S.A."})

(def ClearstreamBankingSA
  {:cmns-av/explanatoryNote
   "The company offers asset services, cash and banking services, connectivity, global securities financing, investment fund services, issuance, IT solutions, settlement, and market coverage services. It also provides post-trade infrastructure services for the German securities industry; and manages, safe keeps, and administers the securities that it holds on behalf of its customers. Clearstream Banking S.A was formerly known as Cedel Bank S.A. and changed its name to Clearstream Banking S.A. in March 2002. The company was founded in 1970 and is based in Luxembourg.",
   :db/ident :fibo-fbc-fct-eufseind/ClearstreamBankingSA,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-eufseind/ClearstreamBankingHeadquartersAddress,
   :fibo-be-le-lei/hasLegalAddress
   :fibo-fbc-fct-eufseind/ClearstreamBankingLegalAddress,
   :fibo-be-le-lei/hasLegalFormAbbreviation "Societe Anonyme",
   :fibo-be-oac-cctl/hasSubsidiary :fibo-fbc-fct-eufseind/LuxCSD,
   :fibo-fbc-fct-breg/hasPriorLegalName "Cedel Bank S.A.",
   :fibo-fnd-rel-rel/hasLegalName "Clearstream Banking S.A.",
   :rdf/type #{:fibo-be-le-cb/StockCorporation :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "Clearstream Banking S.A.",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.euroclear.com/about/en/ourgovernancestructure.html"},
   :skos/definition
   "Euroclear legal entity that provides post-trade infrastructure and securities services in Europe and internationally"})

(def Euroclear
  {:cmns-rlcmp/isPlayedBy :fibo-fbc-fct-eufseind/EuroclearSANV,
   :db/ident :fibo-fbc-fct-eufseind/Euroclear,
   :rdf/type #{:fibo-fbc-fct-fse/CentralCounterpartyClearingHouse
               :fibo-fbc-fct-fse/CentralSecuritiesDepository
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "Euroclear",
   :rdfs/seeAlso {:xsd/anyURI "https://www.euroclear.com/en.html"},
   :skos/definition
   "Euroclear functional entity, which is a global clearing house, central securities depository, and custodian that specializes in the settlement of securities transactions as well as the safekeeping and asset servicing of these securities"})

(def EuroclearHeadquartersAddress
  {:db/ident :fibo-fbc-fct-eufseind/EuroclearHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "Boulevard du Roi Albert II 1",
   :fibo-fnd-plc-adr/hasAddressLine2 "Saint-Josse-ten-Noode",
   :fibo-fnd-plc-adr/hasPostalCode "1210",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/Belgium,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Brussels,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/ConventionalStreetAddress},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "Euroclear SA/NV headquarters address",
   :skos/definition "headquarters address for Euroclear SA/NV"})

(def EuroclearLegalAddress
  {:db/ident :fibo-fbc-fct-eufseind/EuroclearLegalAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "Boulevard du Roi Albert II 1",
   :fibo-fnd-plc-adr/hasAddressLine2 "Saint-Josse-ten-Noode",
   :fibo-fnd-plc-adr/hasPostalCode "1210",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/Belgium,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Brussels,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/ConventionalStreetAddress},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "Euroclear SA/NV legal address",
   :skos/definition "legal address for Euroclear SA/NV"})

(def EuroclearLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-549300CBNW05DILT6870-LEI"},
   :db/ident :fibo-fbc-fct-eufseind/EuroclearLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2014-01-07T03:04:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-02-09T07:33:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-02-09T07:38:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "Euroclear SA/NV legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier Global LEI Index registry entry for Euroclear SA/NV"})

(def EuroclearSANV
  {:db/ident :fibo-fbc-fct-eufseind/EuroclearSANV,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-eufseind/ClearstreamBankingHeadquartersAddress,
   :fibo-be-le-lei/hasLegalAddress
   :fibo-fbc-fct-eufseind/ClearstreamBankingLegalAddress,
   :fibo-be-le-lei/hasLegalFormAbbreviation
   "Societe Anonyme/Naamloze Vennootschap",
   :fibo-fnd-rel-rel/hasLegalName "Euroclear SA/NV",
   :rdf/type #{:fibo-be-le-cb/StockCorporation :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "Euroclear SA/NV",
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.euroclear.com/en/about/our-structure.html"},
   :skos/definition
   "Euroclear legal entity that is the parent company of the international and national central securities depositories ((I)CSDs) of the Euroclear group of companies; it owns the group's shared securities processing platforms and delivers a range of services to the group's depositories"})

(def EuropeanBankingFederation
  {:cmns-av/abbreviation "EBF",
   :cmns-av/adaptedFrom {:xsd/anyURI "http://www.ebf.eu/about-us/"},
   :db/ident :fibo-fbc-fct-eufseind/EuropeanBankingFederation,
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-fbo/NotForProfitOrganization},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "European Banking Federation",
   :skos/definition
   "international non-profit association founded in 1960 that is the voice of the European banking sector, uniting 32 national banking associations in Europe that together represent some 4,500 banks - large and small, wholesale and retail, local and international - employing about 2.1 million people"})

(def EuropeanMoneyMarketsInstitute
  {:cmns-av/abbreviation "EMMI",
   :cmns-av/adaptedFrom {:xsd/anyURI "http://www.emmi-benchmarks.eu/"},
   :cmns-av/explanatoryNote
   "Its members are national banking associations in the Member States of the European Union which are involved in the Eurozone.",
   :db/ident :fibo-fbc-fct-eufseind/EuropeanMoneyMarketsInstitute,
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-fbo/NotForProfitOrganization},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "European Money Markets Institute",
   :skos/definition
   "international non-profit association under Belgian law founded in 1999 with the launch of the Euro and based in Brussels (56, Ave des Arts, 1000 Brussels)"})

(def HerausgebergemeinschaftWertpapier-MitteilungenKepplerLehmann
  {:cmns-rlcmp/isPlayedBy
   :fibo-fbc-fct-eufseind/HerausgebergemeinschaftWertpapier-MitteilungenKepplerLehmannGmbHAndCoKG-DE,
   :db/ident
   :fibo-fbc-fct-eufseind/HerausgebergemeinschaftWertpapier-MitteilungenKepplerLehmann,
   :fibo-fnd-rel-rel/manages
   :fibo-fbc-fct-eufseind/WMDatenserviceEntityIdentifierRegistry,
   :rdf/type #{:fibo-fbc-fct-breg/LocalOperatingUnit :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label
   "Herausgebergemeinschaft Wertpapier-Mitteilungen Keppler, Lehmann",
   :rdfs/seeAlso {:xsd/anyURI "https://www.wm-leiportal.org/?lang=en"},
   :skos/definition
   "subdivision of Herausgebergemeinschaft Wertpapier-Mitteilungen Keppler, Lehmann that operates the WM Datenservice, Europe's largest registry for the Legal Entity Identifier (LEI)"})

(def HerausgebergemeinschaftWertpapier-MitteilungenKepplerLehmannGmbHAndCoKG-DE
  {:db/ident
   :fibo-fbc-fct-eufseind/HerausgebergemeinschaftWertpapier-MitteilungenKepplerLehmannGmbHAndCoKG-DE,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-eufseind/WMGruppeHeadquartersAndLegalAddress,
   :fibo-be-le-lei/hasLegalAddress
   :fibo-fbc-fct-eufseind/WMGruppeHeadquartersAndLegalAddress,
   :fibo-be-le-lei/hasLegalFormAbbreviation
   "Gesellschaft mit beschränkter Haftung & Compagnie Kommanditgesellschaft",
   :fibo-fbc-fct-breg/hasTradingOrOperationalName "WM Gruppe",
   :fibo-fnd-rel-rel/hasLegalName
   "Herausgebergemeinschaft Wertpapier-Mitteilungen Keppler, Lehmann GmbH & Co. KG",
   :rdf/type #{:fibo-be-corp-corp/PrivatelyHeldCompany :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label
   "Herausgebergemeinschaft Wertpapier-Mitteilungen Keppler, Lehmann GmbH & Co. KG",
   :rdfs/seeAlso {:xsd/anyURI "https://www.wmgruppe.de/index.php"},
   :skos/definition
   "Herausgebergemeinschaft Wertpapier-Mitteilungen Keppler, Lehmann GmbH & Co. KG legal entity that is a privately held company in Germany"})

(def LondonStockExchange
  {:cmns-av/abbreviation "LSE",
   :cmns-rlcmp/isPlayedBy :fibo-fbc-fct-eufseind/LondonStockExchangePlc,
   :db/ident :fibo-fbc-fct-eufseind/LondonStockExchange,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationAuthority
               :fibo-fbc-pas-fpas/FinancialServiceProvider
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "London Stock Exchange",
   :rdfs/seeAlso {:xsd/anyURI
                  "http://www.londonstockexchange.com/home/homepage.htm"},
   :skos/definition
   "London Stock Exchange functional entity, which is a global business and financial information services and news provider, a securities exchange, and the SEDOL code issuer and registration authority"})

(def LondonStockExchangeAsLocalOperatingUnit
  {:cmns-rlcmp/isPlayedBy :fibo-fbc-fct-eufseind/LondonStockExchangePlc,
   :db/ident :fibo-fbc-fct-eufseind/LondonStockExchangeAsLocalOperatingUnit,
   :fibo-fnd-rel-rel/manages
   :fibo-fbc-fct-eufseind/LondonStockExchangeUnaVistaRegistry,
   :rdf/type #{:fibo-fbc-fct-breg/LocalOperatingUnit :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "London Stock Exchange as local operating unit",
   :rdfs/seeAlso {:xsd/anyURI
                  "http://www.londonstockexchange.com/home/homepage.htm"},
   :skos/definition
   "London Stock Exchange functional entity that is an LEI Local Operating Unit (LOU) registrar"})

(def LondonStockExchangeHeadquartersAddress
  {:db/ident :fibo-fbc-fct-eufseind/LondonStockExchangeHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "10 Paternoster Square",
   :fibo-fnd-plc-adr/hasPostalCode "EC4M 7LS",
   :fibo-fnd-plc-loc/hasCountry
   :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/London,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/ConventionalStreetAddress},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "London Stock Exchange plc. headquarters address",
   :skos/definition "headquarters address for London Stock Exchange plc."})

(def LondonStockExchangeLegalAddress
  {:db/ident :fibo-fbc-fct-eufseind/LondonStockExchangeLegalAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "10 Paternoster Square",
   :fibo-fnd-plc-adr/hasPostalCode "EC4M 7LS",
   :fibo-fnd-plc-loc/hasCountry
   :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/London,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/ConventionalStreetAddress},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "London Stock Exchange plc. legal address",
   :skos/definition "legal address for London Stock Exchange plc."})

(def LondonStockExchangeLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-213800D1EI4B9WTWWD28-LEI"},
   :db/ident
   :fibo-fbc-fct-eufseind/LondonStockExchangeLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2013-09-13T00:00:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-09-16T11:14:33.117-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-09-18T00:00:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label
   "London Stock Exchange plc. legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier Global LEI Index registry entry for London Stock Exchange plc."})

(def LondonStockExchangePlc
  {:db/ident :fibo-fbc-fct-eufseind/LondonStockExchangePlc,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-eufseind/LondonStockExchangeHeadquartersAddress,
   :fibo-be-le-lei/hasLegalAddress
   :fibo-fbc-fct-eufseind/LondonStockExchangeLegalAddress,
   :fibo-be-le-lei/hasLegalFormAbbreviation "Public Limited Company",
   :fibo-fnd-rel-rel/hasLegalName "London Stock Exchange plc.",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-cb/Corporation},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "London Stock Exchange plc.",
   :rdfs/seeAlso {:xsd/anyURI
                  "http://www.londonstockexchange.com/home/homepage.htm"},
   :skos/definition "London Stock Exchange plc. legal entity"})

(def LondonStockExchangeUnaVistaRegistry
  {:db/ident :fibo-fbc-fct-eufseind/LondonStockExchangeUnaVistaRegistry,
   :rdf/type #{:fibo-fbc-fct-breg/LegalEntityIdentifierRegistry
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "London Stock Exchange UnaVista Registry",
   :rdfs/seeAlso {:xsd/anyURI "https://www.lseg.com/LEI"},
   :skos/definition
   "UnaVista registry service provided by the London Stock Exchange supporting LEI registration"})

(def LuxCSD
  {:cmns-rlcmp/isPlayedBy :fibo-fbc-fct-eufseind/LuxCSDSA,
   :db/ident :fibo-fbc-fct-eufseind/LuxCSD,
   :rdf/type #{:fibo-fbc-fct-fse/CentralSecuritiesDepository
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "Lux CSD",
   :rdfs/seeAlso {:xsd/anyURI "http://www.luxcsd.com/luxcsd-en/"},
   :skos/definition
   "Lux CSD functional entity, which provides Luxembourg's financial community with issuing and central bank settlement as well as custody services for a wide range of securities including investment funds"})

(def LuxCSDAsLocalOperatingUnit
  {:cmns-rlcmp/isPlayedBy :fibo-fbc-fct-eufseind/LuxCSDSA,
   :db/ident :fibo-fbc-fct-eufseind/LuxCSDAsLocalOperatingUnit,
   :fibo-fnd-rel-rel/manages :fibo-fbc-fct-eufseind/LuxCSDLEIRegistry,
   :rdf/type #{:fibo-fbc-fct-breg/LocalOperatingUnit :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "Lux CSD",
   :rdfs/seeAlso {:xsd/anyURI "http://www.luxcsd.com/luxcsd-en/"},
   :skos/definition
   "Lux CSD functional entity that is an LEI Local Operating Unit (LOU) registrar"})

(def LuxCSDLEIRegistry
  {:db/ident :fibo-fbc-fct-eufseind/LuxCSDLEIRegistry,
   :rdf/type #{:fibo-fbc-fct-breg/LegalEntityIdentifierRegistry
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "Lux CSD LEI Registry",
   :rdfs/seeAlso
   {:xsd/anyURI
    "http://www.luxcsd.com/luxcsd-en/products-and-services/luxembourg-lei-service"},
   :skos/definition
   "LuxCDS LEI registry; LuxCSD has been issuing ISO 17442:2012 compliant LEIs with the prefix 2221 since September 2014"})

(def LuxCSDLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-222100T6ICDIY8V4VX70-LEI"},
   :db/ident :fibo-fbc-fct-eufseind/LuxCSDLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2014-06-03T01:45:01.523-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-03-09T13:03:09.110-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-03-13T00:00:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "LuxCSD S.A. legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier Global LEI Index registry entry for LuxCSD S.A."})

(def LuxCSDSA
  {:cmns-av/explanatoryNote
   "The European Central Bank (ECB) approved LuxCSD for its Securities Settlement System (SSS).",
   :db/ident :fibo-fbc-fct-eufseind/LuxCSDSA,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-eufseind/ClearstreamBankingHeadquartersAddress,
   :fibo-be-le-lei/hasLegalAddress
   :fibo-fbc-fct-eufseind/ClearstreamBankingLegalAddress,
   :fibo-be-le-lei/hasLegalFormAbbreviation "Societe Anonyme",
   :fibo-fnd-rel-rel/hasLegalName "LuxCSD S.A.",
   :rdf/type #{:fibo-be-le-cb/StockCorporation :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "LuxCSD S.A.",
   :rdfs/seeAlso {:xsd/anyURI "http://www.luxcsd.com/luxcsd-en/"},
   :skos/definition "Lux CSD legal entity"})

(def NasdaqOMXGroup
  {:db/ident :fibo-fbc-fct-eufseind/NasdaqOMXGroup,
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-cb/Corporation},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "Nasdaq OMX Group",
   :skos/definition
   "corporation that is a subsidiary of Nasdaq, Inc. that manages Nasdaq exchanges in Helsinki, Copenhagen, Stockholm, Iceland, Riga, Tallinn and Vilnius"})

(def SIXFinancialInformation
  {:cmns-rlcmp/isPlayedBy :fibo-fbc-fct-eufseind/SIXFinancialInformationAG,
   :db/ident :fibo-fbc-fct-eufseind/SIXFinancialInformation,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationAuthority
               :fibo-fbc-pas-fpas/FinancialServiceProvider
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "SIX Financial Information",
   :skos/definition
   "SIX Financial Information functional entity, which provides market data gathered from the world's major trading venues directly and in real-time, and is the Valoren issuer and registration authority as well as the national numbering agency (NNA) for Switzerland, Belgium, and Liechtenstein, and the former TELEKURS ID financial instrument identifier issuer and registration authority"})

(def SIXFinancialInformationAG
  {:cmns-av/explanatoryNote
   "The company name SIX is an abbreviation and stands for Swiss Infrastructure and Exchange.",
   :db/ident :fibo-fbc-fct-eufseind/SIXFinancialInformationAG,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-eufseind/SIXGroupAGHeadquartersAddress,
   :fibo-be-le-lei/hasLegalFormAbbreviation "Public Limited Company",
   :fibo-be-oac-cctl/hasGlobalUltimateParent :fibo-fbc-fct-eufseind/SIXGroup,
   :fibo-fbc-fct-breg/hasPriorLegalName
   #{"Telekurs SA" "Telekurs AG" "Telekurs Ltd" "Telekurs Holding SA"
     "Telekurs Holding AG" "Telekurs Holding Ltd."},
   :fibo-fbc-fct-breg/hasTradingOrOperationalName
   #{"SIX Financial Information Ltd" "SIX SIX Financial Information SA"},
   :fibo-fnd-rel-rel/hasLegalName "SIX Financial Information AG",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-cb/Corporation},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "SIX Financial Information AG",
   :rdfs/seeAlso {:xsd/anyURI "https://www.six-group.com/en/home.html"},
   :skos/definition "SIX Financial Information AG legal entity"})

(def SIXFinancialInformationAGLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-506700D369548LQDC335-LEI"},
   :db/ident
   :fibo-fbc-fct-eufseind/SIXFinancialInformationAGLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2019-06-17T06:09:38.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-07-15T12:36:15.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-07-14T22:00:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label
   "SIX Financial Information AG legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for SIX Financial Information AG"})

(def SIXFinancialInformationAsLocalOperatingUnit
  {:cmns-rlcmp/isPlayedBy :fibo-fbc-fct-eufseind/SIXFinancialInformationAG,
   :db/ident :fibo-fbc-fct-eufseind/SIXFinancialInformationAsLocalOperatingUnit,
   :rdf/type #{:fibo-fbc-fct-breg/LocalOperatingUnit :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "SIX Financial Information",
   :skos/definition
   "SIX Financial Information functional entity that is an LEI Local Operating Unit (LOU) registrar"})

(def SIXGroup
  {:cmns-av/abbreviation "SIX",
   :cmns-rlcmp/isPlayedBy :fibo-fbc-fct-eufseind/SIXGroupAG,
   :db/ident :fibo-fbc-fct-eufseind/SIXGroup,
   :rdf/type #{:fibo-fbc-pas-fpas/FinancialServiceProvider
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "SIX Group",
   :skos/definition
   "SIX Group functional entity, which offers exchange services, financial information and banking services with the aim of increasing efficiency, quality and innovative capacity along the entire Swiss banking value chain"})

(def SIXGroupAG
  {:cmns-av/explanatoryNote
   "The company name SIX is an abbreviation and stands for Swiss Infrastructure and Exchange.",
   :db/ident :fibo-fbc-fct-eufseind/SIXGroupAG,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-eufseind/SIXGroupAGHeadquartersAddress,
   :fibo-be-le-lei/hasLegalFormAbbreviation "Public Limited Company",
   :fibo-be-oac-cctl/hasSubsidiary
   :fibo-fbc-fct-eufseind/SIXFinancialInformation,
   :fibo-fbc-fct-breg/hasTradingOrOperationalName #{"SIX Group Ltd"
                                                    "SIX Group SA"},
   :fibo-fnd-rel-rel/hasLegalName "SIX Group AG",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-cb/Corporation},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "SIX Group AG",
   :rdfs/seeAlso {:xsd/anyURI "https://www.six-group.com/en/home.html"},
   :skos/definition "SIX Group AG legal entity"})

(def SIXGroupAGHeadquartersAddress
  {:db/ident :fibo-fbc-fct-eufseind/SIXGroupAGHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "Hardturmstrasse 201",
   :fibo-fnd-plc-adr/hasPostalCode "8005",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/Switzerland,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Zurich,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/ConventionalStreetAddress},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "SIX Group AG headquarters address",
   :skos/definition "headquarters address for SIX Group AG"})

(def SIXGroupAGLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-529900ZMNQFCPP762W05-LEI"},
   :db/ident
   :fibo-fbc-fct-eufseind/SIXGroupAGLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2013-12-09T08:40:03.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-07-20T05:13:49.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-02-06T23:00:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "SIX Group AG legal entity identifier registry entry",
   :skos/definition "legal entity identifier registry entry for SIX Group AG"})

(def SwedishBankersAssociation
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.swedishbankers.se/en-us/about/about-us/about-us/"},
   :cmns-col/isMemberOf :fibo-fbc-fct-eufseind/EuropeanBankingFederation,
   :db/ident :fibo-fbc-fct-eufseind/SwedishBankersAssociation,
   :rdf/type #{:fibo-fnd-org-fm/FormalOrganization :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "Swedish Bankers' Association",
   :skos/definition
   "association that represents banks and financial institutions established in Sweden that contributes to a sound and efficient regulatory framework that facilitates for banks to help create economic wealth for customers and society"})

(def WMDatenserviceEntityIdentifierRegistry
  {:db/ident :fibo-fbc-fct-eufseind/WMDatenserviceEntityIdentifierRegistry,
   :rdf/type #{:fibo-fbc-fct-breg/LegalEntityIdentifierRegistry
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label "WM Datenservice Registry",
   :skos/definition "WM Datenservice LEI registry"})

(def WMGruppeHeadquartersAndLegalAddress
  {:db/ident :fibo-fbc-fct-eufseind/WMGruppeHeadquartersAndLegalAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "Duesseldorfer Strasse 16",
   :fibo-fnd-plc-adr/hasPostalCode "60329",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/Germany,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Frankfurt,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/ConventionalStreetAddress},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label
   "Herausgebergemeinschaft Wertpapier-Mitteilungen Keppler, Lehmann (WM Gruppe) headquarters address",
   :skos/definition
   "headquarters and legal address for Herausgebergemeinschaft Wertpapier-Mitteilungen Keppler, Lehmann (WM Gruppe)"})

(def WMGruppeLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-5299000J2N45DDNE4Y28-LEI"},
   :db/ident :fibo-fbc-fct-eufseind/WMGruppeLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2013-04-03T11:47:18.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-07-13T06:53:08.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-04-14T08:44:35.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdfs/label
   "Herausgebergemeinschaft Wertpapier-Mitteilungen Keppler, Lehmann GmbH & Co. KG legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for Herausgebergemeinschaft Wertpapier-Mitteilungen Keppler, Lehmann GmbH & Co. KG"})

(def urn:uuid:d4411e0a-4b0d-5322-9ef4-6b58c5ae91ae
  {:fibo-fbc-fct-ra/isRegisteredBy :fibo-fbc-fct-eufseind/BusinessEntityData,
   :rdf/type   :owl/NamedIndividual,
   :xsd/anyURI "https://rdf.gleif.org/L1/L-MLDY5N6PZ58ZE60QU102-LEI"})

(def urn:uuid:a8988511-617a-5606-a86d-be07677c4e63
  {:cmns-id/identifies :fibo-fbc-fct-eufseind/LuxCSDSA,
   :fibo-fbc-fct-ra/isRegisteredBy
   :fibo-fbc-fct-eufseind/LuxCSDAsLocalOperatingUnit,
   :fibo-fnd-rel-rel/hasTag "222100T6ICDIY8V4VX70",
   :rdf/type           #{:owl/NamedIndividual
                         :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label         "LuxCSD S.A. legal entity identifier",
   :skos/definition    "legal entity identifier for LuxCSD S.A.",
   :xsd/anyURI         "https://rdf.gleif.org/L1/L-222100T6ICDIY8V4VX70-LEI"})

(def urn:uuid:78c6fbe2-1fe1-5882-a0c3-a9b8a4522fce
  {:fibo-fbc-fct-ra/isRegisteredBy :fibo-fbc-fct-eufseind/BusinessEntityData,
   :rdf/type   :owl/NamedIndividual,
   :xsd/anyURI "https://rdf.gleif.org/L1/L-Y6X4K52KMJMZE7I7MY94-LEI"})

(def urn:uuid:c1b3824f-ebc9-5735-b64c-7a977b486039
  {:cmns-id/identifies
   :fibo-fbc-fct-eufseind/HerausgebergemeinschaftWertpapier-MitteilungenKepplerLehmannGmbHAndCoKG-DE,
   :fibo-fbc-fct-ra/isRegisteredBy
   :fibo-fbc-fct-eufseind/HerausgebergemeinschaftWertpapier-MitteilungenKepplerLehmann,
   :fibo-fnd-rel-rel/hasTag "5299000J2N45DDNE4Y28",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label
   "Herausgebergemeinschaft Wertpapier-Mitteilungen Keppler, Lehmann GmbH & Co. KG legal entity identifier",
   :skos/definition
   "legal entity identifier for Herausgebergemeinschaft Wertpapier-Mitteilungen Keppler, Lehmann GmbH & Co. KG",
   :xsd/anyURI "https://rdf.gleif.org/L1/L-5299000J2N45DDNE4Y28-LEI"})

(def urn:uuid:5cc0a093-432e-568f-bfac-60669a1fef80
  {:fibo-fbc-fct-ra/isRegisteredBy :fibo-fbc-fct-eufseind/BusinessEntityData,
   :rdf/type   :owl/NamedIndividual,
   :xsd/anyURI "https://rdf.gleif.org/L1/L-549300HBJLRO8YFMI370-LEI"})

(def urn:uuid:b99b71c7-a8ae-5039-8719-801126982b21
  {:cmns-av/copyright #{"Copyright (c) 2017-2024 Object Management Group, Inc."
                        "Copyright (c) 2017-2024 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology extends the primary financial services entities ontology in FBC with additional kinds of entities that provide services internationally, such as international market data providers, organizations that provide exchanges in multiple countries, etc.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/BusinessCentersIndividuals/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/OwnershipAndControl/CorporateControl/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/Addresses/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/BusinessRegistries/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/Corporations/Corporations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/CorporateBodies/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "International Financial Services Entities Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was revised to clarify the definitions of various LOUs as well as to update the LEI data for all LEIs to correspond to the content published by the GLEIF and clean up individual definitions as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was modified to reflect revisions to the GLEIF LEI representation for validation level."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was revised to add the SIX Group and SIX Financial Information, which owns and operates a number of exchanges and issues the valoren, which is a commonly used financial instrument identifier, as well as to update the LEI data for all LEIs to correspond to the content published by the GLEIF on data.world."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was modified to eliminate usage of deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was revised to clean up dead links."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was added via the FIBO 2.0 RFC."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was modified to eliminate duplication of concepts in LCC, simplify addresses and merge countries with locations in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"})

(def urn:uuid:50f00330-a106-553d-8526-c388dbb1514e
  {:fibo-fbc-fct-ra/isRegisteredBy :fibo-fbc-fct-eufseind/BusinessEntityData,
   :rdf/type   :owl/NamedIndividual,
   :xsd/anyURI "https://rdf.gleif.org/L1/L-549300PN6MKI0CLP4T28-LEI"})

(def urn:uuid:1bd221ae-d27a-542a-ac1a-bedb7a9d78f8
  {:cmns-id/identifies :fibo-fbc-fct-eufseind/ClearstreamBankingSA,
   :fibo-fbc-fct-ra/isRegisteredBy
   :fibo-fbc-fct-eufseind/LuxCSDAsLocalOperatingUnit,
   :fibo-fnd-rel-rel/hasTag "549300OL514RA0SXJJ44",
   :rdf/type           #{:owl/NamedIndividual
                         :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label         "Clearstream Banking S.A. legal entity identifier",
   :skos/definition    "legal entity identifier for Clearstream Banking S.A.",
   :xsd/anyURI         "https://rdf.gleif.org/L1/L-549300OL514RA0SXJJ44-LEI"})

(def urn:uuid:ad3095af-e553-57c3-821c-20f5b7365880
  {:cmns-id/identifies :fibo-fbc-fct-eufseind/LondonStockExchangePlc,
   :fibo-fbc-fct-ra/isRegisteredBy
   :fibo-fbc-fct-eufseind/LondonStockExchangeAsLocalOperatingUnit,
   :fibo-fnd-rel-rel/hasTag "213800D1EI4B9WTWWD28",
   :rdf/type           #{:owl/NamedIndividual
                         :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label         "London Stock Exchange plc. legal entity identifier",
   :skos/definition    "legal entity identifier for London Stock Exchange plc.",
   :xsd/anyURI         "https://rdf.gleif.org/L1/L-213800D1EI4B9WTWWD28-LEI"})

(def urn:uuid:35fe3948-7767-5774-a933-62ee3773f1cd
  {:cmns-id/identifies :fibo-fbc-fct-eufseind/SIXFinancialInformationAG,
   :fibo-fbc-fct-ra/isRegisteredBy
   :fibo-fbc-fct-eufseind/HerausgebergemeinschaftWertpapier-MitteilungenKepplerLehmann,
   :fibo-fnd-rel-rel/hasTag "506700D369548LQDC335",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label "SIX Financial Information AG legal entity identifier",
   :skos/definition "legal entity identifier for SIX Financial Information AG",
   :xsd/anyURI "https://rdf.gleif.org/L1/L-506700D369548LQDC335-LEI"})

(def urn:uuid:8b20c7b5-6a07-593f-8f6e-9aaa804f7f9a
  {:cmns-id/identifies :fibo-fbc-fct-eufseind/SIXGroupAG,
   :fibo-fbc-fct-ra/isRegisteredBy
   :fibo-fbc-fct-eufseind/HerausgebergemeinschaftWertpapier-MitteilungenKepplerLehmann,
   :fibo-fnd-rel-rel/hasTag "529900ZMNQFCPP762W05",
   :rdf/type           #{:owl/NamedIndividual
                         :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label         "SIX Group AG legal entity identifier",
   :skos/definition    "legal entity identifier for SIX Group AG",
   :xsd/anyURI         "https://rdf.gleif.org/L1/L-529900ZMNQFCPP762W05-LEI"})

(def urn:uuid:d692fe9b-e0db-5056-be35-e4666dbd0976
  {:fibo-fbc-fct-ra/isRegisteredBy :fibo-fbc-fct-eufseind/BusinessEntityData,
   :rdf/type   :owl/NamedIndividual,
   :xsd/anyURI "https://rdf.gleif.org/L1/L-5493000F4ZO33MV32P92-LEI"})

(def urn:uuid:abf56f69-d5dc-5710-b8dd-b74e4b5ead54
  {:fibo-fbc-fct-ra/isRegisteredBy :fibo-fbc-fct-eufseind/BusinessEntityData,
   :rdf/type   :owl/NamedIndividual,
   :xsd/anyURI "https://rdf.gleif.org/L1/L-549300561UZND4C7B569-LEI"})

(def urn:uuid:ddfc285d-1781-5f18-9706-4df7940d33be
  {:fibo-fbc-fct-ra/isRegisteredBy :fibo-fbc-fct-eufseind/BusinessEntityData,
   :rdf/type   :owl/NamedIndividual,
   :xsd/anyURI "https://rdf.gleif.org/L1/L-549300NOPSIMGJNT8J31-LEI"})

(def urn:uuid:db37d00a-9d65-51b9-b3cf-130bd7b56460
  {:cmns-id/identifies :fibo-fbc-fct-eufseind/BusinessEntityData-NL,
   :fibo-fbc-fct-ra/isRegisteredBy :fibo-fbc-fct-eufseind/BusinessEntityData,
   :fibo-fnd-rel-rel/hasTag "EVK05KS7XY1DEII3R011",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label "Business Entity Data (BED) B.V. legal entity identifier",
   :skos/definition
   "legal entity identifier for Business Entity Data (BED) B.V.",
   :xsd/anyURI "https://rdf.gleif.org/L1/L-EVK05KS7XY1DEII3R011-LEI"})

(def urn:uuid:82a642c3-2d85-5820-828a-c19bdd6131bc
  {:cmns-id/identifies :fibo-fbc-fct-eufseind/EuroclearSANV,
   :fibo-fbc-fct-ra/isRegisteredBy :fibo-fbc-fct-eufseind/BusinessEntityData,
   :fibo-fnd-rel-rel/hasTag "549300CBNW05DILT6870",
   :rdf/type           #{:owl/NamedIndividual
                         :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label         "Euroclear SA/NV legal entity identifier",
   :skos/definition    "legal entity identifier for Euroclear SA/NV",
   :xsd/anyURI         "https://rdf.gleif.org/L1/L-549300CBNW05DILT6870-LEI"})