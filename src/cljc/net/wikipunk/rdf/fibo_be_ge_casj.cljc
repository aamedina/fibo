(ns net.wikipunk.rdf.fibo-be-ge-casj
  {:cmns-av/copyright
   #{"Copyright (c) 2021-2023 EDM Council, Inc."
     "Copyright (c) 2021-2023 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/AsianJurisdiction/CentralAsiaGovernmentEntitiesAndJurisdictions/",
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for countries that are defined as being part of Central Asia in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-ge-casj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/CentralAsiaGovernmentEntitiesAndJurisdictions/",
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
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/AsianJurisdiction/CentralAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-ge-casj",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/CentralAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Central Asia Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/CentralAsiaGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary.",
   :skos/scopeNote
   "The initial version of this ontology reflects the national level only.",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/CentralAsiaGovernmentEntitiesAndJurisdictions/"})

(def GovernmentOfTheKyrgyzRepublic
  {:db/ident :fibo-be-ge-casj/GovernmentOfTheKyrgyzRepublic,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-casj/JurisdictionOfTheKyrgyzRepublic,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Kyrgyzstan,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/CentralAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Kyrgyz Republic"}
                 {:rdf/language "ky",
                  :rdf/value    "Кыргыз Республикасы"}},
   :skos/definition
   "unitary parliamentary secular constitutional republic in Central Asia, bordered by Kazakhstan, Uzbekistan, Tajikistan, and China"})

(def GovernmentOfTheRepublicOfKazakhstan
  {:db/ident :fibo-be-ge-casj/GovernmentOfTheRepublicOfKazakhstan,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-casj/JurisdictionOfTheRepublicOfKazakhstan,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Kazakhstan,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/CentralAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Republic of Kazakhstan"}
                 {:rdf/language "kk",
                  :rdf/value    "Қазақстан Республикасы"}},
   :skos/definition
   "unitary dominant-party presidential constitutional republic in Central Asia, bordered by Russia in the north, China in the east, and Kyrgyzstan, Uzbekistan, and Turkmenistan in the south while also adjoining a large part of the Caspian Sea in the southwest"})

(def GovernmentOfTheRepublicOfTajikistan
  {:db/ident :fibo-be-ge-casj/GovernmentOfTheRepublicOfTajikistan,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-casj/JurisdictionOfTheRepublicOfTajikistan,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Tajikistan,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/CentralAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the Republic of Tajikistan"}
                 {:rdf/language "tg",
                  :rdf/value    "Ҷумҳурии Тоҷикистон"}},
   :skos/definition
   "unitary dominant-party presidential constitutional secular republic in Central Asia, bordered by Afghanistan to the south, Uzbekistan to the west, Kyrgyzstan to the north and China to the east"})

(def GovernmentOfTheRepublicOfUzbekistan
  {:db/ident :fibo-be-ge-casj/GovernmentOfTheRepublicOfUzbekistan,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-casj/JurisdictionOfTheRepublicOfUzbekistan,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Uzbekistan,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/CentralAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "uz",
                  :rdf/value    "Oʻzbekiston Respublikasi"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Republic of Uzbekistan"}},
   :skos/definition
   "unitary presidential constitutional secular republic in Central Asia, bordered by Kazakhstan to the north, Kyrgyzstan to the northeast, Tajikistan to the southeast, Afghanistan to the south, Turkmenistan and the autonomous republic of Karakalpakstan to the south-west"})

(def GovernmentOfTurkmenistan
  {:db/ident :fibo-be-ge-casj/GovernmentOfTurkmenistan,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-casj/JurisdictionOfTurkmenistan,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Turkmenistan,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/CentralAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "tk",
                  :rdf/value    "Türkmenistan"}
                 {:rdf/language "en",
                  :rdf/value    "Government of Turkmenistan"}},
   :skos/definition
   "unitary dominant-party presidential republic in Central Asia, bordered by Kazakhstan to the northwest, Uzbekistan to the north, east and northeast, Afghanistan to the southeast, Iran to the south and southwest and the Caspian Sea to the west"})

