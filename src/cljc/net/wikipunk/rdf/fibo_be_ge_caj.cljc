(ns net.wikipunk.rdf.fibo-be-ge-caj
  {:cmns-av/copyright #{"Copyright (c) 2016-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/",
   :dcterms/abstract
   "This ontology provides the set of basic federal government, provincial, and territory level entities and jurisdictions for use in other Canada-specific FIBO ontologies.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-ge-caj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/",
    "fibo-be-ge-ge"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
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
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Arrangements/IdentifiersAndIndices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-ge-caj",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Canadian Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The http://www.omg.org/spec/EDMC-FIBO/BE/20200201/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to replace 'hasPartialSovereigntyOver' with 'hasSharedSovereigntyOver'."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"})

(def CanadianEntity
  {:db/ident :fibo-be-ge-caj/CanadianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Canada,
   :fibo-be-ge-ge/hasSharedSovereigntyOver
   #{:lcc-3166-2-ca/Yukon :lcc-3166-2-ca/Quebec
     :lcc-3166-2-ca/PrinceEdwardIsland :lcc-3166-2-ca/Alberta
     :lcc-3166-2-ca/NorthwestTerritories :lcc-3166-2-ca/Manitoba
     :lcc-3166-2-ca/NewfoundlandAndLabrador :lcc-3166-2-ca/Nunavut
     :lcc-3166-2-ca/NewBrunswick :lcc-3166-2-ca/NovaScotia
     :lcc-3166-2-ca/Saskatchewan :lcc-3166-2-ca/Ontario
     :lcc-3166-2-ca/BritishColumbia},
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-caj/GovernmentOfCanada,
   :rdf/type #{:fibo-be-ge-ge/FederatedSovereignty :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Canadian entity",
   :rdfs/seeAlso {:xsd/anyURI "https://www.canada.ca/en/index.html"},
   :skos/definition
   "individual representing the federated sovereignty and polity that is Canada"})

(def CanadianJurisdiction
  {:cmns-av/explanatoryNote
   "Canada's federal structure divides government responsibilities between the federal government and the ten provinces. Provincial legislatures are unicameral and operate in parliamentary fashion similar to the House of Commons. Canada's three territories also have legislatures, but these are not sovereign and have fewer constitutional responsibilities than the provinces. The territorial legislatures also differ structurally from their provincial counterparts.",
   :db/ident :fibo-be-ge-caj/CanadianJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-caj/GovernmentOfCanada,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Canada,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Canadian jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.justice.gc.ca/eng/csj-sjc/just/"},
   :skos/definition
   "individual representing the overall jurisdiction for Canada"})

(def GovernmentOfAlberta
  {:db/ident :fibo-be-ge-caj/GovernmentOfAlberta,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-caj/ProvinceOfAlbertaJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-ca/Alberta,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "government of Alberta",
   :rdfs/seeAlso {:xsd/anyURI
                  "http://www.alberta.ca/organizational-structure.cfm"},
   :skos/definition
   "individual representing the regional government of the province of Alberta"})

(def GovernmentOfBritishColumbia
  {:db/ident :fibo-be-ge-caj/GovernmentOfBritishColumbia,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-caj/ProvinceOfBritishColumbiaJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-ca/BritishColumbia,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "government of British Columbia",
   :rdfs/seeAlso {:xsd/anyURI "http://www2.gov.bc.ca/gov/content/governments"},
   :skos/definition
   "individual representing the regional government of the province of British Columbia"})

(def GovernmentOfCanada
  {:cmns-av/explanatoryNote
   "Canada is a federal parliamentary democracy and a constitutional monarchy, with Queen Elizabeth II being the head of state. The country is officially bilingual at the federal level. It is one of the world's most ethnically diverse and multicultural nations, the product of large-scale immigration from many countries. Its advanced economy is the eleventh largest in the world, relying chiefly upon its abundant natural resources and well-developed international trade networks.",
   :db/ident :fibo-be-ge-caj/GovernmentOfCanada,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-caj/CanadianJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Canada,
   :rdf/type #{:fibo-be-ge-ge/FederalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Government of Canada",
   :rdfs/seeAlso {:xsd/anyURI "https://www.canada.ca/en/index.html"},
   :skos/definition
   "individual representing the federal parliamentary democracy and constitutional monarchy of Canada"})

(def GovernmentOfManitoba
  {:db/ident :fibo-be-ge-caj/GovernmentOfManitoba,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-caj/ProvinceOfManitobaJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-ca/Manitoba,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "government of Manitoba",
   :rdfs/seeAlso {:xsd/anyURI "http://www.gov.mb.ca/government/index.html"},
   :skos/definition
   "individual representing the regional government of the province of Manitoba"})

(def GovernmentOfNewBrunswick
  {:db/ident :fibo-be-ge-caj/GovernmentOfNewBrunswick,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-caj/ProvinceOfNewBrunswickJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-ca/NewBrunswick,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "government of New Brunswick",
   :rdfs/seeAlso
   {:xsd/anyURI
    "http://www2.gnb.ca/content/gnb/en/gateways/your_government.html"},
   :skos/definition
   "individual representing the regional government of the province of New Brunswick"})

(def GovernmentOfNewfoundlandAndLabrador
  {:db/ident :fibo-be-ge-caj/GovernmentOfNewfoundlandAndLabrador,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-caj/ProvinceOfNewfoundlandAndLabradorJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-ca/NewfoundlandAndLabrador,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "government of Newfoundland and Labrador",
   :rdfs/seeAlso {:xsd/anyURI "http://www.gov.nf.ca/government/index.html"},
   :skos/definition
   "individual representing the regional government of the province of Newfoundland and Labrador"})

(def GovernmentOfNorthwestTerritories
  {:db/ident :fibo-be-ge-caj/GovernmentOfNorthwestTerritories,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-caj/NorthwestTerritoriesJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-ca/NorthwestTerritories,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "government of Northwest Territories",
   :rdfs/seeAlso {:xsd/anyURI "http://www.gov.nt.ca/"},
   :skos/definition
   "individual representing the regional government of the Northwest Territories"})

(def GovernmentOfNovaScotia
  {:db/ident :fibo-be-ge-caj/GovernmentOfNovaScotia,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-caj/ProvinceOfNovaScotiaJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-ca/NovaScotia,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "government of Nova Scotia",
   :rdfs/seeAlso {:xsd/anyURI "http://novascotia.ca/government/"},
   :skos/definition
   "individual representing the regional government of the province of Nova Scotia"})

(def GovernmentOfNunavut
  {:db/ident :fibo-be-ge-caj/GovernmentOfNunavut,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-caj/NunavutJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-ca/Nunavut,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "government of Nunavut",
   :rdfs/seeAlso {:xsd/anyURI "http://gov.nu.ca/about-gn"},
   :skos/definition
   "individual representing the regional government of Nunavut"})

(def GovernmentOfOntario
  {:db/ident :fibo-be-ge-caj/GovernmentOfOntario,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-caj/ProvinceOfOntarioJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-ca/Ontario,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "government of Ontario",
   :rdfs/seeAlso {:xsd/anyURI "https://www.ontario.ca/page/government-ontario"},
   :skos/definition
   "individual representing the regional government of the province of Ontario"})

(def GovernmentOfPrinceEdwardIsland
  {:db/ident :fibo-be-ge-caj/GovernmentOfPrinceEdwardIsland,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-caj/ProvinceOfPrinceEdwardIslandJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-ca/PrinceEdwardIsland,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "government of Prince Edward Island",
   :rdfs/seeAlso {:xsd/anyURI "http://www.gov.pe.ca/index.php3"},
   :skos/definition
   "individual representing the regional government of the province of Prince Edward Island"})

(def GovernmentOfQuebec
  {:db/ident :fibo-be-ge-caj/GovernmentOfQuebec,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-caj/ProvinceOfQuebecJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-ca/Quebec,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "government of Quebec",
   :rdfs/seeAlso
   {:xsd/anyURI
    "http://www.gouv.qc.ca/EN/VotreGouvernement/Pages/Accueil.aspx?pgs"},
   :skos/definition
   "individual representing the regional government of the province of Quebec"})

(def GovernmentOfSaskatchewan
  {:db/ident :fibo-be-ge-caj/GovernmentOfSaskatchewan,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-caj/ProvinceOfSaskatchewanJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-ca/Saskatchewan,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "government of Saskatchewan",
   :rdfs/seeAlso #{{:xsd/anyURI "http://www.saskatchewan.ca/government"}
                   {:xsd/anyURI "http://gov.sk.ca/about-government/"}},
   :skos/definition
   "individual representing the regional government of the province of Saskatchewan"})

