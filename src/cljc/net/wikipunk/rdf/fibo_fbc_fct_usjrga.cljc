(ns net.wikipunk.rdf.fibo-fbc-fct-usjrga
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/",
   :dcterms/abstract
   "This ontology extends the primary regulatory agencies ontology in FBC with additional regulators that are specific to the United States and augments certain U.S. financial services entities based on who regulates them.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-corp-corp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
    "fibo-be-ge-ge"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/",
    "fibo-be-ge-usj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/",
    "fibo-be-le-cb"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/",
    "fibo-be-le-fbo"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
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
    "fibo-fbc-fct-usjrga"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
    "fibo-fnd-org-fm"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
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
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-3166-2-us"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
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
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/OwnershipAndControl/Executives/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Organizations/Organizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/CorporateBodies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/RegulatoryAgencies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/Corporations/Corporations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/VirtualPlaces/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/BusinessCentersIndividuals/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Law/LegalCore/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-fct-usjrga",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/",
   :rdfs/label "US Regulatory Agencies Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/USJurisdiction/USRegulatoryAgencies.rdf version of this ontology was modified per the FIBO 2.0 RFC."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies.rdf version of this ontology was revised to add tax identification number, employer identification number, federal government entity and state government entity."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/USJurisdiction/USRegulatoryAgencies.rdf version of this ontology was modified to integrate a financial services provider identifier for certain banking identifiers, add a property for secondary federal regulator, add individual registration schemes for state-specific business registries, improve on some definitions, normalize some of the labels, eliminate duplication of concepts in LCC, to simplify addresses, merge countries with locations in FND, eliminte the redundant notion of an InstitutionType, which can be determined using a SPARQL query or classification and results in a very large disjunction, and correct a couple of improperly defined annotations."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies.rdf version of this ontology was revised to add a restriction on PrimaryFederalRegulator to say that it must be a government body."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies.rdf version of this ontology was revised to eliminate references to external dictionary sites that no longer resolve and clean up circular and ambiguous definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary and augmented to support better mapping to the NIC repository."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), to eliminate redundancies in FIBO, and to augment the number and nature of financial institution entity types to cover more of the National Information Center (NIC) repository managed by the FFIEC."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies.rdf version of this ontology was revised to correct a restriction defining state government entities and to make federal reserve district identifier a subclass of geographic region identifier and fix spelling errors."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/USJurisdiction/USRegulatoryAgencies.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FBC 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies.rdf version of this ontology was revised to reflect the move of certain organization-specific concepts from BE to FND."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies.rdf version of this ontology was revised to eliminate dead links and address text formatting issues identified by hygiene testing."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"})

(def ABABusinessEntityIdentifier
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/DelawareBusinessRegistrationIdentifierScheme,
   :cmns-id/identifies :fibo-fbc-fct-usjrga/AmericanBankersAssociation,
   :db/ident :fibo-fbc-fct-usjrga/ABABusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "3409652",
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "ABA business entity identifier",
   :skos/definition
   "Delaware Department of Corporations business entity identifier for the American Bankers Association (ABA)"})

(def ABAHeadquartersAddress
  {:db/ident :fibo-fbc-fct-usjrga/ABAHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "1120 Connecticut Avenue, N.W.",
   :fibo-fnd-plc-adr/hasPostalCode "20036",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Washington,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/DistrictOfColumbia,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/ConventionalStreetAddress},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "ABA headquarters address",
   :skos/definition
   "registered address identified as the headquarters address for the American Bankers Association (ABA)"})

(def ABAIINRegistry
  {:db/ident :fibo-fbc-fct-usjrga/ABAIINRegistry,
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-usjrga/AmericanBankersAssociationRegistrationAuthority,
   :rdf/type #{:fibo-fbc-fct-ra/Registry :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "ABA IIN Registry",
   :skos/definition
   "American Bankers Association (ABA) Issuer Identification Number (IIN) registry, a repository of institution characteristics for those that have assigned IINs, managed by the ABA"})

(def ABAIINRegistryEntry
  {:db/ident :fibo-fbc-fct-usjrga/ABAIINRegistryEntry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "ABA IIN registry entry",
   :rdfs/subClassOf
   #{{:owl/allValuesFrom :fibo-fbc-fct-fse/FinancialInstitution,
      :owl/onProperty    :cmns-cxtdsg/appliesTo,
      :rdf/type          :owl/Restriction}
     {:owl/hasValue   :fibo-fbc-fct-usjrga/ABAIINRegistry,
      :owl/onProperty :cmns-col/isIncludedIn,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom :fibo-fbc-fct-usjrga/IssuerIdentificationNumber,
      :rdf/type           :owl/Restriction} :fibo-fbc-fct-ra/RegistryEntry},
   :skos/definition
   "an entry in the ABA IIN registry, a repository of financial institution characteristics collected by the ABA for those institutions to which they issue IINs"})

(def ABARTNRegistry
  {:db/ident :fibo-fbc-fct-usjrga/ABARTNRegistry,
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-usjrga/AmericanBankersAssociationRTNRegistrar,
   :rdf/type #{:fibo-fbc-fct-ra/Registry :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "ABA RTN Registry",
   :skos/definition
   "American Bankers Association (ABA) Routing Transit Number (RTN) registry, a repository of institution characteristics for those that have assigned RTNs, managed by the ABA's designated registration authority (RA)"})

(def ABARTNRegistryEntry
  {:db/ident :fibo-fbc-fct-usjrga/ABARTNRegistryEntry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "ABA RTN registry entry",
   :rdfs/subClassOf
   #{{:owl/allValuesFrom :fibo-fbc-fct-fse/FinancialInstitution,
      :owl/onProperty    :cmns-cxtdsg/appliesTo,
      :rdf/type          :owl/Restriction}
     {:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom :fibo-fbc-fct-usjrga/RoutingTransitNumber,
      :rdf/type           :owl/Restriction}
     {:owl/hasValue   :fibo-fbc-fct-usjrga/ABARTNRegistry,
      :owl/onProperty :cmns-col/isIncludedIn,
      :rdf/type       :owl/Restriction} :fibo-fbc-fct-ra/RegistryEntry},
   :skos/definition
   "an entry in the ABA RTN registry, a repository of financial institution characteristics collected by the ABA Registrar on behalf of the ABA"})

(def AccuityInc-US-DE
  {:db/ident :fibo-fbc-fct-usjrga/AccuityInc-US-DE,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usjrga/AccuityIncHeadquartersAddress,
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationTrustCompany,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "https://accuity.com/"},
   :fibo-fnd-rel-rel/hasLegalName "Accuity Inc.",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-cb/Corporation},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Accuity Inc. US-DE",
   :skos/definition
   "Accuity Inc. legal entity that is a Delaware corporation and subsidiary of Wolters Kluwer"})

(def AccuityIncBusinessEntityIdentifier
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/DelawareBusinessRegistrationIdentifierScheme,
   :cmns-id/identifies :fibo-fbc-fct-usjrga/AccuityInc-US-DE,
   :db/ident :fibo-fbc-fct-usjrga/AccuityIncBusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "4069925",
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Accuity Inc. business entity identifier",
   :skos/definition
   "Delaware Department of Corporations business entity identifier for Accuity Inc."})

(def AccuityIncHeadquartersAddress
  {:db/ident :fibo-fbc-fct-usjrga/AccuityIncHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "1007 Church Street",
   :fibo-fnd-plc-adr/hasPostalCode "60201",
   :fibo-fnd-plc-loc/hasCityName "Evanston",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/Illinois,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/ConventionalStreetAddress},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Accuity Inc. headquarters address",
   :skos/definition
   "registered address that is identified as the headquarters address for Accuity Inc."})

(def AmericanBankersAssociation
  {:cmns-av/abbreviation "ABA",
   :db/ident :fibo-fbc-fct-usjrga/AmericanBankersAssociation,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usjrga/ABAHeadquartersAddress,
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationServiceCompany,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI
                                 "https://www.aba.com/Pages/default.aspx"},
   :fibo-fnd-rel-rel/hasLegalName "American Bankers Association",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-cb/Corporation},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "American Bankers Association",
   :skos/definition
   "American Bankers Association (ABA) legal entity, which is a trade association whose membership comprises financial institutions of all sizes"})

(def AmericanBankersAssociationRTNRegistrar
  {:cmns-av/abbreviation "ABA RTN Registrar",
   :db/ident :fibo-fbc-fct-usjrga/AmericanBankersAssociationRTNRegistrar,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usjrga/AccuityInc-US-DE,
   :fibo-fnd-rel-rel/manages :fibo-fbc-fct-usjrga/ABARTNRegistry,
   :rdf/type #{:fibo-fbc-pas-fpas/FinancialServiceProvider :owl/NamedIndividual
               :fibo-fbc-fct-ra/Registrar},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "American Bankers Association RTN Registrar",
   :skos/definition
   "American Bankers Association (ABA) Routing Transit Number (RTN) Registrar, which is a delegated capability currently provided by Accuity"})

(def AmericanBankersAssociationRegistrationAuthority
  {:cmns-av/abbreviation "ABA RA",
   :db/ident
   :fibo-fbc-fct-usjrga/AmericanBankersAssociationRegistrationAuthority,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usjrga/AmericanBankersAssociation,
   :fibo-fnd-rel-rel/manages :fibo-fbc-fct-usjrga/ABAIINRegistry,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationAuthority
               :fibo-fbc-pas-fpas/FinancialServiceProvider
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "American Bankers Association Registration Authority",
   :skos/definition
   "American Bankers Association (ABA) Registration Authority (RA), which is a function of the ABA for registration of issuer identification numbers in the US"})

(def BoardOfGovernorsOfTheFederalReserveSystem
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "http://www.federalreserve.gov/faqs/about_12591.htm"},
   :cmns-col/isPartOf
   :fibo-fbc-fct-usjrga/FederalReserveRegulatoryAgencyAndCentralBank,
   :db/ident :fibo-fbc-fct-usjrga/BoardOfGovernorsOfTheFederalReserveSystem,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usjrga/FederalReserveBoard,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationAuthority :owl/NamedIndividual
               :fibo-fbc-fct-rga/RegulatoryAgency},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Board of Governors of the Federal Reserve System",
   :skos/definition
   "regulatory agency and registration authority for the overall Federal Reserve System"})

(def CFTCIndustryFilingsRepository
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "http://www.cftc.gov/IndustryOversight/IndustryFilings/index.htm"},
   :db/ident :fibo-fbc-fct-usjrga/CFTCIndustryFilingsRepository,
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-usjrga/CommoditiesFuturesAndDerivativesRegulator,
   :rdf/type #{:fibo-fbc-fct-ra/Registry :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "CFTC Industry Filings Repository",
   :skos/definition
   "CFTC Industry Filings repository, a repository of organizational characteristics and financial data for Designated Contract Markets (DCM), Swap Execution Facilities (SEF), Derivatives Clearing Organizations (DCO), Swap Data Repositories (SDR), and Lists of Foreign Boards of Trade (FBOT) Registered with the Commission"})

(def CaliforniaBankingRegulator
  {:db/ident :fibo-fbc-fct-usjrga/CaliforniaBankingRegulator,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usjrga/CaliforniaDepartmentOfBusinessOversight,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationAuthority :owl/NamedIndividual
               :fibo-fbc-fct-rga/RegulatoryAgency},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "California banking regulator",
   :rdfs/seeAlso {:xsd/anyURI "http://dbo.ca.gov/"},
   :skos/definition
   "regulatory agency, registration authority, and oversight role of the State of California's Department of Business Oversight"})

(def CaliforniaBusinessEntitiesRegistry
  {:db/ident :fibo-fbc-fct-usjrga/CaliforniaBusinessEntitiesRegistry,
   :fibo-fbc-fct-breg/hasRegistryName "California Business Entities (BE)",
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI
                                 "https://businesssearch.sos.ca.gov/"},
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfCaliforniaJurisdiction,
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-usjrga/CaliforniaBusinessRegistrar,
   :rdf/type #{:fibo-fbc-fct-breg/BusinessRegistry :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "California business entities registry",
   :rdfs/seeAlso {:xsd/anyURI
                  "http://www.sos.ca.gov/business-programs/business-entities/"},
   :skos/definition
   "registry of business entities for businesses that have registered with the State of California Business Programs Division"})

(def CaliforniaBusinessProgramsDivision
  {:cmns-col/isPartOf :fibo-be-ge-usj/StateOfCaliforniaGovernment,
   :db/ident :fibo-fbc-fct-usjrga/CaliforniaBusinessProgramsDivision,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI
                                 "http://www.sos.ca.gov/business-programs/"},
   :rdf/type #{:fibo-fbc-fct-usjrga/StateGovernmentEntity :owl/NamedIndividual
               :fibo-be-ge-ge/GovernmentDepartment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "California Business Programs Division",
   :skos/definition
   "State of California, Secretary of State, Business Programs Division"})

(def CaliforniaBusinessRegistrar
  {:db/ident :fibo-fbc-fct-usjrga/CaliforniaBusinessRegistrar,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usjrga/CaliforniaBusinessProgramsDivision,
   :fibo-fnd-rel-rel/manages
   :fibo-fbc-fct-usjrga/CaliforniaBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/provides
   :fibo-fbc-fct-usjrga/CaliforniaBusinessRegistrationService,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/BusinessRegistrationAuthority
               :fibo-fbc-fct-rga/RegulatoryAgency},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "California business registrar",
   :skos/definition
   "regulatory agency and registration authority role of the State of California's Business Programs Division"})

(def CaliforniaBusinessRegistrationIdentifierScheme
  {:db/ident
   :fibo-fbc-fct-usjrga/CaliforniaBusinessRegistrationIdentifierScheme,
   :rdf/type #{:owl/NamedIndividual
               :fibo-be-corp-corp/RegistrationIdentifierScheme},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "California business registration identifier scheme",
   :skos/definition
   "registration identifier scheme for business entity identifiers defined by the State of California, Secretary of State for the registration of business entities"})

(def CaliforniaBusinessRegistrationService
  {:db/ident :fibo-fbc-fct-usjrga/CaliforniaBusinessRegistrationService,
   :fibo-fnd-pas-pas/isProvisionedBy
   :fibo-fbc-fct-usjrga/CaliforniaBusinessRegistrar,
   :fibo-fnd-rel-rel/isProvidedBy
   :fibo-fbc-fct-usjrga/CaliforniaBusinessRegistrar,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationService :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "California business registration service",
   :rdfs/seeAlso
   {:xsd/anyURI
    "http://www.sos.ca.gov/business-programs/business-entities/service-options"},
   :skos/definition
   "State of California, Secretary of State, service for the registration of business entities"})

