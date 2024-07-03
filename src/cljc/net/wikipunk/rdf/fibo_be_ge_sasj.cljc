(ns net.wikipunk.rdf.fibo-be-ge-sasj
  {:cmns-av/copyright
   #{"Copyright (c) 2021-2023 EDM Council, Inc."
     "Copyright (c) 2021-2023 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for countries that are defined as being part of Southern Asia in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
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
   :owl/imports
   #{{:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-ge-sasj",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Southern Asia Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary.",
   :skos/scopeNote
   "The initial version of this ontology reflects the national level only.",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"})

(def GovernmentOfTheDemocraticSocialistRepublicOfSriLanka
  {:db/ident
   :fibo-be-ge-sasj/GovernmentOfTheDemocraticSocialistRepublicOfSriLanka,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-sasj/JurisdictionOfSriLanka,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/SriLanka,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label
   #{{:rdf/language "en",
      :rdf/value "Government of the Democratic Socialist Republic of Sri Lanka"}
     {:rdf/language "si",
      :rdf/value    "ශ්‍රී ලංකා ප්‍රජාතාන්ත්‍රික සමාජවාදී ජනරජය"}},
   :rdfs/seeAlso {:xsd/anyURI "http://www.gov.lk/"},
   :skos/definition
   "unitary semi-presidential constitutional republic in Southern Asia that is an island country situated on the Indian Ocean, southwest of the Bay of Bengal, and southeast of the Arabian Sea"})

(def GovernmentOfTheFederalDemocraticRepublicOfNepal
  {:db/ident :fibo-be-ge-sasj/GovernmentOfTheFederalDemocraticRepublicOfNepal,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-sasj/JurisdictionOfNepal,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Nepal,
   :rdf/type #{:fibo-be-ge-ge/FederalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value
                  "Government of the Federal Democratic Republic of Nepal"}
                 {:rdf/language "ne",
                  :rdf/value    "सङ्घीय लोकतान्त्रिक गणतन्त्र नेपाल"}},
   :skos/definition
   "federal parliamentary republic in Southern Asia, mainly situated in the Himalayas, bordering Tibet of China to the north, and India in the south, east, and west"})

(def GovernmentOfTheIslamicRepublicOfAfghanistan
  {:db/ident :fibo-be-ge-sasj/GovernmentOfTheIslamicRepublicOfAfghanistan,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-sasj/JurisdictionOfAfghanistan,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Afghanistan,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "ps",
                  :rdf/value    "Da Afġānistān Islāmī Jumhoryat"}
                 {:rdf/language "en",
                  :rdf/value
                  "Government of the Islamic Republic of Afghanistan"}},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://en.wikipedia.org/wiki/Politics_of_Afghanistan"},
   :skos/definition
   "unitary presidential Islamic republic in Southern Asia, bordered by Pakistan to the east and south, Iran to the west, Turkmenistan, Uzbekistan, and Tajikistan to the north, and China to the northeast"})

(def GovernmentOfTheIslamicRepublicOfIran
  {:db/ident :fibo-be-ge-sasj/GovernmentOfTheIslamicRepublicOfIran,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-sasj/JurisdictionOfIran,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Iran,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Islamic Republic of Iran"}
                 {:rdf/language "fa",
                  :rdf/value    "جمهوری اسلامی ایران"}},
   :rdfs/seeAlso {:xsd/anyURI "http://www.icana.ir/"},
   :skos/definition
   "unitary Khomeinist presidential Islamic republic in Southern Asia, bordered to the northwest by Armenia and Azerbaijan, to the north by the Caspian Sea, to the northeast by Turkmenistan, to the east by Afghanistan, to the southeast by Pakistan, to the south by the Persian Gulf and the Gulf of Oman, and to the west by Turkey and Iraq"})

(def GovernmentOfTheIslamicRepublicOfPakistan
  {:db/ident :fibo-be-ge-sasj/GovernmentOfTheIslamicRepublicOfPakistan,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-sasj/JurisdictionOfPakistan,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Pakistan,
   :rdf/type #{:fibo-be-ge-ge/FederalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "ur",
                  :rdf/value    "اِسلامی جمہوریہ پاكِستان"}
                 {:rdf/language "en",
                  :rdf/value "Government of the Islamic Republic of Pakistan"}},
   :rdfs/seeAlso {:xsd/anyURI "http://www.pakistan.gov.pk/"},
   :skos/definition
   "federal parliamentary constitutional republic in Southern Asia, bordered by India to the east, Afghanistan to the west, Iran to the southwest, and China to the northeast"})

