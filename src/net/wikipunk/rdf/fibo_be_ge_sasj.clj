(ns net.wikipunk.rdf.fibo-be-ge-sasj
  "This ontology provides government entities and jurisdictions for countries that are defined as being part of Southern Asia in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective."
  {:cmns-av/copyright ["Copyright (c) 2021-2023 EDM Council, Inc."
                       "Copyright (c) 2021-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for countries that are defined as being part of Southern Asia in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/GovernmentEntities/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-ge-ge"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/",
    "fibo-be-ge-sasj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
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
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfa/prefix "fibo-be-ge-sasj",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Southern Asia Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary.",
   :skos/scopeNote
   "The initial version of this ontology reflects the national level only."})

(def GovernmentOfTheDemocraticSocialistRepublicOfSriLanka
  "unitary semi-presidential constitutional republic in Southern Asia that is an island country situated on the Indian Ocean, southwest of the Bay of Bengal, and southeast of the Arabian Sea"
  {:db/ident
   :fibo-be-ge-sasj/GovernmentOfTheDemocraticSocialistRepublicOfSriLanka,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-sasj/JurisdictionOfSriLanka,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/SriLanka,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label
   [{:rdf/language "si",
     :rdf/value    "ශ්‍රී ලංකා ප්‍රජාතාන්ත්‍රික සමාජවාදී ජනරජය"}
    {:rdf/language "en",
     :rdf/value
     "Government of the Democratic Socialist Republic of Sri Lanka"}],
   :rdfs/seeAlso ["http://www.gov.lk/"],
   :skos/definition
   "unitary semi-presidential constitutional republic in Southern Asia that is an island country situated on the Indian Ocean, southwest of the Bay of Bengal, and southeast of the Arabian Sea"})

(def GovernmentOfTheFederalDemocraticRepublicOfNepal
  "federal parliamentary republic in Southern Asia, mainly situated in the Himalayas, bordering Tibet of China to the north, and India in the south, east, and west"
  {:db/ident :fibo-be-ge-sasj/GovernmentOfTheFederalDemocraticRepublicOfNepal,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-sasj/JurisdictionOfNepal,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Nepal,
   :rdf/type [:fibo-be-ge-ge/FederalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "ne",
                 :rdf/value    "सङ्घीय लोकतान्त्रिक गणतन्त्र नेपाल"}
                {:rdf/language "en",
                 :rdf/value
                 "Government of the Federal Democratic Republic of Nepal"}],
   :skos/definition
   "federal parliamentary republic in Southern Asia, mainly situated in the Himalayas, bordering Tibet of China to the north, and India in the south, east, and west"})

(def GovernmentOfTheIslamicRepublicOfAfghanistan
  "unitary presidential Islamic republic in Southern Asia, bordered by Pakistan to the east and south, Iran to the west, Turkmenistan, Uzbekistan, and Tajikistan to the north, and China to the northeast"
  {:db/ident :fibo-be-ge-sasj/GovernmentOfTheIslamicRepublicOfAfghanistan,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-sasj/JurisdictionOfAfghanistan,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Afghanistan,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value "Government of the Islamic Republic of Afghanistan"}
                {:rdf/language "ps",
                 :rdf/value    "Da Afġānistān Islāmī Jumhoryat"}],
   :rdfs/seeAlso ["https://en.wikipedia.org/wiki/Politics_of_Afghanistan"],
   :skos/definition
   "unitary presidential Islamic republic in Southern Asia, bordered by Pakistan to the east and south, Iran to the west, Turkmenistan, Uzbekistan, and Tajikistan to the north, and China to the northeast"})

(def GovernmentOfTheIslamicRepublicOfIran
  "unitary Khomeinist presidential Islamic republic in Southern Asia, bordered to the northwest by Armenia and Azerbaijan, to the north by the Caspian Sea, to the northeast by Turkmenistan, to the east by Afghanistan, to the southeast by Pakistan, to the south by the Persian Gulf and the Gulf of Oman, and to the west by Turkey and Iraq"
  {:db/ident :fibo-be-ge-sasj/GovernmentOfTheIslamicRepublicOfIran,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-sasj/JurisdictionOfIran,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Iran,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "fa",
                 :rdf/value    "جمهوری اسلامی ایران"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Islamic Republic of Iran"}],
   :rdfs/seeAlso ["http://www.icana.ir/"],
   :skos/definition
   "unitary Khomeinist presidential Islamic republic in Southern Asia, bordered to the northwest by Armenia and Azerbaijan, to the north by the Caspian Sea, to the northeast by Turkmenistan, to the east by Afghanistan, to the southeast by Pakistan, to the south by the Persian Gulf and the Gulf of Oman, and to the west by Turkey and Iraq"})

