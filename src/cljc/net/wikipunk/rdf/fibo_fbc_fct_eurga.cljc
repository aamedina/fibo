(ns net.wikipunk.rdf.fibo-fbc-fct-eurga
  {:cmns-av/copyright #{"Copyright (c) 2017-2024 Object Management Group, Inc."
                        "Copyright (c) 2017-2024 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies/",
   :dcterms/abstract
   "This ontology extends the primary regulatory agencies ontology in FBC with additional agencies and registries that regulate and provide services in Europe, across national boundaries, such as agencies that support the European Union.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
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
    "fibo-fbc-fct-eufse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EUFinancialServicesEntities/",
    "fibo-fbc-fct-eufseind"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
    "fibo-fbc-fct-eurga"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies/",
    "fibo-fbc-fct-fse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
    "fibo-fbc-fct-ra"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
    "fibo-fbc-fct-rga"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies/",
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
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/BusinessCentersIndividuals/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/EuropeanEntities/EUFinancialServicesEntities/"}
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
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/VirtualPlaces/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/RegulatoryAgencies/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-fct-eurga",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies/",
   :rdfs/label "European Regulatory Agencies Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies.rdf version of this ontology was revised to update the LEI URIs to the new form published by the GLEIF on data.world."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies.rdf version of the ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies.rdf version of this ontology was modified to reflect revisions to the GLEIF LEI information for the European Central Bank, eliminate duplication with concepts in LCC, simplify addresses, and merge countries with locations in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies.rdf version of this ontology was revised to update the LEI data for all LEIs to correspond to the content published by the GLEIF and clean up individual definitions as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies.rdf version of this ontology was modified to reflect revisions to the GLEIF LEI representation for validation level."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies.rdf version of this ontology was added via the FIBO 2.0 RFC."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies/"})

(def CreditInstitutionRegister
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "http://www.eba.europa.eu/risk-analysis-and-data/credit-institutions-register"},
   :db/ident :fibo-fbc-fct-eurga/CreditInstitutionRegister,
   :fibo-fnd-rel-rel/isManagedBy
   :fibo-fbc-fct-eurga/EuropeanBankingAuthorityRegulator,
   :rdf/type #{:fibo-fbc-fct-ra/Registry :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies/"},
   :rdfs/label "Credit Institution Register",
   :skos/definition
   "registry of credit institutions to which authorisation has been granted to operate within the European Union and European Economic Area countries (EEA), a repository of financial data and institution characteristics for covered institutions collected by the the European Banking Authority (EBA)"})

(def CreditInstitutionRegisterEntry
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "http://www.eba.europa.eu/risk-analysis-and-data/credit-institutions-register"},
   :db/ident :fibo-fbc-fct-eurga/CreditInstitutionRegisterEntry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies/"},
   :rdfs/label "Credit Institution Register entry",
   :rdfs/subClassOf
   #{{:owl/hasValue   :fibo-fbc-fct-eurga/CreditInstitutionRegister,
      :owl/onProperty :cmns-col/isIncludedIn,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom :fibo-fbc-fct-eufse/CreditInstitution,
      :rdf/type           :owl/Restriction}
     {:owl/allValuesFrom :fibo-fbc-fct-eufse/CreditInstitution,
      :owl/onProperty    :cmns-cxtdsg/appliesTo,
      :rdf/type          :owl/Restriction} :fibo-fbc-fct-ra/RegistryEntry},
   :skos/definition
   "entry in the Credit Institution Register, a repository of credit institutions collected by the European Banking Authority (EBA) as provided by the various national banking authorities for those institutions that qualify"})

(def EuropeanBankingAuthority
  {:cmns-av/abbreviation "EBA",
   :cmns-av/adaptedFrom
   {:xsd/anyURI "http://www.eba.europa.eu/about-us/missions-and-tasks"},
   :cmns-av/explanatoryNote
   "The Authority also plays an important role in promoting convergence of supervisory practices to ensure a harmonised application of prudential rules. Finally, the EBA is mandated to assess risks and vulnerabilities in the EU banking sector through, in particular, regular risk assessment reports and pan-European stress tests. To perform these tasks, the EBA can produce a number of regulatory and non regulatory documents including binding Technical Standards, Guidelines, Recommendations, Opinions and ad-hoc or regular reports.",
   :db/ident :fibo-fbc-fct-eurga/EuropeanBankingAuthority,
   :rdf/type #{:fibo-be-ge-ge/GovernmentAgency :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies/"},
   :rdfs/label "European Banking Authority",
   :skos/definition
   "European Banking Authority legal entity, whose main task is to contribute, through the adoption of binding Technical Standards (BTS) and Guidelines, to the creation of the European Single Rulebook in banking"})

(def EuropeanBankingAuthorityRegulator
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "http://www.eba.europa.eu/about-us/missions-and-tasks"},
   :cmns-rlcmp/isPlayedBy :fibo-fbc-fct-eurga/EuropeanBankingAuthority,
   :db/ident :fibo-fbc-fct-eurga/EuropeanBankingAuthorityRegulator,
   :fibo-fnd-rel-rel/manages :fibo-fbc-fct-eurga/CreditInstitutionRegister,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationAuthority :owl/NamedIndividual
               :fibo-fbc-fct-rga/RegulatoryAgency},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies/"},
   :rdfs/label "European Banking Authority (EBA) Regulator",
   :skos/definition
   "European Banking Authority (EBA) regulator and registration authority"})

