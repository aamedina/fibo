(ns net.wikipunk.rdf.fibo-be-ge-eeuj
  {:cmns-av/copyright
   #{"Copyright (c) 2010-2023 EDM Council, Inc."
     "Copyright (c) 2010-2023 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for countries that are defined as being part of Eastern Europe in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
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
   :owl/imports
   #{{:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-ge-eeuj",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Eastern Europe Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   #{"The http://www.omg.org/spec/EDMC-FIBO/BE/20210201/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to replace a dead link."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The http://www.omg.org/spec/EDMC-FIBO/BE/20200801/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to address hygiene issues with diacritical marks that are language-specific."},
   :skos/scopeNote
   "The initial version of this ontology reflects the national level only.",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"})

(def BelarusianEntity
  {:db/ident :fibo-be-ge-eeuj/BelarusianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Belarus,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-eeuj/GovernmentOfTheRepublicOfBelarus,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Belarusian entity"}
                 {:rdf/language "be",
                  :rdf/value    "Беларускае ўтварэнне"}
                 {:rdf/language "ru",
                  :rdf/value    "Белорусское предприятие"}},
   :skos/definition "sovereign state and polity that is Belarus"})

(def BulgarianEntity
  {:db/ident :fibo-be-ge-eeuj/BulgarianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Bulgaria,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-eeuj/GovernmentOfTheRepublicOfBulgaria,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "bg",
                  :rdf/value    "Българско образувание"}
                 {:rdf/language "en",
                  :rdf/value    "Bulgarian entity"}},
   :skos/definition "sovereign state and polity that is Bulgaria"})

(def CzechEntity
  {:db/ident :fibo-be-ge-eeuj/CzechEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Czechia,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-eeuj/GovernmentOfTheCzechRepublic,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "cs",
                  :rdf/value    "Český subjekt"}
                 {:rdf/language "en",
                  :rdf/value    "Czech entity"}},
   :skos/definition "sovereign state and polity that is Czechia"})

(def GovernmentOfHungary
  {:db/ident :fibo-be-ge-eeuj/GovernmentOfHungary,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-eeuj/JurisdictionOfHungary,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Hungary,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of Hungary"}
                 {:rdf/language "hu",
                  :rdf/value    "Magyarország kormánya"}},
   :rdfs/seeAlso {:xsd/anyURI "https://www.kormany.hu/en/"},
   :skos/definition
   "unitary, dominant-party, parliamentary republic, bordering Slovakia to the north, Ukraine to the northeast, Romania to the east and southeast, Serbia to the south, Croatia and Slovenia to the southwest, and Austria to the west"})

(def GovernmentOfRomania
  {:db/ident :fibo-be-ge-eeuj/GovernmentOfRomania,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-eeuj/JurisdictionOfRomania,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Romania,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "ro",
                  :rdf/value    "Guvernul României"}
                 {:rdf/language "en",
                  :rdf/value    "Government of Romania"}},
   :rdfs/seeAlso {:xsd/anyURI "https://www.gov.ro/en/"},
   :skos/definition
   "unitary, semi-presidential republic at the crossroads of Central, Eastern, and Southeastern Europe, bordering Bulgaria to the south, Ukraine to the north, Hungary to the west, Serbia to the southwest, and Moldova to the east"})

(def GovernmentOfTheCzechRepublic
  {:db/ident :fibo-be-ge-eeuj/GovernmentOfTheCzechRepublic,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-eeuj/JurisdictionOfCzechia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Czechia,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Czech Republic"}
                 {:rdf/language "cs",
                  :rdf/value    "Vláda České republiky"}},
   :rdfs/seeAlso {:xsd/anyURI "https://www.vlada.cz/en/"},
   :skos/definition
   "unitary, parliamentary, constitutional republic and multi-party, representative democracy, with the president as head of state and prime minister as head of government, that is a landlocked country in Central Europe bordered by Austria to the south, Germany to the west, Poland to the northeast and Slovakia to the southeast"})

(def GovernmentOfTheRepublicOfBelarus
  {:db/ident :fibo-be-ge-eeuj/GovernmentOfTheRepublicOfBelarus,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-eeuj/JurisdictionOfBelarus,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Belarus,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "ru",
                  :rdf/value    "Правительство Республики Беларусь"}
                 {:rdf/language "be",
                  :rdf/value    "Урад Рэспублікі Беларусь"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Republic of Belarus"}},
   :rdfs/seeAlso {:xsd/anyURI "https://www.bundeskanzleramt.gv.at/en.html"},
   :skos/definition
   "unitary presidential republic, a landlocked country in Eastern Europe bordered by Russia to the northeast, Ukraine to the south, Poland to the west, and Lithuania and Latvia to the northwest"})