(def CaliforniaDepartmentOfBusinessOversight
  {:cmns-av/explanatoryNote
   "The Department of Business Oversight (DBO) protects consumers and oversees financial service providers and products. The DBO supervises the operations of state-licensed financial institutions, including banks, credit unions and money transmitters. Additionally, the DBO licenses and regulates a variety of financial service providers, including securities brokers and dealers, investment advisers, payday lenders and other consumer finance lenders.",
   :cmns-col/isPartOf :fibo-be-ge-usj/StateOfCaliforniaGovernment,
   :db/ident :fibo-fbc-fct-usjrga/CaliforniaDepartmentOfBusinessOversight,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfCaliforniaJurisdiction,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "http://dbo.ca.gov/"},
   :rdf/type #{:fibo-fbc-fct-usjrga/StateGovernmentEntity :owl/NamedIndividual
               :fibo-be-ge-ge/GovernmentDepartment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "California Department of Business Oversight",
   :skos/definition "State of California's Department of Business Oversight"})

(def CaliforniaRegistrationAuthorityCode
  {:cmns-id/identifies :fibo-fbc-fct-usjrga/CaliforniaBusinessEntitiesRegistry,
   :db/ident :fibo-fbc-fct-usjrga/CaliforniaRegistrationAuthorityCode,
   :fibo-fnd-rel-rel/hasTag "RA000598",
   :rdf/type #{:fibo-fbc-fct-breg/RegistrationAuthorityCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "California registration authority code",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/gleif-registration-authorities-list"},
   :skos/definition
   "GLEIF Registration Authority List identifier for the California Business Entities Registry"})

(def CommoditiesFuturesAndDerivativesRegulator
  {:db/ident :fibo-fbc-fct-usjrga/CommoditiesFuturesAndDerivativesRegulator,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usjrga/CommodityFuturesTradingCommission,
   :fibo-fnd-rel-rel/manages :fibo-fbc-fct-usjrga/CFTCIndustryFilingsRepository,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationAuthority :owl/NamedIndividual
               :fibo-fbc-fct-rga/RegulatoryAgency},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "commodities, futures and derivatives regulator",
   :skos/definition
   "regulatory agency and registration authority role of the Commodity Futures Trading Commission (CFTC)"})

(def CommodityFuturesTradingCommission
  {:cmns-av/abbreviation "CFTC",
   :cmns-col/isPartOf :fibo-be-ge-usj/UnitedStatesGovernment,
   :db/ident :fibo-fbc-fct-usjrga/CommodityFuturesTradingCommission,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/UnitedStatesJurisdiction,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "http://www.cftc.gov/index.htm"},
   :rdf/type #{:fibo-be-ge-ge/GovernmentAgency :owl/NamedIndividual
               :fibo-fbc-fct-usjrga/FederalGovernmentEntity},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Commodity Futures Trading Commission",
   :skos/definition
   "Commodity Futures Trading Commission (CFTC), an independent Federal agency whose mission is to foster open, transparent, competitive, and financially sound markets, to avoid systemic risk, and to protect the market users and their funds, consumers, and the public from fraud, manipulation, and abusive practices related to derivatives and other products that are subject to the Commodity Exchange Act"})

(def ConsumerFinanceRegulator
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "http://www.consumerfinance.gov/the-bureau/"},
   :db/ident :fibo-fbc-fct-usjrga/ConsumerFinanceRegulator,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usjrga/ConsumerFinancialProtectionBureau,
   :rdf/type #{:owl/NamedIndividual :fibo-fbc-fct-rga/RegulatoryAgency},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "consumer finance regulator",
   :skos/definition
   "regulatory agency and registration authority role of the Consumer Financial Protection Bureau (CFPB)"})

(def ConsumerFinancialProtectionBureau
  {:cmns-av/abbreviation "CFPB",
   :cmns-col/isPartOf :fibo-fbc-fct-usjrga/USDepartmentOfTheTreasury,
   :db/ident :fibo-fbc-fct-usjrga/ConsumerFinancialProtectionBureau,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/UnitedStatesJurisdiction,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI
                                 "https://www.consumerfinance.gov/"},
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/GovernmentDepartment
               :fibo-fbc-fct-usjrga/FederalGovernmentEntity},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Consumer Financial Protection Bureau",
   :skos/definition
   "Consumer Financial Protection Bureau (CFPB), an independent Federal agency that helps consumer finance markets work by making rules more effective, by consistently and fairly enforcing those rules, and by empowering consumers to take more control over their economic lives"})

(def CorporationServiceCompany
  {:db/ident :fibo-fbc-fct-usjrga/CorporationServiceCompany,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usjrga/CorporationServiceCompany-US-DE,
   :rdf/type #{:fibo-fbc-pas-fpas/ThirdPartyAgent :owl/NamedIndividual
               :fibo-fbc-pas-fpas/AgentForServiceOfProcess},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Corporation Service Company",
   :rdfs/seeAlso {:xsd/anyURI "https://www.cscglobal.com/cscglobal/home/"},
   :skos/definition
   "registration and legal agency role of the Corporation Service Company"})

(def CorporationServiceCompany-US-DE
  {:cmns-av/abbreviation "CSC",
   :db/ident :fibo-fbc-fct-usjrga/CorporationServiceCompany-US-DE,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usjrga/CorporationServiceCompanyAddress,
   :fibo-fbc-pas-fpas/hasLegalAgent
   :fibo-fbc-fct-usjrga/CorporationServiceCompany,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI
                                 "https://www.cscglobal.com/cscglobal/home/"},
   :fibo-fnd-rel-rel/hasLegalName "Corporation Service Company",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-cb/Corporation},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Corporation Service Company US-DE",
   :skos/definition
   "Corporation Service Company (CSC) legal entity, which was founded in 1899, and provides registered agent, corporate governance, corporate compliance, and intellectual property management for businesses worldwide"})

(def CorporationServiceCompanyAddress
  {:db/ident :fibo-fbc-fct-usjrga/CorporationServiceCompanyAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "251 Little Falls Drive",
   :fibo-fnd-plc-adr/hasPostalCode "19808",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Wilmington,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/Delaware,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Corporation Service Company legal address",
   :skos/definition
   "registration address that is identified as the headquarters address for the Corporation Service Company"})

(def CorporationServiceCompanyBusinessEntityIdentifier
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/DelawareBusinessRegistrationIdentifierScheme,
   :cmns-id/identifies :fibo-fbc-fct-usjrga/CorporationServiceCompany-US-DE,
   :db/ident
   :fibo-fbc-fct-usjrga/CorporationServiceCompanyBusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "101330",
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Corporation Service Company business entity identifier",
   :skos/definition
   "Delaware Department of Corporations business entity identifier for the Corporation Service Company"})

(def CorporationTrustCompany
  {:db/ident :fibo-fbc-fct-usjrga/CorporationTrustCompany,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usjrga/CorporationTrustCompany-US-DE,
   :rdf/type #{:fibo-fbc-pas-fpas/ThirdPartyAgent :owl/NamedIndividual
               :fibo-fbc-pas-fpas/AgentForServiceOfProcess},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Corporation Trust Company",
   :rdfs/seeAlso {:xsd/anyURI "https://ct.wolterskluwer.com/"},
   :skos/definition
   "registration and legal agency role of the The Corporation Trust Company, a wholly-owned subsidiary of Wolters Kluwer"})

(def CorporationTrustCompany-US-DE
  {:cmns-av/abbreviation "CT",
   :db/ident :fibo-fbc-fct-usjrga/CorporationTrustCompany-US-DE,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usjrga/CorporationTrustCompanyHeadquartersAddress,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "https://ct.wolterskluwer.com/"},
   :fibo-fnd-rel-rel/hasLegalName "CT Corporation",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-cb/Corporation},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Corporation Trust Company US-DE",
   :skos/definition
   "The Corporation Trust Company (CT Corporation) legal entity, which provides registered agent and incorporation services"})

(def CorporationTrustCompanyBusinessEntityIdentifier
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/DelawareBusinessRegistrationIdentifierScheme,
   :cmns-id/identifies :fibo-fbc-fct-usjrga/CorporationTrustCompany-US-DE,
   :db/ident
   :fibo-fbc-fct-usjrga/CorporationTrustCompanyBusinessEntityIdentifier,
   :fibo-fbc-fct-ra/isRegisteredIn
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/hasTag "101330",
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Corporation Trust Company business entity identifier",
   :skos/definition
   "Delaware Department of Corporations business entity identifier for The Corporation Trust Company (CT Corporation)"})

(def CorporationTrustCompanyHeadquartersAddress
  {:db/ident :fibo-fbc-fct-usjrga/CorporationTrustCompanyHeadquartersAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "1209 Orange Street",
   :fibo-fnd-plc-adr/hasAddressLine2 "Corporation Trust Center",
   :fibo-fnd-plc-adr/hasPostalCode "19801",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Wilmington,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/Delaware,
   :rdf/type #{:fibo-fnd-plc-adr/PhysicalAddress :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Corporation Trust Company headquarters address",
   :skos/definition
   "registration address that is identified as the headquarters address for the The Corporation Trust Company (CT Corporation)"})

(def DelawareBusinessEntitiesRegistry
  {:db/ident :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-plc-vrt/hasWebsite
   {:xsd/anyURI
    "https://icis.corp.delaware.gov/Ecorp/EntitySearch/NameSearch.aspx"},
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-usjrga/DelawareCorporationsRegulator,
   :rdf/type #{:fibo-fbc-fct-breg/BusinessRegistry :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Delaware business entities registry",
   :skos/definition
   "State of Delaware, Division of Corporations, registry of business entities"})

(def DelawareBusinessRegistrationIdentifierScheme
  {:db/ident :fibo-fbc-fct-usjrga/DelawareBusinessRegistrationIdentifierScheme,
   :rdf/type #{:owl/NamedIndividual
               :fibo-be-corp-corp/RegistrationIdentifierScheme},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Delaware business registration identifier scheme",
   :skos/definition
   "registration identifier scheme for business entity identifiers defined by the State of Delaware, Division of Corporations for the registration of business entities"})

(def DelawareBusinessRegistrationService
  {:db/ident :fibo-fbc-fct-usjrga/DelawareBusinessRegistrationService,
   :fibo-fnd-pas-pas/isProvisionedBy
   :fibo-fbc-fct-usjrga/DelawareCorporationsRegulator,
   :fibo-fnd-rel-rel/isProvidedBy
   :fibo-fbc-fct-usjrga/DelawareCorporationsRegulator,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationService :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Delaware business registration service",
   :rdfs/seeAlso {:xsd/anyURI "http://corp.delaware.gov/"},
   :skos/definition
   "State of Delaware, Division of Corporations, service for the registration of business entities"})

(def DelawareCorporationsRegulator
  {:db/ident :fibo-fbc-fct-usjrga/DelawareCorporationsRegulator,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usjrga/DelawareDivisionOfCorporations,
   :fibo-fnd-rel-rel/manages
   :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/provides
   :fibo-fbc-fct-usjrga/DelawareBusinessRegistrationService,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/BusinessRegistrationAuthority
               :fibo-fbc-fct-rga/RegulatoryAgency},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Delaware corporations regulator",
   :rdfs/seeAlso {:xsd/anyURI "http://corp.delaware.gov/aboutagency.shtml"},
   :skos/definition
   "regulatory agency and registration authority role of the State of Delaware's Division of Corporations"})

(def DelawareDivisionOfCorporations
  {:cmns-col/isPartOf :fibo-be-ge-usj/StateOfDelawareGovernment,
   :db/ident :fibo-fbc-fct-usjrga/DelawareDivisionOfCorporations,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "http://corp.delaware.gov/"},
   :rdf/type #{:fibo-fbc-fct-usjrga/StateGovernmentEntity :owl/NamedIndividual
               :fibo-be-ge-ge/GovernmentDepartment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Delaware Division of Corporations",
   :skos/definition "State of Delaware's Division of Corporations"})

(def DelawareRegistrationAuthorityCode
  {:cmns-id/identifies :fibo-fbc-fct-usjrga/DelawareBusinessEntitiesRegistry,
   :db/ident :fibo-fbc-fct-usjrga/DelawareRegistrationAuthorityCode,
   :fibo-fnd-rel-rel/hasTag "RA000602",
   :rdf/type #{:fibo-fbc-fct-breg/RegistrationAuthorityCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Delaware registration authority code",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/gleif-registration-authorities-list"},
   :skos/definition
   "GLEIF Registration Authority List identifier for the Delaware Business Entities Registry"})

(def EDGARRepository
  {:cmns-av/adaptedFrom {:xsd/anyURI "http://www.sec.gov/edgar/aboutedgar.htm"},
   :cmns-av/explanatoryNote
   "EDGAR, the Electronic Data Gathering, Analysis, and Retrieval system, performs automated collection, validation, indexing, acceptance, and forwarding of submissions by companies and others who are required by law to file forms with the U.S. Securities and Exchange Commission (SEC). Its primary purpose is to increase the efficiency and fairness of the securities market for the benefit of investors, corporations, and the economy by accelerating the receipt, acceptance, dissemination, and analysis of time-sensitive corporate information filed with the agency.",
   :db/ident :fibo-fbc-fct-usjrga/EDGARRepository,
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-usjrga/SecuritiesAndExchangeRegulator,
   :rdf/type #{:fibo-fbc-fct-ra/Registry :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "EDGAR Repository",
   :skos/definition
   "EDGAR repository, a repository of financial information about securities and their issuers, including but not limited to corporate quarterly and annual filings, collected by the SEC"})

(def EmployerIdentificationNumber
  {:cmns-av/abbreviation #{"EIN" "FEIN"},
   :cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.irs.gov/businesses/small-businesses-self-employed/employer-id-numbers"},
   :cmns-av/explanatoryNote
   "Note that despite the name, the business may not necessarily employ anyone.",
   :cmns-av/synonym #{"Federal Tax Identification Number"
                      "Federal Employer Identification Number"},
   :db/ident :fibo-fbc-fct-usjrga/EmployerIdentificationNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "employer identification number",
   :rdfs/subClassOf
   #{:fibo-fbc-fct-usjrga/TaxpayerIdentificationNumber
     :fibo-fnd-org-org/OrganizationIdentifier
     {:owl/onClass :fibo-fbc-fct-usjrga/EmployerIdentificationNumberingScheme,
      :owl/onProperty :cmns-col/isMemberOf,
      :owl/qualifiedCardinality 1,
      :rdf/type :owl/Restriction}},
   :skos/definition
   "unique nine-digit number assigned by the Internal Revenue Service (IRS) to business entities operating in the United States for the purposes of identification"})

