(ns net.wikipunk.rdf.fibo-be-ge-seuj
  "This ontology provides government entities and jurisdictions for countries that are defined as being part of Southern Europe in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective."
  {:cmns-av/copyright ["Copyright (c) 2010-2023 EDM Council, Inc."
                       "Copyright (c) 2010-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for countries that are defined as being part of Southern Europe in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/GovernmentEntities/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdf/ns-prefix-map
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-ge-seuj",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Southern Europe Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The http://www.omg.org/spec/EDMC-FIBO/BE/20200801/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to address hygiene issues with diacritical marks that are language-specific."
    "The http://www.omg.org/spec/EDMC-FIBO/BE/20210201/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to replace references to Macedonia with NorthMacedonia from LCC 1.2."],
   :skos/scopeNote
   "The initial version of this ontology reflects the national level only."})

(def AlbanianEntity
  "sovereign state and polity that is Albania"
  {:db/ident :fibo-be-ge-seuj/AlbanianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Albania,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfAlbania,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Entiteti shqiptar@sq"
                #voc/lstr "Albanian entity@en"],
   :skos/definition "sovereign state and polity that is Albania"})

(def AndorranEntity
  "sovereign state and polity that is Andorra"
  {:db/ident :fibo-be-ge-seuj/AndorranEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Andorra,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seuj/GovernmentOfThePrincipalityOfAndorra,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Entitat andorrana@ca"
                #voc/lstr "Andorran entity@en"],
   :skos/definition "sovereign state and polity that is Andorra"})

(def BosnianAndHerzegovinianEntity
  "federal sovereignty state and polity that is Bosnia and Herzegovina"
  {:db/ident :fibo-be-ge-seuj/BosnianAndHerzegovinianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/BosniaAndHerzegovina,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seuj/GovernmentOfTheFederationOfBosniaAndHerzegovina,
   :rdf/type [:owl/NamedIndividual :fibo-be-ge-ge/FederatedSovereignty],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Bosanskohercegovački entitet@hr"
                #voc/lstr "Bosanskohercegovački entitet@bs"
                #voc/lstr "Босанскохерцеговачки ентитет@sr"
                #voc/lstr "Bosnian and Herzegovinian entity@en"],
   :skos/definition
   "federal sovereignty state and polity that is Bosnia and Herzegovina"})

(def CroatianEntity
  "sovereign state and polity that is Croatia"
  {:db/ident :fibo-be-ge-seuj/CroatianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Croatia,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfCroatia,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Hrvatski entitet@hr" #voc/lstr "Croatian entity@en"],
   :skos/definition "sovereign state and polity that is Croatia"})

(def GovernmentOfMontenegro
  "unitary, dominant-party, parliamentary constitutional republic that is located in South and Southeast Europe on the coast of the Balkans"
  {:db/ident :fibo-be-ge-seuj/GovernmentOfMontenegro,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfMontenegro,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Montenegro,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label #voc/lstr "Government of Montenegro@en",
   :rdfs/seeAlso ["http://www.gov.me/en/homepage/"],
   :skos/definition
   "unitary, dominant-party, parliamentary constitutional republic that is located in South and Southeast Europe on the coast of the Balkans"})

(def GovernmentOfTheFederationOfBosniaAndHerzegovina
  "federal parliamentary constitutional republic that is a representative democracy, located in South and Southeast Europe, within the Balkans"
  {:db/ident :fibo-be-ge-seuj/GovernmentOfTheFederationOfBosniaAndHerzegovina,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-seuj/JurisdictionOfBosniaAndHerzegovina,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/BosniaAndHerzegovina,
   :rdf/type [:owl/NamedIndividual :fibo-be-ge-ge/FederalGovernment],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr
                 "Government of the Federation of Bosnia and Herzegovina@en"
                #voc/lstr "Vlada Federacije Bosne i Hercegovine@hr"
                #voc/lstr "Влада Федерације Босне и Херцеговине@sr"
                #voc/lstr "Vlada Federacije Bosne i Hercegovine@bs"],
   :rdfs/seeAlso ["http://fbihvlada.gov.ba/english/"],
   :skos/definition
   "federal parliamentary constitutional republic that is a representative democracy, located in South and Southeast Europe, within the Balkans"})

