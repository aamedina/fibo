(ns net.wikipunk.rdf.fibo-be-ge-wasj
  {:cmns-av/copyright
   #{"Copyright (c) 2021-2023 EDM Council, Inc."
     "Copyright (c) 2021-2023 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for countries that are defined as being part of Western Asia in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-ge-ge"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/",
    "fibo-be-ge-wasj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
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
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-ge-wasj",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Western Asia Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to correct spelling errors."},
   :skos/scopeNote
   "The initial version of this ontology reflects the national level only.",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"})

(def GovernmentOfGeorgia
  {:db/ident :fibo-be-ge-wasj/GovernmentOfGeorgia,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-wasj/JurisdictionOfGeorgia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Georgia,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of Georgia"}
                 {:rdf/language "ka",
                  :rdf/value    "საქართველო"}},
   :skos/definition
   "unitary parliamentary constitutional republic in Western Asia, bounded to the west by the Black Sea, to the north and east by Russia, to the south by Turkey and Armenia, and to the southeast by Azerbaijan"})

(def GovernmentOfTheHashemiteKingdomOfJordan
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheHashemiteKingdomOfJordan,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheHashemiteKingdomOfJordan,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Jordan,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "ar",
                  :rdf/value    "المملكة الأردنية الهاشمية"}
                 {:rdf/language "en",
                  :rdf/value "Government of the Hashemite Kingdom of Jordan"}},
   :skos/definition
   "unitary parliamentary constitutional monarchy in Western Asia, located on the East Bank of the Jordan River, bordered by Saudi Arabia, Iraq, Syria, Israel and Palestine (West Bank)"})

(def GovernmentOfTheKingdomOfBahrain
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheKingdomOfBahrain,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheKingdomOfBahrain,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Bahrain,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Kingdom of Bahrain"}
                 {:rdf/language "ar",
                  :rdf/value    "مملكة البحرين"}},
   :skos/definition
   "unitary constitutional monarchy in Western Asia, comprising a small archipelago made up of 70 natural islands and an additional 33 artificial islands, centered around Bahrain Island, between the Qatari peninsula and the north eastern coast of Saudi Arabia"})

(def GovernmentOfTheKingdomOfSaudiArabia
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheKingdomOfSaudiArabia,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheKingdomOfSaudiArabia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/SaudiArabia,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Kingdom of Saudi Arabia"}
                 {:rdf/language "ar",
                  :rdf/value    "ٱلْمَمْلَكَة ٱلْعَرَبِيَّة ٱلسَّعُوْدِيَّة"}},
   :skos/definition
   "unitary Islamic absolute monarchy in Western Asia, located on the Arabian Peninsula and bordered by Jordan and Iraq to the north, Kuwait to the northeast, Qatar, Bahrain, and the United Arab Emirates to the east, Oman to the southeast and Yemen to the south"})

(def GovernmentOfTheLebaneseRepublic
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheLebaneseRepublic,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheLebaneseRepublic,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Lebanon,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Lebanese Republic"}
                 {:rdf/language "ar",
                  :rdf/value    "ٱلْجُمْهُورِيَّةُ ٱللُّبْنَانِيَّةُ"}},
   :skos/definition
   "unitary parliamentary confessionalist constitutional republic in Western Asia, bordered by Syria to the north and east and Israel to the south"})

(def GovernmentOfTheRepublicOfArmenia
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheRepublicOfArmenia,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheRepublicOfArmenia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Armenia,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "hy",
                  :rdf/value    "Հայաստանի Հանրապետություն"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Republic of Armenia"}},
   :skos/definition
   "unitary parliamentary democratic republic in Western Asia, bordered by Turkey to the west, Georgia to the north, the Lachin corridor under a Russian peacekeeping force, and Azerbaijan to the east, and Iran and the Azerbaijani exclave of Nakhchivan to the south"})

(def GovernmentOfTheRepublicOfAzerbaijan
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheRepublicOfAzerbaijan,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheRepublicOfAzerbaijan,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Azerbaijan,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "az",
                  :rdf/value    "Azərbaycan Respublikası"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Republic of Azerbaijan"}},
   :skos/definition
   "unitary semi-presidential republic in Western Asia, bounded by the Caspian Sea to the east, the Russian republic of Dagestan to the north, Georgia to the northwest, Armenia and Turkey to the west, and Iran to the south"})

