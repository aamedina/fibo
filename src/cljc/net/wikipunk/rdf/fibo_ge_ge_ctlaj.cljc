(ns net.wikipunk.rdf.fibo-ge-ge-ctlaj
  "This ontology provides the set of basic government-level entities and jurisdictions for independent countries identified as part of Central America in the U.N. M49 classification."
  {:cmns-av/copyright ["Copyright (c) 2020-2023 EDM Council, Inc."
                       "Copyright (c) 2020-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :dcterms/abstract
   "This ontology provides the set of basic government-level entities and jurisdictions for independent countries identified as part of Central America in the U.N. M49 classification.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/GovernmentEntities/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/IdentifiersAndIndices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LEIEntities/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :rdf/ns-prefix-map
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-ge-ge-ctlaj",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfs/label
   "Central American Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."],
   :skos/scopeNote
   "The initial version of this ontology reflects the highest national level only."})

(def BelizeanEntity
  "sovereign state and polity that is a Caribbean country located on the northeastern coast of Central America"
  {:db/ident :fibo-ge-ge-ctlaj/BelizeanEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Belize,
   :fibo-be-ge-ge/isRepresentedBy :fibo-ge-ge-ctlaj/GovernmentOfBelize,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Belizean entity",
   :skos/definition
   "sovereign state and polity that is a Caribbean country located on the northeastern coast of Central America"})

(def CostaRicanEntity
  "sovereign state and polity that is a Central American country bordered by Nicaragua to the north, the Caribbean Sea to the northeast, Panama to the southeast, the Pacific Ocean to the southwest, and Ecuador to the south of Cocos Island"
  {:db/ident :fibo-ge-ge-ctlaj/CostaRicanEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/CostaRica,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfCostaRica,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Costa Rican entity",
   :skos/definition
   "sovereign state and polity that is a Central American country bordered by Nicaragua to the north, the Caribbean Sea to the northeast, Panama to the southeast, the Pacific Ocean to the southwest, and Ecuador to the south of Cocos Island"})

(def GovernmentOfBelize
  "unitary parliamentary constitutional monarchy, with the queen (Elizabeth II) as head of state represented locally by a governor-general"
  {:db/ident :fibo-ge-ge-ctlaj/GovernmentOfBelize,
   :fibo-be-ge-ge/hasJurisdiction :fibo-ge-ge-ctlaj/JurisdictionOfBelize,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Belize,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfs/label #voc/lstr "Government of Belize@en",
   :skos/definition
   "unitary parliamentary constitutional monarchy, with the queen (Elizabeth II) as head of state represented locally by a governor-general"})

(def GovernmentOfTheRepublicOfCostaRica
  "unitary presidential constitutional republic known for its long-standing and stable democracy"
  {:db/ident :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfCostaRica,
   :fibo-be-ge-ge/hasJurisdiction :fibo-ge-ge-ctlaj/JurisdictionOfCostaRica,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/CostaRica,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "República de Costa Rica@es"
                #voc/lstr "Government of the Republic of Costa Rica@en"],
   :skos/definition
   "unitary presidential constitutional republic known for its long-standing and stable democracy"})

(def GovernmentOfTheRepublicOfElSalvador
  "Unitary presidential, constitutional and representative democratic republic whose president is both head of state and head of government"
  {:db/ident :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfElSalvador,
   :fibo-be-ge-ge/hasJurisdiction :fibo-ge-ge-ctlaj/JurisdictionOfElSalvador,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/ElSalvador,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "República de El Salvador@es"
                #voc/lstr "Government of the Republic of El Salvador@en"],
   :skos/definition
   "Unitary presidential, constitutional and representative democratic republic whose president is both head of state and head of government"})

(def GovernmentOfTheRepublicOfGuatemala
  "unitary presidential and democratic republic that is the most populous country in Central America"
  {:db/ident :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfGuatemala,
   :fibo-be-ge-ge/hasJurisdiction :fibo-ge-ge-ctlaj/JurisdictionOfGuatemala,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Guatemala,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "República de Guatemala@es"
                #voc/lstr "Government of the Republic of Guatemala@en"],
   :skos/definition
   "unitary presidential and democratic republic that is the most populous country in Central America"})