(def GovernmentOfTheHellenicRepublic
  "unitary parliamentary republic, located on the Balkan Peninsula in Southeast Europe"
  {:db/ident :fibo-be-ge-seuj/GovernmentOfTheHellenicRepublic,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfGreece,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Greece,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Κυβέρνηση της Ελληνικής Δημοκρατίας@el"
                #voc/lstr "Government of the Hellenic Republic@en"],
   :rdfs/seeAlso
   ["https://www.mfa.gr/missionsabroad/en/about-greece/government-and-politics/"],
   :skos/definition
   "unitary parliamentary republic, located on the Balkan Peninsula in Southeast Europe"})

(def GovernmentOfTheHolySee
  "unitary Christian absolute monarchy (under an ecclesiastical and elective theocracy), headquartered in, operates from, and exercises 'exclusive dominion' over the independent Vatican City State enclave in Rome, of which the pope is sovereign, administered by the Roman Curia"
  {:cmns-av/synonym "Government of the See of Rome",
   :db/ident :fibo-be-ge-seuj/GovernmentOfTheHolySee,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfTheHolySee,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/HolySee,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Imperium in Consiliis Sanctae Sedis@la"
                #voc/lstr "Government of the Holy See@en"
                #voc/lstr "Governo della Santa Sede@it"],
   :rdfs/seeAlso ["http://www.vatican.va/content/vatican/en.html"],
   :skos/definition
   "unitary Christian absolute monarchy (under an ecclesiastical and elective theocracy), headquartered in, operates from, and exercises 'exclusive dominion' over the independent Vatican City State enclave in Rome, of which the pope is sovereign, administered by the Roman Curia"})

(def GovernmentOfTheKingdomOfSpain
  "unitary parliamentary constitutional monarchy, whose monarch is the head of state and prime minister is the head of government, located in Southwestern Europe with some pockets of territory across the Strait of Gibraltar and the Atlantic Ocean"
  {:db/ident :fibo-be-ge-seuj/GovernmentOfTheKingdomOfSpain,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfSpain,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Spain,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Government of the Kingdom of Spain@en"
                #voc/lstr "Gobierno del Reino de España@es"],
   :rdfs/seeAlso ["https://www.lamoncloa.gob.es/lang/en/Paginas/index.aspx"],
   :skos/definition
   "unitary parliamentary constitutional monarchy, whose monarch is the head of state and prime minister is the head of government, located in Southwestern Europe with some pockets of territory across the Strait of Gibraltar and the Atlantic Ocean"})

(def GovernmentOfThePortugueseRepublic
  "unitary, semi-presidential, constitutional, representative democratic republic, located mostly on the Iberian Peninsula, in southwestern Europe"
  {:db/ident :fibo-be-ge-seuj/GovernmentOfThePortugueseRepublic,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfPortugal,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Portugal,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Governo da República Portuguesa@pt"
                #voc/lstr "Government of the Portuguese Republic@en"],
   :rdfs/seeAlso ["https://www.portugal.gov.pt/en/gc21"],
   :skos/definition
   "unitary, semi-presidential, constitutional, representative democratic republic, located mostly on the Iberian Peninsula, in southwestern Europe"})

(def GovernmentOfThePrincipalityOfAndorra
  "unitary parliamentary semi-elective diarchy, a sovereign landlocked microstate on the Iberian Peninsula, in the eastern Pyrenees, bordered by France to the north and Spain to the south"
  {:db/ident :fibo-be-ge-seuj/GovernmentOfThePrincipalityOfAndorra,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfAndorra,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Andorra,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Government of the Principality of Andorra@en"
                #voc/lstr "Govern del Principat d’Andorra@ca"],
   :rdfs/seeAlso ["https://www.govern.ad/"],
   :skos/definition
   "unitary parliamentary semi-elective diarchy, a sovereign landlocked microstate on the Iberian Peninsula, in the eastern Pyrenees, bordered by France to the north and Spain to the south"})

