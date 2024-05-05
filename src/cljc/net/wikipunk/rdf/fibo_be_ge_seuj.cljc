(ns net.wikipunk.rdf.fibo-be-ge-seuj
  {:cmns-av/copyright
   #{"Copyright (c) 2010-2023 EDM Council, Inc."
     "Copyright (c) 2010-2023 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for countries that are defined as being part of Southern Europe in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-ge-ge"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/",
    "fibo-be-ge-seuj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
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
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-ge-seuj",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Southern Europe Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   #{"The http://www.omg.org/spec/EDMC-FIBO/BE/20200801/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to address hygiene issues with diacritical marks that are language-specific."
     "The http://www.omg.org/spec/EDMC-FIBO/BE/20210201/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to replace references to Macedonia with NorthMacedonia from LCC 1.2."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."},
   :skos/scopeNote
   "The initial version of this ontology reflects the national level only.",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"})

(def AlbanianEntity
  {:db/ident :fibo-be-ge-seuj/AlbanianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Albania,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfAlbania,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "sq",
                  :rdf/value    "Entiteti shqiptar"}
                 {:rdf/language "en",
                  :rdf/value    "Albanian entity"}},
   :skos/definition "sovereign state and polity that is Albania"})

(def AndorranEntity
  {:db/ident :fibo-be-ge-seuj/AndorranEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Andorra,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seuj/GovernmentOfThePrincipalityOfAndorra,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Andorran entity"}
                 {:rdf/language "ca",
                  :rdf/value    "Entitat andorrana"}},
   :skos/definition "sovereign state and polity that is Andorra"})

(def BosnianAndHerzegovinianEntity
  {:db/ident :fibo-be-ge-seuj/BosnianAndHerzegovinianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/BosniaAndHerzegovina,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seuj/GovernmentOfTheFederationOfBosniaAndHerzegovina,
   :rdf/type #{:fibo-be-ge-ge/FederatedSovereignty :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "bs",
                  :rdf/value    "Bosanskohercegovački entitet"}
                 {:rdf/language "en",
                  :rdf/value    "Bosnian and Herzegovinian entity"}
                 {:rdf/language "sr",
                  :rdf/value    "Босанскохерцеговачки ентитет"}
                 {:rdf/language "hr",
                  :rdf/value    "Bosanskohercegovački entitet"}},
   :skos/definition
   "federal sovereignty state and polity that is Bosnia and Herzegovina"})

(def CroatianEntity
  {:db/ident :fibo-be-ge-seuj/CroatianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Croatia,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfCroatia,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "hr",
                  :rdf/value    "Hrvatski entitet"}
                 {:rdf/language "en",
                  :rdf/value    "Croatian entity"}},
   :skos/definition "sovereign state and polity that is Croatia"})

(def GovernmentOfMontenegro
  {:db/ident :fibo-be-ge-seuj/GovernmentOfMontenegro,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfMontenegro,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Montenegro,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Government of Montenegro"},
   :rdfs/seeAlso {:xsd/anyURI "http://www.gov.me/en/homepage/"},
   :skos/definition
   "unitary, dominant-party, parliamentary constitutional republic that is located in South and Southeast Europe on the coast of the Balkans"})

(def GovernmentOfTheFederationOfBosniaAndHerzegovina
  {:db/ident :fibo-be-ge-seuj/GovernmentOfTheFederationOfBosniaAndHerzegovina,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-seuj/JurisdictionOfBosniaAndHerzegovina,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/BosniaAndHerzegovina,
   :rdf/type #{:fibo-be-ge-ge/FederalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "sr",
                  :rdf/value    "Влада Федерације Босне и Херцеговине"}
                 {:rdf/language "en",
                  :rdf/value
                  "Government of the Federation of Bosnia and Herzegovina"}
                 {:rdf/language "bs",
                  :rdf/value    "Vlada Federacije Bosne i Hercegovine"}
                 {:rdf/language "hr",
                  :rdf/value    "Vlada Federacije Bosne i Hercegovine"}},
   :rdfs/seeAlso {:xsd/anyURI "http://fbihvlada.gov.ba/english/"},
   :skos/definition
   "federal parliamentary constitutional republic that is a representative democracy, located in South and Southeast Europe, within the Balkans"})

