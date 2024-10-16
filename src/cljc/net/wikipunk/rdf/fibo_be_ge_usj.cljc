(ns net.wikipunk.rdf.fibo-be-ge-usj
  {:cmns-av/copyright #{"Copyright (c) 2016-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/",
   :dcterms/abstract
   "This ontology provides the set of basic federal government, state, and territory level entities and jurisdictions for use in other US-specific FIBO ontologies.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-ge-ge"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/",
    "fibo-be-ge-usj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-3166-2-us"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/IdentifiersAndIndices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-ge-usj",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "US Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to address text formatting hygiene issues."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to replace references to the legacy LCC UnitedStates country representation with UnitedStatesOfAmerica."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"})

(def AmericanSamoaEntity
  {:cmns-av/explanatoryNote
   "American Samoa consists of five main islands and two coral atolls. The largest and most populous island is Tutuila, with the Manu'a Islands, Rose Atoll, and Swains Island also included in the territory. American Samoa is part of the Samoan Islands chain, located west of the Cook Islands, north of Tonga, and some 300 miles (500 km) south of Tokelau.",
   :db/ident :fibo-be-ge-usj/AmericanSamoaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/AmericanSamoa,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/GovernmentOfAmericanSamoa,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "American Samoa entity",
   :rdfs/seeAlso #{{:xsd/anyURI
                    "https://www.doi.gov/oia/islands/american-samoa"}
                   {:xsd/anyURI "http://americansamoa.gov/"}},
   :skos/definition
   "individual representing the unincorporated territory and polity of the United States located in the South Pacific Ocean, known as American Samoa"})

(def AmericanSamoaJurisdiction
  {:db/ident :fibo-be-ge-usj/AmericanSamoaJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/GovernmentOfAmericanSamoa,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/AmericanSamoa,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "American Samoa jurisdiction",
   :rdfs/seeAlso #{{:xsd/anyURI
                    "https://www.doi.gov/oia/islands/american-samoa"}
                   {:xsd/anyURI "http://americansamoa.gov/"}},
   :skos/definition
   "individual representing the jurisdiction of the US territory of American Samoa"})

(def CommonwealthOfPuertoRicoEntity
  {:db/ident :fibo-be-ge-usj/CommonwealthOfPuertoRicoEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/PuertoRico,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/GovernmentOfPuertoRico,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Commonwealth of Puerto Rico entity",
   :rdfs/seeAlso #{{:xsd/anyURI "http://prfaa.pr.gov/"}
                   {:xsd/anyURI "https://en.wikipedia.org/wiki/Puerto_Rico"}},
   :skos/definition
   "individual representing the unincorporated territory and polity for the Commonwealth of Puerto Rico"})

(def CommonwealthOfTheNorthernMarianaIslandsEntity
  {:cmns-av/abbreviation "CMNI",
   :db/ident :fibo-be-ge-usj/CommonwealthOfTheNorthernMarianaIslandsEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver
   :lcc-3166-2-us/NorthernMarianaIslands,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-usj/GovernmentOfNorthernMarianaIslands,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Commonwealth of the Northern Mariana Islands entity",
   :rdfs/seeAlso #{{:xsd/anyURI "https://www.doi.gov/oia/islands/cnmi"}
                   {:xsd/anyURI "http://gov.mp/"}},
   :skos/definition
   "individual representing the unincorporated territory and polity for the Commonwealth of the Northern Mariana Islands"})

(def DistrictOfColumbiaEntity
  {:cmns-av/synonym "Washington, D.C. entity",
   :db/ident :fibo-be-ge-usj/DistrictOfColumbiaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/DistrictOfColumbia,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/DistrictOfColumbiaGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "District of Columbia entity",
   :rdfs/seeAlso #{{:xsd/anyURI "http://dc.gov/"}
                   {:xsd/anyURI
                    "https://en.wikipedia.org/wiki/Washington,_D.C."}},
   :skos/definition
   "individual representing the federal district and polity that is the US District of Columbia, also known as 'Washington, D.C.', 'Washington', 'the District', and 'D.C.', that is, the capital of the United States"})

(def DistrictOfColumbiaGovernment
  {:db/ident :fibo-be-ge-usj/DistrictOfColumbiaGovernment,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-usj/DistrictOfColumbiaJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/DistrictOfColumbia,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "District of Columbia government",
   :rdfs/seeAlso {:xsd/anyURI "http://dc.gov/page/government-resource-center"},
   :skos/definition
   "individual representing the government of the US District of Columbia, also known as Washington, D.C."})

(def DistrictOfColumbiaJurisdiction
  {:cmns-av/explanatoryNote
   "Article One, Section Eight of the United States Constitution grants the U.S. Congress 'exclusive jurisdiction' over the city. The District did not have an elected local government until the passage of the 1973 Home Rule Act. The Act devolved certain Congressional powers to an elected mayor and the thirteen-member Council of the District of Columbia. However, Congress retains the right to review and overturn laws created by the council and intervene in local affairs. Jurisdiction is shared among numerous federal agencies, the attorney general for the District, and Congress today. Actions requiring litigation in court may be addressed in the District of Columbia Superior Court or Court of Appeals, or in Federal Court, depending on the issue.",
   :db/ident :fibo-be-ge-usj/DistrictOfColumbiaJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/DistrictOfColumbiaGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/DistrictOfColumbia,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "District of Columbia jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.dccourts.gov/internet/"},
   :skos/definition
   "individual representing the jurisdiction of the US District of Columbia, also known as Washington, D.C."})

(def GovernmentOfAmericanSamoa
  {:db/ident :fibo-be-ge-usj/GovernmentOfAmericanSamoa,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/AmericanSamoaJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/AmericanSamoa,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "government of American Samoa",
   :rdfs/seeAlso #{{:xsd/anyURI
                    "https://www.doi.gov/oia/islands/american-samoa"}
                   {:xsd/anyURI "http://americansamoa.gov/"}},
   :skos/definition
   "individual representing the government of the US territory of American Samoa"})

(def GovernmentOfGuam
  {:db/ident :fibo-be-ge-usj/GovernmentOfGuam,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/GuamJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Guam,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "government of Guam",
   :rdfs/seeAlso #{{:xsd/anyURI "https://www.doi.gov/oia/islands/guam"}
                   {:xsd/anyURI "http://www.guam.gov/"}},
   :skos/definition
   "individual representing the government of the US territory of Guam"})

(def GovernmentOfNorthernMarianaIslands
  {:db/ident :fibo-be-ge-usj/GovernmentOfNorthernMarianaIslands,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-usj/NorthernMarianaIslandsJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/NorthernMarianaIslands,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "government of the Northern Mariana Islands",
   :rdfs/seeAlso #{{:xsd/anyURI "https://www.doi.gov/oia/islands/cnmi"}
                   {:xsd/anyURI "http://gov.mp/"}},
   :skos/definition
   "individual representing the government of the US territory of the Commonwealth of the Northern Mariana Islands"})

(def GovernmentOfPuertoRico
  {:db/ident :fibo-be-ge-usj/GovernmentOfPuertoRico,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/PuertoRicoJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/PuertoRico,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "government of Puerto Rico",
   :rdfs/seeAlso #{{:xsd/anyURI "http://prfaa.pr.gov/"}
                   {:xsd/anyURI "https://en.wikipedia.org/wiki/Puerto_Rico"}},
   :skos/definition
   "individual representing the government of the US territory of the Commonwealth of Puerto Rico"})