(def GovernmentOfTheRepublicOfAlbania
  "unitary parliamentary constitutional republic, located in Southeast Europe on the Adriatic and Ionian Sea within the Mediterranean Sea"
  {:db/ident :fibo-be-ge-seuj/GovernmentOfTheRepublicOfAlbania,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfAlbania,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Albania,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Qeveria e Republikës së Shqipërisë@sq"
                #voc/lstr "Government of the Republic of Albania@en"],
   :rdfs/seeAlso ["http://parlament.al/"],
   :skos/definition
   "unitary parliamentary constitutional republic, located in Southeast Europe on the Adriatic and Ionian Sea within the Mediterranean Sea"})

(def GovernmentOfTheRepublicOfCroatia
  "unitary parliamentary constitutional republic, located in Southeast Europe, bordering Slovenia to the northwest, Hungary to the northeast, Serbia to the east, Bosnia and Herzegovina, and Montenegro to the southeast, sharing a maritime border with Italy"
  {:db/ident :fibo-be-ge-seuj/GovernmentOfTheRepublicOfCroatia,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfCroatia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Croatia,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Vlada Republike Hrvatske@hr"
                #voc/lstr "Government of the Republic of Croatia@en"],
   :rdfs/seeAlso ["https://vlada.gov.hr/"],
   :skos/definition
   "unitary parliamentary constitutional republic, located in Southeast Europe, bordering Slovenia to the northwest, Hungary to the northeast, Serbia to the east, Bosnia and Herzegovina, and Montenegro to the southeast, sharing a maritime border with Italy"})

(def GovernmentOfTheRepublicOfItaly
  "unitary parliamentary, constitutional, democratic republic, consisting of a peninsula bordering the Alps and surrounded by several islands, located in south-central Europe"
  {:db/ident :fibo-be-ge-seuj/GovernmentOfTheRepublicOfItaly,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfItaly,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Italy,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Governo della Repubblica Italiana@it"
                #voc/lstr "Government of the Republic of Italy@en"],
   :rdfs/seeAlso ["http://www.governo.it/"],
   :skos/definition
   "unitary parliamentary, constitutional, democratic republic, consisting of a peninsula bordering the Alps and surrounded by several islands, located in south-central Europe"})

(def GovernmentOfTheRepublicOfMalta
  "unitary parliamentary constitutional republic modelled on the Westminster system that is a Southern European island country consisting of an archipelago in the Mediterranean Sea"
  {:db/ident :fibo-be-ge-seuj/GovernmentOfTheRepublicOfMalta,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfMalta,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Malta,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label #voc/lstr "Government of the Republic of Malta@en",
   :rdfs/seeAlso ["https://www.gov.mt/"],
   :skos/definition
   "unitary parliamentary constitutional republic modelled on the Westminster system that is a Southern European island country consisting of an archipelago in the Mediterranean Sea"})

(def GovernmentOfTheRepublicOfNorthMacedonia
  "unitary parliamentary, constitutional, democratic republic, located in the Balkan Peninsula in Southeast Europe"
  {:db/ident :fibo-be-ge-seuj/GovernmentOfTheRepublicOfNorthMacedonia,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfNorthMacedonia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/NorthMacedonia,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Влада на Република Северна Македонија@mk"
                #voc/lstr "Government of the Republic of North Macedonia@en"],
   :rdfs/seeAlso ["https://vlada.mk/"],
   :skos/definition
   "unitary parliamentary, constitutional, democratic republic, located in the Balkan Peninsula in Southeast Europe"})

(def GovernmentOfTheRepublicOfSanMarino
  "unitary parliamentary, diarchic, directorial republic that is a microstate in Southern Europe, completely surrounded by Italy, located on the northeastern side of the Apennine Mountains"
  {:db/ident :fibo-be-ge-seuj/GovernmentOfTheRepublicOfSanMarino,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfSanMarino,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/SanMarino,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Governo della Repubblica di San Marino@it"
                #voc/lstr "Government of the Republic of San Marino@en"],
   :rdfs/seeAlso ["http://www.sanmarino.sm/on-line/en/home.html"],
   :skos/definition
   "unitary parliamentary, diarchic, directorial republic that is a microstate in Southern Europe, completely surrounded by Italy, located on the northeastern side of the Apennine Mountains"})