(def GovernmentOfTheHellenicRepublic
  {:db/ident :fibo-be-ge-seuj/GovernmentOfTheHellenicRepublic,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfGreece,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Greece,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Hellenic Republic"}
                 {:rdf/language "el",
                  :rdf/value    "Κυβέρνηση της Ελληνικής Δημοκρατίας"}},
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.mfa.gr/missionsabroad/en/about-greece/government-and-politics/"},
   :skos/definition
   "unitary parliamentary republic, located on the Balkan Peninsula in Southeast Europe"})

(def GovernmentOfTheHolySee
  {:cmns-av/synonym "Government of the See of Rome",
   :db/ident :fibo-be-ge-seuj/GovernmentOfTheHolySee,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfTheHolySee,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/HolySee,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "la",
                  :rdf/value    "Imperium in Consiliis Sanctae Sedis"}
                 {:rdf/language "it",
                  :rdf/value    "Governo della Santa Sede"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Holy See"}},
   :rdfs/seeAlso {:xsd/anyURI "http://www.vatican.va/content/vatican/en.html"},
   :skos/definition
   "unitary Christian absolute monarchy (under an ecclesiastical and elective theocracy), headquartered in, operates from, and exercises 'exclusive dominion' over the independent Vatican City State enclave in Rome, of which the pope is sovereign, administered by the Roman Curia"})

(def GovernmentOfTheKingdomOfSpain
  {:db/ident :fibo-be-ge-seuj/GovernmentOfTheKingdomOfSpain,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfSpain,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Spain,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Kingdom of Spain"}
                 {:rdf/language "es",
                  :rdf/value    "Gobierno del Reino de España"}},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.lamoncloa.gob.es/lang/en/Paginas/index.aspx"},
   :skos/definition
   "unitary parliamentary constitutional monarchy, whose monarch is the head of state and prime minister is the head of government, located in Southwestern Europe with some pockets of territory across the Strait of Gibraltar and the Atlantic Ocean"})

(def GovernmentOfThePortugueseRepublic
  {:db/ident :fibo-be-ge-seuj/GovernmentOfThePortugueseRepublic,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfPortugal,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Portugal,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Portuguese Republic"}
                 {:rdf/language "pt",
                  :rdf/value    "Governo da República Portuguesa"}},
   :rdfs/seeAlso {:xsd/anyURI "https://www.portugal.gov.pt/en/gc21"},
   :skos/definition
   "unitary, semi-presidential, constitutional, representative democratic republic, located mostly on the Iberian Peninsula, in southwestern Europe"})

(def GovernmentOfThePrincipalityOfAndorra
  {:db/ident :fibo-be-ge-seuj/GovernmentOfThePrincipalityOfAndorra,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfAndorra,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Andorra,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Principality of Andorra"}
                 {:rdf/language "ca",
                  :rdf/value    "Govern del Principat d’Andorra"}},
   :rdfs/seeAlso {:xsd/anyURI "https://www.govern.ad/"},
   :skos/definition
   "unitary parliamentary semi-elective diarchy, a sovereign landlocked microstate on the Iberian Peninsula, in the eastern Pyrenees, bordered by France to the north and Spain to the south"})

(def GovernmentOfTheRepublicOfAlbania
  {:db/ident :fibo-be-ge-seuj/GovernmentOfTheRepublicOfAlbania,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfAlbania,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Albania,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "sq",
                  :rdf/value    "Qeveria e Republikës së Shqipërisë"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Republic of Albania"}},
   :rdfs/seeAlso {:xsd/anyURI "http://parlament.al/"},
   :skos/definition
   "unitary parliamentary constitutional republic, located in Southeast Europe on the Adriatic and Ionian Sea within the Mediterranean Sea"})