(def GovernmentOfYukon
  {:db/ident :fibo-be-ge-caj/GovernmentOfYukon,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-caj/YukonJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-ca/Yukon,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "government of Yukon",
   :rdfs/seeAlso {:xsd/anyURI "http://www.gov.yk.ca/"},
   :skos/definition
   "individual representing the regional government of the Yukon territory of Canada"})

(def NorthwestTerritoriesEntity
  {:db/ident :fibo-be-ge-caj/NorthwestTerritoriesEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-ca/NorthwestTerritories,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-caj/GovernmentOfNorthwestTerritories,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Northwest Territories entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.gov.nt.ca/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the Canadian Northwest Territories"})

(def NorthwestTerritoriesJurisdiction
  {:db/ident :fibo-be-ge-caj/NorthwestTerritoriesJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-caj/GovernmentOfNorthwestTerritories,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-ca/NorthwestTerritories,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Northwest Territories jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.justice.gov.nt.ca/en/browse/court-information/"},
   :skos/definition
   "individual representing the overall jurisdiction for the Courts of the Northwest Territories"})

(def NunavutEntity
  {:db/ident :fibo-be-ge-caj/NunavutEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-ca/Nunavut,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-caj/GovernmentOfNunavut,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Nunavut entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.gov.nu.ca/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the Canadian territory of Nunavut"})

(def NunavutJurisdiction
  {:db/ident :fibo-be-ge-caj/NunavutJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-caj/GovernmentOfNunavut,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-ca/Nunavut,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Nunavut jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.nunavutcourts.ca/"},
   :skos/definition
   "individual representing the overall jurisdiction for the Courts of Nunavut"})

(def ProvinceOfAlbertaEntity
  {:db/ident :fibo-be-ge-caj/ProvinceOfAlbertaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-ca/Alberta,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-caj/GovernmentOfAlberta,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Province of Alberta entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.alberta.ca/index.cfm"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the Canadian Province of Alberta"})

(def ProvinceOfAlbertaJurisdiction
  {:db/ident :fibo-be-ge-caj/ProvinceOfAlbertaJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-caj/GovernmentOfAlberta,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-ca/Alberta,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "province of Alberta jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "https://albertacourts.ca/"},
   :skos/definition
   "individual representing the overall jurisdiction for the Canadian Province Of Alberta, i.e., that of the Alberta Court of Appeal, Court of Queen's Bench, and Provincial Court of Alberta"})

(def ProvinceOfBritishColumbiaEntity
  {:db/ident :fibo-be-ge-caj/ProvinceOfBritishColumbiaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-ca/BritishColumbia,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-caj/GovernmentOfBritishColumbia,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Province of British Columbia entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www2.gov.bc.ca/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the Canadian Province of British Columbia"})

(def ProvinceOfBritishColumbiaJurisdiction
  {:db/ident :fibo-be-ge-caj/ProvinceOfBritishColumbiaJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-caj/GovernmentOfBritishColumbia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-ca/BritishColumbia,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "province of British Columbia jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.ag.gov.bc.ca/courts/"},
   :skos/definition
   "individual representing the overall jurisdiction for the Canadian Province Of British Columbia, i.e., that of the British Columbia Court of Appeal, Supreme Court, and Provincial Court of British Columbia"})

(def ProvinceOfManitobaEntity
  {:db/ident :fibo-be-ge-caj/ProvinceOfManitobaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-ca/Manitoba,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-caj/GovernmentOfManitoba,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Province of Manitoba entity",
   :rdfs/seeAlso {:xsd/anyURI "http://gov.mb.ca/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the Canadian Province of Manitoba"})

(def ProvinceOfManitobaJurisdiction
  {:db/ident :fibo-be-ge-caj/ProvinceOfManitobaJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-caj/GovernmentOfManitoba,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-ca/Manitoba,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "province of Manitoba jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.manitobacourts.mb.ca/"},
   :skos/definition
   "individual representing the overall jurisdiction for the Canadian Province Of Manitoba, i.e., that of the Manitoba Court of Appeal, Court of Queen's Bench, and Provincial Court of Manitoba"})

(def ProvinceOfNewBrunswickEntity
  {:db/ident :fibo-be-ge-caj/ProvinceOfNewBrunswickEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-ca/NewBrunswick,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-caj/GovernmentOfNewBrunswick,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Province of New Brunswick entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www2.gnb.ca/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the Canadian Province of New Brunswick"})

(def ProvinceOfNewBrunswickJurisdiction
  {:db/ident :fibo-be-ge-caj/ProvinceOfNewBrunswickJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-caj/GovernmentOfNewBrunswick,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-ca/NewBrunswick,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "province of New Brunswick jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.gnb.ca/Cour/index-e.asp"},
   :skos/definition
   "individual representing the overall jurisdiction for the Canadian Province Of New Brunswick, i.e., that of the New Brunswick Court of Appeal, Court of Queen's Bench, and Provincial Court of New Brunswick"})

(def ProvinceOfNewfoundlandAndLabradorEntity
  {:db/ident :fibo-be-ge-caj/ProvinceOfNewfoundlandAndLabradorEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver
   :lcc-3166-2-ca/NewfoundlandAndLabrador,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-caj/GovernmentOfNewfoundlandAndLabrador,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Province of Newfoundland and Labrador entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.gov.nf.ca/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the Canadian Province of Newfoundland and Labrador"})

(def ProvinceOfNewfoundlandAndLabradorJurisdiction
  {:db/ident :fibo-be-ge-caj/ProvinceOfNewfoundlandAndLabradorJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-caj/GovernmentOfNewfoundlandAndLabrador,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-ca/NewfoundlandAndLabrador,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "province of Newfoundland and Labrador jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.court.nl.ca/"},
   :skos/definition
   "individual representing the overall jurisdiction for the Canadian Province Of Newfoundland and Labrador, i.e., that of the Newfoundland and Labrador Supreme and Provincial Courts"})

(def ProvinceOfNovaScotiaEntity
  {:db/ident :fibo-be-ge-caj/ProvinceOfNovaScotiaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-ca/NovaScotia,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-caj/GovernmentOfNovaScotia,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Province of Nova Scotia entity",
   :rdfs/seeAlso {:xsd/anyURI "http://novascotia.ca/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the Canadian Province of Nova Scotia"})

(def ProvinceOfNovaScotiaJurisdiction
  {:db/ident :fibo-be-ge-caj/ProvinceOfNovaScotiaJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-caj/GovernmentOfNovaScotia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-ca/NovaScotia,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "province of Nova Scotia jurisdiction",
   :rdfs/seeAlso
   {:xsd/anyURI
    "http://www.courts.ns.ca/Courthouse_Locations/Courthouse_Locations_Map.htm"},
   :skos/definition
   "individual representing the overall jurisdiction for the Canadian Province Of Nova Scotia, i.e., that of the Nova Scotia Supreme and Provincial Courts and Court of Appeals"})

(def ProvinceOfOntarioEntity
  {:db/ident :fibo-be-ge-caj/ProvinceOfOntarioEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-ca/Ontario,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-caj/GovernmentOfOntario,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Province of Ontario entity",
   :rdfs/seeAlso {:xsd/anyURI "https://www.ontario.ca/page/government-ontario"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the Canadian Province of Ontario"})

(def ProvinceOfOntarioJurisdiction
  {:db/ident :fibo-be-ge-caj/ProvinceOfOntarioJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-caj/GovernmentOfOntario,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-ca/Ontario,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "province of Ontario jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI
                  "http://www.attorneygeneral.jus.gov.on.ca/english/courts/"},
   :skos/definition
   "individual representing the overall jurisdiction for the Canadian Province Of Ontario, i.e., that of the Ontario Superior and Provincial Court of Justice as well as Court of Appeals"})

(def ProvinceOfPrinceEdwardIslandEntity
  {:db/ident :fibo-be-ge-caj/ProvinceOfPrinceEdwardIslandEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-ca/PrinceEdwardIsland,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-caj/GovernmentOfPrinceEdwardIsland,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Province of Prince Edward Island entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.gov.pe.ca/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the Canadian Province of Prince Edward Island"})

(def ProvinceOfPrinceEdwardIslandJurisdiction
  {:db/ident :fibo-be-ge-caj/ProvinceOfPrinceEdwardIslandJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-caj/GovernmentOfPrinceEdwardIsland,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-ca/PrinceEdwardIsland,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "province of Prince Edward Island jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.courts.pe.ca/"},
   :skos/definition
   "individual representing the overall jurisdiction for the Canadian Province Of Prince Edward Island, i.e., that of the Prince Edward Island Court of Appeal, as well as the Supreme and Provincial Courts of Prince Edward Island"})

(def ProvinceOfQuebecEntity
  {:db/ident :fibo-be-ge-caj/ProvinceOfQuebecEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-ca/Quebec,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-caj/GovernmentOfQuebec,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Province of Quebec entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.gouv.qc.ca/EN/Pages/Accueil.aspx"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the Canadian Province of Quebec"})

(def ProvinceOfQuebecJurisdiction
  {:db/ident :fibo-be-ge-caj/ProvinceOfQuebecJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-caj/GovernmentOfQuebec,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-ca/Quebec,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "province of Quebec jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI
                  "http://www.gouv.qc.ca/EN/LeQuebec/Pages/Justice.aspx"},
   :skos/definition
   "individual representing the overall jurisdiction for the Canadian Province Of Quebec, i.e., that of the Quebec Court of Appeal, and the Supreme and Provincial Courts of Quebec"})

(def ProvinceOfSaskatchewanEntity
  {:db/ident :fibo-be-ge-caj/ProvinceOfSaskatchewanEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-ca/Saskatchewan,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-caj/GovernmentOfSaskatchewan,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Province of Saskatchewan entity",
   :rdfs/seeAlso {:xsd/anyURI "http://gov.sk.ca/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the Canadian Province of Saskatchewan"})

(def ProvinceOfSaskatchewanJurisdiction
  {:db/ident :fibo-be-ge-caj/ProvinceOfSaskatchewanJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-caj/GovernmentOfSaskatchewan,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-ca/Saskatchewan,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "province of Saskatchewan jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.sasklawcourts.ca/"},
   :skos/definition
   "individual representing the overall jurisdiction for the Canadian Province Of Saskatchewan, i.e., that of the Saskatchewan Court of Appeal, Court of Queen's Bench, and Provincial Court of Saskatchewan"})

(def YukonEntity
  {:db/ident :fibo-be-ge-caj/YukonEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-ca/Yukon,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-caj/GovernmentOfYukon,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Yukon entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.gov.yk.ca/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the Canadian Yukon territory"})

(def YukonJurisdiction
  {:db/ident :fibo-be-ge-caj/YukonJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-caj/GovernmentOfYukon,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-ca/Yukon,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Yukon jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI
                  "http://www.justice.gov.yk.ca/prog/cs/csindex.html"},
   :skos/definition
   "individual representing the overall jurisdiction for the Courts of Yukon"})

(def urn:uuid:195ac1ed-14b4-5fc1-a27a-f75b376c3253
  {:cmns-av/copyright #{"Copyright (c) 2016-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology provides the set of basic federal government, provincial, and territory level entities and jurisdictions for use in other Canada-specific FIBO ontologies.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Arrangements/IdentifiersAndIndices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Canadian Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The http://www.omg.org/spec/EDMC-FIBO/BE/20200201/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to replace 'hasPartialSovereigntyOver' with 'hasSharedSovereigntyOver'."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/"})