(def GovernmentOfTheRepublicOfSerbia
  "unitary, dominant-party, parliamentary constitutional republic that is situated at the crossroads of Central and Southeast Europe in the southern Pannonian Plain and the central Balkans"
  {:db/ident :fibo-be-ge-seuj/GovernmentOfTheRepublicOfSerbia,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfSerbia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Serbia,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Влада Републике Србије@sr"
                #voc/lstr "Government of the Republic of Serbia@en"],
   :rdfs/seeAlso ["https://www.srbija.gov.rs/"],
   :skos/definition
   "unitary, dominant-party, parliamentary constitutional republic that is situated at the crossroads of Central and Southeast Europe in the southern Pannonian Plain and the central Balkans"})

(def GovernmentOfTheRepublicOfSlovenia
  "unitary, parliamentary constitutional republic bordered by Italy to the west, Austria to the north, Hungary to the northeast, Croatia to the southeast, and the Adriatic Sea to the southwest"
  {:db/ident :fibo-be-ge-seuj/GovernmentOfTheRepublicOfSlovenia,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seuj/JurisdictionOfSlovenia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Slovenia,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Vlada Republike Slovenije@sl"
                #voc/lstr "Government of the Republic of Slovenia@en"],
   :rdfs/seeAlso ["https://www.gov.si/"],
   :skos/definition
   "unitary, parliamentary constitutional republic bordered by Italy to the west, Austria to the north, Hungary to the northeast, Croatia to the southeast, and the Adriatic Sea to the southwest"})

(def GreekEntity
  "sovereign state and polity that is Greece"
  {:db/ident :fibo-be-ge-seuj/GreekEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Greece,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seuj/GovernmentOfTheHellenicRepublic,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Ελληνική οντότητα@el" #voc/lstr "Greek entity@en"],
   :skos/definition "sovereign state and polity that is Greece"})

(def HolySeeEntity
  "sovereign state and polity that is the Holy See"
  {:db/ident :fibo-be-ge-seuj/HolySeeEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/HolySee,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-seuj/GovernmentOfTheHolySee,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Holy See entity@en"
                #voc/lstr "Entità della Santa Sede@it"],
   :skos/definition "sovereign state and polity that is the Holy See"})

(def ItalianEntity
  "sovereign state and polity that is Italy"
  {:db/ident :fibo-be-ge-seuj/ItalianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Italy,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfItaly,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Italian entity@en" #voc/lstr "Ente italiano@it"],
   :skos/definition "sovereign state and polity that is Italy"})

(def JurisdictionOfAlbania
  "jurisdiction of the judiciary of Albania, a system of courts that includes the supreme court, constitutional court, appeal court and administrative court, and whose Supreme Court of the Republic of Albania is the highest court and is the final court of appeal"
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfAlbania,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfAlbania,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Albania,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "jurisdiction of Albania@en"
                #voc/lstr "juridiksioni i Shqipërisë@sq"],
   :rdfs/seeAlso ["https://en.wikipedia.org/wiki/Supreme_Court_of_Albania"],
   :skos/definition
   "jurisdiction of the judiciary of Albania, a system of courts that includes the supreme court, constitutional court, appeal court and administrative court, and whose Supreme Court of the Republic of Albania is the highest court and is the final court of appeal"})

(def JurisdictionOfAndorra
  "jurisdiction of the judiciary of Andorra, composed of the Magistrates Court, the Criminal Law Court, the High Court of Andorra, and the Constitutional Court"
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfAndorra,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seuj/GovernmentOfThePrincipalityOfAndorra,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Andorra,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "jurisdiction of Andorra@en"
                #voc/lstr "jurisdicció d’Andorra@ca"],
   :skos/definition
   "jurisdiction of the judiciary of Andorra, composed of the Magistrates Court, the Criminal Law Court, the High Court of Andorra, and the Constitutional Court"})