(def GovernmentOfTheRepublicOfBulgaria
  {:db/ident :fibo-be-ge-eeuj/GovernmentOfTheRepublicOfBulgaria,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-eeuj/JurisdictionOfBulgaria,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Bulgaria,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "bg",
                  :rdf/value    "Правителство на Република България"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Republic of Bulgaria"}},
   :rdfs/seeAlso {:xsd/anyURI "https://gov.bg/"},
   :skos/definition
   "unitary parliamentary democracy where the prime minister is the head of government, located in Southeastern Europe bordered by Romania to the north, Serbia and North Macedonia to the west, Greece and Turkey to the south, and the Black Sea to the east"})

(def GovernmentOfTheRepublicOfMoldova
  {:db/ident :fibo-be-ge-eeuj/GovernmentOfTheRepublicOfMoldova,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-eeuj/JurisdictionOfMoldova,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Moldova,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Republic of Moldova"}
                 {:rdf/language "ro",
                  :rdf/value    "Guvernul Republicii Moldova"}},
   :rdfs/seeAlso {:xsd/anyURI "https://gov.md/en/"},
   :skos/definition
   "unitary parliamentary constitutional republic that is a landlocked country in Eastern Europe, bordered by Romania to the west and Ukraine to the north, east, and south"})

(def GovernmentOfTheRepublicOfPoland
  {:db/ident :fibo-be-ge-eeuj/GovernmentOfTheRepublicOfPoland,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-eeuj/JurisdictionOfPoland,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Poland,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Republic of Poland"}
                 {:rdf/language "pl",
                  :rdf/value    "Rząd Rzeczpospolita Polska"}},
   :rdfs/seeAlso {:xsd/anyURI "https://www.gov.pl/"},
   :skos/definition
   "unitary, semi-presidential, constitutional, and representative democratic republic located in Central Europe and bordered by the Baltic Sea, Lithuania, and Russia's Kaliningrad Oblast to the north, Belarus and Ukraine to the east, Slovakia and the Czech Republic to the south, and Germany to the west"})

(def GovernmentOfTheRussianFederation
  {:db/ident :fibo-be-ge-eeuj/GovernmentOfTheRussianFederation,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-eeuj/JurisdictionOfRussianFederation,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/RussianFederation,
   :rdf/type #{:fibo-be-ge-ge/FederalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "ru",
                  :rdf/value    "Правительство Российской Федерации"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Russian Federation"}},
   :rdfs/seeAlso {:xsd/anyURI "http://government.ru/en/"},
   :skos/definition
   "federal, dominant-party and semi-presidential constitutional republic located in Eastern Europe and Northern Asia"})

(def GovernmentOfTheSlovakRepublic
  {:db/ident :fibo-be-ge-eeuj/GovernmentOfTheSlovakRepublic,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-eeuj/JurisdictionOfSlovakia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Slovakia,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Slovak Republic"}
                 {:rdf/language "sk",
                  :rdf/value    "Vláda Slovenskej republiky"}},
   :rdfs/seeAlso
   {:xsd/anyURI "https://www.vlada.gov.sk/government-of-the-slovak-republic/"},
   :skos/definition
   "unitary, parliamentary democratic republic that is a landlocked country in Central Europe, bordered by Poland to the north, Ukraine to the east, Hungary to the south, Austria to the southwest, and Czech Republic to the northwest"})

(def GovernmentOfUkraine
  {:db/ident :fibo-be-ge-eeuj/GovernmentOfUkraine,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-eeuj/JurisdictionOfUkraine,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Ukraine,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "uk",
                  :rdf/value    "Уряд України"}
                 {:rdf/language "en",
                  :rdf/value    "Government of Ukraine"}},
   :rdfs/seeAlso {:xsd/anyURI "https://www.president.gov.ua/en/"},
   :skos/definition
   "unitary, mixed semi-parliamentary and semi-presidential, constitutional republic located in Eastern Europe, bordered by Russia to the north-east; Belarus to the north; Poland, Slovakia and Hungary to the west; and Romania, Moldova, and the Black Sea to the south"})

(def HungarianEntity
  {:db/ident :fibo-be-ge-eeuj/HungarianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Hungary,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-eeuj/GovernmentOfHungary,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "hu",
                  :rdf/value    "Magyar entitás"}
                 {:rdf/language "en",
                  :rdf/value    "Hungarian entity"}},
   :skos/definition "sovereign state and polity that is Hungary"})

