(ns net.wikipunk.rdf.fibo-ge-ge-saj
  {:cmns-av/copyright #{"Copyright (c) 2020-2023 Object Management Group, Inc."
                        "Copyright (c) 2020-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/",
   :dcterms/abstract
   "This ontology provides the set of basic government-level entities and jurisdictions for independent countries identified as part of South America in the U.N. M49 classification.",
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
    "fibo-ge-ge-saj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
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
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-ge-ge-saj",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "South American Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."},
   :skos/scopeNote
   "The initial version of this ontology reflects the highest national level only.",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"})

(def ArgentinianEntity
  {:db/ident :fibo-ge-ge-saj/ArgentinianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Argentina,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-ge-ge-saj/GovernmentOfTheArgentineRepublic,
   :rdf/type #{:fibo-be-ge-ge/FederatedSovereignty :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Argentinian entity",
   :skos/definition
   "federated sovereignty and polity that is located in the southern half of South America, bordered by Bolivia and Paraguay to the north, Brazil to the northeast, Uruguay and the South Atlantic Ocean to the east, and the Drake Passage to the south"})

(def BolivianEntity
  {:db/ident :fibo-ge-ge-saj/BolivianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Bolivia,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-ge-ge-saj/GovernmentOfThePlurinationalStateOfBolivia,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Bolivian entity",
   :skos/definition
   "sovereign state and polity that is a landlocked country located in western-central South America"})

(def BrazilianEntity
  {:db/ident :fibo-ge-ge-saj/BrazilianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Brazil,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-ge-ge-saj/GovernmentOfTheFederativeRepublicOfBrazil,
   :rdf/type #{:fibo-be-ge-ge/FederatedSovereignty :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Brazilian entity",
   :skos/definition
   "federated sovereignty and polity that is the largest country in both South America and Latin America"})

(def ChileanEntity
  {:db/ident :fibo-ge-ge-saj/ChileanEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Chile,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-ge-ge-saj/GovernmentOfTheRepublicOfChile,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Chilean entity",
   :skos/definition
   "sovereign state and polity that occupies a long, narrow strip of land between the Andes to the east and the Pacific Ocean to the west, and borders Peru to the north, Bolivia to the northeast, Argentina to the east, and the Drake Passage in the far south"})

(def ColombianEntity
  {:db/ident :fibo-ge-ge-saj/ColombianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Colombia,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-ge-ge-saj/GovernmentOfTheRepublicOfColombia,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Colombian entity",
   :skos/definition
   "sovereign state and polity that is a transcontinental country largely in the north of South America, bounded on the north by the Caribbean Sea, the northwest by Panama, the south by Ecuador and Peru, the east by Venezuela, the southeast by Brazil, and the west by the Pacific Ocean"})

(def EcuadorianEntity
  {:db/ident :fibo-ge-ge-saj/EcuadorianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Ecuador,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-ge-ge-saj/GovernmentOfTheRepublicOfEcuador,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Ecuadorian entity",
   :skos/definition
   "sovereign state and polity that is located in northwestern South America, bordered by Colombia on the north, Peru on the east and south, and the Pacific Ocean on the west"})

(def GovernmentOfTheArgentineRepublic
  {:db/ident :fibo-ge-ge-saj/GovernmentOfTheArgentineRepublic,
   :fibo-be-ge-ge/hasJurisdiction :fibo-ge-ge-saj/JurisdictionOfArgentina,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Argentina,
   :rdf/type #{:fibo-be-ge-ge/FederalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Argentine Republic"}
                 {:rdf/language "es",
                  :rdf/value    "República Argentina"}},
   :skos/definition
   "federal presidential constitutional republic and representative democracy whose president is both head of state and head of government"})

(def GovernmentOfTheBolivarianRepublicOfVenezuela
  {:db/ident :fibo-ge-ge-saj/GovernmentOfTheBolivarianRepublicOfVenezuela,
   :fibo-be-ge-ge/hasJurisdiction :fibo-ge-ge-saj/JurisdictionOfVenezuela,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Venezuela,
   :rdf/type #{:fibo-be-ge-ge/FederalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "República Bolivariana de Venezuela"}
                 {:rdf/language "en",
                  :rdf/value
                  "Government of the Bolivarian Republic of Venezuela"}},
   :skos/definition
   "federal dominant-party presidential constitutional republic, whose president is both head of state and head of government"})