(def GovernmentOfTheRepublicOfCroatia
  {:db/ident :fibo-be-ge-seuj/GovernmentOfTheRepublicOfCroatia,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfCroatia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Croatia,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Republic of Croatia"}
                 {:rdf/language "hr",
                  :rdf/value    "Vlada Republike Hrvatske"}},
   :rdfs/seeAlso {:xsd/anyURI "https://vlada.gov.hr/"},
   :skos/definition
   "unitary parliamentary constitutional republic, located in Southeast Europe, bordering Slovenia to the northwest, Hungary to the northeast, Serbia to the east, Bosnia and Herzegovina, and Montenegro to the southeast, sharing a maritime border with Italy"})

(def GovernmentOfTheRepublicOfItaly
  {:db/ident :fibo-be-ge-seuj/GovernmentOfTheRepublicOfItaly,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfItaly,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Italy,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "it",
                  :rdf/value    "Governo della Repubblica Italiana"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Republic of Italy"}},
   :rdfs/seeAlso {:xsd/anyURI "http://www.governo.it/"},
   :skos/definition
   "unitary parliamentary, constitutional, democratic republic, consisting of a peninsula bordering the Alps and surrounded by several islands, located in south-central Europe"})

(def GovernmentOfTheRepublicOfMalta
  {:db/ident :fibo-be-ge-seuj/GovernmentOfTheRepublicOfMalta,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfMalta,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Malta,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Government of the Republic of Malta"},
   :rdfs/seeAlso {:xsd/anyURI "https://www.gov.mt/"},
   :skos/definition
   "unitary parliamentary constitutional republic modelled on the Westminster system that is a Southern European island country consisting of an archipelago in the Mediterranean Sea"})

(def GovernmentOfTheRepublicOfNorthMacedonia
  {:db/ident :fibo-be-ge-seuj/GovernmentOfTheRepublicOfNorthMacedonia,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfNorthMacedonia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/NorthMacedonia,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "mk",
                  :rdf/value    "Влада на Република Северна Македонија"}
                 {:rdf/language "en",
                  :rdf/value "Government of the Republic of North Macedonia"}},
   :rdfs/seeAlso {:xsd/anyURI "https://vlada.mk/"},
   :skos/definition
   "unitary parliamentary, constitutional, democratic republic, located in the Balkan Peninsula in Southeast Europe"})

(def GovernmentOfTheRepublicOfSanMarino
  {:db/ident :fibo-be-ge-seuj/GovernmentOfTheRepublicOfSanMarino,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfSanMarino,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/SanMarino,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Republic of San Marino"}
                 {:rdf/language "it",
                  :rdf/value    "Governo della Repubblica di San Marino"}},
   :rdfs/seeAlso {:xsd/anyURI "http://www.sanmarino.sm/on-line/en/home.html"},
   :skos/definition
   "unitary parliamentary, diarchic, directorial republic that is a microstate in Southern Europe, completely surrounded by Italy, located on the northeastern side of the Apennine Mountains"})

(def GovernmentOfTheRepublicOfSerbia
  {:db/ident :fibo-be-ge-seuj/GovernmentOfTheRepublicOfSerbia,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfSerbia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Serbia,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "sr",
                  :rdf/value    "Влада Републике Србије"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Republic of Serbia"}},
   :rdfs/seeAlso {:xsd/anyURI "https://www.srbija.gov.rs/"},
   :skos/definition
   "unitary, dominant-party, parliamentary constitutional republic that is situated at the crossroads of Central and Southeast Europe in the southern Pannonian Plain and the central Balkans"})

(def GovernmentOfTheRepublicOfSlovenia
  {:db/ident :fibo-be-ge-seuj/GovernmentOfTheRepublicOfSlovenia,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfSlovenia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Slovenia,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "sl",
                  :rdf/value    "Vlada Republike Slovenije"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Republic of Slovenia"}},
   :rdfs/seeAlso {:xsd/anyURI "https://www.gov.si/"},
   :skos/definition
   "unitary, parliamentary constitutional republic bordered by Italy to the west, Austria to the north, Hungary to the northeast, Croatia to the southeast, and the Adriatic Sea to the southwest"})

(def GreekEntity
  {:db/ident :fibo-be-ge-seuj/GreekEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Greece,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seuj/GovernmentOfTheHellenicRepublic,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "el",
                  :rdf/value    "Ελληνική οντότητα"}
                 {:rdf/language "en",
                  :rdf/value    "Greek entity"}},
   :skos/definition "sovereign state and polity that is Greece"})