(def EmployerIdentificationNumberingScheme
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.irs.gov/businesses/small-businesses-self-employed/employer-id-numbers"},
   :db/ident :fibo-fbc-fct-usjrga/EmployerIdentificationNumberingScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "employer identification numbering scheme",
   :rdfs/subClassOf :fibo-fbc-fct-usjrga/TaxpayerIdentificationNumberingScheme,
   :skos/definition
   "taxpayer identification numbering scheme used in the United States to identify business entities"})

(def FDICBusinessEntityIdentifier
  {:cmns-dsg/isDefinedIn
   :fibo-fbc-fct-usjrga/DelawareBusinessRegistrationIdentifierScheme,
   :cmns-id/identifies :fibo-fbc-fct-usjrga/FederalDepositInsuranceCorporation,
   :db/ident :fibo-fbc-fct-usjrga/FDICBusinessEntityIdentifier,
   :fibo-fnd-rel-rel/hasTag "1003818",
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "FDIC business entity identifier",
   :skos/definition
   "Delaware Department of Corporations business entity identifier for the FDIC"})

(def FDICCertificateNumber
  {:cmns-av/adaptedFrom {:xsd/anyURI "http://www.fdic.gov/"},
   :db/ident :fibo-fbc-fct-usjrga/FDICCertificateNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "FDIC Certificate Number",
   :rdfs/subClassOf
   #{:fibo-fbc-fct-ra/RegistryIdentifier
     :fibo-fbc-fct-fse/FinancialServiceProviderIdentifier
     {:owl/hasValue   :fibo-fbc-fct-usjrga/FDICInstitutionDirectory,
      :owl/onProperty :fibo-fbc-fct-ra/isRegisteredIn,
      :rdf/type       :owl/Restriction}
     {:owl/hasValue   :fibo-fbc-fct-usjrga/FederalDepositInsurerAndRegulator,
      :owl/onProperty :fibo-fbc-fct-ra/isRegisteredBy,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "identifier issued to a depository institution by the FDIC on approval of that institution's application for insurance"})

(def FDICInstitutionDirectory
  {:cmns-av/adaptedFrom {:xsd/anyURI "https://www7.fdic.gov/idasp/index.asp"},
   :db/ident :fibo-fbc-fct-usjrga/FDICInstitutionDirectory,
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-usjrga/FederalDepositInsurerAndRegulator,
   :rdf/type #{:fibo-fbc-fct-ra/Registry :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "FDIC Institution Directory",
   :skos/definition
   "Federal Deposit Insurance Corporation's (FDIC) institution directory, a repository of financial data and institution characteristics for covered institutions collected by the FDIC"})

(def FDICRegistryEntry
  {:cmns-av/adaptedFrom {:xsd/anyURI "https://www7.fdic.gov/idasp/index.asp"},
   :db/ident :fibo-fbc-fct-usjrga/FDICRegistryEntry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "FDIC registry entry",
   :rdfs/subClassOf
   #{{:owl/allValuesFrom :fibo-fbc-fct-fse/DepositoryInstitution,
      :owl/onProperty    :cmns-cxtdsg/appliesTo,
      :rdf/type          :owl/Restriction}
     {:owl/hasValue   :fibo-fbc-fct-usjrga/FDICInstitutionDirectory,
      :owl/onProperty :cmns-col/isIncludedIn,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom :fibo-fbc-fct-usjrga/FDICCertificateNumber,
      :rdf/type           :owl/Restriction} :fibo-fbc-fct-ra/RegistryEntry},
   :skos/definition
   "an entry in the FDIC institution directory, a repository of financial institution characteristics collected by the FDIC related to the institutions they insure"})

(def FRSMemberBank
  {:db/ident :fibo-fbc-fct-usjrga/FRSMemberBank,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-fbc-fct-usjrga/FederalReserveSystemMember,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"}})

(def FRSNonMemberBank
  {:db/ident :fibo-fbc-fct-usjrga/FRSNonMemberBank,
   :owl/deprecated true,
   :owl/equivalentClass
   :fibo-fbc-fct-usjrga/FederalReserveSystemNonMemberInstitution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"}})

(def FRSStateMemberBank
  {:db/ident :fibo-fbc-fct-usjrga/FRSStateMemberBank,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-fbc-fct-usjrga/StateMemberBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"}})

(def FarmCreditAdministration
  {:cmns-av/abbreviation "FCA",
   :cmns-av/explanatoryNote
   "The FCS is the largest agricultural lender in the United States. It is a nationwide network of lending institutions that are owned by their borrowers. It serves all 50 States and Puerto Rico.",
   :cmns-col/isPartOf :fibo-be-ge-usj/UnitedStatesGovernment,
   :db/ident :fibo-fbc-fct-usjrga/FarmCreditAdministration,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/UnitedStatesJurisdiction,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "http://fca.gov/"},
   :rdf/type #{:fibo-be-ge-ge/GovernmentAgency :owl/NamedIndividual
               :fibo-fbc-fct-usjrga/FederalGovernmentEntity},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Farm Credit Administration",
   :skos/definition
   "Farm Credit Administration (FCA), an independent Federal agency that regulates and examines the banks, associations, and related entities of the Farm Credit System (FCS), including the Federal Agricultural Mortgage Corporation (Farmer Mac)"})

(def FarmCreditRegulator
  {:cmns-av/adaptedFrom {:xsd/anyURI "http://fca.gov/about/fca_in_brief.html"},
   :db/ident :fibo-fbc-fct-usjrga/FarmCreditRegulator,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usjrga/FarmCreditAdministration,
   :rdf/type #{:fibo-fbc-fct-usjrga/PrimaryFederalRegulator
               :fibo-fbc-pas-fpas/FinancialServiceProvider
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "farm credit regulator",
   :rdfs/seeAlso {:xsd/anyURI "http://fca.gov/"},
   :skos/definition
   "regulatory agency and registration authority role of the Farm Credit Administration (FCA)"})

(def FederalDepositInsuranceCorporation
  {:cmns-av/abbreviation "FDIC",
   :cmns-av/explanatoryNote
   "An independent agency of the federal government, the FDIC was created in 1933 in response to the thousands of bank failures that occurred in the 1920s and early 1930s. Since the start of FDIC insurance on January 1, 1934, no depositor has lost a single cent of insured funds as a result of a failure.",
   :db/ident :fibo-fbc-fct-usjrga/FederalDepositInsuranceCorporation,
   :fibo-be-ge-ge/isInstrumentOf :fibo-be-ge-usj/UnitedStatesGovernment,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "https://www.fdic.gov/"},
   :rdf/type #{:fibo-be-ge-ge/Instrumentality :owl/NamedIndividual
               :fibo-be-le-cb/Corporation
               :fibo-fbc-fct-usjrga/FederalGovernmentEntity},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Deposit Insurance Corporation",
   :skos/definition
   "Federal Deposit Insurance Corporation (FDIC), which preserves and promotes public confidence in the U.S. financial system by insuring deposits in banks and thrift institutions for at least $250,000; by identifying, monitoring and addressing risks to the deposit insurance funds; and by limiting the effect on the economy and the financial system when a bank or thrift institution fails."})

(def FederalDepositInsurerAndRegulator
  {:db/ident :fibo-fbc-fct-usjrga/FederalDepositInsurerAndRegulator,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usjrga/FederalDepositInsuranceCorporation,
   :fibo-fnd-rel-rel/manages :fibo-fbc-fct-usjrga/FDICInstitutionDirectory,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationAuthority
               :fibo-fbc-fct-usjrga/PrimaryFederalRegulator
               :fibo-fbc-pas-fpas/FinancialServiceProvider
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "federal deposit insurer and regulator",
   :rdfs/seeAlso {:xsd/anyURI "https://www.fdic.gov/"},
   :skos/definition
   "regulatory agency and registration authority role of the Federal Deposit Insurance Corporation (FDIC)"})

(def FederalFinancialInstitutionsExaminationCouncil
  {:cmns-av/abbreviation "FFIEC",
   :cmns-av/explanatoryNote
   "The Federal Financial Institutions Examination Council (FFIEC) was established on March 10, 1979, pursuant to title X of the Financial Institutions Regulatory and Interest Rate Control Act of 1978 (FIRA), Public Law 95-630. In 1989, title XI of the Financial Institutions Reform, Recovery and Enforcement Act of 1989 (FIRREA) established The Appraisal Subcommittee (ASC) within the Examination Council.",
   :cmns-col/hasMember
   #{:fibo-fbc-fct-usjrga/OfficeOfTheComptrollerOfTheCurrency
     :fibo-fbc-fct-usjrga/NationalCreditUnionAdministration
     :fibo-fbc-fct-usjrga/ConsumerFinancialProtectionBureau
     :fibo-fbc-fct-usjrga/FederalReserveBoard
     :fibo-fbc-fct-usjrga/FederalDepositInsuranceCorporation},
   :cmns-col/isPartOf :fibo-be-ge-usj/UnitedStatesGovernment,
   :db/ident
   :fibo-fbc-fct-usjrga/FederalFinancialInstitutionsExaminationCouncil,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/UnitedStatesJurisdiction,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "http://www.ffiec.gov/"},
   :rdf/type #{:fibo-be-ge-ge/GovernmentAgency :owl/NamedIndividual
               :fibo-fbc-fct-usjrga/FederalGovernmentEntity},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Financial Institutions Examination Council",
   :skos/definition
   "FFIEC, a formal interagency body empowered to prescribe uniform principles, standards, and report forms for the federal examination of financial institutions by the Board of Governors of the Federal Reserve System (FRB), the Federal Deposit Insurance Corporation (FDIC), the National Credit Union Administration (NCUA), the Office of the Comptroller of the Currency (OCC), and the Consumer Financial Protection Bureau (CFPB), and to make recommendations to promote uniformity in the supervision of financial institutions"})

(def FederalFinancialInstitutionsExaminationRegulator
  {:cmns-av/adaptedFrom {:xsd/anyURI "http://www.ffiec.gov/about.htm"},
   :db/ident
   :fibo-fbc-fct-usjrga/FederalFinancialInstitutionsExaminationRegulator,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usjrga/FederalFinancialInstitutionsExaminationCouncil,
   :fibo-fnd-rel-rel/manages
   :fibo-fbc-fct-usjrga/UniformBankPerformanceReportRepository,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationAuthority :owl/NamedIndividual
               :fibo-fbc-fct-rga/RegulatoryAgency},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "federal financial institutions examination regulator",
   :skos/definition
   "regulatory agency and registration authority role of the Federal Financial Institutions Examination Council (FFIEC)"})

(def FederalGovernmentEntity
  {:db/ident :fibo-fbc-fct-usjrga/FederalGovernmentEntity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "federal government entity",
   :rdfs/subClassOf #{:fibo-be-ge-ge/GovernmentBody
                      {:owl/unionOf [:fibo-be-ge-ge/Instrumentality
                                     :fibo-be-ge-ge/Polity
                                     :fibo-be-ge-ge/GovernmentAgency
                                     :fibo-be-ge-ge/GovernmentDepartment],
                       :rdf/type    :owl/Class}
                      {:owl/hasValue   :fibo-be-ge-usj/UnitedStatesJurisdiction,
                       :owl/onProperty :fibo-be-ge-ge/hasJurisdiction,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "formal organization that is an independent agency, instrumentality or other permanent or semi-permanent organization in the machinery of government in the United States, authorized by the executive branch or by Congress, that operates at the national (federal) level"})

(def FederalHousingFinanceAgency
  {:cmns-av/abbreviation "FHFA",
   :cmns-av/explanatoryNote
   "The FHFA is an independent regulatory agency responsible for the oversight of vital components of the secondary mortgage markets - the housing government sponsored enterprises of Fannie Mae, Freddie Mac and the Federal Home Loan Bank System. Combined these entities provide more than $5.5 trillion in funding for the U.S. mortgage markets and financial institutions. Additionally, FHFA is the conservator of Fannie Mae and Freddie Mac.",
   :cmns-col/isPartOf :fibo-be-ge-usj/UnitedStatesGovernment,
   :db/ident :fibo-fbc-fct-usjrga/FederalHousingFinanceAgency,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/UnitedStatesJurisdiction,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "http://www.fhfa.gov/"},
   :rdf/type #{:fibo-be-ge-ge/GovernmentAgency :owl/NamedIndividual
               :fibo-fbc-fct-usjrga/FederalGovernmentEntity},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Housing Finance Agency",
   :skos/definition
   "Federal Housing Finance Agency (FHFA), responsible for strengthening and securing the United States secondary mortgage markets by providing effective supervision, sound research, reliable data, and relevant policies"})

(def FederalHousingFinanceRegulator
  {:cmns-av/adaptedFrom {:xsd/anyURI "http://www.fhfa.gov/AboutUs"},
   :db/ident :fibo-fbc-fct-usjrga/FederalHousingFinanceRegulator,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usjrga/FederalHousingFinanceAgency,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationAuthority
               :fibo-fbc-fct-usjrga/PrimaryFederalRegulator
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "federal housing finance regulator",
   :skos/definition
   "regulatory agency and registration authority role of the Federal Housing Finance Agency (FHFA)"})

(def FederalReserveBankOfAtlanta
  {:db/ident :fibo-fbc-fct-usjrga/FederalReserveBankOfAtlanta,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-fbc-fct-usjrga/FederalReserveSixthDistrict,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "https://www.frbatlanta.org/"},
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrictBank
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve Bank of Atlanta",
   :skos/definition
   "Federal Reserve Bank of Atlanta, whose jurisdiction is the Sixth District of the Federal Reserve"})

(def FederalReserveBankOfBoston
  {:db/ident :fibo-fbc-fct-usjrga/FederalReserveBankOfBoston,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-fbc-fct-usjrga/FederalReserveFirstDistrict,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "http://www.bostonfed.org/"},
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrictBank
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve Bank of Boston",
   :skos/definition
   "Federal Reserve Bank of Boston, whose jurisdiction is the First District of the Federal Reserve"})

(def FederalReserveBankOfChicago
  {:db/ident :fibo-fbc-fct-usjrga/FederalReserveBankOfChicago,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-fbc-fct-usjrga/FederalReserveSeventhDistrict,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "https://www.chicagofed.org/"},
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrictBank
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve Bank of Chicago",
   :skos/definition
   "Federal Reserve Bank of Chicago, whose jurisdiction is the Seventh District of the Federal Reserve"})

(def FederalReserveBankOfCleveland
  {:db/ident :fibo-fbc-fct-usjrga/FederalReserveBankOfCleveland,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-fbc-fct-usjrga/FederalReserveFourthDistrict,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "https://www.clevelandfed.org/"},
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrictBank
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve Bank of Cleveland",
   :skos/definition
   "Federal Reserve Bank of Cleveland, whose jurisdiction is the Fourth District of the Federal Reserve"})

