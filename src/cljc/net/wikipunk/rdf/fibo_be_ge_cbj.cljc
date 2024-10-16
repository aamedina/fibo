(ns net.wikipunk.rdf.fibo-be-ge-cbj
  {:cmns-av/copyright #{"Copyright (c) 2020-2023 Object Management Group, Inc."
                        "Copyright (c) 2020-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/",
   :dcterms/abstract
   "This ontology provides the set of basic government-level entities and jurisdictions for independent countries and British Commonwealth regional sovereignties identified as part of the Caribbean in the U.N. M49 classification.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-ge-cbj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/",
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
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-ge-cbj",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Caribbean Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The http://www.omg.org/spec/EDMC-FIBO/BE/20210201/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to correct spelling issues."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The http://www.omg.org/spec/EDMC-FIBO/BE/20200701/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to correct the ontology prefix and address language-specific diacritical marks."},
   :skos/scopeNote
   "The initial version of this ontology reflects the highest national or regional level (for British Commonwealth members) only.",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"})

(def AntiguaAndBarbudaEntity
  {:db/ident :fibo-be-ge-cbj/AntiguaAndBarbudaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-1/AntiguaAndBarbuda,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-cbj/GovernmentOfAntiguaAndBarbuda,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Antigua and Barbuda entity",
   :skos/definition
   "sovereign state and polity that consists of two major islands, Antigua and Barbuda (separated by 39 miles), and a number of smaller islands in the middle of the Leeward Islands, that is part of the Lesser Antilles"})

(def BahamianEntity
  {:db/ident :fibo-be-ge-cbj/BahamianEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-1/Bahamas,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-cbj/GovernmentOfTheCommonwealthOfTheBahamas,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Bahamian entity",
   :skos/definition "sovereign state and polity that is The Bahamas"})

(def BarbadianEntity
  {:db/ident :fibo-be-ge-cbj/BarbadianEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-1/Barbados,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-cbj/GovernmentOfBarbados,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Barbadian entity",
   :skos/definition "sovereign state and polity that is Barbados"})

(def BermudanEntity
  {:db/ident :fibo-be-ge-cbj/BermudanEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-1/Bermuda,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-cbj/GovernmentOfBermuda,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Bermudan entity",
   :skos/definition "regional sovereignty and polity that is Bermuda"})

(def CaymanIslandsEntity
  {:db/ident :fibo-be-ge-cbj/CaymanIslandsEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-1/CaymanIslands,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-cbj/GovernmentOfTheCaymanIslands,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Cayman Islands entity",
   :skos/definition
   "regional sovereignty and polity that is the Cayman Islands"})

(def CubanEntity
  {:db/ident :fibo-be-ge-cbj/CubanEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Cuba,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-cbj/GovernmentOfTheRepublicOfCuba,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Cuban entity",
   :skos/definition "sovereign state and polity that is Cuba"})

(def DominicaEntity
  {:db/ident :fibo-be-ge-cbj/DominicaEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Dominica,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-cbj/GovernmentOfTheCommonwealthOfDominica,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Dominica entity",
   :skos/definition "soverign state and polity that is Dominica"})

(def DominicanRepublicEntity
  {:db/ident :fibo-be-ge-cbj/DominicanRepublicEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/DominicanRepublic,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-cbj/GovernmentOfTheDominicanRepublic,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Dominican Republic entity",
   :skos/definition "soverign state and polity that is the Dominican Republic"})

(def GovernmentOfAntiguaAndBarbuda
  {:db/ident :fibo-be-ge-cbj/GovernmentOfAntiguaAndBarbuda,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-cbj/JurisdictionOfAntiguaAndBarbuda,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/AntiguaAndBarbuda,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Government of Antigua and Barbuda"},
   :skos/definition
   "unitary parliamentary constitutional monarchy, with the queen (Elizabeth II) as head of state represented locally by a governor-general"})

(def GovernmentOfBarbados
  {:db/ident :fibo-be-ge-cbj/GovernmentOfBarbados,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-cbj/JurisdictionOfBarbados,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Barbados,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Government of Barbados"},
   :skos/definition
   "unitary parliamentary constitutional monarchy, modeled on the British Westminster system, with the Queen of Barbados (Elizabeth II) as head of state, represented locally by a governor-general"})

(def GovernmentOfBermuda
  {:db/ident :fibo-be-ge-cbj/GovernmentOfBermuda,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-cbj/JurisdictionOfBermuda,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Bermuda,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Government of Bermuda"},
   :rdfs/seeAlso {:xsd/anyURI "https://www.gov.bm/"},
   :skos/definition
   "parliamentary representative democratic dependency and a British island territory in the North Atlantic Ocean"})

(def GovernmentOfGrenada
  {:db/ident :fibo-be-ge-cbj/GovernmentOfGrenada,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-cbj/JurisdictionOfGrenada,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Grenada,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Government of Grenada"},
   :skos/definition
   "unitary two-party parliamentary constitutional monarchy that is a Commonwealth realm with Queen Elizabeth II as head of state, represented locally by a governor-general, located in the West Indies in the Caribbean Sea at the southern end of the Grenadines island chain"})

(def GovernmentOfJamaica
  {:db/ident :fibo-be-ge-cbj/GovernmentOfJamaica,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-cbj/JurisdictionOfJamaica,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Jamaica,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Government of Jamaica"},
   :skos/definition
   "parliamentary constitutional monarchy with legislative power vested in the bicameral Parliament of Jamaica, consisting of an appointed Senate and a directly elected House of Representatives, and an independent member of the British Commonwealth, situated in the Caribbean Sea"})

(def GovernmentOfSaintLucia
  {:db/ident :fibo-be-ge-cbj/GovernmentOfSaintLucia,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-cbj/JurisdictionOfSaintLucia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/SaintLucia,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Government of Saint Lucia"},
   :skos/definition
   "unitary parliamentary constitutional monarchy that is a Commonwealth realm with Queen Elizabeth II as head of state, represented locally by a governor-general, located in the West Indies in the eastern Caribbean Sea on the boundary with the Atlantic Ocean"})

(def GovernmentOfSaintVincentAndTheGrenadines
  {:db/ident :fibo-be-ge-cbj/GovernmentOfSaintVincentAndTheGrenadines,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-cbj/JurisdictionOfSaintVincentAndTheGrenadines,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/SaintVincentAndTheGrenadines,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Government of Saint Vincent and the Grenadines"},
   :skos/definition
   "unitary parliamentary constitutional monarchy, with the Queen of Saint Vincent and the Grenadines (Elizabeth II) as head of state represented locally by a governor-general, an Anglo-Caribbean country of several islands in the Lesser Antilles island arc, in the southeast Windward Islands, which lies in the West Indies at the southern end of the eastern border of the Caribbean Sea where the latter meets the Atlantic Ocean"})

(def GovernmentOfTheCaymanIslands
  {:db/ident :fibo-be-ge-cbj/GovernmentOfTheCaymanIslands,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-cbj/JurisdictionOfTheCaymanIslands,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/CaymanIslands,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Government of the Cayman Islands"},
   :rdfs/seeAlso {:xsd/anyURI "http://www.gov.ky/"},
   :skos/definition
   "parliamentary democracy with judicial, executive and legislative branches, and a British Overseas Territory, encompassing 3 islands in the western Caribbean Sea"})

(def GovernmentOfTheCommonwealthOfDominica
  {:db/ident :fibo-be-ge-cbj/GovernmentOfTheCommonwealthOfDominica,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-cbj/JurisdictionOfDominica,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Dominica,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Government of the Commonwealth of Dominica"},
   :skos/definition
   "unitary parliamentary democracy that is an independent republic and member of the Commonwealth of Nations, one of few republics in the Caribbean"})

(def GovernmentOfTheCommonwealthOfTheBahamas
  {:db/ident :fibo-be-ge-cbj/GovernmentOfTheCommonwealthOfTheBahamas,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-cbj/JurisdictionOfTheCommonwealthOfTheBahamas,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Bahamas,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Government of the Commonwealth of the Bahamas"},
   :skos/definition
   "parliamentary constitutional monarchy, with the queen of the Bahamas (Elizabeth II) as head of state represented locally by a governor-general"})

(def GovernmentOfTheDominicanRepublic
  {:db/ident :fibo-be-ge-cbj/GovernmentOfTheDominicanRepublic,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-cbj/JurisdictionOfTheDominicanRepublic,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/DominicanRepublic,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Government of the the Dominican Republic"},
   :skos/definition
   "unitary presidential republic that occupies the eastern five-eighths of the island of Hispaniola in the Greater Antilles archipelago, which it shares with Haiti"})

(def GovernmentOfTheFederationOfSaintChristopherAndNevis
  {:db/ident
   :fibo-be-ge-cbj/GovernmentOfTheFederationOfSaintChristopherAndNevis,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-cbj/JurisdictionOfTheFederationOfSaintChristopherAndNevis,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/SaintKittsAndNevis,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "Government of the Federation of Saint Christopher and Nevis"},
   :skos/definition
   "federal parliamentary constitutional monarchy that is a Commonwealth realm with the Queen of Saint Christopher and Nevis (Queen Elizabeth II) as head of state, represented locally by a governor-general, located in the Leeward Islands chain of the Lesser Antilles"})

(def GovernmentOfTheRepublicOfCuba
  {:db/ident :fibo-be-ge-cbj/GovernmentOfTheRepublicOfCuba,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-cbj/JurisdictionOfCuba,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Cuba,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Republic of Cuba"}
                 {:rdf/language "es",
                  :rdf/value    "Gobierno de la República de Cuba"}},
   :rdfs/seeAlso {:xsd/anyURI "https://www.presidencia.gob.cu/en/government/"},
   :skos/definition
   "unitary Marxist-Leninist, one party socialist republic that includes the island of Cuba as well as Isla de la Juventud and several minor archipelagos"})

