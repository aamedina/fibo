(ns net.wikipunk.rdf.fibo-be-ge-neuj
  "This ontology provides government entities and jurisdictions for countries that are defined as being part of Northern Europe in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective."
  {:cmns-av/copyright ["Copyright (c) 2010-2023 EDM Council, Inc."
                       "Copyright (c) 2010-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for countries that are defined as being part of Northern Europe in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/GovernmentEntities/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-ge-ge"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/",
    "fibo-be-ge-neuj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
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
   :rdfa/prefix "fibo-be-ge-neuj",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Northern Europe Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The http://www.omg.org/spec/EDMC-FIBO/BE/20200801/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to address hygiene issues with diacritical marks that are language-specific."],
   :skos/scopeNote
   "The initial version of this ontology reflects the national level only."})

(def AlandIslandsJurisdiction
  "jurisdiction of the Aland District Court, which deals with criminal cases, civil cases and petitionary matters in first instance, with escalation to the appellate level in Finland as needed"
  {:cmns-av/synonym #voc/lstr "Ålands tingsrätt@fi",
   :db/ident :fibo-be-ge-neuj/AlandIslandsJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-neuj/GovernmentOfAland,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/AlandIslands,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-law-jur/Jurisdiction],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Ålandöarnas jurisdiktion@sv"
                #voc/lstr "Aland Islands jurisdiction@en"
                #voc/lstr "Ahvenanmaan lainkäyttöalue@fi"],
   :rdfs/seeAlso ["https://www.lexadin.nl/wlg/courts/nofr/eur/lxctfin.htm/"],
   :skos/definition
   "jurisdiction of the Aland District Court, which deals with criminal cases, civil cases and petitionary matters in first instance, with escalation to the appellate level in Finland as needed"})