(def JurisdictionOfBosniaAndHerzegovina
  "jurisdiction of the judiciary of Bosnia and Herzegovina, whose Constitutional Court of Bosnia and Herzegovina is the supreme, final arbiter of legal matters"
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfBosniaAndHerzegovina,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seuj/GovernmentOfTheFederationOfBosniaAndHerzegovina,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/BosniaAndHerzegovina,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-law-jur/Jurisdiction],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "надлежност Босне и Херцеговине@sr"
                #voc/lstr "nadležnost Bosne i Hercegovine@hr"
                #voc/lstr "nadležnost Bosne i Hercegovine@bs"
                #voc/lstr "jurisdiction of Bosnia and Herzegovina@en"],
   :rdfs/seeAlso
   ["http://www.mpr.gov.ba/organizacija_nadleznosti/pravosudje/Default.aspx"],
   :skos/definition
   "jurisdiction of the judiciary of Bosnia and Herzegovina, whose Constitutional Court of Bosnia and Herzegovina is the supreme, final arbiter of legal matters"})

(def JurisdictionOfCroatia
  "jurisdiction of the judiciary of Croatia, a civil law legal system in which law arises primarily from written statutes, influenced by German and Austrian legal systems, whose national courts include the Constitutional Court, which oversees violations of the Constitution, and the Supreme Court, which is the highest court of appeal"
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfCroatia,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfCroatia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Croatia,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "nadležnost Hrvatske@hr"
                #voc/lstr "jurisdiction of Croatia@en"],
   :rdfs/seeAlso ["https://www.usud.hr/"],
   :skos/definition
   "jurisdiction of the judiciary of Croatia, a civil law legal system in which law arises primarily from written statutes, influenced by German and Austrian legal systems, whose national courts include the Constitutional Court, which oversees violations of the Constitution, and the Supreme Court, which is the highest court of appeal"})

(def JurisdictionOfGreece
  "jurisdiction of the judiciary of the Hellenic Republic, whose supreme courts include the Court of Cassation, the Council of State and the Court of Auditors"
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfGreece,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seuj/GovernmentOfTheHellenicRepublic,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Greece,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "δικαιοδοσία της Ελλάδας@el"
                #voc/lstr "jurisdiction of Greece@en"],
   :rdfs/seeAlso
   ["https://www.mfa.gr/missionsabroad/en/about-greece/government-and-politics/judicial-power.html"],
   :skos/definition
   "jurisdiction of the judiciary of the Hellenic Republic, whose supreme courts include the Court of Cassation, the Council of State and the Court of Auditors"})

(def JurisdictionOfItaly
  "jurisdiction of the judiciary of Italy, a system of courts that is based on Roman law modified by the Napoleonic code and later statutes, comprising the Supreme Court of Cassation, the highest court in Italy for both criminal and civil appeal cases, and the Constitutional Court of Italy (Corte Costituzionale)"
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfItaly,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfItaly,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Italy,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "jurisdiction of Italy@en"
                #voc/lstr "giurisdizione dell'Italia@it"],
   :skos/definition
   "jurisdiction of the judiciary of Italy, a system of courts that is based on Roman law modified by the Napoleonic code and later statutes, comprising the Supreme Court of Cassation, the highest court in Italy for both criminal and civil appeal cases, and the Constitutional Court of Italy (Corte Costituzionale)"})

(def JurisdictionOfMalta
  "jurisdiction of the judiciary of Malta, which is based partially on English law and partly on Continental law, that interprets and applies the laws of Malta to ensure equal justice under law, and to provide a mechanism for dispute resolution"
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfMalta,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfMalta,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Malta,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label #voc/lstr "jurisdiction of Malta@en",
   :rdfs/seeAlso
   ["https://justice.gov.mt/en/justice/Pages/The-Judiciary-in-Malta.aspx"],
   :skos/definition
   "jurisdiction of the judiciary of Malta, which is based partially on English law and partly on Continental law, that interprets and applies the laws of Malta to ensure equal justice under law, and to provide a mechanism for dispute resolution"})