(def HolySeeEntity
  {:db/ident :fibo-be-ge-seuj/HolySeeEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/HolySee,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-seuj/GovernmentOfTheHolySee,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Holy See entity"}
                 {:rdf/language "it",
                  :rdf/value    "Entità della Santa Sede"}},
   :skos/definition "sovereign state and polity that is the Holy See"})

(def ItalianEntity
  {:db/ident :fibo-be-ge-seuj/ItalianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Italy,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfItaly,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Italian entity"}
                 {:rdf/language "it",
                  :rdf/value    "Ente italiano"}},
   :skos/definition "sovereign state and polity that is Italy"})

(def JurisdictionOfAlbania
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfAlbania,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfAlbania,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Albania,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "jurisdiction of Albania"}
                 {:rdf/language "sq",
                  :rdf/value    "juridiksioni i Shqipërisë"}},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://en.wikipedia.org/wiki/Supreme_Court_of_Albania"},
   :skos/definition
   "jurisdiction of the judiciary of Albania, a system of courts that includes the supreme court, constitutional court, appeal court and administrative court, and whose Supreme Court of the Republic of Albania is the highest court and is the final court of appeal"})

(def JurisdictionOfAndorra
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfAndorra,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seuj/GovernmentOfThePrincipalityOfAndorra,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Andorra,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "ca",
                  :rdf/value    "jurisdicció d’Andorra"}
                 {:rdf/language "en",
                  :rdf/value    "jurisdiction of Andorra"}},
   :skos/definition
   "jurisdiction of the judiciary of Andorra, composed of the Magistrates Court, the Criminal Law Court, the High Court of Andorra, and the Constitutional Court"})

(def JurisdictionOfBosniaAndHerzegovina
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfBosniaAndHerzegovina,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seuj/GovernmentOfTheFederationOfBosniaAndHerzegovina,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/BosniaAndHerzegovina,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "jurisdiction of Bosnia and Herzegovina"}
                 {:rdf/language "hr",
                  :rdf/value    "nadležnost Bosne i Hercegovine"}
                 {:rdf/language "bs",
                  :rdf/value    "nadležnost Bosne i Hercegovine"}
                 {:rdf/language "sr",
                  :rdf/value    "надлежност Босне и Херцеговине"}},
   :rdfs/seeAlso
   {:xsd/anyURI
    "http://www.mpr.gov.ba/organizacija_nadleznosti/pravosudje/Default.aspx"},
   :skos/definition
   "jurisdiction of the judiciary of Bosnia and Herzegovina, whose Constitutional Court of Bosnia and Herzegovina is the supreme, final arbiter of legal matters"})

(def JurisdictionOfCroatia
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfCroatia,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfCroatia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Croatia,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "jurisdiction of Croatia"}
                 {:rdf/language "hr",
                  :rdf/value    "nadležnost Hrvatske"}},
   :rdfs/seeAlso {:xsd/anyURI "https://www.usud.hr/"},
   :skos/definition
   "jurisdiction of the judiciary of Croatia, a civil law legal system in which law arises primarily from written statutes, influenced by German and Austrian legal systems, whose national courts include the Constitutional Court, which oversees violations of the Constitution, and the Supreme Court, which is the highest court of appeal"})

(def JurisdictionOfGreece
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfGreece,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seuj/GovernmentOfTheHellenicRepublic,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Greece,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "jurisdiction of Greece"}
                 {:rdf/language "el",
                  :rdf/value    "δικαιοδοσία της Ελλάδας"}},
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.mfa.gr/missionsabroad/en/about-greece/government-and-politics/judicial-power.html"},
   :skos/definition
   "jurisdiction of the judiciary of the Hellenic Republic, whose supreme courts include the Court of Cassation, the Council of State and the Court of Auditors"})