(def GovernmentOfTheRepublicOfCyprus
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheRepublicOfCyprus,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheRepublicOfCyprus,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Cyprus,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Republic of Cyprus"}
                 {:rdf/language "tr",
                  :rdf/value    "Kıbrıs Cumhuriyeti"}
                 {:rdf/language "el",
                  :rdf/value    "Κυπριακή Δημοκρατία"}},
   :skos/definition
   "unitary presidential constitutional republic in Western Asia, an island nation in the eastern Mediterranean Sea located south of Turkey, west of Syria, northwest of Lebanon, Israel and Palestine, north of Egypt, and southeast of Greece"})

(def GovernmentOfTheRepublicOfIraq
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheRepublicOfIraq,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheRepublicOfIraq,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Iraq,
   :rdf/type #{:fibo-be-ge-ge/FederalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "ku",
                  :rdf/value    "کۆماری عێراق"}
                 {:rdf/language "ar",
                  :rdf/value    "جمهورية العراق"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Republic of Iraq"}},
   :skos/definition
   "federal parliamentary constitutional republic in Western Asia, bordered by Turkey to the north, Iran to the east, Kuwait to the southeast, Saudi Arabia to the south, Jordan to the southwest and Syria to the west"})

(def GovernmentOfTheRepublicOfTurkey
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheRepublicOfTurkey,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheRepublicOfTurkey,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Turkey,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "tr",
                  :rdf/value    "Türkiye Cumhuriyeti"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Republic of Turkey"}},
   :skos/definition
   "unitary presidential constitutional republic in Western Asia, bordered by Greece and Bulgaria to the northwest, the Black Sea to the north, Georgia to the northeast, Armenia, Azerbaijan, and Iran to the east, Iraq to the southeast, Syria and the Mediterranean Sea to the south, and the Aegean Sea to the west"})

(def GovernmentOfTheRepublicOfYemen
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheRepublicOfYemen,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheRepublicOfYemen,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Yemen,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "ar",
                  :rdf/value    "ٱلْجُمْهُورِيَّةُ ٱلْيَمَنِيَّةُ"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Republic of Yemen"}},
   :skos/definition
   "unitary presidential constitutional republic (de jure) and unitary provisional government (de facto) in Western Asia located at the southern end of the Arabian Peninsula"})

(def GovernmentOfTheStateOfIsrael
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheStateOfIsrael,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheStateOfIsrael,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Israel,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "he",
                  :rdf/value    "יִשְׂרָאֵל"}
                 {:rdf/language "ar",
                  :rdf/value    "إسرائيل"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the State of Israel"}},
   :skos/definition
   "unitary parliamentary constitutional republic in Western Asia, bordering Lebanon to the north, Syria to the northeast, Jordan on the east, the Palestinian territories of the West Bank and the Gaza Strip to the east and west, respectively, and Egypt to the southwest"})

(def GovernmentOfTheStateOfKuwait
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheStateOfKuwait,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheStateOfKuwait,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Kuwait,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the State of Kuwait"}
                 {:rdf/language "ar",
                  :rdf/value    "دولة الكويت"}},
   :skos/definition
   "unitary constitutional monarchy in Western Asia, located at the tip of the Persian Gulf, bordering Iraq to the north and Saudi Arabia to the south"})

(def GovernmentOfTheStateOfPalestine
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheStateOfPalestine,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheStateOfPalestine,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Palestine,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "ar",
                  :rdf/value    "دولة فلسطين"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the State of Palestine"}},
   :skos/definition
   "unitary semi-presidential republic that is a de jure sovereign state in Western Asia claiming the West Bank (bordering Israel and Jordan) and Gaza Strip (bordering Israel and Egypt)"})

(def GovernmentOfTheStateOfQatar
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheStateOfQatar,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheStateOfQatar,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Qatar,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "ar",
                  :rdf/value    "دولة قطر"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the State of Qatar"}},
   :skos/definition
   "unitary semi-constitutional monarchy in Western Asia, occupying the small Qatar Peninsula on the northeastern coast of the Arabian Peninsula and bordered by Saudi Arabia to the south"})

