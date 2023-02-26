(ns net.wikipunk.rdf.fibo-be-ge-easj
  "This ontology provides government entities and jurisdictions for countries that are defined as being part of Eastern Asia in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective."
  {:cmns-av/copyright ["Copyright (c) 2020-2023 EDM Council, Inc."
                       "Copyright (c) 2020-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for countries that are defined as being part of Eastern Asia in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/GovernmentEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-ge-easj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-ge-easj",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Eastern Asia Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to address text formatting hygiene issues."],
   :skos/scopeNote
   "The initial version of this ontology reflects the national level only."})

(def GovernmentOfJapan
  "unitary parliamentary constitutional monarchy with a bicameral legislature in Eastern Asia, bordered on the west by the Sea of Japan, and extending from the Sea of Okhotsk in the north toward the East China Sea and Taiwan in the south"
  {:db/ident :fibo-be-ge-easj/GovernmentOfJapan,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-easj/JurisdictionOfJapan,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Japan,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "ja",
                 :rdf/value    "日本国"}
                {:rdf/language "en",
                 :rdf/value    "Government of Japan"}],
   :skos/definition
   "unitary parliamentary constitutional monarchy with a bicameral legislature in Eastern Asia, bordered on the west by the Sea of Japan, and extending from the Sea of Okhotsk in the north toward the East China Sea and Taiwan in the south"})

(def GovernmentOfMongolia
  "unitary semi-presidential representative democratic republic and landlocked country in Eastern Asia, situated between Russia to the north and China to the south, where it neighbours the Inner Mongolia Autonomous Region"
  {:db/ident :fibo-be-ge-easj/GovernmentOfMongolia,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-easj/JurisdictionOfMongolia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Mongolia,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "mn",
                 :rdf/value    "Монгол Улс"}
                {:rdf/language "en",
                 :rdf/value    "Government of Mongolia"}],
   :skos/definition
   "unitary semi-presidential representative democratic republic and landlocked country in Eastern Asia, situated between Russia to the north and China to the south, where it neighbours the Inner Mongolia Autonomous Region"})

(def GovernmentOfTheDemocraticPeoplesRepublicOfKorea
  "unitary one-party republic under a totalitarian dictatorship in Eastern Asia, constituting the northern part of the Korean Peninsula, bordered to the north by China and by Russia along the Amnok (known as the Yalu in Chinese) and Tumen rivers, and to the south by South Korea, with the heavily fortified Korean Demilitarized Zone (DMZ) separating the two"
  {:db/ident :fibo-be-ge-easj/GovernmentOfTheDemocraticPeoplesRepublicOfKorea,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-easj/JurisdictionOfTheDemocraticPeoplesRepublicOfKorea,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/KoreaDemocraticPeoplesRepublicOf,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "ko",
                 :rdf/value    "조선민주주의인민공화국"}
                {:rdf/language "en",
                 :rdf/value
                 "Government of the Democratic People's Republic of Korea"}],
   :skos/definition
   "unitary one-party republic under a totalitarian dictatorship in Eastern Asia, constituting the northern part of the Korean Peninsula, bordered to the north by China and by Russia along the Amnok (known as the Yalu in Chinese) and Tumen rivers, and to the south by South Korea, with the heavily fortified Korean Demilitarized Zone (DMZ) separating the two"})

(def
  GovernmentOfTheHongKongSpecialAdministrativeRegionOfThePeoplesRepublicOfChina
  "devolved executive-led system within a socialist republic that is a metropolitan area and special administrative region of the People's Republic of China on the eastern Pearl River Delta of the South China Sea"
  {:db/ident
   :fibo-be-ge-easj/GovernmentOfTheHongKongSpecialAdministrativeRegionOfThePeoplesRepublicOfChina,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-easj/JurisdictionOfHongKong,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/HongKong,
   :rdf/type [:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label
   [{:rdf/language "zh",
     :rdf/value    "中華人民共和國香港特別行政區"}
    {:rdf/language "en",
     :rdf/value
     "Government of the Hong Kong Special Administrative Region of the People's Republic of China"}],
   :skos/definition
   "devolved executive-led system within a socialist republic that is a metropolitan area and special administrative region of the People's Republic of China on the eastern Pearl River Delta of the South China Sea"})

(def GovernmentOfTheMacaoSpecialAdministrativeRegionOfThePeoplesRepublicOfChina
  "devolved executive-led system within a socialist republic that is a metropolitan area and special administrative region of the People's Republic of China in the western Pearl River Delta by the South China Sea"
  {:db/ident
   :fibo-be-ge-easj/GovernmentOfTheMacaoSpecialAdministrativeRegionOfThePeoplesRepublicOfChina,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-easj/JurisdictionOfMacao,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Macao,
   :rdf/type [:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label
   [{:rdf/language "zh",
     :rdf/value    "中華人民共和國澳門特別行政區"}
    {:rdf/language "en",
     :rdf/value
     "Government of the Macao Special Administrative Region of the People's Republic of China"}],
   :skos/definition
   "devolved executive-led system within a socialist republic that is a metropolitan area and special administrative region of the People's Republic of China in the western Pearl River Delta by the South China Sea"})

(def GovernmentOfThePeoplesRepublicOfChina
  "unitary Marxist-Leninist single-party socialist republic in Eastern Asia, covering approximately 9.6 million square kilometers (3.7 million square miles), that is the world's third or fourth-largest country by area"
  {:db/ident :fibo-be-ge-easj/GovernmentOfThePeoplesRepublicOfChina,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-easj/JurisdictionOfChina,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/China,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "zh",
                 :rdf/value    "中华人民共和国"}
                {:rdf/language "en",
                 :rdf/value    "Government of the People's Republic of China"}],
   :skos/definition
   "unitary Marxist-Leninist single-party socialist republic in Eastern Asia, covering approximately 9.6 million square kilometers (3.7 million square miles), that is the world's third or fourth-largest country by area"})