(def JurisdictionOfItaly
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfItaly,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfItaly,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Italy,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "it",
                  :rdf/value    "giurisdizione dell'Italia"}
                 {:rdf/language "en",
                  :rdf/value    "jurisdiction of Italy"}},
   :skos/definition
   "jurisdiction of the judiciary of Italy, a system of courts that is based on Roman law modified by the Napoleonic code and later statutes, comprising the Supreme Court of Cassation, the highest court in Italy for both criminal and civil appeal cases, and the Constitutional Court of Italy (Corte Costituzionale)"})

(def JurisdictionOfMalta
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfMalta,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfMalta,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Malta,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "jurisdiction of Malta"},
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://justice.gov.mt/en/justice/Pages/The-Judiciary-in-Malta.aspx"},
   :skos/definition
   "jurisdiction of the judiciary of Malta, which is based partially on English law and partly on Continental law, that interprets and applies the laws of Malta to ensure equal justice under law, and to provide a mechanism for dispute resolution"})

(def JurisdictionOfMontenegro
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfMontenegro,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-seuj/GovernmentOfMontenegro,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Montenegro,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "jurisdiction of Montenegro"},
   :skos/definition
   "jurisdiction of the judiciary of Montenegro, that interprets and applies the laws of Montenegro, and has been working with the European Union over the last several years to increase judicial independence and accountability"})

(def JurisdictionOfNorthMacedonia
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfNorthMacedonia,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfNorthMacedonia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/NorthMacedonia,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "mk",
                  :rdf/value    "јурисдикција на Северна Македонија"}
                 {:rdf/language "en",
                  :rdf/value    "jurisdiction of North Macedonia"}},
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.sobranie.mk/the-constitution-of-the-republic-of-macedonia-ns_article-constitution-of-the-republic-of-north-macedonia.nspx"},
   :skos/definition
   "jurisdiction of the judiciary of North Macedonia, an independent judicial branch that includes a constitutional court"})

(def JurisdictionOfPortugal
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfPortugal,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seuj/GovernmentOfThePortugueseRepublic,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Portugal,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "jurisdiction of Portugal"}
                 {:rdf/language "pt",
                  :rdf/value    "jurisdição de portugal"}},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://en.wikipedia.org/wiki/Judiciary_of_Portugal"},
   :skos/definition
   "jurisdiction of the judiciary of Portugal, a system of courts that together constitute one of the four organs of Sovereignty as defined by the Portuguese Constitution"})

(def JurisdictionOfSanMarino
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfSanMarino,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfSanMarino,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/SanMarino,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "jurisdiction of San Marino"}
                 {:rdf/language "it",
                  :rdf/value    "giurisdizione di San Marino"}},
   :skos/definition
   "jurisdiction of the judiciary of San Marino, including the Council of Twelve, which forms the judicial branch during the period of legislature of the Council"})

(def JurisdictionOfSerbia
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfSerbia,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfSerbia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Serbia,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "jurisdiction of Serbia"}
                 {:rdf/language "sr",
                  :rdf/value    "надлежност Србије"}},
   :skos/definition
   "jurisdiction of the judiciary of Serbia, a three-tiered judicial system that includes the Supreme Court of Cassation as the court of the last resort, Courts of Appeal as the appellate instance, and Basic and High courts as the general jurisdictions at first instance"})

(def JurisdictionOfSlovenia
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfSlovenia,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfSlovenia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Slovenia,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "sl",
                  :rdf/value    "pristojnost Slovenije"}
                 {:rdf/language "en",
                  :rdf/value    "jurisdiction of Slovenia"}},
   :rdfs/seeAlso {:xsd/anyURI "http://www.sodisce.si/"},
   :skos/definition
   "jurisdiction of the judiciary of Slovenia, a system of courts with general responsibilities and specialised courts that deal with matters relating to specific legal areas, including a Constitutional Court at the highest level"})

(def JurisdictionOfSpain
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfSpain,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seuj/GovernmentOfTheKingdomOfSpain,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Spain,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "jurisdicción de España"}
                 {:rdf/language "en",
                  :rdf/value    "jurisdiction of Spain"}},
   :rdfs/seeAlso {:xsd/anyURI
                  "http://www.poderjudicial.es/cgpj/es/Poder_Judicial"},
   :skos/definition
   "jurisdiction of judiciary of Spain, a system of courts that includes senior judges - the President and judges of the Constitutional Court (the highest tribunal in the Kingdom) - that interprets and applies the law in Spain"})