(def GovernmentOfTheRepublicOfHaiti
  {:db/ident :fibo-be-ge-cbj/GovernmentOfTheRepublicOfHaiti,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-cbj/JurisdictionOfHaiti,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Haiti,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "Gouvernement de la République d'Haïti"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Republic of Haiti"}},
   :skos/definition
   "unitary semi-presidential republic located on the island of Hispaniola in the Greater Antilles archipelago"})

(def GovernmentOfTheRepublicOfTrinidadAndTobago
  {:db/ident :fibo-be-ge-cbj/GovernmentOfTheRepublicOfTrinidadAndTobago,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-cbj/JurisdictionOfTheRepublicOfTrinidadAndTobago,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/TrinidadAndTobago,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value "Government of the Republic of Trinidad and Tobago"},
   :skos/definition
   "unitary parliamentary constitutional republic with a two-party system and a bicameral parliamentary system based on the Westminster System, that is the southernmost island country in the Caribbean"})

(def GrenadianEntity
  {:db/ident :fibo-be-ge-cbj/GrenadianEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-1/Grenada,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-cbj/GovernmentOfGrenada,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Grenadian entity",
   :skos/definition "soverign state and polity that is Grenada"})

(def HaitianEntity
  {:db/ident :fibo-be-ge-cbj/HaitianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Haiti,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-cbj/GovernmentOfTheRepublicOfHaiti,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Haitian entity",
   :skos/definition "soverign state and polity that is Haiti"})

