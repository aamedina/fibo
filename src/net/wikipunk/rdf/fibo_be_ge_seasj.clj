(ns net.wikipunk.rdf.fibo-be-ge-seasj
  "This ontology provides government entities and jurisdictions for countries that are defined as being part of Southeastern Asia in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective."
  {:cmns-av/copyright ["Copyright (c) 2021-2023 EDM Council, Inc."
                       "Copyright (c) 2021-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for countries that are defined as being part of Southeastern Asia in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/GovernmentEntities/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-ge-ge"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/",
    "fibo-be-ge-seasj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
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
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfa/prefix "fibo-be-ge-seasj",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label
   "Southeastern Asia Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary.",
   :skos/scopeNote
   "The initial version of this ontology reflects the national level only."})

(def GovernmentOfMalaysia
  "federal parliamentary constitutional elective monarchy in Southeastern Asia, separated by the South China Sea into two regions, Peninsular Malaysia and Borneo's East Malaysia, that shares land and maritime borders with Thailand, Brunei, and Indonesia, and maritime borders with Singapore, Vietnam, and the Philippines"
  {:db/ident :fibo-be-ge-seasj/GovernmentOfMalaysia,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seasj/JurisdictionOfMalaysia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Malaysia,
   :rdf/type [:fibo-be-ge-ge/FederalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Government of Malaysia"},
   :skos/definition
   "federal parliamentary constitutional elective monarchy in Southeastern Asia, separated by the South China Sea into two regions, Peninsular Malaysia and Borneo's East Malaysia, that shares land and maritime borders with Thailand, Brunei, and Indonesia, and maritime borders with Singapore, Vietnam, and the Philippines"})

(def GovernmentOfTheDemocraticRepublicOfTimor-Leste
  "unitary semi-presidential constitutional republic in Southeastern Asia, an island country that comprises the eastern half of the island of Timor, the nearby islands of Atauro and Jaco, and Oecusse, an exclave on the northwestern side of the island surrounded by Indonesian West Timor"
  {:db/ident :fibo-be-ge-seasj/GovernmentOfTheDemocraticRepublicOfTimor-Leste,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-seasj/JurisdictionOfTheDemocraticRepublicOfTimor-Leste,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Timor-Leste,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "tet",
                 :rdf/value    "Repúblika Demokrátika Timór-Leste"}
                {:rdf/language "pt",
                 :rdf/value    "República Democrática de Timor-Leste"}
                {:rdf/language "en",
                 :rdf/value
                 "Government of the Democratic Republic of Timor-Leste"}],
   :skos/definition
   "unitary semi-presidential constitutional republic in Southeastern Asia, an island country that comprises the eastern half of the island of Timor, the nearby islands of Atauro and Jaco, and Oecusse, an exclave on the northwestern side of the island surrounded by Indonesian West Timor"})

(def GovernmentOfTheKingdomOfCambodia
  "unitary dominant-party parliamentary elective constitutional monarchy in Southeastern Asia, located in the southern portion of the Indochinese peninsula, bordered by Thailand to the northwest, Laos to the northeast, Vietnam to the east and the Gulf of Thailand to the southwest"
  {:db/ident :fibo-be-ge-seasj/GovernmentOfTheKingdomOfCambodia,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seasj/JurisdictionOfCambodia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Cambodia,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Government of the Kingdom of Cambodia"},
   :skos/definition
   "unitary dominant-party parliamentary elective constitutional monarchy in Southeastern Asia, located in the southern portion of the Indochinese peninsula, bordered by Thailand to the northwest, Laos to the northeast, Vietnam to the east and the Gulf of Thailand to the southwest"})

(def GovernmentOfTheLaoPeoplesDemocraticRepublic
  "unitary Marxist-Leninist one-party socialist republic in Southeastern Asia, located on the Indochinese Peninsula, bordered by Myanmar and China to the northwest, Vietnam to the east, Cambodia to the southeast and Thailand to the west and southwest"
  {:db/ident :fibo-be-ge-seasj/GovernmentOfTheLaoPeoplesDemocraticRepublic,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-seasj/JurisdictionOfTheLaoPeoplesDemocraticRepublic,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/LaoPeoplesDemocraticRepublic,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "lo",
                 :rdf/value    "ສາທາລະນະລັດ ປະຊາທິປະໄຕ ປະຊາຊົນລາວ"}
                {:rdf/language "en",
                 :rdf/value
                 "Government of the Lao People's Democratic Republic"}],
   :skos/definition
   "unitary Marxist-Leninist one-party socialist republic in Southeastern Asia, located on the Indochinese Peninsula, bordered by Myanmar and China to the northwest, Vietnam to the east, Cambodia to the southeast and Thailand to the west and southwest"})

