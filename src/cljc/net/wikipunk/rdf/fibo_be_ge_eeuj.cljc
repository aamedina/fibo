(ns net.wikipunk.rdf.fibo-be-ge-eeuj
  "This ontology provides government entities and jurisdictions for countries that are defined as being part of Eastern Europe in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective."
  {:cmns-av/copyright ["Copyright (c) 2010-2023 Object Management Group, Inc."
                       "Copyright (c) 2010-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for countries that are defined as being part of Eastern Europe in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/GovernmentEntities/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-ge-eeuj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
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
   :rdfa/prefix "fibo-be-ge-eeuj",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Eastern Europe Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   ["The http://www.omg.org/spec/EDMC-FIBO/BE/20200801/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to address hygiene issues with diacritical marks that are language-specific."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The http://www.omg.org/spec/EDMC-FIBO/BE/20210201/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to replace a dead link."],
   :skos/scopeNote
   "The initial version of this ontology reflects the national level only."})

(def BelarusianEntity
  "sovereign state and polity that is Belarus"
  {:db/ident :fibo-be-ge-eeuj/BelarusianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Belarus,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-eeuj/GovernmentOfTheRepublicOfBelarus,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Белорусское предприятие@ru"
                #voc/lstr "Беларускае ўтварэнне@be"
                #voc/lstr "Belarusian entity@en"],
   :skos/definition "sovereign state and polity that is Belarus"})

(def BulgarianEntity
  "sovereign state and polity that is Bulgaria"
  {:db/ident :fibo-be-ge-eeuj/BulgarianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Bulgaria,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-eeuj/GovernmentOfTheRepublicOfBulgaria,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Българско образувание@bg"
                #voc/lstr "Bulgarian entity@en"],
   :skos/definition "sovereign state and polity that is Bulgaria"})

(def CzechEntity
  "sovereign state and polity that is Czechia"
  {:db/ident :fibo-be-ge-eeuj/CzechEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Czechia,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-eeuj/GovernmentOfTheCzechRepublic,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Český subjekt@cs" #voc/lstr "Czech entity@en"],
   :skos/definition "sovereign state and polity that is Czechia"})

(def GovernmentOfHungary
  "unitary, dominant-party, parliamentary republic, bordering Slovakia to the north, Ukraine to the northeast, Romania to the east and southeast, Serbia to the south, Croatia and Slovenia to the southwest, and Austria to the west"
  {:db/ident :fibo-be-ge-eeuj/GovernmentOfHungary,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-eeuj/JurisdictionOfHungary,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Hungary,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Magyarország kormánya@hu"
                #voc/lstr "Government of Hungary@en"],
   :rdfs/seeAlso ["https://www.kormany.hu/en/"],
   :skos/definition
   "unitary, dominant-party, parliamentary republic, bordering Slovakia to the north, Ukraine to the northeast, Romania to the east and southeast, Serbia to the south, Croatia and Slovenia to the southwest, and Austria to the west"})

(def GovernmentOfRomania
  "unitary, semi-presidential republic at the crossroads of Central, Eastern, and Southeastern Europe, bordering Bulgaria to the south, Ukraine to the north, Hungary to the west, Serbia to the southwest, and Moldova to the east"
  {:db/ident :fibo-be-ge-eeuj/GovernmentOfRomania,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-eeuj/JurisdictionOfRomania,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Romania,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Guvernul României@ro"
                #voc/lstr "Government of Romania@en"],
   :rdfs/seeAlso ["https://www.gov.ro/en/"],
   :skos/definition
   "unitary, semi-presidential republic at the crossroads of Central, Eastern, and Southeastern Europe, bordering Bulgaria to the south, Ukraine to the north, Hungary to the west, Serbia to the southwest, and Moldova to the east"})

(def GovernmentOfTheCzechRepublic
  "unitary, parliamentary, constitutional republic and multi-party, representative democracy, with the president as head of state and prime minister as head of government, that is a landlocked country in Central Europe bordered by Austria to the south, Germany to the west, Poland to the northeast and Slovakia to the southeast"
  {:db/ident :fibo-be-ge-eeuj/GovernmentOfTheCzechRepublic,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-eeuj/JurisdictionOfCzechia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Czechia,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Vláda České republiky@cs"
                #voc/lstr "Government of the Czech Republic@en"],
   :rdfs/seeAlso ["https://www.vlada.cz/en/"],
   :skos/definition
   "unitary, parliamentary, constitutional republic and multi-party, representative democracy, with the president as head of state and prime minister as head of government, that is a landlocked country in Central Europe bordered by Austria to the south, Germany to the west, Poland to the northeast and Slovakia to the southeast"})

(def GovernmentOfTheRepublicOfBelarus
  "unitary presidential republic, a landlocked country in Eastern Europe bordered by Russia to the northeast, Ukraine to the south, Poland to the west, and Lithuania and Latvia to the northwest"
  {:db/ident :fibo-be-ge-eeuj/GovernmentOfTheRepublicOfBelarus,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-eeuj/JurisdictionOfBelarus,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Belarus,
   :rdf/type [:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Урад Рэспублікі Беларусь@be"
                #voc/lstr "Government of the Republic of Belarus@en"
                #voc/lstr "Правительство Республики Беларусь@ru"],
   :rdfs/seeAlso ["https://www.bundeskanzleramt.gv.at/en.html"],
   :skos/definition
   "unitary presidential republic, a landlocked country in Eastern Europe bordered by Russia to the northeast, Ukraine to the south, Poland to the west, and Lithuania and Latvia to the northwest"})

(def GovernmentOfTheRepublicOfBulgaria
  "unitary parliamentary democracy where the prime minister is the head of government, located in Southeastern Europe bordered by Romania to the north, Serbia and North Macedonia to the west, Greece and Turkey to the south, and the Black Sea to the east"
  {:db/ident :fibo-be-ge-eeuj/GovernmentOfTheRepublicOfBulgaria,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-eeuj/JurisdictionOfBulgaria,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Bulgaria,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Правителство на Република България@bg"
                #voc/lstr "Government of the Republic of Bulgaria@en"],
   :rdfs/seeAlso ["https://gov.bg/"],
   :skos/definition
   "unitary parliamentary democracy where the prime minister is the head of government, located in Southeastern Europe bordered by Romania to the north, Serbia and North Macedonia to the west, Greece and Turkey to the south, and the Black Sea to the east"})

(def GovernmentOfTheRepublicOfMoldova
  "unitary parliamentary constitutional republic that is a landlocked country in Eastern Europe, bordered by Romania to the west and Ukraine to the north, east, and south"
  {:db/ident :fibo-be-ge-eeuj/GovernmentOfTheRepublicOfMoldova,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-eeuj/JurisdictionOfMoldova,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Moldova,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Guvernul Republicii Moldova@ro"
                #voc/lstr "Government of the Republic of Moldova@en"],
   :rdfs/seeAlso ["https://gov.md/en/"],
   :skos/definition
   "unitary parliamentary constitutional republic that is a landlocked country in Eastern Europe, bordered by Romania to the west and Ukraine to the north, east, and south"})

(def GovernmentOfTheRepublicOfPoland
  "unitary, semi-presidential, constitutional, and representative democratic republic located in Central Europe and bordered by the Baltic Sea, Lithuania, and Russia's Kaliningrad Oblast to the north, Belarus and Ukraine to the east, Slovakia and the Czech Republic to the south, and Germany to the west"
  {:db/ident :fibo-be-ge-eeuj/GovernmentOfTheRepublicOfPoland,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-eeuj/JurisdictionOfPoland,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Poland,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Rząd Rzeczpospolita Polska@pl"
                #voc/lstr "Government of the Republic of Poland@en"],
   :rdfs/seeAlso ["https://www.gov.pl/"],
   :skos/definition
   "unitary, semi-presidential, constitutional, and representative democratic republic located in Central Europe and bordered by the Baltic Sea, Lithuania, and Russia's Kaliningrad Oblast to the north, Belarus and Ukraine to the east, Slovakia and the Czech Republic to the south, and Germany to the west"})

(def GovernmentOfTheRussianFederation
  "federal, dominant-party and semi-presidential constitutional republic located in Eastern Europe and Northern Asia"
  {:db/ident :fibo-be-ge-eeuj/GovernmentOfTheRussianFederation,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-eeuj/JurisdictionOfRussianFederation,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/RussianFederation,
   :rdf/type [:fibo-be-ge-ge/FederalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Правительство Российской Федерации@ru"
                #voc/lstr "Government of the Russian Federation@en"],
   :rdfs/seeAlso ["http://government.ru/en/"],
   :skos/definition
   "federal, dominant-party and semi-presidential constitutional republic located in Eastern Europe and Northern Asia"})

(def GovernmentOfTheSlovakRepublic
  "unitary, parliamentary democratic republic that is a landlocked country in Central Europe, bordered by Poland to the north, Ukraine to the east, Hungary to the south, Austria to the southwest, and Czech Republic to the northwest"
  {:db/ident :fibo-be-ge-eeuj/GovernmentOfTheSlovakRepublic,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-eeuj/JurisdictionOfSlovakia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Slovakia,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Vláda Slovenskej republiky@sk"
                #voc/lstr "Government of the Slovak Republic@en"],
   :rdfs/seeAlso
   ["https://www.vlada.gov.sk/government-of-the-slovak-republic/"],
   :skos/definition
   "unitary, parliamentary democratic republic that is a landlocked country in Central Europe, bordered by Poland to the north, Ukraine to the east, Hungary to the south, Austria to the southwest, and Czech Republic to the northwest"})

(def GovernmentOfUkraine
  "unitary, mixed semi-parliamentary and semi-presidential, constitutional republic located in Eastern Europe, bordered by Russia to the north-east; Belarus to the north; Poland, Slovakia and Hungary to the west; and Romania, Moldova, and the Black Sea to the south"
  {:db/ident :fibo-be-ge-eeuj/GovernmentOfUkraine,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-eeuj/JurisdictionOfUkraine,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Ukraine,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Уряд України@uk"
                #voc/lstr "Government of Ukraine@en"],
   :rdfs/seeAlso ["https://www.president.gov.ua/en/"],
   :skos/definition
   "unitary, mixed semi-parliamentary and semi-presidential, constitutional republic located in Eastern Europe, bordered by Russia to the north-east; Belarus to the north; Poland, Slovakia and Hungary to the west; and Romania, Moldova, and the Black Sea to the south"})

(def HungarianEntity
  "sovereign state and polity that is Hungary"
  {:db/ident :fibo-be-ge-eeuj/HungarianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Hungary,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-eeuj/GovernmentOfHungary,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Magyar entitás@hu" #voc/lstr "Hungarian entity@en"],
   :skos/definition "sovereign state and polity that is Hungary"})

(def JurisdictionOfBelarus
  "jurisdiction of the judiciary of Belarus, consisting of the Supreme Court and specialized courts such as the Constitutional Court, which deals with specific issues related to constitutional and business law"
  {:db/ident :fibo-be-ge-eeuj/JurisdictionOfBelarus,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-eeuj/GovernmentOfTheRepublicOfBelarus,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Belarus,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "юрысдыкцыя Беларусі@be"
                #voc/lstr "юрисдикция Беларуси@en"
                #voc/lstr "jurisdiction of Belarus@en"],
   :skos/definition
   "jurisdiction of the judiciary of Belarus, consisting of the Supreme Court and specialized courts such as the Constitutional Court, which deals with specific issues related to constitutional and business law"})

(def JurisdictionOfBulgaria
  "jurisdiction of the judiciary of Bulgaria, a civil law legal system under the Ministry of Justice, including the Supreme Administrative Court and the Supreme Court of Cassation, which are the highest courts of appeal and oversee the application of laws in subordinate courts"
  {:db/ident :fibo-be-ge-eeuj/JurisdictionOfBulgaria,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-eeuj/GovernmentOfTheRepublicOfBulgaria,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Bulgaria,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "юрисдикция на България@bg"
                #voc/lstr "jurisdiction of Bulgaria@en"],
   :skos/definition
   "jurisdiction of the judiciary of Bulgaria, a civil law legal system under the Ministry of Justice, including the Supreme Administrative Court and the Supreme Court of Cassation, which are the highest courts of appeal and oversee the application of laws in subordinate courts"})

(def JurisdictionOfCzechia
  "jurisdiction of the judiciary of the Czech Republic, a civil law system grounded in the Constitution of the Czech Republic, including the Constitutional Court, Supreme Court, and Supreme Administrative Court, as well as district and county courts that are divided into civil, criminal, and administrative branches"
  {:db/ident :fibo-be-ge-eeuj/JurisdictionOfCzechia,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-eeuj/GovernmentOfTheCzechRepublic,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Czechia,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "jurisdikce česka@cs"
                #voc/lstr "jurisdiction of Czechia@en"],
   :skos/definition
   "jurisdiction of the judiciary of the Czech Republic, a civil law system grounded in the Constitution of the Czech Republic, including the Constitutional Court, Supreme Court, and Supreme Administrative Court, as well as district and county courts that are divided into civil, criminal, and administrative branches"})

(def JurisdictionOfHungary
  "jurisdiction of the judiciary of Hungary, a civil law system based primarily on German that is divided between courts with regular civil and criminal jurisdiction and administrative courts, including local courts, regional appellate courts, and the supreme court"
  {:db/ident :fibo-be-ge-eeuj/JurisdictionOfHungary,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-eeuj/GovernmentOfHungary,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Hungary,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "jurisdiction of Hungary@en"
                #voc/lstr "Magyarország joghatósága@hu"],
   :skos/definition
   "jurisdiction of the judiciary of Hungary, a civil law system based primarily on German that is divided between courts with regular civil and criminal jurisdiction and administrative courts, including local courts, regional appellate courts, and the supreme court"})

(def JurisdictionOfMoldova
  "jurisdiction of the judiciary of Moldova, which is the system of courts that interprets and applies the law in Moldova, including an independent Constitutional Court"
  {:db/ident :fibo-be-ge-eeuj/JurisdictionOfMoldova,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-eeuj/GovernmentOfTheRepublicOfMoldova,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Moldova,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "jurisdicția Moldovei@ro"
                #voc/lstr "jurisdiction of Moldova@en"],
   :skos/definition
   "jurisdiction of the judiciary of Moldova, which is the system of courts that interprets and applies the law in Moldova, including an independent Constitutional Court"})

(def JurisdictionOfPoland
  "jurisdiction of the judiciary of Poland, a four-tier court system composed of the Supreme Court, the Supreme Administrative Court, Common Courts (District, Regional, Appellate) and the Military Court"
  {:db/ident :fibo-be-ge-eeuj/JurisdictionOfPoland,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-eeuj/GovernmentOfTheRepublicOfPoland,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Poland,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "jurysdykcja Polski@pl"
                #voc/lstr "jurisdiction of Poland@en"],
   :skos/definition
   "jurisdiction of the judiciary of Poland, a four-tier court system composed of the Supreme Court, the Supreme Administrative Court, Common Courts (District, Regional, Appellate) and the Military Court"})

(def JurisdictionOfRomania
  "jurisdiction of the judiciary of Romania, a civil law system influenced by the French system that is a hierarchical system of courts with the High Court of Cassation and Justice being the supreme court of Romania, and includes courts of appeal, county courts and local courts"
  {:db/ident :fibo-be-ge-eeuj/JurisdictionOfRomania,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-eeuj/GovernmentOfRomania,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Romania,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "jurisdicția României@ro"
                #voc/lstr "jurisdiction of Romania@en"],
   :skos/definition
   "jurisdiction of the judiciary of Romania, a civil law system influenced by the French system that is a hierarchical system of courts with the High Court of Cassation and Justice being the supreme court of Romania, and includes courts of appeal, county courts and local courts"})

(def JurisdictionOfRussianFederation
  "jurisdiction of the judiciary of Russian Federation, which is the system of courts that interprets and applies the law in the Russian Federation, including Constitutional Court, Supreme Court and lower federal courts, whose judges are appointed by the Federation Council on the recommendation of the President"
  {:db/ident :fibo-be-ge-eeuj/JurisdictionOfRussianFederation,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-eeuj/GovernmentOfTheRussianFederation,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/RussianFederation,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "юрисдикция Российской Федерации@ru"
                #voc/lstr "jurisdiction of Russian Federation@en"],
   :skos/definition
   "jurisdiction of the judiciary of Russian Federation, which is the system of courts that interprets and applies the law in the Russian Federation, including Constitutional Court, Supreme Court and lower federal courts, whose judges are appointed by the Federation Council on the recommendation of the President"})

(def JurisdictionOfSlovakia
  "jurisdiction of the judiciary of the Slovak Republic, which is the system of courts that interprets and applies the law in Slovakia, whose highest judicial body is the Constitutional Court of Slovakia, which rules on constitutional issues"
  {:db/ident :fibo-be-ge-eeuj/JurisdictionOfSlovakia,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-eeuj/GovernmentOfTheSlovakRepublic,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Slovakia,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "jurisdikcia Slovenska@sk"
                #voc/lstr "jurisdiction of Slovakia@en"],
   :skos/definition
   "jurisdiction of the judiciary of the Slovak Republic, which is the system of courts that interprets and applies the law in Slovakia, whose highest judicial body is the Constitutional Court of Slovakia, which rules on constitutional issues"})

(def JurisdictionOfUkraine
  "jurisdiction of the judiciary of Ukraine, which is the system of courts that interprets and applies the law in Ukraine, including the Supreme Court of Ukraine, which is the highest judicial body in the system of courts of general jurisdiction in Ukraine"
  {:db/ident :fibo-be-ge-eeuj/JurisdictionOfUkraine,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-eeuj/GovernmentOfUkraine,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Ukraine,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "юрисдикція України@uk"
                #voc/lstr "jurisdiction of Ukraine@en"],
   :skos/definition
   "jurisdiction of the judiciary of Ukraine, which is the system of courts that interprets and applies the law in Ukraine, including the Supreme Court of Ukraine, which is the highest judicial body in the system of courts of general jurisdiction in Ukraine"})

(def MoldovanEntity
  "sovereign state and polity that is Moldova"
  {:db/ident :fibo-be-ge-eeuj/MoldovanEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Moldova,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-eeuj/GovernmentOfTheRepublicOfMoldova,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Moldovan entity@en"
                #voc/lstr "Entitate moldovenească@ro"],
   :skos/definition "sovereign state and polity that is Moldova"})

(def PolishEntity
  "sovereign state and polity that is Poland"
  {:db/ident :fibo-be-ge-eeuj/PolishEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Poland,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-eeuj/GovernmentOfTheRepublicOfPoland,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Polish entity@en" #voc/lstr "Podmiot polski@pl"],
   :skos/definition "sovereign state and polity that is Poland"})

(def RomanianEntity
  "sovereign state and polity that is Romania"
  {:db/ident :fibo-be-ge-eeuj/RomanianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Romania,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-eeuj/GovernmentOfRomania,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Romanian entity@en"
                #voc/lstr "Entitate românească@ro"],
   :skos/definition "sovereign state and polity that is Romania"})

(def RussianEntity
  "federated sovereignty and polity that is the Russian Federation"
  {:db/ident :fibo-be-ge-eeuj/RussianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/RussianFederation,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-eeuj/GovernmentOfTheRussianFederation,
   :rdf/type [:fibo-be-ge-ge/FederatedSovereignty :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Российское предприятие@ru"
                #voc/lstr "Russian entity@en"],
   :skos/definition
   "federated sovereignty and polity that is the Russian Federation"})

(def SlovakEntity
  "sovereign state and polity that is Slovakia"
  {:db/ident :fibo-be-ge-eeuj/SlovakEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Slovakia,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-eeuj/GovernmentOfTheSlovakRepublic,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Slovenský subjekt@sk" #voc/lstr "Slovak entity@en"],
   :skos/definition "sovereign state and polity that is Slovakia"})

(def UkranianEntity
  "sovereign state and polity that is Ukraine"
  {:db/ident :fibo-be-ge-eeuj/UkranianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Ukraine,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-eeuj/GovernmentOfUkraine,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Українське утворення@uk"
                #voc/lstr "Ukrainian entity@en"],
   :skos/definition "sovereign state and polity that is Ukraine"})