(def FederalReserveBankOfDallas
  {:db/ident :fibo-fbc-fct-usjrga/FederalReserveBankOfDallas,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-fbc-fct-usjrga/FederalReserveEleventhDistrict,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "http://www.dallasfed.org/"},
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrictBank
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve Bank of Dallas",
   :skos/definition
   "Federal Reserve Bank of Dallas, whose jurisdiction is the Eleventh District of the Federal Reserve"})

(def FederalReserveBankOfKansasCity
  {:db/ident :fibo-fbc-fct-usjrga/FederalReserveBankOfKansasCity,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-fbc-fct-usjrga/FederalReserveTenthDistrict,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "https://www.kansascityfed.org/"},
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrictBank
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve Bank of Kansas City",
   :skos/definition
   "Federal Reserve Bank of Kansas City, whose jurisdiction is the Tenth District of the Federal Reserve"})

(def FederalReserveBankOfMinneapolis
  {:db/ident :fibo-fbc-fct-usjrga/FederalReserveBankOfMinneapolis,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-fbc-fct-usjrga/FederalReserveNinthDistrict,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "https://www.minneapolisfed.org/"},
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrictBank
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve Bank of Minneapolis",
   :skos/definition
   "Federal Reserve Bank of Minneapolis, whose jurisdiction is the Ninth District of the Federal Reserve"})

(def FederalReserveBankOfNewYork
  {:db/ident :fibo-fbc-fct-usjrga/FederalReserveBankOfNewYork,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-fbc-fct-usjrga/FederalReserveSecondDistrict,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "http://www.newyorkfed.org/"},
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usjrga/FederalReserveBankOfNewYork-US-NY,
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrictBank
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve Bank of New York",
   :skos/definition
   "Federal Reserve Bank of New York, whose jurisdiction is the Second District of the Federal Reserve"})

(def FederalReserveBankOfNewYork-US-NY
  {:db/ident :fibo-fbc-fct-usjrga/FederalReserveBankOfNewYork-US-NY,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-usjrga/FederalReserveBankOfNewYorkAddress,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "http://www.newyorkfed.org/"},
   :rdf/type #{:fibo-be-ge-ge/Instrumentality :owl/NamedIndividual
               :fibo-fbc-fct-usjrga/FederalGovernmentEntity},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve Bank of New York US-NY",
   :skos/definition
   "legal entity and instrumentality that is Federal Reserve Bank of New York"})

(def FederalReserveBankOfNewYorkAddress
  {:db/ident :fibo-fbc-fct-usjrga/FederalReserveBankOfNewYorkAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "33 Liberty Street",
   :fibo-fnd-plc-adr/hasPostalCode "10045",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/New_York,
   :fibo-fnd-plc-loc/hasSubdivision :lcc-3166-2-us/NewYork,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/ConventionalStreetAddress},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve Bank of New York address",
   :skos/definition
   "headquarters address for the Federal Reserve Bank of New York"})

(def FederalReserveBankOfPhiladelphia
  {:db/ident :fibo-fbc-fct-usjrga/FederalReserveBankOfPhiladelphia,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-fbc-fct-usjrga/FederalReserveThirdDistrict,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI
                                 "https://www.philadelphiafed.org/"},
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrictBank
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve Bank of Philadelphia",
   :skos/definition
   "Federal Reserve Bank of Philadelphia, whose jurisdiction is the Third District of the Federal Reserve"})

(def FederalReserveBankOfRichmond
  {:db/ident :fibo-fbc-fct-usjrga/FederalReserveBankOfRichmond,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-fbc-fct-usjrga/FederalReserveFifthDistrict,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "https://www.richmondfed.org/"},
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrictBank
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve Bank of Richmond",
   :skos/definition
   "Federal Reserve Bank of Richmond, whose jurisdiction is the Fifth District of the Federal Reserve"})

(def FederalReserveBankOfSanFrancisco
  {:db/ident :fibo-fbc-fct-usjrga/FederalReserveBankOfSanFrancisco,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-fbc-fct-usjrga/FederalReserveTwelfthDistrict,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "http://www.frbsf.org/"},
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrictBank
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve Bank of San Francisco",
   :skos/definition
   "Federal Reserve Bank of San Francisco, whose jurisdiction is the Twelfth District of the Federal Reserve"})

(def FederalReserveBankOfStLouis
  {:db/ident :fibo-fbc-fct-usjrga/FederalReserveBankOfStLouis,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-fbc-fct-usjrga/FederalReserveEighthDistrict,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "https://www.stlouisfed.org/"},
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrictBank
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve Bank of St. Louis",
   :skos/definition
   "Federal Reserve Bank of St. Louis, whose jurisdiction is the Eighth District of the Federal Reserve"})

(def FederalReserveBoard
  {:cmns-av/abbreviation "FRB",
   :cmns-av/explanatoryNote
   "The members of the Board of Governors are nominated by the President of the United States and confirmed by the U.S. Senate. By law, the appointments must yield a 'fair representation of the financial, agricultural, industrial, and commercial interests and geographical divisions of the country,' and no two Governors may come from the same Federal Reserve District.\n\nThe full term of a Governor is 14 years; appointments are staggered so that one term expires on January 31 of each even-numbered year. A Governor who has served a full term may not be reappointed, but a Governor who was appointed to complete the balance of an unexpired term may be reappointed to a full 14-year term.\n\nOnce appointed, Governors may not be removed from office for their policy views. The lengthy terms and staggered appointments are intended to contribute to the insulation of the Board--and the Federal Reserve System as a whole--from day-to-day political pressures to which it might otherwise be subject.\n\nIn addition to serving as members of the Board, the Chairman and Vice Chairman of the Board serve terms of four years, and they may be reappointed to those roles and serve until their terms as Governors expire. The Chairman serves as public spokesperson and representative of the Board and manager of the Board's staff. The Chairman also presides at Board meetings. Affirming the apolitical nature of the Board, recent Presidents of both major political parties have selected the same person as Board Chairman.",
   :cmns-av/synonym "Federal Reserve Board of Governors",
   :cmns-col/isPartOf :fibo-fbc-fct-usjrga/FederalReserveSystem,
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveBoard,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "https://www.federalreserve.gov/"},
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/GovernmentDepartment
               :fibo-fbc-fct-usjrga/FederalGovernmentEntity},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve Board",
   :skos/definition "Federal Reserve Board (FRB)"})

(def FederalReserveDistrict
  {:cmns-av/adaptedFrom {:xsd/anyURI "http://federalreserve.gov/otherfrb.htm"},
   :cmns-av/explanatoryNote
   "The Federal Reserve officially identifies Districts by number and Reserve Bank city. In the 12th District, the Seattle Branch serves Alaska, and the San Francisco Bank serves Hawaii. The System serves commonwealths and territories as follows: the New York Bank serves the Commonwealth of Puerto Rico and the U.S. Virgin Islands; the San Francisco Bank serves American Samoa, Guam, and the Commonwealth of the Northern Mariana Islands. The Board of Governors revised the branch boundaries of the System in February 1996.",
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveDistrict,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve district",
   :rdfs/subClassOf :fibo-fnd-law-jur/Jurisdiction,
   :skos/definition
   "a region of the US identifying the jurisdiction of a Federal Reserve Bank, numbered and named for the city in which that reserve bank is located"})

(def FederalReserveDistrictBank
  {:cmns-av/adaptedFrom {:xsd/anyURI "http://federalreserve.gov/"},
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveDistrictBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve district bank",
   :rdfs/subClassOf
   #{:fibo-fbc-fct-fse/CentralBank
     :fibo-fbc-fct-usjrga/FederalReserveSystemMember
     {:owl/onClass    :fibo-fbc-fct-usjrga/FederalReserveDistrict,
      :owl/onProperty :fibo-be-ge-ge/hasJurisdiction,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/hasValue
      :fibo-fbc-fct-usjrga/FederalReserveRegulatoryAgencyAndCentralBank,
      :owl/onProperty :cmns-col/isPartOf,
      :rdf/type :owl/Restriction}},
   :skos/definition
   "Federal Reserve district and member bank, with jurisdiction over a specific region of the US, named for the city in which the reserve bank is located"})

(def FederalReserveDistrictIdentifier
  {:db/ident :fibo-fbc-fct-usjrga/FederalReserveDistrictIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve district identifier",
   :rdfs/subClassOf #{{:owl/onClass :fibo-fbc-fct-usjrga/FederalReserveDistrict,
                       :owl/onProperty :cmns-id/identifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type :owl/Restriction}
                      :lcc-cr/GeographicRegionIdentifier},
   :skos/definition "identifier associated with a Federal Reserve district"})

(def FederalReserveEighthDistrict
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.stlouisfed.org/about-us/what-we-do"},
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveEighthDistrict,
   :fibo-fnd-law-jur/hasReach #{:lcc-3166-2-us/Illinois :lcc-3166-2-us/Arkansas
                                :lcc-3166-2-us/Mississippi
                                :lcc-3166-2-us/Missouri :lcc-3166-2-us/Tennessee
                                :lcc-3166-2-us/Indiana :lcc-3166-2-us/Kentucky},
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrict
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve Eighth District",
   :skos/definition
   "jurisdiction of the Eighth District of the Federal Reserve, which covers all of Arkansas, eastern Missouri, western Kentucky, western Tennessee, southern Illinois, southern Indiana and northern Mississippi"})

(def FederalReserveEighthDistrictIdentifier
  {:cmns-id/identifies :fibo-fbc-fct-usjrga/FederalReserveEighthDistrict,
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveEighthDistrictIdentifier,
   :fibo-fnd-rel-rel/hasTag "8",
   :fibo-fnd-rel-rel/hasTextualName
   "Eighth District of the Federal Reserve System",
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrictIdentifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve eighth district identifier",
   :skos/definition
   "identifier for the eighth district of the Federal Reserve, which represents the district governed by the Federal Reserve Bank of St. Louis"})

(def FederalReserveEleventhDistrict
  {:cmns-av/adaptedFrom {:xsd/anyURI "https://www.dallasfed.org/fed"},
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveEleventhDistrict,
   :fibo-fnd-law-jur/hasReach #{:lcc-3166-2-us/Texas :lcc-3166-2-us/Louisiana
                                :lcc-3166-2-us/NewMexico},
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrict
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve Eleventh District",
   :skos/definition
   "jurisdiction of the Eleventh District of the Federal Reserve, which covers Texas, northern Louisiana and southern New Mexico"})

(def FederalReserveEleventhDistrictIdentifier
  {:cmns-id/identifies :fibo-fbc-fct-usjrga/FederalReserveEleventhDistrict,
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveEleventhDistrictIdentifier,
   :fibo-fnd-rel-rel/hasTag "11",
   :fibo-fnd-rel-rel/hasTextualName
   "Eleventh District of the Federal Reserve System",
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrictIdentifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve eleventh district identifier",
   :skos/definition
   "identifier for the eleventh district of the Federal Reserve, which represents the district governed by the Federal Reserve Bank of Dallas"})

(def FederalReserveFifthDistrict
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.richmondfed.org/about_us/who_we_are_what_we_do"},
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveFifthDistrict,
   :fibo-fnd-law-jur/hasReach
   #{:lcc-3166-2-us/Maryland :lcc-3166-2-us/DistrictOfColumbia
     :lcc-3166-2-us/SouthCarolina :lcc-3166-2-us/NorthCarolina
     :lcc-3166-2-us/WestVirginia},
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrict
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve Fifth District",
   :skos/definition
   "jurisdiction of the Fifth District of the Federal Reserve, which covers Maryland, North Carolina, South Carolina, Washington, D.C., and most of West Virginia"})

(def FederalReserveFifthDistrictIdentifier
  {:cmns-id/identifies :fibo-fbc-fct-usjrga/FederalReserveFifthDistrict,
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveFifthDistrictIdentifier,
   :fibo-fnd-rel-rel/hasTag "5",
   :fibo-fnd-rel-rel/hasTextualName
   "Fifth District of the Federal Reserve System",
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrictIdentifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve fifth district identifier",
   :skos/definition
   "identifier for the fifth district of the Federal Reserve, which represents the district governed by the Federal Reserve Bank of Richmond"})

(def FederalReserveFirstDistrict
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "http://federalreserve.gov/aboutthefed/directors/map-of-districts.htm"},
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveFirstDistrict,
   :fibo-fnd-law-jur/hasReach #{:lcc-3166-2-us/Massachusetts
                                :lcc-3166-2-us/Maine
                                :lcc-3166-2-us/NewHampshire},
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrict
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve First District",
   :skos/definition
   "jurisdiction of the First District of the Federal Reserve, which covers the New England states of Maine, New Hampshire, Vermont, and Massachusetts"})

(def FederalReserveFirstDistrictIdentifier
  {:cmns-id/identifies :fibo-fbc-fct-usjrga/FederalReserveFirstDistrict,
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveFirstDistrictIdentifier,
   :fibo-fnd-rel-rel/hasTag "1",
   :fibo-fnd-rel-rel/hasTextualName
   "First District of the Federal Reserve System",
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrictIdentifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve first district identifier",
   :skos/definition
   "identifier for the first district of the Federal Reserve, which represents the district governed by the Federal Reserve Bank of Boston"})

(def FederalReserveFourthDistrict
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.clevelandfed.org/en/about-us/the-cleveland-fed.aspx"},
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveFourthDistrict,
   :fibo-fnd-law-jur/hasReach #{:lcc-3166-2-us/Ohio :lcc-3166-2-us/Pennsylvania
                                :lcc-3166-2-us/Kentucky
                                :lcc-3166-2-us/WestVirginia},
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrict
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve Fourth District",
   :skos/definition
   "jurisdiction of the Fourth District of the Federal Reserve, which covers Ohio, western Pennsylvania, the northern panhandle of West Virginia, and eastern Kentucky"})

(def FederalReserveFourthDistrictIdentifier
  {:cmns-id/identifies :fibo-fbc-fct-usjrga/FederalReserveFourthDistrict,
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveFourthDistrictIdentifier,
   :fibo-fnd-rel-rel/hasTag "4",
   :fibo-fnd-rel-rel/hasTextualName
   "Fourth District of the Federal Reserve System",
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrictIdentifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve fourth district identifier",
   :skos/definition
   "identifier for the fourth district of the Federal Reserve, which represents the district governed by the Federal Reserve Bank of Cleveland"})