(def GovernmentOfTheRepublicOfHonduras
  "presidential representative democratic republic whose president is both head of state and head of government"
  {:db/ident :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfHonduras,
   :fibo-be-ge-ge/hasJurisdiction :fibo-ge-ge-ctlaj/JurisdictionOfHonduras,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Honduras,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "República de Honduras@es"
                #voc/lstr "Government of the Republic of Honduras@en"],
   :skos/definition
   "presidential representative democratic republic whose president is both head of state and head of government"})

(def GovernmentOfTheRepublicOfNicaragua
  "Unitary dominant-party presidential constitutional republic whose president is both head of state and head of government"
  {:db/ident :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfNicaragua,
   :fibo-be-ge-ge/hasJurisdiction :fibo-ge-ge-ctlaj/JurisdictionOfNicaragua,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Nicaragua,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "República de Nicaragua@es"
                #voc/lstr "Government of the Republic of Nicaragua@en"],
   :skos/definition
   "Unitary dominant-party presidential constitutional republic whose president is both head of state and head of government"})

(def GovernmentOfTheRepublicOfPanama
  "Unitary presidential, constitutional and representative democratic republic whose president is both head of state and head of government"
  {:db/ident :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfPanama,
   :fibo-be-ge-ge/hasJurisdiction :fibo-ge-ge-ctlaj/JurisdictionOfPanama,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Panama,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "República de Panamá@es"
                #voc/lstr "Government of the Republic of Panama@en"],
   :skos/definition
   "Unitary presidential, constitutional and representative democratic republic whose president is both head of state and head of government"})

(def GuatemalanEntity
  "sovereign state and polity that is a Central American country bordered by Mexico to the north and west, Belize and the Caribbean to the northeast, Honduras to the east, El Salvador to the southeast and the Pacific Ocean to the south"
  {:db/ident :fibo-ge-ge-ctlaj/GuatemalanEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Guatemala,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfGuatemala,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Guatemalan entity",
   :skos/definition
   "sovereign state and polity that is a Central American country bordered by Mexico to the north and west, Belize and the Caribbean to the northeast, Honduras to the east, El Salvador to the southeast and the Pacific Ocean to the south"})

(def HonduranEntity
  "sovereign state and polity that is a Central American country bordered to the west by Guatemala, to the southwest by El Salvador, to the southeast by Nicaragua, to the south by the Pacific Ocean at the Gulf of Fonseca, and to the north by the Gulf of Honduras, a large inlet of the Caribbean Sea"
  {:db/ident :fibo-ge-ge-ctlaj/HonduranEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Honduras,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfHonduras,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Honduran entity",
   :skos/definition
   "sovereign state and polity that is a Central American country bordered to the west by Guatemala, to the southwest by El Salvador, to the southeast by Nicaragua, to the south by the Pacific Ocean at the Gulf of Fonseca, and to the north by the Gulf of Honduras, a large inlet of the Caribbean Sea"})

(def JurisdictionOfBelize
  "jurisdiction of the Supreme Court and Court of Appeals in Belize, with the Caribbean Court of Justice as the highest level of appeal for certain cases"
  {:db/ident :fibo-ge-ge-ctlaj/JurisdictionOfBelize,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-ge-ge-ctlaj/GovernmentOfBelize,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Belize,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of Belize",
   :skos/definition
   "jurisdiction of the Supreme Court and Court of Appeals in Belize, with the Caribbean Court of Justice as the highest level of appeal for certain cases"})

(def JurisdictionOfCostaRica
  "jurisdiction of the judiciary of Costa Rica, which is the system of courts that interprets and applies the law in Costa Rica"
  {:db/ident :fibo-ge-ge-ctlaj/JurisdictionOfCostaRica,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfCostaRica,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/CostaRica,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of Costa Rica",
   :skos/definition
   "jurisdiction of the judiciary of Costa Rica, which is the system of courts that interprets and applies the law in Costa Rica"})

