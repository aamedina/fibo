(ns net.wikipunk.rdf.fibo-be-ge-wasj
  "This ontology provides government entities and jurisdictions for countries that are defined as being part of Western Asia in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective."
  {:cmns-av/copyright ["Copyright (c) 2021-2023 EDM Council, Inc."
                       "Copyright (c) 2021-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for countries that are defined as being part of Western Asia in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/GovernmentEntities/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdf/ns-prefix-map
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-ge-wasj",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Western Asia Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary.",
   :skos/scopeNote
   "The initial version of this ontology reflects the national level only."})

(def GovernmentOfGeorgia
  "unitary parliamentary constitutional republic in Western Asia, bounded to the west by the Black Sea, to the north and east by Russia, to the south by Turkey and Armenia, and to the southeast by Azerbaijan"
  {:db/ident :fibo-be-ge-wasj/GovernmentOfGeorgia,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-wasj/JurisdictionOfGeorgia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Georgia,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "საქართველო@ka" #voc/lstr "Government of Georgia@en"],
   :skos/definition
   "unitary parliamentary constitutional republic in Western Asia, bounded to the west by the Black Sea, to the north and east by Russia, to the south by Turkey and Armenia, and to the southeast by Azerbaijan"})

(def GovernmentOfTheHashemiteKingdomOfJordan
  "unitary parliamentary constitutional monarchy in Western Asia, located on the East Bank of the Jordan River, bordered by Saudi Arabia, Iraq, Syria, Israel and Palestine (West Bank)"
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheHashemiteKingdomOfJordan,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheHashemiteKingdomOfJordan,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Jordan,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "المملكة الأردنية الهاشمية@ar"
                #voc/lstr "Government of the Hashemite Kingdom of Jordan@en"],
   :skos/definition
   "unitary parliamentary constitutional monarchy in Western Asia, located on the East Bank of the Jordan River, bordered by Saudi Arabia, Iraq, Syria, Israel and Palestine (West Bank)"})

(def GovernmentOfTheKingdomOfBahrain
  "unitary constitutional monarchy in Western Asia, comprising a small archipelago made up of 70 natural islands and an additional 33 artificial islands, centered around Bahrain Island, between the Qatari peninsula and the north eastern coast of Saudi Arabia"
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheKingdomOfBahrain,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheKingdomOfBahrain,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Bahrain,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "مملكة البحرين@ar"
                #voc/lstr "Government of the Kingdom of Bahrain@en"],
   :skos/definition
   "unitary constitutional monarchy in Western Asia, comprising a small archipelago made up of 70 natural islands and an additional 33 artificial islands, centered around Bahrain Island, between the Qatari peninsula and the north eastern coast of Saudi Arabia"})

(def GovernmentOfTheKingdomOfSaudiArabia
  "unitary Islamic absolute monarchy in Western Asia, located on the Arabian Peninsula and bordered by Jordan and Iraq to the north, Kuwait to the northeast, Qatar, Bahrain, and the United Arab Emirates to the east, Oman to the southeast and Yemen to the south"
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheKingdomOfSaudiArabia,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheKingdomOfSaudiArabia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/SaudiArabia,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "ٱلْمَمْلَكَة ٱلْعَرَبِيَّة ٱلسَّعُوْدِيَّة@ar"
                #voc/lstr "Government of the Kingdom of Saudi Arabia@en"],
   :skos/definition
   "unitary Islamic absolute monarchy in Western Asia, located on the Arabian Peninsula and bordered by Jordan and Iraq to the north, Kuwait to the northeast, Qatar, Bahrain, and the United Arab Emirates to the east, Oman to the southeast and Yemen to the south"})