(def GovernmentOfTheNationOfBruneiTheAbodeOfPeace
  "unitary Islamic absolute monarchy in Southeastern Asia, located on the north coast of the island of Borneo"
  {:db/ident :fibo-be-ge-seasj/GovernmentOfTheNationOfBruneiTheAbodeOfPeace,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seasj/JurisdictionOfBrunei,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/BruneiDarussalam,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "ms",
                 :rdf/value    "Negara Brunei Darussalam"}
                {:rdf/language "en",
                 :rdf/value
                 "Government of the Nation of Brunei, the Abode of Peace"}],
   :skos/definition
   "unitary Islamic absolute monarchy in Southeastern Asia, located on the north coast of the island of Borneo"})

(def GovernmentOfTheRepublicOfIndonesia
  "unitary presidential constitutional republic in Southeastern Asia, consisting of more than seventeen thousand islands, including Sumatra, Java, Sulawesi, and parts of Borneo and New Guinea, located between the Indian and Pacific oceans"
  {:db/ident :fibo-be-ge-seasj/GovernmentOfTheRepublicOfIndonesia,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-seasj/JurisdictionOfIndonesia,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Indonesia,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "id",
                 :rdf/value    "Republik Indonesia"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Republic of Indonesia"}],
   :skos/definition
   "unitary presidential constitutional republic in Southeastern Asia, consisting of more than seventeen thousand islands, including Sumatra, Java, Sulawesi, and parts of Borneo and New Guinea, located between the Indian and Pacific oceans"})

(def GovernmentOfTheRepublicOfSingapore
  "unitary dominant-party parliamentary constitutional republic in Southeastern Asia, located off the southern tip of the Malay Peninsula, bordering the Straits of Malacca to the west, the Riau Islands (Indonesia) to the south, and the South China Sea to the east"
  {:db/ident :fibo-be-ge-seasj/GovernmentOfTheRepublicOfSingapore,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-seasj/JurisdictionOfTheRepublicOfSingapore,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Singapore,
   :rdf/type [:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "ta",
                 :rdf/value    "சிங்கப்பூர் குடியரசு"}
                {:rdf/language "ms",
                 :rdf/value    "Republik Singapura"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Republic of Singapore"}
                {:rdf/language "zh",
                 :rdf/value    "新加坡共和国"}],
   :skos/definition
   "unitary dominant-party parliamentary constitutional republic in Southeastern Asia, located off the southern tip of the Malay Peninsula, bordering the Straits of Malacca to the west, the Riau Islands (Indonesia) to the south, and the South China Sea to the east"})

(def GovernmentOfTheRepublicOfThePhilippines
  "unitary presidential constitutional republic in Southeastern Asia, an archipelagic country bordered by the South China Sea to the west, the Philippine Sea to the east, and the Celebes Sea to the southwest, and shares maritime borders with Taiwan to the north, Japan to the northeast, Palau to the east and southeast, Indonesia to the south, Malaysia and Brunei to the southwest, Vietnam to the west, and China to the northwest"
  {:db/ident :fibo-be-ge-seasj/GovernmentOfTheRepublicOfThePhilippines,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-seasj/JurisdictionOfTheRepublicOfThePhilippines,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Philippines,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "tl",
                 :rdf/value    "Republika ng Pilipinas"}
                {:rdf/language "en",
                 :rdf/value "Government of the Republic of the Philippines"}],
   :rdfs/seeAlso ["https://www.gov.ph/"],
   :skos/definition
   "unitary presidential constitutional republic in Southeastern Asia, an archipelagic country bordered by the South China Sea to the west, the Philippine Sea to the east, and the Celebes Sea to the southwest, and shares maritime borders with Taiwan to the north, Japan to the northeast, Palau to the east and southeast, Indonesia to the south, Malaysia and Brunei to the southwest, Vietnam to the west, and China to the northwest"})