(def GovernmentOfTheRepublicOfChina
  "unitary semi-presidential constitutional republic whose neighbors include the People's Republic of China (PRC) to the northwest, Japan to the northeast, and the Philippines to the south"
  {:db/ident :fibo-be-ge-easj/GovernmentOfTheRepublicOfChina,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-easj/JurisdictionOfTheRepublicOfChina,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Taiwan,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "zh",
                 :rdf/value    "中華民國"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Republic of China"}],
   :skos/definition
   "unitary semi-presidential constitutional republic whose neighbors include the People's Republic of China (PRC) to the northwest, Japan to the northeast, and the Philippines to the south"})

(def GovernmentOfTheRepublicOfKorea
  "unitary presidential constitutional republic in Eastern Asia, constituting the southern part of the Korean Peninsula, and sharing a land border with North Korea"
  {:db/ident :fibo-be-ge-easj/GovernmentOfTheRepublicOfKorea,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-easj/JurisdictionOfTheRepublicOfKorea,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/KoreaRepublicOf,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "ko",
                 :rdf/value    "대한민국"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Republic of Korea"}],
   :skos/definition
   "unitary presidential constitutional republic in Eastern Asia, constituting the southern part of the Korean Peninsula, and sharing a land border with North Korea"})

(def JurisdictionOfChina
  "jurisdiction of the judiciary of China, which is the system of courts that interprets and applies the law in China"
  {:db/ident :fibo-be-ge-easj/JurisdictionOfChina,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-easj/GovernmentOfThePeoplesRepublicOfChina,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/China,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of China",
   :skos/definition
   "jurisdiction of the judiciary of China, which is the system of courts that interprets and applies the law in China"})

(def JurisdictionOfHongKong
  "jurisdiction of the judiciary of Hong Kong, which is the system of courts that interprets and applies the law in Hong Kong"
  {:db/ident :fibo-be-ge-easj/JurisdictionOfHongKong,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-easj/GovernmentOfTheHongKongSpecialAdministrativeRegionOfThePeoplesRepublicOfChina,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/HongKong,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of Hong Kong",
   :skos/definition
   "jurisdiction of the judiciary of Hong Kong, which is the system of courts that interprets and applies the law in Hong Kong"})

(def JurisdictionOfJapan
  "jurisdiction of the judiciary of Japan, which is the system of courts, divided into four basic tiers including the Supreme Court and three levels of lower courts, that interprets and applies the law in Japan"
  {:db/ident :fibo-be-ge-easj/JurisdictionOfJapan,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-easj/GovernmentOfJapan,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Japan,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of Japan",
   :skos/definition
   "jurisdiction of the judiciary of Japan, which is the system of courts, divided into four basic tiers including the Supreme Court and three levels of lower courts, that interprets and applies the law in Japan"})

(def JurisdictionOfMacao
  "jurisdiction of the judiciary of Macao, which is the system of courts that interprets and applies the law in Macao"
  {:db/ident :fibo-be-ge-easj/JurisdictionOfMacao,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-easj/GovernmentOfTheMacaoSpecialAdministrativeRegionOfThePeoplesRepublicOfChina,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Macao,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of Macao",
   :skos/definition
   "jurisdiction of the judiciary of Macao, which is the system of courts that interprets and applies the law in Macao"})

(def JurisdictionOfMongolia
  "jurisdiction of the judiciary of Mongolia, which is the system of courts that interpret and apply the law in Mongolia"
  {:db/ident :fibo-be-ge-easj/JurisdictionOfMongolia,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-easj/GovernmentOfMongolia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Mongolia,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of Mongolia",
   :skos/definition
   "jurisdiction of the judiciary of Mongolia, which is the system of courts that interpret and apply the law in Mongolia"})