(def GovernmentOfTheLebaneseRepublic
  "unitary parliamentary confessionalist constitutional republic in Western Asia, bordered by Syria to the north and east and Israel to the south"
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheLebaneseRepublic,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheLebaneseRepublic,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Lebanon,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "ٱلْجُمْهُورِيَّةُ ٱللُّبْنَانِيَّةُ@ar"
                #voc/lstr "Government of the Lebanese Republic@en"],
   :skos/definition
   "unitary parliamentary confessionalist constitutional republic in Western Asia, bordered by Syria to the north and east and Israel to the south"})

(def GovernmentOfTheRepublicOfArmenia
  "unitary parliamentary democratic republic in Western Asia, bordered by Turkey to the west, Georgia to the north, the Lachin corridor under a Russian peacekeeping force, and Azerbaijan to the east, and Iran and the Azerbaijani exclave of Nakhchivan to the south"
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheRepublicOfArmenia,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheRepublicOfArmenia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Armenia,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Հայաստանի Հանրապետություն@hy"
                #voc/lstr "Government of the Republic of Armenia@en"],
   :skos/definition
   "unitary parliamentary democratic republic in Western Asia, bordered by Turkey to the west, Georgia to the north, the Lachin corridor under a Russian peacekeeping force, and Azerbaijan to the east, and Iran and the Azerbaijani exclave of Nakhchivan to the south"})

(def GovernmentOfTheRepublicOfAzerbaijan
  "unitary semi-presidential republic in Western Asia, bounded by the Caspian Sea to the east, the Russian republic of Dagestan to the north, Georgia to the northwest, Armenia and Turkey to the west, and Iran to the south"
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheRepublicOfAzerbaijan,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheRepublicOfAzerbaijan,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Azerbaijan,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Government of the Republic of Azerbaijan@en"
                #voc/lstr "Azərbaycan Respublikası@az"],
   :skos/definition
   "unitary semi-presidential republic in Western Asia, bounded by the Caspian Sea to the east, the Russian republic of Dagestan to the north, Georgia to the northwest, Armenia and Turkey to the west, and Iran to the south"})

(def GovernmentOfTheRepublicOfCyprus
  "unitary presidential constitutional republic in Western Asia, an island nation in the eastern Mediterranean Sea located south of Turkey, west of Syria, northwest of Lebanon, Israel and Palestine, north of Egypt, and southeast of Greece"
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheRepublicOfCyprus,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheRepublicOfCyprus,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Cyprus,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Κυπριακή Δημοκρατία@el"
                #voc/lstr "Kıbrıs Cumhuriyeti@tr"
                #voc/lstr "Government of the Republic of Cyprus@en"],
   :skos/definition
   "unitary presidential constitutional republic in Western Asia, an island nation in the eastern Mediterranean Sea located south of Turkey, west of Syria, northwest of Lebanon, Israel and Palestine, north of Egypt, and southeast of Greece"})

(def GovernmentOfTheRepublicOfIraq
  "federal parliamentary constitutional republic in Western Asia, bordered by Turkey to the north, Iran to the east, Kuwait to the southeast, Saudi Arabia to the south, Jordan to the southwest and Syria to the west"
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheRepublicOfIraq,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheRepublicOfIraq,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Iraq,
   :rdf/type [:fibo-be-ge-ge/FederalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "کۆماری عێراق@ku"
                #voc/lstr "جمهورية العراق@ar"
                #voc/lstr "Government of the Republic of Iraq@en"],
   :skos/definition
   "federal parliamentary constitutional republic in Western Asia, bordered by Turkey to the north, Iran to the east, Kuwait to the southeast, Saudi Arabia to the south, Jordan to the southwest and Syria to the west"})

(def GovernmentOfTheRepublicOfTurkey
  "unitary presidential constitutional republic in Western Asia, bordered by Greece and Bulgaria to the northwest, the Black Sea to the north, Georgia to the northeast, Armenia, Azerbaijan, and Iran to the east, Iraq to the southeast, Syria and the Mediterranean Sea to the south, and the Aegean Sea to the west"
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheRepublicOfTurkey,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheRepublicOfTurkey,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Turkey,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "Türkiye Cumhuriyeti@tr"
                #voc/lstr "Government of the Republic of Turkey@en"],
   :skos/definition
   "unitary presidential constitutional republic in Western Asia, bordered by Greece and Bulgaria to the northwest, the Black Sea to the north, Georgia to the northeast, Armenia, Azerbaijan, and Iran to the east, Iraq to the southeast, Syria and the Mediterranean Sea to the south, and the Aegean Sea to the west"})