(def GovernmentOfTheIslamicRepublicOfPakistan
  "federal parliamentary constitutional republic in Southern Asia, bordered by India to the east, Afghanistan to the west, Iran to the southwest, and China to the northeast"
  {:db/ident :fibo-be-ge-sasj/GovernmentOfTheIslamicRepublicOfPakistan,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-sasj/JurisdictionOfPakistan,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Pakistan,
   :rdf/type [:fibo-be-ge-ge/FederalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "ur",
                 :rdf/value    "اِسلامی جمہوریہ پاكِستان"}
                {:rdf/language "en",
                 :rdf/value "Government of the Islamic Republic of Pakistan"}],
   :rdfs/seeAlso ["http://www.pakistan.gov.pk/"],
   :skos/definition
   "federal parliamentary constitutional republic in Southern Asia, bordered by India to the east, Afghanistan to the west, Iran to the southwest, and China to the northeast"})

(def GovernmentOfTheKingdomOfBhutan
  "unitary parliamentary constitutional monarchy in Southern Asia, bordered by China to the north and India to the south"
  {:db/ident :fibo-be-ge-sasj/GovernmentOfTheKingdomOfBhutan,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-sasj/JurisdictionOfBhutan,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Bhutan,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "dz",
                 :rdf/value    "འབྲུག་རྒྱལ་ཁབ་"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Kingdom of Bhutan"}],
   :skos/definition
   "unitary parliamentary constitutional monarchy in Southern Asia, bordered by China to the north and India to the south"})

(def GovernmentOfThePeoplesRepublicOfBangladesh
  "unitary dominant-party parliamentary constitutional republic in Southern Asia, bordered by India to the west, north, and east, Myanmar to the southeast, and the Bay of Bengal to the south"
  {:db/ident :fibo-be-ge-sasj/GovernmentOfThePeoplesRepublicOfBangladesh,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-sasj/JurisdictionOfBangladesh,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Bangladesh,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "bn",
                 :rdf/value    "গণপ্রজাতন্ত্রী বাংলাদেশ"}
                {:rdf/language "en",
                 :rdf/value
                 "Government of the People's Republic of Bangladesh"}],
   :rdfs/seeAlso ["http://bangladesh.gov.bd/"],
   :skos/definition
   "unitary dominant-party parliamentary constitutional republic in Southern Asia, bordered by India to the west, north, and east, Myanmar to the southeast, and the Bay of Bengal to the south"})

(def GovernmentOfTheRepublicOfIndia
  "federal parliamentary constitutional and democratic republic in Southern Asia, bordered by the Indian Ocean on the south, the Arabian Sea on the southwest, and the Bay of Bengal on the southeast, it shares land borders with Pakistan to the northwest; China, Nepal, and Bhutan to the north; and Bangladesh and Myanmar to the east"
  {:db/ident :fibo-be-ge-sasj/GovernmentOfTheRepublicOfIndia,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-sasj/JurisdictionOfIndia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/India,
   :rdf/type [:fibo-be-ge-ge/FederalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Government of the Republic of India"}
                {:rdf/language "hi",
                 :rdf/value    "Bhārat Gaṇarājya"}],
   :rdfs/seeAlso ["http://parliamentofindia.nic.in/"],
   :skos/definition
   "federal parliamentary constitutional and democratic republic in Southern Asia, bordered by the Indian Ocean on the south, the Arabian Sea on the southwest, and the Bay of Bengal on the southeast, it shares land borders with Pakistan to the northwest; China, Nepal, and Bhutan to the north; and Bangladesh and Myanmar to the east"})

