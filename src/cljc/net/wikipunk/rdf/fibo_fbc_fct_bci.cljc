(ns net.wikipunk.rdf.fibo-fbc-fct-bci
  {:cmns-av/copyright
   #{"Copyright (c) 2018-2024 EDM Council, Inc."
     "Copyright (c) 2018-2024 Thematix Partners LLC"
     "Copyright (c) 2020-2024 agnos.ai, UK Ltd."
     "Copyright (c) 2018-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :dcterms/abstract
   "This ontology includes individuals representing the set of international business centers corresponding to those identified in FpML as well as additional municipalities called out in the ISO 10383 Codes for exchanges and market identification (MIC) standard.\n\t\tThis set of business centers is current with respect to the FpML published XML data as of Q2 2023 and additional municipalities included in the MIC codes as of Q1 2024. Note that we have deviated from the standard FIBO naming convention of strict use of camel case to add underscores in certain city names for readability purposes.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-fct-bc"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCenters/",
    "fibo-fbc-fct-bci"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
    "fibo-fnd-dt-bd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
    "fibo-fnd-plc-loc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
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
      "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/BusinessCenters/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/DatesAndTimes/BusinessDates/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-fct-bci",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Business Centers Individuals",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to add municipalities required for the ISO revision to the MIC codes as of June 2022."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to merge countries with locations in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to address text formatting issues uncovered by hygiene testing."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to support revisions of the MIC codes as of December 2018."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals.rdf version of this ontology was modified to update the business centers per the latest revision of the FpML business centers (November 2022) and latest municipalities per the June 2023 ISO 10383 MIC code update from ISO."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to replace Swaziland with Eswatini, which was revised by the LCC 1.1 RTF to reflect the change to the country name per the U.N."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to add municipalities required for the ISO revision to the MIC codes as of March 2021."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to equate Almaty and Alma-ata, which are the same city (Alma-ata is the old name, no longer in use)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to add municipalities required for the ISO revision to the MIC codes as of September 2021."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to add municipalities required for the ISO revision to the MIC codes as of September 2019."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to add municipalities required for the ISO revision to the MIC codes as of November 2020, and add Municipalities for 4 important Swiss financial cities."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to add municipalities required for the ISO revision to the MIC codes as of June 2020, replace the relations hasTag property with the equivalent lcc-lr version, and replace skos:definition on reference individuals with dct:description."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals.rdf version of this ontology was modified to update the business centers per the latest revision of the municipalities per the March 2024 ISO 10383 MIC code update from ISO."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to add municipalities required for the ISO revision to the MIC codes as of March 2022."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to add a number of new municipalities that were included in the December 2022 MIC codes."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"})

(def AEAB
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/AbuDhabiBusinessDay,
   :db/ident :fibo-fbc-fct-bci/AEAB,
   :dcterms/description
   "the FpML business center code for Abu Dhabi, Business Day (as defined in 2021 ISDA Definitions Section 2.1.9 (ii))",
   :fibo-fnd-rel-rel/hasTag "AEAB",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessDayAdjustmentCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "AEAB"})

(def AEAD
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/AbuDhabiSettlementDay,
   :db/ident :fibo-fbc-fct-bci/AEAD,
   :dcterms/description
   "the FpML business center code for Abu Dhabi, Settlement Day (as defined in 2021 ISDA Definitions Section 2.1.9 (i))",
   :fibo-fnd-rel-rel/hasTag "AEAD",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessDayAdjustmentCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "AEAD"})

(def AEDU
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Dubai,
   :db/ident :fibo-fbc-fct-bci/AEDU,
   :dcterms/description
   "the FpML business center code for Dubai, United Arab Emirates",
   :fibo-fnd-rel-rel/hasTag "AEDU",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "AEDU"})

(def AMYE
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Yerevan,
   :db/ident :fibo-fbc-fct-bci/AMYE,
   :dcterms/description "the FpML business center code for Yerevan, Armenia",
   :fibo-fnd-rel-rel/hasTag "AMYE",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "AMYE"})

(def AOLU
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Luanda,
   :db/ident :fibo-fbc-fct-bci/AOLU,
   :dcterms/description "the FpML business center code for Luanda, Angola",
   :fibo-fnd-rel-rel/hasTag "AOLU",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "AOLU"})

(def ARBA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Buenos_Aires,
   :db/ident :fibo-fbc-fct-bci/ARBA,
   :dcterms/description
   "the FpML business center code for Buenos Aires, Argentina",
   :fibo-fnd-rel-rel/hasTag "ARBA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "ARBA"})

(def ATVI
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Vienna,
   :db/ident :fibo-fbc-fct-bci/ATVI,
   :dcterms/description "the FpML business center code for Vienna, Austria",
   :fibo-fnd-rel-rel/hasTag "ATVI",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "ATVI"})

(def AUAD
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Adelaide,
   :db/ident :fibo-fbc-fct-bci/AUAD,
   :dcterms/description "the FpML business center code for Adelaide, Australia",
   :fibo-fnd-rel-rel/hasTag "AUAD",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "AUAD"})

(def AUBR
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Brisbane,
   :db/ident :fibo-fbc-fct-bci/AUBR,
   :dcterms/description "the FpML business center code for Brisbane, Australia",
   :fibo-fnd-rel-rel/hasTag "AUBR",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "AUBR"})

(def AUCA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Canberra,
   :db/ident :fibo-fbc-fct-bci/AUCA,
   :dcterms/description "the FpML business center code for Canberra, Australia",
   :fibo-fnd-rel-rel/hasTag "AUCA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "AUCA"})

(def AUDA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Darwin,
   :db/ident :fibo-fbc-fct-bci/AUDA,
   :dcterms/description "the FpML business center code for Darwin, Australia",
   :fibo-fnd-rel-rel/hasTag "AUDA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "AUDA"})

(def AUME
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Melbourne,
   :db/ident :fibo-fbc-fct-bci/AUME,
   :dcterms/description
   "the FpML business center code for Melbourne, Australia",
   :fibo-fnd-rel-rel/hasTag "AUME",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "AUME"})

(def AUPE
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Perth,
   :db/ident :fibo-fbc-fct-bci/AUPE,
   :dcterms/description "the FpML business center code for Perth, Australia",
   :fibo-fnd-rel-rel/hasTag "AUPE",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "AUPE"})

(def AUSY
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Sydney,
   :db/ident :fibo-fbc-fct-bci/AUSY,
   :dcterms/description "the FpML business center code for Sydney, Australia",
   :fibo-fnd-rel-rel/hasTag "AUSY",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "AUSY"})