(def AlandicEntity
  "regional sovereignty and polity that is Aland"
  {:db/ident :fibo-be-ge-neuj/AlandicEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-1/AlandIslands,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-neuj/GovernmentOfAland,
   :rdf/type [:fibo-be-ge-ge/RegionalSovereignty :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Ålandisk enhet@sv"
                #voc/lstr "Alandic entity@en"
                #voc/lstr "Ahvenanmaan kokonaisuus@fi"],
   :skos/definition "regional sovereignty and polity that is Aland"})

(def DanishEntity
  "sovereign state and polity that is Denmark"
  {:db/ident :fibo-be-ge-neuj/DanishEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Denmark,
   :fibo-be-ge-ge/hasSharedSovereigntyOver [:lcc-3166-1/Greenland
                                            :lcc-3166-1/FaroeIslands],
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-neuj/GovernmentOfTheKingdomOfDenmark,
   :rdf/type [:owl/NamedIndividual :fibo-be-ge-ge/SovereignState],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Danish entity@en" #voc/lstr "Dansk enhed@da"],
   :skos/definition "sovereign state and polity that is Denmark"})

(def EstonianEntity
  "sovereign state and polity that is Estonia"
  {:db/ident :fibo-be-ge-neuj/EstonianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Estonia,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-neuj/GovernmentOfTheRepublicOfEstonia,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Estonian entity@en" #voc/lstr "Eesti üksus@et"],
   :skos/definition "sovereign state and polity that is Estonia"})

(def FinnishEntity
  "sovereign state and polity that is Finland"
  {:db/ident :fibo-be-ge-neuj/FinnishEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Finland,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-1/AlandIslands,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-neuj/GovernmentOfTheRepublicOfFinland,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Suomen entiteetti@fi" #voc/lstr "Finnish entity@en"],
   :skos/definition "sovereign state and polity that is Finland"})

(def GovernmentOfAland
  "regional government of the Aland Islands, an archipelago province at the entrance to the Gulf of Bothnia in the Baltic Sea belonging to Finland"
  {:cmns-av/explanatoryNote
   "The Aland Islands are governed according to the Act on the Autonomy of Aland and international treaties. These laws guarantee the islands' autonomy from Finland, which has ultimate sovereignty over them, as well as a demilitarised status. The Government of Aland answers to the Parliament of Aland, in accordance with the principles of parliamentarism.",
   :db/ident :fibo-be-ge-neuj/GovernmentOfAland,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-neuj/AlandIslandsJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/AlandIslands,
   :rdf/type [:owl/NamedIndividual :fibo-be-ge-ge/RegionalGovernment],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Ålands regering@sv"
                #voc/lstr "Ahvenanmaan hallitus@fi"
                #voc/lstr "Government of Aland@en"],
   :rdfs/seeAlso ["https://en.wikipedia.org/wiki/%C3%85land_Islands/"],
   :skos/definition
   "regional government of the Aland Islands, an archipelago province at the entrance to the Gulf of Bothnia in the Baltic Sea belonging to Finland"})

(def GovernmentOfIceland
  "unitary parliamentary republic and representative democracy, that is a Nordic island country in the North Atlantic"
  {:db/ident :fibo-be-ge-neuj/GovernmentOfIceland,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-neuj/JurisdictionOfIceland,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Iceland,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Ríkisstjórn Íslands@is"
                #voc/lstr "Government of Iceland@en"],
   :rdfs/seeAlso ["https://www.government.is/"],
   :skos/definition
   "unitary parliamentary republic and representative democracy, that is a Nordic island country in the North Atlantic"})

(def GovernmentOfTheKingdomOfDenmark
  "unitary constitutional monarchy and parliamentary democracy, with the monarch as the official head of government, that includes the southernmost of the Scandinavian countries, consisting of a peninsula, Jutland, and an archipelago of 443 named islands"
  {:cmns-av/synonym [#voc/lstr "Danish government@en"
                     #voc/lstr "Danmarks regering@da"],
   :db/ident :fibo-be-ge-neuj/GovernmentOfTheKingdomOfDenmark,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-neuj/JurisdictionOfDenmark,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Denmark,
   :rdf/type [:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Government of the Kingdom of Denmark@en"
                #voc/lstr "Kongeriget Danmarks regering@da"],
   :rdfs/seeAlso
   ["https://denmark.dk/society-and-business/government-and-politics/"],
   :skos/definition
   "unitary constitutional monarchy and parliamentary democracy, with the monarch as the official head of government, that includes the southernmost of the Scandinavian countries, consisting of a peninsula, Jutland, and an archipelago of 443 named islands"})

(def GovernmentOfTheKingdomOfNorway
  "unitary constitutional monarchy and parliamentary democracy, wherein the monarch is the head of state and the prime minister is the head of government, whose mainland comprises the western and northernmost portion of the Scandinavian Peninsula and includes the remote island of Jan Mayen as well as the archipelago of Svalbard"
  {:db/ident :fibo-be-ge-neuj/GovernmentOfTheKingdomOfNorway,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-neuj/JurisdictionOfNorway,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Norway,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Kongeriket Norges regjering@no"
                #voc/lstr "Government of the Kingdom of Norway@en"],
   :rdfs/seeAlso ["https://www.regjeringen.no/en/the-government/id443314/"],
   :skos/definition
   "unitary constitutional monarchy and parliamentary democracy, wherein the monarch is the head of state and the prime minister is the head of government, whose mainland comprises the western and northernmost portion of the Scandinavian Peninsula and includes the remote island of Jan Mayen as well as the archipelago of Svalbard"})

(def GovernmentOfTheKingdomOfSweden
  "constitutional monarchy and parliamentary democracy, with a largely ceremonial and representative monarch as head of state, located in Scandinavia between the North Atlantic, the Baltic Sea and Eurasian Russia"
  {:db/ident :fibo-be-ge-neuj/GovernmentOfTheKingdomOfSweden,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-neuj/JurisdictionOfSweden,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Sweden,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Konungariket Sveriges regering@sv"
                #voc/lstr "Government of the Kingdom of Sweden@en"],
   :rdfs/seeAlso ["https://www.government.se/government-of-sweden/"],
   :skos/definition
   "constitutional monarchy and parliamentary democracy, with a largely ceremonial and representative monarch as head of state, located in Scandinavia between the North Atlantic, the Baltic Sea and Eurasian Russia"})

(def GovernmentOfTheRepublicOfEstonia
  "democratic unitary parliamentary republic divided into fifteen counties, located on the eastern coast of the Baltic Sea in Northern Europe"
  {:db/ident :fibo-be-ge-neuj/GovernmentOfTheRepublicOfEstonia,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-neuj/JurisdictionOfEstonia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Estonia,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Government of the Republic of Estonia@en"
                #voc/lstr "Eesti Vabariigi valitsus@et"],
   :rdfs/seeAlso ["https://www.valitsus.ee/en/"],
   :skos/definition
   "democratic unitary parliamentary republic divided into fifteen counties, located on the eastern coast of the Baltic Sea in Northern Europe"})

(def GovernmentOfTheRepublicOfFinland
  "parliamentary republic within the framework of a representative democracy comprised of 19 regions and 310 municipalities, located in the Nordic region of Europe"
  {:db/ident :fibo-be-ge-neuj/GovernmentOfTheRepublicOfFinland,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-neuj/JurisdictionOfFinland,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Finland,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Suomen tasavallan hallitus@fi"
                #voc/lstr "Government of the Republic of Finland@en"],
   :rdfs/seeAlso ["https://valtioneuvosto.fi/en/government"],
   :skos/definition
   "parliamentary republic within the framework of a representative democracy comprised of 19 regions and 310 municipalities, located in the Nordic region of Europe"})

(def GovernmentOfTheRepublicOfIreland
  "parliamentary, representative democratic republic, based on the British model, that is an independent state and member of the European Union, which covers five-sixths of the island of Ireland in the North Atlantic"
  {:db/ident :fibo-be-ge-neuj/GovernmentOfTheRepublicOfIreland,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-neuj/JurisdictionOfIreland,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Ireland,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Rialtas Phoblacht na hÉireann@ga"
                #voc/lstr "Government of the Republic of Ireland@en"],
   :rdfs/seeAlso ["https://www.gov.ie/"],
   :skos/definition
   "parliamentary, representative democratic republic, based on the British model, that is an independent state and member of the European Union, which covers five-sixths of the island of Ireland in the North Atlantic"})

(def GovernmentOfTheRepublicOfLatvia
  "unitary, parliamentary, constitutional republic located in the Baltic region of Northern Europe"
  {:db/ident :fibo-be-ge-neuj/GovernmentOfTheRepublicOfLatvia,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-neuj/JurisdictionOfLatvia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Latvia,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Latvijas Republikas valdība@lv"
                #voc/lstr "Government of the Republic of Latvia@en"],
   :rdfs/seeAlso ["https://www.mk.gov.lv/en"],
   :skos/definition
   "unitary, parliamentary, constitutional republic located in the Baltic region of Northern Europe"})

(def GovernmentOfTheRepublicOfLithuania
  "unitary semi-presidential republic situated along the southeastern shore of the Baltic Sea, to the southeast of Sweden and Denmark"
  {:db/ident :fibo-be-ge-neuj/GovernmentOfTheRepublicOfLithuania,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-neuj/JurisdictionOfLithuania,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Lithuania,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Lietuvos Respublikos Vyriausybė@lt"
                #voc/lstr "Government of the Republic of Lithuania@en"],
   :rdfs/seeAlso ["https://lrv.lt/en/"],
   :skos/definition
   "unitary semi-presidential republic situated along the southeastern shore of the Baltic Sea, to the southeast of Sweden and Denmark"})

(def IcelandicEntity
  "sovereign state and polity that is Iceland"
  {:db/ident :fibo-be-ge-neuj/IcelandicEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Iceland,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-neuj/GovernmentOfIceland,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Íslensk eining@is" #voc/lstr "Icelandic entity@en"],
   :skos/definition "sovereign state and polity that is Iceland"})

(def IrishEntity
  "sovereign state and polity that is Ireland"
  {:db/ident :fibo-be-ge-neuj/IrishEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Ireland,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-neuj/GovernmentOfTheRepublicOfIreland,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Irish entity@en" #voc/lstr "Aonán Éireannach@ga"],
   :skos/definition "sovereign state and polity that is Ireland"})

(def JurisdictionOfDenmark
  "jurisdiction of the judiciary of Denmark, a civil law system with some references to Germanic law that was substantially reformed in 2007"
  {:db/ident :fibo-be-ge-neuj/JurisdictionOfDenmark,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-neuj/GovernmentOfTheKingdomOfDenmark,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Denmark,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "jurisdiction of Denmark@en"
                #voc/lstr "Danmarks jurisdiktion@da"],
   :rdfs/seeAlso ["https://en.wikipedia.org/wiki/Courts_of_Denmark/"],
   :skos/definition
   "jurisdiction of the judiciary of Denmark, a civil law system with some references to Germanic law that was substantially reformed in 2007"})

(def JurisdictionOfEstonia
  "jurisdiction of the judiciary of Estonia, a civil law legal system based on the Germanic legal model, whose Supreme Court is the court of cassation, which also conducts constitutional review"
  {:db/ident :fibo-be-ge-neuj/JurisdictionOfEstonia,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-neuj/GovernmentOfTheRepublicOfEstonia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Estonia,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "jurisdiction of Estonia@en"
                #voc/lstr "Eesti jurisdiktsioon@et"],
   :rdfs/seeAlso
   ["https://www.kohus.ee/en/estonian-courts/estonian-court-system"],
   :skos/definition
   "jurisdiction of the judiciary of Estonia, a civil law legal system based on the Germanic legal model, whose Supreme Court is the court of cassation, which also conducts constitutional review"})

(def JurisdictionOfFinland
  "jurisdiction of the judiciary of Finland, a civil law system divided between courts with regular civil and criminal jurisdiction and administrative courts with jurisdiction over litigation between individuals and the public administration"
  {:db/ident :fibo-be-ge-neuj/JurisdictionOfFinland,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-neuj/GovernmentOfTheRepublicOfFinland,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Finland,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "jurisdiction of Finland@en"
                #voc/lstr "Suomen lainkäyttövaltaan@fi"],
   :rdfs/seeAlso ["https://en.wikipedia.org/wiki/Judicial_system_of_Finland"],
   :skos/definition
   "jurisdiction of the judiciary of Finland, a civil law system divided between courts with regular civil and criminal jurisdiction and administrative courts with jurisdiction over litigation between individuals and the public administration"})

(def JurisdictionOfIceland
  "jurisdiction of the judiciary of Finland, a three-tier civil law system whose highest court is the Supreme Court of Iceland"
  {:db/ident :fibo-be-ge-neuj/JurisdictionOfIceland,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-neuj/GovernmentOfIceland,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Iceland,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "lögsögu Íslands@is"
                #voc/lstr "jurisdiction of Iceland@en"],
   :rdfs/seeAlso
   ["https://www.government.is/topics/law-and-order/the-judicial-system-in-iceland/"],
   :skos/definition
   "jurisdiction of the judiciary of Finland, a three-tier civil law system whose highest court is the Supreme Court of Iceland"})

(def JurisdictionOfIreland
  "jurisdiction of the judiciary of Ireland, which is the system of courts that interprets and applies the law in Ireland"
  {:db/ident :fibo-be-ge-neuj/JurisdictionOfIreland,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-neuj/GovernmentOfTheRepublicOfIreland,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Ireland,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "jurisdiction of Ireland@en"
                #voc/lstr "dlínse na hÉireann@ga"],
   :rdfs/seeAlso
   ["https://www.citizensinformation.ie/en/justice/courts_system/"],
   :skos/definition
   "jurisdiction of the judiciary of Ireland, which is the system of courts that interprets and applies the law in Ireland"})

(def JurisdictionOfLatvia
  "jurisdiction of the judiciary of Latvia, which is the system of courts that interprets and applies the law in Latvia"
  {:db/ident :fibo-be-ge-neuj/JurisdictionOfLatvia,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-neuj/GovernmentOfTheRepublicOfLatvia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Latvia,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "jurisdiction of Latvia@en"
                #voc/lstr "Latvijas jurisdikcija@lv"],
   :rdfs/seeAlso ["http://www.satv.tiesa.gov.lv/"],
   :skos/definition
   "jurisdiction of the judiciary of Latvia, which is the system of courts that interprets and applies the law in Latvia"})

(def JurisdictionOfLithuania
  "jurisdiction of the judiciary of Lithuania, whose highest court is the Constitutional Court (Konstitucinis Teismas), but the general jurisdiction dealing with civil and criminal cases includes the Supreme Court of Lithuania, the Court of Appeal of Lithuania, regional courts, and district courts"
  {:db/ident :fibo-be-ge-neuj/JurisdictionOfLithuania,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-neuj/GovernmentOfTheRepublicOfLithuania,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Lithuania,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "jurisdiction of Lithuania@en"
                #voc/lstr "Lietuvos jurisdikcija@lt"],
   :rdfs/seeAlso ["https://www.teismai.lt/en/courts/judicial-system/650"],
   :skos/definition
   "jurisdiction of the judiciary of Lithuania, whose highest court is the Constitutional Court (Konstitucinis Teismas), but the general jurisdiction dealing with civil and criminal cases includes the Supreme Court of Lithuania, the Court of Appeal of Lithuania, regional courts, and district courts"})

(def JurisdictionOfNorway
  "jurisdiction of the judiciary system in Norway, a civil law system where laws are created and amended in parliament and the system regulated through the Courts of Justice of Norway"
  {:db/ident :fibo-be-ge-neuj/JurisdictionOfNorway,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-neuj/GovernmentOfTheKingdomOfNorway,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Sweden,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "jurisdiksjon av Norge@no"
                #voc/lstr "jurisdiction of Norway@en"],
   :rdfs/seeAlso ["https://www.domstol.no/en/"],
   :skos/definition
   "jurisdiction of the judiciary system in Norway, a civil law system where laws are created and amended in parliament and the system regulated through the Courts of Justice of Norway"})

(def JurisdictionOfSweden
  "jurisdiction of the judiciary system in Sweden, which is part of the Ministry of Justice, whose courts are divided into two parallel and separate systems - general courts (allmänna domstolar) for criminal and civil cases, and general administrative courts (allmänna förvaltningsdomstolar) for cases relating to disputes between private persons and the authorities"
  {:db/ident :fibo-be-ge-neuj/JurisdictionOfSweden,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-neuj/GovernmentOfTheKingdomOfSweden,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Sweden,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "jurisdiction of Sweden@en"
                #voc/lstr "Sveriges jurisdiktion@sv"],
   :rdfs/seeAlso
   ["https://www.government.se/information-material/2019/03/organisation-and-responsibilities-of-the-ministry-of-justice/"],
   :skos/definition
   "jurisdiction of the judiciary system in Sweden, which is part of the Ministry of Justice, whose courts are divided into two parallel and separate systems - general courts (allmänna domstolar) for criminal and civil cases, and general administrative courts (allmänna förvaltningsdomstolar) for cases relating to disputes between private persons and the authorities"})

(def LatvianEntity
  "sovereign state and polity that is Latvia"
  {:db/ident :fibo-be-ge-neuj/LatvianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Latvia,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-neuj/GovernmentOfTheRepublicOfLatvia,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Latvijas vienība@lv" #voc/lstr "Latvian entity@en"],
   :skos/definition "sovereign state and polity that is Latvia"})

(def LithuanianEntity
  "sovereign state and polity that is Lithuania"
  {:db/ident :fibo-be-ge-neuj/LithuanianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Lithuania,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-neuj/GovernmentOfTheRepublicOfLithuania,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Lithuanian entity@en"
                #voc/lstr "Lietuvos subjektas@lt"],
   :skos/definition "sovereign state and polity that is Lithuania"})

(def NorwegianEntity
  "sovereign state and polity that is Norway"
  {:db/ident :fibo-be-ge-neuj/NorwegianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver [:lcc-3166-1/SvalbardAndJanMayen
                                          :lcc-3166-1/Norway
                                          :lcc-3166-1/BouvetIsland],
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-neuj/GovernmentOfTheKingdomOfNorway,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Norwegian entity@en" #voc/lstr "Norsk enhet@no"],
   :skos/definition "sovereign state and polity that is Norway"})

(def SwedishEntity
  "sovereign state and polity that is Sweden"
  {:db/ident :fibo-be-ge-neuj/SwedishEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Sweden,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-neuj/GovernmentOfTheKingdomOfSweden,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Swedish entity@en" #voc/lstr "Svensk enhet@sv"],
   :skos/definition "sovereign state and polity that is Sweden"})