(def JamaicanEntity
  {:db/ident :fibo-be-ge-cbj/JamaicanEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-1/Jamaica,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-cbj/GovernmentOfJamaica,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Jamaican entity",
   :skos/definition "soverign state and polity that is Jamaica"})

(def JurisdictionOfAntiguaAndBarbuda
  {:db/ident :fibo-be-ge-cbj/JurisdictionOfAntiguaAndBarbuda,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-cbj/GovernmentOfAntiguaAndBarbuda,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/AntiguaAndBarbuda,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Antigua and Barbuda",
   :skos/definition
   "jurisdiction of the Eastern Caribbean Supreme Court (based in Saint Lucia; one judge of the Supreme Court is a resident of the islands and presides over the High Court of Justice, including the Judicial Committee of the Privy Council (JCPC), which is the highest court of appeal for certain British territories, some Commonwealth countries and a few UK bodies"})

(def JurisdictionOfBarbados
  {:db/ident :fibo-be-ge-cbj/JurisdictionOfBarbados,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-cbj/GovernmentOfBarbados,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Barbados,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Barbados",
   :skos/definition
   "jurisdiction of the judiciary of Barbados, an independent branch of the Barbadian government, subject only to the Barbadian Constitution, including the Magistrates' Court, Supreme Court, and Caribbean Court of Justice"})

(def JurisdictionOfBermuda
  {:db/ident :fibo-be-ge-cbj/JurisdictionOfBermuda,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-cbj/GovernmentOfBermuda,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Bermuda,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Bermuda",
   :skos/definition
   "jurisdiction of the judiciary of Bermuda, including the Magistrates' Court, Supreme Court, Court of Appeal, and Judicial Committee of the Privy Council (JCPC), which is the highest court of appeal for certain British territories, some Commonwealth countries and a few UK bodies"})