(def AZBA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Baku,
   :db/ident :fibo-fbc-fct-bci/AZBA,
   :dcterms/description "the FpML business center code for Baku, Azerbaijan",
   :fibo-fnd-rel-rel/hasTag "AZBA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "AZBA"})

(def Aabenraa
  {:cmns-col/isPartOf :lcc-3166-1/Denmark,
   :db/ident :fibo-fbc-fct-bci/Aabenraa,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Aabenraa"})

(def Aalborg
  {:cmns-col/isPartOf :lcc-3166-1/Denmark,
   :db/ident :fibo-fbc-fct-bci/Aalborg,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Aalborg"})

(def Abha
  {:cmns-col/isPartOf :lcc-3166-1/SaudiArabia,
   :db/ident :fibo-fbc-fct-bci/Abha,
   :dcterms/description "the international business center of Abha",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Abha"})

(def Abidjan
  {:cmns-col/isPartOf :lcc-3166-1/CoteDIvoire,
   :db/ident :fibo-fbc-fct-bci/Abidjan,
   :dcterms/description "the international business center of Abidjan",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Abidjan"})

(def AbuDhabiBusinessDay
  {:db/ident :fibo-fbc-fct-bci/AbuDhabiBusinessDay,
   :dcterms/description "the business day adjustment convention for Abu Dhabi",
   :fibo-fnd-plc-loc/hasBusinessCenter :fibo-fbc-fct-bci/Abu_Dhabi,
   :rdf/type #{:fibo-fnd-dt-bd/BusinessDayAdjustment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Abu Dhabi business day"})

(def AbuDhabiSettlementDay
  {:db/ident :fibo-fbc-fct-bci/AbuDhabiSettlementDay,
   :dcterms/description
   "the settlement day adjustment convention for Abu Dhabi",
   :fibo-fnd-plc-loc/hasBusinessCenter :fibo-fbc-fct-bci/Abu_Dhabi,
   :rdf/type #{:fibo-fnd-dt-bd/BusinessDayAdjustment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Abu Dhabi settlement day"})

(def Abu_Dhabi
  {:cmns-col/isPartOf :lcc-3166-1/UnitedArabEmirates,
   :db/ident :fibo-fbc-fct-bci/Abu_Dhabi,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Abu Dhabi"})

(def Abuja
  {:cmns-col/isPartOf :lcc-3166-1/Nigeria,
   :db/ident :fibo-fbc-fct-bci/Abuja,
   :dcterms/description "the international business center of Abuja",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Abuja"})

(def Accra
  {:cmns-col/isPartOf :lcc-3166-1/Ghana,
   :db/ident :fibo-fbc-fct-bci/Accra,
   :dcterms/description "the international business center of Accra",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Accra"})

(def Addis_Ababa
  {:cmns-col/isPartOf :lcc-3166-1/Ethiopia,
   :db/ident :fibo-fbc-fct-bci/Addis_Ababa,
   :dcterms/description "the international business center of Addis Ababa",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Addis Ababa"})

(def Adelaide
  {:cmns-col/isPartOf :lcc-3166-1/Australia,
   :db/ident :fibo-fbc-fct-bci/Adelaide,
   :dcterms/description "the international business center of Adelaide",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Adelaide"})

(def Aden
  {:cmns-col/isPartOf :lcc-3166-1/Yemen,
   :db/ident :fibo-fbc-fct-bci/Aden,
   :dcterms/description "the international business center of Aden",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Aden"})

(def Ahmedabad
  {:cmns-col/isPartOf :lcc-3166-1/India,
   :db/ident :fibo-fbc-fct-bci/Ahmedabad,
   :dcterms/description "the international business center of Ahmedabad",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Ahmedabad"})

(def Aichi
  {:cmns-col/isPartOf :lcc-3166-1/Japan,
   :db/ident :fibo-fbc-fct-bci/Aichi,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Aichi"})

(def Alberta
  {:cmns-col/isPartOf :lcc-3166-1/Canada,
   :db/ident :fibo-fbc-fct-bci/Alberta,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Alberta"})

(def Algiers
  {:cmns-col/isPartOf :lcc-3166-1/Algeria,
   :db/ident :fibo-fbc-fct-bci/Algiers,
   :dcterms/description "the international business center of Algiers",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Algiers"})

(def Almaty
  {:cmns-col/isPartOf :lcc-3166-1/Kazakhstan,
   :db/ident :fibo-fbc-fct-bci/Almaty,
   :dcterms/description "the international business center of Almaty",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Almaty"})

(def Amman
  {:cmns-col/isPartOf :lcc-3166-1/Jordan,
   :db/ident :fibo-fbc-fct-bci/Amman,
   :dcterms/description "the international business center of Amman",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Amman"})

(def Amsterdam
  {:cmns-col/isPartOf :lcc-3166-1/Netherlands,
   :db/ident :fibo-fbc-fct-bci/Amsterdam,
   :dcterms/description "the international business center of Amsterdam",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Amsterdam"})

(def Ankara
  {:cmns-col/isPartOf :lcc-3166-1/Turkey,
   :db/ident :fibo-fbc-fct-bci/Ankara,
   :dcterms/description "the international business center of Ankara",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Ankara"})

(def Antananarivo
  {:cmns-col/isPartOf :lcc-3166-1/Madagascar,
   :db/ident :fibo-fbc-fct-bci/Antananarivo,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Antananarivo"})

(def Antwerpen
  {:cmns-col/isPartOf :lcc-3166-1/Belgium,
   :db/ident :fibo-fbc-fct-bci/Antwerpen,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Antwerpen"})

(def Astana
  {:cmns-col/isPartOf :lcc-3166-1/Kazakhstan,
   :db/ident :fibo-fbc-fct-bci/Astana,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Astana"})

(def Asuncion
  {:cmns-col/isPartOf :lcc-3166-1/Paraguay,
   :db/ident :fibo-fbc-fct-bci/Asuncion,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Asuncion"})

(def Athens
  {:cmns-col/isPartOf :lcc-3166-1/Greece,
   :db/ident :fibo-fbc-fct-bci/Athens,
   :dcterms/description "the international business center of Athens",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Athens"})

(def Atlanta
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Atlanta,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Atlanta"})

(def Auckland
  {:cmns-col/isPartOf :lcc-3166-1/NewZealand,
   :db/ident :fibo-fbc-fct-bci/Auckland,
   :dcterms/description "the international business center of Auckland",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Auckland"})

(def Aylesbury
  {:cmns-col/isPartOf :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :db/ident :fibo-fbc-fct-bci/Aylesbury,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Aylesbury"})

(def BBBR
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Bridgetown,
   :db/ident :fibo-fbc-fct-bci/BBBR,
   :dcterms/description
   "the FpML business center code for Bridgetown, Barbados",
   :fibo-fnd-rel-rel/hasTag "BBBR",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "BBBR"})

(def BDDH
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Dhaka,
   :db/ident :fibo-fbc-fct-bci/BDDH,
   :dcterms/description "the FpML business center code for Dhaka, Bangladesh",
   :fibo-fnd-rel-rel/hasTag "BDDH",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "BDDH"})

(def BEBR
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Brussels,
   :db/ident :fibo-fbc-fct-bci/BEBR,
   :dcterms/description "the FpML business center code for Brussels, Belgium",
   :fibo-fnd-rel-rel/hasTag "BEBR",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "BEBR"})

(def BGSO
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Sofia,
   :db/ident :fibo-fbc-fct-bci/BGSO,
   :dcterms/description "the FpML business center code for Sofia, Bulgaria",
   :fibo-fnd-rel-rel/hasTag "BGSO",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "BGSO"})

(def BHMA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Manama,
   :db/ident :fibo-fbc-fct-bci/BHMA,
   :dcterms/description "the FpML business center code for Manama, Bahrain",
   :fibo-fnd-rel-rel/hasTag "BHMA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "BHMA"})

(def BMHA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Hamilton,
   :db/ident :fibo-fbc-fct-bci/BMHA,
   :dcterms/description "the FpML business center code for Hamilton, Bermuda",
   :fibo-fnd-rel-rel/hasTag "BMHA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "BMHA"})

(def BNBS
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Bandar_Seri_Begawan,
   :db/ident :fibo-fbc-fct-bci/BNBS,
   :dcterms/description
   "the FpML business center code for Bandar Seri Begawan, Brunei",
   :fibo-fnd-rel-rel/hasTag "BNBS",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "BNBS"})

(def BOLP
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/La_Paz,
   :db/ident :fibo-fbc-fct-bci/BOLP,
   :dcterms/description "the FpML business center code for La Paz, Bolivia",
   :fibo-fnd-rel-rel/hasTag "BOLP",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "BOLP"})

(def BRBD
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/BrazilBusinessDay,
   :db/ident :fibo-fbc-fct-bci/BRBD,
   :dcterms/description "the FpML business center code for Brazil Business Day",
   :fibo-fnd-rel-rel/hasTag "BRBD",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessDayAdjustmentCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "BRBD"})

(def BRBR
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Brasilia,
   :db/ident :fibo-fbc-fct-bci/BRBR,
   :dcterms/description "the FpML business center code for Brasilia, Brazil",
   :fibo-fnd-rel-rel/hasTag "BRBR",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "BRBR"})

(def BRRJ
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Rio_de_Janeiro,
   :db/ident :fibo-fbc-fct-bci/BRRJ,
   :dcterms/description
   "the FpML business center code for Rio de Janeiro, Brazil",
   :fibo-fnd-rel-rel/hasTag "BRRJ",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "BRRJ"})

(def BRSP
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Sao_Paulo,
   :db/ident :fibo-fbc-fct-bci/BRSP,
   :dcterms/description "the FpML business center code for Sao Paulo, Brazil",
   :fibo-fnd-rel-rel/hasTag "BRSP",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "BRSP"})

(def BSNA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Nassau,
   :db/ident :fibo-fbc-fct-bci/BSNA,
   :dcterms/description "the FpML business center code for Nassau, Bahamas",
   :fibo-fnd-rel-rel/hasTag "BSNA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "BSNA"})

(def BWGA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Gaborone,
   :db/ident :fibo-fbc-fct-bci/BWGA,
   :dcterms/description "the FpML business center code for Gaborone, Botswana",
   :fibo-fnd-rel-rel/hasTag "BWGA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "BWGA"})

(def BYMI
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Minsk,
   :db/ident :fibo-fbc-fct-bci/BYMI,
   :dcterms/description "the FpML business center code for Minsk, Belarus",
   :fibo-fnd-rel-rel/hasTag "BYMI",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "BYMI"})

(def Baghdad
  {:cmns-col/isPartOf :lcc-3166-1/Iraq,
   :db/ident :fibo-fbc-fct-bci/Baghdad,
   :dcterms/description "the international business center of Baghdad",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Baghdad"})

(def Baku
  {:cmns-col/isPartOf :lcc-3166-1/Azerbaijan,
   :db/ident :fibo-fbc-fct-bci/Baku,
   :dcterms/description "the international business center of Baku",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Baku"})

(def Bandar_Seri_Begawan
  {:cmns-col/isPartOf :lcc-3166-1/BruneiDarussalam,
   :db/ident :fibo-fbc-fct-bci/Bandar_Seri_Begawan,
   :dcterms/description
   "the international business center of Bandar Seri Begawan",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Bandar Seri Begawan"})

(def Bangalore
  {:cmns-col/isPartOf :lcc-3166-1/India,
   :db/ident :fibo-fbc-fct-bci/Bangalore,
   :dcterms/description "the international business center of Bangalore",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Bangalore"})

(def Bangkok
  {:cmns-col/isPartOf :lcc-3166-1/Thailand,
   :db/ident :fibo-fbc-fct-bci/Bangkok,
   :dcterms/description "the international business center of Bangkok",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Bangkok"})

(def Banja_Luka
  {:cmns-col/isPartOf :lcc-3166-1/BosniaAndHerzegovina,
   :db/ident :fibo-fbc-fct-bci/Banja_Luka,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Banja Luka"})

(def Banjul
  {:cmns-col/isPartOf :lcc-3166-1/Gambia,
   :db/ident :fibo-fbc-fct-bci/Banjul,
   :dcterms/description "the international business center of Banjul",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Banjul"})

(def Barcelona
  {:cmns-col/isPartOf :lcc-3166-1/Spain,
   :db/ident :fibo-fbc-fct-bci/Barcelona,
   :dcterms/description "the international business center of Barcelona",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Barcelona"})

(def Basel
  {:cmns-col/isPartOf :lcc-3166-1/Switzerland,
   :db/ident :fibo-fbc-fct-bci/Basel,
   :dcterms/description "the international business center of Basel",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Basel"})

(def Basseterre
  {:cmns-col/isPartOf :lcc-3166-1/SaintKittsAndNevis,
   :db/ident :fibo-fbc-fct-bci/Basseterre,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Basseterre"})

(def Bedminster
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Bedminster,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Bedminster"})

(def Beijing
  {:cmns-col/isPartOf :lcc-3166-1/China,
   :db/ident :fibo-fbc-fct-bci/Beijing,
   :dcterms/description "the international business center of Beijing",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Beijing"})

(def Beirut
  {:cmns-col/isPartOf :lcc-3166-1/Lebanon,
   :db/ident :fibo-fbc-fct-bci/Beirut,
   :dcterms/description "the international business center of Beirut",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Beirut"})

(def Belgrade
  {:cmns-col/isPartOf :lcc-3166-1/Serbia,
   :db/ident :fibo-fbc-fct-bci/Belgrade,
   :dcterms/description "the international business center of Belgrade",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Belgrade"})

(def Bergamo
  {:cmns-col/isPartOf :lcc-3166-1/Italy,
   :db/ident :fibo-fbc-fct-bci/Bergamo,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Bergamo"})

(def Bergen
  {:cmns-col/isPartOf :lcc-3166-1/Norway,
   :db/ident :fibo-fbc-fct-bci/Bergen,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Bergen"})

(def Berlin
  {:cmns-col/isPartOf :lcc-3166-1/Germany,
   :db/ident :fibo-fbc-fct-bci/Berlin,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Berlin"})

(def Bermuda
  {:cmns-col/isPartOf :lcc-3166-1/Bermuda,
   :db/ident :fibo-fbc-fct-bci/Bermuda,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Bermuda"})

(def Berne
  {:cmns-col/isPartOf :lcc-3166-1/Switzerland,
   :db/ident :fibo-fbc-fct-bci/Berne,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Berne"})

(def Biella
  {:cmns-col/isPartOf :lcc-3166-1/Italy,
   :db/ident :fibo-fbc-fct-bci/Biella,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Biella"})

(def Bilbao
  {:cmns-col/isPartOf :lcc-3166-1/Spain,
   :db/ident :fibo-fbc-fct-bci/Bilbao,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Bilbao"})

(def Bishkek
  {:cmns-col/isPartOf :lcc-3166-1/Kyrgyzstan,
   :db/ident :fibo-fbc-fct-bci/Bishkek,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Bishkek"})

(def Blantyre
  {:cmns-col/isPartOf :lcc-3166-1/Malawi,
   :db/ident :fibo-fbc-fct-bci/Blantyre,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Blantyre"})

(def Boca_Raton
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Boca_Raton,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Boca Raton"})

(def Bogota
  {:cmns-col/isPartOf :lcc-3166-1/Colombia,
   :db/ident :fibo-fbc-fct-bci/Bogota,
   :dcterms/description "the international business center of Bogota",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Bogota"})

(def Bologna
  {:cmns-col/isPartOf :lcc-3166-1/Italy,
   :db/ident :fibo-fbc-fct-bci/Bologna,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Bologna"})

(def Boston
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Boston,
   :dcterms/description "the international business center of Boston",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Boston"})

(def Bradford
  {:cmns-col/isPartOf :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :db/ident :fibo-fbc-fct-bci/Bradford,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Bradford"})

(def Brasilia
  {:cmns-col/isPartOf :lcc-3166-1/Brazil,
   :db/ident :fibo-fbc-fct-bci/Brasilia,
   :dcterms/description "the international business center of Brasilia",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Brasilia"})

(def Bratislava
  {:cmns-col/isPartOf :lcc-3166-1/Slovakia,
   :db/ident :fibo-fbc-fct-bci/Bratislava,
   :dcterms/description "the international business center of Bratislava",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Bratislava"})

(def BrazilBusinessDay
  {:db/ident :fibo-fbc-fct-bci/BrazilBusinessDay,
   :dcterms/description
   "the business day adjustment convention for the Brazil Business Day. This means a business day in any of Sao Paulo, Rio de Janeiro or Brasilia not otherwise declared as a financial market holiday by the Bolsa de Mercadorias & Futuros (BM&F)",
   :fibo-fnd-plc-loc/hasBusinessCenter #{:fibo-fbc-fct-bci/Rio_de_Janeiro
                                         :fibo-fbc-fct-bci/Sao_Paulo
                                         :fibo-fbc-fct-bci/Brasilia},
   :rdf/type #{:fibo-fnd-dt-bd/BusinessDayAdjustment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Brazil Business Day"})

(def Bremen
  {:cmns-col/isPartOf :lcc-3166-1/Germany,
   :db/ident :fibo-fbc-fct-bci/Bremen,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Bremen"})

(def Bridgetown
  {:cmns-col/isPartOf :lcc-3166-1/Barbados,
   :db/ident :fibo-fbc-fct-bci/Bridgetown,
   :dcterms/description "the international business center of Bridgetown",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Bridgetown"})

(def Brisbane
  {:cmns-col/isPartOf :lcc-3166-1/Australia,
   :db/ident :fibo-fbc-fct-bci/Brisbane,
   :dcterms/description "the international business center of Brisbane",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Brisbane"})

(def Brussels
  {:cmns-col/isPartOf :lcc-3166-1/Belgium,
   :db/ident :fibo-fbc-fct-bci/Brussels,
   :dcterms/description "the international business center of Brussels",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Brussels"})

(def Bryanston_Sandton
  {:cmns-col/isPartOf :lcc-3166-1/SouthAfrica,
   :db/ident :fibo-fbc-fct-bci/Bryanston_Sandton,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Bryanston, Sandton"})

(def Bucharest
  {:cmns-col/isPartOf :lcc-3166-1/Romania,
   :db/ident :fibo-fbc-fct-bci/Bucharest,
   :dcterms/description "the international business center of Bucharest",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Bucharest"})

(def Budaors
  {:cmns-col/isPartOf :lcc-3166-1/Hungary,
   :db/ident :fibo-fbc-fct-bci/Budaors,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Budaors"})

(def Budapest
  {:cmns-col/isPartOf :lcc-3166-1/Hungary,
   :db/ident :fibo-fbc-fct-bci/Budapest,
   :dcterms/description "the international business center of Budapest",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Budapest"})

(def Buenos_Aires
  {:cmns-col/isPartOf :lcc-3166-1/Argentina,
   :db/ident :fibo-fbc-fct-bci/Buenos_Aires,
   :dcterms/description "the international business center of Buenos Aires",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Buenos Aires"})

(def CACL
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Calgary,
   :db/ident :fibo-fbc-fct-bci/CACL,
   :dcterms/description "the FpML business center code for Calgary, Canada",
   :fibo-fnd-rel-rel/hasTag "CACL",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "CACL"})

(def CAFR
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Fredericton,
   :db/ident :fibo-fbc-fct-bci/CAFR,
   :dcterms/description "the FpML business center code for Fredericton, Canada",
   :fibo-fnd-rel-rel/hasTag "CAFR",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "CAFR"})

(def CAMO
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Montreal,
   :db/ident :fibo-fbc-fct-bci/CAMO,
   :dcterms/description "the FpML business center code for Montreal, Canada",
   :fibo-fnd-rel-rel/hasTag "CAMO",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "CAMO"})

(def CAOT
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Ottawa,
   :db/ident :fibo-fbc-fct-bci/CAOT,
   :dcterms/description "the FpML business center code for Ottawa, Canada",
   :fibo-fnd-rel-rel/hasTag "CAOT",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "CAOT"})

(def CATO
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Toronto,
   :db/ident :fibo-fbc-fct-bci/CATO,
   :dcterms/description "the FpML business center code for Toronto, Canada",
   :fibo-fnd-rel-rel/hasTag "CATO",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "CATO"})

(def CAVA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Vancouver,
   :db/ident :fibo-fbc-fct-bci/CAVA,
   :dcterms/description "the FpML business center code for Vancouver, Canada",
   :fibo-fnd-rel-rel/hasTag "CAVA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "CAVA"})

(def CAWI
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Winnipeg,
   :db/ident :fibo-fbc-fct-bci/CAWI,
   :dcterms/description "the FpML business center code for Winnipeg, Canada",
   :fibo-fnd-rel-rel/hasTag "CAWI",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "CAWI"})

(def CHBA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Basel,
   :db/ident :fibo-fbc-fct-bci/CHBA,
   :dcterms/description "the FpML business center code for Basel, Switzerland",
   :fibo-fnd-rel-rel/hasTag "CHBA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "CHBA"})

(def CHGE
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Geneva,
   :db/ident :fibo-fbc-fct-bci/CHGE,
   :dcterms/description "the FpML business center code for Geneva, Switzerland",
   :fibo-fnd-rel-rel/hasTag "CHGE",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "CHGE"})

(def CHZU
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Zurich,
   :db/ident :fibo-fbc-fct-bci/CHZU,
   :dcterms/description "the FpML business center code for Zurich, Switzerland",
   :fibo-fnd-rel-rel/hasTag "CHZU",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "CHZU"})

(def CIAB
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Abidjan,
   :db/ident :fibo-fbc-fct-bci/CIAB,
   :dcterms/description
   "the FpML business center code for Abidjan, Cote d'Ivoire",
   :fibo-fnd-rel-rel/hasTag "CIAB",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "CIAB"})

(def CLSA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Santiago,
   :db/ident :fibo-fbc-fct-bci/CLSA,
   :dcterms/description "the FpML business center code for Santiago, Chile",
   :fibo-fnd-rel-rel/hasTag "CLSA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "CLSA"})

(def CMYA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Yaounde,
   :db/ident :fibo-fbc-fct-bci/CMYA,
   :dcterms/description "the FpML business center code for Yaounde, Cameroon",
   :fibo-fnd-rel-rel/hasTag "CMYA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "CMYA"})

(def CNBE
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Beijing,
   :db/ident :fibo-fbc-fct-bci/CNBE,
   :dcterms/description "the FpML business center code for Beijing, China",
   :fibo-fnd-rel-rel/hasTag "CNBE",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "CNBE"})

(def CNSH
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Shanghai,
   :db/ident :fibo-fbc-fct-bci/CNSH,
   :dcterms/description "the FpML business center code for Shanghai, China",
   :fibo-fnd-rel-rel/hasTag "CNSH",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "CNSH"})

(def COBO
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Bogota,
   :db/ident :fibo-fbc-fct-bci/COBO,
   :dcterms/description "the FpML business center code for Bogota, Colombia",
   :fibo-fnd-rel-rel/hasTag "COBO",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "COBO"})

(def CRSJ
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/San_Jose,
   :db/ident :fibo-fbc-fct-bci/CRSJ,
   :dcterms/description
   "the FpML business center code for San Jose, Costa Rica",
   :fibo-fnd-rel-rel/hasTag "CRSJ",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "CRSJ"})

(def CWWI
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Willemstad,
   :db/ident :fibo-fbc-fct-bci/CWWI,
   :dcterms/description "the FpML business center code for Willemstad, Curacao",
   :fibo-fnd-rel-rel/hasTag "CWWI",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "CWWI"})

(def CYNI
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Nicosia,
   :db/ident :fibo-fbc-fct-bci/CYNI,
   :dcterms/description "the FpML business center code for Nicosia, Cyprus",
   :fibo-fnd-rel-rel/hasTag "CYNI",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "CYNI"})

(def CZPR
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Prague,
   :db/ident :fibo-fbc-fct-bci/CZPR,
   :dcterms/description
   "the FpML business center code for Prague, Czech Republic",
   :fibo-fnd-rel-rel/hasTag "CZPR",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "CZPR"})

(def Cairo
  {:cmns-col/isPartOf :lcc-3166-1/Egypt,
   :db/ident :fibo-fbc-fct-bci/Cairo,
   :dcterms/description "the international business center of Cairo",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Cairo"})

(def Calcutta
  {:cmns-col/isPartOf :lcc-3166-1/India,
   :db/ident :fibo-fbc-fct-bci/Calcutta,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Calcutta"})

(def Calgary
  {:cmns-col/isPartOf :lcc-3166-1/Canada,
   :db/ident :fibo-fbc-fct-bci/Calgary,
   :dcterms/description "the international business center of Calgary",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Calgary"})

(def Canberra
  {:cmns-col/isPartOf :lcc-3166-1/Australia,
   :db/ident :fibo-fbc-fct-bci/Canberra,
   :dcterms/description "the international business center of Canberra",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Canberra"})

(def Caracas
  {:cmns-col/isPartOf :lcc-3166-1/Venezuela,
   :db/ident :fibo-fbc-fct-bci/Caracas,
   :dcterms/description "the international business center of Caracas",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Caracas"})

(def Casablanca
  {:cmns-col/isPartOf :lcc-3166-1/Morocco,
   :db/ident :fibo-fbc-fct-bci/Casablanca,
   :dcterms/description "the international business center of Casablanca",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Casablanca"})

(def Charlotte
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Charlotte,
   :dcterms/description "the international business center of Charlotte",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Charlotte"})

(def Chatham
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Chatham,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Chatham"})

(def Chennai
  {:cmns-col/isPartOf :lcc-3166-1/India,
   :db/ident :fibo-fbc-fct-bci/Chennai,
   :dcterms/description "the international business center of Chennai",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Chennai"})

(def Chicago
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Chicago,
   :dcterms/description "the international business center of Chicago",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Chicago"})

(def Chisinau
  {:cmns-col/isPartOf :lcc-3166-1/Moldova,
   :db/ident :fibo-fbc-fct-bci/Chisinau,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Chisinau"})

(def Chittagong
  {:cmns-col/isPartOf :lcc-3166-1/Bangladesh,
   :db/ident :fibo-fbc-fct-bci/Chittagong,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Chittagong"})

(def Chiyoda-ku
  {:cmns-col/isPartOf :lcc-3166-1/Japan,
   :db/ident :fibo-fbc-fct-bci/Chiyoda-ku,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Chiyoda-ku"})

(def Cluj_Napoca
  {:cmns-col/isPartOf :lcc-3166-1/Romania,
   :db/ident :fibo-fbc-fct-bci/Cluj_Napoca,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Cluj Napoca"})

(def Cologne
  {:cmns-col/isPartOf :lcc-3166-1/Germany,
   :db/ident :fibo-fbc-fct-bci/Cologne,
   :dcterms/description "the international business center of Cologne",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Cologne"})

(def Colombo
  {:cmns-col/isPartOf :lcc-3166-1/SriLanka,
   :db/ident :fibo-fbc-fct-bci/Colombo,
   :dcterms/description "the international business center of Colombo",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Colombo"})

(def Conakry
  {:cmns-col/isPartOf :lcc-3166-1/Guinea,
   :db/ident :fibo-fbc-fct-bci/Conakry,
   :dcterms/description "the international business center of Conakry",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Conakry"})

(def Copenhagen
  {:cmns-col/isPartOf :lcc-3166-1/Denmark,
   :db/ident :fibo-fbc-fct-bci/Copenhagen,
   :dcterms/description "the international business center of Copenhagen",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Copenhagen"})

(def Cordoba
  {:cmns-col/isPartOf :lcc-3166-1/Argentina,
   :db/ident :fibo-fbc-fct-bci/Cordoba,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Cordoba"})

(def Corrientes
  {:cmns-col/isPartOf :lcc-3166-1/Argentina,
   :db/ident :fibo-fbc-fct-bci/Corrientes,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Corrientes"})

(def Curitiba
  {:cmns-col/isPartOf :lcc-3166-1/Brazil,
   :db/ident :fibo-fbc-fct-bci/Curitiba,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Curitiba"})

(def DECO
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Cologne,
   :db/ident :fibo-fbc-fct-bci/DECO,
   :dcterms/description "the FpML business center code for Cologne, Germany",
   :fibo-fnd-rel-rel/hasTag "DECO",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "DECO"})

(def DEDU
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Dusseldorf,
   :db/ident :fibo-fbc-fct-bci/DEDU,
   :dcterms/description "the FpML business center code for Dusseldorf, Germany",
   :fibo-fnd-rel-rel/hasTag "DEDU",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "DEDU"})

(def DEFR
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Frankfurt,
   :db/ident :fibo-fbc-fct-bci/DEFR,
   :dcterms/description "the FpML business center code for Frankfurt, Germany",
   :fibo-fnd-rel-rel/hasTag "DEFR",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "DEFR"})

(def DEHA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Hannover,
   :db/ident :fibo-fbc-fct-bci/DEHA,
   :dcterms/description "the FpML business center code for Hannover, Germany",
   :fibo-fnd-rel-rel/hasTag "DEHA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "DEHA"})

(def DEHH
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Hamburg,
   :db/ident :fibo-fbc-fct-bci/DEHH,
   :dcterms/description "the FpML business center code for Hamburg, Germany",
   :fibo-fnd-rel-rel/hasTag "DEHH",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "DEHH"})

(def DELE
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Leipzig,
   :db/ident :fibo-fbc-fct-bci/DELE,
   :dcterms/description "the FpML business center code for Leipzig, Germany",
   :fibo-fnd-rel-rel/hasTag "DELE",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "DELE"})

(def DEMA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Mainz,
   :db/ident :fibo-fbc-fct-bci/DEMA,
   :dcterms/description "the FpML business center code for Mainz, Germany",
   :fibo-fnd-rel-rel/hasTag "DEMA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "DEMA"})

(def DEMU
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Munich,
   :db/ident :fibo-fbc-fct-bci/DEMU,
   :dcterms/description "the FpML business center code for Munich, Germany",
   :fibo-fnd-rel-rel/hasTag "DEMU",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "DEMU"})

(def DEST
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Stuttgart,
   :db/ident :fibo-fbc-fct-bci/DEST,
   :dcterms/description "the FpML business center code for Stuttgart, Germany",
   :fibo-fnd-rel-rel/hasTag "DEST",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "DEST"})

(def DKCO
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Copenhagen,
   :db/ident :fibo-fbc-fct-bci/DKCO,
   :dcterms/description "the FpML business center code for Copenhagen, Denmark",
   :fibo-fnd-rel-rel/hasTag "DKCO",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "DKCO"})

(def DOSD
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Santo_Domingo,
   :db/ident :fibo-fbc-fct-bci/DOSD,
   :dcterms/description
   "the FpML business center code for Santo Domingo, Dominican Republic",
   :fibo-fnd-rel-rel/hasTag "DOSD",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "DOSD"})

(def DZAL
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Algiers,
   :db/ident :fibo-fbc-fct-bci/DZAL,
   :dcterms/description "the FpML business center code for Algiers, Algeria",
   :fibo-fnd-rel-rel/hasTag "DZAL",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "DZAL"})

(def Dakar
  {:cmns-col/isPartOf :lcc-3166-1/Senegal,
   :db/ident :fibo-fbc-fct-bci/Dakar,
   :dcterms/description "the international business center of Dakar",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Dakar"})

(def Dalian
  {:cmns-col/isPartOf :lcc-3166-1/China,
   :db/ident :fibo-fbc-fct-bci/Dalian,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Dalian"})

(def Damascus
  {:cmns-col/isPartOf :lcc-3166-1/SyrianArabRepublic,
   :db/ident :fibo-fbc-fct-bci/Damascus,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Damascus"})

(def Dar_es_Salaam
  {:cmns-col/isPartOf :lcc-3166-1/Tanzania,
   :db/ident :fibo-fbc-fct-bci/Dar_es_Salaam,
   :dcterms/description "the international business center of Dar es Salaam",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Dar es Salaam"})

(def Darwin
  {:cmns-col/isPartOf :lcc-3166-1/Australia,
   :db/ident :fibo-fbc-fct-bci/Darwin,
   :dcterms/description "the international business center of Darwin",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Darwin"})

(def Denver
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Denver,
   :dcterms/description "the international business center of Denver",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Denver"})

(def Detroit
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Detroit,
   :dcterms/description "the international business center of Detroit",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Detroit"})

(def Dhaka
  {:cmns-col/isPartOf :lcc-3166-1/Bangladesh,
   :db/ident :fibo-fbc-fct-bci/Dhaka,
   :dcterms/description "the international business center of Dhaka",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Dhaka"})

(def Dnipropetrovsk
  {:cmns-col/isPartOf :lcc-3166-1/Ukraine,
   :db/ident :fibo-fbc-fct-bci/Dnipropetrovsk,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Dnipropetrovsk"})

(def Dodoma
  {:cmns-col/isPartOf :lcc-3166-1/Tanzania,
   :db/ident :fibo-fbc-fct-bci/Dodoma,
   :dcterms/description "the international business center of Dodoma",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Dodoma"})

(def Doha
  {:cmns-col/isPartOf :lcc-3166-1/Qatar,
   :db/ident :fibo-fbc-fct-bci/Doha,
   :dcterms/description "the international business center of Doha",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Doha"})

(def Douala
  {:cmns-col/isPartOf :lcc-3166-1/Cameroon,
   :db/ident :fibo-fbc-fct-bci/Douala,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Douala"})

(def Dubai
  {:cmns-col/isPartOf :lcc-3166-1/UnitedArabEmirates,
   :db/ident :fibo-fbc-fct-bci/Dubai,
   :dcterms/description "the international business center of Dubai",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Dubai"})

(def Dublin
  {:cmns-col/isPartOf :lcc-3166-1/Ireland,
   :db/ident :fibo-fbc-fct-bci/Dublin,
   :dcterms/description "the international business center of Dublin",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Dublin"})

(def Dusseldorf
  {:cmns-col/isPartOf :lcc-3166-1/Germany,
   :db/ident :fibo-fbc-fct-bci/Dusseldorf,
   :dcterms/description "the international business center of Dusseldorf",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Dusseldorf"})

(def ECGU
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Guayaquil,
   :db/ident :fibo-fbc-fct-bci/ECGU,
   :dcterms/description "the FpML business center code for Guayaquil, Ecuador",
   :fibo-fnd-rel-rel/hasTag "ECGU",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "ECGU"})

(def EETA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Tallinn,
   :db/ident :fibo-fbc-fct-bci/EETA,
   :dcterms/description "the FpML business center code for Tallinn, Estonia",
   :fibo-fnd-rel-rel/hasTag "EETA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "EETA"})

(def EGCA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Cairo,
   :db/ident :fibo-fbc-fct-bci/EGCA,
   :dcterms/description "the FpML business center code for Cairo, Egypt",
   :fibo-fnd-rel-rel/hasTag "EGCA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "EGCA"})

(def ESAS
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/ESASSettlementDay,
   :db/ident :fibo-fbc-fct-bci/ESAS,
   :dcterms/description
   "the FpML business center code for ESAS Settlement Day (as defined in 2006 ISDA Definitions Section 7.1 and Supplement Number 15 to the 2000 ISDA Definitions)",
   :fibo-fnd-rel-rel/hasTag "ESAS",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessDayAdjustmentCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "ESAS"})

(def ESASSettlementDay
  {:cmns-av/explanatoryNote
   "ESAS is the Reserve Bank of New Zealand's Exchange Settlement Account System which is used by banks and other approved financial institutions to settle their obligations on a Real-Time Gross Settlement (RTGS) basis.",
   :db/ident :fibo-fbc-fct-bci/ESASSettlementDay,
   :dcterms/description
   "the business day adjustment convention for the ESAS Settlement Day (as defined in 2006 ISDA Definitions Section 7.1 and Supplement Number 15 to the 2000 ISDA Definitions)",
   :fibo-fnd-plc-loc/hasBusinessCenter :fibo-fbc-fct-bci/Wellington,
   :rdf/type #{:fibo-fnd-dt-bd/BusinessDayAdjustment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "ESAS Settlement Day"})

(def ESBA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Barcelona,
   :db/ident :fibo-fbc-fct-bci/ESBA,
   :dcterms/description "the FpML business center code for Barcelona, Spain",
   :fibo-fnd-rel-rel/hasTag "ESBA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "ESBA"})

(def ESMA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Madrid,
   :db/ident :fibo-fbc-fct-bci/ESMA,
   :dcterms/description "the FpML business center code for Madrid, Spain",
   :fibo-fnd-rel-rel/hasTag "ESMA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "ESMA"})

(def ESSS
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/San_Sebastian,
   :db/ident :fibo-fbc-fct-bci/ESSS,
   :dcterms/description
   "the FpML business center code for San Sebastian, Spain",
   :fibo-fnd-rel-rel/hasTag "ESSS",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "ESSS"})

(def ETAA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Addis_Ababa,
   :db/ident :fibo-fbc-fct-bci/ETAA,
   :dcterms/description
   "the FpML business center code for Addis Ababa, Ethiopia",
   :fibo-fnd-rel-rel/hasTag "ETAA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "ETAA"})

(def EUTA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/TARGETSettlementDay,
   :db/ident :fibo-fbc-fct-bci/EUTA,
   :dcterms/description
   "the FpML business center code for TARGET Settlement Day",
   :fibo-fnd-rel-rel/hasTag "EUTA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessDayAdjustmentCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "EUTA"})

(def Ebene
  {:cmns-col/isPartOf :lcc-3166-1/Mauritius,
   :db/ident :fibo-fbc-fct-bci/Ebene,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Ebene"})

(def Eden_Island
  {:cmns-col/isPartOf :lcc-3166-1/Seychelles,
   :db/ident :fibo-fbc-fct-bci/Eden_Island,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Eden Island"})

(def Edinburgh
  {:cmns-col/isPartOf :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :db/ident :fibo-fbc-fct-bci/Edinburgh,
   :dcterms/description "the international business center of Edinburgh",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Edinburgh"})

(def Ekaterinburg
  {:cmns-col/isPartOf :lcc-3166-1/RussianFederation,
   :db/ident :fibo-fbc-fct-bci/Ekaterinburg,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Ekaterinburg"})

(def El_Salvador
  {:cmns-col/isPartOf :lcc-3166-1/ElSalvador,
   :db/ident :fibo-fbc-fct-bci/El_Salvador,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "El Salvador"})

(def Esch-sur-alzette
  {:cmns-col/isPartOf :lcc-3166-1/Luxembourg,
   :db/ident :fibo-fbc-fct-bci/Esch-sur-alzette,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Esch-sur-alzette"})

(def Eschborn
  {:cmns-col/isPartOf :lcc-3166-1/Germany,
   :db/ident :fibo-fbc-fct-bci/Eschborn,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Eschborn"})

(def Espirito_Santo
  {:cmns-col/isPartOf :lcc-3166-1/Brazil,
   :db/ident :fibo-fbc-fct-bci/Espirito_Santo,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Espirito Santo"})

(def Espoo
  {:cmns-col/isPartOf :lcc-3166-1/Finland,
   :db/ident :fibo-fbc-fct-bci/Espoo,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Espoo"})

(def FIHE
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Helsinki,
   :db/ident :fibo-fbc-fct-bci/FIHE,
   :dcterms/description "the FpML business center code for Helsinki, Finland",
   :fibo-fnd-rel-rel/hasTag "FIHE",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "FIHE"})

(def FRPA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Paris,
   :db/ident :fibo-fbc-fct-bci/FRPA,
   :dcterms/description "the FpML business center code for Paris, France",
   :fibo-fnd-rel-rel/hasTag "FRPA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "FRPA"})

(def Fiac
  {:cmns-col/isPartOf :lcc-3166-1/France,
   :db/ident :fibo-fbc-fct-bci/Fiac,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Fiac"})

(def Firenze
  {:cmns-col/isPartOf :lcc-3166-1/Italy,
   :db/ident :fibo-fbc-fct-bci/Firenze,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Firenze"})

(def Florence
  {:cmns-col/isPartOf :lcc-3166-1/Italy,
   :db/ident :fibo-fbc-fct-bci/Florence,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Florence"})

(def FpMLBusinessCenterCodeScheme
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "http://www.fpml.org/coding-scheme/business-center"},
   :db/ident :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :dcterms/description
   "the coding scheme used to define a set of codes for municipalities, or business centers, or business day adjustments for FpML",
   :rdf/type #{:owl/NamedIndividual :fibo-fbc-fct-bc/BusinessCenterCodeScheme},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "FpML Business Center Code Scheme"})

(def Frankfurt
  {:cmns-col/isPartOf :lcc-3166-1/Germany,
   :db/ident :fibo-fbc-fct-bci/Frankfurt,
   :dcterms/description "the international business center of Frankfurt",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Frankfurt"})

(def Fredericton
  {:cmns-col/isPartOf :lcc-3166-1/Canada,
   :db/ident :fibo-fbc-fct-bci/Fredericton,
   :dcterms/description "the international business center of Fredericton",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Fredericton"})

(def Freetown
  {:cmns-col/isPartOf :lcc-3166-1/SierraLeone,
   :db/ident :fibo-fbc-fct-bci/Freetown,
   :dcterms/description "the international business center of Freetown",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Freetown"})

(def Fukuoka
  {:cmns-col/isPartOf :lcc-3166-1/Japan,
   :db/ident :fibo-fbc-fct-bci/Fukuoka,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Fukuoka"})

(def GBED
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Edinburgh,
   :db/ident :fibo-fbc-fct-bci/GBED,
   :dcterms/description "the FpML business center code for Edinburgh, Scotland",
   :fibo-fnd-rel-rel/hasTag "GBED",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "GBED"})

(def GBLO
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/London,
   :db/ident :fibo-fbc-fct-bci/GBLO,
   :dcterms/description
   "the FpML business center code for London, United Kingdom",
   :fibo-fnd-rel-rel/hasTag "GBLO",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "GBLO"})

(def GETB
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Tbilisi,
   :db/ident :fibo-fbc-fct-bci/GETB,
   :dcterms/description "the FpML business center code for Tbilisi, Georgia",
   :fibo-fnd-rel-rel/hasTag "GETB",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "GETB"})

(def GGSP
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Saint_Peter_Port,
   :db/ident :fibo-fbc-fct-bci/GGSP,
   :dcterms/description
   "the FpML business center code for Saint Peter Port, Guernsey",
   :fibo-fnd-rel-rel/hasTag "GGSP",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "GGSP"})

(def GHAC
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Accra,
   :db/ident :fibo-fbc-fct-bci/GHAC,
   :dcterms/description "the FpML business center code for Accra, Ghana",
   :fibo-fnd-rel-rel/hasTag "GHAC",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "GHAC"})

(def GMBA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Banjul,
   :db/ident :fibo-fbc-fct-bci/GMBA,
   :dcterms/description "the FpML business center code for Banjul, Gambia",
   :fibo-fnd-rel-rel/hasTag "GMBA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "GMBA"})

(def GNCO
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Conakry,
   :db/ident :fibo-fbc-fct-bci/GNCO,
   :dcterms/description "the FpML business center code for Conakry, Guinea",
   :fibo-fnd-rel-rel/hasTag "GNCO",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "GNCO"})

(def GRAT
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Athens,
   :db/ident :fibo-fbc-fct-bci/GRAT,
   :dcterms/description "the FpML business center code for Athens, Greece",
   :fibo-fnd-rel-rel/hasTag "GRAT",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "GRAT"})

(def GUGC
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Guatemala_City,
   :db/ident :fibo-fbc-fct-bci/GUGC,
   :dcterms/description
   "the FpML business center code for Guatemala City, Guatemala",
   :fibo-fnd-rel-rel/hasTag "GUGC",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "GUGC"})

(def Gaborone
  {:cmns-col/isPartOf :lcc-3166-1/Botswana,
   :db/ident :fibo-fbc-fct-bci/Gaborone,
   :dcterms/description "the international business center of Gaborone",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Gaborone"})

(def Gandhinagar
  {:cmns-col/isPartOf :lcc-3166-1/India,
   :db/ident :fibo-fbc-fct-bci/Gandhinagar,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Gandhinagar"})

(def Geneva
  {:cmns-col/isPartOf :lcc-3166-1/Switzerland,
   :db/ident :fibo-fbc-fct-bci/Geneva,
   :dcterms/description "the international business center of Geneva",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Geneva"})

(def Genova
  {:cmns-col/isPartOf :lcc-3166-1/Italy,
   :db/ident :fibo-fbc-fct-bci/Genova,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Genova"})

(def George_Town
  {:cmns-col/isPartOf :lcc-3166-1/CaymanIslands,
   :db/ident :fibo-fbc-fct-bci/George_Town,
   :dcterms/description "the international business center of George Town",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "George Town"})

(def Georgetown
  {:cmns-col/isPartOf :lcc-3166-1/Guyana,
   :db/ident :fibo-fbc-fct-bci/Georgetown,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Georgetown"})

(def Gibraltar
  {:cmns-col/isPartOf :lcc-3166-1/Gibraltar,
   :db/ident :fibo-fbc-fct-bci/Gibraltar,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Gibraltar"})

(def Gift_City
  {:cmns-col/isPartOf :lcc-3166-1/India,
   :db/ident :fibo-fbc-fct-bci/Gift_City,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Gift City"})

(def Glenview
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Glenview,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Glenview"})

(def Great_Neck
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Great_Neck,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Great Neck"})

(def Greenwich
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Greenwich,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Greenwich"})

(def Grindsted
  {:cmns-col/isPartOf :lcc-3166-1/Denmark,
   :db/ident :fibo-fbc-fct-bci/Grindsted,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Grindsted"})

(def Guatemala_City
  {:cmns-col/isPartOf :lcc-3166-1/Guatemala,
   :db/ident :fibo-fbc-fct-bci/Guatemala_City,
   :dcterms/description "the international business center of Guatemala City",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Guatemala City"})

(def Guayaquil
  {:cmns-col/isPartOf :lcc-3166-1/Ecuador,
   :db/ident :fibo-fbc-fct-bci/Guayaquil,
   :dcterms/description "the international business center of Guayaquil",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Guayaquil"})

(def Guaynabo
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Guaynabo,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Guaynabo"})

(def Guildford
  {:cmns-col/isPartOf :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :db/ident :fibo-fbc-fct-bci/Guildford,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Guildford"})

(def HKHK
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Hong_Kong,
   :db/ident :fibo-fbc-fct-bci/HKHK,
   :dcterms/description
   "the FpML business center code for Hong Kong, Hong Kong",
   :fibo-fnd-rel-rel/hasTag "HKHK",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "HKHK"})

(def HNTE
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Tegucigalpa,
   :db/ident :fibo-fbc-fct-bci/HNTE,
   :dcterms/description
   "the FpML business center code for Tegucigalpa, Honduras",
   :fibo-fnd-rel-rel/hasTag "HNTE",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "HNTE"})

(def HRZA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Zagreb,
   :db/ident :fibo-fbc-fct-bci/HRZA,
   :dcterms/description
   "the FpML business center code for Zagreb, Republic of Croatia",
   :fibo-fnd-rel-rel/hasTag "HRZA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "HRZA"})

(def HUBU
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Budapest,
   :db/ident :fibo-fbc-fct-bci/HUBU,
   :dcterms/description "the FpML business center code for Budapest, Hungary",
   :fibo-fnd-rel-rel/hasTag "HUBU",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "HUBU"})

(def Hamburg
  {:cmns-col/isPartOf :lcc-3166-1/Germany,
   :db/ident :fibo-fbc-fct-bci/Hamburg,
   :dcterms/description "the international business center of Hamburg",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Hamburg"})

(def Hamilton
  {:cmns-col/isPartOf :lcc-3166-1/Bermuda,
   :db/ident :fibo-fbc-fct-bci/Hamilton,
   :dcterms/description "the international business center of Hamilton",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Hamilton"})

(def Hannover
  {:cmns-col/isPartOf :lcc-3166-1/Germany,
   :db/ident :fibo-fbc-fct-bci/Hannover,
   :dcterms/description "the international business center of Hannover",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Hannover"})

(def Hanoi
  {:cmns-col/isPartOf :lcc-3166-1/VietNam,
   :db/ident :fibo-fbc-fct-bci/Hanoi,
   :dcterms/description "the international business center of Hanoi",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Hanoi"})

(def Harare
  {:cmns-col/isPartOf :lcc-3166-1/Zimbabwe,
   :db/ident :fibo-fbc-fct-bci/Harare,
   :dcterms/description "the international business center of Harare",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Harare"})

(def Helsinki
  {:cmns-col/isPartOf :lcc-3166-1/Finland,
   :db/ident :fibo-fbc-fct-bci/Helsinki,
   :dcterms/description "the international business center of Helsinki",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Helsinki"})

(def Hiroshima
  {:cmns-col/isPartOf :lcc-3166-1/Japan,
   :db/ident :fibo-fbc-fct-bci/Hiroshima,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Hiroshima"})

(def Ho_Chi_Minh_City
  {:cmns-col/isPartOf :lcc-3166-1/VietNam,
   :db/ident :fibo-fbc-fct-bci/Ho_Chi_Minh_City,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Ho Chi Minh City"})

(def Ho_Chi_Minh__formerly_Saigon_
  {:cmns-col/isPartOf :lcc-3166-1/VietNam,
   :db/ident :fibo-fbc-fct-bci/Ho_Chi_Minh__formerly_Saigon_,
   :dcterms/description
   "the international business center of Ho Chi Minh (formerly Saigon)",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Ho Chi Minh (formerly Saigon)"})

(def Hong_Kong
  {:cmns-col/isPartOf :lcc-3166-1/HongKong,
   :db/ident :fibo-fbc-fct-bci/Hong_Kong,
   :dcterms/description "the international business center of Hong Kong",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Hong Kong"})

(def Honolulu
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Honolulu,
   :dcterms/description "the international business center of Honolulu",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Honolulu"})

(def Horsens
  {:cmns-col/isPartOf :lcc-3166-1/Denmark,
   :db/ident :fibo-fbc-fct-bci/Horsens,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Horsens"})

(def Houston
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Houston,
   :dcterms/description "the international business center of Houston",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Houston"})

(def Hove
  {:cmns-col/isPartOf :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :db/ident :fibo-fbc-fct-bci/Hove,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Hove"})

(def Hyderabad
  {:cmns-col/isPartOf :lcc-3166-1/India,
   :db/ident :fibo-fbc-fct-bci/Hyderabad,
   :dcterms/description "the international business center of Hyderabad",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Hyderabad"})

(def IDJA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Jakarta,
   :db/ident :fibo-fbc-fct-bci/IDJA,
   :dcterms/description "the FpML business center code for Jakarta, Indonesia",
   :fibo-fnd-rel-rel/hasTag "IDJA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "IDJA"})

(def IEDU
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Dublin,
   :db/ident :fibo-fbc-fct-bci/IEDU,
   :dcterms/description "the FpML business center code for Dublin, Ireland",
   :fibo-fnd-rel-rel/hasTag "IEDU",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "IEDU"})

(def ILJE
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Jerusalem,
   :db/ident :fibo-fbc-fct-bci/ILJE,
   :dcterms/description "the FpML business center code for Jerusalem, Israel",
   :fibo-fnd-rel-rel/hasTag "ILJE",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "ILJE"})

(def ILTA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Tel_Aviv,
   :db/ident :fibo-fbc-fct-bci/ILTA,
   :dcterms/description "the FpML business center code for Tel Aviv, Israel",
   :fibo-fnd-rel-rel/hasTag "ILTA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "ILTA"})

(def INAH
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Ahmedabad,
   :db/ident :fibo-fbc-fct-bci/INAH,
   :dcterms/description "the FpML business center code for Ahmedabad, India",
   :fibo-fnd-rel-rel/hasTag "INAH",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "INAH"})

(def INBA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Bangalore,
   :db/ident :fibo-fbc-fct-bci/INBA,
   :dcterms/description "the FpML business center code for Bangalore, India",
   :fibo-fnd-rel-rel/hasTag "INBA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "INBA"})

(def INCH
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Chennai,
   :db/ident :fibo-fbc-fct-bci/INCH,
   :dcterms/description "the FpML business center code for Chennai, India",
   :fibo-fnd-rel-rel/hasTag "INCH",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "INCH"})

(def INHY
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Hyderabad,
   :db/ident :fibo-fbc-fct-bci/INHY,
   :dcterms/description "the FpML business center code for Hyderabad, India",
   :fibo-fnd-rel-rel/hasTag "INHY",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "INHY"})

(def INKO
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Kolkata,
   :db/ident :fibo-fbc-fct-bci/INKO,
   :dcterms/description "the FpML business center code for Kolkata, India",
   :fibo-fnd-rel-rel/hasTag "INKO",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "INKO"})

(def INMU
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Mumbai,
   :db/ident :fibo-fbc-fct-bci/INMU,
   :dcterms/description "the FpML business center code for Mumbai, India",
   :fibo-fnd-rel-rel/hasTag "INMU",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "INMU"})

(def INND
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/New_Delhi,
   :db/ident :fibo-fbc-fct-bci/INND,
   :dcterms/description "the FpML business center code for New Delhi, India",
   :fibo-fnd-rel-rel/hasTag "INND",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "INND"})

(def IQBA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Baghdad,
   :db/ident :fibo-fbc-fct-bci/IQBA,
   :dcterms/description "the FpML business center code for Baghdad, Iraq",
   :fibo-fnd-rel-rel/hasTag "IQBA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "IQBA"})

(def IRTE
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Teheran,
   :db/ident :fibo-fbc-fct-bci/IRTE,
   :dcterms/description "the FpML business center code for Teheran, Iran",
   :fibo-fnd-rel-rel/hasTag "IRTE",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "IRTE"})

(def ISRE
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Reykjavik,
   :db/ident :fibo-fbc-fct-bci/ISRE,
   :dcterms/description "the FpML business center code for Reykjavik, Iceland",
   :fibo-fnd-rel-rel/hasTag "ISRE",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "ISRE"})

(def ITMI
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Milan,
   :db/ident :fibo-fbc-fct-bci/ITMI,
   :dcterms/description "the FpML business center code for Milan, Italy",
   :fibo-fnd-rel-rel/hasTag "ITMI",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "ITMI"})

(def ITRO
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Rome,
   :db/ident :fibo-fbc-fct-bci/ITRO,
   :dcterms/description "the FpML business center code for Rome, Italy",
   :fibo-fnd-rel-rel/hasTag "ITRO",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "ITRO"})

(def ITTU
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Turin,
   :db/ident :fibo-fbc-fct-bci/ITTU,
   :dcterms/description "the FpML business center code for Turin, Italy",
   :fibo-fnd-rel-rel/hasTag "ITTU",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "ITTU"})

(def Indore_Madhya_Pradesh
  {:cmns-col/isPartOf :lcc-3166-1/India,
   :db/ident :fibo-fbc-fct-bci/Indore_Madhya_Pradesh,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Indore Madhya Pradesh"})

(def Islamabad
  {:cmns-col/isPartOf :lcc-3166-1/Pakistan,
   :db/ident :fibo-fbc-fct-bci/Islamabad,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Islamabad"})

(def Istanbul
  {:cmns-col/isPartOf :lcc-3166-1/Turkey,
   :db/ident :fibo-fbc-fct-bci/Istanbul,
   :dcterms/description "the international business center of Istanbul",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Istanbul"})

(def Izmir
  {:cmns-col/isPartOf :lcc-3166-1/Turkey,
   :db/ident :fibo-fbc-fct-bci/Izmir,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Izmir"})

(def JESH
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/St._Helier,
   :db/ident :fibo-fbc-fct-bci/JESH,
   :dcterms/description
   "the FpML business center code for St. Helier, Channel Islands, Jersey",
   :fibo-fnd-rel-rel/hasTag "JESH",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "JESH"})

(def JMKI
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Kingston,
   :db/ident :fibo-fbc-fct-bci/JMKI,
   :dcterms/description "the FpML business center code for Kingston, Jamaica",
   :fibo-fnd-rel-rel/hasTag "JMKI",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "JMKI"})

(def JOAM
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Amman,
   :db/ident :fibo-fbc-fct-bci/JOAM,
   :dcterms/description "the FpML business center code for Amman, Jordan",
   :fibo-fnd-rel-rel/hasTag "JOAM",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "JOAM"})

(def JPTO
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Tokyo,
   :db/ident :fibo-fbc-fct-bci/JPTO,
   :dcterms/description "the FpML business center code for Tokyo, Japan",
   :fibo-fnd-rel-rel/hasTag "JPTO",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "JPTO"})

(def Jaen
  {:cmns-col/isPartOf :lcc-3166-1/Spain,
   :db/ident :fibo-fbc-fct-bci/Jaen,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Jaen"})

(def Jakarta
  {:cmns-col/isPartOf :lcc-3166-1/Indonesia,
   :db/ident :fibo-fbc-fct-bci/Jakarta,
   :dcterms/description "the international business center of Jakarta",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Jakarta"})

(def Jeddah
  {:cmns-col/isPartOf :lcc-3166-1/SaudiArabia,
   :db/ident :fibo-fbc-fct-bci/Jeddah,
   :dcterms/description "the international business center of Jeddah",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Jeddah"})

(def Jersey_City
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Jersey_City,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Jersey City"})

(def Jerusalem
  {:cmns-col/isPartOf :lcc-3166-1/Israel,
   :db/ident :fibo-fbc-fct-bci/Jerusalem,
   :dcterms/description "the international business center of Jerusalem",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Jerusalem"})

(def Johannesburg
  {:cmns-col/isPartOf :lcc-3166-1/SouthAfrica,
   :db/ident :fibo-fbc-fct-bci/Johannesburg,
   :dcterms/description "the international business center of Johannesburg",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Johannesburg"})

(def KENA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Nairobi,
   :db/ident :fibo-fbc-fct-bci/KENA,
   :dcterms/description "the FpML business center code for Nairobi, Kenya",
   :fibo-fnd-rel-rel/hasTag "KENA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "KENA"})

(def KHPP
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Phnom_Penh,
   :db/ident :fibo-fbc-fct-bci/KHPP,
   :dcterms/description
   "the FpML business center code for Phnom Penh, Cambodia",
   :fibo-fnd-rel-rel/hasTag "KHPP",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "KHPP"})

(def KRSE
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Seoul,
   :db/ident :fibo-fbc-fct-bci/KRSE,
   :dcterms/description
   "the FpML business center code for Seoul, Republic of Korea",
   :fibo-fnd-rel-rel/hasTag "KRSE",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "KRSE"})

(def KWKC
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Kuwait_City,
   :db/ident :fibo-fbc-fct-bci/KWKC,
   :dcterms/description "the FpML business center code for Kuwait City, Kuwait",
   :fibo-fnd-rel-rel/hasTag "KWKC",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "KWKC"})

(def KYGE
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/George_Town,
   :db/ident :fibo-fbc-fct-bci/KYGE,
   :dcterms/description
   "the FpML business center code for George Town, Cayman Islands",
   :fibo-fnd-rel-rel/hasTag "KYGE",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "KYGE"})

(def KZAL
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Almaty,
   :db/ident :fibo-fbc-fct-bci/KZAL,
   :dcterms/description "the FpML business center code for Almaty, Kazakhstan",
   :fibo-fnd-rel-rel/hasTag "KZAL",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "KZAL"})

(def Kampala
  {:cmns-col/isPartOf :lcc-3166-1/Uganda,
   :db/ident :fibo-fbc-fct-bci/Kampala,
   :dcterms/description "the international business center of Kampala",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Kampala"})

(def Kansas_City
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Kansas_City,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Kansas City"})

(def Karachi
  {:cmns-col/isPartOf :lcc-3166-1/Pakistan,
   :db/ident :fibo-fbc-fct-bci/Karachi,
   :dcterms/description "the international business center of Karachi",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Karachi"})

(def Kathmandu
  {:cmns-col/isPartOf :lcc-3166-1/Nepal,
   :db/ident :fibo-fbc-fct-bci/Kathmandu,
   :dcterms/description "the international business center of Kathmandu",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Kathmandu"})

(def Kharkov
  {:cmns-col/isPartOf :lcc-3166-1/Ukraine,
   :db/ident :fibo-fbc-fct-bci/Kharkov,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Kharkov"})

(def Khartoum
  {:cmns-col/isPartOf :lcc-3166-1/Sudan,
   :db/ident :fibo-fbc-fct-bci/Khartoum,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Khartoum"})

(def Kiel
  {:cmns-col/isPartOf :lcc-3166-1/Germany,
   :db/ident :fibo-fbc-fct-bci/Kiel,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Kiel"})

(def Kiev
  {:cmns-col/isPartOf :lcc-3166-1/Ukraine,
   :db/ident :fibo-fbc-fct-bci/Kiev,
   :dcterms/description "the international business center of Kiev",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Kiev"})

(def Kigali
  {:cmns-col/isPartOf :lcc-3166-1/Rwanda,
   :db/ident :fibo-fbc-fct-bci/Kigali,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Kigali"})

(def Kingston
  {:cmns-col/isPartOf :lcc-3166-1/Jamaica,
   :db/ident :fibo-fbc-fct-bci/Kingston,
   :dcterms/description "the international business center of Kingston",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Kingston"})

(def Kingstown
  {:cmns-col/isPartOf :lcc-3166-1/SaintVincentAndTheGrenadines,
   :db/ident :fibo-fbc-fct-bci/Kingstown,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Kingstown"})

(def Klagenfurt_Am_Woerthersee
  {:cmns-col/isPartOf :lcc-3166-1/Austria,
   :db/ident :fibo-fbc-fct-bci/Klagenfurt_Am_Woerthersee,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Klagenfurt Am Woerthersee"})

(def Kobe
  {:cmns-col/isPartOf :lcc-3166-1/Japan,
   :db/ident :fibo-fbc-fct-bci/Kobe,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Kobe"})

(def Kolkata
  {:cmns-col/isPartOf :lcc-3166-1/India,
   :db/ident :fibo-fbc-fct-bci/Kolkata,
   :dcterms/description "the international business center of Kolkata",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Kolkata"})

(def Kongsvinger
  {:cmns-col/isPartOf :lcc-3166-1/Norway,
   :db/ident :fibo-fbc-fct-bci/Kongsvinger,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Kongsvinger"})

(def Krakow
  {:cmns-col/isPartOf :lcc-3166-1/Poland,
   :db/ident :fibo-fbc-fct-bci/Krakow,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Krakow"})

(def Kuala_Lumpur
  {:cmns-col/isPartOf :lcc-3166-1/Malaysia,
   :db/ident :fibo-fbc-fct-bci/Kuala_Lumpur,
   :dcterms/description "the international business center of Kuala Lumpur",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Kuala Lumpur"})

(def Kuwait_City
  {:cmns-col/isPartOf :lcc-3166-1/Kuwait,
   :db/ident :fibo-fbc-fct-bci/Kuwait_City,
   :dcterms/description "the international business center of Kuwait City",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Kuwait City"})

(def Kyoto
  {:cmns-col/isPartOf :lcc-3166-1/Japan,
   :db/ident :fibo-fbc-fct-bci/Kyoto,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Kyoto"})

(def LAVI
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Vientiane,
   :db/ident :fibo-fbc-fct-bci/LAVI,
   :dcterms/description "the FpML business center code for Vientiane, Laos",
   :fibo-fnd-rel-rel/hasTag "LAVI",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "LAVI"})

(def LBBE
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Beirut,
   :db/ident :fibo-fbc-fct-bci/LBBE,
   :dcterms/description "the FpML business center code for Beirut, Lebanon",
   :fibo-fnd-rel-rel/hasTag "LBBE",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "LBBE"})

(def LKCO
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Colombo,
   :db/ident :fibo-fbc-fct-bci/LKCO,
   :dcterms/description "the FpML business center code for Colombo, Sri Lanka",
   :fibo-fnd-rel-rel/hasTag "LKCO",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "LKCO"})

(def LULU
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Luxembourg,
   :db/ident :fibo-fbc-fct-bci/LULU,
   :dcterms/description
   "the FpML business center code for Luxembourg, Luxembourg",
   :fibo-fnd-rel-rel/hasTag "LULU",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "LULU"})

(def LVRI
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Riga,
   :db/ident :fibo-fbc-fct-bci/LVRI,
   :dcterms/description "the FpML business center code for Riga, Latvia",
   :fibo-fnd-rel-rel/hasTag "LVRI",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "LVRI"})

(def La_Paz
  {:cmns-col/isPartOf :lcc-3166-1/Bolivia,
   :db/ident :fibo-fbc-fct-bci/La_Paz,
   :dcterms/description "the international business center of La Paz",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "La Paz"})

(def Labuan
  {:cmns-col/isPartOf :lcc-3166-1/Malaysia,
   :db/ident :fibo-fbc-fct-bci/Labuan,
   :dcterms/description "the international business center of Labuan",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Labuan"})

(def Lagos
  {:cmns-col/isPartOf :lcc-3166-1/Nigeria,
   :db/ident :fibo-fbc-fct-bci/Lagos,
   :dcterms/description "the international business center of Lagos",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Lagos"})

(def Lahore
  {:cmns-col/isPartOf :lcc-3166-1/Pakistan,
   :db/ident :fibo-fbc-fct-bci/Lahore,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Lahore"})

(def Lane_Cove
  {:cmns-col/isPartOf :lcc-3166-1/Australia,
   :db/ident :fibo-fbc-fct-bci/Lane_Cove,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Lane Cove"})

(def Lao
  {:cmns-col/isPartOf :lcc-3166-1/LaoPeoplesDemocraticRepublic,
   :db/ident :fibo-fbc-fct-bci/Lao,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Lao"})

(def Larnaca
  {:cmns-col/isPartOf :lcc-3166-1/Cyprus,
   :db/ident :fibo-fbc-fct-bci/Larnaca,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Larnaca"})

(def Leipzig
  {:cmns-col/isPartOf :lcc-3166-1/Germany,
   :db/ident :fibo-fbc-fct-bci/Leipzig,
   :dcterms/description "the international business center of Leipzig",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Leipzig"})

(def Lenexa
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Lenexa,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Lenexa"})

(def Leuven
  {:cmns-col/isPartOf :lcc-3166-1/Belgium,
   :db/ident :fibo-fbc-fct-bci/Leuven,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Leuven"})

(def Lilongwe
  {:cmns-col/isPartOf :lcc-3166-1/Malawi,
   :db/ident :fibo-fbc-fct-bci/Lilongwe,
   :dcterms/description "the international business center of Lilongwe",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Lilongwe"})

(def Lima
  {:cmns-col/isPartOf :lcc-3166-1/Peru,
   :db/ident :fibo-fbc-fct-bci/Lima,
   :dcterms/description "the international business center of Lima",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Lima"})

(def Limassol
  {:cmns-col/isPartOf :lcc-3166-1/Cyprus,
   :db/ident :fibo-fbc-fct-bci/Limassol,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Limassol"})

(def Linz
  {:cmns-col/isPartOf :lcc-3166-1/Austria,
   :db/ident :fibo-fbc-fct-bci/Linz,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Linz"})

(def Lisbon
  {:cmns-col/isPartOf :lcc-3166-1/Portugal,
   :db/ident :fibo-fbc-fct-bci/Lisbon,
   :dcterms/description "the international business center of Lisbon",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Lisbon"})

(def Ljubljana
  {:cmns-col/isPartOf :lcc-3166-1/Slovenia,
   :db/ident :fibo-fbc-fct-bci/Ljubljana,
   :dcterms/description "the international business center of Ljubljana",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Ljubljana"})

(def London
  {:cmns-col/isPartOf :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :db/ident :fibo-fbc-fct-bci/London,
   :dcterms/description "the international business center of London",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "London"})

(def Los_Angeles
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Los_Angeles,
   :dcterms/description "the international business center of Los Angeles",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Los Angeles"})

(def Luanda
  {:cmns-col/isPartOf :lcc-3166-1/Angola,
   :db/ident :fibo-fbc-fct-bci/Luanda,
   :dcterms/description "the international business center of Luanda",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Luanda"})

(def Lusaka
  {:cmns-col/isPartOf :lcc-3166-1/Zambia,
   :db/ident :fibo-fbc-fct-bci/Lusaka,
   :dcterms/description "the international business center of Lusaka",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Lusaka"})

(def Luxembourg
  {:cmns-col/isPartOf :lcc-3166-1/Luxembourg,
   :db/ident :fibo-fbc-fct-bci/Luxembourg,
   :dcterms/description "the international business center of Luxembourg",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Luxembourg"})

(def Luzern
  {:cmns-col/isPartOf :lcc-3166-1/Switzerland,
   :db/ident :fibo-fbc-fct-bci/Luzern,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Luzern"})

(def MACA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Casablanca,
   :db/ident :fibo-fbc-fct-bci/MACA,
   :dcterms/description "the FpML business center code for Casablanca, Morocco",
   :fibo-fnd-rel-rel/hasTag "MACA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "MACA"})

(def MARA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Rabat,
   :db/ident :fibo-fbc-fct-bci/MARA,
   :dcterms/description "the FpML business center code for Rabat, Morocco",
   :fibo-fnd-rel-rel/hasTag "MARA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "MARA"})

(def MCMO
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Monaco,
   :db/ident :fibo-fbc-fct-bci/MCMO,
   :dcterms/description "the FpML business center code for Monaco, Monaco",
   :fibo-fnd-rel-rel/hasTag "MCMO",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "MCMO"})

(def MNUB
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Ulan_Bator,
   :db/ident :fibo-fbc-fct-bci/MNUB,
   :dcterms/description
   "the FpML business center code for Ulan Bator, Mongolia",
   :fibo-fnd-rel-rel/hasTag "MNUB",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "MNUB"})

(def MOMA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Macau,
   :db/ident :fibo-fbc-fct-bci/MOMA,
   :dcterms/description "the FpML business center code for Macau, Macao",
   :fibo-fnd-rel-rel/hasTag "MOMA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "MOMA"})

(def MTVA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Valletta,
   :db/ident :fibo-fbc-fct-bci/MTVA,
   :dcterms/description "the FpML business center code for Valletta, Malta",
   :fibo-fnd-rel-rel/hasTag "MTVA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "MTVA"})

(def MUPL
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Port_Louis,
   :db/ident :fibo-fbc-fct-bci/MUPL,
   :dcterms/description
   "the FpML business center code for Port Louis, Mauritius",
   :fibo-fnd-rel-rel/hasTag "MUPL",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "MUPL"})

(def MVMA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Male,
   :db/ident :fibo-fbc-fct-bci/MVMA,
   :dcterms/description "the FpML business center code for Male, Maldives",
   :fibo-fnd-rel-rel/hasTag "MVMA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "MVMA"})

(def MWLI
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Lilongwe,
   :db/ident :fibo-fbc-fct-bci/MWLI,
   :dcterms/description "the FpML business center code for Lilongwe, Malawi",
   :fibo-fnd-rel-rel/hasTag "MWLI",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "MWLI"})

(def MXMC
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Mexico_City,
   :db/ident :fibo-fbc-fct-bci/MXMC,
   :dcterms/description "the FpML business center code for Mexico City, Mexico",
   :fibo-fnd-rel-rel/hasTag "MXMC",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "MXMC"})

(def MYKL
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Kuala_Lumpur,
   :db/ident :fibo-fbc-fct-bci/MYKL,
   :dcterms/description
   "the FpML business center code for Kuala Lumpur, Malaysia",
   :fibo-fnd-rel-rel/hasTag "MYKL",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "MYKL"})

(def MYLA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Labuan,
   :db/ident :fibo-fbc-fct-bci/MYLA,
   :dcterms/description "the FpML business center code for Labuan, Malaysia",
   :fibo-fnd-rel-rel/hasTag "MYLA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "MYLA"})

(def MZMA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Maputo,
   :db/ident :fibo-fbc-fct-bci/MZMA,
   :dcterms/description "the FpML business center code for Maputo, Mozambique",
   :fibo-fnd-rel-rel/hasTag "MZMA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "MZMA"})

(def Macau
  {:cmns-col/isPartOf :lcc-3166-1/Macao,
   :db/ident :fibo-fbc-fct-bci/Macau,
   :dcterms/description "the international business center of Macau",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Macau"})

(def Madras
  {:cmns-col/isPartOf :lcc-3166-1/India,
   :db/ident :fibo-fbc-fct-bci/Madras,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Madras"})

(def Madrid
  {:cmns-col/isPartOf :lcc-3166-1/Spain,
   :db/ident :fibo-fbc-fct-bci/Madrid,
   :dcterms/description "the international business center of Madrid",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Madrid"})

(def Mainz
  {:cmns-col/isPartOf :lcc-3166-1/Germany,
   :db/ident :fibo-fbc-fct-bci/Mainz,
   :dcterms/description "the international business center of Mainz",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Mainz"})

(def Makati
  {:cmns-col/isPartOf :lcc-3166-1/Philippines,
   :db/ident :fibo-fbc-fct-bci/Makati,
   :dcterms/description "the international business center of Makati",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Makati"})

(def Makati_City
  {:cmns-col/isPartOf :lcc-3166-1/Philippines,
   :db/ident :fibo-fbc-fct-bci/Makati_City,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Makati City"})

(def Male
  {:cmns-col/isPartOf :lcc-3166-1/Maldives,
   :db/ident :fibo-fbc-fct-bci/Male,
   :dcterms/description "the international business center of Male",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Male"})

(def Managua
  {:cmns-col/isPartOf :lcc-3166-1/Nicaragua,
   :db/ident :fibo-fbc-fct-bci/Managua,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Managua"})

(def Manama
  {:cmns-col/isPartOf :lcc-3166-1/Bahrain,
   :db/ident :fibo-fbc-fct-bci/Manama,
   :dcterms/description "the international business center of Manama",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Manama"})

(def Manila
  {:cmns-col/isPartOf :lcc-3166-1/Philippines,
   :db/ident :fibo-fbc-fct-bci/Manila,
   :dcterms/description "the international business center of Manila",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Manila"})

(def Maputo
  {:cmns-col/isPartOf :lcc-3166-1/Mozambique,
   :db/ident :fibo-fbc-fct-bci/Maputo,
   :dcterms/description "the international business center of Maputo",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Maputo"})

(def Maringa
  {:cmns-col/isPartOf :lcc-3166-1/Brazil,
   :db/ident :fibo-fbc-fct-bci/Maringa,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Maringa"})

(def Mbabane
  {:cmns-col/isPartOf :lcc-3166-1/Eswatini,
   :db/ident :fibo-fbc-fct-bci/Mbabane,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Mbabane"})

(def Melbourne
  {:cmns-col/isPartOf :lcc-3166-1/Australia,
   :db/ident :fibo-fbc-fct-bci/Melbourne,
   :dcterms/description "the international business center of Melbourne",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Melbourne"})

(def Mendoza
  {:cmns-col/isPartOf :lcc-3166-1/Argentina,
   :db/ident :fibo-fbc-fct-bci/Mendoza,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Mendoza"})

(def Mexico_City
  {:cmns-col/isPartOf :lcc-3166-1/Mexico,
   :db/ident :fibo-fbc-fct-bci/Mexico_City,
   :dcterms/description "the international business center of Mexico City",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Mexico City"})

(def Miami
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Miami,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Miami"})

(def Milan
  {:cmns-col/isPartOf :lcc-3166-1/Italy,
   :db/ident :fibo-fbc-fct-bci/Milan,
   :dcterms/description "the international business center of Milan",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Milan"})

(def Minneapolis
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Minneapolis,
   :dcterms/description "the international business center of Minneapolis",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Minneapolis"})

(def Minsk
  {:cmns-col/isPartOf :lcc-3166-1/Belarus,
   :db/ident :fibo-fbc-fct-bci/Minsk,
   :dcterms/description "the international business center of Minsk",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Minsk"})

(def Mobile
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Mobile,
   :dcterms/description "the international business center of Mobile",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Mobile"})

(def Monaco
  {:cmns-col/isPartOf :lcc-3166-1/Monaco,
   :db/ident :fibo-fbc-fct-bci/Monaco,
   :dcterms/description "the international business center of Monaco",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Monaco"})

(def Montenegro
  {:cmns-col/isPartOf :lcc-3166-1/Montenegro,
   :db/ident :fibo-fbc-fct-bci/Montenegro,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Montenegro"})

(def Montevideo
  {:cmns-col/isPartOf :lcc-3166-1/Uruguay,
   :db/ident :fibo-fbc-fct-bci/Montevideo,
   :dcterms/description "the international business center of Montevideo",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Montevideo"})

(def Montreal
  {:cmns-col/isPartOf :lcc-3166-1/Canada,
   :db/ident :fibo-fbc-fct-bci/Montreal,
   :dcterms/description "the international business center of Montreal",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Montreal"})

(def Moorpark
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Moorpark,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Moorpark"})

(def Moscow
  {:cmns-col/isPartOf :lcc-3166-1/RussianFederation,
   :db/ident :fibo-fbc-fct-bci/Moscow,
   :dcterms/description "the international business center of Moscow",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Moscow"})

(def Mount_Pleasant
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Mount_Pleasant,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Mount Pleasant"})

(def Mumbai
  {:cmns-col/isPartOf :lcc-3166-1/India,
   :db/ident :fibo-fbc-fct-bci/Mumbai,
   :dcterms/description "the international business center of Mumbai",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Mumbai"})

(def Munich
  {:cmns-col/isPartOf :lcc-3166-1/Germany,
   :db/ident :fibo-fbc-fct-bci/Munich,
   :dcterms/description "the international business center of Munich",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Munich"})

(def Muscat
  {:cmns-col/isPartOf :lcc-3166-1/Oman,
   :db/ident :fibo-fbc-fct-bci/Muscat,
   :dcterms/description "the international business center of Muscat",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Muscat"})

(def NAWI
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Windhoek,
   :db/ident :fibo-fbc-fct-bci/NAWI,
   :dcterms/description "the FpML business center code for Windhoek, Namibia",
   :fibo-fnd-rel-rel/hasTag "NAWI",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "NAWI"})

(def NGAB
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Abuja,
   :db/ident :fibo-fbc-fct-bci/NGAB,
   :dcterms/description "the FpML business center code for Abuja, Nigeria",
   :fibo-fnd-rel-rel/hasTag "NGAB",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "NGAB"})

(def NGLA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Lagos,
   :db/ident :fibo-fbc-fct-bci/NGLA,
   :dcterms/description "the FpML business center code for Lagos, Nigeria",
   :fibo-fnd-rel-rel/hasTag "NGLA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "NGLA"})

(def NLAM
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Amsterdam,
   :db/ident :fibo-fbc-fct-bci/NLAM,
   :dcterms/description
   "the FpML business center code for Amsterdam, Netherlands",
   :fibo-fnd-rel-rel/hasTag "NLAM",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "NLAM"})

(def NLRO
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Rotterdam,
   :db/ident :fibo-fbc-fct-bci/NLRO,
   :dcterms/description
   "the FpML business center code for Rotterdam, Netherlands",
   :fibo-fnd-rel-rel/hasTag "NLRO",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "NLRO"})

(def NOOS
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Oslo,
   :db/ident :fibo-fbc-fct-bci/NOOS,
   :dcterms/description "the FpML business center code for Oslo, Norway",
   :fibo-fnd-rel-rel/hasTag "NOOS",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "NOOS"})

(def NPKA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Kathmandu,
   :db/ident :fibo-fbc-fct-bci/NPKA,
   :dcterms/description "the FpML business center code for Kathmandu, Nepal",
   :fibo-fnd-rel-rel/hasTag "NPKA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "NPKA"})

(def NYFD
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/NewYorkFederalReserveBusinessDay,
   :db/ident :fibo-fbc-fct-bci/NYFD,
   :dcterms/description
   "the FpML business center code for New York Fed Business Day (as defined in 2006 ISDA Definitions Section 1.9 and 2000 ISDA Definitions Section 1.9)",
   :fibo-fnd-rel-rel/hasTag "NYFD",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessDayAdjustmentCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "NYFD"})

(def NYSE
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/NewYorkStockExchangeBusinessDay,
   :db/ident :fibo-fbc-fct-bci/NYSE,
   :dcterms/description
   "the FpML business center code for New York Stock Exchange Business Day (as defined in 2006 ISDA Definitions Section 1.10 and 2000 ISDA Definitions Section 1.10)",
   :fibo-fnd-rel-rel/hasTag "NYSE",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessDayAdjustmentCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "NYSE"})

(def NZAU
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Auckland,
   :db/ident :fibo-fbc-fct-bci/NZAU,
   :dcterms/description
   "the FpML business center code for Auckland, New Zealand",
   :fibo-fnd-rel-rel/hasTag "NZAU",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "NZAU"})

(def NZWE
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Wellington,
   :db/ident :fibo-fbc-fct-bci/NZWE,
   :dcterms/description
   "the FpML business center code for Wellington, New Zealand",
   :fibo-fnd-rel-rel/hasTag "NZWE",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "NZWE"})

(def Nablus
  {:cmns-col/isPartOf :lcc-3166-1/Palestine,
   :db/ident :fibo-fbc-fct-bci/Nablus,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Nablus"})

(def Nacka
  {:cmns-col/isPartOf :lcc-3166-1/Sweden,
   :db/ident :fibo-fbc-fct-bci/Nacka,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Nacka"})

(def Nagoya
  {:cmns-col/isPartOf :lcc-3166-1/Japan,
   :db/ident :fibo-fbc-fct-bci/Nagoya,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Nagoya"})

(def Nairobi
  {:cmns-col/isPartOf :lcc-3166-1/Kenya,
   :db/ident :fibo-fbc-fct-bci/Nairobi,
   :dcterms/description "the international business center of Nairobi",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Nairobi"})

(def Narberth
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Narberth,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Narberth"})

(def Nasau
  {:cmns-col/isPartOf :lcc-3166-1/Bahamas,
   :db/ident :fibo-fbc-fct-bci/Nasau,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Nasau"})

(def Nassau
  {:cmns-col/isPartOf :lcc-3166-1/Bahamas,
   :db/ident :fibo-fbc-fct-bci/Nassau,
   :dcterms/description "the international business center of Nassau",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Nassau"})

(def NewYorkFederalReserveBusinessDay
  {:db/ident :fibo-fbc-fct-bci/NewYorkFederalReserveBusinessDay,
   :dcterms/description
   "the business day adjustment convention for the New York Fed",
   :fibo-fnd-plc-loc/hasBusinessCenter :fibo-fbc-fct-bci/New_York,
   :rdf/type #{:fibo-fnd-dt-bd/BusinessDayAdjustment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "New York Federal Reserve Business Day"})

(def NewYorkStockExchangeBusinessDay
  {:db/ident :fibo-fbc-fct-bci/NewYorkStockExchangeBusinessDay,
   :dcterms/description
   "the business day adjustment convention for the New York Stock Exchange",
   :fibo-fnd-plc-loc/hasBusinessCenter :fibo-fbc-fct-bci/New_York,
   :rdf/type #{:fibo-fnd-dt-bd/BusinessDayAdjustment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "New York Stock Exchange Business Day"})

(def New_Delhi
  {:cmns-col/isPartOf :lcc-3166-1/India,
   :db/ident :fibo-fbc-fct-bci/New_Delhi,
   :dcterms/description "the international business center of New Delhi",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "New Delhi"})

(def New_York
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/New_York,
   :dcterms/description "the international business center of New York",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "New York"})

(def Newcastle
  {:cmns-col/isPartOf :lcc-3166-1/Australia,
   :db/ident :fibo-fbc-fct-bci/Newcastle,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Newcastle"})

(def Nicosia
  {:cmns-col/isPartOf :lcc-3166-1/Cyprus,
   :db/ident :fibo-fbc-fct-bci/Nicosia,
   :dcterms/description "the international business center of Nicosia",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Nicosia"})

(def Nigita
  {:cmns-col/isPartOf :lcc-3166-1/Japan,
   :db/ident :fibo-fbc-fct-bci/Nigita,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Nigita"})

(def Nizhniy_Novgorod
  {:cmns-col/isPartOf :lcc-3166-1/RussianFederation,
   :db/ident :fibo-fbc-fct-bci/Nizhniy_Novgorod,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Nizhniy Novgorod"})

(def North_Bergen
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/North_Bergen,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "North Bergen"})

(def Novosibirsk
  {:cmns-col/isPartOf :lcc-3166-1/RussianFederation,
   :db/ident :fibo-fbc-fct-bci/Novosibirsk,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Novosibirsk"})

(def Nyon
  {:cmns-col/isPartOf :lcc-3166-1/Switzerland,
   :db/ident :fibo-fbc-fct-bci/Nyon,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Nyon"})

(def OMMU
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Muscat,
   :db/ident :fibo-fbc-fct-bci/OMMU,
   :dcterms/description "the FpML business center code for Muscat, Oman",
   :fibo-fnd-rel-rel/hasTag "OMMU",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "OMMU"})

(def Odessa
  {:cmns-col/isPartOf :lcc-3166-1/Ukraine,
   :db/ident :fibo-fbc-fct-bci/Odessa,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Odessa"})

(def Oldenburg
  {:cmns-col/isPartOf :lcc-3166-1/Germany,
   :db/ident :fibo-fbc-fct-bci/Oldenburg,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Oldenburg"})

(def Osaka
  {:cmns-col/isPartOf :lcc-3166-1/Japan,
   :db/ident :fibo-fbc-fct-bci/Osaka,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Osaka"})

(def Oslo
  {:cmns-col/isPartOf :lcc-3166-1/Norway,
   :db/ident :fibo-fbc-fct-bci/Oslo,
   :dcterms/description "the international business center of Oslo",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Oslo"})

(def Oststeinbek
  {:cmns-col/isPartOf :lcc-3166-1/Germany,
   :db/ident :fibo-fbc-fct-bci/Oststeinbek,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Oststeinbek"})

(def Ottawa
  {:cmns-col/isPartOf :lcc-3166-1/Canada,
   :db/ident :fibo-fbc-fct-bci/Ottawa,
   :dcterms/description "the international business center of Ottawa",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Ottawa"})

(def PAPC
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Panama_City,
   :db/ident :fibo-fbc-fct-bci/PAPC,
   :dcterms/description "the FpML business center code for Panama City, Panama",
   :fibo-fnd-rel-rel/hasTag "PAPC",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "PAPC"})

(def PELI
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Lima,
   :db/ident :fibo-fbc-fct-bci/PELI,
   :dcterms/description "the FpML business center code for Lima, Peru",
   :fibo-fnd-rel-rel/hasTag "PELI",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "PELI"})

(def PHMA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Manila,
   :db/ident :fibo-fbc-fct-bci/PHMA,
   :dcterms/description "the FpML business center code for Manila, Philippines",
   :fibo-fnd-rel-rel/hasTag "PHMA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "PHMA"})

(def PHMK
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Makati,
   :db/ident :fibo-fbc-fct-bci/PHMK,
   :dcterms/description "the FpML business center code for Makati, Philippines",
   :fibo-fnd-rel-rel/hasTag "PHMK",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "PHMK"})

(def PKKA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Karachi,
   :db/ident :fibo-fbc-fct-bci/PKKA,
   :dcterms/description "the FpML business center code for Karachi, Pakistan",
   :fibo-fnd-rel-rel/hasTag "PKKA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "PKKA"})

(def PLWA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Warsaw,
   :db/ident :fibo-fbc-fct-bci/PLWA,
   :dcterms/description "the FpML business center code for Warsaw, Poland",
   :fibo-fnd-rel-rel/hasTag "PLWA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "PLWA"})

(def PRSJ
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/San_Juan,
   :db/ident :fibo-fbc-fct-bci/PRSJ,
   :dcterms/description
   "the FpML business center code for San Juan, Puerto Rico",
   :fibo-fnd-rel-rel/hasTag "PRSJ",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "PRSJ"})

(def PTLI
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Lisbon,
   :db/ident :fibo-fbc-fct-bci/PTLI,
   :dcterms/description "the FpML business center code for Lisbon, Portugal",
   :fibo-fnd-rel-rel/hasTag "PTLI",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "PTLI"})

(def Padova
  {:cmns-col/isPartOf :lcc-3166-1/Italy,
   :db/ident :fibo-fbc-fct-bci/Padova,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Padova"})

(def Palma_De_Mallorca
  {:cmns-col/isPartOf :lcc-3166-1/Spain,
   :db/ident :fibo-fbc-fct-bci/Palma_De_Mallorca,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Palma De Mallorca"})

(def Panama_City
  {:cmns-col/isPartOf :lcc-3166-1/Panama,
   :db/ident :fibo-fbc-fct-bci/Panama_City,
   :dcterms/description "the international business center of Panama City",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Panama City"})

(def Paris
  {:cmns-col/isPartOf :lcc-3166-1/France,
   :db/ident :fibo-fbc-fct-bci/Paris,
   :dcterms/description "the international business center of Paris",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Paris"})

(def Pasig_City
  {:cmns-col/isPartOf :lcc-3166-1/Philippines,
   :db/ident :fibo-fbc-fct-bci/Pasig_City,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Pasig City"})

(def Perth
  {:cmns-col/isPartOf :lcc-3166-1/Australia,
   :db/ident :fibo-fbc-fct-bci/Perth,
   :dcterms/description "the international business center of Perth",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Perth"})

(def Philadelphia
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Philadelphia,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Philadelphia"})

(def Phnom_Penh
  {:cmns-col/isPartOf :lcc-3166-1/Cambodia,
   :db/ident :fibo-fbc-fct-bci/Phnom_Penh,
   :dcterms/description "the international business center of Phnom Penh",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Phnom Penh"})

(def Phoenix
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Phoenix,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Phoenix"})

(def Polokwane
  {:cmns-col/isPartOf :lcc-3166-1/SouthAfrica,
   :db/ident :fibo-fbc-fct-bci/Polokwane,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Polokwane"})

(def Port_Louis
  {:cmns-col/isPartOf :lcc-3166-1/Mauritius,
   :db/ident :fibo-fbc-fct-bci/Port_Louis,
   :dcterms/description "the international business center of Port Louis",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Port Louis"})

(def Port_Moresby
  {:cmns-col/isPartOf :lcc-3166-1/PapuaNewGuinea,
   :db/ident :fibo-fbc-fct-bci/Port_Moresby,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Port Moresby"})

(def Port_Vila
  {:cmns-col/isPartOf :lcc-3166-1/Vanuatu,
   :db/ident :fibo-fbc-fct-bci/Port_Vila,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Port Vila"})

(def Port_of_Spain
  {:cmns-col/isPartOf :lcc-3166-1/TrinidadAndTobago,
   :db/ident :fibo-fbc-fct-bci/Port_of_Spain,
   :dcterms/description "the international business center of Port of Spain",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Port of Spain"})

(def Portland
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Portland,
   :dcterms/description "the international business center of Portland",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Portland"})

(def Porto
  {:cmns-col/isPartOf :lcc-3166-1/Portugal,
   :db/ident :fibo-fbc-fct-bci/Porto,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Porto"})

(def Prague
  {:cmns-col/isPartOf :lcc-3166-1/Czechia,
   :db/ident :fibo-fbc-fct-bci/Prague,
   :dcterms/description "the international business center of Prague",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Prague"})

(def Praia
  {:cmns-col/isPartOf :lcc-3166-1/CaboVerde,
   :db/ident :fibo-fbc-fct-bci/Praia,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Praia"})

(def Princeton
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Princeton,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Princeton"})

(def Purchase
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Purchase,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Purchase"})

(def QADO
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Doha,
   :db/ident :fibo-fbc-fct-bci/QADO,
   :dcterms/description "the FpML business center code for Doha, Qatar",
   :fibo-fnd-rel-rel/hasTag "QADO",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "QADO"})

(def Quito
  {:cmns-col/isPartOf :lcc-3166-1/Ecuador,
   :db/ident :fibo-fbc-fct-bci/Quito,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Quito"})

(def ROBU
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Bucharest,
   :db/ident :fibo-fbc-fct-bci/ROBU,
   :dcterms/description "the FpML business center code for Bucharest, Romania",
   :fibo-fnd-rel-rel/hasTag "ROBU",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "ROBU"})

(def RSBE
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Belgrade,
   :db/ident :fibo-fbc-fct-bci/RSBE,
   :dcterms/description "the FpML business center code for Belgrade, Serbia",
   :fibo-fnd-rel-rel/hasTag "RSBE",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "RSBE"})

(def RUMO
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Moscow,
   :db/ident :fibo-fbc-fct-bci/RUMO,
   :dcterms/description
   "the FpML business center code for Moscow, Russian Federation",
   :fibo-fnd-rel-rel/hasTag "RUMO",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "RUMO"})

(def Rabat
  {:cmns-col/isPartOf :lcc-3166-1/Morocco,
   :db/ident :fibo-fbc-fct-bci/Rabat,
   :dcterms/description "the international business center of Rabat",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Rabat"})

(def Randers
  {:cmns-col/isPartOf :lcc-3166-1/Denmark,
   :db/ident :fibo-fbc-fct-bci/Randers,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Randers"})

(def Red_Bank
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Red_Bank,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Red Bank"})

(def Regensburg
  {:cmns-col/isPartOf :lcc-3166-1/Germany,
   :db/ident :fibo-fbc-fct-bci/Regensburg,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Regensburg"})

(def Reggio_Emilia
  {:cmns-col/isPartOf :lcc-3166-1/Italy,
   :db/ident :fibo-fbc-fct-bci/Reggio_Emilia,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Reggio Emilia"})

(def Reykjavik
  {:cmns-col/isPartOf :lcc-3166-1/Iceland,
   :db/ident :fibo-fbc-fct-bci/Reykjavik,
   :dcterms/description "the international business center of Reykjavik",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Reykjavik"})

(def Riga
  {:cmns-col/isPartOf :lcc-3166-1/Latvia,
   :db/ident :fibo-fbc-fct-bci/Riga,
   :dcterms/description "the international business center of Riga",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Riga"})

(def Rio_de_Janeiro
  {:cmns-col/isPartOf :lcc-3166-1/Brazil,
   :db/ident :fibo-fbc-fct-bci/Rio_de_Janeiro,
   :dcterms/description "the international business center of Rio de Janeiro",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Rio de Janeiro"})

(def Riyadh
  {:cmns-col/isPartOf :lcc-3166-1/SaudiArabia,
   :db/ident :fibo-fbc-fct-bci/Riyadh,
   :dcterms/description "the international business center of Riyadh",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Riyadh"})

(def Road_Town
  {:cmns-col/isPartOf :lcc-3166-1/VirginIslandsBritish,
   :db/ident :fibo-fbc-fct-bci/Road_Town,
   :dcterms/description "the international business center of Road Town",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Road Town"})

(def Rodgau
  {:cmns-col/isPartOf :lcc-3166-1/Germany,
   :db/ident :fibo-fbc-fct-bci/Rodgau,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Rodgau"})

(def Rome
  {:cmns-col/isPartOf :lcc-3166-1/Italy,
   :db/ident :fibo-fbc-fct-bci/Rome,
   :dcterms/description "the international business center of Rome",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Rome"})

(def Rosario
  {:cmns-col/isPartOf :lcc-3166-1/Argentina,
   :db/ident :fibo-fbc-fct-bci/Rosario,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Rosario"})

(def Rostov
  {:cmns-col/isPartOf :lcc-3166-1/RussianFederation,
   :db/ident :fibo-fbc-fct-bci/Rostov,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Rostov"})

(def Rotterdam
  {:cmns-col/isPartOf :lcc-3166-1/Netherlands,
   :db/ident :fibo-fbc-fct-bci/Rotterdam,
   :dcterms/description "the international business center of Rotterdam",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Rotterdam"})

(def S-hertogenbosch
  {:cmns-col/isPartOf :lcc-3166-1/Netherlands,
   :db/ident :fibo-fbc-fct-bci/S-hertogenbosch,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "S-hertogenbosch"})

(def SAAB
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Abha,
   :db/ident :fibo-fbc-fct-bci/SAAB,
   :dcterms/description "the FpML business center code for Abha, Saudi Arabia",
   :fibo-fnd-rel-rel/hasTag "SAAB",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "SAAB"})

(def SAJE
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Jeddah,
   :db/ident :fibo-fbc-fct-bci/SAJE,
   :dcterms/description
   "the FpML business center code for Jeddah, Saudi Arabia",
   :fibo-fnd-rel-rel/hasTag "SAJE",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "SAJE"})

(def SARI
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Riyadh,
   :db/ident :fibo-fbc-fct-bci/SARI,
   :dcterms/description
   "the FpML business center code for Riyadh, Saudi Arabia",
   :fibo-fnd-rel-rel/hasTag "SARI",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "SARI"})

(def SEST
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Stockholm,
   :db/ident :fibo-fbc-fct-bci/SEST,
   :dcterms/description "the FpML business center code for Stockholm, Sweden",
   :fibo-fnd-rel-rel/hasTag "SEST",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "SEST"})

(def SGSI
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Singapore,
   :db/ident :fibo-fbc-fct-bci/SGSI,
   :dcterms/description
   "the FpML business center code for Singapore, Singapore",
   :fibo-fnd-rel-rel/hasTag "SGSI",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "SGSI"})

(def SILJ
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Ljubljana,
   :db/ident :fibo-fbc-fct-bci/SILJ,
   :dcterms/description "the FpML business center code for Ljubljana, Slovenia",
   :fibo-fnd-rel-rel/hasTag "SILJ",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "SILJ"})

(def SKBR
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Bratislava,
   :db/ident :fibo-fbc-fct-bci/SKBR,
   :dcterms/description
   "the FpML business center code for Bratislava, Slovakia",
   :fibo-fnd-rel-rel/hasTag "SKBR",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "SKBR"})

(def SLFR
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Freetown,
   :db/ident :fibo-fbc-fct-bci/SLFR,
   :dcterms/description
   "the FpML business center code for Freetown, Sierra Leone",
   :fibo-fnd-rel-rel/hasTag "SLFR",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "SLFR"})

(def SNDA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Dakar,
   :db/ident :fibo-fbc-fct-bci/SNDA,
   :dcterms/description "the FpML business center code for Dakar, Senegal",
   :fibo-fnd-rel-rel/hasTag "SNDA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "SNDA"})

(def SVSS
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/San_Salvador,
   :db/ident :fibo-fbc-fct-bci/SVSS,
   :dcterms/description
   "the FpML business center code for San Salvador, El Salvador",
   :fibo-fnd-rel-rel/hasTag "SVSS",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "SVSS"})

(def Sabadell
  {:cmns-col/isPartOf :lcc-3166-1/Spain,
   :db/ident :fibo-fbc-fct-bci/Sabadell,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Sabadell"})

(def Sacramento
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Sacramento,
   :dcterms/description "the international business center of Sacramento",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Sacramento"})

(def Saint_Peter_Port
  {:cmns-col/isPartOf :lcc-3166-1/Guernsey,
   :db/ident :fibo-fbc-fct-bci/Saint_Peter_Port,
   :dcterms/description "the international business center of Saint Peter Port",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Saint Peter Port"})

(def Saint_Petersburg
  {:cmns-col/isPartOf :lcc-3166-1/RussianFederation,
   :db/ident :fibo-fbc-fct-bci/Saint_Petersburg,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Saint Petersburg"})

(def Salzburg
  {:cmns-col/isPartOf :lcc-3166-1/Austria,
   :db/ident :fibo-fbc-fct-bci/Salzburg,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Salzburg"})

(def Samara
  {:cmns-col/isPartOf :lcc-3166-1/RussianFederation,
   :db/ident :fibo-fbc-fct-bci/Samara,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Samara"})

(def San_Carlos
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/San_Carlos,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "San Carlos"})

(def San_Francisco
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/San_Francisco,
   :dcterms/description "the international business center of San Francisco",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "San Francisco"})

(def San_Jose
  {:cmns-col/isPartOf :lcc-3166-1/CostaRica,
   :db/ident :fibo-fbc-fct-bci/San_Jose,
   :dcterms/description "the international business center of San Jose",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "San Jose"})

(def San_Juan
  {:cmns-col/isPartOf :lcc-3166-1/PuertoRico,
   :db/ident :fibo-fbc-fct-bci/San_Juan,
   :dcterms/description "the international business center of San Juan",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "San Juan"})

(def San_Pedro_Sula
  {:cmns-col/isPartOf :lcc-3166-1/Honduras,
   :db/ident :fibo-fbc-fct-bci/San_Pedro_Sula,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "San Pedro Sula"})

(def San_Salvador
  {:cmns-col/isPartOf :lcc-3166-1/ElSalvador,
   :db/ident :fibo-fbc-fct-bci/San_Salvador,
   :dcterms/description "the international business center of San Salvador",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "San Salvador"})

(def San_Sebastian
  {:cmns-col/isPartOf :lcc-3166-1/Spain,
   :db/ident :fibo-fbc-fct-bci/San_Sebastian,
   :dcterms/description "the international business center of San Sebastian",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "San Sebastian"})

(def Santa_Fe
  {:cmns-col/isPartOf :lcc-3166-1/Argentina,
   :db/ident :fibo-fbc-fct-bci/Santa_Fe,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Santa Fe"})

(def Santander
  {:cmns-col/isPartOf :lcc-3166-1/Spain,
   :db/ident :fibo-fbc-fct-bci/Santander,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Santander"})

(def Santiago
  {:cmns-col/isPartOf :lcc-3166-1/Chile,
   :db/ident :fibo-fbc-fct-bci/Santiago,
   :dcterms/description "the international business center of Santiago",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Santiago"})

(def Santo_Domingo
  {:cmns-col/isPartOf :lcc-3166-1/DominicanRepublic,
   :db/ident :fibo-fbc-fct-bci/Santo_Domingo,
   :dcterms/description "the international business center of Santo Domingo",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Santo Domingo"})

(def Sao_Paulo
  {:cmns-col/isPartOf :lcc-3166-1/Brazil,
   :db/ident :fibo-fbc-fct-bci/Sao_Paulo,
   :dcterms/description "the international business center of Sao Paulo",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Sao Paulo"})

(def Sapporo
  {:cmns-col/isPartOf :lcc-3166-1/Japan,
   :db/ident :fibo-fbc-fct-bci/Sapporo,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Sapporo"})

(def Sarajevo
  {:cmns-col/isPartOf :lcc-3166-1/BosniaAndHerzegovina,
   :db/ident :fibo-fbc-fct-bci/Sarajevo,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Sarajevo"})

(def Schwerin
  {:cmns-col/isPartOf :lcc-3166-1/Germany,
   :db/ident :fibo-fbc-fct-bci/Schwerin,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Schwerin"})

(def Sea_Girt
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Sea_Girt,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Sea Girt"})

(def Seattle
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Seattle,
   :dcterms/description "the international business center of Seattle",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Seattle"})

(def Seoul
  {:cmns-col/isPartOf :lcc-3166-1/KoreaRepublicOf,
   :db/ident :fibo-fbc-fct-bci/Seoul,
   :dcterms/description "the international business center of Seoul",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Seoul"})

(def Shanghai
  {:cmns-col/isPartOf :lcc-3166-1/China,
   :db/ident :fibo-fbc-fct-bci/Shanghai,
   :dcterms/description "the international business center of Shanghai",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Shanghai"})

(def Shenzhen
  {:cmns-col/isPartOf :lcc-3166-1/China,
   :db/ident :fibo-fbc-fct-bci/Shenzhen,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Shenzhen"})

(def Shimonoseki
  {:cmns-col/isPartOf :lcc-3166-1/Japan,
   :db/ident :fibo-fbc-fct-bci/Shimonoseki,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Shimonoseki"})

(def Sibiu
  {:cmns-col/isPartOf :lcc-3166-1/Romania,
   :db/ident :fibo-fbc-fct-bci/Sibiu,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Sibiu"})

(def Silkeborg
  {:cmns-col/isPartOf :lcc-3166-1/Denmark,
   :db/ident :fibo-fbc-fct-bci/Silkeborg,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Silkeborg"})

(def Singapore
  {:cmns-col/isPartOf :lcc-3166-1/Singapore,
   :db/ident :fibo-fbc-fct-bci/Singapore,
   :dcterms/description "the international business center of Singapore",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Singapore"})

(def Skopje
  {:cmns-col/isPartOf :lcc-3166-1/NorthMacedonia,
   :db/ident :fibo-fbc-fct-bci/Skopje,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Skopje"})

(def Sliema
  {:cmns-col/isPartOf :lcc-3166-1/Malta,
   :db/ident :fibo-fbc-fct-bci/Sliema,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Sliema"})

(def Sofia
  {:cmns-col/isPartOf :lcc-3166-1/Bulgaria,
   :db/ident :fibo-fbc-fct-bci/Sofia,
   :dcterms/description "the international business center of Sofia",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Sofia"})

(def Split
  {:cmns-col/isPartOf :lcc-3166-1/Croatia,
   :db/ident :fibo-fbc-fct-bci/Split,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Split"})

(def St__Helier
  {:cmns-col/isPartOf :lcc-3166-1/Jersey,
   :db/ident :fibo-fbc-fct-bci/St._Helier,
   :dcterms/description "the international business center of St. Helier",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "St. Helier"})

(def St_Albans
  {:cmns-col/isPartOf :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :db/ident :fibo-fbc-fct-bci/St_Albans,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "St. Albans"})

(def St_John
  {:cmns-col/isPartOf :lcc-3166-1/AntiguaAndBarbuda,
   :db/ident :fibo-fbc-fct-bci/St_John,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "St. John"})

(def Stamford
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Stamford,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Stamford"})

(def Stockholm
  {:cmns-col/isPartOf :lcc-3166-1/Sweden,
   :db/ident :fibo-fbc-fct-bci/Stockholm,
   :dcterms/description "the international business center of Stockholm",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Stockholm"})

(def Stuttgart
  {:cmns-col/isPartOf :lcc-3166-1/Germany,
   :db/ident :fibo-fbc-fct-bci/Stuttgart,
   :dcterms/description "the international business center of Stuttgart",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Stuttgart"})

(def Summit
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Summit,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Summit"})

(def Surabaya
  {:cmns-col/isPartOf :lcc-3166-1/Indonesia,
   :db/ident :fibo-fbc-fct-bci/Surabaya,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Surabaya"})

(def Suva
  {:cmns-col/isPartOf :lcc-3166-1/Fiji,
   :db/ident :fibo-fbc-fct-bci/Suva,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Suva"})

(def Sydney
  {:cmns-col/isPartOf :lcc-3166-1/Australia,
   :db/ident :fibo-fbc-fct-bci/Sydney,
   :dcterms/description "the international business center of Sydney",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Sydney"})

(def TARGETSettlementDay
  {:cmns-av/explanatoryNote
   "TARGET, which stands for the Trans-European Automated Real-time Gross settlement adjustment Express Transfer system, is the real-time gross settlement (RTGS) system for the euro. TARGET operating days are the settlement days for the financial markets in euro, as well as foreign exchange transactions involving the euro.",
   :db/ident :fibo-fbc-fct-bci/TARGETSettlementDay,
   :dcterms/description
   "the business day adjustment convention for the TARGET (euro 'Business Center')",
   :fibo-fnd-plc-loc/hasBusinessCenter
   #{:fibo-fbc-fct-bci/Madrid :fibo-fbc-fct-bci/Luxembourg
     :fibo-fbc-fct-bci/Athens :fibo-fbc-fct-bci/Frankfurt
     :fibo-fbc-fct-bci/Paris :fibo-fbc-fct-bci/Rome :fibo-fbc-fct-bci/Dublin
     :fibo-fbc-fct-bci/Helsinki :fibo-fbc-fct-bci/Vienna
     :fibo-fbc-fct-bci/Amsterdam :fibo-fbc-fct-bci/Brussels
     :fibo-fbc-fct-bci/Lisbon},
   :rdf/type #{:fibo-fnd-dt-bd/BusinessDayAdjustment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "TARGET Settlement Day"})

(def THBA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Bangkok,
   :db/ident :fibo-fbc-fct-bci/THBA,
   :dcterms/description "the FpML business center code for Bangkok, Thailand",
   :fibo-fnd-rel-rel/hasTag "THBA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "THBA"})

(def TNTU
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Tunis,
   :db/ident :fibo-fbc-fct-bci/TNTU,
   :dcterms/description "the FpML business center code for Tunis, Tunisia",
   :fibo-fnd-rel-rel/hasTag "TNTU",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "TNTU"})

(def TRAN
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Ankara,
   :db/ident :fibo-fbc-fct-bci/TRAN,
   :dcterms/description "the FpML business center code for Ankara, Turkey",
   :fibo-fnd-rel-rel/hasTag "TRAN",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "TRAN"})

(def TRIS
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Istanbul,
   :db/ident :fibo-fbc-fct-bci/TRIS,
   :dcterms/description "the FpML business center code for Istanbul, Turkey",
   :fibo-fnd-rel-rel/hasTag "TRIS",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "TRIS"})

(def TTPS
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Port_of_Spain,
   :db/ident :fibo-fbc-fct-bci/TTPS,
   :dcterms/description
   "the FpML business center code for Port of Spain, Trinidad and Tobago",
   :fibo-fnd-rel-rel/hasTag "TTPS",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "TTPS"})

(def TWTA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Taipei,
   :db/ident :fibo-fbc-fct-bci/TWTA,
   :dcterms/description "the FpML business center code for Taipei, Taiwan",
   :fibo-fnd-rel-rel/hasTag "TWTA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "TWTA"})

(def TZDA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Dar_es_Salaam,
   :db/ident :fibo-fbc-fct-bci/TZDA,
   :dcterms/description
   "the FpML business center code for Dar es Salaam, Tanzania",
   :fibo-fnd-rel-rel/hasTag "TZDA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "TZDA"})

(def TZDO
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Dodoma,
   :db/ident :fibo-fbc-fct-bci/TZDO,
   :dcterms/description "the FpML business center code for Dodoma, Tanzania",
   :fibo-fnd-rel-rel/hasTag "TZDO",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "TZDO"})

(def Taipei
  {:cmns-col/isPartOf :lcc-3166-1/Taiwan,
   :db/ident :fibo-fbc-fct-bci/Taipei,
   :dcterms/description "the international business center of Taipei",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Taipei"})

(def Taiwan
  {:cmns-col/isPartOf :lcc-3166-1/Taiwan,
   :db/ident :fibo-fbc-fct-bci/Taiwan,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Taiwan"})

(def Tallinn
  {:cmns-col/isPartOf :lcc-3166-1/Estonia,
   :db/ident :fibo-fbc-fct-bci/Tallinn,
   :dcterms/description "the international business center of Tallinn",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Tallinn"})

(def Tashkent
  {:cmns-col/isPartOf :lcc-3166-1/Uzbekistan,
   :db/ident :fibo-fbc-fct-bci/Tashkent,
   :dcterms/description "the international business center of Tashkent",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Tashkent"})

(def Tbilisi
  {:cmns-col/isPartOf :lcc-3166-1/Georgia,
   :db/ident :fibo-fbc-fct-bci/Tbilisi,
   :dcterms/description "the international business center of Tbilisi",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Tbilisi"})

(def Tegucigalpa
  {:cmns-col/isPartOf :lcc-3166-1/Honduras,
   :db/ident :fibo-fbc-fct-bci/Tegucigalpa,
   :dcterms/description "the international business center of Tegucigalpa",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Tegucigalpa"})

(def Teheran
  {:cmns-col/isPartOf :lcc-3166-1/Iran,
   :db/ident :fibo-fbc-fct-bci/Teheran,
   :dcterms/description "the international business center of Teheran",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Teheran"})

(def Tel_Aviv
  {:cmns-col/isPartOf :lcc-3166-1/Israel,
   :db/ident :fibo-fbc-fct-bci/Tel_Aviv,
   :dcterms/description "the international business center of Tel Aviv",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Tel Aviv"})

(def The_Hague
  {:cmns-col/isPartOf :lcc-3166-1/Netherlands,
   :db/ident :fibo-fbc-fct-bci/The_Hague,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "The Hague"})

(def The_Woodlands
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/The_Woodlands,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "The Woodlands"})

(def Tirana
  {:cmns-col/isPartOf :lcc-3166-1/Albania,
   :db/ident :fibo-fbc-fct-bci/Tirana,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Tirana"})

(def Tokyo
  {:cmns-col/isPartOf :lcc-3166-1/Japan,
   :db/ident :fibo-fbc-fct-bci/Tokyo,
   :dcterms/description "the international business center of Tokyo",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Tokyo"})

(def Toronto
  {:cmns-col/isPartOf :lcc-3166-1/Canada,
   :db/ident :fibo-fbc-fct-bci/Toronto,
   :dcterms/description "the international business center of Toronto",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Toronto"})

(def Torshavn
  {:cmns-col/isPartOf :lcc-3166-1/FaroeIslands,
   :db/ident :fibo-fbc-fct-bci/Torshavn,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Torshavn"})

(def Triesen
  {:cmns-col/isPartOf :lcc-3166-1/Liechtenstein,
   :db/ident :fibo-fbc-fct-bci/Triesen,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Triesen"})

(def Tripoli
  {:cmns-col/isPartOf :lcc-3166-1/Libya,
   :db/ident :fibo-fbc-fct-bci/Tripoli,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Tripoli"})

(def Tromso
  {:cmns-col/isPartOf :lcc-3166-1/Norway,
   :db/ident :fibo-fbc-fct-bci/Tromso,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Tromso"})

(def Trondheim
  {:cmns-col/isPartOf :lcc-3166-1/Norway,
   :db/ident :fibo-fbc-fct-bci/Trondheim,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Trondheim"})

(def Tucuman
  {:cmns-col/isPartOf :lcc-3166-1/Argentina,
   :db/ident :fibo-fbc-fct-bci/Tucuman,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Tucuman"})

(def Tunis
  {:cmns-col/isPartOf :lcc-3166-1/Tunisia,
   :db/ident :fibo-fbc-fct-bci/Tunis,
   :dcterms/description "the international business center of Tunis",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Tunis"})

(def Turin
  {:cmns-col/isPartOf :lcc-3166-1/Italy,
   :db/ident :fibo-fbc-fct-bci/Turin,
   :dcterms/description "the international business center of Turin",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Turin"})

(def UAKI
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Kiev,
   :db/ident :fibo-fbc-fct-bci/UAKI,
   :dcterms/description "the FpML business center code for Kiev, Ukraine",
   :fibo-fnd-rel-rel/hasTag "UAKI",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "UAKI"})

(def UGKA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Kampala,
   :db/ident :fibo-fbc-fct-bci/UGKA,
   :dcterms/description "the FpML business center code for Kampala, Uganda",
   :fibo-fnd-rel-rel/hasTag "UGKA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "UGKA"})

(def USBO
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Boston,
   :db/ident :fibo-fbc-fct-bci/USBO,
   :dcterms/description
   "the FpML business center code for Boston, Massachusetts, United States",
   :fibo-fnd-rel-rel/hasTag "USBO",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "USBO"})

(def USCH
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Chicago,
   :db/ident :fibo-fbc-fct-bci/USCH,
   :dcterms/description
   "the FpML business center code for Chicago, United States",
   :fibo-fnd-rel-rel/hasTag "USCH",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "USCH"})

(def USCR
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Charlotte,
   :db/ident :fibo-fbc-fct-bci/USCR,
   :dcterms/description
   "the FpML business center code for Charlotte, North Carolina, United States",
   :fibo-fnd-rel-rel/hasTag "USCR",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "USCR"})

(def USDC
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Washington,
   :db/ident :fibo-fbc-fct-bci/USDC,
   :dcterms/description
   "the FpML business center code for Washington, District of Columbia, United States",
   :fibo-fnd-rel-rel/hasTag "USDC",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "USDC"})

(def USDN
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Denver,
   :db/ident :fibo-fbc-fct-bci/USDN,
   :dcterms/description
   "the FpML business center code for Denver, United States",
   :fibo-fnd-rel-rel/hasTag "USDN",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "USDN"})

(def USDT
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Detroit,
   :db/ident :fibo-fbc-fct-bci/USDT,
   :dcterms/description
   "the FpML business center code for Detroit, Michigan, United States",
   :fibo-fnd-rel-rel/hasTag "USDT",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "USDT"})

(def USGS
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/USGovernmentSecuritiesBusinessDay,
   :db/ident :fibo-fbc-fct-bci/USGS,
   :dcterms/description
   "the FpML business center code for U.S. Government Securities Business Day (as defined in 2006 ISDA Definitions Section 1.11 and 2000 ISDA Definitions Section 1.11)",
   :fibo-fnd-rel-rel/hasTag "USGS",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessDayAdjustmentCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "USGS"})

(def USGovernmentSecuritiesBusinessDay
  {:db/ident :fibo-fbc-fct-bci/USGovernmentSecuritiesBusinessDay,
   :dcterms/description
   "the business day adjustment convention for U.S. Government Securities",
   :fibo-fnd-plc-loc/hasBusinessCenter :fibo-fbc-fct-bci/Washington,
   :rdf/type #{:fibo-fnd-dt-bd/BusinessDayAdjustment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "U.S. Government Securities Business Day"})

(def USHL
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Honolulu,
   :db/ident :fibo-fbc-fct-bci/USHL,
   :dcterms/description
   "the FpML business center code for Honolulu, Hawaii, United States",
   :fibo-fnd-rel-rel/hasTag "USHL",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "USHL"})

(def USHO
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Houston,
   :db/ident :fibo-fbc-fct-bci/USHO,
   :dcterms/description
   "the FpML business center code for Houston, United States",
   :fibo-fnd-rel-rel/hasTag "USHO",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "USHO"})

(def USLA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Los_Angeles,
   :db/ident :fibo-fbc-fct-bci/USLA,
   :dcterms/description
   "the FpML business center code for Los Angeles, United States",
   :fibo-fnd-rel-rel/hasTag "USLA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "USLA"})

(def USMB
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Mobile,
   :db/ident :fibo-fbc-fct-bci/USMB,
   :dcterms/description
   "the FpML business center code for Mobile, Alabama, United States",
   :fibo-fnd-rel-rel/hasTag "USMB",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "USMB"})

(def USMN
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Minneapolis,
   :db/ident :fibo-fbc-fct-bci/USMN,
   :dcterms/description
   "the FpML business center code for Minneapolis, United States",
   :fibo-fnd-rel-rel/hasTag "USMN",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "USMN"})

(def USNY
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/New_York,
   :db/ident :fibo-fbc-fct-bci/USNY,
   :dcterms/description
   "the FpML business center code for New York, United States",
   :fibo-fnd-rel-rel/hasTag "USNY",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "USNY"})

(def USPO
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Portland,
   :db/ident :fibo-fbc-fct-bci/USPO,
   :dcterms/description
   "the FpML business center code for Portland, Oregon, United States",
   :fibo-fnd-rel-rel/hasTag "USPO",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "USPO"})

(def USSA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Sacramento,
   :db/ident :fibo-fbc-fct-bci/USSA,
   :dcterms/description
   "the FpML business center code for Sacramento, California, United States",
   :fibo-fnd-rel-rel/hasTag "USSA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "USSA"})

(def USSE
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Seattle,
   :db/ident :fibo-fbc-fct-bci/USSE,
   :dcterms/description
   "the FpML business center code for Seattle, United States",
   :fibo-fnd-rel-rel/hasTag "USSE",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "USSE"})

(def USSF
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/San_Francisco,
   :db/ident :fibo-fbc-fct-bci/USSF,
   :dcterms/description
   "the FpML business center code for San Francisco, United States",
   :fibo-fnd-rel-rel/hasTag "USSF",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "USSF"})

(def USWT
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Wichita,
   :db/ident :fibo-fbc-fct-bci/USWT,
   :dcterms/description
   "the FpML business center code for Wichita, United States",
   :fibo-fnd-rel-rel/hasTag "USWT",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "USWT"})

(def UYMO
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Montevideo,
   :db/ident :fibo-fbc-fct-bci/UYMO,
   :dcterms/description "the FpML business center code for Montevideo, Uruguay",
   :fibo-fnd-rel-rel/hasTag "UYMO",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "UYMO"})

(def UZTA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Tashkent,
   :db/ident :fibo-fbc-fct-bci/UZTA,
   :dcterms/description
   "the FpML business center code for Tashkent, Uzbekistan",
   :fibo-fnd-rel-rel/hasTag "UZTA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "UZTA"})

(def Ulan_Bator
  {:cmns-col/isPartOf :lcc-3166-1/Mongolia,
   :db/ident :fibo-fbc-fct-bci/Ulan_Bator,
   :dcterms/description "the international business center of Ulan Bator",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Ulan Bator"})

(def Unterschleisshem
  {:cmns-col/isPartOf :lcc-3166-1/Germany,
   :db/ident :fibo-fbc-fct-bci/Unterschleisshem,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Unterschleisshem"})

(def Utrecht
  {:cmns-col/isPartOf :lcc-3166-1/Netherlands,
   :db/ident :fibo-fbc-fct-bci/Utrecht,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Utrecht"})

(def VECA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Caracas,
   :db/ident :fibo-fbc-fct-bci/VECA,
   :dcterms/description "the FpML business center code for Caracas, Venezuela",
   :fibo-fnd-rel-rel/hasTag "VECA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "VECA"})

(def VGRT
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Road_Town,
   :db/ident :fibo-fbc-fct-bci/VGRT,
   :dcterms/description
   "the FpML business center code for Road Town, Virgin Islands (British)",
   :fibo-fnd-rel-rel/hasTag "VGRT",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "VGRT"})

(def VNHA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Hanoi,
   :db/ident :fibo-fbc-fct-bci/VNHA,
   :dcterms/description "the FpML business center code for Hanoi, Vietnam",
   :fibo-fnd-rel-rel/hasTag "VNHA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "VNHA"})

(def VNHC
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Ho_Chi_Minh__formerly_Saigon_,
   :db/ident :fibo-fbc-fct-bci/VNHC,
   :dcterms/description
   "the FpML business center code for Ho Chi Minh (formerly Saigon), Vietnam",
   :fibo-fnd-rel-rel/hasTag "VNHC",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "VNHC"})

(def Vaduz
  {:cmns-col/isPartOf :lcc-3166-1/Liechtenstein,
   :db/ident :fibo-fbc-fct-bci/Vaduz,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Vaduz"})

(def Valencia
  {:cmns-col/isPartOf :lcc-3166-1/Spain,
   :db/ident :fibo-fbc-fct-bci/Valencia,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Valencia"})

(def Valletta
  {:cmns-col/isPartOf :lcc-3166-1/Malta,
   :db/ident :fibo-fbc-fct-bci/Valletta,
   :dcterms/description "the international business center of Valletta",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Valletta"})

(def Valparaiso
  {:cmns-col/isPartOf :lcc-3166-1/Chile,
   :db/ident :fibo-fbc-fct-bci/Valparaiso,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Valparaiso"})

(def Vancouver
  {:cmns-col/isPartOf :lcc-3166-1/Canada,
   :db/ident :fibo-fbc-fct-bci/Vancouver,
   :dcterms/description "the international business center of Vancouver",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Vancouver"})

(def Varazdin
  {:cmns-col/isPartOf :lcc-3166-1/Croatia,
   :db/ident :fibo-fbc-fct-bci/Varazdin,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Varazdin"})

(def Victoria
  {:cmns-col/isPartOf :lcc-3166-1/Seychelles,
   :db/ident :fibo-fbc-fct-bci/Victoria,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Victoria"})

(def Victoria_Falls
  {:cmns-col/isPartOf :lcc-3166-1/Zimbabwe,
   :db/ident :fibo-fbc-fct-bci/Victoria_Falls,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Victoria Falls"})

(def Vienna
  {:cmns-col/isPartOf :lcc-3166-1/Austria,
   :db/ident :fibo-fbc-fct-bci/Vienna,
   :dcterms/description "the international business center of Vienna",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Vienna"})

(def Vientiane
  {:cmns-col/isPartOf :lcc-3166-1/LaoPeoplesDemocraticRepublic,
   :db/ident :fibo-fbc-fct-bci/Vientiane,
   :dcterms/description "the international business center of Vientiane",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Vientiane"})

(def Vilnius
  {:cmns-col/isPartOf :lcc-3166-1/Lithuania,
   :db/ident :fibo-fbc-fct-bci/Vilnius,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Vilnius"})

(def Vladivostok
  {:cmns-col/isPartOf :lcc-3166-1/RussianFederation,
   :db/ident :fibo-fbc-fct-bci/Vladivostok,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Vladivostok"})

(def Warsaw
  {:cmns-col/isPartOf :lcc-3166-1/Poland,
   :db/ident :fibo-fbc-fct-bci/Warsaw,
   :dcterms/description "the international business center of Warsaw",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Warsaw"})

(def Washington
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Washington,
   :dcterms/description "the international business center of Washington",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Washington"})

(def Washington_New_York
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Washington_New_York,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Washington, New York"})

(def Wellington
  {:cmns-col/isPartOf :lcc-3166-1/NewZealand,
   :db/ident :fibo-fbc-fct-bci/Wellington,
   :dcterms/description "the international business center of Wellington",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Wellington"})

(def Wichita
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Wichita,
   :dcterms/description "the international business center of Wichita",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Wichita"})

(def Willemstad
  {:cmns-col/isPartOf :lcc-3166-1/Curacao,
   :db/ident :fibo-fbc-fct-bci/Willemstad,
   :dcterms/description "the international business center of Willemstad",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Willemstad"})

(def Wilmington
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Wilmington,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Wilmington"})

(def Windhoek
  {:cmns-col/isPartOf :lcc-3166-1/Namibia,
   :db/ident :fibo-fbc-fct-bci/Windhoek,
   :dcterms/description "the international business center of Windhoek",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Windhoek"})

(def Winnipeg
  {:cmns-col/isPartOf :lcc-3166-1/Canada,
   :db/ident :fibo-fbc-fct-bci/Winnipeg,
   :dcterms/description "the international business center of Winnipeg",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Winnipeg"})

(def Winter_Park
  {:cmns-col/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fbc-fct-bci/Winter_Park,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Winter Park"})

(def Wroclaw
  {:cmns-col/isPartOf :lcc-3166-1/Poland,
   :db/ident :fibo-fbc-fct-bci/Wroclaw,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Wroclaw"})

(def Wuxi
  {:cmns-col/isPartOf :lcc-3166-1/China,
   :db/ident :fibo-fbc-fct-bci/Wuxi,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Wuxi"})

(def YEAD
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Aden,
   :db/ident :fibo-fbc-fct-bci/YEAD,
   :dcterms/description "the FpML business center code for Aden, Yemen",
   :fibo-fnd-rel-rel/hasTag "YEAD",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "YEAD"})

(def Yaounde
  {:cmns-col/isPartOf :lcc-3166-1/Cameroon,
   :db/ident :fibo-fbc-fct-bci/Yaounde,
   :dcterms/description "the international business center of Yaounde",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Yaounde"})

(def Yerevan
  {:cmns-col/isPartOf :lcc-3166-1/Armenia,
   :db/ident :fibo-fbc-fct-bci/Yerevan,
   :dcterms/description "the international business center of Yerevan",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Yerevan"})

(def ZAJO
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Johannesburg,
   :db/ident :fibo-fbc-fct-bci/ZAJO,
   :dcterms/description
   "the FpML business center code for Johannesburg, South Africa",
   :fibo-fnd-rel-rel/hasTag "ZAJO",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "ZAJO"})

(def ZMLU
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Lusaka,
   :db/ident :fibo-fbc-fct-bci/ZMLU,
   :dcterms/description "the FpML business center code for Lusaka, Zambia",
   :fibo-fnd-rel-rel/hasTag "ZMLU",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "ZMLU"})

(def ZWHA
  {:cmns-col/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :cmns-id/identifies :fibo-fbc-fct-bci/Harare,
   :db/ident :fibo-fbc-fct-bci/ZWHA,
   :dcterms/description "the FpML business center code for Harare, Zimbabwe",
   :fibo-fnd-rel-rel/hasTag "ZWHA",
   :rdf/type #{:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "ZWHA"})

(def Zagreb
  {:cmns-col/isPartOf :lcc-3166-1/Croatia,
   :db/ident :fibo-fbc-fct-bci/Zagreb,
   :dcterms/description "the international business center of Zagreb",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Zagreb"})

(def Zaragoza
  {:cmns-col/isPartOf :lcc-3166-1/Spain,
   :db/ident :fibo-fbc-fct-bci/Zaragoza,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Zaragoza"})

(def Zhengzhou
  {:cmns-col/isPartOf :lcc-3166-1/China,
   :db/ident :fibo-fbc-fct-bci/Zhengzhou,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Zhengzhou"})

(def Zilina
  {:cmns-col/isPartOf :lcc-3166-1/Slovakia,
   :db/ident :fibo-fbc-fct-bci/Zilina,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-loc/Municipality},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Zilina"})

(def Zurich
  {:cmns-col/isPartOf :lcc-3166-1/Switzerland,
   :db/ident :fibo-fbc-fct-bci/Zurich,
   :dcterms/description "the international business center of Zurich",
   :rdf/type #{:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdfs/label "Zurich"})

(def urn:uuid:ab012146-ecf2-53d4-9612-e5fcbf122c4c
  {:cmns-av/copyright
   #{"Copyright (c) 2018-2024 EDM Council, Inc."
     "Copyright (c) 2018-2024 Thematix Partners LLC"
     "Copyright (c) 2020-2024 agnos.ai, UK Ltd."
     "Copyright (c) 2018-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology includes individuals representing the set of international business centers corresponding to those identified in FpML as well as additional municipalities called out in the ISO 10383 Codes for exchanges and market identification (MIC) standard.\n\t\tThis set of business centers is current with respect to the FpML published XML data as of Q2 2023 and additional municipalities included in the MIC codes as of Q1 2024. Note that we have deviated from the standard FIBO naming convention of strict use of camel case to add underscores in certain city names for readability purposes.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/BusinessCenters/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/DatesAndTimes/BusinessDates/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/BusinessCentersIndividuals/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Business Centers Individuals",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to add municipalities required for the ISO revision to the MIC codes as of June 2022."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to merge countries with locations in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to address text formatting issues uncovered by hygiene testing."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to support revisions of the MIC codes as of December 2018."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals.rdf version of this ontology was modified to update the business centers per the latest revision of the FpML business centers (November 2022) and latest municipalities per the June 2023 ISO 10383 MIC code update from ISO."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to replace Swaziland with Eswatini, which was revised by the LCC 1.1 RTF to reflect the change to the country name per the U.N."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to add municipalities required for the ISO revision to the MIC codes as of March 2021."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to equate Almaty and Alma-ata, which are the same city (Alma-ata is the old name, no longer in use)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to add municipalities required for the ISO revision to the MIC codes as of September 2021."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to add municipalities required for the ISO revision to the MIC codes as of September 2019."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to add municipalities required for the ISO revision to the MIC codes as of November 2020, and add Municipalities for 4 important Swiss financial cities."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to add municipalities required for the ISO revision to the MIC codes as of June 2020, replace the relations hasTag property with the equivalent lcc-lr version, and replace skos:definition on reference individuals with dct:description."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals.rdf version of this ontology was modified to update the business centers per the latest revision of the municipalities per the March 2024 ISO 10383 MIC code update from ISO."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to add municipalities required for the ISO revision to the MIC codes as of March 2022."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to add a number of new municipalities that were included in the December 2022 MIC codes."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/"})