(def JurisdictionOfElSalvador
  "jurisdiction of the Salvadorian judiciary, headed by the Supreme Court, which is composed of 15 judges, one of them being elected as President of the Judiciary"
  {:db/ident :fibo-ge-ge-ctlaj/JurisdictionOfElSalvador,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfElSalvador,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/ElSalvador,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of ElSalvador",
   :skos/definition
   "jurisdiction of the Salvadorian judiciary, headed by the Supreme Court, which is composed of 15 judges, one of them being elected as President of the Judiciary"})

(def JurisdictionOfGuatemala
  "jurisdiction of the judiciary of Guatemala, which is the system of courts that interprets and applies the law in Guatemala"
  {:db/ident :fibo-ge-ge-ctlaj/JurisdictionOfGuatemala,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfGuatemala,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Guatemala,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of Guatemala",
   :skos/definition
   "jurisdiction of the judiciary of Guatemala, which is the system of courts that interprets and applies the law in Guatemala"})

(def JurisdictionOfHonduras
  "jurisdiction of the judiciary of Honduras, which is the system of courts that interprets and applies the law in Honduras"
  {:db/ident :fibo-ge-ge-ctlaj/JurisdictionOfHonduras,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfHonduras,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Honduras,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of Honduras",
   :skos/definition
   "jurisdiction of the judiciary of Honduras, which is the system of courts that interprets and applies the law in Honduras"})

(def JurisdictionOfNicaragua
  "jurisdiction of the judiciary of Nicaragua, which is the system of courts that interprets and applies the law in Nicaragua"
  {:db/ident :fibo-ge-ge-ctlaj/JurisdictionOfNicaragua,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfNicaragua,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Nicaragua,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of Nicaragua",
   :skos/definition
   "jurisdiction of the judiciary of Nicaragua, which is the system of courts that interprets and applies the law in Nicaragua"})

(def JurisdictionOfPanama
  "jurisdiction of the Panamanian judiciary, which is the system of courts that interprets and applies the law in Panama"
  {:db/ident :fibo-ge-ge-ctlaj/JurisdictionOfPanama,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfPanama,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Panama,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of Panama",
   :skos/definition
   "jurisdiction of the Panamanian judiciary, which is the system of courts that interprets and applies the law in Panama"})

(def NicaraguanEntity
  "sovereign state and polity that is the largest country in the Central American isthmus, bordered by Honduras to the northwest, the Caribbean to the east, Costa Rica to the south, and the Pacific Ocean to the southwest"
  {:db/ident :fibo-ge-ge-ctlaj/NicaraguanEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Nicaragua,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfNicaragua,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Nicaraguan entity",
   :skos/definition
   "sovereign state and polity that is the largest country in the Central American isthmus, bordered by Honduras to the northwest, the Caribbean to the east, Costa Rica to the south, and the Pacific Ocean to the southwest"})

(def PanamanianEntity
  "sovereign state and polity that is a transcontinental country in Central America and South America, bordered by Costa Rica to the west, Colombia to the southeast, the Caribbean Sea to the north, and the Pacific Ocean to the south"
  {:db/ident :fibo-ge-ge-ctlaj/PanamanianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Panama,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfPanama,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Panamanian entity",
   :skos/definition
   "sovereign state and polity that is a transcontinental country in Central America and South America, bordered by Costa Rica to the west, Colombia to the southeast, the Caribbean Sea to the north, and the Pacific Ocean to the south"})

(def SalvadorianEntity
  "sovereign state and polity that is bordered on the northeast by Honduras, on the northwest by Guatemala, and on the south by the Pacific Ocean"
  {:db/ident :fibo-ge-ge-ctlaj/SalvadorianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/ElSalvador,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-ge-ge-ctlaj/GovernmentOfTheRepublicOfElSalvador,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Salvadorian entity",
   :skos/definition
   "sovereign state and polity that is bordered on the northeast by Honduras, on the northwest by Guatemala, and on the south by the Pacific Ocean"})