(def GovernmentOfTheKingdomOfBhutan
  {:db/ident :fibo-be-ge-sasj/GovernmentOfTheKingdomOfBhutan,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-sasj/JurisdictionOfBhutan,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Bhutan,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Kingdom of Bhutan"}
                 {:rdf/language "dz",
                  :rdf/value    "འབྲུག་རྒྱལ་ཁབ་"}},
   :skos/definition
   "unitary parliamentary constitutional monarchy in Southern Asia, bordered by China to the north and India to the south"})

(def GovernmentOfThePeoplesRepublicOfBangladesh
  {:db/ident :fibo-be-ge-sasj/GovernmentOfThePeoplesRepublicOfBangladesh,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-sasj/JurisdictionOfBangladesh,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Bangladesh,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value
                  "Government of the People's Republic of Bangladesh"}
                 {:rdf/language "bn",
                  :rdf/value    "গণপ্রজাতন্ত্রী বাংলাদেশ"}},
   :rdfs/seeAlso {:xsd/anyURI "http://bangladesh.gov.bd/"},
   :skos/definition
   "unitary dominant-party parliamentary constitutional republic in Southern Asia, bordered by India to the west, north, and east, Myanmar to the southeast, and the Bay of Bengal to the south"})

(def GovernmentOfTheRepublicOfIndia
  {:db/ident :fibo-be-ge-sasj/GovernmentOfTheRepublicOfIndia,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-sasj/JurisdictionOfIndia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/India,
   :rdf/type #{:fibo-be-ge-ge/FederalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "hi",
                  :rdf/value    "Bhārat Gaṇarājya"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Republic of India"}},
   :rdfs/seeAlso {:xsd/anyURI "http://parliamentofindia.nic.in/"},
   :skos/definition
   "federal parliamentary constitutional and democratic republic in Southern Asia, bordered by the Indian Ocean on the south, the Arabian Sea on the southwest, and the Bay of Bengal on the southeast, it shares land borders with Pakistan to the northwest; China, Nepal, and Bhutan to the north; and Bangladesh and Myanmar to the east"})

(def GovernmentOfTheRepublicOfMaldives
  {:db/ident :fibo-be-ge-sasj/GovernmentOfTheRepublicOfMaldives,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-sasj/JurisdictionOfMaldives,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Maldives,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "dv",
                  :rdf/value    "ދިވެހިރާއްޖެ"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Republic of Maldives"}},
   :skos/definition
   "unitary presidential republic in Southern Asia, a small archipelagic state situated in the Indian Ocean"})

(def JurisdictionOfAfghanistan
  {:db/ident :fibo-be-ge-sasj/JurisdictionOfAfghanistan,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-sasj/GovernmentOfTheIslamicRepublicOfAfghanistan,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Afghanistan,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Afghanistan",
   :rdfs/seeAlso {:xsd/anyURI "http://supremecourt.gov.af/en"},
   :skos/definition
   "jurisdiction of the judiciary of Afghanistan, which is the system of courts, including its Supreme Court or Stera Mahkama, that interprets and applies the law in Afghanistan"})

(def JurisdictionOfBangladesh
  {:db/ident :fibo-be-ge-sasj/JurisdictionOfBangladesh,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-sasj/GovernmentOfThePeoplesRepublicOfBangladesh,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Bangladesh,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Bangladesh",
   :rdfs/seeAlso {:xsd/anyURI "http://supremecourt.gov.bd/"},
   :skos/definition
   "jurisdiction of the judiciary of Bangladesh, which is the system of courts, including its Supreme Court, High Court, and Appellate Divisions, that interprets and applies the law in Bangladesh"})

(def JurisdictionOfBhutan
  {:db/ident :fibo-be-ge-sasj/JurisdictionOfBhutan,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-sasj/GovernmentOfTheKingdomOfBhutan,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Bhutan,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Bhutan",
   :skos/definition
   "jurisdiction of the judiciary of Bhutan, which is the system of courts that interprets and applies the law in Bhutan"})

(def JurisdictionOfIndia
  {:db/ident :fibo-be-ge-sasj/JurisdictionOfIndia,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-sasj/GovernmentOfTheRepublicOfIndia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/India,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of India",
   :skos/definition
   "jurisdiction of the judiciary of India, a three-tier unitary independent judiciary comprising the supreme court, headed by the Chief Justice of India, 25 high courts, and a large number of trial courts, which is the system of courts that interprets and applies the law in India"})

(def JurisdictionOfIran
  {:db/ident :fibo-be-ge-sasj/JurisdictionOfIran,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-sasj/GovernmentOfTheIslamicRepublicOfIran,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Iran,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Iran",
   :skos/definition
   "jurisdiction of the judiciary of India, which is the system of courts that interprets and applies the law in Iran"})