(def JurisdictionOfBelarus
  {:db/ident :fibo-be-ge-eeuj/JurisdictionOfBelarus,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-eeuj/GovernmentOfTheRepublicOfBelarus,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Belarus,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "юрисдикция Беларуси"}
                 {:rdf/language "en",
                  :rdf/value    "jurisdiction of Belarus"}
                 {:rdf/language "be",
                  :rdf/value    "юрысдыкцыя Беларусі"}},
   :skos/definition
   "jurisdiction of the judiciary of Belarus, consisting of the Supreme Court and specialized courts such as the Constitutional Court, which deals with specific issues related to constitutional and business law"})

(def JurisdictionOfBulgaria
  {:db/ident :fibo-be-ge-eeuj/JurisdictionOfBulgaria,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-eeuj/GovernmentOfTheRepublicOfBulgaria,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Bulgaria,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "bg",
                  :rdf/value    "юрисдикция на България"}
                 {:rdf/language "en",
                  :rdf/value    "jurisdiction of Bulgaria"}},
   :skos/definition
   "jurisdiction of the judiciary of Bulgaria, a civil law legal system under the Ministry of Justice, including the Supreme Administrative Court and the Supreme Court of Cassation, which are the highest courts of appeal and oversee the application of laws in subordinate courts"})

(def JurisdictionOfCzechia
  {:db/ident :fibo-be-ge-eeuj/JurisdictionOfCzechia,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-eeuj/GovernmentOfTheCzechRepublic,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Czechia,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "jurisdiction of Czechia"}
                 {:rdf/language "cs",
                  :rdf/value    "jurisdikce česka"}},
   :skos/definition
   "jurisdiction of the judiciary of the Czech Republic, a civil law system grounded in the Constitution of the Czech Republic, including the Constitutional Court, Supreme Court, and Supreme Administrative Court, as well as district and county courts that are divided into civil, criminal, and administrative branches"})

(def JurisdictionOfHungary
  {:db/ident :fibo-be-ge-eeuj/JurisdictionOfHungary,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-eeuj/GovernmentOfHungary,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Hungary,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "hu",
                  :rdf/value    "Magyarország joghatósága"}
                 {:rdf/language "en",
                  :rdf/value    "jurisdiction of Hungary"}},
   :skos/definition
   "jurisdiction of the judiciary of Hungary, a civil law system based primarily on German that is divided between courts with regular civil and criminal jurisdiction and administrative courts, including local courts, regional appellate courts, and the supreme court"})

(def JurisdictionOfMoldova
  {:db/ident :fibo-be-ge-eeuj/JurisdictionOfMoldova,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-eeuj/GovernmentOfTheRepublicOfMoldova,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Moldova,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "jurisdiction of Moldova"}
                 {:rdf/language "ro",
                  :rdf/value    "jurisdicția Moldovei"}},
   :skos/definition
   "jurisdiction of the judiciary of Moldova, which is the system of courts that interprets and applies the law in Moldova, including an independent Constitutional Court"})

(def JurisdictionOfPoland
  {:db/ident :fibo-be-ge-eeuj/JurisdictionOfPoland,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-eeuj/GovernmentOfTheRepublicOfPoland,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Poland,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "pl",
                  :rdf/value    "jurysdykcja Polski"}
                 {:rdf/language "en",
                  :rdf/value    "jurisdiction of Poland"}},
   :skos/definition
   "jurisdiction of the judiciary of Poland, a four-tier court system composed of the Supreme Court, the Supreme Administrative Court, Common Courts (District, Regional, Appellate) and the Military Court"})

(def JurisdictionOfRomania
  {:db/ident :fibo-be-ge-eeuj/JurisdictionOfRomania,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-eeuj/GovernmentOfRomania,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Romania,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "jurisdiction of Romania"}
                 {:rdf/language "ro",
                  :rdf/value    "jurisdicția României"}},
   :skos/definition
   "jurisdiction of the judiciary of Romania, a civil law system influenced by the French system that is a hierarchical system of courts with the High Court of Cassation and Justice being the supreme court of Romania, and includes courts of appeal, county courts and local courts"})