(def JurisdictionOfTheKyrgyzRepublic
  {:db/ident :fibo-be-ge-casj/JurisdictionOfTheKyrgyzRepublic,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-casj/GovernmentOfTheKyrgyzRepublic,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Kyrgyzstan,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/CentralAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the Kyrgyz Republic",
   :skos/definition
   "jurisdiction of the judiciary of Kyrgyzstan, which is the system of courts, including the Supreme Court, that interprets and applies the law in Kyrgyzstan"})

(def JurisdictionOfTheRepublicOfKazakhstan
  {:db/ident :fibo-be-ge-casj/JurisdictionOfTheRepublicOfKazakhstan,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-casj/GovernmentOfTheRepublicOfKazakhstan,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Kazakhstan,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/CentralAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the Republic of Kazakhstan",
   :skos/definition
   "jurisdiction of the judiciary of Kazakhstan, which is the system of courts that interprets and applies the law in Kazakhstan"})

(def JurisdictionOfTheRepublicOfTajikistan
  {:db/ident :fibo-be-ge-casj/JurisdictionOfTheRepublicOfTajikistan,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-casj/GovernmentOfTheRepublicOfTajikistan,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Tajikistan,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/CentralAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the Republic of Tajikistan",
   :skos/definition
   "jurisdiction of the judiciary of Tajikistan, which is the system of courts that interprets and applies the law in Tajikistan"})

(def JurisdictionOfTheRepublicOfUzbekistan
  {:db/ident :fibo-be-ge-casj/JurisdictionOfTheRepublicOfUzbekistan,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-casj/GovernmentOfTheRepublicOfUzbekistan,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Uzbekistan,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/CentralAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the Republic of Uzbekistan",
   :skos/definition
   "jurisdiction of the judiciary of Uzbekistan, which is the system of courts that interprets and applies the law in Uzbekistan"})

(def JurisdictionOfTurkmenistan
  {:db/ident :fibo-be-ge-casj/JurisdictionOfTurkmenistan,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-casj/GovernmentOfTurkmenistan,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Turkmenistan,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/CentralAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Turkmenistan",
   :skos/definition
   "jurisdiction of the judiciary of Turkmenistan, which is the system of courts, including the Supreme Court of Turkmenistan and its divisions, that interprets and applies the law in Turkmenistan"})

(def StateOfKazakhstan
  {:db/ident :fibo-be-ge-casj/StateOfKazakhstan,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Kazakhstan,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-casj/GovernmentOfTheRepublicOfKazakhstan,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/CentralAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "state of Kazakhstan",
   :skos/definition "sovereign state and polity that is Kazakhstan"})

(def StateOfKyrgyzstan
  {:db/ident :fibo-be-ge-casj/StateOfKyrgyzstan,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Kyrgyzstan,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-casj/GovernmentOfTheKyrgyzRepublic,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/CentralAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "state of Kyrgyzstan",
   :skos/definition "sovereign state and polity that is Kyrgyzstan"})

(def StateOfTajikistan
  {:db/ident :fibo-be-ge-casj/StateOfTajikistan,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Tajikistan,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-casj/GovernmentOfTheRepublicOfTajikistan,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/CentralAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "state of Tajikistan",
   :skos/definition "sovereign state and polity that is Tajikistan"})

(def StateOfTurkmenistan
  {:db/ident :fibo-be-ge-casj/StateOfTurkmenistan,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Turkmenistan,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-casj/GovernmentOfTurkmenistan,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/CentralAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "state of Turkmenistan",
   :skos/definition "sovereign state and polity that is Turkmenistan"})

(def StateOfUzbekistan
  {:db/ident :fibo-be-ge-casj/StateOfUzbekistan,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Uzbekistan,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-casj/GovernmentOfTheRepublicOfUzbekistan,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/CentralAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "state of Uzbekistan",
   :skos/definition "sovereign state and polity that is Uzbekistan"})

(def urn:uuid:d117e69f-041c-5961-981f-146b4e6c46db
  {:cmns-av/copyright
   #{"Copyright (c) 2021-2023 EDM Council, Inc."
     "Copyright (c) 2021-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for countries that are defined as being part of Central Asia in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective.",
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
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/AsianJurisdiction/CentralAsiaGovernmentEntitiesAndJurisdictions/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Central Asia Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/CentralAsiaGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary.",
   :skos/scopeNote
   "The initial version of this ontology reflects the national level only.",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/CentralAsiaGovernmentEntitiesAndJurisdictions/"})