(def FederalReserveNinthDistrict
  {:cmns-av/adaptedFrom {:xsd/anyURI "https://www.minneapolisfed.org/"},
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveNinthDistrict,
   :fibo-fnd-law-jur/hasReach
   #{:lcc-3166-2-us/Minnesota :lcc-3166-2-us/Wisconsin :lcc-3166-2-us/Montana
     :lcc-3166-2-us/Michigan :lcc-3166-2-us/SouthDakota
     :lcc-3166-2-us/NorthDakota},
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrict
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve Ninth District",
   :skos/definition
   "jurisdiction of the Ninth District of the Federal Reserve, which covers Minnesota, Montana, North and South Dakota, 26 counties in northwestern Wisconsin and the Upper Peninsula of Michigan"})

(def FederalReserveNinthDistrictIdentifier
  {:cmns-id/identifies :fibo-fbc-fct-usjrga/FederalReserveNinthDistrict,
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveNinthDistrictIdentifier,
   :fibo-fnd-rel-rel/hasTag "9",
   :fibo-fnd-rel-rel/hasTextualName
   "Ninth District of the Federal Reserve System",
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrictIdentifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve ninth district identifier",
   :skos/definition
   "identifier for the ninth district of the Federal Reserve, which represents the district governed by the Federal Reserve Bank of Minneapolis"})

(def FederalReserveRegulatoryAgencyAndCentralBank
  {:db/ident :fibo-fbc-fct-usjrga/FederalReserveRegulatoryAgencyAndCentralBank,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usjrga/FederalReserveSystem,
   :fibo-fnd-rel-rel/manages
   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :rdf/type
   #{:fibo-fbc-fct-ra/RegistrationAuthority :fibo-fbc-fct-fse/CentralBank
     :fibo-fbc-fct-usjrga/PrimaryFederalRegulator :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve regulatory agency and central bank",
   :rdfs/seeAlso {:xsd/anyURI "http://www.federalreserve.gov/"},
   :skos/definition
   "regulatory agency and registration authority role of the Federal Reserve System"})

(def FederalReserveSecondDistrict
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "http://www.newyorkfed.org/aboutthefed/whatwedo.html"},
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveSecondDistrict,
   :fibo-fnd-law-jur/hasReach
   #{:lcc-3166-2-us/NewYork :lcc-3166-2-us/Connecticut :lcc-3166-1/PuertoRico
     :lcc-3166-2-us/NewJersey :lcc-3166-1/VirginIslandsUS},
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrict
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve Second District",
   :skos/definition
   "jurisdiction of the Second District of the Federal Reserve, which covers New York state, the 12 northern counties of New Jersey, Fairfield County in Connecticut, Puerto Rico and the U.S. Virgin Islands"})

(def FederalReserveSecondDistrictIdentifier
  {:cmns-id/identifies :fibo-fbc-fct-usjrga/FederalReserveSecondDistrict,
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveSecondDistrictIdentifier,
   :fibo-fnd-rel-rel/hasTag "2",
   :fibo-fnd-rel-rel/hasTextualName
   "Second District of the Federal Reserve System",
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrictIdentifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve second district identifier",
   :skos/definition
   "identifier for the second district of the Federal Reserve, which represents the district governed by the Federal Reserve Bank of New York"})

(def FederalReserveSeventhDistrict
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.chicagofed.org/utilities/about-us/index"},
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveSeventhDistrict,
   :fibo-fnd-law-jur/hasReach #{:lcc-3166-2-us/Wisconsin :lcc-3166-2-us/Illinois
                                :lcc-3166-2-us/Michigan :lcc-3166-2-us/Iowa
                                :lcc-3166-2-us/Indiana},
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrict
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve Seventh District",
   :skos/definition
   "jurisdiction of the Seventh District of the Federal Reserve, which covers all of Iowa and most of Illinois, Indiana, Michigan and Wisconsin"})

(def FederalReserveSeventhDistrictIdentifier
  {:cmns-id/identifies :fibo-fbc-fct-usjrga/FederalReserveSeventhDistrict,
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveSeventhDistrictIdentifier,
   :fibo-fnd-rel-rel/hasTag "7",
   :fibo-fnd-rel-rel/hasTextualName
   "Seventh District of the Federal Reserve System",
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrictIdentifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve seventh district identifier",
   :skos/definition
   "identifier for the seventh district of the Federal Reserve, which represents the district governed by the Federal Reserve Bank of Chicago"})

(def FederalReserveSixthDistrict
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.frbatlanta.org/about/atlantafed.aspx"},
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveSixthDistrict,
   :fibo-fnd-law-jur/hasReach
   #{:lcc-3166-2-us/Georgia :lcc-3166-2-us/Mississippi :lcc-3166-2-us/Louisiana
     :lcc-3166-2-us/Tennessee :lcc-3166-2-us/Florida :lcc-3166-2-us/Alabama},
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrict
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve Sixth District",
   :skos/definition
   "jurisdiction of the Sixth District of the Federal Reserve, which covers Alabama, Florida, and Georgia, and portions of Louisiana, Mississippi, and Tennessee"})

(def FederalReserveSixthDistrictIdentifier
  {:cmns-id/identifies :fibo-fbc-fct-usjrga/FederalReserveSixthDistrict,
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveSixthDistrictIdentifier,
   :fibo-fnd-rel-rel/hasTag "6",
   :fibo-fnd-rel-rel/hasTextualName
   "Sixth District of the Federal Reserve System",
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrictIdentifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve sixth district identifier",
   :skos/definition
   "identifier for the sixth district of the Federal Reserve, which represents the district governed by the Federal Reserve Bank of Atlanta"})

(def FederalReserveSystem
  {:cmns-av/abbreviation "FRS",
   :cmns-av/explanatoryNote
   "The Federal Reserve, the central bank of the United States, provides the nation with a safe, flexible, and stable monetary and financial system.",
   :cmns-av/synonym #{"Fed" "Federal Reserve"},
   :cmns-col/isPartOf :fibo-be-ge-usj/UnitedStatesGovernment,
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveSystem,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/UnitedStatesJurisdiction,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "https://www.federalreserve.gov/"},
   :rdf/type #{:fibo-be-ge-ge/GovernmentAgency :owl/NamedIndividual
               :fibo-fbc-fct-usjrga/FederalGovernmentEntity},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve System",
   :skos/definition
   "central banking system of the U.S., comprised of the Federal Reserve Board, the 12 Federal Reserve Banks, the Federal Open Market Committee, and the national and state member banks"})

(def FederalReserveSystemAsMemberBearingOrganization
  {:db/ident
   :fibo-fbc-fct-usjrga/FederalReserveSystemAsMemberBearingOrganization,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usjrga/FederalReserveSystem,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-org-org/MemberBearingOrganization},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve System as member bearing organization",
   :skos/definition
   "central banking system as an organization that has members that are people or other organizations"})

(def FederalReserveSystemMember
  {:cmns-av/adaptedFrom {:xsd/anyURI "http://federalreserve.gov/"},
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveSystemMember,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve System member",
   :rdfs/subClassOf #{{:owl/onProperty :fibo-fnd-pty-rl/isPlayedBy,
                       :owl/someValuesFrom
                       {:owl/hasValue :fibo-fbc-fct-usjrga/FederalReserveSystem,
                        :owl/onProperty :cmns-col/isMemberOf,
                        :rdf/type :owl/Restriction},
                       :rdf/type :owl/Restriction}
                      :fibo-fbc-fct-fse/FinancialInstitution
                      :fibo-fnd-org-org/OrganizationMember},
   :skos/definition
   "financial institution that is a member of the Federal Reserve System (FRS)"})

(def FederalReserveSystemMembership
  {:db/ident :fibo-fbc-fct-usjrga/FederalReserveSystemMembership,
   :fibo-fnd-org-org/hasMembership
   :fibo-fbc-fct-usjrga/FederalReserveSystemAsMemberBearingOrganization,
   :rdf/type #{:fibo-fnd-org-org/Membership :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve System membership",
   :skos/definition
   "membership situation, in which the Federal Reserve System has at least one member for some period of time"})

(def FederalReserveSystemNonMemberInstitution
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :cmns-av/explanatoryNote
   "A non-member bank is a commercial bank that is state-chartered and NOT a member of the Federal Reserve System. It includes all insured commercial banks and industrial banks.",
   :cmns-av/synonym "non-member bank",
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveSystemNonMemberInstitution,
   :owl/disjointWith :fibo-fbc-fct-usjrga/FederalReserveSystemMember,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve System non-member institution",
   :rdfs/subClassOf #{:fibo-fbc-fct-fse/DepositoryInstitution
                      {:owl/onProperty :fibo-fnd-pty-rl/isPlayedBy,
                       :owl/someValuesFrom
                       {:owl/intersectionOf
                        [{:owl/hasValue   :lcc-3166-1/UnitedStatesOfAmerica,
                          :owl/onProperty :fibo-fnd-org-fm/isDomiciledIn,
                          :rdf/type       :owl/Restriction}
                         {:owl/hasValue
                          :fibo-be-ge-usj/UnitedStatesJurisdiction,
                          :owl/onProperty :fibo-be-le-cb/isIncorporatedIn,
                          :rdf/type :owl/Restriction}],
                        :rdf/type :owl/Class},
                       :rdf/type :owl/Restriction}
                      {:owl/unionOf [:fibo-fbc-fct-usfse/StateCharteredBank
                                     :fibo-fbc-fct-usfse/IndustrialBank],
                       :rdf/type    :owl/Class}},
   :skos/definition
   "depository institution that is not member of the Federal Reserve System (FRS)"})

(def FederalReserveTenthDistrict
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.kansascityfed.org/aboutus/kcfedinformation"},
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveTenthDistrict,
   :fibo-fnd-law-jur/hasReach #{:lcc-3166-2-us/Oklahoma :lcc-3166-2-us/Nebraska
                                :lcc-3166-2-us/NewMexico :lcc-3166-2-us/Colorado
                                :lcc-3166-2-us/Missouri :lcc-3166-2-us/Wyoming
                                :lcc-3166-2-us/Kansas},
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrict
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve Tenth District",
   :skos/definition
   "jurisdiction of the Tenth District of the Federal Reserve, which covers western Missouri, Nebraska, Kansas, Oklahoma, Wyoming, Colorado and northern New Mexico"})

(def FederalReserveTenthDistrictIdentifier
  {:cmns-id/identifies :fibo-fbc-fct-usjrga/FederalReserveTenthDistrict,
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveTenthDistrictIdentifier,
   :fibo-fnd-rel-rel/hasTag "10",
   :fibo-fnd-rel-rel/hasTextualName
   "Tenth District of the Federal Reserve System",
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrictIdentifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve tenth district identifier",
   :skos/definition
   "identifier for the tenth district of the Federal Reserve, which represents the district governed by the Federal Reserve Bank of Kansas City"})

(def FederalReserveThirdDistrict
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.philadelphiafed.org/about-the-fed/"},
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveThirdDistrict,
   :fibo-fnd-law-jur/hasReach #{:lcc-3166-2-us/Delaware
                                :lcc-3166-2-us/Pennsylvania
                                :lcc-3166-2-us/NewJersey},
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrict
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve Third District",
   :skos/definition
   "jurisdiction of the Third District of the Federal Reserve, which covers eastern Pennsylvania, southern New Jersey, and Delaware"})

(def FederalReserveThirdDistrictIdentifier
  {:cmns-id/identifies :fibo-fbc-fct-usjrga/FederalReserveThirdDistrict,
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveThirdDistrictIdentifier,
   :fibo-fnd-rel-rel/hasTag "3",
   :fibo-fnd-rel-rel/hasTextualName
   "Third District of the Federal Reserve System",
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrictIdentifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve third district identifier",
   :skos/definition
   "identifier for the third district of the Federal Reserve, which represents the district governed by the Federal Reserve Bank of Philadelphia"})

(def FederalReserveTwelfthDistrict
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "http://www.frbsf.org/our-district/about/our-history/"},
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveTwelfthDistrict,
   :fibo-fnd-law-jur/hasReach
   #{:lcc-3166-1/AmericanSamoa :lcc-3166-2-us/Hawaii :lcc-3166-2-us/Utah
     :lcc-3166-1/Guam :lcc-3166-2-us/Washington :lcc-3166-2-us/Idaho
     :lcc-3166-2-us/Arizona :lcc-3166-2-us/Oregon
     :lcc-3166-1/NorthernMarianaIslands :lcc-3166-2-us/California
     :lcc-3166-2-us/Nevada :lcc-3166-2-us/Alaska},
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrict
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve Twelfth District",
   :skos/definition
   "jurisdiction of the Twelfth District of the Federal Reserve, which covers Arizona, California, Idaho, Nevada, Oregon, Utah, and Washington, as well as Alaska, Hawaii, American Samoa, Guam, and the Commonwealth of the Northern Mariana Islands"})

(def FederalReserveTwelfthDistrictIdentifier
  {:cmns-id/identifies :fibo-fbc-fct-usjrga/FederalReserveTwelfthDistrict,
   :db/ident :fibo-fbc-fct-usjrga/FederalReserveTwelfthDistrictIdentifier,
   :fibo-fnd-rel-rel/hasTag "12",
   :fibo-fnd-rel-rel/hasTextualName
   "Twelfth District of the Federal Reserve System",
   :rdf/type #{:fibo-fbc-fct-usjrga/FederalReserveDistrictIdentifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Federal Reserve twelfth district identifier",
   :skos/definition
   "identifier for the twelfth district of the Federal Reserve, which represents the district governed by the Federal Reserve Bank of San Francisco"})

(def FederalStabilityMonitorAndRegulator
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "http://www.treasury.gov/initiatives/fsoc/Pages/home.aspx"},
   :db/ident :fibo-fbc-fct-usjrga/FederalStabilityMonitorAndRegulator,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usjrga/FinancialStabilityOversightCouncil,
   :rdf/type #{:owl/NamedIndividual :fibo-fbc-fct-rga/RegulatoryAgency},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "federal stability monitor and regulator",
   :skos/definition
   "regulatory agency role of the Federal Stability Oversight Council (FSOC)"})

(def FinancialIndustryRegulator
  {:cmns-av/adaptedFrom {:xsd/anyURI "http://www.finra.org/about/what-we-do"},
   :db/ident :fibo-fbc-fct-usjrga/FinancialIndustryRegulator,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usjrga/FinancialIndustryRegulatoryAuthority,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-fse/SelfRegulatingOrganization},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "financial industry regulator",
   :skos/definition
   "regulatory agency and self-regulatory organizational role of the Financial Industry Regulatory Authority (FINRA)"})