(def GovernmentOfTheRepublicOfMaldives
  "unitary presidential republic in Southern Asia, a small archipelagic state situated in the Indian Ocean"
  {:db/ident :fibo-be-ge-sasj/GovernmentOfTheRepublicOfMaldives,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-sasj/JurisdictionOfMaldives,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Maldives,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "dv",
                 :rdf/value    "ދިވެހިރާއްޖެ"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Republic of Maldives"}],
   :skos/definition
   "unitary presidential republic in Southern Asia, a small archipelagic state situated in the Indian Ocean"})

(def JurisdictionOfAfghanistan
  "jurisdiction of the judiciary of Afghanistan, which is the system of courts, including its Supreme Court or Stera Mahkama, that interprets and applies the law in Afghanistan"
  {:db/ident :fibo-be-ge-sasj/JurisdictionOfAfghanistan,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-sasj/GovernmentOfTheIslamicRepublicOfAfghanistan,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Afghanistan,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of Afghanistan",
   :rdfs/seeAlso ["http://supremecourt.gov.af/en"],
   :skos/definition
   "jurisdiction of the judiciary of Afghanistan, which is the system of courts, including its Supreme Court or Stera Mahkama, that interprets and applies the law in Afghanistan"})

(def JurisdictionOfBangladesh
  "jurisdiction of the judiciary of Bangladesh, which is the system of courts, including its Supreme Court, High Court, and Appellate Divisions, that interprets and applies the law in Bangladesh"
  {:db/ident :fibo-be-ge-sasj/JurisdictionOfBangladesh,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-sasj/GovernmentOfThePeoplesRepublicOfBangladesh,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Bangladesh,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of Bangladesh",
   :rdfs/seeAlso ["http://supremecourt.gov.bd/"],
   :skos/definition
   "jurisdiction of the judiciary of Bangladesh, which is the system of courts, including its Supreme Court, High Court, and Appellate Divisions, that interprets and applies the law in Bangladesh"})

(def JurisdictionOfBhutan
  "jurisdiction of the judiciary of Bhutan, which is the system of courts that interprets and applies the law in Bhutan"
  {:db/ident :fibo-be-ge-sasj/JurisdictionOfBhutan,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-sasj/GovernmentOfTheKingdomOfBhutan,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Bhutan,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of Bhutan",
   :skos/definition
   "jurisdiction of the judiciary of Bhutan, which is the system of courts that interprets and applies the law in Bhutan"})

(def JurisdictionOfIndia
  "jurisdiction of the judiciary of India, a three-tier unitary independent judiciary comprising the supreme court, headed by the Chief Justice of India, 25 high courts, and a large number of trial courts, which is the system of courts that interprets and applies the law in India"
  {:db/ident :fibo-be-ge-sasj/JurisdictionOfIndia,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-sasj/GovernmentOfTheRepublicOfIndia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/India,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of India",
   :skos/definition
   "jurisdiction of the judiciary of India, a three-tier unitary independent judiciary comprising the supreme court, headed by the Chief Justice of India, 25 high courts, and a large number of trial courts, which is the system of courts that interprets and applies the law in India"})

(def JurisdictionOfIran
  "jurisdiction of the judiciary of India, which is the system of courts that interprets and applies the law in Iran"
  {:db/ident :fibo-be-ge-sasj/JurisdictionOfIran,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-sasj/GovernmentOfTheIslamicRepublicOfIran,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Iran,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of Iran",
   :skos/definition
   "jurisdiction of the judiciary of India, which is the system of courts that interprets and applies the law in Iran"})

(def JurisdictionOfMaldives
  "jurisdiction of the judiciary of Maldives, which is the system of courts that interprets and applies the law in Maldives"
  {:db/ident :fibo-be-ge-sasj/JurisdictionOfMaldives,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-sasj/GovernmentOfTheRepublicOfMaldives,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Maldives,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of Maldives",
   :skos/definition
   "jurisdiction of the judiciary of Maldives, which is the system of courts that interprets and applies the law in Maldives"})

(def JurisdictionOfNepal
  "jurisdiction of the judiciary of Nepal, which is the system of courts, including the Supreme Court, that interprets and applies the law in Nepal"
  {:db/ident :fibo-be-ge-sasj/JurisdictionOfNepal,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-sasj/GovernmentOfTheFederalDemocraticRepublicOfNepal,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Nepal,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of Nepal",
   :skos/definition
   "jurisdiction of the judiciary of Nepal, which is the system of courts, including the Supreme Court, that interprets and applies the law in Nepal"})