(def JurisdictionOfTheHolySee
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfTheHolySee,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-seuj/GovernmentOfTheHolySee,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/HolySee,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "it",
                  :rdf/value    "giurisdizione della Santa Sede"}
                 {:rdf/language "en",
                  :rdf/value    "jurisdiction of the Holy See"}
                 {:rdf/language "la",
                  :rdf/value    "ius proprium Sanctae Sedis"}},
   :skos/definition
   "jurisdiction of the Bishop of Rome, known as the pope, which includes the apostolic episcopal see of the Diocese of Rome with universal ecclesiastical jurisdiction of the worldwide Catholic Church, as well as a sovereign entity of international law, governing the Vatican City"})

(def MalteseEntity
  {:db/ident :fibo-be-ge-seuj/MalteseEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Malta,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfMalta,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Maltese entity"},
   :skos/definition "sovereign state and polity that is Malta"})

(def MontenegrinEntity
  {:db/ident :fibo-be-ge-seuj/MontenegrinEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Montenegro,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-seuj/GovernmentOfMontenegro,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Montenegrin entity"},
   :skos/definition "sovereign state and polity that is Montenegro"})

(def NorthMacedonianEntity
  {:db/ident :fibo-be-ge-seuj/NorthMacedonianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/NorthMacedonia,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfNorthMacedonia,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "mk",
                  :rdf/value    "Северномакедонски субјект"}
                 {:rdf/language "en",
                  :rdf/value    "North Macedonian entity"}},
   :skos/definition "sovereign state and polity that is North Macedonia"})

(def PortugueseEntity
  {:db/ident :fibo-be-ge-seuj/PortugueseEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Portugal,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seuj/GovernmentOfThePortugueseRepublic,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "pt",
                  :rdf/value    "Entidade portuguesa"}
                 {:rdf/language "en",
                  :rdf/value    "Portuguese entity"}},
   :skos/definition "sovereign state and polity that is Portugal"})

(def SammarineseEntity
  {:db/ident :fibo-be-ge-seuj/SammarineseEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/SanMarino,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfSanMarino,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "it",
                  :rdf/value    "Ente sammarinese"}
                 {:rdf/language "en",
                  :rdf/value    "Sammarinese entity"}},
   :skos/definition "sovereign state and polity that is San Marino"})

(def SerbianEntity
  {:db/ident :fibo-be-ge-seuj/SerbianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Serbia,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfSerbia,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "sr",
                  :rdf/value    "Српски ентитет"}
                 {:rdf/language "en",
                  :rdf/value    "Serbian entity"}},
   :skos/definition "sovereign state and polity that is Serbia"})

(def SloveneEntity
  {:db/ident :fibo-be-ge-seuj/SloveneEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Slovenia,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfSlovenia,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "sl",
                  :rdf/value    "Slovenska entiteta"}
                 {:rdf/language "en",
                  :rdf/value    "Slovene entity"}},
   :skos/definition "sovereign state and polity that is Slovenia"})

(def SpanishEntity
  {:db/ident :fibo-be-ge-seuj/SpanishEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Spain,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seuj/GovernmentOfTheKingdomOfSpain,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "Entidad española"}
                 {:rdf/language "en",
                  :rdf/value    "Spanish entity"}},
   :skos/definition "sovereign state and polity that is Spain"})

(def urn:uuid:43b2f732-4bd9-5cae-b97c-26689c3939bb
  {:cmns-av/copyright
   #{"Copyright (c) 2010-2023 EDM Council, Inc."
     "Copyright (c) 2010-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for countries that are defined as being part of Southern Europe in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Southern Europe Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   #{"The http://www.omg.org/spec/EDMC-FIBO/BE/20200801/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to address hygiene issues with diacritical marks that are language-specific."
     "The http://www.omg.org/spec/EDMC-FIBO/BE/20210201/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to replace references to Macedonia with NorthMacedonia from LCC 1.2."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."},
   :skos/scopeNote
   "The initial version of this ontology reflects the national level only.",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"})