(def FinancialIndustryRegulatoryAuthority
  {:cmns-av/abbreviation "FINRA",
   :cmns-av/adaptedFrom {:xsd/anyURI "http://www.finra.org/about/what-we-do"},
   :db/ident :fibo-fbc-fct-usjrga/FinancialIndustryRegulatoryAuthority,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "http://www.finra.org/"},
   :rdf/type #{:owl/NamedIndividual
               :fibo-be-le-fbo/NonGovernmentalOrganization},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Financial Industry Regulatory Authority",
   :skos/definition
   "largest non-governmental regulator of securities firms in the United States, namely, the Financial Industry Regulatory Authority (FINRA)"})

(def FinancialStabilityOversightCouncil
  {:cmns-av/abbreviation "FSOC",
   :cmns-av/explanatoryNote
   "The Council is charged with identifying risks to the financial stability of the United States; promoting market discipline; and responding to emerging risks to the stability of the United States' financial system. The Council consists of 10 voting members and 5 nonvoting members and brings together the expertise of federal financial regulators, state regulators, and an independent insurance expert appointed by the President.",
   :cmns-col/hasMember
   #{:fibo-fbc-fct-usjrga/OfficeOfTheComptrollerOfTheCurrency
     :fibo-fbc-fct-usjrga/NationalCreditUnionAdministration
     :fibo-fbc-fct-usjrga/ConsumerFinancialProtectionBureau
     :fibo-fbc-fct-usjrga/FederalReserveBoard
     :fibo-fbc-fct-usjrga/FederalDepositInsuranceCorporation
     :fibo-fbc-fct-usjrga/CommodityFuturesTradingCommission
     :fibo-fbc-fct-usjrga/SecuritiesAndExchangeCommission
     :fibo-fbc-fct-usjrga/FederalHousingFinanceAgency},
   :cmns-col/isPartOf :fibo-fbc-fct-usjrga/USDepartmentOfTheTreasury,
   :db/ident :fibo-fbc-fct-usjrga/FinancialStabilityOversightCouncil,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/UnitedStatesJurisdiction,
   :fibo-fnd-plc-vrt/hasWebsite
   {:xsd/anyURI "https://www.treasury.gov/initiatives/fsoc/Pages/home.aspx"},
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/GovernmentDepartment
               :fibo-fbc-fct-usjrga/FederalGovernmentEntity},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Financial Stability Oversight Council",
   :skos/definition
   "Financial Stability Oversight Council (FSOC), which provides comprehensive monitoring of the stability of our nation's financial system, as established under the Dodd-Frank Wall Street Reform and Consumer Protection Act"})

(def IssuerIdentificationNumber
  {:cmns-av/abbreviation "IIN",
   :cmns-av/explanatoryNote
   #{"IINs are issued directly by the American Banker's Association (ABA) in the US. The ABA is the Registration Authority (RA) for ISO/IEC 7812, which defines the IIN, in other words."
     "The issuer identification number (IIN) is a six digit number that is unique to a single card issuer. The number is only used to identify the card issuer, and is not used to identify a particular product, service, or region associated with the card issuer."},
   :db/ident :fibo-fbc-fct-usjrga/IssuerIdentificationNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "issuer identification number",
   :rdfs/seeAlso {:xsd/anyURI "https://en.wikipedia.org/wiki/ISO/IEC_7812"},
   :rdfs/subClassOf
   #{:fibo-fbc-fct-ra/RegistryIdentifier
     :fibo-fbc-fct-fse/FinancialServiceProviderIdentifier
     {:owl/onClass    :fibo-fbc-fct-fse/FinancialInstitution,
      :owl/onProperty :cmns-id/identifies,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/hasValue
      :fibo-fbc-fct-usjrga/AmericanBankersAssociationRegistrationAuthority,
      :owl/onProperty :fibo-fbc-fct-ra/isRegisteredBy,
      :rdf/type :owl/Restriction}
     {:owl/hasValue   :fibo-fbc-fct-usjrga/ABAIINRegistry,
      :owl/onProperty :fibo-fbc-fct-ra/isRegisteredIn,
      :rdf/type       :owl/Restriction}
     {:owl/hasValue
      :fibo-fbc-fct-usjrga/AmericanBankersAssociationRegistrationAuthority,
      :owl/onProperty :fibo-fbc-fct-ra/hasRegistrationAuthority,
      :rdf/type :owl/Restriction}},
   :skos/definition
   "a numbering system that allows a credit, debit, or other card to be identified as having been issued by a particular financial institution"})

(def MassachusettsBusinessRegistrar
  {:db/ident :fibo-fbc-fct-usjrga/MassachusettsBusinessRegistrar,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usjrga/MassachusettsCorporationsDivision,
   :fibo-fnd-rel-rel/manages
   :fibo-fbc-fct-usjrga/MassachusettsCorporationRegistry,
   :fibo-fnd-rel-rel/provides
   :fibo-fbc-fct-usjrga/MassachusettsBusinessRegistrationService,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/BusinessRegistrationAuthority
               :fibo-fbc-fct-rga/RegulatoryAgency},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Massachusetts business registrar",
   :rdfs/seeAlso {:xsd/anyURI "http://www.sec.state.ma.us/cor/coridx.htm"},
   :skos/definition
   "regulatory agency and registration authority role of the Commonwealth of Massachusetts's Corporations Division"})

(def MassachusettsBusinessRegistrationIdentifierScheme
  {:db/ident
   :fibo-fbc-fct-usjrga/MassachusettsBusinessRegistrationIdentifierScheme,
   :rdf/type #{:owl/NamedIndividual
               :fibo-be-corp-corp/RegistrationIdentifierScheme},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Massachusetts business registration identifier scheme",
   :skos/definition
   "registration identifier scheme for business entity identifiers defined by the Commonwealth of Massachusetts's Corporations Division for the registration of business entities"})

(def MassachusettsBusinessRegistrationService
  {:db/ident :fibo-fbc-fct-usjrga/MassachusettsBusinessRegistrationService,
   :fibo-fnd-pas-pas/isProvisionedBy
   :fibo-fbc-fct-usjrga/MassachusettsBusinessRegistrar,
   :fibo-fnd-rel-rel/isProvidedBy
   :fibo-fbc-fct-usjrga/MassachusettsBusinessRegistrar,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationService :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Massachusetts business registration service",
   :rdfs/seeAlso {:xsd/anyURI "http://www.sec.state.ma.us/cor/corservices.htm"},
   :skos/definition
   "Commonwealth of Massachusetts, Secretary of State, Corporations Division, service for the registration of business entities"})

(def MassachusettsCorporationRegistry
  {:db/ident :fibo-fbc-fct-usjrga/MassachusettsCorporationRegistry,
   :fibo-fbc-fct-breg/hasRegistryName "Massachusetts Corporation Registry",
   :fibo-fnd-plc-vrt/hasWebsite
   {:xsd/anyURI
    "http://corp.sec.state.ma.us/corpweb/CorpSearch/CorpSearch.aspx"},
   :fibo-fnd-rel-rel/isGovernedBy
   :fibo-be-ge-usj/StateOfMassachusettsJurisdiction,
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-usjrga/MassachusettsBusinessRegistrar,
   :rdf/type #{:fibo-fbc-fct-breg/BusinessRegistry :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Massachusetts corporation registry",
   :skos/definition
   "registry of business entities for businesses that have registered with the Commonwealth of Massachusetts Secretary of State"})

(def MassachusettsCorporationsDivision
  {:cmns-col/isPartOf :fibo-be-ge-usj/StateOfMassachusettsGovernment,
   :db/ident :fibo-fbc-fct-usjrga/MassachusettsCorporationsDivision,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI
                                 "http://www.sec.state.ma.us/cor/coridx.htm"},
   :rdf/type #{:fibo-fbc-fct-usjrga/StateGovernmentEntity :owl/NamedIndividual
               :fibo-be-ge-ge/GovernmentDepartment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Massachusetts Corporations Division",
   :skos/definition
   "Commonwealth of Massachusetts, Secretary of State, Corporations Division"})

(def MassachusettsRegistrationAuthorityCode
  {:cmns-id/identifies :fibo-fbc-fct-usjrga/MassachusettsCorporationRegistry,
   :db/ident :fibo-fbc-fct-usjrga/MassachusettsRegistrationAuthorityCode,
   :fibo-fnd-rel-rel/hasTag "RA000613",
   :rdf/type #{:fibo-fbc-fct-breg/RegistrationAuthorityCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Massachusetts Registration Authority Code",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/gleif-registration-authorities-list"},
   :skos/definition
   "GLEIF Registration Authority List identifier for the Massachusetts Corporation Registry"})

(def NICRegistryEntry
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "http://www.ffiec.gov/nicpubweb/nicweb/NicHome.aspx"},
   :db/ident :fibo-fbc-fct-usjrga/NICRegistryEntry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "National Information Center (NIC) registry entry",
   :rdfs/subClassOf
   #{{:owl/onProperty :cmns-col/comprises,
      :owl/someValuesFrom
      :fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier,
      :rdf/type :owl/Restriction}
     {:owl/hasValue   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
      :owl/onProperty :cmns-col/isIncludedIn,
      :rdf/type       :owl/Restriction}
     {:owl/allValuesFrom :fibo-fbc-pas-fpas/FinancialServiceProvider,
      :owl/onProperty    :cmns-cxtdsg/appliesTo,
      :rdf/type          :owl/Restriction} :fibo-fbc-fct-ra/RegistryEntry},
   :skos/definition
   "an entry in the the National Information Center (NIC) repository, a repository of financial data and institution characteristics collected by the Federal Reserve System"})

(def NationalBankingRegulator
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "http://www.occ.gov/about/what-we-do/mission/index-about.html"},
   :db/ident :fibo-fbc-fct-usjrga/NationalBankingRegulator,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usjrga/OfficeOfTheComptrollerOfTheCurrency,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationAuthority
               :fibo-fbc-fct-usjrga/PrimaryFederalRegulator
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "national banking regulator",
   :rdfs/seeAlso {:xsd/anyURI "http://www.occ.gov/"},
   :skos/definition
   "regulatory agency and registration authority role of the Office of the Comptroller of the Currency (OCC)"})

(def NationalCreditUnionAdministration
  {:cmns-av/abbreviation "NCUA",
   :cmns-av/explanatoryNote
   "An independent agency of the federal government, the NCUA operates and manages the National Credit Union Share Insurance Fund (NCUSIF), insuring the deposits of more than 98 million account holders in all federal credit unions and the overwhelming majority of state-chartered credit unions.",
   :cmns-col/isPartOf :fibo-be-ge-usj/UnitedStatesGovernment,
   :db/ident :fibo-fbc-fct-usjrga/NationalCreditUnionAdministration,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/UnitedStatesJurisdiction,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI
                                 "http://www.ncua.gov/Pages/default.aspx"},
   :rdf/type #{:fibo-be-ge-ge/GovernmentAgency :owl/NamedIndividual
               :fibo-fbc-fct-usjrga/FederalGovernmentEntity},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "National Credit Union Administration",
   :skos/definition
   "National Credit Union Administration (NCUA), the independent federal agency that regulates, charters and supervises federal credit unions"})

(def NationalCreditUnionInsurerAndRegulator
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "http://www.ncua.gov/about/Pages/default.aspx"},
   :db/ident :fibo-fbc-fct-usjrga/NationalCreditUnionInsurerAndRegulator,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usjrga/NationalCreditUnionAdministration,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationAuthority
               :fibo-fbc-fct-usjrga/PrimaryFederalRegulator
               :fibo-fbc-pas-fpas/FinancialServiceProvider
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "national credit union insurer and regulator",
   :rdfs/seeAlso {:xsd/anyURI "http://www.ncua.gov/Pages/default.aspx"},
   :skos/definition
   "regulatory agency and registration authority role of the National Credit Union Administration (NCUA)"})

(def NationalInformationCenterRepository
  {:cmns-av/explanatoryNote
   "The National Information Center (NIC)repository provides comprehensive information on banks and other institutions for which the Federal Reserve has a supervisory, regulatory, or research interest including both domestic and foreign banking organizations operating in the U.S.",
   :db/ident :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
   :fibo-fnd-plc-vrt/hasWebsite
   {:xsd/anyURI "http://www.ffiec.gov/nicpubweb/nicweb/NicHome.aspx"},
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-usjrga/FederalReserveRegulatoryAgencyAndCentralBank,
   :rdf/type #{:fibo-fbc-fct-ra/Registry :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "National Information Center (NIC) Repository",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.ffiec.gov/nicpubweb/content/DataDownload/NPW%20Data%20Dictionary.pdf/"},
   :skos/definition
   "National Information Center (NIC) repository, a repository of financial data and institution characteristics collected by the Federal Reserve System"})

(def NewYorkBusinessEntitiesRegistry
  {:db/ident :fibo-fbc-fct-usjrga/NewYorkBusinessEntitiesRegistry,
   :fibo-fnd-plc-vrt/hasWebsite
   {:xsd/anyURI
    "https://appext20.dos.ny.gov/corp_public/corpsearch.entity_search_entry"},
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfNewYorkJurisdiction,
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-usjrga/NewYorkCorporationsRegulator,
   :rdf/type #{:fibo-fbc-fct-breg/BusinessRegistry :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "New York State (NYS) business entities registry",
   :skos/definition
   "New York State (NYS) Department of State, Division of Corporations, State Records and Uniform Commercial Code (UCC) registry of business entities"})

(def NewYorkBusinessRegistrationIdentifierScheme
  {:db/ident :fibo-fbc-fct-usjrga/NewYorkBusinessRegistrationIdentifierScheme,
   :rdf/type #{:owl/NamedIndividual
               :fibo-be-corp-corp/RegistrationIdentifierScheme},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "New York business registration identifier scheme",
   :skos/definition
   "registration identifier scheme for business entity identifiers defined by the New York State (NYS) Department of State, Division of Corporations for the registration of business entities"})

(def NewYorkBusinessRegistrationService
  {:db/ident :fibo-fbc-fct-usjrga/NewYorkBusinessRegistrationService,
   :fibo-fnd-pas-pas/isProvisionedBy
   :fibo-fbc-fct-usjrga/NewYorkCorporationsRegulator,
   :fibo-fnd-rel-rel/isProvidedBy
   :fibo-fbc-fct-usjrga/NewYorkCorporationsRegulator,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationService :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "State of New York business registration service",
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.dos.ny.gov/about/corps-licensing.html"},
   :skos/definition
   "New York State (NYS) Department of State, Division of Corporations service for the registration of business entities"})

