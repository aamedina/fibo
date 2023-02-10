(ns net.wikipunk.rdf.fibo-fbc-fct-eufseind
  "This ontology extends the primary financial services entities ontology in FBC with additional kinds of entities that provide services internationally, such as international market data providers, organizations that provide exchanges in multiple countries, etc."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 EDM Council, Inc."
                       "Copyright (c) 2017-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :dcterms/abstract
   "This ontology extends the primary financial services entities ontology in FBC with additional kinds of entities that provide services internationally, such as international market data providers, organizations that provide exchanges in multiple countries, etc.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LEIEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Corporations/Corporations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/FinancialServicesEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/CorporateBodies/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/CorporateControl/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/BusinessCentersIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/BusinessRegistries/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/FormalBusinessOrganizations/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
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
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfa/prefix "fibo-fbc-fct-eufseind",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "International Financial Services Entities Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was revised to clean up dead links."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was modified to eliminate usage of deprecated elements."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was modified to eliminate duplication of concepts in LCC, simplify addresses and merge countries with locations in FND."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was modified to reflect revisions to the GLEIF LEI representation for validation level."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was revised to clarify the definitions of various LOUs as well as to update the LEI data for all LEIs to correspond to the content published by the GLEIF and clean up individual definitions as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was revised to add the SIX Group and SIX Financial Information, which owns and operates a number of exchanges and issues the valoren, which is a commonly used financial instrument identifier, as well as to update the LEI data for all LEIs to correspond to the content published by the GLEIF on data.world."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals.rdf version of this ontology was added via the FIBO 2.0 RFC."]})

(def BusinessEntityData
  "individual representing Business Entity Data (BED) B.V."
  {:cmns-av/explanatoryNote
   "wholly-owned subsidiary of DTCC that owns and operates the Global Market Entity Identifier Utility (GMEI) legal entity identifier (LEI) solution in the federated Global LEI system (GLEIS)",
   :db/ident :fibo-fbc-fct-eufseind/BusinessEntityData,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-eufseind/BusinessEntityData-NL,
   :fibo-fnd-rel-rel/manages
   :fibo-fbc-fct-usfsind/GlobalMarketsEntityIdentifierRegistry,
   :rdf/type [:fibo-fbc-fct-breg/LocalOperatingUnit :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Business Entity Data (BED) B.V.",
   :rdfs/seeAlso ["https://www.gmeiutility.org/"],
   :skos/definition "individual representing Business Entity Data (BED) B.V."})

(def BusinessEntityData-NL
  "individual representing Business Entity Data (BED) B.V. legal entity that is a privately held company in the Netherlands"
  {:db/ident :fibo-fbc-fct-eufseind/BusinessEntityData-NL,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-eufseind/BusinessEntityDataHeadquartersAddress,
   :fibo-be-le-lei/hasLegalAddress
   :fibo-fbc-fct-eufseind/BusinessEntityDataLegalAddress,
   :fibo-be-le-lei/hasLegalFormAbbreviation "Besloten Vennootschap",
   :fibo-be-oac-cctl/hasGlobalUltimateParent
   :fibo-fbc-fct-usfsind/DepositoryTrustAndClearingCorporation,
   :fibo-fnd-rel-rel/hasLegalName "Business Entity Data (BED) B.V.",
   :rdf/type [:owl/NamedIndividual :fibo-be-corp-corp/PrivatelyHeldCompany],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Business Entity Data (BED) B.V. NL",
   :skos/definition
   "individual representing Business Entity Data (BED) B.V. legal entity that is a privately held company in the Netherlands"})

(def BusinessEntityDataHeadquartersAddress
  "headquarters address for Business Entity Data (BED) B.V."
  {:db/ident :fibo-fbc-fct-eufseind/BusinessEntityDataHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "Bernhardplein 200",
   :fibo-fnd-plc-adr/hasPostalCode "1097 JB",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/Netherlands,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Amsterdam,
   :rdf/type [:fibo-fnd-plc-adr/ConventionalStreetAddress :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Business Entity Data (BED) B.V. headquarters address",
   :skos/definition "headquarters address for Business Entity Data (BED) B.V."})

(def BusinessEntityDataLegalAddress
  "legal address for Business Entity Data (BED) B.V."
  {:db/ident :fibo-fbc-fct-eufseind/BusinessEntityDataLegalAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "Prins Bernhardplein 200",
   :fibo-fnd-plc-adr/hasPostalCode "1097 JB",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/Netherlands,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Amsterdam,
   :rdf/type [:fibo-fnd-plc-adr/ConventionalStreetAddress :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Business Entity Data (BED) B.V. legal address",
   :skos/definition "legal address for Business Entity Data (BED) B.V."})

(def BusinessEntityDataLegalEntityIdentifierRegistryEntry
  "legal entity identifier Global LEI Index registry entry for Business Entity Data (BED) B.V."
  {:db/ident
   :fibo-fbc-fct-eufseind/BusinessEntityDataLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2012-06-06T19:54:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-09-15T19:32:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-08-05T23:16:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :fibo-fnd-rel-rel/comprises
   "https://rdf.gleif.org/L1/L-EVK05KS7XY1DEII3R011-LEI",
   :rdf/type [:owl/NamedIndividual
              :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label
   "Business Entity Data (BED) B.V. legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier Global LEI Index registry entry for Business Entity Data (BED) B.V."})

(def Clearstream
  "Clearstream functional entity, which is an international central securities depository (ICSD) based in Luxembourg, providing post-trade infrastructure and securities services for the international market and 56 domestic markets worldwide"
  {:db/ident :fibo-fbc-fct-eufseind/Clearstream,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-eufseind/ClearstreamBankingSA,
   :rdf/type [:fibo-fbc-fct-fse/CentralSecuritiesDepository
              :fibo-fbc-fct-fse/CentralCounterpartyClearingHouse
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Clearstream Banking",
   :rdfs/seeAlso
   ["http://www.clearstream.com/clearstream-en/about-clearstream"],
   :skos/definition
   "Clearstream functional entity, which is an international central securities depository (ICSD) based in Luxembourg, providing post-trade infrastructure and securities services for the international market and 56 domestic markets worldwide"})

(def ClearstreamBankingHeadquartersAddress
  "headquarters address for Clearstream Banking S.A."
  {:db/ident :fibo-fbc-fct-eufseind/ClearstreamBankingHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "42, Avenue J.F. Kennedy",
   :fibo-fnd-plc-adr/hasPostalCode "L-1855",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/Luxembourg,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Luxembourg,
   :rdf/type [:fibo-fnd-plc-adr/ConventionalStreetAddress :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Clearstream Banking S.A. headquarters address",
   :skos/definition "headquarters address for Clearstream Banking S.A."})

(def ClearstreamBankingLegalAddress
  "legal address for Clearstream Banking S.A."
  {:db/ident :fibo-fbc-fct-eufseind/ClearstreamBankingLegalAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "42, Avenue J.F. Kennedy",
   :fibo-fnd-plc-adr/hasPostalCode "L-1855",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/Luxembourg,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Luxembourg,
   :rdf/type [:fibo-fnd-plc-adr/ConventionalStreetAddress :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Clearstream Banking S.A. legal address",
   :skos/definition "legal address for Clearstream Banking S.A."})

(def ClearstreamBankingLegalEntityIdentifierRegistryEntry
  "legal entity identifier Global LEI Index registry entry for Clearstream Banking S.A."
  {:db/ident
   :fibo-fbc-fct-eufseind/ClearstreamBankingLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2015-01-10T03:33:24.097-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-06-07T20:35:00.470-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-06-07T04:00:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :fibo-fnd-rel-rel/comprises
   "https://rdf.gleif.org/L1/L-549300OL514RA0SXJJ44-LEI",
   :rdf/type [:owl/NamedIndividual
              :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label
   "Clearstream Banking S.A. legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier Global LEI Index registry entry for Clearstream Banking S.A."})

(def ClearstreamBankingSA
  "Euroclear legal entity that provides post-trade infrastructure and securities services in Europe and internationally"
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
   :rdf/type [:fibo-be-le-cb/StockCorporation :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Clearstream Banking S.A.",
   :rdfs/seeAlso
   ["https://www.euroclear.com/about/en/ourgovernancestructure.html"],
   :skos/definition
   "Euroclear legal entity that provides post-trade infrastructure and securities services in Europe and internationally"})

(def Euroclear
  "Euroclear functional entity, which is a global clearing house, central securities depository, and custodian that specializes in the settlement of securities transactions as well as the safekeeping and asset servicing of these securities"
  {:db/ident :fibo-fbc-fct-eufseind/Euroclear,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-eufseind/EuroclearSANV,
   :rdf/type [:fibo-fbc-fct-fse/CentralSecuritiesDepository
              :fibo-fbc-fct-fse/CentralCounterpartyClearingHouse
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Euroclear",
   :rdfs/seeAlso ["https://www.euroclear.com/en.html"],
   :skos/definition
   "Euroclear functional entity, which is a global clearing house, central securities depository, and custodian that specializes in the settlement of securities transactions as well as the safekeeping and asset servicing of these securities"})

(def EuroclearHeadquartersAddress
  "headquarters address for Euroclear SA/NV"
  {:db/ident :fibo-fbc-fct-eufseind/EuroclearHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "Boulevard du Roi Albert II 1",
   :fibo-fnd-plc-adr/hasAddressLine2 "Saint-Josse-ten-Noode",
   :fibo-fnd-plc-adr/hasPostalCode "1210",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/Belgium,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Brussels,
   :rdf/type [:fibo-fnd-plc-adr/ConventionalStreetAddress :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Euroclear SA/NV headquarters address",
   :skos/definition "headquarters address for Euroclear SA/NV"})

(def EuroclearLegalAddress
  "legal address for Euroclear SA/NV"
  {:db/ident :fibo-fbc-fct-eufseind/EuroclearLegalAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "Boulevard du Roi Albert II 1",
   :fibo-fnd-plc-adr/hasAddressLine2 "Saint-Josse-ten-Noode",
   :fibo-fnd-plc-adr/hasPostalCode "1210",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/Belgium,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Brussels,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/ConventionalStreetAddress],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Euroclear SA/NV legal address",
   :skos/definition "legal address for Euroclear SA/NV"})

(def EuroclearLegalEntityIdentifierRegistryEntry
  "legal entity identifier Global LEI Index registry entry for Euroclear SA/NV"
  {:db/ident :fibo-fbc-fct-eufseind/EuroclearLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2014-01-07T08:04:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-02-09T12:33:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-02-09T12:38:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :fibo-fnd-rel-rel/comprises
   "https://rdf.gleif.org/L1/L-549300CBNW05DILT6870-LEI",
   :rdf/type [:owl/NamedIndividual
              :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Euroclear SA/NV legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier Global LEI Index registry entry for Euroclear SA/NV"})

(def EuroclearSANV
  "Euroclear legal entity that is the parent company of the international and national central securities depositories ((I)CSDs) of the Euroclear group of companies; it owns the group's shared securities processing platforms and delivers a range of services to the group's depositories"
  {:db/ident :fibo-fbc-fct-eufseind/EuroclearSANV,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-eufseind/ClearstreamBankingHeadquartersAddress,
   :fibo-be-le-lei/hasLegalAddress
   :fibo-fbc-fct-eufseind/ClearstreamBankingLegalAddress,
   :fibo-be-le-lei/hasLegalFormAbbreviation
   "Societe Anonyme/Naamloze Vennootschap",
   :fibo-fnd-rel-rel/hasLegalName "Euroclear SA/NV",
   :rdf/type [:owl/NamedIndividual :fibo-be-le-cb/StockCorporation],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Euroclear SA/NV",
   :rdfs/seeAlso ["https://www.euroclear.com/en/about/our-structure.html"],
   :skos/definition
   "Euroclear legal entity that is the parent company of the international and national central securities depositories ((I)CSDs) of the Euroclear group of companies; it owns the group's shared securities processing platforms and delivers a range of services to the group's depositories"})

(def EuropeanBankingFederation
  "international non-profit association founded in 1960 that is the voice of the European banking sector, uniting 32 national banking associations in Europe that together represent some 4,500 banks - large and small, wholesale and retail, local and international - employing about 2.1 million people"
  {:cmns-av/abbreviation "EBF",
   :cmns-av/adaptedFrom "http://www.ebf.eu/about-us/",
   :db/ident :fibo-fbc-fct-eufseind/EuropeanBankingFederation,
   :rdf/type [:fibo-be-le-fbo/NotForProfitOrganization :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "European Banking Federation",
   :skos/definition
   "international non-profit association founded in 1960 that is the voice of the European banking sector, uniting 32 national banking associations in Europe that together represent some 4,500 banks - large and small, wholesale and retail, local and international - employing about 2.1 million people"})

(def EuropeanMoneyMarketsInstitute
  "international non-profit association under Belgian law founded in 1999 with the launch of the Euro and based in Brussels (56, Ave des Arts, 1000 Brussels)"
  {:cmns-av/abbreviation "EMMI",
   :cmns-av/adaptedFrom "http://www.emmi-benchmarks.eu/",
   :cmns-av/explanatoryNote
   "Its members are national banking associations in the Member States of the European Union which are involved in the Eurozone.",
   :db/ident :fibo-fbc-fct-eufseind/EuropeanMoneyMarketsInstitute,
   :rdf/type [:fibo-be-le-fbo/NotForProfitOrganization :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "European Money Markets Institute",
   :skos/definition
   "international non-profit association under Belgian law founded in 1999 with the launch of the Euro and based in Brussels (56, Ave des Arts, 1000 Brussels)"})

(def HerausgebergemeinschaftWertpapier-MitteilungenKepplerLehmann
  "subdivision of Herausgebergemeinschaft Wertpapier-Mitteilungen Keppler, Lehmann that operates the WM Datenservice, Europe's largest registry for the Legal Entity Identifier (LEI)"
  {:db/ident
   :fibo-fbc-fct-eufseind/HerausgebergemeinschaftWertpapier-MitteilungenKepplerLehmann,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-eufseind/HerausgebergemeinschaftWertpapier-MitteilungenKepplerLehmannGmbHAndCoKG-DE,
   :fibo-fnd-rel-rel/manages
   :fibo-fbc-fct-eufseind/WMDatenserviceEntityIdentifierRegistry,
   :rdf/type [:fibo-fbc-fct-breg/LocalOperatingUnit :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label
   "Herausgebergemeinschaft Wertpapier-Mitteilungen Keppler, Lehmann",
   :rdfs/seeAlso ["https://www.wm-leiportal.org/?lang=en"],
   :skos/definition
   "subdivision of Herausgebergemeinschaft Wertpapier-Mitteilungen Keppler, Lehmann that operates the WM Datenservice, Europe's largest registry for the Legal Entity Identifier (LEI)"})

(def HerausgebergemeinschaftWertpapier-MitteilungenKepplerLehmannGmbHAndCoKG-DE
  "Herausgebergemeinschaft Wertpapier-Mitteilungen Keppler, Lehmann GmbH & Co. KG legal entity that is a privately held company in Germany"
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
   :rdf/type [:owl/NamedIndividual :fibo-be-corp-corp/PrivatelyHeldCompany],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label
   "Herausgebergemeinschaft Wertpapier-Mitteilungen Keppler, Lehmann GmbH & Co. KG",
   :rdfs/seeAlso ["https://www.wmgruppe.de/index.php"],
   :skos/definition
   "Herausgebergemeinschaft Wertpapier-Mitteilungen Keppler, Lehmann GmbH & Co. KG legal entity that is a privately held company in Germany"})

(def LondonStockExchange
  "London Stock Exchange functional entity, which is a global business and financial information services and news provider, a securities exchange, and the SEDOL code issuer and registration authority"
  {:cmns-av/abbreviation "LSE",
   :db/ident :fibo-fbc-fct-eufseind/LondonStockExchange,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-eufseind/LondonStockExchangePlc,
   :rdf/type [:fibo-fbc-pas-fpas/FinancialServiceProvider
              :fibo-fbc-fct-ra/RegistrationAuthority
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "London Stock Exchange",
   :rdfs/seeAlso ["http://www.londonstockexchange.com/home/homepage.htm"],
   :skos/definition
   "London Stock Exchange functional entity, which is a global business and financial information services and news provider, a securities exchange, and the SEDOL code issuer and registration authority"})

(def LondonStockExchangeAsLocalOperatingUnit
  "London Stock Exchange functional entity that is an LEI Local Operating Unit (LOU) registrar"
  {:db/ident :fibo-fbc-fct-eufseind/LondonStockExchangeAsLocalOperatingUnit,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-eufseind/LondonStockExchangePlc,
   :fibo-fnd-rel-rel/manages
   :fibo-fbc-fct-eufseind/LondonStockExchangeUnaVistaRegistry,
   :rdf/type [:fibo-fbc-fct-breg/LocalOperatingUnit :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "London Stock Exchange as local operating unit",
   :rdfs/seeAlso ["http://www.londonstockexchange.com/home/homepage.htm"],
   :skos/definition
   "London Stock Exchange functional entity that is an LEI Local Operating Unit (LOU) registrar"})

(def LondonStockExchangeHeadquartersAddress
  "headquarters address for London Stock Exchange plc."
  {:db/ident :fibo-fbc-fct-eufseind/LondonStockExchangeHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "10 Paternoster Square",
   :fibo-fnd-plc-adr/hasPostalCode "EC4M 7LS",
   :fibo-fnd-plc-loc/hasCountry
   :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/London,
   :rdf/type [:fibo-fnd-plc-adr/ConventionalStreetAddress :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "London Stock Exchange plc. headquarters address",
   :skos/definition "headquarters address for London Stock Exchange plc."})

(def LondonStockExchangeLegalAddress
  "legal address for London Stock Exchange plc."
  {:db/ident :fibo-fbc-fct-eufseind/LondonStockExchangeLegalAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "10 Paternoster Square",
   :fibo-fnd-plc-adr/hasPostalCode "EC4M 7LS",
   :fibo-fnd-plc-loc/hasCountry
   :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/London,
   :rdf/type [:fibo-fnd-plc-adr/ConventionalStreetAddress :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "London Stock Exchange plc. legal address",
   :skos/definition "legal address for London Stock Exchange plc."})

(def LondonStockExchangeLegalEntityIdentifierRegistryEntry
  "legal entity identifier Global LEI Index registry entry for London Stock Exchange plc."
  {:db/ident
   :fibo-fbc-fct-eufseind/LondonStockExchangeLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2013-09-13T04:00:00.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-09-16T15:14:33.117-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-09-18T04:00:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :fibo-fnd-rel-rel/comprises
   "https://rdf.gleif.org/L1/L-213800D1EI4B9WTWWD28-LEI",
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label
   "London Stock Exchange plc. legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier Global LEI Index registry entry for London Stock Exchange plc."})

(def LondonStockExchangePlc
  "London Stock Exchange plc. legal entity"
  {:db/ident :fibo-fbc-fct-eufseind/LondonStockExchangePlc,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-eufseind/LondonStockExchangeHeadquartersAddress,
   :fibo-be-le-lei/hasLegalAddress
   :fibo-fbc-fct-eufseind/LondonStockExchangeLegalAddress,
   :fibo-be-le-lei/hasLegalFormAbbreviation "Public Limited Company",
   :fibo-fnd-rel-rel/hasLegalName "London Stock Exchange plc.",
   :rdf/type [:fibo-be-le-cb/Corporation :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "London Stock Exchange plc.",
   :rdfs/seeAlso ["http://www.londonstockexchange.com/home/homepage.htm"],
   :skos/definition "London Stock Exchange plc. legal entity"})

(def LondonStockExchangeUnaVistaRegistry
  "UnaVista registry service provided by the London Stock Exchange supporting LEI registration"
  {:db/ident :fibo-fbc-fct-eufseind/LondonStockExchangeUnaVistaRegistry,
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "London Stock Exchange UnaVista Registry",
   :rdfs/seeAlso ["https://www.lseg.com/LEI"],
   :skos/definition
   "UnaVista registry service provided by the London Stock Exchange supporting LEI registration"})

(def LuxCSD
  "Lux CSD functional entity, which provides Luxembourg's financial community with issuing and central bank settlement as well as custody services for a wide range of securities including investment funds"
  {:db/ident :fibo-fbc-fct-eufseind/LuxCSD,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-eufseind/LuxCSDSA,
   :rdf/type [:fibo-fbc-fct-fse/CentralSecuritiesDepository
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Lux CSD",
   :rdfs/seeAlso ["http://www.luxcsd.com/luxcsd-en/"],
   :skos/definition
   "Lux CSD functional entity, which provides Luxembourg's financial community with issuing and central bank settlement as well as custody services for a wide range of securities including investment funds"})

(def LuxCSDAsLocalOperatingUnit
  "Lux CSD functional entity that is an LEI Local Operating Unit (LOU) registrar"
  {:db/ident :fibo-fbc-fct-eufseind/LuxCSDAsLocalOperatingUnit,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-eufseind/LuxCSDSA,
   :fibo-fnd-rel-rel/manages :fibo-fbc-fct-eufseind/LuxCSDLEIRegistry,
   :rdf/type [:fibo-fbc-fct-breg/LocalOperatingUnit :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Lux CSD",
   :rdfs/seeAlso ["http://www.luxcsd.com/luxcsd-en/"],
   :skos/definition
   "Lux CSD functional entity that is an LEI Local Operating Unit (LOU) registrar"})

(def LuxCSDLEIRegistry
  "LuxCDS LEI registry; LuxCSD has been issuing ISO 17442:2012 compliant LEIs with the prefix 2221 since September 2014"
  {:db/ident :fibo-fbc-fct-eufseind/LuxCSDLEIRegistry,
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Lux CSD LEI Registry",
   :rdfs/seeAlso
   ["http://www.luxcsd.com/luxcsd-en/products-and-services/luxembourg-lei-service"],
   :skos/definition
   "LuxCDS LEI registry; LuxCSD has been issuing ISO 17442:2012 compliant LEIs with the prefix 2221 since September 2014"})

(def LuxCSDLegalEntityIdentifierRegistryEntry
  "legal entity identifier Global LEI Index registry entry for LuxCSD S.A."
  {:db/ident :fibo-fbc-fct-eufseind/LuxCSDLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2014-06-03T05:45:01.523-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-03-09T18:03:09.110-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-03-13T05:00:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :fibo-fnd-rel-rel/comprises
   "https://rdf.gleif.org/L1/L-222100T6ICDIY8V4VX70-LEI",
   :rdf/type [:owl/NamedIndividual
              :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "LuxCSD S.A. legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier Global LEI Index registry entry for LuxCSD S.A."})

(def LuxCSDSA
  "Lux CSD legal entity"
  {:cmns-av/explanatoryNote
   "The European Central Bank (ECB) approved LuxCSD for its Securities Settlement System (SSS).",
   :db/ident :fibo-fbc-fct-eufseind/LuxCSDSA,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-eufseind/ClearstreamBankingHeadquartersAddress,
   :fibo-be-le-lei/hasLegalAddress
   :fibo-fbc-fct-eufseind/ClearstreamBankingLegalAddress,
   :fibo-be-le-lei/hasLegalFormAbbreviation "Societe Anonyme",
   :fibo-fnd-rel-rel/hasLegalName "LuxCSD S.A.",
   :rdf/type [:fibo-be-le-cb/StockCorporation :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "LuxCSD S.A.",
   :rdfs/seeAlso ["http://www.luxcsd.com/luxcsd-en/"],
   :skos/definition "Lux CSD legal entity"})

(def NasdaqOMXGroup
  "corporation that is a subsidiary of Nasdaq, Inc. that manages Nasdaq exchanges in Helsinki, Copenhagen, Stockholm, Iceland, Riga, Tallinn and Vilnius"
  {:db/ident :fibo-fbc-fct-eufseind/NasdaqOMXGroup,
   :rdf/type [:fibo-be-le-cb/Corporation :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Nasdaq OMX Group",
   :skos/definition
   "corporation that is a subsidiary of Nasdaq, Inc. that manages Nasdaq exchanges in Helsinki, Copenhagen, Stockholm, Iceland, Riga, Tallinn and Vilnius"})

(def SIXFinancialInformation
  "SIX Financial Information functional entity, which provides market data gathered from the world's major trading venues directly and in real-time, and is the Valoren issuer and registration authority as well as the national numbering agency (NNA) for Switzerland, Belgium, and Liechtenstein, and the former TELEKURS ID financial instrument identifier issuer and registration authority"
  {:db/ident :fibo-fbc-fct-eufseind/SIXFinancialInformation,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-eufseind/SIXFinancialInformationAG,
   :rdf/type [:fibo-fbc-pas-fpas/FinancialServiceProvider
              :fibo-fbc-fct-ra/RegistrationAuthority
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "SIX Financial Information",
   :skos/definition
   "SIX Financial Information functional entity, which provides market data gathered from the world's major trading venues directly and in real-time, and is the Valoren issuer and registration authority as well as the national numbering agency (NNA) for Switzerland, Belgium, and Liechtenstein, and the former TELEKURS ID financial instrument identifier issuer and registration authority"})

(def SIXFinancialInformationAG
  "SIX Financial Information AG legal entity"
  {:cmns-av/explanatoryNote
   "The company name SIX is an abbreviation and stands for Swiss Infrastructure and Exchange.",
   :db/ident :fibo-fbc-fct-eufseind/SIXFinancialInformationAG,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-eufseind/SIXGroupAGHeadquartersAddress,
   :fibo-be-le-lei/hasLegalFormAbbreviation "Public Limited Company",
   :fibo-be-oac-cctl/hasGlobalUltimateParent :fibo-fbc-fct-eufseind/SIXGroup,
   :fibo-fbc-fct-breg/hasPriorLegalName ["Telekurs Holding Ltd."
                                         "Telekurs Holding SA"
                                         "Telekurs Holding AG"
                                         "Telekurs AG"
                                         "Telekurs SA"
                                         "Telekurs Ltd"],
   :fibo-fbc-fct-breg/hasTradingOrOperationalName
   ["SIX Financial Information Ltd" "SIX SIX Financial Information SA"],
   :fibo-fnd-rel-rel/hasLegalName "SIX Financial Information AG",
   :rdf/type [:owl/NamedIndividual :fibo-be-le-cb/Corporation],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "SIX Financial Information AG",
   :rdfs/seeAlso ["https://www.six-group.com/en/home.html"],
   :skos/definition "SIX Financial Information AG legal entity"})

(def SIXFinancialInformationAGLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for SIX Financial Information AG"
  {:db/ident
   :fibo-fbc-fct-eufseind/SIXFinancialInformationAGLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2019-06-17T06:09:38.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-07-15T12:36:15.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-07-14T22:00:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :fibo-fnd-rel-rel/comprises
   "https://rdf.gleif.org/L1/L-506700D369548LQDC335-LEI",
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label
   "SIX Financial Information AG legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for SIX Financial Information AG"})

(def SIXFinancialInformationAsLocalOperatingUnit
  "SIX Financial Information functional entity that is an LEI Local Operating Unit (LOU) registrar"
  {:db/ident :fibo-fbc-fct-eufseind/SIXFinancialInformationAsLocalOperatingUnit,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-eufseind/SIXFinancialInformationAG,
   :rdf/type [:fibo-fbc-fct-breg/LocalOperatingUnit :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "SIX Financial Information",
   :skos/definition
   "SIX Financial Information functional entity that is an LEI Local Operating Unit (LOU) registrar"})

(def SIXGroup
  "SIX Group functional entity, which offers exchange services, financial information and banking services with the aim of increasing efficiency, quality and innovative capacity along the entire Swiss banking value chain"
  {:cmns-av/abbreviation "SIX",
   :db/ident :fibo-fbc-fct-eufseind/SIXGroup,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-eufseind/SIXGroupAG,
   :rdf/type [:fibo-fbc-pas-fpas/FinancialServiceProvider :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "SIX Group",
   :skos/definition
   "SIX Group functional entity, which offers exchange services, financial information and banking services with the aim of increasing efficiency, quality and innovative capacity along the entire Swiss banking value chain"})

(def SIXGroupAG
  "SIX Group AG legal entity"
  {:cmns-av/explanatoryNote
   "The company name SIX is an abbreviation and stands for Swiss Infrastructure and Exchange.",
   :db/ident :fibo-fbc-fct-eufseind/SIXGroupAG,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-eufseind/SIXGroupAGHeadquartersAddress,
   :fibo-be-le-lei/hasLegalFormAbbreviation "Public Limited Company",
   :fibo-be-oac-cctl/hasSubsidiary
   :fibo-fbc-fct-eufseind/SIXFinancialInformation,
   :fibo-fbc-fct-breg/hasTradingOrOperationalName ["SIX Group SA"
                                                   "SIX Group Ltd"],
   :fibo-fnd-rel-rel/hasLegalName "SIX Group AG",
   :rdf/type [:fibo-be-le-cb/Corporation :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "SIX Group AG",
   :rdfs/seeAlso ["https://www.six-group.com/en/home.html"],
   :skos/definition "SIX Group AG legal entity"})

(def SIXGroupAGHeadquartersAddress
  "headquarters address for SIX Group AG"
  {:db/ident :fibo-fbc-fct-eufseind/SIXGroupAGHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "Hardturmstrasse 201",
   :fibo-fnd-plc-adr/hasPostalCode "8005",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/Switzerland,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Zurich,
   :rdf/type [:fibo-fnd-plc-adr/ConventionalStreetAddress :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "SIX Group AG headquarters address",
   :skos/definition "headquarters address for SIX Group AG"})

(def SIXGroupAGLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for SIX Group AG"
  {:db/ident
   :fibo-fbc-fct-eufseind/SIXGroupAGLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2013-12-09T08:40:03.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-07-20T05:13:49.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-02-06T23:00:00.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :fibo-fnd-rel-rel/comprises
   "https://rdf.gleif.org/L1/L-529900ZMNQFCPP762W05-LEI",
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "SIX Group AG legal entity identifier registry entry",
   :skos/definition "legal entity identifier registry entry for SIX Group AG"})

(def SwedishBankersAssociation
  "association that represents banks and financial institutions established in Sweden that contributes to a sound and efficient regulatory framework that facilitates for banks to help create economic wealth for customers and society"
  {:cmns-av/adaptedFrom
   "https://www.swedishbankers.se/en-us/about/about-us/about-us/",
   :db/ident :fibo-fbc-fct-eufseind/SwedishBankersAssociation,
   :lcc-lr/isMemberOf :fibo-fbc-fct-eufseind/EuropeanBankingFederation,
   :rdf/type [:fibo-fnd-org-fm/FormalOrganization :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "Swedish Bankers' Association",
   :skos/definition
   "association that represents banks and financial institutions established in Sweden that contributes to a sound and efficient regulatory framework that facilitates for banks to help create economic wealth for customers and society"})

(def WMDatenserviceEntityIdentifierRegistry
  "WM Datenservice LEI registry"
  {:db/ident :fibo-fbc-fct-eufseind/WMDatenserviceEntityIdentifierRegistry,
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label "WM Datenservice Registry",
   :skos/definition "WM Datenservice LEI registry"})

(def WMGruppeHeadquartersAndLegalAddress
  "headquarters and legal address for Herausgebergemeinschaft Wertpapier-Mitteilungen Keppler, Lehmann (WM Gruppe)"
  {:db/ident :fibo-fbc-fct-eufseind/WMGruppeHeadquartersAndLegalAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "Duesseldorfer Strasse 16",
   :fibo-fnd-plc-adr/hasPostalCode "60329",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/Germany,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Frankfurt,
   :rdf/type [:fibo-fnd-plc-adr/ConventionalStreetAddress :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label
   "Herausgebergemeinschaft Wertpapier-Mitteilungen Keppler, Lehmann (WM Gruppe) headquarters address",
   :skos/definition
   "headquarters and legal address for Herausgebergemeinschaft Wertpapier-Mitteilungen Keppler, Lehmann (WM Gruppe)"})

(def WMGruppeLegalEntityIdentifierRegistryEntry
  "legal entity identifier registry entry for Herausgebergemeinschaft Wertpapier-Mitteilungen Keppler, Lehmann GmbH & Co. KG"
  {:db/ident :fibo-fbc-fct-eufseind/WMGruppeLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2013-04-03T11:47:18.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-07-13T06:53:08.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-04-14T08:44:35.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelFullyCorroborated,
   :fibo-fnd-rel-rel/comprises
   "https://rdf.gleif.org/L1/L-5299000J2N45DDNE4Y28-LEI",
   :rdf/type [:fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfs/label
   "Herausgebergemeinschaft Wertpapier-Mitteilungen Keppler, Lehmann GmbH & Co. KG legal entity identifier registry entry",
   :skos/definition
   "legal entity identifier registry entry for Herausgebergemeinschaft Wertpapier-Mitteilungen Keppler, Lehmann GmbH & Co. KG"})

(def ^{:private true} DTCC-US-DE
  {:db/ident :fibo-fbc-fct-usfsind/DTCC-US-DE,
   :fibo-be-oac-cctl/hasSubsidiary :fibo-fbc-fct-eufseind/BusinessEntityData,
   :rdf/type :owl/NamedIndividual})