(def GovernmentOfTheCo-operativeRepublicOfGuyana
  {:db/ident :fibo-ge-ge-saj/GovernmentOfTheCo-operativeRepublicOfGuyana,
   :fibo-be-ge-ge/hasJurisdiction :fibo-ge-ge-saj/JurisdictionOfGuyana,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Guyana,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value "Government of the Co-operative Republic of Guyana"},
   :skos/definition
   "unitary presidential constitutional republic and representative democracy, whose president is both head of state and head of government"})

(def GovernmentOfTheFederativeRepublicOfBrazil
  {:db/ident :fibo-ge-ge-saj/GovernmentOfTheFederativeRepublicOfBrazil,
   :fibo-be-ge-ge/hasJurisdiction :fibo-ge-ge-saj/JurisdictionOfBrazil,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Brazil,
   :rdf/type #{:fibo-be-ge-ge/FederalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "pt",
                  :rdf/value    "República Federativa do Brasil"}
                 {:rdf/language "en",
                  :rdf/value
                  "Government of the Federative Republic of Brazil"}},
   :skos/definition
   "democratic federative republic, with a presidential system, whose president is both head of state and head of government"})

(def GovernmentOfTheOrientalRepublicOfUruguay
  {:db/ident :fibo-ge-ge-saj/GovernmentOfTheOrientalRepublicOfUruguay,
   :fibo-be-ge-ge/hasJurisdiction :fibo-ge-ge-saj/JurisdictionOfUruguay,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Uruguay,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value "Government of the Oriental Republic of Uruguay"}
                 {:rdf/language "es",
                  :rdf/value    "República Oriental del Uruguay"}
                 {:rdf/language "pt",
                  :rdf/value    "República Oriental do Uruguai"}},
   :skos/definition
   "unitary presidential constitutional republic and representative democracy, whose president is both head of state and head of government"})

(def GovernmentOfThePlurinationalStateOfBolivia
  {:db/ident :fibo-ge-ge-saj/GovernmentOfThePlurinationalStateOfBolivia,
   :fibo-be-ge-ge/hasJurisdiction :fibo-ge-ge-saj/JurisdictionOfBolivia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Bolivia,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value "Government of the Plurinational State of Bolivia"}
                 {:rdf/language "es",
                  :rdf/value    "Estado Plurinacional de Bolivia"}},
   :skos/definition
   "Unitary presidential constitutional republic and representative democracy whose president is both head of state and head of government"})

(def GovernmentOfTheRepublicOfChile
  {:db/ident :fibo-ge-ge-saj/GovernmentOfTheRepublicOfChile,
   :fibo-be-ge-ge/hasJurisdiction :fibo-ge-ge-saj/JurisdictionOfChile,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Chile,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "República de Chile"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Republic of Chile"}},
   :skos/definition
   "unitary presidential constitutional republic and representative democracy, whose president is both head of state and head of government"})

(def GovernmentOfTheRepublicOfColombia
  {:db/ident :fibo-ge-ge-saj/GovernmentOfTheRepublicOfColombia,
   :fibo-be-ge-ge/hasJurisdiction :fibo-ge-ge-saj/JurisdictionOfColombia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Colombia,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "República de Colombia"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Republic of Colombia"}},
   :skos/definition
   "unitary presidential constitutional republic and representative democracy, whose president is both head of state and head of government"})

(def GovernmentOfTheRepublicOfEcuador
  {:db/ident :fibo-ge-ge-saj/GovernmentOfTheRepublicOfEcuador,
   :fibo-be-ge-ge/hasJurisdiction :fibo-ge-ge-saj/JurisdictionOfEcuador,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Ecuador,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Republic of Ecuador"}
                 {:rdf/language "es",
                  :rdf/value    "República del Ecuador"}},
   :skos/definition
   "unitary presidential constitutional republic and representative democracy, whose president is both head of state and head of government"})

(def GovernmentOfTheRepublicOfParaguay
  {:db/ident :fibo-ge-ge-saj/GovernmentOfTheRepublicOfParaguay,
   :fibo-be-ge-ge/hasJurisdiction :fibo-ge-ge-saj/JurisdictionOfParaguay,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Paraguay,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "República del Paraguay"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Republic of Paraguay"}},
   :skos/definition
   "unitary dominant-party presidential republic and representative democracy, whose president is both head of state and head of government"})

(def GovernmentOfTheRepublicOfPeru
  {:db/ident :fibo-ge-ge-saj/GovernmentOfTheRepublicOfPeru,
   :fibo-be-ge-ge/hasJurisdiction :fibo-ge-ge-saj/JurisdictionOfPeru,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Peru,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Republic of Peru"}
                 {:rdf/language "es",
                  :rdf/value    "República del Perú"}},
   :skos/definition
   "unitary presidential constitutional republic and representative democracy, whose president is both head of state and head of government"})