(def GovernmentOfTheSultanateOfOman
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheSultanateOfOman,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheSultanateOfOman,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Oman,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Sultanate of Oman"}
                 {:rdf/language "ar",
                  :rdf/value    "سلطنة عُمان"}},
   :skos/definition
   "unitary absolute monarchy located on the southeastern coast of the Arabian Peninsula in Western Asia, bordered by the United Arab Emirates to the northwest, Saudi Arabia to the west, and Yemen to the southwest, and sharing marine borders with Iran and Pakistan"})

(def GovernmentOfTheSyrianArabRepublic
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheSyrianArabRepublic,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheSyrianArabRepublic,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/SyrianArabRepublic,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "ar",
                  :rdf/value "ٱلْجُمْهُورِيَّةُ ٱلْعَرَبِيَّةُ ٱلسُّورِيَّةُ"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Syrian Arab Republic"}},
   :skos/definition
   "unitary dominant-party semi-presidential Ba'athist republic bordering Lebanon to the southwest, the Mediterranean Sea to the west, Turkey to the north, Iraq to the east, Jordan to the south, and Israel to the southwest"})

(def GovernmentOfTheUnitedArabEmirates
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheUnitedArabEmirates,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheUnitedArabEmirates,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/UnitedArabEmirates,
   :rdf/type #{:fibo-be-ge-ge/FederalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "ar",
                  :rdf/value    "الإمارات العربية المتحدة"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the United Arab Emirates"}},
   :skos/definition
   "federal constitutional elective monarchy located at the eastern end of the Arabian Peninsula, bordering Oman and Saudi Arabia, with maritime borders in the Persian Gulf with Qatar and Iran"})

(def JurisdictionOfGeorgia
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfGeorgia,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-wasj/GovernmentOfGeorgia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Georgia,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Georgia",
   :skos/definition
   "jurisdiction of the judiciary of Georgia, which is the system of courts that interprets and applies the law in Georgia"})

(def JurisdictionOfTheHashemiteKingdomOfJordan
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheHashemiteKingdomOfJordan,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheHashemiteKingdomOfJordan,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Jordan,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the Hashemite Kingdom of Jordan",
   :skos/definition
   "jurisdiction of the judiciary of Jordan, which is the system of courts that interprets and applies the law in Jordan"})

(def JurisdictionOfTheKingdomOfBahrain
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheKingdomOfBahrain,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheKingdomOfBahrain,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Bahrain,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the Kingdom of Bahrain",
   :skos/definition
   "jurisdiction of the judiciary of Bahrain, which is the system of courts that interprets and applies the law in Bahrain"})

(def JurisdictionOfTheKingdomOfSaudiArabia
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheKingdomOfSaudiArabia,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheKingdomOfSaudiArabia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/SaudiArabia,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the Kingdom of Saudi Arabia",
   :skos/definition
   "jurisdiction of the judiciary of Saudi Arabia, which is the system of courts that interprets and applies the law in Saudi Arabia"})

(def JurisdictionOfTheLebaneseRepublic
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheLebaneseRepublic,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheLebaneseRepublic,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Lebanon,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the Lebanese Republic",
   :skos/definition
   "jurisdiction of the judiciary of Lebanon, which is the system of courts that interprets and applies the law in Lebanon"})

(def JurisdictionOfTheRepublicOfArmenia
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheRepublicOfArmenia,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheRepublicOfArmenia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Armenia,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the Republic of Armenia",
   :skos/definition
   "jurisdiction of the judiciary of Armenia, which is the system of courts that interprets and applies the law in Armenia"})

(def JurisdictionOfTheRepublicOfAzerbaijan
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheRepublicOfAzerbaijan,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheRepublicOfAzerbaijan,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Azerbaijan,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the Republic of Azerbaijan",
   :skos/definition
   "jurisdiction of the judiciary of Azerbaijan, which is the system of courts that interprets and applies the law in Azerbaijan"})

(def JurisdictionOfTheRepublicOfCyprus
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheRepublicOfCyprus,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheRepublicOfCyprus,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Cyprus,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the Republic of Cyprus",
   :skos/definition
   "jurisdiction of the judiciary of Cyprus, which is the system of courts that interprets and applies the law in Cyprus"})