(def JurisdictionOfMontenegro
  "jurisdiction of the judiciary of Montenegro, that interprets and applies the laws of Montenegro, and has been working with the European Union over the last several years to increase judicial independence and accountability"
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfMontenegro,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-seuj/GovernmentOfMontenegro,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Montenegro,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label #voc/lstr "jurisdiction of Montenegro@en",
   :skos/definition
   "jurisdiction of the judiciary of Montenegro, that interprets and applies the laws of Montenegro, and has been working with the European Union over the last several years to increase judicial independence and accountability"})

(def JurisdictionOfNorthMacedonia
  "jurisdiction of the judiciary of North Macedonia, an independent judicial branch that includes a constitutional court"
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfNorthMacedonia,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfNorthMacedonia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/NorthMacedonia,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "јурисдикција на Северна Македонија@mk"
                #voc/lstr "jurisdiction of North Macedonia@en"],
   :rdfs/seeAlso
   ["https://www.sobranie.mk/the-constitution-of-the-republic-of-macedonia-ns_article-constitution-of-the-republic-of-north-macedonia.nspx"],
   :skos/definition
   "jurisdiction of the judiciary of North Macedonia, an independent judicial branch that includes a constitutional court"})

(def JurisdictionOfPortugal
  "jurisdiction of the judiciary of Portugal, a system of courts that together constitute one of the four organs of Sovereignty as defined by the Portuguese Constitution"
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfPortugal,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seuj/GovernmentOfThePortugueseRepublic,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Portugal,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "jurisdição de portugal@pt"
                #voc/lstr "jurisdiction of Portugal@en"],
   :rdfs/seeAlso ["https://en.wikipedia.org/wiki/Judiciary_of_Portugal"],
   :skos/definition
   "jurisdiction of the judiciary of Portugal, a system of courts that together constitute one of the four organs of Sovereignty as defined by the Portuguese Constitution"})

(def JurisdictionOfSanMarino
  "jurisdiction of the judiciary of San Marino, including the Council of Twelve, which forms the judicial branch during the period of legislature of the Council"
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfSanMarino,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfSanMarino,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/SanMarino,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "jurisdiction of San Marino@en"
                #voc/lstr "giurisdizione di San Marino@it"],
   :skos/definition
   "jurisdiction of the judiciary of San Marino, including the Council of Twelve, which forms the judicial branch during the period of legislature of the Council"})

(def JurisdictionOfSerbia
  "jurisdiction of the judiciary of Serbia, a three-tiered judicial system that includes the Supreme Court of Cassation as the court of the last resort, Courts of Appeal as the appellate instance, and Basic and High courts as the general jurisdictions at first instance"
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfSerbia,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfSerbia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Serbia,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "надлежност Србије@sr"
                #voc/lstr "jurisdiction of Serbia@en"],
   :skos/definition
   "jurisdiction of the judiciary of Serbia, a three-tiered judicial system that includes the Supreme Court of Cassation as the court of the last resort, Courts of Appeal as the appellate instance, and Basic and High courts as the general jurisdictions at first instance"})

(def JurisdictionOfSlovenia
  "jurisdiction of the judiciary of Slovenia, a system of courts with general responsibilities and specialised courts that deal with matters relating to specific legal areas, including a Constitutional Court at the highest level"
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfSlovenia,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfSlovenia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Slovenia,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "pristojnost Slovenije@sl"
                #voc/lstr "jurisdiction of Slovenia@en"],
   :rdfs/seeAlso ["http://www.sodisce.si/"],
   :skos/definition
   "jurisdiction of the judiciary of Slovenia, a system of courts with general responsibilities and specialised courts that deal with matters relating to specific legal areas, including a Constitutional Court at the highest level"})