(def GovernmentOfTheRepublicOfSuriname
  {:db/ident :fibo-ge-ge-saj/GovernmentOfTheRepublicOfSuriname,
   :fibo-be-ge-ge/hasJurisdiction :fibo-ge-ge-saj/JurisdictionOfSuriname,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Suriname,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "nl",
                  :rdf/value    "Republiek Suriname"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Republic of Suriname"}},
   :skos/definition
   "unitary republic and representative democracy, whose president is both head of state and head of government"})

(def GuyaneseEntity
  {:db/ident :fibo-ge-ge-saj/GuyaneseEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Guyana,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-ge-ge-saj/GovernmentOfTheCo-operativeRepublicOfGuyana,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Guyanese entity",
   :skos/definition
   "sovereign state and polity that is bordered by the Atlantic Ocean to the north, Brazil to the south and southwest, Venezuela to the west, and Suriname to the east"})

(def JurisdictionOfArgentina
  {:db/ident :fibo-ge-ge-saj/JurisdictionOfArgentina,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-ge-ge-saj/GovernmentOfTheArgentineRepublic,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Argentina,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Argentina",
   :skos/definition
   "jurisdiction of the judiciary of Argentina, which is the system of courts, including the Supreme Court and lower federal courts, that interprets and applies the law in Argentina"})

(def JurisdictionOfBolivia
  {:db/ident :fibo-ge-ge-saj/JurisdictionOfBolivia,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-ge-ge-saj/GovernmentOfThePlurinationalStateOfBolivia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Bolivia,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Bolivia",
   :skos/definition
   "jurisdiction of the judiciary of Bolivia, including the Supreme Court of Justice, the Plurinational Constitutional Court, the Judiciary Council, Agrarian and Environmental Court, and District (departmental) and lower courts that interpret and apply the law in Bolivia"})

(def JurisdictionOfBrazil
  {:db/ident :fibo-ge-ge-saj/JurisdictionOfBrazil,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-ge-ge-saj/GovernmentOfTheFederativeRepublicOfBrazil,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Brazil,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Brazil",
   :skos/definition
   "jurisdiction of the judiciary of Brazil, which is the system of courts, including the Federal Supreme Court and Federal District Courts, that interprets and applies the law in Brazil"})

(def JurisdictionOfChile
  {:db/ident :fibo-ge-ge-saj/JurisdictionOfChile,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-ge-ge-saj/GovernmentOfTheRepublicOfChile,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Chile,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Chile",
   :skos/definition
   "jurisdiction of the judiciary of Chile, which is the system of courts, including a court of appeal, a system of military courts, a constitutional tribunal, and the Supreme Court of Chile, that interprets and applies the law in Chile"})

(def JurisdictionOfColombia
  {:db/ident :fibo-ge-ge-saj/JurisdictionOfColombia,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-ge-ge-saj/GovernmentOfTheRepublicOfColombia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Colombia,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Colombia",
   :skos/definition
   "jurisdiction of the judiciary of Colombia, which is the system of courts, including the Supreme Court which deals with penal and civil matters, the Council of State, which has special responsibility for administrative law and also provides legal advice to the executive, the Constitutional Court, responsible for assuring the integrity of the Colombian constitution, and the Superior Council of Judicature, responsible for auditing the judicial branch, that interprets and applies the law in Colombia"})

(def JurisdictionOfEcuador
  {:db/ident :fibo-ge-ge-saj/JurisdictionOfEcuador,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-ge-ge-saj/GovernmentOfTheRepublicOfEcuador,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Ecuador,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Ecuador",
   :skos/definition
   "jurisdiction of the judiciary of Ecuador, which is the system of courts, including as its main body the Judicial Council, and also includes the National Court of Justice, provincial courts, and lower courts, that interprets and applies the law in Ecuador"})

(def JurisdictionOfGuyana
  {:db/ident :fibo-ge-ge-saj/JurisdictionOfGuyana,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-ge-ge-saj/GovernmentOfTheCo-operativeRepublicOfGuyana,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Guyana,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Guyana",
   :skos/definition
   "jurisdiction of the judiciary of Guyana, which is the system of courts, including the Supreme Court of Guyana, that interprets and applies the law in Guyana"})

(def JurisdictionOfParaguay
  {:db/ident :fibo-ge-ge-saj/JurisdictionOfParaguay,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-ge-ge-saj/GovernmentOfTheRepublicOfParaguay,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Paraguay,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Paraguay",
   :skos/definition
   "jurisdiction of the judiciary of Paraguay, which is the system of courts, including tribunals and Courts of Civil Law and a nine-member Supreme Court of Justice, that interprets and applies the law in Paraguay"})