(def GovernmentOfVirginIslands
  {:db/ident :fibo-be-ge-usj/GovernmentOfVirginIslands,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/VirginIslandsJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/VirginIslands,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "government of the Virgin Islands (USA)",
   :rdfs/seeAlso #{{:xsd/anyURI "http://www.vi.gov/"}
                   {:xsd/anyURI
                    "https://www.doi.gov/oia/islands/virgin-islands"}},
   :skos/definition
   "individual representing the government of the US territory of the Virgin Islands"})

(def GuamEntity
  {:db/ident :fibo-be-ge-usj/GuamEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Guam,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/GovernmentOfGuam,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Guam entity",
   :rdfs/seeAlso #{{:xsd/anyURI "https://www.doi.gov/oia/islands/guam"}
                   {:xsd/anyURI "http://www.guam.gov/"}},
   :skos/definition
   "individual representing the unincorporated territory and polity for the island of Guam"})

(def GuamJurisdiction
  {:db/ident :fibo-be-ge-usj/GuamJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/GovernmentOfGuam,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Guam,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Guam jurisdiction",
   :rdfs/seeAlso #{{:xsd/anyURI "https://www.doi.gov/oia/islands/guam"}
                   {:xsd/anyURI "http://www.guam.gov/"}},
   :skos/definition
   "individual representing the jurisdiction of the US territory of Guam"})

(def NorthernMarianaIslandsJurisdiction
  {:db/ident :fibo-be-ge-usj/NorthernMarianaIslandsJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-usj/GovernmentOfNorthernMarianaIslands,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/NorthernMarianaIslands,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Northern Mariana Islands jurisdiction",
   :rdfs/seeAlso #{{:xsd/anyURI "https://www.doi.gov/oia/islands/cnmi"}
                   {:xsd/anyURI "http://gov.mp/"}},
   :skos/definition
   "individual representing the jurisdiction of the US territory of the Commonwealth of the Northern Mariana Islands"})

(def PuertoRicoJurisdiction
  {:db/ident :fibo-be-ge-usj/PuertoRicoJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/GovernmentOfPuertoRico,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/PuertoRico,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Puerto Rico jurisdiction",
   :rdfs/seeAlso #{{:xsd/anyURI "http://prfaa.pr.gov/"}
                   {:xsd/anyURI "https://en.wikipedia.org/wiki/Puerto_Rico"}},
   :skos/definition
   "individual representing the jurisdiction of the US territory of the Commonwealth of Puerto Rico"})