(def JurisdictionOfCuba
  {:db/ident :fibo-be-ge-cbj/JurisdictionOfCuba,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-cbj/GovernmentOfTheRepublicOfCuba,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Cuba,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "jurisdicción de la República de Cuba"}
                 {:rdf/language "en",
                  :rdf/value    "jurisdiction of Cuba"}},
   :skos/definition
   "jurisdiction of the judiciary of the Republic of Cuba, including the system of courts that interprets and applies the law in Cuba"})

(def JurisdictionOfDominica
  {:db/ident :fibo-be-ge-cbj/JurisdictionOfDominica,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-cbj/GovernmentOfTheCommonwealthOfDominica,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Dominica,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Dominica",
   :skos/definition
   "jurisdiction of the judiciary of the Commonwealth of Dominica, which is a member of the International Criminal Court, with a Bilateral Immunity Agreement of protection with the US military, as covered under Article 98"})

(def JurisdictionOfGrenada
  {:db/ident :fibo-be-ge-cbj/JurisdictionOfGrenada,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-cbj/GovernmentOfGrenada,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Grenada,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Grenada",
   :skos/definition
   "jurisdiction of the judiciary of Grenada, which is part of the Eastern Caribbean States Supreme Court with an associate judge residing in Grenada"})

(def JurisdictionOfHaiti
  {:db/ident :fibo-be-ge-cbj/JurisdictionOfHaiti,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-cbj/GovernmentOfTheRepublicOfHaiti,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Haiti,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "juridiction de la République d'Haïti"}
                 {:rdf/language "en",
                  :rdf/value    "jurisdiction of Haiti"}},
   :skos/definition
   "jurisdiction of the judiciary of Haiti, whose highest court is the Cour de Cassation, assisted by local and civil courts at a communal level"})

(def JurisdictionOfJamaica
  {:db/ident :fibo-be-ge-cbj/JurisdictionOfJamaica,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-cbj/GovernmentOfJamaica,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Jamaica,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Jamaica",
   :skos/definition
   "the jurisdiction of the judiciary of Jamaica, a system based on English common law and local statutes, including the Judicial Committee of the Privy Council (JCPC), which is the highest court of appeal for certain British territories, some Commonwealth countries and a few UK bodies"})

(def JurisdictionOfSaintLucia
  {:db/ident :fibo-be-ge-cbj/JurisdictionOfSaintLucia,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-cbj/GovernmentOfSaintLucia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/SaintLucia,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the Saint Lucia",
   :skos/definition
   "jurisdiction of the judiciary of Saint Lucia, a mixed judicial system based on on both the civil law and English common law"})

(def JurisdictionOfSaintVincentAndTheGrenadines
  {:db/ident :fibo-be-ge-cbj/JurisdictionOfSaintVincentAndTheGrenadines,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-cbj/GovernmentOfSaintVincentAndTheGrenadines,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/SaintVincentAndTheGrenadines,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label
   "jurisdiction of the Federation of Saint Vincent and the Grenadines",
   :skos/definition
   "jurisdiction of the judiciary of Saint Vincent and the Grenadines, which is divided into district courts, the Eastern Caribbean Supreme Court and the Privy Council in London being the court of last resort"})

(def JurisdictionOfTheCaymanIslands
  {:db/ident :fibo-be-ge-cbj/JurisdictionOfTheCaymanIslands,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-cbj/GovernmentOfTheCaymanIslands,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/CaymanIslands,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the Cayman Islands",
   :skos/definition
   "jurisdiction of the judiciary of the Cayman Islands, a four-tiered judicial system is based on English common law, colonial and local statutes, including the Judicial Committee of the Privy Council (JCPC), which is the highest court of appeal for certain British territories, some Commonwealth countries and a few UK bodies"})

