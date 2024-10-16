(ns net.wikipunk.rdf.fibo-be-ge-neuj
  {:cmns-av/copyright
   #{"Copyright (c) 2010-2024 EDM Council, Inc."
     "Copyright (c) 2010-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for countries that are defined as being part of Northern Europe in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
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
   :owl/imports
   #{{:xsd/anyURI
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
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-ge-neuj",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Northern Europe Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to correct the value for hasReach for the Jurisdiction of Norway (GitHub-2037)."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The http://www.omg.org/spec/EDMC-FIBO/BE/20200801/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to address hygiene issues with diacritical marks that are language-specific."},
   :skos/scopeNote
   "The initial version of this ontology reflects the national level only.",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"})

(def AlandIslandsJurisdiction
  {:cmns-av/synonym {:rdf/language "fi",
                     :rdf/value    "Ålands tingsrätt"},
   :db/ident :fibo-be-ge-neuj/AlandIslandsJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-neuj/GovernmentOfAland,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/AlandIslands,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "fi",
                  :rdf/value    "Ahvenanmaan lainkäyttöalue"}
                 {:rdf/language "sv",
                  :rdf/value    "Ålandöarnas jurisdiktion"}
                 {:rdf/language "en",
                  :rdf/value    "Aland Islands jurisdiction"}},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.lexadin.nl/wlg/courts/nofr/eur/lxctfin.htm/"},
   :skos/definition
   "jurisdiction of the Aland District Court, which deals with criminal cases, civil cases and petitionary matters in first instance, with escalation to the appellate level in Finland as needed"})

(def AlandicEntity
  {:db/ident :fibo-be-ge-neuj/AlandicEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-1/AlandIslands,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-neuj/GovernmentOfAland,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "sv",
                  :rdf/value    "Ålandisk enhet"}
                 {:rdf/language "en",
                  :rdf/value    "Alandic entity"}
                 {:rdf/language "fi",
                  :rdf/value    "Ahvenanmaan kokonaisuus"}},
   :skos/definition "regional sovereignty and polity that is Aland"})

(def DanishEntity
  {:db/ident :fibo-be-ge-neuj/DanishEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Denmark,
   :fibo-be-ge-ge/hasSharedSovereigntyOver #{:lcc-3166-1/FaroeIslands
                                             :lcc-3166-1/Greenland},
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-neuj/GovernmentOfTheKingdomOfDenmark,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Danish entity"}
                 {:rdf/language "da",
                  :rdf/value    "Dansk enhed"}},
   :skos/definition "sovereign state and polity that is Denmark"})

(def EstonianEntity
  {:db/ident :fibo-be-ge-neuj/EstonianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Estonia,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-neuj/GovernmentOfTheRepublicOfEstonia,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "et",
                  :rdf/value    "Eesti üksus"}
                 {:rdf/language "en",
                  :rdf/value    "Estonian entity"}},
   :skos/definition "sovereign state and polity that is Estonia"})

(def FinnishEntity
  {:db/ident :fibo-be-ge-neuj/FinnishEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Finland,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-1/AlandIslands,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-neuj/GovernmentOfTheRepublicOfFinland,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Finnish entity"}
                 {:rdf/language "fi",
                  :rdf/value    "Suomen entiteetti"}},
   :skos/definition "sovereign state and polity that is Finland"})

(def GovernmentOfAland
  {:cmns-av/explanatoryNote
   "The Aland Islands are governed according to the Act on the Autonomy of Aland and international treaties. These laws guarantee the islands' autonomy from Finland, which has ultimate sovereignty over them, as well as a demilitarised status. The Government of Aland answers to the Parliament of Aland, in accordance with the principles of parliamentarism.",
   :db/ident :fibo-be-ge-neuj/GovernmentOfAland,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-neuj/AlandIslandsJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/AlandIslands,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "fi",
                  :rdf/value    "Ahvenanmaan hallitus"}
                 {:rdf/language "en",
                  :rdf/value    "Government of Aland"}
                 {:rdf/language "sv",
                  :rdf/value    "Ålands regering"}},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://en.wikipedia.org/wiki/%C3%85land_Islands/"},
   :skos/definition
   "regional government of the Aland Islands, an archipelago province at the entrance to the Gulf of Bothnia in the Baltic Sea belonging to Finland"})

(def GovernmentOfIceland
  {:db/ident :fibo-be-ge-neuj/GovernmentOfIceland,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-neuj/JurisdictionOfIceland,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Iceland,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "is",
                  :rdf/value    "Ríkisstjórn Íslands"}
                 {:rdf/language "en",
                  :rdf/value    "Government of Iceland"}},
   :rdfs/seeAlso {:xsd/anyURI "https://www.government.is/"},
   :skos/definition
   "unitary parliamentary republic and representative democracy, that is a Nordic island country in the North Atlantic"})