(def JurisdictionOfPeru
  {:db/ident :fibo-ge-ge-saj/JurisdictionOfPeru,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-ge-ge-saj/GovernmentOfTheRepublicOfPeru,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Peru,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Peru",
   :skos/definition
   "jurisdiction of the judiciary of Peru, which is the system of courts, including the Supreme Court of Peru, also known as the Royal Audencia of Lima, that interprets and applies the law in Peru"})

(def JurisdictionOfSuriname
  {:db/ident :fibo-ge-ge-saj/JurisdictionOfSuriname,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-ge-ge-saj/GovernmentOfTheRepublicOfSuriname,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Suriname,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Suriname",
   :skos/definition
   "jurisdiction of the judiciary of Suriname, which is the system of courts, headed by the High Court of Justice of Suriname (Supreme Court), that interprets and applies the law in Suriname"})

(def JurisdictionOfUruguay
  {:db/ident :fibo-ge-ge-saj/JurisdictionOfUruguay,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-ge-ge-saj/GovernmentOfTheOrientalRepublicOfUruguay,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Uruguay,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Uruguay",
   :skos/definition
   "jurisdiction of the judiciary of Uruguay, which is the system of courts, including the Supreme Court, the bench and judges, that interprets and applies the law in Uruguay"})

(def JurisdictionOfVenezuela
  {:db/ident :fibo-ge-ge-saj/JurisdictionOfVenezuela,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-ge-ge-saj/GovernmentOfTheBolivarianRepublicOfVenezuela,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Venezuela,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Venezuela",
   :skos/definition
   "jurisdiction of the judiciary of Venezuela, which is the system of courts, including the Venezuelan Supreme Court, that interprets and applies the law in Venezuela"})

(def ParaguayanEntity
  {:db/ident :fibo-ge-ge-saj/ParaguayanEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Paraguay,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-ge-ge-saj/GovernmentOfTheRepublicOfParaguay,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Paraguayan entity",
   :skos/definition
   "sovereign state and polity that is bordered by Argentina to the south and southwest, Brazil to the east and northeast, and Bolivia to the northwest"})

(def PeruvianEntity
  {:db/ident :fibo-ge-ge-saj/PeruvianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Peru,
   :fibo-be-ge-ge/isRepresentedBy :fibo-ge-ge-saj/GovernmentOfTheRepublicOfPeru,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Peruvian entity",
   :skos/definition
   "sovereign state and polity that is bordered in the north by Ecuador and Colombia, in the east by Brazil, in the southeast by Bolivia, in the south by Chile, and in the west by the Pacific Ocean"})

(def SurinameseEntity
  {:db/ident :fibo-ge-ge-saj/SurinameseEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Suriname,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-ge-ge-saj/GovernmentOfTheRepublicOfSuriname,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Surinamese entity",
   :skos/definition
   "sovereign state and polity that is located on the northeastern Atlantic coast of South America, bordered by the Atlantic Ocean to the north, French Guiana to the east, Guyana to the west and Brazil to the south"})

(def UruguayanEntity
  {:db/ident :fibo-ge-ge-saj/UruguayanEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Uruguay,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-ge-ge-saj/GovernmentOfTheOrientalRepublicOfUruguay,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Uruguayan entity",
   :skos/definition
   "sovereign state and polity that is located in the southeastern region of South America, bordered by Argentina to its west and southwest and Brazil to its north and east, with the Rio de la Plata (River of Silver) to the south and the Atlantic Ocean to the southeast"})

(def VenezuelanEntity
  {:db/ident :fibo-ge-ge-saj/VenezuelanEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Venezuela,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-ge-ge-saj/GovernmentOfTheBolivarianRepublicOfVenezuela,
   :rdf/type #{:fibo-be-ge-ge/FederatedSovereignty :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Venezuelan entity",
   :skos/definition
   "sovereign state and polity that is located on the northern coast of South America, consisting of a continental landmass and many small islands and islets in the Caribbean Sea"})

(def urn:uuid:31599fd0-3774-572e-86fd-ff3860ffcc8c
  {:cmns-av/copyright #{"Copyright (c) 2020-2023 Object Management Group, Inc."
                        "Copyright (c) 2020-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology provides the set of basic government-level entities and jurisdictions for independent countries identified as part of South America in the U.N. M49 classification.",
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
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "South American Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."},
   :skos/scopeNote
   "The initial version of this ontology reflects the highest national level only.",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/"})