(def NewYorkCorporationsRegulator
  {:db/ident :fibo-fbc-fct-usjrga/NewYorkCorporationsRegulator,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usjrga/NewYorkDivisionOfCorporations,
   :fibo-fnd-rel-rel/manages
   :fibo-fbc-fct-usjrga/NewYorkBusinessEntitiesRegistry,
   :fibo-fnd-rel-rel/provides
   :fibo-fbc-fct-usjrga/NewYorkBusinessRegistrationService,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/BusinessRegistrationAuthority
               :fibo-fbc-fct-rga/RegulatoryAgency},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "State of New York corporations regulator",
   :rdfs/seeAlso {:xsd/anyURI "https://www.dos.ny.gov/corps/index.html"},
   :skos/definition
   "regulatory agency and registration authority role of the State of New York's Division of Corporations"})

(def NewYorkDivisionOfCorporations
  {:cmns-col/isPartOf :fibo-be-ge-usj/StateOfNewYorkGovernment,
   :db/ident :fibo-fbc-fct-usjrga/NewYorkDivisionOfCorporations,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI
                                 "https://www.dos.ny.gov/corps/index.html"},
   :rdf/type #{:fibo-fbc-fct-usjrga/StateGovernmentEntity :owl/NamedIndividual
               :fibo-be-ge-ge/GovernmentDepartment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label
   "New York State (NYS) Department of State Division of Corporations",
   :skos/definition
   "New York State (NYS) Department of State's Division of Corporations"})

(def NewYorkRegistrationAuthorityCode
  {:cmns-id/identifies :fibo-fbc-fct-usjrga/NewYorkBusinessEntitiesRegistry,
   :db/ident :fibo-fbc-fct-usjrga/NewYorkRegistrationAuthorityCode,
   :fibo-fnd-rel-rel/hasTag "RA000628",
   :rdf/type #{:fibo-fbc-fct-breg/RegistrationAuthorityCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "New York Registration Authority Code",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/gleif-registration-authorities-list"},
   :skos/definition
   "GLEIF Registration Authority List identifier for the New York State (NYS) Department of State, Division of Corporations, State Records and Uniform Commercial Code (UCC) registry of business entities"})

(def NonDepositoryTrustCompany-MemberInstitution
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :db/ident :fibo-fbc-fct-usjrga/NonDepositoryTrustCompany-MemberInstitution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "non-depository trust company - member institution",
   :rdfs/subClassOf #{:fibo-fbc-fct-usfse/NonDepositoryTrustCompany
                      :fibo-fbc-fct-usjrga/FederalReserveSystemMember},
   :skos/definition
   "non-depository trust company that is a member of the Federal Reserve system"})

(def NonDepositoryTrustCompany-NonMemberInstitution
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :db/ident
   :fibo-fbc-fct-usjrga/NonDepositoryTrustCompany-NonMemberInstitution,
   :owl/disjointWith
   :fibo-fbc-fct-usjrga/NonDepositoryTrustCompany-MemberInstitution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "non-depository trust company - non-member institution",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/NonDepositoryTrustCompany,
   :skos/definition
   "non-depository trust company that is not a member of the Federal Reserve system"})

(def OfficeOfTheComptrollerOfTheCurrency
  {:cmns-av/abbreviation "OCC",
   :cmns-av/explanatoryNote
   "The mission of the OCC is to ensure that national banks and federal savings associations operate in a safe and sound manner, provide fair access to financial services, treat customers fairly, and comply with applicable laws and regulations.",
   :cmns-col/isPartOf :fibo-fbc-fct-usjrga/USDepartmentOfTheTreasury,
   :db/ident :fibo-fbc-fct-usjrga/OfficeOfTheComptrollerOfTheCurrency,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/UnitedStatesJurisdiction,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "http://www.occ.gov/"},
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/GovernmentDepartment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Office of the Comptroller of the Currency",
   :skos/definition
   "OCC, which charters, regulates, and supervises all national banks and federal savings associations as well as federal branches and agencies of foreign banks. The OCC is an independent bureau of the U.S. Department of the Treasury."})

(def OfficeOfThriftSupervision
  {:cmns-av/abbreviation "OTS",
   :cmns-col/isPartOf :fibo-fbc-fct-usjrga/OfficeOfTheComptrollerOfTheCurrency,
   :db/ident :fibo-fbc-fct-usjrga/OfficeOfThriftSupervision,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/UnitedStatesJurisdiction,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "http://www.occ.gov/"},
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/GovernmentDepartment
               :fibo-fbc-fct-usjrga/FederalGovernmentEntity},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Office of Thrift Supervision",
   :skos/definition
   "OTS, which is a part of the OCC, responsible for chartering, regulating, and supervising all federal savings associations"})

(def OhioBusinessFilingPortal
  {:db/ident :fibo-fbc-fct-usjrga/OhioBusinessFilingPortal,
   :fibo-fbc-fct-breg/hasRegistryName "Ohio Business Filing Portal",
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI
                                 "https://www.sos.state.oh.us/businesses/"},
   :fibo-fnd-rel-rel/isGovernedBy :fibo-be-ge-usj/StateOfOhioJurisdiction,
   :fibo-fnd-rel-rel/isManagedBy :fibo-fbc-fct-usjrga/OhioBusinessRegistrar,
   :rdf/type #{:fibo-fbc-fct-breg/BusinessRegistry :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Ohio Business Filing Portal",
   :skos/definition
   "registry of business entities for businesses that have registered with the Ohio Secretary of State"})

(def OhioBusinessRegistrar
  {:db/ident :fibo-fbc-fct-usjrga/OhioBusinessRegistrar,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usjrga/OhioBusinessServicesDivision,
   :fibo-fnd-rel-rel/manages :fibo-fbc-fct-usjrga/OhioBusinessFilingPortal,
   :fibo-fnd-rel-rel/provides
   :fibo-fbc-fct-usjrga/OhioBusinessRegistrationService,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/BusinessRegistrationAuthority
               :fibo-fbc-fct-rga/RegulatoryAgency},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Ohio business registrar",
   :rdfs/seeAlso {:xsd/anyURI "https://www.sos.state.oh.us/businesses/"},
   :skos/definition
   "regulatory agency and registration authority role of the Ohio Secretary of State, Business Services Division"})

(def OhioBusinessRegistrationIdentifierScheme
  {:db/ident :fibo-fbc-fct-usjrga/OhioBusinessRegistrationIdentifierScheme,
   :rdf/type #{:owl/NamedIndividual
               :fibo-be-corp-corp/RegistrationIdentifierScheme},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Ohio business registration identifier scheme",
   :skos/definition
   "registration identifier scheme for business entity identifiers defined by the Ohio Secretary of State, Business Services Division for the registration of business entities"})

(def OhioBusinessRegistrationService
  {:db/ident :fibo-fbc-fct-usjrga/OhioBusinessRegistrationService,
   :fibo-fnd-pas-pas/isProvisionedBy :fibo-fbc-fct-usjrga/OhioBusinessRegistrar,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usjrga/OhioBusinessRegistrar,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationService :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Ohio business registration service",
   :rdfs/seeAlso {:xsd/anyURI "https://www.sos.state.oh.us/businesses/"},
   :skos/definition
   "Ohio Secretary of State, Business Services Division service for the registration of business entities"})

(def OhioBusinessServicesDivision
  {:cmns-col/isPartOf :fibo-be-ge-usj/StateOfOhioGovernment,
   :db/ident :fibo-fbc-fct-usjrga/OhioBusinessServicesDivision,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI
                                 "https://www.sos.state.oh.us/businesses/"},
   :rdf/type #{:fibo-fbc-fct-usjrga/StateGovernmentEntity :owl/NamedIndividual
               :fibo-be-ge-ge/GovernmentDepartment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Ohio Business Services Division",
   :skos/definition "Ohio Secretary of State, Business Services Division"})

(def OhioRegistrationAuthorityCode
  {:cmns-id/identifies :fibo-fbc-fct-usjrga/OhioBusinessFilingPortal,
   :db/ident :fibo-fbc-fct-usjrga/OhioRegistrationAuthorityCode,
   :fibo-fnd-rel-rel/hasTag "RA000629",
   :rdf/type #{:fibo-fbc-fct-breg/RegistrationAuthorityCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Ohio Registration Authority Code",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/gleif-registration-authorities-list"},
   :skos/definition
   "GLEIF Registration Authority List identifier for the Ohio Business Filing Portal"})

(def PrimaryFederalRegulator
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "http://www.ffiec.gov/nicpubweb/nicweb/NicHome.aspx"},
   :db/ident :fibo-fbc-fct-usjrga/PrimaryFederalRegulator,
   :owl/equivalentClass
   {:owl/onProperty :fibo-fnd-pty-rl/isPlayedBy,
    :owl/someValuesFrom
    {:owl/oneOf [:fibo-fbc-fct-usjrga/FarmCreditAdministration
                 :fibo-fbc-fct-usjrga/FederalDepositInsuranceCorporation
                 :fibo-fbc-fct-usjrga/FederalHousingFinanceAgency
                 :fibo-fbc-fct-usjrga/FederalReserveSystem
                 :fibo-fbc-fct-usjrga/NationalCreditUnionAdministration
                 :fibo-fbc-fct-usjrga/OfficeOfTheComptrollerOfTheCurrency
                 :fibo-fbc-fct-usjrga/OfficeOfThriftSupervision],
     :rdf/type  :owl/Class},
    :rdf/type :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "primary federal regulator",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-be-ge-ge/GovernmentBody,
                       :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-fbc-fct-rga/RegulatoryAgency},
   :skos/definition
   "federal regulatory agency that is designated as the main agency responsible for oversight of a given institution for an institution"})

(def ResearchStatisticsSupervisionDiscountIdentifier
  {:cmns-av/abbreviation "RSSD ID",
   :cmns-av/adaptedFrom
   {:xsd/anyURI "https://cdr.ffiec.gov/CDR/Public/CDRHelp/FAQs1205.htm#FAQ16"},
   :cmns-av/synonym "ID_RSSD",
   :db/ident
   :fibo-fbc-fct-usjrga/ResearchStatisticsSupervisionDiscountIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://www.federalreserve.gov/reportforms/mdrm/pdf/RSSD.PDF"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"}},
   :rdfs/label
   "Research, Statistics, Supervision and Regulation, and Discount and Credit identifier",
   :rdfs/subClassOf
   #{:fibo-fbc-fct-ra/RegistryIdentifier
     :fibo-fbc-fct-fse/FinancialServiceProviderIdentifier
     {:owl/hasValue
      :fibo-fbc-fct-usjrga/FederalReserveRegulatoryAgencyAndCentralBank,
      :owl/onProperty :fibo-fbc-fct-ra/isRegisteredBy,
      :rdf/type :owl/Restriction}
     {:owl/hasValue   :fibo-fbc-fct-usjrga/NationalInformationCenterRepository,
      :owl/onProperty :fibo-fbc-fct-ra/isRegisteredIn,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "unique identifier assigned by the Federal Reserve to financial institutions for regulatory and oversight purposes"})

(def RoutingTransitNumber
  {:cmns-av/abbreviation "RTN",
   :cmns-av/explanatoryNote
   #{"Routing transit numbers are issued by Accuity on behalf of the American Bankers Association (ABA)."
     "The ABA RTN was originally designed to facilitate the sorting, bundling, and shipment of paper checks back to the drawer's (check writer's) account. As new payment methods were developed (ACH and Wire), the system was expanded to accommodate these payment methods.\n\nThe ABA RTN is necessary for the Federal Reserve Banks to process Fedwire funds transfers, and by the Automated Clearing House to process direct deposits, bill payments, and other such automated transfers."},
   :db/ident :fibo-fbc-fct-usjrga/RoutingTransitNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "routing transit number",
   :rdfs/seeAlso {:xsd/anyURI "http://www.accuity.com/aba-registrar/"},
   :rdfs/subClassOf
   #{:fibo-fbc-fct-ra/RegistryIdentifier
     :fibo-fbc-fct-fse/FinancialServiceProviderIdentifier
     {:owl/hasValue :fibo-fbc-fct-usjrga/AmericanBankersAssociationRTNRegistrar,
      :owl/onProperty :fibo-fbc-fct-ra/isRegisteredBy,
      :rdf/type :owl/Restriction}
     {:owl/hasValue   :fibo-fbc-fct-usjrga/ABARTNRegistry,
      :owl/onProperty :fibo-fbc-fct-ra/isRegisteredIn,
      :rdf/type       :owl/Restriction}
     {:owl/hasValue
      :fibo-fbc-fct-usjrga/AmericanBankersAssociationRegistrationAuthority,
      :owl/onProperty :fibo-fbc-fct-ra/hasRegistrationAuthority,
      :rdf/type :owl/Restriction}},
   :skos/definition
   "unique nine digit identifier, used primarily in the United States, to identify a banking or other financial institution for clearing funds, and, as it appears on a check, denotes the banking institution that holds the account from which funds are to be drawn"})

(def SecuritiesAndExchangeCommission
  {:cmns-av/abbreviation "SEC",
   :cmns-av/explanatoryNote
   "The SEC oversees the key participants in the securities world, including securities exchanges, securities brokers and dealers, investment advisors, and mutual funds. Here the SEC is concerned primarily with promoting the disclosure of important market-related information, maintaining fair dealing, and protecting against fraud.\n Crucial to the SEC's effectiveness in each of these areas is its enforcement authority. Each year the SEC brings hundreds of civil enforcement actions against individuals and companies for violation of the securities laws. Typical infractions include insider trading, accounting fraud, and providing false or misleading information about securities and the companies that issue them.\n One of the major sources of information on which the SEC relies to bring enforcement action is investors themselves - another reason that educated and careful investors are so critical to the functioning of efficient markets. To help support investor education, the SEC offers the public a wealth of educational information on this Internet website, which also includes the EDGAR database of disclosure documents that public companies are required to file with the Commission.\n Though it is the primary overseer and regulator of the U.S. securities markets, the SEC works closely with many other institutions, including Congress, other federal departments and agencies, the self-regulatory organizations (e.g. the stock exchanges), state securities regulators, and various private sector organizations. In particular, the Chairman of the SEC, together with the Chairman of the Federal Reserve, the Secretary of the Treasury, and the Chairman of the Commodity Futures Trading Commission, serves as a member of the President's Working Group on Financial Markets.",
   :cmns-col/isPartOf :fibo-be-ge-usj/UnitedStatesGovernment,
   :db/ident :fibo-fbc-fct-usjrga/SecuritiesAndExchangeCommission,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/UnitedStatesJurisdiction,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "http://www.sec.gov/"},
   :rdf/type #{:fibo-be-ge-ge/GovernmentAgency :owl/NamedIndividual
               :fibo-fbc-fct-usjrga/FederalGovernmentEntity},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Securities and Exchange Commission",
   :skos/definition
   "independent commission established by the Securities Act of 1933 and Securities Exchange Act of 1934 whose mission is to protect investors, maintain fair, orderly, and efficient markets, and facilitate capital formation"})