(def JurisdictionOfTheCommonwealthOfTheBahamas
  {:db/ident :fibo-be-ge-cbj/JurisdictionOfTheCommonwealthOfTheBahamas,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-cbj/GovernmentOfTheCommonwealthOfTheBahamas,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Bahamas,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the Commonwealth of the Bahamas",
   :skos/definition
   "jurisdiction of the judiciary of the Bahamas, a judicial system based on English common law and local statutes, including the Judicial Committee of the Privy Council (JCPC), which is the highest court of appeal for certain British territories, some Commonwealth countries and a few UK bodies, and which considered a safe jurisdiction as an International Financial Center (IFC), with a legal framework that is in compliance with the standards set by Organization for Economic Cooperation and Development (OECD)"})

(def JurisdictionOfTheDominicanRepublic
  {:db/ident :fibo-be-ge-cbj/JurisdictionOfTheDominicanRepublic,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-cbj/GovernmentOfTheDominicanRepublic,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/DominicanRepublic,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the Dominican Republic",
   :skos/definition
   "jurisdiction of the judiciary of the Dominican Republic, whose highest court is the Supreme Court of Justice, composed of 16 judges appointed by the National Council of Magistrates, an entity created by the constitutional reform of 1994 to ensure the independence of the Judicial Branch"})

(def JurisdictionOfTheFederationOfSaintChristopherAndNevis
  {:db/ident
   :fibo-be-ge-cbj/JurisdictionOfTheFederationOfSaintChristopherAndNevis,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-cbj/GovernmentOfTheFederationOfSaintChristopherAndNevis,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/SaintKittsAndNevis,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the Federation of Saint Christopher and Nevis",
   :skos/definition
   "jurisdiction of the judiciary of Saint Kitts and Nevis, a mixed judicial system based on on both the civil law and English common law"})

(def JurisdictionOfTheRepublicOfTrinidadAndTobago
  {:db/ident :fibo-be-ge-cbj/JurisdictionOfTheRepublicOfTrinidadAndTobago,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-cbj/GovernmentOfTheRepublicOfTrinidadAndTobago,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/TrinidadAndTobago,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the Republic of Trinidad and Tobago",
   :skos/definition
   "jurisdiction of the judiciary of Trinidad and Tobago, a hierarchical system comprising a Supreme Court of Judicature, a Magistracy and a Family Court, with final appeal on some matters decided by the Judicial Committee of the Privy Council (JCPC)"})

(def SaintKittsAndNevisEntity
  {:db/ident :fibo-be-ge-cbj/SaintKittsAndNevisEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-1/SaintKittsAndNevis,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-cbj/GovernmentOfTheFederationOfSaintChristopherAndNevis,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Saint Kitts and Nevis entity",
   :skos/definition
   "soverign state and polity that is the Federation of Saint Christopher and Nevis"})

(def SaintLucianEntity
  {:db/ident :fibo-be-ge-cbj/SaintLucianEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-1/SaintLucia,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-cbj/GovernmentOfSaintLucia,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Saint Lucian entity",
   :skos/definition "soverign state and polity that is Saint Lucia"})

(def SaintVincentianEntity
  {:db/ident :fibo-be-ge-cbj/SaintVincentianEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver
   :lcc-3166-1/SaintVincentAndTheGrenadines,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-cbj/GovernmentOfSaintVincentAndTheGrenadines,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Saint Vincentian entity",
   :skos/definition
   "soverign state and polity that is Saint Vincent and the Grenadines (or simply Saint Vincent)"})

(def TrinidadianAndTobagonianEntity
  {:db/ident :fibo-be-ge-cbj/TrinidadianAndTobagonianEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-1/TrinidadAndTobago,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-cbj/GovernmentOfTheRepublicOfTrinidadAndTobago,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Trinidadian and Tobagonian entity",
   :skos/definition
   "soverign state and polity that is the Republic of Trinidad and Tobago"})

(def urn:uuid:d7af5d48-7429-560c-8a9c-ad3948c9c70b
  {:cmns-av/copyright #{"Copyright (c) 2020-2023 Object Management Group, Inc."
                        "Copyright (c) 2020-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology provides the set of basic government-level entities and jurisdictions for independent countries and British Commonwealth regional sovereignties identified as part of the Caribbean in the U.N. M49 classification.",
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
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Caribbean Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The http://www.omg.org/spec/EDMC-FIBO/BE/20210201/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to correct spelling issues."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The http://www.omg.org/spec/EDMC-FIBO/BE/20200701/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to correct the ontology prefix and address language-specific diacritical marks."},
   :skos/scopeNote
   "The initial version of this ontology reflects the highest national or regional level (for British Commonwealth members) only.",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/"})