(def GovernmentOfTheRepublicOfYemen
  "unitary presidential constitutional republic (de jure) and unitary provisional government (de facto) in Western Asia located at the southern end of the Arabian Peninsula"
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheRepublicOfYemen,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheRepublicOfYemen,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Yemen,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "ٱلْجُمْهُورِيَّةُ ٱلْيَمَنِيَّةُ@ar"
                #voc/lstr "Government of the Republic of Yemen@en"],
   :skos/definition
   "unitary presidential constitutional republic (de jure) and unitary provisional government (de facto) in Western Asia located at the southern end of the Arabian Peninsula"})

(def GovernmentOfTheStateOfIsrael
  "unitary parliamentary constitutional republic in Western Asia, bordering Lebanon to the north, Syria to the northeast, Jordan on the east, the Palestinian territories of the West Bank and the Gaza Strip to the east and west, respectively, and Egypt to the southwest"
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheStateOfIsrael,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheStateOfIsrael,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Israel,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "إسرائيل@ar"
                #voc/lstr "יִשְׂרָאֵל@he"
                #voc/lstr "Government of the State of Israel@en"],
   :skos/definition
   "unitary parliamentary constitutional republic in Western Asia, bordering Lebanon to the north, Syria to the northeast, Jordan on the east, the Palestinian territories of the West Bank and the Gaza Strip to the east and west, respectively, and Egypt to the southwest"})

(def GovernmentOfTheStateOfKuwait
  "unitary constitutional monarchy in Western Asia, located at the tip of the Persian Gulf, bordering Iraq to the north and Saudi Arabia to the south"
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheStateOfKuwait,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheStateOfKuwait,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Kuwait,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "دولة الكويت@ar"
                #voc/lstr "Government of the State of Kuwait@en"],
   :skos/definition
   "unitary constitutional monarchy in Western Asia, located at the tip of the Persian Gulf, bordering Iraq to the north and Saudi Arabia to the south"})

(def GovernmentOfTheStateOfPalestine
  "unitary semi-presidential republic that is a de jure sovereign state in Western Asia claiming the West Bank (bordering Israel and Jordan) and Gaza Strip (bordering Israel and Egypt)"
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheStateOfPalestine,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheStateOfPalestine,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Palestine,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "دولة فلسطين@ar"
                #voc/lstr "Government of the State of Palestine@en"],
   :skos/definition
   "unitary semi-presidential republic that is a de jure sovereign state in Western Asia claiming the West Bank (bordering Israel and Jordan) and Gaza Strip (bordering Israel and Egypt)"})

(def GovernmentOfTheStateOfQatar
  "unitary semi-constitutional monarchy in Western Asia, occupying the small Qatar Peninsula on the northeastern coast of the Arabian Peninsula and bordered by Saudi Arabia to the south"
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheStateOfQatar,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheStateOfQatar,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Qatar,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "دولة قطر@ar"
                #voc/lstr "Government of the State of Qatar@en"],
   :skos/definition
   "unitary semi-constitutional monarchy in Western Asia, occupying the small Qatar Peninsula on the northeastern coast of the Arabian Peninsula and bordered by Saudi Arabia to the south"})

(def GovernmentOfTheSultinateOfOman
  "unitary absolute monarchy located on the southeastern coast of the Arabian Peninsula in Western Asia, bordered by the United Arab Emirates to the northwest, Saudi Arabia to the west, and Yemen to the southwest, and sharing marine borders with Iran and Pakistan"
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheSultinateOfOman,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheSultinateOfOman,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Oman,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "سلطنة عُمان@ar"
                #voc/lstr "Government of the Sultinate of Oman@en"],
   :skos/definition
   "unitary absolute monarchy located on the southeastern coast of the Arabian Peninsula in Western Asia, bordered by the United Arab Emirates to the northwest, Saudi Arabia to the west, and Yemen to the southwest, and sharing marine borders with Iran and Pakistan"})

