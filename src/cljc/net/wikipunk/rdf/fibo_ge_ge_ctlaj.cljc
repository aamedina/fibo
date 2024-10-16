(ns net.wikipunk.rdf.fibo-ge-ge-ctlaj
  {:cmns-av/copyright #{"Copyright (c) 2020-2023 Object Management Group, Inc."
                        "Copyright (c) 2020-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :dcterms/abstract
   "This ontology provides the set of basic government-level entities and jurisdictions for independent countries identified as part of Central America in the U.N. M49 classification.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-ge-ge"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ge-ge-ctlaj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/IdentifiersAndIndices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-ge-ge-ctlaj",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfs/label
   "Central American Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."},
   :skos/scopeNote
   "The initial version of this ontology reflects the highest national level only.",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/"})

(def BelizeanEntity
  {:db/ident :fibo-ge-ge-ctlaj/BelizeanEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Belize,
   :fibo-be-ge-ge/isRepresentedBy :fibo-ge-ge-ctlaj/GovernmentOfBelize,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Belizean entity",
   :skos/definition
   "sovereign state and polity that is a Caribbean country located on the northeastern coast of Central America"})

(def CostaRicanEntity
  {:db/ident :fibo-ge-ge-ctlaj/CostaRicanEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/CostaRica,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfCostaRica,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Costa Rican entity",
   :skos/definition
   "sovereign state and polity that is a Central American country bordered by Nicaragua to the north, the Caribbean Sea to the northeast, Panama to the southeast, the Pacific Ocean to the southwest, and Ecuador to the south of Cocos Island"})

(def GovernmentOfBelize
  {:db/ident :fibo-ge-ge-ctlaj/GovernmentOfBelize,
   :fibo-be-ge-ge/hasJurisdiction :fibo-ge-ge-ctlaj/JurisdictionOfBelize,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Belize,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Government of Belize"},
   :skos/definition
   "unitary parliamentary constitutional monarchy, with the queen (Elizabeth II) as head of state represented locally by a governor-general"})

(def GovernmentOfTheRepublicOfCostaRica
  {:db/ident :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfCostaRica,
   :fibo-be-ge-ge/hasJurisdiction :fibo-ge-ge-ctlaj/JurisdictionOfCostaRica,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/CostaRica,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Republic of Costa Rica"}
                 {:rdf/language "es",
                  :rdf/value    "República de Costa Rica"}},
   :skos/definition
   "unitary presidential constitutional republic known for its long-standing and stable democracy"})

(def GovernmentOfTheRepublicOfElSalvador
  {:db/ident :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfElSalvador,
   :fibo-be-ge-ge/hasJurisdiction :fibo-ge-ge-ctlaj/JurisdictionOfElSalvador,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/ElSalvador,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "República de El Salvador"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Republic of El Salvador"}},
   :skos/definition
   "Unitary presidential, constitutional and representative democratic republic whose president is both head of state and head of government"})

(def GovernmentOfTheRepublicOfGuatemala
  {:db/ident :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfGuatemala,
   :fibo-be-ge-ge/hasJurisdiction :fibo-ge-ge-ctlaj/JurisdictionOfGuatemala,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Guatemala,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Republic of Guatemala"}
                 {:rdf/language "es",
                  :rdf/value    "República de Guatemala"}},
   :skos/definition
   "unitary presidential and democratic republic that is the most populous country in Central America"})

(def GovernmentOfTheRepublicOfHonduras
  {:db/ident :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfHonduras,
   :fibo-be-ge-ge/hasJurisdiction :fibo-ge-ge-ctlaj/JurisdictionOfHonduras,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Honduras,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "República de Honduras"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Republic of Honduras"}},
   :skos/definition
   "presidential representative democratic republic whose president is both head of state and head of government"})

(def GovernmentOfTheRepublicOfNicaragua
  {:db/ident :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfNicaragua,
   :fibo-be-ge-ge/hasJurisdiction :fibo-ge-ge-ctlaj/JurisdictionOfNicaragua,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Nicaragua,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "República de Nicaragua"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Republic of Nicaragua"}},
   :skos/definition
   "Unitary dominant-party presidential constitutional republic whose president is both head of state and head of government"})

(def GovernmentOfTheRepublicOfPanama
  {:db/ident :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfPanama,
   :fibo-be-ge-ge/hasJurisdiction :fibo-ge-ge-ctlaj/JurisdictionOfPanama,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Panama,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "República de Panamá"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Republic of Panama"}},
   :skos/definition
   "Unitary presidential, constitutional and representative democratic republic whose president is both head of state and head of government"})