(def JurisdictionOfRussianFederation
  {:db/ident :fibo-be-ge-eeuj/JurisdictionOfRussianFederation,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-eeuj/GovernmentOfTheRussianFederation,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/RussianFederation,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "jurisdiction of Russian Federation"}
                 {:rdf/language "ru",
                  :rdf/value    "юрисдикция Российской Федерации"}},
   :skos/definition
   "jurisdiction of the judiciary of Russian Federation, which is the system of courts that interprets and applies the law in the Russian Federation, including Constitutional Court, Supreme Court and lower federal courts, whose judges are appointed by the Federation Council on the recommendation of the President"})

(def JurisdictionOfSlovakia
  {:db/ident :fibo-be-ge-eeuj/JurisdictionOfSlovakia,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-eeuj/GovernmentOfTheSlovakRepublic,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Slovakia,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "jurisdiction of Slovakia"}
                 {:rdf/language "sk",
                  :rdf/value    "jurisdikcia Slovenska"}},
   :skos/definition
   "jurisdiction of the judiciary of the Slovak Republic, which is the system of courts that interprets and applies the law in Slovakia, whose highest judicial body is the Constitutional Court of Slovakia, which rules on constitutional issues"})

(def JurisdictionOfUkraine
  {:db/ident :fibo-be-ge-eeuj/JurisdictionOfUkraine,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-eeuj/GovernmentOfUkraine,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Ukraine,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "uk",
                  :rdf/value    "юрисдикція України"}
                 {:rdf/language "en",
                  :rdf/value    "jurisdiction of Ukraine"}},
   :skos/definition
   "jurisdiction of the judiciary of Ukraine, which is the system of courts that interprets and applies the law in Ukraine, including the Supreme Court of Ukraine, which is the highest judicial body in the system of courts of general jurisdiction in Ukraine"})

(def MoldovanEntity
  {:db/ident :fibo-be-ge-eeuj/MoldovanEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Moldova,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-eeuj/GovernmentOfTheRepublicOfMoldova,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Moldovan entity"}
                 {:rdf/language "ro",
                  :rdf/value    "Entitate moldovenească"}},
   :skos/definition "sovereign state and polity that is Moldova"})

(def PolishEntity
  {:db/ident :fibo-be-ge-eeuj/PolishEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Poland,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-eeuj/GovernmentOfTheRepublicOfPoland,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Polish entity"}
                 {:rdf/language "pl",
                  :rdf/value    "Podmiot polski"}},
   :skos/definition "sovereign state and polity that is Poland"})

(def RomanianEntity
  {:db/ident :fibo-be-ge-eeuj/RomanianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Romania,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-eeuj/GovernmentOfRomania,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "ro",
                  :rdf/value    "Entitate românească"}
                 {:rdf/language "en",
                  :rdf/value    "Romanian entity"}},
   :skos/definition "sovereign state and polity that is Romania"})

(def RussianEntity
  {:db/ident :fibo-be-ge-eeuj/RussianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/RussianFederation,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-eeuj/GovernmentOfTheRussianFederation,
   :rdf/type #{:fibo-be-ge-ge/FederatedSovereignty :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "ru",
                  :rdf/value    "Российское предприятие"}
                 {:rdf/language "en",
                  :rdf/value    "Russian entity"}},
   :skos/definition
   "federated sovereignty and polity that is the Russian Federation"})

(def SlovakEntity
  {:db/ident :fibo-be-ge-eeuj/SlovakEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Slovakia,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-eeuj/GovernmentOfTheSlovakRepublic,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "sk",
                  :rdf/value    "Slovenský subjekt"}
                 {:rdf/language "en",
                  :rdf/value    "Slovak entity"}},
   :skos/definition "sovereign state and polity that is Slovakia"})

(def UkranianEntity
  {:db/ident :fibo-be-ge-eeuj/UkranianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Ukraine,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-eeuj/GovernmentOfUkraine,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "uk",
                  :rdf/value    "Українське утворення"}
                 {:rdf/language "en",
                  :rdf/value    "Ukrainian entity"}},
   :skos/definition "sovereign state and polity that is Ukraine"})

(def urn:uuid:f6720ec3-c92f-52aa-9dc9-ca51e7db0dfe
  {:cmns-av/copyright
   #{"Copyright (c) 2010-2023 EDM Council, Inc."
     "Copyright (c) 2010-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for countries that are defined as being part of Eastern Europe in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Eastern Europe Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   #{"The http://www.omg.org/spec/EDMC-FIBO/BE/20210201/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to replace a dead link."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The http://www.omg.org/spec/EDMC-FIBO/BE/20200801/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to address hygiene issues with diacritical marks that are language-specific."},
   :skos/scopeNote
   "The initial version of this ontology reflects the national level only.",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"})