(def GovernmentOfTheSyrianArabRepublic
  "unitary dominant-party semi-presidential Ba'athist republic bordering Lebanon to the southwest, the Mediterranean Sea to the west, Turkey to the north, Iraq to the east, Jordan to the south, and Israel to the southwest"
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheSyrianArabRepublic,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheSyrianArabRepublic,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Syria,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "ٱلْجُمْهُورِيَّةُ ٱلْعَرَبِيَّةُ ٱلسُّورِيَّةُ@ar"
                #voc/lstr "Government of the Syrian Arab Republic@en"],
   :skos/definition
   "unitary dominant-party semi-presidential Ba'athist republic bordering Lebanon to the southwest, the Mediterranean Sea to the west, Turkey to the north, Iraq to the east, Jordan to the south, and Israel to the southwest"})

(def GovernmentOfTheUnitedArabEmirates
  "federal constitutional elective monarchy located at the eastern end of the Arabian Peninsula, bordering Oman and Saudi Arabia, with maritime borders in the Persian Gulf with Qatar and Iran"
  {:db/ident :fibo-be-ge-wasj/GovernmentOfTheUnitedArabEmirates,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-wasj/JurisdictionOfTheUnitedArabEmirates,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/UnitedArabEmirates,
   :rdf/type [:fibo-be-ge-ge/FederalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [#voc/lstr "الإمارات العربية المتحدة@ar"
                #voc/lstr "Government of the United Arab Emirates@en"],
   :skos/definition
   "federal constitutional elective monarchy located at the eastern end of the Arabian Peninsula, bordering Oman and Saudi Arabia, with maritime borders in the Persian Gulf with Qatar and Iran"})

(def JurisdictionOfGeorgia
  "jurisdiction of the judiciary of Georgia, which is the system of courts that interprets and applies the law in Georgia"
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfGeorgia,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-wasj/GovernmentOfGeorgia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Georgia,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of Georgia",
   :skos/definition
   "jurisdiction of the judiciary of Georgia, which is the system of courts that interprets and applies the law in Georgia"})

(def JurisdictionOfTheHashemiteKingdomOfJordan
  "jurisdiction of the judiciary of Jordan, which is the system of courts that interprets and applies the law in Jordan"
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheHashemiteKingdomOfJordan,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheHashemiteKingdomOfJordan,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Jordan,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the Hashemite Kingdom of Jordan",
   :skos/definition
   "jurisdiction of the judiciary of Jordan, which is the system of courts that interprets and applies the law in Jordan"})

(def JurisdictionOfTheKingdomOfBahrain
  "jurisdiction of the judiciary of Bahrain, which is the system of courts that interprets and applies the law in Bahrain"
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheKingdomOfBahrain,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheKingdomOfBahrain,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Bahrain,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the Kingdom of Bahrain",
   :skos/definition
   "jurisdiction of the judiciary of Bahrain, which is the system of courts that interprets and applies the law in Bahrain"})

(def JurisdictionOfTheKingdomOfSaudiArabia
  "jurisdiction of the judiciary of Saudi Arabia, which is the system of courts that interprets and applies the law in Saudi Arabia"
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheKingdomOfSaudiArabia,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheKingdomOfSaudiArabia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/SaudiArabia,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the Kingdom of Saudi Arabia",
   :skos/definition
   "jurisdiction of the judiciary of Saudi Arabia, which is the system of courts that interprets and applies the law in Saudi Arabia"})