(def GuatemalanEntity
  {:db/ident :fibo-ge-ge-ctlaj/GuatemalanEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Guatemala,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfGuatemala,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Guatemalan entity",
   :skos/definition
   "sovereign state and polity that is a Central American country bordered by Mexico to the north and west, Belize and the Caribbean to the northeast, Honduras to the east, El Salvador to the southeast and the Pacific Ocean to the south"})

(def HonduranEntity
  {:db/ident :fibo-ge-ge-ctlaj/HonduranEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Honduras,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfHonduras,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Honduran entity",
   :skos/definition
   "sovereign state and polity that is a Central American country bordered to the west by Guatemala, to the southwest by El Salvador, to the southeast by Nicaragua, to the south by the Pacific Ocean at the Gulf of Fonseca, and to the north by the Gulf of Honduras, a large inlet of the Caribbean Sea"})

(def JurisdictionOfBelize
  {:db/ident :fibo-ge-ge-ctlaj/JurisdictionOfBelize,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-ge-ge-ctlaj/GovernmentOfBelize,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Belize,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Belize",
   :skos/definition
   "jurisdiction of the Supreme Court and Court of Appeals in Belize, with the Caribbean Court of Justice as the highest level of appeal for certain cases"})

(def JurisdictionOfCostaRica
  {:db/ident :fibo-ge-ge-ctlaj/JurisdictionOfCostaRica,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfCostaRica,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/CostaRica,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Costa Rica",
   :skos/definition
   "jurisdiction of the judiciary of Costa Rica, which is the system of courts that interprets and applies the law in Costa Rica"})

(def JurisdictionOfElSalvador
  {:db/ident :fibo-ge-ge-ctlaj/JurisdictionOfElSalvador,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfElSalvador,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/ElSalvador,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of ElSalvador",
   :skos/definition
   "jurisdiction of the Salvadorian judiciary, headed by the Supreme Court, which is composed of 15 judges, one of them being elected as President of the Judiciary"})

(def JurisdictionOfGuatemala
  {:db/ident :fibo-ge-ge-ctlaj/JurisdictionOfGuatemala,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfGuatemala,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Guatemala,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Guatemala",
   :skos/definition
   "jurisdiction of the judiciary of Guatemala, which is the system of courts that interprets and applies the law in Guatemala"})

(def JurisdictionOfHonduras
  {:db/ident :fibo-ge-ge-ctlaj/JurisdictionOfHonduras,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfHonduras,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Honduras,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Honduras",
   :skos/definition
   "jurisdiction of the judiciary of Honduras, which is the system of courts that interprets and applies the law in Honduras"})

(def JurisdictionOfNicaragua
  {:db/ident :fibo-ge-ge-ctlaj/JurisdictionOfNicaragua,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfNicaragua,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Nicaragua,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Nicaragua",
   :skos/definition
   "jurisdiction of the judiciary of Nicaragua, which is the system of courts that interprets and applies the law in Nicaragua"})

(def JurisdictionOfPanama
  {:db/ident :fibo-ge-ge-ctlaj/JurisdictionOfPanama,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfPanama,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Panama,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Panama",
   :skos/definition
   "jurisdiction of the Panamanian judiciary, which is the system of courts that interprets and applies the law in Panama"})

(def NicaraguanEntity
  {:db/ident :fibo-ge-ge-ctlaj/NicaraguanEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Nicaragua,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfNicaragua,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Nicaraguan entity",
   :skos/definition
   "sovereign state and polity that is the largest country in the Central American isthmus, bordered by Honduras to the northwest, the Caribbean to the east, Costa Rica to the south, and the Pacific Ocean to the southwest"})

(def PanamanianEntity
  {:db/ident :fibo-ge-ge-ctlaj/PanamanianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Panama,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfPanama,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Panamanian entity",
   :skos/definition
   "sovereign state and polity that is a transcontinental country in Central America and South America, bordered by Costa Rica to the west, Colombia to the southeast, the Caribbean Sea to the north, and the Pacific Ocean to the south"})

(def SalvadorianEntity
  {:db/ident :fibo-ge-ge-ctlaj/SalvadorianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/ElSalvador,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfElSalvador,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Salvadorian entity",
   :skos/definition
   "sovereign state and polity that is bordered on the northeast by Honduras, on the northwest by Guatemala, and on the south by the Pacific Ocean"})

(def urn:uuid:cce34306-428f-564d-bf17-e361b95ee1b4
  {:cmns-av/copyright #{"Copyright (c) 2020-2023 Object Management Group, Inc."
                        "Copyright (c) 2020-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology provides the set of basic government-level entities and jurisdictions for independent countries identified as part of Central America in the U.N. M49 classification.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/IdentifiersAndIndices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Central American Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."},
   :skos/scopeNote
   "The initial version of this ontology reflects the highest national level only.",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/"})