(def GovernmentOfTheRepublicOfTheUnionOfMyanmar
  "unitary parliamentary assembly-independent republic under a military junta in Southeastern Asia, bordered by Bangladesh and India to its northwest, China to its northeast, Laos and Thailand to its east and southeast, and the Andaman Sea and the Bay of Bengal to its south and southwest"
  {:db/ident :fibo-be-ge-seasj/GovernmentOfTheRepublicOfTheUnionOfMyanmar,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-seasj/JurisdictionOfTheRepublicOfTheUnionOfMyanmar,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Myanmar,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "my",
                 :rdf/value    "ပြည်ထောင်စု သမ္မတ မြန်မာနိုင်ငံတော်"}
                {:rdf/language "en",
                 :rdf/value
                 "Government of the Republic of the Union of Myanmar"}],
   :skos/definition
   "unitary parliamentary assembly-independent republic under a military junta in Southeastern Asia, bordered by Bangladesh and India to its northwest, China to its northeast, Laos and Thailand to its east and southeast, and the Andaman Sea and the Bay of Bengal to its south and southwest"})

(def GovernmentOfTheSocialistRepublicOfVietNam
  "unitary Marxist-Leninist one-party socialist republic in Southeastern Asia, located at the eastern edge of the Indochinese Peninsula, bordering China to the north, and Laos and Cambodia to the west; while maintaining maritime borders with Thailand through the Gulf of Thailand, and the Philippines, Indonesia and Malaysia through the South China Sea"
  {:db/ident :fibo-be-ge-seasj/GovernmentOfTheSocialistRepublicOfVietNam,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-seasj/JurisdictionOfTheSocialistRepublicOfVietNam,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/VietNam,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value "Government of the Socialist Republic of Viet Nam"}
                {:rdf/language "vi",
                 :rdf/value    "Cộng hòa Xã hội chủ nghĩa Việt Nam"}],
   :skos/definition
   "unitary Marxist-Leninist one-party socialist republic in Southeastern Asia, located at the eastern edge of the Indochinese Peninsula, bordering China to the north, and Laos and Cambodia to the west; while maintaining maritime borders with Thailand through the Gulf of Thailand, and the Philippines, Indonesia and Malaysia through the South China Sea"})

(def JurisdictionOfBrunei
  "jurisdiction of the judiciary of Brunei, which is the system of courts that interprets and applies the law in Brunei"
  {:db/ident :fibo-be-ge-seasj/JurisdictionOfBrunei,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seasj/GovernmentOfTheNationOfBruneiTheAbodeOfPeace,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/BruneiDarussalam,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of Brunei",
   :skos/definition
   "jurisdiction of the judiciary of Brunei, which is the system of courts that interprets and applies the law in Brunei"})

(def JurisdictionOfCambodia
  "jurisdiction of the judiciary of Cambodia, which is the system of courts that interprets and applies the law in Cambodia"
  {:db/ident :fibo-be-ge-seasj/JurisdictionOfCambodia,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seasj/GovernmentOfTheKingdomOfCambodia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Cambodia,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of Cambodia",
   :skos/definition
   "jurisdiction of the judiciary of Cambodia, which is the system of courts that interprets and applies the law in Cambodia"})

(def JurisdictionOfIndonesia
  "jurisdiction of the judiciary of Indonesia, which is the system of courts, including the Supreme Court of Indonesia, that interprets and applies the law in Indonesia"
  {:db/ident :fibo-be-ge-seasj/JurisdictionOfIndonesia,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seasj/GovernmentOfTheRepublicOfIndonesia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Indonesia,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of Indonesia",
   :skos/definition
   "jurisdiction of the judiciary of Indonesia, which is the system of courts, including the Supreme Court of Indonesia, that interprets and applies the law in Indonesia"})

(def JurisdictionOfMalaysia
  "jurisdiction of the judiciary of Malaysia, which is the system of courts, including the Federal Court of Malaysia, that interprets and applies the law in Malaysia"
  {:db/ident :fibo-be-ge-seasj/JurisdictionOfMalaysia,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-seasj/GovernmentOfMalaysia,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Malaysia,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of Malaysia",
   :rdfs/seeAlso ["http://www.kehakiman.gov.my/"],
   :skos/definition
   "jurisdiction of the judiciary of Malaysia, which is the system of courts, including the Federal Court of Malaysia, that interprets and applies the law in Malaysia"})

(def JurisdictionOfTheDemocraticRepublicOfTimor-Leste
  "jurisdiction of the judiciary of Timor-Leste, which is the system of courts that interprets and applies the law in Timor-Leste"
  {:db/ident :fibo-be-ge-seasj/JurisdictionOfTheDemocraticRepublicOfTimor-Leste,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seasj/GovernmentOfTheDemocraticRepublicOfTimor-Leste,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Timor-Leste,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the Democratic Republic of Timor-Leste",
   :skos/definition
   "jurisdiction of the judiciary of Timor-Leste, which is the system of courts that interprets and applies the law in Timor-Leste"})