(def JurisdictionOfTheDemocraticPeoplesRepublicOfKorea
  "jurisdiction of the judiciary of the Democratic People's Republic of Korea, which is the system of courts that interpret and apply the law in North Korea"
  {:db/ident :fibo-be-ge-easj/JurisdictionOfTheDemocraticPeoplesRepublicOfKorea,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-easj/GovernmentOfTheDemocraticPeoplesRepublicOfKorea,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/KoreaDemocraticPeoplesRepublicOf,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the Democratic People's Republic of Korea",
   :skos/definition
   "jurisdiction of the judiciary of the Democratic People's Republic of Korea, which is the system of courts that interpret and apply the law in North Korea"})

(def JurisdictionOfTheRepublicOfChina
  "jurisdiction of the judiciary of the Republic of China, which is the system of courts, including the Judicial Yuan, Supreme Court, Council of Grand Justices, and lower courts, that interpret and apply the law in Taiwan"
  {:db/ident :fibo-be-ge-easj/JurisdictionOfTheRepublicOfChina,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-easj/GovernmentOfTheRepublicOfChina,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Taiwan,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the Republic of China",
   :skos/definition
   "jurisdiction of the judiciary of the Republic of China, which is the system of courts, including the Judicial Yuan, Supreme Court, Council of Grand Justices, and lower courts, that interpret and apply the law in Taiwan"})

(def JurisdictionOfTheRepublicOfKorea
  "jurisdiction of the judiciary of the Republic of Korea, which is the system of courts, including the Supreme Court, Constitutional Court, and lower courts, that interpret and apply the law in South Korea"
  {:db/ident :fibo-be-ge-easj/JurisdictionOfTheRepublicOfKorea,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-easj/GovernmentOfTheRepublicOfKorea,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/KoreaRepublicOf,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the Republic of Korea",
   :skos/definition
   "jurisdiction of the judiciary of the Republic of Korea, which is the system of courts, including the Supreme Court, Constitutional Court, and lower courts, that interpret and apply the law in South Korea"})

(def RegionalStateOfHongKong
  "regional sovereignty and polity that is Hong Kong"
  {:db/ident :fibo-be-ge-easj/RegionalStateOfHongKong,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-1/HongKong,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-easj/GovernmentOfTheHongKongSpecialAdministrativeRegionOfThePeoplesRepublicOfChina,
   :rdf/type [:fibo-be-ge-ge/RegionalSovereignty :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "regional state of Hong Kong",
   :skos/definition "regional sovereignty and polity that is Hong Kong"})

(def RegionalStateOfMacao
  "regional sovereignty and polity that is Macao"
  {:db/ident :fibo-be-ge-easj/RegionalStateOfMacao,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-1/Macao,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-easj/GovernmentOfTheMacaoSpecialAdministrativeRegionOfThePeoplesRepublicOfChina,
   :rdf/type [:fibo-be-ge-ge/RegionalSovereignty :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "regional state of Macao",
   :skos/definition "regional sovereignty and polity that is Macao"})

(def StateOfChina
  "sovereign state and polity that is China"
  {:db/ident :fibo-be-ge-easj/StateOfChina,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/China,
   :fibo-be-ge-ge/hasSharedSovereigntyOver [:lcc-3166-1/Macao
                                            :lcc-3166-1/HongKong],
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-easj/GovernmentOfThePeoplesRepublicOfChina,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of China",
   :skos/definition "sovereign state and polity that is China"})

(def StateOfJapan
  "sovereign state and polity that is Japan"
  {:db/ident :fibo-be-ge-easj/StateOfJapan,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Japan,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-easj/GovernmentOfJapan,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of Japan",
   :skos/definition "sovereign state and polity that is Japan"})

(def StateOfMongolia
  "sovereign state and polity that is Mongolia"
  {:db/ident :fibo-be-ge-easj/StateOfMongolia,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Mongolia,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-easj/GovernmentOfMongolia,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of Mongolia",
   :skos/definition "sovereign state and polity that is Mongolia"})

(def StateOfNorthKorea
  "sovereign state and polity that is North Korea"
  {:db/ident :fibo-be-ge-easj/StateOfNorthKorea,
   :fibo-be-ge-ge/hasFullSovereigntyOver
   :lcc-3166-1/KoreaDemocraticPeoplesRepublicOf,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-easj/GovernmentOfTheDemocraticPeoplesRepublicOfKorea,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of North Korea",
   :skos/definition "sovereign state and polity that is North Korea"})

(def StateOfSouthKorea
  "sovereign state and polity that is South Korea"
  {:db/ident :fibo-be-ge-easj/StateOfSouthKorea,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/KoreaRepublicOf,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-easj/GovernmentOfTheRepublicOfKorea,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of South Korea",
   :skos/definition "sovereign state and polity that is South Korea"})

(def StateOfTaiwan
  "regional sovereignty and polity that is Taiwan"
  {:db/ident :fibo-be-ge-easj/StateOfTaiwan,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-1/Taiwan,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-easj/GovernmentOfTheRepublicOfChina,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "regional state of Taiwan",
   :skos/definition "regional sovereignty and polity that is Taiwan"})