(def GovernmentOfTheKingdomOfDenmark
  {:cmns-av/synonym #{{:rdf/language "en",
                       :rdf/value    "Danish government"}
                      {:rdf/language "da",
                       :rdf/value    "Danmarks regering"}},
   :db/ident :fibo-be-ge-neuj/GovernmentOfTheKingdomOfDenmark,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-neuj/JurisdictionOfDenmark,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Denmark,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Kingdom of Denmark"}
                 {:rdf/language "da",
                  :rdf/value    "Kongeriget Danmarks regering"}},
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://denmark.dk/society-and-business/government-and-politics/"},
   :skos/definition
   "unitary constitutional monarchy and parliamentary democracy, with the monarch as the official head of government, that includes the southernmost of the Scandinavian countries, consisting of a peninsula, Jutland, and an archipelago of 443 named islands"})

(def GovernmentOfTheKingdomOfNorway
  {:db/ident :fibo-be-ge-neuj/GovernmentOfTheKingdomOfNorway,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-neuj/JurisdictionOfNorway,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Norway,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "no",
                  :rdf/value    "Kongeriket Norges regjering"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Kingdom of Norway"}},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.regjeringen.no/en/the-government/id443314/"},
   :skos/definition
   "unitary constitutional monarchy and parliamentary democracy, wherein the monarch is the head of state and the prime minister is the head of government, whose mainland comprises the western and northernmost portion of the Scandinavian Peninsula and includes the remote island of Jan Mayen as well as the archipelago of Svalbard"})

(def GovernmentOfTheKingdomOfSweden
  {:db/ident :fibo-be-ge-neuj/GovernmentOfTheKingdomOfSweden,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-neuj/JurisdictionOfSweden,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Sweden,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Kingdom of Sweden"}
                 {:rdf/language "sv",
                  :rdf/value    "Konungariket Sveriges regering"}},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.government.se/government-of-sweden/"},
   :skos/definition
   "constitutional monarchy and parliamentary democracy, with a largely ceremonial and representative monarch as head of state, located in Scandinavia between the North Atlantic, the Baltic Sea and Eurasian Russia"})

(def GovernmentOfTheRepublicOfEstonia
  {:db/ident :fibo-be-ge-neuj/GovernmentOfTheRepublicOfEstonia,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-neuj/JurisdictionOfEstonia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Estonia,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Republic of Estonia"}
                 {:rdf/language "et",
                  :rdf/value    "Eesti Vabariigi valitsus"}},
   :rdfs/seeAlso {:xsd/anyURI "https://www.valitsus.ee/en/"},
   :skos/definition
   "democratic unitary parliamentary republic divided into fifteen counties, located on the eastern coast of the Baltic Sea in Northern Europe"})

(def GovernmentOfTheRepublicOfFinland
  {:db/ident :fibo-be-ge-neuj/GovernmentOfTheRepublicOfFinland,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-neuj/JurisdictionOfFinland,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Finland,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Republic of Finland"}
                 {:rdf/language "fi",
                  :rdf/value    "Suomen tasavallan hallitus"}},
   :rdfs/seeAlso {:xsd/anyURI "https://valtioneuvosto.fi/en/government"},
   :skos/definition
   "parliamentary republic within the framework of a representative democracy comprised of 19 regions and 310 municipalities, located in the Nordic region of Europe"})

(def GovernmentOfTheRepublicOfIreland
  {:db/ident :fibo-be-ge-neuj/GovernmentOfTheRepublicOfIreland,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-neuj/JurisdictionOfIreland,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Ireland,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "ga",
                  :rdf/value    "Rialtas Phoblacht na hÉireann"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Republic of Ireland"}},
   :rdfs/seeAlso {:xsd/anyURI "https://www.gov.ie/"},
   :skos/definition
   "parliamentary, representative democratic republic, based on the British model, that is an independent state and member of the European Union, which covers five-sixths of the island of Ireland in the North Atlantic"})

(def GovernmentOfTheRepublicOfLatvia
  {:db/ident :fibo-be-ge-neuj/GovernmentOfTheRepublicOfLatvia,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-neuj/JurisdictionOfLatvia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Latvia,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Republic of Latvia"}
                 {:rdf/language "lv",
                  :rdf/value    "Latvijas Republikas valdība"}},
   :rdfs/seeAlso {:xsd/anyURI "https://www.mk.gov.lv/en"},
   :skos/definition
   "unitary, parliamentary, constitutional republic located in the Baltic region of Northern Europe"})