(def JurisdictionOfTheLaoPeoplesDemocraticRepublic
  "jurisdiction of the judiciary of the Lao People's Democratic Republic, which is the system of courts that interprets and applies the law in Laos"
  {:db/ident :fibo-be-ge-seasj/JurisdictionOfTheLaoPeoplesDemocraticRepublic,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seasj/GovernmentOfTheLaoPeoplesDemocraticRepublic,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/LaoPeoplesDemocraticRepublic,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the Lao People's Democratic Republic",
   :skos/definition
   "jurisdiction of the judiciary of the Lao People's Democratic Republic, which is the system of courts that interprets and applies the law in Laos"})

(def JurisdictionOfTheRepublicOfSingapore
  "jurisdiction of the judiciary of Singapore, which is the system of courts, including the Supreme Court and State Courts, that interprets and applies the law in Singapore"
  {:db/ident :fibo-be-ge-seasj/JurisdictionOfTheRepublicOfSingapore,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seasj/GovernmentOfTheRepublicOfSingapore,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Singapore,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the Republic of Singapore",
   :rdfs/seeAlso ["http://www.supremecourt.gov.sg/"],
   :skos/definition
   "jurisdiction of the judiciary of Singapore, which is the system of courts, including the Supreme Court and State Courts, that interprets and applies the law in Singapore"})

(def JurisdictionOfTheRepublicOfThePhilippines
  "jurisdiction of the judiciary of the Philippines, which is the system of courts, including the Supreme Court of the Philippines, that interprets and applies the law in the Philippines"
  {:db/ident :fibo-be-ge-seasj/JurisdictionOfTheRepublicOfThePhilippines,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seasj/GovernmentOfTheRepublicOfThePhilippines,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Philippines,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the Republic of the Philippines",
   :rdfs/seeAlso ["http://sc.judiciary.gov.ph/"],
   :skos/definition
   "jurisdiction of the judiciary of the Philippines, which is the system of courts, including the Supreme Court of the Philippines, that interprets and applies the law in the Philippines"})

(def JurisdictionOfTheRepublicOfTheUnionOfMyanmar
  "jurisdiction of the judiciary of Myanmar, which is the system of courts that interprets and applies the law in Myanmar"
  {:db/ident :fibo-be-ge-seasj/JurisdictionOfTheRepublicOfTheUnionOfMyanmar,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seasj/GovernmentOfTheRepublicOfTheUnionOfMyanmar,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Myanmar,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the Republic of the Union of Myanmar",
   :skos/definition
   "jurisdiction of the judiciary of Myanmar, which is the system of courts that interprets and applies the law in Myanmar"})

(def JurisdictionOfTheRoyalThaiGovernment
  "jurisdiction of the judiciary of Thailand, which is the system of courts that interprets and applies the law in Thailand"
  {:db/ident :fibo-be-ge-seasj/JurisdictionOfTheRoyalThaiGovernment,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-seasj/RoyalThaiGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Thailand,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the Royal Thai Government",
   :skos/definition
   "jurisdiction of the judiciary of Thailand, which is the system of courts that interprets and applies the law in Thailand"})

(def JurisdictionOfTheSocialistRepublicOfVietNam
  "jurisdiction of the judiciary of Viet Nam, which is the system of courts, including the Supreme People's Court of Viet Nam, that interprets and applies the law in the Viet Nam"
  {:db/ident :fibo-be-ge-seasj/JurisdictionOfTheSocialistRepublicOfVietNam,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-seasj/GovernmentOfTheSocialistRepublicOfVietNam,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/VietNam,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the Socialist Republic of Viet Nam",
   :rdfs/seeAlso ["http://www.toaan.gov.vn/"],
   :skos/definition
   "jurisdiction of the judiciary of Viet Nam, which is the system of courts, including the Supreme People's Court of Viet Nam, that interprets and applies the law in the Viet Nam"})