(def JurisdictionOfTheLebaneseRepublic
  "jurisdiction of the judiciary of Lebanon, which is the system of courts that interprets and applies the law in Lebanon"
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheLebaneseRepublic,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheLebaneseRepublic,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Lebanon,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the Lebanese Republic",
   :skos/definition
   "jurisdiction of the judiciary of Lebanon, which is the system of courts that interprets and applies the law in Lebanon"})

(def JurisdictionOfTheRepublicOfArmenia
  "jurisdiction of the judiciary of Armenia, which is the system of courts that interprets and applies the law in Armenia"
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheRepublicOfArmenia,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheRepublicOfArmenia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Armenia,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the Republic of Armenia",
   :skos/definition
   "jurisdiction of the judiciary of Armenia, which is the system of courts that interprets and applies the law in Armenia"})

(def JurisdictionOfTheRepublicOfAzerbaijan
  "jurisdiction of the judiciary of Azerbaijan, which is the system of courts that interprets and applies the law in Azerbaijan"
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheRepublicOfAzerbaijan,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheRepublicOfAzerbaijan,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Azerbaijan,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the Republic of Azerbaijan",
   :skos/definition
   "jurisdiction of the judiciary of Azerbaijan, which is the system of courts that interprets and applies the law in Azerbaijan"})

(def JurisdictionOfTheRepublicOfCyprus
  "jurisdiction of the judiciary of Cyprus, which is the system of courts that interprets and applies the law in Cyprus"
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheRepublicOfCyprus,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheRepublicOfCyprus,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Cyprus,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the Republic of Cyprus",
   :skos/definition
   "jurisdiction of the judiciary of Cyprus, which is the system of courts that interprets and applies the law in Cyprus"})

(def JurisdictionOfTheRepublicOfIraq
  "jurisdiction of the judiciary of Iraq, which is the system of courts that interprets and applies the law in Iraq"
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheRepublicOfIraq,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheRepublicOfIraq,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Iraq,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the Republic of Iraq",
   :skos/definition
   "jurisdiction of the judiciary of Iraq, which is the system of courts that interprets and applies the law in Iraq"})

(def JurisdictionOfTheRepublicOfTurkey
  "jurisdiction of the judiciary of Turkey, which is the system of courts, including the Constitutional Court, Council of State, High Court of Appeals, and lower courts, that interprets and applies the law in Turkey"
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheRepublicOfTurkey,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheRepublicOfTurkey,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Turkey,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the Republic of Turkey",
   :skos/definition
   "jurisdiction of the judiciary of Turkey, which is the system of courts, including the Constitutional Court, Council of State, High Court of Appeals, and lower courts, that interprets and applies the law in Turkey"})

(def JurisdictionOfTheRepublicOfYemen
  "jurisdiction of the judiciary of Yemen, which is the system of courts that interprets and applies the law in Yemen"
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheRepublicOfYemen,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheRepublicOfYemen,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Yemen,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the Republic of Yemen",
   :skos/definition
   "jurisdiction of the judiciary of Yemen, which is the system of courts that interprets and applies the law in Yemen"})

(def JurisdictionOfTheStateOfIsrael
  "jurisdiction of the judiciary of Israel, which is the three-tiered system of courts, including the Supreme Court of Israel, that interprets and applies the law in Israel"
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheStateOfIsrael,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheStateOfIsrael,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Israel,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the State of Israel",
   :skos/definition
   "jurisdiction of the judiciary of Israel, which is the three-tiered system of courts, including the Supreme Court of Israel, that interprets and applies the law in Israel"})

(def JurisdictionOfTheStateOfKuwait
  "jurisdiction of the judiciary of Kuwait, which is the system of courts that interprets and applies the law in Kuwait"
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheStateOfKuwait,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheStateOfKuwait,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Kuwait,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the State of Kuwait",
   :skos/definition
   "jurisdiction of the judiciary of Kuwait, which is the system of courts that interprets and applies the law in Kuwait"})