(def GovernmentOfTheRepublicOfLithuania
  {:db/ident :fibo-be-ge-neuj/GovernmentOfTheRepublicOfLithuania,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-neuj/JurisdictionOfLithuania,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Lithuania,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Republic of Lithuania"}
                 {:rdf/language "lt",
                  :rdf/value    "Lietuvos Respublikos Vyriausybė"}},
   :rdfs/seeAlso {:xsd/anyURI "https://lrv.lt/en/"},
   :skos/definition
   "unitary semi-presidential republic situated along the southeastern shore of the Baltic Sea, to the southeast of Sweden and Denmark"})

(def IcelandicEntity
  {:db/ident :fibo-be-ge-neuj/IcelandicEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Iceland,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-neuj/GovernmentOfIceland,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Icelandic entity"}
                 {:rdf/language "is",
                  :rdf/value    "Íslensk eining"}},
   :skos/definition "sovereign state and polity that is Iceland"})

(def IrishEntity
  {:db/ident :fibo-be-ge-neuj/IrishEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Ireland,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-neuj/GovernmentOfTheRepublicOfIreland,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "ga",
                  :rdf/value    "Aonán Éireannach"}
                 {:rdf/language "en",
                  :rdf/value    "Irish entity"}},
   :skos/definition "sovereign state and polity that is Ireland"})

(def JurisdictionOfDenmark
  {:db/ident :fibo-be-ge-neuj/JurisdictionOfDenmark,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-neuj/GovernmentOfTheKingdomOfDenmark,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Denmark,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "da",
                  :rdf/value    "Danmarks jurisdiktion"}
                 {:rdf/language "en",
                  :rdf/value    "jurisdiction of Denmark"}},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://en.wikipedia.org/wiki/Courts_of_Denmark/"},
   :skos/definition
   "jurisdiction of the judiciary of Denmark, a civil law system with some references to Germanic law that was substantially reformed in 2007"})

(def JurisdictionOfEstonia
  {:db/ident :fibo-be-ge-neuj/JurisdictionOfEstonia,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-neuj/GovernmentOfTheRepublicOfEstonia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Estonia,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "jurisdiction of Estonia"}
                 {:rdf/language "et",
                  :rdf/value    "Eesti jurisdiktsioon"}},
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.kohus.ee/en/estonian-courts/estonian-court-system"},
   :skos/definition
   "jurisdiction of the judiciary of Estonia, a civil law legal system based on the Germanic legal model, whose Supreme Court is the court of cassation, which also conducts constitutional review"})

(def JurisdictionOfFinland
  {:db/ident :fibo-be-ge-neuj/JurisdictionOfFinland,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-neuj/GovernmentOfTheRepublicOfFinland,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Finland,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "jurisdiction of Finland"}
                 {:rdf/language "fi",
                  :rdf/value    "Suomen lainkäyttövaltaan"}},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://en.wikipedia.org/wiki/Judicial_system_of_Finland"},
   :skos/definition
   "jurisdiction of the judiciary of Finland, a civil law system divided between courts with regular civil and criminal jurisdiction and administrative courts with jurisdiction over litigation between individuals and the public administration"})

(def JurisdictionOfIceland
  {:db/ident :fibo-be-ge-neuj/JurisdictionOfIceland,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-neuj/GovernmentOfIceland,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Iceland,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "is",
                  :rdf/value    "lögsögu Íslands"}
                 {:rdf/language "en",
                  :rdf/value    "jurisdiction of Iceland"}},
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.government.is/topics/law-and-order/the-judicial-system-in-iceland/"},
   :skos/definition
   "jurisdiction of the judiciary of Finland, a three-tier civil law system whose highest court is the Supreme Court of Iceland"})

(def JurisdictionOfIreland
  {:db/ident :fibo-be-ge-neuj/JurisdictionOfIreland,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-neuj/GovernmentOfTheRepublicOfIreland,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Ireland,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "jurisdiction of Ireland"}
                 {:rdf/language "ga",
                  :rdf/value    "dlínse na hÉireann"}},
   :rdfs/seeAlso
   {:xsd/anyURI "https://www.citizensinformation.ie/en/justice/courts_system/"},
   :skos/definition
   "jurisdiction of the judiciary of Ireland, which is the system of courts that interprets and applies the law in Ireland"})

(def JurisdictionOfLatvia
  {:db/ident :fibo-be-ge-neuj/JurisdictionOfLatvia,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-neuj/GovernmentOfTheRepublicOfLatvia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Latvia,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "lv",
                  :rdf/value    "Latvijas jurisdikcija"}
                 {:rdf/language "en",
                  :rdf/value    "jurisdiction of Latvia"}},
   :rdfs/seeAlso {:xsd/anyURI "http://www.satv.tiesa.gov.lv/"},
   :skos/definition
   "jurisdiction of the judiciary of Latvia, which is the system of courts that interprets and applies the law in Latvia"})