(def RoyalThaiGovernment
  "unitary military-junta constitutional monarchy in Southeastern Asia, bordered to the north by Myanmar and Laos, to the east by Laos and Cambodia, to the south by the Gulf of Thailand and Malaysia, and to the west by the Andaman Sea and the southern extremity of Myanmar, and sharing maritime borders with Vietnam in the Gulf of Thailand to the southeast, and Indonesia and India on the Andaman Sea to the southwest"
  {:db/ident :fibo-be-ge-seasj/RoyalThaiGovernment,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-seasj/JurisdictionOfTheRoyalThaiGovernment,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Thailand,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "th",
                 :rdf/value    "รัฐบาลไทย"}
                {:rdf/language "en",
                 :rdf/value    "Royal Thai Government"}],
   :skos/definition
   "unitary military-junta constitutional monarchy in Southeastern Asia, bordered to the north by Myanmar and Laos, to the east by Laos and Cambodia, to the south by the Gulf of Thailand and Malaysia, and to the west by the Andaman Sea and the southern extremity of Myanmar, and sharing maritime borders with Vietnam in the Gulf of Thailand to the southeast, and Indonesia and India on the Andaman Sea to the southwest"})

(def StateOfBrunei
  "sovereign state and polity that is Brunei"
  {:db/ident :fibo-be-ge-seasj/StateOfBrunei,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/BruneiDarussalam,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seasj/GovernmentOfTheNationOfBruneiTheAbodeOfPeace,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of Brunei",
   :skos/definition "sovereign state and polity that is Brunei"})

(def StateOfCambodia
  "sovereign state and polity that is Cambodia"
  {:db/ident :fibo-be-ge-seasj/StateOfCambodia,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Cambodia,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seasj/GovernmentOfTheKingdomOfCambodia,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of Cambodia",
   :skos/definition "sovereign state and polity that is Cambodia"})

(def StateOfIndonesia
  "sovereign state and polity that is Indonesia"
  {:db/ident :fibo-be-ge-seasj/StateOfIndonesia,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Indonesia,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seasj/GovernmentOfTheRepublicOfIndonesia,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of Indonesia",
   :skos/definition "sovereign state and polity that is Indonesia"})

(def StateOfLaos
  "sovereign state and polity that is the Lao People's Democratic Republic"
  {:db/ident :fibo-be-ge-seasj/StateOfLaos,
   :fibo-be-ge-ge/hasFullSovereigntyOver
   :lcc-3166-1/LaoPeoplesDemocraticRepublic,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seasj/GovernmentOfTheLaoPeoplesDemocraticRepublic,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of Laos",
   :skos/definition
   "sovereign state and polity that is the Lao People's Democratic Republic"})

(def StateOfMalaysia
  "federated sovereignty and polity that is Malaysia"
  {:db/ident :fibo-be-ge-seasj/StateOfMalaysia,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Malaysia,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-seasj/GovernmentOfMalaysia,
   :rdf/type [:fibo-be-ge-ge/FederatedSovereignty :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of Malaysia",
   :skos/definition "federated sovereignty and polity that is Malaysia"})

(def StateOfMyanmar
  "sovereign state and polity that is Myanmar"
  {:db/ident :fibo-be-ge-seasj/StateOfMyanmar,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Myanmar,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seasj/GovernmentOfTheRepublicOfTheUnionOfMyanmar,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of Myanmar",
   :skos/definition "sovereign state and polity that is Myanmar"})

(def StateOfSingapore
  "sovereign state and polity that is Singapore"
  {:db/ident :fibo-be-ge-seasj/StateOfSingapore,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Singapore,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seasj/GovernmentOfTheRepublicOfSingapore,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of Singapore",
   :skos/definition "sovereign state and polity that is Singapore"})

(def StateOfThailand
  "sovereign state and polity that is Thailand"
  {:db/ident :fibo-be-ge-seasj/StateOfThailand,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Thailand,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-seasj/RoyalThaiGovernment,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of Thailand",
   :skos/definition "sovereign state and polity that is Thailand"})

(def StateOfThePhilippines
  "sovereign state and polity that is the Philippines"
  {:db/ident :fibo-be-ge-seasj/StateOfThePhilippines,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Philippines,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seasj/GovernmentOfTheRepublicOfThePhilippines,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of the Philippines",
   :skos/definition "sovereign state and polity that is the Philippines"})

(def StateOfTimor-Leste
  "sovereign state and polity that is Timor-Leste"
  {:db/ident :fibo-be-ge-seasj/StateOfTimor-Leste,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Timor-Leste,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seasj/GovernmentOfTheDemocraticRepublicOfTimor-Leste,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of Timor-Leste",
   :skos/definition "sovereign state and polity that is Timor-Leste"})

(def StateOfVietNam
  "sovereign state and polity that is Viet Nam"
  {:db/ident :fibo-be-ge-seasj/StateOfVietNam,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/VietNam,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-seasj/GovernmentOfTheSocialistRepublicOfVietNam,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "state of Viet Nam",
   :skos/definition "sovereign state and polity that is Viet Nam"})