(def JurisdictionOfTheRepublicOfIraq
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheRepublicOfIraq,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheRepublicOfIraq,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Iraq,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the Republic of Iraq",
   :skos/definition
   "jurisdiction of the judiciary of Iraq, which is the system of courts that interprets and applies the law in Iraq"})

(def JurisdictionOfTheRepublicOfTurkey
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheRepublicOfTurkey,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheRepublicOfTurkey,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Turkey,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the Republic of Turkey",
   :skos/definition
   "jurisdiction of the judiciary of Turkey, which is the system of courts, including the Constitutional Court, Council of State, High Court of Appeals, and lower courts, that interprets and applies the law in Turkey"})

(def JurisdictionOfTheRepublicOfYemen
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheRepublicOfYemen,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheRepublicOfYemen,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Yemen,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the Republic of Yemen",
   :skos/definition
   "jurisdiction of the judiciary of Yemen, which is the system of courts that interprets and applies the law in Yemen"})

(def JurisdictionOfTheStateOfIsrael
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheStateOfIsrael,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheStateOfIsrael,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Israel,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the State of Israel",
   :skos/definition
   "jurisdiction of the judiciary of Israel, which is the three-tiered system of courts, including the Supreme Court of Israel, that interprets and applies the law in Israel"})

(def JurisdictionOfTheStateOfKuwait
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheStateOfKuwait,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheStateOfKuwait,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Kuwait,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the State of Kuwait",
   :skos/definition
   "jurisdiction of the judiciary of Kuwait, which is the system of courts that interprets and applies the law in Kuwait"})

(def JurisdictionOfTheStateOfPalestine
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheStateOfPalestine,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheStateOfPalestine,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Palestine,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the State of Palestine",
   :skos/definition
   "jurisdiction of the judiciary of Palestine, which is the system of courts that interprets and applies the law in Palestine"})

(def JurisdictionOfTheStateOfQatar
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheStateOfQatar,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-wasj/GovernmentOfTheStateOfQatar,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Qatar,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the State of Qatar",
   :skos/definition
   "jurisdiction of the judiciary of Qatar, which is the system of courts that interprets and applies the law in Qatar"})

(def JurisdictionOfTheSultanateOfOman
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheSultanateOfOman,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheSultanateOfOman,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Oman,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the Sultanate of Oman",
   :skos/definition
   "jurisdiction of the judiciary of Oman, which is the system of courts that interprets and applies the law in Oman"})

(def JurisdictionOfTheSyrianArabRepublic
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheSyrianArabRepublic,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheSyrianArabRepublic,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/SyrianArabRepublic,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the Syrian Arab Republic",
   :skos/definition
   "jurisdiction of the judiciary of Syria, which is the system of courts that interprets and applies the law in Syria"})

(def JurisdictionOfTheUnitedArabEmirates
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheUnitedArabEmirates,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheUnitedArabEmirates,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/UnitedArabEmirates,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the United Arab Emirates",
   :rdfs/seeAlso {:xsd/anyURI "http://ejustice.gov.ae/"},
   :skos/definition
   "jurisdiction of the judiciary of United Arab Emirates, which is the system of courts, including the Federal Supreme Court of the United Arab Emirates and other lower courts, that interprets and applies the law in United Arab Emirates"})

(def SovereignStateOfGeorgia
  {:db/ident :fibo-be-ge-wasj/SovereignStateOfGeorgia,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Georgia,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-wasj/GovernmentOfGeorgia,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "sovereign state of Georgia",
   :skos/definition "sovereign state and polity that is Georgia"})

(def StateOfArmenia
  {:db/ident :fibo-be-ge-wasj/StateOfArmenia,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Armenia,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheRepublicOfArmenia,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "state of Armenia",
   :skos/definition "sovereign state and polity that is Armenia"})

(def StateOfAzerbaijan
  {:db/ident :fibo-be-ge-wasj/StateOfAzerbaijan,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Azerbaijan,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheRepublicOfAzerbaijan,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "state of Azerbaijan",
   :skos/definition "sovereign state and polity that is Azerbaijan"})