(def SecuritiesAndExchangeRegulator
  {:cmns-av/adaptedFrom {:xsd/anyURI "http://www.sec.gov/about/whatwedo.shtml"},
   :db/ident :fibo-fbc-fct-usjrga/SecuritiesAndExchangeRegulator,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usjrga/SecuritiesAndExchangeCommission,
   :fibo-fnd-rel-rel/manages :fibo-fbc-fct-usjrga/EDGARRepository,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationAuthority
               :fibo-fbc-fct-usjrga/PrimaryFederalRegulator
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "securities and exchange regulator",
   :skos/definition
   "regulatory agency and registration authority role of the Securities and Exchange Commission (SEC)"})

(def SouthDakotaBusinessInformationRegistry
  {:db/ident :fibo-fbc-fct-usjrga/SouthDakotaBusinessInformationRegistry,
   :fibo-fnd-plc-vrt/hasWebsite
   {:xsd/anyURI "https://sosenterprise.sd.gov/businessservices/"},
   :fibo-fnd-rel-rel/isGovernedBy
   :fibo-be-ge-usj/StateOfSouthDakotaJurisdiction,
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-usjrga/SouthDakotaCorporationsRegulator,
   :rdf/type #{:fibo-fbc-fct-breg/BusinessRegistry :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "South Dakota business entities registry",
   :skos/definition "State of South Dakota registry of business information"})

(def SouthDakotaBusinessRegistrationIdentifierScheme
  {:db/ident
   :fibo-fbc-fct-usjrga/SouthDakotaBusinessRegistrationIdentifierScheme,
   :rdf/type #{:owl/NamedIndividual
               :fibo-be-corp-corp/RegistrationIdentifierScheme},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "South Dakota business registration identifier scheme",
   :skos/definition
   "registration identifier scheme for business entity identifiers defined by the State of South Dakota, Secretary of State, Corporations Division for the registration of business entities"})

(def SouthDakotaBusinessRegistrationService
  {:db/ident :fibo-fbc-fct-usjrga/SouthDakotaBusinessRegistrationService,
   :fibo-fnd-pas-pas/isProvisionedBy
   :fibo-fbc-fct-usjrga/SouthDakotaCorporationsRegulator,
   :fibo-fnd-rel-rel/isProvidedBy
   :fibo-fbc-fct-usjrga/SouthDakotaCorporationsRegulator,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationService :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "South Dakota business registration service",
   :rdfs/seeAlso {:xsd/anyURI "https://sosenterprise.sd.gov/businessservices/"},
   :skos/definition
   "State of South Dakota, Secretary of State, Corporations Division service for the registration of business entities"})

(def SouthDakotaCorporationsDivision
  {:cmns-col/isPartOf :fibo-be-ge-usj/StateOfSouthDakotaGovernment,
   :db/ident :fibo-fbc-fct-usjrga/SouthDakotaCorporationsDivision,
   :fibo-fnd-plc-vrt/hasWebsite
   {:xsd/anyURI "https://sosenterprise.sd.gov/businessservices/"},
   :rdf/type #{:fibo-fbc-fct-usjrga/StateGovernmentEntity :owl/NamedIndividual
               :fibo-be-ge-ge/GovernmentDepartment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "South Dakota, Secretary of State Corporations Division",
   :skos/definition "State of South Dakota's Corporations Division"})

(def SouthDakotaCorporationsRegulator
  {:db/ident :fibo-fbc-fct-usjrga/SouthDakotaCorporationsRegulator,
   :fibo-fnd-rel-rel/hasIdentity
   :fibo-fbc-fct-usjrga/SouthDakotaCorporationsDivision,
   :fibo-fnd-rel-rel/manages
   :fibo-fbc-fct-usjrga/SouthDakotaBusinessInformationRegistry,
   :fibo-fnd-rel-rel/provides
   :fibo-fbc-fct-usjrga/SouthDakotaBusinessRegistrationService,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/BusinessRegistrationAuthority
               :fibo-fbc-fct-rga/RegulatoryAgency},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "South Dakota corporations regulator",
   :rdfs/seeAlso {:xsd/anyURI "https://sosenterprise.sd.gov/businessservices/"},
   :skos/definition
   "regulatory agency and registration authority role of the State of South Dakota's Secretary of State, Corporations Division"})

(def SouthDakotaRegistrationAuthorityCode
  {:cmns-id/identifies
   :fibo-fbc-fct-usjrga/SouthDakotaBusinessInformationRegistry,
   :db/ident :fibo-fbc-fct-usjrga/SouthDakotaRegistrationAuthorityCode,
   :fibo-fnd-rel-rel/hasTag "RA000635",
   :rdf/type #{:fibo-fbc-fct-breg/RegistrationAuthorityCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "South Dakota Registration Authority Code",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/gleif-registration-authorities-list"},
   :skos/definition
   "GLEIF Registration Authority List identifier for the South Dakota Business Information Registry"})

(def StateGovernmentEntity
  {:db/ident :fibo-fbc-fct-usjrga/StateGovernmentEntity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "state government entity or agency",
   :rdfs/subClassOf #{:fibo-be-ge-ge/GovernmentBody
                      {:owl/onProperty :fibo-be-ge-ge/hasJurisdiction,
                       :owl/someValuesFrom
                       {:owl/onProperty :fibo-fnd-law-jur/hasReach,
                        :owl/someValuesFrom
                        {:owl/intersectionOf
                         [:lcc-cr/CountrySubdivision
                          {:owl/hasValue   :lcc-3166-1/UnitedStatesOfAmerica,
                           :owl/onProperty :lcc-cr/isSubregionOf,
                           :rdf/type       :owl/Restriction}],
                         :rdf/type :owl/Class},
                        :rdf/type :owl/Restriction},
                       :rdf/type :owl/Restriction}
                      {:owl/unionOf [:fibo-be-ge-ge/Instrumentality
                                     :fibo-be-ge-ge/RegionalSovereignty
                                     :fibo-be-ge-ge/GovernmentAgency
                                     :fibo-be-ge-ge/GovernmentDepartment],
                       :rdf/type    :owl/Class}},
   :skos/definition
   "formal organization that is an independent agency, instrumentality or other permanent or semi-permanent organization in the machinery of government of any one of the states or territories of the United States"})

(def StateMemberBank
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "http://www.ffiec.gov/nicpubweb/Content/HELP/Institution%20Type%20Description.htm"},
   :db/ident :fibo-fbc-fct-usjrga/StateMemberBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "state member bank",
   :rdfs/subClassOf #{:fibo-fbc-fct-usfse/StateCharteredBank
                      :fibo-fbc-fct-usjrga/FederalReserveSystemMember},
   :skos/definition
   "state-chartered bank that is a member of the Federal Reserve System (FRS)"})

(def TaxpayerIdentificationNumber
  {:cmns-av/abbreviation "TIN",
   :cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.irs.gov/individuals/international-taxpayers/taxpayer-identification-numbers-tin"},
   :cmns-av/explanatoryNote
   "A TIN must be furnished on returns, statements, and other tax related documents. For example a number must be furnished:\n- When filing tax returns.\n- When claiming treaty benefits.\n\nA TIN must be on a withholding certificate if the beneficial owner is claiming any of the following:\n- Tax treaty benefits (other than for income from marketable securities)\n- Exemption for effectively connected income\n- Exemption for certain annuities.",
   :db/ident :fibo-fbc-fct-usjrga/TaxpayerIdentificationNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "taxpayer identification number",
   :rdfs/subClassOf
   #{{:owl/hasValue   :fibo-be-ge-usj/UnitedStatesJurisdiction,
      :owl/onProperty :cmns-cxtdsg/isApplicableIn,
      :rdf/type       :owl/Restriction} :fibo-fnd-pty-pty/TaxIdentifier
     {:owl/onClass :fibo-fbc-fct-usjrga/TaxpayerIdentificationNumberingScheme,
      :owl/onProperty :cmns-col/isMemberOf,
      :owl/qualifiedCardinality 1,
      :rdf/type :owl/Restriction}},
   :skos/definition
   "identification number used by the Internal Revenue Service (IRS) in the administration of tax laws in the United States"})

(def TaxpayerIdentificationNumberingScheme
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.irs.gov/individuals/international-taxpayers/taxpayer-identification-numbers-tin"},
   :db/ident :fibo-fbc-fct-usjrga/TaxpayerIdentificationNumberingScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "taxpayer identification numbering scheme",
   :rdfs/subClassOf #{{:owl/hasValue   :fibo-be-ge-usj/UnitedStatesJurisdiction,
                       :owl/onProperty :cmns-cxtdsg/isApplicableIn,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-pty-pty/TaxIdentificationScheme},
   :skos/definition "tax identification scheme used in the United States"})

(def ThriftRegulator
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "http://www.occ.gov/about/what-we-do/mission/index-about.html"},
   :db/ident :fibo-fbc-fct-usjrga/ThriftRegulator,
   :fibo-fnd-rel-rel/hasIdentity :fibo-fbc-fct-usjrga/OfficeOfThriftSupervision,
   :rdf/type #{:fibo-fbc-fct-usjrga/PrimaryFederalRegulator
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "thrift regulator",
   :skos/definition
   "regulatory agency and registration authority role of the Office of Thrift Supervision (OTS)"})

(def USDepartmentOfTheTreasury
  {:cmns-av/explanatoryNote
   "The Department is responsible for a wide range of activities such as advising the President on economic and financial issues, encouraging sustainable economic growth, and fostering improved governance in financial institutions. The Department of the Treasury operates and maintains systems that are critical to the nation's financial infrastructure, such as the production of coin and currency, the disbursement of payments to the American public, revenue collection, and the borrowing of funds necessary to run the federal government. The Department works with other federal agencies, foreign governments, and international financial institutions to encourage global economic growth, raise standards of living, and to the extent possible, predict and prevent economic and financial crises. The Treasury Department also performs a critical and far-reaching role in enhancing national security by implementing economic sanctions against foreign threats to the U.S., identifying and targeting the financial support networks of national security threats, and improving the safeguards of our financial systems.",
   :cmns-av/synonym "Treasury Department",
   :cmns-col/isPartOf :fibo-be-ge-usj/UnitedStatesGovernment,
   :db/ident :fibo-fbc-fct-usjrga/USDepartmentOfTheTreasury,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/UnitedStatesJurisdiction,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI
                                 "http://www.treasury.gov/Pages/default.aspx"},
   :rdf/type #{:fibo-be-ge-ge/GovernmentAgency :owl/NamedIndividual
               :fibo-fbc-fct-usjrga/FederalGovernmentEntity},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "U.S. Department of the Treasury",
   :skos/definition
   "U.S. Department of the Treasury, the executive agency responsible for promoting economic prosperity and ensuring the financial security of the United States"})

(def UniformBankPerformanceReportRepository
  {:cmns-av/explanatoryNote
   "In a concise format, it shows the impact of management decisions and economic conditions on a bank's performance and balance-sheet composition. The performance and composition data contained in the report can be used as an aid in evaluating the adequacy of earnings, liquidity, capital, asset and liability management, and growth management. Bankers and examiners alike can use this report to further their understanding of a bank's financial condition, and through such understanding, perform their duties more effectively.",
   :db/ident :fibo-fbc-fct-usjrga/UniformBankPerformanceReportRepository,
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-usjrga/FederalFinancialInstitutionsExaminationRegulator,
   :rdf/type #{:fibo-fbc-fct-ra/Registry :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "Uniform Bank Performance Report (UBPR) Repository",
   :skos/definition
   "Federal Financial Institutions Examination Council (FFIEC)'s Uniform Bank Performance Report (UBPR) Repository, a repository of institution characteristics and analytical tool created for bank supervisory, examination, and management purposes"})

(def hasPrimaryFederalRegulator
  {:db/ident :fibo-fbc-fct-usjrga/hasPrimaryFederalRegulator,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/FinancialServiceProvider,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "has primary federal regulator",
   :rdfs/range :fibo-fbc-fct-usjrga/PrimaryFederalRegulator,
   :rdfs/subPropertyOf :fibo-fbc-fct-rga/isRegulatedBy,
   :skos/definition
   "identifies the primary federal regulator for an institution"})

(def hasSecondaryFederalRegulator
  {:db/ident :fibo-fbc-fct-usjrga/hasSecondaryFederalRegulator,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/FinancialServiceProvider,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdfs/label "has secondary federal regulator",
   :rdfs/range :fibo-fbc-fct-rga/RegulatoryAgency,
   :rdfs/subPropertyOf :fibo-fbc-fct-rga/isRegulatedBy,
   :skos/definition
   "identifies an additional federal regulator, over and above the primary federal regulator, for an institution"})

(def urn:uuid:02f3ab60-a840-52fa-b4c8-2edac6d5d5ab
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology extends the primary regulatory agencies ontology in FBC with additional regulators that are specific to the United States and augments certain U.S. financial services entities based on who regulates them.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
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
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/OwnershipAndControl/Executives/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Organizations/Organizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/CorporateBodies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/RegulatoryAgencies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/Corporations/Corporations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/VirtualPlaces/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/BusinessCentersIndividuals/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Law/LegalCore/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "US Regulatory Agencies Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/USJurisdiction/USRegulatoryAgencies.rdf version of this ontology was modified per the FIBO 2.0 RFC."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies.rdf version of this ontology was revised to add tax identification number, employer identification number, federal government entity and state government entity."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/USJurisdiction/USRegulatoryAgencies.rdf version of this ontology was modified to integrate a financial services provider identifier for certain banking identifiers, add a property for secondary federal regulator, add individual registration schemes for state-specific business registries, improve on some definitions, normalize some of the labels, eliminate duplication of concepts in LCC, to simplify addresses, merge countries with locations in FND, eliminte the redundant notion of an InstitutionType, which can be determined using a SPARQL query or classification and results in a very large disjunction, and correct a couple of improperly defined annotations."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies.rdf version of this ontology was revised to add a restriction on PrimaryFederalRegulator to say that it must be a government body."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies.rdf version of this ontology was revised to eliminate references to external dictionary sites that no longer resolve and clean up circular and ambiguous definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary and augmented to support better mapping to the NIC repository."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), to eliminate redundancies in FIBO, and to augment the number and nature of financial institution entity types to cover more of the National Information Center (NIC) repository managed by the FFIEC."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies.rdf version of this ontology was revised to correct a restriction defining state government entities and to make federal reserve district identifier a subclass of geographic region identifier and fix spelling errors."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/USJurisdiction/USRegulatoryAgencies.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FBC 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies.rdf version of this ontology was revised to reflect the move of certain organization-specific concepts from BE to FND."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies.rdf version of this ontology was revised to eliminate dead links and address text formatting issues identified by hygiene testing."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"})