(def JurisdictionOfLithuania
  {:db/ident :fibo-be-ge-neuj/JurisdictionOfLithuania,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-neuj/GovernmentOfTheRepublicOfLithuania,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Lithuania,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "lt",
                  :rdf/value    "Lietuvos jurisdikcija"}
                 {:rdf/language "en",
                  :rdf/value    "jurisdiction of Lithuania"}},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.teismai.lt/en/courts/judicial-system/650"},
   :skos/definition
   "jurisdiction of the judiciary of Lithuania, whose highest court is the Constitutional Court (Konstitucinis Teismas), but the general jurisdiction dealing with civil and criminal cases includes the Supreme Court of Lithuania, the Court of Appeal of Lithuania, regional courts, and district courts"})

(def JurisdictionOfNorway
  {:db/ident :fibo-be-ge-neuj/JurisdictionOfNorway,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-neuj/GovernmentOfTheKingdomOfNorway,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Norway,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "jurisdiction of Norway"}
                 {:rdf/language "no",
                  :rdf/value    "jurisdiksjon av Norge"}},
   :rdfs/seeAlso {:xsd/anyURI "https://www.domstol.no/en/"},
   :skos/definition
   "jurisdiction of the judiciary system in Norway, a civil law system where laws are created and amended in parliament and the system regulated through the Courts of Justice of Norway"})

(def JurisdictionOfSweden
  {:db/ident :fibo-be-ge-neuj/JurisdictionOfSweden,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-neuj/GovernmentOfTheKingdomOfSweden,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Sweden,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "sv",
                  :rdf/value    "Sveriges jurisdiktion"}
                 {:rdf/language "en",
                  :rdf/value    "jurisdiction of Sweden"}},
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.government.se/information-material/2019/03/organisation-and-responsibilities-of-the-ministry-of-justice/"},
   :skos/definition
   "jurisdiction of the judiciary system in Sweden, which is part of the Ministry of Justice, whose courts are divided into two parallel and separate systems - general courts (allmänna domstolar) for criminal and civil cases, and general administrative courts (allmänna förvaltningsdomstolar) for cases relating to disputes between private persons and the authorities"})

(def LatvianEntity
  {:db/ident :fibo-be-ge-neuj/LatvianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Latvia,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-neuj/GovernmentOfTheRepublicOfLatvia,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Latvian entity"}
                 {:rdf/language "lv",
                  :rdf/value    "Latvijas vienība"}},
   :skos/definition "sovereign state and polity that is Latvia"})

(def LithuanianEntity
  {:db/ident :fibo-be-ge-neuj/LithuanianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Lithuania,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-neuj/GovernmentOfTheRepublicOfLithuania,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "lt",
                  :rdf/value    "Lietuvos subjektas"}
                 {:rdf/language "en",
                  :rdf/value    "Lithuanian entity"}},
   :skos/definition "sovereign state and polity that is Lithuania"})

(def NorwegianEntity
  {:db/ident :fibo-be-ge-neuj/NorwegianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver #{:lcc-3166-1/BouvetIsland
                                           :lcc-3166-1/Norway
                                           :lcc-3166-1/SvalbardAndJanMayen},
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-neuj/GovernmentOfTheKingdomOfNorway,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Norwegian entity"}
                 {:rdf/language "no",
                  :rdf/value    "Norsk enhet"}},
   :skos/definition "sovereign state and polity that is Norway"})

(def SwedishEntity
  {:db/ident :fibo-be-ge-neuj/SwedishEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Sweden,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-neuj/GovernmentOfTheKingdomOfSweden,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "sv",
                  :rdf/value    "Svensk enhet"}
                 {:rdf/language "en",
                  :rdf/value    "Swedish entity"}},
   :skos/definition "sovereign state and polity that is Sweden"})

(def urn:uuid:958c7ff5-ef8b-5fcd-863e-b16296cfd6ad
  {:cmns-av/copyright
   #{"Copyright (c) 2010-2024 EDM Council, Inc."
     "Copyright (c) 2010-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for countries that are defined as being part of Northern Europe in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
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
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Northern Europe Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to correct the value for hasReach for the Jurisdiction of Norway (GitHub-2037)."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The http://www.omg.org/spec/EDMC-FIBO/BE/20200801/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to address hygiene issues with diacritical marks that are language-specific."},
   :skos/scopeNote
   "The initial version of this ontology reflects the national level only.",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"})