(def StateOfBahrain
  {:db/ident :fibo-be-ge-wasj/StateOfBahrain,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Bahrain,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheKingdomOfBahrain,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "state of Bahrain",
   :skos/definition "sovereign state and polity that is Bahrain"})

(def StateOfCyprus
  {:db/ident :fibo-be-ge-wasj/StateOfCyprus,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Cyprus,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheRepublicOfCyprus,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "state of Cyprus",
   :skos/definition "sovereign state and polity that is Cyprus"})

(def StateOfIraq
  {:db/ident :fibo-be-ge-wasj/StateOfIraq,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Iraq,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheRepublicOfIraq,
   :rdf/type #{:fibo-be-ge-ge/FederatedSovereignty :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "state of Iraq",
   :skos/definition "federated sovereignty and polity that is Iraq"})

(def StateOfIsrael
  {:db/ident :fibo-be-ge-wasj/StateOfIsrael,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Israel,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-wasj/GovernmentOfTheStateOfIsrael,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Israel",
   :skos/definition "sovereign state and polity that is Israel"})

(def StateOfJordan
  {:db/ident :fibo-be-ge-wasj/StateOfJordan,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Jordan,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheHashemiteKingdomOfJordan,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "state of Jordan",
   :skos/definition "sovereign state and polity that is Jordan"})

(def StateOfKuwait
  {:db/ident :fibo-be-ge-wasj/StateOfKuwait,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Kuwait,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-wasj/GovernmentOfTheStateOfKuwait,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Kuwait",
   :skos/definition "sovereign state and polity that is Kuwait"})

(def StateOfLebanon
  {:db/ident :fibo-be-ge-wasj/StateOfLebanon,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Lebanon,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheLebaneseRepublic,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Lebanon",
   :skos/definition "sovereign state and polity that is Lebanon"})

(def StateOfOman
  {:db/ident :fibo-be-ge-wasj/StateOfOman,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Oman,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheSultanateOfOman,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Oman",
   :skos/definition "sovereign state and polity that is Oman"})

(def StateOfPalestine
  {:db/ident :fibo-be-ge-wasj/StateOfPalestine,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Palestine,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheStateOfPalestine,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Palestine",
   :skos/definition "sovereign state and polity that is Palestine"})

(def StateOfQatar
  {:db/ident :fibo-be-ge-wasj/StateOfQatar,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Qatar,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-wasj/GovernmentOfTheStateOfQatar,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Qatar",
   :skos/definition "sovereign state and polity that is Qatar"})

(def StateOfSaudiArabia
  {:db/ident :fibo-be-ge-wasj/StateOfSaudiArabia,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/SaudiArabia,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheKingdomOfSaudiArabia,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Saudi Arabia",
   :skos/definition "sovereign state and polity that is Saudi Arabia"})

(def StateOfSyria
  {:db/ident :fibo-be-ge-wasj/StateOfSyria,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/SyrianArabRepublic,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheSyrianArabRepublic,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Syria",
   :skos/definition "sovereign state and polity that is Syria"})

(def StateOfTurkey
  {:db/ident :fibo-be-ge-wasj/StateOfTurkey,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Turkey,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheRepublicOfTurkey,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Turkey",
   :skos/definition "sovereign state and polity that is Turkey"})

(def StateOfUnitedArabEmirates
  {:db/ident :fibo-be-ge-wasj/StateOfUnitedArabEmirates,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/UnitedArabEmirates,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheUnitedArabEmirates,
   :rdf/type #{:fibo-be-ge-ge/FederatedSovereignty :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of United Arab Emirates",
   :skos/definition
   "federated sovereignty and polity that is the United Arab Emirates"})

(def StateOfYemen
  {:db/ident :fibo-be-ge-wasj/StateOfYemen,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Yemen,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheRepublicOfYemen,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Yemen",
   :skos/definition "sovereign state and polity that is Yemen"})

(def urn:uuid:8d0cd0f7-ffb4-5486-9b63-98fd28c47b52
  {:cmns-av/copyright
   #{"Copyright (c) 2021-2023 EDM Council, Inc."
     "Copyright (c) 2021-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for countries that are defined as being part of Western Asia in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective.",
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
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Western Asia Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to correct spelling errors."},
   :skos/scopeNote
   "The initial version of this ontology reflects the national level only.",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"})