(def JurisdictionOfSpain
  "jurisdiction of judiciary of Spain, a system of courts that includes senior judges - the President and judges of the Constitutional Court (the highest tribunal in the Kingdom) - that interprets and applies the law in Spain"
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfSpain,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seuj/GovernmentOfTheKingdomOfSpain,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Spain,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "jurisdiction of Spain@en"
                #voc/lstr "jurisdicción de España@es"],
   :rdfs/seeAlso ["http://www.poderjudicial.es/cgpj/es/Poder_Judicial"],
   :skos/definition
   "jurisdiction of judiciary of Spain, a system of courts that includes senior judges - the President and judges of the Constitutional Court (the highest tribunal in the Kingdom) - that interprets and applies the law in Spain"})

(def JurisdictionOfTheHolySee
  "jurisdiction of the Bishop of Rome, known as the pope, which includes the apostolic episcopal see of the Diocese of Rome with universal ecclesiastical jurisdiction of the worldwide Catholic Church, as well as a sovereign entity of international law, governing the Vatican City"
  {:db/ident :fibo-be-ge-seuj/JurisdictionOfTheHolySee,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-seuj/GovernmentOfTheHolySee,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/HolySee,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "jurisdiction of the Holy See@en"
                #voc/lstr "ius proprium Sanctae Sedis@la"
                #voc/lstr "giurisdizione della Santa Sede@it"],
   :skos/definition
   "jurisdiction of the Bishop of Rome, known as the pope, which includes the apostolic episcopal see of the Diocese of Rome with universal ecclesiastical jurisdiction of the worldwide Catholic Church, as well as a sovereign entity of international law, governing the Vatican City"})

(def MalteseEntity
  "sovereign state and polity that is Malta"
  {:db/ident :fibo-be-ge-seuj/MalteseEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Malta,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfMalta,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label #voc/lstr "Maltese entity@en",
   :skos/definition "sovereign state and polity that is Malta"})

(def MontenegrinEntity
  "sovereign state and polity that is Montenegro"
  {:db/ident :fibo-be-ge-seuj/MontenegrinEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Montenegro,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-seuj/GovernmentOfMontenegro,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label #voc/lstr "Montenegrin entity@en",
   :skos/definition "sovereign state and polity that is Montenegro"})

(def NorthMacedonianEntity
  "sovereign state and polity that is North Macedonia"
  {:db/ident :fibo-be-ge-seuj/NorthMacedonianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/NorthMacedonia,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfNorthMacedonia,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Северномакедонски субјект@mk"
                #voc/lstr "North Macedonian entity@en"],
   :skos/definition "sovereign state and polity that is North Macedonia"})

(def PortugueseEntity
  "sovereign state and polity that is Portugal"
  {:db/ident :fibo-be-ge-seuj/PortugueseEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Portugal,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seuj/GovernmentOfThePortugueseRepublic,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Portuguese entity@en"
                #voc/lstr "Entidade portuguesa@pt"],
   :skos/definition "sovereign state and polity that is Portugal"})

(def SammarineseEntity
  "sovereign state and polity that is San Marino"
  {:db/ident :fibo-be-ge-seuj/SammarineseEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/SanMarino,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfSanMarino,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Sammarinese entity@en"
                #voc/lstr "Ente sammarinese@it"],
   :skos/definition "sovereign state and polity that is San Marino"})

(def SerbianEntity
  "sovereign state and polity that is Serbia"
  {:db/ident :fibo-be-ge-seuj/SerbianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Serbia,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfSerbia,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Српски ентитет@sr" #voc/lstr "Serbian entity@en"],
   :skos/definition "sovereign state and polity that is Serbia"})

(def SloveneEntity
  "sovereign state and polity that is Slovenia"
  {:db/ident :fibo-be-ge-seuj/SloveneEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Slovenia,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seuj/GovernmentOfTheRepublicOfSlovenia,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Slovenska entiteta@sl"
                #voc/lstr "Slovene entity@en"],
   :skos/definition "sovereign state and polity that is Slovenia"})

(def SpanishEntity
  "sovereign state and polity that is Spain"
  {:db/ident :fibo-be-ge-seuj/SpanishEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Spain,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seuj/GovernmentOfTheKingdomOfSpain,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Spanish entity@en" #voc/lstr "Entidad española@es"],
   :skos/definition "sovereign state and polity that is Spain"})