(def StateOfAlabamaEntity
  {:db/ident :fibo-be-ge-usj/StateOfAlabamaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Alabama,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfAlabamaGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Alabama entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.alabama.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Alabama"})

(def StateOfAlabamaGovernment
  {:db/ident :fibo-be-ge-usj/StateOfAlabamaGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfAlabamaJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Alabama,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Alabama government",
   :rdfs/seeAlso {:xsd/anyURI "http://www.alabama.gov/#government"},
   :skos/definition
   "individual representing the regional government of the State of Alabama"})

(def StateOfAlabamaJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfAlabamaJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfAlabamaGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Alabama,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Alabama jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://judicial.alabama.gov/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Alabama, i.e., that of the Supreme Court of Alabama and Alabama's Unified Judicial System"})

(def StateOfAlaskaEntity
  {:db/ident :fibo-be-ge-usj/StateOfAlaskaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Alaska,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfAlaskaGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Alaska entity",
   :rdfs/seeAlso {:xsd/anyURI "http://alaska.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Alaska"})

(def StateOfAlaskaGovernment
  {:db/ident :fibo-be-ge-usj/StateOfAlaskaGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfAlaskaJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Alaska,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Alaska government",
   :rdfs/seeAlso {:xsd/anyURI "http://alaska.gov/akdir1.html"},
   :skos/definition
   "individual representing the regional government of the State of Alaska"})

(def StateOfAlaskaJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfAlaskaJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfAlaskaGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Alaska,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Alaska jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.courts.alaska.gov/ctinfo.htm"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Alaska, i.e., that of the Alaska Supreme Court and Alaska Court System"})

(def StateOfArizonaEntity
  {:db/ident :fibo-be-ge-usj/StateOfArizonaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Arizona,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfArizonaGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Arizona entity",
   :rdfs/seeAlso {:xsd/anyURI "https://az.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Arizona"})

(def StateOfArizonaGovernment
  {:db/ident :fibo-be-ge-usj/StateOfArizonaGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfArizonaJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Arizona,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Arizona government",
   :rdfs/seeAlso {:xsd/anyURI "https://az.gov/government"},
   :skos/definition
   "individual representing the regional government of the State of Arizona"})

(def StateOfArizonaJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfArizonaJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfArizonaGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Arizona,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Arizona jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.azcourts.gov/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Arizona, i.e., that of the Arizona Supreme Court and Arizona Judicial System"})

(def StateOfArkansasEntity
  {:db/ident :fibo-be-ge-usj/StateOfArkansasEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Arkansas,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfArkansasGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Arkansas entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.arkansas.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Arkansas"})

(def StateOfArkansasGovernment
  {:db/ident :fibo-be-ge-usj/StateOfArkansasGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfArkansasJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Arkansas,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Arkansas government",
   :rdfs/seeAlso {:xsd/anyURI "http://www.arkansas.gov/government/"},
   :skos/definition
   "individual representing the regional government of the State of Arkansas"})

(def StateOfArkansasJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfArkansasJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfArkansasGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Arkansas,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Arkansas jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "https://courts.arkansas.gov/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Arkansas, i.e., that of the Arkansas Supreme Court and Judiciary System"})

(def StateOfCaliforniaEntity
  {:db/ident :fibo-be-ge-usj/StateOfCaliforniaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/California,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfCaliforniaGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of California entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.ca.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of California"})

(def StateOfCaliforniaGovernment
  {:db/ident :fibo-be-ge-usj/StateOfCaliforniaGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfCaliforniaJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/California,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of California government",
   :rdfs/seeAlso {:xsd/anyURI "http://www.ca.gov/Government"},
   :skos/definition
   "individual representing the regional government of the State of California"})

(def StateOfCaliforniaJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfCaliforniaJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfCaliforniaGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/California,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of California jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.ca.gov/Agencies/Courts-California"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of California, i.e., that of the California Supreme Court and Judiciary of California"})

(def StateOfColoradoEntity
  {:db/ident :fibo-be-ge-usj/StateOfColoradoEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Colorado,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfColoradoGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Colorado entity",
   :rdfs/seeAlso {:xsd/anyURI "https://www.colorado.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Colorado"})

(def StateOfColoradoGovernment
  {:db/ident :fibo-be-ge-usj/StateOfColoradoGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfColoradoJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Colorado,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Colorado government",
   :rdfs/seeAlso {:xsd/anyURI "https://www.colorado.gov/cogov-now"},
   :skos/definition
   "individual representing the regional government of the State of Colorado"})

(def StateOfColoradoJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfColoradoJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfColoradoGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Colorado,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Colorado jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.courts.state.co.us/Courts/Index.cfm"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Colorado, i.e., that of the Colorado Supreme Court and Colorado Judicial System"})

(def StateOfConnecticutEntity
  {:db/ident :fibo-be-ge-usj/StateOfConnecticutEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Connecticut,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfConnecticutGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Connecticut entity",
   :rdfs/seeAlso {:xsd/anyURI "https://www.colorado.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Connecticut"})

(def StateOfConnecticutGovernment
  {:db/ident :fibo-be-ge-usj/StateOfConnecticutGovernment,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-usj/StateOfConnecticutJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Connecticut,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Connecticut government",
   :rdfs/seeAlso {:xsd/anyURI "http://portal.ct.gov/government/"},
   :skos/definition
   "individual representing the regional government of the State of Connecticut"})

(def StateOfConnecticutJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfConnecticutJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfConnecticutGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Connecticut,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Connecticut jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.jud.ct.gov/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Connecticut, i.e., that of the Connecticut Supreme Court and State of Connecticut Judicial System"})

(def StateOfDelawareEntity
  {:db/ident :fibo-be-ge-usj/StateOfDelawareEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Delaware,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfDelawareGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Delaware entity",
   :rdfs/seeAlso {:xsd/anyURI "http://delaware.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Delaware"})

(def StateOfDelawareGovernment
  {:db/ident :fibo-be-ge-usj/StateOfDelawareGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Delaware,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Delaware government",
   :rdfs/seeAlso {:xsd/anyURI "http://delaware.gov/"},
   :skos/definition
   "individual representing the regional government of the State of Delaware"})

(def StateOfDelawareJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfDelawareGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Delaware,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Delaware jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://courts.delaware.gov/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Delaware, i.e., that of the Delaware Supreme Court, Court of Chancery, and Judiciary System"})

(def StateOfFloridaEntity
  {:db/ident :fibo-be-ge-usj/StateOfFloridaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Florida,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfFloridaGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Florida entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.myflorida.com/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Florida"})

(def StateOfFloridaGovernment
  {:db/ident :fibo-be-ge-usj/StateOfFloridaGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfFloridaJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Florida,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Florida government",
   :rdfs/seeAlso {:xsd/anyURI "http://www.myflorida.com/taxonomy/government/"},
   :skos/definition
   "individual representing the regional government of the State of Florida"})

(def StateOfFloridaJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfFloridaJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfFloridaGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Florida,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Florida jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.flcourts.org/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Florida, i.e., that of the Florida Supreme Court and State Courts System of Florida"})

(def StateOfGeorgiaEntity
  {:db/ident :fibo-be-ge-usj/StateOfGeorgiaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Georgia,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfGeorgiaGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Georgia entity",
   :rdfs/seeAlso {:xsd/anyURI "http://georgia.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Georgia"})

(def StateOfGeorgiaGovernment
  {:db/ident :fibo-be-ge-usj/StateOfGeorgiaGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfGeorgiaJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Georgia,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Georgia government",
   :rdfs/seeAlso {:xsd/anyURI "http://georgia.gov/georgia-government"},
   :skos/definition
   "individual representing the regional government of the State of Georgia"})

(def StateOfGeorgiaJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfGeorgiaJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfGeorgiaGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Georgia,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Georgia jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.gasupreme.us/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Georgia, i.e., that of the Supreme Court of Georgia and Judiciary System"})

(def StateOfHawaiiEntity
  {:db/ident :fibo-be-ge-usj/StateOfHawaiiEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Hawaii,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfHawaiiGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Hawai'i entity",
   :rdfs/seeAlso {:xsd/anyURI "https://portal.ehawaii.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Hawai'i"})

(def StateOfHawaiiGovernment
  {:db/ident :fibo-be-ge-usj/StateOfHawaiiGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfHawaiiJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Hawaii,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Hawai'i government",
   :rdfs/seeAlso {:xsd/anyURI "https://portal.ehawaii.gov/government/"},
   :skos/definition
   "individual representing the regional government of the State of Hawai'i"})

(def StateOfHawaiiJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfHawaiiJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfHawaiiGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Hawaii,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Hawai'i jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.courts.state.hi.us/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Hawai'i, i.e., that of the Hawai'i Supreme Court and Hawai'i State Judiciary"})

(def StateOfIdahoEntity
  {:db/ident :fibo-be-ge-usj/StateOfIdahoEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Idaho,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfIdahoGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Idaho entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.idaho.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Idaho"})

(def StateOfIdahoGovernment
  {:db/ident :fibo-be-ge-usj/StateOfIdahoGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfIdahoJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Idaho,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Idaho government",
   :rdfs/seeAlso {:xsd/anyURI "http://www.idaho.gov/government/index.html"},
   :skos/definition
   "individual representing the regional government of the State of Idaho"})

(def StateOfIdahoJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfIdahoJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfIdahoGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Idaho,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Idaho jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.idaho.gov/government/judicial.html"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Idaho, i.e., that of the Idaho Supreme Court and Judiciary"})

(def StateOfIllinoisEntity
  {:db/ident :fibo-be-ge-usj/StateOfIllinoisEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Illinois,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfIllinoisGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Illinois entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.illinois.gov/Pages/default.aspx"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Illinois"})

(def StateOfIllinoisGovernment
  {:db/ident :fibo-be-ge-usj/StateOfIllinoisGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfIllinoisJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Illinois,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Illinois government",
   :rdfs/seeAlso {:xsd/anyURI
                  "http://www.illinois.gov/government/Pages/default.aspx"},
   :skos/definition
   "individual representing the regional government of the State of Illinois"})

(def StateOfIllinoisJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfIllinoisJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfIllinoisGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Illinois,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Illinois jurisdiction",
   :rdfs/seeAlso
   {:xsd/anyURI "http://www.illinois.gov/Government/Pages/JudicialBranch.aspx"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Illinois, i.e., that of the Illinois Supreme Court and Judiciary"})

(def StateOfIndianaEntity
  {:db/ident :fibo-be-ge-usj/StateOfIndianaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Indiana,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfIndianaGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Indiana entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.in.gov/core/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Indiana"})

(def StateOfIndianaGovernment
  {:db/ident :fibo-be-ge-usj/StateOfIndianaGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfIndianaJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Indiana,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Indiana government",
   :rdfs/seeAlso {:xsd/anyURI "http://www.in.gov/core/"},
   :skos/definition
   "individual representing the regional government of the State of Indiana"})

(def StateOfIndianaJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfIndianaJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfIndianaGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Indiana,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Indiana jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.in.gov/judiciary/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Indiana, i.e., that of the Indiana Supreme Court and Judiciary"})

(def StateOfIowaEntity
  {:db/ident :fibo-be-ge-usj/StateOfIowaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Iowa,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfIowaGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Iowa entity",
   :rdfs/seeAlso {:xsd/anyURI "https://www.iowa.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Iowa"})

(def StateOfIowaGovernment
  {:db/ident :fibo-be-ge-usj/StateOfIowaGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfIowaJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Iowa,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Iowa government",
   :rdfs/seeAlso {:xsd/anyURI "https://www.iowa.gov/"},
   :skos/definition
   "individual representing the regional government of the State of Iowa"})

(def StateOfIowaJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfIowaJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfIowaGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Iowa,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Iowa jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.iowacourts.gov/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Iowa, i.e., that of the Iowa Supreme Court and Judiciary"})

(def StateOfKansasEntity
  {:db/ident :fibo-be-ge-usj/StateOfKansasEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Kansas,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfKansasGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Kansas entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.kansas.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Kansas"})

(def StateOfKansasGovernment
  {:db/ident :fibo-be-ge-usj/StateOfKansasGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfKansasJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Kansas,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Kansas government",
   :rdfs/seeAlso {:xsd/anyURI "http://www.kansas.gov/government"},
   :skos/definition
   "individual representing the regional government of the State of Kansas"})

(def StateOfKansasJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfKansasJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfKansasGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Kansas,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Kansas jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.kansas.gov/government/judicial.html"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Kansas, i.e., that of the Kansas Supreme Court and Judiciary"})

(def StateOfKentuckyEntity
  {:db/ident :fibo-be-ge-usj/StateOfKentuckyEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Kentucky,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfKentuckyGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Kentucky entity",
   :rdfs/seeAlso {:xsd/anyURI "http://kentucky.gov/Pages/home.aspx"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Kentucky"})

(def StateOfKentuckyGovernment
  {:db/ident :fibo-be-ge-usj/StateOfKentuckyGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfKentuckyJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Kentucky,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Kentucky government",
   :rdfs/seeAlso {:xsd/anyURI
                  "http://kentucky.gov/government/Pages/default.aspx"},
   :skos/definition
   "individual representing the regional government of the State of Kentucky"})

(def StateOfKentuckyJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfKentuckyJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfKentuckyGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Kentucky,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Kentucky jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI
                  "http://kentucky.gov/government/Pages/default.aspx#courts"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Kansas, i.e., that of the Kentucky Supreme Court and Judiciary"})

(def StateOfLouisianaEntity
  {:db/ident :fibo-be-ge-usj/StateOfLouisianaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Louisiana,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfLouisianaGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Louisiana entity",
   :rdfs/seeAlso {:xsd/anyURI "http://louisiana.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Louisiana"})

(def StateOfLouisianaGovernment
  {:db/ident :fibo-be-ge-usj/StateOfLouisianaGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfLouisianaJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Louisiana,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Louisiana government",
   :rdfs/seeAlso {:xsd/anyURI "http://louisiana.gov/Government/"},
   :skos/definition
   "individual representing the regional government of the State of Louisiana"})

(def StateOfLouisianaJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfLouisianaJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfLouisianaGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Louisiana,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Louisiana jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI
                  "http://louisiana.gov/Government/Judicial_Branch/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Louisiana, i.e., that of the Louisiana Supreme Court and Judiciary"})

(def StateOfMaineEntity
  {:db/ident :fibo-be-ge-usj/StateOfMaineEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Maine,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfMaineGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Maine entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.maine.gov/portal/index.html"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Maine"})

(def StateOfMaineGovernment
  {:db/ident :fibo-be-ge-usj/StateOfMaineGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfMaineJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Maine,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Maine government",
   :rdfs/seeAlso {:xsd/anyURI "http://www.maine.gov/portal/government/"},
   :skos/definition
   "individual representing the regional government of the State of Maine"})

(def StateOfMaineJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfMaineJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfMaineGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Maine,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Maine jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.courts.maine.gov/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Maine, i.e., that of the Maine Supreme Court and Judiciary"})

(def StateOfMarylandEntity
  {:db/ident :fibo-be-ge-usj/StateOfMarylandEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Maryland,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfMarylandGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Maryland entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.maryland.gov/Pages/default.aspx"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Maryland"})

(def StateOfMarylandGovernment
  {:db/ident :fibo-be-ge-usj/StateOfMarylandGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfMarylandJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Maryland,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Maryland government",
   :rdfs/seeAlso {:xsd/anyURI "http://www.maryland.gov/pages/government.aspx"},
   :skos/definition
   "individual representing the regional government of the State of Maryland"})

(def StateOfMarylandJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfMarylandJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfMarylandGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Maryland,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Maryland jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.courts.state.md.us/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Maryland, i.e., that of the Maryland Court of Appeals and Judiciary"})

(def StateOfMassachusettsEntity
  {:db/ident :fibo-be-ge-usj/StateOfMassachusettsEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Massachusetts,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-usj/StateOfMassachusettsGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Massachusetts entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.mass.gov/portal/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of (Commonwealth of) Massachusetts"})

(def StateOfMassachusettsGovernment
  {:db/ident :fibo-be-ge-usj/StateOfMassachusettsGovernment,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-usj/StateOfMassachusettsJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Massachusetts,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Massachusetts government",
   :rdfs/seeAlso {:xsd/anyURI "http://www.mass.gov/portal/government/"},
   :skos/definition
   "individual representing the regional government of the Commonwealth of Massachusetts"})

(def StateOfMassachusettsJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfMassachusettsJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-usj/StateOfMassachusettsGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Massachusetts,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Massachusetts jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.mass.gov/courts/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of (Commonwealth of) Massachusetts, i.e., that of the Massachusetts Supreme Judicial Court and Judiciary"})

(def StateOfMichiganEntity
  {:db/ident :fibo-be-ge-usj/StateOfMichiganEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Michigan,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfMichiganGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Michigan entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.michigan.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Michigan"})

(def StateOfMichiganGovernment
  {:db/ident :fibo-be-ge-usj/StateOfMichiganGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfMichiganJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Michigan,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Michigan government",
   :rdfs/seeAlso {:xsd/anyURI
                  "http://www.michigan.gov/som/0,4669,7-192-29701---,00.html"},
   :skos/definition
   "individual representing the regional government of the US State of Michigan"})

(def StateOfMichiganJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfMichiganJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfMichiganGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Michigan,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Michigan jurisdiction",
   :rdfs/seeAlso
   {:xsd/anyURI
    "http://www.michigan.gov/som/0,4669,7-192-29701_29703---,00.html"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Michigan, i.e., that of the Michigan Supreme Court and Judiciary"})

(def StateOfMinnesotaEntity
  {:db/ident :fibo-be-ge-usj/StateOfMinnesotaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Minnesota,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfMinnesotaGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Minnesota entity",
   :rdfs/seeAlso {:xsd/anyURI "http://mn.gov/portal/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Minnesota"})

(def StateOfMinnesotaGovernment
  {:db/ident :fibo-be-ge-usj/StateOfMinnesotaGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfMinnesotaJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Minnesota,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Minnesota government",
   :rdfs/seeAlso {:xsd/anyURI "http://mn.gov/portal/government/"},
   :skos/definition
   "individual representing the regional government of the US State of Minnesota"})

(def StateOfMinnesotaJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfMinnesotaJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfMinnesotaGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Minnesota,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Minnesota jurisdiction",
   :rdfs/seeAlso #{{:xsd/anyURI "http://www.mncourts.gov/"}
                   {:xsd/anyURI
                    "http://mn.gov/portal/government/state/courts/"}},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Minnesota, i.e., that of the Minnesota Supreme Court and Judiciary"})

(def StateOfMississippiEntity
  {:db/ident :fibo-be-ge-usj/StateOfMississippiEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Mississippi,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfMississippiGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Mississippi entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.mississippi.gov/Pages/default.aspx"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Mississippi"})

(def StateOfMississippiGovernment
  {:db/ident :fibo-be-ge-usj/StateOfMississippiGovernment,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-usj/StateOfMississippiJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Mississippi,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Mississippi government",
   :rdfs/seeAlso {:xsd/anyURI
                  "http://www.mississippi.gov/content/pages/government.aspx"},
   :skos/definition
   "individual representing the regional government of the US State of Mississippi"})

(def StateOfMississippiJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfMississippiJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfMississippiGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Mississippi,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Mississippi jurisdiction",
   :rdfs/seeAlso
   #{{:xsd/anyURI
      "http://www.mississippi.gov/content/Pages/Government-Branches.aspx#Judicial"}
     {:xsd/anyURI "http://courts.ms.gov/"}},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Mississippi, i.e., that of the Mississippi Supreme Court and Judiciary"})

(def StateOfMissouriEntity
  {:db/ident :fibo-be-ge-usj/StateOfMissouriEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Missouri,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfMissouriGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Missouri entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.mo.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Missouri"})

(def StateOfMissouriGovernment
  {:db/ident :fibo-be-ge-usj/StateOfMissouriGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfMissouriJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Missouri,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Missouri government",
   :rdfs/seeAlso {:xsd/anyURI "http://www.mo.gov/government"},
   :skos/definition
   "individual representing the regional government of the US State of Missouri"})

(def StateOfMissouriJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfMissouriJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfMissouriGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Missouri,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Missouri jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.mo.gov/government/judicial-branch/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Missouri, i.e., that of the Missouri Supreme Court and Judiciary"})

(def StateOfMontanaEntity
  {:db/ident :fibo-be-ge-usj/StateOfMontanaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Montana,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfMontanaGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Montana entity",
   :rdfs/seeAlso {:xsd/anyURI "http://mt.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Montana"})

(def StateOfMontanaGovernment
  {:db/ident :fibo-be-ge-usj/StateOfMontanaGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfMontanaJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Montana,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Montana government",
   :rdfs/seeAlso {:xsd/anyURI "http://mt.gov/government/default.aspx"},
   :skos/definition
   "individual representing the regional government of the US State of Montana"})

(def StateOfMontanaJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfMontanaJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfMontanaGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Montana,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Montana jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://courts.mt.gov/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Montana, i.e., that of the Montana Supreme Court and Judiciary"})

(def StateOfNebraskaEntity
  {:db/ident :fibo-be-ge-usj/StateOfNebraskaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Nebraska,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfNebraskaGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Nebraska entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.nebraska.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Nebraska"})

(def StateOfNebraskaGovernment
  {:db/ident :fibo-be-ge-usj/StateOfNebraskaGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfNebraskaJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Nebraska,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Nebraska government",
   :rdfs/seeAlso {:xsd/anyURI "http://www.nebraska.gov/#government"},
   :skos/definition
   "individual representing the regional government of the US State of Nebraska"})

(def StateOfNebraskaJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfNebraskaJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfNebraskaGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Nebraska,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Nebraska jurisdiction",
   :rdfs/seeAlso #{{:xsd/anyURI "https://supremecourt.nebraska.gov/"}
                   {:xsd/anyURI
                    "http://www.nebraska.gov/government/judicial/"}},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Nebraska, i.e., that of the Nebraska Supreme Court and Judiciary"})

(def StateOfNevadaEntity
  {:db/ident :fibo-be-ge-usj/StateOfNevadaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Nevada,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfNevadaGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Nevada entity",
   :rdfs/seeAlso {:xsd/anyURI "http://nv.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Nevada"})

(def StateOfNevadaGovernment
  {:db/ident :fibo-be-ge-usj/StateOfNevadaGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfNevadaJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Nevada,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Nevada government",
   :rdfs/seeAlso {:xsd/anyURI "http://nv.gov/government/"},
   :skos/definition
   "individual representing the regional government of the US State of Nevada"})

(def StateOfNevadaJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfNevadaJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfNevadaGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Nevada,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Nevada jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://nv.gov/government/judicial/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Nevada, i.e., that of the Nevada Supreme Court and Judiciary"})

(def StateOfNewHampshireEntity
  {:db/ident :fibo-be-ge-usj/StateOfNewHampshireEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/NewHampshire,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfNewHampshireGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of New Hampshire entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.nh.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of New Hampshire"})

(def StateOfNewHampshireGovernment
  {:db/ident :fibo-be-ge-usj/StateOfNewHampshireGovernment,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-usj/StateOfNewHampshireJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/NewHampshire,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of New Hampshire government",
   :rdfs/seeAlso {:xsd/anyURI "http://www.nh.gov/government/index.html"},
   :skos/definition
   "individual representing the regional government of the US State of New Hampshire"})

(def StateOfNewHampshireJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfNewHampshireJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-usj/StateOfNewHampshireGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/NewHampshire,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of New Hampshire jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.courts.state.nh.us/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of New Hampshire, i.e., that of the New Hampshire Supreme Court and Judiciary"})

(def StateOfNewJerseyEntity
  {:db/ident :fibo-be-ge-usj/StateOfNewJerseyEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/NewJersey,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfNewJerseyGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of New Jersey entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.state.nj.us/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of New Jersey"})

(def StateOfNewJerseyGovernment
  {:db/ident :fibo-be-ge-usj/StateOfNewJerseyGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfNewJerseyJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/NewJersey,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of New Jersey government",
   :rdfs/seeAlso {:xsd/anyURI "http://www.state.nj.us/nj/gov/"},
   :skos/definition
   "individual representing the regional government of the US State of New Jersey"})

(def StateOfNewJerseyJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfNewJerseyJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfNewJerseyGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/NewJersey,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of New Jersey jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.judiciary.state.nj.us/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of New Jersey, i.e., that of the New Jersey Supreme Court and Judiciary"})

(def StateOfNewMexicoEntity
  {:db/ident :fibo-be-ge-usj/StateOfNewMexicoEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/NewMexico,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfNewMexicoGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of New Mexico entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.newmexico.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of New Mexico"})

(def StateOfNewMexicoGovernment
  {:db/ident :fibo-be-ge-usj/StateOfNewMexicoGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfNewMexicoJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/NewMexico,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of New Mexico government",
   :rdfs/seeAlso {:xsd/anyURI "http://www.newmexico.gov/government/"},
   :skos/definition
   "individual representing the regional government of the US State of New Mexico"})

(def StateOfNewMexicoJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfNewMexicoJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfNewMexicoGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/NewMexico,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of New Mexico jurisdiction",
   :rdfs/seeAlso
   #{{:xsd/anyURI "http://supremecourt.nmcourts.gov/"}
     {:xsd/anyURI
      "http://www.newmexico.gov/government/New_Mexico_Judicial_Branch.aspx"}},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of New Mexico, i.e., that of the New Mexico Supreme Court and Judiciary"})

(def StateOfNewYorkEntity
  {:db/ident :fibo-be-ge-usj/StateOfNewYorkEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/NewYork,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfNewYorkGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of New York entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.ny.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of New York"})

(def StateOfNewYorkGovernment
  {:db/ident :fibo-be-ge-usj/StateOfNewYorkGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfNewYorkJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/NewYork,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of New York government",
   :rdfs/seeAlso {:xsd/anyURI "http://www.ny.gov/agencies"},
   :skos/definition
   "individual representing the regional government of the US State of New York"})

(def StateOfNewYorkJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfNewYorkJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfNewYorkGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/NewYork,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of New York jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.nycourts.gov/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of New York, i.e., that of the New York Supreme Court and Judiciary"})

(def StateOfNorthCarolinaEntity
  {:db/ident :fibo-be-ge-usj/StateOfNorthCarolinaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/NorthCarolina,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-usj/StateOfNorthCarolinaGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of North Carolina entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.nc.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of North Carolina"})

(def StateOfNorthCarolinaGovernment
  {:db/ident :fibo-be-ge-usj/StateOfNorthCarolinaGovernment,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-usj/StateOfNorthCarolinaJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/NorthCarolina,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of North Carolina government",
   :rdfs/seeAlso {:xsd/anyURI "http://www.nc.gov/government"},
   :skos/definition
   "individual representing the regional government of the US State of North Carolina"})

(def StateOfNorthCarolinaJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfNorthCarolinaJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-usj/StateOfNorthCarolinaGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/NorthCarolina,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of North Carolina jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.nccourts.org/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of North Carolina, i.e., that of the North Carolina Supreme Court and Judiciary"})

(def StateOfNorthDakotaEntity
  {:db/ident :fibo-be-ge-usj/StateOfNorthDakotaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/NorthDakota,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfNorthDakotaGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of North Dakota entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.nd.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of North Dakota"})

(def StateOfNorthDakotaGovernment
  {:db/ident :fibo-be-ge-usj/StateOfNorthDakotaGovernment,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-usj/StateOfNorthDakotaJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/NorthDakota,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of North Dakota government",
   :rdfs/seeAlso {:xsd/anyURI "http://www.nd.gov/category.htm?id=71"},
   :skos/definition
   "individual representing the regional government of the US State of North Dakota"})

(def StateOfNorthDakotaJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfNorthDakotaJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfNorthDakotaGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/NorthDakota,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of North Dakota jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.ndcourts.gov/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of North Dakota, i.e., that of the North Dakota Supreme Court and Judiciary"})

(def StateOfOhioEntity
  {:db/ident :fibo-be-ge-usj/StateOfOhioEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Ohio,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfOhioGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Ohio entity",
   :rdfs/seeAlso {:xsd/anyURI "http://ohio.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Ohio"})

(def StateOfOhioGovernment
  {:db/ident :fibo-be-ge-usj/StateOfOhioGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfOhioJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Ohio,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Ohio government",
   :rdfs/seeAlso {:xsd/anyURI "http://ohio.gov/government/"},
   :skos/definition
   "individual representing the regional government of the US State of Ohio"})

(def StateOfOhioJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfOhioJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfOhioGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Ohio,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Ohio jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.supremecourt.ohio.gov/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Ohio, i.e., that of the Ohio Supreme Court and Judiciary"})

(def StateOfOklahomaEntity
  {:db/ident :fibo-be-ge-usj/StateOfOklahomaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Oklahoma,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfOklahomaGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Oklahoma entity",
   :rdfs/seeAlso {:xsd/anyURI "https://www.ok.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Oklahoma"})

(def StateOfOklahomaGovernment
  {:db/ident :fibo-be-ge-usj/StateOfOklahomaGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfOklahomaJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Oklahoma,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Oklahoma government",
   :rdfs/seeAlso {:xsd/anyURI "https://www.ok.gov/portal/section.php?sec_id=1"},
   :skos/definition
   "individual representing the regional government of the US State of Oklahoma"})

(def StateOfOklahomaJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfOklahomaJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfOklahomaGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Oklahoma,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Oklahoma jurisdiction",
   :rdfs/seeAlso
   {:xsd/anyURI "https://www.ok.gov/portal/section.php?sec_id=67#skipcontent"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Oklahoma, i.e., that of the Oklahoma Supreme Court and Judiciary"})

(def StateOfOregonEntity
  {:db/ident :fibo-be-ge-usj/StateOfOregonEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Oregon,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfOregonGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Oregon entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.oregon.gov/pages/index.aspx"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Oregon"})

(def StateOfOregonGovernment
  {:db/ident :fibo-be-ge-usj/StateOfOregonGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfOregonJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Oregon,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Oregon government",
   :rdfs/seeAlso {:xsd/anyURI "http://bluebook.state.or.us/state/index.htm"},
   :skos/definition
   "individual representing the regional government of the US State of Oregon"})

(def StateOfOregonJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfOregonJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfOregonGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Oregon,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Oregon jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI
                  "http://bluebook.state.or.us/state/judicial/judicial.htm"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Oregon, i.e., that of the Oregon Supreme Court and Judiciary"})

(def StateOfPennsylvaniaEntity
  {:cmns-av/synonym "Commonwealth of Pennsylvania entity",
   :db/ident :fibo-be-ge-usj/StateOfPennsylvaniaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Pennsylvania,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfPennsylvaniaGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Pennsylvania entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.pa.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Pennsylvania"})

(def StateOfPennsylvaniaGovernment
  {:cmns-av/synonym "Commonwealth of Pennsylvania government",
   :db/ident :fibo-be-ge-usj/StateOfPennsylvaniaGovernment,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-usj/StateOfPennsylvaniaJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Pennsylvania,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Pennsylvania government",
   :rdfs/seeAlso {:xsd/anyURI "http://www.pa.gov/#government"},
   :skos/definition
   "individual representing the regional government of the US State of Pennsylvania"})

(def StateOfPennsylvaniaJurisdiction
  {:cmns-av/synonym "Commonwealth of Pennsylvania jurisdiction",
   :db/ident :fibo-be-ge-usj/StateOfPennsylvaniaJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-usj/StateOfPennsylvaniaGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Pennsylvania,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Pennsylvania jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.pacourts.us/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Pennsylvania, i.e., that of the Pennsylvania Supreme Court and Judiciary"})

(def StateOfRhodeIslandEntity
  {:db/ident :fibo-be-ge-usj/StateOfRhodeIslandEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/RhodeIsland,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfRhodeIslandGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Rhode Island entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.ri.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Rhode Island"})

(def StateOfRhodeIslandGovernment
  {:db/ident :fibo-be-ge-usj/StateOfRhodeIslandGovernment,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-usj/StateOfRhodeIslandJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/RhodeIsland,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Rhode Island government",
   :rdfs/seeAlso {:xsd/anyURI "http://www.ri.gov/government/submenu.php"},
   :skos/definition
   "individual representing the regional government of the US State of Rhode Island"})

(def StateOfRhodeIslandJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfRhodeIslandJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfRhodeIslandGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/RhodeIsland,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Rhode Island jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "https://www.courts.ri.gov/Pages/default.aspx"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Rhode Island, i.e., that of the Rhode Island Supreme Court and Judiciary"})

(def StateOfSouthCarolinaEntity
  {:db/ident :fibo-be-ge-usj/StateOfSouthCarolinaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/SouthCarolina,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-usj/StateOfSouthCarolinaGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of South Carolina entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.sc.gov/Pages/default.aspx"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of South Carolina"})

(def StateOfSouthCarolinaGovernment
  {:db/ident :fibo-be-ge-usj/StateOfSouthCarolinaGovernment,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-usj/StateOfSouthCarolinaJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/SouthCarolina,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of South Carolina government",
   :rdfs/seeAlso {:xsd/anyURI
                  "http://www.sc.gov/Government/Pages/default.aspx"},
   :skos/definition
   "individual representing the regional government of the US State of South Carolina"})

(def StateOfSouthCarolinaJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfSouthCarolinaJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-usj/StateOfSouthCarolinaGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/SouthCarolina,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of South Carolina jurisdiction",
   :rdfs/seeAlso
   {:xsd/anyURI
    "http://www.sc.gov/Government/Pages/courtsAndLegalServices.aspx"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of South Carolina, i.e., that of the South Carolina Supreme Court and Judiciary"})

(def StateOfSouthDakotaEntity
  {:db/ident :fibo-be-ge-usj/StateOfSouthDakotaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/SouthDakota,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfSouthDakotaGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of South Dakota entity",
   :rdfs/seeAlso {:xsd/anyURI "http://sd.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of South Dakota"})

(def StateOfSouthDakotaGovernment
  {:db/ident :fibo-be-ge-usj/StateOfSouthDakotaGovernment,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-usj/StateOfSouthDakotaJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/SouthDakota,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of South Dakota government",
   :rdfs/seeAlso {:xsd/anyURI "http://sd.gov/government.aspx"},
   :skos/definition
   "individual representing the regional government of the US State of South Dakota"})

(def StateOfSouthDakotaJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfSouthDakotaJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfSouthDakotaGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/SouthDakota,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of South Dakota jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://ujs.sd.gov/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of South Dakota, i.e., that of the South Dakota Supreme Court and Judiciary"})

(def StateOfTennesseeEntity
  {:db/ident :fibo-be-ge-usj/StateOfTennesseeEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Tennessee,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfTennesseeGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Tennessee entity",
   :rdfs/seeAlso {:xsd/anyURI "http://tennessee.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Tennessee"})

(def StateOfTennesseeGovernment
  {:db/ident :fibo-be-ge-usj/StateOfTennesseeGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfTennesseeJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Tennessee,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Tennessee government",
   :rdfs/seeAlso {:xsd/anyURI "http://tennessee.gov/main/section/government"},
   :skos/definition
   "individual representing the regional government of the US State of Tennessee"})

(def StateOfTennesseeJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfTennesseeJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfTennesseeGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Tennessee,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Tennessee jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.tncourts.gov/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Tennessee, i.e., that of the Tennessee Supreme Court and Judiciary"})

(def StateOfTexasEntity
  {:db/ident :fibo-be-ge-usj/StateOfTexasEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Texas,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfTexasGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Texas entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.texas.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Texas"})

(def StateOfTexasGovernment
  {:db/ident :fibo-be-ge-usj/StateOfTexasGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfTexasJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Texas,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Texas government",
   :rdfs/seeAlso {:xsd/anyURI "http://www.texas.gov/"},
   :skos/definition
   "individual representing the regional government of the US State of Texas"})

(def StateOfTexasJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfTexasJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfTexasGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Texas,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Texas jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.txcourts.gov/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Texas, i.e., that of the Texas Supreme Court and Judiciary"})

(def StateOfUtahEntity
  {:db/ident :fibo-be-ge-usj/StateOfUtahEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Utah,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfUtahGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Utah entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.utah.gov/index.html"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Utah"})

(def StateOfUtahGovernment
  {:db/ident :fibo-be-ge-usj/StateOfUtahGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfUtahJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Utah,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Utah government",
   :rdfs/seeAlso {:xsd/anyURI "http://www.utah.gov/index.html"},
   :skos/definition
   "individual representing the regional government of the US State of Utah"})

(def StateOfUtahJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfUtahJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfUtahGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Utah,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Utah jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.utah.gov/government/judicial.html"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Utah, i.e., that of the Utah Supreme Court and Judiciary"})

(def StateOfVermontEntity
  {:db/ident :fibo-be-ge-usj/StateOfVermontEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Vermont,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfVermontGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Vermont entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.vermont.gov/portal/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Vermont"})

(def StateOfVermontGovernment
  {:db/ident :fibo-be-ge-usj/StateOfVermontGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfVermontJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Vermont,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Vermont government",
   :rdfs/seeAlso {:xsd/anyURI "http://www.vermont.gov/portal/government/"},
   :skos/definition
   "individual representing the regional government of the US State of Vermont"})

(def StateOfVermontJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfVermontJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfVermontGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Vermont,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Vermont jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "https://www.vermontjudiciary.org/default.aspx"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Vermont, i.e., that of the Vermont Supreme Court and Judiciary"})

(def StateOfVirginiaEntity
  {:cmns-av/synonym "Commonwealth of Virginia entity",
   :db/ident :fibo-be-ge-usj/StateOfVirginiaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Virginia,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfVirginiaGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Virginia entity",
   :rdfs/seeAlso {:xsd/anyURI "https://www.virginia.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Virginia"})

(def StateOfVirginiaGovernment
  {:cmns-av/synonym "Commonwealth of Virginia government",
   :db/ident :fibo-be-ge-usj/StateOfVirginiaGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfVirginiaJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Virginia,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Virginia government",
   :rdfs/seeAlso {:xsd/anyURI "https://www.virginia.gov/government/"},
   :skos/definition
   "individual representing the regional government of the US State of Virginia"})

(def StateOfVirginiaJurisdiction
  {:cmns-av/synonym "Commonwealth of Virginia jurisdiction",
   :db/ident :fibo-be-ge-usj/StateOfVirginiaJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfVirginiaGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Virginia,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Virginia jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.courts.state.va.us/courts/home.html"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Virginia, i.e., that of the Virginia Supreme Court and Judiciary"})

(def StateOfWashingtonEntity
  {:db/ident :fibo-be-ge-usj/StateOfWashingtonEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Washington,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfWashingtonGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Washington entity",
   :rdfs/seeAlso {:xsd/anyURI "http://access.wa.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Washington"})

(def StateOfWashingtonGovernment
  {:db/ident :fibo-be-ge-usj/StateOfWashingtonGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfWashingtonJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Washington,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Washington government",
   :rdfs/seeAlso {:xsd/anyURI "http://access.wa.gov/"},
   :skos/definition
   "individual representing the regional government of the US State of Washington"})

(def StateOfWashingtonJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfWashingtonJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfWashingtonGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Washington,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Washington jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.courts.wa.gov/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Washington, i.e., that of the Washington Supreme Court and Judiciary"})

(def StateOfWestVirginiaEntity
  {:db/ident :fibo-be-ge-usj/StateOfWestVirginiaEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/WestVirginia,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfWestVirginiaGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of West Virginia entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.wv.gov/Pages/default.aspx#home"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of West Virginia"})

(def StateOfWestVirginiaGovernment
  {:db/ident :fibo-be-ge-usj/StateOfWestVirginiaGovernment,
   :fibo-be-ge-ge/hasJurisdiction
   :fibo-be-ge-usj/StateOfWestVirginiaJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/WestVirginia,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of West Virginia government",
   :rdfs/seeAlso {:xsd/anyURI
                  "http://www.wv.gov/Pages/default.aspx#government"},
   :skos/definition
   "individual representing the regional government of the US State of West Virginia"})

(def StateOfWestVirginiaJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfWestVirginiaJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-usj/StateOfWestVirginiaGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/WestVirginia,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of West Virginia jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.courtswv.gov/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of West Virginia, i.e., that of the West Virginia Supreme Court and Judiciary"})

(def StateOfWisconsinEntity
  {:db/ident :fibo-be-ge-usj/StateOfWisconsinEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Wisconsin,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfWisconsinGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Wisconsin entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.wisconsin.gov/Pages/home.aspx"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Wisconsin"})

(def StateOfWisconsinGovernment
  {:db/ident :fibo-be-ge-usj/StateOfWisconsinGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfWisconsinJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Wisconsin,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Wisconsin government",
   :rdfs/seeAlso {:xsd/anyURI "http://www.wisconsin.gov/Pages/government.aspx"},
   :skos/definition
   "individual representing the regional government of the US State of Wisconsin"})

(def StateOfWisconsinJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfWisconsinJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfWisconsinGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Wisconsin,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Wisconsin jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI
                  "http://www.wisconsin.gov/Pages/courtsAndLaw.aspx"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Wisconsin, i.e., that of the Wisconsin Supreme Court and Judiciary"})

(def StateOfWyomingEntity
  {:db/ident :fibo-be-ge-usj/StateOfWyomingEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/Wyoming,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/StateOfWyomingGovernment,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Wyoming entity",
   :rdfs/seeAlso {:xsd/anyURI "http://www.wyo.gov/"},
   :skos/definition
   "individual representing the regional sovereignty and polity that is the US State of Wyoming"})

(def StateOfWyomingGovernment
  {:db/ident :fibo-be-ge-usj/StateOfWyomingGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/StateOfWyomingJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-us/Wyoming,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Wyoming government",
   :rdfs/seeAlso {:xsd/anyURI "http://www.wyo.gov/"},
   :skos/definition
   "individual representing the regional government of the US State of Wyoming"})

(def StateOfWyomingJurisdiction
  {:db/ident :fibo-be-ge-usj/StateOfWyomingJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/StateOfWyomingGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/Wyoming,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "State of Wyoming jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.wyo.gov/"},
   :skos/definition
   "individual representing the overall jurisdiction for the US State of Wyoming, i.e., that of the Wyoming Supreme Court and Judiciary"})

(def UnitedStatesEntity
  {:db/ident :fibo-be-ge-usj/UnitedStatesEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-be-ge-ge/hasSharedSovereigntyOver
   #{:lcc-3166-2-us/Oklahoma :lcc-3166-2-us/Minnesota :lcc-3166-2-us/NewYork
     :lcc-3166-2-us/Hawaii :lcc-3166-2-us/Delaware :lcc-3166-2-us/Maryland
     :lcc-3166-2-us/Wisconsin :lcc-3166-2-us/Montana :lcc-3166-2-us/PuertoRico
     :lcc-3166-2-us/Utah :lcc-3166-2-us/Illinois
     :lcc-3166-2-us/DistrictOfColumbia :lcc-3166-2-us/NorthernMarianaIslands
     :lcc-3166-2-us/Georgia :lcc-3166-2-us/Nebraska :lcc-3166-2-us/Michigan
     :lcc-3166-2-us/Washington :lcc-3166-2-us/Texas :lcc-3166-2-us/SouthCarolina
     :lcc-3166-2-us/Connecticut :lcc-3166-2-us/Massachusetts
     :lcc-3166-2-us/SouthDakota :lcc-3166-2-us/VirginIslands
     :lcc-3166-2-us/Arkansas :lcc-3166-2-us/Idaho :lcc-3166-2-us/Ohio
     :lcc-3166-2-us/Mississippi :lcc-3166-2-us/Louisiana
     :lcc-3166-2-us/NewMexico :lcc-3166-2-us/Arizona :lcc-3166-2-us/Iowa
     :lcc-3166-2-us/Oregon :lcc-3166-2-us/Vermont :lcc-3166-2-us/NorthDakota
     :lcc-3166-2-us/Pennsylvania :lcc-3166-2-us/Colorado :lcc-3166-2-us/Maine
     :lcc-3166-2-us/UnitedStatesMinorOutlyingIslands :lcc-3166-2-us/Missouri
     :lcc-3166-2-us/NewHampshire :lcc-3166-2-us/NewJersey
     :lcc-3166-2-us/Tennessee :lcc-3166-2-us/NorthCarolina
     :lcc-3166-2-us/Indiana :lcc-3166-2-us/Florida :lcc-3166-2-us/California
     :lcc-3166-2-us/Virginia :lcc-3166-2-us/Nevada :lcc-3166-2-us/Guam
     :lcc-3166-2-us/Kentucky :lcc-3166-2-us/RhodeIsland :lcc-3166-2-us/Wyoming
     :lcc-3166-2-us/Alabama :lcc-3166-2-us/Alaska :lcc-3166-2-us/Kansas
     :lcc-3166-2-us/WestVirginia :lcc-3166-2-us/AmericanSamoa},
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/UnitedStatesGovernment,
   :rdf/type #{:fibo-be-ge-ge/FederatedSovereignty :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "United States entity",
   :rdfs/seeAlso {:xsd/anyURI "https://www.usa.gov/"},
   :skos/definition
   "individual representing the federated sovereignty and polity that is the United States of America"})

(def UnitedStatesGovernment
  {:db/ident :fibo-be-ge-usj/UnitedStatesGovernment,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-usj/UnitedStatesJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/UnitedStatesOfAmerica,
   :rdf/type #{:fibo-be-ge-ge/FederalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "United States federal government",
   :rdfs/seeAlso
   #{{:xsd/anyURI "http://www.archives.gov/exhibits/charters/constitution.html"}
     {:xsd/anyURI "https://www.usa.gov/agencies"}
     {:xsd/anyURI "https://www.usa.gov/branches-of-government"}},
   :skos/definition
   "individual representing the federal government of the United States of America"})

(def UnitedStatesJurisdiction
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI
      "http://en.wikipedia.org/wiki/Federal_jurisdiction_(United_States)"}
     {:xsd/anyURI "http://www.uscourts.gov/about-federal-courts"}},
   :cmns-av/explanatoryNote
   "The United States of America is a federal republic governed by the U.S. Constitution containing fifty states and a federal district which elect the president, and having other territories and possessions in its national jurisdiction. This government is known as the Union, the United States, or the federal government. Federal jurisdiction refers to the legal scope of the government's powers. Under the Constitution and various treaties, the legal jurisdiction of the United States includes territories and territorial waters.",
   :db/ident :fibo-be-ge-usj/UnitedStatesJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/UnitedStatesGovernment,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/UnitedStatesOfAmerica,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "United States jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI "http://www.uscourts.gov/about-federal-courts"},
   :skos/definition
   "individual representing the federal jurisdiction of the United States of America"})

(def VirginIslandsEntity
  {:db/ident :fibo-be-ge-usj/VirginIslandsEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-us/VirginIslands,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-usj/GovernmentOfVirginIslands,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Virgin Islands entity (USA)",
   :rdfs/seeAlso
   #{{:xsd/anyURI "https://en.wikipedia.org/wiki/United_States_Virgin_Islands"}
     {:xsd/anyURI "http://www.vi.gov/"}
     {:xsd/anyURI "https://www.doi.gov/oia/islands/virgin-islands"}},
   :skos/definition
   "individual representing the unincorporated territory and polity for the Virgin Islands (USA)"})

(def VirginIslandsJurisdiction
  {:db/ident :fibo-be-ge-usj/VirginIslandsJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-usj/GovernmentOfVirginIslands,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-us/VirginIslands,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Virgin Islands jurisdiction (USA)",
   :rdfs/seeAlso #{{:xsd/anyURI "http://www.vi.gov/"}
                   {:xsd/anyURI
                    "https://www.doi.gov/oia/islands/virgin-islands"}},
   :skos/definition
   "individual representing the jurisdiction of the US territory of the Virgin Islands"})

(def urn:uuid:280108ee-0bf3-5a7b-8a96-69b5679833c8
  {:cmns-av/copyright #{"Copyright (c) 2016-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology provides the set of basic federal government, state, and territory level entities and jurisdictions for use in other US-specific FIBO ontologies.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/IdentifiersAndIndices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "US Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to address text formatting hygiene issues."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to replace references to the legacy LCC UnitedStates country representation with UnitedStatesOfAmerica."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"})