(def JurisdictionOfPakistan
  "jurisdiction of the judiciary of Pakistan, which is the system of courts that interprets and applies the law in Pakistan"
  {:db/ident :fibo-be-ge-sasj/JurisdictionOfPakistan,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-sasj/GovernmentOfTheIslamicRepublicOfPakistan,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Pakistan,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of Pakistan",
   :skos/definition
   "jurisdiction of the judiciary of Pakistan, which is the system of courts that interprets and applies the law in Pakistan"})

(def JurisdictionOfSriLanka
  "jurisdiction of the judiciary of Sri Lanka, which is the system of courts that interprets and applies the law in Sri Lanka"
  {:db/ident :fibo-be-ge-sasj/JurisdictionOfSriLanka,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-sasj/GovernmentOfTheDemocraticSocialistRepublicOfSriLanka,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/SriLanka,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of Sri Lanka",
   :skos/definition
   "jurisdiction of the judiciary of Sri Lanka, which is the system of courts that interprets and applies the law in Sri Lanka"})

(def StateOfAfghanistan
  "sovereign state and polity that is Afghanistan"
  {:db/ident :fibo-be-ge-sasj/StateOfAfghanistan,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Afghanistan,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-sasj/GovernmentOfTheIslamicRepublicOfAfghanistan,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of Afghanistan",
   :skos/definition "sovereign state and polity that is Afghanistan"})

(def StateOfBangladesh
  "sovereign state and polity that is Bangladesh"
  {:db/ident :fibo-be-ge-sasj/StateOfBangladesh,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Bangladesh,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-sasj/GovernmentOfThePeoplesRepublicOfBangladesh,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of Bangladesh",
   :skos/definition "sovereign state and polity that is Bangladesh"})

(def StateOfBhutan
  "sovereign state and polity that is Bhutan"
  {:db/ident :fibo-be-ge-sasj/StateOfBhutan,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Bhutan,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-sasj/GovernmentOfTheKingdomOfBhutan,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of Bhutan",
   :skos/definition "sovereign state and polity that is Bhutan"})

(def StateOfIndia
  "federated sovereignty and polity that is India"
  {:db/ident :fibo-be-ge-sasj/StateOfIndia,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/India,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-sasj/GovernmentOfTheRepublicOfIndia,
   :rdf/type [:fibo-be-ge-ge/FederatedSovereignty :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of India",
   :skos/definition "federated sovereignty and polity that is India"})

(def StateOfIran
  "sovereign state and polity that is Iran"
  {:db/ident :fibo-be-ge-sasj/StateOfIran,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Iran,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-sasj/GovernmentOfTheIslamicRepublicOfIran,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of Iran",
   :skos/definition "sovereign state and polity that is Iran"})

(def StateOfMaldives
  "sovereign state and polity that is Maldives"
  {:db/ident :fibo-be-ge-sasj/StateOfMaldives,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Maldives,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-sasj/GovernmentOfTheRepublicOfMaldives,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of Maldives",
   :skos/definition "sovereign state and polity that is Maldives"})

(def StateOfNepal
  "federated sovereignty and polity that is Nepal"
  {:db/ident :fibo-be-ge-sasj/StateOfNepal,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Nepal,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-sasj/GovernmentOfTheFederalDemocraticRepublicOfNepal,
   :rdf/type [:fibo-be-ge-ge/FederatedSovereignty :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of Nepal",
   :skos/definition "federated sovereignty and polity that is Nepal"})

(def StateOfPakistan
  "federated sovereignty and polity that is Pakistan"
  {:db/ident :fibo-be-ge-sasj/StateOfPakistan,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Pakistan,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-sasj/GovernmentOfTheIslamicRepublicOfPakistan,
   :rdf/type [:fibo-be-ge-ge/FederatedSovereignty :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of Pakistan",
   :skos/definition "federated sovereignty and polity that is Pakistan"})

(def StateOfSriLanka
  "sovereign state and polity that is Sri Lanka"
  {:db/ident :fibo-be-ge-sasj/StateOfSriLanka,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/SriLanka,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-sasj/GovernmentOfTheDemocraticSocialistRepublicOfSriLanka,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of Sri Lanka",
   :skos/definition "sovereign state and polity that is Sri Lanka"})