(def JurisdictionOfTheStateOfPalestine
  "jurisdiction of the judiciary of Palestine, which is the system of courts that interprets and applies the law in Palestine"
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheStateOfPalestine,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheStateOfPalestine,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Palestine,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the State of Palestine",
   :skos/definition
   "jurisdiction of the judiciary of Palestine, which is the system of courts that interprets and applies the law in Palestine"})

(def JurisdictionOfTheStateOfQatar
  "jurisdiction of the judiciary of Qatar, which is the system of courts that interprets and applies the law in Qatar"
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheStateOfQatar,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-wasj/GovernmentOfTheStateOfQatar,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Qatar,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the State of Qatar",
   :skos/definition
   "jurisdiction of the judiciary of Qatar, which is the system of courts that interprets and applies the law in Qatar"})

(def JurisdictionOfTheSultinateOfOman
  "jurisdiction of the judiciary of Oman, which is the system of courts that interprets and applies the law in Oman"
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheSultinateOfOman,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheSultinateOfOman,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Oman,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the Sultinate of Oman",
   :skos/definition
   "jurisdiction of the judiciary of Oman, which is the system of courts that interprets and applies the law in Oman"})

(def JurisdictionOfTheSyrianArabRepublic
  "jurisdiction of the judiciary of Syria, which is the system of courts that interprets and applies the law in Syria"
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheSyrianArabRepublic,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheSyrianArabRepublic,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Syria,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the Syrian Arab Republic",
   :skos/definition
   "jurisdiction of the judiciary of Syria, which is the system of courts that interprets and applies the law in Syria"})

(def JurisdictionOfTheUnitedArabEmirates
  "jurisdiction of the judiciary of United Arab Emirates, which is the system of courts, including the Federal Supreme Court of the United Arab Emirates and other lower courts, that interprets and applies the law in United Arab Emirates"
  {:db/ident :fibo-be-ge-wasj/JurisdictionOfTheUnitedArabEmirates,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-wasj/GovernmentOfTheUnitedArabEmirates,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/UnitedArabEmirates,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the United Arab Emirates",
   :rdfs/seeAlso ["http://ejustice.gov.ae/"],
   :skos/definition
   "jurisdiction of the judiciary of United Arab Emirates, which is the system of courts, including the Federal Supreme Court of the United Arab Emirates and other lower courts, that interprets and applies the law in United Arab Emirates"})

(def SovereignStateOfGeorgia
  "sovereign state and polity that is Georgia"
  {:db/ident :fibo-be-ge-wasj/SovereignStateOfGeorgia,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Georgia,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-wasj/GovernmentOfGeorgia,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "sovereign state of Georgia",
   :skos/definition "sovereign state and polity that is Georgia"})

(def StateOfArmenia
  "sovereign state and polity that is Armenia"
  {:db/ident :fibo-be-ge-wasj/StateOfArmenia,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Armenia,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheRepublicOfArmenia,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of Armenia",
   :skos/definition "sovereign state and polity that is Armenia"})

(def StateOfAzerbaijan
  "sovereign state and polity that is Azerbaijan"
  {:db/ident :fibo-be-ge-wasj/StateOfAzerbaijan,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Azerbaijan,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheRepublicOfAzerbaijan,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of Azerbaijan",
   :skos/definition "sovereign state and polity that is Azerbaijan"})

(def StateOfBahrain
  "sovereign state and polity that is Bahrain"
  {:db/ident :fibo-be-ge-wasj/StateOfBahrain,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Bahrain,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheKingdomOfBahrain,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of Bahrain",
   :skos/definition "sovereign state and polity that is Bahrain"})

(def StateOfCyprus
  "sovereign state and polity that is Cyprus"
  {:db/ident :fibo-be-ge-wasj/StateOfCyprus,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Cyprus,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheRepublicOfCyprus,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of Cyprus",
   :skos/definition "sovereign state and polity that is Cyprus"})