(def JurisdictionOfMaldives
  {:db/ident :fibo-be-ge-sasj/JurisdictionOfMaldives,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-sasj/GovernmentOfTheRepublicOfMaldives,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Maldives,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Maldives",
   :skos/definition
   "jurisdiction of the judiciary of Maldives, which is the system of courts that interprets and applies the law in Maldives"})

(def JurisdictionOfNepal
  {:db/ident :fibo-be-ge-sasj/JurisdictionOfNepal,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-sasj/GovernmentOfTheFederalDemocraticRepublicOfNepal,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Nepal,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Nepal",
   :skos/definition
   "jurisdiction of the judiciary of Nepal, which is the system of courts, including the Supreme Court, that interprets and applies the law in Nepal"})

(def JurisdictionOfPakistan
  {:db/ident :fibo-be-ge-sasj/JurisdictionOfPakistan,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-sasj/GovernmentOfTheIslamicRepublicOfPakistan,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Pakistan,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Pakistan",
   :skos/definition
   "jurisdiction of the judiciary of Pakistan, which is the system of courts that interprets and applies the law in Pakistan"})

(def JurisdictionOfSriLanka
  {:db/ident :fibo-be-ge-sasj/JurisdictionOfSriLanka,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-sasj/GovernmentOfTheDemocraticSocialistRepublicOfSriLanka,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/SriLanka,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Sri Lanka",
   :skos/definition
   "jurisdiction of the judiciary of Sri Lanka, which is the system of courts that interprets and applies the law in Sri Lanka"})

(def StateOfAfghanistan
  {:db/ident :fibo-be-ge-sasj/StateOfAfghanistan,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Afghanistan,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-sasj/GovernmentOfTheIslamicRepublicOfAfghanistan,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "state of Afghanistan",
   :skos/definition "sovereign state and polity that is Afghanistan"})

(def StateOfBangladesh
  {:db/ident :fibo-be-ge-sasj/StateOfBangladesh,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Bangladesh,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-sasj/GovernmentOfThePeoplesRepublicOfBangladesh,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "state of Bangladesh",
   :skos/definition "sovereign state and polity that is Bangladesh"})

(def StateOfBhutan
  {:db/ident :fibo-be-ge-sasj/StateOfBhutan,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Bhutan,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-sasj/GovernmentOfTheKingdomOfBhutan,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "state of Bhutan",
   :skos/definition "sovereign state and polity that is Bhutan"})

(def StateOfIndia
  {:db/ident :fibo-be-ge-sasj/StateOfIndia,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/India,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-sasj/GovernmentOfTheRepublicOfIndia,
   :rdf/type #{:fibo-be-ge-ge/FederatedSovereignty :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "state of India",
   :skos/definition "federated sovereignty and polity that is India"})

(def StateOfIran
  {:db/ident :fibo-be-ge-sasj/StateOfIran,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Iran,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-sasj/GovernmentOfTheIslamicRepublicOfIran,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "state of Iran",
   :skos/definition "sovereign state and polity that is Iran"})

(def StateOfMaldives
  {:db/ident :fibo-be-ge-sasj/StateOfMaldives,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Maldives,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-sasj/GovernmentOfTheRepublicOfMaldives,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "state of Maldives",
   :skos/definition "sovereign state and polity that is Maldives"})

(def StateOfNepal
  {:db/ident :fibo-be-ge-sasj/StateOfNepal,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Nepal,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-sasj/GovernmentOfTheFederalDemocraticRepublicOfNepal,
   :rdf/type #{:fibo-be-ge-ge/FederatedSovereignty :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "state of Nepal",
   :skos/definition "federated sovereignty and polity that is Nepal"})

(def StateOfPakistan
  {:db/ident :fibo-be-ge-sasj/StateOfPakistan,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Pakistan,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-sasj/GovernmentOfTheIslamicRepublicOfPakistan,
   :rdf/type #{:fibo-be-ge-ge/FederatedSovereignty :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "state of Pakistan",
   :skos/definition "federated sovereignty and polity that is Pakistan"})

(def StateOfSriLanka
  {:db/ident :fibo-be-ge-sasj/StateOfSriLanka,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/SriLanka,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-sasj/GovernmentOfTheDemocraticSocialistRepublicOfSriLanka,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "state of Sri Lanka",
   :skos/definition "sovereign state and polity that is Sri Lanka"})

(def urn:uuid:d86e923e-ba79-53e4-8d8e-9a08ea2af325
  {:cmns-av/copyright
   #{"Copyright (c) 2021-2023 EDM Council, Inc."
     "Copyright (c) 2021-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for countries that are defined as being part of Southern Asia in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Southern Asia Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary.",
   :skos/scopeNote
   "The initial version of this ontology reflects the national level only.",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"})