(def EuropeanBankingRegulatoryAgencyAndCentralBank
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ecb.europa.eu/home/html/index.en.html"},
   :cmns-rlcmp/isPlayedBy :fibo-fbc-fct-eurga/EuropeanCentralBank,
   :db/ident :fibo-fbc-fct-eurga/EuropeanBankingRegulatoryAgencyAndCentralBank,
   :rdf/type #{:fibo-fbc-fct-ra/RegistrationAuthority
               :fibo-fbc-fct-fse/CentralBank :owl/NamedIndividual
               :fibo-fbc-fct-rga/RegulatoryAgency},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies/"},
   :rdfs/label "European banking regulatory agency and central bank",
   :skos/definition
   "regulatory agency, registration authority and central banking role of the European Central Bank"})

(def EuropeanCentralBank
  {:cmns-av/abbreviation "ECB",
   :cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.ecb.europa.eu/ecb/orga/escb/ecb-mission/html/index.en.html"},
   :cmns-av/explanatoryNote
   "The European Central Bank is responsible for the prudential supervision of credit institutions located in the euro area and participating non-euro area Member States, within the Single Supervisory Mechanism, which also comprises the national competent authorities. It thereby contributes to the safety and soundness of the banking system and the stability of the financial system within the EU and each participating Member State.",
   :db/ident :fibo-fbc-fct-eurga/EuropeanCentralBank,
   :fibo-be-le-fbo/hasHeadquartersAddress
   :fibo-fbc-fct-eurga/EuropeanCentralBankHeadquartersAndLegalAddress,
   :fibo-fnd-plc-vrt/hasWebsite {:xsd/anyURI "http://www.ecb.europa.eu/"},
   :fibo-fnd-rel-rel/hasLegalName "European Central Bank",
   :rdf/type #{:fibo-be-ge-ge/Instrumentality :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies/"},
   :rdfs/label "European Central Bank",
   :skos/definition
   "European Central Bank, whose main aim is to maintain price stability, i.e. to safeguard the value of the euro"})

(def EuropeanCentralBankHeadquartersAndLegalAddress
  {:db/ident :fibo-fbc-fct-eurga/EuropeanCentralBankHeadquartersAndLegalAddress,
   :fibo-fnd-plc-adr/hasAddressLine1 "Sonnemannstrasse 20",
   :fibo-fnd-plc-adr/hasPostalCode "60314",
   :fibo-fnd-plc-loc/hasCountry :lcc-3166-1/Germany,
   :fibo-fnd-plc-loc/hasMunicipality :fibo-fbc-fct-bci/Frankfurt,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/ConventionalStreetAddress},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies/"},
   :rdfs/label "European Central Bank headquarters and legal address",
   :skos/definition
   "headquarters and legal address for the European Central Bank"})

(def EuropeanCentralBankLegalEntityIdentifierRegistryEntry
  {:cmns-col/comprises {:xsd/anyURI
                        "https://rdf.gleif.org/L1/L-549300DTUYXVMJXZNY75-LEI"},
   :db/ident
   :fibo-fbc-fct-eurga/EuropeanCentralBankLegalEntityIdentifierRegistryEntry,
   :fibo-fbc-fct-breg/hasInitialRegistrationDate
   #inst "2013-04-18T00:08:10.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationRevisionDate
   #inst "2021-07-20T05:13:49.000-00:00",
   :fibo-fbc-fct-breg/hasRegistrationStatus :fibo-fbc-fct-breg/IssuedStatus,
   :fibo-fbc-fct-breg/hasRenewalDate #inst "2022-03-13T10:54:18.000-00:00",
   :fibo-fbc-fct-breg/hasValidationLevel
   :fibo-fbc-fct-breg/EntityValidationLevelEntitySuppliedOnly,
   :rdf/type #{:owl/NamedIndividual
               :fibo-fbc-fct-breg/LegalEntityIdentifierRegistryEntry},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies/"},
   :rdfs/label "European Central Bank legal entity identifier registry entry",
   :skos/definition "legal entity identifier for the European Central Bank"})

(def urn:uuid:01ed55d0-c02d-528a-8a0a-0e436f1ce4a3
  {:cmns-id/identifies :fibo-fbc-fct-eurga/EuropeanCentralBank,
   :fibo-fbc-fct-ra/isRegisteredBy
   :fibo-fbc-fct-eufseind/HerausgebergemeinschaftWertpapier-MitteilungenKepplerLehmann,
   :fibo-fnd-rel-rel/hasTag "549300DTUYXVMJXZNY75",
   :rdf/type           #{:owl/NamedIndividual
                         :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label         "European Central Bank legal entity identifier",
   :skos/definition    "legal entity identifier for the European Central Bank",
   :xsd/anyURI         "https://rdf.gleif.org/L1/L-549300DTUYXVMJXZNY75-LEI"})

(def urn:uuid:167e07c4-a187-5642-bb39-8a94ab00971b
  {:cmns-av/copyright #{"Copyright (c) 2017-2024 Object Management Group, Inc."
                        "Copyright (c) 2017-2024 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology extends the primary regulatory agencies ontology in FBC with additional agencies and registries that regulate and provide services in Europe, across national boundaries, such as agencies that support the European Union.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/BusinessCentersIndividuals/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/EuropeanEntities/EUFinancialServicesEntities/"}
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
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/VirtualPlaces/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/RegulatoryAgencies/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "European Regulatory Agencies Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies.rdf version of this ontology was revised to update the LEI URIs to the new form published by the GLEIF on data.world."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies.rdf version of the ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies.rdf version of this ontology was modified to reflect revisions to the GLEIF LEI information for the European Central Bank, eliminate duplication with concepts in LCC, simplify addresses, and merge countries with locations in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies.rdf version of this ontology was revised to update the LEI data for all LEIs to correspond to the content published by the GLEIF and clean up individual definitions as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies.rdf version of this ontology was modified to reflect revisions to the GLEIF LEI representation for validation level."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies.rdf version of this ontology was added via the FIBO 2.0 RFC."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies/"})