(def StateOfIraq
  "federated sovereignty and polity that is Iraq"
  {:db/ident :fibo-be-ge-wasj/StateOfIraq,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Iraq,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheRepublicOfIraq,
   :rdf/type [:fibo-be-ge-ge/FederatedSovereignty :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of Iraq",
   :skos/definition "federated sovereignty and polity that is Iraq"})

(def StateOfIsrael
  "sovereign state and polity that is Israel"
  {:db/ident :fibo-be-ge-wasj/StateOfIsrael,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Israel,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-wasj/GovernmentOfTheStateOfIsrael,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "State of Israel",
   :skos/definition "sovereign state and polity that is Israel"})

(def StateOfJordan
  "sovereign state and polity that is Jordan"
  {:db/ident :fibo-be-ge-wasj/StateOfJordan,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Jordan,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheHashemiteKingdomOfJordan,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of Jordan",
   :skos/definition "sovereign state and polity that is Jordan"})

(def StateOfKuwait
  "sovereign state and polity that is Kuwait"
  {:db/ident :fibo-be-ge-wasj/StateOfKuwait,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Kuwait,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-wasj/GovernmentOfTheStateOfKuwait,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "State of Kuwait",
   :skos/definition "sovereign state and polity that is Kuwait"})

(def StateOfLebanon
  "sovereign state and polity that is Lebanon"
  {:db/ident :fibo-be-ge-wasj/StateOfLebanon,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Lebanon,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheLebaneseRepublic,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "State of Lebanon",
   :skos/definition "sovereign state and polity that is Lebanon"})

(def StateOfOman
  "sovereign state and polity that is Oman"
  {:db/ident :fibo-be-ge-wasj/StateOfOman,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Oman,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheSultinateOfOman,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "State of Oman",
   :skos/definition "sovereign state and polity that is Oman"})

(def StateOfPalestine
  "sovereign state and polity that is Palestine"
  {:db/ident :fibo-be-ge-wasj/StateOfPalestine,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Palestine,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheStateOfPalestine,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "State of Palestine",
   :skos/definition "sovereign state and polity that is Palestine"})

(def StateOfQatar
  "sovereign state and polity that is Qatar"
  {:db/ident :fibo-be-ge-wasj/StateOfQatar,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Qatar,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-wasj/GovernmentOfTheStateOfQatar,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "State of Qatar",
   :skos/definition "sovereign state and polity that is Qatar"})

(def StateOfSaudiArabia
  "sovereign state and polity that is Saudi Arabia"
  {:db/ident :fibo-be-ge-wasj/StateOfSaudiArabia,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/SaudiArabia,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheKingdomOfSaudiArabia,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "State of Saudi Arabia",
   :skos/definition "sovereign state and polity that is Saudi Arabia"})

(def StateOfSyria
  "sovereign state and polity that is Syria"
  {:db/ident :fibo-be-ge-wasj/StateOfSyria,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Syria,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheSyrianArabRepublic,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "State of Syria",
   :skos/definition "sovereign state and polity that is Syria"})

(def StateOfTurkey
  "sovereign state and polity that is Turkey"
  {:db/ident :fibo-be-ge-wasj/StateOfTurkey,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Turkey,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheRepublicOfTurkey,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "State of Turkey",
   :skos/definition "sovereign state and polity that is Turkey"})

(def StateOfUnitedArabEmirates
  "federated sovereignty and polity that is the United Arab Emirates"
  {:db/ident :fibo-be-ge-wasj/StateOfUnitedArabEmirates,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/UnitedArabEmirates,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheUnitedArabEmirates,
   :rdf/type [:fibo-be-ge-ge/FederatedSovereignty :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "State of United Arab Emirates",
   :skos/definition
   "federated sovereignty and polity that is the United Arab Emirates"})

(def StateOfYemen
  "sovereign state and polity that is Yemen"
  {:db/ident :fibo-be-ge-wasj/StateOfYemen,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Yemen,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-wasj/GovernmentOfTheRepublicOfYemen,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "State of Yemen",
   :skos/definition "sovereign state and polity that is Yemen"})